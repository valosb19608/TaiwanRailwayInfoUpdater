package entity.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FacilityMapURL {
    @SerializedName("MapName")
    @Expose
    private MapName mapName;
    @SerializedName("MapURL")
    @Expose
    private String mapURL;
    @SerializedName("FloorLevel")
    @Expose
    private String floorLevel;

    public MapName getMapName() {
        return mapName;
    }

    public void setMapName(MapName mapName) {
        this.mapName = mapName;
    }

    public FacilityMapURL withMapName(MapName mapName) {
        this.mapName = mapName;
        return this;
    }

    public String getMapURL() {
        return mapURL;
    }

    public void setMapURL(String mapURL) {
        this.mapURL = mapURL;
    }

    public FacilityMapURL withMapURL(String mapURL) {
        this.mapURL = mapURL;
        return this;
    }

    public String getFloorLevel() {
        return floorLevel;
    }

    public void setFloorLevel(String floorLevel) {
        this.floorLevel = floorLevel;
    }

    public FacilityMapURL withFloorLevel(String floorLevel) {
        this.floorLevel = floorLevel;
        return this;
    }
}
