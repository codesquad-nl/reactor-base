package nl.codesquad;


import org.junit.jupiter.api.*;

import reactor.test.*;

class KataTest {

    Kata kata = new Kata();

    @Test
    void fluxOfJustFooAndBar() {
        StepVerifier.create(kata.fluxOfJustFooAndBar())
                .expectNext("bar")
                .expectNext("foo")
                .verifyComplete();
    }

    @Test
    void monoOfJustFoobar() {
        StepVerifier.create(kata.monoOfJustFoobar())
                    .expectNext("codesquad")
                    .verifyComplete();
    }
}