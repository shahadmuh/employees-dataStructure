public class Node{
private Employee data;
private Node next;

public Node(Employee s){
data=s;
next=null;}

public Node getNext(){
return next;}

public void setNext(Node nex){
next=nex;}

public Employee getData(){
return data;}
}