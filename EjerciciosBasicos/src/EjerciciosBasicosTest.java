import org.junit.Test;

import static org.junit.Assert.*;
public class EjerciciosBasicosTest {
    //instanciar la clase
    EjerciciosBasicos ejerciciosBasicos = new EjerciciosBasicos();

    //hacer test de los metodos más importantes a comprobar
    @Test
    public void getX() {
        assertEquals(144, ejerciciosBasicos.getX());
    }

    @Test
    public void suma() {
        assertEquals(144+999, ejerciciosBasicos.suma(),1143);
    }

    @Test
    public void multiplicacion() {
        assertEquals(144*999, ejerciciosBasicos.multiplicacion(),143856);
    }

    @Test
    public void getNombre() {
        assertEquals("Marta Sánchez Lubián", ejerciciosBasicos.getNombre(), "Marta Sánchez Lubián");
    }

    @Test
    public void eurosAPesetas() {
        assertEquals("10.0 euros son 1663.86 pesetas.", ejerciciosBasicos.getPesetas(10.0),
                "10.0 euros son 1663.86 pesetas.");
    }

    @Test
    public void pesetasAEuro() {
        assertEquals("3600.0 pesetas son 5.760000000000001 euros. ", ejerciciosBasicos.getEuros(3600.0),"3600.0 pesetas son 5.760000000000001 euros. ");
    }

    @Test
    public void facturaSinIVA() {
        assertEquals("Sin IVA se queda en: 3950.0", ejerciciosBasicos.facturaSinIVA(5000.0), "Sin IVA se queda en: 3950.0");
    }
}