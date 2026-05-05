public interface Evaluable 
{
    String getCondicion();
     double getPromedio()
     boolean estaAprobado();
     
     default void mostrarEstadoAcedemico() 
     {
         System.out.println("Condicion: " + getCondicion());
         System.out.println("Promedio: " + getPromedio());
         System.out.println("Aprobado: " + estaAprobado());
     }
}