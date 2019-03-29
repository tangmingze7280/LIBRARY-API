package com.sbmybatis.wbapps.entity;

import javax.persistence.*;
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
    private String author;
    private String translator;
    private String authorIntroduction;
    private String translatorIntroduction;
    private String binding;
    private float price;
    private Integer page;
    private Integer word;
    private String description;
    private String catalog;
    private String preview;
    private String imgs;
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
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Lob
    @Column( nullable = true, columnDefinition = "Text")
    @Basic(fetch = FetchType.LAZY )//懒惰加载
    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }
    @Lob
    @Column( nullable = true, columnDefinition = "Text")
    @Basic(fetch = FetchType.LAZY )//懒惰加载
    public String getAuthorIntroduction() {
        return authorIntroduction;
    }

    public void setAuthorIntroduction(String authorIntroduction) {
        this.authorIntroduction = authorIntroduction;
    }
    @Lob
    @Column( nullable = true, columnDefinition = "Text")
    @Basic(fetch = FetchType.LAZY )//懒惰加载
    public String getTranslatorIntroduction() {
        return translatorIntroduction;
    }

    public void setTranslatorIntroduction(String translatorIntroduction) {
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
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Lob
    @Column( nullable = true, columnDefinition = "Text")
    @Basic(fetch = FetchType.LAZY )//懒惰加载
    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }
    @Lob
    @Column( nullable = true, columnDefinition = "Text")
    @Basic(fetch = FetchType.LAZY )//懒惰加载
    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }
    @Lob
    @Column( nullable = true, columnDefinition = "Text")
    @Basic(fetch = FetchType.LAZY )//懒惰加载
    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
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

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", originTitle='" + originTitle + '\'' +
                ", altTitle='" + altTitle + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", isbn='" + isbn + '\'' +
                ", language='" + language + '\'' +
                ", publisher='" + publisher + '\'' +
                ", pubdate=" + pubdate +
                ", classNum='" + classNum + '\'' +
                ", callNumber='" + callNumber + '\'' +
                ", author=" + author +
                ", translator=" + translator +
                ", authorIntroduction=" + authorIntroduction +
                ", translatorIntroduction=" + translatorIntroduction +
                ", binding='" + binding + '\'' +
                ", price=" + price +
                ", page=" + page +
                ", word=" + word +
                ", description=" + description +
                ", catalog=" + catalog +
                ", preview=" + preview +
                ", imgs=" + imgs +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", deletedAt=" + deletedAt +
                '}';
    }
}
