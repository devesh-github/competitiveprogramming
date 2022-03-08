package com.StackOverFlow;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.activation.DataHandler;
import javax.mail.util.ByteArrayDataSource;

import org.apache.commons.codec.binary.Base64;

import com.lowagie.text.pdf.PdfReader;

public class CreateBlobData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	/*	String hello = "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";
        byte[] decoded = Base64.decodeBase64(hello.getBytes());
		
		ByteArrayDataSource rawData= new ByteArrayDataSource(Base64.decodeBase64(decoded)); 
		DataHandler data= new DataHandler(rawData);
		  
		ByteArrayOutputStream output2 = new ByteArrayOutputStream();
	    data.writeTo(output2);
	    output2.close();
	    byte [] br = Base64.encodeBase64(output2.toByteArray());*/
	    
	    //INSERT INTO IDENTITY_BLOBDOCS_RELATION (IV_BLOB_DOCUMENT_ID,USER_ID,IV_BLOB_DOCUMENT,IV_FILE_TYPE) VALUES (IDENTITY_BLOBDOCS_RELATION_SEQ.nextVal,111,?,text);
	    
	    //BufferedReader br = new BufferedInputStream(new InputStreamReader(arg0))
	    
	    /*PdfReader r = null;
		try {
			r = new PdfReader("C:\\Users\\devesh.kumar.chaubey\\Desktop\\CSRBOOKING_PDFs_8049.pdf");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	    
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\devesh.kumar.chaubey\\Desktop\\CSRBOOKING_PDFs_8049.pdf"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(br.toString());

	}
}