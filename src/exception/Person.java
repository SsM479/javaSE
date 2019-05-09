package exception;
/**
 * 使用当前类测试异常的抛出
 * @author soft01
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}
	/**
	 * 当一个方法用throws生命一个异常的抛出时，那么
	 * 调用者在调用该方法时就必须处理这个异常(提醒)
	 */
	public void setAge(int age) throws IllegalAgeException{
		if(age<0 || age>100) {
			/*
			 * 一个方法当中使用throw抛出什么异常，就要
			 * 在方法上使用throws生命该异常的抛出，
			 * 只有RuntimeException 不用在方法throws
			 * 其他类型时必须的，否则编译不通过
			 */
			throw new IllegalAgeException("年龄不合法");
		}
		this.age = age;
	}
	
	
}
