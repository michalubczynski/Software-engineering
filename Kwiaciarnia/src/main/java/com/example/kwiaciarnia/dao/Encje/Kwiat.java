package com.example.kwiaciarnia.dao.Encje;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
@Entity
public class Kwiat {
    public Kwiat(Long id, String nazwa, LocalDateTime rokOdkrycia) {
        this.id = id;
        this.nazwa = nazwa;
        this.rokOdkrycia = rokOdkrycia;
    }
    public Kwiat() {}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public LocalDateTime getRokOdkrycia() {
        return rokOdkrycia;
    }
    public void setRokOdkrycia(LocalDateTime rokOdkrycia) {
        this.rokOdkrycia = rokOdkrycia;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nazwa;
    private LocalDateTime rokOdkrycia;

}
