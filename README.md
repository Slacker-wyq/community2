##懒虫社区

##资料
[spring文档 ](https://spring.io/guides)
[Github OAuth Docs](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)
[MySQL](https://www.runoob.com/)
[Mybatis](http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure)
[Spring data](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#spring-boot-starter-jdbc)


##脚本
```sql
create table USER
(
  ID           INTEGER AUTO_INCREMENT primary key NOT NULL,
  ACCOUNT_ID   VARCHAR(100),
  NAME         VARCHAR(50),
  TOKEN        CHAR(36),
  GMT_CREATE   BIGINT,
  GMT_MODIFIED BIGINT
);
```