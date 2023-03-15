package com.lab3.komarov.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.springframework.lang.NonNull;

import java.util.List;

@Entity
public class Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NonNull
    @Size(min=11, max = 11, message = "Phone number format: 8-xxx-xxx-xx-xx")
    private String phoneNumber;

    @OneToMany(cascade = CascadeType.ALL)
    private List<RecordOnService> recordOnServiceList;

    public void addRecord(RecordOnService recordOnService){
        this.recordOnServiceList.add(recordOnService);
    }

    // getters/setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
