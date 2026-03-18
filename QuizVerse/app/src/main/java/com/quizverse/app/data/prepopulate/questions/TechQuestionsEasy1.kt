package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsEasy1(): List<Question> = listOf(

    // Question 1 - Computer basics
    Question(
        categoryId = 7,
        questionText = "Was ist ein Computer?",
        answerA = "Ein elektronisches Geraet zur Verarbeitung von Daten",
        answerB = "Ein Fernsehgeraet mit Tastatur",
        answerC = "Ein Drucker mit Bildschirm",
        answerD = "Ein Telefongeraet mit Kabel",
        correctAnswer = 0, // A
        explanation = "Ein Computer ist ein elektronisches Geraet, das Daten verarbeitet, speichert und ausgibt. Er kann Berechnungen durchfuehren und Programme ausfuehren.",
        difficulty = 1,
        funFact = "Der erste elektronische Computer ENIAC aus dem Jahr 1945 wog ueber 27 Tonnen und fuellte einen ganzen Raum."
    ),

    // Question 2 - Hardware basics
    Question(
        categoryId = 7,
        questionText = "Wie nennt man den Bildschirm eines Computers?",
        answerA = "Prozessor",
        answerB = "Tastatur",
        answerC = "Monitor",
        answerD = "Lautsprecher",
        correctAnswer = 2, // C
        explanation = "Der Monitor ist das Anzeigegeraet des Computers. Er zeigt Bilder, Texte und Videos an und ist das wichtigste Ausgabegeraet.",
        difficulty = 1,
        funFact = "Moderne Monitore koennen ueber 8 Millionen Bildpunkte (Pixel) anzeigen -- das nennt man 4K-Aufloesung."
    ),

    // Question 3 - Hardware basics
    Question(
        categoryId = 7,
        questionText = "Welches Geraet wird verwendet, um Text in den Computer einzugeben?",
        answerA = "Maus",
        answerB = "Tastatur",
        answerC = "Monitor",
        answerD = "Drucker",
        correctAnswer = 1, // B
        explanation = "Die Tastatur ist das wichtigste Eingabegeraet fuer Text. Sie hat Tasten fuer Buchstaben, Zahlen und Sonderzeichen.",
        difficulty = 1,
        funFact = "Die haeufigste Tastaturanordnung heisst QWERTZ (in Deutschland) und wurde urspruenglich fuer Schreibmaschinen entwickelt, um das Verhaken der Tastenarme zu verhindern."
    ),

    // Question 4 - Hardware basics
    Question(
        categoryId = 7,
        questionText = "Was macht eine Computer-Maus?",
        answerA = "Sie speichert Dateien",
        answerB = "Sie druckt Dokumente",
        answerC = "Sie steuert einen Zeiger auf dem Bildschirm",
        answerD = "Sie spielt Musik ab",
        correctAnswer = 2, // C
        explanation = "Die Maus ist ein Zeigegeraet, mit dem man den Cursor auf dem Bildschirm bewegt und durch Klicken Befehle ausfuehrt.",
        difficulty = 1,
        funFact = "Douglas Engelbart erfand die Computermaus im Jahr 1964. Das erste Modell war aus Holz gefertigt."
    ),

    // Question 5 - Hardware basics
    Question(
        categoryId = 7,
        questionText = "Wofuer steht die Abkuerzung USB?",
        answerA = "Universal Serial Bus",
        answerB = "United System Board",
        answerC = "Ultra Speed Byte",
        answerD = "Unified Storage Base",
        correctAnswer = 0, // A
        explanation = "USB steht fuer Universal Serial Bus -- ein Standard zum Anschliessen von Geraeten wie Tastatur, Maus, USB-Sticks und Ladekabeln an den Computer.",
        difficulty = 1,
        funFact = "Ueber 10 Milliarden USB-Geraete weltweit sind im Einsatz. USB wurde 1996 eingefuehrt, um den Kabelsalat mit vielen verschiedenen Steckern zu beenden."
    ),

    // Question 6 - Hardware basics
    Question(
        categoryId = 7,
        questionText = "Was ist die CPU eines Computers?",
        answerA = "Der Bildschirm",
        answerB = "Das Gehaeuse",
        answerC = "Der Prozessor -- das Gehirn des Computers",
        answerD = "Die Festplatte",
        correctAnswer = 2, // C
        explanation = "Die CPU (Central Processing Unit) ist der Hauptprozessor des Computers. Sie fuehrt alle Berechnungen und Programmschritte aus -- sie ist das Gehirn des Systems.",
        difficulty = 1,
        funFact = "Moderne CPUs fuhren mehrere Milliarden Rechenschritte pro Sekunde aus. Das klingt abstrakt -- stell dir vor, du wuerst in einer Sekunde 3 Milliarden mal den Lichtschalter betaetigen."
    ),

    // Question 7 - Hardware basics
    Question(
        categoryId = 7,
        questionText = "Was bedeutet RAM in Bezug auf Computer?",
        answerA = "Random Access Memory -- Arbeitsspeicher",
        answerB = "Read And Move -- Leseprogramm",
        answerC = "Remote Audio Module -- Soundkarte",
        answerD = "Rapid Application Manager -- Programmverwaltung",
        correctAnswer = 0, // A
        explanation = "RAM (Random Access Memory) ist der Arbeitsspeicher des Computers. Er speichert voruebergehend Daten, die gerade aktiv genutzt werden -- aehnlich einem Schreibtisch.",
        difficulty = 1,
        funFact = "Wenn du deinen Computer neu startest, wird der RAM vollstaendig geleert. Alle Programme und geoeffneten Dokumente muessen danach neu geladen werden."
    ),

    // Question 8 - Laptop
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem Laptop und einem Desktop-Computer?",
        answerA = "Ein Laptop hat keinen Prozessor",
        answerB = "Ein Laptop ist tragbar und hat einen eingebauten Akku",
        answerC = "Ein Laptop kann keine Programme ausfuehren",
        answerD = "Ein Laptop braucht immer eine externe Maus",
        correctAnswer = 1, // B
        explanation = "Ein Laptop ist ein tragbarer Computer mit integriertem Bildschirm, Tastatur und Akku. Er kann ohne Steckdose betrieben werden.",
        difficulty = 1,
        funFact = "Das erste kommerziell erfolgreiche Laptop war das Osborne 1 aus dem Jahr 1981 -- es wog 10,7 kg und kostete umgerechnet heute etwa 3.000 Euro."
    ),

    // Question 9 - Tablet
    Question(
        categoryId = 7,
        questionText = "Was ist ein Tablet?",
        answerA = "Ein grosser Desktop-Computer",
        answerB = "Ein flacher, tragbarer Computer mit Touchscreen",
        answerC = "Ein spezieller Drucker",
        answerD = "Ein externes Laufwerk",
        correctAnswer = 1, // B
        explanation = "Ein Tablet ist ein flaches, tragbares Geraet mit Touchscreen. Man bedient es hauptsaechlich mit den Fingern, ohne Tastatur oder Maus.",
        difficulty = 1,
        funFact = "Apple stellte das iPad 2010 vor und machte Tablets damit massentauglich. Vorher gab es Tablets, aber sie waren zu schwer und teuer fuer den Alltagsgebrauch."
    ),

    // Question 10 - Smartphone
    Question(
        categoryId = 7,
        questionText = "Was unterscheidet ein Smartphone von einem normalen Handy?",
        answerA = "Ein Smartphone kann nur telefonieren",
        answerB = "Ein Smartphone hat keine Kamera",
        answerC = "Ein Smartphone ist ein leistungsfaehiger Minicomputer mit Apps und Internet",
        answerD = "Ein Smartphone ist groesser als ein Tablet",
        correctAnswer = 2, // C
        explanation = "Ein Smartphone kombiniert Telefon, Internet, Kamera und Computer in einem Geraet. Es kann Apps ausfuehren und ist staendig mit dem Internet verbunden.",
        difficulty = 1,
        funFact = "Das erste iPhone wurde 2007 von Steve Jobs vorgestellt. Er bezeichnete es als revolutionaeres Produkt -- und behielt recht: Heute besitzen ueber 6 Milliarden Menschen ein Smartphone."
    ),

    // Question 11 - Operating systems
    Question(
        categoryId = 7,
        questionText = "Was ist ein Betriebssystem?",
        answerA = "Ein Computerspiel",
        answerB = "Die grundlegende Software, die einen Computer steuert",
        answerC = "Ein Internetzugang",
        answerD = "Ein Druckertreiber",
        correctAnswer = 1, // B
        explanation = "Das Betriebssystem ist die grundlegende Software, die alle Hardware-Komponenten verwaltet und anderen Programmen ermoeglicht zu laufen. Ohne es wuerde ein Computer nicht funktionieren.",
        difficulty = 1,
        funFact = "Das meistgenutzte Desktop-Betriebssystem weltweit ist Windows mit ca. 73% Marktanteil, gefolgt von macOS mit ca. 15%."
    ),

    // Question 12 - Windows
    Question(
        categoryId = 7,
        questionText = "Von welchem Unternehmen stammt das Betriebssystem Windows?",
        answerA = "Apple",
        answerB = "Google",
        answerC = "Microsoft",
        answerD = "Samsung",
        correctAnswer = 2, // C
        explanation = "Windows wird von Microsoft entwickelt. Es ist das weltweit am haeufigsten genutzte Desktop-Betriebssystem und wurde erstmals 1985 veroeffentlicht.",
        difficulty = 1,
        funFact = "Bill Gates gruendete Microsoft 1975 mit Paul Allen. Damals war er gerade mal 20 Jahre alt und hatte sein Studium in Harvard abgebrochen."
    ),

    // Question 13 - macOS
    Question(
        categoryId = 7,
        questionText = "Welches Unternehmen stellt das Betriebssystem macOS her?",
        answerA = "Microsoft",
        answerB = "Apple",
        answerC = "Google",
        answerD = "Amazon",
        correctAnswer = 1, // B
        explanation = "macOS wird von Apple entwickelt und laeuft ausschliesslich auf Apple-Computern (Mac, MacBook). Es ist bekannt fuer sein schlichtes Design.",
        difficulty = 1,
        funFact = "Steve Jobs zeigte den ersten Mac 1984 live auf der Buehne -- das Geraet begruesste das Publikum selbst mit dem Satz: 'Hello, I'm Macintosh.'"
    ),

    // Question 14 - Android
    Question(
        categoryId = 7,
        questionText = "Auf welchen Geraeten laeuft das Betriebssystem Android hauptsaechlich?",
        answerA = "Apple iPhones",
        answerB = "Windows-Laptops",
        answerC = "Smartphones und Tablets vieler Hersteller",
        answerD = "Nur auf Samsung-Geraeten",
        correctAnswer = 2, // C
        explanation = "Android ist ein Betriebssystem von Google, das auf Smartphones und Tablets vieler Hersteller laeuft -- z.B. Samsung, Huawei, Sony und viele mehr.",
        difficulty = 1,
        funFact = "Android hat weltweit ueber 3 Milliarden aktive Nutzer und ist damit das meistgenutzte Betriebssystem der Welt -- noch vor Windows."
    ),

    // Question 15 - iOS
    Question(
        categoryId = 7,
        questionText = "Was ist iOS?",
        answerA = "Ein Windows-Update",
        answerB = "Das Betriebssystem fuer iPhones und iPads von Apple",
        answerC = "Ein Antivirenprogramm",
        answerD = "Eine Programmiersprache",
        correctAnswer = 1, // B
        explanation = "iOS ist das Betriebssystem, das Apple fuer iPhone und iPad entwickelt. Es ist bekannt fuer seine Benutzerfreundlichkeit und engen Sicherheitsstandards.",
        difficulty = 1,
        funFact = "iOS und macOS sind verwandt -- beide basieren auf einem Unix-Kern namens Darwin, der urspruenglich 2000 von Apple veroeffentlicht wurde."
    ),

    // Question 16 - Linux
    Question(
        categoryId = 7,
        questionText = "Was ist Linux?",
        answerA = "Ein Computerspiel von Nintendo",
        answerB = "Ein kostenloses, quelloffenes Betriebssystem",
        answerC = "Ein Internetbrowser",
        answerD = "Eine Art USB-Stick",
        correctAnswer = 1, // B
        explanation = "Linux ist ein freies Betriebssystem, dessen Quellcode jeder einsehen und veraendern darf. Es wird besonders auf Servern und bei Entwicklern eingesetzt.",
        difficulty = 1,
        funFact = "Linus Torvalds entwickelte Linux 1991 als Student in Helsinki -- er begann als Hobbyprojekt. Heute laeuft Linux auf ueber 90% aller Supercomputer weltweit."
    ),

    // Question 17 - Internet basics
    Question(
        categoryId = 7,
        questionText = "Was ist das Internet?",
        answerA = "Ein einzelner riesiger Computer",
        answerB = "Ein weltweites Netzwerk miteinander verbundener Computer",
        answerC = "Ein Fernsehprogramm",
        answerD = "Ein Telefonnetz nur fuer Unternehmen",
        correctAnswer = 1, // B
        explanation = "Das Internet ist ein weltweites Netzwerk von Millionen Computern und Servern, die miteinander kommunizieren. Es ermoeglicht den Austausch von Informationen weltweit.",
        difficulty = 1,
        funFact = "Das Internet entstand aus einem US-Militaerprojekt namens ARPANET (1969). Die erste Nachricht die uebertragen werden sollte, war 'LOGIN' -- aber das System absturzte nach den ersten zwei Buchstaben 'LO'."
    ),

    // Question 18 - WiFi
    Question(
        categoryId = 7,
        questionText = "Was ermoeglicht WiFi?",
        answerA = "Kabellose Verbindung mit dem Internet",
        answerB = "Schnelleres Drucken",
        answerC = "Bessere Bildschirmhelligkeit",
        answerD = "Groessere Dateiablage",
        correctAnswer = 0, // A
        explanation = "WiFi (auch WLAN genannt) ermoeglicht die kabellose Verbindung von Geraeten mit einem Netzwerk oder dem Internet ueber Funkwellen.",
        difficulty = 1,
        funFact = "WiFi steht fuer 'Wireless Fidelity'. Die maximale Reichweite eines typischen Heimrouters betraegt ca. 30 Meter in Gebaeuden."
    ),

    // Question 19 - Browser
    Question(
        categoryId = 7,
        questionText = "Was ist ein Webbrowser?",
        answerA = "Ein Programm zum Anzeigen von Internetseiten",
        answerB = "Ein E-Mail-Programm",
        answerC = "Ein Texteditor",
        answerD = "Ein Virenscanner",
        correctAnswer = 0, // A
        explanation = "Ein Webbrowser ist ein Programm, mit dem man Webseiten aufrufen und im Internet surfen kann. Bekannte Browser sind Chrome, Firefox, Edge und Safari.",
        difficulty = 1,
        funFact = "Der weltweit meistgenutzte Browser ist Google Chrome mit ca. 65% Marktanteil. Der erste grafische Browser der Geschichte hiess Mosaic und erschien 1993."
    ),

    // Question 20 - URL
    Question(
        categoryId = 7,
        questionText = "Was ist eine URL?",
        answerA = "Ein Computervirus",
        answerB = "Die Adresse einer Webseite im Internet",
        answerC = "Ein Dateiformat fuer Bilder",
        answerD = "Ein Anschlusstyp fuer Kabel",
        correctAnswer = 1, // B
        explanation = "Eine URL (Uniform Resource Locator) ist die Adresse einer Webseite. Sie beginnt meist mit 'https://' und gibt genau an, wo im Internet eine Ressource zu finden ist.",
        difficulty = 1,
        funFact = "Die erste Webseite der Geschichte ist noch heute online: http://info.cern.ch -- sie wurde 1991 von Tim Berners-Lee veroeffentlicht, dem Erfinder des World Wide Web."
    ),

    // Question 21 - Email basics
    Question(
        categoryId = 7,
        questionText = "Was ist eine E-Mail?",
        answerA = "Eine elektronische Nachricht, die ueber das Internet verschickt wird",
        answerB = "Ein Brief, der per Post verschickt wird",
        answerC = "Eine SMS auf dem Handy",
        answerD = "Ein Computerprogramm",
        correctAnswer = 0, // A
        explanation = "Eine E-Mail (Electronic Mail) ist eine elektronische Nachricht, die ueber das Internet von einem Absender an einen oder mehrere Empfaenger gesendet wird.",
        difficulty = 1,
        funFact = "Die erste E-Mail der Geschichte schickte Ray Tomlinson 1971 an sich selbst. Er nutzte das '@'-Zeichen, das seitdem weltweit Standard in E-Mail-Adressen ist."
    ),

    // Question 22 - Email CC
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'CC' in einer E-Mail?",
        answerA = "Confidential Copy -- Geheimkopie",
        answerB = "Carbon Copy -- eine Kopie der E-Mail an weitere Empfaenger",
        answerC = "Computer Connection -- Computerverbindung",
        answerD = "Cancelled Content -- geloeschter Inhalt",
        correctAnswer = 1, // B
        explanation = "CC steht fuer 'Carbon Copy' (Kohledurchschlag). Personen im CC-Feld erhalten eine Kopie der E-Mail -- alle Empfaenger koennen sehen, wer noch eine Kopie bekommen hat.",
        difficulty = 1,
        funFact = "Der Begriff kommt von frueheren Schreibmaschinen-Zeiten: Man legte Kohlepapier zwischen zwei Blaetter, um eine Kopie zu erstellen -- daher 'Carbon Copy'."
    ),

    // Question 23 - Email BCC
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'BCC' in einer E-Mail?",
        answerA = "Basic Computer Code",
        answerB = "Blind Carbon Copy -- eine versteckte Kopie der E-Mail",
        answerC = "Big Content Creator",
        answerD = "Binary Communication Channel",
        correctAnswer = 1, // B
        explanation = "BCC steht fuer 'Blind Carbon Copy'. Personen im BCC-Feld erhalten eine Kopie, aber die anderen Empfaenger koennen diese Empfaenger nicht sehen.",
        difficulty = 1,
        funFact = "BCC wird haeufig genutzt, um den Datenschutz zu wahren -- z.B. wenn ein Newsletter an viele Empfaenger verschickt wird, ohne dass die E-Mail-Adressen der anderen sichtbar sind."
    ),

    // Question 24 - Email attachment
    Question(
        categoryId = 7,
        questionText = "Was ist ein E-Mail-Anhang?",
        answerA = "Die Signatur am Ende einer E-Mail",
        answerB = "Eine Datei, die zusammen mit der E-Mail gesendet wird",
        answerC = "Das Postfach, in dem E-Mails landen",
        answerD = "Der Betreff einer E-Mail",
        correctAnswer = 1, // B
        explanation = "Ein E-Mail-Anhang (auch Attachment genannt) ist eine Datei, die gemeinsam mit einer E-Mail verschickt wird -- zum Beispiel ein Foto, ein Dokument oder eine Tabelle.",
        difficulty = 1,
        funFact = "Die meisten E-Mail-Dienste begrenzen die Groesse von Anhaengen auf 25 MB. Groessere Dateien muessen ueber Cloud-Dienste geteilt werden."
    ),

    // Question 25 - Social Media - Facebook
    Question(
        categoryId = 7,
        questionText = "Wer gruendete das soziale Netzwerk Facebook?",
        answerA = "Bill Gates",
        answerB = "Elon Musk",
        answerC = "Mark Zuckerberg",
        answerD = "Jeff Bezos",
        correctAnswer = 2, // C
        explanation = "Mark Zuckerberg gruendete Facebook 2004 als Student an der Harvard University. Urspruenglich war es nur fuer Studenten der Universitaet gedacht.",
        difficulty = 1,
        funFact = "Facebook hatte im ersten Jahr nur 1 Million Nutzer. Heute nutzen ueber 3 Milliarden Menschen monatlich Facebook oder eine der anderen Meta-Plattformen wie Instagram und WhatsApp."
    ),

    // Question 26 - Social Media - Instagram
    Question(
        categoryId = 7,
        questionText = "Wofuer wird Instagram hauptsaechlich genutzt?",
        answerA = "Fuer das Versenden von E-Mails",
        answerB = "Fuer das Teilen von Fotos und Videos",
        answerC = "Fuer das Spielen von Online-Games",
        answerD = "Fuer das Bearbeiten von Texten",
        correctAnswer = 1, // B
        explanation = "Instagram ist eine Social-Media-Plattform, die hauptsaechlich zum Teilen von Fotos und kurzen Videos genutzt wird. Sie wurde 2010 gegruendet und 2012 von Facebook (heute Meta) gekauft.",
        difficulty = 1,
        funFact = "Das erste Foto auf Instagram war ein Bild eines Hundes vor einem Taco-Stand in Mexiko -- es wurde von Mitgruender Kevin Systrom gepostet."
    ),

    // Question 27 - Social Media - TikTok
    Question(
        categoryId = 7,
        questionText = "Aus welchem Land stammt die App TikTok?",
        answerA = "USA",
        answerB = "Japan",
        answerC = "Suedkorea",
        answerD = "China",
        correctAnswer = 3, // D
        explanation = "TikTok wurde vom chinesischen Unternehmen ByteDance entwickelt und 2016 in China gestartet. Die internationale Version startete 2017 und ist besonders bei Jugendlichen sehr beliebt.",
        difficulty = 1,
        funFact = "TikTok wurde 2022 und 2023 die meistgedownloadete App der Welt. In manchen Laendern verbringen Nutzer durchschnittlich ueber 90 Minuten pro Tag auf der Plattform."
    ),

    // Question 28 - Social Media - YouTube
    Question(
        categoryId = 7,
        questionText = "Welche Art von Inhalten wird hauptsaechlich auf YouTube geteilt?",
        answerA = "Nur Musikdateien",
        answerB = "Videos aller Art",
        answerC = "Nur Textartikel",
        answerD = "Nur Fotos",
        correctAnswer = 1, // B
        explanation = "YouTube ist eine Videoplattform, auf der Nutzer Videos hochladen, anschauen und teilen koennen -- von Musikvideos und Tutorials bis hin zu Filmen und Live-Streams.",
        difficulty = 1,
        funFact = "Auf YouTube werden jede Minute ueber 500 Stunden Videomaterial hochgeladen. Das erste YouTube-Video war 18 Sekunden lang und zeigte einen Zoobesuch -- es wurde am 23. April 2005 hochgeladen."
    ),

    // Question 29 - File types - PDF
    Question(
        categoryId = 7,
        questionText = "Was ist ein PDF-Dokument?",
        answerA = "Ein Bildformat wie JPG",
        answerB = "Ein Dateiformat fuer Dokumente, das auf allen Geraeten gleich aussieht",
        answerC = "Eine Musikdatei",
        answerD = "Ein Videodateiformat",
        correctAnswer = 1, // B
        explanation = "PDF (Portable Document Format) ist ein Dateiformat fuer Dokumente, das auf jedem Geraet identisch dargestellt wird. Es ist ideal fuer Rechnungen, Vertraege und Formulare.",
        difficulty = 1,
        funFact = "PDF wurde von Adobe in den 1990er Jahren entwickelt. Seit 2008 ist PDF ein offener Standard (ISO 32000) und gehoert nicht mehr exklusiv zu Adobe."
    ),

    // Question 30 - File types - JPG
    Question(
        categoryId = 7,
        questionText = "Wofuer wird das Dateiformat JPG (oder JPEG) verwendet?",
        answerA = "Fuer Musikdateien",
        answerB = "Fuer Textdokumente",
        answerC = "Fuer Fotos und Bilder",
        answerD = "Fuer Computerprogramme",
        correctAnswer = 2, // C
        explanation = "JPG (oder JPEG) ist ein weit verbreitetes Format fuer Fotos und Bilder. Es komprimiert Bilder, um Speicherplatz zu sparen, wobei etwas Qualitaet verloren geht.",
        difficulty = 1,
        funFact = "JPEG steht fuer 'Joint Photographic Experts Group' -- die Gruppe, die das Format 1992 entwickelte. Das erste jemals als JPEG gespeicherte Bild war ein Foto einer Frau namens Lena Forssberg."
    ),

    // Question 31 - File types - MP3
    Question(
        categoryId = 7,
        questionText = "Welches Dateiformat wird typischerweise fuer Musikdateien verwendet?",
        answerA = "PDF",
        answerB = "JPG",
        answerC = "MP3",
        answerD = "DOCX",
        correctAnswer = 2, // C
        explanation = "MP3 ist das beliebteste Format fuer Audiodateien. Es komprimiert Musik so, dass Dateien viel kleiner werden, ohne dass der Klangunterschied fuer die meisten Hoerer merklich ist.",
        difficulty = 1,
        funFact = "MP3 wurde in Deutschland am Fraunhofer-Institut entwickelt. Die Veroeffentlichung 1993 veraenderte die Musikindustrie fundamental -- und war mitverantwortlich fuer den Aufstieg von Napster und iTunes."
    ),

    // Question 32 - File types - MP4
    Question(
        categoryId = 7,
        questionText = "Fuer was steht das Dateiformat MP4?",
        answerA = "Ein Textformat fuer E-Books",
        answerB = "Ein Videoformat fuer Filme und Videos",
        answerC = "Ein Bildformat fuer Fotos",
        answerD = "Ein Archivformat wie ZIP",
        correctAnswer = 1, // B
        explanation = "MP4 ist ein weit verbreitetes Videoformat, das sowohl Video- als auch Audiodaten enthaelt. Es wird fuer Filme, YouTube-Videos und Handyvideos verwendet.",
        difficulty = 1,
        funFact = "MP4 basiert auf dem QuickTime-Format von Apple. Es ist heute das Standardformat fuer Smartphones, Streaming-Dienste und Online-Videos."
    ),

    // Question 33 - Copy & Paste
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Kopieren und Einfuegen' am Computer (Copy & Paste)?",
        answerA = "Einen Text drucken und dann loeschen",
        answerB = "Einen Text oder ein Bild duplizieren und an einer anderen Stelle einfuegen",
        answerC = "Eine Datei dauerhaft loeschen",
        answerD = "Einen Text permanent verschieben",
        correctAnswer = 1, // B
        explanation = "Kopieren und Einfuegen (Copy & Paste) erstellt eine Kopie eines markierten Elements und fuegt sie an einem anderen Ort ein. Das Original bleibt dabei erhalten.",
        difficulty = 1,
        funFact = "Der Entwickler Larry Tesler erfand Copy & Paste in den 1970er Jahren bei Xerox PARC. Er war so stolz darauf, dass sein Autonummernschildern 'NO MODES' trug -- eine Anspielung auf seine Arbeit."
    ),

    // Question 34 - Save
    Question(
        categoryId = 7,
        questionText = "Was passiert, wenn man eine Datei am Computer 'speichert'?",
        answerA = "Die Datei wird ins Internet hochgeladen",
        answerB = "Die Datei wird dauerhaft auf dem Speichermedium gesichert",
        answerC = "Die Datei wird verschluesselt",
        answerD = "Die Datei wird gedruckt",
        correctAnswer = 1, // B
        explanation = "Beim Speichern werden die aktuellen Daten dauerhaft auf der Festplatte oder einem anderen Speichermedium gesichert. Ohne Speichern gehen Aenderungen beim Schliessen verloren.",
        difficulty = 1,
        funFact = "Der Tastenkurzbefehl Strg+S (Windows) bzw. Cmd+S (Mac) zum Speichern existiert seit den 1980er Jahren und hat sich bis heute nicht veraendert."
    ),

    // Question 35 - Print
    Question(
        categoryId = 7,
        questionText = "Welches Geraet wird verwendet, um Dokumente auf Papier auszudrucken?",
        answerA = "Scanner",
        answerB = "Drucker",
        answerC = "Monitor",
        answerD = "Router",
        correctAnswer = 1, // B
        explanation = "Ein Drucker ist ein Ausgabegeraet, das digitale Dokumente auf Papier oder anderen Materialien ausdruckt. Es gibt Tintenstrahl- und Laserdrucker.",
        difficulty = 1,
        funFact = "Der erste Computer-Drucker wurde 1953 von Remington-Rand entwickelt und druckte 600 Zeilen pro Minute. Moderne Heim-Tintenstrahldrucker sind langsamer, aber viel guenstiger."
    ),

    // Question 36 - Password
    Question(
        categoryId = 7,
        questionText = "Was ist ein sicheres Passwort?",
        answerA = "Das eigene Geburtsdatum",
        answerB = "Das Wort 'Passwort'",
        answerC = "Eine Kombination aus Gross- und Kleinbuchstaben, Zahlen und Sonderzeichen",
        answerD = "Der eigene Vorname",
        correctAnswer = 2, // C
        explanation = "Ein sicheres Passwort besteht aus einer zufaelligen Kombination von Gross- und Kleinbuchstaben, Zahlen und Sonderzeichen. Es sollte mindestens 8 Zeichen lang sein.",
        difficulty = 1,
        funFact = "Das am haeufigsten verwendete Passwort weltweit ist '123456' -- gefolgt von 'password'. Beide koennen von Hackerprogrammen in weniger als einer Sekunde geknackt werden."
    ),

    // Question 37 - Virus
    Question(
        categoryId = 7,
        questionText = "Was ist ein Computervirus?",
        answerA = "Ein Kuehlprogramm fuer den Prozessor",
        answerB = "Schadhafte Software, die sich selbst vervielfaeltigt und Schaden anrichten kann",
        answerC = "Ein Programm zur Datensicherung",
        answerD = "Ein Update fuer das Betriebssystem",
        correctAnswer = 1, // B
        explanation = "Ein Computervirus ist Schadsoftware (Malware), die sich in andere Programme einschleust, sich vervielfaeltigt und Schaden am System oder den Daten anrichten kann.",
        difficulty = 1,
        funFact = "Der erste Computervirus namens 'Creeper' erschien 1971 im ARPANET-Netzwerk. Er war harmloss und zeigte nur die Meldung: 'I'm the creeper, catch me if you can!'"
    ),

    // Question 38 - Cloud
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Cloud' in der Computerwelt?",
        answerA = "Ein Programm zum Wetter-Tracking",
        answerB = "Datenspeicherung und -verarbeitung auf entfernten Servern im Internet",
        answerC = "Eine drahtlose Maus",
        answerD = "Ein spezielles Kuehlsystem fuer Computer",
        correctAnswer = 1, // B
        explanation = "Die Cloud bezeichnet Datenspeicherung und -dienste, die auf entfernten Servern im Internet laufen. Man kann von ueberall auf seine Daten zugreifen, ohne sie lokal zu speichern.",
        difficulty = 1,
        funFact = "Wenn du Google Drive, iCloud, OneDrive oder Dropbox nutzt, verwendest du die Cloud. Physisch befinden sich deine Daten in riesigen Rechenzentren, die so viel Strom verbrauchen wie kleine Staedte."
    ),

    // Question 39 - App
    Question(
        categoryId = 7,
        questionText = "Was ist eine App?",
        answerA = "Ein physisches Zubehoerartikel fuer Smartphones",
        answerB = "Ein Anwendungsprogramm, meist fuer Smartphones und Tablets",
        answerC = "Ein Speichermedium wie eine SD-Karte",
        answerD = "Ein Kabel zum Laden des Akkus",
        correctAnswer = 1, // B
        explanation = "Eine App (kurz fuer Application, zu Deutsch: Anwendung) ist ein Programm, das auf Smartphones, Tablets oder Computern laeuft. Apps werden ueber App Stores heruntergeladen.",
        difficulty = 1,
        funFact = "Im Apple App Store und Google Play Store sind zusammen ueber 5 Millionen Apps verfuegbar. Die beliebtesten Apps weltweit sind TikTok, Instagram, Facebook und WhatsApp."
    ),

    // Question 40 - Router
    Question(
        categoryId = 7,
        questionText = "Was macht ein Router zu Hause?",
        answerA = "Er druckt Dokumente",
        answerB = "Er verteilt den Internetanschluss im Heimnetzwerk",
        answerC = "Er speichert Fotos",
        answerD = "Er ladet Akkus auf",
        correctAnswer = 1, // B
        explanation = "Ein Router ist ein Geraet, das den Internetanschluss empfaengt und per Kabel (LAN) oder kabellos (WLAN/WiFi) an mehrere Geraete im Haushalt weitergibt.",
        difficulty = 1,
        funFact = "Die Bezeichnung 'Fritz!Box' ist kein Gattungsname, sondern eine Marke des deutschen Unternehmens AVM. In Deutschland ist die Fritz!Box mit ca. 60% Marktanteil der beliebteste Heimrouter."
    ),

    // Question 41 - Keyboard shortcut
    Question(
        categoryId = 7,
        questionText = "Welche Tastenkombination wird unter Windows zum Kopieren verwendet?",
        answerA = "Strg + V",
        answerB = "Strg + Z",
        answerC = "Strg + C",
        answerD = "Strg + X",
        correctAnswer = 2, // C
        explanation = "Mit Strg+C (Windows) bzw. Cmd+C (Mac) wird ein markierter Text oder ein markiertes Objekt in die Zwischenablage kopiert. Mit Strg+V wird es anschliessend eingefuegt.",
        difficulty = 1,
        funFact = "Strg+Z ist das Undo -- Rueckgaengig-Machen. Es wurde in den 1980ern bei Apple eingefuehrt und gilt als eine der wichtigsten Erfindungen der Computergeschichte."
    ),

    // Question 42 - Search engine
    Question(
        categoryId = 7,
        questionText = "Was ist Google hauptsaechlich?",
        answerA = "Ein Betriebssystem",
        answerB = "Eine Suchmaschine im Internet",
        answerC = "Ein Textverarbeitungsprogramm",
        answerD = "Ein sozialer Netzwerk",
        correctAnswer = 1, // B
        explanation = "Google ist in erster Linie eine Suchmaschine, mit der man Informationen im Internet suchen kann. Der Name kommt vom Wort 'Googol' -- die Zahl 1 mit 100 Nullen.",
        difficulty = 1,
        funFact = "Google verarbeitet taeglich ueber 8,5 Milliarden Suchanfragen -- das sind rund 99.000 Suchanfragen pro Sekunde. Google wurde 1998 von Larry Page und Sergey Brin als Studenten gegrindet."
    ),

    // Question 43 - Touchscreen
    Question(
        categoryId = 7,
        questionText = "Was ist ein Touchscreen?",
        answerA = "Ein besonders heller Bildschirm",
        answerB = "Ein Bildschirm, der auf Berueherungen mit den Fingern reagiert",
        answerC = "Ein Bildschirm ohne Kabel",
        answerD = "Ein Bildschirm mit eingebauter Kamera",
        correctAnswer = 1, // B
        explanation = "Ein Touchscreen ist ein Bildschirm, der Beruehrungen erkennt und darauf reagiert. Dadurch entfaellt die Notwendigkeit einer Maus oder Tastatur fuer viele Aufgaben.",
        difficulty = 1,
        funFact = "Das erste massentaugliche Touchscreen-Geraet war der IBM Simon Personal Communicator von 1994 -- ein fruehes Smartphone, noch vor dem iPhone."
    ),

    // Question 44 - Bluetooth
    Question(
        categoryId = 7,
        questionText = "Was ist Bluetooth?",
        answerA = "Ein Antivirenprogramm",
        answerB = "Ein Standard fuer kabellose Kurzstreckenkommunikation zwischen Geraeten",
        answerC = "Eine Internetverbindung",
        answerD = "Ein Dateiformat fuer Musik",
        correctAnswer = 1, // B
        explanation = "Bluetooth ist ein Standard fuer kabellose Verbindungen auf kurze Distanz (ca. 10 Meter). Es wird z.B. fuer kabellose Kopfhoerer, Lautsprecher und Computermaeuse genutzt.",
        difficulty = 1,
        funFact = "Bluetooth ist nach dem daenischen Wikingerkoenig Harald Blauzahn (Harald Bluetooth, ca. 958--986) benannt. Er einte damaelische Staemme -- aehnlich wie Bluetooth verschiedene Geraete verbindet."
    ),

    // Question 45 - Delete key
    Question(
        categoryId = 7,
        questionText = "Was macht die Entf-Taste (Entfernen) auf einer Windows-Tastatur?",
        answerA = "Sie schliesst das aktuelle Programm",
        answerB = "Sie loescht das Zeichen oder Element nach dem Cursor bzw. markierte Elemente",
        answerC = "Sie startet den Computer neu",
        answerD = "Sie oeffnet den Datei-Explorer",
        correctAnswer = 1, // B
        explanation = "Die Entf-Taste (Delete) loescht das Zeichen rechts vom Cursor oder ein markiertes Element. Bei Dateien verschiebt sie diese in den Papierkorb.",
        difficulty = 1,
        funFact = "Im Unterschied zur Ruecktaste (Backspace) loescht Entf nicht das Zeichen links vom Cursor, sondern rechts. Die Ruecktaste loescht also rueckwaerts, Entf vorwaerts."
    ),

    // Question 46 - Screenshot
    Question(
        categoryId = 7,
        questionText = "Was ist ein Screenshot?",
        answerA = "Eine Aufnahme der Kamera des Computers",
        answerB = "Ein Foto des aktuell sichtbaren Bildschirminhalts",
        answerC = "Ein Video des Computerbildschirms",
        answerD = "Eine Sicherheitskopie des Betriebssystems",
        correctAnswer = 1, // B
        explanation = "Ein Screenshot ist eine Aufnahme des aktuellen Bildschirminhalts als Bilddatei. Er wird genutzt, um Informationen zu teilen oder Probleme zu dokumentieren.",
        difficulty = 1,
        funFact = "Unter Windows erstellt man einen Screenshot mit der Taste 'Druck' (Print Screen) oder der Tastenkombination Windows+Umschalt+S. Auf dem Handy drueckt man meist gleichzeitig auf Einschalten und Leiser."
    ),

    // Question 47 - Spam
    Question(
        categoryId = 7,
        questionText = "Was sind Spam-E-Mails?",
        answerA = "Willkommene Newsletter von Freunden",
        answerB = "Unerwuenschte Massen-E-Mails, oft Werbung oder Betrug",
        answerC = "Wichtige System-Benachrichtigungen",
        answerD = "Automatische Antworten bei Abwesenheit",
        correctAnswer = 1, // B
        explanation = "Spam bezeichnet unerwuenschte E-Mails, die massenhaft verschickt werden. Sie enthalten oft Werbung, Betrugsversuche (Phishing) oder Schadsoftware.",
        difficulty = 1,
        funFact = "Etwa 45% aller weltweit versendeten E-Mails sind Spam -- das sind taeglich ueber 150 Milliarden Spam-Mails. Der Begriff geht auf ein britisches Comedyskit der Monty Python zurueck."
    ),

    // Question 48 - Download vs Upload
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Herunterladen' (Download) im Internet?",
        answerA = "Daten vom eigenen Computer ins Internet uebertragen",
        answerB = "Daten vom Internet auf den eigenen Computer uebertragen",
        answerC = "Dateien auf dem Computer loeschen",
        answerD = "Das Internet abschalten",
        correctAnswer = 1, // B
        explanation = "Beim Herunterladen (Download) werden Daten aus dem Internet auf das eigene Geraet uebertragen. Das Gegenteil ist das Hochladen (Upload) -- Daten vom eigenen Geraet ins Internet senden.",
        difficulty = 1,
        funFact = "Die durchschnittliche Internetgeschwindigkeit weltweit betraegt ca. 100 Mbit/s. Mit dieser Geschwindigkeit laesst sich ein kompletter HD-Film (ca. 4 GB) in etwa 5 Minuten herunterladen."
    ),

    // Question 49 - Recycle bin
    Question(
        categoryId = 7,
        questionText = "Was ist der Papierkorb am Computer?",
        answerA = "Ein Ordner fuer wichtige Dateien",
        answerB = "Ein temporaerer Bereich fuer geloeschte Dateien, die wiederhergestellt werden koennen",
        answerC = "Ein Bereich fuer heruntergeladene Dateien",
        answerD = "Ein Bereich fuer verschluesselte Dokumente",
        correctAnswer = 1, // B
        explanation = "Der Papierkorb (Windows) bzw. Papierkorb/Trash (Mac) ist ein Bereich, in dem geloeschte Dateien zwischengespeichert werden, bevor sie endgueltig entfernt werden. Man kann sie noch wiederherstellen.",
        difficulty = 1,
        funFact = "Wenn du den Papierkorb leerst, sind die Dateien nicht sofort physisch geloescht -- der Speicherplatz wird nur als frei markiert. Mit speziellen Programmen lassen sich Daten oft noch wiederherstellen."
    ),

    // Question 50 - Streaming
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Streaming' bei Musik oder Videos?",
        answerA = "Dateien dauerhaft herunterladen und speichern",
        answerB = "Inhalte direkt aus dem Internet abspielen, ohne sie vollstaendig herunterzuladen",
        answerC = "Inhalte per Kabel von einem Geraet zum anderen uebertragen",
        answerD = "Dateien verschluesseln und senden",
        correctAnswer = 1, // B
        explanation = "Beim Streaming werden Audio- oder Videodaten in Echtzeit aus dem Internet abgespielt, ohne die komplette Datei vorher herunterzuladen. Beispiele sind Netflix, Spotify und YouTube.",
        difficulty = 1,
        funFact = "Netflix-Streaming macht in den USA zu Spitzenzeiten ca. 15% des gesamten Internetverkehrs aus. Weltweit wurden 2023 mehr Filme und Serien gestreamt als je zuvor in der Geschichte des Films."
    )

)
