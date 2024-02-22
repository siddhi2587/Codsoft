package CodeSoft;
import java.util.ArrayList;
import java.util.Scanner;

class Student
{
	private String name;
	private int rollNumber;
	private char grade;
	public Student(String name,int rollNumber,char grade)
	{
	this.name=name;
	this.rollNumber=rollNumber;
	this.grade=grade;
		
	}
	public Student(String newName, String string, int i, char c) 
	{
		
	}
	public String getName()
	{
		return name;
	}

	public int getRollNumber() 
	{
		return rollNumber;
	}
	
	public char getGrade() 
	{
		return grade;
	}
}
class StudentManagementSystem
{
private ArrayList<Student> students=new ArrayList<>();
public void addStudent(Student student)
{
students.add(student);
}
public void removeStudent(int rollNumber)
{
	
students.removeIf(student->student.getRollNumber()==rollNumber);
}
public Student searchStudent(int rollNumber)
{
return students.stream()
		.filter(student->student.getRollNumber()==rollNumber)
		.findFirst()
		.orElse(null);
		
}
public void displayAllStudents()
{
	

System.out.println("All Students");
for(Student student:students)
{
System.out.println("Name:"+student.getName()+",Roll No:"+student.getRollNumber() +",Grade:"+student.getGrade());	
}

}
}

class StudentInterface
{
private StudentManagementSystem studentManagementSystem=new StudentManagementSystem();	
private Scanner sc=new Scanner(System.in);
public void addNewStudent() {
	System.out.println("Enter student name:");
	String name=sc.nextLine();
	System.out.println("Enter student roll no:");
	int rollNumber=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter student Grade:");
	char grade=sc.next().charAt(0);
	Student newStudent=new Student(name,rollNumber,grade);
	studentManagementSystem.addStudent(newStudent);
	System.out.println("Student added successfully");
	
}
public void editStudentInfo()
{
System.out.println("Enter the roll number of student to edit:");
int rollNumber=sc.nextInt();
sc.nextLine();
Student existingStudent=studentManagementSystem.searchStudent(rollNumber);
if(existingStudent!=null)
{
System.out.println("Student found! Current information:");
System.out.println("Name:"+existingStudent.getName()+",Roll number:"+existingStudent.getRollNumber()+",Grade:"+existingStudent.getGrade());
System.out.println("Enter new name(press enter to keep current):");
String newName=sc.nextLine();
if(!newName.isEmpty())
{
	existingStudent=new Student(newName,existingStudent.getName(),existingStudent.getRollNumber(),existingStudent.getGrade());	

}
System.out.println("Enter new grade(press enter to keep current):");
String newGrade=sc.nextLine();
if(!newGrade.isEmpty())
{
	existingStudent=new Student(newName,existingStudent.getRollNumber(),existingStudent.getGrade());	

}



System.out.println("Students information updated successfully!");
}
else {
 System.out.println("Student not found!");
}

}
public void searchForStudent()
{
System.out.println("Enter the roll number student to search:");
int rollNumber=sc.nextInt();
sc.nextLine();
Student student=studentManagementSystem.searchStudent(rollNumber);
if(student!=null)
{
System.out.println("Student found!");
System.out.println("Name:"+student.getName()+",Roll No:"+student.getRollNumber() +",Grade:"+student.getGrade());

}
else
{
	System.out.println("Student not found!");
}
}

public void displayAllStudents()
{
	studentManagementSystem.displayAllStudents();	

}
}
public class StudentM {

	public static void main(String[] args) {
		StudentInterface studentInterface=new StudentInterface();
		Scanner scanner=new Scanner(System.in);
		while(true)
		{
			System.out.println("Student Management System");
			System.out.println("1.Add new Student");
			
			System.out.println("2. edit existing student information");
			System.out.println("3.search for student");
			System.out.println("4.Display all students");
			System.out.println("5.Exit");
			
			System.out.println("Enter your choice:");
			int choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice)
			{
			case 1:
				studentInterface.addNewStudent();
				break;
				
			case 2:
				studentInterface.editStudentInfo();
				break;
			case 3:
				studentInterface.searchForStudent();
				break;
			case 4:
				studentInterface.displayAllStudents();
				break;
			case 5:
				System.out.println("Exiting the application,Goodbye");
				System.exit(0);
				default:
					System.out.println("Invalid choice.please enter valid option");
			}
			
		}
	}

}



