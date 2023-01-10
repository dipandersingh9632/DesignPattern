public class Child extends Parent{
    int marks;
    int weight;

    public Child(String name, int age, char gender, int marks, int weight){
        super(name, age, gender);
        this.marks = marks;
        this.weight = weight;
    }

    public void print(){
        System.out.println("Child{" +
                "marks=" + marks +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}');
    }
}
