package entity.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExitPosition {
    @SerializedName("PositionLat")
    @Expose
    private Double positionLat;
    @SerializedName("PositionLon")
    @Expose
    private Double positionLon;

    public Double getPositionLat() {
        return positionLat;
    }

    public void setPositionLat(Double positionLat) {
        this.positionLat = positionLat;
    }

    public ExitPosition withPositionLat(Double positionLat) {
        this.positionLat = positionLat;
        return this;
    }

    public Double getPositionLon() {
        return positionLon;
    }

    public void setPositionLon(Double positionLon) {
        this.positionLon = positionLon;
    }

    public ExitPosition withPositionLon(Double positionLon) {
        this.positionLon = positionLon;
        return this;
    }
}
