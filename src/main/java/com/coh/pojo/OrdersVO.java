package com.coh.pojo;

import java.io.Serializable;

/**
 * 视图对象
 * ViewObject
 */
public class OrdersVO extends Orders implements Serializable {
    private Project project;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
