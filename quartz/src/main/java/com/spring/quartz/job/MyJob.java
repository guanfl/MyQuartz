/**
* ClassName : MyJob.java
* Create on ：2016年5月22日
* Copyrights 2016 guanfl All rights reserved.
* Email : guanfl@163.com
*/
package com.spring.quartz.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class MyJob extends QuartzJobBean {
    private static Logger log = LoggerFactory.getLogger(MyJob.class);
    
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        log.debug("Myjob执行了... " + context.getTrigger().getKey().getName());//
        //根据jobDetail去获取上下文数据
        ApplicationContext applicationContext = (ApplicationContext)context.getJobDetail().getJobDataMap().get("applicationContext");
        log.debug("获取到的容器是: " + applicationContext);
    }
}
