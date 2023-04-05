package com.example.kwiaciarnia.dao;

import com.example.kwiaciarnia.dao.Encje.Kwiat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKwiatyRepo extends CrudRepository<Kwiat, Long> {
}
