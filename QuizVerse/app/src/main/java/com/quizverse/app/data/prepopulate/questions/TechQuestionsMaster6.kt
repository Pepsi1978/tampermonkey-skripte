package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsMaster6(): List<Question> = listOf(
    // 1
    Question(
        categoryId = 7,
        questionText = "Was ist der Hauptunterschied zwischen kostenbasierter (CBO) und regelbasierter Optimierung (RBO) in Datenbankabfrage-Optimierern?",
        answerA = "CBO wählt Ausführungspläne basierend auf Statistiken über Datenverteilung, während RBO feste Heuristiken anwendet",
        answerB = "RBO ist schneller, weil er keine Statistiken benötigt",
        answerC = "CBO garantiert immer den optimalen Plan, RBO nicht",
        answerD = "RBO unterstützt nur SELECT-Statements, CBO auch DML",
        correctAnswer = 0,
        explanation = "Kostenbasierte Optimierer (CBO) nutzen Statistiken wie Zeilenzahlen, Histogramme und Distinct-Value-Schätzungen um Ausführungskosten verschiedener Pläne zu vergleichen. Regelbasierte Optimierer (RBO) folgen festen Prioritätslisten (z.B. 'Index-Scan immer besser als Table-Scan'). CBO ist flexibler, aber abhängig von aktuellen Statistiken — veraltete Stats führen zu schlechten Plänen.",
        difficulty = 5,
        funFact = "Oracle RBO wurde mit Version 10g offiziell abgekündigt, aber viele Legacy-Systeme nutzten ihn noch jahrelang weiter."
    ),
    // 2
    Question(
        categoryId = 7,
        questionText = "Welche Technik verwendet ein Query-Optimizer um die optimale Join-Reihenfolge bei N Tabellen zu finden?",
        answerA = "Immer erschöpfende Suche über alle N! möglichen Reihenfolgen",
        answerB = "Greedy-Algorithmus basierend auf der kleinsten Zwischenergebnismenge",
        answerC = "Dynamische Programmierung nach dem Selinger-Algorithmus (System R)",
        answerD = "Zufällige Stichprobenauswahl mit Monte-Carlo-Simulation",
        correctAnswer = 2,
        explanation = "Der Selinger-Algorithmus aus System R (1979) verwendet dynamische Programmierung: Er berechnet optimale Teilpläne für alle Teilmengen der Join-Tabellen und kombiniert sie bottom-up. Dies reduziert die Komplexität von O(N!) auf O(2^N), was bei typischen 5-10 Tabellen praktikabel ist. Bei sehr vielen Tabellen (>10) werden Heuristiken wie Left-Deep-Tree-Beschränkungen eingesetzt.",
        difficulty = 5,
        funFact = "Das Paper 'Access Path Selection in a Relational Database Management System' von Selinger et al. (1979) gilt als eines der einflussreichsten Datenbank-Paper aller Zeiten."
    ),
    // 3
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter Kardinalitätsschätzung (Cardinality Estimation) in einem Query-Optimizer?",
        answerA = "Die Berechnung der maximalen Anzahl gleichzeitiger Datenbankverbindungen",
        answerB = "Die Schätzung der Anzahl von Zeilen, die ein Operator im Ausführungsplan produziert",
        answerC = "Die Bestimmung des Speicherbedarfs eines B-Tree-Indexes",
        answerD = "Die Anzahl der Partitionen in einer partitionierten Tabelle",
        correctAnswer = 1,
        explanation = "Kardinalitätsschätzung ist die kritischste Aufgabe im CBO: Für jeden Operator (Scan, Join, Aggregat) muss geschätzt werden, wie viele Zeilen er ausgibt. Falsche Schätzungen führen zu falschen Kostenschätzungen und damit zu suboptimalen Plänen. Moderne DBs nutzen dafür Histogramme, Most-Common-Values-Listen und sampling-basierte Schätzungen.",
        difficulty = 5,
        funFact = "Forschungen zeigen, dass Kardinalitätsfehler im schlimmsten Fall exponentiell mit der Anzahl der Joins wachsen — ein bekanntes 'Kardinalitätsproblem' das alle relationalen DBs betrifft."
    ),
    // 4
    Question(
        categoryId = 7,
        questionText = "Welche Compaction-Strategie in LSM-Trees minimiert die Lese-Amplifikation am stärksten?",
        answerA = "Tiered Compaction (STCS in Cassandra)",
        answerB = "FIFO Compaction",
        answerC = "Leveled Compaction (LCS in Cassandra / RocksDB standard)",
        answerD = "Size-Tiered Compaction",
        correctAnswer = 2,
        explanation = "Leveled Compaction hält pro Level genau eine sortierte, nicht-überlappende SSTable. Reads müssen damit maximal L+1 SSTables prüfen (einen pro Level), was die Lese-Amplifikation auf O(L) begrenzt. Tiered/Size-Tiered Compaction hat schlechtere Lese-Amplifikation (viele überlappende SSTables), aber bessere Schreib-Amplifikation. Der Trade-off: Leveled schreibt mehr, liest weniger.",
        difficulty = 5,
        funFact = "RocksDB (Meta/Facebook) nutzt standardmäßig Leveled Compaction und ist die Storage-Engine hinter MyRocks (MySQL), CockroachDB und vielen anderen Systemen."
    ),
    // 5
    Question(
        categoryId = 7,
        questionText = "Was ist Write Amplification in LSM-Trees und welcher Faktor treibt sie hauptsächlich?",
        answerA = "Die Anzahl der WAL-Log-Einträge pro Transaktion",
        answerB = "Die Anzahl der Bloom-Filter-Bits pro Schlüssel; mehr Bits = mehr Schreiboperationen",
        answerC = "Der Overhead durch Checksummen-Berechnung bei SSTable-Erstellung",
        answerD = "Das Verhältnis tatsächlich auf Disk geschriebener Bytes zu den vom Client geschriebenen Bytes; verursacht durch Compaction",
        correctAnswer = 3,
        explanation = "Write Amplification (WA) = Bytes auf Disk / Bytes vom Client. In LSM-Trees werden Daten mehrfach umgeschrieben: Erst im Memtable, dann beim Flush als L0-SSTable, dann bei jeder Compaction. Bei Leveled Compaction kann WA 10-30x betragen. Bei Size-Tiered ist WA geringer (~10x), aber Reads leiden. WA-Minimierung ist kritisch für SSD-Lebensdauer.",
        difficulty = 5,
        funFact = "Google Bigtable, Apache Cassandra, LevelDB, RocksDB und ScyllaDB basieren alle auf LSM-Trees — ursprünglich 1996 von O'Neil et al. beschrieben."
    ),
    // 6
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert ein Bloom Filter in LSM-basierten Datenbanken und welchen Fehlertyp kann er produzieren?",
        answerA = "Er produziert beide Fehlertypen mit gleicher Wahrscheinlichkeit",
        answerB = "Er ist fehlerfrei, aber benötigt mehr Speicher als ein Hash-Index",
        answerC = "Er produziert ausschließlich False Positives — er sagt, ein Key könnte existieren, obwohl er nicht existiert",
        answerD = "Er produziert ausschließlich False Negatives — er sagt, ein Key existiert nicht, obwohl er doch existiert",
        correctAnswer = 2,
        explanation = "Ein Bloom Filter ist eine probabilistische Datenstruktur. Wenn er 'nicht vorhanden' antwortet, ist der Key garantiert nicht in der SSTable (kein False Negative). Wenn er 'möglicherweise vorhanden' antwortet, kann er falsch liegen (False Positive). LSM-Trees nutzen Bloom Filter um unnötige Disk-Reads zu vermeiden: Nur wenn der Filter 'möglicherweise vorhanden' sagt, wird die SSTable gelesen.",
        difficulty = 5,
        funFact = "Die False-Positive-Rate eines Bloom Filters kann mit k Hash-Funktionen und m Bits für n Elemente auf (1-e^(-kn/m))^k berechnet werden. Mit 10 Bits pro Element erreicht man ~1% FPR."
    ),
    // 7
    Question(
        categoryId = 7,
        questionText = "Was unterscheidet einen B+Tree von einem klassischen B-Tree in Datenbankindizes?",
        answerA = "B+Trees unterstützen keine Range-Queries, B-Trees schon",
        answerB = "B+Trees haben variable Knotengröße, B-Trees feste Knotengröße",
        answerC = "B+Trees erlauben nur Integer-Schlüssel, B-Trees beliebige Datentypen",
        answerD = "Im B+Tree speichern innere Knoten nur Schlüssel als Wegweiser; alle Datensätze befinden sich in den Blattknoten, die zusätzlich als verkettete Liste verbunden sind",
        correctAnswer = 3,
        explanation = "Im B+Tree enthält jeder innere Knoten nur Schlüssel zur Navigation (keine Daten). Alle tatsächlichen Datensätze stehen in den Blattknoten, die per Doppelt-verketterter-Liste verbunden sind. Vorteile: Range-Scans sind effizient (nur Blattebene traversieren), innere Knoten passen besser in Cache/Page (höherer Branching Factor). Nahezu alle modernen RDBMS (MySQL InnoDB, PostgreSQL, Oracle) nutzen B+Trees.",
        difficulty = 5,
        funFact = "Der Name 'B-Tree' steht für 'Balanced Tree', NICHT für 'Binary Tree'. Rudolf Bayer und Edward McCreight entwickelten ihn 1972 bei Boeing Scientific Research Labs."
    ),
    // 8
    Question(
        categoryId = 7,
        questionText = "Was ist ein Bε-Tree (Be-Tree) und welchen Vorteil bietet er gegenüber dem B+Tree?",
        answerA = "Er komprimiert Blattknoten mit epsilon-Kodierung für weniger Speicherverbrauch",
        answerB = "Er ist ein binärer Baum mit epsilon-Fehlertoleranz bei Sortierung",
        answerC = "Er verwendet Bloom Filter in jedem Knoten zur schnelleren Suche",
        answerD = "Innere Knoten puffern pending Einfügungen als 'Message Buffers', was die I/O-Effizienz bei Writes drastisch verbessert",
        correctAnswer = 3,
        explanation = "Im Bε-Tree (Brodal & Fagerberg, 2003) enthalten innere Knoten einen 'Message Buffer' der Writes zwischenspeichert. Erst wenn ein Buffer voll ist, werden die Nachrichten zum nächsten Level propagiert ('Flush'). Dies amortisiert I/O-Kosten: Statt O(log_B N) I/Os pro Insert erreicht man O(log_B N / B^(1-ε)) — deutlich weniger Writes. BetrFS nutzt Bε-Trees und erreicht bei Schreiblast 10-100x bessere Performance als ext4.",
        difficulty = 5,
        funFact = "TokuDB (MySQL Storage Engine) basiert auf Fractal Tree Indexes — einer kommerziellen Implementierung ähnlich dem Bε-Tree-Konzept, entwickelt von Tokutek."
    ),
    // 9
    Question(
        categoryId = 7,
        questionText = "Welche Bedingung muss laut Raft-Algorithmus erfüllt sein, damit ein Kandidat zum Leader gewählt wird?",
        answerA = "Er muss die längste Log-Historie unter allen Kandidaten haben",
        answerB = "Er muss von ALLEN Servern im Cluster eine Stimme erhalten",
        answerC = "Er muss den höchsten Term-Zähler im Cluster besitzen",
        answerD = "Er muss eine Mehrheit (Quorum) der Server überzeugen, dass sein Log mindestens so aktuell ist wie deren eigener Log",
        correctAnswer = 3,
        explanation = "Raft Leader Election: Ein Kandidat sendet RequestVote RPCs mit seiner aktuellen Term und seinem letzten Log-Eintrag (LastLogIndex, LastLogTerm). Ein Server stimmt nur ab, wenn (a) der Kandidat-Term >= seine eigene Term und (b) der Kandidat-Log mindestens so aktuell ist (Log Completeness Property). Mit Quorum (N/2+1 Stimmen) wird er Leader. Dies garantiert, dass nur Server mit committed Einträgen Leader werden.",
        difficulty = 5,
        funFact = "Raft wurde explizit als 'leicht verständliche Alternative zu Paxos' entwickelt. Diego Ongaro's Dissertation (2014) titelt buchstäblich: 'In Search of an Understandable Consensus Algorithm'."
    ),
    // 10
    Question(
        categoryId = 7,
        questionText = "Was garantiert Rafts 'Log Matching Property'?",
        answerA = "Dass alle Logs dieselbe Länge haben",
        answerB = "Dass keine zwei Leader gleichzeitig im gleichen Term existieren können",
        answerC = "Wenn zwei Logs an einem Index denselben Term haben, sind alle vorherigen Einträge in beiden Logs identisch",
        answerD = "Dass committed Einträge nie aus dem Log entfernt werden",
        correctAnswer = 2,
        explanation = "Log Matching Property: Wenn log[i].term == log[j].term für zwei Server, dann sind log[1..i] == log[1..j] identisch. Dies wird durch AppendEntries-Konsistenzprüfung erzwungen: Der Leader sendet immer prevLogIndex und prevLogTerm. Follower lehnen ab, wenn ihr eigener Eintrag an diesem Index einen anderen Term hat, und der Leader sendet dann ältere Einträge nach ('Rollback'). Dies ermöglicht effiziente Log-Konsistenzprüfung ohne vollständigen Log-Vergleich.",
        difficulty = 5,
        funFact = "Raft teilt das Konsens-Problem in drei relativ unabhängige Unterprobleme: Leader Election, Log Replication und Safety — was die formale Verifikation erheblich vereinfacht."
    ),
    // 11
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem Lamport-Timestamp und einem Vektor-Uhr?",
        answerA = "Vektoruhren sind nur auf 2 Knoten skalierbar, Lamport-Timestamps auf beliebig viele",
        answerB = "Lamport-Timestamps sind physikalische Uhrzeiten, Vektoruhren sind logische Zähler",
        answerC = "Lamport-Timestamps sind für Multicast-Nachrichten, Vektoruhren für Punkt-zu-Punkt-Kommunikation",
        answerD = "Lamport-Timestamps ermitteln nur eine partielle Ordnung ohne Kausalitätserkennung; Vektoruhren können exakt bestimmen, ob zwei Ereignisse kausal zusammenhängen oder nebenläufig sind",
        correctAnswer = 3,
        explanation = "Lamport-Timestamps garantieren: wenn a→b (a vor b), dann L(a)<L(b). Aber die Umkehrung gilt nicht: L(a)<L(b) bedeutet nicht notwendigerweise a→b. Damit können nebenläufige Ereignisse nicht von kausal geordneten unterschieden werden. Vektoruhren (Fidge/Mattern, 1988) lösen dies: V(a)<V(b) gdw. a→b, V(a) ⊥ V(b) wenn nebenläufig. Preis: O(N) Speicher pro Ereignis statt O(1).",
        difficulty = 5,
        funFact = "Leslie Lamport erhielt den Turing Award 2013 — unter anderem für Lamport-Timestamps und das Paxos-Konsensalgorithmus, den er in einem Paper von 1998 beschrieb."
    ),
    // 12
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert ein G-Counter CRDT (Grow-only Counter) in einem verteilten System?",
        answerA = "Jeder Knoten hält einen globalen Zähler, der per Broadcast synchronisiert wird",
        answerB = "Jeder Knoten hat einen eigenen Zählerwert; der Gesamtwert ist die Summe aller Knoten-Zähler; Merge nimmt das Maximum pro Knoten",
        answerC = "Der Zähler wird nur auf dem Leader-Knoten verwaltet und per Replikation verteilt",
        answerD = "Jeder Knoten speichert alle Operationen als Log und berechnet den Wert bei Bedarf",
        correctAnswer = 1,
        explanation = "G-Counter: Jeder Knoten i hält einen Vektor P[0..N-1]. Knoten i inkrementiert nur P[i]. Der Gesamtwert = Summe(P). Merge zweier Zustände: M[i] = max(P1[i], P2[i]) für alle i. Da nur Inkremente erlaubt sind (Grow-only) und max() kommutativ, assoziativ und idempotent ist, erfüllt G-Counter alle CRDT-Eigenschaften: Convergenz ohne Koordination.",
        difficulty = 5,
        funFact = "CRDTs (Conflict-free Replicated Data Types) wurden 2011 von Shapiro et al. formalisiert. Riak, Redis Cluster und SoundCloud's Roshi nutzen CRDTs für hochverfügbare Zähler."
    ),
    // 13
    Question(
        categoryId = 7,
        questionText = "Was macht ein OR-Set CRDT besonders gegenüber einem einfachen 2P-Set?",
        answerA = "OR-Set ist ein Read-only Datentyp, 2P-Set unterstützt Schreiben",
        answerB = "OR-Set repliziert synchron, 2P-Set asynchron",
        answerC = "OR-Set erlaubt beliebige Datentypen, 2P-Set nur Integer",
        answerD = "OR-Set löst das Add-Remove-Konflikt-Problem durch eindeutige Tags: Elemente können nach dem Entfernen erneut hinzugefügt werden, ohne Konflikte",
        correctAnswer = 3,
        explanation = "Im 2P-Set (Two-Phase Set) kann ein entferntes Element nie wieder hinzugefügt werden — unpraktisch. Das OR-Set (Observed-Remove Set) löst dies mit eindeutigen Tags (UUIDs): Beim Hinzufügen von Element e wird ein eindeutiges Tag t erzeugt. Entfernen bedeutet, alle bekannten Tags von e zu löschen. Wenn gleichzeitig jemand e hinzufügt (neues Tag t'), überlebt das neue Hinzufügen den Conflict — das 'Add wins' Semantik.",
        difficulty = 5,
        funFact = "Riak DT (Data Types) implementiert OR-Sets für verteilte Sets. Basho entwickelte es für Hochverfügbarkeits-Szenarien ohne Locking."
    ),
    // 14
    Question(
        categoryId = 7,
        questionText = "Was ist ein LWW-Register (Last-Write-Wins Register) CRDT und welches Problem kann es verursachen?",
        answerA = "Ein Register, das alle konkurrierenden Werte speichert und den Nutzer zur manuellen Auflösung zwingt",
        answerB = "Ein Register mit verteiltem Locking zur Konfliktverhinderung",
        answerC = "Ein Register, das immer den letzten synchron bestätigten Schreibwert hält; kein Datenverlust möglich",
        answerD = "Ein Register, das bei Konflikten den Wert mit dem höchsten Timestamp behält; kann bei Uhren-Ungenauigkeit legitimate Writes verwerfen",
        correctAnswer = 3,
        explanation = "LWW-Register: Bei konkurrierenden Schreibzugriffen gewinnt der mit dem höchsten Timestamp. Einfach zu implementieren, aber problematisch: Wenn Clocks nicht perfekt synchronisiert sind (was in der Praxis immer gilt), können neuere Writes verloren gehen weil ihr Timestamp niedriger ist. Cassandra's LWW-Semantik ist bekannt dafür, Daten zu 'verlieren' bei Uhrzeit-Drift zwischen Nodes.",
        difficulty = 5,
        funFact = "Amazon Dynamo nutzte LWW als Default-Konfliktlösung. Jeff Bezos' berühmter Satz 'Dynamo sucks' (intern) bezog sich teilweise auf die Datenverlust-Problematik bei LWW."
    ),
    // 15
    Question(
        categoryId = 7,
        questionText = "Was unterscheidet Event Time von Processing Time im Stream Processing?",
        answerA = "Event Time benötigt GPS-Synchronisation, Processing Time nicht",
        answerB = "Event Time gilt nur für Kafka, Processing Time für Flink",
        answerC = "Event Time ist die Systemuhr des Brokers, Processing Time die Uhr der Consumer",
        answerD = "Event Time ist der Zeitpunkt, wann das Ereignis tatsächlich aufgetreten ist; Processing Time ist der Zeitpunkt, wann das System das Ereignis verarbeitet — beide können stark abweichen",
        correctAnswer = 3,
        explanation = "Event Time = Wann ist das Ereignis in der realen Welt aufgetreten (im Event-Payload). Processing Time = Wann verarbeitet das Stream-System das Ereignis. Diese können durch Netzwerkverzögerung, Batching, mobile Geräte im Offline-Modus, etc. Minuten bis Stunden auseinanderliegen. Für korrekte zeitfenster-basierte Aggregationen (z.B. 'Bestellungen pro Stunde') muss Event Time verwendet werden — sonst landen späte Events in falschen Fenstern.",
        difficulty = 5,
        funFact = "Google's Dataflow-Paper (2015) von Tyler Akidau et al. etablierte das Beam-Modell für Event-Time-Processing und löste das 'streaming vs batch'-Dilemma konzeptuell."
    ),
    // 16
    Question(
        categoryId = 7,
        questionText = "Was ist ein Watermark im Stream Processing und wie wird er berechnet?",
        answerA = "Ein Marker der den aktuellen Speicherverbrauch des Stream-Processors anzeigt",
        answerB = "Ein Zeitstempel T der signalisiert, dass alle Events mit Event Time ≤ T bereits eingetroffen sind; oft berechnet als min(Event Time) − heuristische Verzögerung",
        answerC = "Eine Checkpoint-Markierung für genau-einmal Semantik in Flink",
        answerD = "Ein Qualitätsindikator für die Zuverlässigkeit der Event Time-Schätzung",
        correctAnswer = 1,
        explanation = "Watermarks lösen das Problem: 'Wann darf ich ein Zeitfenster schließen, obwohl noch späte Events kommen könnten?' Ein Watermark W(t) besagt: Es werden keine Events mit Event Time < t mehr erwartet. Berechnung: Häufig als max(beobachtete Event Times) − maximale erwartete Verzögerung (heuristisch). Wenn Watermark W das Window-Ende überschreitet, wird das Fenster geschlossen und das Ergebnis emittiert. Späte Events danach können verworfen oder in ein Spät-Fenster geleitet werden.",
        difficulty = 5,
        funFact = "Apache Flink nutzt Watermarks nativ. Kafka Streams und Spark Structured Streaming haben ähnliche Konzepte, aber andere Implementierungen."
    ),
    // 17
    Question(
        categoryId = 7,
        questionText = "Wie implementiert Apache Flink Exactly-Once-Semantik bei Stateful Stream Processing?",
        answerA = "Durch Deduplizierung auf Basis von Message-IDs im Sink-Connector",
        answerB = "Durch synchrone Replikation aller State-Änderungen auf 3 Knoten",
        answerC = "Durch synchrone Commits nach jeder Nachricht",
        answerD = "Durch verteilte Snapshots (Chandy-Lamport-Algorithmus) kombiniert mit Two-Phase-Commit zu Sinks",
        correctAnswer = 3,
        explanation = "Flink's Checkpointing basiert auf dem Chandy-Lamport-Algorithmus: 'Barrier'-Nachrichten fließen durch den Datenstrom und triggern bei jedem Operator einen konsistenten Snapshot des lokalen State. Für externe Sinks (Kafka, Datenbanken) nutzt Flink 2PC: Sink-Konnektoren implementieren Pre-Commit (Barrier empfangen) und Commit (Checkpoint abgeschlossen). So wird genau-einmal End-to-End garantiert — auch bei Failure.",
        difficulty = 5,
        funFact = "Flink's Checkpoint-Mechanismus ist asynchron: Operatoren snapshotten ihren State im Hintergrund ohne den Datenstrom anzuhalten — ein wichtiger Vorteil gegenüber älteren Systemen."
    ),
    // 18
    Question(
        categoryId = 7,
        questionText = "Welche Rolle spielt etcd in einem Kubernetes-Cluster und welches Konsensprotokoll nutzt es?",
        answerA = "etcd ist der DNS-Server des Clusters und nutzt Gossip-Protokoll",
        answerB = "etcd ist der zentrale Key-Value-Store für den gesamten Cluster-Zustand und nutzt Raft für Hochverfügbarkeit",
        answerC = "etcd ist der Container-Runtime-Manager und nutzt Paxos",
        answerD = "etcd ist der Netzwerk-Controller und nutzt OSPF",
        correctAnswer = 1,
        explanation = "etcd ist das 'Gehirn' von Kubernetes: Alle Cluster-Zustände (Pods, Services, ConfigMaps, Secrets, etc.) werden ausschließlich in etcd gespeichert. Kubernetes ist zustandslos ohne etcd. etcd nutzt Raft für Replikation — typischerweise 3 oder 5 Mitglieder für Fehlertoleranz bei f=(N-1)/2 ausgefallenen Knoten. Der API-Server ist der einzige Kubernetes-Komponente der direkt mit etcd kommuniziert.",
        difficulty = 5,
        funFact = "etcd's Name kommt aus '/etc' (Unix-Konfigurationsverzeichnis) + 'd' für distributed. Es wurde ursprünglich von CoreOS entwickelt, jetzt unter der CNCF."
    ),
    // 19
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert der Kubernetes Scheduler bei der Pod-Platzierung?",
        answerA = "Er filtert zunächst ungeeignete Nodes (Filtering-Phase) und bewertet dann die verbleibenden nach Scoring-Funktionen (Scoring-Phase), um den optimalen Node zu wählen",
        answerB = "Er platziert Pods zufällig auf verfügbaren Nodes zur gleichmäßigen Lastverteilung",
        answerC = "Er verteilt Pods ausschließlich nach CPU-Auslastung",
        answerD = "Er delegiert die Entscheidung an den Node-Agenten (kubelet)",
        correctAnswer = 0,
        explanation = "Kubernetes Scheduling läuft in zwei Phasen: (1) Filtering: Alle Nodes die Constraints verletzen werden eliminiert (ungenügend Ressourcen, Taints/Tolerations, Node-Affinity, Pod-Anti-Affinity). (2) Scoring: Verbleibende Nodes werden nach Plugins bewertet (LeastAllocated, InterPodAffinity, ImageLocality, etc.). Der Node mit dem höchsten Score erhält den Pod. Das Framework ist erweiterbar — Custom Scheduler Plugins können eingehängt werden.",
        difficulty = 5,
        funFact = "Das Kubernetes Scheduling Framework (KEP-624) wurde in Version 1.15 eingeführt und ermöglicht Plugin-Entwicklung ohne Fork des Schedulers — ein massiver Fortschritt für Multi-Tenant-Szenarien."
    ),
    // 20
    Question(
        categoryId = 7,
        questionText = "Was ist die Aufgabe von CNI (Container Network Interface) in Kubernetes?",
        answerA = "CNI stellt verschlüsselte Secrets an Container bereit",
        answerB = "CNI verwaltet Container-Images und Registry-Authentifizierung",
        answerC = "CNI ist eine Spezifikation und Plugin-API die definiert wie Container-Netzwerke eingerichtet werden, damit Pods IP-Adressen erhalten und miteinander kommunizieren können",
        answerD = "CNI ist der Kubernetes-Ingress-Controller für externe HTTP-Traffic",
        correctAnswer = 2,
        explanation = "CNI (Container Network Interface) ist ein CNCF-Standard der definiert, wie Netzwerk-Plugins Container mit IP-Adressen versorgen und Routing einrichten. Kubernetes selbst implementiert kein Netzwerk — es delegiert an CNI-Plugins: Calico (BGP-basiert), Flannel (VXLAN-Overlay), Cilium (eBPF-basiert), Weave Net. Jeder Plugin löst das fundamentale Problem: Alle Pods müssen untereinander erreichbar sein ohne NAT.",
        difficulty = 5,
        funFact = "Cilium (CNI-Plugin) nutzt eBPF im Linux-Kernel für Netzwerk-Policy-Enforcement ohne iptables — bis zu 3x schneller als iptables-basierte Ansätze bei großen Regelmengen."
    ),
    // 21
    Question(
        categoryId = 7,
        questionText = "Was ist das Sidecar-Pattern im Service-Mesh-Kontext und warum wird es verwendet?",
        answerA = "Ein Sidecar ist ein Kubernetes-Operator der Services überwacht und neu startet",
        answerB = "Ein Sidecar ist eine Backup-Datenbank-Instanz für Lese-Lastverteilung",
        answerC = "Ein Sidecar ist ein sekundärer Kubernetes-Cluster der Failover übernimmt",
        answerD = "Ein Sidecar ist ein zusätzlicher Proxy-Container im selben Pod, der transparant alle ein- und ausgehenden Netzwerkverbindungen abfängt ohne Änderungen am Anwendungscode",
        correctAnswer = 3,
        explanation = "Im Sidecar-Pattern (Istio, Linkerd) läuft neben dem Anwendungscontainer ein Envoy/Linkerd-Proxy-Container im gleichen Pod. Beide teilen denselben Netzwerk-Namespace. Kubernetes-iptables-Regeln leiten allen Traffic zum Sidecar um. Der Sidecar implementiert: mTLS, Retries, Circuit Breaking, Tracing, Traffic-Shaping — komplett transparent ohne Änderungen an der Anwendung. Modernere Ansätze (Ambient Mesh, eBPF) vermeiden das Sidecar-Overhead.",
        difficulty = 5,
        funFact = "Der Sidecar-Container-Overhead beträgt typisch 1-5ms Latenz und 100-300MB RAM pro Pod — bei 1000 Pods ein nicht-trivialer Kostenfaktor der zur Ambient-Mesh-Alternative geführt hat."
    ),
    // 22
    Question(
        categoryId = 7,
        questionText = "Was ist mTLS (Mutual TLS) und warum ist es für Service Meshes wichtig?",
        answerA = "mTLS verschlüsselt Traffic ohne Authentifizierung für minimalen Overhead",
        answerB = "mTLS ist TLS mit mehreren (multi) Zertifikatsketten für mehr Sicherheit",
        answerC = "Bei mTLS authentifizieren sich BEIDE Seiten gegenseitig mit Zertifikaten — Server und Client verifizieren die Identität des anderen — was Zero-Trust-Kommunikation zwischen Services ermöglicht",
        answerD = "mTLS ist eine Kubernetes-spezifische TLS-Variante die UDP unterstützt",
        correctAnswer = 2,
        explanation = "Bei normalem TLS authentifiziert nur der Server sich gegenüber dem Client. Bei mTLS (Mutual TLS) muss auch der Client ein gültiges Zertifikat vorlegen. In Service Meshes bedeutet dies: Jeder Pod hat ein SPIFFE-konformes Zertifikat (Service Identity). Istio's CA (Citadel) stellt diese aus. Damit kann jeder Service prüfen: 'Darf Payment-Service wirklich mit Order-Service kommunizieren?' — ohne IP-basierte Netzwerk-Policies.",
        difficulty = 5,
        funFact = "SPIFFE (Secure Production Identity Framework for Everyone) und SPIRE sind CNCF-Standards für Service-Identitäten — die Basis für mTLS in Cloud-nativen Umgebungen."
    ),
    // 23
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Cold Start' bei Serverless-Funktionen und welche Techniken reduzieren ihn?",
        answerA = "Die Zeit bis eine Funktion nach einem Fehler neugestartet wird",
        answerB = "Das Starten eines neuen Kubernetes-Clusters für eine Serverless-Funktion",
        answerC = "Die Latenz beim ersten Aufruf einer inaktiven Funktion durch Container-Start, Runtime-Initialisierung und Code-Load; reduziert durch Provisioned Concurrency, SnapStart oder Minimal-Runtimes",
        answerD = "Der erste Compile-Vorgang des Funktionscodes nach einem Deployment",
        correctAnswer = 2,
        explanation = "Cold Start tritt auf wenn keine 'warme' Funktionsinstanz existiert: Cloud-Provider muss Container-Image pullen, Runtime (JVM, Node.js, etc.) initialisieren und Funktionscode laden. Für Java kann das >1s dauern. Gegenmaßnahmen: AWS Provisioned Concurrency (warme Instanzen vorhalten), AWS Lambda SnapStart (JVM-Snapshot nach Init-Phase), GraalVM Native Image (sofortiger Start), schlanke Runtimes (Go, Rust), Ping-Warmhalten (Anti-Pattern).",
        difficulty = 5,
        funFact = "AWS Lambda SnapStart (für Java) friert den JVM-Zustand nach dem Init-Handler ein und klont diesen Snapshot bei Bedarf — ähnlich wie VM-Snapshots, reduziert Cold Start von 3-5s auf ~300ms."
    ),
    // 24
    Question(
        categoryId = 7,
        questionText = "Was ist Provisioned Concurrency bei AWS Lambda und welchen Trade-off bringt sie mit sich?",
        answerA = "Eine Reservierung von CPU-Cores für rechenintensive Funktionen",
        answerB = "Eine Vorinitialisierung einer festen Anzahl von Funktions-Instanzen im 'warmen' Zustand; eliminiert Cold Start aber verursacht Kosten auch ohne Aufrufe",
        answerC = "Eine Garantie, dass maximal N Funktions-Instanzen gleichzeitig laufen dürfen",
        answerD = "Eine Priorisierung bestimmter Funktionsaufrufe über andere",
        correctAnswer = 1,
        explanation = "Mit Provisioned Concurrency reserviert man N immer-warme Lambda-Instanzen. Diese sind sofort bereit und haben keinen Cold Start. Kosten: Man zahlt für Provisioned Concurrency konstant — auch wenn die Funktion gerade nicht aufgerufen wird (im Gegensatz zu normalem Lambda wo nur pro Aufruf gezahlt wird). Sinnvoll für latenz-sensitive APIs. Application Auto Scaling kann Provisioned Concurrency dynamisch anpassen.",
        difficulty = 5,
        funFact = "Provisioned Concurrency ist im Prinzip das Gleiche wie traditionelle 'Servers bereitstehen lassen' — nur dass man es dynamisch skalieren und nur nach Bedarf aktivieren kann."
    ),
    // 25
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert Gorilla-Kompression für Zeitreihendaten in TSDB-Systemen?",
        answerA = "Es komprimiert Timestamp und Value separat: Timestamps als Delta-of-Deltas, Float-Werte als XOR mit dem vorherigen Wert",
        answerB = "Es nutzt GZIP auf ganzen Datenbankblöcken",
        answerC = "Es rundet alle Float-Werte auf 2 Dezimalstellen für kleinere Datenmenge",
        answerD = "Es speichert nur Differenzen zu einem Baseline-Wert in Integer-Format",
        correctAnswer = 0,
        explanation = "Facebook's Gorilla TSDB (2015) nutzt zwei Kompressions-Tricks: (1) Timestamps: Delta-of-Deltas kodieren — wenn Abstand zwischen Timestamps regelmäßig ist (z.B. alle 60s), wird der Unterschied der Unterschiede fast immer 0 und benötigt nur 1 Bit. (2) Float-Werte: XOR mit dem vorherigen Float-Wert — wenn Werte sich wenig ändern, sind viele Leading/Trailing Zeros, was effizient mit Variable-Length-Encoding kodiert werden kann. Gesamtergebnis: ~1.37 Bytes pro Datenpunkt statt 16 Bytes.",
        difficulty = 5,
        funFact = "Gorilla komprimiert Zeitreihendaten auf ~1.37 Bytes/Datenpunkt. Prometheus nutzt eine Variation davon. InfluxDB, TimescaleDB und VictoriaMetrics haben eigene Varianten dieser Kompressionstechnik."
    ),
    // 26
    Question(
        categoryId = 7,
        questionText = "Was ist Downsampling in Time-Series-Datenbanken und welche Retention-Policy-Strategie ist üblich?",
        answerA = "Das Herunterskalieren der Datenbankinstanz bei geringer Last",
        answerB = "Das Reduzieren der Schreibrate zur Entlastung des Schreib-Pfads",
        answerC = "Das Löschen von Ausreißer-Datenpunkten zur Datenbereingung",
        answerD = "Das Aggregieren hochfrequenter Datenpunkte zu niedrigauflösenden Zusammenfassungen für ältere Zeiträume, kombiniert mit Retention Policies die rohe Daten nach definierten Zeiträumen löschen",
        correctAnswer = 3,
        explanation = "Typische Strategie: Rohdaten (z.B. 10-Sekunden-Intervall) werden 7 Tage behalten. Nach 7 Tagen: Downsampling auf 1-Minuten-Aggregate (mean, max, min). Diese werden 30 Tage gehalten. Nach 30 Tagen: 1-Stunden-Aggregate für 1 Jahr. Implementierung: InfluxDB Continuous Queries, Prometheus Recording Rules, TimescaleDB Continuous Aggregates. Trade-off: Ältere Daten haben weniger Auflösung, aber der Speicherbedarf bleibt konstant.",
        difficulty = 5,
        funFact = "RRDtool (Round-Robin Database) von Tobias Oetiker (1999) war der Pionier des Downsampling-Konzepts — ursprünglich für MRTG-Netzwerkgraphen entwickelt."
    ),
    // 27
    Question(
        categoryId = 7,
        questionText = "Was beschreibt das Property-Graph-Modell in Graph-Datenbanken?",
        answerA = "Ein RDF-basiertes Tripel-Modell mit Property-Chains",
        answerB = "Ein Graphmodell wo Knoten und Kanten beliebige Key-Value-Eigenschaften (Properties) und Labels tragen können, was reichhaltige domänenspezifische Datenmodellierung ermöglicht",
        answerC = "Ein Modell wo Knoten nur primitive Werte als Properties haben dürfen",
        answerD = "Ein Graphmodell ausschließlich für Eigenschaftsrechte in juristischen Datenbanken",
        correctAnswer = 1,
        explanation = "Im Property-Graph-Modell (Neo4j, TigerGraph, Amazon Neptune): Knoten haben Labels (z.B. :Person, :Movie) und Properties ({name: 'Alice', age: 30}). Kanten haben Typen (ACTED_IN, FRIENDS_WITH) und ebenfalls Properties ({since: 2020, role: 'Lead'}). Dies ermöglicht reich strukturierte Daten direkt am Graph. Alternative: RDF/Triple-Store-Modell (Subjekt-Prädikat-Objekt) ist standardisierter, aber weniger flexibel für Properties.",
        difficulty = 5,
        funFact = "Das Property-Graph-Modell wurde nicht standardisiert bis GQL (Graph Query Language) 2024 als ISO-Standard verabschiedet wurde — Jahrzehnte nach relationalen Standards."
    ),
    // 28
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen Cypher (Neo4j) und SPARQL (RDF-Stores) als Graph-Abfragesprachen?",
        answerA = "SPARQL kann keine Aggregationen, Cypher schon",
        answerB = "Cypher ist nur für gerichtete Graphen, SPARQL nur für ungerichtete",
        answerC = "Cypher verwendet ASCII-Art-Muster für Property-Graphs (MATCH (a)-[:REL]->(b)); SPARQL verwendet Tripel-Muster für RDF-Daten (Subject Predicate Object) und unterstützt Reasoning über Ontologien",
        answerD = "Cypher ist prozedural, SPARQL deklarativ",
        correctAnswer = 2,
        explanation = "Cypher (Neo4j) nutzt ASCII-Art-Syntax: MATCH (p:Person)-[:ACTED_IN]->(m:Movie) WHERE m.year > 2000 RETURN p.name. Intuitiv für Property-Graphs. SPARQL (W3C-Standard für RDF): SELECT ?name WHERE { ?p rdf:type :Person . ?p :actedIn ?m . ?m :year ?y . FILTER(?y > 2000) . ?p :name ?name } — verbosier, aber mit RDFS/OWL-Reasoning (Inferenz über Klassen-Hierarchien). RDF eignet sich besser für Wissensrepräsentation und Semantic Web.",
        difficulty = 5,
        funFact = "OpenCypher (offene Spezifikation von Neo4j) und GQL (ISO-Standard 2024) konvergieren langsam — ähnlich wie SQL verschiedene Dialekte hatte bevor ANSI SQL kam."
    ),
    // 29
    Question(
        categoryId = 7,
        questionText = "Was ist die Delta Lake Table Format-Garantie 'ACID auf Object Storage' und wie wird sie implementiert?",
        answerA = "Durch exklusive File-Locks auf Parquet-Dateien im Objektspeicher",
        answerB = "Durch Hardware-RAID auf S3-kompatiblen Objektspeichern",
        answerC = "Durch synchrone Replikation aller Schreiboperationen auf 3 S3-Regionen",
        answerD = "Durch ein Transaction Log (_delta_log) das alle Operationen als Folge von JSON-Commit-Dateien aufzeichnet; optimistisches Concurrency-Control verhindert Konflikte",
        correctAnswer = 3,
        explanation = "Delta Lake speichert alle Tabellenoperationen im '_delta_log/' Verzeichnis als sequenzielle JSON-Dateien (0000.json, 0001.json, ...). Jeder Commit enthält Add/Remove-Aktionen für Parquet-Dateien. Atomarität: Ein Commit ist entweder vollständig sichtbar oder nicht. Optimistisches Locking: Wenn zwei Writer gleichzeitig committen, gewinnt einer; der andere muss seinen Commit basierend auf dem neuen Zustand wiederholen. Kein Locking auf Dateiebene nötig.",
        difficulty = 5,
        funFact = "Apache Iceberg und Apache Hudi sind Alternativen zu Delta Lake — alle drei implementieren ACID auf Object Storage. Die 'Table Format Wars' sind ein heißes Thema in der Data-Engineering-Community."
    ),
    // 30
    Question(
        categoryId = 7,
        questionText = "Was unterscheidet Apache Iceberg von Delta Lake im Table-Format-Vergleich?",
        answerA = "Iceberg unterstützt nur Hadoop, Delta Lake nur S3",
        answerB = "Iceberg nutzt einen zentralen Catalog mit Snapshot-Isolation und unterstützt Hidden Partitioning; Delta Lake ist stärker auf Spark optimiert und hat einfacheres Transaction-Log-Design",
        answerC = "Iceberg ist nur für Python-basierte Workloads, Delta Lake für JVM-Sprachen",
        answerD = "Delta Lake kann keine Schema-Evolution, Iceberg schon",
        correctAnswer = 1,
        explanation = "Iceberg: Manifest-Files (Metadaten über Parquet-Dateien) → Manifest-Lists (Snapshot) → Metadata-Files. Hidden Partitioning: Nutzer definieren Partitions-Transformationen (z.B. month(event_time)), keine Partitions-Spalten in Queries nötig. Unterstützt mehrere Engines (Spark, Flink, Hive, Trino). Delta Lake: Einfacheres Log-Design, tiefere Spark-Integration (Z-Ordering, Liquid Clustering). Snowflake-Iceberg-Integration und Databricks-Delta-Lake zeigen die Lager-Aufteilung.",
        difficulty = 5,
        funFact = "Netflix hat Apache Iceberg entwickelt um Hive-Partitioning-Limitierungen zu überwinden — insbesondere das Problem, dass Hive-Metastore bei Millionen von Partitionen versagt."
    ),
    // 31
    Question(
        categoryId = 7,
        questionText = "Was ist das Saga-Muster für verteilte Transaktionen und welche zwei Varianten gibt es?",
        answerA = "Saga ist ein CRDT-basiertes Transaktionsmodell für eventual consistency",
        answerB = "Saga ist ein 2PC-Optimierung die Coordinator-Ausfälle toleriert",
        answerC = "Saga zerlegt eine verteilte Transaktion in lokale Transaktionen mit Kompensations-Transaktionen; Varianten: Choreographie (Events) und Orchestrierung (zentraler Coordinator)",
        answerD = "Saga repliziert Transaktions-Logs zwischen Services für Konsistenz",
        correctAnswer = 2,
        explanation = "Saga (Hector Garcia-Molina, 1987): Statt einer ACID-Transaktion über Services, führt jeder Service seine lokale Transaktion aus und publiziert ein Event. Bei Fehler: Kompensations-Transaktionen machen vorherige Schritte rückgängig (z.B. 'Zahlung erstatten'). Choreographie: Services reagieren auf Events der anderen — dezentral, schwer zu debuggen. Orchestrierung: Ein zentraler Saga-Orchestrator steuert die Abfolge explizit — einfacher zu monitoren, aber Single Point of Complexity.",
        difficulty = 5,
        funFact = "AWS Step Functions und Netflix Conductor sind populäre Saga-Orchestration-Engines. Chris Richardson's 'Microservices Patterns' Buch enthält das definitiv Referenzkapitel zu Sagas."
    ),
    // 32
    Question(
        categoryId = 7,
        questionText = "Welches fundamentale Problem macht Two-Phase Commit (2PC) in Microservices-Architekturen problematisch?",
        answerA = "2PC unterstützt keine polyglotten Datenbanken (nur SQL)",
        answerB = "2PC erfordert einen Coordinator der bei einem Absturz nach Phase 1 alle Teilnehmer blockiert bis er wieder verfügbar ist — das 'Blocking Problem' macht 2PC bei Ausfällen unverfügbar",
        answerC = "2PC verursacht Deadlocks bei mehr als 10 gleichzeitigen Transaktionen",
        answerD = "2PC ist auf maximal 2 Teilnehmer beschränkt",
        correctAnswer = 1,
        explanation = "2PC Blocking Problem: Phase 1 (Prepare): Coordinator fragt alle Teilnehmer 'Bist du bereit?'. Alle antworten 'Yes'. Coordinator stürzt ab nach Phase 1. Teilnehmer sind nun blockiert: Sie haben ihre Ressourcen gesperrt und wissen nicht ob sie committen oder abbrechen sollen — der Coordinator ist der einzige der es weiß. Bis Coordinator zurückkommt sind alle Locks gehalten. 3PC versucht dies zu lösen, hat aber andere Probleme bei Netzwerkpartitionen.",
        difficulty = 5,
        funFact = "Google Spanner löst das 2PC-Problem durch Paxos-Replikation des Coordinators selbst — wenn ein Coordinator-Knoten ausfällt, übernimmt ein anderer aus der Paxos-Gruppe den Koordinationszustand."
    ),
    // 33
    Question(
        categoryId = 7,
        questionText = "Was besagt das PACELC-Theorem als Erweiterung des CAP-Theorems?",
        answerA = "PACELC beweist dass CAP falsch ist und alle drei Eigenschaften gleichzeitig erreichbar sind",
        answerB = "PACELC ist ein CAP-Nachfolger der Eventual Consistency mathematisch formalisiert",
        answerC = "PACELC besagt dass Partitionstoleranz, Verfügbarkeit, Konsistenz, Effizienz, Latenz und Costs die 6 Dimensionen eines verteilten Systems sind",
        answerD = "PACELC erweitert CAP: Bei Partition (P) wählt man zwischen Availability (A) und Consistency (C); ohne Partition muss man zwischen Latency (L) und Consistency (C) abwägen — Else (E)",
        correctAnswer = 3,
        explanation = "PACELC (Daniel Abadi, 2012): CAP beschreibt nur Verhalten bei Netzwerkpartitionen — aber die meiste Zeit gibt es keine Partition! Im Normalbetrieb (Else) muss man wählen: Niedrige Latenz (keine Synchronisation) vs. starke Konsistenz (synchrone Replikation). Beispiele: DynamoDB (PA/EL: high availability + low latency), BigTable/HBase (PC/EC: strong consistency), Cassandra (PA/EL per default, tunable), Spanner (PC/EC: global strong consistency mit höherer Latenz).",
        difficulty = 5,
        funFact = "Abadis PACELC-Paper argumentiert dass 'Tunable Consistency' (wie in Cassandra) eigentlich immer einen Latenz-Konsistenz-Trade-off im Normalbetrieb macht — nicht nur bei Partitionen."
    ),
    // 34
    Question(
        categoryId = 7,
        questionText = "Was ist 'Tunable Consistency' in Cassandra und welche Parameter steuern sie?",
        answerA = "Die automatische Auswahl zwischen Strong und Eventual Consistency durch den Coordinator",
        answerB = "Ein Admin-Setting das die gesamte Datenbank zwischen 'fast' und 'safe' umschaltet",
        answerC = "Pro-Query-Einstellungen für Read-Consistency-Level (z.B. QUORUM) und Write-Consistency-Level; starke Konsistenz wenn Read-CL + Write-CL > Replication-Factor",
        answerD = "Ein Kafka-basiertes Replikations-Layer das Konsistenz nachträglich herstellt",
        correctAnswer = 2,
        explanation = "Cassandra erlaubt pro Query: CL=ONE (schnell, liest von 1 Replica), CL=QUORUM (liest/schreibt von RF/2+1 Replicas), CL=ALL (alle Replicas, langsamste). Formel: R + W > RF garantiert starke Konsistenz (z.B. RF=3, W=QUORUM=2, R=QUORUM=2: 2+2>3). Mit W=ONE, R=ONE: schnell, aber eventual consistent. Jede Anwendung kann pro Operation entscheiden — ein großer Vorteil gegenüber 'alles oder nichts'.",
        difficulty = 5,
        funFact = "Amazons Dynamo-Paper (2007) beschrieb erstmals tunable consistency mit R+W>N als Formel. Cassandra (von Facebook-Ingenieuren entwickelt, darunter Dynamo-Mitautor Avinash Lakshman) übernahm dieses Konzept direkt."
    ),
    // 35
    Question(
        categoryId = 7,
        questionText = "Was beschreibt die 'False Positive Rate' eines Bloom Filters und wie hängt sie mit der Größe zusammen?",
        answerA = "Die Fehlerrate des Hash-Algorithmus bei kryptographischer Kollision",
        answerB = "Die Rate mit der der Filter falsch 'nicht vorhanden' antwortet bei vollen Arrays",
        answerC = "Die Wahrscheinlichkeit eines Hash-Kollision im internen Array; unabhängig von der Größe",
        answerD = "Die Wahrscheinlichkeit dass der Filter 'Element vorhanden' sagt obwohl es nicht da ist; sinkt exponentiell mit mehr Bits pro Element (m/n Ratio)",
        correctAnswer = 3,
        explanation = "FPR ≈ (1 - e^(-kn/m))^k wobei k=Anzahl Hash-Funktionen, n=eingefügte Elemente, m=Array-Bits. Optimale k = (m/n) * ln(2). Mit 10 Bits/Element: FPR ≈ 0.8%, mit 20 Bits/Element: FPR ≈ 0.004%. Halbierung der FPR kostet ~1.44 zusätzliche Bits/Element. Bloom Filter können keine False Negatives produzieren (garantierte Korrektheit in eine Richtung) — ein fundamentales mathematisches Resultat.",
        difficulty = 5,
        funFact = "Burton H. Bloom erfand den Filter 1970 ursprünglich für ein Silbentrennungs-Problem (Hyphenation): Er wollte vermeiden, bei jedem Wort auf Disk nachzuschlagen ob spezielle Trennregeln gelten. Spell-Checker wurden eine der bekanntesten späteren Anwendungen."
    ),
    // 36
    Question(
        categoryId = 7,
        questionText = "Wie implementiert RocksDB 'Column Families' und welchen Vorteil bieten sie?",
        answerA = "Column Families sind separate LSM-Tree-Instanzen mit eigenen Memtables, SSTables und Compaction-Policies, die denselben WAL teilen — ermöglicht unterschiedliche Konfigurationen pro Datenkategorie",
        answerB = "Column Families sind Cassandra-kompatible Wide-Row-Strukturen in RocksDB",
        answerC = "Column Families gruppieren Schlüssel nach dem ersten Byte für schnellere Prefix-Suche",
        answerD = "Column Families sind SQL-ähnliche Spalten-Gruppierungen für analytische Queries",
        correctAnswer = 0,
        explanation = "RocksDB Column Families: Jede CF hat eigenen Memtable, SSTable-Set und Compaction-Strategie, teilt aber WAL und Background-Threads mit anderen CFs. Vorteil: 'Metadaten' CF kann Leveled Compaction nutzen (read-optimiert), 'User-Data' CF kann Size-Tiered nutzen (write-optimiert). Atomare Schreiboperationen über mehrere CFs möglich (WriteBatch). TiKV (Distributed Key-Value von PingCAP) nutzt RocksDB Column Families intensiv.",
        difficulty = 5,
        funFact = "CockroachDB, TiDB, YugabyteDB und Couchbase nutzen alle RocksDB als Storage Engine — ein Beispiel wie eine gute untere Schicht ganze Ökosysteme prägt."
    ),
    // 37
    Question(
        categoryId = 7,
        questionText = "Was ist ein PageRank-ähnlicher Graph-Algorithmus und wie wird er in verteilten Graph-Datenbanken ausgeführt?",
        answerA = "PageRank ist ein Transaktions-Protokoll für Graph-Datenbanken",
        answerB = "PageRank ist ein Sharding-Algorithmus für Graph-Partitionierung",
        answerC = "PageRank berechnet iterativ Knotengewichte als gewichtete Summe eingehender Nachbar-Gewichte; in verteilten Systemen via Vertex-zentriertem Computing (Pregel-Modell: Think Like a Vertex)",
        answerD = "PageRank ist ein Kompressionsalgorithmus für Graph-Adjacency-Listen",
        correctAnswer = 2,
        explanation = "PageRank: PR(v) = (1-d)/N + d * Σ(PR(u)/OutDegree(u)) für alle Nachbarn u → v. Iterativ bis Konvergenz. Pregel-Modell (Google, 2010): In jeder 'Superstep' sendet jeder Knoten Nachrichten an Nachbarn, empfängt Nachrichten, aktualisiert seinen eigenen Wert. Keine direkten Knoten-zu-Knoten-Kommunikation zwischen Supersteps. BSP (Bulk Synchronous Parallel): globale Synchronisation nach jedem Superstep. Apache Giraph, GraphX (Spark) und TigerGraph implementieren dieses Modell.",
        difficulty = 5,
        funFact = "Google's Pregel-Paper (2010) beschrieb das 'Think Like a Vertex' Paradigma. Interessanterweise heißt das interne Google-System Pregel — nach dem Fluss in Königsberg aus Eulers Brückenproblem, dem Ursprung der Graphentheorie."
    ),
    // 38
    Question(
        categoryId = 7,
        questionText = "Was ist CSI (Container Storage Interface) in Kubernetes und welches Problem löst es?",
        answerA = "CSI ist das Kubernetes-Protokoll für Container-zu-Container-Kommunikation",
        answerB = "CSI verschlüsselt Persistent Volumes mit Container-spezifischen Schlüsseln",
        answerC = "CSI ist ein Sicherheitsstandard für Container-Images",
        answerD = "CSI ist eine standardisierte Plugin-API die es Storage-Anbietern erlaubt, Volumes für Kubernetes bereitzustellen ohne den Kubernetes-Core zu ändern — ermöglicht dynamische Provisionierung von Block- und File-Storage",
        correctAnswer = 3,
        explanation = "Vor CSI war Storage-Code direkt im Kubernetes-Core (in-tree Plugins). Das bedeutete: Neuer Storage-Anbieter musste Code in Kubernetes selbst einreichen und auf das Release warten. CSI (2019 GA) entkoppelt dies: Storage-Anbieter implementieren gRPC-basierte CSI-Treiber als separate Pods. Kubernetes ruft diese auf: CreateVolume, DeleteVolume, NodeStageVolume, NodePublishVolume. Aws EBS CSI, GCE PD CSI, Ceph CSI, Longhorn sind beliebte CSI-Treiber.",
        difficulty = 5,
        funFact = "AWS begann 2019 damit, den in-tree EBS-Plugin durch den CSI-Treiber zu ersetzen. Die Migration dauerte bis Kubernetes 1.27 — ein Zeichen wie lange es dauert solche Kern-Komponenten zu migrieren."
    ),
    // 39
    Question(
        categoryId = 7,
        questionText = "Was ist das 'Split-Brain'-Problem in verteilten Datenbanken und wie verhindern Quorum-basierte Systeme es?",
        answerA = "Split-Brain ist ein Log-Korruptions-Problem bei gleichzeitigen Checkpoints",
        answerB = "Split-Brain beschreibt Inkonsistenzen zwischen Primär- und Sekundär-DB-Instanzen nach Failover",
        answerC = "Split-Brain tritt auf wenn eine Netzwerkpartition zwei Cluster-Hälften isoliert die beide glauben, der 'echte' Cluster zu sein und unabhängig schreiben — Quorums verhindern es, indem Writes nur mit Mehrheit möglich sind",
        answerD = "Split-Brain ist ein Caching-Inkonsistenz-Problem zwischen Read- und Write-Replicas",
        correctAnswer = 2,
        explanation = "Split-Brain: Netzwerkpartition teilt 5-Knoten-Cluster in Gruppe A (3 Knoten) und Gruppe B (2 Knoten). Ohne Quorum: Beide Gruppen könnten einen Leader wählen und Writes akzeptieren → Datendivergenz. Mit Quorum (Mehrheit = 3): Nur Gruppe A (3 Knoten) kann Quorum erreichen und Writes akzeptieren. Gruppe B (2 Knoten) ist read-only oder abgelehnt. Garantiert: Es gibt immer maximal einen aktiven Leader. Raft, Paxos und ZooKeeper basieren alle auf diesem Prinzip.",
        difficulty = 5,
        funFact = "Das berühmte 'Jepsen'-Projekt von Kyle Kingsbury testete dutzende verteilte Datenbanken auf Split-Brain und fand bei fast allen schwerwiegende Bugs unter Netzwerkpartitionen."
    ),
    // 40
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem Hash-Index und einem B-Tree-Index bei Datenbankabfragen?",
        answerA = "Hash-Index ist O(1) für Gleichheits-Lookups aber unterstützt keine Range-Queries; B-Tree-Index ist O(log N) für Lookups, unterstützt aber Range-Queries, Prefix-Suchen und geordnete Scans",
        answerB = "Hash-Index ist immer schneller als B-Tree-Index für alle Abfragetypen",
        answerC = "Hash-Index funktioniert nur für String-Datentypen, B-Tree für alle Typen",
        answerD = "B-Tree-Index speichert Daten dupliziert, Hash-Index nicht",
        correctAnswer = 0,
        explanation = "Hash-Index: Schlüssel → Hash → Bucket. O(1) für Exact-Match. Unbrauchbar für 'WHERE age > 30' (Range) oder 'WHERE name LIKE 'John%'' (Prefix). B-Tree: O(log N) für Exact-Match, aber Range-Query traversiert Blattebene effizient. PostgreSQL unterstützt beide (USING HASH, USING BTREE). MySQL InnoDB: Adaptive Hash Index (intern, automatisch für häufige Exact-Match-Queries). MongoDB: Hash-Shard-Key, aber B-Tree-Indexes für Queries.",
        difficulty = 5,
        funFact = "PostgreSQL hat seit Version 10 crash-safe Hash Indexes (WAL-logged). Davor waren Hash Indexes nach einem Crash inkonsistent und PostgreSQL empfahl sie explizit nicht für Production."
    ),
    // 41
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Covering Index' und wie verbessert er Query-Performance?",
        answerA = "Ein partieller Index der nur die häufigsten WHERE-Konditionswerte abdeckt",
        answerB = "Ein Index der automatisch neue Spalten abdeckt wenn die Tabelle erweitert wird",
        answerC = "Ein Index der alle Tabellen einer Datenbank abdeckt",
        answerD = "Ein Index der alle Spalten enthält die eine Query benötigt, sodass der Query-Optimizer die eigentliche Tabelle (Heap) gar nicht mehr lesen muss — Index-Only-Scan",
        correctAnswer = 3,
        explanation = "Covering Index: SELECT age, city FROM users WHERE country = 'DE'. Ohne Covering Index: B-Tree-Index auf country findet Row-Pointer, dann Heap-Access für age und city. Mit Covering Index (country, age, city): Alle benötigten Werte sind direkt im Index — kein Heap-Zugriff (Index-Only-Scan in PostgreSQL, Covering Index in MySQL). Enormer Performance-Gewinn bei Large-Table-Queries. Nachteil: Größerer Index, langsamere Writes.",
        difficulty = 5,
        funFact = "MySQL nennt dies 'Covering Index', PostgreSQL 'Index-Only-Scan'. In PostgreSQL muss die Visibility Map (VM) aktuell sein für Index-Only-Scans — ein oft übersehenes Detail nach bulk inserts."
    ),
    // 42
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen horizontalem Sharding und vertikaler Partitionierung in Datenbanken?",
        answerA = "Horizontales Sharding teilt Tabellen nach Zeilen auf verschiedene Server; vertikale Partitionierung teilt Tabellen nach Spalten auf verschiedene Server oder Speicherorte",
        answerB = "Horizontales Sharding ist für Write-Optimierung, vertikale Partitionierung für Read-Optimierung",
        answerC = "Horizontales Sharding nutzt Hash-Funktionen, vertikale Partitionierung nur Range-basierte Teilung",
        answerD = "Vertikale Partitionierung ist dasselbe wie Normalisierung in relationalen Datenbanken",
        correctAnswer = 0,
        explanation = "Horizontales Sharding (Scale-out): Zeilen werden auf N Server verteilt (Shard 1: user_id 1-1M, Shard 2: user_id 1M-2M). Jeder Shard hat dasselbe Schema. Skaliert Schreib-Throughput und Datenmenge. Vertikale Partitionierung: Verschiedene Spaltengruppen auf verschiedene Server/Storage (user_id, email, password → Server A; user_id, preferences, history → Server B). Sinnvoll wenn bestimmte Spalten sehr selten gelesen werden oder unterschiedliche Storage-Anforderungen haben.",
        difficulty = 5,
        funFact = "Columnar Databases (Parquet, ORC, BigQuery) sind eine Form vertikaler Partitionierung: Jede Spalte wird getrennt gespeichert, was bei analytischen Queries (die nur wenige Spalten brauchen) massive I/O-Einsparungen bringt."
    ),
    // 43
    Question(
        categoryId = 7,
        questionText = "Was ist 'Read Repair' in Cassandra und wann wird es ausgelöst?",
        answerA = "Wenn Cassandra bei einem Read von mehreren Replicas inkonsistente Daten erkennt, sendet es asynchron den aktuellsten Wert an die veralteten Replicas — repariert Inkonsistenz im Lesepfad",
        answerB = "Ein Prozess der korrupte Dateien auf Disk automatisch repariert",
        answerC = "Die automatische Wiederherstellung nach einem Node-Ausfall durch Streaming",
        answerD = "Ein manueller Prozess der 'nodetool repair' ausgeführt werden muss",
        correctAnswer = 0,
        explanation = "Cassandra Read Repair: Bei CL=QUORUM liest Cassandra von R Replicas. Wenn Werte divergieren (unterschiedliche Timestamps), wird der neueste Wert an den Client zurückgegeben. Asynchron (nach der Client-Response) oder synchron (bei read_repair_chance) werden die veralteten Replicas mit dem neuesten Wert aktualisiert. Dies ist Cassandras primärer Mechanismus um 'Eventual Consistency' tatsächlich zu erreichen ohne explizites nodetool repair.",
        difficulty = 5,
        funFact = "Cassandra's Hinted Handoff ergänzt Read Repair: Wenn ein Replica temporär ausfällt, speichert ein anderer Node die Writes als 'Hints' und leitet sie nach der Wiederkehr weiter — maximiert Write Availability."
    ),
    // 44
    Question(
        categoryId = 7,
        questionText = "Was ist das 'N+1 Query Problem' in ORM-basierten Anwendungen und wie wird es gelöst?",
        answerA = "Das Problem wenn N+1 Datenbankverbindungen gleichzeitig offen sind",
        answerB = "Das Problem bei der Verwendung von mehr als N+1 JOINs in einer Query",
        answerC = "Beim Laden von N Objekten und deren Relationen werden N+1 Queries ausgeführt statt einer — gelöst durch Eager Loading (JOIN FETCH) oder Batch Fetching",
        answerD = "Das Problem wenn N+1 Indizes auf eine Tabelle verlangsamen",
        correctAnswer = 2,
        explanation = "N+1 Problem: SELECT * FROM orders (1 Query → N Orders). Dann für jeden Order: SELECT * FROM customers WHERE id = ? (N Queries). Total: N+1 Queries statt 1 JOIN. Lösungen: (1) Eager Loading: orders.joins(:customer) oder JOIN FETCH in JPQL. (2) Batch Fetching: ORM lädt alle Customers in einer WHERE id IN (...) Query. (3) DataLoader-Pattern (GraphQL): Kollektiert alle IDs, macht einen Batch-Request. Erkennung: Hibernate's show_sql, Django Debug Toolbar, Bullet Gem (Rails).",
        difficulty = 5,
        funFact = "Das N+1-Problem ist so häufig dass fast jedes Web-Framework spezielle Werkzeuge hat um es zu erkennen. Facebook entwickelte DataLoader für GraphQL speziell als generische Lösung für dieses Problem."
    ),
    // 45
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem Materialized View und einem regulären View in relationalen Datenbanken?",
        answerA = "Reguläre Views erlauben keine JOINs, Materialized Views schon",
        answerB = "Materialized Views können keine GROUP BY-Klauseln enthalten",
        answerC = "Materialized Views sind nur in PostgreSQL verfügbar, Views in allen RDBMS",
        answerD = "Ein regulärer View ist eine virtuelle Tabelle (Query wird bei jeder Abfrage ausgeführt); ein Materialized View speichert das Ergebnis physisch und muss explizit aktualisiert werden — viel schneller, aber eventuell veraltet",
        correctAnswer = 3,
        explanation = "Regulärer View: 'CREATE VIEW monthly_sales AS SELECT...' — jedes Mal wenn abgefragt wird, führt die DB die zugrundeliegende Query aus. Langsam bei komplexen Aggregationen. Materialized View: Ergebnis wird in einer echten Tabelle gespeichert. Abfragen sind extrem schnell (wie Tabelle lesen). Nachteil: Daten können veraltet sein bis zum nächsten REFRESH MATERIALIZED VIEW. PostgreSQL: REFRESH CONCURRENT erlaubt Reads während Refresh. Oracle: Query Rewrite kann Queries automatisch auf MVs umleiten.",
        difficulty = 5,
        funFact = "dbt (data build tool) popularisierte Materialized Views im Data-Engineering-Bereich. Das Konzept 'Incremental Models' in dbt ist eine form von Materialized Views die nur neue/geänderte Daten verarbeiten."
    ),
    // 46
    Question(
        categoryId = 7,
        questionText = "Was ist 'Index Selectivity' und warum ist sie für Query-Optimizer-Entscheidungen kritisch?",
        answerA = "Die Kompressionsrate des Index-Storage auf Disk",
        answerB = "Die Anzahl der Spalten die ein Index abdeckt",
        answerC = "Das Verhältnis von eindeutigen Werten zur Gesamtzahl der Werte in einer indizierten Spalte; hohe Selektivität (z.B. 0.99 für Primary Key) macht Index-Nutzung rentabel, niedrige Selektivität (z.B. 0.01 für boolean) oft nicht",
        answerD = "Die Geschwindigkeit mit der ein Index neue Einträge einfügen kann",
        correctAnswer = 2,
        explanation = "Selektivität = DISTINCT-Werte / Gesamtzeilen. Primary Key: Selektivität ≈ 1.0 (jeder Wert einzigartig) → Index fast immer besser als Table Scan. Spalte 'gender' (2 Werte bei 1M Zeilen): Selektivität ≈ 0.000002 → Index-Scan liest 50% der Tabelle + Index-Overhead = schlechter als Table Scan! Query-Optimizer nutzt Statistiken/Histogramme um Selektivität zu schätzen. Deshalb ist ANALYZE / COMPUTE STATISTICS nach großen Datenänderungen wichtig.",
        difficulty = 5,
        funFact = "Oracle's Histogramme für niedrig-selektive Spalten (Frequency und Top-N Histogramme) ermöglichen präzise Schätzungen wie 'WHERE status = ACTIVE (80% der Rows) vs WHERE status = DELETED (0.1%)'."
    ),
    // 47
    Question(
        categoryId = 7,
        questionText = "Was ist Envoy Proxy und welche Rolle spielt es in einem Service Mesh?",
        answerA = "Envoy ist der Kubernetes-interne Load Balancer für Service-to-Service-Kommunikation",
        answerB = "Envoy ist ein Service-Registry-System das Service-Entdeckung bereitstellt",
        answerC = "Envoy ist ein API-Gateway für externe HTTP-Anfragen an Microservices",
        answerD = "Envoy ist ein hochperformanter L4/L7-Proxy der als Sidecar in jedem Pod läuft, alle ein- und ausgehenden Verbindungen abfängt und Features wie Circuit Breaking, Retries, mTLS, Tracing und Traffic-Shaping implementiert",
        correctAnswer = 3,
        explanation = "Envoy (Lyft, 2016): C++ geschriebener Proxy der als Sidecar oder Edge-Proxy läuft. Features: xDS-API für dynamische Konfiguration (Cluster Discovery Service, Endpoint Discovery Service, Listener Discovery Service, Route Discovery Service). Circuit Breaker: Bei Fehlerrate > Threshold, Requests sofort ablehnen. Outlier Detection: Schlechte Upstream-Endpoints automatisch ausschließen. Distributed Tracing: Jaeger/Zipkin-Integration. Istio, Gloo, Contour nutzen alle Envoy als Data Plane.",
        difficulty = 5,
        funFact = "Envoy's xDS-API wurde zum De-facto-Standard für Proxy-Konfiguration. gRPC implementiert das xDS-Protokoll direkt — Client-seitiges Load Balancing ohne separaten Proxy-Prozess."
    ),
    // 48
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem Circuit Breaker im 'Open', 'Closed' und 'Half-Open' Zustand?",
        answerA = "Closed = normaler Betrieb (Requests durch); Open = alle Requests sofort fehlschlagen ohne Downstream-Aufruf; Half-Open = Test-Requests um zu prüfen ob Downstream wieder gesund ist",
        answerB = "Open = Requests werden durchgelassen, Closed = Requests werden blockiert",
        answerC = "Closed = synchrone Aufrufe, Open = asynchrone Aufrufe, Half-Open = gemischt",
        answerD = "Open = Requests werden geloggt, Closed = kein Logging, Half-Open = Sampling",
        correctAnswer = 0,
        explanation = "Circuit Breaker (Martin Fowler, Michael Nygard): CLOSED: Normalbetrieb, Fehlerrate wird gemessen. Bei Fehlerrate > Threshold: → OPEN. OPEN: Requests werden sofort mit Fehler abgewiesen (keine echten Aufrufe an den fehlerhaften Service) → schützt ihn vor Überlastung. Nach Timeout: → HALF-OPEN. HALF-OPEN: Einige Test-Requests werden durchgelassen. Erfolgreich → zurück zu CLOSED. Fehlerhaft → zurück zu OPEN. Implementierungen: Netflix Hystrix (deprecated), Resilience4j, Polly (.NET), Istio (automatisch).",
        difficulty = 5,
        funFact = "Michael Nygard beschrieb Circuit Breaker in seinem Buch 'Release It!' (2007) als eines der wichtigsten Stability Patterns — geschrieben nach Analyse eines kritischen Ausfalls bei einem Airline-Reservierungssystem."
    ),
    // 49
    Question(
        categoryId = 7,
        questionText = "Was ist 'Tail Latency Amplification' in Microservice-Architekturen mit vielen Abhängigkeiten?",
        answerA = "Die Verzögerung durch rekursive RPC-Aufrufe in verschachtelten Microservices",
        answerB = "Das Ansteigen der Latenz nach Mitternacht wenn Server-Wartungen durchgeführt werden",
        answerC = "Die Latenz-Zunahme durch zu viele Requests an den Tail (Ende) einer Queue",
        answerD = "In einer Request-Chain mit N Services multipliziert sich die P99-Latenz: Wenn jeder Service 1% der Requests langsam beantwortet, hat der Gesamtrequest eine viel höhere Wahrscheinlichkeit mindestens einen langsamen Service zu treffen",
        correctAnswer = 3,
        explanation = "Amplifikation: Request trifft 10 Services. Jeder hat P99=1s (99% unter 1s). Wahrscheinlichkeit, dass ALLE 10 Services unter P99 antworten: 0.99^10 = 90.4%. Damit sieht 9.6% der Requests mindestens einen langsamen Service → deutlich schlechtere End-to-End-P99. Gegenmaßnahmen: Hedged Requests (doppelt senden, erste Antwort nutzen), Timeout-Budgets, Backend-Latenz-Überwachung per Service. Jeff Dean beschrieb dies in Google's 'The Tail at Scale'-Paper (2013).",
        difficulty = 5,
        funFact = "Google's Lösung für Tail Latency sind 'Hedged Requests': Der gleiche Request wird nach kurzer Verzögerung an einen zweiten Server gesendet. Der erste der antwortet 'gewinnt'. Dies reduziert P99 auf Kosten von ~2% mehr Load."
    ),
    // 50
    Question(
        categoryId = 7,
        questionText = "Was ist der Zweck von ZooKeeper's 'Ephemeral Nodes' (temporäre Knoten) in verteilten Koordinations-Szenarien?",
        answerA = "Ephemeral Nodes haben automatische TTL-Werte die per API gesetzt werden",
        answerB = "Ephemeral Nodes sind read-only Knoten die nicht verändert werden können",
        answerC = "Ephemeral Nodes speichern Daten nur im RAM und nicht auf Disk",
        answerD = "Ephemeral Nodes existieren nur solange die Session des erstellenden Clients aktiv ist; beim Session-Timeout werden sie automatisch gelöscht — ideal für Leader Election und Service-Registration",
        correctAnswer = 3,
        explanation = "ZooKeeper Ephemeral Nodes: Erstellt ein Service einen Ephemeral Node /services/payment/instance-1 und die Verbindung bricht ab, löscht ZooKeeper den Node automatisch nach Session-Timeout. Andere Services die /services/payment watchen erhalten sofort eine Notification. Anwendungen: (1) Service Discovery: Jede Instanz registriert sich als Ephemeral Node — tot = Node weg = automatisch deregistriert. (2) Leader Election: Wer Ephemeral Node /leader erstellt, ist Leader. (3) Distributed Locks. Kafka und HBase nutzen ZooKeeper intensiv für genau diese Zwecke.",
        difficulty = 5,
        funFact = "ZooKeeper wurde ursprünglich von Yahoo entwickelt und ist nach dem Spitznamen für die interne Chaos-Probleme benannt: 'Wir brauchen einen Zoo-Keeper der all die verteilten System-Tiere koordiniert'."
    )
)
