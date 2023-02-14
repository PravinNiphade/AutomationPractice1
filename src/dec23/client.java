package dec23;

import java.util.Scanner;

public interface client {
	void input();
	void output();
}
class pravin implements client{
	String name; int sal;

	public void input(){
		
	System.out.println("enter user name:");
	Scanner sc=new Scanner(System.in);
	name=sc.nextLine();
	System.out.println("enter salary:");
	sal=sc.nextInt();
	}
	
public void output() {

System.out.println(name +" " + sal);	


}
}