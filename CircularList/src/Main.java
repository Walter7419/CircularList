
public class Main {

	public static void main(String[] args) {
		Queue stack = new Queue(5);
		
		System.out.println(stack.delete()+"\n");


		stack.Insert("One");
		stack.Insert("Two");
		stack.Insert("Three");
		stack.Insert("Four");
		stack.Insert("Five");

		stack.print();

		
		System.out.println(stack.delete()+"\n");
		System.out.println(stack.delete()+"\n");
		System.out.println(stack.delete()+"\n");
		System.out.println(stack.delete()+"\n________");


		stack.Insert("Six");
		stack.print();

		

	}
}