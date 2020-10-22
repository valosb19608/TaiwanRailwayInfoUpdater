package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import entity.components.Elevator;
import entity.components.FacilityMapURL;
import entity.components.InformationSpot;
import entity.components.StationName;

import java.util.List;

public class StationFacility {
    @SerializedName("StationFacilities")
    @Expose
    private List<StationFacility> stationFacilities = null;

    public class StationFacilities {
        @SerializedName("StationID")
        @Expose
        private String stationID;
        @SerializedName("StationName")
        @Expose
        private StationName stationName;
        @SerializedName("FacilityMapURLs")
        @Expose
        private List<FacilityMapURL> facilityMapURLs = null;
        @SerializedName("Elevators")
        @Expose
        private List<Elevator> elevators = null;
        @SerializedName("InformationSpots")
        @Expose
        private List<InformationSpot> informationSpots = null;
        @SerializedName("DrinkingFountains")
        @Expose
        private List<Object> drinkingFountains = null;
        @SerializedName("Toilets")
        @Expose
        private List<Object> toilets = null;

        public String getStationID() {
            return stationID;
        }

        public void setStationID(String stationID) {
            this.stationID = stationID;
        }

        public StationFacilities withStationID(String stationID) {
            this.stationID = stationID;
            return this;
        }

        public StationName getStationName() {
            return stationName;
        }

        public void setStationName(StationName stationName) {
            this.stationName = stationName;
        }

        public StationFacilities withStationName(StationName stationName) {
            this.stationName = stationName;
            return this;
        }

        public List<FacilityMapURL> getFacilityMapURLs() {
            return facilityMapURLs;
        }

        public void setFacilityMapURLs(List<FacilityMapURL> facilityMapURLs) {
            this.facilityMapURLs = facilityMapURLs;
        }

        public StationFacilities withFacilityMapURLs(List<FacilityMapURL> facilityMapURLs) {
            this.facilityMapURLs = facilityMapURLs;
            return this;
        }

        public List<Elevator> getElevators() {
            return elevators;
        }

        public void setElevators(List<Elevator> elevators) {
            this.elevators = elevators;
        }

        public StationFacilities withElevators(List<Elevator> elevators) {
            this.elevators = elevators;
            return this;
        }

        public List<InformationSpot> getInformationSpots() {
            return informationSpots;
        }

        public void setInformationSpots(List<InformationSpot> informationSpots) {
            this.informationSpots = informationSpots;
        }

        public StationFacilities withInformationSpots(List<InformationSpot> informationSpots) {
            this.informationSpots = informationSpots;
            return this;
        }

        public List<Object> getDrinkingFountains() {
            return drinkingFountains;
        }

        public void setDrinkingFountains(List<Object> drinkingFountains) {
            this.drinkingFountains = drinkingFountains;
        }

        public StationFacilities withDrinkingFountains(List<Object> drinkingFountains) {
            this.drinkingFountains = drinkingFountains;
            return this;
        }

        public List<Object> getToilets() {
            return toilets;
        }

        public void setToilets(List<Object> toilets) {
            this.toilets = toilets;
        }

        public StationFacilities withToilets(List<Object> toilets) {
            this.toilets = toilets;
            return this;
        }
    }
}
