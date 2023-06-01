package ru.otus.task1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/")
public class BaseController {

    @GetMapping("/create")
    public ResponseEntity<String> productsCreateNew(@RequestParam String product) {
        log.debug("ProductsApiDelegate.productsCreateNew: {}", product);
        return ResponseEntity.ok(product);
    }
    @GetMapping("/get/{username}")
    public ResponseEntity<String> checkProduct(@PathVariable String username) {
        log.debug("ProductsApiDelegate.checkProducts: {}", username);
        return ResponseEntity.ok(username);
    }

    @GetMapping("/get/{username}")
    public ResponseEntity<String> checkProducts(@PathVariable String username) {
        return ResponseEntity.ok(username);
    }

}
