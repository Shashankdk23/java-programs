import java.util.Scanner;

class exception extends Exception{
    public String toString(){
        return "age can't be -ve";
    }
}
class exception2 extends Exception{
    public String toString(){
        return "son age can't be more than father";
    }
}
class father1 {
    public int age;
    public void setAge(int age) throws exception {
        this.age = age;
        if (age<0) {
            throw new exception();
        }
    }
    public int getAge() {
        return age;
    }
}
class Son extends father1{
    public int age;
    public void setAge2(int age) throws exception2,exception {
        this.age = age;
        if (age<0) {
            throw new exception();
        }
        if (age>super.getAge()) {
            throw new exception2();
        }
    }
}
public class exp {
    public static void main(String[] args) {
        Son s=new Son();
        Scanner sc= new Scanner(System.in);
        System.out.print("enter father age: " );
        int age=sc.nextInt();
        try {
            s.setAge(age);
        } catch (exception e) {
            System.out.println(e);  
        }
        System.out.print("enter son age: " );
        int age2=sc.nextInt();
        try {
            s.setAge2(age2);
        } catch (exception e) {
            System.out.println(e);
        }catch(exception2 e){
            System.out.println(e);
        }
        sc.close();
    }
}
