package withBuild;

public class Student {
    private String name;
    private int id;
    private int age;
    private String phoneNo;
    private String universityName;

    private Student(Builder builder) throws Exception { // CREATED A private CONSTRUCTOR SO NO ONE CAN ACCESS TO DIRECTLY STUDENT CONSTRUCTOR
        // HERE I CAN DO THE VALIDATION
        if(builder.phoneNo.length() != 10) throw new Exception();
        if(builder.age < 19) throw new Exception();
        this.name = builder.name;
        this.id = builder.id;
        this.age = builder.age;
        this.phoneNo = builder.phoneNo;
        this.universityName = builder.universityName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", phoneNo='" + phoneNo + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }

    /* CREATE A STATIC NESTED CLASS NAME BUILDER */
    static class Builder{
        /* NOW COPY THE SAME ATTRIBUTES THAT ARE THERE IN STUDENT CLASS */
        private String name;
        private int id;
        private int age;
        private String phoneNo;
        private String universityName;

        /* CREATE A STATIC METHOD THAT CAN GIVE THE BUILDER OBJECT */
        public static Builder getBuilder(){
            return new Builder();
        }

        /* CREATE BUILDER RETURN TYPE SETTER METHOD */
        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPhoneNo(String phoneNo){
            this.phoneNo = phoneNo;
            return this;
        }

        public Builder setUniversityName(String universityName){
            this.universityName = universityName;
            return this;
        }

        /*AFTER THIS CREATE A BUILD METHOD THAT WILL RETURN THE STUDENT OBJECT */
        public Student build() throws Exception {
            return new Student(this);
        }
    }
}
