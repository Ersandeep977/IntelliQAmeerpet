# Kubernet install

```
kops create cluster --name=${KOPS_CLUSTER_NAME}  \
--state=${KOPS_STATE_STORE} \
--node-count=2 \
--master-size=t3.medium \
--node-size=t3.medium \
--dns private \
--cloud=aws \
--zones=us-west-2a \
--master-count=1
```


```
curl -LO https://github.com/kubernetes/kops/releases/download/$(curl -s https://api.github.com/repos/kubernetes/kops/releases/latest | grep tag_name | cut -d '"' -f 4)/kops-linux-amd64
chmod +x kops-linux-amd64
sudo mv kops-linux-amd64 /usr/local/bin/kops
curl -LO https://storage.googleapis.com/kubernetes-release/release/$(curl -https://storage.googleapis.com/kubernetesrelease/release/stable.txt)/bin/linux/amd64/kubectl
chmod +x ./kubectl
sudo mv ./kubectl /usr/local/bin/kubectl
aws s3 mb s3://sandeep.in.k8s --region us-east-2
aws s3 ls
   
vim .bashrc
source ~/.bashrc
   
ssh-keygen
kops create cluster --name=${KOPS_CLUSTER_NAME}  --state=${KOPS_STATE_STORE} --node-count=2 --master-size=t3.medium --node-size=t3.medium --dns private --cloud=aws --zones=us-west-2a --master-count=1
   
kops update cluster --name sandeep.in --yes --admin
kops validate cluster
```
