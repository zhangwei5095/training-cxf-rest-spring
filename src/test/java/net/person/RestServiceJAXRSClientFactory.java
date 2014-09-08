package net.person;

import javax.annotation.Resource;

import net.person.api.RESTSample;
import net.person.domain.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * 类似本地代理方式：<br>
 * 
 * 如果是本地创建： RESTSample sample = JAXRSClientFactory.create(
 * "http://localhost:8000/training-cxf-rest-spring/services/rest/",
 * RESTSample.class);
 * 
 * 
 * 
 * @author Percy
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-client.xml")
public class RestServiceJAXRSClientFactory {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name = "restSampleBean")
	private RESTSample restSample;
	
	@Test
	public void testGetBean(){
		
		log.info("测试第二种方式客户端");
		User user = restSample.getBean(1);
		log.info("User:" + user.toString());
	}
}
