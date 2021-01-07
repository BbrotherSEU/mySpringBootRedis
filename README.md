[![Redis](https://img.shields.io/badge/redis-V6.X-yellow)](http://www.redis.cn/)

# mySpringBootRedis
> This project will include all you need about Spring Boot and New tech.

## how to write README.md
https://github.com/252590770/GitHub-Flavored-Markdown

## 1. Integrate with Swagger UI

http://localhost:8081/swagger-ui.html

## 2. Redis Install
https://redis.io/download

- Way One
```
$ sudo add-apt-repository ppa:redislabs/redis
$ sudo apt-get update
$ sudo apt-get install redis
```
- Way Two  
From source code  
Download, extract and compile Redis with:
```
$ wget https://download.redis.io/releases/redis-6.0.9.tar.gz
$ tar xzf redis-6.0.9.tar.gz
$ cd redis-6.0.9
$ make
```
The binaries that are now compiled are available in the src directory. Run Redis with:
```
$ src/redis-server
```
You can interact with Redis using the built-in client:
```
$ src/redis-cli
redis> set foo bar
OK
redis> get foo
"bar"
```