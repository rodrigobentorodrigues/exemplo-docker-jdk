mvn clean install
sudo docker build -t rod/teste .
sudo docker run -d --name teste --link banco:host-banco rod/teste
