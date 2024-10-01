

public class EjerciciosBasicos {

    /*Ejercicio 1
    Escribe un programa en el que se declaren las variables enteras x e y. Asignales los valores 144 y
    999 respectivamente. A continuación, muestra por pantalla el valor de cada variable, la suma, la
    resta, la división y la multiplicación.*/

    int x = 144;
    int y = 999;

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public int suma() {
        return x+y;
    }

    public int resta(){
        return x-y;
    }

    public int multiplicacion(){
        return x*y;
    }

    public int division(){
        return x/y;
    }

    /*Ejercicio 2
    Crea la variable nombre y asígnale tu nombre completo. Muestra su valor por pantalla de tal
    forma que el resultado del programa sea el mismo que en el ejercicio 1 del capítulo 1. */

    String nombre = "Marta Sánchez Lubián";

    public String getNombre(){
        return nombre;
    }

    /*Ejercicio 3
    Crea las variables nombre, direccion y telefono y asígnale los valores corres- pondientes. Muestra
    los valores de esas variables por pantalla de tal forma que el resultado del programa sea el mismo
    que en el ejercicio 2.*/

    String name = "Marta";
    String addres = "c/ Mi casa";
    String telephone = "43252345";

    public String getTelephone(){
        return telephone;
    }
    public String getAddress(){
        return addres;
    }
    public String getName(){
        return name;
    }

    /*
    Ejercicio 4
    Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere convertir deberá estar
    almacenada en una variable.
     */
    Double pesetas = 166.386;

    public String getPesetas(Double euro){
        return (euro +" euros son " +euro*pesetas +" pesetas.");
    }

    /*Ejercicio 5
    Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere convertir deberá
    estar almacenada en una variable.*/
    Double euros = 0.0016;

    public String getEuros(Double peseta){
        return (peseta + " pesetas son " + peseta*euros + " euros. ");
    }

    /*Ejercicio 6
    Escribe un programa que calcule el total de una factura a partir de la base imponible (precio sin
    IVA). La base imponible estará almacenada en una variable*/

    public String facturaSinIVA(Double total){
        double sinIVA = total - (total*0.21);
        return ("Sin IVA se queda en: "+ sinIVA );
    }
}
