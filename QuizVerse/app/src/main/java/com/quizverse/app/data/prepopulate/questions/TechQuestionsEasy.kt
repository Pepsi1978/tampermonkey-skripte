package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsEasy(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 7,
        questionText = "Welches Unternehmen stellt das iPhone her?",
        answerA = "Samsung",
        answerB = "Google",
        answerC = "Microsoft",
        answerD = "Apple",
        correctAnswer = 3, // D
        explanation = "Das iPhone wird von Apple hergestellt. Apple wurde 1976 von Steve Jobs, Steve Wozniak und Ronald Wayne gegruendet.",
        difficulty = 1,
        funFact = "Das erste iPhone wurde 2007 von Steve Jobs vorgestellt – er beschrieb es als 'ein iPod, ein Telefon und ein Internet-Kommunikationsgeraet in einem'."
    ),

    // Question 2
    Question(
        categoryId = 7,
        questionText = "Was bedeutet die Abkuerzung 'WLAN'?",
        answerA = "Weitreichendes Lokales Antennennetz",
        answerB = "Wireless Local Area Network",
        answerC = "World Local Area Network",
        answerD = "Wired Line Access Node",
        correctAnswer = 1, // B
        explanation = "WLAN steht fuer Wireless Local Area Network, also ein drahtloses lokales Netzwerk. Im deutschen Alltag wird es haeufig auch als 'Wi-Fi' bezeichnet.",
        difficulty = 1,
        funFact = "Der Begriff 'Wi-Fi' ist eigentlich kein Akronym, sondern ein eingetragenes Markenzeichen – er klingt nur wie eine Abkuerzung."
    ),

    // Question 3
    Question(
        categoryId = 7,
        questionText = "Welches Betriebssystem nutzen Android-Smartphones als Basis?",
        answerA = "Windows",
        answerB = "macOS",
        answerC = "Linux",
        answerD = "Unix",
        correctAnswer = 2, // C
        explanation = "Android basiert auf dem Linux-Kernel. Google hat diesen Open-Source-Kernel als Grundlage fuer das Mobilbetriebssystem Android verwendet.",
        difficulty = 1,
        funFact = "Android wurde urspruenglich nicht von Google entwickelt – Google kaufte das Startup Android Inc. im Jahr 2005."
    ),

    // Question 4
    Question(
        categoryId = 7,
        questionText = "Was ist YouTube?",
        answerA = "Eine Musik-Streaming-Plattform",
        answerB = "Eine Video-Sharing-Plattform",
        answerC = "Ein sozialer Messenger",
        answerD = "Eine Online-Shopping-Seite",
        correctAnswer = 1, // B
        explanation = "YouTube ist eine Video-Sharing-Plattform, auf der Nutzer Videos hochladen, ansehen und kommentieren koennen. Sie gehoert seit 2006 zu Google.",
        difficulty = 1,
        funFact = "Das erste YouTube-Video hiess 'Me at the zoo' und wurde am 23. April 2005 von Mitgruender Jawed Karim hochgeladen."
    ),

    // Question 5
    Question(
        categoryId = 7,
        questionText = "Welcher Konzern gehoert zu Facebook?",
        answerA = "Alphabet",
        answerB = "Microsoft",
        answerC = "Meta",
        answerD = "Amazon",
        correctAnswer = 2, // C
        explanation = "Facebook gehoert zum Konzern Meta Platforms, Inc. Das Unternehmen wurde 2004 von Mark Zuckerberg gegruendet und 2021 in Meta umbenannt.",
        difficulty = 1,
        funFact = "Mark Zuckerberg gruendete Facebook als 19-Jaehriger Studirender in seinem Wohnheimzimmer an der Harvard University."
    ),

    // Question 6
    Question(
        categoryId = 7,
        questionText = "Wofuer wird Bluetooth hauptsaechlich genutzt?",
        answerA = "Internetzugang",
        answerB = "Drahtlose Verbindung zwischen Geraeten auf kurze Distanz",
        answerC = "Datenspeicherung in der Cloud",
        answerD = "Verschluesselung von Passwortenn",
        correctAnswer = 1, // B
        explanation = "Bluetooth dient der drahtlosen Verbindung zwischen Geraeten auf kurze Distanz, zum Beispiel zwischen Smartphone und Kopfhoerern oder Lautsprechern.",
        difficulty = 1,
        funFact = "Bluetooth wurde nach dem daenischen Wikingerkoenig Harald Blauzahn (Harald Blaatand) benannt, weil er viele Staemme vereinte – so wie Bluetooth Geraete verbindet."
    ),

    // Question 7
    Question(
        categoryId = 7,
        questionText = "Was ist ein App-Store?",
        answerA = "Ein Elektronikgeschaeft",
        answerB = "Eine Online-Bibliothek fuer Software und Apps",
        answerC = "Ein Cloud-Speicherdienst",
        answerD = "Ein Betriebssystem von Apple",
        correctAnswer = 1, // B
        explanation = "Ein App-Store ist eine digitale Plattform, ueber die man Apps herunterladen kann. Apples App Store und Googles Play Store sind die bekanntesten.",
        difficulty = 1,
        funFact = "Apples App Store wurde 2008 mit 500 Apps geoeffnet – heute sind es ueber 1,8 Millionen Apps."
    ),

    // Question 8
    Question(
        categoryId = 7,
        questionText = "Was macht eine Suchmaschine?",
        answerA = "Sie speichert Dateien im Internet",
        answerB = "Sie durchsucht das Internet nach Webseiten und Informationen",
        answerC = "Sie erstellt Webseiten automatisch",
        answerD = "Sie schutzt vor Viren",
        correctAnswer = 1, // B
        explanation = "Eine Suchmaschine wie Google oder Bing durchsucht das Internet und zeigt passende Ergebnisse zu eingegebenen Begriffen an.",
        difficulty = 1,
        funFact = "Google verarbeitet taeglich ueber 8,5 Milliarden Suchanfragen – das sind etwa 99.000 Suchanfragen pro Sekunde."
    ),

    // Question 9
    Question(
        categoryId = 7,
        questionText = "Was ist WhatsApp?",
        answerA = "Ein Videobearbeitungsprogramm",
        answerB = "Ein E-Mail-Dienst",
        answerC = "Ein Messenger-Dienst fuer Nachrichten und Anrufe",
        answerD = "Ein Betriebssystem",
        correctAnswer = 2, // C
        explanation = "WhatsApp ist ein Messenger-Dienst, ueber den man Textnachrichten, Bilder, Videos und Sprachnachrichten senden sowie telefonieren kann.",
        difficulty = 1,
        funFact = "WhatsApp wurde 2009 gegruendet und 2014 von Facebook (heute Meta) fuer etwa 19 Milliarden US-Dollar gekauft."
    ),

    // Question 10
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'USB'?",
        answerA = "Universal Serial Bus",
        answerB = "Unified System Bridge",
        answerC = "Universal Storage Block",
        answerD = "United Software Base",
        correctAnswer = 0, // A
        explanation = "USB steht fuer Universal Serial Bus. Es ist ein weit verbreiteter Standard fuer Kabel, Stecker und Schnittstellen zwischen Computern und Geraeten.",
        difficulty = 1,
        funFact = "Der USB-Standard wurde 1996 eingefuehrt, um den damaligen Wildwuchs an verschiedenen Anschluessen zu vereinfachen."
    ),

    // Question 11
    Question(
        categoryId = 7,
        questionText = "Welche Farbe hat das Logo von WhatsApp?",
        answerA = "Blau",
        answerB = "Rot",
        answerC = "Gruen",
        answerD = "Gelb",
        correctAnswer = 2, // C
        explanation = "Das WhatsApp-Logo ist gruen mit einem weissen Telefon-Symbol. Die Farbe Gruen steht fuer Verbindung und Kommunikation.",
        difficulty = 1,
        funFact = "Obwohl WhatsApp zu Meta gehoert, hat es sein charakteristisches grueens Logo behalten – im Gegensatz zu Facebook (blau) und Instagram (bunt)."
    ),

    // Question 12
    Question(
        categoryId = 7,
        questionText = "Was ist ein Betriebssystem?",
        answerA = "Ein Programm zum Bearbeiten von Fotos",
        answerB = "Die grundlegende Software, die einen Computer oder ein Smartphone steuert",
        answerC = "Ein Antivirenprogramm",
        answerD = "Eine Art von Prozessor",
        correctAnswer = 1, // B
        explanation = "Ein Betriebssystem ist die grundlegende Software, die Hardware und andere Programme verwaltet. Bekannte Beispiele sind Windows, macOS, Android und iOS.",
        difficulty = 1,
        funFact = "Windows ist das meistgenutzte Desktop-Betriebssystem der Welt mit einem Marktanteil von ueber 70 Prozent."
    ),

    // Question 13
    Question(
        categoryId = 7,
        questionText = "Auf welcher Plattform werden hauptsaechlich kurze Videoclips geteilt?",
        answerA = "LinkedIn",
        answerB = "TikTok",
        answerC = "Pinterest",
        answerD = "Xing",
        correctAnswer = 1, // B
        explanation = "TikTok ist bekannt fuer kurze Videoclips. Die App wurde 2016 vom chinesischen Unternehmen ByteDance gestartet und hat weltweit Milliarden Nutzer.",
        difficulty = 1,
        funFact = "TikTok war 2021 die weltweit meistbesuchte Domain – noch vor Google."
    ),

    // Question 14
    Question(
        categoryId = 7,
        questionText = "Was ist ein Podcast?",
        answerA = "Ein Online-Videospiel",
        answerB = "Eine Art digitaler Radiosendung zum Abrufen",
        answerC = "Ein Videostreaming-Dienst",
        answerD = "Ein Programm zur Bildbearbeitung",
        correctAnswer = 1, // B
        explanation = "Ein Podcast ist eine digitale Audiodatei, die man uebers Internet abrufen und anhoeren kann. Das Wort setzt sich aus 'iPod' und 'broadcast' zusammen.",
        difficulty = 1,
        funFact = "Der Begriff Podcast wurde 2004 von Journalist Ben Hammersley gepraeigt – als Scherz, weil er keinen besseren Begriff fand."
    ),

    // Question 15
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen WLAN und mobilem Internet (LTE/5G)?",
        answerA = "Es gibt keinen Unterschied",
        answerB = "WLAN ist langsamer als LTE",
        answerC = "WLAN nutzt einen Router zu Hause, LTE/5G nutzt Mobilfunkmasten",
        answerD = "WLAN benoetigt keine Internetverbindung",
        correctAnswer = 2, // C
        explanation = "WLAN verbindet Geraete drahtlos mit einem Router, der an das Internet angeschlossen ist. LTE und 5G nutzen das Mobilfunknetz ueber Sendemasten.",
        difficulty = 1,
        funFact = "5G ist bis zu 100-mal schneller als 4G/LTE und kann theoretisch Daten mit bis zu 10 Gigabit pro Sekunde uebertragen."
    ),

    // Question 16
    Question(
        categoryId = 7,
        questionText = "Was ist Netflix?",
        answerA = "Ein Online-Shop fuer Elektronik",
        answerB = "Ein Videostreaming-Dienst",
        answerC = "Eine Suchmaschine",
        answerD = "Ein soziales Netzwerk",
        correctAnswer = 1, // B
        explanation = "Netflix ist ein Videostreaming-Dienst, bei dem man gegen eine monatliche Gebuehr Filme und Serien online ansehen kann.",
        difficulty = 1,
        funFact = "Netflix begann 1997 als DVD-Verleih per Post und stieg erst 2007 in das Streaming-Geschaeft ein."
    ),

    // Question 17
    Question(
        categoryId = 7,
        questionText = "Was ist ein QR-Code?",
        answerA = "Ein verschluesseltes Passwort",
        answerB = "Ein zweidimensionaler Barcode, der Informationen enthaelt",
        answerC = "Ein Antivirusprogramm",
        answerD = "Eine Art Speicherformat fuer Fotos",
        correctAnswer = 1, // B
        explanation = "Ein QR-Code ist ein zweidimensionaler Barcode, der mit dem Smartphone gescannt werden kann und z.B. Links, Texte oder Kontaktdaten enthaelt.",
        difficulty = 1,
        funFact = "QR steht fuer 'Quick Response' – der Code wurde 1994 von einer japanischen Toyota-Tochterfirma fuer die Automobilproduktion entwickelt."
    ),

    // Question 18
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Cloud-Speicher'?",
        answerA = "Dateien werden auf dem eigenen Geraet gespeichert",
        answerB = "Dateien werden auf Servern im Internet gespeichert",
        answerC = "Dateien werden auf einer externen Festplatte gespeichert",
        answerD = "Dateien werden automatisch geloescht",
        correctAnswer = 1, // B
        explanation = "Cloud-Speicher bedeutet, dass Dateien nicht lokal auf dem Geraet, sondern auf Servern im Internet gespeichert werden. Beispiele sind Google Drive, iCloud oder Dropbox.",
        difficulty = 1,
        funFact = "Weltweit werden taeglich etwa 2,5 Quintillionen Bytes an Daten erzeugt – ein Grossteil davon landet in der Cloud."
    ),

    // Question 19
    Question(
        categoryId = 7,
        questionText = "Wofuer steht das 'G' in 5G?",
        answerA = "Gigabit",
        answerB = "Global",
        answerC = "Generation",
        answerD = "Gigahertz",
        correctAnswer = 2, // C
        explanation = "Das 'G' in 5G steht fuer Generation. 5G ist die fuenfte Generation der Mobilfunktechnologie und folgt auf 4G/LTE.",
        difficulty = 1,
        funFact = "Die erste Mobilfunkgeneration (1G) wurde in den 1980er Jahren eingefuehrt und erlaubte nur Sprachanrufe – keine Datenuebertragung."
    ),

    // Question 20
    Question(
        categoryId = 7,
        questionText = "Was ist Instagram?",
        answerA = "Ein Musik-Streaming-Dienst",
        answerB = "Eine Foto- und Video-Sharing-App",
        answerC = "Ein Kartendienst",
        answerD = "Ein Textverarbeitungsprogramm",
        correctAnswer = 1, // B
        explanation = "Instagram ist eine Social-Media-App, auf der hauptsaechlich Fotos und Videos geteilt werden. Sie gehoert seit 2012 zu Meta (ehemals Facebook).",
        difficulty = 1,
        funFact = "Instagram hatte urspruenglich nur einen Filter – Valencia – und hiess zuerst Burbn, eine App fuer Whiskey-Liebhaber."
    ),

    // Question 21
    Question(
        categoryId = 7,
        questionText = "Was ist ein Touchscreen?",
        answerA = "Ein Bildschirm, der auf Beruehrungen reagiert",
        answerB = "Ein besonders grosser Bildschirm",
        answerC = "Ein Bildschirm mit sehr hoher Aufloesung",
        answerD = "Ein Bildschirm ohne Rahmen",
        correctAnswer = 0, // A
        explanation = "Ein Touchscreen ist ein Bildschirm, der Beruehrungen erkennt und darauf reagiert. Man kann ihn direkt mit dem Finger oder einem Stift bedienen.",
        difficulty = 1,
        funFact = "Der erste kommerzielle Touchscreen wurde 1982 von Hewlett-Packard eingefuehrt – weit vor dem iPhone-Zeitalter."
    ),

    // Question 22
    Question(
        categoryId = 7,
        questionText = "Was ist Spotify?",
        answerA = "Ein Videostreaming-Dienst",
        answerB = "Ein Musik-Streaming-Dienst",
        answerC = "Eine Social-Media-Plattform",
        answerD = "Ein Cloud-Speicherdienst",
        correctAnswer = 1, // B
        explanation = "Spotify ist ein Musik-Streaming-Dienst, auf dem man Millionen von Songs und Podcasts anhoeren kann. Es wurde 2006 in Schweden gegruendet.",
        difficulty = 1,
        funFact = "Spotify wurde gegruendet, weil Gruender Daniel Ek illegal Musik heruntergeladen hatte und eine legale Alternative schaffen wollte."
    ),

    // Question 23
    Question(
        categoryId = 7,
        questionText = "Wie nennt man den Akku-Stand eines Smartphones?",
        answerA = "Prozessorleistung",
        answerB = "Batterieladung oder Akkustand",
        answerC = "RAM-Auslastung",
        answerD = "Datentransferrate",
        correctAnswer = 1, // B
        explanation = "Der Akkustand oder Batterieladung zeigt an, wie viel Energie noch im Akku gespeichert ist, meistens in Prozent angegeben.",
        difficulty = 1,
        funFact = "Moderne Smartphone-Akkus bestehen meist aus Lithium-Ionen-Zellen. Sie sollten idealerweise zwischen 20 und 80 Prozent geladen gehalten werden."
    ),

    // Question 24
    Question(
        categoryId = 7,
        questionText = "Was ist ein Browser?",
        answerA = "Ein Programm zum Bearbeiten von Dokumenten",
        answerB = "Ein Programm zum Surfen im Internet",
        answerC = "Ein Antivirenprogramm",
        answerD = "Ein E-Mail-Programm",
        correctAnswer = 1, // B
        explanation = "Ein Browser ist ein Programm, mit dem man im Internet surfen kann. Bekannte Browser sind Google Chrome, Mozilla Firefox, Safari und Microsoft Edge.",
        difficulty = 1,
        funFact = "Der erste grafische Webbrowser hiess Mosaic und wurde 1993 veroffentlicht – er machte das Internet erstmals fuer normale Nutzer zugaenglich."
    ),

    // Question 25
    Question(
        categoryId = 7,
        questionText = "Welches Unternehmen stellt das Betriebssystem Windows her?",
        answerA = "Apple",
        answerB = "Google",
        answerC = "Microsoft",
        answerD = "IBM",
        correctAnswer = 2, // C
        explanation = "Windows wird von Microsoft hergestellt. Das Unternehmen wurde 1975 von Bill Gates und Paul Allen gegruendet.",
        difficulty = 1,
        funFact = "Windows 1.0 wurde 1985 veroeffentlicht. Es hatte ein revolutionaeres Feature: Man konnte mehrere Programme gleichzeitig in Fenstern oeffnen."
    ),

    // Question 26
    Question(
        categoryId = 7,
        questionText = "Was ist eine App?",
        answerA = "Ein Apple-Produkt",
        answerB = "Eine Anwendung oder ein Programm auf einem Geraet",
        answerC = "Eine Art von Datei",
        answerD = "Ein Kabel fuer Smartphones",
        correctAnswer = 1, // B
        explanation = "Eine App (kurz fuer Application) ist ein Softwareprogramm, das auf Smartphones, Tablets oder Computern ausgefuehrt wird.",
        difficulty = 1,
        funFact = "Apple machte den Begriff 'App' 2008 mit dem App Store populaer. Das Wort 'App of the Year' gibt es seitdem als begehrte Auszeichnung."
    ),

    // Question 27
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Selfie'?",
        answerA = "Ein Foto, das man von jemand anderem macht",
        answerB = "Ein Foto, das man von sich selbst mit dem Smartphone macht",
        answerC = "Ein Filterprogramm fuer Fotos",
        answerD = "Eine Kamerafunktion fuer Panoramafotos",
        correctAnswer = 1, // B
        explanation = "Ein Selfie ist ein Selbstportrait, das man meist mit der Frontkamera des Smartphones aufnimmt.",
        difficulty = 1,
        funFact = "Das Oxford Dictionary kuerte 'Selfie' im Jahr 2013 zum Wort des Jahres – dabei gibt es den Begriff bereits seit einem australischen Internetforum von 2002."
    ),

    // Question 28
    Question(
        categoryId = 7,
        questionText = "Was ist Google Maps?",
        answerA = "Ein Programm zum Erstellen von Prasentationen",
        answerB = "Ein Musik-Player",
        answerC = "Ein Online-Kartendienst und Navigationssystem",
        answerD = "Ein Cloud-Speicherdienst",
        correctAnswer = 2, // C
        explanation = "Google Maps ist ein kostenloser Kartendienst und Navigationsdienst von Google. Man kann damit Routen planen und sich navigieren lassen.",
        difficulty = 1,
        funFact = "Google Maps fotografiert Strassen weltweit mit speziellen Fahrzeugen fuer die Streetview-Funktion. Die Gesamtstrecke aller gefahrenen Wege umrundet die Erde 300-mal."
    ),

    // Question 29
    Question(
        categoryId = 7,
        questionText = "Was ist ein Emoji?",
        answerA = "Ein japanisches Wort fuer Technologie",
        answerB = "Ein kleines Bild- oder Symbolzeichen in digitaler Kommunikation",
        answerC = "Ein Programmierfehler",
        answerD = "Eine Verschluesselungstechnologie",
        correctAnswer = 1, // B
        explanation = "Emojis sind kleine Bilder oder Symbole, die in Textnachrichten verwendet werden, um Gefuehle oder Dinge auszudruecken.",
        difficulty = 1,
        funFact = "Das erste Emoji wurde 1999 in Japan vom Designer Shigetaka Kurita fuer einen Mobilfunkdienst erstellt – es war nur 12x12 Pixel gross."
    ),

    // Question 30
    Question(
        categoryId = 7,
        questionText = "Was ist Amazon?",
        answerA = "Nur ein Regenwald in Suedamerika",
        answerB = "Ein sozialer Netzwerk",
        answerC = "Ein Online-Handelsunternehmen und Cloud-Anbieter",
        answerD = "Ein Smartphonehersteller",
        correctAnswer = 2, // C
        explanation = "Amazon ist eines der groessten Online-Handelsunternehmen der Welt und bietet darueber hinaus Cloud-Dienste (AWS) und viele weitere Dienstleistungen an.",
        difficulty = 1,
        funFact = "Amazon-Gruender Jeff Bezos startete das Unternehmen 1994 in seiner Garage und verkaufte zuerst nur Buecher."
    ),

    // Question 31
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Streaming'?",
        answerA = "Das Herunterladen von Dateien auf den Computer",
        answerB = "Das direkte Abspielen von Inhalten ueber das Internet ohne Download",
        answerC = "Das Teilen von Dateien zwischen zwei Computern",
        answerD = "Das Speichern von Daten in der Cloud",
        correctAnswer = 1, // B
        explanation = "Streaming bedeutet, dass man Inhalte wie Musik oder Videos direkt aus dem Internet abspielt, ohne sie vorher vollstaendig herunterzuladen.",
        difficulty = 1,
        funFact = "Bereits in den 1990er-Jahren gab es erste Streaming-Experimente. 1994 wurde das erste Live-Konzert per Stream im Internet uebertragen."
    ),

    // Question 32
    Question(
        categoryId = 7,
        questionText = "Was ist ein Passwort?",
        answerA = "Ein geheimer Code zum Schutz von Konten und Daten",
        answerB = "Ein Programm zur Datensicherung",
        answerC = "Eine Art Kabel fuer Computer",
        answerD = "Ein Benutzername fuer Webseiten",
        correctAnswer = 0, // A
        explanation = "Ein Passwort ist ein geheimer Code aus Buchstaben, Zahlen und Sonderzeichen, der den Zugang zu Konten und Daten schuetzt.",
        difficulty = 1,
        funFact = "Das haeufigste Passwort weltweit ist immer noch '123456' – obwohl es als extrem unsicher gilt und in Sekunden geknackt werden kann."
    ),

    // Question 33
    Question(
        categoryId = 7,
        questionText = "Was ist Twitter (heute 'X')?",
        answerA = "Eine E-Mail-Plattform",
        answerB = "Ein Videospiel-Portal",
        answerC = "Ein soziales Netzwerk fuer Kurznachrichten",
        answerD = "Ein Cloud-Speicherdienst",
        correctAnswer = 2, // C
        explanation = "Twitter, seit 2023 offiziell 'X' genannt, ist ein soziales Netzwerk, auf dem Nutzer kurze Nachrichten (Tweets) veroeffentlichen koennen.",
        difficulty = 1,
        funFact = "Twitter wurde 2006 gegruendet. Der erste Tweet lautete: 'just setting up my twttr' – veroeffentlicht von Mitgruender Jack Dorsey."
    ),

    // Question 34
    Question(
        categoryId = 7,
        questionText = "Was macht ein Antivirenprogramm?",
        answerA = "Es beschleunigt das Internet",
        answerB = "Es erkennt und entfernt Schadsoftware",
        answerC = "Es sichert Dateien in der Cloud",
        answerD = "Es verwaltet Passwoerter",
        correctAnswer = 1, // B
        explanation = "Ein Antivirenprogramm schuetzt Computer und Smartphones vor Schadsoftware wie Viren, Trojanern und anderen Bedrohungen.",
        difficulty = 1,
        funFact = "Das erste Antivirenprogramm wurde 1987 entwickelt – um den Brain-Virus zu bekaempfen, der auf Disketten verbreitet wurde."
    ),

    // Question 35
    Question(
        categoryId = 7,
        questionText = "Was ist ein Router?",
        answerA = "Ein Geraet, das Internetsignale im Haus verteilt",
        answerB = "Ein Programm zur Datei-Verwaltung",
        answerC = "Ein Kabel zum Aufladen von Smartphones",
        answerD = "Ein Drucker fuer Netzwerke",
        correctAnswer = 0, // A
        explanation = "Ein Router ist ein Netzwerkgeraet, das die Internetverbindung vom Anbieter empfaengt und sie drahtlos (WLAN) oder per Kabel im Haus verteilt.",
        difficulty = 1,
        funFact = "Der erste WLAN-Router fuer Heimanwender kam 1999 auf den Markt. Heute hat fast jeder Haushalt in Deutschland einen."
    ),

    // Question 36
    Question(
        categoryId = 7,
        questionText = "Was ist ein Hashtag?",
        answerA = "Ein Sicherheits-Feature in Apps",
        answerB = "Ein Schlagwort mit '#' in Social Media, das Themen verbindet",
        answerC = "Eine Verschluesselungsmethode",
        answerD = "Ein Benutzername auf Plattformen",
        correctAnswer = 1, // B
        explanation = "Ein Hashtag ist ein Wort oder eine Phrase mit '#' davor (z.B. #Urlaub), das auf Social Media Inhalte zu einem Thema verlinkt und auffindbar macht.",
        difficulty = 1,
        funFact = "Den ersten Hashtag auf Twitter setzte 2007 Chris Messina – Twitter fand die Idee anfangs uncool und lehnte sie ab."
    ),

    // Question 37
    Question(
        categoryId = 7,
        questionText = "Was ist Google?",
        answerA = "Ein Betriebssystem",
        answerB = "Ein Smartphone-Hersteller",
        answerC = "Eine Suchmaschine und Technologieunternehmen",
        answerD = "Ein soziales Netzwerk",
        correctAnswer = 2, // C
        explanation = "Google ist zunaechst eine Suchmaschine und dazu ein riesiges Technologieunternehmen. Es bietet auch E-Mail (Gmail), Browser (Chrome), Android und viele andere Dienste an.",
        difficulty = 1,
        funFact = "Der Name Google leitet sich vom mathematischen Begriff 'Googol' ab – das ist die Zahl 1 gefolgt von 100 Nullen."
    ),

    // Question 38
    Question(
        categoryId = 7,
        questionText = "Was ist ein Laptop?",
        answerA = "Ein stationaerer Computer",
        answerB = "Ein tragbarer Computer",
        answerC = "Eine externe Festplatte",
        answerD = "Ein Tablet ohne Tastatur",
        correctAnswer = 1, // B
        explanation = "Ein Laptop (auch Notebook genannt) ist ein tragbarer Computer mit eingebautem Bildschirm, Tastatur und Akku.",
        difficulty = 1,
        funFact = "Der erste kommerzielle Laptop war der Osborne 1 aus dem Jahr 1981. Er wog 10,7 Kilogramm – kaum 'tragbar' nach heutigem Standard."
    ),

    // Question 39
    Question(
        categoryId = 7,
        questionText = "Was ist TikTok?",
        answerA = "Ein Musik-Streaming-Dienst",
        answerB = "Eine Plattform fuer kurze Videoclips",
        answerC = "Ein Videokonferenz-Dienst",
        answerD = "Ein Online-Spiel",
        correctAnswer = 1, // B
        explanation = "TikTok ist eine Social-Media-Plattform, auf der Nutzer kurze Videos erstellen und teilen koennen. Sie ist besonders bei Jugendlichen sehr beliebt.",
        difficulty = 1,
        funFact = "TikTok heisst in China 'Douyin' und wurde zuerst dort gestartet, bevor es 2018 unter dem Namen TikTok weltweit erschien."
    ),

    // Question 40
    Question(
        categoryId = 7,
        questionText = "Was ist ein Screenshot?",
        answerA = "Ein Foto von der Vorderkamera",
        answerB = "Eine Bildschirmaufnahme des aktuellen Displays",
        answerC = "Ein Videoausschnitt",
        answerD = "Ein Bild aus dem Internet gespeichert",
        correctAnswer = 1, // B
        explanation = "Ein Screenshot ist eine Aufnahme des aktuellen Bildschirminhalts. Auf den meisten Smartphones macht man ihn durch gleichzeitiges Druecken von Einschalttaste und Lautstaerketaste.",
        difficulty = 1,
        funFact = "Das englische Wort 'Screenshot' gibt es seit den 1960er Jahren, als Programmierer Bildschirmfotos fuer Dokumentationszwecke machten."
    ),

    // Question 41
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Download'?",
        answerA = "Dateien vom eigenen Geraet ins Internet hochladen",
        answerB = "Dateien aus dem Internet auf das eigene Geraet herunterladen",
        answerC = "Dateien loeschen",
        answerD = "Dateien zwischen zwei Geraeten tauschen",
        correctAnswer = 1, // B
        explanation = "Download bedeutet, Dateien oder Daten aus dem Internet oder einem Server auf das eigene Geraet zu uebertragen.",
        difficulty = 1,
        funFact = "Der Begriff 'Download' wurde durch das Internet populaer – davor sprach man von 'Datenuebertragung' oder 'Datenempfang'."
    ),

    // Question 42
    Question(
        categoryId = 7,
        questionText = "Was ist Siri?",
        answerA = "Ein Betriebssystem von Apple",
        answerB = "Der Sprachassistent von Apple",
        answerC = "Eine App fuer Fitness-Tracking",
        answerD = "Ein Apple-Streaming-Dienst",
        correctAnswer = 1, // B
        explanation = "Siri ist der Sprachassistent von Apple, der auf dem iPhone, iPad, Mac und anderen Apple-Geraeten verfuegbar ist. Man kann Siri Fragen stellen und Aufgaben erteilen.",
        difficulty = 1,
        funFact = "Siri wurde 2010 als eigenstaendige App veroeffentlicht und von Apple aufgekauft – schon 2011 erschien sie als feste Funktion im iPhone 4S."
    ),

    // Question 43
    Question(
        categoryId = 7,
        questionText = "Was ist eine Festplatte?",
        answerA = "Ein Prozessor",
        answerB = "Ein Speichergeraet fuer Daten",
        answerC = "Eine Art Bildschirm",
        answerD = "Ein Kuehlsystem fuer Computer",
        correctAnswer = 1, // B
        explanation = "Eine Festplatte ist ein Speichergeraet, auf dem Daten dauerhaft gespeichert werden – auch wenn der Computer ausgeschaltet ist.",
        difficulty = 1,
        funFact = "Die erste Festplatte von IBM aus dem Jahr 1956 wog eine Tonne und konnte gerade einmal 5 Megabyte speichern – weniger als ein einzelnes Foto heute."
    ),

    // Question 44
    Question(
        categoryId = 7,
        questionText = "Was ist eine E-Mail?",
        answerA = "Eine verschluesselte Textnachricht",
        answerB = "Eine elektronische Post- oder Briefnachricht",
        answerC = "Eine App fuer Videokonferenzen",
        answerD = "Eine digitale Unterschrift",
        correctAnswer = 1, // B
        explanation = "Eine E-Mail (Electronic Mail) ist eine elektronische Nachricht, die ueber das Internet verschickt wird – aehnlich wie ein Brief, aber sofort zugestellt.",
        difficulty = 1,
        funFact = "Die erste E-Mail wurde 1971 von Ray Tomlinson an sich selbst verschickt. Er waehlte das '@'-Symbol, das seitdem in jeder E-Mail-Adresse steckt."
    ),

    // Question 45
    Question(
        categoryId = 7,
        questionText = "Was ist der Google Play Store?",
        answerA = "Ein Online-Spielekatalog fuer PC",
        answerB = "Ein App-Marktplatz fuer Android-Geraete",
        answerC = "Ein Musik-Streaming-Dienst von Google",
        answerD = "Ein Cloud-Speicher von Google",
        correctAnswer = 1, // B
        explanation = "Der Google Play Store ist der offizielle App-Marktplatz fuer Android-Geraete. Hier koennen Nutzer Apps, Spiele, Filme und Musik herunterladen.",
        difficulty = 1,
        funFact = "Der Play Store hatte bei seiner Einfuehrung 2008 nur wenige Hundert Apps – heute sind es ueber 3 Millionen verfuegbare Anwendungen."
    ),

    // Question 46
    Question(
        categoryId = 7,
        questionText = "Was macht ein Prozessor (CPU) in einem Computer?",
        answerA = "Er speichert Dateien dauerhaft",
        answerB = "Er stellt Bilder auf dem Bildschirm dar",
        answerC = "Er fuehrt Berechnungen und Anweisungen aus",
        answerD = "Er verbindet den Computer mit dem Internet",
        correctAnswer = 2, // C
        explanation = "Der Prozessor (CPU = Central Processing Unit) ist das 'Gehirn' des Computers. Er fuehrt Berechnungen und Programmbefehle aus.",
        difficulty = 1,
        funFact = "Der erste Mikroprozessor, der Intel 4004, wurde 1971 entwickelt und hatte 2.300 Transistoren. Moderne Prozessoren haben bis zu 100 Milliarden Transistoren."
    ),

    // Question 47
    Question(
        categoryId = 7,
        questionText = "Was ist Zoom?",
        answerA = "Ein Fotobearbeitungsprogramm",
        answerB = "Ein Videokommunikations-Dienst",
        answerC = "Ein Betriebssystem",
        answerD = "Ein Online-Spiel",
        correctAnswer = 1, // B
        explanation = "Zoom ist ein Dienst fuer Videokonferenzen und Online-Meetings. Er wurde besonders waehrend der COVID-19-Pandemie weltweit sehr populaer.",
        difficulty = 1,
        funFact = "Zoom hatte Anfang 2020 taeglich 10 Millionen Nutzer – am Ende des Jahres waren es 300 Millionen. Die Pandemie katapultierte das Unternehmen ins Rampenlicht."
    ),

    // Question 48
    Question(
        categoryId = 7,
        questionText = "Was ist ein Tablet?",
        answerA = "Ein kleines Notebook mit Tastatur",
        answerB = "Ein flaches, touchscreen-basiertes Computergeraet",
        answerC = "Ein grosses Smartphone",
        answerD = "Ein tragbarer Drucker",
        correctAnswer = 1, // B
        explanation = "Ein Tablet ist ein flaches, portables Computergeraet, das hauptsaechlich ueber einen Touchscreen bedient wird. Bekannte Beispiele sind das iPad von Apple und das Galaxy Tab von Samsung.",
        difficulty = 1,
        funFact = "Apple-Gruender Steve Jobs praesentierte das erste iPad 2010 – viele Journalisten fragten damals: 'Aber warum braucht man das?' Heute sind Tablets allgegenwraertig."
    ),

    // Question 49
    Question(
        categoryId = 7,
        questionText = "Was ist Netflix' wichtigstes Konkurrenzprodukt von Amazon?",
        answerA = "Amazon Music",
        answerB = "Amazon Prime Video",
        answerC = "Amazon Echo",
        answerD = "Amazon Web Services",
        correctAnswer = 1, // B
        explanation = "Amazon Prime Video ist der Videostreaming-Dienst von Amazon und direkter Konkurrent zu Netflix. Er enthaelt Filme, Serien und eigene Amazon-Produktionen.",
        difficulty = 1,
        funFact = "Amazon Prime Video startete 2006 als 'Amazon Unbox' – erst 2011 wurde es als Streaming-Dienst neu ausgerichtet."
    ),

    // Question 50
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'KI' oder 'AI'?",
        answerA = "Kuenstliche Industrie",
        answerB = "Kuenstliche Intelligenz",
        answerC = "Kontrollierte Information",
        answerD = "Kodierte Integration",
        correctAnswer = 1, // B
        explanation = "KI steht fuer Kuenstliche Intelligenz, auf Englisch AI (Artificial Intelligence). Es bezeichnet Computersysteme, die Aufgaben erledigen koennen, die normalerweise menschliche Intelligenz erfordern.",
        difficulty = 1,
        funFact = "Der Begriff 'Artificial Intelligence' wurde 1956 von John McCarthy gepraegt – auf einer Konferenz, die als Geburtsstunde der KI gilt."
    )
)
