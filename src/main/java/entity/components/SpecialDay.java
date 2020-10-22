package entity.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SpecialDay {
    @SerializedName("StartDate")
    @Expose
    private String startDate;
    @SerializedName("EndDate")
    @Expose
    private String endDate;
    @SerializedName("ServiceStatus")
    @Expose
    private Integer serviceStatus;
    @SerializedName("Description")
    @Expose
    private String description;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public SpecialDay withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public SpecialDay withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public Integer getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(Integer serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public SpecialDay withServiceStatus(Integer serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SpecialDay withDescription(String description) {
        this.description = description;
        return this;
    }
}
