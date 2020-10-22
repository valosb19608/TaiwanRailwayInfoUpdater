package entity.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TrainTimetable {
    @SerializedName("TrainInfo")
    @Expose
    private TrainInfo trainInfo;
    @SerializedName("StopTimes")
    @Expose
    private List<StopTime> stopTimes = null;
    @SerializedName("ServiceDay")
    @Expose
    private ServiceDay serviceDay;

    public TrainInfo getTrainInfo() {
        return trainInfo;
    }

    public void setTrainInfo(TrainInfo trainInfo) {
        this.trainInfo = trainInfo;
    }

    public TrainTimetable withTrainInfo(TrainInfo trainInfo) {
        this.trainInfo = trainInfo;
        return this;
    }

    public List<StopTime> getStopTimes() {
        return stopTimes;
    }

    public void setStopTimes(List<StopTime> stopTimes) {
        this.stopTimes = stopTimes;
    }

    public TrainTimetable withStopTimes(List<StopTime> stopTimes) {
        this.stopTimes = stopTimes;
        return this;
    }

    public ServiceDay getServiceDay() {
        return serviceDay;
    }

    public void setServiceDay(ServiceDay serviceDay) {
        this.serviceDay = serviceDay;
    }

    public TrainTimetable withServiceDay(ServiceDay serviceDay) {
        this.serviceDay = serviceDay;
        return this;
    }

}
