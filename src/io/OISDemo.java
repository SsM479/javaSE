package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象输入流，用于进行对象反序列化
 * @author soft01
 *
 */
public class OISDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.obj"));
		/*
		 * 对象流读取的字节必须是对象输出流将一个对象
		 * 转换的一组字节，否则读取过程会抛出类没有找到
		 * 的异常:ClassNotFoundException
		 * 
		 * 将一组字节还原为对象的过程称为:对象
		 */
//		Person person = (Person)ois.readObject();
//		System.out.println(person);
//		
//		ois.close();
//		
		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.obj"));
//		Person person = (Person)ois.readObject();
//		System.out.println(person);
//		ois.close();
		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.obj"));
//		Person person = (Person)ois.readObject();
//		System.out.println(person);
//		ois.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person1.obj"));
		Person person = (Person)ois.readObject();
		System.out.println(person);
		ois.close();
	}
}
