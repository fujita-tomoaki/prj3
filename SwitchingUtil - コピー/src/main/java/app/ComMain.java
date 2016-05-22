package app;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.common.dao.model.T105;

public class ComMain {
    public static void main(String[] args) throws Exception {
    	
    	String userProfile = System.getProperty("user.home");
        System.out.println( "�ڑ����͉��L�t�@�C������擾���܂��B" );
    	String resourcepath = String.format("%s\\_comture\\jdbc.properties", userProfile);
        System.out.println( resourcepath );

        Properties props = new Properties();        
        InputStream inputStream = new FileInputStream(new File(resourcepath));
        props.load(inputStream);
        
        // �����[�g�ƂȂ�ݒ�t�@�C����ǂݍ���
        try (InputStream in = ComMain.class.getResourceAsStream("/mybatis-config.xml")) {
//        try (InputStream in = new FileInputStream(resourcepath)) {
            // ���ݒ�t�@�C�������ɁA SqlSessionFactory ���쐬����
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in, props);
            // ��SqlSessionFactory ���� SqlSession �𐶐�����
            try (SqlSession session = factory.openSession()) {
                // ��SqlSession ���g���� SQL �����s����
                List<T105> result = session.selectList("com.common.dao.T105Mapper.selectByExample");

                result.forEach(row -> {
                    System.out.println("T105002: " + row.getT105002());
                });
            }
        }
        catch (Exception e) {
        	e.printStackTrace();
        }
        
        System.out.println("�I�����܂���");
    }
}
