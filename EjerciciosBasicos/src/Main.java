
public class Main {

    public static void main(String[] args) {
        EjerciciosBasicos ejerciciosBasicos = new EjerciciosBasicos();

        System.out.println("ejercicio 1");
        System.out.println(ejerciciosBasicos.getX());
        System.out.println(ejerciciosBasicos.getY());
        System.out.println(ejerciciosBasicos.suma());
        System.out.println(ejerciciosBasicos.resta());
        System.out.println(ejerciciosBasicos.multiplicacion());
        System.out.println(ejerciciosBasicos.division());
        System.out.println("------------------");
        System.out.println("ejercicio 2");
        System.out.println(ejerciciosBasicos.getNombre());
        System.out.println("------------------");
        System.out.println("ejercicio 3");
        System.out.println(ejerciciosBasicos.getName());
        System.out.println(ejerciciosBasicos.getAddress());
        System.out.println(ejerciciosBasicos.getTelephone());
        System.out.println("------------------");
        System.out.println("ejercicio 4");
        System.out.println(ejerciciosBasicos.getPesetas(30.0));
        System.out.println("------------------");
        System.out.println("ejercicio 5");
        System.out.println(ejerciciosBasicos.getEuros(3600.0));
        System.out.println("------------------");
        System.out.println("ejercicio 6");
        System.out.println(ejerciciosBasicos.facturaSinIVA(5000.0));
        System.out.println("------------------");
    }
}