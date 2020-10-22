package entity.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Timetable {

    @SerializedName("Sequence")
    @Expose
    private Integer sequence;
    @SerializedName("TrainNo")
    @Expose
    private String trainNo;
    @SerializedName("DestinationStationID")
    @Expose
    private String destinationStationID;
    @SerializedName("DestinationStationName")
    @Expose
    private DestinationStationName destinationStationName;
    @SerializedName("TrainTypeID")
    @Expose
    private String trainTypeID;
    @SerializedName("TrainTypeCode")
    @Expose
    private String trainTypeCode;
    @SerializedName("TrainTypeName")
    @Expose
    private TrainTypeName trainTypeName;
    @SerializedName("ArrivalTime")
    @Expose
    private String arrivalTime;
    @SerializedName("DepartureTime")
    @Expose
    private String departureTime;

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Timetable withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public Timetable withTrainNo(String trainNo) {
        this.trainNo = trainNo;
        return this;
    }

    public String getDestinationStationID() {
        return destinationStationID;
    }

    public void setDestinationStationID(String destinationStationID) {
        this.destinationStationID = destinationStationID;
    }

    public Timetable withDestinationStationID(String destinationStationID) {
        this.destinationStationID = destinationStationID;
        return this;
    }

    public DestinationStationName getDestinationStationName() {
        return destinationStationName;
    }

    public void setDestinationStationName(DestinationStationName destinationStationName) {
        this.destinationStationName = destinationStationName;
    }

    public Timetable withDestinationStationName(DestinationStationName destinationStationName) {
        this.destinationStationName = destinationStationName;
        return this;
    }

    public String getTrainTypeID() {
        return trainTypeID;
    }

    public void setTrainTypeID(String trainTypeID) {
        this.trainTypeID = trainTypeID;
    }

    public Timetable withTrainTypeID(String trainTypeID) {
        this.trainTypeID = trainTypeID;
        return this;
    }

    public String getTrainTypeCode() {
        return trainTypeCode;
    }

    public void setTrainTypeCode(String trainTypeCode) {
        this.trainTypeCode = trainTypeCode;
    }

    public Timetable withTrainTypeCode(String trainTypeCode) {
        this.trainTypeCode = trainTypeCode;
        return this;
    }

    public TrainTypeName getTrainTypeName() {
        return trainTypeName;
    }

    public void setTrainTypeName(TrainTypeName trainTypeName) {
        this.trainTypeName = trainTypeName;
    }

    public Timetable withTrainTypeName(TrainTypeName trainTypeName) {
        this.trainTypeName = trainTypeName;
        return this;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Timetable withArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
        return this;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Timetable withDepartureTime(String departureTime) {
        this.departureTime = departureTime;
        return this;
    }
}
