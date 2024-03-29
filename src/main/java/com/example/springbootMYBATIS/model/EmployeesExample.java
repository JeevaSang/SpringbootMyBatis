package com.example.springbootMYBATIS.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeesExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employees
	 * @mbg.generated  Fri Jun 07 15:36:42 IST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employees
	 * @mbg.generated  Fri Jun 07 15:36:42 IST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employees
	 * @mbg.generated  Fri Jun 07 15:36:42 IST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employees
	 * @mbg.generated  Fri Jun 07 15:36:42 IST 2019
	 */
	public EmployeesExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employees
	 * @mbg.generated  Fri Jun 07 15:36:42 IST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employees
	 * @mbg.generated  Fri Jun 07 15:36:42 IST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employees
	 * @mbg.generated  Fri Jun 07 15:36:42 IST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employees
	 * @mbg.generated  Fri Jun 07 15:36:42 IST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employees
	 * @mbg.generated  Fri Jun 07 15:36:42 IST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employees
	 * @mbg.generated  Fri Jun 07 15:36:42 IST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employees
	 * @mbg.generated  Fri Jun 07 15:36:42 IST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employees
	 * @mbg.generated  Fri Jun 07 15:36:42 IST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employees
	 * @mbg.generated  Fri Jun 07 15:36:42 IST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employees
	 * @mbg.generated  Fri Jun 07 15:36:42 IST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employees
	 * @mbg.generated  Fri Jun 07 15:36:42 IST 2019
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

		public Criteria andEmployeeIdIsNull() {
			addCriterion("employee_id is null");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdIsNotNull() {
			addCriterion("employee_id is not null");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdEqualTo(Long value) {
			addCriterion("employee_id =", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdNotEqualTo(Long value) {
			addCriterion("employee_id <>", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdGreaterThan(Long value) {
			addCriterion("employee_id >", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdGreaterThanOrEqualTo(Long value) {
			addCriterion("employee_id >=", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdLessThan(Long value) {
			addCriterion("employee_id <", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdLessThanOrEqualTo(Long value) {
			addCriterion("employee_id <=", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdIn(List<Long> values) {
			addCriterion("employee_id in", values, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdNotIn(List<Long> values) {
			addCriterion("employee_id not in", values, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdBetween(Long value1, Long value2) {
			addCriterion("employee_id between", value1, value2, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdNotBetween(Long value1, Long value2) {
			addCriterion("employee_id not between", value1, value2, "employeeId");
			return (Criteria) this;
		}

		public Criteria andFirstNameIsNull() {
			addCriterion("first_name is null");
			return (Criteria) this;
		}

		public Criteria andFirstNameIsNotNull() {
			addCriterion("first_name is not null");
			return (Criteria) this;
		}

		public Criteria andFirstNameEqualTo(String value) {
			addCriterion("first_name =", value, "firstName");
			return (Criteria) this;
		}

		public Criteria andFirstNameNotEqualTo(String value) {
			addCriterion("first_name <>", value, "firstName");
			return (Criteria) this;
		}

		public Criteria andFirstNameGreaterThan(String value) {
			addCriterion("first_name >", value, "firstName");
			return (Criteria) this;
		}

		public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
			addCriterion("first_name >=", value, "firstName");
			return (Criteria) this;
		}

		public Criteria andFirstNameLessThan(String value) {
			addCriterion("first_name <", value, "firstName");
			return (Criteria) this;
		}

		public Criteria andFirstNameLessThanOrEqualTo(String value) {
			addCriterion("first_name <=", value, "firstName");
			return (Criteria) this;
		}

		public Criteria andFirstNameLike(String value) {
			addCriterion("first_name like", value, "firstName");
			return (Criteria) this;
		}

		public Criteria andFirstNameNotLike(String value) {
			addCriterion("first_name not like", value, "firstName");
			return (Criteria) this;
		}

		public Criteria andFirstNameIn(List<String> values) {
			addCriterion("first_name in", values, "firstName");
			return (Criteria) this;
		}

		public Criteria andFirstNameNotIn(List<String> values) {
			addCriterion("first_name not in", values, "firstName");
			return (Criteria) this;
		}

		public Criteria andFirstNameBetween(String value1, String value2) {
			addCriterion("first_name between", value1, value2, "firstName");
			return (Criteria) this;
		}

		public Criteria andFirstNameNotBetween(String value1, String value2) {
			addCriterion("first_name not between", value1, value2, "firstName");
			return (Criteria) this;
		}

		public Criteria andLastNameIsNull() {
			addCriterion("last_name is null");
			return (Criteria) this;
		}

		public Criteria andLastNameIsNotNull() {
			addCriterion("last_name is not null");
			return (Criteria) this;
		}

		public Criteria andLastNameEqualTo(String value) {
			addCriterion("last_name =", value, "lastName");
			return (Criteria) this;
		}

		public Criteria andLastNameNotEqualTo(String value) {
			addCriterion("last_name <>", value, "lastName");
			return (Criteria) this;
		}

		public Criteria andLastNameGreaterThan(String value) {
			addCriterion("last_name >", value, "lastName");
			return (Criteria) this;
		}

		public Criteria andLastNameGreaterThanOrEqualTo(String value) {
			addCriterion("last_name >=", value, "lastName");
			return (Criteria) this;
		}

		public Criteria andLastNameLessThan(String value) {
			addCriterion("last_name <", value, "lastName");
			return (Criteria) this;
		}

		public Criteria andLastNameLessThanOrEqualTo(String value) {
			addCriterion("last_name <=", value, "lastName");
			return (Criteria) this;
		}

		public Criteria andLastNameLike(String value) {
			addCriterion("last_name like", value, "lastName");
			return (Criteria) this;
		}

		public Criteria andLastNameNotLike(String value) {
			addCriterion("last_name not like", value, "lastName");
			return (Criteria) this;
		}

		public Criteria andLastNameIn(List<String> values) {
			addCriterion("last_name in", values, "lastName");
			return (Criteria) this;
		}

		public Criteria andLastNameNotIn(List<String> values) {
			addCriterion("last_name not in", values, "lastName");
			return (Criteria) this;
		}

		public Criteria andLastNameBetween(String value1, String value2) {
			addCriterion("last_name between", value1, value2, "lastName");
			return (Criteria) this;
		}

		public Criteria andLastNameNotBetween(String value1, String value2) {
			addCriterion("last_name not between", value1, value2, "lastName");
			return (Criteria) this;
		}

		public Criteria andVersionIsNull() {
			addCriterion("version is null");
			return (Criteria) this;
		}

		public Criteria andVersionIsNotNull() {
			addCriterion("version is not null");
			return (Criteria) this;
		}

		public Criteria andVersionEqualTo(Integer value) {
			addCriterion("version =", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotEqualTo(Integer value) {
			addCriterion("version <>", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionGreaterThan(Integer value) {
			addCriterion("version >", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
			addCriterion("version >=", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionLessThan(Integer value) {
			addCriterion("version <", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionLessThanOrEqualTo(Integer value) {
			addCriterion("version <=", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionIn(List<Integer> values) {
			addCriterion("version in", values, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotIn(List<Integer> values) {
			addCriterion("version not in", values, "version");
			return (Criteria) this;
		}

		public Criteria andVersionBetween(Integer value1, Integer value2) {
			addCriterion("version between", value1, value2, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotBetween(Integer value1, Integer value2) {
			addCriterion("version not between", value1, value2, "version");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employees
	 * @mbg.generated  Fri Jun 07 15:36:42 IST 2019
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table employees
     *
     * @mbg.generated do_not_delete_during_merge Fri Jun 07 15:36:14 IST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}