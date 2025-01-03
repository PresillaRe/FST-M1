listOne=list(input("Enter some values: ").split(","))
listTwo=list(input("Enter some values: ").split(","))
# Print the lists
print("First List ", listOne)
print("Second List ", listTwo)
 
# Declare a third list that will contain the result
thirdList = []
 
# Iterate through first list to get odd elements
for num in listOne:
    if (int(num )% 2 != 0):
        thirdList.append(num)
        
# Iterate through first list to get even elements
for num in listTwo:
    if (int(num )% 2 == 0):
        thirdList.append(num)
 
# Print result
print("result List is:")
print(thirdList)