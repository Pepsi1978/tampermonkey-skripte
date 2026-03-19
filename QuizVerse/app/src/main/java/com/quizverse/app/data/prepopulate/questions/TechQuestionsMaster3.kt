package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsMaster3(): List<Question> = listOf(
    // 1
    Question(
        categoryId = 7,
        questionText = "Was unterscheidet einen Exokernel fundamental von einem Microkernel?",
        answerA = "Ein Exokernel delegiert Gerätetreiber in den Userspace, ein Microkernel nicht",
        answerB = "Ein Exokernel multiplext Hardware-Ressourcen ohne Abstraktion; Schutz und Verwaltung liegen in Bibliotheks-Betriebssystemen",
        answerC = "Ein Exokernel implementiert alle POSIX-Syscalls direkt im Kernel-Space",
        answerD = "Ein Exokernel verwendet einen monolithischen Adressraum für alle Prozesse",
        correctAnswer = 1,
        explanation = "Der Exokernel (MIT, Dawson Engler) trennt Schutz von Verwaltung: Der Kernel multiplext nur Hardware sicher (secure binding, visible resource revocation, abort protocol), während Bibliotheks-Betriebssysteme (libOSes) im Userspace beliebige Abstraktionen implementieren. Microkernels abstrahieren dagegen Ressourcen durch Systemdienste.",
        difficulty = 5,
        funFact = "Das Exokernel-Papier von 1995 zeigte, dass eine angepasste libOS-Applikation IPC 10× schneller erledigen kann als Mach – weil kein Abstraktion-Overhead im Pfad liegt."
    ),
    // 2
    Question(
        categoryId = 7,
        questionText = "Welcher Mechanismus wird beim TLB-Shootdown auf einem SMP-System verwendet?",
        answerA = "Ein dedizierter Hardware-Bus sendet ein FLUSH-Signal an alle CPU-Caches gleichzeitig",
        answerB = "Das Memory Management Unit (MMU) löscht automatisch alle TLB-Einträge bei einer Page-Table-Änderung",
        answerC = "Ein globaler Spinlock serialisiert alle TLB-Änderungen über alle CPUs hinweg ohne IPI",
        answerD = "Der Kernel sendet Inter-Processor Interrupts (IPIs) an alle betroffenen CPUs, die daraufhin ihre lokalen TLB-Einträge invalidieren",
        correctAnswer = 3,
        explanation = "Da jede CPU einen eigenen TLB hat, muss bei einer Page-Table-Änderung (z.B. munmap) sichergestellt werden, dass alle CPUs die veralteten Einträge verwerfen. Dafür sendet der Kernel IPIs (INVLPG-Instruktion auf x86). TLB-Shootdowns sind teure Operationen – daher nutzen moderne Systeme lazy shootdown und Batching.",
        difficulty = 5,
        funFact = "Linux verwendet tlb_finish_mmu() mit Batching und cpumask, um die Anzahl der gesendeten IPIs zu minimieren – bei breiten NUMA-Systemen mit 1000+ Kernen ist das existenziell wichtig."
    ),
    // 3
    Question(
        categoryId = 7,
        questionText = "Was ist das Kernprinzip von Copy-on-Write (CoW) in ZFS?",
        answerA = "Schreiboperationen verändern niemals vorhandene Blöcke; neue Daten landen immer in neuen Blöcken, veraltete werden erst später freigegeben",
        answerB = "ZFS kopiert Blöcke beim Lesen in einen Read-Cache für schnelleren Zugriff",
        answerC = "ZFS komprimiert alle Schreibvorgänge und speichert sie als Delta zum letzten Snapshot",
        answerD = "Der ZFS-Intent-Log (ZIL) puffert alle Writes und schreibt CoW-Kopien asynchron",
        correctAnswer = 0,
        explanation = "ZFS schreibt niemals in bestehende Blöcke (no overwrite). Jede Änderung erzeugt neue Blöcke; der Metadaten-Baum (DMU, DSL) wird von unten nach oben neu geschrieben und erst am Ende die neue Uberblock-Wurzel atomisch committed. Das macht ZFS inherent crash-konsistent ohne separates Journal.",
        difficulty = 5,
        funFact = "ZFS CoW bedeutet, dass ein Snapshot bildlich 'kostenlos' ist: Er friert nur den alten Uberblock ein. Speicher wird erst verbraucht, wenn der Originaldatensatz geändert wird."
    ),
    // 4
    Question(
        categoryId = 7,
        questionText = "Welche Aussage über den Completely Fair Scheduler (CFS) in Linux ist korrekt?",
        answerA = "CFS verwendet eine feste Zeitscheibe für alle Prozesse und priorisiert über FIFO-Warteschlangen",
        answerB = "CFS implementiert Earliest Deadline First (EDF) und ist damit für Echtzeitsysteme zertifiziert",
        answerC = "CFS modelliert eine ideale Multiprozessor-CPU und verwaltet virtuelle Laufzeiten in einem Rot-Schwarz-Baum; der Prozess mit kleinster vruntime läuft als nächstes",
        answerD = "CFS berechnet Prioritäten ausschließlich anhand des Nice-Werts, ohne virtuelle Laufzeiten zu tracken",
        correctAnswer = 2,
        explanation = "CFS (Ingo Molnár, 2007, inspiriert durch Con Kolivas' RSDL) modelliert eine 'perfectly multitasking CPU'. Jeder Prozess bekommt eine vruntime (gewichtet nach Nice/Priorität). Der Baum aus wartenden Prozessen erlaubt O(log n) Einfügen und O(1) Auswahl des linksten (kleinsten vruntime) Knotens.",
        difficulty = 5,
        funFact = "CFS ersetzte den O(1)-Scheduler, weil dieser bei interaktiven Lasten schlechte Latenz zeigte. Die vruntime-Idee stammt konzeptuell vom Weighted Fair Queuing aus der Netzwerktechnik."
    ),
    // 5
    Question(
        categoryId = 7,
        questionText = "Was ist die hinreichende Bedingung für die Einplanbarkeit einer Task-Menge nach dem Rate Monotonic Scheduling (RMS)?",
        answerA = "Die Summe aller Auslastungen muss exakt 1,0 betragen",
        answerB = "Jede einzelne Task muss eine Auslastung von weniger als 50 % haben",
        answerC = "Die Perioden aller Tasks müssen paarweise teilerfremd sein",
        answerD = "Die Summe Ui = Ci/Ti für alle n Tasks muss ≤ n(2^(1/n) − 1) sein",
        correctAnswer = 3,
        explanation = "Liu & Layland (1973) bewiesen: Wenn U = Σ(Ci/Ti) ≤ n(2^(1/n)−1) gilt, ist die Task-Menge unter RMS garantiert einplanbar. Für n→∞ konvergiert die Schranke gegen ln(2) ≈ 0,693. Dies ist hinreichend, aber nicht notwendig – manche Task-Mengen sind auch bei höherer Auslastung einplanbar.",
        difficulty = 5,
        funFact = "Rate Monotonic ist optimal unter allen statischen Prioritätsvergaben: Wenn irgendein statischer Scheduler die Task-Menge einplanen kann, dann kann es auch RMS."
    ),
    // 6
    Question(
        categoryId = 7,
        questionText = "Was ist Static Single Assignment (SSA) Form in einem Compiler und wozu dient sie?",
        answerA = "Eine Intermediate Representation, in der jede Variable genau einmal definiert wird; Phi-Funktionen an Kontrollfluss-Zusammenführungen wählen den richtigen Wert",
        answerB = "Eine Darstellung, in der Variablen unveränderlich sind und deshalb direkt in Hardware-Register gemappt werden",
        answerC = "Ein Optimierungspass, der alle temporären Variablen durch Konstanten ersetzt",
        answerD = "Eine Form, die ausschließlich für funktionale Sprachen verwendet wird, da imperative Sprachen Aliasing haben",
        correctAnswer = 0,
        explanation = "In SSA wird jede Nutzung einer Variable eindeutig ihrer einzigen Definitionsstelle zugeordnet. Phi-Funktionen (φ) an Join-Points im Control Flow Graph fassen Definitionen aus verschiedenen Pfaden zusammen. SSA vereinfacht Analysen wie Reaching Definitions, Constant Propagation und Dead Code Elimination erheblich.",
        difficulty = 5,
        funFact = "LLVM IR, GCC GIMPLE, Java HotSpot und V8 Turbofan verwenden alle SSA-basierte Zwischen-Darstellungen. Phi-Funktionen sind keine echten Instruktionen – sie werden bei der Registerallokation aufgelöst."
    ),
    // 7
    Question(
        categoryId = 7,
        questionText = "Was bewirkt Loop Invariant Code Motion (LICM) als Compiler-Optimierung?",
        answerA = "Sie dreht Schleifen um, sodass sie rückwärts laufen und Branch-Prediction verbessern",
        answerB = "Sie wandelt zählungsgesteuerte Schleifen in ereignisgesteuerte Callbacks um",
        answerC = "Sie unrollt Schleifen automatisch um einen Faktor, der von der Schleifengrenze abhängt",
        answerD = "Sie verschiebt Berechnungen, deren Ergebnis sich innerhalb der Schleife nicht ändert, vor die Schleife heraus",
        correctAnswer = 3,
        explanation = "LICM identifiziert Ausdrücke, die im Schleifenkörper stehen, deren Operanden sich aber nicht zwischen Iterationen ändern (schleifenunabhängig). Diese werden in einen Loop Preheader-Block vor der Schleife verschoben, sodass die Berechnung nur einmal statt n-mal ausgeführt wird.",
        difficulty = 5,
        funFact = "LICM ist eine der ältesten und wirkungsvollsten Compiler-Optimierungen – sie wurde bereits in den 1960er-Jahren für FORTRAN-Compiler entwickelt, als Schleifen die dominante Rechenstruktur waren."
    ),
    // 8
    Question(
        categoryId = 7,
        questionText = "Welche Rolle spielt die Global Offset Table (GOT) im dynamischen Linker auf Linux?",
        answerA = "Sie speichert alle globalen Variablen einer Shared Library in einem gemeinsamen Segment",
        answerB = "Sie ist eine Tabelle mit Adressen externer Symbole, die der dynamische Linker zur Laufzeit einträgt, um positionsunabhängigen Code zu ermöglichen",
        answerC = "Sie enthält den vollständigen Quellcode der Bibliothek in komprimierter Form für Debug-Zwecke",
        answerD = "Sie mappt Syscall-Nummern auf Kernel-Handler-Adressen für den VDSO-Mechanismus",
        correctAnswer = 1,
        explanation = "Positionsunabhängiger Code (PIC) darf keine absoluten Adressen von externen Symbolen enthalten. Stattdessen wird über die GOT indirekt zugegriffen. Der dynamische Linker (ld.so) füllt die GOT-Einträge beim Laden (oder beim ersten Zugriff via PLT + lazy binding) mit den tatsächlichen Adressen.",
        difficulty = 5,
        funFact = "ASLR wäre ohne GOT/PLT nicht mit Shared Libraries kombinierbar: Da jede Bibliothek an einer zufälligen Adresse geladen wird, muss die GOT die Brücke zwischen aufrufendem Code und tatsächlicher Laufzeitadresse schlagen."
    ),
    // 9
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert der Tri-Color Marking Algorithmus bei der Garbage Collection?",
        answerA = "Objekte werden in drei Generationen aufgeteilt: jung (weiß), mittelalt (grau) und alt (schwarz)",
        answerB = "Drei GC-Threads markieren parallel, je einer für Heap, Stack und statische Variablen",
        answerC = "Farben repräsentieren Speicher-Generationen; weiße Objekte werden sofort freigegeben, graue nach einer Pause",
        answerD = "Weiß = noch nicht besucht/unerreichbar; Grau = besucht, aber Kinder noch nicht verarbeitet; Schwarz = vollständig verarbeitet. Invariante: Schwarz zeigt nie direkt auf Weiß",
        correctAnswer = 3,
        explanation = "Im Tri-Color Algorithmus (Dijkstra et al.) gilt die Tri-Color-Invariante: Kein schwarzes Objekt darf direkt auf ein weißes zeigen. Am Ende des Mark-Cycles sind weiße Objekte unerreichbar und können gesammelt werden. Grau-Objekte bilden die Arbeitsfront (GC-Wurzel bis Blätter).",
        difficulty = 5,
        funFact = "Concurrent GCs wie Go's GC und JVM's G1 halten die Tri-Color-Invariante durch Write Barriers aufrecht: Jede Pointer-Schreiboperation durch den Mutator muss das Zielobjekt grau färben."
    ),
    // 10
    Question(
        categoryId = 7,
        questionText = "Was ist das Kernprinzip von Shenandoah GC im Vergleich zu G1 GC?",
        answerA = "Shenandoah verwendet ausschließlich generationellen GC und kompaktiert nur die junge Generation",
        answerB = "Shenandoah ist ein Stop-the-World-Collector mit niedrigerer Latenz durch Hardware-Unterstützung",
        answerC = "Shenandoah führt Compaction concurrent mit laufendem Mutator durch; Brooks-Forwarding-Pointer ermöglichen gleichzeitiges Verschieben und Zugreifen",
        answerD = "Shenandoah verzichtet auf Compaction und verwendet stattdessen einen rein inkrementellen Mark-Sweep",
        correctAnswer = 2,
        explanation = "Shenandoah (Red Hat) ist der erste GC, der Evacuation (Heap-Kompaktierung) concurrent mit dem Mutator durchführt. Dazu wird jedem Objekt ein 'Brooks Forwarding Pointer' vorgestellt. Lesezugriffe gehen durch diesen Pointer; der GC kann Objekte verschieben, während die Anwendung läuft.",
        difficulty = 5,
        funFact = "ZGC (Oracle) löst dasselbe Problem anders: Statt Forwarding Pointer verwendet ZGC Load Barriers mit Colored Pointers (4 Metadaten-Bits im Adressraum (Bits 42–45) kodieren den GC-Zustand)."
    ),
    // 11
    Question(
        categoryId = 7,
        questionText = "Was ist Algorithm W in der Typinferenz und welche Komplexität hat es im Allgemeinen?",
        answerA = "Algorithm W ist ein deterministischer Parsing-Algorithmus für kontextfreie Grammatiken mit O(n³) Komplexität",
        answerB = "Algorithm W inferiert den allgemeinsten Typ (principal type) für Hindley-Milner-Terme; im Worst Case ist es DEXPTIME-vollständig für ML-ähnliche Sprachen mit tiefem let-Nesting",
        answerC = "Algorithm W löst das Halteproblem für typbare Lambda-Terme in polynomieller Zeit",
        answerD = "Algorithm W ist ein O(n log n) Unifikationsalgorithmus für einfach getypte Lambda-Terme",
        correctAnswer = 1,
        explanation = "Algorithm W (Milner 1978) berechnet den most general type (principal type scheme) für System F⁻-Terme. Obwohl es für praktische Haskell/ML-Code fast linear läuft, ist es im Worst-Case exponentiell durch tiefes Polymorphismus-Nesting im let. Die pathologischen Fälle sind in der Praxis selten.",
        difficulty = 5,
        funFact = "Das berühmte Beispiel für exponentiellen Hindley-Milner ist: let f₁ = λx.x in let f₂ = λx.f₁(f₁ x) in … – die Typgröße verdoppelt sich mit jedem Nesting-Level."
    ),
    // 12
    Question(
        categoryId = 7,
        questionText = "Was besagt das Fortschrittsprinzip (Progress) in der Typsicherheit nach Wright & Felleisen?",
        answerA = "Jedes typbare Programm terminiert in endlicher Zeit",
        answerB = "Typen können immer von konkreten Werten zu allgemeinen Polymorphismen verallgemeinert werden",
        answerC = "Der Typchecker schreitet in linearer Zeit durch den Syntaxbaum vor",
        answerD = "Jeder gut getypte Term ist entweder ein Wert oder kann einen Schritt der Auswertung machen",
        correctAnswer = 3,
        explanation = "Das Typsicherheits-Theorem besteht aus zwei Teilen: Progress (gut getypte Terme stecken nicht fest – sie sind Werte oder reduzieren weiter) und Preservation (Typen bleiben unter Reduktion erhalten). Progress verhindert Laufzeitfehler wie 'stuck terms' (z.B. 1 + true in einem untypisierten Kalkül).",
        difficulty = 5,
        funFact = "Robert Harper nennt dieses Theorem 'Type Safety' oder 'Soundness'. Es wurde durch das Wright & Felleisen Syntactic Approach popularisiert, das ohne denotationelle Semantik auskommt."
    ),
    // 13
    Question(
        categoryId = 7,
        questionText = "Was ist Separation Logic und welches Problem löst sie gegenüber klassischer Hoare-Logik?",
        answerA = "Separation Logic trennt Laufzeit-Typen von statischen Typen und ermöglicht so dynamische Dispatch-Beweise",
        answerB = "Separation Logic ist ein Beweissystem ausschließlich für nebenläufige Algorithmen ohne Shared Memory",
        answerC = "Separation Logic erweitert Hoare-Logik um den Separating Conjunction (∗), der disjunkten Heap-Besitz ausdrückt und so Aliasing-Probleme bei Pointer-Programmen beherrschbar macht",
        answerD = "Separation Logic ersetzt Vorbedingungen durch Typen und macht Pre/Post-Conditions überflüssig",
        correctAnswer = 2,
        explanation = "Klassische Hoare-Logik kämpft mit Aliasing: P(x) sagt nichts darüber, ob x und y auf denselben Speicher zeigen. Separation Logic (O'Hearn, Reynolds, Yang 2001) fügt P ∗ Q hinzu: 'P und Q gelten auf disjunkten Heap-Teilen'. Der Frame Rule erlaubt lokales Reasoning: Wenn {P} C {Q} gilt, dann gilt {P∗R} C {Q∗R} wenn C R nicht berührt.",
        difficulty = 5,
        funFact = "Meta's Infer-Tool (verwendet in WhatsApp, Instagram, Facebook) basiert auf Bi-Abduction – einer Form automatischer Separation Logic-Analyse, die fehlende Vor- und Nachbedingungen inferiert."
    ),
    // 14
    Question(
        categoryId = 7,
        questionText = "Welches Hauptmerkmal unterscheidet Log-Structured Merge-Trees (LSM) von B-Trees bei Datenbank-Dateisystemen?",
        answerA = "LSM-Trees erlauben nur sequentielle Lesezugriffe, B-Trees nur wahlfreie",
        answerB = "LSM-Trees puffern Schreibvorgänge im Speicher und schreiben sequentiell zu Disk; dafür zahlen sie mit Read-Amplification. B-Trees minimieren Read-Amplification auf Kosten höherer Write-Amplification",
        answerC = "LSM-Trees sind ausschließlich für In-Memory-Datenbanken geeignet und haben kein Disk-Backend",
        answerD = "LSM-Trees verwenden Copy-on-Write wie ZFS und benötigen daher kein Journaling",
        correctAnswer = 1,
        explanation = "LSM-Trees (O'Neil et al. 1996) konvertieren random writes in sequentielle writes durch Memtable + SSTable-Hierarchie mit periodischem Compaction. Gut für write-heavy Workloads (RocksDB, Cassandra, LevelDB). Reads müssen mehrere Ebenen absuchen (Bloom Filter helfen). B-Trees minimieren Read-Amplification auf Kosten von write-amplification.",
        difficulty = 5,
        funFact = "Google's Bigtable, Apache HBase, RocksDB, Cassandra und InfluxDB 2.0 nutzen LSM-Trees. Das ursprüngliche Papier beschreibt fünf Ebenen (C0 bis C4), wobei jede Ebene exponentiell größer ist."
    ),
    // 15
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem Tracing JIT und einem Method JIT?",
        answerA = "Tracing JIT kompiliert ganze Klassen; Method JIT kompiliert einzelne Methoden",
        answerB = "Tracing JIT verwendet ausschließlich Interpreter-Daten; Method JIT benötigt den Quellcode",
        answerC = "Beide sind identisch, aber Tracing JIT verwendet LLVM und Method JIT verwendet GCC als Backend",
        answerD = "Tracing JIT verfolgt und kompiliert heiße Ausführungspfade (Traces) über Methodengrenzen hinweg; Method JIT kompiliert ganze Methoden als Einheit",
        correctAnswer = 3,
        explanation = "Tracing JIT (LuaJIT, früher Firefox TraceMonkey) erkennt heiße Schleifen, verfolgt ihre Ausführung (inklusive Inlining über Methodengrenzen), und kompiliert den Trace als flache Befehlsfolge. Method JIT (HotSpot C2, V8 Crankshaft/Turbofan) kompiliert gesamte Methoden – bessere Optimierungsmöglichkeiten, aber höherer Overhead.",
        difficulty = 5,
        funFact = "LuaJIT von Mike Pall gilt als einer der schnellsten Tracing JITs je entwickelt. Er erreichte auf manchen Benchmarks Geschwindigkeiten nahe optimiertem C – für eine dynamisch typisierte Sprache außergewöhnlich."
    ),
    // 16
    Question(
        categoryId = 7,
        questionText = "Was ist Deoptimierung (Deoptimization) in einem JIT-Compiler?",
        answerA = "Das Zurückschalten vom kompilierten in den Interpreter-Modus, wenn eine Optimierungsannahme verletzt wird",
        answerB = "Eine Compiler-Optimierung, die ineffizienten Code identifiziert und durch langsamere aber korrektere Alternativen ersetzt",
        answerC = "Das Entfernen von JIT-kompiliertem Code aus dem Cache bei Speichermangel",
        answerD = "Die Umwandlung von SSA-Form zurück in drei-Adress-Code vor der Codegenerierung",
        correctAnswer = 0,
        explanation = "JITs treffen spekulative Annahmen (z.B. 'dieser Typ ist immer Integer'). Wenn eine Annahme sich als falsch erweist (Type Guard schlägt fehl), muss der JIT zur Interpreter-Ausführung zurückkehren – Deoptimierung. Das Frame-Mapping (Bytecode-zu-nativer-Frame) muss genau rekonstruiert werden.",
        difficulty = 5,
        funFact = "V8's Turbofan führt Deoptimierungen so häufig durch, dass es ein spezielles Deopt-Profiling gibt: chrome://tracing zeigt 'Deopt' Events. Häufige Deoptimierungen ('Deopt loops') können Skripte um Faktor 100 verlangsamen."
    ),
    // 17
    Question(
        categoryId = 7,
        questionText = "Welche Invariante garantiert der Slab-Allokator im Linux-Kernel?",
        answerA = "Jedes Objekt wird exakt einmal während der Laufzeit alloziert und niemals freigegeben",
        answerB = "Der Slab-Allokator garantiert Zero-Overhead durch direkte Verwendung von Hardware-SRAM",
        answerC = "Slabs werden ausschließlich für User-Space-Allokationen genutzt; der Kernel verwendet Buddy-Allokation",
        answerD = "Objekte gleicher Größe und gleichen Typs liegen in dedizierten Caches (Slabs); Konstruktor/Destruktor-Aufrufe werden amortisiert, da Objekte nach dem Freigeben im Cache verbleiben",
        correctAnswer = 3,
        explanation = "Der Slab-Allokator (Bonwick 1994) verwaltet Caches für häufig benötigte Kernel-Objekte (task_struct, inode, socket). Freigegebene Objekte bleiben im Cache – ihre Initialisierung (Konstruktor) wird nicht wiederholt. Dies vermeidet cache-thrashing und reduziert Fragmentierung gegenüber generischer Buddy-Allokation.",
        difficulty = 5,
        funFact = "Linux hat drei Slab-Implementierungen: SLAB (Original), SLUB (Standard seit 2.6.23, weniger Metadaten) und SLOB (minimalistisch für embedded). SLUB ist heute der Default und eliminiert viele Per-CPU-Listen des alten SLAB."
    ),
    // 18
    Question(
        categoryId = 7,
        questionText = "Was ist das Top-Half/Bottom-Half-Modell der Linux-Interrupt-Behandlung?",
        answerA = "Hardware-Interrupts (Top Half) werden mit voller CPU-Priorität behandelt; zeitaufwändige Nacharbeit (Bottom Half) wird in Softirqs, Tasklets oder Workqueues verschoben",
        answerB = "Der Top Half läuft im Userspace; der Bottom Half im Kernel-Space für alle Interrupts",
        answerC = "Top Half bezeichnet NMI-Interrupts; Bottom Half bezeichnet maskierbare Interrupts",
        answerD = "Top Half und Bottom Half sind zwei CPU-Kerne, die Interrupts aus einer gemeinsamen Warteschlange abarbeiten",
        correctAnswer = 0,
        explanation = "Der Interrupt Handler (Top Half) läuft sofort, mit Interrupts gesperrt – nur das Nötigste: Gerät bestätigen, Daten sichern. Zeitaufwändige Verarbeitung (TCP-Stack, Block-I/O) kommt in den Bottom Half: Softirqs (statisch, höchste Priorität), Tasklets (dynamisch, auf einem Kern serialisiert) oder Workqueues (im Prozesskontext, kann schlafen).",
        difficulty = 5,
        funFact = "NAPI (New API) für Netzwerktreiber kombiniert Interrupts und Polling: Bei hohem Traffic wird auf Polling umgeschaltet (Interrupt-Koalescing), um Interrupt-Storm zu vermeiden – ein klassischer Bottom-Half-Trick."
    ),
    // 19
    Question(
        categoryId = 7,
        questionText = "Welchen Vorteil bieten Huge Pages (2 MB / 1 GB) gegenüber Standard-4-KB-Pages?",
        answerA = "Huge Pages erlauben es, mehr als 4 GB RAM pro Prozess zu adressieren",
        answerB = "Huge Pages reduzieren TLB-Misses, da eine einzelne TLB-Zeile mehr physischen Speicher abdeckt; der Page-Table-Walk entfällt häufiger",
        answerC = "Huge Pages eliminieren Fragmentierung, da sie niemals aufgeteilt werden können",
        answerD = "Huge Pages deaktivieren ASLR automatisch für besonders kritische Speicherbereiche",
        correctAnswer = 1,
        explanation = "Der TLB hat eine begrenzte Anzahl von Einträgen. Mit 4-KB-Pages deckt ein Eintrag 4 KB ab; mit 2-MB-Huge-Pages 512× mehr. Für große Puffer (Datenbanken, HPC) reduziert das TLB-Miss-Rate drastisch. Linux unterstützt Transparent Huge Pages (THP) und explizite HugeTLBfs-Allokationen.",
        difficulty = 5,
        funFact = "Oracle DB, Redis und PostgreSQL empfehlen explizite Huge Pages. Google berichtet, dass THP bei bestimmten Java-Workloads 10-30% Leistungsgewinn bringt – durch weniger Page-Table-Walks in heißen Schleifen."
    ),
    // 20
    Question(
        categoryId = 7,
        questionText = "Was ist eBPF und welche Sicherheitsgarantien bietet der Kernel-Verifier?",
        answerA = "eBPF ist ein Kernel-Modul-Framework; der Verifier prüft nur Signaturen der Module",
        answerB = "eBPF-Programme werden in einem separaten Userspace-Prozess ausgeführt und per IPC mit dem Kernel kommuniziert",
        answerC = "eBPF ersetzt Kernel-Treiber vollständig; der Verifier führt formale Proofs für alle Kernel-ABI-Aufrufe durch",
        answerD = "eBPF sind kleine, vom Benutzer geschriebene Programme, die im Kernel-Kontext laufen; der Verifier prüft Terminierung, sichere Speicherzugriffe und keine privilegierten Kernel-Funktionen ohne Helper",
        correctAnswer = 3,
        explanation = "Extended BPF (eBPF) erlaubt sichere Kernel-Programmierung ohne Kernel-Module. Der Verifier führt statische Analyse durch: alle Pfade werden exploriert, Schleifengrenzen müssen beweisbar sein, Zeiger-Arithmetik wird getracked, und nur whitelisted Kernel-Helpers dürfen aufgerufen werden. Bei Fehler wird das Programm abgelehnt.",
        difficulty = 5,
        funFact = "Cloudflare, Netflix, Facebook (Meta) und Google nutzen eBPF massiv: für DDoS-Mitigation (XDP), Netzwerkpolicies (Cilium), Observability (bpftrace) und sogar Container-Networking (statt iptables). eBPF wird als 'JavaScript des Kernels' bezeichnet."
    ),
    // 21
    Question(
        categoryId = 7,
        questionText = "Wie isoliert Linux-Container-Technologie Prozesse mit Namespaces?",
        answerA = "Linux Namespaces (PID, Net, Mount, UTS, IPC, User, Cgroup, Time) geben jedem Prozess eine eigene Sicht auf Kernel-Ressourcen, ohne echte Isolation auf Hardware-Ebene",
        answerB = "Namespaces erstellen virtuelle Maschinen für jeden Container mit separatem Kernel-Image",
        answerC = "Namespaces verwenden Hardware-Virtualisierung (VT-x) um Prozesse zu isolieren",
        answerD = "Namespaces sind ausschließlich für Netzwerk-Isolation; Prozess-Isolation erfolgt über Cgroups",
        correctAnswer = 0,
        explanation = "Jeder Namespace-Typ isoliert einen anderen Aspekt: PID-Namespace (eigene Prozess-IDs), Net-Namespace (eigene Netzwerk-Interfaces), Mount-Namespace (eigene Dateisystemsicht), UTS (eigener Hostname), User-Namespace (eigene UID/GID-Mappings). Container (Docker, Podman) kombinieren alle Namespaces. Kein separater Kernel – derselbe Kernel-Aufruf wird für alle verwendet.",
        difficulty = 5,
        funFact = "User-Namespaces (seit Linux 3.8) sind besonders mächtig: Sie erlauben rootlose Container, wo ein normaler Benutzer im Namespace als UID 0 erscheint, aber für den Host-Kernel normale Benutzerrechte hat."
    ),
    // 22
    Question(
        categoryId = 7,
        questionText = "Welche Funktion haben Cgroups (Control Groups) in der Linux-Container-Technologie?",
        answerA = "Cgroups isolieren Namespaces und verhindern Seitenkanalangriffe zwischen Prozessen",
        answerB = "Cgroups begrenzen und messen Ressourcennutzung (CPU, Speicher, I/O, Netzwerk) für Prozessgruppen und ermöglichen so Resource-Accounting und -Throttling",
        answerC = "Cgroups implementieren Copy-on-Write für Prozess-Forks und optimieren den Fork-Overhead",
        answerD = "Cgroups sind der Kernel-Mechanismus hinter dem Linux-Scheduling-Algorithmus CFS",
        correctAnswer = 1,
        explanation = "Control Groups (Paul Menage & Rohit Seth, 2008) organisieren Prozesse in Hierarchien. Jedes Cgroup-Subsystem (cpu, memory, blkio, net_cls) implementiert ein anderes Ressourcen-Limit. Memory-Cgroups können OOM-Killer pro Container auslösen. Cgroups v2 (unified hierarchy) ist seit Linux 4.5 der bevorzugte Ansatz.",
        difficulty = 5,
        funFact = "Kubernetes nutzt Cgroups v2 direkt: Jeder Pod bekommt ein eigenes Cgroup-Slice. Der kubelet konfiguriert CPU-Limits als cpu.max und Speicher als memory.max – direkt in cgroupfs geschrieben."
    ),
    // 23
    Question(
        categoryId = 7,
        questionText = "Was ist seccomp-BPF und wie verhindert es Exploits im Container-Kontext?",
        answerA = "seccomp-BPF filtert Syscalls über BPF-Programme: Jeder Syscall wird gegen ein Whitelist/Blacklist-Programm geprüft; nicht erlaubte Syscalls werden blockiert, bevor sie den Kernel erreichen",
        answerB = "seccomp-BPF ist eine User-Space-Bibliothek, die Syscalls durch sichere Alternativen ersetzt",
        answerC = "seccomp-BPF kompiliert Kernel-Module in BPF-Bytecode für sicherere Ausführung",
        answerD = "seccomp-BPF ist ein Hardware-Feature (ARM TrustZone) und nicht in Software implementiert",
        correctAnswer = 0,
        explanation = "Secure Computing Mode mit BPF (seccomp-BPF, seit Linux 3.5) erlaubt die Erstellung von Syscall-Filtern als BPF-Programme. Docker verwendet standardmäßig ein seccomp-Profil, das ~44 gefährliche Syscalls blockiert (z.B. ptrace, mount, kexec_load). Falls ein Angreifer Code ausführt, kann er keinen Kernel-Exploit durch gefilterte Syscalls einleiten.",
        difficulty = 5,
        funFact = "Chrome/Chromium nutzt seccomp-BPF im Renderer-Prozess seit 2012 – lange vor Docker-Containern. Jeder Tab läuft in einem Prozess mit minimalem Syscall-Set, was den Browser-Exploit-Impact drastisch reduziert."
    ),
    // 24
    Question(
        categoryId = 7,
        questionText = "Was ist das Buddy-System als Speicherallokations-Algorithmus?",
        answerA = "Zwei Allokations-Threads ('Buddies') teilen sich einen Heap und alternieren bei Anfragen",
        answerB = "Das Buddy-System teilt den Heap in vier gleiche Quadranten und weist jeder Anwendung einen zu",
        answerC = "Speicherblöcke werden immer in Zweierpotenzen verwaltet; ein Block der Größe 2^k hat einen 'Buddy', mit dem er bei Freigabe zusammengeführt wird",
        answerD = "Buddies sind Kernel-Threads, die asynchron defragmentieren und freie Blöcke zusammenführen",
        correctAnswer = 2,
        explanation = "Das Buddy-System (Knuth) verwaltet Frei-Listen für Blöcke der Größe 2^0, 2^1, …, 2^k. Anforderung für n Bytes wird auf die nächste Zweierpotenz aufgerundet. Beim Freigeben wird der Buddy-Block gesucht (XOR der Adresse mit Blockgröße): Wenn beide frei sind, werden sie zu einem doppelt so großen Block zusammengeführt.",
        difficulty = 5,
        funFact = "Der Linux-Kernel verwendet das Buddy-System als Page-Frame-Allokator. Das /proc/buddyinfo-Interface zeigt die aktuellen Frei-Listen für jede Speicherzone und NUMA-Node – ein direktes Fenster in den physischen Speicher-Allokator."
    ),
    // 25
    Question(
        categoryId = 7,
        questionText = "Was ist das Kernprinzip von jemalloc im Vergleich zu ptmalloc (glibc malloc)?",
        answerA = "jemalloc verwendet ausschließlich mmap für alle Allokationen; ptmalloc nutzt nur brk()",
        answerB = "jemalloc ist ein Garbage Collector; ptmalloc ist ein expliziter Allokator",
        answerC = "jemalloc verwendet granulare Size-Classes mit Per-Thread-Caches und Arena-basierter Struktur, um Lock-Contention bei Multi-Threading drastisch zu reduzieren",
        answerD = "jemalloc ist speziell für 32-Bit-Systeme optimiert und unterstützt kein 64-Bit",
        correctAnswer = 2,
        explanation = "jemalloc (Jason Evans, für FreeBSD und Firefox entwickelt) adressiert Multi-Threading durch Arenas (Pools), die unabhängig von Threads sind, und Thread-lokale Caches (tcache). Size-Classes (4B bis 32KB in präzisen Schritten) minimieren Fragmentierung. Verwendet von Firefox, Facebook (rocksdb), Redis.",
        difficulty = 5,
        funFact = "Facebook (Meta) entwickelte jemalloc weiter und veröffentlichte Erkenntnisse: In Server-Workloads mit hoher Thread-Anzahl reduziert jemalloc die malloc-Latenz um bis zu 3× gegenüber glibc ptmalloc, hauptsächlich durch eliminierte Lock-Contention."
    ),
    // 26
    Question(
        categoryId = 7,
        questionText = "Was ist Model Checking und wie unterscheidet es sich von Theorem Proving?",
        answerA = "Model Checking beweist Korrektheit durch manuelle mathematische Beweise; Theorem Proving ist vollautomatisch",
        answerB = "Model Checking exploriert exhaustiv einen endlichen Zustandsraum und prüft Eigenschaften automatisch; Theorem Proving verwendet logische Deduktion und ist nicht auf endliche Modelle beschränkt",
        answerC = "Model Checking erfordert Quellcode; Theorem Proving arbeitet nur auf Bytecode",
        answerD = "Beide sind identisch, aber Model Checking wird für Hardware und Theorem Proving für Software verwendet",
        correctAnswer = 1,
        explanation = "Model Checking (Clarke, Emerson, Sifakis – Turing Award 2007) prüft ein endliches Modell eines Systems gegen temporale Logik-Formeln (CTL, LTL) automatisch. Vorteil: vollautomatisch, liefert Gegenbeispiele. Nachteil: State-Space-Explosion. Theorem Proving (Coq, Isabelle) ist mächtiger (unbeschränkte Modelle) aber erfordert Nutzerführung.",
        difficulty = 5,
        funFact = "Amazon AWS verwendet TLA+ (eine Model-Checking-Sprache) seit 2011 intern für Protokoll-Verifikation. Gefundene Bugs in DynamoDB und S3: 7 kritische Fehler, die Tests nie gefunden hätten."
    ),
    // 27
    Question(
        categoryId = 7,
        questionText = "Was beschreibt Abstract Interpretation in der statischen Programmanalyse?",
        answerA = "Eine Technik, die ausführbaren Code durch abstrakten Pseudocode ersetzt für bessere Lesbarkeit",
        answerB = "Eine Laufzeit-Technik, die Variablenwerte durch symbolische Namen ersetzt um Debugging zu vereinfachen",
        answerC = "Abstract Interpretation übersetzt Programme in abstrakten Maschinencode ohne Optimierungen",
        answerD = "Ein Framework (Cousot & Cousot 1977), das Programmverhalten auf einem abstrakten Wertebereich überapproximiert; der Fixpunkt der Analyse liefert konservative Sicherheitseigenschaften",
        correctAnswer = 3,
        explanation = "Abstract Interpretation (Cousot & Cousot) ersetzt konkrete Werte durch abstrakte (z.B. Intervalle statt Integers). Die Analyse berechnet einen Fixpunkt über den Kontrollfluss-Graphen. Das Ergebnis ist eine Überapproximation: Wenn die Analyse 'sicher' sagt, gibt es keinen Bug. Falsch-Positive sind möglich, aber keine Falsch-Negative.",
        difficulty = 5,
        funFact = "Astrée (Astree Analyzer) verifizierte den Primär-Flugcode des Airbus A380 auf Abwesenheit von Laufzeitfehlern – ohne einen einzigen False Negative. Das System hat ~130.000 Zeilen C und wurde in Stunden analysiert."
    ),
    // 28
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen Earliest Deadline First (EDF) und Rate Monotonic Scheduling (RMS)?",
        answerA = "EDF ist statisch (Prioritäten fest), RMS ist dynamisch (Prioritäten ändern sich zur Laufzeit)",
        answerB = "EDF ist nur für aperiodische Tasks; RMS nur für periodische Tasks",
        answerC = "EDF ist optimal für preemptive single-processor Echtzeitsysteme und kann bis 100% CPU-Auslastung nutzen; RMS ist statisch-prioritätsbasiert und optimal in seiner Klasse, aber auf ~69% Auslastung begrenzt",
        answerD = "EDF benötigt Hardware-Timer-Unterstützung; RMS ist rein software-basiert",
        correctAnswer = 2,
        explanation = "EDF vergibt immer die höchste Priorität an den Task mit der nächsten absoluten Deadline. Unter EDF kann ein System mit Auslastung bis 100% garantiert einplanbar sein (wenn Σ Ci/Ti ≤ 1). RMS (statische Prioritäten, kürzere Periode = höhere Priorität) ist optimal unter statischen Verfahren, aber die Auslastungsschranke ist ≤ ln(2) ≈ 69,3%.",
        difficulty = 5,
        funFact = "Obwohl EDF theoretisch überlegen ist, verwenden die meisten RTOS (VxWorks, FreeRTOS) statische Prioritäten (ähnlich RMS): EDF-Implementierungen sind komplexer und haben Overhead durch dynamische Prioritätsänderungen bei jedem Task-Release."
    ),
    // 29
    Question(
        categoryId = 7,
        questionText = "Was ist das Write-Ahead Logging (WAL) in Dateisystemen und Datenbanken?",
        answerA = "WAL schreibt Daten zuerst in einen Userspace-Buffer und dann lazily auf Disk",
        answerB = "Vor jeder Datenmutation wird zuerst ein Log-Eintrag (Redo/Undo) in ein sequentielles Journal geschrieben; bei Absturz kann der Log replayed werden um Konsistenz wiederherzustellen",
        answerC = "WAL ist ein Hardware-Feature von NVMe-SSDs für atomare Schreibvorgänge",
        answerD = "WAL kopiert alle Daten vor jeder Änderung in ein Backup-Verzeichnis",
        correctAnswer = 1,
        explanation = "WAL (Mohan et al., ARIES 1992) garantiert Atomizität und Durability. Jede Änderung wird zuerst als Log-Record (mit LSN: Log Sequence Number) ins sequentielle Journal geschrieben ('Write-Ahead'), dann erst auf Datenseiten. Bei Crash: REDO (uncommitted wiederholen) und UNDO (committed nicht angewandtes rückgängig machen).",
        difficulty = 5,
        funFact = "PostgreSQL's WAL ist so effizient, dass es als Replikations-Stream für Hot Standby verwendet wird. Physical replication streamt den WAL-Bytestrom direkt zum Replica – ohne Overhead für logische Decode. Logical Replication dekodiert WAL-Records zu Änderungen auf Tabellenebene."
    ),
    // 30
    Question(
        categoryId = 7,
        questionText = "Was ist Dead Code Elimination (DCE) als Compiler-Optimierung und warum ist SSA dafür wichtig?",
        answerA = "DCE entfernt Kommentare und Leerzeichen aus dem Quellcode",
        answerB = "DCE erkennt unerreichbare Funktionen durch Call-Graph-Analyse und entfernt sie aus dem Binary",
        answerC = "DCE ist identisch mit Constant Folding und wird immer zusammen angewendet",
        answerD = "DCE entfernt Berechnungen, deren Ergebnis nie verwendet wird; in SSA ist eine Definition tot, wenn sie keine Uses hat – dies ist trivial prüfbar ohne Datenflussanalyse",
        correctAnswer = 3,
        explanation = "In SSA-Form hat jede Variable genau eine Definition. Wenn diese Definition keine Use-Kanten hat, ist sie tot und kann entfernt werden. Das ist O(n) über alle Definitionen. In nicht-SSA muss man Liveness-Analyse über den ganzen Kontrollfluss-Graphen iterativ berechnen – deutlich aufwändiger.",
        difficulty = 5,
        funFact = "Aggressives DCE in modernen Compilern (LLVM -O2) kann bis zu 30% des generierten Codes eliminieren – besonders in Template-schwerem C++ oder bei großen Inline-Bäumen, wo viele Berechnungen nach dem Inlining unreferenziert werden."
    ),
    // 31
    Question(
        categoryId = 7,
        questionText = "Was beschreibt das Journaling in ext4 und welche drei Journaling-Modi gibt es?",
        answerA = "Ext4-Journaling schreibt immer vollständige Datei-Snapshots; die drei Modi sind Fast, Slow und Safe",
        answerB = "Die drei Journaling-Modi sind REDO, UNDO und REDO+UNDO für verschiedene Crash-Szenarien",
        answerC = "Ext4 hat kein Journaling; es verwendet Copy-on-Write wie Btrfs",
        answerD = "Ext4-Journal protokolliert Metadaten-Änderungen; die Modi sind: journal (Daten+Metadaten), ordered (Metadaten-Journal, Daten-Reihenfolge garantiert) und writeback (nur Metadaten, ohne Reihenfolge-Garantie)",
        correctAnswer = 3,
        explanation = "Ext4 (und ext3) journal in drei Modi: 'journal' = alles wird journaled (langsam, sicher). 'ordered' (Standard) = nur Metadaten journaled, aber Daten müssen vor dem Metadaten-Commit auf Disk sein (sicher für Datenintegrität). 'writeback' = nur Metadaten journaled, Daten-Reihenfolge unkontrolliert (schnell, aber Daten-Corruption nach Crash möglich).",
        difficulty = 5,
        funFact = "Btrfs und ZFS brauchen kein separates Journal, weil CoW inherent atomisch ist. Aber ext4 im ordered-Modus ist für viele Workloads immer noch schneller – weil CoW bei großen Writes höhere Write-Amplification hat."
    ),
    // 32
    Question(
        categoryId = 7,
        questionText = "Was ist der Page-Table-Walk auf x86-64 mit 4-Level-Paging?",
        answerA = "Eine Hardware-Routine, die über vier Indirektionsstufen (PGD→PUD→PMD→PTE) eine virtuelle Adresse in eine physische Adresse übersetzt",
        answerB = "Ein Betriebssystem-Algorithmus, der alle Page-Tables sequentiell nach einer physischen Adresse durchsucht",
        answerC = "Ein Kernel-Thread, der kontinuierlich Page-Tables defragmentiert und konsolidiert",
        answerD = "Die Traversal-Reihenfolge des Garbage Collectors bei Objektgraphen in heap-allokierten Programmen",
        correctAnswer = 0,
        explanation = "x86-64 4-Level-Paging: CR3 zeigt auf PGD (Page Global Directory). Bits 47-39 der virtuellen Adresse indexieren PGD, 38-30 indexieren PUD, 29-21 indexieren PMD, 20-12 indexieren PT (Page Table), 11-0 sind der Page-Offset. Jede Stufe ist ein 4-KB-Frame mit 512 8-Byte-Einträgen. Ohne TLB-Hit: 4 Speicherzugriffe.",
        difficulty = 5,
        funFact = "Intel Icelake und AMD Zen 2+ unterstützen 5-Level-Paging (LA57): Eine fünfte Stufe (P5D) wurde hinzugefügt, um den virtuellen Adressraum von 256 TB auf 128 PB zu erweitern. Linux aktiviert es mit 'la57' Boot-Parameter."
    ),
    // 33
    Question(
        categoryId = 7,
        questionText = "Was ist Hindley-Milner-Typinferenz und welches Problem löst sie bei parametrischem Polymorphismus?",
        answerA = "HM-Typinferenz löst das Halteproblem für typbare Terme durch vollständige Programmverifikation",
        answerB = "HM-Typinferenz ist ausschließlich für monomorphe Sprachen wie C entwickelt worden",
        answerC = "HM-Typinferenz annotiert Typen zur Laufzeit durch JIT-Analyse und ist deshalb nicht statisch",
        answerD = "HM-Typinferenz findet automatisch den allgemeinsten Typ (principal type) für Terme im Typsystem; Programme müssen nicht annotiert werden, und Polymorphismus wird durch Quantifizierung über Typvariablen ausgedrückt",
        correctAnswer = 3,
        explanation = "Hindley (1969) und Milner (1978) entwickelten unabhängig voneinander ein Typinferenzsystem für den Lambda-Kalkül mit let-Polymorphismus (System F⁻). Der Algorithmus W findet durch Unifikation den most general type ohne explizite Annotationen. Haskell, OCaml und ML basieren darauf.",
        difficulty = 5,
        funFact = "Das vollständige System F (mit expliziten Typ-Abstraktionen) hat unentscheidbare Typinferenz. Hindley-Milner ist eine eingeschränkte, aber praktisch sehr nützliche Teilmenge, die vollständige Inferenz garantiert – das ist der Grund, warum ML-Sprachen keine Typannotationen für einfachen Code brauchen."
    ),
    // 34
    Question(
        categoryId = 7,
        questionText = "Welche Aussage über Generational Garbage Collection ist korrekt?",
        answerA = "Generational GC sortiert Objekte nach ihrer Größe, nicht nach ihrer Lebensdauer",
        answerB = "Generational GC basiert auf der 'Weak Generational Hypothesis': Die meisten Objekte sterben jung; deshalb wird die junge Generation häufig und günstig gesammelt, die alte Generation selten",
        answerC = "Generational GC eliminiert GC-Pausen vollständig durch Concurrent Marking",
        answerD = "Generational GC verwendet für jede Generation eine eigene Programmiersprache-Laufzeit",
        correctAnswer = 1,
        explanation = "Die empirische Schwache Generationen-Hypothese (Wilson 1992) zeigt: In den meisten Programmen ist der Großteil der allokierten Objekte kurzlebig. Deshalb ist es sinnvoll, junge Objekte in einem kleinen 'Nursery' zu allokieren (schnell) und nur Überlebende zu befördern. Die alte Generation wächst langsam und wird seltener gesammelt (Major GC).",
        difficulty = 5,
        funFact = "G1 GC (Java) unterteilt den Heap in Regionen statt in feste Generationsgrenzen. Das erlaubt inkrementelle Mixed Collections: Teile der alten Generation können zusammen mit der jungen Generation gesammelt werden, was die Max-Pause reduziert."
    ),
    // 35
    Question(
        categoryId = 7,
        questionText = "Was ist die Procedure Linkage Table (PLT) und wie funktioniert Lazy Binding?",
        answerA = "Die PLT ist eine Tabelle mit Rücksprungadressen für alle Funktionsaufrufe in einem Programm",
        answerB = "PLT und GOT sind identisch; PLT ist der ältere Name für dasselbe Konzept",
        answerC = "Die PLT enthält Stubs für externe Funktionen; beim ersten Aufruf springt der Stub in den dynamischen Linker, der die GOT-Eintrags-Adresse auflöst – alle folgenden Aufrufe gehen direkt über GOT",
        answerD = "Die PLT ist ausschließlich für C++-virtuelle Funktionen und enthält vtable-Einträge",
        correctAnswer = 2,
        explanation = "Lazy Binding: Beim ersten Aufruf von printf() springt der PLT-Stub nicht direkt zu printf, sondern zum Resolver im dynamischen Linker (ld.so). Dieser löst die Adresse auf und schreibt sie in die GOT. Ab dem zweiten Aufruf: PLT-Stub liest direkt die (jetzt gefüllte) GOT-Adresse und springt sofort zu printf. Overhead nur beim ersten Aufruf.",
        difficulty = 5,
        funFact = "RELRO (Relocation Read-Only) macht die GOT nach dem Linker-Lauf read-only – verhindert GOT-Overwrites als Exploit-Technik. Full RELRO deaktiviert Lazy Binding und löst alle Symbole beim Programmstart auf."
    ),
    // 36
    Question(
        categoryId = 7,
        questionText = "Was ist Hoare-Logik und was bedeutet das Hoare-Tripel {P} C {Q}?",
        answerA = "Hoare-Logik ist ein Laufzeit-Monitoring-System; {P} C {Q} bedeutet 'C wird zwischen P und Q ausgeführt'",
        answerB = "Ein formales System zur Verifikation von Programmen: {P} C {Q} bedeutet 'Wenn P vor Ausführung von C gilt und C terminiert, dann gilt Q danach' (partielle Korrektheit)",
        answerC = "Hoare-Logik beweist Terminierung; das Tripel bedeutet 'C terminiert in Zeit proportional P mit Ergebnis Q'",
        answerD = "Das Tripel ist eine Typ-Signatur: P ist der Parametertyp, C die Funktion, Q der Rückgabetyp",
        correctAnswer = 1,
        explanation = "C.A.R. Hoare (1969) entwickelte ein axiomatisches System für Programmverifikation. {P} C {Q} (partielle Korrektheit): Wenn P gilt und C läuft und terminiert, dann gilt Q. Totale Korrektheit fügt Terminierungsgarantie hinzu. Die Konsequenzregel erlaubt Vor-/Nachbedingungen zu stärken/schwächen.",
        difficulty = 5,
        funFact = "Hoare's Paper 'An Axiomatic Basis for Computer Programming' (1969) ist eines der meistzitierten Informatik-Papiere aller Zeiten. Es legte den Grundstein für Programmverifikation, Design-by-Contract (Eiffel, SPARK Ada) und moderne Verifikationstools wie Frama-C."
    ),
    // 37
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert der Zwei-Phasen-Commit im Kontext von Kernel-Journaling?",
        answerA = "Phase 1 komprimiert Daten, Phase 2 schreibt sie verschlüsselt auf Disk",
        answerB = "Phase 1 schreibt User-Daten, Phase 2 schreibt Kernel-Metadaten; beide müssen atomar abgeschlossen sein",
        answerC = "Zwei-Phasen-Commit ist ausschließlich ein Netzwerkprotokoll für verteilte Transaktionen",
        answerD = "Phase 1 (Commit): Alle Journal-Records werden in den Log geschrieben und mit Commit-Block abgeschlossen. Phase 2 (Checkpoint): Die tatsächlichen Daten werden auf ihre finalen Disk-Positionen geschrieben",
        correctAnswer = 3,
        explanation = "Im Kernel-Journaling (ext4, XFS): Transaktionen werden im Circular Log gesammelt. Commit-Phase: Alle Dirty Blocks der Transaktion + Commit-Record werden atomar in den Log geschrieben. Checkpoint-Phase: Asynchron werden die Daten an ihre finalen Positionen geschrieben. Bei Crash: Log wird replayed bis zum letzten Commit-Record.",
        difficulty = 5,
        funFact = "XFS verwendet eine Variante namens 'Delayed Logging' (auch 'Log Items In Flight'): Mehrere Transaktionen werden im Speicher gesammelt und in einem einzigen Log-Write gebündelt. Dies reduziert Log-I/O erheblich bei schreibintensiven Workloads."
    ),
    // 38
    Question(
        categoryId = 7,
        questionText = "Was ist ASLR (Address Space Layout Randomization) und welche Grenzen hat es auf 32-Bit-Systemen?",
        answerA = "ASLR randomisiert die Ladeadressen von Stack, Heap und Libraries; auf 32-Bit ist der Adressraum nur 4 GB groß, was nur ~16 Bits Entropie für Basis-Adressen lässt – durch Brute-Force in Sekunden überwindbar",
        answerB = "ASLR verschlüsselt alle Speicheradressen mit einem Schlüssel, der bei jedem Boot gewechselt wird",
        answerC = "ASLR ist auf 32-Bit-Systemen identisch effektiv wie auf 64-Bit-Systemen",
        answerD = "ASLR deaktiviert Position-Independent-Executables (PIE) auf 32-Bit-Systemen automatisch",
        correctAnswer = 0,
        explanation = "Auf x86-64 hat ASLR ~28-40 Bits Entropie für mmap-Basis (je nach Kernel-Konfiguration), was Brute-Force unpraktisch macht. Auf x86-32 sind durch Page-Alignment und Adressraumgrenzen nur ~8-16 Bits Entropie verfügbar. Ein lokaler Exploit kann die Bibliotheks-Basis in ~65536 Versuchen erraten – in Sekunden möglich.",
        difficulty = 5,
        funFact = "Information-Leak-Exploits (z.B. format string bugs, heap spraying) umgehen ASLR auch auf 64-Bit: Ein einzelnes Leck der Stack-Adresse oder einer Library-Adresse hebt ASLR vollständig auf – weshalb ASLR+PIE immer mit Stack Canaries und Control Flow Integrity kombiniert werden sollte."
    ),
    // 39
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem monolithischen Kernel und einem Microkernel bei Gerätetreibern?",
        answerA = "Monolithische Kernel haben keine Gerätetreiber; Microkernels implementieren alle Treiber in Hardware",
        answerB = "Beide Architekturen führen Treiber im User-Space aus; der Unterschied liegt ausschließlich im Scheduling",
        answerC = "Monolithische Kernel führen Treiber im Kernel-Space (Ring 0) aus; ein fehlerhafter Treiber kann das System zum Absturz bringen. Microkernels führen Treiber als User-Space-Prozesse aus, was Isolation durch IPC bietet, aber IPC-Overhead verursacht",
        answerD = "Microkernels haben keine Treiber; Applikationen kommunizieren direkt mit Hardware-Registern",
        correctAnswer = 2,
        explanation = "In monolithischen Kerneln (Linux, Windows NT) läuft Treiber-Code im privilegierten Kernel-Mode. Ein NULL-Pointer-Dereference in einem Treiber = Kernel Panic (Blue Screen). Microkernels (Mach, L4, seL4) isolieren Treiber in User-Space-Server. IPC zwischen Applikation→Treiber→Kernel ist teurer, aber ein abstürzender Treiber kann neu gestartet werden.",
        difficulty = 5,
        funFact = "QNX (Neutrino RTOS), ein Microkernel-System, wird in Autos (Blackberry QNX Cabin), Medizingeräten und der Space Station Software verwendet. Abstürzende Treiber können transparent neu gestartet werden – kritisch für Safety-Systeme."
    ),
    // 40
    Question(
        categoryId = 7,
        questionText = "Was ist tcmalloc und welchen Kern-Mechanismus verwendet es für schnelle Allokation?",
        answerA = "tcmalloc (Thread-Caching Malloc) hält pro Thread einen Cache für kleine Objekte (< 256 KB); Thread-lokale Allokationen sind lock-frei – nur beim Auffüllen des Thread-Caches wird ein zentraler Lock benötigt",
        answerB = "tcmalloc komprimiert Speicher kontinuierlich im Hintergrund durch einen dedizierten Compactor-Thread",
        answerC = "tcmalloc verwendet Hardware-Transaktional Memory (TSX) für atomare Allokationen ohne Locks",
        answerD = "tcmalloc ist ausschließlich für Go's Laufzeit entwickelt und nicht für C/C++ geeignet",
        correctAnswer = 0,
        explanation = "tcmalloc (Google, Teil von gperftools) hat drei Schichten: Thread-Cache (lock-frei, pro Thread), Central Free List (kurzer Lock) und Page Heap (mmap-basiert). Für Objekte < 256 KB ist die Thread-Cache-Allokation O(1) und komplett lock-frei. Go's runtime malloc ist direkt von tcmalloc abgeleitet.",
        difficulty = 5,
        funFact = "Google's interne Benchmarks zeigen, dass tcmalloc bei hochnebenläufigen Server-Workloads (z.B. gRPC-Server mit 1000 Threads) ptmalloc um bis zu 5× schlägt. Der Schlüsseltrick ist, dass 95% aller malloc-Aufrufe aus dem Thread-Cache kommen und keine Synchronisation benötigen."
    ),
    // 41
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen Soft-IRQs und Tasklets im Linux-Kernel?",
        answerA = "Soft-IRQs laufen in privilegiertem Kernel-Space; Tasklets laufen in User-Space mit niedrigerer Priorität",
        answerB = "Soft-IRQs sind statisch zur Compile-Zeit definiert und können parallel auf mehreren CPUs laufen; Tasklets sind dynamisch alloziert und werden auf einem CPU zu einem Zeitpunkt serialisiert",
        answerC = "Soft-IRQs werden durch Hardware ausgelöst; Tasklets sind reine Software-Interrupts ohne Hardware-Bezug",
        answerD = "Beide sind identisch; Tasklets sind nur der neuere Name für Soft-IRQs seit Kernel 4.0",
        correctAnswer = 1,
        explanation = "Es gibt nur ~10 Soft-IRQ-Typen (NET_TX, NET_RX, TIMER, BLOCK, etc.) – statisch im Kernel. Soft-IRQs können gleichzeitig auf verschiedenen CPUs laufen (kein implizites Lock!). Tasklets bauen auf TASKLET_SOFTIRQ auf: Ein Tasklet läuft nie gleichzeitig auf zwei CPUs (einfacheres Locking), aber das schränkt Parallelität ein.",
        difficulty = 5,
        funFact = "Der Linux-Kernel-Mainliner Thomas Gleixner hat mehrfach vorgeschlagen, Tasklets zu entfernen und durch Workqueues zu ersetzen – wegen der impliziten Serialisierung, die bei hohem Netzwerk-Throughput zum Flaschenhals wird."
    ),
    // 42
    Question(
        categoryId = 7,
        questionText = "Was beschreibt der Lattice-Begriff in der Abstract-Interpretation-Theorie?",
        answerA = "Ein Lattice ist eine Datenstruktur ähnlich einem Baum, die für Cache-Optimierungen in Compilern verwendet wird",
        answerB = "Lattice ist der Fachbegriff für den Call-Graph in einem Compiler",
        answerC = "Ein vollständiges Lattice ist eine teilgeordnete Menge mit Supremum (⊔) und Infimum (⊓) für jede Teilmenge; Abstract Domains sind Lattices, die Mengen konkreter Werte durch abstrakte Elemente überappromimieren",
        answerD = "Ein Lattice in der statischen Analyse ist eine Liste von zulässigen Wertebereichen für Typvariablen",
        correctAnswer = 2,
        explanation = "Abstract Interpretation verwendet vollständige Lattices als Abstract Domains (z.B. Sign-Domain: {⊥, Neg, Zero, Pos, ⊤}). Die Monotonie der Transferfunktionen garantiert Fixpunkt-Konvergenz (Kleene's Fixed Point Theorem). ⊤ (Top) = keine Information, ⊥ (Bottom) = unerreichbar. Join (⊔) fasst Pfade zusammen.",
        difficulty = 5,
        funFact = "Das Interval-Domain (Lattice aller Integer-Intervalle [a,b]) ist eine der praktisch nützlichsten Abstract Domains. Astrée verwendet eine angepasste Version mit Widening-Operatoren, um Fixpunkt-Berechnung für Schleifen zu beschleunigen."
    ),
    // 43
    Question(
        categoryId = 7,
        questionText = "Was ist Constant Propagation mit SSA und wie unterscheidet es sich von Constant Folding?",
        answerA = "Constant Propagation und Constant Folding sind identische Optimierungen mit verschiedenen Namen",
        answerB = "Constant Propagation gilt für globale Variablen; Constant Folding für lokale Variablen",
        answerC = "Constant Folding ist eine Laufzeit-JIT-Optimierung; Constant Propagation ist ausschließlich statisch",
        answerD = "Constant Propagation ersetzt Variablen-Uses durch ihren bekannten konstanten Wert (Datenfluss); Constant Folding berechnet Ausdrücke mit konstanten Operanden zur Compile-Zeit. Beide zusammen werden als SCCP kombiniert",
        correctAnswer = 3,
        explanation = "Constant Propagation: Wenn x = 5 definiert wird und x danach in Ausdrücken verwendet wird, ersetzt man x durch 5. Constant Folding: 5 + 3 → 8 zur Compile-Zeit. SCCP (Wegman & Zadeck 1991) kombiniert beides in einer SSA-basierten Analyse und schließt auch unreachable branches aus (conditional constant propagation). Sehr leistungsfähig zusammen.",
        difficulty = 5,
        funFact = "SCCP kann komplette Template-Instanziierungen in C++ eliminieren: Wenn ein Template-Parameter eine bekannte Compile-Zeit-Konstante ist, propagiert SCCP diesen Wert durch alle Inline-Expansionen und eliminiert dann toten Code – ähnlich wie C++17 if constexpr, aber automatisch."
    ),
    // 44
    Question(
        categoryId = 7,
        questionText = "Was ist ein Cgroup-Freeze und wann wird er im Container-Management eingesetzt?",
        answerA = "Cgroup-Freeze löscht alle Prozesse in einer Cgroup permanent",
        answerB = "Cgroup-Freeze pausiert alle Prozesse in einer Cgroup atomar (kein CPU-Time, keine Systemaufrufe); verwendet für Live-Migration, Checkpoint/Restore (CRIU) und sicheres Ressourcen-Accounting",
        answerC = "Cgroup-Freeze ist ein Sicherheitsfeature, das Prozesse einfriert wenn sie Speicherlimits überschreiten",
        answerD = "Freeze ist ein Docker-Kommando, das den Container-State in eine Datei serialisiert ohne Kernel-Support",
        correctAnswer = 1,
        explanation = "Der Cgroup Freezer (cgroup.freeze in v2) suspendiert alle Tasks in einer Cgroup – sie bekommen keine CPU-Zeit und dürfen keine Syscalls beenden. Dies ist die Basis für CRIU (Checkpoint/Restore In Userspace): Den Prozess-State einfrieren, in eine Datei schreiben, dann auf einem anderen Host wiederherstellen. Kubernetes nutzt es für Pod-Migration.",
        difficulty = 5,
        funFact = "CRIU (Checkpoint/Restore In Userspace) kann laufende Container, inkl. TCP-Verbindungen, Memory-Maps und Signalzustand, in Dateien serialisieren. OpenVZ und LXC nutzen es für Live-Migration ohne VM-Overhead – eine Fähigkeit, die klassische Hypervisoren lange exklusiv hatten."
    ),
    // 45
    Question(
        categoryId = 7,
        questionText = "Was ist das Curry-Howard-Isomorphismus und welche Bedeutung hat es für Programmiersprachen?",
        answerA = "Eine mathematische Formel, die beweist dass alle funktionalen Programme äquivalent zu imperativen Programmen sind",
        answerB = "Eine Optimierungstechnik, die Curry-ing und Howard-Normal-Form kombiniert für schnellere Funktionsaufrufe",
        answerC = "Die Korrespondenz zwischen Typen und logischen Propositionen, und zwischen Programmen und Beweisen: Typen sind Aussagen, Programme sind Beweise dieser Aussagen; Typinferenz entspricht Beweissuche",
        answerD = "Ein Algorithmus zur Übersetzung von Haskell-Typen in Assembler-Instruktionen",
        correctAnswer = 2,
        explanation = "Curry-Howard (Curry 1934, Howard 1969) zeigt: Propositionslogik ↔ einfach getypter Lambda-Kalkül (Typen = Formeln, Terme = Beweise, Typisierung = Beweisbarkeit). Prädikatenlogik ↔ abhängige Typen (Coq, Agda, Idris). Ein Programm eines Typs A→B ist ein Beweis, dass aus A die Aussage B folgt.",
        difficulty = 5,
        funFact = "Coq und Agda basieren direkt auf dem Curry-Howard-Isomorphismus: Ein verifiziertes Programm ist buchstäblich ein mathematischer Beweis. CompCert (verifizierter C-Compiler) und seL4 (verifizierter Microkernel) wurden mit diesem Ansatz entwickelt."
    ),
    // 46
    Question(
        categoryId = 7,
        questionText = "Was ist der VDSO (Virtual Dynamic Shared Object) in Linux und warum beschleunigt er Syscalls?",
        answerA = "VDSO ist eine kleine Shared Library, die der Kernel in jeden Prozess mappt; bestimmte Syscalls (gettimeofday, clock_gettime) können ohne Kernel-Mode-Wechsel direkt aus dem VDSO-Code ausgeführt werden",
        answerB = "VDSO ist eine virtuelle Festplatte, die häufig gelesene Systemdateien im RAM cached",
        answerC = "VDSO ist ein virtueller Treiber, der Systemaufrufe durch Shared Memory mit dem Kernel ersetzt",
        answerD = "VDSO ist der Kernel-Teil des dynamischen Linkers ld.so für Security-Checks",
        correctAnswer = 0,
        explanation = "Ein Mode-Switch (User→Kernel) kostet ~100-200 ns (Flush von TLB, Privilege-Level-Wechsel). Für gettimeofday() (oft Tausende Male pro Sekunde aufgerufen) ist das inakzeptabel. VDSO: Der Kernel mappt eine Seite in jeden Prozess, die aktuell gecachte Zeitwerte enthält. gettimeofday() liest direkt aus dieser Seite – kein Syscall, kein Mode-Switch.",
        difficulty = 5,
        funFact = "clock_gettime(CLOCK_REALTIME) via VDSO benötigt ~10 ns auf moderner Hardware statt ~200 ns via echtem Syscall. Google's gRPC-Framework ruft clock_gettime millionenfach pro Sekunde auf – ohne VDSO wäre das ein Flaschenhals."
    ),
    // 47
    Question(
        categoryId = 7,
        questionText = "Was ist ZGC (Z Garbage Collector) und welche Technik verwendet er für Concurrent Relocation?",
        answerA = "ZGC ist ein Stop-the-World Collector, der Z-Order-Kurven für optimale Heap-Organisation nutzt",
        answerB = "ZGC teilt den Heap in Z-förmige Regionen und verwendet NUMA-aware Allokation als einzige Optimierung",
        answerC = "ZGC ist identisch mit Shenandoah, aber von Oracle statt Red Hat entwickelt; beide verwenden Brooks Pointers",
        answerD = "ZGC verwendet Load Barriers mit Colored Pointers (Metadaten in oberen Adressbits): Referenz-Lese-Operationen triggern on-the-fly Remapping und können so Objekte verschieben ohne die Applikation zu stoppen",
        correctAnswer = 3,
        explanation = "ZGC (Oracle, Java 15 GA) verwendet 64-Bit-Pointer mit Metadaten in den oberen Bits: Marked0, Marked1, Remapped (je 1 Bit). Beim Lesen einer Referenz prüft die Load Barrier den Pointer-Zustand und führt ggf. Remapping durch. Dadurch kann ZGC Objekte concurrent verschieben ohne Forwarding Pointers – anders als Shenandoah's Brooks-Pointer-Ansatz.",
        difficulty = 5,
        funFact = "ZGC zielt auf < 1 ms GC-Pausen bei Heaps von 8 MB bis 16 TB. In Benchmarks bei Alibaba mit multi-TB Java-Heaps zeigte ZGC Pausen unter 10 ms – was G1 bei denselben Heapgrößen in Sekunden stoppte."
    ),
    // 48
    Question(
        categoryId = 7,
        questionText = "Was ist Liveness-Analyse in einem Compiler und wozu wird sie bei der Registerallokation verwendet?",
        answerA = "Liveness-Analyse prüft ob ein Programm terminiert und gibt eine obere Laufzeitschranke aus",
        answerB = "Liveness-Analyse bestimmt für jeden Programmpunkt, welche Variablen noch in der Zukunft gelesen werden; zwei gleichzeitig lebendige Variablen interferieren und dürfen nicht dasselbe Register bekommen",
        answerC = "Liveness-Analyse ist eine Laufzeit-Technik für dynamische Typen und hat keinen Bezug zur Registerallokation",
        answerD = "Liveness-Analyse zählt Variablen-Zugriffe und sortiert Variablen nach Zugriffshäufigkeit für Cache-Optimierung",
        correctAnswer = 1,
        explanation = "Liveness ist ein Datenfluss-Problem: rückwärts über den CFG propagiert. Ein Interferenzgraph wird aufgebaut: Kanten zwischen gleichzeitig lebendigen Variablen. Registerallokation = Graph-Färbung mit k Farben (k = Anzahl Register). NP-vollständig im Allgemeinen; Chaitin's Algorithmus (mit Spilling) ist der praktische Standard.",
        difficulty = 5,
        funFact = "LLVM's Registerallokator hat drei Varianten: Fast (lineare Zeit, für -O0), Greedy (beste Ergebnisse, Turbocompilation) und Basic (Referenzimplementierung). Der Greedy-Allokator verwendet Splitting und Eviction, um Spilling zu minimieren – oft 10-20% besserer Code als Basic."
    ),
    // 49
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen physischer und logischer Replikation in PostgreSQL und wie hängt das mit WAL zusammen?",
        answerA = "Physische Replikation überträgt SQL-Statements; logische Replikation überträgt Binär-Blöcke",
        answerB = "Physische Replikation verwendet das Filesystem (rsync); logische Replikation verwendet den Netzwerk-Stack",
        answerC = "Beide sind identisch; 'logisch' und 'physisch' beschreiben nur die Verbindungsart (lokal vs. remote)",
        answerD = "Physische Replikation streamt den rohen WAL-Bytestrom (Block-für-Block identische Kopie); logische Replikation dekodiert WAL in semantische Änderungen (INSERT/UPDATE/DELETE) – erlaubt selektive Replikation und Cross-Version-Replication",
        correctAnswer = 3,
        explanation = "Physische Streaming-Replikation: WAL-Bytes gehen 1:1 zum Standby – der muss exakt gleiche PostgreSQL-Version und Architektur haben. Logische Replikation (pg_logical, pglogical, eingebaut seit PG 10): WAL-Decoder erzeugt Änderungs-Events, die selektiv gefiltert und an Subscriber gesendet werden. Erlaubt Major-Version-Upgrades mit minimaler Downtime.",
        difficulty = 5,
        funFact = "Amazon Aurora verwendet eine eigene Variante physischer Replikation: Nur WAL-Records werden zu Storage-Nodes gesendet (nicht die fertigen Pages). Die Storage-Nodes applizieren den WAL selbst. Das reduziert Netzwerk-Traffic um bis zu 6× – der Hauptgrund für Aurora's Replikationsgeschwindigkeit."
    ),
    // 50
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen Präemptivem und Kooperativem Scheduling im Kernel-Kontext?",
        answerA = "Präemptives Scheduling verwendet Hardware-Timer; kooperatives Scheduling verwendet Software-Signale",
        answerB = "Präemptiv bedeutet, dass alle Prozesse exakt gleiche Zeitscheiben bekommen; kooperativ bedeutet variable Zeitscheiben",
        answerC = "Bei präemptivem Scheduling kann der Kernel einen laufenden Prozess zwangsweise unterbrechen (auch mitten im Kernel-Code in preempt_kernel-fähigen Kerneln); bei kooperativem muss der Prozess aktiv yield() aufrufen",
        answerD = "Kooperatives Scheduling ist ausschließlich für Echtzeitsysteme; präemptives Scheduling für Desktop-Systeme",
        correctAnswer = 2,
        explanation = "Frühe OS (Windows 3.1, Mac OS 9) verwendeten kooperatives Scheduling: Ein hängender Prozess fror das System ein. Modernes Linux ist vollständig präemptiv (CONFIG_PREEMPT): Auch Kernel-Code kann unterbrochen werden (außer in kritischen Abschnitten mit preempt_disable()). Das CONFIG_PREEMPT_RT-Patch macht sogar Interrupts präemptierbar für harte Echtzeit.",
        difficulty = 5,
        funFact = "Linux CONFIG_PREEMPT_RT (Real-Time Patch) wurde nach 20 Jahren Entwicklung in Linux 6.12 (November 2024) in den Mainline-Kernel gemergt. Er macht Linux zu einem echten RTOS: Fast alle Locks werden zu Mutex umgewandelt, Interrupts laufen in Kernel-Threads – maximale Präemptierbarkeit."
    )
)
