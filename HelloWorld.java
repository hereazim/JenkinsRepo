public class HelloWorld{
	public static void main(String[] args){
		System.out.println("This is HelloWorld java program");
		System.out.println("Line 1 included..");
		System.out.println("Line 2 included..");
		for(int i=1;i<=10;i++){
			System.out.println("Number "+i);
		}
		int i=1;
		while(i<=10){
			System.out.println(i);
			i++;
		}
		do{
			System.out.println("Line "+i);
			i++;
		}while(i>=10);
		System.out.println("Welcome");
	}
}
