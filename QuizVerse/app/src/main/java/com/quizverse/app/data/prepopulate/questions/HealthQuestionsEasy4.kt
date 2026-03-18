package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun healthQuestionsEasy4(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 16,
        questionText = "Wie viele Minuten moderate Bewegung pro Woche empfehlen Gesundheitsexperten fuer Erwachsene?",
        answerA = "30 Minuten",
        answerB = "75 Minuten",
        answerC = "150 Minuten",
        answerD = "300 Minuten",
        correctAnswer = 2, // C
        explanation = "Die Weltgesundheitsorganisation empfiehlt Erwachsenen mindestens 150 Minuten moderate koerperliche Aktivitaet pro Woche fuer eine gute Gesundheit.",
        difficulty = 1,
        funFact = "150 Minuten pro Woche sind nur etwa 21 Minuten pro Tag -- weniger als eine Folge einer durchschnittlichen TV-Serie."
    ),

    // Question 2
    Question(
        categoryId = 16,
        questionText = "Was ist ein typisches Beispiel fuer moderate koerperliche Aktivitaet?",
        answerA = "Schlafen",
        answerB = "Schnelles Gehen",
        answerC = "Lesen",
        answerD = "Autofahren",
        correctAnswer = 1, // B
        explanation = "Schnelles Gehen (zuegeiges Gehen) gilt als moderate koerperliche Aktivitaet und steigert die Herzfrequenz ohne uebermassige Anstrengung.",
        difficulty = 1,
        funFact = "Taeglich 30 Minuten zuegiges Gehen senkt das Risiko fuer Herzerkrankungen um bis zu 35 Prozent."
    ),

    // Question 3
    Question(
        categoryId = 16,
        questionText = "Wofuer ist Schwimmen besonders gut geeignet?",
        answerA = "Nur fuer Kinder",
        answerB = "Nur zum Abnehmen",
        answerC = "Schonend fuer Gelenke und gut fuer den ganzen Koerper",
        answerD = "Ausschliesslich fuer Leistungssportler",
        correctAnswer = 2, // C
        explanation = "Schwimmen ist ein gelenkschonendes Ganzkoerpertraining, das Muskeln, Herz und Lunge gleichzeitig staerkt und besonders fuer Menschen mit Gelenkproblemen geeignet ist.",
        difficulty = 1,
        funFact = "Beim Schwimmen werden rund 700 verschiedene Muskeln gleichzeitig beansprucht -- mehr als bei fast jeder anderen Sportart."
    ),

    // Question 4
    Question(
        categoryId = 16,
        questionText = "Wozu dient das Aufwaermen vor dem Sport?",
        answerA = "Um Zeit zu verschwenden",
        answerB = "Um Verletzungen zu vermeiden und den Koerper vorzubereiten",
        answerC = "Um Kalorien zu verbrennen",
        answerD = "Es hat keinen Nutzen",
        correctAnswer = 1, // B
        explanation = "Das Aufwaermen erhoht die Koerpertemperatur, verbessert die Durchblutung der Muskeln und bereitet Gelenke und Sehnen auf koerperliche Belastung vor.",
        difficulty = 1,
        funFact = "Schon 5-10 Minuten leichtes Aufwaermen koennen das Verletzungsrisiko beim Sport um bis zu 50 Prozent senken."
    ),

    // Question 5
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter Dehnen (Stretching)?",
        answerA = "Eine Art Krafttraining",
        answerB = "Das gezielte Strecken von Muskeln und Sehnen",
        answerC = "Eine Entspannungsmeditation",
        answerD = "Schnelles Laufen",
        correctAnswer = 1, // B
        explanation = "Stretching bezeichnet das gezielte Dehnen von Muskeln und Sehnen, um die Beweglichkeit zu verbessern und Verspannungen zu loesen.",
        difficulty = 1,
        funFact = "Regelmaessiges Dehnen kann die Beweglichkeit innerhalb weniger Wochen deutlich verbessern und Rueckenschmerzen vorbeugen."
    ),

    // Question 6
    Question(
        categoryId = 16,
        questionText = "Wie lange sollte man einen Stretch mindestens halten, damit er wirksam ist?",
        answerA = "1-2 Sekunden",
        answerB = "5 Sekunden",
        answerC = "20-30 Sekunden",
        answerD = "5 Minuten",
        correctAnswer = 2, // C
        explanation = "Experten empfehlen, eine Dehnung mindestens 20 bis 30 Sekunden zu halten, damit sich der Muskel tatsaechlich entspannen und laenger werden kann.",
        difficulty = 1,
        funFact = "Die meisten Menschen halten Dehnungen viel zu kurz -- weniger als 5 Sekunden hat kaum einen Effekt auf die Beweglichkeit."
    ),

    // Question 7
    Question(
        categoryId = 16,
        questionText = "Wie viele Schritte pro Tag gelten als gutes Ziel fuer aktive Erwachsene?",
        answerA = "500 Schritte",
        answerB = "2.000 Schritte",
        answerC = "10.000 Schritte",
        answerD = "50.000 Schritte",
        correctAnswer = 2, // C
        explanation = "10.000 Schritte pro Tag sind ein weit verbreitetes Gesundheitsziel und entsprechen etwa 7-8 Kilometern, was die Herz-Kreislauf-Gesundheit deutlich foerdert.",
        difficulty = 1,
        funFact = "Das Ziel von 10.000 Schritten wurde in den 1960er Jahren von einer japanischen Schrittzaehler-Firma als Marketingkonzept erfunden -- und ist seitdem weltweit bekannt."
    ),

    // Question 8
    Question(
        categoryId = 16,
        questionText = "Was ist ein bekannter Vorteil von regelmaessigem Laufen?",
        answerA = "Es schadet den Knien immer",
        answerB = "Es verbessert die Herz-Kreislauf-Gesundheit",
        answerC = "Es macht Muskeln schwaecker",
        answerD = "Es hat keinen gesundheitlichen Nutzen",
        correctAnswer = 1, // B
        explanation = "Regelmaessiges Laufen staerkt das Herz, verbessert die Lungenfunktion und senkt das Risiko fuer Herzerkrankungen, Diabetes und bestimmte Krebsarten.",
        difficulty = 1,
        funFact = "Schon 5-10 Minuten langsames Laufen pro Tag kann die Lebenserwartung um durchschnittlich 3 Jahre erhoehen, wie Studien gezeigt haben."
    ),

    // Question 9
    Question(
        categoryId = 16,
        questionText = "Welche Sportart trainiert Ausdauer, Kraft UND Koordination gleichzeitig?",
        answerA = "Schach",
        answerB = "Schwimmen",
        answerC = "Darts",
        answerD = "Bowling",
        correctAnswer = 1, // B
        explanation = "Schwimmen fordert Ausdauer durch kontinuierliche Bewegung, Kraft durch den Wasserwiderstand und Koordination durch die praezisen Schwimmtechniken.",
        difficulty = 1,
        funFact = "Schwimmer haben im Durchschnitt eine um 11 Jahre hoehere Lebenserwartung als Menschen, die gar keinen Sport treiben."
    ),

    // Question 10
    Question(
        categoryId = 16,
        questionText = "Was passiert mit dem Koerper, wenn man sich regelmaessig bewegt?",
        answerA = "Die Muskeln werden schwaecker",
        answerB = "Der Blutdruck steigt dauerhaft an",
        answerC = "Herz und Kreislauf werden staerker",
        answerD = "Man braucht mehr Schlaf",
        correctAnswer = 2, // C
        explanation = "Regelmaessige Bewegung kraeftigt das Herz, verbessert die Durchblutung, senkt den Blutdruck und steigert die allgemeine koerperliche Leistungsfaehigkeit.",
        difficulty = 1,
        funFact = "Das Herz eines gut trainierten Sportlers pumpt in der Ruhe bis zu 50 Prozent mehr Blut pro Schlag als das eines untrainierten Menschen."
    ),

    // Question 11
    Question(
        categoryId = 16,
        questionText = "Wie viele Stunden Schlaf braucht ein Erwachsener pro Nacht?",
        answerA = "3-4 Stunden",
        answerB = "5-6 Stunden",
        answerC = "7-9 Stunden",
        answerD = "10-12 Stunden",
        correctAnswer = 2, // C
        explanation = "Laut der National Sleep Foundation benoetigen Erwachsene zwischen 18 und 64 Jahren idealer Weise 7 bis 9 Stunden Schlaf pro Nacht.",
        difficulty = 1,
        funFact = "Menschen verbringen etwa ein Drittel ihres gesamten Lebens mit Schlafen -- bei einem 75-jaehrigen Leben sind das rund 25 Jahre."
    ),

    // Question 12
    Question(
        categoryId = 16,
        questionText = "Wie viele Stunden Schlaf brauchen Schulkinder (6-13 Jahre) pro Nacht?",
        answerA = "5-6 Stunden",
        answerB = "7-8 Stunden",
        answerC = "9-11 Stunden",
        answerD = "12-14 Stunden",
        correctAnswer = 2, // C
        explanation = "Schulkinder im Alter von 6 bis 13 Jahren benoetigen 9 bis 11 Stunden Schlaf, da ihr Gehirn und Koerper noch stark wachsen und sich entwickeln.",
        difficulty = 1,
        funFact = "Kinder, die regelmaessig ausreichend schlafen, zeigen bessere Schulleistungen, eine bessere Konzentration und ein geringeres Risiko fuer Uebergewicht."
    ),

    // Question 13
    Question(
        categoryId = 16,
        questionText = "Wie viele Stunden Schlaf brauchen Neugeborene pro Tag?",
        answerA = "4-6 Stunden",
        answerB = "8-10 Stunden",
        answerC = "14-17 Stunden",
        answerD = "20-22 Stunden",
        correctAnswer = 2, // C
        explanation = "Neugeborene benoetigen 14 bis 17 Stunden Schlaf pro Tag, da ihr Gehirn in dieser Phase besonders intensiv wachst und sich entwickelt.",
        difficulty = 1,
        funFact = "Im Schlaf schuettet der Koerper beim Baby besonders viel Wachstumshormon aus -- der Volksmund 'Schlaf dich gross' hat also einen wahren Kern."
    ),

    // Question 14
    Question(
        categoryId = 16,
        questionText = "Was hilft besonders gut fuer einen guten Schlaf (Schlafhygiene)?",
        answerA = "Kurz vor dem Schlafen viel Koffein trinken",
        answerB = "Regelmaessige Schlafzeiten einhalten",
        answerC = "Helles Licht im Schlafzimmer lassen",
        answerD = "Kurz vor dem Schlafen intensiv Sport treiben",
        correctAnswer = 1, // B
        explanation = "Regelmaessige Schlaf- und Aufwachzeiten helfen dem koerperlichen Biorhythmus, sich auf einen festen Rhythmus einzustellen, was die Schlafqualitaet deutlich verbessert.",
        difficulty = 1,
        funFact = "Der Koerper hat eine innere Uhr (zirkadianer Rhythmus), die sich in nur wenigen Tagen an neue Schlafzeiten anpassen kann -- auch am Wochenende."
    ),

    // Question 15
    Question(
        categoryId = 16,
        questionText = "Warum ist Schlaf fuer das Gehirn so wichtig?",
        answerA = "Das Gehirn schaltet sich nachts komplett ab",
        answerB = "Im Schlaf reinigt das Gehirn sich selbst und verarbeitet Erinnerungen",
        answerC = "Das Gehirn braucht keinen Schlaf",
        answerD = "Im Schlaf werden Gehirnzellen abgebaut",
        correctAnswer = 1, // B
        explanation = "Waehrend des Schlafs verarbeitet das Gehirn Erinnerungen, baut Stoffwechselprodukte ab und festigt das Gelernte des Tages durch neuronale Verbindungen.",
        difficulty = 1,
        funFact = "Das Gehirn ist nachts fast genauso aktiv wie tagesueber -- im Traumschlaf (REM-Phase) arbeitet es sogar auf Hochtouren."
    ),

    // Question 16
    Question(
        categoryId = 16,
        questionText = "Welche Auswirkung hat zu wenig Schlaf auf die Stimmung?",
        answerA = "Man wird ausgeglichener und freundlicher",
        answerB = "Man wird reizbarer und schlechter gelaunt",
        answerC = "Man wird konzentrierter",
        answerD = "Es hat keinen Einfluss auf die Stimmung",
        correctAnswer = 1, // B
        explanation = "Schlafmangel beeintraechtigt direkt die Emotionsregulation im Gehirn, was zu erhoehter Reizbarkeit, schlechter Laune und verminderter Stresstoleranz fuehrt.",
        difficulty = 1,
        funFact = "Nur eine Nacht mit weniger als 6 Stunden Schlaf kann die Faehigkeit, soziale Signale richtig zu deuten, um bis zu 40 Prozent verringern."
    ),

    // Question 17
    Question(
        categoryId = 16,
        questionText = "Was sollte man kurz vor dem Schlafen vermeiden?",
        answerA = "Ruhige Musik hoeren",
        answerB = "Ein warmes Bad nehmen",
        answerC = "Auf Smartphones und Bildschirme schauen",
        answerD = "Ein Buch lesen",
        correctAnswer = 2, // C
        explanation = "Das blaue Licht von Bildschirmen hemmt die Ausschuettung des Schlafhormons Melatonin und signalisiert dem Gehirn faelschlicherweise, dass es noch Tag ist.",
        difficulty = 1,
        funFact = "Schon 30 Minuten Smartphone-Nutzung vor dem Schlafen kann die Einschlafzeit um bis zu eine Stunde verlaengern."
    ),

    // Question 18
    Question(
        categoryId = 16,
        questionText = "Wie nennt man das Hormon, das den Schlaf-Wach-Rhythmus steuert?",
        answerA = "Adrenalin",
        answerB = "Insulin",
        answerC = "Melatonin",
        answerD = "Testosteron",
        correctAnswer = 2, // C
        explanation = "Melatonin ist das sogenannte Schlafhormon, das bei Dunkelheit von der Zirbeldruse ausgeschuettet wird und dem Koerper signalisiert, dass es Zeit zum Schlafen ist.",
        difficulty = 1,
        funFact = "Melatonin wird nicht nur im Gehirn produziert -- auch der Darm stellt grosse Mengen davon her, was die enge Verbindung zwischen Darm und Schlaf erklaert."
    ),

    // Question 19
    Question(
        categoryId = 16,
        questionText = "Was ist Stress?",
        answerA = "Eine koerperliche Krankheit wie Grippe",
        answerB = "Die koerperliche und psychische Reaktion auf Herausforderungen oder Bedrohungen",
        answerC = "Ein Vitaminmangel",
        answerD = "Ein anderes Wort fuer Muedigkeit",
        correctAnswer = 1, // B
        explanation = "Stress ist eine natuerliche Reaktion des Koerpers auf belastende Situationen, bei der Hormone wie Adrenalin und Cortisol ausgeschuettet werden, um den Koerper auf Kampf oder Flucht vorzubereiten.",
        difficulty = 1,
        funFact = "Kurzzeitiger Stress kann tatsaechlich nuetzlich sein -- er steigert die Konzentration, Leistung und Wachsamkeit, was als 'Eustress' bezeichnet wird."
    ),

    // Question 20
    Question(
        categoryId = 16,
        questionText = "Welche einfache Methode hilft sofort beim Stressabbau?",
        answerA = "Mehr Kaffee trinken",
        answerB = "Tief ein- und ausatmen",
        answerC = "Lauter Musik hoeren",
        answerD = "Mehr arbeiten",
        correctAnswer = 1, // B
        explanation = "Tiefes Atmen aktiviert den Parasympathikus (das Ruhesystem des Koerpers), senkt Herzfrequenz und Blutdruck und vermittelt dem Gehirn ein Signal der Entspannung.",
        difficulty = 1,
        funFact = "Schon 5 tiefe Atemzuege koennen den Cortisolspiegel (Stresshormon) messbar senken -- das ist kostenlos und ueberall anwendbar."
    ),

    // Question 21
    Question(
        categoryId = 16,
        questionText = "Was ist Entspannung im Zusammenhang mit Gesundheit?",
        answerA = "Gar nichts tun und schlafen",
        answerB = "Zustand verminderter koerperlicher und geistiger Anspannung",
        answerC = "Ein anderes Wort fuer Sport",
        answerD = "Medikamente nehmen",
        correctAnswer = 1, // B
        explanation = "Entspannung bezeichnet einen Zustand, in dem koerperliche Spannung und geistiger Stress nachlassen, was dem Koerper Erholung und Regeneration ermoeg licht.",
        difficulty = 1,
        funFact = "Regelmaessige Entspannungsphasen koennen das Immunsystem staerken und das Risiko fuer stressbedingte Erkrankungen wie Bluthochdruck erheblich senken."
    ),

    // Question 22
    Question(
        categoryId = 16,
        questionText = "Was ist mentale Gesundheit?",
        answerA = "Nur das Fehlen psychischer Erkrankungen",
        answerB = "Das koerperliche Wohlbefinden",
        answerC = "Das emotionale, psychologische und soziale Wohlbefinden einer Person",
        answerD = "Ein medizinischer Begriff fuer Intelligenz",
        correctAnswer = 2, // C
        explanation = "Mentale Gesundheit umfasst das gesamte emotionale, psychologische und soziale Wohlbefinden und beeinflusst, wie wir denken, fuehlen und mit anderen interagieren.",
        difficulty = 1,
        funFact = "Laut WHO ist mentale Gesundheit nicht nur das Fehlen von Erkrankungen, sondern ein Zustand vollstaendigen Wohlbefindens -- Geist und Koerper sind gleichwertig."
    ),

    // Question 23
    Question(
        categoryId = 16,
        questionText = "Was ist Depression?",
        answerA = "Einfach schlechte Laune fuer einen Tag",
        answerB = "Eine ernste psychische Erkrankung mit anhaltendem Gefuehl von Traurigkeit und Hoffnungslosigkeit",
        answerC = "Ein anderes Wort fuer Stress",
        answerD = "Eine koerperliche Verletzung",
        correctAnswer = 1, // B
        explanation = "Depression ist eine ernstzunehmende psychische Erkrankung, die ueber Wochen oder Monate anhaelt und mit Antriebslosigkeit, Freudlosigkeit und oftmals koerperlichen Beschwerden verbunden ist.",
        difficulty = 1,
        funFact = "Depression ist weltweit eine der haeufigsten Erkrankungen -- rund 280 Millionen Menschen sind davon betroffen, doch sie ist mit der richtigen Behandlung gut therapierbar."
    ),

    // Question 24
    Question(
        categoryId = 16,
        questionText = "Was ist Angststoerung?",
        answerA = "Normale Aufregung vor einem Test",
        answerB = "Eine psychische Erkrankung mit uebertriebener, anhaltender Angst ohne klaren Grund",
        answerC = "Ein anderes Wort fuer Schuechteinheit",
        answerD = "Angst vor Tieren",
        correctAnswer = 1, // B
        explanation = "Angststoerungen sind psychische Erkrankungen, bei denen starke, anhaltende Angstgefuehle auftreten, die den Alltag stark beeintraechtigen und nicht durch eine konkrete Gefahr begruendet sind.",
        difficulty = 1,
        funFact = "Angststoerungen sind die haeufigste psychische Erkrankung weltweit -- etwa jeder fuenfte Mensch entwickelt im Laufe seines Lebens eine Angststoerung."
    ),

    // Question 25
    Question(
        categoryId = 16,
        questionText = "Welche positive Wirkung hat Sport auf die mentale Gesundheit?",
        answerA = "Keinen Einfluss",
        answerB = "Macht trauriger",
        answerC = "Foerdert die Ausschuettung von Glueckshormonen wie Endorphinen",
        answerD = "Erhoeht Angst und Stress",
        correctAnswer = 2, // C
        explanation = "Koerperliche Aktivitaet regt die Ausschuettung von Endorphinen, Serotonin und Dopamin an, die natuerliche Stimmungsaufheller sind und Stress und Angst deutlich reduzieren.",
        difficulty = 1,
        funFact = "30 Minuten moderater Sport wirkt bei leichter bis mittelschwerer Depression aehnlich gut wie ein Antidepressivum -- das belegen mehrere klinische Studien."
    ),

    // Question 26
    Question(
        categoryId = 16,
        questionText = "Wie nennt man die Glueckshormone, die beim Sport ausgeschuettet werden?",
        answerA = "Insulin",
        answerB = "Endorphine",
        answerC = "Adrenalin",
        answerD = "Melatonin",
        correctAnswer = 1, // B
        explanation = "Endorphine sind koerpereigene Botenstoffe, die bei koerperlicher Belastung ausgeschuettet werden und Schmerzempfindung reduzieren sowie ein Gefuehl von Wohlbefinden erzeugen.",
        difficulty = 1,
        funFact = "Das sogenannte 'Runner's High' -- das euphorische Gefuehl nach langem Laufen -- wird durch Endorphine und Endocannabinoide im Gehirn ausgeloest."
    ),

    // Question 27
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter Schlafhygiene?",
        answerA = "Das Duschen vor dem Schlafengehen",
        answerB = "Gewohnheiten und Massnahmen, die zu einem guten und gesunden Schlaf beitragen",
        answerC = "Das Reinigen des Bettes",
        answerD = "Schlafen mit offenem Fenster",
        correctAnswer = 1, // B
        explanation = "Schlafhygiene umfasst alle Verhaltensweisen und Umgebungsbedingungen, die die Schlafqualitaet verbessern, wie regelmaessige Schlafzeiten, ein dunkles Zimmer und kein Koffein am Abend.",
        difficulty = 1,
        funFact = "Eine gute Schlafhygiene kann die Einschlafzeit um bis zu 30 Minuten verkuerzen und die Tiefschlafphasen verlaengern."
    ),

    // Question 28
    Question(
        categoryId = 16,
        questionText = "Welche Auswirkung hat zu viel Bildschirmzeit auf Kinder?",
        answerA = "Verbessert immer die schulischen Leistungen",
        answerB = "Hat keinerlei Auswirkungen",
        answerC = "Kann Schlafprobleme, Konzentrationsschwaeche und soziale Isolation foerdern",
        answerD = "Macht Kinder grundsaetzlich intelligenter",
        correctAnswer = 2, // C
        explanation = "Exzessive Bildschirmzeit bei Kindern ist mit schlechterer Schlafqualitaet, verminderter Konzentration, weniger sozialer Interaktion und reduzierter koerperlicher Aktivitaet verbunden.",
        difficulty = 1,
        funFact = "Die WHO empfiehlt, dass Kinder unter 2 Jahren grundsaetzlich keine Bildschirme nutzen sollten -- bei Kindern von 2-5 Jahren maximal eine Stunde pro Tag."
    ),

    // Question 29
    Question(
        categoryId = 16,
        questionText = "Was ist die empfohlene taegliche Bildschirmzeit fuer Erwachsene ausserhalb der Arbeit?",
        answerA = "Unbegrenzt",
        answerB = "Weniger als 2 Stunden Freizeit-Bildschirmzeit",
        answerC = "Mindestens 8 Stunden",
        answerD = "Genau 4 Stunden",
        correctAnswer = 1, // B
        explanation = "Experten empfehlen Erwachsenen, die Freizeit-Bildschirmzeit (ausserhalb der Arbeit) auf unter 2 Stunden taeglich zu begrenzen, um Schlaf- und Gesundheitsprobleme zu vermeiden.",
        difficulty = 1,
        funFact = "Studien zeigen, dass Menschen mit ueber 6 Stunden taeglicher Bildschirmzeit ein doppelt so hohes Risiko fuer Depressionen haben wie Menschen mit weniger als 2 Stunden."
    ),

    // Question 30
    Question(
        categoryId = 16,
        questionText = "Was hilft beim Einschlafen besonders gut?",
        answerA = "Laute Musik",
        answerB = "Koffeinhaltige Getraenke",
        answerC = "Ein kuehles, dunkles und ruhiges Schlafzimmer",
        answerD = "Intensive sportliche Aktivitaet kurz vor dem Schlafengehen",
        correctAnswer = 2, // C
        explanation = "Kuehlere Temperaturen (ca. 16-18 Grad), Dunkelheit und Ruhe signalisieren dem Koerper, dass es Zeit ist zu schlafen, und foerdern die Ausschuettung des Schlafhormons Melatonin.",
        difficulty = 1,
        funFact = "Die koerpereigene Temperatur sinkt kurz vor dem Einschlafen um etwa 1-2 Grad -- ein kuehleres Schlafzimmer unterstuetzt diesen natuerlichen Prozess."
    ),

    // Question 31
    Question(
        categoryId = 16,
        questionText = "Was ist Ausdauertraining?",
        answerA = "Training, das nur auf Muskelaufbau abzielt",
        answerB = "Koerperliche Aktivitaet, die ueber laengere Zeit die Herzfrequenz erhoet",
        answerC = "Kurzes intensives Krafttraining",
        answerD = "Entspannungsuebungen",
        correctAnswer = 1, // B
        explanation = "Ausdauertraining ist anhaltende koerperliche Aktivitaet, die das Herz-Kreislauf-System beansprucht, wie Laufen, Radfahren oder Schwimmen ueber laengere Zeitraeume.",
        difficulty = 1,
        funFact = "Regelmaessiges Ausdauertraining kann das Schlaganfallrisiko um bis zu 27 Prozent senken und verlaengert die Lebenserwartung nachweislich."
    ),

    // Question 32
    Question(
        categoryId = 16,
        questionText = "Welche Aktivitaet ist kein typisches Ausdauertraining?",
        answerA = "Radfahren",
        answerB = "Schwimmen",
        answerC = "Gewichte heben",
        answerD = "Joggen",
        correctAnswer = 2, // C
        explanation = "Gewichte heben ist Krafttraining und kein Ausdauertraining, da es primaer auf Muskelkraft und -aufbau abzielt, nicht auf die Steigerung der kardialen Ausdauer.",
        difficulty = 1,
        funFact = "Krafttraining und Ausdauertraining ergaenzen sich perfekt -- Experten empfehlen, beide Trainingsformen zu kombinieren fuer maximale Gesundheitsvorteile."
    ),

    // Question 33
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter dem Begriff 'Burnout'?",
        answerA = "Eine Art Sonnenbrand",
        answerB = "Einen Zustand totaler koerperlicher und geistiger Erschoepfung durch chronischen Stress",
        answerC = "Das Gefuehl nach einem guten Training",
        answerD = "Einen koerperlichen Fitnesstest",
        correctAnswer = 1, // B
        explanation = "Burnout ist ein Zustand extremer emotionaler, koerperlicher und geistiger Erschoepfung, der durch lang anhaltenden Stress -- haeufig im Beruf -- entsteht.",
        difficulty = 1,
        funFact = "Burnout wurde von der WHO im Jahr 2019 offiziell als berufliches Phaenomen anerkannt und in die Internationale Klassifikation der Krankheiten aufgenommen."
    ),

    // Question 34
    Question(
        categoryId = 16,
        questionText = "Welche einfache Aktivitaet reduziert nachweislich Stress?",
        answerA = "Stundenlang Nachrichten lesen",
        answerB = "In der Natur spazieren gehen",
        answerC = "Mehr Kaffee trinken",
        answerD = "Laenger arbeiten",
        correctAnswer = 1, // B
        explanation = "Spaziergaenge in der Natur senken den Cortisolspiegel (Stresshormon), verbessern die Stimmung und foerdern die mentale Erholung laut zahlreicher wissenschaftlicher Studien.",
        difficulty = 1,
        funFact = "Schon 20 Minuten in der Natur senken den Cortisolspiegel um durchschnittlich 21 Prozent -- Forscher nennen diesen Effekt 'Nature Pill' (Naturpille)."
    ),

    // Question 35
    Question(
        categoryId = 16,
        questionText = "Wie oft pro Woche sollten Erwachsene laut Empfehlungen Kraft- oder Muskeltraining machen?",
        answerA = "Nie",
        answerB = "Einmal im Monat",
        answerC = "Mindestens zweimal pro Woche",
        answerD = "Jeden Tag, ohne Pause",
        correctAnswer = 2, // C
        explanation = "Die WHO empfiehlt Erwachsenen mindestens zweimal woechentlich muskelstaerkendes Training, das alle grossen Muskelgruppen beinhaltet.",
        difficulty = 1,
        funFact = "Ab dem 30. Lebensjahr verliert der Koerper jedes Jahr etwa 1 Prozent Muskelmasse, wenn man kein Krafttraining betreibt -- das laesst sich durch regelmaessiges Training gut aufhalten."
    ),

    // Question 36
    Question(
        categoryId = 16,
        questionText = "Was ist Yoga?",
        answerA = "Eine Kampfsportart",
        answerB = "Eine Praxis, die Koerperhaltungen, Atemuebungen und Meditation verbindet",
        answerC = "Ein Ausdauersport wie Marathon",
        answerD = "Eine Art Massagetechnik",
        correctAnswer = 1, // B
        explanation = "Yoga ist eine jahrtausendealte Praxis aus Indien, die Koerperhaltungen (Asanas), Atemtechniken (Pranayama) und Meditation vereint, um Koerper und Geist zu staerken.",
        difficulty = 1,
        funFact = "Yoga hat weltweit ueber 300 Millionen Praktizierende -- es ist eine der am schnellsten wachsenden Gesundheitspraktiken des 21. Jahrhunderts."
    ),

    // Question 37
    Question(
        categoryId = 16,
        questionText = "Was ist eine bekannte Wirkung von Yoga auf die Gesundheit?",
        answerA = "Erhoeht den Blutdruck deutlich",
        answerB = "Verbessert Flexibilitaet, Kraft und reduziert Stress",
        answerC = "Hat keine nachgewiesenen Gesundheitsvorteile",
        answerD = "Ist ausschliesslich fuer Frauen geeignet",
        correctAnswer = 1, // B
        explanation = "Regelmaessiges Yoga verbessert nachweislich die Beweglichkeit, staerkt die Kernmuskulatur, verbessert die Balance und senkt Stress- und Angstwerte.",
        difficulty = 1,
        funFact = "Studien zeigen, dass Yoga den Cortisolspiegel um bis zu 14 Prozent senken kann -- was direkte Auswirkungen auf Stressreduktion und Immunsystem hat."
    ),

    // Question 38
    Question(
        categoryId = 16,
        questionText = "Was bedeutet 'Sitzverhalten' (sedentaeres Verhalten) im Gesundheitskontext?",
        answerA = "Das Trainieren im Sitzen",
        answerB = "Laengere Perioden des Sitzens oder Liegens ohne Bewegung",
        answerC = "Die richtige Sitzposition beim Sport",
        answerD = "Eine medizinische Therapiemethode",
        correctAnswer = 1, // B
        explanation = "Sedentaeres Verhalten bezeichnet laengere Phasen koerperlicher Inaktivitaet wie stundenlanges Sitzen am Schreibtisch oder vor dem Fernseher.",
        difficulty = 1,
        funFact = "Menschen, die taeglich mehr als 8 Stunden sitzen, haben ein deutlich erhoeht es Risiko fuer Herzerkrankungen, Diabetes und fruehzeitigen Tod -- auch wenn sie regelmaessig Sport treiben."
    ),

    // Question 39
    Question(
        categoryId = 16,
        questionText = "Wie oft sollte man bei sitzender Taetig keit aufstehen und sich kurz bewegen?",
        answerA = "Einmal am Tag reicht",
        answerB = "Nur in der Mittagspause",
        answerC = "Alle 30-60 Minuten fuer einige Minuten",
        answerD = "Nie, da es die Konzentration stoert",
        correctAnswer = 2, // C
        explanation = "Experten empfehlen, alle 30 bis 60 Minuten aufzustehen, sich zu dehnen oder kurz zu gehen, um die negativen Auswirkungen des langen Sitzens zu reduzieren.",
        difficulty = 1,
        funFact = "Schon 2 Minuten Gehen pro Stunde kann das Risiko fuer einen fruehzeitigen Tod um 33 Prozent senken, verglichen mit dem ganztaegigen Sitzen."
    ),

    // Question 40
    Question(
        categoryId = 16,
        questionText = "Was ist Meditation?",
        answerA = "Eine Schlaftechnik",
        answerB = "Koerperliches Training der Muskeln",
        answerC = "Eine geistige Uebung zur Foerderung von Ruhe und Achtsamkeit",
        answerD = "Eine Ernaehrungsform",
        correctAnswer = 2, // C
        explanation = "Meditation ist eine geistige Praxis, bei der man die Aufmerksamkeit auf den gegenwaerti gen Moment richtet, um innere Ruhe, Klarheit und Achtsamkeit zu foerdern.",
        difficulty = 1,
        funFact = "Schon 8 Wochen regelmaessige Meditation veraendern messbar die Struktur des Gehirns -- Bereiche fuer Empathie und Selbstwahrnehmung werden buchstaeblich groesser."
    ),

    // Question 41
    Question(
        categoryId = 16,
        questionText = "Welchen Einfluss hat Schlafmangel auf das Koerpergewicht?",
        answerA = "Keinen Einfluss",
        answerB = "Fuhrt immer zu Gewichtsverlust",
        answerC = "Kann zu Gewichtszunahme fuehren, weil Hungerhormone veraendert werden",
        answerD = "Macht Menschen duenner",
        correctAnswer = 2, // C
        explanation = "Schlafmangel erhoet den Spiegel des Hungerhormons Ghrelin und senkt das Saettigungshormon Leptin, was zu erhoehtem Appetit und Gewichtszunahme fuehren kann.",
        difficulty = 1,
        funFact = "Wer regelmaessig weniger als 6 Stunden schlaeft, hat ein doppelt so hohes Risiko fuer Uebergewicht wie Menschen, die 7-9 Stunden schlafen."
    ),

    // Question 42
    Question(
        categoryId = 16,
        questionText = "Was ist 'Aktive Erholung' nach dem Sport?",
        answerA = "Sofort schlafen gehen",
        answerB = "Leichte Bewegung wie Gehen oder sanftes Dehnen statt kompletter Ruhe",
        answerC = "Intensives weiteres Training",
        answerD = "Tagelang keine Bewegung",
        correctAnswer = 1, // B
        explanation = "Aktive Erholung bedeutet, nach intensivem Sport sanfte Aktivitaet wie leichtes Gehen oder Dehnen zu betreiben, was die Durchblutung foerdert und die Regeneration beschleunigt.",
        difficulty = 1,
        funFact = "Aktive Erholung kann Muskelkater um bis zu 50 Prozent reduzieren, weil sie die Entfernung von Milchsaeure und anderen Stoffwechselprodukten aus den Muskeln beschleunigt."
    ),

    // Question 43
    Question(
        categoryId = 16,
        questionText = "Welche Aktivitaet ist besonders gut fuer die Rueckengesundheit?",
        answerA = "Stundenlang bewegungslos sitzen",
        answerB = "Schweres Heben ohne Vorbereitung",
        answerC = "Regelmaessiges Schwimmen und Rueckendehnuebungen",
        answerD = "Nur liegen",
        correctAnswer = 2, // C
        explanation = "Schwimmen und gezielte Rueckendehnuebungen staerken die Rueckenmuskulatur, verbessern die Koerperhaltung und beugen Rueckenschmerzen effektiv vor.",
        difficulty = 1,
        funFact = "Rueckenschmerzen sind der haeufigste Grund fuer Arztbesuche weltweit -- etwa 80 Prozent aller Menschen leiden im Laufe ihres Lebens einmal daran."
    ),

    // Question 44
    Question(
        categoryId = 16,
        questionText = "Was bewirkt regelmaessiger Sport bei Stimmung und Wohlbefinden?",
        answerA = "Er macht grundsaetzlich schlechter gelaunt",
        answerB = "Er hat keinen Einfluss auf die Psyche",
        answerC = "Er verbessert die Stimmung und reduziert Angst und Depressionen",
        answerD = "Er erhoet Stress und Angst",
        correctAnswer = 2, // C
        explanation = "Koerperliche Aktivitaet verbessert die Stimmung, reduziert Angst und depressive Symptome durch die Ausschuettung von Endorphinen, Serotonin und Dopamin.",
        difficulty = 1,
        funFact = "Wissenschaftler haben herausgefunden, dass schon ein einziger Spaziergang die negativen Emotionen um bis zu 50 Prozent senken kann."
    ),

    // Question 45
    Question(
        categoryId = 16,
        questionText = "Was ist Achtsamkeit (Mindfulness)?",
        answerA = "Eine Schlafstrategie",
        answerB = "Die bewusste Aufmerksamkeit auf den gegenwaertigen Moment ohne Bewertung",
        answerC = "Eine sportliche Disziplin",
        answerD = "Ein anderes Wort fuer Konzentration beim Lernen",
        correctAnswer = 1, // B
        explanation = "Achtsamkeit bedeutet, den gegenwaertigen Moment bewusst und ohne Urteil wahrzunehmen -- Gedanken, Gefuehle und Koerperempfindungen zu beobachten, ohne sich von ihnen mitreissen zu lassen.",
        difficulty = 1,
        funFact = "Regelmaessige Achtsamkeitsuebungen koennen das Gehirn so veraendern, dass negative Gedankenmuster nachweislich abnehmen -- schon nach 8 Wochen sind Veraenderungen messbar."
    ),

    // Question 46
    Question(
        categoryId = 16,
        questionText = "Welchen Einfluss hat Tageslicht auf den Schlaf?",
        answerA = "Keinen Einfluss",
        answerB = "Tageslicht am Tag hilft dabei, nachts besser zu schlafen",
        answerC = "Tageslicht stoert immer den Schlaf",
        answerD = "Man sollte Tageslicht komplett vermeiden",
        correctAnswer = 1, // B
        explanation = "Tageslicht hilft dem koerperlichen Biorhythmus, synchron zu bleiben, und foerdert die Ausschuettung von Serotonin tagesueber, was abends die Melatonin-Produktion unterstuetzt.",
        difficulty = 1,
        funFact = "Menschen, die taeglich mindestens 30 Minuten Tageslicht ausgesetzt sind, schlafen im Durchschnitt 46 Minuten laenger und haben eine bessere Schlafqualitaet."
    ),

    // Question 47
    Question(
        categoryId = 16,
        questionText = "Was ist ein positives Zeichen guter mentaler Gesundheit?",
        answerA = "Nie Gefuehle zeigen",
        answerB = "Immer alleine sein wollen",
        answerC = "Mit Stress umgehen koennen und stabile soziale Beziehungen fuehren",
        answerD = "Immer gluecklich und nie traurig sein",
        correctAnswer = 2, // C
        explanation = "Gute mentale Gesundheit zeigt sich in der Faehigkeit, mit Stress umzugehen, Herausforderungen zu meistern, sinnvolle Beziehungen zu fuehren und ein erfuelltes Leben zu gestalten.",
        difficulty = 1,
        funFact = "Soziale Verbundenheit ist einer der staerksten Schutzfaktoren fuer mentale Gesundheit -- Einsamkeit erhoet das Risiko fuer Depression und Angststoerungen staerker als viele andere Faktoren."
    ),

    // Question 48
    Question(
        categoryId = 16,
        questionText = "Was empfehlen Experten gegen zu viel Bildschirmzeit vor dem Schlaf?",
        answerA = "Noch mehr Bildschirme nutzen",
        answerB = "Mindestens 30-60 Minuten vor dem Schlafen keine Bildschirme mehr benutzen",
        answerC = "Die Bildschirmhelligkeit erhoehen",
        answerD = "Bildschirme direkt neben dem Bett platzieren",
        correctAnswer = 1, // B
        explanation = "Das blaue Licht von Bildschirmen hemmt die Melatonin-Ausschuettung. Experten empfehlen eine bildschirmfreie Zeit von mindestens 30 bis 60 Minuten vor dem Schlafengehen.",
        difficulty = 1,
        funFact = "Der Blauanteil im Licht von Smartphones ist bis zu 5-mal intensiver als das Blaulicht normaler Gluehbirnen -- genau dieser Anteil bremst die Melatonin-Produktion am staerksten."
    ),

    // Question 49
    Question(
        categoryId = 16,
        questionText = "Was ist der wichtigste erste Schritt, wenn man sich psychisch nicht gut fuehlt?",
        answerA = "Alles fuer sich behalten und alleine kaempfen",
        answerB = "Mit jemandem darueber sprechen, zum Beispiel einem Freund oder Arzt",
        answerC = "Sich so viel wie moeglich ablenken",
        answerD = "Auf das Arztgespraech so lange warten bis es besser wird",
        correctAnswer = 1, // B
        explanation = "Darueber zu reden -- sei es mit Freunden, Familie oder einem Fachmann -- ist der wichtigste Schritt beim Umgang mit psychischen Problemen und reduziert das Gefuehl der Isolation erheblich.",
        difficulty = 1,
        funFact = "Studien zeigen, dass Menschen, die offen ueber psychische Probleme sprechen, durchschnittlich doppelt so schnell gesunden wie jene, die alles fuer sich behalten."
    ),

    // Question 50
    Question(
        categoryId = 16,
        questionText = "Welcher Schlafzyklus-Anteil ist besonders wichtig fuer die koerperliche Erholung?",
        answerA = "Der Wachzustand kurz vor dem Einschlafen",
        answerB = "Der Tiefschlaf (Slow-Wave-Schlaf)",
        answerC = "Das Traumschlaf-Stadium (REM)",
        answerD = "Das haeufige Aufwachen in der Nacht",
        correctAnswer = 1, // B
        explanation = "Im Tiefschlaf schuettet der Koerper am meisten Wachstumshormon aus, repariert Gewebe, staerkt das Immunsystem und regeneriert sich am gruendlichsten.",
        difficulty = 1,
        funFact = "Der Tiefschlaf findet hauptsaechlich in der ersten Haelfte der Nacht statt -- wer sehr spaet schlaeft, verpasst ueberproportional viel Tiefschlaf, auch wenn die Gesamtschlafdauer gleich bleibt."
    ),

)
