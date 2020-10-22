package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import entity.components.Line;
import entity.components.NetworkMapURL;
import entity.components.NetworkName;
import entity.components.OperatorName;

import java.util.List;

public class Network extends ApiDataHeader{

    @SerializedName("Networks")
    @Expose
    private List<Networks> networks = null;

    public List<Networks> getNetworks() {
        return networks;
    }

    public void setNetworks(List<Networks> networks) {
        this.networks = networks;
    }

    public class Networks {
        @SerializedName("NetworkID")
        @Expose
        private String networkID;
        @SerializedName("NetworkName")
        @Expose
        private NetworkName networkName;
        @SerializedName("OperatorCode")
        @Expose
        private String operatorCode;
        @SerializedName("OperatorName")
        @Expose
        private OperatorName operatorName;
        @SerializedName("NetworkMapURL")
        @Expose
        private NetworkMapURL networkMapURL;
        @SerializedName("Lines")
        @Expose
        private List<Line> lines = null;

        public String getNetworkID() {
            return networkID;
        }

        public void setNetworkID(String networkID) {
            this.networkID = networkID;
        }

        public NetworkName getNetworkName() {
            return networkName;
        }

        public void setNetworkName(NetworkName networkName) {
            this.networkName = networkName;
        }

        public Networks withNetworkName(NetworkName networkName) {
            this.networkName = networkName;
            return this;
        }

        public String getOperatorCode() {
            return operatorCode;
        }

        public void setOperatorCode(String operatorCode) {
            this.operatorCode = operatorCode;
        }

        public Networks withOperatorCode(String operatorCode) {
            this.operatorCode = operatorCode;
            return this;
        }

        public OperatorName getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(OperatorName operatorName) {
            this.operatorName = operatorName;
        }

        public Networks withOperatorName(OperatorName operatorName) {
            this.operatorName = operatorName;
            return this;
        }

        public NetworkMapURL getNetworkMapURL() {
            return networkMapURL;
        }

        public void setNetworkMapURL(NetworkMapURL networkMapURL) {
            this.networkMapURL = networkMapURL;
        }

        public Networks withNetworkMapURL(NetworkMapURL networkMapURL) {
            this.networkMapURL = networkMapURL;
            return this;
        }

        public List<Line> getLines() {
            return lines;
        }

        public void setLines(List<Line> lines) {
            this.lines = lines;
        }

        public Networks withLines(List<Line> lines) {
            this.lines = lines;
            return this;
        }
    }

}
