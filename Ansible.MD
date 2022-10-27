# Ansible installing

### This file is used to install Ansible in master 

```
#! /bin/bash
sudo apt update
sudo apt install software-properties-common
sudo add-apt-repository --yes --update ppa:ansible/ansible
sudo apt update
sudo apt install ansible -y 
```

### Ansible command

### To ping the all server working fine or not
```ansible all -m ping -v```

### Run simple ls -al command
```- ansible all -a "ls -al"```

### Run ansible module 
```
# ansible all -m shell -a "ls -al"
```

```diff
- text in red
+ text in green
! text in orange
# text in gray
@@ text in purple (and bold)@@
``
