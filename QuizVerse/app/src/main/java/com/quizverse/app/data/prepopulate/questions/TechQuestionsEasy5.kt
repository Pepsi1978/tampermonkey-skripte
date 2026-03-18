package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsEasy5(): List<Question> = listOf(

    // Question 1 -- AI basics
    Question(
        categoryId = 7,
        questionText = "Was bedeutet der Begriff 'Kuenstliche Intelligenz'?",
        answerA = "Computer koennen selbst denken und Aufgaben loesen, die sonst Menschen erledigen",
        answerB = "Ein besonders schnelles Computerprogramm",
        answerC = "Eine Datenbank mit vielen Bildern",
        answerD = "Ein Roboter der aussieht wie ein Mensch",
        correctAnswer = 0,
        explanation = "Kuenstliche Intelligenz (KI) bedeutet, dass Computer Aufgaben ausfuehren, die normalerweise menschliche Intelligenz erfordern, z.B. Sprache verstehen oder Bilder erkennen.",
        difficulty = 1,
        funFact = "Der Begriff 'Artificial Intelligence' wurde 1956 vom Informatiker John McCarthy gepraeagt, der auch die erste KI-Konferenz organisierte."
    ),

    // Question 2 -- AI basics: chatbots
    Question(
        categoryId = 7,
        questionText = "Was ist ein Chatbot?",
        answerA = "Ein Roboter der tippen kann",
        answerB = "Ein Computerprogramm, das automatisch auf Nachrichten antwortet",
        answerC = "Eine App fuer Gruppenchats",
        answerD = "Ein Onlinespiel fuer Gesprachspartner",
        correctAnswer = 1,
        explanation = "Ein Chatbot ist ein Programm, das Texteingaben versteht und automatisch sinnvolle Antworten liefert, z.B. im Kundenservice oder auf Webseiten.",
        difficulty = 1,
        funFact = "Der bekannteste Chatbot der Welt ist ChatGPT von OpenAI, der innerhalb von 5 Tagen nach seinem Start eine Million Nutzer erreichte."
    ),

    // Question 3 -- AI: Siri
    Question(
        categoryId = 7,
        questionText = "Was ist Siri?",
        answerA = "Ein sozianes Netzwerk von Apple",
        answerB = "Ein Sprachassistent von Apple, der Fragen per Stimme beantwortet",
        answerC = "Eine Navigations-App fuer das iPhone",
        answerD = "Ein Musik-Streaming-Dienst von Apple",
        correctAnswer = 1,
        explanation = "Siri ist Apples KI-gestuetzter Sprachassistent, der auf Spracheingaben reagiert, Fragen beantwortet und Aufgaben auf Apple-Geraeten erledigt.",
        difficulty = 1,
        funFact = "Siri wurde 2011 mit dem iPhone 4S eingefuehrt. Der Name 'Siri' bedeutet auf Norwegisch 'schoene Frau, die dich zum Sieg fuehrt'."
    ),

    // Question 4 -- AI: Alexa
    Question(
        categoryId = 7,
        questionText = "Welches Unternehmen hat den Sprachassistenten Alexa entwickelt?",
        answerA = "Google",
        answerB = "Apple",
        answerC = "Amazon",
        answerD = "Microsoft",
        correctAnswer = 2,
        explanation = "Alexa ist der KI-Sprachassistent von Amazon und ist vor allem auf dem smarten Lautsprecher Amazon Echo zu Hause.",
        difficulty = 1,
        funFact = "Alexa wurde nach der Bibliothek von Alexandria benannt, einer der groessten Bibliotheken der Antike -- als Symbol fuer Wissen."
    ),

    // Question 5 -- AI basics: machine learning
    Question(
        categoryId = 7,
        questionText = "Wie lernt eine KI, Fotos von Katzen zu erkennen?",
        answerA = "Ein Programmierer beschreibt jede Katze einzeln im Code",
        answerB = "Die KI sieht sehr viele Katzenfotos und lernt dabei selbst Merkmale zu erkennen",
        answerC = "Die KI sucht im Internet nach Katzen",
        answerD = "Ein Mensch tippt die Beschreibung jedes Bildes ein",
        correctAnswer = 1,
        explanation = "Maschinelles Lernen bedeutet, dass eine KI aus tausenden Beispielbildern selbststaendig lernt, welche Merkmale typisch fuer Katzen sind.",
        difficulty = 1,
        funFact = "Google trainierte 2012 eine KI mit 10 Millionen YouTube-Videos, um Katzen zu erkennen -- ohne dass jemand sagte was eine Katze ist."
    ),

    // Question 6 -- VR basics
    Question(
        categoryId = 7,
        questionText = "Wofuer steht die Abkuerzung 'VR'?",
        answerA = "Video Recording",
        answerB = "Virtual Reality",
        answerC = "Visual Resolution",
        answerD = "Variable Range",
        correctAnswer = 1,
        explanation = "VR steht fuer Virtual Reality, zu Deutsch 'Virtuelle Realitaet'. Es bezeichnet computererzeugte, dreidimensionale Welten, in die man eintaucht.",
        difficulty = 1,
        funFact = "Der Begriff 'Virtual Reality' wurde 1987 vom Informatiker Jaron Lanier gepraeagt, der auch einen der ersten kommerziellen VR-Handschuhe baute."
    ),

    // Question 7 -- VR: headset
    Question(
        categoryId = 7,
        questionText = "Was benoetigt man, um Virtual Reality zu erleben?",
        answerA = "Einen grossen Fernseher",
        answerB = "Eine VR-Brille (Headset) die man aufsetzt",
        answerC = "Einen speziellen Lautsprecher",
        answerD = "Eine Hochgeschwindigkeitskamera",
        correctAnswer = 1,
        explanation = "Ein VR-Headset bedeckt die Augen komplett und zeigt auf zwei kleinen Bildschirmen leicht unterschiedliche Bilder, was einen echten Tiefeneindruck erzeugt.",
        difficulty = 1,
        funFact = "Meta Quest 3 wiegt nur 515 Gramm und benoetigt keinen angeschlossenen Computer -- man kann damit frei im Zimmer herumgehen."
    ),

    // Question 8 -- AR basics
    Question(
        categoryId = 7,
        questionText = "Was ist Augmented Reality (AR)?",
        answerA = "Eine vollstaendig computergenerierte Welt",
        answerB = "Digitale Informationen oder Objekte, die in die echte Welt eingeblendet werden",
        answerC = "Ein Videoeffekt fuer Kinofilme",
        answerD = "Eine verbesserte Kamera-Technologie",
        correctAnswer = 1,
        explanation = "Bei AR (Augmented Reality) wird die echte Umgebung in Echtzeit mit digitalen Inhalten wie Texten, Bildern oder 3D-Objekten ueberlagert.",
        difficulty = 1,
        funFact = "Das Handyspiel Pokemon Go (2016) machte AR weltweit bekannt -- Spieler sahen Pokemon per Kamera in ihrer realen Umgebung."
    ),

    // Question 9 -- Self-driving cars
    Question(
        categoryId = 7,
        questionText = "Was ist ein selbstfahrendes Auto?",
        answerA = "Ein Auto das von einem Roboter gesteuert wird",
        answerB = "Ein Fahrzeug das mit KI und Sensoren ohne menschlichen Fahrer fahren kann",
        answerC = "Ein Elektroauto das besonders schnell faehrt",
        answerD = "Ein Auto mit automatischer Einparkhilfe",
        correctAnswer = 1,
        explanation = "Autonome Fahrzeuge nutzen Kameras, Radarsensoren und KI, um Strassen zu erkennen und ohne Eingreifen eines Menschen sicher zu fahren.",
        difficulty = 1,
        funFact = "Tesla-Autos sammeln taeglich Millionen Kilometer an Fahrdaten, die zum Training der KI fuer das autonome Fahren genutzt werden."
    ),

    // Question 10 -- Self-driving: sensors
    Question(
        categoryId = 7,
        questionText = "Welche Sensorart wird bei selbstfahrenden Autos eingesetzt um die Umgebung zu erfassen?",
        answerA = "Nur Kameras",
        answerB = "Kameras, Radarsensoren und Lidar",
        answerC = "Nur GPS",
        answerD = "Ultraschall und Mikrofone",
        correctAnswer = 1,
        explanation = "Selbstfahrende Autos kombinieren Kameras, Radar (fuer Abstands- und Geschwindigkeitsmessung) und Lidar (Laserscan der Umgebung), um zuverlaessig zu navigieren.",
        difficulty = 1,
        funFact = "Lidar steht fuer 'Light Detection and Ranging' und funktioniert wie ein Radar, aber mit Laserstrahlen statt Funkwellen."
    ),

    // Question 11 -- Solar panels basics
    Question(
        categoryId = 7,
        questionText = "Wie erzeugen Solarpanele Strom?",
        answerA = "Durch Waerme die das Dach aufheizt",
        answerB = "Durch Sonnenlicht das direkt in elektrischen Strom umgewandelt wird",
        answerC = "Durch Wind der die Panels bewegt",
        answerD = "Durch chemische Reaktionen in den Panels",
        correctAnswer = 1,
        explanation = "Solarpanele enthalten Solarzellen aus Halbleitermaterial (meist Silizium), die Lichtenergie direkt in elektrische Energie umwandeln.",
        difficulty = 1,
        funFact = "Der Wirkungsgrad einer typischen Heim-Solaranlage betraegt etwa 15-22% -- die restliche Sonnenenergie wird als Waerme abgestrahlt."
    ),

    // Question 12 -- Solar panels: usage
    Question(
        categoryId = 7,
        questionText = "Wozu dienen Solarpanele auf Hausdaechern?",
        answerA = "Als Waermeschutz fuer das Dach",
        answerB = "Um eigenen Strom aus Sonnenlicht zu erzeugen und die Stromrechnung zu senken",
        answerC = "Als Antennen fuer schnelles Internet",
        answerD = "Um Regenwasser zu sammeln",
        correctAnswer = 1,
        explanation = "Hausdach-Solaranlagen (Photovoltaik) erzeugen aus Sonnenlicht Strom fuer den Eigenverbrauch. Ueberschuessiger Strom kann ins Netz eingespeist werden.",
        difficulty = 1,
        funFact = "Deutschland ist trotz seines bewoelkten Klimas einer der groessten Solarenergie-Produzenten weltweit und hat zeitweise mehr Strom erzeugt als verbraucht."
    ),

    // Question 13 -- Wind turbines
    Question(
        categoryId = 7,
        questionText = "Was ist ein Windrad (Windkraftanlage)?",
        answerA = "Ein grosser Luefter der kuehle Luft erzeugt",
        answerB = "Eine Anlage die Windenergie in elektrischen Strom umwandelt",
        answerC = "Ein Gerat das Windgeschwindigkeit misst",
        answerD = "Eine Pumpe fuer Wasser die vom Wind angetrieben wird",
        correctAnswer = 1,
        explanation = "Windkraftanlagen nutzen den Wind, um grosse Rotorblaetter in Drehbewegung zu versetzen, die einen Generator antreiben und so Strom erzeugen.",
        difficulty = 1,
        funFact = "Ein modernes Offshore-Windrad mit 15 MW Leistung kann mit einer einzigen Umdrehung seines Rotors genug Strom fuer eine vierkoepfige Familie fuer einen Tag erzeugen."
    ),

    // Question 14 -- Renewable energy
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'erneuerbaren Energien'?",
        answerA = "Energie aus Kohle und Erdoel, die sich regeneriert",
        answerB = "Energiequellen die sich natuerlich erneuern, wie Sonne, Wind und Wasser",
        answerC = "Strom der aus alten Batterien zurueckgewonnen wird",
        answerD = "Atomenergie, weil Uran sehr lange haelt",
        correctAnswer = 1,
        explanation = "Erneuerbare Energien sind Energiequellen, die sich in der Natur staendig erneuern und daher nicht erschoepft werden -- z.B. Sonne, Wind, Wasser und Erdwaerme.",
        difficulty = 1,
        funFact = "Im Jahr 2023 stammten erstmals mehr als 50% des deutschen Stroms aus erneuerbaren Energien -- Windkraft war dabei die staerkste Quelle."
    ),

    // Question 15 -- Electric cars
    Question(
        categoryId = 7,
        questionText = "Was ist ein Elektroauto?",
        answerA = "Ein Auto mit einem besonders starken Benzinmotor",
        answerB = "Ein Fahrzeug, das ausschliesslich mit Strom aus einem Akku angetrieben wird",
        answerC = "Ein Auto das sowohl mit Benzin als auch mit Strom faehrt",
        answerD = "Ein ferngesteuertes Fahrzeug",
        correctAnswer = 1,
        explanation = "Ein Elektroauto (E-Auto) hat keinen Verbrennungsmotor sondern einen Elektromotor, der von einem grossen Akku (Batterie) mit Energie versorgt wird.",
        difficulty = 1,
        funFact = "Tesla-Gruender Elon Musk sagte, ein Elektroauto sei wie ein Smartphone auf Raedern -- es bekommt neue Funktionen per Software-Update."
    ),

    // Question 16 -- Electric cars: charging
    Question(
        categoryId = 7,
        questionText = "Wie wird ein Elektroauto 'betankt'?",
        answerA = "Mit Benzin an der Tankstelle",
        answerB = "Mit Wasserstoff aus einer Zapfsaeule",
        answerC = "Mit Strom an einer Ladestation oder Haushaltssteckdose",
        answerD = "Mit einem speziellen Elektrolyt",
        correctAnswer = 2,
        explanation = "Elektroautos werden aufgeladen, indem man sie per Kabel mit einer Ladestation (Wallbox), einer oeffentlichen Schnellladesaeule oder einer Haushaltssteckdose verbindet.",
        difficulty = 1,
        funFact = "An einer Schnellladesaeule (150 kW) kann man ein Elektroauto in ca. 20 Minuten auf 80% laden -- Kaffee trinken und schon ist man wieder unterwegs."
    ),

    // Question 17 -- E-bikes
    Question(
        categoryId = 7,
        questionText = "Was ist ein E-Bike?",
        answerA = "Ein Motorrad mit elektrishem Antrieb",
        answerB = "Ein Fahrrad mit einem eingebauten Elektromotor, der beim Treten unterstuetzt",
        answerC = "Ein Fahrrad ohne Pedale",
        answerD = "Ein Elektroauto in Fahrradgroesse",
        correctAnswer = 1,
        explanation = "Ein E-Bike ist ein Fahrrad mit Elektromotor und Akku. Der Motor unterstuetzt den Fahrer beim Treten, macht Bergauffahrten leichter und erhoehe die Reichweite.",
        difficulty = 1,
        funFact = "In Deutschland wurden 2023 mehr E-Bikes als normale Fahrraeder verkauft -- E-Bikes sind das meistgekaufte elektrische Fahrzeug des Landes."
    ),

    // Question 18 -- E-scooters
    Question(
        categoryId = 7,
        questionText = "Was ist ein E-Scooter?",
        answerA = "Ein kleiner elektrischer Motorroller fuer Kinder",
        answerB = "Ein elektrischer Tretroller fuer Erwachsene, der per App geliehen werden kann",
        answerC = "Ein Rollstuhl mit Elektromotor",
        answerD = "Ein elektrisches Einrad",
        correctAnswer = 1,
        explanation = "E-Scooter sind elektrische Tretroller die man oft per App mieten kann. Sie sind beliebt fuer kurze Strecken in Stadten als Alternative zu Bus oder Auto.",
        difficulty = 1,
        funFact = "In Berlin gibt es ueber 40.000 Leih-E-Scooter verschiedener Anbieter wie Lime, Tier und Bolt -- das entspricht etwa einem Scooter auf jeden 90. Einwohner."
    ),

    // Question 19 -- E-waste
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Elektroschrott'?",
        answerA = "Alte Zeitungen und Pappe",
        answerB = "Ausgediente elektronische Geraete wie alte Handys, Computer oder Fernseher",
        answerC = "Defekte Steckdosen und Lichtschalter",
        answerD = "Kabel und Leitungen aus Altbauten",
        correctAnswer = 1,
        explanation = "Elektroschrott (E-Waste) umfasst alle entsorgten elektrischen und elektronischen Geraete. Er enthaelt wertvolle Rohstoffe, aber auch gefaehrliche Schadstoffe.",
        difficulty = 1,
        funFact = "Weltweit fallen jaehrlich ueber 50 Millionen Tonnen Elektroschrott an -- das entspricht dem Gewicht aller kommerziellen Flugzeuge die je gebaut wurden."
    ),

    // Question 20 -- E-waste recycling
    Question(
        categoryId = 7,
        questionText = "Wo gibt man alte Handys und Computer richtig ab?",
        answerA = "Im normalen Hausmuell",
        answerB = "Am Wertstoffhof oder bei Haendlern die Elektroschrott annehmen",
        answerC = "Im Papiermuelleimer",
        answerD = "Im Gelben Sack",
        correctAnswer = 1,
        explanation = "Elektrogeraete duerfen nicht in den Hausmuell, da sie Schadstoffe enthalten. Sie gehoeren zum Wertstoffhof, zu Elektromaerkten oder zu speziellen Sammelstellen.",
        difficulty = 1,
        funFact = "Ein altes Smartphone enthaelt winzige Mengen Gold, Silber, Kupfer und seltene Erden -- aus einer Tonne alter Handys kann man 300g Gold gewinnen."
    ),

    // Question 21 -- Smartwatch
    Question(
        categoryId = 7,
        questionText = "Was ist eine Smartwatch?",
        answerA = "Eine Uhr die sehr genau geht",
        answerB = "Eine Armbanduhr mit Computer-Funktionen wie Benachrichtigungen und Gesundheits-Tracking",
        answerC = "Eine Uhr mit eingebautem Wecker",
        answerD = "Eine Uhr die sich automatisch auf Zeitzonenaenderungen einstellt",
        correctAnswer = 1,
        explanation = "Eine Smartwatch ist mehr als eine Uhr -- sie zeigt Benachrichtigungen vom Smartphone, trackt Sport und Gesundheit und manche koennen sogar telefonieren.",
        difficulty = 1,
        funFact = "Die Apple Watch ist die meistverkaufte Uhr der Welt -- sie verkauft mehr Exemplare pro Jahr als alle Schweizer Uhrenmarken zusammen."
    ),

    // Question 22 -- Fitness tracker: heart rate
    Question(
        categoryId = 7,
        questionText = "Was kann ein Fitness-Tracker am Handgelenk messen?",
        answerA = "Den Blutalkohol",
        answerB = "Die Herzfrequenz und die Anzahl der Schritte",
        answerC = "Den Blutdruck exakt wie beim Arzt",
        answerD = "Den Sauerstoffgehalt der Luft",
        correctAnswer = 1,
        explanation = "Fitness-Tracker messen Herzfrequenz per Lichtsensor durch die Haut und zaehlen Schritte ueber einen Bewegungssensor (Beschleunigungsmesser).",
        difficulty = 1,
        funFact = "Die bekanntesten Fitness-Tracker-Marken heissen Fitbit, Garmin und Xiaomi Mi Band -- das guenstigste Modell von Xiaomi kostet weniger als 30 Euro."
    ),

    // Question 23 -- Video calls: Zoom
    Question(
        categoryId = 7,
        questionText = "Wofuer wird Zoom hauptsaechlich genutzt?",
        answerA = "Fuer Online-Spiele mit vielen Spielern",
        answerB = "Fuer Videokonferenzen und Videogespraeche ueber das Internet",
        answerC = "Fuer das Bearbeiten von Videos",
        answerD = "Als Cloud-Speicher fuer Videos",
        correctAnswer = 1,
        explanation = "Zoom ist eine Plattform fuer Videoanrufe, bei der bis zu hunderte Teilnehmer gleichzeitig per Video und Audio kommunizieren koennen.",
        difficulty = 1,
        funFact = "Waehrend der Corona-Pandemie 2020 stieg die taegliche Nutzerzahl von Zoom von 10 Millionen auf 300 Millionen -- in nur drei Monaten."
    ),

    // Question 24 -- Video calls: Teams
    Question(
        categoryId = 7,
        questionText = "Was ist Microsoft Teams?",
        answerA = "Ein Videospiel von Microsoft",
        answerB = "Eine Software fuer Chats, Videoanrufe und Zusammenarbeit im Buero",
        answerC = "Ein E-Mail-Programm",
        answerD = "Ein Cloud-Speicher fuer Firmendaten",
        correctAnswer = 1,
        explanation = "Microsoft Teams ist eine Kommunikationsplattform fuer Unternehmen mit Chat, Videoanrufen, Dateiablage und Integration in Microsoft Office.",
        difficulty = 1,
        funFact = "Teams wurde 2017 gestartet und ist heute auf ueber 320 Millionen aktiven Geraeten installiert -- es ist das am schnellsten wachsende Produkt in Microsofts Geschichte."
    ),

    // Question 25 -- Video calls: FaceTime
    Question(
        categoryId = 7,
        questionText = "Was ist FaceTime?",
        answerA = "Eine App zum Bearbeiten von Selfies",
        answerB = "Apples eingebaute App fuer Videoanrufe zwischen Apple-Geraeten",
        answerC = "Ein sozianes Netzwerk fuer Profilbilder",
        answerD = "Eine Gesichtserkennungs-App von Apple",
        correctAnswer = 1,
        explanation = "FaceTime ist Apples kostenlose App fuer Videoanrufe, die auf iPhones, iPads und Macs vorinstalliert ist und hochwertige Video- und Audioanrufe ermoeglicht.",
        difficulty = 1,
        funFact = "FaceTime wurde 2010 mit dem iPhone 4 eingefuehrt. Apple-Gruender Steve Jobs nannte es das 'revolutionaerste iPhone-Feature'."
    ),

    // Question 26 -- Digital maps: Google Maps
    Question(
        categoryId = 7,
        questionText = "Was ist Google Maps?",
        answerA = "Ein Erdkunde-Lexikon von Google",
        answerB = "Ein digitaler Kartendienst von Google mit Navigation und Strassenansichten",
        answerC = "Ein Programm zum Erstellen von Landkarten",
        answerD = "Ein Satellit der Karten aufnimmt",
        correctAnswer = 1,
        explanation = "Google Maps ist der bekannteste digitale Kartendienst der Welt. Er bietet Navigation, Satellitenbilder, Street View und Informationen zu Orten.",
        difficulty = 1,
        funFact = "Google Maps deckt heute ueber 220 Laender ab und hat Street View-Bilder mit einer Gesamtlaenge von ueber 16 Millionen Kilometern Strassenaufnahmen."
    ),

    // Question 27 -- Digital maps: Street View
    Question(
        categoryId = 7,
        questionText = "Was zeigt die Google-Maps-Funktion 'Street View'?",
        answerA = "Einen 3D-Grundriss einer Stadt",
        answerB = "Fotos von Strassen, die man virtuell entlanglaufen kann",
        answerC = "Live-Bilder von Strassenkameras",
        answerD = "Satellitenbilder in Echtzeit",
        correctAnswer = 1,
        explanation = "Street View zeigt Panoramafotos von Strassen, die von Google-Fahrzeugen mit speziellen 360-Grad-Kameras aufgenommen wurden. Man kann virtuell durch Strassen 'gehen'.",
        difficulty = 1,
        funFact = "Google faehrt weltweit mit speziell ausgestatteten Autos und Fahrradern -- sogar Pfade in Nationalparks wurden zu Fuss mit Kamerarucksaecken aufgenommen."
    ),

    // Question 28 -- Satellite imagery
    Question(
        categoryId = 7,
        questionText = "Womit werden die Satellitenbilder in digitalen Karten aufgenommen?",
        answerA = "Von Drohnen die ueber Staedte fliegen",
        answerB = "Von Satelliten die aus dem Weltall die Erdoberflaeche fotografieren",
        answerC = "Von Flugzeugen die Luftaufnahmen machen",
        answerD = "Von Hochhaeusern mit Panoramakameras",
        correctAnswer = 1,
        explanation = "Erdbeobachtungssatelliten kreisen in grosser Hoehe um die Erde und fotografieren die Oberflaeche mit hochaufloeenden Kameras fuer digitale Kartendienste.",
        difficulty = 1,
        funFact = "Google Earth verwendet Satellitenbilder mit einer Aufloesung von bis zu 15 Zentimetern -- man kann einzelne Autos auf Parkplaetzen erkennen."
    ),

    // Question 29 -- GPS
    Question(
        categoryId = 7,
        questionText = "Was ist GPS?",
        answerA = "Ein Internetzugang fuer Smartphones",
        answerB = "Ein Satellitensystem das genaue Standortbestimmung auf der Erde ermoeglicht",
        answerC = "Ein Kartenprogramm von Google",
        answerD = "Ein Funknetzwerk fuer Fahrzeuge",
        correctAnswer = 1,
        explanation = "GPS (Global Positioning System) ist ein US-amerikanisches Satellitennetzwerk mit 30+ Satelliten, das Smartphones und Navigationssystemen sagt, wo sie sich befinden.",
        difficulty = 1,
        funFact = "GPS wurde urspruenglich vom US-Militaer entwickelt und erst 1983 fuer die zivile Nutzung freigegeben -- ausgeloest durch den Abschuss eines koreanischen Passagierflugzeugs."
    ),

    // Question 30 -- E-learning
    Question(
        categoryId = 7,
        questionText = "Was ist E-Learning?",
        answerA = "Lernen mit elektronischer Musik",
        answerB = "Lernen und Unterricht ueber digitale Medien und das Internet",
        answerC = "Computerprogrammierung als Schulfach",
        answerD = "Lernen per E-Mail-Kurs",
        correctAnswer = 1,
        explanation = "E-Learning bedeutet, Lerninhalte ueber digitale Mittel zu vermitteln -- durch Videos, interaktive Uebungen, Online-Kurse oder virtuelle Klassenzimmer.",
        difficulty = 1,
        funFact = "Waehrend der Corona-Pandemie mussten weltweit 1,6 Milliarden Schueler auf E-Learning umsteigen -- das war der groesste Lehrexperiment der Geschichte."
    ),

    // Question 31 -- Tablets in school
    Question(
        categoryId = 7,
        questionText = "Welchen Vorteil haben Tablets im Schulunterricht?",
        answerA = "Schueler koennen damit Filme schauen statt zu lernen",
        answerB = "Digitale Lernmaterialien, interaktive Bucher und schnelle Recherche sind moeglich",
        answerC = "Tablets ersetzen vollstaendig den Lehrer",
        answerD = "Schueler brauchen keine Hausaufgaben mehr zu machen",
        correctAnswer = 1,
        explanation = "Tablets im Unterricht ermoelichen interaktive Lernbuecher, sofortige Recherche, kreatives Arbeiten und individuell angepasstes Lerntempo fuer jeden Schueler.",
        difficulty = 1,
        funFact = "Apple startete 2012 das iPad-fuer-Schueler-Programm. Heute nutzen weltweit ueber 70 Millionen Schueler iPads im Unterricht."
    ),

    // Question 32 -- Online learning platforms
    Question(
        categoryId = 7,
        questionText = "Was ist ein Beispiel fuer eine E-Learning-Plattform?",
        answerA = "Netflix",
        answerB = "Khan Academy",
        answerC = "Spotify",
        answerD = "Instagram",
        correctAnswer = 1,
        explanation = "Khan Academy ist eine kostenlose E-Learning-Plattform mit tausenden Lernvideos und Uebungen fuer Mathe, Naturwissenschaften, Geschichte und mehr.",
        difficulty = 1,
        funFact = "Khan Academy wurde 2006 gegruendet, nachdem Gruender Salman Khan seiner Cousine Mathematik per Video erklarte. Heute lernen 150 Millionen Menschen darauf."
    ),

    // Question 33 -- AI: image recognition
    Question(
        categoryId = 7,
        questionText = "Was kann eine KI mit Bilderkennung tun?",
        answerA = "Bilder ausdrucken",
        answerB = "Objekte, Gesichter oder Text in Fotos automatisch erkennen",
        answerC = "Bilder schneller herunterladen",
        answerD = "Fotos automatisch in bessere Qualitaet umwandeln",
        correctAnswer = 1,
        explanation = "Bilderkennungs-KI kann in Fotos Personen, Tiere, Objekte oder Text identifizieren -- das wird z.B. fuer die Fotosuche oder Ueberwachungssysteme genutzt.",
        difficulty = 1,
        funFact = "Googles Fotos-App kann automatisch alle Bilder mit deiner Katze, einem bestimmten Freund oder einem bestimmten Ort heraussuchen -- dank KI-Bilderkennung."
    ),

    // Question 34 -- Renewable energy: advantages
    Question(
        categoryId = 7,
        questionText = "Was ist ein Vorteil erneuerbarer Energien gegenueber Kohle und Erdoel?",
        answerA = "Sie erzeugen mehr Strom",
        answerB = "Sie verursachen keine oder kaum CO2-Emissionen beim Betrieb",
        answerC = "Sie sind immer guenstiger",
        answerD = "Sie sind groesser und auffaelliger",
        correctAnswer = 1,
        explanation = "Wind, Sonne und Wasser erzeugen Strom ohne CO2 auszustossen. Das verlangsamt den Klimawandel, da kein Treibhausgas in die Atmosphaere gelangt.",
        difficulty = 1,
        funFact = "Ein einziges Windrad ersetzt im Laufe seiner 20-jaehrigen Lebensdauer etwa 100.000 Tonnen CO2 -- so viel wie 50.000 Autofahrten rund um die Erde."
    ),

    // Question 35 -- Electric car: Tesla
    Question(
        categoryId = 7,
        questionText = "Welches Unternehmen ist besonders bekannt fuer seine Elektroautos?",
        answerA = "Samsung",
        answerB = "Tesla",
        answerC = "Sony",
        answerD = "Apple",
        correctAnswer = 1,
        explanation = "Tesla ist das bekannteste Elektroauto-Unternehmen der Welt und wurde von Elon Musk zum Symbol fuer moderne E-Mobilitaet gemacht.",
        difficulty = 1,
        funFact = "Tesla wurde 2003 gegruendet und nach dem Erfinder Nikola Tesla benannt, der als Pionier der Wechselstromtechnologie gilt."
    ),

    // Question 36 -- E-waste: harmful materials
    Question(
        categoryId = 7,
        questionText = "Warum darf Elektroschrott nicht im normalen Hausmuell landen?",
        answerA = "Weil er zu schwer fuer normale Muellwagen ist",
        answerB = "Weil er giftige Stoffe wie Blei oder Quecksilber enthaelt, die die Umwelt verschmutzen",
        answerC = "Weil er sich nicht zersetzt und ewig liegt",
        answerD = "Weil er Funken erzeugt die Braende verursachen koennen",
        correctAnswer = 1,
        explanation = "Elektroschrott enthaelt gefaehrliche Schadstoffe wie Blei, Cadmium oder Quecksilber, die bei falscher Entsorgung ins Grundwasser und den Boden gelangen.",
        difficulty = 1,
        funFact = "In vielen Entwicklungslaendern wird Elektroschrott auf offenen Feldern verbrannt, um Metalle zu gewinnen -- die giftigen Rauchgase gefaehrden die Gesundheit der Bewohner."
    ),

    // Question 37 -- VR: use cases
    Question(
        categoryId = 7,
        questionText = "In welchem Bereich wird VR ausser bei Spielen noch eingesetzt?",
        answerA = "Zum Waschen von Kleidung",
        answerB = "In der Medizin fuer Training und Therapie",
        answerC = "Als Ersatz fuer Sonnenbrillen",
        answerD = "Zum Programmieren von Webseiten",
        correctAnswer = 1,
        explanation = "Aerzte trainieren in VR Operationen, Psychologen behandeln Phobien (Hoehenangst) und Physiotherapeuten nutzen VR fuer Rehabilitationsuebungen.",
        difficulty = 1,
        funFact = "Studien zeigen, dass VR-Training von Chirurgen ihre Fehlerrate bei echten Operationen um 40% reduziert -- weil sie vorab hunderte virtuelle Uebungen machen koennen."
    ),

    // Question 38 -- Self-driving: levels
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'autonomes Fahren Stufe 2'?",
        answerA = "Das Auto faehrt vollstaendig ohne Fahrer",
        answerB = "Das Auto unterstuetzt beim Lenken und Bremsen aber der Fahrer muss aufpassen",
        answerC = "Das Auto parkt automatisch ein",
        answerD = "Das Auto hat nur einen Tempomaten",
        correctAnswer = 1,
        explanation = "Stufe 2 bedeutet 'Teilautomatisierung': Das Auto kann gleichzeitig lenken und Gas/Bremse steuern, aber der Fahrer muss jederzeit bereit sein einzugreifen.",
        difficulty = 1,
        funFact = "Tesla Autopilot und VW Travel Assist sind Stufe-2-Systeme -- der Fahrer muss die Haende nah am Lenkrad halten, damit das System weiterlaeuft."
    ),

    // Question 39 -- Solar energy: storage
    Question(
        categoryId = 7,
        questionText = "Was passiert mit ueberschuessigem Solarstrom wenn man ihn gerade nicht braucht?",
        answerA = "Er geht verloren",
        answerB = "Er kann in einem Batteriespeicher gespeichert oder ins Stromnetz eingespeist werden",
        answerC = "Er heizt automatisch den Boiler",
        answerD = "Er wird in Wasserstoff umgewandelt",
        correctAnswer = 1,
        explanation = "Ueberschuessiger Solarstrom kann in Hausspeicherbatterien fuer den Abend gespeichert werden oder ins oeffentliche Stromnetz eingespeist werden, wofuer man Verguetung erhaelt.",
        difficulty = 1,
        funFact = "Tesla Powerwall ist ein Heimspeicher, der den Strom einer Solaranlage speichert. Er hat die Groesse eines kleinen Koffers und fasst 13,5 kWh."
    ),

    // Question 40 -- E-bike: range
    Question(
        categoryId = 7,
        questionText = "Wie weit kommt man typischerweise mit einem vollgeladenen E-Bike-Akku?",
        answerA = "5-10 Kilometer",
        answerB = "30-120 Kilometer je nach Akku und Unterstuetzungsstufe",
        answerC = "Mehr als 500 Kilometer",
        answerD = "Genau 50 Kilometer immer",
        correctAnswer = 1,
        explanation = "Die Reichweite eines E-Bikes haengt von Akkugroesse, Motorunterstuetzung, Streckenprofil und Fahrergewicht ab. Typische Alltagsraeder schaffen 50-80 km.",
        difficulty = 1,
        funFact = "Bei hoher Unterstuetzungsstufe bergauf faehrt man schneller, der Akku leer sich aber auch schneller -- der Fahrer entscheidet selbst wie viel Hilfe er bekommt."
    ),

    // Question 41 -- Video call: background
    Question(
        categoryId = 7,
        questionText = "Welche Funktion nutzen viele Menschen bei Videokonferenzen mit Zoom oder Teams?",
        answerA = "Den Stummschaltknopf dauerhaft aktivieren",
        answerB = "Den virtuellen Hintergrund um ihr echtes Zimmer zu verbergen",
        answerC = "Den Bildschirm in Schwarz-Weiss umschalten",
        answerD = "Die Kamera auf 60 fps umstellen",
        correctAnswer = 1,
        explanation = "Virtuelle Hintergruende ersetzen das echte Hintergrundbild durch ein Foto oder Video, damit man im Homeoffice mehr Privatsphaere hat.",
        difficulty = 1,
        funFact = "Nach einer Studie von 2021 nutzen ueber 60% der Zoom-Nutzer regelmaessig virtuelle Hintergruende -- haeufig Buerofotos, Strande oder Weltraumbilder."
    ),

    // Question 42 -- Digital maps: offline
    Question(
        categoryId = 7,
        questionText = "Was kann man in Google Maps herunterladen um offline zu navigieren?",
        answerA = "Einzelne Routen als PDF",
        answerB = "Kartengebiete zum Nutzen ohne Internetverbindung",
        answerC = "Street-View-Videos",
        answerD = "Echtzeit-Verkehrsdaten",
        correctAnswer = 1,
        explanation = "Google Maps erlaubt das Herunterladen von Kartenregionen auf das Smartphone. So kann man auch ohne Internetverbindung navigieren, z.B. im Ausland.",
        difficulty = 1,
        funFact = "Eine heruntergeladene Offline-Karte von ganz Deutschland belegt auf dem Smartphone etwa 750 MB Speicher."
    ),

    // Question 43 -- AI in smartphones
    Question(
        categoryId = 7,
        questionText = "Wo begegnet einem KI auf einem modernen Smartphone?",
        answerA = "Nur in Spielen",
        answerB = "In der Kamera, bei Sprachassistenten und in Empfehlungen",
        answerC = "Nur beim Telefonieren",
        answerD = "Nur beim Laden des Akkus",
        correctAnswer = 1,
        explanation = "KI steckt im Smartphone in der Kamera (Szene-Erkennung, Portrait-Modus), im Sprachassistenten (Siri/Google), in Kurzform-Empfehlungen und bei der Texteingabe.",
        difficulty = 1,
        funFact = "Moderne Smartphone-Chips haben einen eigenen KI-Prozessor (Neural Processing Unit) der speziell fuer KI-Aufgaben optimiert ist und kaum Akku verbraucht."
    ),

    // Question 44 -- Wearable: health monitoring
    Question(
        categoryId = 7,
        questionText = "Was misst eine Apple Watch ausser der Zeit?",
        answerA = "Die Qualitaet des WLAN-Signals",
        answerB = "Herzfrequenz, Schritte, Blutsauerstoff und erkennt Stuerze",
        answerC = "Den Blutdruck exakt",
        answerD = "Den Blutzuckerspiegel",
        correctAnswer = 1,
        explanation = "Die Apple Watch misst Herzfrequenz, Blutsauerstoff (SpO2), Schritte, Kalorien und kann Stuerze erkennen sowie bei unregelmassigem Herzschlag warnen.",
        difficulty = 1,
        funFact = "Die Sturzerkennungs-Funktion der Apple Watch hat nachweislich Menschenleben gerettet -- sie rief automatisch den Notruf fuer gestuerzte Senioren."
    ),

    // Question 45 -- E-learning: advantages
    Question(
        categoryId = 7,
        questionText = "Was ist ein Vorteil von E-Learning gegenueber einem klassischen Prsenzunterricht?",
        answerA = "Man lernt schneller wenn man im selben Raum ist",
        answerB = "Man kann das eigene Lerntempo selbst bestimmen und von ueberall lernen",
        answerC = "Es gibt keine Tests und Hausaufgaben",
        answerD = "E-Learning ist immer kostenlos",
        correctAnswer = 1,
        explanation = "E-Learning ermoeglicht ortsunabhaengiges Lernen zu beliebigen Zeiten und im eigenen Tempo -- Inhalte koennen jederzeit wiederholt werden.",
        difficulty = 1,
        funFact = "Coursera, eine E-Learning-Plattform, bietet Kurse von mehr als 300 Universitaeten weltweit an -- darunter Yale, Google und IBM."
    ),

    // Question 46 -- Self-driving: safety
    Question(
        categoryId = 7,
        questionText = "Wozu sollen selbstfahrende Autos langfristig beitragen?",
        answerA = "Zu mehr Verkehr und schnelleren Autos",
        answerB = "Zur Reduzierung von Unfaellen, weil KI keine mueden oder abgelenkten Fahrfehler macht",
        answerC = "Zum Abbau von Strassenschildern",
        answerD = "Zu guenstigeren Autos",
        correctAnswer = 1,
        explanation = "Ueber 90% aller Verkehrsunfaelle sind auf menschliches Versagen zurueckzufuehren. Autonome Fahrzeuge ohne Muedigkeit oder Ablenkung koennen das drastisch reduzieren.",
        difficulty = 1,
        funFact = "In den USA sterben jaehrlich ueber 40.000 Menschen im Strassenverkehr. Studien schaetzen, dass vollautonome Autos 94% dieser Unfaelle verhindern koennten."
    ),

    // Question 47 -- Wind energy: offshore
    Question(
        categoryId = 7,
        questionText = "Was sind Offshore-Windparks?",
        answerA = "Windraeder auf hohen Berggipfeln",
        answerB = "Windkraftanlagen die im Meer gebaut werden",
        answerC = "Windraeder auf dem Dach von Buerogebaeuden",
        answerD = "Mobile Windanlagen die auf LKW transportiert werden",
        correctAnswer = 1,
        explanation = "Offshore-Windparks stehen im Meer, wo der Wind staerker und gleichmaessiger weht als an Land. Sie liefern mehr Strom, sind aber teurer zu bauen und zu warten.",
        difficulty = 1,
        funFact = "Der weltweit groesste Offshore-Windpark 'Hornsea 3' in der Nordsee hat eine Leistung von 2.852 MW -- genug Strom fuer ueber 3 Millionen britische Haushalte."
    ),

    // Question 48 -- Video calls: screen sharing
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Bildschirm teilen' bei einem Videoanruf?",
        answerA = "Zwei Personen nutzen denselben Bildschirm gleichzeitig",
        answerB = "Man zeigt den Inhalt des eigenen Bildschirms fuer andere Teilnehmer",
        answerC = "Der Bildschirm wird in zwei Haelften geteilt",
        answerD = "Man schaltet die Kamera aus und zeigt nur den Ton",
        correctAnswer = 1,
        explanation = "Beim Bildschirm teilen (Screen Sharing) sehen alle Teilnehmer des Anrufs in Echtzeit was auf dem eigenen Bildschirm zu sehen ist -- ideal fuer Praesentationen.",
        difficulty = 1,
        funFact = "Screen Sharing ist laut Microsoft die am haeufigsten genutzte Teams-Funktion -- noch vor dem Videoanruf selbst."
    ),

    // Question 49 -- E-mobility: charging network
    Question(
        categoryId = 7,
        questionText = "Was ist ein Problem das viele Menschen vom Kauf eines Elektroautos abhaelt?",
        answerA = "Elektroautos sind zu leise",
        answerB = "Zu wenige Ladestationen und lange Ladezeiten im Vergleich zum Tanken",
        answerC = "Elektroautos koennen nicht im Regen fahren",
        answerD = "Elektroautos sind zu schnell fuer Stadtstrassen",
        correctAnswer = 1,
        explanation = "Reichweitenangst und das noch duennere Ladenetz im Vergleich zu Tankstellen sind die haeufigsten Bedenken von potentiellen Elektroauto-Kauefer.",
        difficulty = 1,
        funFact = "In Deutschland gibt es bereits ueber 100.000 oeffentliche Ladepunkte fuer Elektroautos -- die Zahl verdoppelt sich etwa alle zwei Jahre."
    ),

    // Question 50 -- AI: translation
    Question(
        categoryId = 7,
        questionText = "Was macht ein KI-Uebersetzungsdienst wie DeepL oder Google Translate?",
        answerA = "Er lernt neue Sprachen von Grund auf per Sprachkurs",
        answerB = "Er uebersetzt Texte automatisch in andere Sprachen mithilfe von KI",
        answerC = "Er buchstabiert Woerter in anderen Sprachen",
        answerD = "Er erkennt die Muttersprache eines Sprechers anhand seines Akzents",
        correctAnswer = 1,
        explanation = "KI-Uebersetzungsdienste analysieren Milliarden von Texten in vielen Sprachen und lernen so, Saetze sinngemass und natuerlich zu uebersetzen.",
        difficulty = 1,
        funFact = "DeepL wurde in Koeln entwickelt und gilt trotz seiner kleineren Groesse als qualitativ besser als Google Translate -- besonders bei europaeischen Sprachen."
    )
)
