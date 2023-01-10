package withChildClass;

public class Main {
    public static  void fillRegistry(StudentRegistry studentRegistry){
        /* I need to create a object of student and set its values according to batch and put in map
        Student s = new Student();
        s.setBatchName("Nov21Batch");
        s.setAvgBatchPsp(81.94);
        studentRegistry.register("Nov21Batch", s);  */

        /* same I can create a object of IntelligentStudent and set its values as IntelligentStudent class
        extending the student class so in Map you can store IntelligentStudent type object also
         */
        IntelligentStudent is = new IntelligentStudent();
        is.setIq(180);
        is.setBatchName("Nov21IntermediateBatch");
        is.setAvgBatchPsp(89);
        studentRegistry.register("Nov21IntermediateBatch", is);
    }
    public static void main(String[] args) {
        StudentRegistry sr = new StudentRegistry();
        fillRegistry(sr);

        Student intelligentStudentDepandre = sr.get("Nov21IntermediateBatch").copy();
        intelligentStudentDepandre.setAge(25);
        intelligentStudentDepandre.setName("Depandre Singh");
        intelligentStudentDepandre.setPsp(98.99);

        intelligentStudentDepandre.print();

        System.out.println();

    }
}
