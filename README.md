# Alexa-Printing-Skill
A program developed using the Alexa Developer Console and tested with a Raspberry Pi hosting a web server 


by Maximilian Moore, Nathan Cox, and Kevin Valle


The following files are included in this repository: 

- "alexa2.sh" - a CGI script that executes upon reciving a signal from the Alexa skill and responds with the message "I'll Print that file"
   This file would be contained in a folder named "cgi-bin" in the same directory as the CGIHTTPServer.

- "AlexaPrinterPresentation.ppt" - A powerpoint document that outlines our presentation and a short video demenstration of the project.

- "AlexaSkill.py" - The original alexa skill that was developed when we used AWS lambda as our endpoint for the Alexa Skill, upon further research,
   we would be able to impliment this on the Raspberry Pi.

- "Filewalker.java" - A file searcher written in Java to search for the file that the user would like to print. 

- "PrinterSkill.json" - The new skill that we created in the Alexa Developer console to send a simple signal to the Pi.

- "FinalReport.docx" - A report containing the Project Title, Objective, Work Distribution, Timeline, Expected Results, Implementation, Challenges, Analysis, 
   Future work, Respository URL, and references.

- "Main.java" - An implimentation of the file searcher. 

- "Search.sh" - The shell script passing the filename variable to the file searcher.


___User Guide___

 Running the current skill requires the user to download ngrok an a Raspberry Pi, download python3.6, place the alexa2.sh script in the cgi-bin directory. 
  Then, run python CGIHTTPServer on port 8080, and run ngrok on port 8080 to expose the server on the internet. Then make the endpoint of the Alexa Skill https://<Somekey>.ngrok.io/cgi-bin/alexa2.sh
  Finally, run the skill on any device and tell Alexa what file to print. 
