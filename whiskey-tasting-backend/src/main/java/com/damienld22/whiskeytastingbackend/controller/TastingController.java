package com.damienld22.whiskeytastingbackend.controller;

import com.damienld22.whiskeytastingbackend.domain.Tasting;
import com.damienld22.whiskeytastingbackend.repository.TastingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

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
}
