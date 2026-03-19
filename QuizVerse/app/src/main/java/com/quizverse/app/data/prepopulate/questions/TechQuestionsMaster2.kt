package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsMaster2(): List<Question> = listOf(
    // 1
    Question(
        categoryId = 7,
        questionText = "Welche Pipeline-Stufe eines modernen Out-of-Order-Prozessors ist für das Umbenennen von Architekturregistern in physikalische Register zuständig?",
        answerA = "Fetch",
        answerB = "Decode",
        answerC = "Register Rename / Dispatch",
        answerD = "Execute",
        correctAnswer = 2,
        explanation = "Die Register-Rename-Stufe (auch Dispatch genannt) mappt Architekturregister (z.B. RAX, RBX) auf physikalische Register aus einem größeren Pool. Damit werden WAR- und WAW-Datenabhängigkeiten eliminiert, was Out-of-Order-Ausführung überhaupt erst ermöglicht.",
        difficulty = 5,
        funFact = "Moderne CPUs wie AMD Zen 4 haben über 200 physikalische Integer-Register, obwohl x86 nur 16 Architekturregister definiert."
    ),
    // 2
    Question(
        categoryId = 7,
        questionText = "Was beschreibt der Begriff 'Tomasulo-Algorithmus' in der CPU-Mikroarchitektur?",
        answerA = "Ein Verfahren zur Branch-Vorhersage mittels neuronaler Netze",
        answerB = "Ein dynamisches Scheduling-Verfahren für Out-of-Order-Ausführung mit Reservation Stations und dem Common Data Bus",
        answerC = "Ein Cache-Kohärenzprotokoll für Multiprozessorsysteme",
        answerD = "Ein Verfahren zur Berechnung von Gleitkomma-Divisionen",
        correctAnswer = 1,
        explanation = "Der Tomasulo-Algorithmus (IBM, 1967) ermöglicht dynamisches Out-of-Order-Scheduling: Reservation Stations puffern Operanden, der Common Data Bus (CDB) überträgt Ergebnisse direkt zu wartenden Einheiten. Register-Renaming ist implizit in den Reservation Stations.",
        difficulty = 5,
        funFact = "Robert Tomasulo entwickelte den Algorithmus für die IBM System/360 Model 91 — den ersten kommerziellen Out-of-Order-Prozessor überhaupt."
    ),
    // 3
    Question(
        categoryId = 7,
        questionText = "In welchem Zustand befindet sich eine Cache-Line im MESI-Protokoll, wenn sie von einem Prozessor exklusiv besessen wird und bereits modifiziert wurde?",
        answerA = "Exclusive (E)",
        answerB = "Shared (S)",
        answerC = "Modified (M)",
        answerD = "Invalid (I)",
        correctAnswer = 2,
        explanation = "Im Zustand Modified (M) hat nur dieser eine Prozessor die Cache-Line und ihr Inhalt weicht vom Hauptspeicher ab. Bei einem Snoop-Request eines anderen Prozessors muss die Line zuerst zurückgeschrieben werden (Write-Back) bevor sie invalidiert oder geteilt wird.",
        difficulty = 5,
        funFact = "Das MESI-Protokoll wurde 1984 von Mark S. Papamarcos und Janak H. Patel an der University of Illinois at Urbana-Champaign entwickelt — daher auch der Name 'Illinois Protocol'. Es ist bis heute die Grundlage fast aller Cache-Kohärenzimplementierungen."
    ),
    // 4
    Question(
        categoryId = 7,
        questionText = "Was ist der Hauptunterschied zwischen dem MESI- und dem MOESI-Protokoll?",
        answerA = "MOESI unterstützt mehr als 4 CPU-Kerne, MESI nur bis zu 4",
        answerB = "MOESI verwendet ein Token-basiertes Arbitrierungsverfahren statt Snooping",
        answerC = "MOESI fügt den Owned-Zustand hinzu, der Dirty-Sharing ohne Write-Back ermöglicht",
        answerD = "MOESI ist ein Directory-basiertes Protokoll, MESI ein Snooping-basiertes",
        correctAnswer = 2,
        explanation = "MOESI ergänzt MESI um den 'Owned'-Zustand (O): Eine modifizierte Line kann mit anderen Caches geteilt werden, ohne erst in den Hauptspeicher zurückgeschrieben zu werden. Der 'Owner' ist verantwortlich für den späteren Write-Back. AMD verwendet MOESI in seinen Prozessoren.",
        difficulty = 5,
        funFact = "AMD hat MOESI in seinen Opteron-Prozessoren (2003) eingeführt. Intel hingegen nutzt eine MESIF-Variante mit einem Forward-Zustand für effizienteres Peer-to-Peer-Sharing."
    ),
    // 5
    Question(
        categoryId = 7,
        questionText = "Was ist 'False Sharing' bei Cache-Lines in Mehrprozessorsystemen?",
        answerA = "Eine Situation, bei der zwei Threads dieselbe Variable lesen, ohne sie zu modifizieren",
        answerB = "Ein Fehler im Cache-Kohärenzprotokoll, der zu inkonsistenten Daten führt",
        answerC = "Die gemeinsame Nutzung von Read-Only-Daten zwischen mehreren Kernen",
        answerD = "Eine Situation, bei der zwei Threads verschiedene Variablen modifizieren, die sich aber in derselben Cache-Line befinden, was zu unnötiger Cache-Invalidierung führt",
        correctAnswer = 3,
        explanation = "False Sharing entsteht, wenn zwei Threads logisch unabhängige Variablen schreiben, die physikalisch in derselben 64-Byte-Cache-Line liegen. Jeder Write des einen Kerns invalidiert die Cache-Line des anderen, obwohl keine echte Datenabhängigkeit besteht — ein massiver Performance-Killer.",
        difficulty = 5,
        funFact = "False Sharing kann Performanceverluste von 10-100x verursachen. Die Lösung ist Padding auf 64 Bytes (eine Cache-Line-Größe) oder das Attribut __attribute__((aligned(64))) in C."
    ),
    // 6
    Question(
        categoryId = 7,
        questionText = "Was garantiert eine 'Full Memory Barrier' (mfence auf x86) im Kontext des TSO-Speichermodells?",
        answerA = "Dass alle nachfolgenden Lese- und Schreibzugriffe atomar ausgeführt werden",
        answerB = "Dass der Store-Buffer geleert und der Cache geflusht wird",
        answerC = "Dass alle Loads und Stores vor der Barriere für alle anderen Prozessoren sichtbar sind, bevor Loads und Stores nach der Barriere ausgeführt werden",
        answerD = "Dass keine Cache-Invalidierungen während der Barriere auftreten",
        correctAnswer = 2,
        explanation = "x86 verwendet TSO (Total Store Order): Stores können gegenüber anderen Prozessoren verzögert sichtbar sein (Store Buffer). mfence leert den Store Buffer vollständig, sodass alle vorherigen Writes für alle Kerne sichtbar sind, bevor nachfolgende Reads/Writes beginnen.",
        difficulty = 5,
        funFact = "ARM verwendet ein deutlich relaxierteres Speichermodell als x86. Deshalb benötigen Lock-Free-Algorithmen auf ARM deutlich mehr explizite Memory-Barriers als auf x86."
    ),
    // 7
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem 'acquire' und einem 'release' Memory-Fence?",
        answerA = "Acquire verhindert das Hochheben von Operationen nach der Barriere, Release verhindert das Absenken von Operationen vor der Barriere",
        answerB = "Acquire wird für Mutexe verwendet, Release für Semaphoren",
        answerC = "Acquire ist eine Load-Barriere, Release ist eine Store-Barriere — beide verhindern jegliche Umsortierung",
        answerD = "Es gibt keinen funktionalen Unterschied, nur Namenskonventionen",
        correctAnswer = 0,
        explanation = "Acquire-Semantik: Kein nachfolgender Load/Store kann vor die Acquire-Operation verschoben werden ('Loads/Stores werden nach unten gehalten'). Release-Semantik: Kein vorheriger Load/Store kann nach die Release-Operation verschoben werden. Zusammen implementieren sie Lock-Acquire und Lock-Release korrekt.",
        difficulty = 5,
        funFact = "C++11 formalisierte acquire/release in std::atomic als Teil des C++-Speichermodells. Linus Torvalds bezeichnete Memory-Ordering-Bugs als 'the single most important source of bugs in the kernel'."
    ),
    // 8
    Question(
        categoryId = 7,
        questionText = "Was ist 'Speculative Execution' und welche Sicherheitslücke hat sie bekannt gemacht?",
        answerA = "Parallele Ausführung mehrerer Threads auf einem Kern; bekannt durch den Rowhammer-Angriff",
        answerB = "Vorausschauendes Laden von Daten in den Cache; bekannt durch Cache-Poisoning-Angriffe",
        answerC = "Ausführung von Instruktionen vor der Branch-Auflösung; bekannt durch den Heartbleed-Bug",
        answerD = "Ausführung von Instruktionen entlang eines vorhergesagten Pfades vor der tatsächlichen Branch-Auflösung; bekannt durch Spectre und Meltdown",
        correctAnswer = 3,
        explanation = "Speculative Execution führt Instruktionen auf einem vorhergesagten Branch-Pfad aus. Bei falscher Vorhersage werden Ergebnisse verworfen (Rollback), hinterlassen aber Seiteneffekte im Cache. Spectre (2018) nutzt dies: Durch Timing-Messungen des Caches können geheime Daten extrahiert werden.",
        difficulty = 5,
        funFact = "Spectre und Meltdown wurden am 3. Januar 2018 koordiniert veröffentlicht und betrafen nahezu jeden Prozessor der letzten 20 Jahre. Die Patches reduzierten die Performance von Datenbankservern teils um 10-30%."
    ),
    // 9
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Reorder Buffer' (ROB) in einem Out-of-Order-Prozessor?",
        answerA = "Ein Puffer, der Branch-Vorhersagen zwischenspeichert",
        answerB = "Ein Puffer zwischen L1- und L2-Cache für Prefetch-Anfragen",
        answerC = "Eine Struktur, die Store-Operationen zusammenfasst bevor sie den Cache erreichen",
        answerD = "Eine Circular-Queue, die alle in-flight Instruktionen in Programm-Reihenfolge hält und In-order-Commit ermöglicht",
        correctAnswer = 3,
        explanation = "Der ROB ist eine Circular-Queue (typisch 200-500 Einträge in modernen CPUs), die alle dispatched Instruktionen in Original-Programmreihenfolge hält. Instruktionen werden out-of-order ausgeführt, aber immer in-order committed (Kopf der Queue). Bei einem Branch-Mispredict wird der ROB bis zum fehlerhaften Entry geleert.",
        difficulty = 5,
        funFact = "Intel's Core i9-13900K hat einen ROB mit 512 Einträgen. Der ROB-Füllstand ist ein kritischer Performance-Indikator — ein voller ROB stoppt den Frontend-Dispatch komplett."
    ),
    // 10
    Question(
        categoryId = 7,
        questionText = "Was ist das NUMA-Problem bei 'Remote Memory Access' auf einem Multi-Socket-Server?",
        answerA = "Remote-Speicher ist physisch unzuverlässig und erfordert ECC",
        answerB = "Remote-Speicher kann nicht gecacht werden und muss immer direkt aus dem DRAM gelesen werden",
        answerC = "Zugriff auf Speicher eines fremden NUMA-Knotens hat deutlich höhere Latenz und geringere Bandbreite als lokaler Speicher",
        answerD = "NUMA-Knoten teilen sich denselben L3-Cache, was Kohärenzprobleme verursacht",
        correctAnswer = 2,
        explanation = "Bei NUMA (Non-Uniform Memory Access) ist der Speicher physisch aufgeteilt: Jeder CPU-Socket hat lokalen DRAM. Zugriff auf Remote-DRAM (eines anderen Sockets) erfolgt über Interconnects (z.B. Intel UPI oder AMD Infinity Fabric) und hat typisch 2-3x höhere Latenz und geringere Bandbreite.",
        difficulty = 5,
        funFact = "Linux's NUMA-Scheduler versucht, Threads auf den Kernen zu halten, die dem verwendeten Speicher am nächsten sind. Der Befehl 'numactl' erlaubt manuelle NUMA-Affinität."
    ),
    // 11
    Question(
        categoryId = 7,
        questionText = "Was ist 'SIMT' (Single Instruction, Multiple Threads) im Kontext von GPU-Architekturen?",
        answerA = "Ein GPU-Scheduling-Modell, das mehrere Instruktionsströme synchron auf verschiedene Kerne verteilt",
        answerB = "Ein Speichermodell, das allen GPU-Threads atomaren Zugriff auf globalen Speicher garantiert",
        answerC = "Ein Kompilierungsmodell für GPU-Shader, das automatisch Parallelität extrahiert",
        answerD = "Ein Ausführungsmodell, bei dem eine Instruktion gleichzeitig von vielen Threads ausgeführt wird, die SIMD-Lanes eines Warps belegen",
        correctAnswer = 3,
        explanation = "SIMT führt eine Instruktion gleichzeitig für alle 32 (NVIDIA Warp) oder 64 (AMD Wavefront) Threads aus. Bei Divergenz (if/else) werden inaktive Lanes maskiert und beide Pfade sequentiell ausgeführt — ein massiver Performance-Verlust bei branch-heavem Code.",
        difficulty = 5,
        funFact = "NVIDIA nannte ihr Modell 'SIMT' um es von SIMD zu unterscheiden, aber intern ist ein Warp eine SIMD-Einheit. Der Begriff 'Warp' kommt aus der Weberei: ein Bündel paralleler Fäden."
    ),
    // 12
    Question(
        categoryId = 7,
        questionText = "Was passiert bei GPU-'Warp Divergence' und wie wirkt sie sich auf die Performance aus?",
        answerA = "Die GPU startet einen neuen Warp für jeden divergenten Branch-Pfad parallel",
        answerB = "Divergente Warps werden in den globalen Speicher ausgelagert und später neu gestartet",
        answerC = "Threads eines Warps, die den nicht gewählten Pfad nehmen, werden maskiert und seriell ausgeführt — beide Pfade werden nacheinander abgearbeitet",
        answerD = "Der Shader-Compiler löst Divergenz automatisch durch Predication auf",
        correctAnswer = 2,
        explanation = "Bei Warp Divergence (z.B. if-else) wird der Warp geteilt: Erst führen alle Threads den if-Pfad aus (else-Threads maskiert), dann den else-Pfad (if-Threads maskiert). Im schlimmsten Fall (50/50-Split) halbiert sich der Durchsatz. Minimale Divergenz ist kritisch für GPU-Performance.",
        difficulty = 5,
        funFact = "NVIDIA's Volta-Architektur (2017, Tesla V100) führte 'Independent Thread Scheduling' ein — Turing (2018) erbte dieses Feature und brachte es zu Consumer-GPUs. Volta war damit ein großer Fortschritt für komplexe Algorithmen."
    ),
    // 13
    Question(
        categoryId = 7,
        questionText = "Was ist der fundamentale Unterschied zwischen FPGA und ASIC in Bezug auf Designflexibilität und Performance?",
        answerA = "FPGAs sind schneller als ASICs, aber teurer in der Produktion",
        answerB = "ASICs können nur digitale Logik implementieren, FPGAs auch analoge Schaltkreise",
        answerC = "FPGAs verwenden CMOS-Technologie, ASICs verwenden Bipolar-Transistoren",
        answerD = "FPGAs sind rekonfigurierbar aber langsamer/energiehungriger; ASICs sind fest verdrahtet, bis zu 10-100x schneller und effizienter, aber unveränderlich",
        correctAnswer = 3,
        explanation = "FPGAs verwenden programmierbare LUTs (Look-Up Tables) und Routing-Ressourcen — flexibel, aber mit Overhead durch die Programmierbarkeit. ASICs werden für einen spezifischen Zweck gefertigt: minimaler Overhead, maximale Effizienz. Bitcoinminer zeigen: FPGA-Miner waren 10-50x schneller als CPUs, ASIC-Miner nochmals 100x schneller als FPGAs.",
        difficulty = 5,
        funFact = "Microsofts 'Brainwave'-Projekt (Azure) beschleunigt Neural Networks mit FPGAs im Datacenter. Google's TPU ist hingegen ein ASIC — beide Ansätze haben ihre Daseinsberechtigung."
    ),
    // 14
    Question(
        categoryId = 7,
        questionText = "Was ist 'PCIe Gen 5 x16' und welche theoretische Bandbreite bietet diese Konfiguration?",
        answerA = "16 Lanes mit je 4 GT/s → 8 GB/s bidirektional",
        answerB = "16 Lanes mit je 32 GT/s → 128 GB/s bidirektional",
        answerC = "16 Lanes mit je 4 GB/s → 64 GB/s unidirektional",
        answerD = "16 Lanes mit je 2 GT/s (netto) → 32 GB/s unidirektional",
        correctAnswer = 1,
        explanation = "PCIe Gen 5 überträgt 32 GT/s (Gigatransfers/Sekunde) pro Lane. Mit 128b/130b-Encoding sind das ~30,5 Gbit/s Nutzdaten pro Lane. 16 Lanes ergeben ~62 GB/s in jede Richtung (bidirektional). Die '128 GB/s' ist die kombinierte bidirektionale Bandbreite der 16 Lanes in beide Richtungen zusammengezählt.",
        difficulty = 5,
        funFact = "PCIe Gen 6 (2022) verdoppelt auf 64 GT/s pro Lane mit PAM4-Modulation statt NRZ und FLIT-basiertem Protokoll. PCIe Gen 7 ist für ~2025 mit 128 GT/s geplant."
    ),
    // 15
    Question(
        categoryId = 7,
        questionText = "Was ist 'NVMe Namespace' und welchen Vorteil bietet er gegenüber traditionellen AHCI-Laufwerken?",
        answerA = "NVMe nutzt bis zu 65.535 Queues mit je 65.536 Einträgen statt einer AHCI-Queue mit 32 Einträgen, was massive Parallelität ermöglicht",
        answerB = "NVMe Namespaces sind virtuelle Partitionen, die Sektoren logisch gruppieren — der Vorteil ist günstigere Fehlerkorrektur",
        answerC = "NVMe speichert Daten im flüchtigen DRAM, AHCI nur auf Flash — daher 10x höhere Geschwindigkeit",
        answerD = "NVMe Namespaces ermöglichen RAID-Funktionalität direkt im Laufwerk ohne Host-Controller",
        correctAnswer = 0,
        explanation = "AHCI hat 1 Queue mit max. 32 ausstehenden Befehlen. NVMe unterstützt bis zu 65.535 I/O-Queues mit je 65.536 Einträgen — ideal für Flash-Speicher, der massiv parallele Zugriffe verarbeiten kann. Dies eliminiert den Queue-Bottleneck, der AHCI-SSDs limitierte.",
        difficulty = 5,
        funFact = "AHCI wurde 2004 für rotierende Festplatten entwickelt — mit einer Queue, weil HDDs sequentielle Zugriffe bevorzugen. NVMe (2011) wurde von Grund auf für parallelen Flash-Zugriff designed."
    ),
    // 16
    Question(
        categoryId = 7,
        questionText = "Was ist 'DRAM Row Hammer' und welchen Angriff ermöglicht er?",
        answerA = "Ein physischer Angriff, der DRAM-Chips durch elektrische Überspannung zerstört",
        answerB = "Ein Cache-Timing-Angriff, der durch häufiges Lesen derselben Cache-Line geheime Daten extrahiert",
        answerC = "Wiederholtes Aktivieren einer DRAM-Zeile verursacht Bitflips in benachbarten Zeilen, was zur Privilege-Escalation missbraucht werden kann",
        answerD = "Ein Angriff auf den DRAM-Controller, der den Refresh-Zyklus manipuliert",
        correctAnswer = 2,
        explanation = "DRAM-Zellen verlieren Ladung durch elektromagnetische Kopplung zwischen Zeilen. Hammert man eine Zeile mit ~139.000 Aktivierungen/Sekunde, flippen Bits in angrenzenden Zeilen. 2015 demonstrierten Forscher Privilege-Escalation von userspace zu kernel durch gezieltes Flippen von Page-Table-Bits.",
        difficulty = 5,
        funFact = "Gegenmaßnahmen sind Target Row Refresh (TRR), ECC (korrigiert 1-Bit-Fehler), und LPDDR5 mit besserer Zellenisolation. Cloud-Provider wie AWS und Google haben ihre DRAM-Auswahl nach Rowhammer angepasst."
    ),
    // 17
    Question(
        categoryId = 7,
        questionText = "Was ist der Zweck des 'DRAM Refresh'-Zyklus und welche Latenz verursacht er?",
        answerA = "Refresh schreibt gecachte Daten in den DRAM zurück — verursacht ~100ns Latenz alle 8 Sekunden",
        answerB = "Refresh synchronisiert DRAM mit dem CPU-Takt und verursacht keine messbare Latenz",
        answerC = "Refresh fluscht den ECC-Fehlerzähler und überprüft alle Speicherzellen auf Integrität",
        answerD = "DRAM-Kondensatoren verlieren Ladung; Refresh liest und schreibt jede Zeile alle 64ms neu, blockiert dabei kurz den Speicher",
        correctAnswer = 3,
        explanation = "DRAM-Kondensatoren entladen sich innerhalb von ~64ms. Der Memory Controller muss jede Zeile durch einen Lese-Schreib-Zyklus (RAS/CAS) auffrischen. Während eines Auto-Refresh (ARF) ist der DRAM-Bank nicht zugreifbar — bei moderner DRAM mit ~8192 Zeilen addiert sich das zu messbaren Pausezeiten.",
        difficulty = 5,
        funFact = "DDR5 hat die Refresh-Rate verdoppelt und 'Same Bank Refresh' eingeführt, um Zugriffe auf nicht-refreshende Banks zu erlauben. Bei sehr heißem DRAM (>85°C) muss die Refresh-Rate auf alle 32ms verdoppelt werden."
    ),
    // 18
    Question(
        categoryId = 7,
        questionText = "Welche RISC-V Erweiterung definiert atomare Speicheroperationen wie 'Load-Reserved' und 'Store-Conditional'?",
        answerA = "RV32A (Atomic Instructions)",
        answerB = "RV32M (Integer Multiplication and Division)",
        answerC = "RV32C (Compressed Instructions)",
        answerD = "RV32F (Single-Precision Floating-Point)",
        correctAnswer = 0,
        explanation = "Die 'A'-Erweiterung (Atomic) definiert lr.w/lr.d (Load-Reserved) und sc.w/sc.d (Store-Conditional) sowie AMO-Operationen (Atomic Memory Operations) wie amoadd, amoswap. Diese sind Grundlage für Mutex-Implementierungen und Lock-Free-Datenstrukturen auf RISC-V.",
        difficulty = 5,
        funFact = "RISC-V ist modular: Die Basis-ISA ist 'RV32I' oder 'RV64I'. 'G' bedeutet die Kombination IMAFD — die vier wichtigsten Erweiterungen für general-purpose Computing."
    ),
    // 19
    Question(
        categoryId = 7,
        questionText = "Was unterscheidet RISC-V 'RV64GC' von 'RV64G'?",
        answerA = "C fügt kryptografische Instruktionen (AES, SHA) hinzu",
        answerB = "C aktiviert das Capability-Sicherheitsmodell für Memory-Safe Execution",
        answerC = "C fügt Cache-Control-Instruktionen für explizites Cache-Management hinzu",
        answerD = "C ist die Compressed-Erweiterung: 16-Bit-Instruktionen für häufig genutzte Operationen, die den Code-Footprint reduzieren",
        correctAnswer = 3,
        explanation = "Die 'C'-Erweiterung (Compressed) definiert 16-Bit-Kodierungen für die häufigsten 32-Bit-RISC-V-Instruktionen (ca. 60% aller Instruktionen nach Studien). Dadurch schrumpft der Code-Footprint um ~25-30%, was für embedded Systeme mit begrenztem Flash-Speicher kritisch ist.",
        difficulty = 5,
        funFact = "Linux-Kernel, GCC und LLVM unterstützen alle RV64GC. Große RISC-V Chips wie SiFive's P670 und der StarFive JH7110 (Raspberry Pi-Konkurrent) verwenden RV64GC."
    ),
    // 20
    Question(
        categoryId = 7,
        questionText = "Was ist 'Branch Target Buffer' (BTB) und welche Rolle spielt er in der Branch-Vorhersage?",
        answerA = "Ein Puffer, der die Ergebnisse von Vergleichsoperationen zwischenspeichert, um Conditional-Branches zu beschleunigen",
        answerB = "Ein TLB-ähnlicher Buffer, der virtuelle Branch-Adressen auf physische Adressen mappt",
        answerC = "Ein Cache, der für jede Branch-Instruktion die letzte Sprungzieladresse speichert, sodass Fetch mit dem korrekten PC starten kann, bevor der Branch decodiert ist",
        answerD = "Ein Hardware-Stack, der Return-Adressen für Funktionsaufrufe vorhersagt",
        correctAnswer = 2,
        explanation = "Der BTB (Branch Target Buffer) ist ein assoziativ adressierbarer Cache: Schlüssel = Adresse der Branch-Instruktion, Wert = letzte bekannte Sprungzieladresse. Bei einem Cache-Hit kann der Frontend schon den nächsten PC fetchen, bevor der Decoder überhaupt weiß, dass es ein Branch ist.",
        difficulty = 5,
        funFact = "Der BTB ist verwundbar gegen Spectre Variant 2 (Branch Target Injection). Der Angreifer trainiert den BTB mit eigenen Branches, sodass das Opfer zu einer vom Angreifer kontrollierten Adresse spekuliert."
    ),
    // 21
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Return Stack Buffer' (RSB) und warum ist er genauer als der BTB für Funktionsrücksprünge?",
        answerA = "Ein Hardware-Stack, der bei CALL die Rücksprungadresse pusht und bei RET popt — deutlich genauer als BTB weil Calls/Rets immer als Paar auftreten",
        answerB = "Ein Software-Stack im Kernel-Mode, der Rücksprungadressen gegen Buffer-Overflow-Angriffe schützt",
        answerC = "Ein Cache-Eintrag, der die letzten 4 Rücksprungadressen eines Threads speichert",
        answerD = "Eine Erweiterung des BTB für indirekte Sprünge mit mehreren möglichen Zielen",
        correctAnswer = 0,
        explanation = "Der RSB (auch RAS: Return Address Stack) ist ein Hardware-Stack: bei jedem CALL wird die Rücksprungadresse gepusht, bei jedem RET gepoppt. Da Call/Ret sich immer paaren, ist die Vorhersage nahezu perfekt (>99%), während der BTB für RETs nur die letzte Adresse kennt.",
        difficulty = 5,
        funFact = "Bei tiefer Rekursion läuft der RSB (typisch 16-32 Einträge) über. Dann fällt die CPU auf den BTB zurück — was Spectre-RSB-Angriffe ermöglicht, bei denen der Angreifer den RSB mit bösartigen Adressen füllt."
    ),
    // 22
    Question(
        categoryId = 7,
        questionText = "Was beschreibt 'TAGE' (Tagged Geometric history length) Branch Predictor?",
        answerA = "Ein Predictor basierend auf maschinellem Lernen, der online auf dem CPU-Chip trainiert wird",
        answerB = "Ein einfacher 2-Bit-Sättigungszähler-Predictor mit Tagged Cache",
        answerC = "Ein Predictor speziell für Loop-Branches mit einem dedizierten Iteration-Counter",
        answerD = "Ein mehrstufiger Predictor mit geometrisch wachsenden Branch-History-Längen und Tagged Einträgen für präzise Kontexterkennung",
        correctAnswer = 3,
        explanation = "TAGE verwendet mehrere Tabellen mit geometrisch wachsenden History-Längen (z.B. 2, 4, 8, 16, 32, 64, 128 Branches). Tagged Einträge verhindern Aliasing. Die längste übereinstimmende History gewinnt. Moderne Intel- und AMD-CPUs basieren intern auf TAGE-Varianten.",
        difficulty = 5,
        funFact = "André Seznec entwickelte TAGE und gewann damit mehrfach den Championship Branch Prediction Competition (CBP). Sein TAGE-SC-L Predictor erreicht >95% Vorhersagegenauigkeit auf realen Workloads."
    ),
    // 23
    Question(
        categoryId = 7,
        questionText = "Was ist 'Fat Tree Topology' in Hochleistungsrechner-Interconnects?",
        answerA = "Eine mehrstufige Baumtopologie, bei der höhere Schichten mehr oder gleich viele Links haben als tiefere — damit ist die Bisektionsbandbreite an jeder Ebene gleich",
        answerB = "Eine Baumtopologie, bei der die Bandbreite zu den Blättern hin abnimmt (wie natürliche Bäume)",
        answerC = "Ein Ringtopologie-Netzwerk mit fetten (redundanten) Verbindungen für Fehlertoleranz",
        answerD = "Eine vollvermaschte Topologie, bei der jeder Knoten mit jedem anderen direkt verbunden ist",
        correctAnswer = 0,
        explanation = "In einem Fat-Tree (Leiserson, 1985) nimmt die Linkanzahl zur Wurzel hin zu. In einer k-ary fat-tree haben alle Schichten dieselbe Bisektionsbandbreite — kein Bottleneck an der Wurzel. InfiniBand-basierte Supercomputer (TOP500) nutzen oft Fat-Tree-Topologien.",
        difficulty = 5,
        funFact = "Der Fugaku-Supercomputer (ehemals #1 der Welt) nutzt eine Torus-Topologie, während Summit (IBM) Fat-Tree-Topologie mit InfiniBand EDR verwendet. Die Topologiewahl beeinflusst MPI-Latenz massiv."
    ),
    // 24
    Question(
        categoryId = 7,
        questionText = "Was ist 'Dragonfly Topology' und welchen Vorteil bietet sie gegenüber Fat-Tree bei sehr großen Systemen?",
        answerA = "Dragonfly verwendet optische Verbindungen statt Kupfer, was 10x höhere Bandbreite ermöglicht",
        answerB = "Dragonfly ist ein proprietäres Cray-Protokoll und nicht für andere Hersteller verfügbar",
        answerC = "Dragonfly ist eine vollvermaschte Topologie, die Fat-Tree bei kleinen Clustern (<100 Knoten) übertrifft",
        answerD = "Dragonfly organisiert Knoten in Gruppen (vollvermascht), die über wenige Global-Links verbunden sind — weniger Kabel als Fat-Tree bei vergleichbarer Bandbreite",
        correctAnswer = 3,
        explanation = "Dragonfly (Kim et al., 2008) teilt Knoten in Gruppen, die intern vollvermascht sind. Gruppen sind über wenige globale Links verbunden. Verglichen mit Fat-Tree: deutlich weniger Kabel und Switches bei ähnlicher Bandbreite. Cray's Slingshot-Netzwerk (Frontier Supercomputer) nutzt Dragonfly.",
        difficulty = 5,
        funFact = "Der Frontier-Supercomputer (Oak Ridge, 1. Exaflop-System, 2022) nutzt HPE Slingshot mit Dragonfly-Topologie und 200 Gbit/s pro Link. Das Netzwerk alleine kostet hunderte Millionen Dollar."
    ),
    // 25
    Question(
        categoryId = 7,
        questionText = "Was ist Intel TSX (Transactional Synchronization Extensions) und welches grundlegende Problem löst es?",
        answerA = "TSX ist eine Erweiterung für Transaktionsdatenbanken auf CPU-Ebene, die ACID-Garantien in Hardware implementiert",
        answerB = "TSX ist eine Sicherheitserweiterung, die Spectre-Angriffe in Hardware verhindert",
        answerC = "TSX ermöglicht Hardware-Transactional-Memory: Code zwischen xbegin/xend wird optimistisch ausgeführt und bei Konflikten automatisch zurückgerollt — reduziert Lock-Contention",
        answerD = "TSX beschleunigt String-Operationen durch SIMD-Erkennung von Patterns",
        correctAnswer = 2,
        explanation = "TSX (HLE + RTM) ermöglicht Hardware Transactional Memory: Code zwischen xbegin/xend läuft spekulativ. Wenn zwei Threads nicht dieselben Cache-Lines berühren, committen beide Transaktionen — kein Lock nötig. Bei Konflikt rollt die CPU automatisch zurück und Fallback-Code läuft.",
        difficulty = 5,
        funFact = "Intel deaktivierte TSX auf vielen CPUs (Ice Lake, Tiger Lake) aufgrund einer Sicherheitslücke (CVE-2020-0543, TAA: TSX Asynchronous Abort). TSX ermöglichte das Leaken von Kernel-Daten über spekulative Execution."
    ),
    // 26
    Question(
        categoryId = 7,
        questionText = "Was ist 'DVFS' (Dynamic Voltage and Frequency Scaling) und warum spart es überproportional Energie?",
        answerA = "DVFS senkt Frequenz und Spannung gemeinsam; da Leistung proportional zu f×V² ist, führt halbierte Frequenz bei reduzierter Spannung zu ~4-8x weniger dynamischer Leistungsaufnahme",
        answerB = "DVFS reduziert Taktfrequenz linear bei hoher Temperatur — Energieersparnis ist ebenfalls linear",
        answerC = "DVFS ist eine Software-Technik, die CPU-Kerne in den Schlafmodus versetzt, wenn sie nicht benötigt werden",
        answerD = "DVFS verteilt Rechenaufgaben gleichmäßig auf alle Kerne, um Hotspots zu vermeiden",
        correctAnswer = 0,
        explanation = "Dynamische Leistung P = α × C × V² × f. Wenn DVFS Frequenz halbiert, kann auch die Spannung reduziert werden. Halbierte Frequenz + 30% weniger Spannung → P ≈ 0,5 × 0,7² × 0,5 × α × C = ~0,24P — also ~4x Energieersparnis. Deshalb ist DVFS so effektiv.",
        difficulty = 5,
        funFact = "Intel's Turbo-Boost ist DVFS in die andere Richtung: Wenn thermisches Budget es erlaubt, erhöht die CPU Spannung und Frequenz über den Nenntakt hinaus, solange die TDP nicht überschritten wird."
    ),
    // 27
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen CPU C-States und P-States?",
        answerA = "C-States gelten pro Core, P-States gelten für das gesamte CPU-Package",
        answerB = "C-States sind für Integer-Einheiten, P-States für Floating-Point-Einheiten",
        answerC = "C-States steuern Cache-Aktivität, P-States steuern die Anzahl aktiver Pipelines",
        answerD = "C-States sind Schlafzustände (teilweises/vollständiges Power-Gating bei Idle), P-States sind Leistungszustände (verschiedene Frequenz/Spannungs-Kombinationen während aktiver Nutzung)",
        correctAnswer = 3,
        explanation = "P-States (Performance States): verschiedene DVFS-Betriebspunkte — P0 ist maximale Leistung, höhere Nummern sind langsamer/energieeffizienter. C-States (CPU Idle States): C0=aktiv, C1=Halt, C3=Schlaf (PLL ausgeschalten), C6=Core Power-Gated, C10=Package vollständig abgeschalten. Tiefere C-States sparen mehr Energie, brauchen aber länger zum Aufwachen.",
        difficulty = 5,
        funFact = "Linux's CPUFreq-Governor entscheidet zwischen P-States, während CPUIdle den C-State wählt. Falsche C-State-Konfiguration in Servern (c-states=1) kostet oft 20-30% Latenz bei ersten Anfragen nach Idle-Phasen."
    ),
    // 28
    Question(
        categoryId = 7,
        questionText = "Was ist 'ECC DRAM' und wie erkennt/korrigiert es Bitfehler?",
        answerA = "ECC fügt pro 64 Bits 8 Paritätsbits hinzu, die alle Ein-Bit-Fehler korrigieren und Zwei-Bit-Fehler erkennen (SECDED)",
        answerB = "ECC repliziert jeden DRAM-Chip dreifach und wählt per Majority-Vote den korrekten Wert",
        answerC = "ECC ist ein Software-Verfahren im OS, das DRAM-Inhalte periodisch mit gespeicherten Checksums vergleicht",
        answerD = "ECC verwendet Forward Error Correction mit Reed-Solomon-Codes über ganze Speicherseiten",
        correctAnswer = 0,
        explanation = "SECDED (Single Error Correct, Double Error Detect): Pro 64 Datenbits werden 8 Checkbits (Hamming-Code) gespeichert. Der Hamming-Code kann Bitposition jedes einzelnen Fehlers berechnen und korrigieren. Zwei gleichzeitige Fehler werden erkannt (aber nicht korrigiert). ECC DRAM verwendet einen extra DRAM-Chip pro Rank für die 8 Checkbits.",
        difficulty = 5,
        funFact = "Ohne ECC treten in einem 32GB-Server-System laut Google-Studie etwa 1 Bitfehler pro Jahr auf. In einem 32TB-Speichersystem mit 1000 DIMMs sind es statistisch ~1000 Bitfehler/Jahr — ohne ECC würden Server täglich abstürzen."
    ),
    // 29
    Question(
        categoryId = 7,
        questionText = "Was ist 'Chipkill' und welchen Vorteil bietet es gegenüber Standard-ECC?",
        answerA = "Chipkill ist ein Notabschaltsystem, das bei DRAM-Überhitzung den Server schützt",
        answerB = "Chipkill spiegelt jeden DRAM-Inhalt auf einen zweiten Chip für sofortige Wiederherstellung",
        answerC = "Chipkill ist eine Firmware-Funktion, die defekte DRAM-Zellen automatisch in eine Reserve-Map umleitet",
        answerD = "Chipkill ist eine erweiterte ECC-Variante, die den kompletten Ausfall eines DRAM-Chips (alle Bits einer Breite) noch korrigieren kann — Standard-ECC versagt bei Chip-Defekten",
        correctAnswer = 3,
        explanation = "Standard-ECC (SECDED) korrigiert 1 Bit, erkennt 2 Bit. Stirbt ein ganzer DRAM-Chip (x4 oder x8 Breite), sind 4 oder 8 Bits gleichzeitig falsch — jenseits von SECDED. Chipkill (IBM-Begriff) verwendet erweiterte Codes (z.B. Symbol-ECC), die einen kompletten Chip-Ausfall noch korrigieren können.",
        difficulty = 5,
        funFact = "IBM entwickelte Chipkill 1997 für ihre Server. Moderne RDIMM/LRDIMM-Server-DIMMs implementieren alle Chipkill. AMD's EPYC und Intel's Xeon unterstützen Chipkill nativ im Memory Controller."
    ),
    // 30
    Question(
        categoryId = 7,
        questionText = "Was ist 'Memory Scrubbing' in Serversystemen?",
        answerA = "Das Überschreiben von freigegebenen Speicherbereichen mit Nullen aus Sicherheitsgründen",
        answerB = "Das Komprimieren von selten genutzten Speicherbereichen im Hintergrund",
        answerC = "Ein Hintergrundprozess, der regelmäßig den gesamten DRAM liest und ECC-Fehler proaktiv korrigiert, bevor sie sich akkumulieren",
        answerD = "Ein Test, der bei Serverstart alle DRAM-Zellen auf Funktionsfähigkeit prüft",
        correctAnswer = 2,
        explanation = "Memory Scrubbing liest periodisch (typisch alle 24h) den gesamten DRAM durch ECC. Ein korrigierbarer 1-Bit-Fehler (Single Error) wird dabei repariert. Ohne Scrubbing könnten sich Soft Errors akkumulieren: Wenn zu einem unkorrigierten 1-Bit-Fehler ein zweiter hinzukommt, entsteht ein unkorigierbarer 2-Bit-Fehler → Systemabsturz.",
        difficulty = 5,
        funFact = "Linux-Kernel hat seit 4.8 den 'EDAC' (Error Detection And Correction) Subsystem, der Memory Scrubbing koordiniert. Auf EPYC-Servern wird Scrubbing im AMD-Secure-Processor konfiguriert."
    ),
    // 31
    Question(
        categoryId = 7,
        questionText = "Was ist Intel VT-x (Virtualization Technology for IA-32/EM64T) und welches Problem löst es?",
        answerA = "VT-x ist eine SIMD-Erweiterung für Virtualisierungs-Workloads mit AES und SHA-Beschleunigung",
        answerB = "VT-x fügt einen neuen CPU-Modus (VMX) hinzu, der hypervisorgesteuerte Gäste isoliert ausführen kann, ohne dass der Gast-OS-Code privilegierte Operationen abfangen muss",
        answerC = "VT-x erlaubt mehreren Virtual Machines, dieselben physischen CPU-Register gleichzeitig zu nutzen",
        answerD = "VT-x ist Intels Implementierung des ARM-Hypervisor-Modes für x86-Emulation",
        correctAnswer = 1,
        explanation = "Ohne Hardware-Virtualisierung mussten privilegierte Guest-Instruktionen per Binary Translation oder Para-Virtualisierung emuliert werden (langsam, komplex). VT-x (VMX Operation) fügt Root/Non-Root-Modi hinzu: Gäste laufen in Non-Root, Hypervisor in Root. VM-Exits bei sensiblen Operationen sind automatisch ohne Emulation.",
        difficulty = 5,
        funFact = "Intel VT-x und AMD-V (SVM) wurden 2005-2006 zeitgleich eingeführt. Vorher ermöglichte der berühmte 'Popek and Goldberg'-Theorem von 1974 zu zeigen, dass x86 NICHT vollständig virtualisierbar ist — Hardware-Unterstützung war nötig."
    ),
    // 32
    Question(
        categoryId = 7,
        questionText = "Was ist 'Extended Page Tables' (EPT) bzw. 'Nested Paging' und warum ist es wichtig für VM-Performance?",
        answerA = "EPT ist eine Verdoppelung des TLB für Hypervisors, die Guest-TLB-Misses beschleunigt",
        answerB = "EPT fügt eine zweite Seitenübersetzungsebene hinzu: Guest-VA→Guest-PA→Host-PA erfolgt vollständig in Hardware, ohne VM-Exits für jeden Page-Fault im Gast",
        answerC = "EPT ermöglicht Huge Pages (2MB/1GB) innerhalb von Virtual Machines",
        answerD = "EPT ist ein dedizierter Adressenraum für den Hypervisor, der vor dem Gast verborgen ist",
        correctAnswer = 1,
        explanation = "Ohne EPT musste der Hypervisor 'Shadow Page Tables' verwalten: bei jedem Guest-Page-Fault ein VM-Exit, Hypervisor aktualisiert Shadow Tables — enormer Overhead. Mit EPT hat der Gast eigene Page-Tables (GVA→GPA), und Hardware übersetzt GPA→HPA automatisch über EPT. Keine VM-Exits für normale Speicherzugriffe.",
        difficulty = 5,
        funFact = "EPT-Misses (TLB Walks über 2 Ebenen) können bis zu 24 Speicherzugriffe benötigen (4-Ebenen-Paging × 4-Ebenen-EPT). Das ist der Grund warum Huge Pages (2MB) in VMs so kritisch für Performance sind."
    ),
    // 33
    Question(
        categoryId = 7,
        questionText = "Was ist 'SR-IOV' (Single Root I/O Virtualization) und welches Problem bei Network-I/O in VMs löst es?",
        answerA = "SR-IOV ist ein RAID-Controller-Standard für virtuelle Maschinen",
        answerB = "SR-IOV erlaubt einer physischen PCIe-Gerät (z.B. NIC) mehrere virtuelle Funktionen (VFs) zu präsentieren, die direkt an VMs zugewiesen werden — ohne Hypervisor-Overhead pro Paket",
        answerC = "SR-IOV ist ein CPU-Feature, das Network-Interrupts direkt an den zuständigen VM-Core weiterleitet",
        answerD = "SR-IOV virtualisiert den PCI-Bus, sodass mehrere VMs gleichzeitig dasselbe Gerät nutzen können, mit Hypervisor als Arbiter",
        correctAnswer = 1,
        explanation = "Ohne SR-IOV muss jedes Netzwerkpaket durch den Hypervisor (virtio, VirtIO) — das kostet CPU-Zyklen. Mit SR-IOV erstellt der physische NIC 'Virtual Functions' (VFs) als eigenständige PCIe-Funktionen. VMs greifen direkt auf ihre VF zu (DMA, Interrupts), der Hypervisor ist nicht im Datenpfad — native Performance.",
        difficulty = 5,
        funFact = "AWS, Azure und GCP bieten alle SR-IOV-beschleunigten Networking an. AWS nennt es 'Enhanced Networking' (ENA), Azure 'Accelerated Networking'. Typische Latenzreduktion: 200µs → 25µs, Durchsatz: 1 Gbit/s → 100 Gbit/s."
    ),
    // 34
    Question(
        categoryId = 7,
        questionText = "Was ist 'Torus Netzwerktopologie' und in welchen HPC-Systemen wird sie eingesetzt?",
        answerA = "Eine Stern-Topologie mit einem zentralen Switch-Torus als Backbone",
        answerB = "Ein mehrdimensionales Gitter, bei dem die Randknoten jeder Dimension mit den gegenüberliegenden Randknoten verbunden sind — bildet einen 'Donut' ohne Ränder",
        answerC = "Eine kreisförmige Ring-Topologie mit Redundanzlinks für Fehlertoleranz",
        answerD = "Eine hierarchische Topologie aus mehreren Fat-Trees, die an ihrer Wurzel verbunden sind",
        correctAnswer = 1,
        explanation = "Ein k-dimensionaler Torus verbindet Knoten in einem k-dim Gitter, wobei die Enden jeder Dimension 'wrap-around'-Links haben. Ein 3D-Torus hat jeder Knoten 6 Nachbarn. IBM's Blue Gene-Serie nutzte 3D-/5D-Torus. Der Vorteil: gleichmäßige Latenz, gut für Nearest-Neighbor-Kommunikation in Simulationen.",
        difficulty = 5,
        funFact = "Fugaku (RIKEN, Japan, ehemals #1 Welt) nutzt einen 6D Torus-Mesh aus Tofu-D Interconnect-Knoten mit 6,8 TB/s bidirektionaler Bisektionsbandbreite — mehr als alle anderen Supercomputer seiner Zeit."
    ),
    // 35
    Question(
        categoryId = 7,
        questionText = "Was ist 'Out-of-Order Commit' und warum ist er im Vergleich zu Out-of-Order-Execution gefährlich?",
        answerA = "Out-of-Order-Commit ist eine valide Optimierung für spekulative Berechnungen ohne Nebenwirkungen",
        answerB = "Out-of-Order-Commit ist nicht erlaubt: Architekturzustand (Register, Memory) darf nur in-order aktualisiert werden, da bei Exceptions/Mispredicts sonst ein konsistenter Rollback unmöglich wäre",
        answerC = "Out-of-Order-Commit ist in VLIW-Architekturen erlaubt, in OoO-Prozessoren verboten",
        answerD = "Out-of-Order-Commit kann nur für Load-Instruktionen erlaubt werden, nicht für Stores",
        correctAnswer = 1,
        explanation = "Der ROB (Reorder Buffer) garantiert In-Order-Commit: Nur wenn eine Instruktion den ROB-Kopf erreicht UND keine Ausnahme aufgetreten ist, werden ihre Ergebnisse in den architekturellen Zustand committed. Out-of-Order-Commit würde bei einem Branch-Mispredict oder einer Exception eine unmögliche 'teilweise Ausführung' im Architekturzustand hinterlassen.",
        difficulty = 5,
        funFact = "Das Prinzip des In-Order-Commit ist so fundamental, dass es seit den ersten OoO-CPUs (IBM 360/91, 1967) unverändert gilt. Es ist die Grundlage für precise exceptions — ohne die kein modernes OS und kein Debugging möglich wäre."
    ),
    // 36
    Question(
        categoryId = 7,
        questionText = "Was ist 'Load-Store Reordering' im x86 TSO-Speichermodell und wann ist es erlaubt?",
        answerA = "x86 TSO erlaubt niemals Reordering zwischen Loads und Stores",
        answerB = "x86 TSO erlaubt, dass ein Load vor einem vorangehenden Store desselben Threads sichtbar wird, wenn sie verschiedene Adressen betreffen (Store-Load Reordering durch Store Buffer)",
        answerC = "x86 TSO erlaubt beliebige Reordering zwischen Loads und Stores, solange ein sfence verwendet wird",
        answerD = "x86 erlaubt Store-Store Reordering, aber kein Load-Load Reordering",
        correctAnswer = 1,
        explanation = "TSO (Total Store Order) erlaubt Store-Load Reordering: Wenn Thread A einen Store auf Adresse X macht, dann ein Load von Adresse Y (Y≠X), kann der Load für andere Threads früher sichtbar sein als der Store. Ursache: Stores werden im Store Buffer gepuffert. mfence verhindert dies. Load-Load und Store-Store Reordering sind in TSO verboten.",
        difficulty = 5,
        funFact = "Das Dekker-Algorithmus-Beispiel für Mutual Exclusion bricht ohne Memory-Barriers auf x86 TSO — ein klassisches Beispiel dafür, dass selbst das 'starke' x86-Modell subtile Reorderings erlaubt."
    ),
    // 37
    Question(
        categoryId = 7,
        questionText = "Was ist 'Precise Exception' (auch 'precise interrupt') in OoO-Prozessoren und warum ist es schwer zu implementieren?",
        answerA = "Eine Exception, die garantiert mit dem exakten Programmzähler und dem architekturellen Zustand genau vor der fehlerhaften Instruktion gemeldet wird",
        answerB = "Eine Hardware-Exception, die innerhalb von 1 Taktzyklus ohne Software-Eingriff behandelt wird",
        answerC = "Eine Exception, die nur in precise-mode CPUs (nicht in OoO) auftritt",
        answerD = "Eine konfigurierbare Exception mit definierter Priorität gegenüber Interrupts",
        correctAnswer = 0,
        explanation = "Bei OoO-Execution laufen Instruktionen in beliebiger Reihenfolge. Bei einer Exception (z.B. Division durch Null in Instruktion 42) muss der CPU-Zustand so aussehen, als wären Instruktionen 1-41 ausgeführt und 42+ nicht — auch wenn manche von 43-100 schon fertig sind. Der ROB garantiert dies durch In-Order-Commit und Rollback.",
        difficulty = 5,
        funFact = "Ohne Precise Exceptions wäre modernes Multitasking, virtual memory (Page Faults), Debugging und JIT-Compilation nicht möglich. Die Forderung nach precise exceptions war ein Hauptgrund für den ROB in Tomasulos ursprünglichem Design."
    ),
    // 38
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen 'Write-Through' und 'Write-Back' Cache-Policies?",
        answerA = "Write-Through schreibt direkt in DRAM und Cache; Write-Back schreibt nur in den Cache, DRAM wird erst bei Eviction aktualisiert",
        answerB = "Write-Through invalidiert andere Caches sofort; Write-Back wartet auf explizite Flush-Befehle",
        answerC = "Write-Through ist für L1, Write-Back ist für L3 vorgeschrieben",
        answerD = "Write-Through benötigt ECC, Write-Back kommt ohne ECC aus",
        correctAnswer = 0,
        explanation = "Write-Through: Jeder Store geht sofort sowohl in den Cache als auch in den nächsttieferen Speicher — einfach aber langsam (jeder Write blockiert bis DRAM). Write-Back: Stores gehen nur in den Cache, der Eintrag wird als 'dirty' markiert. DRAM wird erst aktualisiert, wenn die Cache-Line verdrängt wird — schnell, aber komplexer (Kohärenz, Crash-Recovery).",
        difficulty = 5,
        funFact = "L1/L2-Caches moderner CPUs sind fast immer Write-Back. Write-Through wird noch in Embedded-Systemen oder bei nicht-kohärenten DMA-Transfers verwendet, wo Einfachheit vor Performance geht."
    ),
    // 39
    Question(
        categoryId = 7,
        questionText = "Was ist 'Prefetching' in modernen CPUs und welche Arten von Hardware-Prefetchern gibt es?",
        answerA = "Prefetching ist das vorausschauende Laden von Daten in den Cache, bevor sie benötigt werden; typische Hardware-Prefetcher: Sequential (nächste Cache-Line), Stride (erkennt regelmäßige Abstände), Spatial (lädt ganze Seiten vor)",
        answerB = "Prefetching ist ausschließlich eine Software-Technik via __builtin_prefetch(); Hardware-Prefetcher gibt es nicht",
        answerC = "Hardware-Prefetcher existieren nur für Instruktions-Caches, nicht für Daten-Caches",
        answerD = "Prefetching lädt Daten in L1-Cache, während Software-Prefetch nur L2 und L3 befüllt",
        correctAnswer = 0,
        explanation = "Hardware-Prefetcher beobachten Access-Patterns: Sequential Prefetcher lädt bei jedem Miss die nächste Cache-Line. Stride Prefetcher erkennt regelmäßige Abstände (z.B. Array mit stride=64). IP-basierte Prefetcher lernen pro Instruktion das Muster. Modern: Correlated Prefetcher und ML-basierte Prefetcher (ARM Cortex-X4).",
        difficulty = 5,
        funFact = "Falsche Hardware-Prefetches können Performance verschlechtern: Bei Pointer-Chasing (linked lists) ist der nächste Zugriff unvorhersehbar, und aggressive Prefetcher vergeuden Bandbreite. Deshalb sind Prefetcher oft deaktivierbar via MSR."
    ),
    // 40
    Question(
        categoryId = 7,
        questionText = "Was ist 'Store-to-Load Forwarding' und wann schlägt es fehl?",
        answerA = "Der Store Buffer gibt das zuletzt gespeicherte Datum direkt an einen nachfolgenden Load derselben Adresse weiter, ohne den Cache zu lesen",
        answerB = "Der L1-Cache leitet Store-Operationen direkt an das Load-Store-Unit ohne Pipeline-Unterbrechung",
        answerC = "Eine Technik um mehrere Stores zusammenzufassen bevor sie den Cache erreichen",
        answerD = "Das Weiterleiten von Store-Ergebnissen durch das Register-File an wartende Loads",
        correctAnswer = 0,
        explanation = "Store-to-Load Forwarding: Wenn ein Load dieselbe Adresse wie ein kurz zuvor ausgeführter Store liest (und der Store noch im Store Buffer ist), gibt der Store Buffer den Wert direkt weiter — kein Cache-Zugriff nötig. Fehlschlag (Store Forwarding Stall): wenn Load-Adresse/Größe nicht exakt zur Store-Adresse/Größe passt (z.B. Store 4 Bytes, Load 8 Bytes).",
        difficulty = 5,
        funFact = "Store-Forwarding-Stalls können bei fehlerhafter Codierung (z.B. Typ-Punning via Union) mehrere Dutzend Taktzyklen kosten. Agner Fog's Optimization Manuals dokumentieren exakte Store-Forwarding-Regeln für jede CPU-Microarchitektur."
    ),
    // 41
    Question(
        categoryId = 7,
        questionText = "Was ist 'TLB Shootdown' in einem Mehrprozessorsystem und warum ist er teuer?",
        answerA = "Ein TLB-Shootdown tritt auf, wenn der TLB vollständig überlaufen ist und alle Einträge neu geladen werden müssen",
        answerB = "Wenn ein Prozessor Page-Table-Einträge ändert (z.B. munmap), müssen alle anderen Prozessoren per IPI (Inter-Processor Interrupt) ihre TLBs für diese Adressen invalidieren — das stoppt alle Kerne kurz",
        answerC = "Ein TLB-Shootdown ist eine Optimierung, bei der mehrere TLB-Invalidierungen zu einer zusammengefasst werden",
        answerD = "Ein Sicherheitsmechanismus, der den TLB bei einem Kontext-Switch vollständig leert",
        correctAnswer = 1,
        explanation = "Wenn Prozess A auf Core 0 eine Page freigibt (munmap), könnten andere Cores noch alte TLB-Einträge haben. Core 0 sendet IPIs an alle anderen Cores, die ihre TLBs für die betroffenen Seiten invalidieren müssen (invlpg/TLBI). Alle Kerne pausieren kurz — in Systemen mit 128+ Cores sehr teuer.",
        difficulty = 5,
        funFact = "Linux 5.3 führte 'Lazy TLB Shootdown' ein: Einige Shootdowns werden verzögert bis der Thread auf dem anderen Core scheduled wird. Bei Containerized Workloads (Docker, Kubernetes) sind TLB-Shootdowns ein messbarer Overhead."
    ),
    // 42
    Question(
        categoryId = 7,
        questionText = "Was ist 'Write Combining' (WC) Memory-Typ und für welche Anwendung ist er designed?",
        answerA = "Write Combining kombiniert mehrere kleine Writes zu einem großen DDR-Burst für Cache-kohärenten Speicher",
        answerB = "WC ist ein nicht-kohärenter Speichertyp, der Store-Writes puffert und als große Burst-Transaktionen über PCIe sendet — ideal für GPU-Framebuffer und NIC-Tx-Queues",
        answerC = "Write Combining ist ein Software-Pattern für Write-Coalescing in Netzwerkstacks",
        answerD = "WC-Speicher ist schreibgeschützt und erlaubt nur atomare Compare-and-Swap-Operationen",
        correctAnswer = 1,
        explanation = "WC-Speicher (MTRR/PAT-Typ) ist nicht kohärent und nicht gecacht. Writes werden in Write-Combining Buffers (typisch 64 Bytes) gesammelt und dann als ein PCIe-Burst übertragen. Ideal für GPU-VRAM und DMA-Descriptor-Queues: sequential writes werden kombiniert, kein Cache-Overhead, maximaler PCIe-Durchsatz.",
        difficulty = 5,
        funFact = "Ohne WC-Speicher für GPU-Framebuffer wäre das Schreiben von Pixeln um 4-10x langsamer. Vulkan und D3D12 legen Descriptor-Heaps explizit in WC-Speicher für maximale Upload-Bandbreite."
    ),
    // 43
    Question(
        categoryId = 7,
        questionText = "Was ist 'Superscalar Execution' und wie unterscheidet es sich von Pipelining?",
        answerA = "Superscalar bedeutet, dass der Prozessor eine tiefere Pipeline hat als ein skalarer Prozessor",
        answerB = "Superscalar bedeutet, dass der Prozessor mehrere unabhängige Instruktionen pro Taktzyklus gleichzeitig ausgeben und ausführen kann — mehrere parallele Pipelines statt einer",
        answerC = "Superscalar ist ein anderer Begriff für Out-of-Order-Execution",
        answerD = "Superscalar bedeutet, dass der Prozessor SIMD-Instruktionen auf mehrere Lanes verteilt",
        correctAnswer = 1,
        explanation = "Pipelining: Eine Pipeline, mehrere Instruktionen in verschiedenen Stages (sequentiell überlappend). Superscalar: Mehrere parallele Pipelines — z.B. ein 4-wide superscalar Prozessor kann 4 Instruktionen pro Zyklus fetchen, decodieren und committen. Moderne CPUs (Intel Core, AMD Zen) sind 4-6-wide superscalar UND out-of-order.",
        difficulty = 5,
        funFact = "Der erste kommerzielle Superscalar-Prozessor war der Intel i960CA (1989) — allerdings ein RISC-Prozessor, kein x86. Der erste x86-Superscalar war der Intel Pentium (1993). Heute sind 6-wide-Superscalar-Prozessoren Standard (Apple M-Serie: 8-wide)."
    ),
    // 44
    Question(
        categoryId = 7,
        questionText = "Was ist 'Simultaneous Multithreading' (SMT / Hyperthreading) auf Hardware-Ebene?",
        answerA = "SMT verdoppelt alle CPU-Ressourcen (ALUs, Caches, Register) für zwei parallele Threads",
        answerB = "SMT repliziert den architekturellen Zustand (Register File, PC, EFLAGS) für mehrere Threads, teilt aber die Ausführungseinheiten — beide Threads können gleichzeitig Instruktionen in den Scheduler einspeisen",
        answerC = "SMT ist eine Software-Abstraktion des OS, die zwei logische CPUs auf einer physischen simuliert",
        answerD = "SMT deaktiviert alternierend verschiedene CPU-Funktionseinheiten um Wärme zu reduzieren",
        correctAnswer = 1,
        explanation = "SMT repliziert pro logischem Thread: Register File, Program Counter, EFLAGS/PSTATE, TLB-State (ASID). Geteilt werden: Ausführungseinheiten (ALU, FPU, Load-Store), L1/L2-Caches, Decoders (meist), Branch Predictor. Zwei Threads füllen verschiedene Slot-Typen — Thread A blockiert auf Load, Thread B nutzt ALUs.",
        difficulty = 5,
        funFact = "Hyperthreading wurde 2002 mit dem Pentium 4 (Northwood) eingeführt. SMT kann 15-30% mehr Durchsatz bei Server-Workloads bringen, aber für latenz-sensitive Anwendungen (Trading, Gaming) oft deaktiviert weil Thread-B-Cache-Pollution Thread-A schadet."
    ),
    // 45
    Question(
        categoryId = 7,
        questionText = "Was ist der 'Fetch-Decode-Bottleneck' in modernen x86-Prozessoren und wie löst ihn der Micro-Op-Cache?",
        answerA = "x86-Instruktionen haben variable Länge (1-15 Bytes), was paralleles Dekodieren sehr komplex macht; der uOp-Cache speichert vordecodierte Mikrooperationen und überbrückt diesen Engpass",
        answerB = "Der Fetch-Bottleneck entsteht durch Branch-Mispredictions; der uOp-Cache speichert die häufigsten Branch-Targets",
        answerC = "x86-Decoder können nur 2 Instruktionen/Zyklus verarbeiten; der uOp-Cache erlaubt 4 Dekodierungen durch Parallelisierung",
        answerD = "Der uOp-Cache ist ein L0-Instruktionscache, der häufige Code-Sequenzen komprimiert speichert",
        correctAnswer = 0,
        explanation = "x86 hat variable Instruktionslängen (1-15 Bytes): Der Decoder muss zuerst Grenzen finden, dann decodieren — sehr komplex. Intel's uOp-Cache (seit Sandy Bridge, 2011) speichert bis zu 1536 Micro-Ops (bereits decodierte Instruktionen). Bei Cache-Hit (>80% typisch) wird der komplexe x86-Decoder komplett umgangen.",
        difficulty = 5,
        funFact = "Der uOp-Cache ist der Grund, warum Sandy Bridge so viel schneller war als Nehalem. AMD nennt ihr Äquivalent 'Op Cache'. Apple's M-Chips mit nativer ARM-ISA haben dieses Problem nicht — ARM-Instruktionen sind alle 4 Bytes."
    ),
    // 46
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen 'Physical Address Extension' (PAE) und '64-Bit Long Mode' für Speicheradressierung?",
        answerA = "PAE erweitert den physischen Adressraum auf 36 Bit (64 GB), während der virtuelle Adressraum 32 Bit bleibt; Long Mode erweitert virtuelle und physische Adressen auf 64 Bit",
        answerB = "PAE ist ein 64-Bit-Modus für ältere 32-Bit-CPUs, Long Mode ist nur für 64-Bit-CPUs",
        answerC = "PAE erlaubt 4 GB RAM pro Prozess, Long Mode erlaubt unbegrenzte RAM-Nutzung pro Prozess",
        answerD = "PAE und Long Mode sind identisch — nur verschiedene Namen von Intel (PAE) und AMD (Long Mode)",
        correctAnswer = 0,
        explanation = "PAE (Intel, 1995): 3-stufige Seitentabellen (PDPTE/PDE/PTE), physische Adressen auf 36 Bit erweitert (max. 64 GB RAM). Aber: virtueller Adressraum bleibt 32 Bit, max. 4 GB pro Prozess. Long Mode (AMD64/x86-64): 4-stufige Seitentabellen (PML4/PDPT/PDE/PTE), virtuelle Adressen 48 Bit (256 TB), physische Adressen 52 Bit (4 PB).",
        difficulty = 5,
        funFact = "Windows Vista 32-bit hat PAE eingeführt, aber durch 'hotfix für trichotomy'... tatsächlich wurde PAE von Microsoft für Kunden-PCs absichtlich auf 4GB gecappt um 64-Bit-Windows zu verkaufen. Servers nutzen PAE mit >4GB RAM."
    ),
    // 47
    Question(
        categoryId = 7,
        questionText = "Was ist 'DRAM tRCD' (RAS to CAS Delay) und was begrenzt seine Minimierung?",
        answerA = "tRCD ist die Zeit vom Anlegen einer Zeilnadresse bis zum vollständigen Laden der Zeilenzellen in den Sense-Amplifier — begrenzt durch RC-Zeitkonstante der Wortleitung",
        answerB = "tRCD ist die Zykluszeit zwischen zwei Refresh-Operationen, begrenzt durch Kapazität der DRAM-Zellen",
        answerC = "tRCD ist die Signalverzögerung zwischen DDR-Controller und DRAM-Chip, begrenzt durch PCB-Leitungslänge",
        answerD = "tRCD ist die Zeit für einen vollständigen DRAM-Schreibzyklus, begrenzt durch Sättigungsgeschwindigkeit des Kondensators",
        correctAnswer = 0,
        explanation = "tRCD: Nach dem Row-Activate-Befehl (RAS) müssen alle Sense-Amplifier der aktivierten Zeile ihre Kapazitoren ausgelesen und verstärkt haben, bevor ein Column-Access (CAS) erfolgen kann. Begrenzt durch RC-Delay der Wortleitung (Widerstand der Metallleitungen × Kapazität der Kondensatoren). Bei höherer DRAM-Dichte werden Leitungen länger → höheres tRCD.",
        difficulty = 5,
        funFact = "DDR5-DRAM hat typisch tRCD=40ns (≈16 Zyklen bei 3200 MT/s). Bei 3D-gestapeltem DRAM (HBM2E) sind tRCD=7ns möglich — weil die Wortleitungen durch TSV-Verbindungen viel kürzer sind."
    ),
    // 48
    Question(
        categoryId = 7,
        questionText = "Was ist 'Instruction-Level Parallelism' (ILP) und warum stoßen OoO-Prozessoren an seine Grenzen?",
        answerA = "ILP ist die theoretische Anzahl paralleler Instruktionen die ein Programm zulässt; OoO-CPUs sind durch Datenabhängigkeiten (RAW), Kontrollfluss (Branches) und Speicheraliasing limitiert",
        answerB = "ILP ist die Anzahl der Funktionseinheiten in einer CPU; mehr Einheiten bedeuten mehr ILP",
        answerC = "ILP ist nur durch die Frequenz einer CPU limitiert, nicht durch das Programm selbst",
        answerD = "ILP-Grenzen entstehen ausschließlich durch den Compiler, der nicht genug Parallelität extrahiert",
        correctAnswer = 0,
        explanation = "ILP-Grenzen: RAW-Abhängigkeiten (Read After Write — echter Dattenfluss: Instruktion B braucht Ergebnis von A), Branches (Kontrollfluss unbekannt bis Auflösung), Memory Aliasing (Load und Store auf evtl. gleiche Adresse erzwingen Ordering), limitierter ROB-Größe. Wallchurch/Jouppi (1992) zeigten: selbst in perfekten OoO-CPUs ist ILP in typischen Programmen <8 IPC.",
        difficulty = 5,
        funFact = "Die Grenze des ILP war der Hauptgrund für den Übergang von Frequenzskalierung zu Mehrkernsystemen (~2005). Mehrere Kerne für Thread-Level-Parallelism (TLP) statt mehr ILP auf einem Kern."
    ),
    // 49
    Question(
        categoryId = 7,
        questionText = "Was ist 'Coherence vs. Consistency' in Multiprozessor-Speichersystemen?",
        answerA = "Kohärenz und Konsistenz sind Synonyme für dasselbe Konzept",
        answerB = "Kohärenz garantiert, dass alle Prozessoren dasselbe Bild einer einzelnen Speicherstelle sehen; Konsistenz definiert die Reihenfolge, in der Schreibzugriffe auf VERSCHIEDENE Adressen für alle Prozessoren sichtbar werden",
        answerC = "Kohärenz ist ein Hardware-Konzept, Konsistenz ein Software-Konzept ohne Hardware-Implikationen",
        answerD = "Kohärenz betrifft L1-Caches, Konsistenz betrifft L3-Cache und Hauptspeicher",
        correctAnswer = 1,
        explanation = "Cache Coherence: Wenn CPU A auf Adresse X schreibt, sehen alle anderen CPUs irgendwann den neuen Wert — Kohärenz für eine einzelne Variable. Memory Consistency Model: In welcher Reihenfolge werden Schreibzugriffe auf X und Y für andere Prozessoren sichtbar? TSO erlaubt Store-Load Reordering über verschiedene Adressen. Sequential Consistency verbietet jedes Reordering.",
        difficulty = 5,
        funFact = "Leslie Lamport definierte Sequential Consistency 1979 als das intuitivste Speichermodell. Leider ist SC inkompatibel mit Store Buffers — daher nutzen alle realen CPUs schwächere Modelle (TSO, ARM/relaxed) mit expliziten Barriers."
    ),
    // 50
    Question(
        categoryId = 7,
        questionText = "Was ist 'Hardware Prefetcher Training' und warum kann er bei Pointer-Chasing-Workloads versagen?",
        answerA = "Hardware-Prefetcher lernen Stride-Patterns durch Beobachtung von Cache-Miss-Adressen; bei Pointer-Chasing ist die nächste Adresse erst nach dem aktuellen Load bekannt — kein Stride-Pattern erkennbar",
        answerB = "Hardware-Prefetcher versagen bei Pointer-Chasing weil der L1-Cache zu klein ist",
        answerC = "Bei Pointer-Chasing werden zu viele Prefetch-Requests generiert, die den Bus sättigen",
        answerD = "Hardware-Prefetcher sind für Pointer-Chasing optimiert, versagen aber bei sequentiellen Zugriffen",
        correctAnswer = 0,
        explanation = "Stride-Prefetcher: Erkennt regelmäßige Adressabstände (A, A+64, A+128...) und prefetcht voraus. Pointer-Chasing: next = *ptr; ptr = next — die nächste Adresse ist der Inhalt des aktuellen Speicherorts, völlig unvorhersehbar bis nach dem Load. Kein Stride, kein Muster → Prefetcher hilflos → jeder Pointer-Deref ist ein Cache-Miss → kritische Latenz-Kette.",
        difficulty = 5,
        funFact = "Intel hat 2021 einen 'Data Prefetcher' in Alder Lake integriert, der bis zu 4 verschachtelte Pointer-Chaining-Streams erkennen kann. Google und Meta verwenden dennoch 'Software Prefetch'-Instruktionen (prefetcht0) für kritische Pointer-Chasing-Hotspots in ihren Serving-Systemen."
    )
)
