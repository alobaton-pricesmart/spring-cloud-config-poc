package com.co.springcloudconfigpoc.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCloudConfigClientController
{

	@Value("${client.fancy.property}")
	private String clientFancyProperty;

	@GetMapping
	public String getClientfancyProperty()
	{
		return clientFancyProperty;
	}
}
