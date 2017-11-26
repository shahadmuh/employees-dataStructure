public class Test {

public static void main (String[] args){

EmployeeList obj=new EmployeeList();


Employee first=new Employee(23,"Noura",11000.0);
Employee second=new Employee(14,"Sarah",9500.0);

obj.insertAtfront(second);
obj.insertAtfront(first);


System.out.println("The number of employees: "+obj.Size());

System.out.println("All employees: ");
obj.display();
}
}