package spring3AndquartzDemo2;

import org.quartz.JobExecutionContext;

import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 *  这种方式的好处是可以通过xml的配置，将依赖的对象自动的注入，而不用自定义jobfactory
 * 
 * @author 30000133
 *
 */
public class QuartzDemo extends QuartzJobBean {

	private JobData jobData; // JobData为自定义类

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