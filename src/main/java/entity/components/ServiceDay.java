package entity.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ServiceDay {
    @SerializedName("ServiceTag")
    @Expose
    private String serviceTag;
    @SerializedName("Monday")
    @Expose
    private Integer monday;
    @SerializedName("Tuesday")
    @Expose
    private Integer tuesday;
    @SerializedName("Wednesday")
    @Expose
    private Integer wednesday;
    @SerializedName("Thursday")
    @Expose
    private Integer thursday;
    @SerializedName("Friday")
    @Expose
    private Integer friday;
    @SerializedName("Saturday")
    @Expose
    private Integer saturday;
    @SerializedName("Sunday")
    @Expose
    private Integer sunday;
    @SerializedName("NationalHolidays")
    @Expose
    private Integer nationalHolidays;
    @SerializedName("DayBeforeHoliday")
    @Expose
    private Integer dayBeforeHoliday;
    @SerializedName("DayAfterHoliday")
    @Expose
    private Integer dayAfterHoliday;
    @SerializedName("TyphoonDay")
    @Expose
    private Integer typhoonDay;

    public String getServiceTag() {
        return serviceTag;
    }

    public void setServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
    }

    public ServiceDay withServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
        return this;
    }

    public Integer getMonday() {
        return monday;
    }

    public void setMonday(Integer monday) {
        this.monday = monday;
    }

    public ServiceDay withMonday(Integer monday) {
        this.monday = monday;
        return this;
    }

    public Integer getTuesday() {
        return tuesday;
    }

    public void setTuesday(Integer tuesday) {
        this.tuesday = tuesday;
    }

    public ServiceDay withTuesday(Integer tuesday) {
        this.tuesday = tuesday;
        return this;
    }

    public Integer getWednesday() {
        return wednesday;
    }

    public void setWednesday(Integer wednesday) {
        this.wednesday = wednesday;
    }

    public ServiceDay withWednesday(Integer wednesday) {
        this.wednesday = wednesday;
        return this;
    }

    public Integer getThursday() {
        return thursday;
    }

    public void setThursday(Integer thursday) {
        this.thursday = thursday;
    }

    public ServiceDay withThursday(Integer thursday) {
        this.thursday = thursday;
        return this;
    }

    public Integer getFriday() {
        return friday;
    }

    public void setFriday(Integer friday) {
        this.friday = friday;
    }

    public ServiceDay withFriday(Integer friday) {
        this.friday = friday;
        return this;
    }

    public Integer getSaturday() {
        return saturday;
    }

    public void setSaturday(Integer saturday) {
        this.saturday = saturday;
    }

    public ServiceDay withSaturday(Integer saturday) {
        this.saturday = saturday;
        return this;
    }

    public Integer getSunday() {
        return sunday;
    }

    public void setSunday(Integer sunday) {
        this.sunday = sunday;
    }

    public ServiceDay withSunday(Integer sunday) {
        this.sunday = sunday;
        return this;
    }

    public Integer getNationalHolidays() {
        return nationalHolidays;
    }

    public void setNationalHolidays(Integer nationalHolidays) {
        this.nationalHolidays = nationalHolidays;
    }

    public ServiceDay withNationalHolidays(Integer nationalHolidays) {
        this.nationalHolidays = nationalHolidays;
        return this;
    }

    public Integer getDayBeforeHoliday() {
        return dayBeforeHoliday;
    }

    public void setDayBeforeHoliday(Integer dayBeforeHoliday) {
        this.dayBeforeHoliday = dayBeforeHoliday;
    }

    public ServiceDay withDayBeforeHoliday(Integer dayBeforeHoliday) {
        this.dayBeforeHoliday = dayBeforeHoliday;
        return this;
    }

    public Integer getDayAfterHoliday() {
        return dayAfterHoliday;
    }

    public void setDayAfterHoliday(Integer dayAfterHoliday) {
        this.dayAfterHoliday = dayAfterHoliday;
    }

    public ServiceDay withDayAfterHoliday(Integer dayAfterHoliday) {
        this.dayAfterHoliday = dayAfterHoliday;
        return this;
    }

    public Integer getTyphoonDay() {
        return typhoonDay;
    }

    public void setTyphoonDay(Integer typhoonDay) {
        this.typhoonDay = typhoonDay;
    }

    public ServiceDay withTyphoonDay(Integer typhoonDay) {
        this.typhoonDay = typhoonDay;
        return this;
    }
}
