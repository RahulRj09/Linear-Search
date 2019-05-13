#!/usr/bin/env bash
javac LinearSearch.java
java LinearSearch 34 > actual
diff actual testFor34
java LinearSearch 100 > actual
diff actual testForNotinList
java LinearSearch 98 > actual
diff actual testFor98