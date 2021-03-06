ROOT=`pwd`
DIR=./spark/dataframe
DIR2=./spark/dataset
FILE=./spark/dataframe/test.t
all:
	CLASSPATH="./antlr-4.7.1-complete.jar:." && \
	./antlr spark/dataframe/Dataframe.g4 && \
	./antlr spark/dataset/Dataset.g4 && \
	javac spark/**/*.java spark/*.java
docker:
	docker run -it \
	--mount type=bind,source=$(ROOT)/part0,target=/part0 \
	--mount type=bind,source=$(ROOT)/tests,target=/tests \
	--name=spark p7hb/docker-spark
docker-clean:
	docker rm spark
clean:
	rm $(DIR)/Dataframe*.java $(DIR)/*.class $(DIR)/*.interp $(DIR)/*.tokens
	rm $(DIR2)/Dataset*.java $(DIR2)/*.class $(DIR2)/*.interp $(DIR2)/*.tokens
	rm spark/*.class