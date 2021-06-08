# Microservices - Mathematical and Statistics

This repository has two Spring Boot projects that communicate with each other to provide mathematical and statistics values. Despite its simplicity, the purpose intended for this code is to practice microservice architecture as well as Docker concepts. 

## Technologies

- Java 15;
- Spring Boot 2.4.6;
- Docker 3.9;

## Endpoints

### Get sum of n numbers

- /math/sum?values=1,3,4,5

### Get avg of n numbers

- /statistics/avg?values=1,3,4,5

## How to Run

1. First you must get into each project and generate its jar, by typing the line below:

    `$ mvn clean package`

2. Then, it's time to generate the math, stats and gateway docker image. Inside of each project, type:

    `$ docker build -t image:latest .`

3. Inside the root folder, just run the code bellow to make the three images avaliable.

    `$ docker compose up`

After these 3 steps, the endpoints will be avaliable on port 8080.