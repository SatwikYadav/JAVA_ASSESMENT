public class AdditivePrime {

	public static boolean isPrime (int number) {
		for (int index=2;index<(number/2)+1;index++) {
			if(number%index==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int[] numArray= {2, 4, 6, 11, 12, 18, 7, 21, 23};

		for (int index=0;index<numArray.length;index++) {
			if (isPrime(numArray[index])) {
				int temp = numArray[index];
				int sum = 0;
				int remainder = 0;
				while(temp!=0){
					remainder=temp%10;
					sum = sum + remainder;
					temp = temp/10;
				}
				//System.out.println(sum);
				if (isPrime(sum)) {
					System.out.println(numArray[index]);
				}
			}
		}
	}
}
