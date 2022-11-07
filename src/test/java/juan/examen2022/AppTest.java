package juan.examen2022;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Vector;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    public void asignaturaVacia() {
    	Matricula mat = new Matricula(null);
    	assertThrows(Exception.class, () ->
			mat.getImporte());
    }
    
    @Test
    public void importUnit() {
    	Vector<Asignatura> asignaturas = new Vector<Asignatura>();
    	
		Asignatura a = mock(Asignatura.class);
		Asignatura b = mock(Asignatura.class);
		Asignatura c = mock(Asignatura.class);
		
		when(a.getImporte()).thenReturn(50.00);
		when(b.getImporte()).thenReturn(150.00);
		when(c.getImporte()).thenReturn(660.00);
		
		asignaturas.add(a);
		asignaturas.add(b);
		asignaturas.add(c);
		
		Matricula mat = new Matricula(asignaturas);
		try {
			assertEquals(860.00,mat.getImporte());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
}
