2020.5.25:
部署时报错:
SpringBootServletInitiailzer启动报嵌套异常
原因:
依赖性问题-->“SpringBootServletInitializer无法解析为类型”
解决办法:
修改引入包:
import org.springframework.boot.web.support.SpringBootServletInitializer;
改成:
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
pom.xml下
<parent>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-parent</artifactId>
<version>1.5.6.RELEASE</version>
</parent>
版本可改为1.5.6-->先前包等级为2.0.4;可根据情况适当选择包