class Lift {
    private Person[] people = new Person[4];
    private int peopleNumber = 0;
    private final int maxWeight = 400;


    void add(Person person) {
        if (peopleNumber == 0) {
            people[peopleNumber] = new Person(person.getId(), person.getWeight());
            peopleNumber++;
            people[peopleNumber] = new Person();
            people[peopleNumber + 1] = new Person();
            people[peopleNumber + 2] = new Person();
        } else if (peopleNumber <= 1) {
            people[peopleNumber] = new Person(person.getId(), person.getWeight());
            peopleNumber++;
            people[2] = new Person();
            people[3] = new Person();
        } else if (peopleNumber <= 2) {
            people[peopleNumber] = new Person(person.getId(), person.getWeight());
            peopleNumber++;
            people[peopleNumber] = new Person();
        } else if (peopleNumber < 4) {
            people[peopleNumber] = new Person(person.getId(), person.getWeight());
            peopleNumber++;
        } else System.out.println("Przekroczono limit miejsc");


    }

    void start() {
        if (peopleNumber >4 ) {
            System.out.println("Przekroczono limit miejsc");
        } else if (getTotalWeight() > maxWeight) {
            System.out.println("Winda przeciazona (" + (getTotalWeight() - maxWeight) + "kg ponad limit)");

        } else {
            System.out.println("Winda ruszyla");
        }


    }

    int getTotalWeight() {
        return people[0].getWeight() + people[1].getWeight() + people[2].getWeight() + people[3].getWeight();
    }

    void clear() {
        peopleNumber = 0;
        people[peopleNumber] = new Person();
        people[peopleNumber + 1] = new Person();
        people[peopleNumber + 2] = new Person();
        people[peopleNumber + 3] = new Person();
    }
}
