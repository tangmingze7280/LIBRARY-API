package com.sbmybatis.wbapps.respository;

import com.sbmybatis.wbapps.entity.Books;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BooksRepository extends JpaRepository<Books,Long>, JpaSpecificationExecutor<Books> , PagingAndSortingRepository<Books,Long> {

    List<Books> getAllByClassNum(String classNum);


    List<Books> findAllByClassNumLike(String classNum, Pageable pageable);
    Books findBooksByTitleLike(String title);
}
