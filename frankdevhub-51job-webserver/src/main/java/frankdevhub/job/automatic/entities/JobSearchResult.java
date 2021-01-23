package frankdevhub.job.automatic.entities;

/**
 * <p>Title:@ClassName JobSearchResult.java</p>
 * <p>Description: 职位列表信息对象</p>
 * <p>Copyright: Copyright (c) 2020</p>
 * <p>Company: www.frankdevhub.site</p>
 * <p>github: https://github.com/frankdevhub</p>
 *
 * @Author: frankdevhub@gmail.com
 * @CreateDate: 2020/1/26 22:24
 * @Version: 1.0
 */
@SuppressWarnings("all")
public class JobSearchResult extends BaseRecord<JobSearchResult> {
    /**
     * 职位名称
     */
    private String jobTitle;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 职位地点
     */
    private String location;

    /**
     * 薪资描述原文字符串
     */
    private String salaryRangeChars;

    /**
     * 薪资最小值
     */
    private Double salaryRangeMin;

    /**
     * 薪资最大值
     */
    private Double salaryRangeMax;

    /**
     * 薪资时间计量单位
     */
    private String salaryTimeUnit;

    /**
     * 薪资计量单位
     */
    private String salaryNumericUnit;

    /**
     * 是否以万计量
     */
    private Boolean isDefineByW;

    /**
     * 是否以千计量
     */
    private Boolean isDefineByK;

    /**
     * 是否按日计量
     */
    private Boolean isDefineByDay;

    /**
     * 是否月薪计量
     */
    private Boolean isDefineByMonth;

    /**
     * 是否年薪计量
     */
    private Boolean isDefineByYear;

    /**
     * 是否内推职位
     */
    private Boolean isInternshipPos;

    /**
     * 是否校招职位
     */
    private Boolean isCampusOnly;

    /**
     * 薪资是否可商议
     */
    private Boolean isSalaryNegotiable;

    /**
     * 发布日期
     */
    private String publishDateChar;

    /**
     * 发布月份（月）
     */
    private Integer publishDateMonthNumeric;

    /**
     * 发布日期（天）
     */
    private Integer publishDateDayNumeric;

    /**
     * 职位链接地址
     */
    private String linkUrl;

    private Integer markId;

    public String getJobTitle() {
        return jobTitle;
    }

    public JobSearchResult setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public JobSearchResult setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public JobSearchResult setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getSalaryRangeChars() {
        return salaryRangeChars;
    }

    public JobSearchResult setSalaryRangeChars(String salaryRangeChars) {
        this.salaryRangeChars = salaryRangeChars;
        return this;
    }

    public Double getSalaryRangeMin() {
        return salaryRangeMin;
    }

    public JobSearchResult setSalaryRangeMin(Double salaryRangeMin) {
        this.salaryRangeMin = salaryRangeMin;
        return this;
    }

    public Double getSalaryRangeMax() {
        return salaryRangeMax;
    }

    public JobSearchResult setSalaryRangeMax(Double salaryRangeMax) {
        this.salaryRangeMax = salaryRangeMax;
        return this;
    }

    public String getSalaryTimeUnit() {
        return salaryTimeUnit;
    }

    public JobSearchResult setSalaryTimeUnit(String salaryTimeUnit) {
        this.salaryTimeUnit = salaryTimeUnit;
        return this;
    }

    public String getSalaryNumericUnit() {
        return salaryNumericUnit;
    }

    public JobSearchResult setSalaryNumericUnit(String salaryNumericUnit) {
        this.salaryNumericUnit = salaryNumericUnit;
        return this;
    }

    public Boolean getIsDefineByW() {
        return isDefineByW;
    }

    public JobSearchResult setIsDefineByW(Boolean isDefineByW) {
        this.isDefineByW = isDefineByW;
        return this;
    }

    public Boolean getIsDefineByK() {
        return isDefineByK;
    }

    public JobSearchResult setIsDefineByK(Boolean isDefineByK) {
        this.isDefineByK = isDefineByK;
        return this;
    }

    public Boolean getIsDefineByDay() {
        return isDefineByDay;
    }

    public JobSearchResult setIsDefineByDay(Boolean isDefineByDay) {
        this.isDefineByDay = isDefineByDay;
        return this;
    }

    public Boolean getIsDefineByMonth() {
        return isDefineByMonth;
    }

    public JobSearchResult setIsDefineByMonth(Boolean isDefineByMonth) {
        this.isDefineByMonth = isDefineByMonth;
        return this;
    }

    public Boolean getIsDefineByYear() {
        return isDefineByYear;
    }

    public JobSearchResult setIsDefineByYear(Boolean isDefineByYear) {
        this.isDefineByYear = isDefineByYear;
        return this;
    }

    public Boolean getIsInternshipPos() {
        return isInternshipPos;
    }

    public JobSearchResult setIsInternshipPos(Boolean isInternshipPos) {
        this.isInternshipPos = isInternshipPos;
        return this;
    }

    public Boolean getIsCampusOnly() {
        return isCampusOnly;
    }

    public JobSearchResult setIsCampusOnly(Boolean isCampusOnly) {
        this.isCampusOnly = isCampusOnly;
        return this;
    }

    public Boolean getIsSalaryNegotiable() {
        return isSalaryNegotiable;
    }

    public JobSearchResult setIsSalaryNegotiable(Boolean isSalaryNegotiable) {
        this.isSalaryNegotiable = isSalaryNegotiable;
        return this;
    }

    public String getPublishDateChar() {
        return publishDateChar;
    }

    public JobSearchResult setPublishDateChar(String publishDateChar) {
        this.publishDateChar = publishDateChar;
        return this;
    }

    public Integer getPublishDateMonthNumeric() {
        return publishDateMonthNumeric;
    }

    public JobSearchResult setPublishDateMonthNumeric(Integer publishDateMonthNumeric) {
        this.publishDateMonthNumeric = publishDateMonthNumeric;
        return this;
    }

    public Integer getPublishDateDayNumeric() {
        return publishDateDayNumeric;
    }

    public JobSearchResult setPublishDateDayNumeric(Integer publishDateDayNumeric) {
        this.publishDateDayNumeric = publishDateDayNumeric;
        return this;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public JobSearchResult setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
        return this;
    }

    public Integer getMarkId() {
        return markId;
    }

    public JobSearchResult setMarkId(Integer markId) {
        this.markId = markId;
        return this;
    }
}
