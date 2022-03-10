package com.example.simpleumsapiwebflux;

import com.example.simpleumsapiwebflux.entity.User;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import java.util.List;

@Repository
public interface ReactiveUserRepository extends ReactiveSortingRepository<User, Long> {

    Flux<User> findAllByIdIn(List<Long> ids);
}
