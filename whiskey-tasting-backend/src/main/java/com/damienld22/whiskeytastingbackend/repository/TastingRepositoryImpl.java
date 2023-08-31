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
}
