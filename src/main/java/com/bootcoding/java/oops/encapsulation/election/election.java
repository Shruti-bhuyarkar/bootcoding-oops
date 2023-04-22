package com.bootcoding.java.oops.encapsulation.election;

import java.util.Date;

public class election {
    public String city;
    public Date electionDate;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getElectionDate() {
        return electionDate;
    }

    public void setElectionDate(Date electionDate) {
        this.electionDate = electionDate;
    }
}
