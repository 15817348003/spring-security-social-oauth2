package com.fortytwoq.mvc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestCaseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table test_case
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table test_case
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table test_case
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_case
     *
     * @mbggenerated
     */
    public TestCaseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_case
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_case
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_case
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_case
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_case
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_case
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_case
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_case
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_case
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_case
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table test_case
     *
     * @mbggenerated
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdIsNull() {
            addCriterion("test_case_id is null");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdIsNotNull() {
            addCriterion("test_case_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdEqualTo(String value) {
            addCriterion("test_case_id =", value, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdNotEqualTo(String value) {
            addCriterion("test_case_id <>", value, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdGreaterThan(String value) {
            addCriterion("test_case_id >", value, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("test_case_id >=", value, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdLessThan(String value) {
            addCriterion("test_case_id <", value, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdLessThanOrEqualTo(String value) {
            addCriterion("test_case_id <=", value, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdLike(String value) {
            addCriterion("test_case_id like", value, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdNotLike(String value) {
            addCriterion("test_case_id not like", value, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdIn(List<String> values) {
            addCriterion("test_case_id in", values, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdNotIn(List<String> values) {
            addCriterion("test_case_id not in", values, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdBetween(String value1, String value2) {
            addCriterion("test_case_id between", value1, value2, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdNotBetween(String value1, String value2) {
            addCriterion("test_case_id not between", value1, value2, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestModuleIdIsNull() {
            addCriterion("test_module_id is null");
            return (Criteria) this;
        }

        public Criteria andTestModuleIdIsNotNull() {
            addCriterion("test_module_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestModuleIdEqualTo(Integer value) {
            addCriterion("test_module_id =", value, "testModuleId");
            return (Criteria) this;
        }

        public Criteria andTestModuleIdNotEqualTo(Integer value) {
            addCriterion("test_module_id <>", value, "testModuleId");
            return (Criteria) this;
        }

        public Criteria andTestModuleIdGreaterThan(Integer value) {
            addCriterion("test_module_id >", value, "testModuleId");
            return (Criteria) this;
        }

        public Criteria andTestModuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_module_id >=", value, "testModuleId");
            return (Criteria) this;
        }

        public Criteria andTestModuleIdLessThan(Integer value) {
            addCriterion("test_module_id <", value, "testModuleId");
            return (Criteria) this;
        }

        public Criteria andTestModuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_module_id <=", value, "testModuleId");
            return (Criteria) this;
        }

        public Criteria andTestModuleIdIn(List<Integer> values) {
            addCriterion("test_module_id in", values, "testModuleId");
            return (Criteria) this;
        }

        public Criteria andTestModuleIdNotIn(List<Integer> values) {
            addCriterion("test_module_id not in", values, "testModuleId");
            return (Criteria) this;
        }

        public Criteria andTestModuleIdBetween(Integer value1, Integer value2) {
            addCriterion("test_module_id between", value1, value2, "testModuleId");
            return (Criteria) this;
        }

        public Criteria andTestModuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_module_id not between", value1, value2, "testModuleId");
            return (Criteria) this;
        }

        public Criteria andCaseNameIsNull() {
            addCriterion("case_name is null");
            return (Criteria) this;
        }

        public Criteria andCaseNameIsNotNull() {
            addCriterion("case_name is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNameEqualTo(String value) {
            addCriterion("case_name =", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotEqualTo(String value) {
            addCriterion("case_name <>", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameGreaterThan(String value) {
            addCriterion("case_name >", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("case_name >=", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameLessThan(String value) {
            addCriterion("case_name <", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameLessThanOrEqualTo(String value) {
            addCriterion("case_name <=", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameLike(String value) {
            addCriterion("case_name like", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotLike(String value) {
            addCriterion("case_name not like", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameIn(List<String> values) {
            addCriterion("case_name in", values, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotIn(List<String> values) {
            addCriterion("case_name not in", values, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameBetween(String value1, String value2) {
            addCriterion("case_name between", value1, value2, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotBetween(String value1, String value2) {
            addCriterion("case_name not between", value1, value2, "caseName");
            return (Criteria) this;
        }

        public Criteria andMenuModuleValueIsNull() {
            addCriterion("menu_module_value is null");
            return (Criteria) this;
        }

        public Criteria andMenuModuleValueIsNotNull() {
            addCriterion("menu_module_value is not null");
            return (Criteria) this;
        }

        public Criteria andMenuModuleValueEqualTo(String value) {
            addCriterion("menu_module_value =", value, "menuModuleValue");
            return (Criteria) this;
        }

        public Criteria andMenuModuleValueNotEqualTo(String value) {
            addCriterion("menu_module_value <>", value, "menuModuleValue");
            return (Criteria) this;
        }

        public Criteria andMenuModuleValueGreaterThan(String value) {
            addCriterion("menu_module_value >", value, "menuModuleValue");
            return (Criteria) this;
        }

        public Criteria andMenuModuleValueGreaterThanOrEqualTo(String value) {
            addCriterion("menu_module_value >=", value, "menuModuleValue");
            return (Criteria) this;
        }

        public Criteria andMenuModuleValueLessThan(String value) {
            addCriterion("menu_module_value <", value, "menuModuleValue");
            return (Criteria) this;
        }

        public Criteria andMenuModuleValueLessThanOrEqualTo(String value) {
            addCriterion("menu_module_value <=", value, "menuModuleValue");
            return (Criteria) this;
        }

        public Criteria andMenuModuleValueLike(String value) {
            addCriterion("menu_module_value like", value, "menuModuleValue");
            return (Criteria) this;
        }

        public Criteria andMenuModuleValueNotLike(String value) {
            addCriterion("menu_module_value not like", value, "menuModuleValue");
            return (Criteria) this;
        }

        public Criteria andMenuModuleValueIn(List<String> values) {
            addCriterion("menu_module_value in", values, "menuModuleValue");
            return (Criteria) this;
        }

        public Criteria andMenuModuleValueNotIn(List<String> values) {
            addCriterion("menu_module_value not in", values, "menuModuleValue");
            return (Criteria) this;
        }

        public Criteria andMenuModuleValueBetween(String value1, String value2) {
            addCriterion("menu_module_value between", value1, value2, "menuModuleValue");
            return (Criteria) this;
        }

        public Criteria andMenuModuleValueNotBetween(String value1, String value2) {
            addCriterion("menu_module_value not between", value1, value2, "menuModuleValue");
            return (Criteria) this;
        }

        public Criteria andMenuFunctionValueIsNull() {
            addCriterion("menu_function_value is null");
            return (Criteria) this;
        }

        public Criteria andMenuFunctionValueIsNotNull() {
            addCriterion("menu_function_value is not null");
            return (Criteria) this;
        }

        public Criteria andMenuFunctionValueEqualTo(String value) {
            addCriterion("menu_function_value =", value, "menuFunctionValue");
            return (Criteria) this;
        }

        public Criteria andMenuFunctionValueNotEqualTo(String value) {
            addCriterion("menu_function_value <>", value, "menuFunctionValue");
            return (Criteria) this;
        }

        public Criteria andMenuFunctionValueGreaterThan(String value) {
            addCriterion("menu_function_value >", value, "menuFunctionValue");
            return (Criteria) this;
        }

        public Criteria andMenuFunctionValueGreaterThanOrEqualTo(String value) {
            addCriterion("menu_function_value >=", value, "menuFunctionValue");
            return (Criteria) this;
        }

        public Criteria andMenuFunctionValueLessThan(String value) {
            addCriterion("menu_function_value <", value, "menuFunctionValue");
            return (Criteria) this;
        }

        public Criteria andMenuFunctionValueLessThanOrEqualTo(String value) {
            addCriterion("menu_function_value <=", value, "menuFunctionValue");
            return (Criteria) this;
        }

        public Criteria andMenuFunctionValueLike(String value) {
            addCriterion("menu_function_value like", value, "menuFunctionValue");
            return (Criteria) this;
        }

        public Criteria andMenuFunctionValueNotLike(String value) {
            addCriterion("menu_function_value not like", value, "menuFunctionValue");
            return (Criteria) this;
        }

        public Criteria andMenuFunctionValueIn(List<String> values) {
            addCriterion("menu_function_value in", values, "menuFunctionValue");
            return (Criteria) this;
        }

        public Criteria andMenuFunctionValueNotIn(List<String> values) {
            addCriterion("menu_function_value not in", values, "menuFunctionValue");
            return (Criteria) this;
        }

        public Criteria andMenuFunctionValueBetween(String value1, String value2) {
            addCriterion("menu_function_value between", value1, value2, "menuFunctionValue");
            return (Criteria) this;
        }

        public Criteria andMenuFunctionValueNotBetween(String value1, String value2) {
            addCriterion("menu_function_value not between", value1, value2, "menuFunctionValue");
            return (Criteria) this;
        }

        public Criteria andClassModuleNameIsNull() {
            addCriterion("class_module_name is null");
            return (Criteria) this;
        }

        public Criteria andClassModuleNameIsNotNull() {
            addCriterion("class_module_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassModuleNameEqualTo(String value) {
            addCriterion("class_module_name =", value, "classModuleName");
            return (Criteria) this;
        }

        public Criteria andClassModuleNameNotEqualTo(String value) {
            addCriterion("class_module_name <>", value, "classModuleName");
            return (Criteria) this;
        }

        public Criteria andClassModuleNameGreaterThan(String value) {
            addCriterion("class_module_name >", value, "classModuleName");
            return (Criteria) this;
        }

        public Criteria andClassModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_module_name >=", value, "classModuleName");
            return (Criteria) this;
        }

        public Criteria andClassModuleNameLessThan(String value) {
            addCriterion("class_module_name <", value, "classModuleName");
            return (Criteria) this;
        }

        public Criteria andClassModuleNameLessThanOrEqualTo(String value) {
            addCriterion("class_module_name <=", value, "classModuleName");
            return (Criteria) this;
        }

        public Criteria andClassModuleNameLike(String value) {
            addCriterion("class_module_name like", value, "classModuleName");
            return (Criteria) this;
        }

        public Criteria andClassModuleNameNotLike(String value) {
            addCriterion("class_module_name not like", value, "classModuleName");
            return (Criteria) this;
        }

        public Criteria andClassModuleNameIn(List<String> values) {
            addCriterion("class_module_name in", values, "classModuleName");
            return (Criteria) this;
        }

        public Criteria andClassModuleNameNotIn(List<String> values) {
            addCriterion("class_module_name not in", values, "classModuleName");
            return (Criteria) this;
        }

        public Criteria andClassModuleNameBetween(String value1, String value2) {
            addCriterion("class_module_name between", value1, value2, "classModuleName");
            return (Criteria) this;
        }

        public Criteria andClassModuleNameNotBetween(String value1, String value2) {
            addCriterion("class_module_name not between", value1, value2, "classModuleName");
            return (Criteria) this;
        }

        public Criteria andClassFunctionNameIsNull() {
            addCriterion("class_function_name is null");
            return (Criteria) this;
        }

        public Criteria andClassFunctionNameIsNotNull() {
            addCriterion("class_function_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassFunctionNameEqualTo(String value) {
            addCriterion("class_function_name =", value, "classFunctionName");
            return (Criteria) this;
        }

        public Criteria andClassFunctionNameNotEqualTo(String value) {
            addCriterion("class_function_name <>", value, "classFunctionName");
            return (Criteria) this;
        }

        public Criteria andClassFunctionNameGreaterThan(String value) {
            addCriterion("class_function_name >", value, "classFunctionName");
            return (Criteria) this;
        }

        public Criteria andClassFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_function_name >=", value, "classFunctionName");
            return (Criteria) this;
        }

        public Criteria andClassFunctionNameLessThan(String value) {
            addCriterion("class_function_name <", value, "classFunctionName");
            return (Criteria) this;
        }

        public Criteria andClassFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("class_function_name <=", value, "classFunctionName");
            return (Criteria) this;
        }

        public Criteria andClassFunctionNameLike(String value) {
            addCriterion("class_function_name like", value, "classFunctionName");
            return (Criteria) this;
        }

        public Criteria andClassFunctionNameNotLike(String value) {
            addCriterion("class_function_name not like", value, "classFunctionName");
            return (Criteria) this;
        }

        public Criteria andClassFunctionNameIn(List<String> values) {
            addCriterion("class_function_name in", values, "classFunctionName");
            return (Criteria) this;
        }

        public Criteria andClassFunctionNameNotIn(List<String> values) {
            addCriterion("class_function_name not in", values, "classFunctionName");
            return (Criteria) this;
        }

        public Criteria andClassFunctionNameBetween(String value1, String value2) {
            addCriterion("class_function_name between", value1, value2, "classFunctionName");
            return (Criteria) this;
        }

        public Criteria andClassFunctionNameNotBetween(String value1, String value2) {
            addCriterion("class_function_name not between", value1, value2, "classFunctionName");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(Integer value) {
            addCriterion("enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(Integer value) {
            addCriterion("enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(Integer value) {
            addCriterion("enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(Integer value) {
            addCriterion("enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(Integer value) {
            addCriterion("enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<Integer> values) {
            addCriterion("enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<Integer> values) {
            addCriterion("enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(Integer value1, Integer value2) {
            addCriterion("enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("enable not between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table test_case
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table test_case
     *
     * @mbggenerated
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
}