package kum.Excepsion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student[] students = new Student[5];
    	students[0]= new Student("P", "P", 25, 5);
    	students[1]= new Student("P", "P", 25, 3);
    	students[2]= new Student("W", "P", 25, 1);
    	students[3]= new Student("K", "P", 25, 1);
    	students[4]= new Student("R", "P", 25, 1);

    	CreateGroup createGroup = new CreateGroup(students);
    	Group[] groups = createGroup.create();
    	
    	for (int i = 1; i < groups.length; i++) {
    		System.out.println("Group № " + groups[i].getGroupId());	
    		for (Student student : groups[i].getStudents()) {
				try {
					System.out.println(student.getFirstName() + " " + student.getSecondName() + " " + student.getAge());
				} 
				catch (NullPointerException e) {
//					System.out.println("Group is not full");
					break;
				}
			}
    		
    		}
    	}

    }

