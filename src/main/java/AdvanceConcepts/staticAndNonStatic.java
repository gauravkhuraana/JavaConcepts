package AdvanceConcepts;

public class staticAndNonStatic {

	static int  number;
	int nonStaticNumber;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iamLocal;
     System.out.println(number);
     //System.out.println(nonStaticNumber);
     //System.out.println(iamLocal);
     
     staticAndNonStatic obj = new staticAndNonStatic();
     System.out.println(obj.nonStaticNumber);
	}

	public void nonStaticMethod()
	{
		int iamlocal;
		System.out.println(number);
		System.out.println(nonStaticNumber);
		//System.out.println(iamlocal);
	}
}
