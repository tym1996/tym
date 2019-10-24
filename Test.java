package ccut.size;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * @author20194660
 * */
public class Test {
	
	public static void main(String[] args) throws FileNotFoundException  {//主方法
		Szys szys = new Szys();//创建四则运算方法的对象
		
		while(true) {
			Scanner in = new Scanner(System.in);
		System.out.println("请输入想要的算法个数：");//控制出题数量
		try {
			szys.amout = in.nextInt();//try catch 语句 用来处理程序异常处理
		}catch(Exception e){
			System.out.println("错误的输入！请重新输入！");continue;
		}
		
		System.out.println("请输入想要每行个数：");//扩展功能一行显示几个题
		try {
			szys.line = in.nextInt();//try catch 语句 用来处理程序异常处理
		}catch(Exception e){
			System.out.println("错误的输入！请重新输入！");continue;
		}
		System.out.println("请输入想要控制的结果范围：");//控制结果的范围
		try {
			szys.fanwei = in.nextInt();//try catch 语句 用来处理程序异常处理
		}catch(Exception e){
			System.out.println("错误的输入！请重新输入！");continue;
		}
		System.out.println("请输入是否需要乘除法(需要按4，不需要按2)：");//控制是否需要乘除法
		try {
			szys.jjcc = in.nextInt();//try catch 语句 用来处理程序异常处理
		}catch(Exception e){
			System.out.println("错误的输入！请重新输入！");continue;
		}
		System.out.println("请输入是否包含负数(包含按1，不包含按0)：");//控制是否包含负数
		try {
			szys.fushu = in.nextInt();//try catch 语句 用来处理程序异常处理
		}catch(Exception e){
			System.out.println("错误的输入！请重新输入！");continue;
		}
		System.out.println("请输入是否需要答案(需要按1，不需要按0)：");//控制是否需要答案
		try {
			szys.da = in.nextInt();//try catch 语句 用来处理程序异常处理
		}catch(Exception e){
			System.out.println("错误的输入！请重新输入！");
			continue;
		}
		szys.getTimu();break;
	}
		
	}
}
