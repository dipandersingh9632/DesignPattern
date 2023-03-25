package withBuild;

public class Client {
    public static void main(String[] args) throws Exception {
        Student s = Student.Builder.getBuilder().setId(1).setAge(21).setName("Depandre").setUniversityName("BVP").setPhoneNo("8237436747").build();
        System.out.println(s);
    }
}
