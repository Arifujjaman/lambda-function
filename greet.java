package main;

public class greet {

	public static void main(String[] args) {
		//greet obj=new greet();
		//String h=obj.hello("arif");
		//System.out.println(h);
		lamda v=(name)->"hello "+name;
		System.out.println(v.hello("arif"));
	}
	//String hello(String name){
		//return "hello "+name;
	//}

}
