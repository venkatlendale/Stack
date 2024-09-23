package sllprj;

import java.util.Scanner;

public class SLL {
	private Node head;
	   SLL(){
		   head=null;
	   }
	   SLL(int data){
		   head=new Node(data);
	   }
	   
	   public void create(int data) {
		   if(head!=null)  {
			   System.out.println("list already created");
			   return;
		   }
		   head=new Node(data);
	   }
	   public void create() {
		   if(head!=null)  {
			   System.out.println("list already created");
			   return;
		   }
		   Scanner sc=new Scanner(System.in);
		  int d= sc.nextInt();
		  Node t,l=null;
		  while(d!=0) {
			  t=new Node(d);
			  if(head==null)
				  head=t;
			  else 
				  l.setLink(t);
			  l=t;
			  d=sc.nextInt();	  
		  }
	   }
	  public void display() {
		  Node start;
		  start=head;
		  while(start!=null) {
			  System.out.println(start.getData());
			  start=start.getLink();
		  }
	  }
	  private void insF(int data) {
		  Node t=new Node(data);
		  t.setLink(head);
		  head=t;
	  }
	  private void insA(Node start, int data) {
		  Node t=new Node(data);
		    t.setLink(start.getLink());
		    start.setLink(t);
	  }
	  public void insert(int data, int pos) {
		  if(pos==1) {
			  insF(data);
			  return;
		  }
		  Node start=head;
		  for(int i=2;i<pos;i++) {
			  start=start.getLink();
		  }
		  insA(start,data);
	  }
  private int delF() {
	  
	  if(head==null) {
		  System.out.println("can not delete");
		  return(0);
	  }
	  int d=head.getData();
	  head=head.getLink();
	  return(d);
  }
  private int delA(Node start) {
	  if(start.getLink()==null) {
		  System.out.println("can not delete");
		  return(0);
	  }
	  Node t=start.getLink();
	  start.setLink(t.getLink());
	  return(t.getData());
  }
public int delete(int pos) {
	  if(pos==1) {
		 return( delF());
	  }
	  Node start=head;
	  for(int i=2;i<pos;i++) {
		  start=start.getLink();
	  }
	  return(delA(start));
}

}
