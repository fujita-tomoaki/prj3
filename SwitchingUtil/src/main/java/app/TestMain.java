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
        System.out.println( "接続情報は下記ファイルから取得します。" );
    	String resourcepath = String.format("%s\\_comture\\jdbc.properties", userProfile);
        System.out.println( resourcepath );

        Properties props = new Properties();        
        InputStream inputStream = new FileInputStream(new File(resourcepath));
        props.load(inputStream);
        
        // ★ルートとなる設定ファイルを読み込む
        try (InputStream in = TestMain.class.getResourceAsStream("/mybatis-config.xml")) {
//        try (InputStream in = new FileInputStream(resourcepath)) {
            // ★設定ファイルを元に、 SqlSessionFactory を作成する
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in, props);
            // ★SqlSessionFactory から SqlSession を生成する
            try (SqlSession session = factory.openSession()) {
                // ★SqlSession を使って SQL を実行する

            	T0a9CustomMapper cT0a9Mapper = session.getMapper(T0a9CustomMapper.class);
            	Map<String, String> params = new HashMap();
            	params.put("stationCd", "001");
            	params.put("contractSeq", "2574");
            	List<T0a9> t0a9List = cT0a9Mapper.findByPublicCertificate(params);

            	t0a9List.forEach(row -> {
                    System.out.println("T0A9002: " + row.getT0a9102());
                });
                
            	// マッパーを経由する場合
//            	T105Mapper mapper = session.getMapper(T105Mapper.class);
//            	T105Example params = new T105Example();
//            	params.createCriteria().andT105001EqualTo("001");
//            	List<T105> result = mapper.selectByExample(params);
            	
            	// sqlmapを直接指定する場合
//                List<T105> result = session.selectList("com.common.dao.T105Mapper.selectByExample");

//                result.forEach(row -> {
//                    System.out.println("T105002: " + row.getT105002());
//                });
            }
        }
        catch (Exception e) {
        	e.printStackTrace();
        }
        
        System.out.println("終了しました");
    }
}
