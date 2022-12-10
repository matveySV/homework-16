import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StreamUtilsTest {
    static List<People> people;

    @BeforeAll
    static void beforeAll() {
        people = Arrays.asList(
                new People("Сергей ", 18, Sex.MAN),
                new People("Антон", 32, Sex.MAN),
                new People("Мила", 21, Sex.WOMAN),
                new People("Виктор Иванович", 73, Sex.MAN),
                new People("Алла Викторівна", 60, Sex.WOMAN));

    }

    @Test
    void shouldGetWomenFrom18To60() {
        assertThat(StreamUtils.getWomenFrom18To60(people)).hasSize(1)
                .filteredOn(woman -> woman.getName().equals("Мила"));
    }

    @Test
    void shoulGetAverageManAge() {
        assertThat(StreamUtils.getAverageManAge(people)).isEqualTo(41);
    }

    @Test
    void shouldGetWorkingPeople() {
        assertThat(StreamUtils.getWorkingPeople(people)).hasSize(3);
    }
}