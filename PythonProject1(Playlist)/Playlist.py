"This program is to create a playlisy using dictionaries with the capablities of adding, removing, modifying, and showing the songs."

songs = {} #this is an empty dictionary to act as the global variable

def add_song(): #this function will add songs into the empty dictionary above
    name = input("What is the name of the song: ") #the name, artist, and year inputs ask the user for information
    artist = input("Who is the artist: ")
    year = input("What year did it come out: ")
    while year.isdigit() == False: #this will only take years if only numbers are provided, and if not, then the question will be asked over and over again
        year = input("What year did it come out: ")
    import random
    ID = random.randint(0,100) #this will provide a random number for each key in the keyvalue pair
    if ID in songs:
        ID = random.randint(0,100)
    songs[ID] = [name,artist,year] #this will add each song information provided to the dictionary with the random ID/key

def remove_song(id): #this function will remove the songs from the playlist
    try:
        del (songs[int(id)])
        print("Song removed!")
        return songs
    except KeyError: #if the ID/key provided in the input by the user is not in the dictionary/playlist, then it will tell the user to try again and provide another ID
        print("This is not an ID of any song. Please try again.")

def modify_song(id): #this will change any of the variables provided in the dictionary
    number = int(id)
    if number in songs: #this checks to see if the id is in the dictionary/playlist
        value = input("What would you like to modify(name,artist,year): ") #value and value2 are user information
        value2 = input("Enter the new value: ")
        if value == "name":
            values = (songs[int(id)])
            values[0] = value2 #if the value the person types is "name", then a new value can be added by the user to replace the old value
            print("Song modified!")
        if value == "artist":
            values = (songs[int(id)])
            values[1] = value2 #if the value the person types is "artist", then a new value can be added by the user to replace the old value
            print("Song modified!")
        if value == "year":
                while value2.isdigit() == False: #if year is not a number, the user will be asked again for a different input
                    value2 = input("Enter the new value: ")
                values = (songs[int(id)])
                values[2] = value2 #if the value the person types is "year", then a new value can be added by the user to replace the old value
                print("Song modified!")
    else:
        print("This value cannot be modified since the ID above does not exist. Please try again") #if there is an ID given and not in dictionary, the else statement tells the user to try again

def show_playlist(): #this will show all the songs in the playlist
    print("ID: name, artist, year")
    print(str(songs).replace("], ","\n").replace("{","").replace("}","").replace("[","").replace("'","").replace("]","")) #this will format the songs in an organized way without the [],{}, or ""

print("Welcome") #this provides user information on what to input
print("What would you like to do? ")
print("Enter  1 to see playlist: ")
print("2 to add song")
print("3 to modify song")
print("4 to remove a song")
print("5 to exit")
answer = input("")

if answer == "1": #whatever answer the user provides, that is what they will be allowed to do such as adding, removing, modifying, or displaying songs
    show_playlist()
elif answer == "2":
    print("Adding a song!")
    add_song()
    print("Song added!")
elif answer == "3":
    modify_song(input("Enter the ID of the song you want to modify: "))
elif answer == "4":
    remove_song(input("Enter the ID of the song you want to remove: "))
elif answer == "5":
    print("Goodbye!")
    exit()

while answer != "5": #the users will be asked again and again after the first if statement above which does the whole process once. Then the while loop will ask repeatdely until the user presses 5 to exit
    print("What would you like to do? ")
    answer = input("")
    if answer == "1":
        show_playlist()
    elif answer == "2":
        print("Adding a song!")
        add_song()
        print("Song added!")
    elif answer == "3":
        modify_song(input("Enter the ID of the song you want to modify: "))
    elif answer == "4":
        remove_song(input("Enter the ID of the song you want to remove: "))
    elif answer == "5":
        print("Goodbye!")
        exit()
