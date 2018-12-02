all:
	. classpath.sh
	antlr dataframe/Dataframe.g4
	javac dataframe/*.java
run:
	java dataframe.App
clean:
	cd dataframe/ && rm -r Dataframe*.java *.class Dataframe*.interp Dataframe*.tokens .antlr/
clean2:
	cd dataset/ && rm -r Dataframe*.java *.class Dataframe*.interp Dataframe*.tokens .antlr/