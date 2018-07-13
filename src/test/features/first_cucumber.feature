#language: zh-CN
  功能: 163邮箱登录功能
    @Automation @p0
    场景: 测试正确账号密码登录
#      当 并且 这些关键字可以使用*代替（*号后面需要加一个空格），不推荐
      当打开163邮箱网站
#      ""加双引号之后，在对应的java文件中可以当参数传入方法中
      并且在账号框输入"test"
      并且在密码框输入"password"
      当点击登录按钮
      那么登录成功

#场景大纲中可以添加数据驱动。
    @Automation @p0
    场景大纲: 登录2
      当打开163邮箱网站
      当在账号框输入"<username>"
      而且在密码框输入"<password>"
      那么登录成功

      例子:
          | username | password |
          | test1    | pwd1 |
          | test2    | pwd2 |
          | test3    | pwd3 |

    @Automation @p0
      场景大纲: 正确账号登录2
        当打开163邮箱网站
        当用"<user>"账号和密码"<pwd>"登录
        那么登录成功

        例子:
          | user  | pwd  |
          | test1 | pwd1 |
          | test2 | pwd2 |
          | test3 | pwd3 |
