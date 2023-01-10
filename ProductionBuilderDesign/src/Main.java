public class Main {
    public static void main(String[] args) {
      /*  Builder b = Student.getBuilder();
        b.setName("Depandre");
        b.setAge(25);
        b.setId(1598213);
        b.setGradYear(2019);
        b.setPsp(98.71);
        b.setPhoneNo("8237436747");
        b.setUniversityName("BVP");

        Student s = b.build(b);
        s.print();   PREVIOUS IMPLEMENTATION*/

        Student s = Student.getBuilder().setName("Depandre").setId(1598213).setAge(25)
                .setPsp(98.91).setGradYear(2019).setUniversityName("BVP").setPhoneNo("8237436747").build();

        s.print();
    }
}