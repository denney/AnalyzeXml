package com.juststand.xml.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * Created by juststand on 2017/4/10.
 */
public class RatePlan {

    private String ratePlanID;
    private String action;
    private String description;
    private List<ProductOrderICB> productOrderICBs;

    @XmlElement(name = "RatePlanID")
    public String getRatePlanID() {
        return ratePlanID;
    }

    public void setRatePlanID(String ratePlanID) {
        this.ratePlanID = ratePlanID;
    }

    @XmlElement(name = "Action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @XmlElement(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElementWrapper(name = "ProductOrderICBs")
    @XmlElement(name = "ProductOrderICB")
    public List<ProductOrderICB> getProductOrderICBs() {
        return productOrderICBs;
    }

    public void setProductOrderICBs(List<ProductOrderICB> productOrderICBs) {
        this.productOrderICBs = productOrderICBs;
    }

    @Override
    public String toString() {
        return "RatePlan{" +
                "ratePlanID='" + ratePlanID + '\'' +
                ", action='" + action + '\'' +
                ", description='" + description + '\'' +
                ", productOrderICBs=" + productOrderICBs +
                '}';
    }
}
