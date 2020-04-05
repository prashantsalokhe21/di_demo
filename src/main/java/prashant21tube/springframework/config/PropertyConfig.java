package prashant21tube.springframework.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import prashant21tube.springframework.propertybeans.FakeDataSource;
import prashant21tube.springframework.propertybeans.FakeJmsBroker;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
@PropertySources({
	@PropertySource("classpath:datasource.properties"),
	@PropertySource("classpath:jms.properties")
})
public class PropertyConfig {
	
	@Autowired
	Environment env;
	
	@Value("${sqldb.username}")
	String username;
	
	@Value("${sqldb.password}")
	String password;
	
	@Value("${sqldb.url}")
	String url;
	
	@Value("${jms.username}")
	String jmsUsername;
	
	@Value("${jms.password}")
	String jmspassword;
	
	@Value("${jms.url}")
	String jmsUrl;
	 
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource dataSource = new FakeDataSource();
		//dataSource.setUsername(username);
		/**
		 * Use Environment variable which is set in Environment
		 */
		dataSource.setUsername(env.getProperty("USERNAME"));
		dataSource.setPassword(password);
		dataSource.setUrl(url);
		return dataSource;
	}
	
	@Bean
	public FakeJmsBroker FakeJmsBroker() {
		FakeJmsBroker broker = new FakeJmsBroker();
		broker.setUsername(jmsUsername);
		broker.setPassword(jmspassword);
		broker.setUrl(jmsUrl);
		return broker;		
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
}
