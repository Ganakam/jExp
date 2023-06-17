public class Hello{
	public int add(int a, int b){
		return a+b;
	}
	public static void main(String args[]){
		Hello h = new Hello();
		int add = h.add(1, 2);
		System.out.println("Add of 1 and 2 is "+add);
	}
}
