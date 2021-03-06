package mystical.cup.model.database;

import java.util.Date;

public class HttpProducerDataMode{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column http_producer_data.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column http_producer_data.req_job_id
     *
     * @mbggenerated
     */
    private Integer reqJobId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column http_producer_data.req_url
     *
     * @mbggenerated
     */
    private String reqUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column http_producer_data.req_param
     *
     * @mbggenerated
     */
    private String reqParam;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column http_producer_data.resp_param
     *
     * @mbggenerated
     */
    private String respParam;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column http_producer_data.req_time
     *
     * @mbggenerated
     */
    private String reqTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column http_producer_data.resp_time
     *
     * @mbggenerated
     */
    private String respTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column http_producer_data.error_code
     *
     * @mbggenerated
     */
    private String errorCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column http_producer_data.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column http_producer_data.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column http_producer_data.id
     *
     * @return the value of http_producer_data.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column http_producer_data.id
     *
     * @param id the value for http_producer_data.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column http_producer_data.req_job_id
     *
     * @return the value of http_producer_data.req_job_id
     *
     * @mbggenerated
     */
    public Integer getReqJobId() {
        return reqJobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column http_producer_data.req_job_id
     *
     * @param reqJobId the value for http_producer_data.req_job_id
     *
     * @mbggenerated
     */
    public void setReqJobId(Integer reqJobId) {
        this.reqJobId = reqJobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column http_producer_data.req_url
     *
     * @return the value of http_producer_data.req_url
     *
     * @mbggenerated
     */
    public String getReqUrl() {
        return reqUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column http_producer_data.req_url
     *
     * @param reqUrl the value for http_producer_data.req_url
     *
     * @mbggenerated
     */
    public void setReqUrl(String reqUrl) {
        this.reqUrl = reqUrl == null ? null : reqUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column http_producer_data.req_param
     *
     * @return the value of http_producer_data.req_param
     *
     * @mbggenerated
     */
    public String getReqParam() {
        return reqParam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column http_producer_data.req_param
     *
     * @param reqParam the value for http_producer_data.req_param
     *
     * @mbggenerated
     */
    public void setReqParam(String reqParam) {
        this.reqParam = reqParam == null ? null : reqParam.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column http_producer_data.resp_param
     *
     * @return the value of http_producer_data.resp_param
     *
     * @mbggenerated
     */
    public String getRespParam() {
        return respParam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column http_producer_data.resp_param
     *
     * @param respParam the value for http_producer_data.resp_param
     *
     * @mbggenerated
     */
    public void setRespParam(String respParam) {
        this.respParam = respParam == null ? null : respParam.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column http_producer_data.req_time
     *
     * @return the value of http_producer_data.req_time
     *
     * @mbggenerated
     */
    public String getReqTime() {
        return reqTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column http_producer_data.req_time
     *
     * @param reqTime the value for http_producer_data.req_time
     *
     * @mbggenerated
     */
    public void setReqTime(String reqTime) {
        this.reqTime = reqTime == null ? null : reqTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column http_producer_data.resp_time
     *
     * @return the value of http_producer_data.resp_time
     *
     * @mbggenerated
     */
    public String getRespTime() {
        return respTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column http_producer_data.resp_time
     *
     * @param respTime the value for http_producer_data.resp_time
     *
     * @mbggenerated
     */
    public void setRespTime(String respTime) {
        this.respTime = respTime == null ? null : respTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column http_producer_data.error_code
     *
     * @return the value of http_producer_data.error_code
     *
     * @mbggenerated
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column http_producer_data.error_code
     *
     * @param errorCode the value for http_producer_data.error_code
     *
     * @mbggenerated
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column http_producer_data.create_time
     *
     * @return the value of http_producer_data.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column http_producer_data.create_time
     *
     * @param createTime the value for http_producer_data.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column http_producer_data.update_time
     *
     * @return the value of http_producer_data.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column http_producer_data.update_time
     *
     * @param updateTime the value for http_producer_data.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}