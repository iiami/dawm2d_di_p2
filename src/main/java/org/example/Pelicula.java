package org.example;

public class Pelicula {
    private Long id;
    private String titulo;
    private String plataforma;
    private String estado;
    private String genero;
    private String valoracion;

    public Pelicula() {}

    public Pelicula(Long id, String titulo, String plataforma, String estado, String genero, String valoracion) {
        this.id = id;
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.estado = estado;
        this.genero = genero;
        this.valoracion = valoracion;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public String getValoracion() { return valoracion; }
    public void setValoracion(String valoracion) { this.valoracion = valoracion; }
}
