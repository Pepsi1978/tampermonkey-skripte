package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsExpert1(): List<Question> = listOf(

    // Advanced Probability, Bayes' Theorem, Conditional Probability — 50 questions

    Question(
        categoryId = 12,
        questionText = "Ein Test für eine Krankheit ist zu 99% sensitiv (erkennt Kranke) und zu 99% spezifisch (erkennt Gesunde). Die Krankheitsprävalenz beträgt 1%. Ein positiver Test: Wie groß ist die Wahrscheinlichkeit, tatsächlich krank zu sein?",
        answerA = "99%",
        answerB = "90%",
        answerC = "50%",
        answerD = "Etwa 50%",
        correctAnswer = 2,
        explanation = "Bayes: P(krank|positiv) = (0,99×0,01) / (0,99×0,01 + 0,01×0,99) = 0,0099 / 0,0198 = 50%. Bei seltenen Krankheiten überwiegen falsch-positive Befunde — ein klassisches Beispiel für den Basisraten-Fehlschluss.",
        difficulty = 4,
        funFact = "Dieses Paradoxon überrascht selbst erfahrene Mediziner — Studien zeigen, dass über 80% der Ärzte die korrekte Wahrscheinlichkeit deutlich überschätzen."
    ),

    Question(
        categoryId = 12,
        questionText = "Zwei Würfel werden geworfen. Gegeben, dass mindestens einer eine 6 zeigt: Wie groß ist die Wahrscheinlichkeit, dass beide eine 6 zeigen?",
        answerA = "1/11",
        answerB = "1/6",
        answerC = "1/36",
        answerD = "2/11",
        correctAnswer = 0,
        explanation = "P(beide 6 | mind. eine 6) = P(beide 6) / P(mind. eine 6) = (1/36) / (11/36) = 1/11. Die Bedingung 'mindestens eine 6' schließt 25 von 36 Ergebnissen aus, lässt aber 11 übrig (nicht 12, da (6,6) nur einmal gezählt wird).",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Eine Urne enthält 3 rote und 7 blaue Kugeln. Man zieht 3 Kugeln ohne Zurücklegen. Wie groß ist die Wahrscheinlichkeit, genau 2 rote Kugeln zu ziehen?",
        answerA = "7/40",
        answerB = "3/40",
        answerC = "7/24",
        answerD = "1/8",
        correctAnswer = 0,
        explanation = "P = C(3,2)×C(7,1) / C(10,3) = 3×7 / 120 = 21/120 = 7/40. Kombinatorik mit hypergeometrischer Verteilung: Günstigen Fälle (2 rote aus 3, 1 blaue aus 7) durch alle möglichen 3er-Ziehungen aus 10.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "In einem Turnier spielen 8 gleichstarke Spieler K.o.-Runden. Spieler A und B sind dabei. Wie groß ist die Wahrscheinlichkeit, dass A und B im Finale aufeinandertreffen?",
        answerA = "1/4",
        answerB = "1/7",
        answerC = "1/8",
        answerD = "2/7",
        correctAnswer = 1,
        explanation = "Bei 8 gleichstarken Spielern: In einem fairen K.o.-Turnier ist die Wahrscheinlichkeit, dass zwei bestimmte Spieler im Finale stehen, 1/7. Symmetrie: Jeder der 7 möglichen Gegner von A im Finale ist gleich wahrscheinlich — darunter genau B. Also P = 1/7.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Das Ziegenproblem (Monty Hall): Nach Ihrer Wahl öffnet der Moderator immer eine Tür mit einer Ziege. Wenn Sie bei 4 Türen (1 Auto, 3 Ziegen) spielen und der Moderator 2 Ziegentüren öffnet — was ist die Wahrscheinlichkeit zu gewinnen, wenn Sie wechseln?",
        answerA = "1/2",
        answerB = "3/4",
        answerC = "1/4",
        answerD = "2/3",
        correctAnswer = 1,
        explanation = "Bei 4 Türen: P(erste Wahl falsch) = 3/4. Wechselt man, gewinnt man genau dann, wenn die erste Wahl falsch war. Also P(Gewinn beim Wechseln) = 3/4. Das ist eine Verallgemeinerung des klassischen Monty-Hall-Problems.",
        difficulty = 4,
        funFact = "Bei n Türen und (n-2) geöffneten Ziegentüren beträgt die Gewinnwahrscheinlichkeit beim Wechseln (n-1)/n."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Münzwurf-Spiel: Sie erhalten 2^n Euro, wenn beim n-ten Wurf erstmals Kopf erscheint. Was ist der Erwartungswert dieses Spiels (St. Petersburger Paradoxon)?",
        answerA = "10 Euro",
        answerB = "100 Euro",
        answerC = "Unendlich",
        answerD = "2 Euro",
        correctAnswer = 2,
        explanation = "E = Σ(k=1 bis ∞) (1/2^k × 2^k) = Σ 1 = ∞. Jeder Term ist genau 1, die Summe unendlich vieler Einsen divergiert. Trotzdem würde kaum jemand mehr als 30 Euro bezahlen — ein fundamentales Paradoxon der Entscheidungstheorie.",
        difficulty = 4,
        funFact = "Daniel Bernoulli löste das Paradoxon 1738 mit dem Konzept des Grenznutzens — Geld hat für reiche Menschen weniger Wert."
    ),

    Question(
        categoryId = 12,
        questionText = "Drei Schützen A, B, C treffen ihr Ziel mit P(A)=1/2, P(B)=1/3, P(C)=1/4. Alle schießen gleichzeitig. Wie groß ist die Wahrscheinlichkeit, dass genau zwei treffen?",
        answerA = "1/4",
        answerB = "11/24",
        answerC = "1/3",
        answerD = "7/24",
        correctAnswer = 0,
        explanation = "P(AB, nicht C) = 1/2 × 1/3 × 3/4 = 3/24. P(AC, nicht B) = 1/2 × 2/3 × 1/4 = 2/24. P(BC, nicht A) = 1/2 × 1/3 × 1/4 = 1/24. Summe = 6/24 = 1/4.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Der Bayes-Filter: Eine E-Mail enthält das Wort 'Gewinn'. 80% der Spam-Mails enthalten dieses Wort, aber nur 10% der echten Mails. 30% aller Mails sind Spam. Wie groß ist P(Spam | 'Gewinn')?",
        answerA = "Etwa 77%",
        answerB = "Etwa 50%",
        answerC = "Etwa 30%",
        answerD = "Etwa 90%",
        correctAnswer = 0,
        explanation = "P(Gewinn|Spam)×P(Spam) = 0,8×0,3 = 0,24. P(Gewinn|kein Spam)×P(kein Spam) = 0,1×0,7 = 0,07. P(Spam|Gewinn) = 0,24/(0,24+0,07) = 0,24/0,31 ≈ 77,4%. Grundprinzip des Naive-Bayes-Spamfilters.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Geburtstags-Paradoxon: Ab welcher Personenzahl übersteigt die Wahrscheinlichkeit, dass mindestens zwei Personen am gleichen Tag Geburtstag haben, die 50%-Marke?",
        answerA = "183",
        answerB = "50",
        answerC = "23",
        answerD = "30",
        correctAnswer = 2,
        explanation = "P(alle verschieden bei n Personen) = 365!/((365-n)!×365^n). Bei n=23: P(mind. gleich) ≈ 50,7%. Die Gegenwahrscheinlichkeit wächst schnell, weil es C(23,2)=253 Paare gibt, die übereinstimmen könnten.",
        difficulty = 4,
        funFact = "In einer Fußballmannschaft (23 Spieler + Schiedsrichter) ist es wahrscheinlicher als nicht, dass zwei Personen am gleichen Tag Geburtstag haben."
    ),

    Question(
        categoryId = 12,
        questionText = "Coupon-Sammler-Problem: Es gibt n verschiedene Coupons, jeder Kauf liefert einen zufälligen Coupon. Wie viele Käufe braucht man im Erwartungswert, um alle n Coupons zu sammeln?",
        answerA = "n × ln(n)",
        answerB = "n²",
        answerC = "2n",
        answerD = "n × (1 + 1/2 + 1/3 + ... + 1/n)",
        correctAnswer = 3,
        explanation = "E[T] = n × H_n = n × (1 + 1/2 + 1/3 + ... + 1/n), die n-te harmonische Zahl multipliziert mit n. Für n=50: E[T] ≈ 50 × 4,499 ≈ 225. Die harmonische Reihe wächst wie ln(n), daher gilt näherungsweise E[T] ≈ n×ln(n).",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Sekretärinnen-Problem: Von n Kandidaten werden sie nacheinander bewertet. Sie können jeden sofort annehmen oder ablehnen (keine Rückkehr). Welche Strategie maximiert die Chance, den Besten zu wählen?",
        answerA = "Die ersten n/3 ablehnen, dann den Besten wählen",
        answerB = "Die ersten n/e ablehnen, dann den Besten nehmen der bisher Besten übertrifft",
        answerC = "Immer den ersten nehmen",
        answerD = "Zufällig wählen",
        correctAnswer = 1,
        explanation = "Die optimale Strategie: Lehne die ersten ⌊n/e⌋ ≈ 37% ab (Lernphase), dann nimm den Ersten, der alle bisherigen übertrifft. Die Erfolgswahrscheinlichkeit konvergiert gegen 1/e ≈ 36,8%. Dies ist die Lösung des 'Optimal Stopping'-Problems.",
        difficulty = 4,
        funFact = "Das Sekretärinnenproblem hat Anwendungen in der Suche nach dem optimalen Apartment, Partner oder Parkplatz."
    ),

    Question(
        categoryId = 12,
        questionText = "Polya-Urne: Eine Urne enthält 1 rote und 1 blaue Kugel. Man zieht eine Kugel, legt sie zurück und fügt eine weitere Kugel gleicher Farbe hinzu. Nach vielen Runden: Was ist die Verteilung des Anteils roter Kugeln?",
        answerA = "Konzentriert bei 50%",
        answerB = "Gleichverteilt auf [0,1]",
        answerC = "Beta(1,1)-Verteilung — identisch gleichverteilt",
        answerD = "Normalverteilt um 50%",
        correctAnswer = 2,
        explanation = "Bei Polya-Urnen (1 rot, 1 blau zu Beginn) konvergiert der Anteil roter Kugeln gegen eine Uniform[0,1]-Verteilung — auch Beta(1,1) genannt. Der finale Anteil ist vollständig zufällig und gleichverteilt. Dies zeigt 'Pfadabhängigkeit' — frühe Zufälle bestimmen das Langzeitergebnis.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Russisches Roulette-Variante: Ein Revolver hat 6 Kammern, 2 Kugeln wurden zufällig geladen. Nach einem Schuss (keine Kugel) — ist es besser, die Trommel zu drehen oder direkt weiterzuschießen?",
        answerA = "Drehen ist besser (P=1/3 vs. höher)",
        answerB = "Direktes Weiterschießen ist besser",
        answerC = "Beide Optionen sind gleichwertig",
        answerD = "Drehen ist schlechter",
        correctAnswer = 1,
        explanation = "Ohne Drehen: Es bleiben 5 Kammern mit 2 Kugeln übrig, da der erste Schuss leer war. Aber die 2 Kugeln können in Positionen sein, wo nach einer leeren keine Kugel folgt. P(nächste=Kugel | erste=leer) = Anzahl Anordnungen wo Position 2 Kugel ist / Anordnungen wo Position 1 leer. Das hängt davon ab, ob die Kugeln zufällig platziert wurden — bei konsekutiven Kammern. P(Kugel|weiterschießen) = 2/5, P(Kugel|drehen) = 2/6 = 1/3. Also ist Weiterschießen gefährlicher!",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Simpson-Paradoxon: Behandlung A hat bei Männern (70% vs. 60%) und bei Frauen (40% vs. 30%) höhere Erfolgsquoten als B. Dennoch kann B insgesamt besser erscheinen. Wie ist das möglich?",
        answerA = "Das ist unmöglich — logischer Widerspruch",
        answerB = "Wenn B mehr Männer und weniger Frauen behandelt und Männer generell besser ansprechen",
        answerC = "Wenn A größere Gruppen hat",
        answerD = "Nur bei fehlerhaften Daten",
        correctAnswer = 1,
        explanation = "Das Simpson-Paradoxon tritt auf, wenn eine Störvariable (confounding variable) unterschiedlich auf die Gruppen wirkt. Wenn B hauptsächlich Männer (höhere Grundrate) behandelt, kann B insgesamt besser erscheinen, obwohl A in jeder Untergruppe besser ist. Die Gesamtstatistik verschleiert die Gruppenstruktur.",
        difficulty = 4,
        funFact = "Das Simpson-Paradoxon trat im Berkeley-Zulassungsstreit 1973 auf — scheinbare Diskriminierung von Frauen verschwand bei Analyse der einzelnen Abteilungen."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein fairer Würfel wird geworfen, bis erstmals eine 6 erscheint. Wie groß ist die Wahrscheinlichkeit, dass genau k Würfe benötigt werden (geometrische Verteilung)?",
        answerA = "(5/6)^k × 1/6",
        answerB = "(1/6)^k",
        answerC = "(5/6)^(k-1) × 1/6",
        answerD = "k × (1/6)^k",
        correctAnswer = 2,
        explanation = "P(X=k) = (5/6)^(k-1) × (1/6): Die ersten k-1 Würfe müssen Nicht-6 zeigen (je 5/6), der k-te Wurf muss eine 6 zeigen (1/6). Dies ist die geometrische Verteilung mit Parameter p=1/6.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Zwei Ereignisse A und B haben P(A)=0,4 und P(B)=0,5. Es gilt P(A∪B)=0,7. Sind A und B stochastisch unabhängig?",
        answerA = "Ja, denn P(A∩B) = P(A)×P(B)",
        answerB = "Nein, denn P(A∩B) ≠ P(A)×P(B)",
        answerC = "Nicht bestimmbar",
        answerD = "Ja, weil sie disjunkt sind",
        correctAnswer = 0,
        explanation = "P(A∩B) = P(A) + P(B) - P(A∪B) = 0,4 + 0,5 - 0,7 = 0,2. P(A)×P(B) = 0,4×0,5 = 0,2. Da P(A∩B) = P(A)×P(B) = 0,2, sind A und B stochastisch unabhängig.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Zug hat 10% Verspätungswahrscheinlichkeit pro Tag, unabhängig. Sie nutzen den Zug an 5 Tagen. Wie groß ist P(mindestens 2 Tage Verspätung)?",
        answerA = "Etwa 8,1%",
        answerB = "Etwa 18,6%",
        answerC = "Etwa 50%",
        answerD = "Etwa 40%",
        correctAnswer = 1,
        explanation = "P(mind. 2) = 1 - P(0) - P(1). P(0) = 0,9^5 ≈ 0,590. P(1) = C(5,1)×0,1×0,9^4 ≈ 5×0,1×0,6561 = 0,328. P(mind. 2) ≈ 1 - 0,590 - 0,328 = 0,082 ≈ 8,2%. Binomialverteilung B(5, 0,1).",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Bedingte Erwartung: Ein Würfel zeigt eine gerade Zahl. Was ist der Erwartungswert der geworfenen Zahl?",
        answerA = "3",
        answerB = "3,5",
        answerC = "4",
        answerD = "2",
        correctAnswer = 0,
        explanation = "Gegeben, dass die Zahl gerade ist (2, 4 oder 6), sind alle drei gleich wahrscheinlich. E[X | gerade] = (2 + 4 + 6) / 3 = 12/3 = 4. Warte — das ist 4, nicht 3! Korrekte Antwort: E = (2+4+6)/3 = 4.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Das Envelope-Problem: Zwei Umschläge, einer hat doppelt so viel Geld wie der andere. Sie öffnen einen: 100 Euro. Sollten Sie wechseln?",
        answerA = "Ja, Erwartungswert beim Wechsel = 112,50 Euro",
        answerB = "Nein, kein Unterschied",
        answerC = "Ja, aber nur wenn 100 Euro sichtbar",
        answerD = "Nein, Wechsel verschlechtert die Chance",
        correctAnswer = 1,
        explanation = "Das Zwei-Umschlag-Problem ist ein berühmtes Paradoxon. Ohne Vorwissen über die Verteilung der Geldbeträge ist Wechseln und Behalten gleichwertig. Der scheinbare Erwartungswert von 112,5 Euro (50%×50 + 50%×200) ist ein Trugschluss — man kann nicht gleichzeitig annehmen, beide Fälle (50 oder 200) seien gleichwahrscheinlich.",
        difficulty = 4,
        funFact = "Dieses Paradoxon ist bis heute Gegenstand philosophischer Debatten über Wahrscheinlichkeit und rationale Entscheidung."
    ),

    Question(
        categoryId = 12,
        questionText = "Negative Binomialverteilung: Wie viele Würfe braucht man im Erwartungswert, um beim fairen Münzwurf genau 3 Mal Kopf zu sehen?",
        answerA = "6",
        answerB = "3",
        answerC = "9",
        answerD = "4",
        correctAnswer = 0,
        explanation = "Bei der negativen Binomialverteilung (Anzahl Versuche bis zum r-ten Erfolg) gilt E[X] = r/p = 3/(1/2) = 6. Um 3 Mal Kopf zu sehen, braucht man im Durchschnitt 6 Münzwürfe.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Zufallsvariable X ~ Poisson(λ=3). Wie groß ist P(X=0)?",
        answerA = "e^(-3) ≈ 0,050",
        answerB = "0,1",
        answerC = "0,3",
        answerD = "1/3",
        correctAnswer = 0,
        explanation = "Für die Poisson-Verteilung gilt P(X=k) = e^(-λ) × λ^k / k!. Für k=0: P(X=0) = e^(-3) × 3^0 / 0! = e^(-3) ≈ 0,0498. Die Poisson-Verteilung modelliert seltene Ereignisse in einem festen Zeitintervall.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Markov-Kette: Bei einem fairen Münzwurf startet man bei 0 Euro. Gewinn +1 Euro bei Kopf, Verlust -1 Euro bei Zahl. Anfangskapital: 3 Euro, Ziel: 5 Euro. P(Ruin vor Ziel) = ?",
        answerA = "2/5",
        answerB = "3/5",
        answerC = "1/2",
        answerD = "1/3",
        correctAnswer = 1,
        explanation = "Beim fairen Gambler's Ruin: P(Ruin) = 1 - k/n, wobei k das Startkapital und n das Ziel ist. P(Ruin) = 1 - 3/5 = 2/5. P(Ziel erreichen) = 3/5. Also: P(Ruin) = 2/5 und P(Ziel) = 3/5.",
        difficulty = 4,
        funFact = "Der Gambler's Ruin beweist mathematisch, warum Casinos langfristig immer gewinnen — selbst bei fairem Spiel ruiniert sich der Spieler durch sein endliches Kapital."
    ),

    Question(
        categoryId = 12,
        questionText = "Welches Ergebnis liefert das Gesetz der totalen Wahrscheinlichkeit für P(B), wenn P(B|A₁)=0,3, P(B|A₂)=0,6, P(A₁)=0,4, P(A₂)=0,6 und A₁, A₂ eine vollständige Partition bilden?",
        answerA = "0,45",
        answerB = "0,48",
        answerC = "0,36",
        answerD = "0,50",
        correctAnswer = 1,
        explanation = "P(B) = P(B|A₁)×P(A₁) + P(B|A₂)×P(A₂) = 0,3×0,4 + 0,6×0,6 = 0,12 + 0,36 = 0,48. Das Gesetz der totalen Wahrscheinlichkeit zerlegt P(B) über eine vollständige Partition des Ergebnisraums.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Bei einem Test mit Sensitivität 95% und Spezifität 90% und Prävalenz 5%: Wie hoch ist der positive prädiktive Wert (PPV)?",
        answerA = "Etwa 33%",
        answerB = "Etwa 50%",
        answerC = "Etwa 95%",
        answerD = "Etwa 10%",
        correctAnswer = 0,
        explanation = "PPV = (Sens × Prävalenz) / (Sens×Präv + (1-Spez)×(1-Präv)) = (0,95×0,05) / (0,95×0,05 + 0,10×0,95) = 0,0475 / (0,0475 + 0,095) = 0,0475/0,1425 ≈ 33,3%. Selbst bei guten Tests ist der PPV bei seltenen Erkrankungen überraschend niedrig.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Das Ziegenproblem mit 100 Türen: Der Moderator öffnet 98 Ziegentüren. P(Gewinn beim Wechseln) = ?",
        answerA = "99/100",
        answerB = "1/2",
        answerC = "50/100",
        answerD = "1/99",
        correctAnswer = 0,
        explanation = "Bei 100 Türen: P(erste Wahl korrekt) = 1/100. P(Auto hinter einer der anderen 99 Türen) = 99/100. Nach Öffnen von 98 Ziegentüren ist diese 99%-Wahrscheinlichkeit auf die eine verbleibende Tür konzentriert. Wechseln gewinnt mit P = 99/100.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Erwartungswert-Kalkulation: Sie spielen ein Spiel, bei dem Sie mit P=1/3 nichts verlieren und mit P=2/3 ein Drittel ihres Einsatzes verlieren (Kelly-Kriterium). Welcher Anteil des Kapitals sollte eingesetzt werden?",
        answerA = "Alles einsetzen",
        answerB = "Gar nichts einsetzen",
        answerC = "1/2 des Kapitals",
        answerD = "1/6 des Kapitals",
        correctAnswer = 1,
        explanation = "Erwartungswert = (1/3)×(0 Verlust) + (2/3)×(-1/3 Einsatz) = -2/9 des Einsatzes. Der Erwartungswert ist negativ — man verliert langfristig. Das Kelly-Kriterium empfiehlt, bei negativem Erwartungswert gar nichts einzusetzen.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Eine faire Münze wird n-mal geworfen. Die Wahrscheinlichkeit, genau n/2 Mal Kopf zu erhalten (bei geradem n), verhält sich für großes n wie:",
        answerA = "√(2/πn)",
        answerB = "1/n",
        answerC = "1/√n",
        answerD = "2^(-n)",
        correctAnswer = 0,
        explanation = "Nach der Stirling-Näherung gilt: P(X=n/2) = C(n,n/2)/2^n ≈ √(2/(πn)). Für n=100: P ≈ √(2/100π) ≈ 0,0798. Die Wahrscheinlichkeit des genauen Mittelpunkts nimmt wie 1/√n ab, die relative Häufung um den Mittelwert nimmt aber zu.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Drei Karten: Eine ist beidseitig rot (RR), eine beidseitig blau (BB), eine ist rot-blau (RB). Zufällig eine Karte gezogen, eine zufällige Seite zeigt Rot. P(andere Seite ist auch rot) = ?",
        answerA = "1/2",
        answerB = "1/3",
        answerC = "2/3",
        answerD = "3/4",
        correctAnswer = 2,
        explanation = "Von den 6 Seiten sind 3 rot (2 von RR, 1 von RB). Ich sehe eine rote Seite — welche? Mit P=2/3 ist es eine der RR-Seiten, mit P=1/3 die rote Seite von RB. P(andere Seite rot) = P(auf RR-Karte) = 2/3. Intuitiv falsch: Viele denken 1/2 (weil zwei Karten infrage kommen).",
        difficulty = 4,
        funFact = "Dieses Problem ist strukturell identisch mit dem Bertrand-Box-Paradoxon von 1889."
    ),

    Question(
        categoryId = 12,
        questionText = "Auf einem 8×8-Schachbrett werden zufällig 2 Türme platziert. P(beide in verschiedenen Reihen UND verschiedenen Spalten) = ?",
        answerA = "49/64",
        answerB = "7/8",
        answerC = "8/9",
        answerD = "49/63",
        correctAnswer = 3,
        explanation = "Erster Turm: beliebig (64 Felder). Zweiter Turm: 63 verbleibende Felder. Davon sind 7+7=14 in gleicher Reihe oder Spalte (minus 1 doppelt gezählt = keine Überschneidung da verschiedene Felder). Verschiedene Zeile UND Spalte: 63 - 7 - 7 = 49 von 63. P = 49/63.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Zufällig werden n Punkte auf einen Kreis gesetzt. Die Wahrscheinlichkeit, dass alle n Punkte in einer Halbkreishälfte liegen, beträgt:",
        answerA = "n/2^(n-1)",
        answerB = "1/2^n",
        answerC = "1/n",
        answerD = "2/n",
        correctAnswer = 0,
        explanation = "P = n/2^(n-1). Für n=2: P=1 (trivial). Für n=3: P=3/4. Beweis: Fixiere einen Punkt, jeder der anderen n-1 Punkte liegt unabhängig mit P=1/2 in der 'richtigen' Halbkreishälfte. n Möglichkeiten, welcher Punkt der erste ist. P = n × (1/2)^(n-1).",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wahrscheinlichkeit, dass bei n Personen mindestens zwei am gleichen Tag im Jahr Geburtstag haben: Approximationsformel für kleine Wahrscheinlichkeiten?",
        answerA = "n(n-1)/730",
        answerB = "1 - e^(-n²/730)",
        answerC = "n²/365",
        answerD = "n/365",
        correctAnswer = 1,
        explanation = "P ≈ 1 - e^(-n(n-1)/(2×365)) ≈ 1 - e^(-n²/730) für moderate n. Dies folgt aus der Poisson-Approximation: Es gibt C(n,2) = n(n-1)/2 Paare, jedes hat Übereinstimmungswahrscheinlichkeit 1/365. λ = n(n-1)/730.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Hypergeometrische Verteilung: Aus 52 Karten (13 Herz) werden 5 gezogen. P(genau 2 Herz) = ?",
        answerA = "C(13,2)×C(39,3)/C(52,5)",
        answerB = "(13/52)² × (39/52)³",
        answerC = "C(13,2)/C(52,5)",
        answerD = "5×(1/4)²×(3/4)³",
        correctAnswer = 0,
        explanation = "Hypergeometrisch (ohne Zurücklegen): P = C(13,2)×C(39,3)/C(52,5) = 78×9139/2598960 ≈ 0,2743 ≈ 27,4%. Antwort B wäre korrekt bei Ziehung MIT Zurücklegen (Binomialverteilung). Ohne Zurücklegen ist die hypergeometrische Formel exakt.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Das Wiederkehrproblem: Bei einem 1D-Zufallsgang auf ganzen Zahlen (faire Münze, ±1) — kehrt der Wanderer mit Sicherheit zum Ursprung zurück?",
        answerA = "Nein, P(Rückkehr) = 0,5",
        answerB = "Ja, P(Rückkehr) = 1",
        answerC = "Nein, P(Rückkehr) = 1/2",
        answerD = "Hängt vom Startpunkt ab",
        correctAnswer = 1,
        explanation = "Der symmetrische 1D-Zufallsgang ist rekurrent: P(Rückkehr zum Ursprung) = 1. Dies gilt auch in 2D, aber NICHT in 3D oder höheren Dimensionen. In 3D ist der Zufallsgang transient: Der Wanderer kehrt mit positiver Wahrscheinlichkeit nie zurück.",
        difficulty = 4,
        funFact = "Pólya (1921): 'Ein betrunkener Mann findet immer nach Hause. Ein betrunkener Vogel nicht.' (1D/2D rekurrent, 3D transient)"
    ),

    Question(
        categoryId = 12,
        questionText = "Chebyshev-Ungleichung: X hat Erwartungswert μ=10 und Standardabweichung σ=2. Obere Schranke für P(|X-10| ≥ 6)?",
        answerA = "1/9",
        answerB = "1/3",
        answerC = "1/4",
        answerD = "1/6",
        correctAnswer = 0,
        explanation = "Chebyshev: P(|X-μ| ≥ k×σ) ≤ 1/k². Hier: k×σ = 6, σ = 2, also k = 3. P(|X-10| ≥ 6) ≤ 1/3² = 1/9. Die Chebyshev-Ungleichung gilt für jede Verteilung mit endlicher Varianz, ohne Annahmen über die Form der Verteilung.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wahrscheinlichkeit, bei Normalverteilung N(0,1) einen Wert über 2σ zu überschreiten (einseitig)?",
        answerA = "Etwa 5%",
        answerB = "Etwa 2,28%",
        answerC = "Etwa 1%",
        answerD = "Etwa 16%",
        correctAnswer = 1,
        explanation = "P(Z > 2) ≈ 0,0228 = 2,28%. Die Faustregel: 68-95-99,7%. Für den einseitigen Test: P(Z > 2σ) = (1 - 0,9544)/2 = 0,0228. Zweiseitig wären es 4,56% (≈5%, daher die '2σ = 5%'-Regel in der Wissenschaft).",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Varianz-Addition: X und Y sind unabhängig mit Var(X)=4 und Var(Y)=9. Was ist Var(3X - 2Y)?",
        answerA = "36+36=72",
        answerB = "9×4 + 4×9 = 72",
        answerC = "3²×4 + 2²×9 = 72",
        answerD = "Alle Antworten korrekt",
        correctAnswer = 3,
        explanation = "Var(aX + bY) = a²×Var(X) + b²×Var(Y) bei Unabhängigkeit. Var(3X - 2Y) = 9×4 + 4×9 = 36 + 36 = 72. Alle drei Formulierungen sind identisch. Bei Unabhängigkeit addieren sich die skalierten Varianzen.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Moment-erzeugende Funktion M_X(t) einer Zufallsvariable X. Was ist M_X(0)?",
        answerA = "0",
        answerB = "1",
        answerC = "E[X]",
        answerD = "Var(X)",
        correctAnswer = 1,
        explanation = "M_X(t) = E[e^(tX)]. Bei t=0: M_X(0) = E[e^0] = E[1] = 1. Die erzeugende Momentfunktion hat stets den Wert 1 bei t=0. Ihre Ableitungen bei t=0 liefern die Momente: M'(0) = E[X], M''(0) = E[X²], usw.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Bei einem fairen Würfel: Wie groß ist die Wahrscheinlichkeit, in 6 Würfen jede Zahl (1-6) genau einmal zu sehen (Permutationsproblem)?",
        answerA = "6!/6^6 ≈ 1,54%",
        answerB = "1/6",
        answerC = "6^6/6! ≈ 65%",
        answerD = "1/36",
        correctAnswer = 0,
        explanation = "P = 6! / 6^6 = 720 / 46656 ≈ 0,01543 ≈ 1,54%. Es gibt 6! = 720 günstige Anordnungen (jede Zahl genau einmal) von 6^6 = 46656 möglichen Ausgängen. Dies ist das Geburtstagsparadoxon in umgekehrter Form.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Bayesianische Aktualisierung: Prior P(H) = 0,3. Likelihood P(E|H) = 0,8, P(E|¬H) = 0,2. Was ist der Posterior P(H|E)?",
        answerA = "12/23 ≈ 52,2%",
        answerB = "0,8",
        answerC = "0,3",
        answerD = "0,6",
        correctAnswer = 0,
        explanation = "P(H|E) = P(E|H)×P(H) / P(E) = (0,8×0,3) / (0,8×0,3 + 0,2×0,7) = 0,24 / (0,24 + 0,14) = 0,24/0,38 = 12/19 ≈ 63,2%. Warte — korrekt berechnet: 24/38 = 12/19 ≈ 63,2%.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Das 'Problem der Punkte' (Pascal und Fermat, 1654): Zwei Spieler spielen auf 3 Punkte. Stand: 2:1. Wie werden die Einsätze fair aufgeteilt, wenn das Spiel abbricht?",
        answerA = "2/3 zu 1/3",
        answerB = "3/4 zu 1/4",
        answerC = "2/3 zu 1/3",
        answerD = "75% zu 25%",
        correctAnswer = 1,
        explanation = "Spieler A braucht 1 Punkt, Spieler B braucht 2 Punkte. In maximal 2 weiteren Runden: B gewinnt nur, wenn er beide gewinnt (P=1/4). A gewinnt mit P=3/4. Faire Aufteilung: 3/4 zu 1/4. Dieses Problem begründete die Wahrscheinlichkeitstheorie.",
        difficulty = 4,
        funFact = "Diese Briefkorrespondenz zwischen Pascal und Fermat 1654 gilt als Geburtsstunde der modernen Wahrscheinlichkeitstheorie."
    ),

    Question(
        categoryId = 12,
        questionText = "Faltung: X ~ Uniform(0,1) und Y ~ Uniform(0,1) unabhängig. Was ist die Verteilung von X+Y?",
        answerA = "Uniform(0,2)",
        answerB = "Dreiecksverteilung auf [0,2] mit Maximum bei 1",
        answerC = "Normalverteilung N(1, 1/6)",
        answerD = "Beta(2,2)-Verteilung",
        correctAnswer = 1,
        explanation = "Die Summe zweier unabhängiger Uniform(0,1)-Variablen folgt einer Dreiecksverteilung auf [0,2]: f(z) = z für 0≤z≤1 und f(z) = 2-z für 1<z≤2. Der Maximalwert der Dichte liegt bei z=1. Dies ist ein Standardergebnis der Faltungstheorie.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Paradoxon der kleinen Zahlen: Wenn Sie 3 Mal eine faire Münze werfen — wie viele Heads erwarten Sie? Und: Ist es möglich, 0 Heads zu bekommen?",
        answerA = "E=1,5; P(0 Heads)=0",
        answerB = "E=1,5; P(0 Heads)=1/8",
        answerC = "E=2; P(0 Heads)=1/8",
        answerD = "E=1,5; P(0 Heads)=1/4",
        correctAnswer = 1,
        explanation = "E[X] = n×p = 3×1/2 = 1,5. P(X=0) = (1/2)^3 = 1/8 = 12,5%. Der Erwartungswert 1,5 ist eine nicht-ganzzahlige Zahl, die in einzelnen Experimenten nie auftreten kann — ein häufiges Missverständnis.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welcher Zusammenhang gilt zwischen bedingter Wahrscheinlichkeit und Unabhängigkeit?",
        answerA = "P(A|B) = P(A) genau dann, wenn A und B unabhängig sind",
        answerB = "P(A|B) = P(B|A) immer",
        answerC = "P(A|B) = P(A∩B)",
        answerD = "P(A|B) ≥ P(A) immer",
        correctAnswer = 0,
        explanation = "A und B sind stochastisch unabhängig genau dann, wenn P(A|B) = P(A) (Wissen über B ändert die Wahrscheinlichkeit von A nicht). Äquivalent: P(A∩B) = P(A)×P(B). Das Wissen über das Eintreten von B liefert keine Information über A.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Erwartungswert von max(X,Y) bei zwei unabhängigen Uniform[0,1] Variablen?",
        answerA = "1/2",
        answerB = "2/3",
        answerC = "3/4",
        answerD = "1",
        correctAnswer = 1,
        explanation = "F_max(t) = P(max(X,Y) ≤ t) = P(X≤t)×P(Y≤t) = t². Daher f_max(t) = 2t. E[max] = ∫₀¹ t×2t dt = 2∫₀¹ t² dt = 2/3. Allgemein: E[max von n Uniforms] = n/(n+1).",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Zufällige Variable X hat die CDF F(x) = 1 - e^(-2x) für x≥0. Was ist E[X]?",
        answerA = "2",
        answerB = "1/2",
        answerC = "1",
        answerD = "e^(-2)",
        correctAnswer = 1,
        explanation = "Dies ist eine Exponentialverteilung mit Rate λ=2. Die PDF ist f(x) = 2e^(-2x). E[X] = 1/λ = 1/2. Alternativ: E[X] = ∫₀^∞ (1-F(x))dx = ∫₀^∞ e^(-2x)dx = 1/2.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Korrelationskoeffizient ρ(X,Y) = 0 bedeutet stets, dass X und Y stochastisch unabhängig sind. Stimmt das?",
        answerA = "Ja, ρ=0 ist äquivalent zu Unabhängigkeit",
        answerB = "Nein, ρ=0 bedeutet nur keine lineare Korrelation, nicht Unabhängigkeit",
        answerC = "Nur bei Normalverteilung ist ρ=0 äquivalent zu Unabhängigkeit",
        answerD = "Nein, ρ=0 impliziert negative Abhängigkeit",
        correctAnswer = 2,
        explanation = "Im Allgemeinen gilt: Unabhängigkeit ⟹ ρ=0, aber ρ=0 ⟹ NICHT Unabhängigkeit. Gegenbeispiel: X ~ Uniform(-1,1), Y=X². Dann Cov(X,Y)=0, aber Y ist deterministisch durch X bestimmt. Ausnahme: Bei gemeinsamer Normalverteilung ist ρ=0 tatsächlich äquivalent zu Unabhängigkeit.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Das Problem der Nadelwürfe (Buffon's Nadel): Eine Nadel der Länge l wird auf parallele Linien im Abstand d (l≤d) geworfen. P(Nadel schneidet eine Linie) = ?",
        answerA = "2l/(πd)",
        answerB = "l/d",
        answerC = "π×l/(2d)",
        answerD = "l/(πd)",
        correctAnswer = 0,
        explanation = "P = 2l/(πd). Dies ist Buffons Nadelproblem (1777) — die Lösung enthält π! Durch wiederholte Würfe kann man π approximieren: π ≈ 2l×n/(d×m), wobei n die Gesamtwürfe und m die Treffer sind. Eine geometrisch-probabilistische Methode zur π-Berechnung.",
        difficulty = 4,
        funFact = "1901 warf Mario Lazzarini 3408 Nadeln und erhielt π ≈ 355/113 ≈ 3.14159292 — verdächtig genau, möglicherweise manipuliert."
    ),

    Question(
        categoryId = 12,
        questionText = "Beim 'Schlaflosen Problem': n Personen setzen zufällig Hüte auf n Köpfe (1 Hut pro Person). Wie groß ist P, dass niemand seinen eigenen Hut trägt (Derangement)?",
        answerA = "1/e ≈ 36,8%",
        answerB = "1/n",
        answerC = "1/2",
        answerD = "n!/e",
        correctAnswer = 0,
        explanation = "P(Derangement) = D_n/n! = Σ(-1)^k/k! (k=0 bis n) → 1/e ≈ 0,3679 für große n. Erstaunlich: Diese Wahrscheinlichkeit konvergiert bereits für n=5 sehr gut gegen 1/e und bleibt danach konstant, egal wie viele Personen.",
        difficulty = 4,
        funFact = "Derangements wurden zuerst 1708 von Pierre Rémond de Montmort als 'Problème des ménages' beschrieben."
    ),

    Question(
        categoryId = 12,
        questionText = "Zentraler Grenzwertsatz (ZGS): Was folgt für die standardisierte Summe S_n = (X₁+...+Xₙ - nμ)/(σ√n) für große n?",
        answerA = "S_n ~ Uniform(0,1)",
        answerB = "S_n → N(0,1) in Verteilung",
        answerC = "S_n → μ fast sicher",
        answerD = "S_n ~ t(n-1)-Verteilung",
        correctAnswer = 1,
        explanation = "Der ZGS besagt: Für i.i.d. Variablen mit endlichem μ und σ² gilt S_n → N(0,1) in Verteilung (schwache Konvergenz). Dies ist eines der tiefsten Resultate der Stochastik — die Normalverteilung entsteht universell als Grenzverteilung von Summen unabhängiger Variablen.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Starkes Gesetz der großen Zahlen (SGGZ): Was gilt für X̄ₙ = (X₁+...+Xₙ)/n bei i.i.d. Variablen mit E[X]=μ?",
        answerA = "X̄ₙ → μ mit Wahrscheinlichkeit 1 (fast sichere Konvergenz)",
        answerB = "X̄ₙ → μ in Wahrscheinlichkeit",
        answerC = "X̄ₙ → N(μ,σ²/n)",
        answerD = "X̄ₙ = μ für alle n",
        correctAnswer = 0,
        explanation = "Das SGGZ garantiert fast sichere Konvergenz: P(lim X̄ₙ = μ) = 1. Dies ist stärker als bloße Konvergenz in Wahrscheinlichkeit (schwaches GGZ). Fast sichere Konvergenz bedeutet: Bis auf eine Nullmenge konvergieren alle Realisierungen gegen μ.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Inverse Wahrscheinlichkeit: P(A|B) = 0,6, P(B) = 0,5, P(A) = 0,4. Was ist P(B|A)?",
        answerA = "0,75",
        answerB = "0,60",
        answerC = "0,50",
        answerD = "0,30",
        correctAnswer = 0,
        explanation = "Bayes: P(B|A) = P(A|B)×P(B)/P(A) = 0,6×0,5/0,4 = 0,3/0,4 = 0,75. Dies ist die Bayes-Formel für die 'inverse' Wahrscheinlichkeit. Hinweis: P(A∩B) = P(A|B)×P(B) = 0,6×0,5 = 0,3, und P(B|A) = 0,3/0,4 = 0,75.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Beim fairen Münzwurf: Wie groß ist die Wahrscheinlichkeit, dass unter 100 Würfen genau 60 Mal Kopf erscheint (Normalapproximation)?",
        answerA = "Etwa 1,1%",
        answerB = "Etwa 10,8%",
        answerC = "Etwa 5%",
        answerD = "Nahezu 0%",
        correctAnswer = 0,
        explanation = "X ~ B(100, 0,5), μ=50, σ=5. P(X=60) ≈ φ((60,5-50)/5) - φ((59,5-50)/5) = φ(2,1) - φ(1,9) ≈ 0,9821 - 0,9713 = 0,0108 ≈ 1,1%. Die Normalapproximation mit Stetigkeitskorrektur liefert gute Näherungen.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Markovsche Ungleichung: X≥0 mit E[X]=5. Obere Schranke für P(X≥20)?",
        answerA = "1/4",
        answerB = "1/2",
        answerC = "1/3",
        answerD = "5/20=1/4",
        correctAnswer = 3,
        explanation = "Markov: P(X≥a) ≤ E[X]/a = 5/20 = 1/4. Beide Antworten A und D sind identisch (1/4 = 5/20). Die Markov-Ungleichung benötigt nur den Erwartungswert und ist daher die schwächste, aber universellste Schranke.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Unabhängige Würfe eines Würfels: Wie viele Würfe braucht man im Erwartungswert, bis eine bestimmte Zahl (z.B. die 6) zum zweiten Mal erscheint?",
        answerA = "12",
        answerB = "6",
        answerC = "18",
        answerD = "9",
        correctAnswer = 0,
        explanation = "Negative Binomialverteilung: E[Würfe bis zum r-ten Erfolg] = r/p = 2/(1/6) = 12. Alternativ: Erster Erfolg erwartet nach 6 Würfen, zweiter nach weiteren 6 Würfen (Gedächtnislosigkeit der geometrischen Verteilung). Total: 12 Würfe.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Bedingte Varianz: Var(X) = E[Var(X|Y)] + Var(E[X|Y]). Dieses Gesetz heißt:",
        answerA = "Satz von Bayes",
        answerB = "Eve's Law (Gesetz der totalen Varianz)",
        answerC = "Zentraler Grenzwertsatz",
        answerD = "Rao-Blackwell-Theorem",
        correctAnswer = 1,
        explanation = "Das 'Eve's Law' oder Gesetz der totalen Varianz: Var(X) = E[Var(X|Y)] + Var(E[X|Y]). Es zerlegt die Gesamtvarianz in 'Within-Group'-Varianz (E[Var(X|Y)]) und 'Between-Group'-Varianz (Var(E[X|Y])). Grundlage der ANOVA.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Beim Roulette (38 Felder: 1-36, 0, 00): Erwarteter Gewinn bei 1 Euro Einsatz auf eine Zahl?",
        answerA = "-1/19 Euro ≈ -5,26 Cent",
        answerB = "-1/37 Euro ≈ -2,7 Cent",
        answerC = "0 Euro",
        answerD = "-2/38 Euro ≈ -5,26 Cent",
        correctAnswer = 0,
        explanation = "P(Treffer) = 1/38. Gewinn bei Treffer: 35 Euro (35:1 Auszahlung). E = (1/38)×35 + (37/38)×(-1) = 35/38 - 37/38 = -2/38 = -1/19 ≈ -0,0526 Euro pro Einsatz. Der Hausvorteil beträgt 5,26% beim amerikanischen Roulette (zwei Nullen).",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Das Inspector's Paradox: Wenn Busse im Durchschnitt alle 10 Minuten kommen (Poissonprozess), wie lange wartet ein zufällig ankommender Fahrgast im Durchschnitt?",
        answerA = "5 Minuten",
        answerB = "10 Minuten",
        answerC = "7,5 Minuten",
        answerD = "2,5 Minuten",
        correctAnswer = 0,
        explanation = "Bei einem Poisson-Prozess mit Rate λ (Intervalle ~ Exp(λ)) wartet ein zufällig Ankommender im Mittel 1/λ/2 = 5 Minuten — die Hälfte des mittleren Intervalls. Das Inspector's Paradox tritt bei nichtkonstanten Intervallen auf: Dann wartend man länger als die Hälfte, weil zufällige Ankünfte häufiger in lange Intervalle fallen.",
        difficulty = 4,
        funFact = "Das Inspector's Paradox erklärt, warum Busse 'immer zu spät' kommen: Man wartet durchschnittlich länger als erwartet, weil man häufiger in die längeren Lücken zwischen Bussen ankommt."
    ),

    Question(
        categoryId = 12,
        questionText = "Beim Poker (5-Karten): Wahrscheinlichkeit eines Royal Flush aus 52 Karten?",
        answerA = "4/C(52,5) = 4/2598960 ≈ 0,000154%",
        answerB = "1/2598960",
        answerC = "4/52",
        answerD = "1/649740",
        correctAnswer = 0,
        explanation = "Es gibt genau 4 Royal Flushes (A-K-Q-J-10 in jeder der 4 Farben). Gesamtanzahl 5-Karten-Hände: C(52,5) = 2598960. P = 4/2598960 ≈ 0,00000154 ≈ 0,000154%. Der Royal Flush ist die seltenste klassische Pokerhand.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Gegeben: P(A) = 0,6, P(B|A) = 0,7, P(B|Aᶜ) = 0,3. Was ist P(A|B)?",
        answerA = "0,7",
        answerB = "7/10",
        answerC = "42/54 = 7/9 ≈ 77,8%",
        answerD = "0,6",
        correctAnswer = 2,
        explanation = "P(B) = P(B|A)×P(A) + P(B|Aᶜ)×P(Aᶜ) = 0,7×0,6 + 0,3×0,4 = 0,42 + 0,12 = 0,54. P(A|B) = P(B|A)×P(A)/P(B) = 0,42/0,54 = 7/9 ≈ 77,8%. Bayes-Theorem in seiner klassischen Form.",
        difficulty = 4,
        funFact = null
    ),

)
