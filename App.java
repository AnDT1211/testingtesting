

import java.util.*;

class App {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("a");
		sb.append("b");
		sb.append("c");

		System.out.println(sb.indexOf("bc"));   // abc   
		sb.insert(1, "xxx");

		System.out.println(sb);
	}
}




