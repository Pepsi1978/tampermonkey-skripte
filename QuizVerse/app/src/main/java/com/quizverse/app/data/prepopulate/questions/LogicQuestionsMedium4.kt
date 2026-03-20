package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsMedium4(): List<Question> = listOf(

    // Internet-researched: number sequences, syllogisms, combinatorics, probability, lateral thinking
    // Sources: raetselgeist.de, denksport-raetsel.de, studysmarter.de, logiclike.com, serlo.org

    // --- ZAHLENFOLGEN & MUSTER (8 Fragen) ---

    Question(
        categoryId = 12,
        questionText = "Welche Zahl kommt als Nächstes? 2, 6, 12, 20, 30, …",
        answerA = "40",
        answerB = "42",
        answerC = "44",
        answerD = "36",
        correctAnswer = 1,
        explanation = "Die Differenzen wachsen: +4, +6, +8, +10, +12 → 30 + 12 = 42. Formel: n×(n+1): 1×2=2, 2×3=6, …, 6×7=42.",
        difficulty = 2,
        funFact = "Diese Folge heißt 'Oblong-Zahlen' (Produkte zweier aufeinanderfolgender natürlicher Zahlen)."
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl fehlt? 1, 4, 9, 16, 25, ?, 49",
        answerA = "36",
        answerB = "34",
        answerC = "38",
        answerD = "32",
        correctAnswer = 0,
        explanation = "Es sind die Quadratzahlen: 1², 2², 3², 4², 5², 6², 7² → 6² = 36.",
        difficulty = 2,
        funFact = "Quadratzahlen tauchen in der Natur auf — zum Beispiel beim Auffüllen quadratischer Flächen mit Einheitsquadraten."
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl kommt als Nächstes? 3, 6, 11, 18, 27, …",
        answerA = "38",
        answerB = "36",
        answerC = "40",
        answerD = "35",
        correctAnswer = 0,
        explanation = "Die Differenzen sind: +3, +5, +7, +9, +11 → 27 + 11 = 38. Die Differenzen steigen um je 2.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Zahlenfolge: 1, 1, 2, 3, 5, 8, 13, ? Was kommt als Nächstes?",
        answerA = "18",
        answerB = "20",
        answerC = "21",
        answerD = "19",
        correctAnswer = 2,
        explanation = "Fibonacci-Folge: Jede Zahl ist die Summe der beiden vorhergehenden. 8 + 13 = 21.",
        difficulty = 2,
        funFact = "Die Fibonacci-Folge findet sich in Blütenblättern, Tannenzapfen und der Anordnung von Sonnenblumenkernen."
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl fehlt in der Folge? 100, 91, 83, 76, 70, ?",
        answerA = "63",
        answerB = "64",
        answerC = "65",
        answerD = "66",
        correctAnswer = 2,
        explanation = "Die Differenzen (Betrag): -9, -8, -7, -6, -5 → 70 - 5 = 65. Die Differenzen nehmen um 1 ab.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Zahl kommt als Nächstes? 2, 3, 5, 8, 12, 17, …",
        answerA = "22",
        answerB = "23",
        answerC = "24",
        answerD = "25",
        correctAnswer = 1,
        explanation = "Differenzen: +1, +2, +3, +4, +5, +6 → 17 + 6 = 23. Die Differenzen steigen um je 1.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie geht die Folge weiter? 1, 2, 4, 8, 16, 32, ?",
        answerA = "48",
        answerB = "60",
        answerC = "64",
        answerD = "56",
        correctAnswer = 2,
        explanation = "Geometrische Folge mit Faktor 2: 32 × 2 = 64.",
        difficulty = 2,
        funFact = "Das Reiskornrätsel: Bei 64 Schachfeldern mit Verdopplung käme man auf über 18 Trillionen Reiskörner."
    ),

    Question(
        categoryId = 12,
        questionText = "Muster: 2, 6, 18, 54, 162, ? Was fehlt?",
        answerA = "324",
        answerB = "500",
        answerC = "648",
        answerD = "486",
        correctAnswer = 3,
        explanation = "Geometrische Folge mit Faktor 3: 162 × 3 = 486.",
        difficulty = 2,
        funFact = null
    ),

    // --- SYLLOGISMUS / DEDUKTION (8 Fragen) ---

    Question(
        categoryId = 12,
        questionText = "Alle Katzen sind Tiere. Alle Tiere sind sterblich. Was folgt zwingend?",
        answerA = "Alle sterblichen Wesen sind Katzen",
        answerB = "Alle Katzen sind sterblich",
        answerC = "Einige Tiere sind Katzen",
        answerD = "Katzen leben ewig",
        correctAnswer = 1,
        explanation = "Syllogismus: Alle Katzen → Tiere; alle Tiere → sterblich; also alle Katzen → sterblich.",
        difficulty = 2,
        funFact = "Der bekannteste Syllogismus: 'Alle Menschen sind sterblich. Sokrates ist ein Mensch. Also ist Sokrates sterblich.' — von Aristoteles."
    ),

    Question(
        categoryId = 12,
        questionText = "Kein Fisch ist ein Säugetier. Alle Delphine sind Säugetiere. Was folgt zwingend?",
        answerA = "Einige Delphine sind Fische",
        answerB = "Kein Delphin ist ein Fisch",
        answerC = "Alle Säugetiere sind Delphine",
        answerD = "Fische sind keine Tiere",
        correctAnswer = 1,
        explanation = "Kein Fisch ist Säugetier. Alle Delphine sind Säugetiere → kein Delphin ist ein Fisch.",
        difficulty = 2,
        funFact = "Delphine sind trotz ihres fischeähnlichen Aussehens Säugetiere — sie atmen Luft und stillen ihre Jungen."
    ),

    Question(
        categoryId = 12,
        questionText = "Alle Rosen sind Blumen. Einige Blumen verwelken schnell. Was folgt zwingend?",
        answerA = "Alle Rosen verwelken schnell",
        answerB = "Einige Rosen verwelken schnell",
        answerC = "Keine Rose verwelkt schnell",
        answerD = "Nichts folgt zwingend über Rosen",
        correctAnswer = 3,
        explanation = "Aus 'einige Blumen verwelken schnell' kann man nicht schließen, dass es Rosen sind. Über Rosen folgt nichts Zwingendes.",
        difficulty = 2,
        funFact = "Dieser Fehler heißt 'undistributed middle' — ein klassischer Trugschluss in der formalen Logik."
    ),

    Question(
        categoryId = 12,
        questionText = "Alle Bäcker backen Brot. Max backt Brot. Was folgt zwingend?",
        answerA = "Max ist ein Bäcker",
        answerB = "Max ist kein Bäcker",
        answerC = "Max könnte ein Bäcker sein, muss es aber nicht",
        answerD = "Alle Brotbäcker heißen Max",
        correctAnswer = 2,
        explanation = "Fehler: 'Affirmation des Konsequens'. Max könnte ein Hobbyköche sein. Der Schluss von 'backt Brot' auf 'ist Bäcker' ist nicht zwingend.",
        difficulty = 2,
        funFact = "Dieser Trugschluss wird oft bewusst in Werbung und Politik eingesetzt."
    ),

    Question(
        categoryId = 12,
        questionText = "Einige Sportler sind Vegetarier. Alle Vegetarier essen kein Fleisch. Was folgt zwingend?",
        answerA = "Alle Sportler essen kein Fleisch",
        answerB = "Kein Sportler isst Fleisch",
        answerC = "Vegetarier sind keine Sportler",
        answerD = "Einige Sportler essen kein Fleisch",
        correctAnswer = 3,
        explanation = "Einige Sportler sind Vegetarier → für diese gilt: kein Fleisch. Also: Einige Sportler essen kein Fleisch.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Deduktion: Wenn Tom schläft, schnarcht er. Tom schnarcht. Was folgt zwingend?",
        answerA = "Tom schläft",
        answerB = "Tom schläft nicht",
        answerC = "Tom könnte schlafen oder eine andere Ursache haben",
        answerD = "Tom ist krank",
        correctAnswer = 2,
        explanation = "Schnarchen kann auch andere Ursachen haben. Die Umkehrung 'Wenn schnarcht, dann schläft' gilt nicht zwingend.",
        difficulty = 2,
        funFact = "Schnarchen kann beim Wachsein durch Entspannung der Rachenmuskulatur auftreten — zum Beispiel beim Dösen."
    ),

    Question(
        categoryId = 12,
        questionText = "Logik: Kein Reptil ist warmblütig. Alle Schlangen sind Reptilien. Welcher Schluss ist zwingend wahr?",
        answerA = "Alle warmblütigen Tiere sind keine Schlangen",
        answerB = "Keine Schlange ist warmblütig",
        answerC = "Alle Reptilien sind Schlangen",
        answerD = "Einige Schlangen sind warmblütig",
        correctAnswer = 0,
        explanation = "Alle Schlangen sind Reptilien; kein Reptil ist warmblütig → keine Schlange ist warmblütig → alle warmblütigen Tiere sind keine Schlangen (Kontraposition).",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn Laura Hunger hat, isst sie. Laura isst nicht. Was folgt zwingend?",
        answerA = "Laura hat keinen Hunger",
        answerB = "Laura schläft",
        answerC = "Laura hält Diät",
        answerD = "Nichts folgt zwingend",
        correctAnswer = 0,
        explanation = "Modus Tollens: Wenn Hunger → essen. Essen nicht → kein Hunger. Zwingend: Laura hat keinen Hunger.",
        difficulty = 2,
        funFact = null
    ),

    // --- KOMBINATORIK (7 Fragen) ---

    Question(
        categoryId = 12,
        questionText = "Auf wie viele Arten kann man 3 verschiedene Bücher in eine Reihe stellen?",
        answerA = "3",
        answerB = "6",
        answerC = "9",
        answerD = "12",
        correctAnswer = 1,
        explanation = "Permutation: 3! = 3 × 2 × 1 = 6 Möglichkeiten.",
        difficulty = 2,
        funFact = "Bei 10 Büchern wären es schon 3.628.800 Möglichkeiten — mehr als genug für jeden Abend eine neue Reihenfolge."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein 4-stelliger PIN-Code besteht aus den Ziffern 0–9 (Wiederholung erlaubt). Wie viele PINs gibt es?",
        answerA = "1.000",
        answerB = "9.999",
        answerC = "10.000",
        answerD = "5.040",
        correctAnswer = 2,
        explanation = "10 × 10 × 10 × 10 = 10.000 mögliche PINs (von 0000 bis 9999).",
        difficulty = 2,
        funFact = "Sicherheitsexperten empfehlen, nicht offensichtliche PINs wie 1234 oder 0000 zu wählen — diese werden zuerst ausprobiert."
    ),

    Question(
        categoryId = 12,
        questionText = "Aus einer Gruppe von 5 Personen sollen 2 für ein Projekt ausgewählt werden. Wie viele verschiedene Paare gibt es?",
        answerA = "10",
        answerB = "20",
        answerC = "5",
        answerD = "15",
        correctAnswer = 0,
        explanation = "Kombination ohne Reihenfolge: C(5,2) = 5! / (2! × 3!) = 10.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele 3-stellige Zahlen gibt es, bei denen alle Ziffern verschieden sind und keine Null vorkommt?",
        answerA = "504",
        answerB = "480",
        answerC = "729",
        answerD = "512",
        correctAnswer = 0,
        explanation = "Ziffern 1–9, alle verschieden: 9 × 8 × 7 = 504.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Menü hat 3 Vorspeisen, 4 Hauptgerichte und 2 Desserts. Wie viele verschiedene 3-Gänge-Menüs gibt es?",
        answerA = "9",
        answerB = "18",
        answerC = "24",
        answerD = "14",
        correctAnswer = 2,
        explanation = "Multiplikationsprinzip: 3 × 4 × 2 = 24.",
        difficulty = 2,
        funFact = "Unabhängige Entscheidungen multiplizieren ihre Möglichkeiten — das ist das Grundprinzip der Kombinatorik."
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Möglichkeiten gibt es, Platz 1, 2 und 3 bei einem Rennen mit 8 Teilnehmern zu vergeben?",
        answerA = "336",
        answerB = "56",
        answerC = "512",
        answerD = "24",
        correctAnswer = 0,
        explanation = "Variation ohne Wiederholung (Reihenfolge wichtig): 8 × 7 × 6 = 336.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Passwort besteht aus 2 verschiedenen Buchstaben (A–Z, Groß/Klein nicht unterschieden) ohne Wiederholung. Wie viele gibt es?",
        answerA = "325",
        answerB = "676",
        answerC = "52",
        answerD = "650",
        correctAnswer = 3,
        explanation = "Variation ohne Wiederholung (Reihenfolge wichtig): 26 × 25 = 650.",
        difficulty = 2,
        funFact = null
    ),

    // --- WAHRSCHEINLICHKEIT (7 Fragen) ---

    Question(
        categoryId = 12,
        questionText = "Ein fairer Würfel wird zweimal geworfen. Wie hoch ist die Wahrscheinlichkeit, zweimal eine 6 zu würfeln?",
        answerA = "1/12",
        answerB = "1/36",
        answerC = "1/6",
        answerD = "2/6",
        correctAnswer = 1,
        explanation = "P(6) × P(6) = 1/6 × 1/6 = 1/36 ≈ 2,78 %.",
        difficulty = 2,
        funFact = "Die Wahrscheinlichkeit, sechsmal hintereinander eine 6 zu würfeln, beträgt nur 1/46.656 — weniger als 0,003 %."
    ),

    Question(
        categoryId = 12,
        questionText = "In einer Urne liegen 3 rote und 7 blaue Kugeln. Eine wird gezogen. Wie hoch ist die Wahrscheinlichkeit einer roten Kugel?",
        answerA = "3/7",
        answerB = "7/10",
        answerC = "3/10",
        answerD = "1/3",
        correctAnswer = 2,
        explanation = "P(rot) = 3 / (3 + 7) = 3/10 = 30 %.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Eine faire Münze wird 3-mal geworfen. Wie wahrscheinlich ist es, genau 2-mal Kopf zu erhalten?",
        answerA = "3/8",
        answerB = "1/8",
        answerC = "2/8",
        answerD = "1/4",
        correctAnswer = 0,
        explanation = "C(3,2) × (1/2)² × (1/2) = 3 × 1/8 = 3/8. Die 3 Möglichkeiten: KKZ, KZK, ZKK.",
        difficulty = 2,
        funFact = "Die Binomialverteilung ist das Grundmodell für alle Experimente mit gleichem Entweder-oder."
    ),

    Question(
        categoryId = 12,
        questionText = "Monty-Hall-Problem: Hinter 3 Türen: 1 Auto, 2 Ziegen. Du wählst Tür 1. Moderator öffnet Tür 3 (Ziege). Solltest du zu Tür 2 wechseln?",
        answerA = "Nein — beide Türen haben jetzt 50 % Chance",
        answerB = "Ja — Tür 2 hat jetzt 2/3 Chance",
        answerC = "Nein — Tür 1 hat jetzt 2/3 Chance",
        answerD = "Wechseln bringt nichts",
        correctAnswer = 1,
        explanation = "Beim Wechseln gewinnt man mit 2/3 Wahrscheinlichkeit. Tür 1 behält 1/3. Der Moderator konzentriert die Information auf Tür 2.",
        difficulty = 2,
        funFact = "Das Monty-Hall-Problem löste in den 1990ern einen berühmten akademischen Streit aus — selbst Mathematiker lagen anfangs falsch."
    ),

    Question(
        categoryId = 12,
        questionText = "In einer Klasse sind 12 Mädchen und 8 Jungen. Zwei Schüler werden nacheinander ohne Zurücklegen gezogen. Wie wahrscheinlich sind 2 Mädchen?",
        answerA = "12/20 × 11/19",
        answerB = "12/20 × 12/20",
        answerC = "144/400",
        answerD = "1/4",
        correctAnswer = 0,
        explanation = "Ohne Zurücklegen: P = 12/20 × 11/19 = 132/380 = 33/95 ≈ 34,7 %.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Geburtstagsproblem: In einer Gruppe von 23 Personen — wie hoch ist die Wahrscheinlichkeit, dass zwei denselben Geburtstag haben?",
        answerA = "Unter 10 %",
        answerB = "Genau 23/365",
        answerC = "Über 50 %",
        answerD = "Genau 50 %",
        correctAnswer = 2,
        explanation = "Bei 23 Personen liegt die Wahrscheinlichkeit bereits bei ca. 50,7 % — berechnet über das Komplement (alle verschiedene Geburtstage).",
        difficulty = 2,
        funFact = "Das Geburtstagsproblem ist eines der bekanntesten Beispiele für kontraintuitive Wahrscheinlichkeiten."
    ),

    Question(
        categoryId = 12,
        questionText = "Aus einem Kartenspiel mit 52 Karten wird eine gezogen. Wie hoch ist die Wahrscheinlichkeit, ein Ass zu ziehen?",
        answerA = "1/52",
        answerB = "4/52",
        answerC = "1/13",
        answerD = "Antworten B und C sind gleichwertig",
        correctAnswer = 3,
        explanation = "Es gibt 4 Asse: P = 4/52 = 1/13. Antworten B und C sind mathematisch identisch.",
        difficulty = 2,
        funFact = null
    ),

    // --- LATERAL-DENKEN (10 Fragen) ---

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein Mann betritt ein Restaurant und bestellt Albatrossen-Suppe. Nach dem ersten Löffel geht er nach Hause und erschießt sich. Warum?",
        answerA = "Die Suppe war vergiftet",
        answerB = "Er erkannte, dass er als Schiffbrüchiger nie echten Albatros gegessen hatte — also wusste er, was er damals wirklich aß",
        answerC = "Er war allergisch",
        answerD = "Der Koch war sein Feind",
        correctAnswer = 1,
        explanation = "Als Schiffbrüchiger hatte ihm jemand 'Albatros-Suppe' gegeben. Die echte Suppe schmeckt jetzt anders — er erkennt, was er damals wirklich gegessen hat (seinen Begleiter).",
        difficulty = 2,
        funFact = "Klassisches Lateral-Thinking-Rätsel von Paul Sloane — eines der dunkelsten der Gattung."
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Eine Frau schießt ihren Mann ab, taucht ihn unter Wasser und hängt ihn auf. Danach gehen beide essen. Wie?",
        answerA = "Es war ein Traum",
        answerB = "Ihr Mann ist unsterblich",
        answerC = "Es war gespielt",
        answerD = "Sie ist Fotografin — Foto schießen, im Entwicklungsbad tauchen, aufhängen",
        correctAnswer = 3,
        explanation = "'Schießen' = Foto machen, 'Untertauchen' = Entwicklungsbad in der Dunkelkammer, 'Aufhängen' = Foto an die Wand hängen.",
        difficulty = 2,
        funFact = "In der analogen Fotografie werden Negative in chemischen Bädern entwickelt — daher das 'Untertauchen'."
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Wie viele Monate haben 28 Tage?",
        answerA = "1",
        answerB = "2",
        answerC = "7",
        answerD = "12",
        correctAnswer = 3,
        explanation = "Alle 12 Monate haben mindestens 28 Tage. Die Frage fragt nicht 'genau 28'.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Du hast einen 3-Liter- und einen 5-Liter-Eimer. Du brauchst exakt 4 Liter. Wie?",
        answerA = "Unmöglich",
        answerB = "5er füllen → 3L in 3er → 2L bleiben im 5er → 3er leeren → 2L rein → 5er auffüllen → 1L passt noch → 4L im 5er",
        answerC = "3er zweimal füllen",
        answerD = "Beide zusammenkippen",
        correctAnswer = 1,
        explanation = "5er füllen (5L), 3L in 3er (2L im 5er). 3er leeren, 2L in 3er. 5er auffüllen, 1L passt noch in 3er. Im 5er verbleiben 4L.",
        difficulty = 2,
        funFact = "Dieses Rätsel wurde im Film 'Stirb Langsam 3' berühmt — Bruce Willis löst es, um eine Bombe zu entschärfen."
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein Mann lebt alleine, geht schlafen — am Morgen sind Hunderte durch ihn gestorben. Wie?",
        answerA = "Er löste einen Krieg aus",
        answerB = "Er vergaß, den Leuchtturm einzuschalten",
        answerC = "Er war Arzt",
        answerD = "Er meldete kein Feuer",
        correctAnswer = 1,
        explanation = "Er ist Leuchtturmwärter. Das Licht blieb aus, Schiffe liefen auf Felsen auf.",
        difficulty = 2,
        funFact = "Leuchtturmwärter galten historisch als einer der einsamsten, aber verantwortungsvollsten Berufe."
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein Mann sieht ein Porträt und sagt: 'Geschwister habe ich keine, aber des Mannes Vater ist meines Vaters Sohn.' Wen sieht er?",
        answerA = "Seinen Bruder",
        answerB = "Seinen Vater",
        answerC = "Sich selbst",
        answerD = "Seinen Onkel",
        correctAnswer = 2,
        explanation = "'Meines Vaters Sohn' ohne Geschwister = er selbst. Also: 'Des Mannes Vater ist ich' → der Porträtierte ist sein Sohn.",
        difficulty = 2,
        funFact = "In der klassischen Rätselfassung betrachtet der Mann sein eigenes Porträt."
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Wie viele Tiere hat Moses in seine Arche mitgenommen?",
        answerA = "2 von jeder Art",
        answerB = "7 von jeder reinen Art",
        answerC = "Es war Noah, nicht Moses",
        answerD = "40 Tiere",
        correctAnswer = 2,
        explanation = "Moses hatte keine Arche — das war Noah! Diese Frage testet, ob man eine falsche Voraussetzung stillschweigend akzeptiert.",
        difficulty = 2,
        funFact = "Dieser Denkfehler heißt 'Moses-Illusion' — das Gehirn übernimmt plausible Kontexte, ohne sie zu hinterfragen."
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Wenn du in einen dunklen Raum mit einer Kerze, einem Kaminfeuer und einer Gaslampe gehst und nur ein Streichholz hast — was zündest du zuerst an?",
        answerA = "Die Kerze",
        answerB = "Das Kaminfeuer",
        answerC = "Die Gaslampe",
        answerD = "Das Streichholz",
        correctAnswer = 3,
        explanation = "Zuerst musst du das Streichholz anzünden — ohne es geht gar nichts!",
        difficulty = 2,
        funFact = "Eine klassische Fangfrage — die Antwort liegt direkt in der Aufgabenstellung."
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
    ),

    Question(
        categoryId = 12,
        questionText = "Lateral: Ein Chirurg betritt das OP-Zimmer und sagt: 'Ich kann diesen Mann nicht operieren — er ist mein Sohn.' Der Chirurg ist nicht der Vater. Wie ist das möglich?",
        answerA = "Es ist ein Stiefvater",
        answerB = "Es ist ein Adoptivvater",
        answerC = "Der Patient ist adoptiert",
        answerD = "Der Chirurg ist die Mutter",
        correctAnswer = 3,
        explanation = "Der Chirurg ist die Mutter des Patienten. Frauen können Chirurginnen sein — eine häufige Denkfalle durch unbewusste Vorurteile.",
        difficulty = 2,
        funFact = "Diese Aufgabe zeigt, wie Gendervorurteile unser logisches Denken beeinflussen."
    ),

    // --- WER LÜGT / INSEL-RÄTSEL (10 Fragen) ---

    Question(
        categoryId = 12,
        questionText = "Insel-Rätsel: A sagt: 'Ich bin ein Lügner oder B ist ein Wahrheitssager.' Was ist A?",
        answerA = "Lügner",
        answerB = "Wahrheitssager",
        answerC = "Nicht bestimmbar",
        answerD = "Beides möglich",
        correctAnswer = 1,
        explanation = "Wenn A ein Lügner wäre: Die Oder-Aussage wäre wahr (erster Teil wahr) → Lügner sagt Wahrheit → Widerspruch. Also ist A ein Wahrheitssager.",
        difficulty = 2,
        funFact = "Logische Oder-Verknüpfungen in Lügner-Rätseln sind besonders knifflig — man muss beide Teile separat prüfen."
    ),

    Question(
        categoryId = 12,
        questionText = "Insel-Rätsel: A sagt: 'Wir sind beide Wahrheitssager.' B sagt: 'Einer von uns ist ein Lügner.' Was sind sie?",
        answerA = "Beide Wahrheitssager",
        answerB = "Beide Lügner",
        answerC = "A ist Lügner, B ist Wahrheitssager",
        answerD = "A ist Wahrheitssager, B ist Lügner",
        correctAnswer = 2,
        explanation = "Wenn A Wahrheitssager: beide WS → B's 'einer lügt' wäre falsch → B lügt → Widerspruch. Also A=Lügner, B=Wahrheitssager ✓.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Insel-Rätsel: Du triffst X und Y. X sagt: 'Y ist ein Lügner.' Y sagt: 'X und ich sind vom selben Typ.' Wer ist was?",
        answerA = "Beide Wahrheitssager",
        answerB = "Beide Lügner",
        answerC = "X ist Lügner, Y ist Wahrheitssager",
        answerD = "X ist Wahrheitssager, Y ist Lügner",
        correctAnswer = 3,
        explanation = "Wenn X=WS: Y=Lügner. Y sagt 'gleicher Typ' = gelogen ✓. Wenn X=Lügner: Y=WS. Y sagt 'gleicher Typ' = wahr → Widerspruch. Also X=WS, Y=Lügner.",
        difficulty = 2,
        funFact = "'Gleicher Typ'-Aussagen sind in Lügner-Rätseln oft die Schlüsselinformation."
    ),

    Question(
        categoryId = 12,
        questionText = "Wer-lügt-Rätsel: 5 Verdächtige, einer hat gestohlen. A: 'Es war D.' B: 'Es war E.' C: 'Es war nicht ich.' D: 'A lügt.' E: 'B lügt.' Genau zwei sagen die Wahrheit. Wer war es?",
        answerA = "A",
        answerB = "C",
        answerC = "D",
        answerD = "E",
        correctAnswer = 1,
        explanation = "Wenn C gestohlen: C lügt. A(D war's)=falsch, B(E war's)=falsch, D('A lügt')=wahr ✓, E('B lügt')=wahr ✓. Genau 2 Wahre. ✓",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Drei Personen A, B, C. A sagt: 'Alle drei von uns lügen.' Was ist A?",
        answerA = "Wahrheitssager",
        answerB = "Nicht bestimmbar",
        answerC = "Paradox",
        answerD = "Lügner",
        correctAnswer = 3,
        explanation = "Wenn A ein Wahrheitssager wäre: 'Alle drei lügen' wäre wahr → A lügt → Widerspruch. Also ist A ein Lügner.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Insel-Rätsel: Drei Personen A, B, C. A: 'B ist ein Lügner.' B: 'A und C sind beide Lügner.' C: 'A ist ein Wahrheitssager.' Wer sagt die Wahrheit?",
        answerA = "Nur A",
        answerB = "Nur C",
        answerC = "A und C",
        answerD = "Keiner",
        correctAnswer = 2,
        explanation = "Annahme: A=WS, C=WS, B=Lügner. A('B lügt')=wahr ✓. B('A und C lügen')=falsch ✓. C('A=WS')=wahr ✓. Konsistent.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wer-lügt-Rätsel: A sagt: 'B und C sagen beide die Wahrheit.' B sagt: 'A lügt.' C sagt: 'Mindestens einer von uns lügt.' Genau einer lügt. Wer?",
        answerA = "A",
        answerB = "B",
        answerC = "C",
        answerD = "Niemand",
        correctAnswer = 0,
        explanation = "Wenn A lügt: B und C sagen nicht beide Wahrheit — aber B sagt 'A lügt'=wahr und C sagt 'min. einer lügt'=wahr → beide sagen Wahrheit → Widerspruch mit A's Lüge? Nein: A lügt bedeutet 'B und C sagen nicht BEIDE Wahrheit', aber wenn doch beide die Wahrheit sagen, ist das konsistent als Lüge von A. Wenn B lügt: 'A lügt'=falsch → A sagt Wahrheit → 'B und C beide WS' → wahr, aber B lügt → Widerspruch. Wenn C lügt: 'min. einer lügt'=falsch → alle WS, aber C lügt → Widerspruch. Also A.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Logik-Rätsel: Anna ist älter als Bernd. Bernd ist älter als Clara. Clara ist älter als Dieter. Wer ist der Jüngste?",
        answerA = "Anna",
        answerB = "Bernd",
        answerC = "Clara",
        answerD = "Dieter",
        correctAnswer = 3,
        explanation = "Anna > Bernd > Clara > Dieter → Dieter ist der Jüngste.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Deduktion: Alle Mathe-Genies tragen Brillen. Tim trägt keine Brille. Was folgt daraus zwingend?",
        answerA = "Tim ist kein Mathe-Genie",
        answerB = "Tim ist kein Genie",
        answerC = "Tim mag keine Mathe",
        answerD = "Nichts folgt zwingend",
        correctAnswer = 0,
        explanation = "Modus Tollens: Alle Mathe-Genies tragen Brillen. Tim nicht → Tim ist kein Mathe-Genie.",
        difficulty = 2,
        funFact = "Modus Tollens: 'Wenn P dann Q. Nicht Q. Also nicht P.'"
    ),

    Question(
        categoryId = 12,
        questionText = "Insel-Rätsel: A sagt: 'Ich bin ein Lügner und du wirst die Insel nicht verlassen.' Was weißt du sicher?",
        answerA = "A ist Lügner, du verlässt die Insel",
        answerB = "A ist Wahrheitssager",
        answerC = "Du verlässt die Insel nicht",
        answerD = "Die Aussage ist paradox — keine sicheren Schlüsse möglich",
        correctAnswer = 3,
        explanation = "Wenn A ein Lügner ist: 'Ich bin ein Lügner' wäre wahr → Widerspruch. Wenn A ein WS ist: 'Ich bin Lügner' ist falsch → Widerspruch. Paradox.",
        difficulty = 2,
        funFact = "Kombinierte Paradoxon-Aussagen sind ein aktives Forschungsfeld in der mathematischen Logik."
    )

)
