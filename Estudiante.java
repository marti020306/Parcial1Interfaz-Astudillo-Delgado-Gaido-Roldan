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

    