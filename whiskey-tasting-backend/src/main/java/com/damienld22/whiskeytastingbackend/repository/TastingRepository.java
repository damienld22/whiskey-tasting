package com.damienld22.whiskeytastingbackend.repository;

import com.damienld22.whiskeytastingbackend.domain.Tasting;

import java.util.List;
import java.util.UUID;

public interface TastingRepository {
    List<Tasting> getAll();
    Tasting getById(UUID id);
    Tasting create(Tasting tasting);
    void deleteById(UUID id);
    Tasting updateById(UUID id, Tasting tasting);
}
