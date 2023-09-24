package com.demo1.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.demo1")
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
@Import({MyBatisConfig.class, JDBCConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
