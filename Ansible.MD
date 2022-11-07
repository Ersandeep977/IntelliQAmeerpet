# Ansible installing
![](https://geekflare.com/wp-content/uploads/2019/06/ansible.jpg)
### This file is used to install Ansible in master(Unbuntu Server) 
```
#! /bin/bash
sudo apt update
sudo apt install software-properties-common
sudo add-apt-repository --yes --update ppa:ansible/ansible
sudo apt update
sudo apt install ansible -y 
```
## Ansible Inventery File Entery
### sudo vim /etc/ansible/hosts
```
[targets]

localhost              ansible_connection=local
other1.example.com     ansible_connection=ssh        ansible_user=mpdehaan
other2.example.com     ansible_connection=ssh        ansible_user=mdehaan
```
## Some Ansible command

### To ping the all server working fine or not
```ansible all -m ping -v```

### Run simple ls -al command
```ansible all -a "ls -al"```

### Run ansible module 
```ansible all -m shell -a "ls -al"```

### Configuration Management
```
This is the process of configuring servers from one point of control
```
### Advantages
```
1 Provisioning of Servers
  Setup of s/w's on servers can be done very easily from one point

2 Reduction of usage of resources
  We require less amount of time,money and human resources to configure
  servers

3 Handling Snowflake servers
  After a point of time all servers in the data center behave like
  snowflake servers ie they might be running on slightly different
  h/w and s/w confurations.Configuaration Management tools can pick
  up this info in simple setup file which can be reused to setup
  similar environments

4 Disaster Recovery
  In case of disaster recovery where we can loose an entire data center
  we can recreate similar data center with greater ease

5 Idempotent
  Configuration Management tools are used to bring the servers to a
  specific state called as "desired state",If the rmeote server is 
  already in the desired state CM tools will not reconfigure that server
```
### Popular CM tools
```
Ansible
Chef
Puppet
Saltstack
```
### Ansible
```
This is an open source configuration management tool created using python
The main machine where ansible is installed is called as "Controller"
and the remianing remote servers that we are configuring are called as 
"managed nodes/hosts"

From the controller to the managed nodes we should have passwordless
shh connectivity

Ansible is called as "agentless" ie we need not install any client 
s/w of ansible on the remote managed nodes.It uses "push" methodolgy
to push the configurations into the remote servers.
```
### Setup of Ansible
```
1 Create 3 or 4 AWS ubuntu 18 instances
2 NAme the 1st one as controller and remaining 2 as server1 and server2
3 Establish Passwordless ssh from Controller to Server1 and Server2
  a) Connect to server1 using gitbash
  b) Setup password for the default user
     sudo passwd ubuntu
  c) Edit the ssh configuration file
     sudo vim /etc/ssh/sshd_config
     Search for "PasswordAuthentication" and change it from no to yes
  d) Restart ssh
     sudo service ssh restart
     Repeat the above steps from a to d on Server2 managed node
  e) Connect to Controller using git bash
  f) Generate the ssh keys
     ssh-keygen
  g) Copy the ssh keys
     ssh-copy-id ubuntu@private_ip_of_server1
     Repeat step g with ipaddress of Server2

4 Installing Ansible
  a) Update the apt repository
     sudo apt-get update
  b) Install software-properties-common
     sudo apt-get install -y software-properties-common
  c) Add the latest version of Ansible to apt repository
     sudo apt-add-repository ppa:ansible/ansible
  d) Update the apt repository
     sudo apt-get update
  e) Install ansible
     sudo apt-get install -y ansible

5 To check the verision of ansible
  ansible --version

Ansible stores all the remote servers info in a file called as inventory file
We should open this file and store the ipaddress of all the managed nodes here

sudo vim /etc/ansible/hosts
Here copy and paste the ipaddresses of the managed nodes

Ansible performs remote configuration of servers in
3 different ways
1 Adhoc commands
2 Playbooks
3 Roles

Ansible uses prebuild Python modules for configuring remote servers
```
### Important modules in Ansible
```
1 command: This is used to execute linux commands on the remote managed
nodes.It is the default module of Ansible

2 shell: This is used to execute shell scripts on the remote managed nodes
  it can execute command related to redirection and piping

3 user: This is used to perform user administartion on the remote servers
like creating users,assigning home dirs deleting users etc

4 file: Used for creating files/directories on the managed nodes

5 copy: This used to copy files/directories to the managed node

6 fetch: Used to copy files/directories from managed nodes to controller

7 apt: Used to for s/w package management like isntalling,deleting,upgrading
  etc.It works on Ubuntu,Debain flvours of linux

8 yum: This is similar to apt but it works on Rehat linux,Centos,Fedora etc
  flavours of Linux

9 service: Used to start stop or restart services on the managed nodes

10 uri: Used to check if a remote url is reachable or not

11 git: Used for perfroming git version controlling on the managed nodes

12 get_url: Used for downloading files from remote servers into the managed nodes

13 stat: Used to capture detailed info about files/directories on the managed nodes

14 debug: Used to display the output in JSON file format

15 include: USed to call child playbooks from a parent playbook

16 replace: Used to replace specific portions of the text in a file

17 docker_container: Used for container management on the managed nodes

18 docker_image: Used to run command related to docker images

19  docker_login: Used to login into the docker registry

20 docker_swarm: Used to setup of docker swarm architecture
```
### Adhoc command Syntax
```
Ansible all/group_name/ipaddress -i path_of_inventory -m module_name -a 'arguments'
```
### CommandModule
```
Ansible command to see the memory info of all managed nodes
ansible all -i /etc/ansible/hosts -m command -a 'free -m'

Note: /etc/ansible/hosts is the deafult inventory file and when working on it
we need not specify the -i option
ansible all  -m command -a 'free -m'

Note: command module is the default module of Ansible and when working on it
we need not specify the -m option
ansible all   -a 'free -m'
```
### Shell Module
```
Ansible command to install docker on all managed nodes

ansible all -m shell -a 'curl -fsSL https://get.docker.com -o get-docker.sh'

ansible all -m shell -a 'sh get-docker.sh' 

Ansible command to store the memory info of all managed nodes in file1
ansible all -m shell -a 'free -m > file1'
``` 
### UserModule
```
Ansible command to create a user and assign a password
ansible all -m user -a 'name=sai password=intelliqit' -b

Note: -b represents "become" it is used to giving higher previlages on the
remote managed nodes

User module can also assign home dirs ,default working shell ,uid etc
ansible all -m user -a 'name=Anu password=intelliqit uid=1234 home=/home/ubuntu/Anu shell=/bin/bash comment="A normal user"' -b
```
### file module
```
Ansible command to create a file on all managed nodes
ansible all -m file -a 'name=/tmp/file14 state=touch'

Note: state= touch   is for creating files
state=directory is for creating directories
state=absent is for deleting file/directories

Ansible command to create a file and also change the premissions
ownership and groupship
ansible all -m file -a 'name=/home/ubuntu/file56 state=touch owner=sai group=Anu mode=770' -b
```
### Copy Module
```
Ansible command to copy a file from controller to all managed nodes
ansible all -m copy -a 'src=file100 dest=/tmp'

Ansible command to copy a file and also change permissions ownership and group ownership
ansible all -m copy -a 'src=file100 dest=/tmp owner=root group=sai mode=764' -b

Copy module can also replace the existing content of a file
ansible all -m copy -a 'content="Hello IntelliQ\n" dest=file1'
```
### apt Module
```
Ansible command to install tree on all managed nodes
ansible all -m apt -a 'name=tree state=present' -b

Note: state=present for installing
state=absent for uninstalling
state=latest for upgrading to the latest version

Ansible command to uninstall git from all managed nodes
ansible all -m apt -a 'state=absent name=git ' -b

To update the apt repository we use
update_cache=yes

Ansible comamnd to install tomcat9 after updating the apt repository
ansible all -m apt -a 'update_cache=yes name=tomcat9 state=present ' -b
```
### Service Module
```
Ansible command to restart ssh service
ansible all -m service -a 'name=ssh state=restarted' -b

Note: state=restarted for restarting services
state=started for starting services
state=stopped for stopping services
```
### Install tomcat9 ,copy tomcat-users.xml file and restart tomcat
```
1 Install tomcat9
  ansible all -m apt -a 'name=tomcat9 state=present' -b

2 Create tomcat-users.xml file
  vim tomcat-users.xml
 <tomcat-users>
        <user username="sandeep" password="sandeep" roles="manager-script"/>
 </tomcat-users>

3 Copy the tomcat-users.xmlf file the required location
  ansible all -m copy -a 'src=tomcat-users.xml dest=/etc/tomcat9' -b

4 Restart tomcat9
  ansible all -m service -a 'name=tomcat9 state=restarted' -b
```
### get_url Module
```
Ansible command to downlaod jenkins.war into all managed nodes
ansible all -m get_url -a 'url=http://mirrors.jenkins.io/war-stable/2.235.3/jenkins.war dest=/tmp'
```
## Replace Module
```
Ansible command to change  port of tomcat9 from 8080 to9090 and restart tomcat9

ansible all -m replace -a 'regexp=8080 replace=9090 path=/etc/tomcat9/server.xml' -b
ansible all -m service -a 'name=tomcat9 state=restarted' -b
```
### git module
```
Ansible command to download from a remote git repository
ansible all -m git -a 'repo=https://github.com/intelliqittrainings/maven.git dest=/tmp/mygit' -b
```
### uri module
```
Ansible command to check if google.com is reachable from all managed nodes
ansible all -m uri -a 'url=http://google.com status_code=200'
```
### Configuring tomcat9
```
1 Install tomcat9 and tomcat9-admin
  ansible all -m apt -a 'name=tomcat9 state=present update_cache=yes' -b
  ansible all -m apt -a 'name=tomcat9-admin state=present' -b

2 Copy the tomcat-users.xml file
  ansible all -m copy -a 'src=tomcat-users.xml dest=/etc/tomcat9' -b


3 Restart tomcat
  ansible all -m service -a 'name=tomcat9 state=restarted' -b 

4 Check the url reponse of tomcat
  ansible all -m uri -a 'url=http://172.31.28.60:8080 status_code=200' -b
  ansible all -m uri -a 'url=http://172.31.23.20:8080 status_code=200' -b
```
