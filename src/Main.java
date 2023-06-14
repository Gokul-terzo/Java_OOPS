public class Main { //here public is the access specifier for the class
    //data members
    String nameOfStudent;
    int age;
    long number;

    //constructor for the class
    public Main(String name,int age,long number){
        nameOfStudent=name;
        this.age=age; //this is used to specify that the age is the member of the class
        this.number=number;
    }

    //member functions
    public void getStudentDetails(){
        System.out.println("The name of the student is:"+nameOfStudent+",age is:"+age+"and contact is:"+number);
    }
    public static void main(String args[]){
        Main student1=new Main("Gokul",20,9047659730L);
        student1.getStudentDetails();
    }
}
