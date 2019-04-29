import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in= new Scanner (System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int temp;
      if(n1>n2)
        temp=n1;
      else
        temp=n2;
      if(temp>n3)
        System.out.println(""+temp);
      else
           System.out.println(""+n3);      

    }
}