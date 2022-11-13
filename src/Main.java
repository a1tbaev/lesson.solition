public class Main {
    public static void main(String[] args) {

        Person[] people = { new Singer("adil", 12, "microphone"),
                            new Dancer("agusha", 13, "dancing"),
                            new Programmer("adil", 14, "coding")};
        getAll(people);

    }
    public static void getAll(Person[] person){
        for (Person people:person) {
            System.out.println(people);
            people.getInfo();
            if (people.getClass().equals(Singer.class)){
                System.out.println("singer");
            } else if (people.getClass().equals(Dancer.class)) {
                System.out.println("dancer");
            }else{
                System.out.println("programmer");
            }
        }
    }
}