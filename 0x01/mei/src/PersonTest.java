import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    Person person1 = new Person("Paul", "McCartney", 2000, true, true, true);

    @Test
    public void setup(){
    }

    @Test
    public void show_full_name(){
        assertEquals(person1.fullName(), "Paul McCartney");
    }

    @Test
    public void test_calculateYearlySalary(){
        person1.setSalary(1200f);
        assertEquals(14400.0, person1.calculateYearlySalary());
    }

    @Test
    public void person_is_MEI(){
        person1.setPensioner(false);
        person1.setAnotherCompanyOwner(false);
        person1.setPublicServer(false);
        assertTrue(person1.isMei());
    }

    public void person_is_not_MEI(){
        person1.setPensioner(true);
        assertFalse(person1.isMei());
    }
}
