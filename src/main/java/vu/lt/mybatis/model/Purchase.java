package vu.lt.mybatis.model;

public class Purchase {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PURCHASE.ID
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PURCHASE.NAME
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PURCHASE.ID
     *
     * @return the value of PUBLIC.PURCHASE.ID
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PURCHASE.ID
     *
     * @param id the value for PUBLIC.PURCHASE.ID
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PURCHASE.NAME
     *
     * @return the value of PUBLIC.PURCHASE.NAME
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PURCHASE.NAME
     *
     * @param name the value for PUBLIC.PURCHASE.NAME
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    public void setName(String name) {
        this.name = name;
    }
}