package server;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.DataSourceFactory;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;
/**
 * @author yujian
 * @email 754369677@qq.com
 * 数据库连接池配置
 */
public class DruidDataSourceFactory implements DataSourceFactory {
    private Properties props;
    @Override
    public void setProperties(Properties properties) {
        props = properties;

    }

    @Override
    public DataSource getDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDefaultAutoCommit(false);
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
