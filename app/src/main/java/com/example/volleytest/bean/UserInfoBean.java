package com.example.volleytest.bean;

import java.util.List;

/**
 * Created by Shanzi on 2018/4/11.
 */

public class UserInfoBean {
    /**
     * data : {"uid":"2416","account":"zhirio_a165646692c022dae1aa53a59f4dc837","nickname":"151***5113","sex":"1","age":"26","birthday":"1992-08-20","signature":"这家伙很懒,什么都没有留下。","pos_province":"天津","pos_city":"西青","pos_district":"0","pos_community":"中国","score1":"48","score2":"6","score3":"5","score4":"407","con_check":"1","total_check":"6","reg_time":"1521777959","last_login_time":"1523429679","last_use_time":"0","position":"","qq_name":"","wx_name":"","wb_name":"","username":"zhirio_d41d8cd98f00b204e9800998ecf8427e","email":"","mobile":"15122835113","zone":"86","real_nickname":"151***5113","friendly":"48","prestige":"6","currency":"5","score":"407","title":"Lv2 知日一段","rank_link":[],"expand_info":{"useless":"useless"},"attest":{"has":1,"info":{"id":"29","uid":"2416","attest_type_id":"1","company_name":"","fullname":"","name":"$_$"}},"fans":"1","following":"1","weibocount":"5","is_following":"0","is_followed":"0","level":{"current":"Lv2 知日一段","before_level_need":301,"next":"Lv3 知日二段","upgrade_require":2001,"left":1594,"percent":"6.2"},"now_shop_score":"48","province":null,"city":null,"district":null,"last_login_date":"2018-04-11 02:54:39pm","last_use_date":"1970-01-01 08:00:00am","is_self":1,"user_group":["1"],"is_admin":false,"message_unread_count":"2","avatar32":"http://oss.chinichi.cn/images/Avatar/2416/5acb0e0d585a6.jpeg","avatar64":"http://oss.chinichi.cn/images/Avatar/2416/5acb0e0d585a6.jpeg","avatar128":"http://oss.chinichi.cn/images/Avatar/2416/5acb0e0d585a6.jpeg","avatar256":"http://oss.chinichi.cn/images/Avatar/2416/5acb0e0d585a6.jpeg","background":"http://oss.chinichi.cn/images/Avatar/2416/5ac2f383473ab.jpeg","avatar512":"http://oss.chinichi.cn/images/Avatar/2416/5acb0e0d585a6.jpeg","tags":[{"id":"12","title":"日剧电影","status":"1","pid":"0","sort":"12","ctype":"system","newscate":"0","label_bg":"1452"},{"id":"11","title":"匠人故事","status":"1","pid":"0","sort":"11","ctype":"system","newscate":"0","label_bg":"1451"},{"id":"9","title":"日式设计","status":"1","pid":"0","sort":"9","ctype":"system","newscate":"0","label_bg":"1449"},{"id":"4","title":"日本良品","status":"1","pid":"0","sort":"4","ctype":"system","newscate":"4","label_bg":"1529"},{"id":"1","title":"流行时尚","status":"1","pid":"0","sort":"1","ctype":"system","newscate":"1","label_bg":"1442"}],"is_con_account":"1","adminAuth":"0","auth":{"uid":"2416","username":"zhirio_d41d8cd98f00b204e9800998ecf8427e","last_login_time":"1523429679","role_id":null,"audit":"","mobile":"15122835113","openid_qq":"","openid_wx":"","openid_wb":""},"scoreformula":"综合积分 = 知日币 + 友好度*10 + 贡献度*5","scoreimg":"https://shuinsen.oss-cn-shanghai.aliyuncs.com/images/scoreback.png"}
     * code : 200
     * info : 返回成功
     */

    private DataBean data;
    private int code;
    private String info;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public static class DataBean {
        /**
         * uid : 2416
         * account : zhirio_a165646692c022dae1aa53a59f4dc837
         * nickname : 151***5113
         * sex : 1
         * age : 26
         * birthday : 1992-08-20
         * signature : 这家伙很懒,什么都没有留下。
         * pos_province : 天津
         * pos_city : 西青
         * pos_district : 0
         * pos_community : 中国
         * score1 : 48
         * score2 : 6
         * score3 : 5
         * score4 : 407
         * con_check : 1
         * total_check : 6
         * reg_time : 1521777959
         * last_login_time : 1523429679
         * last_use_time : 0
         * position :
         * qq_name :
         * wx_name :
         * wb_name :
         * username : zhirio_d41d8cd98f00b204e9800998ecf8427e
         * email :
         * mobile : 15122835113
         * zone : 86
         * real_nickname : 151***5113
         * friendly : 48
         * prestige : 6
         * currency : 5
         * score : 407
         * title : Lv2 知日一段
         * rank_link : []
         * expand_info : {"useless":"useless"}
         * attest : {"has":1,"info":{"id":"29","uid":"2416","attest_type_id":"1","company_name":"","fullname":"","name":"$_$"}}
         * fans : 1
         * following : 1
         * weibocount : 5
         * is_following : 0
         * is_followed : 0
         * level : {"current":"Lv2 知日一段","before_level_need":301,"next":"Lv3 知日二段","upgrade_require":2001,"left":1594,"percent":"6.2"}
         * now_shop_score : 48
         * province : null
         * city : null
         * district : null
         * last_login_date : 2018-04-11 02:54:39pm
         * last_use_date : 1970-01-01 08:00:00am
         * is_self : 1
         * user_group : ["1"]
         * is_admin : false
         * message_unread_count : 2
         * avatar32 : http://oss.chinichi.cn/images/Avatar/2416/5acb0e0d585a6.jpeg
         * avatar64 : http://oss.chinichi.cn/images/Avatar/2416/5acb0e0d585a6.jpeg
         * avatar128 : http://oss.chinichi.cn/images/Avatar/2416/5acb0e0d585a6.jpeg
         * avatar256 : http://oss.chinichi.cn/images/Avatar/2416/5acb0e0d585a6.jpeg
         * background : http://oss.chinichi.cn/images/Avatar/2416/5ac2f383473ab.jpeg
         * avatar512 : http://oss.chinichi.cn/images/Avatar/2416/5acb0e0d585a6.jpeg
         * tags : [{"id":"12","title":"日剧电影","status":"1","pid":"0","sort":"12","ctype":"system","newscate":"0","label_bg":"1452"},{"id":"11","title":"匠人故事","status":"1","pid":"0","sort":"11","ctype":"system","newscate":"0","label_bg":"1451"},{"id":"9","title":"日式设计","status":"1","pid":"0","sort":"9","ctype":"system","newscate":"0","label_bg":"1449"},{"id":"4","title":"日本良品","status":"1","pid":"0","sort":"4","ctype":"system","newscate":"4","label_bg":"1529"},{"id":"1","title":"流行时尚","status":"1","pid":"0","sort":"1","ctype":"system","newscate":"1","label_bg":"1442"}]
         * is_con_account : 1
         * adminAuth : 0
         * auth : {"uid":"2416","username":"zhirio_d41d8cd98f00b204e9800998ecf8427e","last_login_time":"1523429679","role_id":null,"audit":"","mobile":"15122835113","openid_qq":"","openid_wx":"","openid_wb":""}
         * scoreformula : 综合积分 = 知日币 + 友好度*10 + 贡献度*5
         * scoreimg : https://shuinsen.oss-cn-shanghai.aliyuncs.com/images/scoreback.png
         */

        private String uid;
        private String account;
        private String nickname;
        private String sex;
        private String age;
        private String birthday;
        private String signature;
        private String pos_province;
        private String pos_city;
        private String pos_district;
        private String pos_community;
        private String score1;
        private String score2;
        private String score3;
        private String score4;
        private String con_check;
        private String total_check;
        private String reg_time;
        private String last_login_time;
        private String last_use_time;
        private String position;
        private String qq_name;
        private String wx_name;
        private String wb_name;
        private String username;
        private String email;
        private String mobile;
        private String zone;
        private String real_nickname;
        private String friendly;
        private String prestige;
        private String currency;
        private String score;
        private String title;
        private ExpandInfoBean expand_info;
        private AttestBean attest;
        private String fans;
        private String following;
        private String weibocount;
        private String is_following;
        private String is_followed;
        private LevelBean level;
        private String now_shop_score;
        private Object province;
        private Object city;
        private Object district;
        private String last_login_date;
        private String last_use_date;
        private int is_self;
        private boolean is_admin;
        private String message_unread_count;
        private String avatar32;
        private String avatar64;
        private String avatar128;
        private String avatar256;
        private String background;
        private String avatar512;
        private String is_con_account;
        private String adminAuth;
        private AuthBean auth;
        private String scoreformula;
        private String scoreimg;
        private List<?> rank_link;
        private List<String> user_group;
        private List<TagsBean> tags;

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public String getPos_province() {
            return pos_province;
        }

        public void setPos_province(String pos_province) {
            this.pos_province = pos_province;
        }

        public String getPos_city() {
            return pos_city;
        }

        public void setPos_city(String pos_city) {
            this.pos_city = pos_city;
        }

        public String getPos_district() {
            return pos_district;
        }

        public void setPos_district(String pos_district) {
            this.pos_district = pos_district;
        }

        public String getPos_community() {
            return pos_community;
        }

        public void setPos_community(String pos_community) {
            this.pos_community = pos_community;
        }

        public String getScore1() {
            return score1;
        }

        public void setScore1(String score1) {
            this.score1 = score1;
        }

        public String getScore2() {
            return score2;
        }

        public void setScore2(String score2) {
            this.score2 = score2;
        }

        public String getScore3() {
            return score3;
        }

        public void setScore3(String score3) {
            this.score3 = score3;
        }

        public String getScore4() {
            return score4;
        }

        public void setScore4(String score4) {
            this.score4 = score4;
        }

        public String getCon_check() {
            return con_check;
        }

        public void setCon_check(String con_check) {
            this.con_check = con_check;
        }

        public String getTotal_check() {
            return total_check;
        }

        public void setTotal_check(String total_check) {
            this.total_check = total_check;
        }

        public String getReg_time() {
            return reg_time;
        }

        public void setReg_time(String reg_time) {
            this.reg_time = reg_time;
        }

        public String getLast_login_time() {
            return last_login_time;
        }

        public void setLast_login_time(String last_login_time) {
            this.last_login_time = last_login_time;
        }

        public String getLast_use_time() {
            return last_use_time;
        }

        public void setLast_use_time(String last_use_time) {
            this.last_use_time = last_use_time;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getQq_name() {
            return qq_name;
        }

        public void setQq_name(String qq_name) {
            this.qq_name = qq_name;
        }

        public String getWx_name() {
            return wx_name;
        }

        public void setWx_name(String wx_name) {
            this.wx_name = wx_name;
        }

        public String getWb_name() {
            return wb_name;
        }

        public void setWb_name(String wb_name) {
            this.wb_name = wb_name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getReal_nickname() {
            return real_nickname;
        }

        public void setReal_nickname(String real_nickname) {
            this.real_nickname = real_nickname;
        }

        public String getFriendly() {
            return friendly;
        }

        public void setFriendly(String friendly) {
            this.friendly = friendly;
        }

        public String getPrestige() {
            return prestige;
        }

        public void setPrestige(String prestige) {
            this.prestige = prestige;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public ExpandInfoBean getExpand_info() {
            return expand_info;
        }

        public void setExpand_info(ExpandInfoBean expand_info) {
            this.expand_info = expand_info;
        }

        public AttestBean getAttest() {
            return attest;
        }

        public void setAttest(AttestBean attest) {
            this.attest = attest;
        }

        public String getFans() {
            return fans;
        }

        public void setFans(String fans) {
            this.fans = fans;
        }

        public String getFollowing() {
            return following;
        }

        public void setFollowing(String following) {
            this.following = following;
        }

        public String getWeibocount() {
            return weibocount;
        }

        public void setWeibocount(String weibocount) {
            this.weibocount = weibocount;
        }

        public String getIs_following() {
            return is_following;
        }

        public void setIs_following(String is_following) {
            this.is_following = is_following;
        }

        public String getIs_followed() {
            return is_followed;
        }

        public void setIs_followed(String is_followed) {
            this.is_followed = is_followed;
        }

        public LevelBean getLevel() {
            return level;
        }

        public void setLevel(LevelBean level) {
            this.level = level;
        }

        public String getNow_shop_score() {
            return now_shop_score;
        }

        public void setNow_shop_score(String now_shop_score) {
            this.now_shop_score = now_shop_score;
        }

        public Object getProvince() {
            return province;
        }

        public void setProvince(Object province) {
            this.province = province;
        }

        public Object getCity() {
            return city;
        }

        public void setCity(Object city) {
            this.city = city;
        }

        public Object getDistrict() {
            return district;
        }

        public void setDistrict(Object district) {
            this.district = district;
        }

        public String getLast_login_date() {
            return last_login_date;
        }

        public void setLast_login_date(String last_login_date) {
            this.last_login_date = last_login_date;
        }

        public String getLast_use_date() {
            return last_use_date;
        }

        public void setLast_use_date(String last_use_date) {
            this.last_use_date = last_use_date;
        }

        public int getIs_self() {
            return is_self;
        }

        public void setIs_self(int is_self) {
            this.is_self = is_self;
        }

        public boolean isIs_admin() {
            return is_admin;
        }

        public void setIs_admin(boolean is_admin) {
            this.is_admin = is_admin;
        }

        public String getMessage_unread_count() {
            return message_unread_count;
        }

        public void setMessage_unread_count(String message_unread_count) {
            this.message_unread_count = message_unread_count;
        }

        public String getAvatar32() {
            return avatar32;
        }

        public void setAvatar32(String avatar32) {
            this.avatar32 = avatar32;
        }

        public String getAvatar64() {
            return avatar64;
        }

        public void setAvatar64(String avatar64) {
            this.avatar64 = avatar64;
        }

        public String getAvatar128() {
            return avatar128;
        }

        public void setAvatar128(String avatar128) {
            this.avatar128 = avatar128;
        }

        public String getAvatar256() {
            return avatar256;
        }

        public void setAvatar256(String avatar256) {
            this.avatar256 = avatar256;
        }

        public String getBackground() {
            return background;
        }

        public void setBackground(String background) {
            this.background = background;
        }

        public String getAvatar512() {
            return avatar512;
        }

        public void setAvatar512(String avatar512) {
            this.avatar512 = avatar512;
        }

        public String getIs_con_account() {
            return is_con_account;
        }

        public void setIs_con_account(String is_con_account) {
            this.is_con_account = is_con_account;
        }

        public String getAdminAuth() {
            return adminAuth;
        }

        public void setAdminAuth(String adminAuth) {
            this.adminAuth = adminAuth;
        }

        public AuthBean getAuth() {
            return auth;
        }

        public void setAuth(AuthBean auth) {
            this.auth = auth;
        }

        public String getScoreformula() {
            return scoreformula;
        }

        public void setScoreformula(String scoreformula) {
            this.scoreformula = scoreformula;
        }

        public String getScoreimg() {
            return scoreimg;
        }

        public void setScoreimg(String scoreimg) {
            this.scoreimg = scoreimg;
        }

        public List<?> getRank_link() {
            return rank_link;
        }

        public void setRank_link(List<?> rank_link) {
            this.rank_link = rank_link;
        }

        public List<String> getUser_group() {
            return user_group;
        }

        public void setUser_group(List<String> user_group) {
            this.user_group = user_group;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public static class ExpandInfoBean {
            /**
             * useless : useless
             */

            private String useless;

            public String getUseless() {
                return useless;
            }

            public void setUseless(String useless) {
                this.useless = useless;
            }
        }

        public static class AttestBean {
            /**
             * has : 1
             * info : {"id":"29","uid":"2416","attest_type_id":"1","company_name":"","fullname":"","name":"$_$"}
             */

            private int has;
            private InfoBean info;

            public int getHas() {
                return has;
            }

            public void setHas(int has) {
                this.has = has;
            }

            public InfoBean getInfo() {
                return info;
            }

            public void setInfo(InfoBean info) {
                this.info = info;
            }

            public static class InfoBean {
                /**
                 * id : 29
                 * uid : 2416
                 * attest_type_id : 1
                 * company_name :
                 * fullname :
                 * name : $_$
                 */

                private String id;
                private String uid;
                private String attest_type_id;
                private String company_name;
                private String fullname;
                private String name;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public String getAttest_type_id() {
                    return attest_type_id;
                }

                public void setAttest_type_id(String attest_type_id) {
                    this.attest_type_id = attest_type_id;
                }

                public String getCompany_name() {
                    return company_name;
                }

                public void setCompany_name(String company_name) {
                    this.company_name = company_name;
                }

                public String getFullname() {
                    return fullname;
                }

                public void setFullname(String fullname) {
                    this.fullname = fullname;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }

        public static class LevelBean {
            /**
             * current : Lv2 知日一段
             * before_level_need : 301
             * next : Lv3 知日二段
             * upgrade_require : 2001
             * left : 1594
             * percent : 6.2
             */

            private String current;
            private int before_level_need;
            private String next;
            private int upgrade_require;
            private int left;
            private String percent;

            public String getCurrent() {
                return current;
            }

            public void setCurrent(String current) {
                this.current = current;
            }

            public int getBefore_level_need() {
                return before_level_need;
            }

            public void setBefore_level_need(int before_level_need) {
                this.before_level_need = before_level_need;
            }

            public String getNext() {
                return next;
            }

            public void setNext(String next) {
                this.next = next;
            }

            public int getUpgrade_require() {
                return upgrade_require;
            }

            public void setUpgrade_require(int upgrade_require) {
                this.upgrade_require = upgrade_require;
            }

            public int getLeft() {
                return left;
            }

            public void setLeft(int left) {
                this.left = left;
            }

            public String getPercent() {
                return percent;
            }

            public void setPercent(String percent) {
                this.percent = percent;
            }
        }

        public static class AuthBean {
            /**
             * uid : 2416
             * username : zhirio_d41d8cd98f00b204e9800998ecf8427e
             * last_login_time : 1523429679
             * role_id : null
             * audit :
             * mobile : 15122835113
             * openid_qq :
             * openid_wx :
             * openid_wb :
             */

            private String uid;
            private String username;
            private String last_login_time;
            private Object role_id;
            private String audit;
            private String mobile;
            private String openid_qq;
            private String openid_wx;
            private String openid_wb;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getLast_login_time() {
                return last_login_time;
            }

            public void setLast_login_time(String last_login_time) {
                this.last_login_time = last_login_time;
            }

            public Object getRole_id() {
                return role_id;
            }

            public void setRole_id(Object role_id) {
                this.role_id = role_id;
            }

            public String getAudit() {
                return audit;
            }

            public void setAudit(String audit) {
                this.audit = audit;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getOpenid_qq() {
                return openid_qq;
            }

            public void setOpenid_qq(String openid_qq) {
                this.openid_qq = openid_qq;
            }

            public String getOpenid_wx() {
                return openid_wx;
            }

            public void setOpenid_wx(String openid_wx) {
                this.openid_wx = openid_wx;
            }

            public String getOpenid_wb() {
                return openid_wb;
            }

            public void setOpenid_wb(String openid_wb) {
                this.openid_wb = openid_wb;
            }
        }

        public static class TagsBean {
            /**
             * id : 12
             * title : 日剧电影
             * status : 1
             * pid : 0
             * sort : 12
             * ctype : system
             * newscate : 0
             * label_bg : 1452
             */

            private String id;
            private String title;
            private String status;
            private String pid;
            private String sort;
            private String ctype;
            private String newscate;
            private String label_bg;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getPid() {
                return pid;
            }

            public void setPid(String pid) {
                this.pid = pid;
            }

            public String getSort() {
                return sort;
            }

            public void setSort(String sort) {
                this.sort = sort;
            }

            public String getCtype() {
                return ctype;
            }

            public void setCtype(String ctype) {
                this.ctype = ctype;
            }

            public String getNewscate() {
                return newscate;
            }

            public void setNewscate(String newscate) {
                this.newscate = newscate;
            }

            public String getLabel_bg() {
                return label_bg;
            }

            public void setLabel_bg(String label_bg) {
                this.label_bg = label_bg;
            }
        }
    }
}
