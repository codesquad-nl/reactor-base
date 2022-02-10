package nl.codesquad;

import reactor.core.publisher.*;

public class Kata {

    Flux<String> fluxOfJustFooAndBar() {
        return Flux.just("foo", "bar");
    }

    Mono<String> monoOfJustFoobar() {
        return Mono.just("foobar");
    }
}
