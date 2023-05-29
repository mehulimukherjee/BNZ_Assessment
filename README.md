# BNZ_Assessment
Assessment for BNZ Senior API Interview

A Weather API (REST API) which in turn calls the Open-Meteo API to fetch the weather report for the locations like Wellington and Auckland.

Note: The GITHUB didn't allow me to upload more than 25MB, which is why I couldn't upload all the classes in the target folder. So kindly build the project as **mvn clean install** first.
Then run the project as Spring boot application to start the server..

Go to any client browser to hit the url: **http://localhost:8080/WeatherForecast**
It will take you to the Authorization Server, and you have to login with credentials: **mehuli/mehuli**
once you are logged in, it will show you the first page.

Hit the url: **http://localhost:8080/WeatherForecast/Wellington**
It will fetch the Weather data for Wellington from the Open-Meteo api and show a json response body.
The Weather api is actually calling the endpoint "[https://api.open-meteo.com/v1/forecast?latitude=-41.29&longitude=174.78&hourly=temperature_2m](https://api.open-meteo.com/v1/forecast?latitude=-41.29&longitude=174.78&hourly=temperature_2m)" exposed by Open-Meteo for Wellington location

Similarly, hit the url: **http://localhost:8080/WeatherForecast/Auckland**
It will fetch the Weather data for Auckland from the Open-Meteo api and show a json response body.
The Weather api is actually calling the endpoint "[https://api.open-meteo.com/v1/forecast?latitude=-41.29&longitude=174.78&hourly=temperature_2m](https://api.open-meteo.com/v1/forecast?latitude=-36.85&longitude=174.76&hourly=temperature_2m)" exposed by Open-Meteo for Auckland location

If you try giving any other location instead of the above two, it will give an error response with HTTP error code.

Authorization Server is created on OAuth2 protocol implemented by Spring Authorization Server.
The caching is be applied on the method level by the use of Spring annotation @Cacheable. Each time a method marked with this @Cacheable is called, the caching behavior implies.

The REST API (Weather) is based on the basic method of Request-Response to communicate over the network, based on the three-tier architecture,consists of a single presentation tier, logic tier, and data access tier.
Controller- Presentation layer [Gets the request from the browser and directs it to the Service layer.]
Service- Logic layer [Actual implementation of the logic happens here.]
Repository- DAO layer [Here, an HttpClient is used to send requests hitting an url exposed by the third party API and retrieve its response.]
One 'Get' method is implemented to fetch the data from the third party API.
