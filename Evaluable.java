public interface Evaluable 
{ 
    String getCondicion();
    double getpromedio();
    boolean esAprobado();
}

default void MostrarEstadoAcademico()
{
    System.out.println("Condicion: " + getCondicion());
    System.out.println("promedio: " + getpromedio());
}




