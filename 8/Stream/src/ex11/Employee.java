package ex11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {

	String title;

	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	
	
	public Map<String, List<Employee>> groupByJobTitle(List<Employee> employeeList) {
		  Map<String, List<Employee>> resultMap = new HashMap<>();
		  for (int i = 0; i < employeeList.size(); i++) {
		      Employee employee = employeeList.get(i);
		      List<Employee> employeeSubList = resultMap.getOrDefault(employee, new ArrayList<Employee>());
		      employeeSubList.add(employee);
		      resultMap.put(employee.getTitle(), employeeSubList);
		  }  
		  return resultMap;
		}
	
	public Map<String, List<Employee>> groupByJobTitleStream(List<Employee> employeeList) {
		  return employeeList.stream()
		     .collect(Collectors.groupingBy(Employee::getTitle));
		}
	
	
}
