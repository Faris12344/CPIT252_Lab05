# CPIT252_Lab05 Adapter Design Pattern

Faris Mohammed Alnahdi
1935595
======================================
-We added the adapter class to grab a latitude and longitude from the user and search for the corrosponding city name to send it to the HTTP request for the API, since the API only recives city name to get its weather info.

-The adapter also has the option if the user enterd city name for flexibility purposes.

-Singleton desing pattern is also used so that only one adapter will be crated for the user to search from it many times.
