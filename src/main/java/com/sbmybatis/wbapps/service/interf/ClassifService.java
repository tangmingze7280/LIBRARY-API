package com.sbmybatis.wbapps.service.interf;

import com.sbmybatis.wbapps.entity.Classifications;
import org.springframework.stereotype.Component;

import java.util.List;

public interface ClassifService {

    default  List<Classifications> getClassType(){
        return null;
    }
    default List<Classifications> getClassChildrenByPa(){
        return null;
    }
    default List<Classifications> getAllParentByNumber(){
        return null;
    }
}
