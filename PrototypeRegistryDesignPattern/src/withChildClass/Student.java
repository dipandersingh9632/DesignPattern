package withChildClass;

public class Student {
    private String name;
    private int age;
    private double psp;
    private double avgBatchPsp;
    private String batchName;

    public Student() {}

    // It is mandatory to create a copy contructor
    // so that child class can use that
    public Student(Student s){
        this.name = s.name;
        this.age = s.age;
        this.psp = s.psp;
        this.avgBatchPsp = s.avgBatchPsp;
        this.batchName = s.batchName;
    }

    public Student copy(){
        // Now copy will not do anything we just simply call the copy constructor and it will do the work
        Student s = new Student(this);
        return s;
    }

    public void print() {
        System.out.println("withChildClasss.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", avgBatchPsp=" + avgBatchPsp +
                ", batchName='" + batchName + '\'' +
                '}');
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
}
