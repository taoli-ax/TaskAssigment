package com.coh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private int id;
    private int project_id;
    @NotBlank(message = "创建人不能为空")
    private String creator;
    @NotBlank(message = "描述信息不能为空")
    private String description;
    private int priority;
    private Date create_at;
}
