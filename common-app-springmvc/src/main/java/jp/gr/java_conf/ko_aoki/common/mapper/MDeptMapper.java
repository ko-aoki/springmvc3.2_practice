package jp.gr.java_conf.ko_aoki.common.mapper;

import java.util.List;
import java.util.Map;

import jp.gr.java_conf.ko_aoki.common.bean.code.CodeDeptBean;
import jp.gr.java_conf.ko_aoki.common.domain.MDept;
import jp.gr.java_conf.ko_aoki.common.domain.MDeptExample;
import jp.gr.java_conf.ko_aoki.common.domain.MDeptKey;

import org.apache.ibatis.annotations.Param;

public interface MDeptMapper {

	int selectCountLevel1to2Dept(Map<String,Object> prm);
	List<CodeDeptBean> selectLevel1to2DeptList(Map<String,Object> prm);

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SADB.M_DEPT
     *
     * @mbggenerated Wed Dec 11 22:21:06 JST 2013
     */
    int countByExample(MDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SADB.M_DEPT
     *
     * @mbggenerated Wed Dec 11 22:21:06 JST 2013
     */
    int deleteByExample(MDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SADB.M_DEPT
     *
     * @mbggenerated Wed Dec 11 22:21:06 JST 2013
     */
    int deleteByPrimaryKey(MDeptKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SADB.M_DEPT
     *
     * @mbggenerated Wed Dec 11 22:21:06 JST 2013
     */
    int insert(MDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SADB.M_DEPT
     *
     * @mbggenerated Wed Dec 11 22:21:06 JST 2013
     */
    int insertSelective(MDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SADB.M_DEPT
     *
     * @mbggenerated Wed Dec 11 22:21:06 JST 2013
     */
    List<MDept> selectByExample(MDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SADB.M_DEPT
     *
     * @mbggenerated Wed Dec 11 22:21:06 JST 2013
     */
    MDept selectByPrimaryKey(MDeptKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SADB.M_DEPT
     *
     * @mbggenerated Wed Dec 11 22:21:06 JST 2013
     */
    int updateByExampleSelective(@Param("record") MDept record, @Param("example") MDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SADB.M_DEPT
     *
     * @mbggenerated Wed Dec 11 22:21:06 JST 2013
     */
    int updateByExample(@Param("record") MDept record, @Param("example") MDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SADB.M_DEPT
     *
     * @mbggenerated Wed Dec 11 22:21:06 JST 2013
     */
    int updateByPrimaryKeySelective(MDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SADB.M_DEPT
     *
     * @mbggenerated Wed Dec 11 22:21:06 JST 2013
     */
    int updateByPrimaryKey(MDept record);
}