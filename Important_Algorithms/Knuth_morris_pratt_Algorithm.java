package Important_Algorithms;	// brute force
public class Knuth_morris_pratt_Algorithm //  pattern matching
{
	    	public static void main(String[] args)
	{
    	String M_str= "THIS IS TEST CLASS";
		String SB_str="TEST";
		int L_MS= M_str.length();
		int L_SB= SB_str.length();

		if( L_MS<L_SB)
			System.out.println("False");
		if(M_str.isEmpty() && SB_str.isEmpty() )
			System.out.println("true");

		int j=0;
		for(int i = 0; i< L_MS; i++) 
		{
			int k= i;
			for(j=0; j< L_SB; j++)
			{
				if( k< L_MS && M_str.charAt(k) == SB_str.charAt(j) && j != L_SB ) 
				{
					k++;
				}
				else
					break; 							 
			}  
			if(j== L_SB) 
			{ 
        	System.out.println("True"); 
				break;
			}
		}
    System.out.println("False"); 
	}
}