class Lift {
    private Person[] people = new Person[4];
    private int peopleNumber = 0;
    private final int maxWeight = 400;

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    void add(Person person) {
        if (peopleNumber < 4) {
            people[peopleNumber] = new Person(person.getId(), person.getWeight());
            peopleNumber++;
        } else System.out.println("Przekroczono limit miejsc");
    }

    void start(Person[] p) {
        if (getTotalWeight(p)<maxWeight){
            System.out.println("Winda ruszyla");
        }else System.out.println("Winda przeciazona ("+(getTotalWeight(p)-maxWeight)+"kg ponad limit)");


    }

    int getTotalWeight(Person[] p) {
        return p[0].getWeight() + p[1].getWeight() + p[2].getWeight() + p[3].getWeight();
    }

    void clear() {

    }
}
