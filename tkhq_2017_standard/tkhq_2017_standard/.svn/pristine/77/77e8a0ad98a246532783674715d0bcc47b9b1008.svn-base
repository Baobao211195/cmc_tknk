package com.tkhq.cmc.common;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.multipart.MultipartFile;

public class UpLoadFile {
	
	 private static final Logger log = Logger.getLogger(UpLoadFile.class);
	
	 private static final String UPLOADED_DANHMUC_QUYTAC_FLODER = "C://FileDanhMuc//";
	 
	 public static final int READ_FILE_ERROR = 2;
	
	 public static void uploadFile(final MultipartFile uploadFile, String filePath) {

			BufferedOutputStream outStream = null;
			try {
				File file = new File(filePath);
				File parentDir = file.getParentFile();


				if (!parentDir.exists()) {
					parentDir.mkdirs();
				}
				outStream = new BufferedOutputStream(new FileOutputStream(file));
				outStream.write(getFileSize(uploadFile));
			} catch (FileNotFoundException e) {
				log.info("File not found exception:" + e.getMessage());
			} catch (IOException e) {
				log.info("IOexception:" + e.getMessage());
			} finally {
				try {
					if (outStream != null) {
						outStream.close();
					}
				} catch (IOException e) {
					log.info("IOexception when close stream:" + e.getMessage());
				}
			}
		}
	 
	 
	public static String setFilePath( MultipartFile file){
		return Paths.get(UPLOADED_DANHMUC_QUYTAC_FLODER, getFileName(file)).toString();
	}
	
	public static String getFileName (MultipartFile file){
		return new StringBuilder().append(setingDescription(getBaseFileName(file)))
				  .append(Constants.UNDERSCORES)
				  .append(getUserLogin())
				  .append(getSufferFileName())
				  .append(getExtension(file))
				  .toString();
	}
	
	public static String getBaseFileName(MultipartFile file) {
		return FilenameUtils.getBaseName(file.getOriginalFilename());
	}
	
	public static String getExtension(MultipartFile file){
		return Constants.DOT + FilenameUtils.getExtension(file.getOriginalFilename());
	}
	
	public static String getSufferFileName (){
		DateFormat dateFormat = new SimpleDateFormat(Constants.DATE_FORMAT_5);
		return Constants.UNDERSCORES + dateFormat.format(new Date());
	}
	
	/**
	* @param file
	* @return
	*/
	public static byte[] getFileSize (MultipartFile file){
		try {
			return file.getBytes();
		} catch (IOException e) {
			log.info(e.getMessage());
			return new byte[0];
			
		}
	}

	/**
	* @return name of user login.
	*/
	public static String getUserLogin(){
		return SecurityContextHolder.getContext().getAuthentication().getName();
	}
	
	public static String setingDescription(String mota){
		if (mota != null){
			String motaTmp = mota.trim();  
			byte[] bytes = motaTmp.getBytes(StandardCharsets.ISO_8859_1);
			return new String(bytes, StandardCharsets.UTF_8);
		} else {
			return Constants.EMPTY;
		}
	}

}
