package hello.proxy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//@SpringBootTest
@Slf4j
class ProxyApplicationTests {

	/*@Test
	void contextLoads() {
	}*/


	@Test
	void tempTest() {

		Iterator<String> currentArgument;
		List<String> argsList = new ArrayList<>();

		argsList.add("a");
		argsList.add("b");
		argsList.add("c");
		log.info("devlog iterator : {}", argsList.iterator());
		for (currentArgument = argsList.iterator(); currentArgument.hasNext(); ) {
			String arg = currentArgument.next();
			log.info("devlog currentArgument : {}", arg);
		}
	}


}
