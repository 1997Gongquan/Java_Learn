package 反射;

public class Student {
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    public int age;
    private String name;
    private String num;
    public Student(int num){

    }

    public Student(){

    }

    public void test(int num){
        age=num;
    }
}
