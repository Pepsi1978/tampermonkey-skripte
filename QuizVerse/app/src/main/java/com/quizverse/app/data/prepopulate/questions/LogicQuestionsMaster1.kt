package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsMaster1(): List<Question> = listOf(

    // --- GÖDEL, HALTEPROBLEM, BERECHENBARKEIT, TURINGMASCHINEN ---

    // Question 1
    Question(
        categoryId = 12,
        questionText = "Gödels erster Unvollständigkeitssatz (1931) besagt, dass jedes hinreichend mächtige konsistente formale System eine Aussage enthält, die in diesem System weder beweisbar noch widerlegbar ist. Welche Voraussetzung an das System ist dabei zwingend erforderlich?",
        answerA = "Das System muss vollständig sein",
        answerB = "Das System muss rekursiv aufzählbar und konsistent sein sowie die Arithmetik der natürlichen Zahlen enthalten",
        answerC = "Das System muss axiomatisch und endlich sein",
        answerD = "Das System muss die Mengenlehre als Grundlage haben",
        correctAnswer = 1,
        explanation = "Gödels erster Unvollständigkeitssatz gilt für formale Systeme, die (1) konsistent sind, (2) rekursiv aufzählbar sind (d.h. ihre Axiome und Ableitungsregeln sind berechenbar) und (3) die elementare Arithmetik der natürlichen Zahlen (Peano-Arithmetik oder stärker) ausdrücken können. Unter diesen Bedingungen existiert eine wahre, aber unbeweisbare Aussage. Vollständigkeit ist gerade das, was das Theorem widerlegt.",
        difficulty = 5,
        funFact = "Gödel konstruierte seine unbeweisbare Aussage mithilfe einer Selbstreferenz: Im Wesentlichen sagt sie 'Ich bin in diesem System nicht beweisbar' — analog zum Lügner-Paradoxon, aber ohne Widerspruch."
    ),

    // Question 2
    Question(
        categoryId = 12,
        questionText = "Was beweist Gödels zweiter Unvollständigkeitssatz?",
        answerA = "Kein konsistentes System kann seine eigene Vollständigkeit beweisen",
        answerB = "Kein hinreichend mächtiges konsistentes formales System kann seine eigene Konsistenz mit den eigenen Mitteln beweisen",
        answerC = "Jedes konsistente System hat unendlich viele unbeweisbare Aussagen",
        answerD = "Die Konsistenz der Arithmetik ist gleichwertig mit der Konsistenz der Mengenlehre",
        correctAnswer = 1,
        explanation = "Gödels zweiter Unvollständigkeitssatz besagt: Ein hinreichend mächtiges konsistentes formales System S kann die Aussage 'S ist konsistent' nicht innerhalb von S beweisen. Dies zerstörte Hilberts Programm, das die Mathematik auf einer sicheren, in sich selbst begründeten Grundlage aufbauen wollte. Die Konsistenz muss stets von außen, in einem stärkeren System, bewiesen werden.",
        difficulty = 5,
        funFact = "David Hilbert hatte 1900 die Axiomatisierung der Mathematik als eines seiner 23 großen Probleme formuliert. Gödel widerlegte 1931 mit 25 Jahren die Möglichkeit dieses Programms."
    ),

    // Question 3
    Question(
        categoryId = 12,
        questionText = "Das Halteproblem ist per Definition unentscheidbar. Welche Beweismethode verwendet Alan Turing, um die Unlösbarkeit des Halteproblems zu zeigen?",
        answerA = "Reduktion auf das Postsche Korrespondenzproblem",
        answerB = "Diagonalisierungsargument — Annahme eines universellen Halte-Entscheiders führt zu einem Widerspruch durch Selbstanwendung",
        answerC = "Zeigen, dass das Problem NP-vollständig ist",
        answerD = "Konstruktion einer Turingmaschine, die alle anderen simuliert",
        correctAnswer = 1,
        explanation = "Turing nimmt an, es gäbe eine Turingmaschine H, die für jedes Paar (M, w) entscheidet, ob Maschine M auf Eingabe w hält. Dann konstruiert er eine Maschine D, die H(M, M) berechnet und anhält, wenn H 'nicht hält' ausgibt, und umgekehrt. Wendet man D auf D selbst an, erhält man einen Widerspruch: D hält genau dann, wenn D nicht hält. Das Diagonalisierungsargument stammt von Cantor.",
        difficulty = 5,
        funFact = "Turings Beweis von 1936 erschien in 'On Computable Numbers, with an Application to the Entscheidungsproblem' — ein Aufsatz, der den theoretischen Computer vor dem physischen Computer definierte."
    ),

    // Question 4
    Question(
        categoryId = 12,
        questionText = "Eine universelle Turingmaschine (UTM) kann jede andere Turingmaschine simulieren. Welche minimale Anzahl von Zuständen und Symbolen ist für eine UTM nachweislich ausreichend?",
        answerA = "Mindestens 100 Zustände und 10 Symbole",
        answerB = "Mindestens 7 Zustände und 4 Symbole — kleinere UTMs existieren mit 2 Symbolen und 18 Zuständen oder 4 Symbolen und 7 Zuständen",
        answerC = "Mindestens 2 Zustände und 2 Symbole",
        answerD = "Es gibt keine bekannte minimale Grenze",
        correctAnswer = 1,
        explanation = "Minsky zeigte 1962 eine UTM mit 7 Zuständen und 4 Symbolen. Spätere Forschung (Rogozhin, 1996) reduzierte dies auf 4 Zustände und 6 Symbole. Eine 2-Zustands-UTM ist möglich, aber mit vielen Symbolen. Die kleinste bekannte UTM hat 2 Zustände und 18 Symbole (Minsky) oder 4 Zustände und 2 Symbole in schwachen Kodierungsmodellen. Die genaue Grenze ist ein offenes Forschungsgebiet.",
        difficulty = 5,
        funFact = "Die kleinste Turingmaschine, für die Unentscheidbarkeit des Haltens bewiesen wurde, hat nur 3 Zustände und 3 Symbole — ein Ergebnis aus einem Wettbewerb, den Stephen Wolfram 2007 ausschrieb."
    ),

    // Question 5
    Question(
        categoryId = 12,
        questionText = "Satz von Rice: Was besagt er über nicht-triviale semantische Eigenschaften von Turingmaschinen?",
        answerA = "Jede semantische Eigenschaft von Turingmaschinen ist entscheidbar",
        answerB = "Jede nicht-triviale semantische Eigenschaft der durch Turingmaschinen berechneten Funktionen ist unentscheidbar",
        answerC = "Semantische Eigenschaften können nur für endliche Automaten entschieden werden",
        answerD = "Der Satz gilt nur für das Halteproblem, nicht für allgemeine Eigenschaften",
        correctAnswer = 1,
        explanation = "Rices Satz (1953) ist eine massive Verallgemeinerung des Halteproblems: Sei P eine nicht-triviale Eigenschaft partiell berechenbarer Funktionen (d.h. P gilt für manche, aber nicht alle). Dann ist die Frage 'Berechnet TM M eine Funktion mit Eigenschaft P?' unentscheidbar. 'Nicht-trivial' bedeutet: P gilt weder für alle noch für keine Maschinen. Dies macht fast alle interessanten Fragen über Programmverhalten unentscheidbar.",
        difficulty = 5,
        funFact = "Eine direkte Konsequenz von Rices Satz: Kein perfekter Virus-Scanner kann existieren, der alle Viren erkennt. Viren-Erkennung ist ein semantisches Problem und daher unentscheidbar."
    ),

    // Question 6
    Question(
        categoryId = 12,
        questionText = "Die Church-Turing-These besagt, dass jede intuitiv berechenbare Funktion durch eine Turingmaschine berechenbar ist. Was ist der Status dieser These?",
        answerA = "Sie ist ein bewiesener mathematischer Satz",
        answerB = "Sie ist eine empirisch gut gestützte, aber prinzipiell unbeweisbare philosophische These über den Begriff 'Berechenbarkeit'",
        answerC = "Sie wurde durch Quantencomputer widerlegt",
        answerD = "Sie gilt nur für deterministische Berechnungen",
        correctAnswer = 1,
        explanation = "Die Church-Turing-These kann nicht bewiesen werden, weil sie den informellen Begriff 'intuitiv berechenbar' mit dem formalen Begriff 'Turing-berechenbar' gleichsetzt. Der informelle Begriff hat keine mathematische Definition. Empirisch spricht alles für die These: Lambda-Kalkül (Church), Turing-Maschinen, Markov-Algorithmen, Registermaschinen — alle zeigen die gleiche Berechnungsstärke. Quantencomputer berechnen dieselben Funktionen, aber möglicherweise schneller.",
        difficulty = 5,
        funFact = "Alonzo Church und Alan Turing entwickelten ihre äquivalenten Formalismen (Lambda-Kalkül und Turingmaschinen) unabhängig voneinander im Jahr 1936 — ein historischer Zufall der Ideengeschichte."
    ),

    // Question 7
    Question(
        categoryId = 12,
        questionText = "Was versteht man unter dem Begriff 'Orakel-Turingmaschine' in der Komplexitätstheorie?",
        answerA = "Eine Turingmaschine mit zufälligem Zugriff auf ein unendliches Speicherband",
        answerB = "Eine Turingmaschine, die in einem einzigen Schritt Antworten auf Fragen an ein externes Orakel-Band abfragen kann — zur Untersuchung relativer Berechenbarkeit",
        answerC = "Eine Turingmaschine, die Zufallszahlen erzeugen kann",
        answerD = "Eine nicht-deterministische Turingmaschine mit polynomieller Laufzeit",
        correctAnswer = 1,
        explanation = "Eine Orakel-Turingmaschine hat Zugang zu einem 'Orakel' — einem schwarzen Kasten, der Anfragen in O(1) Zeit beantwortet. Mit Orakel A erhält man die Klasse P^A (Probleme in polynomieller Zeit lösbar mit Orakel A). Orakel-Reduktionen definieren Turing-Reduktionen und erlauben die Untersuchung relativer Schwierigkeit von Problemen. Baker, Gill und Solovay zeigten 1975: Es gibt Orakel A und B, sodass P^A = NP^A und P^B ≠ NP^B.",
        difficulty = 5,
        funFact = "Das Baker-Gill-Solovay-Resultat bedeutet: Die P-vs-NP-Frage kann nicht durch reine 'Relativierungs'-Argumente gelöst werden — eine fundamentale Schranke für Beweisstrategien."
    ),

    // Question 8
    Question(
        categoryId = 12,
        questionText = "Was ist das 'Busy Beaver'-Problem und warum ist es nicht berechenbar?",
        answerA = "Das Problem, die maximale Anzahl an Schritten einer n-Zustands-Turingmaschine zu finden, die hält — nicht berechenbar, da es das Halteproblem lösen würde",
        answerB = "Das Problem, die schnellste Turingmaschine für ein gegebenes Problem zu finden",
        answerC = "Das Problem, die minimale Anzahl von Zuständen für eine universelle Turingmaschine zu finden",
        answerD = "Das Problem, die maximale Komprimierung einer beliebigen Eingabe zu finden",
        correctAnswer = 0,
        explanation = "Die Busy-Beaver-Funktion Σ(n) gibt die maximale Anzahl von '1'-Symbolen an, die eine haltende n-Zustands-Turingmaschine (mit 2 Symbolen, leeres Band) auf das Band schreiben kann. Σ wächst schneller als jede berechenbare Funktion und ist daher selbst nicht berechenbar. Könnte man Σ(n) für alle n berechnen, könnte man das Halteproblem lösen: Eine Maschine, die nach mehr als Σ(n) Schritten noch läuft, hält nie.",
        difficulty = 5,
        funFact = "Σ(4) = 13, Σ(5) ≥ 47.176.870 (bestätigt 2024), Σ(6) ist astronomisch groß und unbekannt. Die Busy-Beaver-Funktion überwächst jede berechenbare Funktion: Σ(n) > f(n) für jede berechenbare f ab einem gewissen n."
    ),

    // Question 9
    Question(
        categoryId = 12,
        questionText = "Welche Aussage über das Äquivalenzproblem zweier Turingmaschinen ist korrekt?",
        answerA = "Es ist entscheidbar, weil man beide Maschinen parallel simulieren kann",
        answerB = "Es ist unentscheidbar und nicht einmal rekursiv aufzählbar — es liegt auf einer höheren Ebene der arithmetischen Hierarchie als das Halteproblem",
        answerC = "Es ist entscheidbar für deterministische Maschinen, aber nicht für nicht-deterministische",
        answerD = "Es ist NP-vollständig",
        correctAnswer = 1,
        explanation = "Das Äquivalenzproblem ('Berechnen M1 und M2 dieselbe Funktion?') ist nicht nur unentscheidbar, es ist nicht einmal ko-rekursiv aufzählbar. Es liegt auf Stufe Π₂⁰ der arithmetischen Hierarchie (Post-Hierarchie), eine Ebene über dem Halteproblem. Intuitiv: Man kann weder einen Algorithmus angeben, der alle äquivalenten Paare auflistet, noch einen, der alle nicht-äquivalenten Paare auflistet.",
        difficulty = 5,
        funFact = "Die arithmetische Hierarchie (Σ₀, Π₀, Σ₁, Π₁, ...) beschreibt Grade der Unlösbarkeit. Das Halteproblem liegt auf Σ₁⁰, das Äquivalenzproblem auf Π₂⁰ — eine tatsächlich härtere Klasse von Problemen."
    ),

    // Question 10
    Question(
        categoryId = 12,
        questionText = "Was ist eine 'Turing-Vollständigkeit' und welche minimale Eigenschaft muss ein formales System besitzen, um Turing-vollständig zu sein?",
        answerA = "Das System muss Hardware direkt ansprechen können",
        answerB = "Das System muss beliebige Berechnungen ausführen können — dazu reichen Bedingte Verzweigung und unbegrenzte Iteration (oder Rekursion)",
        answerC = "Das System muss parallele Berechnungen unterstützen",
        answerD = "Das System muss Gleitkommazahlen verarbeiten können",
        correctAnswer = 1,
        explanation = "Turing-Vollständigkeit bedeutet, dass ein System jede berechenbare Funktion berechnen kann. Hinreichend sind: (1) bedingte Verzweigung (if/then/else oder äquivalent) und (2) unbegrenzte Iteration oder Rekursion sowie (3) beliebig viel Speicher (theoretisch). Erstaunlich viele Systeme sind Turing-vollständig: Conway's Game of Life, CSS3+HTML5, Magic: The Gathering Regelwerk, Excel-Formeln und sogar bestimmte SQL-Dialekte.",
        difficulty = 5,
        funFact = "Das Spiel Minecraft ist Turing-vollständig — Spieler haben innerhalb des Spiels funktionierende Computer gebaut, inklusive einer laufenden Instanz von Minecraft selbst."
    ),

    // Question 11
    Question(
        categoryId = 12,
        questionText = "Das Post'sche Korrespondenzproblem (PCP) ist ein klassisches unentscheidbares Problem. Was ist seine Grundfrage?",
        answerA = "Ob zwei Mengen von Wörtern dieselbe Sprache erzeugen",
        answerB = "Ob aus einer gegebenen endlichen Menge von Wort-Paaren (u_i, v_i) eine endliche Folge von Indizes existiert, sodass die Verkettung der u-Wörter gleich der Verkettung der v-Wörter ist",
        answerC = "Ob ein Wort von einem Kellerautomaten akzeptiert wird",
        answerD = "Ob zwei kontextfreie Grammatiken dieselbe Sprache erzeugen",
        correctAnswer = 1,
        explanation = "Das PCP (Post, 1946) fragt: Gegeben eine endliche Menge von Dominosteinen {(u₁,v₁), ..., (uₙ,vₙ)} mit Wörtern über einem Alphabet. Gibt es eine endliche Folge i₁, i₂, ..., iₖ (Wiederholung erlaubt), sodass u_{i₁}u_{i₂}...u_{iₖ} = v_{i₁}v_{i₂}...v_{iₖ}? Dies ist unentscheidbar und dient oft als Zwischenschritt beim Beweisen anderer Unentscheidbarkeiten (z.B. Äquivalenz kontextfreier Grammatiken).",
        difficulty = 5,
        funFact = "Das PCP ist so fundamental, dass es als 'Mutter der Unentscheidbarkeitsbeweise' gilt: Viele komplexe Unentscheidbarkeiten werden auf das PCP zurückgeführt, statt direkt auf das Halteproblem."
    ),

    // Question 12
    Question(
        categoryId = 12,
        questionText = "Welche Komplexitätsklasse beschreibt die durch eine nicht-deterministische Turingmaschine in polynomieller Zeit akzeptierten Sprachen?",
        answerA = "PSPACE",
        answerB = "NP",
        answerC = "EXPTIME",
        answerD = "co-NP",
        correctAnswer = 1,
        explanation = "NP (Nichtdeterministische Polynomialzeit) ist die Klasse der Sprachen L, für die eine nicht-deterministische Turingmaschine existiert, die Eingaben in L in polynomieller Zeit akzeptiert. Äquivalent: L ∈ NP genau dann, wenn es einen polynomiellen Verifizierer gibt — d.h. ein Algorithmus, der bei Eingabe (x, Zertifikat c) in polynomieller Zeit verifiziert, ob x ∈ L. Die Frage P = NP ist das berühmteste offene Problem der Informatik.",
        difficulty = 5,
        funFact = "NP steht für 'Nondeterministic Polynomial', nicht für 'Non-Polynomial'. Diese häufige Verwechslung führt zu Missverständnissen: NP-Probleme können (soweit bekannt) in exponentieller Zeit gelöst werden, Lösungen aber in polynomieller Zeit verifiziert werden."
    ),

    // Question 13
    Question(
        categoryId = 12,
        questionText = "Gödels Vollständigkeitssatz (1930) — nicht zu verwechseln mit dem Unvollständigkeitssatz — besagt welche fundamentale Aussage?",
        answerA = "Jede wahre arithmetische Aussage ist beweisbar",
        answerB = "Jede allgemein gültige Formel der Prädikatenlogik erster Stufe ist in einem vollständigen Kalkül beweisbar",
        answerC = "Jedes konsistente System hat ein Modell",
        answerD = "Die Prädikatenlogik zweiter Stufe ist vollständig",
        correctAnswer = 1,
        explanation = "Gödels Vollständigkeitssatz (1930, Dissertation) besagt: Jede allgemein gültige (in allen Interpretationen wahre) Formel der Prädikatenlogik erster Stufe ist durch den Hilbert-Kalkül (oder äquivalente Kalküle) ableitbar. Semantische Allgemeingültigkeit (⊨ φ) entspricht syntaktischer Ableitbarkeit (⊢ φ). Dies gilt nur für Prädikatenlogik erster Stufe; Logik zweiter Stufe ist unvollständig.",
        difficulty = 5,
        funFact = "Gödel bewies 1929 den Vollständigkeitssatz als 22-jähriger Doktorand und 1931 den Unvollständigkeitssatz. Diese scheinbar widersprüchlichen Sätze gelten für verschiedene Systeme: Vollständigkeit für die Logik, Unvollständigkeit für die Arithmetik."
    ),

    // Question 14
    Question(
        categoryId = 12,
        questionText = "Was ist eine 'rekursiv aufzählbare' (r.a.) Sprache, und wie unterscheidet sie sich von einer 'rekursiven' (entscheidbaren) Sprache?",
        answerA = "Beide Begriffe bedeuten dasselbe — jede r.a. Sprache ist entscheidbar",
        answerB = "Eine r.a. Sprache wird von einer Turingmaschine akzeptiert (die bei Nicht-Mitgliedern divergieren darf); eine entscheidbare Sprache wird von einer TM entschieden (hält immer mit Ja/Nein)",
        answerC = "R.a. Sprachen sind genau die von endlichen Automaten erkannten Sprachen",
        answerD = "Entscheidbare Sprachen sind eine echte Teilmenge der r.a. Sprachen, und beide Klassen sind identisch mit kontextfreien Sprachen",
        correctAnswer = 1,
        explanation = "Eine Sprache L ist rekursiv aufzählbar (RE), wenn eine Turingmaschine M existiert, die für x ∈ L hält (und akzeptiert), für x ∉ L aber möglicherweise nicht terminiert. L ist rekursiv (entscheidbar), wenn M für alle Eingaben hält: Ja für x ∈ L, Nein für x ∉ L. Entscheidbare Sprachen ⊊ RE. Das Komplement des Halteproblems ist in RE, aber nicht entscheidbar — und sein Komplement liegt nicht in RE.",
        difficulty = 5,
        funFact = "Die Chomsky-Hierarchie: Reguläre ⊊ Kontextfreie ⊊ Kontextsensitive ⊊ Rekursive ⊊ RE ⊊ alle Sprachen. Jede Einschlussstufe ist echt: Es gibt Sprachen auf jeder Ebene, die nicht in der niedrigeren liegen."
    ),

    // Question 15
    Question(
        categoryId = 12,
        questionText = "Welche Aussage über das Minimierungsproblem für Turingmaschinen ist korrekt?",
        answerA = "Man kann immer die kleinste äquivalente Turingmaschine algorithmisch berechnen",
        answerB = "Das Problem, ob eine gegebene Turingmaschine minimal ist (keine kleinere äquivalente existiert), ist unentscheidbar",
        answerC = "Minimierung ist möglich, aber nur in exponentieller Zeit",
        answerD = "Minimierung ist entscheidbar für 2-Band-Turingmaschinen",
        correctAnswer = 1,
        explanation = "Das Minimierungsproblem für Turingmaschinen ist unentscheidbar, da es das Äquivalenzproblem als Teilproblem enthält. Im Gegensatz dazu: Für endliche Automaten (DFA) ist Minimierung durch den Myhill-Nerode-Satz effizient möglich (O(n log n) mit Hopcraft-Algorithmus). Die Unterscheidbarkeit von Turingmaschinen und endlichen Automaten zeigt sich hier fundamental.",
        difficulty = 5,
        funFact = "Für deterministische Kellerautomaten (DPDA) ist Minimierung entscheidbar, aber PSPACE-vollständig — eines der wenigen natürlichen PSPACE-vollständigen Probleme mit praktischer Relevanz."
    ),

    // Question 16
    Question(
        categoryId = 12,
        questionText = "Was ist das Akzeptanzproblem (A_TM) und wo liegt es in der arithmetischen Hierarchie?",
        answerA = "A_TM ist entscheidbar und liegt in P",
        answerB = "A_TM = {⟨M,w⟩ | M ist eine TM, die w akzeptiert} liegt auf Stufe Σ₁⁰ — rekursiv aufzählbar, aber nicht entscheidbar",
        answerC = "A_TM liegt auf Stufe Π₁⁰ — ko-rekursiv aufzählbar",
        answerD = "A_TM ist äquivalent zum Äquivalenzproblem",
        correctAnswer = 1,
        explanation = "A_TM = {⟨M,w⟩ | M akzeptiert w} ist das Akzeptanzproblem und liegt auf Σ₁⁰ der arithmetischen Hierarchie. Es ist rekursiv aufzählbar (man kann alle akzeptierenden Läufe aufzählen), aber nicht entscheidbar. Sein Komplement Ā_TM liegt auf Π₁⁰ und ist nicht r.a. Das Halteproblem HALT_TM ist Turing-äquivalent zu A_TM: Sie sind gegenseitig aufeinander reduzierbar.",
        difficulty = 5,
        funFact = "Die arithmetische Hierarchie (Kleene, 1943) beschreibt eine unendliche Stufenleiter der Unlösbarkeit: Σ₁⁰ ⊊ Σ₂⁰ ⊊ ... ⊊ Σ_ω⁰ ⊊ ... Jede Ebene enthält Probleme, die streng schwieriger sind als alle Probleme darunter."
    ),

    // Question 17
    Question(
        categoryId = 12,
        questionText = "Was besagt das Satz von Kleene (Rekursionstheorem) in der Berechenbarkeitstheorie?",
        answerA = "Jede rekursive Funktion hat einen Fixpunkt",
        answerB = "Für jede berechenbare Funktion f gibt es eine Turingmaschine e, sodass die von e berechnete Funktion mit der von f(e) berechneten Funktion übereinstimmt",
        answerC = "Jede Turingmaschine kann durch eine primitive rekursive Funktion beschrieben werden",
        answerD = "Die Klasse der rekursiven Funktionen ist abgeschlossen unter allen logischen Operationen",
        correctAnswer = 1,
        explanation = "Kleenes Rekursionstheorem (1938) besagt: Für jede berechenbare Funktion f: ℕ→ℕ gibt es einen Index e, sodass φ_e = φ_{f(e)}, wobei φ_e die vom e-ten Programm berechnete Funktion ist. Anschaulich: Es gibt ein Programm, das dieselbe Funktion berechnet wie das Programm, das man erhält, wenn man die Beschreibung des ersten Programms in f steckt. Dies erlaubt elegante Konstruktionen selbstreferentieller Programme.",
        difficulty = 5,
        funFact = "Das Rekursionstheorem ist die mathematische Grundlage für Quine-Programme (Programme, die ihre eigene Quelle ausgeben). Kleene nutzte es auch, um Gödels Unvollständigkeitssatz auf elegantere Weise zu beweisen."
    ),

    // Question 18
    Question(
        categoryId = 12,
        questionText = "Was unterscheidet eine 'primitiv rekursive' Funktion von einer allgemein rekursiven (μ-rekursiven) Funktion?",
        answerA = "Primitiv rekursive Funktionen sind genau die berechenbaren Funktionen",
        answerB = "Primitiv rekursive Funktionen verwenden nur beschränkte Rekursion (Schleifenrekursion mit festem Abbruchkriterium); μ-rekursive Funktionen erlauben zusätzlich den unbeschränkten Minimierungsoperator μ",
        answerC = "μ-rekursive Funktionen sind eine echte Teilmenge der primitiv rekursiven",
        answerD = "Beide Klassen sind identisch und berechnen genau die Turing-berechenbaren Funktionen",
        correctAnswer = 1,
        explanation = "Primitiv rekursive (PR) Funktionen sind aus Null, Nachfolger und Projektion durch Komposition und primitive Rekursion (Induktion über einen Parameter) aufgebaut. Alle PR-Funktionen sind total und berechenbar, aber nicht alle berechenbaren Funktionen sind PR: Ackermann's Funktion ist total berechenbar, aber nicht PR. μ-rekursive Funktionen fügen den unbeschränkten Minimierungsoperator hinzu: μy[f(x,y)=0] sucht das kleinste y — kann divergieren. Klasse der μ-rekursiven Funktionen = Turing-berechenbar.",
        difficulty = 5,
        funFact = "Die Ackermann-Funktion A(m,n) wächst so schnell, dass sie für m ≥ 4 bereits für sehr kleine Eingaben astronomische Werte annimmt: A(4,2) hat 19.729 Dezimalstellen."
    ),

    // Question 19
    Question(
        categoryId = 12,
        questionText = "Eine Turingmaschine M hat Zeit-Komplexität T(n), wenn sie für alle Eingaben der Länge n nach spätestens T(n) Schritten hält. Welche Ressource wird bei der Platz-Komplexität gemessen?",
        answerA = "Die Anzahl der Übergänge im Zustandsdiagramm",
        answerB = "Die maximale Anzahl der verwendeten Band-Zellen auf allen Eingaben der Länge n",
        answerC = "Die Anzahl der verschiedenen Symbole auf dem Band",
        answerD = "Die Tiefe des Berechnungsbaums bei nicht-deterministischen Maschinen",
        correctAnswer = 1,
        explanation = "Platz-Komplexität S(n) misst die maximale Anzahl der Bandzellen, die M auf irgendeiner Eingabe der Länge n verwendet. Zeit und Platz sind verschiedene Ressourcen: PSPACE enthält NP und co-NP, und PSPACE ⊆ EXPTIME. Es gilt: S(n) ≥ log(T(n)) (da T(n) Konfigurationen in S(n) Bits kodierbar sein müssen), aber Zeit und Platz können dramatisch divergieren.",
        difficulty = 5,
        funFact = "Savitchs Theorem (1970) zeigt: NSPACE(f(n)) ⊆ DSPACE(f(n)²) — nicht-deterministischer Platz kann deterministisch mit quadratisch mehr Platz simuliert werden. Für Zeit gilt kein analoges Resultat."
    ),

    // Question 20
    Question(
        categoryId = 12,
        questionText = "Was ist das 'Busy Beaver Sigma'-Wert Σ(5) und warum ist seine genaue Bestimmung so schwierig?",
        answerA = "Σ(5) = 1.915 und ist durch erschöpfende Suche berechenbar",
        answerB = "Σ(5) ≥ 47.176.870 und seine Bestimmung erfordert das Lösen des Halteproblems für viele Maschinen — einige hängen mit Vermutungen wie Goldbach zusammen",
        answerC = "Σ(5) ist per Definition unbekannt, da 5-Zustands-Maschinen nicht simulierbar sind",
        answerD = "Σ(5) = ∞, da es eine haltende 5-Zustands-Maschine mit unendlicher Ausgabe gibt",
        correctAnswer = 1,
        explanation = "Σ(5) ≥ 47.176.870 ist ein bestätigter Unterwert (durch Konstruktion konkreter Maschinen). Der exakte Wert ist unbekannt, weil einige 5-Zustands-Kandidaten unentscheidbar lang laufen. Einige der letzten unentschiedenen 5-Zustands-Maschinen hängen mit zahlentheoretischen Vermutungen zusammen (Halteverhalten äquivalent zu Goldbach oder ähnlichem). Man müsste diese Vermutungen lösen, um Σ(5) exakt zu bestimmen.",
        difficulty = 5,
        funFact = "Im Jahr 2024 bewies eine Community aus Hobby-Mathematikern und KI-Assistenten, dass Σ(5) = 47.176.870 — durch Analyse aller verbleibenden Kandidatenmaschinen. Dies ist einer der ersten Fälle, wo ein mathematisches Problem durch Mensch-KI-Kollaboration gelöst wurde."
    ),

    // Question 21
    Question(
        categoryId = 12,
        questionText = "Welches Ergebnis folgt aus der Kombination von Gödels Vollständigkeitssatz und seinem ersten Unvollständigkeitssatz?",
        answerA = "Die Prädikatenlogik ist vollständig, aber Arithmetik zweiter Ordnung ist unvollständig",
        answerB = "Prädikatenlogik erster Stufe ist vollständig, aber kein rekursiv aufzählbares System, das Arithmetik enthält, ist vollständig — Vollständigkeit und Mächtigkeit sind unvereinbar",
        answerC = "Die Arithmetik ist vollständig, aber die Logik ist unvollständig",
        answerD = "Beide Sätze gelten nur in ZFC-Mengenlehre, nicht in schwächeren Systemen",
        correctAnswer = 1,
        explanation = "Der Vollständigkeitssatz gilt für die Prädikatenlogik erster Stufe als reines Schlusssystem. Der Unvollständigkeitssatz gilt für formale Systeme, die stark genug sind, um elementare Arithmetik zu kodieren. Die Kombination zeigt: Sobald ein System mächtig genug wird (Arithmetik enthält), verliert es seine Vollständigkeit. Reine Logik (ohne Arithmetik) kann vollständig sein; Logik plus Arithmetik kann es nicht.",
        difficulty = 5,
        funFact = "Tarski bewies 1948 die Vollständigkeit und Entscheidbarkeit der elementaren euklidischen Geometrie (ohne Arithmetik der ganzen Zahlen). Dies zeigt: Nicht alle interessanten mathematischen Theorien sind unvollständig."
    ),

    // Question 22
    Question(
        categoryId = 12,
        questionText = "Was ist eine 'Turing-Reduktion' (auch Cook-Reduktion) und wie unterscheidet sie sich von einer Many-One-Reduktion?",
        answerA = "Turing-Reduktionen sind schwächer als Many-One-Reduktionen",
        answerB = "Bei einer Turing-Reduktion von A auf B darf man B als Orakel mehrfach abfragen; bei einer Many-One-Reduktion wird jede Instanz von A genau einmal auf eine Instanz von B abgebildet",
        answerC = "Beide Reduktionstypen sind in polynomieller Zeit äquivalent",
        answerD = "Turing-Reduktionen gelten nur für unentscheidbare Probleme",
        correctAnswer = 1,
        explanation = "Bei einer Many-One-Reduktion (Karp-Reduktion in polynomieller Zeit) wird eine Eingabe x für Problem A auf eine Eingabe f(x) für Problem B abgebildet, und x ∈ A ⟺ f(x) ∈ B. Bei einer Turing-Reduktion (Cook-Reduktion) darf ein Algorithmus für A das Orakel für B beliebig oft, mit verschiedenen Anfragen, adaptiv abfragen. Turing-Reduktionen sind streng mächtiger: A ≤_m B impliziert A ≤_T B, aber nicht umgekehrt.",
        difficulty = 5,
        funFact = "Die Klasse P^NP (Polynomialzeit mit NP-Orakel) enthält Probleme wie 'Gibt es genau k erfüllende Belegungen?' — diese sind Many-One-schwieriger als NP, aber unter Turing-Reduktionen in polynomieller Zeit äquivalent zu NP."
    ),

    // Question 23
    Question(
        categoryId = 12,
        questionText = "Was ist das Lambda-Kalkül und welche grundlegende Eigenschaft macht es Turing-vollständig?",
        answerA = "Lambda-Kalkül ist eine Programmiersprache mit Typensystem und ist nur eingeschränkt berechenbar",
        answerB = "Lambda-Kalkül ist ein formales System mit Funktionsabstraktion (λx.t) und -applikation; es ist Turing-vollständig durch die Möglichkeit, Selbstreferenz (Y-Kombinator) zu kodieren",
        answerC = "Lambda-Kalkül ist eine Erweiterung der Prädikatenlogik zweiter Stufe",
        answerD = "Lambda-Kalkül ist nur für endliche Berechnungen geeignet",
        correctAnswer = 1,
        explanation = "Der ungetypte Lambda-Kalkül (Church, 1932) besteht aus: Variablen, Abstraktion (λx.t bedeutet 'Funktion die x auf t abbildet') und Applikation ((t u) bedeutet 'wende t auf u an'). Er ist Turing-vollständig, da man natürliche Zahlen (Church-Ziffern), boolesche Werte und den Y-Kombinator (Y = λf.(λx.f(x x))(λx.f(x x))) kodieren kann. Y ermöglicht Rekursion ohne explizite Selbstreferenz.",
        difficulty = 5,
        funFact = "Haskell, Lisp, ML und viele andere funktionale Sprachen basieren auf dem Lambda-Kalkül. Der getypte Lambda-Kalkül (Curry-Howard-Isomorphismus) entspricht direkt der intuitionistischen Logik — Programme sind Beweise."
    ),

    // Question 24
    Question(
        categoryId = 12,
        questionText = "Was beschreibt der Satz von Myhill-Nerode in der Automatentheorie?",
        answerA = "Jeder nicht-deterministische Automat kann in einen deterministischen umgewandelt werden",
        answerB = "Eine Sprache L ist genau dann regulär, wenn die Nerode-Rechts-Kongruenz (x ≡ y falls für alle z gilt: xz ∈ L ⟺ yz ∈ L) endlich viele Äquivalenzklassen hat",
        answerC = "Reguläre Sprachen sind abgeschlossen unter Komplement und Schnitt",
        answerD = "Für jede reguläre Sprache gibt es einen eindeutigen minimalen DFA",
        correctAnswer = 1,
        explanation = "Der Myhill-Nerode-Satz (1958) gibt eine notwendige und hinreichende Bedingung für Regularität: L ist regulär ⟺ die Nerode-Kongruenz ≡_L hat endlich viele Äquivalenzklassen. Die Nerode-Relation: x ≡_L y, falls ∀z: xz ∈ L ⟺ yz ∈ L. Die Anzahl der Klassen entspricht genau der Anzahl der Zustände des minimalen DFA. Damit kann man beweisen, dass eine Sprache nicht regulär ist: Man zeigt unendlich viele Klassen.",
        difficulty = 5,
        funFact = "Der Myhill-Nerode-Satz ist stärker als das Pumping-Lemma: Er gibt eine notwendige UND hinreichende Bedingung, während das Pumping-Lemma nur notwendig ist. Es gibt nicht-reguläre Sprachen, die das Pumping-Lemma erfüllen!"
    ),

    // Question 25
    Question(
        categoryId = 12,
        questionText = "Was ist das 'Totale Halteproblem' (TOTAL_TM) und welche Eigenschaft hat es bezüglich der arithmetischen Hierarchie?",
        answerA = "Es liegt auf Σ₁⁰ — rekursiv aufzählbar",
        answerB = "TOTAL_TM = {⟨M⟩ | M hält auf allen Eingaben} liegt auf Π₂⁰ — nicht r.a. und nicht ko-r.a.",
        answerC = "Es ist entscheidbar, da man alle Eingaben in polynomieller Zeit prüfen kann",
        answerD = "Es liegt auf Σ₂⁰",
        correctAnswer = 1,
        explanation = "TOTAL_TM liegt auf Π₂⁰ der arithmetischen Hierarchie: 'M hält auf allen Eingaben' bedeutet ∀w ∃t [M hält auf w in t Schritten]. Diese ∀∃-Quantorenstruktur platziert das Problem auf Π₂⁰. Es ist nicht r.a. (kein Algorithmus kann alle totalen Maschinen aufzählen) und auch nicht ko-r.a. Dies macht es streng schwieriger als das Halteproblem (Σ₁⁰) und sogar schwieriger als das Äquivalenzproblem.",
        difficulty = 5,
        funFact = "Die Tatsache, dass man nicht entscheiden kann, ob ein Programm für alle Eingaben terminiert, ist einer der Hauptgründe, warum formale Programmverifikation so schwierig ist — und warum Programmierer sich auf Testsuiten verlassen müssen."
    ),

    // Question 26
    Question(
        categoryId = 12,
        questionText = "Welche Beziehung beschreibt das Theorem von Savitch zwischen deterministischem und nicht-deterministischem Platz?",
        answerA = "NSPACE(f(n)) = DSPACE(f(n)) für alle Funktionen f",
        answerB = "NSPACE(f(n)) ⊆ DSPACE(f(n)²) für alle platzkonstruierbaren f(n) ≥ log n",
        answerC = "NSPACE(f(n)) ⊆ DSPACE(2^f(n))",
        answerD = "Deterministischer und nicht-deterministischer Platz sind inkomparabel",
        correctAnswer = 1,
        explanation = "Savitchs Theorem (1970): NSPACE(f(n)) ⊆ DSPACE(f(n)²) für platzkonstruierbares f(n) ≥ log n. Der Beweis verwendet ein Erreichbarkeitsproblem im Konfigurationsgraphen und löst es mit einer rekursiven Divide-and-Conquer-Strategie. Eine wichtige Konsequenz: PSPACE = NPSPACE — für polynomiellen Platz kollabiert die Nicht-Determinismus-Lücke. Der Satz gibt eine quadratische Verlangsamung, keine exponentielle wie bei Zeit.",
        difficulty = 5,
        funFact = "Savitchs Theorem impliziert: PSPACE = NPSPACE. Ob P = NP ist offen, aber PSPACE = NPSPACE ist bewiesen. Dies zeigt, dass Platz 'generöser' als Zeit gegenüber Nicht-Determinismus ist."
    ),

    // Question 27
    Question(
        categoryId = 12,
        questionText = "Was ist Kolmogorov-Komplexität K(x) einer Zeichenkette x?",
        answerA = "Die Länge des längsten Teilstrings von x",
        answerB = "Die Länge des kürzesten Programms (in einer universellen Programmiersprache), das x ausgibt und dann hält",
        answerC = "Die Shannon-Entropie der Zeichenverteilung in x",
        answerD = "Die minimale Anzahl von Schritten, die eine Turingmaschine benötigt, um x zu schreiben",
        correctAnswer = 1,
        explanation = "Kolmogorov-Komplexität K(x) (auch algorithmische Komplexität, nach Solomonoff, Kolmogorov, Chaitin) misst die inhärente Zufälligkeit einer Zeichenkette: K(x) = min{|p| | U(p) = x}, wobei U eine universelle Turingmaschine ist und |p| die Länge des Programms p. Eine Folge ist 'zufällig', wenn K(x) ≈ |x| (nicht komprimierbar). K ist bis auf eine additive Konstante unabhängig von der Wahl von U — aber K selbst ist nicht berechenbar.",
        difficulty = 5,
        funFact = "Chaitins Konstante Ω ist die Haltwahrscheinlichkeit einer universellen Turingmaschine: Ω = Σ_{M hält} 2^{-|M|}. Sie ist eine berechenbare, normale, transzendente, nicht-berechenbare reelle Zahl — und enthält komprimiert die Antwort auf alle endlich beweisbaren mathematischen Fragen."
    ),

    // Question 28
    Question(
        categoryId = 12,
        questionText = "Was besagt der Zeithierarchiesatz (Time Hierarchy Theorem)?",
        answerA = "Mehr Zeit erlaubt keine größere Klasse von Problemen zu lösen",
        answerB = "Wenn f(n) und g(n) zeitkonstruierbar sind und f(n) = o(g(n)/log g(n)), dann gilt DTIME(f(n)) ⊊ DTIME(g(n))",
        answerC = "Die Zeithierarchie kollabiert für polynomielle Funktionen",
        answerD = "Mehr Zeit ist äquivalent zu mehr Platz",
        correctAnswer = 1,
        explanation = "Der Zeithierarchiesatz (Hartmanis und Stearns, 1965) besagt: Falls f(n) = o(g(n)/log g(n)) und beide zeitkonstruierbar sind, dann DTIME(f(n)) ⊊ DTIME(g(n)) echt. Mit mehr Zeit kann man streng mehr Probleme lösen. Konkret: P ⊊ EXPTIME (echt). Der Beweis verwendet Diagonalisierung: Man konstruiert eine Sprache, die in DTIME(g(n)) liegt, aber beweisbar nicht in DTIME(f(n)).",
        difficulty = 5,
        funFact = "Der Zeit- und der Platzhierarchiesatz sind die grundlegendsten Separation-Resultate der Komplexitätstheorie. Sie beweisen, dass die Komplexitätshierarchie nicht kollabiert — es gibt echt verschiedene Schwierigkeitsgrade."
    ),

    // Question 29
    Question(
        categoryId = 12,
        questionText = "Was ist der 'Curry-Howard-Isomorphismus'?",
        answerA = "Ein Algorithmus zur Typinferenz in polymorphen Typsystemen",
        answerB = "Eine Entsprechung zwischen Typen in Typentheorie und Aussagen in Logik sowie zwischen Programmen und Beweisen — 'Programme sind Beweise, Typen sind Aussagen'",
        answerC = "Ein Vollständigkeitssatz für das getypte Lambda-Kalkül",
        answerD = "Eine Reduktion des Entscheidungsproblems auf das Typcheckingproblem",
        correctAnswer = 1,
        explanation = "Der Curry-Howard-Isomorphismus verbindet Logik und Typentheorie: Ein Typ A entspricht einer logischen Aussage. Ein Programm p : A entspricht einem Beweis der Aussage A. Der Typ A → B entspricht der Implikation A ⟹ B. Das Produkt A × B entspricht der Konjunktion A ∧ B. Die Summe A + B entspricht der Disjunktion A ∨ B. Typüberprüfung = Beweisüberprüfung. Dies ist die Grundlage von Proof-Assistenten wie Coq, Agda und Lean.",
        difficulty = 5,
        funFact = "Lean 4 und Mathlib formalisieren Teile der Mathematik auf Basis des Curry-Howard-Isomorphismus. 2023 wurde der erste Teil von Schulmans kondensierter Mathematik formal in Lean bewiesen — ein Meilenstein für mechanisierte Mathematik."
    ),

    // Question 30
    Question(
        categoryId = 12,
        questionText = "Was ist ein 'Entscheidungsverfahren' für Presburger-Arithmetik und warum ist sie entscheidbar, obwohl Peano-Arithmetik es nicht ist?",
        answerA = "Presburger-Arithmetik ist auch unentscheidbar — beide Theorien haben dasselbe Ausdrucksvermögen",
        answerB = "Presburger-Arithmetik (additive Arithmetik ohne Multiplikation) ist entscheidbar, da sie zu schwach ist, um Gödel-Nummerierung zu kodieren",
        answerC = "Presburger-Arithmetik ist entscheidbar dank Gödels Vollständigkeitssatz",
        answerD = "Presburger-Arithmetik ist nur für endliche Modelle entscheidbar",
        correctAnswer = 1,
        explanation = "Presburger-Arithmetik (PA, Presburger 1929) ist die Theorie der natürlichen Zahlen mit Addition und Gleichheit, aber ohne Multiplikation. Sie ist vollständig und entscheidbar (Presburger bewies dies im selben Jahr). Die Komplexität ist jedoch astronomisch: DTIME(2^{2^n}) (dreifach-exponentiell). Gödels Unvollständigkeitssatz greift nicht, weil Presburger-Arithmetik nicht ausreichend ausdrucksstark ist, um Turingmaschinen zu kodieren — dafür braucht man Multiplikation.",
        difficulty = 5,
        funFact = "Presburger-Arithmetik hat praktische Anwendungen in der Verifikation von Hardware und Software. Moderne SMT-Solver wie Z3 verwenden Entscheidungsverfahren für Presburger-Arithmetik als Kernkomponente."
    ),

    // Question 31
    Question(
        categoryId = 12,
        questionText = "Was ist der 'Satz von Löwenheim-Skolem' und welches Paradoxon wirft er auf?",
        answerA = "Jede konsistente Theorie in Prädikatenlogik erster Stufe hat ein abzählbares Modell — selbst wenn die Theorie überabzählbare Modelle intendiert (Skolem-Paradoxon)",
        answerB = "Jede endliche Theorie hat genau ein Modell",
        answerC = "Prädikatenlogik erster Stufe ist nicht stark genug für überabzählbare Strukturen",
        answerD = "Konsistenz impliziert Vollständigkeit für abzählbare Sprachen",
        correctAnswer = 0,
        explanation = "Der abwärts gerichtete Löwenheim-Skolem-Satz besagt: Jede Theorie in abzählbarer Prädikatenlogik erster Stufe, die ein Modell hat, hat auch ein abzählbares Modell. Das Skolem-Paradoxon: Die Mengenlehre ZFC ist eine abzählbare Theorie und hat (wenn konsistent) ein abzählbares Modell — aber ZFC beweist die Existenz überabzählbarer Mengen! Die Auflösung: 'Abzählbarkeit' ist modellrelativ — was im Metasystem überabzählbar ist, erscheint im abzählbaren Modell abzählbar.",
        difficulty = 5,
        funFact = "Skolem selbst hielt dieses Resultat für problematisch für die Mengenlehre als Fundament der Mathematik. Er argumentierte, Mathematik könnte nie in einem absoluten Sinn von 'Abzählbarkeit' sprechen."
    ),

    // Question 32
    Question(
        categoryId = 12,
        questionText = "Was ist Lindström's Theorem in der abstrakten Modelltheorie?",
        answerA = "Prädikatenlogik erster Stufe ist die einzige Logik mit Vollständigkeit und Kompaktheit",
        answerB = "Prädikatenlogik erster Stufe ist (bis auf Äquivalenz) die stärkste Logik, die sowohl den Vollständigkeitssatz als auch den Kompaktheitssatz erfüllt",
        answerC = "Jede vollständige Logik hat die Kompaktheitseigenschaft",
        answerD = "Monadische Logik zweiter Stufe ist vollständig für endliche Strukturen",
        correctAnswer = 1,
        explanation = "Lindströms Theorem (1969) charakterisiert Prädikatenlogik erster Stufe axiomatisch: FO ist (bis auf Äquivalenz) die stärkste Logik L, sodass (1) L den Vollständigkeitssatz erfüllt (jede L-konsistente Theorie hat ein Modell) und (2) L den abwärts Löwenheim-Skolem-Satz erfüllt. Jede Erweiterung von FO, die beide Eigenschaften erhält, kollapiert auf FO. Dies erklärt den 'besonderen Status' der Prädikatenlogik erster Stufe in der Mathematik.",
        difficulty = 5,
        funFact = "Der Kompaktheitssatz der Prädikatenlogik ist eines der mächtigsten Werkzeuge der Modelltheorie: Eine Theorie hat ein Modell, wenn jede endliche Teiltheorie eines hat. Damit kann man überabzählbare Strukturen durch abzählbare Axiome charakterisieren."
    ),

    // Question 33
    Question(
        categoryId = 12,
        questionText = "Was versteht man unter 'Arithmetisierung' in Gödels Unvollständigkeitsbeweis?",
        answerA = "Die Reduktion aller mathematischen Aussagen auf Gleichungen",
        answerB = "Die Kodierung syntaktischer Objekte (Zeichen, Formeln, Beweise) als natürliche Zahlen (Gödel-Nummern), sodass syntaktische Relationen arithmetisch ausdrückbar werden",
        answerC = "Die Konstruktion eines Modells der Arithmetik innerhalb der Mengenlehre",
        answerD = "Der Beweis, dass alle arithmetischen Aussagen letztlich logische Tautologien sind",
        correctAnswer = 1,
        explanation = "Arithmetisierung ist die Schlüsselidee in Gödels Beweis: Jedem Symbol, jeder Formel und jedem Beweis wird eine eindeutige natürliche Zahl (Gödel-Nummer) zugeordnet. Dann wird 'φ ist ein Beweis von ψ' als arithmetische Relation ausgedrückt. Das ermöglicht, eine Aussage G zu konstruieren, die über sich selbst aussagt: 'G hat keine Gödel-Nummer, die einem Beweis entspricht' — d.h. 'Ich bin nicht beweisbar'. Diese Selbstreferenz ist der Kern des Beweises.",
        difficulty = 5,
        funFact = "Gödel wählte spezifisch das chinesische Restsatz-Theorem, um primitive Rekursion in Peano-Arithmetik zu kodieren. Die technische Eleganz der Arithmetisierung war für 1931 außerordentlich — kein Computer existierte, aber Gödel konstruierte implizit eine Programmiersprache."
    ),

    // Question 34
    Question(
        categoryId = 12,
        questionText = "Was ist die 'Kolmogorov-Komplexität-Zufälligkeit' nach Martin-Löf?",
        answerA = "Eine Zufallsfolge ist eine, bei der jeder Teilstring maximale Kolmogorov-Komplexität hat",
        answerB = "Eine unendliche binäre Folge ist Martin-Löf-zufällig, wenn sie keinem wirksamen statistischen Test widerspricht — äquivalent dazu, dass alle Präfix-Komplexitäten K(x|n) ≥ n − O(1) sind",
        answerC = "Zufälligkeit ist gleichbedeutend mit Nicht-Berechenbarkeit der Folge",
        answerD = "Martin-Löf-Zufälligkeit ist identisch mit Champernowne-Normalzahlen",
        correctAnswer = 1,
        explanation = "Martin-Löf-Zufälligkeit (1966) definiert zufällige unendliche Folgen durch statistische Tests: Eine Folge ω ist MLR, wenn sie keinem wirksamen statistischen Null-Test widerspricht (keine wirksam beschriebene 'seltene Menge' enthält). Äquivalent (Schnorr, Levin): ω ist MLR, wenn die präfix-Kolmogorov-Komplexität K(ω|n) ≥ n − c für ein festes c > 0 für alle n. MLR-Folgen sind unverdichtbar: Man kann ihren Informationsgehalt nicht reduzieren.",
        difficulty = 5,
        funFact = "Chaitins Ω-Konstante ist Martin-Löf-zufällig. Die Dezimalentwicklung von Ω ist eine konkret definierte, aber absolut zufällige Zahl — man kann beliebig viele Stellen nicht schneller ausrechnen, als man die Bits direkt aufschreibt."
    ),

    // Question 35
    Question(
        categoryId = 12,
        questionText = "Was ist das 'Entscheidungsproblem' (Hilberts Entscheidungsproblem) und wer löste es?",
        answerA = "Das Problem, ob eine gegebene Zahl prim ist — gelöst von Agrawal, Kayal und Saxena",
        answerB = "Das Problem, ob eine beliebige mathematische Aussage in der Prädikatenlogik erster Stufe allgemein gültig ist — negativ gelöst durch Church und Turing (1936) unabhängig voneinander",
        answerC = "Das Problem, ob ein gegebenes Polynom Nullstellen hat — gelöst durch Hilbert selbst",
        answerD = "Das Problem, ob ZFC konsistent ist — offen laut Gödels zweitem Satz",
        correctAnswer = 1,
        explanation = "Hilberts Entscheidungsproblem (1928) fragte: Gibt es einen Algorithmus, der für jede Formel der Prädikatenlogik erster Stufe entscheidet, ob sie allgemein gültig (logisch wahr) ist? Church (1936, mittels Lambda-Kalkül) und Turing (1936, mittels Turingmaschinen) bewiesen unabhängig: Nein. Church zeigte, dass das Halteproblem auf das Entscheidungsproblem reduzierbar ist. Turings Arbeit definierte dabei den Begriff des Algorithmus präzise.",
        difficulty = 5,
        funFact = "Hilbert hielt das Entscheidungsproblem für lösbar und sagte 1930 in seiner Abschiedsrede: 'Wir müssen wissen, wir werden wissen.' Gödel veröffentlichte seinen Unvollständigkeitssatz am selben Tag der Rede — ein historischer Zufall erster Güte."
    ),

    // Question 36
    Question(
        categoryId = 12,
        questionText = "Was ist die Bedeutung des Kompaktheitssatzes der Prädikatenlogik für unendliche Strukturen?",
        answerA = "Jede unendliche Struktur kann durch endlich viele Axiome beschrieben werden",
        answerB = "Eine Menge von Sätzen hat ein Modell genau dann, wenn jede endliche Teilmenge ein Modell hat — damit können endlich axiomatisierte Theorien kein 'ist endlich' ausdrücken",
        answerC = "Jedes Modell einer abzählbaren Theorie ist höchstens abzählbar",
        answerD = "Kompaktheit gilt nur für aussagenlogische Formeln",
        correctAnswer = 1,
        explanation = "Der Kompaktheitssatz besagt: Eine Menge Σ von Formeln hat ein Modell, falls jede endliche Teilmenge Σ₀ ⊂ Σ ein Modell hat. Eine fundamentale Konsequenz: 'Ist endlich' ist in Prädikatenlogik erster Stufe nicht ausdrückbar. Man kann zwar 'Hat mindestens n Elemente' für jedes n ausdrücken, aber 'Hat genau endlich viele' nicht — denn die Theorie 'Hat mindestens 1, mindestens 2, ...' hat ein unendliches Modell, obwohl jede endliche Teiltheorie ein endliches hat.",
        difficulty = 5,
        funFact = "Aus dem Kompaktheitssatz folgt der Nicht-Standard-Modell-Satz: Die Theorie der natürlichen Zahlen hat Nicht-Standard-Modelle mit 'unendlich großen' natürlichen Zahlen, die alle Standard-Axiome erfüllen. Dies führt zur Nicht-Standard-Arithmetik (Abraham Robinson, 1966)."
    ),

    // Question 37
    Question(
        categoryId = 12,
        questionText = "Was ist ein 'Zertifikat' im Kontext der NP-Komplexität und wie lang darf es sein?",
        answerA = "Ein Zertifikat ist ein vollständiger Beweis der Lösbarkeit und darf beliebig lang sein",
        answerB = "Ein Zertifikat ist ein polynomiell langer Zeuge, der in polynomieller Zeit verifiziert werden kann; x ∈ L genau dann, wenn ein solches Zertifikat existiert",
        answerC = "Ein Zertifikat ist eine Hash-Funktion der Lösung mit festgelegter Länge",
        answerD = "Zertifikate existieren nur für NP-vollständige Probleme",
        correctAnswer = 1,
        explanation = "NP ist äquivalent zur Klasse der Sprachen L, für die ein polynomieller Verifizierer V existiert: x ∈ L ⟺ ∃c mit |c| ≤ p(|x|) und V(x,c) = 1. Das Zertifikat c ('Zeuge') ist polynomiell in der Eingabelänge begrenzt. Beispiel SAT: Das Zertifikat ist eine erfüllende Belegung (hat Länge linear in der Formelgröße). NP fragt nicht nach der Schwierigkeit des Findens, sondern nach der Schwierigkeit des Verifizierens.",
        difficulty = 5,
        funFact = "Die Klasse co-NP hat kurze 'Nicht-Existenz-Zertifikate' für das Nichtvorhandensein einer Lösung. Ob NP = co-NP ist gleichwertig zur Frage, ob SAT polynomielle Unerfüllbarkeitszeugen hat — auch ein offenes Problem."
    ),

    // Question 38
    Question(
        categoryId = 12,
        questionText = "Was ist die Bedeutung der 'Padding-Technik' in der Komplexitätstheorie?",
        answerA = "Das Auffüllen von Eingaben mit Nullen, um Platzkomplexität zu messen",
        answerB = "Eine Methode, die Komplexitätsklassen-Separationen ermöglicht: Durch Hinzufügen von Füllzeichen zur Eingabe kann man Zeitkomplexität 'verschieben' und Hierarchie-Beziehungen übertragen",
        answerC = "Das Verfahren, NP-Zertifikate auf Polynomiallänge zu trimmen",
        answerD = "Eine Normierung von Turingmaschinen-Beschreibungen auf Standardlänge",
        correctAnswer = 1,
        explanation = "Padding ist eine wichtige Technik: Sei L eine Sprache in EXPTIME. Man definiert L' = {x1^{2^{|x|}} | x ∈ L} (x gefolgt von exponentiell vielen 1en). Dann ist L' in P. Damit: Falls P = NP, dann müsste auch EXPTIME = NEXPTIME gelten. Da EXPTIME ≠ NEXPTIME (Zeithierarchiesatz), folgt: Wenn P ≠ EXPTIME, dann P ≠ NP — aber das ist keine direkte Hilfe für P-vs-NP selbst.",
        difficulty = 5,
        funFact = "Padding-Argumente zeigen Verbindungen zwischen Separationen auf verschiedenen Komplexitätsstufen. Sie sind ein Standardwerkzeug in Komplexitätstheorie-Beweisen und wurden von vielen Forschern als Ausgangspunkt für Beweisversuche von P ≠ NP verwendet."
    ),

    // Question 39
    Question(
        categoryId = 12,
        questionText = "Was ist die Komplexitätsklasse PP und wie unterscheidet sie sich von BPP?",
        answerA = "PP = BPP — beide sind gleich definiert",
        answerB = "PP enthält Sprachen, die eine Mehrheits-TM in polynomieller Zeit akzeptiert (>50% Pfade akzeptieren); BPP fordert einen deutlichen Abstand (≥2/3 oder ähnlich) für beide Antworten",
        answerC = "PP ist eine Teilmenge von BPP",
        answerD = "PP ist identisch mit PSPACE",
        correctAnswer = 1,
        explanation = "PP (Probabilistic Polynomial Time): L ∈ PP, wenn eine polynomielle TM M existiert mit: x ∈ L ⟺ Pr[M akzeptiert x] > 1/2. BPP: L ∈ BPP, wenn Pr[M akzeptiert x] ≥ 2/3 für x ∈ L und ≤ 1/3 für x ∉ L. BPP hat deutliche Fehlermargen und erlaubt Fehlerreduktion durch Wiederholung. PP hat keine deutliche Fehlermargen und gilt als viel schwieriger: NP ⊆ PP ⊆ PSPACE. BPP ⊆ Σ₂P ∩ Π₂P.",
        difficulty = 5,
        funFact = "Unter der Annahme, dass Einwegfunktionen existieren, gilt BPP = P — d.h. Pseudozufall ist so gut wie echter Zufall für polynomielle Algorithmen. Die Derandomisierung ist eines der aktivsten Gebiete der Komplexitätstheorie."
    ),

    // Question 40
    Question(
        categoryId = 12,
        questionText = "Was ist die 'Arithmetische Hierarchie' und welche Ebene enthält das Halteproblem?",
        answerA = "Das Halteproblem liegt auf Ebene Δ₁⁰",
        answerB = "Die Arithmetische Hierarchie klassifiziert Sprachen nach der Quantorenstruktur ihrer arithmetischen Definition; das Halteproblem liegt auf Σ₁⁰ (existenzquantifiziert)",
        answerC = "Das Halteproblem liegt auf Π₁⁰ und ist ko-rekursiv aufzählbar",
        answerD = "Die Hierarchie kollabiert bei Σ₃⁰",
        correctAnswer = 1,
        explanation = "Die Arithmetische Hierarchie (Kleene, Post): Σ₀⁰ = Π₀⁰ = Δ₀⁰ = entscheidbare Sprachen. Σ₁⁰: definierbar durch ∃x₁...∃xₙ R(x,x₁,...,xₙ) mit R entscheidbar = r.a. Sprachen. Π₁⁰: definierbar durch ∀ (= Komplemente von r.a.). Δ₁⁰ = Σ₁⁰ ∩ Π₁⁰ = entscheidbar. Das Halteproblem liegt auf Σ₁⁰: ∃t [M hält in t Schritten]. Jede Ebene Σₙ₊₁⁰ enthält Vollständige Probleme echt über Σₙ⁰.",
        difficulty = 5,
        funFact = "Die Arithmetische Hierarchie geht auf Kleene (1943) und Post (1944) zurück. Post stellte die Frage nach einem 'intermediate degree' zwischen entscheidbar und Halteproblem — dieser existiert (Friedberg-Muchnik 1956), was zur Theorie der Turing-Grade führte."
    ),

    // Question 41
    Question(
        categoryId = 12,
        questionText = "Was ist das Ergebnis von Shela's Geradenmuster-Theorem in der Berechnungskomplexität (bezüglich dem Niveau der Booleschen Hierarchie)?",
        answerA = "Die Boolesche Hierarchie kollabiert bei der zweiten Ebene",
        answerB = "Die Boolesche Hierarchie über NP ist echt unendlich geschichtet, falls P ≠ NP gilt",
        answerC = "DP = NP ∩ co-NP für alle Orakel",
        answerD = "Die Boolesche Hierarchie ist äquivalent zur Polynomzeit-Hierarchie",
        correctAnswer = 1,
        explanation = "Die Boolesche Hierarchie (BH) über NP ist definiert durch boolesche Kombinationen von NP-Mengen. BH₁ = NP, BH₂ = {A△B | A,B ∈ NP}, etc. Es gilt: BH ⊆ Δ₂P. Wenn die BH auf Ebene k kollabiert (BHₖ = BHₖ₊₁), dann kollabiert sie ganz und P = NP ist impliziert (unter plausiblen Annahmen). Die echt unendliche Schichtung der BH ist daher eine Konsequenz von P ≠ NP unter der angenommenen Separation.",
        difficulty = 5,
        funFact = "Die Klasse DP = NP ∩ co-NP enthält Probleme wie 'Ist n prim und hat n+2 genau k Primteiler?' — Probleme, die eine NP-Bedingung UND eine co-NP-Bedingung gleichzeitig fordern. DP-Vollständige Probleme gelten als 'zweidimensional schwer'."
    ),

    // Question 42
    Question(
        categoryId = 12,
        questionText = "Was ist das 'Sprache-Leere-Problem' für Turingmaschinen und wie schwer ist es?",
        answerA = "Es ist in P entscheidbar durch DFA-Minimierung",
        answerB = "Das Problem {⟨M⟩ | L(M) = ∅} ist Π₂⁰-vollständig und schwieriger als das Halteproblem",
        answerC = "Es ist äquivalent zum Halteproblem auf Σ₁⁰",
        answerD = "Es ist entscheidbar für deterministische Kellerautomaten",
        correctAnswer = 1,
        explanation = "Das Leerheitsproblem für TM ist Π₂⁰-vollständig: L(M) = ∅ bedeutet ∀w [M akzeptiert w nicht], und 'M akzeptiert w nicht' ist eine Π₁⁰-Aussage (∀t [M läuft in t Schritten und hält nicht-akzeptierend]). Die ∀∀-Struktur platziert es auf Π₂⁰. Im Gegensatz: Für DFAs und reguläre Automaten ist Leerheit in linearer Zeit entscheidbar. Für kontextfreie Grammatiken ist es in P, für kontextsensitive Grammatiken unentscheidbar.",
        difficulty = 5,
        funFact = "Das Leerheitsproblem für kontextfreie Sprachen ist in P, aber das Schnittproblem (ist L(G₁) ∩ L(G₂) = ∅?) ist unentscheidbar — eine subtile Grenze zwischen entscheidbaren und unentscheidbaren Fragen über CFGs."
    ),

    // Question 43
    Question(
        categoryId = 12,
        questionText = "Welche Bedingung gilt für den Y-Kombinator im ungetypten Lambda-Kalkül?",
        answerA = "Y f =β f für alle f",
        answerB = "Y f =β f (Y f) — Y ist ein Fixpunkt-Kombinator, sodass Y f ein Fixpunkt von f ist",
        answerC = "Y ist der einzige mögliche Fixpunkt-Kombinator",
        answerD = "Y existiert nur im getypten Lambda-Kalkül mit rekursiven Typen",
        correctAnswer = 1,
        explanation = "Der Y-Kombinator Y = λf.(λx.f(x x))(λx.f(x x)) erfüllt Y f =β f (Y f). Dies bedeutet: Y f ist ein Fixpunkt von f, denn f (Y f) =β Y f. Damit kann man Rekursion ohne explizite Selbstbenennung ausdrücken: Um eine rekursive Funktion g zu definieren, schreibt man g = Y (λself.λn. [rekursiver Code mit self statt g]). Im getypten Lambda-Kalkül mit einfachen Typen existiert Y nicht — denn für Y müsste x den Typ t → t haben, und x selbst würde x : t benötigen, was einen unendlichen Typ erzeugt.",
        difficulty = 5,
        funFact = "Es gibt unendlich viele Fixpunkt-Kombinatoren im ungetypten Lambda-Kalkül. Türing's Kombinator Θ = (λxy.y(xxy))(λxy.y(xxy)) ist ein weiterer und hat den Vorteil, dass Θ f ein 'starker' Fixpunkt ist: Θ f →β f (Θ f) (Reduktion statt nur Äquivalenz)."
    ),

    // Question 44
    Question(
        categoryId = 12,
        questionText = "Was ist die Komplexität des Quantified Boolean Formula Problems (QBF) und in welcher Klasse liegt es?",
        answerA = "QBF ist NP-vollständig wie SAT",
        answerB = "QBF ist PSPACE-vollständig — es ist das kanonische PSPACE-vollständige Problem",
        answerC = "QBF ist EXPTIME-vollständig",
        answerD = "QBF ist unentscheidbar für Formeln mit unbegrenzt vielen Quantorenalternierungen",
        correctAnswer = 1,
        explanation = "QBF (auch TQBF: True Quantified Boolean Formulas) fragt: Ist eine quantifizierte boolesche Formel ∃x₁∀x₂∃x₃... φ(x₁,...,xₙ) wahr? QBF ist PSPACE-vollständig: Es liegt in PSPACE (Quantoren durch Depth-First-Evaluation), und alle PSPACE-Probleme reduzieren sich polynomial auf QBF. QBF verallgemeinert SAT (nur ∃-Quantoren): SAT ≤_p QBF. Der Unterschied zu SAT ist die Alternierung von ∃ und ∀.",
        difficulty = 5,
        funFact = "QBF ist das 'NP-vollständige Problem für PSPACE': Genauso wie SAT das kanonische NP-vollständige Problem ist, ist QBF das kanonische PSPACE-vollständige. Spieltheoretische Probleme (wer gewinnt ein Spiel in polynomiellem Platz?) sind häufig PSPACE-vollständig."
    ),

    // Question 45
    Question(
        categoryId = 12,
        questionText = "Was besagt das Immerman-Szelepcsényi-Theorem über Nicht-Determinismus und Abschluss unter Komplement?",
        answerA = "NP ist nicht abgeschlossen unter Komplement (NP ≠ co-NP)",
        answerB = "NSPACE(f(n)) ist für f(n) ≥ log n abgeschlossen unter Komplement: NSPACE(f(n)) = co-NSPACE(f(n))",
        answerC = "Alle nicht-deterministischen Komplexitätsklassen sind unter Komplement abgeschlossen",
        answerD = "Das Theorem gilt nur für lineare Platzkomplexität",
        correctAnswer = 1,
        explanation = "Das Immerman-Szelepcsényi-Theorem (1987, unabhängig bewiesen) zeigt: Für f(n) ≥ log n gilt NSPACE(f(n)) = co-NSPACE(f(n)). Insbesondere: NL = co-NL (nicht-deterministischer Log-Platz ist unter Komplement abgeschlossen). Der Beweis verwendet 'Counting Inductive Counting': Man zählt nichtdeterministisch die Anzahl erreichbarer Knoten im Konfigurationsgraph. Dies kontrastiert mit Zeit: Ob NP = co-NP ist offen.",
        difficulty = 5,
        funFact = "NL (nicht-deterministischer logarithmischer Platz) enthält Graph-Erreichbarkeit (s-t-CONN) als vollständiges Problem. Das Immerman-Szelepcsényi-Theorem zeigte, dass Nicht-Erreichbarkeit (s-t-NOCONN) ebenfalls in NL liegt — ein überraschender Befund, da man 'negative' nicht-deterministische Argumente für schwieriger hielt."
    ),

    // Question 46
    Question(
        categoryId = 12,
        questionText = "Was ist das Ziel von 'Interactive Proof Systems' (IP) und welche Klasse von Sprachen kann durch IP erkannt werden?",
        answerA = "IP erkennt genau die NP-Sprachen",
        answerB = "In einem IP-System kommuniziert ein polynomiell beschränkter Verifier mit einem allwissenden Prover — IP = PSPACE",
        answerC = "IP erkennt genau die EXPTIME-Sprachen",
        answerD = "IP-Systeme sind äquivalent zu polynomiellen Schaltkreisen",
        correctAnswer = 1,
        explanation = "Ein interaktives Beweissystem besteht aus einem polynomiellen Verifier V und einem unbeschränkten Prover P. V akzeptiert probabilistisch durch Kommunikation mit P. Shamir bewies 1992: IP = PSPACE. Das heißt: Mit interaktiven Beweisen kann man alle PSPACE-Probleme beweisen — weit mehr als mit NP-Zertifikaten. Das kanonische Beispiel: Graph-Nicht-Isomorphismus kann in IP (nicht bekannt in NP) nachgewiesen werden.",
        difficulty = 5,
        funFact = "MIP (mehrere unabhängige Prover) = NEXPTIME. MIP* (verschränkte Quantenprover) = RE (rekursiv aufzählbar) — was bedeutet, dass zwei quantenverschränkte Prover alle r.a. Sprachen beweisen können! Dies ist das MIP*=RE-Theorem von Ji et al. (2020), mit Anwendungen in der Quanteninformation."
    ),

    // Question 47
    Question(
        categoryId = 12,
        questionText = "Was ist die Bedeutung von 'Relativierungen' für die P-vs-NP-Frage?",
        answerA = "Relativierungen zeigen, dass P ≠ NP gilt",
        answerB = "Baker, Gill und Solovay zeigten 1975 existieren Orakel A,B mit P^A = NP^A und P^B ≠ NP^B — klassische Diagonalisierung und Algebrisierung können P-vs-NP nicht lösen",
        answerC = "Relativierungen zeigen, dass P = NP wahrscheinlich gilt",
        answerD = "Orakel-Relativierungen sind für P-vs-NP irrelevant",
        correctAnswer = 1,
        explanation = "Baker, Gill, Solovay (BGS 1975) konstruierten Orakel A mit P^A = NP^A (z.B. A = PSPACE-vollständiges Problem) und Orakel B mit P^B ≠ NP^B. Dies bedeutet: Jeder Beweis von P = NP oder P ≠ NP darf nicht 'relativieren' (also nicht für alle Orakel-Erweiterungen gelten). Das schließt alle bekannten Standardtechniken (Diagonalisierung) aus. Razborov und Rudich ergänzten 1994: 'Natürliche Beweise' (eine andere Standardtechnik) können P ≠ NP nicht beweisen, falls Pseudozufallsgeneratoren existieren.",
        difficulty = 5,
        funFact = "Arithmetisierung (Shamir's IP=PSPACE-Beweis) 'relativiert nicht' und war damit der erste Durchbruch nach BGS. Der Begriff 'algebrizing' beschreibt eine Erweiterung von Relativierungen — und selbst diese Technik kann P-vs-NP nicht lösen (Aaronson und Wigderson 2009)."
    ),

    // Question 48
    Question(
        categoryId = 12,
        questionText = "Was ist Bremermanns Limit und welche Verbindung hat es zur Berechenbarkeit?",
        answerA = "Die maximale Informationsverarbeitungsrate einer physischen Rechenmaschine pro Kilogramm Masse — begrenzt durch Heisenbergs Unschärferelation",
        answerB = "Die minimale Größe eines Programms für eine universelle Turingmaschine",
        answerC = "Die maximale Anzahl von Zuständen, die ein quantenmechanisches System annehmen kann",
        answerD = "Die Shannon-Kapazität eines Quantenkanals",
        correctAnswer = 0,
        explanation = "Bremermanns Limit (1962): Jede physische Rechenmaschine mit Masse m kann höchstens c²/(h) ≈ 1.36 × 10⁵⁰ Bits pro Sekunde und Kilogramm verarbeiten. Dies folgt aus dem Verhältnis von Ruheenergie (E = mc²) und Energieauflösung pro Bit (E ≥ h·f, wobei f die Frequenz und h das Plancksche Wirkungsquantum). Verbindung zur Berechenbarkeit: Probleme, die exponentiell viele Schritte benötigen, sind für alle physisch realisierbaren Maschinen unlösbar — eine physikalische Entsprechung der Komplexitätstheorie.",
        difficulty = 5,
        funFact = "Ein Computer aus der gesamten sichtbaren Universum-Masse könnte seit dem Urknall weniger als 10^120 Bit-Operationen durchgeführt haben. Viele NP-Probleme mit n=300 wären selbst für diesen kosmischen Computer unlösbar."
    ),

    // Question 49
    Question(
        categoryId = 12,
        questionText = "Was ist der Unterschied zwischen 'strongly NP-hard' und 'weakly NP-hard' und welches klassische Problem illustriert den Unterschied?",
        answerA = "Beide Begriffe sind synonym",
        answerB = "Strongly NP-hard bleibt NP-schwer auch wenn alle Zahlen in der Eingabe unär kodiert sind (polynomiell beschränkt); weakly NP-hard hat Pseudo-polynomielle Algorithmen. Das Rucksack-Problem ist weakly NP-hard, Subset-Sum mit großen Zahlen strongly NP-hard ist falsch — das 3-Dimensionale Matching ist strongly NP-hard",
        answerC = "Strongly NP-hard bedeutet NP-vollständig, weakly NP-hard bedeutet NP-schwer aber nicht vollständig",
        answerD = "Der Unterschied gilt nur für Optimierungsprobleme, nicht für Entscheidungsprobleme",
        correctAnswer = 1,
        explanation = "Ein Problem ist weakly NP-hard, wenn es NP-schwer ist, aber einen pseudo-polynomiellen Algorithmus hat (polynomiell in Eingabelänge UND in der Größe der Zahlen). Das Subset-Sum-Problem und das 0/1-Rucksack-Problem sind weakly NP-hard: Dynamisches Programmieren löst sie in O(n·W) — pseudo-polynomiell. Strongly NP-hard Probleme bleiben NP-schwer, selbst wenn alle Zahlen durch ihre Größe (unär) beschränkt sind. 3-Partition ist strongly NP-hard.",
        difficulty = 5,
        funFact = "FPTAS (Fully Polynomial Time Approximation Scheme) existiert genau für weakly NP-hard Optimierungsprobleme — was erklärt, warum Rucksack-Probleme in der Praxis gut approximierbar sind, obwohl sie NP-schwer sind."
    ),

    // Question 50
    Question(
        categoryId = 12,
        questionText = "Was besagt das Ladner-Theorem über die Struktur der NP-Klasse?",
        answerA = "Alle NP-Probleme sind entweder in P oder NP-vollständig",
        answerB = "Falls P ≠ NP, existieren Probleme in NP, die weder in P noch NP-vollständig sind (NP-intermediate oder NPI)",
        answerC = "NP enthält genau zwei echte Komplexitätsklassen: P und NP-vollständig",
        answerD = "Ladner bewies, dass P = NP nicht durch Diagonalisierung widerlegt werden kann",
        correctAnswer = 1,
        explanation = "Ladners Theorem (1975): Falls P ≠ NP, dann existieren Sprachen in NP \\ P, die nicht NP-vollständig sind. Der Beweis konstruiert einen 'Separator' durch Diagonalisierung. Kandidaten für NPI (NP-Intermediate): Graphisomorphismus (GI), Faktorisierung, diskrete Logarithmus, Parity Games. GI ist besonders interessant: Es liegt in NP ∩ co-AM, hat keinen sub-exponentiellen Algorithmus gefunden, aber auch keine NP-Vollständigkeits-Reduktion trotz Jahrzehnten der Forschung.",
        difficulty = 5,
        funFact = "Babai's Durchbruch 2015 (GI in quasi-polynomieller Zeit: 2^(log n)^O(1)) verringerte zwar die erwartete Schwierigkeit von Graphisomorphismus erheblich, klassifiziert es aber immer noch weder als P noch als NP-vollständig — GI bleibt der prominenteste NPI-Kandidat."
    )
)
