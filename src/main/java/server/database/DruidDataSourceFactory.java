package server.database;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.DataSourceFactory;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

public class DruidDataSourceFactory implements DataSourceFactory {
    private Properties props;
    @Override
    public void setProperties(Properties properties) {
        props = properties;
        //        try {
//            Properties pp = new Properties();
//            pp.load(new FileInputStream("src/main/resources/netty.properties"));
//            this.props = pp;
//        }catch (Exception e){
//            e.printStackTrace();
//        }

    }

    @Override
    public DataSource getDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        try {
            druidDataSource.setFilters("stat");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        druidDataSource.setDefaultAutoCommit(true);
        druidDataSource.setDriverClassName(this.props.getProperty("driver"));
        druidDataSource.setUrl(this.props.getProperty("url"));
        druidDataSource.setUsername(this.props.getProperty("username"));
        druidDataSource.setPassword(this.props.getProperty("password"));
        try {
            druidDataSource.init();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return druidDataSource;

    }
}
