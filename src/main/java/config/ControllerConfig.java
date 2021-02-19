/*
========================================================================
파    일    명 : ControllerConfig.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.01.02
작  성  내  용 : MainController 빈 등록
========================================================================
*/
package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import controller.MainController;

@Configuration
@ComponentScan(basePackages = {"controller", "service"})
public class ControllerConfig {
	/*
	 * @Bean public MainController mainController() { return new MainController(); }
	 */

}
