/**
* ClassName : Main.java
* Create on ：2016年5月23日
* Copyrights 2016 guanfl All rights reserved.
* Email : guanfl@163.com
*/
package com.spring.quartz.job;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        new ClassPathXmlApplicationContext("applicationContext-job.xml");
    }
}
