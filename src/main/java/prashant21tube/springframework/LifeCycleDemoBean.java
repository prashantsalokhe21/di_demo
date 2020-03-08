/**
 * 
 */
package prashant21tube.springframework;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author lenovo
 *
 */
@Component
public class LifeCycleDemoBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,
	InitializingBean, DisposableBean{

	public LifeCycleDemoBean() {
		System.out.println("## I am in lifeCycleBean constructor");
	}
	@Override
	public void setBeanName(String name) {
		System.out.println("## My bean name is : "+ name);
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("## BeanFactory has been set");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("## The ApplicationContext has been set");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("## The lifeCycleBean has its property set!");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("## The lifeCycleBean has been terminated");
		
	}


	@PostConstruct
	public void postConstruct() {
		System.out.println("## The postConstuct method has beed called");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("## The preDestroy method has beed called");
	}
	
	public void beforeInit() {
		System.out.println("## BeforInit called by Bean post processor");
	}
	
	public void afterInit() {
		System.out.println("## After Init called by Bean post processor");
	}
}
