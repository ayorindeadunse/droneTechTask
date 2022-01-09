package com.example.droneTechTask;

import com.example.droneTechTask.EventLog.ScheduledTask;

import java.util.Timer;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here

        Timer t = new Timer();
        ScheduledTask st = new ScheduledTask();
        t.schedule(st,0,2000);
        for (int i = 0; i <= 86400; i++) {
            System.out.println("Task Running....");
            Thread.sleep(5000);
            if (i == 86400) {
                System.out.println("Application Terminates");
                System.exit(0);
            }
        }
    }
}
