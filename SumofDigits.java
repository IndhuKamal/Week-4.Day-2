package week5.day1;



public class SumofDigits {

	public static void main(String[] args) {
       int var=123456;
       int sum=0;
       while(var>0) {
    	   sum=sum+(var%10);
    	   var=var/10;
       }

		System.out.println(sum);
	

	}

}
