package com.sbmybatis.wbapps.entity;
import javax.persistence.*;

@Entity(name = "tb_student")
public class Student {
    //标注用于声明一个实体类的属性映射为数据库的主键列。
    // 该属性通常置于属性声明语句之前，可与声明语句同行，
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //生成自增主键
    @Column(name = "id", length = 32)
    private Long id;
    @Column(length = 50)
    private String name;
    @Column(length = 3)
    private Integer age;

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}