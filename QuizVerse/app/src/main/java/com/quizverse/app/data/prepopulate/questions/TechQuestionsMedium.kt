package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsMedium(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 7,
        questionText = "Welches Dateisystem wird standardmaessig auf modernen Windows-Laufwerken verwendet?",
        answerA = "FAT32",
        answerB = "ext4",
        answerC = "NTFS",
        answerD = "APFS",
        correctAnswer = 2, // C
        explanation = "NTFS (New Technology File System) ist das Standard-Dateisystem fuer Windows seit Windows NT. Es unterstuetzt grosse Dateien, Berechtigungen und Datei-Verschluesselung.",
        difficulty = 2,
        funFact = "FAT32 hat eine maximale Dateigroesse von 4 GB — deshalb passen grosse ISO-Dateien nicht auf USB-Sticks mit FAT32."
    ),

    // Question 2
    Question(
        categoryId = 7,
        questionText = "Was ist die Hauptaufgabe eines DNS-Servers?",
        answerA = "IP-Adressen vergeben",
        answerB = "Domainnamen in IP-Adressen uebersetzen",
        answerC = "Daten verschluesseln",
        answerD = "Netzwerkverkehr filtern",
        correctAnswer = 1, // B
        explanation = "DNS steht fuer Domain Name System. Es uebersetzt lesbare Domainnamen wie 'google.com' in numerische IP-Adressen, die Computer im Netzwerk verwenden koennen.",
        difficulty = 2,
        funFact = "Ohne DNS muesste man sich fuer jede Website eine Zahlenfolge wie 142.250.185.46 merken — das Internet waere kaum nutzbar."
    ),

    // Question 3
    Question(
        categoryId = 7,
        questionText = "Was unterscheidet eine SSD von einer klassischen HDD?",
        answerA = "SSD hat mechanische Schreib-/Lesekoepfe, HDD nicht",
        answerB = "SSD speichert Daten auf rotierenden Magnetscheiben",
        answerC = "SSD verwendet Flash-Speicher ohne bewegliche Teile",
        answerD = "SSD kann nur gelesen, nicht beschrieben werden",
        correctAnswer = 2, // C
        explanation = "SSDs (Solid State Drives) speichern Daten in Flash-Speicherchips ohne mechanische Teile. HDDs nutzen rotierende Magnetscheiben und bewegliche Lesekoepfe.",
        difficulty = 2,
        funFact = "Die schnellsten NVMe-SSDs erreichen Lesegeschwindigkeiten von ueber 7.000 MB/s — klassische HDDs schaffen maximal ca. 200 MB/s."
    ),

    // Question 4
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Open Source'?",
        answerA = "Die Software ist kostenlos, aber der Quellcode ist geheim",
        answerB = "Der Quellcode ist oeffentlich zugaenglich und darf genutzt werden",
        answerC = "Die Software laeuft auf allen Betriebssystemen",
        answerD = "Die Software hat keinen Hersteller",
        correctAnswer = 1, // B
        explanation = "Open Source bedeutet, dass der Programmcode oeffentlich einsehbar ist. Je nach Lizenz darf er kopiert, veraendert und weiterverteilt werden.",
        difficulty = 2,
        funFact = "Linux, der Kern von Android, ist Open Source und laeuft auf ueber 3 Milliarden Geraeten weltweit — von Smartphones bis zu Supercomputern."
    ),

    // Question 5
    Question(
        categoryId = 7,
        questionText = "Was ist RAM in einem Computer?",
        answerA = "Langzeitspeicher fuer das Betriebssystem",
        answerB = "Der Prozessorkern fuer Berechnungen",
        answerC = "Fluechtiger Arbeitsspeicher fuer aktive Programme",
        answerD = "Eine Schnittstelle fuer externe Geraete",
        correctAnswer = 2, // C
        explanation = "RAM (Random Access Memory) ist der Arbeitsspeicher. Er speichert Daten und Programme, die gerade aktiv genutzt werden. Nach dem Ausschalten gehen alle RAM-Inhalte verloren.",
        difficulty = 2,
        funFact = "Der Name 'Random Access' bedeutet, dass auf jede Speicherzelle gleich schnell zugegriffen werden kann — egal wo sie sich befindet."
    ),

    // Question 6
    Question(
        categoryId = 7,
        questionText = "Welches Dateisystem wird standardmaessig auf macOS-Laufwerken verwendet?",
        answerA = "NTFS",
        answerB = "ext4",
        answerC = "HFS",
        answerD = "APFS",
        correctAnswer = 3, // D
        explanation = "APFS (Apple File System) ist seit macOS High Sierra (2017) das Standard-Dateisystem auf Apple-Geraeten. Es ist optimiert fuer Flash-Speicher und unterstuetzt Snapshots.",
        difficulty = 2,
        funFact = "APFS klonung von Dateien passiert in Nullzeit — der Speicher wird erst bei Aenderungen tatsaechlich dupliziert. Das nennt sich Copy-on-Write."
    ),

    // Question 7
    Question(
        categoryId = 7,
        questionText = "Was ist eine IP-Adresse?",
        answerA = "Ein verschluesseltes Passwort im Netzwerk",
        answerB = "Eine eindeutige Netzwerkadresse fuer Geraete",
        answerC = "Der Name eines WLAN-Netzwerks",
        answerD = "Die serielle Nummer einer Netzwerkkarte",
        correctAnswer = 1, // B
        explanation = "Eine IP-Adresse (Internet Protocol Address) ist eine eindeutige numerische Adresse, die jedem Geraet in einem Netzwerk zugewiesen wird, damit Datenpakete korrekt zugestellt werden.",
        difficulty = 2,
        funFact = "IPv4-Adressen haben ca. 4,3 Milliarden Kombinationen — die sind schon vergeben. Deshalb gibt es IPv6 mit 340 Sextillionen moeglichen Adressen."
    ),

    // Question 8
    Question(
        categoryId = 7,
        questionText = "Was macht ein Router in einem Heimnetzwerk?",
        answerA = "Er verschluesselt alle gesendeten Daten",
        answerB = "Er verwaltet den Datenverkehr zwischen Heimnetz und Internet",
        answerC = "Er speichert Webseiten lokal fuer schnelleren Zugriff",
        answerD = "Er verstaerkt nur das WLAN-Signal",
        correctAnswer = 1, // B
        explanation = "Ein Router verbindet das lokale Netzwerk (LAN) mit dem Internet (WAN) und leitet Datenpakete an die richtigen Geraete weiter. Er vergibt auch lokale IP-Adressen per DHCP.",
        difficulty = 2,
        funFact = "Der Begriff 'Router' kommt vom englischen 'route' (Weg) — er sucht den besten Weg fuer jedes Datenpaket durch das Netzwerk."
    ),

    // Question 9
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen 32-Bit und 64-Bit Prozessoren?",
        answerA = "64-Bit-Prozessoren sind physisch groesser",
        answerB = "64-Bit-Prozessoren koennen mehr RAM adressieren und groessere Datenmengen verarbeiten",
        answerC = "32-Bit-Prozessoren sind schneller bei Spielen",
        answerD = "64-Bit bedeutet, der Prozessor hat 64 Kerne",
        correctAnswer = 1, // B
        explanation = "64-Bit-Prozessoren koennen theoretisch bis zu 16 Exabyte RAM ansprechen. 32-Bit-Prozessoren sind auf 4 GB RAM begrenzt. Ausserdem koennen 64-Bit-CPUs groessere Zahlen in einem Schritt verarbeiten.",
        difficulty = 2,
        funFact = "Windows selbst braucht bei einer 32-Bit-Installation schon ca. 1 GB RAM — dann bleiben nur 3 GB fuer Programme. Das war ein grosses Problem in der Vista-Aera."
    ),

    // Question 10
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Verschluesselung' bei Daten?",
        answerA = "Daten werden komprimiert, um Speicherplatz zu sparen",
        answerB = "Daten werden in eine unleserliche Form umgewandelt, die nur mit dem richtigen Schluessel lesbar ist",
        answerC = "Daten werden auf mehrere Server verteilt",
        answerD = "Daten werden mit einem Passwort gesperrt, aber nicht veraendert",
        correctAnswer = 1, // B
        explanation = "Verschluesselung transformiert lesbare Daten (Klartext) in unlesbaren Geheimtext. Nur wer den richtigen kryptografischen Schluessel besitzt, kann die Daten wieder entschluesseln.",
        difficulty = 2,
        funFact = "Die Enigma-Maschine im Zweiten Weltkrieg war eine elektromechanische Verschluesselungsmaschine. Das Knacken ihres Codes durch Alan Turing verkuerzte den Krieg schaetzungsweise um 2 Jahre."
    ),

    // Question 11
    Question(
        categoryId = 7,
        questionText = "Welche Aussage ueber Linux ist korrekt?",
        answerA = "Linux ist ein proprietaeres System von IBM",
        answerB = "Linux ist ein Open-Source-Betriebssystemkern, der kostenlos genutzt werden kann",
        answerC = "Linux ist ein Betriebssystem exklusiv fuer Server",
        answerD = "Linux wurde von Microsoft entwickelt",
        correctAnswer = 1, // B
        explanation = "Linux ist ein quelloffener Betriebssystemkern (Kernel), den Linus Torvalds 1991 entwickelt hat. Er wird weltweit in Servern, Smartphones (Android), Supercomputern und Desktop-Systemen eingesetzt.",
        difficulty = 2,
        funFact = "Linus Torvalds benannte Linux nach sich selbst — urspruenglich wollte er es 'Freax' nennen, aber der FTP-Administrator aenderte den Namen zu 'Linux'."
    ),

    // Question 12
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen HTTP und HTTPS?",
        answerA = "HTTPS ist schneller als HTTP",
        answerB = "HTTPS verschluesselt die Datenverbindung, HTTP nicht",
        answerC = "HTTP ist moderner als HTTPS",
        answerD = "HTTPS erlaubt groessere Dateiuebertragungen",
        correctAnswer = 1, // B
        explanation = "HTTPS (HyperText Transfer Protocol Secure) verwendet SSL/TLS-Verschluesselung, um die Kommunikation zwischen Browser und Webserver abzusichern. HTTP uebertraegt Daten unverschluesselt.",
        difficulty = 2,
        funFact = "Das Schloss-Symbol im Browser zeigt HTTPS an. Seit 2018 markiert Chrome alle HTTP-Seiten als 'Nicht sicher' — das trieb die HTTPS-Verbreitung von 50% auf ueber 95%."
    ),

    // Question 13
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Kernel' in einem Betriebssystem?",
        answerA = "Das grafische Benutzerinterface des Systems",
        answerB = "Der zentrale Kern des Betriebssystems, der Hardware und Software verwaltet",
        answerC = "Ein Antivirenprogramm im Betriebssystem",
        answerD = "Der Bootloader beim Systemstart",
        correctAnswer = 1, // B
        explanation = "Der Kernel ist das Herztueck eines Betriebssystems. Er verwaltet Prozesse, Arbeitsspeicher, Dateisysteme und Hardwarezugriffe. Alle anderen Programmteile bauen auf dem Kernel auf.",
        difficulty = 2,
        funFact = "Der Linux-Kernel hat heute ueber 27 Millionen Codezeilen — und waechst taegliche mit Beitraegen von Hunderten Entwicklern aus Unternehmen wie Google, Intel und Samsung."
    ),

    // Question 14
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'DHCP' in einem Netzwerk?",
        answerA = "Ein Protokoll zur Datenverschluesselung",
        answerB = "Ein Dienst, der automatisch IP-Adressen an Geraete vergibt",
        answerC = "Eine Firewall-Technologie",
        answerD = "Ein Dateiuebertragungsprotokoll",
        correctAnswer = 1, // B
        explanation = "DHCP (Dynamic Host Configuration Protocol) weist Geraeten im Netzwerk automatisch IP-Adressen zu. Ohne DHCP muesste man jedes Geraet manuell konfigurieren.",
        difficulty = 2,
        funFact = "Wenn du dein WLAN-Passwort eingibst, verbindet sich dein Handy und bekommt per DHCP innerhalb von Millisekunden eine IP-Adresse zugewiesen — voellig automatisch."
    ),

    // Question 15
    Question(
        categoryId = 7,
        questionText = "Was ist eine GPU?",
        answerA = "Ein spezieller Speicherchip fuer Betriebssysteme",
        answerB = "Ein Prozessor, der speziell fuer Grafikberechnungen optimiert ist",
        answerC = "Eine Schnittstelle fuer externe Festplatten",
        answerD = "Der Hauptprozessor in einem Smartphone",
        correctAnswer = 1, // B
        explanation = "Die GPU (Graphics Processing Unit) ist ein spezialisierter Prozessor fuer Grafikberechnungen. Sie hat tausende kleinere Kerne, die parallele Berechnungen extrem effizient ausfuehren.",
        difficulty = 2,
        funFact = "GPUs werden heute nicht nur fuer Grafik genutzt, sondern auch fuer KI-Training. Eine moderne Nvidia H100-GPU fuehrt 3.958 Billionen Operationen pro Sekunde durch."
    ),

    // Question 16
    Question(
        categoryId = 7,
        questionText = "Was ist 'Objektorientierte Programmierung'?",
        answerA = "Programmieren mit moeglichst wenig Code",
        answerB = "Ein Paradigma, das Programme als Sammlung von Objekten mit Daten und Methoden modelliert",
        answerC = "Programmierung ohne Schleifen",
        answerD = "Ein Stil, bei dem alles in einer einzigen Datei steht",
        correctAnswer = 1, // B
        explanation = "Objektorientierte Programmierung (OOP) strukturiert Code als Objekte, die Daten (Attribute) und Verhalten (Methoden) enthalten. Konzepte wie Klassen, Vererbung und Kapselung gehoeren dazu.",
        difficulty = 2,
        funFact = "Die erste objektorientierte Sprache war Simula 67 aus Norwegen — sie wurde fuer Simulationen von Schiffsbewegungen entwickelt und inspirierte spaeter C++, Java und Python."
    ),

    // Question 17
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem Prozess und einem Thread?",
        answerA = "Prozesse sind schneller, Threads sind sicherer",
        answerB = "Ein Prozess ist ein laufendes Programm, Threads sind leichtgewichtige Ausfuehrungseinheiten darin",
        answerC = "Threads koennen nicht parallel ausgefuehrt werden",
        answerD = "Ein Prozess hat keinen eigenen Speicherbereich",
        correctAnswer = 1, // B
        explanation = "Ein Prozess ist eine unabhaengige Programminstanz mit eigenem Speicher. Threads teilen sich den Speicher eines Prozesses und ermoeglichen parallele Ausfuehrung innerhalb eines Programms.",
        difficulty = 2,
        funFact = "Dein Browser oeffnet fuer jede Registerkarte oft einen eigenen Prozess — so stuerzt eine fehlerhafte Seite nicht den ganzen Browser ab."
    ),

    // Question 18
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Taktfrequenz' einer CPU?",
        answerA = "Die Anzahl der Prozessorkerne",
        answerB = "Die Menge an Cache-Speicher im Prozessor",
        answerC = "Die Anzahl der Rechenoperationen pro Sekunde, gemessen in Hertz",
        answerD = "Die maximale Betriebstemperatur des Prozessors",
        correctAnswer = 2, // C
        explanation = "Die Taktfrequenz (Clockspeed) gibt an, wie viele Taktzyklen ein Prozessor pro Sekunde ausfuehrt. Bei 3 GHz sind das 3 Milliarden Zyklen pro Sekunde.",
        difficulty = 2,
        funFact = "In den 2000ern wetteten Experten, dass CPUs bis 2010 auf 10 GHz kommen wuerden. Stattdessen wurde der Weg der Multi-Core-Prozessoren eingeschlagen — mehr Kerne statt hoehere Taktrate."
    ),

    // Question 19
    Question(
        categoryId = 7,
        questionText = "Was ist ext4 in Linux?",
        answerA = "Ein Texteditor fuer die Kommandozeile",
        answerB = "Ein Netzwerkprotokoll",
        answerC = "Das Standard-Dateisystem des Linux-Betriebssystems",
        answerD = "Ein Kompressionsformat fuer Archive",
        correctAnswer = 2, // C
        explanation = "ext4 (Fourth Extended Filesystem) ist das am weitesten verbreitete Dateisystem fuer Linux. Es unterstuetzt Journaling fuer Datensicherheit und Dateien bis zu 16 Terabyte.",
        difficulty = 2,
        funFact = "ext4 wurde 2008 als Nachfolger von ext3 eingefuehrt. Es kann bis zu einer Milliarde Dateien in einem einzigen Verzeichnis speichern — praktisch unbegrenzt fuer normale Nutzung."
    ),

    // Question 20
    Question(
        categoryId = 7,
        questionText = "Was ist symmetrische Verschluesselung?",
        answerA = "Ein Verfahren mit zwei unterschiedlichen Schluesseln fuer Ver- und Entschluesselung",
        answerB = "Ein Verfahren, bei dem derselbe Schluessel fuer Ver- und Entschluesselung genutzt wird",
        answerC = "Eine Verschluesselung, die nur auf symmetrischen Daten funktioniert",
        answerD = "Verschluesselung ohne Schluessel",
        correctAnswer = 1, // B
        explanation = "Bei symmetrischer Verschluesselung nutzen Sender und Empfaenger denselben geheimen Schluessel. AES ist ein bekanntes symmetrisches Verfahren und gilt als sehr sicher und schnell.",
        difficulty = 2,
        funFact = "AES-256 ist so stark, dass selbst mit allen Computern der Welt das Knacken theoretisch laenger dauern wuerde als das Alter des Universums."
    ),

    // Question 21
    Question(
        categoryId = 7,
        questionText = "Was ist der Hauptunterschied zwischen macOS und Windows in der Dateipfad-Schreibweise?",
        answerA = "macOS nutzt Backslashes (\\), Windows Schraegestriche (/)",
        answerB = "macOS nutzt Schraegestriche (/), Windows Backslashes (\\)",
        answerC = "Beide Systeme nutzen identische Schreibweise",
        answerD = "macOS kennt keine Verzeichnisstruktur",
        correctAnswer = 1, // B
        explanation = "macOS und Linux verwenden den Schraegestrich (/) als Pfadtrennzeichen, z.B. /Users/name/Dokumente. Windows nutzt den Backslash (\\), z.B. C:\\Users\\name\\Dokumente.",
        difficulty = 2,
        funFact = "Der Backslash in Windows stammt aus MS-DOS-Zeiten. IBM und Microsoft waehlten ihn, weil der Schraegestrich schon fuer Kommandozeilenoptionen vergeben war."
    ),

    // Question 22
    Question(
        categoryId = 7,
        questionText = "Was ist eine Firewall?",
        answerA = "Ein Programm, das Viren aus dem Internet herunterlaed",
        answerB = "Ein System, das den Netzwerkverkehr nach Regeln filtert und unerwuenschte Verbindungen blockiert",
        answerC = "Ein Backup-System fuer wichtige Dateien",
        answerD = "Ein Programm zum Beschleunigen der Internetverbindung",
        correctAnswer = 1, // B
        explanation = "Eine Firewall ueberwacht den ein- und ausgehenden Netzwerkverkehr anhand festgelegter Regeln. Sie kann Hardware (im Router) oder Software (im Betriebssystem) sein.",
        difficulty = 2,
        funFact = "Der Begriff 'Firewall' stammt aus dem Bauwesen: Eine Brandschutzmauer soll verhindern, dass Feuer sich ausbreitet — genauso soll die Netzwerk-Firewall Schaeden eindaemmen."
    ),

    // Question 23
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Cache' in der Informatik?",
        answerA = "Ein langsamer Langzeitspeicher fuer Backups",
        answerB = "Ein schneller Zwischenspeicher, der haeufig benoetigte Daten bereithaelt",
        answerC = "Ein Netzwerkprotokoll fuer Streaming",
        answerD = "Ein verschluesselter Speicherbereich",
        correctAnswer = 1, // B
        explanation = "Cache ist ein schneller Pufferspeicher, der oft verwendete Daten nahebei haelt, um auf sie schneller zugreifen zu koennen. CPUs haben L1/L2/L3-Cache, Browser cachen Webseiten.",
        difficulty = 2,
        funFact = "L1-Cache einer CPU ist winzig (oft nur 32-64 KB), aber blitzschnell — er ist physisch direkt neben dem Prozessorkern und kann in einem einzigen Taktzyklus gelesen werden."
    ),

    // Question 24
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen TCP und UDP?",
        answerA = "TCP ist drahtlos, UDP ist leitungsgebunden",
        answerB = "TCP garantiert die Lieferung und Reihenfolge, UDP nicht",
        answerC = "UDP ist langsamer aber sicherer als TCP",
        answerD = "TCP kann nur Text uebertragen",
        correctAnswer = 1, // B
        explanation = "TCP (Transmission Control Protocol) stellt sicher, dass alle Datenpakete ankommen und in der richtigen Reihenfolge zusammengesetzt werden. UDP (User Datagram Protocol) schickt Pakete ohne Bestaetigung — schneller aber weniger zuverlaessig.",
        difficulty = 2,
        funFact = "Online-Spiele und Videostreaming nutzen oft UDP — ein fehlender Frame ist weniger schlimm als eine Verzoegerung. Downloads und Webseiten nutzen TCP, weil jedes Byte zaehlt."
    ),

    // Question 25
    Question(
        categoryId = 7,
        questionText = "Was ist 'Virtualisierung' in der IT?",
        answerA = "Das Erstellen von 3D-Modellen am Computer",
        answerB = "Das Ausfuehren mehrerer Betriebssysteme auf einer physischen Hardware gleichzeitig",
        answerC = "Die Darstellung von Daten in grafischer Form",
        answerD = "Ein Verfahren zur Datenkomprimierung",
        correctAnswer = 1, // B
        explanation = "Virtualisierung erlaubt es, mehrere virtuelle Maschinen (VMs) auf einem physischen Rechner zu betreiben. Jede VM verhaelt sich wie ein eigener Computer mit eigenem Betriebssystem.",
        difficulty = 2,
        funFact = "Cloud-Dienste wie AWS oder Azure basieren fast vollstaendig auf Virtualisierung. Ein einziger physischer Server kann Dutzende virtuelle Server fuer verschiedene Kunden gleichzeitig hosten."
    ),

    // Question 26
    Question(
        categoryId = 7,
        questionText = "Was ist asymmetrische Verschluesselung?",
        answerA = "Verschluesselung mit demselben Schluessel fuer alle Operationen",
        answerB = "Ein Verfahren mit einem oeffentlichen Schluessel zum Verschluesseln und einem privaten zum Entschluesseln",
        answerC = "Eine Verschluesselung, die nur fuer ungerade Dateigroessen funktioniert",
        answerD = "Verschluesselung ohne mathematische Grundlage",
        correctAnswer = 1, // B
        explanation = "Bei asymmetrischer Verschluesselung gibt es ein Schluesselpaar: Den oeffentlichen Schluessel (Public Key) darf jeder sehen. Nur der private Schluessel entschluesselt die Nachricht.",
        difficulty = 2,
        funFact = "HTTPS nutzt asymmetrische Verschluesselung nur am Anfang, um einen symmetrischen Sitzungsschluessel auszutauschen — denn symmetrische Verschluesselung ist viel schneller."
    ),

    // Question 27
    Question(
        categoryId = 7,
        questionText = "Was ist der Task-Manager (Windows) bzw. Aktivitaetsanzeige (macOS) hauptsaechlich?",
        answerA = "Ein Programmiertool fuer Entwickler",
        answerB = "Ein Werkzeug zur Ueberwachung und Verwaltung laufender Prozesse und Ressourcen",
        answerC = "Ein Backup-Programm fuer wichtige Systemdateien",
        answerD = "Ein Netzwerkdiagnosetool",
        correctAnswer = 1, // B
        explanation = "Der Task-Manager zeigt laufende Prozesse, CPU-, RAM- und Netzwerkauslastung an. Man kann damit haengende Programme beenden und den Systemzustand ueberwachen.",
        difficulty = 2,
        funFact = "Der Windows Task-Manager wurde 1996 mit Windows NT 4.0 eingefuehrt. Er kann mit Strg+Shift+Esc direkt geoeffnet werden — ohne den Umweg ueber Strg+Alt+Entf."
    ),

    // Question 28
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Kompilieren' in der Programmierung?",
        answerA = "Das Ausfuehren eines Programms Zeile fuer Zeile",
        answerB = "Das Uebersetzen von Quellcode in Maschinencode, den der Prozessor direkt ausfuehren kann",
        answerC = "Das Debuggen eines Programms auf Fehler",
        answerD = "Das Zusammenfuehren mehrerer Programme zu einem",
        correctAnswer = 1, // B
        explanation = "Ein Compiler uebersetzt menschenlesbaren Quellcode (z.B. C++ oder Java) in Maschinencode oder Bytecode. Das Ergebnis ist eine ausfuehrbare Datei.",
        difficulty = 2,
        funFact = "Grace Hopper entwickelte 1952 den ersten Compiler. Viele Kollegen glaubten nicht, dass ein Computer Code 'uebersetzen' koennte — sie hielten es fuer 'Betrug'."
    ),

    // Question 29
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Stack Overflow' in der Programmierung?",
        answerA = "Ein Online-Forum fuer Programmierer",
        answerB = "Ein Fehler, der auftritt, wenn der Aufrufstapel des Programms ueberlaeuft",
        answerC = "Ein Speicherleck im Heap-Bereich",
        answerD = "Ein Fehler beim Lesen von Dateien",
        correctAnswer = 1, // B
        explanation = "Ein Stack Overflow tritt auf, wenn zu viele Funktionsaufrufe auf dem Call-Stack gespeichert werden — oft durch unkontrollierte Rekursion. Das Programm stuerzt dann ab.",
        difficulty = 2,
        funFact = "Die Programmierseite Stack Overflow wurde nach diesem klassischen Programmierfehler benannt — und ist selbst die meistbesuchte Entwicklerseite der Welt mit ueber 21 Millionen Nutzern."
    ),

    // Question 30
    Question(
        categoryId = 7,
        questionText = "Was ist BIOS bzw. UEFI?",
        answerA = "Ein Antivirenprogramm im Betriebssystem",
        answerB = "Firmware, die beim Computerstart die Hardware initialisiert und das Betriebssystem laedt",
        answerC = "Ein Netzwerkprotokoll fuer lokale Verbindungen",
        answerD = "Ein Treiber fuer Grafikkarten",
        correctAnswer = 1, // B
        explanation = "BIOS (Basic Input/Output System) und sein moderner Nachfolger UEFI starten den Computer, pruefen die Hardware und laden dann das Betriebssystem. Sie sind auf einem Chip auf dem Mainboard gespeichert.",
        difficulty = 2,
        funFact = "UEFI kann direkt von einer Netzwerkverbindung booten, unterstuetzt Festplatten ueber 2 TB und hat oft eine grafische Benutzeroberflaeche mit Maussteuerung — alles Dinge, die BIOS nicht konnte."
    ),

    // Question 31
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Latenz' in Computernetzwerken?",
        answerA = "Die maximale Datenuebertragungsrate einer Verbindung",
        answerB = "Die Zeitverzoegerung, bis ein Datenpaket sein Ziel erreicht",
        answerC = "Die Anzahl gleichzeitiger Verbindungen eines Servers",
        answerD = "Der Energieverbrauch einer Netzwerkverbindung",
        correctAnswer = 1, // B
        explanation = "Latenz (Ping) beschreibt die Zeit vom Absenden eines Pakets bis zum Empfang der Antwort. Niedrige Latenz ist besonders bei Online-Spielen und Videoanrufen wichtig.",
        difficulty = 2,
        funFact = "Lichtwellen brauchen ca. 67 ms, um einmal um die Erde zu reisen. Das erklaert, warum Server-Standorte so wichtig sind — jeder Kilometer kostet Millisekunden."
    ),

    // Question 32
    Question(
        categoryId = 7,
        questionText = "Was ist eine MAC-Adresse?",
        answerA = "Eine IP-Adresse speziell fuer Apple-Geraete",
        answerB = "Die eindeutige Hardware-Kennung einer Netzwerkkarte",
        answerC = "Ein Verschluesselungsalgorithmus fuer Netzwerke",
        answerD = "Eine Adresse fuer drahtlose Netzwerke",
        correctAnswer = 1, // B
        explanation = "Die MAC-Adresse (Media Access Control) ist eine weltweit eindeutige 48-Bit-Adresse, die jeder Netzwerkkarte vom Hersteller zugewiesen wird. Sie funktioniert auf Schicht 2 des Netzwerkmodells.",
        difficulty = 2,
        funFact = "MAC-Adressen sind in sechs Gruppen aufgeteilt: Die ersten drei sind der Herstellercode (OUI). Damit kann man erkennen, ob ein Geraet von Apple, Samsung oder Intel stammt."
    ),

    // Question 33
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einer interpretierten und einer kompilierten Programmiersprache?",
        answerA = "Interpretierte Sprachen sind immer schneller",
        answerB = "Kompilierte Sprachen werden vorab in Maschinencode uebersetzt, interpretierte werden zur Laufzeit ausgefuehrt",
        answerC = "Interpretierte Sprachen koennen keinen Netzwerkzugriff machen",
        answerD = "Es gibt keinen funktionalen Unterschied",
        correctAnswer = 1, // B
        explanation = "Kompilierte Sprachen wie C++ werden vorab komplett uebersetzt. Interpretierte Sprachen wie Python werden Zeile fuer Zeile zur Laufzeit ausgefuehrt — oft flexibler, aber meist langsamer.",
        difficulty = 2,
        funFact = "Java ist beides: Der Quellcode wird in Bytecode kompiliert, der dann von der Java Virtual Machine (JVM) interpretiert wird. Das ermoeglicht plattformuebergreifende Ausfuehrung."
    ),

    // Question 34
    Question(
        categoryId = 7,
        questionText = "Was ist ein Subnetz (Subnet)?",
        answerA = "Ein drahtloses Netzwerk fuer Smartphones",
        answerB = "Ein logisch abgegrenzter Bereich innerhalb eines groesseren Netzwerks",
        answerC = "Ein Backup-Netzwerk fuer den Notfall",
        answerD = "Ein sicherer VPN-Tunnel",
        correctAnswer = 1, // B
        explanation = "Ein Subnetz teilt ein grosses IP-Netzwerk in kleinere Segmente auf. Das verbessert Organisation, Sicherheit und Performance, weil Broadcast-Verkehr begrenzt wird.",
        difficulty = 2,
        funFact = "Die Subnetzmaske 255.255.255.0 bedeutet, dass 254 Geraete im selben Subnetz sein koennen. Ein Unternehmen kann so sein Netzwerk in Abteilungen aufteilen — Buchhaltung, IT, Marketing etc."
    ),

    // Question 35
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Deadlock' in der Informatik?",
        answerA = "Ein Verfahren zum sicheren Loeschen von Dateien",
        answerB = "Eine Situation, in der zwei oder mehr Prozesse sich gegenseitig blockieren und nicht weiterlaufen koennen",
        answerC = "Ein Sicherheitsmechanismus gegen Viren",
        answerD = "Ein Fehler beim Netzwerkverbindungsaufbau",
        correctAnswer = 1, // B
        explanation = "Ein Deadlock entsteht, wenn Prozess A auf eine Ressource wartet, die Prozess B haelt, waehrend Prozess B auf eine Ressource wartet, die Prozess A haelt. Beide blockieren sich gegenseitig fuer immer.",
        difficulty = 2,
        funFact = "Deadlocks kommen auch im echten Leben vor: Zwei Autos stehen sich auf einer Einbahnstrasse gegenueber, keiner kann zurueck. Das nennen Informatiker eine 'zirkulaere Warteabhaengigkeit'."
    ),

    // Question 36
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Bandbreite' in einem Netzwerk?",
        answerA = "Die Verzoegerung einer Netzwerkverbindung",
        answerB = "Die maximale Datenmenge, die pro Zeiteinheit uebertragen werden kann",
        answerC = "Die Anzahl der Nutzer, die gleichzeitig verbunden sein koennen",
        answerD = "Die Frequenz des WLAN-Signals",
        correctAnswer = 1, // B
        explanation = "Bandbreite bezeichnet die maximale Datenuebertragungsrate einer Verbindung, gemessen in Bit pro Sekunde (bps, Mbps, Gbps). Hoehere Bandbreite bedeutet mehr Daten pro Sekunde.",
        difficulty = 2,
        funFact = "Das Atlantik-Unterseekabel CAM-4 hat eine Kapazitaet von 200 Terabit pro Sekunde — das entspricht dem Streamen von 24 Millionen HD-Filmen gleichzeitig."
    ),

    // Question 37
    Question(
        categoryId = 7,
        questionText = "Welchen Zweck hat die 'Paginierung' (Paging) in Betriebssystemen?",
        answerA = "Das Einteilen von Webseiten in Abschnitte",
        answerB = "Das Auslagern von Arbeitsspeicher auf die Festplatte, wenn der RAM voll ist",
        answerC = "Das Laden von Programmen in den Arbeitsspeicher",
        answerD = "Das Aufteilen der CPU-Zeit auf mehrere Prozesse",
        correctAnswer = 1, // B
        explanation = "Beim Paging lagert das Betriebssystem Speicherseiten, die gerade nicht benoetigt werden, auf die Festplatte aus (Auslagerungsdatei/Swap). So koennen Programme mehr RAM nutzen als physisch vorhanden ist.",
        difficulty = 2,
        funFact = "Wenn Windows stark paged, nennt man es 'Thrashing' — der Computer verbringt mehr Zeit mit Auslagern als mit echter Arbeit. Das fuehlst du, wenn ein alter PC mit 2 GB RAM sehr langsam wird."
    ),

    // Question 38
    Question(
        categoryId = 7,
        questionText = "Was ist der Zweck eines 'Treibers' (Device Driver)?",
        answerA = "Ein Treiber beschleunigt den Internetbrowser",
        answerB = "Ein Treiber ist Software, die das Betriebssystem mit einem Hardwaregeraet kommunizieren laesst",
        answerC = "Treiber sind Sicherheitsprogramme gegen Hacker",
        answerD = "Ein Treiber verwaltet Benutzerkonten",
        correctAnswer = 1, // B
        explanation = "Geraetetreiber sind spezialisierte Software, die als Schnittstelle zwischen dem Betriebssystem und einem Hardwaregeraet (Drucker, Grafikkarte, Tastatur) fungieren. Ohne Treiber koennte das Betriebssystem die Hardware nicht verstehen.",
        difficulty = 2,
        funFact = "Windows 11 hat ueber 50.000 eingebaute Treiber. Das ist einer der Hauptgruende, warum Windows-Installationen mehrere Gigabyte gross sind."
    ),

    // Question 39
    Question(
        categoryId = 7,
        questionText = "Was ist 'Version Control' (Versionskontrolle) in der Softwareentwicklung?",
        answerA = "Das Testen von Software auf verschiedenen Betriebssystemversionen",
        answerB = "Ein System, das Aenderungen am Code verfolgt und frueheren Zustand wiederherstellt",
        answerC = "Das Nummerieren von Softwareversionen fuer den Markt",
        answerD = "Ein automatisches Update-System fuer Programme",
        correctAnswer = 1, // B
        explanation = "Versionskontrollsysteme wie Git verfolgen jeden gespeicherten Codestand. Entwickler koennen sehen, wer was wann geaendert hat, Aenderungen rueckgaengig machen und parallel an Features arbeiten.",
        difficulty = 2,
        funFact = "Git wurde 2005 von Linus Torvalds in nur wenigen Wochen entwickelt, weil das bisher genutzte System BitKeeper fuer Linux-Entwickler unzugaenglich wurde. Git ist heute der weltweite Standard."
    ),

    // Question 40
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen 'public' und 'private' in der objektorientierten Programmierung?",
        answerA = "Public-Methoden sind langsamer als private",
        answerB = "Public-Elemente sind von aussen zugaenglich, private nur innerhalb der Klasse",
        answerC = "Private-Elemente koennen nicht veraendert werden",
        answerD = "Es gibt keinen Unterschied bei modernen Sprachen",
        correctAnswer = 1, // B
        explanation = "Zugriffsmodifikatoren steuern die Sichtbarkeit von Klassenelementen. 'public' macht sie von ueberall zugaenglich, 'private' begrenzt den Zugriff auf die eigene Klasse — ein Kernprinzip der Kapselung.",
        difficulty = 2,
        funFact = "Das Konzept der Kapselung in OOP kommt aus dem Ingenieurwesen: Ein Auto-Motor ist 'private' — du nutzt das Gaspedal (public interface), musst aber nicht wissen, wie der Motor intern funktioniert."
    ),

    // Question 41
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Hash' in der Informatik?",
        answerA = "Ein komprimiertes Archivformat",
        answerB = "Eine Einwegfunktion, die Daten beliebiger Laenge in einen fixen Wert umwandelt",
        answerC = "Ein verschluesselter Kommunikationskanal",
        answerD = "Eine Datenbankstruktur fuer schnelle Suche",
        correctAnswer = 1, // B
        explanation = "Eine Hashfunktion berechnet aus beliebigen Eingabedaten einen fixen Ausgabewert (Hash). Gleiche Eingaben ergeben immer den gleichen Hash. Kleine Aenderungen in der Eingabe veraendern den Hash komplett.",
        difficulty = 2,
        funFact = "Passwoerter werden nie direkt gespeichert, sondern als Hashes. Wenn du dein Passwort eingibst, wird der Hash verglichen. Deshalb kann niemand — nicht mal der Betreiber — dein Passwort im Klartext sehen."
    ),

    // Question 42
    Question(
        categoryId = 7,
        questionText = "Was unterscheidet eine 'while'-Schleife von einer 'for'-Schleife?",
        answerA = "'while'-Schleifen koennen keine Zahlen zaehlen",
        answerB = "'for'-Schleifen koennen keine Bedingungen pruefen",
        answerC = "'while' laeuft solange eine Bedingung wahr ist, 'for' iteriert meist ueber eine bekannte Anzahl",
        answerD = "Es gibt keinen semantischen Unterschied",
        correctAnswer = 2, // C
        explanation = "Eine 'for'-Schleife wird haeufig verwendet, wenn die Anzahl der Iterationen bekannt ist. Eine 'while'-Schleife laeuft, solange eine Bedingung erfuellt ist — auch wenn die Anzahl unbekannt ist.",
        difficulty = 2,
        funFact = "Eine 'while(true)'-Schleife laeuft ewig — das ist kein Fehler, sondern ein Entwurfsmuster. Betriebssysteme nutzen sogenannte Event-Loops: eine Endlosschleife, die auf Benutzereingaben wartet."
    ),

    // Question 43
    Question(
        categoryId = 7,
        questionText = "Was ist ein Betriebssystem-Kernel-Update und warum ist es wichtig?",
        answerA = "Es aendert das Design der Benutzeroberflaeche",
        answerB = "Es aktualisiert Treiber fuer neue Grafikkarten",
        answerC = "Es schliesst Sicherheitsluecken und verbessert die Kernfunktionen des Systems",
        answerD = "Es installiert neue vorinstallierte Apps",
        correctAnswer = 2, // C
        explanation = "Kernel-Updates patchen Sicherheitsluecken im Kern des Betriebssystems, der mit direktem Hardware-Zugriff laeuft. Ein ungepatchter Kernel kann Angreifern vollstaendigen Systemzugriff ermoeglichen.",
        difficulty = 2,
        funFact = "Der Spectre- und Meltdown-Bug (2018) steckte im Hardware-Design moderner Prozessoren und wurde per Kernel-Update gepatcht — allerdings mit bis zu 30% Leistungsverlust als Nebenwirkung."
    ),

    // Question 44
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen 'Heap' und 'Stack' in der Programmierung?",
        answerA = "Heap ist schneller, Stack ist sicherer",
        answerB = "Stack ist ein geordneter Bereich fuer Funktionsaufrufe, Heap fuer dynamisch allokierten Speicher",
        answerC = "Heap wird automatisch verwaltet, Stack nie",
        answerD = "Stack ist groesser als Heap",
        correctAnswer = 1, // B
        explanation = "Der Stack speichert lokale Variablen und Funktionsaufrufe in einer geordneten LIFO-Struktur. Der Heap ist ein grosser freier Speicherbereich fuer dynamisch angelegte Objekte, die manuell oder per Garbage Collector verwaltet werden.",
        difficulty = 2,
        funFact = "In C und C++ muss der Heap-Speicher manuell mit free() freigegeben werden. Vergisst man das, entsteht ein Memory-Leak — das Programm verbraucht immer mehr RAM, bis das System abstuertzt."
    ),

    // Question 45
    Question(
        categoryId = 7,
        questionText = "Was ist VPN und wofuer wird es hauptsaechlich genutzt?",
        answerA = "Ein Virenscanner fuer Netzwerke",
        answerB = "Ein verschluesselter Tunnel, der Internetverbindungen sichert und den Standort verschleiert",
        answerC = "Eine Technologie zur Verdoppelung der Internetgeschwindigkeit",
        answerD = "Ein Backup-System fuer Cloud-Daten",
        correctAnswer = 1, // B
        explanation = "VPN (Virtual Private Network) erstellt einen verschluesselten Tunnel zwischen Geraet und VPN-Server. Der echte Standort wird verborgen, und der Datenverkehr ist fuer Dritte unleserlich.",
        difficulty = 2,
        funFact = "VPN wurde urspruenglich fuer Unternehmen entwickelt, damit Mitarbeiter sicher auf das Firmennetzwerk zugreifen koennen. Die Nutzung fuer Streaming und Privatsphare ist erst spaeter populaer geworden."
    ),

    // Question 46
    Question(
        categoryId = 7,
        questionText = "Was ist eine 'API' in der Softwareentwicklung?",
        answerA = "Eine Programmiersprache fuer Web-Entwicklung",
        answerB = "Eine definierte Schnittstelle, ueber die Programme miteinander kommunizieren",
        answerC = "Ein automatisches Programm-Update-System",
        answerD = "Ein Testrahmen fuer Software",
        correctAnswer = 1, // B
        explanation = "API (Application Programming Interface) ist eine Schnittstelle, die definiert, wie Software-Komponenten miteinander interagieren. Web-APIs erlauben Programmen, Dienste wie Google Maps oder Wetterdaten zu nutzen.",
        difficulty = 2,
        funFact = "Wenn du in einer App das Wetter siehst, holt die App die Daten per API von einem Wetterdienst — sie kennt das Wetter nicht selbst, sondern fragt einfach jemanden, der es weiss."
    ),

    // Question 47
    Question(
        categoryId = 7,
        questionText = "Was ist 'Garbage Collection' in der Programmierung?",
        answerA = "Das automatische Loeschen temporaerer Dateien",
        answerB = "Automatisches Freigeben von nicht mehr benutztem Speicher durch die Laufzeitumgebung",
        answerC = "Ein System zum Sortieren und Archivieren von Code",
        answerD = "Das Entfernen von doppeltem Code im Quelltext",
        correctAnswer = 1, // B
        explanation = "Garbage Collection (GC) ist ein automatischer Speicherverwaltungsprozess. Die Laufzeitumgebung erkennt Objekte, auf die kein Programm mehr zugreift, und gibt ihren Speicher frei. Java, Python und C# nutzen GC.",
        difficulty = 2,
        funFact = "John McCarthy entwickelte Garbage Collection 1959 fuer die Sprache LISP. Jahrzehnte lang galt es als 'zu langsam' fuer ernsthafte Anwendungen — heute ist es Standard in den meisten modernen Sprachen."
    ),

    // Question 48
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Bit' und 'Byte'?",
        answerA = "Bit ist groesser als Byte",
        answerB = "Ein Bit ist die kleinste Speichereinheit (0 oder 1), ein Byte sind 8 Bit",
        answerC = "Bit und Byte sind unterschiedliche Bezeichnungen fuer dieselbe Einheit",
        answerD = "Ein Byte ist die kleinste Einheit, ein Bit sind 8 Byte",
        correctAnswer = 1, // B
        explanation = "Ein Bit ist die kleinste digitale Informationseinheit und kann nur 0 oder 1 sein. Acht Bit bilden ein Byte, das 256 verschiedene Werte (0-255) annehmen kann. Speicher wird meist in Byte gemessen.",
        difficulty = 2,
        funFact = "Das kleine 'b' steht fuer Bit, das grosse 'B' fuer Byte. Internetspeeds werden in Mbit/s (Megabit) angegeben, Dateien in MB (Megabyte). 100 Mbit/s bedeutet also nur 12,5 MB/s Downloadgeschwindigkeit."
    ),

    // Question 49
    Question(
        categoryId = 7,
        questionText = "Was ist 'SSH' und wofuer wird es genutzt?",
        answerA = "Ein Protokoll zur Dateifreigabe in lokalen Netzwerken",
        answerB = "Ein verschluesseltes Protokoll fuer sicheren Remote-Zugriff auf Computer",
        answerC = "Ein Standard fuer drahtlose Netzwerkverschluesselung",
        answerD = "Eine Programmiersprache fuer Serverkonfigurationen",
        correctAnswer = 1, // B
        explanation = "SSH (Secure Shell) ermoeglicht den sicheren Fernzugriff auf Computer ueber ein Netzwerk. Alle Daten werden verschluesselt uebertragen. Es ersetzt das unsichere Telnet-Protokoll.",
        difficulty = 2,
        funFact = "SSH wurde 1995 von Tatu Ylönen entwickelt, nachdem sein Uni-Netzwerk gehackt wurde und Passwoerter im Klartext mitgelesen wurden. Er schrieb das Protokoll innerhalb weniger Monate."
    ),

    // Question 50
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen 'Compiler' und 'Interpreter'?",
        answerA = "Compiler sind nur fuer systemnahe Sprachen, Interpreter fuer Websprachen",
        answerB = "Ein Compiler uebersetzt das gesamte Programm vor der Ausfuehrung, ein Interpreter fuehrt den Code Zeile fuer Zeile aus",
        answerC = "Interpreter erzeugen schnelleren Code als Compiler",
        answerD = "Compiler koennen Fehler nicht finden, Interpreter schon",
        correctAnswer = 1, // B
        explanation = "Ein Compiler liest den gesamten Quellcode, uebersetzt ihn vollstaendig und erzeugt eine ausfuehrbare Datei. Ein Interpreter liest und fuehrt den Code zeilenweise zur Laufzeit aus — ohne vorherige vollstaendige Uebersetzung.",
        difficulty = 2,
        funFact = "Python ist interpretiert, C ist kompiliert. Deshalb kann ein C-Programm oft 10-100x schneller sein als dasselbe in Python — aber Python ist viel schneller zu schreiben und zu verstehen."
    )
)
