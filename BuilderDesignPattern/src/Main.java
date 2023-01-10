public class Main {
    public static void main(String[] args) throws Exception {
        Builder b = new Builder();
        b.setName("Depandre");
        b.setAge(25);
        b.setId(1598213);
        b.setGradYear(2019);
        b.setPsp(98.71);
        b.setPhoneNo("8237436747");
        b.setUniversityName("BVP");

        Student s = new Student(b);
        s.print();
    }
}