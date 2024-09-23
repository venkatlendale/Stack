package sllprj;

public class SLLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL list=new SLL();
		list.create();
		System.out.println("deleted ele : "+list.delete(1));
		list.display();

	}

}
