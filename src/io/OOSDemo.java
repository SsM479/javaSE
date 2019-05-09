package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * 对象流
 * java.io,ObjectOutputStream
 * java.io.ObjectInputStream
 * 
 * 对象流是一对高级流，使用它们可以很方便的进行java中
 * 任何对象的读写操作
 * @author soft01
 *
 */
public class OOSDemo {
	public static void main(String[] args) throws IOException{
		String name = "苍老师";
		int age = 18;
		String gender = "女";
		String[] otherInfo = {"演员","爱写汉字","促进中日文化交流","广大男性的启蒙老师"};
		
		Person person = new Person(name,age,gender,otherInfo);
		System.out.println(Arrays.toString(otherInfo));
		/*
		 * 将person对象写入文件"person.obj"中
		 * 为了方便写出对象，连接对象输出流
		 */
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person1.obj"));
		/*
		 * 对象输出流提供的方法:
		 * void writeObject(Object obj)
		 * 该方法用于将给定对象转换为一组字节后写出，
		 * 需要注意，写出的对象必须实现就口:Serializable
		 * 否则会抛出一场
		 * 
		 * 
		 * 下面的操作经历两个过程
		 * 1:对象输出流将对象按照结构转换为了一组字节
		 *   这个过程称为:对象序列化
		 *   
		 * 2:文件输出流将这组字节写入到文件中(硬盘上)
		 *   做长久的保存的过程称为:数据持久化
		 */
		oos.writeObject(person);
		System.out.println("写出完毕");
		oos.close();
	}
}
