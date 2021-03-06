package org.example.sarif_viewer.parser.jsonKeys;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LocationsKeys {
    PhysicalLocationKeys physicalLocation;
    LocationKeys location;

    public PhysicalLocationKeys getPhysicalLocation() {
        return physicalLocation;
    }
    public void setPhysicalLocation(PhysicalLocationKeys physicalLocation) {
        this.physicalLocation = physicalLocation;
    }

    public LocationKeys getLocation() {
        return location;
    }
    public void setLocation(LocationKeys location) {
        this.location = location;
    }

    @JsonCreator
    public LocationsKeys(@JsonProperty("physicalLocation") PhysicalLocationKeys physicalLocation,
                        @JsonProperty("location") LocationKeys location) {
        this.physicalLocation = physicalLocation;
        this.location = location;
    }
}