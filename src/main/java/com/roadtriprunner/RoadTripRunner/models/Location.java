package com.roadtriprunner.RoadTripRunner.models;

import javax.persistence.Entity;

@Entity
public class Location {

    private String name;

    public Location(String name) { this.name = name; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
