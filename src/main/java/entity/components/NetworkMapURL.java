package entity.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NetworkMapURL {

    @SerializedName("MapName")
    @Expose
    private String mapName;
    @SerializedName("Zh_tw")
    @Expose
    private String zhTw;
    @SerializedName("En")
    @Expose
    private String en;

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public NetworkMapURL withMapName(String mapName) {
        this.mapName = mapName;
        return this;
    }

    public String getZhTw() {
        return zhTw;
    }

    public void setZhTw(String zhTw) {
        this.zhTw = zhTw;
    }

    public NetworkMapURL withZhTw(String zhTw) {
        this.zhTw = zhTw;
        return this;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public NetworkMapURL withEn(String en) {
        this.en = en;
        return this;
    }

}