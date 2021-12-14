public class User {

    //这里name用的是私有类型

    private String name;
    //这里age用的是公有类型
    @TestAnnotation(value = 123)
    public int age;

    //无参构造器
    public User(){}

    //有参构造器
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
