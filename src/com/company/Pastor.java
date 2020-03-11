package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pastor {
    private List<Pastoreable> pastoreables;

    public Pastor(){
        this.pastoreables = new ArrayList<>();
    }

    public List<Pastoreable> getPastoreables() {
        return pastoreables;
    }

    public void setPastoreables(List<Pastoreable>pastoreables){
        this.pastoreables = pastoreables;
    }
}
