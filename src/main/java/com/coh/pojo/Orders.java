package com.coh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private int id;
    private int project_id;
    private String creator;
    private String description;
    private int priority;
    private Date create_at;
}
