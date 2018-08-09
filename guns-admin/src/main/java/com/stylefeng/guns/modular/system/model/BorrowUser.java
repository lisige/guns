package com.stylefeng.guns.modular.system.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lisige
 * @since 2018-08-09
 */
@TableName("borrow_user")
public class BorrowUser extends Model<BorrowUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 序列号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户名
     */
    private String userAccount;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 交易密码
     */
    private String transactionPassword;
    /**
     * 用户手机号码
     */
    private String userPhone;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 用户身份证号
     */
    private String userCardNo;
    /**
     * 学历
     */
    private Integer userEducation;
    /**
     * 婚姻状态(1:已婚，0：未婚)
     */
    private Integer userMarriage;
    /**
     * 省
     */
    private String userProvince;
    /**
     * 市
     */
    private String userCity;
    /**
     * 区
     */
    private String userArea;
    /**
     * 用户详细地址
     */
    private String userAddress;
    /**
     * 居住时长
     */
    private Integer lengthOfStay;
    /**
     * 是否黑名单（1:是，0：否）
     */
    private Integer isBlack;
    /**
     * 是否实名认证（1：是，0：否）
     */
    private Integer isVerified;
    /**
     * 实名认证时间
     */
    private Date verifiedTime;
    /**
     * 银行卡号
     */
    private String cardCode;
    /**
     * 所属银行
     */
    private Integer cardType;
    /**
     * 银行卡预留手机号
     */
    private String cardPhone;
    /**
     * 是否提交了通讯录（1：是，0：否）
     */
    private Integer isPhone;
    /**
     * 提交通讯录时间
     */
    private Date phoneTime;
    /**
     * 是否绑定银行卡（1：是，0：否）
     */
    private Integer isCard;
    /**
     * 绑卡时间
     */
    private Date cardTime;
    /**
     * 运营商服务器密码
     */
    private String operatorPassword;
    /**
     * 运营商认证（1：是，0：否）
     */
    private Integer isOperator;
    /**
     * 运营商认证时间
     */
    private Date operatorTime;
    /**
     * 添加时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 人脸照片地址
     */
    private String humanFaceImg;
    /**
     * 图片外部访问路径
     */
    private String humanFaceImgUrl;
    /**
     * 身份证正面照片
     */
    private String cardPositiveImg;
    /**
     * 身份证正面图片外部访问地址
     */
    private String cardPositiveImgUrl;
    /**
     * 身份证反面图片
     */
    private String cardAntiImg;
    /**
     * 身份证反面图片外部访问地址
     */
    private String cardAntiImgUrl;
    /**
     * 风控评估（1：通过，0：不通过，2：评估中）
     */
    private Integer isWindControl;
    /**
     * 是否有有效（0：有效，1：无效）
     */
    private Integer status;
    /**
     * 渠道id
     */
    private Integer channelId;
    /**
     * 是否芝麻授权（1：是，0：否）
     */
    private Integer isZhima;
    /**
     * 芝麻分
     */
    private String zhimaScore;
    /**
     * 最近一次芝麻认证时间
     */
    private Date zmAuthTime;
    /**
     * 是否老用户 0否 1是
     */
    private Integer isOld;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getTransactionPassword() {
        return transactionPassword;
    }

    public void setTransactionPassword(String transactionPassword) {
        this.transactionPassword = transactionPassword;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCardNo() {
        return userCardNo;
    }

    public void setUserCardNo(String userCardNo) {
        this.userCardNo = userCardNo;
    }

    public Integer getUserEducation() {
        return userEducation;
    }

    public void setUserEducation(Integer userEducation) {
        this.userEducation = userEducation;
    }

    public Integer getUserMarriage() {
        return userMarriage;
    }

    public void setUserMarriage(Integer userMarriage) {
        this.userMarriage = userMarriage;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserArea() {
        return userArea;
    }

    public void setUserArea(String userArea) {
        this.userArea = userArea;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(Integer lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    public Integer getIsBlack() {
        return isBlack;
    }

    public void setIsBlack(Integer isBlack) {
        this.isBlack = isBlack;
    }

    public Integer getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Integer isVerified) {
        this.isVerified = isVerified;
    }

    public Date getVerifiedTime() {
        return verifiedTime;
    }

    public void setVerifiedTime(Date verifiedTime) {
        this.verifiedTime = verifiedTime;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getCardPhone() {
        return cardPhone;
    }

    public void setCardPhone(String cardPhone) {
        this.cardPhone = cardPhone;
    }

    public Integer getIsPhone() {
        return isPhone;
    }

    public void setIsPhone(Integer isPhone) {
        this.isPhone = isPhone;
    }

    public Date getPhoneTime() {
        return phoneTime;
    }

    public void setPhoneTime(Date phoneTime) {
        this.phoneTime = phoneTime;
    }

    public Integer getIsCard() {
        return isCard;
    }

    public void setIsCard(Integer isCard) {
        this.isCard = isCard;
    }

    public Date getCardTime() {
        return cardTime;
    }

    public void setCardTime(Date cardTime) {
        this.cardTime = cardTime;
    }

    public String getOperatorPassword() {
        return operatorPassword;
    }

    public void setOperatorPassword(String operatorPassword) {
        this.operatorPassword = operatorPassword;
    }

    public Integer getIsOperator() {
        return isOperator;
    }

    public void setIsOperator(Integer isOperator) {
        this.isOperator = isOperator;
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getHumanFaceImg() {
        return humanFaceImg;
    }

    public void setHumanFaceImg(String humanFaceImg) {
        this.humanFaceImg = humanFaceImg;
    }

    public String getHumanFaceImgUrl() {
        return humanFaceImgUrl;
    }

    public void setHumanFaceImgUrl(String humanFaceImgUrl) {
        this.humanFaceImgUrl = humanFaceImgUrl;
    }

    public String getCardPositiveImg() {
        return cardPositiveImg;
    }

    public void setCardPositiveImg(String cardPositiveImg) {
        this.cardPositiveImg = cardPositiveImg;
    }

    public String getCardPositiveImgUrl() {
        return cardPositiveImgUrl;
    }

    public void setCardPositiveImgUrl(String cardPositiveImgUrl) {
        this.cardPositiveImgUrl = cardPositiveImgUrl;
    }

    public String getCardAntiImg() {
        return cardAntiImg;
    }

    public void setCardAntiImg(String cardAntiImg) {
        this.cardAntiImg = cardAntiImg;
    }

    public String getCardAntiImgUrl() {
        return cardAntiImgUrl;
    }

    public void setCardAntiImgUrl(String cardAntiImgUrl) {
        this.cardAntiImgUrl = cardAntiImgUrl;
    }

    public Integer getIsWindControl() {
        return isWindControl;
    }

    public void setIsWindControl(Integer isWindControl) {
        this.isWindControl = isWindControl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getIsZhima() {
        return isZhima;
    }

    public void setIsZhima(Integer isZhima) {
        this.isZhima = isZhima;
    }

    public String getZhimaScore() {
        return zhimaScore;
    }

    public void setZhimaScore(String zhimaScore) {
        this.zhimaScore = zhimaScore;
    }

    public Date getZmAuthTime() {
        return zmAuthTime;
    }

    public void setZmAuthTime(Date zmAuthTime) {
        this.zmAuthTime = zmAuthTime;
    }

    public Integer getIsOld() {
        return isOld;
    }

    public void setIsOld(Integer isOld) {
        this.isOld = isOld;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BorrowUser{" +
        "id=" + id +
        ", userAccount=" + userAccount +
        ", userPassword=" + userPassword +
        ", transactionPassword=" + transactionPassword +
        ", userPhone=" + userPhone +
        ", userName=" + userName +
        ", userCardNo=" + userCardNo +
        ", userEducation=" + userEducation +
        ", userMarriage=" + userMarriage +
        ", userProvince=" + userProvince +
        ", userCity=" + userCity +
        ", userArea=" + userArea +
        ", userAddress=" + userAddress +
        ", lengthOfStay=" + lengthOfStay +
        ", isBlack=" + isBlack +
        ", isVerified=" + isVerified +
        ", verifiedTime=" + verifiedTime +
        ", cardCode=" + cardCode +
        ", cardType=" + cardType +
        ", cardPhone=" + cardPhone +
        ", isPhone=" + isPhone +
        ", phoneTime=" + phoneTime +
        ", isCard=" + isCard +
        ", cardTime=" + cardTime +
        ", operatorPassword=" + operatorPassword +
        ", isOperator=" + isOperator +
        ", operatorTime=" + operatorTime +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", humanFaceImg=" + humanFaceImg +
        ", humanFaceImgUrl=" + humanFaceImgUrl +
        ", cardPositiveImg=" + cardPositiveImg +
        ", cardPositiveImgUrl=" + cardPositiveImgUrl +
        ", cardAntiImg=" + cardAntiImg +
        ", cardAntiImgUrl=" + cardAntiImgUrl +
        ", isWindControl=" + isWindControl +
        ", status=" + status +
        ", channelId=" + channelId +
        ", isZhima=" + isZhima +
        ", zhimaScore=" + zhimaScore +
        ", zmAuthTime=" + zmAuthTime +
        ", isOld=" + isOld +
        "}";
    }
}
