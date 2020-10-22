package entity;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiDataHeader {
    @SerializedName("UpdateTime")
    @Expose
    private String updateTime;
    @SerializedName("UpdateInterval")
    @Expose
    private Integer updateInterval;
    @SerializedName("SrcUpdateTime")
    @Expose
    private String srcUpdateTime;
    @SerializedName("SrcUpdateInterval")
    @Expose
    private Integer srcUpdateInterval;
    @SerializedName("AuthorityCode")
    @Expose
    private String authorityCode;
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ApiDataHeader withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getUpdateInterval() {
        return updateInterval;
    }

    public void setUpdateInterval(Integer updateInterval) {
        this.updateInterval = updateInterval;
    }

    public ApiDataHeader withUpdateInterval(Integer updateInterval) {
        this.updateInterval = updateInterval;
        return this;
    }

    public String getSrcUpdateTime() {
        return srcUpdateTime;
    }

    public void setSrcUpdateTime(String srcUpdateTime) {
        this.srcUpdateTime = srcUpdateTime;
    }

    public ApiDataHeader withSrcUpdateTime(String srcUpdateTime) {
        this.srcUpdateTime = srcUpdateTime;
        return this;
    }

    public Integer getSrcUpdateInterval() {
        return srcUpdateInterval;
    }

    public void setSrcUpdateInterval(Integer srcUpdateInterval) {
        this.srcUpdateInterval = srcUpdateInterval;
    }

    public ApiDataHeader withSrcUpdateInterval(Integer srcUpdateInterval) {
        this.srcUpdateInterval = srcUpdateInterval;
        return this;
    }

    public String getAuthorityCode() {
        return authorityCode;
    }

    public void setAuthorityCode(String authorityCode) {
        this.authorityCode = authorityCode;
    }

    public ApiDataHeader withAuthorityCode(String authorityCode) {
        this.authorityCode = authorityCode;
        return this;
    }
}
