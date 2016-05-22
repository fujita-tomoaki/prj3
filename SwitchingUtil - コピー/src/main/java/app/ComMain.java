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
        System.out.println( "接続情報は下記ファイルから取得します。" );
    	String resourcepath = String.format("%s\\_comture\\jdbc.properties", userProfile);
        System.out.println( resourcepath );

        Properties props = new Properties();        
        InputStream inputStream = new FileInputStream(new File(resourcepath));
        props.load(inputStream);
        
        // ★ルートとなる設定ファイルを読み込む
        try (InputStream in = ComMain.class.getResourceAsStream("/mybatis-config.xml")) {
//        try (InputStream in = new FileInputStream(resourcepath)) {
            // ★設定ファイルを元に、 SqlSessionFactory を作成する
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in, props);
            // ★SqlSessionFactory から SqlSession を生成する
            try (SqlSession session = factory.openSession()) {
                // ★SqlSession を使って SQL を実行する
                List<T105> result = session.selectList("com.common.dao.T105Mapper.selectByExample");

                result.forEach(row -> {
                    System.out.println("T105002: " + row.getT105002());
                });
            }
        }
        catch (Exception e) {
        	e.printStackTrace();
        }
        
        System.out.println("終了しました");
    }
}
