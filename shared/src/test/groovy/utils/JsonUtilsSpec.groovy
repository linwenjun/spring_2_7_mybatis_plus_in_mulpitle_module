package utils

import groovy.transform.builder.Builder
import lombok.Getter
import lombok.RequiredArgsConstructor
import lombok.Setter
import org.example.utils.JsonUtils
import spock.lang.Specification

import java.time.Instant
import java.time.LocalDate
import java.time.ZoneOffset

class JsonUtilsSpec extends Specification {

    enum FileType {
        ZIP, PDF
    }

    @Setter
    @Getter
    @Builder
    @RequiredArgsConstructor
    static class FizzClass {
        String name;
        FileType type;
        Instant sometime;
    }

    def "should be a simple assertion"() {
        expect:
        1 == 1
    }

    def "should stringify json"() {
        given:
        def date = LocalDate.parse("2021-05-01")
                .atStartOfDay().atOffset(ZoneOffset.UTC).toInstant()

        def input = List.of(
                FizzClass.builder()
                        .name("tom")
                        .type(FileType.PDF)
                        .sometime(date)
                        .build()
        )

        when:
        def marshal = JsonUtils.marshal(input)

        then:
        marshal == '[{"name":"tom","type":"PDF","sometime":"2021-05-01T00:00:00Z"}]'
    }

    def "should parse string"() {
        given:
        def marshal = '[{"name":"tom","type":"PDF","sometime":"2021-05-01T00:00:00Z"}]'

        when:
        def actual = JsonUtils.unmarshal(marshal, FizzClass[])

        then:
        actual[0].getName() == "tom"
        actual[0].getType() == FileType.PDF
        actual[0].getSometime() instanceof Instant
    }
}
