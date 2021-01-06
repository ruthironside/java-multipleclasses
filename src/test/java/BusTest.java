import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before() {
        bus = new Bus("Edinburgh");
        person = new Person();
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bus.getCapacity());
    }

    @Test
    public void canTakePassengers() {
        assertEquals(true, bus.spaceAvailable());
    }

    @Test
    public void canAddAPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void busFull() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(false, bus.spaceAvailable());
    }

    @Test
    public void removePassenger() {

        Person removedPerson = bus.removePerson(person);
        assertEquals(removedPerson, person);
        assertEquals(0, bus.passengerCount());
    }





}
