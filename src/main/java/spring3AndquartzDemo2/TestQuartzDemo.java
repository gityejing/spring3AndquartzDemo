package spring3AndquartzDemo2;

import java.io.*;

import org.quartz.Scheduler;

import org.quartz.SchedulerException;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuartzDemo {

	public static void main(String[] args) throws IOException {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-quartz4.xml");
		System.out.println("启动Task:");
		System.out.println("请输进 exit 结束Task:");

		//A处
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			if (reader.readLine().equals("exit"))
				break;
		}
		//此句可以放在A处

		Scheduler scheduler = (Scheduler) context.getBean("scheduledFactoryBean");
		try {
			scheduler.shutdown();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}

	}

}
