package withChildClass;

public class IntelligentStudent extends Student implements Prototype<IntelligentStudent>{
    private int iq;

    public IntelligentStudent() {}

    public IntelligentStudent(IntelligentStudent is){
        super(is);
        this.iq = is.iq;
    }

    @Override
    public IntelligentStudent copy() {
        IntelligentStudent is = new IntelligentStudent(this);
        return is;
    }

    @Override
    public void print() {
        System.out.println("IntelligentStudent{" +
                "iq=" + iq +
                '}');
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
