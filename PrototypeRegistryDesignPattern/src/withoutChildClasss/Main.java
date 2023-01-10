package withoutChildClasss;

import withChildClass.IntelligentStudent;

public class Main {

    public static  void fillRegistry(StudentRegistry studentRegistry){
        /* I need to create a object of student and set its values according to batch and put in map */
        Student s = new Student();
        s.setBatchName("Nov21Batch");
        s.setAvgBatchPsp(81.94);
        studentRegistry.register("Nov21Batch", s);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        /* Now whenever I am constructing a new Student I simply have to give the batch name to registerClass.get()
        and pass the batch name so they will give me a student object but I cannot do the work on that I need to copy it
        so I will call copy since object is of Student type I will call copy() on it */
        Student depandre = studentRegistry.get("Nov21Batch").copy();
        depandre.setName("Depandre");
        depandre.setPsp(98.9);
        depandre.setAge(25);

        depandre.print();
    }
}