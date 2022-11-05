# Jenkins automation by Python
![](https://www.easyaslinux.com/wp-content/uploads/2019/06/trigger-jenkins-python-1024x576.png)



import jenkins

j = jenkins.Jenkins('http://18.217.176.247:8080', username='admin', password='root')


'''
# print the user and jenking version
user = j.get_whoami()
version = j.get_version()
print('Hello %s from Jenkins %s' % (user['fullName'], version))

'''
# print the jobs count number 
# print(j.jobs_count())

# build the job name is Python-01
# print(j.build_job("Python-01"))

# copy the job as a backup
# print(j.copy_job("Python-01","Python-copy-01"))

# Delete the job Python-copy-01
# print(j.delete_job('Python-copy-01'))

# print create a Empty job
# print(j.create_job("python-02",jenkins.EMPTY_CONFIG_XML))

# Ruuing the job in upstreem
# print(j.build_job('Python-03'))
#print(j.build_job('python-04'))

# create the 10 job in a loop
# i = 1
# while i <=10:
#     print(j.create_job("Loopjob%d"%i,jenkins.EMPTY_CONFIG_XML))
#     i = i +1

# create the backup all 10 job by a loop
# i = 1
# while i <=10:
#     print(j.copy_job("Loopjob%d"%i,"Backuploopjob%d"%i))
#     i = i +1

# delete the all 10 job by a loop
# i = 1
# while i <=10:
#     print(j.delete_job("Loopjob%d"%i))
#     i = i +1

#  Delete the all the Backuploopjon
# i = 1
# while i <=10:
#     print(j.delete_job("Backuploopjob%d"%i))
#     i = i +1

#print(j.get_job_info('Python-01'))

print(jenkins.__file__)
