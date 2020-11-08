public class ElevatorApp {
    public static void main(String[] args) {

        Elevator elevator = new Elevator();
        Person person1 = new Person(1, 100);
        elevator.addPerson(person1);
        Person person2 = new Person(2, 80);
        elevator.addPerson(person2);
        Person person3 = new Person(3, 150);
        elevator.addPerson(person3);
        Person person4 = new Person(4, 70);
        elevator.addPerson(person4);
        Person person5 = new Person(5, 90);
        elevator.addPerson(person5);
        Person person6 = new Person(6, 90);
        elevator.addPerson(person6);
        elevator.start();
        elevator.emptyElevator();
        System.out.println(elevator.currentLoad);

    }
}
