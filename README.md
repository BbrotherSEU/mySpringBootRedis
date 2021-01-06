[![PyPi Version](https://img.shields.io/pypi/v/mmdnn.svg)](https://pypi.org/project/mmdnn/)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)
[![Linux](https://travis-ci.org/Microsoft/MMdnn.svg?branch=master)](https://travis-ci.org/Microsoft/MMdnn)

# mySpringBootRedis

Integrate with Swagger UI

http://localhost:8081/swagger-ui.html


1. Redis Install
https://redis.io/download

Way One
$ sudo add-apt-repository ppa:redislabs/redis
$ sudo apt-get update
$ sudo apt-get install redis

Way Two
From source code
Download, extract and compile Redis with:

$ wget https://download.redis.io/releases/redis-6.0.9.tar.gz
$ tar xzf redis-6.0.9.tar.gz
$ cd redis-6.0.9
$ make
The binaries that are now compiled are available in the src directory. Run Redis with:

$ src/redis-server
You can interact with Redis using the built-in client:

$ src/redis-cli
redis> set foo bar
OK
redis> get foo
"bar"
