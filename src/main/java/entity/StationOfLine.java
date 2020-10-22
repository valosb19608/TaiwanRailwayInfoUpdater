package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StationOfLine extends ApiDataHeader {
    @SerializedName("StationOfLines")
    @Expose
    private List<StationOfLine> stationOfLines = null;

    public class StationOfLines {
        @SerializedName("LineID")
        @Expose
        private String lineID;
        @SerializedName("Stations")
        @Expose
        private List<Station> stations = null;

        public String getLineID() {
            return lineID;
        }

        public void setLineID(String lineID) {
            this.lineID = lineID;
        }

        public StationOfLines withLineID(String lineID) {
            this.lineID = lineID;
            return this;
        }

        public List<Station> getStations() {
            return stations;
        }

        public void setStations(List<Station> stations) {
            this.stations = stations;
        }

        public StationOfLines withStations(List<Station> stations) {
            this.stations = stations;
            return this;
        }
    }
}
