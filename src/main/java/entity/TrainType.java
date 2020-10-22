package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import entity.components.TrainTypeName;

import java.util.List;

public class TrainType extends ApiDataHeader {
    @SerializedName("TrainTypes")
    @Expose
    private List<TrainType> trainTypes = null;

    public class TrainTypes {
        @SerializedName("TrainTypeID")
        @Expose
        private String trainTypeID;
        @SerializedName("TrainTypeCode")
        @Expose
        private String trainTypeCode;
        @SerializedName("TrainTypeName")
        @Expose
        private TrainTypeName trainTypeName;

        public String getTrainTypeID() {
            return trainTypeID;
        }

        public void setTrainTypeID(String trainTypeID) {
            this.trainTypeID = trainTypeID;
        }

        public TrainTypes withTrainTypeID(String trainTypeID) {
            this.trainTypeID = trainTypeID;
            return this;
        }

        public String getTrainTypeCode() {
            return trainTypeCode;
        }

        public void setTrainTypeCode(String trainTypeCode) {
            this.trainTypeCode = trainTypeCode;
        }

        public TrainTypes withTrainTypeCode(String trainTypeCode) {
            this.trainTypeCode = trainTypeCode;
            return this;
        }

        public TrainTypeName getTrainTypeName() {
            return trainTypeName;
        }

        public void setTrainTypeName(TrainTypeName trainTypeName) {
            this.trainTypeName = trainTypeName;
        }

        public TrainTypes withTrainTypeName(TrainTypeName trainTypeName) {
            this.trainTypeName = trainTypeName;
            return this;
        }
    }
}
