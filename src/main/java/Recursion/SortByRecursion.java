package Recursion;

import java.util.Stack;

public class SortByRecursion {

	private static void insert(Stack<Integer> stack, int temp) {
		
		if(stack.size() == 1 || stack.peek() <= temp) {
			stack.push(temp);
			return;
		}
		
		int val = stack.pop(); // Induction
		insert(stack, temp); // Hypothesis, smaller input
		stack.push(val);
		
	}
	
	private static void sort(Stack<Integer> stack) {
		
		if(stack.size() == 1) {
			return;
		}
		int val = stack.pop();
		sort(stack); // Hypothesis, smaller input
		insert(stack, val); // induction
		
	}
	
	private static void print(Stack<Integer> stack) {
		int elem = stack.pop();
		if(stack.isEmpty()) {
			System.out.println(elem);
			return;
		}
		print(stack);
		System.out.println(elem);
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(15);
		stack.push(25);
		stack.push(17);
		stack.push(41);
		
		sort(stack);
		print(stack);
		
	}
	
}
