public class Dancer extends Person{
    public Dancer(String name, int age, String think) {
        super(name, age, think);
    }

    @Override
    public void getInfo() {
        System.out.println(getName() +" " + getAge() + " years old and he likes " + getThink());
    }
}
