package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api("Demo控制器")
@RestController
@RequestMapping(("/demo"))
public class DemoController {

	@ApiOperation("Demo GET演示接口")
	// 开发中要统一规范，使用@GetMapping，不要使用requestMapping，它代表所有类别的请球都支持
	@RequestMapping(value = "/getSwaggerIndex", method = RequestMethod.GET)
	public String getSwaggerIndex(String param)
	{
		return "";
	}

	@ApiOperation("Demo POST演示接口")
	// 开发中要统一规范，使用@GetMapping，不要使用requestMapping，它代表所有类别的请球都支持
	@RequestMapping(value = "/postSwaggerIndex", method = RequestMethod.POST)
	public String swaggerIndex(String param)
	{
		return "";
	}

}
