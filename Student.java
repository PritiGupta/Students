//import java.time.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Priti
 *
 */
public class Student {

	/**
	 * @param args
	 */
	
	    public enum Sex {
	        MALE, FEMALE
	    }
	   
	    String name; 
	  //  LocalDate birthday;
	    Sex gender;
	    String emailAddress;
	    String homeTown;
	    String favFood;
	   
	    Student(String nameArg, 
	        Sex genderArg, String emailArg,String homeArg,String foodArg) {
	        name = nameArg;
	        gender = genderArg;
	        emailAddress = emailArg;
	        homeTown = homeArg;
	        favFood = foodArg;
	    }  
	 
	
	 
	    
	    public Sex getGender() {
	        return gender;
	    }
	     
	    public String getName() {
	        return name;
	    }
	     
	    public String getEmailAddress() {
	        return emailAddress;
	    }
	     
	    public String getFavFood(){
	    	
	    	return favFood;
	    }
	    public String getHomeTown(){
	    	
	    	return homeTown;
	    }
	    public void printStudent() {
		      System.out.println(name+"\n"+ gender+"\n" +emailAddress +"\n"+ favFood +"\n"+ homeTown );
		    }	     
	 
	      
	}

 