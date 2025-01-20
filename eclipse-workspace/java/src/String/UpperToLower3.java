package String;

public class UpperToLower3 {
public static void main(String[] args) {
	String str = "Hi Iam Your Hubby";
	String ans = "";
//	output = Hi Iam Your YBBUH
	String arr [] = str.split(" ");
	for (int i = 0; i < arr.length; i++) {
		if (i == 3) {
			String ab = arr[i];
			String rev = "";
			
			
		    for (int j = ab.length()-1; j >=0 ; j--) {
		    	char ch =  ab.charAt(j);
		    	if (ch >= 'a' && ch <= 'z') {
	                ch = (char)(ch - 32);
	            }
	            
	            rev = rev+ ch;
		    	
					}
		    ans = ans + rev;
			
			} else {
			ans = ans + arr[i] +" ";
		}
		
	}
	System.out.println(ans);
}
}
