package com.fouroo.nose.entity;

import javax.persistence.Table;

@Table(name="contact")
public class Contact {
    private Integer id;

    private String phonecontent;

    private String adress;

    private String image;

    private String network;

    private String worktime;

    private String way;

    private String officeConcept;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhonecontent() {
        return phonecontent;
    }

    public void setPhonecontent(String phonecontent) {
        this.phonecontent = phonecontent == null ? null : phonecontent.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network == null ? null : network.trim();
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime == null ? null : worktime.trim();
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way == null ? null : way.trim();
    }

    public String getOfficeConcept() {
        return officeConcept;
    }

    public void setOfficeConcept(String officeConcept) {
        this.officeConcept = officeConcept == null ? null : officeConcept.trim();
    }
}