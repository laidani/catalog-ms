# REST API EXAMPLE
This API is an example to show you, how to use the services of Micro-service store-ms [store-ms](https://github.com/laidani/store-ms)

## Run

This api considered as an micro service using spring cloud, to run it you have to run [eureka-ms](https://github.com/laidani/eureka-ms), and [store-ms](https://github.com/laidani/store-ms)

### Maven
To run this API, clone it, run clean install, then :
    
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

This API use [swagger](https://swagger.io/), to access to swager ui you can use this url :

    http://localhost:8085/swagger-ui.html

### Code

This code based on [clean architect](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)
