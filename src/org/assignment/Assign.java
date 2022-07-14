package org.assignment;

public class Assign {
static 
{ 
	System.out.println("assignment");}
public static void main(String[] args) {
	
	int a=50;
	int e=25;
	int b=a;//assign value of variable a=12
	System.out.println(b);//50  //assign = b=a
	b+=a;
	System.out.println(b);//100
	b-=e;
	System.out.println(b);//75
	b*=a;
	System.out.println(b);//3750
	b/=a;
	System.out.println(b);//75
	b%=a;
	System.out.println(b);//25
	b&=a;  //25=50
	System.out.println(b);//16
	boolean g=a>b&&a<b; 
	System.out.println(g);
	int i=(a<<=b);
	System.out.println(i);
	boolean h=(a!=b);
	System.out.println(h);
	int o=(a^=b);
	System.out.println(o);
	int x=10;  
	System.out.println(x++);//10 (11)  
	System.out.println(++x);//12  
	System.out.println(x--);//12 (11)  
	System.out.println(--x);//10  
	System.out.println("____________nested if_________");
	  int l = 30;
      int y = 10;

      if( l == 30 ) {
         if( y == 10 ) {
            System.out.println("l = 30 and y = 10");
         }
      }
      System.out.println("_________switch____________");

	int z=20;
	switch(z) {
	
	case(23):
		System.out.println("lucky");
		break;
	case(12):
		System.out.println("unlucky");
		break;
	case(223):
		System.out.println("goodluck");
		break;
	
		default:
			System.out.println("bad day");
	
	

	}
}
}
