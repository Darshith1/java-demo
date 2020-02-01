package basics_ass;

public class print_abc {
	public static void main(String[] args) {
		int a = 65;
    for(int i=1; i<=3; i++) {
    	for(int j=1; j<=3; j++) {
    		System.out.print((char)a);
    		a++;
    	}
    	System.out.println();
    }
}
}
