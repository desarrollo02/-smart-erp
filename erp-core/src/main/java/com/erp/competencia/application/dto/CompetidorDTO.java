package com.erp.competencia.application.dto;

public class CompetidorDTO {

    private Long id;
    private String nombre;
    private String rubro;
    private String ciudad;

    public CompetidorDTO(Long id, String nombre, String rubro, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.rubro = rubro;
        this.ciudad = ciudad;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRubro() {
        return rubro;
    }

    public String getCiudad() {
        return ciudad;
    }
}