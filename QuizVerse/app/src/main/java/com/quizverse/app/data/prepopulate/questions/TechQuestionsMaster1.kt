package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsMaster1(): List<Question> = listOf(
    // 1
    Question(
        categoryId = 7,
        questionText = "Welche Eigenschaft macht ein Berechnungsmodell Turing-vollständig?",
        answerA = "Es muss Hardware-nahe Maschinencode ausführen können",
        answerB = "Es muss bedingte Verzweigungen und unbegrenzte Speicherkapazität simulieren können",
        answerC = "Es muss Parallelverarbeitung unterstützen",
        answerD = "Es muss objektorientierte Konzepte implementieren können",
        correctAnswer = 1,
        explanation = "Turing-Vollständigkeit erfordert bedingte Verzweigungen (if/while) und theoretisch unbegrenzten Speicher. Damit kann jede berechenbare Funktion simuliert werden. Hardware-Nähe, Parallelität oder OOP sind keine Voraussetzungen.",
        difficulty = 5,
        funFact = "Das λ-Kalkül von Alonzo Church ist Turing-vollständig, obwohl es keinerlei Mutable State oder Schleifen kennt — nur reine Funktionen."
    ),
    // 2
    Question(
        categoryId = 7,
        questionText = "Was beweist der Satz von Rice in der Berechenbarkeitstheorie?",
        answerA = "Jedes Halteproblem ist in polynomieller Zeit lösbar",
        answerB = "Alle nicht-trivialen semantischen Eigenschaften von Programmen sind unentscheidbar",
        answerC = "Reguläre Sprachen sind nicht Turing-vollständig",
        answerD = "Kein Algorithmus kann alle syntaktischen Fehler in einem Programm finden",
        correctAnswer = 1,
        explanation = "Rices Theorem besagt: Jede nicht-triviale Eigenschaft der von einem Programm berechneten Funktion (z.B. 'terminiert immer', 'gibt nie 0 zurück') ist unentscheidbar. Das macht statische Analyse grundsätzlich unvollständig.",
        difficulty = 5,
        funFact = "Rices Theorem ist eine direkte Verallgemeinerung des Halteproblems und erklärt, warum Virenscanner und Termination-Checker nie perfekt sein können."
    ),
    // 3
    Question(
        categoryId = 7,
        questionText = "Was ist die Kernaussage des λ-Kalküls bezüglich der Church-Turing-These?",
        answerA = "λ-Kalkül ist mächtiger als Turingmaschinen und kann Hypercomputation ausführen",
        answerB = "λ-Kalkül und Turingmaschinen definieren dieselbe Klasse berechenbarer Funktionen",
        answerC = "λ-Kalkül kann nur primitive rekursive Funktionen berechnen",
        answerD = "λ-Kalkül benötigt Typannotationen um Turing-vollständig zu sein",
        correctAnswer = 1,
        explanation = "Alonzo Church entwickelte das λ-Kalkül unabhängig von Turing. Beide Modelle erwiesen sich als äquivalent: Alles, was eine Turingmaschine berechnet, kann im λ-Kalkül ausgedrückt werden und umgekehrt.",
        difficulty = 5,
        funFact = "Alan Turing und Alonzo Church arbeiteten unabhängig voneinander und veröffentlichten ihre Äquivalenz-Beweise im selben Jahr 1936."
    ),
    // 4
    Question(
        categoryId = 7,
        questionText = "Was beschreibt Beta-Reduktion im untypisierten Lambda-Kalkül?",
        answerA = "Die Umwandlung eines Lambda-Terms in Normalform durch Alpha-Konversion",
        answerB = "Die Ersetzung aller freien Vorkommen einer Variable durch das Argument in einem Funktionsaufruf",
        answerC = "Die Typisierung von freien Variablen in einem Lambda-Term",
        answerD = "Das Entfernen von nicht erreichbaren Lambda-Abstraktionen",
        correctAnswer = 1,
        explanation = "Beta-Reduktion ist die fundamentale Rechenregel: (λx.M) N →β M[x:=N], d.h. der formale Parameter x wird überall in M durch das Argument N ersetzt. Dies ist die einzige 'Rechenanweisung' im reinen λ-Kalkül.",
        difficulty = 5,
        funFact = "Die Frage ob Beta-Reduktion terminiert (d.h. ob eine Normalform existiert) ist unentscheidbar — was direkt mit dem Halteproblem zusammenhängt."
    ),
    // 5
    Question(
        categoryId = 7,
        questionText = "Welche Eigenschaft garantiert das CAP-Theorem einem verteilten System nicht gleichzeitig?",
        answerA = "Consistency, Availability und Partition Tolerance können nicht alle drei gleichzeitig vollständig erfüllt werden",
        answerB = "Concurrency, Atomicity und Persistence schließen sich gegenseitig aus",
        answerC = "Consistency, Atomicity und Performance sind nie gleichzeitig erreichbar",
        answerD = "Caching, Availability und Parallelism bedingen immer Kompromisse",
        correctAnswer = 0,
        explanation = "Brewers CAP-Theorem: Im Falle einer Netzwerkpartitionierung (P) muss ein System entweder Konsistenz (C) oder Verfügbarkeit (A) opfern. Da Partitionen in realen Systemen unvermeidlich sind, wählen Systeme entweder CP (z.B. HBase) oder AP (z.B. Cassandra).",
        difficulty = 5,
        funFact = "Eric Brewer formulierte CAP ursprünglich als Conjecture 2000 auf dem PODC; der formale Beweis folgte 2002 durch Gilbert und Lynch."
    ),
    // 6
    Question(
        categoryId = 7,
        questionText = "Was unterscheidet lineare Konsistenz (Linearizability) von sequentieller Konsistenz?",
        answerA = "Linearizability erlaubt beliebige Umordnung von Operationen, sequentielle Konsistenz nicht",
        answerB = "Linearizability verlangt, dass jede Operation scheinbar instantan an einem Punkt zwischen Aufruf und Rückkehr wirksam wird; sequentielle Konsistenz benötigt nur eine globale Reihenfolge ohne Echtzeit-Bezug",
        answerC = "Sequentielle Konsistenz ist stärker als Linearizability",
        answerD = "Linearizability ist nur für Single-Threaded-Systeme definiert",
        correctAnswer = 1,
        explanation = "Linearizability ist ein stärkeres Modell: Es fügt zur sequentiellen Konsistenz hinzu, dass die globale Reihenfolge die Echtzeit-Reihenfolge respektieren muss. Eine abgeschlossene Operation muss für alle folgenden sichtbar sein.",
        difficulty = 5,
        funFact = "Linearizability ist das Konsistenzmodell, das als 'strong consistency' bei Datenbanken bezeichnet wird und von Spanner (Google) implementiert wird."
    ),
    // 7
    Question(
        categoryId = 7,
        questionText = "Was ist die Byzantine Generals Problem Lösung, die praktisch in Blockchain-Systemen eingesetzt wird?",
        answerA = "Two-Phase Commit Protokoll",
        answerB = "Practical Byzantine Fault Tolerance (PBFT) oder Proof-of-Work/Stake-basierte Mechanismen",
        answerC = "Raft-Konsensus mit Leader-Election",
        answerD = "Paxos mit Multi-Paxos-Erweiterung",
        correctAnswer = 1,
        explanation = "PBFT toleriert bis zu f fehlerhaften Knoten bei 3f+1 Gesamtknoten und ist praktisch für permissioned Blockchains. Bitcoin nutzt Proof-of-Work als probabilistischen BFT-Mechanismus in permissionless Netzwerken.",
        difficulty = 5,
        funFact = "Lamport, Shostak und Pease bewiesen 1982, dass BFT mindestens 3f+1 Knoten benötigt — mit nur 2f+1 (wie bei Raft) ist kein BFT möglich."
    ),
    // 8
    Question(
        categoryId = 7,
        questionText = "Wie viele fehlerhafte Knoten kann ein Byzantine Fault Tolerant System mit n Gesamtknoten maximal tolerieren?",
        answerA = "n/2 - 1 fehlerhafte Knoten",
        answerB = "n - 1 fehlerhafte Knoten",
        answerC = "⌊(n-1)/3⌋ fehlerhafte Knoten",
        answerD = "⌊n/4⌋ fehlerhafte Knoten",
        correctAnswer = 2,
        explanation = "BFT-Systeme können maximal f = ⌊(n-1)/3⌋ byzantinische Fehler tolerieren, was n ≥ 3f+1 erfordert. Crash-Fault-Tolerant Systeme (wie Raft/Paxos) benötigen nur n ≥ 2f+1.",
        difficulty = 5,
        funFact = "Bei nur 4 Knoten kann BFT genau einen fehlerhaften Knoten tolerieren. Bei 3 Knoten ist BFT mathematisch unmöglich."
    ),
    // 9
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen dem Paxos- und dem Raft-Konsensalgorithmus in der praktischen Implementierung?",
        answerA = "Paxos ist deterministisch, Raft ist probabilistisch",
        answerB = "Raft wurde bewusst auf Verständlichkeit optimiert und hat einen strikteren Leader-basierten Ansatz mit explizitem Log-Matching",
        answerC = "Paxos unterstützt keine Cluster-Mitgliedsänderungen, Raft schon nicht",
        answerD = "Raft benötigt einen externen Zeitserver, Paxos nicht",
        correctAnswer = 1,
        explanation = "Ongaro und Ousterhout konzipierten Raft explizit als 'Paxos für Menschen': klare Leader-Wahl, strenge Log-Reihenfolge und einfache Membership-Changes. Paxos ist theoretisch mächtiger aber berüchtigt schwer korrekt zu implementieren.",
        difficulty = 5,
        funFact = "Lamport nannte Paxos nach einem fiktiven griechischen Parlament. Er schrieb den ursprünglichen Paper 1989, doch es wurde erst 1998 veröffentlicht — so unverständlich war es."
    ),
    // 10
    Question(
        categoryId = 7,
        questionText = "Was unterscheidet ein Zero-Knowledge Proof von einem klassischen kryptografischen Beweis?",
        answerA = "Zero-Knowledge Proofs sind schneller zu berechnen als klassische digitale Signaturen",
        answerB = "Der Prüfer erhält keinerlei Kenntnis über das Geheimnis selbst, nur die Überzeugung dass der Prüfer es kennt",
        answerC = "Zero-Knowledge Proofs funktionieren nur für Zahlensysteme mit Primfaktoren",
        answerD = "Zero-Knowledge Proofs erfordern keinen gemeinsamen Schlüssel zwischen Prüfer und Verifizierer",
        correctAnswer = 1,
        explanation = "Ein ZKP erfüllt drei Eigenschaften: Vollständigkeit (ehrlicher Prüfer überzeugt Verifizierer), Korrektheit (unehrlicher Prüfer kann nicht täuschen) und Zero-Knowledge (der Verifizierer lernt nichts außer der Wahrheit der Aussage).",
        difficulty = 5,
        funFact = "Das Beispiel 'Wo ist Waldo?': Man kann beweisen, dass man Waldo gefunden hat, indem man das Bild durch ein großes Loch zeigt — ohne die Position preiszugeben."
    ),
    // 11
    Question(
        categoryId = 7,
        questionText = "Was ermöglicht homomorphe Verschlüsselung, das klassische Verschlüsselung nicht kann?",
        answerA = "Verschlüsselung ohne öffentlichen Schlüssel",
        answerB = "Berechnungen auf verschlüsselten Daten, deren Ergebnisse nach Entschlüsselung den Berechnungen auf den Klartextdaten entsprechen",
        answerC = "Quantenresistente Verschlüsselung durch Gitterkryptographie",
        answerD = "Symmetrische Verschlüsselung mit asymmetrischer Schlüsselverteilung",
        correctAnswer = 1,
        explanation = "Vollständig homomorphe Verschlüsselung (FHE) erlaubt beliebige Berechnungen auf Chiffretexten: E(a) ⊕ E(b) = E(a+b). Cloud-Server können so Daten verarbeiten ohne sie je zu entschlüsseln.",
        difficulty = 5,
        funFact = "Craig Gentry konstruierte 2009 das erste vollständig homomorphe Verschlüsselungssystem in seiner Stanford-Dissertation — als Boole'sches Gitter-Problem."
    ),
    // 12
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen partiell und vollständig homomorpher Verschlüsselung?",
        answerA = "Partiell homomorphe Systeme unterstützen nur eine Operation (z.B. nur Addition oder nur Multiplikation), vollständig homomorphe Systeme unterstützen beide",
        answerB = "Partiell homomorphe Systeme verschlüsseln nur Teile der Nachricht",
        answerC = "Vollständig homomorphe Systeme sind schneller da sie weniger Operationen unterstützen",
        answerD = "Partiell homomorphe Systeme benötigen mehr Schlüssellänge",
        correctAnswer = 0,
        explanation = "PHE unterstützt entweder Addition (z.B. Paillier-Kryptosystem) oder Multiplikation (z.B. RSA), aber nicht beide. FHE unterstützt beliebige Schaltkreise. Der Übergang erfordert 'Bootstrapping' um Rauschen zu reduzieren.",
        difficulty = 5,
        funFact = "RSA ist multiplikativ homomorph: Enc(a)·Enc(b) = Enc(a·b). Das ist eine bekannte Schwäche, die bestimmte Angriffe ermöglicht."
    ),
    // 13
    Question(
        categoryId = 7,
        questionText = "Was beschreibt das Happens-Before Modell von Lamport in verteilten Systemen?",
        answerA = "Eine totale Ordnung aller Ereignisse basierend auf physikalischer Zeit",
        answerB = "Eine partielle Ordnung über Ereignisse, bei der a→b bedeutet: a kann kausal b beeinflusst haben",
        answerC = "Ein Protokoll zur Synchronisation von Systemuhren über NTP",
        answerD = "Eine Methode zur Deadlock-Erkennung in Transaktionssystemen",
        correctAnswer = 1,
        explanation = "Lamports happens-before Relation (→) ist transitiv und definiert kausale Abhängigkeiten: Wenn a vor b auf demselben Prozess passiert, oder a eine Nachricht sendet die b empfängt, dann a→b. Ereignisse ohne Relation sind nebenläufig.",
        difficulty = 5,
        funFact = "Aus der happens-before Relation folgen Lamport-Uhren: logische Zeitstempel die Kausalität erfassen ohne globalen Zustand zu benötigen."
    ),
    // 14
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen Lamport-Uhren und Vektor-Uhren in verteilten Systemen?",
        answerA = "Lamport-Uhren sind effizienter, Vektor-Uhren sind genauer bei der Kausalitätserkennung",
        answerB = "Vektor-Uhren können nebenläufige Ereignisse erkennen, Lamport-Uhren nicht: a→b impliziert L(a)<L(b), aber L(a)<L(b) impliziert nicht a→b",
        answerC = "Lamport-Uhren funktionieren nur in Systemen mit weniger als 10 Knoten",
        answerD = "Vektor-Uhren benötigen einen zentralen Zeitserver",
        correctAnswer = 1,
        explanation = "Lamport-Uhren sind konsistent mit Kausalität, aber nicht vollständig: Man kann nicht aus L(a)<L(b) schließen dass a→b. Vektor-Uhren V sind vollständig: a→b genau dann wenn V(a)<V(b) komponentenweise.",
        difficulty = 5,
        funFact = "Git-Commit-Hashes bilden implizit eine Vektorkasse: Durch die DAG-Struktur der Commits ist Kausalität vollständig bestimmbar."
    ),
    // 15
    Question(
        categoryId = 7,
        questionText = "Was beschreibt das Memory Consistency Model 'Sequential Consistency' nach Lamport?",
        answerA = "Jeder Prozess sieht Speicherzugriffe in der Reihenfolge seiner eigenen Befehle, die globale Reihenfolge aller Prozesse ist eine legale Interleaving",
        answerB = "Schreiboperationen werden sofort für alle Prozessoren sichtbar",
        answerC = "Leseoperationen liefern immer den zuletzt geschriebenen Wert auf demselben Prozessor",
        answerD = "Alle Prozessoren sehen alle Speicherzugriffe in Echtzeit-Reihenfolge",
        correctAnswer = 0,
        explanation = "Sequential Consistency (SC) nach Lamport 1979: Das Ergebnis entspricht einem, als ob alle Operationen in einer sequentiellen Gesamtordnung ausgeführt würden, die mit der Programmreihenfolge jedes Prozessors konsistent ist.",
        difficulty = 5,
        funFact = "Moderne CPUs (x86, ARM) implementieren NICHT Sequential Consistency für Performance — sie nutzen schwächere Modelle wie TSO (Total Store Order)."
    ),
    // 16
    Question(
        categoryId = 7,
        questionText = "Was ist das x86 TSO (Total Store Order) Speicherkonsistenzmodell?",
        answerA = "Reads können Stores auf demselben Prozessor überholen, Stores werden in globaler FIFO-Reihenfolge sichtbar",
        answerB = "Alle Speicherzugriffe erfolgen in Programmreihenfolge ohne Ausnahmen",
        answerC = "Loads werden vor Stores ausgeführt um Cache-Kohärenz zu gewährleisten",
        answerD = "Stores werden sofort sichtbar, Loads können verzögert werden",
        correctAnswer = 0,
        explanation = "TSO erlaubt, dass ein Prozessor seinen eigenen Store-Buffer noch vor anderen Prozessoren sieht (Store-Load-Reordering). Intel x86/x64 implementiert TSO, was präzisere Memory Barriers (MFENCE) in Multithreading-Code erfordert.",
        difficulty = 5,
        funFact = "ARM verwendet ein noch schwächeres Modell (Weak Memory Order), weshalb ARM-Multithreading-Code deutlich mehr explizite Barriers benötigt als x86-Code."
    ),
    // 17
    Question(
        categoryId = 7,
        questionText = "Was ist Out-of-Order Execution in modernen CPU-Pipelines und welches Problem löst sie?",
        answerA = "Die CPU führt Instruktionen in beliebiger Reihenfolge aus um Energieverbrauch zu reduzieren",
        answerB = "Die CPU führt unabhängige Instruktionen außerhalb der Programmreihenfolge aus um Latenz bei Cache-Misses und langen Berechnungen zu verbergen",
        answerC = "Instruktionen werden nach Priorität ausgeführt basierend auf ihren Operanden",
        answerD = "Die CPU spekuliert über Sprungziele und verwirft falsche Ergebnisse",
        correctAnswer = 1,
        explanation = "OoOE nutzt ein Tomasulo-ähnliches Reservation-Station-System: Instruktionen werden in einem Reorder Buffer gehalten, sobald ihre Operanden verfügbar sind ausgeführt, und erst in Programmreihenfolge committed (Retire). Dies überbrückt L1-Cache-Misses (4 Zyklen) bis LLC-Misses (200+ Zyklen).",
        difficulty = 5,
        funFact = "Spectre (2018) ist direkt eine Konsequenz von OoOE: Der Angreifer nutzt spekulativ ausgeführte Instruktionen, die eigentlich nie committed werden, um über Seitenkanäle Geheimnisse zu lesen."
    ),
    // 18
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen Branch Prediction und Speculative Execution in CPU-Pipelines?",
        answerA = "Branch Prediction ist ein Softwaremechanismus, Speculative Execution ein Hardwaremechanismus",
        answerB = "Branch Prediction schätzt das Sprungziel, Speculative Execution führt bereits Instruktionen des vorhergesagten Pfads aus bevor das Ergebnis bekannt ist",
        answerC = "Speculative Execution ist nur bei in-order CPUs verfügbar",
        answerD = "Branch Prediction verwaltet den Return Stack Buffer, Speculative Execution den Translation Lookaside Buffer",
        correctAnswer = 1,
        explanation = "Branch Prediction ist der Vorhersagemechanismus (2-Bit-Counter, TAGE-Predictor). Speculative Execution ist die Pipeline-Technik die basierend auf der Vorhersage Instruktionen ausführt — bei Fehlvorhersage wird der speculative State verworfen (Rollback).",
        difficulty = 5,
        funFact = "Moderne CPUs erreichen >99% Branch-Prediction-Genauigkeit mit TAGE-Prädiktoren. Eine Fehlvorhersage kostet 15-20 Pipeline-Zyklen — entspricht ~5 ns auf einer 4 GHz CPU."
    ),
    // 19
    Question(
        categoryId = 7,
        questionText = "Was beschreibt das MESI-Cache-Kohärenzprotokoll?",
        answerA = "Modified, Exclusive, Shared, Invalid — vier Zustände einer Cache-Zeile zur Koordination zwischen CPU-Caches",
        answerB = "Memory, Execution, Scheduling, Invalidation — Phasen der Instruktionsverarbeitung",
        answerC = "Main, Extended, Secondary, Invalid — Hierarchieebenen des CPU-Cache-Systems",
        answerD = "Multiprocessor, Exclusive, Synchronization, Interrupt — Betriebsmodi des Prozessors",
        correctAnswer = 0,
        explanation = "MESI koordiniert Cache-Kohärenz: Modified (dirty, nur dieser Cache), Exclusive (clean, nur dieser Cache), Shared (clean, mehrere Caches), Invalid (ungültig). Übergänge werden über Bus-Snooping oder Directory-Protokolle signalisiert.",
        difficulty = 5,
        funFact = "False Sharing tritt auf wenn zwei Threads verschiedene Variablen nutzen die in derselben Cache-Zeile (typisch 64 Bytes) liegen — MESI-Transitionen invalidieren trotzdem beide Caches."
    ),
    // 20
    Question(
        categoryId = 7,
        questionText = "Was ist formale Verifikation durch Model Checking und worin liegt ihre fundamentale Einschränkung?",
        answerA = "Automatische Überprüfung ob ein System eine temporallogische Spezifikation erfüllt, begrenzt durch State-Space-Explosion",
        answerB = "Manuelle Überprüfung von Programmen durch mathematische Beweise ohne automatische Unterstützung",
        answerC = "Statische Analyse auf Syntaxebene zur Erkennung von Buffer Overflows",
        answerD = "Laufzeitverifikation durch Instrumentierung des Programmcodes",
        correctAnswer = 0,
        explanation = "Model Checking (Clarke, Emerson, Sifakis — Turing Award 2007) traversiert exhaustiv den Zustandsraum und prüft CTL/LTL-Formeln. Die State-Space-Explosion: n Boolean-Variablen ergeben 2ⁿ Zustände — bereits bei 256 Bits mehr als Atome im Universum.",
        difficulty = 5,
        funFact = "NASA nutzt Model Checking mit SPIN und NuSMV zur Verifikation von Raumfahrt-Software. Amazon AWS nutzt TLA+ um ihre Protokolle formal zu verifizieren."
    ),
    // 21
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen CTL (Computation Tree Logic) und LTL (Linear Temporal Logic)?",
        answerA = "CTL ist quantifiziert über Berechnungspfade, LTL betrachtet nur einen einzigen linearen Pfad",
        answerB = "LTL kann mehr Eigenschaften ausdrücken als CTL, CTL ist eine Teilmenge von LTL",
        answerC = "CTL ist für Liveness-Eigenschaften, LTL ausschließlich für Safety-Eigenschaften",
        answerD = "LTL benötigt explizite Zustände, CTL arbeitet ausschließlich auf Transitionen",
        correctAnswer = 0,
        explanation = "CTL quantifiziert über Pfade (EF p: Es gibt einen Pfad wo p gilt; AF p: Auf allen Pfaden gilt irgendwann p). LTL betrachtet eine einzelne Berechnungssequenz. CTL* vereint beide; weder CTL noch LTL ist eine Teilmenge des anderen.",
        difficulty = 5,
        funFact = "Das Model-Checking-Problem für LTL ist PSPACE-vollständig, für CTL polynomial in der Modellgröße — eine der seltenen Fälle wo eine ausdrucksschwächere Logik effizient prüfbar ist."
    ),
    // 22
    Question(
        categoryId = 7,
        questionText = "Was ist ein CRDT (Conflict-Free Replicated Data Type) und welche mathematische Eigenschaft ist fundamental?",
        answerA = "Ein kryptografisch gesicherter Datentyp für verteilte Datenbanken",
        answerB = "Ein Datentyp dessen Merge-Operation kommutativ, assoziativ und idempotent ist, sodass Replikas ohne Koordination konsistent zusammengeführt werden können",
        answerC = "Ein transaktionaler Datentyp der ACID-Garantien in verteilten Systemen gewährleistet",
        answerD = "Ein komprimierter Datentyp für effiziente Netzwerkreplikation",
        correctAnswer = 1,
        explanation = "CRDTs basieren auf Join-Semilattices: Die Merge-Funktion ist kommutativ (A⊔B = B⊔A), assoziativ ((A⊔B)⊔C = A⊔(B⊔C)) und idempotent (A⊔A = A). Damit können Replikas in beliebiger Reihenfolge zusammengeführt werden.",
        difficulty = 5,
        funFact = "Figma, Redis, Riak und Apple-Notes nutzen CRDTs. Yjs (Collaborative Editing) ist ein populäres CRDT-Framework das Google-Docs-ähnliche Kollaboration ohne Server-Koordination ermöglicht."
    ),
    // 23
    Question(
        categoryId = 7,
        questionText = "Was ist das Hindley-Milner-Typsystem und welche zentrale Eigenschaft macht es besonders?",
        answerA = "Ein dynamisches Typsystem das Laufzeitfehler durch Reflection erkennt",
        answerB = "Ein polymorphes Typsystem mit vollständiger Typinferenz: Typannotationen sind optional, der Compiler inferiert den allgemeinsten Typ automatisch",
        answerC = "Ein abhängiges Typsystem das Programmkorrektheit formal beweist",
        answerD = "Ein nominales Typsystem für objektorientierte Sprachen mit Vererbung",
        correctAnswer = 1,
        explanation = "HM-Typinferenz (Robinson-Unifikation + Damas-Milner-Algorithmus W) inferiert in O(n·α(n)) den allgemeinsten Typ (principal type) ohne Annotationen. Dies ist die Grundlage von Haskell, ML, OCaml und Rust.",
        difficulty = 5,
        funFact = "Haskells Typklassen und GHC-Extensions wie RankNTypes und GADTs gehen über HM hinaus und machen vollständige Typinferenz unentscheidbar — bestimmte Ausdrücke benötigen dann Annotationen."
    ),
    // 24
    Question(
        categoryId = 7,
        questionText = "Was ist der Curry-Howard-Isomorphismus?",
        answerA = "Eine Optimierungstechnik zur Übersetzung funktionaler Programme in Maschinencode",
        answerB = "Eine Korrespondenz zwischen Typen und logischen Aussagen sowie zwischen Programmen und mathematischen Beweisen",
        answerC = "Ein Algorithmus zur Typinferenz in polymorphen Typsystemen",
        answerD = "Eine Methode zur Verifikation von Schaltkreisen durch Propositionallogik",
        correctAnswer = 1,
        explanation = "Curry-Howard: Typen entsprechen logischen Propositions, Programme entsprechen Beweisen, Typüberprüfung entspricht Beweisüberprüfung. Beispiel: A→B entspricht 'A impliziert B', eine Funktion f:A→B ist ein Beweis dieser Implikation.",
        difficulty = 5,
        funFact = "Dependently typed languages wie Coq und Agda nutzen Curry-Howard direkt: Man schreibt Programme die gleichzeitig mathematische Beweise sind. Der Beweis des Vier-Farben-Satzes in Coq ist ~60.000 Zeilen Coq-Code."
    ),
    // 25
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen Safety- und Liveness-Eigenschaften in der formalen Verifikation?",
        answerA = "Safety bedeutet das System startet korrekt, Liveness dass es terminiert",
        answerB = "Safety: 'Nichts Schlechtes passiert jemals' (verletzbar durch endliche Präfixe); Liveness: 'Etwas Gutes passiert irgendwann' (nicht verletzbar durch endliche Präfixe)",
        answerC = "Safety-Eigenschaften gelten nur für sequentielle Programme, Liveness für parallele",
        answerD = "Safety wird durch Model Checking überprüft, Liveness durch Theorem Proving",
        correctAnswer = 1,
        explanation = "Alpern und Schneider (1985): Jede Eigenschaft ist eine Konjunktion einer Safety- und einer Liveness-Eigenschaft. Safety (z.B. 'kein Deadlock') wird durch einen endlichen Gegenbeispiel-Pfad widerlegt. Liveness (z.B. 'jeder Request wird irgendwann beantwortet') erfordert unendliche Sequenzen.",
        difficulty = 5,
        funFact = "Die Aussage 'Mutual Exclusion' ist eine Safety-Eigenschaft. 'Starvation-Freedom' (jeder bekommt irgendwann Zugriff) ist eine Liveness-Eigenschaft — sie erfordert typischerweise Fairness-Annahmen."
    ),
    // 26
    Question(
        categoryId = 7,
        questionText = "Was ist ein zk-SNARK und was bedeutet das Akronym?",
        answerA = "Zero-Knowledge Succinct Non-interactive ARgument of Knowledge — ein kompakter beweisführbarer Nachweis ohne Interaktion",
        answerB = "Zero-Key Secure Network Authentication and Routing Key — ein Netzwerkprotokoll",
        answerC = "Zero-Knowledge Secure Null-hypothesis Algorithm with Reduced Keysize",
        answerD = "Zone-based Key Symmetric Non-Asymmetric Routing Key",
        correctAnswer = 0,
        explanation = "zk-SNARKs (Groth16, PLONK) erzeugen Beweise die: (1) Zero-Knowledge sind, (2) Succinct (wenige hundert Bytes, millisekunden zur Verifikation), (3) Non-interactive (kein Hin-und-Her), (4) Arguments of Knowledge (Prüfer kennt Witness).",
        difficulty = 5,
        funFact = "Zcash war die erste Kryptowährung die zk-SNARKs für private Transaktionen nutzte. Ethereum-Layer-2-Lösungen wie zkSync und StarkNet nutzen zk-Rollups mit zk-STARKs bzw. zk-SNARKs."
    ),
    // 27
    Question(
        categoryId = 7,
        questionText = "Was ist Spectre (CVE-2017-5753) auf Mikroprozessor-Ebene?",
        answerA = "Ein Betriebssystemfehler der Kernel-Speicher für User-Space-Programme zugänglich macht",
        answerB = "Eine Klasse von Seitenkanalangriffen die spekulativ ausgeführte Instruktionen ausnutzen um Grenzen zwischen Prozessen zu überschreiten",
        answerC = "Ein Compiler-Fehler der unsafe Code in C-Programmen erzeugt",
        answerD = "Eine Schwachstelle im x86-Segmentierungsmechanismus",
        correctAnswer = 1,
        explanation = "Spectre induziert das Opfer-Programm spekulativ Code auszuführen der bei korrekter Ausführung nicht erreichbar wäre. Die transienten Effekte (Cache-Zustand) werden durch Timing-Messungen (Flush+Reload) sichtbar gemacht, um Secrets zu exfiltrieren.",
        difficulty = 5,
        funFact = "Spectre erforderte Patches in CPUs (Microcode), Betriebssystemen, Browsern und Compilern. Retpoline (Return Trampoline) ist eine der Mitigationen: Sie ersetzt indirekte Sprünge durch Schleifen die Speculative Execution verhindern."
    ),
    // 28
    Question(
        categoryId = 7,
        questionText = "Was ist das Halting Problem und warum ist es unentscheidbar?",
        answerA = "Das Problem ob ein Netzwerkprotokoll terminiert, unentscheidbar wegen Netzwerk-Nichtdeterminismus",
        answerB = "Das Problem zu entscheiden ob ein beliebiges Programm P mit Eingabe I terminiert; unentscheidbar per Diagonalargument: Ein Solver für das Halteproblem würde zu einem Widerspruch führen",
        answerC = "Das Problem ob eine CPU nach einem Systemabsturz korrekt neu startet",
        answerD = "Das Problem ob ein Betriebssystem-Prozess in einem Deadlock feststeckt",
        correctAnswer = 1,
        explanation = "Turings Diagonalbeweis (1936): Angenommen H(P,I) entscheidet ob P(I) terminiert. Konstruiere D(x): wenn H(x,x)=ja dann Endlosschleife, sonst terminiere. D(D) führt zu Widerspruch — H kann nicht existieren.",
        difficulty = 5,
        funFact = "Das Halteproblem ist das kanonische Beispiel eines unentscheidbaren Problems. Alle anderen unentscheidbaren Probleme (Rices Theorem, Post'sches Korrespondenzproblem) werden durch Reduktion auf das Halteproblem bewiesen."
    ),
    // 29
    Question(
        categoryId = 7,
        questionText = "Was ist ein NUMA-System (Non-Uniform Memory Access) und warum ist es für Performance-kritischen Code relevant?",
        answerA = "Ein Speichersystem wo alle Prozessoren gleich schnell auf alle Speicherbereiche zugreifen",
        answerB = "Eine Architektur wo Speicherzugriffszeit abhängig von der physischen Nähe des Speichers zum Prozessor variiert; lokaler Speicher ist deutlich schneller als Remote-Speicher",
        answerC = "Ein virtuelles Speichersystem das NUMA-Zugriffe durch das Betriebssystem transparent macht",
        answerD = "Ein Cache-Kohärenzprotokoll für Multi-Socket-Systeme",
        correctAnswer = 1,
        explanation = "In NUMA-Systemen (AMD EPYC, Intel Xeon multi-socket) hat jeder CPU-Socket seinen eigenen lokalen RAM. Remote-Zugriff auf anderen Socket-RAM ist 2-4x langsamer. NUMA-aware Allokation (numactl, libnuma) und Thread-Pinning sind kritisch für HPC-Performance.",
        difficulty = 5,
        funFact = "Linux-Kernel seit 2.6 hat NUMA-Scheduling-Support. False NUMA-Node-Crossing kann Performance bei Datenbankservern um 40-60% reduzieren — ein häufig übersehener Bottleneck."
    ),
    // 30
    Question(
        categoryId = 7,
        questionText = "Was ist Amdahls Gesetz und welche fundamentale Einschränkung der Parallelisierung beschreibt es?",
        answerA = "Der Speedup durch n Prozessoren ist maximal n, begrenzt durch den sequentiellen Anteil: S(n) = 1/(1-p + p/n)",
        answerB = "Parallelisierung verdoppelt immer die Performance wenn die Prozessorzahl verdoppelt wird",
        answerC = "Kommunikationskosten zwischen Prozessoren wachsen quadratisch mit der Prozessorzahl",
        answerD = "Memory-Bandwidth ist der einzige Bottleneck bei parallelen Berechnungen",
        correctAnswer = 0,
        explanation = "Amdahl (1967): Wenn Anteil p des Programms parallelisierbar ist, ist der maximale Speedup 1/(1-p). Bei p=90% ist selbst mit unendlich vielen Prozessoren maximal Faktor 10 erreichbar. Gustafson widerlegt dies für skalierbare Problemgrößen.",
        difficulty = 5,
        funFact = "Gustafsons Gesetz (1988) ist die Gegenperspektive: Bei wachsendem Problem (schwache Skalierung) steigt p mit der Problemgröße. Dies erklärt warum Supercomputer trotz Amdahl sinnvoll sind."
    ),
    // 31
    Question(
        categoryId = 7,
        questionText = "Was ist ein Bloom Filter und welchen fundamentalen Kompromiss geht er ein?",
        answerA = "Eine probabilistische Datenstruktur die False Negatives aber keine False Positives erzeugt",
        answerB = "Eine raumeffiziente probabilistische Datenstruktur die False Positives erlaubt aber keine False Negatives: 'Nicht im Set' ist garantiert korrekt",
        answerC = "Ein deterministischer Algorithmus zur exakten Mengenzugehörigkeitsprüfung in O(1)",
        answerD = "Eine kryptografische Hashfunktion zur Erkennung von Datenmanipulationen",
        correctAnswer = 1,
        explanation = "Bloom Filter: k Hashfunktionen setzen k Bits in einem m-Bit-Array. 'Ist x im Set?' prüft alle k Bits. Nur wenn alle gesetzt: möglicherweise im Set (False Positive möglich). Wenn ein Bit nicht gesetzt: definitiv nicht im Set.",
        difficulty = 5,
        funFact = "Google Bigtable, Cassandra und PostgreSQL nutzen Bloom Filter um teure Disk-Reads zu vermeiden. Chrome nutzte Bloom Filter um schädliche URLs lokal zu prüfen ohne eine vollständige Liste zu speichern."
    ),
    // 32
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen B-Trees und LSM-Trees (Log-Structured Merge-Trees)?",
        answerA = "B-Trees sind für Lese-optimiert mit O(log n) Reads und guten Writes; LSM-Trees sind für Schreib-optimiert durch sequentielle Disk-Writes auf Kosten von Read-Amplification",
        answerB = "B-Trees speichern Daten im RAM, LSM-Trees ausschließlich auf Disk",
        answerC = "LSM-Trees bieten bessere Leseleistung als B-Trees bei gleichen Schreibkosten",
        answerD = "B-Trees sind nur für relationale Datenbanken geeignet, LSM-Trees für NoSQL",
        correctAnswer = 0,
        explanation = "B-Trees: In-place Updates, gut für Reads, Write-Amplification durch random I/O. LSM-Trees (RocksDB, LevelDB, Cassandra): Writes gehen sequentiell in Memtable→WAL→SSTables; Compaction erzeugt Read-Amplification aber Write-Amplification durch sequentielles I/O ist SSD/HDD-freundlich.",
        difficulty = 5,
        funFact = "RocksDB (Facebook, basierend auf LevelDB) ist der de-facto Standard für Write-heavy workloads. MyRocks ist eine MySQL Storage Engine auf RocksDB-Basis die Facebooks User-Datenbank antreibt."
    ),
    // 33
    Question(
        categoryId = 7,
        questionText = "Was ist Write-Amplification bei SSD-Speicher und warum ist es ein kritisches Problem?",
        answerA = "Das mehrfache Schreiben von Daten über die logische Schreibmenge hinaus, verursacht durch Flash-Speicher-Eigenschaften (nur Page-granulare Writes, Erase auf Block-Ebene)",
        answerB = "Die Wiederholung von Schreiboperationen wegen Netzwerkfehler in verteilten Systemen",
        answerC = "Die Verdopplung von Writes durch RAID-1-Spiegelung",
        answerD = "Cache-Invalidierungen die zusätzliche Schreiboperationen auslösen",
        correctAnswer = 0,
        explanation = "NAND-Flash kann nicht überschreiben: Vor einem Write muss ein Block (128-512 Pages) gelöscht werden. Der GC-Prozess (Garbage Collection) kopiert valide Pages, löscht den Block, schreibt zurück. Write-Amplification Factor (WAF) von 5-10x reduziert die SSD-Lebensdauer drastisch.",
        difficulty = 5,
        funFact = "NVMe-SSDs haben typisch 10x höhere Schreibendurance-Spezifikationen als SATA-SSDs. Enterprise-SSDs (Intel Optane, Samsung PM series) optimieren explizit für niedrigen WAF in Datenbank-Workloads."
    ),
    // 34
    Question(
        categoryId = 7,
        questionText = "Was ist das Two-Phase Locking (2PL) Protokoll und wie gewährleistet es Serialisierbarkeit?",
        answerA = "Transaktionen werden in zwei Phasen aufgeteilt: Lesen in Phase 1, Schreiben in Phase 2",
        answerB = "Alle Locks werden vor dem ersten Unlock erworben (Growing Phase), danach werden nur Locks freigegeben (Shrinking Phase) — kein Erwerb nach Release",
        answerC = "Zwei Transaktionen können nicht gleichzeitig schreiben, aber gleichzeitig lesen",
        answerD = "Alle Ressourcen werden zu Beginn der Transaktion reserviert und am Ende freigegeben",
        correctAnswer = 1,
        explanation = "2PL Theorem: Jede Transaktion die 2PL befolgt erzeugt eine serialisierbare Schedule. Strict 2PL (alle Locks bis Commit halten) verhindert außerdem Dirty Reads und Cascading Aborts.",
        difficulty = 5,
        funFact = "2PL kann zu Deadlocks führen (zyklische Wartegraphen). MVCC (Multi-Version Concurrency Control) — genutzt von PostgreSQL, Oracle — vermeidet Lese-Locks durch Versioning und eliminiert Read-Write-Deadlocks."
    ),
    // 35
    Question(
        categoryId = 7,
        questionText = "Was ist MVCC (Multi-Version Concurrency Control) und welchen Isolationsgrad ermöglicht es effizient?",
        answerA = "Eine Technik die mehrere Versionen von Daten speichert, sodass Reads keine Write-Locks benötigen und Snapshot Isolation implementiert werden kann",
        answerB = "Eine Methode zur Versionierung von Datenbankschemas bei Migrationen",
        answerC = "Ein Protokoll zur Synchronisation von Replikas in einem Cluster",
        answerD = "Eine Komprimierungstechnik für historische Datenbankzustände",
        correctAnswer = 0,
        explanation = "MVCC speichert mehrere Versionen jedes Datensatzes mit Timestamps/Transaktions-IDs. Reads sehen immer einen konsistenten Snapshot (Snapshot Isolation) ohne Write-Locks zu benötigen. Write-Write-Konflikte werden separat behandelt (First-Committer-Wins).",
        difficulty = 5,
        funFact = "Snapshot Isolation verhindert fast alle Anomalien, erlaubt aber Write Skew (zwei Transaktionen lesen überlappende Sets und schreiben nicht-überlappende Sets). Serializability erfordert SSI (Serializable Snapshot Isolation) wie in PostgreSQL 9.1+."
    ),
    // 36
    Question(
        categoryId = 7,
        questionText = "Was ist das Gossip-Protokoll in verteilten Systemen und welche Konvergenzeigenschaft hat es?",
        answerA = "Ein Protokoll zur sofortigen Konsistenz durch Broadcast an alle Knoten",
        answerB = "Ein epidemisches Protokoll wo jeder Knoten periodisch zufällige Nachbarn kontaktiert; Information verbreitet sich in O(log n) Runden mit hoher Wahrscheinlichkeit",
        answerC = "Ein Leader-basiertes Protokoll zur Koordination von Cluster-Membership",
        answerD = "Ein Protokoll zur Erkennung von Netzwerkpartitionen in verteilten Systemen",
        correctAnswer = 1,
        explanation = "Gossip/Epidemic-Protokolle: In jeder Runde wählt jeder infizierte Knoten k zufällige Partner und teilt die Information. Nach O(log n) Runden haben mit hoher Wahrscheinlichkeit alle n Knoten die Information. Cassandra, DynamoDB und Consul nutzen Gossip für Membership und Health.",
        difficulty = 5,
        funFact = "Amazon DynamoDB nutzt eine Gossip-basierte Failure-Detection. Cassandra's Anti-Entropy-Prozess nutzt Gossip mit Merkle-Trees um Inkonsistenzen zwischen Replikas zu erkennen und zu reparieren."
    ),
    // 37
    Question(
        categoryId = 7,
        questionText = "Was ist ein Skip List und welchen Vorteil hat er gegenüber balancierten Binärbäumen?",
        answerA = "Eine einfach verkettete Liste mit O(1) Suche durch Hashing",
        answerB = "Eine probabilistische Datenstruktur mit mehreren geordneten verketteten Listen verschiedener Granularität, die O(log n) Such/Insert/Delete mit einfacherer Implementierung als AVL/Red-Black-Trees bietet",
        answerC = "Eine Cache-optimierte Variante des B-Trees für In-Memory-Datenbanken",
        answerD = "Eine Lock-free Linked List für Multi-Threaded-Anwendungen",
        correctAnswer = 1,
        explanation = "Skip Lists (Pugh 1990): Auf Level 0 alle Elemente, auf Level k nur ~n/2^k Elemente. Suche springt auf hohen Levels vor und verfeinert. Erwartete O(log n) für alle Operationen, einfach concurrent (im Vergleich zu Lock-freien Bäumen).",
        difficulty = 5,
        funFact = "Redis nutzt Skip Lists für Sorted Sets (ZADD/ZRANGE). LevelDB und RocksDB nutzen Skip Lists für die In-Memory-Memtable. MemSQL nutzt Lock-free Skip Lists als Herzstück ihrer In-Memory-Engine."
    ),
    // 38
    Question(
        categoryId = 7,
        questionText = "Was ist das Superscalar-Prinzip in CPU-Architekturen und wie unterscheidet es sich von VLIW?",
        answerA = "Superscalar führt mehrere Instruktionen pro Takt dynamisch (Hardware-gesteuert) parallel aus; VLIW legt statisch zur Compilezeit fest welche Instruktionen parallel ausgeführt werden",
        answerB = "VLIW ist schneller als Superscalar, Superscalar benötigt mehr Transistoren",
        answerC = "Superscalar ist nur für RISC-Architekturen verfügbar, VLIW für CISC",
        answerD = "Beide Konzepte sind äquivalent und unterscheiden sich nur in der Implementierung",
        correctAnswer = 0,
        explanation = "Superscalar (Intel Core, AMD Zen): Dispatch-Einheit erkennt zur Laufzeit unabhängige Instruktionen und sendet mehrere pro Takt. VLIW (Intel Itanium, DSPs): Der Compiler packt parallele Operationen in breite Instruktionswörter — einfachere Hardware, aber mehr Compiler-Komplexität und schlechtere Binärkompatibilität.",
        difficulty = 5,
        funFact = "Intel Itanium (VLIW/EPIC) scheiterte trotz theoretischer Überlegenheit an der Compiler-Komplexität und schlechter Abwärtskompatibilität zu x86. Intel stellte 2017 neue Itanium-Server ein."
    ),
    // 39
    Question(
        categoryId = 7,
        questionText = "Was ist Dependent Types und welchen Vorteil bieten sie gegenüber einfachen polymorphen Typsystemen?",
        answerA = "Typen die von Laufzeitwerten abhängen können, wodurch Invarianten wie Arraylängen oder mathematische Eigenschaften im Typsystem kodiert und zur Compilezeit verifiziert werden",
        answerB = "Typen die von anderen Typen abhängen, entsprechend Generics/Templates in C++ oder Java",
        answerC = "Ein Typsystem das automatisch Nullpointer-Ausnahmen zur Laufzeit erkennt",
        answerD = "Typen die zur Laufzeit durch Reflection modifiziert werden können",
        correctAnswer = 0,
        explanation = "Dependent Types (Idris, Coq, Agda): `Vector n a` ist ein Vektor der exakt n Elemente hat. `head : Vector (S n) a → a` ist typkorrekt nur für nicht-leere Vektoren. Invarianten werden zum Theorem im Typ selbst.",
        difficulty = 5,
        funFact = "Sewell et al. entwickelten das seL4 Mikrokernel-Betriebssystem mit formaler Verifikation in Isabelle/HOL. Der vollständige Beweis der Korrektheit des C-Codes umfasst ~200.000 Zeilen Beweistext."
    ),
    // 40
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen Eager und Lazy Evaluation in funktionalen Programmiersprachen?",
        answerA = "Eager Evaluation berechnet alle Argumente vor dem Funktionsaufruf, Lazy Evaluation berechnet Argumente nur wenn und falls sie benötigt werden (Call-by-Need)",
        answerB = "Lazy Evaluation ist immer langsamer als Eager Evaluation wegen Thunk-Overhead",
        answerC = "Eager Evaluation ermöglicht nur endliche Datenstrukturen, Lazy Evaluation nur unendliche",
        answerD = "Lazy Evaluation ist eine Optimierung die nur von Compilern intern genutzt wird",
        correctAnswer = 0,
        explanation = "Call-by-Need (Haskell): Ausdrücke werden als Thunks dargestellt und nur bei Bedarf ausgewertet, das Ergebnis wird gecacht (memoized). Dies ermöglicht unendliche Datenstrukturen, kann aber Space Leaks erzeugen wenn Thunks akkumulieren.",
        difficulty = 5,
        funFact = "Haskell's `take 10 [1..]` funktioniert weil [1..] ein unendlicher Lazy List ist. Der `foldl` vs `foldl'` Bug in Haskell ist ein klassisches Space-Leak-Beispiel: foldl akkumuliert Thunks ohne seq/strictness."
    ),
    // 41
    Question(
        categoryId = 7,
        questionText = "Was ist das Diffie-Hellman-Problem und warum ist es die Grundlage sicherer Schlüsselvereinbarung?",
        answerA = "Das Problem zwei Primzahlen zu multiplizieren, dessen Umkehrung die Faktorisierung ist",
        answerB = "Das Problem g^(ab) aus g^a und g^b in einer Gruppe zu berechnen, ohne a oder b zu kennen — schwer wenn der diskrete Logarithmus schwer ist",
        answerC = "Das Problem einen gemeinsamen Schlüssel über einen unsicheren Kanal zu übertragen",
        answerD = "Das Problem den privaten Schlüssel aus dem öffentlichen Schlüssel zu berechnen",
        correctAnswer = 1,
        explanation = "DH: Alice sendet g^a, Bob sendet g^b. Beide berechnen g^(ab). Ein Angreifer sieht g^a und g^b, muss aber g^(ab) berechnen (CDH-Problem). Die Sicherheit basiert auf der Schwierigkeit des diskreten Logarithmus.",
        difficulty = 5,
        funFact = "ECDH (Elliptic Curve DH) nutzt dieselbe mathematische Struktur aber auf elliptischen Kurven, was bei gleicher Sicherheit deutlich kleinere Schlüssel (256 Bit ECDH ≈ 3072 Bit RSA) ermöglicht."
    ),
    // 42
    Question(
        categoryId = 7,
        questionText = "Was ist Shor's Algorithmus und welche Auswirkung hat er auf klassische Kryptographie?",
        answerA = "Ein quantenbasierter Algorithmus der ganzzahlige Faktorisierung und diskrete Logarithmen in polynomieller Zeit löst und damit RSA/DH/ECDH bricht",
        answerB = "Ein klassischer Algorithmus zur Primzahlgenerierung für RSA-Schlüssel",
        answerC = "Ein Quantenfehlerkorrektur-Algorithmus für Quantencomputer",
        answerD = "Ein Algorithmus zur Quantenkommunikation über verschränkte Qubits",
        correctAnswer = 0,
        explanation = "Shors Algorithmus (1994) faktoriziert n-Bit-Zahlen in O(n³) Quantenoperationen. Ein ausreichend großer Quantencomputer würde RSA-2048, ECDH-256 und DH brechen. Dies ist der Haupttreiber hinter Post-Quantum-Kryptographie (CRYSTALS-Kyber, CRYSTALS-Dilithium).",
        difficulty = 5,
        funFact = "NIST standardisierte 2024 vier Post-Quantum-Kryptographiealgorithmen: ML-KEM (Kyber), ML-DSA (Dilithium), SLH-DSA (SPHINCS+) und FN-DSA (FALCON). Sie basieren auf Gitterproblemen oder Hash-Funktionen die als quantenresistent gelten."
    ),
    // 43
    Question(
        categoryId = 7,
        questionText = "Was ist Grover's Algorithmus und wie beeinflusst er symmetrische Kryptographie?",
        answerA = "Ein Quantenalgorithmus der Datenbanksuche in O(√n) statt O(n) ausführt, was symmetrische Schlüssellängen effektiv halbiert",
        answerB = "Ein Algorithmus der AES in linearer Zeit bricht",
        answerC = "Ein Quantenalgorithmus der nur asymmetrische Kryptographie angreift",
        answerD = "Ein Algorithmus der Hashkollisionen in O(1) findet",
        correctAnswer = 0,
        explanation = "Grover (1996): Unstrukturierte Datenbanksuche in O(√N). AES-128 bietet gegen Grover nur 64-Bit effektive Sicherheit. Deshalb empfiehlt NIST AES-256 für post-quantum-Sicherheit — der Faktor 2 im Exponenten reicht als Puffer.",
        difficulty = 5,
        funFact = "Anders als Shor (der RSA vollständig bricht) macht Grover Brute-Force nur quadratisch schneller — deshalb sind symmetrische Algorithmen mit verdoppelter Schlüssellänge weiterhin sicher gegen Quantencomputer."
    ),
    // 44
    Question(
        categoryId = 7,
        questionText = "Was ist ein Merkle Tree und welche Eigenschaft macht ihn für verteilte Systeme unverzichtbar?",
        answerA = "Ein selbstbalancierender Binärbaum für In-Memory-Datenstrukturen",
        answerB = "Ein kryptografischer Baum wo jeder innere Knoten der Hash seiner Kinder ist; Änderungen an beliebigen Blättern propagieren zur Wurzel und ermöglichen effiziente Inkonsistenzerkennung",
        answerC = "Ein Protokoll zur verteilten Schlüsselverteilung in PKI-Systemen",
        answerD = "Eine Datenstruktur zur Komprimierung von Zertifikatsketten in TLS",
        correctAnswer = 1,
        explanation = "Merkle Trees: Zwei Systeme vergleichen nur die Wurzel-Hashes. Bei Abweichung traversieren sie den Baum binär, um die abweichenden Teilbäume in O(log n) Schritten zu finden. Git, Bitcoin, Cassandra-Anti-Entropy und Certificate Transparency nutzen Merkle Trees.",
        difficulty = 5,
        funFact = "Google's Certificate Transparency Log ist ein öffentlicher Merkle Tree aller TLS-Zertifikate. Browser prüfen ob ein Zertifikat im Log ist — Misissued Certificates können so öffentlich erkannt werden."
    ),
    // 45
    Question(
        categoryId = 7,
        questionText = "Was ist Consistent Hashing und welches Problem in verteilten Systemen löst es?",
        answerA = "Eine Hashfunktion die immer dieselben Ergebnisse liefert unabhängig von der Plattform",
        answerB = "Eine Technik die Daten auf einem Ring verteilt, sodass beim Hinzufügen/Entfernen von Knoten nur O(k/n) Keys remappt werden müssen anstatt O(k)",
        answerC = "Ein Protokoll zur konsistenten Replikation von Daten auf alle Knoten",
        answerD = "Eine Methode zur Erkennung von Hash-Kollisionen in verteilten Caches",
        correctAnswer = 1,
        explanation = "Consistent Hashing (Karger 1997): Keys und Knoten werden auf einen Ring [0, 2^m) gemappt. Jeder Key geht zum nächsten Knoten im Uhrzeigersinn. Bei n→n+1 Knoten werden nur K/(n+1) Keys (statt K/n) remappt. Amazon DynamoDB und Cassandra nutzen dies mit Virtual Nodes.",
        difficulty = 5,
        funFact = "Virtual Nodes (VNodes) in Cassandra: Jeder physische Knoten bekommt viele Token-Positionen auf dem Ring. Dies verteilt die Last gleichmäßiger und vereinfacht das Rebalancing wenn Knoten hinzukommen."
    ),
    // 46
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen optimistischer und pessimistischer Nebenläufigkeitskontrolle?",
        answerA = "Pessimistisch: Konflikte werden durch Locks vor der Ausführung verhindert; Optimistisch: Konflikte werden erkannt und nach der Ausführung aufgelöst (Abort/Retry)",
        answerB = "Optimistische Kontrolle ist immer schneller als pessimistische Kontrolle",
        answerC = "Pessimistische Kontrolle wird nur bei Lese-Operationen eingesetzt",
        answerD = "Optimistische Kontrolle erfordert MVCC, pessimistische Kontrolle nicht",
        correctAnswer = 0,
        explanation = "Pessimistisch (2PL): Locks verhindern Konflikte proaktiv — sicher bei hoher Konfliktrate. Optimistisch (OCC): Lesen ohne Locks, Validierungsphase vor Commit prüft Konflikte — besser bei niedriger Konfliktrate und kurzen Transaktionen.",
        difficulty = 5,
        funFact = "Google Spanner nutzt eine Kombination: Zwei-Phasen-Commit für Writes (pessimistisch) aber Snapshot Reads (MVCC, optimistisch) für konsistente globale Reads ohne Locks."
    ),
    // 47
    Question(
        categoryId = 7,
        questionText = "Was ist Tail Latency (P99/P999) und warum ist es kritischer als Durchschnittslatenz für verteilte Systeme?",
        answerA = "Die maximale Latenz eines Systems, die nur durch bessere Hardware reduziert werden kann",
        answerB = "Das 99./99.9. Perzentil der Latenzverteilung; bei Fanout-Anfragen an n Services ist die beobachtete Latenz das Maximum der n Einzellatenzen — Tail-Latenz dominiert die Nutzererfahrung",
        answerC = "Die Latenz von Netzwerktailpaketen die am Ende einer TCP-Session gesendet werden",
        answerD = "Die Latenz der langsamsten 1% der Anfragen die immer verworfen werden",
        correctAnswer = 1,
        explanation = "Bei einem Fanout zu 100 Services mit je 1% P99-Latenz-Chance sieht eine Anfrage mit ~63% Wahrscheinlichkeit mindestens eine langsame Antwort (1-(0.99)^100 ≈ 63%). Hedged Requests (Anfrage an Backup nach Timeout) und Tail-Latency-Toleranz sind kritische Designprinzipien.",
        difficulty = 5,
        funFact = "Jeff Dean (Google) prägte 'The Tail at Scale' (2013): Microsecond-level GC-Pausen, CPU-Scheduling-Jitter oder Netzwerk-Interrupts erzeugen Tail-Latenz. Google's Bigtable nutzt Tablet-Level-Hedging um P999-Latenz zu begrenzen."
    ),
    // 48
    Question(
        categoryId = 7,
        questionText = "Was ist das Actor-Modell der Nebenläufigkeit und wie unterscheidet es sich von Thread-basierter Nebenläufigkeit?",
        answerA = "Actors sind leichtgewichtige Objekte die ausschließlich über asynchrone Message-Passing kommunizieren; kein gemeinsamer Zustand, kein direktes Methodenaufruf",
        answerB = "Actors sind Threads mit eigenem Stack die synchron kommunizieren",
        answerC = "Das Actor-Modell ist eine Erweiterung von Monitoren mit expliziten Locks",
        answerD = "Actors teilen Zustand aber verwenden atomare Operationen statt Locks",
        correctAnswer = 0,
        explanation = "Actor-Modell (Hewitt 1973): Jeder Actor hat private State, eine Mailbox und verhält sich reaktiv auf Messages. Actors können: neue Actors erzeugen, Messages senden, lokalen State ändern. Erlang/OTP und Akka implementieren dies; Fehlertoleranz durch 'Let it crash' + Supervisor-Trees.",
        difficulty = 5,
        funFact = "WhatsApp erreichte mit Erlang und dem Actor-Modell 2 Millionen gleichzeitige Verbindungen pro Server mit 14 Engineers. Das Actor-Modell macht Erlang ideal für Telekommunikation mit 99.9999999% (Nine-Nines) Uptime-Anforderungen."
    ),
    // 49
    Question(
        categoryId = 7,
        questionText = "Was ist das Kolmogorov-Komplexitätsmaß und welche fundamentale Eigenschaft hat es?",
        answerA = "Die Länge des kürzesten Programms das einen String erzeugt; es ist nicht berechenbar (unentscheidbar)",
        answerB = "Die Anzahl der Operationen die ein Algorithmus auf einer Turingmaschine benötigt",
        answerC = "Eine berechenbare Maßzahl für die Zufälligkeit von Strings die als Verschlüsselungsgrundlage dient",
        answerD = "Die minimale Speichermenge die ein Programm zur Ausführung benötigt",
        correctAnswer = 0,
        explanation = "K(x) = Länge des kürzesten Programms P das x erzeugt. Ein zufälliger String hat K(x) ≈ |x|, ein hochkomprimierbarer String hat kleines K(x). Unentscheidbar: Man kann K(x) nicht algorithmisch berechnen (folgt aus Halteproblem).",
        difficulty = 5,
        funFact = "Kolmogorov-Komplexität liefert den theoretischen Unterbau für Datenkompression: ZIP/GZIP approximieren K(x) durch LZ-Algorithmen. Beim Kolmogorov-Smirnov-Entfernungsmaß wird K als Basis für einen universellen Ähnlichkeitsmaß genutzt."
    ),
    // 50
    Question(
        categoryId = 7,
        questionText = "Was ist das Consensus-Number-Konzept von Herlihy und was sagt es über Wait-Free-Synchronisation aus?",
        answerA = "Jedes Synchronisationsobjekt hat eine Consensus-Number die angibt für wie viele Threads es Wait-Free Konsens lösen kann: Compare-and-Swap hat ∞, aber Read/Write-Register nur 1",
        answerB = "Die minimale Anzahl an Threads die für Konsens in einem verteilten System benötigt wird",
        answerC = "Die Anzahl der Runden die Paxos benötigt um Konsens zu erreichen",
        answerD = "Die maximale Anzahl fehlerhafter Prozesse die ein Konsensprotokoll toleriert",
        correctAnswer = 0,
        explanation = "Herlihys Consensus Hierarchy: Read/Write-Register haben CN=1 (kein Konsens >1 Thread). Test-and-Set hat CN=2. Compare-and-Swap (CAS), LL/SC haben CN=∞. CAS (x86 LOCK CMPXCHG, ARM LDXR/STXR) kann universelle Wait-Free-Implementierungen für beliebig viele Threads realisieren.",
        difficulty = 5,
        funFact = "Java's AtomicInteger.compareAndSet() und C++ std::atomic<>::compare_exchange_strong() implementieren CAS direkt auf Hardware-Ebene. Dies ist die theoretische Grundlage aller modernen Lock-Free-Algorithmen."
    )
)
