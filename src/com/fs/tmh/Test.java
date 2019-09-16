package com.fs.tmh;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
         Teacher t = new  Teacher();
         Teacher t2 = new Teacher(2);
         Teacher t3 = new Teacher("aaa");
         System.out.println(t2);
         System.out.println(t3);
         Teacher t4 = new Teacher(1, "张武");
         System.out.println(t4.name+"年龄是"+t4.age);
         System.out.println(t2.age);
         System.out.println(t3.name);
        	
	}

}
