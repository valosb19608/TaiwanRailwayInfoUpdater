package entity.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DestinationStationName {
    @SerializedName("Zh_tw")
    @Expose
    private String zhTw;
    @SerializedName("En")
    @Expose
    private String en;

    public String getZhTw() {
        return zhTw;
    }

    public void setZhTw(String zhTw) {
        this.zhTw = zhTw;
    }

    public DestinationStationName withZhTw(String zhTw) {
        this.zhTw = zhTw;
        return this;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public DestinationStationName withEn(String en) {
        this.en = en;
        return this;
    }

}
