package com.tmxmall.connector.dal.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConnectorProjectDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConnectorProjectDOExample() {
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

        public Criteria andFYicatGroupIdIsNull() {
            addCriterion("F_yicat_group_id is null");
            return (Criteria) this;
        }

        public Criteria andFYicatGroupIdIsNotNull() {
            addCriterion("F_yicat_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andFYicatGroupIdEqualTo(String value) {
            addCriterion("F_yicat_group_id =", value, "fYicatGroupId");
            return (Criteria) this;
        }

        public Criteria andFYicatGroupIdNotEqualTo(String value) {
            addCriterion("F_yicat_group_id <>", value, "fYicatGroupId");
            return (Criteria) this;
        }

        public Criteria andFYicatGroupIdGreaterThan(String value) {
            addCriterion("F_yicat_group_id >", value, "fYicatGroupId");
            return (Criteria) this;
        }

        public Criteria andFYicatGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_yicat_group_id >=", value, "fYicatGroupId");
            return (Criteria) this;
        }

        public Criteria andFYicatGroupIdLessThan(String value) {
            addCriterion("F_yicat_group_id <", value, "fYicatGroupId");
            return (Criteria) this;
        }

        public Criteria andFYicatGroupIdLessThanOrEqualTo(String value) {
            addCriterion("F_yicat_group_id <=", value, "fYicatGroupId");
            return (Criteria) this;
        }

        public Criteria andFYicatGroupIdLike(String value) {
            addCriterion("F_yicat_group_id like", value, "fYicatGroupId");
            return (Criteria) this;
        }

        public Criteria andFYicatGroupIdNotLike(String value) {
            addCriterion("F_yicat_group_id not like", value, "fYicatGroupId");
            return (Criteria) this;
        }

        public Criteria andFYicatGroupIdIn(List<String> values) {
            addCriterion("F_yicat_group_id in", values, "fYicatGroupId");
            return (Criteria) this;
        }

        public Criteria andFYicatGroupIdNotIn(List<String> values) {
            addCriterion("F_yicat_group_id not in", values, "fYicatGroupId");
            return (Criteria) this;
        }

        public Criteria andFYicatGroupIdBetween(String value1, String value2) {
            addCriterion("F_yicat_group_id between", value1, value2, "fYicatGroupId");
            return (Criteria) this;
        }

        public Criteria andFYicatGroupIdNotBetween(String value1, String value2) {
            addCriterion("F_yicat_group_id not between", value1, value2, "fYicatGroupId");
            return (Criteria) this;
        }

        public Criteria andFYicatProjectIdIsNull() {
            addCriterion("F_yicat_project_id is null");
            return (Criteria) this;
        }

        public Criteria andFYicatProjectIdIsNotNull() {
            addCriterion("F_yicat_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andFYicatProjectIdEqualTo(String value) {
            addCriterion("F_yicat_project_id =", value, "fYicatProjectId");
            return (Criteria) this;
        }

        public Criteria andFYicatProjectIdNotEqualTo(String value) {
            addCriterion("F_yicat_project_id <>", value, "fYicatProjectId");
            return (Criteria) this;
        }

        public Criteria andFYicatProjectIdGreaterThan(String value) {
            addCriterion("F_yicat_project_id >", value, "fYicatProjectId");
            return (Criteria) this;
        }

        public Criteria andFYicatProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_yicat_project_id >=", value, "fYicatProjectId");
            return (Criteria) this;
        }

        public Criteria andFYicatProjectIdLessThan(String value) {
            addCriterion("F_yicat_project_id <", value, "fYicatProjectId");
            return (Criteria) this;
        }

        public Criteria andFYicatProjectIdLessThanOrEqualTo(String value) {
            addCriterion("F_yicat_project_id <=", value, "fYicatProjectId");
            return (Criteria) this;
        }

        public Criteria andFYicatProjectIdLike(String value) {
            addCriterion("F_yicat_project_id like", value, "fYicatProjectId");
            return (Criteria) this;
        }

        public Criteria andFYicatProjectIdNotLike(String value) {
            addCriterion("F_yicat_project_id not like", value, "fYicatProjectId");
            return (Criteria) this;
        }

        public Criteria andFYicatProjectIdIn(List<String> values) {
            addCriterion("F_yicat_project_id in", values, "fYicatProjectId");
            return (Criteria) this;
        }

        public Criteria andFYicatProjectIdNotIn(List<String> values) {
            addCriterion("F_yicat_project_id not in", values, "fYicatProjectId");
            return (Criteria) this;
        }

        public Criteria andFYicatProjectIdBetween(String value1, String value2) {
            addCriterion("F_yicat_project_id between", value1, value2, "fYicatProjectId");
            return (Criteria) this;
        }

        public Criteria andFYicatProjectIdNotBetween(String value1, String value2) {
            addCriterion("F_yicat_project_id not between", value1, value2, "fYicatProjectId");
            return (Criteria) this;
        }

        public Criteria andFConnectorTypeIsNull() {
            addCriterion("F_connector_type is null");
            return (Criteria) this;
        }

        public Criteria andFConnectorTypeIsNotNull() {
            addCriterion("F_connector_type is not null");
            return (Criteria) this;
        }

        public Criteria andFConnectorTypeEqualTo(Integer value) {
            addCriterion("F_connector_type =", value, "fConnectorType");
            return (Criteria) this;
        }

        public Criteria andFConnectorTypeNotEqualTo(Integer value) {
            addCriterion("F_connector_type <>", value, "fConnectorType");
            return (Criteria) this;
        }

        public Criteria andFConnectorTypeGreaterThan(Integer value) {
            addCriterion("F_connector_type >", value, "fConnectorType");
            return (Criteria) this;
        }

        public Criteria andFConnectorTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_connector_type >=", value, "fConnectorType");
            return (Criteria) this;
        }

        public Criteria andFConnectorTypeLessThan(Integer value) {
            addCriterion("F_connector_type <", value, "fConnectorType");
            return (Criteria) this;
        }

        public Criteria andFConnectorTypeLessThanOrEqualTo(Integer value) {
            addCriterion("F_connector_type <=", value, "fConnectorType");
            return (Criteria) this;
        }

        public Criteria andFConnectorTypeIn(List<Integer> values) {
            addCriterion("F_connector_type in", values, "fConnectorType");
            return (Criteria) this;
        }

        public Criteria andFConnectorTypeNotIn(List<Integer> values) {
            addCriterion("F_connector_type not in", values, "fConnectorType");
            return (Criteria) this;
        }

        public Criteria andFConnectorTypeBetween(Integer value1, Integer value2) {
            addCriterion("F_connector_type between", value1, value2, "fConnectorType");
            return (Criteria) this;
        }

        public Criteria andFConnectorTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("F_connector_type not between", value1, value2, "fConnectorType");
            return (Criteria) this;
        }

        public Criteria andFOauthTokenIsNull() {
            addCriterion("F_oauth_token is null");
            return (Criteria) this;
        }

        public Criteria andFOauthTokenIsNotNull() {
            addCriterion("F_oauth_token is not null");
            return (Criteria) this;
        }

        public Criteria andFOauthTokenEqualTo(String value) {
            addCriterion("F_oauth_token =", value, "fOauthToken");
            return (Criteria) this;
        }

        public Criteria andFOauthTokenNotEqualTo(String value) {
            addCriterion("F_oauth_token <>", value, "fOauthToken");
            return (Criteria) this;
        }

        public Criteria andFOauthTokenGreaterThan(String value) {
            addCriterion("F_oauth_token >", value, "fOauthToken");
            return (Criteria) this;
        }

        public Criteria andFOauthTokenGreaterThanOrEqualTo(String value) {
            addCriterion("F_oauth_token >=", value, "fOauthToken");
            return (Criteria) this;
        }

        public Criteria andFOauthTokenLessThan(String value) {
            addCriterion("F_oauth_token <", value, "fOauthToken");
            return (Criteria) this;
        }

        public Criteria andFOauthTokenLessThanOrEqualTo(String value) {
            addCriterion("F_oauth_token <=", value, "fOauthToken");
            return (Criteria) this;
        }

        public Criteria andFOauthTokenLike(String value) {
            addCriterion("F_oauth_token like", value, "fOauthToken");
            return (Criteria) this;
        }

        public Criteria andFOauthTokenNotLike(String value) {
            addCriterion("F_oauth_token not like", value, "fOauthToken");
            return (Criteria) this;
        }

        public Criteria andFOauthTokenIn(List<String> values) {
            addCriterion("F_oauth_token in", values, "fOauthToken");
            return (Criteria) this;
        }

        public Criteria andFOauthTokenNotIn(List<String> values) {
            addCriterion("F_oauth_token not in", values, "fOauthToken");
            return (Criteria) this;
        }

        public Criteria andFOauthTokenBetween(String value1, String value2) {
            addCriterion("F_oauth_token between", value1, value2, "fOauthToken");
            return (Criteria) this;
        }

        public Criteria andFOauthTokenNotBetween(String value1, String value2) {
            addCriterion("F_oauth_token not between", value1, value2, "fOauthToken");
            return (Criteria) this;
        }

        public Criteria andFOauthUserNameIsNull() {
            addCriterion("F_oauth_user_name is null");
            return (Criteria) this;
        }

        public Criteria andFOauthUserNameIsNotNull() {
            addCriterion("F_oauth_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andFOauthUserNameEqualTo(String value) {
            addCriterion("F_oauth_user_name =", value, "fOauthUserName");
            return (Criteria) this;
        }

        public Criteria andFOauthUserNameNotEqualTo(String value) {
            addCriterion("F_oauth_user_name <>", value, "fOauthUserName");
            return (Criteria) this;
        }

        public Criteria andFOauthUserNameGreaterThan(String value) {
            addCriterion("F_oauth_user_name >", value, "fOauthUserName");
            return (Criteria) this;
        }

        public Criteria andFOauthUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_oauth_user_name >=", value, "fOauthUserName");
            return (Criteria) this;
        }

        public Criteria andFOauthUserNameLessThan(String value) {
            addCriterion("F_oauth_user_name <", value, "fOauthUserName");
            return (Criteria) this;
        }

        public Criteria andFOauthUserNameLessThanOrEqualTo(String value) {
            addCriterion("F_oauth_user_name <=", value, "fOauthUserName");
            return (Criteria) this;
        }

        public Criteria andFOauthUserNameLike(String value) {
            addCriterion("F_oauth_user_name like", value, "fOauthUserName");
            return (Criteria) this;
        }

        public Criteria andFOauthUserNameNotLike(String value) {
            addCriterion("F_oauth_user_name not like", value, "fOauthUserName");
            return (Criteria) this;
        }

        public Criteria andFOauthUserNameIn(List<String> values) {
            addCriterion("F_oauth_user_name in", values, "fOauthUserName");
            return (Criteria) this;
        }

        public Criteria andFOauthUserNameNotIn(List<String> values) {
            addCriterion("F_oauth_user_name not in", values, "fOauthUserName");
            return (Criteria) this;
        }

        public Criteria andFOauthUserNameBetween(String value1, String value2) {
            addCriterion("F_oauth_user_name between", value1, value2, "fOauthUserName");
            return (Criteria) this;
        }

        public Criteria andFOauthUserNameNotBetween(String value1, String value2) {
            addCriterion("F_oauth_user_name not between", value1, value2, "fOauthUserName");
            return (Criteria) this;
        }

        public Criteria andFManagerUserIdIsNull() {
            addCriterion("F_manager_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFManagerUserIdIsNotNull() {
            addCriterion("F_manager_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFManagerUserIdEqualTo(String value) {
            addCriterion("F_manager_user_id =", value, "fManagerUserId");
            return (Criteria) this;
        }

        public Criteria andFManagerUserIdNotEqualTo(String value) {
            addCriterion("F_manager_user_id <>", value, "fManagerUserId");
            return (Criteria) this;
        }

        public Criteria andFManagerUserIdGreaterThan(String value) {
            addCriterion("F_manager_user_id >", value, "fManagerUserId");
            return (Criteria) this;
        }

        public Criteria andFManagerUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_manager_user_id >=", value, "fManagerUserId");
            return (Criteria) this;
        }

        public Criteria andFManagerUserIdLessThan(String value) {
            addCriterion("F_manager_user_id <", value, "fManagerUserId");
            return (Criteria) this;
        }

        public Criteria andFManagerUserIdLessThanOrEqualTo(String value) {
            addCriterion("F_manager_user_id <=", value, "fManagerUserId");
            return (Criteria) this;
        }

        public Criteria andFManagerUserIdLike(String value) {
            addCriterion("F_manager_user_id like", value, "fManagerUserId");
            return (Criteria) this;
        }

        public Criteria andFManagerUserIdNotLike(String value) {
            addCriterion("F_manager_user_id not like", value, "fManagerUserId");
            return (Criteria) this;
        }

        public Criteria andFManagerUserIdIn(List<String> values) {
            addCriterion("F_manager_user_id in", values, "fManagerUserId");
            return (Criteria) this;
        }

        public Criteria andFManagerUserIdNotIn(List<String> values) {
            addCriterion("F_manager_user_id not in", values, "fManagerUserId");
            return (Criteria) this;
        }

        public Criteria andFManagerUserIdBetween(String value1, String value2) {
            addCriterion("F_manager_user_id between", value1, value2, "fManagerUserId");
            return (Criteria) this;
        }

        public Criteria andFManagerUserIdNotBetween(String value1, String value2) {
            addCriterion("F_manager_user_id not between", value1, value2, "fManagerUserId");
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