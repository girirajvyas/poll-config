package com.cognizant.polling;

import org.springframework.scheduling.annotation.Scheduled;

public class ScheduledDemo {

  @Scheduled(fixedRate=5000)
  public void printMessage() {
      System.out.println("I am called by Spring scheduler");
  }
}
