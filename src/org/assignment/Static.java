package org.assignment;

public class Static {
static 
{
	 {
	System.out.println("practice");}
System.out.println("this is static method p1");	
}
public void add1()
{   add1();
	System.out.println("normal method ");
	}
static 
{

System.out.println("this is static method p1");	
}
static 
{
System.out.println("this is static method p1");	
}

public static void main(String[] args) {
	Static t= new Static ();
	t.add1();
}
}
