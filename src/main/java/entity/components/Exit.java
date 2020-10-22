package entity.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Exit {
    @SerializedName("ExitID")
    @Expose
    private String exitID;
    @SerializedName("ExitName")
    @Expose
    private ExitName exitName;
    @SerializedName("ExitPosition")
    @Expose
    private ExitPosition exitPosition;
    @SerializedName("LocationDescription")
    @Expose
    private String locationDescription;
    @SerializedName("Stair")
    @Expose
    private Boolean stair;
    @SerializedName("Escalator")
    @Expose
    private Integer escalator;
    @SerializedName("Elevator")
    @Expose
    private Boolean elevator;

    public String getExitID() {
        return exitID;
    }

    public void setExitID(String exitID) {
        this.exitID = exitID;
    }

    public Exit withExitID(String exitID) {
        this.exitID = exitID;
        return this;
    }

    public ExitName getExitName() {
        return exitName;
    }

    public void setExitName(ExitName exitName) {
        this.exitName = exitName;
    }

    public Exit withExitName(ExitName exitName) {
        this.exitName = exitName;
        return this;
    }

    public ExitPosition getExitPosition() {
        return exitPosition;
    }

    public void setExitPosition(ExitPosition exitPosition) {
        this.exitPosition = exitPosition;
    }

    public Exit withExitPosition(ExitPosition exitPosition) {
        this.exitPosition = exitPosition;
        return this;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public Exit withLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
        return this;
    }

    public Boolean getStair() {
        return stair;
    }

    public void setStair(Boolean stair) {
        this.stair = stair;
    }

    public Exit withStair(Boolean stair) {
        this.stair = stair;
        return this;
    }

    public Integer getEscalator() {
        return escalator;
    }

    public void setEscalator(Integer escalator) {
        this.escalator = escalator;
    }

    public Exit withEscalator(Integer escalator) {
        this.escalator = escalator;
        return this;
    }

    public Boolean getElevator() {
        return elevator;
    }

    public void setElevator(Boolean elevator) {
        this.elevator = elevator;
    }

    public Exit withElevator(Boolean elevator) {
        this.elevator = elevator;
        return this;
    }
}
