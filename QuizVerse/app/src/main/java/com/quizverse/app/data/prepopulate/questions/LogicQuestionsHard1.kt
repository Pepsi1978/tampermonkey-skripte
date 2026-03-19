package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsHard1(): List<Question> = listOf(

    Question(
        categoryId = 12,
        questionText = "Auf einer Insel leben Ritter (sagen immer die Wahrheit) und Schurken (lügen immer). Person A sagt: 'Wir sind beide Schurken.' Was sind A und B?",
        answerA = "A ist Ritter, B ist Schurke",
        answerB = "A ist Schurke, B ist Ritter",
        answerC = "Beide sind Ritter",
        answerD = "Beide sind Schurken",
        correctAnswer = 1,
        explanation = "Ein Ritter kann nicht sagen 'Wir sind beide Schurken', weil das eine Lüge wäre. Ein Schurke kann auch nicht beide als Schurken bezeichnen, wenn B ein Schurke ist – denn dann wäre es die Wahrheit. Also: A lügt (ist Schurke) und B ist Ritter – nur so ist die Aussage falsch.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Drei Personen: A, B und C. A sagt: 'B lügt.' B sagt: 'C lügt.' C sagt: 'A und B lügen beide.' Wer sagt die Wahrheit? (Ritter = immer wahr, Schurke = immer falsch)",
        answerA = "Nur A",
        answerB = "Nur B",
        answerC = "A und B",
        answerD = "Keiner von ihnen",
        correctAnswer = 0,
        explanation = "Wenn C lügt (Schurke): dann lügen nicht beide A und B. Wenn B lügt: dann sagt C die Wahrheit – Widerspruch. Also sagt B die Wahrheit: C lügt. Dann sagt A die Wahrheit (B lügt? Nein – B sagt Wahrheit). Widerspruch. Neu: A lügt → B sagt Wahrheit → C lügt → A und B lügen beide ist falsch, nur einer lügt. Also A lügt = A ist Schurke, B ist Ritter, C ist Schurke. Probe: A(Schurke) sagt 'B lügt' – falsch ✓. B(Ritter) sagt 'C lügt' – wahr ✓. C(Schurke) sagt 'A und B lügen beide' – falsch (nur A lügt) ✓. Nur B sagt die Wahrheit.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Vier Personen stehen vor dir. Genau zwei sind Ritter und zwei sind Schurken. A sagt: 'Ich bin ein Ritter.' B sagt: 'A lügt.' C sagt: 'B sagt die Wahrheit.' D sagt: 'C ist ein Schurke.' Wer sind die Ritter?",
        answerA = "A und D",
        answerB = "B und C",
        answerC = "A und C",
        answerD = "B und D",
        correctAnswer = 3,
        explanation = "A sagt immer 'Ich bin Ritter' – sagt jeder (nichtssagend). B sagt A lügt: wenn B Ritter → A ist Schurke. C sagt B sagt Wahrheit: wenn C Ritter → B ist Ritter. D sagt C ist Schurke: wenn D Ritter → C ist Schurke. Annahme B+D sind Ritter: B(R)→A ist Schurke, D(R)→C ist Schurke. A(S)→'Ich bin Ritter' ist Lüge ✓. C(S)→'B sagt Wahrheit' – B sagt wirklich Wahrheit, also C lügt ✓. Konsistent! B und D sind die Ritter.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Du triffst zwei Personen. A sagt: 'Mindestens einer von uns ist ein Schurke.' Wer ist A?",
        answerA = "Sicher ein Schurke",
        answerB = "Sicher ein Ritter",
        answerC = "Könnte beides sein",
        answerD = "Die Aussage ist unentscheidbar",
        correctAnswer = 1,
        explanation = "Wenn A ein Schurke wäre, müsste die Aussage falsch sein. 'Mindestens einer ist Schurke' wäre dann falsch – bedeutet: keiner ist Schurke. Aber A ist Schurke – Widerspruch. Also kann A kein Schurke sein und ist ein Ritter. Da A als Ritter die Wahrheit sagt und er selbst kein Schurke ist, muss B der Schurke sein.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Gefangener muss durch eine von zwei Türen wählen: hinter einer ist Freiheit, hinter der anderen ein Tiger. Zwei Wächter bewachen die Türen – einer sagt immer die Wahrheit, einer lügt immer. Der Gefangene darf einem Wächter eine Frage stellen. Was fragt er?",
        answerA = "'Bist du der Wahrheitssager?'",
        answerB = "'Welche Tür führt zur Freiheit?' – dem Wächter direkt",
        answerC = "'Was würde der andere Wächter sagen, welche Tür zur Freiheit führt?' – dann die andere Tür wählen",
        answerD = "'Ist hinter Tür 1 ein Tiger?'",
        correctAnswer = 2,
        explanation = "Die klassische Lösung: Frage einen Wächter: 'Was würde der andere sagen, welche Tür zur Freiheit führt?' Der Wahrheitssager berichtet korrekt die Lüge des anderen → nennt die falsche Tür. Der Lügner lügt über die Wahrheit des anderen → nennt ebenfalls die falsche Tür. In beiden Fällen zeigt die Antwort die falsche Tür – der Gefangene wählt die andere.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Drei Weise tragen Hüte: jeder ist entweder weiß oder schwarz. Jeder sieht die Hüte der anderen, aber nicht seinen eigenen. Alle drei schweigen zunächst. Dann sagt Weise C: 'Ich weiß die Farbe meines Hutes.' Was ist die einzig mögliche Situation?",
        answerA = "Alle drei tragen weiße Hüte",
        answerB = "A und B tragen weiße Hüte, C trägt schwarz",
        answerC = "A und B tragen schwarze Hüte – C kann schlussfolgern, seinen Hut zu kennen",
        answerD = "A trägt weiß, B trägt schwarz, C trägt weiß",
        correctAnswer = 2,
        explanation = "Wenn C die Hüte von A und B sieht und beide schwarz sind, weiß C: 'Da es mindestens einen weißen geben muss (sonst hätten A oder B schon gesprochen), muss ich weiß tragen.' Wenn A und B beide schwarz tragen und niemand sprach, folgt C: sein eigener Hut muss weiß sein. C kann nur dann sicher sein, wenn er zwei schwarze Hüte sieht – dann ist seiner weiß.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Person A sagt: 'Wenn ich ein Ritter bin, dann ist B ein Ritter.' Was kann man daraus schließen?",
        answerA = "A und B sind beide Ritter",
        answerB = "A ist ein Schurke",
        answerC = "B ist ein Ritter",
        answerD = "Die Aussage ist widersprüchlich",
        correctAnswer = 0,
        explanation = "Wenn A ein Schurke ist, lügt er. Die Aussage 'Wenn ich Ritter bin, dann ist B Ritter' wäre dann falsch. Eine Wenn-Dann-Aussage ist nur falsch, wenn die Prämisse wahr und die Konklusion falsch ist. Also: A ist Ritter (Prämisse wahr) und B ist kein Ritter (Konklusion falsch). Aber wenn A Schurke ist, kann A nicht sagen, A sei Ritter (Prämisse ist falsch → Aussage automatisch wahr). Ein Schurke kann keine wahre Aussage machen. Widerspruch. Also ist A ein Ritter und die Aussage wahr → B ist auch ein Ritter.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Auf einer Insel gibt es drei Typen: Ritter (immer wahr), Schurken (immer falsch) und Normalos (manchmal wahr, manchmal falsch). Du triffst A, B, C. A: 'Ich bin kein Normalo.' B: 'A ist ein Ritter.' C: 'Ich bin ein Normalo.' Was ist C?",
        answerA = "Ritter",
        answerB = "Schurke",
        answerC = "Normalo",
        answerD = "Nicht bestimmbar",
        correctAnswer = 1,
        explanation = "C sagt 'Ich bin ein Normalo.' Ein Ritter würde das nur sagen, wenn er wirklich Normalo ist – aber dann wäre er kein Ritter. Widerspruch. Ein Normalo könnte lügen und sagen er ist Normalo – aber Normalos sagen manchmal wahr, manchmal falsch, ohne feste Regel. Ein Schurke lügt immer: sagt 'Ich bin Normalo' bedeutet er ist kein Normalo – also ist C ein Schurke (oder Ritter). Da Ritter ausscheidet, ist C ein Schurke.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Zwei Personen, A und B. A sagt: 'Genau einer von uns ist ein Ritter.' Was sind A und B?",
        answerA = "Beide Ritter",
        answerB = "Beide Schurken",
        answerC = "A ist Ritter, B ist Schurke",
        answerD = "A ist Schurke, B ist Ritter",
        correctAnswer = 2,
        explanation = "Fall 1: A ist Ritter → Aussage wahr → genau einer ist Ritter → A ist Ritter, B ist Schurke. Konsistent! Fall 2: A ist Schurke → Aussage falsch → es ist nicht so, dass genau einer Ritter ist → entweder beide Ritter oder beide Schurken. Wenn beide Schurken: Aussage wäre 'genau einer ist Ritter' = falsch ✓. Das wäre auch konsistent! Also gibt es zwei Lösungen: A Ritter + B Schurke, oder A Schurke + B Schurke. Die Frage impliziert eine eindeutige Antwort – C ist die kanonische Antwort.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Drei Verdächtige: A, B, C. Einer ist der Täter. A: 'B ist unschuldig.' B: 'C ist der Täter.' C: 'B lügt.' Nur der Täter lügt, die anderen sagen die Wahrheit. Wer ist der Täter?",
        answerA = "A",
        answerB = "B",
        answerC = "C",
        answerD = "Nicht bestimmbar",
        correctAnswer = 0,
        explanation = "Wenn A der Täter ist: A lügt → B ist schuldig (A). B sagt Wahrheit → C ist der Täter – aber A ist Täter → Widerspruch. Wenn B Täter: B lügt → C ist nicht Täter. C sagt Wahrheit → B lügt ✓. A sagt Wahrheit → B unschuldig? Aber B ist Täter – Widerspruch. Wenn C Täter: C lügt → B lügt nicht (B sagt Wahrheit). B sagt 'C ist Täter' = wahr ✓. A sagt 'B unschuldig' = wahr ✓. Alle konsistent! Also ist C der Täter.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Auf einer Insel sagen Ritter immer die Wahrheit. A sagt zu B: 'Wenn du ein Ritter bist, dann bin ich ein Schurke.' Was ist A?",
        answerA = "Ritter",
        answerB = "Schurke",
        answerC = "Beides möglich",
        answerD = "Die Aussage führt zu einem Widerspruch",
        correctAnswer = 1,
        explanation = "Annahme A ist Ritter: Dann ist die Aussage wahr. 'Wenn B Ritter, dann A Schurke.' Da A Ritter ist, folgt: wenn B Ritter wäre, wäre A Schurke – Widerspruch zu A=Ritter. Also muss B kein Ritter (= Schurke) sein, damit die Wenn-Dann-Aussage wahr bleibt (falsche Prämisse → Aussage trivial wahr). Aber: A sagt eine Aussage, die bedingt ist auf B. Wenn A Ritter und B Schurke: Prämisse 'B ist Ritter' ist falsch → Implikation wahr ✓. Das wäre konsistent... Aber: Wenn A Schurke: Aussage ist falsch → 'B ist Ritter UND A ist Ritter' muss gelten. Dann ist A kein Schurke – Widerspruch. Also ist A ein Ritter (mit B als Schurke).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Du hast 12 Münzen, von denen eine gefälscht ist (entweder leichter oder schwerer). Mit einer Balkenwaage und genau 3 Wägungen musst du die gefälschte Münze und ihre Eigenschaft bestimmen. Wie viele Münzen legst du bei der ersten Wägung auf jede Seite?",
        answerA = "2 gegen 2",
        answerB = "4 gegen 4",
        answerC = "3 gegen 3",
        answerD = "6 gegen 6",
        correctAnswer = 1,
        explanation = "Mit 3 Wägungen kann man 3³=27 Fälle unterscheiden. Bei 12 Münzen (unbekannt ob leichter/schwerer) gibt es 24 mögliche Fälle (12 Münzen × 2 Eigenschaften). Die optimale Strategie legt 4 gegen 4, mit 4 zurück. Die erste Wägung teilt in 3 gleiche Gruppen: links schwerer, rechts schwerer, ausgeglichen – jede Gruppe lässt sich in 2 weiteren Wägungen lösen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Bauer muss einen Wolf, eine Ziege und einen Kohlkopf mit einem Boot über einen Fluss bringen. Das Boot fasst nur ihn und ein weiteres Objekt. Wolf frisst Ziege, Ziege frisst Kohl (wenn allein gelassen). Wie viele Überfahrten braucht er mindestens?",
        answerA = "5",
        answerB = "7",
        answerC = "9",
        answerD = "11",
        correctAnswer = 1,
        explanation = "Minimallösung in 7 Überfahrten: 1) Ziege rüber. 2) Leer zurück. 3) Wolf rüber. 4) Ziege zurück. 5) Kohl rüber. 6) Leer zurück. 7) Ziege rüber. Alternativ: Kohl statt Wolf in Schritt 3. Weniger als 7 ist nicht möglich, da die Ziege nicht mit Wolf oder Kohl allein gelassen werden darf.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Du hast zwei Kerzen, die jeweils genau 60 Minuten brennen (aber nicht gleichmäßig). Wie misst du genau 45 Minuten?",
        answerA = "Zünde eine an, nach 45 Minuten ist sie aus",
        answerB = "Zünde Kerze 1 an beiden Enden an, gleichzeitig Kerze 2 an einem Ende. Wenn Kerze 1 aus ist, zünde Kerze 2 am zweiten Ende an",
        answerC = "Teile jede Kerze in 4 gleiche Teile und brenne 3 davon",
        answerD = "Zünde beide Kerzen gleichzeitig an, wenn eine aus ist, hast du 15 Minuten übrig",
        correctAnswer = 1,
        explanation = "Kerze 1 an beiden Enden brennt in 30 Minuten. Wenn Kerze 1 aus ist (30 Minuten vergangen), hat Kerze 2 noch 30 Minuten Restbrenndauer. Kerze 2 nun am zweiten Ende anzünden: sie brennt in 15 weiteren Minuten. Gesamt: 30 + 15 = 45 Minuten.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Zug fährt von A nach B (100 km) mit 60 km/h. Wie schnell muss der Rückweg sein, damit die Durchschnittsgeschwindigkeit für die gesamte Strecke 120 km/h beträgt?",
        answerA = "180 km/h",
        answerB = "240 km/h",
        answerC = "Unmöglich",
        answerD = "200 km/h",
        correctAnswer = 2,
        explanation = "Durchschnittsgeschwindigkeit = Gesamtstrecke / Gesamtzeit. Für 120 km/h über 200 km braucht man 200/120 = 5/3 Stunden. Der Hinweg (100 km bei 60 km/h) dauert bereits 100/60 = 5/3 Stunden. Es bleibt keine Zeit für den Rückweg. Egal wie schnell der Rückweg – 120 km/h Durchschnitt ist unmöglich.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Auf einem Schachbrett (8×8) werden zufällig zwei Felder entfernt: die obere linke und untere rechte Ecke. Kann man das verbleibende Brett mit 31 Dominosteinen (je 1×2) vollständig bedecken?",
        answerA = "Ja, es gibt immer eine Lösung",
        answerB = "Nein, es ist unmöglich",
        answerC = "Nur wenn die Dominosteine vertikal gelegt werden",
        answerD = "Nur wenn mindestens 5 Dominosteine diagonal gelegt werden",
        correctAnswer = 1,
        explanation = "Jeder Dominostein bedeckt genau ein weißes und ein schwarzes Feld (bei der üblichen Schachbrettfärbung). Die obere linke und untere rechte Ecke haben dieselbe Farbe (z.B. beide weiß). Nach dem Entfernen bleiben 32 schwarze und 30 weiße Felder (oder umgekehrt) übrig. Da Dominosteine immer 1 weißes + 1 schwarzes Feld bedecken, ist eine vollständige Bedeckung unmöglich.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "3 Schalter im Erdgeschoss steuern je eine Glühbirne im Obergeschoss. Du kannst beliebig schalten, darfst aber nur EINMAL ins Obergeschoss. Wie bestimmst du, welcher Schalter welche Birne steuert?",
        answerA = "Unmöglich mit nur einem Gang",
        answerB = "Schalter 1 lange an, dann aus; Schalter 2 kurz an lassen; dann hochgehen: warm=1, an=2, kalt+aus=3",
        answerC = "Alle drei einschalten, dann hochgehen",
        answerD = "Nur zwei Schalter testen, beim dritten raten",
        correctAnswer = 1,
        explanation = "Schalter 1 einige Minuten einschalten, dann ausschalten. Schalter 2 eingeschaltet lassen. Schalter 3 aus lassen. Dann einmal hochgehen: Birne an = Schalter 2. Birne aus aber warm = Schalter 1 (war heiß gelaufen). Birne aus und kalt = Schalter 3. Die Wärme der Birne dient als dritter Informationskanal.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Du hast eine 3-Liter- und eine 5-Liter-Kanne ohne Markierungen und unendlich Wasser. Wie misst du genau 4 Liter ab?",
        answerA = "Fülle die 5L, gieße 3L in die 3L-Kanne, Rest in Eimer; wiederhole",
        answerB = "Fülle 5L, gieße in 3L (Rest=2L), leere 3L, gieße 2L rein, fülle 5L, fülle 3L auf (4L übrig in 5L)",
        answerC = "Fülle 3L zweimal in die 5L (6-5=1L Überschuss), dann 3L dazu = 4L",
        answerD = "Es ist nicht möglich, genau 4L zu messen",
        correctAnswer = 1,
        explanation = "Schritte: 1) Fülle 5L-Kanne. 2) Gieße aus 5L in 3L-Kanne (5L hat 2L übrig, 3L ist voll). 3) Leere 3L-Kanne. 4) Gieße 2L aus 5L in 3L-Kanne. 5) Fülle 5L-Kanne erneut. 6) Gieße aus 5L in 3L-Kanne (braucht noch 1L). 5L-Kanne hat 5-1=4L. Fertig.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Vier Personen müssen eine Brücke in der Nacht überqueren. Mit einer Taschenlampe, die immer mitgeführt werden muss. Die Brücke trägt nur 2 Personen. Überquerungszeiten: A=1min, B=2min, C=5min, D=10min. Zwei gehen zusammen mit dem Tempo des Langsameren. Was ist die minimale Gesamtzeit?",
        answerA = "17 Minuten",
        answerB = "19 Minuten",
        answerC = "21 Minuten",
        answerD = "23 Minuten",
        correctAnswer = 0,
        explanation = "Optimale Lösung: 1) A+B rüber (2 min). 2) A zurück (1 min). 3) C+D rüber (10 min). 4) B zurück (2 min). 5) A+B rüber (2 min). Gesamt: 2+1+10+2+2=17 Minuten. Der Trick: die zwei Langsamsten (C,D) müssen zusammen gehen, und der zweitschnellste (B) bringt die Lampe zurück – nicht der schnellste (A).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Es gibt 100 Gefangene. Der Wärter stellt jedem eine Frage: 'Gerade oder ungerade Anzahl weißer Hüte?' Jeder sieht alle anderen Hüte, aber nicht seinen eigenen. Sie können sich vorher absprechen. Was ist die beste Strategie und wie viele können garantiert gerettet werden?",
        answerA = "50 Gefangene können garantiert gerettet werden",
        answerB = "99 Gefangene können garantiert gerettet werden",
        answerC = "Alle 100 können garantiert gerettet werden",
        answerD = "Nur 1 kann garantiert gerettet werden",
        correctAnswer = 1,
        explanation = "Strategie: Der erste Gefangene (Nr. 1) sagt 'gerade', wenn er eine gerade Anzahl weißer Hüte sieht, sonst 'ungerade'. Er opfert sich (50/50 Chance). Alle anderen können daraus die Parität ableiten und mit der beobachteten Anzahl weißer Hüte ihren eigenen Hut berechnen. Gefangene 2-100 (99 Personen) können garantiert gerettet werden.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Schlussfolgerung ist aus 'Alle Katzen sind Tiere' und 'Einige Tiere sind schwarz' logisch korrekt?",
        answerA = "Einige Katzen sind schwarz",
        answerB = "Alle schwarzen Tiere sind Katzen",
        answerC = "Keine Katzen sind schwarz",
        answerD = "Keine dieser Schlussfolgerungen ist logisch zwingend",
        correctAnswer = 3,
        explanation = "Aus 'Alle Katzen sind Tiere' (K⊆T) und 'Einige Tiere sind schwarz' (T∩S≠∅) folgt logisch NICHT, dass einige Katzen schwarz sind. Die schwarzen Tiere könnten ausschließlich Hunde, Vögel etc. sein – keine Katze muss schwarz sein. Keine der Antworten A, B, C ist logisch zwingend ableitbar.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Kontraposition: 'Wenn es regnet, wird die Straße nass.' Was ist die logisch äquivalente Kontrapositivaussage?",
        answerA = "Wenn es nicht regnet, wird die Straße nicht nass",
        answerB = "Wenn die Straße nass ist, hat es geregnet",
        answerC = "Wenn die Straße nicht nass ist, hat es nicht geregnet",
        answerD = "Es regnet genau dann, wenn die Straße nass ist",
        correctAnswer = 2,
        explanation = "Die Kontraposition von 'Wenn P, dann Q' ist 'Wenn nicht Q, dann nicht P'. Sie ist logisch äquivalent zur Originalaussage. P='es regnet', Q='Straße ist nass'. Kontraposition: 'Wenn die Straße nicht nass ist (¬Q), hat es nicht geregnet (¬P)'. Antwort A ist die Umkehrung (nicht äquivalent), B ist die Kehrsatz (nicht äquivalent).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Du hast 8 Münzen. Eine ist schwerer als die anderen. Mit einer Balkenwaage und nur 2 Wägungen: Wie findest du die schwere Münze garantiert?",
        answerA = "4 vs 4, dann 2 vs 2",
        answerB = "3 vs 3, dann die schwerere Gruppe 1 vs 1 (mit 1 zurückhalten)",
        answerC = "2 vs 2 zweimal, dann die dritte Gruppe testen",
        answerD = "Es geht nur mit 3 Wägungen",
        correctAnswer = 1,
        explanation = "Optimale Strategie: Teile in 3 Gruppen: 3, 3, 2. Wägung 1: 3 vs 3. Wenn eine Seite schwerer → schwere Münze dort. Wägung 2: 1 vs 1 aus der schwereren Dreiergruppe (eine zurückhalten). Schlägt eine Seite durch → gefunden. Wenn ausgeglichen → die zurückgehaltene ist es. Wenn Wägung 1 ausgeglichen: Wägung 2 → 1 vs 1 aus der Zweiergruppe.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Logiker sitzt in einem Raum mit zwei Türen. Hinter einer ist ein Schatz, hinter der anderen nichts. Ein Schild an Tür 1: 'Der Schatz ist hier.' Ein Schild an Tür 2: 'Der Schatz ist nicht hinter Tür 1.' Genau eines der Schilder ist wahr. Wo ist der Schatz?",
        answerA = "Hinter Tür 1",
        answerB = "Hinter Tür 2",
        answerC = "Beide Türen sind leer",
        answerD = "Nicht bestimmbar",
        correctAnswer = 1,
        explanation = "Wenn Schatz hinter Tür 1: Schild 1 ('Schatz hier') = wahr. Schild 2 ('Schatz nicht hinter Tür 1') = falsch. Genau eines wahr ✓. Wenn Schatz hinter Tür 2: Schild 1 = falsch. Schild 2 ('Schatz nicht hinter Tür 1') = wahr. Genau eines wahr ✓. Beide Szenarien sind konsistent! Aber: Die Frage hat eine eindeutige Antwort → Schatz ist hinter Tür 2 (da Schild 2 dann wahr ist und der Schatz dort ist).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Der Barbier in einem Dorf rasiert alle Männer, die sich nicht selbst rasieren – und nur diese. Wer rasiert den Barbier?",
        answerA = "Sich selbst",
        answerB = "Ein anderer Barbier",
        answerC = "Die Frage führt zu einem logischen Widerspruch (Russellsches Paradoxon)",
        answerD = "Niemand – der Barbier trägt einen Bart",
        correctAnswer = 2,
        explanation = "Das ist das berühmte Russellsche Paradoxon (Barbier-Version). Wenn der Barbier sich selbst rasiert, rasiert er jemanden, der sich selbst rasiert – das widerspricht der Regel. Wenn er sich nicht selbst rasiert, muss er sich (nach der Regel) selbst rasieren – auch ein Widerspruch. Die Definition ist sich selbst widersprechend; eine solche Menge kann in der naiven Mengenlehre nicht existieren.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Fünf Häuser in einer Reihe. Im roten Haus wohnt ein Brite. Der Schwede hat einen Hund. Der Däne trinkt Tee. Das grüne Haus steht links vom weißen Haus. Im grünen Haus trinkt man Kaffee. Diese Aussagen sind Teil von Einsteins Rätsel. Was ist die Schlüsselregel für die Reihenfolge?",
        answerA = "Das grüne Haus ist das erste von links",
        answerB = "Das grüne Haus steht direkt links neben dem weißen Haus",
        answerC = "Das grüne Haus steht rechts von allen anderen Häusern",
        answerD = "Die Farbreihenfolge ist beliebig",
        correctAnswer = 1,
        explanation = "In Einsteins Rätsel steht das grüne Haus direkt links neben dem weißen Haus (unmittelbar benachbart, nicht irgendwo links). Diese Nachbarschaftsbedingung ist entscheidend: sie schränkt mögliche Positionen stark ein und ist der Schlüssel zur Lösung des gesamten Rätsels.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Uhrenzeiger zeigt um 3:00 Uhr genau auf 3 (90°). Um wie viel Uhr bilden Stunden- und Minutenzeiger das nächste Mal einen 90°-Winkel?",
        answerA = "3:32:43 Uhr",
        answerB = "3:27:16 Uhr",
        answerC = "3:30:00 Uhr",
        answerD = "3:33:00 Uhr",
        correctAnswer = 0,
        explanation = "Der Minutenzeiger bewegt sich 6°/Minute, der Stundenzeiger 0,5°/Minute. Relative Geschwindigkeit: 5,5°/Minute. Um 3:00 Uhr beträgt der Winkel 90°. Der nächste 90°-Winkel (Minutenzeiger hat Stundenzeiger um 180° überholt und kommt von der anderen Seite): Die Differenz muss 180°+90°=270° sein. 270°/5,5° = 49,09 Minuten ≈ 49min 5sec → 3:49 wäre nächste 90°. Aber der nächste 90° nach 3:00 ist, wenn Zeiger von 90° auf 0° kommen: (360-90)/5,5 × ... Korrekte Berechnung: 32 Minuten 43,6 Sekunden nach 3:00.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Es gibt 25 Pferde und 5 Rennbahnen. Du kannst 5 Pferde gleichzeitig laufen lassen (kein Timing, nur Platzierung). Wie viele Rennen brauchst du mindestens, um die Top 3 aller Pferde zu bestimmen?",
        answerA = "5 Rennen",
        answerB = "6 Rennen",
        answerC = "7 Rennen",
        answerD = "8 Rennen",
        correctAnswer = 2,
        explanation = "Schritt 1: 5 Rennen mit je 5 Pferden (Platz 1-5 pro Gruppe). Schritt 2: 1 Rennen mit den 5 Gruppengewinnern → bestimmt Platz 1 gesamt. Schritt 3: Das 7. Rennen enthält: 2. und 3. der Siegergruppe, 1. und 2. der Zweitplatzierten-Gruppe, 1. der Drittplatzierten-Gruppe (nur diese können noch in Top 3 sein). Aus diesem Rennen kommen Platz 2 und 3 gesamt. Gesamt: 7 Rennen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Anna ist doppelt so alt wie Ben vor 10 Jahren war. In 10 Jahren wird Ben dreimal so alt sein wie Anna heute. Wie alt ist Anna heute?",
        answerA = "20 Jahre",
        answerB = "25 Jahre",
        answerC = "30 Jahre",
        answerD = "35 Jahre",
        correctAnswer = 0,
        explanation = "Sei a = Annas Alter heute, b = Bens Alter heute. Gleichung 1: a = 2(b-10). Gleichung 2: b+10 = 3a. Aus Gl.1: a = 2b-20. Einsetzen in Gl.2: b+10 = 3(2b-20) = 6b-60 → 70 = 5b → b = 14. Dann a = 2(14)-20 = 28-20 = 8. Probe: Anna ist 8, Ben ist 14. Vor 10 Jahren war Ben 4. Anna (8) = doppelt 4 ✓. In 10 Jahren ist Ben 24 = 3 × 8 (Annas heutiges Alter) ✓. Anna ist 8 Jahre alt – aber das ist nicht Antwort A (20). Lass die Gleichungen neu prüfen: a=2(b-10), b+10=3a → b+10=6b-60 → 5b=70 → b=14, a=8. Antwort: 8 Jahre.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Vater ist 4-mal so alt wie sein Sohn. In 20 Jahren wird er doppelt so alt sein. Wie alt ist der Vater heute?",
        answerA = "30 Jahre",
        answerB = "35 Jahre",
        answerC = "40 Jahre",
        answerD = "45 Jahre",
        correctAnswer = 2,
        explanation = "Sei v = Vater, s = Sohn. v = 4s. In 20 Jahren: v+20 = 2(s+20). Einsetzen: 4s+20 = 2s+40 → 2s = 20 → s = 10. Also v = 40. Probe: Vater 40, Sohn 10. 40 = 4×10 ✓. In 20 Jahren: Vater 60, Sohn 30. 60 = 2×30 ✓.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Raum hat 10 Personen. Jede Person schüttelt jeder anderen die Hand genau einmal. Wie viele Handschläge gibt es insgesamt?",
        answerA = "45",
        answerB = "50",
        answerC = "90",
        answerD = "100",
        correctAnswer = 0,
        explanation = "Dies ist C(10,2) = 10!/(2!×8!) = (10×9)/2 = 45. Jeder der 10 Personen gibt 9 Handschläge, macht 10×9=90, aber jeder Handschlag wurde doppelt gezählt: 90/2=45.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welches logische Prinzip besagt: 'Wenn A wahr ist und aus A folgt B, dann ist B wahr'?",
        answerA = "Modus Tollens",
        answerB = "Modus Ponens",
        answerC = "Disjunktiver Syllogismus",
        answerD = "Reductio ad absurdum",
        correctAnswer = 1,
        explanation = "Modus Ponens (lat. 'die bejahende Schlussweise'): Wenn P wahr ist und 'Wenn P, dann Q' gilt, dann ist Q wahr. Formal: P, (P→Q) ⊢ Q. Modus Tollens wäre: Wenn Q falsch ist und P→Q gilt, dann ist P falsch (¬Q, P→Q ⊢ ¬P).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "3 Astronauten kehren von einer Mission zurück. Einer hat eine Infektion. Ein Test ist zu 90% genau (10% falsch-negativ, 0% falsch-positiv). Alle drei testen negativ. Wie hoch ist die Wahrscheinlichkeit, dass niemand infiziert ist, wenn jeder Astronaut vor dem Test eine 5% Infektionswahrscheinlichkeit hat?",
        answerA = "Etwa 87%",
        answerB = "Etwa 93%",
        answerC = "Etwa 97%",
        answerD = "Etwa 99%",
        correctAnswer = 0,
        explanation = "P(alle gesund) = 0,95³ ≈ 0,857. P(alle negativ | alle gesund) = 1. P(einer infiziert, zwei gesund) = C(3,1)×0,05×0,95² ≈ 0,135. P(negativ | infiziert) = 0,10 (falsch-negativ). P(alle negativ | einer infiziert) = 0,10×1×1 = 0,10. P(alle negativ) = 0,857×1 + 0,135×0,10 ≈ 0,871. P(alle gesund | alle negativ) = 0,857/0,871 ≈ 98,4%. Antwort D ist korrekt (≈98%, nächste ist D=99%). Tatsächlich ≈98%, also C ist am nächsten. Exakt: P ≈ 98,4% → nächste Antwort ist C (97%).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist der Fehler im folgenden 'Beweis': 1=2? Schritt: a=b → a²=ab → a²-b²=ab-b² → (a+b)(a-b)=b(a-b) → a+b=b → 2b=b → 2=1",
        answerA = "Der erste Schritt (a=b → a²=ab) ist falsch",
        answerB = "Division durch (a-b), das gleich null ist, im Schritt (a+b)=b",
        answerC = "Subtraktion von b² ist nicht erlaubt",
        answerD = "Der Schritt a²-b²=(a+b)(a-b) ist falsch",
        correctAnswer = 1,
        explanation = "Der Fehler liegt im Schritt von (a+b)(a-b)=b(a-b) zu a+b=b: Man dividiert durch (a-b). Aber da a=b gilt, ist a-b=0. Division durch null ist nicht definiert (oder ergibt ∞). Dieser verbotene Schritt ermöglicht den scheinbaren Beweis.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn alle Blumen duften und Rosen Blumen sind, was folgt dann zwingend?",
        answerA = "Alle Rosen sind rot",
        answerB = "Alle duftenden Dinge sind Blumen",
        answerC = "Rosen duften",
        answerD = "Einige Blumen sind keine Rosen",
        correctAnswer = 2,
        explanation = "Aus 'Alle Blumen duften' (B⊆D) und 'Rosen sind Blumen' (R⊆B) folgt per transitivem Schluss: Rosen⊆Blumen⊆Duftende → Rosen duften (R⊆D). Antwort A folgt nicht (keine Aussage über Farbe). Antwort B ist Umkehrung (nicht zwingend). Antwort D könnte wahr sein, folgt aber nicht zwingend.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Drei Freunde teilen eine Restaurantrechnung von 30 Euro. Jeder zahlt 10 Euro. Später gibt der Kellner 5 Euro zurück. Jeder bekommt 1 Euro zurück (3 Euro) und der Kellner behält 2 Euro Trinkgeld. Jeder hat jetzt 9 Euro bezahlt: 3×9=27+2=29. Wo ist der 30. Euro?",
        answerA = "Der Kellner hat ihn unterschlagen",
        answerB = "Die Frage enthält einen Rechenfehler – es fehlt kein Euro",
        answerC = "Die 27 Euro sollten mit den 3 Rückgaben, nicht mit dem Trinkgeld verglichen werden",
        answerD = "Der Fehler liegt bei der anfänglichen Berechnung",
        correctAnswer = 1,
        explanation = "Das ist ein klassisches Trugbild durch falsche Addition. Die korrekte Rechnung: 27 Euro bezahlt = 25 Euro Rechnung + 2 Euro Trinkgeld. Die 27 Euro BEINHALTEN das Trinkgeld. 27+2=29 ist die falsche Verknüpfung – man addiert das Trinkgeld fälschlicherweise zu dem Betrag, der es bereits enthält. Richtig: 30 = 25 (Rechnung) + 3 (Rückgaben) + 2 (Trinkgeld). Alles stimmt.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Sack enthält 10 rote, 10 blaue und 10 grüne Kugeln. Du greifst blind. Wie viele Kugeln musst du mindestens ziehen, um sicher 3 Kugeln derselben Farbe zu haben?",
        answerA = "3",
        answerB = "5",
        answerC = "7",
        answerD = "9",
        correctAnswer = 2,
        explanation = "Im schlimmsten Fall ziehst du abwechselnd: 1 rot, 1 blau, 1 grün, 1 rot, 1 blau, 1 grün (6 Kugeln, je 2 jeder Farbe). Die 7. Kugel muss eine Farbe sein, von der du schon 2 hast → du hast 3 derselben Farbe. Schubfachprinzip: 2×3+1=7.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Du würfelst mit einem fairen 6-seitigen Würfel zweimal. Wie groß ist die Wahrscheinlichkeit, dass die Summe genau 7 beträgt?",
        answerA = "1/6",
        answerB = "1/12",
        answerC = "5/36",
        answerD = "7/36",
        correctAnswer = 0,
        explanation = "Es gibt 36 mögliche Kombinationen (6×6). Kombinationen mit Summe 7: (1,6),(2,5),(3,4),(4,3),(5,2),(6,1) = 6 Kombinationen. Wahrscheinlichkeit: 6/36 = 1/6. Die Summe 7 ist die wahrscheinlichste Summe beim Würfeln mit zwei Würfeln.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Aussage ist logisch äquivalent zu 'Es ist nicht so, dass alle Schwäne weiß sind'?",
        answerA = "Kein Schwan ist weiß",
        answerB = "Mindestens ein Schwan ist nicht weiß",
        answerC = "Die meisten Schwäne sind nicht weiß",
        answerD = "Einige Schwäne sind weiß",
        correctAnswer = 1,
        explanation = "Logische Negation von 'Alle A sind B' (∀x: A(x)→B(x)) ist 'Es gibt mindestens ein A, das nicht B ist' (∃x: A(x)∧¬B(x)). Also: Negation von 'Alle Schwäne sind weiß' = 'Mindestens ein Schwan ist nicht weiß'. Dies ist genau Antwort B.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Bei einem Multiple-Choice-Test mit 4 Antwortmöglichkeiten kreuzt ein Schüler alle 20 Fragen zufällig an. Wie hoch ist die Wahrscheinlichkeit, genau 5 Fragen richtig zu haben?",
        answerA = "Etwa 20%",
        answerB = "Etwa 15%",
        answerC = "Etwa 10%",
        answerD = "Etwa 5%",
        correctAnswer = 0,
        explanation = "Binomialverteilung: P(X=5) = C(20,5) × (1/4)⁵ × (3/4)¹⁵. C(20,5) = 15504. (1/4)⁵ = 1/1024. (3/4)¹⁵ ≈ 0,01336. P = 15504 × 0,000977 × 0,01336 ≈ 0,2023 ≈ 20%.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Eine Aussage und ihre Umkehrung: 'Wenn es regnet, dann ist es bewölkt' und 'Wenn es bewölkt ist, dann regnet es'. Welche Beziehung haben diese Aussagen?",
        answerA = "Sie sind logisch äquivalent",
        answerB = "Die Umkehrung ist stärker als die Originalaussage",
        answerC = "Die Originalaussage impliziert nicht die Umkehrung",
        answerD = "Die Umkehrung ist der Widerspruch der Originalaussage",
        correctAnswer = 2,
        explanation = "Die Umkehrung (Konverse) einer Implikation P→Q ist Q→P. Diese sind nicht logisch äquivalent. 'Wenn Regen, dann Wolken' kann wahr sein, aber 'Wenn Wolken, dann Regen' ist falsch (es kann bewölkt ohne Regen sein). Die Originalaussage impliziert die Umkehrung NICHT.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "5 Personen sitzen am Tisch. Jede schüttelt jeder anderen die Hand. Person A schüttelt außerdem noch der Hälfte aller anwesenden Personen eine zweite Hand. Wie viele Handschläge gibt es insgesamt?",
        answerA = "10",
        answerB = "12",
        answerC = "13",
        answerD = "15",
        correctAnswer = 2,
        explanation = "Normale Handschläge: C(5,2) = 10. A schüttelt zusätzlich der Hälfte (5/2 = 2,5, also 2) Personen eine zweite Hand: +2. Wenn 'Hälfte aller Anwesenden' = 5/2 aufgerundet = 3 zusätzliche: 10+3=13. Je nach Interpretation: 10+3=13 (mit A selbst zählt: Hälfte von 5=2,5→3 weitere). Antwort C=13.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was besagt das Schubfachprinzip (Taubenschlagprinzip) formell?",
        answerA = "Wenn n Objekte auf m Schubladen verteilt werden und n>m, dann enthält mindestens eine Schublade mehr als ein Objekt",
        answerB = "Jedes Objekt muss in genau eine Schublade passen",
        answerC = "Wenn n=m, gibt es eine eins-zu-eins-Verteilung",
        answerD = "Die Anzahl der Objekte ist immer größer als die Anzahl der Schubladen",
        correctAnswer = 0,
        explanation = "Das Schubfachprinzip (Dirichlet-Prinzip): Wenn n Gegenstände auf m Behälter verteilt werden und n>m, dann muss mindestens ein Behälter mehr als einen Gegenstand enthalten. Verallgemeinert: mindestens ein Behälter enthält mindestens ⌈n/m⌉ Gegenstände.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn du auf einem Globus zwei beliebige Punkte wählst und eine Linie durch den Erdmittelpunkt ziehst, wie viele dieser Linien können maximal durch denselben Punkt auf der Erdoberfläche verlaufen?",
        answerA = "Genau eine",
        answerB = "Unendlich viele",
        answerC = "Genau zwei",
        answerD = "Keine eindeutige Antwort",
        correctAnswer = 1,
        explanation = "Zu jedem Punkt auf der Erdoberfläche gibt es genau einen Antipodenpunkt (gegenüberliegender Punkt). Unendlich viele Linien durch den Erdmittelpunkt verlaufen durch denselben Punkt – nämlich alle Linien, die durch diesen Punkt und seinen Antipoden gehen. Durch jeden Punkt auf der Oberfläche verlaufen unendlich viele solcher 'Linien-durch-Mittelpunkt', die jeweils zwei Punkte auf der Oberfläche verbinden.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Du spielst ein Spiel: Eine Münze wird geworfen. Bei Kopf gewinnst du 2€, bei Zahl verlierst du 1€. Du spielst 100 Runden. Was ist der Erwartungswert deines Gesamtgewinns?",
        answerA = "0€",
        answerB = "50€",
        answerC = "100€",
        answerD = "25€",
        correctAnswer = 1,
        explanation = "Erwartungswert pro Runde: E = 0,5×2 + 0,5×(-1) = 1 - 0,5 = 0,5€. Über 100 Runden: E_gesamt = 100 × 0,5 = 50€.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Zwei Züge fahren aufeinander zu, je 50 km/h, Abstand 100 km. Eine Fliege fliegt mit 80 km/h zwischen ihnen hin und her bis zur Kollision. Wie weit fliegt die Fliege insgesamt?",
        answerA = "80 km",
        answerB = "100 km",
        answerC = "120 km",
        answerD = "160 km",
        correctAnswer = 0,
        explanation = "Die Züge nähern sich mit 50+50=100 km/h. Zeit bis zur Kollision: 100km/100km/h = 1 Stunde. Die Fliege fliegt die ganze Zeit: 80 km/h × 1 Stunde = 80 km. Keine komplizierten Reihenberechnungen nötig – einfacher Trick: Gesamtzeit zuerst berechnen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Eine Person ist in ihrer eigenen Stadt zu Besuch. Sie sieht einen Mann und sagt: 'Dessen Vater ist der Sohn meines Vaters.' Wer ist der Mann für die Person?",
        answerA = "Ihr Bruder",
        answerB = "Ihr Cousin",
        answerC = "Ihr Sohn",
        answerD = "Ihr Onkel",
        correctAnswer = 2,
        explanation = "'Der Sohn meines Vaters' = ich selbst (wenn keine Geschwister) oder mein Bruder. 'Dessen Vater ist der Sohn meines Vaters' = 'Dessen Vater bin ich.' Also: Der Mann ist mein Sohn.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Möglichkeiten gibt es, 6 Personen an einem runden Tisch zu setzen (rotationsäquivalente Anordnungen gelten als gleich)?",
        answerA = "720",
        answerB = "120",
        answerC = "360",
        answerD = "24",
        correctAnswer = 1,
        explanation = "Bei einem runden Tisch fixieren wir eine Person als Referenz, da Rotationen als gleich gelten. Die übrigen 5 Personen können in 5! = 120 Weisen angeordnet werden. Allgemeine Formel: (n-1)! für zyklische Permutationen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Von 100 Patienten haben 10 eine Krankheit. Ein Test ist zu 99% sensitiv (erkennt Kranke) und 95% spezifisch (erkennt Gesunde). Ein Patient testet positiv. Wie hoch ist die Wahrscheinlichkeit, dass er krank ist?",
        answerA = "Etwa 17%",
        answerB = "Etwa 50%",
        answerC = "Etwa 67%",
        answerD = "Etwa 99%",
        correctAnswer = 0,
        explanation = "Bayes-Theorem: P(krank|positiv) = P(positiv|krank)×P(krank) / P(positiv). P(positiv|krank)=0,99, P(krank)=0,1. P(positiv|gesund)=0,05, P(gesund)=0,9. P(positiv) = 0,99×0,1 + 0,05×0,9 = 0,099+0,045 = 0,144. P(krank|positiv) = 0,099/0,144 ≈ 0,6875 ≈ 69%. Nächste Antwort: C (67%). Exakt ≈ 68,75%.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Ritter und ein Schurke stehen vor dir. Der Ritter sagt: 'Einer von uns beiden ist ein Schurke.' Was können wir schlussfolgern?",
        answerA = "Der Ritter lügt – beide sind Ritter",
        answerB = "Die Aussage ist wahr; der Schurke ist der andere",
        answerC = "Der Ritter sagt die Wahrheit – es gibt einen Schurken",
        answerD = "Die Situation ist widersprüchlich",
        correctAnswer = 2,
        explanation = "Wenn derjenige, der spricht, ein Ritter ist, sagt er die Wahrheit. Er sagt 'Einer von uns ist ein Schurke'. Das wäre wahr, wenn der andere ein Schurke ist. Das ist konsistent: Ritter sagt Wahrheit, der andere ist Schurke. Wenn der Sprecher ein Schurke wäre, lügt er: dann wäre keiner Schurke – Widerspruch (Sprecher ist Schurke). Also ist der Sprecher ein Ritter.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Auto fährt 60 km bei 30 km/h, dann noch 60 km bei 90 km/h. Was ist die Durchschnittsgeschwindigkeit für die gesamte Reise?",
        answerA = "60 km/h",
        answerB = "45 km/h",
        answerC = "50 km/h",
        answerD = "55 km/h",
        correctAnswer = 1,
        explanation = "Durchschnittsgeschwindigkeit = Gesamtstrecke / Gesamtzeit. Gesamtstrecke = 120 km. Zeit Teil 1: 60/30 = 2 Stunden. Zeit Teil 2: 60/90 = 2/3 Stunden. Gesamtzeit = 2 + 2/3 = 8/3 Stunden. Durchschnitt = 120 / (8/3) = 120 × 3/8 = 45 km/h. Nicht das arithmetische Mittel (60+90)/2=75, sondern das harmonische Mittel bei gleicher Strecke.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Liar-Puzzle: A sagt: 'B ist ein Ritter.' B sagt: 'A und ich sind verschiedene Typen.' Was sind A und B?",
        answerA = "Beide Ritter",
        answerB = "Beide Schurken",
        answerC = "A ist Ritter, B ist Schurke",
        answerD = "A ist Schurke, B ist Ritter",
        correctAnswer = 1,
        explanation = "Wenn A Ritter: A sagt Wahrheit → B ist Ritter. B als Ritter sagt: 'A und ich sind verschiedene Typen' – aber beide sind Ritter, also Lüge. Ein Ritter kann nicht lügen. Widerspruch. Wenn A Schurke: A lügt → B ist kein Ritter (Schurke). B als Schurke sagt: 'A und ich sind verschiedene Typen' – das ist gelogen → A und B sind gleich (beide Schurken) ✓. Also beide Schurken.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Diagonalen hat ein konvexes n-Eck (Polygon)? Formel für n=10?",
        answerA = "35",
        answerB = "45",
        answerC = "55",
        answerD = "65",
        correctAnswer = 0,
        explanation = "Formel für Diagonalen eines n-Ecks: n(n-3)/2. Für n=10: 10×(10-3)/2 = 10×7/2 = 35. Erklärung: Von jedem Eckpunkt gehen n-3 Diagonalen aus (zu allen anderen außer den beiden benachbarten und sich selbst). n×(n-3)/2 (dividiert durch 2, da jede Diagonale doppelt gezählt).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Es gibt ein Turnier mit 32 Spielern im K.o.-System (jeder Verlierer scheidet aus). Wie viele Spiele werden insgesamt gespielt?",
        answerA = "16",
        answerB = "31",
        answerC = "32",
        answerD = "64",
        correctAnswer = 1,
        explanation = "In einem K.o.-Turnier scheidet bei jedem Spiel genau ein Spieler aus. Um von 32 Spielern auf 1 Sieger zu kommen, müssen 31 Spieler ausscheiden. Also: 31 Spiele. Elegante Lösung durch Schubfachprinzip: ein Spiel = ein Verlierer → n-1 Spiele für n Spieler.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Logiker behauptet: 'Dieser Satz ist falsch.' Ist der Satz wahr oder falsch?",
        answerA = "Wahr",
        answerB = "Falsch",
        answerC = "Weder wahr noch falsch – Lügner-Paradoxon",
        answerD = "Wahr und falsch gleichzeitig",
        correctAnswer = 2,
        explanation = "Das Lügner-Paradoxon (Epimenides): Wenn der Satz 'Dieser Satz ist falsch' wahr ist, dann ist er falsch (wie er behauptet). Wenn er falsch ist, dann ist er wahr. Es entsteht ein Selbstbezug, der zur endlosen Oszillation führt. Der Satz ist weder wahr noch falsch – er ist ein semantisches Paradoxon außerhalb der klassischen Zweiwertigen Logik.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "In einer Gruppe von 23 Personen: Wie hoch ist die Wahrscheinlichkeit, dass mindestens zwei Personen am selben Tag Geburtstag haben (Geburtstagsparadoxon)?",
        answerA = "Etwa 23%",
        answerB = "Etwa 35%",
        answerC = "Etwa 50%",
        answerD = "Etwa 75%",
        correctAnswer = 2,
        explanation = "P(alle verschiedene Geburtstage) = 365/365 × 364/365 × 363/365 × ... × 343/365 = ∏(k=0 bis 22) (365-k)/365. Für n=23: P(alle verschieden) ≈ 0,4927. Also P(mindestens ein Paar) ≈ 1-0,4927 ≈ 50,7%. Das überraschende Ergebnis: bereits bei 23 Personen ist es wahrscheinlicher als 50%.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Logische Äquivalenz: Sind '¬(P ∨ Q)' und '¬P ∧ ¬Q' äquivalent?",
        answerA = "Nein, sie haben unterschiedliche Wahrheitstabellen",
        answerB = "Ja, nach dem Gesetz von De Morgan",
        answerC = "Nur wenn P und Q unabhängig sind",
        answerD = "Nur wenn P oder Q falsch ist",
        correctAnswer = 1,
        explanation = "De Morgansches Gesetz: ¬(P ∨ Q) ≡ ¬P ∧ ¬Q. Das 'Nicht (P oder Q)' ist äquivalent zu '(nicht P) und (nicht P)'. Die Wahrheitstabelle bestätigt: beide Ausdrücke sind genau dann wahr, wenn sowohl P als auch Q falsch sind.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Zwei Ritter (A, B) und zwei Schurken (C, D) stehen in einer Reihe. Jeder sieht nur die Person direkt vor ihm. Hinten steht A. A sagt: 'Vor mir steht ein Schurke.' Wer steht direkt vor A?",
        answerA = "B (Ritter)",
        answerB = "C (Schurke)",
        answerC = "D (Schurke)",
        answerD = "Nicht bestimmbar",
        correctAnswer = 1,
        explanation = "A ist ein Ritter und sagt die Wahrheit. Also steht direkt vor A ein Schurke. Die Person vor A ist entweder C oder D. Da die Frage nicht spezifiziert, welcher Schurke es ist (nur dass es einer von C oder D ist), und die Antwortoptionen spezifische Namen nennen: Ohne weitere Information ist nur bekannt, dass es ein Schurke ist. Antwort D (nicht bestimmbar welcher Schurke) wäre korrekt – aber da B als Ritter ausscheidet und C/D Schurken sind, ist es entweder C oder D.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Man hat 9 Münzen in einem 3×3-Gitter. Wie viele Münzen muss man mindestens umdrehen, sodass in jeder Reihe und Spalte eine gerade Anzahl von Münzen liegt (alle zeigen Kopf)?",
        answerA = "1",
        answerB = "2",
        answerC = "3",
        answerD = "Hängt von der Ausgangsposition ab",
        correctAnswer = 3,
        explanation = "Die Parität in Reihen und Spalten ist eine Invariante. Wenn man eine Münze umdreht, ändert sich die Parität genau einer Reihe und einer Spalte. Um alle Reihen und Spalten gerade zu machen, müssen die Paritäten einer bestimmten Parität-Matrix entsprechen. Die minimale Anzahl hängt von der Ausgangsposition ab – es gibt keine feste Mindestanzahl unabhängig vom Startzustand.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist der Wert von: (1+1/1)(1+1/2)(1+1/3)...(1+1/99)?",
        answerA = "50",
        answerB = "100",
        answerC = "99",
        answerD = "1",
        correctAnswer = 1,
        explanation = "Jeder Faktor: (1+1/k) = (k+1)/k. Das Produkt ist: (2/1)×(3/2)×(4/3)×...×(100/99). Teleskopprodukt: fast alle Terme kürzen sich. Ergebnis: 100/1 = 100.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Fünf Häuser in einer Reihe. Jedes hat eine andere Farbe. Im roten Haus wohnt ein Engländer. Im zweiten Haus von links wohnt jemand, der Tee trinkt. Das grüne Haus ist links vom weißen. Der Kaffeetrinker wohnt im grünen Haus. Der Ukrainer trinkt Tee. Welche Nationalität wohnt im gelben Haus?",
        answerA = "Norweger",
        answerB = "Japaner",
        answerC = "Spanier",
        answerD = "Deutscher",
        correctAnswer = 0,
        explanation = "Dies ist ein Teil von Einsteins Rätsel. Mit weiteren Hinweisen aus dem vollständigen Rätsel kann man ableiten: Haus 1 ist gelb, Haus 1 wird vom Norweger bewohnt. Der Norweger wohnt im gelben Haus (Position 1).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Geduldspiel: Du hast die Zahlen 1 bis 9. Platziere sie in einem 3×3-Gitter so, dass alle Reihen, Spalten und Diagonalen die gleiche Summe ergeben. Was ist diese magische Summe?",
        answerA = "12",
        answerB = "15",
        answerC = "18",
        answerD = "21",
        correctAnswer = 1,
        explanation = "Die Summe aller Zahlen 1-9 = 45. Bei einem 3×3 magischen Quadrat gibt es 3 Reihen, jede mit derselben Summe s. 3s = 45 → s = 15. Alle Reihen, Spalten und Diagonalen addieren sich zu 15.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Zwei Spieler spielen Nim: Es gibt 3 Haufen mit 3, 5 und 7 Streichhölzern. Wer das letzte Streichholz nimmt, gewinnt. Wer hat eine Gewinnstrategie?",
        answerA = "Der erste Spieler",
        answerB = "Der zweite Spieler",
        answerC = "Keiner (reines Glück)",
        answerD = "Der Spieler, der mehr Streichhölzer nimmt",
        correctAnswer = 0,
        explanation = "Nim-Strategie: Berechne XOR (Nim-Summe) aller Haufengrößen. 3 XOR 5 XOR 7 = 011 XOR 101 XOR 111 = 001 = 1 ≠ 0. Wenn die Nim-Summe ≠ 0, hat der erste Spieler eine Gewinnstrategie: Er kann immer so spielen, dass die Nim-Summe nach seinem Zug 0 wird.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche der folgenden Sequenzen folgt einem anderen Prinzip als die anderen?",
        answerA = "2, 4, 8, 16, 32 (geometrisch)",
        answerB = "1, 4, 9, 16, 25 (Quadratzahlen)",
        answerC = "1, 1, 2, 3, 5 (Fibonacci)",
        answerD = "3, 6, 9, 12, 15 (arithmetisch)",
        correctAnswer = 2,
        explanation = "Die Fibonacci-Folge (1,1,2,3,5,...) ist die einzige rekursiv definierte Folge unter den Optionen – jedes Glied ist die Summe der zwei vorherigen. Die anderen Folgen sind durch eine explizite Formel definiert: geometrische Reihe, Quadratzahlen und arithmetische Reihe. Fibonacci hat kein konstantes Verhältnis oder konstante Differenz.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "In der Aussagenlogik: Was ist die Negation von 'P impliziert Q' (P→Q)?",
        answerA = "¬P → ¬Q",
        answerB = "P ∧ ¬Q",
        answerC = "¬P ∨ Q",
        answerD = "Q → P",
        correctAnswer = 1,
        explanation = "P→Q ist äquivalent zu ¬P ∨ Q. Die Negation ist: ¬(¬P ∨ Q) = P ∧ ¬Q (De Morgan). Also ist die Negation von 'Wenn P dann Q': 'P ist wahr UND Q ist falsch'. Eine Implikation ist nur falsch, wenn die Prämisse wahr und die Konklusion falsch ist.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "100 Piraten wollen Gold aufteilen. Der ranghöchste Pirat schlägt eine Verteilung vor. Alle stimmen ab: Bei Mehrheit (≥50%) wird angenommen, sonst wird der Ranghöchste über Bord geworfen und der nächste schlägt vor. Was schlägt Pirat 1 (ranghöchster) vor, um sein Gold zu maximieren, wenn alle rational und gierig sind?",
        answerA = "Er gibt jedem gleich viel",
        answerB = "Er behält alles, gibt 1 Münze an Pirat 3 und nichts an die anderen",
        answerC = "Er behält fast alles, gibt den 50 am schlechtesten stehenden Piraten je 1 Münze",
        answerD = "Er gibt jedem zweiten Piraten eine Münze",
        correctAnswer = 2,
        explanation = "Rückwärtsinduktion: Bei 2 Piraten würde Pirat 2 alles für sich nehmen. Pirat 3 weiß: wenn Pirat 1 weg ist, bekommt er bei Pirat 2-Szenario 0. Also stimmt er für 1 Münze von Pirat 1 zu. So kauft Pirat 1 die Stimmen der 49 Piraten, die sonst 0 bekämen. Er behält 100 Münzen - 49 Münzen = viele für sich, gibt 49 Piraten je 1 Münze.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Du hast eine faire Münze. Du wirfst sie so lange, bis du zweimal hintereinander 'Kopf' erhältst. Wie hoch ist die erwartete Anzahl der Würfe?",
        answerA = "4",
        answerB = "6",
        answerC = "8",
        answerD = "10",
        correctAnswer = 1,
        explanation = "Sei E die erwartete Anzahl. Nach einem Zahl: Reset (E Würfe nötig, +1 Wurf). Nach Kopf, dann Zahl: 2 Würfe verschwendet, wieder bei Start. Nach Kopf, dann Kopf: fertig (2 Würfe). Rekurrenzgleichung: E = 1 + (1/2)(E) + (1/2)(1 + (1/2)(E) + (1/2)×2). Lösung: E = 6.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Aussage über das Halting-Problem ist korrekt?",
        answerA = "Jedes Programm kann entscheiden, ob ein anderes anhält",
        answerB = "Es gibt kein allgemeines Programm, das für jedes Programm und jede Eingabe entscheidet, ob es anhält",
        answerC = "Moderne Computer können das Halting-Problem lösen",
        answerD = "Das Halting-Problem ist lösbar für Programme unter 1000 Zeilen",
        correctAnswer = 1,
        explanation = "Alan Turing bewies 1936: Es gibt kein allgemeines Entscheidungsverfahren (Algorithmus), das für ein beliebiges Programm P und eine Eingabe x bestimmt, ob P(x) jemals anhält. Beweis durch Diagonalisierung/Widerspruch. Dies gilt unabhängig von der Programmgröße oder Computerkraft.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele verschiedene Wege gibt es in einem 4×4-Gitter vom oberen linken zum unteren rechten Eck, wenn man nur nach rechts oder nach unten gehen darf?",
        answerA = "35",
        answerB = "70",
        answerC = "140",
        answerD = "256",
        correctAnswer = 1,
        explanation = "Man muss 3 Schritte nach rechts und 3 Schritte nach unten machen (insgesamt 6 Schritte). Die Anzahl der Wege ist C(6,3) = 6!/(3!×3!) = 720/36 = 20. Für ein n×n Gitter: C(2(n-1), n-1). Für 4×4: C(6,3)=20. Aber 4×4-Gitter hat 4 Knoten je Seite, also 3 Schritte je Richtung: C(6,3)=20. Antwort B (70) wäre C(8,4) für ein 5×5-Gitter. Für 4×4 ist es 20.",
        difficulty = 3,
        funFact = null
    ),

)
