package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsExpert4(): List<Question> = listOf(

    // Graph Theory — 50 expert questions (internet-researched, German, categoryId=12, difficulty=4)

    // ── Euler-Wege & Königsberger Brückenproblem ──────────────────────────────

    Question(
        categoryId = 12,
        questionText = "Leonhard Euler löste 1736 das Königsberger Brückenproblem. Was bewies er damit über den zugehörigen Graphen?",
        answerA = "Der Graph ist zusammenhängend",
        answerB = "Der Graph besitzt keinen Euler-Kreis, da alle vier Knoten ungeraden Grad haben",
        answerC = "Der Graph ist planar",
        answerD = "Der Graph besitzt einen Hamilton-Kreis",
        correctAnswer = 1,
        explanation = "Euler modellierte Königsberg als Graphen mit 4 Knoten (Stadtteile) und 7 Kanten (Brücken). Ein Euler-Kreis existiert nur, wenn alle Knoten geraden Grad haben. Da alle vier Knoten ungerade Knotengrade besitzen (3, 3, 3, 5), ist kein Euler-Kreis möglich — Euler bewies damit die Nichtexistenz eines solchen Rundwegs.",
        difficulty = 4,
        funFact = "Euler begründete mit dieser Arbeit von 1736 die Graphentheorie — und damit ein ganzes Teilgebiet der Mathematik, das heute in GPS-Systemen, sozialen Netzwerken und Bioinformatik unverzichtbar ist."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein ungerichteter zusammenhängender Graph besitzt genau dann einen Euler-Weg (der jede Kante genau einmal durchläuft, aber nicht zum Start zurückkehrt), wenn:",
        answerA = "Alle Knoten geraden Grad haben",
        answerB = "Genau zwei Knoten ungeraden Grad haben",
        answerC = "Mindestens ein Knoten ungeraden Grad hat",
        answerD = "Der Graph bipartit ist",
        correctAnswer = 1,
        explanation = "Eulers Satz: Ein zusammenhängender Graph hat einen Euler-Weg (nicht geschlossen) genau dann, wenn er exakt zwei Knoten ungeraden Grades hat — diese sind dann zwingend Anfangs- und Endpunkt. Einen Euler-Kreis (geschlossen) gibt es nur bei ausnahmslos geraden Graden.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Das Kinderspiel 'Haus vom Nikolaus' verlangt, eine Figur ohne Absetzen zu zeichnen. Welche Aussage ist korrekt?",
        answerA = "Es ist unmöglich, da der Graph mehr als 2 Knoten ungeraden Grades hat",
        answerB = "Es ist möglich, da alle Knoten geraden Grad haben",
        answerC = "Es ist möglich, da genau zwei Knoten ungeraden Grad haben — der Start liegt an einem davon",
        answerD = "Es ist unmöglich, da der Graph nicht zusammenhängend ist",
        correctAnswer = 2,
        explanation = "Das 'Haus vom Nikolaus' hat genau zwei Knoten ungeraden Grades (die beiden unteren Ecken des Hauses, Grad 3). Ein Euler-Weg existiert daher, muss aber an einem dieser beiden Knoten beginnen und am anderen enden. Die Lösung ist möglich — aber nur mit dem richtigen Startpunkt.",
        difficulty = 4,
        funFact = "Die populäre Kinderaufgabe ist ein direktes Anwendungsbeispiel für Eulers 290 Jahre alten Satz über Euler-Wege."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Graph hat 6 Knoten mit Graden 2, 3, 3, 4, 4, 4. Welche Aussage über Euler-Wege ist korrekt?",
        answerA = "Der Graph hat einen Euler-Kreis",
        answerB = "Der Graph hat einen Euler-Weg, aber keinen Euler-Kreis",
        answerC = "Der Graph hat weder Euler-Weg noch Euler-Kreis",
        answerD = "Nicht bestimmbar ohne Kenntnis der Kanten",
        correctAnswer = 1,
        explanation = "Für einen Euler-Kreis müssen alle Knoten geraden Grad haben — hier haben Knoten mit Grad 3 ungeraden Grad (zwei davon). Für einen Euler-Weg braucht man genau zwei Knoten ungeraden Grades. Da hier exakt zwei Knoten mit Grad 3 existieren, hat der Graph (sofern zusammenhängend) einen Euler-Weg, aber keinen Euler-Kreis.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Kanten hat ein Graph, bei dem jeder der n Knoten Grad k hat (k-regulärer Graph)?",
        answerA = "n × k",
        answerB = "n × k / 2",
        answerC = "n + k",
        answerD = "k^n",
        correctAnswer = 1,
        explanation = "Der Handshaking-Lemma: Die Summe aller Knotengrade ist stets doppelt so groß wie die Anzahl der Kanten, da jede Kante zu zwei Knoten inzident ist. Also: Σdeg = n×k = 2|E|, woraus |E| = n×k/2 folgt. Daher muss n×k stets gerade sein.",
        difficulty = 4,
        funFact = "Das Handshaking-Lemma impliziert auch: In jedem Graphen ist die Anzahl der Knoten mit ungeradem Grad stets gerade — eine fundamentale Invariante der Graphentheorie."
    ),

    Question(
        categoryId = 12,
        questionText = "Fleury's Algorithmus dient zur Konstruktion von Euler-Wegen. Was ist seine zentrale Regel?",
        answerA = "Immer die kürzeste Kante als Nächstes wählen",
        answerB = "Niemals eine Brücke wählen, solange es Alternativen gibt",
        answerC = "Immer den Knoten mit höchstem Grad als Nächstes besuchen",
        answerD = "Den Graphen in Tiefensuche traversieren",
        correctAnswer = 1,
        explanation = "Fleury's Algorithmus: Man traversiert den Graphen und löscht jede besuchte Kante. Die Kernregel lautet: Wähle niemals eine Brücke (Kante deren Entfernung den Graphen trennt), solange Nicht-Brücken verfügbar sind. So wird sichergestellt, dass der Graph zusammenhängend bleibt und man nicht in einer Sackgasse landet.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein gerichteter Graph besitzt einen Euler-Kreis genau dann, wenn:",
        answerA = "Der Graph stark zusammenhängend ist und jeder Knoten gleichen Eingangs- und Ausgangsgrad hat",
        answerB = "Der Graph schwach zusammenhängend ist",
        answerC = "Jeder Knoten geraden Grad hat",
        answerD = "Der Graph azyklisch ist",
        correctAnswer = 0,
        explanation = "Bei gerichteten Graphen (Digraphen) gelten verschärfte Bedingungen: Ein Euler-Kreis existiert genau dann, wenn (1) der Graph stark zusammenhängend ist (von jedem Knoten zu jedem anderen führt ein gerichteter Pfad) und (2) für jeden Knoten gilt: Eingangsgrad = Ausgangsgrad.",
        difficulty = 4,
        funFact = null
    ),

    // ── Hamilton-Kreise & NP-Vollständigkeit ─────────────────────────────────

    Question(
        categoryId = 12,
        questionText = "Worin besteht der fundamentale Unterschied zwischen dem Euler-Kreis-Problem und dem Hamilton-Kreis-Problem?",
        answerA = "Euler-Kreise gibt es nur in planaren Graphen",
        answerB = "Das Euler-Problem ist effizient lösbar (P), das Hamilton-Problem ist NP-vollständig",
        answerC = "Hamilton-Kreise besuchen jede Kante genau einmal",
        answerD = "Es gibt keinen Unterschied — beide sind gleichwertig",
        correctAnswer = 1,
        explanation = "Euler-Kreise (jede Kante genau einmal) lassen sich mit Fleury's Algorithmus in O(E) lösen — ein polynomielles Problem. Hamilton-Kreise (jeden Knoten genau einmal) sind NP-vollständig: Es gibt keinen bekannten polynomiellen Algorithmus, und man glaubt, dass keiner existiert.",
        difficulty = 4,
        funFact = "Diese Unterscheidung ist ein Paradebeispiel dafür, wie ähnlich klingende Probleme enorm verschiedene Komplexitäten haben können — einer der faszinierenden Aspekte der theoretischen Informatik."
    ),

    Question(
        categoryId = 12,
        questionText = "Die Springertour auf dem Schachbrett ist ein berühmtes Hamilton-Kreis-Problem. Auf einem 8×8-Brett gibt es wie viele Felder?",
        answerA = "32",
        answerB = "64",
        answerC = "128",
        answerD = "256",
        correctAnswer = 1,
        explanation = "Ein Schachbrett hat 8×8 = 64 Felder. Bei der Springertour soll der Springer jeden der 64 Felder genau einmal besuchen. Existiert ein solcher Weg, der zum Startfeld zurückführt, ist es ein geschlossener Hamilton-Kreis im Springer-Graphen.",
        difficulty = 4,
        funFact = "Es gibt genau 26.534.728.821.064 verschiedene geschlossene Springertouren auf dem 8×8-Brett — eine astronomische Zahl, die erst 2009 mit Computerhilfe vollständig bestimmt wurde."
    ),

    Question(
        categoryId = 12,
        questionText = "Der Satz von Ore (1960) gibt eine hinreichende Bedingung für die Existenz eines Hamilton-Kreises. Welche ist das?",
        answerA = "Jeder Knoten hat Grad ≥ n/2",
        answerB = "Für je zwei nicht-benachbarte Knoten u, v gilt: deg(u) + deg(v) ≥ n",
        answerC = "Der Graph ist 2-zusammenhängend",
        answerD = "Jeder Knoten hat Grad ≥ 3",
        correctAnswer = 1,
        explanation = "Ores Theorem: Wenn für jeden Paar nicht-benachbarter Knoten u und v gilt deg(u) + deg(v) ≥ n (mit n = Knotenanzahl), dann hat der Graph einen Hamilton-Kreis. Dies ist eine hinreichende, aber nicht notwendige Bedingung.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Das Travelling Salesman Problem (TSP) sucht den kürzesten Hamilton-Kreis in einem gewichteten vollständigen Graphen. Was gilt für seine Komplexität?",
        answerA = "Es ist in polynomieller Zeit exakt lösbar",
        answerB = "Es ist NP-schwer — kein bekannter polynomieller exakter Algorithmus existiert",
        answerC = "Es ist nur in ungerichteten Graphen schwer",
        answerD = "Es ist in O(n log n) lösbar",
        correctAnswer = 1,
        explanation = "Das TSP ist NP-schwer. Für n Städte gibt es (n-1)!/2 mögliche Routen. Bei n=20 sind das bereits ~60 Milliarden Touren. Für die Praxis nutzt man Heuristiken (z.B. 2-Opt, Lin-Kernighan) oder Approximationsalgorithmen — ein exakter polynomieller Algorithmus ist unbekannt.",
        difficulty = 4,
        funFact = "Das TSP hat praktische Bedeutung weit über Logistik hinaus: Es wird in der Chipfertigung (Lötpfad), DNA-Sequenzierung und Teleskop-Steuerung eingesetzt."
    ),

    // ── Graphenfärbung & Vier-Farben-Satz ────────────────────────────────────

    Question(
        categoryId = 12,
        questionText = "Der Vier-Farben-Satz besagt, dass jede planare Karte mit wie vielen Farben so gefärbt werden kann, dass benachbarte Länder verschiedene Farben haben?",
        answerA = "3",
        answerB = "4",
        answerC = "5",
        answerD = "6",
        correctAnswer = 1,
        explanation = "Der Vier-Farben-Satz (bewiesen 1977 von Appel und Haken): Jede planare Karte kann mit höchstens 4 Farben so eingefärbt werden, dass keine zwei benachbarten Regionen dieselbe Farbe tragen. Der Beweis war der erste bedeutende computergstützte mathematische Beweis der Geschichte.",
        difficulty = 4,
        funFact = "Der Beweis von Appel und Haken prüfte über 1.936 reduzierbare Konfigurationen mit einem Computer — und löste damit eine über 120 Jahre offene mathematische Frage."
    ),

    Question(
        categoryId = 12,
        questionText = "Die chromatische Zahl χ(G) eines Graphen ist die minimale Anzahl Farben für eine gültige Knotenfärbung. Was gilt für den vollständigen Graphen K_n?",
        answerA = "χ(K_n) = 2",
        answerB = "χ(K_n) = n",
        answerC = "χ(K_n) = n-1",
        answerD = "χ(K_n) = ⌈n/2⌉",
        correctAnswer = 1,
        explanation = "Im vollständigen Graphen K_n ist jeder Knoten mit jedem anderen verbunden. Da alle Knotenpaare benachbart sind, müssen alle n Knoten verschiedene Farben erhalten. Daher χ(K_n) = n. Der vollständige Graph ist damit der 'schwerste' Fall für die Graphenfärbung.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Graph ist 2-färbbar (bipartit) genau dann, wenn er:",
        answerA = "Keinen Kreis enthält",
        answerB = "Keinen Kreis ungerader Länge enthält",
        answerC = "Planar ist",
        answerD = "Zusammenhängend ist",
        correctAnswer = 1,
        explanation = "König-Satz: Ein Graph ist genau dann bipartit (2-färbbar), wenn er keinen Kreis ungerader Länge enthält. Intuition: Bei einem ungeraden Kreis entsteht ein Widerspruch — man kann nicht abwechselnd mit 2 Farben färben, ohne an einer Stelle dieselbe Farbe zu wiederholen.",
        difficulty = 4,
        funFact = "Bipartite Graphen spielen in der Praxis eine große Rolle: Matching-Algorithmen (z.B. für Jobbörsen, Heiratsprobleme) arbeiten auf bipartiten Graphen."
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist die chromatische Zahl des Petersen-Graphen?",
        answerA = "2",
        answerB = "3",
        answerC = "4",
        answerD = "5",
        correctAnswer = 1,
        explanation = "Der Petersen-Graph hat chromatische Zahl χ = 3. Er ist 3-regulär (jeder Knoten hat Grad 3) und enthält keine geraden Kreise kürzerer Länge — aber er hat ungerade Kreise, weshalb er nicht bipartit ist. Der Petersen-Graph ist ein klassisches Gegenbeispiel in der Graphentheorie.",
        difficulty = 4,
        funFact = "Der Petersen-Graph ist nach dem dänischen Mathematiker Julius Petersen (1891) benannt und gilt als 'kleinster interessanter Graph' — er dient als Gegenbeispiel für zahlreiche graphentheoretische Vermutungen."
    ),

    Question(
        categoryId = 12,
        questionText = "Das Graphenfärbungsproblem (Entscheidung ob χ(G) ≤ k) ist für k ≥ 3 NP-vollständig. Was gilt für k = 2?",
        answerA = "Ebenfalls NP-vollständig",
        answerB = "In polynomieller Zeit lösbar durch Breitensuche (Bipartitheitsprüfung)",
        answerC = "Unlösbar im Allgemeinen",
        answerD = "In O(n²) lösbar, aber nicht effizienter",
        correctAnswer = 1,
        explanation = "2-Färbbarkeit ≡ Bipartitheitsprüfung, lösbar in O(V+E) per BFS/DFS. Für k=3 ist das Problem bereits NP-vollständig. Diese Grenze zwischen P und NP-vollständig bei k=2 vs. k=3 ist eine der schärfsten bekannten Komplexitätsgrenzen.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wer hat den Vier-Farben-Satz 1977 als erstes bewiesen, und was war das Besondere an diesem Beweis?",
        answerA = "Euler und Gauss — durch elementare Geometrie",
        answerB = "Appel und Haken — erster wesentlich computergestützter Beweis der Mathematikgeschichte",
        answerC = "Kempe und Heawood — durch vollständige Enumeration",
        answerD = "Guthrie und Hamilton — durch Reduktion auf planare Graphen",
        correctAnswer = 1,
        explanation = "Kenneth Appel und Wolfgang Haken bewiesen 1977 den Vier-Farben-Satz, indem sie alle Fälle auf 1.936 'reduzierbare Konfigurationen' reduzierten und diese computergestützt prüften. Es war der erste wichtige Beweis der Mathematikgeschichte, der ohne Computer nicht hätte geführt werden können.",
        difficulty = 4,
        funFact = "Der erste 'Beweis' stammt von Alfred Kempe (1879) — dieser wurde 1890 von Percy Heawood als fehlerhaft entlarvt. Danach vergingen weitere 87 Jahre bis zum korrekten Beweis."
    ),

    Question(
        categoryId = 12,
        questionText = "Die chromatische Zahl χ(G) kann durch den Cliquen-Zahl ω(G) abgeschätzt werden. Welche Beziehung gilt immer?",
        answerA = "χ(G) = ω(G)",
        answerB = "χ(G) ≥ ω(G)",
        answerC = "χ(G) ≤ ω(G)",
        answerD = "χ(G) × ω(G) = n",
        correctAnswer = 1,
        explanation = "Da in einer Clique alle Knoten paarweise benachbart sind, braucht jeder Knoten der Clique eine eigene Farbe. Also gilt stets χ(G) ≥ ω(G). Die Gleichheit χ(G) = ω(G) gilt für perfekte Graphen (starker Satz von Chudnovsky et al., 2006), aber nicht im Allgemeinen.",
        difficulty = 4,
        funFact = null
    ),

    // ── Planare Graphen & Eulersche Formel ───────────────────────────────────

    Question(
        categoryId = 12,
        questionText = "Die Eulersche Polyederformel lautet V - E + F = 2, wobei V = Knoten, E = Kanten, F = Flächen. Wie viele Flächen hat ein zusammenhängender planarer Graph mit 10 Knoten und 15 Kanten?",
        answerA = "5",
        answerB = "7",
        answerC = "9",
        answerD = "10",
        correctAnswer = 1,
        explanation = "Aus V - E + F = 2 folgt F = 2 - V + E = 2 - 10 + 15 = 7. Dabei wird die äußere (unbegrenzte) Fläche mitgezählt. Die Eulersche Formel gilt für jeden zusammenhängenden planaren Graphen und ist eine topologische Invariante.",
        difficulty = 4,
        funFact = "Die Formel V - E + F = 2 gilt nicht nur für planare Graphen, sondern für alle konvexen Polyeder. Ein Würfel: 8 - 12 + 6 = 2. Ein Tetraeder: 4 - 6 + 4 = 2."
    ),

    Question(
        categoryId = 12,
        questionText = "Kuratowskis Theorem charakterisiert planare Graphen. Welche zwei Graphen sind die 'verbotenen Minoren' für Planarität?",
        answerA = "K_4 und K_{2,3}",
        answerB = "K_5 und K_{3,3}",
        answerC = "K_6 und K_{4,4}",
        answerD = "Petersen-Graph und K_5",
        correctAnswer = 1,
        explanation = "Kuratowskis Theorem (1930): Ein Graph ist genau dann planar, wenn er keinen Teilgraphen enthält, der eine Unterteilung von K_5 (vollständiger Graph mit 5 Knoten) oder K_{3,3} (vollständiger bipartiter Graph) ist. Diese beiden sind die minimalen nicht-planaren Graphen.",
        difficulty = 4,
        funFact = "K_{3,3} ist das berühmte 'Drei-Häuser-drei-Brunnen-Problem': Können drei Häuser mit drei Brunnen so verbunden werden, dass sich keine Leitungen kreuzen? Die Antwort ist Nein — K_{3,3} ist nicht planar."
    ),

    Question(
        categoryId = 12,
        questionText = "Für einen planaren einfachen Graphen mit V ≥ 3 gilt die Ungleichung E ≤ 3V - 6. Was folgt daraus für K_5?",
        answerA = "K_5 ist planar, da E = 10 ≤ 3×5 - 6 = 9",
        answerB = "K_5 ist nicht planar, da E = 10 > 3×5 - 6 = 9",
        answerC = "Die Ungleichung kann auf K_5 nicht angewendet werden",
        answerD = "K_5 könnte planar oder nicht-planar sein",
        correctAnswer = 1,
        explanation = "K_5 hat V=5 Knoten und E=10 Kanten. Die Grenze wäre 3×5-6=9. Da 10 > 9, verletzt K_5 die notwendige Bedingung für Planarität — also ist K_5 nicht planar. (Hinweis: Die Bedingung ist notwendig aber nicht hinreichend; die Verletzung ist jedoch ein Beweis für Nicht-Planarität.)",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein planarer Graph kann stets mit wie vielen Farben knotengefärbt werden (Vier-Farben-Satz)?",
        answerA = "3",
        answerB = "4",
        answerC = "5",
        answerD = "6",
        correctAnswer = 1,
        explanation = "Der Vier-Farben-Satz besagt: Jeder planare Graph hat chromatische Zahl χ ≤ 4. Der einfachere Fünf-Farben-Satz (χ ≤ 5 für planare Graphen) wurde bereits 1890 von Heawood bewiesen. Das Optimale — 4 Farben reichen immer — brauchte noch weitere 87 Jahre.",
        difficulty = 4,
        funFact = null
    ),

    // ── Bäume & Spannbäume ────────────────────────────────────────────────────

    Question(
        categoryId = 12,
        questionText = "Ein Baum mit n Knoten hat immer genau wie viele Kanten?",
        answerA = "n",
        answerB = "n - 1",
        answerC = "n + 1",
        answerD = "2(n - 1)",
        correctAnswer = 1,
        explanation = "Ein Baum ist ein zusammenhängender, kreisfreier Graph. Für einen Baum gilt immer: |E| = |V| - 1, also n-1 Kanten bei n Knoten. Dies ist eine charakterisierende Eigenschaft: Ein zusammenhängender Graph mit genau n-1 Kanten ist stets ein Baum.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Der Algorithmus von Kruskal findet den minimalen Spannbaum (MST). Wie funktioniert er?",
        answerA = "Starte bei einem Knoten, füge stets die kürzeste adjazente Kante hinzu",
        answerB = "Sortiere Kanten aufsteigend nach Gewicht, füge jede hinzu, die keinen Kreis erzeugt",
        answerC = "Berechne kürzeste Wege von allen Knoten aus",
        answerD = "Entferne die schwersten Kanten, bis ein Spannbaum übrig bleibt",
        correctAnswer = 1,
        explanation = "Kruskals Algorithmus: (1) Sortiere alle Kanten nach Gewicht aufsteigend. (2) Füge Kanten von günstig nach teuer hinzu, solange dabei kein Kreis entsteht (prüfbar mit Union-Find). Laufzeit: O(E log E). Er ist ein Greedy-Algorithmus und liefert immer den optimalen MST.",
        difficulty = 4,
        funFact = "Der Algorithmus von Prim ist eine Alternative: Er wächst den Baum von einem Startknoten aus. Beide liefern denselben optimalen MST — mit unterschiedlichen Effizienzprofilen je nach Graphstruktur."
    ),

    Question(
        categoryId = 12,
        questionText = "Die Cayley-Formel besagt: Wie viele verschiedene beschriftete Bäume gibt es auf n Knoten?",
        answerA = "2^(n-1)",
        answerB = "n!",
        answerC = "n^(n-2)",
        answerD = "(n-1)!",
        correctAnswer = 2,
        explanation = "Cayleys Formel (1889): Die Anzahl verschiedener beschrifteter Bäume auf n Knoten beträgt n^(n-2). Für n=3: 3^1=3 Bäume. Für n=4: 4^2=16 Bäume. Der elegante Beweis mittels Prüfer-Sequenzen kodiert jeden Baum als Sequenz der Länge n-2 mit Werten in {1,...,n}.",
        difficulty = 4,
        funFact = "Für n=10 gibt es 10^8 = 100 Millionen verschiedene beschriftete Bäume — eine erstaunlich große Zahl für scheinbar 'einfache' Strukturen."
    ),

    Question(
        categoryId = 12,
        questionText = "Dijkstras Algorithmus findet den kürzesten Pfad in einem Graphen. Für welche Kantenbewertungen gilt er?",
        answerA = "Für beliebige Kantengewichte (auch negative)",
        answerB = "Nur für nicht-negative Kantengewichte",
        answerC = "Nur für ganzzahlige Kantengewichte",
        answerD = "Nur für ungewichtete Graphen",
        correctAnswer = 1,
        explanation = "Dijkstras Algorithmus erfordert nicht-negative Kantengewichte. Der Algorithmus funktioniert durch greedy Auswahl des nächsten Knotens mit kleinstem Abstand — bei negativen Kanten kann ein bereits 'abgeschlossener' Knoten nachträglich einen kürzeren Pfad erhalten, was den Algorithmus falsch macht.",
        difficulty = 4,
        funFact = "Für negative Kantengewichte verwendet man den Bellman-Ford-Algorithmus (O(VE)) oder — falls negative Kreise ausgeschlossen sind — den Algorithmus von Floyd-Warshall für alle Paare."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein minimaler Spannbaum (MST) eines Graphen mit n Knoten hat genau:",
        answerA = "n Kanten",
        answerB = "n - 1 Kanten",
        answerC = "2n - 2 Kanten",
        answerD = "n(n-1)/2 Kanten",
        correctAnswer = 1,
        explanation = "Da ein MST per Definition ein Spannbaum (zusammenhängend, kreisfrei, alle Knoten enthalten) ist und jeder Baum auf n Knoten genau n-1 Kanten hat, gilt auch für den MST: |E| = n-1.",
        difficulty = 4,
        funFact = null
    ),

    // ── Flussprobleme & Matchings ─────────────────────────────────────────────

    Question(
        categoryId = 12,
        questionText = "Der Satz von Ford-Fulkerson (Max-Flow-Min-Cut-Theorem) besagt:",
        answerA = "Der maximale Fluss in einem Netzwerk entspricht der Gesamtkapazität aller Kanten",
        answerB = "Der maximale Fluss von Quelle zu Senke entspricht dem minimalen Schnitt des Netzwerks",
        answerC = "Jedes Flussnetzwerk hat genau einen maximalen Fluss",
        answerD = "Der minimale Fluss ist immer halb so groß wie der maximale Fluss",
        correctAnswer = 1,
        explanation = "Max-Flow = Min-Cut (Ford, Fulkerson 1956): Der maximale Flusswert von einer Quelle s zu einer Senke t in einem Kapazitätsnetzwerk ist gleich der minimalen Kapazität eines s-t-Schnitts (Trennmenge von Kanten). Dieser fundamentale Satz verknüpft zwei scheinbar verschiedene Optimierungsprobleme.",
        difficulty = 4,
        funFact = "Das Max-Flow-Min-Cut-Theorem hat Anwendungen in Logistik, Telekommunikation, Bildsegmentierung und — historisch — beim Modellieren von Eisenbahnkapazitäten im Kalten Krieg."
    ),

    Question(
        categoryId = 12,
        questionText = "Der Satz von König-Egerváry gilt für bipartite Graphen. Was besagt er?",
        answerA = "In bipartiten Graphen ist die maximale Matching-Größe gleich der Gesamtknotenanzahl",
        answerB = "In bipartiten Graphen entspricht die Größe des maximalen Matchings der Größe der minimalen Überdeckung",
        answerC = "Jeder bipartite Graph hat ein perfektes Matching",
        answerD = "Die chromatische Zahl bipartiter Graphen beträgt immer 2",
        correctAnswer = 1,
        explanation = "König-Egerváry (1931): In jedem bipartiten Graphen ist die Anzahl der Kanten im maximalen Matching gleich der Anzahl der Knoten in einer minimalen Knotenüberdeckung. Dies ist ein zentrales Ergebnis der kombinatorischen Optimierung und fundamental für Zuweisungsprobleme.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Halls Heiratssatz gibt eine notwendige und hinreichende Bedingung für ein perfektes Matching in bipartiten Graphen. Welche ist das?",
        answerA = "Der Graph ist zusammenhängend",
        answerB = "Für jede Teilmenge S der linken Seite gilt: |N(S)| ≥ |S|, wobei N(S) die Nachbarschaft von S ist",
        answerC = "Jeder Knoten hat Grad ≥ 2",
        answerD = "Beide Seiten des bipartiten Graphen haben gleiche Größe",
        correctAnswer = 1,
        explanation = "Halls Theorem: Ein bipartiter Graph G=(A∪B, E) besitzt ein Matching, das alle Knoten aus A überdeckt, genau dann, wenn für jede Teilmenge S ⊆ A gilt |N(S)| ≥ |S|. Anschaulich: Jede Gruppe von Bewerbern muss zusammen genügend geeignete Stellen abdecken.",
        difficulty = 4,
        funFact = "Halls Theorem wird auch 'Heiratssatz' genannt, weil es ursprünglich als: 'n Männer können heiraten, wenn jede Gruppe von k Männern mindestens k verschiedene Frauen kennt' formuliert wurde."
    ),

    Question(
        categoryId = 12,
        questionText = "Der Ungarische Algorithmus (Kuhn-Munkres) löst welches Problem in polynomieller Zeit?",
        answerA = "Maximaler Fluss in Netzwerken",
        answerB = "Optimale Zuordnung (Assignment Problem) mit minimalen Kosten in bipartiten Graphen",
        answerC = "Kürzester Hamilton-Kreis im TSP",
        answerD = "Minimale Knotenfärbung allgemeiner Graphen",
        correctAnswer = 1,
        explanation = "Der Ungarische Algorithmus (Kuhn 1955, Munkres 1957) löst das Zuordnungsproblem: Gegeben n Aufgaben und n Agenten mit Kostenmatrix, finde die kostenminimale bijektive Zuordnung. Laufzeit O(n³). Er ist fundamental in Operationsforschung und KI-Systemen (z.B. Spurverfolgung in Computer Vision).",
        difficulty = 4,
        funFact = null
    ),

    // ── Graphen-Eigenschaften & Strukturen ───────────────────────────────────

    Question(
        categoryId = 12,
        questionText = "Die Breitensuche (BFS) in einem ungewichteten Graphen liefert:",
        answerA = "Den Hamilton-Kreis des Graphen",
        answerB = "Den kürzesten Pfad (nach Kantenanzahl) von einem Startknoten zu allen anderen",
        answerC = "Den minimalen Spannbaum des Graphen",
        answerD = "Eine topologische Sortierung des Graphen",
        correctAnswer = 1,
        explanation = "BFS traversiert den Graphen schichtenweise — erst alle Knoten in Abstand 1, dann 2, usw. Da jede Schicht alle Knoten mit gleichem Abstand zum Start enthält, liefert BFS automatisch die kürzesten Pfade (gemessen in Kantenanzahl) von der Quelle zu allen erreichbaren Knoten.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Die Tiefensuche (DFS) erkennt Rückkanten in einem gerichteten Graphen. Was bedeutet eine Rückkante?",
        answerA = "Eine Kante von einem Blatt zur Wurzel im DFS-Baum",
        answerB = "Eine Kante von einem Knoten zu einem bereits besuchten Vorfahren im DFS-Baum — zeigt einen Zyklus an",
        answerC = "Eine Kante, die den Graphen trennt",
        answerD = "Eine Kante zwischen zwei verschiedenen DFS-Bäumen",
        correctAnswer = 1,
        explanation = "Während der DFS werden Kanten klassifiziert: Baumkanten (zum nächsten unbesuchten Knoten), Rückkanten (zu einem Vorfahren im DFS-Baum), Querkanten und Vorwärtskanten. Eine Rückkante zeigt zwingend einen Zyklus an — und ein gerichteter Graph ist azyklisch (DAG) genau dann, wenn keine Rückkanten existieren.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Graph heißt k-zusammenhängend, wenn er nach Entfernen beliebiger k-1 Knoten noch zusammenhängend bleibt. Was gilt für k=2 (2-Zusammenhang)?",
        answerA = "Der Graph hat keinen Schnittknoten (Artikulationspunkt)",
        answerB = "Der Graph hat keinen Kreis",
        answerC = "Der Graph ist bipartit",
        answerD = "Der Graph ist planar",
        correctAnswer = 0,
        explanation = "Ein Graph ist 2-zusammenhängend genau dann, wenn er zusammenhängend ist und keinen Artikulationspunkt (Schnittknoten) besitzt — also keinen Knoten, dessen Entfernung den Graphen trennt. 2-zusammenhängende Graphen sind strukturell robuster und spielen eine wichtige Rolle in der Netzwerkplanung.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist der Durchmesser eines Graphen?",
        answerA = "Die maximale Knotenanzahl auf einem Kreis",
        answerB = "Der längste kürzeste Pfad zwischen irgendwelchen zwei Knoten",
        answerC = "Die Anzahl der Kanten im minimalen Spannbaum",
        answerD = "Der maximale Knotengrad im Graphen",
        correctAnswer = 1,
        explanation = "Der Durchmesser d(G) = max{d(u,v) | u,v ∈ V}, wobei d(u,v) der kürzeste Pfad zwischen u und v ist. Er misst die maximale 'Entfernung' im Graphen. Der Durchmesser sozialer Netzwerke ist oft überraschend klein — das bekannte 'Sechs-Grad-der-Trennung'-Phänomen.",
        difficulty = 4,
        funFact = "Das Facebook-Sozialgraph-Team stellte 2011 fest, dass der durchschnittliche Abstand zwischen zwei Nutzern nur 4,74 war — nicht 6, wie das populäre Konzept besagt."
    ),

    Question(
        categoryId = 12,
        questionText = "Starke Zusammenhangskomponenten (SCC) in gerichteten Graphen können mit welchem Algorithmus in O(V+E) gefunden werden?",
        answerA = "Dijkstra-Algorithmus",
        answerB = "Tarjans SCC-Algorithmus oder Kosarajus Algorithmus",
        answerC = "Bellman-Ford-Algorithmus",
        answerD = "Prims MST-Algorithmus",
        correctAnswer = 1,
        explanation = "Tarjans Algorithmus (1972) und Kosarajus Algorithmus (1978) finden alle stark zusammenhängenden Komponenten in O(V+E) mittels einer (bzw. zwei) DFS-Durchläufe. Eine SCC ist eine maximale Menge von Knoten, zwischen denen in beide Richtungen Pfade existieren.",
        difficulty = 4,
        funFact = null
    ),

    // ── Ramsey-Theorie & Extremalgraphtheorie ─────────────────────────────────

    Question(
        categoryId = 12,
        questionText = "Die Ramsey-Zahl R(3,3) beantwortet folgende Frage: Wie viele Personen müssen auf einer Party sein, damit garantiert 3 sich gegenseitig kennen oder 3 sich gegenseitig nicht kennen?",
        answerA = "5",
        answerB = "6",
        answerC = "7",
        answerD = "8",
        correctAnswer = 1,
        explanation = "R(3,3) = 6: Unter beliebigen 6 Personen gibt es immer entweder 3 die sich paarweise kennen (Dreieck in Rot) oder 3 die sich paarweise nicht kennen (Dreieck in Blau). Bei 5 Personen ist das nicht garantiert. Der Beweis verwendet eine einfache Fallunterscheidung über den Grad eines Knotens.",
        difficulty = 4,
        funFact = "Die Ramsey-Theorie zeigt: In großen strukturierten Mengen entsteht zwangsläufig Ordnung — vollständiges Chaos ist bei genügender Größe unmöglich."
    ),

    Question(
        categoryId = 12,
        questionText = "Der Satz von Turán bestimmt den dichtesten Graphen ohne K_{r+1}. Wie viele Kanten hat der Turán-Graph T(n,r)?",
        answerA = "n²/2",
        answerB = "(1 - 1/r) × n²/2 (näherungsweise)",
        answerC = "n × r",
        answerD = "n × (n-r)",
        correctAnswer = 1,
        explanation = "Turáns Satz (1941): Der dichteste Graph auf n Knoten ohne Clique K_{r+1} ist der Turán-Graph T(n,r) — der vollständig r-partite Graph mit möglichst gleich großen Partitionsklassen. Er hat näherungsweise (1-1/r)×n²/2 Kanten. Dieser Satz begründete die Extremalgraphtheorie.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was besagt das Handshaking-Lemma (Lemma über Knotengrade)?",
        answerA = "Jeder Graph hat mindestens einen Knoten mit Grad 0",
        answerB = "Die Summe aller Knotengrade ist gleich dem Doppelten der Kantenanzahl",
        answerC = "Jeder zusammenhängende Graph hat einen Euler-Weg",
        answerD = "Die Anzahl der Knoten ist stets größer als die Knotenanzahl",
        correctAnswer = 1,
        explanation = "Handshaking-Lemma: Σ deg(v) = 2|E|. Beweis: Jede Kante {u,v} trägt exakt 2 zur Gradsumme bei (einmal für u, einmal für v). Direkte Folgerung: Die Anzahl der Knoten mit ungeradem Grad ist stets gerade — man kann nicht eine ungerade Anzahl von 'Handshakes' haben.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Graph heißt eulersch, wenn er einen Euler-Kreis enthält. Der Liniengraph L(G) eines Graphen G hat als Knoten die Kanten von G. Wann ist L(G) eulersch?",
        answerA = "Wenn G eulersch ist",
        answerB = "Wenn G zusammenhängend ist und alle Knoten geraden Grad haben oder genau zwei Knoten ungeraden Grad haben",
        answerC = "Wenn G planar ist",
        answerD = "Wenn G bipartit ist",
        correctAnswer = 1,
        explanation = "L(G) ist eulersch genau dann, wenn G zusammenhängend ist und entweder alle Knoten geraden Grad haben (G selbst eulersch) oder genau zwei Knoten ungeraden Grad haben (G hat Euler-Weg). Der Liniengraph transformiert Kanten- in Knotenprobleme.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist die Cliquenzahl ω(G) eines Graphen G?",
        answerA = "Die Anzahl der Dreiecke im Graphen",
        answerB = "Die Größe der größten vollständigen Teilmenge (Clique) im Graphen",
        answerC = "Der maximale Knotengrad im Graphen",
        answerD = "Die Anzahl der Zusammenhangskomponenten",
        correctAnswer = 1,
        explanation = "Eine Clique ist eine Menge von Knoten, die paarweise alle miteinander verbunden sind — ein vollständiger Teilgraph. Die Cliquenzahl ω(G) ist die Größe der größten Clique. Die Bestimmung von ω(G) ist NP-schwer. Es gilt χ(G) ≥ ω(G) für alle Graphen.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Der Bellman-Ford-Algorithmus löst das Single-Source-Shortest-Path-Problem. Was kann er, was Dijkstra nicht kann?",
        answerA = "Kürzeste Wege in gewichteten Graphen ohne negative Kanten",
        answerB = "Kürzeste Wege auch bei negativen Kantengewichten und negative Zyklen detektieren",
        answerC = "Kürzeste Wege in ungewichteten Graphen",
        answerD = "Den minimalen Spannbaum berechnen",
        correctAnswer = 1,
        explanation = "Bellman-Ford verarbeitet alle Kanten n-1 mal (n = Knotenanzahl). Er kann mit negativen Kantengewichten umgehen. Zusätzlich erkennt er negative Zyklen: Wenn nach n-1 Iterationen noch eine Verkürzung möglich ist, existiert ein negativer Zyklus. Laufzeit: O(V×E) — langsamer als Dijkstra.",
        difficulty = 4,
        funFact = null
    ),

    // ── Topologische Sortierung & DAGs ────────────────────────────────────────

    Question(
        categoryId = 12,
        questionText = "Eine topologische Sortierung eines gerichteten azyklischen Graphen (DAG) ordnet Knoten so, dass für jede Kante (u,v) gilt: u kommt vor v. Wann existiert sie?",
        answerA = "Immer in jedem gerichteten Graphen",
        answerB = "Genau dann, wenn der gerichtete Graph azyklisch ist (DAG)",
        answerC = "Nur wenn der Graph planar ist",
        answerD = "Nur wenn der Graph einen Hamilton-Pfad hat",
        correctAnswer = 1,
        explanation = "Eine topologische Sortierung existiert genau dann, wenn der Graph azyklisch ist. Bei einem Zyklus wäre keine konsistente Reihenfolge möglich. Die Sortierung lässt sich mit DFS in O(V+E) berechnen: Knoten werden nach Abschluss ihrer DFS-Exploration in umgekehrter Reihenfolge gelistet.",
        difficulty = 4,
        funFact = "Topologische Sortierungen sind in der Praxis allgegenwärtig: Build-Systeme (Abhängigkeiten zwischen Modulen), Aufgabenplanung (Voraussetzungen), Kompilierung (Importreihenfolge)."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Graph hat n=5 Knoten und ist vollständig (K_5). Wie viele verschiedene beschriftete Spannbäume hat K_5?",
        answerA = "24",
        answerB = "125",
        answerC = "120",
        answerD = "25",
        correctAnswer = 1,
        explanation = "Nach Cayleys Formel: Die Anzahl beschrifteter Spannbäume von K_n ist n^(n-2). Für K_5: 5^(5-2) = 5^3 = 125. Dies ist eines der elegantesten Ergebnisse der kombinatorischen Graphentheorie.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist eine 'Brücke' (Bridge) in einem ungerichteten Graphen?",
        answerA = "Eine Kante mit dem maximalen Gewicht",
        answerB = "Eine Kante, deren Entfernung die Anzahl der Zusammenhangskomponenten erhöht",
        answerC = "Eine Kante zwischen zwei Knoten maximalen Grades",
        answerD = "Eine Kante, die in jedem Spannbaum enthalten ist",
        correctAnswer = 1,
        explanation = "Eine Brücke (auch Isthmus) ist eine Kante e, sodass G-e mehr Zusammenhangskomponenten hat als G. Mit anderen Worten: Eine Brücke liegt auf keinem Kreis. Brücken sind in Netzwerken kritische Verbindungen — ihr Ausfall trennt das Netz.",
        difficulty = 4,
        funFact = "In Computernetzwerken entsprechen Brücken 'Single Points of Failure'. Robuste Netzwerke werden so gestaltet, dass keine Brücken existieren — jede Verbindung ist redundant ausgelegt."
    ),

    Question(
        categoryId = 12,
        questionText = "Der Floyd-Warshall-Algorithmus löst das All-Pairs-Shortest-Path-Problem. Was ist seine Zeitkomplexität?",
        answerA = "O(V²)",
        answerB = "O(V³)",
        answerC = "O(V² log V)",
        answerD = "O(V × E)",
        correctAnswer = 1,
        explanation = "Floyd-Warshall hat Zeitkomplexität O(V³) durch drei verschachtelte Schleifen. Er berechnet die kürzesten Wege zwischen allen Knotenpaaren und funktioniert auch mit negativen Kantengewichten (aber ohne negative Zyklen). Die Grundidee ist dynamische Programmierung: Erlaubte Zwischenknoten werden schrittweise erweitert.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Eine unabhängige Menge (Independent Set) in einem Graphen ist eine Menge von Knoten, in der keine zwei Knoten durch eine Kante verbunden sind. Was gilt für das Problem, die maximale unabhängige Menge zu finden?",
        answerA = "Es ist in polynomieller Zeit lösbar",
        answerB = "Es ist NP-schwer",
        answerC = "Es ist in O(n log n) lösbar",
        answerD = "Es ist nur in planaren Graphen schwer",
        correctAnswer = 1,
        explanation = "Das Maximum-Independent-Set-Problem ist NP-schwer — und sogar schwer zu approximieren (APX-schwer). Es ist eng verwandt mit dem Cliquenproblem (komplementärer Graph) und dem Knotenüberdeckungsproblem. In der Praxis sind Heuristiken wie simuliertes Abkühlen oder genetische Algorithmen üblich.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie lautet die Beziehung zwischen unabhängiger Menge, Knotenüberdeckung und Knotenanzahl n?",
        answerA = "|IS| + |VC| = n (Gallaischer Satz)",
        answerB = "|IS| × |VC| = n",
        answerC = "|IS| = |VC|",
        answerD = "|IS| + |VC| = 2n",
        correctAnswer = 0,
        explanation = "Gallaischer Satz: Für jeden Graphen gilt α(G) + τ(G) = n, wobei α(G) die Unabhängigkeitszahl (größte unabhängige Menge) und τ(G) die Überdeckungszahl (kleinste Knotenüberdeckung) ist. Beweis: Das Komplement einer minimalen Knotenüberdeckung ist eine maximale unabhängige Menge.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "In der Graphentheorie: Was ist ein 'perfektes Matching'?",
        answerA = "Ein Matching, das alle Kanten des Graphen enthält",
        answerB = "Ein Matching, das jeden Knoten des Graphen überdeckt",
        answerC = "Ein Matching mit minimalem Gesamtgewicht",
        answerD = "Ein Matching in einem vollständigen Graphen",
        correctAnswer = 1,
        explanation = "Ein Matching M ist eine Menge paarweise kantendisjunkter Kanten. Ein perfektes Matching überdeckt jeden Knoten des Graphen genau einmal — es existiert nur, wenn der Graph eine gerade Knotenanzahl hat. Tuttes Theorem (1947) liefert eine Charakterisierung der Graphen mit perfektem Matching.",
        difficulty = 4,
        funFact = "Perfekte Matchings haben praktische Anwendungen: Organ-Spender-Empfänger-Zuordnung, Studentenzimmer-Zuteilung und sogar im Quantencomputing bei der Stabilizer-Code-Fehlerkorrektur."
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist die Kantenkonnektivität λ(G) eines Graphen G?",
        answerA = "Die maximale Anzahl kantendisjunkter Pfade zwischen zwei Knoten",
        answerB = "Die minimale Anzahl von Kanten, deren Entfernung G trennt",
        answerC = "Die Anzahl der Kanten im minimalen Spannbaum",
        answerD = "Die maximale Kantenanzahl eines bipartiten Teilgraphen",
        correctAnswer = 1,
        explanation = "Die Kantenkonnektivität λ(G) ist die minimale Anzahl von Kanten, deren Entfernung den Graphen trennt — also die Größe des minimalen Kantenschnitts. Nach dem Satz von Menger gilt: λ(G) = maximale Anzahl kantendisjunkter Pfade zwischen zwei Knoten (min über alle Knotenpaare).",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Aussage über den vollständigen bipartiten Graphen K_{3,3} ist korrekt?",
        answerA = "K_{3,3} ist planar",
        answerB = "K_{3,3} ist nicht planar, hat 9 Kanten und verletzt die Ungleichung E ≤ 2V - 4",
        answerC = "K_{3,3} hat einen Euler-Kreis",
        answerD = "K_{3,3} hat chromatische Zahl 3",
        correctAnswer = 1,
        explanation = "K_{3,3} hat V=6 Knoten und E=9 Kanten. Für bipartite planare Graphen gilt die schärfere Schranke E ≤ 2V - 4 = 8. Da 9 > 8, ist K_{3,3} nicht planar. Zudem: Alle Knoten haben Grad 3 (ungerade), also existiert kein Euler-Kreis. Die chromatische Zahl bipartiter Graphen ist 2 (nicht 3).",
        difficulty = 4,
        funFact = "K_{3,3} wird das 'Versorgerproblem' genannt: Drei Häuser und drei Versorgungsunternehmen (Strom, Gas, Wasser) können nicht kreuzungsfrei verbunden werden."
    ),

    Question(
        categoryId = 12,
        questionText = "Was beschreibt das Konzept der 'Graphisomorphie'?",
        answerA = "Zwei Graphen sind identisch wenn sie dieselbe Adjazenzmatrix haben",
        answerB = "Zwei Graphen G und H sind isomorph, wenn eine bijektive Abbildung f: V(G) → V(H) existiert, die Adjazenz erhält",
        answerC = "Zwei Graphen sind isomorph, wenn sie gleich viele Knoten haben",
        answerD = "Zwei Graphen sind isomorph, wenn sie den gleichen Durchmesser haben",
        correctAnswer = 1,
        explanation = "Graphisomorphie: G ≅ H genau dann, wenn eine Bijektion f: V(G) → V(H) existiert mit {u,v} ∈ E(G) ⟺ {f(u),f(v)} ∈ E(H). Das Graph-Isomorphie-Problem gehört zu den wenigen natürlichen Problemen, von denen nicht bekannt ist, ob sie in P oder NP-vollständig liegen.",
        difficulty = 4,
        funFact = "2015 zeigte László Babai einen quasipolynomiellen Algorithmus für Graph-Isomorphie — einen Durchbruch nach Jahrzehnten ohne Fortschritt. Ob das Problem in P liegt, bleibt ungeklärt."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Graph G hat n Knoten. Wie viele Kanten hat der komplementäre Graph Ḡ, wenn G genau m Kanten hat?",
        answerA = "n(n-1)/2 + m",
        answerB = "n(n-1)/2 - m",
        answerC = "n² - m",
        answerD = "m(n-m)",
        correctAnswer = 1,
        explanation = "Der Komplementgraph Ḡ enthält genau die Kanten, die in G nicht vorhanden sind. Der vollständige Graph K_n hat n(n-1)/2 Kanten. Also hat Ḡ genau n(n-1)/2 - m Kanten. Eigenschaft: G und Ḡ zusammen bilden K_n.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was besagt Mengers Theorem in seiner Knoten-Version?",
        answerA = "Die maximale Anzahl kantendisjunkter Pfade von s nach t",
        answerB = "Die maximale Anzahl intern knotendisjunkter Pfade von s nach t entspricht der minimalen Knotenüberdeckung zwischen s und t",
        answerC = "Jeder 2-zusammenhängende Graph hat einen Hamilton-Kreis",
        answerD = "Der maximale Fluss ist gleich dem minimalen Schnitt",
        correctAnswer = 1,
        explanation = "Mengers Theorem (1927): Die maximale Anzahl intern knotendisjunkter Pfade von s nach t ist gleich der minimalen Anzahl von Knoten (außer s und t), deren Entfernung jeden s-t-Pfad unterbricht. Dies ist ein früher Vorläufer des Max-Flow-Min-Cut-Theorems.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein planarer Graph mit n ≥ 3 Knoten hat mindestens wie viele Knoten mit Grad ≤ 5?",
        answerA = "Keinen notwendigerweise",
        answerB = "Mindestens einen",
        answerC = "Mindestens drei",
        answerD = "Mindestens n/6",
        correctAnswer = 1,
        explanation = "Aus der Eulerschen Formel und E ≤ 3V-6 folgt, dass in jedem planaren Graphen die durchschnittliche Knotendegree < 6 ist. Daher muss es mindestens einen Knoten mit Grad ≤ 5 geben. Diese Eigenschaft ist zentral für viele Induktionsbeweise über planare Graphen (z.B. der Fünf-Farben-Satz).",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Das Spektrum eines Graphen wird durch die Eigenwerte seiner Adjazenzmatrix definiert. Was beschreibt der größte Eigenwert (Spektralradius)?",
        answerA = "Den maximalen Knotengrad",
        answerB = "Näherungsweise den maximalen Knotengrad in regulären Graphen, und er hängt eng mit der Ausbreitungsgeschwindigkeit in Netzwerken zusammen",
        answerC = "Die chromatische Zahl des Graphen",
        answerD = "Die Anzahl der Zusammenhangskomponenten",
        correctAnswer = 1,
        explanation = "Der Spektralradius ρ(G) = λ_max liegt zwischen dem durchschnittlichen und dem maximalen Knotengrad. Bei k-regulären Graphen gilt λ_max = k. Der Spektralradius beschreibt, wie schnell sich Prozesse (Epidemien, Informationen) im Netzwerk ausbreiten — je größer ρ, desto schneller die Ausbreitung.",
        difficulty = 4,
        funFact = "Spektralgraphentheorie verbindet lineare Algebra mit Graphentheorie und hat Anwendungen in Bildverarbeitung, Machine Learning (spektrales Clustering) und Quantenchaos."
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Kanten hat der vollständige Graph K_n?",
        answerA = "n²",
        answerB = "n(n-1)/2",
        answerC = "n(n+1)/2",
        answerD = "2n-1",
        correctAnswer = 1,
        explanation = "Im vollständigen Graphen K_n ist jedes Knotenpaar durch genau eine Kante verbunden. Die Anzahl der Knotenpaare aus n Knoten ist C(n,2) = n(n-1)/2. Für K_5: 5×4/2=10 Kanten. Für K_10: 10×9/2=45 Kanten.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welchen Namen trägt das Problem, einen Graphen in möglichst wenige Cliquen zu zerlegen?",
        answerA = "Cliquen-Überdeckungsproblem (Clique Cover Problem)",
        answerB = "Independent-Set-Problem",
        answerC = "Vertex-Coloring-Problem",
        answerD = "Dominating-Set-Problem",
        correctAnswer = 0,
        explanation = "Das Cliquen-Überdeckungsproblem fragt nach der minimalen Anzahl von Cliquen, die zusammen alle Knoten des Graphen überdecken. Die minimale Anzahl benötigter Cliquen wird als Cliquenüberdeckungszahl θ(G) bezeichnet. Es gilt θ(G) = χ(Ḡ) — die Überdeckungszahl ist die chromatische Zahl des Komplementgraphen.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Aussage über Zufallsgraphen (Erdős-Rényi-Modell G(n,p)) ist korrekt?",
        answerA = "G(n,p) ist immer zusammenhängend für alle p > 0",
        answerB = "Es gibt eine scharfe Schwelle p* = ln(n)/n: Für p > p* ist G(n,p) mit hoher Wahrscheinlichkeit zusammenhängend, für p < p* nicht",
        answerC = "G(n,p) hat immer genau pn(n-1)/2 Kanten",
        answerD = "Die chromatische Zahl von G(n,p) ist immer ⌈np⌉",
        correctAnswer = 1,
        explanation = "Erdős und Rényi (1960) entdeckten Schwellenwertphänomene: Bei p = ln(n)/n tritt ein Phasenübergang auf. Für p >> ln(n)/n ist G(n,p) mit hoher Wahrscheinlichkeit zusammenhängend; für p << ln(n)/n gibt es isolierte Knoten. Dieser scharfe Übergang gilt für viele Grapheneigenschaften.",
        difficulty = 4,
        funFact = "Schwellenwertphänomene in Zufallsgraphen haben Analogien zu Phasenübergängen in der Physik — und inspirieren Modelle für Epidemien, Perkolation und das Internet."
    ),

)
