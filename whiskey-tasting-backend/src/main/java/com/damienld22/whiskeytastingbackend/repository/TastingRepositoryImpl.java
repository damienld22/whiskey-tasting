package com.damienld22.whiskeytastingbackend.repository;

import com.damienld22.whiskeytastingbackend.domain.Tasting;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Repository
public class TastingRepositoryImpl implements TastingRepository {
    private final HashMap<UUID, Tasting> tastings = new HashMap<>();

    @Override
    public List<Tasting> getAll() {
        return new ArrayList<>(tastings.values());
    }

    @Override
    public Tasting getById(UUID id) {
        return tastings.get(id);
    }

    @Override
    public Tasting create(Tasting tasting) {
        tastings.put(tasting.getId(), tasting);
        return tasting;
    }

    @Override
    public void deleteById(UUID id) {
        tastings.remove(id);
    }

    @Override
    public Tasting updateById(UUID id, Tasting tasting) {
        tastings.put(id, tasting);
        return tasting;
    }
}
