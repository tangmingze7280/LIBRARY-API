package com.sbmybatis.wbapps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @howToUse 评论信息表
 * @date 2019/03/18
 */
@Entity
public class LibPerComment {
    private Long id;
    private String thSay;//评论内容
    private String wxCode;//谁评论 微信号
    private String bookName;//树名
    private Long pointAdmire;//点赞数
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getThSay() {
        return thSay;
    }

    public void setThSay(String thSay) {
        this.thSay = thSay;
    }

    public String getWxCode() {
        return wxCode;
    }

    public void setWxCode(String wxCode) {
        this.wxCode = wxCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Long getPointAdmire() {
        return pointAdmire;
    }

    public void setPointAdmire(Long pointAdmire) {
        this.pointAdmire = pointAdmire;
    }

    @Override
    public String toString() {
        return "LibPerComment{" +
                "id=" + id +
                ", thSay='" + thSay + '\'' +
                ", wxCode='" + wxCode + '\'' +
                ", bookName='" + bookName + '\'' +
                ", pointAdmire=" + pointAdmire +
                '}';
    }
}
