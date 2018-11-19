This is a simple program to check the JSON performance

jars used in this sample
-----------------------------------------------------
com.google.code.gson : gson - 2.8.4  
com.fasterxml.jackson.core : jackson-databind - 2.9.5  
com.googlecode.json-simple : json-simple - 1.1.1  
commons-io : commons-io - 2.4  

Output:
-------------------------
Smaller => Json file with size 3KB  
Gson Time = 25ms  
Jackson time = 73ms  
Json.Simple Time = 3ms  

Medium => Json file with size 275KB  
Gson Time = 16ms  
Jackson time = 21ms  
Json.Simple Time = 12ms  

Higher => Json file with size 70MB  
Gson Time = 629ms  
Jackson time = 434ms  
Json.Simple Time = 1198ms  