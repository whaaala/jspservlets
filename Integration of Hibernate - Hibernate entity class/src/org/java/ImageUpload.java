package org.java;


import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/ImageUpload")
public class ImageUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
		
		try {
			List<FileItem> images = upload.parseRequest(request);
			
			for(FileItem image: images) {
				String name = image.getName();
				try {
					name = name.substring(name.lastIndexOf("\\")+1);
				} catch (Exception e) {
					
				}
				System.out.println("C:\\Users\\beyite\\Desktop\\images\\" + name);
				image.write(new File("C:\\Users\\beyite\\Desktop\\images\\" + name));
				System.out.println(name);
							}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
