package com.sbmybatis.wbapps.respository;

import com.sbmybatis.wbapps.entity.Books;
import com.sbmybatis.wbapps.entity.RecommendedBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface RecomBookRepository extends JpaRepository<RecommendedBook,Integer>, JpaSpecificationExecutor<RecommendedBook>, PagingAndSortingRepository<RecommendedBook,Integer> {

}
