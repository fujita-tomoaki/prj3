package net.newbiz.ebil.system.dao.model;

import java.util.Date;

public class MSysUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_sys_user.sys_user_id
     *
     * @mbggenerated
     */
    private String sysUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_sys_user.sys_user_nm
     *
     * @mbggenerated
     */
    private String sysUserNm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_sys_user.sys_state_cd
     *
     * @mbggenerated
     */
    private Short sysStateCd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_sys_user.creater
     *
     * @mbggenerated
     */
    private String creater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_sys_user.create_timestamp
     *
     * @mbggenerated
     */
    private Date createTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_sys_user.updater
     *
     * @mbggenerated
     */
    private String updater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_sys_user.update_timestamp
     *
     * @mbggenerated
     */
    private Date updateTimestamp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_sys_user.sys_user_id
     *
     * @return the value of m_sys_user.sys_user_id
     *
     * @mbggenerated
     */
    public String getSysUserId() {
        return sysUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_sys_user.sys_user_id
     *
     * @param sysUserId the value for m_sys_user.sys_user_id
     *
     * @mbggenerated
     */
    public void setSysUserId(String sysUserId) {
        this.sysUserId = sysUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_sys_user.sys_user_nm
     *
     * @return the value of m_sys_user.sys_user_nm
     *
     * @mbggenerated
     */
    public String getSysUserNm() {
        return sysUserNm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_sys_user.sys_user_nm
     *
     * @param sysUserNm the value for m_sys_user.sys_user_nm
     *
     * @mbggenerated
     */
    public void setSysUserNm(String sysUserNm) {
        this.sysUserNm = sysUserNm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_sys_user.sys_state_cd
     *
     * @return the value of m_sys_user.sys_state_cd
     *
     * @mbggenerated
     */
    public Short getSysStateCd() {
        return sysStateCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_sys_user.sys_state_cd
     *
     * @param sysStateCd the value for m_sys_user.sys_state_cd
     *
     * @mbggenerated
     */
    public void setSysStateCd(Short sysStateCd) {
        this.sysStateCd = sysStateCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_sys_user.creater
     *
     * @return the value of m_sys_user.creater
     *
     * @mbggenerated
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_sys_user.creater
     *
     * @param creater the value for m_sys_user.creater
     *
     * @mbggenerated
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_sys_user.create_timestamp
     *
     * @return the value of m_sys_user.create_timestamp
     *
     * @mbggenerated
     */
    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_sys_user.create_timestamp
     *
     * @param createTimestamp the value for m_sys_user.create_timestamp
     *
     * @mbggenerated
     */
    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_sys_user.updater
     *
     * @return the value of m_sys_user.updater
     *
     * @mbggenerated
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_sys_user.updater
     *
     * @param updater the value for m_sys_user.updater
     *
     * @mbggenerated
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_sys_user.update_timestamp
     *
     * @return the value of m_sys_user.update_timestamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_sys_user.update_timestamp
     *
     * @param updateTimestamp the value for m_sys_user.update_timestamp
     *
     * @mbggenerated
     */
    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }
}