package com.java.day7;

public class Work {
	class Super{
		public Super(){
		System.out.println("Super()");
		}
		public Super(String str){
		System.out.println("Super(String)");
		} }
		class Sub extends Super{
		public Sub(){
		System.out.println("Sub()");
		}
		public Sub(int i){
		this();
		System.out.println("Sub(int)");
		}
		public Sub(String str){
		super(str);
		System.out.println("Sub(String)");
		} }
		public class TestSuperSub{
		public void main(String args[]){
		Super s1 = new Sub(10);
		Sub s2 = new Sub();
		Sub s3 = new Sub("hello");
		} 
	}
}
