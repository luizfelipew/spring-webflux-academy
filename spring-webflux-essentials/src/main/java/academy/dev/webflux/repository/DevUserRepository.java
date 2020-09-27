package academy.dev.webflux.repository;

import academy.dev.webflux.domain.DevUser;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface DevUserRepository extends ReactiveCrudRepository<DevUser, Integer> {
    Mono<DevUser> findByUsername(String username);
}
