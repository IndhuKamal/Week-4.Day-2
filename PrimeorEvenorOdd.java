package week5.day1;

public class PrimeorEvenorOdd {

	public static void main(String[] args) {
		int num=10007;
		int count=1;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
			if(count==2) {
				System.out.println("Given number" + num + "is a prime and even number");
			}else
			{
				System.out.println("Given number " +num + "is not a prime and odd number");
			}
		}

	}

}
