package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableHystrixDashboard
@EnableTurbine
@SpringBootApplication
public class HystrixTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixTurbineApplication.class, args);
	}

	/**
	 * 1. open url: http://localhost:8081/hystrix/
	 * 2. http://localhost:8081/turbine.stream
	 *   Note: http://127.0.0.1:8081/turbine.stream maybe error
	 *		2020-11-05 13:59:09,115 WARN (HystrixDashboardConfiguration.java:188)- Origin parameter: http://127.0.0.1:8081/turbine.stream is not in the allowed list of proxy host names.  If it should be allowed add it to hystrix.dashboard.proxyStreamAllowList.
	 * 		2020-11-05 13:59:09,117 WARN (HystrixDashboardConfiguration.java:188)- Origin parameter: http://127.0.0.1:8081/turbine.stream is not in the allowed list of proxy host names.  If it should be allowed add it to hystrix.dashboard.proxyStreamAllowList.
	 * 	use http://localhost:8081/turbine.stream is ok
	 */

}