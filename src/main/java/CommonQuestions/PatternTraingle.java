package CommonQuestions;

public class PatternTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "www.udzial.com Udzial Means Share";
		char[] charArr=str.toCharArray();
		
		for(int i=0;i<charArr.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(charArr[j]);
			}
			System.out.println();
		}
	}

}
