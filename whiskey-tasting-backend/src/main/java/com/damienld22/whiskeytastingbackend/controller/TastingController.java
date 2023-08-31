package com.damienld22.whiskeytastingbackend.controller;

import com.damienld22.whiskeytastingbackend.domain.Tasting;
import com.damienld22.whiskeytastingbackend.repository.TastingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping("/api/tastings")
public class TastingController {
    private final TastingRepository repository;

    public TastingController(TastingRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    public List<Tasting> getAll() {
        return repository.getAll();
    }

    @GetMapping("/{id}")
    public Tasting getOne(@PathVariable("id") UUID id) {
        return repository.getById(id);
    }

    @PostMapping()
    public Tasting create(@RequestBody Tasting tasting) {
        return repository.create(tasting);
    }

    @PutMapping("/{id}")
    public Tasting updateOne(@PathVariable("id") UUID id, @RequestBody Tasting tasting) {
        return repository.updateById(id, tasting);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable("id") UUID id) {
        repository.deleteById(id);
    }
}
