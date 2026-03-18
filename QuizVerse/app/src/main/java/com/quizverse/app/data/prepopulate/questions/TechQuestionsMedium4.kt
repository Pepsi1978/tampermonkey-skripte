package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsMedium4(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 7,
        questionText = "Welches Verfahren nutzt GPT-Modelle, um aus einer Eingabe eine sinnvolle Antwort zu erzeugen?",
        answerA = "Regelbasierte Expertensysteme",
        answerB = "Autoregressive Token-Vorhersage",
        answerC = "Genetische Algorithmen",
        answerD = "Symbolische Logik",
        correctAnswer = 1,
        explanation = "GPT-Modelle sind autoregressive Transformer: Sie sagen bei jedem Schritt das wahrscheinlichste naechste Token voraus und bauen so Satz fuer Satz eine Antwort auf.",
        difficulty = 2,
        funFact = "GPT-4 wurde auf geschaetzten 13 Billionen Token trainiert – mehr Text als ein Mensch in tausend Leben lesen koennte."
    ),

    // Question 2
    Question(
        categoryId = 7,
        questionText = "Was beschreibt der Begriff 'Halluzination' bei einem KI-Sprachmodell?",
        answerA = "Das Modell antwortet zu langsam",
        answerB = "Das Modell gibt mit Ueberzeugung falsche Fakten aus",
        answerC = "Das Modell verweigert die Antwort auf sensible Fragen",
        answerD = "Das Modell wechselt unerwuenscht die Sprache",
        correctAnswer = 1,
        explanation = "Als Halluzination bezeichnet man, wenn ein Sprachmodell sachlich falsche Informationen generiert, diese aber so formuliert, als waeren sie korrekt – ohne jede Unsicherheitsanzeige.",
        difficulty = 2,
        funFact = "Der Begriff stammt aus der Neurologie: Schon vor dem KI-Boom bezeichnete man Wahrnehmungen ohne realen Reiz so."
    ),

    // Question 3
    Question(
        categoryId = 7,
        questionText = "Welcher Sensor ist bei autonomen Fahrzeugen hauptverantwortlich fuer die praezise 3D-Umgebungserfassung?",
        answerA = "Infrarotkamera",
        answerB = "Ultraschallsensor",
        answerC = "LIDAR",
        answerD = "Barometer",
        correctAnswer = 2,
        explanation = "LIDAR (Light Detection and Ranging) sendet Laserpulse aus und misst die Reflexionszeit. Daraus entsteht eine hochpraezise 3D-Punktwolke der Umgebung in Echtzeit.",
        difficulty = 2,
        funFact = "Ein moderner LIDAR-Sensor kann bis zu 1,3 Millionen Messpunkte pro Sekunde erzeugen und Objekte auf ueber 200 Meter Entfernung erkennen."
    ),

    // Question 4
    Question(
        categoryId = 7,
        questionText = "Was kennzeichnet Autonomiestufe 3 beim autonomen Fahren?",
        answerA = "Das Fahrzeug ist vollstaendig selbstfahrend in allen Bedingungen",
        answerB = "Der Fahrer muss staendig die Haende am Steuer halten",
        answerC = "Das System uebernimmt alle Fahraufgaben, der Fahrer muss aber bei Anfrage eingreifen koennen",
        answerD = "Nur die Laengsregulierung ist automatisiert",
        correctAnswer = 2,
        explanation = "Bei SAE-Level 3 faehrt das System autonom in definierten Bedingungen. Der Fahrer muss aber auf eine Uebernahme-Anforderung reagieren koennen – typischerweise innerhalb einiger Sekunden.",
        difficulty = 2,
        funFact = "Mercedes-Benz erhielt 2021 weltweit als erster Hersteller die offizielle Zulassung fuer Level-3-Fahren auf deutschen Autobahnen bis 60 km/h."
    ),

    // Question 5
    Question(
        categoryId = 7,
        questionText = "Welches Trainingsverfahren wird beim Deep Learning haeufig eingesetzt, um die Gewichte eines neuronalen Netzes anzupassen?",
        answerA = "Forward Propagation",
        answerB = "Gradient Boosting",
        answerC = "Backpropagation",
        answerD = "Support Vector Optimization",
        correctAnswer = 2,
        explanation = "Backpropagation berechnet den Fehlergradienten rueckwaerts durch das Netz und passt die Gewichte so an, dass der Verlust schrittweise minimiert wird.",
        difficulty = 2,
        funFact = "Der Backpropagation-Algorithmus wurde bereits 1986 von Rumelhart, Hinton und Williams populaer gemacht – doch erst moderne Hardware liess ihn praktisch nutzbar werden."
    ),

    // Question 6
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Industrie 4.0'?",
        answerA = "Die Einfuehrung der Fliessbandproduktion",
        answerB = "Die Elektrifizierung von Fabriken",
        answerC = "Die vierte industrielle Revolution durch Vernetzung, Automatisierung und Datenaustausch in der Fertigung",
        answerD = "Die Massenfertigung durch Dampfmaschinen",
        correctAnswer = 2,
        explanation = "Industrie 4.0 beschreibt die Verschmelzung von physischer Produktion mit digitalen Technologien: Maschinen kommunizieren miteinander, Prozesse laufen autonom und Daten werden in Echtzeit ausgewertet.",
        difficulty = 2,
        funFact = "Der Begriff 'Industrie 4.0' wurde 2011 auf der Hannover Messe von der deutschen Bundesregierung als strategisches Zukunftsprojekt vorgestellt."
    ),

    // Question 7
    Question(
        categoryId = 7,
        questionText = "Welches Prinzip nutzt ein Quantencomputer, um Berechnungen gegenueber klassischen Rechnern zu beschleunigen?",
        answerA = "Mehr CPU-Kerne und hoehere Taktfrequenz",
        answerB = "Supraleitende Glasfaserkabel",
        answerC = "Ueberlagerung (Superposition) und Verschraenkung von Qubits",
        answerD = "Parallele RAM-Bussysteme",
        correctAnswer = 2,
        explanation = "Qubits koennen dank Superposition gleichzeitig 0 und 1 sein. Quantenverschraenkung koppelt Qubits so, dass Berechnungen massiv parallel ausgefuehrt werden – fuer bestimmte Probleme exponentiell schneller.",
        difficulty = 2,
        funFact = "IBM hat seinen Quantencomputer 'Eagle' mit 127 Qubits 2021 vorgestellt. Zum Vergleich: Ein klassisches Bit kann diese Zustandsmenge nicht einmal annaehern."
    ),

    // Question 8
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Digital Twin' in der Smart Factory?",
        answerA = "Ein Backup-Server fuer Produktionsdaten",
        answerB = "Ein virtuelles Echtzeit-Abbild einer physischen Maschine oder eines Prozesses",
        answerC = "Ein zweiter Roboterarm als Ausfallsicherung",
        answerD = "Ein gespiegeltes WLAN-Netzwerk in der Halle",
        correctAnswer = 1,
        explanation = "Ein Digital Twin ist ein digitales Modell, das den Zustand einer realen Maschine oder Anlage in Echtzeit abbildet. Damit koennen Ausfaelle simuliert, Wartungen geplant und Prozesse optimiert werden.",
        difficulty = 2,
        funFact = "NASA nutzt Digital Twins bereits seit den 1960er-Jahren – damals noch analog als physische Modelle der Apollo-Raumschiffe fuer Simulationen am Boden."
    ),

    // Question 9
    Question(
        categoryId = 7,
        questionText = "Welches Bildgenerierungsmodell basiert auf dem Prinzip der Diffusion?",
        answerA = "GPT-4 Vision",
        answerB = "Stable Diffusion",
        answerC = "BERT",
        answerD = "AlphaFold",
        correctAnswer = 1,
        explanation = "Stable Diffusion (und aehnliche Modelle wie DALL-E 2) lernen, gezielt verrauschte Bilder zu 'entrauschen'. Im Training wird Rauschen hinzugefuegt, beim Generieren wird es schrittweise entfernt.",
        difficulty = 2,
        funFact = "Stable Diffusion 1.5 wurde auf rund 2,3 Milliarden Bild-Text-Paaren trainiert – die meisten davon stammen aus dem LAION-5B-Datensatz."
    ),

    // Question 10
    Question(
        categoryId = 7,
        questionText = "Was ist Phishing im Bereich Cybersecurity?",
        answerA = "Das Knacken von WLAN-Passwoertern durch Brute-Force",
        answerB = "Das Abfangen von Datenpaketen im Netzwerk",
        answerC = "Das Taeuuschen von Nutzern durch gefaelschte Nachrichten, um Zugangsdaten zu stehlen",
        answerD = "Das Einschleusen von Malware ueber USB-Sticks",
        correctAnswer = 2,
        explanation = "Phishing bezeichnet den Versuch, durch gefaelschte E-Mails, Webseiten oder Nachrichten Vertrauen zu erschleichen und Opfer zur Preisgabe sensibler Daten wie Passwoerter oder Kreditkartennummern zu verleiten.",
        difficulty = 2,
        funFact = "Der Begriff 'Phishing' entstand in den 1990er-Jahren als Wortspiel mit 'Fishing' – Kriminelle 'angeln' nach ahnungslosen Opfern."
    ),

    // Question 11
    Question(
        categoryId = 7,
        questionText = "Was leistet Tesla Autopilot auf Autonomiestufe 2?",
        answerA = "Vollautonomes Fahren ohne Fahreraufsicht",
        answerB = "Nur automatisches Bremsen im Notfall",
        answerC = "Kombinierte Laengs- und Querfuehrung bei aktiver Fahreraufsicht",
        answerD = "Selbststaendiges Einparken ohne Fahrer im Fahrzeug",
        correctAnswer = 2,
        explanation = "Tesla Autopilot ist SAE-Level 2: Er uebernimmt gleichzeitig Gas/Bremse und Lenkung, setzt aber voraus, dass der Fahrer staendig aufmerksam bleibt und jederzeit eingreifen kann.",
        difficulty = 2,
        funFact = "Teslas 'Full Self-Driving' (FSD) ist trotz des Namens offiziell kein Level-4-System – die US-Behoerde NHTSA stuft es weiterhin als Level-2-Assistenz ein."
    ),

    // Question 12
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Ransomware'?",
        answerA = "Software, die Werbung einblendet",
        answerB = "Schadsoftware, die Dateien verschluesselt und Loesegeld fordert",
        answerC = "Ein Tool zum Aufzeichnen von Tastatureingaben",
        answerD = "Ein Virus, der Systemdateien loescht",
        correctAnswer = 1,
        explanation = "Ransomware verschluesselt Dateien auf dem befallenen System und zeigt dann eine Loesegeld-Forderung an. Erst nach Zahlung (meist in Kryptowaahrung) soll der Entschluesseler geliefert werden.",
        difficulty = 2,
        funFact = "Der bislang schadenreichste Ransomware-Angriff war WannaCry (2017): Er traf ueber 200.000 Computer in 150 Laendern und verursachte Schaeden von geschaetzten 4 Milliarden US-Dollar."
    ),

    // Question 13
    Question(
        categoryId = 7,
        questionText = "Welche KI-Technik steckt hinter modernen Sprachassistenten wie Alexa oder Siri?",
        answerA = "Regelbasierte Chatbots mit vordefinierten Antwortbaeumen",
        answerB = "Natural Language Processing kombiniert mit neuronalen Netzen",
        answerC = "Symbolische KI mit Wahrheitstabellen",
        answerD = "Expertensysteme mit manuell gepflegten Wissensdatenbanken",
        correctAnswer = 1,
        explanation = "Moderne Sprachassistenten nutzen Natural Language Processing (NLP) und tiefe neuronale Netze, um Sprache zu verstehen, Absichten zu erkennen und kontextbezogene Antworten zu generieren.",
        difficulty = 2,
        funFact = "Siri wurde 2010 als eigenstaendige App veroeffentlicht, bevor Apple sie 2011 kaufte und direkt ins iPhone integrierte – sie war damit der erste massentaugliche KI-Assistent auf Smartphones."
    ),

    // Question 14
    Question(
        categoryId = 7,
        questionText = "Was ist Social Engineering in der IT-Sicherheit?",
        answerA = "Das automatisierte Testen von Software auf Schwachstellen",
        answerB = "Die Manipulation von Menschen, um unbefugten Zugang zu Systemen oder Informationen zu erlangen",
        answerC = "Das Einrichten sozialer Netzwerke in Unternehmensumgebungen",
        answerD = "Die Verschluesselung von Kommunikation in sozialen Medien",
        correctAnswer = 1,
        explanation = "Social Engineering bezeichnet psychologische Manipulationstechniken, bei denen Angreifer das Vertrauen von Menschen ausnutzen, statt technische Schwachstellen anzugreifen – z.B. durch Vortaeuschen falscher Identitaeten.",
        difficulty = 2,
        funFact = "Kevin Mitnick, einst meistgesuchter Hacker der USA, sagte, sein wichtigstes Werkzeug sei nie Technik gewesen – sondern Social Engineering."
    ),

    // Question 15
    Question(
        categoryId = 7,
        questionText = "Was ist Augmented Reality (AR) im Unterschied zu Virtual Reality (VR)?",
        answerA = "AR ersetzt die Realitaet komplett, VR blendet nur Informationen ein",
        answerB = "AR blendet digitale Inhalte in die reale Welt ein, VR schafft eine vollstaendig virtuelle Umgebung",
        answerC = "AR benoetigt immer eine Datenbrille, VR funktioniert ohne Hardware",
        answerD = "AR ist ausschliesslich fuer Spiele, VR wird nur in der Industrie eingesetzt",
        correctAnswer = 1,
        explanation = "Bei AR werden digitale Elemente (Bilder, Texte, 3D-Objekte) ueber die reale Welt gelegt. Bei VR taucht der Nutzer in eine vollstaendig computergenerierte Welt ein und sieht nichts von der realen Umgebung.",
        difficulty = 2,
        funFact = "Das Spiel Pokemon Go machte 2016 AR einem Milliardenpublikum zugaenglich und wurde in den ersten zwei Monaten mehr als 500 Millionen Mal heruntergeladen."
    ),

    // Question 16
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem Qubit und einem klassischen Bit?",
        answerA = "Ein Qubit speichert 2 Byte statt 1 Byte",
        answerB = "Ein Qubit kann dank Superposition gleichzeitig 0 und 1 repraesentieren",
        answerC = "Ein Qubit arbeitet mit Spannung statt mit Strom",
        answerD = "Ein Qubit hat drei moegliche Zustaende: 0, 1 und leer",
        correctAnswer = 1,
        explanation = "Ein klassisches Bit ist immer entweder 0 oder 1. Ein Qubit kann durch Quantensuperposition einen Zustand einnehmen, der beides gleichzeitig ist – bis zur Messung, die den Zustand kollabieren laesst.",
        difficulty = 2,
        funFact = "Google behauptete 2019, sein Quantencomputer 'Sycamore' habe eine Berechnung in 200 Sekunden ausgefuehrt, fuer die ein klassischer Supercomputer 10.000 Jahre braeuchte."
    ),

    // Question 17
    Question(
        categoryId = 7,
        questionText = "Welche Technologie verbindet Alltagsgeraete wie Kuehlschraenke oder Heizungen mit dem Internet?",
        answerA = "Bluetooth Low Energy allein",
        answerB = "Internet of Things (IoT)",
        answerC = "Near Field Communication (NFC)",
        answerD = "Universal Plug and Play (UPnP)",
        correctAnswer = 1,
        explanation = "Das Internet of Things (IoT) bezeichnet das Netzwerk physischer Geraete, die mit Sensoren, Software und Konnektivitaet ausgestattet sind, um Daten zu sammeln und auszutauschen.",
        difficulty = 2,
        funFact = "Bis 2030 werden laut Schaaetzungen rund 29 Milliarden IoT-Geraete weltweit vernetzt sein – das sind fast vier Geraete pro Mensch auf der Erde."
    ),

    // Question 18
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Transfer Learning' im KI-Bereich?",
        answerA = "Das Uebertragen von KI-Modellen zwischen verschiedenen Endgeraeten",
        answerB = "Das Nutzen eines vortrainierten Modells als Ausgangspunkt fuer eine neue Aufgabe",
        answerC = "Die Uebertragung von Trainingsdaten ueber das Netzwerk",
        answerD = "Das Kopieren eines Modells auf einen anderen Server",
        correctAnswer = 1,
        explanation = "Beim Transfer Learning wird ein bereits trainiertes Modell (z.B. auf Millionen Bildern) fuer eine verwandte Aufgabe weiter verfeinert. Das spart enorme Rechenzeit und benoetigt deutlich weniger Trainingsdaten.",
        difficulty = 2,
        funFact = "GPT-Modelle sind selbst ein Produkt von Transfer Learning: Sie werden erst allgemein vortrainiert und dann durch Fine-Tuning auf spezifische Aufgaben angepasst."
    ),

    // Question 19
    Question(
        categoryId = 7,
        questionText = "Welcher Autonomiegrad beim Fahren erlaubt keinerlei Fahrereingriffe mehr – das Fahrzeug steuert sich in allen Situationen selbst?",
        answerA = "Level 3",
        answerB = "Level 4",
        answerC = "Level 5",
        answerD = "Level 6",
        correctAnswer = 2,
        explanation = "SAE Level 5 ist die hoechste Stufe: Das Fahrzeug faehrt unter allen Bedingungen und auf allen Strecken vollstaendig autonom. Ein Lenkrad oder Pedale sind nicht mehr noetig.",
        difficulty = 2,
        funFact = "Kein kommerzielles Fahrzeug hat bislang offiziell Level 5 erreicht – selbst die fortschrittlichsten Robotaxis wie Waymo One sind nur Level 4 in definierten Geofence-Bereichen."
    ),

    // Question 20
    Question(
        categoryId = 7,
        questionText = "Was ist CRISPR-Cas9 in der Biotechnologie?",
        answerA = "Ein Proteinanalysegeraet fuer Laborproben",
        answerB = "Ein molekulares 'Scherenwerkzeug' zur praezisen Bearbeitung von DNA",
        answerC = "Eine Methode zur Zellfaerbung in der Mikroskopie",
        answerD = "Ein Algorithmus zur Proteinstrukturvorhersage",
        correctAnswer = 1,
        explanation = "CRISPR-Cas9 ist ein Genbearbeitungssystem, das wie eine molekulare Schere funktioniert: Es kann gezielt an einer bestimmten DNA-Stelle schneiden, Gene entfernen, ersetzen oder korrigieren.",
        difficulty = 2,
        funFact = "Emmanuelle Charpentier und Jennifer Doudna erhielten 2020 den Chemie-Nobelpreis fuer die Entdeckung der CRISPR-Cas9-Methode – eine der schnellsten Nobelpreis-Vergaben nach einer Entdeckung."
    ),

    // Question 21
    Question(
        categoryId = 7,
        questionText = "Was unterscheidet ein Convolutional Neural Network (CNN) von einem normalen Feedforward-Netz?",
        answerA = "CNNs verarbeiten nur Text, normale Netze nur Zahlen",
        answerB = "CNNs nutzen Faltungsoperationen zum lokalen Mustererkennen, besonders in Bildern",
        answerC = "CNNs haben keine versteckten Schichten",
        answerD = "CNNs koennen nur auf spezieller Grafikhardware laufen",
        correctAnswer = 1,
        explanation = "Convolutional Neural Networks gleiten mit Filtern (Kernels) ueber ein Bild und erkennen lokale Muster wie Kanten oder Formen. Diese hierarchische Merkmalserkennung macht sie besonders effektiv fuer Bildverarbeitung.",
        difficulty = 2,
        funFact = "Yann LeCun entwickelte das erste praxistaugliche CNN bereits 1989 fuer die Handschrifterkennung bei der US-Postbrand – Jahrzehnte bevor Deep Learning populaer wurde."
    ),

    // Question 22
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Zero-Day-Exploit' in der Cybersecurity?",
        answerA = "Ein Angriff, der genau um Mitternacht startet",
        answerB = "Eine Schwachstelle, die dem Softwarehersteller noch unbekannt ist und aktiv ausgenutzt wird",
        answerC = "Ein Virus, der sich nur einmal ausfuehrt und dann selbst loescht",
        answerD = "Ein Angriff auf frisch installierte Systeme ohne Patches",
        correctAnswer = 1,
        explanation = "Ein Zero-Day-Exploit nutzt eine Sicherheitsluecke aus, fuer die der Hersteller noch keinen Patch erstellt hat – der Hersteller hatte 'null Tage', um zu reagieren, bevor die Luecke ausgenutzt wurde.",
        difficulty = 2,
        funFact = "Stuxnet (2010), der erste bekannte Cyberkriegs-Waffenangriff, nutzte gleich vier verschiedene Zero-Day-Exploits gleichzeitig – eine bis dahin voellig unbekannte Raffinesse."
    ),

    // Question 23
    Question(
        categoryId = 7,
        questionText = "Welche AR-Anwendung projiziert Navigationspfeile direkt auf die Windschutzscheibe eines Autos?",
        answerA = "Head-Up-Display (HUD) mit AR",
        answerB = "Rearview-Monitor",
        answerC = "LiDAR-Overlay",
        answerD = "GPS-Tracker",
        correctAnswer = 0,
        explanation = "AR-basierte Head-Up-Displays projizieren Navigationspfeile, Tempolimits oder Gefahrenhinweise direkt ins Sichtfeld des Fahrers auf die Windschutzscheibe, ohne den Blick von der Strasse zu nehmen.",
        difficulty = 2,
        funFact = "Hyundai und Mercedes-Benz bieten bereits AR-HUDs an, die Pfeile scheinbar auf dem Strassenbelag vor dem Fahrzeug erscheinen lassen – bis zu 10 Meter 'voraus'."
    ),

    // Question 24
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Large Language Model' (LLM)?",
        answerA = "Eine grosse Datenbank aus Wikipedia-Artikeln",
        answerB = "Ein KI-Modell mit Milliarden von Parametern, trainiert auf riesigen Textmengen zum Sprachverstehen und -erzeugen",
        answerC = "Ein verteiltes Dateisystem fuer grosse Textdateien",
        answerD = "Ein Uebersetzungsprogramm fuer seltene Sprachen",
        correctAnswer = 1,
        explanation = "LLMs wie GPT-4 oder Claude sind neuronale Netze mit Milliarden bis Billionen Parametern, die auf riesigen Textkorpora trainiert wurden, um Sprache zu verstehen, zu generieren und Aufgaben zu loesen.",
        difficulty = 2,
        funFact = "GPT-3 hatte bereits 175 Milliarden Parameter – das entspricht ungefaehr 175 Milliarden Zahlenwerten, die waehrend des Trainings angepasst wurden."
    ),

    // Question 25
    Question(
        categoryId = 7,
        questionText = "Was ist das Ziel von 'Predictive Maintenance' in der Industrie 4.0?",
        answerA = "Maschinen nach einem festen Zeitplan zu warten",
        answerB = "Ausfaelle anhand von Sensordaten vorherzusagen und Wartungen zum optimalen Zeitpunkt durchzufuehren",
        answerC = "Wartungsarbeiten vollstaendig durch Roboter zu ersetzen",
        answerD = "Ersatzteile automatisch per Drohne zu liefern",
        correctAnswer = 1,
        explanation = "Predictive Maintenance analysiert kontinuierlich Sensordaten (Vibration, Temperatur, Druck) mit KI-Algorithmen, um Ausfaelle zu prognostizieren – bevor sie eintreten, aber ohne unnoetige Fruehwartung.",
        difficulty = 2,
        funFact = "Prognosen zufolge kann Predictive Maintenance Wartungskosten um bis zu 25 % senken und ungeplante Ausfallzeiten um bis zu 50 % reduzieren."
    ),

    // Question 26
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Quantum Supremacy'?",
        answerA = "Den sichersten Quantenverschluesselungsstandard",
        answerB = "Den Moment, ab dem ein Quantencomputer eine Aufgabe loest, die kein klassischer Computer in annehmbarer Zeit bewaeltigen koennte",
        answerC = "Die uebertragungsrate eines Quantennetzwerks",
        answerD = "Die Anzahl der Qubits in einem stabilen System",
        correctAnswer = 1,
        explanation = "Quantum Supremacy (auch Quantum Advantage) beschreibt den Meilenstein, an dem ein Quantencomputer beweist, dass er eine konkrete Berechnung schneller ausfuehren kann als jeder existierende klassische Supercomputer.",
        difficulty = 2,
        funFact = "Google beanspruchte 2019 Quantum Supremacy mit seinem Sycamore-Prozessor. IBM bestritt diese Behauptung – die Debatte unter Forschern dauert bis heute an."
    ),

    // Question 27
    Question(
        categoryId = 7,
        questionText = "Was ist Bioinformatik?",
        answerA = "Die Entwicklung von Software ausschliesslich fuer Krankenhaeuser",
        answerB = "Die Verbindung von Informatik und Biologie zur computergestuetzten Analyse biologischer Daten",
        answerC = "Das Programmieren mit biologisch abbaubaren Materialien",
        answerD = "Die Steuerung medizinischer Roboter per App",
        correctAnswer = 1,
        explanation = "Bioinformatik kombiniert Methoden der Informatik, Mathematik und Statistik, um biologische Daten – insbesondere Genomsequenzen – zu analysieren, zu speichern und zu interpretieren.",
        difficulty = 2,
        funFact = "Das menschliche Genom besteht aus rund 3,2 Milliarden Basenpaaren. Als Textdatei gespeichert wuerde es etwa 3 Gigabyte belegen – ungefaehr so gross wie eine DVD."
    ),

    // Question 28
    Question(
        categoryId = 7,
        questionText = "Welche Technik nutzt autonomes Fahren, um Spurmarkierungen und Schilder zu erkennen?",
        answerA = "Magnetfeldsensoren im Asphalt",
        answerB = "Computer Vision mit trainierten neuronalen Netzen",
        answerC = "GPS-Satellitendaten mit Zentimetergenauigkeit",
        answerD = "Infrarot-Bodenerkennung",
        correctAnswer = 1,
        explanation = "Computer Vision-Systeme, trainiert auf Millionen von Strassenbildern, erkennen Fahrbahnmarkierungen, Ampeln, Schilder und andere Verkehrsteilnehmer in Echtzeit aus Kameradaten.",
        difficulty = 2,
        funFact = "Tesla sammelt taegliche mehrere Millionen Videokilometer von seinen weltweit fahrenden Fahrzeugen und nutzt diese Daten laufend zum Nachtrainieren seiner Sehsysteme."
    ),

    // Question 29
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Smart Contract' im Blockchain-Kontext?",
        answerA = "Ein digitaler Arbeitsvertrag mit elektronischer Unterschrift",
        answerB = "Selbstausfuehrender Code auf einer Blockchain, der Vertragsbedingungen automatisch umsetzt",
        answerC = "Eine KI, die Vertraege auf Schwachstellen prueft",
        answerD = "Eine verschluesselte E-Mail-Vereinbarung zwischen zwei Parteien",
        correctAnswer = 1,
        explanation = "Smart Contracts sind Programme, die auf einer Blockchain gespeichert sind und automatisch ausgefuehrt werden, sobald vordefinierte Bedingungen erfuellt sind – ohne Mittelsmanner oder manuelle Eingriffe.",
        difficulty = 2,
        funFact = "Ethereum wurde 2015 speziell fuer Smart Contracts entwickelt. Heute laufen darauf DeFi-Protokolle mit einem verwalteten Volumen von zeitweise ueber 100 Milliarden US-Dollar."
    ),

    // Question 30
    Question(
        categoryId = 7,
        questionText = "Was beschreibt der Begriff 'Edge Computing' im IoT-Umfeld?",
        answerA = "Die Datenspeicherung ausschliesslich in zentralen Rechenzentren",
        answerB = "Die Verarbeitung von Daten direkt an dem Geraet, wo sie entstehen, statt in der Cloud",
        answerC = "Die Nutzung von Kanten-GPUs fuer Bildrendering",
        answerD = "Ein Sicherheitskonzept fuer Netzwerkperimiter",
        correctAnswer = 1,
        explanation = "Edge Computing verarbeitet Daten lokal auf dem Geraet oder in unmittelbarer Naehe, anstatt alles in die Cloud zu senden. Das reduziert Latenz, Bandbreitenbedarf und Abhaengigkeit von Internetverbindungen.",
        difficulty = 2,
        funFact = "Autonome Fahrzeuge erzeugen bis zu 4 Terabyte Daten pro Stunde – eine Echtzeit-Cloud-Uebertragung waere physikalisch unmoeglich, Edge Computing ist hier zwingend."
    ),

    // Question 31
    Question(
        categoryId = 7,
        questionText = "Was ist 'Prompt Engineering' bei KI-Sprachmodellen?",
        answerA = "Das Trainieren eines Modells mit neuen Daten",
        answerB = "Die gezielte Formulierung von Eingaben, um qualitativ bessere Antworten vom Modell zu erhalten",
        answerC = "Das Optimieren der Serverhardware fuer LLM-Inferenz",
        answerD = "Eine Programmierspache fuer KI-Modelle",
        correctAnswer = 1,
        explanation = "Prompt Engineering ist die Kunst, Eingabeaufforderungen so zu gestalten, dass ein KI-Modell die gewuenschten, praezisen Antworten liefert – durch klare Anweisungen, Beispiele oder strukturierte Formulierungen.",
        difficulty = 2,
        funFact = "Manche Unternehmen zahlen Prompt Engineers Jahresgehaelter von ueber 300.000 US-Dollar – ein Berufsfeld, das 2020 noch nicht existierte."
    ),

    // Question 32
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Machine Learning'?",
        answerA = "Das manuelle Programmieren aller moeglichen Regeln fuer ein Problem",
        answerB = "Ein Teilgebiet der KI, bei dem Algorithmen aus Daten lernen, ohne explizit programmiert zu werden",
        answerC = "Das Auswendiglernen von Loesungen durch einen Computer",
        answerD = "Eine Programmiersprache fuer Industrieroboter",
        correctAnswer = 1,
        explanation = "Machine Learning ermoeglicht es Computern, aus Erfahrung (Daten) zu lernen und Muster zu erkennen, ohne dass jede Regel manuell kodiert werden muss. Das Modell verbessert sich mit mehr Daten.",
        difficulty = 2,
        funFact = "Der Begriff 'Machine Learning' wurde 1959 von Arthur Samuel praegte er beim Training eines Dame-spielenden Programms auf dem IBM 704."
    ),

    // Question 33
    Question(
        categoryId = 7,
        questionText = "Welche Aufgabe hat ein LIDAR-Sensor bei autonomen Fahrzeugen im Vergleich zu einer Kamera?",
        answerA = "LIDAR liefert Farbinformationen, Kameras messen Abstaende",
        answerB = "LIDAR misst praezise 3D-Abstaende, Kameras liefern Farb- und Texturdetails",
        answerC = "Beide Sensoren sind funktional identisch",
        answerD = "LIDAR funktioniert nur nachts, Kameras nur tagsuebers",
        correctAnswer = 1,
        explanation = "LIDAR erzeugt durch Laserimpulse hochpraezise 3D-Punktwolken und ist unabhaengig von Lichtverhaeltnissen. Kameras liefern reichhaltige visuelle Informationen, haben aber Schwaechen bei Tiefenmessung und Dunkelheit.",
        difficulty = 2,
        funFact = "Waymos LIDAR-Sensoren kosten in der Serienproduktion noch immer mehrere Tausend Dollar pro Einheit – ein Hauptgrund, warum Robotaxis teurer als normale Autos sind."
    ),

    // Question 34
    Question(
        categoryId = 7,
        questionText = "Was ist 'AlphaFold' und warum gilt es als Durchbruch?",
        answerA = "Ein autonomes Faltroboter-System fuer Textilien",
        answerB = "Ein KI-System von DeepMind, das die 3D-Struktur von Proteinen aus ihrer Aminosaeuresequenz vorhersagt",
        answerC = "Ein Quantenalgorithmus fuer Origami-Berechnungen",
        answerD = "Ein Datenbankformat fuer biologische Messdaten",
        correctAnswer = 1,
        explanation = "AlphaFold loeste das 50 Jahre alte 'Proteinfaltungsproblem': Es sagt mit hoher Genauigkeit voraus, welche 3D-Struktur ein Protein aus seiner Aminosaeuresequenz annimmt – ein Schluessel fuer Medikamentenentwicklung.",
        difficulty = 2,
        funFact = "AlphaFold 2 hat die Strukturen von ueber 200 Millionen Proteinen vorhergesagt – fast alle bekannten Proteine der Wissenschaft – und die Daten kostenlos veroeffentlicht."
    ),

    // Question 35
    Question(
        categoryId = 7,
        questionText = "Was ist ein Botnet in der Cybersecurity?",
        answerA = "Ein Netzwerk aus KI-Chatbots fuer den Kundenservice",
        answerB = "Ein Netzwerk aus mit Malware infizierten Geraeten, das zentral von Angreifern kontrolliert wird",
        answerC = "Ein automatisiertes Testsystem fuer Webanwendungen",
        answerD = "Ein Cluster aus Cloud-Servern fuer maschinelles Lernen",
        correctAnswer = 1,
        explanation = "Ein Botnet besteht aus vielen infizierten Geraeten (Bots), die ohne Wissen ihrer Besitzer von einem Command-and-Control-Server aus ferngesteuert werden – z.B. fuer DDoS-Angriffe oder Spam-Kampagnen.",
        difficulty = 2,
        funFact = "Das Mirai-Botnet infizierte 2016 ueber 600.000 IoT-Geraete wie Router und Webcams und nutzte sie fuer einen Angriff, der grosse Teile des US-Internets fuer Stunden lahmlegte."
    ),

    // Question 36
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Transformer' in der KI-Architektur?",
        answerA = "Ein Spannungswandler fuer KI-Serverhardware",
        answerB = "Ein neuronales Netzwerk-Architekturmodell, das Aufmerksamkeitsmechanismen (Attention) nutzt",
        answerC = "Ein Compiler, der Python-Code in Maschinensprache uebersetzt",
        answerD = "Ein Daten-Normalisierungsalgorithmus",
        correctAnswer = 1,
        explanation = "Die 2017 von Google vorgestellte Transformer-Architektur nutzt Self-Attention, um Beziehungen zwischen Woertern unabhaengig von ihrer Position im Satz zu erfassen – Grundlage fast aller modernen LLMs.",
        difficulty = 2,
        funFact = "Das Forschungspapier 'Attention Is All You Need' von 2017, das Transformer einfuehrte, ist mit ueber 100.000 Zitierungen eines der meistzitierten KI-Papers der Geschichte."
    ),

    // Question 37
    Question(
        categoryId = 7,
        questionText = "Was beschreibt 'Quantum Entanglement' (Quantenverschraenkung)?",
        answerA = "Die physische Verbindung zweier Quantencomputer per Glasfaser",
        answerB = "Der Zustand, in dem zwei Qubits so korreliert sind, dass die Messung des einen sofort den Zustand des anderen bestimmt",
        answerC = "Das Verheddern von Quantenschaltkreisen bei hohen Temperaturen",
        answerD = "Die Verschluesselung von Quantendaten in Glasfaserkabeln",
        correctAnswer = 1,
        explanation = "Bei Quantenverschraenkung sind zwei Teilchen so miteinander korreliert, dass eine Messung an einem Teilchen sofort Informationen ueber das andere liefert – unabhaengig von der Entfernung zwischen ihnen.",
        difficulty = 2,
        funFact = "Einstein nannte Quantenverschraenkung 'spukhafte Fernwirkung' und glaubte, sie koennte nicht real sein. Heutige Experimente beweisen jedoch eindeutig ihre Existenz."
    ),

    // Question 38
    Question(
        categoryId = 7,
        questionText = "Was ist Mixed Reality (MR) im Unterschied zu AR?",
        answerA = "MR ist ein anderer Begriff fuer Virtual Reality",
        answerB = "MR integriert digitale Objekte so in die reale Welt, dass sie mit ihr interagieren koennen",
        answerC = "MR funktioniert nur ohne Brille, AR erfordert immer eine",
        answerD = "MR ist auf industrielle Anwendungen beschraenkt",
        correctAnswer = 1,
        explanation = "Bei Mixed Reality werden digitale Objekte nicht nur ueberlagert (wie bei AR), sondern sind raeumlich verankert und interagieren mit der realen Umgebung – z.B. ein virtueller Ball, der auf einem echten Tisch liegt.",
        difficulty = 2,
        funFact = "Microsofts HoloLens gilt als bekanntestes MR-Geraet und wird hauptsaechlich in Industrie, Chirurgie und Militaer eingesetzt – der Konsumentenmarkt ist noch klein."
    ),

    // Question 39
    Question(
        categoryId = 7,
        questionText = "Was ist 'Reinforcement Learning' in der KI?",
        answerA = "Das Trainieren eines Modells ausschliesslich auf beschrifteten Daten",
        answerB = "Ein Lernverfahren, bei dem ein Agent durch Belohnung und Bestrafung lernt, Ziele zu erreichen",
        answerC = "Das Wiederholen von Trainingsdurchlaeufen mit identischen Daten",
        answerD = "Eine Methode zur Datenbeschriftung durch Crowdsourcing",
        correctAnswer = 1,
        explanation = "Beim Reinforcement Learning interagiert ein Agent mit einer Umgebung, fuehrt Aktionen aus und erhaelt Belohnungssignale. Er lernt durch Versuch und Irrtum, die Gesamtbelohnung zu maximieren.",
        difficulty = 2,
        funFact = "Deepminds AlphaGo, das 2016 den weltbesten Go-Spieler Lee Sedol besiegte, wurde hauptsaechlich durch Reinforcement Learning trainiert – es spielte Millionen Partien gegen sich selbst."
    ),

    // Question 40
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Man-in-the-Middle-Angriff' (MITM)?",
        answerA = "Ein Angriff, bei dem ein Hacker physisch zwischen zwei Computern sitzt",
        answerB = "Das Abfangen und moeglicherweise Manipulieren von Kommunikation zwischen zwei Parteien, ohne deren Wissen",
        answerC = "Ein Angriff, der ausschliesslich WLAN-Netzwerke betrifft",
        answerD = "Das Erstellen gefaelschter Webseiten zur Dateneingabe",
        correctAnswer = 1,
        explanation = "Bei einem MITM-Angriff positioniert sich der Angreifer unbemerkt zwischen zwei kommunizierenden Parteien und kann Daten mitlesen, veraendern oder weitergeben – z.B. durch ARP-Spoofing im lokalen Netzwerk.",
        difficulty = 2,
        funFact = "Oeffentliche WLAN-Netzwerke ohne Passwortes sind besonders anfaellig fuer MITM-Angriffe. Ein Angreifer kann in wenigen Minuten einen 'Evil Twin' Access Point aufsetzen."
    ),

    // Question 41
    Question(
        categoryId = 7,
        questionText = "Was leistet 'Computer Vision' als KI-Disziplin?",
        answerA = "Die Optimierung von Monitor-Farbprofilen",
        answerB = "Die automatische Erkennung und Interpretation von visuellen Informationen aus Bildern und Videos",
        answerC = "Die Berechnung von 3D-Grafiken in Echtzeit",
        answerD = "Die Verwaltung von Kameratreibern in Betriebssystemen",
        correctAnswer = 1,
        explanation = "Computer Vision befaehigt Maschinen, digitale Bilder oder Videos zu verstehen – von Objekterkennung ueber Gesichtserkennung bis hin zur medizinischen Bildanalyse.",
        difficulty = 2,
        funFact = "Heutige Computer Vision-Systeme uebertraten 2015 erstmals die menschliche Fehlerrate beim ImageNet-Benchmark fuer Bilderkennung – ein Meilenstein, der als KI-Wendepunkt gilt."
    ),

    // Question 42
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen SAE Level 4 und Level 5 beim autonomen Fahren?",
        answerA = "Level 4 kann nur auf Autobahnen fahren, Level 5 auch in der Stadt",
        answerB = "Level 4 ist autonom in definierten Bereichen (Geofence), Level 5 in jeder Situation weltweit",
        answerC = "Level 4 benoetigt noch ein Lenkrad, Level 5 nicht",
        answerD = "Level 4 ist nur fuer LKW, Level 5 nur fuer PKW",
        correctAnswer = 1,
        explanation = "SAE Level 4 faehrt vollstaendig autonom innerhalb definierter Bedingungen oder Gebiete (z.B. Stadtteile, Wetterbedingungen). Level 5 benoetigt keinerlei Einschraenkungen – es faehrt ueberall autonom.",
        difficulty = 2,
        funFact = "Waymos Robotaxis in San Francisco und Phoenix sind Level 4 – ausserhalb ihrer Geofence-Bereiche muss ein Remote-Operator einspringen oder das Fahrzeug stoppt."
    ),

    // Question 43
    Question(
        categoryId = 7,
        questionText = "Was ist 'Federated Learning' in der KI?",
        answerA = "Das Training eines KI-Modells auf einem zentralen Supercomputer",
        answerB = "Ein Trainingsansatz, bei dem Modelle lokal auf Geraeten trainiert werden und nur Modell-Updates (keine Rohdaten) geteilt werden",
        answerC = "Eine Methode zur Verschluesselung von Trainingsdaten",
        answerD = "Das Zusammenfuehren mehrerer KI-Modelle zu einem Ensemble",
        correctAnswer = 1,
        explanation = "Beim Federated Learning trainiert jedes Geraet lokal ein Modell auf seinen eigenen Daten. Nur die gelernten Gewichtsaktualisierungen werden an einen zentralen Server gesendet – Rohdaten verlassen das Geraet nie.",
        difficulty = 2,
        funFact = "Google nutzt Federated Learning fuer die Wortvorschlagsfunktion auf Android-Tastaturen: Dein Schreibstil verbessert das globale Modell, ohne dass Google deine Nachrichten liest."
    ),

    // Question 44
    Question(
        categoryId = 7,
        questionText = "Was ist 'Synthetic Biology'?",
        answerA = "Die Herstellung kuenstlicher Organismen aus Plastik",
        answerB = "Ein Teilgebiet der Biotechnologie, das biologische Systeme ingenieurmaessig neu entwirft oder von Grund auf neu erschafft",
        answerC = "Das Klonen natuerlicher Organismen im Labor",
        answerD = "Die computergestuetzte Simulation von Oekosystemen",
        correctAnswer = 1,
        explanation = "Synthetic Biology kombiniert Biologie und Ingenieurwesen, um neue biologische Teile, Geraete und Systeme zu entwerfen oder bestehende Systeme aus der Natur umzugestalten.",
        difficulty = 2,
        funFact = "Forscher haben 2010 das erste vollstaendig synthetisch erstellte Bakteriengenom erschaffen und in eine Zelle implantiert – der erste 'synthetische' Organismus der Geschichte."
    ),

    // Question 45
    Question(
        categoryId = 7,
        questionText = "Was ist ein DDoS-Angriff?",
        answerA = "Ein Angriff, bei dem verschluesselte Daten gestohlen werden",
        answerB = "Ein Angriff, der durch massenhaft verteilte Anfragen einen Server oder Dienst zum Absturz bringt",
        answerC = "Das Eindringen in ein System durch ein einzelnes kompromittiertes Konto",
        answerD = "Das Manipulieren von DNS-Eintraegen fuer gefaelschte Weiterleitungen",
        correctAnswer = 1,
        explanation = "Distributed Denial of Service (DDoS) nutzt viele verteilte Systeme (oft ein Botnet), um ein Ziel mit so vielen Anfragen zu ueberfluten, dass es den legitimen Verkehr nicht mehr bedienen kann.",
        difficulty = 2,
        funFact = "Der bislang groesste DDoS-Angriff wurde 2023 auf Cloudflare registriert: 71 Millionen Anfragen pro Sekunde – mehr als das 35-fache des normalen Internet-Spitzenverkehrs in Deutschland."
    ),

    // Question 46
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Neuromorphic Computing'?",
        answerA = "Computing auf der Grundlage von Mustern in MRT-Gehirnscans",
        answerB = "Computerchips, die nach dem Vorbild des menschlichen Gehirns aufgebaut sind und besonders energieeffizient lernen",
        answerC = "KI-Training ausschliesslich mit Gehirnwellen-Daten",
        answerD = "Quantencomputer-Algorithmen basierend auf neuronalen Signalen",
        correctAnswer = 1,
        explanation = "Neuromorphe Chips wie Intels Loihi ahmen die Struktur biologischer neuronaler Netze nach: Sie verarbeiten Informationen in Spikes (Impulsen) statt in klassischen Taktzyklen und sind dadurch extrem energieeffizient.",
        difficulty = 2,
        funFact = "Intels Loihi 2 verarbeitet KI-Aufgaben mit einem Bruchteil des Energieverbrauchs einer GPU – bei manchen Aufgaben bis zu 1000-mal effizienter."
    ),

    // Question 47
    Question(
        categoryId = 7,
        questionText = "Welche Rolle spielt 5G bei Industrie 4.0?",
        answerA = "5G wird ausschliesslich fuer Smartphone-Streaming genutzt",
        answerB = "5G ermoeglicht durch hohe Bandbreite und extrem niedrige Latenz die Echtzeit-Vernetzung von Maschinen in der Smart Factory",
        answerC = "5G ersetzt WLAN vollstaendig in Fabrikhallen",
        answerD = "5G wird nur fuer die Videokonferenz zwischen Standorten eingesetzt",
        correctAnswer = 1,
        explanation = "5G bietet Latenzzeiten unter 1 Millisekunde und bis zu 1 Million verbundene Geraete pro Quadratkilometer – ideale Voraussetzungen fuer die drahtlose Maschinensteuerung und Echtzeit-Datenanalyse in Smart Factories.",
        difficulty = 2,
        funFact = "Bosch betreibt in Renningen eine der ersten vollstaendig 5G-vernetzten Fabriken Deutschlands, in der Maschinen kabellos in Echtzeit kommunizieren."
    ),

    // Question 48
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Generative Adversarial Network' (GAN)?",
        answerA = "Ein Netzwerk aus konkurrierenden Unternehmens-KIs",
        answerB = "Ein KI-System aus zwei Netzen: eines generiert Inhalte, das andere bewertet deren Echtheit – beide verbessern sich gegenseitig",
        answerC = "Ein Sicherheitssystem, das Angriffe durch KI abwehrt",
        answerD = "Eine Methode zur Datenkompression durch neuronale Netze",
        correctAnswer = 1,
        explanation = "GANs bestehen aus einem Generator (erzeugt synthetische Daten) und einem Diskriminator (unterscheidet echt von gefaelscht). Durch diesen Wettbewerb lernen beide Netze, bis der Generator realistische Ausgaben produziert.",
        difficulty = 2,
        funFact = "GANs wurden 2014 von Ian Goodfellow erfunden – die Grundidee entstand laut Legende bei einer Diskussion in einer Bar in Montreal."
    ),

    // Question 49
    Question(
        categoryId = 7,
        questionText = "Wofuer steht die Abkuerzung MQTT im IoT-Bereich?",
        answerA = "Multi-Queue Telemetry Transport",
        answerB = "Message Queuing Telemetry Transport – ein leichtgewichtiges Protokoll fuer IoT-Geraetkommunikation",
        answerC = "Modular Quality Technology Transfer",
        answerD = "Machine Query and Transaction Terminal",
        correctAnswer = 1,
        explanation = "MQTT ist ein schlankes Publish-Subscribe-Protokoll, das speziell fuer Geraete mit begrenzter Rechenleistung und schlechter Netzverbindung entwickelt wurde – ideal fuer Sensoren und IoT-Knoten.",
        difficulty = 2,
        funFact = "MQTT wurde 1999 von IBM-Ingenieur Andy Stanford-Clark erfunden, um Oelpipelines per Satellit zu ueberwachen – mit minimaler Bandbreite und maximalem Zuverlassigkeit."
    ),

    // Question 50
    Question(
        categoryId = 7,
        questionText = "Was ist 'Explainable AI' (XAI)?",
        answerA = "KI-Systeme, die ausschliesslich in Programmiersprachen mit Englisch-Syntax entwickelt werden",
        answerB = "Methoden und Techniken, die die Entscheidungen von KI-Modellen fuer Menschen nachvollziehbar und erklaerbar machen",
        answerC = "Eine Programmiersprache speziell fuer transparente Algorithmen",
        answerD = "KI-Systeme ohne versteckte Schichten im neuronalen Netz",
        correctAnswer = 1,
        explanation = "XAI zielt darauf ab, die 'Black Box' von KI-Modellen zu oeffnen: Mit Techniken wie SHAP oder LIME kann erklaert werden, welche Eingaben warum zu einer bestimmten Entscheidung gefuehrt haben.",
        difficulty = 2,
        funFact = "In der EU schreibt der AI Act ab 2025 Erklaerbarkeit fuer Hochrisiko-KI-Systeme gesetzlich vor – z.B. bei KI-Entscheidungen in Kreditvergabe oder Bewerbungsauswahl."
    )
)
