package com.sbmybatis.wbapps.bean;


public class ReviewsMap {
    private String wxId;
    private String content;
    private Integer source;
    private String userName;
    private String userImgurl;
    private String bookName;
    private String ptime;
    private Integer id;
    public ReviewsMap() {
    }

    public ReviewsMap(String wxId, String content, Integer source, String userName, String userImgurl, String bookName, String ptime, Integer id) {
        this.wxId = wxId;
        this.content = content;
        this.source = source;
        this.userName = userName;
        this.userImgurl = userImgurl;
        this.bookName = bookName;
        this.ptime = ptime;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImgurl() {
        return userImgurl;
    }

    public void setUserImgurl(String userImgurl) {
        this.userImgurl = userImgurl;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }
}
