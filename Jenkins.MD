## This Repository for the AWS DevOps Part Some Notes.. 

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
### Given the power for all permision
```
vi /etc/sudoers
jenkins ALL=(ALL) NOPASSWD:ALL
```
## Jenkins Installing Using User data
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
## install tomcat9 using user data
```
#! /bin/bash
sudo apt-get update 
sudo apt-get install -y tomcat9
sudo apt-get install -y tomcat9-admin
sudo apt-get update
sudo echo  "<tomcat-users> <user username="sandeep" password="sandeep" roles="manager-script"/> </tomcat-users>" > /etc/tomcat9/tomcat-users.xml
sudo service tomcat9 restart
```
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
cd /etc/tomcat9
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
### Running the jenkins service to other port no 
``` java -jar jenkins.war --httpPort=9090 ```


