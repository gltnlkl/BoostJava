package com.baa.boost023.VectorStack;

import java.util.Stack;

public class StackLesson {
	
	public static void main(String[] args) { // ust uste kutular -- son eklenen ılk alınıyor
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		
		System.out.println(stack.peek()); // en ust degerı sorguluyor
		System.out.println(stack.pop());
		System.out.println(stack.pop()); // en usttekını al ve at alttakı ılk olsun
		System.out.println(stack.peek());
		
	}
	
}
