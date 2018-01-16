package com.explore.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("Hello");
		queue.offer("World!");
		queue.offer("你好？");
		System.out.println(queue.size());
		for (String str : queue) {
			System.out.printf(str + "  ");
		}
		System.out.printf("\n");
		System.out.println(queue.size());
		String str;
		while ((str = queue.poll()) != null) {
			System.out.printf(str + "  ");
		}
		System.out.println();
		System.out.println(queue.size());
	}

}
