public class Calculate{

	public static void main(String[] arg){
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int a = first + second; 
		System.out.println("sum "+ a);
		int b = first * second;
		System.out.println("umnog "+ b); 
		float c = first / second;
		System.out.println("delen " + c);
		int d = first - second;
		System.out.println("raznic " + d);
}
}