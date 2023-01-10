'''
this program's purpose is to give the user 3 chances to find the treasure which is behind one of the six doors while the other five contain monsters that will kill you. This is done
by using functions and file I/O to write, append, and read which rooms killed you or which room had the treasure. You can only play once each time the program runs but if you either lose
all lives or find the treasure, then you cannot play again.
'''
def write_file(file_name,room_number,monster_name): #this is a write_file function that will append whatever is added onto the file and separate it with a comma
    a = file_name
    f = open(a,"a")
    print(room_number,monster_name,file=f,sep=",")
    f.close() #closes the file that was previously open

def read_file(file_name): #this function allows to read the file that was written on
    try:
        a = file_name
        f = open(a,"r")
        content = f.readlines() #reads each line and is shown in the form of a string
        formatted = []
        for i in content:
            formatted.append(i.strip()) #it is formatted into a list form in order to read the content on the file which in this case is the list of what has killed you
        return formatted
        f.close() #this once again closes the file opened
    except FileNotFoundError: # if the user gives a file name which does not exist, then it will say that message and exit the program
        input("This file does not exist.")
        exit()
content_list = read_file(input("Enter the file name:"))


dict = {} #transforms the content of the file into a dictionary
def build_dictionary(content_list):
    with open("save.txt") as f:
        for i in f:
            (key,value) = (i.strip("\n").split(",")) #convert the content on the save.txt document into a dictionary by removing the comman between room number and monster and removing the extra space
            dict[key]=[value] #this takes in the keys and values for the dictionary
build_dictionary(content_list)

if "3" in dict.keys():
    print("You found the treasure, Game Over") #if the key of 3 exists in the dictionary, then the game cannot be played again since the treasure has been found
    exit()

#Explanation for the while loop and if statements below:
#the while signifies that if the length of the dictionary is not equal to 3, which means if the number of key value pairs is less than 3, then the if statements will be asked.
#Since there are 6 rooms, each will get an if statement which contains and if else pair inside. The user will be asked to pick a room. Based on the room they pick, the user will be
#told if they were killed off found the treasure. the statment where it says room_number == "1" or any number, this leads to the if else statement. If the number chosen by the user
#is contained within the dictionary, then the user is reminded that they died in that room, if not, then the user loses a life. the for i in range(1) signifies that the user only
#gets one round for every time that they run the program

while len(dict.keys()) != 3:
    room_number = input("Please pick a room number between 1 through 6: ")
    if room_number == "1":
        if "1" in dict.keys():
            print("Remember the ghosts that killed you last time in this room.") #reminds user how they died if 1 is in the dictionary
        else:
            for i in range(1): # only play once for each time the program runs
                write_file("save.txt","1","ghost") #this updates the right file with how the user died
                print("Bad news! You were killed by a ghost...")
                build_dictionary(content_list) #this is added to the dictionary
                if len(dict.keys()) == 3: #if the player loses all 3 lives, they cant play again
                    print("You can't play anymore, Game Over!")
                exit() #this same method is used for rooms 2 through 6
    elif room_number == "2":
        if "2" in dict.keys():
            print("Remember the dementor in this room killed you last time.")
        else:
            for i in range(1):
                write_file("save.txt","2","wraith")
                print("You were killed by a dementors who sadly sucked every ounce of happiness from you.")
                build_dictionary(content_list)
                if len(dict.keys()) == 3:
                    print("You can't play anymore, Game Over!")
                exit()
    elif room_number == "3":
            write_file("save.txt","3","treasure")
            print("You found the treasure!")
            build_dictionary(content_list)
            exit()
    elif room_number == "4":
        if "4" in dict.keys():
            print("Remember ghostface is in this room...ready to kill you.")
        else:
            for i in range(1):
                write_file("save.txt","4","Ghostface")
                print("Do you like scary movies?...You were unfortunately killed by ghostface behind this door where the minute you went in you became part of the movie Scream.")
                build_dictionary(content_list)
                if len(dict.keys()) == 3:
                    print("You can't play anymore, Game Over!")
                exit()
    elif room_number == "5":
            if "5" in dict.keys():
                print("Remember Pennywise is behind this door waiting for you.")
            else:
                for i in range(1):
                    write_file("save.txt","5","Pennywise")
                    print("You were not strong enough to escape the room and have been killed through illusions created by Pennywise.")
                    build_dictionary(content_list)
                    if len(dict.keys()) == 3:
                        print("You can't play anymore, Game Over!")
                    exit()
    elif room_number == "6":
        if "6" in dict.keys():
            print("Remember you rotted alive in that room while surrounded by zombies...you don't want to go in again")
        else:
            for i in range(1):
                write_file("save.txt","6","zombies")
                print("It was gruesome...the minute you walked in, zombies attacked you while you started rotting alive.")
                build_dictionary(content_list)
                if len(dict.keys()) == 3:
                    print("You can't play anymore, Game Over!")
                exit()

build_dictionary(content_list)
if len(dict.keys()) == 3:
    print("You can't play anymore, Game Over!")
