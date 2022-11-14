sample 1
# sample 2
## sample 3
### sample 4
#### sample 5
##### sample 6

![](https://netapp.io/wp-content/uploads/2018/05/ansible.png)

![](https://www.padok.fr/hubfs/Imported_Blog_Media/ansible_code.webp)


# terrafrom Block
```
rgion = "us-east-1"

# Ec2 block
ami                         = "ami-0cff7528ff583bf9a"
instance_type               = "t2.micro"
key_name                    = "terrafromTF"
availability_zone           = "us-east-1a"
associate_public_ip_address = "true"

# VPC Block
Cidr_block_Main_VPC       = "10.0.0.0/16"
Cidr_block_Public_subnet  = "10.0.1.0/24"
Cidr_block_private_subnet = "10.0.2.0/24"

#security group Block
SgPorts = [22, 80, 444, 21]
```
![thank](https://user-images.githubusercontent.com/78929192/201600875-8b2f24e6-2835-4b57-8cf4-7321d8d244e5.png)
