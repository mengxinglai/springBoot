package com.shineyue.model;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
        oredCriteria = new ArrayList<Criteria>();
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

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(String value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(String value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(String value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(String value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(String value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLike(String value) {
            addCriterion("t_id like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotLike(String value) {
            addCriterion("t_id not like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<String> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<String> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(String value1, String value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(String value1, String value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("t_name is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("t_name is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("t_name =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("t_name <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("t_name >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_name >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("t_name <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("t_name <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("t_name like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("t_name not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("t_name in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("t_name not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("t_name between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("t_name not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTAgeIsNull() {
            addCriterion("t_age is null");
            return (Criteria) this;
        }

        public Criteria andTAgeIsNotNull() {
            addCriterion("t_age is not null");
            return (Criteria) this;
        }

        public Criteria andTAgeEqualTo(Short value) {
            addCriterion("t_age =", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotEqualTo(Short value) {
            addCriterion("t_age <>", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeGreaterThan(Short value) {
            addCriterion("t_age >", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeGreaterThanOrEqualTo(Short value) {
            addCriterion("t_age >=", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeLessThan(Short value) {
            addCriterion("t_age <", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeLessThanOrEqualTo(Short value) {
            addCriterion("t_age <=", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeIn(List<Short> values) {
            addCriterion("t_age in", values, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotIn(List<Short> values) {
            addCriterion("t_age not in", values, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeBetween(Short value1, Short value2) {
            addCriterion("t_age between", value1, value2, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotBetween(Short value1, Short value2) {
            addCriterion("t_age not between", value1, value2, "tAge");
            return (Criteria) this;
        }

        public Criteria andTSexIsNull() {
            addCriterion("t_sex is null");
            return (Criteria) this;
        }

        public Criteria andTSexIsNotNull() {
            addCriterion("t_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTSexEqualTo(String value) {
            addCriterion("t_sex =", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotEqualTo(String value) {
            addCriterion("t_sex <>", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexGreaterThan(String value) {
            addCriterion("t_sex >", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexGreaterThanOrEqualTo(String value) {
            addCriterion("t_sex >=", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLessThan(String value) {
            addCriterion("t_sex <", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLessThanOrEqualTo(String value) {
            addCriterion("t_sex <=", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLike(String value) {
            addCriterion("t_sex like", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotLike(String value) {
            addCriterion("t_sex not like", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexIn(List<String> values) {
            addCriterion("t_sex in", values, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotIn(List<String> values) {
            addCriterion("t_sex not in", values, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexBetween(String value1, String value2) {
            addCriterion("t_sex between", value1, value2, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotBetween(String value1, String value2) {
            addCriterion("t_sex not between", value1, value2, "tSex");
            return (Criteria) this;
        }

        public Criteria andTTeamIdIsNull() {
            addCriterion("t_team_id is null");
            return (Criteria) this;
        }

        public Criteria andTTeamIdIsNotNull() {
            addCriterion("t_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andTTeamIdEqualTo(String value) {
            addCriterion("t_team_id =", value, "tTeamId");
            return (Criteria) this;
        }

        public Criteria andTTeamIdNotEqualTo(String value) {
            addCriterion("t_team_id <>", value, "tTeamId");
            return (Criteria) this;
        }

        public Criteria andTTeamIdGreaterThan(String value) {
            addCriterion("t_team_id >", value, "tTeamId");
            return (Criteria) this;
        }

        public Criteria andTTeamIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_team_id >=", value, "tTeamId");
            return (Criteria) this;
        }

        public Criteria andTTeamIdLessThan(String value) {
            addCriterion("t_team_id <", value, "tTeamId");
            return (Criteria) this;
        }

        public Criteria andTTeamIdLessThanOrEqualTo(String value) {
            addCriterion("t_team_id <=", value, "tTeamId");
            return (Criteria) this;
        }

        public Criteria andTTeamIdLike(String value) {
            addCriterion("t_team_id like", value, "tTeamId");
            return (Criteria) this;
        }

        public Criteria andTTeamIdNotLike(String value) {
            addCriterion("t_team_id not like", value, "tTeamId");
            return (Criteria) this;
        }

        public Criteria andTTeamIdIn(List<String> values) {
            addCriterion("t_team_id in", values, "tTeamId");
            return (Criteria) this;
        }

        public Criteria andTTeamIdNotIn(List<String> values) {
            addCriterion("t_team_id not in", values, "tTeamId");
            return (Criteria) this;
        }

        public Criteria andTTeamIdBetween(String value1, String value2) {
            addCriterion("t_team_id between", value1, value2, "tTeamId");
            return (Criteria) this;
        }

        public Criteria andTTeamIdNotBetween(String value1, String value2) {
            addCriterion("t_team_id not between", value1, value2, "tTeamId");
            return (Criteria) this;
        }

        public Criteria andTStatusIsNull() {
            addCriterion("t_status is null");
            return (Criteria) this;
        }

        public Criteria andTStatusIsNotNull() {
            addCriterion("t_status is not null");
            return (Criteria) this;
        }

        public Criteria andTStatusEqualTo(Short value) {
            addCriterion("t_status =", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusNotEqualTo(Short value) {
            addCriterion("t_status <>", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusGreaterThan(Short value) {
            addCriterion("t_status >", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("t_status >=", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusLessThan(Short value) {
            addCriterion("t_status <", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusLessThanOrEqualTo(Short value) {
            addCriterion("t_status <=", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusIn(List<Short> values) {
            addCriterion("t_status in", values, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusNotIn(List<Short> values) {
            addCriterion("t_status not in", values, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusBetween(Short value1, Short value2) {
            addCriterion("t_status between", value1, value2, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusNotBetween(Short value1, Short value2) {
            addCriterion("t_status not between", value1, value2, "tStatus");
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