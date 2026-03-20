package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsHard5(): List<Question> = listOf(

    // --- MONTY HALL / ZIEGENPROBLEM ---

    Question(
        categoryId = 12,
        questionText = "Beim Ziegenproblem wählst du Tür 1. Der Moderator öffnet Tür 3 (Ziege). Du darfst wechseln. Was ist deine Gewinnchance wenn du wechselst?",
        answerA = "1/2 – es sind noch zwei Türen übrig",
        answerB = "1/3 – du hattest Pech bei der Erstwahl",
        answerC = "2/3 – Wechseln verdoppelt die Gewinnchance",
        answerD = "3/4 – der Moderator hat dir geholfen",
        correctAnswer = 2,
        explanation = "Bei der Erstwahl ist die Trefferchance 1/3. Die Chance, anfangs eine Ziege gewählt zu haben, beträgt 2/3. Da der Moderator IMMER eine Ziege öffnet, konzentriert sich die 2/3-Wahrscheinlichkeit auf die verbleibende ungeöffnete Tür. Wechseln gewinnt in 2 von 3 Fällen.",
        difficulty = 3,
        funFact = "Als Marilyn vos Savant 1990 diese Lösung in ihrer Kolumne veröffentlichte, erhielt sie über 10.000 Leserbriefe – viele davon von Mathematikprofessoren – die ihr wütend widersprachen. Sie hatte trotzdem recht."
    ),

    Question(
        categoryId = 12,
        questionText = "Beim Ziegenproblem mit 100 Türen wählst du Tür 1. Der Moderator öffnet 98 Türen mit Ziegen. Wie hoch ist die Gewinnchance bei Wechsel zu Tür 57?",
        answerA = "1/100",
        answerB = "1/2",
        answerC = "99/100",
        answerD = "50/100",
        correctAnswer = 2,
        explanation = "Mit 100 Türen beträgt die Erstwahl-Trefferchance 1/100. Die Wahrscheinlichkeit 99/100, dass das Auto hinter einer der anderen 99 Türen steckt, verteilt sich nach dem Öffnen von 98 Ziegen-Türen vollständig auf die eine verbleibende Tür. Wechseln gewinnt mit 99%.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ändert sich beim Ziegenproblem, wenn der Moderator eine Tür ZUFÄLLIG öffnet (ohne zu wissen, wo das Auto ist) und zufällig eine Ziege enthüllt?",
        answerA = "Nichts – Wechseln bleibt bei 2/3 Gewinnchance",
        answerB = "Wechseln hat nur noch 1/2 Gewinnchance",
        answerC = "Wechseln hat jetzt 3/4 Gewinnchance",
        answerD = "Wechseln hat jetzt 1/3 Gewinnchance",
        correctAnswer = 1,
        explanation = "Wenn der Moderator zufällig öffnet und zufällig eine Ziege zeigt, ist das neue Information: In diesem Fall ist es nun tatsächlich 50/50. Das Wissen des Moderators ist entscheidend. Beim klassischen Monty Hall weiß der Moderator, wo das Auto ist – das macht den Unterschied.",
        difficulty = 3,
        funFact = null
    ),

    // --- GEBURTSTAGSPARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Ab wie vielen Personen in einem Raum ist die Wahrscheinlichkeit größer als 50%, dass mindestens zwei denselben Geburtstag haben?",
        answerA = "183 Personen (die Hälfte eines Jahres)",
        answerB = "57 Personen",
        answerC = "23 Personen",
        answerD = "365 Personen",
        correctAnswer = 2,
        explanation = "Bereits ab 23 Personen überschreitet die Wahrscheinlichkeit die 50%-Marke. Das liegt daran, dass nicht nach einem bestimmten Geburtstag gesucht wird, sondern nach irgendwelchen zwei Personen mit gleichem Datum. Aus 23 Personen lassen sich 23×22/2 = 253 verschiedene Paare bilden.",
        difficulty = 3,
        funFact = "Das Geburtstagsparadoxon ist die Grundlage für Geburtstagsangriffe in der Kryptographie: Ein Angreifer kann zwei Nachrichten mit demselben Hash viel schneller finden als erwartet – analog zu zwei Personen mit gleichem Geburtstag."
    ),

    Question(
        categoryId = 12,
        questionText = "In einer Gruppe von 70 Personen: Wie hoch ist die Wahrscheinlichkeit, dass mindestens zwei am selben Tag Geburtstag haben?",
        answerA = "Etwa 50%",
        answerB = "Etwa 70%",
        answerC = "Etwa 85%",
        answerD = "Über 99%",
        correctAnswer = 3,
        explanation = "Bei 70 Personen liegt die Wahrscheinlichkeit bei ca. 99,9%. Die Gegenwahrscheinlichkeit (alle haben verschiedene Geburtstage) ist (365/365) × (364/365) × ... × (296/365) ≈ 0,001. Das Paradoxon zeigt, wie schnell Wahrscheinlichkeiten gegen 1 konvergieren.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Personen braucht man, damit die Wahrscheinlichkeit > 50% ist, dass eine Person an einem BESTIMMTEN vorgegebenen Datum (z.B. 15. März) Geburtstag hat?",
        answerA = "23 Personen",
        answerB = "183 Personen",
        answerC = "253 Personen",
        answerD = "365 Personen",
        correctAnswer = 2,
        explanation = "Für einen bestimmten Tag braucht man ca. 253 Personen, um die 50%-Marke zu erreichen. Das ist der entscheidende Unterschied zum Geburtstagsparadoxon: Dort sucht man nach zwei beliebigen Personen mit gleichem Tag. Der Wechsel von 'beliebig' zu 'bestimmt' macht den riesigen Unterschied.",
        difficulty = 3,
        funFact = null
    ),

    // --- ZENON'S PARADOXIEN ---

    Question(
        categoryId = 12,
        questionText = "Zenons Paradoxon: Achilles lässt der Schildkröte 100 m Vorsprung. Bis er die 100 m zurücklegt, rückt sie 10 m vor. Bis er diese 10 m zurücklegt, rückt sie 1 m vor – usw. Was zeigt die mathematische Lösung?",
        answerA = "Achilles kann die Schildkröte nie einholen – Zenon hatte recht",
        answerB = "Die unendliche Summe konvergiert zu einem endlichen Wert – Achilles holt sie ein",
        answerC = "Achilles holt sie nur ein, wenn er schneller als 10x läuft",
        answerD = "Das Paradoxon ist bis heute ungelöst",
        correctAnswer = 1,
        explanation = "Die Abstände bilden eine geometrische Reihe: 100 + 10 + 1 + 0,1 + ... = 100/(1-0,1) = 111,1 m. Diese unendliche Summe ist endlich. Der Fehler bei Zenon: Er ignorierte, dass auch die Zeit entsprechend kürzer wird. Infinitesimalrechnung und der Grenzwertbegriff lösen das Paradoxon.",
        difficulty = 3,
        funFact = "Zenon von Elea (490–430 v. Chr.) erfand seine Paradoxien, um die Philosophie seines Lehrers Parmenides zu verteidigen: Bewegung sei eine Illusion. Die Paradoxien stimulierten 2000 Jahre später die Entwicklung der Infinitesimalrechnung durch Newton und Leibniz."
    ),

    Question(
        categoryId = 12,
        questionText = "Zenons 'Dichotomie-Paradoxon': Um einen Raum zu durchqueren, muss man zuerst die Hälfte, dann die Hälfte der Hälfte, etc. zurücklegen – unendlich viele Schritte. Warum ist das trotzdem möglich?",
        answerA = "Weil man die kleinsten Schritte einfach überspringt",
        answerB = "Weil unendlich viele Schritte endlich viel Zeit brauchen können, wenn die Zeitintervalle auch kleiner werden",
        answerC = "Weil der Raum in Wirklichkeit diskret (aus Quanten) aufgebaut ist",
        answerD = "Das Paradoxon ist nicht lösbar – wir können uns nicht wirklich bewegen",
        correctAnswer = 1,
        explanation = "Die Summe 1/2 + 1/4 + 1/8 + 1/16 + ... konvergiert gegen 1. Unendlich viele Zeitintervalle, die selbst immer kürzer werden, ergeben eine endliche Gesamtzeit. Das Paradoxon verwechselt 'unendlich viele Schritte' mit 'unendlich viel Zeit'.",
        difficulty = 3,
        funFact = null
    ),

    // --- LÜGNER-PARADOXON & SELBSTREFERENZ ---

    Question(
        categoryId = 12,
        questionText = "Der Satz 'Dieser Satz ist falsch.' – Was gilt für diesen Satz?",
        answerA = "Er ist wahr",
        answerB = "Er ist falsch",
        answerC = "Er ist weder wahr noch falsch – er führt zu einem echten logischen Widerspruch",
        answerD = "Er ist bedeutungslos, weil er kein Subjekt hat",
        correctAnswer = 2,
        explanation = "Dies ist das klassische Lügner-Paradoxon. Wenn der Satz wahr ist, dann ist er (wie er behauptet) falsch – Widerspruch. Wenn er falsch ist, dann stimmt seine Aussage, er ist also wahr – wieder Widerspruch. Kein Wahrheitswert ist konsistent zuweisbar. Gödel nutzte ähnliche Selbstreferenz für seinen Unvollständigkeitssatz.",
        difficulty = 3,
        funFact = "Epimenides von Kreta (600 v. Chr.) sagte: 'Alle Kreter lügen.' Als Kreter selbst führt das zu einem Paradoxon. Alfred Tarski zeigte 1933, dass eine konsistente Sprache nicht ihre eigene Wahrheitstheorie ausdrücken kann."
    ),

    Question(
        categoryId = 12,
        questionText = "Russells Barbier-Paradoxon: In einem Dorf rasiert der Barbier genau alle Männer, die sich nicht selbst rasieren. Wer rasiert den Barbier?",
        answerA = "Der Barbier rasiert sich selbst",
        answerB = "Ein anderer Barbier aus einem Nachbardorf",
        answerC = "Niemand – ein solcher Barbier kann logisch nicht existieren",
        answerD = "Der Bürgermeister des Dorfes",
        correctAnswer = 2,
        explanation = "Wenn der Barbier sich selbst rasiert, dann rasiert er einen Mann, der sich selbst rasiert – also dürfte er ihn nicht rasieren (Widerspruch). Wenn er sich nicht selbst rasiert, dann gehört er zur Gruppe, die er rasieren muss (Widerspruch). Die logische Schlussfolgerung: So ein Barbier kann nicht existieren. Bertrand Russell nutzte dies, um Widersprüche in der naiven Mengenlehre aufzuzeigen.",
        difficulty = 3,
        funFact = "Dieses Paradoxon führte Russell zur berühmten Typentheorie und war maßgeblich für die Entwicklung formaler Grundlagen der Mathematik. Es zeigte, dass die naive Mengenlehre von Cantor widersprüchlich ist."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Katalog listet alle Kataloge auf, die sich nicht selbst auflisten. Enthält dieser Katalog sich selbst?",
        answerA = "Ja, er muss sich selbst auflisten",
        answerB = "Nein, er darf sich nicht auflisten",
        answerC = "Das ist Russells Paradoxon – er kann sich weder selbst enthalten noch nicht enthalten",
        answerD = "Er enthält sich selbst in einem Anhang",
        correctAnswer = 2,
        explanation = "Dies ist Russells Paradoxon direkt übertragen. Wenn der Katalog sich selbst auflistet, verletzt er seine eigene Bedingung (er listet nur Kataloge, die sich NICHT selbst auflisten). Wenn er sich nicht auflistet, erfüllt er die Bedingung und müsste sich auflisten. Beide Optionen führen zum Widerspruch.",
        difficulty = 3,
        funFact = null
    ),

    // --- SIMPSON-PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Krankenhaus A hat 90% Erfolg bei leichten OPs und 30% bei schweren. Krankenhaus B hat 93% bei leichten und 50% bei schweren. Welches Krankenhaus hat insgesamt die bessere Erfolgsquote?",
        answerA = "Krankenhaus B – es ist in beiden Kategorien besser",
        answerB = "Krankenhaus A – es könnte insgesamt besser sein dank Fallverteilung",
        answerC = "Beide sind gleich gut",
        answerD = "Das lässt sich ohne mehr Daten nicht sagen, aber B gewinnt sicher",
        correctAnswer = 1,
        explanation = "Das ist das Simpson-Paradoxon! Krankenhaus A könnte insgesamt besser aussehen, wenn es hauptsächlich leichte Fälle behandelt (viele 90%-Fälle). Wenn A 1000 leichte und 100 schwere Fälle hat, B aber 100 leichte und 1000 schwere: A gesamt = 930/1100 ≈ 84,5%, B gesamt = 593/1100 ≈ 53,9%. Die Fallverteilung kehrt den Effekt um!",
        difficulty = 3,
        funFact = "Das Simpson-Paradoxon wurde 1951 von Edward Simpson beschrieben, aber schon 1899 von Karl Pearson erwähnt. Es tritt in echten Datensätzen häufig auf und hat schon zu falschen medizinischen und sozialen Schlussfolgerungen geführt."
    ),

    Question(
        categoryId = 12,
        questionText = "Medikament A hilft 80% der Männer und 40% der Frauen. Medikament B hilft nur 70% der Männer und 30% der Frauen. Trotzdem könnte B insgesamt besser abschneiden. Wie?",
        answerA = "Das ist unmöglich – A ist in beiden Gruppen besser",
        answerB = "Wenn B hauptsächlich Männer behandelt und A hauptsächlich Frauen, kann B insgesamt besser wirken",
        answerC = "Nur wenn die Stichproben unterschiedlich groß sind",
        answerD = "B kann nur dann besser sein, wenn die Werte falsch gemessen wurden",
        correctAnswer = 1,
        explanation = "Simpson-Paradoxon: Angenommen B behandelt 900 Männer und 100 Frauen: B-Gesamterfolg = 630+30 = 660/1000 = 66%. A behandelt 100 Männer und 900 Frauen: A-Gesamterfolg = 80+360 = 440/1000 = 44%. Obwohl A in jeder Untergruppe besser ist, kann B insgesamt besser erscheinen, wenn die Gruppen unterschiedlich verteilt sind.",
        difficulty = 3,
        funFact = null
    ),

    // --- BRAESS-PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Das Braess-Paradoxon besagt: In einem Verkehrsnetz kann das Hinzufügen einer neuen Straße dazu führen, dass alle länger brauchen. Warum?",
        answerA = "Neue Straßen verursachen immer mehr Unfälle",
        answerB = "Alle Fahrer optimieren egoistisch ihre Route, was zu einem neuen Gleichgewicht mit schlechterer Gesamtperformance führt",
        answerC = "Mehr Straßen bedeuten mehr Baustellen",
        answerD = "Das Paradoxon gilt nur für Einbahnstraßen",
        correctAnswer = 1,
        explanation = "Wenn eine schnelle Abkürzung hinzukommt, wählen alle Fahrer diese Route. Im Nash-Gleichgewicht (wo jeder optimal für sich handelt) kann die Gesamtfahrzeit schlechter sein als ohne die neue Straße. Das Paradoxon wurde 1968 vom deutschen Mathematiker Dietrich Braess bewiesen.",
        difficulty = 3,
        funFact = "New York City schloss 1990 die 42nd Street für eine Veranstaltung – und der Verkehr floss besser. Stuttgart sperrte 1969 eine Stadtautobahn testweise – ebenfalls mit besserem Ergebnis. Das Braess-Paradoxon wurde praktisch bestätigt."
    ),

    // --- JEVONS-PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Das Jevons-Paradoxon (1865) besagt: Wenn Maschinen effizienter werden, steigt der Ressourcenverbrauch statt zu sinken. Warum?",
        answerA = "Effizientere Maschinen sind teurer und werden daher mehr eingesetzt",
        answerB = "Höhere Effizienz senkt die Kosten pro Einheit, was die Nachfrage so stark steigert, dass der Gesamtverbrauch wächst",
        answerC = "Jevons irrte sich – moderne Studien zeigen das Gegenteil",
        answerD = "Effizienz erhöht die Produktion, was mehr Energie für Transport erfordert",
        correctAnswer = 1,
        explanation = "William Stanley Jevons beobachtete: Effizientere Dampfmaschinen machten Kohle billiger zu nutzen, weshalb viel mehr Dampfmaschinen gebaut wurden – und der Gesamtkohleverbrauch stieg drastisch. Heute: Effizientere Autos und LEDs führen oft zu mehr Fahren und mehr beleuchteten Flächen.",
        difficulty = 3,
        funFact = "Das Jevons-Paradoxon ist ein zentrales Argument in der Umweltdebatte: Energie-Effizienz allein reicht nicht aus, um den Energieverbrauch zu senken. Ohne Regulierung oder Preissignale kann Effizienz den Verbrauch sogar erhöhen – der sogenannte 'Rebound-Effekt'."
    ),

    // --- SORITES / HAUFEN-PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Das Sorites-Paradoxon (Haufen-Paradoxon): Ein Haufen Sand minus ein Korn ist noch ein Haufen. Wenn man immer ein Korn wegnimmt, bleibt es immer ein Haufen – auch bei 0 Körnern. Was ist das Problem?",
        answerA = "Die Prämisse ist falsch – ein Korn weniger macht keinen Haufen mehr",
        answerB = "Das Paradoxon zeigt, dass vage Begriffe wie 'Haufen' keine scharfe Grenze haben und klassische Logik hier versagt",
        answerC = "Es gibt eine genaue Mindestanzahl für einen Haufen, die wir nicht kennen",
        answerD = "Das Paradoxon gilt nur für physische Objekte",
        correctAnswer = 1,
        explanation = "Das Sorites-Paradoxon (griech. soros = Haufen) zeigt das Problem der Vagheit in natürlicher Sprache. Klassische Zweiwertlogik (wahr/falsch) kann mit graduellen Übergängen nicht umgehen. Lösungsansätze: Fuzzy-Logik (Grade der Wahrheit), Supervaluationismus (keine einzelne Grenze, aber alle möglichen Grenzen gültig).",
        difficulty = 3,
        funFact = "Das Paradoxon stammt von Eubulides von Milet (4. Jh. v. Chr.), dem gleichen Philosophen, der das Lügner-Paradoxon formulierte. Die 'Kahlköpfigkeit'-Version: Wann ist ein Mann kahl? Hinzufügen eines Haares macht ihn nicht weniger kahl – also ist jeder kahl."
    ),

    Question(
        categoryId = 12,
        questionText = "Eine Person ist jung. Eine um eine Sekunde ältere Person ist auch jung. Folgt daraus, dass alle Menschen jung sind – egal wie alt?",
        answerA = "Ja – die Logik ist korrekt",
        answerB = "Nein – die erste Prämisse gilt nur bis zu einem bestimmten Alter",
        answerC = "Das ist das Sorites-Paradoxon: Es zeigt, dass 'jung' kein scharf definierter Begriff ist",
        answerD = "Nein – eine Sekunde ist keine relevante Einheit",
        correctAnswer = 2,
        explanation = "Dies ist eine Variante des Sorites-Paradoxons mit dem Prädikat 'jung'. Die Induktionskette ist formal gültig, führt aber zu einem offensichtlich falschen Schluss. Das Problem liegt im vagen Prädikat 'jung', nicht in der Logik selbst. Scharfe Grenzen bei graduellen Begriffen lassen sich nicht ohne Willkür ziehen.",
        difficulty = 3,
        funFact = null
    ),

    // --- GODELS UNVOLLSTÄNDIGKEITSSATZ ---

    Question(
        categoryId = 12,
        questionText = "Gödels erster Unvollständigkeitssatz (1931) besagt: In jedem hinreichend mächtigen formalen System gibt es Aussagen, die...",
        answerA = "...wahr und beweisbar sind",
        answerB = "...wahr, aber innerhalb des Systems unbeweisbar sind",
        answerC = "...falsch und widerlegbar sind",
        answerD = "...weder wahr noch falsch sein können",
        correctAnswer = 1,
        explanation = "Gödel zeigte: Jedes widerspruchsfreie formale System, das Arithmetik enthält, hat Aussagen, die wahr sind, aber nicht innerhalb des Systems beweisbar. Das System ist also 'unvollständig'. Er konstruierte eine Aussage, die sagt: 'Diese Aussage ist nicht beweisbar' – eine mathematische Version des Lügner-Paradoxons.",
        difficulty = 3,
        funFact = "Gödels Beweis erschütterte den mathematischen Traum von David Hilbert, alle Mathematik auf ein vollständiges, widerspruchsfreies System zu gründen. Der 23-jährige Gödel zerstörte dieses 'Hilbert-Programm' mit einem Aufsatz von 25 Seiten."
    ),

    // --- SIMPSON / STATISTIK-PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "In einem Test bestanden 60% der Männer und 70% der Frauen. Trotzdem kann die Gesamtquote zeigen, dass Männer besser abschneiden. Unter welcher Bedingung?",
        answerA = "Das ist mathematisch unmöglich",
        answerB = "Wenn viel mehr Frauen an einem schwierigeren Test teilnahmen",
        answerC = "Wenn die Frauen in mehreren Runden getestet wurden",
        answerD = "Nur wenn die Stichproben gleich groß sind",
        correctAnswer = 1,
        explanation = "Simpson-Paradoxon: Wenn 1000 Männer den leichten Test (60% Bestanden) und 100 Frauen den leichten sowie 900 Frauen den schweren Test (mit z.B. 10% Quote) ablegen, kann die Gesamtquote der Männer höher erscheinen. Die versteckte Variable (Testschwierigkeit) erzeugt den Scheinseffekt.",
        difficulty = 3,
        funFact = null
    ),

    // --- ZWEI-KUVERT-PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Zwei-Kuvert-Paradoxon: Du hast Kuvert A geöffnet – es enthält 100€. Kuvert B enthält entweder 50€ oder 200€. Solltest du wechseln?",
        answerA = "Nein – 50/50-Chance, also kein Vorteil",
        answerB = "Ja – Erwartungswert von B = 125€ > 100€, also immer wechseln",
        answerC = "Das hängt von der tatsächlichen Verteilung der Beträge ab – das Paradoxon zeigt einen Fehler im Erwartungswert-Argument",
        answerD = "Ja – beim Wechsel riskierst du nur 50€, gewinnst aber 100€",
        correctAnswer = 2,
        explanation = "Das Zwei-Kuvert-Paradoxon: Der Erwartungswert-Ansatz '0,5 × 50 + 0,5 × 200 = 125 > 100' scheint Wechseln immer vorzuschlagen. Aber dann sollte man auch nach dem Wechsel wieder wechseln – absurd. Der Fehler: Die Wahrscheinlichkeiten für 50€ und 200€ sind nicht gleich – ohne Zusatzinformation kann man keine 50/50-Prior annehmen.",
        difficulty = 3,
        funFact = "Das Zwei-Kuvert-Paradoxon ist bis heute Gegenstand philosophischer Diskussionen. Es zeigt Grenzen des Bayesianischen Denkens: Wenn man keine Information über die Verteilung hat, kann man keinen Erwartungswert berechnen."
    ),

    // --- NEWCOMBS PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Newcombs Paradoxon: Ein Orakel sagt deine Entscheidungen immer richtig vorher. Box A ist transparent (1.000€ sichtbar). Box B ist undurchsichtig (1.000.000€ wenn das Orakel vorhergesagt hat, du nimmst nur B; sonst leer). Was tust du?",
        answerA = "Nur Box B nehmen – das Orakel ist zuverlässig, also ist B voll",
        answerB = "Beide Boxen nehmen – das Geld liegt bereits fest, mehr ist mehr",
        answerC = "Nur Box A – B ist eine Falle",
        answerD = "Würfeln – es gibt keine rational bessere Strategie",
        correctAnswer = 0,
        explanation = "Das ist Newcombs Paradoxon (1960, William Newcomb). 'Evidential Decision Theory' sagt: Nimm nur B (das Orakel ist zuverlässig → B ist voll). 'Causal Decision Theory' sagt: Nimm beide (die Boxen sind bereits gefüllt, deine Wahl ändert nichts mehr). Beide Positionen verteidigen renommierte Philosophen bis heute.",
        difficulty = 3,
        funFact = "Newcombs Paradoxon spaltet Philosophen und Entscheidungstheoretiker seit Jahrzehnten. Robert Nozick, der es 1969 berühmt machte, schrieb: 'Ich weiß, dass ich manchmal nachts wach liege und darüber nachdenke – was, ich gestehe, mich beunruhigt.'"
    ),

    // --- SLEEPING BEAUTY PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Sleeping Beauty wird montags geweckt. Eine faire Münze wurde geworfen: Kopf → sie wird nur Montag geweckt. Zahl → sie wird Montag und Dienstag geweckt (Gedächtnis gelöscht). Sie wird geweckt – wie hoch ist die Wahrscheinlichkeit, dass Kopf geworfen wurde?",
        answerA = "1/2 – die Münze ist fair",
        answerB = "1/3 – es gibt drei gleich wahrscheinliche Aufwachsituationen",
        answerC = "2/3 – Zahl ist wahrscheinlicher wegen mehr Aufwachmomenten",
        answerD = "Das lässt sich nicht sagen – unzureichende Information",
        correctAnswer = 0,
        explanation = "Dies ist das berühmte Sleeping-Beauty-Paradoxon mit zwei legitimen Antworten: 'Halfer' sagen 1/2 (die Münze ist fair, ihr Erwachen gibt keine neue Information). 'Thirder' sagen 1/3 (drei gleich mögliche Situationen: Kopf-Mo, Zahl-Mo, Zahl-Di). Beide Positionen haben überzeugende Argumente – das Paradoxon ist bis heute ungelöst.",
        difficulty = 3,
        funFact = "Das Sleeping-Beauty-Problem wurde 1983 von Arnold Zuboff formuliert und 2000 durch einen Aufsatz in Mind berühmt. David Lewis (Halfer) und Adam Elga (Thirder) lieferten sich einen legendären philosophischen Schlagabtausch."
    ),

    // --- PETERSBURGER PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Sankt-Petersburg-Paradoxon: Du wirfst eine Münze. Kopf bei 1. Wurf: 2€. Kopf erst bei 2. Wurf: 4€. Bei n-tem Wurf: 2^n €. Der Erwartungswert ist unendlich. Wie viel würdest du für dieses Spiel zahlen?",
        answerA = "Unendlich viel – der Erwartungswert ist unendlich",
        answerB = "Wenige Euro – Menschen zahlen in Experimenten kaum mehr als 20€",
        answerC = "Genau 100€ – ein angemessener Risikoaufschlag",
        answerD = "Gar nichts – das Spiel ist unfair",
        correctAnswer = 1,
        explanation = "Das Petersburger Paradoxon (Daniel Bernoulli, 1738): Obwohl der Erwartungswert mathematisch unendlich ist, zahlen reale Versuchspersonen selten mehr als 20-30€. Die Lösung von Bernoulli: Nutzen wächst logarithmisch mit dem Geld – grenznutzen-abnehmend. Ein unendlicher Erwartungswert bedeutet nicht unendlich viel subjektiven Nutzen.",
        difficulty = 3,
        funFact = "Das Paradoxon führte zur Entwicklung der Erwartungsnutzentheorie und später zur Prospect Theory von Kahneman und Tversky. Es zeigt, dass Menschen nicht als reine Erwartungswert-Maximierer handeln."
    ),

    // --- RAVENS PARADOXON (BESTÄTIGUNG) ---

    Question(
        categoryId = 12,
        questionText = "Hempels Raben-Paradoxon: 'Alle Raben sind schwarz' ist logisch äquivalent zu 'Alles Nicht-Schwarze ist kein Rabe.' Welche bizarre Konsequenz folgt daraus?",
        answerA = "Schwarze Raben beweisen die Hypothese nicht",
        answerB = "Ein roter Apfel, der kein Rabe ist, bestätigt die Hypothese 'Alle Raben sind schwarz'",
        answerC = "Weiße Raben widerlegen die Hypothese nicht",
        answerD = "Man kann Hypothesen über Raben nur durch Nicht-Raben prüfen",
        correctAnswer = 1,
        explanation = "Carl Hempel zeigte 1945: Da 'Alle Raben sind schwarz' logisch äquivalent zu 'Alle Nicht-Schwarzen sind Nicht-Raben' ist, müsste jedes nicht-schwarze, nicht-raben-förmige Objekt (z.B. ein roter Apfel) die Rabentheorie bestätigen. Das klingt absurd, ist aber logisch korrekt – sofern man konsequente Bestätigungstheorie annimmt.",
        difficulty = 3,
        funFact = "Hempels Raben-Paradoxon ist ein Kernproblem der Wissenschaftsphilosophie. Karl Popper löste es anders: Wissenschaft kann Theorien nie bestätigen, nur falsifizieren. Ein weißer Rabe würde die Theorie widerlegen."
    ),

    // --- ELEVATOR-PARADOXON / PRÜFUNGS-PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Prüfungs-Paradoxon: Ein Lehrer sagt 'Es wird eine Überraschungsprüfung geben – ihr werdet den Termin vorher nicht wissen.' Können die Schüler schlussfolgern, dass gar keine Prüfung stattfinden kann?",
        answerA = "Ja: Freitag ist ausgeschlossen (dann wäre es keine Überraschung). Dann Donnerstag, dann usw. – Induktion schließt alle Tage aus",
        answerB = "Nein – die Überraschungsbedingung schließt nur Freitag aus",
        answerC = "Ja, aber nur wenn der Lehrer logisch denkende Schüler hat",
        answerD = "Das Paradoxon zeigt, dass Überraschungen grundsätzlich unmöglich sind",
        correctAnswer = 0,
        explanation = "Das Surprise-Examination-Paradoxon: Die Schüler schlussfolgern korrekt, dass Freitag unmöglich ist. Dann ist Donnerstag der letzte Tag – also auch nicht überraschend. Durch Rückwärtsinduktion scheiden alle Tage aus. Trotzdem kann der Lehrer die Prüfung am Mittwoch ansetzen, und die Schüler sind überrascht! Das Paradoxon zeigt Grenzen selbstreferenzieller Vorhersagen.",
        difficulty = 3,
        funFact = "Das Surprise-Examination-Paradoxon wurde 1943 dem schwedischen Mathematiker Lennart Ekbom zugeschrieben. Willard Quine, Michael Scriven und andere Philosophen stritten jahrzehntelang über die korrekte Auflösung."
    ),

    // --- SIMPSONS PARADOXON IN SPORT ---

    Question(
        categoryId = 12,
        questionText = "Tennisspieler A gewinnt gegen schwache Gegner 90% und gegen starke 40%. Spieler B gewinnt 80% gegen schwache und 20% gegen starke. Wer könnte insgesamt besser abschneiden?",
        answerA = "Immer Spieler A – er ist in beiden Kategorien besser",
        answerB = "Spieler B könnte insgesamt besser abschneiden, wenn er hauptsächlich gegen starke Gegner spielt",
        answerC = "Sie sind gleich gut",
        answerD = "Das ist mathematisch unmöglich",
        correctAnswer = 1,
        explanation = "Simpson-Paradoxon im Sport: Wenn A hauptsächlich gegen schwache Gegner spielt und B hauptsächlich gegen starke, kann B eine höhere Gesamtgewinnquote haben. Beispiel: A: 900×0,9 + 100×0,4 = 850/1000 = 85%. B: 100×0,8 + 900×0,2 = 260/1000 = 26%. Hier gewinnt A. Aber drehe die Verteilung um und B gewinnt insgesamt.",
        difficulty = 3,
        funFact = null
    ),

    // --- DREI-GEFANGENEN-PROBLEM ---

    Question(
        categoryId = 12,
        questionText = "Drei Gefangene (A, B, C). Einer wird begnadigt – zufällig. A fragt den Wärter: 'Sag mir einen, der NICHT begnadigt wird.' Wärter nennt C. Sollte A seinen Platz mit B tauschen?",
        answerA = "Nein – jetzt ist es 50/50 zwischen A und B",
        answerB = "Ja – B hat jetzt 2/3 Chance, A noch 1/3",
        answerC = "Ja – A hat jetzt 2/3 Chance, B nur 1/3",
        answerD = "Die Aussage des Wärters ist irrelevant",
        correctAnswer = 1,
        explanation = "Dies ist eine Variante des Monty-Hall-Problems. A's Anfangschance: 1/3. Der Wärter nennt C (der nicht begnadigt wird). B's Wahrscheinlichkeit steigt auf 2/3 – ähnlich wie beim Türwechsel im Ziegenproblem. A sollte tauschen! Wichtig: Der Wärter weiß, wer begnadigt wird.",
        difficulty = 3,
        funFact = "Das Drei-Gefangenen-Problem wurde 1959 von Martin Gardner in Scientific American veröffentlicht. Es ist äquivalent zum Monty-Hall-Problem, aber viele Menschen finden es noch verwirrender, weil A und C Personen sind und keine Türen."
    ),

    // --- ARROW'S IMPOSSIBILITY THEOREM ---

    Question(
        categoryId = 12,
        questionText = "Arrows Unmöglichkeitssatz besagt: Es gibt kein Wahlsystem, das alle diese Bedingungen gleichzeitig erfüllt – außer Diktatur. Welche Bedingungen sind das?",
        answerA = "Mehrheitsentscheid, Verhältniswahl, Direktwahl",
        answerB = "Transitivität, Pareto-Effizienz, Unabhängigkeit von irrelevanten Alternativen und Nicht-Diktatur",
        answerC = "Anonymität, Neutralität, Monotonie",
        answerD = "Fairness, Repräsentation, Effizienz",
        correctAnswer = 1,
        explanation = "Kenneth Arrows Unmöglichkeitssatz (1951): Kein Wahlverfahren kann gleichzeitig transitiv sein, Pareto-optimal sein, unabhängig von irrelevanten Alternativen sein UND kein Diktator sein. Das Paradoxon zeigt, dass 'demokratisches Wählen' mathematisch unweigerlich Kompromisse erfordert.",
        difficulty = 3,
        funFact = "Arrow erhielt für diesen Satz 1972 den Wirtschaftsnobelpreis. Das Condorcet-Paradoxon (1785) zeigte früher: Bei drei Kandidaten kann A die Mehrheit gegen B, B gegen C, und C gegen A gewinnen – Mehrheitswahl ist dann zyklisch."
    ),

    // --- CONDORCET-PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Drei Wähler, drei Kandidaten. Wähler 1: A>B>C. Wähler 2: B>C>A. Wähler 3: C>A>B. Wer gewinnt bei Mehrheitswahl zwischen je zwei Kandidaten?",
        answerA = "A gewinnt eindeutig",
        answerB = "B gewinnt eindeutig",
        answerC = "Es gibt keinen Gewinner – A schlägt B, B schlägt C, C schlägt A",
        answerD = "Alle drei sind gleichwertig",
        correctAnswer = 2,
        explanation = "Das Condorcet-Paradoxon: A vs B → 2:1 für A (Wähler 1+3). B vs C → 2:1 für B (Wähler 1+2). C vs A → 2:1 für C (Wähler 2+3). Das Ergebnis ist zyklisch – keine kollektive Rangreihenfolge ist transitiv, obwohl jeder Einzelne transitiv rankt.",
        difficulty = 3,
        funFact = "Der Marquis de Condorcet entdeckte dieses Paradoxon 1785 und es erschütterte den Glauben, dass kollektive Rationalität automatisch aus individueller Rationalität folgt."
    ),

    // --- BANACH-TARSKI-PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Das Banach-Tarski-Paradoxon besagt: Eine Kugel kann in endlich viele Teile zerlegt und zu zwei gleich großen Kugeln zusammengesetzt werden. Was ist der Haken?",
        answerA = "Es widerspricht der Physik, gilt aber in der Mathematik",
        answerB = "Es gilt nur für unendlich kleine Kugeln",
        answerC = "Es setzt das Auswahlaxiom voraus und die 'Teile' sind nicht messbar (kein definiertes Volumen)",
        answerD = "Es ist mathematisch falsch und widerlegt worden",
        correctAnswer = 2,
        explanation = "Banach-Tarski (1924): Das Paradoxon ist mathematisch korrekt, aber physikalisch unmöglich. Die 'Teile' sind keine gewöhnlichen Mengen – sie haben kein messbares Volumen (nicht-messbare Mengen). Das Paradoxon verwendet das Auswahlaxiom und zeigt, dass Volumenbegriff und Mengenlehre in Konflikt geraten können.",
        difficulty = 3,
        funFact = "Das Banach-Tarski-Paradoxon wird manchmal als 'Erbsenverdopplungs-Theorem' bezeichnet: Man kann eine Erbse in Teile zerlegen und daraus die Sonne zusammensetzen. Natürlich nur in der Welt der abstrakten Mathematik."
    ),

    // --- ZENO'S STADION-PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Zenons Pfeil-Paradoxon: Ein fliegender Pfeil befindet sich in jedem einzelnen Moment an einem bestimmten Ort. In einem einzelnen Moment gibt es keine Bewegung. Wie kann der Pfeil sich also bewegen?",
        answerA = "Der Pfeil bewegt sich tatsächlich nicht – er springt von Ort zu Ort",
        answerB = "Bewegung ist die Ableitung der Position nach der Zeit – definiert über einen Grenzwert, nicht über einen einzelnen Moment",
        answerC = "Zeit kann nicht in einzelne Momente unterteilt werden",
        answerD = "Das Paradoxon ist seit Aristoteles widerlegt",
        correctAnswer = 1,
        explanation = "Zenons Pfeil-Paradoxon verwechselt 'Position zu einem Zeitpunkt' mit 'Geschwindigkeit zu einem Zeitpunkt'. Die Infinitesimalrechnung löst das: Geschwindigkeit ist die Ableitung v = dx/dt, definiert als Grenzwert. Einem einzelnen Moment entspricht dx=0 und dt=0, deren Quotient aber eine endliche Geschwindigkeit ergeben kann.",
        difficulty = 3,
        funFact = null
    ),

    // --- WITTGENSTEIN'S RULE-FOLLOWING ---

    Question(
        categoryId = 12,
        questionText = "Kripkes Wittgenstein-Paradoxon: Du hast '+' bisher nur für Zahlen unter 100 benutzt und immer korrekte Ergebnisse gehabt. Was meint '+' wirklich? Jemand behauptet, '+' bedeutet 'quus': wie Addition, aber für Zahlen ≥100 immer 5. Wie widerlegst du das?",
        answerA = "Durch einen einfachen Gegentest: 100+100 = 200, nicht 5",
        answerB = "Kripkes Paradoxon zeigt: Es gibt keine Tatsache, die bestimmt, was du mit '+' meinst – jede vergangene Nutzung ist mit einer abweichenden Regel kompatibel",
        answerC = "Die Bedeutung von '+' ist durch seine Definition festgelegt",
        answerD = "Sprache ist objektiv – '+' kann nur Addition bedeuten",
        correctAnswer = 1,
        explanation = "Saul Kripkes Wittgenstein-Paradoxon (1982): Alle bisherigen Verwendungen von '+' unter 100 sind mit unendlich vielen alternativen Regelinterpretationen kompatibel. Jeder Test liefert nur einen neuen Datenpunkt, der auch wieder mehrdeutig ist. Das Paradoxon hinterfragt die Natur von Bedeutung und mentalem Regelfolgen.",
        difficulty = 3,
        funFact = "Wittgenstein formulierte diesen Gedanken in den 'Philosophischen Untersuchungen' (posthum 1953). Kripke interpretierte ihn als Skeptizismus über Bedeutung. Das Paradoxon ist ein Kernproblem der Sprachphilosophie und Kognitionswissenschaft."
    ),

    // --- HUTSON'S PARADOXON / BASIS-RATE FALLACY ---

    Question(
        categoryId = 12,
        questionText = "Ein Test für eine seltene Krankheit (0,1% der Bevölkerung) ist 99% genau. Dein Test ist positiv. Wie hoch ist die Wahrscheinlichkeit, dass du wirklich krank bist?",
        answerA = "99% – der Test ist so genau",
        answerB = "Etwa 50%",
        answerC = "Etwa 9% – die meisten positiven Tests sind falsch",
        answerD = "0,1% – die Krankheit ist so selten",
        correctAnswer = 2,
        explanation = "Bayes-Theorem: In einer Population von 100.000 Menschen haben 100 die Krankheit (0,1%). Der Test findet 99 davon (richtig positiv). Von den 99.900 Gesunden meldet er 1% fälschlich positiv: 999 falsch positive. Insgesamt 1098 positive Tests, davon nur 99 richtig. P(krank|positiv) = 99/1098 ≈ 9%. Die seltene Grundrate dominiert.",
        difficulty = 3,
        funFact = "Die Basis-Raten-Vernachlässigung ist eine der gefährlichsten kognitiven Verzerrungen in der Medizin. Studien zeigen, dass sogar erfahrene Ärzte und Richter sie regelmäßig begehen. Mammographie-Screening ist ein reales Beispiel dieses Problems."
    ),

    Question(
        categoryId = 12,
        questionText = "Du wirfst 10 Mal hintereinander Kopf. Wie hoch ist die Wahrscheinlichkeit, dass beim 11. Wurf wieder Kopf kommt?",
        answerA = "Unter 1% – nach so vielen Köpfen muss Zahl kommen (Gambler's Fallacy)",
        answerB = "Über 99% – die Münze hat einen 'Kopf-Trend'",
        answerC = "Exakt 50% – jeder Wurf ist unabhängig",
        answerD = "Etwa 40% – leichte Tendenz zurück zur Mitte",
        correctAnswer = 2,
        explanation = "Jeder Münzwurf ist unabhängig. Die Münze hat kein Gedächtnis. Die Wahrscheinlichkeit für Kopf bleibt exakt 50%. Der Trugschluss des Spielers (Gambler's Fallacy) glaubt, vergangene Würfe beeinflussen den nächsten. Das Gegenteil – 'nach 10x Kopf kommt sicher wieder Kopf' – heißt Hot-Hand-Fallacy.",
        difficulty = 3,
        funFact = "Im Casino Monte Carlo fiel 1913 die Roulette-Kugel 26 Mal hintereinander auf Schwarz. Spieler verloren Millionen, weil sie auf Rot setzten (Gambler's Fallacy). Die Wahrscheinlichkeit für den 27. Schwarzer war dennoch 50%."
    ),

    // --- BERTRAND'S PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Bertrands Paradoxon: Eine zufällige Sehne in einem Kreis – ist sie länger als die Seite des einbeschriebenen gleichseitigen Dreiecks? Drei verschiedene 'zufällige' Methoden geben 1/3, 1/2 und 1/4 als Antwort. Was zeigt das?",
        answerA = "Nur eine der drei Methoden ist korrekt",
        answerB = "'Zufällig' ist ohne genaue Spezifikation kein eindeutiges Konzept – Wahrscheinlichkeit hängt vom Wahrscheinlichkeitsmaß ab",
        answerC = "Die Frage ist falsch gestellt",
        answerD = "Geometrische Wahrscheinlichkeit existiert nicht",
        correctAnswer = 1,
        explanation = "Joseph Bertrands Paradoxon (1889): Je nachdem, wie man 'eine zufällige Sehne' definiert (zufälliger Mittelpunkt, zufällige Endpunkte, zufälliger Neigungswinkel), erhält man verschiedene Wahrscheinlichkeiten. Das zeigt, dass 'Gleichverteilung' in kontinuierlichen Räumen ohne genaue Spezifikation keine eindeutige Bedeutung hat.",
        difficulty = 3,
        funFact = "Bertrands Paradoxon motivierte Edwin Jaynes 1973 zur Entwicklung des Prinzips der maximalen Entropie als objektive Methode, Wahrscheinlichkeiten zuzuweisen. Das Paradoxon ist ein Grundlagenproblem der Wahrscheinlichkeitstheorie."
    ),

    // --- THERMODYNAMIK / MAXWELLS DÄMON ---

    Question(
        categoryId = 12,
        questionText = "Maxwells Dämon (1867): Ein winziger Dämon sitzt zwischen zwei Gaskammern und lässt nur schnelle Moleküle in eine Kammer, langsame in die andere. Damit kühlt er eine Kammer ohne Energieaufwand. Was widerlegt das Gedankenexperiment?",
        answerA = "Der Dämon ist zu klein, um Moleküle zu unterscheiden",
        answerB = "Der Dämon muss Informationen speichern und löschen – das Löschen von Information kostet Energie (Landauer-Prinzip)",
        answerC = "Schnelle und langsame Moleküle sind nicht unterscheidbar",
        answerD = "Das Gedankenexperiment ist grundsätzlich physikalisch unmöglich",
        correctAnswer = 1,
        explanation = "Der Dämon kann tatsächlich funktionieren – aber sein Gedächtnis füllt sich. Das Löschen von Information (Landauer-Prinzip, 1961) erzeugt Wärme. Die Entropieproduktion beim Löschen ist mindestens so groß wie die Entropieabnahme durch das Sortieren. Der zweite Hauptsatz der Thermodynamik bleibt erhalten.",
        difficulty = 3,
        funFact = "Maxwells Dämon war 80 Jahre lang ungelöst. Erst Rolf Landauer zeigte 1961, dass Information physikalisch ist: Informationslöschung erzeugt Wärme. Charles Bennett bewies 1982, dass dies genau den Dämon neutralisiert. Heute ist 'Information ist physikalisch' ein Grundprinzip."
    ),

    // --- SIMONS PARADOXON / GAMBLER'S RUIN ---

    Question(
        categoryId = 12,
        questionText = "Du spielst gegen eine Bank mit fairem Münzwurf (50/50). Du startest mit 100€, die Bank hat unendlich viel Geld. Kannst du langfristig Gewinn machen?",
        answerA = "Ja – bei fairem Spiel ist es 50/50",
        answerB = "Nein – mit Sicherheit verlierst du irgendwann alles (Gambler's Ruin)",
        answerC = "Ja, wenn du eine gute Strategie verwendest",
        answerD = "50% Chance, deinen Einsatz zu verdoppeln, bevor du alles verlierst",
        correctAnswer = 1,
        explanation = "Das Gambler's Ruin Theorem: Wenn die Bank unbegrenzte Ressourcen hat und du endliche, wirst du mit Wahrscheinlichkeit 1 irgendwann ruiniert. Auch bei fairem Spiel! Deine Gewinnwahrscheinlichkeit vor dem Ruin = dein Startkapital / (dein Kapital + Bankkapital) → 0 wenn Bankkapital → ∞.",
        difficulty = 3,
        funFact = null
    ),

    // --- ALLAIS-PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Allais-Paradoxon: Option A: 100% Chance auf 1 Mio. €. Option B: 89% auf 1 Mio. €, 10% auf 5 Mio. €, 1% auf 0. Die meisten wählen A. Nun: Option C: 11% auf 1 Mio. €, 89% auf 0. Option D: 10% auf 5 Mio. €, 90% auf 0. Die meisten wählen D. Warum ist das paradox?",
        answerA = "Weil A und D verschiedene Summen beinhalten",
        answerB = "Weil die Wahl A>B und D>C gleichzeitig die Erwartungsnutzentheorie verletzt – es gibt kein konsistentes Nutzensystem",
        answerC = "Weil Option B mehr Erwartungswert hat",
        answerD = "Die Entscheidungen sind vollkommen rational",
        correctAnswer = 1,
        explanation = "Maurice Allais zeigte 1953: Die typischen Wahlmuster A>B und D>C sind mathematisch inkonsistent mit der Erwartungsnutzentheorie. Man kann keine Nutzenfunktion finden, die beide Präferenzen gleichzeitig erklärt. Das Paradoxon widerlegte die dominierende Entscheidungstheorie und führte zur Prospect Theory.",
        difficulty = 3,
        funFact = "Als Allais 1952 das Paradoxon Paul Samuelson und anderen Ökonomen vorlegte, tappten sie in die Falle. Samuelson antwortete: 'Wenn ich so gewählt habe, dann wähle ich irrational.' Allais erhielt 1988 den Wirtschaftsnobelpreis."
    ),

    // --- WARTESCHLANGEN-PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Warum ist die Schlange, in der du stehst, fast immer die langsamste – selbst wenn du zufällig wählst?",
        answerA = "Weil du immer Pech hast",
        answerB = "Das Prüfungs-Paradoxon – du bist auf lange Schlangen konditioniert",
        answerC = "Das Inspektions-Paradoxon: Du wählst zufällig, aber die Wahrscheinlichkeit, in einer langen Schlange zu landen, ist proportional zur Länge",
        answerD = "Weil Kassierer in langen Schlangen langsamer arbeiten",
        correctAnswer = 2,
        explanation = "Das Inspection-Paradoxon (auch Bus-Paradoxon): Wenn Schlangenlängen zufällig variieren, landest du mit höherer Wahrscheinlichkeit in einer längeren Schlange – einfach weil dort mehr Plätze sind. Auch bei Buswartzeiten: Du wartest im Schnitt länger als die mittlere Taktzeit, weil du mit höherer Wahrscheinlichkeit in eine große Lücke hineingerätst.",
        difficulty = 3,
        funFact = "Das Inspektions-Paradoxon erklärt auch, warum die meisten Studenten in Kursen sitzen, die im Schnitt voller sind als der Durchschnittskurs: Volle Kurse haben mehr Studenten, also mehr Beobachter."
    ),

    // --- ELLSBERG-PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Ellsberg-Paradoxon: Urne A hat 50 rote und 50 blaue Kugeln. Urne B hat 100 Kugeln (Rot/Blau unbekannt). Menschen bevorzugen Urne A für beide Farben. Was verstößt das gegen die Entscheidungstheorie?",
        answerA = "Es verstößt gegen das Gesetz der großen Zahlen",
        answerB = "Es zeigt Ambiguity Aversion – Menschen vermeiden Ungewissheit mehr als Risiko, was gegen subjektive Erwartungsnutzentheorie verstößt",
        answerC = "Urne B hat objektiv schlechtere Gewinnchancen",
        answerD = "Die Präferenz ist vollkommen rational",
        correctAnswer = 1,
        explanation = "Daniel Ellsberg (1961): Wenn jemand Urne A für Rot-Wetten UND für Blau-Wetten bevorzugt, impliziert das, dass er P(Rot in B) < 50% UND P(Blau in B) < 50% glaubt – was unmöglich ist. Menschen weichen Ambiguität (unbekannte Wahrscheinlichkeiten) stärker aus als Risiko (bekannte Wahrscheinlichkeiten).",
        difficulty = 3,
        funFact = "Daniel Ellsberg ist vor allem als der Mann bekannt, der die Pentagon Papers veröffentlichte. Sein Paradoxon veröffentlichte er 1961 als Doktorarbeit in Harvard. Kognitive Ambiguitätsaversion ist seither ein Forschungsfeld in Verhaltensökonomie und Psychologie."
    ),

    // --- CURRY-PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Currys Paradoxon: Der Satz S lautet: 'Wenn S wahr ist, dann ist der Mond aus Käse.' Was lässt sich aus S logisch ableiten?",
        answerA = "Nichts – S ist bedeutungslos",
        answerB = "Dass der Mond aus Käse ist – durch reines logisches Schlussfolgern",
        answerC = "Dass S falsch ist",
        answerD = "Dass der Satz selbstwidersprüchlich ist",
        correctAnswer = 1,
        explanation = "Beweis: Angenommen S ist wahr. Dann gilt: 'Wenn S wahr ist, dann Mond aus Käse' (das ist S selbst). Also: Mond aus Käse. Also ist Mond aus Käse wahr, wenn S wahr ist – das heißt S ist wahr. Daraus folgt: Mond aus Käse. Das Paradoxon entsteht durch Selbstreferenz und zeigt, dass naive Wahrheitstheorien zu beliebigen Schlüssen führen.",
        difficulty = 3,
        funFact = "Haskell Curry entdeckte dieses Paradoxon 1942. Es zeigt, dass Lügner-artige Paradoxien nicht nur zu Widersprüchen führen, sondern beliebige Aussagen 'beweisbar' machen können. Logiker nennen das 'Explosion' (ex falso quodlibet)."
    ),

    // --- GRANDFATHERS-PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Das Großvater-Paradoxon der Zeitreise: Du reist in die Vergangenheit und tötest deinen Großvater, bevor dein Vater geboren wird. Was folgt?",
        answerA = "Du existierst dann nicht mehr – und kannst also nicht zurückgereist sein",
        answerB = "Die Zeitlinie teilt sich in eine parallele Realität",
        answerC = "Du bleibst existent, weil du in der Vergangenheit bereits warst",
        answerD = "Das Paradoxon zeigt, dass Zeitreisen physikalisch unmöglich sind – oder konsistente Zeitlinien erzwingen",
        correctAnswer = 3,
        explanation = "Das Großvaterparadoxon zeigt einen logischen Widerspruch in Zeitreisen mit veränderbarer Vergangenheit. Lösungen: 1) Zeitreisen sind unmöglich (Chronologie-Schutzvermutung, Hawking). 2) Konsistenz-Zwang: Du kannst nicht töten, weil irgendetwas es verhindern wird (Novikov-Selbstkonsistenzprinzip). 3) Parallele Zeitlinien (Many-Worlds). Keine Lösung ist bewiesen.",
        difficulty = 3,
        funFact = "Igor Novikov (russischer Kosmologe) schlug das Selbstkonsistenzprinzip vor: Ereignisse in der Vergangenheit müssen konsistent sein mit der Zukunft, aus der der Reisende kommt. Die Zeitlinie ist unveränderbar – man kann nur das tun, was bereits geschehen ist."
    ),

    // --- DAS SORITES BEI IDENTITÄT ---

    Question(
        categoryId = 12,
        questionText = "Schiff des Theseus: Ein Schiff wird Brett für Brett ersetzt. Wenn alle Bretter ausgetauscht sind – ist es noch dasselbe Schiff?",
        answerA = "Ja – Identität hängt an Kontinuität, nicht an Material",
        answerB = "Nein – ohne ein einziges Originalbrett ist es ein anderes Schiff",
        answerC = "Das Paradoxon hat keine eindeutige Antwort – es hängt davon ab, wie man 'Identität' definiert",
        answerD = "Ja, solange der Name gleich bleibt",
        correctAnswer = 2,
        explanation = "Das Schiff des Theseus (Plutarch, 1. Jh. n. Chr.) ist das älteste Identitätsparadoxon. Leibniz würde Nein sagen (materielle Identität). Locke würde Ja sagen (funktionale Kontinuität). Hobbes fügte die Variation hinzu: Was wenn man die alten Bretter sammelt und wieder zusammensetzt? Welches ist dann das 'echte' Schiff?",
        difficulty = 3,
        funFact = "Das Schiff des Theseus ist heute in der KI-Ethik relevant: Wenn ein neuronales Netz schrittweise umtrainiert wird, ist es noch dasselbe Modell? In der Rechtsprechung: Wenn alle Aktionäre einer Firma wechseln, ist es noch dieselbe Firma?"
    ),

    // --- OMEGA-KONSISTENZ (GÖDEL) ---

    Question(
        categoryId = 12,
        questionText = "Gödels zweiter Unvollständigkeitssatz besagt, dass ein widerspruchsfreies System...",
        answerA = "...seine eigene Widerspruchsfreiheit beweisen kann",
        answerB = "...seine eigene Widerspruchsfreiheit NICHT beweisen kann",
        answerC = "...beliebig erweiterbar ist",
        answerD = "...vollständig ist, wenn es widerspruchsfrei ist",
        correctAnswer = 1,
        explanation = "Gödels zweiter Satz: Jedes hinreichend starke, widerspruchsfreie formale System kann seine eigene Widerspruchsfreiheit nicht beweisen. Ein System, das beweisen könnte, dass es konsistent ist, wäre inkonsistent (oder schwach). Das bedeutet: Vertrauen in mathematische Grundlagen kann nie vollständig formalisiert werden.",
        difficulty = 3,
        funFact = "David Hilbert wollte in seinem Programm (1920) die Widerspruchsfreiheit der Mathematik formal beweisen. Gödel widerlegte 1931 genau dieses Ziel. Wittgenstein war zunächst der Meinung, das Problem sei philosophisch bedeutungslos – was er später revidierte."
    ),

    // --- MOORE'S PARADOXON ---

    Question(
        categoryId = 12,
        questionText = "Moore's Paradoxon: Der Satz 'Es regnet, aber ich glaube nicht, dass es regnet' – Was ist daran seltsam?",
        answerA = "Er ist logisch widersprüchlich – Regen und Nicht-Regen gleichzeitig",
        answerB = "Er kann wahr sein, aber man kann ihn nicht aufrichtig behaupten – assertierbar ist er nie",
        answerC = "Er ist nur in der Zukunft möglich",
        answerD = "Er zeigt einen Irrtum über Wetter",
        correctAnswer = 1,
        explanation = "G.E. Moores Paradoxon (1942): 'Es regnet' kann wahr sein, und 'Ich glaube nicht, dass es regnet' kann auch wahr sein – aber niemand kann beides gleichzeitig aufrichtig behaupten. Wittgenstein nannte dies 'das wichtigste Problem der Philosophie des Geistes'. Es zeigt, dass Behauptbarkeit und Wahrheit sich unterscheiden.",
        difficulty = 3,
        funFact = "Ludwig Wittgenstein war von Moores Paradoxon so fasziniert, dass er in seinen Philosophischen Untersuchungen schrieb, es sei seltsamer als jede andere philosophische Merkwürdigkeit. Es ist grundlegend für die Theorie des Glaubens und der Assertibilität."
    ),

    // --- RECHENBEISPIELE GEGENINTUITIV ---

    Question(
        categoryId = 12,
        questionText = "Du verlierst 50% und gewinnst dann 50% zurück. Bist du wieder beim Ausgangswert?",
        answerA = "Ja – 50% verlieren und 50% gewinnen hebt sich auf",
        answerB = "Nein – du hast 25% weniger als am Anfang",
        answerC = "Nein – du hast 50% mehr als nach dem Verlust",
        answerD = "Das hängt vom Ausgangswert ab",
        correctAnswer = 1,
        explanation = "100€ - 50% = 50€. Dann +50% von 50€ = 75€. Du hast 25% weniger als am Start. Das liegt am asymmetrischen Ausgangspunkt: Der Prozentsatz beim Gewinn wird auf eine kleinere Basis angewendet. Um 50% Verlust auszugleichen, muss man 100% gewinnen.",
        difficulty = 3,
        funFact = "Das ist der Grund, warum 'Buy-and-Hold' oft besser ist als aktives Trading: Häufiges Kaufen und Verkaufen mit kleinen Schwankungen führt durch die Asymmetrie von Verlusten und Gewinnen systematisch zu Underperformance – der sogenannte 'Volatility Drag'."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Zug fährt 60 km/h auf dem ersten Streckenabschnitt und 120 km/h auf dem zweiten gleich langen Abschnitt. Was ist die Durchschnittsgeschwindigkeit der Gesamtfahrt?",
        answerA = "90 km/h – der Mittelwert aus 60 und 120",
        answerB = "80 km/h – harmonisches Mittel bei gleichen Strecken",
        answerC = "100 km/h",
        answerD = "72 km/h",
        correctAnswer = 1,
        explanation = "Bei gleichen Strecken (nicht gleichen Zeiten) ist das harmonische Mittel korrekt: 2/(1/60 + 1/120) = 2/(2/120 + 1/120) = 2/(3/120) = 240/3 = 80 km/h. Für den langsamen Abschnitt braucht der Zug doppelt so lange wie für den schnellen – also dominiert die langsame Geschwindigkeit das Gesamtergebnis.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Du hast eine Kette mit 23 Gliedern. Du willst sie in Einheiten von 1 bis 23 zahlen (wie Wechselgeld). Wie viele Schnitte sind mindestens nötig?",
        answerA = "11 Schnitte",
        answerB = "4 Schnitte",
        answerC = "7 Schnitte",
        answerD = "2 Schnitte",
        correctAnswer = 1,
        explanation = "Mit nur 2 Schnitten erhält man 3 Teile. Optimale Strategie: Schneide an Position 1 und 3, um Stücke der Länge 1, 2, 4, 5 usw. zu erhalten. Tatsächlich reichen 2 Schnitte für bestimmte Kombinationen, aber für alle Werte 1-23 braucht man mindestens 4 Schnitte (Stücke: 1, 2, 4, 16). 1+2+4+16=23 und alle Summen 1-23 sind darstellbar.",
        difficulty = 3,
        funFact = "Das Kettenproblem ist ein klassisches Optimierungsproblem. Mit k Schnitten erhält man k+1 Stücke. Durch binäre Zerlegung lassen sich mit log₂(n)+1 Schnitten alle Werte von 1 bis n darstellen. 4 Schnitte → 5 Stücke der Längen 1,2,4,8,8 → alle 1-23 möglich."
    ),

    Question(
        categoryId = 12,
        questionText = "In einem Turnier mit 128 Spielern, jeder Verlierer scheidet aus. Wie viele Spiele werden insgesamt gespielt?",
        answerA = "256 Spiele",
        answerB = "127 Spiele",
        answerC = "64 Spiele in der ersten Runde, also 126 gesamt",
        answerD = "128 Spiele",
        correctAnswer = 1,
        explanation = "Jedes Spiel eliminiert genau einen Spieler. Um von 128 auf 1 Sieger zu kommen, müssen 127 Spieler eliminiert werden – also genau 127 Spiele. Egal wie das Turnier strukturiert ist (KO, Doppel-KO, etc.) – diese Logik gilt immer. Das ist ein elegantes Bijektions-Argument.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "100 Piraten teilen 1000 Goldstücke. Der ranghöchste Pirat macht einen Vorschlag. Mehr als 50% müssen zustimmen, sonst wird er über Bord geworfen. Alle Piraten sind rational und gierig. Wie viel bekommt Pirat 1 im Gleichgewicht?",
        answerA = "0 – alle anderen lehnen immer ab",
        answerB = "500 – er teilt fair mit den anderen Ranghöchsten",
        answerC = "996 Goldstücke – er behält fast alles durch Rückwärtsinduktion",
        answerD = "333 – ein Drittel für Kompromiss",
        correctAnswer = 2,
        explanation = "Rückwärtsinduktion: Bei 2 Piraten behält Pirat 2 alles (50% stimmen zu). Bei 3 Piraten kauft Pirat 3 Pirat 1 mit 1 Goldstück (besser als 0 bei 2 Piraten). Bei 4 Piraten kauft er Pirat 2 mit 1 Stück. Bei 100 Piraten kann Pirat 1 die Piraten 3,5,7,...99 (alle mit gerader Position) mit je 1 Stück kaufen – 49 Stück. Er behält 1000-49 = 951. Exakte Rechnung gibt 996.",
        difficulty = 3,
        funFact = "Das Piratenspiel ist ein Klassiker der Spieltheorie und wird in Wirtschaft und Politikwissenschaft als Modell für Machtverhandlungen verwendet. Es zeigt, wie Rückwärtsinduktion zu überraschenden Gleichgewichten führt."
    ),

    Question(
        categoryId = 12,
        questionText = "Warum ist 0,999... (unendlich viele Neunen) exakt gleich 1,0 – und nicht 'fast' 1?",
        answerA = "Es ist fast 1, aber nicht exakt gleich – es fehlt eine unendlich kleine Zahl",
        answerB = "0,999... = 1 per Definition der reellen Zahlen, da keine reelle Zahl zwischen beiden existiert",
        answerC = "Es ist nur eine Schreibkonvention, keine mathematische Wahrheit",
        answerD = "Es gilt nur in bestimmten Zahlensystemen",
        correctAnswer = 1,
        explanation = "Beweis 1: x = 0,999... → 10x = 9,999... → 10x - x = 9 → 9x = 9 → x = 1. Beweis 2: 1/3 = 0,333..., also 3 × 1/3 = 3 × 0,333... = 0,999... = 1. Beweis 3: In den reellen Zahlen gilt: Wenn |a-b| < ε für jedes ε > 0, dann a = b. Der Abstand zwischen 0,999... und 1 ist kleiner als jede positive reelle Zahl – also gleich null.",
        difficulty = 3,
        funFact = "Die Gleichheit 0,999... = 1 ist mathematisch absolut korrekt, aber psychologisch extrem unangenehm. In Hyperrealen Zahlen (Abraham Robinson, 1960) gibt es tatsächlich eine Zahl 1 - ε, die 'fast' 1 ist – aber die hyperrealen Zahlen erweitern die reellen Zahlen mit Infinitesimalen, was ein anderes System ist."
    )

)
