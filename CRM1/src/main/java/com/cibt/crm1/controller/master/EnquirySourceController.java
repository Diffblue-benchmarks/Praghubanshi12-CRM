/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.crm1.controller.master;

import com.cibt.crm1.dto.EnquirySourceDTO;
import com.cibt.crm1.service.EnquirySourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping(value = "/admin/master/enquiry/source")
public class EnquirySourceController extends CRUDController<EnquirySourceDTO> {

    public EnquirySourceController() {
        path = "master/enquirysource";
    }

    @Autowired
    private EnquirySourceService service;

    @GetMapping
    @Override
    public String index(Model model) {
        model.addAttribute("sources", service.findAll());
        return "master/enquirysource/index";
    }

    @GetMapping(value = "/edit/{id}")
    @Override
    public String edit(@PathVariable("id") int id, Model model) {
        model.addAttribute("source", service.findById(id));
        return "master/enquirysource/edit";
    }

    @PostMapping
    @Override
    public String save(EnquirySourceDTO model) {
        service.save(model);
        return "redirect:/admin/master/enquiry/source";

    }

    @Override
    public String detail(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @GetMapping(value="/delete/{id}")
    @Override
    public String delete(@PathVariable("id") int id) {
        service.delete(id);
        return "redirect:/admin/master/enquiry/source";
    }

}
