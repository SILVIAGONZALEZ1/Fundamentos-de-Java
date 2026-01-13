package c08_oop;

public class Student {
    // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
    //Atributo
    int score;

    //Metodo
    public void rendir(){
       if (score >=60){
            System.out.println("aprobo");
        }else {
           System.out.println("no aprobo");
       }
    }
}
