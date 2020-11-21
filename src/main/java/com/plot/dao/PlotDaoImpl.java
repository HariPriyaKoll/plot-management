package com.plot.dao;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonWriter;
import com.plot.model.Site;
import com.plot.model.Sites;

import java.io.*;
import java.util.*;

@Repository
public class PlotDaoImpl implements PlotDao { 
	private static String filePath = "src/main/resources/data.json";
	@SuppressWarnings("deprecation")
	@Override
	public JsonArray getSiteDetails() throws IOException {
		JsonParser parser = new JsonParser();
        Object obj = parser.parse(new FileReader(filePath));
        JsonObject jsonObject = (JsonObject) obj;
        JsonArray sites = (JsonArray)jsonObject.get("sites");
		return sites;
	}
	
	@Override
	public String createData(Site siteObj) throws IOException {
		JsonArray arr = getSiteDetails();
        Iterator<JsonElement> iterator = arr.iterator();
        Gson gson = new Gson();
        FileWriter file = new FileWriter(filePath, false);
        JsonWriter jw = new JsonWriter(file);
        iterator = arr.iterator();
        Sites sitesArr = new Sites();
        while(iterator.hasNext()) {
           sitesArr.addSite(gson.fromJson(iterator.next().toString(), Site.class));
        }
        sitesArr.addSite(siteObj);
        gson.toJson(sitesArr, Sites.class, jw);
        file.close();
        return "success";
	}
}
