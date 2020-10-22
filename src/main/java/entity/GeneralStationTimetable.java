package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import entity.components.ServiceDay;
import entity.components.StationName;
import entity.components.Timetable;

import java.util.List;

public class GeneralStationTimetable extends ApiDataHeader {
    @SerializedName("StationTimetables")
    @Expose
    private List<StationTimetables> stationTimetables = null;

    public class StationTimetables {
        @SerializedName("StationID")
        @Expose
        private String stationID;
        @SerializedName("StationName")
        @Expose
        private StationName stationName;
        @SerializedName("Direction")
        @Expose
        private Integer direction;
        @SerializedName("Timetables")
        @Expose
        private List<Timetable> timetables = null;
        @SerializedName("ServiceDay")
        @Expose
        private ServiceDay serviceDay;

        public String getStationID() {
            return stationID;
        }

        public void setStationID(String stationID) {
            this.stationID = stationID;
        }

        public StationTimetables withStationID(String stationID) {
            this.stationID = stationID;
            return this;
        }

        public StationName getStationName() {
            return stationName;
        }

        public void setStationName(StationName stationName) {
            this.stationName = stationName;
        }

        public StationTimetables withStationName(StationName stationName) {
            this.stationName = stationName;
            return this;
        }

        public Integer getDirection() {
            return direction;
        }

        public void setDirection(Integer direction) {
            this.direction = direction;
        }

        public StationTimetables withDirection(Integer direction) {
            this.direction = direction;
            return this;
        }

        public List<Timetable> getTimetables() {
            return timetables;
        }

        public void setTimetables(List<Timetable> timetables) {
            this.timetables = timetables;
        }

        public StationTimetables withTimetables(List<Timetable> timetables) {
            this.timetables = timetables;
            return this;
        }

        public ServiceDay getServiceDay() {
            return serviceDay;
        }

        public void setServiceDay(ServiceDay serviceDay) {
            this.serviceDay = serviceDay;
        }

        public StationTimetables withServiceDay(ServiceDay serviceDay) {
            this.serviceDay = serviceDay;
            return this;
        }
    }
}
