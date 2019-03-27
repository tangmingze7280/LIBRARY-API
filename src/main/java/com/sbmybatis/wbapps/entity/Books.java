package com.sbmybatis.wbapps.entity;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;

@Entity
public class Books {
    private Long id;
    private String title;
    private String originTitle;
    private String altTitle;
    private String subtitle;
    private String isbn;
    private String language;
    private String publisher;
    private Date pubdate;
    private String classNum;
    private String callNumber;
    private Blob author;
    private Blob translator;
    private Blob authorIntroduction;
    private Blob translatorIntroduction;
    private String binding;
    private float price;
    private Integer page;
    private Integer word;
    private Blob description;
    private Blob catalog;
    private Blob preview;
    private Blob imgs;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginTitle() {
        return originTitle;
    }

    public void setOriginTitle(String originTitle) {
        this.originTitle = originTitle;
    }

    public String getAltTitle() {
        return altTitle;
    }

    public void setAltTitle(String altTitle) {
        this.altTitle = altTitle;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }
    @Lob
    @Column( nullable = true, columnDefinition = "Text")
    @Basic(fetch = FetchType.LAZY )//懒惰加载
    public Blob getAuthor() {
        return author;
    }

    public void setAuthor(Blob author) {
        this.author = author;
    }
    @Lob
    @Column( nullable = true, columnDefinition = "Text")
    @Basic(fetch = FetchType.LAZY )//懒惰加载
    public Blob getTranslator() {
        return translator;
    }

    public void setTranslator(Blob translator) {
        this.translator = translator;
    }
    @Lob
    @Column( nullable = true, columnDefinition = "Text")
    @Basic(fetch = FetchType.LAZY )//懒惰加载
    public Blob getAuthorIntroduction() {
        return authorIntroduction;
    }

    public void setAuthorIntroduction(Blob authorIntroduction) {
        this.authorIntroduction = authorIntroduction;
    }
    @Lob
    @Column( nullable = true, columnDefinition = "Text")
    @Basic(fetch = FetchType.LAZY )//懒惰加载
    public Blob getTranslatorIntroduction() {
        return translatorIntroduction;
    }

    public void setTranslatorIntroduction(Blob translatorIntroduction) {
        this.translatorIntroduction = translatorIntroduction;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getWord() {
        return word;
    }

    public void setWord(Integer word) {
        this.word = word;
    }
    @Lob
    @Column( nullable = true, columnDefinition = "Text")
    @Basic(fetch = FetchType.LAZY )//懒惰加载
    public Blob getDescription() {
        return description;
    }

    public void setDescription(Blob description) {
        this.description = description;
    }
    @Lob
    @Column( nullable = true, columnDefinition = "Text")
    @Basic(fetch = FetchType.LAZY )//懒惰加载
    public Blob getCatalog() {
        return catalog;
    }

    public void setCatalog(Blob catalog) {
        this.catalog = catalog;
    }
    @Lob
    @Column( nullable = true, columnDefinition = "Text")
    @Basic(fetch = FetchType.LAZY )//懒惰加载
    public Blob getPreview() {
        return preview;
    }

    public void setPreview(Blob preview) {
        this.preview = preview;
    }
    @Lob
    @Column( nullable = true, columnDefinition = "Text")
    @Basic(fetch = FetchType.LAZY )//懒惰加载
    public Blob getImgs() {
        return imgs;
    }

    public void setImgs(Blob imgs) {
        this.imgs = imgs;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}
