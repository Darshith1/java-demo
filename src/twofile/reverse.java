package twofile;

public class reverse {

	//reverse the num
	public int reverse(int num) {
		int rev=0;
		while(num!=0){
		rev=rev*10+num%10;
		num=num/10;
	}
	return rev;
	}

	public int even(int num) {
		if(num%2==0) {
		    System.out.println("even num");
		}else {
			System.out.println("odd num");
		}  
		return num;
		
	}
	
	
	}

	
