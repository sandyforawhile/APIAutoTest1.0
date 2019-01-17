package com.sandy.domain;

import java.io.Serializable;
import java.util.Date;

public class Domain implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.sysno
     *
     * @mbggenerated
     */
    private Long sysno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.desc
     *
     * @mbggenerated
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.edit_time
     *
     * @mbggenerated
     */
    private Date editTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table domain
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.sysno
     *
     * @return the value of domain.sysno
     *
     * @mbggenerated
     */
    public Long getSysno() {
        return sysno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.sysno
     *
     * @param sysno the value for domain.sysno
     *
     * @mbggenerated
     */
    public void setSysno(Long sysno) {
        this.sysno = sysno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.desc
     *
     * @return the value of domain.desc
     *
     * @mbggenerated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.desc
     *
     * @param desc the value for domain.desc
     *
     * @mbggenerated
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.edit_time
     *
     * @return the value of domain.edit_time
     *
     * @mbggenerated
     */
    public Date getEditTime() {
        return editTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.edit_time
     *
     * @param editTime the value for domain.edit_time
     *
     * @mbggenerated
     */
    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Domain other = (Domain) that;
        return (this.getSysno() == null ? other.getSysno() == null : this.getSysno().equals(other.getSysno()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getEditTime() == null ? other.getEditTime() == null : this.getEditTime().equals(other.getEditTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSysno() == null) ? 0 : getSysno().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getEditTime() == null) ? 0 : getEditTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sysno=").append(sysno);
        sb.append(", desc=").append(desc);
        sb.append(", editTime=").append(editTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}