package com.plot.service;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonArray;
import com.plot.dao.PlotDao;
import com.plot.model.Site;

@Service
public class PlotServiceImpl implements PlotService {
   
	@Autowired
	PlotDao plotDao;
	
	@Override
	public JsonArray getAllSites() throws IOException {
		JsonArray sitesList = plotDao.getSiteDetails();
		return sitesList;
	}
	
	@Override
	public String createData(Site site) throws IOException {
		return plotDao.createData(site);
	}

}
