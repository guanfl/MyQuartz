/**
* ClassName : MethodInvokingJob.java
* Create on ：2016年5月22日
* Copyrights 2016 guanfl All rights reserved.
* Email : guanfl@163.com
*/
package com.spring.quartz.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MethodInvokingJob {
    private static Logger log = LoggerFactory.getLogger(MethodInvokingJob.class);
    
    public void run(){
        log.debug("Method Run called!");
    }
}
