package server.database.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FuserExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("fId is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fId is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fId =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fId <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fId >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fId >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fId <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fId <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fId in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fId not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fId between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fId not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFloginnameIsNull() {
            addCriterion("floginName is null");
            return (Criteria) this;
        }

        public Criteria andFloginnameIsNotNull() {
            addCriterion("floginName is not null");
            return (Criteria) this;
        }

        public Criteria andFloginnameEqualTo(String value) {
            addCriterion("floginName =", value, "floginname");
            return (Criteria) this;
        }

        public Criteria andFloginnameNotEqualTo(String value) {
            addCriterion("floginName <>", value, "floginname");
            return (Criteria) this;
        }

        public Criteria andFloginnameGreaterThan(String value) {
            addCriterion("floginName >", value, "floginname");
            return (Criteria) this;
        }

        public Criteria andFloginnameGreaterThanOrEqualTo(String value) {
            addCriterion("floginName >=", value, "floginname");
            return (Criteria) this;
        }

        public Criteria andFloginnameLessThan(String value) {
            addCriterion("floginName <", value, "floginname");
            return (Criteria) this;
        }

        public Criteria andFloginnameLessThanOrEqualTo(String value) {
            addCriterion("floginName <=", value, "floginname");
            return (Criteria) this;
        }

        public Criteria andFloginnameLike(String value) {
            addCriterion("floginName like", value, "floginname");
            return (Criteria) this;
        }

        public Criteria andFloginnameNotLike(String value) {
            addCriterion("floginName not like", value, "floginname");
            return (Criteria) this;
        }

        public Criteria andFloginnameIn(List<String> values) {
            addCriterion("floginName in", values, "floginname");
            return (Criteria) this;
        }

        public Criteria andFloginnameNotIn(List<String> values) {
            addCriterion("floginName not in", values, "floginname");
            return (Criteria) this;
        }

        public Criteria andFloginnameBetween(String value1, String value2) {
            addCriterion("floginName between", value1, value2, "floginname");
            return (Criteria) this;
        }

        public Criteria andFloginnameNotBetween(String value1, String value2) {
            addCriterion("floginName not between", value1, value2, "floginname");
            return (Criteria) this;
        }

        public Criteria andFloginpasswordIsNull() {
            addCriterion("fLoginPassword is null");
            return (Criteria) this;
        }

        public Criteria andFloginpasswordIsNotNull() {
            addCriterion("fLoginPassword is not null");
            return (Criteria) this;
        }

        public Criteria andFloginpasswordEqualTo(String value) {
            addCriterion("fLoginPassword =", value, "floginpassword");
            return (Criteria) this;
        }

        public Criteria andFloginpasswordNotEqualTo(String value) {
            addCriterion("fLoginPassword <>", value, "floginpassword");
            return (Criteria) this;
        }

        public Criteria andFloginpasswordGreaterThan(String value) {
            addCriterion("fLoginPassword >", value, "floginpassword");
            return (Criteria) this;
        }

        public Criteria andFloginpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("fLoginPassword >=", value, "floginpassword");
            return (Criteria) this;
        }

        public Criteria andFloginpasswordLessThan(String value) {
            addCriterion("fLoginPassword <", value, "floginpassword");
            return (Criteria) this;
        }

        public Criteria andFloginpasswordLessThanOrEqualTo(String value) {
            addCriterion("fLoginPassword <=", value, "floginpassword");
            return (Criteria) this;
        }

        public Criteria andFloginpasswordLike(String value) {
            addCriterion("fLoginPassword like", value, "floginpassword");
            return (Criteria) this;
        }

        public Criteria andFloginpasswordNotLike(String value) {
            addCriterion("fLoginPassword not like", value, "floginpassword");
            return (Criteria) this;
        }

        public Criteria andFloginpasswordIn(List<String> values) {
            addCriterion("fLoginPassword in", values, "floginpassword");
            return (Criteria) this;
        }

        public Criteria andFloginpasswordNotIn(List<String> values) {
            addCriterion("fLoginPassword not in", values, "floginpassword");
            return (Criteria) this;
        }

        public Criteria andFloginpasswordBetween(String value1, String value2) {
            addCriterion("fLoginPassword between", value1, value2, "floginpassword");
            return (Criteria) this;
        }

        public Criteria andFloginpasswordNotBetween(String value1, String value2) {
            addCriterion("fLoginPassword not between", value1, value2, "floginpassword");
            return (Criteria) this;
        }

        public Criteria andFtradepasswordIsNull() {
            addCriterion("fTradePassword is null");
            return (Criteria) this;
        }

        public Criteria andFtradepasswordIsNotNull() {
            addCriterion("fTradePassword is not null");
            return (Criteria) this;
        }

        public Criteria andFtradepasswordEqualTo(String value) {
            addCriterion("fTradePassword =", value, "ftradepassword");
            return (Criteria) this;
        }

        public Criteria andFtradepasswordNotEqualTo(String value) {
            addCriterion("fTradePassword <>", value, "ftradepassword");
            return (Criteria) this;
        }

        public Criteria andFtradepasswordGreaterThan(String value) {
            addCriterion("fTradePassword >", value, "ftradepassword");
            return (Criteria) this;
        }

        public Criteria andFtradepasswordGreaterThanOrEqualTo(String value) {
            addCriterion("fTradePassword >=", value, "ftradepassword");
            return (Criteria) this;
        }

        public Criteria andFtradepasswordLessThan(String value) {
            addCriterion("fTradePassword <", value, "ftradepassword");
            return (Criteria) this;
        }

        public Criteria andFtradepasswordLessThanOrEqualTo(String value) {
            addCriterion("fTradePassword <=", value, "ftradepassword");
            return (Criteria) this;
        }

        public Criteria andFtradepasswordLike(String value) {
            addCriterion("fTradePassword like", value, "ftradepassword");
            return (Criteria) this;
        }

        public Criteria andFtradepasswordNotLike(String value) {
            addCriterion("fTradePassword not like", value, "ftradepassword");
            return (Criteria) this;
        }

        public Criteria andFtradepasswordIn(List<String> values) {
            addCriterion("fTradePassword in", values, "ftradepassword");
            return (Criteria) this;
        }

        public Criteria andFtradepasswordNotIn(List<String> values) {
            addCriterion("fTradePassword not in", values, "ftradepassword");
            return (Criteria) this;
        }

        public Criteria andFtradepasswordBetween(String value1, String value2) {
            addCriterion("fTradePassword between", value1, value2, "ftradepassword");
            return (Criteria) this;
        }

        public Criteria andFtradepasswordNotBetween(String value1, String value2) {
            addCriterion("fTradePassword not between", value1, value2, "ftradepassword");
            return (Criteria) this;
        }

        public Criteria andFnicknameIsNull() {
            addCriterion("fNickName is null");
            return (Criteria) this;
        }

        public Criteria andFnicknameIsNotNull() {
            addCriterion("fNickName is not null");
            return (Criteria) this;
        }

        public Criteria andFnicknameEqualTo(String value) {
            addCriterion("fNickName =", value, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameNotEqualTo(String value) {
            addCriterion("fNickName <>", value, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameGreaterThan(String value) {
            addCriterion("fNickName >", value, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameGreaterThanOrEqualTo(String value) {
            addCriterion("fNickName >=", value, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameLessThan(String value) {
            addCriterion("fNickName <", value, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameLessThanOrEqualTo(String value) {
            addCriterion("fNickName <=", value, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameLike(String value) {
            addCriterion("fNickName like", value, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameNotLike(String value) {
            addCriterion("fNickName not like", value, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameIn(List<String> values) {
            addCriterion("fNickName in", values, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameNotIn(List<String> values) {
            addCriterion("fNickName not in", values, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameBetween(String value1, String value2) {
            addCriterion("fNickName between", value1, value2, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFnicknameNotBetween(String value1, String value2) {
            addCriterion("fNickName not between", value1, value2, "fnickname");
            return (Criteria) this;
        }

        public Criteria andFrealnameIsNull() {
            addCriterion("fRealName is null");
            return (Criteria) this;
        }

        public Criteria andFrealnameIsNotNull() {
            addCriterion("fRealName is not null");
            return (Criteria) this;
        }

        public Criteria andFrealnameEqualTo(String value) {
            addCriterion("fRealName =", value, "frealname");
            return (Criteria) this;
        }

        public Criteria andFrealnameNotEqualTo(String value) {
            addCriterion("fRealName <>", value, "frealname");
            return (Criteria) this;
        }

        public Criteria andFrealnameGreaterThan(String value) {
            addCriterion("fRealName >", value, "frealname");
            return (Criteria) this;
        }

        public Criteria andFrealnameGreaterThanOrEqualTo(String value) {
            addCriterion("fRealName >=", value, "frealname");
            return (Criteria) this;
        }

        public Criteria andFrealnameLessThan(String value) {
            addCriterion("fRealName <", value, "frealname");
            return (Criteria) this;
        }

        public Criteria andFrealnameLessThanOrEqualTo(String value) {
            addCriterion("fRealName <=", value, "frealname");
            return (Criteria) this;
        }

        public Criteria andFrealnameLike(String value) {
            addCriterion("fRealName like", value, "frealname");
            return (Criteria) this;
        }

        public Criteria andFrealnameNotLike(String value) {
            addCriterion("fRealName not like", value, "frealname");
            return (Criteria) this;
        }

        public Criteria andFrealnameIn(List<String> values) {
            addCriterion("fRealName in", values, "frealname");
            return (Criteria) this;
        }

        public Criteria andFrealnameNotIn(List<String> values) {
            addCriterion("fRealName not in", values, "frealname");
            return (Criteria) this;
        }

        public Criteria andFrealnameBetween(String value1, String value2) {
            addCriterion("fRealName between", value1, value2, "frealname");
            return (Criteria) this;
        }

        public Criteria andFrealnameNotBetween(String value1, String value2) {
            addCriterion("fRealName not between", value1, value2, "frealname");
            return (Criteria) this;
        }

        public Criteria andFtelephoneIsNull() {
            addCriterion("fTelephone is null");
            return (Criteria) this;
        }

        public Criteria andFtelephoneIsNotNull() {
            addCriterion("fTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andFtelephoneEqualTo(String value) {
            addCriterion("fTelephone =", value, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneNotEqualTo(String value) {
            addCriterion("fTelephone <>", value, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneGreaterThan(String value) {
            addCriterion("fTelephone >", value, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("fTelephone >=", value, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneLessThan(String value) {
            addCriterion("fTelephone <", value, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneLessThanOrEqualTo(String value) {
            addCriterion("fTelephone <=", value, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneLike(String value) {
            addCriterion("fTelephone like", value, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneNotLike(String value) {
            addCriterion("fTelephone not like", value, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneIn(List<String> values) {
            addCriterion("fTelephone in", values, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneNotIn(List<String> values) {
            addCriterion("fTelephone not in", values, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneBetween(String value1, String value2) {
            addCriterion("fTelephone between", value1, value2, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneNotBetween(String value1, String value2) {
            addCriterion("fTelephone not between", value1, value2, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFemailIsNull() {
            addCriterion("fEmail is null");
            return (Criteria) this;
        }

        public Criteria andFemailIsNotNull() {
            addCriterion("fEmail is not null");
            return (Criteria) this;
        }

        public Criteria andFemailEqualTo(String value) {
            addCriterion("fEmail =", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailNotEqualTo(String value) {
            addCriterion("fEmail <>", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailGreaterThan(String value) {
            addCriterion("fEmail >", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailGreaterThanOrEqualTo(String value) {
            addCriterion("fEmail >=", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailLessThan(String value) {
            addCriterion("fEmail <", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailLessThanOrEqualTo(String value) {
            addCriterion("fEmail <=", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailLike(String value) {
            addCriterion("fEmail like", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailNotLike(String value) {
            addCriterion("fEmail not like", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailIn(List<String> values) {
            addCriterion("fEmail in", values, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailNotIn(List<String> values) {
            addCriterion("fEmail not in", values, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailBetween(String value1, String value2) {
            addCriterion("fEmail between", value1, value2, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailNotBetween(String value1, String value2) {
            addCriterion("fEmail not between", value1, value2, "femail");
            return (Criteria) this;
        }

        public Criteria andFidentitynoIsNull() {
            addCriterion("fIdentityNo is null");
            return (Criteria) this;
        }

        public Criteria andFidentitynoIsNotNull() {
            addCriterion("fIdentityNo is not null");
            return (Criteria) this;
        }

        public Criteria andFidentitynoEqualTo(String value) {
            addCriterion("fIdentityNo =", value, "fidentityno");
            return (Criteria) this;
        }

        public Criteria andFidentitynoNotEqualTo(String value) {
            addCriterion("fIdentityNo <>", value, "fidentityno");
            return (Criteria) this;
        }

        public Criteria andFidentitynoGreaterThan(String value) {
            addCriterion("fIdentityNo >", value, "fidentityno");
            return (Criteria) this;
        }

        public Criteria andFidentitynoGreaterThanOrEqualTo(String value) {
            addCriterion("fIdentityNo >=", value, "fidentityno");
            return (Criteria) this;
        }

        public Criteria andFidentitynoLessThan(String value) {
            addCriterion("fIdentityNo <", value, "fidentityno");
            return (Criteria) this;
        }

        public Criteria andFidentitynoLessThanOrEqualTo(String value) {
            addCriterion("fIdentityNo <=", value, "fidentityno");
            return (Criteria) this;
        }

        public Criteria andFidentitynoLike(String value) {
            addCriterion("fIdentityNo like", value, "fidentityno");
            return (Criteria) this;
        }

        public Criteria andFidentitynoNotLike(String value) {
            addCriterion("fIdentityNo not like", value, "fidentityno");
            return (Criteria) this;
        }

        public Criteria andFidentitynoIn(List<String> values) {
            addCriterion("fIdentityNo in", values, "fidentityno");
            return (Criteria) this;
        }

        public Criteria andFidentitynoNotIn(List<String> values) {
            addCriterion("fIdentityNo not in", values, "fidentityno");
            return (Criteria) this;
        }

        public Criteria andFidentitynoBetween(String value1, String value2) {
            addCriterion("fIdentityNo between", value1, value2, "fidentityno");
            return (Criteria) this;
        }

        public Criteria andFidentitynoNotBetween(String value1, String value2) {
            addCriterion("fIdentityNo not between", value1, value2, "fidentityno");
            return (Criteria) this;
        }

        public Criteria andFregistertimeIsNull() {
            addCriterion("fRegisterTime is null");
            return (Criteria) this;
        }

        public Criteria andFregistertimeIsNotNull() {
            addCriterion("fRegisterTime is not null");
            return (Criteria) this;
        }

        public Criteria andFregistertimeEqualTo(Date value) {
            addCriterion("fRegisterTime =", value, "fregistertime");
            return (Criteria) this;
        }

        public Criteria andFregistertimeNotEqualTo(Date value) {
            addCriterion("fRegisterTime <>", value, "fregistertime");
            return (Criteria) this;
        }

        public Criteria andFregistertimeGreaterThan(Date value) {
            addCriterion("fRegisterTime >", value, "fregistertime");
            return (Criteria) this;
        }

        public Criteria andFregistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fRegisterTime >=", value, "fregistertime");
            return (Criteria) this;
        }

        public Criteria andFregistertimeLessThan(Date value) {
            addCriterion("fRegisterTime <", value, "fregistertime");
            return (Criteria) this;
        }

        public Criteria andFregistertimeLessThanOrEqualTo(Date value) {
            addCriterion("fRegisterTime <=", value, "fregistertime");
            return (Criteria) this;
        }

        public Criteria andFregistertimeIn(List<Date> values) {
            addCriterion("fRegisterTime in", values, "fregistertime");
            return (Criteria) this;
        }

        public Criteria andFregistertimeNotIn(List<Date> values) {
            addCriterion("fRegisterTime not in", values, "fregistertime");
            return (Criteria) this;
        }

        public Criteria andFregistertimeBetween(Date value1, Date value2) {
            addCriterion("fRegisterTime between", value1, value2, "fregistertime");
            return (Criteria) this;
        }

        public Criteria andFregistertimeNotBetween(Date value1, Date value2) {
            addCriterion("fRegisterTime not between", value1, value2, "fregistertime");
            return (Criteria) this;
        }

        public Criteria andFlastlogintimeIsNull() {
            addCriterion("fLastLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andFlastlogintimeIsNotNull() {
            addCriterion("fLastLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andFlastlogintimeEqualTo(Date value) {
            addCriterion("fLastLoginTime =", value, "flastlogintime");
            return (Criteria) this;
        }

        public Criteria andFlastlogintimeNotEqualTo(Date value) {
            addCriterion("fLastLoginTime <>", value, "flastlogintime");
            return (Criteria) this;
        }

        public Criteria andFlastlogintimeGreaterThan(Date value) {
            addCriterion("fLastLoginTime >", value, "flastlogintime");
            return (Criteria) this;
        }

        public Criteria andFlastlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fLastLoginTime >=", value, "flastlogintime");
            return (Criteria) this;
        }

        public Criteria andFlastlogintimeLessThan(Date value) {
            addCriterion("fLastLoginTime <", value, "flastlogintime");
            return (Criteria) this;
        }

        public Criteria andFlastlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("fLastLoginTime <=", value, "flastlogintime");
            return (Criteria) this;
        }

        public Criteria andFlastlogintimeIn(List<Date> values) {
            addCriterion("fLastLoginTime in", values, "flastlogintime");
            return (Criteria) this;
        }

        public Criteria andFlastlogintimeNotIn(List<Date> values) {
            addCriterion("fLastLoginTime not in", values, "flastlogintime");
            return (Criteria) this;
        }

        public Criteria andFlastlogintimeBetween(Date value1, Date value2) {
            addCriterion("fLastLoginTime between", value1, value2, "flastlogintime");
            return (Criteria) this;
        }

        public Criteria andFlastlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("fLastLoginTime not between", value1, value2, "flastlogintime");
            return (Criteria) this;
        }

        public Criteria andFgoogleauthenticatorIsNull() {
            addCriterion("fGoogleAuthenticator is null");
            return (Criteria) this;
        }

        public Criteria andFgoogleauthenticatorIsNotNull() {
            addCriterion("fGoogleAuthenticator is not null");
            return (Criteria) this;
        }

        public Criteria andFgoogleauthenticatorEqualTo(String value) {
            addCriterion("fGoogleAuthenticator =", value, "fgoogleauthenticator");
            return (Criteria) this;
        }

        public Criteria andFgoogleauthenticatorNotEqualTo(String value) {
            addCriterion("fGoogleAuthenticator <>", value, "fgoogleauthenticator");
            return (Criteria) this;
        }

        public Criteria andFgoogleauthenticatorGreaterThan(String value) {
            addCriterion("fGoogleAuthenticator >", value, "fgoogleauthenticator");
            return (Criteria) this;
        }

        public Criteria andFgoogleauthenticatorGreaterThanOrEqualTo(String value) {
            addCriterion("fGoogleAuthenticator >=", value, "fgoogleauthenticator");
            return (Criteria) this;
        }

        public Criteria andFgoogleauthenticatorLessThan(String value) {
            addCriterion("fGoogleAuthenticator <", value, "fgoogleauthenticator");
            return (Criteria) this;
        }

        public Criteria andFgoogleauthenticatorLessThanOrEqualTo(String value) {
            addCriterion("fGoogleAuthenticator <=", value, "fgoogleauthenticator");
            return (Criteria) this;
        }

        public Criteria andFgoogleauthenticatorLike(String value) {
            addCriterion("fGoogleAuthenticator like", value, "fgoogleauthenticator");
            return (Criteria) this;
        }

        public Criteria andFgoogleauthenticatorNotLike(String value) {
            addCriterion("fGoogleAuthenticator not like", value, "fgoogleauthenticator");
            return (Criteria) this;
        }

        public Criteria andFgoogleauthenticatorIn(List<String> values) {
            addCriterion("fGoogleAuthenticator in", values, "fgoogleauthenticator");
            return (Criteria) this;
        }

        public Criteria andFgoogleauthenticatorNotIn(List<String> values) {
            addCriterion("fGoogleAuthenticator not in", values, "fgoogleauthenticator");
            return (Criteria) this;
        }

        public Criteria andFgoogleauthenticatorBetween(String value1, String value2) {
            addCriterion("fGoogleAuthenticator between", value1, value2, "fgoogleauthenticator");
            return (Criteria) this;
        }

        public Criteria andFgoogleauthenticatorNotBetween(String value1, String value2) {
            addCriterion("fGoogleAuthenticator not between", value1, value2, "fgoogleauthenticator");
            return (Criteria) this;
        }

        public Criteria andFgoogleurlIsNull() {
            addCriterion("fgoogleurl is null");
            return (Criteria) this;
        }

        public Criteria andFgoogleurlIsNotNull() {
            addCriterion("fgoogleurl is not null");
            return (Criteria) this;
        }

        public Criteria andFgoogleurlEqualTo(String value) {
            addCriterion("fgoogleurl =", value, "fgoogleurl");
            return (Criteria) this;
        }

        public Criteria andFgoogleurlNotEqualTo(String value) {
            addCriterion("fgoogleurl <>", value, "fgoogleurl");
            return (Criteria) this;
        }

        public Criteria andFgoogleurlGreaterThan(String value) {
            addCriterion("fgoogleurl >", value, "fgoogleurl");
            return (Criteria) this;
        }

        public Criteria andFgoogleurlGreaterThanOrEqualTo(String value) {
            addCriterion("fgoogleurl >=", value, "fgoogleurl");
            return (Criteria) this;
        }

        public Criteria andFgoogleurlLessThan(String value) {
            addCriterion("fgoogleurl <", value, "fgoogleurl");
            return (Criteria) this;
        }

        public Criteria andFgoogleurlLessThanOrEqualTo(String value) {
            addCriterion("fgoogleurl <=", value, "fgoogleurl");
            return (Criteria) this;
        }

        public Criteria andFgoogleurlLike(String value) {
            addCriterion("fgoogleurl like", value, "fgoogleurl");
            return (Criteria) this;
        }

        public Criteria andFgoogleurlNotLike(String value) {
            addCriterion("fgoogleurl not like", value, "fgoogleurl");
            return (Criteria) this;
        }

        public Criteria andFgoogleurlIn(List<String> values) {
            addCriterion("fgoogleurl in", values, "fgoogleurl");
            return (Criteria) this;
        }

        public Criteria andFgoogleurlNotIn(List<String> values) {
            addCriterion("fgoogleurl not in", values, "fgoogleurl");
            return (Criteria) this;
        }

        public Criteria andFgoogleurlBetween(String value1, String value2) {
            addCriterion("fgoogleurl between", value1, value2, "fgoogleurl");
            return (Criteria) this;
        }

        public Criteria andFgoogleurlNotBetween(String value1, String value2) {
            addCriterion("fgoogleurl not between", value1, value2, "fgoogleurl");
            return (Criteria) this;
        }

        public Criteria andFmobilmessagecodeIsNull() {
            addCriterion("fMobilMessageCode is null");
            return (Criteria) this;
        }

        public Criteria andFmobilmessagecodeIsNotNull() {
            addCriterion("fMobilMessageCode is not null");
            return (Criteria) this;
        }

        public Criteria andFmobilmessagecodeEqualTo(String value) {
            addCriterion("fMobilMessageCode =", value, "fmobilmessagecode");
            return (Criteria) this;
        }

        public Criteria andFmobilmessagecodeNotEqualTo(String value) {
            addCriterion("fMobilMessageCode <>", value, "fmobilmessagecode");
            return (Criteria) this;
        }

        public Criteria andFmobilmessagecodeGreaterThan(String value) {
            addCriterion("fMobilMessageCode >", value, "fmobilmessagecode");
            return (Criteria) this;
        }

        public Criteria andFmobilmessagecodeGreaterThanOrEqualTo(String value) {
            addCriterion("fMobilMessageCode >=", value, "fmobilmessagecode");
            return (Criteria) this;
        }

        public Criteria andFmobilmessagecodeLessThan(String value) {
            addCriterion("fMobilMessageCode <", value, "fmobilmessagecode");
            return (Criteria) this;
        }

        public Criteria andFmobilmessagecodeLessThanOrEqualTo(String value) {
            addCriterion("fMobilMessageCode <=", value, "fmobilmessagecode");
            return (Criteria) this;
        }

        public Criteria andFmobilmessagecodeLike(String value) {
            addCriterion("fMobilMessageCode like", value, "fmobilmessagecode");
            return (Criteria) this;
        }

        public Criteria andFmobilmessagecodeNotLike(String value) {
            addCriterion("fMobilMessageCode not like", value, "fmobilmessagecode");
            return (Criteria) this;
        }

        public Criteria andFmobilmessagecodeIn(List<String> values) {
            addCriterion("fMobilMessageCode in", values, "fmobilmessagecode");
            return (Criteria) this;
        }

        public Criteria andFmobilmessagecodeNotIn(List<String> values) {
            addCriterion("fMobilMessageCode not in", values, "fmobilmessagecode");
            return (Criteria) this;
        }

        public Criteria andFmobilmessagecodeBetween(String value1, String value2) {
            addCriterion("fMobilMessageCode between", value1, value2, "fmobilmessagecode");
            return (Criteria) this;
        }

        public Criteria andFmobilmessagecodeNotBetween(String value1, String value2) {
            addCriterion("fMobilMessageCode not between", value1, value2, "fmobilmessagecode");
            return (Criteria) this;
        }

        public Criteria andFstatusIsNull() {
            addCriterion("fStatus is null");
            return (Criteria) this;
        }

        public Criteria andFstatusIsNotNull() {
            addCriterion("fStatus is not null");
            return (Criteria) this;
        }

        public Criteria andFstatusEqualTo(Integer value) {
            addCriterion("fStatus =", value, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusNotEqualTo(Integer value) {
            addCriterion("fStatus <>", value, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusGreaterThan(Integer value) {
            addCriterion("fStatus >", value, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("fStatus >=", value, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusLessThan(Integer value) {
            addCriterion("fStatus <", value, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusLessThanOrEqualTo(Integer value) {
            addCriterion("fStatus <=", value, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusIn(List<Integer> values) {
            addCriterion("fStatus in", values, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusNotIn(List<Integer> values) {
            addCriterion("fStatus not in", values, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusBetween(Integer value1, Integer value2) {
            addCriterion("fStatus between", value1, value2, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("fStatus not between", value1, value2, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFistelvalidateIsNull() {
            addCriterion("fIsTelValidate is null");
            return (Criteria) this;
        }

        public Criteria andFistelvalidateIsNotNull() {
            addCriterion("fIsTelValidate is not null");
            return (Criteria) this;
        }

        public Criteria andFistelvalidateEqualTo(Boolean value) {
            addCriterion("fIsTelValidate =", value, "fistelvalidate");
            return (Criteria) this;
        }

        public Criteria andFistelvalidateNotEqualTo(Boolean value) {
            addCriterion("fIsTelValidate <>", value, "fistelvalidate");
            return (Criteria) this;
        }

        public Criteria andFistelvalidateGreaterThan(Boolean value) {
            addCriterion("fIsTelValidate >", value, "fistelvalidate");
            return (Criteria) this;
        }

        public Criteria andFistelvalidateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fIsTelValidate >=", value, "fistelvalidate");
            return (Criteria) this;
        }

        public Criteria andFistelvalidateLessThan(Boolean value) {
            addCriterion("fIsTelValidate <", value, "fistelvalidate");
            return (Criteria) this;
        }

        public Criteria andFistelvalidateLessThanOrEqualTo(Boolean value) {
            addCriterion("fIsTelValidate <=", value, "fistelvalidate");
            return (Criteria) this;
        }

        public Criteria andFistelvalidateIn(List<Boolean> values) {
            addCriterion("fIsTelValidate in", values, "fistelvalidate");
            return (Criteria) this;
        }

        public Criteria andFistelvalidateNotIn(List<Boolean> values) {
            addCriterion("fIsTelValidate not in", values, "fistelvalidate");
            return (Criteria) this;
        }

        public Criteria andFistelvalidateBetween(Boolean value1, Boolean value2) {
            addCriterion("fIsTelValidate between", value1, value2, "fistelvalidate");
            return (Criteria) this;
        }

        public Criteria andFistelvalidateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fIsTelValidate not between", value1, value2, "fistelvalidate");
            return (Criteria) this;
        }

        public Criteria andFismailvalidateIsNull() {
            addCriterion("fIsMailValidate is null");
            return (Criteria) this;
        }

        public Criteria andFismailvalidateIsNotNull() {
            addCriterion("fIsMailValidate is not null");
            return (Criteria) this;
        }

        public Criteria andFismailvalidateEqualTo(Boolean value) {
            addCriterion("fIsMailValidate =", value, "fismailvalidate");
            return (Criteria) this;
        }

        public Criteria andFismailvalidateNotEqualTo(Boolean value) {
            addCriterion("fIsMailValidate <>", value, "fismailvalidate");
            return (Criteria) this;
        }

        public Criteria andFismailvalidateGreaterThan(Boolean value) {
            addCriterion("fIsMailValidate >", value, "fismailvalidate");
            return (Criteria) this;
        }

        public Criteria andFismailvalidateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fIsMailValidate >=", value, "fismailvalidate");
            return (Criteria) this;
        }

        public Criteria andFismailvalidateLessThan(Boolean value) {
            addCriterion("fIsMailValidate <", value, "fismailvalidate");
            return (Criteria) this;
        }

        public Criteria andFismailvalidateLessThanOrEqualTo(Boolean value) {
            addCriterion("fIsMailValidate <=", value, "fismailvalidate");
            return (Criteria) this;
        }

        public Criteria andFismailvalidateIn(List<Boolean> values) {
            addCriterion("fIsMailValidate in", values, "fismailvalidate");
            return (Criteria) this;
        }

        public Criteria andFismailvalidateNotIn(List<Boolean> values) {
            addCriterion("fIsMailValidate not in", values, "fismailvalidate");
            return (Criteria) this;
        }

        public Criteria andFismailvalidateBetween(Boolean value1, Boolean value2) {
            addCriterion("fIsMailValidate between", value1, value2, "fismailvalidate");
            return (Criteria) this;
        }

        public Criteria andFismailvalidateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fIsMailValidate not between", value1, value2, "fismailvalidate");
            return (Criteria) this;
        }

        public Criteria andFgooglevalidateIsNull() {
            addCriterion("fGoogleValidate is null");
            return (Criteria) this;
        }

        public Criteria andFgooglevalidateIsNotNull() {
            addCriterion("fGoogleValidate is not null");
            return (Criteria) this;
        }

        public Criteria andFgooglevalidateEqualTo(Boolean value) {
            addCriterion("fGoogleValidate =", value, "fgooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFgooglevalidateNotEqualTo(Boolean value) {
            addCriterion("fGoogleValidate <>", value, "fgooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFgooglevalidateGreaterThan(Boolean value) {
            addCriterion("fGoogleValidate >", value, "fgooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFgooglevalidateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fGoogleValidate >=", value, "fgooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFgooglevalidateLessThan(Boolean value) {
            addCriterion("fGoogleValidate <", value, "fgooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFgooglevalidateLessThanOrEqualTo(Boolean value) {
            addCriterion("fGoogleValidate <=", value, "fgooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFgooglevalidateIn(List<Boolean> values) {
            addCriterion("fGoogleValidate in", values, "fgooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFgooglevalidateNotIn(List<Boolean> values) {
            addCriterion("fGoogleValidate not in", values, "fgooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFgooglevalidateBetween(Boolean value1, Boolean value2) {
            addCriterion("fGoogleValidate between", value1, value2, "fgooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFgooglevalidateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fGoogleValidate not between", value1, value2, "fgooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFopentelvalidateIsNull() {
            addCriterion("fopenTelValidate is null");
            return (Criteria) this;
        }

        public Criteria andFopentelvalidateIsNotNull() {
            addCriterion("fopenTelValidate is not null");
            return (Criteria) this;
        }

        public Criteria andFopentelvalidateEqualTo(Boolean value) {
            addCriterion("fopenTelValidate =", value, "fopentelvalidate");
            return (Criteria) this;
        }

        public Criteria andFopentelvalidateNotEqualTo(Boolean value) {
            addCriterion("fopenTelValidate <>", value, "fopentelvalidate");
            return (Criteria) this;
        }

        public Criteria andFopentelvalidateGreaterThan(Boolean value) {
            addCriterion("fopenTelValidate >", value, "fopentelvalidate");
            return (Criteria) this;
        }

        public Criteria andFopentelvalidateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fopenTelValidate >=", value, "fopentelvalidate");
            return (Criteria) this;
        }

        public Criteria andFopentelvalidateLessThan(Boolean value) {
            addCriterion("fopenTelValidate <", value, "fopentelvalidate");
            return (Criteria) this;
        }

        public Criteria andFopentelvalidateLessThanOrEqualTo(Boolean value) {
            addCriterion("fopenTelValidate <=", value, "fopentelvalidate");
            return (Criteria) this;
        }

        public Criteria andFopentelvalidateIn(List<Boolean> values) {
            addCriterion("fopenTelValidate in", values, "fopentelvalidate");
            return (Criteria) this;
        }

        public Criteria andFopentelvalidateNotIn(List<Boolean> values) {
            addCriterion("fopenTelValidate not in", values, "fopentelvalidate");
            return (Criteria) this;
        }

        public Criteria andFopentelvalidateBetween(Boolean value1, Boolean value2) {
            addCriterion("fopenTelValidate between", value1, value2, "fopentelvalidate");
            return (Criteria) this;
        }

        public Criteria andFopentelvalidateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fopenTelValidate not between", value1, value2, "fopentelvalidate");
            return (Criteria) this;
        }

        public Criteria andFopengooglevalidateIsNull() {
            addCriterion("fopenGoogleValidate is null");
            return (Criteria) this;
        }

        public Criteria andFopengooglevalidateIsNotNull() {
            addCriterion("fopenGoogleValidate is not null");
            return (Criteria) this;
        }

        public Criteria andFopengooglevalidateEqualTo(Boolean value) {
            addCriterion("fopenGoogleValidate =", value, "fopengooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFopengooglevalidateNotEqualTo(Boolean value) {
            addCriterion("fopenGoogleValidate <>", value, "fopengooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFopengooglevalidateGreaterThan(Boolean value) {
            addCriterion("fopenGoogleValidate >", value, "fopengooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFopengooglevalidateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fopenGoogleValidate >=", value, "fopengooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFopengooglevalidateLessThan(Boolean value) {
            addCriterion("fopenGoogleValidate <", value, "fopengooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFopengooglevalidateLessThanOrEqualTo(Boolean value) {
            addCriterion("fopenGoogleValidate <=", value, "fopengooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFopengooglevalidateIn(List<Boolean> values) {
            addCriterion("fopenGoogleValidate in", values, "fopengooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFopengooglevalidateNotIn(List<Boolean> values) {
            addCriterion("fopenGoogleValidate not in", values, "fopengooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFopengooglevalidateBetween(Boolean value1, Boolean value2) {
            addCriterion("fopenGoogleValidate between", value1, value2, "fopengooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFopengooglevalidateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fopenGoogleValidate not between", value1, value2, "fopengooglevalidate");
            return (Criteria) this;
        }

        public Criteria andFopensecondvalidateIsNull() {
            addCriterion("fopenSecondValidate is null");
            return (Criteria) this;
        }

        public Criteria andFopensecondvalidateIsNotNull() {
            addCriterion("fopenSecondValidate is not null");
            return (Criteria) this;
        }

        public Criteria andFopensecondvalidateEqualTo(Boolean value) {
            addCriterion("fopenSecondValidate =", value, "fopensecondvalidate");
            return (Criteria) this;
        }

        public Criteria andFopensecondvalidateNotEqualTo(Boolean value) {
            addCriterion("fopenSecondValidate <>", value, "fopensecondvalidate");
            return (Criteria) this;
        }

        public Criteria andFopensecondvalidateGreaterThan(Boolean value) {
            addCriterion("fopenSecondValidate >", value, "fopensecondvalidate");
            return (Criteria) this;
        }

        public Criteria andFopensecondvalidateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fopenSecondValidate >=", value, "fopensecondvalidate");
            return (Criteria) this;
        }

        public Criteria andFopensecondvalidateLessThan(Boolean value) {
            addCriterion("fopenSecondValidate <", value, "fopensecondvalidate");
            return (Criteria) this;
        }

        public Criteria andFopensecondvalidateLessThanOrEqualTo(Boolean value) {
            addCriterion("fopenSecondValidate <=", value, "fopensecondvalidate");
            return (Criteria) this;
        }

        public Criteria andFopensecondvalidateIn(List<Boolean> values) {
            addCriterion("fopenSecondValidate in", values, "fopensecondvalidate");
            return (Criteria) this;
        }

        public Criteria andFopensecondvalidateNotIn(List<Boolean> values) {
            addCriterion("fopenSecondValidate not in", values, "fopensecondvalidate");
            return (Criteria) this;
        }

        public Criteria andFopensecondvalidateBetween(Boolean value1, Boolean value2) {
            addCriterion("fopenSecondValidate between", value1, value2, "fopensecondvalidate");
            return (Criteria) this;
        }

        public Criteria andFopensecondvalidateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fopenSecondValidate not between", value1, value2, "fopensecondvalidate");
            return (Criteria) this;
        }

        public Criteria andFgooglebindIsNull() {
            addCriterion("fgoogleBind is null");
            return (Criteria) this;
        }

        public Criteria andFgooglebindIsNotNull() {
            addCriterion("fgoogleBind is not null");
            return (Criteria) this;
        }

        public Criteria andFgooglebindEqualTo(Boolean value) {
            addCriterion("fgoogleBind =", value, "fgooglebind");
            return (Criteria) this;
        }

        public Criteria andFgooglebindNotEqualTo(Boolean value) {
            addCriterion("fgoogleBind <>", value, "fgooglebind");
            return (Criteria) this;
        }

        public Criteria andFgooglebindGreaterThan(Boolean value) {
            addCriterion("fgoogleBind >", value, "fgooglebind");
            return (Criteria) this;
        }

        public Criteria andFgooglebindGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fgoogleBind >=", value, "fgooglebind");
            return (Criteria) this;
        }

        public Criteria andFgooglebindLessThan(Boolean value) {
            addCriterion("fgoogleBind <", value, "fgooglebind");
            return (Criteria) this;
        }

        public Criteria andFgooglebindLessThanOrEqualTo(Boolean value) {
            addCriterion("fgoogleBind <=", value, "fgooglebind");
            return (Criteria) this;
        }

        public Criteria andFgooglebindIn(List<Boolean> values) {
            addCriterion("fgoogleBind in", values, "fgooglebind");
            return (Criteria) this;
        }

        public Criteria andFgooglebindNotIn(List<Boolean> values) {
            addCriterion("fgoogleBind not in", values, "fgooglebind");
            return (Criteria) this;
        }

        public Criteria andFgooglebindBetween(Boolean value1, Boolean value2) {
            addCriterion("fgoogleBind between", value1, value2, "fgooglebind");
            return (Criteria) this;
        }

        public Criteria andFgooglebindNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fgoogleBind not between", value1, value2, "fgooglebind");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidateIsNull() {
            addCriterion("fpostRealValidate is null");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidateIsNotNull() {
            addCriterion("fpostRealValidate is not null");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidateEqualTo(Boolean value) {
            addCriterion("fpostRealValidate =", value, "fpostrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidateNotEqualTo(Boolean value) {
            addCriterion("fpostRealValidate <>", value, "fpostrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidateGreaterThan(Boolean value) {
            addCriterion("fpostRealValidate >", value, "fpostrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fpostRealValidate >=", value, "fpostrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidateLessThan(Boolean value) {
            addCriterion("fpostRealValidate <", value, "fpostrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidateLessThanOrEqualTo(Boolean value) {
            addCriterion("fpostRealValidate <=", value, "fpostrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidateIn(List<Boolean> values) {
            addCriterion("fpostRealValidate in", values, "fpostrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidateNotIn(List<Boolean> values) {
            addCriterion("fpostRealValidate not in", values, "fpostrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidateBetween(Boolean value1, Boolean value2) {
            addCriterion("fpostRealValidate between", value1, value2, "fpostrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fpostRealValidate not between", value1, value2, "fpostrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidateIsNull() {
            addCriterion("fhasRealValidate is null");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidateIsNotNull() {
            addCriterion("fhasRealValidate is not null");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidateEqualTo(Boolean value) {
            addCriterion("fhasRealValidate =", value, "fhasrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidateNotEqualTo(Boolean value) {
            addCriterion("fhasRealValidate <>", value, "fhasrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidateGreaterThan(Boolean value) {
            addCriterion("fhasRealValidate >", value, "fhasrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fhasRealValidate >=", value, "fhasrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidateLessThan(Boolean value) {
            addCriterion("fhasRealValidate <", value, "fhasrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidateLessThanOrEqualTo(Boolean value) {
            addCriterion("fhasRealValidate <=", value, "fhasrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidateIn(List<Boolean> values) {
            addCriterion("fhasRealValidate in", values, "fhasrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidateNotIn(List<Boolean> values) {
            addCriterion("fhasRealValidate not in", values, "fhasrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidateBetween(Boolean value1, Boolean value2) {
            addCriterion("fhasRealValidate between", value1, value2, "fhasrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fhasRealValidate not between", value1, value2, "fhasrealvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidatetimeIsNull() {
            addCriterion("fpostRealValidateTime is null");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidatetimeIsNotNull() {
            addCriterion("fpostRealValidateTime is not null");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidatetimeEqualTo(Date value) {
            addCriterion("fpostRealValidateTime =", value, "fpostrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidatetimeNotEqualTo(Date value) {
            addCriterion("fpostRealValidateTime <>", value, "fpostrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidatetimeGreaterThan(Date value) {
            addCriterion("fpostRealValidateTime >", value, "fpostrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fpostRealValidateTime >=", value, "fpostrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidatetimeLessThan(Date value) {
            addCriterion("fpostRealValidateTime <", value, "fpostrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidatetimeLessThanOrEqualTo(Date value) {
            addCriterion("fpostRealValidateTime <=", value, "fpostrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidatetimeIn(List<Date> values) {
            addCriterion("fpostRealValidateTime in", values, "fpostrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidatetimeNotIn(List<Date> values) {
            addCriterion("fpostRealValidateTime not in", values, "fpostrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidatetimeBetween(Date value1, Date value2) {
            addCriterion("fpostRealValidateTime between", value1, value2, "fpostrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostrealvalidatetimeNotBetween(Date value1, Date value2) {
            addCriterion("fpostRealValidateTime not between", value1, value2, "fpostrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidatetimeIsNull() {
            addCriterion("fhasRealValidateTime is null");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidatetimeIsNotNull() {
            addCriterion("fhasRealValidateTime is not null");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidatetimeEqualTo(Date value) {
            addCriterion("fhasRealValidateTime =", value, "fhasrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidatetimeNotEqualTo(Date value) {
            addCriterion("fhasRealValidateTime <>", value, "fhasrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidatetimeGreaterThan(Date value) {
            addCriterion("fhasRealValidateTime >", value, "fhasrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fhasRealValidateTime >=", value, "fhasrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidatetimeLessThan(Date value) {
            addCriterion("fhasRealValidateTime <", value, "fhasrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidatetimeLessThanOrEqualTo(Date value) {
            addCriterion("fhasRealValidateTime <=", value, "fhasrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidatetimeIn(List<Date> values) {
            addCriterion("fhasRealValidateTime in", values, "fhasrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidatetimeNotIn(List<Date> values) {
            addCriterion("fhasRealValidateTime not in", values, "fhasrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidatetimeBetween(Date value1, Date value2) {
            addCriterion("fhasRealValidateTime between", value1, value2, "fhasrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasrealvalidatetimeNotBetween(Date value1, Date value2) {
            addCriterion("fhasRealValidateTime not between", value1, value2, "fhasrealvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFidentitytypeIsNull() {
            addCriterion("fidentityType is null");
            return (Criteria) this;
        }

        public Criteria andFidentitytypeIsNotNull() {
            addCriterion("fidentityType is not null");
            return (Criteria) this;
        }

        public Criteria andFidentitytypeEqualTo(Integer value) {
            addCriterion("fidentityType =", value, "fidentitytype");
            return (Criteria) this;
        }

        public Criteria andFidentitytypeNotEqualTo(Integer value) {
            addCriterion("fidentityType <>", value, "fidentitytype");
            return (Criteria) this;
        }

        public Criteria andFidentitytypeGreaterThan(Integer value) {
            addCriterion("fidentityType >", value, "fidentitytype");
            return (Criteria) this;
        }

        public Criteria andFidentitytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fidentityType >=", value, "fidentitytype");
            return (Criteria) this;
        }

        public Criteria andFidentitytypeLessThan(Integer value) {
            addCriterion("fidentityType <", value, "fidentitytype");
            return (Criteria) this;
        }

        public Criteria andFidentitytypeLessThanOrEqualTo(Integer value) {
            addCriterion("fidentityType <=", value, "fidentitytype");
            return (Criteria) this;
        }

        public Criteria andFidentitytypeIn(List<Integer> values) {
            addCriterion("fidentityType in", values, "fidentitytype");
            return (Criteria) this;
        }

        public Criteria andFidentitytypeNotIn(List<Integer> values) {
            addCriterion("fidentityType not in", values, "fidentitytype");
            return (Criteria) this;
        }

        public Criteria andFidentitytypeBetween(Integer value1, Integer value2) {
            addCriterion("fidentityType between", value1, value2, "fidentitytype");
            return (Criteria) this;
        }

        public Criteria andFidentitytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("fidentityType not between", value1, value2, "fidentitytype");
            return (Criteria) this;
        }

        public Criteria andFistelephonebindIsNull() {
            addCriterion("fisTelephoneBind is null");
            return (Criteria) this;
        }

        public Criteria andFistelephonebindIsNotNull() {
            addCriterion("fisTelephoneBind is not null");
            return (Criteria) this;
        }

        public Criteria andFistelephonebindEqualTo(Boolean value) {
            addCriterion("fisTelephoneBind =", value, "fistelephonebind");
            return (Criteria) this;
        }

        public Criteria andFistelephonebindNotEqualTo(Boolean value) {
            addCriterion("fisTelephoneBind <>", value, "fistelephonebind");
            return (Criteria) this;
        }

        public Criteria andFistelephonebindGreaterThan(Boolean value) {
            addCriterion("fisTelephoneBind >", value, "fistelephonebind");
            return (Criteria) this;
        }

        public Criteria andFistelephonebindGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fisTelephoneBind >=", value, "fistelephonebind");
            return (Criteria) this;
        }

        public Criteria andFistelephonebindLessThan(Boolean value) {
            addCriterion("fisTelephoneBind <", value, "fistelephonebind");
            return (Criteria) this;
        }

        public Criteria andFistelephonebindLessThanOrEqualTo(Boolean value) {
            addCriterion("fisTelephoneBind <=", value, "fistelephonebind");
            return (Criteria) this;
        }

        public Criteria andFistelephonebindIn(List<Boolean> values) {
            addCriterion("fisTelephoneBind in", values, "fistelephonebind");
            return (Criteria) this;
        }

        public Criteria andFistelephonebindNotIn(List<Boolean> values) {
            addCriterion("fisTelephoneBind not in", values, "fistelephonebind");
            return (Criteria) this;
        }

        public Criteria andFistelephonebindBetween(Boolean value1, Boolean value2) {
            addCriterion("fisTelephoneBind between", value1, value2, "fistelephonebind");
            return (Criteria) this;
        }

        public Criteria andFistelephonebindNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fisTelephoneBind not between", value1, value2, "fistelephonebind");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeIsNull() {
            addCriterion("flastUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeIsNotNull() {
            addCriterion("flastUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeEqualTo(Date value) {
            addCriterion("flastUpdateTime =", value, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeNotEqualTo(Date value) {
            addCriterion("flastUpdateTime <>", value, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeGreaterThan(Date value) {
            addCriterion("flastUpdateTime >", value, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("flastUpdateTime >=", value, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeLessThan(Date value) {
            addCriterion("flastUpdateTime <", value, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("flastUpdateTime <=", value, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeIn(List<Date> values) {
            addCriterion("flastUpdateTime in", values, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeNotIn(List<Date> values) {
            addCriterion("flastUpdateTime not in", values, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeBetween(Date value1, Date value2) {
            addCriterion("flastUpdateTime between", value1, value2, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("flastUpdateTime not between", value1, value2, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFareacodeIsNull() {
            addCriterion("fareaCode is null");
            return (Criteria) this;
        }

        public Criteria andFareacodeIsNotNull() {
            addCriterion("fareaCode is not null");
            return (Criteria) this;
        }

        public Criteria andFareacodeEqualTo(String value) {
            addCriterion("fareaCode =", value, "fareacode");
            return (Criteria) this;
        }

        public Criteria andFareacodeNotEqualTo(String value) {
            addCriterion("fareaCode <>", value, "fareacode");
            return (Criteria) this;
        }

        public Criteria andFareacodeGreaterThan(String value) {
            addCriterion("fareaCode >", value, "fareacode");
            return (Criteria) this;
        }

        public Criteria andFareacodeGreaterThanOrEqualTo(String value) {
            addCriterion("fareaCode >=", value, "fareacode");
            return (Criteria) this;
        }

        public Criteria andFareacodeLessThan(String value) {
            addCriterion("fareaCode <", value, "fareacode");
            return (Criteria) this;
        }

        public Criteria andFareacodeLessThanOrEqualTo(String value) {
            addCriterion("fareaCode <=", value, "fareacode");
            return (Criteria) this;
        }

        public Criteria andFareacodeLike(String value) {
            addCriterion("fareaCode like", value, "fareacode");
            return (Criteria) this;
        }

        public Criteria andFareacodeNotLike(String value) {
            addCriterion("fareaCode not like", value, "fareacode");
            return (Criteria) this;
        }

        public Criteria andFareacodeIn(List<String> values) {
            addCriterion("fareaCode in", values, "fareacode");
            return (Criteria) this;
        }

        public Criteria andFareacodeNotIn(List<String> values) {
            addCriterion("fareaCode not in", values, "fareacode");
            return (Criteria) this;
        }

        public Criteria andFareacodeBetween(String value1, String value2) {
            addCriterion("fareaCode between", value1, value2, "fareacode");
            return (Criteria) this;
        }

        public Criteria andFareacodeNotBetween(String value1, String value2) {
            addCriterion("fareaCode not between", value1, value2, "fareacode");
            return (Criteria) this;
        }

        public Criteria andFscoreidIsNull() {
            addCriterion("fscoreid is null");
            return (Criteria) this;
        }

        public Criteria andFscoreidIsNotNull() {
            addCriterion("fscoreid is not null");
            return (Criteria) this;
        }

        public Criteria andFscoreidEqualTo(Integer value) {
            addCriterion("fscoreid =", value, "fscoreid");
            return (Criteria) this;
        }

        public Criteria andFscoreidNotEqualTo(Integer value) {
            addCriterion("fscoreid <>", value, "fscoreid");
            return (Criteria) this;
        }

        public Criteria andFscoreidGreaterThan(Integer value) {
            addCriterion("fscoreid >", value, "fscoreid");
            return (Criteria) this;
        }

        public Criteria andFscoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fscoreid >=", value, "fscoreid");
            return (Criteria) this;
        }

        public Criteria andFscoreidLessThan(Integer value) {
            addCriterion("fscoreid <", value, "fscoreid");
            return (Criteria) this;
        }

        public Criteria andFscoreidLessThanOrEqualTo(Integer value) {
            addCriterion("fscoreid <=", value, "fscoreid");
            return (Criteria) this;
        }

        public Criteria andFscoreidIn(List<Integer> values) {
            addCriterion("fscoreid in", values, "fscoreid");
            return (Criteria) this;
        }

        public Criteria andFscoreidNotIn(List<Integer> values) {
            addCriterion("fscoreid not in", values, "fscoreid");
            return (Criteria) this;
        }

        public Criteria andFscoreidBetween(Integer value1, Integer value2) {
            addCriterion("fscoreid between", value1, value2, "fscoreid");
            return (Criteria) this;
        }

        public Criteria andFscoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("fscoreid not between", value1, value2, "fscoreid");
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

        public Criteria andFidentitypathIsNull() {
            addCriterion("fIdentityPath is null");
            return (Criteria) this;
        }

        public Criteria andFidentitypathIsNotNull() {
            addCriterion("fIdentityPath is not null");
            return (Criteria) this;
        }

        public Criteria andFidentitypathEqualTo(String value) {
            addCriterion("fIdentityPath =", value, "fidentitypath");
            return (Criteria) this;
        }

        public Criteria andFidentitypathNotEqualTo(String value) {
            addCriterion("fIdentityPath <>", value, "fidentitypath");
            return (Criteria) this;
        }

        public Criteria andFidentitypathGreaterThan(String value) {
            addCriterion("fIdentityPath >", value, "fidentitypath");
            return (Criteria) this;
        }

        public Criteria andFidentitypathGreaterThanOrEqualTo(String value) {
            addCriterion("fIdentityPath >=", value, "fidentitypath");
            return (Criteria) this;
        }

        public Criteria andFidentitypathLessThan(String value) {
            addCriterion("fIdentityPath <", value, "fidentitypath");
            return (Criteria) this;
        }

        public Criteria andFidentitypathLessThanOrEqualTo(String value) {
            addCriterion("fIdentityPath <=", value, "fidentitypath");
            return (Criteria) this;
        }

        public Criteria andFidentitypathLike(String value) {
            addCriterion("fIdentityPath like", value, "fidentitypath");
            return (Criteria) this;
        }

        public Criteria andFidentitypathNotLike(String value) {
            addCriterion("fIdentityPath not like", value, "fidentitypath");
            return (Criteria) this;
        }

        public Criteria andFidentitypathIn(List<String> values) {
            addCriterion("fIdentityPath in", values, "fidentitypath");
            return (Criteria) this;
        }

        public Criteria andFidentitypathNotIn(List<String> values) {
            addCriterion("fIdentityPath not in", values, "fidentitypath");
            return (Criteria) this;
        }

        public Criteria andFidentitypathBetween(String value1, String value2) {
            addCriterion("fIdentityPath between", value1, value2, "fidentitypath");
            return (Criteria) this;
        }

        public Criteria andFidentitypathNotBetween(String value1, String value2) {
            addCriterion("fIdentityPath not between", value1, value2, "fidentitypath");
            return (Criteria) this;
        }

        public Criteria andFapiIsNull() {
            addCriterion("fapi is null");
            return (Criteria) this;
        }

        public Criteria andFapiIsNotNull() {
            addCriterion("fapi is not null");
            return (Criteria) this;
        }

        public Criteria andFapiEqualTo(Integer value) {
            addCriterion("fapi =", value, "fapi");
            return (Criteria) this;
        }

        public Criteria andFapiNotEqualTo(Integer value) {
            addCriterion("fapi <>", value, "fapi");
            return (Criteria) this;
        }

        public Criteria andFapiGreaterThan(Integer value) {
            addCriterion("fapi >", value, "fapi");
            return (Criteria) this;
        }

        public Criteria andFapiGreaterThanOrEqualTo(Integer value) {
            addCriterion("fapi >=", value, "fapi");
            return (Criteria) this;
        }

        public Criteria andFapiLessThan(Integer value) {
            addCriterion("fapi <", value, "fapi");
            return (Criteria) this;
        }

        public Criteria andFapiLessThanOrEqualTo(Integer value) {
            addCriterion("fapi <=", value, "fapi");
            return (Criteria) this;
        }

        public Criteria andFapiIn(List<Integer> values) {
            addCriterion("fapi in", values, "fapi");
            return (Criteria) this;
        }

        public Criteria andFapiNotIn(List<Integer> values) {
            addCriterion("fapi not in", values, "fapi");
            return (Criteria) this;
        }

        public Criteria andFapiBetween(Integer value1, Integer value2) {
            addCriterion("fapi between", value1, value2, "fapi");
            return (Criteria) this;
        }

        public Criteria andFapiNotBetween(Integer value1, Integer value2) {
            addCriterion("fapi not between", value1, value2, "fapi");
            return (Criteria) this;
        }

        public Criteria andFidentitypath2IsNull() {
            addCriterion("fIdentityPath2 is null");
            return (Criteria) this;
        }

        public Criteria andFidentitypath2IsNotNull() {
            addCriterion("fIdentityPath2 is not null");
            return (Criteria) this;
        }

        public Criteria andFidentitypath2EqualTo(String value) {
            addCriterion("fIdentityPath2 =", value, "fidentitypath2");
            return (Criteria) this;
        }

        public Criteria andFidentitypath2NotEqualTo(String value) {
            addCriterion("fIdentityPath2 <>", value, "fidentitypath2");
            return (Criteria) this;
        }

        public Criteria andFidentitypath2GreaterThan(String value) {
            addCriterion("fIdentityPath2 >", value, "fidentitypath2");
            return (Criteria) this;
        }

        public Criteria andFidentitypath2GreaterThanOrEqualTo(String value) {
            addCriterion("fIdentityPath2 >=", value, "fidentitypath2");
            return (Criteria) this;
        }

        public Criteria andFidentitypath2LessThan(String value) {
            addCriterion("fIdentityPath2 <", value, "fidentitypath2");
            return (Criteria) this;
        }

        public Criteria andFidentitypath2LessThanOrEqualTo(String value) {
            addCriterion("fIdentityPath2 <=", value, "fidentitypath2");
            return (Criteria) this;
        }

        public Criteria andFidentitypath2Like(String value) {
            addCriterion("fIdentityPath2 like", value, "fidentitypath2");
            return (Criteria) this;
        }

        public Criteria andFidentitypath2NotLike(String value) {
            addCriterion("fIdentityPath2 not like", value, "fidentitypath2");
            return (Criteria) this;
        }

        public Criteria andFidentitypath2In(List<String> values) {
            addCriterion("fIdentityPath2 in", values, "fidentitypath2");
            return (Criteria) this;
        }

        public Criteria andFidentitypath2NotIn(List<String> values) {
            addCriterion("fIdentityPath2 not in", values, "fidentitypath2");
            return (Criteria) this;
        }

        public Criteria andFidentitypath2Between(String value1, String value2) {
            addCriterion("fIdentityPath2 between", value1, value2, "fidentitypath2");
            return (Criteria) this;
        }

        public Criteria andFidentitypath2NotBetween(String value1, String value2) {
            addCriterion("fIdentityPath2 not between", value1, value2, "fidentitypath2");
            return (Criteria) this;
        }

        public Criteria andFinvalidateintrocountIsNull() {
            addCriterion("fInvalidateIntroCount is null");
            return (Criteria) this;
        }

        public Criteria andFinvalidateintrocountIsNotNull() {
            addCriterion("fInvalidateIntroCount is not null");
            return (Criteria) this;
        }

        public Criteria andFinvalidateintrocountEqualTo(Integer value) {
            addCriterion("fInvalidateIntroCount =", value, "finvalidateintrocount");
            return (Criteria) this;
        }

        public Criteria andFinvalidateintrocountNotEqualTo(Integer value) {
            addCriterion("fInvalidateIntroCount <>", value, "finvalidateintrocount");
            return (Criteria) this;
        }

        public Criteria andFinvalidateintrocountGreaterThan(Integer value) {
            addCriterion("fInvalidateIntroCount >", value, "finvalidateintrocount");
            return (Criteria) this;
        }

        public Criteria andFinvalidateintrocountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fInvalidateIntroCount >=", value, "finvalidateintrocount");
            return (Criteria) this;
        }

        public Criteria andFinvalidateintrocountLessThan(Integer value) {
            addCriterion("fInvalidateIntroCount <", value, "finvalidateintrocount");
            return (Criteria) this;
        }

        public Criteria andFinvalidateintrocountLessThanOrEqualTo(Integer value) {
            addCriterion("fInvalidateIntroCount <=", value, "finvalidateintrocount");
            return (Criteria) this;
        }

        public Criteria andFinvalidateintrocountIn(List<Integer> values) {
            addCriterion("fInvalidateIntroCount in", values, "finvalidateintrocount");
            return (Criteria) this;
        }

        public Criteria andFinvalidateintrocountNotIn(List<Integer> values) {
            addCriterion("fInvalidateIntroCount not in", values, "finvalidateintrocount");
            return (Criteria) this;
        }

        public Criteria andFinvalidateintrocountBetween(Integer value1, Integer value2) {
            addCriterion("fInvalidateIntroCount between", value1, value2, "finvalidateintrocount");
            return (Criteria) this;
        }

        public Criteria andFinvalidateintrocountNotBetween(Integer value1, Integer value2) {
            addCriterion("fInvalidateIntroCount not between", value1, value2, "finvalidateintrocount");
            return (Criteria) this;
        }

        public Criteria andFlastupdatezhongdoutimeIsNull() {
            addCriterion("flastUpdateZhongdouTime is null");
            return (Criteria) this;
        }

        public Criteria andFlastupdatezhongdoutimeIsNotNull() {
            addCriterion("flastUpdateZhongdouTime is not null");
            return (Criteria) this;
        }

        public Criteria andFlastupdatezhongdoutimeEqualTo(Date value) {
            addCriterion("flastUpdateZhongdouTime =", value, "flastupdatezhongdoutime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatezhongdoutimeNotEqualTo(Date value) {
            addCriterion("flastUpdateZhongdouTime <>", value, "flastupdatezhongdoutime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatezhongdoutimeGreaterThan(Date value) {
            addCriterion("flastUpdateZhongdouTime >", value, "flastupdatezhongdoutime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatezhongdoutimeGreaterThanOrEqualTo(Date value) {
            addCriterion("flastUpdateZhongdouTime >=", value, "flastupdatezhongdoutime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatezhongdoutimeLessThan(Date value) {
            addCriterion("flastUpdateZhongdouTime <", value, "flastupdatezhongdoutime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatezhongdoutimeLessThanOrEqualTo(Date value) {
            addCriterion("flastUpdateZhongdouTime <=", value, "flastupdatezhongdoutime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatezhongdoutimeIn(List<Date> values) {
            addCriterion("flastUpdateZhongdouTime in", values, "flastupdatezhongdoutime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatezhongdoutimeNotIn(List<Date> values) {
            addCriterion("flastUpdateZhongdouTime not in", values, "flastupdatezhongdoutime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatezhongdoutimeBetween(Date value1, Date value2) {
            addCriterion("flastUpdateZhongdouTime between", value1, value2, "flastupdatezhongdoutime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatezhongdoutimeNotBetween(Date value1, Date value2) {
            addCriterion("flastUpdateZhongdouTime not between", value1, value2, "flastupdatezhongdoutime");
            return (Criteria) this;
        }

        public Criteria andFisstartzhongdouIsNull() {
            addCriterion("fIsStartZhongDou is null");
            return (Criteria) this;
        }

        public Criteria andFisstartzhongdouIsNotNull() {
            addCriterion("fIsStartZhongDou is not null");
            return (Criteria) this;
        }

        public Criteria andFisstartzhongdouEqualTo(Boolean value) {
            addCriterion("fIsStartZhongDou =", value, "fisstartzhongdou");
            return (Criteria) this;
        }

        public Criteria andFisstartzhongdouNotEqualTo(Boolean value) {
            addCriterion("fIsStartZhongDou <>", value, "fisstartzhongdou");
            return (Criteria) this;
        }

        public Criteria andFisstartzhongdouGreaterThan(Boolean value) {
            addCriterion("fIsStartZhongDou >", value, "fisstartzhongdou");
            return (Criteria) this;
        }

        public Criteria andFisstartzhongdouGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fIsStartZhongDou >=", value, "fisstartzhongdou");
            return (Criteria) this;
        }

        public Criteria andFisstartzhongdouLessThan(Boolean value) {
            addCriterion("fIsStartZhongDou <", value, "fisstartzhongdou");
            return (Criteria) this;
        }

        public Criteria andFisstartzhongdouLessThanOrEqualTo(Boolean value) {
            addCriterion("fIsStartZhongDou <=", value, "fisstartzhongdou");
            return (Criteria) this;
        }

        public Criteria andFisstartzhongdouIn(List<Boolean> values) {
            addCriterion("fIsStartZhongDou in", values, "fisstartzhongdou");
            return (Criteria) this;
        }

        public Criteria andFisstartzhongdouNotIn(List<Boolean> values) {
            addCriterion("fIsStartZhongDou not in", values, "fisstartzhongdou");
            return (Criteria) this;
        }

        public Criteria andFisstartzhongdouBetween(Boolean value1, Boolean value2) {
            addCriterion("fIsStartZhongDou between", value1, value2, "fisstartzhongdou");
            return (Criteria) this;
        }

        public Criteria andFisstartzhongdouNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fIsStartZhongDou not between", value1, value2, "fisstartzhongdou");
            return (Criteria) this;
        }

        public Criteria andQqloginIsNull() {
            addCriterion("qqlogin is null");
            return (Criteria) this;
        }

        public Criteria andQqloginIsNotNull() {
            addCriterion("qqlogin is not null");
            return (Criteria) this;
        }

        public Criteria andQqloginEqualTo(String value) {
            addCriterion("qqlogin =", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginNotEqualTo(String value) {
            addCriterion("qqlogin <>", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginGreaterThan(String value) {
            addCriterion("qqlogin >", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginGreaterThanOrEqualTo(String value) {
            addCriterion("qqlogin >=", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginLessThan(String value) {
            addCriterion("qqlogin <", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginLessThanOrEqualTo(String value) {
            addCriterion("qqlogin <=", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginLike(String value) {
            addCriterion("qqlogin like", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginNotLike(String value) {
            addCriterion("qqlogin not like", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginIn(List<String> values) {
            addCriterion("qqlogin in", values, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginNotIn(List<String> values) {
            addCriterion("qqlogin not in", values, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginBetween(String value1, String value2) {
            addCriterion("qqlogin between", value1, value2, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginNotBetween(String value1, String value2) {
            addCriterion("qqlogin not between", value1, value2, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andFaddressIsNull() {
            addCriterion("faddress is null");
            return (Criteria) this;
        }

        public Criteria andFaddressIsNotNull() {
            addCriterion("faddress is not null");
            return (Criteria) this;
        }

        public Criteria andFaddressEqualTo(String value) {
            addCriterion("faddress =", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotEqualTo(String value) {
            addCriterion("faddress <>", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressGreaterThan(String value) {
            addCriterion("faddress >", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressGreaterThanOrEqualTo(String value) {
            addCriterion("faddress >=", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLessThan(String value) {
            addCriterion("faddress <", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLessThanOrEqualTo(String value) {
            addCriterion("faddress <=", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLike(String value) {
            addCriterion("faddress like", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotLike(String value) {
            addCriterion("faddress not like", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressIn(List<String> values) {
            addCriterion("faddress in", values, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotIn(List<String> values) {
            addCriterion("faddress not in", values, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressBetween(String value1, String value2) {
            addCriterion("faddress between", value1, value2, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotBetween(String value1, String value2) {
            addCriterion("faddress not between", value1, value2, "faddress");
            return (Criteria) this;
        }

        public Criteria andFregtypeIsNull() {
            addCriterion("fregType is null");
            return (Criteria) this;
        }

        public Criteria andFregtypeIsNotNull() {
            addCriterion("fregType is not null");
            return (Criteria) this;
        }

        public Criteria andFregtypeEqualTo(Integer value) {
            addCriterion("fregType =", value, "fregtype");
            return (Criteria) this;
        }

        public Criteria andFregtypeNotEqualTo(Integer value) {
            addCriterion("fregType <>", value, "fregtype");
            return (Criteria) this;
        }

        public Criteria andFregtypeGreaterThan(Integer value) {
            addCriterion("fregType >", value, "fregtype");
            return (Criteria) this;
        }

        public Criteria andFregtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fregType >=", value, "fregtype");
            return (Criteria) this;
        }

        public Criteria andFregtypeLessThan(Integer value) {
            addCriterion("fregType <", value, "fregtype");
            return (Criteria) this;
        }

        public Criteria andFregtypeLessThanOrEqualTo(Integer value) {
            addCriterion("fregType <=", value, "fregtype");
            return (Criteria) this;
        }

        public Criteria andFregtypeIn(List<Integer> values) {
            addCriterion("fregType in", values, "fregtype");
            return (Criteria) this;
        }

        public Criteria andFregtypeNotIn(List<Integer> values) {
            addCriterion("fregType not in", values, "fregtype");
            return (Criteria) this;
        }

        public Criteria andFregtypeBetween(Integer value1, Integer value2) {
            addCriterion("fregType between", value1, value2, "fregtype");
            return (Criteria) this;
        }

        public Criteria andFregtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("fregType not between", value1, value2, "fregtype");
            return (Criteria) this;
        }

        public Criteria andFgradeIsNull() {
            addCriterion("fgrade is null");
            return (Criteria) this;
        }

        public Criteria andFgradeIsNotNull() {
            addCriterion("fgrade is not null");
            return (Criteria) this;
        }

        public Criteria andFgradeEqualTo(Integer value) {
            addCriterion("fgrade =", value, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeNotEqualTo(Integer value) {
            addCriterion("fgrade <>", value, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeGreaterThan(Integer value) {
            addCriterion("fgrade >", value, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fgrade >=", value, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeLessThan(Integer value) {
            addCriterion("fgrade <", value, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeLessThanOrEqualTo(Integer value) {
            addCriterion("fgrade <=", value, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeIn(List<Integer> values) {
            addCriterion("fgrade in", values, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeNotIn(List<Integer> values) {
            addCriterion("fgrade not in", values, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeBetween(Integer value1, Integer value2) {
            addCriterion("fgrade between", value1, value2, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeNotBetween(Integer value1, Integer value2) {
            addCriterion("fgrade not between", value1, value2, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFusernoIsNull() {
            addCriterion("fuserno is null");
            return (Criteria) this;
        }

        public Criteria andFusernoIsNotNull() {
            addCriterion("fuserno is not null");
            return (Criteria) this;
        }

        public Criteria andFusernoEqualTo(String value) {
            addCriterion("fuserno =", value, "fuserno");
            return (Criteria) this;
        }

        public Criteria andFusernoNotEqualTo(String value) {
            addCriterion("fuserno <>", value, "fuserno");
            return (Criteria) this;
        }

        public Criteria andFusernoGreaterThan(String value) {
            addCriterion("fuserno >", value, "fuserno");
            return (Criteria) this;
        }

        public Criteria andFusernoGreaterThanOrEqualTo(String value) {
            addCriterion("fuserno >=", value, "fuserno");
            return (Criteria) this;
        }

        public Criteria andFusernoLessThan(String value) {
            addCriterion("fuserno <", value, "fuserno");
            return (Criteria) this;
        }

        public Criteria andFusernoLessThanOrEqualTo(String value) {
            addCriterion("fuserno <=", value, "fuserno");
            return (Criteria) this;
        }

        public Criteria andFusernoLike(String value) {
            addCriterion("fuserno like", value, "fuserno");
            return (Criteria) this;
        }

        public Criteria andFusernoNotLike(String value) {
            addCriterion("fuserno not like", value, "fuserno");
            return (Criteria) this;
        }

        public Criteria andFusernoIn(List<String> values) {
            addCriterion("fuserno in", values, "fuserno");
            return (Criteria) this;
        }

        public Criteria andFusernoNotIn(List<String> values) {
            addCriterion("fuserno not in", values, "fuserno");
            return (Criteria) this;
        }

        public Criteria andFusernoBetween(String value1, String value2) {
            addCriterion("fuserno between", value1, value2, "fuserno");
            return (Criteria) this;
        }

        public Criteria andFusernoNotBetween(String value1, String value2) {
            addCriterion("fuserno not between", value1, value2, "fuserno");
            return (Criteria) this;
        }

        public Criteria andFbalancecnyIsNull() {
            addCriterion("fbalancecny is null");
            return (Criteria) this;
        }

        public Criteria andFbalancecnyIsNotNull() {
            addCriterion("fbalancecny is not null");
            return (Criteria) this;
        }

        public Criteria andFbalancecnyEqualTo(BigDecimal value) {
            addCriterion("fbalancecny =", value, "fbalancecny");
            return (Criteria) this;
        }

        public Criteria andFbalancecnyNotEqualTo(BigDecimal value) {
            addCriterion("fbalancecny <>", value, "fbalancecny");
            return (Criteria) this;
        }

        public Criteria andFbalancecnyGreaterThan(BigDecimal value) {
            addCriterion("fbalancecny >", value, "fbalancecny");
            return (Criteria) this;
        }

        public Criteria andFbalancecnyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fbalancecny >=", value, "fbalancecny");
            return (Criteria) this;
        }

        public Criteria andFbalancecnyLessThan(BigDecimal value) {
            addCriterion("fbalancecny <", value, "fbalancecny");
            return (Criteria) this;
        }

        public Criteria andFbalancecnyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fbalancecny <=", value, "fbalancecny");
            return (Criteria) this;
        }

        public Criteria andFbalancecnyIn(List<BigDecimal> values) {
            addCriterion("fbalancecny in", values, "fbalancecny");
            return (Criteria) this;
        }

        public Criteria andFbalancecnyNotIn(List<BigDecimal> values) {
            addCriterion("fbalancecny not in", values, "fbalancecny");
            return (Criteria) this;
        }

        public Criteria andFbalancecnyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fbalancecny between", value1, value2, "fbalancecny");
            return (Criteria) this;
        }

        public Criteria andFbalancecnyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fbalancecny not between", value1, value2, "fbalancecny");
            return (Criteria) this;
        }

        public Criteria andFbalancetmcIsNull() {
            addCriterion("fbalancetmc is null");
            return (Criteria) this;
        }

        public Criteria andFbalancetmcIsNotNull() {
            addCriterion("fbalancetmc is not null");
            return (Criteria) this;
        }

        public Criteria andFbalancetmcEqualTo(BigDecimal value) {
            addCriterion("fbalancetmc =", value, "fbalancetmc");
            return (Criteria) this;
        }

        public Criteria andFbalancetmcNotEqualTo(BigDecimal value) {
            addCriterion("fbalancetmc <>", value, "fbalancetmc");
            return (Criteria) this;
        }

        public Criteria andFbalancetmcGreaterThan(BigDecimal value) {
            addCriterion("fbalancetmc >", value, "fbalancetmc");
            return (Criteria) this;
        }

        public Criteria andFbalancetmcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fbalancetmc >=", value, "fbalancetmc");
            return (Criteria) this;
        }

        public Criteria andFbalancetmcLessThan(BigDecimal value) {
            addCriterion("fbalancetmc <", value, "fbalancetmc");
            return (Criteria) this;
        }

        public Criteria andFbalancetmcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fbalancetmc <=", value, "fbalancetmc");
            return (Criteria) this;
        }

        public Criteria andFbalancetmcIn(List<BigDecimal> values) {
            addCriterion("fbalancetmc in", values, "fbalancetmc");
            return (Criteria) this;
        }

        public Criteria andFbalancetmcNotIn(List<BigDecimal> values) {
            addCriterion("fbalancetmc not in", values, "fbalancetmc");
            return (Criteria) this;
        }

        public Criteria andFbalancetmcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fbalancetmc between", value1, value2, "fbalancetmc");
            return (Criteria) this;
        }

        public Criteria andFbalancetmcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fbalancetmc not between", value1, value2, "fbalancetmc");
            return (Criteria) this;
        }

        public Criteria andFuserintrolnoIsNull() {
            addCriterion("fuserIntrolNo is null");
            return (Criteria) this;
        }

        public Criteria andFuserintrolnoIsNotNull() {
            addCriterion("fuserIntrolNo is not null");
            return (Criteria) this;
        }

        public Criteria andFuserintrolnoEqualTo(String value) {
            addCriterion("fuserIntrolNo =", value, "fuserintrolno");
            return (Criteria) this;
        }

        public Criteria andFuserintrolnoNotEqualTo(String value) {
            addCriterion("fuserIntrolNo <>", value, "fuserintrolno");
            return (Criteria) this;
        }

        public Criteria andFuserintrolnoGreaterThan(String value) {
            addCriterion("fuserIntrolNo >", value, "fuserintrolno");
            return (Criteria) this;
        }

        public Criteria andFuserintrolnoGreaterThanOrEqualTo(String value) {
            addCriterion("fuserIntrolNo >=", value, "fuserintrolno");
            return (Criteria) this;
        }

        public Criteria andFuserintrolnoLessThan(String value) {
            addCriterion("fuserIntrolNo <", value, "fuserintrolno");
            return (Criteria) this;
        }

        public Criteria andFuserintrolnoLessThanOrEqualTo(String value) {
            addCriterion("fuserIntrolNo <=", value, "fuserintrolno");
            return (Criteria) this;
        }

        public Criteria andFuserintrolnoLike(String value) {
            addCriterion("fuserIntrolNo like", value, "fuserintrolno");
            return (Criteria) this;
        }

        public Criteria andFuserintrolnoNotLike(String value) {
            addCriterion("fuserIntrolNo not like", value, "fuserintrolno");
            return (Criteria) this;
        }

        public Criteria andFuserintrolnoIn(List<String> values) {
            addCriterion("fuserIntrolNo in", values, "fuserintrolno");
            return (Criteria) this;
        }

        public Criteria andFuserintrolnoNotIn(List<String> values) {
            addCriterion("fuserIntrolNo not in", values, "fuserintrolno");
            return (Criteria) this;
        }

        public Criteria andFuserintrolnoBetween(String value1, String value2) {
            addCriterion("fuserIntrolNo between", value1, value2, "fuserintrolno");
            return (Criteria) this;
        }

        public Criteria andFuserintrolnoNotBetween(String value1, String value2) {
            addCriterion("fuserIntrolNo not between", value1, value2, "fuserintrolno");
            return (Criteria) this;
        }

        public Criteria andFisvalidIsNull() {
            addCriterion("fisValid is null");
            return (Criteria) this;
        }

        public Criteria andFisvalidIsNotNull() {
            addCriterion("fisValid is not null");
            return (Criteria) this;
        }

        public Criteria andFisvalidEqualTo(Byte value) {
            addCriterion("fisValid =", value, "fisvalid");
            return (Criteria) this;
        }

        public Criteria andFisvalidNotEqualTo(Byte value) {
            addCriterion("fisValid <>", value, "fisvalid");
            return (Criteria) this;
        }

        public Criteria andFisvalidGreaterThan(Byte value) {
            addCriterion("fisValid >", value, "fisvalid");
            return (Criteria) this;
        }

        public Criteria andFisvalidGreaterThanOrEqualTo(Byte value) {
            addCriterion("fisValid >=", value, "fisvalid");
            return (Criteria) this;
        }

        public Criteria andFisvalidLessThan(Byte value) {
            addCriterion("fisValid <", value, "fisvalid");
            return (Criteria) this;
        }

        public Criteria andFisvalidLessThanOrEqualTo(Byte value) {
            addCriterion("fisValid <=", value, "fisvalid");
            return (Criteria) this;
        }

        public Criteria andFisvalidIn(List<Byte> values) {
            addCriterion("fisValid in", values, "fisvalid");
            return (Criteria) this;
        }

        public Criteria andFisvalidNotIn(List<Byte> values) {
            addCriterion("fisValid not in", values, "fisvalid");
            return (Criteria) this;
        }

        public Criteria andFisvalidBetween(Byte value1, Byte value2) {
            addCriterion("fisValid between", value1, value2, "fisvalid");
            return (Criteria) this;
        }

        public Criteria andFisvalidNotBetween(Byte value1, Byte value2) {
            addCriterion("fisValid not between", value1, value2, "fisvalid");
            return (Criteria) this;
        }

        public Criteria andFistigerIsNull() {
            addCriterion("fistiger is null");
            return (Criteria) this;
        }

        public Criteria andFistigerIsNotNull() {
            addCriterion("fistiger is not null");
            return (Criteria) this;
        }

        public Criteria andFistigerEqualTo(Byte value) {
            addCriterion("fistiger =", value, "fistiger");
            return (Criteria) this;
        }

        public Criteria andFistigerNotEqualTo(Byte value) {
            addCriterion("fistiger <>", value, "fistiger");
            return (Criteria) this;
        }

        public Criteria andFistigerGreaterThan(Byte value) {
            addCriterion("fistiger >", value, "fistiger");
            return (Criteria) this;
        }

        public Criteria andFistigerGreaterThanOrEqualTo(Byte value) {
            addCriterion("fistiger >=", value, "fistiger");
            return (Criteria) this;
        }

        public Criteria andFistigerLessThan(Byte value) {
            addCriterion("fistiger <", value, "fistiger");
            return (Criteria) this;
        }

        public Criteria andFistigerLessThanOrEqualTo(Byte value) {
            addCriterion("fistiger <=", value, "fistiger");
            return (Criteria) this;
        }

        public Criteria andFistigerIn(List<Byte> values) {
            addCriterion("fistiger in", values, "fistiger");
            return (Criteria) this;
        }

        public Criteria andFistigerNotIn(List<Byte> values) {
            addCriterion("fistiger not in", values, "fistiger");
            return (Criteria) this;
        }

        public Criteria andFistigerBetween(Byte value1, Byte value2) {
            addCriterion("fistiger between", value1, value2, "fistiger");
            return (Criteria) this;
        }

        public Criteria andFistigerNotBetween(Byte value1, Byte value2) {
            addCriterion("fistiger not between", value1, value2, "fistiger");
            return (Criteria) this;
        }

        public Criteria andFregipIsNull() {
            addCriterion("fregIp is null");
            return (Criteria) this;
        }

        public Criteria andFregipIsNotNull() {
            addCriterion("fregIp is not null");
            return (Criteria) this;
        }

        public Criteria andFregipEqualTo(String value) {
            addCriterion("fregIp =", value, "fregip");
            return (Criteria) this;
        }

        public Criteria andFregipNotEqualTo(String value) {
            addCriterion("fregIp <>", value, "fregip");
            return (Criteria) this;
        }

        public Criteria andFregipGreaterThan(String value) {
            addCriterion("fregIp >", value, "fregip");
            return (Criteria) this;
        }

        public Criteria andFregipGreaterThanOrEqualTo(String value) {
            addCriterion("fregIp >=", value, "fregip");
            return (Criteria) this;
        }

        public Criteria andFregipLessThan(String value) {
            addCriterion("fregIp <", value, "fregip");
            return (Criteria) this;
        }

        public Criteria andFregipLessThanOrEqualTo(String value) {
            addCriterion("fregIp <=", value, "fregip");
            return (Criteria) this;
        }

        public Criteria andFregipLike(String value) {
            addCriterion("fregIp like", value, "fregip");
            return (Criteria) this;
        }

        public Criteria andFregipNotLike(String value) {
            addCriterion("fregIp not like", value, "fregip");
            return (Criteria) this;
        }

        public Criteria andFregipIn(List<String> values) {
            addCriterion("fregIp in", values, "fregip");
            return (Criteria) this;
        }

        public Criteria andFregipNotIn(List<String> values) {
            addCriterion("fregIp not in", values, "fregip");
            return (Criteria) this;
        }

        public Criteria andFregipBetween(String value1, String value2) {
            addCriterion("fregIp between", value1, value2, "fregip");
            return (Criteria) this;
        }

        public Criteria andFregipNotBetween(String value1, String value2) {
            addCriterion("fregIp not between", value1, value2, "fregip");
            return (Criteria) this;
        }

        public Criteria andFlastloginipIsNull() {
            addCriterion("flastLoginIp is null");
            return (Criteria) this;
        }

        public Criteria andFlastloginipIsNotNull() {
            addCriterion("flastLoginIp is not null");
            return (Criteria) this;
        }

        public Criteria andFlastloginipEqualTo(String value) {
            addCriterion("flastLoginIp =", value, "flastloginip");
            return (Criteria) this;
        }

        public Criteria andFlastloginipNotEqualTo(String value) {
            addCriterion("flastLoginIp <>", value, "flastloginip");
            return (Criteria) this;
        }

        public Criteria andFlastloginipGreaterThan(String value) {
            addCriterion("flastLoginIp >", value, "flastloginip");
            return (Criteria) this;
        }

        public Criteria andFlastloginipGreaterThanOrEqualTo(String value) {
            addCriterion("flastLoginIp >=", value, "flastloginip");
            return (Criteria) this;
        }

        public Criteria andFlastloginipLessThan(String value) {
            addCriterion("flastLoginIp <", value, "flastloginip");
            return (Criteria) this;
        }

        public Criteria andFlastloginipLessThanOrEqualTo(String value) {
            addCriterion("flastLoginIp <=", value, "flastloginip");
            return (Criteria) this;
        }

        public Criteria andFlastloginipLike(String value) {
            addCriterion("flastLoginIp like", value, "flastloginip");
            return (Criteria) this;
        }

        public Criteria andFlastloginipNotLike(String value) {
            addCriterion("flastLoginIp not like", value, "flastloginip");
            return (Criteria) this;
        }

        public Criteria andFlastloginipIn(List<String> values) {
            addCriterion("flastLoginIp in", values, "flastloginip");
            return (Criteria) this;
        }

        public Criteria andFlastloginipNotIn(List<String> values) {
            addCriterion("flastLoginIp not in", values, "flastloginip");
            return (Criteria) this;
        }

        public Criteria andFlastloginipBetween(String value1, String value2) {
            addCriterion("flastLoginIp between", value1, value2, "flastloginip");
            return (Criteria) this;
        }

        public Criteria andFlastloginipNotBetween(String value1, String value2) {
            addCriterion("flastLoginIp not between", value1, value2, "flastloginip");
            return (Criteria) this;
        }

        public Criteria andFintrolusernoIsNull() {
            addCriterion("fintrolUserNo is null");
            return (Criteria) this;
        }

        public Criteria andFintrolusernoIsNotNull() {
            addCriterion("fintrolUserNo is not null");
            return (Criteria) this;
        }

        public Criteria andFintrolusernoEqualTo(String value) {
            addCriterion("fintrolUserNo =", value, "fintroluserno");
            return (Criteria) this;
        }

        public Criteria andFintrolusernoNotEqualTo(String value) {
            addCriterion("fintrolUserNo <>", value, "fintroluserno");
            return (Criteria) this;
        }

        public Criteria andFintrolusernoGreaterThan(String value) {
            addCriterion("fintrolUserNo >", value, "fintroluserno");
            return (Criteria) this;
        }

        public Criteria andFintrolusernoGreaterThanOrEqualTo(String value) {
            addCriterion("fintrolUserNo >=", value, "fintroluserno");
            return (Criteria) this;
        }

        public Criteria andFintrolusernoLessThan(String value) {
            addCriterion("fintrolUserNo <", value, "fintroluserno");
            return (Criteria) this;
        }

        public Criteria andFintrolusernoLessThanOrEqualTo(String value) {
            addCriterion("fintrolUserNo <=", value, "fintroluserno");
            return (Criteria) this;
        }

        public Criteria andFintrolusernoLike(String value) {
            addCriterion("fintrolUserNo like", value, "fintroluserno");
            return (Criteria) this;
        }

        public Criteria andFintrolusernoNotLike(String value) {
            addCriterion("fintrolUserNo not like", value, "fintroluserno");
            return (Criteria) this;
        }

        public Criteria andFintrolusernoIn(List<String> values) {
            addCriterion("fintrolUserNo in", values, "fintroluserno");
            return (Criteria) this;
        }

        public Criteria andFintrolusernoNotIn(List<String> values) {
            addCriterion("fintrolUserNo not in", values, "fintroluserno");
            return (Criteria) this;
        }

        public Criteria andFintrolusernoBetween(String value1, String value2) {
            addCriterion("fintrolUserNo between", value1, value2, "fintroluserno");
            return (Criteria) this;
        }

        public Criteria andFintrolusernoNotBetween(String value1, String value2) {
            addCriterion("fintrolUserNo not between", value1, value2, "fintroluserno");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andFidentitypath3IsNull() {
            addCriterion("fIdentityPath3 is null");
            return (Criteria) this;
        }

        public Criteria andFidentitypath3IsNotNull() {
            addCriterion("fIdentityPath3 is not null");
            return (Criteria) this;
        }

        public Criteria andFidentitypath3EqualTo(String value) {
            addCriterion("fIdentityPath3 =", value, "fidentitypath3");
            return (Criteria) this;
        }

        public Criteria andFidentitypath3NotEqualTo(String value) {
            addCriterion("fIdentityPath3 <>", value, "fidentitypath3");
            return (Criteria) this;
        }

        public Criteria andFidentitypath3GreaterThan(String value) {
            addCriterion("fIdentityPath3 >", value, "fidentitypath3");
            return (Criteria) this;
        }

        public Criteria andFidentitypath3GreaterThanOrEqualTo(String value) {
            addCriterion("fIdentityPath3 >=", value, "fidentitypath3");
            return (Criteria) this;
        }

        public Criteria andFidentitypath3LessThan(String value) {
            addCriterion("fIdentityPath3 <", value, "fidentitypath3");
            return (Criteria) this;
        }

        public Criteria andFidentitypath3LessThanOrEqualTo(String value) {
            addCriterion("fIdentityPath3 <=", value, "fidentitypath3");
            return (Criteria) this;
        }

        public Criteria andFidentitypath3Like(String value) {
            addCriterion("fIdentityPath3 like", value, "fidentitypath3");
            return (Criteria) this;
        }

        public Criteria andFidentitypath3NotLike(String value) {
            addCriterion("fIdentityPath3 not like", value, "fidentitypath3");
            return (Criteria) this;
        }

        public Criteria andFidentitypath3In(List<String> values) {
            addCriterion("fIdentityPath3 in", values, "fidentitypath3");
            return (Criteria) this;
        }

        public Criteria andFidentitypath3NotIn(List<String> values) {
            addCriterion("fIdentityPath3 not in", values, "fidentitypath3");
            return (Criteria) this;
        }

        public Criteria andFidentitypath3Between(String value1, String value2) {
            addCriterion("fIdentityPath3 between", value1, value2, "fidentitypath3");
            return (Criteria) this;
        }

        public Criteria andFidentitypath3NotBetween(String value1, String value2) {
            addCriterion("fIdentityPath3 not between", value1, value2, "fidentitypath3");
            return (Criteria) this;
        }

        public Criteria andFusertypeIsNull() {
            addCriterion("fuserType is null");
            return (Criteria) this;
        }

        public Criteria andFusertypeIsNotNull() {
            addCriterion("fuserType is not null");
            return (Criteria) this;
        }

        public Criteria andFusertypeEqualTo(Integer value) {
            addCriterion("fuserType =", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeNotEqualTo(Integer value) {
            addCriterion("fuserType <>", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeGreaterThan(Integer value) {
            addCriterion("fuserType >", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fuserType >=", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeLessThan(Integer value) {
            addCriterion("fuserType <", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeLessThanOrEqualTo(Integer value) {
            addCriterion("fuserType <=", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeIn(List<Integer> values) {
            addCriterion("fuserType in", values, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeNotIn(List<Integer> values) {
            addCriterion("fuserType not in", values, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeBetween(Integer value1, Integer value2) {
            addCriterion("fuserType between", value1, value2, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("fuserType not between", value1, value2, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFservicetraderateIsNull() {
            addCriterion("fServiceTradeRate is null");
            return (Criteria) this;
        }

        public Criteria andFservicetraderateIsNotNull() {
            addCriterion("fServiceTradeRate is not null");
            return (Criteria) this;
        }

        public Criteria andFservicetraderateEqualTo(String value) {
            addCriterion("fServiceTradeRate =", value, "fservicetraderate");
            return (Criteria) this;
        }

        public Criteria andFservicetraderateNotEqualTo(String value) {
            addCriterion("fServiceTradeRate <>", value, "fservicetraderate");
            return (Criteria) this;
        }

        public Criteria andFservicetraderateGreaterThan(String value) {
            addCriterion("fServiceTradeRate >", value, "fservicetraderate");
            return (Criteria) this;
        }

        public Criteria andFservicetraderateGreaterThanOrEqualTo(String value) {
            addCriterion("fServiceTradeRate >=", value, "fservicetraderate");
            return (Criteria) this;
        }

        public Criteria andFservicetraderateLessThan(String value) {
            addCriterion("fServiceTradeRate <", value, "fservicetraderate");
            return (Criteria) this;
        }

        public Criteria andFservicetraderateLessThanOrEqualTo(String value) {
            addCriterion("fServiceTradeRate <=", value, "fservicetraderate");
            return (Criteria) this;
        }

        public Criteria andFservicetraderateLike(String value) {
            addCriterion("fServiceTradeRate like", value, "fservicetraderate");
            return (Criteria) this;
        }

        public Criteria andFservicetraderateNotLike(String value) {
            addCriterion("fServiceTradeRate not like", value, "fservicetraderate");
            return (Criteria) this;
        }

        public Criteria andFservicetraderateIn(List<String> values) {
            addCriterion("fServiceTradeRate in", values, "fservicetraderate");
            return (Criteria) this;
        }

        public Criteria andFservicetraderateNotIn(List<String> values) {
            addCriterion("fServiceTradeRate not in", values, "fservicetraderate");
            return (Criteria) this;
        }

        public Criteria andFservicetraderateBetween(String value1, String value2) {
            addCriterion("fServiceTradeRate between", value1, value2, "fservicetraderate");
            return (Criteria) this;
        }

        public Criteria andFservicetraderateNotBetween(String value1, String value2) {
            addCriterion("fServiceTradeRate not between", value1, value2, "fservicetraderate");
            return (Criteria) this;
        }

        public Criteria andFservicesubrateIsNull() {
            addCriterion("fServiceSubRate is null");
            return (Criteria) this;
        }

        public Criteria andFservicesubrateIsNotNull() {
            addCriterion("fServiceSubRate is not null");
            return (Criteria) this;
        }

        public Criteria andFservicesubrateEqualTo(String value) {
            addCriterion("fServiceSubRate =", value, "fservicesubrate");
            return (Criteria) this;
        }

        public Criteria andFservicesubrateNotEqualTo(String value) {
            addCriterion("fServiceSubRate <>", value, "fservicesubrate");
            return (Criteria) this;
        }

        public Criteria andFservicesubrateGreaterThan(String value) {
            addCriterion("fServiceSubRate >", value, "fservicesubrate");
            return (Criteria) this;
        }

        public Criteria andFservicesubrateGreaterThanOrEqualTo(String value) {
            addCriterion("fServiceSubRate >=", value, "fservicesubrate");
            return (Criteria) this;
        }

        public Criteria andFservicesubrateLessThan(String value) {
            addCriterion("fServiceSubRate <", value, "fservicesubrate");
            return (Criteria) this;
        }

        public Criteria andFservicesubrateLessThanOrEqualTo(String value) {
            addCriterion("fServiceSubRate <=", value, "fservicesubrate");
            return (Criteria) this;
        }

        public Criteria andFservicesubrateLike(String value) {
            addCriterion("fServiceSubRate like", value, "fservicesubrate");
            return (Criteria) this;
        }

        public Criteria andFservicesubrateNotLike(String value) {
            addCriterion("fServiceSubRate not like", value, "fservicesubrate");
            return (Criteria) this;
        }

        public Criteria andFservicesubrateIn(List<String> values) {
            addCriterion("fServiceSubRate in", values, "fservicesubrate");
            return (Criteria) this;
        }

        public Criteria andFservicesubrateNotIn(List<String> values) {
            addCriterion("fServiceSubRate not in", values, "fservicesubrate");
            return (Criteria) this;
        }

        public Criteria andFservicesubrateBetween(String value1, String value2) {
            addCriterion("fServiceSubRate between", value1, value2, "fservicesubrate");
            return (Criteria) this;
        }

        public Criteria andFservicesubrateNotBetween(String value1, String value2) {
            addCriterion("fServiceSubRate not between", value1, value2, "fservicesubrate");
            return (Criteria) this;
        }

        public Criteria andFproxynumberIsNull() {
            addCriterion("fProxyNumber is null");
            return (Criteria) this;
        }

        public Criteria andFproxynumberIsNotNull() {
            addCriterion("fProxyNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFproxynumberEqualTo(String value) {
            addCriterion("fProxyNumber =", value, "fproxynumber");
            return (Criteria) this;
        }

        public Criteria andFproxynumberNotEqualTo(String value) {
            addCriterion("fProxyNumber <>", value, "fproxynumber");
            return (Criteria) this;
        }

        public Criteria andFproxynumberGreaterThan(String value) {
            addCriterion("fProxyNumber >", value, "fproxynumber");
            return (Criteria) this;
        }

        public Criteria andFproxynumberGreaterThanOrEqualTo(String value) {
            addCriterion("fProxyNumber >=", value, "fproxynumber");
            return (Criteria) this;
        }

        public Criteria andFproxynumberLessThan(String value) {
            addCriterion("fProxyNumber <", value, "fproxynumber");
            return (Criteria) this;
        }

        public Criteria andFproxynumberLessThanOrEqualTo(String value) {
            addCriterion("fProxyNumber <=", value, "fproxynumber");
            return (Criteria) this;
        }

        public Criteria andFproxynumberLike(String value) {
            addCriterion("fProxyNumber like", value, "fproxynumber");
            return (Criteria) this;
        }

        public Criteria andFproxynumberNotLike(String value) {
            addCriterion("fProxyNumber not like", value, "fproxynumber");
            return (Criteria) this;
        }

        public Criteria andFproxynumberIn(List<String> values) {
            addCriterion("fProxyNumber in", values, "fproxynumber");
            return (Criteria) this;
        }

        public Criteria andFproxynumberNotIn(List<String> values) {
            addCriterion("fProxyNumber not in", values, "fproxynumber");
            return (Criteria) this;
        }

        public Criteria andFproxynumberBetween(String value1, String value2) {
            addCriterion("fProxyNumber between", value1, value2, "fproxynumber");
            return (Criteria) this;
        }

        public Criteria andFproxynumberNotBetween(String value1, String value2) {
            addCriterion("fProxyNumber not between", value1, value2, "fproxynumber");
            return (Criteria) this;
        }

        public Criteria andFproxytraderateIsNull() {
            addCriterion("fProxyTradeRate is null");
            return (Criteria) this;
        }

        public Criteria andFproxytraderateIsNotNull() {
            addCriterion("fProxyTradeRate is not null");
            return (Criteria) this;
        }

        public Criteria andFproxytraderateEqualTo(BigDecimal value) {
            addCriterion("fProxyTradeRate =", value, "fproxytraderate");
            return (Criteria) this;
        }

        public Criteria andFproxytraderateNotEqualTo(BigDecimal value) {
            addCriterion("fProxyTradeRate <>", value, "fproxytraderate");
            return (Criteria) this;
        }

        public Criteria andFproxytraderateGreaterThan(BigDecimal value) {
            addCriterion("fProxyTradeRate >", value, "fproxytraderate");
            return (Criteria) this;
        }

        public Criteria andFproxytraderateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fProxyTradeRate >=", value, "fproxytraderate");
            return (Criteria) this;
        }

        public Criteria andFproxytraderateLessThan(BigDecimal value) {
            addCriterion("fProxyTradeRate <", value, "fproxytraderate");
            return (Criteria) this;
        }

        public Criteria andFproxytraderateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fProxyTradeRate <=", value, "fproxytraderate");
            return (Criteria) this;
        }

        public Criteria andFproxytraderateIn(List<BigDecimal> values) {
            addCriterion("fProxyTradeRate in", values, "fproxytraderate");
            return (Criteria) this;
        }

        public Criteria andFproxytraderateNotIn(List<BigDecimal> values) {
            addCriterion("fProxyTradeRate not in", values, "fproxytraderate");
            return (Criteria) this;
        }

        public Criteria andFproxytraderateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fProxyTradeRate between", value1, value2, "fproxytraderate");
            return (Criteria) this;
        }

        public Criteria andFproxytraderateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fProxyTradeRate not between", value1, value2, "fproxytraderate");
            return (Criteria) this;
        }

        public Criteria andFproxysubrateIsNull() {
            addCriterion("fProxySubRate is null");
            return (Criteria) this;
        }

        public Criteria andFproxysubrateIsNotNull() {
            addCriterion("fProxySubRate is not null");
            return (Criteria) this;
        }

        public Criteria andFproxysubrateEqualTo(BigDecimal value) {
            addCriterion("fProxySubRate =", value, "fproxysubrate");
            return (Criteria) this;
        }

        public Criteria andFproxysubrateNotEqualTo(BigDecimal value) {
            addCriterion("fProxySubRate <>", value, "fproxysubrate");
            return (Criteria) this;
        }

        public Criteria andFproxysubrateGreaterThan(BigDecimal value) {
            addCriterion("fProxySubRate >", value, "fproxysubrate");
            return (Criteria) this;
        }

        public Criteria andFproxysubrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fProxySubRate >=", value, "fproxysubrate");
            return (Criteria) this;
        }

        public Criteria andFproxysubrateLessThan(BigDecimal value) {
            addCriterion("fProxySubRate <", value, "fproxysubrate");
            return (Criteria) this;
        }

        public Criteria andFproxysubrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fProxySubRate <=", value, "fproxysubrate");
            return (Criteria) this;
        }

        public Criteria andFproxysubrateIn(List<BigDecimal> values) {
            addCriterion("fProxySubRate in", values, "fproxysubrate");
            return (Criteria) this;
        }

        public Criteria andFproxysubrateNotIn(List<BigDecimal> values) {
            addCriterion("fProxySubRate not in", values, "fproxysubrate");
            return (Criteria) this;
        }

        public Criteria andFproxysubrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fProxySubRate between", value1, value2, "fproxysubrate");
            return (Criteria) this;
        }

        public Criteria andFproxysubrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fProxySubRate not between", value1, value2, "fproxysubrate");
            return (Criteria) this;
        }

        public Criteria andFischeckIsNull() {
            addCriterion("fischeck is null");
            return (Criteria) this;
        }

        public Criteria andFischeckIsNotNull() {
            addCriterion("fischeck is not null");
            return (Criteria) this;
        }

        public Criteria andFischeckEqualTo(Byte value) {
            addCriterion("fischeck =", value, "fischeck");
            return (Criteria) this;
        }

        public Criteria andFischeckNotEqualTo(Byte value) {
            addCriterion("fischeck <>", value, "fischeck");
            return (Criteria) this;
        }

        public Criteria andFischeckGreaterThan(Byte value) {
            addCriterion("fischeck >", value, "fischeck");
            return (Criteria) this;
        }

        public Criteria andFischeckGreaterThanOrEqualTo(Byte value) {
            addCriterion("fischeck >=", value, "fischeck");
            return (Criteria) this;
        }

        public Criteria andFischeckLessThan(Byte value) {
            addCriterion("fischeck <", value, "fischeck");
            return (Criteria) this;
        }

        public Criteria andFischeckLessThanOrEqualTo(Byte value) {
            addCriterion("fischeck <=", value, "fischeck");
            return (Criteria) this;
        }

        public Criteria andFischeckIn(List<Byte> values) {
            addCriterion("fischeck in", values, "fischeck");
            return (Criteria) this;
        }

        public Criteria andFischeckNotIn(List<Byte> values) {
            addCriterion("fischeck not in", values, "fischeck");
            return (Criteria) this;
        }

        public Criteria andFischeckBetween(Byte value1, Byte value2) {
            addCriterion("fischeck between", value1, value2, "fischeck");
            return (Criteria) this;
        }

        public Criteria andFischeckNotBetween(Byte value1, Byte value2) {
            addCriterion("fischeck not between", value1, value2, "fischeck");
            return (Criteria) this;
        }

        public Criteria andFsexIsNull() {
            addCriterion("fsex is null");
            return (Criteria) this;
        }

        public Criteria andFsexIsNotNull() {
            addCriterion("fsex is not null");
            return (Criteria) this;
        }

        public Criteria andFsexEqualTo(String value) {
            addCriterion("fsex =", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexNotEqualTo(String value) {
            addCriterion("fsex <>", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexGreaterThan(String value) {
            addCriterion("fsex >", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexGreaterThanOrEqualTo(String value) {
            addCriterion("fsex >=", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexLessThan(String value) {
            addCriterion("fsex <", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexLessThanOrEqualTo(String value) {
            addCriterion("fsex <=", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexLike(String value) {
            addCriterion("fsex like", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexNotLike(String value) {
            addCriterion("fsex not like", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexIn(List<String> values) {
            addCriterion("fsex in", values, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexNotIn(List<String> values) {
            addCriterion("fsex not in", values, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexBetween(String value1, String value2) {
            addCriterion("fsex between", value1, value2, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexNotBetween(String value1, String value2) {
            addCriterion("fsex not between", value1, value2, "fsex");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andFbirthIsNull() {
            addCriterion("fbirth is null");
            return (Criteria) this;
        }

        public Criteria andFbirthIsNotNull() {
            addCriterion("fbirth is not null");
            return (Criteria) this;
        }

        public Criteria andFbirthEqualTo(Date value) {
            addCriterionForJDBCDate("fbirth =", value, "fbirth");
            return (Criteria) this;
        }

        public Criteria andFbirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("fbirth <>", value, "fbirth");
            return (Criteria) this;
        }

        public Criteria andFbirthGreaterThan(Date value) {
            addCriterionForJDBCDate("fbirth >", value, "fbirth");
            return (Criteria) this;
        }

        public Criteria andFbirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fbirth >=", value, "fbirth");
            return (Criteria) this;
        }

        public Criteria andFbirthLessThan(Date value) {
            addCriterionForJDBCDate("fbirth <", value, "fbirth");
            return (Criteria) this;
        }

        public Criteria andFbirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fbirth <=", value, "fbirth");
            return (Criteria) this;
        }

        public Criteria andFbirthIn(List<Date> values) {
            addCriterionForJDBCDate("fbirth in", values, "fbirth");
            return (Criteria) this;
        }

        public Criteria andFbirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("fbirth not in", values, "fbirth");
            return (Criteria) this;
        }

        public Criteria andFbirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fbirth between", value1, value2, "fbirth");
            return (Criteria) this;
        }

        public Criteria andFbirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fbirth not between", value1, value2, "fbirth");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidateIsNull() {
            addCriterion("fpostHighValidate is null");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidateIsNotNull() {
            addCriterion("fpostHighValidate is not null");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidateEqualTo(Byte value) {
            addCriterion("fpostHighValidate =", value, "fposthighvalidate");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidateNotEqualTo(Byte value) {
            addCriterion("fpostHighValidate <>", value, "fposthighvalidate");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidateGreaterThan(Byte value) {
            addCriterion("fpostHighValidate >", value, "fposthighvalidate");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidateGreaterThanOrEqualTo(Byte value) {
            addCriterion("fpostHighValidate >=", value, "fposthighvalidate");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidateLessThan(Byte value) {
            addCriterion("fpostHighValidate <", value, "fposthighvalidate");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidateLessThanOrEqualTo(Byte value) {
            addCriterion("fpostHighValidate <=", value, "fposthighvalidate");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidateIn(List<Byte> values) {
            addCriterion("fpostHighValidate in", values, "fposthighvalidate");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidateNotIn(List<Byte> values) {
            addCriterion("fpostHighValidate not in", values, "fposthighvalidate");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidateBetween(Byte value1, Byte value2) {
            addCriterion("fpostHighValidate between", value1, value2, "fposthighvalidate");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidateNotBetween(Byte value1, Byte value2) {
            addCriterion("fpostHighValidate not between", value1, value2, "fposthighvalidate");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidateIsNull() {
            addCriterion("fhasHighValidate is null");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidateIsNotNull() {
            addCriterion("fhasHighValidate is not null");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidateEqualTo(Byte value) {
            addCriterion("fhasHighValidate =", value, "fhashighvalidate");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidateNotEqualTo(Byte value) {
            addCriterion("fhasHighValidate <>", value, "fhashighvalidate");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidateGreaterThan(Byte value) {
            addCriterion("fhasHighValidate >", value, "fhashighvalidate");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidateGreaterThanOrEqualTo(Byte value) {
            addCriterion("fhasHighValidate >=", value, "fhashighvalidate");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidateLessThan(Byte value) {
            addCriterion("fhasHighValidate <", value, "fhashighvalidate");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidateLessThanOrEqualTo(Byte value) {
            addCriterion("fhasHighValidate <=", value, "fhashighvalidate");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidateIn(List<Byte> values) {
            addCriterion("fhasHighValidate in", values, "fhashighvalidate");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidateNotIn(List<Byte> values) {
            addCriterion("fhasHighValidate not in", values, "fhashighvalidate");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidateBetween(Byte value1, Byte value2) {
            addCriterion("fhasHighValidate between", value1, value2, "fhashighvalidate");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidateNotBetween(Byte value1, Byte value2) {
            addCriterion("fhasHighValidate not between", value1, value2, "fhashighvalidate");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidatetimeIsNull() {
            addCriterion("fpostHighValidateTime is null");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidatetimeIsNotNull() {
            addCriterion("fpostHighValidateTime is not null");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidatetimeEqualTo(Date value) {
            addCriterion("fpostHighValidateTime =", value, "fposthighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidatetimeNotEqualTo(Date value) {
            addCriterion("fpostHighValidateTime <>", value, "fposthighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidatetimeGreaterThan(Date value) {
            addCriterion("fpostHighValidateTime >", value, "fposthighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fpostHighValidateTime >=", value, "fposthighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidatetimeLessThan(Date value) {
            addCriterion("fpostHighValidateTime <", value, "fposthighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidatetimeLessThanOrEqualTo(Date value) {
            addCriterion("fpostHighValidateTime <=", value, "fposthighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidatetimeIn(List<Date> values) {
            addCriterion("fpostHighValidateTime in", values, "fposthighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidatetimeNotIn(List<Date> values) {
            addCriterion("fpostHighValidateTime not in", values, "fposthighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidatetimeBetween(Date value1, Date value2) {
            addCriterion("fpostHighValidateTime between", value1, value2, "fposthighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFposthighvalidatetimeNotBetween(Date value1, Date value2) {
            addCriterion("fpostHighValidateTime not between", value1, value2, "fposthighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidatetimeIsNull() {
            addCriterion("fhasHighValidateTime is null");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidatetimeIsNotNull() {
            addCriterion("fhasHighValidateTime is not null");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidatetimeEqualTo(Date value) {
            addCriterion("fhasHighValidateTime =", value, "fhashighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidatetimeNotEqualTo(Date value) {
            addCriterion("fhasHighValidateTime <>", value, "fhashighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidatetimeGreaterThan(Date value) {
            addCriterion("fhasHighValidateTime >", value, "fhashighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fhasHighValidateTime >=", value, "fhashighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidatetimeLessThan(Date value) {
            addCriterion("fhasHighValidateTime <", value, "fhashighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidatetimeLessThanOrEqualTo(Date value) {
            addCriterion("fhasHighValidateTime <=", value, "fhashighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidatetimeIn(List<Date> values) {
            addCriterion("fhasHighValidateTime in", values, "fhashighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidatetimeNotIn(List<Date> values) {
            addCriterion("fhasHighValidateTime not in", values, "fhashighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidatetimeBetween(Date value1, Date value2) {
            addCriterion("fhasHighValidateTime between", value1, value2, "fhashighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhashighvalidatetimeNotBetween(Date value1, Date value2) {
            addCriterion("fhasHighValidateTime not between", value1, value2, "fhashighvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFamtIsNull() {
            addCriterion("famt is null");
            return (Criteria) this;
        }

        public Criteria andFamtIsNotNull() {
            addCriterion("famt is not null");
            return (Criteria) this;
        }

        public Criteria andFamtEqualTo(BigDecimal value) {
            addCriterion("famt =", value, "famt");
            return (Criteria) this;
        }

        public Criteria andFamtNotEqualTo(BigDecimal value) {
            addCriterion("famt <>", value, "famt");
            return (Criteria) this;
        }

        public Criteria andFamtGreaterThan(BigDecimal value) {
            addCriterion("famt >", value, "famt");
            return (Criteria) this;
        }

        public Criteria andFamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("famt >=", value, "famt");
            return (Criteria) this;
        }

        public Criteria andFamtLessThan(BigDecimal value) {
            addCriterion("famt <", value, "famt");
            return (Criteria) this;
        }

        public Criteria andFamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("famt <=", value, "famt");
            return (Criteria) this;
        }

        public Criteria andFamtIn(List<BigDecimal> values) {
            addCriterion("famt in", values, "famt");
            return (Criteria) this;
        }

        public Criteria andFamtNotIn(List<BigDecimal> values) {
            addCriterion("famt not in", values, "famt");
            return (Criteria) this;
        }

        public Criteria andFamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("famt between", value1, value2, "famt");
            return (Criteria) this;
        }

        public Criteria andFamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("famt not between", value1, value2, "famt");
            return (Criteria) this;
        }

        public Criteria andFintrouserId3IsNull() {
            addCriterion("fIntroUser_id3 is null");
            return (Criteria) this;
        }

        public Criteria andFintrouserId3IsNotNull() {
            addCriterion("fIntroUser_id3 is not null");
            return (Criteria) this;
        }

        public Criteria andFintrouserId3EqualTo(Integer value) {
            addCriterion("fIntroUser_id3 =", value, "fintrouserId3");
            return (Criteria) this;
        }

        public Criteria andFintrouserId3NotEqualTo(Integer value) {
            addCriterion("fIntroUser_id3 <>", value, "fintrouserId3");
            return (Criteria) this;
        }

        public Criteria andFintrouserId3GreaterThan(Integer value) {
            addCriterion("fIntroUser_id3 >", value, "fintrouserId3");
            return (Criteria) this;
        }

        public Criteria andFintrouserId3GreaterThanOrEqualTo(Integer value) {
            addCriterion("fIntroUser_id3 >=", value, "fintrouserId3");
            return (Criteria) this;
        }

        public Criteria andFintrouserId3LessThan(Integer value) {
            addCriterion("fIntroUser_id3 <", value, "fintrouserId3");
            return (Criteria) this;
        }

        public Criteria andFintrouserId3LessThanOrEqualTo(Integer value) {
            addCriterion("fIntroUser_id3 <=", value, "fintrouserId3");
            return (Criteria) this;
        }

        public Criteria andFintrouserId3In(List<Integer> values) {
            addCriterion("fIntroUser_id3 in", values, "fintrouserId3");
            return (Criteria) this;
        }

        public Criteria andFintrouserId3NotIn(List<Integer> values) {
            addCriterion("fIntroUser_id3 not in", values, "fintrouserId3");
            return (Criteria) this;
        }

        public Criteria andFintrouserId3Between(Integer value1, Integer value2) {
            addCriterion("fIntroUser_id3 between", value1, value2, "fintrouserId3");
            return (Criteria) this;
        }

        public Criteria andFintrouserId3NotBetween(Integer value1, Integer value2) {
            addCriterion("fIntroUser_id3 not between", value1, value2, "fintrouserId3");
            return (Criteria) this;
        }

        public Criteria andFintrouserId2IsNull() {
            addCriterion("fIntroUser_id2 is null");
            return (Criteria) this;
        }

        public Criteria andFintrouserId2IsNotNull() {
            addCriterion("fIntroUser_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andFintrouserId2EqualTo(Integer value) {
            addCriterion("fIntroUser_id2 =", value, "fintrouserId2");
            return (Criteria) this;
        }

        public Criteria andFintrouserId2NotEqualTo(Integer value) {
            addCriterion("fIntroUser_id2 <>", value, "fintrouserId2");
            return (Criteria) this;
        }

        public Criteria andFintrouserId2GreaterThan(Integer value) {
            addCriterion("fIntroUser_id2 >", value, "fintrouserId2");
            return (Criteria) this;
        }

        public Criteria andFintrouserId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("fIntroUser_id2 >=", value, "fintrouserId2");
            return (Criteria) this;
        }

        public Criteria andFintrouserId2LessThan(Integer value) {
            addCriterion("fIntroUser_id2 <", value, "fintrouserId2");
            return (Criteria) this;
        }

        public Criteria andFintrouserId2LessThanOrEqualTo(Integer value) {
            addCriterion("fIntroUser_id2 <=", value, "fintrouserId2");
            return (Criteria) this;
        }

        public Criteria andFintrouserId2In(List<Integer> values) {
            addCriterion("fIntroUser_id2 in", values, "fintrouserId2");
            return (Criteria) this;
        }

        public Criteria andFintrouserId2NotIn(List<Integer> values) {
            addCriterion("fIntroUser_id2 not in", values, "fintrouserId2");
            return (Criteria) this;
        }

        public Criteria andFintrouserId2Between(Integer value1, Integer value2) {
            addCriterion("fIntroUser_id2 between", value1, value2, "fintrouserId2");
            return (Criteria) this;
        }

        public Criteria andFintrouserId2NotBetween(Integer value1, Integer value2) {
            addCriterion("fIntroUser_id2 not between", value1, value2, "fintrouserId2");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidateIsNull() {
            addCriterion("fpostImgValidate is null");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidateIsNotNull() {
            addCriterion("fpostImgValidate is not null");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidateEqualTo(Byte value) {
            addCriterion("fpostImgValidate =", value, "fpostimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidateNotEqualTo(Byte value) {
            addCriterion("fpostImgValidate <>", value, "fpostimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidateGreaterThan(Byte value) {
            addCriterion("fpostImgValidate >", value, "fpostimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidateGreaterThanOrEqualTo(Byte value) {
            addCriterion("fpostImgValidate >=", value, "fpostimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidateLessThan(Byte value) {
            addCriterion("fpostImgValidate <", value, "fpostimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidateLessThanOrEqualTo(Byte value) {
            addCriterion("fpostImgValidate <=", value, "fpostimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidateIn(List<Byte> values) {
            addCriterion("fpostImgValidate in", values, "fpostimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidateNotIn(List<Byte> values) {
            addCriterion("fpostImgValidate not in", values, "fpostimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidateBetween(Byte value1, Byte value2) {
            addCriterion("fpostImgValidate between", value1, value2, "fpostimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidateNotBetween(Byte value1, Byte value2) {
            addCriterion("fpostImgValidate not between", value1, value2, "fpostimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidateIsNull() {
            addCriterion("fhasImgValidate is null");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidateIsNotNull() {
            addCriterion("fhasImgValidate is not null");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidateEqualTo(Byte value) {
            addCriterion("fhasImgValidate =", value, "fhasimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidateNotEqualTo(Byte value) {
            addCriterion("fhasImgValidate <>", value, "fhasimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidateGreaterThan(Byte value) {
            addCriterion("fhasImgValidate >", value, "fhasimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidateGreaterThanOrEqualTo(Byte value) {
            addCriterion("fhasImgValidate >=", value, "fhasimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidateLessThan(Byte value) {
            addCriterion("fhasImgValidate <", value, "fhasimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidateLessThanOrEqualTo(Byte value) {
            addCriterion("fhasImgValidate <=", value, "fhasimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidateIn(List<Byte> values) {
            addCriterion("fhasImgValidate in", values, "fhasimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidateNotIn(List<Byte> values) {
            addCriterion("fhasImgValidate not in", values, "fhasimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidateBetween(Byte value1, Byte value2) {
            addCriterion("fhasImgValidate between", value1, value2, "fhasimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidateNotBetween(Byte value1, Byte value2) {
            addCriterion("fhasImgValidate not between", value1, value2, "fhasimgvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidatetimeIsNull() {
            addCriterion("fpostImgValidateTime is null");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidatetimeIsNotNull() {
            addCriterion("fpostImgValidateTime is not null");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidatetimeEqualTo(Date value) {
            addCriterion("fpostImgValidateTime =", value, "fpostimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidatetimeNotEqualTo(Date value) {
            addCriterion("fpostImgValidateTime <>", value, "fpostimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidatetimeGreaterThan(Date value) {
            addCriterion("fpostImgValidateTime >", value, "fpostimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fpostImgValidateTime >=", value, "fpostimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidatetimeLessThan(Date value) {
            addCriterion("fpostImgValidateTime <", value, "fpostimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidatetimeLessThanOrEqualTo(Date value) {
            addCriterion("fpostImgValidateTime <=", value, "fpostimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidatetimeIn(List<Date> values) {
            addCriterion("fpostImgValidateTime in", values, "fpostimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidatetimeNotIn(List<Date> values) {
            addCriterion("fpostImgValidateTime not in", values, "fpostimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidatetimeBetween(Date value1, Date value2) {
            addCriterion("fpostImgValidateTime between", value1, value2, "fpostimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFpostimgvalidatetimeNotBetween(Date value1, Date value2) {
            addCriterion("fpostImgValidateTime not between", value1, value2, "fpostimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidatetimeIsNull() {
            addCriterion("fhasImgValidateTime is null");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidatetimeIsNotNull() {
            addCriterion("fhasImgValidateTime is not null");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidatetimeEqualTo(Date value) {
            addCriterion("fhasImgValidateTime =", value, "fhasimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidatetimeNotEqualTo(Date value) {
            addCriterion("fhasImgValidateTime <>", value, "fhasimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidatetimeGreaterThan(Date value) {
            addCriterion("fhasImgValidateTime >", value, "fhasimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fhasImgValidateTime >=", value, "fhasimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidatetimeLessThan(Date value) {
            addCriterion("fhasImgValidateTime <", value, "fhasimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidatetimeLessThanOrEqualTo(Date value) {
            addCriterion("fhasImgValidateTime <=", value, "fhasimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidatetimeIn(List<Date> values) {
            addCriterion("fhasImgValidateTime in", values, "fhasimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidatetimeNotIn(List<Date> values) {
            addCriterion("fhasImgValidateTime not in", values, "fhasimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidatetimeBetween(Date value1, Date value2) {
            addCriterion("fhasImgValidateTime between", value1, value2, "fhasimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasimgvalidatetimeNotBetween(Date value1, Date value2) {
            addCriterion("fhasImgValidateTime not between", value1, value2, "fhasimgvalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidateIsNull() {
            addCriterion("fhasVideoValidate is null");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidateIsNotNull() {
            addCriterion("fhasVideoValidate is not null");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidateEqualTo(Byte value) {
            addCriterion("fhasVideoValidate =", value, "fhasvideovalidate");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidateNotEqualTo(Byte value) {
            addCriterion("fhasVideoValidate <>", value, "fhasvideovalidate");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidateGreaterThan(Byte value) {
            addCriterion("fhasVideoValidate >", value, "fhasvideovalidate");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidateGreaterThanOrEqualTo(Byte value) {
            addCriterion("fhasVideoValidate >=", value, "fhasvideovalidate");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidateLessThan(Byte value) {
            addCriterion("fhasVideoValidate <", value, "fhasvideovalidate");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidateLessThanOrEqualTo(Byte value) {
            addCriterion("fhasVideoValidate <=", value, "fhasvideovalidate");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidateIn(List<Byte> values) {
            addCriterion("fhasVideoValidate in", values, "fhasvideovalidate");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidateNotIn(List<Byte> values) {
            addCriterion("fhasVideoValidate not in", values, "fhasvideovalidate");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidateBetween(Byte value1, Byte value2) {
            addCriterion("fhasVideoValidate between", value1, value2, "fhasvideovalidate");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidateNotBetween(Byte value1, Byte value2) {
            addCriterion("fhasVideoValidate not between", value1, value2, "fhasvideovalidate");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidatetimeIsNull() {
            addCriterion("fhasVideoValidateTime is null");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidatetimeIsNotNull() {
            addCriterion("fhasVideoValidateTime is not null");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidatetimeEqualTo(Date value) {
            addCriterion("fhasVideoValidateTime =", value, "fhasvideovalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidatetimeNotEqualTo(Date value) {
            addCriterion("fhasVideoValidateTime <>", value, "fhasvideovalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidatetimeGreaterThan(Date value) {
            addCriterion("fhasVideoValidateTime >", value, "fhasvideovalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fhasVideoValidateTime >=", value, "fhasvideovalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidatetimeLessThan(Date value) {
            addCriterion("fhasVideoValidateTime <", value, "fhasvideovalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidatetimeLessThanOrEqualTo(Date value) {
            addCriterion("fhasVideoValidateTime <=", value, "fhasvideovalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidatetimeIn(List<Date> values) {
            addCriterion("fhasVideoValidateTime in", values, "fhasvideovalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidatetimeNotIn(List<Date> values) {
            addCriterion("fhasVideoValidateTime not in", values, "fhasvideovalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidatetimeBetween(Date value1, Date value2) {
            addCriterion("fhasVideoValidateTime between", value1, value2, "fhasvideovalidatetime");
            return (Criteria) this;
        }

        public Criteria andFhasvideovalidatetimeNotBetween(Date value1, Date value2) {
            addCriterion("fhasVideoValidateTime not between", value1, value2, "fhasvideovalidatetime");
            return (Criteria) this;
        }

        public Criteria andFgooglecheckIsNull() {
            addCriterion("fGoogleCheck is null");
            return (Criteria) this;
        }

        public Criteria andFgooglecheckIsNotNull() {
            addCriterion("fGoogleCheck is not null");
            return (Criteria) this;
        }

        public Criteria andFgooglecheckEqualTo(Boolean value) {
            addCriterion("fGoogleCheck =", value, "fgooglecheck");
            return (Criteria) this;
        }

        public Criteria andFgooglecheckNotEqualTo(Boolean value) {
            addCriterion("fGoogleCheck <>", value, "fgooglecheck");
            return (Criteria) this;
        }

        public Criteria andFgooglecheckGreaterThan(Boolean value) {
            addCriterion("fGoogleCheck >", value, "fgooglecheck");
            return (Criteria) this;
        }

        public Criteria andFgooglecheckGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fGoogleCheck >=", value, "fgooglecheck");
            return (Criteria) this;
        }

        public Criteria andFgooglecheckLessThan(Boolean value) {
            addCriterion("fGoogleCheck <", value, "fgooglecheck");
            return (Criteria) this;
        }

        public Criteria andFgooglecheckLessThanOrEqualTo(Boolean value) {
            addCriterion("fGoogleCheck <=", value, "fgooglecheck");
            return (Criteria) this;
        }

        public Criteria andFgooglecheckIn(List<Boolean> values) {
            addCriterion("fGoogleCheck in", values, "fgooglecheck");
            return (Criteria) this;
        }

        public Criteria andFgooglecheckNotIn(List<Boolean> values) {
            addCriterion("fGoogleCheck not in", values, "fgooglecheck");
            return (Criteria) this;
        }

        public Criteria andFgooglecheckBetween(Boolean value1, Boolean value2) {
            addCriterion("fGoogleCheck between", value1, value2, "fgooglecheck");
            return (Criteria) this;
        }

        public Criteria andFgooglecheckNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fGoogleCheck not between", value1, value2, "fgooglecheck");
            return (Criteria) this;
        }

        public Criteria andFismerchantIsNull() {
            addCriterion("fIsMerchant is null");
            return (Criteria) this;
        }

        public Criteria andFismerchantIsNotNull() {
            addCriterion("fIsMerchant is not null");
            return (Criteria) this;
        }

        public Criteria andFismerchantEqualTo(Boolean value) {
            addCriterion("fIsMerchant =", value, "fismerchant");
            return (Criteria) this;
        }

        public Criteria andFismerchantNotEqualTo(Boolean value) {
            addCriterion("fIsMerchant <>", value, "fismerchant");
            return (Criteria) this;
        }

        public Criteria andFismerchantGreaterThan(Boolean value) {
            addCriterion("fIsMerchant >", value, "fismerchant");
            return (Criteria) this;
        }

        public Criteria andFismerchantGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fIsMerchant >=", value, "fismerchant");
            return (Criteria) this;
        }

        public Criteria andFismerchantLessThan(Boolean value) {
            addCriterion("fIsMerchant <", value, "fismerchant");
            return (Criteria) this;
        }

        public Criteria andFismerchantLessThanOrEqualTo(Boolean value) {
            addCriterion("fIsMerchant <=", value, "fismerchant");
            return (Criteria) this;
        }

        public Criteria andFismerchantIn(List<Boolean> values) {
            addCriterion("fIsMerchant in", values, "fismerchant");
            return (Criteria) this;
        }

        public Criteria andFismerchantNotIn(List<Boolean> values) {
            addCriterion("fIsMerchant not in", values, "fismerchant");
            return (Criteria) this;
        }

        public Criteria andFismerchantBetween(Boolean value1, Boolean value2) {
            addCriterion("fIsMerchant between", value1, value2, "fismerchant");
            return (Criteria) this;
        }

        public Criteria andFismerchantNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fIsMerchant not between", value1, value2, "fismerchant");
            return (Criteria) this;
        }

        public Criteria andFbankpathIsNull() {
            addCriterion("fBankPath is null");
            return (Criteria) this;
        }

        public Criteria andFbankpathIsNotNull() {
            addCriterion("fBankPath is not null");
            return (Criteria) this;
        }

        public Criteria andFbankpathEqualTo(String value) {
            addCriterion("fBankPath =", value, "fbankpath");
            return (Criteria) this;
        }

        public Criteria andFbankpathNotEqualTo(String value) {
            addCriterion("fBankPath <>", value, "fbankpath");
            return (Criteria) this;
        }

        public Criteria andFbankpathGreaterThan(String value) {
            addCriterion("fBankPath >", value, "fbankpath");
            return (Criteria) this;
        }

        public Criteria andFbankpathGreaterThanOrEqualTo(String value) {
            addCriterion("fBankPath >=", value, "fbankpath");
            return (Criteria) this;
        }

        public Criteria andFbankpathLessThan(String value) {
            addCriterion("fBankPath <", value, "fbankpath");
            return (Criteria) this;
        }

        public Criteria andFbankpathLessThanOrEqualTo(String value) {
            addCriterion("fBankPath <=", value, "fbankpath");
            return (Criteria) this;
        }

        public Criteria andFbankpathLike(String value) {
            addCriterion("fBankPath like", value, "fbankpath");
            return (Criteria) this;
        }

        public Criteria andFbankpathNotLike(String value) {
            addCriterion("fBankPath not like", value, "fbankpath");
            return (Criteria) this;
        }

        public Criteria andFbankpathIn(List<String> values) {
            addCriterion("fBankPath in", values, "fbankpath");
            return (Criteria) this;
        }

        public Criteria andFbankpathNotIn(List<String> values) {
            addCriterion("fBankPath not in", values, "fbankpath");
            return (Criteria) this;
        }

        public Criteria andFbankpathBetween(String value1, String value2) {
            addCriterion("fBankPath between", value1, value2, "fbankpath");
            return (Criteria) this;
        }

        public Criteria andFbankpathNotBetween(String value1, String value2) {
            addCriterion("fBankPath not between", value1, value2, "fbankpath");
            return (Criteria) this;
        }

        public Criteria andFbankpath2IsNull() {
            addCriterion("fBankPath2 is null");
            return (Criteria) this;
        }

        public Criteria andFbankpath2IsNotNull() {
            addCriterion("fBankPath2 is not null");
            return (Criteria) this;
        }

        public Criteria andFbankpath2EqualTo(String value) {
            addCriterion("fBankPath2 =", value, "fbankpath2");
            return (Criteria) this;
        }

        public Criteria andFbankpath2NotEqualTo(String value) {
            addCriterion("fBankPath2 <>", value, "fbankpath2");
            return (Criteria) this;
        }

        public Criteria andFbankpath2GreaterThan(String value) {
            addCriterion("fBankPath2 >", value, "fbankpath2");
            return (Criteria) this;
        }

        public Criteria andFbankpath2GreaterThanOrEqualTo(String value) {
            addCriterion("fBankPath2 >=", value, "fbankpath2");
            return (Criteria) this;
        }

        public Criteria andFbankpath2LessThan(String value) {
            addCriterion("fBankPath2 <", value, "fbankpath2");
            return (Criteria) this;
        }

        public Criteria andFbankpath2LessThanOrEqualTo(String value) {
            addCriterion("fBankPath2 <=", value, "fbankpath2");
            return (Criteria) this;
        }

        public Criteria andFbankpath2Like(String value) {
            addCriterion("fBankPath2 like", value, "fbankpath2");
            return (Criteria) this;
        }

        public Criteria andFbankpath2NotLike(String value) {
            addCriterion("fBankPath2 not like", value, "fbankpath2");
            return (Criteria) this;
        }

        public Criteria andFbankpath2In(List<String> values) {
            addCriterion("fBankPath2 in", values, "fbankpath2");
            return (Criteria) this;
        }

        public Criteria andFbankpath2NotIn(List<String> values) {
            addCriterion("fBankPath2 not in", values, "fbankpath2");
            return (Criteria) this;
        }

        public Criteria andFbankpath2Between(String value1, String value2) {
            addCriterion("fBankPath2 between", value1, value2, "fbankpath2");
            return (Criteria) this;
        }

        public Criteria andFbankpath2NotBetween(String value1, String value2) {
            addCriterion("fBankPath2 not between", value1, value2, "fbankpath2");
            return (Criteria) this;
        }

        public Criteria andFbankpath3IsNull() {
            addCriterion("fBankPath3 is null");
            return (Criteria) this;
        }

        public Criteria andFbankpath3IsNotNull() {
            addCriterion("fBankPath3 is not null");
            return (Criteria) this;
        }

        public Criteria andFbankpath3EqualTo(String value) {
            addCriterion("fBankPath3 =", value, "fbankpath3");
            return (Criteria) this;
        }

        public Criteria andFbankpath3NotEqualTo(String value) {
            addCriterion("fBankPath3 <>", value, "fbankpath3");
            return (Criteria) this;
        }

        public Criteria andFbankpath3GreaterThan(String value) {
            addCriterion("fBankPath3 >", value, "fbankpath3");
            return (Criteria) this;
        }

        public Criteria andFbankpath3GreaterThanOrEqualTo(String value) {
            addCriterion("fBankPath3 >=", value, "fbankpath3");
            return (Criteria) this;
        }

        public Criteria andFbankpath3LessThan(String value) {
            addCriterion("fBankPath3 <", value, "fbankpath3");
            return (Criteria) this;
        }

        public Criteria andFbankpath3LessThanOrEqualTo(String value) {
            addCriterion("fBankPath3 <=", value, "fbankpath3");
            return (Criteria) this;
        }

        public Criteria andFbankpath3Like(String value) {
            addCriterion("fBankPath3 like", value, "fbankpath3");
            return (Criteria) this;
        }

        public Criteria andFbankpath3NotLike(String value) {
            addCriterion("fBankPath3 not like", value, "fbankpath3");
            return (Criteria) this;
        }

        public Criteria andFbankpath3In(List<String> values) {
            addCriterion("fBankPath3 in", values, "fbankpath3");
            return (Criteria) this;
        }

        public Criteria andFbankpath3NotIn(List<String> values) {
            addCriterion("fBankPath3 not in", values, "fbankpath3");
            return (Criteria) this;
        }

        public Criteria andFbankpath3Between(String value1, String value2) {
            addCriterion("fBankPath3 between", value1, value2, "fbankpath3");
            return (Criteria) this;
        }

        public Criteria andFbankpath3NotBetween(String value1, String value2) {
            addCriterion("fBankPath3 not between", value1, value2, "fbankpath3");
            return (Criteria) this;
        }

        public Criteria andAuthgradeIsNull() {
            addCriterion("authGrade is null");
            return (Criteria) this;
        }

        public Criteria andAuthgradeIsNotNull() {
            addCriterion("authGrade is not null");
            return (Criteria) this;
        }

        public Criteria andAuthgradeEqualTo(Integer value) {
            addCriterion("authGrade =", value, "authgrade");
            return (Criteria) this;
        }

        public Criteria andAuthgradeNotEqualTo(Integer value) {
            addCriterion("authGrade <>", value, "authgrade");
            return (Criteria) this;
        }

        public Criteria andAuthgradeGreaterThan(Integer value) {
            addCriterion("authGrade >", value, "authgrade");
            return (Criteria) this;
        }

        public Criteria andAuthgradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("authGrade >=", value, "authgrade");
            return (Criteria) this;
        }

        public Criteria andAuthgradeLessThan(Integer value) {
            addCriterion("authGrade <", value, "authgrade");
            return (Criteria) this;
        }

        public Criteria andAuthgradeLessThanOrEqualTo(Integer value) {
            addCriterion("authGrade <=", value, "authgrade");
            return (Criteria) this;
        }

        public Criteria andAuthgradeIn(List<Integer> values) {
            addCriterion("authGrade in", values, "authgrade");
            return (Criteria) this;
        }

        public Criteria andAuthgradeNotIn(List<Integer> values) {
            addCriterion("authGrade not in", values, "authgrade");
            return (Criteria) this;
        }

        public Criteria andAuthgradeBetween(Integer value1, Integer value2) {
            addCriterion("authGrade between", value1, value2, "authgrade");
            return (Criteria) this;
        }

        public Criteria andAuthgradeNotBetween(Integer value1, Integer value2) {
            addCriterion("authGrade not between", value1, value2, "authgrade");
            return (Criteria) this;
        }

        public Criteria andFhasbankvalidateIsNull() {
            addCriterion("fhasBankValidate is null");
            return (Criteria) this;
        }

        public Criteria andFhasbankvalidateIsNotNull() {
            addCriterion("fhasBankValidate is not null");
            return (Criteria) this;
        }

        public Criteria andFhasbankvalidateEqualTo(Byte value) {
            addCriterion("fhasBankValidate =", value, "fhasbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasbankvalidateNotEqualTo(Byte value) {
            addCriterion("fhasBankValidate <>", value, "fhasbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasbankvalidateGreaterThan(Byte value) {
            addCriterion("fhasBankValidate >", value, "fhasbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasbankvalidateGreaterThanOrEqualTo(Byte value) {
            addCriterion("fhasBankValidate >=", value, "fhasbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasbankvalidateLessThan(Byte value) {
            addCriterion("fhasBankValidate <", value, "fhasbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasbankvalidateLessThanOrEqualTo(Byte value) {
            addCriterion("fhasBankValidate <=", value, "fhasbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasbankvalidateIn(List<Byte> values) {
            addCriterion("fhasBankValidate in", values, "fhasbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasbankvalidateNotIn(List<Byte> values) {
            addCriterion("fhasBankValidate not in", values, "fhasbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasbankvalidateBetween(Byte value1, Byte value2) {
            addCriterion("fhasBankValidate between", value1, value2, "fhasbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFhasbankvalidateNotBetween(Byte value1, Byte value2) {
            addCriterion("fhasBankValidate not between", value1, value2, "fhasbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostbankvalidateIsNull() {
            addCriterion("fpostBankValidate is null");
            return (Criteria) this;
        }

        public Criteria andFpostbankvalidateIsNotNull() {
            addCriterion("fpostBankValidate is not null");
            return (Criteria) this;
        }

        public Criteria andFpostbankvalidateEqualTo(Byte value) {
            addCriterion("fpostBankValidate =", value, "fpostbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostbankvalidateNotEqualTo(Byte value) {
            addCriterion("fpostBankValidate <>", value, "fpostbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostbankvalidateGreaterThan(Byte value) {
            addCriterion("fpostBankValidate >", value, "fpostbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostbankvalidateGreaterThanOrEqualTo(Byte value) {
            addCriterion("fpostBankValidate >=", value, "fpostbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostbankvalidateLessThan(Byte value) {
            addCriterion("fpostBankValidate <", value, "fpostbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostbankvalidateLessThanOrEqualTo(Byte value) {
            addCriterion("fpostBankValidate <=", value, "fpostbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostbankvalidateIn(List<Byte> values) {
            addCriterion("fpostBankValidate in", values, "fpostbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostbankvalidateNotIn(List<Byte> values) {
            addCriterion("fpostBankValidate not in", values, "fpostbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostbankvalidateBetween(Byte value1, Byte value2) {
            addCriterion("fpostBankValidate between", value1, value2, "fpostbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFpostbankvalidateNotBetween(Byte value1, Byte value2) {
            addCriterion("fpostBankValidate not between", value1, value2, "fpostbankvalidate");
            return (Criteria) this;
        }

        public Criteria andFauditIsNull() {
            addCriterion("faudit is null");
            return (Criteria) this;
        }

        public Criteria andFauditIsNotNull() {
            addCriterion("faudit is not null");
            return (Criteria) this;
        }

        public Criteria andFauditEqualTo(Integer value) {
            addCriterion("faudit =", value, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditNotEqualTo(Integer value) {
            addCriterion("faudit <>", value, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditGreaterThan(Integer value) {
            addCriterion("faudit >", value, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditGreaterThanOrEqualTo(Integer value) {
            addCriterion("faudit >=", value, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditLessThan(Integer value) {
            addCriterion("faudit <", value, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditLessThanOrEqualTo(Integer value) {
            addCriterion("faudit <=", value, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditIn(List<Integer> values) {
            addCriterion("faudit in", values, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditNotIn(List<Integer> values) {
            addCriterion("faudit not in", values, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditBetween(Integer value1, Integer value2) {
            addCriterion("faudit between", value1, value2, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditNotBetween(Integer value1, Integer value2) {
            addCriterion("faudit not between", value1, value2, "faudit");
            return (Criteria) this;
        }

        public Criteria andFleaderidIsNull() {
            addCriterion("fleaderId is null");
            return (Criteria) this;
        }

        public Criteria andFleaderidIsNotNull() {
            addCriterion("fleaderId is not null");
            return (Criteria) this;
        }

        public Criteria andFleaderidEqualTo(Integer value) {
            addCriterion("fleaderId =", value, "fleaderid");
            return (Criteria) this;
        }

        public Criteria andFleaderidNotEqualTo(Integer value) {
            addCriterion("fleaderId <>", value, "fleaderid");
            return (Criteria) this;
        }

        public Criteria andFleaderidGreaterThan(Integer value) {
            addCriterion("fleaderId >", value, "fleaderid");
            return (Criteria) this;
        }

        public Criteria andFleaderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fleaderId >=", value, "fleaderid");
            return (Criteria) this;
        }

        public Criteria andFleaderidLessThan(Integer value) {
            addCriterion("fleaderId <", value, "fleaderid");
            return (Criteria) this;
        }

        public Criteria andFleaderidLessThanOrEqualTo(Integer value) {
            addCriterion("fleaderId <=", value, "fleaderid");
            return (Criteria) this;
        }

        public Criteria andFleaderidIn(List<Integer> values) {
            addCriterion("fleaderId in", values, "fleaderid");
            return (Criteria) this;
        }

        public Criteria andFleaderidNotIn(List<Integer> values) {
            addCriterion("fleaderId not in", values, "fleaderid");
            return (Criteria) this;
        }

        public Criteria andFleaderidBetween(Integer value1, Integer value2) {
            addCriterion("fleaderId between", value1, value2, "fleaderid");
            return (Criteria) this;
        }

        public Criteria andFleaderidNotBetween(Integer value1, Integer value2) {
            addCriterion("fleaderId not between", value1, value2, "fleaderid");
            return (Criteria) this;
        }

        public Criteria andFisversionIsNull() {
            addCriterion("fisversion is null");
            return (Criteria) this;
        }

        public Criteria andFisversionIsNotNull() {
            addCriterion("fisversion is not null");
            return (Criteria) this;
        }

        public Criteria andFisversionEqualTo(Boolean value) {
            addCriterion("fisversion =", value, "fisversion");
            return (Criteria) this;
        }

        public Criteria andFisversionNotEqualTo(Boolean value) {
            addCriterion("fisversion <>", value, "fisversion");
            return (Criteria) this;
        }

        public Criteria andFisversionGreaterThan(Boolean value) {
            addCriterion("fisversion >", value, "fisversion");
            return (Criteria) this;
        }

        public Criteria andFisversionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fisversion >=", value, "fisversion");
            return (Criteria) this;
        }

        public Criteria andFisversionLessThan(Boolean value) {
            addCriterion("fisversion <", value, "fisversion");
            return (Criteria) this;
        }

        public Criteria andFisversionLessThanOrEqualTo(Boolean value) {
            addCriterion("fisversion <=", value, "fisversion");
            return (Criteria) this;
        }

        public Criteria andFisversionIn(List<Boolean> values) {
            addCriterion("fisversion in", values, "fisversion");
            return (Criteria) this;
        }

        public Criteria andFisversionNotIn(List<Boolean> values) {
            addCriterion("fisversion not in", values, "fisversion");
            return (Criteria) this;
        }

        public Criteria andFisversionBetween(Boolean value1, Boolean value2) {
            addCriterion("fisversion between", value1, value2, "fisversion");
            return (Criteria) this;
        }

        public Criteria andFisversionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fisversion not between", value1, value2, "fisversion");
            return (Criteria) this;
        }

        public Criteria andFisleaderIsNull() {
            addCriterion("fisleader is null");
            return (Criteria) this;
        }

        public Criteria andFisleaderIsNotNull() {
            addCriterion("fisleader is not null");
            return (Criteria) this;
        }

        public Criteria andFisleaderEqualTo(Boolean value) {
            addCriterion("fisleader =", value, "fisleader");
            return (Criteria) this;
        }

        public Criteria andFisleaderNotEqualTo(Boolean value) {
            addCriterion("fisleader <>", value, "fisleader");
            return (Criteria) this;
        }

        public Criteria andFisleaderGreaterThan(Boolean value) {
            addCriterion("fisleader >", value, "fisleader");
            return (Criteria) this;
        }

        public Criteria andFisleaderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fisleader >=", value, "fisleader");
            return (Criteria) this;
        }

        public Criteria andFisleaderLessThan(Boolean value) {
            addCriterion("fisleader <", value, "fisleader");
            return (Criteria) this;
        }

        public Criteria andFisleaderLessThanOrEqualTo(Boolean value) {
            addCriterion("fisleader <=", value, "fisleader");
            return (Criteria) this;
        }

        public Criteria andFisleaderIn(List<Boolean> values) {
            addCriterion("fisleader in", values, "fisleader");
            return (Criteria) this;
        }

        public Criteria andFisleaderNotIn(List<Boolean> values) {
            addCriterion("fisleader not in", values, "fisleader");
            return (Criteria) this;
        }

        public Criteria andFisleaderBetween(Boolean value1, Boolean value2) {
            addCriterion("fisleader between", value1, value2, "fisleader");
            return (Criteria) this;
        }

        public Criteria andFisleaderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fisleader not between", value1, value2, "fisleader");
            return (Criteria) this;
        }

        public Criteria andFcanloginteammanagerIsNull() {
            addCriterion("fCanLoginTeamManager is null");
            return (Criteria) this;
        }

        public Criteria andFcanloginteammanagerIsNotNull() {
            addCriterion("fCanLoginTeamManager is not null");
            return (Criteria) this;
        }

        public Criteria andFcanloginteammanagerEqualTo(Boolean value) {
            addCriterion("fCanLoginTeamManager =", value, "fcanloginteammanager");
            return (Criteria) this;
        }

        public Criteria andFcanloginteammanagerNotEqualTo(Boolean value) {
            addCriterion("fCanLoginTeamManager <>", value, "fcanloginteammanager");
            return (Criteria) this;
        }

        public Criteria andFcanloginteammanagerGreaterThan(Boolean value) {
            addCriterion("fCanLoginTeamManager >", value, "fcanloginteammanager");
            return (Criteria) this;
        }

        public Criteria andFcanloginteammanagerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fCanLoginTeamManager >=", value, "fcanloginteammanager");
            return (Criteria) this;
        }

        public Criteria andFcanloginteammanagerLessThan(Boolean value) {
            addCriterion("fCanLoginTeamManager <", value, "fcanloginteammanager");
            return (Criteria) this;
        }

        public Criteria andFcanloginteammanagerLessThanOrEqualTo(Boolean value) {
            addCriterion("fCanLoginTeamManager <=", value, "fcanloginteammanager");
            return (Criteria) this;
        }

        public Criteria andFcanloginteammanagerIn(List<Boolean> values) {
            addCriterion("fCanLoginTeamManager in", values, "fcanloginteammanager");
            return (Criteria) this;
        }

        public Criteria andFcanloginteammanagerNotIn(List<Boolean> values) {
            addCriterion("fCanLoginTeamManager not in", values, "fcanloginteammanager");
            return (Criteria) this;
        }

        public Criteria andFcanloginteammanagerBetween(Boolean value1, Boolean value2) {
            addCriterion("fCanLoginTeamManager between", value1, value2, "fcanloginteammanager");
            return (Criteria) this;
        }

        public Criteria andFcanloginteammanagerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fCanLoginTeamManager not between", value1, value2, "fcanloginteammanager");
            return (Criteria) this;
        }

        public Criteria andFolduidIsNull() {
            addCriterion("folduid is null");
            return (Criteria) this;
        }

        public Criteria andFolduidIsNotNull() {
            addCriterion("folduid is not null");
            return (Criteria) this;
        }

        public Criteria andFolduidEqualTo(String value) {
            addCriterion("folduid =", value, "folduid");
            return (Criteria) this;
        }

        public Criteria andFolduidNotEqualTo(String value) {
            addCriterion("folduid <>", value, "folduid");
            return (Criteria) this;
        }

        public Criteria andFolduidGreaterThan(String value) {
            addCriterion("folduid >", value, "folduid");
            return (Criteria) this;
        }

        public Criteria andFolduidGreaterThanOrEqualTo(String value) {
            addCriterion("folduid >=", value, "folduid");
            return (Criteria) this;
        }

        public Criteria andFolduidLessThan(String value) {
            addCriterion("folduid <", value, "folduid");
            return (Criteria) this;
        }

        public Criteria andFolduidLessThanOrEqualTo(String value) {
            addCriterion("folduid <=", value, "folduid");
            return (Criteria) this;
        }

        public Criteria andFolduidLike(String value) {
            addCriterion("folduid like", value, "folduid");
            return (Criteria) this;
        }

        public Criteria andFolduidNotLike(String value) {
            addCriterion("folduid not like", value, "folduid");
            return (Criteria) this;
        }

        public Criteria andFolduidIn(List<String> values) {
            addCriterion("folduid in", values, "folduid");
            return (Criteria) this;
        }

        public Criteria andFolduidNotIn(List<String> values) {
            addCriterion("folduid not in", values, "folduid");
            return (Criteria) this;
        }

        public Criteria andFolduidBetween(String value1, String value2) {
            addCriterion("folduid between", value1, value2, "folduid");
            return (Criteria) this;
        }

        public Criteria andFolduidNotBetween(String value1, String value2) {
            addCriterion("folduid not between", value1, value2, "folduid");
            return (Criteria) this;
        }

        public Criteria andFintrouserIdIsNull() {
            addCriterion("fIntroUser_id is null");
            return (Criteria) this;
        }

        public Criteria andFintrouserIdIsNotNull() {
            addCriterion("fIntroUser_id is not null");
            return (Criteria) this;
        }

        public Criteria andFintrouserIdEqualTo(Integer value) {
            addCriterion("fIntroUser_id =", value, "fintrouserId");
            return (Criteria) this;
        }

        public Criteria andFintrouserIdNotEqualTo(Integer value) {
            addCriterion("fIntroUser_id <>", value, "fintrouserId");
            return (Criteria) this;
        }

        public Criteria andFintrouserIdGreaterThan(Integer value) {
            addCriterion("fIntroUser_id >", value, "fintrouserId");
            return (Criteria) this;
        }

        public Criteria andFintrouserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fIntroUser_id >=", value, "fintrouserId");
            return (Criteria) this;
        }

        public Criteria andFintrouserIdLessThan(Integer value) {
            addCriterion("fIntroUser_id <", value, "fintrouserId");
            return (Criteria) this;
        }

        public Criteria andFintrouserIdLessThanOrEqualTo(Integer value) {
            addCriterion("fIntroUser_id <=", value, "fintrouserId");
            return (Criteria) this;
        }

        public Criteria andFintrouserIdIn(List<Integer> values) {
            addCriterion("fIntroUser_id in", values, "fintrouserId");
            return (Criteria) this;
        }

        public Criteria andFintrouserIdNotIn(List<Integer> values) {
            addCriterion("fIntroUser_id not in", values, "fintrouserId");
            return (Criteria) this;
        }

        public Criteria andFintrouserIdBetween(Integer value1, Integer value2) {
            addCriterion("fIntroUser_id between", value1, value2, "fintrouserId");
            return (Criteria) this;
        }

        public Criteria andFintrouserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fIntroUser_id not between", value1, value2, "fintrouserId");
            return (Criteria) this;
        }

        public Criteria andFcoaleaderidIsNull() {
            addCriterion("fcoaleaderId is null");
            return (Criteria) this;
        }

        public Criteria andFcoaleaderidIsNotNull() {
            addCriterion("fcoaleaderId is not null");
            return (Criteria) this;
        }

        public Criteria andFcoaleaderidEqualTo(String value) {
            addCriterion("fcoaleaderId =", value, "fcoaleaderid");
            return (Criteria) this;
        }

        public Criteria andFcoaleaderidNotEqualTo(String value) {
            addCriterion("fcoaleaderId <>", value, "fcoaleaderid");
            return (Criteria) this;
        }

        public Criteria andFcoaleaderidGreaterThan(String value) {
            addCriterion("fcoaleaderId >", value, "fcoaleaderid");
            return (Criteria) this;
        }

        public Criteria andFcoaleaderidGreaterThanOrEqualTo(String value) {
            addCriterion("fcoaleaderId >=", value, "fcoaleaderid");
            return (Criteria) this;
        }

        public Criteria andFcoaleaderidLessThan(String value) {
            addCriterion("fcoaleaderId <", value, "fcoaleaderid");
            return (Criteria) this;
        }

        public Criteria andFcoaleaderidLessThanOrEqualTo(String value) {
            addCriterion("fcoaleaderId <=", value, "fcoaleaderid");
            return (Criteria) this;
        }

        public Criteria andFcoaleaderidLike(String value) {
            addCriterion("fcoaleaderId like", value, "fcoaleaderid");
            return (Criteria) this;
        }

        public Criteria andFcoaleaderidNotLike(String value) {
            addCriterion("fcoaleaderId not like", value, "fcoaleaderid");
            return (Criteria) this;
        }

        public Criteria andFcoaleaderidIn(List<String> values) {
            addCriterion("fcoaleaderId in", values, "fcoaleaderid");
            return (Criteria) this;
        }

        public Criteria andFcoaleaderidNotIn(List<String> values) {
            addCriterion("fcoaleaderId not in", values, "fcoaleaderid");
            return (Criteria) this;
        }

        public Criteria andFcoaleaderidBetween(String value1, String value2) {
            addCriterion("fcoaleaderId between", value1, value2, "fcoaleaderid");
            return (Criteria) this;
        }

        public Criteria andFcoaleaderidNotBetween(String value1, String value2) {
            addCriterion("fcoaleaderId not between", value1, value2, "fcoaleaderid");
            return (Criteria) this;
        }

        public Criteria andFinsertdataIsNull() {
            addCriterion("fInsertData is null");
            return (Criteria) this;
        }

        public Criteria andFinsertdataIsNotNull() {
            addCriterion("fInsertData is not null");
            return (Criteria) this;
        }

        public Criteria andFinsertdataEqualTo(Integer value) {
            addCriterion("fInsertData =", value, "finsertdata");
            return (Criteria) this;
        }

        public Criteria andFinsertdataNotEqualTo(Integer value) {
            addCriterion("fInsertData <>", value, "finsertdata");
            return (Criteria) this;
        }

        public Criteria andFinsertdataGreaterThan(Integer value) {
            addCriterion("fInsertData >", value, "finsertdata");
            return (Criteria) this;
        }

        public Criteria andFinsertdataGreaterThanOrEqualTo(Integer value) {
            addCriterion("fInsertData >=", value, "finsertdata");
            return (Criteria) this;
        }

        public Criteria andFinsertdataLessThan(Integer value) {
            addCriterion("fInsertData <", value, "finsertdata");
            return (Criteria) this;
        }

        public Criteria andFinsertdataLessThanOrEqualTo(Integer value) {
            addCriterion("fInsertData <=", value, "finsertdata");
            return (Criteria) this;
        }

        public Criteria andFinsertdataIn(List<Integer> values) {
            addCriterion("fInsertData in", values, "finsertdata");
            return (Criteria) this;
        }

        public Criteria andFinsertdataNotIn(List<Integer> values) {
            addCriterion("fInsertData not in", values, "finsertdata");
            return (Criteria) this;
        }

        public Criteria andFinsertdataBetween(Integer value1, Integer value2) {
            addCriterion("fInsertData between", value1, value2, "finsertdata");
            return (Criteria) this;
        }

        public Criteria andFinsertdataNotBetween(Integer value1, Integer value2) {
            addCriterion("fInsertData not between", value1, value2, "finsertdata");
            return (Criteria) this;
        }

        public Criteria andFinsertpwdIsNull() {
            addCriterion("fInsertpwd is null");
            return (Criteria) this;
        }

        public Criteria andFinsertpwdIsNotNull() {
            addCriterion("fInsertpwd is not null");
            return (Criteria) this;
        }

        public Criteria andFinsertpwdEqualTo(Integer value) {
            addCriterion("fInsertpwd =", value, "finsertpwd");
            return (Criteria) this;
        }

        public Criteria andFinsertpwdNotEqualTo(Integer value) {
            addCriterion("fInsertpwd <>", value, "finsertpwd");
            return (Criteria) this;
        }

        public Criteria andFinsertpwdGreaterThan(Integer value) {
            addCriterion("fInsertpwd >", value, "finsertpwd");
            return (Criteria) this;
        }

        public Criteria andFinsertpwdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fInsertpwd >=", value, "finsertpwd");
            return (Criteria) this;
        }

        public Criteria andFinsertpwdLessThan(Integer value) {
            addCriterion("fInsertpwd <", value, "finsertpwd");
            return (Criteria) this;
        }

        public Criteria andFinsertpwdLessThanOrEqualTo(Integer value) {
            addCriterion("fInsertpwd <=", value, "finsertpwd");
            return (Criteria) this;
        }

        public Criteria andFinsertpwdIn(List<Integer> values) {
            addCriterion("fInsertpwd in", values, "finsertpwd");
            return (Criteria) this;
        }

        public Criteria andFinsertpwdNotIn(List<Integer> values) {
            addCriterion("fInsertpwd not in", values, "finsertpwd");
            return (Criteria) this;
        }

        public Criteria andFinsertpwdBetween(Integer value1, Integer value2) {
            addCriterion("fInsertpwd between", value1, value2, "finsertpwd");
            return (Criteria) this;
        }

        public Criteria andFinsertpwdNotBetween(Integer value1, Integer value2) {
            addCriterion("fInsertpwd not between", value1, value2, "finsertpwd");
            return (Criteria) this;
        }

        public Criteria andFisadvertiseIsNull() {
            addCriterion("fisadvertise is null");
            return (Criteria) this;
        }

        public Criteria andFisadvertiseIsNotNull() {
            addCriterion("fisadvertise is not null");
            return (Criteria) this;
        }

        public Criteria andFisadvertiseEqualTo(Byte value) {
            addCriterion("fisadvertise =", value, "fisadvertise");
            return (Criteria) this;
        }

        public Criteria andFisadvertiseNotEqualTo(Byte value) {
            addCriterion("fisadvertise <>", value, "fisadvertise");
            return (Criteria) this;
        }

        public Criteria andFisadvertiseGreaterThan(Byte value) {
            addCriterion("fisadvertise >", value, "fisadvertise");
            return (Criteria) this;
        }

        public Criteria andFisadvertiseGreaterThanOrEqualTo(Byte value) {
            addCriterion("fisadvertise >=", value, "fisadvertise");
            return (Criteria) this;
        }

        public Criteria andFisadvertiseLessThan(Byte value) {
            addCriterion("fisadvertise <", value, "fisadvertise");
            return (Criteria) this;
        }

        public Criteria andFisadvertiseLessThanOrEqualTo(Byte value) {
            addCriterion("fisadvertise <=", value, "fisadvertise");
            return (Criteria) this;
        }

        public Criteria andFisadvertiseIn(List<Byte> values) {
            addCriterion("fisadvertise in", values, "fisadvertise");
            return (Criteria) this;
        }

        public Criteria andFisadvertiseNotIn(List<Byte> values) {
            addCriterion("fisadvertise not in", values, "fisadvertise");
            return (Criteria) this;
        }

        public Criteria andFisadvertiseBetween(Byte value1, Byte value2) {
            addCriterion("fisadvertise between", value1, value2, "fisadvertise");
            return (Criteria) this;
        }

        public Criteria andFisadvertiseNotBetween(Byte value1, Byte value2) {
            addCriterion("fisadvertise not between", value1, value2, "fisadvertise");
            return (Criteria) this;
        }

        public Criteria andLayerIsNull() {
            addCriterion("Layer_ is null");
            return (Criteria) this;
        }

        public Criteria andLayerIsNotNull() {
            addCriterion("Layer_ is not null");
            return (Criteria) this;
        }

        public Criteria andLayerEqualTo(Integer value) {
            addCriterion("Layer_ =", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotEqualTo(Integer value) {
            addCriterion("Layer_ <>", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerGreaterThan(Integer value) {
            addCriterion("Layer_ >", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerGreaterThanOrEqualTo(Integer value) {
            addCriterion("Layer_ >=", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerLessThan(Integer value) {
            addCriterion("Layer_ <", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerLessThanOrEqualTo(Integer value) {
            addCriterion("Layer_ <=", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerIn(List<Integer> values) {
            addCriterion("Layer_ in", values, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotIn(List<Integer> values) {
            addCriterion("Layer_ not in", values, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerBetween(Integer value1, Integer value2) {
            addCriterion("Layer_ between", value1, value2, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotBetween(Integer value1, Integer value2) {
            addCriterion("Layer_ not between", value1, value2, "layer");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level_ is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level_ is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level_ =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level_ <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level_ >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level_ >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level_ <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level_ <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level_ in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level_ not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level_ between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level_ not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andFrewardedinviterIsNull() {
            addCriterion("fRewardedInviter is null");
            return (Criteria) this;
        }

        public Criteria andFrewardedinviterIsNotNull() {
            addCriterion("fRewardedInviter is not null");
            return (Criteria) this;
        }

        public Criteria andFrewardedinviterEqualTo(Integer value) {
            addCriterion("fRewardedInviter =", value, "frewardedinviter");
            return (Criteria) this;
        }

        public Criteria andFrewardedinviterNotEqualTo(Integer value) {
            addCriterion("fRewardedInviter <>", value, "frewardedinviter");
            return (Criteria) this;
        }

        public Criteria andFrewardedinviterGreaterThan(Integer value) {
            addCriterion("fRewardedInviter >", value, "frewardedinviter");
            return (Criteria) this;
        }

        public Criteria andFrewardedinviterGreaterThanOrEqualTo(Integer value) {
            addCriterion("fRewardedInviter >=", value, "frewardedinviter");
            return (Criteria) this;
        }

        public Criteria andFrewardedinviterLessThan(Integer value) {
            addCriterion("fRewardedInviter <", value, "frewardedinviter");
            return (Criteria) this;
        }

        public Criteria andFrewardedinviterLessThanOrEqualTo(Integer value) {
            addCriterion("fRewardedInviter <=", value, "frewardedinviter");
            return (Criteria) this;
        }

        public Criteria andFrewardedinviterIn(List<Integer> values) {
            addCriterion("fRewardedInviter in", values, "frewardedinviter");
            return (Criteria) this;
        }

        public Criteria andFrewardedinviterNotIn(List<Integer> values) {
            addCriterion("fRewardedInviter not in", values, "frewardedinviter");
            return (Criteria) this;
        }

        public Criteria andFrewardedinviterBetween(Integer value1, Integer value2) {
            addCriterion("fRewardedInviter between", value1, value2, "frewardedinviter");
            return (Criteria) this;
        }

        public Criteria andFrewardedinviterNotBetween(Integer value1, Integer value2) {
            addCriterion("fRewardedInviter not between", value1, value2, "frewardedinviter");
            return (Criteria) this;
        }

        public Criteria andFisearlywarningIsNull() {
            addCriterion("fisEarlyWarning is null");
            return (Criteria) this;
        }

        public Criteria andFisearlywarningIsNotNull() {
            addCriterion("fisEarlyWarning is not null");
            return (Criteria) this;
        }

        public Criteria andFisearlywarningEqualTo(Boolean value) {
            addCriterion("fisEarlyWarning =", value, "fisearlywarning");
            return (Criteria) this;
        }

        public Criteria andFisearlywarningNotEqualTo(Boolean value) {
            addCriterion("fisEarlyWarning <>", value, "fisearlywarning");
            return (Criteria) this;
        }

        public Criteria andFisearlywarningGreaterThan(Boolean value) {
            addCriterion("fisEarlyWarning >", value, "fisearlywarning");
            return (Criteria) this;
        }

        public Criteria andFisearlywarningGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fisEarlyWarning >=", value, "fisearlywarning");
            return (Criteria) this;
        }

        public Criteria andFisearlywarningLessThan(Boolean value) {
            addCriterion("fisEarlyWarning <", value, "fisearlywarning");
            return (Criteria) this;
        }

        public Criteria andFisearlywarningLessThanOrEqualTo(Boolean value) {
            addCriterion("fisEarlyWarning <=", value, "fisearlywarning");
            return (Criteria) this;
        }

        public Criteria andFisearlywarningIn(List<Boolean> values) {
            addCriterion("fisEarlyWarning in", values, "fisearlywarning");
            return (Criteria) this;
        }

        public Criteria andFisearlywarningNotIn(List<Boolean> values) {
            addCriterion("fisEarlyWarning not in", values, "fisearlywarning");
            return (Criteria) this;
        }

        public Criteria andFisearlywarningBetween(Boolean value1, Boolean value2) {
            addCriterion("fisEarlyWarning between", value1, value2, "fisearlywarning");
            return (Criteria) this;
        }

        public Criteria andFisearlywarningNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fisEarlyWarning not between", value1, value2, "fisearlywarning");
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