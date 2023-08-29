public class Person {
    private String name;
    private int age;
    private double gpa;

    public Person(String name, int age, double qpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void tinh(){
        double a = Math.sqrt(age);
    }
}
