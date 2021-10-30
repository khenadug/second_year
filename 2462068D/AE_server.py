import socket
import sys
from ae_code import recv_file, send_file, send_listing

#Create the socket for the server to receive connections 
server_sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

try:
    server_sock.bind(("", int(sys.argv[1])))
    server_sock.listen(5)

except Exception as e:
    print(e)

    exit(1)



try:
    print("Server up and running")

    client_sock, client_addy = server_sock.accept()
    client_addy_str = str(client_addy)

    print(client_addy_str + "connected")



    operation = str(client_sock.recv(15).decode())

    if operation == "put":

        file = str(client_sock.recv(15).decode())

        recv_file(client_sock, file)
            

       

    if operation == "get":

        file = str(client_sock.recv(15).decode())
        send_file(client_sock, file)
            

       
    if operation == "list":
        send_listing(client_sock)
            

       
finally:
    print("Connection closed")
    client_sock.close()

server_sock.close()

exit(0)

        

            
