# springmvchibernateoauth2
Project samplcontains the Spring MVC project with hibernate and Oauth2 xml based configuration



API hit to get the token

http://localhost:8080/SpringRestCrud/oauth/token?grant_type=password&client_id=restapp&client_secret=restapp&username=jimi&password=jimispassword



eg. API hit

http://localhost:8080/SpringRestCrud/api/users/countries  == GET
headers {
	"Content-Type" : "application/json",
	"Authorization"  : "Bearer 303c9d81-d578-4289-ac5b-e71f8d9468b5"
}


http://localhost:8080/testwar/api/fixtures/getAllScheduledMatches/2
headers {
	"Content-Type" : "application/json",
	"Authorization"  : "Bearer 303c9d81-d578-4289-ac5b-e71f8d9468b5"
}