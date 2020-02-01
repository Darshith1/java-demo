package arr_str;

public class String {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			int jcount = 0;
			for (int j = i; j <= 4; j++) {
				System.out.println(j);
				jcount++;
				if(j==4) {
					if(jcount!=4) {
						i=1;
					}
				}

			}
		}

	}

}
