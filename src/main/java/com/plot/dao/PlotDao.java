package com.plot.dao;

import java.io.IOException;
import com.google.gson.JsonArray;
import com.plot.model.Site;

public interface PlotDao {
	
	JsonArray getSiteDetails() throws IOException;

	String createData(Site site) throws IOException;
}
