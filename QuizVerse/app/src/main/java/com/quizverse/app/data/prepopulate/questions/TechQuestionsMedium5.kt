package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsMedium5(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 7,
        questionText = "Welches Unternehmen uebernahm Apple im Jahr 2014 fuer rund 3 Milliarden US-Dollar, um seine Musik-Streaming-Ambitionen zu staerken?",
        answerA = "Spotify",
        answerB = "Pandora",
        answerC = "Beats Electronics",
        answerD = "SoundCloud",
        correctAnswer = 2,
        explanation = "Apple kaufte Beats Electronics im Jahr 2014 fuer ca. 3 Milliarden Dollar. Das war Apples groesste Uebernahme bis dahin. Aus dem Beats Music-Dienst entstand spaeter Apple Music.",
        difficulty = 2,
        funFact = "Dr. Dre wurde durch diesen Deal zum ersten Milliardaer im Hip-Hop – zumindest fuer einen kurzen Moment, bevor Steuern und Kosten abgezogen wurden."
    ),

    // Question 2
    Question(
        categoryId = 7,
        questionText = "Wie nennt man das Geschaeftsmodell, bei dem ein Dienst kostenlos angeboten wird, aber fuer erweiterte Funktionen bezahlt werden muss?",
        answerA = "Subscription-Modell",
        answerB = "Freemium-Modell",
        answerC = "Pay-per-Use-Modell",
        answerD = "Open-Source-Modell",
        correctAnswer = 1,
        explanation = "Das Freemium-Modell kombiniert 'Free' und 'Premium'. Der Basisdienst ist kostenlos, um viele Nutzer zu gewinnen. Erweiterte Funktionen kosten Geld. Spotify und Dropbox nutzen dieses Modell erfolgreich.",
        difficulty = 2,
        funFact = "Der Begriff 'Freemium' wurde 2006 vom Risikokapitalgeber Fred Wilson gepraegt, der ihn in einem Blogpost verwendete."
    ),

    // Question 3
    Question(
        categoryId = 7,
        questionText = "Welches Unternehmen entwickelte den Falcon-9-Raketentriebwerk und fuer welchen Auftrag wurde es urspruenglich konzipiert?",
        answerA = "Boeing, fuer die NASA-Mondmissionen",
        answerB = "SpaceX, fuer kommerzielle Satellitenstarts",
        answerC = "Blue Origin, fuer Weltraumtourismus",
        answerD = "Lockheed Martin, fuer Militaersatelliten",
        correctAnswer = 1,
        explanation = "SpaceX entwickelte die Falcon-9-Rakete als wiederverwendbares Traegersystem fuer kommerzielle Satellitenstarts. Das Triebwerk Merlin nutzt fluessigen Sauerstoff und Kerosin (RP-1) als Treibstoff.",
        difficulty = 2,
        funFact = "Die erste Stufe der Falcon 9 kann nach dem Start landen und wiederverwendet werden – dasselbe Exemplar flog bereits ueber 20 Mal."
    ),

    // Question 4
    Question(
        categoryId = 7,
        questionText = "Was ist Starlink und welches Unternehmen betreibt es?",
        answerA = "Ein Glasfasernetz von Google",
        answerB = "Ein Satelliten-Internetnetz von SpaceX",
        answerC = "Ein 5G-Netz von Amazon",
        answerD = "Ein Unterwasserkabelnetz von Meta",
        correctAnswer = 1,
        explanation = "Starlink ist ein kommerzielles Satelliten-Breitbandnetz von SpaceX. Es besteht aus Tausenden kleiner Satelliten in niedriger Erdumlaufbahn (LEO) und soll auch abgelegene Regionen mit Internet versorgen.",
        difficulty = 2,
        funFact = "Starlink-Satelliten sind so zahlreich, dass Astronomen sich ueber die Lichtverschmutzung des Nachthimmels beschweren – sie stoeren die Beobachtung des Weltalls."
    ),

    // Question 5
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'TSMC' in der Halbleiter-Industrie?",
        answerA = "Ein US-amerikanischer Chip-Designer",
        answerB = "Ein taiwanesischer Auftragsfertiger fuer Chips",
        answerC = "Ein koreanischer Speicherhersteller",
        answerD = "Ein deutsches Halbleiterunternehmen",
        correctAnswer = 1,
        explanation = "TSMC (Taiwan Semiconductor Manufacturing Company) ist der weltweit groesste Auftragsfertiger fuer Halbleiter. Das Unternehmen produziert Chips fuer Apple, AMD, NVIDIA und viele andere, aber entwirft sie nicht selbst.",
        difficulty = 2,
        funFact = "TSMC produziert rund 90% der weltweit fortschrittlichsten Chips unter 7 Nanometern – ohne dieses eine Unternehmen wuerden Smartphones, KI-Systeme und Autos weltweit zum Stillstand kommen."
    ),

    // Question 6
    Question(
        categoryId = 7,
        questionText = "Welche kryptografische Methode verwendet zwei verschiedene Schluessel – einen oeffentlichen und einen privaten?",
        answerA = "Symmetrische Verschluesselung",
        answerB = "Hashfunktion",
        answerC = "Asymmetrische Verschluesselung",
        answerD = "Steganografie",
        correctAnswer = 2,
        explanation = "Asymmetrische Verschluesselung (auch Public-Key-Kryptografie) nutzt ein Schluesselpaar: Der oeffentliche Schluessel verschluesselt Daten, der private Schluessel entschluesselt sie. RSA ist das bekannteste Verfahren.",
        difficulty = 2,
        funFact = "Das RSA-Verfahren wurde 1977 entwickelt – die Mathematik dahinter basiert darauf, dass es extrem schwer ist, sehr grosse Zahlen in ihre Primfaktoren zu zerlegen."
    ),

    // Question 7
    Question(
        categoryId = 7,
        questionText = "Was beschreibt der Begriff 'Chip-Mangel', der waehrend der COVID-19-Pandemie auftrat?",
        answerA = "Ein Mangel an Kupfer fuer Leiterbahnen",
        answerB = "Weltweit zu wenige produzierte Halbleiterchips fuer den Bedarf",
        answerC = "Ein Softwarefehler in Chip-Designprogrammen",
        answerD = "Ein Mangel an Chip-Entwicklern",
        correctAnswer = 1,
        explanation = "Der Chip-Mangel 2020-2022 entstand durch gleichzeitig explodierte Nachfrage (Homeoffice, Spielekonsolen) und unterbrochene Lieferketten. Autos, Smartphones und Elektronikartikel konnten nicht rechtzeitig produziert werden.",
        difficulty = 2,
        funFact = "Einige Automobilhersteller mussten fertige Autos ohne Chips auf Parkplaetzen lagern und konnten sie erst Monate spaeter mit nachgelieferten Chips fertigstellen."
    ),

    // Question 8
    Question(
        categoryId = 7,
        questionText = "Was ist das Hauptmerkmal des MP3-Audioformats im Vergleich zu unkomprimierten WAV-Dateien?",
        answerA = "MP3 hat eine hoehere Klangqualitaet",
        answerB = "MP3 komprimiert Audio durch Entfernung nicht wahrnehmbarer Toene",
        answerC = "MP3 unterstuetzt nur Mono-Audio",
        answerD = "MP3 speichert Audiodaten in binaerer Form ohne Verluste",
        correctAnswer = 1,
        explanation = "MP3 (MPEG-1 Audio Layer III) nutzt psychoakustische Modelle: Es entfernt Toene, die das menschliche Gehoer ohnehin nicht wahrnimmt (z.B. Frequenzen hinter lauten Toenen). Dadurch werden Dateien 10x kleiner bei akzeptabler Qualitaet.",
        difficulty = 2,
        funFact = "MP3 wurde am Fraunhofer-Institut in Erlangen entwickelt. Die Forscher verschenkten anfangs den Encoder – und loesten damit eine Revolution in der Musikindustrie aus."
    ),

    // Question 9
    Question(
        categoryId = 7,
        questionText = "Wofuer steht 'DAC' in der Audio-Technologie?",
        answerA = "Digital Audio Connector",
        answerB = "Dynamic Audio Compressor",
        answerC = "Digital-Analog-Converter",
        answerD = "Distributed Audio Channel",
        correctAnswer = 2,
        explanation = "Ein DAC (Digital-Analog-Converter, dt. Digital-Analog-Wandler) wandelt digitale Audiodaten (Binaerdaten) in analoge elektrische Signale um, die ein Lautsprecher oder Kopfhoerer in hoerbaren Schall umwandeln kann.",
        difficulty = 2,
        funFact = "Hochwertige externe DACs koennen mehrere Tausend Euro kosten – Audiophile streiten leidenschaftlich darueber, ob man den Unterschied zum eingebauten DAC eines Smartphones tatsaechlich hoert."
    ),

    // Question 10
    Question(
        categoryId = 7,
        questionText = "Was ist Dolby Atmos und wie unterscheidet es sich von herkoemmlichem Surround Sound?",
        answerA = "Es ist eine neue MP3-Kompressionsmethode",
        answerB = "Es ist objektbasiertes Audio, das Klang dreidimensional im Raum platziert",
        answerC = "Es ist ein Codec nur fuer Musikproduktion im Studio",
        answerD = "Es verdoppelt die Abtastrate von Audiodaten",
        correctAnswer = 1,
        explanation = "Dolby Atmos ist ein objektbasiertes Audiosystem. Statt fester Kanaele (5.1, 7.1) werden Klangobjekte mit 3D-Koordinaten gespeichert. Das System platziert Sounds dann dynamisch – auch ueber dem Zuhoerer via Deckenlautsprecher oder virtuell.",
        difficulty = 2,
        funFact = "Der erste Film mit Dolby Atmos war 'Brave' von Pixar im Jahr 2012 – er hatte 116 separate Lautsprecher im Premierenkino."
    ),

    // Question 11
    Question(
        categoryId = 7,
        questionText = "Welches Video-Codec-Format wurde von Google als Open-Source-Alternative zu H.264 entwickelt?",
        answerA = "HEVC (H.265)",
        answerB = "AV1",
        answerC = "VP9",
        answerD = "MPEG-4",
        correctAnswer = 2,
        explanation = "VP9 ist ein von Google entwickelter Open-Source-Videocodec, der als Konkurrenz zu H.264 entwickelt wurde und lizenzfrei ist. YouTube nutzt VP9 extensiv fuer 4K-Videos.",
        difficulty = 2,
        funFact = "VP9 wurde als Reaktion auf die hohen Lizenzgebuehren von H.264 entwickelt. Google macht VP9 kostenlos verfuegbar, was es besonders attraktiv fuer Webdienste macht."
    ),

    // Question 12
    Question(
        categoryId = 7,
        questionText = "Was ist Amazon Web Services (AWS) und welche Rolle spielt es im Amazons Geschaeftsmodell?",
        answerA = "Amazons Logistiksystem fuer Paketzustellung",
        answerB = "Cloud-Computing-Plattform, die Amazons profitabelster Bereich ist",
        answerC = "Amazons Werbeplattform fuer Online-Haendler",
        answerD = "Amazons Streaming-Dienst fuer Filme",
        correctAnswer = 1,
        explanation = "AWS ist Amazons Cloud-Computing-Sparte und trotz kleinerem Umsatzanteil der bei weitem profitabelste Bereich. AWS finanziert oft Amazons Verluste im E-Commerce und bietet Dienste wie Server, Datenbanken und KI-Tools an.",
        difficulty = 2,
        funFact = "AWS startete 2006 urspruenglich, weil Amazon seine eigene Server-Infrastruktur aufgebaut hatte und Kapazitaeten an externe Entwickler vermieten wollte – aus der Not wurde ein Milliardengeschaeft."
    ),

    // Question 13
    Question(
        categoryId = 7,
        questionText = "Was beschreibt 'Content Delivery Network' (CDN) in der Streaming-Architektur?",
        answerA = "Ein Algorithmus zur Videokompression",
        answerB = "Weltweit verteilte Server, die Inhalte nah beim Nutzer speichern",
        answerC = "Ein Bezahlsystem fuer Streaming-Dienste",
        answerD = "Ein Protokoll zur Videouebertragung",
        correctAnswer = 1,
        explanation = "Ein CDN besteht aus Servern, die weltweit verteilt sind und Inhalte wie Videos, Bilder und Webseiten zwischenspeichern (cachen). Der Nutzer bekommt Daten vom naechstgelegenen Server – das reduziert Ladezeiten und Serverbelastung.",
        difficulty = 2,
        funFact = "Netflix betreibt sein eigenes CDN namens 'Open Connect'. Es speichert populaere Inhalte direkt bei Internet-Providern – dadurch muessen 95% des Netflix-Traffics nie das oeffentliche Internet verlassen."
    ),

    // Question 14
    Question(
        categoryId = 7,
        questionText = "Welches Unternehmen uebernahm Instagram im Jahr 2012 und fuer wie viel?",
        answerA = "Google fuer 500 Millionen Dollar",
        answerB = "Facebook fuer 1 Milliarde Dollar",
        answerC = "Twitter fuer 750 Millionen Dollar",
        answerD = "Microsoft fuer 2 Milliarden Dollar",
        correctAnswer = 1,
        explanation = "Facebook (heute Meta) kaufte Instagram 2012 fuer ca. 1 Milliarde Dollar in bar und Aktien. Zum Zeitpunkt der Uebernahme hatte Instagram 13 Mitarbeiter und keinen Umsatz – heute wird die Plattform auf ueber 100 Milliarden Dollar geschaetzt.",
        difficulty = 2,
        funFact = "Die Gruender Kevin Systrom und Mike Krieger hatten Instagram erst 18 Monate vor der Uebernahme gegruendet – und erzielten damit eine der groessten Returns in der Startup-Geschichte."
    ),

    // Question 15
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen NAND-Flash und NOR-Flash in Speicherchips?",
        answerA = "NAND ist schneller beim Lesen, NOR beim Schreiben",
        answerB = "NAND ist guenstiger und dichter, NOR erlaubt direkten Zugriff auf einzelne Bytes",
        answerC = "NAND wird nur in SSDs verwendet, NOR nur in USB-Sticks",
        answerD = "Es gibt keinen Unterschied, die Namen sind Marketing",
        correctAnswer = 1,
        explanation = "NAND-Flash ist dichter und guenstiger, ideal fuer SSDs und USB-Sticks (sequentieller Zugriff). NOR-Flash ist langsamer aber erlaubt direkten wahlfreien Zugriff auf jeden Byte – ideal fuer Firmware-Speicher in Mikrocontrollern.",
        difficulty = 2,
        funFact = "Die meisten BIOS-Chips auf PC-Mainboards verwenden NOR-Flash, weil der Prozessor den Code direkt ausfuehren kann ohne ihn erst ins RAM laden zu muessen."
    ),

    // Question 16
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter dem Begriff 'Nanometer' (nm) bei Chip-Herstellungsprozessen?",
        answerA = "Die Groesse des gesamten Chips in Nanometern",
        answerB = "Die Dicke der Chipverpackung",
        answerC = "Die minimale Strukturbreite der Transistoren auf dem Chip",
        answerD = "Die Taktfrequenz des Prozessors in Nanometern",
        correctAnswer = 2,
        explanation = "Die Nanometer-Angabe bei Chips (z.B. 3nm, 5nm, 7nm) bezeichnet die minimale Transistorgitterstruktur. Kleinere Werte bedeuten kleinere Transistoren, mehr davon pro Flaeche, hoehere Leistung und geringerer Stromverbrauch.",
        difficulty = 2,
        funFact = "Moderne 3nm-Chips enthalten ueber 80 Milliarden Transistoren auf einer Flaeche kleiner als ein Fingernagel – ein menschliches Haar ist rund 30.000 Nanometer dick."
    ),

    // Question 17
    Question(
        categoryId = 7,
        questionText = "Welche Mission sendete den Perseverance-Rover zum Mars und von welchem Unternehmen wurde der Landungsassistent entwickelt?",
        answerA = "Mars 2020 Mission der NASA, Jetpack von SpaceX",
        answerB = "Mars 2020 Mission der NASA, Skycrane-System der NASA/JPL",
        answerC = "ExoMars der ESA, Airbag-System von Airbus",
        answerD = "Artemis der NASA, Landeplattform von Boeing",
        correctAnswer = 1,
        explanation = "Der Rover Perseverance landete 2021 als Teil der NASA Mars 2020 Mission. Das Skycrane-System des NASA Jet Propulsion Laboratory (JPL) senkte den Rover per Seilwinde sanft auf den Marsboden – eine spektakulaere Technik.",
        difficulty = 2,
        funFact = "Perseverance brachte auch den kleinen Helikopter Ingenuity mit – das erste Fluggeraet, das auf einem anderen Planeten flog. Ingenuity absolvierte ueber 70 Fluege, obwohl nur 5 geplant waren."
    ),

    // Question 18
    Question(
        categoryId = 7,
        questionText = "Was ist das Hauptziel von SpaceX's Starship-Raketensystem?",
        answerA = "Satelliten in niedrige Erdumlaufbahn zu bringen",
        answerB = "Menschen zu Mond und Mars zu transportieren und vollstaendig wiederverwendbar zu sein",
        answerC = "Hyperschall-Passagierfluge zwischen Ststaedten zu ermoeglichen",
        answerD = "Raumschrott aus der Erdumlaufbahn zu entfernen",
        correctAnswer = 1,
        explanation = "Starship ist SpaceX's supergrosse, vollstaendig wiederverwendbare Rakete. Sie ist fuer Mondlandungen (NASA Artemis), Mars-Missionen und den Transport grosser Nutzlasten konzipiert. Beide Stufen – Super Heavy und Starship – sollen wiederverwendbar sein.",
        difficulty = 2,
        funFact = "Starship ist mit ueber 120 Metern Hoehe die groesste Rakete der Geschichte – groesser als die Saturn V, die 1969 Menschen zum Mond brachte."
    ),

    // Question 19
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Adaptive Bitrate Streaming' (ABR) bei Videodiensten wie Netflix?",
        answerA = "Der Dienst waehlt automatisch den besten Audio-Codec",
        answerB = "Die Videoqualitaet wird in Echtzeit an die verfuegbare Bandbreite angepasst",
        answerC = "Das Video wird vorab vollstaendig heruntergeladen bevor es startet",
        answerD = "Der Server entscheidet, welche Nutzer bessere Qualitaet erhalten",
        correctAnswer = 1,
        explanation = "ABR teilt Videos in kurze Segmente auf, die in verschiedenen Qualitaetsstufen vorliegen. Das Abspielgeraet ueberwacht staendig die Netzwerkgeschwindigkeit und wechselt nahtlos zwischen Qualitaetsstufen – so gibt es kaum Puffer-Pausen.",
        difficulty = 2,
        funFact = "Netflix kodiert jeden Film in ueber 120 verschiedenen Versionen (verschiedene Aufloesungen und Bitraten) – alles damit dein Video bei schlechtem WLAN nicht einfriert."
    ),

    // Question 20
    Question(
        categoryId = 7,
        questionText = "Welches Verschluesselungsprotokoll ersetzt WEP und WPA bei WLAN-Netzwerken als aktuell sicherste Option?",
        answerA = "WPA2-TKIP",
        answerB = "WPA3",
        answerC = "AES-128",
        answerD = "SSL/TLS",
        correctAnswer = 1,
        explanation = "WPA3 (Wi-Fi Protected Access 3) ist der aktuelle WLAN-Sicherheitsstandard. Er nutzt SAE (Simultaneous Authentication of Equals) statt PSK, was Woerterbuch-Angriffe deutlich schwerer macht und Forward Secrecy bietet.",
        difficulty = 2,
        funFact = "WEP – das erste WLAN-Sicherheitsprotokoll aus dem Jahr 1997 – kann mit heutigen Tools in weniger als einer Minute geknackt werden. Es sollte niemals mehr verwendet werden."
    ),

    // Question 21
    Question(
        categoryId = 7,
        questionText = "Was ist Apples 'App Store'-Geschaeftsmodell und welcher Prozentsatz der App-Einnahmen geht an Apple?",
        answerA = "5% fuer Apps unter 1 Million Dollar Umsatz, 15% darueber",
        answerB = "30% fuer grosse Entwickler, 15% fuer kleine (unter 1 Mio. Dollar Umsatz)",
        answerC = "20% fuer alle Entwickler gleichermassen",
        answerD = "Kostenlos – Apple verdient nur an Hardware",
        correctAnswer = 1,
        explanation = "Apple erhebt standardmaessig 30% auf App-Kaeufe und In-App-Kaeufe. Seit 2021 zahlen kleine Entwickler (unter 1 Million Dollar Jahresumsatz) nur 15%. Diese 'Apple Tax' war Kernthema mehrerer Kartell-Verfahren weltweit.",
        difficulty = 2,
        funFact = "Der App Store erwirtschaftet jaehrlich ueber 25 Milliarden Dollar fuer Apple – und das ohne dass Apple selbst Apps entwickeln muss. Es ist einer der profitabelsten Marktplaetze der Welt."
    ),

    // Question 22
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter einem 'Hash' in der Kryptografie?",
        answerA = "Ein symmetrischer Verschluesselungsschluessel",
        answerB = "Eine Einweg-Pruefsumme fester Laenge aus beliebig langen Eingabedaten",
        answerC = "Ein Verfahren zum sicheren Schluesseltausch",
        answerD = "Eine Methode zur Datenkompression",
        correctAnswer = 1,
        explanation = "Eine kryptografische Hashfunktion (z.B. SHA-256) erzeugt aus beliebig langen Eingabedaten immer eine Ausgabe fester Laenge. Sie ist eine Einbahnstrasse: Man kann nicht zurueckrechnen. Minimale Eingabeaenderungen erzeugen komplett andere Hashes.",
        difficulty = 2,
        funFact = "Passwoerter werden nie im Klartext gespeichert – nur ihr Hash. Wenn du dein Passwort eingibst, wird der Hash berechnet und mit dem gespeicherten verglichen. Die Datenbank kennt dein Passwort nie."
    ),

    // Question 23
    Question(
        categoryId = 7,
        questionText = "Was ist das 'Metaverse' und welches Unternehmen hat sich offiziell danach umbenannt?",
        answerA = "Eine KI-Plattform, Microsoft hat sich umbenannt",
        answerB = "Eine virtuelle gemeinsame Welt, Facebook hat sich zu Meta umbenannt",
        answerC = "Ein Web3-Konzept, Twitter hat sich umbenannt",
        answerD = "Ein VR-Spielekonzept, Google hat sich umbenannt",
        correctAnswer = 1,
        explanation = "Das Metaverse beschreibt eine persistente, gemeinsame virtuelle 3D-Welt. Facebook-Gruender Mark Zuckerberg sah es als Zukunft des Internets und benannte das Unternehmen 2021 in Meta Platforms um, um diese Vision zu unterstreichen.",
        difficulty = 2,
        funFact = "Meta investierte bisher ueber 40 Milliarden Dollar ins Metaverse-Projekt – mit bisher sehr bescheidenem Erfolg. Der durchschnittliche Nutzer von 'Horizon Worlds' ist kaum messbar."
    ),

    // Question 24
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen lossy und lossless Audio-Kompression?",
        answerA = "Lossless-Dateien sind kleiner, lossy-Dateien sind groesser",
        answerB = "Lossy verwirft Audiodaten dauerhaft, lossless kann vollstaendig wiederhergestellt werden",
        answerC = "Lossy ist besser fuer Studios, lossless fuer den Endverbraucher",
        answerD = "Es gibt keinen qualitiven Unterschied bei modernen Formaten",
        correctAnswer = 1,
        explanation = "Bei lossy-Kompression (MP3, AAC, Opus) werden Audiodaten dauerhaft entfernt – die Originaldatei kann nie exakt wiederhergestellt werden. Lossless-Formate (FLAC, ALAC) komprimieren ohne Datenverlust: Die Datei ist kleiner, aber 100% originalgetreu.",
        difficulty = 2,
        funFact = "FLAC-Dateien (Free Lossless Audio Codec) sind typischerweise halb so gross wie unkomprimiertes WAV, klingen aber identisch – auf dem Papier und bei einem Blindtest fast immer auch im Ohr."
    ),

    // Question 25
    Question(
        categoryId = 7,
        questionText = "Was ist Googles primaeres Geschaeftsmodell und wie viel Prozent des Umsatzes kommt traditionell daraus?",
        answerA = "Cloud-Dienste, ca. 50%",
        answerB = "Online-Werbung, ca. 80%",
        answerC = "Hardware-Verkauf, ca. 60%",
        answerD = "Software-Lizenzen, ca. 70%",
        correctAnswer = 1,
        explanation = "Alphabet (Googles Mutterkonzern) verdient den Grossteil seines Umsatzes durch Online-Werbung – hauptsaechlich ueber Google Search und YouTube. Rund 80% des Umsatzes stammen aus Anzeigen, obwohl Cloud-Dienste zunehmend wichtiger werden.",
        difficulty = 2,
        funFact = "Jede Suche auf Google kostet Google Geld – Strom, Server, Bandbreite. Das Unternehmen verdient erst dann, wenn du auf eine Anzeige klickst. Millionen Suchanfragen erzeugen keinen Cent Einnahmen."
    ),

    // Question 26
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'LEO' in der Raumfahrt und welchen Vorteil bietet es gegenueber hoeheren Umlaufbahnen?",
        answerA = "Lunar Exploration Orbit, naehe zum Mond",
        answerB = "Low Earth Orbit, kurze Signallaufzeiten und einfachere Erreichbarkeit",
        answerC = "Long Energy Operation, laengere Batterielaufzeit fuer Satelliten",
        answerD = "Linked Exosphere Object, Verbindung zwischen Satellitengruppen",
        correctAnswer = 1,
        explanation = "LEO (Low Earth Orbit) bezeichnet Umlaufbahnen in 160-2000 km Hoehe. Die grosse Naehe zur Erde bedeutet sehr kurze Signallaufzeiten (Latenz ~20ms statt ~600ms bei GEO-Satelliten) und weniger Startenergie – ideal fuer Starlink-Internetsatelliten.",
        difficulty = 2,
        funFact = "Die Internationale Raumstation (ISS) fliegt in rund 400 km Hoehe im LEO und umkreist die Erde in nur 90 Minuten – Astronauten erleben dadurch 16 Sonnenaufgaenge pro Tag."
    ),

    // Question 27
    Question(
        categoryId = 7,
        questionText = "Was ist H.265 (HEVC) und warum ist es wichtig fuer 4K-Streaming?",
        answerA = "Ein Audioformat fuer Heimkino-Systeme",
        answerB = "Ein Videocodec, der doppelt so effizient komprimiert wie H.264",
        answerC = "Ein Displaystandard fuer 4K-Monitore",
        answerD = "Ein Netzwerkprotokoll fuer Videostreaming",
        correctAnswer = 1,
        explanation = "H.265 (High Efficiency Video Coding) ist der Nachfolger von H.264 und komprimiert Videos bei gleicher Qualitaet mit etwa halb so viel Datenvolumen. Das ist entscheidend fuer 4K-Streaming, da 4K sonst viermal mehr Bandbreite als 1080p benoetigen wuerde.",
        difficulty = 2,
        funFact = "Trotz der technischen Ueberlegenheit von H.265 setzte sich AV1 (von Google, Netflix & Co.) als kostenlose Alternative durch – H.265 scheiterte teilweise an fragmentierten und teuren Lizenzgebuehren."
    ),

    // Question 28
    Question(
        categoryId = 7,
        questionText = "Welches Microsoft-Produkt wurde 2016 fuer 26 Milliarden Dollar uebernommen und warum?",
        answerA = "Skype, fuer Videokonferenzen",
        answerB = "LinkedIn, fuer professionelles Netzwerken und Daten",
        answerC = "GitHub, fuer Code-Hosting",
        answerD = "Minecraft, fuer den Gaming-Markt",
        correctAnswer = 1,
        explanation = "Microsoft kaufte LinkedIn 2016 fuer 26,2 Milliarden Dollar – die groesste Uebernahme des Unternehmens bis zur Activision-Blizzard-Uebernahme. LinkedIn liefert Microsoft wertvolle Berufs- und Unternehmensdaten und Synergien mit Office 365.",
        difficulty = 2,
        funFact = "Microsoft hatte GitHub erst 2018 fuer 7,5 Milliarden Dollar gekauft – obwohl GitHub damals grosse Verluste machte. Microsoft wettete auf die Entwicklergemeinschaft und gewann."
    ),

    // Question 29
    Question(
        categoryId = 7,
        questionText = "Was ist SSL/TLS und wofuer wird es im Internet verwendet?",
        answerA = "Ein Protokoll zur Datenkompression beim Herunterladen",
        answerB = "Ein Verschluesselungsprotokoll fuer sichere Datenuebertragung zwischen Client und Server",
        answerC = "Eine Methode zur Authentifizierung von Nutzernamen",
        answerD = "Ein Standard fuer E-Mail-Verschluesselung",
        correctAnswer = 1,
        explanation = "TLS (Transport Layer Security, Vorgaenger SSL) verschluesselt die Verbindung zwischen deinem Browser und einem Webserver. Das kleine Schloss-Symbol in der Adressleiste (HTTPS) signalisiert eine aktive TLS-Verbindung.",
        difficulty = 2,
        funFact = "SSL 3.0 wurde 2015 offiziell fuer tot erklaert, nachdem der POODLE-Angriff demonstrierte, dass es fundamentale Schwachstellen hat. Heute ist TLS 1.3 der aktuelle Standard."
    ),

    // Question 30
    Question(
        categoryId = 7,
        questionText = "Was ist Amazons 'Alexa' technologisch gesehen und welche Kernkomponente macht sie funktionsfaehig?",
        answerA = "Ein Roboter mit physischer Praesenz",
        answerB = "Ein KI-Sprachassistent mit Cloud-basierter Sprachverarbeitung (NLU)",
        answerC = "Eine lokale Suchmaschine fuer Heimnetzwerke",
        answerD = "Eine reine Bluetooth-Steuereinheit fuer Smart Home",
        correctAnswer = 1,
        explanation = "Alexa ist Amazons KI-Sprachassistent. Wenn du sprichst, wird deine Stimme digitalisiert und zur AWS-Cloud gesendet. Dort analysiert Natural Language Understanding (NLU) den Befehl und schickt eine Antwort zurueck – alles in Millisekunden.",
        difficulty = 2,
        funFact = "Amazon hat das Wort 'Alexa' als Aktivierungswort gewaehlt, weil das 'x' in der Mitte selten in normalen Gespraechen vorkommt – das reduziert Fehlausloeser erheblich."
    ),

    // Question 31
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen RISC und CISC in Prozessor-Architekturen?",
        answerA = "RISC hat mehr Kerne, CISC hat weniger",
        answerB = "RISC nutzt einfache einheitliche Befehle, CISC hat komplexe spezialisierte Befehle",
        answerC = "RISC ist fuer Server, CISC ist fuer Smartphones",
        answerD = "RISC verwendet mehr RAM, CISC braucht weniger",
        correctAnswer = 1,
        explanation = "RISC (Reduced Instruction Set Computer) nutzt viele einfache, gleichgrosse Befehle die schnell ausgefuehrt werden. CISC (Complex Instruction Set Computer) hat weniger, aber komplexere Befehle. ARM-Chips (Smartphones) sind RISC, Intel x86-Chips CISC.",
        difficulty = 2,
        funFact = "Apples M-Chips basieren auf ARM (RISC) und schlagen Intel-Chips (CISC) bei gleichem Stromverbrauch oft deutlich – ein Grund warum Apple 2020 zu ARM wechselte."
    ),

    // Question 32
    Question(
        categoryId = 7,
        questionText = "Was beschreibt das Konzept 'Zero-Knowledge-Proof' in der Kryptografie?",
        answerA = "Eine Methode, bei der keine Daten uebertragen werden",
        answerB = "Ein Beweis, dass man ein Geheimnis kennt, ohne das Geheimnis selbst zu verraten",
        answerC = "Ein Algorithmus ohne Schluesselmaterial",
        answerD = "Eine Technik zur anonymen Datenuebertragung",
        correctAnswer = 1,
        explanation = "Zero-Knowledge Proofs erlauben es, jemandem zu beweisen, dass man ein Geheimnis (z.B. ein Passwort) kennt, ohne das Geheimnis selbst preiszugeben. Das klingt wie Magie, basiert aber auf mathematischen Protokollen und wird in Blockchain-Systemen genutzt.",
        difficulty = 2,
        funFact = "Eine einfache Analogie: Du kannst jemandem beweisen, dass du weisst, wo Waldo auf einem Wimmelbild ist, indem du ein Blatt Papier mit einem Loch nur ueber Waldo haelst – ohne den Rest des Bildes zu zeigen."
    ),

    // Question 33
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Sampling Rate' bei der Audio-Digitalisierung und welcher Wert gilt als CD-Qualitaet?",
        answerA = "Die Kompressionsrate eines Audio-Codecs, 128 kbps ist CD-Qualitaet",
        answerB = "Die Anzahl der Audiomessungen pro Sekunde, 44.100 Hz ist CD-Qualitaet",
        answerC = "Die Bittiefe einer Audioaufnahme, 16 Bit ist CD-Qualitaet",
        answerD = "Die Anzahl der Audiokanaele, Stereo ist CD-Qualitaet",
        correctAnswer = 1,
        explanation = "Die Sampling Rate (Abtastrate) gibt an, wie oft pro Sekunde der analoge Klang gemessen wird. 44.100 Hz bedeutet 44.100 Messungen pro Sekunde – der Standard auf Audio-CDs. Laut Nyquist-Theorem reicht das aus, um alle Frequenzen bis 22.050 Hz zu erfassen.",
        difficulty = 2,
        funFact = "Das menschliche Gehoer hoert nur bis ca. 20.000 Hz. Die 44.100 Hz-Abtastrate der CD wurde von Sony und Philips in den 1980ern gewaehlt – die 100 Hz Puffer geben etwas Spielraum fuer Filter-Ungenauigkeiten."
    ),

    // Question 34
    Question(
        categoryId = 7,
        questionText = "Was ist das Geschaeftsmodell hinter Microsofts Azure-Cloud-Plattform?",
        answerA = "Kostenlos fuer alle, finanziert durch Werbung",
        answerB = "Pay-as-you-go: Kunden zahlen nur fuer tatsaechlich genutzte Ressourcen",
        answerC = "Jährliche Pauschahlizenz fuer Unternehmen",
        answerD = "Kostenlos bis 100 Nutzer, danach teuer",
        correctAnswer = 1,
        explanation = "Azure (wie AWS und Google Cloud) nutzt ein nutzungsbasiertes Abrechnungsmodell. Unternehmen zahlen pro Stunde genutzter Rechenzeit, Gigabyte gespeicherter Daten oder verarbeiteter Anfragen – keine Vorabinvestitionen in Hardware noetig.",
        difficulty = 2,
        funFact = "Azure wurde 2010 gestartet und gilt als Microsofts groesste Wette der letzten Jahre – richtig. Azure waechst schneller als AWS in vielen Quartalen und ist mittlerweile ein Kerngeschaeft des Unternehmens."
    ),

    // Question 35
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Solid State Drive' (SSD) und worin liegt der Hauptvorteil gegenueber einer Festplatte (HDD)?",
        answerA = "SSDs sind guenstiger pro Gigabyte als HDDs",
        answerB = "SSDs haben keine beweglichen Teile und sind deshalb viel schneller und robuster",
        answerC = "SSDs haben eine groessere Speicherkapazitaet als HDDs",
        answerD = "SSDs benoetigen kein Betriebssystem zum Funktionieren",
        correctAnswer = 1,
        explanation = "SSDs speichern Daten in NAND-Flash-Speicher ohne mechanische Teile. HDDs nutzen rotierende Magnetscheiben und bewegliche Lesekoepfe. SSDs sind 10-100x schneller beim Lesen/Schreiben, stoSSfester und stiller – aber noch teurer pro Gigabyte.",
        difficulty = 2,
        funFact = "Eine moderne NVMe-SSD kann Daten mit ueber 7.000 MB/s uebertragen – eine Festplatte schafft typischerweise 100-200 MB/s. Das ist der Unterschied zwischen einer Schnellstrasse und einem Feldweg."
    ),

    // Question 36
    Question(
        categoryId = 7,
        questionText = "Was war das erste Produkt, das Apple ohne Steve Jobs nach seiner Rueckkehr in den Fokus rueckte und das Unternehmen rettete?",
        answerA = "Der iMac G3 in 1998",
        answerB = "Das iPhone im Jahr 2007",
        answerC = "Der iPod im Jahr 2001",
        answerD = "Das MacBook Pro im Jahr 2006",
        correctAnswer = 0,
        explanation = "Der iMac G3 (1998) war das erste grosse Produkt nach Jobs' Rueckkehr zu Apple. Mit seinem bunten, transparenten Design und einfacher Bedienung wurde er ein Bestseller und rettete das fast bankrotte Unternehmen. Der Slogan: 'Think Different'.",
        difficulty = 2,
        funFact = "Als Jobs zu Apple zurueckkehrte, hatte das Unternehmen nur noch 90 Tage bis zur Pleite. Microsoft investierte 150 Millionen Dollar – nicht aus Guete, sondern um einen Kartellmonopolvorwurf zu entkraeften."
    ),

    // Question 37
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Bit-Tiefe' (Bit Depth) bei der Audio-Digitalisierung?",
        answerA = "Die Anzahl der Audiofrequenzen, die aufgezeichnet werden",
        answerB = "Die Genauigkeit der Lautstaerkemessung bei jeder Abtastung",
        answerC = "Die Kompressionsrate des Audio-Codecs",
        answerD = "Die Anzahl der Audiokanaele",
        correctAnswer = 1,
        explanation = "Bit-Tiefe bestimmt, wie viele Lautstaerkewerte bei jeder Abtastung unterschieden werden koennen. 16 Bit (CD-Standard) erlaubt 65.536 verschiedene Lautstaerkestufen. 24 Bit (Studio) erlaubt 16,7 Millionen Stufen – das entspricht mehr Dynamikumfang.",
        difficulty = 2,
        funFact = "Der Unterschied zwischen dem leisesten und lautesten Ton heisst 'Dynamikumfang'. 16-Bit-Audio hat ~96 dB Dynamik – mehr als genuegend fuer die meisten Musik-Genres. Klassische Orchestermusik profitiert am meisten von hoeherer Bittiefe."
    ),

    // Question 38
    Question(
        categoryId = 7,
        questionText = "Welche Technologie nutzt SpaceX fuer die Landung der Falcon-9-Erststufe?",
        answerA = "Fallschirme, wie beim Apollo-Programm",
        answerB = "Gesteuerte Triebwerkslandung (propulsive landing) auf einer autonomen Drohneplattform",
        answerC = "Auffangnetze auf speziellen Schiffen",
        answerD = "Hyperschall-Bremsflossen und Wasseraufprall",
        correctAnswer = 1,
        explanation = "Die Falcon-9-Erststufe landet durch kontrollierte Triebwerkszuendungen. Grid Fins steuern die Flugbahn, dann zuenden die Haupttriebwerke erneut fuer die Landung – auf dem Startgelaende oder auf autonomen Drohnen-Landeplatten im Meer.",
        difficulty = 2,
        funFact = "SpaceX nennt seine Drohnen-Landeplattformen 'Of Course I Still Love You' und 'Just Read the Instructions' – benannt nach Raumschiffen aus dem Sci-Fi-Roman 'The Player of Games' von Iain M. Banks."
    ),

    // Question 39
    Question(
        categoryId = 7,
        questionText = "Was ist 'Diffie-Hellman-Schluessel-Austausch' und wozu wird es genutzt?",
        answerA = "Ein Verfahren zur sicheren Schluessel-Vereinbarung ueber einen unsicheren Kanal",
        answerB = "Eine Methode zur Passwort-Speicherung in Datenbanken",
        answerC = "Ein Standard fuer digitale Signaturen",
        answerD = "Ein Protokoll zur anonymen Kommunikation",
        correctAnswer = 0,
        explanation = "Diffie-Hellman (1976) loest das Problem: Wie vereinbaren zwei Parteien einen geheimen Schluessel, wenn jemand die gesamte Kommunikation mithoert? Durch mathematische Einwegfunktionen (diskrete Logarithmen) ist das moeglich – die Grundlage moderner HTTPS-Verschluesselung.",
        difficulty = 2,
        funFact = "Diffie und Hellman veroeffentlichten ihr Verfahren 1976 offen in einem Paper – eine radikale Idee. Davor glaubte man, Kryptografie muesse geheim gehalten werden. Sie revolutionierten das Feld."
    ),

    // Question 40
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Microservices-Architektur' in der Softwareentwicklung?",
        answerA = "Eine Architektur mit sehr kleinen Datenbanken",
        answerB = "Aufteilung einer Anwendung in viele kleine, unabhaengige Dienste mit eigener Aufgabe",
        answerC = "Software die auf Microcontrollern laeuft",
        answerD = "Eine Methode zur Datenkompression fuer APIs",
        correctAnswer = 1,
        explanation = "Microservices teilen eine Anwendung in kleine, unabhaengige Services auf, die jeweils eine spezifische Funktion erfuellen und ueber APIs kommunizieren. Netflix, Amazon und Spotify nutzen Microservices – sie ermoeglichen unabhaengiges Skalieren und Deployen.",
        difficulty = 2,
        funFact = "Netflix betreibt ueber 700 Microservices. Wenn du Netflix oeffnest, kommunizieren Dutzende dieser Services miteinander – fuer Empfehlungen, Login, Abrechnung, Video-Streaming, alles separat."
    ),

    // Question 41
    Question(
        categoryId = 7,
        questionText = "Was ist TSMC's Rolle bei der Produktion von Apples M-Chips?",
        answerA = "TSMC designed die Chips, Apple fertigt sie",
        answerB = "Apple designed die Chips, TSMC fertigt sie im Auftrag",
        answerC = "Beide Unternehmen entwickeln die Chips gemeinsam",
        answerD = "TSMC verkauft fertige Chips an Apple ohne Anpassung",
        correctAnswer = 1,
        explanation = "Apple's Teams entwerfen die M-Chips vollstaendig selbst (Architektur, Transistor-Layout, Funktionseinheiten). TSMC ist der Auftragsfertiger: Sie stellen die Chipfabriken und fertigen die Chips nach Apples Spezifikation auf ihren modernsten Prozessknoten.",
        difficulty = 2,
        funFact = "Ein einziger moderner Chip-Fertigungsauftrag kann eine Milliarde Dollar kosten. TSMC baut dafuer spezielle Produktionslinien – diese Fabriken (Fabs) kosten allein ueber 20 Milliarden Dollar im Bau."
    ),

    // Question 42
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Codec' und warum werden sie bei Video- und Audio-Streaming benoetigt?",
        answerA = "Ein Kabel-Standard fuer HDMI-Verbindungen",
        answerB = "Software/Hardware zur Kompression und Dekompression von Mediadaten",
        answerC = "Ein Protokoll fuer Streaming-Sicherheit",
        answerD = "Ein Format fuer Medien-Metadaten",
        correctAnswer = 1,
        explanation = "Codec (Coder/Decoder) komprimiert rohe Video- oder Audiodaten fuer die Uebertragung und dekomprimiert sie beim Abspielen. Ohne Codecs waere ein 4K-Video Gigabytes gross und nicht streambar – H.265 oder AV1 machen Streaming erst moeglich.",
        difficulty = 2,
        funFact = "Ein unkomprimiertes 4K-Video bei 60 FPS wuerde ueber 6 Gigabyte pro Minute benoetigen. Mit modernen Codecs passt dasselbe Video mit kaum wahrnehmbarem Qualitaetsverlust in rund 300 Megabyte."
    ),

    // Question 43
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Quantencomputern' und welche Art von Problemen koennten sie loesen?",
        answerA = "Extrem schnelle klassische Computer mit vielen Kernen",
        answerB = "Computer die Quantenmechanik nutzen und bestimmte Probleme exponentiell schneller loesen",
        answerC = "Computer die in Quantenphysik-Laboratorien eingesetzt werden",
        answerD = "Mini-Computer fuer quantenphysikalische Simulationen",
        correctAnswer = 1,
        explanation = "Quantencomputer nutzen Qubits statt Bits. Durch Superposition und Verschraenkung koennen sie bestimmte Probleme exponentiell schneller loesen als klassische Computer – z.B. Optimierungsprobleme oder das Faktorisieren grosser Zahlen (was RSA-Verschluesselung brechen wuerde).",
        difficulty = 2,
        funFact = "IBMs Quantencomputer kann bereits mit ueber 1.000 Qubits arbeiten – aber aktuelle Quantencomputer sind so fehleranfaellig, dass sie noch keine praktisch relevante Verschluesselung knacken koennen."
    ),

    // Question 44
    Question(
        categoryId = 7,
        questionText = "Was ist 'Googles Search Index' und wie wird er aufgebaut?",
        answerA = "Eine Datenbank aller registrierten Domainnamen",
        answerB = "Eine gigantische Datenbank von Webseiteninhalten, die von Crawler-Bots erstellt wird",
        answerC = "Ein Verzeichnis aller Google-Nutzer und ihrer Interessen",
        answerD = "Eine Datenbank von Werbetreibenden und ihren Budgets",
        correctAnswer = 1,
        explanation = "Googles Such-Index enthaelt Kopien von Milliarden Webseiten. Automatisierte 'Crawler' oder 'Spiders' besuchen staendig Webseiten, folgen Links und kopieren deren Inhalte. Diese werden indexiert (analysiert, gespeichert) damit Suchanfragen in Millisekunden beantwortet werden koennen.",
        difficulty = 2,
        funFact = "Googles Index umfasst ueber 100 Petabyte Daten – das entspricht Millionen von Festplatten. Und er wird staendig aktualisiert: Suchen werden teilweise in Echtzeit mit wenigen Minuten alten Seiteninhalten beantwortet."
    ),

    // Question 45
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen 'Geostationary Orbit' (GEO) und Low Earth Orbit (LEO) fuer Satelliten?",
        answerA = "GEO-Satelliten sind schneller, LEO-Satelliten sind langsamer",
        answerB = "GEO steht auf 35.786 km, dreht sich mit der Erde, hat aber hohe Latenz; LEO ist naeher und schneller",
        answerC = "GEO ist fuer Militaersatelliten, LEO fuer zivile",
        answerD = "GEO-Satelliten haben mehr Sendeleistung als LEO-Satelliten",
        correctAnswer = 1,
        explanation = "GEO-Satelliten (z.B. traditionelle TV-Satelliten) stehen auf 35.786 km und scheinen am Himmel stillzustehen – praktisch fuer Fernsehen, aber mit ~600ms Signalverzoegerung nicht gut fuer Internet. LEO-Satelliten (Starlink) sind auf 550 km, haben ~20ms Latenz, muessen aber in riesigen Schwaermen fliegen.",
        difficulty = 2,
        funFact = "Fuer GEO muss ein Satellit exakt 35.786 km hoch sein – auf dieser Hoehe ist die Umlaufzeit genau 24 Stunden und der Satellit bleibt ueber demselben Punkt der Erde. Diese magische Hoehe wurde 1945 von Arthur C. Clarke berechnet."
    ),

    // Question 46
    Question(
        categoryId = 7,
        questionText = "Welches Unternehmen hat WhatsApp erworben und wann wurde die Uebernahme abgeschlossen?",
        answerA = "Google, 2013",
        answerB = "Facebook (heute Meta), 2014",
        answerC = "Microsoft, 2015",
        answerD = "Amazon, 2016",
        correctAnswer = 1,
        explanation = "Facebook kaufte WhatsApp im Jahr 2014 fuer ca. 19 Milliarden Dollar in bar und Aktien – eine der teuersten Tech-Uebernahmen der Geschichte. WhatsApp hatte damals 55 Mitarbeiter und rund 450 Millionen Nutzer.",
        difficulty = 2,
        funFact = "Der WhatsApp-Gruender Jan Koum wuchs in der Ukraine ohne Telefon auf und lebte zeitweise von Sozialhilfe. Der 19-Milliarden-Dollar-Deal unterzeichnete er vor dem Sozialamt, bei dem er als Jugendlicher angestanden hatte."
    ),

    // Question 47
    Question(
        categoryId = 7,
        questionText = "Was ist 'AES' und wofuer wird es in der Datenverschluesselung eingesetzt?",
        answerA = "Advanced Encryption Standard – symmetrischer Blockchiffre-Algorithmus",
        answerB = "Automated Encryption System – asymmetrisches Schluesselsystem",
        answerC = "Applied Encryption Service – Cloud-basierter Verschluesselungsdienst",
        answerD = "Adaptive Encryption Schema – dynamische Schluesselerzeugung",
        correctAnswer = 0,
        explanation = "AES (Advanced Encryption Standard) ist ein symmetrischer Blockverschluesselungsalgorithmus, der 2001 vom NIST als US-Standard etabliert wurde. Er nutzt Schluessel von 128, 192 oder 256 Bit und gilt heute als unknackbar bei korrekter Implementierung.",
        difficulty = 2,
        funFact = "Die Suche nach einem Nachfolger fuer DES (AES' Vorgaenger) war ein oeffentlicher internationaler Wettbewerb. Rijndael, entwickelt von zwei belgischen Kryptografen, gewann – und wurde AES."
    ),

    // Question 48
    Question(
        categoryId = 7,
        questionText = "Was ist 'HLS' (HTTP Live Streaming) und wer hat es entwickelt?",
        answerA = "Ein Streaming-Protokoll von Netflix fuer adaptive Videouebertragung",
        answerB = "Ein von Apple entwickeltes Streaming-Protokoll auf HTTP-Basis",
        answerC = "Ein Standard des W3C fuer Webbrowser-Streaming",
        answerD = "Ein Protokoll von YouTube fuer Live-Uebertragungen",
        correctAnswer = 1,
        explanation = "HLS (HTTP Live Streaming) wurde von Apple 2009 entwickelt. Es teilt Videos in kurze Segmente (z.B. 6 Sekunden) auf, die per normalem HTTP geliefert werden. HLS unterstuetzt adaptive Bitraten und ist heute der weltweit meistgenutzte Streaming-Standard.",
        difficulty = 2,
        funFact = "HLS wurde urspruenglich nur fuer Safari und iPhone entwickelt. Heute nutzen es praktisch alle Streaming-Plattformen und Webbrowser – ironisch, da Apple HLS nie offen als Standard einbrachte."
    ),

    // Question 49
    Question(
        categoryId = 7,
        questionText = "Was ist das Besondere an Amazons Geschaeftsmodell mit Amazon Prime?",
        answerA = "Prime ist Amazons profitabelste Sparte wegen der Jahresgebuehren",
        answerB = "Prime bindet Kunden durch Vorteile und macht sie zu hoeheren Gesamtausgaben geneigt",
        answerC = "Prime ist kostenlos und finanziert sich nur durch Werbung",
        answerD = "Prime ist hauptsaechlich fuer Amazon Web Services Kunden gedacht",
        correctAnswer = 1,
        explanation = "Amazon Prime nutzt ein Flywheel-Prinzip: Die Jahresgebuehr finanziert Versand- und Streaming-Vorteile. Prime-Mitglieder geben laut Studien 2-4x mehr bei Amazon aus als Nicht-Mitglieder. Der Service schafft Kundenbindung und erhoeht den Customer Lifetime Value drastisch.",
        difficulty = 2,
        funFact = "Amazon berechnet, dass ein Prime-Mitglied im Durchschnitt 1.400 Dollar pro Jahr ausgibt – ein Nicht-Mitglied nur etwa 700 Dollar. Die Mitgliedsgebuehr bezahlt sich fuer Amazon also mehrfach."
    ),

    // Question 50
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen 'Deep Space' und erdnahen Raumfahrtmissionen technologisch gesehen?",
        answerA = "Deep Space Missionen brauchen mehr Astronauten an Bord",
        answerB = "Deep Space erfordert Kernenergie statt Solarenergie und lange Kommunikationsverzoegerungen",
        answerC = "Deep Space Missionen sind billiger wegen geringerer Schwerkraft",
        answerD = "Deep Space Sonden muessen nicht hitzeresistent sein",
        correctAnswer = 1,
        explanation = "Im tiefen Weltraum (z.B. Jupiter, Saturn) ist Sonnenlicht zu schwach fuer Solarenergie – Sonden wie Voyager oder Cassini nutzen Radioisotopengeneratoren (RTG). Ausserdem dauert eine Funknachricht zum Jupiter bis zu 50 Minuten – Echtzeit-Steuerung ist unmoeglich.",
        difficulty = 2,
        funFact = "Voyager 1 ist das am weitesten entfernte von Menschen gebaute Objekt – ueber 23 Milliarden Kilometer entfernt. Ein Signal braucht heute ueber 22 Stunden um dorthin zu gelangen. Es laeuft auf Technik aus den 1970ern."
    )

)
