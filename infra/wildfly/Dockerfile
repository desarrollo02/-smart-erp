FROM quay.io/wildfly/wildfly:latest

USER root

RUN mkdir -p /opt/jboss/wildfly/modules/system/layers/base/org/postgresql/main

ADD https://jdbc.postgresql.org/download/postgresql-42.7.4.jar \
   /opt/jboss/wildfly/modules/system/layers/base/org/postgresql/main/postgresql.jar

COPY module.xml /opt/jboss/wildfly/modules/system/layers/base/org/postgresql/main/module.xml
COPY configure-ds.cli /opt/jboss/wildfly/bin/configure-ds.cli

RUN /opt/jboss/wildfly/bin/jboss-cli.sh --file=/opt/jboss/wildfly/bin/configure-ds.cli