package Exercise;

public class TestIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; //Declaration for i
		int iInc; //Declaration for  iInc
		
		i = 9; //Assign 9 to i
		
		iInc = i++; //postfix increment
		System.out.println("iInc for i++ = " + iInc);
		System.out.println("i is " + i);
		
		iInc = ++i; //prefix increment
		System.out.println("iInc for ++i = " + iInc);
		
	}

}
