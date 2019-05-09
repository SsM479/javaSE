package exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 子类重写父类含有的throws声明异常抛出的方法时对throws
 * 的重写规则
 * @author soft01
 *
 */
public class ThrowsDemo {
	public void dosome() throws IOException,AWTException{
		
	}
}

class Son extends ThrowsDemo{
	/*
	 * 可以完全一样
	 */
//	public void dosome() throws IOException,AWTException{
//		
//	}
	
	/*
	 * 重写时可以不再抛出任何异常
	 */
//	public void dosome(){
//		
//	}
	
	/*
	 * 可以仅抛出部分异常
	 */
//	public void dosome() throws IOException{
//		
//	}
	
	/*
	 * 可以抛出父类方法抛出异常的子类型异常
	 * (FileNotFoundException extends IOException)
	 */
//	public void dosome() throws FileNotFoundException{
//		
//	}
	
	
/************** 不允许 *****************/
	
	/*
	 * 不允许抛而外的没关系的异常
	 */
//	public void dosome() throws SQLException{
//		
//	}
	
	/*
	 * 不允许抛父类方法抛出异常的更大的异常
	 * IOException extends Exception
	 */
//	public void dosome() throws Exception{
//		
//	}
}
