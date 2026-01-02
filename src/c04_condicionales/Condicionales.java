package c04_condicionales;

public class Condicionales {
    public static void main(String[] args) {
        //Condicionales if-else
//if-else simple se usa para tomar decisiones basadas en una condición booleana
//if else if-else     if-else anidado se usa para evaluar múltiples condiciones

        var age = 45;
        if (age > 18) {//si se cumple la condicion
            System.out.println("Eres mayor de edad");
        } else if (age == 18) { //si no se cumple la condicion anterior pero se cumple esta
            System.out.println("Acaba de cumplir 18 años");
        } else {//si no se cumple ninguna de las condiciones anteriores
            System.out.println("Eres menor de edad");
        }


        //Condicional switch
        //switch se usa para seleccionar una de muchas opciones basadas en el valor de una variable

        var day = 1;//variable que representa el día de la semana
        switch (day) {//inicio del switch
            case 1:
                System.out.println("Lunes");
                break;// rompe el switch
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7://si day es igual a 7
                System.out.println("Domingo");
                break;
            default://si no se cumple ninguna de las condiciones anteriores
                System.out.println("Día no válido");
        }


    }
}

