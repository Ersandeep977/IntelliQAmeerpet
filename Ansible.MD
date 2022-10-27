# Ansible installing
- ![#f03c15](https://ghantee.com/wp-content/uploads/2021/09/lord-krishna-best-hd-wallpaper-for-laptop-1080p-1536x864.jpg) `#f03c15`
### This file is used to install Ansible in master 
```
#! /bin/bash
sudo apt update
sudo apt install software-properties-common
sudo add-apt-repository --yes --update ppa:ansible/ansible
sudo apt update
sudo apt install ansible -y 
```

## Some Ansible command

### To ping the all server working fine or not
```ansible all -m ping -v```

### Run simple ls -al command
```ansible all -a "ls -al"```

### Run ansible module 
```ansible all -m shell -a "ls -al"```
