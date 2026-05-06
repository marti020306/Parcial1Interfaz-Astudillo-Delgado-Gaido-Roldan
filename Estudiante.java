import java.util.ArrayList;
import java.util.Scanner;
package academico;
public class Estudiante extends PersonaAcademica implements Consultable
{
    private String carrera;
    private int anioIngreso;
    private ArrayList<InscripcionMateria>materias;
}

public Estudiante(String nombre, String legajo, String carrera, int anioIngreso)
{
    super(nombre,legajo);
    setCarrera(carrera);
    setAnioIngreso(anioIngreso);
    this.materias = new ArrayList<>();
}
public String getCarrera()
{
    return carrera;
}
public void setCarrera(String carrera)
{
    if (carrera == null || carrera.isEmpty())
    {
        throw new IllegalArgumentException("Carrera invalida");
    }
    this.carrera=carrera;
}
    