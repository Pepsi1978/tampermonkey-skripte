package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsExpert2(): List<Question> = listOf(

    // Advanced Probability Theory, Paradoxes, Stochastic Puzzles — 50 questions
    // Internet-verified: Bayes, conditional probability, paradoxes, expected values
    // correctAnswer distribution: 0=13, 1=13, 2=12, 3=12

    // --- correctAnswer = 1 (13 Fragen) ---

    Question(
        categoryId = 12,
        questionText = "Das Zwei-Kinder-Problem: Eine Familie hat zwei Kinder. Bekannt ist, dass mindestens eines ein Junge ist. Wie groß ist P(beide Jungen)?",
        answerA = "1/2",
        answerB = "1/3",
        answerC = "2/3",
        answerD = "1/4",
        correctAnswer = 1,
        explanation = "Der Stichprobenraum bei zwei Kindern: (JJ, JM, MJ, MM). 'Mindestens ein Junge' schließt MM aus — es bleiben 3 Fälle (JJ, JM, MJ). Nur JJ ist günstig. P = 1/3. Falle: Viele antworten intuitiv 1/2, weil 'das andere Kind' J oder M sei — das ist falsch.",
        difficulty = 4,
        funFact = "Wird die Frage formuliert: 'Das ältere Kind ist ein Junge' — dann ist P(beide Jungen) tatsächlich 1/2. Die genaue Formulierung ändert das Ergebnis!"
    ),

    Question(
        categoryId = 12,
        questionText = "Das Gefangenenparadoxon: 3 Gefangene, einer wird freigelassen (zufällig). Gefangener A fragt den Wärter, welcher der anderen (B oder C) hingerichtet wird. Wärter nennt B. Wie ändert sich P(A frei)?",
        answerA = "Steigt auf 2/3",
        answerB = "Bleibt bei 1/3",
        answerC = "Steigt auf 1/2",
        answerD = "Fällt auf 1/4",
        correctAnswer = 1,
        explanation = "P(A frei) bleibt 1/3 — die Information über B ändert nichts an As Situation. Aber P(C frei) steigt auf 2/3! Der Wärter nennt immer jemanden der hingerichtet wird (nicht A), daher informiert die Nennung von B nur über C. Strukturell identisch mit dem Monty-Hall-Problem.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Das Petersburger Paradoxon: E[Gewinn] = unendlich. Warum zahlt niemand mehr als etwa 20 Euro dafür?",
        answerA = "Weil die Wahrscheinlichkeit hoher Gewinne zu klein ist",
        answerB = "Wegen abnehmendem Grenznutzen des Geldes (Nutzenfunktion konkav)",
        answerC = "Weil der Erwartungswert falsch berechnet ist",
        answerD = "Wegen des Gesetzes der großen Zahlen",
        correctAnswer = 1,
        explanation = "Daniel Bernoulli löste das Paradoxon 1738: Geld hat logarithmischen Grenznutzen u(x) = ln(x). E[u(Gewinn)] = Summe (1/2^n) × ln(2^n) = ln(2) × Summe n/2^n = 2ln(2) ≈ 1,39 — endlich. Der faire Preis liegt bei e^1,39 ≈ 4 Euro.",
        difficulty = 4,
        funFact = "Das St. Petersburger Paradoxon wurde 1713 von Nikolaus Bernoulli entdeckt und 1738 von seinem Cousin Daniel durch den Nutzenbegriff gelöst."
    ),

    Question(
        categoryId = 12,
        questionText = "Bedingte Wahrscheinlichkeit: P(A|B) = 0,8, P(B|A) = 0,6, P(A) = 0,3. Gesucht: P(B) = ?",
        answerA = "0,4",
        answerB = "0,225",
        answerC = "0,30",
        answerD = "0,48",
        correctAnswer = 1,
        explanation = "P(A∩B) = P(B|A) × P(A) = 0,6 × 0,3 = 0,18. P(A|B) = P(A∩B)/P(B) umgeformt: P(B) = P(A∩B)/P(A|B) = 0,18/0,8 = 0,225.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Das Inspector's Paradox: Busse kommen im Schnitt alle 10 Min mit hoher Varianz. Wie lange wartet ein zufällig Ankommender durchschnittlich?",
        answerA = "Genau 5 Minuten",
        answerB = "Mehr als 5 Minuten",
        answerC = "Weniger als 5 Minuten",
        answerD = "Genau 10 Minuten",
        correctAnswer = 1,
        explanation = "Zufällige Ankünfte landen häufiger in langen Warteintervallen (proportional zur Intervalllänge). E[Wartezeit] = mu/2 + Var/(2mu) > mu/2 = 5 Min. Nur beim Poisson-Prozess gilt genau 5 Min. Bei jedem anderen Prozess wartet man systematisch länger!",
        difficulty = 4,
        funFact = "Das Inspector's Paradox erklärt, warum Busse 'immer zu spät' kommen und man bei unregelmäßigen Ereignissen länger wartet als erwartet."
    ),

    Question(
        categoryId = 12,
        questionText = "Das Sekretärinnenproblem: Bei 100 Kandidaten ist die optimale Ablehnungsphase wie lang, und wie hoch ist die Erfolgswahrscheinlichkeit?",
        answerA = "50 ablehnen, P(Bester) = 1/2",
        answerB = "37 ablehnen, P(Bester) ≈ 36,8%",
        answerC = "10 ablehnen, P(Bester) ≈ 50%",
        answerD = "63 ablehnen, P(Bester) ≈ 50%",
        correctAnswer = 1,
        explanation = "Optimale Strategie: Die ersten n/e ≈ 37 Kandidaten ablehnen (Lernphase), dann den ersten nehmen der alle bisherigen übertrifft. P(Bester gewählt) → 1/e ≈ 36,79% für große n. Klassisches Optimal-Stopping-Problem.",
        difficulty = 4,
        funFact = "Das Sekretärinnenproblem wurde 1960 von Martin Gardner populär gemacht. Es hat Anwendungen bei der Suche nach dem besten Apartment, Partner oder Parkplatz."
    ),

    Question(
        categoryId = 12,
        questionText = "Starkes vs. schwaches Gesetz der großen Zahlen: Was ist der zentrale Unterschied?",
        answerA = "Das starke gilt nur für normalverteilte Variablen",
        answerB = "Das starke garantiert fast sichere Konvergenz, das schwache nur Konvergenz in Wahrscheinlichkeit",
        answerC = "Das schwache gilt für größere n",
        answerD = "Kein Unterschied — beide sind äquivalent",
        correctAnswer = 1,
        explanation = "Schwaches GGZ: P(|Xn_quer - mu| > eps) → 0 für n→∞. Starkes GGZ: P(lim Xn_quer = mu) = 1 (fast sichere Konvergenz). Fast sichere Konvergenz impliziert Konvergenz in Wahrscheinlichkeit, aber nicht umgekehrt.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Maximum-Likelihood-Schätzung: 70 Köpfe bei 100 Münzwürfen. MLS für p?",
        answerA = "p = 0,5 (Nullhypothese)",
        answerB = "p = 0,7",
        answerC = "p = 0,6",
        answerD = "p = 0,65",
        correctAnswer = 1,
        explanation = "L(p) = C(100,70) × p^70 × (1-p)^30. Maximierung: d ln L/dp = 70/p - 30/(1-p) = 0 → p = 70/100 = 0,7. Der MLS ist die relative Häufigkeit. Allgemein: p_MLS = k/n. Der MLS ist konsistent, asymptotisch normalverteilt und effizient.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Jensen-Ungleichung: Für konvexe g gilt g(E[X]) <= E[g(X)]. Was gilt für g(x) = e^x?",
        answerA = "e^(E[X]) >= E[e^X]",
        answerB = "e^(E[X]) <= E[e^X]",
        answerC = "e^(E[X]) = E[e^X]",
        answerD = "Gilt nicht für e^x",
        correctAnswer = 1,
        explanation = "g(x) = e^x ist konvex (g''(x) = e^x > 0). Jensen: g(E[X]) <= E[g(X)] ergibt e^(E[X]) <= E[e^X]. Gleichheit nur wenn X fast sicher konstant ist. Grundlage vieler Ungleichungen in Informationstheorie und Statistik.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Galton-Watson-Prozess: Jedes Individuum hat Kinder mit Durchschnitt mu. Ab wann stirbt die Population mit Sicherheit aus?",
        answerA = "Wenn mu > 1 (überkritisch)",
        answerB = "Wenn mu <= 1 (unterkritisch oder kritisch)",
        answerC = "Immer — Aussterben ist sicher",
        answerD = "Wenn mu = 1 (kritisch)",
        correctAnswer = 1,
        explanation = "P(Aussterben) = 1 genau dann, wenn mu <= 1. Für mu > 1: P(Aussterben) = kleinste nichtnegative Lösung von s = G(s) (erzeugende Funktion der Kinderzahl) — diese ist < 1. Für mu <= 1 (auch im kritischen Fall!) ist Aussterben sicher.",
        difficulty = 4,
        funFact = "Francis Galton entwickelte den Prozess 1873, um zu erklären, warum Familiennamen aussterben. Mit H.W. Watson bewies er: Alle Dynastien sterben letztendlich aus."
    ),

    Question(
        categoryId = 12,
        questionText = "Derangement bei n=5: Wie viele Permutationen von 5 Elementen haben keinen Fixpunkt (D5)?",
        answerA = "40",
        answerB = "44",
        answerC = "36",
        answerD = "48",
        correctAnswer = 1,
        explanation = "D5 = 5! × Summe(-1)^k/k! (k=0..5) = 120 × (1 - 1 + 1/2 - 1/6 + 1/24 - 1/120) = 120 × (44/120) = 44. P(Derangement) = 44/120 ≈ 36,67% — sehr nah an 1/e ≈ 36,79%.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Bedingte Varianz (Eve's Law): Var(X) = E[Var(X|Y)] + Var(E[X|Y]). Was misst der zweite Term?",
        answerA = "'Within-Group'-Varianz",
        answerB = "'Between-Group'-Varianz — durch Y erklärter Varianzanteil",
        answerC = "Residualvarianz",
        answerD = "Die Varianz von Y",
        correctAnswer = 1,
        explanation = "Var(E[X|Y]) = Between-Group-Varianz: Wie stark variiert der bedingte Erwartungswert von X über verschiedene Y-Werte? E[Var(X|Y)] = Within-Group-Varianz. Zusammen: Gesamtvarianz von X. Grundlage der ANOVA.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Metropolis-Hastings: Was ist die Akzeptanzwahrscheinlichkeit alpha für Vorschlag x' bei symmetrischem Vorschlagskern?",
        answerA = "alpha = max(0, pi(x') - pi(x))",
        answerB = "alpha = min(1, pi(x')/pi(x))",
        answerC = "alpha = pi(x') stets",
        answerD = "alpha = pi(x')/pi(x) immer",
        correctAnswer = 1,
        explanation = "Metropolis-Akzeptanzrate: alpha = min(1, pi(x')/pi(x)). Ist der Vorschlag wahrscheinlicher unter pi, wird er immer akzeptiert. Sonst mit Wahrscheinlichkeit pi(x')/pi(x). Dies garantiert die richtige stationäre Verteilung.",
        difficulty = 4,
        funFact = "Der Metropolis-Algorithmus (1953) war ursprünglich für Kernwaffensimulationen entwickelt — Grundlage aller modernen MCMC-Methoden in der Bayesianischen Statistik."
    ),

    // --- correctAnswer = 0 (13 Fragen) ---

    Question(
        categoryId = 12,
        questionText = "Bertrand-Box-Paradoxon: 3 Schachteln: GG (2 Gold), GS (1 Gold+1 Silber), SS (2 Silber). Eine zufällige Münze ist Gold. P(andere Münze auch Gold)?",
        answerA = "2/3",
        answerB = "1/2",
        answerC = "1/3",
        answerD = "3/4",
        correctAnswer = 0,
        explanation = "Von 6 Münzen sind 3 Gold: G1, G2 (aus GG) und G3 (aus GS). Ich sehe Gold — mit P=2/3 ist es eine aus GG, mit P=1/3 die aus GS. P(andere auch Gold) = P(in GG) = 2/3. Intuitive Antwort 1/2 ist falsch — klassisches Bertrand-Paradoxon von 1889.",
        difficulty = 4,
        funFact = "Joseph Bertrand veröffentlichte dieses Paradoxon 1889 in 'Calcul des probabilités'."
    ),

    Question(
        categoryId = 12,
        questionText = "Bayesianischer Spamfilter: 40% aller Mails sind Spam. 'Lottogewinn' in 85% der Spam-, 5% der echten Mails. P(Spam | 'Lottogewinn') = ?",
        answerA = "Etwa 91,9%",
        answerB = "Etwa 85%",
        answerC = "Etwa 75%",
        answerD = "Etwa 97%",
        correctAnswer = 0,
        explanation = "P(L|Spam)×P(Spam) = 0,85×0,4 = 0,34. P(L|kein Spam)×P(kein Spam) = 0,05×0,6 = 0,03. P(Spam|L) = 0,34/(0,34+0,03) = 0,34/0,37 ≈ 91,9%. Naive-Bayes-Klassifikation: Grundlage moderner E-Mail-Filter.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Birthday-Angriff in der Kryptographie: Wie viele Hashes für P(Kollision)>50% bei 2^128 möglichen Werten?",
        answerA = "2^64",
        answerB = "2^128",
        answerC = "2^32",
        answerD = "2^96",
        correctAnswer = 0,
        explanation = "Geburtstagsparadoxon: Für n mögliche Ausgaben braucht man O(sqrt(n)) Eingaben für P(Kollision)>50%. Bei n=2^128: sqrt(2^128) = 2^64. Deshalb brauchen sichere Hash-Funktionen mindestens 256-Bit für 128-Bit Sicherheit.",
        difficulty = 4,
        funFact = "Der Birthday Attack gegen MD5 und SHA-1 wurde praktisch demonstriert. SHA-256 gilt als sicher gegen Geburtstagsangriffe."
    ),

    Question(
        categoryId = 12,
        questionText = "Tschebyscheff vs. Markov: X >= 0, E[X]=10, Var(X)=4. Schärfere Schranke für P(X>=20)?",
        answerA = "1/25 (Tschebyscheff)",
        answerB = "1/2 (Markov)",
        answerC = "1/4",
        answerD = "1/9",
        correctAnswer = 0,
        explanation = "Markov: P(X>=20) <= E[X]/20 = 1/2. Tschebyscheff: P(|X-10|>=10) <= Var(X)/10^2 = 4/100 = 1/25. Da P(X>=20) <= P(|X-10|>=10) <= 1/25, ist Tschebyscheff schärfer (benötigt aber Varianz).",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Das Paradoxon der wiederholten Risiken: P(mindestens 1 Unfall in 30 Jahren) bei P(Unfall/Jahr) = 0,05?",
        answerA = "Etwa 78,5%",
        answerB = "1,5%",
        answerC = "50%",
        answerD = "95%",
        correctAnswer = 0,
        explanation = "P(mind. 1 Unfall) = 1 - P(kein Unfall)^30 = 1 - 0,95^30 = 1 - 0,2146 ≈ 78,5%. Kleines jährliches Risiko akkumuliert sich über Jahrzehnte erheblich. Bei p=0,01 und 30 Jahren: 1 - 0,99^30 ≈ 26%.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Tschebyscheff-Ungleichung: X hat mu=100, sigma=15. Obere Schranke für P(X <= 55 oder X >= 145)?",
        answerA = "1/9",
        answerB = "1/6",
        answerC = "1/3",
        answerD = "15%",
        correctAnswer = 0,
        explanation = "P(|X-100| >= 45) <= sigma^2/45^2 = 225/2025 = 1/9. Alternativ: k = 45/sigma = 45/15 = 3 Standardabweichungen. Tschebyscheff: P(|X-mu| >= 3*sigma) <= 1/9.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Buffon'sches Nadelproblem: P(Nadel der Länge l schneidet Linie im Abstand d, l<=d) = ?",
        answerA = "2l/(pi*d)",
        answerB = "l/d",
        answerC = "pi*l/(2d)",
        answerD = "l/(pi*d)",
        correctAnswer = 0,
        explanation = "P = 2l/(pi*d). Buffons Nadelproblem (1777): Die Lösung enthält pi! Durch wiederholte Würfe approximiert man pi ≈ 2l*n/(d*m), wobei n Gesamtwürfe und m Treffer. Eine der ersten Monte-Carlo-Methoden.",
        difficulty = 4,
        funFact = "1901 warf Mario Lazzarini 3408 Nadeln und erhielt pi ≈ 355/113 ≈ 3,14159292 — verdächtig genau, vermutlich manipuliert."
    ),

    Question(
        categoryId = 12,
        questionText = "Zufallsgang in 2D: Ein betrunkener Mann geht zufällig N/S/O/W. Kehrt er mit Wahrscheinlichkeit 1 zum Ursprung zurück?",
        answerA = "Ja, P(Rückkehr) = 1",
        answerB = "Nein, P(Rückkehr) ≈ 0,34",
        answerC = "Nein, P(Rückkehr) = 1/2",
        answerD = "Ja, aber nur bei geraden Schritten",
        correctAnswer = 0,
        explanation = "Der symmetrische Zufallsgang ist in 1D und 2D rekurrent (P=1), in 3D transient (P ≈ 0,3405). In 2D gilt P(Rückkehr) = 1 — obwohl es unendlich lange dauern kann. Pólya 1921.",
        difficulty = 4,
        funFact = "Pólyas berühmtes Zitat: 'Ein betrunkener Mann findet immer nach Hause. Ein betrunkener Vogel findet nie nach Hause.' — 1D/2D rekurrent, 3D transient."
    ),

    Question(
        categoryId = 12,
        questionText = "Kelly-Kriterium: P=0,6, Gewinnquote 1:1 (Einsatz verdoppelt sich). Anteil f* des Kapitals für maximales langfristiges Wachstum?",
        answerA = "f* = 20% des Kapitals",
        answerB = "f* = 60% des Kapitals",
        answerC = "f* = 40% des Kapitals",
        answerD = "f* = 100% des Kapitals",
        correctAnswer = 0,
        explanation = "Kelly-Formel: f* = p - q/b = 0,6 - 0,4/1 = 0,2 = 20%. Bei Over-Betting (mehr als f*) sinkt das langfristige Kapital trotz positivem Erwartungswert. Kelly maximiert den logarithmischen Erwartungswert des Endkapitals.",
        difficulty = 4,
        funFact = "Das Kelly-Kriterium wurde 1956 von J.L. Kelly Jr. bei Bell Labs entwickelt. Warren Buffett und Ed Thorp setzen es in der Praxis ein."
    ),

    Question(
        categoryId = 12,
        questionText = "Gambler's Ruin: Startkapital 2 Euro, Ziel 6 Euro, Ruin bei 0 Euro (faires Spiel). P(Ruin) = ?",
        answerA = "2/3",
        answerB = "1/3",
        answerC = "1/2",
        answerD = "3/4",
        correctAnswer = 0,
        explanation = "Gambler's Ruin beim fairen Spiel: P(Ruin) = 1 - k/n = 1 - 2/6 = 4/6 = 2/3. P(Ziel erreichen) = k/n = 2/6 = 1/3. Mit Startkapital k=4 wäre P(Ruin) = 1/3.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Entropie: Welche Verteilung auf {1,...,n} maximiert H(X) = -Summe p(x) * log2(p(x))?",
        answerA = "Gleichverteilung (p = 1/n für alle Werte)",
        answerB = "Geometrische Verteilung",
        answerC = "Binomialverteilung",
        answerD = "Poisson-Verteilung",
        correctAnswer = 0,
        explanation = "Maximum-Entropie-Prinzip: H(X) = log2(n) maximal genau dann wenn X gleichverteilt ist. Bei kontinuierlichen Verteilungen mit fester Varianz maximiert die Normalverteilung die Entropie. Die Gleichverteilung 'weiß am wenigsten' über den Ausgang.",
        difficulty = 4,
        funFact = "Shannon wählte den Begriff 'Entropie' 1948 auf Vorschlag von John von Neumann — weil niemand genau weiß, was Entropie ist."
    ),

    Question(
        categoryId = 12,
        questionText = "Nicht-transitive Würfel: A schlägt B, B schlägt C, C schlägt A — alle mit P=2/3. Was zeigt das?",
        answerA = "Zyklische Dominanz: 'Besser sein' ist bei Würfeln nicht transitiv",
        answerB = "Transitivitätsversagen nur bei gefälschten Würfeln",
        answerC = "Bertrand-Paradoxon",
        answerD = "Simpson-Effekt",
        correctAnswer = 0,
        explanation = "Efron-Würfel zeigen zyklische Dominanz: A>B>C>A mit je P=2/3. 'Besser sein' ist bei Würfeln nicht transitiv! Wer zuerst wählt, ist immer im Nachteil — der Gegner findet immer einen überlegenen Würfel.",
        difficulty = 4,
        funFact = "Warren Buffett bot Bill Gates einmal an, nicht-transitive Würfel zu spielen — Gates bestand darauf, zuerst zu wählen, nachdem er das Prinzip erkannt hatte."
    ),

    Question(
        categoryId = 12,
        questionText = "Cramér-Rao-Schranke: Was beschreibt sie genau?",
        answerA = "Die minimale Varianz eines erwartungstreuen Schätzers",
        answerB = "Den maximalen Erwartungswert eines Schätzers",
        answerC = "Die maximale Wahrscheinlichkeit eines Ereignisses",
        answerD = "Die Konvergenzgeschwindigkeit des ZGS",
        correctAnswer = 0,
        explanation = "Cramér-Rao: Var(T) >= 1/I(theta) (Fisher-Information). Kein erwartungstreuer Schätzer kann eine kleinere Varianz haben. Schätzer die diese Schranke erreichen heißen 'effizient'. Der Maximum-Likelihood-Schätzer ist asymptotisch effizient.",
        difficulty = 4,
        funFact = null
    ),

    // --- correctAnswer = 2 (12 Fragen) ---

    Question(
        categoryId = 12,
        questionText = "Das Umtauschparadoxon: Zwei Umschläge x und 2x Euro. Sie öffnen: 100 Euro. Scheinbarer EW beim Wechsel = 125 Euro. Warum ist das ein Trugschluss?",
        answerA = "Weil der Erwartungswert immer gleich ist",
        answerB = "Weil Wechseln immer schlechter ist",
        answerC = "50 und 200 Euro können nicht gleichzeitig mit je 50% möglich sein ohne Prior-Verteilung über x",
        answerD = "Die Rechnung ist korrekt, Wechseln ist besser",
        correctAnswer = 2,
        explanation = "Der Fehler: Man kann nicht gleichzeitig annehmen, dass 100 = x (dann das andere = 200) UND 100 = 2x (dann das andere = 50) mit je 50% — ohne eine Prior-Verteilung über x festzulegen. Ohne Vorwissen sind Wechseln und Behalten gleichwertig.",
        difficulty = 4,
        funFact = "Das Umtauschparadoxon ist bis heute philosophisch ungelöst — es existieren mindestens 5 verschiedene 'Auflösungen', die sich widersprechen."
    ),

    Question(
        categoryId = 12,
        questionText = "Basisraten-Fehlschluss: Krankheit bei 1 von 10.000. Test: 99% sensitiv, 99% spezifisch. PPV (Anteil Kranker unter positiv Getesteten) ≈ ?",
        answerA = "99%",
        answerB = "50%",
        answerC = "Etwa 1%",
        answerD = "Etwa 10%",
        correctAnswer = 2,
        explanation = "Bei 10.000 Personen: 1 krank, 9.999 gesund. Test: ~1 richtig positiv (0,99×1), ~100 falsch positiv (0,01×9999). Von ~101 Positiven sind nur ~1% tatsächlich krank. PPV ≈ 1%. Bei sehr seltener Krankheit: Fast nur Fehlalarme.",
        difficulty = 4,
        funFact = "Selbst erfahrene Ärzte überschätzen den positiven Vorhersagewert um das 10- bis 100-fache, wenn sie den Basisraten-Fehlschluss begehen."
    ),

    Question(
        categoryId = 12,
        questionText = "Polya-Urne: Start 2R + 3B. Nach rotem Zug wird die Kugel plus eine weitere gleicher Farbe zurückgelegt. Nach 2 roten Zügen: P(Rot beim 3. Zug)?",
        answerA = "2/5",
        answerB = "1/2",
        answerC = "4/7",
        answerD = "3/5",
        correctAnswer = 2,
        explanation = "Start: 2R, 3B = 5 Kugeln. Nach 1. rotem Zug: 3R, 3B = 6 Kugeln. Nach 2. rotem Zug: 4R, 3B = 7 Kugeln. P(Rot beim 3. Zug) = 4/7 ≈ 57,1%. Polya-Urnen zeigen 'Pfadabhängigkeit': Frühe Zufälle beeinflussen dauerhaft die Wahrscheinlichkeiten.",
        difficulty = 4,
        funFact = "Polya-Urnen modellieren 'positive Rückkopplung' — je mehr ein Ereignis eintritt, desto wahrscheinlicher wird es. Anwendung: Epidemiologie, Wirtschaft."
    ),

    Question(
        categoryId = 12,
        questionText = "Summe zweier Exponentialverteilungen: X ~ Exp(lambda), Y ~ Exp(lambda) unabhängig. Welcher Verteilung folgt X+Y?",
        answerA = "Exp(2*lambda)",
        answerB = "Exp(lambda/2)",
        answerC = "Gamma(2, lambda) = Erlang(2, lambda)",
        answerD = "Normalverteilung N(2/lambda, 2/lambda^2)",
        correctAnswer = 2,
        explanation = "Summe von n unabhängigen Exp(lambda)-Variablen folgt Gamma(n, lambda). Für n=2: Gamma(2,lambda) mit Dichte f(x) = lambda^2 * x * e^(-lambda*x). E[X+Y] = 2/lambda (doppelt so groß wie eine Exp).",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Sleeping Beauty Problem: Münzwurf Kopf = 1× aufwecken (Mo), Zahl = 2× (Mo+Di). Aufgeweckt: P(Kopf) nach 'Thirder-Position'?",
        answerA = "1/2",
        answerB = "2/3",
        answerC = "1/3",
        answerD = "3/4",
        correctAnswer = 2,
        explanation = "Thirder-Position: Von 3 Aufwach-Situationen (1× Kopf-Mo, 1× Zahl-Mo, 1× Zahl-Di) ist in 1/3 der Fälle Kopf korrekt. Halfer-Position (1/2): Neue Infos ändern P(Kopf) nicht. Das Problem ist ein offenes philosophisches Paradoxon.",
        difficulty = 4,
        funFact = "Das Sleeping Beauty Problem wurde 1983 von Arnold Zuboff eingeführt. Es spaltet Philosophen und Mathematiker bis heute in zwei Lager."
    ),

    Question(
        categoryId = 12,
        questionText = "Coupon-Sammler-Problem: 10 verschiedene Fußball-Sticker. Erwartete Anzahl Käufe für die komplette Sammlung?",
        answerA = "10",
        answerB = "Etwa 23",
        answerC = "Etwa 29",
        answerD = "50",
        correctAnswer = 2,
        explanation = "E[T] = n × H_n = 10 × (1 + 1/2 + ... + 1/10) = 10 × 2,9289 ≈ 29,3 Käufe. H_10 ist die 10. harmonische Zahl. Für n=50 Sticker wären es schon ≈ 225 Käufe.",
        difficulty = 4,
        funFact = "Bei 678 Stickern (WM 2018) braucht man im Schnitt über 4800 Packungen für die komplette Sammlung — ein Millionengeschäft für Panini."
    ),

    Question(
        categoryId = 12,
        questionText = "Negativbinomialverteilung: Sie würfeln bis zur dritten 6. Erwartete Anzahl Würfe?",
        answerA = "6",
        answerB = "15",
        answerC = "18",
        answerD = "12",
        correctAnswer = 2,
        explanation = "E[Würfe bis zum r-ten Erfolg] = r/p = 3/(1/6) = 18. Jede 6 braucht im Schnitt 6 Würfe, drei 6er also 3×6 = 18. Negative Binomialverteilung mit r=3, p=1/6.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Kovarianz: Var(X)=4, Var(Y)=9, Cov(X,Y)=0. Was ist Cov(X+Y, X-Y)?",
        answerA = "0",
        answerB = "13",
        answerC = "-5",
        answerD = "4",
        correctAnswer = 2,
        explanation = "Cov(X+Y, X-Y) = Cov(X,X) - Cov(Y,Y) = Var(X) - Var(Y) = 4 - 9 = -5 (da Cov(X,Y)=0). Obwohl X und Y unkorreliert sind, sind X+Y und X-Y negativ korreliert!",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Stein-Chen-Methode: Der Fehler bei Poisson-Approximation von Summe Bernoulli-Variablen ist proportional zu?",
        answerA = "max(pi)",
        answerB = "n (Anzahl der Variablen)",
        answerC = "Summe(pi^2) / Summe(pi)",
        answerD = "Var(Summe Xi)",
        correctAnswer = 2,
        explanation = "Stein-Chen: d_TV(L(W), Poisson(lambda)) <= Summe(pi^2)/lambda = Summe(pi^2)/Summe(pi). Bei kleinen und gleichen pi ist dieser Fehler gering. Zeigt, wann die Poisson-Approximation gut ist.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Bertrand-Paradoxon: Nach welcher Methode gilt für eine zufällige Kreissehne P(Länge > sqrt(3)) = 1/4?",
        answerA = "Zufällige Endpunkte auf dem Kreis",
        answerB = "Zufälliger Mittelpunkt auf einem Radius",
        answerC = "Zufälliger Mittelpunkt auf der Kreisfläche",
        answerD = "Zufälliger Winkel und Abstand",
        correctAnswer = 2,
        explanation = "Bertrand-Paradoxon: Je nach Modell erhält man verschiedene Antworten! Methode 1 (zufällige Endpunkte): P=1/3. Methode 2 (Mittelpunkt auf Radius): P=1/4. Methode 3 (Mittelpunkt auf Fläche): P=1/2. 'Zufällig' ohne genaue Spezifikation ist nicht wohldefiniert.",
        difficulty = 4,
        funFact = "Das Bertrand-Paradoxon motivierte Kolmogorow 1933 zur axiomatischen Grundlegung der Wahrscheinlichkeitstheorie."
    ),

    Question(
        categoryId = 12,
        questionText = "Zufallsvariable X ~ N(0,1). Was ist E[X | X > 0]?",
        answerA = "1/2",
        answerB = "1/sqrt(2pi) ≈ 0,399",
        answerC = "sqrt(2/pi) ≈ 0,798",
        answerD = "pi/sqrt(2)",
        correctAnswer = 2,
        explanation = "E[X|X>0] = E[X*I(X>0)] / P(X>0) = (1/sqrt(2pi)) / (1/2) = 2/sqrt(2pi) = sqrt(2/pi) ≈ 0,798. Das ist der Erwartungswert einer halben Normalverteilung (Half-Normal-Distribution).",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Markov-Ungleichung auf X^2 angewendet: P(X >= a) <= E[X^2]/a^2. Wie nennt man diese Verallgemeinerung?",
        answerA = "Tschebyscheff-Ungleichung zweiter Ordnung",
        answerB = "Jensen-Schranke",
        answerC = "Momentenschranke / Lyapunov-Ungleichung",
        answerD = "Markov zweiter Ordnung",
        correctAnswer = 2,
        explanation = "P(X >= a) = P(X^2 >= a^2) <= E[X^2]/a^2 (Markov auf X^2 angewendet). Allgemein: P(|X| >= a) <= E[|X|^r]/a^r für r>0. Dies sind Momentenschranken (Lyapunov-Ungleichung). Für r=2 und zentriert: Tschebyscheff.",
        difficulty = 4,
        funFact = null
    ),

    // --- correctAnswer = 3 (12 Fragen) ---

    Question(
        categoryId = 12,
        questionText = "Simpson-Paradoxon: Klinik B heilt in jeder Untergruppe mehr als Klinik A, A hat insgesamt bessere Quote. Warum?",
        answerA = "Das ist mathematisch unmöglich",
        answerB = "Klinik A hat mehr Patienten",
        answerC = "Klinik B hat bessere Ärzte",
        answerD = "Klinik A behandelt hauptsächlich leichte Fälle mit höherer Grundheilungsrate",
        correctAnswer = 3,
        explanation = "Simpson-Paradoxon: Klinik A mit 90% leichten Fällen (83% Heilung) hat insgesamt ≈79%. Klinik B mit 90% schweren Fällen (50% Heilung) hat insgesamt ≈54%. Die Gesamtstatistik verschleiert die Gruppenstruktur durch unterschiedliche Verteilung der Confounder-Variable.",
        difficulty = 4,
        funFact = "Das Simpson-Paradoxon führte 1973 zu einem Rechtsstreit in Berkeley — scheinbare Diskriminierung von Frauen verschwand bei Analyse einzelner Studienrichtungen."
    ),

    Question(
        categoryId = 12,
        questionText = "Stochastisch unabhängige Ereignisse: P(A)=0,5, P(B)=0,6. P(A geschnitten mit B-komplement) = ?",
        answerA = "0,3",
        answerB = "0,1",
        answerC = "0,4",
        answerD = "0,2",
        correctAnswer = 3,
        explanation = "Bei Unabhängigkeit: P(A ∩ Bc) = P(A) × P(Bc) = 0,5 × (1-0,6) = 0,5 × 0,4 = 0,2. Unabhängigkeit vererbt sich auf Komplementärereignisse — auch Ac und Bc sind stochastisch unabhängig.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Hypergeometrische vs. Binomialverteilung: Wann ist die Binomialapproximation genau genug?",
        answerA = "Immer",
        answerB = "Wenn n > 30",
        answerC = "Wenn p > 0,5",
        answerD = "Wenn n/N < 0,05 (Stichprobe kleiner als 5% der Grundgesamtheit)",
        correctAnswer = 3,
        explanation = "Bei Ziehung ohne Zurücklegen gilt die hypergeometrische Verteilung exakt. Die Binomialapproximation ist gut wenn n/N < 0,05. Dann ist das Zurücklegen-/Nicht-Zurücklegen-Prinzip vernachlässigbar.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Bayesianisches Update: Prior P(H)=0,3, P(E|H)=0,8, P(E|nicht H)=0,2. Posterior P(H|E) = ?",
        answerA = "0,8",
        answerB = "0,3",
        answerC = "0,6",
        answerD = "12/19 ≈ 63,2%",
        correctAnswer = 3,
        explanation = "P(E) = 0,8×0,3 + 0,2×0,7 = 0,24+0,14 = 0,38. P(H|E) = P(E|H)×P(H)/P(E) = 0,24/0,38 = 12/19 ≈ 63,2%. Der Prior von 30% wird durch die Beobachtung von E auf ~63% aktualisiert.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Das Problem der Punkte (Pascal & Fermat 1654): Stand 2:1, Spiel auf 3 Punkte. Faire Aufteilung von 100 Euro?",
        answerA = "67 zu 33",
        answerB = "80 zu 20",
        answerC = "50 zu 50",
        answerD = "75 zu 25",
        correctAnswer = 3,
        explanation = "Spieler A braucht 1 Punkt, B braucht 2 Punkte. In max. 2 weiteren Runden: P(B gewinnt beide) = (1/2)^2 = 1/4. P(A gewinnt) = 3/4. Faire Aufteilung: 75 Euro für A, 25 Euro für B.",
        difficulty = 4,
        funFact = "Die Briefkorrespondenz zwischen Pascal und Fermat 1654 über dieses Problem gilt als Geburtsstunde der modernen Wahrscheinlichkeitstheorie."
    ),

    Question(
        categoryId = 12,
        questionText = "Suffizienz in der Schätztheorie: Was bedeutet T(X) ist suffizienter Schätzer für theta?",
        answerA = "T(X) ist erwartungstreu",
        answerB = "T(X) hat minimale Varianz",
        answerC = "T(X) ist konsistent",
        answerD = "T(X) enthält alle Information über theta, die in X steckt",
        correctAnswer = 3,
        explanation = "Suffizienz: Die bedingte Verteilung X|T(X) hängt nicht von theta ab. T(X) 'komprimiert' die Daten ohne Informationsverlust über theta. Beispiel: Bei n Bernoulli-Versuchen ist die Summe Summe(xi) suffizient für p.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Roulette Martingal: Starteinsatz 1 Euro, bei Verlust verdoppeln. Gesamtverlust nach 5 aufeinanderfolgenden Verlusten?",
        answerA = "16 Euro",
        answerB = "32 Euro",
        answerC = "63 Euro",
        answerD = "31 Euro",
        correctAnswer = 3,
        explanation = "Einsätze: 1, 2, 4, 8, 16 Euro. Summe = 2^5 - 1 = 31 Euro. Bei Gewinn im k-ten Spiel: Nettoprofit immer +1 Euro. Tischlimit und endliches Kapital machen Martingal langfristig verlustreich.",
        difficulty = 4,
        funFact = "Die Martingal-Strategie wurde im 18. Jahrhundert in Frankreich erfunden. Sie scheitert immer an Tischlimit und endlichem Kapital."
    ),

    Question(
        categoryId = 12,
        questionText = "Kumulanten: Was ist die dritte Kumulante kappa3 einer Zufallsvariable X?",
        answerA = "E[X^3]",
        answerB = "Var(X^2)",
        answerC = "E[(X-mu)^3]/sigma^3 (standardisierte Schiefe)",
        answerD = "Das dritte zentrale Moment E[(X-mu)^3]",
        correctAnswer = 3,
        explanation = "kappa3 = E[(X-mu)^3] = drittes zentrales Moment — Maß für die Schiefe der Verteilung. Die Schiefe gamma1 = kappa3/kappa2^(3/2). Bei der Normalverteilung sind alle Kumulanten kappa_k für k >= 3 gleich null.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Großes-Abweichungs-Prinzip: Was beschreibt die Rate I(x) in P(Xn_quer ≈ x) ≈ e^(-n*I(x))?",
        answerA = "Den Erwartungswert von X",
        answerB = "Die Varianz von X",
        answerC = "Den Logarithmus der Dichte von P bei x",
        answerD = "Die KL-Divergenz zwischen der tilted Verteilung mit Mittelwert x und der Originalverteilung P",
        correctAnswer = 3,
        explanation = "Die Ratefunktion I(x) = sup_t { t*x - log E[e^(tX)] } ist die Legendre-Transformierte der kumulantenerzeugenden Funktion. Sie misst die KL-Divergenz zwischen der 'tilted' Verteilung Q mit E_Q[X]=x und der ursprünglichen P.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Geburtstagsparadoxon: Ab welcher Personenzahl übersteigt P(mind. 2 gleichzeitig Geburtstag) die 50%-Marke?",
        answerA = "183",
        answerB = "50",
        answerC = "30",
        answerD = "23",
        correctAnswer = 3,
        explanation = "P(alle verschieden bei n Personen) = 365!/((365-n)! * 365^n). Bei n=23: P(mind. gleich) ≈ 50,7%. Es gibt C(23,2)=253 Paare — jedes hat Übereinstimmungswahrscheinlichkeit 1/365.",
        difficulty = 4,
        funFact = "In einer Fußballmannschaft mit 23 Spielern und einem Schiedsrichter (24 Personen) ist es wahrscheinlicher als nicht, dass zwei am gleichen Tag Geburtstag haben."
    ),

    Question(
        categoryId = 12,
        questionText = "Charakteristische Funktion phi_X(t) = E[e^(i*t*X)]. Was ist phi_X(0)?",
        answerA = "0",
        answerB = "E[X]",
        answerC = "i (imaginäre Einheit)",
        answerD = "1",
        correctAnswer = 3,
        explanation = "phi_X(0) = E[e^(i*0*X)] = E[1] = 1. Charakteristische Funktionen sind normiert: phi(0)=1. Sie existieren für ALLE Verteilungen und bestimmen die Verteilung eindeutig — im Gegensatz zur momentezeugenden Funktion.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Zentraler Grenzwertsatz: Was gilt für S_n = (X1+...+Xn - n*mu)/(sigma*sqrt(n)) für große n bei i.i.d. Variablen?",
        answerA = "S_n ~ Uniform(0,1)",
        answerB = "S_n → mu fast sicher",
        answerC = "S_n ~ t(n-1)-Verteilung",
        answerD = "S_n → N(0,1) in Verteilung",
        correctAnswer = 3,
        explanation = "ZGS: Für i.i.d. Variablen mit endlichem mu und sigma^2 gilt S_n → N(0,1) in Verteilung (schwache Konvergenz). Die Normalverteilung entsteht universell als Grenzverteilung von Summen unabhängiger Variablen.",
        difficulty = 4,
        funFact = null
    ),

)
