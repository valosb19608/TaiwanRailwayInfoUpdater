package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import entity.components.StationName;
import entity.components.StationPosition;

import java.util.List;

public class Station extends ApiDataHeader {
    @SerializedName("Stations")
    @Expose
    private List<Stations> stations = null;

    public List<Stations> getStations() {
        return stations;
    }

    public void setStations(List<Stations> stations) {
        this.stations = stations;
    }

    public class Stations {
        @SerializedName("StationUID")
        @Expose
        private String stationUID;
        @SerializedName("StationID")
        @Expose
        private String stationID;
        @SerializedName("StationName")
        @Expose
        private StationName stationName;
        @SerializedName("StationPosition")
        @Expose
        private StationPosition stationPosition;
        @SerializedName("StationAddress")
        @Expose
        private String stationAddress;
        @SerializedName("StationPhone")
        @Expose
        private String stationPhone;
        @SerializedName("StationClass")
        @Expose
        private String stationClass;
        @SerializedName("StationURL")
        @Expose
        private String stationURL;

        public String getStationUID() {
            return stationUID;
        }

        public void setStationUID(String stationUID) {
            this.stationUID = stationUID;
        }

        public Stations withStationUID(String stationUID) {
            this.stationUID = stationUID;
            return this;
        }

        public String getStationID() {
            return stationID;
        }

        public void setStationID(String stationID) {
            this.stationID = stationID;
        }

        public Stations withStationID(String stationID) {
            this.stationID = stationID;
            return this;
        }

        public StationName getStationName() {
            return stationName;
        }

        public void setStationName(StationName stationName) {
            this.stationName = stationName;
        }

        public Stations withStationName(StationName stationName) {
            this.stationName = stationName;
            return this;
        }

        public StationPosition getStationPosition() {
            return stationPosition;
        }

        public void setStationPosition(StationPosition stationPosition) {
            this.stationPosition = stationPosition;
        }

        public Stations withStationPosition(StationPosition stationPosition) {
            this.stationPosition = stationPosition;
            return this;
        }

        public String getStationAddress() {
            return stationAddress;
        }

        public void setStationAddress(String stationAddress) {
            this.stationAddress = stationAddress;
        }

        public Stations withStationAddress(String stationAddress) {
            this.stationAddress = stationAddress;
            return this;
        }

        public String getStationPhone() {
            return stationPhone;
        }

        public void setStationPhone(String stationPhone) {
            this.stationPhone = stationPhone;
        }

        public Stations withStationPhone(String stationPhone) {
            this.stationPhone = stationPhone;
            return this;
        }

        public String getStationClass() {
            return stationClass;
        }

        public void setStationClass(String stationClass) {
            this.stationClass = stationClass;
        }

        public Stations withStationClass(String stationClass) {
            this.stationClass = stationClass;
            return this;
        }

        public String getStationURL() {
            return stationURL;
        }

        public void setStationURL(String stationURL) {
            this.stationURL = stationURL;
        }

        public Stations withStationURL(String stationURL) {
            this.stationURL = stationURL;
            return this;
        }

    }
}
