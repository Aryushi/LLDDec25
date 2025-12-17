package designpatterns.prototype;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry){
        Student mar24LLDEvePrototype = new Student();
        mar24LLDEvePrototype.setBatch("Mar24Eve");
        mar24LLDEvePrototype.setAvgBatchPsp(80.0);
        studentRegistry.register("Mar24Eve", mar24LLDEvePrototype);

        Student feb24LLDEvePrototype = new Student();
        feb24LLDEvePrototype.setBatch("feb24Eve");
        feb24LLDEvePrototype.setAvgBatchPsp(75.0);
        studentRegistry.register("feb24Eve",feb24LLDEvePrototype);

        IntelligentStudent mar24LLDEveISPrototype = new IntelligentStudent();
        mar24LLDEveISPrototype.setBatch("Mar24Eve");
        mar24LLDEveISPrototype.setAvgBatchPsp(80.0);
        mar24LLDEveISPrototype.iq = 100;
        studentRegistry.register("Mar24EveIS",mar24LLDEveISPrototype);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student shivam = studentRegistry.get("Mar24Eve").clone();
        shivam.setName("shivam");
        shivam.setAge(25);
        shivam.setPsp(98.0);

        Student abhijeet = studentRegistry.get("Mar24EveIS");

        System.out.println("DEBUG");
    }
}
