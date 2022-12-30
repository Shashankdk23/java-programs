import java.util.Scanner;

interface students {
    Scanner s = new Scanner(System.in);
    void generateResults();   
    void setTestScores();
    void setStudentName();
    String getStudentName();
    int getTestScores();
}

class undergraduateStudent implements students {
    int[] testScores = new int[4];
    String testResult;
    String studentName;
    public void generateResults() {
        String st;
        if (getTestScores() / 4 >= 60) {
            st = "pass";
        } else {
            st = "fail";
        }
        testResult = "student name: " + studentName + "\ntest result: " + st;
        System.out.println(testResult);
    }
    public int getTestScores() {
        int sum = 0;
        for (int i : testScores) {
            sum += i;
        }
        return sum;
    }
    public void setTestScores() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter test scores " + (i + 1));
            testScores[i] = s.nextInt();
        }
    }
    public void setStudentName(){
        studentName=s.nextLine();
    }
    public String getStudentName(){
        return studentName;
    }
}

class graduateStudent implements students {
    int[] testScores = new int[4];
    String testResult;
    String studentName;

    public void generateResults() {
        String st;
        if (getTestScores() / 4 >= 70) {
            st = "pass";
        } else {
            st = "fail";
        }
        testResult = "student name: " + studentName + "\ntest result: " + st;
        System.out.println(testResult);
    }
    public int getTestScores() {
        int sum = 0;
        for (int i : testScores) {
            sum += i;
        }
        return sum;
    }
    public void setTestScores() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter test scores " + (i + 1));
            testScores[i] = s.nextInt();
        }
    }
    public void setStudentName(){
        studentName=s.nextLine();
    }
    public String getStudentName(){
        return studentName;
    }
}

public class anchors1 {
    public static void main(String[] args) {
        System.out.println("enter 1 for undergraduateStudent or 2 for graduateStudent");
        Scanner st = new Scanner(System.in);
        int i = st.nextInt();
        if (i == 1) {
            undergraduateStudent u = new undergraduateStudent();
            System.out.println("enter ur name");
            u.setStudentName();
            u.setTestScores();
            u.generateResults();
        } else if (i == 2) {
            graduateStudent g = new graduateStudent();
            System.out.println("enter ur name");
            g.setStudentName();
            g.setTestScores();
            g.generateResults();
        } else {
            System.out.println("Invalid input");
        }
        st.close();
    }
}
