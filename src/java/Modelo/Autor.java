package Modelo;

public class Autor {
    private int idautor;
    private String nombre;
    private String f_LibrosEscritos;
    private String f_MejorLibro;
    private String f_Estudios;
    private String f_nacimiento;

    public Autor(int idautor, String nombre, String f_LibrosEscritos, String f_MejorLibro, String f_Estudios) {
        this.idautor = idautor;
        this.nombre = nombre;
        this.f_LibrosEscritos = f_LibrosEscritos;
        this.f_MejorLibro = f_MejorLibro;
        this.f_Estudios = f_Estudios;
    }

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getF_LibrosEscritos() {
        return f_LibrosEscritos;
    }

    public void setF_LibrosEscritos(String f_LibrosEscritos) {
        this.f_LibrosEscritos = f_LibrosEscritos;
    }

    public String getF_MejorLibro() {
        return f_MejorLibro;
    }

    public void setF_MejorLibro(String f_MejorLibro) {
        this.f_MejorLibro = f_MejorLibro;
    }

    public String getF_Estudios() {
        return f_Estudios;
    }

    public void setF_Estudios(String f_Estudios) {
        this.f_Estudios = f_Estudios;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    
}
