package com.cognizant.polling;

import java.util.concurrent.Executor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
@EnableScheduling
@ComponentScan(basePackages = {"com.cognizant.polling"})
public class WebConfig {

  @Bean(name = "threadPoolTaskExecutor")
  public Executor threadPoolTaskExecutor() {
      return new ThreadPoolTaskExecutor();
  }
  
  @Bean
  public ScheduledDemo scheduledDemo() {
    return new ScheduledDemo();
  }
}