package Important_Algorithms;
import java.util.*;

public class AE_Knuth_morris_pratt_Algorithm {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);		
		String string = in.nextLine();			//String string = in.next();
		String sub_string = in.nextLine();
		//System.out.print(string+" + "+ sub_string );
		int[] 	PATTERN = pattern( sub_string );
		System.out.println( doesMatch( string, sub_string, PATTERN ) );		
	}
	public static int[] pattern(String sub_string) {
		int[] pattern = new int[sub_string.length()];
		Arrays.fill(pattern, -1); 
		int i = 1;
		int j = 0;
		while( i < sub_string.length() ) {		
			if( sub_string.charAt(i) == sub_string.charAt(j) ) {
				pattern[i]=j;
				i++;
				j++; 
			}
			else if( j > 0) {
			j=	pattern[j - 1] + 1;
			
			}
			else {
				i++;
			}			 
		}
		return pattern;		
	}
	public static boolean doesMatch(String str, String sub_string, int[] pattern ) {
		int i=0;
		int j=0;
		
		while( i + sub_string.length() - j <= str.length() ) {
			if( str.charAt(i) == sub_string.charAt(j) ) {
				if(j == sub_string.length() -1) return true;		
			i++;
			j++;	
			}
			else if(j > 0)
				j = pattern[j - 1] + 1;				
			else 
				i++;
		}
		return false;
	}
}
