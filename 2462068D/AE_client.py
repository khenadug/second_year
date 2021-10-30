import socket
import sys
from ae_code import send_file, recv_file, recv_listing

# Create the socket to connect to the server
client_sock =  socket.socket(socket.AF_INET, socket.SOCK_STREAM)

server_addy = (sys.argv[1], int(sys.argv[2]))

server_addy_str = str(server_addy)

try:

    print("Connecting to " + server_addy_str)

    client_sock.connect(server_addy)

    print("Connected to " + server_addy_str)

except Exception as e:
    print(e)
    exit(1)


try:
    


    #actions based on client operation requests
    operation = sys.argv[3]

    str(client_sock.send(bytes(operation, 'utf-8')))
   

    if operation == "put":
        file_to_open = sys.argv[4]

        file = str(client_sock.send(bytes(file_to_open, 'utf-8')))
        send_file(client_sock, file_to_open)
            
            
            
    if operation == "get":
        file_to_download = sys.argv[4]
        recv_file(client_sock, file_to_download)
       
            
                

    if operation == "list":
        recv_listing(client_sock)
                
           
        
finally:
    client_sock.close()

exit(0)
