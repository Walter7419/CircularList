
public class Queue {
	String[] stack;
	static int max;
	private int rear, front;
	
	
	public Queue(int stackSize) {
		this.stack=new String[stackSize];
		max=this.stack.length;
		this.rear=-1;
		this.front=-1;
	}
	
	public void Insert(String value) {

		if(front==-1&&rear==-1) {
			front++;
		}
		if(rear+1==max) {
			rear=-1;
		}
		if(stack[rear+1]!=null) {
			
			System.out.println("No se admiten mas");
			for(int x=0; x<max; x++) {
				System.out.println(stack[x]);
				stack[x]=null;
			}
			System.out.println("________");
			front=-1;
			rear=-1;
		}
		rear++;
		stack[rear]=value;
		
	}
	
	public String delete() {
		
		if(front==-1) {
			front++;
		}
		if(stack[front]==null) {
			System.out.println("Stack is empty");
			return(null);
		}
		else {
		String primer = stack[front];
		stack[front]=null;
		if(front==max) {
			front=0;
		}
		front++;

		return primer;
		}
	}
	
	public void print() {
		for(int x=0; x<max; x++) {
			System.out.println(stack[x]+ ",\t");	
		}
		System.out.println("____________");
	}
}