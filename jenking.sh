#! /bin/bash
# This file create by "Sandeep Kumar Patel"

############
# Block -1
#################################################################################################
# this block for the install jenking for normal way

sudo apt-get update 
sudo apt-get install -y openjdk-11-jdk
sudo apt-get install -y git maven
wget https://get.jenkins.io/war-stable/2.332.1/jenkins.war
java -jar jenkins.war

###############
# Block -2
###################################################################################################
# this program file install jenking for permanent
#! /bin/bash
sudo apt-get update 
sudo apt-get install -y openjdk-11-jdk
sudo apt-get install -y git maven
curl -fsSL https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo tee   /usr/share/keyrings/jenkins-keyring.asc > /dev/null
echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc]   https://pkg.jenkins.io/debian-stable binary/ | sudo tee   /etc/apt/sources.list.d/jenkins.list > /dev/null
sudo apt-get update
sudo apt-get install -y jenkins
sudo systemctl start jenkins

##########################################################################################################################################################################
