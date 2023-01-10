public class Student {
    String name;
    int id;
    int age;
    String phoneNo;
    String universityName;
    int gradYear;
    double psp;

    public Student(Builder b){
        this.name = b.getName();
        this.age = b.getAge();
        this.id = b.getId();
        this.psp = b.getPsp();
        this.phoneNo = b.getPhoneNo();
        this.gradYear = b.getGradYear();
        this.universityName = b.getUniversityName();
    }

    public static Builder getBuilder(){
        return new Builder();
    }


    public void print() {
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", phoneNo='" + phoneNo + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                '}');
    }

    public static class Builder {
        private String name;
        private int id;
        private int age;
        private String phoneNo;
        private String universityName;
        private int gradYear;
        private double psp;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getId() {
            return id;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public Builder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Student build() {
            // NOw do your validations
            if (getGradYear() > 2022) throw new IllegalArgumentException("grad Year is not correct");
            if (getGradYear() - getAge() > 1996) throw new IllegalArgumentException("not correct");
            if (getPhoneNo().length() != 10) throw new IllegalArgumentException("phn is not correct");
            return new Student(this);
        }
    }
}
