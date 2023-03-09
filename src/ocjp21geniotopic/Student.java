package ocjp21geniotopic;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable
{
	int rno;
	String name;
	transient int std;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int rno,String name,  int std) {
		this.name = name;
		this.rno = rno;
		this.std = std;
	}
	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(rno + " "+ name + " " + std);
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}

}
