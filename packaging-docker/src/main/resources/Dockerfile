FROM openjdk:8

MAINTAINER Frinx Support <support@frinx.io>

# apt-get according to https://docs.docker.com/engine/userguide/eng-image/dockerfile_best-practices/
RUN apt-get update && apt-get install -y less zip net-tools curl && rm -rf /var/lib/apt/lists/*
WORKDIR /opt

ADD *.zip /opt/
RUN unzip *.zip && rm *.zip && mv distribution-* distribution-frinx

# TODO: Verify that these are all of the ports
# Ports
# 162 - SNMP4SDN (only when started as root)
# 179 - BGP
# 1088 - JMX access
# 1790 - BGP/PCEP
# 1830 - Netconf
# 2400 - OSGi console
# 2550 - ODL Clustering
# 2551 - ODL Clustering
# 2552 - ODL Clustering
# 4189 - PCEP
# 4342 - Lisp Flow Mapping
# 5005 - JConsole
# 5666 - ODL Internal clustering RPC
# 6633 - OpenFlow
# 6640 - OVSDB
# 6653 - OpenFlow
# 7800 - ODL Clustering
# 8000 - Java debug access
# 8080 - OpenDaylight web portal
# 8101 - KarafSSH
# 8181 - MD-SAL RESTConf and DLUX
# 8383 - Netconf
# 12001 - ODL Clustering

EXPOSE 162 179 1088 1790 1830 2400 2550 2551 2552 4189 4342 5005 5666 6633 6640 6653 7800 8000 8080 8101 8181 8383 12001

WORKDIR /opt/distribution-frinx
ENTRYPOINT ["/opt/distribution-frinx/bin/karaf"]
