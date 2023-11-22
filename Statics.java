public class Statics {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        student.Name="Mahi";
        System.out.println("Your Percentage "+student.percentage(90,85,58)+"%");
        student.Schoolname="Ideal International High school";
        System.out.println(student.Name);
        System.out.println(student.Schoolname);
        System.out.println(student1.Schoolname);
    }
}

/**
 * a
 */
  class Student {
    String Name;
    int roll;
    static String Schoolname;
    void getname(String name){
        this.Name=name;
    }
    String setname(){
        return this.Name;
    }
    static int percentage(int math,int english ,int hindi){
        int Percentage=(math+english+hindi)/3;
        return Percentage;
    }
}