package com.zanzhu.pojo;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyKindIsNull() {
            addCriterion("company_kind is null");
            return (Criteria) this;
        }

        public Criteria andCompanyKindIsNotNull() {
            addCriterion("company_kind is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyKindEqualTo(String value) {
            addCriterion("company_kind =", value, "companyKind");
            return (Criteria) this;
        }

        public Criteria andCompanyKindNotEqualTo(String value) {
            addCriterion("company_kind <>", value, "companyKind");
            return (Criteria) this;
        }

        public Criteria andCompanyKindGreaterThan(String value) {
            addCriterion("company_kind >", value, "companyKind");
            return (Criteria) this;
        }

        public Criteria andCompanyKindGreaterThanOrEqualTo(String value) {
            addCriterion("company_kind >=", value, "companyKind");
            return (Criteria) this;
        }

        public Criteria andCompanyKindLessThan(String value) {
            addCriterion("company_kind <", value, "companyKind");
            return (Criteria) this;
        }

        public Criteria andCompanyKindLessThanOrEqualTo(String value) {
            addCriterion("company_kind <=", value, "companyKind");
            return (Criteria) this;
        }

        public Criteria andCompanyKindLike(String value) {
            addCriterion("company_kind like", value, "companyKind");
            return (Criteria) this;
        }

        public Criteria andCompanyKindNotLike(String value) {
            addCriterion("company_kind not like", value, "companyKind");
            return (Criteria) this;
        }

        public Criteria andCompanyKindIn(List<String> values) {
            addCriterion("company_kind in", values, "companyKind");
            return (Criteria) this;
        }

        public Criteria andCompanyKindNotIn(List<String> values) {
            addCriterion("company_kind not in", values, "companyKind");
            return (Criteria) this;
        }

        public Criteria andCompanyKindBetween(String value1, String value2) {
            addCriterion("company_kind between", value1, value2, "companyKind");
            return (Criteria) this;
        }

        public Criteria andCompanyKindNotBetween(String value1, String value2) {
            addCriterion("company_kind not between", value1, value2, "companyKind");
            return (Criteria) this;
        }

        public Criteria andCompanySizeIsNull() {
            addCriterion("company_size is null");
            return (Criteria) this;
        }

        public Criteria andCompanySizeIsNotNull() {
            addCriterion("company_size is not null");
            return (Criteria) this;
        }

        public Criteria andCompanySizeEqualTo(String value) {
            addCriterion("company_size =", value, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeNotEqualTo(String value) {
            addCriterion("company_size <>", value, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeGreaterThan(String value) {
            addCriterion("company_size >", value, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeGreaterThanOrEqualTo(String value) {
            addCriterion("company_size >=", value, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeLessThan(String value) {
            addCriterion("company_size <", value, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeLessThanOrEqualTo(String value) {
            addCriterion("company_size <=", value, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeLike(String value) {
            addCriterion("company_size like", value, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeNotLike(String value) {
            addCriterion("company_size not like", value, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeIn(List<String> values) {
            addCriterion("company_size in", values, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeNotIn(List<String> values) {
            addCriterion("company_size not in", values, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeBetween(String value1, String value2) {
            addCriterion("company_size between", value1, value2, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeNotBetween(String value1, String value2) {
            addCriterion("company_size not between", value1, value2, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanyCategoryIsNull() {
            addCriterion("company_category is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCategoryIsNotNull() {
            addCriterion("company_category is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCategoryEqualTo(String value) {
            addCriterion("company_category =", value, "companyCategory");
            return (Criteria) this;
        }

        public Criteria andCompanyCategoryNotEqualTo(String value) {
            addCriterion("company_category <>", value, "companyCategory");
            return (Criteria) this;
        }

        public Criteria andCompanyCategoryGreaterThan(String value) {
            addCriterion("company_category >", value, "companyCategory");
            return (Criteria) this;
        }

        public Criteria andCompanyCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("company_category >=", value, "companyCategory");
            return (Criteria) this;
        }

        public Criteria andCompanyCategoryLessThan(String value) {
            addCriterion("company_category <", value, "companyCategory");
            return (Criteria) this;
        }

        public Criteria andCompanyCategoryLessThanOrEqualTo(String value) {
            addCriterion("company_category <=", value, "companyCategory");
            return (Criteria) this;
        }

        public Criteria andCompanyCategoryLike(String value) {
            addCriterion("company_category like", value, "companyCategory");
            return (Criteria) this;
        }

        public Criteria andCompanyCategoryNotLike(String value) {
            addCriterion("company_category not like", value, "companyCategory");
            return (Criteria) this;
        }

        public Criteria andCompanyCategoryIn(List<String> values) {
            addCriterion("company_category in", values, "companyCategory");
            return (Criteria) this;
        }

        public Criteria andCompanyCategoryNotIn(List<String> values) {
            addCriterion("company_category not in", values, "companyCategory");
            return (Criteria) this;
        }

        public Criteria andCompanyCategoryBetween(String value1, String value2) {
            addCriterion("company_category between", value1, value2, "companyCategory");
            return (Criteria) this;
        }

        public Criteria andCompanyCategoryNotBetween(String value1, String value2) {
            addCriterion("company_category not between", value1, value2, "companyCategory");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroIsNull() {
            addCriterion("company_intro is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroIsNotNull() {
            addCriterion("company_intro is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroEqualTo(String value) {
            addCriterion("company_intro =", value, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroNotEqualTo(String value) {
            addCriterion("company_intro <>", value, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroGreaterThan(String value) {
            addCriterion("company_intro >", value, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroGreaterThanOrEqualTo(String value) {
            addCriterion("company_intro >=", value, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroLessThan(String value) {
            addCriterion("company_intro <", value, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroLessThanOrEqualTo(String value) {
            addCriterion("company_intro <=", value, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroLike(String value) {
            addCriterion("company_intro like", value, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroNotLike(String value) {
            addCriterion("company_intro not like", value, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroIn(List<String> values) {
            addCriterion("company_intro in", values, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroNotIn(List<String> values) {
            addCriterion("company_intro not in", values, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroBetween(String value1, String value2) {
            addCriterion("company_intro between", value1, value2, "companyIntro");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroNotBetween(String value1, String value2) {
            addCriterion("company_intro not between", value1, value2, "companyIntro");
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