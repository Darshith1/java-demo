package twofile;

public class Mathoperation {

	public boolean isprime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public int countprimes(int lb, int ub) {
		int count = 0;
		for (int i = lb; i <= ub; i++) {
			if (isprime(i)) {
				count++;
			}
		}
		return count;
	}
	

	public int[] getprimerange(int lb,int ub) {
		int arr[] = new int[countprimes(lb, ub)];
		for (int i = lb,j=0; i <=ub; i++) {
			if(isprime(i)) {
				arr[j++]=i;
			}
		}
		return arr;
		
			  
			
			
		}
}
