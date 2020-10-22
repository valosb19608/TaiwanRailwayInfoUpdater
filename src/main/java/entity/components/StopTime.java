package entity.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StopTime {
    @SerializedName("StopSequence")
    @Expose
    private Integer stopSequence;
    @SerializedName("StationID")
    @Expose
    private String stationID;
    @SerializedName("StationName")
    @Expose
    private StationName stationName;
    @SerializedName("ArrivalTime")
    @Expose
    private String arrivalTime;
    @SerializedName("DepartureTime")
    @Expose
    private String departureTime;

    public Integer getStopSequence() {
        return stopSequence;
    }

    public void setStopSequence(Integer stopSequence) {
        this.stopSequence = stopSequence;
    }

    public StopTime withStopSequence(Integer stopSequence) {
        this.stopSequence = stopSequence;
        return this;
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public StopTime withStationID(String stationID) {
        this.stationID = stationID;
        return this;
    }

    public StationName getStationName() {
        return stationName;
    }

    public void setStationName(StationName stationName) {
        this.stationName = stationName;
    }

    public StopTime withStationName(StationName stationName) {
        this.stationName = stationName;
        return this;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public StopTime withArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
        return this;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public StopTime withDepartureTime(String departureTime) {
        this.departureTime = departureTime;
        return this;
    }
}
