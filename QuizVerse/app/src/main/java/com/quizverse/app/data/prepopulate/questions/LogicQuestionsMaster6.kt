package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsMaster6(): List<Question> = listOf(

    // --- VOLLSTÄNDIGE INDUKTION, REKURSION, BEWEISLOGIK, FIXPUNKTSÄTZE ---

    // Question 1
    Question(
        categoryId = 12,
        questionText = "Die vollständige Induktion beweist Aussagen über natürliche Zahlen. Welcher Schritt unterscheidet sie fundamental vom Schluss auf ein konkretes n?",
        answerA = "Der Induktionsanfang, der die Aussage für n = 0 zeigt",
        answerB = "Der Induktionsschluss, der aus P(n) die Gültigkeit von P(n+1) ableitet — ohne dass n bekannt ist",
        answerC = "Der Beweis durch Widerspruch, der das Nichtvorhandensein einer kleinsten Ausnahme zeigt",
        answerD = "Die Angabe der Formel, die bewiesen werden soll",
        correctAnswer = 1,
        explanation = "Das Entscheidende an der vollständigen Induktion ist der Induktionsschritt: Man nimmt P(n) als wahr an (Induktionsvoraussetzung) und leitet daraus P(n+1) ab — für ein beliebiges, nicht konkret bekanntes n. Zusammen mit dem Induktionsanfang (P(0) oder P(1)) folgt die Aussage für alle n ∈ ℕ durch das Dominoprinzip. Der Schritt ist allgemein, nicht für ein festes n.",
        difficulty = 5
    ),

    // Question 2
    Question(
        categoryId = 12,
        questionText = "Was ist die 'starke Induktion' (auch vollständige Induktion zweiter Art) und wann ist sie stärker als die gewöhnliche Induktion?",
        answerA = "Sie ist identisch mit der gewöhnlichen Induktion und daher nicht stärker",
        answerB = "Sie nimmt im Induktionsschritt an, dass P(k) für ALLE k < n gilt, um P(n) zu beweisen — nützlich wenn P(n) von mehreren Vorgängern abhängt",
        answerC = "Sie beweist Aussagen für alle ganzen Zahlen, nicht nur natürliche",
        answerD = "Sie ersetzt den Induktionsanfang durch eine existenzielle Behauptung",
        correctAnswer = 1,
        explanation = "Bei der starken Induktion (Induktionshypothese für alle k < n) nimmt man an: P(k) gilt für alle natürlichen Zahlen k mit k < n. Daraus beweist man P(n). Dies ist bei Folgen nützlich, wo P(n) von mehreren Vorgängern abhängt, z.B. die Fibonacci-Folge F(n) = F(n−1) + F(n−2): P(n) hängt von P(n−1) UND P(n−2) ab. Logisch sind starke und gewöhnliche Induktion äquivalent — die starke ist aber praktisch mächtiger.",
        difficulty = 5,
        funFact = "Jeder Beweis durch starke Induktion kann formal in einen Beweis durch gewöhnliche Induktion umgeschrieben werden, indem man die Hilfsaussage Q(n) = 'P(k) gilt für alle k ≤ n' einführt und per gewöhnlicher Induktion beweist."
    ),

    // Question 3
    Question(
        categoryId = 12,
        questionText = "Beim Beweis der Gaußschen Summenformel 1+2+…+n = n(n+1)/2 per vollständiger Induktion: Welcher Fehler macht einen Induktionsbeweis ungültig?",
        answerA = "Das Vergessen des Faktors 2 im Nenner",
        answerB = "Das Weglassen des Induktionsanfangs — der Induktionsschritt allein beweist gar nichts",
        answerC = "Das Benutzen von Gleichheitszeichen statt Äquivalenzpfeilen",
        answerD = "Das Beweisen für n = 1 statt n = 0",
        correctAnswer = 1,
        explanation = "Ein Induktionsschritt ohne Induktionsanfang ist wertlos. Klassisches Gegenbeispiel: 'Alle natürlichen Zahlen sind gleich' lässt sich mit einem falschen 'Induktionsschritt' scheinbar beweisen, wenn kein gültiger Anfang existiert. Der Induktionsanfang verankert die Kette — ohne ihn schwebt der Schritt in der Luft. Auch umgekehrt: Ein Anfang ohne gültigen Schritt beweist nur den Einzelfall.",
        difficulty = 5
    ),

    // Question 4
    Question(
        categoryId = 12,
        questionText = "Transfinite Induktion verallgemeinert die vollständige Induktion auf beliebige wohlgeordnete Mengen. Welche drei Fälle müssen dabei bewiesen werden, die bei gewöhnlicher Induktion auf einen reduziert werden?",
        answerA = "Anfang, Schritt, Abschluss",
        answerB = "Basisfall (α = 0), Nachfolger-Schritt (von α zu α+1) und Grenzordinalschritt (für Limesordinalzahlen λ, gegeben P(β) für alle β < λ)",
        answerC = "Existenz, Eindeutigkeit, Konstruktion",
        answerD = "Anfang, Induktionsvoraussetzung, Widerspruch",
        correctAnswer = 1,
        explanation = "Transfinite Induktion hat drei obligatorische Fälle: (1) Basisfall: P(0) gilt. (2) Nachfolgerschritt: P(α) ⟹ P(α+1) für alle Ordinalzahlen α. (3) Limesschritt: Falls P(β) für alle β < λ gilt und λ eine Grenzordinalzahl ist (keine Vorgängerordinalzahl hat), dann gilt P(λ). Bei gewöhnlicher Induktion über ℕ gibt es keine Limesordinalzahlen, da ℕ = {0, 1, 2, …} keine Grenzordinalzahlen außer 0 enthält.",
        difficulty = 5,
        funFact = "Die Ordinalzahl ω (omega) ist die erste unendliche Ordinalzahl und gleichzeitig die erste Grenzordinalzahl — sie hat keinen direkten Vorgänger. Bei transfiniter Induktion bis ω muss man für ω explizit zeigen: 'Wenn P(n) für alle n ∈ ℕ gilt, dann gilt P(ω)'."
    ),

    // Question 5
    Question(
        categoryId = 12,
        questionText = "Was ist der Wohlordnungssatz und welche äquivalente Aussage hat er in der Mengenlehre?",
        answerA = "Jede unendliche Menge hat eine bijektive Abbildung auf ℕ",
        answerB = "Jede Menge kann wohlgeordnet werden — äquivalent zum Auswahlaxiom (AC) und zum Zorn'schen Lemma",
        answerC = "Jede Teilmenge der reellen Zahlen hat ein Infimum",
        answerD = "Die natürlichen Zahlen sind die einzige wohlgeordnete unendliche Menge",
        correctAnswer = 1,
        explanation = "Der Wohlordnungssatz (Zermelo, 1904): Jede Menge M kann wohlgeordnet werden, d.h. es gibt eine Totalordnung auf M, sodass jede nichtleere Teilmenge ein kleinstes Element besitzt. Dies ist genau äquivalent zum Auswahlaxiom (AC) und zum Zorn'schen Lemma. Der Beweis erfordert AC wesentlich. Anschaulich: Selbst die reellen Zahlen können wohlgeordnet werden — aber kein explizites Beispiel einer solchen Wohlordnung auf ℝ kann ohne AC konstruiert werden.",
        difficulty = 5,
        funFact = "Georg Cantor glaubte, der Wohlordnungssatz sei ein 'grundlegendes Denkgesetz' und ohne Beweis evident. 1904 versuchte Julius König, ihn zu widerlegen — Felix Hausdorff fand aber wenig später einen Fehler in Königs Argumentation."
    ),

    // Question 6
    Question(
        categoryId = 12,
        questionText = "Das Wohlordnungsprinzip der natürlichen Zahlen besagt: Jede nichtleere Teilmenge von ℕ hat ein kleinstes Element. Welche Beweismethode lässt sich direkt daraus ableiten?",
        answerA = "Beweis durch vollständige Fallunterscheidung",
        answerB = "Beweis durch den 'kleinsten Verbrecher' (minimales Gegenbeispiel): Man nimmt an, es gibt eine Ausnahme, wählt die kleinste und führt sie zum Widerspruch",
        answerC = "Beweis durch Konstruktion einer Bijektion",
        answerD = "Beweis durch unendliche Rekursion",
        correctAnswer = 1,
        explanation = "Die Methode des kleinsten Verbrechers (Minimal-Gegenbeispiel-Methode): Angenommen, die Aussage P gilt nicht für alle n ∈ ℕ. Dann ist M = {n ∈ ℕ | P(n) gilt nicht} nichtleer. Nach dem Wohlordnungsprinzip hat M ein kleinstes Element n₀. Man zeigt dann: Das Vorhandensein eines kleinsten Gegenbeispiels n₀ führt zu einem Widerspruch (entweder P(n₀) gilt doch, oder es gibt ein noch kleineres Gegenbeispiel). Dies ist äquivalent zur vollständigen Induktion.",
        difficulty = 5
    ),

    // Question 7
    Question(
        categoryId = 12,
        questionText = "Was ist eine rekursive Definition und welche zwei Komponenten sind zwingend erforderlich?",
        answerA = "Eine Gleichung und ein Algorithmus zur Auflösung",
        answerB = "Ein Basisfall (explizite Startdefinition) und ein Rekursionsschritt (Definition des nächsten Werts durch vorherige Werte)",
        answerC = "Eine Formel und ein Beweis ihrer Korrektheit",
        answerD = "Eine Abbruchbedingung und eine Schleife",
        correctAnswer = 1,
        explanation = "Jede wohldefinierte rekursive Definition benötigt zwingend: (1) Basisfall(e): Die explizite Definition für die kleinsten Werte (z.B. 0! = 1, F(0) = 0, F(1) = 1). (2) Rekursionsschritt: Wie ergibt sich der Wert an Stelle n aus Werten an früheren Stellen (z.B. n! = n · (n−1)!, F(n) = F(n−1) + F(n−2)). Fehlt der Basisfall, ist die Definition zirkulär und nicht wohldefiniert; fehlt der Rekursionsschritt, ist sie keine rekursive Definition.",
        difficulty = 5
    ),

    // Question 8
    Question(
        categoryId = 12,
        questionText = "Die Ackermann-Funktion A(m, n) ist das klassische Beispiel einer totalen, nicht-primitiv-rekursiven Funktion. Was gilt für A(4, 2)?",
        answerA = "A(4, 2) = 65.536",
        answerB = "A(4, 2) ist eine Zahl mit 19.729 Dezimalstellen (konkret: 2↑↑↑3 − 3)",
        answerC = "A(4, 2) = 2^65536",
        answerD = "A(4, 2) ist unendlich, da die Rekursion nicht terminiert",
        correctAnswer = 1,
        explanation = "A(4, 2) = 2^(2^(2^65536)) − 3, eine Zahl mit 19.729 Dezimalstellen. Allgemein: A(4, n) wächst als eine Art iterierten Potenzturm. A(3, n) = 2^(n+3) − 3, A(4, n) = 2↑↑(n+3) − 3 (Tetration). Die Funktion terminiert immer (da m und n beide bei jedem rekursiven Schritt in wohlgeordneter Weise abnehmen), wächst aber so schnell, dass keine primitiv-rekursive Funktion sie majorisiert.",
        difficulty = 5,
        funFact = "Wilhelm Ackermann konstruierte die Funktion 1928 auf Anregung seines Doktorvaters David Hilbert, um zu zeigen, dass nicht alle berechenbaren Funktionen primitiv-rekursiv sind. Sie war eine der ersten expliziten Funktionen jenseits der primitiven Rekursion."
    ),

    // Question 9
    Question(
        categoryId = 12,
        questionText = "Der Banachsche Fixpunktsatz (1922) besagt: Ein Kontraktionsoperator auf einem vollständigen metrischen Raum hat genau einen Fixpunkt. Was ist eine 'Kontraktion'?",
        answerA = "Eine Funktion, die die Menge auf einen einzigen Punkt abbildet",
        answerB = "Eine Abbildung T: X → X mit d(T(x), T(y)) ≤ q · d(x, y) für ein festes q ∈ [0, 1) und alle x, y",
        answerC = "Eine lineare Abbildung mit Eigenwert kleiner als 1",
        answerD = "Eine stetige Funktion auf einem kompakten Raum",
        correctAnswer = 1,
        explanation = "Eine Kontraktion (oder kontrahierende Abbildung) auf einem metrischen Raum (X, d) ist eine Abbildung T: X → X, für die eine Konstante q ∈ [0, 1) existiert — die Lipschitz-Konstante — sodass für alle x, y ∈ X gilt: d(T(x), T(y)) ≤ q · d(x, y). T verkleinert also jeden Abstand um mindestens den Faktor q. Banach bewies: Jede Kontraktion auf einem vollständigen metrischen Raum hat genau einen Fixpunkt p mit T(p) = p, und die Folge (T^n(x₀)) konvergiert gegen p für jeden Startwert x₀.",
        difficulty = 5
    ),

    // Question 10
    Question(
        categoryId = 12,
        questionText = "Welche wichtige Anwendung hat der Banachsche Fixpunktsatz in der Analysis?",
        answerA = "Er beweist den Fundamentalsatz der Algebra",
        answerB = "Er liefert den Existenz- und Eindeutigkeitssatz für gewöhnliche Differentialgleichungen (Satz von Picard-Lindelöf)",
        answerC = "Er beweist die Konvergenz aller Potenzreihen",
        answerD = "Er zeigt die Vollständigkeit von L²-Räumen",
        correctAnswer = 1,
        explanation = "Der Satz von Picard-Lindelöf besagt: Das Anfangswertproblem y' = f(x, y), y(x₀) = y₀ hat unter Lipschitz-Bedingung an f (bzgl. y) genau eine lokale Lösung. Beweis: Man definiert den Picard-Operator T[y](x) = y₀ + ∫_{x₀}^{x} f(t, y(t)) dt. Unter geeigneten Bedingungen ist T eine Kontraktion auf dem Raum der stetigen Funktionen (mit Supremumsnorm). Der Banachsche Fixpunktsatz liefert dann genau einen Fixpunkt — die eindeutige Lösung der DGL.",
        difficulty = 5,
        funFact = "Der Banachsche Fixpunktsatz liefert nicht nur Existenz und Eindeutigkeit, sondern auch ein explizites Iterationsverfahren (Picard-Iteration): y_{n+1} = T[y_n]. Die Fehlerabschätzung a posteriori ist q^n/(1-q) · d(T(x₀), x₀)."
    ),

    // Question 11
    Question(
        categoryId = 12,
        questionText = "Was ist der Unterschied zwischen einem direkten Beweis und einem Widerspruchsbeweis (Beweis per Reductio ad Absurdum)?",
        answerA = "Ein direkter Beweis gilt nur für endliche Strukturen, ein Widerspruchsbeweis für unendliche",
        answerB = "Ein direkter Beweis leitet die Aussage aus den Voraussetzungen ab; ein Widerspruchsbeweis nimmt die Negation der Behauptung an und zeigt, dass daraus ein Widerspruch folgt",
        answerC = "Ein Widerspruchsbeweis ist logisch schwächer als ein direkter Beweis",
        answerD = "Beide Methoden sind in der konstruktiven Mathematik gleichwertig",
        correctAnswer = 1,
        explanation = "Direkter Beweis: Aus Voraussetzungen V₁, V₂, … leitet man durch logische Schlüsse direkt die Behauptung B ab. Widerspruchsbeweis: Man nimmt ¬B an (die Negation der Behauptung) und zeigt: V₁ ∧ V₂ ∧ … ∧ ¬B → ⊥ (Widerspruch). Da die Voraussetzungen gelten, muss ¬B falsch sein, also B wahr. Der Widerspruchsbeweis ist in der klassischen Logik gültig, aber in der konstruktiven (intuitionistischen) Mathematik ist er schwächer: ¬¬B impliziert dort nicht B.",
        difficulty = 5
    ),

    // Question 12
    Question(
        categoryId = 12,
        questionText = "Was ist ein Beweis durch Kontraposition und wie unterscheidet er sich vom Widerspruchsbeweis?",
        answerA = "Beide sind identisch",
        answerB = "Kontraposition beweist A ⟹ B durch Beweis von ¬B ⟹ ¬A; beim Widerspruchsbeweis nimmt man A ∧ ¬B an und leitet ⊥ ab",
        answerC = "Kontraposition gilt nur in der Prädikatenlogik zweiter Stufe",
        answerD = "Der Widerspruchsbeweis ist ein Spezialfall der Kontraposition",
        correctAnswer = 1,
        explanation = "Kontraposition: A ⟹ B ist logisch äquivalent zu ¬B ⟹ ¬A. Man beweist die Implikation also durch Umkehrung: Wenn B falsch ist, dann muss A falsch sein. Beispiel: 'Wenn n² gerade ist, dann ist n gerade' — Kontraposition: 'Wenn n ungerade ist, dann ist n² ungerade'. Beim Widerspruchsbeweis nimmt man A ∧ ¬B an und leitet einen Widerspruch her. Der Widerspruchsbeweis ist allgemeiner (auch für Aussagen ohne Implikationsform), die Kontraposition nur für Implikationen anwendbar.",
        difficulty = 5
    ),

    // Question 13
    Question(
        categoryId = 12,
        questionText = "Die Fibonacci-Folge ist rekursiv definiert: F(0)=0, F(1)=1, F(n)=F(n-1)+F(n-2). Welche explizite Formel (Binet-Formel) gibt F(n) direkt an?",
        answerA = "F(n) = 2^n / n",
        answerB = "F(n) = (φⁿ − ψⁿ) / √5, wobei φ = (1+√5)/2 (goldener Schnitt) und ψ = (1−√5)/2",
        answerC = "F(n) = n · (n−1) / 2",
        answerD = "F(n) = ⌊φⁿ / √5 + 1/2⌋ für alle n, aber keine geschlossene Formel existiert",
        correctAnswer = 1,
        explanation = "Die Binet-Formel (1843, aber früher bekannt): F(n) = (φⁿ − ψⁿ) / √5, wobei φ = (1+√5)/2 ≈ 1,618 (goldener Schnitt) und ψ = (1−√5)/2 ≈ −0,618. Da |ψ| < 1, gilt F(n) = round(φⁿ/√5) für alle n ≥ 0. Der Beweis erfolgt durch starke Induktion oder durch Lösung der charakteristischen Gleichung x² = x + 1. Sowohl φ als auch ψ sind irrationale Zahlen — dennoch ergibt ihre Kombination immer eine ganze Zahl.",
        difficulty = 5,
        funFact = "Die charakteristische Gleichung der Fibonacci-Rekurrenz x² − x − 1 = 0 hat die Wurzeln φ und ψ. Die Technik, rekurrente Folgen durch Eigenwerte ihrer charakteristischen Gleichung zu lösen, ist in der linearen Algebra verankert."
    ),

    // Question 14
    Question(
        categoryId = 12,
        questionText = "Was ist eine 'strukturelle Induktion' und auf welche Objekte wird sie angewandt?",
        answerA = "Eine Induktion über die Länge eines Strings",
        answerB = "Eine Verallgemeinerung der vollständigen Induktion auf induktiv definierte Strukturen wie Bäume, Listen, Ausdrücke — man beweist die Eigenschaft für Basiselemente und zeigt, dass sie unter Konstruktoren erhalten bleibt",
        answerC = "Eine Induktion über die Anzahl der Quantoren in einer Formel",
        answerD = "Synonym für transfinite Induktion",
        correctAnswer = 1,
        explanation = "Strukturelle Induktion wird auf induktiv definierte Datenstrukturen angewandt: Listen, Bäume, arithmetische Ausdrücke, logische Formeln. Beispiel für Listen: (1) Basis: Die Eigenschaft gilt für die leere Liste []. (2) Schritt: Wenn die Eigenschaft für Liste L gilt, gilt sie auch für (x :: L) (Liste mit Kopfelement x). Dies ist mächtiger als Induktion über natürliche Zahlen, da die Struktur direkt widerspiegelt, wie die Objekte aufgebaut sind.",
        difficulty = 5
    ),

    // Question 15
    Question(
        categoryId = 12,
        questionText = "Was ist der Fixpunktsatz von Knaster-Tarski und auf welchen Verbandsstrukturen gilt er?",
        answerA = "Jede monotone Funktion auf einer Menge hat einen Fixpunkt",
        answerB = "Jede ordnungserhaltende (monotone) Funktion f: L → L auf einem vollständigen Verband L hat einen kleinsten und einen größten Fixpunkt",
        answerC = "Jede stetige Funktion auf einem kompakten Verband hat einen Fixpunkt",
        answerD = "Jede Kontraktion auf einem Banachraum hat genau einen Fixpunkt",
        correctAnswer = 1,
        explanation = "Knaster-Tarski-Fixpunktsatz (1955): Sei L ein vollständiger Verband und f: L → L monoton (a ≤ b ⟹ f(a) ≤ f(b)). Dann hat f einen kleinsten Fixpunkt lfp(f) = ⋀{x ∈ L | f(x) ≤ x} und einen größten Fixpunkt gfp(f) = ⋁{x ∈ L | x ≤ f(x)}. Wichtig: Es wird keine Stetigkeit gefordert — nur Monotonie. Anwendungen: Semantik von Schleifen und Rekursion in der Programmiersprachen-Theorie, kleinste und größte Fixpunkte in der Logik.",
        difficulty = 5,
        funFact = "Der Knaster-Tarski-Satz ist die Grundlage der denotationellen Semantik von Programmiersprachen (Scott-Strachey-Semantik). Schleifen werden als kleinste Fixpunkte von Funktionaltransformatoren definiert."
    ),

    // Question 16
    Question(
        categoryId = 12,
        questionText = "Welche Bedingung muss bei einer rekursiven Definition von Mengen oder Typen erfüllt sein, damit sie wohldefiniert ist?",
        answerA = "Die Definition muss endlich viele Fälle haben",
        answerB = "Die Rekursion muss strukturell sein: Jeder rekursive Aufruf muss auf einem echt kleineren Objekt operieren (terminiert garantiert)",
        answerC = "Die definierte Menge muss eine Teilmenge der natürlichen Zahlen sein",
        answerD = "Alle rekursiven Aufrufe müssen dieselbe Signatur haben",
        correctAnswer = 1,
        explanation = "Eine rekursive Definition ist wohldefiniert, wenn die Rekursion terminiert: Jeder rekursive Aufruf f(x) muss auf einem Argument x' erfolgen, das bezüglich einer wohlgegründeten Relation kleiner als x ist (d.h. keine unendlichen Abstiegsketten). Bei struktureller Rekursion auf Datentypen ist das automatisch gewährleistet, weil die Argumente echt kleiner strukturiert sind (z.B. Teilbäume eines Baums). Verletzt man dies (zirkuläre Definitionen ohne Basis), entstehen undefinierte Objekte.",
        difficulty = 5
    ),

    // Question 17
    Question(
        categoryId = 12,
        questionText = "Was beweist der 'Satz vom kleinsten Gegenbeispiel' in der Zahlentheorie, und wie hängt er mit dem Wohlordnungsprinzip zusammen?",
        answerA = "Er beweist, dass alle Primzahlen ungerade sind",
        answerB = "Er zeigt: Wenn eine Eigenschaft P nicht für alle n gilt, gibt es eine kleinste natürliche Zahl ohne P — was oft zu einem Widerspruch führt und damit P für alle n beweist",
        answerC = "Er ist nur für endliche Mengen anwendbar",
        answerD = "Er ist äquivalent zum zweiten Unvollständigkeitssatz von Gödel",
        correctAnswer = 1,
        explanation = "Das Wohlordnungsprinzip garantiert: Jede nichtleere Teilmenge von ℕ hat ein kleinstes Element. Der Satz vom kleinsten Gegenbeispiel nutzt dies: Angenommen, M = {n ∈ ℕ | P(n) falsch} ist nichtleer. Dann existiert ein kleinstes n₀ ∈ M. Oft kann man zeigen: Da P(k) für alle k < n₀ gilt (Minimalität!), muss auch P(n₀) gelten — Widerspruch. Dieser Stil ist dem Induktionsbeweis logisch äquivalent, aber manchmal natürlicher formulierbar.",
        difficulty = 5
    ),

    // Question 18
    Question(
        categoryId = 12,
        questionText = "Wenn man die Fakultät n! rekursiv als f(0) = 1, f(n) = n · f(n-1) definiert: Welcher mathematische Satz garantiert die Eindeutigkeit dieser Definition?",
        answerA = "Der Fixpunktsatz von Banach",
        answerB = "Das Rekursionstheorem (Principle of Recursive Definition): Zu jedem Startwert a und jeder Funktion g gibt es genau eine Funktion f: ℕ → X mit f(0) = a und f(n+1) = g(n, f(n))",
        answerC = "Der Satz von Löwenheim-Skolem",
        answerD = "Das Auswahlaxiom",
        correctAnswer = 1,
        explanation = "Das Rekursionstheorem (auch Definitionsprinzip durch Rekursion oder Schema der primitiven Rekursion) lautet formal: Gegeben eine Menge X, ein Element a ∈ X und eine Funktion g: ℕ × X → X. Dann existiert genau eine Funktion f: ℕ → X mit (1) f(0) = a und (2) f(n+1) = g(n, f(n)) für alle n. Dies macht rekursive Definitionen wie n! oder die Fibonacci-Folge mathematisch legitim. Ohne dieses Theorem wären rekursive Definitionen nur scheinbar Definitionen.",
        difficulty = 5,
        funFact = "In der Mengenlehre (ZF) wird das Rekursionstheorem aus den Axiomen abgeleitet. Es ist nicht trivial: Man muss zeigen, dass eine Funktion mit den gewünschten Eigenschaften existiert, und ihre Eindeutigkeit beweisen."
    ),

    // Question 19
    Question(
        categoryId = 12,
        questionText = "Welche Aussage beschreibt korrekt den Unterschied zwischen 'primitiver Rekursion' und 'allgemeiner Rekursion' (μ-Rekursion)?",
        answerA = "Primitive Rekursion erlaubt beliebig viele Basisfälle; allgemeine Rekursion nur einen",
        answerB = "Primitiv-rekursive Funktionen sind immer total; μ-rekursive Funktionen können partiell sein, da der unbeschränkte Minimierungsoperator μ möglicherweise nicht terminiert",
        answerC = "Allgemeine Rekursion ist schwächer als primitive Rekursion",
        answerD = "Beide Klassen stimmen auf totalen Funktionen überein",
        correctAnswer = 1,
        explanation = "Primitiv-rekursive Funktionen verwenden nur beschränkte Rekursion (das Argument fällt stets genau um 1) und sind deshalb immer total. Der μ-Operator (unbeschränkte Minimierung): μy[f(x,y) = 0] sucht das kleinste y mit f(x,y) = 0. Existiert kein solches y, divergiert die Funktion. μ-rekursive Funktionen können also partiell sein. Die Klasse der totalen μ-rekursiven Funktionen umfasst die Ackermann-Funktion und geht über die primitiv-rekursiven hinaus.",
        difficulty = 5
    ),

    // Question 20
    Question(
        categoryId = 12,
        questionText = "Was ist ein 'Beweis durch Gegenbeispiel' und in welchen Fällen ist er anwendbar?",
        answerA = "Er beweist eine Existenzaussage durch Konstruktion eines Objekts",
        answerB = "Er widerlegt eine Allaussage ∀x P(x) durch Angabe eines konkreten x₀ mit ¬P(x₀)",
        answerC = "Er beweist eine Unmöglichkeitsaussage durch Annahme des Gegenteils",
        answerD = "Er ist nur in der endlichen Kombinatorik anwendbar",
        correctAnswer = 1,
        explanation = "Ein Gegenbeispiel widerlegt eine Universalaussage: Um ∀x P(x) zu widerlegen, genügt ein einziges x₀ mit ¬P(x₀). Das Gegenbeispiel muss konkret und korrekt sein. Beispiel: Die Vermutung 'Alle Primzahlen sind ungerade' wird durch das Gegenbeispiel 2 widerlegt. Gegenbeispiele können keine Allaussagen beweisen — sie können nur Allaussagen widerlegen oder Existenzaussagen beweisen (ein gefundenes x₀ ist ein Zeuge für ∃x P(x)).",
        difficulty = 5
    ),

    // Question 21
    Question(
        categoryId = 12,
        questionText = "Die transfinite Rekursion erlaubt es, Funktionen für alle Ordinalzahlen zu definieren. Was ist der entscheidende Unterschied zur gewöhnlichen Rekursion über ℕ?",
        answerA = "Transfinite Rekursion ist nur für abzählbare Ordinalzahlen definiert",
        answerB = "Bei Grenzordinalzahlen λ kann man den Wert nicht aus einem einzigen Vorgänger ableiten — man benötigt einen Grenzwert (Supremum oder Limes) aller Werte für β < λ",
        answerC = "Transfinite Rekursion erfordert das Auswahlaxiom für jede Ordinalzahl",
        answerD = "Bei transfiniter Rekursion muss der Basisfall explizit für jede Limesordinalzahl angegeben werden",
        correctAnswer = 1,
        explanation = "Bei gewöhnlicher Rekursion über ℕ hat jede Zahl n > 0 genau einen Vorgänger n−1. Bei transfiniter Rekursion hat eine Nachfolgerordinalzahl α+1 ebenfalls einen Vorgänger α. Aber Grenzordinalzahlen (wie ω, ω·2, ω², …) haben keinen direkten Vorgänger — sie sind Suprema von Mengen von Ordinalzahlen. Daher muss die Rekursion an Grenzordinalzahlen λ separat definiert werden, typischerweise als Limes oder Supremum: f(λ) = sup{f(β) | β < λ}.",
        difficulty = 5,
        funFact = "Die von Neumann'sche Kumulativhierarchie V₀ = ∅, V_{α+1} = P(Vα), Vλ = ⋃_{β<λ} Vβ ist ein Paradebeispiel transfiniter Rekursion. Das Universum V = ⋃_{α ∈ Ord} Vα ist das 'Gesamtuniversum aller Mengen' der ZF-Mengenlehre."
    ),

    // Question 22
    Question(
        categoryId = 12,
        questionText = "Was besagt das Induktionsprinzip in der Peano-Arithmetik (PA) als Axiomenschema?",
        answerA = "Für jede natürliche Zahl n gibt es einen Nachfolger S(n)",
        answerB = "Für jede Formel φ(x): Wenn φ(0) gilt und aus φ(n) folgt φ(S(n)), dann gilt φ(n) für alle n — als Axiomenschema über alle Formeln der Sprache",
        answerC = "Die Menge der natürlichen Zahlen ist die kleinste Menge mit 0 und einem Nachfolger",
        answerD = "Jede natürliche Zahl ist entweder 0 oder Nachfolger einer natürlichen Zahl",
        correctAnswer = 1,
        explanation = "Das Induktionsaxiomenschema der Peano-Arithmetik (PA) ist ein Schema: Für jede Formel φ(x) in der Sprache der Arithmetik gilt: (φ(0) ∧ ∀n (φ(n) → φ(S(n)))) → ∀n φ(n). Da es unendlich viele Formeln gibt, ist dies kein einzelnes Axiom, sondern unendlich viele Axiome — ein Schema. Gödels Unvollständigkeitssatz zeigt, dass PA trotzdem nicht alle wahren arithmetischen Aussagen beweisen kann.",
        difficulty = 5
    ),

    // Question 23
    Question(
        categoryId = 12,
        questionText = "Ein Beweis durch 'Diagonalisierung' (Cantor 1891) zeigt, dass ℝ überabzählbar ist. Was ist das Kernprinzip dieses Beweises?",
        answerA = "Man zeigt, dass die reellen Zahlen eine größere Kardinalzahl als ℕ haben durch explizite Bijektion",
        answerB = "Man nimmt eine beliebige Abzählung f: ℕ → [0,1] an und konstruiert eine reelle Zahl d ∉ Bild(f), indem d an der n-ten Stelle von f(n) abweicht — Widerspruch zur Surjektivität",
        answerC = "Man zeigt, dass zwischen je zwei reellen Zahlen eine rationale liegt, und schließt auf Überabzählbarkeit",
        answerD = "Man beweist, dass die Potenzmenge einer abzählbaren Menge überabzählbar ist",
        correctAnswer = 1,
        explanation = "Cantors Diagonalargument: Angenommen, f: ℕ → [0,1] wäre surjektiv. Schreibe alle f(n) als Dezimalbrüche. Definiere d so: d = 0,d₁d₂d₃…, wobei d_n ≠ f(n)_n (d.h. die n-te Dezimalstelle von d unterscheidet sich von der n-ten Dezimalstelle von f(n)). Dann gilt für jedes n: d ≠ f(n) (da sie sich an der n-ten Stelle unterscheiden). Also d ∉ Bild(f) — Widerspruch zur Surjektivität. Das Diagonalargument erzeugt systematisch ein Objekt, das von jedem aufgezählten Objekt abweicht.",
        difficulty = 5,
        funFact = "Turings Halteproblembeweis und Gödels Unvollständigkeitssatz sind strukturell Variationen des Cantorschen Diagonalarguments: In allen drei Fällen konstruiert man ein Objekt, das sich von jedem aufgezählten unterscheidet."
    ),

    // Question 24
    Question(
        categoryId = 12,
        questionText = "Was ist ein 'Wohlgegründet-Induktionsprinzip' (well-founded induction) und für welche Relationen gilt es?",
        answerA = "Es gilt nur für totale Ordnungen auf abzählbaren Mengen",
        answerB = "Für jede wohlgegründete Relation < auf einer Menge M gilt: Wenn P(x) für alle y < x folgt aus P(y), dann gilt P(x) für alle x ∈ M",
        answerC = "Es ist äquivalent zur transfiniten Induktion, gilt aber nur für Ordinalzahlen",
        answerD = "Es erfordert das Auswahlaxiom zur Konstruktion der Wohlordnung",
        correctAnswer = 1,
        explanation = "Eine Relation < ist wohlgegründet (gut gegründet, well-founded), wenn es keine unendliche absteigende Kette x₁ > x₂ > x₃ > … gibt. Das Wohlgegründet-Induktionsprinzip: Sei M eine Menge mit wohlgegründeter Relation <. Wenn gilt: Für alle x ∈ M: (Falls P(y) für alle y < x, dann P(x)) — dann gilt P(x) für alle x ∈ M. Beispiele wohlgegründeter Relationen: ℕ mit <, Teilmengen-Relation auf endlichen Mengen, Teilwortrelation.",
        difficulty = 5
    ),

    // Question 25
    Question(
        categoryId = 12,
        questionText = "Was ist die 'Normalform' eines rekursiven Programms gemäß dem Kleene-Normalform-Theorem?",
        answerA = "Jedes rekursive Programm kann auf Tail-Rekursion reduziert werden",
        answerB = "Jede partiell rekursive Funktion φ_e(x) kann als φ_e(x) = U(μy T(e, x, y)) geschrieben werden — mit T (Kleene-T-Prädikat, primitiv rekursiv) und U (Auslesefunktion, primitiv rekursiv)",
        answerC = "Jede berechenbare Funktion hat eine eindeutige kanonische Darstellung",
        answerD = "Jede Turingmaschine kann auf eine mit genau 2 Zuständen reduziert werden",
        correctAnswer = 1,
        explanation = "Kleenes Normalform-Theorem (1943): Jede partiell rekursive Funktion φ_e(x) kann durch eine einzige Anwendung des μ-Operators dargestellt werden: φ_e(x) = U(μy T(e, x, y)). Dabei ist T(e, x, y) ein primitiv-rekursives Prädikat: 'y kodiert eine haltende Berechnung der Maschine e auf Eingabe x'. U ist primitiv-rekursiv und extrahiert das Ergebnis aus der Berechnung y. Das Theorem zeigt: Alle Berechnungskomplexität steckt in einem einzigen μ-Operator.",
        difficulty = 5,
        funFact = "Das Kleene-T-Prädikat ist so wichtig, dass die gesamte arithmetische Hierarchie in seiner Formulierung verwendet wird: Σ₁⁰-Aussagen haben die Form ∃y T(e, x, y), Π₁⁰ haben die Form ∀y ¬T(e, x, y)."
    ),

    // Question 26
    Question(
        categoryId = 12,
        questionText = "Welche Aussage über die Wohlordnung der natürlichen Zahlen und die vollständige Induktion ist korrekt?",
        answerA = "Vollständige Induktion impliziert das Wohlordnungsprinzip, aber nicht umgekehrt",
        answerB = "Vollständige Induktion und das Wohlordnungsprinzip für ℕ sind logisch äquivalent — jedes lässt sich aus dem anderen ableiten",
        answerC = "Das Wohlordnungsprinzip ist schwächer als die vollständige Induktion",
        answerD = "Beide sind unabhängige Axiome und können nicht auseinander abgeleitet werden",
        correctAnswer = 1,
        explanation = "Vollständige Induktion (VI) und das Wohlordnungsprinzip (WO) für ℕ sind äquivalent: VI → WO: Angenommen, M ⊆ ℕ ist nichtleer ohne kleinstes Element. Dann gilt per VI: Für alle n, wenn alle k < n nicht in M liegen, liegt n nicht in M. Also: kein n liegt in M — Widerspruch. WO → VI: Angenommen, P(0) gilt und P(n)→P(n+1), aber P gilt nicht für alle n. Dann hat M = {n | ¬P(n)} ein kleinstes Element n₀. Da P(n₀−1) gilt (Minimalität), folgt P(n₀) — Widerspruch.",
        difficulty = 5
    ),

    // Question 27
    Question(
        categoryId = 12,
        questionText = "Was ist der 'unendliche Abstieg' (Fermatsches Abstiegsverfahren) als Beweismethode?",
        answerA = "Ein iteratives Verfahren zur Approximation von Nullstellen",
        answerB = "Ein Widerspruchsbeweis: Man zeigt, dass ein hypothetisches Gegenbeispiel ein noch kleineres Gegenbeispiel impliziert — was aufgrund der Wohlordnung von ℕ zu einem Widerspruch führt",
        answerC = "Eine Variante der vollständigen Induktion für negative ganze Zahlen",
        answerD = "Eine Methode zur Konstruktion rekursiver Funktionen aus primitiv-rekursiven",
        correctAnswer = 1,
        explanation = "Fermat erfand die Methode des unendlichen Abstiegs (descente infinie) im 17. Jahrhundert. Prinzip: Angenommen, es gibt ein Gegenbeispiel zur Aussage P. Dann konstruiert man ein Gegenbeispiel mit kleinerer Zahl — aber das ergibt wieder ein Gegenbeispiel mit noch kleinerer Zahl, und so fort. Da ℕ wohlgeordnet ist, gibt es keine unendliche absteigende Kette — Widerspruch. Fermat verwendete diese Methode z.B. um zu beweisen: x⁴ + y⁴ = z⁴ hat keine ganzzahligen Lösungen.",
        difficulty = 5,
        funFact = "Fermats Beweismethode des unendlichen Abstiegs ist einer der elegantesten Beweise in der Zahlentheorie. Andrew Wiles' Beweis von Fermats Letztem Satz (1995) für n > 2 ist einer der komplexesten Beweise der Mathematikgeschichte — über 150 Seiten."
    ),

    // Question 28
    Question(
        categoryId = 12,
        questionText = "Was ist der Fixpunktsatz von Brouwer und auf welche Mengen gilt er?",
        answerA = "Jede stetige Funktion auf einem vollständigen metrischen Raum hat einen Fixpunkt",
        answerB = "Jede stetige Funktion f: Dⁿ → Dⁿ von der n-dimensionalen Scheibe in sich hat mindestens einen Fixpunkt x mit f(x) = x",
        answerC = "Jede differenzierbare Funktion auf einer konvexen Menge hat einen Fixpunkt",
        answerD = "Jede bijektive stetige Abbildung eines kompakten Raumes auf sich hat einen Fixpunkt",
        correctAnswer = 1,
        explanation = "Brouwers Fixpunktsatz (1910): Jede stetige Funktion f: Dⁿ → Dⁿ von der abgeschlossenen n-dimensionalen Einheitskugel (Scheibe) in sich hat mindestens einen Fixpunkt. Für n = 1: Jede stetige Funktion f: [0,1] → [0,1] hat einen Fixpunkt (folgt aus dem Zwischenwertsatz). Anschaulich: Wenn man eine Karte einer Region auf die Region legt, gibt es einen Punkt, der genau über seinem realen Gegenstück liegt. Im Gegensatz zum Banachschen Satz liefert Brouwer keine Eindeutigkeit und kein Iterationsverfahren.",
        difficulty = 5
    ),

    // Question 29
    Question(
        categoryId = 12,
        questionText = "Was bedeutet 'Rekursion über eine wohlgegründete Relation' und wie garantiert sie Terminierung?",
        answerA = "Die Terminierung wird durch die Angabe einer oberen Schranke garantiert",
        answerB = "Eine Funktion f ist per Rekursion über < definiert, wenn f(x) nur Werte f(y) mit y < x verwendet — da < wohlgegründet ist, gibt es keine unendliche Abstiegskette, also terminiert jeder Aufruf",
        answerC = "Wohlgegründete Rekursion erfordert immer ein explizites Maß (natural number argument)",
        answerD = "Terminierung wird durch einen Typchecker automatisch verifiziert",
        correctAnswer = 1,
        explanation = "Bei Rekursion über eine wohlgegründete Relation < auf einer Menge M gilt: Jeder Aufruf f(x) ruft nur f(y) für y < x auf. Da < wohlgegründet ist (keine unendlichen Abstiegsketten), terminiert jede Aufrufkette nach endlich vielen Schritten. In Beweisassistenten wie Coq und Agda wird Terminierung durch Strukturprüfung oder Maßfunktionen verifiziert. Praxis: Man muss eine Maßfunktion m: M → ℕ angeben, die bei jedem rekursiven Aufruf streng kleiner wird.",
        difficulty = 5
    ),

    // Question 30
    Question(
        categoryId = 12,
        questionText = "Was besagt die 'Methode der Invarianten' als Beweistechnik für Algorithmen und rekursive Programme?",
        answerA = "Sie zeigt die Korrektheit eines Algorithmus durch vollständige Erschöpfung aller Fälle",
        answerB = "Man identifiziert eine Schleifeninvariante P, beweist P vor der Schleife, P ⊗ Schleifenkörper ⊢ P (Erhaltung), und schließt bei Terminierung auf das gewünschte Nachbedingung",
        answerC = "Sie beweist die Laufzeit eines Algorithmus durch amortisierte Analyse",
        answerD = "Sie ist äquivalent zur vollständigen Induktion, aber nur für imperative Programme anwendbar",
        correctAnswer = 1,
        explanation = "Hoare-Logik (1969) formalisiert die Invariantenmethode: Ein Hoare-Tripel {P} S {Q} bedeutet: Wenn P vor der Ausführung von S gilt und S terminiert, gilt Q danach. Für Schleifen while B do S: (1) P gilt vor der Schleife. (2) {P ∧ B} S {P} — die Invariante bleibt erhalten. (3) Am Ende gilt P ∧ ¬B — zusammen ergibt das die Nachbedingung. Die Invariante ist das Herzstück: Sie muss stark genug sein, um Q zu implizieren, und schwach genug, um beweisbar zu sein.",
        difficulty = 5,
        funFact = "Tony Hoare erhielt 1980 den Turing-Preis. Seine Hoare-Logik ist die Grundlage moderner Verifikationswerkzeuge wie Coq, Isabelle/HOL und F*. Dijkstras 'Weakest Precondition'-Kalkül ist eine verwandte, systematischere Formulierung."
    ),

    // Question 31
    Question(
        categoryId = 12,
        questionText = "Was ist 'coinduktive Definition' und welche Art von Objekten definiert sie, im Gegensatz zur induktiven Definition?",
        answerA = "Coinduktion definiert endliche Objekte durch ihre Konstruktoren",
        answerB = "Coinduktion definiert potentiell unendliche Objekte (z.B. unendliche Ströme, Bisimulation) durch Beobachter (Destruktoren) statt durch Konstruktoren — der größte Fixpunkt statt des kleinsten",
        answerC = "Coinduktion ist Induktion für konjunktive Formeln",
        answerD = "Coinduktion definiert Mengen durch ihre Teilmengen",
        correctAnswer = 1,
        explanation = "Induktion definiert das kleinste Fixpunkt einer Funktion — endliche Objekte. Coinduktion definiert den größten Fixpunkt — potenziell unendliche Objekte. Beispiel: Die Menge aller unendlichen Binärströme ist coinduktiv definiert: Ein Strom s hat einen Kopf (head(s)) und einen Schwanz (tail(s), wieder ein Strom). Bisimulation ist ein coinduktiver Begriff: Zwei Prozesse sind bisimilar, wenn sie für immer gleiche Beobachtungen machen. Der Knaster-Tarski-Satz garantiert Existenz beider Fixpunkte.",
        difficulty = 5
    ),

    // Question 32
    Question(
        categoryId = 12,
        questionText = "Was beweist Cantors Theorem über die Mächtigkeit einer Menge und ihrer Potenzmenge?",
        answerA = "|M| = |P(M)| für alle unendlichen Mengen M",
        answerB = "|M| < |P(M)| für alle Mengen M — die Potenzmenge ist immer echt mächtiger als die Menge selbst",
        answerC = "|P(ℕ)| = |ℕ| (beide abzählbar unendlich)",
        answerD = "Jede Menge hat eine Potenzmenge, die wohlgeordnet werden kann",
        correctAnswer = 1,
        explanation = "Cantors Theorem: Für jede Menge M gilt |M| < |P(M)|. Beweis: Es gibt eine injektive Abbildung M → P(M) (x ↦ {x}). Angenommen, es gibt eine surjektive Abbildung f: M → P(M). Definiere D = {x ∈ M | x ∉ f(x)}. D ist eine Teilmenge von M, also D ∈ P(M). Da f surjektiv ist, gibt es d mit f(d) = D. Ist d ∈ D? Wenn ja: d ∉ f(d) = D — Widerspruch. Wenn nein: d ∈ f(d) = D — Widerspruch. Also existiert kein surjektives f.",
        difficulty = 5,
        funFact = "Cantors Theorem erzeugt eine unendliche Hierarchie von Unendlichkeiten: |ℕ| < |P(ℕ)| < |P(P(ℕ))| < … Die Kontinuumshypothese fragt: Gibt es eine Menge M mit |ℕ| < |M| < |P(ℕ)|? Cohen und Gödel zeigten: Dies ist unabhängig von ZFC."
    ),

    // Question 33
    Question(
        categoryId = 12,
        questionText = "Was ist ein 'induktiver Beweis der Korrektheit' einer Sortieralgorithmus und welche zwei Eigenschaften werden dabei bewiesen?",
        answerA = "Laufzeit und Speicherverbrauch",
        answerB = "Partielle Korrektheit (wenn der Algorithmus terminiert, ist das Ergebnis richtig) und totale Korrektheit (der Algorithmus terminiert immer AND das Ergebnis ist richtig)",
        answerC = "Stabilität und Adaptivität",
        answerD = "Vergleichsoptimalität und Rekursionstiefe",
        correctAnswer = 1,
        explanation = "Totale Korrektheit = partielle Korrektheit + Terminierung. Partielle Korrektheit: Wenn Insertion-Sort terminiert, ist die Ausgabe eine sortierte Permutation der Eingabe. Beweis durch Schleifeninvariante: Nach j Iterationen ist das Teilarray A[1..j] sortiert. Terminierung: Das Hauptarray wird in n−1 Schritten verkleinert (absteigende Maßfunktion). Erst die Kombination beider Beweise ergibt totale Korrektheit — ein klassischer induktiver Beweis.",
        difficulty = 5
    ),

    // Question 34
    Question(
        categoryId = 12,
        questionText = "Was versteht man unter 'Epsilonisierung' in einem Induktionsbeweis und wann ist sie notwendig?",
        answerA = "Die Einführung einer kleinen Fehlerschranke ε > 0 in Analysis-Beweise",
        answerB = "Die Verstärkung der Induktionshypothese durch eine zusätzliche, präzisere Aussage P'(n), da die ursprüngliche P(n) zu schwach ist, um den Induktionsschritt durchzuführen",
        answerC = "Die Reduktion eines Beweises auf den Spezialfall ε = 0",
        answerD = "Die Einführung von Quantoren in induktive Definitionen",
        correctAnswer = 1,
        explanation = "Manchmal schlägt ein Induktionsbeweis fehl, weil die Induktionshypothese zu schwach ist — man kann P(n) nicht nutzen, um P(n+1) zu beweisen. Die Lösung: Verstärke die Hypothese zu P'(n), die stärker als P(n) ist, sodass der Induktionsschritt P'(n) → P'(n+1) durchgeführt werden kann, und P'(n) → P(n). Klassisches Beispiel: Beim Beweis der Effizienz eines Algorithmus beweist man nicht nur 'terminiert in Zeit T(n)', sondern 'terminiert in Zeit T(n) UND liefert eine optimale Lösung'.",
        difficulty = 5,
        funFact = "Die Technik der Hypothesenverstärkung ist eines der wichtigsten Werkzeuge in Beweisen. Ein zu schwaches Induktionsargument — oft als 'das Pferd von hinten aufzäumen' bezeichnet — ist der häufigste Fehler bei Induktionsbeweisen in der Informatik."
    ),

    // Question 35
    Question(
        categoryId = 12,
        questionText = "Was ist der 'Fixpunktsatz von Lawvere' in der Kategorientheorie und welche klassischen Resultate umfasst er?",
        answerA = "Er beschreibt die Existenz von Adjunktionen zwischen Kategorien",
        answerB = "In einer kartesisch abgeschlossenen Kategorie mit einem Punkt-Surjektionssatz: Jede Endomorphismus-Funktion hat einen Fixpunkt — verallgemeinert Cantors Diagonalargument, Gödels Unvollständigkeit und Turings Halteproblem",
        answerC = "Er beweist die Existenz von terminalen Objekten in Topoi",
        answerD = "Er ist eine kategorielle Formulierung des Banachschen Fixpunktsatzes",
        correctAnswer = 1,
        explanation = "Lawveres Fixpunktsatz (1969): In einer kartesisch abgeschlossenen Kategorie gilt: Wenn es eine 'point-surjective' Abbildung φ: A → Bᴬ gibt, dann hat jede f: B → B einen Fixpunkt. Dieser abstrakte Satz umfasst als Spezialfälle: (1) Cantors Theorem (keine Surjektion A → 2ᴬ), (2) Gödels Unvollständigkeit (Selbstreferenz via Arithmetisierung), (3) Turings Halteproblem, (4) Russells Paradox. Sie sind alle Instanzen des gleichen diagonalen Argumentationsmusters.",
        difficulty = 5
    ),

    // Question 36
    Question(
        categoryId = 12,
        questionText = "Was ist 'strukturelle Rekursion auf Bäumen' und wie unterscheidet sich der Beweis ihrer Korrektheit von der Induktion über ℕ?",
        answerA = "Strukturelle Rekursion auf Bäumen ist auf Binärbäume beschränkt",
        answerB = "Man definiert f auf Bäumen durch: f(Blatt) = Basisfall, f(Knoten(l, r)) = Kombination aus f(l) und f(r); der Korrektheitsbeweis folgt durch strukturelle Induktion, wobei der Schritt nicht +1 auf ℕ, sondern das Hinzufügen eines Knotens zu Teilbäumen entspricht",
        answerC = "Strukturelle Rekursion auf Bäumen erfordert das Auswahlaxiom für ungeordnete Bäume",
        answerD = "Der Beweis ist identisch mit Induktion über die Tiefe des Baums",
        correctAnswer = 1,
        explanation = "Strukturelle Rekursion auf Bäumen: f(Leaf) = e (Basiselement), f(Node(v, l, r)) = op(v, f(l), f(r)). Korrektheitsbeweis durch strukturelle Induktion: Basis — f(Leaf) ist korrekt per Definition. Schritt — Wenn f(l) und f(r) korrekt sind (Induktionshypothese für die Teilbäume), dann ist f(Node(v, l, r)) = op(v, f(l), f(r)) korrekt. Die Relation 'ist echter Teilbaum' ist wohlgegründet — dies garantiert die Terminierung der Rekursion und die Gültigkeit des Induktionsprinzips.",
        difficulty = 5
    ),

    // Question 37
    Question(
        categoryId = 12,
        questionText = "Welche Form hat die 'Master-Theorem' für die Analyse von Divide-and-Conquer-Rekurrenzen T(n) = a·T(n/b) + f(n)?",
        answerA = "T(n) = O(n log n) für alle Rekurrenzen",
        answerB = "Fall 1: f(n) = O(n^{log_b(a)−ε}) → T(n) = Θ(n^{log_b a}); Fall 2: f(n) = Θ(n^{log_b a}) → T(n) = Θ(n^{log_b a} · log n); Fall 3: f(n) = Ω(n^{log_b(a)+ε}) und Regularität → T(n) = Θ(f(n))",
        answerC = "T(n) = T(n/b) + Θ(n) → T(n) = Θ(n) immer",
        answerD = "Das Master-Theorem gilt nur für T(n) = 2T(n/2) + f(n)",
        correctAnswer = 1,
        explanation = "Das Master-Theorem (Cormen et al.) für T(n) = a·T(n/b) + f(n) mit a ≥ 1, b > 1: Vergleiche f(n) mit n^{log_b(a)} (dem 'kritischen Exponent'). Fall 1: f(n) polynomiell kleiner → Rekursionsbaum dominiert: T(n) = Θ(n^{log_b a}). Fall 2: Gleich groß → T(n) = Θ(n^{log_b a} · log n). Fall 3: f(n) polynomiell größer (mit Regularitätsbedingung) → Wurzel dominiert: T(n) = Θ(f(n)). Mergesort: T(n) = 2T(n/2)+Θ(n), Fall 2: T(n) = Θ(n log n).",
        difficulty = 5,
        funFact = "Das Master-Theorem beweist man durch vollständige Induktion über die Rekursionstiefe. Die Kernidee: Man betrachtet den Rekursionsbaum, zählt die Arbeit auf jeder Ebene und summiert geometrisch. Die drei Fälle entsprechen geometrischer Divergenz, Gleichgewicht und Konvergenz."
    ),

    // Question 38
    Question(
        categoryId = 12,
        questionText = "Was ist die 'Akkumulator-Technik' bei der Tail-Rekursion und wie verändert sie den Induktionsbeweis der Korrektheit?",
        answerA = "Sie beschleunigt die Rekursion durch Memoisierung",
        answerB = "Man führt einen Akkumulator-Parameter ein, der das bisherige Teilergebnis mitführt; die Induktionshypothese muss die Akkumulator-Invariante enthalten: 'f(n, acc) = acc * f_orig(n)'",
        answerC = "Die Akkumulator-Technik vermeidet die Notwendigkeit eines Induktionsbeweises",
        answerD = "Sie konvertiert Tail-Rekursion in Kopf-Rekursion",
        correctAnswer = 1,
        explanation = "Tail-rekursive Fakultät: fact_acc(n, acc) = if n=0 then acc else fact_acc(n−1, n*acc). Korrektheitsbeweis: Induktionshypothese muss die Invariante erfassen: 'fact_acc(n, acc) = acc * n!'. Basis: fact_acc(0, acc) = acc = acc * 0! ✓. Schritt: fact_acc(n+1, acc) = fact_acc(n, (n+1)*acc) = (n+1)*acc * n! = acc * (n+1)! ✓. Die ursprüngliche Invariante fact(n) = fact_acc(n, 1) = 1 * n! = n! folgt als Spezialfall.",
        difficulty = 5
    ),

    // Question 39
    Question(
        categoryId = 12,
        questionText = "Was ist das 'Prinzip der Noether-Induktion' in der abstrakten Algebra?",
        answerA = "Eine Induktion über die Ordnung einer endlichen Gruppe",
        answerB = "In einem Noetherschen Verband (kein unendlich aufsteigendes Kettenaxiom verletzt) gilt: Wenn eine Aussage für alle echten Teilobjekte eines Objekts M gilt, gilt sie auch für M — dies entspricht Induktion über aufsteigende Ketten",
        answerC = "Eine Variante der transfiniten Induktion für Ordinalzahlen",
        answerD = "Ein Beweisprinzip für Aussagen über noethersche Ringe",
        correctAnswer = 1,
        explanation = "Noether-Induktion (auch Noethersches Induktionsprinzip): In einem Noetherschen Verband L (jede aufsteigende Kette a₁ ≤ a₂ ≤ … stabilisiert) gilt: Wenn für jedes Element a ∈ L gilt: 'Wenn P(b) für alle echten b < a gilt, dann gilt P(a)' — dann gilt P(a) für alle a ∈ L. Anwendung: Induktion über Ideale in Noetherschen Ringen, über Teilmodule in Noetherschen Moduln. Dies entspricht wohlgegründeter Induktion für die umgekehrte Ordnung.",
        difficulty = 5
    ),

    // Question 40
    Question(
        categoryId = 12,
        questionText = "Was ist der 'Park-Fixpunktsatz' (Park Induction) in der Semantik von Programmiersprachen?",
        answerA = "Er besagt, dass alle Programme einen kleinsten Fixpunkt haben",
        answerB = "Das kleinste Fixpunkt lfp(f) eines monotonen Operators f ist der kleinste prefixpunkt: f(P) ⊆ P impliziert lfp(f) ⊆ P — dies ist das Induktionsprinzip für kleinste Fixpunkte",
        answerC = "Er garantiert die Existenz eines größten Fixpunkts für co-induktive Definitionen",
        answerD = "Er ist eine Verallgemeinerung des Banachschen Fixpunktsatzes auf Verbände",
        correctAnswer = 1,
        explanation = "Park-Induktion (David Park, 1969): Sei f: L → L monoton auf einem vollständigen Verband L, und sei lfp(f) der kleinste Fixpunkt. Dann gilt: Um P ⊆ lfp(f) zu beweisen, genügt es, P als Fixpunkt oder Präfixpunkt zu zeigen. Umgekehrt gilt: lfp(f) ⊆ P, wenn P ein Präfixpunkt ist (f(P) ⊆ P). Dies ist das Induktionsprinzip für kleinste Fixpunkte: Man beweist eine Eigenschaft P über lfp(f), indem man zeigt, dass P unter f abgeschlossen ist. Dual: Für gfp(f) gilt gfp(f) ⊆ P, wenn P ein Postfixpunkt ist.",
        difficulty = 5,
        funFact = "Park-Induktion ist die Grundlage für das Beweisen von Eigenschaften rekursiver Programme. In der Bisimulationstheorie entspricht Coinduktion genau der Park-Coinduktion: Um zwei Prozesse als bisimilar zu zeigen, reicht es, eine Bisimulationsrelation B zu finden mit B ⊆ gfp(Bisim)."
    ),

    // Question 41
    Question(
        categoryId = 12,
        questionText = "Welche mathematische Aussage beschreibt den Unterschied zwischen Vollständigkeit und Kategorisierung einer Theorie?",
        answerA = "Eine vollständige Theorie ist immer kategorisch",
        answerB = "Vollständigkeit: Jede Aussage ist beweisbar oder widerlegbar. Kategorisierung: Alle Modelle sind isomorph. Vollständige Theorien müssen nicht kategorisch sein (z.B. Th(ℕ) komplex, aber vollständig), und kategorische Theorien können vollständig sein (Vaught-Satz: Eine abzählbare kategorische Theorie ohne endliche Modelle ist vollständig)",
        answerC = "Kategorisierung impliziert Vollständigkeit und umgekehrt",
        answerD = "Beide Begriffe sind synonyme Formulierungen derselben Eigenschaft",
        correctAnswer = 1,
        explanation = "Vollständigkeit einer Theorie T: Für jede Aussage φ gilt T ⊢ φ oder T ⊢ ¬φ. Kategorisierung (Kategoricity): Alle Modelle einer Kardinalität κ sind isomorph (κ-kategorisch). Vaughts Satz: Eine abzählbare konsistente Theorie T ohne endliche Modelle, die ℵ₀-kategorisch ist, ist vollständig. Gegenbeispiel: Th(ℕ) ist vollständig (alle wahren arithmetischen Aussagen entschieden), aber hat nicht-isomorphe Modelle (Nicht-Standard-Modelle). DLO (dichte lineare Ordnung ohne Endpunkte) ist ℵ₀-kategorisch und vollständig.",
        difficulty = 5
    ),

    // Question 42
    Question(
        categoryId = 12,
        questionText = "Was ist die 'Curry-Howard-Korrespondenz' für den Induktionsbeweis und den rekursiven Typ?",
        answerA = "Induktive Beweise entsprechen iterativen Algorithmen",
        answerB = "Das Induktionsprinzip für natürliche Zahlen (∀P: P(0) → (∀n: P(n)→P(n+1)) → ∀n: P(n)) entspricht dem Eliminationstyp für ℕ (Rekursor): rec: P(0) → (∀n: P(n)→P(n+1)) → ∀n: P(n)",
        answerC = "Induktion entspricht Tail-Rekursion, Koinduktion entspricht Kopf-Rekursion",
        answerD = "Beweise durch Widerspruch entsprechen Ausnahmebehandlung",
        correctAnswer = 1,
        explanation = "Die Curry-Howard-Korrespondenz verbindet: Typen ↔ Aussagen, Terme ↔ Beweise, Typencheck ↔ Beweischeck. Für natürliche Zahlen: Das Induktionsprinzip ist genau der Rekursor (Eliminationsregel für ℕ). Ein Induktionsbeweis von P(n) für alle n ist ein Programm vom Typ ∀n: P(n) — eine Funktion, die für jedes n einen Beweis von P(n) liefert. In Coq schreibt man: Lemma (rec n : ℕ) : P n := match n with | 0 => base | S m => step m (rec m) end.",
        difficulty = 5
    ),

    // Question 43
    Question(
        categoryId = 12,
        questionText = "Was ist das 'Schubfachprinzip' (Dirichlet'sches Schubfachprinzip) und wie wird es formal bewiesen?",
        answerA = "Wenn n Objekte auf m Schubfächer verteilt werden, ist mindestens ein Schubfach leer",
        answerB = "Wenn n > m Objekte auf m Schubfächer verteilt werden, enthält mindestens ein Schubfach mindestens ⌈n/m⌉ Objekte — Beweis durch Widerspruch und das Wohlordnungsprinzip",
        answerC = "Es ist ein Spezialfall des Fixpunktsatzes von Brouwer für diskrete Räume",
        answerD = "Es gilt nur für n = m + 1 (genau ein Objekt mehr als Schubfächer)",
        correctAnswer = 1,
        explanation = "Schubfachprinzip: n Objekte, m Schubfächer, n > m → ∃ Schubfach mit ≥ ⌈n/m⌉ Objekten. Beweis durch Widerspruch: Angenommen, jedes Schubfach enthält ≤ ⌈n/m⌉ − 1 < n/m Objekte. Dann ist die Gesamtanzahl ≤ m · (n/m − ε) < n für kleines ε — Widerspruch zu n Objekten. Formaler Beweis der Gesamtaussage durch vollständige Induktion über n und m. Anwendungen: Unendlich viele Primzahlen, Existenz von Wiederholungen in Sequenzen, Güte von Hashing.",
        difficulty = 5,
        funFact = "Das Schubfachprinzip ist eines der elegantesten Werkzeuge der kombinatorischen Mathematik. Erdős nutzte es extensiv in der Ramsey-Theorie. Die Aussage 'In einer Gruppe von 13 Personen haben zwei denselben Geburtsmonat' ist eine direkte Anwendung."
    ),

    // Question 44
    Question(
        categoryId = 12,
        questionText = "Was ist die 'Methode der beschleunigten Iteration' (Kleene-Fixpunkt-Iteration) und warum konvergiert sie zum kleinsten Fixpunkt?",
        answerA = "Sie konvergiert zum größten Fixpunkt durch absteigende Iteration",
        answerB = "Starte mit ⊥ (kleinstes Element), iteriere f(⊥), f(f(⊥)), … Die aufsteigende Kette ⊥ ≤ f(⊥) ≤ f²(⊥) ≤ … konvergiert zum kleinsten Fixpunkt, weil f monoton ist und der Verband die aufsteigende Kettenbedingung erfüllt",
        answerC = "Sie gilt nur für stetige Funktionen, nicht für monotone",
        answerD = "Die Iteration kann nicht terminieren, wenn der Verband überabzählbar ist",
        correctAnswer = 1,
        explanation = "Kleenes Fixpunkt-Theorem für vollständige partielle Ordnungen (CPOs): Sei f: D → D stetig (erhält Suprema aufsteigender Ketten), D ein CPO mit kleinstem Element ⊥. Dann gilt: Die Kette ⊥ ≤ f(⊥) ≤ f²(⊥) ≤ … hat ein Supremum ⊔_n f^n(⊥) = lfp(f). Beweis: Monotonie von f garantiert aufsteigende Kette; Stetigkeit garantiert f(⊔...) = ⊔f(...)= ⊔...; da ⊥ kleinstes Element ist, ist lfp(f) das globale Minimum unter allen Fixpunkten.",
        difficulty = 5
    ),

    // Question 45
    Question(
        categoryId = 12,
        questionText = "Was ist ein 'nicht-konstruktiver Beweis' und welches berühmte Beispiel zeigt seine Existenz ohne Konstruktion?",
        answerA = "Ein Beweis, der keine Maschine beschreibt",
        answerB = "Ein Beweis, der die Existenz eines Objekts zeigt, ohne es explizit zu konstruieren — Beispiel: Brouwers Fixpunktsatz beweist Existenz eines Fixpunkts ohne ihn zu berechnen; oder: 'Unter allen Wörtern aus {a,b}* die eine bestimmte Eigenschaft haben, gibt es eines mit minimaler Länge' (via Wohlordnung, ohne explizite Angabe)",
        answerC = "Ein Beweis durch Induktion ohne Angabe der Induktionsbasis",
        answerD = "Ein Beweis, der das Auswahlaxiom nicht verwendet",
        correctAnswer = 1,
        explanation = "Nicht-konstruktive Beweise zeigen Existenz ohne explizite Angabe. Klassisches Beispiel: Es gibt irrationale Zahlen x, y, sodass xʸ rational ist. Beweis: Sei x = y = √2. Dann ist xʸ = √2^√2 entweder rational (fertig) oder irrational. Im zweiten Fall: Sei x' = √2^√2, y' = √2. Dann x'^y' = (√2^√2)^√2 = √2^(√2·√2) = √2² = 2 rational. Einer der beiden Fälle gilt — aber ohne Computation bleibt offen, welcher. (√2^√2 ist tatsächlich irrational — Gelfond-Schneider-Theorem.)",
        difficulty = 5,
        funFact = "Konstruktive Mathematik (Intuitionism, Brouwer) akzeptiert nicht-konstruktive Beweise nicht als gültig. In der konstruktiven Logik gilt: Ein Beweis von ∃x P(x) muss ein explizites x mit P(x) liefern. Das Auswahlaxiom und das Gesetz des ausgeschlossenen Dritten sind in der intuitionistischen Logik nicht allgemein gültig."
    ),

    // Question 46
    Question(
        categoryId = 12,
        questionText = "Was ist die 'Substitutionsmethode' zur Lösung von Rekurrenzgleichungen und wie wird die Korrektheit der Schätzung bewiesen?",
        answerA = "Man löst die Rekurrenz durch Bildung der erzeugenden Funktion",
        answerB = "Man rät eine Lösung T(n) = O(f(n)), setzt sie in die Rekurrenz ein und beweist durch Induktion, dass T(n) ≤ c·f(n) für geeignetes c und hinreichend großes n",
        answerC = "Man substitutiert n = 2^k zur Linearisierung der Rekurrenz",
        answerD = "Die Substitutionsmethode gilt nur für ganzzahlige Rekurrenzen",
        correctAnswer = 1,
        explanation = "Substitutionsmethode (Cormen et al.): (1) Rate T(n) = O(f(n)). (2) Beweise durch starke Induktion: Angenommen, T(k) ≤ c·f(k) für alle k < n. Zeige T(n) ≤ c·f(n). Beispiel: T(n) = 2T(n/2) + n, Rate T(n) = O(n log n). Induktionsschritt: T(n) = 2T(n/2) + n ≤ 2·c·(n/2)·log(n/2) + n = c·n·(log n − 1) + n = c·n·log n − (c−1)·n ≤ c·n·log n für c ≥ 1. Induktionsbasis: T(1) = 1 ≤ c·1·log 1 — aber log 1 = 0! Trick: Passe Basis an T(2) oder wähle f(n) = n(log n + 1).",
        difficulty = 5
    ),

    // Question 47
    Question(
        categoryId = 12,
        questionText = "Was ist das 'Well-Founded Recursion Theorem' und welche Garantie gibt es für Definitionen durch transfinite Rekursion?",
        answerA = "Es garantiert Terminierung aller Programme auf wohlgeordneten Eingaben",
        answerB = "Zu einer wohlgegründeten Relation < auf M und einer 'Schritt-Funktion' F, die f(x) aus {f(y) | y < x} berechnet, existiert genau eine Funktion f: M → V, die für alle x ∈ M die Gleichung f(x) = F(x, f↾{y|y<x}) erfüllt",
        answerC = "Es garantiert, dass jede wohlgegründete Relation eine Wohlordnung ist",
        answerD = "Es ist eine Verschärfung des Rekursionstheorems für Ordinalzahlen",
        correctAnswer = 1,
        explanation = "Das Wohlgegründete-Rekursions-Theorem: Sei (M, <) wohlgegründet und F eine Klassen-Funktion, die für jede Funktion g: {y ∈ M | y < x} → V einen Wert F(x, g) ∈ V liefert. Dann existiert genau eine Funktion f: M → V mit f(x) = F(x, f↾{y<x}) für alle x ∈ M. Beweis durch Induktion über <: Eindeutigkeit — zwei Funktionen f, g müssen auf einem wohlgegründeten Counterbeispiel (kleinstes Unterscheidungselement) übereinstimmen. Existenz — iterative Konstruktion entlang der Ordnung.",
        difficulty = 5
    ),

    // Question 48
    Question(
        categoryId = 12,
        questionText = "Was beweist das 'Sandwich-Theorem' (Squeeze-Theorem) in der Analysis und welche Beweismethode liegt ihm zugrunde?",
        answerA = "Es beweist die Existenz von Grenzwerten durch das Auswahlaxiom",
        answerB = "Wenn g(n) ≤ f(n) ≤ h(n) für alle n und lim g(n) = lim h(n) = L, dann gilt auch lim f(n) = L — Beweis direkt aus der ε-Definition des Grenzwerts",
        answerC = "Es ist ein Induktionsbeweis über die Anzahl der Folgenglieder",
        answerD = "Es gilt nur für monotone Folgen",
        correctAnswer = 1,
        explanation = "Sandwich-Theorem (Einschnürungssatz): Sei g(n) ≤ f(n) ≤ h(n) für alle n ≥ n₀, lim_{n→∞} g(n) = L und lim_{n→∞} h(n) = L. Dann: lim f(n) = L. Beweis direkt: Zu ε > 0 wähle N so, dass |g(n) − L| < ε und |h(n) − L| < ε für n ≥ N. Dann: L − ε < g(n) ≤ f(n) ≤ h(n) < L + ε, also |f(n) − L| < ε. Induktive Struktur: Man zeigt eine Eigenschaft für alle n ≥ N gleichzeitig, nicht sukzessive.",
        difficulty = 5
    ),

    // Question 49
    Question(
        categoryId = 12,
        questionText = "Was ist die 'Methode der erzeugenden Funktionen' für rekurrente Folgen und welche algebraische Struktur nutzt sie?",
        answerA = "Sie transformiert die Rekurrenz in eine Differentialgleichung",
        answerB = "Die erzeugende Funktion G(x) = Σ a_n x^n verwandelt die Rekurrenzgleichung in eine algebraische Gleichung für G(x); durch Partialbruchzerlegung und Koeffizientenvergleich erhält man eine geschlossene Formel für a_n",
        answerC = "Sie nutzt die Fourier-Transformation zur Lösung",
        answerD = "Sie gilt nur für lineare Rekurrenzen ohne Anfangswerte",
        correctAnswer = 1,
        explanation = "Für die Fibonacci-Folge: G(x) = Σ F_n x^n. Die Rekurrenz F_n = F_{n-1} + F_{n-2} wird zu: G(x) = x·G(x) + x²·G(x) + x (Anfangswerte). Also G(x) = x/(1 − x − x²). Partialbruchzerlegung: G(x) = A/(1−φx) + B/(1−ψx). Koeffizientenvergleich: F_n = A·φ^n + B·ψ^n = (φ^n − ψ^n)/√5 (Binet-Formel). Die algebraische Struktur: formale Potenzreihen über ℝ bilden einen Ring; die Rekurrenz wird zur polynomiellen Gleichung im Ring der Potenzreihen.",
        difficulty = 5,
        funFact = "Erzeugende Funktionen sind eines der mächtigsten Werkzeuge der Kombinatorik (Herbert Wilf: 'Generatingfunctionology'). Die exponentiellen erzeugenden Funktionen G(x) = Σ a_n x^n/n! eignen sich für Abzählprobleme mit Permutationen."
    ),

    // Question 50
    Question(
        categoryId = 12,
        questionText = "Was ist die tiefste Gemeinsamkeit von vollständiger Induktion, transfiniter Induktion, struktureller Induktion und wohlgegründeter Induktion?",
        answerA = "Sie alle erfordern das Auswahlaxiom der Mengenlehre",
        answerB = "Alle sind Instanzen des gleichen abstrakten Prinzips: Auf einer wohlgegründeten geordneten Menge gilt P für alle Elemente, wenn P für das Minimum gilt und P für x folgt, sobald P für alle y < x gilt — nur die Wohlgegründetheit variiert",
        answerC = "Sie sind äquivalent zur Zermelo-Fraenkel-Mengenlehre ohne Unendlichkeitsaxiom",
        answerD = "Sie alle erfordern die Annahme der Konsistenz der Peano-Arithmetik",
        correctAnswer = 1,
        explanation = "Das vereinheitlichende Prinzip: Alle Induktionsformen sind wohlgegründete Induktion über einer bestimmten Relation. Vollständige Induktion: (<) auf ℕ. Starke Induktion: (<) auf ℕ mit erweiterter Hypothese. Transfinite Induktion: (<) auf Ordinalzahlen. Strukturelle Induktion: 'Ist echter Teilausdruck von' auf Ausdrücken. Noether-Induktion: Inverse Enthaltungsrelation auf Idealen. In allen Fällen: (1) Kein kleinstes Gegenbeispiel kann existieren (da die Hypothese für alle kleineren Objekte gilt), also gilt die Aussage für alle Objekte. Wohlgegründetheit = keine unendlichen Abstiegsketten = das vereinigende Prinzip.",
        difficulty = 5,
        funFact = "In der Beweistheorie entspricht Induktion über Ordinalzahlen der Konsistenzstärke von Theorien. PA hat die Konsistenzstärke ε₀ (Epsilon-Null), ZFC die von der ersten unerreichbaren Kardinalzahl — je größer die Ordinalzahl, desto stärker die Theorie."
    )
)
