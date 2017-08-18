all: src/*
	mvn clean
	mvn install
	scp -P 2222 target/JavaServerFaces-1.0.war s208070@helios.cs.ifmo.ru:8/vsaf/autodeploy/jsf.war
	# sleep 3
	# ssh hell "cat 8/vsaf/logs/server.log"
