package com.example.demo.Service;

import com.example.demo.Entity.Cat;
import com.example.demo.Repository.CatRepository;
import com.example.demo.dto.CatDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatService {

    private final CatRepository catRepository;

    public Cat save (CatDto catDto) {
        Cat cat = new Cat()
                .setName(catDto.getName())
                .setBirthDay(catDto.getBirthday())
                .setId(UUID.randomUUID().toString())
                .setCreatedAt(LocalDateTime.now());
        return catRepository.save(cat);
        // new ch
    }

    public List<Cat>  getAll(){
        return catRepository.findAll();
    }
}
