# REST API EXAMPLE
This API is an example to show you, how to use the services of Micro-service store-ms [store-ms](https://github.com/laidani/store-ms)

## Run
### Maven

To run this API you can clone and run it, after clean and install :
    
    java -jar target/catalog-ms.jar
	
### Docker
To run this API via Docker you can follow this steps:
	
	docker build -f DockerFile -t store-ms .
	docker run -p 8083:8083 store-ms

### Documentation

The REST API to the example app is described below.

#### Get list of Products

##### Request

	GET /v0/products

curl
    
    curl -X GET http://localhost:8085/v0/products/

This API use swagger, to access to swager ui you can use this url :

    http://localhost:8085/swagger-ui.html

This api use clean architect for coding
