package basics_ass;

public class adding_series {
public static void main(String[] args) {
	
	float fact =1 ;
	float sum=1;
	for (int i = 1;i<=5 ; i++) {
	fact =fact*i;
	sum=sum+ (i/fact);
	System.out.print(i+"/"+i+"! + ");
		
	}
	System.out.println("= "+sum);
	
}
} 
