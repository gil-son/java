package as02;

public class Seminary {
	private String title;
	private Student[] students; // You can create an array from the Student class
	private Teacher teacher;
	private Local local;
	
	public Seminary() {
		
	}

	public Seminary(String title) {
		this.title = title;
	}
	
	
	public void print() {
		// Can create a validation to verify if is null, before call any method get
		
		
		System.out.println(
				"\n------------- Relatory of Seminarys -------------\n"+
				"\nTitle: "+this.title+"\nTeacher: ");
		
		/*
		if(this.getTeacher() == null)
			System.out.println("No teacher register");
			
		else
			System.out.print(this.teacher.getName());	
		*/
		
		try {
			System.out.print(this.teacher.getName());
		}catch(Exception e) {
			System.out.print("No teacher register: "+e);
		}
		
		
		
		
		System.out.println("\nLocal:");
		
		if(local == null)
				System.out.print("No location register");
		else
			System.out.print("\n\tStreet: "+this.local.getStreet()+"\n\tDistrict: "+this.local.getDistrict()+"\n");
	
	
		System.out.println("\nStudent(s):");
		
			for(Student student: students) {
				if(student.getName() == null) {
					System.out.println("\nNo student register\n");
				}else {
					System.out.print("\n\t• " + student.getName());
				}
			}
		}
	
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {  // Receive an array of object
		this.students = students;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}
	
	
	
}
