package c02_operadores;

public class OperadoresAritmeticos {
    //Operadores Aritméticos
    public static void main(String[] args) {
        var a = 5;
        var b = 3;
        System.out.println("Suma: " + (a + b)); // Suma
        System.out.println("Resta: " + (a - b)); // Resta
        System.out.println("Multiplicación: " + (a * b)); // Multiplicación
        System.out.println("División: " + (a / b)); // División
        System.out.println("Módulo: " + (a % b)); // Módulo es lo que sobra de una división

    //Operadores de asignacion
        a = b;
        System.out.println(a);

        a = b*2;
        System.out.println(a);

        a+=1; //a = a + 1
        System.out.println(a);
        a-=1; //a = a - 1
        System.out.println(a);
        a*=3; //a = a * 3
        System.out.println(a);
        a/=3; //a = a / 3
        System.out.println(a);
        a%=2; //a = a % 2
        System.out.println(a);

    //Operadores de Comparacion (devuelven un valor booleano)(Relacionales)
        System.out.println("a es igual a b: " + (a == b));
        System.out.println(a == 0);//true o false
        System.out.println("a es diferente a b: " + (a != b));
        System.out.println("a es mayor que b: " + (a > b));
        System.out.println("a es menor que b: " + (a < b));
        System.out.println("a es mayor o igual que b: " + (a >= b));
        System.out.println("a es menor o igual que b: " + (a <= b));

    //Operadores Logicos
        //Y (AND)
        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false
        //O (OR)
        System.out.println(true || true); //true
        System.out.println(true || false); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false
        //NO (NOT)
        System.out.println(!true); //false
        System.out.println(!false); //true


        var x = 5;
        var y = 10;
        System.out.println((x < 10) && (y > 5)); //AND
        System.out.println((x < 10) || (y > 15)); //OR
        System.out.println(!(x < 10)); //NOT

    //Operadores unarios
        System.out.println(+b);//unario mas, no tiene mayor efecto en los números positivos
        System.out.println(-b);//unario menos, cambia el signo del número
        System.out.println(++b);//incremento , lo va a incrementar antes de imprimirlo
        System.out.println(b++);//incremento , lo va a incrementar después de imprimirlo
        System.out.println(b);//valor después del incremento, ya que en la línea anterior se incrementó
        System.out.println(--b);//decremento , lo va a decrementar antes de imprimirlo
        System.out.println(b--);//decremento , lo va a decrementar después de imprimirlo
        System.out.println(b);//valor después del decremento, ya que en la línea anterior se decrementó




    }
}