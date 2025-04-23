import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void getAge() {
        Dog d = new Dog(4, "Skipper");
        assertEquals(4, d.getAge());
        Dog d2 = new Dog(5, "Skipper");
        assertEquals(5, d2.getAge());
        Dog d3 = new Dog(2, "Skipper");
        assertEquals(2, d3.getAge());
    }

    @Test
    void getName() {
        Dog d = new Dog(1, "Skipper");
        assertEquals("Skipper", d.getName());
    }

    @Test
    void dogAgeToHumanAge() {
        Dog d = new Dog(4, "Skipper");
        assertEquals(28, d.dogAgeToHumanAge());
    }

    @Test
    void findOldestDog() {
        Dog[] dogList = new Dog[3];
        Dog skipper = new Dog(5, "Skipper");
        Dog jens = new Dog(3, "Jens");
        Dog mario = new Dog(6, "Mario");
        dogList[0] = skipper;
        dogList[1] = jens;
        dogList[2] = mario;

        assertEquals("The oldest dog is Mario", Dog.findOldestDog(dogList));
    }
}