package org.example.multimodule.order.domain;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;

@Builder
class Command {
    private String name;
}

@NoArgsConstructor
@ToString
class Man {
    private String name;
}

public class BasicTest {
    @Test
    void should_copy_a_instance() {
        Command cmd = Command.builder().name("abc").build();
        Man man1 = new Man();
        BeanUtils.copyProperties(cmd, man1);
        System.out.println(man1.toString());
    }
}
