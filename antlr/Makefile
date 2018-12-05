DIR=./spark/dataframe
DIR2=./spark/dataset
FILE=./spark/dataframe/test.t
API=dataframe
all:
	. classpath.sh
	antlr spark/dataframe/Dataframe.g4
	antlr spark/dataset/Dataset.g4
	javac spark/**/*.java spark/*.java
run:
	java spark.App $(FILE) $(API)
clean:
	rm $(DIR)/Dataframe*.java $(DIR)/*.class $(DIR)/*.interp $(DIR)/*.tokens
	rm $(DIR2)/Dataset*.java $(DIR2)/*.class $(DIR2)/*.interp $(DIR2)/*.tokens