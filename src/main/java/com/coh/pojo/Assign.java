package com.coh.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * assign
 * @author 
 */
public class Assign implements Serializable {
    private Integer id;

    private Integer orderId;

    private String excutor;

    private Date excutionTime;

    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getExcutor() {
        return excutor;
    }

    public void setExcutor(String excutor) {
        this.excutor = excutor;
    }

    public Date getExcutionTime() {
        return excutionTime;
    }

    public void setExcutionTime(Date excutionTime) {
        this.excutionTime = excutionTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Assign other = (Assign) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getExcutor() == null ? other.getExcutor() == null : this.getExcutor().equals(other.getExcutor()))
            && (this.getExcutionTime() == null ? other.getExcutionTime() == null : this.getExcutionTime().equals(other.getExcutionTime()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getExcutor() == null) ? 0 : getExcutor().hashCode());
        result = prime * result + ((getExcutionTime() == null) ? 0 : getExcutionTime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", excutor=").append(excutor);
        sb.append(", excutionTime=").append(excutionTime);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}