# elk-log4j2-springboot-docker

# =========== socket type =================

before running the application run following command in socket-type directory : </br>

`docker-compose -f docker-compose.yml up --build`
</br>
you can see kibana via this address : http://localhost:5601 
</br>
create this index-pattern : logstash-*
</br>
run this command `mvn spring-boot:run` in socket-type directory inorder to running application on `http://localhost:8080`

</br>

you can see Application logs in kibana.

# =========== log-type filebeat ==========

 run following command in `log-type` directory : </br>
- `mvn clean install` 
- `mvn spring-boot:run`
- go to `http://localhost:8080`
- `docker-compose -f docker-compose.yml up --build`

you can see kibana via this address : http://localhost:5601 

create this index-pattern : beats-*

you can see Application logs in kibana

# =========== docker type filebeat ==========

 run following command in `docker-type` directory : </br>
- `mvn clean install`
- `docker-compose -f docker-compose.yml up --build`

you can see kibana via this address : http://localhost:5601 

create this index-pattern : beats-*

you can see Application logs in kibana
