import sys
import socket
import os


# this function is for sending files from the client to the server to then create them 
def send_file(socket, filename):
    
    #create a variable to store the opened file
    file_to_send = open(filename, "rb")
    #send the file through the socket 
    file_sent = socket.sendall(file_to_send)

    return file_sent
# this function is for the server side when it recives the file sent     
def recv_file(socket, filename):

#create the variable for the file
    file_recvd = socket.recv(filename)
    newfile = open(file_recvd, "xb")
    # print the file details to show it was made
    print("The file created was \n" + newfile)

def send_listing(socket):

    directory = os.listdir()
    direct_string =  " "

    for x in range(len(directory)):
        
        

        direct_string += str(directory[x]) + ","

        x += 1

    print(direct_string)

    socket.send(bytes(direct_string, 'utf-8'))

   
def recv_listing(socket):

   print("in recv")

   data = socket.recv(20)


   for y in range(len(data)):
       print(data[y])


    
