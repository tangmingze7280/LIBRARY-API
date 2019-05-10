package com.sbmybatis.wbapps.respository;

import com.sbmybatis.wbapps.entity.Books;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Book;
import java.util.List;

public interface BooksRepository extends JpaRepository<Books,Long>, JpaSpecificationExecutor<Books> , PagingAndSortingRepository<Books,Long> {

    List<Books> getAllByClassNum(String classNum);


    List<Books> findAllByClassNumLike(String classNum, Pageable pageable);
    @Query(value = "select *,max(t.id) from books t where instr(t.title,?) group by t.id", nativeQuery = true)
    Books findBooksByTitleLikeAndIdMAX(String title);

    @Query(value = "select t.title from books t where instr(t.title,?)>0  limit 0, 5 ", nativeQuery = true)
    List<String> findBooksNamesByTitleLike(String title);

    @Query(value = "select b.* from books b join recommended_book r on b.isbn=r.book_id where r.wechat_user_id=? limit ?,?"
            ,nativeQuery=true)
    List<Books> findAllBooksConllectionByUserCode(String userCode, int pageNum,int pageSize);
}
