import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    static Person person;
    static int age = 90;

    @BeforeEach
    void init() {
        person = new Person("Chak", "Norisi");
        person.setAge(80);
    }

    @Test
    void setAge() {
        person.setAge(age);
        assertNotEquals(age, person.getAge());
    }

    @Test
    void happyBirthday() {
        person.happyBirthday();
        assertEquals(81, person.getAge());
    }
}