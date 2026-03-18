package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsEasy4(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 7,
        questionText = "Was ist ein sicheres Passwort?",
        answerA = "Das eigene Geburtsdatum",
        answerB = "Eine Kombination aus Buchstaben, Zahlen und Sonderzeichen",
        answerC = "Der eigene Vorname",
        answerD = "Das Wort 'Passwort'",
        correctAnswer = 1,
        explanation = "Ein sicheres Passwort besteht aus mindestens 12 Zeichen und enthaelt Grossbuchstaben, Kleinbuchstaben, Zahlen und Sonderzeichen.",
        difficulty = 1,
        funFact = "Das haeufigste Passwort weltweit ist noch immer '123456' -- obwohl es in Sekunden geknackt werden kann."
    ),

    // Question 2
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter Phishing?",
        answerA = "Eine App zum Angeln-Lernen",
        answerB = "Ein Betrugsversuch per E-Mail oder Nachricht, um Passwoerter zu stehlen",
        answerC = "Eine Methode zur Datensicherung",
        answerD = "Ein sicheres Anmeldeverfahren",
        correctAnswer = 1,
        explanation = "Beim Phishing taeuschen Betrueger echte Webseiten oder Unternehmen nach, um Nutzer zur Eingabe ihrer Zugangsdaten zu verleiten.",
        difficulty = 1,
        funFact = "Der Begriff 'Phishing' leitet sich vom englischen 'fishing' (Angeln) ab -- die Betrueger 'fischen' nach Opfern mit einem koederhaften Lockangebot."
    ),

    // Question 3
    Question(
        categoryId = 7,
        questionText = "Was ist die Zweifaktor-Authentifizierung (2FA)?",
        answerA = "Ein Passwort mit zwei Grossbuchstaben",
        answerB = "Ein zweiter Sicherheitsschritt zusaetzlich zum Passwort, z.B. ein SMS-Code",
        answerC = "Zwei verschiedene Passwoerter hintereinander eingeben",
        answerD = "Ein System, das zwei Nutzer gleichzeitig anmeldet",
        correctAnswer = 1,
        explanation = "Die Zweifaktor-Authentifizierung schuetzt ein Konto, indem nach dem Passwort noch ein zweiter Beweis verlangt wird, z.B. ein Code per SMS.",
        difficulty = 1,
        funFact = "Konten mit aktivierter 2FA sind laut Google in 99,9% der Faelle sicher vor automatisierten Hacker-Angriffen."
    ),

    // Question 4
    Question(
        categoryId = 7,
        questionText = "Was sollte man niemals als Passwort verwenden?",
        answerA = "Eine zufaellige Buchstaben-Zahlen-Kombination",
        answerB = "Den eigenen Namen oder das Geburtsdatum",
        answerC = "Eine lange Buchstabenreihe mit Sonderzeichen",
        answerD = "Ein Passwort mit mehr als 15 Zeichen",
        correctAnswer = 1,
        explanation = "Name und Geburtsdatum sind oeffentlich leicht auffindbar und werden von Hackern als erstes ausprobiert -- sie sind deshalb unsichere Passwoerter.",
        difficulty = 1,
        funFact = "Hacker nutzen sogenannte 'Woerterbuchangriffe' -- sie probieren automatisch Millionen haeufiger Woerter und Daten durch."
    ),

    // Question 5
    Question(
        categoryId = 7,
        questionText = "Woran erkennt man eine Phishing-E-Mail?",
        answerA = "Sie hat immer ein Bild von einem Fisch",
        answerB = "Sie draengt zur Eile, enthaelt Rechtschreibfehler oder fordert Zugangsdaten an",
        answerC = "Sie kommt immer in der Nacht an",
        answerD = "Sie ist immer rot markiert",
        correctAnswer = 1,
        explanation = "Phishing-Mails erkennnt man oft an Zeitdruck ('Handeln Sie sofort!'), verdaechtigen Links, Rechtschreibfehlern und der Aufforderung, Passwoerter einzugeben.",
        difficulty = 1,
        funFact = "Mehr als 3 Milliarden Phishing-E-Mails werden jeden Tag weltweit verschickt -- das sind ueber 34.000 pro Sekunde."
    ),

    // Question 6
    Question(
        categoryId = 7,
        questionText = "Was sind Cookies auf einer Webseite?",
        answerA = "Keksrezepte in einer Online-Datenbank",
        answerB = "Kleine Datendateien, die der Browser speichert, um Einstellungen oder Sitzungen zu merken",
        answerC = "Programme, die Viren auf den Computer laden",
        answerD = "Werbebanner auf Webseiten",
        correctAnswer = 1,
        explanation = "Cookies sind kleine Textdateien, die Webseiten im Browser ablegen, um z.B. den Anmeldestatus, Spracheinstellungen oder Warenkorbinhalte zu speichern.",
        difficulty = 1,
        funFact = "Der Name 'Cookie' stammt vom Programmierbegriff 'Magic Cookie' -- einem kleinen Datenpaket, das hin- und hergeschickt wird."
    ),

    // Question 7
    Question(
        categoryId = 7,
        questionText = "Was regelt die DSGVO in Europa?",
        answerA = "Die Preise fuer Internetzugaenge",
        answerB = "Den Schutz persoenlicher Daten von Buergerinnen und Buergern",
        answerC = "Die Sicherheit von Flugzeugen",
        answerD = "Die Lautstaerke von Werbung im Fernsehen",
        correctAnswer = 1,
        explanation = "Die DSGVO (Datenschutz-Grundverordnung) ist ein EU-Gesetz, das festlegt, wie Unternehmen persoenliche Daten von Nutzern erheben, speichern und verwenden duerfen.",
        difficulty = 1,
        funFact = "Die DSGVO trat 2018 in Kraft und ist seitdem das strengste Datenschutzgesetz der Welt -- Verstoesse koennen Bussgelder von bis zu 4% des weltweiten Jahresumsatzes bedeuten."
    ),

    // Question 8
    Question(
        categoryId = 7,
        questionText = "Was bedeutet es, wenn eine Webseite ein Schloss-Symbol in der Adressleiste zeigt?",
        answerA = "Die Webseite ist kostenpflichtig",
        answerB = "Die Verbindung zur Webseite ist verschluesselt (HTTPS)",
        answerC = "Die Webseite ist gesperrt",
        answerD = "Der Nutzer ist eingeloggt",
        correctAnswer = 1,
        explanation = "Das Schloss-Symbol zeigt an, dass die Daten zwischen Browser und Webseite verschluesselt uebertragen werden -- Dritte koennen sie nicht mitlesen.",
        difficulty = 1,
        funFact = "Noch 2016 nutzte weniger als die Haelfte aller Webseiten HTTPS. Heute sind es dank kostenloser Zertifikate ueber 90%."
    ),

    // Question 9
    Question(
        categoryId = 7,
        questionText = "Wie schuetzt man sein Social-Media-Konto am besten?",
        answerA = "Mit einem einfachen Passwort, das man sich gut merken kann",
        answerB = "Mit einem starken Passwort und aktivierter Zweifaktor-Authentifizierung",
        answerC = "Indem man das Passwort regelmaessig an Freunde weitergibt",
        answerD = "Mit dem eigenen Namen als Passwort",
        correctAnswer = 1,
        explanation = "Ein starkes, einzigartiges Passwort plus 2FA ist die wirksamste Kombination zum Schutz von Social-Media-Konten gegen Hackerangriffe.",
        difficulty = 1,
        funFact = "Jedes Jahr werden weltweit Milliarden von Passwoertern bei Datenpannen gestohlen und im Darknet verkauft."
    ),

    // Question 10
    Question(
        categoryId = 7,
        questionText = "Was ist Cybermobbing?",
        answerA = "Eine Art Computerspiel",
        answerB = "Die Belaestigung, Bedrohung oder Demuetigigung von Personen ueber digitale Medien",
        answerC = "Ein Sicherheitsprogramm fuer Kinder",
        answerD = "Ein Virus, der soziale Netzwerke angreift",
        correctAnswer = 1,
        explanation = "Cybermobbing bezeichnet das gezielte Schuedigen, Beleidigen oder Bedrohen von Personen ueber das Internet, oft anonym und rund um die Uhr.",
        difficulty = 1,
        funFact = "Laut Studien hat jeder dritte Jugendliche in Deutschland schon Erfahrungen mit Cybermobbing gemacht -- als Opfer oder als Zeuge."
    ),

    // Question 11
    Question(
        categoryId = 7,
        questionText = "Was sollte man bei den Datenschutzeinstellungen sozialer Netzwerke tun?",
        answerA = "Alles auf oeffentlich lassen, damit man mehr Follower bekommt",
        answerB = "Regelmaessig pruefen und Inhalte nur fuer Freunde sichtbar schalten",
        answerC = "Gar nichts -- die Werkseinstellungen sind immer sicher",
        answerD = "Alle Daten oeffentlich teilen, damit man leichter gefunden wird",
        correctAnswer = 1,
        explanation = "Die Standard-Datenschutzeinstellungen in sozialen Netzwerken sind oft sehr offen -- es ist wichtig, sie regelmaessig zu pruefen und anzupassen.",
        difficulty = 1,
        funFact = "Facebook aendert seine Datenschutzeinstellungen regelmaessig -- Experten empfehlen, sie mindestens einmal im Jahr zu pruefen."
    ),

    // Question 12
    Question(
        categoryId = 7,
        questionText = "Wofuer steht die Abkuerzung DSGVO?",
        answerA = "Deutsche Sicherheits-Grundverordnung fuer Organisationen",
        answerB = "Datenschutz-Grundverordnung",
        answerC = "Digitale Software-Grundvoraussetzungen fuer den Online-Verkehr",
        answerD = "Datensicherungs- und Geraeteschutz-Verordnung",
        correctAnswer = 1,
        explanation = "DSGVO steht fuer Datenschutz-Grundverordnung -- das europaeeische Gesetz zum Schutz persoenlicher Daten.",
        difficulty = 1,
        funFact = "Die DSGVO gilt nicht nur fuer europaeische Unternehmen, sondern fuer alle Firmen weltweit, die Daten von EU-Bueregern verarbeiten."
    ),

    // Question 13
    Question(
        categoryId = 7,
        questionText = "Welche Funktion hat eine Mikrowelle?",
        answerA = "Sie kocht Lebensmittel durch direkten Kontakt mit einer Heizplatte",
        answerB = "Sie erwaermt Lebensmittel durch Mikrowellenstrahlung, die Wassermolekuele zum Schwingen bringt",
        answerC = "Sie kuehlt Lebensmittel schnell herunter",
        answerD = "Sie reinigt Lebensmittel durch UV-Strahlung",
        correctAnswer = 1,
        explanation = "Eine Mikrowelle erzeugt elektromagnetische Wellen, die die Wassermolekuele in Lebensmitteln zum Schwingen bringen -- dabei entsteht Waerme.",
        difficulty = 1,
        funFact = "Die Mikrowelle wurde zufeellig 1945 erfunden: Ingenieur Percy Spencer bemerkte, dass ein Radargeraet eine Schokolade in seiner Tasche geschmolzen hatte."
    ),

    // Question 14
    Question(
        categoryId = 7,
        questionText = "Was bedeutet das Schleuderprogramm einer Waschmaschine?",
        answerA = "Die Waschmaschine waescht bei besonders hoher Temperatur",
        answerB = "Die Trommel dreht sich sehr schnell, um Wasser aus der Waesche zu schleudern",
        answerC = "Die Waschmaschine macht einen Spuelgang ohne Waschmittel",
        answerD = "Die Waschmaschine troecknet die Waesche mit Heissluft",
        correctAnswer = 1,
        explanation = "Beim Schleuderprogramm dreht sich die Trommel mit hoher Drehzahl (oft 1200-1600 U/min), um durch die Fliehkraft Wasser aus der Waesche zu pressen.",
        difficulty = 1,
        funFact = "Je hoeher die Schleuderzahl (U/min), desto weniger Restfeuchte bleibt in der Waesche -- und desto kuerzer muss sie troocknen."
    ),

    // Question 15
    Question(
        categoryId = 7,
        questionText = "Wofuer verwendet man eine Geschirrspuelmaschine?",
        answerA = "Zum Waschen von Waesche",
        answerB = "Zum automatischen Reinigen von Geschirr, Glaesern und Besteck",
        answerC = "Zum Sterilisieren von Lebensmitteln",
        answerD = "Zum Aufwaermen von Speisen",
        correctAnswer = 1,
        explanation = "Eine Geschirrspuelmaschine reinigt Geschirr automatisch durch einen Spuelprozess mit Wasser, Spuelmittel und Waerme.",
        difficulty = 1,
        funFact = "Die erste Geschirrspuelmaschine patentierte Josephine Cochrane 1886 -- weil ihre Diener beim Handabwaschen zu viel Porzellan zerbrachen."
    ),

    // Question 16
    Question(
        categoryId = 7,
        questionText = "Was ist eine Lithium-Ionen-Batterie?",
        answerA = "Eine Einwegbatterie fuer Fernbedienungen",
        answerB = "Ein wiederaufladbarer Akku, der in Smartphones und Laptops eingesetzt wird",
        answerC = "Eine Autobatterie aus Blei",
        answerD = "Eine Batterie aus Salzwasser",
        correctAnswer = 1,
        explanation = "Lithium-Ionen-Akkus sind wiederaufladbar, leicht und speichern viel Energie auf kleinem Raum -- deshalb sind sie in nahezu allen mobilen Geraeten verbaut.",
        difficulty = 1,
        funFact = "Die Entwickler des Lithium-Ionen-Akkus, Goodenough, Whittingham und Yoshino, erhielten 2019 den Chemie-Nobelpreis."
    ),

    // Question 17
    Question(
        categoryId = 7,
        questionText = "Was ist kabelloses Laden (Wireless Charging)?",
        answerA = "Laden ueber eine normale Steckdose",
        answerB = "Laden durch elektromagnetische Induktion, ohne dass ein Kabel angesteckt werden muss",
        answerC = "Laden ueber das WLAN-Signal",
        answerD = "Laden durch Sonnenlicht wie bei Solarzellen",
        correctAnswer = 1,
        explanation = "Beim kabellosen Laden liegt das Geraet auf einer Ladeschale -- ein Magnetfeld uebertraegt Energie durch Induktion in den Akku, ganz ohne Kabel.",
        difficulty = 1,
        funFact = "Der Qi-Standard (gesprochen 'Tschii') ist der internationale Standard fuer kabelloses Laden und wird von fast allen modernen Smartphones unterstuetzt."
    ),

    // Question 18
    Question(
        categoryId = 7,
        questionText = "Warum sollte man Akkus nicht dauerhaft auf 100% aufgeladen lassen?",
        answerA = "Weil das Laden bei 100% automatisch aufhoert und Strom verschwendet wird",
        answerB = "Weil dauerhafte Vollladung den Akku schneller altern laesst und die Kapazitaet verringert",
        answerC = "Weil Akkus bei 100% explodieren koennen",
        answerD = "Es gibt keinen Grund -- Vollladung ist immer ideal",
        correctAnswer = 1,
        explanation = "Lithium-Ionen-Akkus altern schneller, wenn sie dauerhaft bei 100% oder 0% gehalten werden -- ideal ist ein Bereich zwischen 20% und 80%.",
        difficulty = 1,
        funFact = "Viele Smartphone-Hersteller haben deshalb eine 'optimierte Ladefunktion' eingebaut, die den Akku absichtlich bei 80% pausiert."
    ),

    // Question 19
    Question(
        categoryId = 7,
        questionText = "Was bedeutet '4K' bei einem Fernseher?",
        answerA = "Der Fernseher hat 4 HDMI-Anschluesse",
        answerB = "Eine Bildaufloesung von ca. 3840 x 2160 Pixeln -- viermal so viel wie Full HD",
        answerC = "Der Fernseher hat ein 4 Kilogramm schweres Display",
        answerD = "Ein Fernseher mit 4.000 Kanal-Speicherplaetzen",
        correctAnswer = 1,
        explanation = "4K bezeichnet eine Bildaufloesung von ca. 3840 x 2160 Pixeln (auch UHD genannt). Das Bild hat viermal mehr Pixel als Full HD (1920 x 1080).",
        difficulty = 1,
        funFact = "Der Begriff '4K' stammt aus dem Kino, wo das Bild rund 4.000 Pixel breit ist -- beim Heim-TV nennt man die gleiche Aufloesung oft auch 'UHD'."
    ),

    // Question 20
    Question(
        categoryId = 7,
        questionText = "Was ist ein Smart TV?",
        answerA = "Ein Fernseher, der ausschliesslich fuer Videokonferenzen genutzt wird",
        answerB = "Ein Fernseher mit Internetverbindung, auf dem man Apps nutzen kann",
        answerC = "Ein Fernseher, der sich automatisch an die Helligkeit anpasst",
        answerD = "Ein Fernseher mit besonders grossem Bildschirm",
        correctAnswer = 1,
        explanation = "Ein Smart TV ist ein Fernseher mit eingebautem Internetzugang und App-System. Man kann darauf Netflix, YouTube und andere Dienste direkt nutzen.",
        difficulty = 1,
        funFact = "Ueber 70% der in Deutschland verkauften Fernseher sind heute Smart TVs -- analoge Fernseher ohne Internet sind fast verschwunden."
    ),

    // Question 21
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem LED- und einem OLED-Fernseher?",
        answerA = "LED ist neuer als OLED",
        answerB = "OLED leuchtet selbst pro Pixel, LED hat eine Hintergrundbeleuchtung -- OLED hat daher tieferes Schwarz",
        answerC = "LED hat bessere Farben, OLED ist guenstiger",
        answerD = "Es gibt keinen Unterschied -- beide Technologien sind identisch",
        correctAnswer = 1,
        explanation = "Bei OLED leuchtet jedes Pixel einzeln und kann komplett ausschalten -- das ergibt perfektes Schwarz. LED-Bildschirme haben eine Hintergrundbeleuchtung, die nie ganz ausgeht.",
        difficulty = 1,
        funFact = "OLED steht fuer 'Organic Light-Emitting Diode' -- das 'Organic' bezieht sich auf organische Kohlenstoffverbindungen in der Leuchtschicht."
    ),

    // Question 22
    Question(
        categoryId = 7,
        questionText = "Was ist der Vorteil von Noise-Cancelling-Kopfhoerern?",
        answerA = "Sie haben eine lautere Musikwiedergabe als normale Kopfhoerer",
        answerB = "Sie reduzieren aktiv Umgebungsgeraeusche, sodass man in ruhiger Umgebung zuhoeren kann",
        answerC = "Sie uebersetzen gesprochene Sprache automatisch",
        answerD = "Sie blockieren Bluetooth-Stoersignale",
        correctAnswer = 1,
        explanation = "Noise-Cancelling-Kopfhoerer messen den Umgebungslaerm und erzeugen ein gegenlaeufiges Schallsignal, das Stoergeraeusche aufhebt -- das nennt man aktive Geraeuschangabe.",
        difficulty = 1,
        funFact = "Aktives Noise Cancelling wurde urspruenglich fuer Pilotenheadsets entwickelt, um den lauten Triebwerklaerm in Flugzeugcockpits zu reduzieren."
    ),

    // Question 23
    Question(
        categoryId = 7,
        questionText = "Wie uebertraegt ein Bluetooth-Lautsprecher Musik?",
        answerA = "Ueber ein WLAN-Netzwerk",
        answerB = "Drahtlos per Funk -- das Smartphone sendet das Audiosignal per Bluetooth",
        answerC = "Ueber einen USB-Stick",
        answerD = "Ueber ein Klinkenkabel",
        correctAnswer = 1,
        explanation = "Bluetooth ist ein Kurzstreckenfunkstandard. Ein Smartphone oder Tablet sendet das Audiosignal als Funksignal an den Lautsprecher, ohne Kabel.",
        difficulty = 1,
        funFact = "Bluetooth wurde nach dem Wikingerkoening Harald Blaatand (Harald Bluetooth) benannt, der dafuer bekannt war, verfeindete Staemme zu verbinden -- so wie Bluetooth Geraete verbindet."
    ),

    // Question 24
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'In-Ear-Kopfhoerer'?",
        answerA = "Kopfhoerer, die ueber dem Ohr liegen",
        answerB = "Kleine Kopfhoerer, die direkt in den Gehoergang gesteckt werden",
        answerC = "Kopfhoerer mit einem bugelartigen Rahmen um den Kopf",
        answerD = "Kopfhoerer fuer professionelle Tonstudios",
        correctAnswer = 1,
        explanation = "In-Ear-Kopfhoerer (auch Ohrstoepsel genannt) werden direkt in den Gehoergang gesteckt und sind besonders kompakt und transportfreundlich.",
        difficulty = 1,
        funFact = "Die beliebtesten In-Ear-Kopfhoerer der Welt sind Apples AirPods -- seit ihrer Einfuehrung 2016 haben sie das Design kleiner Kopfhoerer global gepraegt."
    ),

    // Question 25
    Question(
        categoryId = 7,
        questionText = "Wofuer steht GPS?",
        answerA = "General Positioning Software",
        answerB = "Global Positioning System",
        answerC = "Geographical Precision Scanner",
        answerD = "Global Pathway Service",
        correctAnswer = 1,
        explanation = "GPS steht fuer Global Positioning System -- ein US-amerikanisches Satellitennavigationssystem, das die genaue Position von Geraeten auf der Erde berechnet.",
        difficulty = 1,
        funFact = "Das GPS-System besteht aus mindestens 24 Satelliten, die die Erde umkreisen -- mindestens 4 muessen sichtbar sein, damit die Position genau berechnet werden kann."
    ),

    // Question 26
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert ein Navigationssystem im Auto?",
        answerA = "Es laedt Kartenbilder aus dem Internet und zeigt die Strassen",
        answerB = "Es empfaengt Signale von GPS-Satelliten und berechnet daraus die aktuelle Position und Route",
        answerC = "Es liest den Strassenbelag mit Infrarotsensoren ab",
        answerD = "Es fragt andere Autos nach der besten Route",
        correctAnswer = 1,
        explanation = "Ein Navi empfaengt Signale von mehreren GPS-Satelliten, berechnet daraus den genauen Standort und gleicht diesen mit gespeicherten Kartendaten ab.",
        difficulty = 1,
        funFact = "Fruehe Navis kosteten in den 1990ern ueber 2.000 Euro -- heute ist GPS-Navigation in jedem Smartphone kostenlos enthalten."
    ),

    // Question 27
    Question(
        categoryId = 7,
        questionText = "Was zeigt die blaue Linie auf Google Maps an?",
        answerA = "Strassen mit Tempolimit 30",
        answerB = "Die vorgeschlagene Route von A nach B",
        answerC = "Wasserstrassen und Kanaele",
        answerD = "Gesperrte Strassen",
        correctAnswer = 1,
        explanation = "Die blaue Linie auf Google Maps markiert die empfohlene Navigationsroute von Start zu Ziel.",
        difficulty = 1,
        funFact = "Google Maps wurde 2005 veroeffentlicht und ist heute der meistgenutzte Kartendienst der Welt mit ueber 1 Milliarde aktiven Nutzern pro Monat."
    ),

    // Question 28
    Question(
        categoryId = 7,
        questionText = "Was ist Echtzeit-Verkehrsinformation bei einem Navigationssystem?",
        answerA = "Informationen ueber historische Strassenverlaeufe",
        answerB = "Aktuelle Daten zu Staus, Unfaellen und Baustellen, die die Route beeinflusst",
        answerC = "Informationen ueber Busplandaten",
        answerD = "Die Geschwindigkeit des eigenen Fahrzeugs in Echtzeit",
        correctAnswer = 1,
        explanation = "Echtzeit-Verkehrsinformationen werden ueber das Internet bezogen und zeigen aktuelle Staus oder Umleitungen, damit das Navi die schnellste Route berechnen kann.",
        difficulty = 1,
        funFact = "Google Maps sammelt anonymisierte Geschwindigkeitsdaten von Millionen Smartphone-Nutzern, um Staus in Echtzeit zu erkennen."
    ),

    // Question 29
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem Tintenstrahl- und einem Laserdrucker?",
        answerA = "Tintenstrahldrucker sind immer groesser als Laserdrucker",
        answerB = "Tintenstrahldrucker spritzt fluessige Tinte auf das Papier, Laserdrucker nutzt Hitze und Toner-Pulver",
        answerC = "Laserdrucker kann nur schwarz-weiss drucken, Tintenstrahldrucker immer farbig",
        answerD = "Es gibt keinen Unterschied -- beide Verfahren sind identisch",
        correctAnswer = 1,
        explanation = "Tintenstrahldrucker (Inkjet) spritzen winzige Tintenttropfen auf das Papier. Laserdrucker laden Toner-Pulver elektrostatisch auf das Papier und fixieren es mit Hitze.",
        difficulty = 1,
        funFact = "Laserdrucker sind bei haeufigem Drucken pro Seite oft guenstiger als Tintenstrahldrucker, weil Toner laenger haelt als fluessige Tinte."
    ),

    // Question 30
    Question(
        categoryId = 7,
        questionText = "Was druckt ein 3D-Drucker aus?",
        answerA = "Nur Papier-Dokumente in drei Farben",
        answerB = "Dreidimensionale Objekte, Schicht fuer Schicht, aus Kunststoff oder anderen Materialien",
        answerC = "Fotos in besonders hoher Qualitaet",
        answerD = "Elektronische Schaltkreise auf Platinen",
        correctAnswer = 1,
        explanation = "Ein 3D-Drucker baut dreidimensionale Objekte auf, indem er Material (meist Kunststoff) Schicht fuer Schicht auftraegt -- wie eine umgekehrte Sculptur.",
        difficulty = 1,
        funFact = "3D-Drucker werden heute in der Medizin eingesetzt, um massgeschneiderte Prothesen, Implantate und sogar Gewebestrukturen herzustellen."
    ),

    // Question 31
    Question(
        categoryId = 7,
        questionText = "Was ist ein Passwort-Manager?",
        answerA = "Ein Programm, das Passwoerter automatisch zuruecksetzt",
        answerB = "Eine App, die alle Passwoerter verschluesselt speichert und automatisch eingibt",
        answerC = "Ein Sicherheitsprogramm gegen Computerviren",
        answerD = "Eine Funktion im Browser zum Sperren von Webseiten",
        correctAnswer = 1,
        explanation = "Ein Passwort-Manager speichert alle Passwoerter sicher verschluesselt und fuellet sie automatisch in Anmeldeformulare ein -- man muss sich nur noch ein Master-Passwort merken.",
        difficulty = 1,
        funFact = "Wer einen Passwort-Manager nutzt, hat im Durchschnitt viel staerkere Passwoerter als ohne -- denn er muss sie sich nicht mehr merken."
    ),

    // Question 32
    Question(
        categoryId = 7,
        questionText = "Warum ist es gefaehrlich, dasselbe Passwort fuer mehrere Konten zu nutzen?",
        answerA = "Weil das Passwort dann schneller vergessen wird",
        answerB = "Weil bei einem Datenleck eines Dienstes alle anderen Konten ebenfalls gefaehrdet sind",
        answerC = "Weil gleiche Passwoerter automatisch gesperrt werden",
        answerD = "Es ist nicht gefaehrlich -- es ist sogar empfohlen",
        correctAnswer = 1,
        explanation = "Wenn Hacker das Passwort eines Dienstes stehlen, probieren sie es sofort bei E-Mail, Bank und anderen Diensten aus -- ein Trick namens 'Credential Stuffing'.",
        difficulty = 1,
        funFact = "Nach grossen Datenpannen (z.B. Adobe 2013 mit 153 Mio. Nutzerdaten) werden gestohlene Passwoerter in Listen online gehandelt."
    ),

    // Question 33
    Question(
        categoryId = 7,
        questionText = "Was ist ein Spam-Filter?",
        answerA = "Ein Programm, das E-Mails uebersetzt",
        answerB = "Eine Funktion, die unerwuenschte Werbe- und Betrugs-E-Mails automatisch aussortiert",
        answerC = "Ein Antivirusprogramm fuer Smartphones",
        answerD = "Ein Programm zum Archivieren alter E-Mails",
        correctAnswer = 1,
        explanation = "Ein Spam-Filter analysiert eingehende E-Mails und erkennt Muster von Werbemails oder Betrugsversuchen, die dann automatisch in den Spam-Ordner verschoben werden.",
        difficulty = 1,
        funFact = "Etwa 45-50% aller weltweit versendeten E-Mails sind Spam -- das entspricht taeglich rund 160 Milliarden Spam-Nachrichten."
    ),

    // Question 34
    Question(
        categoryId = 7,
        questionText = "Was macht ein Inkognito-Fenster im Browser?",
        answerA = "Es macht den Nutzer im Internet unsichtbar und anonym",
        answerB = "Es speichert keine Browserverlauf, Cookies oder eingegebene Daten nach dem Schliessen",
        answerC = "Es schuetzt vor Viren und Schadsoftware",
        answerD = "Es ermoeglicht schnelleres Laden von Webseiten",
        correctAnswer = 1,
        explanation = "Das Inkognito-Fenster speichert nach dem Schliessen keinen Verlauf, keine Cookies und keine Formulardaten auf dem Geraet -- der Internetanbieter kann die Aktivitaet aber trotzdem sehen.",
        difficulty = 1,
        funFact = "Google wurde 2023 in den USA wegen des Inkognito-Modus verklagt, weil Google weiterhin Daten sammelte, obwohl Nutzer glaubten, sie waeren anonym."
    ),

    // Question 35
    Question(
        categoryId = 7,
        questionText = "Was ist 8K bei einem Fernseher?",
        answerA = "Eine Bildaufloesung von 7680 x 4320 Pixeln -- viermal so viel wie 4K",
        answerB = "Eine Fernsehtechnologie mit 8 Farbkanaelen",
        answerC = "Ein Fernseher mit 8 integrierten Lautsprechern",
        answerD = "Ein Fernseher, der 8.000 Sender empfangen kann",
        correctAnswer = 0,
        explanation = "8K bezeichnet eine Bildaufloesung von 7680 x 4320 Pixeln. Das sind viermal so viele Pixel wie 4K und 16-mal so viele wie Full HD.",
        difficulty = 1,
        funFact = "8K-Inhalte sind bislang kaum verfuegbar -- die meisten Streaming-Dienste bieten noch kein natives 8K-Material an."
    ),

    // Question 36
    Question(
        categoryId = 7,
        questionText = "Wozu dient die Datenschutzerklaerung einer App oder Webseite?",
        answerA = "Sie beschreibt die Funktionen der App",
        answerB = "Sie erklaert, welche Daten gesammelt werden, wie sie verwendet und gespeichert werden",
        answerC = "Sie listet die Preise fuer Premium-Funktionen auf",
        answerD = "Sie zeigt die technischen Anforderungen fuer die Nutzung",
        correctAnswer = 1,
        explanation = "Die Datenschutzerklaerung informiert Nutzer dareuber, welche persoenlichen Daten ein Dienst erfasst, wie er sie verarbeitet und mit wem er sie teilt.",
        difficulty = 1,
        funFact = "Studien zeigen: Es wuerde ca. 76 Arbeitstage pro Jahr dauern, alle Datenschutzerkaerungen der Dienste zu lesen, die eine Durchschnittsperson nutzt."
    ),

    // Question 37
    Question(
        categoryId = 7,
        questionText = "Was ist eine Waschmaschinenkapazitaet von 8 kg?",
        answerA = "Das maximale Gewicht der Waschmaschine selbst",
        answerB = "Das maximale Gewicht der trockenen Waesche, die in einem Waschgang gewaschen werden kann",
        answerC = "Der Wasserverbrauch pro Waschgang in Litern",
        answerD = "Die Drehzahl der Trommel in Umdrehungen pro Minute",
        correctAnswer = 1,
        explanation = "Die Kapazitaet einer Waschmaschine (z.B. 8 kg) gibt an, wie viel Kilogramm trockene Waesche maximal in die Trommel geluegt werden duerfen.",
        difficulty = 1,
        funFact = "Fuer eine Person reichen meist 5-6 kg, fuer eine Familie mit Kindern empfehlen Experten mindestens 8-9 kg Kapazitaet."
    ),

    // Question 38
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Akku-Kapazitaet in mAh' bei einem Smartphone?",
        answerA = "Die Lautstearke des Lautsprechers in Milliwatt",
        answerB = "Die Energiemenge, die der Akku speichern kann -- je hoeher, desto laenger haelt er",
        answerC = "Die maximale Ladegeschwindigkeit in Milliampere",
        answerD = "Die Anzahl der Ladezyklen bis zum Akkuaustausch",
        correctAnswer = 1,
        explanation = "mAh steht fuer Milliamperestunden -- es ist die Einheit fuer die Kapazitaet eines Akkus. Ein 5000-mAh-Akku haelt bei gleichem Verbrauch laenger als ein 3000-mAh-Akku.",
        difficulty = 1,
        funFact = "Das erste iPhone (2007) hatte einen 1400-mAh-Akku. Aktuelle Flaggschiff-Smartphones kommen oft auf 5000 mAh oder mehr."
    ),

    // Question 39
    Question(
        categoryId = 7,
        questionText = "Was ist eine Geschirrspuelmaschinen-Reinigertablette?",
        answerA = "Eine Tablette zum Reinigen des Wasserfilters",
        answerB = "Ein vorportioniertes Reinigungsmittel fuer den Geschirrspueler, das Fett und Speisereste loest",
        answerC = "Ein Mittel zur Entkalkung der Wasserleitungen",
        answerD = "Ein Duftstoff fuer die Spuelmaschine",
        correctAnswer = 1,
        explanation = "Geschirrspueler-Tabs enthalten Reinigungsmittel, Klarspueler und oft auch Salz in einer Tablette -- sie loesen Fett, Staerke und Eiweiss vom Geschirr.",
        difficulty = 1,
        funFact = "Moderne Geschirrspueler verbrauchen pro Spuelgang oft weniger Wasser als das Handabwaschen -- nur etwa 9-12 Liter statt bis zu 30 Liter."
    ),

    // Question 40
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert ein Inkjetdrucker (Tintenstrahldrucker)?",
        answerA = "Er verbrennt Tinte auf dem Papier mit einem Laser",
        answerB = "Er spritzt winzige Tintenttropfen durch Duesenkoepfe auf das Papier",
        answerC = "Er uebertraegt Farbpulver durch statische Aufladung",
        answerD = "Er druckt durch mechanischen Druck wie eine Schreibmaschine",
        correctAnswer = 1,
        explanation = "Tintenstrahldrucker spritzen praeziese Tintenttroepfchen aus winzigen Duesenkoepfen auf das Papier -- der Druckkopf bewegt sich dabei zeilenweise ueber das Blatt.",
        difficulty = 1,
        funFact = "Die Tintenttroepfchen eines Tintenstrahldruckers sind etwa 100-mal kleiner als ein menschliches Haar -- kleiner als ein Picometer."
    ),

    // Question 41
    Question(
        categoryId = 7,
        questionText = "Was ist soziales Engineering (Social Engineering) bei Betrugsversuchen?",
        answerA = "Das Bauen von sozialen Medien-Plattformen",
        answerB = "Die Manipulation von Menschen durch Tauschung oder Vertrauen, um an sensible Daten zu gelangen",
        answerC = "Eine Technik zur Verbesserung von Online-Communities",
        answerD = "Ein Verfahren zur Analyse sozialer Netzwerke",
        correctAnswer = 1,
        explanation = "Beim Social Engineering manipulieren Betrueger Menschen psychologisch -- z.B. durch vorgetaeuschte Autoritaet oder Freundlichkeit -- um Passwoerter oder Zugangsdaten zu erschleichen.",
        difficulty = 1,
        funFact = "Bekannte Hacker wie Kevin Mitnick sagen, Social Engineering sei einfacher als technisches Hacking -- ein Anruf reicht oft, um Mitarbeiter zur Herausgabe von Daten zu bewegen."
    ),

    // Question 42
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen Kopfhoerern und einem Headset?",
        answerA = "Ein Headset hat groessere Lautsprecher",
        answerB = "Ein Headset hat zusaetzlich ein Mikrofon fuer Sprachanrufe oder Videokonferenzen",
        answerC = "Kopfhoerer sind kabellos, Headsets haben immer ein Kabel",
        answerD = "Es gibt keinen Unterschied -- die Begriffe sind identisch",
        correctAnswer = 1,
        explanation = "Kopfhoerer geben nur Ton aus. Ein Headset hat zusaetzlich ein integriertes Mikrofon, damit man gleichzeitig sprechen und zuhoeren kann.",
        difficulty = 1,
        funFact = "Das erste kommerziell erfolgreiche Headset wurde in den 1960ern von Plantronics entwickelt -- es ermoeglichte Astronaut Gordon Cooper als erstem die freihaendige Kommunikation."
    ),

    // Question 43
    Question(
        categoryId = 7,
        questionText = "Was bedeutet es, wenn das WLAN-Symbol auf dem Smartphone grau statt blau/weiss ist?",
        answerA = "Das Smartphone ist mit einem 5G-Netz verbunden",
        answerB = "Das Smartphone ist nicht mit einem WLAN-Netzwerk verbunden",
        answerC = "Das WLAN-Signal ist besonders stark",
        answerD = "Der Datenschutzmodus ist aktiviert",
        correctAnswer = 1,
        explanation = "Ein graues WLAN-Symbol bedeutet, dass keine WLAN-Verbindung besteht -- das Geraet nutzt dann mobiles Internet oder hat gar keine Internetverbindung.",
        difficulty = 1,
        funFact = null
    ),

    // Question 44
    Question(
        categoryId = 7,
        questionText = "Was ist eine Druckerpatrone?",
        answerA = "Ein Schutzhuelle fuer einen Drucker beim Transport",
        answerB = "Ein auswechselbarer Behaelter mit Tinte, der in einem Tintenstrahldrucker eingesetzt wird",
        answerC = "Der Druckkopf des Laserdruckers",
        answerD = "Ein Speichermodul fuer Druckauftraege",
        correctAnswer = 1,
        explanation = "Eine Druckerpatrone (Tintenkartusche) ist ein kleiner, auswechselbarer Tintenbehael ter, der in einen Tintenstrahldrucker eingesetzt wird und Farbe zum Drucken liefert.",
        difficulty = 1,
        funFact = "Druckerhersteller verdienen oft mehr Geld mit dem Verkauf von Tintenpatronen als mit dem Verkauf der Drucker selbst -- das Razorblade-Modell."
    ),

    // Question 45
    Question(
        categoryId = 7,
        questionText = "Wofuer steht das 'S' in HTTPS?",
        answerA = "Speed (Geschwindigkeit)",
        answerB = "Secure (Sicher) -- die Verbindung ist verschluesselt",
        answerC = "Standard",
        answerD = "Server",
        correctAnswer = 1,
        explanation = "HTTPS steht fuer HyperText Transfer Protocol Secure. Das 'S' zeigt an, dass die Verbindung mit SSL/TLS verschluesselt ist und Daten sicher uebertragen werden.",
        difficulty = 1,
        funFact = "Ohne HTTPS konnten Angreifer fruehher in offenen WLAN-Netzwerken den gesamten Datenverkehr mitlesen -- das nennt man einen Man-in-the-Middle-Angriff."
    ),

    // Question 46
    Question(
        categoryId = 7,
        questionText = "Was ist eine Smartwatch?",
        answerA = "Eine besonders genaue analoge Armbanduhr",
        answerB = "Eine digitale Armbanduhr mit Computereinheit, die Schrittzaehler, Nachrichten und mehr anzeigt",
        answerC = "Eine Uhr, die sich selbst aufzieht",
        answerD = "Eine Uhr mit GPS zur reinen Standortbestimmung",
        correctAnswer = 1,
        explanation = "Eine Smartwatch ist eine digitale Armbanduhr mit kleinem Computer -- sie zeigt Nachrichten, trackt Fitness, misst den Herzschlag und kann Apps ausfuehren.",
        difficulty = 1,
        funFact = "Apple Watch ist die meistverkaufte Uhr der Welt -- Apple verkauft mehr Uhren pro Jahr als alle Schweizer Uhrmacher zusammen."
    ),

    // Question 47
    Question(
        categoryId = 7,
        questionText = "Warum sollte man Software-Updates immer zeitnah installieren?",
        answerA = "Damit der Computer schneller wird",
        answerB = "Weil Updates oft Sicherheitsluecken schliessen, die Hacker sonst ausnutzen koennten",
        answerC = "Damit neue Funktionen sofort verfuegbar sind",
        answerD = "Damit der Hersteller keine Supportkosten berechnet",
        correctAnswer = 1,
        explanation = "Viele Updates enthalten Sicherheits-Patches, die bekannte Sicherheitsluecken in Software schliessen. Hacker nutzen ungepatchte Luecken gezielt aus.",
        difficulty = 1,
        funFact = "Der WannaCry-Ransomware-Angriff 2017 befiel nur Computer mit veraltetem Windows -- auf Computern mit aktuellem Update-Stand hatte er keine Chance."
    ),

    // Question 48
    Question(
        categoryId = 7,
        questionText = "Was ist eine HDMI-Kabel?",
        answerA = "Ein Kabel zur Stromversorgung von Fernsehern",
        answerB = "Ein Kabel, das Bild und Ton in hoher Qualitaet von einer Quelle (z.B. Spielkonsole) zum Fernseher uebertraegt",
        answerC = "Ein Kabel fuer die Internetverbindung",
        answerD = "Ein Kabel zum Laden von Smartphones",
        correctAnswer = 1,
        explanation = "HDMI (High-Definition Multimedia Interface) ist ein Anschlussstandard, der digitales Bild und Ton in einem einzigen Kabel von Quellen wie Spielkonsolen oder PCs zum Fernseher uebertraegt.",
        difficulty = 1,
        funFact = "HDMI wurde 2002 einfuehrt und loeste damals viele einzelne Kabel (Scart, Chinch, Audiokabel) durch ein einziges digitales Kabel ab."
    ),

    // Question 49
    Question(
        categoryId = 7,
        questionText = "Was ist ein QR-Code?",
        answerA = "Ein Barcode auf Lebensmittelverpackungen fuer den Kassenscanner",
        answerB = "Ein zweidimensionaler Code, den man mit dem Smartphone scannen kann, um eine Webseite oder Information abzurufen",
        answerC = "Ein Sicherheitscode auf Kreditkarten",
        answerD = "Ein Passwort fuer WLAN-Netzwerke",
        correctAnswer = 1,
        explanation = "Ein QR-Code (Quick Response Code) ist ein schwarz-weisses Muster, das mit dem Smartphone gescannt werden kann -- es oeffnet dann einen Link, zeigt Text oder startet eine Aktion.",
        difficulty = 1,
        funFact = "QR-Codes wurden 1994 in Japan von der Firma Denso Wave erfunden, um Autoteile in Fabriken schneller zu verfolgen -- urspruenglich kein Konsumprodukt."
    ),

    // Question 50
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen WLAN und Bluetooth?",
        answerA = "WLAN ist schneller und hat groessere Reichweite fuer Internetverbindungen, Bluetooth ist fuer kurze Distanzen zwischen Geraeten",
        answerB = "Bluetooth ist schneller als WLAN",
        answerC = "WLAN wird nur fuer Telefonate genutzt, Bluetooth fuer das Internet",
        answerD = "Es gibt keinen Unterschied -- beide Technologien sind austauschbar",
        correctAnswer = 0,
        explanation = "WLAN verbindet Geraete mit dem Internet und hat eine Reichweite von ca. 30-100 Metern. Bluetooth verbindet Geraete direkt miteinander (z.B. Kopfhoerer) auf kurze Distanz (ca. 10 Meter).",
        difficulty = 1,
        funFact = "Sowohl WLAN als auch Bluetooth nutzen das 2,4-GHz-Funkband -- bei vielen Geraeten gleichzeitig koennen sie sich daher gegenseitig stoeren."
    )
)
