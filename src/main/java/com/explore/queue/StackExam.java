package com.explore.queue;

import java.util.Stack;

public class StackExam {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		System.out.println("now the satck is " + isEmpty(stack));
		stack.push("1");
		stack.push("2");//BlockingQueue
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6");
		System.out.println("now the stack is " + isEmpty(stack));
		System.out.println(stack.peek());// 查看堆栈顶部的对象，并返回该对象，但不从堆栈中移除它。
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.search("3"));// ，此方法返回最近的目标对象距堆栈顶部出现位置到堆栈顶部的距离；
	}

	public static String isEmpty(Stack<String> stack) {
		return stack.empty() ? "empty" : "not empty";
	}
}
