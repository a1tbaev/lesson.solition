public class Person {

    private String name;
    private int age;
    private String think;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getThink() {
        return think;
    }

    public Person(String name, int age, String think) {
        this.name = name;
        this.age = age;
        this.think = think;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setThink(String think) {
        this.think = think;
    }

    public void getInfo(){
        System.out.println(name+ " " + age + " years old and he likes " + think );
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", think='" + think + '\'' +
                '}';
    }
}
