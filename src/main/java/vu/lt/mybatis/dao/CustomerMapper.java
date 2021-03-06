package vu.lt.mybatis.dao;

import java.util.List;
import org.mybatis.cdi.Mapper;
import vu.lt.mybatis.model.Customer;

@Mapper
public interface CustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.CUSTOMER
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.CUSTOMER
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    int insert(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.CUSTOMER
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    Customer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.CUSTOMER
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    List<Customer> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.CUSTOMER
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    int updateByPrimaryKey(Customer record);

    List<Customer> selectWithName(String a);
}