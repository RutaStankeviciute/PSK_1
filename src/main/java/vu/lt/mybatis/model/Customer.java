package vu.lt.mybatis.model;

public class Customer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.CUSTOMER.ID
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.CUSTOMER.NAME
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.CUSTOMER.STORE_ID
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    private Integer storeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.CUSTOMER.ID
     *
     * @return the value of PUBLIC.CUSTOMER.ID
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.CUSTOMER.ID
     *
     * @param id the value for PUBLIC.CUSTOMER.ID
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.CUSTOMER.NAME
     *
     * @return the value of PUBLIC.CUSTOMER.NAME
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.CUSTOMER.NAME
     *
     * @param name the value for PUBLIC.CUSTOMER.NAME
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.CUSTOMER.STORE_ID
     *
     * @return the value of PUBLIC.CUSTOMER.STORE_ID
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.CUSTOMER.STORE_ID
     *
     * @param storeId the value for PUBLIC.CUSTOMER.STORE_ID
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}