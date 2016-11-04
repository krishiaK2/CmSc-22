package studentdb2;

import java.util.*;
import java.io.*;

public class FileReading {

    public static void getStudents(List<Student> list, String path) {
    	
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
        	
        	// DESERIALIZATION...
            File fin = new File(path);
            
            if(fin.length() == 0) {
                // file is emtpy!!
                System.err.println("FILE IS EMPTY");
            } else {
	            fis = new FileInputStream(fin);
	            ois = new ObjectInputStream(fis);
	            
	            list = (List<Student>) ois.readObject();
            
            }
            if (ois != null) {
            	ois.close();
            }
        } 
        catch (IOException e) {
            // standard file handling exception
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
        	// this might be thrown by ois.readObject()
			e.printStackTrace();
		} finally {

            // make sure to close the files!
            try {
                //fos.close();
            	if (fis != null) {
            		fis.close();
            	}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}