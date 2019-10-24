package ccut.size;
import java.io.FileNotFoundException;
/*
 * @author20194660
 * */
import java.io.PrintStream;
import java.util.Random;
public class Szys{
	int amout,//定义成员变量
		line,
		fanwei,
		jjcc,
		fushu,
		da;
	public static int  s1 = new Random().nextInt(100);
	public static int  s2 = new Random().nextInt(100);
	public static int  s3 = new Random().nextInt(100);
	void getTimu() throws FileNotFoundException{
		
		PrintStream sc = new PrintStream("D:/result.txt");//控制文件写入到D盘的result文件里
		Test test = new Test();//创建Test类的方法
		int[] daan = new int[amout];//创建一个存储答案的数组
		
		int[][] sum = new int[10000][3];
		
		for(int i=0;i<amout;i++) {//循环出题
			System.setOut(sc);//控制后面的题目输出到D盘
			if(i%line==0) {
				System.out.print("\n");
			}
			s3 = new Random().nextInt(jjcc);
			     sum[i][2]=s3;
         		s1 = new Random().nextInt(fanwei);
  	            s2 = new Random().nextInt(fanwei);
			if((s3%-4)==0){
	            if(s2>s1){
	            	while(s2>s1) {
	            		s1 = new Random().nextInt(fanwei);
          	            s2 = new Random().nextInt(fanwei);
	            	}
	    			}
			}
			if((s3%-4)==1) {
                sum[i][0]=s1;
                sum[i][1]=s2;
			}
			 if((s3%-4)==2) {
	            if(s1*s2>100) {
	            	while(s1*s2>100){
	    				s1 = new Random().nextInt(fanwei);
	    	            s2 = new Random().nextInt(fanwei);
	    	        }
	            }
			}
			 if((s3%-4)==3) {
				  while(s2==0) {
  	                s2 = new Random().nextInt(fanwei);
  	            }
			      if(s1%s2!=0) {
			    	  while(s2==0) {
	    	                s2 = new Random().nextInt(fanwei);
	    	            }
			    	  while(s1%s2!=0){
		    				s1 = new Random().nextInt(fanwei);
		    	            s2 = new Random().nextInt(fanwei);
		    	            while(s2==0) {
		    	                s2 = new Random().nextInt(fanwei);
		    	            }
		            	}
		            }
			  }
			 
			 if(fushu == 1) {//控制用户是否需要生成负数
				 s1=(0-s1);
			 }
                 sum[i][0]=s1;
                 sum[i][1]=s2;
                 if(i>1) {
    		     if(sum[i-1][0]==sum[i][0]&&sum[i-1][1]==sum[i][1]&&sum[i-1][2]%4==sum[i][2]%4) {
    			    	 do {
    			    		 sum[i][0]=new Random().nextInt(fanwei);
    			    		 sum[i][1]=new Random().nextInt(fanwei);
    			    		 sum[i][2]=new Random().nextInt(fanwei);
    			    	 }while(sum[i][0]!=sum[i-1][0]&&sum[i][1]!=sum[i-1][1]&&sum[i][2]%4!=sum[i+1][2]%4);
    			     }
    		     }
    		     if(s3%-4==0) {//控制输出减法运算
    		    		  System.out.print(s1 + "-" + s2 +"=  ");
    		    		  daan[i] = s1-s2;
    		    	 }
    		     if(s3%-4==1) {//控制输出加法运算
    		    	 if(Math.sqrt(s1*s1)+s2<fanwei) {
    		    	     System.out.print(s1 + "+" + s2 +"=  ");
    		    	     daan[i] = s1+s2;
    		    	     }
    		    	 else {
    		    		 System.out.print((fanwei-s1) + "+" + (fanwei-s2) +"=  ");
    		    		 daan[i] = (fanwei-s1) + (fanwei-s2);
    		    	 }
    		     }
    		     if(s3%-4==2) {//控制输出乘法运算
    		    	 System.out.print( s1 + "*" + s2 +"=  ");
    		    	 daan[i] = s1*s2;
    		     }
    		     if(s3%-4==3) {//控制输出除法运算
    		    	 System.out.print(s1 + "/" + s2 +"=  ");
    		    	 daan[i] = s1/s2;
    		     }
    		     
		   }
		if(da==1) {//扩展功能输出答案
			int j;
			System.out.println();
			for(j=0;j<amout;j++)
			 System.out.println(j+1+"题答案："+daan[j]);//输出数组存储的答案
		}
		
        }

	

}
