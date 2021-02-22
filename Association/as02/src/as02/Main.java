package as02;

public class Main {

	public static void main(String[] args) {
		
		// Do not initially associate, as it will require the creation of a Seminar with Student... even when there is no student
		
		Student student = new Student("Gil",10);
		Student student2 = new Student("Ana",12);
		
		Seminary seminary = new Seminary("How be a Pro Programmer");
		Teacher teacher = new Teacher("Yoda","Use the force to programme");
		Local local = new Local("Morris Ave","Birmingham");
		
		// Association

		student.setSeminary(seminary);
		student2.setSeminary(seminary);
		
		
		
		seminary.setTeacher(teacher);
		seminary.setLocal(local);
		
		// You can create an array from the Student class
		seminary.setStudents( new Student[] {student, student2}); // Array of object
		
		
		// Other way to pass an Array of object - You can create an array from the Seminary class
		
		Seminary[] seminaryArray = new Seminary[1]; 
		seminaryArray[0] = seminary;
		teacher.setSeminarys(seminaryArray); // Array of object
		
		// Result
		seminary.print();
		teacher.print();
		student.print();
		
	}

}
