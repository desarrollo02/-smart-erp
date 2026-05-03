package com.erp.competencia.web;

import com.erp.competencia.domain.Competidor;
import com.erp.competencia.service.CompetidorService;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

@Named
@RequestScoped
public class CompetidorBean {

    private String nombre;
    private String rubro;
    private String ciudad;
    private String direccion;

    private List<Competidor> competidores;

    @Inject
    private CompetidorService competidorService;

    @PostConstruct
    public void init() {
        competidores = competidorService.listarCompetidores();
    }

    public String guardar() {
        competidorService.registrarCompetidor(nombre, rubro, ciudad, direccion);
        return "competidores?faces-redirect=true";
    }

    public List<Competidor> getCompetidores() {
        return competidores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}