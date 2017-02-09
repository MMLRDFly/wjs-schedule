package com.wjs.schedule.domain.exec;

import java.util.ArrayList;
import java.util.List;

public class CuckooClientJobDetailCriteria {
    /**
     * cuckoo_client_job_detail表的操作属性:orderByClause
     * 
     */
    protected String orderByClause;

    /**
     * cuckoo_client_job_detail表的操作属性:start
     * 
     */
    protected int start;

    /**
     * cuckoo_client_job_detail表的操作属性:limit
     * 
     */
    protected int limit;

    /**
     * cuckoo_client_job_detail表的操作属性:distinct
     * 
     */
    protected boolean distinct;

    /**
     * cuckoo_client_job_detail表的操作属性:oredCriteria
     * 
     */
    protected List<Criteria> oredCriteria;

    /**
     * cuckoo_client_job_detail数据表的操作方法: CuckooClientJobDetailCriteria  
     * 
     */
    public CuckooClientJobDetailCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * cuckoo_client_job_detail数据表的操作方法: setOrderByClause  
     * 
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * cuckoo_client_job_detail数据表的操作方法: getOrderByClause  
     * 
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * cuckoo_client_job_detail数据表的操作方法: setStart  
     * 
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * cuckoo_client_job_detail数据表的操作方法: getStart  
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * cuckoo_client_job_detail数据表的操作方法: setLimit  
     * 
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * cuckoo_client_job_detail数据表的操作方法: getLimit  
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * cuckoo_client_job_detail数据表的操作方法: setDistinct  
     * 
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * cuckoo_client_job_detail数据表的操作方法: isDistinct  
     * 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * cuckoo_client_job_detail数据表的操作方法: getOredCriteria  
     * 
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * cuckoo_client_job_detail数据表的操作方法: or  
     * 
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * cuckoo_client_job_detail数据表的操作方法: or  
     * 
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * cuckoo_client_job_detail数据表的操作方法: createCriteria  
     * 
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * cuckoo_client_job_detail数据表的操作方法: createCriteriaInternal  
     * 
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * cuckoo_client_job_detail数据表的操作方法: clear  
     * 
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * cuckoo_client_job_detail表的操作类
     * 
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJobClassApplicationIsNull() {
            addCriterion("job_class_application is null");
            return (Criteria) this;
        }

        public Criteria andJobClassApplicationIsNotNull() {
            addCriterion("job_class_application is not null");
            return (Criteria) this;
        }

        public Criteria andJobClassApplicationEqualTo(String value) {
            addCriterion("job_class_application =", value, "jobClassApplication");
            return (Criteria) this;
        }

        public Criteria andJobClassApplicationNotEqualTo(String value) {
            addCriterion("job_class_application <>", value, "jobClassApplication");
            return (Criteria) this;
        }

        public Criteria andJobClassApplicationGreaterThan(String value) {
            addCriterion("job_class_application >", value, "jobClassApplication");
            return (Criteria) this;
        }

        public Criteria andJobClassApplicationGreaterThanOrEqualTo(String value) {
            addCriterion("job_class_application >=", value, "jobClassApplication");
            return (Criteria) this;
        }

        public Criteria andJobClassApplicationLessThan(String value) {
            addCriterion("job_class_application <", value, "jobClassApplication");
            return (Criteria) this;
        }

        public Criteria andJobClassApplicationLessThanOrEqualTo(String value) {
            addCriterion("job_class_application <=", value, "jobClassApplication");
            return (Criteria) this;
        }

        public Criteria andJobClassApplicationLike(String value) {
            addCriterion("job_class_application like", value, "jobClassApplication");
            return (Criteria) this;
        }

        public Criteria andJobClassApplicationNotLike(String value) {
            addCriterion("job_class_application not like", value, "jobClassApplication");
            return (Criteria) this;
        }

        public Criteria andJobClassApplicationIn(List<String> values) {
            addCriterion("job_class_application in", values, "jobClassApplication");
            return (Criteria) this;
        }

        public Criteria andJobClassApplicationNotIn(List<String> values) {
            addCriterion("job_class_application not in", values, "jobClassApplication");
            return (Criteria) this;
        }

        public Criteria andJobClassApplicationBetween(String value1, String value2) {
            addCriterion("job_class_application between", value1, value2, "jobClassApplication");
            return (Criteria) this;
        }

        public Criteria andJobClassApplicationNotBetween(String value1, String value2) {
            addCriterion("job_class_application not between", value1, value2, "jobClassApplication");
            return (Criteria) this;
        }

        public Criteria andCuckooClientIpIsNull() {
            addCriterion("cuckoo_client_ip is null");
            return (Criteria) this;
        }

        public Criteria andCuckooClientIpIsNotNull() {
            addCriterion("cuckoo_client_ip is not null");
            return (Criteria) this;
        }

        public Criteria andCuckooClientIpEqualTo(String value) {
            addCriterion("cuckoo_client_ip =", value, "cuckooClientIp");
            return (Criteria) this;
        }

        public Criteria andCuckooClientIpNotEqualTo(String value) {
            addCriterion("cuckoo_client_ip <>", value, "cuckooClientIp");
            return (Criteria) this;
        }

        public Criteria andCuckooClientIpGreaterThan(String value) {
            addCriterion("cuckoo_client_ip >", value, "cuckooClientIp");
            return (Criteria) this;
        }

        public Criteria andCuckooClientIpGreaterThanOrEqualTo(String value) {
            addCriterion("cuckoo_client_ip >=", value, "cuckooClientIp");
            return (Criteria) this;
        }

        public Criteria andCuckooClientIpLessThan(String value) {
            addCriterion("cuckoo_client_ip <", value, "cuckooClientIp");
            return (Criteria) this;
        }

        public Criteria andCuckooClientIpLessThanOrEqualTo(String value) {
            addCriterion("cuckoo_client_ip <=", value, "cuckooClientIp");
            return (Criteria) this;
        }

        public Criteria andCuckooClientIpLike(String value) {
            addCriterion("cuckoo_client_ip like", value, "cuckooClientIp");
            return (Criteria) this;
        }

        public Criteria andCuckooClientIpNotLike(String value) {
            addCriterion("cuckoo_client_ip not like", value, "cuckooClientIp");
            return (Criteria) this;
        }

        public Criteria andCuckooClientIpIn(List<String> values) {
            addCriterion("cuckoo_client_ip in", values, "cuckooClientIp");
            return (Criteria) this;
        }

        public Criteria andCuckooClientIpNotIn(List<String> values) {
            addCriterion("cuckoo_client_ip not in", values, "cuckooClientIp");
            return (Criteria) this;
        }

        public Criteria andCuckooClientIpBetween(String value1, String value2) {
            addCriterion("cuckoo_client_ip between", value1, value2, "cuckooClientIp");
            return (Criteria) this;
        }

        public Criteria andCuckooClientIpNotBetween(String value1, String value2) {
            addCriterion("cuckoo_client_ip not between", value1, value2, "cuckooClientIp");
            return (Criteria) this;
        }

        public Criteria andCuckooClientTagIsNull() {
            addCriterion("cuckoo_client_tag is null");
            return (Criteria) this;
        }

        public Criteria andCuckooClientTagIsNotNull() {
            addCriterion("cuckoo_client_tag is not null");
            return (Criteria) this;
        }

        public Criteria andCuckooClientTagEqualTo(String value) {
            addCriterion("cuckoo_client_tag =", value, "cuckooClientTag");
            return (Criteria) this;
        }

        public Criteria andCuckooClientTagNotEqualTo(String value) {
            addCriterion("cuckoo_client_tag <>", value, "cuckooClientTag");
            return (Criteria) this;
        }

        public Criteria andCuckooClientTagGreaterThan(String value) {
            addCriterion("cuckoo_client_tag >", value, "cuckooClientTag");
            return (Criteria) this;
        }

        public Criteria andCuckooClientTagGreaterThanOrEqualTo(String value) {
            addCriterion("cuckoo_client_tag >=", value, "cuckooClientTag");
            return (Criteria) this;
        }

        public Criteria andCuckooClientTagLessThan(String value) {
            addCriterion("cuckoo_client_tag <", value, "cuckooClientTag");
            return (Criteria) this;
        }

        public Criteria andCuckooClientTagLessThanOrEqualTo(String value) {
            addCriterion("cuckoo_client_tag <=", value, "cuckooClientTag");
            return (Criteria) this;
        }

        public Criteria andCuckooClientTagLike(String value) {
            addCriterion("cuckoo_client_tag like", value, "cuckooClientTag");
            return (Criteria) this;
        }

        public Criteria andCuckooClientTagNotLike(String value) {
            addCriterion("cuckoo_client_tag not like", value, "cuckooClientTag");
            return (Criteria) this;
        }

        public Criteria andCuckooClientTagIn(List<String> values) {
            addCriterion("cuckoo_client_tag in", values, "cuckooClientTag");
            return (Criteria) this;
        }

        public Criteria andCuckooClientTagNotIn(List<String> values) {
            addCriterion("cuckoo_client_tag not in", values, "cuckooClientTag");
            return (Criteria) this;
        }

        public Criteria andCuckooClientTagBetween(String value1, String value2) {
            addCriterion("cuckoo_client_tag between", value1, value2, "cuckooClientTag");
            return (Criteria) this;
        }

        public Criteria andCuckooClientTagNotBetween(String value1, String value2) {
            addCriterion("cuckoo_client_tag not between", value1, value2, "cuckooClientTag");
            return (Criteria) this;
        }

        public Criteria andCuckooClientStatusIsNull() {
            addCriterion("cuckoo_client_status is null");
            return (Criteria) this;
        }

        public Criteria andCuckooClientStatusIsNotNull() {
            addCriterion("cuckoo_client_status is not null");
            return (Criteria) this;
        }

        public Criteria andCuckooClientStatusEqualTo(String value) {
            addCriterion("cuckoo_client_status =", value, "cuckooClientStatus");
            return (Criteria) this;
        }

        public Criteria andCuckooClientStatusNotEqualTo(String value) {
            addCriterion("cuckoo_client_status <>", value, "cuckooClientStatus");
            return (Criteria) this;
        }

        public Criteria andCuckooClientStatusGreaterThan(String value) {
            addCriterion("cuckoo_client_status >", value, "cuckooClientStatus");
            return (Criteria) this;
        }

        public Criteria andCuckooClientStatusGreaterThanOrEqualTo(String value) {
            addCriterion("cuckoo_client_status >=", value, "cuckooClientStatus");
            return (Criteria) this;
        }

        public Criteria andCuckooClientStatusLessThan(String value) {
            addCriterion("cuckoo_client_status <", value, "cuckooClientStatus");
            return (Criteria) this;
        }

        public Criteria andCuckooClientStatusLessThanOrEqualTo(String value) {
            addCriterion("cuckoo_client_status <=", value, "cuckooClientStatus");
            return (Criteria) this;
        }

        public Criteria andCuckooClientStatusLike(String value) {
            addCriterion("cuckoo_client_status like", value, "cuckooClientStatus");
            return (Criteria) this;
        }

        public Criteria andCuckooClientStatusNotLike(String value) {
            addCriterion("cuckoo_client_status not like", value, "cuckooClientStatus");
            return (Criteria) this;
        }

        public Criteria andCuckooClientStatusIn(List<String> values) {
            addCriterion("cuckoo_client_status in", values, "cuckooClientStatus");
            return (Criteria) this;
        }

        public Criteria andCuckooClientStatusNotIn(List<String> values) {
            addCriterion("cuckoo_client_status not in", values, "cuckooClientStatus");
            return (Criteria) this;
        }

        public Criteria andCuckooClientStatusBetween(String value1, String value2) {
            addCriterion("cuckoo_client_status between", value1, value2, "cuckooClientStatus");
            return (Criteria) this;
        }

        public Criteria andCuckooClientStatusNotBetween(String value1, String value2) {
            addCriterion("cuckoo_client_status not between", value1, value2, "cuckooClientStatus");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("job_name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job_name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job_name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job_name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job_name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job_name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job_name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job_name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("job_name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("job_name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job_name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job_name not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andBeanNameIsNull() {
            addCriterion("bean_name is null");
            return (Criteria) this;
        }

        public Criteria andBeanNameIsNotNull() {
            addCriterion("bean_name is not null");
            return (Criteria) this;
        }

        public Criteria andBeanNameEqualTo(String value) {
            addCriterion("bean_name =", value, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameNotEqualTo(String value) {
            addCriterion("bean_name <>", value, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameGreaterThan(String value) {
            addCriterion("bean_name >", value, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameGreaterThanOrEqualTo(String value) {
            addCriterion("bean_name >=", value, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameLessThan(String value) {
            addCriterion("bean_name <", value, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameLessThanOrEqualTo(String value) {
            addCriterion("bean_name <=", value, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameLike(String value) {
            addCriterion("bean_name like", value, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameNotLike(String value) {
            addCriterion("bean_name not like", value, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameIn(List<String> values) {
            addCriterion("bean_name in", values, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameNotIn(List<String> values) {
            addCriterion("bean_name not in", values, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameBetween(String value1, String value2) {
            addCriterion("bean_name between", value1, value2, "beanName");
            return (Criteria) this;
        }

        public Criteria andBeanNameNotBetween(String value1, String value2) {
            addCriterion("bean_name not between", value1, value2, "beanName");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNull() {
            addCriterion("method_name is null");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNotNull() {
            addCriterion("method_name is not null");
            return (Criteria) this;
        }

        public Criteria andMethodNameEqualTo(String value) {
            addCriterion("method_name =", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotEqualTo(String value) {
            addCriterion("method_name <>", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThan(String value) {
            addCriterion("method_name >", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("method_name >=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThan(String value) {
            addCriterion("method_name <", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThanOrEqualTo(String value) {
            addCriterion("method_name <=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLike(String value) {
            addCriterion("method_name like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotLike(String value) {
            addCriterion("method_name not like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameIn(List<String> values) {
            addCriterion("method_name in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotIn(List<String> values) {
            addCriterion("method_name not in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameBetween(String value1, String value2) {
            addCriterion("method_name between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotBetween(String value1, String value2) {
            addCriterion("method_name not between", value1, value2, "methodName");
            return (Criteria) this;
        }
    }

    /**
     * cuckoo_client_job_detail表的操作类
     * 
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * cuckoo_client_job_detail表的操作类
     * 
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}