package ccut.size;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * @author20194660
 * */
public class Test {
	
	public static void main(String[] args) throws FileNotFoundException  {//������
		Szys szys = new Szys();//�����������㷽���Ķ���
		
		while(true) {
			Scanner in = new Scanner(System.in);
		System.out.println("��������Ҫ���㷨������");//���Ƴ�������
		try {
			szys.amout = in.nextInt();//try catch ��� ������������쳣����
		}catch(Exception e){
			System.out.println("��������룡���������룡");continue;
		}
		
		System.out.println("��������Ҫÿ�и�����");//��չ����һ����ʾ������
		try {
			szys.line = in.nextInt();//try catch ��� ������������쳣����
		}catch(Exception e){
			System.out.println("��������룡���������룡");continue;
		}
		System.out.println("��������Ҫ���ƵĽ����Χ��");//���ƽ���ķ�Χ
		try {
			szys.fanwei = in.nextInt();//try catch ��� ������������쳣����
		}catch(Exception e){
			System.out.println("��������룡���������룡");continue;
		}
		System.out.println("�������Ƿ���Ҫ�˳���(��Ҫ��4������Ҫ��2)��");//�����Ƿ���Ҫ�˳���
		try {
			szys.jjcc = in.nextInt();//try catch ��� ������������쳣����
		}catch(Exception e){
			System.out.println("��������룡���������룡");continue;
		}
		System.out.println("�������Ƿ��������(������1����������0)��");//�����Ƿ��������
		try {
			szys.fushu = in.nextInt();//try catch ��� ������������쳣����
		}catch(Exception e){
			System.out.println("��������룡���������룡");continue;
		}
		System.out.println("�������Ƿ���Ҫ��(��Ҫ��1������Ҫ��0)��");//�����Ƿ���Ҫ��
		try {
			szys.da = in.nextInt();//try catch ��� ������������쳣����
		}catch(Exception e){
			System.out.println("��������룡���������룡");
			continue;
		}
		szys.getTimu();break;
	}
		
	}
}
