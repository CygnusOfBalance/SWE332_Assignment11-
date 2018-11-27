
JARS="junit.jar:hamcrest-core.jar:."
all: compile

# download jars
junit.jar:
	wget -O junit.jar https://search.maven.org/remotecontent?filepath=junit/junit/4.12/junit-4.12.jar

hamcrest-core.jar:
	wget -O hamcrest-core.jar https://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar

# compile stuff
compile: compile_assignment02

compile_assignment02: assignment_02.class  assignment_02_test.class

%.class: %.java junit.jar
	javac -cp $(JARS) $<

# Run tests
test: test_assignment02

test_assignment02: compile_assignment02 junit.jar hamcrest-core.jar
	java -cp $(JARS) assignment_02_test
