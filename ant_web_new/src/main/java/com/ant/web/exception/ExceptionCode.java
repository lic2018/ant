package com.ant.web.exception;

public enum ExceptionCode {

 // SQL执行失败
 EX_SQL(50001),




 // 注册失败
  EX_USER_REGISTER(900),
 // 未登录
 EX_USER_NOT_LOGIN(901),
 EX_USER_USERNAME(902),

  /** 用户不存在 */
  EX_USER_NOT_FOUND(10001),

  /** 手机号码所有者不合法 */
  EX_USER_MOBILE_OWNER_INVALID(10002),

  /** 手机号已被注册 */
  EX_USER_EXIST(10003),

  /** 该用户不存在，请先注册 */
  EX_USER_REGIST(10004),

  /** 头像不能为空 */
  EX_USER_AVATAR_NOTNULL(10005),

  /** 上传用户头像失败 */
  EX_UPLOADING_AVATAR(10006),

  /** 与原手机号码不能相同 */
  EX_MOBILE_NOTSAME(10007),

  /** 用户账号被冻结，请联系客服 */
  EX_USER_STATE_LOCK(10008),

  /** 用户账号被注销，请联系客服 */
  EX_USER_STATE_CANCEL(10009),

  /** 修改手机号码失败 */
  EX_USER_MODIFY_MOBILE_ERROR(10010),

  /** 企业用户已解约 */
  EX_USER_CANCELLED(10011),

  /** 用户不属于企业用户，请联系企业管理员 */
  EX_USER_NOT_BELONG_ENTERPRISE(10012),

  /** 用户密码错误，请确认 */
  EX_USER_PASSWORD_ERR(10013),

  /** 该身份证已被使用 */
  EX_USER_ID_EXIST(11001),

  /** 用户身份已认证 */
  EX_USER_CERT_VERIFIED(11002),

  /** 身份认证失败 */
  EX_USER_VERIFYCERY_FAILURE(11003),

  /** 服务无响应 */
  EX_ERR_NO_RESPONSE(11004),

  /** 身份证和姓名正确但是识别失败 */
  EX_ID_NAME_RIGHT_RE_ERROR(11005),

  /** 人脸识别分值过低 */
  EX_ERR_THRESHOLD_BELOW(11006),

  /** 司机已认证，换一个试试 */
  EX_DRIVER_VERIFED(12001),

  /** 司机姓名不匹配，请核实 */
  EX_DRIVER_NAME_NOTMATCH(12002),

  /** 驾驶证号不匹配，请核实 */
  EX_DRIVER_LICENSE_NOTMATCH(12003),

  /** 准驾车型不匹配，请核实 */
  EX_DRIVER_LICENSE_TYPE_NOTMATCH(12004),

  /** 驾驶证图片不能为空 */
  EX_DRIVER_PIC_NOTNULL(12005),

  /** 手持驾驶证图片不能为空 */
  EX_DRIVER_SELFPIC_NOTNULL(12006),

  /** 司机认证失败 */
  EX_DRIVER_VERIFY_FAIL(12007),

  /** 驾驶证已被其他人认证，请核实 */
  EX_OTHER_DRIVER_VERIFIED(12008),

  /** 您的账号未认证，请先处理 */
  EX_DRIVER_UNCERTIFIED(12009),

  /** 您需要先交保证金才可以租车哦 */
  EX_DEPOSIT_UNPAID(12010),

  /** 请填写正确的驾驶证档案编号 */
  EX_UPLOAD_CORRECT_DRIVER_LICENSEID(12011),

  /** 上传照片失败 */
  EX_UPLOAD_PIC_FAILURE(12012),

  /** 用户已认证不能修改用户信息 */
  EX_NOT_UPDATE_USER_INFO_VERIFIED(12013),

  /** 用户认证中不能修改用户信息 */
  EX_NOT_UPDATE_USER_INFO_VERIFYING(12014),

  /** 不能添加自己为信任司机 */
  EX_NOT_ONESELF_DRIVER(13001),

  /** 司机还未认证，不能添加信任司机 */
  EX_DRIVER_NOT_VERIFY(13002),

  /** 信任司机已存在 */
  EX_TRUSTDRIVER_EXIST(13003),

  /** 系统已发送信息给司机 */
  EX_DRIVER_NOT_EXIST(13004),

  /** 您已经报过名了，请耐心等待客服联系 */
  EX_DRIVER_EXIST(13005),

  /** 不能添加兜底司机为信任司机 */
  EX_DRIVER_REVEAL_EXIST(13006),

  /** 您的身份不能参加金牛招募 */
  EX_DRIVER_REVEAL_ADD(13007),

  /** 请先添加一个信任司机 */
  EX_TRUST_DRIVER_BEFORE(13008),

  /** 您的信任司机个数已超限 */
  EX_TRUST_DRIVER_OVER_LIMIT(13009),

  /** 司机身份异常，请联系客服 */
  EX_DRIVER_UNUSUAL(13010),

  /** 您存在违章记录，无法退还违章保证金 */
  EX_DRIVER_EXIST_VIOLATION(13011),

  /** 司机身份不匹配 */
  EX_DRIVER_ROLE_MISMATCH(13012),

  /** 司机未开启接单模式 */
  EX_DRIVER_NOTOPEN_RECEIVING(13013),

  /** 司机已被派单 */
  EX_DRIVER_ASSIGNED_ORDER(13014),

  /** 邀请分享码不存在 */
  EX_INVITATIONCODE_NOT_EXIST(14001),

  /** 用户与微信未绑定 */
  EX_MCH_USER_NOTBIND(14002),

  /** 邀请分享信息不存在 */
  EX_SHARE_NOTEXIST(14003),

  /** 企业不存在 */
  EX_ENTERPRISE_NOT_FOUND(15001),

  /** 企业管理员不允许解绑 */
  EX_BAN_UNBUNDLING(15002),

  /** 您的信用分数不存在 */
  EX_CREDIT_SCORE_NOTEXIST(16001),

  /** 您的信用分数处理异常 */
  EX_CREDIT_SCORE_DEAL_ERR(16002),

  /** 用户最新登录位置未找到 */
  EX_USER_POSITION_NULL(17001),

  /** 验证码已过期或者错误 */
  EX_USER_VCODE_INVALID(20001),

  /** 消息模板不存在 */
  EX_MSG_TEMPLATE_NOTEXISTS(21001),

  /** 用户已开户 */
  EX_USER_EXIST_ACCOUNT(30000),

  /** 用户未实名 */
  EX_USER_NOTVERIFY(30001),

  /** 账户不存在 */
  EX_ACCOUNT_NOTFOUND(30002),

  /** 账户异常 */
  EX_ACCOUNT_ABNORMAL(30003),

  /** 分户账不存在 */
  EX_ACCOUNT_LEDGER_NOTFOUND(30004),

  /** 分户账异常 */
  EX_ACCOUNT_LEDGER_EXCEPTION(30005),

  /** 账户id不能为空 */
  EX_ACCOUNT_ID_NOTNULL(30006),

  /** 机构不存在 */
  EX_ORGANIZATION_NOTEXIST(30007),

  /** 账户已冻结，请联系客服 */
  EX_ACCOUNT_FREEZE(30008),

  /** 支付密码错误，您还可以输入{}次 */
  EX_PAY_PWD_ERROR(30105),

  /** 支付密码不能为空 */
  EX_PAY_PWD_NOTNULL(30106),

  /** 支付密码未设置 */
  EX_NOT_SET_PAY_PWD(30107),

  /** 支付密码错误，账户被锁定，24小时自动解冻 */
  EX_PAYPWD_ERR_LOCK(30108),

  /** 账户被锁定，24小时自动解锁 */
  EX_PAYPWD_ERR_ACCLOCK(30109),

  /** 账户交易异常，请联系客服 */
  EX_TRADE_ERROR(32000),

  /** 账户余额不足 */
  EX_BALANCE_NOTENOUGH(32001),

  /** 账户余额不能为负值 */
  EX_BANLANCE_NOTMINUS(32002),

  /** 原金额密文不能为空 */
  EX_OLDMONEY_CIPHERTEXT_NOTNULL(32003),

  /** 账户金额加密出错 */
  EX_ACCMONEY_ENCRYPT_ERR(32004),

  /** 账户金额解密出错 */
  EX_ACCMONEY_DECRYPT_ERR(32005),

  /** 账户加密金额计算出错 */
  EX_ACCMONEY_ENCRYPT_CALERR(32006),

  /** 金额密钥未配置 */
  EX_AMT_SECRETKEY_NOTEXIST(32007),

  /** 今日提现次数已用完，请明天再提 */
  EX_WITHDRAWAL_COUNT_NOTENOUGH(32008),

  /** 账户退款异常，请联系客服 */
  EX_ACCOUNT_REFUND_EXCEPTION(32009),

  /** 消费记录不存在 */
  EX_CONSUME_NOTFOUND(32010),

  /** 消费已退款 */
  EX_CONSUME_REFUNDED(32011),

  /** 退款金额超过原消费金额 */
  EX_REFUND_AMT_ERROR(32012),

  /** 可用发呗额度不足 */
  EX_CREDIT_NOTENOUGH(32013),

  /** 发呗提额申请记录不存在 */
  EX_CREDIT_LINEAPPLY_NOTEXISTS(32014),

  /** 保证金缴纳记录不存在 */
  EX_DEPOSIT_NOTFOUND(32020),

  /** 保证金未缴纳 */
  EX_DEPOSIT_NOTPAY(32021),

  /** 未达到保证金退款限制天数 */
  EX_DEPOSIT_REFUND_TIME_NOTENOUGN(32022),

  /** 保证金已缴纳 */
  EX_DEPOSIT_PAID(32023),

  /** 保证金退款审核中 */
  EX_DEPOSIT_REFUND_APPLYING(32024),

  /** 可转出金额不足 */
  EX_INSUFFICIENT_AMOUNT(32026),

  /** 可提现金额不足 */
  EX_INSUFFICIENT_WITHDRAW(32027),

  /** 可提现金额不能小于等于0元 */
  EX_WITHDRAW_LTE_ZERO(32028),

  /** 提现金额小于或大于提现限额 */
  EX_WITHDRAW_QUOTA(32029),

  /** 添加提现账户的用户不对应 */
  EX_ACCOUNT_USER_NO(35001),

  /** 该类型的账户已经添加过，请先解绑 */
  EX_ACCOUNT_REPETITION(35002),

  /** 优惠券未使用 */
  EX_ACTIVITY_UNUSER(40001),

  /** 优惠券已使用 */
  EX_ACTIVITY_COUPON_USED(40002),

  /** 优惠券已过期 */
  EX_ACTIVITY_COUPON_EXPIRED(40003),

  /** 已经不能领取优惠券啦！ */
  EX_COUPONS_FAILED(40004),

  /** 优惠券不存在 */
  EX_ACTIVITY_COUPON_NOTEXIST(40005),

  /** 优惠券添加失败 */
  EX_COUPON_ADD_FAIL(40006),

  /** 活动不存在 */
  EX_ACTIVITY_NOTEXIST(45000),

  /** 活动已下线 */
  EX_ACTIVITY_OFFLINE(45001),

  /** 活动已过期 */
  EX_ACTIVITY_EXPIRED(45002),

  /** 车辆编号不存在 */
  EX_RENT_CAR_ID(50001),

  /** 已被预约，请选择其他车辆 */
  EX_RENT_BOOKING(50002),

  /** 已被租用，请选择其他车辆 */
  EX_RENT_RENTAL(50003),

  /** 用户未登录，请登录 */
  EX_USER_LOGIN(50004),

  /** 您已经在租车中 */
  EX_RENT_RENTING(50005),

  /** 预约编号不存在 */
  EX_RENT_NO_BOOKING_NUMBER(50006),

  /** 还车条件不符合，应在站点内还车 */
  EX_RENT_VERIFY_REVERT_CAR(50007),

  /** 租车订单异常 */
  EX_RENT_NO_ORDER_ID(50008),

  /** 与订单用户不对应 */
  EX_RENT_USER_ERROR(50009),

  /** 车辆处于还车失败的状态 */
  EX_RENT_CAR_FAILURE(50010),

  /** 车型租赁资费没有设置 */
  EX_RENT_CAR_RENT_PRICE(50011),

  /** 电量偏低，请选择其他车辆 */
  EX_RENT_CAR_BATTERY_LOW(50012),

  /** 车型编号不存在 */
  EX_RENT_CAR_MODEL_ID(50013),

  /** 没有可用的车辆 */
  EX_RENT_NO_CAR(50014),

  /** 已被预约，请选择其他车辆 */
  EX_RENT_CAR_RETURN_CONFIRM(50015),

  /** 今天已经超过预约次数了，不能再预约车辆了 */
  EX_BOOKING_CANCEL_THREE(50016),

  /** 用户的状态必须是预约中或租车中 */
  EX_USER_STATE_BOOKING_RENTAL(50017),

  /** 今天取消次数已经用完不能再取消了 */
  EX_RECEIVING_CANCEL(50018),

  /** 该站点不允许还车 */
  EX_FORBID_RENT(50019),

  /** 已经没有车位了 */
  EX_PARKING_SPACE_EMPTY(50020),

  /** 远程操作车辆失败，请重试 */
  EX_OPERATION_CAR_FAILURE(50021),

  /** 提交的订单编号不符合条件，不能操控车辆 */
  EX_RENT_INCONFORMITY(50022),

  /** 您已经预约了车辆 */
  EX_RENT_BOOKING_REPETITION(50023),

  /** 您有一辆车还车失败 */
  EX_RETURN_CAR_FAILURE(50024),

  /** 预约失败 */
  EX_BOOKING_FAILURE(50025),

  /** 车辆被占用 */
  EX_CAR_OCCUPATION(50026),

  /** 该车辆正在维护中 */
  EX_CAR_MAINTAINED(50027),

  /** 车辆的使用状态有误 */
  EX_CAR_STATE_ERROR(50028),

  /** 行驶中，不能还车！ */
  EX_CAR_DRIVING_IN(50029),

  /** 糟糕，这个车已经有主了，换一辆吧 */
  EX_ENTERPRISE_DRIVER_NOT(50030),

  /** 站点不是自己企业站点，不允许还车 */
  EX_SITE_NOT_SELF_SITE(50031),

  /** 站点不允许还企业车 */
  EX_SITE_NOTRETURN_ENTERPRISE_CAR(50032),

  /** 不允许在企业站点还车 */
  EX_NOTRETURN_ENTERPRISE_CAR(50033),

  /** 还车，请联系客服！ */
  EX_NO_RETURN_CAR(50034),

  /** 您不能租该车型的车 */
  EX_CAR_MODEL_LIMIT(50035),

  /** 发货资费未配置，请联系客服 */
  EX_DELIVERY_RATES_UNSET(50036),

  /** 您当前未租车，请先租车 */
  EX_UN_RENTING_CAR(50037),

  /** 您还未到达装货地点，请到达后再点击 */
  EX_UN_ARRIVE_GOAL(50038),

  /** 租车订单正在进行 */
  EX_RENT_ORDER_ING(52001),

  /** 请再试一次 */
  EX_TRY_AGAIN(52002),

  /** 租金订单不存在 */
  EX_BILL_RENT_NOTEXIST(55000),

  /** 您签约城市的班次时间未配置 */
  EX_TAURUS_TIME_SHIFT(55001),

  /** 您签约城市的租赁资费未配置 */
  EX_TAURUS_TIME_RATES(55002),

  /** 发货订单不存在 */
  EX_SHIPMENT_ORDER_NOT_FOUND(65001),

  /** 赔偿订单未找到 */
  EX_SHIPMENT_APPLY_FOR(65002),

  /** 您还有一个订单未支付，请先支付 */
  EX_NON_PAYMENT_ORDER(65003),

  /** 货主已经取消订单 */
  EX_OWNER_CANCEL(65004),

  /** 请添加发货路线的终点 */
  EX_SHIPMENT_ROUTE_LESS(65005),

  /** 订单状态已改变 */
  EX_ORDER_UNCERTAIN(65006),

  /** 订单的状态已改变 */
  EX_ORDER_STATE_CHANGED(65007),

  /** 该订单不在派单列表 */
  EX_ORDER_NOT_SINGLE_LIST(65008),

  /** 该订单已被接单 */
  EX_ORDER_RECEIVED(65009),

  /** 订单已取消，不能再取消 */
  EX_ORDER_CANCELED(65011),

  /** 订单升级失败  */
  EX_UPGRADE_FAILED(65012),

  /** 未获取到位置坐标 */
  EX_SHIPMENT_ROUTE_NOT_FOUND(65013),

  /** 发货规则已改变，请重新发货 */
  EX_SHIPMENT_RULE_CHANGED(65014),

  /** 企业发货规则不存在 */
  EX_SHIPMENT_RULE_NOTEXIST(65015),

  /** 议价订单未支付 */
  EX_SHIPMENT_BARGAIN_NOTPAY(65016),

  /** 您已拒绝支付，等待司机确认*/
  EX_SHIPMENT_BARGAIN_REFUSAL_PAY(65017),

  /** 您的信用分过低，无法承接牛滴货单，如需帮助，可联系客服 */
  EX_NORMAL_DRIVER_CANNOT_RECEIVING(66001),

  /** 您的信用分过低，暂时无法接单，请尽快回公司重新考核 */
  EX_TAURUS_DRIVER_CANNOT_RECEIVING(66002),

  /** 您今日还未签到，暂时无法接单 */
  EX_TAURUS_DRIVER_NOT_SIGNIN(66003),

  /** 订单状态异常，不能申请支付 */
  EX_ORDER_ERR_STATE_NOTPAY(70000),

  /** 订单状态异常，不能申请退款 */
  EX_ORDER_ERR_STATE_NOTREFUND(70001),

  /** 暂不支持这种支付方式支付 */
  EX_PAY_WAY_ERR(70002),

  /** 订单未支付，不能申请退款 */
  EX_ORDER_NOTPAY_NOTREFUND(70003),

  /** 订单不属于当前用户 */
  EX_ORDER_NOT_CURRENT_USER(70004),

  /** 订单金额异常，不能申请支付 */
  EX_ORDER_AMOUNT_ERR_NOTPAY(70005),

  /** 该订单已确认  请勿重复确认 */
  EX_ORDER_HADE_CONFIRM(70006),

  /** 订单金额异常 */
  EX_ORDER_AMOUNT_ERR(70007),

  /** 订单金额异常，请使用余额支付 */
  EX_ORDER_AMOUNT_ERR_WALLECTPAY(70008),

  /** 微信支付系统异常，请稍后再试 */
  EX_WXPAY_SYS_ERR(71000),

  /** 获取预支付交易会话标识失败 */
  EX_WXPAY_PREPAYID_FAIL(71001),

  /** 解析xml出错 */
  EX_PARSE_XML_ERROR(71002),

  /** 微信商户余额不足，请联系客服 */
  EX_MCH_NOTENOUGH(71003),

  /** 微信退款异常，请联系客服 */
  EX_MCH_REFUND_EXCEPTION(71004),

  /** 支付宝系统异常，请稍后再试 */
  EX_ALIPAY_SYS_ERR(72000),

  /** 支付宝交易号和商户订单号不能同时为空 */
  EX_ORDERNOS_NOT_ALL_NULL(72001),

  /** 商户退款订单号不能为空 */
  EX_MERCHANT_REFUND_NOTNULL(72002),

  /** 转账备注不能为空 */
  EX_TRANSFER_REMARK_NOTNULL(72003),

  /** 支付宝退款异常，请联系客服 */
  EX_ALIPAY_REFUND_EXCEPTION(72004),

  /** 账户系统异常，请稍后再试 */
  EX_ACCPAY_SYS_ERR(73000),

  /** 还款金额不能小于0 */
  EX_REPAYMENT_AMOUNT_LTE_ZERO(74000),

  /** 还款日期不能为空 */
  EX_REPAYMENT_DATE_NOTNULL(74001),

  /** 该订单不允许议价 */
  EX_ORDER_NOT_ALLOW_BARGAIN(75000),

  /** 修改金额不能超出订单实付款金额 */
  EX_ORDER_MODIFY_GT_AMOUNT(75001),

  /** 货主未处理或该订单已修改金额成功,不允许再次修改 */
  EX_ORDER_BARGAIN_UNDEAL_MODIFY_SUCCESS(75002),

  /** 修改订单金额次数超过上限 */
  EX_ORDER_BARGAIN_COUNT_LIMIT(75003),
  
  /** 议价订单不存在 */
  EX_ORDER_BARGAIN_NOTEXISTS(75004),
  
  /** 议价订单不能拒绝 */
  EX_ORDER_BARGAIN_NOTREFUSE(75005),
  
  /** 议价订单不能撤销 */
  EX_ORDER_BARGAIN_NORESCIND(75006),

  /** 调用外部接口失败 */
  EX_EXTERNAL_API_FAILED(80001),

  /** 调用外部接口业务失败 */
  EX_EXTERNAL_BIZ_FAILED(80002),

  /** 人脸识别服务接口调用异常 */
  EX_FACE_RECOG_ILLEGAL_STATE(81001),

  /** 库中检测不到人脸 */
  EX_FACE_RECOG_NO_SUCH_FACE(81002),

  /** 用户照片检测不到人脸 */
  EX_FACE_RECOG_NO_UPLOADED_FACE(81003),

  /** 人脸比对失败 */
  EX_FACE_RECOG_FAILED(81004),

  /** 身份证号与姓名不匹配 */
  EX_FACE_RECOG_ID_MISSMATCH(81005),

  /** 身份证号有误 */
  EX_FACE_RECOG_NO_ID(81006),

  /** 验证码错误 */
  EX_CODE_ERROR(82001),

  /** 验证码过期或失效 */
  EX_CODE_LOSE_EFFICACY(82002),

  /** 验证码发送失败 */
  EX_CODE_SEND_FAIL(82003),

  /** 短信发送过于频繁 */
  EX_CODE_SEND_FREQUENTLY(82004),

  /** 短信发送超出日次数限制 */
  EX_CODE_SEND_BEYOUND_LIMIT(82005),

  /** 没有找到对应的请求处理器 */
  EX_HTTP_HANDLER_NOT_FOUND(90001),

  /** 请求方式不支持 */
  EX_HTTP_METHOD_NOT_SUPPORTED(90002),

  /** 不可识别的请求体内容 */
  EX_HTTP_MESSAGE_NOT_READABLE(90003),

  /** 不被支持的媒体类型 */
  EX_HTTP_MEDIA_TYPE_NOT_SUPPORTED(90004),

  /** 访问被拒绝 */
  EX_HTTP_ACCESS_DENIED(90005),

  /** 缺少必要的参数 */
  EX_HTTP_MISSING_PARAM(90006),

  /** 输入的参数不合法 */
  EX_HTTP_INPUT_NOT_VALID(90007),

  /** 访问频率过快 */
  EX_HTTP_OVERSTEP_RATE_LIMIT(90008),

  /** 当前访问人数过多 */
  EX_HTTP_OVERSTEP_CONCURRENCY_LIMIT(90009),

  /** 网络发生异常，请稍后重试 */
  EX_HTTP_NETWORK_ERROR(90010),

  /** 当前版本过低 */
  EX_UPLOAD_VERSION(90011),

  /** 您还未拥有权限，请联系客服 */
  EX_PERMISSION_DENIED(90012),

  /** 数据异常 */
  EX_DATA_ERROR(90013),

  /** 缺少配置项 */
  EX_LACK_OF_CONFIGURATION(91001),

  /** 重复请求! */
  EX_REPEAT_REQUEST(92000),

  /** 网络异常，请稍后再试 */
  EX_NETWORK_ERR(99998),

  /** 系统异常，请联系客服 */
  EX_SYSTEM(99999);

  private int code;

  private ExceptionCode(int code) { this.code = code; }

  public int code() { return this.code; }

}