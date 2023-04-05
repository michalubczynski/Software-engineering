package com.example.kwiaciarnia.api;

import com.example.kwiaciarnia.dao.Encje.Kwiat;
import com.example.kwiaciarnia.service.KwiaciarniaManager;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/kwiaciarniaapi")
public class KwiatApi {
    KwiaciarniaManager kwiaciarniaManager;

    public KwiatApi(KwiaciarniaManager kwiaciarniaManager) {
        this.kwiaciarniaManager = kwiaciarniaManager;
    }

    @GetMapping("/kwiaty")
    public Iterable<Kwiat> getKwiatyList(){
        return kwiaciarniaManager.findAll();
    }
    @GetMapping("/kwiaty/by-id")
    public Optional<Kwiat> getKwiatById(@RequestParam Long id){ // or @RequestParam("id") //http://localhost:8080/kwiaciarniaapi/kwiaty/by-id?id=1
        return kwiaciarniaManager.findById(id);
    }
    @PostMapping("/kwiaty")
    public boolean addKwiat(@RequestBody Kwiat kwiat){
        try {
            kwiaciarniaManager.addKwiat(kwiat);
            return  true;
        }catch (Exception e) {return  false;}
    }
    @PutMapping("/kwiaty/{id}")
    public boolean updateKwiatById(@PathVariable Long id, @RequestBody Kwiat updatedKwiat){
    Optional<Kwiat> kwiat = kwiaciarniaManager.findById(id);
    if(kwiat.isPresent()){
        Kwiat actKwiat = kwiat.get();
        actKwiat.setNazwa(updatedKwiat.getNazwa());
        actKwiat.setRokOdkrycia(updatedKwiat.getRokOdkrycia());
        return true;
    }
    else return false;
    }
    @DeleteMapping("/kwiaty/{id}")
    public boolean deleteKwiatById(@PathVariable Long id){
        Optional<Kwiat> kwiat = kwiaciarniaManager.findById(id);
        if(kwiat.isPresent()){
            try{
                kwiaciarniaManager.deleteById(id);
                return true;
            }catch (Exception e) {return false;}
        }else return false;
    }
}
