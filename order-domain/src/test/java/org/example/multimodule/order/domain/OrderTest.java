package org.example.multimodule.order.domain;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class OrderTest {
    @Test
    void name() {
        List<String> strings = List.of("a");
        String s = Optional.of(strings)
                .filter(it -> it.size() > 0)
                .map(it -> it.get(0))
                .orElse("2");

        System.out.println(s);

        Foo foo = new Foo(str -> {
        });


    }

    static class Foo implements TitleConsumer {
        private final TitleConsumer consumer;

        Foo(TitleConsumer consumer) {
            this.consumer = consumer;
        }

        public String bar() {
            return "Hello";
        }

        @Override
        public void consumer(String str) {

        }
    }

    @FunctionalInterface
    interface TitleConsumer {
        public void consumer(String str);
    }
}
