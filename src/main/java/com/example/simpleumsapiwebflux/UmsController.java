package com.example.simpleumsapiwebflux;

import com.example.simpleumsapiwebflux.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UmsController {

    private final ReactiveUserRepository reactiveUserRepository;

    @GetMapping("/{uid}")
    public Mono<User> geUser(@PathVariable Long uid) {
        return reactiveUserRepository.findById(uid);
    }

    @GetMapping
    public Flux<User> geUsers(@RequestParam List<Long> uids) {
        return reactiveUserRepository.findAllByIdIn(uids);
    }
}
