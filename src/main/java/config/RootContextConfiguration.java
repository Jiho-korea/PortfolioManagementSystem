/*
========================================================================
파    일    명 : RootContextConfiguration.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.01.02
작  성  내  용 : Root Configuration 클래스
========================================================================
*/
package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 루트 컨텍스트 설정파일
 */
@Configuration
@Import({ MvcConfig.class, ControllerConfig.class, DataBaseConfig.class })
@ComponentScan(basePackages = { "service.impl" })
public class RootContextConfiguration {

}
