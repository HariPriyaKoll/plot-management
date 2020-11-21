package com.plot.model;

import java.util.ArrayList;
import java.util.List;

public class Sites {
   List<Site> sites = new ArrayList<>();
   public List<Site> getSites() {
      return sites;
   }
   public void addSite(Site site) {
      this.sites.add(site);
   }
}
