package com.zanzhu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SponsorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SponsorExample() {
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

        public Criteria andSponsorIdIsNull() {
            addCriterion("sponsor_id is null");
            return (Criteria) this;
        }

        public Criteria andSponsorIdIsNotNull() {
            addCriterion("sponsor_id is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorIdEqualTo(Integer value) {
            addCriterion("sponsor_id =", value, "sponsorId");
            return (Criteria) this;
        }

        public Criteria andSponsorIdNotEqualTo(Integer value) {
            addCriterion("sponsor_id <>", value, "sponsorId");
            return (Criteria) this;
        }

        public Criteria andSponsorIdGreaterThan(Integer value) {
            addCriterion("sponsor_id >", value, "sponsorId");
            return (Criteria) this;
        }

        public Criteria andSponsorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sponsor_id >=", value, "sponsorId");
            return (Criteria) this;
        }

        public Criteria andSponsorIdLessThan(Integer value) {
            addCriterion("sponsor_id <", value, "sponsorId");
            return (Criteria) this;
        }

        public Criteria andSponsorIdLessThanOrEqualTo(Integer value) {
            addCriterion("sponsor_id <=", value, "sponsorId");
            return (Criteria) this;
        }

        public Criteria andSponsorIdIn(List<Integer> values) {
            addCriterion("sponsor_id in", values, "sponsorId");
            return (Criteria) this;
        }

        public Criteria andSponsorIdNotIn(List<Integer> values) {
            addCriterion("sponsor_id not in", values, "sponsorId");
            return (Criteria) this;
        }

        public Criteria andSponsorIdBetween(Integer value1, Integer value2) {
            addCriterion("sponsor_id between", value1, value2, "sponsorId");
            return (Criteria) this;
        }

        public Criteria andSponsorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sponsor_id not between", value1, value2, "sponsorId");
            return (Criteria) this;
        }

        public Criteria andSponsorNameIsNull() {
            addCriterion("sponsor_name is null");
            return (Criteria) this;
        }

        public Criteria andSponsorNameIsNotNull() {
            addCriterion("sponsor_name is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorNameEqualTo(String value) {
            addCriterion("sponsor_name =", value, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameNotEqualTo(String value) {
            addCriterion("sponsor_name <>", value, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameGreaterThan(String value) {
            addCriterion("sponsor_name >", value, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameGreaterThanOrEqualTo(String value) {
            addCriterion("sponsor_name >=", value, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameLessThan(String value) {
            addCriterion("sponsor_name <", value, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameLessThanOrEqualTo(String value) {
            addCriterion("sponsor_name <=", value, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameLike(String value) {
            addCriterion("sponsor_name like", value, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameNotLike(String value) {
            addCriterion("sponsor_name not like", value, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameIn(List<String> values) {
            addCriterion("sponsor_name in", values, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameNotIn(List<String> values) {
            addCriterion("sponsor_name not in", values, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameBetween(String value1, String value2) {
            addCriterion("sponsor_name between", value1, value2, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameNotBetween(String value1, String value2) {
            addCriterion("sponsor_name not between", value1, value2, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andSponsorAddressIsNull() {
            addCriterion("sponsor_address is null");
            return (Criteria) this;
        }

        public Criteria andSponsorAddressIsNotNull() {
            addCriterion("sponsor_address is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorAddressEqualTo(String value) {
            addCriterion("sponsor_address =", value, "sponsorAddress");
            return (Criteria) this;
        }

        public Criteria andSponsorAddressNotEqualTo(String value) {
            addCriterion("sponsor_address <>", value, "sponsorAddress");
            return (Criteria) this;
        }

        public Criteria andSponsorAddressGreaterThan(String value) {
            addCriterion("sponsor_address >", value, "sponsorAddress");
            return (Criteria) this;
        }

        public Criteria andSponsorAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sponsor_address >=", value, "sponsorAddress");
            return (Criteria) this;
        }

        public Criteria andSponsorAddressLessThan(String value) {
            addCriterion("sponsor_address <", value, "sponsorAddress");
            return (Criteria) this;
        }

        public Criteria andSponsorAddressLessThanOrEqualTo(String value) {
            addCriterion("sponsor_address <=", value, "sponsorAddress");
            return (Criteria) this;
        }

        public Criteria andSponsorAddressLike(String value) {
            addCriterion("sponsor_address like", value, "sponsorAddress");
            return (Criteria) this;
        }

        public Criteria andSponsorAddressNotLike(String value) {
            addCriterion("sponsor_address not like", value, "sponsorAddress");
            return (Criteria) this;
        }

        public Criteria andSponsorAddressIn(List<String> values) {
            addCriterion("sponsor_address in", values, "sponsorAddress");
            return (Criteria) this;
        }

        public Criteria andSponsorAddressNotIn(List<String> values) {
            addCriterion("sponsor_address not in", values, "sponsorAddress");
            return (Criteria) this;
        }

        public Criteria andSponsorAddressBetween(String value1, String value2) {
            addCriterion("sponsor_address between", value1, value2, "sponsorAddress");
            return (Criteria) this;
        }

        public Criteria andSponsorAddressNotBetween(String value1, String value2) {
            addCriterion("sponsor_address not between", value1, value2, "sponsorAddress");
            return (Criteria) this;
        }

        public Criteria andSponsorCategoryIsNull() {
            addCriterion("sponsor_category is null");
            return (Criteria) this;
        }

        public Criteria andSponsorCategoryIsNotNull() {
            addCriterion("sponsor_category is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorCategoryEqualTo(String value) {
            addCriterion("sponsor_category =", value, "sponsorCategory");
            return (Criteria) this;
        }

        public Criteria andSponsorCategoryNotEqualTo(String value) {
            addCriterion("sponsor_category <>", value, "sponsorCategory");
            return (Criteria) this;
        }

        public Criteria andSponsorCategoryGreaterThan(String value) {
            addCriterion("sponsor_category >", value, "sponsorCategory");
            return (Criteria) this;
        }

        public Criteria andSponsorCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("sponsor_category >=", value, "sponsorCategory");
            return (Criteria) this;
        }

        public Criteria andSponsorCategoryLessThan(String value) {
            addCriterion("sponsor_category <", value, "sponsorCategory");
            return (Criteria) this;
        }

        public Criteria andSponsorCategoryLessThanOrEqualTo(String value) {
            addCriterion("sponsor_category <=", value, "sponsorCategory");
            return (Criteria) this;
        }

        public Criteria andSponsorCategoryLike(String value) {
            addCriterion("sponsor_category like", value, "sponsorCategory");
            return (Criteria) this;
        }

        public Criteria andSponsorCategoryNotLike(String value) {
            addCriterion("sponsor_category not like", value, "sponsorCategory");
            return (Criteria) this;
        }

        public Criteria andSponsorCategoryIn(List<String> values) {
            addCriterion("sponsor_category in", values, "sponsorCategory");
            return (Criteria) this;
        }

        public Criteria andSponsorCategoryNotIn(List<String> values) {
            addCriterion("sponsor_category not in", values, "sponsorCategory");
            return (Criteria) this;
        }

        public Criteria andSponsorCategoryBetween(String value1, String value2) {
            addCriterion("sponsor_category between", value1, value2, "sponsorCategory");
            return (Criteria) this;
        }

        public Criteria andSponsorCategoryNotBetween(String value1, String value2) {
            addCriterion("sponsor_category not between", value1, value2, "sponsorCategory");
            return (Criteria) this;
        }

        public Criteria andSponsorMoneyIsNull() {
            addCriterion("sponsor_money is null");
            return (Criteria) this;
        }

        public Criteria andSponsorMoneyIsNotNull() {
            addCriterion("sponsor_money is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorMoneyEqualTo(BigDecimal value) {
            addCriterion("sponsor_money =", value, "sponsorMoney");
            return (Criteria) this;
        }

        public Criteria andSponsorMoneyNotEqualTo(BigDecimal value) {
            addCriterion("sponsor_money <>", value, "sponsorMoney");
            return (Criteria) this;
        }

        public Criteria andSponsorMoneyGreaterThan(BigDecimal value) {
            addCriterion("sponsor_money >", value, "sponsorMoney");
            return (Criteria) this;
        }

        public Criteria andSponsorMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sponsor_money >=", value, "sponsorMoney");
            return (Criteria) this;
        }

        public Criteria andSponsorMoneyLessThan(BigDecimal value) {
            addCriterion("sponsor_money <", value, "sponsorMoney");
            return (Criteria) this;
        }

        public Criteria andSponsorMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sponsor_money <=", value, "sponsorMoney");
            return (Criteria) this;
        }

        public Criteria andSponsorMoneyIn(List<BigDecimal> values) {
            addCriterion("sponsor_money in", values, "sponsorMoney");
            return (Criteria) this;
        }

        public Criteria andSponsorMoneyNotIn(List<BigDecimal> values) {
            addCriterion("sponsor_money not in", values, "sponsorMoney");
            return (Criteria) this;
        }

        public Criteria andSponsorMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sponsor_money between", value1, value2, "sponsorMoney");
            return (Criteria) this;
        }

        public Criteria andSponsorMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sponsor_money not between", value1, value2, "sponsorMoney");
            return (Criteria) this;
        }

        public Criteria andSponsorAttachmentIsNull() {
            addCriterion("sponsor_attachment is null");
            return (Criteria) this;
        }

        public Criteria andSponsorAttachmentIsNotNull() {
            addCriterion("sponsor_attachment is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorAttachmentEqualTo(String value) {
            addCriterion("sponsor_attachment =", value, "sponsorAttachment");
            return (Criteria) this;
        }

        public Criteria andSponsorAttachmentNotEqualTo(String value) {
            addCriterion("sponsor_attachment <>", value, "sponsorAttachment");
            return (Criteria) this;
        }

        public Criteria andSponsorAttachmentGreaterThan(String value) {
            addCriterion("sponsor_attachment >", value, "sponsorAttachment");
            return (Criteria) this;
        }

        public Criteria andSponsorAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("sponsor_attachment >=", value, "sponsorAttachment");
            return (Criteria) this;
        }

        public Criteria andSponsorAttachmentLessThan(String value) {
            addCriterion("sponsor_attachment <", value, "sponsorAttachment");
            return (Criteria) this;
        }

        public Criteria andSponsorAttachmentLessThanOrEqualTo(String value) {
            addCriterion("sponsor_attachment <=", value, "sponsorAttachment");
            return (Criteria) this;
        }

        public Criteria andSponsorAttachmentLike(String value) {
            addCriterion("sponsor_attachment like", value, "sponsorAttachment");
            return (Criteria) this;
        }

        public Criteria andSponsorAttachmentNotLike(String value) {
            addCriterion("sponsor_attachment not like", value, "sponsorAttachment");
            return (Criteria) this;
        }

        public Criteria andSponsorAttachmentIn(List<String> values) {
            addCriterion("sponsor_attachment in", values, "sponsorAttachment");
            return (Criteria) this;
        }

        public Criteria andSponsorAttachmentNotIn(List<String> values) {
            addCriterion("sponsor_attachment not in", values, "sponsorAttachment");
            return (Criteria) this;
        }

        public Criteria andSponsorAttachmentBetween(String value1, String value2) {
            addCriterion("sponsor_attachment between", value1, value2, "sponsorAttachment");
            return (Criteria) this;
        }

        public Criteria andSponsorAttachmentNotBetween(String value1, String value2) {
            addCriterion("sponsor_attachment not between", value1, value2, "sponsorAttachment");
            return (Criteria) this;
        }

        public Criteria andSponsorCompanyIdIsNull() {
            addCriterion("sponsor_company_id is null");
            return (Criteria) this;
        }

        public Criteria andSponsorCompanyIdIsNotNull() {
            addCriterion("sponsor_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorCompanyIdEqualTo(Integer value) {
            addCriterion("sponsor_company_id =", value, "sponsorCompanyId");
            return (Criteria) this;
        }

        public Criteria andSponsorCompanyIdNotEqualTo(Integer value) {
            addCriterion("sponsor_company_id <>", value, "sponsorCompanyId");
            return (Criteria) this;
        }

        public Criteria andSponsorCompanyIdGreaterThan(Integer value) {
            addCriterion("sponsor_company_id >", value, "sponsorCompanyId");
            return (Criteria) this;
        }

        public Criteria andSponsorCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sponsor_company_id >=", value, "sponsorCompanyId");
            return (Criteria) this;
        }

        public Criteria andSponsorCompanyIdLessThan(Integer value) {
            addCriterion("sponsor_company_id <", value, "sponsorCompanyId");
            return (Criteria) this;
        }

        public Criteria andSponsorCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("sponsor_company_id <=", value, "sponsorCompanyId");
            return (Criteria) this;
        }

        public Criteria andSponsorCompanyIdIn(List<Integer> values) {
            addCriterion("sponsor_company_id in", values, "sponsorCompanyId");
            return (Criteria) this;
        }

        public Criteria andSponsorCompanyIdNotIn(List<Integer> values) {
            addCriterion("sponsor_company_id not in", values, "sponsorCompanyId");
            return (Criteria) this;
        }

        public Criteria andSponsorCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("sponsor_company_id between", value1, value2, "sponsorCompanyId");
            return (Criteria) this;
        }

        public Criteria andSponsorCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sponsor_company_id not between", value1, value2, "sponsorCompanyId");
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