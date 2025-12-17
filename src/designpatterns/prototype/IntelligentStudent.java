package designpatterns.prototype;

public class IntelligentStudent extends Student{
    int iq;

    public IntelligentStudent(){}
    public  IntelligentStudent(IntelligentStudent student){
//        this.setName(student.getName());
//        this.setAge(student.getAge());
//        this.setBatch(student.getBatch()); In case getteres are private in parent class[here Student]
            super(student);//aprent cosntructor
        this.iq = student.iq;
    }

    @Override
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
