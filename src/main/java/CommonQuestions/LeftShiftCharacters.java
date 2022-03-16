package CommonQuestions;

public class LeftShiftCharacters {

	public static void main(String[] args)
	{
		// Left rotation Concept in Java 
		
		String str="selenium";
		int n=str.length();
		
    	for(int i=0;i<n;i++)
		{
    		// Print the characters from start avoiding first few
    		// Append at the back what you are avoiding at the front
			System.out.println(str.substring(i+1,n) + str.substring(0,i+1) );
		}
		
	}
}
