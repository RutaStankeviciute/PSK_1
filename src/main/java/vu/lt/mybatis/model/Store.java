package vu.lt.mybatis.model;

public class Store {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.STORE.ID
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.STORE.NAME
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.STORE.ID
     *
     * @return the value of PUBLIC.STORE.ID
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.STORE.ID
     *
     * @param id the value for PUBLIC.STORE.ID
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.STORE.NAME
     *
     * @return the value of PUBLIC.STORE.NAME
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.STORE.NAME
     *
     * @param name the value for PUBLIC.STORE.NAME
     *
     * @mbg.generated Tue May 12 11:36:32 EEST 2020
     */
    public void setName(String name) {
        this.name = name;
    }
}