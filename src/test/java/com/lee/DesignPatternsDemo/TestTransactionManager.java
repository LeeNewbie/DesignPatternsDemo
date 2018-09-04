package com.lee.DesignPatternsDemo;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @package: com.lee.DesignPatternsDemo
 * @ClassName: TestTransactionManager
 * @Description:
 * @author: liting
 * @date: 2018-07-09 14:18
 */
public class TestTransactionManager {
    public static void main(String[] args) {
        int a = TransactionDefinition.PROPAGATION_REQUIRED;
        a = TransactionDefinition.PROPAGATION_SUPPORTS;
        a = TransactionDefinition.PROPAGATION_MANDATORY;
        a = TransactionDefinition.PROPAGATION_REQUIRES_NEW;
        a = TransactionDefinition.PROPAGATION_NOT_SUPPORTED;
        a = TransactionDefinition.PROPAGATION_NEVER;
        a = TransactionDefinition.PROPAGATION_NESTED;

        int b = TransactionDefinition.ISOLATION_DEFAULT;
        b = TransactionDefinition.ISOLATION_READ_UNCOMMITTED;
        b = TransactionDefinition.ISOLATION_READ_COMMITTED;
        b = TransactionDefinition.ISOLATION_REPEATABLE_READ;
        b = TransactionDefinition.ISOLATION_SERIALIZABLE;

//        TransactionTemplate tt = new TransactionTemplate();
//        Object result = tt.execute(
//                new TransactionCallback(){
//                    /**
//                     * Gets called by {@link TransactionTemplate#execute} within a transactional context.
//                     * Does not need to care about transactions itself, although it can retrieve
//                     * and influence the status of the current transaction via the given status
//                     * object, e.g. setting rollback-only.
//                     * <p>
//                     * <p>Allows for returning a result object created within the transaction, i.e.
//                     * a domain object or a collection of domain objects. A RuntimeException thrown
//                     * by the callback is treated as application exception that enforces a rollback.
//                     * Any such exception will be propagated to the caller of the template, unless
//                     * there is a problem rolling back, in which case a TransactionException will be
//                     * thrown.
//                     *
//                     * @param status associated transaction status
//                     * @return a result object, or {@code null}
//                     * @see TransactionTemplate#execute
//                     * @see CallbackPreferringPlatformTransactionManager#execute
//                     */
//                    @Override
//                    public Object doInTransaction(TransactionStatus status) {
//                        return null;
//                    }
//                }); // 执行execute方法进行事务管理

//        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager(); //定义一个某个框架平台的TransactionManager，如JDBC、Hibernate
//        dataSourceTransactionManager.setDataSource(getJdbcTemplate().getDataSource()); // 设置数据源
//        DefaultTransactionDefinition transDef = new DefaultTransactionDefinition(); // 定义事务属性
//        transDef.setPropagationBehavior(DefaultTransactionDefinition.PROPAGATION_REQUIRED); // 设置传播行为属性
//        transDef.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
//        TransactionStatus status = dataSourceTransactionManager.getTransaction(transDef); // 获得事务状态
//        try {
//            // 数据库操作
//            dataSourceTransactionManager.commit(status);// 提交
//        } catch (Exception e) {
//            dataSourceTransactionManager.rollback(status);// 回滚
//        }
    }
}
