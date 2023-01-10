public class Parent {
    String name;
    int age;
    char gender;

    public Parent(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void print(){
        System.out.println("Parent {" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}');
    }
}
