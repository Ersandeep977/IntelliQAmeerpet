#! bin/bash
# this is the shell program for the open the terminal 5 time

echo ""
tput setaf 6
echo "program will be start .......!!"
tput sgr0
echo

# code on this program
###################################################
for ((i=1; i<5; i++))
do
#gnome-terminal
cal
date
sleep 2
done

####################################################

echo ""
tput setaf 3
echo "Printing the exit code of the proram :-" $?
echo ""
tput setaf 2
echo "SUCCESFULL ---> 0"
tput setaf 1
echo "FAILL      ---> any number not zero"
echo ""
tput sgr0
echo "thank you for using the program"
echo ""