package com.example.kwiaciarnia.service;

import com.example.kwiaciarnia.dao.Encje.Kwiat;
import com.example.kwiaciarnia.dao.IKwiatyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class KwiaciarniaManager {
    private IKwiatyRepo iKwiatyRepo;
    @Autowired
    public KwiaciarniaManager(IKwiatyRepo iKwiatyRepo) {
        this.iKwiatyRepo = iKwiatyRepo;
    }
    public Optional<Kwiat> findById(Long id){
        return iKwiatyRepo.findById(id);
    }
    public Iterable<Kwiat> findAll() {
        return iKwiatyRepo.findAll();
    }
    public Kwiat addKwiat(Kwiat kwiat) {
        return iKwiatyRepo.save(kwiat);
    }
    public void deleteById(Long id) {
        iKwiatyRepo.deleteById(id);
    }
    public Kwiat save(Kwiat kwiat){
        return iKwiatyRepo.save(kwiat);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new Kwiat(1L, "Fikus", LocalDateTime.of(2000,12,8,0,0)));
        save(new Kwiat(2L, "Mikus", LocalDateTime.of(2000,12,8,0,0)));
        save(new Kwiat(3L, "Dikus", LocalDateTime.of(2000,12,8,0,0)));
    }
}
