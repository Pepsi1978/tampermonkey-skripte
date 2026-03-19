package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsMaster5(): List<Question> = listOf(
    // 1
    Question(
        categoryId = 7,
        questionText = "Was ist das Fiat-Shamir-Heuristik-Verfahren und wofuer wird es in zk-SNARKs eingesetzt?",
        answerA = "Eine Methode zur Schluesselerzeugung auf Basis von Primzahlen",
        answerB = "Eine Transformation interaktiver Beweise in nicht-interaktive, indem der Prover den Herausforderer durch eine Hash-Funktion simuliert",
        answerC = "Ein symmetrisches Verschluesselungsverfahren fuer Zero-Knowledge-Kommunikation",
        answerD = "Ein Protokoll zur sicheren Schluesselteilung zwischen mehreren Parteien",
        correctAnswer = 1,
        explanation = "Die Fiat-Shamir-Heuristik verwandelt interaktive Sigma-Protokolle in nicht-interaktive Beweise, indem die zufaellige Herausforderung des Verifiers durch den Hash der Commitment-Werte ersetzt wird. In zk-SNARKs ermoeglicht dies offline verifizierbare Beweise ohne direkte Kommunikation.",
        difficulty = 5,
        funFact = "Die Heuristik gilt im Random-Oracle-Modell als sicher, aber im Standard-Modell koennen konstruierte Hash-Funktionen Angriffe ermoglichen — ein subtiler Unterschied, der selbst Experten verwirrt."
    ),
    // 2
    Question(
        categoryId = 7,
        questionText = "Welchen fundamentalen Unterschied gibt es zwischen zk-SNARKs und zk-STARKs hinsichtlich der Trusted-Setup-Phase?",
        answerA = "zk-STARKs benoetigen eine aufwendigere Trusted-Setup-Phase als zk-SNARKs",
        answerB = "zk-SNARKs benoetigen einen Trusted Setup (toxischer Abfall), waehrend zk-STARKs gaenzlich transparent ohne Setup auskommen",
        answerC = "Beide benoetigen identische Trusted-Setup-Verfahren",
        answerD = "zk-STARKs verwenden elliptische Kurven statt Hash-Funktionen und benoetigen deshalb keinen Setup",
        correctAnswer = 1,
        explanation = "zk-SNARKs basieren auf elliptischen Kurven-Pairing und benoetigen einen Trusted Setup, bei dem geheime Parameter (der 'toxische Abfall') sicher vernichtet werden muessen. zk-STARKs nutzen nur kollisionsresistente Hash-Funktionen und benoetigen daher keinen vertrauenswuerdigen Setup — sie sind post-quanten-sicher und vollstaendig transparent.",
        difficulty = 5,
        funFact = null
    ),
    // 3
    Question(
        categoryId = 7,
        questionText = "Welches mathematische Problem bildet die Sicherheitsgrundlage fuer gitterbasierte Kryptographie (Learning With Errors, LWE)?",
        answerA = "Das diskrete Logarithmusproblem in zyklischen Gruppen",
        answerB = "Das Faktorisierungsproblem grosser semiprimer Zahlen",
        answerC = "Das Problem, kurze oder nahe Vektoren in hochdimensionalen Gittern zu finden (SVP/CVP), kombiniert mit additivem Rauschen",
        answerD = "Das Problem der sicheren Hash-Kollisionen in polynomiellen Zeitschranken",
        correctAnswer = 2,
        explanation = "LWE (Learning With Errors) basiert auf der Haerte, ein lineares Gleichungssystem mit additivem Rauschen zu loesen. Dies ist im Worst-Case auf das Shortest Vector Problem (SVP) und Closest Vector Problem (CVP) in Gittern reduzierbar — Probleme, fuer die auch Quantencomputer keinen effizienten Algorithmus kennen.",
        difficulty = 5,
        funFact = "Oded Regev bewies 2005, dass das Brechen von LWE mindestens so schwer ist wie das Loesen des schlimmsten Falls von Gitterproblemen — ein Worst-Case-zu-Average-Case-Beweis, der in der Kryptographie selten ist."
    ),
    // 4
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter Fully Homomorphic Encryption (FHE) und welches Hauptproblem loeste Craig Gentry 2009?",
        answerA = "Einen Verschluesselungsstandard, der Daten waehrend der Uebertragung schuetzt, ohne den Schlussel zu offenbaren",
        answerB = "Ein System, das beliebige Berechnungen auf verschluesselten Daten erlaubt ohne Entschluesselung; Gentry loeste das 'Bootstrapping'-Problem der angesammelten Fehler",
        answerC = "Eine Methode zur homomorphen Schluesselverwaltung in verteilten Systemen",
        answerD = "Ein Verschluesselungsverfahren, das identische Klartexte immer zu identischen Chiffretexten verarbeitet",
        correctAnswer = 1,
        explanation = "FHE erlaubt Add- und Multiplikationsoperationen direkt auf Chiffretexten, sodass ein Cloud-Anbieter Berechnungen ausfuehren kann, ohne die Daten zu sehen. Gentrys Durchbruch war das 'Bootstrapping': Er zeigte, wie man angesammelte Fehler (noise) durch Selbstverschluesselung des Entschluesselungskreises periodisch zuruecksetzen kann.",
        difficulty = 5,
        funFact = null
    ),
    // 5
    Question(
        categoryId = 7,
        questionText = "Was ist ein Timing-Seitenkanalangriff und welche konkrete Gegenmasnahme verhindert ihn in kryptographischen Implementierungen?",
        answerA = "Ein Angriff per Netzwerk-Timing; verhindert durch Firewalls",
        answerB = "Eine Messung der Ausfuehrungszeit kryptographischer Operationen zur Schluesselrekonstruktion; verhindert durch 'constant-time' Implementierungen ohne datenabhaengige Verzweigungen",
        answerC = "Ein physischer Angriff auf Hardware-Uhren; verhindert durch HSM-Gehaeuse",
        answerD = "Ein Cache-Angriff auf Betriebssystem-Prozesse; verhindert durch Prozessisolation",
        correctAnswer = 1,
        explanation = "Timing-Angriffe nutzen datenabhaengige Laufzeitunterschiede: z.B. verraet ein fruehzeitiger 'return false' bei fehlerhaftem Padding den Schlussel. Constant-time Code vermeidet alle datenabhaengigen Verzweigungen und Speicherzugriffe, sodass die Ausfuehrungszeit immer gleich ist — unabhaengig vom geheimen Wert.",
        difficulty = 5,
        funFact = "Paul Kocher entdeckte 1996 Timing-Angriffe und demonstrierte, dass er SSL-Server-Privatschlussel allein durch Latenz-Messungen rekonstruieren konnte — ein Paradigmenwechsel fuer die Implementierungssicherheit."
    ),
    // 6
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert ein Differential Power Analysis (DPA) Angriff auf eingebettete Kryptographie-Hardware?",
        answerA = "Der Angreifer misst elektromagnetische Abstrahlung um AES-Schlussel zu rekonstruieren",
        answerB = "Der Angreifer sammelt viele Stromverbrauchskurven bei bekannten Klartexten und korreliert diese statistisch mit hypothetischen Schlusselwerten",
        answerC = "Der Angreifer induziert Fehler durch Spannungsschwankungen um Schlussel aus fehlerhaften Berechnungen zu extrahieren",
        answerD = "Der Angreifer analysiert Cache-Zugriffszeiten um AES-Rundenschlussel zu bestimmen",
        correctAnswer = 1,
        explanation = "DPA (von Paul Kocher, 1999) korreliert den gemessenen Stromverbrauch einer Karte mit dem Hamming-Gewicht hypothetischer Zwischenwerte. Bei einem AES-Byte z.B. wird fuer jeden moeglichen Schlusselbyte die Korrelation zwischen gemessenem Strom und hypothetischem S-Box-Output berechnet — der hoechste Korrelationswert veraet den echten Schlusselbyte.",
        difficulty = 5,
        funFact = null
    ),
    // 7
    Question(
        categoryId = 7,
        questionText = "Welche grundlegende CPU-Eigenschaft nutzen die Spectre-Angriffe (Variante 1) aus?",
        answerA = "Out-of-order Execution auf mehreren CPU-Kernen",
        answerB = "Spekulativer Instruktionsausfuehrung (speculative execution) mit Branch-Prediction, die Cache-Zustaende nach falsch vorhergesagten Pfaden unveraendert laesst",
        answerC = "Schwachstellen im TLB (Translation Lookaside Buffer) bei virtuellen Maschinen",
        answerD = "Fehler in der Microcode-Implementierung des x86-Segmentierungsmodells",
        correctAnswer = 1,
        explanation = "Spectre Variante 1 (bounds check bypass) nutzt aus, dass CPUs spekulativ Code ausfuehren, bevor Zugriffspruefungen abgeschlossen sind. Die spekulative Ausfuehrung hinterlasst Spuren im L1-Cache. Auch wenn der spekulative Pfad verworfen wird, bleibt der Cache-Zustand — ein Seitenkanalangriffsvektor der es erlaubt, benutzerunzugaengliche Speicherbereiche zu lesen.",
        difficulty = 5,
        funFact = "Spectre ist strukturell kaum zu beheben: Spekulative Ausfuehrung ist fuer moderne CPU-Performance fundamental. Vollstaendige Mitigierung wuerde 20-40% Leistungsverlust bedeuten."
    ),
    // 8
    Question(
        categoryId = 7,
        questionText = "Was ist Secure Multi-Party Computation (SMPC) und welches grundlegende Problem loest Yaos Garbled-Circuit-Protokoll?",
        answerA = "Ein Verfahren fuer sichere Cloud-Speicherung; Yao loeste das Schluesseltauschproblem",
        answerB = "Ein Protokoll, das mehrere Parteien eine Funktion auf privaten Eingaben berechnen laesst ohne gegenseitige Offenbarung; Yaos Garbled Circuits loesen das 2-Parteien-Problem durch verschluesselte Schaltkreise",
        answerC = "Eine Methode zur verteilten Schluesselerzeugung in PKI-Systemen",
        answerD = "Ein Konsensprotokoll fuer Blockchain-Netzwerke mit privaten Transaktionen",
        correctAnswer = 1,
        explanation = "Yaos Millionaers-Problem (1982): Zwei Millionaere wollen wissen, wer reicher ist, ohne ihr Vermoegen zu offenbaren. Garbled Circuits verschluesseln jeden Gate eines Booleschen Schaltkreises mit Zufallsschluesseln — der Evaluator rechnet den Schaltkreis aus, ohne Zwischenwerte zu kennen. Das Oblivious Transfer-Protokoll stellt sicher, dass Eingaben privat bleiben.",
        difficulty = 5,
        funFact = null
    ),
    // 9
    Question(
        categoryId = 7,
        questionText = "Was unterscheidet Ring-LWE von Standard-LWE und warum ist es fuer praktische Post-Quanten-Kryptographie bevorzugt?",
        answerA = "Ring-LWE nutzt elliptische Kurvenringe statt Polynomringe und ist dadurch quanten-resistenter",
        answerB = "Ring-LWE definiert das LWE-Problem ueber Polynomringe (Z[x]/(f(x))), was durch algebraische Struktur deutlich kuerzere Schluessel und schnellere Operationen ermoeglicht",
        answerC = "Ring-LWE hat schwaechere Sicherheitsgarantien als LWE und wird nur fuer kurzfristige Schluessel verwendet",
        answerD = "Ring-LWE ersetzt das Rauschen durch modulare Reste und ist dadurch quantensicher ohne Vergroesserung des Schluesselmaterials",
        correctAnswer = 1,
        explanation = "Standard-LWE hat quadratische Matrizengroessen (n x n), was fuer n=1024 Schluessel von ~1 MB ergibt. Ring-LWE arbeitet in Z_q[x]/(x^n+1) und nutzt NTT (Number Theoretic Transform) fuer O(n log n) Multiplikationen. Das NIST-Post-Quanten-Standard CRYSTALS-Kyber basiert auf Modul-LWE, einer Verallgemeinerung von Ring-LWE.",
        difficulty = 5,
        funFact = "CRYSTALS-Kyber wurde 2024 als erster post-quanten Key-Encapsulation-Standard (ML-KEM, FIPS 203) standardisiert und hat oeffentliche Schluessel von nur ~1184 Bytes."
    ),
    // 10
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert XMSS (eXtended Merkle Signature Scheme) und warum ist es zustandsbehaftet?",
        answerA = "XMSS signiert mit RSA-Schluesseln in einem Merkle-Baum; zustandsbehaftet weil RSA-Schluessel periodisch rotiert werden",
        answerB = "XMSS baut einen Merkle-Baum aus Einmal-Signaturen (OTS) als Blattknoten; zustandsbehaftet weil jeder OTS-Schluessel nur einmal verwendet werden darf und der Zustand verfolgt welche Schluessel verbraucht sind",
        answerC = "XMSS verwendet Hash-Chains wie OTP; zustandsbehaftet wegen der Verkettung von Hash-Werten",
        answerD = "XMSS ist ein zustandsloser Standard der Hash-basierte MACs in Baumstruktur anordnet",
        correctAnswer = 1,
        explanation = "XMSS-Blattknoten sind WOTS+ (Winternitz OTS+) Einmal-Signaturen. Deren Public Keys bilden einen Merkle-Baum, dessen Wurzel der oeffentliche Schluessel ist. Da jeder WOTS+-Schluessel nur einmal sicher genutzt werden darf, muss der Signer verfolgen, welchen Blattindex er als naechstes verwendet — deshalb ist XMSS zustandsbehaftet. Doppelverwendung zerstoert die Sicherheit.",
        difficulty = 5,
        funFact = null
    ),
    // 11
    Question(
        categoryId = 7,
        questionText = "Was ist SPHINCS+ und wie loest es das Zustandsproblem von XMSS?",
        answerA = "SPHINCS+ ist eine Weiterentwicklung von XMSS mit laengeren Schluesseln aber gleichem Zustandsproblem",
        answerB = "SPHINCS+ nutzt einen hypertreeless Ansatz mit randomisierten Indizes und einem FORS-Baum, sodass keine serielle Zustandsverfolgung noetig ist und trotzdem keine Signaturen doppelt verwendet werden",
        answerC = "SPHINCS+ ersetzt Einmal-Signaturen durch Few-Time-Signaturen und reduziert dadurch den Zustand auf einen einzigen Zaehlerwert",
        answerD = "SPHINCS+ ist zustandslos durch Verwendung elliptischer Kurven als Blattelemente des Merkle-Baums",
        correctAnswer = 1,
        explanation = "SPHINCS+ (NIST SLH-DSA Standard) verwendet einen hybriden Ansatz: Ein hypertree aus vielen kleinen XMSS-Instanzen plus FORS (Forest of Random Subsets) fuer die Einmal-Signatur. Der Signing-Index wird pseudozufaellig aus dem Message-Hash und einem Geheimwert abgeleitet — statistisch ist eine Kollision extrem unwahrscheinlich, ohne dass ein sequentieller Zustand verwaltet werden muss.",
        difficulty = 5,
        funFact = "SPHINCS+-SHA2-128f erzeugt Signaturen von ~17 KB — verglichen mit 64 Bytes bei Ed25519. Dieser Groessenunterschied ist der Preis der Zustandslosigkeit."
    ),
    // 12
    Question(
        categoryId = 7,
        questionText = "Was ist Oblivious RAM (ORAM) und welches Sicherheitsziel verfolgt es?",
        answerA = "Ein Verschluesselungsverfahren fuer RAM-Inhalte, das physischen Speicherzugriff verhindert",
        answerB = "Ein Protokoll das Zugriffsmuster auf verschluesselten Speicher vor einem neugierigen Server verbirgt, sodass beobachtete Adresssequenzen keine Information ueber tatsaechliche Datenzugriffe preisgeben",
        answerC = "Ein sicherer Speicherallokator, der Buffer-Overflow-Angriffe durch Adressrandomisierung verhindert",
        answerD = "Ein Multi-Party-Protokoll fuer verteilte RAM-Berechnungen in Rechenzentren",
        correctAnswer = 1,
        explanation = "Selbst bei verschluesselten Daten verraet das Zugriffsmuster (welche Adressen wann abgerufen werden) Informationen — z.B. ob ein bestimmter Datensatz abgerufen wurde. ORAM (eingefuehrt von Goldreich und Ostrovsky, 1996) mischt und re-randomisiert Zugriffe, sodass jeder Zugriff fuer den Server gleich aussieht. Modernes Path ORAM (Stefanov et al., 2013) hat O(log^2 n) Overhead.",
        difficulty = 5,
        funFact = null
    ),
    // 13
    Question(
        categoryId = 7,
        questionText = "Wie unterscheidet sich Intel SGX (Software Guard Extensions) von ARM TrustZone hinsichtlich des Sicherheitsmodells?",
        answerA = "SGX schuetzt den gesamten Kernel vor Anwendungsprozessen; TrustZone schuetzt Anwendungen vor dem Kernel",
        answerB = "SGX erstellt isolierte Enklaven im Benutzermodus, die selbst dem OS-Kernel unzugaenglich sind; TrustZone teilt die gesamte Hardware in eine Secure World und Normal World auf CPU-Ebene",
        answerC = "SGX ist ein Firmware-Sicherheitsmodul; TrustZone ist ein Hypervisor-basiertes Isolierungsverfahren",
        answerD = "Beide verwenden dasselbe Modell, unterscheiden sich nur durch CPU-Architektur (x86 vs ARM)",
        correctAnswer = 1,
        explanation = "SGX-Enklaven sind verschluesselte Speicherbereiche (EPC), auf die kein Code ausserhalb der Enklave zugreifen kann — nicht Kernel, nicht Hypervisor, nicht BIOS. TrustZone hingegen teilt die CPU zwischen Secure World (fuer vertrauenswuerdige Software wie TEE-Betriebssystem OP-TEE) und Normal World (Android/Linux). Das Betriebssystem der Normal World kann niemals auf Secure World-Speicher zugreifen.",
        difficulty = 5,
        funFact = "SGX wurde durch Angriffe wie Foreshadow (2018) und SGAxe (2020) erheblich geschwaeche: Spekulativer Zugriff auf EPC-Speicher kompromittierte das Sicherheitsmodell fundamental."
    ),
    // 14
    Question(
        categoryId = 7,
        questionText = "Was ist AMD SEV (Secure Encrypted Virtualization) und welchen Angreifer betrachtet sein Bedrohungsmodell?",
        answerA = "SEV verschluesselt VM-Netzwerkverkehr und schuetzt vor Man-in-the-Middle-Angriffen durch externe Angreifer",
        answerB = "SEV verschluesselt den Arbeitsspeicher einzelner VMs mit VM-spezifischen Schluesseln und schuetzt gegen einen kompromittierten oder boshaften Hypervisor",
        answerC = "SEV ist ein sicheres Enklavensystem aehnlich zu SGX, das auf Server-CPUs standardisiert wurde",
        answerD = "SEV implementiert Memory-Tagging zur Verhinderung von Use-After-Free-Angriffen in virtualisierten Umgebungen",
        correctAnswer = 1,
        explanation = "AMD SEV (ab EPYC-Serie) verschluesselt VM-Speicher mit einem per-VM-Schluessel im AMD Secure Processor. Der Hypervisor kann den Speicherinhalt nicht im Klartext lesen. SEV-SNP (Secure Nested Paging) erweitert dies um Integritaetsschutz. Das Bedrohungsmodell: Ein malicious-but-curious Cloud-Anbieter (kompromittierter Hypervisor) soll keine VM-Daten lesen koennen.",
        difficulty = 5,
        funFact = null
    ),
    // 15
    Question(
        categoryId = 7,
        questionText = "Was ist Return-Oriented Programming (ROP) und welche Sicherheitsmassnahme wurde urspruenglich zu seiner Verhinderung einfuehrt, die aber allein nicht ausreicht?",
        answerA = "Ein Angriff der Rueckgabeanweisungen kettet um shellcode auszufuehren; verhindert durch DEP/NX-Bits (Data Execution Prevention)",
        answerB = "Ein Angriff der bestehende Code-Fragmente (Gadgets) vor RET-Instruktionen kettet um beliebige Berechnungen ohne eingeschleusten Code ausfuehren; DEP/NX loste das Problem nicht da ROP nur legitimen Code umordnet",
        answerC = "Ein Angriff der Rueckgabeadressen auf dem Heap manipuliert; verhindert durch Heap-Randomisierung",
        answerD = "Ein Exploit-Typ der JIT-kompilierten Code wiedeROP verwendet; verhindert durch sichere JIT-Kompilierung",
        correctAnswer = 1,
        explanation = "ROP (Hovav Shacham, 2007) kettet kleine Code-Sequenzen ('Gadgets'), die mit RET-Instruktionen enden. Da nur vorhandener ausfuehrbarer Code verwendet wird, umgeht ROP DEP/NX vollstaendig. ASLR reduziert ROP, ist aber nicht ausreichend — Gadgets koennen durch Info-Leaks oder partial overwrites gefunden werden. Control Flow Integrity (CFI) und Shadow Stacks sind modernere Gegenmassnahmen.",
        difficulty = 5,
        funFact = "Blind ROP (BROP) ermoeglicht ROP-Angriffe ohne Kenntnis des Programms oder seiner Adresse — der Angreifer 'tastet' das Programm durch strategische Abstaerze ab."
    ),
    // 16
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert Control Flow Integrity (CFI) und was ist der Unterschied zwischen Forward-Edge und Backward-Edge CFI?",
        answerA = "CFI verhindert alle Sprunge; Forward-Edge beschraenkt Funktionsrueckgaben; Backward-Edge beschraenkt indirekte Aufrufe",
        answerB = "CFI begrenzt erlaubte Kontrollfluss-Ziele auf einen statisch bestimmten Satz; Forward-Edge CFI beschraenkt indirekte Aufrufe und Spruenge; Backward-Edge CFI schuetzt Rueckgabeadressen (oft durch Shadow Stacks)",
        answerC = "CFI erzwingt kryptographische Signaturen auf allen Sprunganweisungen im Maschinencode",
        answerD = "CFI ist ein Compiler-Feature das allen moeglichen Kontrollfluss durch statische Analyse zur Compilezeit verifiziert",
        correctAnswer = 1,
        explanation = "CFI erstellt zur Compilezeit einen Kontrollflussgraphen. Forward-Edge CFI prueft indirekte Spruenge/Aufrufe gegen erlaubte Ziele (z.B. durch Typsignaturen). Backward-Edge CFI schuetzt den Stack-Rueckgabepfad — am effektivsten durch Hardware-Shadow-Stacks (Intel CET, ARM PAC/BTI). Ohne Backward-Edge CFI sind Stack-Overflows weiterhin nutzbar.",
        difficulty = 5,
        funFact = null
    ),
    // 17
    Question(
        categoryId = 7,
        questionText = "Was ist Jump-Oriented Programming (JOP) und warum umgeht es einfache CFI-Implementierungen?",
        answerA = "JOP ist eine Variante von ROP die nur CALL-Instruktionen statt RET verwendet und damit Rueckgabe-Schutzmechanismen umgeht",
        answerB = "JOP kettet Gadgets die mit indirekten JUMP-Instruktionen enden statt mit RET; es umgeht Rueckgabe-basierte CFI weil keine RET-Instruktionen verwendet werden und schwache CFI-Implementierungen erlaubte Sprungziele zu grosszuegig definieren",
        answerC = "JOP nutzt JIT-kompilierten Code um CFI-Checks zu umgehen durch Erzeugung neuer Gadgets zur Laufzeit",
        answerD = "JOP ist ein Kernel-Exploit der privilegierte Spruenge in Interrupt-Handler kettet",
        correctAnswer = 1,
        explanation = "JOP (Bletsch et al., 2011) nutzt 'dispatcher gadgets' — Gadgets die indirekt springen und dabei eine Tabelle konsultieren. Da keine RET-Instruktionen verwendet werden, schlagen Massnahmen wie SafeStack oder Intel LBR-basierter ROP-Schutz fehl. Schwache CFI-Implementierungen die nur Typen pruefen (aber viele Typen erlauben) bieten ebenfalls keinen ausreichenden Schutz gegen JOP.",
        difficulty = 5,
        funFact = "Moderne Shadow-Stack-Implementierungen (Intel CET) adressieren nur Backward-Edge. Gegen JOP ist granulares Forward-Edge CFI mit engen Zielsaetzen (wie Clang's CFI) notwendig."
    ),
    // 18
    Question(
        categoryId = 7,
        questionText = "Was ist Coverage-guided Fuzzing und wie unterscheidet es sich von Black-Box-Fuzzing?",
        answerA = "Coverage-guided Fuzzing analysiert Crash-Reports; Black-Box-Fuzzing analysiert Quellcode",
        answerB = "Coverage-guided Fuzzing instrumentiert das Programm um Code-Pfade zu tracken und bevorzugt Eingaben die neue Codepfade aufdecken; Black-Box-Fuzzing sendet zufall Eingaben ohne Programmkenntnis",
        answerC = "Coverage-guided Fuzzing verwendet formale Verifikation; Black-Box-Fuzzing verwendet symbolische Ausfuehrung",
        answerD = "Coverage-guided Fuzzing ist ein Netzwerk-Angriffswerkzeug; Black-Box-Fuzzing testet API-Endpunkte ohne Dokumentation",
        correctAnswer = 1,
        explanation = "AFL/LibFuzzer instrumentieren das Programm (z.B. durch LLVM SanitizerCoverage) um Branch-Abdeckung zu messen. Der Fuzzer maintaint einen Corpus interessanter Eingaben und mutiert bevorzugt solche die neue Code-Pfade aktivieren. Black-Box-Fuzzing (wie zufaellige HTTP-Requests) kann interessante Codepfade nicht gezielt ansteuern und ist wesentlich weniger effizient bei der Bug-Findung.",
        difficulty = 5,
        funFact = null
    ),
    // 19
    Question(
        categoryId = 7,
        questionText = "Was ist Concolic Testing (auch 'Whitebox Fuzzing') und welches fundamentale Problem begrenzt seine Skalierbarkeit?",
        answerA = "Concolic Testing kombiniert statische Analyse mit Code-Review; begrenzt durch die Komplexitaet moderner Software",
        answerB = "Concolic Testing kombiniert konkrete Ausfuehrung mit symbolischer Analyse um Pfadbedingungen zu loesen und neue Testfaelle zu erzeugen; begrenzt durch Path Explosion — die exponentielle Anzahl moeglicher Ausfuehrungspfade",
        answerC = "Concolic Testing ist ein formales Beweisverfahren fuer sicherheitskritischen Code; begrenzt durch die Rechenleistung von SMT-Solvern",
        answerD = "Concolic Testing verwendet Constraint-Programmierung um Testfaelle zu generieren; begrenzt durch die Unvollstaendigkeit von SAT-Solvern",
        correctAnswer = 1,
        explanation = "SAGE (Microsoft), KLEE, und S2E verwenden concolic execution: Das Programm laeuft konkret, waehrend symbolische Constraints fuer alle Pfadbedingungen gesammelt werden. Ein SMT-Solver (z.B. Z3) negiert Constraints um neue Pfade zu erkunden. Path Explosion: Bei n Verzweigungen gibt es 2^n Pfade. Loops und rekursive Strukturen erzeugen praktisch unendliche Pfadmengen.",
        difficulty = 5,
        funFact = "SAGE fand in den ersten Jahren bei Microsoft ueber 100 Sicherheitsluecken in Windows-Komponenten, die konventionelle Tests nicht gefunden hatten."
    ),
    // 20
    Question(
        categoryId = 7,
        questionText = "Was ist Grammar-based Fuzzing und fuer welche Klasse von Programmen ist es besonders effektiv?",
        answerA = "Grammar-based Fuzzing beschraenkt Eingaben auf alphanumerische Zeichen; effektiv fuer Datenbank-Systeme",
        answerB = "Grammar-based Fuzzing generiert strukturell valide Eingaben gemaess einer definierten Grammatik (z.B. BNF); besonders effektiv fuer Parser, Interpreter und Browser die strukturierte Formate wie HTML/JSON/SQL verarbeiten",
        answerC = "Grammar-based Fuzzing verwendet regulaere Ausdruecke um Eingaben zu constrainen; effektiv fuer Protokoll-Fuzzing",
        answerD = "Grammar-based Fuzzing lernt die Eingabestruktur durch Machine Learning; effektiv fuer beliebige Programme",
        correctAnswer = 1,
        explanation = "Naive Fuzzer erzeugen oft Eingaben, die frueh abgewiesen werden (z.B. falscher JSON-Syntax). Grammar-based Fuzzer wie Nautilus oder Gramatron erzeugen gemaess einer Grammatik strukturell korrekte Eingaben, die tiefere Code-Pfade erreichen. Sie sind besonders effektiv fuer JavaScript-Engines (V8, SpiderMonkey), XML-Parser, und SQL-Interpreter, wo strukturelle Validitaet Pflicht ist.",
        difficulty = 5,
        funFact = null
    ),
    // 21
    Question(
        categoryId = 7,
        questionText = "Was ist die Burrows-Abadi-Needham (BAN) Logik und welche Schwaeche hat sie bei der formalen Verifikation kryptographischer Protokolle?",
        answerA = "BAN-Logik ist eine kryptographische Hash-Funktion; Schwaeche liegt in quadratischer Laufzeit",
        answerB = "BAN-Logik ist eine modale Logik zur Analyse kryptographischer Protokolle; ihre Schwaeche liegt in einer zu abstrakten Semantik, die reale Angriffe (z.B. Typ-Verwechslungsangriffe, Replay-Angriffe mit alten Nachrichtenteilen) nicht zuverlaessig erkennt",
        answerC = "BAN-Logik verifiziert Protokolle durch erschoepfende Zustandsraumsuche; Schwaeche ist die exponentielle Komplexitaet bei grossen Protokollen",
        answerD = "BAN-Logik ist ein symbolisches Ausfuehrungsrahmenwerk; es kann keine quantitativen Sicherheitsaussagen machen",
        correctAnswer = 1,
        explanation = "BAN-Logik (1989) ermoeglicht Aussagen wie 'A glaubt, dass B den Schluessel K kennt'. Sie ist jedoch semiformell: die Idealisierungsschritte (Umformung der Protokollnachrichten) sind nicht mechanisiert und koennen Fehler einfuehren. Modernere Tools wie ProVerif, Tamarin oder CryptoVerif verwenden detailliertere Modelle (pi-Kalkuel, Equational Theories) und finden Angriffe, die BAN-Logik uebersieht.",
        difficulty = 5,
        funFact = "ProVerif fand 2012 in wenigen Sekunden einen Angriff auf TLS 1.0 Renegotiation der erst 2009 oeffentlich bekannt wurde — ein Beweis fuer die Leistungsfaehigkeit automatisierter Verifikation."
    ),
    // 22
    Question(
        categoryId = 7,
        questionText = "Was ist HKDF (HMAC-based Key Derivation Function) und warum ist es gegenueber einfachem HMAC fuer Schluesselerzeugung vorzuziehen?",
        answerA = "HKDF ist schneller als HMAC und daher besser fuer eingebettete Systeme geeignet",
        answerB = "HKDF trennt die Schritte 'Extract' (Randomness-Extraktion aus schwachen Quellen) und 'Expand' (Erzeugung mehrerer kryptographisch unabhaengiger Schluessel); reines HMAC vermischt diese Schritte und kann bei schlechter Entropie versagen",
        answerC = "HKDF verwendet einen laengeren internen Zustand als HMAC und ist daher resistenter gegen Brute-Force",
        answerD = "HKDF ist eine standardisierte Alternative zu PBKDF2 fuer Passwort-Hashing mit Speicher-Hardness",
        correctAnswer = 1,
        explanation = "HKDF (RFC 5869, Hugo Krawczyk) hat zwei Phasen: Extract(salt, IKM) -> PRK verwendet HMAC um aus moeglicherweis schwachem Input-Keying-Material (IKM) ein gleichmaessig verteiltes PRK zu ziehen. Expand(PRK, info, L) leitet daraus beliebig lange, kontextuell getrennte Schluessel ab. Der 'info'-Parameter stellt sicher, dass Schluessel fuer verschiedene Zwecke (Encryption vs. MAC) kryptographisch unabhaengig sind.",
        difficulty = 5,
        funFact = null
    ),
    // 23
    Question(
        categoryId = 7,
        questionText = "Was ist Byzantine Fault Tolerance (BFT) und wie unterscheidet sich PBFT (Practical BFT) vom Nakamoto-Konsens in Bezug auf Finality?",
        answerA = "BFT toleriert Knotenausfaelle; PBFT erfordert 2/3 Mehrheit und bietet sofortige Finality; Nakamoto-Konsens bietet nur probabilistische Finality nach ausreichend Bloecken",
        answerB = "BFT toleriert Netzwerkpartitionierung; PBFT ist fuer Blockchain-Konsens optimiert; Nakamoto bietet sofortige Finality durch Proof-of-Work",
        answerC = "Beide haben identische Finality-Eigenschaften; PBFT ist nur skalierbarer als Nakamoto",
        answerD = "PBFT und Nakamoto haben beide sofortige Finality, unterscheiden sich nur im Kommunikationsaufwand",
        correctAnswer = 0,
        explanation = "PBFT (Castro & Liskov, 1999) toleriert bis zu f byzantinische Knoten bei 3f+1 Gesamtknoten. Nach drei Phasen (Pre-Prepare, Prepare, Commit) ist ein Block endgueltig (absolute Finality) — er wird nie revertiert. Nakamoto-Konsens (Bitcoin) hat probabilistische Finality: Je mehr Bloecke auf einem Block aufgebaut wurden, desto unwahrscheinlicher eine Reorganisation. Es gibt keinen exakten Abschlusspunkt.",
        difficulty = 5,
        funFact = "PBFT hat O(n^2) Nachrichtenkomplexitaet und skaliert praktisch nur bis ~100 Knoten. Tendermint und HotStuff optimieren dies auf O(n) durch lineare Kommunikation."
    ),
    // 24
    Question(
        categoryId = 7,
        questionText = "Was ist eine Content Security Policy (CSP) und welchen Angriff verhindert sie primaer?",
        answerA = "CSP ist ein TLS-Erweiterungsheader, der HTTPS erzwingt und SSL-Stripping verhindert",
        answerB = "CSP ist ein HTTP-Response-Header der festlegt, welche Quellen fuer Skripte, Styles und andere Ressourcen erlaubt sind; primaer verhindert es Cross-Site Scripting (XSS) durch Blockierung inline-Skripte und externer unautoriserter Quellen",
        answerC = "CSP ist ein Browser-Mechanismus zum Schutz vor CSRF-Angriffen durch Origin-Validierung",
        answerD = "CSP verschluesselt HTTP-Inhalte zwischen Browser und Server um Man-in-the-Middle-Angriffe zu verhindern",
        correctAnswer = 1,
        explanation = "CSP (Content-Security-Policy Header) erlaubt z.B. 'script-src 'nonce-{random}' https://cdn.example.com'. Ohne passenden Nonce oder whitelisted Host wird JavaScript nicht ausgefuehrt. Damit ist reflektiertes XSS unwirksam, selbst wenn der Angreifer Skript-Injection erreicht — der Browser verweigert die Ausfuehrung. Strikte CSP mit 'strict-dynamic' und Nonces ist Best Practice.",
        difficulty = 5,
        funFact = null
    ),
    // 25
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert der SameSite-Cookie-Mechanismus und welchen konkreten Angriff verhindert er?",
        answerA = "SameSite=Strict/Lax verhindert Cross-Site Request Forgery (CSRF) indem Cookies bei cross-site Anfragen nicht gesendet werden; Strict sendet niemals bei cross-site, Lax erlaubt GET-Navigationen von externen Sites",
        answerB = "SameSite verhindert Cookie-Diebstahl durch XSS indem Cookies nicht per JavaScript zugreifbar sind",
        answerC = "SameSite ist ein Verschluesselungsattribut das Cookie-Inhalte bei der Uebertragung schuetzt",
        answerD = "SameSite beschraenkt Cookie-Lebensdauer auf die aktuelle Browser-Session um Fixation-Angriffe zu verhindern",
        correctAnswer = 0,
        explanation = "CSRF nutzt aus, dass Browser Cookies automatisch mitsenden — auch bei Anfragen die von einer fremden Website ausgeloest werden. SameSite=Strict sendet den Cookie niemals bei cross-site Anfragen (auch nicht bei Navigationen via Links). SameSite=Lax erlaubt GET-Navigationen aber blockiert POST-Requests von externen Sites. SameSite=None;Secure sendet immer (benoetigt fuer legitime Cross-Site-Flows wie OAuth).",
        difficulty = 5,
        funFact = "Chrome setzte 2020 SameSite=Lax als Standard fuer alle Cookies ohne explizites SameSite-Attribut durch — ein bedeutender Sicherheitsgewinn fuer Milliarden Webseiten."
    ),
    // 26
    Question(
        categoryId = 7,
        questionText = "Was ist Certificate Transparency (CT) und wie erkennt ein Browser einen nicht protokollierten, boeswillig ausgestellten Zertifikat?",
        answerA = "CT ist ein System, bei dem Zertifikate in oeffentliche, kryptographisch prueifbare Logs eingetragen werden muessen; Browser pruefen SCTs (Signed Certificate Timestamps) im Zertifikat oder TLS-Extension und verweigern Zertifikate ohne vertrauenswuerdige SCTs",
        answerB = "CT ist ein OCSP-Erweiterungsprotokoll, das Zertifikat-Revokationsstatus in Echtzeit prueft",
        answerC = "CT ist ein DNS-basiertes Verfahren, das CA-Berechtigungen durch CAA-Records beschraenkt",
        answerD = "CT ist ein Multi-Signature-Verfahren bei dem mehrere CAs jedes Zertifikat gemeinsam signieren muessen",
        correctAnswer = 0,
        explanation = "CT-Logs (betrieben von Google, Cloudflare etc.) sind Merkle-Baeume in die CAs alle ausgestellten Zertifikate einpflegen muessen. Beim Einpflegen erhaelt die CA einen SCT (Signed Certificate Timestamp) — ein kryptographischer Beweis fuer die Log-Aufnahme. Chrome verlangt seit 2018 mindestens zwei SCTs von unterschiedlichen Logs. Firefox fuehrte CT-Enforcement erst 2025 mit Version 135 ein. So kann ein Wildcard-Zertifikat nicht heimlich ausgestellt werden, ohne publiziert zu werden.",
        difficulty = 5,
        funFact = null
    ),
    // 27
    Question(
        categoryId = 7,
        questionText = "Was ist OCSP Stapling und welches Datenschutzproblem des urspruenglichen OCSP-Protokolls loest es?",
        answerA = "OCSP Stapling verhindert Revokationschecks gaenzlich und verlaeert auf kurzlebige Zertifikate statt",
        answerB = "OCSP Stapling erlaubt dem Server eine vorab abgerufene OCSP-Antwort direkt im TLS-Handshake mitzuliefern; es loest das Problem, dass klassisches OCSP dem CA veraet, wann welcher Client ein bestimmtes Zertifikat prueft",
        answerC = "OCSP Stapling ist eine Caching-Erweiterung die OCSP-Anfragen auf CDN-Server auslagert",
        answerD = "OCSP Stapling kryptographisch bindet OCSP-Antworten an den TLS-Session-Schluessel um Replay-Angriffe zu verhindern",
        correctAnswer = 1,
        explanation = "Standard-OCSP: Der Browser kontaktiert den CA's OCSP-Responder — der CA erfaehrt damit jedes Mal wenn ein Client eine Website besucht. OCSP Stapling (RFC 6066): Der Server ruft selbst periodisch OCSP-Antworten ab und sendet diese 'gestapelt' im TLS Certificate Status Request. Der Client prueft Signatur und Gueltigkeit ohne den CA direkt zu kontaktieren. Datenschutzproblem: geloest. Echtzeit-Revokation: bei laengerer OCSP-Antwort-Gueltigkeit eingeschraenkt.",
        difficulty = 5,
        funFact = "OCSP Must-Staple (eine X.509-Extension) erzwingt, dass Browser ein Zertifikat ablehnen, wenn kein gueltiges OCSP-Staple vorhanden ist — ein hardcoded Revokationsschutz."
    ),
    // 28
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert ein Hardware Security Module (HSM) und warum ist es gegenueber Software-Schluesselspeicherung vorzuziehen?",
        answerA = "Ein HSM ist ein verschluesseltes USB-Laufwerk fuer Schluesselspeicherung mit PIN-Schutz",
        answerB = "Ein HSM ist ein manipulationsgeschuetztes Hardwaregeraet das kryptographische Operationen intern ausfuehrt und private Schluessel niemals im Klartext exportiert; Software-Speicher ist anfaellig fuer Memory-Dumps, OS-Kompromittierungen und Insider-Angriffe",
        answerC = "Ein HSM ist ein FIPS-zertifizierter Software-Keystore der durch kryptographische Verschluesselung geschuetzt ist",
        answerD = "Ein HSM ist ein dedizierter Krypto-Prozessor der Verschluesselung beschleunigt aber keine zusaetzliche Sicherheit gegenueaber Software bietet",
        correctAnswer = 1,
        explanation = "HSMs (z.B. Thales Luna, AWS CloudHSM, YubiHSM) enthalten tamper-evident/tamper-resistant Hardware: Schluessel werden intern erzeugt und verbleiben im HSM. Alle kryptographischen Operationen (Sign, Encrypt) laufen im HSM ab — der Host-Computer sieht niemals den privaten Schluessel. Bei physischem Einbruchsversuch loeschen HSMs automatisch alle Schluessel. FIPS 140-2/3 Level 3 zertifizierte HSMs sind der Goldstandard.",
        difficulty = 5,
        funFact = null
    ),
    // 29
    Question(
        categoryId = 7,
        questionText = "Was ist das CORS-Protokoll (Cross-Origin Resource Sharing) und was ist der Unterschied zwischen 'Simple Requests' und 'Preflight Requests'?",
        answerA = "CORS ist ein Cookie-Schutzverfahren; Simple Requests sind GET-Anfragen; Preflight sind POST-Anfragen",
        answerB = "CORS ist ein Browser-Mechanismus fuer cross-origin Anfragen; Simple Requests (GET/HEAD/POST mit sicheren Content-Types) werden direkt gesendet mit Origin-Header; Preflight-Requests (PUT/DELETE oder custom Headers) senden zuvor eine OPTIONS-Anfrage um Servererlaubnis einzuholen",
        answerC = "CORS unterscheidet nur nach HTTP-Methode; GET ist immer Simple, POST ist immer Preflight",
        answerD = "CORS ist serverseitig implementiert und benoetigt keine Browser-Unterstuetzung; Simple Requests verwenden JWT, Preflight verwendet OAuth",
        correctAnswer = 1,
        explanation = "Simple Requests erfuellen alle Bedingungen (GET/HEAD/POST; nur CORS-sichere Header wie Content-Type: text/plain, application/x-www-form-urlencoded, multipart/form-data). Der Browser sendet sie direkt, aber der Server muss Access-Control-Allow-Origin zurueckgeben. Preflight: Bei PUT, DELETE, Custom-Headers oder Content-Type: application/json sendet der Browser zuerst OPTIONS. Ohne korrekte Access-Control-Allow-* Header wird die eigentliche Anfrage nicht ausgefuehrt.",
        difficulty = 5,
        funFact = "CORS schuetzt nicht serverseitige Ressourcen — ein CORS-Fehler erscheint nur im Browser. Curl oder Python-Requests ignorieren CORS vollstaendig, was einen verbreiteten Irrtum erzeugt."
    ),
    // 30
    Question(
        categoryId = 7,
        questionText = "Was ist ein Zero-Knowledge-Beweis (ZKP) formal und welche drei Eigenschaften muss er erfullen?",
        answerA = "Ein ZKP ist ein Verschluesselungsprotokoll; Eigenschaften: Vertraulichkeit, Integritaet, Verfuegbarkeit",
        answerB = "Ein ZKP ist ein interaktives Protokoll das Wissen beweist ohne es zu offenbaren; drei Eigenschaften: Vollstaendigkeit (ehrlicher Prover ueberzeugt Verifier), Korrektheit (luegender Prover ueberzeugt Verifier nur mit vernachlaessigbarer Wahrscheinlichkeit), Zero-Knowledge (Verifier lernt nichts ausser der Wahrheit der Aussage)",
        answerC = "Ein ZKP ist ein deterministischer Algorithmus; Eigenschaften: Effizienz, Korrektheit, Nicht-Ableitbarkeit",
        answerD = "Ein ZKP beweist die Identitaet einer Person; Eigenschaften: Authentizitaet, Unabstreitbarkeit, Anonymitaet",
        correctAnswer = 1,
        explanation = "Formell: Sei x eine Aussage, w ein Zeuge. (1) Vollstaendigkeit: Wenn (x,w) in R, dann akzeptiert ehrlicher Verifier. (2) Korrektheit (Soundness): Wenn x nicht in L, kann kein Prover (auch nicht polynomiale Adversaer) Verifier mit nicht-vernachlaessigbarer Wahrscheinlichkeit ueberzeugen. (3) Zero-Knowledge: Es existiert ein Simulator S sodass die Ausgabe von S(x) fuer Verifier computationally indistinguishable von echter Protokoll-Ausgabe ist.",
        difficulty = 5,
        funFact = null
    ),
    // 31
    Question(
        categoryId = 7,
        questionText = "Was ist ein Power-Analysis-Angriff der 'Simple Power Analysis' (SPA) Klasse und wie unterscheidet er sich von DPA?",
        answerA = "SPA analysiert einen einzelnen Stromverbrauchstrace um direkt kryptographische Operationen abzulesen; DPA benoetigt statistisch viele Traces und Korrelationsanalyse",
        answerB = "SPA ist eine softwarebasierte Analyse; DPA benoetigt physischen Zugang zur Hardware",
        answerC = "SPA und DPA sind identisch, unterscheiden sich nur in der verwendeten Hardware",
        answerD = "SPA analysiert den Stromverbrauch von SPA-speziell aufgebauten Schaltkreisen; DPA analysiert Standard-CPUs",
        correctAnswer = 0,
        explanation = "Bei SPA (Simple Power Analysis) kann ein einzelner Stromverbrauchstrace ausreichen um den Algorithmus sichtbar zu machen: z.B. der klassische Square-and-Multiply RSA-Algorithmus erzeugt unterschiedliche Muster fuer Bit=0 (nur Square) und Bit=1 (Square + Multiply). DPA hingegen braucht viele Messungen mit verschiedenen Klartexten und nutzt statistische Methoden (Korrelation, Differenzierung) um Schlusselbits zu extrahieren, die in einem einzelnen Trace nicht direkt sichtbar sind.",
        difficulty = 5,
        funFact = "Gegen SPA hilft 'Always Doubling': Immer Square AND Multiply ausfuehren (Dummy-Multiply bei Bit=0), sodass das Trace-Muster einheitlich aussieht."
    ),
    // 32
    Question(
        categoryId = 7,
        questionText = "Was ist ein Fault-Injection-Angriff (Differential Fault Analysis, DFA) und wie kann er AES brechen?",
        answerA = "DFA injiziert Malware in AES-Implementierungen um den Schluessel in Log-Dateien zu schreiben",
        answerB = "DFA induziert physische Fehler (z.B. Spannungsspitzen, Laser) in kryptographische Berechnungen und vergleicht fehlerhafte mit korrekten Ausgaben um Rueckschluesse auf den Schluessel zu ziehen",
        answerC = "DFA ist ein Software-Fuzzing-Verfahren das AES-Implementierungen mit fehlerhaften Eingaben testet",
        answerD = "DFA nutzt differentielle Kryptanalyse auf AES-Runden mit schwachen Schluesseln",
        correctAnswer = 1,
        explanation = "Bei AES-DFA: Ein Fehler wird in der 8. oder 9. Runde injiziert (z.B. durch Laser auf die CPU). Das ergibt einen fehlerhaften Chiffretext. Durch Vergleich des korrekten und fehlerhaften Chiffretextes laesst sich mithilfe der bekannten AES-Differentialstruktur der letzte Rundenschluessel auf 232 Moeglichkeiten einschraenken — weitere Messungen reduzieren auf wenige oder einen Schluessel. Der Hauptschluessel folgt durch Rueckwaertsexpansion.",
        difficulty = 5,
        funFact = null
    ),
    // 33
    Question(
        categoryId = 7,
        questionText = "Was ist Meltdown und wie unterscheidet es sich mechanistisch von Spectre?",
        answerA = "Meltdown und Spectre sind identische Angriffe auf unterschiedlichen Betriebssystemen",
        answerB = "Meltdown nutzt Out-of-Order-Ausfuehrung auf kernelgeschuetzten Seiten ohne Branchprediction; ein laufender Prozess kann Kernel-Speicher lesen bevor die Exception verarbeitet wird. Spectre manipuliert Branch-Predictor-Training um einen Victim-Prozess dazu zu bringen spekulativ auf eigene Speichergrenzen zuzugreifen",
        answerC = "Meltdown ist ein physischer Angriff auf DRAM; Spectre ist ein Software-Exploit fuer JIT-Compiler",
        answerD = "Meltdown betrifft nur AMD-CPUs; Spectre nur Intel-CPUs",
        correctAnswer = 1,
        explanation = "Meltdown: Out-of-Order-Execution fuehrt Speicherzugriffe auf kernel-Adressen aus bevor die Schutzpruefung abgeschlossen ist. Das Ergebnis landet im Cache. Obwohl eine Exception ausgeloest wird, ist der Cache-Zustand messbar. Meltdown ist komplett mit Kernel-Page-Table-Isolation (KPTI/KAISER) patchbar. Spectre: Betrifft alle spekulativen Prozessoren; erfordert Compiler-Mitigationen (Retpoline), microcode-Updates, und ISA-Aenderungen — praktisch unloesbar ohne Performance-Einbussen.",
        difficulty = 5,
        funFact = "KPTI-Patches fuer Meltdown kosteten Linux 5-30% Performance bei system-call-intensiven Workloads (wie Datenbanken) durch das aufwendige Umschalten der Page-Tables."
    ),
    // 34
    Question(
        categoryId = 7,
        questionText = "Was ist das Konzept des 'Toxic Waste' beim zk-SNARK Trusted Setup und welchen Ansatz verwendet Zcash's Multi-Party Ceremony?",
        answerA = "Toxic Waste beschreibt veraltete kryptographische Parameter; Zcash nutzt veraltete DH-Parameter fuer Kompatibilitaet",
        answerB = "Toxic Waste sind die geheimen Zufallsparameter (tau, alpha, beta) aus dem Trusted Setup — wer sie kennt kann falsche Beweise erstellen; Zcash nutzt eine Multi-Party Computation Ceremony wo viele Teilnehmer sequentiell Parameter erzeugen: das Ergebnis ist sicher solange mindestens ein Teilnehmer seinen Anteil vernichtet hat",
        answerC = "Toxic Waste ist der ueberschuessige Rechenaufwand des Trusted Setups; Zcash verteilt ihn auf Mining-Nodes",
        answerD = "Toxic Waste beschreibt Sidechannel-Lecks im Trusted Setup; Zcash nutzt HSMs um physische Sicherheit zu garantieren",
        correctAnswer = 1,
        explanation = "Bei Groth16-SNARKs werden Strukturparameter (Common Reference String) aus Zufallswerten (Toxic Waste) erzeugt. Kennt ein Angreifer diese Werte, kann er beliebige falsche Aussagen 'beweisen'. Zcash's Sapling MPC Ceremony (2018): 90+ unabhaengige Teilnehmer fuehrten sequentiell MPC-Schritte aus und vernichteten danach ihre Teile. Die mathematische Sicherheitsgarantie: Alle Teilnehmer muessten kollaborieren — eine vertretbare Annahme.",
        difficulty = 5,
        funFact = null
    ),
    // 35
    Question(
        categoryId = 7,
        questionText = "Was ist ein Shadow Stack und wie implementiert Intel CET (Control-flow Enforcement Technology) ihn?",
        answerA = "Ein Shadow Stack ist eine verschluesselte Kopie des regulaeren Stacks im Kernel-Space",
        answerB = "Ein Shadow Stack ist ein separater, hardware-geschuetzter Speicherbereich der ausschliesslich Rueckgabeadressen speichert; bei CALL wird die Adresse auf beiden Stacks abgelegt, bei RET prueft die CPU ob beide uebereinstimmen — Manipulation des regulaeren Stacks fuehrt zu einem Schutzsignal",
        answerC = "Ein Shadow Stack ist ein ASLR-randomisierter Stack-Klon der Buffer-Overflows durch Adressraumtrennung verhindert",
        answerD = "Ein Shadow Stack ist ein Software-Mechanismus der Kanarienwert-Checks auf alle Stack-Frames ausdehnt",
        correctAnswer = 1,
        explanation = "Intel CET (ab Tiger Lake, 2020) fuehrt zwei neue Features ein: Shadow Stack (SHSTK) fuer Backward-Edge CFI und Indirect Branch Tracking (IBT) fuer Forward-Edge CFI via ENDBR64-Instruktionen. Der Shadow Stack liegt in einem speziellen Speicherbereich mit beschraenkten Write-Berechtigungen (nur via spezieller WRSS-Instruktion). Bei einem Stack-Smashing-Angriff aendert sich der regulaere Stack, nicht der Shadow Stack — die CPU detektiert die Abweichung bei RET.",
        difficulty = 5,
        funFact = "Windows 10/11 aktiviert Shadow Stacks fuer alle kompatiblen x64-Prozesse durch Hardware-Supported Stack Protection (HSSP) — ein bedeutender Fortschritt gegen ROP ohne Performance-Kosten."
    ),
    // 36
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen Semantic Security und IND-CCA2-Sicherheit fuer Verschluesselungsverfahren?",
        answerA = "Semantic Security bedeutet Vertraulichkeit; IND-CCA2 ist ein veralteter Standard der ersetzt wurde",
        answerB = "Semantische Sicherheit (IND-CPA) bedeutet, dass ein Angreifer mit Zugang zu einem Verschluesselungsorakel keine Informationen aus Chiffretexten gewinnen kann; IND-CCA2 ist staerker und erlaubt dem Angreifer zusaetzlich beliebige Entschluesselung (ausser dem Challenge-Chiffretext) — notwendig fuer Sicherheit gegen aktive Angreifer",
        answerC = "Semantische Sicherheit gilt nur fuer symmetrische Kryptographie; IND-CCA2 nur fuer asymmetrische",
        answerD = "IND-CCA2 ist schwaecher als semantische Sicherheit da es weniger Angreifermodelle beruecksichtigt",
        correctAnswer = 1,
        explanation = "IND-CPA (Indistinguishability under Chosen Plaintext Attack) = semantische Sicherheit. IND-CCA2 (adaptive CCA): Der Angreifer kann VOR und NACH der Challenge beliebige Chiffretexte entschluesseln lassen (ausser den Challenge-Chiffretext). RSA-OAEP und AES-GCM sind IND-CCA2-sicher. Unpadded RSA und CBC-Modus (ohne MAC) sind es nicht — Padding-Oracle-Angriffe wie PKCS#1v1.5-Angriffe (ROBOT) nutzen genau die CCA2-Schwaeche aus.",
        difficulty = 5,
        funFact = null
    ),
    // 37
    Question(
        categoryId = 7,
        questionText = "Was ist Garbled Circuit Evaluation und wie sichert Oblivious Transfer die Privatsphäre des Evaluators?",
        answerA = "Oblivious Transfer ermoeglicht dem Garbler alle Schluessel zu kennen waehrend der Evaluator nur seinen Input weiss",
        answerB = "Der Garbler verschluesselt jeden Gate mit den Ausgabeschluesseln; Oblivious Transfer erlaubt dem Evaluator fuer seinen Eingabebit den richtigen Schluessel zu erhalten ohne dem Garbler zu verraten welchen Bit er ausgewaehlt hat",
        answerC = "Oblivious Transfer verschluesselt die Verbindung zwischen Garbler und Evaluator mit einem ephemeren Schluessel",
        answerD = "Garbled Circuits benoetigen kein Oblivious Transfer wenn beide Parteien vertrauen",
        correctAnswer = 1,
        explanation = "Grundprinzip: Fuer jeden Wire hat der Garbler zwei Schluessel (k0, k1) fuer Bit 0 und 1. Der Evaluator braucht den Schluessel der seinem Input-Bit entspricht. 1-aus-2 Oblivious Transfer (OT): Der Evaluator waehlt i∈{0,1}; er erhaelt ki ohne dem Garbler zu sagen welches i er ausgewaehlt hat. Der Garbler lernt nicht den Eingabebit des Evaluators. So bleibt die Eingabe des Evaluators privat waehrend er den Schaltkreis korrekt auswerten kann.",
        difficulty = 5,
        funFact = "Modernes Half-Gate-Garbling (Zahur, Rosulek, Evans, 2015) reduziert die Kommunikation auf 2 AES-Bloecke pro AND-Gate — ein 2x Verbesserung gegenueber dem Yao-Originalschema."
    ),
    // 38
    Question(
        categoryId = 7,
        questionText = "Was ist das Learning Parity with Noise (LPN) Problem und fuer welche kryptographische Primitiven wird es eingesetzt?",
        answerA = "LPN ist ein Variante von RSA fuer ressourcenbeschraenkte Geraete; eingesetzt fuer Schluesseltausch",
        answerB = "LPN ist das Problem, einen geheimen Vektor s zu finden aus vielen verrauschten Skalarprodukten (a_i, s) + e_i mod 2; eingesetzt fuer leichtgewichtige Authentifizierungsprotokolle (HB-Familie) und MACs auf eingebetteten Systemen",
        answerC = "LPN ist ein Quantenalgorithmus zur Losung von Gitterproblemen; eingesetzt in post-quanten Schluesseltausch",
        answerD = "LPN ist eine Variante von SHA-3 mit Noise-Padding; eingesetzt fuer IoT-Hashfunktionen",
        correctAnswer = 1,
        explanation = "LPN: Gegeben (A, b=As+e) wobei A eine Zufallsmatrix, s der Geheimvektor, e ein Bitsvektor mit niedrigem Hamming-Gewicht (Rauschen). Das Loesen fuer s ist vermutlich quantenresistent. HB-Protokoll (Hopper & Blum, 2001) und seine Nachfolger (HB+, HB#) verwenden LPN fuer RFID-Authentifizierung mit extrem niedrigem Rechenaufwand — nur XOR und AND-Operationen noetig.",
        difficulty = 5,
        funFact = null
    ),
    // 39
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert das CRYSTALS-Dilithium Signaturverfahren (ML-DSA) auf hohem Niveau und welche mathematische Struktur nutzt es?",
        answerA = "Dilithium nutzt elliptische Kurven-Pairing und signiert durch Punktmultiplikation in einem Gitter",
        answerB = "Dilithium basiert auf dem Module-LWE und Module-SIS Problem; es erzeugt Signaturen durch einen Fiat-Shamir-Ansatz mit 'Rejection Sampling' um zu verhindern, dass der Zufallsvektor Information ueber den Geheimschluessel leakt",
        answerC = "Dilithium verwendet Hash-Trees wie XMSS aber mit polynomialen Ringen fuer kuerzere Signaturen",
        answerD = "Dilithium ist eine Variante von RSA-PSS fuer post-quanten Sicherheit durch groessere Moduln",
        correctAnswer = 1,
        explanation = "Dilithium (NIST ML-DSA, FIPS 204): Geheimschluessel (s1, s2) sind Polynome mit kleinen Koeffizienten. Signatur: Waehle Zufallsvektor y, berechne w=Ay, c=Hash(mu, w), z=y+s1*c. Rejection Sampling: Falls z zu gross ist (veraet Informationen ueber s1), wird y neu gewaehlt und von vorn begonnen. Oeffentlicher Schluessel: t=As1+s2. Verifikation: Az ?= t*c + Restvektor.",
        difficulty = 5,
        funFact = "Dilithium-2 hat 1312 Bytes oeffentliche Schluessel, 2420 Bytes Signaturen — gegenueber Ed25519's 32/64 Bytes. Der Groessenunterschied erklaert die Herausforderungen bei der TLS-Integration."
    ),
    // 40
    Question(
        categoryId = 7,
        questionText = "Was ist ein Padding-Oracle-Angriff (z.B. POODLE, BEAST) und welches Kernprinzip liegt ihm zugrunde?",
        answerA = "Ein Padding-Oracle-Angriff nutzt Timing-Unterschiede beim RSA-Signaturvorgang",
        answerB = "Ein Padding-Oracle-Angriff nutzt die Tatsache, dass ein Server unterschiedlich auf korrekt vs. falsch gepaddete Chiffretexte reagiert; der Angreifer sendet modifizierte Chiffretexte und schliesst aus der Server-Antwort (Fehlercode, Timing, Verbindungsabbruch) auf den Klartext Byte fuer Byte",
        answerC = "Ein Padding-Oracle ist ein Seitenkanal der bei RSA-OAEP die Padding-Bytes direkt leakt",
        answerD = "Ein Padding-Oracle-Angriff modifiziert TLS-Handshake-Pakete um schwache Cipher Suites zu erzwingen",
        correctAnswer = 1,
        explanation = "Bei CBC-Mode AES: Entschluesselung eines Blocks ist D(C_i) XOR C_{i-1}. Aendern des letzten Bytes von C_{i-1} aendert das letzte Byte des Klartexts. Ein Padding-Oracle (Server antwortet anders bei gueltiger vs. ungueltiger PKCS#7-Padding) erlaubt es das letzte Byte schrittweise zu bestimmen: Teste 256 Moeglichkeiten fuer das letzte Byte bis PKCS#7-Padding gueltig ist. Dann das vorletzte, etc. Ergebnis: vollstaendige Entschluesselung ohne Schluessel.",
        difficulty = 5,
        funFact = null
    ),
    // 41
    Question(
        categoryId = 7,
        questionText = "Was ist das Konzept der 'Transcript Security' in sigma-Protokollen und wie wird es fuer die Fiat-Shamir-Transformation benoetigt?",
        answerA = "Transcript Security bedeutet, dass alle Protokoll-Nachrichten verschluesselt werden muessen",
        answerB = "Transcript Security (Special Honest-Verifier Zero-Knowledge, SHVZK) garantiert dass ein Simulator S bei gegebenem Commitment und Challenge ein ununterscheidbares Transcript erzeugen kann; das ist die Vorbedingung fuer die Fiat-Shamir-Transformation die den Verifier durch einen Random-Oracle-Hash simuliert",
        answerC = "Transcript Security verhindert, dass Verifier Transkripte aufzeichnen und spaeter missbrauchen koennen",
        answerD = "Transcript Security ist eine Eigenschaft von ZK-Beweissystemen die Soundness ohne Interaktivitaet garantiert",
        correctAnswer = 1,
        explanation = "SHVZK: Ein Sigma-Protokoll (commit, challenge, response) ist SHVZK wenn es einen Simulator S gibt, der ohne Zeuge w, bei Eingabe x und zufaelliger Challenge c, ein Transcript (A, c, z) erzeugen kann das computationally ununterscheidbar vom echten Protokolltranscript ist. Fiat-Shamir: Der Verifier wird durch H(A, x) als Challenge ersetzt. Das funktioniert sicher nur im Random-Oracle-Modell, wenn das Sigma-Protokoll SHVZK ist — sonst koennte ein Prover A so waehlen, dass er den Hash kennt bevor er committed.",
        difficulty = 5,
        funFact = "Im Standard-Modell (ohne Random Oracle) gibt es Sigma-Protokolle die zwar SHVZK sind aber deren Fiat-Shamir-Transformation trotzdem unsicher ist — eine wichtige theoretische Warnung."
    ),
    // 42
    Question(
        categoryId = 7,
        questionText = "Was ist Nakamoto-Konsens und wie verhindert er Double-Spending ohne zentrale Autoritaet?",
        answerA = "Nakamoto-Konsens verwendet BFT-Abstimmungen unter Knoten um Transaktionen zu bestaetigen",
        answerB = "Nakamoto-Konsens nutzt Proof-of-Work als Sybil-Resistenz: Die laengste Chain mit meister kumulierter Arbeit gilt als kanonoisch. Double-Spending erfordert mehr als 50% der Hashrate um eine alternative Chain aufzubauen die laenger wird als die ehrliche Chain — ab einer gewissen Tiefe praktisch unmoeglich",
        answerC = "Nakamoto-Konsens verhindert Double-Spending durch kryptographische Nullifikatoren wie in Zcash",
        answerD = "Nakamoto-Konsens nutzt Reputation-basierte Knoten-Auswahl; Double-Spending ist durch Wirtschaftssanktionen verhindert",
        correctAnswer = 1,
        explanation = "Satoshis Kernidee: Arbeit (SHA-256-Hashine) ist der Proof-of-Stake. Die Chain mit der groessten kumulierten Arbeit (nicht Laenge) ist kanonoisch. Bei 6 Bestaetigungen benoetigt ein Angreifer mit Hashrate q < 0.5 eine exponentiell abnehmende Wahrscheinlichkeit die ehrliche Chain einzuholen. Die Wahrscheinlichkeit p_z ist Gambler's-Ruin-Variante: p_z = 1 - (Summe ...) — Satoshi berechnete dies in Abschnitt 11 des Whitepapers.",
        difficulty = 5,
        funFact = null
    ),
    // 43
    Question(
        categoryId = 7,
        questionText = "Was ist ein Sybil-Angriff in P2P-Netzwerken und welche Mechanismen verschiedener Blockchain-Typen verhindern ihn?",
        answerA = "Ein Sybil-Angriff ist ein DDoS-Angriff mit vielen IP-Adressen; verhindert durch IP-Rate-Limiting",
        answerB = "Ein Sybil-Angriff erstellt viele pseudonyme Identitaeten um Konsens zu manipulieren; Proof-of-Work bindet Stimmrecht an physische Rechenarbeit, Proof-of-Stake an oekonomisches Kapital, permissioned BFT-Netzwerke an verifizierte Identitaeten",
        answerC = "Ein Sybil-Angriff kompromittiert einzelne hochrangige Knoten; verhindert durch Knoten-Reputation-Systeme",
        answerD = "Ein Sybil-Angriff injiziert gefaelschte Transaktionen; verhindert durch digitale Signaturen",
        correctAnswer = 1,
        explanation = "Sybil: Da Knoten-Identitaeten kostenlos erzeugt werden koennen, koennte ein Angreifer 51% aller Knoten kontrollieren. PoW: Stimmgewicht proportional zur Hashrate — teuer zu faelschen. PoS: Stimmgewicht proportional zum eingesetzten Kapital — Angriff schadet dem eigenen Kapital. Permissioned (Hyperledger Fabric): Knotenmitgliedschaft durch CA-Zertifikate — Sybil-Angriff erfordert CA-Kompromittierung.",
        difficulty = 5,
        funFact = "Der Begriff 'Sybil' stammt von einem 1973 erschienenen Buch ueber eine Person mit mehreren Persoenlichkeiten — John Douceur verwendete den Begriff 2002 in seinem einflussreichen Paper."
    ),
    // 44
    Question(
        categoryId = 7,
        questionText = "Was ist Format String Exploitation und warum ist `printf(user_input)` anstatt `printf(\"%s\", user_input)` gefaehrlich?",
        answerA = "Format String Bugs entstehen durch unzureichende Laengenpruefung; gefaehrlich weil Stack-Overflow moeglich ist",
        answerB = "Bei `printf(user_input)` interpretiert printf die Benutzereingabe als Format-String; %x/%p liest Stack-Werte (Information Leak), %n schreibt die Anzahl bisher ausgegebener Zeichen in einen Stack-Pointer — damit kann beliebiger Speicher beschrieben werden (beliebige Code-Ausfuehrung)",
        answerC = "Format String Exploitation nutzt Heap-Overflow um Formatierungsdaten zu ueberschreiben",
        answerD = "Format String Bugs betreffen nur C++ Streams nicht die C printf-Familie",
        correctAnswer = 1,
        explanation = "printf liest Stack-Argumente gemaess Format-String. Mit '%x%x%x' liest der Angreifer Stack-Werte aus (Info-Leak fuer Adressraumuntersuchung). Mit '%n' schreibt printf die Anzahl der ausgegebenen Zeichen an die naechste Stack-Adresse — der Angreifer kann gezielt Speicher (z.B. GOT-Eintraege) ueberschreiben. '%1000000x%n' schreibt den Wert 1000000 an eine kontrollierte Adresse. Ergebnis: Vollstaendige Code-Ausfuehrung.",
        difficulty = 5,
        funFact = null
    ),
    // 45
    Question(
        categoryId = 7,
        questionText = "Was ist das 'Confused Deputy Problem' in Informationssicherheit und welches Webschutz-Konzept basiert darauf?",
        answerA = "Das Confused Deputy Problem beschreibt einen Angriff auf Datenbanken durch SQL-Injection",
        answerB = "Das Confused Deputy Problem: Ein Programm mit hohen Privilegien handelt im Auftrag eines Angreifers ohne es zu wissen; CSRF (Cross-Site Request Forgery) ist eine Web-Instanz: Der Browser (Deputy mit Session-Cookie) wird von einer boesen Website als Beauftragter fuer unauthorisierte Aktionen missbraucht",
        answerC = "Das Confused Deputy Problem beschreibt Race Conditions in Betriebssystem-Kernel-Calls",
        answerD = "Das Confused Deputy Problem ist ein kryptographisches Protokoll-Angriffsmuster auf Delegation",
        correctAnswer = 1,
        explanation = "Hardy (1988): Ein Compiler (Deputy) mit Schreibrechten auf Abrechnungsdateien wird durch eine manipulierte Datei dazu gebracht, die Abrechnungsdatei zu ueberschreiben. Im Web: Der Browser sendet automatisch Cookies (Session-Token) mit jeder Anfrage — auch wenn die Anfrage von einer fremden Website ausgeloest wurde. CSRF-Tokens loesen das Problem: Der 'Deputy' (Browser) ueberprueft ob die Anfrage tatsaechlich vom autorisierten Formular stammt.",
        difficulty = 5,
        funFact = "Mark Miller, einer der Autoren des E-Programmiersprache-Systems, verallgemeinerte das Confused Deputy Problem zu einem fundamentalen Sicherheitsprinzip: Capabilities statt ambient authority."
    ),
    // 46
    Question(
        categoryId = 7,
        questionText = "Was ist ein Use-After-Free (UAF) Vulnerability und wie schützt Memory Tagging (ARM MTE) dagegen?",
        answerA = "UAF entsteht durch Doppel-Free von Heap-Objekten; ARM MTE verhindert dies durch Garbage Collection",
        answerB = "UAF entsteht wenn ein Zeiger nach free() noch verwendet wird; ARM MTE versieht jeden Heap-Chunk mit einem Tag (4 Bits) im Zeiger; nach free() aendert sich der Tag des Speicherbereichs sodass Zugriffe mit dem alten Zeiger (altem Tag) einen Hardware-Fehler ausloesen",
        answerC = "UAF ist ein Stack-basierter Angriff; ARM MTE schuetzt durch Stack-Canaries mit Hardware-Unterstuetzung",
        answerD = "UAF betrifft nur C++-Objekte mit virtuellen Funktionen; ARM MTE verifiziert vtable-Zeiger durch Hardware-Tags",
        correctAnswer = 1,
        explanation = "ARM MTE (Memory Tagging Extension, ARMv8.5-A): Jeder 16-Byte-Speicherblock erhaelt ein 4-Bit-Tag. Der Zeiger traegt im ungenutzten Bereich seiner oberen Bits ebenfalls ein Tag (durch TBI, Top-Byte Ignore). Bei free(ptr) erhaelt der Speicherbereich ein neues (zufaelliges) Tag. Wird der alte ptr (mit altem Tag) dereferenciert, vergleicht die Hardware Zeiger-Tag vs. Speicher-Tag — Ungleichheit loest eine Exception aus. UAF wird damit mit hoher Wahrscheinlichkeit sofort erkannt.",
        difficulty = 5,
        funFact = null
    ),
    // 47
    Question(
        categoryId = 7,
        questionText = "Was ist das 'Dolev-Yao Angreifermodell' in der formalen Kryptographieanalyse?",
        answerA = "Dolev-Yao beschreibt einen Angreifer mit unbegrenzter Rechenleistung der auch quantenkryptographische Protokolle brechen kann",
        answerB = "Das Dolev-Yao-Modell beschreibt einen Netzwerkangreifer der alle Nachrichten lesen, modifizieren, loeschen und injizieren kann (vollstaendige Netzwerkkontrolle) aber an kryptographischen Primitiven scheitert: Er kann ohne Schluessel keine Nachrichten entschluesseln oder faelschen",
        answerC = "Dolev-Yao ist ein Angreifermodell das nur passive Angriffe (Abhoeren) beruecksichtigt aber keine aktiven Manipulationen",
        answerD = "Das Dolev-Yao-Modell beschraenkt den Angreifer auf lokale Netzwerke und schliesst Internetangriffe aus",
        correctAnswer = 1,
        explanation = "Dolev und Yao (1983) definierten den 'Dolev-Yao Intruder': Vollstaendige Kontrolle ueber das Netzwerk — er ist der Netzwerk. Er kann Nachrichten abfangen, duplizieren, verzoegern, umleiten, und eigene injizieren. Aber: Kryptographie ist ideal ('perfect cryptography' Annahme). Er kann ohne Schluessel nicht entschluesseln, er kann ohne Geheimschluessel keine gueltige Signatur erzeugen. Tools wie ProVerif, Tamarin und Scyther modellieren genau diesen Angreifer.",
        difficulty = 5,
        funFact = "Das Dolev-Yao-Modell ist bewusst idealisiert — in der Realitaet gibt es Seitenkanale und Implementierungsfehler. Die Luecke zwischen formalem Beweis und Implementierungssicherheit ist ein aktives Forschungsfeld."
    ),
    // 48
    Question(
        categoryId = 7,
        questionText = "Was ist eine Blockchain-'Finality' und welchen Unterschied macht 'Economic Finality' in Proof-of-Stake-Systemen?",
        answerA = "Finality beschreibt wann Transaktionen bestaetigt sind; Economic Finality bedeutet Transaktionen sind nach 6 Blocks unumkehrbar wie in Bitcoin",
        answerB = "Absolute Finality bedeutet ein Block kann nie revertiert werden (BFT-Systeme); Economic Finality (Ethereum PoS): Ein Block ist 'finalisiert' wenn 2/3 des gestakten ETH ihn attestiert haben — eine Reorganisation wuerde bedeuten dass Angreifer mindestens 1/3 des Stakes (Milliarden Dollar) slashen (vernichten) wuerde",
        answerC = "Economic Finality und Probabilistische Finality sind identisch; der Unterschied liegt nur in der Terminologie",
        answerD = "Economic Finality beschreibt die Kosten eines 51%-Angriffs; Probabilistische Finality die Wahrscheinlichkeit einer Reorganisation",
        correctAnswer = 1,
        explanation = "Ethereum's Gasper-Protokoll (Casper FFG + LMD-GHOST): Alle 32 Slots (6.4 Minuten) wird eine Epoch. Nach 2 Epochen mit 2/3-Supermajorit attestierungen wird ein Checkpoint-Block finalisiert. Eine Reorganisation wuerde 'Slashing' ausloesen: Der Smart Contract vernichtet mindestens 1/3 des attestierenden Stakes. Bei 30M+ ETH gestakt waere ein Angriff existenziell teuer — 'Economic Finality' durch Oekonomie statt Mathematik.",
        difficulty = 5,
        funFact = null
    ),
    // 49
    Question(
        categoryId = 7,
        questionText = "Was ist 'Lattice Sieving' und welche Auswirkung hat der BKZ-Algorithmus auf die praktische Sicherheit von Gitter-basierten Kryptosystemen?",
        answerA = "Lattice Sieving ist eine Angriffsmethode auf Hash-Funktionen; BKZ hat keine Auswirkung auf Kryptosysteme",
        answerB = "Lattice Sieving ist ein Algorithmus zur Approximation kurzer Gittervektoren; BKZ (Block Korkine-Zolotarev) nutzt Sieving als Subroutine und ist der praktisch beste Algorithmus fuer SVP-Naeherungen — er definiert den effektiven Sicherheitsparameter (konkrete Bits-Sicherheit) fuer LWE/NTRU-Parameter",
        answerC = "Lattice Sieving ist eine Quantenalgorithmus der LWE in polynomieller Zeit bricht",
        answerD = "BKZ ist ein Schluesselerzeugungsverfahren das auf Gitterbasis-Reduktion aufbaut",
        correctAnswer = 1,
        explanation = "BKZ-Reduktion: Iteriert ueber ueberlappende k-dimensionale Bloecke und reduziert jeden Block vollstaendig (z.B. durch Siebverfahren wie G6K). Die Komplexitaet skaliert mit dem Blockgroessenparameter k. Konkrete Sicherheit: Kyber-768 ist auf ~180-Bit klassischer Sicherheit ausgelegt basierend auf BKZ-Analyse mit besten Siebing-Subroutinen (BDGL Sieve). Die NIST-Parameterauswahl beruecksichtigt moegliche algorithmische Verbesserungen in BKZ.",
        difficulty = 5,
        funFact = "Lattice-Sieving-Algorithmen benoetigen exponentiellen Speicher (2^(0.2075n) Vektoren) — selbst fuer moderate Gitterdimensionen uebersteigt der Speicherbedarf all verfuegbare RAM auf der Welt."
    ),
    // 50
    Question(
        categoryId = 7,
        questionText = "Was ist das 'Key Commitment' Problem bei AEAD-Verschluesselung (z.B. AES-GCM) und welche Angriffe entstehen dadurch?",
        answerA = "Key Commitment beschreibt, dass AEAD-Schluessel fest committen muessen bevor Nachrichten ausgetauscht werden koennen",
        answerB = "AES-GCM ist 'non-committing': Derselbe Chiffretext kann fuer zwei verschiedene Schluessel gueltig sein; ein Angreifer kann einen Chiffretext konstruieren der unter Schluessel K1 zu Nachricht M1 entschluesselt und unter K2 zu M2 — missbrauchbar fuer 'Invisible Salamanders' Angriffe in Multi-Recipient-Systemen wie Signal",
        answerC = "Key Commitment ist ein Feature von AES-GCM das verhindert dass Schluessel wiederverwendet werden",
        answerD = "Das Key-Commitment Problem entsteht weil AES-GCM keine Forward Secrecy garantiert",
        correctAnswer = 1,
        explanation = "AEAD Non-Commitment: In AES-GCM hat der Tag die Wahrscheinlichkeit 2^(-128) fuer falsche Keys, aber durch gezielte Konstruktion koennen zwei Schluessel fuer denselben Ciphertext tagvalide sein. 'Invisible Salamander' (Albertini et al., 2019): In Multi-Recipient-Systemen sendet ein Angreifer einen Ciphertext der unter dem Schluessel des Empfaengers A zu harmlosen Inhalt entschluesselt, aber unter dem Schluessel von B zu schaedlichem. ChaCha20-Poly1305 ist ebenfalls non-committing. Losung: Key-Committing AEAD wie AES-GCM-SIV oder explizite Commitment-Schemes",
        difficulty = 5,
        funFact = "Das Signal-Protokoll wurde 2021 aktualisiert um Key-Commitment-Eigenschaften hinzuzufuegen nachdem die Invisible-Salamander-Angriffe formell beschrieben wurden — ein seltenes Beispiel einer Real-World-Anpassung aufgrund eines theoretischen Angriffs."
    )
)
