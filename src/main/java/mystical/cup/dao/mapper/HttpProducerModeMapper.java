package mystical.cup.dao.mapper;

import java.util.List;
import mystical.cup.model.database.HttpProducerMode;
import mystical.cup.model.database.HttpProducerModeExample;
import org.apache.ibatis.annotations.Param;

public interface HttpProducerModeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table http_producer
     *
     * @mbggenerated
     */
    int countByExample(HttpProducerModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table http_producer
     *
     * @mbggenerated
     */
    int deleteByExample(HttpProducerModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table http_producer
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table http_producer
     *
     * @mbggenerated
     */
    int insert(HttpProducerMode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table http_producer
     *
     * @mbggenerated
     */
    int insertSelective(HttpProducerMode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table http_producer
     *
     * @mbggenerated
     */
    List<HttpProducerMode> selectByExample(HttpProducerModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table http_producer
     *
     * @mbggenerated
     */
    HttpProducerMode selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table http_producer
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") HttpProducerMode record, @Param("example") HttpProducerModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table http_producer
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") HttpProducerMode record, @Param("example") HttpProducerModeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table http_producer
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(HttpProducerMode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table http_producer
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(HttpProducerMode record);
}