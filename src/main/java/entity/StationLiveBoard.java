package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import entity.components.EndingStationName;
import entity.components.StationName;
import entity.components.TrainTypeName;

import java.util.List;

public class StationLiveBoard {
    @SerializedName("StationLiveBoards")
    @Expose
    private List<StationLiveBoards> stationLiveBoards = null;

    public class StationLiveBoards {
        @SerializedName("StationID")
        @Expose
        private String stationID;
        @SerializedName("StationName")
        @Expose
        private StationName stationName;
        @SerializedName("TrainNo")
        @Expose
        private String trainNo;
        @SerializedName("Direction")
        @Expose
        private Integer direction;
        @SerializedName("TrainTypeID")
        @Expose
        private String trainTypeID;
        @SerializedName("TrainTypeCode")
        @Expose
        private String trainTypeCode;
        @SerializedName("TrainTypeName")
        @Expose
        private TrainTypeName trainTypeName;
        @SerializedName("EndingStationID")
        @Expose
        private String endingStationID;
        @SerializedName("EndingStationName")
        @Expose
        private EndingStationName endingStationName;
        @SerializedName("TripLine")
        @Expose
        private Integer tripLine;
        @SerializedName("Platform")
        @Expose
        private String platform;
        @SerializedName("ScheduleArrivalTime")
        @Expose
        private String scheduleArrivalTime;
        @SerializedName("ScheduleDepartureTime")
        @Expose
        private String scheduleDepartureTime;
        @SerializedName("DelayTime")
        @Expose
        private Integer delayTime;
        @SerializedName("RunningStatus")
        @Expose
        private Integer runningStatus;
        @SerializedName("UpdateTime")
        @Expose
        private String updateTime;

        public String getStationID() {
            return stationID;
        }

        public void setStationID(String stationID) {
            this.stationID = stationID;
        }

        public StationLiveBoards withStationID(String stationID) {
            this.stationID = stationID;
            return this;
        }

        public StationName getStationName() {
            return stationName;
        }

        public void setStationName(StationName stationName) {
            this.stationName = stationName;
        }

        public StationLiveBoards withStationName(StationName stationName) {
            this.stationName = stationName;
            return this;
        }

        public String getTrainNo() {
            return trainNo;
        }

        public void setTrainNo(String trainNo) {
            this.trainNo = trainNo;
        }

        public StationLiveBoards withTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }

        public Integer getDirection() {
            return direction;
        }

        public void setDirection(Integer direction) {
            this.direction = direction;
        }

        public StationLiveBoards withDirection(Integer direction) {
            this.direction = direction;
            return this;
        }

        public String getTrainTypeID() {
            return trainTypeID;
        }

        public void setTrainTypeID(String trainTypeID) {
            this.trainTypeID = trainTypeID;
        }

        public StationLiveBoards withTrainTypeID(String trainTypeID) {
            this.trainTypeID = trainTypeID;
            return this;
        }

        public String getTrainTypeCode() {
            return trainTypeCode;
        }

        public void setTrainTypeCode(String trainTypeCode) {
            this.trainTypeCode = trainTypeCode;
        }

        public StationLiveBoards withTrainTypeCode(String trainTypeCode) {
            this.trainTypeCode = trainTypeCode;
            return this;
        }

        public TrainTypeName getTrainTypeName() {
            return trainTypeName;
        }

        public void setTrainTypeName(TrainTypeName trainTypeName) {
            this.trainTypeName = trainTypeName;
        }

        public StationLiveBoards withTrainTypeName(TrainTypeName trainTypeName) {
            this.trainTypeName = trainTypeName;
            return this;
        }

        public String getEndingStationID() {
            return endingStationID;
        }

        public void setEndingStationID(String endingStationID) {
            this.endingStationID = endingStationID;
        }

        public StationLiveBoards withEndingStationID(String endingStationID) {
            this.endingStationID = endingStationID;
            return this;
        }

        public EndingStationName getEndingStationName() {
            return endingStationName;
        }

        public void setEndingStationName(EndingStationName endingStationName) {
            this.endingStationName = endingStationName;
        }

        public StationLiveBoards withEndingStationName(EndingStationName endingStationName) {
            this.endingStationName = endingStationName;
            return this;
        }

        public Integer getTripLine() {
            return tripLine;
        }

        public void setTripLine(Integer tripLine) {
            this.tripLine = tripLine;
        }

        public StationLiveBoards withTripLine(Integer tripLine) {
            this.tripLine = tripLine;
            return this;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public StationLiveBoards withPlatform(String platform) {
            this.platform = platform;
            return this;
        }

        public String getScheduleArrivalTime() {
            return scheduleArrivalTime;
        }

        public void setScheduleArrivalTime(String scheduleArrivalTime) {
            this.scheduleArrivalTime = scheduleArrivalTime;
        }

        public StationLiveBoards withScheduleArrivalTime(String scheduleArrivalTime) {
            this.scheduleArrivalTime = scheduleArrivalTime;
            return this;
        }

        public String getScheduleDepartureTime() {
            return scheduleDepartureTime;
        }

        public void setScheduleDepartureTime(String scheduleDepartureTime) {
            this.scheduleDepartureTime = scheduleDepartureTime;
        }

        public StationLiveBoards withScheduleDepartureTime(String scheduleDepartureTime) {
            this.scheduleDepartureTime = scheduleDepartureTime;
            return this;
        }

        public Integer getDelayTime() {
            return delayTime;
        }

        public void setDelayTime(Integer delayTime) {
            this.delayTime = delayTime;
        }

        public StationLiveBoards withDelayTime(Integer delayTime) {
            this.delayTime = delayTime;
            return this;
        }

        public Integer getRunningStatus() {
            return runningStatus;
        }

        public void setRunningStatus(Integer runningStatus) {
            this.runningStatus = runningStatus;
        }

        public StationLiveBoards withRunningStatus(Integer runningStatus) {
            this.runningStatus = runningStatus;
            return this;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public StationLiveBoards withUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
    }
}
