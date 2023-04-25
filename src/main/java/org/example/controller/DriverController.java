package org.example.controller;

import org.example.model.Driver;
import org.example.repository.DriverRepository;
import org.example.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpClient;
import java.util.List;

@Controller
public class DriverController {

    @Autowired
    private DriverService driverService;

    @RequestMapping(path = "/create", method = RequestMethod.GET)
    public String create(){
        return "create";
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String find(Model model) {
        model.addAttribute("appName", "Taxi Company");
        model.addAttribute("drivers", driverService.findAll());
        return "index";
    }

    @ResponseBody
    @RequestMapping(path = "save", method = RequestMethod.POST)
    public void save(@RequestBody Driver driver) {
        driverService.save(driver);
    }

    @ResponseBody
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        driverService.delete(id);
    }
}