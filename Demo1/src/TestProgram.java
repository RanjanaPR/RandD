
public class TestProgram {

	  static int x=83;
	
	
	 public void nonStatic(int x) {
		 
	System.out.println("without static method : " + x);
	 }
	 
	 static void Static(int x) {
		 
		 System.out.println("with static method : " +x);
	 }
	 
public static void main(String arg[]) {
	
	

	 int x= 84;
	Static(x);
	TestProgram value= new TestProgram();
	value.nonStatic( x);
}

}
