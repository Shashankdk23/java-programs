import java.util.Scanner;

abstract class students {
    int[] testScores = new int[4];
    String testResult;
    String studentName;
    Scanner s = new Scanner(System.in);

    abstract void generateResults();

    students(String name) {
        studentName = name;
    }

    void setTestScores() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter test scores " + (i + 1));
            testScores[i] = s.nextInt();
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public int getTestScores() {
        int sum = 0;
        for (int i : testScores) {
            sum += i;
        }
        return sum;
    }

}

class undergraduateStudent extends students {
    undergraduateStudent(String name) {
        super(name);
    }

    void generateResults() {
        String st;
        if (getTestScores() / 4 >= 60) {
            st = "pass";
        } else {
            st = "fail";
        }
        testResult = "student name: " + studentName + "\n test result: " + st;
        System.out.println(testResult);
    }
}

class graduateStudent extends students {
    graduateStudent(String name) {
        super(name);
    }

    void generateResults() {
        String st;
        if (getTestScores() / 4 >= 70) {
            st = "pass";
        } else {
            st = "fail";
        }
        testResult = "student name: " + studentName + "\n test result: " + st;
        System.out.println(testResult);
    }
}

public class anchor {
    public static void main(String[] args) {
        System.out.println("enter 1  for undergraduateStudent or 2 for graduateStudent");
        Scanner st = new Scanner(System.in);
        int i = st.nextInt();
        st.nextLine();
        System.out.println("enter ur name");
        if (i == 1) {
        undergraduateStudent u = new undergraduateStudent(st.nextLine());
                u.setTestScores();
                u.generateResults();
        }
        else if (i == 2) {
                graduateStudent g = new graduateStudent(st.nextLine());
                g.setTestScores();
                g.generateResults();
        }else{
            System.out.println("Invalid input");
        }
        st.close();
    }
}