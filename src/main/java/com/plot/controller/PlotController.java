package com.plot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.plot.model.Site;
import com.plot.service.PlotService;

@RestController
public class PlotController {
	
	@Autowired
    private PlotService plotService;

    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/sites")
    public @ResponseBody String getAllSites() throws IOException {
        return plotService.getAllSites().toString();
    }
    
    @PostMapping("/addUser")
    public String addUser(@RequestBody Site site) throws IOException {
    	return plotService.createData(site);
    }
}