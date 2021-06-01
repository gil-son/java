package exceptions.nullpointer.ex03;

public class ProcessPerson {

	Person person;
	
	public ProcessPerson(Person p){
		this.person = p;
	}
	
	public void ProcessPerson( Person p) {
		if(p != null) {
			System.out.println("Code to process");
		}else {
			System.out.println("The references is null");
		}
	}
}
