package app;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.common.dao.T0a9CustomMapper;
import com.common.dao.T105Mapper;
import com.common.dao.model.T0a9;
import com.common.dao.model.T105;
import com.common.dao.model.T105Example;

public class TestMain {
	
	Logger log = Logger.getLogger(this.getClass());
	
    public static void main(String[] args) throws Exception {
    	
    	String userProfile = System.getProperty("user.home");
        System.out.println( "�ڑ����͉��L�t�@�C������擾���܂��B" );
    	String resourcepath = String.format("%s\\_comture\\jdbc.properties", userProfile);
        System.out.println( resourcepath );

        Properties props = new Properties();        
        InputStream inputStream = new FileInputStream(new File(resourcepath));
        props.load(inputStream);
        
        // �����[�g�ƂȂ�ݒ�t�@�C����ǂݍ���
        try (InputStream in = TestMain.class.getResourceAsStream("/mybatis-config.xml")) {
//        try (InputStream in = new FileInputStream(resourcepath)) {
            // ���ݒ�t�@�C�������ɁA SqlSessionFactory ���쐬����
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in, props);
            // ��SqlSessionFactory ���� SqlSession �𐶐�����
            try (SqlSession session = factory.openSession()) {
                // ��SqlSession ���g���� SQL �����s����

            	T0a9CustomMapper cT0a9Mapper = session.getMapper(T0a9CustomMapper.class);
            	Map<String, String> params = new HashMap();
            	params.put("stationCd", "001");
            	params.put("contractSeq", "2574");
            	List<T0a9> t0a9List = cT0a9Mapper.findByPublicCertificate(params);

            	t0a9List.forEach(row -> {
                    System.out.println("T0A9002: " + row.getT0a9102());
                });
                
            	// �}�b�p�[���o�R����ꍇ
//            	T105Mapper mapper = session.getMapper(T105Mapper.class);
//            	T105Example params = new T105Example();
//            	params.createCriteria().andT105001EqualTo("001");
//            	List<T105> result = mapper.selectByExample(params);
            	
            	// sqlmap�𒼐ڎw�肷��ꍇ
//                List<T105> result = session.selectList("com.common.dao.T105Mapper.selectByExample");

//                result.forEach(row -> {
//                    System.out.println("T105002: " + row.getT105002());
//                });
            }
        }
        catch (Exception e) {
        	e.printStackTrace();
        }
        
        System.out.println("�I�����܂���");
    }
}
