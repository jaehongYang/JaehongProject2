/**
 * ScheduleConfig.java
 * 
 * @author hyunmyung.yun
 * @version 1.0 2017. 4. 7.
 *
 * Copyright (c) 2016 BESPIN GLOBAL. 
 * 36 Jangmi-ro, Bundang-gu, Seongnam-si Gyeonggi-do Korea , 13496 
 * All rights reserved.  
 */

package com.jaehong.schedule;

import java.util.concurrent.Executor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import com.jaehong.define.StaticDefine;
import com.jaehong.schedule.batch.AutoTradeBatch;


/** 
 * Spring Scheduler 설정
 * 
 * @author hyunmyung.yun
 * @version 1.0 2017. 4. 7.
 * 
 * 실행되지 않는 일부 Scheduler가 있어서 하나로 통합하여 처리
 */

@Configuration
@EnableScheduling
@EnableAsync
public class ScheduleConfig implements SchedulingConfigurer {

	
	@Autowired
	AutoTradeBatch autoTradeBatch;
	
	/*
	 * (non-Javadoc)
	 * @see org.springframework.scheduling.annotation.SchedulingConfigurer#configureTasks(org.springframework.scheduling.config.ScheduledTaskRegistrar)
	 */
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(taskExecutor());
        
    }
	
    /**
     * 
     * Scheduler에 할당할 Tread Pool의 수량을 설정
     * 차 후 확장을 고려하여 기본적으로 20개를 할당 처리함 
     * @return
     * @exception {예외 처리 설명}
     */
    @Bean(destroyMethod="shutdown")
    public Executor taskExecutor() {
    	
    	// use the Spring ThreadPoolTaskScheduler
        ThreadPoolTaskScheduler scheduledExecutorService = new ThreadPoolTaskScheduler();
        // always set the poolsize
//        scheduledExecutorService.setPoolSize(poolSize);
        // do not wait for completion of the task
        scheduledExecutorService.setWaitForTasksToCompleteOnShutdown(false);
 
        return scheduledExecutorService;
    }    
    
    /**
     * 
     * 캠패인 메일 발송 처리 
     * @throws Exception
     * @exception {예외 처리 설명}
     */
    @Scheduled(cron="1/10 * * * * *")
    public void Batch() throws Exception {
    	if(StaticDefine.getCu().equals("Y")) {
    		autoTradeBatch.execute();
    	}
    }

}
