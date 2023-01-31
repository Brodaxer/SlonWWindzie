public class liftSimulation {
    public static void main(String[] args) {
        Person person1 = new Person(1, 122);
        Person person2 = new Person(2, 122);
        Person person3 = new Person(3, 98);
        Person person4 = new Person(4, 66);
        Person person5 = new Person(5, 67);

        Lift lift = new Lift();
        lift.add(person1);
        lift.add(person2);
        lift.add(person3);
        lift.add(person4);
//        lift.add(person5);
        lift.getTotalWeight(lift.getPeople());
        lift.start(lift.getPeople());
    }
}
