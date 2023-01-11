package Exercise;

public class TestIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; //Declare i
		int iInc; //Declare iInc
		
		i = 9; //Assign 9 to i
		
		iInc = i++; //Assign i++ to iInc
		System.out.println("iInc for i++ = " + iInc); //Output for i++
		System.out.println("i is " + i); //Output for i
		
		iInc = ++i; //Assign ++i to iInc
		System.out.println("iInc for ++i = " + iInc); //Output for ++i
	}

}
