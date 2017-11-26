public class EmployeeList{
private Node head;


public EmployeeList(){
head=null;}

public int Size(){
if (isEmpty())
return 0;
Node current=head;
int c=1;
if (current.getNext()!=null){
current=current.getNext();
c++;}
return c;
}

public boolean isEmpty(){
return head==null;}

public void insertAtfront(Employee e){
Node node=new Node(e);

if (isEmpty())
head=node;
else{

node.setNext(head);
head=node;
}
}


public void display(){
Node current=head;
if (isEmpty())
System.out.println("The list is empty");
else{

while (current!=null){
System.out.println(current.getData());
current=current.getNext();}}}}