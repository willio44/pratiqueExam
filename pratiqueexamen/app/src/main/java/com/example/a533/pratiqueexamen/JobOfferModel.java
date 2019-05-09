package com.example.a533.pratiqueexamen;

public class JobOfferModel {

    String titleJob;
    String description;
    Float salary;

    public JobOfferModel(String titleJob, String description, Float salary) {
        this.titleJob = titleJob;
        this.description = description;
        this.salary = salary;
    }

    public String getTitleJob() {
        return titleJob;
    }

    public void setTitleJob(String titleJob) {
        this.titleJob = titleJob;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
