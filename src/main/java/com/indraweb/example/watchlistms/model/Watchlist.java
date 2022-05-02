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

    @Column(name = "id_user")
    private Long id_user;

    @Column(name = "name_watchlist")
    private String name_watchlist;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    public Watchlist(Long id_watchlist, Long id_user, String name_watchlist, Date createdAt) {
        this.id_watchlist = id_watchlist;
        this.id_user = id_user;
        this.name_watchlist = name_watchlist;
        this.createdAt = createdAt;
    }

    public Watchlist() {
    }

    public Long getId_watchlist() {
        return id_watchlist;
    }

    public void setId_watchlist(Long id_watchlist) {
        this.id_watchlist = id_watchlist;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getName_watchlist() {
        return name_watchlist;
    }

    public void setName_watchlist(String name_watchlist) {
        this.name_watchlist = name_watchlist;
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
