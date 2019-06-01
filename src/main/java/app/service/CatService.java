package app.service;

import app.model.Cat;
import app.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {

    @Autowired
    private CatRepository catRepository;


    public List<Cat> getAllCats() {
        return catRepository.findAll();
    }
}
