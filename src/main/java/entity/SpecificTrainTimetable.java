package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import entity.components.TrainTimetable;

import java.util.List;

public class SpecificTrainTimetable extends ApiDataHeader{
    @SerializedName("TrainTimetables")
    @Expose
    private List<TrainTimetable> trainTimetables = null;
}
