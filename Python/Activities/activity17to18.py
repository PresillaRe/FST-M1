# Import pandas
import pandas

# Create a Dictionary that will hold our data
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

# convert dictionary of lists to dataframe
dataframe = pandas.DataFrame(data)

# Print the DataFrame
print(dataframe)

"""
 Write the DataFrame to a CSV file
 To avoid writing the index numbers to the file as well
 the index property is set to false
"""
dataframe.to_csv("activities/output/sample.csv", index=False)


 #read from the csv file
dataframe = pandas.read_csv("activities/output/sample.csv")

	
 
# Read the CSV file and store it into a DataFrame


#activity18
 
# Print the full data
print("Full Data: ")
print(dataframe)
 
# Print the values in the Usernames column only
print("===============")
print("Usernames:")
print(dataframe["Usernames"])
 
# Print the username and password of the second row
print("===============")
print("Username: ", dataframe["Usernames"][1], " | ", "Password: ", dataframe["Passwords"][1])
 
#Sort the Usernames column in ascending order
print("====================================")
print("Data sorted in ascending Usernames:")
print(dataframe.sort_values('Usernames'))
 
#Sort the Passwords column in descending order
print("====================================")
print("Data sorted in descending Passwords:")
print(dataframe.sort_values('Passwords', ascending=False))