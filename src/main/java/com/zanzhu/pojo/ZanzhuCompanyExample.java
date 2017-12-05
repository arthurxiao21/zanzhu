package com.zanzhu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ZanzhuCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZanzhuCompanyExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
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

        public Criteria andContactNameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactEmailIsNull() {
            addCriterion("contact_email is null");
            return (Criteria) this;
        }

        public Criteria andContactEmailIsNotNull() {
            addCriterion("contact_email is not null");
            return (Criteria) this;
        }

        public Criteria andContactEmailEqualTo(String value) {
            addCriterion("contact_email =", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotEqualTo(String value) {
            addCriterion("contact_email <>", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailGreaterThan(String value) {
            addCriterion("contact_email >", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailGreaterThanOrEqualTo(String value) {
            addCriterion("contact_email >=", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLessThan(String value) {
            addCriterion("contact_email <", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLessThanOrEqualTo(String value) {
            addCriterion("contact_email <=", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLike(String value) {
            addCriterion("contact_email like", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotLike(String value) {
            addCriterion("contact_email not like", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailIn(List<String> values) {
            addCriterion("contact_email in", values, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotIn(List<String> values) {
            addCriterion("contact_email not in", values, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailBetween(String value1, String value2) {
            addCriterion("contact_email between", value1, value2, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotBetween(String value1, String value2) {
            addCriterion("contact_email not between", value1, value2, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactSexIsNull() {
            addCriterion("contact_sex is null");
            return (Criteria) this;
        }

        public Criteria andContactSexIsNotNull() {
            addCriterion("contact_sex is not null");
            return (Criteria) this;
        }

        public Criteria andContactSexEqualTo(String value) {
            addCriterion("contact_sex =", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexNotEqualTo(String value) {
            addCriterion("contact_sex <>", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexGreaterThan(String value) {
            addCriterion("contact_sex >", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexGreaterThanOrEqualTo(String value) {
            addCriterion("contact_sex >=", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexLessThan(String value) {
            addCriterion("contact_sex <", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexLessThanOrEqualTo(String value) {
            addCriterion("contact_sex <=", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexLike(String value) {
            addCriterion("contact_sex like", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexNotLike(String value) {
            addCriterion("contact_sex not like", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexIn(List<String> values) {
            addCriterion("contact_sex in", values, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexNotIn(List<String> values) {
            addCriterion("contact_sex not in", values, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexBetween(String value1, String value2) {
            addCriterion("contact_sex between", value1, value2, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexNotBetween(String value1, String value2) {
            addCriterion("contact_sex not between", value1, value2, "contactSex");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordIsNull() {
            addCriterion("company_password is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordIsNotNull() {
            addCriterion("company_password is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordEqualTo(String value) {
            addCriterion("company_password =", value, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordNotEqualTo(String value) {
            addCriterion("company_password <>", value, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordGreaterThan(String value) {
            addCriterion("company_password >", value, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("company_password >=", value, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordLessThan(String value) {
            addCriterion("company_password <", value, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordLessThanOrEqualTo(String value) {
            addCriterion("company_password <=", value, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordLike(String value) {
            addCriterion("company_password like", value, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordNotLike(String value) {
            addCriterion("company_password not like", value, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordIn(List<String> values) {
            addCriterion("company_password in", values, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordNotIn(List<String> values) {
            addCriterion("company_password not in", values, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordBetween(String value1, String value2) {
            addCriterion("company_password between", value1, value2, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordNotBetween(String value1, String value2) {
            addCriterion("company_password not between", value1, value2, "companyPassword");
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