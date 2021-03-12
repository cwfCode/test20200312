package com.tmxmall.connector.dal.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConnectorBranchDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConnectorBranchDOExample() {
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

        public Criteria andFBranchIdIsNull() {
            addCriterion("F_branch_id is null");
            return (Criteria) this;
        }

        public Criteria andFBranchIdIsNotNull() {
            addCriterion("F_branch_id is not null");
            return (Criteria) this;
        }

        public Criteria andFBranchIdEqualTo(String value) {
            addCriterion("F_branch_id =", value, "fBranchId");
            return (Criteria) this;
        }

        public Criteria andFBranchIdNotEqualTo(String value) {
            addCriterion("F_branch_id <>", value, "fBranchId");
            return (Criteria) this;
        }

        public Criteria andFBranchIdGreaterThan(String value) {
            addCriterion("F_branch_id >", value, "fBranchId");
            return (Criteria) this;
        }

        public Criteria andFBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_branch_id >=", value, "fBranchId");
            return (Criteria) this;
        }

        public Criteria andFBranchIdLessThan(String value) {
            addCriterion("F_branch_id <", value, "fBranchId");
            return (Criteria) this;
        }

        public Criteria andFBranchIdLessThanOrEqualTo(String value) {
            addCriterion("F_branch_id <=", value, "fBranchId");
            return (Criteria) this;
        }

        public Criteria andFBranchIdLike(String value) {
            addCriterion("F_branch_id like", value, "fBranchId");
            return (Criteria) this;
        }

        public Criteria andFBranchIdNotLike(String value) {
            addCriterion("F_branch_id not like", value, "fBranchId");
            return (Criteria) this;
        }

        public Criteria andFBranchIdIn(List<String> values) {
            addCriterion("F_branch_id in", values, "fBranchId");
            return (Criteria) this;
        }

        public Criteria andFBranchIdNotIn(List<String> values) {
            addCriterion("F_branch_id not in", values, "fBranchId");
            return (Criteria) this;
        }

        public Criteria andFBranchIdBetween(String value1, String value2) {
            addCriterion("F_branch_id between", value1, value2, "fBranchId");
            return (Criteria) this;
        }

        public Criteria andFBranchIdNotBetween(String value1, String value2) {
            addCriterion("F_branch_id not between", value1, value2, "fBranchId");
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

        public Criteria andFBranchNameIsNull() {
            addCriterion("F_branch_name is null");
            return (Criteria) this;
        }

        public Criteria andFBranchNameIsNotNull() {
            addCriterion("F_branch_name is not null");
            return (Criteria) this;
        }

        public Criteria andFBranchNameEqualTo(String value) {
            addCriterion("F_branch_name =", value, "fBranchName");
            return (Criteria) this;
        }

        public Criteria andFBranchNameNotEqualTo(String value) {
            addCriterion("F_branch_name <>", value, "fBranchName");
            return (Criteria) this;
        }

        public Criteria andFBranchNameGreaterThan(String value) {
            addCriterion("F_branch_name >", value, "fBranchName");
            return (Criteria) this;
        }

        public Criteria andFBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_branch_name >=", value, "fBranchName");
            return (Criteria) this;
        }

        public Criteria andFBranchNameLessThan(String value) {
            addCriterion("F_branch_name <", value, "fBranchName");
            return (Criteria) this;
        }

        public Criteria andFBranchNameLessThanOrEqualTo(String value) {
            addCriterion("F_branch_name <=", value, "fBranchName");
            return (Criteria) this;
        }

        public Criteria andFBranchNameLike(String value) {
            addCriterion("F_branch_name like", value, "fBranchName");
            return (Criteria) this;
        }

        public Criteria andFBranchNameNotLike(String value) {
            addCriterion("F_branch_name not like", value, "fBranchName");
            return (Criteria) this;
        }

        public Criteria andFBranchNameIn(List<String> values) {
            addCriterion("F_branch_name in", values, "fBranchName");
            return (Criteria) this;
        }

        public Criteria andFBranchNameNotIn(List<String> values) {
            addCriterion("F_branch_name not in", values, "fBranchName");
            return (Criteria) this;
        }

        public Criteria andFBranchNameBetween(String value1, String value2) {
            addCriterion("F_branch_name between", value1, value2, "fBranchName");
            return (Criteria) this;
        }

        public Criteria andFBranchNameNotBetween(String value1, String value2) {
            addCriterion("F_branch_name not between", value1, value2, "fBranchName");
            return (Criteria) this;
        }

        public Criteria andFBranchShaIsNull() {
            addCriterion("F_branch_sha is null");
            return (Criteria) this;
        }

        public Criteria andFBranchShaIsNotNull() {
            addCriterion("F_branch_sha is not null");
            return (Criteria) this;
        }

        public Criteria andFBranchShaEqualTo(String value) {
            addCriterion("F_branch_sha =", value, "fBranchSha");
            return (Criteria) this;
        }

        public Criteria andFBranchShaNotEqualTo(String value) {
            addCriterion("F_branch_sha <>", value, "fBranchSha");
            return (Criteria) this;
        }

        public Criteria andFBranchShaGreaterThan(String value) {
            addCriterion("F_branch_sha >", value, "fBranchSha");
            return (Criteria) this;
        }

        public Criteria andFBranchShaGreaterThanOrEqualTo(String value) {
            addCriterion("F_branch_sha >=", value, "fBranchSha");
            return (Criteria) this;
        }

        public Criteria andFBranchShaLessThan(String value) {
            addCriterion("F_branch_sha <", value, "fBranchSha");
            return (Criteria) this;
        }

        public Criteria andFBranchShaLessThanOrEqualTo(String value) {
            addCriterion("F_branch_sha <=", value, "fBranchSha");
            return (Criteria) this;
        }

        public Criteria andFBranchShaLike(String value) {
            addCriterion("F_branch_sha like", value, "fBranchSha");
            return (Criteria) this;
        }

        public Criteria andFBranchShaNotLike(String value) {
            addCriterion("F_branch_sha not like", value, "fBranchSha");
            return (Criteria) this;
        }

        public Criteria andFBranchShaIn(List<String> values) {
            addCriterion("F_branch_sha in", values, "fBranchSha");
            return (Criteria) this;
        }

        public Criteria andFBranchShaNotIn(List<String> values) {
            addCriterion("F_branch_sha not in", values, "fBranchSha");
            return (Criteria) this;
        }

        public Criteria andFBranchShaBetween(String value1, String value2) {
            addCriterion("F_branch_sha between", value1, value2, "fBranchSha");
            return (Criteria) this;
        }

        public Criteria andFBranchShaNotBetween(String value1, String value2) {
            addCriterion("F_branch_sha not between", value1, value2, "fBranchSha");
            return (Criteria) this;
        }

        public Criteria andFPushBranchNameIsNull() {
            addCriterion("F_push_branch_name is null");
            return (Criteria) this;
        }

        public Criteria andFPushBranchNameIsNotNull() {
            addCriterion("F_push_branch_name is not null");
            return (Criteria) this;
        }

        public Criteria andFPushBranchNameEqualTo(String value) {
            addCriterion("F_push_branch_name =", value, "fPushBranchName");
            return (Criteria) this;
        }

        public Criteria andFPushBranchNameNotEqualTo(String value) {
            addCriterion("F_push_branch_name <>", value, "fPushBranchName");
            return (Criteria) this;
        }

        public Criteria andFPushBranchNameGreaterThan(String value) {
            addCriterion("F_push_branch_name >", value, "fPushBranchName");
            return (Criteria) this;
        }

        public Criteria andFPushBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_push_branch_name >=", value, "fPushBranchName");
            return (Criteria) this;
        }

        public Criteria andFPushBranchNameLessThan(String value) {
            addCriterion("F_push_branch_name <", value, "fPushBranchName");
            return (Criteria) this;
        }

        public Criteria andFPushBranchNameLessThanOrEqualTo(String value) {
            addCriterion("F_push_branch_name <=", value, "fPushBranchName");
            return (Criteria) this;
        }

        public Criteria andFPushBranchNameLike(String value) {
            addCriterion("F_push_branch_name like", value, "fPushBranchName");
            return (Criteria) this;
        }

        public Criteria andFPushBranchNameNotLike(String value) {
            addCriterion("F_push_branch_name not like", value, "fPushBranchName");
            return (Criteria) this;
        }

        public Criteria andFPushBranchNameIn(List<String> values) {
            addCriterion("F_push_branch_name in", values, "fPushBranchName");
            return (Criteria) this;
        }

        public Criteria andFPushBranchNameNotIn(List<String> values) {
            addCriterion("F_push_branch_name not in", values, "fPushBranchName");
            return (Criteria) this;
        }

        public Criteria andFPushBranchNameBetween(String value1, String value2) {
            addCriterion("F_push_branch_name between", value1, value2, "fPushBranchName");
            return (Criteria) this;
        }

        public Criteria andFPushBranchNameNotBetween(String value1, String value2) {
            addCriterion("F_push_branch_name not between", value1, value2, "fPushBranchName");
            return (Criteria) this;
        }

        public Criteria andFPushBranchShaIsNull() {
            addCriterion("F_push_branch_sha is null");
            return (Criteria) this;
        }

        public Criteria andFPushBranchShaIsNotNull() {
            addCriterion("F_push_branch_sha is not null");
            return (Criteria) this;
        }

        public Criteria andFPushBranchShaEqualTo(String value) {
            addCriterion("F_push_branch_sha =", value, "fPushBranchSha");
            return (Criteria) this;
        }

        public Criteria andFPushBranchShaNotEqualTo(String value) {
            addCriterion("F_push_branch_sha <>", value, "fPushBranchSha");
            return (Criteria) this;
        }

        public Criteria andFPushBranchShaGreaterThan(String value) {
            addCriterion("F_push_branch_sha >", value, "fPushBranchSha");
            return (Criteria) this;
        }

        public Criteria andFPushBranchShaGreaterThanOrEqualTo(String value) {
            addCriterion("F_push_branch_sha >=", value, "fPushBranchSha");
            return (Criteria) this;
        }

        public Criteria andFPushBranchShaLessThan(String value) {
            addCriterion("F_push_branch_sha <", value, "fPushBranchSha");
            return (Criteria) this;
        }

        public Criteria andFPushBranchShaLessThanOrEqualTo(String value) {
            addCriterion("F_push_branch_sha <=", value, "fPushBranchSha");
            return (Criteria) this;
        }

        public Criteria andFPushBranchShaLike(String value) {
            addCriterion("F_push_branch_sha like", value, "fPushBranchSha");
            return (Criteria) this;
        }

        public Criteria andFPushBranchShaNotLike(String value) {
            addCriterion("F_push_branch_sha not like", value, "fPushBranchSha");
            return (Criteria) this;
        }

        public Criteria andFPushBranchShaIn(List<String> values) {
            addCriterion("F_push_branch_sha in", values, "fPushBranchSha");
            return (Criteria) this;
        }

        public Criteria andFPushBranchShaNotIn(List<String> values) {
            addCriterion("F_push_branch_sha not in", values, "fPushBranchSha");
            return (Criteria) this;
        }

        public Criteria andFPushBranchShaBetween(String value1, String value2) {
            addCriterion("F_push_branch_sha between", value1, value2, "fPushBranchSha");
            return (Criteria) this;
        }

        public Criteria andFPushBranchShaNotBetween(String value1, String value2) {
            addCriterion("F_push_branch_sha not between", value1, value2, "fPushBranchSha");
            return (Criteria) this;
        }

        public Criteria andFPushPathIsNull() {
            addCriterion("F_push_path is null");
            return (Criteria) this;
        }

        public Criteria andFPushPathIsNotNull() {
            addCriterion("F_push_path is not null");
            return (Criteria) this;
        }

        public Criteria andFPushPathEqualTo(String value) {
            addCriterion("F_push_path =", value, "fPushPath");
            return (Criteria) this;
        }

        public Criteria andFPushPathNotEqualTo(String value) {
            addCriterion("F_push_path <>", value, "fPushPath");
            return (Criteria) this;
        }

        public Criteria andFPushPathGreaterThan(String value) {
            addCriterion("F_push_path >", value, "fPushPath");
            return (Criteria) this;
        }

        public Criteria andFPushPathGreaterThanOrEqualTo(String value) {
            addCriterion("F_push_path >=", value, "fPushPath");
            return (Criteria) this;
        }

        public Criteria andFPushPathLessThan(String value) {
            addCriterion("F_push_path <", value, "fPushPath");
            return (Criteria) this;
        }

        public Criteria andFPushPathLessThanOrEqualTo(String value) {
            addCriterion("F_push_path <=", value, "fPushPath");
            return (Criteria) this;
        }

        public Criteria andFPushPathLike(String value) {
            addCriterion("F_push_path like", value, "fPushPath");
            return (Criteria) this;
        }

        public Criteria andFPushPathNotLike(String value) {
            addCriterion("F_push_path not like", value, "fPushPath");
            return (Criteria) this;
        }

        public Criteria andFPushPathIn(List<String> values) {
            addCriterion("F_push_path in", values, "fPushPath");
            return (Criteria) this;
        }

        public Criteria andFPushPathNotIn(List<String> values) {
            addCriterion("F_push_path not in", values, "fPushPath");
            return (Criteria) this;
        }

        public Criteria andFPushPathBetween(String value1, String value2) {
            addCriterion("F_push_path between", value1, value2, "fPushPath");
            return (Criteria) this;
        }

        public Criteria andFPushPathNotBetween(String value1, String value2) {
            addCriterion("F_push_path not between", value1, value2, "fPushPath");
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