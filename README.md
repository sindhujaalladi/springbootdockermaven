# springbootdockermaven


this is basic springboot application integrated with docker via maven plugin .
for this we need to add our required code changes and below things:
a) create docker file 
b)add maven docker related maven plugin in pom.xml file 
below is part realted to docker

![image](https://user-images.githubusercontent.com/115841974/211714385-e7091e35-33dc-4a66-bf91-d6abccf5a719.png)
and need to do 
maven install 
by maven docker plugin it will create docker image and tag to repository and push to docker hub 
![image](https://user-images.githubusercontent.com/115841974/211714567-6646c70d-f5d3-45f4-99b3-c534c296a9b5.png)

docker images is created and tagged to repository 
but in my case am unable to push to docker hb due to access denied error 
![image](https://user-images.githubusercontent.com/115841974/211714698-8054962f-cae2-4055-b8f1-0d819e75bf1e.png)

so i pushed docker image to docker hub manually by command line by below command 
![image](https://user-images.githubusercontent.com/115841974/211714860-faf4a3ce-a903-4545-919e-d80439bd4d4a.png)
![image](https://user-images.githubusercontent.com/115841974/211714984-0841d341-20ea-402e-84df-c87571041ad6.png)
In docker hub 

![image](https://user-images.githubusercontent.com/115841974/211715076-8996f61a-2ee7-4043-955f-aae7d5be6fe1.png)


Docker Commands 
to find version of docker 
C:\Users\meela>docker -v
Docker version 20.10.21, build baeda1f

command to run docker 

C:\Users\meela>docker run hello-world

once spring application is ready and dockerfile is added
 we need to check whether application is perfecty working fine or not 
 
 next open power shell go to project repository 
 C:\Users\meela\workspace\springdocker>
 
 build the docker image 
 
 docker build -t springdocker .
 
 create the repository in docker hub (website - hub.dockerhub.com)
 
 and then tag this image to repository which created in dockerhub
 
 docker tag springdocker sindhujaalladi/springdocker
 
 and push the docker image to docker hub 
 
 docker push sindhujaalladi/springdocker
 
 check docker images which u have created 
 docker images ls 
 
 remove the docker images locally 
 
 docker rmi sindhujaalladi/springdocker springdocker
 
 and check docker images 
 
 run the docker image from dockerhub 
 
 docker run -p 9090:8080 sindhujaalladi/springdocker
 
 2nd 8080 is port number local 
 first port number is docker hub container 
 
 http://localhost:9090/printed
 
 we can directly run the image from docker container 
 
 
 spring-boot:build-image
 [[1;34mINFO[m] Successfully built image 'docker.io/library/springbuiltindocker:0.0.1-SNAPSHOT'
 
 docker run --tty --publish 9898:8787 springbuiltindocker:0.0.1-SNAPSHOT

 
 
 docker login
 login from terminal
