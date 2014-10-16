// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package jp.com.inotaku.service;

import java.util.List;
import jp.com.inotaku.domain.Book;
import jp.com.inotaku.repository.BookRipository;
import jp.com.inotaku.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect BookServiceImpl_Roo_Service {
    
    declare @type: BookServiceImpl: @Service;
    
    declare @type: BookServiceImpl: @Transactional;
    
    @Autowired
    BookRipository BookServiceImpl.bookRipository;
    
    public long BookServiceImpl.countAllBooks() {
        return bookRipository.count();
    }
    
    public void BookServiceImpl.deleteBook(Book book) {
        bookRipository.delete(book);
    }
    
    public Book BookServiceImpl.findBook(Long id) {
        return bookRipository.findOne(id);
    }
    
    public List<Book> BookServiceImpl.findAllBooks() {
        return bookRipository.findAll();
    }
    
    public List<Book> BookServiceImpl.findBookEntries(int firstResult, int maxResults) {
        return bookRipository.findAll(new org.springframework.data.domain.PageRequest(firstResult / maxResults, maxResults)).getContent();
    }
    
    public void BookServiceImpl.saveBook(Book book) {
        bookRipository.save(book);
    }
    
    public Book BookServiceImpl.updateBook(Book book) {
        return bookRipository.save(book);
    }
    
}