package spring3AndquartzDemo2;

import org.quartz.JobExecutionContext;

import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 *  ���ַ�ʽ�ĺô��ǿ���ͨ��xml�����ã��������Ķ����Զ���ע�룬�������Զ���jobfactory
 * 
 * @author 30000133
 *
 */
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