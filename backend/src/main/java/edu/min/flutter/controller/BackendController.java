package edu.min.flutter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.min.flutter.config.KeyStore;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class BackendController {

  // 생성자 주입으로 keyStore 값 부여
  private final KeyStore keyStore;
  
  // 서버 측의 key 값을 REACT로 보냄
  @GetMapping("/api/getKey")
  public ResponseEntity<String> loadApiKey() {
    return ResponseEntity.ok(keyStore.getSpringApiKey());
  }
  
}
