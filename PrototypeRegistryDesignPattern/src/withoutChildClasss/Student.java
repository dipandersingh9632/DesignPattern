package withoutChildClasss;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private double psp;
    private double avgBatchPsp;
    private String batchName;

    @Override
    public Student copy() {
        Student s = new Student();
        s.name = this.name;
        s.age = this.age;
        s.psp = this.psp;
        s.avgBatchPsp = this.avgBatchPsp;
        s.batchName = this.batchName;
        return s;
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

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void print() {
        System.out.println("withoutChildClasss.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", avgBatchPsp=" + avgBatchPsp +
                ", batchName='" + batchName + '\'' +
                '}');
    }
}
