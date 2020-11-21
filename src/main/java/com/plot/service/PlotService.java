package com.plot.service;

import java.io.IOException;
import com.google.gson.JsonArray;
import com.plot.model.Site;

public interface PlotService {
	
	JsonArray getAllSites() throws IOException;

	String createData(Site siteObj) throws IOException;
}
