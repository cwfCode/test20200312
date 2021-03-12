package com.tmxmall.connector.dal.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConnectorFileDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConnectorFileDOExample() {
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

        public Criteria andFFileIdIsNull() {
            addCriterion("F_file_id is null");
            return (Criteria) this;
        }

        public Criteria andFFileIdIsNotNull() {
            addCriterion("F_file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFFileIdEqualTo(String value) {
            addCriterion("F_file_id =", value, "fFileId");
            return (Criteria) this;
        }

        public Criteria andFFileIdNotEqualTo(String value) {
            addCriterion("F_file_id <>", value, "fFileId");
            return (Criteria) this;
        }

        public Criteria andFFileIdGreaterThan(String value) {
            addCriterion("F_file_id >", value, "fFileId");
            return (Criteria) this;
        }

        public Criteria andFFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_file_id >=", value, "fFileId");
            return (Criteria) this;
        }

        public Criteria andFFileIdLessThan(String value) {
            addCriterion("F_file_id <", value, "fFileId");
            return (Criteria) this;
        }

        public Criteria andFFileIdLessThanOrEqualTo(String value) {
            addCriterion("F_file_id <=", value, "fFileId");
            return (Criteria) this;
        }

        public Criteria andFFileIdLike(String value) {
            addCriterion("F_file_id like", value, "fFileId");
            return (Criteria) this;
        }

        public Criteria andFFileIdNotLike(String value) {
            addCriterion("F_file_id not like", value, "fFileId");
            return (Criteria) this;
        }

        public Criteria andFFileIdIn(List<String> values) {
            addCriterion("F_file_id in", values, "fFileId");
            return (Criteria) this;
        }

        public Criteria andFFileIdNotIn(List<String> values) {
            addCriterion("F_file_id not in", values, "fFileId");
            return (Criteria) this;
        }

        public Criteria andFFileIdBetween(String value1, String value2) {
            addCriterion("F_file_id between", value1, value2, "fFileId");
            return (Criteria) this;
        }

        public Criteria andFFileIdNotBetween(String value1, String value2) {
            addCriterion("F_file_id not between", value1, value2, "fFileId");
            return (Criteria) this;
        }

        public Criteria andFOriginalFileIdIsNull() {
            addCriterion("F_original_file_id is null");
            return (Criteria) this;
        }

        public Criteria andFOriginalFileIdIsNotNull() {
            addCriterion("F_original_file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFOriginalFileIdEqualTo(String value) {
            addCriterion("F_original_file_id =", value, "fOriginalFileId");
            return (Criteria) this;
        }

        public Criteria andFOriginalFileIdNotEqualTo(String value) {
            addCriterion("F_original_file_id <>", value, "fOriginalFileId");
            return (Criteria) this;
        }

        public Criteria andFOriginalFileIdGreaterThan(String value) {
            addCriterion("F_original_file_id >", value, "fOriginalFileId");
            return (Criteria) this;
        }

        public Criteria andFOriginalFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_original_file_id >=", value, "fOriginalFileId");
            return (Criteria) this;
        }

        public Criteria andFOriginalFileIdLessThan(String value) {
            addCriterion("F_original_file_id <", value, "fOriginalFileId");
            return (Criteria) this;
        }

        public Criteria andFOriginalFileIdLessThanOrEqualTo(String value) {
            addCriterion("F_original_file_id <=", value, "fOriginalFileId");
            return (Criteria) this;
        }

        public Criteria andFOriginalFileIdLike(String value) {
            addCriterion("F_original_file_id like", value, "fOriginalFileId");
            return (Criteria) this;
        }

        public Criteria andFOriginalFileIdNotLike(String value) {
            addCriterion("F_original_file_id not like", value, "fOriginalFileId");
            return (Criteria) this;
        }

        public Criteria andFOriginalFileIdIn(List<String> values) {
            addCriterion("F_original_file_id in", values, "fOriginalFileId");
            return (Criteria) this;
        }

        public Criteria andFOriginalFileIdNotIn(List<String> values) {
            addCriterion("F_original_file_id not in", values, "fOriginalFileId");
            return (Criteria) this;
        }

        public Criteria andFOriginalFileIdBetween(String value1, String value2) {
            addCriterion("F_original_file_id between", value1, value2, "fOriginalFileId");
            return (Criteria) this;
        }

        public Criteria andFOriginalFileIdNotBetween(String value1, String value2) {
            addCriterion("F_original_file_id not between", value1, value2, "fOriginalFileId");
            return (Criteria) this;
        }

        public Criteria andFFileShaIsNull() {
            addCriterion("F_file_sha is null");
            return (Criteria) this;
        }

        public Criteria andFFileShaIsNotNull() {
            addCriterion("F_file_sha is not null");
            return (Criteria) this;
        }

        public Criteria andFFileShaEqualTo(String value) {
            addCriterion("F_file_sha =", value, "fFileSha");
            return (Criteria) this;
        }

        public Criteria andFFileShaNotEqualTo(String value) {
            addCriterion("F_file_sha <>", value, "fFileSha");
            return (Criteria) this;
        }

        public Criteria andFFileShaGreaterThan(String value) {
            addCriterion("F_file_sha >", value, "fFileSha");
            return (Criteria) this;
        }

        public Criteria andFFileShaGreaterThanOrEqualTo(String value) {
            addCriterion("F_file_sha >=", value, "fFileSha");
            return (Criteria) this;
        }

        public Criteria andFFileShaLessThan(String value) {
            addCriterion("F_file_sha <", value, "fFileSha");
            return (Criteria) this;
        }

        public Criteria andFFileShaLessThanOrEqualTo(String value) {
            addCriterion("F_file_sha <=", value, "fFileSha");
            return (Criteria) this;
        }

        public Criteria andFFileShaLike(String value) {
            addCriterion("F_file_sha like", value, "fFileSha");
            return (Criteria) this;
        }

        public Criteria andFFileShaNotLike(String value) {
            addCriterion("F_file_sha not like", value, "fFileSha");
            return (Criteria) this;
        }

        public Criteria andFFileShaIn(List<String> values) {
            addCriterion("F_file_sha in", values, "fFileSha");
            return (Criteria) this;
        }

        public Criteria andFFileShaNotIn(List<String> values) {
            addCriterion("F_file_sha not in", values, "fFileSha");
            return (Criteria) this;
        }

        public Criteria andFFileShaBetween(String value1, String value2) {
            addCriterion("F_file_sha between", value1, value2, "fFileSha");
            return (Criteria) this;
        }

        public Criteria andFFileShaNotBetween(String value1, String value2) {
            addCriterion("F_file_sha not between", value1, value2, "fFileSha");
            return (Criteria) this;
        }

        public Criteria andFFileNameIsNull() {
            addCriterion("F_file_name is null");
            return (Criteria) this;
        }

        public Criteria andFFileNameIsNotNull() {
            addCriterion("F_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFFileNameEqualTo(String value) {
            addCriterion("F_file_name =", value, "fFileName");
            return (Criteria) this;
        }

        public Criteria andFFileNameNotEqualTo(String value) {
            addCriterion("F_file_name <>", value, "fFileName");
            return (Criteria) this;
        }

        public Criteria andFFileNameGreaterThan(String value) {
            addCriterion("F_file_name >", value, "fFileName");
            return (Criteria) this;
        }

        public Criteria andFFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_file_name >=", value, "fFileName");
            return (Criteria) this;
        }

        public Criteria andFFileNameLessThan(String value) {
            addCriterion("F_file_name <", value, "fFileName");
            return (Criteria) this;
        }

        public Criteria andFFileNameLessThanOrEqualTo(String value) {
            addCriterion("F_file_name <=", value, "fFileName");
            return (Criteria) this;
        }

        public Criteria andFFileNameLike(String value) {
            addCriterion("F_file_name like", value, "fFileName");
            return (Criteria) this;
        }

        public Criteria andFFileNameNotLike(String value) {
            addCriterion("F_file_name not like", value, "fFileName");
            return (Criteria) this;
        }

        public Criteria andFFileNameIn(List<String> values) {
            addCriterion("F_file_name in", values, "fFileName");
            return (Criteria) this;
        }

        public Criteria andFFileNameNotIn(List<String> values) {
            addCriterion("F_file_name not in", values, "fFileName");
            return (Criteria) this;
        }

        public Criteria andFFileNameBetween(String value1, String value2) {
            addCriterion("F_file_name between", value1, value2, "fFileName");
            return (Criteria) this;
        }

        public Criteria andFFileNameNotBetween(String value1, String value2) {
            addCriterion("F_file_name not between", value1, value2, "fFileName");
            return (Criteria) this;
        }

        public Criteria andFParentPathIsNull() {
            addCriterion("F_parent_path is null");
            return (Criteria) this;
        }

        public Criteria andFParentPathIsNotNull() {
            addCriterion("F_parent_path is not null");
            return (Criteria) this;
        }

        public Criteria andFParentPathEqualTo(String value) {
            addCriterion("F_parent_path =", value, "fParentPath");
            return (Criteria) this;
        }

        public Criteria andFParentPathNotEqualTo(String value) {
            addCriterion("F_parent_path <>", value, "fParentPath");
            return (Criteria) this;
        }

        public Criteria andFParentPathGreaterThan(String value) {
            addCriterion("F_parent_path >", value, "fParentPath");
            return (Criteria) this;
        }

        public Criteria andFParentPathGreaterThanOrEqualTo(String value) {
            addCriterion("F_parent_path >=", value, "fParentPath");
            return (Criteria) this;
        }

        public Criteria andFParentPathLessThan(String value) {
            addCriterion("F_parent_path <", value, "fParentPath");
            return (Criteria) this;
        }

        public Criteria andFParentPathLessThanOrEqualTo(String value) {
            addCriterion("F_parent_path <=", value, "fParentPath");
            return (Criteria) this;
        }

        public Criteria andFParentPathLike(String value) {
            addCriterion("F_parent_path like", value, "fParentPath");
            return (Criteria) this;
        }

        public Criteria andFParentPathNotLike(String value) {
            addCriterion("F_parent_path not like", value, "fParentPath");
            return (Criteria) this;
        }

        public Criteria andFParentPathIn(List<String> values) {
            addCriterion("F_parent_path in", values, "fParentPath");
            return (Criteria) this;
        }

        public Criteria andFParentPathNotIn(List<String> values) {
            addCriterion("F_parent_path not in", values, "fParentPath");
            return (Criteria) this;
        }

        public Criteria andFParentPathBetween(String value1, String value2) {
            addCriterion("F_parent_path between", value1, value2, "fParentPath");
            return (Criteria) this;
        }

        public Criteria andFParentPathNotBetween(String value1, String value2) {
            addCriterion("F_parent_path not between", value1, value2, "fParentPath");
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