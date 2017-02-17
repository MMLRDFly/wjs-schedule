package com.wjs.schedule.domain.exec;

import java.io.Serializable;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CuckooClientJobDetail implements Serializable {
    /**
     * 标准ID -- cuckoo_client_job_detail.id
     * 
     */
    private Long id;

    /**
     * 作业执行应用名 -- cuckoo_client_job_detail.job_class_application
     * 
     */
    private String jobClassApplication;

    /**
     * 执行器IP -- cuckoo_client_job_detail.cuckoo_client_ip
     * 
     */
    private String cuckooClientIp;

    /**
     * 客户端标识 -- cuckoo_client_job_detail.cuckoo_client_tag
     * 
     */
    private String cuckooClientTag;

    /**
     * 客户端状态 -- cuckoo_client_job_detail.cuckoo_client_status
     * 
     */
    private String cuckooClientStatus;

    /**
     * 任务名称 -- cuckoo_client_job_detail.job_name
     * 
     */
    private String jobName;

    /**
     * 实现类名称 -- cuckoo_client_job_detail.bean_name
     * 
     */
    private String beanName;

    /**
     * 方法名称 -- cuckoo_client_job_detail.method_name
     * 
     */
    private String methodName;

    /**
     * 创建时间 -- cuckoo_client_job_detail.create_date
     * 
     */
    private Long createDate;

    /**
     * 修改时间 -- cuckoo_client_job_detail.modify_date
     * 
     */
    private Long modifyDate;

    /**
     * cuckoo_client_job_detail表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 cuckoo_client_job_detail.id的get方法 
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 cuckoo_client_job_detail.id的set方法
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 cuckoo_client_job_detail.job_class_application的get方法 
     * 
     */
    public String getJobClassApplication() {
        return jobClassApplication;
    }

    /**
     * 数据字段 cuckoo_client_job_detail.job_class_application的set方法
     * 
     */
    public void setJobClassApplication(String jobClassApplication) {
        this.jobClassApplication = jobClassApplication == null ? null : jobClassApplication.trim();
    }

    /**
     * 数据字段 cuckoo_client_job_detail.cuckoo_client_ip的get方法 
     * 
     */
    public String getCuckooClientIp() {
        return cuckooClientIp;
    }

    /**
     * 数据字段 cuckoo_client_job_detail.cuckoo_client_ip的set方法
     * 
     */
    public void setCuckooClientIp(String cuckooClientIp) {
        this.cuckooClientIp = cuckooClientIp == null ? null : cuckooClientIp.trim();
    }

    /**
     * 数据字段 cuckoo_client_job_detail.cuckoo_client_tag的get方法 
     * 
     */
    public String getCuckooClientTag() {
        return cuckooClientTag;
    }

    /**
     * 数据字段 cuckoo_client_job_detail.cuckoo_client_tag的set方法
     * 
     */
    public void setCuckooClientTag(String cuckooClientTag) {
        this.cuckooClientTag = cuckooClientTag == null ? null : cuckooClientTag.trim();
    }

    /**
     * 数据字段 cuckoo_client_job_detail.cuckoo_client_status的get方法 
     * 
     */
    public String getCuckooClientStatus() {
        return cuckooClientStatus;
    }

    /**
     * 数据字段 cuckoo_client_job_detail.cuckoo_client_status的set方法
     * 
     */
    public void setCuckooClientStatus(String cuckooClientStatus) {
        this.cuckooClientStatus = cuckooClientStatus == null ? null : cuckooClientStatus.trim();
    }

    /**
     * 数据字段 cuckoo_client_job_detail.job_name的get方法 
     * 
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * 数据字段 cuckoo_client_job_detail.job_name的set方法
     * 
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /**
     * 数据字段 cuckoo_client_job_detail.bean_name的get方法 
     * 
     */
    public String getBeanName() {
        return beanName;
    }

    /**
     * 数据字段 cuckoo_client_job_detail.bean_name的set方法
     * 
     */
    public void setBeanName(String beanName) {
        this.beanName = beanName == null ? null : beanName.trim();
    }

    /**
     * 数据字段 cuckoo_client_job_detail.method_name的get方法 
     * 
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * 数据字段 cuckoo_client_job_detail.method_name的set方法
     * 
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    /**
     * 数据字段 cuckoo_client_job_detail.create_date的get方法 
     * 
     */
    public Long getCreateDate() {
        return createDate;
    }

    /**
     * 数据字段 cuckoo_client_job_detail.create_date的set方法
     * 
     */
    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    /**
     * 数据字段 cuckoo_client_job_detail.modify_date的get方法 
     * 
     */
    public Long getModifyDate() {
        return modifyDate;
    }

    /**
     * 数据字段 cuckoo_client_job_detail.modify_date的set方法
     * 
     */
    public void setModifyDate(Long modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}