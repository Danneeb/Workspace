package db222pt_assign1.Exercise2;
import java.io.*;
import java.util.*;


public class StackMain{

	public static void main(String[] args) {
		
		DefineStack stack = new DefineStack(1);
		
		System.out.println(stack.isEmpty());
		stack.push("1");
		stack.push("2");
		stack.push("3");
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
	}


}