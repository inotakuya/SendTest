// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package jp.com.inotaku.domain;

import java.io.Serializable;
import jp.com.inotaku.domain.Book;

privileged aspect Book_Roo_Serializable {
    
    declare parents: Book implements Serializable;
    
    private static final long Book.serialVersionUID = 1L;
    
}
