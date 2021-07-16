package debug;

public class Main {



	public static void main(String[] args) {
		   
		int a=20;
		
		int b=30;
		
		Main main=new Main();	
		
		int result=main.sum(a,b);	
	
		
		for(int i=0;i<5;i++){
			System.out.println("prabhat" + i);
			
		}
		
		
		Other o=new Other();
		int r=o.mul(4, 5);
		System.out.println(r*r);
		
		

	}		
	 int sum(int a,int b){
		
		int c=a+b;
		return c;		
		
	}
	 
	 
	 
	 
}
