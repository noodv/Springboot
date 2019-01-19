package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Swagger控制器")
@RestController
public class SwaggerController {

	@ApiOperation("Swagger GET演示接口")
	// 开发中要统一规范，使用@GetMapping，不要使用requestMapping，它代表所有类别的请球都支持
	@RequestMapping(value = "/getSwagger", method = RequestMethod.GET)
	public String getSwagger(String param)
	{
		return "";
	}

	@ApiOperation("Swagger POST演示接口")
	// 开发中要统一规范，使用@GetMapping，不要使用requestMapping，它代表所有类别的请球都支持
	@RequestMapping(value = "/postSwagger", method = RequestMethod.POST)
	public String swagger(String param)
	{
		return "";
	}

}
