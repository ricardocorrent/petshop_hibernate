/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcorrent.enuns;

/**
 *
 * @author rcorrent
 */
public enum Status {
    
    defaultState(0),
    insertState(1), 
    editState(2),
    editBirdState(3),
    editDogCatState(4),
    deleteBirdState(5), 
    deleteDogCatState(6);
    
    private Integer status;

    private Status(Integer status) {
        this.status = status;
    }

    public static Status getDefaultState() {
        return defaultState;
    }

    public static Status getInsertState() {
        return insertState;
    }

    public static Status getEditState() {
        return editState;
    }

    public static Status getDeleteBirdState() {
        return deleteBirdState;
    }

    public static Status getDeleteDogCatState() {
        return deleteDogCatState;
    }

    public static Status getEditBirdState() {
        return editBirdState;
    }

    public static Status getEditDogCatState() {
        return editDogCatState;
    }

    public Integer getStatus() {
        return status;
    }
}
