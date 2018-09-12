package spring3AndquartzDemo;
import java.text.SimpleDateFormat;
import java.util.Date;
/**  
*事件类
*作者 林炳文（ling20081005@126.com 博客：http://blog.csdn.net/evankaka）  
*时间 2015.4.29
*/
public class MyJob  {
public void run(){
	System.out.println("Hello Spring with Quzrtz  "+
			new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(new Date()));
}
 
}
