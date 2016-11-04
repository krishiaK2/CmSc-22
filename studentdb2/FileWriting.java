package studentdb2;

import java.util.*;
import java.io.*;

public class FileWriting {
    private String path;
    

    public FileWriting(String path) {
        this.path = path;
    }

    public Student register( String studentNum, String firstname, char middleInitial, String lastName, String course, int yearLevel, String crushName, Course faveSubject){
                         
       return new Student(studentNum, firstname, middleInitial, lastName, course, yearLevel, crushName, faveSubject);

            
    }

    public void delete(String studentNum, List<Student> l){
    	int index = -1;
    	for (Student s: l){
    		if (s.getStudentNumber().equals(studentNum)){
    			index = l.indexOf(s);
    		}
    	}
    	if (index >= 0){
    		l.remove(index);
    	} else {
    		System.out.println("Student Does not Exist!");
    	}
    }
    public void save(List<Student> students, Student student) {
    	
    	FileOutputStream fos = null;
        ObjectOutputStream oos = null;
    	
        try {
           
            // SERIALIZATION...
            File fout = new File(path);
            fos = new FileOutputStream(fout);
            oos = new ObjectOutputStream(fos);
            students.add(student);
            oos.writeObject(students);

            oos.close();

            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
