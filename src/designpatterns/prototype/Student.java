package designpatterns.prototype;

public class Student implements ProtoType<Student>{
    private String name;
    private int age;
    private String batch;
    private double avgBatchPsp;
    private double psp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public Student(Student st) {
        st.name = this.name;
        st.age = this.age;
        st.batch = this.batch;
        st.avgBatchPsp = this.avgBatchPsp;
        st.psp = this.psp;
    }

    public Student(){}
    //creating default constructor bcz copy constructor has been created ,hence default constructor will not be created by default
    @Override
    public Student clone(){
        return new Student(this);
    }
}
