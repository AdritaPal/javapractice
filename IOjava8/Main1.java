package IOjava8;

import java.util.function.BiFunction;

class Arithmetic {

	public static int add(int a,int b) {
        BiFunction <Integer, Integer, Integer> funcAddObj = (i1, i2) -> i1 + i2;

		return funcAddObj.apply(a, b);
		
	}
	public static float add() {
		float a=30.0f;
		float b=20.0f;
        BiFunction <Float, Float, Float> funcAddObj = (i1, i2) -> i1 + i2;
        System.out.println("2: "+funcAddObj.apply(a, b));
		return 0;
		
	}
	public static float add(float a,float b) {
		BiFunction <Float, Float, Float> funcAddObj = (i1, i2) -> i1 + i2;

		return funcAddObj.apply(a, b);
		
	}

}

