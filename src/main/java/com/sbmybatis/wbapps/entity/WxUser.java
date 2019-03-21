package com.sbmybatis.wbapps.entity;

import javax.persistence.*;

/**
 * @Entity wx新同步用户名
 * @howToUser 初步决定：
 * 1.用户对书书籍的评论信息 关联字段 wxCode -wx_code
 * 2.用户创建的书单信息 关联字段 bookListNum - book_list_num
 * 3.用户收藏书籍 关联字段 wx_code 与书籍表关联
 * 4.用户借用书籍 关联字段 wx_code 与书籍表关联
 * 5.用户获赞信息与被评论信息 wx_code 与评论信息表关联
 * TODO  不知道还有新增的方法没有
 * @date 2019 03/18
 */
@Entity
public class WxUser {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)//自增主键
    @Column
    private Long id;

    private String wxCode;//微信号 openId
    private String bookListNum;//书单号
    private String nickName;//用户微信名
    private String bkUsered;//接触的书籍以{xx,xx}的形式存入
    private String avatarUrl;//头像
    private String city;//市
    private String country;//国籍
    private String gender;//性别 0 1 2 未知、男性、女性
    private String language;//语言
    private String province;//省
    @Column
    public String getWxCode() {
        return wxCode;
    }

    public void setWxCode(String wxCode) {
        this.wxCode = wxCode;
    }
    @Column
    public String getBookListNum() {
        return bookListNum;
    }

    public void setBookListNum(String bookListNum) {
        this.bookListNum = bookListNum;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Column
    public String getBkUsered() {
        return bkUsered;
    }

    public void setBkUsered(String bkUsered) {
        this.bkUsered = bkUsered;
    }
    @Column
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    @Column
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
    @Column
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @Column
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    @Column
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    @Column
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    @Column
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "WxUser{" +
                "id=" + id +
                ", wxCode='" + wxCode + '\'' +
                ", bookListNum='" + bookListNum + '\'' +
                ", nickName='" + nickName + '\'' +
                ", bkUsered='" + bkUsered + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
