package net.newbiz.ebil.billing.dao.model;

public class TCustLinkKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cust_link.src_cust_cd
     *
     * @mbggenerated
     */
    private Integer srcCustCd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_cust_link.tgt_cust_cd
     *
     * @mbggenerated
     */
    private Integer tgtCustCd;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cust_link.src_cust_cd
     *
     * @return the value of t_cust_link.src_cust_cd
     *
     * @mbggenerated
     */
    public Integer getSrcCustCd() {
        return srcCustCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cust_link.src_cust_cd
     *
     * @param srcCustCd the value for t_cust_link.src_cust_cd
     *
     * @mbggenerated
     */
    public void setSrcCustCd(Integer srcCustCd) {
        this.srcCustCd = srcCustCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_cust_link.tgt_cust_cd
     *
     * @return the value of t_cust_link.tgt_cust_cd
     *
     * @mbggenerated
     */
    public Integer getTgtCustCd() {
        return tgtCustCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_cust_link.tgt_cust_cd
     *
     * @param tgtCustCd the value for t_cust_link.tgt_cust_cd
     *
     * @mbggenerated
     */
    public void setTgtCustCd(Integer tgtCustCd) {
        this.tgtCustCd = tgtCustCd;
    }
}