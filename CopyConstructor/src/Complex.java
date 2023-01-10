public class Complex{
    int id;
    int marks;

    public Complex(int id, int marks){
        this.id = id;
        this.marks = marks;
    }

    public Complex(Complex c){
        this.id = c.id;
        this.marks = c.marks;
    }

    public void print(){
        System.out.println(id + "   " + marks);
    }
}