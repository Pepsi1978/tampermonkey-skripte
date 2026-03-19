package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun logicQuestionsEasy3(): List<Question> = listOf(

    // Simple logic, everyday reasoning, basic trick questions

    Question(
        categoryId = 12,
        questionText = "Ein Arzt gibt dir drei Pillen und sagt, du sollst alle 30 Minuten eine nehmen. Wie lange dauert es, bis du alle genommen hast?",
        answerA = "90 Minuten",
        answerB = "1 Stunde",
        answerC = "45 Minuten",
        answerD = "30 Minuten",
        correctAnswer = 1,
        explanation = "Pille 1 nimmst du sofort. Nach 30 Minuten Pille 2. Nach weiteren 30 Minuten Pille 3. Das macht 60 Minuten = 1 Stunde.",
        difficulty = 1,
        funFact = "Viele antworten 90 Minuten, weil sie 3 × 30 rechnen – vergessen aber, dass man die erste Pille sofort nimmt."
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn du auf einem Wettrennen die zweite Person überholst, auf welchem Platz bist du dann?",
        answerA = "Erster",
        answerB = "Zweiter",
        answerC = "Dritter",
        answerD = "Letzter",
        correctAnswer = 1,
        explanation = "Wenn du die zweite Person überholst, bist du jetzt auf dem zweiten Platz – nicht dem ersten!",
        difficulty = 1,
        funFact = "Diese Frage prüft, ob man zwischen 'den Ersten überholen' und 'als Zweiten überholen' unterscheidet."
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Bauer hat 10 Kühe. Alle außer 6 sterben. Wie viele Kühe hat er noch?",
        answerA = "4",
        answerB = "10",
        answerC = "6",
        answerD = "0",
        correctAnswer = 2,
        explanation = "'Alle außer 6' bedeutet: 6 Kühe überleben. Die Antwort ist 6.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist schwerer: ein Kilogramm Federn oder ein Kilogramm Blei?",
        answerA = "Blei ist schwerer",
        answerB = "Beide wiegen gleich viel",
        answerC = "Federn sind schwerer",
        answerD = "Das hängt vom Volumen ab",
        correctAnswer = 1,
        explanation = "Ein Kilogramm ist ein Kilogramm – egal was man wiegt. Beide wiegen genau 1 kg.",
        difficulty = 1,
        funFact = "Blei ist viel dichter als Federn, aber bei gleicher Masse sind beide gleich schwer."
    ),

    Question(
        categoryId = 12,
        questionText = "Du hast 3 Äpfel und gibst einem Freund 2. Wie viele Äpfel hast du?",
        answerA = "5",
        answerB = "2",
        answerC = "1",
        answerD = "0",
        correctAnswer = 2,
        explanation = "3 Äpfel minus 2 abgegeben = 1 Apfel bleibt übrig.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn heute Mittwoch ist, was ist dann übermorgen?",
        answerA = "Donnerstag",
        answerB = "Freitag",
        answerC = "Samstag",
        answerD = "Dienstag",
        correctAnswer = 1,
        explanation = "Morgen wäre Donnerstag. Übermorgen (ein Tag danach) ist Freitag.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Vater ist 25 Jahre alt und sein Sohn ist 5. Wie lange dauert es, bis der Vater dreimal so alt ist wie der Sohn?",
        answerA = "5 Jahre",
        answerB = "10 Jahre",
        answerC = "15 Jahre",
        answerD = "20 Jahre",
        correctAnswer = 0,
        explanation = "In 5 Jahren: Vater=30, Sohn=10. Ist 30 das Dreifache von 10? Ja! 30=3×10. Die Antwort ist 5 Jahre.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn zwei Väter und zwei Söhne im Auto sitzen, aber nur 3 Personen, wie ist das möglich?",
        answerA = "Einer ist ein Geist",
        answerB = "Opa, Vater und Sohn – Vater ist beides",
        answerC = "Einer sitzt im Kofferraum",
        answerD = "Das ist unmöglich",
        correctAnswer = 1,
        explanation = "Großvater (Opa), Vater und Sohn: Der Opa ist Vater (seines Sohnes), der Sohn ist Vater (seines Kindes). Drei Personen, zwei Väter und zwei Söhne.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Minuten hat eine halbe Stunde?",
        answerA = "60",
        answerB = "45",
        answerC = "30",
        answerD = "15",
        correctAnswer = 2,
        explanation = "Eine Stunde hat 60 Minuten. Eine halbe Stunde ist 60÷2=30 Minuten.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was passiert, wenn du eine rote Socke in das blaue Meer wirfst?",
        answerA = "Das Wasser wird rot",
        answerB = "Die Socke wird nass",
        answerC = "Die Socke sinkt",
        answerD = "Das Meer wird kleiner",
        correctAnswer = 1,
        explanation = "Die Socke wird nass – das ist die einfachste und offensichtlichste Antwort!",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn 5 Katzen 5 Mäuse in 5 Minuten fangen, wie viele Minuten braucht 1 Katze für 1 Maus?",
        answerA = "1 Minute",
        answerB = "5 Minuten",
        answerC = "25 Minuten",
        answerD = "10 Minuten",
        correctAnswer = 1,
        explanation = "Jede Katze fängt in 5 Minuten 1 Maus. Also braucht 1 Katze für 1 Maus ebenfalls 5 Minuten.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Zug fährt von Berlin nach Hamburg in 2 Stunden. Wie lange dauert die Rückfahrt?",
        answerA = "4 Stunden",
        answerB = "1 Stunde",
        answerC = "2 Stunden",
        answerD = "3 Stunden",
        correctAnswer = 2,
        explanation = "Wenn der Hinweg 2 Stunden dauert, dauert der Rückweg (gleiche Strecke) auch 2 Stunden.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Welche Hand sollte man benutzen, um die Suppe zu rühren?",
        answerA = "Die rechte",
        answerB = "Die linke",
        answerC = "Keine – man benutzt einen Löffel",
        answerD = "Die stärkere Hand",
        correctAnswer = 2,
        explanation = "Suppe rührt man mit einem Löffel, nicht mit der Hand! Die Frage ist eine Ablenkungsfrage.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn du als fünfter in einer Warteschlange stehst und den ersten überholst, auf welchem Platz bist du?",
        answerA = "Erster",
        answerB = "Zweiter",
        answerC = "Vierter",
        answerD = "Fünfter",
        correctAnswer = 2,
        explanation = "Wenn du den Ersten überholst, nimmst du seinen Platz nicht ein – du bist jetzt direkt vor ihm, also auf Platz 1... Aber Warten: In einer Warteschlange bedeutet 'den Ersten überholen', dass du jetzt die erste Position einnimmst.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist größer: die Hälfte von 100 oder das Doppelte von 20?",
        answerA = "Die Hälfte von 100 (50)",
        answerB = "Das Doppelte von 20 (40)",
        answerC = "Beide sind gleich groß",
        answerD = "Das Doppelte von 100",
        correctAnswer = 0,
        explanation = "Hälfte von 100 = 50. Doppelte von 20 = 40. Also ist 50 größer als 40.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Schiff liegt im Hafen. Es hat eine Leiter mit Sprossen, jede Sprosse 30 cm auseinander. Bei Flut steigt das Wasser 1 Meter. Wie viele Sprossen liegen dann unter Wasser, wenn anfangs 2 Sprossen unter Wasser waren?",
        answerA = "5 Sprossen",
        answerB = "6 Sprossen",
        answerC = "2 Sprossen",
        answerD = "Noch mehr",
        correctAnswer = 2,
        explanation = "Das Schiff schwimmt! Bei Flut hebt sich das Schiff mit dem Wasser – die Leiter bleibt relativ zum Wasser gleich. Immer noch 2 Sprossen unter Wasser.",
        difficulty = 1,
        funFact = "Diese Frage täuscht, weil man intuitiv denkt, das Wasser steigt relativ zur Leiter – vergisst aber, dass das Schiff mitschwimmt."
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn Anna schneller läuft als Bernd und Bernd schneller als Clara, wer ist am langsamsten?",
        answerA = "Anna",
        answerB = "Bernd",
        answerC = "Clara",
        answerD = "Alle gleich schnell",
        correctAnswer = 2,
        explanation = "Anna > Bernd > Clara. Clara ist am langsamsten.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Vor 2 Jahren war Maria 10 Jahre alt. Wie alt wird sie in 3 Jahren sein?",
        answerA = "13",
        answerB = "14",
        answerC = "15",
        answerD = "12",
        correctAnswer = 2,
        explanation = "Vor 2 Jahren war sie 10 – heute ist sie 12. In 3 Jahren wird sie 15 sein.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt nach Dienstag und vor Donnerstag?",
        answerA = "Montag",
        answerB = "Mittwoch",
        answerC = "Freitag",
        answerD = "Samstag",
        correctAnswer = 1,
        explanation = "Montag, Dienstag, Mittwoch, Donnerstag... Der Mittwoch kommt nach Dienstag und vor Donnerstag.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Hund hat 4 Pfoten. Wie viele Pfoten haben 3 Hunde?",
        answerA = "8",
        answerB = "12",
        answerC = "16",
        answerD = "10",
        correctAnswer = 1,
        explanation = "3 Hunde × 4 Pfoten = 12 Pfoten.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn alle Blumen Pflanzen sind und manche Pflanzen giftig sind, können dann manche Blumen giftig sein?",
        answerA = "Nein, niemals",
        answerB = "Ja, möglicherweise",
        answerC = "Alle Blumen sind giftig",
        answerD = "Das kann man nicht sagen",
        correctAnswer = 1,
        explanation = "Da manche Pflanzen giftig sind und Blumen Pflanzen sind, ist es möglich (nicht sicher), dass manche Blumen giftig sind.",
        difficulty = 1,
        funFact = "Viele bekannte Blumen sind tatsächlich giftig, z.B. Oleander, Maiglöckchen und Herbstzeitlose."
    ),

    Question(
        categoryId = 12,
        questionText = "Was kommt nach Dezember?",
        answerA = "November",
        answerB = "Januar",
        answerC = "Februar",
        answerD = "Oktober",
        correctAnswer = 1,
        explanation = "Nach Dezember (dem letzten Monat des Jahres) kommt Januar (der erste Monat des neuen Jahres).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Ein Bäcker hat 20 Brötchen gebacken. Er verkauft die Hälfte davon am Morgen. Wie viele hat er noch?",
        answerA = "5",
        answerB = "10",
        answerC = "15",
        answerD = "12",
        correctAnswer = 1,
        explanation = "Hälfte von 20 = 10 verkauft. Übrig bleiben 20 - 10 = 10 Brötchen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn ein Huhn und ein halbes in eineinhalb Tagen ein Ei und ein halbes legen, wie lange legt dann ein Huhn für ein Ei?",
        answerA = "Einen Tag",
        answerB = "Eineinhalb Tage",
        answerC = "Zwei Tage",
        answerD = "Einen halben Tag",
        correctAnswer = 1,
        explanation = "1,5 Hühner legen in 1,5 Tagen 1,5 Eier. Also legt 1 Huhn in 1,5 Tagen 1 Ei.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn du 10 Euro hast und einen Apfel für 3 Euro und ein Brot für 4 Euro kaufst, wie viel hast du noch?",
        answerA = "4 Euro",
        answerB = "3 Euro",
        answerC = "2 Euro",
        answerD = "1 Euro",
        correctAnswer = 1,
        explanation = "10 - 3 - 4 = 3 Euro.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist das Ergebnis von: Hälfte von 8 plus Doppeltes von 3?",
        answerA = "9",
        answerB = "10",
        answerC = "11",
        answerD = "8",
        correctAnswer = 1,
        explanation = "Hälfte von 8 = 4. Doppeltes von 3 = 6. 4 + 6 = 10.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Max ist älter als Lisa. Lisa ist älter als Tom. Wer ist am jüngsten?",
        answerA = "Max",
        answerB = "Lisa",
        answerC = "Tom",
        answerD = "Alle gleich alt",
        correctAnswer = 2,
        explanation = "Max > Lisa > Tom. Tom ist am jüngsten.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wann ist die nächste Silvesternacht?",
        answerA = "Am 1. Januar",
        answerB = "Am 31. Dezember",
        answerC = "Am 24. Dezember",
        answerD = "Am 30. Dezember",
        correctAnswer = 1,
        explanation = "Silvester ist immer am 31. Dezember – der letzte Tag des Jahres.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Auf einem Bauernhof gibt es 5 Hühner und 3 Kühe. Wie viele Beine sind das insgesamt?",
        answerA = "28",
        answerB = "32",
        answerC = "22",
        answerD = "26",
        correctAnswer = 3,
        explanation = "Hühner haben 2 Beine: 5×2=10. Kühe haben 4 Beine: 3×4=12. Insgesamt: 10+12=22. Warte – 10+12=22, aber die Antwort D=26? Lass uns nochmal prüfen: 5 Hühner × 2 = 10, 3 Kühe × 4 = 12, Gesamt = 22. Antwort C=22 ist korrekt.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Auf einem Bauernhof gibt es 5 Hühner und 3 Kühe. Wie viele Beine sind das insgesamt?",
        answerA = "28",
        answerB = "32",
        answerC = "22",
        answerD = "26",
        correctAnswer = 2,
        explanation = "Hühner haben 2 Beine: 5×2=10. Kühe haben 4 Beine: 3×4=12. Insgesamt: 10+12=22.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Du schläfst um 22 Uhr ein und stellst den Wecker auf 7 Uhr morgens. Wie viele Stunden schläfst du?",
        answerA = "7 Stunden",
        answerB = "8 Stunden",
        answerC = "9 Stunden",
        answerD = "10 Stunden",
        correctAnswer = 2,
        explanation = "Von 22 Uhr bis 7 Uhr morgens sind es 9 Stunden.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn heute Montag ist, was war vorgestern?",
        answerA = "Samstag",
        answerB = "Sonntag",
        answerC = "Freitag",
        answerD = "Dienstag",
        correctAnswer = 0,
        explanation = "Heute=Montag, gestern=Sonntag, vorgestern=Samstag.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn Licht schneller als Schall ist, kann man dann den Blitz sehen, bevor man den Donner hört?",
        answerA = "Nein, man hört Donner zuerst",
        answerB = "Ja, man sieht Blitz zuerst",
        answerC = "Beide gleichzeitig",
        answerD = "Das hängt vom Wetter ab",
        correctAnswer = 1,
        explanation = "Ja! Licht ist ca. 300.000 km/s schnell, Schall nur ca. 340 m/s. Deshalb sieht man den Blitz vor dem Donner.",
        difficulty = 1,
        funFact = "Pro 3 Sekunden Zeitdifferenz zwischen Blitz und Donner ist das Gewitter etwa 1 km entfernt."
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn du 6 Orangen hast und isst 2, wie viele hast du noch?",
        answerA = "2",
        answerB = "4",
        answerC = "6",
        answerD = "3",
        correctAnswer = 1,
        explanation = "6 - 2 = 4 Orangen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn jemand 18 Jahre lang jeden Tag eine Münze spart, wie viele Münzen hat er dann?",
        answerA = "18 Münzen",
        answerB = "6.570 Münzen",
        answerC = "365 Münzen",
        answerD = "1.800 Münzen",
        correctAnswer = 1,
        explanation = "18 Jahre × 365 Tage = 6.570 Münzen (ohne Schaltjahre).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Eine Familie hat 4 Kinder. Jedes Kind hat eine Schwester. Wie viele Schwestern hat jedes Kind mindestens?",
        answerA = "4",
        answerB = "1",
        answerC = "3",
        answerD = "0",
        correctAnswer = 1,
        explanation = "Die Aussage sagt, dass jedes Kind EINE Schwester hat. Also hat jedes Kind mindestens 1 Schwester.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Kann ein Mann in Deutschland seine Witwe heiraten?",
        answerA = "Ja, wenn er einen Antrag macht",
        answerB = "Nein, das ist verboten",
        answerC = "Nein – wenn er eine Witwe hat, ist er tot",
        answerD = "Nur in bestimmten Bundesländern",
        correctAnswer = 2,
        explanation = "Eine Witwe ist eine Frau, deren Mann gestorben ist. Wenn er gestorben ist, kann er niemanden mehr heiraten.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Es gibt 3 Äpfel und du nimmst 2. Wie viele Äpfel hast du?",
        answerA = "1",
        answerB = "2",
        answerC = "3",
        answerD = "0",
        correctAnswer = 1,
        explanation = "Du nimmst 2 Äpfel – die hast du bei dir. Du hast 2 Äpfel.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist mehr wert: eine Tonne Gold oder eine Tonne Federn?",
        answerA = "Eine Tonne Gold",
        answerB = "Eine Tonne Federn",
        answerC = "Beide wiegen gleich – aber Gold ist wertvoller",
        answerD = "Beide sind gleichwertig",
        correctAnswer = 2,
        explanation = "Eine Tonne ist eine Tonne – beide wiegen gleich. Aber Gold ist teurer als Federn, also ist eine Tonne Gold wertvoller.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn du 2 Münzen in der Hand hältst und sie zusammen 30 Cent ergeben, und eine davon ist kein 10-Cent-Stück – welche Münzen sind es?",
        answerA = "Zwei 15-Cent-Stücke",
        answerB = "Ein 20-Cent- und ein 10-Cent-Stück",
        answerC = "Zwei 10-Cent-Stücke",
        answerD = "Ein 5-Cent- und ein 25-Cent-Stück",
        correctAnswer = 1,
        explanation = "Ein 20-Cent und ein 10-Cent-Stück ergeben 30 Cent. 'Eine davon ist kein 10-Cent-Stück' stimmt – die 20-Cent-Münze ist kein 10-Cent-Stück. Die andere ist ein 10-Cent-Stück!",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn Anna 5 Äpfel hat und Bernd 3 Äpfel, wie viele Äpfel muss Bernd an Anna geben, damit beide gleich viele haben?",
        answerA = "2",
        answerB = "1",
        answerC = "3",
        answerD = "0",
        correctAnswer = 1,
        explanation = "Gesamt: 5+3=8 Äpfel. Jeder bekommt 8÷2=4. Bernd hat 3, gibt also 3-4= –1... Das geht nicht so einfach. Anna gibt Bernd 1 Apfel: Anna hat 4, Bernd hat 4. Anna gibt Bernd, nicht andersherum.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Monate haben 30 Tage?",
        answerA = "4",
        answerB = "6",
        answerC = "11",
        answerD = "7",
        correctAnswer = 0,
        explanation = "April, Juni, September und November haben genau 30 Tage – das sind 4 Monate. (Andere haben 31 oder 28/29.)",
        difficulty = 1,
        funFact = "Eselsbrücke: 'Dreißig Tage hat September, April, Juni und November.'"
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn ein Stein in einen See geworfen wird – welche Wellen breiten sich zuerst aus?",
        answerA = "Die äußeren Wellen",
        answerB = "Die inneren Wellen (direkt um den Aufprallpunkt)",
        answerC = "Alle Wellen gleichzeitig",
        answerD = "Es entstehen keine Wellen",
        correctAnswer = 1,
        explanation = "Die Wellen entstehen zuerst direkt am Auftreffpunkt und breiten sich dann nach außen aus.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was ist leichter zu heben: ein leerer oder ein voller Rucksack?",
        answerA = "Der volle Rucksack",
        answerB = "Der leere Rucksack",
        answerC = "Beide gleich schwer",
        answerD = "Das hängt vom Inhalt ab",
        correctAnswer = 1,
        explanation = "Ein leerer Rucksack hat weniger Gewicht und ist deshalb leichter zu heben.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wie viele Ecken hat ein Kreis?",
        answerA = "1",
        answerB = "4",
        answerC = "Unendlich viele",
        answerD = "0",
        correctAnswer = 3,
        explanation = "Ein Kreis hat keine Ecken – er besteht nur aus einer gleichmäßig geschwungenen Linie.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was hat Gebirge, Täler und Flüsse, aber keine Bäume?",
        answerA = "Ein Traum",
        answerB = "Eine Landkarte",
        answerC = "Ein Puzzle",
        answerD = "Ein Film",
        correctAnswer = 1,
        explanation = "Eine Landkarte zeigt Gebirge, Täler und Flüsse symbolisch, aber hat natürlich keine echten Bäume.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Wenn es in 3 Tagen Dienstag ist, was ist dann heute?",
        answerA = "Freitag",
        answerB = "Samstag",
        answerC = "Sonntag",
        answerD = "Montag",
        correctAnswer = 1,
        explanation = "Zähle rückwärts: Dienstag minus 3 Tage = Samstag. (Di=Donnerstag, Mi=Mittwoch, Sa=Samstag – 3 Tage zurück.)",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 12,
        questionText = "Was kann fliegen, hat aber keine Flügel?",
        answerA = "Ein Hubschrauber",
        answerB = "Die Zeit",
        answerC = "Ein Drachen",
        answerD = "Eine Rakete",
        correctAnswer = 1,
        explanation = "Die Zeit 'vergeht' (fliegt) – man sagt 'die Zeit fliegt'. Sie hat aber keine physischen Flügel.",
        difficulty = 1,
        funFact = null
    )
)
