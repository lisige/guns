/**
 * 前台用户列表管理初始化
 */
var BorrowUser = {
    id: "BorrowUserTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
BorrowUser.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: '序列号', field: 'id', visible: true, align: 'center', valign: 'middle'},
            {title: '用户名', field: 'userAccount', visible: true, align: 'center', valign: 'middle'},
            {title: '用户密码', field: 'userPassword', visible: true, align: 'center', valign: 'middle'},
            {title: '交易密码', field: 'transactionPassword', visible: true, align: 'center', valign: 'middle'},
            {title: '用户手机号码', field: 'userPhone', visible: true, align: 'center', valign: 'middle'},
            {title: '用户姓名', field: 'userName', visible: true, align: 'center', valign: 'middle'},
            {title: '用户身份证号', field: 'userCardNo', visible: true, align: 'center', valign: 'middle'},
            {title: '学历', field: 'userEducation', visible: true, align: 'center', valign: 'middle'},
            {title: '婚姻状态(1:已婚，0：未婚)', field: 'userMarriage', visible: true, align: 'center', valign: 'middle'},
            {title: '省', field: 'userProvince', visible: true, align: 'center', valign: 'middle'},
            {title: '市', field: 'userCity', visible: true, align: 'center', valign: 'middle'},
            {title: '区', field: 'userArea', visible: true, align: 'center', valign: 'middle'},
            {title: '用户详细地址', field: 'userAddress', visible: true, align: 'center', valign: 'middle'},
            {title: '居住时长', field: 'lengthOfStay', visible: true, align: 'center', valign: 'middle'},
            {title: '是否黑名单（1:是，0：否）', field: 'isBlack', visible: true, align: 'center', valign: 'middle'},
            {title: '是否实名认证（1：是，0：否）', field: 'isVerified', visible: true, align: 'center', valign: 'middle'},
            {title: '实名认证时间', field: 'verifiedTime', visible: true, align: 'center', valign: 'middle'},
            {title: '银行卡号', field: 'cardCode', visible: true, align: 'center', valign: 'middle'},
            {title: '所属银行', field: 'cardType', visible: true, align: 'center', valign: 'middle'},
            {title: '银行卡预留手机号', field: 'cardPhone', visible: true, align: 'center', valign: 'middle'},
            {title: '是否提交了通讯录（1：是，0：否）', field: 'isPhone', visible: true, align: 'center', valign: 'middle'},
            {title: '提交通讯录时间', field: 'phoneTime', visible: true, align: 'center', valign: 'middle'},
            {title: '是否绑定银行卡（1：是，0：否）', field: 'isCard', visible: true, align: 'center', valign: 'middle'},
            {title: '绑卡时间', field: 'cardTime', visible: true, align: 'center', valign: 'middle'},
            {title: '运营商服务器密码', field: 'operatorPassword', visible: true, align: 'center', valign: 'middle'},
            {title: '运营商认证（1：是，0：否）', field: 'isOperator', visible: true, align: 'center', valign: 'middle'},
            {title: '运营商认证时间', field: 'operatorTime', visible: true, align: 'center', valign: 'middle'},
            {title: '添加时间', field: 'createTime', visible: true, align: 'center', valign: 'middle'},
            {title: '修改时间', field: 'updateTime', visible: true, align: 'center', valign: 'middle'},
            {title: '人脸照片地址', field: 'humanFaceImg', visible: true, align: 'center', valign: 'middle'},
            {title: '图片外部访问路径', field: 'humanFaceImgUrl', visible: true, align: 'center', valign: 'middle'},
            {title: '身份证正面照片', field: 'cardPositiveImg', visible: true, align: 'center', valign: 'middle'},
            {title: '身份证正面图片外部访问地址', field: 'cardPositiveImgUrl', visible: true, align: 'center', valign: 'middle'},
            {title: '身份证反面图片', field: 'cardAntiImg', visible: true, align: 'center', valign: 'middle'},
            {title: '身份证反面图片外部访问地址', field: 'cardAntiImgUrl', visible: true, align: 'center', valign: 'middle'},
            {title: '风控评估（1：通过，0：不通过，2：评估中）', field: 'isWindControl', visible: true, align: 'center', valign: 'middle'},
            {title: '是否有有效（0：有效，1：无效）', field: 'status', visible: true, align: 'center', valign: 'middle'},
            {title: '渠道id', field: 'channelId', visible: true, align: 'center', valign: 'middle'},
            {title: '是否芝麻授权（1：是，0：否）', field: 'isZhima', visible: true, align: 'center', valign: 'middle'},
            {title: '芝麻分', field: 'zhimaScore', visible: true, align: 'center', valign: 'middle'},
            {title: '最近一次芝麻认证时间', field: 'zmAuthTime', visible: true, align: 'center', valign: 'middle'},
            {title: '是否老用户 0否 1是', field: 'isOld', visible: true, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
BorrowUser.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        BorrowUser.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加前台用户列表
 */
BorrowUser.openAddBorrowUser = function () {
    var index = layer.open({
        type: 2,
        title: '添加前台用户列表',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/borrowUser/borrowUser_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看前台用户列表详情
 */
BorrowUser.openBorrowUserDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '前台用户列表详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/borrowUser/borrowUser_update/' + BorrowUser.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除前台用户列表
 */
BorrowUser.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/borrowUser/delete", function (data) {
            Feng.success("删除成功!");
            BorrowUser.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("borrowUserId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询前台用户列表列表
 */
BorrowUser.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    BorrowUser.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = BorrowUser.initColumn();
    var table = new BSTable(BorrowUser.id, "/borrowUser/list", defaultColunms);
    table.setPaginationType("client");
    BorrowUser.table = table.init();
});
