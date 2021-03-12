package com.tmxmall.connector.dal.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConnectorRepositoryDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConnectorRepositoryDOExample() {
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

        public Criteria andFRepositoryIdIsNull() {
            addCriterion("F_repository_id is null");
            return (Criteria) this;
        }

        public Criteria andFRepositoryIdIsNotNull() {
            addCriterion("F_repository_id is not null");
            return (Criteria) this;
        }

        public Criteria andFRepositoryIdEqualTo(String value) {
            addCriterion("F_repository_id =", value, "fRepositoryId");
            return (Criteria) this;
        }

        public Criteria andFRepositoryIdNotEqualTo(String value) {
            addCriterion("F_repository_id <>", value, "fRepositoryId");
            return (Criteria) this;
        }

        public Criteria andFRepositoryIdGreaterThan(String value) {
            addCriterion("F_repository_id >", value, "fRepositoryId");
            return (Criteria) this;
        }

        public Criteria andFRepositoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_repository_id >=", value, "fRepositoryId");
            return (Criteria) this;
        }

        public Criteria andFRepositoryIdLessThan(String value) {
            addCriterion("F_repository_id <", value, "fRepositoryId");
            return (Criteria) this;
        }

        public Criteria andFRepositoryIdLessThanOrEqualTo(String value) {
            addCriterion("F_repository_id <=", value, "fRepositoryId");
            return (Criteria) this;
        }

        public Criteria andFRepositoryIdLike(String value) {
            addCriterion("F_repository_id like", value, "fRepositoryId");
            return (Criteria) this;
        }

        public Criteria andFRepositoryIdNotLike(String value) {
            addCriterion("F_repository_id not like", value, "fRepositoryId");
            return (Criteria) this;
        }

        public Criteria andFRepositoryIdIn(List<String> values) {
            addCriterion("F_repository_id in", values, "fRepositoryId");
            return (Criteria) this;
        }

        public Criteria andFRepositoryIdNotIn(List<String> values) {
            addCriterion("F_repository_id not in", values, "fRepositoryId");
            return (Criteria) this;
        }

        public Criteria andFRepositoryIdBetween(String value1, String value2) {
            addCriterion("F_repository_id between", value1, value2, "fRepositoryId");
            return (Criteria) this;
        }

        public Criteria andFRepositoryIdNotBetween(String value1, String value2) {
            addCriterion("F_repository_id not between", value1, value2, "fRepositoryId");
            return (Criteria) this;
        }

        public Criteria andFRepositoryNameIsNull() {
            addCriterion("F_repository_name is null");
            return (Criteria) this;
        }

        public Criteria andFRepositoryNameIsNotNull() {
            addCriterion("F_repository_name is not null");
            return (Criteria) this;
        }

        public Criteria andFRepositoryNameEqualTo(String value) {
            addCriterion("F_repository_name =", value, "fRepositoryName");
            return (Criteria) this;
        }

        public Criteria andFRepositoryNameNotEqualTo(String value) {
            addCriterion("F_repository_name <>", value, "fRepositoryName");
            return (Criteria) this;
        }

        public Criteria andFRepositoryNameGreaterThan(String value) {
            addCriterion("F_repository_name >", value, "fRepositoryName");
            return (Criteria) this;
        }

        public Criteria andFRepositoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_repository_name >=", value, "fRepositoryName");
            return (Criteria) this;
        }

        public Criteria andFRepositoryNameLessThan(String value) {
            addCriterion("F_repository_name <", value, "fRepositoryName");
            return (Criteria) this;
        }

        public Criteria andFRepositoryNameLessThanOrEqualTo(String value) {
            addCriterion("F_repository_name <=", value, "fRepositoryName");
            return (Criteria) this;
        }

        public Criteria andFRepositoryNameLike(String value) {
            addCriterion("F_repository_name like", value, "fRepositoryName");
            return (Criteria) this;
        }

        public Criteria andFRepositoryNameNotLike(String value) {
            addCriterion("F_repository_name not like", value, "fRepositoryName");
            return (Criteria) this;
        }

        public Criteria andFRepositoryNameIn(List<String> values) {
            addCriterion("F_repository_name in", values, "fRepositoryName");
            return (Criteria) this;
        }

        public Criteria andFRepositoryNameNotIn(List<String> values) {
            addCriterion("F_repository_name not in", values, "fRepositoryName");
            return (Criteria) this;
        }

        public Criteria andFRepositoryNameBetween(String value1, String value2) {
            addCriterion("F_repository_name between", value1, value2, "fRepositoryName");
            return (Criteria) this;
        }

        public Criteria andFRepositoryNameNotBetween(String value1, String value2) {
            addCriterion("F_repository_name not between", value1, value2, "fRepositoryName");
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