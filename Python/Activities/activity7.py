#num_list=list[1,2,3,4,20,2]
num_list=list(input("Enter some values: ").split(","))
sum=0
for num in num_list:
    sum+= int(num)
print(sum)