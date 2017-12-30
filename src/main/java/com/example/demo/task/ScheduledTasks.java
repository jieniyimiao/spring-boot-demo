package com.example.demo.task;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Configurable
@EnableScheduling
public class ScheduledTasks {

    //每5s执行一次
    @Scheduled(cron = "* * */500  * * * ")
    public void reportCurrentByCron(){
        System.out.println ("定时任务启动： " + dateFormat ().format (new Date()));
    }

    private SimpleDateFormat dateFormat(){
        return new SimpleDateFormat ("HH:mm:ss");
    }
}
