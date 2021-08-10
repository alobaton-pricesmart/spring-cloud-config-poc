package com.co.springcloudconfigpoc.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServerApplication
{
	 public static void main(String[] arguments) {
     SpringApplication.run(ServerApplication.class, arguments);
 }
}
