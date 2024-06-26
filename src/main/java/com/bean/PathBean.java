package com.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;

@Component
@Scope("session")
@ManagedBean
public class PathBean {

    private String currentPage;

    public PathBean() {
        this.currentPage = "etudiant";
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public void updatePage(String page){
        this.setCurrentPage(page);
    }


}
