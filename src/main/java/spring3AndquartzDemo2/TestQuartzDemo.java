package spring3AndquartzDemo2;

import java.io.*;

import org.quartz.Scheduler;

import org.quartz.SchedulerException;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuartzDemo {

	public static void main(String[] args) throws IOException {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-quartz4.xml");
		System.out.println("����Task:");
		System.out.println("����� exit ����Task:");

		//A��
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			if (reader.readLine().equals("exit"))
				break;
		}
		//�˾���Է���A��

		Scheduler scheduler = (Scheduler) context.getBean("scheduledFactoryBean");
		try {
			scheduler.shutdown();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}

	}

}
