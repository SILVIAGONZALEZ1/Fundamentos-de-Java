package c08_oop;

public class Student {
    // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
    // 9. Crea una clase Student con el atributo privado grade.
// Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.

    //Atributo
    //private int score;
    private int grade; //grade = calificacion

    //Constructor
    public Student(int grade) {
        this.grade = grade;
    }

    //Setter
    public void setGrade(int grade) {
        this.grade = grade;
    }

//    //Metodo
//    public void rendir() {
//        if (score >= 60) {
//            System.out.println("aprobo");
//        } else {
//            System.out.println("no aprobo");
//        }
//    }

    //Metodo isPassed()
    public boolean isPassed() {
        if (grade >= 60) {
            return true;
        } else{
            return false;
        }
    }

}
