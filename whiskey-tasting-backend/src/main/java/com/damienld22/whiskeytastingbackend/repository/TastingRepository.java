package com.damienld22.whiskeytastingbackend.repository;

import com.damienld22.whiskeytastingbackend.domain.Tasting;

import java.util.List;

public interface TastingRepository {
    public List<Tasting> getAll();
}
