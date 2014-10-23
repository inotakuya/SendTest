package jp.com.inotaku.task;

import jp.com.inotaku.domain.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

public class SendTask {
	
	
	private Book book;
	
	private int i = 0;

	public void send(){
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/send.xml");
		MessageChannel inchannel = (MessageChannel)context.getBean("inchannel");
		
		book = new Book();
		book.setBookId(i);
		book.setBookName("スプリング");
		book.setPrice(1000);
		
		Message<Book> message = MessageBuilder.withPayload(book)
				.setHeader("status", "update").build();

		inchannel.send(message);
		
		System.out.println("hello world" + i);
		i++;
	}
}
