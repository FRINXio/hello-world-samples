For customers
=============
To run the docker container, customer's secret token needs to be supplied as described in frinx.io website.
Either set TOKEN variable and pass it as following:
```
docker run -it com.customer/hello_frinx_odl frinx.createtoken.force $TOKEN
```
Or (preferred) create a file ~/.local/share/frinx_odl/frinx.license.cfg with content:
```
token=your_token_goes_here
```
Then, you can run the docker container with:
```
docker run -it -v ~/.local/share/frinx_odl:/root/.local/share/frinx_odl com.customer/hello_frinx_odl
```

Running as a daemon:
```
CONTAINER_ID=$(docker run -d com.customer/hello_frinx_odl server frinx.createtoken.force $TOKEN)
```

Connecting to karaf console of a running container:
```
docker exec -it $CONTAINER_ID bin/client -u karaf
```

For developers/testers
======================
Usage:
```
mvn install - build docker image locally
mvn deploy  - push the image to docker registry
```

Profiles:
 latest - tag local tag with 'latest' in package phase, push tag remotely in install phase

Running:
Debugging licensing calls:
```
docker run --rm -it -e JAVA_OPTS=-Dfrinx.debug=true com.customer/hello_frinx_odl frinx.createtoken $TOKEN
```

Connecting client via ssh:
obtain ip via docker-inspect $CONTAINER_ID
```
ssh -p 8101 karaf@<container_IP>             (default password karaf)
```
