public class Elevator {

    private Person[] persons = new Person[4];
    private final int maxLoad = 400;
    int currentLoad;

    public int getMaxLoad() {
        return maxLoad;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void addPerson(Person person) {
        if (person.getIdPerson() > persons.length) {
            System.out.println("Brak miejsca");
        } else {
            this.persons[person.getIdPerson() - 1] = person;
            currentLoad += person.getWeightOfPerson();
        }
    }

    void start() {
        if (currentLoad > maxLoad) {
            int overload = maxLoad - currentLoad;
            System.out.println("Winda jest przeciążona o: " + overload + " kg");
        } else
            System.out.println("Winda wystartowała");
    }

    void emptyElevator() {
    }
}
