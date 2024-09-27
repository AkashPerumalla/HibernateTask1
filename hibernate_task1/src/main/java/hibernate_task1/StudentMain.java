package hibernate_task1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		StudentCRUD crud = new StudentCRUD();
		boolean check = true;
		
		
		do {
			
			System.out.println(" 1.save student \n 2.update student \n 3.delete student \n 4.get student by id \n 5.get all students \n 6.exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();
				System.out.println("enter the name");
				String name = scanner.next();
				System.out.println("enter the address");
				String address = scanner.next();
				
				student.setId(id);
				student.setName(name);
				student.setAddress(address);
				
				crud.saveStudent(student);
			}
				
				break;
				
			case 2: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();
				System.out.println("enter the name");
				String name = scanner.next();
				System.out.println("enter the address");
				String address = scanner.next();
				
				student.setId(id);
				student.setName(name);
				student.setAddress(address);
				
				crud.updateStudent(id, name, address);
			}
				
				break;
				
			case 3: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();
				
				student.setId(id);
				
				crud.deleteStudent(id);
			}
				
				break;
				
			case 4: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();
				
				student.setId(id);
				
				crud.getStudentById(id);
			}
				
				break;
			case 5: {
				
				crud.getAllStudents();
			}
				
				break;
				
			case 6: {
				System.exit(0);
			}

			default: {
				System.out.println("Invalid choice!!! \n Please select correct choice...");
			}
				
				break;
			}
			
		} while (check);
		
		scanner.close();

	}

}
