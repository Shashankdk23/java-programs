import java.io.*;
import java.util.Scanner;
class student {
    String name;
    String USN;
    int noOfCourses;
    int credits[] = new int[10];
    int marks[] = new int[10];
    Scanner s = new Scanner(System.in);

    student() {
        noOfCourses = 0;
    }

    void setName(String s) {
        name = s;
    }

    void setUSN(String s) {
        USN = s;
    }

    void setCourses(int s) {
        noOfCourses = s;
    }

    void input() {
        for (int i = 0; i < noOfCourses; i++) {
            System.out.println("enter credit of course " + (i + 1));
            credits[i] = s.nextInt();
            System.out.println("enter marks of course " + (i + 1));
            marks[i] = s.nextInt();
        }
    }
    double returnSGPA(){
        double d=0,s=0;
        for (int i = 0; i < noOfCourses; i++) {
            d += credits[i] * marks[i];
            s+=credits[i];
        }
        return d/(s*10);
    }
}

public class sgpa {
    public static void main(String[] args) {
        student s = new student();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur name");
        String st = sc.nextLine();
        s.setName(st);
        System.out.println("enter USN");
        String sq = sc.nextLine();
        s.setUSN(sq);
        System.out.println("enter no of courses");
        int n = sc.nextInt();
        s.setCourses(n);
        s.input();
        double d=s.returnSGPA();
        System.out.println("sgpa of student is "+d);
        sc.close();
    }
}
