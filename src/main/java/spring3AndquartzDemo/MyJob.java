package spring3AndquartzDemo;
import java.text.SimpleDateFormat;
import java.util.Date;
/**  
*�¼���
*���� �ֱ��ģ�ling20081005@126.com ���ͣ�http://blog.csdn.net/evankaka��  
*ʱ�� 2015.4.29
*/
public class MyJob  {
public void run(){
	System.out.println("Hello Spring with Quzrtz  "+
			new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(new Date()));
}
 
}
