package com.zanzhu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZanzhuActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZanzhuActivityExample() {
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

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
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

        public Criteria andActivityAddressIsNull() {
            addCriterion("activity_address is null");
            return (Criteria) this;
        }

        public Criteria andActivityAddressIsNotNull() {
            addCriterion("activity_address is not null");
            return (Criteria) this;
        }

        public Criteria andActivityAddressEqualTo(String value) {
            addCriterion("activity_address =", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotEqualTo(String value) {
            addCriterion("activity_address <>", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressGreaterThan(String value) {
            addCriterion("activity_address >", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressGreaterThanOrEqualTo(String value) {
            addCriterion("activity_address >=", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressLessThan(String value) {
            addCriterion("activity_address <", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressLessThanOrEqualTo(String value) {
            addCriterion("activity_address <=", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressLike(String value) {
            addCriterion("activity_address like", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotLike(String value) {
            addCriterion("activity_address not like", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressIn(List<String> values) {
            addCriterion("activity_address in", values, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotIn(List<String> values) {
            addCriterion("activity_address not in", values, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressBetween(String value1, String value2) {
            addCriterion("activity_address between", value1, value2, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotBetween(String value1, String value2) {
            addCriterion("activity_address not between", value1, value2, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyIsNull() {
            addCriterion("activity_money is null");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyIsNotNull() {
            addCriterion("activity_money is not null");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyEqualTo(BigDecimal value) {
            addCriterion("activity_money =", value, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyNotEqualTo(BigDecimal value) {
            addCriterion("activity_money <>", value, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyGreaterThan(BigDecimal value) {
            addCriterion("activity_money >", value, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("activity_money >=", value, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyLessThan(BigDecimal value) {
            addCriterion("activity_money <", value, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("activity_money <=", value, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyIn(List<BigDecimal> values) {
            addCriterion("activity_money in", values, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyNotIn(List<BigDecimal> values) {
            addCriterion("activity_money not in", values, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("activity_money between", value1, value2, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("activity_money not between", value1, value2, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityAttachmentIsNull() {
            addCriterion("activity_attachment is null");
            return (Criteria) this;
        }

        public Criteria andActivityAttachmentIsNotNull() {
            addCriterion("activity_attachment is not null");
            return (Criteria) this;
        }

        public Criteria andActivityAttachmentEqualTo(String value) {
            addCriterion("activity_attachment =", value, "activityAttachment");
            return (Criteria) this;
        }

        public Criteria andActivityAttachmentNotEqualTo(String value) {
            addCriterion("activity_attachment <>", value, "activityAttachment");
            return (Criteria) this;
        }

        public Criteria andActivityAttachmentGreaterThan(String value) {
            addCriterion("activity_attachment >", value, "activityAttachment");
            return (Criteria) this;
        }

        public Criteria andActivityAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("activity_attachment >=", value, "activityAttachment");
            return (Criteria) this;
        }

        public Criteria andActivityAttachmentLessThan(String value) {
            addCriterion("activity_attachment <", value, "activityAttachment");
            return (Criteria) this;
        }

        public Criteria andActivityAttachmentLessThanOrEqualTo(String value) {
            addCriterion("activity_attachment <=", value, "activityAttachment");
            return (Criteria) this;
        }

        public Criteria andActivityAttachmentLike(String value) {
            addCriterion("activity_attachment like", value, "activityAttachment");
            return (Criteria) this;
        }

        public Criteria andActivityAttachmentNotLike(String value) {
            addCriterion("activity_attachment not like", value, "activityAttachment");
            return (Criteria) this;
        }

        public Criteria andActivityAttachmentIn(List<String> values) {
            addCriterion("activity_attachment in", values, "activityAttachment");
            return (Criteria) this;
        }

        public Criteria andActivityAttachmentNotIn(List<String> values) {
            addCriterion("activity_attachment not in", values, "activityAttachment");
            return (Criteria) this;
        }

        public Criteria andActivityAttachmentBetween(String value1, String value2) {
            addCriterion("activity_attachment between", value1, value2, "activityAttachment");
            return (Criteria) this;
        }

        public Criteria andActivityAttachmentNotBetween(String value1, String value2) {
            addCriterion("activity_attachment not between", value1, value2, "activityAttachment");
            return (Criteria) this;
        }

        public Criteria andActivityUnionIdIsNull() {
            addCriterion("activity_union_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityUnionIdIsNotNull() {
            addCriterion("activity_union_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityUnionIdEqualTo(Integer value) {
            addCriterion("activity_union_id =", value, "activityUnionId");
            return (Criteria) this;
        }

        public Criteria andActivityUnionIdNotEqualTo(Integer value) {
            addCriterion("activity_union_id <>", value, "activityUnionId");
            return (Criteria) this;
        }

        public Criteria andActivityUnionIdGreaterThan(Integer value) {
            addCriterion("activity_union_id >", value, "activityUnionId");
            return (Criteria) this;
        }

        public Criteria andActivityUnionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_union_id >=", value, "activityUnionId");
            return (Criteria) this;
        }

        public Criteria andActivityUnionIdLessThan(Integer value) {
            addCriterion("activity_union_id <", value, "activityUnionId");
            return (Criteria) this;
        }

        public Criteria andActivityUnionIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_union_id <=", value, "activityUnionId");
            return (Criteria) this;
        }

        public Criteria andActivityUnionIdIn(List<Integer> values) {
            addCriterion("activity_union_id in", values, "activityUnionId");
            return (Criteria) this;
        }

        public Criteria andActivityUnionIdNotIn(List<Integer> values) {
            addCriterion("activity_union_id not in", values, "activityUnionId");
            return (Criteria) this;
        }

        public Criteria andActivityUnionIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_union_id between", value1, value2, "activityUnionId");
            return (Criteria) this;
        }

        public Criteria andActivityUnionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_union_id not between", value1, value2, "activityUnionId");
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