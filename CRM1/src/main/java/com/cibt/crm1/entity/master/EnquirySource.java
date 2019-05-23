/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.crm1.entity.master;

import com.cibt.crm1.entity.common.MasterEntity;

/**
 *
 * @author user
 */
public class EnquirySource extends MasterEntity{
    private String name,color;

    public EnquirySource() {
    }

    public EnquirySource(int id) {
        this.id = id;
    }

    
    public EnquirySource(int id, String name, String color) {
        this.id=id;
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public EnquirySource setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public EnquirySource setColor(String color) {
        this.color = color;
        return this;
    }
    
    
    
    
}


