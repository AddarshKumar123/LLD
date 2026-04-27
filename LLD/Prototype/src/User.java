public class User implements IPrototype{
    public String name;
    public int age;

    public User(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public User clone() {
        return new User(this.name,this.age);
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}
