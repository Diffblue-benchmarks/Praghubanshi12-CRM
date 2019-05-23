/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.crm1.entity.common;

import java.util.Date;

/**
 *
 * @author user
 */
public class MasterEntity {

    protected int id;
    protected Date createdDate;
    protected Date modifiedDate;
    protected boolean deleted;
    protected Date deletedDate;

    public int getId() {
        return id;
    }

    public MasterEntity setId(int id) {
        this.id = id;
        return this;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public MasterEntity setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public MasterEntity setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public MasterEntity setDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public MasterEntity setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
        return this;
    }

}
