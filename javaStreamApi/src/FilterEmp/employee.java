package FilterEmp;

public class employee {
private int empid;
private String empname;
private int empAge;
private double empsal;


public employee(int empid, String empname, int empAge, double empsal) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.empAge = empAge;
	this.empsal = empsal;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public int getEmpAge() {
	return empAge;
}
public void setEmpAge(int empAge) {
	this.empAge = empAge;
}
public double getEmpsal() {
	return empsal;
}
public void setEmpsal(double empsal) {
	this.empsal = empsal;
}
@Override
public String toString() {
	return "employee [empid=" + empid + ", empname=" + empname + ", empAge=" + empAge + ", empsal=" + empsal + "]";
}



}
