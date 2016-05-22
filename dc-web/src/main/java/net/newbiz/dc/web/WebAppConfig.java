package net.newbiz.dc.web;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

/**
 * Spring �t���[�����[�N�̐ݒ�.
 *  ���ӁF���� Java �ݒ�N���X���g�p����ɂ� Spring Framework 3.1 �ȏオ�K�v
 */
@Configuration
@EnableWebMvc
@ComponentScan("net.newbiz.dc.web")
@PropertySource("classpath:application.yml")
//@PropertySource("classpath:resources/app.properties")
public class WebAppConfig extends WebMvcConfigurerAdapter {

    @Resource
    private Environment env;
    
    //�ÓI���\�[�X�̐ݒ�
    @Override  
    public void addResourceHandlers(ResourceHandlerRegistry registry) {  
            registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");  
    }

    //�e���v���[�g���]���o�[�̐ݒ�
    @Bean
    public ServletContextTemplateResolver templateResolver() {
        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
        resolver.setPrefix("main/resources/templates");
        resolver.setSuffix(".html");
        //NB, selecting HTML5 as the template mode.
        resolver.setTemplateMode("HTML5");
        resolver.setCacheable(false);
        resolver.setCharacterEncoding("UTF-8");
        return resolver;
    }
    
    //Thymeleaf �e���v���[�g�G���W���̐ݒ�
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(templateResolver());
        return engine;
    }
    
    //Thymeleaf �r���[���]���o�[�ݒ�
    @Bean
    public ViewResolver viewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());
        viewResolver.setOrder(1);
        viewResolver.setViewNames(new String[]{"*"});
        viewResolver.setCache(false);
        viewResolver.setCharacterEncoding("UTF-8");
        return viewResolver;
    }
    
    //���b�Z�[�W�\�[�X�̐ݒ�
    //WEB�y�[�W�Ńv���p�e�B�t�@�C�����g�p�ł���
    //���{�ꃁ�b�Z�[�W�Fmessages_ja.properties 
    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename(env.getRequiredProperty("spring.messages.basename"));

        // true���Z�b�g����΁A���b�Z�[�W�̃L�[���Ȃ��ꍇ�ɃL�[��\��
        // false �̏ꍇ�ANoSuchMessageException�𓊂���
        messageSource.setUseCodeAsDefaultMessage(true);
        messageSource.setDefaultEncoding("UTF-8");
        // # -1 : �����[�h���Ȃ��A0 : ��Ƀ����[�h����
        messageSource.setCacheSeconds(0);
        return messageSource;
    }
}