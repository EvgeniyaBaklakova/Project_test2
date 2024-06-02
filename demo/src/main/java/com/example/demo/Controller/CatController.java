package com.example.demo.Controller;

import com.example.demo.Entity.Cat;
import com.example.demo.Service.CatService;
import com.example.demo.dto.CatDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cats")
public class CatController {

    private final CatService catService;

    @PostMapping
    public Cat save (@RequestBody CatDto catDto) {
        return catService.save(catDto);
    }

    @GetMapping
    public List<Cat> getAll() {
        return catService.getAll();
    }
}
