public class liftSimulation {
    public static void main(String[] args) {
        Person person1 = new Person(1, 100);
        Person person2 = new Person(2, 80);
        Person person3 = new Person(3, 90);
        Person person4 = new Person(4, 120);
        Person person5 = new Person(5, 110);

        Lift lift = new Lift();
        lift.add(person1);
        lift.add(person2);
        lift.add(person3);
        lift.add(person4);
        lift.add(person5);
        lift.getTotalWeight();
        System.out.println(lift.getTotalWeight());
        lift.start();

        lift.clear();
        lift.add(person5);
        lift.add(person1);
        lift.getTotalWeight();
        lift.start();
        System.out.println(lift.getTotalWeight());
        // jeszcze nie skonczylem ale na dzisiaj tak xd
    }
}
