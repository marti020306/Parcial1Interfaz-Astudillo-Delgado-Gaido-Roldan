public class Materia 
{

    private String nombre;
    private String codigo;
    private int cuatrimestre;
    private int anio;

    public Materia(String nombre, String codigo, int cuatrimestre, int anio) 
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cuatrimestre = cuatrimestre;
        this.anio = anio;
    }
    public String getNombre() 
    {
        return nombre;
    }
    public String getCodigo() 
    {
        return codigo;
    }
    public int getCuatrimestre() 
    {
        return cuatrimestre;
    }
    public int getAnio() 
    {
        return anio;
    }
}