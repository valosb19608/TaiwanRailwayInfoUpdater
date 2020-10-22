package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import entity.components.Exit;
import entity.components.ExitMapURL;
import entity.components.StationName;

import java.util.List;

public class StationExit extends ApiDataHeader {
    @SerializedName("StationExits")
    @Expose
    private List<StationExits> stationExits = null;

    public List<StationExits> getStationExits() {
        return stationExits;
    }

    public void setStationExits(List<StationExits> stationExits) {
        this.stationExits = stationExits;
    }

    public class StationExits {
        @SerializedName("StationID")
        @Expose
        private String stationID;
        @SerializedName("StationName")
        @Expose
        private StationName stationName;
        @SerializedName("Exits")
        @Expose
        private List<Exit> exits = null;
        @SerializedName("ExitMapURLs")
        @Expose
        private List<ExitMapURL> exitMapURLs = null;

        public String getStationID() {
            return stationID;
        }

        public void setStationID(String stationID) {
            this.stationID = stationID;
        }

        public StationExits withStationID(String stationID) {
            this.stationID = stationID;
            return this;
        }

        public StationName getStationName() {
            return stationName;
        }

        public void setStationName(StationName stationName) {
            this.stationName = stationName;
        }

        public StationExits withStationName(StationName stationName) {
            this.stationName = stationName;
            return this;
        }

        public List<Exit> getExits() {
            return exits;
        }

        public void setExits(List<Exit> exits) {
            this.exits = exits;
        }

        public StationExits withExits(List<Exit> exits) {
            this.exits = exits;
            return this;
        }

        public List<ExitMapURL> getExitMapURLs() {
            return exitMapURLs;
        }

        public void setExitMapURLs(List<ExitMapURL> exitMapURLs) {
            this.exitMapURLs = exitMapURLs;
        }

        public StationExits withExitMapURLs(List<ExitMapURL> exitMapURLs) {
            this.exitMapURLs = exitMapURLs;
            return this;
        }

    }
}
