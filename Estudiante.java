import java.util.ArrayList;
import java.util.Scanner;
package academico;
public class Estudiante extends PersonaAcademica implements Consultable
{
    private String carrera;
    private int anioIngreso;
    private ArrayList<InscripcionMateria>materias;


    public Estudiante(String nombre, String legajo, String carrera, int anioIngreso)
    {
        super(nombre,legajo);
        setCarrera(carrera);
        setAnioIngreso(anioIngreso);
        this.materias = new ArrayList<>();
    }
    //Carrera
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

    //Año ingreso
    public int getAnioIngreso()
    {
        return anioIngreso;
    }
    public void setAnioIngreso(int anioIngreso)
    {
        if (anioIngreso<2000)
        {
            throw new IllegalArgumentException("Año de ingreso invalido");
        }
        this.anioIngreso=anioIngreso;
    }

    //Materias/Inscripcion/Dar de baja
    public ArrayList<InscripcionMateria>getMaterias()
    {
        return materias;
    }
    public void inscribirse(Materia m)
    {
        if (getInscripcion(m.getCodigo())!=null)
        {
            throw new IllegalArgumentException("Ya esta inscripto en esa materia")
        }
        materias.add(new InscripcionMateria(m));
    }
    public void darDeBaja(String codigoMateria)
    {
        materias.removeIf(i->i.getMateria().getCodigo().equalsIgnoreCase(codigoMateria))
    }
    public InscripcionMateria getInscripcion(String codigoMateria)
    {
        for (InscripcionMateria i : materias)
        {
            if (i.getMateria().getCodigo().equalsIgnoreCase(codigoMateria))
            {
                return i;
            }
        }
        return null;
    }

    //Promedio general
    public double getPromedioGeneral()
    {
        if (materias.isEmpty())
        {
            return o;
        }
        double suma=0;
        for (InscripcionMateria i : materias)
        {
            suma=suma+i.getPromedio();
        }
        return suma/materias.size();
    }  

    //Asistencia en materias criticas
    public ArrayList<InscripcionMateria>getMateriasCriticas();
    {
        ArrayList<InscripcionMateria>criticas=new ArrayList<>();
        for(InscripcionMateria i : materias)
        {
            double p=i.getPorcentajeAsistencia();
            if(p>=75 && <=85)
            {
                criticas.add(i);
            }
        }
        return criticas;
    }

    //Mostrar resumen(Datos del estudiante)
    @Override
    public void MostrarResumen()
    {
        System.out.println("=== Perfil del estudiante ===")
        System.out.println("Nombre: "+getNombre());
        System.out.println("Legajo: "+getLegajo());
        System.out.println("Carrera: "carrera);
        System.out.println("Ingreso: "+anioIngreso);
        System.out.println("Materias inscriptas: "+materias.size());
    }
}


