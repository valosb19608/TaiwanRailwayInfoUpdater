package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class News extends ApiDataHeader{
    @SerializedName("Newses")
    @Expose
    private List<Newses> newses = null;

    public List<Newses> getNewses() {
        return newses;
    }

    public void setNewses(List<Newses> newses) {
        this.newses = newses;
    }

    public class Newses {
        @SerializedName("NewsID")
        @Expose
        private String newsID;
        @SerializedName("Language")
        @Expose
        private Integer language;
        @SerializedName("Title")
        @Expose
        private String title;
        @SerializedName("NewsCategory")
        @Expose
        private Integer newsCategory;
        @SerializedName("Description")
        @Expose
        private String description;
        @SerializedName("NewsURL")
        @Expose
        private String newsURL;
        @SerializedName("AttachmentURL")
        @Expose
        private String attachmentURL;
        @SerializedName("StartTime")
        @Expose
        private String startTime;
        @SerializedName("EndTime")
        @Expose
        private String endTime;
        @SerializedName("PublishTime")
        @Expose
        private String publishTime;
        @SerializedName("UpdateTime")
        @Expose
        private String updateTime;

        public String getNewsID() {
            return newsID;
        }

        public void setNewsID(String newsID) {
            this.newsID = newsID;
        }

        public Newses withNewsID(String newsID) {
            this.newsID = newsID;
            return this;
        }

        public Integer getLanguage() {
            return language;
        }

        public void setLanguage(Integer language) {
            this.language = language;
        }

        public Newses withLanguage(Integer language) {
            this.language = language;
            return this;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Newses withTitle(String title) {
            this.title = title;
            return this;
        }

        public Integer getNewsCategory() {
            return newsCategory;
        }

        public void setNewsCategory(Integer newsCategory) {
            this.newsCategory = newsCategory;
        }

        public Newses withNewsCategory(Integer newsCategory) {
            this.newsCategory = newsCategory;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Newses withDescription(String description) {
            this.description = description;
            return this;
        }

        public String getNewsURL() {
            return newsURL;
        }

        public void setNewsURL(String newsURL) {
            this.newsURL = newsURL;
        }

        public Newses withNewsURL(String newsURL) {
            this.newsURL = newsURL;
            return this;
        }

        public String getAttachmentURL() {
            return attachmentURL;
        }

        public void setAttachmentURL(String attachmentURL) {
            this.attachmentURL = attachmentURL;
        }

        public Newses withAttachmentURL(String attachmentURL) {
            this.attachmentURL = attachmentURL;
            return this;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public Newses withStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public Newses withEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public String getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(String publishTime) {
            this.publishTime = publishTime;
        }

        public Newses withPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public Newses withUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
    }

}