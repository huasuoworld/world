FROM         ubuntu
MAINTAINER    linux
#把java与tomcat添加到容器中
COPY jdk1.8.0_121/ /usr/local/jdk1.8.0_121/
COPY apache-tomcat-9.0.0.M17/ /usr/local/apache-tomcat-9.0.0.M17/
#配置java与tomcat环境变量
ENV JAVA_HOME /usr/local/jdk1.8.0_121
ENV CLASSPATH $JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
ENV CATALINA_HOME /usr/local/apache-tomcat-9.0.0.M17
ENV CATALINA_BASE /usr/local/apache-tomcat-9.0.0.M17
ENV PATH $PATH:$JAVA_HOME/bin:$CATALINA_HOME/lib:$CATALINA_HOME/bin
#容器运行时监听的端口
EXPOSE  8080
#设置tomcat 自启动  
CMD [ "/usr/local/apache-tomcat-9.0.0.M17/bin/catalina.sh", "run" ]
