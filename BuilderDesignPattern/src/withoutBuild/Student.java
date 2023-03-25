package withoutBuild;

public class Student {
    String name;
    int id;
    int age;
    String phoneNo;
    String universityName;
    int gradYear;
    double psp;

    public Student(Builder builder) throws Exception {
        // NOw do your validations
        if(builder.getGradYear() > 2022) throw  new Exception();
        if(builder.getGradYear() - builder.getAge() > 1996) throw new Exception();
        if(builder.getPhoneNo().length() != 10) throw new Exception();

        this.name = builder.getName();
        this.id = builder.getId();
        this.age = builder.getAge();
        this.phoneNo = builder.getPhoneNo();
        this.universityName = builder.getUniversityName();
        this.gradYear = builder.getGradYear();
        this.psp = builder.getPsp();
    }

    public static Builder getBuilder(){
        return new Builder();
    }


    public void print() {
        System.out.println("withoutBuild.Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", phoneNo='" + phoneNo + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                '}');
    }
}
