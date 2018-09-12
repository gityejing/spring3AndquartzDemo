package spring3AndquartzDemo;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class MyTest {
	public static void main(String[] args) {

		// ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

		Resource res = new ClassPathResource("spring-quartz.xml");
		BeanFactory bf = new XmlBeanFactory(res);

		Scheduler scheduler = (Scheduler) bf.getBean("scheduler");
		try {
			scheduler.start();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}

	}

}
