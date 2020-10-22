package entity.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InformationSpot {
    @SerializedName("Description")
    @Expose
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InformationSpot withDescription(String description) {
        this.description = description;
        return this;
    }
}
