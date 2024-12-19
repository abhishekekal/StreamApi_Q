package empoperation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import FilterEmp.employee;

public class operation {
	
	
	public static void main(String[] args) {
		
	List<employee> listemp=Stream.of( 
			   new employee(121, "Abhi", 22, 90000),
			    new employee(122, "Rohan", 25, 60000),
			    new employee(123, "Saurabh", 40, 30000),
			    new employee(124, "Sa", 30, 20000)).collect(Collectors.toList());
			
	
	//listemp.stream().forEach(System.out::println);
	
	
	//Q1 . filter employee having age equal or more than 30 
	
	//listemp.stream().filter(emp-> emp.getEmpAge()>=30).forEach(System.out::println);
	
	//Q2 sort employee list by name using Stream api
	
	//listemp.stream().sorted(Comparator.comparing(employee::getEmpname)).forEach(System.out::println);
	
	
	//Q3 gives me the name Start with the S
	
	//listemp.stream().filter(e->e.getEmpname().startsWith("S")).forEach(System.out::println);
	
	//Q4 sort emp age by stream api

	//listemp.stream().sorted(Comparator.comparing(employee::getEmpAge)).forEach(System.out::println);
	
	//Q5  sort emp list by Salary using Stream api
	
	//listemp.stream().sorted(Comparator.comparing(employee::getEmpsal)).forEach(System.out::println);
	
	//Q6 fetch Second largest salary Emp 
	
	//employee emp=listemp.stream().sorted(Comparator.comparing(employee::getEmpsal).reversed()).collect(Collectors.toList()).get(1);
		//System.out.println(emp);
		
		
		//Q7 fetch Second largest age emp
		
//		employee emp=listemp.stream().sorted(Comparator.comparing(employee::getEmpAge)).collect(Collectors.toList()).get(listemp.size()-2);
//		System.out.println(emp);
		
		// reverse method use 
		
//	employee emp=listemp.stream().sorted(Comparator.comparing(employee::getEmpAge).reversed()).collect(Collectors.toList()).get(1);
//		
//	System.out.println(emp);
	
	
	//Q8 total salary
	
//	 double totalSalary=	listemp.stream().mapToDouble(employee::getEmpsal).sum();
//	 System.out.println( totalSalary);
	 
	 
	 //Q9 count of enter emp
	 
//	long c= listemp.stream().count();
//	System.out.println(c);
	
	
	
	
	
	
	 
	
	}
}
