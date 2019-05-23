/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.crm1.service.impl;

import com.cibt.crm1.dto.EnquiryStatusDTO;
import com.cibt.crm1.entity.master.EnquiryStatus;
import com.cibt.crm1.repository.EnquiryStatusRepository;
import com.cibt.crm1.service.EnquiryStatusService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class EnquiryStatusServiceImpl implements EnquiryStatusService {

    @Autowired
    private EnquiryStatusRepository repository;

    @Override
    public List<EnquiryStatus> findAll() {
        return repository.findAll();
    }

    @Override
    public EnquiryStatus findById(int id) {
        return repository.findById(id);
    }

    @Override
    public int save(EnquiryStatusDTO model) {
        EnquiryStatus status = new EnquiryStatus();
        status.setId(model.getId());
        status.setName(model.getName());
        status.setColor(model.getColor());
        if (status.getId() == 0) {
            return repository.insert(status);
        }return repository.update(status);
    }

    @Override
    public int delete(int id) {
        return repository.delete(id);
    }

}
