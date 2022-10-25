# Ansible installing

# this file is used to install Ansible in master 

'
#! /bin/bash
sudo apt update
sudo apt install software-properties-common
sudo add-apt-repository --yes --update ppa:ansible/ansible
sudo apt update
sudo apt install ansible -y
'

# Ansible command

# to ping the all server working fine or not
ansible all -m ping -v

# run simple ls -al command
ansible all -a "ls -al"

# run ansible module 
ansible all -m shell -a "ls -al"
