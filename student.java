// Абстрактный класс Student
abstract class Student {
    private String fullName;
    private int course;
    private double lastExamGrade;

    public Student(String fullName, int course, double lastExamGrade) {
        this.fullName = fullName;
        this.course = course;
        this.lastExamGrade = lastExamGrade;
    }

    public abstract void writeExam();

    public String getFullName() {
        return fullName;
    }

    public int getCourse() {
        return course;
    }

    public double getLastExamGrade() {
        return lastExamGrade;
    }
}

// Класс IUStudent
class IUStudent extends Student {
    public IUStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println(getFullName() + " (IU Student) пишет экзамен.");
    }
}

// Класс MathStudent
class MathStudent extends Student {
    public MathStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println(getFullName() + " (Math Student) пишет экзамен.");
    }
}

// Тестирование
public class Main {
    public static void main(String[] args) {
        Student student1 = new IUStudent("Иванов Иван Иванович", 2, 4.5);
        Student student2 = new MathStudent("Петров Петр Петрович", 3, 5.0);

        student1.writeExam();
        student2.writeExam();
    }
}
