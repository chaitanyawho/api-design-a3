# API Design Assignment 3

## protobufs

All protobufs are located in the root of the : [proto](src%2Fmain%2Fproto)

## Server

The [server](server) module implements the service, exposing rpc endpoints on port 9090.

- To build the server run
  ```mvn clean install```

- To start the server on port 9090 run the project jar file in the target folder
  ```java -jar \server\target\server-grpc-0.0.1-SNAPSHOT.jar```

## Client

The [client](client) module is a simple console application that implements the client service which
consumes the server (consumes a
server running on port 9090 by default).

