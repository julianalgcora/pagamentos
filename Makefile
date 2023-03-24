build:
	sudo docker-compose build

start:
	sudo docker-compose up -d

stop:
	sudo docker-compose down

clean:
	sudo docker-compose down --volumes
	sudo rm -rf data/*

init:
	mkdir -p data

migrate:
	docker-compose run --rm flyway
