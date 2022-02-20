package com.example.simpleumsapiwebflux;

import com.example.simpleumsapiwebflux.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UmsController {

    private final ReactiveUserRepository reactiveUserRepository;

    @GetMapping("/{uid}")
    public Mono<User> geUser(@PathVariable Long uid) {
        return reactiveUserRepository.findById(uid);
    }
}
