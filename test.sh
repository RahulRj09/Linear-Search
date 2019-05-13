#!/usr/bin/env bash
javac LinearSearch.java
java LinearSearch 34 > actual
diff actual expectedOutput
java LinearSearch 100 > actual
diff actual expectedOutput1
java LinearSearch 98 > actual
diff actual expectedOutput2