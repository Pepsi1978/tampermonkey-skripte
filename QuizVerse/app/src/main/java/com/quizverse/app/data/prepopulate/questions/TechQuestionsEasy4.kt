package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsEasy4(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 7,
        questionText = "Was bedeutet KI im Alltag?",
        answerA = "Ein Computer kann bestimmte Aufgaben selbst erledigen, die sonst Menschen tun",
        answerB = "Ein Programm, das nur Zahlen berechnet",
        answerC = "Eine Datenbank mit vielen Bildern",
        answerD = "Ein schnelles Internet-Netzwerk",
        correctAnswer = 0,
        explanation = "Kuenstliche Intelligenz (KI) bedeutet, dass Computer Aufgaben ausfuehren, die normalerweise menschliches Denken erfordern, z.B. Sprache verstehen oder Bilder erkennen.",
        difficulty = 1,
        funFact = "Schon 1956 wurde der Begriff 'Artificial Intelligence' gepraeagt – damals glaubten Forscher, KI waere in 10 Jahren 'fertig'."
    ),

    // Question 2
    Question(
        categoryId = 7,
        questionText = "Was ist ChatGPT?",
        answerA = "Ein sozianes Netzwerk fuer Programmierer",
        answerB = "Ein KI-Chatbot, der Texte versteht und schreibt",
        answerC = "Ein Antivirusprogramm von Microsoft",
        answerD = "Ein Cloud-Speicherdienst von Google",
        correctAnswer = 1,
        explanation = "ChatGPT ist ein KI-Chatbot von OpenAI, der natuerliche Sprache versteht und menschenaehnliche Texte generieren kann.",
        difficulty = 1,
        funFact = "ChatGPT erreichte innerhalb von 5 Tagen eine Million Nutzer – schneller als jede andere Anwendung in der Geschichte."
    ),

    // Question 3
    Question(
        categoryId = 7,
        questionText = "Wofuer steht 'KI' in der Technik?",
        answerA = "Kombinierte Intelligenz",
        answerB = "Kodierte Information",
        answerC = "Kuenstliche Intelligenz",
        answerD = "Komplexe Integration",
        correctAnswer = 2,
        explanation = "KI steht fuer Kuenstliche Intelligenz. Auf Englisch heisst es AI (Artificial Intelligence). Gemeint sind Computerprogramme, die klug erscheinende Aufgaben erledigen.",
        difficulty = 1,
        funFact = "Das Wort 'kuenstlich' bedeutet hier nicht unecht, sondern vom Menschen erschaffen – im Gegensatz zur biologischen Intelligenz."
    ),

    // Question 4
    Question(
        categoryId = 7,
        questionText = "Was macht ein KI-Sprachassistent wie Siri oder Alexa?",
        answerA = "Er speichert automatisch alle Gespraeche als Audiodateien",
        answerB = "Er versteht gesprochene Sprache und antwortet darauf",
        answerC = "Er verbessert automatisch das WLAN-Signal",
        answerD = "Er uebersetzt nur zwischen zwei Sprachen",
        correctAnswer = 1,
        explanation = "KI-Sprachassistenten verarbeiten gesprochene Sprache, verstehen den Inhalt und geben passende Antworten oder fuehren Aktionen aus.",
        difficulty = 1,
        funFact = "Alexa lernt staendig dazu – je mehr Fragen gestellt werden, desto besser wird das Sprachverstaendnis."
    ),

    // Question 5
    Question(
        categoryId = 7,
        questionText = "Wie heisst die Programmiersprache, die als erstes von Anfaengern gelernt wird?",
        answerA = "Python",
        answerB = "Assembler",
        answerC = "COBOL",
        answerD = "Fortran",
        correctAnswer = 0,
        explanation = "Python gilt als besonders anfaengerfreundlich, weil die Syntax einfach und lesbar ist. Es wird weltweit als erste Programmiersprache empfohlen.",
        difficulty = 1,
        funFact = "Python wurde nach der Komikergruppe Monty Python benannt, nicht nach der Schlange."
    ),

    // Question 6
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Bug' in der Programmierung?",
        answerA = "Ein besonders schnelles Programm",
        answerB = "Ein Fehler im Programmcode",
        answerC = "Ein Schutzmechanismus gegen Viren",
        answerD = "Eine Art von Datenbankabfrage",
        correctAnswer = 1,
        explanation = "Ein Bug ist ein Fehler im Programmcode, der dazu fuehrt, dass das Programm sich falsch verhaelt oder abstuerzt.",
        difficulty = 1,
        funFact = "Der Begriff 'Bug' entstand 1947, als Grace Hopper eine echte Motte in einem Computerschaltkreis fand, die eine Stoerung verursacht hatte."
    ),

    // Question 7
    Question(
        categoryId = 7,
        questionText = "Was ist HTML?",
        answerA = "Eine Programmiersprache fuer Videospiele",
        answerB = "Eine Auszeichnungssprache fuer Webseiten",
        answerC = "Ein Betriebssystem fuer Webserver",
        answerD = "Eine Datenbank-Software",
        correctAnswer = 1,
        explanation = "HTML steht fuer HyperText Markup Language und ist die Grundsprache, mit der Webseiten strukturiert werden.",
        difficulty = 1,
        funFact = "Die erste Version von HTML hatte nur 18 Tags – heute gibt es ueber 100 Standard-Tags."
    ),

    // Question 8
    Question(
        categoryId = 7,
        questionText = "Welches Videospiel gilt als erstes kommerziell erfolgreiches Arcade-Spiel?",
        answerA = "Space Invaders",
        answerB = "Tetris",
        answerC = "Pong",
        answerD = "Pac-Man",
        correctAnswer = 2,
        explanation = "Pong (1972) von Atari gilt als eines der ersten kommerziell erfolgreichen Arcade-Spiele. Es war ein simples Tennis-Spiel fuer zwei Spieler.",
        difficulty = 1,
        funFact = "Pong-Automaten verdoppelten ihre Aufstellung innerhalb weniger Monate – Spielhallen konnten dem Ansturm kaum standhalten."
    ),

    // Question 9
    Question(
        categoryId = 7,
        questionText = "In welchem Jahr wurde Minecraft erstmals veroeffentlicht?",
        answerA = "2005",
        answerB = "2011",
        answerC = "2008",
        answerD = "2014",
        correctAnswer = 1,
        explanation = "Minecraft wurde 2011 offiziell veroeffentlicht, nachdem es ab 2009 als fruehe Alpha-Version gespielt werden konnte.",
        difficulty = 1,
        funFact = "Minecraft ist das meistverkaufte Videospiel aller Zeiten mit ueber 300 Millionen verkauften Exemplaren."
    ),

    // Question 10
    Question(
        categoryId = 7,
        questionText = "Was ist Instagram Stories?",
        answerA = "Eine Funktion zum Schreiben langer Blogbeitraege",
        answerB = "Kurze Fotos oder Videos, die nach 24 Stunden verschwinden",
        answerC = "Ein privater Chat auf Instagram",
        answerD = "Eine Videocall-Funktion",
        correctAnswer = 1,
        explanation = "Instagram Stories sind kurze Foto- oder Videobeitraege, die 24 Stunden sichtbar sind und danach automatisch geloescht werden.",
        difficulty = 1,
        funFact = "Instagram kopierte das Stories-Konzept von Snapchat – Snapchat-Gruender Evan Spiegel hatte das Feature 2013 erfunden."
    ),

    // Question 11
    Question(
        categoryId = 7,
        questionText = "Was ist LinkedIn?",
        answerA = "Ein Netzwerk fuer Beruf und Karriere",
        answerB = "Ein Musik-Streaming-Dienst",
        answerC = "Eine Plattform fuer Kochrezepte",
        answerD = "Ein Videostreaming-Dienst fuer Nachrichten",
        correctAnswer = 0,
        explanation = "LinkedIn ist ein soziales Netzwerk fuer berufliche Kontakte, Stellenangebote und den Austausch unter Fachleuten.",
        difficulty = 1,
        funFact = "LinkedIn wurde 2002 gegruendet und gehoert seit 2016 zu Microsoft, das es fuer 26 Milliarden Dollar kaufte."
    ),

    // Question 12
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter einem sicheren Passwort?",
        answerA = "Ein kurzes Wort, das man sich gut merken kann",
        answerB = "Eine Kombination aus Grossbuchstaben, Kleinbuchstaben, Zahlen und Sonderzeichen",
        answerC = "Den eigenen Namen",
        answerD = "Das Geburtsdatum",
        correctAnswer = 1,
        explanation = "Ein sicheres Passwort besteht aus mindestens 12 Zeichen mit Grossbuchstaben, Kleinbuchstaben, Zahlen und Sonderzeichen.",
        difficulty = 1,
        funFact = "Ein Passwort wie 'P@ssw0rd!' gilt trotz Sonderzeichen als unsicher, weil es einem bekannten Muster folgt."
    ),

    // Question 13
    Question(
        categoryId = 7,
        questionText = "Was ist Phishing?",
        answerA = "Ein Online-Spiel",
        answerB = "Ein Betrugsversuch, bei dem man durch gefaelschte Nachrichten zur Eingabe von Daten verleitet wird",
        answerC = "Eine Methode zur Datensicherung",
        answerD = "Ein Netzwerkprotokoll",
        correctAnswer = 1,
        explanation = "Phishing ist ein Cyberangriff, bei dem Kriminelle durch gefaelschte E-Mails oder Webseiten versuchen, Passwoerter oder Bankdaten zu stehlen.",
        difficulty = 1,
        funFact = "Der Begriff 'Phishing' leitet sich von 'fishing' (Angeln) ab – die Kriminellen 'angeln' nach Opfern mit koederhaften Nachrichten."
    ),

    // Question 14
    Question(
        categoryId = 7,
        questionText = "Was ist ein Computervirus?",
        answerA = "Ein Programm, das einen Computer beschleunigt",
        answerB = "Schadsoftware, die sich selbst verbreitet und Schaden anrichtet",
        answerC = "Ein Backup-Programm",
        answerD = "Ein Sicherheitsupdate",
        correctAnswer = 1,
        explanation = "Ein Computervirus ist eine Schadsoftware, die sich an andere Programme haengt, sich selbst verbreitet und Daten oder Systeme schaedigen kann.",
        difficulty = 1,
        funFact = "Der erste bekannte Computervirus hiess 'Creeper' (1971) und zeigte nur die Nachricht 'I'm the creeper, catch me if you can!'"
    ),

    // Question 15
    Question(
        categoryId = 7,
        questionText = "Was ist ein Trojaner in der Cybersicherheit?",
        answerA = "Ein nuetzliches Systemtool",
        answerB = "Schadsoftware, die sich als nuetzliches Programm tarnt",
        answerC = "Ein besonders sicherer Virenscanner",
        answerD = "Ein Protokoll zur Datenverschluesselung",
        correctAnswer = 1,
        explanation = "Ein Trojaner ist Schadsoftware, die harmlos aussieht (z.B. als Spiel oder Tool), aber im Hintergrund schaedliche Aktionen ausfuehrt.",
        difficulty = 1,
        funFact = "Der Name kommt vom Trojanischen Pferd aus der griechischen Mythologie – ein versteckter Angriff unter falschem Deckmantel."
    ),

    // Question 16
    Question(
        categoryId = 7,
        questionText = "Was ist Cloud Computing?",
        answerA = "Programme und Daten, die ueber das Internet genutzt werden statt lokal auf dem Geraet",
        answerB = "Eine Technik zur Wolkenbeobachtung per Satellit",
        answerC = "Ein besonders schneller Internetzugang",
        answerD = "Eine Verschluesselungsmethode fuer E-Mails",
        correctAnswer = 0,
        explanation = "Cloud Computing bedeutet, dass Rechenleistung, Speicher und Programme ueber das Internet bereitgestellt werden, statt lokal installiert zu sein.",
        difficulty = 1,
        funFact = "Der Begriff 'Cloud' fuer Netzwerke entstand in den 1990ern, weil Netzwerkdiagramme oft eine Wolke als Symbol fuer das Internet verwendeten."
    ),

    // Question 17
    Question(
        categoryId = 7,
        questionText = "Was ist Google Drive?",
        answerA = "Ein Navigationsdienst fuer Autofahrer",
        answerB = "Ein Cloud-Speicherdienst von Google",
        answerC = "Ein E-Mail-Programm",
        answerD = "Ein Videostreaming-Dienst",
        correctAnswer = 1,
        explanation = "Google Drive ist ein Cloud-Speicherdienst von Google, mit dem man Dateien online speichern und mit anderen teilen kann.",
        difficulty = 1,
        funFact = "Jeder Google-Account bekommt 15 GB kostenlosen Speicherplatz auf Google Drive."
    ),

    // Question 18
    Question(
        categoryId = 7,
        questionText = "Was ist Online-Shopping?",
        answerA = "Ein Videospiel mit Kaufsimulation",
        answerB = "Das Kaufen von Produkten ueber das Internet",
        answerC = "Eine App fuer Preisvergleiche im Ladengeschaeft",
        answerD = "Ein Kassensystem fuer Supermaerkte",
        correctAnswer = 1,
        explanation = "Online-Shopping bedeutet, Produkte oder Dienstleistungen ueber Internetplattformen zu kaufen und liefern zu lassen.",
        difficulty = 1,
        funFact = "Der erste Online-Kauf der Geschichte fand 1994 statt: Phil Brandenberger kaufte eine CD von Sting fuer 12,48 Dollar."
    ),

    // Question 19
    Question(
        categoryId = 7,
        questionText = "Was ist PayPal?",
        answerA = "Eine Kreditkarte von Visa",
        answerB = "Ein Online-Bezahldienst",
        answerC = "Eine Bank fuer Unternehmen",
        answerD = "Ein Buchhaltungsprogramm",
        correctAnswer = 1,
        explanation = "PayPal ist ein Online-Bezahldienst, mit dem man im Internet sicher bezahlen und Geld senden oder empfangen kann.",
        difficulty = 1,
        funFact = "PayPal wurde 1998 gegruendet und war eines der ersten Unternehmen, das das Silicon Valley-Modell schnell wachsender Tech-Firmen praegte."
    ),

    // Question 20
    Question(
        categoryId = 7,
        questionText = "Welches Geraet braucht man typischerweise, um sich ins Internet einzuwaehlen?",
        answerA = "Einen Drucker",
        answerB = "Einen Router oder ein Modem",
        answerC = "Eine externe Festplatte",
        answerD = "Einen Bildschirm mit USB-C",
        correctAnswer = 1,
        explanation = "Ein Router oder Modem empfaengt das Internetsiganl vom Anbieter und macht es im Haushalt nutzbar.",
        difficulty = 1,
        funFact = "Das erste Modem wurde 1958 entwickelt und diente der Datenuebertragung zwischen Computern ueber Telefonleitungen."
    ),

    // Question 21
    Question(
        categoryId = 7,
        questionText = "Was ist Super Mario?",
        answerA = "Eine Figur aus einem japanischen Anime",
        answerB = "Ein beruemtes Videospiel-Maskottchen von Nintendo",
        answerC = "Ein Rennspiel von Sony",
        answerD = "Ein Charakter aus einem American-Comic",
        correctAnswer = 1,
        explanation = "Super Mario ist das bekannteste Maskottchen von Nintendo. Der kleine Klempner Mario ist seit 1985 in zahlreichen Videospielen der Star.",
        difficulty = 1,
        funFact = "Mario hiess urspruenglich 'Jumpman' und erschien 1981 in Donkey Kong – sein heutiger Name kam vom Vermieter des Nintendo-Amerika-Bueros: Mario Segale."
    ),

    // Question 22
    Question(
        categoryId = 7,
        questionText = "Was ist ein KI-Bildgenerator?",
        answerA = "Ein Scanner fuer physische Fotos",
        answerB = "Ein Programm, das auf Texteingabe hin Bilder erstellt",
        answerC = "Eine Kamera-App mit Filtern",
        answerD = "Ein Programm zum Nachbessern von unscharfen Fotos",
        correctAnswer = 1,
        explanation = "Ein KI-Bildgenerator wie Midjourney oder DALL-E erstellt auf Basis einer Textbeschreibung automatisch Bilder.",
        difficulty = 1,
        funFact = "DALL-E wurde nach dem Surrealist-Kuenstler Salvador Dali und dem Pixar-Film WALL-E benannt."
    ),

    // Question 23
    Question(
        categoryId = 7,
        questionText = "Wofuer wird Zweifaktor-Authentifizierung (2FA) verwendet?",
        answerA = "Um Passwoerter zu verdoppeln",
        answerB = "Als zusaetzliche Sicherheitsstufe beim Anmelden",
        answerC = "Um zwei Benutzer gleichzeitig anzumelden",
        answerD = "Um Passwoerter automatisch zu erstellen",
        correctAnswer = 1,
        explanation = "Die Zweifaktor-Authentifizierung erfordert neben dem Passwort noch einen zweiten Beweis (z.B. einen Code per SMS), um ein Konto zu schuetzen.",
        difficulty = 1,
        funFact = "Konten mit 2FA sind laut Google 99,9% sicherer gegen automatisierte Angriffe als Konten ohne 2FA."
    ),

    // Question 24
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Malware'?",
        answerA = "Schlechte oder schaedliche Software",
        answerB = "Veraltete Software",
        answerC = "Software fuer Mac-Computer",
        answerD = "Teure Unternehmenssoftware",
        correctAnswer = 0,
        explanation = "Malware (von 'Malicious Software') ist ein Sammelbegriff fuer schaedliche Software wie Viren, Trojaner, Spyware und Ransomware.",
        difficulty = 1,
        funFact = "Weltweit werden taeglich etwa 450.000 neue Malware-Varianten entdeckt – das sind 5 neue Bedrohungen pro Sekunde."
    ),

    // Question 25
    Question(
        categoryId = 7,
        questionText = "Welches ist das meistverkaufte Videospiel aller Zeiten?",
        answerA = "Grand Theft Auto V",
        answerB = "Tetris",
        answerC = "Minecraft",
        answerD = "Mario Kart 8",
        correctAnswer = 2,
        explanation = "Minecraft ist mit ueber 300 Millionen verkauften Exemplaren das meistverkaufte Videospiel aller Zeiten.",
        difficulty = 1,
        funFact = "Minecraft wurde von Markus 'Notch' Persson in seiner Freizeit entwickelt. Microsoft kaufte es 2014 fuer 2,5 Milliarden Dollar."
    ),

    // Question 26
    Question(
        categoryId = 7,
        questionText = "Was ist Snapchat bekannt fuer?",
        answerA = "Kurze Videos und Bilder, die nach dem Ansehen verschwinden",
        answerB = "Professionelle Bewerbungsfotos",
        answerC = "Live-Nachrichten und Politik-Debatten",
        answerD = "Musik-Uploads fuer Kuenstler",
        correctAnswer = 0,
        explanation = "Snapchat ist bekannt fuer kurzlebige Fotos und Videos (Snaps), die nach dem Ansehen automatisch geloescht werden.",
        difficulty = 1,
        funFact = "Snapchat fuehrte 2013 die 'Stories'-Funktion ein – Instagram und WhatsApp kopierten das Konzept kurz darauf."
    ),

    // Question 27
    Question(
        categoryId = 7,
        questionText = "Was ist Ransomware?",
        answerA = "Software zur sicheren Datensicherung",
        answerB = "Schadsoftware, die Daten verschluesselt und Loesegeld fordert",
        answerC = "Ein Programm fuer Online-Banking",
        answerD = "Eine Art Cloud-Backup",
        correctAnswer = 1,
        explanation = "Ransomware verschluesselt die Daten eines Opfers und fordert eine Zahlung (Loesegeld/Ransom), um sie wieder freizugeben.",
        difficulty = 1,
        funFact = "Der groesste Ransomware-Angriff der Geschichte (WannaCry, 2017) traf ueber 200.000 Computer in 150 Laendern in nur einem Tag."
    ),

    // Question 28
    Question(
        categoryId = 7,
        questionText = "Was ist iCloud?",
        answerA = "Ein Cloud-Speicherdienst von Apple",
        answerB = "Ein Sprachassistent von Apple",
        answerC = "Ein Musikdienst fuer iPhone",
        answerD = "Ein Videostreaming-Dienst von Apple",
        correctAnswer = 0,
        explanation = "iCloud ist der Cloud-Dienst von Apple, der Fotos, Dokumente, Kontakte und mehr automatisch auf Apple-Geraeten synchronisiert.",
        difficulty = 1,
        funFact = "Jeder Apple-Account bekommt 5 GB kostenlosen iCloud-Speicher – mehr als genug fuer Textnachrichten, aber knapp fuer Fotos."
    ),

    // Question 29
    Question(
        categoryId = 7,
        questionText = "Welches Programm wird zum Schreiben von Code verwendet?",
        answerA = "Microsoft Excel",
        answerB = "Ein Code-Editor wie Visual Studio Code",
        answerC = "Adobe Photoshop",
        answerD = "Ein Browser wie Google Chrome",
        correctAnswer = 1,
        explanation = "Zum Schreiben von Programmiercode verwendet man spezielle Code-Editoren oder Entwicklungsumgebungen wie Visual Studio Code.",
        difficulty = 1,
        funFact = "Visual Studio Code wurde 2015 von Microsoft veroeffentlicht und ist heute der beliebteste Code-Editor weltweit."
    ),

    // Question 30
    Question(
        categoryId = 7,
        questionText = "Was ist ein Passwort-Manager?",
        answerA = "Ein Programm, das alle Passwoerter sicher speichert und verwaltet",
        answerB = "Eine Funktion zum automatischen Sperren des Bildschirms",
        answerC = "Ein Programm zum Zuruecksetzen vergessener Passwoerter",
        answerD = "Ein Sicherheitsprogramm gegen Hacker",
        correctAnswer = 0,
        explanation = "Ein Passwort-Manager ist eine App, die alle Passwoerter verschluesselt speichert, sodass man sich nur ein Master-Passwort merken muss.",
        difficulty = 1,
        funFact = "Wer einen Passwort-Manager nutzt, hat im Schnitt deutlich staerkere Passwoerter – weil er sich keine merken muss."
    ),

    // Question 31
    Question(
        categoryId = 7,
        questionText = "Was ist Fortnite?",
        answerA = "Ein Karten-Browserspiel",
        answerB = "Ein sehr beliebtes Battle-Royale-Videospiel",
        answerC = "Eine Smartphone-App fuer Fitness",
        answerD = "Ein Musik-Streaming-Dienst fuer Gamer",
        correctAnswer = 1,
        explanation = "Fortnite ist ein kostenloses Battle-Royale-Spiel von Epic Games, bei dem 100 Spieler gegeneinander antreten, bis nur einer uebrig bleibt.",
        difficulty = 1,
        funFact = "Fortnite generierte 2018 ueber 2,4 Milliarden Dollar Umsatz – hauptsaechlich durch den Verkauf von rein kosmetischen Skins."
    ),

    // Question 32
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Dropbox'?",
        answerA = "Ein Anbieter fuer Postboxen",
        answerB = "Ein Cloud-Speicher- und Dateifreigabedienst",
        answerC = "Ein E-Mail-Postfach von Microsoft",
        answerD = "Ein System zum sicheren Loeschen von Dateien",
        correctAnswer = 1,
        explanation = "Dropbox ist ein Cloud-Dienst, mit dem man Dateien online speichern und einfach mit anderen Personen teilen kann.",
        difficulty = 1,
        funFact = "Dropbox-Gruender Drew Houston hatte die Idee, als er seinen USB-Stick vergass und keine Moeglichkeit hatte, von jedem Geraet auf seine Dateien zuzugreifen."
    ),

    // Question 33
    Question(
        categoryId = 7,
        questionText = "Was ist ein Warenkorb beim Online-Shopping?",
        answerA = "Eine Merkliste fuer spaetere Kaeufe",
        answerB = "Eine virtuelle Sammlung ausgewaehlter Produkte vor dem Kauf",
        answerC = "Eine Funktion zum Vergleichen von Preisen",
        answerD = "Das Konto bei einem Online-Shop",
        correctAnswer = 1,
        explanation = "Der Warenkorb bei einem Online-Shop sammelt die ausgewaehlten Produkte, bevor man zur Kasse geht und bezahlt.",
        difficulty = 1,
        funFact = "Das Konzept des digitalen Warenkorbs wurde 1992 von Charles Stack entwickelt – fuer den ersten Online-Buchladen der Welt, vor Amazon."
    ),

    // Question 34
    Question(
        categoryId = 7,
        questionText = "Was macht ein KI-Empfehlungsalgorithmus?",
        answerA = "Er blockiert unerwuenschte Werbung",
        answerB = "Er schlaegt Inhalte vor, die zum bisherigen Nutzungsverhalten passen",
        answerC = "Er verschluesselt persoenliche Daten",
        answerD = "Er ueberwacht den Datenschutz der App",
        correctAnswer = 1,
        explanation = "Ein KI-Empfehlungsalgorithmus analysiert, was man bisher angeschaut oder gekaoft hat, und schlaegt aehnliche Inhalte oder Produkte vor.",
        difficulty = 1,
        funFact = "Netflix-Studien zeigen, dass etwa 80% der geschauten Inhalte durch den Empfehlungsalgorithmus entdeckt werden."
    ),

    // Question 35
    Question(
        categoryId = 7,
        questionText = "Welche Firma entwickelte das Videospiel 'The Legend of Zelda'?",
        answerA = "Sega",
        answerB = "Nintendo",
        answerC = "Sony",
        answerD = "Atari",
        correctAnswer = 1,
        explanation = "The Legend of Zelda ist eine Videospielserie von Nintendo. Der erste Teil erschien 1986 und setzt Link als Helden ein.",
        difficulty = 1,
        funFact = "Viele denken, der Hauptcharakter in Zelda heisst Zelda – tatsaechlich heisst er Link. Zelda ist die Prinzessin."
    ),

    // Question 36
    Question(
        categoryId = 7,
        questionText = "Was ist Spyware?",
        answerA = "Software fuer geheime Regierungsagenten",
        answerB = "Schadsoftware, die heimlich Informationen ueber einen Nutzer sammelt",
        answerC = "Ein Programm zum sicheren Surfen im Internet",
        answerD = "Eine Ueberwachungskamera-Software",
        correctAnswer = 1,
        explanation = "Spyware ist Schadsoftware, die unbemerkt auf einem Geraet laeuft und Informationen wie Tastatureingaben oder Passwoerter sammelt und weitersendet.",
        difficulty = 1,
        funFact = "Spyware kann auch auf Smartphones installiert werden – oft verkleidet als harmlose App aus unbekannten Quellen."
    ),

    // Question 37
    Question(
        categoryId = 7,
        questionText = "Was ist eine Firewall?",
        answerA = "Ein spezieller Bildschirm fuer Computer",
        answerB = "Ein Sicherheitsprogramm, das unerwuenschten Netzwerkverkehr blockiert",
        answerC = "Ein Programm zur Datensicherung",
        answerD = "Ein Zugangsschutz fuer WLAN",
        correctAnswer = 1,
        explanation = "Eine Firewall ist ein Sicherheitssystem, das den Netzwerkverkehr ueberwacht und schaedliche oder unerwuenschte Verbindungen blockiert.",
        difficulty = 1,
        funFact = "Der Begriff Firewall stammt aus der Brandschutzarchitektur – eine Brandschutzmauer, die Feuer daran hindert, sich auszubreiten."
    ),

    // Question 38
    Question(
        categoryId = 7,
        questionText = "Was ist eBay?",
        answerA = "Eine Online-Auktions- und Verkaufsplattform",
        answerB = "Ein Online-Supermarkt",
        answerC = "Ein Cloud-Speicherdienst",
        answerD = "Eine Buchungsplattform fuer Reisen",
        correctAnswer = 0,
        explanation = "eBay ist eine der aeltesten Online-Handelsplattformen, auf der Private und Unternehmen Waren versteigern oder zu Festpreisen verkaufen koennen.",
        difficulty = 1,
        funFact = "eBay wurde 1995 gegruendet und das erste jemals dort versteigerte Objekt war ein kaputter Laserpointer – der Kaeufer wusste, dass er kaputt war."
    ),

    // Question 39
    Question(
        categoryId = 7,
        questionText = "Welche Programmiersprache wird hauptsaechlich fuer Webseiten-Interaktivitaet genutzt?",
        answerA = "HTML",
        answerB = "JavaScript",
        answerC = "Python",
        answerD = "Java",
        correctAnswer = 1,
        explanation = "JavaScript ist die Programmiersprache, die Webseiten interaktiv macht – Schaltflaechen, Animationen und dynamische Inhalte basieren darauf.",
        difficulty = 1,
        funFact = "JavaScript wurde 1995 in nur 10 Tagen von Brendan Eich entwickelt – obwohl es 'Java' im Namen traegt, hat es nichts mit Java zu tun."
    ),

    // Question 40
    Question(
        categoryId = 7,
        questionText = "Was ist ein HTTPS-Schloss im Browser?",
        answerA = "Ein Zeichen, dass die Webseite kostenlos ist",
        answerB = "Ein Zeichen fuer eine verschluesselte und sichere Verbindung",
        answerC = "Ein Hinweis, dass man eingeloggt ist",
        answerD = "Ein Zeichen, dass die Seite einen guten Ruf hat",
        correctAnswer = 1,
        explanation = "Das Schlosssymbol im Browser zeigt an, dass die Verbindung zur Webseite verschluesselt ist (HTTPS), sodass Dritte die Daten nicht abhoeren koennen.",
        difficulty = 1,
        funFact = "Noch 2016 nutzte weniger als die Haelfte der Webseiten HTTPS. Heute sind es ueber 90% – dank Druck von Google und gratis SSL-Zertifikaten."
    ),

    // Question 41
    Question(
        categoryId = 7,
        questionText = "Was ist ein Avatar in sozialen Netzwerken?",
        answerA = "Ein Profilbild oder eine digitale Darstellung einer Person",
        answerB = "Eine animierte Werbung",
        answerC = "Ein Konto, das von mehreren Personen geteilt wird",
        answerD = "Eine Sprachaufnahme als Profilbeschreibung",
        correctAnswer = 0,
        explanation = "Ein Avatar ist das Bild oder die digitale Figur, die einen Nutzer in sozialen Netzwerken, Foren oder Spielen repraesentiert.",
        difficulty = 1,
        funFact = "Das Wort 'Avatar' stammt aus dem Sanskrit und bedeutet die Herabkunft einer Gottheit – ein Gott, der in menschlicher Form erscheint."
    ),

    // Question 42
    Question(
        categoryId = 7,
        questionText = "Welches Spiel hat den Begriff 'Easter Egg' (versteckte Ueberraschung) in der Spielebranche populaer gemacht?",
        answerA = "Tetris",
        answerB = "Adventure fuer den Atari 2600",
        answerC = "Space Invaders",
        answerD = "Doom",
        correctAnswer = 1,
        explanation = "Das Spiel 'Adventure' (1979, Atari 2600) gilt als erstes Videospiel-Easter-Egg: Entwickler Warren Robinett versteckte seinen Namen im Spiel.",
        difficulty = 1,
        funFact = "Atari erlaubte damals keine Entwicklerkredite in Spielen – Robinett versteckte seinen Namen als geheimes Protest-Easter-Egg."
    ),

    // Question 43
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Like' auf Facebook oder Instagram?",
        answerA = "Eine Funktion zum Melden von Inhalten",
        answerB = "Ein Klick auf das Daumen-hoch-Symbol als Zustimmung oder Gefallen",
        answerC = "Eine Funktion zum Speichern von Beitraegen",
        answerD = "Eine Benachrichtigung bei neuen Beitraegen",
        correctAnswer = 1,
        explanation = "Das 'Like' (auf Facebook ein Daumen hoch, auf Instagram ein Herz) ist eine schnelle Moeglichkeit, einem Beitrag Zustimmung zu zeigen.",
        difficulty = 1,
        funFact = "Facebook-Gruender Zuckerberg wollte urspruenglich auch einen 'Dislike'-Button – er wurde aus Angst vor negativer Dynamik nie eingefuehrt."
    ),

    // Question 44
    Question(
        categoryId = 7,
        questionText = "Was ist Microsoft Azure?",
        answerA = "Ein Betriebssystem von Microsoft",
        answerB = "Eine Cloud-Computing-Plattform von Microsoft",
        answerC = "Ein Officeprogramm von Microsoft",
        answerD = "Ein E-Mail-Dienst von Microsoft",
        correctAnswer = 1,
        explanation = "Microsoft Azure ist eine Cloud-Plattform, auf der Unternehmen Programme, Datenbanken und Server im Internet hosten und betreiben koennen.",
        difficulty = 1,
        funFact = "Azure ist der zweitgroesste Cloud-Anbieter weltweit – hinter Amazon Web Services (AWS), aber knapp vor Google Cloud."
    ),

    // Question 45
    Question(
        categoryId = 7,
        questionText = "Was ist 'Streaming' bei Videospielen?",
        answerA = "Das Herunterladen von Spielen",
        answerB = "Das live im Internet uebertragene Spielen, damit andere zuschauen koennen",
        answerC = "Das Testen von Spielen vor dem Release",
        answerD = "Das Spielen offline ohne Internet",
        correctAnswer = 1,
        explanation = "Gaming-Streaming bedeutet, das eigene Spielen live ueber das Internet zu uebertragen, sodass andere Nutzer in Echtzeit zusehen koennen.",
        difficulty = 1,
        funFact = "Twitch, die groesste Gaming-Streaming-Plattform, uebertraegt taeglich ueber 30 Millionen Stunden Live-Content."
    ),

    // Question 46
    Question(
        categoryId = 7,
        questionText = "Was ist ein Software-Update?",
        answerA = "Das Loeschen alter Programme",
        answerB = "Eine neue Version einer Software mit Verbesserungen oder Fehlerbehebungen",
        answerC = "Das Kaufen einer neuen App",
        answerD = "Das Neustarten des Geraets",
        correctAnswer = 1,
        explanation = "Ein Software-Update ist eine neue Version eines Programms, das Fehler behebt, Sicherheitsluecken schliesst und neue Funktionen hinzufuegt.",
        difficulty = 1,
        funFact = "Das groesste Sicherheitsrisiko bei Computern sind veraltete Software – die meisten Angriffe nutzen bekannte Sicherheitsluecken aus, fuer die es schon Updates gibt."
    ),

    // Question 47
    Question(
        categoryId = 7,
        questionText = "Was ist Pinterest?",
        answerA = "Ein soziales Netzwerk fuer professionelle Kontakte",
        answerB = "Eine Plattform fuer das Sammeln und Teilen von Bildern und Ideen",
        answerC = "Ein Kurzvideo-Dienst wie TikTok",
        answerD = "Ein Dienst fuer Podcasts",
        correctAnswer = 1,
        explanation = "Pinterest ist eine Plattform, auf der Nutzer Bilder und Ideen (Pins) auf sogenannten Pinboards sammeln und teilen koennen.",
        difficulty = 1,
        funFact = "Pinterest wurde 2010 gegruendet und war das am schnellsten wachsende soziale Netzwerk der Geschichte – es erreichte 10 Millionen Nutzer in nur 9 Monaten."
    ),

    // Question 48
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Terabyte' (TB)?",
        answerA = "Eine Masseinheit fuer Internet-Geschwindigkeit",
        answerB = "Eine Masseinheit fuer Datenspeicher, etwa 1.000 Gigabyte",
        answerC = "Eine Einheit fuer Prozessorleistung",
        answerD = "Eine Masseinheit fuer Bildschirmaufloesung",
        correctAnswer = 1,
        explanation = "Ein Terabyte (TB) ist eine Masseinheit fuer digitalen Speicher und entspricht ungefaehr 1.000 Gigabyte (GB).",
        difficulty = 1,
        funFact = "Eine 1-TB-Festplatte kann etwa 250.000 Fotos oder 500 Stunden HD-Video speichern."
    ),

    // Question 49
    Question(
        categoryId = 7,
        questionText = "Was ist Discord?",
        answerA = "Ein Musikproduktionsprogramm",
        answerB = "Eine Kommunikationsplattform fuer Text, Sprache und Video, beliebt bei Gamern",
        answerC = "Ein soziales Netzwerk fuer Fotos",
        answerD = "Ein Streaming-Dienst fuer eSports-Turniere",
        correctAnswer = 1,
        explanation = "Discord ist eine Kommunikationsplattform mit Text-, Sprach- und Videochat, die urspruenglich fuer Gamer entwickelt wurde, aber heute viele Zwecke hat.",
        difficulty = 1,
        funFact = "Discord wurde 2015 gegruendet und wurde waehrend der COVID-19-Pandemie auch von Schulen und Universitaeten fuer den Fernunterricht genutzt."
    ),

    // Question 50
    Question(
        categoryId = 7,
        questionText = "Was ist ein Spam-Ordner im E-Mail-Postfach?",
        answerA = "Ein Ordner fuer wichtige Geschaeftsmails",
        answerB = "Ein Ordner, in dem unerwuenschte oder verdaechtige E-Mails automatisch landen",
        answerC = "Ein Archiv fuer alte E-Mails",
        answerD = "Ein Bereich fuer sehr grosse E-Mail-Anhaenge",
        correctAnswer = 1,
        explanation = "Der Spam-Ordner faengt unerwuenschte Werbemails, Betrugs-Mails und anderen ungebetenen E-Mail-Muell automatisch heraus.",
        difficulty = 1,
        funFact = "Der Begriff 'Spam' fuer unerwuenschte E-Mails stammt aus einem Monty-Python-Sketch, in dem immer wieder das Wort SPAM auftaucht und alles andere uebertont."
    )
)
