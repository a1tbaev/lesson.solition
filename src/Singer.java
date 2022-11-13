import javax.xml.namespace.QName;

public class Singer extends Person{
    public Singer(String name, int age, String think) {
        super(name, age, think);
    }

    @Override
    public void getInfo() {
        System.out.println(getName() +" " + getAge() + " years old and he likes sing with " + getThink());
    }
}
