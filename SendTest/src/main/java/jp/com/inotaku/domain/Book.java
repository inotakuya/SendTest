package jp.com.inotaku.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Min;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooSerializable
public class Book {

    /**
     */
    @NotNull
    @Column(unique = true)
    private long bookId;

    /**
     */
    @NotNull
    private String bookName;

    /**
     */
    @NotNull
    @Min(0L)
    private int price;
}
