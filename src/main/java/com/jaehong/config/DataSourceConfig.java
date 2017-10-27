package com.jaehong.config;

//@Configuration
//@PropertySource("classpath:/config/default-config.properties")
//@MapperScan(value="com.jaehong.dao",sqlSessionFactoryRef="assetDbSessionFactory")
public class DataSourceConfig {
	
	/*@Autowired
    private DataSourceProperties ds;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Bean
	public DataSource datasource() {
		HashMap<String,String> dsProp = ds.getDatasource();
		BasicDataSource datasource = new BasicDataSource();
		datasource.setUrl(dsProp.get("url"));
		datasource.setDriverClassName(dsProp.get("driver"));
		datasource.setInitialSize(Integer.parseInt(dsProp.get("initialSize")));
		datasource.setMaxIdle(Integer.parseInt(dsProp.get("maxIdle")));
		datasource.setPassword(dsProp.get("password"));
		datasource.setUsername(dsProp.get("username"));
		return datasource;
	}
	
	@Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource)throws Exception{
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setMapperLocations(applicationContext.getResources("classpath:/sql/*.xml"));
        sessionFactory.setDataSource(datasource());
            return sessionFactory.getObject();
    }
	
	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(datasource());
	}
	
	@Bean 
	public SqlSession sqlSessionForMyBatis(SqlSessionFactory sqlSessionFactory) {
		  return new SqlSessionTemplate(sqlSessionFactory);
		 }*/
}
