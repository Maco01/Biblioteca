package Modelo;

public class Editorial {
    private int ideditorial;
    private String nombre;
    private String estado;
    private int LibrosImpresos;
    private String Masvendido;
    private String f_AnoDeFundacion;

    public int getIdeditorial() {
        return ideditorial;
    }

    public void setIdeditorial(int ideditorial) {
        this.ideditorial = ideditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getLibrosImpresos() {
        return LibrosImpresos;
    }

    public void setLibrosImpresos(int LibrosImpresos) {
        this.LibrosImpresos = LibrosImpresos;
    }

    public String getMasvendido() {
        return Masvendido;
    }

    public void setMasvendido(String Masvendido) {
        this.Masvendido = Masvendido;
    }

    public String getF_AnoDeFundacion() {
        return f_AnoDeFundacion;
    }

    public void setF_AnoDeFundacion(String f_AnoDeFundacion) {
        this.f_AnoDeFundacion = f_AnoDeFundacion;
    }

    public Editorial(int ideditorial, String nombre, String estado, int LibrosImpresos, String Masvendido, String f_AnoDeFundacion) {
        this.ideditorial = ideditorial;
        this.nombre = nombre;
        this.estado = estado;
        this.LibrosImpresos = LibrosImpresos;
        this.Masvendido = Masvendido;
        this.f_AnoDeFundacion = f_AnoDeFundacion;
    }
}
