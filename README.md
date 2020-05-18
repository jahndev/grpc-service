# agent-slot-service

A simple standalone gRPC client/server spike based on the hello world example 
in [grpc-java](https://github.com/grpc/grpc-java/tree/master/examples), just 
to get sense of how to layout a project.
 
To build the project:
 
```bash
     ./wgradle clean test installDist
```
 
To run the server:
 
```bash
 ./build/install/agent-slot-service/bin/server
  
```

To start the REST API proxy:

```bash
go run src/main/rest_api.go
```

This will enable the REST API on port 8080 (you can change the port on the rest_api.go file), so for example you will be able to access: 

```bash
GET http://localhost:8080/v1/products
POST http://localhost:8080/v1/products
```

This will end up calling the server you started in step 1 (./build/install/agent-slot-service/bin/server), so it is required to be running.

## How to build/update the REST API
 
To build/update the REST API first read this post: https://grpc-ecosystem.github.io/grpc-gateway/docs/usage.html.

After reading and following the steps provided in the previous link, and assuming you updated the proto files according to your needs, you should be able to execute:

```bash
protoc -I/usr/local/include -I. \
  -I$GOPATH/src \
  -I$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --go_out=plugins=grpc:. \
  src/main/proto/product_service.proto
```
This will generate the file **product_service.pb.go** in the same directory where your .proto file is.

Then execute:

```bash
  protoc -I/usr/local/include -I. \
  -I$GOPATH/src \
  -I$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --grpc-gateway_out=logtostderr=true,grpc_api_configuration=src/main/proto/product_service.yaml:. \
  src/main/proto/product_service.proto
```

This will generate the file **product_service.pb.gw.go** n the same directory where your .proto file is.

After executing the two commands, your proto directory should contain the following files, updated:

* product_service.proto: Your proto definition
* product_service.pb.go: gRPC stub
* product_service.pb.gw.go: Reverse proxy
