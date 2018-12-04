FILE=./dataframe/test.t
API=dataframe
all:
	. classpath.sh
	antlr dataframe/Dataframe.g4
	javac dataframe/*.java
run:
	java dataframe.App $(FILE) $(API)
clean:
	cd dataframe/ && rm -r Dataframe*.java *.class Dataframe*.interp Dataframe*.tokens .antlr/ *_dataframe *_dataset
clean2:
	cd dataset/ && rm -r Dataframe*.java *.class Dataframe*.interp Dataframe*.tokens .antlr/