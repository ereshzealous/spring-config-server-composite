package com.spring.cloud.awss3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 03/January/2021 By Author Eresh, Gorantla
 **/
@RestController
@RequestMapping("/api")
@RefreshScope
public class ConfigController {

	@Value("${configA}")
	private String configA;

	@Value("${configB}")
	private String configB;

	@Value("${configC}")
	private String configC;

	@GetMapping("/configs")
	public Map<String, Object> getConfigData() {
		Map<String, Object> objectMap = new HashMap<>();
		objectMap.put("configA", configA);
		objectMap.put("configB", configB);
		objectMap.put("configC", configC);
		return objectMap;
	}
}