# BTC-Currency-API
The application was developed for users who signed up using their email address. 
By default, subscribers will receive the current exchange rate of bitcoin to the hryvnia every hour to the email specified when was subscribed to this service.


![Снимок экрана 1](https://user-images.githubusercontent.com/63095184/182211659-44d6fb4f-3811-448c-8b84-79feec009f85.png)


![Снимок экрана 2](https://user-images.githubusercontent.com/63095184/182211662-d9e813b1-0bc0-4c5e-a795-a9f382bf8dac.png)


![Снимок экрана 3](https://user-images.githubusercontent.com/63095184/182211663-f97f299d-5957-4450-84d5-b5b119f0303f.png)


![Снимок экрана 5](https://user-images.githubusercontent.com/63095184/182211667-827e4dbd-45d1-4a8b-af96-c3d0a38a6bed.png)


How to run BTC-Currency-API application:

Use Docker container and run this command:

(Don`t forget to replace ***PUT_YOUR_USERNAME*** and ***PUT_YOUR_PASSWORD*** for yours real credentials)

```
docker run -d --name btc -e FILEPATH="emails.txt" -e MAIL_USERNAME=PUT_YOUR_USERNAME -e MAIL_PASSWORD=PUT_YOUR_PASSWORD -p 8080:8080 sanderfuck/btc-currency-api
```

For check out in web-browser use this [link](http://localhost:8080/swagger-ui/)
