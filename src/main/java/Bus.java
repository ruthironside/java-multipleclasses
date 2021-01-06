import java.util.ArrayList;

public class Bus {


    private String destination;
    private Integer capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination) {
        this.destination = destination;
        this.capacity = 2;
        this.passengers = new ArrayList<Person>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean spaceAvailable() {
        int totalPassengers = passengerCount();
        return totalPassengers < this.capacity;
    }

    public void addPassenger(Person person) {
        int totalPersons = passengerCount();
        if (totalPersons < this.capacity) {
            this.passengers.add(person);
        }

    }

    public Person removePerson() {
        return this.passengers.remove(0);

    }

}
