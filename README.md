# XML-To-File
Programmet läser av en XML fil som ligger i src/resources och hämtar ut värdet i elementet target när attributet id är 42007. Därefter skrivs det uthämtade värdet till en text fil som sparas i src/resources under namnet targetValue.txt

Main metoden i programmet anropar en metod som ligger i klassen XMLReader(readXMLFile) och skickar med två parametrar som är följande:

filePath: Här skickas pathen till var XML filen som ska läsas ligger. I detta fallet ligger det i src/resources/sma_gentext.xml

id: Här skickas ID:t till trans-uniten som vi vill hämta värdet i target elementet från. I detta fallet så är det ID 42007. Det fungerar till exempel lika bra att ändra detta till tex 42006 för att hämta ut det värdet istället.

Därefter läser metoden av XML filen och returnerar värdet om det existerar. Ifall det inte existerar returneras ett default värde som är "Value not found".

Den returnerade värdet skickas då genom parametern till en metod som ligger i klassen Writer(writeValueToFile) som då skriver in den till filen och sparar den i src/resources under namnet targetValue.txt

# För att köra från IDE

1. Öppna projektet med en IDEn. Jag använde mig av IntelliJ.
2. Sätt en JDK till projektet, det jag använde var Java 17.
3. Kör main metoden som finns i klassen Main.java
4. Den skrivna filen kommer att finnas i src/resources

# För att köra från terminalen

Öppna projektet i en terminal, se till att du är utanför src mappen.

Till exempel: C:\Users\mah\Downloads\XML-To-File-main

Skriv följande i terminalen:
1. javac src/*.java
2. java -cp src Main
3. Den skriva filen kommer att finnas i src/resources

