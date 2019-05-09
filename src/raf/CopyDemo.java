package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件复制操作
 * @author soft01
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 1:创建一个RAF用于读取源文件
		 * 2:创建一个RAF用于写入复制文件
		 * 3:循环从原文件读取每一个字节并写入到复制文件中完成copy工作
		 */
		//1
		RandomAccessFile src = new RandomAccessFile("img.jpg","r");
		//2
		RandomAccessFile desc = new RandomAccessFile("img_cp.jpg","rw");
		//3
		int d = -1;
		while((d=src.read())!=-1) {
			desc.write(d);
		}
		System.out.println("复制完毕");
		src.close();
		desc.close();
	}
}
