package spring3AndquartzDemo2;

import org.quartz.JobExecutionContext;

import org.springframework.scheduling.quartz.QuartzJobBean;

public class QuartzDemo extends QuartzJobBean {

	private JobData jobData; // JobDataΪ�Զ�����

	public void executeInternal(JobExecutionContext context) {

		System.out.println(jobData.getData() + " is executed");

	}

	public JobData getJobData() {

		return jobData;

	}

	public void setJobData(JobData jobData) {

		this.jobData = jobData;

	}

}