/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.crm1.controller.master;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author user
 */
public abstract class CRUDController<T> {
    protected String path ="";
    
    public abstract String index(Model model);
   
    @GetMapping(value="/add")
    public String add(){
        return path+"/add";
    }
    
    public abstract String edit(int id, Model model);
    public abstract String save(T model);
    public abstract String detail(int id);
    public abstract String delete(int id);
}
