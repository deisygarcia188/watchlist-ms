package com.indraweb.example.watchlistms.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tb_watchlist")
public class Watchlist implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_watchlist")
    private Long id_watchlist;

    @Column(name = "id_usuario")
    private int id_usuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "privacidad")
    private Boolean privacidad ;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    public Watchlist() {
    }

    public Watchlist(Long id_watchlist, int id_usuario, String nombre, String descripcion, Boolean privacidad, Date createdAt, Date updatedAt) {
        this.id_watchlist = id_watchlist;
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.privacidad = privacidad;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId_watchlist() {
        return id_watchlist;
    }

    public void setId_watchlist(Long id_watchlist) {
        this.id_watchlist = id_watchlist;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(Boolean privacidad) {
        this.privacidad = privacidad;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
