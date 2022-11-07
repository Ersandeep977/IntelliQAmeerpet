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

#### Three way to run ansible
```
Adhoc commands
playbook
Roles
```
