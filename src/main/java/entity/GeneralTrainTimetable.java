package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import entity.components.ServiceDay;
import entity.components.StopTime;
import entity.components.TrainInfo;

import java.util.List;

public class GeneralTrainTimetable extends ApiDataHeader{
    @SerializedName("TrainTimetables")
    @Expose
    private List<TrainTimetables> trainTimetables = null;

    public List<TrainTimetables> getTrainTimetables() {
        return trainTimetables;
    }

    public void setTrainTimetables(List<TrainTimetables> trainTimetables) {
        this.trainTimetables = trainTimetables;
    }

    public class TrainTimetables {

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

        public TrainTimetables withTrainInfo(TrainInfo trainInfo) {
            this.trainInfo = trainInfo;
            return this;
        }

        public List<StopTime> getStopTimes() {
            return stopTimes;
        }

        public void setStopTimes(List<StopTime> stopTimes) {
            this.stopTimes = stopTimes;
        }

        public TrainTimetables withStopTimes(List<StopTime> stopTimes) {
            this.stopTimes = stopTimes;
            return this;
        }

        public ServiceDay getServiceDay() {
            return serviceDay;
        }

        public void setServiceDay(ServiceDay serviceDay) {
            this.serviceDay = serviceDay;
        }

        public TrainTimetables withServiceDay(ServiceDay serviceDay) {
            this.serviceDay = serviceDay;
            return this;
        }
    }
}
