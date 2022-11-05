# IntelliQ Ameerpet
![](https://www.google.com/url?sa=i&url=https%3A%2F%2Friscenfraud.nl%2F2021%2F08%2F18%2Fintelliq-and-rf-analyse-join-forces-to-combat-fraud%2F&psig=AOvVaw2roBQJCd9-Gr40b9gRBx7K&ust=1667734492376000&source=images&cd=vfe&ved=0CA0QjRxqFwoTCKCkoKr5lvsCFQAAAAAdAAAAABAD)
This Repository for the AWS DevOps Part Some Notes.. 

## Groovy comment
### Multi  Line Comment On Groovy Script
```
/* this
   is a
   multi-line comment */
```
### Single Line Comment On Groovy Script
```
// this is a single line comment
```

## Jenkins Installing
### this program file install jenking for permanent in Debian Unbuntu server
```
#! /bin/bash
sudo apt-get update 
sudo apt-get install -y openjdk-11-jdk
sudo apt-get install -y git maven
curl -fsSL https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo tee   /usr/share/keyrings/jenkins-keyring.asc > /dev/null
echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc]   https://pkg.jenkins.io/debian-stable binary/ | sudo tee   /etc/apt/sources.list.d/jenkins.list > /dev/null
sudo apt-get update
sudo apt-get install -y jenkins
sudo systemctl start jenkins
```
## install Tomcat9
### install Tomcat Server for permanentin Debian Unbuntu server
```
#! /bin/bash
sudo apt-get update 
sudo apt-get install -y tomcat9
sudo apt-get install -y tomcat9-admin
sudo apt-get update
```
### Edit the tomcat-users.xml file
```
cd /etc/tomcat
sudo vim tomcat-users.xml
```   
### Delete all the content and add the below content
```  
<tomcat-users>
<user username="sandeep" password="sandeep" roles="manager-script"/> 
</tomcat-users>
```
#### Restart the Tomcat Server  
``` sudo service tomcat9 restart ```
