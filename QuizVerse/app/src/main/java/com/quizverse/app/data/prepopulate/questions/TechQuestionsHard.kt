package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsHard(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 7,
        questionText = "Welche Eigenschaft unterscheidet die Harvard-Architektur grundlegend von der Von-Neumann-Architektur?",
        answerA = "Harvard verwendet einen einzigen Bus fuer Befehle und Daten",
        answerB = "Harvard trennt physisch den Speicher fuer Befehle und Daten",
        answerC = "Harvard kennt keinen Akkumulator-Modus",
        answerD = "Harvard unterstuetzt kein Pipelining",
        correctAnswer = 1,
        explanation = "Die Harvard-Architektur besitzt getrennte Speichersysteme und Busse fuer Programmbefehle und Daten. Das erlaubt gleichzeitigen Zugriff auf Befehle und Daten, was den Von-Neumann-Flaschenhals vermeidet.",
        difficulty = 3,
        funFact = "Viele moderne CPUs nutzen intern eine modifizierte Harvard-Architektur (getrennte L1-Caches), praesentieren nach aussen aber eine Von-Neumann-Schnittstelle."
    ),

    // Question 2
    Question(
        categoryId = 7,
        questionText = "Was beschreibt der Begriff Von-Neumann-Flaschenhals?",
        answerA = "Die begrenzte Taktfrequenz des Prozessors",
        answerB = "Die beschraenkte Anzahl von CPU-Registern",
        answerC = "Den gemeinsamen Bus fuer Daten- und Befehlstransfer zwischen CPU und Speicher",
        answerD = "Die Limitierung durch den L2-Cache",
        correctAnswer = 2,
        explanation = "Da CPU und Speicher ueber denselben Bus kommunizieren, koennen Befehle und Daten nicht gleichzeitig uebertragen werden. Dieser serielle Engpass zwischen Prozessor und Hauptspeicher ist der Von-Neumann-Flaschenhals.",
        difficulty = 3,
        funFact = "John Backus, Erfinder von FORTRAN, bezeichnete den Von-Neumann-Flaschenhals 1977 in seiner Turing-Award-Rede als fundamentales Problem der Computertechnik."
    ),

    // Question 3
    Question(
        categoryId = 7,
        questionText = "In einer 5-stufigen Instruktions-Pipeline (IF, ID, EX, MEM, WB) — wie viele Takte dauert es, 8 Instruktionen vollstaendig auszufuehren, wenn es keine Hazards gibt?",
        answerA = "40 Takte",
        answerB = "12 Takte",
        answerC = "8 Takte",
        answerD = "13 Takte",
        correctAnswer = 1,
        explanation = "Mit einer k-stufigen Pipeline benoetigen n Instruktionen k + (n-1) Takte. Hier: 5 + (8-1) = 12 Takte. Die Pipeline fuellt sich in den ersten k Takten, danach wird pro Takt eine Instruktion fertig.",
        difficulty = 3,
        funFact = "Ohne Pipeline wuerden 8 Instruktionen x 5 Takte = 40 Takte benoetigen. Die Pipeline reduziert das auf 12 Takte — eine Beschleunigung um Faktor 3,33."
    ),

    // Question 4
    Question(
        categoryId = 7,
        questionText = "Was ist ein Data Hazard in einer CPU-Pipeline?",
        answerA = "Ein Fehler durch Speicherkorruption im RAM",
        answerB = "Eine Situation, in der eine Instruktion auf Daten wartet, die noch nicht berechnet wurden",
        answerC = "Ein Ueberhitzungsproblem des Datenpfades",
        answerD = "Ein Fehler bei der Branch-Prediction",
        correctAnswer = 1,
        explanation = "Ein Data Hazard tritt auf, wenn eine Instruktion Daten benoetigt, die eine fruehere Instruktion noch nicht in das Zielregister geschrieben hat (RAW: Read After Write). Die Pipeline muss dann stallen oder Forwarding nutzen.",
        difficulty = 3,
        funFact = "Modernes Out-of-Order-Execution loest Data Hazards durch Umordnung von Instruktionen — die CPU fuehrt Befehle in einer anderen Reihenfolge aus, als der Programmierer sie geschrieben hat."
    ),

    // Question 5
    Question(
        categoryId = 7,
        questionText = "Welche Schicht des OSI-Modells ist fuer das Routing zwischen Netzwerken zustaendig?",
        answerA = "Schicht 2 (Data Link Layer)",
        answerB = "Schicht 4 (Transport Layer)",
        answerC = "Schicht 3 (Network Layer)",
        answerD = "Schicht 5 (Session Layer)",
        correctAnswer = 2,
        explanation = "Der Network Layer (Schicht 3) behandelt die logische Adressierung (IP-Adressen) und das Routing von Paketen ueber verschiedene Netzwerke hinweg. Router arbeiten auf dieser Schicht.",
        difficulty = 3,
        funFact = "Der Data Link Layer (Schicht 2) arbeitet mit MAC-Adressen und ist nur innerhalb eines lokalen Netzwerksegments zustaendig — Switches operieren hier."
    ),

    // Question 6
    Question(
        categoryId = 7,
        questionText = "Was unterscheidet TCP vom UDP-Protokoll auf der Transportschicht?",
        answerA = "TCP verwendet IP-Adressen, UDP verwendet MAC-Adressen",
        answerB = "TCP garantiert geordnete und zuverlaessige Zustellung, UDP nicht",
        answerC = "UDP ist verschluesselt, TCP ist unverschluesselt",
        answerD = "TCP sendet Broadcasts, UDP nur Unicasts",
        correctAnswer = 1,
        explanation = "TCP ist verbindungsorientiert und garantiert durch Sequenznummern, Acknowledgements und Retransmission die vollstaendige und geordnete Zustellung. UDP ist verbindungslos und bietet keine dieser Garantien — dafuer ist es schneller.",
        difficulty = 3,
        funFact = "Echtzeitanwendungen wie Videospiele und Videokonferenzen nutzen bevorzugt UDP: Ein verlorenes Paket wird nicht nachgesendet, weil veraltete Daten wertloser sind als aktuelle."
    ),

    // Question 7
    Question(
        categoryId = 7,
        questionText = "Welches Verfahren nutzt HTTP/2 um mehrere Anfragen gleichzeitig ueber eine TCP-Verbindung zu senden?",
        answerA = "Connection Pooling",
        answerB = "Long Polling",
        answerC = "Multiplexing",
        answerD = "Pipelining ohne HOL-Blocking",
        correctAnswer = 2,
        explanation = "HTTP/2 nutzt Multiplexing: Mehrere Streams koennen gleichzeitig ueber eine einzige TCP-Verbindung laufen. Jeder Stream traegt eine eindeutige ID. Damit entfaellt der Head-of-Line Blocking von HTTP/1.1.",
        difficulty = 3,
        funFact = "HTTP/3 loest den verbliebenen HOL-Blocking auf TCP-Ebene, indem es QUIC statt TCP verwendet — QUIC basiert auf UDP und behandelt Paketverluste pro Stream unabhaengig."
    ),

    // Question 8
    Question(
        categoryId = 7,
        questionText = "Was passiert beim TCP-Drei-Wege-Handshake in der richtigen Reihenfolge?",
        answerA = "SYN -> ACK -> SYN-ACK",
        answerB = "SYN -> SYN-ACK -> ACK",
        answerC = "ACK -> SYN -> SYN-ACK",
        answerD = "SYN-ACK -> SYN -> ACK",
        correctAnswer = 1,
        explanation = "Client sendet SYN (Verbindungsanfrage), Server antwortet mit SYN-ACK (Bestaetigung und eigene Sequenznummer), Client bestaetigt mit ACK. Erst danach ist die Verbindung aufgebaut.",
        difficulty = 3,
        funFact = "Der TCP-Handshake kostet eine volle Round-Trip-Time bevor Daten fliessen. TLS 1.3 optimiert dies mit 0-RTT bei Wiederverbindungen, was das Latenzproblem erheblich reduziert."
    ),

    // Question 9
    Question(
        categoryId = 7,
        questionText = "Was beschreibt das WebSocket-Protokoll im Vergleich zu HTTP?",
        answerA = "WebSocket ist eine verschluesselte Version von HTTP",
        answerB = "WebSocket ermoeglicht bidirektionale Vollduplex-Kommunikation ueber eine einzige TCP-Verbindung",
        answerC = "WebSocket ersetzt TCP durch ein eigenes Transportprotokoll",
        answerD = "WebSocket ist nur fuer Datei-Uploads konzipiert",
        correctAnswer = 1,
        explanation = "WebSocket startet mit einem HTTP-Upgrade-Request und wechselt dann zu einem dauerhaften bidirektionalen Kanal. Server koennen damit aktiv Daten an Clients pushen, ohne dass der Client anfragen muss.",
        difficulty = 3,
        funFact = "WebSocket nutzt Port 80 (ws://) bzw. 443 (wss://) — dieselben Ports wie HTTP/HTTPS — um Firewall-Probleme zu umgehen."
    ),

    // Question 10
    Question(
        categoryId = 7,
        questionText = "Was ist CIDR in der Netzwerktechnik?",
        answerA = "Ein Verschluesselungsprotokoll fuer IP-Pakete",
        answerB = "Eine Methode zur flexiblen IP-Adressvergabe und -aggregation mit Praefix-Notation",
        answerC = "Ein Routing-Algorithmus fuer das Internet",
        answerD = "Ein Standard fuer WLAN-Sicherheit",
        correctAnswer = 1,
        explanation = "CIDR (Classless Inter-Domain Routing) ersetzt das alte Klassen-Adresssystem durch Praefix-Notation wie 192.168.1.0/24. Der Praefix gibt die Anzahl der Netzwerkbits an und ermoeglicht effiziente Adressverwaltung.",
        difficulty = 3,
        funFact = "Ein /24-Netz hat 256 Adressen (254 nutzbar), ein /16-Netz 65.536. Das Internet-Backbone nutzt CIDR-Aggregation, um die globale Routing-Tabelle auf rund 900.000 Eintraege zu begrenzen."
    ),

    // Question 11
    Question(
        categoryId = 7,
        questionText = "Welcher CPU-Scheduling-Algorithmus kann zum Starvation niedrigprioritaerer Prozesse fuehren?",
        answerA = "Round Robin",
        answerB = "First Come First Served (FCFS)",
        answerC = "Shortest Job First (SJF)",
        answerD = "Priority Scheduling ohne Aging",
        correctAnswer = 3,
        explanation = "Beim Priority Scheduling ohne Aging werden niedrigprioritaere Prozesse immer von hochprioritaereren verdraengt. Kommen staendig neue hochprioritaere Prozesse, warten niedrigprioritaere theoretisch ewig (Starvation).",
        difficulty = 3,
        funFact = "Das Aging-Verfahren loest das Problem: Mit der Zeit steigt die Prioritaet wartender Prozesse automatisch an, bis sie schliesslich ausfuehren duerfen."
    ),

    // Question 12
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen praeemptivem und nicht-praeemptivem Scheduling?",
        answerA = "Praeemptiv erlaubt dem Betriebssystem, einen laufenden Prozess zu unterbrechen; nicht-praeemptiv nicht",
        answerB = "Nicht-praeemptiv ist schneller, weil es weniger Context Switches hat",
        answerC = "Praeemptiv funktioniert nur in Single-Core-Systemen",
        answerD = "Nicht-praeemptiv garantiert hoehere Prioritaetstreue",
        correctAnswer = 0,
        explanation = "Bei praeemptivem Scheduling kann das OS jederzeit (z.B. bei Timer-Interrupt) die CPU einem anderen Prozess geben. Nicht-praeemptiv laesst den Prozess laufen, bis er freiwillig die CPU abgibt oder blockiert.",
        difficulty = 3,
        funFact = "Windows und Linux sind praeemptiv. Fruehe Systeme wie Windows 3.x nutzten kooperatives (nicht-praeemptives) Multitasking — ein haengender Prozess konnte das ganze System blockieren."
    ),

    // Question 13
    Question(
        categoryId = 7,
        questionText = "Was ist Thrashing in der Betriebssystem-Speicherverwaltung?",
        answerA = "Exzessive Fragmentierung des Dateisystems",
        answerB = "Uebertakten des RAM-Controllers",
        answerC = "Zustand, in dem das System mehr Zeit mit Paging verbringt als mit nuetzlicher Ausfuehrung",
        answerD = "Korruption des Seitentabellen-Eintrags",
        correctAnswer = 2,
        explanation = "Thrashing tritt auf, wenn der physische Speicher zu voll ist: Seiten werden staendig ein- und ausgelagert (Seitenfehler), weil das Working Set aller Prozesse den RAM uebersteigt. Die CPU-Auslastung bricht ein.",
        difficulty = 3,
        funFact = "Das Working-Set-Modell von Peter Denning (1968) loest Thrashing, indem nur Prozesse laufen, deren gesamtes Working Set in den RAM passt — andere werden voruebergehend komplett ausgelagert."
    ),

    // Question 14
    Question(
        categoryId = 7,
        questionText = "Welchen Vorteil bietet ein TLB (Translation Lookaside Buffer) in der Speicherverwaltung?",
        answerA = "Er komprimiert Seitentabellen um 50%",
        answerB = "Er speichert haeufig genutzte Adress-Uebersetzungen im schnellen Cache und vermeidet Speicherzugriffe",
        answerC = "Er verhindert Buffer-Overflow-Angriffe",
        answerD = "Er erhoecht die physische RAM-Kapazitaet",
        correctAnswer = 1,
        explanation = "Ohne TLB muss jede virtuelle Adresse durch mehrstufige Seitentabellen im RAM aufgeloest werden (mehrere Speicherzugriffe). Der TLB cached die zuletzt genutzten Uebersetzungen — bei einem Hit entfaellt der teure Tabellen-Zugriff.",
        difficulty = 3,
        funFact = "Moderne CPUs erzielen TLB-Hit-Raten von 99%+. Ein TLB-Miss kann 10-100 Taktzyklen Strafe bedeuten, weshalb die Groesse des TLB erhebliche Auswirkungen auf die Performance hat."
    ),

    // Question 15
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen interner und externer Fragmentierung bei der Speicherverwaltung?",
        answerA = "Interne Fragmentierung ist im Kernel, externe im Userspace",
        answerB = "Interne: ungenutzter Speicher innerhalb allokierter Bloecke; externe: freie Bloecke zu klein fuer neue Anfragen",
        answerC = "Externe Fragmentierung entsteht nur bei Seitenverwaltung, interne nur bei Segmenten",
        answerD = "Interne Fragmentierung betrifft den Heap, externe den Stack",
        correctAnswer = 1,
        explanation = "Interne Fragmentierung: Allokierter Block ist groesser als benoetigt — der Rest bleibt ungenutzt. Externe Fragmentierung: Genug Gesamtspeicher ist frei, aber nicht als zusammenhaengender Block verfuegbar.",
        difficulty = 3,
        funFact = "Seitenverwaltung eliminiert externe Fragmentierung (jede Seite ist gleich gross), erzeugt aber interne Fragmentierung: Die letzte Seite eines Prozesses ist oft nur teilweise belegt."
    ),

    // Question 16
    Question(
        categoryId = 7,
        questionText = "Was ist das Besondere am ext4-Journaling-Dateisystem?",
        answerA = "Es speichert alle Daten zweimal fuer Redundanz",
        answerB = "Es protokolliert geplante Aenderungen im Journal, bevor sie auf die Festplatte geschrieben werden",
        answerC = "Es nutzt ausschliesslich Flash-optimierte Algorithmen",
        answerD = "Es ist ein Copy-on-Write-Dateisystem",
        correctAnswer = 1,
        explanation = "ext4 schreibt zuerst die geplante Aenderung in das Journal (Write-Ahead-Log). Nach einem Absturz kann das System anhand des Journals feststellen, welche Operationen unvollstaendig waren und diese abschliessen oder rueckgaengig machen.",
        difficulty = 3,
        funFact = "ZFS und Btrfs nutzen Copy-on-Write statt Journaling: Geaenderte Daten werden nie ueberschrieben, sondern an neue Stellen geschrieben — das ermoeglicht atomare Snapshots und effizientes Rollback."
    ),

    // Question 17
    Question(
        categoryId = 7,
        questionText = "Welche Blockgroesse hat AES, unabhaengig von der Schluessellaenge?",
        answerA = "64 Bit",
        answerB = "256 Bit",
        answerC = "128 Bit",
        answerD = "512 Bit",
        correctAnswer = 2,
        explanation = "AES (Advanced Encryption Standard) verschluesselt immer 128-Bit-Bloecke. Die Schluessellaenge (128, 192 oder 256 Bit) beeinflusst die Anzahl der Runden (10, 12 oder 14), aber nicht die Blockgroesse.",
        difficulty = 3,
        funFact = "AES wurde 2001 vom NIST als Nachfolger von DES standardisiert. Der Algorithmus basiert auf dem Rijndael-Cipher der belgischen Kryptografen Joan Daemen und Vincent Rijmen."
    ),

    // Question 18
    Question(
        categoryId = 7,
        questionText = "Welches mathematische Problem liegt der Sicherheit von RSA zugrunde?",
        answerA = "Das diskrete Logarithmusproblem",
        answerB = "Die Schwierigkeit, grosse Zahlen in ihre Primfaktoren zu zerlegen",
        answerC = "Die NP-Vollstaendigkeit des Rucksackproblems",
        answerD = "Die Berechnung von elliptischen Kurven ueber endlichen Koerpern",
        correctAnswer = 1,
        explanation = "RSA-Verschluesselung setzt darauf, dass das Faktorisierungsproblem rechnerisch schwer ist: Das Produkt zweier grosser Primzahlen ist leicht zu berechnen, aber die Zerlegung des Produkts in die Primfaktoren dauert unpraktikabel lang.",
        difficulty = 3,
        funFact = "Ein Quantencomputer mit genuegend stabilen Qubits koennte RSA durch Shors Algorithmus in polynomialer Zeit brechen. Deshalb entwickelt das NIST Post-Quantum-Kryptografie-Standards (CRYSTALS-Kyber, CRYSTALS-Dilithium)."
    ),

    // Question 19
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen symmetrischer und asymmetrischer Verschluesselung?",
        answerA = "Symmetrisch ist immer unsicherer, weil der Schluessel kuerzer ist",
        answerB = "Symmetrisch nutzt denselben Schluessel zum Ver- und Entschluesseln; asymmetrisch ein Schluessel-Paar (oeffentlich/privat)",
        answerC = "Asymmetrisch kann nur Dateien, symmetrisch nur Netzwerkverkehr verschluesseln",
        answerD = "Symmetrisch ist 100x langsamer als asymmetrisch",
        correctAnswer = 1,
        explanation = "Symmetrische Kryptografie (AES, ChaCha20) nutzt einen gemeinsamen Schluessel — schnell, aber Schluesselaustausch ist das Problem. Asymmetrische (RSA, ECC) loest das Schluesselaustausch-Problem: Der oeffentliche Schluessel kann offen verteilt werden.",
        difficulty = 3,
        funFact = "HTTPS kombiniert beide: Asymmetrische Kryptografie (RSA/ECC) beim Handshake zum sicheren Austausch eines symmetrischen Session-Keys, danach AES/ChaCha20 fuer die schnelle Datenuebertragung."
    ),

    // Question 20
    Question(
        categoryId = 7,
        questionText = "Was ist ein kryptografischer Hash und welche Eigenschaft ist entscheidend fuer seine Sicherheit?",
        answerA = "Ein Hash ist ein verschluesselter Text; Sicherheit durch Schluessellaenge",
        answerB = "Eine Einwegfunktion mit Kollisionsresistenz: Aus dem Hash-Wert kann man die Eingabe nicht rekonstruieren",
        answerC = "Ein komprimiertes Abbild der Daten; Sicherheit durch Kompressionsrate",
        answerD = "Eine zyklische Pruefsumme; Sicherheit durch Pruefsummen-Laenge",
        correctAnswer = 1,
        explanation = "Kryptografische Hash-Funktionen wie SHA-256 sind Einwegfunktionen: Die Berechnung h(m) ist effizient, aber die Umkehrung praktisch unmoeglich. Zusaetzlich muss Kollisionsresistenz gelten: keine zwei verschiedenen Eingaben sollen denselben Hash erzeugen.",
        difficulty = 3,
        funFact = "MD5 gilt heute als kryptografisch gebrochen: 2004 wurden Kollisionen gefunden. SHA-1 wurde 2017 durch das SHAttered-Projekt des CWI Amsterdam praktisch kompromittiert — SHA-256 und SHA-3 gelten noch als sicher."
    ),

    // Question 21
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem CBC- und einem CTR-Betriebsmodus bei Blockchiffren?",
        answerA = "CBC ist sicherer, CTR ist fuer Streaming gedacht und identisch langsam",
        answerB = "CBC verkettet Bloecke seriell (kein paralleles Entschluesseln); CTR nutzt Zaehler und erlaubt parallele Verarbeitung",
        answerC = "CTR erfordert einen Initialisierungsvektor, CBC nicht",
        answerD = "CBC ist ein Stream-Cipher-Modus, CTR ein Block-Modus",
        correctAnswer = 1,
        explanation = "Im CBC-Modus haengt jeder verschluesselte Block vom vorherigen ab — Entschluesseln ist seriell. Im CTR-Modus wird ein Zaehler verschluesselt und per XOR mit dem Klartext verknuepft, was vollstaendig parallele Ver- und Entschluesselung ermoeglicht.",
        difficulty = 3,
        funFact = "Der GCM-Modus (Galois/Counter Mode) kombiniert CTR mit einem Authentifizierungscode (GHASH) und ist der Standardmodus fuer TLS 1.3 (AES-128-GCM) — schnell, parallel und gleichzeitig authentifiziert."
    ),

    // Question 22
    Question(
        categoryId = 7,
        questionText = "Was leistet ein Compiler in der Phase der lexikalischen Analyse?",
        answerA = "Er prueft die Semantik von Variablen-Deklarationen",
        answerB = "Er wandelt den Quelltext in eine Folge von Token (Bezeichner, Schluesselwoerter, Operatoren) um",
        answerC = "Er erzeugt den abstrakten Syntaxbaum (AST)",
        answerD = "Er optimiert die Zwischenrepraesentation",
        correctAnswer = 1,
        explanation = "Der Lexer (Scanner) liest den Zeichenstrom des Quelltexts und gruppiert ihn in bedeutungsvolle Einheiten: Token. Dabei werden Leerzeichen und Kommentare verworfen. Der Output ist ein Token-Strom fuer den Parser.",
        difficulty = 3,
        funFact = "Lexer werden oft mit endlichen Automaten implementiert, die durch regulaere Ausdruecke beschrieben werden. Werkzeuge wie Flex (C) oder ANTLR generieren Lexer automatisch aus Grammatik-Beschreibungen."
    ),

    // Question 23
    Question(
        categoryId = 7,
        questionText = "Was ist ein abstrakter Syntaxbaum (AST) im Compilerbau?",
        answerA = "Die maschinennahe Zwischendarstellung nach Optimierung",
        answerB = "Eine Baumstruktur, die die hierarchische syntaktische Struktur des Quellprogramms darstellt",
        answerC = "Der Kontrollflussgraph eines Programms",
        answerD = "Die Symboltabelle mit allen Bezeichnern",
        correctAnswer = 1,
        explanation = "Der AST ist die strukturierte Baumdarstellung des Quellcodes nach dem Parsing. Im Gegensatz zum Parse-Tree enthaelt der AST keine grammatikalischen Details, sondern nur semantisch relevante Knoten (Ausdruecke, Anweisungen, Deklarationen).",
        difficulty = 3,
        funFact = "Moderne IDEs wie IntelliJ IDEA und Visual Studio analysieren den AST des Codes in Echtzeit fuer Code-Vervollstaendigung, Refactoring und Fehlerhervorhebung — das Gleiche, was Compiler intern tun."
    ),

    // Question 24
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen LL- und LR-Parsern?",
        answerA = "LL liest von links nach rechts und leitet links ab; LR liest von links und reduziert rechts",
        answerB = "LL ist schneller fuer komplexe Grammatiken, LR fuer einfache",
        answerC = "LR-Parser koennen nur regulaere Sprachen parsen, LL kontextfreie",
        answerD = "LL nutzt Bottom-Up-Analyse, LR Top-Down-Analyse",
        correctAnswer = 0,
        explanation = "LL(k): Liest von links, verwendet Linksableitung, schaut k Token voraus (Top-Down). LR(k): Liest von links, erstellt Rechtsableitung rueckwaerts, sehr maechtig (Bottom-Up). LR-Parser koennen groessere Grammatikklassen verarbeiten.",
        difficulty = 3,
        funFact = "GCC und Clang nutzen handgeschriebene rekursiv-absteigende Parser (LL-aehnlich), obwohl LR theoretisch maechtiger ist — weil handgeschriebene Parser bessere Fehlermeldungen produzieren."
    ),

    // Question 25
    Question(
        categoryId = 7,
        questionText = "Was ist Static Single Assignment (SSA) Form und warum nutzen Compiler sie?",
        answerA = "Eine Technik, um alle Variablen als Konstanten zu deklarieren",
        answerB = "Eine Zwischendarstellung, in der jede Variable genau einmal definiert wird, was Optimierungen vereinfacht",
        answerC = "Ein Verfahren zur statischen Typpruefung",
        answerD = "Eine Methode zur Eliminierung rekursiver Funktionen",
        correctAnswer = 1,
        explanation = "In SSA-Form wird jede Variable exakt einmal zugewiesen. Bei Kontrollfluss-Zusammenfuehrungen werden Phi-Funktionen eingefuegt. Das macht Datenflusseigenschaften explizit und vereinfacht Optimierungen wie Constant Propagation und Dead Code Elimination erheblich.",
        difficulty = 3,
        funFact = "LLVM, GCC, JVM (HotSpot) und fast alle modernen Compiler-Backends nutzen SSA als interne Zwischenrepraesentation. Die Form wurde 1988 bei IBM entwickelt."
    ),

    // Question 26
    Question(
        categoryId = 7,
        questionText = "Was ist Cache Coherence in Multiprozessor-Systemen?",
        answerA = "Die Synchronisation der Taktfrequenzen aller CPU-Kerne",
        answerB = "Das Protokoll das sicherstellt, dass alle Prozessoren einen konsistenten Blick auf den Speicher haben",
        answerC = "Die Komprimierung von Cache-Zeilen um Platz zu sparen",
        answerD = "Der Algorithmus zur Auswahl des zu ersetzenden Cache-Eintrags",
        correctAnswer = 1,
        explanation = "Wenn mehrere CPUs eigene L1/L2-Caches haben und dieselbe Speicheradresse laden, muss ein Protokoll (z.B. MESI) sicherstellen, dass eine CPU-Schreiboperation in anderen Caches invalidiert wird — sonst lesen andere CPUs veraltete Werte.",
        difficulty = 3,
        funFact = "Das MESI-Protokoll kennt vier Zustaende pro Cache-Zeile: Modified (geaendert, nur in diesem Cache), Exclusive (ungeaendert, nur hier), Shared (mehrere Caches), Invalid (ungueltig). Intel nutzt MESIF, AMD MOESI — jeweils mit zusaetzlichen Zustaenden."
    ),

    // Question 27
    Question(
        categoryId = 7,
        questionText = "Was ist ASLR (Address Space Layout Randomization)?",
        answerA = "Ein Algorithmus zur Defragmentierung des virtuellen Adressraums",
        answerB = "Eine Sicherheitstechnik, die Stack, Heap und Libraries bei jedem Programmstart an zufaelligen Adressen laedt",
        answerC = "Ein Verfahren zur Beschleunigung von Seitenzugriffen",
        answerD = "Ein Protokoll zur Speicher-Synchronisation zwischen Prozessen",
        correctAnswer = 1,
        explanation = "ASLR randomisiert die Ladeadressen von Stack, Heap und Shared Libraries bei jedem Programmstart. Angreifer koennen damit keine festen Adressen in Exploits hardcoden — Return-to-libc-Angriffe werden erheblich erschwert.",
        difficulty = 3,
        funFact = "ASLR allein bietet 16-28 Bit Entropie auf 64-Bit-Systemen. Kombiniert mit Stack Canaries und DEP/NX-Bits (No-Execute) bildet es die Grundlage moderner Exploit-Mitigation."
    ),

    // Question 28
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem Mutex und einem Semaphor?",
        answerA = "Mutex ist fuer Netzwerksynchronisation, Semaphor fuer Thread-Synchronisation",
        answerB = "Ein Mutex hat Ownership (nur der Lock-Owner darf entsperren); ein Semaphor hat Zaehler ohne Ownership",
        answerC = "Semaphoren koennen nur zwischen Prozessen genutzt werden, Mutexe nur innerhalb eines Prozesses",
        answerD = "Mutex ist eine Hardwareloesung, Semaphor eine Softwareloesung",
        correctAnswer = 1,
        explanation = "Ein Mutex (Mutual Exclusion Lock) gehoert dem Thread der ihn gesperrt hat — nur dieser darf ihn freigeben. Ein Semaphor ist ein Zaehler: Jeder Thread darf wait() und signal() aufrufen, unabhaengig wer den Wert geaendert hat.",
        difficulty = 3,
        funFact = "Dijkstra entwickelte das Semaphor-Konzept 1965. Die Benennung P() (proberen = testen) und V() (verhogen = erhoehen) stammt aus dem Niederlaendischen."
    ),

    // Question 29
    Question(
        categoryId = 7,
        questionText = "Was sind die vier notwendigen Bedingungen fuer einen Deadlock (Coffman-Bedingungen)?",
        answerA = "Parallelitaet, Starvation, Livelock, Inversion",
        answerB = "Mutual Exclusion, Hold and Wait, No Preemption, Circular Wait",
        answerC = "Race Condition, Priority Inversion, Spinlock, Cache Thrashing",
        answerD = "Semaphor, Mutex, Monitor, Barrier",
        correctAnswer = 1,
        explanation = "Alle vier Coffman-Bedingungen muessen gleichzeitig gelten: (1) Mutual Exclusion: Ressource nicht teilbar. (2) Hold and Wait: Prozess haelt Ressourcen und wartet auf weitere. (3) No Preemption: Ressourcen nicht erzwingbar entziehbar. (4) Circular Wait: Zyklische Warte-Abhaengigkeit.",
        difficulty = 3,
        funFact = "Der Bankier-Algorithmus von Dijkstra vermeidet Deadlocks durch vorausschauende Ressourcenzuteilung — er genehmigt Anfragen nur, wenn danach ein sicherer Zustand garantiert werden kann."
    ),

    // Question 30
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem Prozess und einem Thread?",
        answerA = "Threads sind schwergewichtiger als Prozesse und haben eigenen Adressraum",
        answerB = "Ein Prozess hat eigenen Adressraum und Ressourcen; Threads innerhalb eines Prozesses teilen dessen Adressraum",
        answerC = "Prozesse koennen nicht kommunizieren, Threads schon",
        answerD = "Threads koennen nur sequentiell ausgefuehrt werden, Prozesse parallel",
        correctAnswer = 1,
        explanation = "Ein Prozess ist eine isolierte Ausfuehrungseinheit mit eigenem virtuellen Adressraum, eigenen Dateideskriptoren und Ressourcen. Threads laufen innerhalb eines Prozesses und teilen dessen Adressraum — was schnelle Kommunikation erlaubt, aber Race Conditions erzeugen kann.",
        difficulty = 3,
        funFact = "Das Erstellen eines neuen Prozesses (fork) kostet auf Linux typisch 100-200 Mikrosekunden; ein neuer Thread (pthread_create) nur 10-50 Mikrosekunden. Goroutines (Go) starten in Mikrosekunden mit nur 2 KB Stack."
    ),

    // Question 31
    Question(
        categoryId = 7,
        questionText = "Was ist Spectre und warum ist es schwer zu beheben?",
        answerA = "Ein Rootkit das den Master Boot Record ueberschreibt",
        answerB = "Eine Seitenkanalangriff-Klasse, die spekulativ ausgefuehrte Instruktionen und CPU-Cache-Timing ausnutzt",
        answerC = "Eine Denial-of-Service-Attacke auf Netzwerkprotokolle",
        answerD = "Ein Buffer-Overflow-Exploit im Windows-Kernel",
        correctAnswer = 1,
        explanation = "Spectre nutzt die spekulative Ausfuehrung moderner CPUs: Obwohl spekulative Ergebnisse verworfen werden, hinterlassen sie Spuren im Cache. Ein Angreifer misst Cache-Zugriffszeiten (Timing-Seitenkanal) und rekonstruiert daraus geheime Daten.",
        difficulty = 3,
        funFact = "Spectre und Meltdown (2018) betrafen fast alle modernen CPUs. Software-Mitigationen (KPTI, Retpoline) kosten 5-30% Performance. Vollstaendige Hardware-Fixes erfordern neue CPU-Designs — Intel veroeffentlichte 2021 erstmals Chips mit eingebautem Hardware-Schutz."
    ),

    // Question 32
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen Big-Endian und Little-Endian Byte-Reihenfolge?",
        answerA = "Big-Endian ist fuer 64-Bit-Systeme, Little-Endian fuer 32-Bit-Systeme",
        answerB = "Big-Endian speichert das hochwertige Byte zuerst; Little-Endian das niedrigwertige Byte zuerst",
        answerC = "Little-Endian ist die Netzwerk-Byte-Reihenfolge",
        answerD = "Big-Endian wird nur in ARM-Prozessoren verwendet",
        correctAnswer = 1,
        explanation = "Fuer den Wert 0x12345678: Big-Endian speichert 12 34 56 78 (Most Significant Byte zuerst); Little-Endian speichert 78 56 34 12. x86/x64-CPUs (Intel, AMD) nutzen Little-Endian, Netzwerkprotokolle nutzen standardmaessig Big-Endian.",
        difficulty = 3,
        funFact = "Die Begriffe stammen aus Gullivers Reisen von Jonathan Swift: In Liliput stritten zwei Fraktionen darueber, ob Eier am dicken oder duennen Ende aufzuschlagen seien. Danny Cohen uebernahm die Analogie 1980 fuer Computerarchitektur."
    ),

    // Question 33
    Question(
        categoryId = 7,
        questionText = "Was ist DHCP und welche vier Schritte umfasst der Lease-Vorgang?",
        answerA = "Ein DNS-Erweiterungsprotokoll; Query, Response, Update, Acknowledge",
        answerB = "Ein IP-Zuteilungsprotokoll; Discover, Offer, Request, Acknowledge",
        answerC = "Ein Routing-Protokoll; Hello, Update, Query, Reply",
        answerD = "Ein ARP-Erweiterungsprotokoll; Probe, Announce, Conflict, Defend",
        correctAnswer = 1,
        explanation = "DORA: Client sendet Broadcast-Discover, Server antwortet mit Offer (IP-Angebot), Client sendet Request (akzeptiert Angebot), Server bestaetigt mit Acknowledge. Danach hat der Client eine temporaere IP-Adresse (Lease).",
        difficulty = 3,
        funFact = "DHCP-Lease-Zeiten sind konfigurierbar: Heimrouter nutzen oft 24 Stunden, rechenzentrums-interne Systeme manchmal nur 60 Sekunden. Nach Ablauf der Haelfte der Lease-Zeit beginnt der Client automatisch die Verlaengerung."
    ),

    // Question 34
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen BGP und OSPF als Routing-Protokolle?",
        answerA = "BGP ist fuer lokale Netzwerke, OSPF fuer das Internet",
        answerB = "BGP ist ein Exterior Gateway Protocol fuer Inter-AS-Routing; OSPF ist ein Interior Gateway Protocol fuer Intra-AS-Routing",
        answerC = "OSPF skaliert besser als BGP fuer sehr grosse Netzwerke",
        answerD = "BGP nutzt Dijkstras Algorithmus, OSPF Bellman-Ford",
        correctAnswer = 1,
        explanation = "OSPF (Open Shortest Path First) laeuft innerhalb eines Autonomen Systems (AS) und nutzt Dijkstras Algorithmus auf einer vollstaendigen Topologiekarte. BGP (Border Gateway Protocol) verbindet verschiedene AS miteinander und trifft Policy-basierte Routing-Entscheidungen.",
        difficulty = 3,
        funFact = "Das gesamte Internet-Routing basiert auf BGP zwischen ca. 74.000 autonomen Systemen. BGP-Fehlkonfigurationen koennen massive Ausfaelle verursachen: 2010 leitete ein chinesischer ISP versehentlich ca. 15% des Internet-Traffics ueber China um."
    ),

    // Question 35
    Question(
        categoryId = 7,
        questionText = "Was leistet ein Garbage Collector mit Mark-and-Sweep-Algorithmus?",
        answerA = "Er kompaktiert den Heap und loescht doppelte Objekte",
        answerB = "Er markiert alle erreichbaren Objekte vom Root-Set aus, dann gibt er alle nicht-markierten Objekte als Speicher frei",
        answerC = "Er zaehlt Referenzen auf Objekte und loescht solche mit Zaehler Null sofort",
        answerD = "Er verschiebt alle lebenden Objekte in eine neue Speicherregion",
        correctAnswer = 1,
        explanation = "Mark-Phase: Vom Root-Set (Stack, globale Variablen) ausgehend werden alle erreichbaren Objekte durch Graph-Traversal markiert. Sweep-Phase: Der gesamte Heap wird gescannt und alle nicht-markierten Objekte werden freigegeben.",
        difficulty = 3,
        funFact = "Mark-and-Sweep kann Stop-the-World-Pausen verursachen. Moderne GCs wie Googles Shenandoah (JVM) und Gos GC erzielen durch concurrent marking unter 1ms Pause-Zeit selbst bei Heaps von vielen Gigabytes."
    ),

    // Question 36
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen Stack und Heap in der Speicherverwaltung eines Prozesses?",
        answerA = "Stack ist langsamer, Heap schneller wegen Cache-Lokalitaet",
        answerB = "Stack waechst automatisch per LIFO fuer lokale Variablen und Ruecksprungadressen; Heap ist fuer dynamisch allokierten Speicher mit manueller oder GC-Verwaltung",
        answerC = "Heap ist unveraenderlich zur Laufzeit, Stack dynamisch",
        answerD = "Stack ist Teil des Kernelspeichers, Heap liegt im Userspace",
        correctAnswer = 1,
        explanation = "Der Stack waechst/schrumpft automatisch bei Funktionsaufrufen (LIFO) und enthaelt lokale Variablen, Parameter und Ruecksprungadressen. Der Heap wird durch malloc/new/GC verwaltet und enthaelt Objekte mit dynamischer Lebensdauer.",
        difficulty = 3,
        funFact = "Ein Stack-Overflow tritt auf, wenn zu tiefe Rekursion oder zu grosse Stack-Frames den Stack-Speicher erschoepfen. Standard-Stack-Groesse: 8 MB unter Linux, 1 MB unter Windows. Go-Goroutines starten mit 2 KB und wachsen dynamisch."
    ),

    // Question 37
    Question(
        categoryId = 7,
        questionText = "Was ist eine Race Condition und wie wird sie vermieden?",
        answerA = "Ein Leistungsproblem durch CPU-Konkurrenz; vermieden durch CPU-Pinning",
        answerB = "Ein Fehler, bei dem das Programmergebnis von der nicht-deterministischen Ausfuehrungs-Reihenfolge mehrerer Threads abhaengt; vermieden durch Synchronisationsprimitive",
        answerC = "Ein Netzwerkfehler durch parallele Pakete; vermieden durch TCP",
        answerD = "Ein Compilerfehler durch unbestimmte Initialisierungsreihenfolge; vermieden durch static initializer",
        correctAnswer = 1,
        explanation = "Wenn zwei Threads ohne Synchronisation auf gemeinsame Daten zugreifen und mindestens einer schreibt, entsteht eine Race Condition: Das Ergebnis haengt vom Zeitpunkt der Scheduling-Entscheidungen ab. Mutexe, Locks, atomare Operationen und lock-free Datenstrukturen verhindern dies.",
        difficulty = 3,
        funFact = "Die Therac-25-Strahlentherapiemaschine (1985-1987) traf aufgrund einer Race Condition fatale Entscheidungen und bestrahlte Patienten mit der 100-fachen Dosis. Mindestens 6 Menschen starben."
    ),

    // Question 38
    Question(
        categoryId = 7,
        questionText = "Was ist Copy-on-Write (CoW) und wo wird es eingesetzt?",
        answerA = "Alle Schreiboperationen werden sofort in den Cache kopiert",
        answerB = "Mehrere Prozesse teilen dieselben Speicherseiten; erst beim Schreiben wird eine private Kopie erzeugt",
        answerC = "Daten werden vor jeder Schreiboperation vollstaendig gesichert",
        answerD = "Ein Datenbankprinzip das Transaktionen protokolliert",
        correctAnswer = 1,
        explanation = "CoW erlaubt es, Ressourcen zu teilen bis einer der Nutzer schreiben will. Erst dann wird eine Kopie erstellt. Anwendungen: fork() kopiert nicht den kompletten Adressraum, Dateisysteme wie ZFS/Btrfs fuer atomare Snapshots, String-Immutabilitaet in Java/Python.",
        difficulty = 3,
        funFact = "Ohne CoW wuerde fork() + exec() (das Standard-Unix-Pattern fuer Prozesserstellung) den kompletten Elternprozess-Speicher kopieren, nur um ihn sofort durch exec() zu ueberschreiben — eine massive Verschwendung."
    ),

    // Question 39
    Question(
        categoryId = 7,
        questionText = "Was ist ein Bloom Filter und welche Eigenschaft hat er?",
        answerA = "Ein Cache-Ersetzungsalgorithmus fuer haeufig genutzte Elemente",
        answerB = "Eine platzsparende probabilistische Datenstruktur die testet ob ein Element in einer Menge ist — mit moeglichen False Positives, aber keinen False Negatives",
        answerC = "Ein kryptografisches Verfahren zum sicheren Passwort-Hashing",
        answerD = "Ein Netzwerkfilter der Pakete anhand von IP-Adressen klassifiziert",
        correctAnswer = 1,
        explanation = "Ein Bloom Filter verwendet mehrere Hash-Funktionen und ein Bit-Array. Ein Element koennte in der Menge sein (aber eventuell falsch positiv), oder es ist sicher nicht drin. False Negatives sind ausgeschlossen. Speicherverbrauch: konstant, unabhaengig von der Elementanzahl.",
        difficulty = 3,
        funFact = "Google Chrome nutzte Bloom Filter um lokal zu pruefen, ob eine URL moeglicherweise schaedlich ist, bevor eine Anfrage an Googles Server gesendet wird. Cassandra und HBase nutzen sie, um Disk-Zugriffe zu vermeiden."
    ),

    // Question 40
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen RISC und CISC Prozessor-Architekturen?",
        answerA = "RISC-Prozessoren sind immer leistungsstaerker als CISC-Prozessoren",
        answerB = "RISC nutzt wenige, einfache Instruktionen mit fester Laenge; CISC hat viele komplexe Instruktionen variabler Laenge",
        answerC = "CISC-Prozessoren koennen nicht pipelinen, RISC schon",
        answerD = "RISC ist eine Software-Technologie, CISC eine Hardware-Technologie",
        correctAnswer = 1,
        explanation = "RISC (Reduced Instruction Set Computer): Wenige, regelmaessige Instruktionen fester Laenge — einfach zu pipelinen. CISC (Complex Instruction Set Computer): Viele Instruktionen variabler Laenge, die komplexe Operationen kodieren.",
        difficulty = 3,
        funFact = "Modernes x86 ist intern RISC: Seit dem Pentium Pro (1995) werden x86-Instruktionen intern in Micro-Ops zerlegt, die auf einem RISC-Kern ausgefuehrt werden. Apple Silicon (ARM) ist RISC und schlaegt x86 in Effizienz."
    ),

    // Question 41
    Question(
        categoryId = 7,
        questionText = "Was ist Branch Prediction in modernen CPUs und warum ist sie wichtig?",
        answerA = "Ein Verfahren zur Vorhersage von Speicher-Zugriffsmustern fuer Prefetching",
        answerB = "Eine Technik, mit der die CPU den wahrscheinlichsten Zweig einer Bedingung spekulativ ausfuehrt, bevor die Bedingung ausgewertet ist",
        answerC = "Ein Algorithmus zur Optimierung von Sprung-Instruktionen im Compiler",
        answerD = "Ein Hardware-Verfahren zur Erkennung von Buffer-Overflows",
        correctAnswer = 1,
        explanation = "Ohne Branch Prediction muesste die Pipeline bei jeder Verzweigung stallen, bis die Bedingung ausgewertet ist (mehrere Takte Verlust). Moderne CPUs sagen den Ausgang voraus und fuehren spekulativ aus. Bei korrekter Vorhersage: kein Verlust. Bei Fehler: Pipeline-Flush.",
        difficulty = 3,
        funFact = "Moderne Branch-Predictors erreichen 95-99% Trefferquote. Intels Raptor Lake hat einen ca. 2 MB grossen Branch-Prediction-Buffer. Eine falsche Vorhersage kostet 15-20 Takte Pipeline-Penalty — entscheidend bei 5 GHz Taktfrequenz."
    ),

    // Question 42
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen synchronem und asynchronem I/O?",
        answerA = "Synchrones I/O ist schneller, weil es direkten Speicherzugriff nutzt",
        answerB = "Bei synchronem I/O blockiert der aufrufende Thread bis zur Fertigstellung; bei asynchronem I/O kehrt der Aufruf sofort zurueck",
        answerC = "Asynchrones I/O ist nur fuer Netzwerkoperationen verfuegbar",
        answerD = "Synchrones I/O erfordert mehrere Threads, asynchrones einen einzigen",
        correctAnswer = 1,
        explanation = "Synchrones I/O: Der Thread wartet (blockiert), bis die Operation abgeschlossen ist. Asynchrones I/O: Die Operation wird gestartet, der Thread kann weiter arbeiten und wird bei Fertigstellung benachrichtigt (Callback, Future, Promise, async/await).",
        difficulty = 3,
        funFact = "Node.js, Nginx und moderne Web-Frameworks nutzen asynchrones I/O mit Event-Loop um tausende simultane Verbindungen mit einem einzigen Thread zu verwalten. Apaches thread-per-request-Modell (synchrones I/O) skaliert schlechter."
    ),

    // Question 43
    Question(
        categoryId = 7,
        questionText = "Was ist mmap und welchen Vorteil bietet es gegenueber read()/write()?",
        answerA = "mmap ist eine Methode zur Netzwerkkommunikation ohne Kernel-Involvement",
        answerB = "mmap bildet Dateien oder Geraete direkt in den virtuellen Adressraum ab und vermeidet Datenkopien zwischen Kernel- und Userspace",
        answerC = "mmap ist ein Verschluesselungsverfahren fuer sicheren Dateizugriff",
        answerD = "mmap erlaubt mehrere Prozesse gleichzeitig in dieselbe Datei zu schreiben",
        correctAnswer = 1,
        explanation = "Bei read() kopiert der Kernel Daten von der Festplatte in den Kernel-Buffer und dann in den Userspace-Buffer (zwei Kopien). Mit mmap wird die Datei direkt in den Adressraum eingeblendet — der Kernel kann bei Seitenfehlern direkt aus der Datei laden, ohne Kopien.",
        difficulty = 3,
        funFact = "Datenbanken wie PostgreSQL und SQLite nutzen intensiv mmap. Der Linux-Kernel selbst laedt ausfuehrbare Dateien und Shared Libraries ueber mmap — das erlaubt das Teilen von Code-Seiten zwischen Prozessen und reduziert den Speicherverbrauch drastisch."
    ),

    // Question 44
    Question(
        categoryId = 7,
        questionText = "Was ist Consistent Hashing und warum wird es in verteilten Systemen eingesetzt?",
        answerA = "Ein Verfahren um Hash-Kollisionen zu vermeiden",
        answerB = "Eine Technik die beim Hinzufuegen/Entfernen von Knoten nur minimale Schluessel-Umleitungen erfordert",
        answerC = "Ein kryptografisches Hash-Verfahren mit deterministischen Ergebnissen",
        answerD = "Eine Datenbankstrategie fuer konsistente Transaktionen",
        correctAnswer = 1,
        explanation = "Bei normalem Hash-Sharding muss bei n+1 Knoten fast alles neu verteilt werden. Consistent Hashing ordnet Knoten und Keys auf einem Ring an: Beim Hinzufuegen eines Knotens werden nur die Keys des naechsten Nachbarn verschoben.",
        difficulty = 3,
        funFact = "Amazon DynamoDB, Apache Cassandra und Akamai CDN nutzen Consistent Hashing. In Cassandra werden Keys auf Virtual Nodes verteilt, um ungleichmaessige Last-Verteilung zu verhindern."
    ),

    // Question 45
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen Liveness und Safety in der Nebenlaeufikeitslehre?",
        answerA = "Liveness beschreibt korrekte Ergebnisse, Safety beschreibt Geschwindigkeit",
        answerB = "Safety bedeutet nichts Schlechtes passiert je; Liveness bedeutet etwas Gutes passiert irgendwann",
        answerC = "Liveness ist eine Compile-Zeit-Eigenschaft, Safety eine Laufzeit-Eigenschaft",
        answerD = "Safety verhindert Deadlocks, Liveness verhindert Race Conditions",
        correctAnswer = 1,
        explanation = "Safety Properties: Das System verletzt niemals eine Invariante (z.B. kein Deadlock, kein falsches Ergebnis). Liveness Properties: Das System macht schliesslich Fortschritt (z.B. jeder wartende Prozess erhaelt irgendwann die CPU).",
        difficulty = 3,
        funFact = "Der Beweis von Safety-Eigenschaften erfordert Invarianten-Beweise. Liveness-Beweise sind haeufig schwieriger — sie erfordern Fairness-Annahmen ueber den Scheduler. Formale Verifikationstools wie TLA+ (von Leslie Lamport) pruefen beide Eigenschaftsklassen."
    ),

    // Question 46
    Question(
        categoryId = 7,
        questionText = "Was ist Tail Call Optimization (TCO) und warum ist sie wichtig fuer rekursive Algorithmen?",
        answerA = "Eine Cache-Optimierung fuer rekursive Schleifen",
        answerB = "Eine Compiler-Transformation die einen rekursiven Endaufruf in eine Iteration umwandelt und Stack-Frames wiederverwendet",
        answerC = "Eine Laufzeit-Optimierung die rekursive Aufrufe parallelisiert",
        answerD = "Ein Garbage-Collection-Verfahren fuer nicht mehr benoetigte Stack-Frames",
        correctAnswer = 1,
        explanation = "Wenn ein Funktionsaufruf der letzte Ausdruck in einer Funktion ist (Tail Call), wird der aktuelle Stack-Frame nicht mehr benoetigt. TCO ersetzt ihn durch den neuen Frame — Rekursion laeuft in konstantem Stack-Speicher, kein Stack-Overflow moeglich.",
        difficulty = 3,
        funFact = "Sprachen wie Haskell, Erlang, Scheme und Clojure garantieren TCO in der Spezifikation. JavaScript (ES6) hat TCO spezifiziert, aber nur Safari implementiert es. C und C++ machen es als Best-Effort-Optimierung, ohne Garantie."
    ),

    // Question 47
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem Interpreter und einem JIT-Compiler?",
        answerA = "Interpreter sind immer langsamer als JIT, weil sie Bytecode lesen",
        answerB = "Ein Interpreter fuehrt jede Instruktion sofort aus; ein JIT kompiliert haeufig ausgefuehrte Code-Abschnitte zur Laufzeit in nativen Maschinencode",
        answerC = "JIT-Compiler benoetigen keinen Quellcode, Interpreter schon",
        answerD = "Interpreter koennen nur Skript-Sprachen ausfuehren, JIT nur kompilierte Sprachen",
        correctAnswer = 1,
        explanation = "Ein reiner Interpreter liest und fuehrt jede Instruktion einzeln aus — einfach aber langsam. JIT (Just-In-Time) Compiler erkennen heisse Code-Pfade, kompilieren diese zur Laufzeit in optimierten Maschinencode und fuehren ihn direkt aus.",
        difficulty = 3,
        funFact = "Googles V8 (JavaScript) nutzt Tiered JIT: Ignition (Bytecode-Interpreter), Sparkplug (schneller Baseline-Compiler), Maglev und TurboFan (Optimierender JIT). JVM HotSpot hat C1 (Client-Compiler) und C2 (Server-Compiler) als zwei JIT-Stufen."
    ),

    // Question 48
    Question(
        categoryId = 7,
        questionText = "Was ist das CAP-Theorem fuer verteilte Datenbanken?",
        answerA = "Consistency, Availability und Performance koennen nicht gleichzeitig maximiert werden",
        answerB = "Ein verteiltes System kann hoechstens zwei der drei Eigenschaften garantieren: Consistency, Availability und Partition Tolerance",
        answerC = "Caching, Atomaritaet und Parallelitaet schliessen sich gegenseitig aus",
        answerD = "Ein System kann entweder ACID oder BASE Garantien bieten, aber niemals beide",
        correctAnswer = 1,
        explanation = "Bei einem Netzwerk-Partition muss ein verteiltes System waehlen: Konsistenz (alle Knoten sehen dieselben Daten) oder Verfuegbarkeit (jede Anfrage bekommt eine Antwort). CP-Systeme: HBase, Zookeeper. AP-Systeme: Cassandra, CouchDB.",
        difficulty = 3,
        funFact = "Eric Brewer formulierte das CAP-Theorem 2000 als Vermutung, Gilbert und Lynch bewiesen es 2002. Moderne Systeme wie Spanner von Google bieten external consistency durch TrueTime und fordern damit die klassische CAP-Interpretation heraus."
    ),

    // Question 49
    Question(
        categoryId = 7,
        questionText = "Was ist HTTPS Certificate Pinning und warum wird es eingesetzt?",
        answerA = "Eine Methode um SSL-Zertifikate lokal zu cachen und Verbindungszeiten zu reduzieren",
        answerB = "Eine Technik die eine App auf bestimmte Zertifikate oder Public Keys festlegt und so Man-in-the-Middle-Angriffe trotz gueltiger CA-Zertifikate verhindert",
        answerC = "Ein Protokoll zur automatischen Zertifikatserneuerung ohne Ausfallzeit",
        answerD = "Eine Firewall-Regel die nur HTTPS-Verbindungen zu verifizierten Servern erlaubt",
        correctAnswer = 1,
        explanation = "Normalerweise vertraut eine App jedem Zertifikat das von einer vertrauenswuerdigen CA signiert ist. Certificate Pinning erlaubt nur spezifische Zertifikate oder Public Keys — selbst eine kompromittierte CA kann keinen gueltigen Man-in-the-Middle-Angriff durchfuehren.",
        difficulty = 3,
        funFact = "Google Chrome hatte Certificate Pinning fuer google.com hardcodiert. 2017 wurde es entfernt — Google setzt stattdessen auf Certificate Transparency Logs: Alle ausgestellten Zertifikate muessen in oeffentlichen Logs protokolliert werden."
    ),

    // Question 50
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einer regulaeren Sprache und einer kontextfreien Sprache in der Chomsky-Hierarchie?",
        answerA = "Regulaere Sprachen sind maechtiger, weil sie mehr Zustaende haben",
        answerB = "Regulaere Sprachen werden durch endliche Automaten erkannt; kontextfreie Sprachen benoetigen Kellerautomaten (Stack)",
        answerC = "Kontextfreie Sprachen koennen nur von Turing-Maschinen erkannt werden",
        answerD = "Beide werden durch regulaere Ausdruecke beschrieben, kontextfreie zusaetzlich durch Grammatiken",
        correctAnswer = 1,
        explanation = "Chomsky-Typ-3 (Regulaer): Erkannt durch endliche Automaten, beschrieben durch regulaere Ausdruecke — z.B. Email-Format-Pruefung. Typ-2 (Kontextfrei): Benoetigt Kellerautomaten, beschrieben durch CFG — alle gaengigen Programmiersprachen sind (mindestens) kontextfrei.",
        difficulty = 3,
        funFact = "HTML und XML sind nicht regulaer (verschachtelte Tags erfordern einen Stack), weshalb HTML mit regulaeren Ausdruecken nicht korrekt geparst werden kann — was aber nicht verhindert, dass Menschen es staendig versuchen."
    )
)
