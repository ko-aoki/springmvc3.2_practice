package jp.gr.java_conf.ko_aoki.common.domain;

import java.util.ArrayList;
import java.util.List;

public class MDeptExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table SADB.M_DEPT
	 * @mbggenerated  Wed Dec 11 22:21:06 JST 2013
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table SADB.M_DEPT
	 * @mbggenerated  Wed Dec 11 22:21:06 JST 2013
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table SADB.M_DEPT
	 * @mbggenerated  Wed Dec 11 22:21:06 JST 2013
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SADB.M_DEPT
	 * @mbggenerated  Wed Dec 11 22:21:06 JST 2013
	 */
	public MDeptExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SADB.M_DEPT
	 * @mbggenerated  Wed Dec 11 22:21:06 JST 2013
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SADB.M_DEPT
	 * @mbggenerated  Wed Dec 11 22:21:06 JST 2013
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SADB.M_DEPT
	 * @mbggenerated  Wed Dec 11 22:21:06 JST 2013
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SADB.M_DEPT
	 * @mbggenerated  Wed Dec 11 22:21:06 JST 2013
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SADB.M_DEPT
	 * @mbggenerated  Wed Dec 11 22:21:06 JST 2013
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SADB.M_DEPT
	 * @mbggenerated  Wed Dec 11 22:21:06 JST 2013
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SADB.M_DEPT
	 * @mbggenerated  Wed Dec 11 22:21:06 JST 2013
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SADB.M_DEPT
	 * @mbggenerated  Wed Dec 11 22:21:06 JST 2013
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SADB.M_DEPT
	 * @mbggenerated  Wed Dec 11 22:21:06 JST 2013
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SADB.M_DEPT
	 * @mbggenerated  Wed Dec 11 22:21:06 JST 2013
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table SADB.M_DEPT
	 * @mbggenerated  Wed Dec 11 22:21:06 JST 2013
	 */
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andDeptIdIsNull() {
			addCriterion("DEPT_ID is null");
			return (Criteria) this;
		}

		public Criteria andDeptIdIsNotNull() {
			addCriterion("DEPT_ID is not null");
			return (Criteria) this;
		}

		public Criteria andDeptIdEqualTo(String value) {
			addCriterion("DEPT_ID =", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdNotEqualTo(String value) {
			addCriterion("DEPT_ID <>", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdGreaterThan(String value) {
			addCriterion("DEPT_ID >", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
			addCriterion("DEPT_ID >=", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdLessThan(String value) {
			addCriterion("DEPT_ID <", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdLessThanOrEqualTo(String value) {
			addCriterion("DEPT_ID <=", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdLike(String value) {
			addCriterion("DEPT_ID like", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdNotLike(String value) {
			addCriterion("DEPT_ID not like", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdIn(List<String> values) {
			addCriterion("DEPT_ID in", values, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdNotIn(List<String> values) {
			addCriterion("DEPT_ID not in", values, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdBetween(String value1, String value2) {
			addCriterion("DEPT_ID between", value1, value2, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdNotBetween(String value1, String value2) {
			addCriterion("DEPT_ID not between", value1, value2, "deptId");
			return (Criteria) this;
		}

		public Criteria andStartDateIsNull() {
			addCriterion("START_DATE is null");
			return (Criteria) this;
		}

		public Criteria andStartDateIsNotNull() {
			addCriterion("START_DATE is not null");
			return (Criteria) this;
		}

		public Criteria andStartDateEqualTo(String value) {
			addCriterion("START_DATE =", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateNotEqualTo(String value) {
			addCriterion("START_DATE <>", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateGreaterThan(String value) {
			addCriterion("START_DATE >", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateGreaterThanOrEqualTo(String value) {
			addCriterion("START_DATE >=", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateLessThan(String value) {
			addCriterion("START_DATE <", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateLessThanOrEqualTo(String value) {
			addCriterion("START_DATE <=", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateLike(String value) {
			addCriterion("START_DATE like", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateNotLike(String value) {
			addCriterion("START_DATE not like", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateIn(List<String> values) {
			addCriterion("START_DATE in", values, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateNotIn(List<String> values) {
			addCriterion("START_DATE not in", values, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateBetween(String value1, String value2) {
			addCriterion("START_DATE between", value1, value2, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateNotBetween(String value1, String value2) {
			addCriterion("START_DATE not between", value1, value2, "startDate");
			return (Criteria) this;
		}

		public Criteria andDeptNmIsNull() {
			addCriterion("DEPT_NM is null");
			return (Criteria) this;
		}

		public Criteria andDeptNmIsNotNull() {
			addCriterion("DEPT_NM is not null");
			return (Criteria) this;
		}

		public Criteria andDeptNmEqualTo(String value) {
			addCriterion("DEPT_NM =", value, "deptNm");
			return (Criteria) this;
		}

		public Criteria andDeptNmNotEqualTo(String value) {
			addCriterion("DEPT_NM <>", value, "deptNm");
			return (Criteria) this;
		}

		public Criteria andDeptNmGreaterThan(String value) {
			addCriterion("DEPT_NM >", value, "deptNm");
			return (Criteria) this;
		}

		public Criteria andDeptNmGreaterThanOrEqualTo(String value) {
			addCriterion("DEPT_NM >=", value, "deptNm");
			return (Criteria) this;
		}

		public Criteria andDeptNmLessThan(String value) {
			addCriterion("DEPT_NM <", value, "deptNm");
			return (Criteria) this;
		}

		public Criteria andDeptNmLessThanOrEqualTo(String value) {
			addCriterion("DEPT_NM <=", value, "deptNm");
			return (Criteria) this;
		}

		public Criteria andDeptNmLike(String value) {
			addCriterion("DEPT_NM like", value, "deptNm");
			return (Criteria) this;
		}

		public Criteria andDeptNmNotLike(String value) {
			addCriterion("DEPT_NM not like", value, "deptNm");
			return (Criteria) this;
		}

		public Criteria andDeptNmIn(List<String> values) {
			addCriterion("DEPT_NM in", values, "deptNm");
			return (Criteria) this;
		}

		public Criteria andDeptNmNotIn(List<String> values) {
			addCriterion("DEPT_NM not in", values, "deptNm");
			return (Criteria) this;
		}

		public Criteria andDeptNmBetween(String value1, String value2) {
			addCriterion("DEPT_NM between", value1, value2, "deptNm");
			return (Criteria) this;
		}

		public Criteria andDeptNmNotBetween(String value1, String value2) {
			addCriterion("DEPT_NM not between", value1, value2, "deptNm");
			return (Criteria) this;
		}

		public Criteria andPDeptIdIsNull() {
			addCriterion("P_DEPT_ID is null");
			return (Criteria) this;
		}

		public Criteria andPDeptIdIsNotNull() {
			addCriterion("P_DEPT_ID is not null");
			return (Criteria) this;
		}

		public Criteria andPDeptIdEqualTo(String value) {
			addCriterion("P_DEPT_ID =", value, "pDeptId");
			return (Criteria) this;
		}

		public Criteria andPDeptIdNotEqualTo(String value) {
			addCriterion("P_DEPT_ID <>", value, "pDeptId");
			return (Criteria) this;
		}

		public Criteria andPDeptIdGreaterThan(String value) {
			addCriterion("P_DEPT_ID >", value, "pDeptId");
			return (Criteria) this;
		}

		public Criteria andPDeptIdGreaterThanOrEqualTo(String value) {
			addCriterion("P_DEPT_ID >=", value, "pDeptId");
			return (Criteria) this;
		}

		public Criteria andPDeptIdLessThan(String value) {
			addCriterion("P_DEPT_ID <", value, "pDeptId");
			return (Criteria) this;
		}

		public Criteria andPDeptIdLessThanOrEqualTo(String value) {
			addCriterion("P_DEPT_ID <=", value, "pDeptId");
			return (Criteria) this;
		}

		public Criteria andPDeptIdLike(String value) {
			addCriterion("P_DEPT_ID like", value, "pDeptId");
			return (Criteria) this;
		}

		public Criteria andPDeptIdNotLike(String value) {
			addCriterion("P_DEPT_ID not like", value, "pDeptId");
			return (Criteria) this;
		}

		public Criteria andPDeptIdIn(List<String> values) {
			addCriterion("P_DEPT_ID in", values, "pDeptId");
			return (Criteria) this;
		}

		public Criteria andPDeptIdNotIn(List<String> values) {
			addCriterion("P_DEPT_ID not in", values, "pDeptId");
			return (Criteria) this;
		}

		public Criteria andPDeptIdBetween(String value1, String value2) {
			addCriterion("P_DEPT_ID between", value1, value2, "pDeptId");
			return (Criteria) this;
		}

		public Criteria andPDeptIdNotBetween(String value1, String value2) {
			addCriterion("P_DEPT_ID not between", value1, value2, "pDeptId");
			return (Criteria) this;
		}

		public Criteria andEndDateIsNull() {
			addCriterion("END_DATE is null");
			return (Criteria) this;
		}

		public Criteria andEndDateIsNotNull() {
			addCriterion("END_DATE is not null");
			return (Criteria) this;
		}

		public Criteria andEndDateEqualTo(String value) {
			addCriterion("END_DATE =", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateNotEqualTo(String value) {
			addCriterion("END_DATE <>", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateGreaterThan(String value) {
			addCriterion("END_DATE >", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateGreaterThanOrEqualTo(String value) {
			addCriterion("END_DATE >=", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateLessThan(String value) {
			addCriterion("END_DATE <", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateLessThanOrEqualTo(String value) {
			addCriterion("END_DATE <=", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateLike(String value) {
			addCriterion("END_DATE like", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateNotLike(String value) {
			addCriterion("END_DATE not like", value, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateIn(List<String> values) {
			addCriterion("END_DATE in", values, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateNotIn(List<String> values) {
			addCriterion("END_DATE not in", values, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateBetween(String value1, String value2) {
			addCriterion("END_DATE between", value1, value2, "endDate");
			return (Criteria) this;
		}

		public Criteria andEndDateNotBetween(String value1, String value2) {
			addCriterion("END_DATE not between", value1, value2, "endDate");
			return (Criteria) this;
		}

		public Criteria andVersionNoIsNull() {
			addCriterion("VERSION_NO is null");
			return (Criteria) this;
		}

		public Criteria andVersionNoIsNotNull() {
			addCriterion("VERSION_NO is not null");
			return (Criteria) this;
		}

		public Criteria andVersionNoEqualTo(Long value) {
			addCriterion("VERSION_NO =", value, "versionNo");
			return (Criteria) this;
		}

		public Criteria andVersionNoNotEqualTo(Long value) {
			addCriterion("VERSION_NO <>", value, "versionNo");
			return (Criteria) this;
		}

		public Criteria andVersionNoGreaterThan(Long value) {
			addCriterion("VERSION_NO >", value, "versionNo");
			return (Criteria) this;
		}

		public Criteria andVersionNoGreaterThanOrEqualTo(Long value) {
			addCriterion("VERSION_NO >=", value, "versionNo");
			return (Criteria) this;
		}

		public Criteria andVersionNoLessThan(Long value) {
			addCriterion("VERSION_NO <", value, "versionNo");
			return (Criteria) this;
		}

		public Criteria andVersionNoLessThanOrEqualTo(Long value) {
			addCriterion("VERSION_NO <=", value, "versionNo");
			return (Criteria) this;
		}

		public Criteria andVersionNoIn(List<Long> values) {
			addCriterion("VERSION_NO in", values, "versionNo");
			return (Criteria) this;
		}

		public Criteria andVersionNoNotIn(List<Long> values) {
			addCriterion("VERSION_NO not in", values, "versionNo");
			return (Criteria) this;
		}

		public Criteria andVersionNoBetween(Long value1, Long value2) {
			addCriterion("VERSION_NO between", value1, value2, "versionNo");
			return (Criteria) this;
		}

		public Criteria andVersionNoNotBetween(Long value1, Long value2) {
			addCriterion("VERSION_NO not between", value1, value2, "versionNo");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table SADB.M_DEPT
	 * @mbggenerated  Wed Dec 11 22:21:06 JST 2013
	 */
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SADB.M_DEPT
     *
     * @mbggenerated do_not_delete_during_merge Wed Dec 11 22:18:38 JST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}