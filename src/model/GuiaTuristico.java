package model;

/** Modela a un guia turistico asociado a Llanquihue Tour. */
public class GuiaTuristico {
    private String rut;
    private String nombre;
    private String especialidad;
    private int experiencia;
    private Direccion direccion;

    public GuiaTuristico() {
        this.rut = "";
        this.nombre = "";
        this.especialidad = "";
        this.experiencia = 0;
        this.direccion = new Direccion();
    }


    public GuiaTuristico(String rut, String nombre, String especialidad,
                        int experiencia, Direccion direccion) {
        setRut(rut);
        setNombre(nombre);
        setEspecialidad(especialidad);
        setExperiencia(experiencia);
        setDireccion(direccion);
    }

    public String getRut() { return rut; }
    public void setRut(String rut) {
        if (rut == null || rut.trim().isEmpty()) throw new IllegalArgumentException("El RUT no puede estar vacio.");
        this.rut = rut.trim();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) throw new IllegalArgumentException("El nombre no puede estar vacio.");
        this.nombre = nombre.trim();
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) {
        if (especialidad == null || especialidad.trim().isEmpty()) throw new IllegalArgumentException("La especialidad no puede estar vacia.");
        this.especialidad = especialidad.trim();
    }

    public int getExperiencia() { return experiencia; }
    public void setExperiencia(int experiencia) {
        if (experiencia < 0) throw new IllegalArgumentException("La experiencia no puede ser negativa.");
        this.experiencia = experiencia;
    }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) {
        if (direccion == null) throw new IllegalArgumentException("La direccion es obligatoria.");
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "RUT: " + rut + " | Nombre: " + nombre + " | Especialidad: " + especialidad
                + " | Exp: " + experiencia + " anios | Direccion: " + direccion;
    }
}
