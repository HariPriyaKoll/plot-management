package com.plot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import com.plot.model.SiteModel;
import com.plot.repository.PlotRepository;

@RestController
@CrossOrigin(origins = "https://plot-management-app.herokuapp.com")
public class PlotController {
	
	@Autowired
    private SiteModel siteModel;

    @Autowired
    private List<SiteModel> siteModelList;

    @Autowired
    private PlotRepository plotRepository;
    
    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
    
    @GetMapping("/allSites")
    public ResponseEntity<List<SiteModel>> getAllSites() {

        siteModelList = plotRepository.findAll();
        if (siteModelList.isEmpty())
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        return ResponseEntity.status(HttpStatus.OK).body(siteModelList);
    }
    
    @PostMapping("/register")
    public ResponseEntity<SiteModel> addSite(@RequestBody SiteModel site) {

        siteModel = plotRepository.save(site);
        if (siteModel != null)
            return ResponseEntity.status(HttpStatus.CREATED).body(siteModel);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}