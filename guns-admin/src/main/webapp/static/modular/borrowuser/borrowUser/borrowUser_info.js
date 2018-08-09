/**
 * 初始化前台用户列表详情对话框
 */
var BorrowUserInfoDlg = {
    borrowUserInfoData : {}
};

/**
 * 清除数据
 */
BorrowUserInfoDlg.clearData = function() {
    this.borrowUserInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
BorrowUserInfoDlg.set = function(key, val) {
    this.borrowUserInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
BorrowUserInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
BorrowUserInfoDlg.close = function() {
    parent.layer.close(window.parent.BorrowUser.layerIndex);
}

/**
 * 收集数据
 */
BorrowUserInfoDlg.collectData = function() {
    this
    .set('id')
    .set('userAccount')
    .set('userPassword')
    .set('transactionPassword')
    .set('userPhone')
    .set('userName')
    .set('userCardNo')
    .set('userEducation')
    .set('userMarriage')
    .set('userProvince')
    .set('userCity')
    .set('userArea')
    .set('userAddress')
    .set('lengthOfStay')
    .set('isBlack')
    .set('isVerified')
    .set('verifiedTime')
    .set('cardCode')
    .set('cardType')
    .set('cardPhone')
    .set('isPhone')
    .set('phoneTime')
    .set('isCard')
    .set('cardTime')
    .set('operatorPassword')
    .set('isOperator')
    .set('operatorTime')
    .set('createTime')
    .set('updateTime')
    .set('humanFaceImg')
    .set('humanFaceImgUrl')
    .set('cardPositiveImg')
    .set('cardPositiveImgUrl')
    .set('cardAntiImg')
    .set('cardAntiImgUrl')
    .set('isWindControl')
    .set('status')
    .set('channelId')
    .set('isZhima')
    .set('zhimaScore')
    .set('zmAuthTime')
    .set('isOld');
}

/**
 * 提交添加
 */
BorrowUserInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/borrowUser/add", function(data){
        Feng.success("添加成功!");
        window.parent.BorrowUser.table.refresh();
        BorrowUserInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.borrowUserInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
BorrowUserInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/borrowUser/update", function(data){
        Feng.success("修改成功!");
        window.parent.BorrowUser.table.refresh();
        BorrowUserInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.borrowUserInfoData);
    ajax.start();
}

$(function() {

});
