package com.cn.cms.base;

/**
 * 静态变量类
 * 
 * @author Guoxk
 */
public class Const {

    /** 登陆用户信息 session key */
    public final static String LOGIN_INFO_SESSION_KEY = "LOGIN_INFO_SESSION_KEY";
    /** 控制菜单的session key */
    public final static String MENU_INFO_SESSION_KEY = "MENU_INFO_SESSION_KEY";

    /** 返回值的状态 */
    public static enum RESULT_STATUS {
        /** OK */
        OK("0", "OK"),
        /** ERROR */
        ERROR("1", "ERROR");

        public final String value;
        public final String name;

        RESULT_STATUS(String value, String name) {
            this.value = value;
            this.name = name;
        }
    }

    /** login登陆返回值 */
    public static enum LOGIN_RESULT {
        USER_PWD_ERROR("LOGIN_USER_PWD", "用户名或者密码输入错误。"), //
        LOCK("LOGIN_LOCK", "用户暂时被冻结。"), //
        OK("LOGIN_OK", "登陆成功。");

        public final String value;
        public final String name;

        LOGIN_RESULT(String value, String name) {
            this.value = value;
            this.name = name;
        }
    }

    /** 账户类型 */
    public static enum ACCOUNT_TYPE {
        /** 普通用户 */
        USER(0, "普通用户"),
        /** 管理员用户 */
        ADMIN(1, "管理员用户"),
        /** 市场管理用户 */
        MARKET(2, "市场管理用户"),
        /** 手机用户 */
        MARKET_USER(3, "手机用户");

        public final Integer value;
        public final String name;

        ACCOUNT_TYPE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }
    }

    /** 账户状态 */
    public static enum ACCOUNT_STATUS {
        CLOSED(0, "禁用"), OPEND(1, "有效");

        public final Integer value;
        public final String name;

        ACCOUNT_STATUS(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static ACCOUNT_STATUS valueOf(Integer val) {
            for (ACCOUNT_STATUS obj : values()) {
                if (obj.value.intValue() == val.intValue()) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** 渠道结算类型 */
    public static enum MANAGER_PAYMENT_TYPE {
        AUTOTROPHY(1, "平台自营"), COOPERATION(2, "合作运营");

        public final Integer value;
        public final String name;

        MANAGER_PAYMENT_TYPE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static MANAGER_PAYMENT_TYPE valueOf(Integer val) {
            for (MANAGER_PAYMENT_TYPE obj : values()) {
                if (obj.value.intValue() == val.intValue()) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** 通知类型 */
    public static enum NEWS_TYPE {
        NOTICE(0, "通知"), HELP(1, "帮助"), QA(2, "QA咨询");

        public final Integer value;
        public final String name;

        NEWS_TYPE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }
    }

    /** 结算状态 */
    public static enum SETTLE_STATE {
        NO(0, "未结算"), SETTLED(1, "已结算");

        public final Integer value;
        public final String name;

        SETTLE_STATE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static SETTLE_STATE valueOf(Integer val) {
            for (SETTLE_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** typedice表的DICT */
    public static enum DICT_ID {
        A(1, "省");

        public final Integer value;
        public final String name;

        DICT_ID(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static DICT_ID valueOf(Integer val) {
            for (DICT_ID obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** 地区表的type */
    public static enum AREAINFO_TYPE {
        PROVINCE(1, "省"), CITY(2, "市"), AREA(3, "区县");

        public final Integer value;
        public final String name;

        AREAINFO_TYPE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static AREAINFO_TYPE valueOf(Integer val) {
            for (AREAINFO_TYPE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** 账户类型 */
    public static enum FINANCE_TYPE {
        /** 个人 */
        PERSONAL(1, "个人"),
        /** 公司 */
        COMPANY(2, "公司");

        public final Integer value;
        public final String name;

        FINANCE_TYPE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static FINANCE_TYPE valueOf(Integer val) {
            for (FINANCE_TYPE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** 卡片状态 */
    public static enum CARD_STATE {
        /** 发布 */
        RELEASE(1, "发布"),
        /** 未发布 */
        NOT_RELEASE(-1, "未发布");

        public final Integer value;
        public final String name;

        CARD_STATE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static CARD_STATE valueOf(Integer val) {
            for (CARD_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }

    }

    /** APP状态 */
    public static enum APPINFO_STATE {
        /** 上架 */
        RELEASE(1, "上架"),
        /** 待审核 */
        WAIT_RELEASE(0, "待审核"),
        /** 下架 */
        NOT_RELEASE(-1, "下架");

        public final Integer value;
        public final String name;

        APPINFO_STATE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static APPINFO_STATE valueOf(Integer val) {
            for (APPINFO_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }

    }

    /**
     * APK状态
     */

    public static enum APPAPK_STATE {
        /** 已发布 */
        RELEASE(1, "已发布"),
        /** 待发布 */
        WAIT_RELEASE(0, "待发布"),
        /** 下架 */
        NOT_RELEASE(-1, "无效");

        public final Integer value;
        public final String name;

        APPAPK_STATE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static APPAPK_STATE valueOf(Integer val) {
            for (APPAPK_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }

    }

    /**
     * 是否默认版本
     * 
     * @author jiang
     */
    public static enum ISDEFAULT_STATE {
        /** 是 */
        RELEASE(1, "是"),
        /** 否 */
        WAIT_RELEASE(0, "否");

        public final Integer value;
        public final String name;

        ISDEFAULT_STATE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static ISDEFAULT_STATE valueOf(Integer val) {
            for (ISDEFAULT_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }

    }

    /**
     * 新闻状态
     * 
     * @author jiang
     */
    public static enum NEWS_STATE {
        /** 公开 */
        RELEASE(1, "公开"),
        /** 不公开 */
        NOT_RELEASE(0, "不公开");

        public final Integer value;
        public final String name;

        NEWS_STATE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static NEWS_STATE valueOf(Integer val) {
            for (NEWS_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }

    }

    /**
     * 回复类型
     * 
     * @author jiang
     */
    public static enum REPLY_STATE {
        REPLY(1, "回复"), FEEDBACK(2, "追加反馈");
        public final Integer value;
        public final String name;

        REPLY_STATE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static REPLY_STATE valueOf(Integer val) {
            for (REPLY_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }

    }

    /**
     * 消息类型
     * 
     * @author jiang 1是系统消息，2是顶部横条，3是对话框
     */
    public static enum MSGTYPE_STATE {
        SYSTEM(1, "系统消息"), TOP(2, "顶部横条"), TALK(3, "对话框");
        public final Integer value;
        public final String name;

        MSGTYPE_STATE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static MSGTYPE_STATE valueOf(Integer val) {
            for (MSGTYPE_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }

    }

    /**
     * 消息阅读状态
     * 
     * @author jiang 0未读，1已读
     */
    public static enum MSGREAD_STATE {
        NO_READ(0, "未读"), READ(1, "已读");
        public final Integer value;
        public final String name;

        MSGREAD_STATE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static MSGREAD_STATE valueOf(Integer val) {
            for (MSGREAD_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }

    }

    /**
     * 消息删除标识
     * 
     * @author jiang 0未删除，1已删除
     */
    public static enum MSGISDEL_STATE {
        DEL(0, "已删除"), NO_DEL(1, "未删除");
        public final Integer value;
        public final String name;

        MSGISDEL_STATE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static MSGISDEL_STATE valueOf(Integer val) {
            for (MSGISDEL_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }

    }

    /**
     * 渠道状态
     * 
     * @author jiang 0-禁封 1-有效
     */
    public static enum CHANNEL_STATE {
        CLOSE(0, "禁封"), NO_CLOSE(1, "有效");
        public final Integer value;
        public final String name;

        CHANNEL_STATE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static CHANNEL_STATE valueOf(Integer val) {
            for (CHANNEL_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }

    }

    /** 门店认证类型状态 */
    public static enum CHANNEL_CERT_STATE {
        /** 尚未完善信息 */
        INIT(0, "尚未完善信息"),
        /** 已认证 */
        AUTHENTICATED(2, "已认证"),
        /** 认证中 */
        AUTHENTICATING(1, "认证中"),
        /** 认证未通过 */
        AUTHENTICATION_FAIED(3, "认证未通过");

        public final Integer value;
        public final String name;

        CHANNEL_CERT_STATE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static CHANNEL_CERT_STATE valueOf(Integer val) {
            for (CHANNEL_CERT_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }

    }

    /**
     * App评论状态
     * 
     * @author Guoxk
     */
    public static enum APP_COMMENT_STATE {
        /** 有效 */
        ENABLE(1, "有效"),
        /** 无效 */
        DISABLE(-1, "无效");

        public final Integer value;
        public final String name;

        APP_COMMENT_STATE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static APP_COMMENT_STATE valueOf(Integer val) {
            for (APP_COMMENT_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    /**
     * 榜单类型
     * 
     * @author Guoxk
     */
    public static enum RANK_TYPE {
        /** 飙升榜 */
        QUICK(1, "飙升榜"),
        /** 热门榜 */
        HOT(2, "热门榜"),
        /** 个性榜 */
        PERSONAL(-1, "无效");

        public final Integer value;
        public final String name;

        RANK_TYPE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static RANK_TYPE valueOf(Integer val) {
            for (RANK_TYPE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    /**
     * 订单状态
     * 
     * @author jiang
     */
    public static enum ORDERS_STATE {
        /** 待审核 */
        WAIT_AUDIT(1, "待审核"),
        /** 已审核 */
        ALREADY_AUDIT(2, "已审核"),
        /** 已打款 */
        ALREADY_PAY(3, "已打款"),
        /** 已冻结 */
        ALREADY_FREEZE(4, "已冻结"),
        /** 审核失败 */
        FAIL_AUDIT(5, "审核失败"),
        /** 已取消 */
        ALREADY_CANCEL(6, "已取消");

        public final Integer value;
        public final String name;

        ORDERS_STATE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static ORDERS_STATE valueOf(Integer val) {
            for (ORDERS_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    /**
     * 状态描述
     * 
     * @author jiang
     */
    public static enum DESCRIPTION_STATE {
        /** 审核描述 */
        ALREADY_AUDIT("审核描述", "审核描述"),
        /** 打款描述 */
        ALREADY_PAY("打款描述", "打款描述"),
        /** 冻结描述 */
        ALREADY_FREEZE("冻结描述", "冻结描述"),
        /** 取消描述 */
        ALREADY_CANCEL("取消描述", "取消描述");

        public final String value;
        public final String name;

        DESCRIPTION_STATE(String value, String name) {
            this.value = value;
            this.name = name;
        }
    }

    public static enum BANK_NAME {
        B1("支付宝", "支付宝"), //
        B2("工商银行", "工商银行"), //
        B3("建设银行", "建设银行"), //
        B4("中国银行", "中国银行"), //
        B5("招商银行", "招商银行"), //
        B6("农业银行", "农业银行"), B7("交通银行", "交通银行"), B8("邮政储蓄银行", "邮政储蓄银行");

        public final String value;
        public final String name;

        BANK_NAME(String value, String name) {
            this.value = value;
            this.name = name;
        }
    }

    /** 项目类型 */
    public static enum PROJECT_TYPE {
        /** 装机 */
        INSTALL(1L, "装机"),
        /** 增值 */
        INCREAMMENT(2L, "增值"),
        /** 奖励 */
        BONUS(3L, "奖励");

        public final Long value;
        public final String name;

        PROJECT_TYPE(Long value, String name) {
            this.value = value;
            this.name = name;
        }

        public static PROJECT_TYPE valueOf(Long val) {
            for (PROJECT_TYPE obj : values()) {
                if (obj.value == val.longValue()) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** 安装类型 */
    public static enum APP_INSTALL_TYPE {
        /** 装机 */
        INSTALL(1, "装机"),
        /** 增值 */
        INCREAMMENT(2, "增值");

        public final long value;
        public final String name;

        APP_INSTALL_TYPE(long value, String name) {
            this.value = value;
            this.name = name;
        }

        public static APP_INSTALL_TYPE valueOf(long val) {
            for (APP_INSTALL_TYPE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** 项目状态 */
    public static enum PROJECT_STATE {
        /** 下架 */
        OFF_SHELEVE(-1, "下架"),
        /** 下架计费 */
        OFF_SHELEVE_COUNT(0, "下架计费"),
        /** 上架 */
        ON_SHELEVE(1, "上架");

        public final long value;
        public final String name;

        PROJECT_STATE(long value, String name) {
            this.value = value;
            this.name = name;
        }

        public static PROJECT_STATE valueOf(long val) {
            for (PROJECT_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** 项目App分成 1 */
    public static enum PROJECT_RULEID {
        /** 规则1 */
        RULE_ONE(1, "首次分成系数1"),
        /** 规则2 */
        RULE_TWO(2, "首次分成系数2");

        public final Integer value;
        public final String name;

        PROJECT_RULEID(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static PROJECT_RULEID valueOf(Integer val) {
            for (PROJECT_RULEID obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** 项目App分成2 */
    public static enum PROJECT_RULE2ID {
        /** 规则1 */
        RULE2_ONE(1, "二次分成系数1"),
        /** 规则2 */
        RULE2_TWO(2, "二次分成系数2");

        public final Integer value;
        public final String name;

        PROJECT_RULE2ID(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static PROJECT_RULE2ID valueOf(Integer val) {
            for (PROJECT_RULE2ID obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** 项目App状态 */
    public static enum PROJECTAPP_STATE {
        /** 下架 */
        OFF_SHELEVE(-1, "下架"),
        /** 下架计费 */
        OFF_SHELEVE_COUNT(0, "下架且分账"),
        /** 上架 */
        ON_SHELEVE(1, "上架");

        public final Integer value;
        public final String name;

        PROJECTAPP_STATE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static PROJECTAPP_STATE valueOf(Integer val) {
            for (PROJECTAPP_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** 推广APP激活状态 */
    public static enum PROJECT_APP_ACTIVE_MODE {
        /** 小时 */
        HOUR(1, "小时"),
        /** 天 */
        DAY(2, "天");

        public final Integer value;
        public final String name;

        PROJECT_APP_ACTIVE_MODE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static PROJECT_APP_ACTIVE_MODE valueOf(Integer val) {
            for (PROJECT_APP_ACTIVE_MODE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** 财务信息状态 */
    public static enum FINANCE_STATE {
        /** 未完善 */
        INIT(0, "未完善"),
        /** 审核中 */
        SUBMIT(1, "审核中"),
        /** 已审核 */
        PASS(2, "已审核"),
        /** 未审核通过 */
        NOT_PASS(3, "未审核通过");

        public final Integer value;
        public final String name;

        FINANCE_STATE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static FINANCE_STATE valueOf(Integer val) {
            for (FINANCE_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** 账户余额状态 */
    public static enum PAYMENT_ACCOUNT_STATE {
        /** 冻结 */
        FREEZE(0, "冻结"),
        /** 正常 */
        NORMAL(1, "正常");

        public final Integer value;
        public final String name;

        PAYMENT_ACCOUNT_STATE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static PAYMENT_ACCOUNT_STATE valueOf(Integer val) {
            for (PAYMENT_ACCOUNT_STATE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** 销售人员等级 */
    public static enum AGENT_LEVEL {
        /** 大区经理 */
        LV1(1, "大区经理"),
        /** 省级主管 */
        LV2(2, "省级主管"),
        /** 地区主管 */
        LV3(3, "地市主管"),
        /** 镇主管 */
        LV4(4, "乡镇主管"),
        /** 乡主管 */
        LV5(5, "乡镇主管");

        public final Integer value;
        public final String name;

        AGENT_LEVEL(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static AGENT_LEVEL valueOf(Integer val) {
            for (AGENT_LEVEL obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** 维护记录类型 */
    public static enum MANAGER_TASK_TYPE {
        /** 电话访问 */
        TEL_VISIT(1, "电话访问"),
        /** 上门访问 */
        VISIT(2, "上门访问"),
        /** 客户电话咨询 */
        TEL_QA(3, "客户电话咨询"),
        /** 客户投诉建议 */
        ADVICE(4, "客户投诉建议");

        public final Integer value;
        public final String name;

        MANAGER_TASK_TYPE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static MANAGER_TASK_TYPE valueOf(Integer val) {
            for (MANAGER_TASK_TYPE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** 短信验证码使用记录 */
    public static enum RANDOM_IS_USED {
        /** 未使用 */
        INIT(0, "未使用"),
        /** 已使用 */
        USED(1, "已使用");

        public final Integer value;
        public final String name;

        RANDOM_IS_USED(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static RANDOM_IS_USED valueOf(Integer val) {
            for (RANDOM_IS_USED obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    public static enum MARKET_LIST {
        /** 智能首页 */
        SMART("smart", "智能首页"),
        /** 飙升榜 */
        QUICK("quick", "飙升榜"),
        /** 热门榜 */
        HOT("hot", "热门榜"),
        /** 个性榜 */
        PERSONAL("personal", "个性榜"),
        /** 游戏 */
        GAME("game", "游戏"),
        /** 软件 */
        SOFT("soft", "软件"),
        /** 发现 */
        DISCOVERY("discovery", "发现"),
        /** 一键安装 */
        AKEY("akey", "一键安装"),
        /** 必备 */
        NECESSART("necessary", "必备");

        public final String value;
        public final String name;

        MARKET_LIST(String value, String name) {
            this.value = value;
            this.name = name;
        }
    }

    public static enum MARKET_LIST_TYPE {
        /** APP */
        APP("1", "APP"),
        /** 飙升榜 */
        CARD("2", "卡片");

        public final String value;
        public final String name;

        MARKET_LIST_TYPE(String value, String name) {
            this.value = value;
            this.name = name;
        }

        public static MARKET_LIST_TYPE valOf(String val) {
            for (MARKET_LIST_TYPE obj : values()) {
                if (obj.value.equals(val)) {
                    return obj;
                }
            }
            return null;
        }
    }

    public static enum USER_TYPE {
        /** 普通用户 */
        DEFAULT("0", "普通用户"),
        /** 主用户 */
        MAIN("1", "主用户"),
        /** 子用户 */
        SUB("2", "子用户");

        public final String value;
        public final String name;

        USER_TYPE(String value, String name) {
            this.value = value;
            this.name = name;
        }

        public static USER_TYPE valOf(String val) {
            for (USER_TYPE obj : values()) {
                if (obj.value.equals(val)) {
                    return obj;
                }
            }
            return null;
        }
    }

    /** 短信验证码使用记录 */
    public static enum MANAGER_TYPE {
        /** 市场主管 */
        LEADER(1, "市场主管"),
        /** 市场专员 */
        STAFF(2, "市场专员");

        public final Integer value;
        public final String name;

        MANAGER_TYPE(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public static MANAGER_TYPE valueOf(Integer val) {
            for (MANAGER_TYPE obj : values()) {
                if (obj.value == val) {
                    return obj;
                }
            }
            return null;
        }
    }

    public static enum APP_PLATFORM {
        /** 安卓 */
        ANDROID(1l, "安卓"),
        /** 苹果 */
        IOS(2l, "苹果");

        public final Long value;
        public final String name;

        APP_PLATFORM(Long value, String name) {
            this.value = value;
            this.name = name;
        }

        public static APP_PLATFORM valueOf(Long val) {
            for (APP_PLATFORM obj : values()) {
                if (obj.value.longValue() == val.longValue()) {
                    return obj;
                }
            }
            return null;
        }
    }

    public static enum PROJECT_COSTID {
        /** 安装计费 */
        ANDROID(1l, "安装计费"),
        /** 激活计费 */
        IOS(2l, "激活计费");

        public final Long value;
        public final String name;

        PROJECT_COSTID(Long value, String name) {
            this.value = value;
            this.name = name;
        }

        public static PROJECT_COSTID valueOf(Long val) {
            for (PROJECT_COSTID obj : values()) {
                if (obj.value.longValue() == val.longValue()) {
                    return obj;
                }
            }
            return null;
        }
    }

    public static enum PROJECTAPPPRICE_ACTIVE_TYPE {

        /** 安装计费 */
        TIME(1l, "激活时间"),
        /** 激活计费 */
        NUM(2l, "到达次数");

        public final Long value;
        public final String name;

        PROJECTAPPPRICE_ACTIVE_TYPE(Long value, String name) {
            this.value = value;
            this.name = name;
        }

        public static PROJECTAPPPRICE_ACTIVE_TYPE valueOf(Long val) {
            for (PROJECTAPPPRICE_ACTIVE_TYPE obj : values()) {
                if (obj.value.longValue() == val.longValue()) {
                    return obj;
                }
            }
            return null;
        }
    }

    public static enum MOBILE_TYPE {

        /** 安装计费 */
        TIME(1l, "自启截图"),
        /** 激活计费 */
        NUM(2l, "USB截图");

        public final Long value;
        public final String name;

        MOBILE_TYPE(Long value, String name) {
            this.value = value;
            this.name = name;
        }

        public static MOBILE_TYPE valueOf(Long val) {
            for (MOBILE_TYPE obj : values()) {
                if (obj.value.longValue() == val.longValue()) {
                    return obj;
                }
            }
            return null;
        }
    }

    public static enum ASSISTANT_ISCOMPEL {

        /** 强制升级 */
        TRUE(1l, "是"),
        /** 不强制升级 */
        FALSE(2l, "否");

        public final Long value;
        public final String name;

        ASSISTANT_ISCOMPEL(Long value, String name) {
            this.value = value;
            this.name = name;
        }

        public static ASSISTANT_ISCOMPEL valueOf(Long val) {
            for (ASSISTANT_ISCOMPEL obj : values()) {
                if (obj.value.longValue() == val.longValue()) {
                    return obj;
                }
            }
            return null;
        }
    }

    public static enum ASSISTANT_PLATFORM {
        /** 全部平台 */
        all(0l, "全部平台"),
        /** 安卓 */
        android(1l, "ANDROID"),
        /** ios */
        ios(2l, "IOS");

        public final Long value;
        public final String name;

        ASSISTANT_PLATFORM(Long value, String name) {
            this.value = value;
            this.name = name;
        }

        public static ASSISTANT_PLATFORM valueOf(Long val) {
            for (ASSISTANT_PLATFORM obj : values()) {
                if (obj.value.longValue() == val.longValue()) {
                    return obj;
                }
            }
            return null;
        }
    }

    public static enum VIWEPAGER_TYPE {
        /** 装机宝 */
        one(1l, "装机宝"),
        /** 客户宝 */
        two(2l, "客户宝"),
        /** 装机宝box */
        three(3l, "装机宝box");

        public final Long value;
        public final String name;

        VIWEPAGER_TYPE(Long value, String name) {
            this.value = value;
            this.name = name;
        }

        public static VIWEPAGER_TYPE valueOf(Long val) {
            for (VIWEPAGER_TYPE obj : values()) {
                if (obj.value.longValue() == val.longValue()) {
                    return obj;
                }
            }
            return null;
        }
    }

    public static enum VIWEPAGER_STATE {
        /** 下架 */
        zero(0l, "下架"),
        /** 上架 */
        one(1l, "上架"),
        /** 客户宝 */
        two(2l, "即将上架");

        public final Long value;
        public final String name;

        VIWEPAGER_STATE(Long value, String name) {
            this.value = value;
            this.name = name;
        }

        public static VIWEPAGER_STATE valueOf(Long val) {
            for (VIWEPAGER_STATE obj : values()) {
                if (obj.value.longValue() == val.longValue()) {
                    return obj;
                }
            }
            return null;
        }
    }

    public static enum APPLE_MODEL {
        iPad("iPad1,1", "iPad"), iPad2("iPad2,1", "iPad 2"), iPad3("iPad3,1", "iPad 3"), iPadmini("iPad2,5", "iPad mini"), iPadmini2("iPad4,4", "iPad mini 2"), iPadmini3("iPad4,7", "iPad mini 3"), iPadAir("iPad4,1", "iPad Air"), iPadAir2("iPad5,3", "iPad Air 2"), iPhone4(
                "iPhone3,1", "iPhone 4"), iPhone4S("iPhone4,1", "iPhone 4S"), iPhone5("iPhone5,1", "iPhone 5"), iPhone5C("iPhone5,3", "iPhone 5C"), iPhone5S("iPhone6,1", "iPhone 5S"), iPhone6("iPhone7,2", "iPhone 6"), iPhone6Plus("iPhone7,1", "iPhone 6 Plus"), iPadmini4(
                "iPad5,1", "iPad mini 4"), iPadPro("iPad6,7", "iPad Pro"), iPhone6s("iPhone8,1", "iPhone 6s"), iPhone6sPlus("iPhone8,2", "iPhone 6s Plus");

        public final String value;
        public final String name;

        APPLE_MODEL(String value, String name) {
            this.value = value;
            this.name = name;
        }

        public static APPLE_MODEL valOf(String val) {
            for (APPLE_MODEL obj : values()) {
                if (obj.value.equals(val)) {
                    return obj;
                }
            }
            return null;
        }
    }

}
