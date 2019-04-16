package org.umssdiplo.automationv01.core.utils;

public final class Articulo {

    private String nombre;
    private String marca;
    private String modelo;
    private String capacidad;
    private String precio;
    private String descripcion;

    public Articulo(String nombre, String marca, String modelo, String capacidad, String precio, String descripcion) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Articulo() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public String getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
