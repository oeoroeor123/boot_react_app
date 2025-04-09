package edu.min.flutter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
public class AppConfig {

  // application.properties 파일의 프로퍼티를 읽는 Environment 인스턴스
  private final Environment env;
  
  @Bean
  KeyStore keyStore() {
    return new KeyStore(env.getProperty("spring.api.key")); // application.properties의 프로퍼티를 가져오는 방법
  }
  
}
