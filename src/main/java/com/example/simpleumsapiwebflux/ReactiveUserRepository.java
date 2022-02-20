package com.example.simpleumsapiwebflux;

import com.example.simpleumsapiwebflux.entity.User;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactiveUserRepository extends ReactiveSortingRepository<User, Long> {
}
