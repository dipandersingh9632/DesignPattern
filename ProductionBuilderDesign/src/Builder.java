 /*  OLD CODE
 public class Builder {
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
        if(getGradYear() > 2022) throw  new IllegalArgumentException("grad Year is not correct");
        if(getGradYear() - getAge() > 1996) throw new IllegalArgumentException("not correct");
        if(getPhoneNo().length() != 10) throw new IllegalArgumentException("phn is not correct");
        return new Student(this);
    }
}
*/