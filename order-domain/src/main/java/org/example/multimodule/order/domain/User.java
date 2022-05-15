package org.example.multimodule.order.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter(AccessLevel.PROTECTED)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
}
