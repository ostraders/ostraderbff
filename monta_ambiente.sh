#!/usr/bin/env bash

dirMongoDB="/data/mongoDB"

if [ -d "$dirMongoDB" ]; then
	echo "PASTAS JÁ EXISTEM NO SISTEMA" + "$dirMongoDB"
else
	echo "CRIANDO PASTAS DO SISTEMA" + "$dirMongoDB"
	sudo mkdir -p "$dirMongoDB"

	echo "AGUARDA 3 SEGUNDOS"
	sleep 3

	echo "ATRIBUI PERMISSÕES AS PASTAS CRIADAS" + "$dirMongoDB"
	sudo chmod -R 777 "$dirMongoDB"

	echo "ALTERANDO O DONO DA PASTA CRIADA" + " $dirMongoDB " + " $USER "
	sudo chown -c -R $USER "$dirMongoDB"
fi

echo "PARANDO MAQUINA DOCKER"
docker stop mongodb
docker stop rabbitmq

echo "AGUARDA 2 SEGUNDOS"
sleep 2

echo "REMOVENDO MAQUINA DOCKER"
docker rm -f mongodb
docker rm -f rabbitmq

echo "AGUARDA 2 SEGUNDOS"
sleep 2

echo "CRIANDO MÁQUINA MONGODB"
docker-compose up -d

exit 1
