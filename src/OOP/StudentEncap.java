package OOP;

public class StudentEncap {
    //Atributo
    private String student;
    private int grade;

    //
    public StudentEncap(String student) {
        this.student=student;
        this.grade=0;
    }

    //metodo
    public void setGrade(int grade) {
        if (grade >=0 && grade<=100) {
            this.grade= grade;
        } else {
            System.out.println("ingrese nota entre 0 y 100");
        }

    }
    public boolean isPassed() {
        return grade >= 60;
    }
    public String getStuden() {
        return student;
    }
    public int getGrade() {
        return grade;
    }

}
