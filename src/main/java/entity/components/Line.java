package entity.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Line {

    @SerializedName("LineID")
    @Expose
    private String lineID;

    public String getLineID() {
        return lineID;
    }

    public void setLineID(String lineID) {
        this.lineID = lineID;
    }

    public Line withLineID(String lineID) {
        this.lineID = lineID;
        return this;
    }

}