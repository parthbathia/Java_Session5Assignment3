import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ConstructorOverload {

	double rectArea, sqArea;
	
	ConstructorOverload(int rectLength, int rectBreadth) {
		
		rectArea = rectLength * rectBreadth;
		
	}
	
	public ConstructorOverload(int sqLength) {
		
		sqArea = sqLength * sqLength;
	
	}
	
	
	public static void main(String[] args) throws Exception {
		
		System.out.print("Enter length of Rectangle : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rectLength = Integer.parseInt(br.readLine());
		
		System.out.print("Enter breadth of Rectangle : ");	
		int rectBreadth = Integer.parseInt(br.readLine());
		
		ConstructorOverload co = new ConstructorOverload(rectLength,rectBreadth);
		
		System.out.println("\nArea of Rectangle : " + co.rectArea);
		System.out.println("\n");
		
		System.out.print("Enter Length of Square : ");	
		int sqLength = Integer.parseInt(br.readLine());
		
		ConstructorOverload co1 = new ConstructorOverload(sqLength);
		System.out.println("\nArea of Square : " + co1.sqArea);
	}

}
