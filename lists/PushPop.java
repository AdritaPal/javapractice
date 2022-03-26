package lists;

import java.util.Stack;

public class PushPop {

	public static void main(String[] args) {
		Stack<String> s= new Stack<>();
		s.push("Elephant");
		s.push("Cat");
		s.push("Cheetah");
		s.push("Zebra");
		s.push("Tiger");
		s.push("Dog");
		System.out.println(s);
		s.pop();
		System.out.println(s);

	}

}
