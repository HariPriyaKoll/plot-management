package com.plot.repository;

import com.plot.model.SiteModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlotRepository extends MongoRepository<SiteModel,String> {
}
