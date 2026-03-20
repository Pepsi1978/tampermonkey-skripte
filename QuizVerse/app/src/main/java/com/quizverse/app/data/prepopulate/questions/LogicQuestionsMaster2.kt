package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsMaster2(): List<Question> = listOf(

    // --- GÖDEL, META-MATHEMATIK, FORMALE SYSTEME, BERECHENBARKEIT, TURING ---

    // Question 1 — correctAnswer = 1 (B)
    Question(
        categoryId = 12,
        questionText = "Was versteht man unter der 'Gödelnummerierung' und welche zentrale Rolle spielt sie im Beweis des ersten Unvollständigkeitssatzes?",
        answerA = "Eine Methode, Axiome nach Wichtigkeit zu nummerieren",
        answerB = "Eine bijektive Abbildung, die jedem syntaktischen Ausdruck des Systems eine natürliche Zahl zuweist — so kann das System über seine eigenen Aussagen sprechen",
        answerC = "Ein Zählverfahren für beweisbare Theoreme in der Peano-Arithmetik",
        answerD = "Eine Kodierung von Mengenlehre-Axiomen in Primzahlprodukte",
        correctAnswer = 1,
        explanation = "Die Gödelnummerierung weist jedem Symbol, jeder Formel und jedem Beweis eine eindeutige natürliche Zahl zu (z.B. mittels Primzahlpotenz-Kodierung). Dadurch wird die Syntax des formalen Systems selbst zum Gegenstand arithmetischer Aussagen. Gödel konstruiert dann eine Formel G, die (über ihre eigene Gödelnummer) aussagt: 'Die Formel mit Nummer n ist nicht beweisbar' — mit n als Gödelnummer von G selbst.",
        difficulty = 5,
        funFact = "Gödels Trick ist eine mathematisch präzise Form der Selbstreferenz. Er erzeugte damit eine Aussage, die das System von außen betrachtet wahr ist, sich aber selbst als unbeweisbar bezeichnet — ohne einen direkten Widerspruch zu erzeugen."
    ),

    // Question 2 — correctAnswer = 2 (C)
    Question(
        categoryId = 12,
        questionText = "Hilberts Programm (ca. 1920) hatte zwei Kernziele für die Mathematik. Welche waren das?",
        answerA = "Die Vereinheitlichung aller Mathematik in der Mengenlehre und die Abschaffung aller Axiome",
        answerB = "Die Entwicklung einer universellen Programmiersprache und die Lösung des Entscheidungsproblems",
        answerC = "Die vollständige Axiomatisierung der Mathematik und der finistische Konsistenzbeweis aller mathematischen Theorien",
        answerD = "Die Formalisierung der Geometrie und die Berechnung aller Primzahlen",
        correctAnswer = 2,
        explanation = "Hilbert wollte (1) die gesamte Mathematik in einem vollständigen, widerspruchsfreien Axiomensystem formalisieren und (2) die Konsistenz dieser Axiome durch finistische (endliche, inhaltlich sichere) Methoden beweisen. Gödels Sätze von 1931 zeigten, dass (1) unmöglich ist (Unvollständigkeit) und (2) unmöglich ist (kein System kann seine eigene Konsistenz beweisen).",
        difficulty = 5,
        funFact = null
    ),

    // Question 3 — correctAnswer = 3 (D)
    Question(
        categoryId = 12,
        questionText = "Was ist ein 'omega-inkonsistentes' System und wie unterscheidet es sich von einem bloß inkonsistenten System?",
        answerA = "Ein System, in dem alle Aussagen wahr sind",
        answerB = "Ein System, das mehr als omega viele Axiome hat",
        answerC = "Ein System, in dem das Induktionsprinzip nicht gilt",
        answerD = "Ein System ist omega-inkonsistent, wenn es beweist, dass eine natürliche Eigenschaft für alle n gilt, aber auch für jede konkrete Zahl 0, 1, 2, ... das Gegenteil beweist",
        correctAnswer = 3,
        explanation = "Omega-Inkonsistenz ist schwächer als Inkonsistenz: Ein System S ist omega-inkonsistent, wenn es ∃x: ¬P(x) beweist, aber für jede konkrete natürliche Zahl n auch P(n) beweist. Ein inkonsistentes System beweist P und ¬P direkt. Gödel formulierte seinen ursprünglichen Satz zunächst unter der stärkeren Annahme der Omega-Konsistenz (kein System ist omega-inkonsistent). Rosser verbesserte dies 1936: einfache Konsistenz reicht.",
        difficulty = 5,
        funFact = null
    ),

    // Question 4 — correctAnswer = 0 (A)
    Question(
        categoryId = 12,
        questionText = "Was besagt Tarskis Undefinierbarkeitstheorem und wie verhält es sich zu Gödels Unvollständigkeitssatz?",
        answerA = "Wahrheit in einem formalen System kann in diesem System selbst nicht allgemein definiert werden; es ist stärker als Gödels Satz, da es direkt die semantische Ebene betrifft",
        answerB = "Formale Systeme können ihre eigene Syntax nicht definieren",
        answerC = "Kein formales System kann Mengenlehre ausdrücken",
        answerD = "Arithmetische Wahrheit ist identisch mit Beweisbarkeit in PA",
        correctAnswer = 0,
        explanation = "Tarski bewies 1936: Die Menge der wahren arithmetischen Aussagen ist in der Arithmetik nicht arithmetisch definierbar. Mit anderen Worten: Es gibt kein Prädikat 'Wahr(n)' in der Arithmetik, das genau dann gilt, wenn die Formel mit Gödelnummer n wahr ist. Gödels Satz folgt daraus als Spezialfall: Beweisbarkeit kann definiert werden, Wahrheit nicht — also gibt es wahre, aber unbeweisbare Sätze.",
        difficulty = 5,
        funFact = "Tarskis Satz ist oft als 'Tarski'sches Lügnerparadoxon für formale Systeme' beschrieben: Wenn Wahrheit definierbar wäre, könnte man 'Diese Aussage ist falsch' formulieren — ein direkter Widerspruch."
    ),

    // Question 5 — correctAnswer = 1 (B)
    Question(
        categoryId = 12,
        questionText = "Die Peano-Axiome (PA) definieren die natürlichen Zahlen. Welche der folgenden Aussagen ist eine bekannte wahre Aussage, die in PA nicht beweisbar ist?",
        answerA = "Jede natürliche Zahl hat einen Nachfolger",
        answerB = "Der Goodstein-Satz: Jede Goodstein-Folge terminiert schließlich bei 0",
        answerC = "Die Summe zweier gerader Zahlen ist gerade",
        answerD = "Es gibt unendlich viele natürliche Zahlen",
        correctAnswer = 1,
        explanation = "Goodsteins Satz (1944) ist ein konkretes Beispiel einer wahren, aber in PA unbeweisbaren Aussage. Eine Goodstein-Folge wächst zunächst astronomisch schnell, kollabiert dann aber immer auf 0. Der Beweis benötigt transfinite Ordinalzahlen (Cantors Epsilon-0-Ordinal), die über die in PA formalisierbare Induktion hinausgehen. Kirby & Paris bewiesen 1982, dass Goodsteins Satz in PA unbeweisbar ist.",
        difficulty = 5,
        funFact = "Die Goodstein-Folge für n=4 erreicht Zahlen mit einer Stellenzahl, die selbst in wissenschaftlicher Notation nicht beschreibbar wäre — und hält dann doch an."
    ),

    // Question 6 — correctAnswer = 2 (C)
    Question(
        categoryId = 12,
        questionText = "Was ist das 'Entscheidungsproblem' (Hilbert, 1928) und was war Turings und Churchs Antwort darauf?",
        answerA = "Die Frage, ob Primzahlen entscheidbar sind — beantwortet mit Ja durch Church",
        answerB = "Die Frage, ob PA vollständig ist — beantwortet durch Gödel mit Nein",
        answerC = "Die Frage, ob ein allgemeiner Algorithmus existiert, der für jede mathematische Aussage in endlicher Zeit entscheidet, ob sie beweisbar ist — beantwortet mit Nein unabhängig von Church (Lambda-Kalkül) und Turing (Turingmaschinen) 1936",
        answerD = "Die Frage nach einem Algorithmus zur Primfaktorzerlegung — bis heute offen",
        correctAnswer = 2,
        explanation = "Hilbert und Ackermann formulierten 1928 das Entscheidungsproblem: Gibt es einen Algorithmus, der für jede prädikatenlogische Formel entscheidet, ob sie allgemeingültig (logisch wahr) ist? Church und Turing zeigten 1936 unabhängig: Nein. Church bewies es über seinen Lambda-Kalkül, Turing über Turingmaschinen — und zeigte gleichzeitig, dass beide Berechenbarkeitsbegriffe äquivalent sind (Church-Turing-These).",
        difficulty = 5,
        funFact = null
    ),

    // Question 7 — correctAnswer = 3 (D)
    Question(
        categoryId = 12,
        questionText = "Was ist die Church-Turing-These und ist sie ein Theorem oder eine empirische These?",
        answerA = "Sie ist ein streng bewiesenes Theorem über die Gleichwertigkeit aller Berechnungsmodelle",
        answerB = "Sie besagt, dass jede Turing-berechenbare Funktion auch in konstanter Zeit berechenbar ist",
        answerC = "Sie ist ein Axiom der modernen Informatik, das nicht hinterfragt werden darf",
        answerD = "Sie ist eine empirische These: Jede intuitiv berechenbare Funktion ist auch Turing-berechenbar — nicht formal beweisbar, da 'intuitiv berechenbar' kein formaler Begriff ist",
        correctAnswer = 3,
        explanation = "Die Church-Turing-These ist eine These, kein Beweis. Sie behauptet, dass der intuitive Begriff des 'Algorithmus' (was ein Mensch in mechanischen Schritten ausführen kann) exakt dem entspricht, was eine Turingmaschine berechnen kann. Da 'intuitiv berechenbar' kein mathematisch definierter Begriff ist, kann die These nicht formal bewiesen werden. Alle bisher vorgeschlagenen alternativen Berechnungsmodelle haben sich als äquivalent zu Turingmaschinen erwiesen.",
        difficulty = 5,
        funFact = "Hypercomputation — Maschinen, die über Turing-Berechenbarkeit hinausgehen — ist ein aktives Forschungsfeld. Orakel-Turingmaschinen erweitern das Modell, aber ihre physikalische Realisierbarkeit ist fraglich."
    ),

    // Question 8 — correctAnswer = 0 (A)
    Question(
        categoryId = 12,
        questionText = "Was unterscheidet eine 'semi-entscheidbare' (rekursiv aufzählbare) Sprache von einer 'entscheidbaren' Sprache?",
        answerA = "Bei semi-entscheidbaren Sprachen hält die Turingmaschine für Wörter in der Sprache an und akzeptiert, kann aber für Wörter außerhalb der Sprache endlos laufen; bei entscheidbaren Sprachen hält sie immer",
        answerB = "Semi-entscheidbare Sprachen sind immer endlich, entscheidbare Sprachen unendlich",
        answerC = "Semi-entscheidbare Sprachen können nur von nicht-deterministischen Automaten erkannt werden",
        answerD = "Der Unterschied ist rein historisch und hat keine praktische Bedeutung",
        correctAnswer = 0,
        explanation = "Eine Sprache L ist entscheidbar, wenn eine TM existiert, die für alle Eingaben hält: bei w∈L akzeptiert, bei w∉L verwirft. L ist semi-entscheidbar (r.e.), wenn eine TM existiert, die für w∈L akzeptiert (und hält), aber für w∉L eventuell nie hält. Das Halteproblem ist semi-entscheidbar, aber nicht entscheidbar: Man kann ein Programm starten und sehen ob es hält, aber nicht garantiert feststellen, dass es nie hält.",
        difficulty = 5,
        funFact = null
    ),

    // Question 9 — correctAnswer = 2 (C)
    Question(
        categoryId = 12,
        questionText = "Was besagt das Postsche Korrespondenzproblem (PKP) und welche Bedeutung hat seine Unentscheidbarkeit?",
        answerA = "PKP fragt, ob ein Brief an die richtige Adresse geht — es ist entscheidbar",
        answerB = "PKP ist ein entscheidbares Problem, das zur Verifikation formaler Sprachen genutzt wird",
        answerC = "PKP fragt, ob aus einer Liste von Wortpaaren eine endliche Folge gewählt werden kann, sodass die Konkatenation der ersten und zweiten Komponenten übereinstimmt — es ist unentscheidbar und dient als Reduktionsziel",
        answerD = "PKP fragt nach dem kürzesten Postweg zwischen Städten — es ist NP-vollständig",
        correctAnswer = 2,
        explanation = "Das Postsche Korrespondenzproblem (Emil Post, 1946): Gegeben eine Liste von Paaren (u_i, v_i) von Wörtern, gibt es eine nicht-leere Folge i_1,...,i_k sodass u_{i_1}...u_{i_k} = v_{i_1}...v_{i_k}? Post bewies die Unentscheidbarkeit durch Reduktion vom Halteproblem. PKP ist ein einfach formulierbares, aber unentscheidbares Problem und wird seinerseits verwendet, um andere Probleme (z.B. in formalen Grammatiken) als unentscheidbar zu zeigen.",
        difficulty = 5,
        funFact = "Das PKP ist berühmt für seine einfache Formulierung trotz Unentscheidbarkeit — es gehört zu den wenigen Problemen, die selbst Laien sofort verstehen, aber von keinem Algorithmus gelöst werden können."
    ),

    // Question 10 — correctAnswer = 3 (D)
    Question(
        categoryId = 12,
        questionText = "Was ist ein 'Orakel' in der Berechenbarkeitstheorie und was zeigen Orakel-Trennungen?",
        answerA = "Ein Orakel ist ein Experte, den ein Algorithmus befragen kann — nicht formell definiert",
        answerB = "Ein Orakel ist ein Zufallsgenerator, der Algorithmen beschleunigt",
        answerC = "Orakel sind nur in der Quanteninformatik relevant",
        answerD = "Ein Orakel ist eine hypothetische externe Einheit, die eine unentscheidbare Funktion sofort beantwortet; Orakel-Trennungen zeigen, dass bestimmte Beweistechniken nicht ausreichen, um P vs. NP zu lösen",
        correctAnswer = 3,
        explanation = "Eine Orakel-Turingmaschine M^A hat Zugang zu einem Orakel A (z.B. dem Halteproblem) und kann in einem Schritt fragen 'Ist w∈A?'. Baker, Gill & Solovay (1975) zeigten: Es gibt Orakel A und B, sodass P^A=NP^A und P^B≠NP^B. Dies beweist, dass rein relativierende Beweistechniken die P-vs-NP-Frage nicht lösen können — ein wichtiger Hinweis auf die Schwierigkeit des Problems.",
        difficulty = 5,
        funFact = "Die Baker-Gill-Solovay-Trennungen schockierten 1975 die Komplexitätstheorie: Sie zeigten, dass alle 'natürlichen' Beweistechniken der damaligen Zeit für P≠NP ungeeignet sind."
    ),

    // Question 11 — correctAnswer = 1 (B)
    Question(
        categoryId = 12,
        questionText = "Was ist ein formales System nach David Hilberts Definition und welche drei Eigenschaften sollte ein 'gutes' Axiomensystem haben?",
        answerA = "Eine Menge von Regeln zum Lösen von Gleichungen; Eigenschaften: schnell, einfach, verständlich",
        answerB = "Ein formales System besteht aus Alphabet, Formationregeln, Axiomen und Ableitungsregeln; ein gutes System sollte konsistent (widerspruchsfrei), vollständig und entscheidbar sein",
        answerC = "Eine Programmiersprache mit formaler Semantik; Eigenschaften: typsicher, deterministisch, terminierend",
        answerD = "Ein logisches System ohne Quantoren; Eigenschaften: endlich, axiomenfrei, kompakt",
        correctAnswer = 1,
        explanation = "Hilbert wollte, dass ein Axiomensystem (1) konsistent ist: kein Widerspruch ableitbar; (2) vollständig: jede Aussage entweder beweisbar oder widerlegbar; (3) entscheidbar: es gibt ein Verfahren, das für jede Aussage in endlicher Zeit entscheidet, ob sie beweisbar ist. Gödels Sätze zeigen, dass (1) und (2) gleichzeitig für hinreichend mächtige Systeme nicht erreichbar sind; Turing zeigte, dass (3) für die Prädikatenlogik nicht erreichbar ist.",
        difficulty = 5,
        funFact = null
    ),

    // Question 12 — correctAnswer = 2 (C)
    Question(
        categoryId = 12,
        questionText = "Was ist der Unterschied zwischen Aussagenlogik und Prädikatenlogik erster Stufe hinsichtlich Entscheidbarkeit?",
        answerA = "Beide sind gleich entscheidbar, da sie dieselben logischen Konnektive verwenden",
        answerB = "Beide sind unentscheidbar, sobald unendliche Strukturen zugelassen sind",
        answerC = "Die Aussagenlogik ist entscheidbar (SAT ist in PSPACE, Tautologien in coNP); die Prädikatenlogik erster Stufe ist semi-entscheidbar (Gültigkeitsproblem), aber nicht entscheidbar",
        answerD = "Die Prädikatenlogik ist entscheidbar, die Aussagenlogik nicht",
        correctAnswer = 2,
        explanation = "Aussagenlogik: Das Tautologieproblem (ist F allgemeingültig?) ist in coNP, also entscheidbar. Prädikatenlogik erster Stufe (FOL): Das Gültigkeitsproblem ist semi-entscheidbar — Gödels Vollständigkeitssatz (1930, anderer Satz!) garantiert, dass jede allgemeingültige Formel einen endlichen Beweis hat, aber für ungültige Formeln gibt es keinen allgemeinen terminierenden Algorithmus. Church und Turing bewiesen 1936, dass FOL-Gültigkeit unentscheidbar ist.",
        difficulty = 5,
        funFact = "Gödel hat zwei berühmte Theoreme: den Vollständigkeitssatz (1930): 'In FOL ist alles Wahre beweisbar' — und den Unvollständigkeitssatz (1931): 'In PA ist nicht alles Wahre beweisbar'. Beide tragen seinen Namen, sagen aber scheinbar Gegenteiliges."
    ),

    // Question 13 — correctAnswer = 0 (A)
    Question(
        categoryId = 12,
        questionText = "Was ist die Kolmogorow-Komplexität K(x) einer Zeichenkette x und welche überraschende Eigenschaft hat sie?",
        answerA = "Die Länge der kürzesten Beschreibung von x in einer festgelegten universellen Programmiersprache; K(x) ist nicht berechenbar",
        answerB = "Die Anzahl der Bits, die benötigt werden, um x in einem Huffman-Code darzustellen; sie ist effizient berechenbar",
        answerC = "Die zyklische Redundanzprüfsumme von x; sie wird zur Fehlererkennung verwendet",
        answerD = "Die Entropie der Zeichenfolge x gemäß Shannons Informationstheorie; sie ist berechenbar",
        correctAnswer = 0,
        explanation = "Die Kolmogorow-Komplexität K(x) ist die Länge des kürzesten Programms p auf einer universellen Turingmaschine U, das x ausgibt: K(x) = min{|p| : U(p) = x}. Sie ist nicht berechenbar (man kann K(x) von oben annähern, aber nie exakt bestimmen). Eine zufällige Zeichenkette x hat K(x) ≈ |x|, da sie nicht kürzer beschreibbar ist. Das formalisiert den Begriff 'Zufälligkeit' für einzelne Objekte.",
        difficulty = 5,
        funFact = "Die Unberechenbarkeit von K(x) hat eine elegante Folge: Man kann niemals beweisen, dass eine spezifische Zeichenkette zufällig ist — auch wenn sie es ist."
    ),

    // Question 14 — correctAnswer = 3 (D)
    Question(
        categoryId = 12,
        questionText = "Was ist Chaitins Konstante Omega (Ω) und warum ist sie philosophisch bedeutsam?",
        answerA = "Die Kreiszahl π in binärer Darstellung — irrational und transzendent",
        answerB = "Die größte darstellbare Primzahl in einem formalen System",
        answerC = "Chaitins Konstante für die durchschnittliche Laufzeit aller Turingmaschinen",
        answerD = "Die Haltewahrscheinlichkeit einer universellen Turingmaschine bei zufälliger Eingabe — eine reelle Zahl, die absolut zufällig, nicht berechenbar, aber wohldefiniert ist",
        correctAnswer = 3,
        explanation = "Ω = Σ{M hält} 2^(-|M|) summiert über alle haltenden Programme M einer universellen prefix-freien TM. Ω ist zwischen 0 und 1, wohldefiniert und normal (jede Bitfolge kommt gleichhäufig vor). Trotzdem: Kein Algorithmus kann auch nur die ersten n Bits von Ω für beliebig großes n berechnen. Chaitin zeigte, dass Ω Informationen über die Unlösbarkeit aller mathematischen Probleme kodiert — sie ist eine 'Zahl, die man nie kennen kann'.",
        difficulty = 5,
        funFact = "Gregory Chaitin bezeichnete Ω als 'das absolute Zufällige' — eine Zahl, die mathematisch definiert ist, aber deren Bits so zufällig sind wie Münzwürfe, ohne jegliche erkennbare Struktur."
    ),

    // Question 15 — correctAnswer = 2 (C)
    Question(
        categoryId = 12,
        questionText = "Was ist ein 'seltsame Schleife' (strange loop) im Sinne von Douglas Hofstadter und in welchen drei Domänen illustriert GEB dieses Konzept?",
        answerA = "Ein Programmfehler mit endloser Rekursion; illustriert durch Assembler, C und Java",
        answerB = "Ein logischer Zirkelschluss; illustriert durch das Lügner-Paradoxon in drei Sprachen",
        answerC = "Eine hierarchische Struktur, die beim Durchlaufen der Ebenen überraschend zur Ausgangsebene zurückkehrt; illustriert durch Gödels Unvollständigkeitssatz, Eschers unmögliche Zeichnungen und Bachs Kanons",
        answerD = "Ein topologisches Phänomen in der Mengenlehre; illustriert durch Cantors Diagonalargument",
        correctAnswer = 2,
        explanation = "Hofstadter definiert 'strange loop' als ein Phänomen, bei dem man eine scheinbar strenge Hierarchie von Ebenen durchläuft und am Ende unerwarteterweise auf der Startebene landet. In GEB: (1) Gödel — ein formales System kann Aussagen über sich selbst machen und seine eigene Unvollständigkeit beweisen; (2) Escher — Zeichnungen wie 'Hände die sich selbst zeichnen' oder der unmögliche Wasserfall; (3) Bach — Kanons und Fugen, die in die Ausgangstonart zurückkehren, etwa der 'Endlose Aufwärtszug'.",
        difficulty = 5,
        funFact = "Hofstadters Hauptthese in GEB: Bewusstsein entsteht genau dann, wenn ein System eine hinreichend komplexe seltsame Schleife über sich selbst hat — Selbstreferenz als Kern des Ich-Gefühls."
    ),

    // Question 16 — correctAnswer = 1 (B)
    Question(
        categoryId = 12,
        questionText = "Was ist der Unterschied zwischen einem 'Beweis' und einem 'meta-mathematischen Beweis', wie Gödel ihn verwendet?",
        answerA = "Ein Beweis folgt den Regeln des formalen Systems; ein meta-mathematischer Beweis ist informell und daher nicht verlässlich",
        answerB = "Ein formaler Beweis ist eine Ableitung innerhalb des Systems S; ein meta-mathematischer Beweis ist eine Argumentation außerhalb von S (auf der Meta-Ebene) über Eigenschaften von S selbst",
        answerC = "Beide sind identisch; 'meta-mathematisch' ist nur ein historischer Begriff",
        answerD = "Ein meta-mathematischer Beweis ist stets kürzer als ein formaler Beweis",
        correctAnswer = 1,
        explanation = "Gödels Unvollständigkeitssatz wird meta-mathematisch bewiesen: Man argumentiert außerhalb des Systems S über S. Der Satz selbst ('S ist unvollständig') ist keine Aussage in S, sondern eine Aussage über S. Gödels Genialität bestand darin, diesen meta-mathematischen Beweis via Gödelnummerierung in eine arithmetische Aussage innerhalb von S zu übersetzen — so wurde die Meta-Ebene in die Objekt-Ebene gespiegelt.",
        difficulty = 5,
        funFact = null
    ),

    // Question 17 — correctAnswer = 0 (A)
    Question(
        categoryId = 12,
        questionText = "Was ist das 'Lügner-Paradoxon' und wie unterscheidet es sich von Gödels unbeweisbarer Aussage G?",
        answerA = "Das Lügner-Paradoxon ('Diese Aussage ist falsch') ist widersprüchlich und deshalb aus keinem konsistenten System ableitbar; Gödels G ('Ich bin unbeweisbar') führt zu keinem Widerspruch und ist in konsistenten Systemen tatsächlich wahr, aber unbeweisbar",
        answerB = "Beide sind identisch — Gödel hat das Lügner-Paradoxon einfach formalisiert",
        answerC = "Das Lügner-Paradoxon ist entscheidbar, Gödels G nicht",
        answerD = "Das Lügner-Paradoxon gilt nur in der natürlichen Sprache, Gödels G nur in der Mengenlehre",
        correctAnswer = 0,
        explanation = "Das Lügner-Paradoxon 'Diese Aussage ist falsch' ist selbst-widersprüchlich: Wenn wahr, dann falsch; wenn falsch, dann wahr. Gödels G sagt dagegen 'Ich bin in S nicht beweisbar'. Falls S konsistent ist und G beweisbar wäre, dann wäre G falsch (Widerspruch zur Konsistenz). Also ist G unbeweisbar — und da G genau das behauptet, ist G wahr (meta-mathematisch). Kein Widerspruch, nur Unvollständigkeit. Gödel ersetzte 'falsch' durch 'unbeweisbar' und entschärfte so das Paradoxon.",
        difficulty = 5,
        funFact = "Bertrand Russell scherzte über sein eigenes Paradoxon (die Menge aller Mengen, die sich nicht selbst enthalten): 'Es gibt nur wenige Dinge, die mich aus dem Gleichgewicht bringen können — das ist eines davon.'"
    ),

    // Question 18 — correctAnswer = 3 (D)
    Question(
        categoryId = 12,
        questionText = "Was ist ein 'nichtstandard-Modell der Arithmetik' und was folgt daraus für Gödels Satz?",
        answerA = "Ein Modell, das keine Primzahlen enthält — existiert nach dem Vollständigkeitssatz",
        answerB = "Ein Modell mit endlich vielen natürlichen Zahlen — widerlegt Cantors Unendlichkeitsbeweis",
        answerC = "Ein Modell, in dem Addition, aber nicht Multiplikation definiert ist",
        answerD = "Ein Modell, das alle Axiome der Peano-Arithmetik erfüllt, aber zusätzlich 'unendlich große' natürliche Zahlen enthält; es folgt, dass Gödels unbeweisbare Aussage G in Nichtstandard-Modellen falsch sein kann",
        correctAnswer = 3,
        explanation = "Gödels Vollständigkeitssatz (1930) garantiert: Jede konsistente Theorie hat ein Modell. Der Kompaktheitssatz erlaubt, zur Peano-Arithmetik Axiome hinzuzufügen, die 'c > n' für alle n der Standardarithmetik fordern — das ergibt ein Nichtstandard-Modell mit riesigen Zahlen. In solchen Modellen können Gödels unbeweisbare Sätze falsch sein. Dies zeigt: 'Wahr' ist modellabhängig; Gödels G ist nur im Standardmodell wahr.",
        difficulty = 5,
        funFact = null
    ),

    // Question 19 — correctAnswer = 1 (B)
    Question(
        categoryId = 12,
        questionText = "Was ist der Satz von Löb (Löbs Theorem) und welche überraschende Aussage macht er über Beweisbarkeit?",
        answerA = "Kein konsistentes System kann einen Satz über die Vollständigkeit eines anderen Systems beweisen",
        answerB = "Falls ein System S beweisen kann 'Wenn S beweisbar(P), dann P', dann kann S auch P direkt beweisen — ein formales Analogon von 'Vertrau mir, wenn ich sage, dass ich es beweisen kann'",
        answerC = "Alle beweisbaren Sätze sind auch wahr in allen Modellen",
        answerD = "In keinem System ist eine Aussage über die eigene Beweisbarkeit formulierbar",
        correctAnswer = 1,
        explanation = "Löbs Theorem (1955): Für ein hinreichend mächtiges System S gilt: Wenn S ⊢ (□P → P) (d.h. S beweist: 'Wenn P beweisbar ist, dann ist P wahr'), dann gilt auch S ⊢ P. Der Beweis nutzt den zweiten Unvollständigkeitssatz. Eine Intuition: S misstraut sich selbst — wenn S nicht direkt weiß dass P wahr ist, akzeptiert S nicht einfach 'mein eigener Beweis von P reicht als Beleg für P'.",
        difficulty = 5,
        funFact = "Löbs Theorem ist die Grundlage für 'Löbsche Maschinen' in der KI-Sicherheitsforschung: Ein rationaler Softwareagent sollte keine Nachfolger-Versionen seiner selbst akzeptieren, die er nicht formal verifizieren kann."
    ),

    // Question 20 — correctAnswer = 2 (C)
    Question(
        categoryId = 12,
        questionText = "Was ist das Problem der 'Busy Beaver' Funktion Σ(n) und warum ist sie nicht berechenbar?",
        answerA = "Σ(n) ist die maximale Anzahl von Schritten einer n-Zustands-Turingmaschine — berechenbar durch Ausführen aller Maschinen",
        answerB = "Σ(n) ist die n-te Primzahl — berechenbar in polynomieller Zeit",
        answerC = "Σ(n) ist die maximale Anzahl von Einsen, die eine n-Zustands-2-Symbol-Turingmaschine auf leerem Band schreiben und dann halten kann — nicht berechenbar, da sie schneller wächst als jede berechenbare Funktion",
        answerD = "Σ(n) ist die Kolmogorow-Komplexität der Zahl n — nicht berechenbar aus denselben Gründen",
        correctAnswer = 2,
        explanation = "Die Busy-Beaver-Funktion Σ(n): Über alle n-Zustands-2-Symbol-Turingmaschinen, die auf leerem Band starten und irgendwann halten, nimm das Maximum der Anzahl geschriebener Einsen. Σ wächst schneller als jede berechenbare Funktion (hyperbolisch unberechenbar). Könnte man Σ(n) berechnen, könnte man das Halteproblem lösen: Simuliere alle n-Zustands-Maschinen bis Σ(n) Schritte; jede noch laufende Maschine hält nie. Bekannt: Σ(5) = 4098, Σ(6) ≥ 10^(10^18287).",
        difficulty = 5,
        funFact = "2024 wurde bewiesen, dass Σ(5) = 4098. Für Σ(6) sind die bekannten Untergrenzen so ungeheuerlich groß, dass allein ihre Beschreibung Seiten bräuchte — und die exakten Werte werden möglicherweise nie bekannt sein."
    ),

    // Question 21 — correctAnswer = 3 (D)
    Question(
        categoryId = 12,
        questionText = "Was ist ein 'rekursiv aufzählbares' (r.e.) Set, das nicht entscheidbar ist, und welches ist das kanonische Beispiel?",
        answerA = "Die Menge aller geraden Zahlen — rekursiv aufzählbar und entscheidbar",
        answerB = "Die Menge aller Primzahlen — nicht r.e., da unendlich",
        answerC = "Die Menge aller beweisbaren Aussagen in ZFC — r.e. und entscheidbar",
        answerD = "Die Menge aller haltenden Turingmaschinen K = {⟨M⟩ : M hält auf leerem Band} — r.e., aber nicht entscheidbar",
        correctAnswer = 3,
        explanation = "K = {⟨M⟩ : M hält auf ε} ist r.e.: Man kann alle Maschinen simulieren und akzeptiert, wenn eine hält (semi-Entscheidungsverfahren existiert). K ist nicht entscheidbar: Das Komplement K̄ (alle nie-haltenden Maschinen) ist nicht r.e., und eine Sprache ist genau dann entscheidbar, wenn sie und ihr Komplement beide r.e. sind. Wäre K entscheidbar, wäre das Halteproblem gelöst.",
        difficulty = 5,
        funFact = null
    ),

    // Question 22 — correctAnswer = 0 (A)
    Question(
        categoryId = 12,
        questionText = "Was ist 'Arithmetische Hierarchie' (Kleene-Hierarchie) und welche Stufe entspricht dem Halteproblem?",
        answerA = "Eine Hierarchie von Sprachen basierend auf Quantorenwechsel in Formeln der Form ∃∀∃...; das Halteproblem ist Σ₁⁰-vollständig (eine Existenzaussage über berechenbare Relationen)",
        answerB = "Eine Klassifikation von Datenbankabfragen; das Halteproblem liegt auf Stufe 3",
        answerC = "Eine Hierarchie von Komplexitätsklassen; das Halteproblem ist NP-vollständig",
        answerD = "Eine Klassifikation der Gödelschen Aussagen nach Tiefe der Selbstreferenz",
        correctAnswer = 0,
        explanation = "Die arithmetische Hierarchie klassifiziert Mengen natürlicher Zahlen nach der Struktur ihrer Definitionen: Σ₁⁰ = ∃x R(x,n) mit R entscheidbar; Π₁⁰ = ¬Σ₁⁰; Σ₂⁰ = ∃x∀y R(x,y,n); usw. Das Halteproblem ist Σ₁⁰-vollständig: Es gehört zu Σ₁⁰ (hält M auf w?: ∃t: M macht t Schritte und hält) und ist schwer für alle Σ₁⁰-Probleme. Gödels Satz entspricht: Die Menge beweisbarer Sätze ist Σ₁⁰, aber nicht Π₁⁰ (nicht entscheidbar).",
        difficulty = 5,
        funFact = null
    ),

    // Question 23 — correctAnswer = 1 (B)
    Question(
        categoryId = 12,
        questionText = "Welche der folgenden Aussagen über das Zermelo-Fraenkel-Axiomensystem mit Auswahlaxiom (ZFC) ist korrekt?",
        answerA = "ZFC ist vollständig: Jede mathematische Aussage ist in ZFC beweisbar oder widerlegbar",
        answerB = "ZFC ist nach Gödels Sätzen unvollständig: Es gibt Aussagen (z.B. die Kontinuumshypothese), die in ZFC weder beweisbar noch widerlegbar sind",
        answerC = "ZFC wurde 1931 von Gödel entwickelt, um seinen Unvollständigkeitssatz zu beweisen",
        answerD = "ZFC hat nur endlich viele Axiome und ist daher vollständig entscheidbar",
        correctAnswer = 1,
        explanation = "Gödels Satz gilt für ZFC: Als hinreichend mächtiges konsistentes System ist ZFC unvollständig. Ein konkretes Beispiel: Die Kontinuumshypothese (CH) — gibt es eine Mächtigkeit zwischen |ℕ| und |ℝ|? Gödel zeigte 1940, dass CH in ZFC nicht widerlegbar ist; Cohen zeigte 1963, dass CH in ZFC nicht beweisbar ist. CH ist also unabhängig von ZFC — ein echtes mathematisches Problem, das ZFC nicht entscheiden kann.",
        difficulty = 5,
        funFact = "Paul Cohen erfand für seinen Beweis 1963 eine neue Technik ('Forcing'), die heute eine der mächtigsten Methoden der Mengenlehre ist. Er erhielt dafür 1966 die Fields-Medaille."
    ),

    // Question 24 — correctAnswer = 0 (A)
    Question(
        categoryId = 12,
        questionText = "Was ist 'Typ-Theorie' (Martin-Löf) und wie unterscheidet sie sich von klassischer Mengenlehre als Grundlage der Mathematik?",
        answerA = "Typ-Theorie ersetzt Mengen durch Typen; Beweise sind Programme (Curry-Howard-Isomorphismus); es ist konstruktiv — Existenzbeweise müssen ein Objekt liefern",
        answerB = "Typ-Theorie ist eine Erweiterung der ZFC-Mengenlehre um Typenklassen",
        answerC = "Typ-Theorie ist eine Programmiersprachentheorie ohne Bezug zur Grundlagenforschung",
        answerD = "Typ-Theorie und Mengenlehre sind beweisbar äquivalent ohne Unterschiede",
        correctAnswer = 0,
        explanation = "Martin-Löf-Typ-Theorie (1975) ist eine konstruktive Alternative zu ZFC: (1) Typen statt Mengen als Grundbegriff; (2) Curry-Howard-Isomorphismus: Beweise sind Programme, Typen sind Aussagen; (3) konstruktiv: Ein Beweis von ∃x:P(x) muss ein konkretes x und einen Beweis von P(x) liefern. Klassische Mathematik (ZFC + Auswahlaxiom + Tertium non Datur) ist mächtiger aber nicht konstruktiv. Typ-Theorie ist die Grundlage moderner Beweisassistenten wie Coq, Lean, Agda.",
        difficulty = 5,
        funFact = "Das Lean-Beweissystem, basierend auf Typ-Theorie, wird seit 2023 in großem Maßstab eingesetzt: Mathematiker formalisieren ganze Lehrbücher in Lean, um Beweise maschinell zu verifizieren."
    ),

    // Question 25 — correctAnswer = 3 (D)
    Question(
        categoryId = 12,
        questionText = "Was ist 'Prädikatenlogik zweiter Stufe' und warum ist sie für formale Systeme besonders problematisch?",
        answerA = "Sie erlaubt Quantoren über Aussagenvariablen und ist vollständig und entscheidbar",
        answerB = "Sie ist eine Erweiterung der Mengenlehre, die unendliche Axiomensysteme erlaubt",
        answerC = "Zweite Stufe bedeutet zwei Arten von Variablen: Zahlen und Mengen; sie ist entscheidbar",
        answerD = "Sie erlaubt Quantoren über Prädikate und Funktionen (nicht nur Objekte); sie ist vollständig (im Sinne von Modellen), aber nicht axiomatisierbar — kein korrektes und vollständiges Beweissystem existiert",
        correctAnswer = 3,
        explanation = "Prädikatenlogik zweiter Stufe (SOL) erlaubt Quantifizierung über Prädikate: ∀P∃x: P(x). SOL kann die natürlichen Zahlen kategorisch charakterisieren (bis auf Isomorphie eindeutig) — im Gegensatz zu FOL, die Nichtstandard-Modelle zulässt. Jedoch: SOL hat kein vollständiges Beweissystem (Lindström-Theorem). Es gibt keine rekursiv aufzählbare Menge von Ableitungsregeln, die genau alle gültigen SOL-Formeln beweist. SOL tauscht Beweisbarkeit gegen semantische Stärke.",
        difficulty = 5,
        funFact = null
    ),

    // Question 26 — correctAnswer = 2 (C)
    Question(
        categoryId = 12,
        questionText = "Was ist die 'Curry-Howard-Entsprechung' und welche drei Paare von Konzepten setzt sie gleich?",
        answerA = "Eine Kodierungsmethode für Curry-Gerichte in Computerprogramme — sie verbindet Kochrezepte mit Algorithmen",
        answerB = "Eine Entsprechung zwischen Lambda-Kalkül-Terme und natürliche Zahlen",
        answerC = "Ein tiefer Isomorphismus zwischen Logik und Typentheorie: Aussagen ↔ Typen, Beweise ↔ Programme, Beweisreduktion ↔ Programmausführung",
        answerD = "Eine Methode zur Übersetzung zwischen Prädikatenlogik und Mengenlehre",
        correctAnswer = 2,
        explanation = "Die Curry-Howard-Korrespondenz (Curry 1934, Howard 1969): (1) Aussagen in intuitionistischer Logik ↔ Typen in typisiertem Lambda-Kalkül; (2) Beweise einer Aussage ↔ Programme des entsprechenden Typs; (3) Beweissimplifikation ↔ Programmauswertung (β-Reduktion). Beispiel: A → B (Implikation) ↔ Funktionstyp A → B; ein Beweis von A → B ist eine Funktion, die aus einem Beweis von A einen Beweis von B konstruiert. Dies ist die theoretische Grundlage interaktiver Beweisassistenten.",
        difficulty = 5,
        funFact = "Die Curry-Howard-Korrespondenz wurde auf weitere Gebiete ausgedehnt: Curry-Howard-Lambek-Korrespondenz verbindet Logik, Typentheorie und Kategorientheorie — drei scheinbar völlig verschiedene Mathematikgebiete sind strukturell identisch."
    ),

    // Question 27 — correctAnswer = 1 (B)
    Question(
        categoryId = 12,
        questionText = "Was ist ein 'nicht-deterministischer Automat' und warum ist die Klasse NP nicht offensichtlich größer als P?",
        answerA = "Ein Automat mit Zufallsgenerator; NP enthält nur Probleme, die Glück brauchen",
        answerB = "Ein Automat, der in jedem Schritt mehrere Übergänge gleichzeitig 'ausprobieren' kann; NP ist die Klasse der Probleme, deren Lösungen in polynomieller Zeit verifiziert werden können — ob P=NP ist unbekannt",
        answerC = "Ein Automat ohne definierten Startzustand; NP ist beweisbar größer als P",
        answerD = "Ein Automat mit mehreren Köpfen; NP entspricht EXPTIME",
        correctAnswer = 1,
        explanation = "Nicht-deterministische Turingmaschinen 'raten' die Lösung in polynomieller Zeit und verifizieren sie dann. NP = Klasse der Probleme, deren Lösungen effizient verifizierbar sind. P ⊆ NP ist klar. Ob P = NP, ist das bedeutendste offene Problem der Informatik (Clay Millennium Problem, 1 Mio. USD Preisgeld). Fast alle Experten glauben P ≠ NP, aber kein Beweis existiert. Ein Beweis von P = NP würde z.B. Kryptographie (RSA, AES) grundsätzlich gefährden.",
        difficulty = 5,
        funFact = "Stephen Cook formulierte das P-vs-NP-Problem 1971. Seitdem wurden tausende Beweisversuche eingereicht — keiner war korrekt. Es gilt als das schwierigste offene Problem der Mathematik."
    ),

    // Question 28 — correctAnswer = 0 (A)
    Question(
        categoryId = 12,
        questionText = "Was ist 'konstruktive Mathematik' (Intuitionismus) und wie unterscheidet sie sich von der klassischen Mathematik Hilbertscher Prägung?",
        answerA = "Konstruktive Mathematik akzeptiert nur Beweise, die ein Objekt explizit konstruieren; das Tertium non Datur (A ∨ ¬A) gilt nicht universell; klassische Mathematik erlaubt nicht-konstruktive Existenzbeweise",
        answerB = "Konstruktive Mathematik verwendet nur gerade Zahlen; klassische Mathematik alle Zahlen",
        answerC = "Konstruktive Mathematik ist weniger streng als klassische Mathematik und lässt mehr Beweise zu",
        answerD = "Beide sind identisch; 'konstruktiv' ist nur ein stilistischer Begriff",
        correctAnswer = 0,
        explanation = "Brouwers Intuitionismus (ab 1907): Mathematik ist eine mentale Konstruktion; eine Aussage ist wahr nur dann, wenn ein mentaler Beweis konstruiert werden kann. Das Tertium non Datur 'A ∨ ¬A' gilt nicht: Ohne expliziten Beweis für A oder ¬A darf man nicht behaupten, eines von beiden gilt. Nicht-konstruktive klassische Beweise (z.B. 'Angenommen, keine der Zahlen hat Eigenschaft X... Widerspruch, also existiert eine solche Zahl') sind in reiner konstruktiver Mathematik nicht akzeptabel.",
        difficulty = 5,
        funFact = "Hilbert antwortete auf Brouwers Intuitionismus berühmt: 'Uns aus dem Paradies, das Cantor geschaffen hat, wird niemand vertreiben.' Der Streit zwischen Hilbert und Brouwer gilt als einer der heftigsten in der Mathematikgeschichte."
    ),

    // Question 29 — correctAnswer = 3 (D)
    Question(
        categoryId = 12,
        questionText = "Was ist ein 'Fixpunktsatz' in der Logik und wie wird er im Beweis des Unvollständigkeitssatzes genutzt?",
        answerA = "Ein Satz über Fixpunkte von stetigen Funktionen (Brouwer); er wird zum Halteproblem reduziert",
        answerB = "Ein Satz, der besagt, dass alle Formeln in PA Fixpunkte haben",
        answerC = "Ein Satz aus der Kategorientheorie, der auf die Logik übertragen wurde",
        answerD = "Der Diagonale Fixpunktsatz: Für jede berechenbare Eigenschaft φ gibt es eine Aussage G, die äquivalent zu φ(⌈G⌉) ist — G 'spricht über sich selbst'. Er ermöglicht die Konstruktion von Gödels selbstreferenzieller Aussage",
        correctAnswer = 3,
        explanation = "Der diagonale Fixpunktsatz (Carnap 1934, Gödel implizit 1931): Für jede berechenbare einstellige Formel φ(x) der Arithmetik existiert ein Satz G, sodass PA ⊢ (G ↔ φ(⌈G⌉)), wobei ⌈G⌉ die Gödelnummer von G ist. G ist semantisch äquivalent zu 'φ gilt für mich selbst'. Setzt man φ(x) = ¬Bew(x) ('x ist nicht beweisbar'), erhält man Gödels G: G ↔ ¬Bew(⌈G⌉). G sagt buchstäblich 'Ich bin nicht beweisbar'.",
        difficulty = 5,
        funFact = null
    ),

    // Question 30 — correctAnswer = 2 (C)
    Question(
        categoryId = 12,
        questionText = "Was ist 'Reverse Mathematics' (Simpson) und was versucht sie herauszufinden?",
        answerA = "Die Umkehrung mathematischer Beweise — jeden Satz aus seinem eigenen Beweis ableiten",
        answerB = "Ein Ansatz, klassische Mathematik durch konstruktive Mathematik zu ersetzen",
        answerC = "Ein Programm, das für jeden mathematischen Satz bestimmt, welches minimale Axiomensystem notwendig und hinreichend ist, um ihn zu beweisen — meist eines von fünf Basis-Systemen",
        answerD = "Die Berechnung der Gödelnummern aller Theoreme der Mathematik in umgekehrter Reihenfolge",
        correctAnswer = 2,
        explanation = "Reverse Mathematics (Harvey Friedman, ab 1975) stellt die Frage: Was sind die exakten logischen Voraussetzungen für bekannte mathematische Sätze? Man arbeitet in schwacher Basistheorie (RCA₀) und zeigt, dass ein Satz S äquivalent zu einem Axiom A ist über RCA₀. Die meisten Sätze der Standardmathematik fallen in eines von fünf Systemen (Big Five): RCA₀, WKL₀, ACA₀, ATR₀, Π₁¹-CA₀. Dies messen die logische Stärke mathematischer Aussagen präzise.",
        difficulty = 5,
        funFact = "Das 'Big Five'-Phänomen in Reverse Mathematics ist bis heute ungeklärt: Warum fallen fast alle mathematischen Sätze in genau diese fünf Systeme — und kaum in Zwischenstufen?"
    ),

    // Question 31 — correctAnswer = 1 (B)
    Question(
        categoryId = 12,
        questionText = "Was ist ein 'Modell' eines formalen Systems im modelltheoretischen Sinne und was besagt Gödels Vollständigkeitssatz (nicht Unvollständigkeitssatz)?",
        answerA = "Ein Modell ist ein Computermodell zur Simulation; der Vollständigkeitssatz besagt, dass alle Computermodelle korrekt sind",
        answerB = "Ein Modell ist eine Struktur, die alle Axiome erfüllt; Gödels Vollständigkeitssatz (1930): Jede allgemeingültige Formel der Prädikatenlogik erster Stufe hat einen endlichen formalen Beweis",
        answerC = "Ein Modell ist ein vereinfachtes formales System; der Vollständigkeitssatz besagt, dass Modelle immer einfacher sind als das Original",
        answerD = "Gödel hat keinen Vollständigkeitssatz bewiesen — das war Gentzen",
        correctAnswer = 1,
        explanation = "Ein Modell M einer Theorie T ist eine Struktur (Universum + Interpretationsfunktionen), in der alle Axiome von T gelten. Gödels Vollständigkeitssatz (Dissertation 1929, Publikation 1930): Für FOL gilt semantische Implikation genau dann, wenn syntaktische Ableitbarkeit gilt. Formal: T ⊨ φ gdw. T ⊢ φ. Dies ist verschieden vom Unvollständigkeitssatz: FOL ist vollständig, aber PA (Arithmetik als FOL-Theorie mit Standardmodell) ist unvollständig. Der Vollständigkeitssatz gilt für logische Gültigkeit, nicht für spezifische Theorien.",
        difficulty = 5,
        funFact = "Gödel bewies seinen Vollständigkeitssatz mit 23 Jahren in seiner Doktorarbeit. Sein Betreuer Hans Hahn soll zunächst gezögelt haben, ob das Ergebnis wirklich korrekt sei — es war zu elegant."
    ),

    // Question 32 — correctAnswer = 3 (D)
    Question(
        categoryId = 12,
        questionText = "Was ist das 'Entscheidungsproblem für die Theorie reeller Zahlen' (Tarski) und wie unterscheidet es sich vom Ergebnis für Arithmetik?",
        answerA = "Beide sind unentscheidbar — Reelle Zahlen sind noch schwerer als natürliche Zahlen",
        answerB = "Die Theorie reeller Zahlen ist halbentscheidbar; natürliche Zahlen sind vollständig entscheidbar",
        answerC = "Beide haben denselben Entscheidbarkeitsgrad — sie sind ineinander reduzierbar",
        answerD = "Die Theorie reeller Zahlen mit Addition und Multiplikation ist entscheidbar (Tarski, 1951) — im Gegensatz zur Arithmetik der natürlichen Zahlen, die unentscheidbar ist",
        correctAnswer = 3,
        explanation = "Tarski bewies 1951 (veröffentlicht) mit der 'Quantorenelimination': Die Theorie der reell-abgeschlossenen Felder (Reelle Zahlen mit +, ×, <) ist vollständig und entscheidbar. Für jeden Satz über reelle Zahlen gibt es einen Algorithmus, der entscheidet, ob er wahr ist. Im Gegensatz dazu: Die Theorie der natürlichen Zahlen (Peano-Arithmetik) ist nach Gödel unvollständig und nach Turing unentscheidbar. Der entscheidende Unterschied: ℝ hat keine Multiplikation von beliebiger Tiefe (Henkin), ℕ schon.",
        difficulty = 5,
        funFact = "Tarskis Quantorenelimination für reelle Zahlen ist die theoretische Grundlage der 'Zylindrischen algebraischen Dekomposition' — heute ein zentraler Algorithmus in der Computer-Algebra."
    ),

    // Question 33 — correctAnswer = 0 (A)
    Question(
        categoryId = 12,
        questionText = "Was ist das 'Presburger-Arithmetik'-Fragment und warum ist es entscheidbar, obwohl volle Arithmetik es nicht ist?",
        answerA = "Presburger-Arithmetik enthält nur Addition (kein Mal); sie ist entscheidbar, weil Multiplikation für die Unentscheidbarkeit wesentlich ist",
        answerB = "Presburger-Arithmetik enthält nur Multiplikation; sie ist entscheidbar, weil Addition einfach ist",
        answerC = "Presburger-Arithmetik ist die Arithmetik mit < aber ohne =; sie ist entscheidbar durch Fallunterscheidung",
        answerD = "Presburger-Arithmetik enthält nur endliche Mengen von Zahlen; sie ist trivialerweise entscheidbar",
        correctAnswer = 0,
        explanation = "Presburger-Arithmetik (Mojżesz Presburger, 1929): Die Theorie der natürlichen Zahlen mit Addition, ohne Multiplikation. Presburger bewies Vollständigkeit und Entscheidbarkeit durch Quantorenelimination. Volle Peano-Arithmetik (mit Multiplikation) ist unentscheidbar. Gödels Kodierung (Gödelnummerierung) nutzt essenziell Multiplikation und Exponentiation. Ohne Multiplikation kann man die für Gödels Trick nötige Selbstreferenz nicht kodieren — daher ist Presburger-Arithmetik entscheidbar.",
        difficulty = 5,
        funFact = null
    ),

    // Question 34 — correctAnswer = 2 (C)
    Question(
        categoryId = 12,
        questionText = "Was ist 'Transfinite Rekursion' und wie hängt sie mit der Beweiskraft formaler Systeme zusammen?",
        answerA = "Rekursion über unendliche Datenstrukturen in funktionalen Programmiersprachen",
        answerB = "Ein Beweisverfahren, das transfinit viele Schritte benötigt — daher nicht formalisierbar",
        answerC = "Rekursion entlang Cantor'scher Ordinalzahlen (ω, ω+1, ω·2, ε₀, ...); die 'Beweiskraft' eines Systems wird durch seine größte beweisbar wohlgeordnete Ordinalzahl gemessen (Proof-theoretische Ordinalzahl)",
        answerD = "Cantors Diagonalargument, angewandt auf berechenbare Funktionen",
        correctAnswer = 2,
        explanation = "Cantors Ordinalzahlen ω, ω+1, ω², ωω, ε₀, ... beschreiben 'Arten von Unendlichkeit'. Die proof-theoretische Ordinalzahl eines Systems S ist die kleinste Ordinalzahl, bis zu der S keine transfinite Induktion beweisen kann. PA hat proof-theoretische Ordinalzahl ε₀ (epsilon-null). Gentzen bewies 1936 die Konsistenz von PA mittels Induktion bis ε₀ — ein Beweis außerhalb von PA (der zweite Unvollständigkeitssatz macht ihn in PA unmöglich). ZFC hat eine weit größere Ordinalzahl.",
        difficulty = 5,
        funFact = "Gentzens Beweis der Konsistenz von PA ist ein Meisterwerk: Er zeigt, dass PA korrekt ist, aber der Preis ist eine Induktion über ε₀ — eine Ordinalzahl, deren 'Größe' intuitiv kaum vorstellbar ist."
    ),

    // Question 35 — correctAnswer = 1 (B)
    Question(
        categoryId = 12,
        questionText = "Was ist 'NP-Vollständigkeit' und was wäre die Folge, wenn ein NP-vollständiges Problem in polynomieller Zeit lösbar wäre?",
        answerA = "NP-vollständige Probleme sind die leichtesten in NP; eine polynomielle Lösung würde nur dieses Problem betreffen",
        answerB = "NP-vollständige Probleme sind die schwersten in NP; jedes NP-Problem kann in polynomieller Zeit darauf reduziert werden; eine polynomielle Lösung würde P = NP beweisen und alle NP-Probleme effizient lösbar machen",
        answerC = "NP-vollständige Probleme liegen außerhalb von NP; eine Lösung würde NP kollabieren lassen",
        answerD = "NP-Vollständigkeit gilt nur für Entscheidungsprobleme, nicht für Optimierungsprobleme",
        correctAnswer = 1,
        explanation = "NP-Vollständigkeit (Cook-Levin-Theorem, 1971/1973): Ein Problem L ist NP-vollständig, wenn (1) L ∈ NP und (2) jedes NP-Problem in polynomieller Zeit auf L reduziert werden kann. SAT war das erste NP-vollständige Problem. Wenn irgendein NP-vollständiges Problem in polynomieller Zeit gelöst werden könnte, dann P = NP — alle NP-Probleme wären effizient lösbar. Zu den NP-vollständigen Problemen gehören: Clique, Hamiltonkreis, 0-1-Rucksackproblem, Traveling Salesman (Entscheidungsversion).",
        difficulty = 5,
        funFact = "Richard Karp zeigte 1972, dass 21 klassische kombinatorische Probleme alle NP-vollständig sind — eine Schockwelle für die Algorithmik, da damit schlagartig klar wurde, warum niemand effiziente Algorithmen dafür finden konnte."
    ),

    // Question 36 — correctAnswer = 0 (A)
    Question(
        categoryId = 12,
        questionText = "Was ist Cantors Diagonalargument und für welche drei verschiedenen Sätze wurde dieses Argument-Schema verwendet?",
        answerA = "Ein Argument, das durch Konstruktion eines Elements zeigt, das in keiner aufgezählten Schreibweise vorkommt; verwendet für: Überabzählbarkeit von ℝ, Unentscheidbarkeit des Halteproblems und Unvollständigkeit (Gödels Konstruktion)",
        answerB = "Eine Methode zur Konstruktion von Primzahlen; verwendet für Euklids Unendlichkeitsbeweis, Fermats letzten Satz und Riemanns Hypothese",
        answerC = "Ein Argument aus der Topologie; verwendet für Brouwers Fixpunktsatz",
        answerD = "Eine Beweismethode aus der Kombinatorik; nur für endliche Mengen anwendbar",
        correctAnswer = 0,
        explanation = "Cantors Diagonalargument (1891): Angenommen, ℝ wäre abzählbar. Dann konstruiere eine reelle Zahl, die sich von der n-ten aufgezählten Zahl an der n-ten Stelle unterscheidet — Widerspruch. Turing (1936): Angenommen, das Halteproblem wäre entscheidbar. Dann konstruiere eine Maschine, die 'diagonal' das Gegenteil tut — Widerspruch. Gödel (1931): Konstruiere eine Aussage, die diagonal über ihre eigene Gödelnummer spricht. Alle drei verwenden dasselbe Schema: Diagonalzug erzeugt Selbstreferenz-Widerspruch.",
        difficulty = 5,
        funFact = "Cantor selbst war von seinem Beweis so erschrocken, dass er in einem Brief schrieb: 'Ich sehe es, aber ich glaube es nicht.' Die Überabzählbarkeit von ℝ widersprach allen intuitiven Vorstellungen seiner Zeit."
    ),

    // Question 37 — correctAnswer = 3 (D)
    Question(
        categoryId = 12,
        questionText = "Was ist 'Beweiskomplexität' und was ist die Verbindung zur P-vs-NP-Frage?",
        answerA = "Die Anzahl der Zeilen in einem formalen Beweis; keine direkte Verbindung zu P vs. NP",
        answerB = "Die Komplexität von Gödels Unvollständigkeitsbeweis; sie beweist P ≠ NP direkt",
        answerC = "Die Anzahl der Axiome in ZFC; mehr Axiome bedeuten einfachere Beweise",
        answerD = "Die Untersuchung der minimalen Größe formaler Beweise in verschiedenen Beweissystemen; ein Super-polynomieller unterer Schranken-Beweis für ein NP-vollständiges Problem in allen Beweissystemen würde P ≠ NP implizieren",
        correctAnswer = 3,
        explanation = "Beweiskomplexität (Cook, Reckhow, 1979): Wie groß müssen Beweise in einem Beweissystem P_s sein? Ein Beweissystem S ist polynomiell gebunden, wenn jede Tautologie in S einen Beweis polynomieller Länge hat. Wenn kein Beweissystem polynomiell gebunden ist (d.h. für jedes System gibt es Tautologien mit superpolynomiellen Beweisen), dann NP ≠ coNP, was P ≠ NP impliziert. Aktuell: Frege-Systeme zeigen superpolynomielle untere Schranken für bestimmte Formeln — aber keine für alle NP-Probleme.",
        difficulty = 5,
        funFact = null
    ),

    // Question 38 — correctAnswer = 2 (C)
    Question(
        categoryId = 12,
        questionText = "Was ist ein 'Lambda-Kalkül' (Church) und was hat er mit Turingmaschinen gemein?",
        answerA = "Lambda-Kalkül ist eine Erweiterung der Mengenlehre; er ist weniger mächtig als Turingmaschinen",
        answerB = "Lambda-Kalkül beschreibt nur rekursive Funktionen, Turingmaschinen alle Funktionen",
        answerC = "Lambda-Kalkül ist ein formales System für Funktionen und deren Anwendung; er ist berechenbarkeitsmäßig äquivalent zu Turingmaschinen — beide beschreiben genau dieselbe Klasse berechenbarer Funktionen",
        answerD = "Lambda-Kalkül ist eine Programmiersprache; er ist mächtiger als Turingmaschinen",
        correctAnswer = 2,
        explanation = "Alonzo Church entwickelte 1932-1933 den Lambda-Kalkül als Grundlage der Mathematik und Berechenbarkeit. λx.M ist eine Funktion mit Parameter x und Körper M; Anwendung: (λx.M)N reduziert zu M[x:=N]. Church und Turing zeigten 1936 unabhängig: Lambda-Kalkül und Turingmaschinen berechnen dieselben Funktionen. Dies stützt die Church-Turing-These. Lambda-Kalkül ist die theoretische Grundlage funktionaler Programmiersprachen wie Haskell, Lisp, ML.",
        difficulty = 5,
        funFact = "Churchs ursprünglicher Lambda-Kalkül (1932) war inkonsistent als logisches System — Kleene und Rosser fanden einen Widerspruch. Church rettete ihn, indem er nur den berechenbaren Teil behielt."
    ),

    // Question 39 — correctAnswer = 0 (A)
    Question(
        categoryId = 12,
        questionText = "Was ist das 'zweite Hilbertsche Problem' und wie hat Gödels Arbeit es beantwortet?",
        answerA = "Hilbert fragte (1900), ob die Axiome der Arithmetik widerspruchsfrei sind und ob ein Widerspruchsfreiheitsbeweis mit finiten Mitteln möglich ist — Gödels zweiter Satz zeigt: Ein solcher Beweis in PA selbst ist unmöglich",
        answerB = "Hilbert fragte, ob die Axiome der euklidischen Geometrie vollständig sind — beantwortet mit Ja durch Tarski",
        answerC = "Hilbert fragte, ob alle mathematischen Probleme lösbar sind — beantwortet mit Nein durch Turing",
        answerD = "Hilbert fragte nach dem Korrektheitsnachweis für Mengenlehre — bis heute offen",
        correctAnswer = 0,
        explanation = "Hilberts zweites Problem (1900): Beweise die Widerspruchsfreiheit der Axiome der Arithmetik. Dies war Teil seines großen Programms. Gödels zweiter Unvollständigkeitssatz (1931): Kein hinreichend mächtiges konsistentes System kann seine eigene Konsistenz beweisen. Spezifisch: PA ⊬ Con(PA), sofern PA konsistent ist. Damit ist Hilberts Wunsch nach einem finiten Konsistenzbeweis in PA selbst unmöglich. Gentzens Beweis von Con(PA) existiert — aber er verwendet transfinite Induktion bis ε₀, also finitistisch nicht akzeptable Mittel.",
        difficulty = 5,
        funFact = null
    ),

    // Question 40 — correctAnswer = 3 (D)
    Question(
        categoryId = 12,
        questionText = "Was ist 'Logizismus' (Frege, Russell) als philosophisches Programm und warum scheiterte es?",
        answerA = "Logizismus wollte alle Mathematik aus der Physik ableiten; es scheiterte an der Relativitätstheorie",
        answerB = "Logizismus war eine Bewegung für computerbasierte Beweise; es scheiterte an mangelnder Rechenleistung",
        answerC = "Logizismus wollte Geometrie aus Arithmetik ableiten; es scheiterte an nicht-euklidischer Geometrie",
        answerD = "Logizismus wollte alle Mathematik aus reiner Logik und Mengenlehre ableiten ohne außer-logische Grundbegriffe; es scheiterte an Russells Paradoxon (Freges System) und Gödels Unvollständigkeitssatz (Russells Principia Mathematica)",
        correctAnswer = 3,
        explanation = "Freges Grundgesetze der Arithmetik (1893/1903) wollten alle Mathematik aus Logik + naiver Mengenlehre ableiten. Russell schickte 1902 seinen berühmten Brief: Das naive Komprehensionsprinzip erlaubt die Menge R = {x : x∉x}, die zu einem Widerspruch führt (Russells Paradoxon). Frege kollabierte (schrieb im Nachwort: 'Ein Wissenschaftler kann kaum Schlimmeres erleben'). Russell und Whitehead retteten das Programm in Principia Mathematica (1910-13) — aber Gödels Sätze zeigten, dass kein solches System vollständig sein kann.",
        difficulty = 5,
        funFact = "Frege schrieb im Nachwort des zweiten Bandes seiner Grundgesetze, als er Russells Brief erhielt: 'Einem wissenschaftlichen Schriftsteller kann kaum etwas Unerwünschteres begegnen als dass ihm nach Vollendung einer Arbeit eine der Grundlagen seines Baues erschüttert wird.' Er veröffentlichte es trotzdem."
    ),

    // Question 41 — correctAnswer = 2 (C)
    Question(
        categoryId = 12,
        questionText = "Was ist eine 'nicht-berechenbare reelle Zahl' und wie viele gibt es im Verhältnis zu allen reellen Zahlen?",
        answerA = "Fast alle reellen Zahlen sind berechenbar; nicht-berechenbare Zahlen sind selten und künstlich konstruiert",
        answerB = "Alle reellen Zahlen sind berechenbar; das Konzept 'nicht-berechenbar' gilt nur für natürliche Zahlen",
        answerC = "Berechenbare reelle Zahlen sind abzählbar (da Programme abzählbar sind); nicht-berechenbare reelle Zahlen bilden eine überabzählbare Mehrheit — fast alle reellen Zahlen sind nicht-berechenbar",
        answerD = "Beide Klassen sind gleich groß und gleich häufig",
        correctAnswer = 2,
        explanation = "Eine reelle Zahl r ist berechenbar, wenn eine Turingmaschine die Dezimalentwicklung von r mit beliebiger Genauigkeit berechnen kann. Berechenbare Zahlen: π, e, √2, alle algebraischen Zahlen, alle Zahlen mit endlicher Beschreibung. Da Programme abzählbar sind (endliche Zeichenketten über endlichem Alphabet), gibt es nur abzählbar viele berechenbare reelle Zahlen. Da ℝ überabzählbar ist, sind fast alle (im Maß-theoretischen Sinne: alle bis auf eine Menge vom Maß 0) reellen Zahlen nicht-berechenbar.",
        difficulty = 5,
        funFact = "Man kann keine nicht-berechenbare reelle Zahl explizit hinschreiben — per Definition. Chaitins Ω ist ein Beispiel einer nicht-berechenbaren Zahl, die aber mathematisch präzise definiert ist."
    ),

    // Question 42 — correctAnswer = 1 (B)
    Question(
        categoryId = 12,
        questionText = "Was ist das 'Kompaktheitssatz der Prädikatenlogik' und was folgt daraus für unendliche Theorien?",
        answerA = "Jede endliche Theorie hat ein endliches Modell; unendliche Theorien haben kein Modell",
        answerB = "Eine Theorie T hat genau dann ein Modell, wenn jede endliche Teilmenge von T ein Modell hat; damit kann man unendlich große Objekte aus endlichen Approximationen ableiten",
        answerC = "Jedes Modell einer Theorie ist endlich darstellbar",
        answerD = "Der Kompaktheitssatz gilt nur für Aussagenlogik, nicht für Prädikatenlogik",
        correctAnswer = 1,
        explanation = "Kompaktheitssatz (Gödel 1930, Malcev 1936): T hat ein Modell gdw. jede endliche Teilmenge von T ein Modell hat. Folgen: (1) Nichtstandard-Modelle der Arithmetik: Füge zu PA Axiome {c>0, c>1, c>2, ...} hinzu; jede endliche Teilmenge ist erfüllbar → das ganze unendliche System hat ein Modell mit einem 'unendlich großen Element' c. (2) Kompaktheitssatz + Löwenheim-Skolem: Jede Theorie mit unendlichem Modell hat Modelle jeder unendlichen Kardinalzahl.",
        difficulty = 5,
        funFact = "Der Kompaktheitssatz hat ein kurioses Korollar: Man kann in FOL nicht erzwingen, dass ein Modell 'genau ω-viele Elemente' hat — jede solche FOL-Theorie hat auch überabzählbare Modelle (Löwenheim-Skolem-Paradoxon)."
    ),

    // Question 43 — correctAnswer = 0 (A)
    Question(
        categoryId = 12,
        questionText = "Was ist die 'Unentscheidbarkeit des Wortproblems für Gruppen' (Novikov, Boone) und warum ist sie bemerkenswert?",
        answerA = "Das Wortproblem (sind zwei Gruppenausdrücke in einer endlich präsentierten Gruppe gleich?) ist im Allgemeinen unentscheidbar — Unentscheidbarkeit taucht auch in reiner Algebra auf, nicht nur in Logik/Informatik",
        answerB = "Es gibt keine Algorithmen für Gruppentheorie; das Wortproblem für Gruppen ist NP-vollständig",
        answerC = "Das Wortproblem ist nur für unendliche Gruppen unentscheidbar, für endliche immer entscheidbar und leicht",
        answerD = "Novikov und Boone bewiesen, dass Gruppentheorie vollständig formalisierbar ist",
        correctAnswer = 0,
        explanation = "Novikov (1955) und Boone (1958) unabhängig: Es gibt eine endlich präsentierte Gruppe G (mit endlich vielen Erzeugern und endlich vielen Relationen), für die das Wortproblem (sind w₁ = w₂ in G?) unentscheidbar ist. Der Beweis kodiert Turingmaschinen als Gruppen. Dies war ein Schock: Unentscheidbarkeit ist kein exotisches Phänomen der Logik, sondern taucht in 'normaler' Mathematik auf. Das Wortproblem für spezielle Gruppen (z.B. abelsche Gruppen, freie Gruppen) ist entscheidbar.",
        difficulty = 5,
        funFact = null
    ),

    // Question 44 — correctAnswer = 3 (D)
    Question(
        categoryId = 12,
        questionText = "Was ist 'Matijasevičs Theorem' (DPRM-Theorem) und was löst es von Hilberts zehntem Problem?",
        answerA = "Es gibt einen Algorithmus zur Lösung aller diophantischen Gleichungen — Hilberts zehntes Problem beantwortet mit Ja",
        answerB = "Es gibt unendlich viele unlösbare diophantische Gleichungen, aber ein Algorithmus für alle praktisch relevanten Fälle",
        answerC = "Matijasevičs Theorem gilt nur für lineare diophantische Gleichungen",
        answerD = "Jede rekursiv aufzählbare Menge ist diophantisch darstellbar; damit ist Hilberts zehntes Problem (Gibt es einen Algorithmus für ganzzahlige Lösungen von Polynomgleichungen?) negativ beantwortet: Nein",
        correctAnswer = 3,
        explanation = "Hilberts zehntes Problem (1900): Gibt es einen Algorithmus, der für ein Polynom p(x₁,...,xₙ) mit ganzzahligen Koeffizienten entscheidet, ob p ganzzahlige Wurzeln hat? Davis, Putnam, Robinson (1961) und Matijasevič (1970) bewiesen: Jede r.e. Menge ist diophantisch (DPRM-Theorem). Das Halteproblem ist r.e. und unentscheidbar; also ist das diophantische Problem ebenfalls unentscheidbar. Antwort: Nein, es gibt keinen solchen Algorithmus.",
        difficulty = 5,
        funFact = "Matijasevič war 22 Jahre alt, als er das letzte fehlende Stück — dass Fibonacci-Zahlen diophantisch darstellbar sind — bewies und damit ein 70 Jahre altes Hilbert-Problem löste."
    ),

    // Question 45 — correctAnswer = 2 (C)
    Question(
        categoryId = 12,
        questionText = "Was beschreibt das 'MU-Rätsel' aus Hofstadters GEB und welche logische Lektion vermittelt es?",
        answerA = "Ein Kryptographierätsel, das zeigt, dass alle Codes knackbar sind",
        answerB = "Ein Algorithmus für maschinelles Lernen, der im GEB als Metapher verwendet wird",
        answerC = "Ein formales System mit den Buchstaben M, I, U und vier Regeln, das zeigt, dass MU nicht aus MI ableitbar ist — Lektion: Innerhalb des Systems kann man Unmöglichkeit oft nicht erkennen; man braucht die Außenperspektive (Meta-Ebene)",
        answerD = "Ein philosophisches Paradoxon aus dem Zen-Buddhismus über die Natur des Denkens",
        correctAnswer = 2,
        explanation = "Das MU-Puzzle: Starte mit MI. Regeln: (1) Xı→Xıu, (2) MX→MXX, (3) XIIIy→Xuy, (4) Xuu Y→XY. Ziel: Leite MU ab. Die Antwort: Nein, unmöglich — weil die Anzahl der I's stets ≡ 1 oder 2 (mod 3) bleibt, nie 0. Diese Invariante ist im System selbst nicht ausdrückbar. Hofstadter nutzt das Puzzle, um zu zeigen, dass manche Fragen nur auf der Meta-Ebene beantwortbar sind — ein Analogon zu Gödels Satz: Manche Wahrheiten über ein System können nur außerhalb des Systems gesehen werden.",
        difficulty = 5,
        funFact = "Das MU-Puzzle stammt aus dem Zen-Koan 'Mu' (無, japanisch: 'Nein' oder 'Nichts'). Hofstadter wählte es bewusst: Das Rätsel spiegelt den Zen-Geist — die Frage selbst ist falsch gestellt, wenn man nur innerhalb des Systems denkt."
    ),

    // Question 46 — correctAnswer = 1 (B)
    Question(
        categoryId = 12,
        questionText = "Was ist 'Gödels Beschleunigungstheorem' (Speed-up Theorem) und was besagt es über die Effizienz von Beweisen?",
        answerA = "Jeder Beweis kann in ZFC um den Faktor 2 beschleunigt werden",
        answerB = "Für jede berechenbare Funktion f gibt es Aussagen, deren kürzester Beweis in einem stärkeren System um den Faktor f(n) kürzer ist als im schwächeren System — stärkere Axiome ermöglichen exponentiell oder noch mehr Verkürzungen",
        answerC = "Beweise können durch Parallelisierung beschleunigt werden, aber nur um einen konstanten Faktor",
        answerD = "Das Beschleunigungstheorem besagt, dass PA alle Theoreme in linearer Zeit beweist",
        correctAnswer = 1,
        explanation = "Gödels Speed-up-Theorem (1936): Für jede berechenbare Funktion f und jede hinreichend mächtige konsistente Erweiterung T₂ von T₁ gibt es unendlich viele Sätze φ, die in T₂ beweisbar sind, aber deren kürzeste Beweise in T₁ um mindestens f(|φ|) länger sind als in T₂. Intuitiv: Stärkere Axiome erlauben nicht nur neue Sätze zu beweisen, sondern ermöglichen auch radikale Verkürzungen bestehender Beweise. Das zeigt, dass Beweislänge stark von den gewählten Axiomen abhängt.",
        difficulty = 5,
        funFact = null
    ),

    // Question 47 — correctAnswer = 0 (A)
    Question(
        categoryId = 12,
        questionText = "Was ist 'Wittgensteins Kritik' an Gödels Unvollständigkeitssatz und warum gilt sie heute als verfehlt?",
        answerA = "Wittgenstein (1938) argumentierte, Gödels Satz sei unsinnig, da eine 'in diesem System nicht beweisbare Aussage' nicht als 'wahr' bezeichnet werden könne — er verkannte, dass 'wahr' hier semantisch (Modell-theoretisch) und nicht syntaktisch (beweisbar) gemeint ist",
        answerB = "Wittgenstein kritisierte, dass Gödels Satz zu schwer zu verstehen sei — heute gilt er als verständlich",
        answerC = "Wittgenstein bewies einen Fehler in Gödels Beweis — dieser wurde später von Church korrigiert",
        answerD = "Wittgensteins Kritik war vollständig korrekt und führte zur Überarbeitung des Satzes durch Gödel selbst",
        correctAnswer = 0,
        explanation = "Wittgenstein schrieb in seinen Bemerkungen (1938, postum 1956): Wenn Gödels Satz G unbeweisbar ist, warum sollte man es dann 'wahr' nennen? Er verwechselte syntaktische Beweisbarkeit mit semantischer Wahrheit. Im Standardmodell ℕ ist G wahr (weil es korrekt beschreibt, dass es keinen Beweis gibt). Außerhalb des Systems (meta-mathematisch) ist das sichtbar. Wittgenstein fehlte das Werkzeug der Modelltheorie. Seine Kritik wurde von Philosophen wie Putnam und Wang ausführlich widerlegt.",
        difficulty = 5,
        funFact = "Gödel selbst zeigte wenig Interesse an der philosophischen Debatte über seinen Satz. Er war überzeugt, dass mathematische Objekte real existieren (mathematischer Platonismus) — eine Position, die ihn von Wittgenstein fundamental trennte."
    ),

    // Question 48 — correctAnswer = 3 (D)
    Question(
        categoryId = 12,
        questionText = "Was ist 'Rekursionstheorem' (Kleene) und welche elegante Anwendung hat es auf das Halteproblem?",
        answerA = "Das Rekursionstheorem erlaubt es Programmen, auf ihre eigene Laufzeit zuzugreifen",
        answerB = "Das Rekursionstheorem besagt, dass alle rekursiven Funktionen in polynomieller Zeit berechenbar sind",
        answerC = "Kleenes Theorem beweist, dass Lambda-Kalkül und Turingmaschinen äquivalent sind",
        answerD = "Kleenes Rekursionstheorem: Jede berechenbare Transformation f von Programmen hat einen Fixpunkt — ein Programm e, das dasselbe berechnet wie f(e); daraus folgt, dass kein Algorithmus alle sich selbst ausführenden Programme erkennen kann",
        correctAnswer = 3,
        explanation = "Kleenes zweites Rekursionstheorem (1938): Für jede berechenbare Funktion f gibt es eine Zahl e (Programmnummer), sodass φ_e = φ_{f(e)} (φ_e ist die von Programm e berechnete Funktion). Intuitiv: Es gibt immer ein Selbstreferenz-Programm. Anwendung auf Halteproblem: Angenommen, f(e) gibt ein Programm, das das Gegenteil von e tut. Dann hat f einen Fixpunkt e₀ mit φ_{e₀} = φ_{f(e₀)} — also tut e₀ sein eigenes Gegenteil, Widerspruch. Eleganterer Beweis des Halteproblems als Turings Original.",
        difficulty = 5,
        funFact = null
    ),

    // Question 49 — correctAnswer = 2 (C)
    Question(
        categoryId = 12,
        questionText = "Was ist der 'Lindenbaum-Tarski-Algebra'-Begriff und wie verbindet er formale Logik mit Boolescher Algebra?",
        answerA = "Eine spezielle Datenbank für logische Formeln ohne algebraische Struktur",
        answerB = "Eine Methode zur Kompilierung von Prolog-Programmen in Boolesche Schaltkreise",
        answerC = "Die Lindenbaum-Tarski-Algebra einer Theorie T ist die Quotientenalgebra der Formeln modulo logischer Äquivalenz in T; sie formalisiert die algebraische Struktur des Beweisbarkeitsbegriffs",
        answerD = "Eine Erweiterung der Booleschen Algebra um unendliche Operationen — nur für überabzählbare Theorien",
        correctAnswer = 2,
        explanation = "Lindenbaum-Tarski-Algebra: Definiere auf der Menge aller Formeln die Äquivalenzrelation φ ≈ ψ gdw. T ⊢ (φ ↔ ψ). Die Quotientenmenge mit den Operationen ∧, ∨, ¬ (Konjunktion, Disjunktion, Negation) bildet eine Boolesche Algebra. Vollständige Theorien entsprechen ultrafiltern in dieser Algebra. Dies verknüpft Logik, Algebra und Topologie (Stonsche Dualität: Boolesche Algebren ↔ kompakte total unzusammenhängende Hausdorff-Räume).",
        difficulty = 5,
        funFact = "Marschall Harvey Stone bewies 1936 seinen Darstellungssatz: Jede Boolesche Algebra ist isomorph zur Algebra der offenen-abgeschlossenen Teilmengen eines kompakten Raums (Stone-Raum). Dies verbindet Logik, Algebra und Topologie in einem tiefen Satz."
    ),

    // Question 50 — correctAnswer = 1 (B)
    Question(
        categoryId = 12,
        questionText = "Was ist 'Provability Logic' (GL — Gödel-Löb-Logik) und wie formalisiert sie Gödels Unvollständigkeitssatz modal-logisch?",
        answerA = "Eine Erweiterung der klassischen Logik um Zeitoperatoren; sie formalisiert temporale Beweise",
        answerB = "Ein modales System, in dem □φ bedeutet 'φ ist in PA beweisbar'; GL enthält als Axiom □(□φ→φ)→□φ (Löbs Axiom), aus dem Gödels Unvollständigkeitssatz direkt folgt",
        answerC = "Eine probabilistische Logik, in der Beweiswahrscheinlichkeiten berechnet werden",
        answerD = "Eine Logik für verteilte Systeme, in der 'beweisbar' als 'von allen Knoten bestätigt' interpretiert wird",
        correctAnswer = 1,
        explanation = "Provability Logic (GL): Der modale Operator □ interpretiert als 'beweisbar in PA'. Axiome: alle klassischen Tautologien, K: □(φ→ψ)→(□φ→□ψ), GL (Löb): □(□φ→φ)→□φ, 4: □φ→□□φ. Aus GL folgt: ¬□⊥ → ¬□(¬□⊥) (wenn PA konsistent, dann beweist PA nicht seine eigene Konsistenz) — das ist exakt Gödels zweiter Unvollständigkeitssatz. Die Vollständigkeit von GL bezüglich PA-Beweisbarkeit wurde von Solovay 1976 bewiesen.",
        difficulty = 5,
        funFact = "Provability Logic ist eines der elegantesten Beispiele dafür, wie abstrakte mathematische Logik (Modallogik) und konkrete Mathematik (Beweisbarkeit in PA) zusammenfallen — ein seltsamer Kreis, in dem Logik über sich selbst spricht."
    )

)
