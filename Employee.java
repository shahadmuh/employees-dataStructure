public class Employee {
private int id;
private String name;
private double salary;

public Employee(int id,String name,double salary){
this.id=id;
this.name=name;
this.salary=salary;}

public String toString(){
return "Employee's Information:\n ID: "+id+"\nName: "+name+"\nSalary: "+salary;}}