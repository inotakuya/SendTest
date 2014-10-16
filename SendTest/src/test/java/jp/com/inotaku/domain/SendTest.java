package jp.com.inotaku.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/resources/META-INF/spring/send.xml")
public class SendTest {

	@Autowired
	private MessageChannel inchannel;

	private Book book;

	@Before
	public void init() {
		book = new Book();
		book.setBookId(1234);
		book.setBookName("スプリング");
		book.setPrice(1000);
	}

	@Test
	public void test() {
		Message<Book> message = MessageBuilder.withPayload(book)
				.setHeader("status", "update").build();

		inchannel.send(message);
	}

}
