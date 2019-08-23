/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup;

/**
 *
 * @author Thimus
 */


import java.util.Vector;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import javax.swing.tree.DefaultMutableTreeNode;

//class using for sftp function
public class SFTPBean {
	//variable let using for sftp channel
	private JSch mJschSession = null;
	private Session mSSHSession = null;
	
	//sftp channel
	private ChannelSftp mChannelSftp = null;

	//connect fucntion let connect to sftp server
	//in here or any protocol please remember some the other variable very important
	//timeout but in this demo i only demo with normal function.
	//still having many function u can add for sftp: create, delete, set right.. for sftp server
	public boolean connect(String strHostAddress, int iPort, String strUserName, String strPassword) {
		boolean blResult = false;

		try {
			//creating a new jsch session
			this.mJschSession = new JSch();
			
			//set sftp server no check key when login
			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			this.mJschSession.setConfig(config);

			//creating session with user, host port
			this.mSSHSession = mJschSession.getSession(strUserName, strHostAddress, iPort);
                        
			
			//set password
			this.mSSHSession.setPassword(strPassword);
			
			//connect to host
			this.mSSHSession.connect();
			
			//open sftp channel
			this.mChannelSftp = (ChannelSftp) this.mSSHSession.openChannel("sftp");
			
			//connect to sftp session
			this.mChannelSftp.connect();
			if (this.mChannelSftp != null) {
				blResult = true;
			}
		} catch (Exception exp) {
			exp.printStackTrace();
		}
		return blResult;
	}
        
	//list file on sftp server
	public Vector<LsEntry> listFile(String strPath) {
		Vector<LsEntry> vtFile = null;

		try {
			vtFile = this.mChannelSftp.ls(strPath);
		} catch (SftpException exp) {
		}
		return vtFile;
	}
        public Long sizeConsumed(String path)
        {
            Vector<LsEntry> list = listFile(path);
            long size = 0;
            for (LsEntry oListItem : list)
            {
                size+=oListItem.getAttrs().getSize();
            }
            Long sz = (Long) size/1024;
            return sz;
        }
        public  void cargarRTree(String remotePath, DefaultMutableTreeNode parent) throws SftpException, JSchException { 
                Vector<ChannelSftp.LsEntry> list = this.mChannelSftp.ls(remotePath);
                  //System.out.println(list);
                //Vector<ChannelSftp.LsEntry> list = sftpChannel  
                
                for (ChannelSftp.LsEntry oListItem : list) 
                { // Iterate objects in the list to get file/folder names.       
                    DefaultMutableTreeNode node = new DefaultMutableTreeNode(oListItem.getFilename());
                    if (!oListItem.getAttrs().isDir()) { // If it is a file (not a directory).
                        parent.add(node); // add as a child node
                    } else{
                    if (!".".equals(oListItem.getFilename()) && !"..".equals(oListItem.getFilename())) {
                        parent.add(node); // add as a child node
                        cargarRTree(remotePath + "/" + oListItem.getFilename(), node); // call again for the subdirectory
        }
    }
}
}
        public boolean deleteFile(String path) throws SftpException
        {
            //this.mChannelSftp.cd(path);
            this.mChannelSftp.rm(path);
            return true;
        }
        public boolean folder(String path) throws SftpException
        {
            this.mChannelSftp.mkdir(path);
           
            
            return true;
        }
        
	//download file
	public boolean downloadFile(String strSftpFile, String strLocalFile) {
		boolean blResult = false;

		try {
			this.mChannelSftp.get(strSftpFile, strLocalFile);
			blResult = true;
		} catch (Exception exp) {
			exp.printStackTrace();
		}
		return blResult;
	}

	//upload file
	public boolean uploadFile(String strLocalFile, String strSftpFile) {
		boolean blResult = false;

		try {
			this.mChannelSftp.put(strLocalFile, strSftpFile);
			blResult = true;
		} catch (Exception exp) {
			exp.printStackTrace();
		}
		return blResult;
	}
        
        

	//close session
	public void close() {
		try {
			this.mChannelSftp.disconnect();
		} catch (Exception exp) {

		}

		try {
			this.mSSHSession.disconnect();
		} catch (Exception exp) {

		}

		this.mChannelSftp = null;
		this.mSSHSession = null;
		this.mJschSession = null;
	}

   
}

