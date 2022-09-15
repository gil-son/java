package ex11;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		Employee employee01 = new Employee();
		Employee employee02 = new Employee();
		
		employee01.setTitle("Financial"); employee02.setTitle("HR");
		
		list.add(employee01); list.add(employee02);

		Employee employee = new Employee();
		
		System.out.println(employee.groupByJobTitle(list));
		
		System.out.println(employee.groupByJobTitleStream(list));

	}

}
