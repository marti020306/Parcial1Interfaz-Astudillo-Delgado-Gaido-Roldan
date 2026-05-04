public abstract class PersonaAcademica 
{ 
    private String nombre;
    private String legajo;

    public PersonaAcademica(String nombre, String legajo) 
    {
        setNombre(nombre);
        setLegajo(legajo);

        public String getNombre() 
        {
            return nombre;
        }

        public void setNombre(String nombre)
        {
            if (nombre == null || nombre.isEmpty()) 
            {
                throw new IllegalArgumentException("Nombre invalido");
            }
            this.nombre = nombre;

        public String getLegajo()
        {
            return legajo;
        }

        public void setLegajo(String legajo)
        {
            if (legajo == null)
            {
                throw new IllegalArgumentException("Legajo invalido");
            }

            this.legajo = legajo;
        }



    }
}