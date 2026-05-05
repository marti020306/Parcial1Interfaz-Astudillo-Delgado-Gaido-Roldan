import java.util.ArrayList;

public class InscripcionMateria implements Evaluable //implemets averigurar
{

    private Materia materia;
    private int totalClases;
    private int clasesAsistidas;
    private ArrayList<Double> notas;

    private static final int MAX_NOTAS = 5;
    private static final double MINIMO_REGULAR = 75.0;

    public InscripcionMateria(Materia materia) 
    {
        this.materia = materia;
        this.totalClases = 0;
        this.clasesAsistidas = 0;
        this.notas = new ArrayList<Double>();
    }

    public Materia getMateria()
    {
        return materia;
    }

    public void registrarAsistencia (boolean presente)
    {
        totalClases++;
        if (presente)
        {
            clasesAsistidas++;
        }
    }

    public void agregarNota(boolean presente)
    {
        totalClases++;
        if (presente)
        {
            clasesAsistidas++;
        }

    }
}