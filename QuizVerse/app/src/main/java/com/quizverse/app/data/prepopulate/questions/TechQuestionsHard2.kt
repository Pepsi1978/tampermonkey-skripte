package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsHard2(): List<Question> = listOf(

    // ── MACHINE LEARNING — Backpropagation & Gradient Descent ────────────────

    // Question 1 — correctAnswer 0
    Question(
        categoryId = 7,
        questionText = "Was beschreibt das 'Vanishing Gradient'-Problem bei tiefen neuronalen Netzen?",
        answerA = "Gradienten werden waehrend der Backpropagation in frueheren Schichten exponentiell klein und verhindern effektives Lernen",
        answerB = "Der Gradient steigt ins Unendliche und verursacht numerische Instabilitaet",
        answerC = "Das Netz vergisst aeltere Trainingsdaten, weil der Speicher ueberlaeuft",
        answerD = "Die Lernrate wird zu gross und der Optimierer ueberspringt das globale Minimum",
        correctAnswer = 0,
        explanation = "Beim Vanishing Gradient werden Gradienten durch wiederholte Multiplikation mit kleinen Werten (z.B. Sigmoid-Ableitungen nahe 0) in frueheren Schichten exponentiell klein. Das macht das Training sehr tiefer Netze ohne Tricks wie ReLU oder BatchNorm praktisch unmoeglich.",
        difficulty = 3,
        funFact = "Sepp Hochreiter beschrieb das Problem 1991 in seiner Diplomarbeit — zehn Jahre bevor Deep Learning zum Mainstream wurde."
    ),

    // Question 2 — correctAnswer 2
    Question(
        categoryId = 7,
        questionText = "Welcher Optimizer verwendet adaptive Lernraten pro Parameter und kombiniert Momentum mit RMSProp?",
        answerA = "SGD mit Nesterov-Momentum",
        answerB = "Adagrad",
        answerC = "Adam",
        answerD = "LBFGS",
        correctAnswer = 2,
        explanation = "Adam (Adaptive Moment Estimation) kombiniert die Ideen von Momentum (gleitender Durchschnitt des Gradienten, 1. Moment) und RMSProp (gleitender Durchschnitt des quadrierten Gradienten, 2. Moment). Er passt die Lernrate fuer jeden Parameter individuell an.",
        difficulty = 3,
        funFact = "Adam wurde 2014 von Diederik Kingma und Jimmy Ba veroeffentlicht und ist heute der meistgenutzte Optimizer in der Deep-Learning-Praxis."
    ),

    // Question 3 — correctAnswer 3
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter 'Batch Normalization' in neuronalen Netzen?",
        answerA = "Die Eingabedaten werden einmalig vor dem Training auf Mittelwert 0 und Varianz 1 normiert",
        answerB = "Gewichte werden nach jedem Batch auf einen festen Wertebereich geclippt",
        answerC = "Der Batch-Verlust wird durch die Anzahl der Parameter dividiert, um Skalierungsprobleme zu vermeiden",
        answerD = "Die Aktivierungen jeder Schicht werden pro Mini-Batch normiert, um internen Kovariatenwechsel zu reduzieren",
        correctAnswer = 3,
        explanation = "Batch Normalization normiert die Aktivierungen einer Schicht ueber den Mini-Batch auf Mittelwert 0 und Varianz 1, bevor sie zur naechsten Schicht weitergeleitet werden. Das reduziert den sogenannten Internal Covariate Shift und erlaubt hoehere Lernraten.",
        difficulty = 3,
        funFact = "Batch Normalization wurde 2015 von Ioffe und Szegedy bei Google Brain entwickelt und gilt als einer der wichtigsten Durchbrueche fuer das Training sehr tiefer Netze."
    ),

    // Question 4 — correctAnswer 1
    Question(
        categoryId = 7,
        questionText = "Welche Aussage zum Unterschied zwischen 'Stochastic Gradient Descent' (SGD) und 'Mini-Batch Gradient Descent' ist korrekt?",
        answerA = "SGD berechnet den Gradienten ueber den gesamten Datensatz, Mini-Batch nur ueber eine Teilmenge",
        answerB = "SGD verwendet eine einzelne Stichprobe pro Update, Mini-Batch eine kleine Gruppe von Stichproben",
        answerC = "Beide sind identisch — der Begriff Mini-Batch ist nur ein Synonym fuer SGD",
        answerD = "Mini-Batch berechnet immer denselben Gradienten wie Full-Batch Gradient Descent",
        correctAnswer = 1,
        explanation = "SGD (im strikten Sinne) berechnet den Gradienten aus einer einzelnen Trainingsinstanz. Mini-Batch GD nutzt eine kleine Gruppe (z.B. 32-256 Instanzen) und ist ein Kompromiss zwischen der Rauscharmut von Full-Batch und der Geschwindigkeit von SGD. In der Praxis wird 'SGD' oft fuer Mini-Batch verwendet.",
        difficulty = 3,
        funFact = "Die Batchgroesse beeinflusst nicht nur die Trainingsgeschwindigkeit, sondern auch die Generalisierungsleistung: kleinere Batches fuehren oft zu besserer Generalisierung."
    ),

    // Question 5 — correctAnswer 0
    Question(
        categoryId = 7,
        questionText = "Was ist der Zweck von 'Dropout' als Regularisierungstechnik in neuronalen Netzen?",
        answerA = "Neuronen werden zufaellig deaktiviert, um das Netz zu zwingen, redundante Repraesentationen zu lernen und Overfitting zu reduzieren",
        answerB = "Gradienten werden auf Null gesetzt, wenn sie einen Schwellenwert unterschreiten, um das Vanishing-Gradient-Problem zu bekaempfen",
        answerC = "Schichten werden waehrend der Inferenz deaktiviert, um die Inferenzgeschwindigkeit zu erhoehen",
        answerD = "Gewichte unterhalb eines Schwellenwerts werden dauerhaft auf Null gesetzt (Pruning)",
        correctAnswer = 0,
        explanation = "Dropout deaktiviert zufaellig einen Anteil der Neuronen (z.B. 50%) waehrend des Trainings. Das Netz kann sich nicht auf bestimmte Neuronen verlassen und entwickelt robustere, redundante Repraesentationen — was Overfitting reduziert. Bei der Inferenz sind alle Neuronen aktiv, die Gewichte werden jedoch skaliert.",
        difficulty = 3,
        funFact = "Dropout wurde 2012 von Hinton et al. veroeffentlicht. Die Intuition dahinter kam von biologischen neuronalen Netzen, die ebenfalls stochastisches 'Feuern' zeigen."
    ),

    // ── MACHINE LEARNING — CNN & RNN ─────────────────────────────────────────

    // Question 6 — correctAnswer 3
    Question(
        categoryId = 7,
        questionText = "Welche Eigenschaft macht Convolutional Neural Networks (CNNs) besonders geeignet fuer Bilderkennung?",
        answerA = "Volle Verbindung aller Neuronen sorgt fuer maximalen Informationsfluss",
        answerB = "Rekurrente Verbindungen ermoeglich es, raeumliche Abhaengigkeiten im Bild zu modellieren",
        answerC = "Attention-Mechanismen gewichten globale Bildregionen adaptiv",
        answerD = "Parameter-Sharing und lokale Konnektivitaet der Faltungsfilter ermoeglichen translationsinvariante Merkmalserkennung",
        correctAnswer = 3,
        explanation = "CNNs nutzen Faltungsfilter (Kernels), die dieselben Gewichte ueber das gesamte Bild anwenden (Parameter-Sharing). Dadurch erkennt ein Filter ein Merkmal (z.B. eine Kante) unabhaengig von seiner Position im Bild (Translationsinvarianz). Lokale Konnektivitaet reduziert ausserdem die Parameterzahl drastisch gegenueber vollstaendig verbundenen Schichten.",
        difficulty = 3,
        funFact = "AlexNet gewann 2012 den ImageNet-Wettbewerb mit einem Fehler von 15,3% — 10 Prozentpunkte besser als die zweitplatzierte Methode und laeutete die Deep-Learning-Aera ein."
    ),

    // Question 7 — correctAnswer 1
    Question(
        categoryId = 7,
        questionText = "Warum leiden einfache RNNs (Recurrent Neural Networks) beim Verarbeiten langer Sequenzen typischerweise unter dem 'Long-Term Dependency'-Problem?",
        answerA = "RNNs koennen maximal 100 Zeitschritte verarbeiten, weil der Speicher begrenzt ist",
        answerB = "Durch Backpropagation Through Time (BPTT) explodieren oder verschwinden Gradienten ueber viele Zeitschritte, sodass fruehe Informationen verloren gehen",
        answerC = "Der Hidden State wird nach jedem Satz zurueckgesetzt, sodass satzuebergreifende Abhaengigkeiten nicht modelliert werden koennen",
        answerD = "RNNs verarbeiten alle Zeitschritte parallel und koennen daher keine sequenzielle Abhaengigkeit lernen",
        correctAnswer = 1,
        explanation = "Bei BPTT werden Gradienten ueber viele Zeitschritte zurueckpropagiert — dabei werden sie wiederholt mit denselben Gewichten multipliziert. Ist der Spektralradius der Gewichtsmatrix kleiner als 1, verschwinden sie; ist er groesser als 1, explodieren sie. So verliert das Netz die Faehigkeit, Informationen aus weit zurueckliegenden Schritten zu nutzen.",
        difficulty = 3,
        funFact = "LSTMs wurden 1997 von Hochreiter und Schmidhuber entwickelt und loesen das Problem durch explizite Gating-Mechanismen, die den Informationsfluss steuern."
    ),

    // Question 8 — correctAnswer 2
    Question(
        categoryId = 7,
        questionText = "Was ist der Hauptunterschied zwischen dem Forget Gate und dem Input Gate eines LSTM?",
        answerA = "Das Forget Gate leert den kompletten Hidden State; das Input Gate laedt neue Trainingsdaten",
        answerB = "Beide Gates sind identisch — sie unterscheiden sich nur in der Initialisierung",
        answerC = "Das Forget Gate entscheidet, welche Informationen aus dem Cell State geloescht werden; das Input Gate bestimmt, welche neuen Informationen hinzugefuegt werden",
        answerD = "Das Forget Gate modelliert langfristige Abhaengigkeiten, das Input Gate kurzfristige",
        correctAnswer = 2,
        explanation = "Ein LSTM besitzt drei Gates: Das Forget Gate (Sigmoid) entscheidet, welcher Teil des Cell State vergessen wird (Multiplikation nah 0 = loeschen). Das Input Gate bestimmt, welche neuen Informationen aus dem aktuellen Input in den Cell State geschrieben werden. Das Output Gate steuert, was in den Hidden State weitergegeben wird.",
        difficulty = 3,
        funFact = "GRUs (Gated Recurrent Units, 2014) vereinfachen LSTMs auf zwei Gates und erzielen bei vielen Aufgaben aehnliche Leistung bei geringerem Rechenaufwand."
    ),

    // ── MACHINE LEARNING — Transformer-Architektur ───────────────────────────

    // Question 9 — correctAnswer 3
    Question(
        categoryId = 7,
        questionText = "Was ist der Mechanismus hinter 'Scaled Dot-Product Attention' im Transformer?",
        answerA = "Jedes Token wird mit einem gelernten Faltungsfilter ueber seine Nachbarn gefaltet",
        answerB = "Attention-Gewichte werden direkt aus den Eingabe-Embeddings als Sigmoid-Funktion berechnet",
        answerC = "Jedes Token tauscht Informationen mit allen anderen Tokens via rekurrente Zustaende aus",
        answerD = "Query, Key und Value Matrizen werden berechnet; das Skalarprodukt von Query und Key wird durch sqrt(d_k) skaliert, durch Softmax normiert und mit Value multipliziert",
        correctAnswer = 3,
        explanation = "Scaled Dot-Product Attention berechnet Attention(Q,K,V) = softmax(QK^T / sqrt(d_k)) * V. Die Division durch sqrt(d_k) verhindert, dass die Skalarprodukte bei hoher Dimensionalitaet zu gross werden und die Softmax in saettigte Regionen treibt. Das Ergebnis ist eine gewichtete Summe der Value-Vektoren.",
        difficulty = 3,
        funFact = "Das Transformer-Paper 'Attention Is All You Need' (2017) von Vaswani et al. gilt als einer der einflussreichsten Paper der KI-Geschichte und legte den Grundstein fuer GPT, BERT und alle grossen Sprachmodelle."
    ),

    // Question 10 — correctAnswer 1
    Question(
        categoryId = 7,
        questionText = "Welche Aufgabe hat das 'Positional Encoding' in der Transformer-Architektur?",
        answerA = "Es berechnet die Wichtigkeit jedes Tokens relativ zu allen anderen Tokens",
        answerB = "Es bringt Positionsinformationen in die Eingabe-Embeddings ein, da der Attention-Mechanismus selbst keine Reihenfolge verarbeitet",
        answerC = "Es normiert die Token-Embeddings auf eine einheitliche Laenge",
        answerD = "Es maskiert zukuenftige Tokens beim Training des Decoders",
        correctAnswer = 1,
        explanation = "Der Self-Attention-Mechanismus ist permutationsinvariant — er verarbeitet alle Tokens gleichzeitig ohne Kenntnis ihrer Reihenfolge. Positional Encoding addiert ein positionsabhaengiges Signal zu den Embeddings (im Original: Sinus/Kosinus-Funktionen verschiedener Frequenzen), sodass das Modell die Sequenzreihenfolge lernen kann.",
        difficulty = 3,
        funFact = "Spaetere Modelle wie RoPE (Rotary Position Embedding) oder ALiBi verwenden alternative Positional-Encoding-Verfahren, die bessere Laengengeneralisierung bieten."
    ),

    // Question 11 — correctAnswer 0
    Question(
        categoryId = 7,
        questionText = "Was unterscheidet 'Multi-Head Attention' von einfacher Single-Head Attention?",
        answerA = "Multi-Head Attention berechnet Attention parallel in mehreren Repraesentationsraeumen und konkateniert die Ergebnisse",
        answerB = "Multi-Head Attention ersetzt den Softmax durch mehrere Sigmoid-Funktionen",
        answerC = "Multi-Head Attention verarbeitet Sequenzen sequentiell wie ein RNN, aber mit mehreren Zustaenden",
        answerD = "Bei Multi-Head Attention werden Query und Key-Matrizen aufgeteilt und sequentiell angewendet",
        correctAnswer = 0,
        explanation = "Multi-Head Attention projiziert Queries, Keys und Values h-mal in niedrigerdimensionale Raeume, berechnet Attention in jedem 'Kopf' parallel und konkateniert die Ergebnisse. Jeder Kopf kann sich auf andere Aspekte der Eingabe spezialisieren (Syntax, Semantik, Koreferenz etc.).",
        difficulty = 3,
        funFact = "Visualisierungen von Attention-Koepfen zeigen, dass verschiedene Koepfe tatsaechlich verschiedene linguistische Phaenomene lernen — manche fokussieren auf Syntax, andere auf Semantik."
    ),

    // ── DATENBANKEN — B-Trees & Indexierung ──────────────────────────────────

    // Question 12 — correctAnswer 2
    Question(
        categoryId = 7,
        questionText = "Warum verwenden Datenbanksysteme B+-Baeume statt binaere Suchbaeume fuer Indizes?",
        answerA = "B+-Baeume sind einfacher zu implementieren und benoetigen weniger Speicher",
        answerB = "Binaere Suchbaeume koennen keine Schluessel-Wert-Paare speichern",
        answerC = "B+-Baeume halten alle Daten in Blattknoten und verketten diese, was Range-Queries und blockbasiertes I/O auf Disk effizient macht",
        answerD = "B+-Baeume haben immer eine konstante Hoehe von log2(n), binaere Baeume nicht",
        correctAnswer = 2,
        explanation = "B+-Baeume speichern Daten ausschliesslich in Blattknoten (im Gegensatz zu B-Baeumen) und verketten alle Blattknoten als verkettete Liste. Das ermoeglicht effiziente Range-Queries durch sequentielles Lesen. Ausserdem haben B+-Baeume hohe Verzweigungsgrade (Fanout), was die Baumhoehe minimiert und somit I/O-Operationen auf langsamen Disks reduziert.",
        difficulty = 3,
        funFact = "Ein B+-Baum mit Blockgroesse 4KB und 8-Byte-Schluesseln kann bei einer Hoehe von 4 bis zu ~4 Milliarden Datensaetze indexieren."
    ),

    // Question 13 — correctAnswer 3
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem Clustered Index und einem Non-Clustered Index?",
        answerA = "Ein Clustered Index ist schneller, weil er im RAM gecacht wird; ein Non-Clustered Index liegt auf der Disk",
        answerB = "Clustered Indizes funktionieren nur fuer numerische Schluessel; Non-Clustered fuer alle Typen",
        answerC = "Non-Clustered Indizes sind fuer Primary Keys, Clustered Indizes fuer Foreign Keys",
        answerD = "Bei einem Clustered Index bestimmt der Index die physische Reihenfolge der Datensaetze auf der Disk; ein Non-Clustered Index enthaelt nur Zeiger auf die Datensaetze",
        correctAnswer = 3,
        explanation = "Ein Clustered Index legt fest, in welcher physischen Reihenfolge Datensaetze auf der Disk gespeichert werden. Pro Tabelle kann es nur einen geben. Ein Non-Clustered Index ist eine separate Datenstruktur mit Zeigern (Row Locators) auf die eigentlichen Datensaetze, was bei Lookups einen Extra-Lesezugriff erfordern kann.",
        difficulty = 3,
        funFact = "In SQL Server ist der Primary Key standardmaessig ein Clustered Index. In PostgreSQL gibt es kein echtes Clustered-Index-Konzept; CLUSTER ist nur eine einmalige Reorganisation."
    ),

    // Question 14 — correctAnswer 0
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Covering Index' und wann ist er besonders nuetzlich?",
        answerA = "Ein Index, der alle Spalten einer Query enthaelt, sodass der eigentliche Tabellen-Zugriff komplett entfaellt",
        answerB = "Ein Index, der alle Zeilen der Tabelle umfasst, auch NULL-Werte",
        answerC = "Ein Composite Index, der mehr als 10 Spalten abdeckt",
        answerD = "Ein Index, der automatisch aktualisiert wird, wenn sich die Tabellenstruktur aendert",
        correctAnswer = 0,
        explanation = "Ein Covering Index enthaelt alle Spalten, die eine Query liest (SELECT, WHERE, JOIN, ORDER BY). Dadurch kann der Datenbankserver die Anfrage vollstaendig aus dem Index beantworten ohne auf die Haupttabelle zuzugreifen (Index-Only Scan). Das reduziert I/O drastisch, besonders bei analytischen Queries auf grossen Tabellen.",
        difficulty = 3,
        funFact = "In PostgreSQL wird ein Index-Only Scan nur genutzt, wenn die Visibility Map zeigt, dass alle relevanten Seiten sichtbar sind. Sonst muss doch auf die Heap-Seite zugegriffen werden."
    ),

    // ── DATENBANKEN — ACID ───────────────────────────────────────────────────

    // Question 15 — correctAnswer 1
    Question(
        categoryId = 7,
        questionText = "Was garantiert die 'Isolation'-Eigenschaft in ACID, und welches Problem tritt auf, wenn sie verletzt wird?",
        answerA = "Isolation stellt sicher, dass Transaktionen atomar abgeschlossen werden; ohne sie koennen Deadlocks auftreten",
        answerB = "Isolation garantiert, dass parallele Transaktionen sich nicht gegenseitig sehen, als ob sie sequentiell ausgefuehrt wuerden; Verletzungen fuehren zu Dirty Reads, Non-Repeatable Reads oder Phantom Reads",
        answerC = "Isolation speichert Transaktionsprotokolle redundant auf mehreren Disks",
        answerD = "Isolation sorgt dafuer, dass eine Transaktion immer den neuesten Datenbankzustand liest",
        correctAnswer = 1,
        explanation = "Isolation bedeutet, dass gleichzeitig laufende Transaktionen sich verhalten, als waeren sie sequentiell. SQL-Standard definiert vier Isolationsstufen (Read Uncommitted, Read Committed, Repeatable Read, Serializable). Schwaechen fuehren zu Anomalien: Dirty Reads (uncommittierte Daten lesen), Non-Repeatable Reads (Wert aendert sich innerhalb Transaktion), Phantom Reads (neue Zeilen erscheinen).",
        difficulty = 3,
        funFact = "PostgreSQL implementiert MVCC (Multiversion Concurrency Control), um Isolation ohne echte Lese-Sperren zu erreichen. Jede Transaktion sieht einen konsistenten Snapshot des Datenbankzustands."
    ),

    // Question 16 — correctAnswer 2
    Question(
        categoryId = 7,
        questionText = "Wie implementiert Write-Ahead Logging (WAL) die Durability-Eigenschaft von ACID?",
        answerA = "Alle Daten werden vor dem Commit in den RAM geschrieben und erst danach auf die Disk geflusht",
        answerB = "WAL repliziert jeden Commit sofort auf mehrere Datenbank-Instanzen",
        answerC = "Alle Aenderungen werden zuerst in ein sequentielles Log geschrieben und bestaetigt, bevor sie in die eigentlichen Datenseiten uebertragen werden; bei einem Absturz kann das Log wiederholt werden",
        answerD = "WAL komprimiert Transaktionen und schreibt sie gebundelt auf die Disk um I/O zu reduzieren",
        correctAnswer = 2,
        explanation = "WAL schreibt jede Aenderung zunaechst sequentiell in eine Log-Datei (schneller als random writes in Datenseiten). Erst wenn der Log-Eintrag auf der Disk bestaetigt ist, gilt der Commit als abgeschlossen. Bei einem Systemabsturz kann das Log beim Neustart wiederholt werden (Redo), um den konsistenten Zustand wiederherzustellen.",
        difficulty = 3,
        funFact = "Sequentielle Schreibzugriffe (WAL) sind auf traditionellen HDDs bis zu 100x schneller als wahlfreie Zugriffe. Auf SSDs ist der Unterschied kleiner, aber WAL vereinfacht auch Replikation und Point-in-Time Recovery."
    ),

    // ── DATENBANKEN — CAP-Theorem & Sharding ─────────────────────────────────

    // Question 17 — correctAnswer 3
    Question(
        categoryId = 7,
        questionText = "Was besagt das CAP-Theorem fuer verteilte Datenbanken?",
        answerA = "Consistency, Availability und Partition Tolerance koennen alle drei gleichzeitig garantiert werden, wenn die Hardware gut genug ist",
        answerB = "CAP beschreibt die drei wichtigsten Performance-Metriken: Capacity, Availability und Processing",
        answerC = "Verteilte Systeme muessen sich immer fuer Consistency entscheiden; Availability ist optional",
        answerD = "Ein verteiltes System kann in einem Netzwerkpartitionsfall maximal zwei der drei Eigenschaften Consistency, Availability und Partition Tolerance gleichzeitig garantieren",
        correctAnswer = 3,
        explanation = "Das CAP-Theorem (Brewer, 2000) besagt: Bei einem Netzwerkausfall (Partition) muss ein verteiltes System waehlen zwischen Consistency (alle Knoten sehen dieselben Daten) und Availability (jede Anfrage erhaelt eine Antwort). Partition Tolerance (System laeuft trotz Netzwerkausfall) ist in der Praxis nicht verzichtbar — also muss man zwischen CP und AP waehlen.",
        difficulty = 3,
        funFact = "Das PACELC-Theorem erweitert CAP: Auch ohne Partition gibt es einen Tradeoff zwischen Latency und Consistency — ein wichtiger Aspekt den CAP ignoriert."
    ),

    // Question 18 — correctAnswer 0
    Question(
        categoryId = 7,
        questionText = "Was ist 'Consistent Hashing' und warum wird es bei Datenbank-Sharding eingesetzt?",
        answerA = "Eine Ring-basierte Hash-Methode, bei der beim Hinzufuegen oder Entfernen von Knoten nur ein minimaler Anteil der Keys neu zugeordnet werden muss",
        answerB = "Eine Hash-Funktion, die immer denselben Wert fuer denselben Schluessel liefert, unabhaengig von der Datenbankgroesse",
        answerC = "Eine Technik, um Hash-Kollisionen durch konsistente Kettung in Linked Lists aufzuloesen",
        answerD = "Consistent Hashing garantiert, dass alle Shards gleich viele Datensaetze enthalten",
        correctAnswer = 0,
        explanation = "Beim Consistent Hashing werden Server und Keys auf einem virtuellen Ring angeordnet. Jeder Key gehoert zum naechsten Server im Uhrzeigersinn. Faellt ein Server aus oder kommt einer dazu, muessen nur die Keys dieses Servers neu verteilt werden — bei n Servern und k Keys im Schnitt nur k/n Keys statt alle. Das minimiert Datenmigration bei horizontaler Skalierung.",
        difficulty = 3,
        funFact = "Amazon DynamoDB, Apache Cassandra und viele Content Delivery Networks nutzen Consistent Hashing als Grundlage ihrer Verteilungslogik."
    ),

    // Question 19 — correctAnswer 0
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen horizontalem Sharding und vertikaler Partitionierung?",
        answerA = "Horizontales Sharding teilt Zeilen auf mehrere Knoten auf; vertikale Partitionierung teilt Spalten auf verschiedene Tabellen oder Knoten auf",
        answerB = "Horizontales Sharding ist fuer SQL-Datenbanken, vertikale Partitionierung nur fuer NoSQL",
        answerC = "Vertikale Partitionierung bedeutet, mehrere Tabellen auf einen Server zu konsolidieren",
        answerD = "Beide Begriffe sind synonym und beschreiben dasselbe Konzept",
        correctAnswer = 0,
        explanation = "Horizontales Sharding (auch Row-based Partitioning) verteilt Zeilen einer Tabelle auf verschiedene Datenbankknoten nach einem Shard-Key (z.B. user_id % N). Vertikale Partitionierung teilt eine Tabelle nach Spalten auf — haeufig genutzte Spalten auf einem schnellen Server, grosse BLOB-Spalten auf guenstigem Speicher. Beide loesen unterschiedliche Skalierungsprobleme.",
        difficulty = 3,
        funFact = "Eine haeufige Falle beim horizontalen Sharding ist der 'Hot Shard' — wenn ein Shard-Key schlecht gewaehlt wird, landet ein Grossteil des Traffics auf einem einzelnen Shard."
    ),

    // ── VERTEILTE SYSTEME — Consensus, Paxos, Raft ──────────────────────────

    // Question 20 — correctAnswer 2
    Question(
        categoryId = 7,
        questionText = "Was ist das fundamentale Ziel eines Consensus-Algorithmus in verteilten Systemen?",
        answerA = "Sicherstellen, dass alle Knoten immer denselben Wert aus ihrem lokalen Speicher lesen",
        answerB = "Sicherstellen, dass Anfragen immer an den Knoten mit der niedrigsten Auslastung weitergeleitet werden",
        answerC = "Sicherstellen, dass eine Gruppe von Knoten trotz Ausfaellen und Nachrichtenverzoegerungen einen gemeinsamen Wert vereinbart, ueber den danach kein Knoten widerspricht",
        answerD = "Sicherstellen, dass Netzwerkpakete in derselben Reihenfolge ankommen, in der sie gesendet wurden",
        correctAnswer = 2,
        explanation = "Consensus-Algorithmen lassen eine Gruppe von Prozessen trotz Ausfaellen einen Wert vereinbaren, der fuer alle korrekten Prozesse gleich ist (Agreement), endgueltig beschlossen wird (Termination) und nur vorgeschlagene Werte beinhaltet (Validity). Das FLP-Theorem beweist, dass dies in asynchronen Systemen mit auch nur einem Ausfall unmoeglich ist — praktische Algorithmen umgehen dies durch Timeouts.",
        difficulty = 3,
        funFact = "Das FLP-Impossibility-Theorem (Fischer, Lynch, Paterson, 1985) zeigt, dass kein deterministischer Consensus-Algorithmus in einem vollstaendig asynchronen System mit einem einzigen Prozessausfall terminiert."
    ),

    // Question 21 — correctAnswer 1
    Question(
        categoryId = 7,
        questionText = "In welcher Phase des Paxos-Algorithmus wird ein Wert endgueltig festgelegt?",
        answerA = "In der Prepare-Phase, wenn der Proposer die hoechste Ballot-Nummer erhaelt",
        answerB = "In der Accept-Phase, wenn eine Mehrheit der Acceptors eine Accept-Nachricht fuer einen Wert sendet",
        answerC = "In der Learn-Phase, wenn alle Knoten den Wert kennen",
        answerD = "Paxos legt Werte nicht endgueltig fest — er ist nur ein Koordinationsprotokoll",
        correctAnswer = 1,
        explanation = "Paxos laeuft in zwei Phasen: Phase 1 (Prepare/Promise): Der Proposer sendet Prepare(n); Acceptors antworten mit Promise falls n die hoechste gesehene Nummer ist. Phase 2 (Accept/Accepted): Der Proposer sendet Accept(n, v) mit einem sicheren Wert; wenn eine Mehrheit (Quorum) Accept sendet, ist der Wert beschlossen (chosen). Die Learn-Phase informiert nur die Learners.",
        difficulty = 3,
        funFact = "Paxos wurde 1989 von Leslie Lamport entwickelt, aber erst 1998 veroeffentlicht — da er das Paper zuerst als zu simpel und dann als zu verwirrend fuer die Reviewers einschaetzte."
    ),

    // Question 22 — correctAnswer 3
    Question(
        categoryId = 7,
        questionText = "Was ist der Hauptvorteil des Raft-Algorithmus gegenueber Paxos?",
        answerA = "Raft ist schneller als Paxos, weil er weniger Netzwerkrunden benoetigt",
        answerB = "Raft toleriert mehr Ausfaelle als Paxos bei gleicher Knotenanzahl",
        answerC = "Raft benoetigt keine Leader-Election und ist daher robuster",
        answerD = "Raft ist explizit auf Verstaendlichkeit ausgelegt und trennt Concerns klar (Leader Election, Log Replication, Safety), waehrend Paxos als schwer verstaendlich gilt",
        correctAnswer = 3,
        explanation = "Raft wurde 2014 von Ongaro und Ousterhout explizit als Alternative zu Paxos entwickelt mit dem Ziel, besser verstaendlich zu sein. Raft trennt klar zwischen Leader Election, Log Replication und Safety. Ein Raft-Leader verarbeitet alle Client-Anfragen und repliziert Eintraege sequentiell. Usability-Studien zeigten, dass Studenten Raft signifikant schneller verstanden als Paxos.",
        difficulty = 3,
        funFact = "Raft ist die Basis fuer etcd (Kubernetes' Konfigurationsspeicher), CockroachDB und Consul. Diese Systeme koordinieren kritische Infrastruktur in Millionen von Produktionssystemen."
    ),

    // Question 23 — correctAnswer 1
    Question(
        categoryId = 7,
        questionText = "Wie viele Knotenausfaelle toleriert ein Raft-Cluster mit 5 Knoten, und warum?",
        answerA = "5 Ausfaelle, weil jeder Knoten unabhaengig arbeiten kann",
        answerB = "2 Ausfaelle, weil ein Quorum von 3 Knoten (Mehrheit aus 5) fuer Consensus benoetigt wird",
        answerC = "1 Ausfall, weil Raft immer 4 von 5 Knoten fuer einen Commit benoetigt",
        answerD = "4 Ausfaelle, weil ein einzelner Knoten alle Daten haelt",
        correctAnswer = 1,
        explanation = "Raft benoetigt eine Mehrheit (Quorum) fuer Leader Election und Log Commits: bei n Knoten sind (n+1)/2 erforderlich. Bei 5 Knoten sind das 3. Daher koennen 2 Knoten ausfallen, ohne die Verfuegbarkeit zu beeintraechtigen. Mit f Ausfaellen braucht man 2f+1 Knoten — 5 Knoten fuer f=2.",
        difficulty = 3,
        funFact = "Ungerade Knotenanzahlen (3, 5, 7) sind optimal fuer Consensus-Systeme. Eine gerade Anzahl erhoeht die Fehlertoleranz nicht, verlangsamt aber den Consensus."
    ),

    // Question 24 — correctAnswer 0
    Question(
        categoryId = 7,
        questionText = "Was versteht man unter dem 'Split-Brain'-Problem in verteilten Systemen?",
        answerA = "Eine Situation, in der zwei Knotengruppen sich jeweils als legitime Mehrheit betrachten, beide einen Leader waehlen und inkonsistente Writes akzeptieren",
        answerB = "Ein Fehler bei dem ein Knoten sowohl als Leader als auch als Follower fungiert",
        answerC = "Ein Netzwerkpartitionsproblem, bei dem Datenpakete in der falschen Reihenfolge ankommen",
        answerD = "Ein Fehler in der Leader-Election, bei der kein Knoten eine Mehrheit erhaelt und das System blockiert",
        correctAnswer = 0,
        explanation = "Split-Brain tritt auf, wenn ein Netzwerkpartitionsfall dazu fuehrt, dass zwei Gruppen von Knoten sich jeweils selbst als die legitime Mehrheit betrachten und beide einen Leader waehlen. Beide Leader akzeptieren dann Writes, was zu Datendivergenz fuehrt. Consensus-Algorithmen wie Raft verhindern dies: nur die Partition mit echter Mehrheit kann Commits durchfuehren.",
        difficulty = 3,
        funFact = "Split-Brain in Datenbanksystemen kann zu Datenverlust oder inkonsistenten Zustaenden fuehren. MySQL-Cluster mit DRBD und etcd mit Raft haben beide ausgereifte Split-Brain-Schutzmechanismen."
    ),

    // ── CLOUD-NATIVE — Docker & Container ────────────────────────────────────

    // Question 25 — correctAnswer 2
    Question(
        categoryId = 7,
        questionText = "Was ist der technische Unterschied zwischen einem Docker-Container und einer Virtual Machine?",
        answerA = "Container sind langsamer, weil sie kein eigenes Betriebssystem haben und alle Ressourcen mit anderen Containern teilen",
        answerB = "Container koennen nur auf Linux laufen; VMs sind betriebssystemunabhaengig",
        answerC = "Container teilen den Host-Kernel und nutzen Linux-Namespaces und Cgroups fuer Isolation; VMs emulieren vollstaendige Hardware mit eigenem Kernel",
        answerD = "VMs starten schneller als Container, weil sie kein Dateisystem-Layer benoetigen",
        correctAnswer = 2,
        explanation = "Docker-Container teilen den Kernel des Host-Betriebssystems. Linux-Namespaces (PID, Net, Mount, UTS, IPC, User) isolieren Prozesse voneinander; Control Groups (Cgroups) begrenzen Ressourcen (CPU, Memory, I/O). VMs emulieren vollstaendige Hardware und starten ein eigenes Betriebssystem per Hypervisor. Container starten in Millisekunden, VMs in Sekunden bis Minuten.",
        difficulty = 3,
        funFact = "Docker-Container koennen auf Windows mithilfe von WSL2 (Windows Subsystem for Linux 2) laufen — dabei laeuft ein echter Linux-Kernel in einer leichtgewichtigen Hyper-V-VM."
    ),

    // Question 26 — correctAnswer 3
    Question(
        categoryId = 7,
        questionText = "Was ist ein Docker-Layer-Cache und wie beeinflusst er die Optimierung eines Dockerfiles?",
        answerA = "Ein RAM-Cache fuer haeufig ausgefuehrte Container-Befehle, der die Laufzeit beschleunigt",
        answerB = "Docker speichert Container-Images komprimiert auf der Disk, um Speicherplatz zu sparen",
        answerC = "Layer-Caching verhindert, dass dasselbe Base-Image mehrfach heruntergeladen wird",
        answerD = "Jede RUN/COPY/ADD-Anweisung erstellt einen unveraenderbaren Layer; werden fruehe Layers unveraendert gelassen, koennen spaetere aus dem Cache wiederverwendet werden",
        correctAnswer = 3,
        explanation = "Docker-Images bestehen aus gestapelten unveraenderbaren Layern. Wird eine Anweisung in einem Dockerfile geaendert, werden alle darauf folgenden Layers neu gebaut — der Cache wird invalidiert. Deshalb sollten sich seltener aendernde Anweisungen (apt install, Abhaengigkeiten) vor sich haeufig aendernden (Quellcode kopieren) stehen, um Build-Zeiten zu minimieren.",
        difficulty = 3,
        funFact = "Multi-Stage Builds in Docker erlauben es, Build-Tools (Compiler, etc.) in einem fruehen Stage zu verwenden und nur die fertigen Artefakte in das finale schlanke Image zu kopieren."
    ),

    // ── CLOUD-NATIVE — Kubernetes ─────────────────────────────────────────────

    // Question 27 — correctAnswer 0
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem Kubernetes Deployment und einem StatefulSet?",
        answerA = "Deployments sind fuer zustandslose Anwendungen mit austauschbaren Pods; StatefulSets bieten stabile Netzwerkidentitaeten, stabilen Speicher und geordnetes Hoch-/Herunterfahren fuer zustandsbehaftete Anwendungen",
        answerB = "StatefulSets koennen keine Rolling Updates durchfuehren; Deployments schon",
        answerC = "Deployments laufen nur auf einem Knoten; StatefulSets verteilen Pods automatisch auf alle Knoten",
        answerD = "StatefulSets sind fuer Batch-Jobs; Deployments fuer langlebige Services",
        correctAnswer = 0,
        explanation = "Kubernetes Deployments erstellen austauschbare Pods ohne stabile Identitaet — ideal fuer zustandslose Webserver. StatefulSets garantieren stabilen Hostnamen (pod-0, pod-1), stabilen persistenten Speicher (jeder Pod hat eigenen PVC) und geordnetes Starten/Stoppen. Das ist essentiell fuer Datenbanken (MySQL, Cassandra) oder Consensus-Systeme (Zookeeper, etcd).",
        difficulty = 3,
        funFact = "Kubernetes wurde 2014 von Google open-sourced und basiert auf dem internen System 'Borg', das Google seit den fruehen 2000er Jahren betreibt."
    ),

    // Question 28 — correctAnswer 1
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert der Kubernetes-Scheduler beim Platzieren eines neuen Pods?",
        answerA = "Pods werden immer auf dem Knoten mit dem meisten freien RAM platziert",
        answerB = "Der Scheduler filtert ungeeignete Knoten (Predicates) und bewertet dann geeignete Knoten nach Prioritaeten (Priorities); der Knoten mit dem hoechsten Score erhaelt den Pod",
        answerC = "Pods werden Round-Robin ueber alle Knoten verteilt",
        answerD = "Der Scheduler fragt den API-Server, welcher Knoten zuletzt einen Pod erhalten hat, und waehlt den naechsten in der Liste",
        correctAnswer = 1,
        explanation = "Der Kubernetes-Scheduler laeuft in zwei Phasen: Filtering (Predicates) prueft Kriterien wie ResourceRequirements, NodeSelector, Taints/Tolerations und Affinity-Regeln — Knoten die nicht passen werden ausgeschlossen. Scoring (Priorities) bewertet verbleibende Knoten nach Kriterien wie Ressourcenausgewogenheit, Pod-Affinitaet und Image-Lokalitaet. Der Knoten mit dem hoechsten Score gewinnt.",
        difficulty = 3,
        funFact = "Kubernetes erlaubt Custom Scheduler — Unternehmen wie Google nutzen eigene Scheduler-Plugins fuer spezifische Hardware (GPUs, TPUs) oder spezielle Scheduling-Anforderungen."
    ),

    // Question 29 — correctAnswer 2
    Question(
        categoryId = 7,
        questionText = "Was ist der Zweck eines Kubernetes Ingress Controllers?",
        answerA = "Er verhindert, dass externe Anfragen den Cluster erreichen (Firewall-Funktion)",
        answerB = "Er skaliert automatisch Pods basierend auf eingehendem Traffic",
        answerC = "Er fungiert als reverser Proxy und leitet externen HTTP/HTTPS-Traffic basierend auf Host- und Pfad-Regeln an interne Services weiter",
        answerD = "Er verwaltet TLS-Zertifikate und erneuert sie automatisch via Let's Encrypt",
        correctAnswer = 2,
        explanation = "Ein Ingress Controller (z.B. nginx-ingress, Traefik) implementiert Kubernetes-Ingress-Ressourcen. Er agiert als reverser Proxy: Basierend auf Ingress-Regeln leitet er eingehenden HTTP/HTTPS-Traffic nach Hostnamen (api.example.com vs. app.example.com) oder Pfaden (/api vs. /static) an verschiedene Services weiter. TLS-Terminierung ist moeglich, aber nicht sein Kernzweck.",
        difficulty = 3,
        funFact = "cert-manager ist ein separater Kubernetes-Operator, der TLS-Zertifikate via ACME (Let's Encrypt) automatisch anfordert und erneuert — oft zusammen mit einem Ingress Controller eingesetzt."
    ),

    // ── CLOUD-NATIVE — Microservices ──────────────────────────────────────────

    // Question 30 — correctAnswer 3
    Question(
        categoryId = 7,
        questionText = "Was ist das 'Saga Pattern' und wann wird es in Microservice-Architekturen eingesetzt?",
        answerA = "Ein Design Pattern fuer synchrone Request-Response-Kommunikation zwischen Services",
        answerB = "Ein Cache-Pattern, das Datenbankabfragen ueber Service-Grenzen hinweg optimiert",
        answerC = "Ein Deployment-Pattern, bei dem neue Service-Versionen schrittweise eingefuehrt werden",
        answerD = "Ein Pattern zur Verwaltung verteilter Transaktionen ueber mehrere Services, bei dem jeder Schritt eine kompensierende Transaktion hat, falls ein spaeterer Schritt fehlschlaegt",
        correctAnswer = 3,
        explanation = "Das Saga Pattern loest das Problem verteilter Transaktionen ohne 2-Phase-Commit (2PC). Eine Saga ist eine Folge lokaler Transaktionen, von denen jede einen Event veroeffentlicht. Schlaegt ein Schritt fehl, werden kompensatorische Transaktionen (Undo-Operationen) in umgekehrter Reihenfolge ausgefuehrt. Es gibt zwei Varianten: Choreography (Events, kein zentraler Koordinator) und Orchestration (zentraler Saga-Orchestrator).",
        difficulty = 3,
        funFact = "2PC (Two-Phase Commit) in Microservices gilt als Anti-Pattern, da es starke Kopplung und Verfuegbarkeitsprobleme verursacht. Sagas mit eventueller Konsistenz sind die empfohlene Alternative."
    ),

    // Question 31 — correctAnswer 0
    Question(
        categoryId = 7,
        questionText = "Was ist das 'Circuit Breaker Pattern' in Microservice-Architekturen?",
        answerA = "Ein Fehlertoleranz-Pattern, das weitere Anfragen an einen ausgefallenen Service fuer eine Zeitspanne abbricht und so Kaskadenausfaelle verhindert",
        answerB = "Ein Sicherheitsmechanism, der Services den Zugriff verweigert, wenn der API Key ungueltig ist",
        answerC = "Ein Load-Balancing-Pattern, das Traffic gleichmaessig auf gesunde Instanzen verteilt",
        answerD = "Ein Monitoring-Pattern, das Fehlermeldungen automatisch an ein Logging-System sendet",
        correctAnswer = 0,
        explanation = "Der Circuit Breaker (aus dem Buch 'Release It!' von Nygard) hat drei Zustaende: Closed (normal, Requests werden weitergeleitet), Open (nach N Fehlern: Requests sofort ablehnen ohne den Service anzufragen) und Half-Open (nach Timeout: ein Testrequest pruefen ob Service wieder gesund ist). So werden Kaskadenausfaelle verhindert: Ein langsamer Downstream-Service blockiert nicht den gesamten Upstream.",
        difficulty = 3,
        funFact = "Netflix entwickelte Hystrix als erste populaere Circuit-Breaker-Bibliothek. Heute ist Resilience4j der Nachfolger; Service Meshes wie Istio implementieren Circuit Breaking auf Infrastrukturebene."
    ),

    // ── DEVOPS — CI/CD ────────────────────────────────────────────────────────

    // Question 32 — correctAnswer 3
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen Continuous Delivery und Continuous Deployment?",
        answerA = "Continuous Delivery und Continuous Deployment sind Synonyme fuer denselben Prozess",
        answerB = "Continuous Delivery automatisiert nur Tests; Continuous Deployment automatisiert auch den Build-Prozess",
        answerC = "Continuous Deployment gilt nur fuer containerisierte Anwendungen; Continuous Delivery fuer alle",
        answerD = "Bei Continuous Delivery ist jedes Build production-ready und kann manuell deployt werden; bei Continuous Deployment wird jeder erfolgreiche Build automatisch in die Produktion deployt",
        correctAnswer = 3,
        explanation = "Continuous Integration (CI) automatisiert Build und Tests bei jedem Commit. Continuous Delivery (CD) stellt sicher, dass jeder Build production-ready ist und in Staging deployt wird — das finale Deployment in die Produktion erfordert aber manuelle Genehmigung. Continuous Deployment geht weiter: Jeder Build der alle Tests besteht wird automatisch ohne manuellen Eingriff in die Produktion deployt.",
        difficulty = 3,
        funFact = "Amazon deployt angeblich alle 11 Sekunden in die Produktion — ein extremes Beispiel fuer Continuous Deployment in grossem Massstab."
    ),

    // Question 33 — correctAnswer 0
    Question(
        categoryId = 7,
        questionText = "Was ist 'Blue-Green Deployment' und welches Problem loest es?",
        answerA = "Zwei identische Produktionsumgebungen (Blue und Green) werden parallel betrieben; Traffic wird von Blue auf Green umgeschaltet, sobald die neue Version bestaetigt ist — ermoeglicht Zero-Downtime-Deployments und schnelles Rollback",
        answerB = "Ein farbcodiertes Monitoring-System, das kritische Fehler rot und Warnungen gelb markiert",
        answerC = "Eine Deployment-Strategie, bei der neue Features nur fuer bestimmte Nutzergruppen aktiviert werden",
        answerD = "Ein Container-Scheduling-Pattern fuer Kubernetes, das blaue und gruene Pods auf verschiedenen Knoten platziert",
        correctAnswer = 0,
        explanation = "Blue-Green Deployment haelt zwei identische Umgebungen bereit. Die aktive (z.B. Blue) bedient den Produktionstraffic. Die neue Version wird auf Green deployt und getestet. Ein DNS-Switch oder Load-Balancer-Umkonfiguration leitet dann Traffic auf Green um. Bei Problemen reicht ein Revert des Switches fuer sofortiges Rollback — ohne Ausfallzeit.",
        difficulty = 3,
        funFact = "Blue-Green Deployment verdoppelt die Infrastrukturkosten, solange beide Umgebungen parallel laufen. Cloud-Umgebungen mit on-demand Scaling reduzieren diesen Nachteil erheblich."
    ),

    // Question 34 — correctAnswer 1
    Question(
        categoryId = 7,
        questionText = "Was ist 'Canary Deployment' und wie unterscheidet es sich von Blue-Green?",
        answerA = "Canary Deployment aktiviert ein Feature fuer alle Nutzer gleichzeitig; Blue-Green deployt fuer bestimmte IP-Adressen",
        answerB = "Beim Canary Deployment erhaelt nur ein kleiner Prozentsatz des Traffics die neue Version; nach erfolgreicher Validierung wird der Anteil schrittweise erhoeht",
        answerC = "Canary Deployment ist ein anderer Name fuer A/B-Testing",
        answerD = "Beim Canary Deployment wird die alte Version sofort abgeschaltet, sobald die neue bestaetigt ist",
        correctAnswer = 1,
        explanation = "Canary Deployment leitet einen kleinen Traffic-Anteil (z.B. 1-5%) auf die neue Version um. Metriken (Fehlerrate, Latenz, Conversion) werden verglichen. Sind sie gut, wird der Anteil schrittweise erhoeht (1% → 10% → 50% → 100%). Bei Problemen wird nur dieser kleine Traffic-Anteil betroffen — risikoarmes Deployment in die Produktion. Der Begriff stammt von Kanarienvoegeln in Kohleminen als Fruehwarnsystem.",
        difficulty = 3,
        funFact = "Netflix' Kayenta-Tool fuehrt automatisierte Canary-Analysen durch und kann Deployments bei schlechten Metriken automatisch zurueckrollen."
    ),

    // ── DEVOPS — Infrastructure as Code ──────────────────────────────────────

    // Question 35 — correctAnswer 2
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Idempotenz' im Kontext von Infrastructure as Code (IaC)?",
        answerA = "IaC-Skripte koennen nur einmal ausgefuehrt werden; weitere Ausfuehrungen erzeugen einen Fehler",
        answerB = "IaC-Skripte koennen Infrastruktur erstellen, aber nicht loeschen",
        answerC = "Die mehrfache Ausfuehrung eines IaC-Skripts fuehrt immer zum selben Endzustand, unabhaengig davon wie oft es ausgefuehrt wurde",
        answerD = "Idempotenz bedeutet, dass IaC-Aenderungen zuerst in einer Testumgebung validiert werden muessen",
        correctAnswer = 2,
        explanation = "Idempotenz ist eine Kerneigenschaft von IaC-Tools wie Terraform und Ansible. Eine Operation ist idempotent, wenn sie mehrfach ausgefuehrt dasselbe Ergebnis liefert wie einmal ausgefuehrt. Terraform vergleicht den gewuenschten Zustand (State) mit dem aktuellen Zustand der Infrastruktur und fuehrt nur notwendige Aenderungen durch — unabhaengig davon wie oft 'terraform apply' ausgefuehrt wird.",
        difficulty = 3,
        funFact = "Terraform speichert den aktuellen Infrastrukturzustand in einer State-Datei (terraform.tfstate). Ohne diese Datei weiss Terraform nicht, welche Ressourcen es verwaltet — das macht die State-Datei zu einem kritischen, schuetzenswerten Artefakt."
    ),

    // Question 36 — correctAnswer 0
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen deklarativem und imperativem IaC?",
        answerA = "Deklaratives IaC beschreibt den gewuenschten Endzustand; imperatives IaC gibt Schritt-fuer-Schritt-Anweisungen wie dieser Zustand erreicht wird",
        answerB = "Imperatives IaC ist schneller, weil es keine State-Dateien benoetigt",
        answerC = "Deklaratives IaC funktioniert nur fuer Cloud-Ressourcen; imperatives fuer lokale Server",
        answerD = "Beide Ansaetze sind gleichwertig; der Unterschied ist nur stilistischer Natur",
        correctAnswer = 0,
        explanation = "Deklaratives IaC (Terraform, CloudFormation, Kubernetes-Manifeste) beschreibt den Sollzustand — das Tool ermittelt selbst wie es diesen Zustand erreicht. Imperatives IaC (Ansible-Befehle, Shell-Skripte) gibt explizit Schritte an (erstelle Server, installiere Paket, starte Dienst). Deklaratives IaC ist idempotenter und wartbarer; imperatives bietet mehr Kontrolle.",
        difficulty = 3,
        funFact = "Pulumi ist ein modernes IaC-Tool, das deklarative Infrastruktur in echten Programmiersprachen (TypeScript, Python, Go) erlaubt — ein Mittelweg zwischen deklarativer und imperativer Philosophie."
    ),

    // Question 37 — correctAnswer 0
    Question(
        categoryId = 7,
        questionText = "Welches Konzept beschreibt 'GitOps' in modernen DevOps-Pipelines?",
        answerA = "Die gesamte Infrastruktur und Anwendungskonfiguration wird in Git verwaltet; ein Operator ueberwacht das Repository und synchronisiert den Cluster automatisch mit dem Git-Zustand",
        answerB = "Git wird als Datenbank fuer Infrastruktur-Logs verwendet",
        answerC = "GitOps bedeutet, dass Entwickler Deployments manuell aus dem Git-Interface triggern koennen",
        answerD = "Ein CI-System, das automatisch Git-Branches fuer jeden Deployment-Versuch erstellt",
        correctAnswer = 0,
        explanation = "GitOps (gepragt von Weaveworks, 2017) macht Git zum 'Single Source of Truth' fuer den Systemzustand. Tools wie ArgoCD oder Flux ueberwachen Git-Repositories kontinuierlich. Weicht der tatsaechliche Cluster-Zustand vom Git-Zustand ab (Drift), wird er automatisch synchronisiert. Deployments erfolgen durch Git-Commits (Pull Requests) — kein manuelles kubectl apply oder Zugriff auf den Cluster.",
        difficulty = 3,
        funFact = "GitOps verbessert Sicherheit drastisch: Kein menschlicher Operator benoetigt direkten Cluster-Zugriff. Das Audit-Log ist der Git-Commit-Verlauf — vollstaendig, unveraenderlich und verstaendlich."
    ),

    // ── WEITERE TIEFGEHENDE THEMEN ────────────────────────────────────────────

    // Question 38 — correctAnswer 3
    Question(
        categoryId = 7,
        questionText = "Was ist 'Eventual Consistency' und wie unterscheidet sie sich von 'Strong Consistency'?",
        answerA = "Eventual Consistency bedeutet, dass Daten nach einem Absturz wiederhergestellt werden; Strong Consistency bedeutet, dass kein Datenverlust auftritt",
        answerB = "Eventual Consistency gilt fuer Lese-Operationen; Strong Consistency fuer Schreib-Operationen",
        answerC = "Strong Consistency erfordert mehr Speicher, ist aber schneller als Eventual Consistency",
        answerD = "Bei Strong Consistency sieht jeder Lesevorgang den zuletzt geschriebenen Wert; bei Eventual Consistency wird ein Konsistenzzustand nur irgendwann in der Zukunft erreicht",
        correctAnswer = 3,
        explanation = "Strong Consistency (Linearizability) garantiert, dass ein Lesevorgang immer den zuletzt geschriebenen Wert zurueckgibt — als gaebe es ein einzelnes System. Das erfordert Koordination zwischen Knoten und kostet Latenz. Eventual Consistency akzeptiert, dass nach einem Write die Replikate kurzzeitig inkonsistent sind, aber irgendwann konvergieren. DNS ist ein klassisches Beispiel: neue Records propagieren sich verzoegert weltweit.",
        difficulty = 3,
        funFact = "Amazon DynamoDB bietet wahlweise 'Eventually Consistent Reads' (guenstiger, schneller) und 'Strongly Consistent Reads' (doppelter Preis, hoehere Latenz) — der Nutzer entscheidet pro Request."
    ),

    // Question 39 — correctAnswer 1
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen einem 'Service Mesh' und einem API-Gateway?",
        answerA = "Ein API-Gateway verwaltet Ost-West-Traffic (Service-zu-Service); ein Service Mesh verwaltet Nord-Sued-Traffic (extern zu intern)",
        answerB = "Ein API-Gateway steuert eingehenden externen Traffic (Nord-Sued); ein Service Mesh verwaltet Service-zu-Service-Kommunikation innerhalb des Clusters (Ost-West) mit Features wie mTLS, Retries und Observability",
        answerC = "Beide sind Synonyme und beschreiben dasselbe Konzept",
        answerD = "Ein Service Mesh ist ein API-Gateway mit integrierter Datenbank fuer Session-Management",
        correctAnswer = 1,
        explanation = "API-Gateways (Kong, Apigee) sitzen am Cluster-Eingang und steuern eingehenden Traffic: Authentication, Rate Limiting, Routing. Service Meshes (Istio, Linkerd) arbeiten innerhalb des Clusters mit Sidecar-Proxies (Envoy) neben jedem Service: mutual TLS (mTLS), Traffic Management, Circuit Breaking und Telemetrie — ohne Code-Aenderungen an den Services selbst.",
        difficulty = 3,
        funFact = "Istio's Sidecar-Pattern (Envoy-Proxy neben jedem Pod) fuehrt zu Latenz-Overhead von typischerweise 2-3ms. Fuer hochfrequente Microservice-Calls kann das relevant sein."
    ),

    // Question 40 — correctAnswer 2
    Question(
        categoryId = 7,
        questionText = "Was ist 'Zero-Trust Security' im Kontext von Cloud-Native-Architekturen?",
        answerA = "Eine Firewall-Konfiguration, die alle eingehenden Verbindungen standardmaessig blockiert",
        answerB = "Ein Deployment-Modell, bei dem keine Secrets in Umgebungsvariablen gespeichert werden",
        answerC = "Ein Sicherheitsmodell, das keinem Nutzer und keinem Service vertraut, nur weil er im internen Netzwerk ist; jede Anfrage wird explizit authentifiziert und autorisiert",
        answerD = "Ein CI/CD-Pattern, das keine manuellen Approvals fuer Deployments erfordert",
        correctAnswer = 2,
        explanation = "Zero-Trust (John Kindervag, Forrester Research, 2010) verwirft das 'Castle-and-Moat'-Modell (implizites Vertrauen im internen Netz). Prinzipien: Never trust, always verify; Least Privilege (minimale Rechte); Assume Breach. Jede Anfrage — intern wie extern — wird authentifiziert (Identity), autorisiert (Policy) und verschluesselt (mTLS). In Kubernetes implementiert durch RBAC, Network Policies und Service Meshes.",
        difficulty = 3,
        funFact = "Google's 'BeyondCorp'-Modell, entwickelt nach dem Aurora-Angriff 2009, ist die bekannteste Zero-Trust-Implementierung und Grundlage fuer Google's internen Netzwerkzugang ohne VPN."
    ),

    // Question 41 — correctAnswer 1
    Question(
        categoryId = 7,
        questionText = "Was ist 'Observability' in verteilten Systemen und welche drei Saeulen hat sie?",
        answerA = "Die drei Saeulen sind: Security, Availability und Performance",
        answerB = "Observability beschreibt die Faehigkeit, den internen Zustand eines Systems aus externen Outputs zu verstehen; die drei Saeulen sind Logs, Metrics und Traces",
        answerC = "Die drei Saeulen sind: Monitoring, Alerting und Dashboarding",
        answerD = "Observability ist ein anderer Begriff fuer Monitoring und hat keine formalen Saeulen",
        correctAnswer = 1,
        explanation = "Observability (gepragt von Peter Bourgon) geht ueber klassisches Monitoring hinaus: Man kann beliebige Fragen ueber das Systemverhalten beantworten ohne vorab Metriken dafuer definiert zu haben. Die drei Saeulen: Logs (diskrete Ereignisse mit Kontext), Metrics (numerische Zeitreihendaten, effizient aggregierbar), Traces (verteilte Request-Pfade ueber mehrere Services mit Latenz-Breakdowns). OpenTelemetry ist der moderne Standard zur Instrumentierung.",
        difficulty = 3,
        funFact = "Distributed Tracing wurde von Google intern unter dem Namen 'Dapper' entwickelt und im gleichnamigen Paper 2010 veroeffentlicht. Jaeger und Zipkin sind Open-Source-Implementierungen dieser Ideen."
    ),

    // Question 42 — correctAnswer 0
    Question(
        categoryId = 7,
        questionText = "Was beschreibt das 'Backpressure'-Konzept in reaktiven Systemen?",
        answerA = "Eine Technik, bei der der Consumer dem Producer signalisiert, dass er mit der aktuellen Datenrate nicht mithalten kann, und die Produktionsrate drosselt",
        answerB = "Ein Netzwerk-Flow-Control-Mechanismus, der Pakete priorisiert",
        answerC = "Eine Datenbankoptimierung, die Schreiboperationen batchweise verarbeitet",
        answerD = "Ein Cache-Invalidierungsprotokoll, das Aktualisierungen rueckwaerts durch den Stack propagiert",
        correctAnswer = 0,
        explanation = "Backpressure ist ein Mechanismus in reaktiven Systemen (Reactive Streams, Project Reactor, RxJava), bei dem ein Consumer dem Producer mitteilt, wie viele Elemente er verarbeiten kann. Ohne Backpressure wuerden schnelle Producer langsame Consumer ueberfluten und zu Out-of-Memory-Fehlern fuehren. Backpressure propagiert die Kapazitaetsbeschraenkung zurueck durch die gesamte Pipeline.",
        difficulty = 3,
        funFact = "Die Reactive Streams Spezifikation (2013, von Netflix, Pivotal, Lightbend) definiert Backpressure als Pflichtmerkmal; sie wurde in Java 9 als java.util.concurrent.Flow integriert."
    ),

    // Question 43 — correctAnswer 2
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen 'Optimistic Locking' und 'Pessimistic Locking' in Datenbanken?",
        answerA = "Optimistic Locking sperrt die Zeile beim Lesen; Pessimistic Locking prueft beim Schreiben ob Konflikte auftraten",
        answerB = "Pessimistic Locking ist schneller, wird aber nur bei schreibintensiven Workloads eingesetzt",
        answerC = "Optimistic Locking geht davon aus, dass Konflikte selten sind und prueft beim Commit via Versionsnummer; Pessimistic Locking sperrt die Ressource sofort beim ersten Zugriff",
        answerD = "Beide Varianten sind identisch — sie unterscheiden sich nur in der Implementierung",
        correctAnswer = 2,
        explanation = "Optimistic Locking nimmt an, dass Konflikte selten sind. Zeilen haben eine Versionsnummer; beim Commit wird geprueft ob die Version noch aktuell ist — wenn nicht (anderer hat zwischenzeitlich geaendert), schlaegt der Commit fehl. Pessimistic Locking sperrt die Zeile sofort (SELECT FOR UPDATE in SQL) und haelt die Sperre bis zur Transaktion. Optimistic Locking skaliert besser bei wenig Konflikten, Pessimistic bei hoher Konflikthaeufigkeit.",
        difficulty = 3,
        funFact = "Hibernate implementiert Optimistic Locking ueber eine @Version-Annotation — bei jedem Update wird die Version inkrementiert und im WHERE-Clause geprueft."
    ),

    // Question 44 — correctAnswer 3
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'Bloom Filter' und in welchem Kontext werden Bloom Filter in Datenbanken eingesetzt?",
        answerA = "Ein Kompressionsalgorithmus fuer Datenbank-Backups",
        answerB = "Ein Indextyp fuer Volltextsuche in dokumentenbasierten Datenbanken",
        answerC = "Ein Hash-Algorithmus fuer die Schluessel-Verteilung in verteilten Datenbanken",
        answerD = "Eine probabilistische Datenstruktur die mit Sicherheit sagt ob ein Element NICHT enthalten ist, mit einer moeglichen False-Positive-Rate bei positiven Antworten; eingesetzt um unnoetige Disk-Reads zu vermeiden",
        correctAnswer = 3,
        explanation = "Ein Bloom Filter ist eine platzsparende probabilistische Datenstruktur. Ist die Antwort 'nicht enthalten' — definitiv korrekt (keine False Negatives). Ist die Antwort 'enthalten' — moeglicherweise falsch (False Positives moeglich). RocksDB und Cassandra nutzen Bloom Filter pro SSTable: Bevor eine Datei auf Disk gelesen wird, prueft der Bloom Filter ob der Schluessel ueberhaupt existieren koennte — spart teure I/O-Operationen.",
        difficulty = 3,
        funFact = "Ein Bloom Filter fuer 1 Million Elemente mit 1% False-Positive-Rate benoetigt nur ~9.6 Bits pro Element (~1.2 MB) statt ~6 MB fuer eine Hash-Set-Implementierung."
    ),

    // Question 45 — correctAnswer 1
    Question(
        categoryId = 7,
        questionText = "Was ist ein 'LSM Tree' (Log-Structured Merge Tree) und warum verwenden NoSQL-Datenbanken ihn?",
        answerA = "Eine Baumstruktur fuer verteilte Logs in Microservice-Architekturen",
        answerB = "Eine Speicherstruktur die Schreiboperationen durch sequentielle Writes in Memtables und SSTables optimiert; ideal fuer schreibintensive Workloads da Random-Writes vermieden werden",
        answerC = "Ein Indextyp der optimiert ist fuer Range-Queries und Time-Series-Daten",
        answerD = "Eine Alternative zu B-Trees die schnellere Lesezugriffe auf Kosten langsamerer Schreibzugriffe bietet",
        correctAnswer = 1,
        explanation = "LSM Trees schreiben zuerst in eine In-Memory-Struktur (Memtable). Ist diese voll, wird sie als unveraenderliche SSTable (Sorted String Table) auf die Disk geflusht — sequentiell, sehr schnell. Im Hintergrund werden SSTables 'gemergt' (Compaction), um geloeschte Daten zu entfernen und Leseleistung zu verbessern. Genutzt von Cassandra, RocksDB und LevelDB.",
        difficulty = 3,
        funFact = "RocksDB wird von Meta als Grundlage fuer MyRocks (MySQL-Alternative) eingesetzt, um Disk-Space-Nutzung um 50% zu reduzieren."
    ),

    // Question 46 — correctAnswer 2
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen 'Push' und 'Pull'-basierten Monitoring-Systemen am Beispiel von Prometheus?",
        answerA = "Push-Systeme sind genauer; Pull-Systeme sind guenstiger in der Implementierung",
        answerB = "Push-Systeme werden fuer Echtzeit-Alerts eingesetzt; Pull-Systeme fuer historische Analysen",
        answerC = "Bei Pull-Systemen (Prometheus) scrapt das Monitoring-System aktiv Metriken von Services; bei Push-Systemen senden Services ihre Metriken aktiv an einen Aggregator — Pull ermoeglicht bessere Service-Discovery und einfacheres Debugging",
        answerD = "Pull-Systeme koennen keine Alerts generieren; Push-Systeme schon",
        correctAnswer = 2,
        explanation = "Prometheus ist ein Pull-basiertes System: Es scrapt periodisch (z.B. alle 15s) HTTP-Endpoints (/metrics) der Services. Vorteile: einfacheres Debugging (Endpoint manuell aufrufen), Service Discovery via Kubernetes, kein Agent noetig. Push-Systeme (Graphite, InfluxDB mit Telegraf) empfangen Metriken aktiv — besser fuer Batch-Jobs oder Systeme hinter Firewalls.",
        difficulty = 3,
        funFact = "Prometheus wurde 2012 bei SoundCloud entwickelt und ist heute das Standard-Monitoring-System in Kubernetes-Umgebungen. Das CNCF nahm es 2016 als zweites Projekt nach Kubernetes auf."
    ),

    // Question 47 — correctAnswer 1
    Question(
        categoryId = 7,
        questionText = "Was ist 'CQRS' (Command Query Responsibility Segregation) und welches Problem loest es?",
        answerA = "CQRS ist ein Sicherheitspattern, das Lese- und Schreibberechtigungen trennt",
        answerB = "CQRS trennt das Schreib-Modell (Commands, normiert) vom Lese-Modell (Queries, denormiert/optimiert), um Lese- und Schreib-Workloads unabhaengig zu skalieren und zu optimieren",
        answerC = "CQRS ist ein Datenbank-Replikationsprotokoll fuer Master-Slave-Setups",
        answerD = "CQRS definiert wie SQL-Queries in Microservices strukturiert werden sollen",
        correctAnswer = 1,
        explanation = "CQRS (Greg Young, 2010) trennt das System in zwei Modelle: Commands veraendern den Zustand (normiertes Schreib-Modell, optimiert fuer Konsistenz). Queries lesen den Zustand (denormiertes Lese-Modell, optimiert fuer Performance). Beide Seiten koennen unabhaengig skaliert, gecacht und technologisch unterschiedlich implementiert werden. CQRS wird oft mit Event Sourcing kombiniert.",
        difficulty = 3,
        funFact = "CQRS ist kein System-weites Pattern — es sollte selektiv nur fuer Bounded Contexts eingesetzt werden, wo der Unterschied zwischen Lese- und Schreib-Komplexitaet tatsaechlich relevant ist."
    ),

    // Question 48 — correctAnswer 3
    Question(
        categoryId = 7,
        questionText = "Was ist 'Event Sourcing' und wie unterscheidet es sich von traditionellem CRUD?",
        answerA = "Event Sourcing speichert nur den aktuellen Zustand; CRUD speichert alle historischen Zustandsaenderungen",
        answerB = "Event Sourcing ist eine Methode zum Replizieren von CRUD-Operationen zwischen Datenbankinstanzen",
        answerC = "Event Sourcing und CRUD sind synonym; der Unterschied ist nur implementierungsspezifisch",
        answerD = "Bei Event Sourcing wird nicht der aktuelle Zustand gespeichert, sondern die gesamte Folge von Events (Ereignissen); der aktuelle Zustand wird durch Abspielen aller Events rekonstruiert",
        correctAnswer = 3,
        explanation = "Bei CRUD wird der aktuelle Zustand gespeichert — Aenderungen ueberschreiben den vorherigen Wert. Bei Event Sourcing wird jede Zustandsaenderung als unveraenderliches Event gespeichert (OrderPlaced, OrderShipped, OrderCancelled). Der aktuelle Zustand entsteht durch Replay aller Events. Vorteile: vollstaendiger Audit-Log, Zeitreise (Zustand zu beliebigem Zeitpunkt), einfachere Fehleranalyse.",
        difficulty = 3,
        funFact = "Finanzssysteme nutzen Event Sourcing natuerlich: Ein Kontostand ergibt sich aus allen Buchungen. Ledger-basierte Systeme wie Buchhaltung haben dieses Prinzip seit Jahrhunderten verfolgt."
    ),

    // Question 49 — correctAnswer 2
    Question(
        categoryId = 7,
        questionText = "Was ist der Zweck von 'Kubernetes Network Policies' und wie unterscheiden sie sich von Firewalls?",
        answerA = "Network Policies sind Kubernetes-Firewalls die ausschliesslich externen Traffic blockieren",
        answerB = "Network Policies verschluesseln den gesamten Pod-Traffic automatisch mit TLS",
        answerC = "Network Policies definieren erlaubte Pod-zu-Pod-Kommunikation auf Layer-3/4 innerhalb des Clusters (Ost-West-Traffic); ohne Network Policies koennen alle Pods miteinander kommunizieren",
        answerD = "Network Policies ersetzen Kubernetes RBAC fuer die Zugriffskontrolle auf API-Ressourcen",
        correctAnswer = 2,
        explanation = "Standardmaessig koennen alle Pods in einem Kubernetes-Cluster miteinander kommunizieren. Network Policies (implementiert vom CNI-Plugin wie Calico, Cilium, Weave) definieren Whitelist-Regeln: Welche Pods duerfen mit welchen anderen Pods kommunizieren (Ingress) und welche ausgehenden Verbindungen sind erlaubt (Egress). Sie arbeiten auf IP/Port-Ebene (L3/L4) — kein TLS (das ist Aufgabe von Service Meshes).",
        difficulty = 3,
        funFact = "Cilium als CNI-Plugin nutzt eBPF (extended Berkeley Packet Filter) fuer Network Policies — direkt im Linux-Kernel, ohne User-Space-Overhead. Das bietet signifikant bessere Performance als iptables-basierte Implementierungen."
    ),

    // Question 50 — correctAnswer 1
    Question(
        categoryId = 7,
        questionText = "Was ist 'Chaos Engineering' und welches Ziel verfolgt es in modernen Systemen?",
        answerA = "Eine Testmethode, bei der zufaellige Code-Aenderungen eingefuehrt werden um Regression-Bugs zu finden",
        answerB = "Das absichtliche Einfuehren von Fehlern und Ausfaellen in Produktionssysteme, um Schwachstellen in der Resilienz zu identifizieren bevor echte Ausfaelle auftreten",
        answerC = "Ein agiles Framework fuer das Management unstrukturierter Entwicklungsprozesse",
        answerD = "Eine DevOps-Praxis, bei der Deployments absichtlich verzoegert werden, um Probleme fruehzeitig zu erkennen",
        correctAnswer = 1,
        explanation = "Chaos Engineering (gepragt von Netflix, 2010) geht davon aus, dass Ausfaelle unvermeidbar sind. Durch kontrolliertes Einfuehren von Fehlern (Server-Shutdown, Netzwerklatenzen, Datenbankausfaelle) in der Produktion werden Schwachstellen gefunden und behoben bevor ein echter Ausfall auftritt. Netflix' Chaos Monkey terminiert zufaellig Produktions-Instanzen; Chaos Kong simuliert komplette Availability-Zone-Ausfaelle.",
        difficulty = 3,
        funFact = "Der beruehmt-beruechtigte 'Chaos Monkey' von Netflix lief jahrelang aktiv in der Produktion und hat das Engineering-Team gezwungen, wirklich resiliente, selbstheilende Systeme zu bauen."
    )
)
