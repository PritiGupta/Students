import java.util.*;

/**
 * 
 */

/**
 * @author Priti
 *
 */
public class Lab7 {

	/**
	 * @param args
	 */


	public static Scanner scan = new Scanner(System.in);
	private static String inputArg;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = null;
		Map<String, Student> studentinfo = null;
		//Student studentData = null ;
		List<Student> roster = new ArrayList<>();
		roster.add(
				new Student(
						"Fred",

						Student.Sex.MALE,
						"fred@example.com","Rochester","Pasta"));
		roster.add(
				new Student(
						"Jane",

						Student.Sex.FEMALE, "jane@example.com","Troy","Nuggets"));
		roster.add(
				new Student(
						"George",

						Student.Sex.MALE, "george@example.com","Bloomfield","Salad"));
		roster.add(
				new Student(
						"Bob",

						Student.Sex.MALE, "bob@example.com","Birmingham","Chicken Wings"));



		System.out.println("Welcome to our Java Class. "
				+ "Which student would you like to learn more about?(Enter a name):");
		try{
			boolean scanned = scan.hasNext();
			if(scanned == true){
				

				studentinfo = new HashMap<String, Student>();

				for (Student student :roster) {

					studentinfo.put(student.getName(),student);

				}
			}else
				System.out.println("Invalid input");
		}
		catch(IndexOutOfBoundsException ie)
		{
			ie.printStackTrace();
		}

		   		// studentinfo.get(i);
			 key=scan.nextLine();
			Student stud = studentinfo.get(key);
			
			stud.printStudent();
			
				
			
			
			
		
			
			}
}
		