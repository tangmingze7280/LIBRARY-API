package com.sbmybatis.wbapps.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

    private Long id;
    private String wxCode;//微信号
    private String bookListNum;//书单号
    private String userName;//用户微信名
    private String bkUsered;//接触的书籍以{xx,xx}的形式存入
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
    @Column
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getBkUsered() {
        return bkUsered;
    }

    public void setBkUsered(String bkUsered) {
        this.bkUsered = bkUsered;
    }

    @Override
    public String toString() {
        return "WxUser{" +
                "id=" + id +
                ", wxCode='" + wxCode + '\'' +
                ", bookListNum='" + bookListNum + '\'' +
                ", userName='" + userName + '\'' +
                ", bkUsered='" + bkUsered + '\'' +
                '}';
    }
}
