package ccut.size;
import java.io.FileNotFoundException;
/*
 * @author20194660
 * */
import java.io.PrintStream;
import java.util.Random;
public class Szys{
	int amout,//�����Ա����
		line,
		fanwei,
		jjcc,
		fushu,
		da;
	public static int  s1 = new Random().nextInt(100);
	public static int  s2 = new Random().nextInt(100);
	public static int  s3 = new Random().nextInt(100);
	void getTimu() throws FileNotFoundException{
		
		PrintStream sc = new PrintStream("D:/result.txt");//�����ļ�д�뵽D�̵�result�ļ���
		Test test = new Test();//����Test��ķ���
		int[] daan = new int[amout];//����һ���洢�𰸵�����
		
		int[][] sum = new int[10000][3];
		
		for(int i=0;i<amout;i++) {//ѭ������
			System.setOut(sc);//���ƺ������Ŀ�����D��
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
			 
			 if(fushu == 1) {//�����û��Ƿ���Ҫ���ɸ���
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
    		     if(s3%-4==0) {//���������������
    		    		  System.out.print(s1 + "-" + s2 +"=  ");
    		    		  daan[i] = s1-s2;
    		    	 }
    		     if(s3%-4==1) {//��������ӷ�����
    		    	 if(Math.sqrt(s1*s1)+s2<fanwei) {
    		    	     System.out.print(s1 + "+" + s2 +"=  ");
    		    	     daan[i] = s1+s2;
    		    	     }
    		    	 else {
    		    		 System.out.print((fanwei-s1) + "+" + (fanwei-s2) +"=  ");
    		    		 daan[i] = (fanwei-s1) + (fanwei-s2);
    		    	 }
    		     }
    		     if(s3%-4==2) {//��������˷�����
    		    	 System.out.print( s1 + "*" + s2 +"=  ");
    		    	 daan[i] = s1*s2;
    		     }
    		     if(s3%-4==3) {//���������������
    		    	 System.out.print(s1 + "/" + s2 +"=  ");
    		    	 daan[i] = s1/s2;
    		     }
    		     
		   }
		if(da==1) {//��չ���������
			int j;
			System.out.println();
			for(j=0;j<amout;j++)
			 System.out.println(j+1+"��𰸣�"+daan[j]);//�������洢�Ĵ�
		}
		
        }

	

}
