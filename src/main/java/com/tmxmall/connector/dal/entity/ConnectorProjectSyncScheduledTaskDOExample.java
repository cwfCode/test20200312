package com.tmxmall.connector.dal.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConnectorProjectSyncScheduledTaskDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConnectorProjectSyncScheduledTaskDOExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andFIdIsNull() {
            addCriterion("F_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("F_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("F_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("F_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("F_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("F_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("F_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("F_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("F_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("F_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("F_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFEnabledIsNull() {
            addCriterion("F_enabled is null");
            return (Criteria) this;
        }

        public Criteria andFEnabledIsNotNull() {
            addCriterion("F_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andFEnabledEqualTo(Byte value) {
            addCriterion("F_enabled =", value, "fEnabled");
            return (Criteria) this;
        }

        public Criteria andFEnabledNotEqualTo(Byte value) {
            addCriterion("F_enabled <>", value, "fEnabled");
            return (Criteria) this;
        }

        public Criteria andFEnabledGreaterThan(Byte value) {
            addCriterion("F_enabled >", value, "fEnabled");
            return (Criteria) this;
        }

        public Criteria andFEnabledGreaterThanOrEqualTo(Byte value) {
            addCriterion("F_enabled >=", value, "fEnabled");
            return (Criteria) this;
        }

        public Criteria andFEnabledLessThan(Byte value) {
            addCriterion("F_enabled <", value, "fEnabled");
            return (Criteria) this;
        }

        public Criteria andFEnabledLessThanOrEqualTo(Byte value) {
            addCriterion("F_enabled <=", value, "fEnabled");
            return (Criteria) this;
        }

        public Criteria andFEnabledIn(List<Byte> values) {
            addCriterion("F_enabled in", values, "fEnabled");
            return (Criteria) this;
        }

        public Criteria andFEnabledNotIn(List<Byte> values) {
            addCriterion("F_enabled not in", values, "fEnabled");
            return (Criteria) this;
        }

        public Criteria andFEnabledBetween(Byte value1, Byte value2) {
            addCriterion("F_enabled between", value1, value2, "fEnabled");
            return (Criteria) this;
        }

        public Criteria andFEnabledNotBetween(Byte value1, Byte value2) {
            addCriterion("F_enabled not between", value1, value2, "fEnabled");
            return (Criteria) this;
        }

        public Criteria andFJobIdIsNull() {
            addCriterion("F_job_id is null");
            return (Criteria) this;
        }

        public Criteria andFJobIdIsNotNull() {
            addCriterion("F_job_id is not null");
            return (Criteria) this;
        }

        public Criteria andFJobIdEqualTo(String value) {
            addCriterion("F_job_id =", value, "fJobId");
            return (Criteria) this;
        }

        public Criteria andFJobIdNotEqualTo(String value) {
            addCriterion("F_job_id <>", value, "fJobId");
            return (Criteria) this;
        }

        public Criteria andFJobIdGreaterThan(String value) {
            addCriterion("F_job_id >", value, "fJobId");
            return (Criteria) this;
        }

        public Criteria andFJobIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_job_id >=", value, "fJobId");
            return (Criteria) this;
        }

        public Criteria andFJobIdLessThan(String value) {
            addCriterion("F_job_id <", value, "fJobId");
            return (Criteria) this;
        }

        public Criteria andFJobIdLessThanOrEqualTo(String value) {
            addCriterion("F_job_id <=", value, "fJobId");
            return (Criteria) this;
        }

        public Criteria andFJobIdLike(String value) {
            addCriterion("F_job_id like", value, "fJobId");
            return (Criteria) this;
        }

        public Criteria andFJobIdNotLike(String value) {
            addCriterion("F_job_id not like", value, "fJobId");
            return (Criteria) this;
        }

        public Criteria andFJobIdIn(List<String> values) {
            addCriterion("F_job_id in", values, "fJobId");
            return (Criteria) this;
        }

        public Criteria andFJobIdNotIn(List<String> values) {
            addCriterion("F_job_id not in", values, "fJobId");
            return (Criteria) this;
        }

        public Criteria andFJobIdBetween(String value1, String value2) {
            addCriterion("F_job_id between", value1, value2, "fJobId");
            return (Criteria) this;
        }

        public Criteria andFJobIdNotBetween(String value1, String value2) {
            addCriterion("F_job_id not between", value1, value2, "fJobId");
            return (Criteria) this;
        }

        public Criteria andFProjectIdIsNull() {
            addCriterion("F_project_id is null");
            return (Criteria) this;
        }

        public Criteria andFProjectIdIsNotNull() {
            addCriterion("F_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andFProjectIdEqualTo(String value) {
            addCriterion("F_project_id =", value, "fProjectId");
            return (Criteria) this;
        }

        public Criteria andFProjectIdNotEqualTo(String value) {
            addCriterion("F_project_id <>", value, "fProjectId");
            return (Criteria) this;
        }

        public Criteria andFProjectIdGreaterThan(String value) {
            addCriterion("F_project_id >", value, "fProjectId");
            return (Criteria) this;
        }

        public Criteria andFProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_project_id >=", value, "fProjectId");
            return (Criteria) this;
        }

        public Criteria andFProjectIdLessThan(String value) {
            addCriterion("F_project_id <", value, "fProjectId");
            return (Criteria) this;
        }

        public Criteria andFProjectIdLessThanOrEqualTo(String value) {
            addCriterion("F_project_id <=", value, "fProjectId");
            return (Criteria) this;
        }

        public Criteria andFProjectIdLike(String value) {
            addCriterion("F_project_id like", value, "fProjectId");
            return (Criteria) this;
        }

        public Criteria andFProjectIdNotLike(String value) {
            addCriterion("F_project_id not like", value, "fProjectId");
            return (Criteria) this;
        }

        public Criteria andFProjectIdIn(List<String> values) {
            addCriterion("F_project_id in", values, "fProjectId");
            return (Criteria) this;
        }

        public Criteria andFProjectIdNotIn(List<String> values) {
            addCriterion("F_project_id not in", values, "fProjectId");
            return (Criteria) this;
        }

        public Criteria andFProjectIdBetween(String value1, String value2) {
            addCriterion("F_project_id between", value1, value2, "fProjectId");
            return (Criteria) this;
        }

        public Criteria andFProjectIdNotBetween(String value1, String value2) {
            addCriterion("F_project_id not between", value1, value2, "fProjectId");
            return (Criteria) this;
        }

        public Criteria andFJobCronPullIsNull() {
            addCriterion("F_job_cron_pull is null");
            return (Criteria) this;
        }

        public Criteria andFJobCronPullIsNotNull() {
            addCriterion("F_job_cron_pull is not null");
            return (Criteria) this;
        }

        public Criteria andFJobCronPullEqualTo(String value) {
            addCriterion("F_job_cron_pull =", value, "fJobCronPull");
            return (Criteria) this;
        }

        public Criteria andFJobCronPullNotEqualTo(String value) {
            addCriterion("F_job_cron_pull <>", value, "fJobCronPull");
            return (Criteria) this;
        }

        public Criteria andFJobCronPullGreaterThan(String value) {
            addCriterion("F_job_cron_pull >", value, "fJobCronPull");
            return (Criteria) this;
        }

        public Criteria andFJobCronPullGreaterThanOrEqualTo(String value) {
            addCriterion("F_job_cron_pull >=", value, "fJobCronPull");
            return (Criteria) this;
        }

        public Criteria andFJobCronPullLessThan(String value) {
            addCriterion("F_job_cron_pull <", value, "fJobCronPull");
            return (Criteria) this;
        }

        public Criteria andFJobCronPullLessThanOrEqualTo(String value) {
            addCriterion("F_job_cron_pull <=", value, "fJobCronPull");
            return (Criteria) this;
        }

        public Criteria andFJobCronPullLike(String value) {
            addCriterion("F_job_cron_pull like", value, "fJobCronPull");
            return (Criteria) this;
        }

        public Criteria andFJobCronPullNotLike(String value) {
            addCriterion("F_job_cron_pull not like", value, "fJobCronPull");
            return (Criteria) this;
        }

        public Criteria andFJobCronPullIn(List<String> values) {
            addCriterion("F_job_cron_pull in", values, "fJobCronPull");
            return (Criteria) this;
        }

        public Criteria andFJobCronPullNotIn(List<String> values) {
            addCriterion("F_job_cron_pull not in", values, "fJobCronPull");
            return (Criteria) this;
        }

        public Criteria andFJobCronPullBetween(String value1, String value2) {
            addCriterion("F_job_cron_pull between", value1, value2, "fJobCronPull");
            return (Criteria) this;
        }

        public Criteria andFJobCronPullNotBetween(String value1, String value2) {
            addCriterion("F_job_cron_pull not between", value1, value2, "fJobCronPull");
            return (Criteria) this;
        }

        public Criteria andFJobPullKeyIsNull() {
            addCriterion("F_job_pull_key is null");
            return (Criteria) this;
        }

        public Criteria andFJobPullKeyIsNotNull() {
            addCriterion("F_job_pull_key is not null");
            return (Criteria) this;
        }

        public Criteria andFJobPullKeyEqualTo(String value) {
            addCriterion("F_job_pull_key =", value, "fJobPullKey");
            return (Criteria) this;
        }

        public Criteria andFJobPullKeyNotEqualTo(String value) {
            addCriterion("F_job_pull_key <>", value, "fJobPullKey");
            return (Criteria) this;
        }

        public Criteria andFJobPullKeyGreaterThan(String value) {
            addCriterion("F_job_pull_key >", value, "fJobPullKey");
            return (Criteria) this;
        }

        public Criteria andFJobPullKeyGreaterThanOrEqualTo(String value) {
            addCriterion("F_job_pull_key >=", value, "fJobPullKey");
            return (Criteria) this;
        }

        public Criteria andFJobPullKeyLessThan(String value) {
            addCriterion("F_job_pull_key <", value, "fJobPullKey");
            return (Criteria) this;
        }

        public Criteria andFJobPullKeyLessThanOrEqualTo(String value) {
            addCriterion("F_job_pull_key <=", value, "fJobPullKey");
            return (Criteria) this;
        }

        public Criteria andFJobPullKeyLike(String value) {
            addCriterion("F_job_pull_key like", value, "fJobPullKey");
            return (Criteria) this;
        }

        public Criteria andFJobPullKeyNotLike(String value) {
            addCriterion("F_job_pull_key not like", value, "fJobPullKey");
            return (Criteria) this;
        }

        public Criteria andFJobPullKeyIn(List<String> values) {
            addCriterion("F_job_pull_key in", values, "fJobPullKey");
            return (Criteria) this;
        }

        public Criteria andFJobPullKeyNotIn(List<String> values) {
            addCriterion("F_job_pull_key not in", values, "fJobPullKey");
            return (Criteria) this;
        }

        public Criteria andFJobPullKeyBetween(String value1, String value2) {
            addCriterion("F_job_pull_key between", value1, value2, "fJobPullKey");
            return (Criteria) this;
        }

        public Criteria andFJobPullKeyNotBetween(String value1, String value2) {
            addCriterion("F_job_pull_key not between", value1, value2, "fJobPullKey");
            return (Criteria) this;
        }

        public Criteria andFJobCronPushIsNull() {
            addCriterion("F_job_cron_push is null");
            return (Criteria) this;
        }

        public Criteria andFJobCronPushIsNotNull() {
            addCriterion("F_job_cron_push is not null");
            return (Criteria) this;
        }

        public Criteria andFJobCronPushEqualTo(String value) {
            addCriterion("F_job_cron_push =", value, "fJobCronPush");
            return (Criteria) this;
        }

        public Criteria andFJobCronPushNotEqualTo(String value) {
            addCriterion("F_job_cron_push <>", value, "fJobCronPush");
            return (Criteria) this;
        }

        public Criteria andFJobCronPushGreaterThan(String value) {
            addCriterion("F_job_cron_push >", value, "fJobCronPush");
            return (Criteria) this;
        }

        public Criteria andFJobCronPushGreaterThanOrEqualTo(String value) {
            addCriterion("F_job_cron_push >=", value, "fJobCronPush");
            return (Criteria) this;
        }

        public Criteria andFJobCronPushLessThan(String value) {
            addCriterion("F_job_cron_push <", value, "fJobCronPush");
            return (Criteria) this;
        }

        public Criteria andFJobCronPushLessThanOrEqualTo(String value) {
            addCriterion("F_job_cron_push <=", value, "fJobCronPush");
            return (Criteria) this;
        }

        public Criteria andFJobCronPushLike(String value) {
            addCriterion("F_job_cron_push like", value, "fJobCronPush");
            return (Criteria) this;
        }

        public Criteria andFJobCronPushNotLike(String value) {
            addCriterion("F_job_cron_push not like", value, "fJobCronPush");
            return (Criteria) this;
        }

        public Criteria andFJobCronPushIn(List<String> values) {
            addCriterion("F_job_cron_push in", values, "fJobCronPush");
            return (Criteria) this;
        }

        public Criteria andFJobCronPushNotIn(List<String> values) {
            addCriterion("F_job_cron_push not in", values, "fJobCronPush");
            return (Criteria) this;
        }

        public Criteria andFJobCronPushBetween(String value1, String value2) {
            addCriterion("F_job_cron_push between", value1, value2, "fJobCronPush");
            return (Criteria) this;
        }

        public Criteria andFJobCronPushNotBetween(String value1, String value2) {
            addCriterion("F_job_cron_push not between", value1, value2, "fJobCronPush");
            return (Criteria) this;
        }

        public Criteria andFJobPushKeyIsNull() {
            addCriterion("F_job_push_key is null");
            return (Criteria) this;
        }

        public Criteria andFJobPushKeyIsNotNull() {
            addCriterion("F_job_push_key is not null");
            return (Criteria) this;
        }

        public Criteria andFJobPushKeyEqualTo(String value) {
            addCriterion("F_job_push_key =", value, "fJobPushKey");
            return (Criteria) this;
        }

        public Criteria andFJobPushKeyNotEqualTo(String value) {
            addCriterion("F_job_push_key <>", value, "fJobPushKey");
            return (Criteria) this;
        }

        public Criteria andFJobPushKeyGreaterThan(String value) {
            addCriterion("F_job_push_key >", value, "fJobPushKey");
            return (Criteria) this;
        }

        public Criteria andFJobPushKeyGreaterThanOrEqualTo(String value) {
            addCriterion("F_job_push_key >=", value, "fJobPushKey");
            return (Criteria) this;
        }

        public Criteria andFJobPushKeyLessThan(String value) {
            addCriterion("F_job_push_key <", value, "fJobPushKey");
            return (Criteria) this;
        }

        public Criteria andFJobPushKeyLessThanOrEqualTo(String value) {
            addCriterion("F_job_push_key <=", value, "fJobPushKey");
            return (Criteria) this;
        }

        public Criteria andFJobPushKeyLike(String value) {
            addCriterion("F_job_push_key like", value, "fJobPushKey");
            return (Criteria) this;
        }

        public Criteria andFJobPushKeyNotLike(String value) {
            addCriterion("F_job_push_key not like", value, "fJobPushKey");
            return (Criteria) this;
        }

        public Criteria andFJobPushKeyIn(List<String> values) {
            addCriterion("F_job_push_key in", values, "fJobPushKey");
            return (Criteria) this;
        }

        public Criteria andFJobPushKeyNotIn(List<String> values) {
            addCriterion("F_job_push_key not in", values, "fJobPushKey");
            return (Criteria) this;
        }

        public Criteria andFJobPushKeyBetween(String value1, String value2) {
            addCriterion("F_job_push_key between", value1, value2, "fJobPushKey");
            return (Criteria) this;
        }

        public Criteria andFJobPushKeyNotBetween(String value1, String value2) {
            addCriterion("F_job_push_key not between", value1, value2, "fJobPushKey");
            return (Criteria) this;
        }

        public Criteria andFCreateTimeIsNull() {
            addCriterion("F_create_time is null");
            return (Criteria) this;
        }

        public Criteria andFCreateTimeIsNotNull() {
            addCriterion("F_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andFCreateTimeEqualTo(Date value) {
            addCriterion("F_create_time =", value, "fCreateTime");
            return (Criteria) this;
        }

        public Criteria andFCreateTimeNotEqualTo(Date value) {
            addCriterion("F_create_time <>", value, "fCreateTime");
            return (Criteria) this;
        }

        public Criteria andFCreateTimeGreaterThan(Date value) {
            addCriterion("F_create_time >", value, "fCreateTime");
            return (Criteria) this;
        }

        public Criteria andFCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_create_time >=", value, "fCreateTime");
            return (Criteria) this;
        }

        public Criteria andFCreateTimeLessThan(Date value) {
            addCriterion("F_create_time <", value, "fCreateTime");
            return (Criteria) this;
        }

        public Criteria andFCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("F_create_time <=", value, "fCreateTime");
            return (Criteria) this;
        }

        public Criteria andFCreateTimeIn(List<Date> values) {
            addCriterion("F_create_time in", values, "fCreateTime");
            return (Criteria) this;
        }

        public Criteria andFCreateTimeNotIn(List<Date> values) {
            addCriterion("F_create_time not in", values, "fCreateTime");
            return (Criteria) this;
        }

        public Criteria andFCreateTimeBetween(Date value1, Date value2) {
            addCriterion("F_create_time between", value1, value2, "fCreateTime");
            return (Criteria) this;
        }

        public Criteria andFCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("F_create_time not between", value1, value2, "fCreateTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeIsNull() {
            addCriterion("F_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeIsNotNull() {
            addCriterion("F_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeEqualTo(Date value) {
            addCriterion("F_modify_time =", value, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeNotEqualTo(Date value) {
            addCriterion("F_modify_time <>", value, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeGreaterThan(Date value) {
            addCriterion("F_modify_time >", value, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_modify_time >=", value, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeLessThan(Date value) {
            addCriterion("F_modify_time <", value, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("F_modify_time <=", value, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeIn(List<Date> values) {
            addCriterion("F_modify_time in", values, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeNotIn(List<Date> values) {
            addCriterion("F_modify_time not in", values, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeBetween(Date value1, Date value2) {
            addCriterion("F_modify_time between", value1, value2, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("F_modify_time not between", value1, value2, "fModifyTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

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