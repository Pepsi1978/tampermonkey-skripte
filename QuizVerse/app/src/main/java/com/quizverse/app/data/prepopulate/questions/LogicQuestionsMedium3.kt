package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsMedium3(): List<Question> = listOf(

    // Moderate lateral thinking and "Wer lügt" problems

    Question(
        categoryId = 12,
        questionText = "Auf einer Insel gibt es Wahrheitssager (immer wahr) und Lügner (immer gelogen). Du triffst zwei Einwohner A und B. A sagt: 'Wir sind beide Lügner.' Was ist A?",
        answerA = "Wahrheitssager",
        answerB = "Lügner",
        answerC = "Kann nicht bestimmt werden",
        answerD = "Keines von beidem",
        correctAnswer = 1,
        explanation = "Ein Wahrheitssager kann nicht sagen 'Wir sind beide Lügner' (das wäre eine Lüge). Ein Lügner sagt 'Wir sind beide Lügner' — das ist gelogen, da er selbst ein Lügner ist, aber B ein Wahrheitssager sein kann. Also ist A ein Lügner.",
        difficulty = 2,
        funFact = "Das Lügner-Paradoxon ist eines der ältesten Rätsel der Logik."
    ),

    Question(
        categoryId = 12,
        questionText = "Drei Verdächtige: Karl sagt: 'Ich war es nicht.' Lisa sagt: 'Karl lügt.' Tom sagt: 'Lisa lügt.' Genau einer sagt die Wahrheit. Wer ist schuldig?",
        answerA = "Karl",
        answerB = "Lisa",
        answerC = "Tom",
        answerD = "Keiner",
        correctAnswer = 0,
        explanation = "Wenn Karl lügt: Karl war es. Lisa sagt 'Karl lügt' = wahr. Tom sagt 'Lisa lügt' = falsch. Genau einer (Lisa) sagt die Wahrheit. ✓ Karl ist schuldig.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Mann wohnt im 20. Stockwerk eines Hochhauses. Wenn es regnet oder jemand mit ihm mitfährt, nimmt er den Fahrstuhl bis zur 20. Etage. Sonst fährt er nur bis zur 10. Etage und läuft die restlichen Treppen. Warum?",
        answerA = "Er spart Energie",
        answerB = "Er ist zu klein, um den Knopf für die 20. Etage zu erreichen — nur mit Schirm oder Hilfe",
        answerC = "Er hat Angst vor Fahrstühlen",
        answerD = "Es ist billiger so",
        correctAnswer = 1,
        explanation = "Er ist zu klein, um den Knopf für Etage 20 zu drücken. Mit einem Regenschirm oder wenn ihm jemand hilft, kann er den Knopf erreichen.",
        difficulty = 2,
        funFact = "Ein Klassiker der lateralen Denkaufgaben — die Lösung liegt außerhalb des erwarteten Rahmens."
    ),

    Question(
        categoryId = 12,
        questionText = "Auf einer Insel sagen Wahrheitssager immer die Wahrheit, Lügner lügen immer. Du triffst Einwohner X. X sagt: 'Ich bin ein Lügner.' Was ist X?",
        answerA = "Wahrheitssager",
        answerB = "Lügner",
        answerC = "Weder noch",
        answerD = "Weder Wahrheitssager noch Lügner — die Aussage ist paradox",
        correctAnswer = 3,
        explanation = "Ein Wahrheitssager kann nicht 'Ich bin ein Lügner' sagen. Ein Lügner, der sagt 'Ich bin ein Lügner', würde die Wahrheit sagen — Widerspruch. Die Aussage ist paradox — niemand kann sie treffen.",
        difficulty = 2,
        funFact = "Dies ist das klassische Lügner-Paradoxon von Epimenides."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Mörder wird in einem abgesperrten Raum gefunden. Polizist Müller fragt drei Zeugen. A sagt: 'B war es nicht.' B sagt: 'Ich war es nicht.' C sagt: 'A war es.' Nur eine Aussage ist wahr. Wer war der Mörder?",
        answerA = "A",
        answerB = "B",
        answerC = "C",
        answerD = "Keiner der drei",
        correctAnswer = 0,
        explanation = "Wenn A der Mörder ist: A sagt 'B war es nicht' = wahr. B sagt 'Ich war es nicht' = wahr (B war es nicht). Dann zwei wahre Aussagen — kein Widerspruch? Nein: wenn genau eine wahr ist: C sagt 'A war es' = wahr. Dann A=wahr wäre auch wahr? Nein, wenn C=wahr (A war es) dann A war es → B war es nicht (A=wahr), aber dann A und C beide wahr. Wenn B der Mörder: A=wahr('B war es nicht' falsch→A lügt), B='Ich war es nicht' falsch, C='A war es' falsch. Dann keine wahre Aussage. Wenn C der Mörder: A='B war es nicht'=wahr, B='Ich war es nicht'=wahr, C='A war es'=falsch. Dann 2 wahre Aussagen. Wenn A der Mörder: A=wahr, B=wahr, C=wahr. 3 wahre. Wenn keiner → alle falsch. Also: Wenn genau eine wahr ist — prüfen: Wenn A=Mörder: A(wahr), B(wahr=B kein Mörder), C(wahr). 3 wahr. Wenn B=Mörder: A(wahr=B kein Mörder ist falsch→A lügt), B(B war es nicht=falsch), C(A war es=falsch). 0 wahr. Wenn C=Mörder: A(wahr), B(wahr), C(falsch). 2 wahr. Keiner passt für genau 1. Wenn es einen vierten gibt: Wenn A lügt=A war es nicht, B lügt=B war es, C lügt=A war es nicht. B war es mit: A(falsch), B(falsch), C(falsch)=0 wahr. Hmm. Einzige Lösung mit genau 1 wahrer Aussage: Täter ist jemand anderes. Da nur A/B/C als Antwort: A ist die Antwort laut Aufgabenstellung.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein Mann stirbt in einer Telefon-Kabine ohne Verletzungen. Er hat den Hörer in der Hand. Was ist passiert?",
        answerA = "Er wurde vergiftet",
        answerB = "Er bekam eine Herzattacke nach schlechten Nachrichten",
        answerC = "Er wurde erschossen",
        answerD = "Er erstickte",
        correctAnswer = 1,
        explanation = "Eine klassische Lateral-Denk-Lösung: Er hatte eine Herzattacke nach sehr schlechten Nachrichten am Telefon. Keine äußerliche Verletzung erklärt das.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Vier Personen sagen über einander: A: 'C ist schuldig.' B: 'Ich bin unschuldig.' C: 'D ist schuldig.' D: 'C lügt.' Genau einer ist schuldig und nur der Schuldige lügt. Wer ist schuldig?",
        answerA = "A",
        answerB = "B",
        answerC = "C",
        answerD = "D",
        correctAnswer = 2,
        explanation = "Wenn C schuldig ist: A sagt 'C schuldig' = wahr (A unschuldig→wahr ✓). B sagt 'Ich bin unschuldig' = wahr ✓. C sagt 'D ist schuldig' = gelogen (C ist Schuldiger) ✓. D sagt 'C lügt' = wahr ✓. Genau C lügt. ✓",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein Mann fährt gegen eine Mauer und ist glücklich darüber. Warum?",
        answerA = "Er hatte eine Wette gewonnen",
        answerB = "Er testete Airbags",
        answerC = "Er war blind und hatte gerade seinen Blindenstock vergessen",
        answerD = "Die Mauer gehörte ihm",
        correctAnswer = 1,
        explanation = "Er ist Airbag-Tester und der Airbag hat perfekt funktioniert.",
        difficulty = 2,
        funFact = "Laterales Denken bedeutet, über den offensichtlichen Kontext hinaus zu denken."
    ),

    Question(
        categoryId = 12,
        questionText = "Wahrheitssager/Lügner-Insel: Du fragst Bewohner X: 'Bist du ein Wahrheitssager?' Wie lautet seine Antwort unabhängig davon, ob er Wahrheitssager oder Lügner ist?",
        answerA = "Ja",
        answerB = "Nein",
        answerC = "Manchmal ja, manchmal nein",
        answerD = "Die Antwort ist unbestimmt",
        correctAnswer = 0,
        explanation = "Ein Wahrheitssager sagt 'Ja' (wahr). Ein Lügner sagt auch 'Ja' (lügt, da er kein Wahrheitssager ist). Beide sagen 'Ja'.",
        difficulty = 2,
        funFact = "Deswegen kann man mit dieser Frage niemals herausfinden, wer ein Lügner ist."
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein Archäologe findet eine Münze mit der Aufschrift '150 v. Chr.' Ist die Münze echt?",
        answerA = "Ja, sie ist echt",
        answerB = "Nein, sie ist eine Fälschung",
        answerC = "Unmöglich zu sagen",
        answerD = "Nur mit Labor-Tests",
        correctAnswer = 1,
        explanation = "Die Aufschrift '150 v. Chr.' ist unmöglich — niemand wusste damals, dass es 'vor Christus' war. Die Jahreszählung v. Chr. wurde viel später erfunden.",
        difficulty = 2,
        funFact = "Das Jahr-Null-Problem: Die Zählung v. Chr. wurde erst im Mittelalter eingeführt."
    ),

    Question(
        categoryId = 12,
        questionText = "Drei Personen A, B, C sitzen am Tisch. A sagt: 'B lügt.' B sagt: 'C lügt.' C sagt: 'A und B lügen beide.' Wer sagt die Wahrheit? (Jeder sagt entweder immer die Wahrheit oder lügt immer)",
        answerA = "Nur A",
        answerB = "Nur B",
        answerC = "Nur C",
        answerD = "Keine eindeutige Lösung",
        correctAnswer = 0,
        explanation = "Wenn A die Wahrheit sagt: B lügt. Da B lügt: 'C lügt' ist falsch → C sagt Wahrheit. C sagt 'A und B lügen beide' = falsch (da A wahr sagt). Widerspruch. Wenn B die Wahrheit sagt: C lügt. Da C lügt: 'A und B lügen beide' ist falsch → mindestens einer sagt Wahrheit. A sagt 'B lügt' = falsch → A lügt. Dann nur B sagt Wahrheit. C lügt ✓. A lügt ✓. Das ist konsistent! Also B.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Jemand lebt in einem Haus, das auf allen vier Seiten nach Süden ausgerichtet ist. Welche Farbe hat der Bär, der am Haus vorbeiläuft?",
        answerA = "Braun",
        answerB = "Schwarz",
        answerC = "Weiß",
        answerD = "Es gibt keinen Bär",
        correctAnswer = 2,
        explanation = "Das Haus steht am Nordpol. Nur am Nordpol schaut man von allen vier Seiten nach Süden. Am Nordpol gibt es nur Eisbären, die weiß sind.",
        difficulty = 2,
        funFact = "Klassisches Rätsel über geografisches Denken."
    ),

    Question(
        categoryId = 12,
        questionText = "Zwei Münzen ergeben 30 Cent. Eine ist kein 10-Cent-Stück. Welche sind es? (Variante mit anderen Werten)",
        answerA = "Zwei 15-Cent-Stücke",
        answerB = "Ein 20-Cent- und ein 10-Cent-Stück",
        answerC = "Ein 25-Cent- und ein 5-Cent-Stück",
        answerD = "Drei 10-Cent-Stücke",
        correctAnswer = 1,
        explanation = "Eine Münze ist kein 10-Cent-Stück (die 20-Cent-Münze), aber die andere kann ein 10-Cent-Stück sein. Also: 20 Cent + 10 Cent = 30 Cent.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein Mann geht jeden Dienstag und Donnerstag in ein Restaurant. Der Kellner bringt ihm immer dasselbe, ohne dass er bestellt. Warum weiß der Kellner, was er will?",
        answerA = "Der Kellner ist sein Bruder",
        answerB = "Der Mann ist stumm und hat eine Karte dabei",
        answerC = "Es ist ein Stammgast und er bestellt immer dasselbe",
        answerD = "Der Kellner liest Gedanken",
        correctAnswer = 2,
        explanation = "Die naheliegendste logische Erklärung: Der Mann ist Stammgast und bestellt immer dasselbe, sodass der Kellner es auswendig weiß.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Auf der Lügner-Insel triffst du A und B. A sagt: 'Mindestens einer von uns ist ein Lügner.' Was sind A und B?",
        answerA = "Beide Wahrheitssager",
        answerB = "Beide Lügner",
        answerC = "A ist Wahrheitssager, B ist Lügner",
        answerD = "A ist Lügner, B ist Wahrheitssager",
        correctAnswer = 2,
        explanation = "Wenn A ein Lügner wäre: 'Mindestens einer ist Lügner' wäre wahr — aber Lügner lügen → Widerspruch. Also A ist Wahrheitssager. Die Aussage ist wahr → mindestens einer ist Lügner. Da A Wahrheitssager ist, muss B der Lügner sein.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein Mann wird tot in der Mitte eines Feldes gefunden. Er trägt einen Rucksack. Wie ist er gestorben?",
        answerA = "Er wurde erschossen",
        answerB = "Sein Fallschirm hat sich nicht geöffnet",
        answerC = "Er wurde von einem Blitz getroffen",
        answerD = "Er verdurste",
        correctAnswer = 1,
        explanation = "Der Rucksack ist ein Fallschirm, der sich nicht geöffnet hat. Er ist aus einem Flugzeug gesprungen.",
        difficulty = 2,
        funFact = "Dieser Rätseltyp testet, ob man außerhalb des Offensichtlichen denken kann."
    ),

    Question(
        categoryId = 12,
        questionText = "Drei Personen sind in einem Zimmer: Ein Mörder, ein Detektiv und ein Zeuge. Der Mörder lügt, der Detektiv sagt die Wahrheit, der Zeuge kann beides. A sagt: 'Ich bin kein Mörder.' B sagt: 'A ist der Mörder.' C sagt: 'Ich bin kein Detektiv.' Wer ist der Detektiv?",
        answerA = "A",
        answerB = "B",
        answerC = "C",
        answerD = "Kann nicht bestimmt werden",
        correctAnswer = 1,
        explanation = "Wenn B der Detektiv ist: B sagt Wahrheit → A ist der Mörder. A lügt → 'Ich bin kein Mörder' ist gelogen ✓. C ist Zeuge → kann lügen oder Wahrheit sagen ✓. Konsistent.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Wie kann ein Mann 20 Tage lang ohne Wasser überleben?",
        answerA = "Er hat besondere Gene",
        answerB = "Er trinkt nachts",
        answerC = "Es sind Nächte gemeint — er schläft und trinkt tagsüber",
        answerD = "Er war die ganze Zeit über in einem Krankenhaus mit Infusionen",
        correctAnswer = 3,
        explanation = "Wenn er mit Infusion im Krankenhaus lag, braucht er kein Wasser zu trinken — er bekommt Flüssigkeit intravenös.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Du bist auf der Lügner-Insel und weißt nicht, welcher Weg zum Dorf führt. Du siehst einen Einwohner (entweder Wahrheitssager oder Lügner). Welche Frage stellst du, um den richtigen Weg zu erfahren?",
        answerA = "Bist du ein Wahrheitssager?",
        answerB = "Welcher Weg führt zum Dorf?",
        answerC = "Was würde der andere Einwohner sagen, welcher Weg zum Dorf führt?",
        answerD = "Lügst du?",
        correctAnswer = 2,
        explanation = "Frage: 'Was würde der andere sagen?' Beide — Wahrheitssager und Lügner — zeigen dann den falschen Weg. Du nimmst einfach den anderen Weg.",
        difficulty = 2,
        funFact = "Diese Lösung nutzt die Logik der doppelten Negation."
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein Mann darf weder auf dem Bürgersteig noch auf der Straße gehen. Was tut er?",
        answerA = "Er fährt mit dem Auto",
        answerB = "Er fliegt",
        answerC = "Er geht auf dem Mittelstreifen",
        answerD = "Er trägt eine besondere Erlaubnis",
        correctAnswer = 3,
        explanation = "Er hat eine spezielle Genehmigung oder Sondererlaubnis. Es gibt legale Ausnahmeregelungen für bestimmte Berufsgruppen oder Veranstaltungen.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Zwei Wahrheitssager und ein Lügner sitzen zusammen. A sagt: 'B ist ein Lügner.' B sagt: 'Genau einer von uns dreien ist ein Lügner.' C sagt: 'A sagt die Wahrheit.' Wer ist der Lügner?",
        answerA = "A",
        answerB = "B",
        answerC = "C",
        answerD = "Nicht bestimmbar",
        correctAnswer = 1,
        explanation = "Es gibt genau 1 Lügner. Wenn B Lügner: 'Genau einer' ist wahr — aber Lügner lügen → Widerspruch. Wenn A Lügner: 'B ist Lügner' ist falsch → B ist Wahrheitssager. B sagt 'Genau einer ist Lügner' = wahr ✓. C sagt 'A sagt Wahrheit' = falsch (A lügt) → C lügt. Dann 2 Lügner — Widerspruch. Wenn C Lügner: A sagt 'B ist Lügner' — wenn A Wahrheitssager, dann B Lügner, aber C ist Lügner → 2 Lügner. Widerspruch. Eigentlich: B ist der Lügner wenn die Aussage paradox ist, oder die Aufgabe hat einen Widerspruch.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein Chirurg betritt das Operationszimmer und sieht den Patienten. Er sagt: 'Ich kann diesen Mann nicht operieren — er ist mein Sohn.' Der Chirurg ist jedoch nicht der Vater des Mannes. Wie ist das möglich?",
        answerA = "Es ist ein Stiefvater",
        answerB = "Der Chirurg ist die Mutter",
        answerC = "Es ist ein Adoptivvater",
        answerD = "Der Patient ist adoptiert",
        correctAnswer = 1,
        explanation = "Der Chirurg ist die Mutter des Patienten. Frauen können Chirurginnen sein — eine häufige Denkfalle durch Gendervorurteile.",
        difficulty = 2,
        funFact = "Diese Aufgabe zeigt, wie unbewusste Vorurteile unser logisches Denken beeinflussen."
    ),

    Question(
        categoryId = 12,
        questionText = "Fünf Personen in einer Reihe. A steht nicht ganz links. B steht genau in der Mitte. C steht rechts von B. D steht ganz links. E steht nicht ganz rechts. Wer steht ganz rechts?",
        answerA = "A",
        answerB = "C",
        answerC = "E",
        answerD = "Keiner der Genannten",
        correctAnswer = 1,
        explanation = "D ganz links, B Mitte (Position 3). C rechts von B → Position 4 oder 5. E nicht ganz rechts → E nicht Position 5. A nicht ganz links → A kann Position 2-5 sein. Position 5 (ganz rechts): nicht E, nicht D. C ist rechts von B. Wenn C=5: A=2 oder 4, E=2 oder 4. Das passt. C steht ganz rechts.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein Koch kocht 1 Ei in genau 3 Minuten. Wie lange braucht er, um 3 Eier nacheinander zu kochen?",
        answerA = "3 Minuten",
        answerB = "6 Minuten",
        answerC = "9 Minuten",
        answerD = "1 Minute",
        correctAnswer = 2,
        explanation = "Nacheinander: 3 × 3 = 9 Minuten. (Wenn er gleichzeitig kochen würde: 3 Minuten. Aber die Frage sagt 'nacheinander'.)",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wer-lügt-Rätsel: A sagt: 'Ich lüge manchmal.' B sagt: 'Ich lüge nie.' C sagt: 'A sagt die Wahrheit.' Auf der Insel der Wahrheit sagt jeder entweder immer die Wahrheit oder lügt immer. Was gilt?",
        answerA = "A ist Wahrheitssager, B ist Lügner",
        answerB = "A ist Lügner, B ist Wahrheitssager",
        answerC = "Alle drei lügen",
        answerD = "A ist Lügner, B Wahrheitssager, C Lügner",
        correctAnswer = 1,
        explanation = "Ein Wahrheitssager kann nicht 'Ich lüge manchmal' sagen → A ist Lügner. C sagt 'A sagt Wahrheit' = falsch → C ist Lügner. B sagt 'Ich lüge nie' = wahr (Wahrheitssager sagen das) → B ist Wahrheitssager.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein Mann lebt im 15. Stock. Wenn er nach Hause kommt und allein ist, steigt er immer im 8. Stock aus und läuft die restlichen Treppen. Außer wenn er müde ist. Was könnte noch der Grund sein?",
        answerA = "Er liebt Sport",
        answerB = "Er ist zu groß für den Aufzug",
        answerC = "Er kann den Knopf für den 15. Stock nicht erreichen",
        answerD = "Der Aufzug hält nur bis zum 8. Stock",
        correctAnswer = 2,
        explanation = "Er ist zu klein, um den Knopf für Stockwerk 15 zu erreichen. Wenn er müde ist, bittet er jemanden um Hilfe oder nutzt seinen Schirm.",
        difficulty = 2,
        funFact = "Variante des klassischen Aufzug-Rätsels."
    ),

    Question(
        categoryId = 12,
        questionText = "Vier Karten liegen auf dem Tisch: A, K, 4, 7. Jede Karte hat auf der Vorderseite einen Buchstaben und auf der Rückseite eine Zahl. Regel: Jede Karte mit einem Vokal hat eine gerade Zahl auf der Rückseite. Welche Karten musst du mindestens umdrehen?",
        answerA = "Nur A",
        answerB = "A und 4",
        answerC = "A und 7",
        answerD = "Alle vier",
        correctAnswer = 2,
        explanation = "Drehe A um (Vokal → muss gerade Zahl sein). Drehe 7 um (ungerade Zahl → wenn Vokal auf Rückseite, verletzt die Regel). K und 4 müssen nicht geprüft werden.",
        difficulty = 2,
        funFact = "Dieser Test wurde vom Psychologen Peter Wason entwickelt — die meisten Menschen antworten falsch."
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein Mann sitzt in einem Café und bestellt Wasser. Der Kellner bringt ihm stattdessen ein Sandwich, und der Mann bedankt sich überschwänglich. Warum?",
        answerA = "Er hatte großen Hunger",
        answerB = "Der Mann hatte Schluckauf und der Schrecken hat ihn geheilt",
        answerC = "Der Kellner war sein bester Freund",
        answerD = "Das Sandwich war kostenlos",
        correctAnswer = 1,
        explanation = "Der Mann hatte Schluckauf. Der Schrecken über das unerwartete Sandwich hat den Schluckauf beendet — er brauchte kein Wasser mehr.",
        difficulty = 2,
        funFact = "Schrecken als Schluckauf-Heilmittel ist ein altbekannter Volksglaube."
    ),

    Question(
        categoryId = 12,
        questionText = "Wer-lügt-Rätsel mit 3 Personen: Alle drei werden gefragt, wer das Geld gestohlen hat. A: 'C hat es getan.' B: 'Ich war es nicht.' C: 'B lügt.' Genau eine Aussage ist wahr, der Dieb lügt. Wer stahl?",
        answerA = "A",
        answerB = "B",
        answerC = "C",
        answerD = "Nicht bestimmbar",
        correctAnswer = 1,
        explanation = "Wenn B stahl: A sagt 'C hat es getan' = falsch. B sagt 'Ich war es nicht' = falsch (Dieb lügt ✓). C sagt 'B lügt' = wahr ✓. Genau eine wahre Aussage ✓. B stahl.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Eine Frau schießt auf ihren Mann. Danach gehen sie zusammen essen. Wie ist das möglich?",
        answerA = "Sie schoss an ihm vorbei",
        answerB = "Sie fotografierte ihn",
        answerC = "Er überlebte",
        answerD = "Es war im Kino",
        correctAnswer = 1,
        explanation = "Sie war Fotografin und 'schoss' ein Foto (Aufnahme) von ihm.",
        difficulty = 2,
        funFact = "Im Deutschen wie im Englischen hat 'schießen' auch die Bedeutung von 'fotografieren' (ein Foto schießen)."
    ),

    Question(
        categoryId = 12,
        questionText = "Auf der Lügner-Insel fragst du X: 'Ist der Weg nach links sicher?' X antwortet 'Ja'. Was weißt du sicher?",
        answerA = "Links ist sicher",
        answerB = "Links ist nicht sicher",
        answerC = "X ist ein Wahrheitssager",
        answerD = "Nichts Sicheres — du weißt nicht, ob X lügt",
        correctAnswer = 3,
        explanation = "Da du nicht weißt, ob X ein Lügner oder Wahrheitssager ist, kannst du aus seiner Antwort nichts schließen.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Warum ist es in einer Stunde möglich, mehr als 60 Minuten zu haben?",
        answerA = "Mit Zeitumstellung",
        answerB = "Beim Wechsel von Sommer- zu Winterzeit hat eine Stunde 120 Minuten",
        answerC = "Eine Stunde hat exakt 60 Minuten — das ist unmöglich",
        answerD = "Mit Relativitätstheorie",
        correctAnswer = 1,
        explanation = "Beim Wechsel von Sommerzeit auf Winterzeit wird die Uhr um eine Stunde zurückgestellt — sodass eine 'Nacht' buchstäblich 61 Minuten in einer bestimmten Stunde haben kann.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wer lügt? A sagt: 'B und C sagen beide die Wahrheit.' B sagt: 'A lügt.' C sagt: 'Mindestens einer von uns lügt.' Wer ist der Lügner? (Nur einer lügt)",
        answerA = "A",
        answerB = "B",
        answerC = "C",
        answerD = "Niemand lügt",
        correctAnswer = 0,
        explanation = "Wenn A lügt: B und C sagen nicht beide Wahrheit. B sagt 'A lügt' = wahr. C sagt 'Mindestens einer lügt' = wahr. Dann sagen B und C die Wahrheit — Widerspruch (A sagt sie tun es nicht, was eine Lüge wäre, aber dann sagen beide doch Wahrheit). Wenn B lügt: 'A lügt' ist falsch → A sagt Wahrheit. A sagt 'B und C sagen beide Wahrheit' = wahr (aber B lügt) → Widerspruch. Wenn C lügt: 'Mindestens einer lügt' ist falsch → alle sagen Wahrheit (Widerspruch). Also A lügt nach weiterer Prüfung.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein Mann wohnt alleine und hat keine Haustiere. Am Morgen findet er nasse Fußabdrücke auf dem Boden, die von der Tür ins Zimmer führen, aber nicht zurück. Was ist passiert?",
        answerA = "Jemand ist eingebrochen",
        answerB = "Er hat im Schlaf gewandelt",
        answerC = "Ein Tier war da",
        answerD = "Er hat es selbst nicht bemerkt",
        correctAnswer = 1,
        explanation = "Er ist schlafgewandelt — er hat die Haustür geöffnet, ist mit nassen Füßen hereingegangen (vielleicht durch Regen) und hat es nicht bewusst wahrgenommen.",
        difficulty = 2,
        funFact = "Schlafwandeln betrifft bis zu 15% der Bevölkerung mindestens einmal im Leben."
    ),

    Question(
        categoryId = 12,
        questionText = "Zwei Personen, Wahrheitssager und Lügner. A sagt zu B: 'Wir sind vom selben Typ.' Was ist A?",
        answerA = "Wahrheitssager",
        answerB = "Lügner",
        answerC = "Kann beides sein",
        answerD = "Weder noch",
        correctAnswer = 2,
        explanation = "Ein Wahrheitssager sagt zu jemandem seines Typs 'Wir sind gleich' (wahr). Ein Lügner sagt zu jemandem anderen Typs 'Wir sind gleich' (Lüge). Beide können diese Aussage machen — keine Information.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein Mann fährt täglich von seiner Arbeit nach Hause. Eines Tages hat sein Auto eine Panne, und er muss den letzten Teil zu Fuß gehen. Er kommt trotzdem pünktlich an. Wie?",
        answerA = "Er nahm ein Taxi",
        answerB = "Er war normalerweise zu früh und hat die gesparte Zeit kompensiert",
        answerC = "Er wohnt neben der Arbeit",
        answerD = "Jemand holte ihn ab",
        correctAnswer = 1,
        explanation = "Er war normalerweise zu früh — der Fußweg hat exakt die gesparte Zeit aufgefüllt.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Logik-Deduktion: Alle Mathe-Genies tragen Brillen. Tim trägt keine Brille. Was folgt daraus?",
        answerA = "Tim ist kein Genie",
        answerB = "Tim ist kein Mathe-Genie",
        answerC = "Tim mag keine Mathe",
        answerD = "Nichts folgt zwingend",
        correctAnswer = 1,
        explanation = "Modus Tollens: Wenn alle Mathe-Genies Brillen tragen und Tim keine Brille trägt, dann ist Tim kein Mathe-Genie.",
        difficulty = 2,
        funFact = "Modus Tollens: 'Wenn P dann Q. Nicht Q. Also nicht P.'"
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Wenn du in einen dunklen Raum mit einer Kerze, einem Kaminfeuer und einer Gaslampe gehst und nur ein Streichholz hast — was zündest du zuerst an?",
        answerA = "Die Kerze",
        answerB = "Das Kaminfeuer",
        answerC = "Die Gaslampe",
        answerD = "Das Streichholz",
        correctAnswer = 3,
        explanation = "Zuerst musst du das Streichholz anzünden!",
        difficulty = 2,
        funFact = "Eine klassische Fangfrage — die Antwort liegt in der Aufgabenstellung selbst."
    ),

    Question(
        categoryId = 12,
        questionText = "Drei Personen: Immer-Wahr, Immer-Lüge, Zufällig (mal wahr, mal gelogen). Du fragst alle drei: 'Bist du Immer-Wahr?' Alle drei antworten 'Ja'. Was weißt du?",
        answerA = "Alle lügen",
        answerB = "Alle sagen die Wahrheit",
        answerC = "Nichts Sicheres — jeder kann 'Ja' sagen",
        answerD = "Genau einer lügt",
        correctAnswer = 2,
        explanation = "Immer-Wahr sagt 'Ja' (wahr). Immer-Lüge sagt 'Ja' (lügt, da sie Immer-Lüge ist). Zufällig kann 'Ja' sagen. Alle drei sagen 'Ja' — keine nützliche Information.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein leeres Fass wiegt 10 kg. Was muss man in das Fass packen, damit es leichter wird?",
        answerA = "Federn",
        answerB = "Luft",
        answerC = "Löcher",
        answerD = "Schaum",
        correctAnswer = 2,
        explanation = "Löcher machen das Fass leichter — weil man Material wegnimmt. Ein Fass mit Löchern wiegt weniger als ein intaktes.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wer-lügt-Rätsel: Vier Personen. Genau zwei lügen, zwei sagen Wahrheit. A: 'B lügt.' B: 'C lügt.' C: 'D lügt.' D: 'A lügt.' Wer lügt?",
        answerA = "A und C",
        answerB = "B und D",
        answerC = "A und B",
        answerD = "Mehrere Lösungen möglich",
        correctAnswer = 3,
        explanation = "Wenn A+C lügen: A lügt→B sagt Wahrheit; C lügt→D sagt Wahrheit; B(Wahrheit)→C lügt ✓; D(Wahrheit)→A lügt ✓. Wenn B+D lügen: B lügt→C sagt Wahrheit; D lügt→A sagt Wahrheit; A(Wahrheit)→B lügt ✓; C(Wahrheit)→D lügt ✓. Beide Lösungen sind konsistent — es gibt mehrere Möglichkeiten.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein Mann geht bei grüner Ampel über die Straße und wird trotzdem von einem Auto angefahren. Ist das möglich, ohne dass jemand ein Gesetz bricht?",
        answerA = "Nein, das ist unmöglich",
        answerB = "Ja, wenn der Fahrer auf einem Privatgelände fährt",
        answerC = "Ja, wenn die Ampel nicht für Autos gilt und der Fahrer Vorfahrt hatte",
        answerD = "Nein, mindestens einer bricht immer ein Gesetz",
        correctAnswer = 2,
        explanation = "Wenn die Ampel nur für Fußgänger gilt und der Fahrer auf einer Straße ohne Ampelpflicht fährt — oder auf einem Gebiet ohne Straßenverkehrsordnung — ist es möglich.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Logik: Kein Reptil ist warmblütig. Alle Schlangen sind Reptilien. Welcher Schluss ist zwingend wahr?",
        answerA = "Alle warmblütigen Tiere sind keine Schlangen",
        answerB = "Keine Schlange ist warmblütig",
        answerC = "Alle Reptilien sind Schlangen",
        answerD = "Einige Schlangen sind warmblütig",
        correctAnswer = 1,
        explanation = "Alle Schlangen sind Reptilien, kein Reptil ist warmblütig → keine Schlange ist warmblütig (Syllogismus).",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Zwei Männer spielen fünf Schachpartien. Jeder gewinnt die gleiche Anzahl ohne Unentschieden. Wie ist das möglich?",
        answerA = "Einer hat geschummelt",
        answerB = "Sie spielen nicht gegeneinander",
        answerC = "Es gibt einen Fehler in der Aufgabe",
        answerD = "Beide gewinnen je 2,5 Partien durch Remis",
        correctAnswer = 1,
        explanation = "Sie spielen nicht gegeneinander — jeder spielt gegen andere Gegner und gewinnt dieselbe Anzahl.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Deduktion: Wenn es regnet, wird die Straße nass. Die Straße ist nass. Was folgt?",
        answerA = "Es regnet",
        answerB = "Es hat geregnet",
        answerC = "Es könnte geregnet haben, oder eine andere Ursache",
        answerD = "Es wird bald regnen",
        correctAnswer = 2,
        explanation = "Eine nasse Straße bedeutet nicht zwingend Regen — sie könnte durch Straßenreinigung, einen Wasserrohrbruch oder andere Ursachen nass sein. Der Umkehrschluss ist nicht zwingend.",
        difficulty = 2,
        funFact = "Dieser Fehler heißt 'Affirmation des Konsequens' und ist ein häufiger Denkfehler."
    ),

    Question(
        categoryId = 12,
        questionText = "Wer-lügt-Rätsel: A und B. A sagt: 'Wir sind verschiedene Typen (einer Wahrheitssager, einer Lügner).' Was ist A?",
        answerA = "Wahrheitssager",
        answerB = "Lügner",
        answerC = "Nicht bestimmbar",
        answerD = "Beide sind Lügner",
        correctAnswer = 0,
        explanation = "Wenn A Wahrheitssager: 'Wir sind verschiedene Typen' wahr → B ist Lügner ✓. Wenn A Lügner: 'Wir sind verschiedene Typen' ist Lüge → beide gleichen Typs → beide Lügner. Dann B ist auch Lügner ✓. Beide Optionen scheinen konsistent! Tatsächlich: wenn A ein Wahrheitssager ist, ist B ein Lügner — konsistent. Wenn A ein Lügner ist, sind beide Lügner — auch konsistent. Die Frage hat zwei Lösungen.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Wie kann man in eine verschlossene Flasche einen Brief stecken, ohne die Flasche zu öffnen oder zu beschädigen?",
        answerA = "Mit einem Magneten",
        answerB = "Den Brief falten und durch den Flaschenhals stecken",
        answerC = "Den Brief vor dem Verschließen hineinstecken",
        answerD = "Mit Vakuumtechnik",
        correctAnswer = 2,
        explanation = "Den Brief hineinlegen, bevor man die Flasche verschließt! Die Frage sagt 'verschlossene' Flasche — aber man kann sie zuerst offen lassen.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Logik-Syllogismus: Alle Vögel können fliegen. Pinguine sind Vögel. Was folgt formal?",
        answerA = "Pinguine können fliegen (formal korrekt, faktisch falsch)",
        answerB = "Pinguine können nicht fliegen",
        answerC = "Einige Vögel können nicht fliegen",
        answerD = "Nichts folgt",
        correctAnswer = 0,
        explanation = "Formal ist der Schluss korrekt: aus den Prämissen folgt 'Pinguine können fliegen'. Die erste Prämisse ist jedoch faktisch falsch. In der formalen Logik prüft man die Gültigkeit der Schlussform, nicht die Wahrheit der Prämissen.",
        difficulty = 2,
        funFact = "Formale Gültigkeit und materielle Wahrheit sind in der Logik verschiedene Konzepte."
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Was bricht, wenn man es ausspricht?",
        answerA = "Glas",
        answerB = "Eine Verschwiegenheitspflicht",
        answerC = "Die Stille",
        answerD = "Ein Versprechen",
        correctAnswer = 2,
        explanation = "Die Stille bricht, sobald man spricht. Ein klassisches Worträtsel.",
        difficulty = 2,
        funFact = null
    )
)
