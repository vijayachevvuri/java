package demo;

public class operators {

	public static void main(String[] args) {
	
			int x = 30, y = 40;
			System.out.println("arithmatic operator");
			System.out.println(x+y);
	    	System.out.println(x-y);
	    	System.out.println("  ");
	    	//relation operator//
	    	System.out.println("relational operator");
	    	System.out.println(x<=y);
	    	System.out.println(x>=y);
	    	System.out.println("  ");
	    	//Unary operator//
	     	System.out.println("Unary operator");
	 	int z = x++;
	 	System.out.println("the output is z:"+z );
	    int r = --x;
	    System.out.println( "the output is r:"+r);
	    System.out.println("  ");
	    //AND operator//
	    System.out.println("AND opoerator");
	    int s =x&y;
	    System.out.println( "the output is s:"+s);
	    System.out.println("");
	    //ternary operator//
	    int a = 25;
	    System.out.println( " ternary operator");
	    a=(20==a)?1:0;
	    System.out.println("value of a is:"+a);
	    //Assignment operator//
	    int n ;
	    System.out.println("Assignment operator");
	    System.out.println(n=10);
	    System.out.println(n+=2);//n=n+1==10+2=12
	    System.out.println(n-=3);//n=n-2==12-3=9
	    System.out.println(n*=3);//n=n*3==9*3=27
	}
	}



