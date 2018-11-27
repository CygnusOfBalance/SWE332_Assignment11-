
JARS="junit.jar:."
all: compile

# download jars
junit.jar:
	wget -O junit.jar https://search.maven.org/remotecontent?filepath=junit/junit/4.12/junit-4.12.jar

# compile stuff
compile: compile_quotes compile_assignment05 compile_assignment11

compile_assignment11:
	javac *.java

# Run tests
test: junit.jar

test_assignment11: compile_assignment11 junit.jar
	java -cp $(JARS) TODO
