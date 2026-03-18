package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun sportQuestionsEasy3(): List<Question> = listOf(

    // ─── SKISPORT (8) ─────────────────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Welche alpine Skidisziplin ist die schnellste?",
        answerA = "Riesenslalom",
        answerB = "Super-G",
        answerC = "Abfahrt",
        answerD = "Kombination",
        correctAnswer = 2,
        explanation = "Die Abfahrt ist die schnellste alpine Ski-Disziplin – Athleten erreichen dabei Spitzengeschwindigkeiten von ueber 140 km/h.",
        difficulty = 1,
        funFact = "Die beruehmteste Abfahrtsstrecke der Welt ist die Streif in Kitzbuehel (Oesterreich) – sie gilt als schwierigste und gefaehrlichste Abfahrt im Weltcup."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie nennt man die Schutzbrille, die Skifahrer tragen?",
        answerA = "Visier",
        answerB = "Skibrille",
        answerC = "Schneebrille",
        answerD = "Helmbrille",
        correctAnswer = 1,
        explanation = "Skibrillen schuetzen die Augen vor Wind, Schnee, UV-Strahlung und Kälte beim alpinen Skifahren.",
        difficulty = 1,
        funFact = "Moderne Skibrillen haben eine polarisierte und verspiegelte Beschichtung, die bis zu 100 % der UV-Strahlen filtert."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Doppelstock' beim Langlaufski?",
        answerA = "Zwei Stockstoesse gleichzeitig mit beiden Armen",
        answerB = "Das Mitfuehren eines Ersatzstocks",
        answerC = "Eine Technik im Abfahrtsski",
        answerD = "Ein doppelt langer Skistock",
        correctAnswer = 0,
        explanation = "Beim Doppelstock (Skating-Technik) werden beide Stöcke gleichzeitig eingesetzt – ideal fuer flache Strecken und hohe Geschwindigkeit.",
        difficulty = 1,
        funFact = "Professionelle Langlaeufer setzen den Doppelstock bei Wettkampfabschnitten ein, um die hoechste Energieeffizienz zu erzielen."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Skifahrer gewann die meisten Weltcup-Abfahrten der Geschichte?",
        answerA = "Franz Klammer",
        answerB = "Hermann Maier",
        answerC = "Didier Cuche",
        answerD = "Ingemar Stenmark",
        correctAnswer = 2,
        explanation = "Didier Cuche aus der Schweiz gewann 26 Abfahrten im Weltcup und ist damit Rekordhalter in dieser Disziplin.",
        difficulty = 1,
        funFact = "Ingemar Stenmark haelt den Gesamtrekord mit 86 Weltcup-Siegen – die meisten davon im Slalom und Riesenslalom."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist Freestyle-Skiing?",
        answerA = "Freies Skifahren abseits der Piste",
        answerB = "Akrobatisches Skifahren mit Spruengen und Tricks",
        answerC = "Skifahren ohne Stöcke",
        answerD = "Skifahren auf Kunststoffmatten",
        correctAnswer = 1,
        explanation = "Freestyle-Skiing umfasst akrobatische Ski-Disziplinen wie Moguls, Aerials und Halfpipe – seit 1992 olympisch.",
        difficulty = 1,
        funFact = "Bei Aerials (Sprunglaufen) werden bis zu 20 Meter hohe Spruenge mit bis zu drei Saltos und Schrauben ausgefuehrt."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie heisst die Weltcup-Gesamtwertung im alpinen Skifahren?",
        answerA = "Kristallkugel",
        answerB = "Goldene Ski",
        answerC = "Weltcuppokal",
        answerD = "Alpiner Globus",
        correctAnswer = 0,
        explanation = "Der Gewinner der Gesamt-Weltcupwertung im alpinen Ski erhalt die Grosse Kristallkugel – eines der begehrtesten Trophäen im Ski-Sport.",
        difficulty = 1,
        funFact = "Die Kristallkugel wird seit 1967 vergeben – Marcel Hirscher gewann sie achtmal in Folge (2012-2019), absoluter Rekord."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Carving' beim modernen Skifahren?",
        answerA = "Das Eingraben der Skikante in den Schnee fuer scharfe Kurven ohne zu rutschen",
        answerB = "Eine besondere Skibindung",
        answerC = "Das Praeparieren einer Skipiste",
        answerD = "Ein Sprung mit Drehung",
        correctAnswer = 0,
        explanation = "Carving ist eine moderne Skitechnik, bei der die Skikanten sauber in den Schnee geschnitten werden – ohne Seitwärtsrutschen.",
        difficulty = 1,
        funFact = "Carvingski haben eine ausgepraegt taillierte Form – dadurch fahren sie von sich aus Kurven, ohne dass der Fahrer viel tun muss."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Schutzausruestung ist auf vielen Skipisten fuer Kinder Pflicht?",
        answerA = "Knieprotektoren",
        answerB = "Skihelm",
        answerC = "Rueckenprotektor",
        answerD = "Handschuhe",
        correctAnswer = 1,
        explanation = "In vielen Laendern und Skigebieten ist der Skihelm fuer Kinder gesetzlich vorgeschrieben – er schuetzt vor Kopfverletzungen.",
        difficulty = 1,
        funFact = "Seit Unfaellen mit Prominenten wie Michael Schumacher (2013) ist das Bewusstsein fuer Skihelme enorm gestiegen."
    ),

    // ─── FUSSBALL-NATIONALMANNSCHAFTEN (8) ────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Welche Nationalmannschaft traegt den Spitznamen 'Die Selecao'?",
        answerA = "Portugal",
        answerB = "Argentinien",
        answerC = "Brasilien",
        answerD = "Spanien",
        correctAnswer = 2,
        explanation = "Die brasilianische Nationalmannschaft heisst 'A Selecao' (Die Auswahl) – sie hat fuenf WM-Titel gewonnen, mehr als jedes andere Land.",
        difficulty = 1,
        funFact = "Brasilien ist das einzige Land, das an allen FIFA-Weltmeisterschaften teilgenommen hat – von 1930 bis heute."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Nationalmannschaft traegt den Spitznamen 'Les Bleus' (Die Blauen)?",
        answerA = "Belgien",
        answerB = "Frankreich",
        answerC = "Italien",
        answerD = "Griechenland",
        correctAnswer = 1,
        explanation = "Die franzoesische Fussballnationalmannschaft wird 'Les Bleus' genannt – wegen ihrer blauen Heimtrikots.",
        difficulty = 1,
        funFact = "Frankreich gewann die WM 1998 im eigenen Land und holte 2018 in Russland den zweiten Weltmeistertitel."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie viele Male wurde England Fussball-Weltmeister?",
        answerA = "0",
        answerB = "1",
        answerC = "2",
        answerD = "3",
        correctAnswer = 1,
        explanation = "England wurde genau einmal Weltmeister – 1966 im eigenen Land. Das Finale gegen die Bundesrepublik Deutschland endete 4:2.",
        difficulty = 1,
        funFact = "Das beruehmte Wembleytor (4:2-Sieg gegen Deutschland 1966) ist bis heute eines der meistdiskutierten Tore der WM-Geschichte."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Nationalmannschaft traegt den Spitznamen 'Oranje'?",
        answerA = "Belgien",
        answerB = "Daenemark",
        answerC = "Niederlande",
        answerD = "Schweden",
        correctAnswer = 2,
        explanation = "Die niederlaendische Nationalmannschaft traegt orangefarbene Trikots und wird daher 'Oranje' genannt.",
        difficulty = 1,
        funFact = "Orange ist die Nationalfarbe der Niederlande, benannt nach dem Adelsgeschlecht Haus Oranien-Nassau."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Land hat die Fussball-WM am haeufigsten gewonnen?",
        answerA = "Deutschland",
        answerB = "Argentinien",
        answerC = "Italien",
        answerD = "Brasilien",
        correctAnswer = 3,
        explanation = "Brasilien ist fuenffacher Weltmeister (1958, 1962, 1970, 1994, 2002) – kein anderes Land hat oefter gewonnen.",
        difficulty = 1,
        funFact = "Brasil ien ist das einzige Team, das die WM auf verschiedenen Kontinenten gewann – in Schweden, Chile, Mexiko, USA und Japan/Korea."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Nationalmannschaft spielt in roten Trikots und kommt aus Spanien?",
        answerA = "Atletico Madrid",
        answerB = "Spanien (La Roja)",
        answerC = "FC Barcelona",
        answerD = "Real Mallorca",
        correctAnswer = 1,
        explanation = "Die spanische Nationalmannschaft traegt rote Trikots und wird 'La Roja' (Die Rote) genannt.",
        difficulty = 1,
        funFact = "Spanien gewann 2010 als erstes europaeisches Team die WM auf einem anderen Kontinent (Suedafrika) und dominierte mit dem 'Tiki-Taka'-Stil."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Nation gilt als Wiege des Fussballs?",
        answerA = "Deutschland",
        answerB = "Brasilien",
        answerC = "England",
        answerD = "Schottland",
        correctAnswer = 2,
        explanation = "England gilt als Ursprungsland des modernen Fussballs – die Regeln wurden dort 1863 vom Football Association (FA) offiziell festgelegt.",
        difficulty = 1,
        funFact = "Das erste offizielle Fussballlaenderspiel der Geschichte fand am 30. November 1872 zwischen Schottland und England statt – Endstand 0:0."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie heisst der berueckteste Wettbewerb fuer europaeische Nationalmannschaften?",
        answerA = "UEFA Nations League",
        answerB = "Europameisterschaft (EM)",
        answerC = "UEFA Cup",
        answerD = "Confed-Cup",
        correctAnswer = 1,
        explanation = "Die UEFA-Europameisterschaft ist der wichtigste Wettbewerb fuer europaeische Nationalmannschaften – sie findet alle vier Jahre statt.",
        difficulty = 1,
        funFact = "Deutschland (bzw. Westdeutschland) und Spanien haben die EM je dreimal gewonnen – gemeinsam die Rekordhalter."
    ),

    // ─── RADFAHREN-BASICS (7) ─────────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Wie heisst das beruemteste Radrennen der Welt?",
        answerA = "Giro d'Italia",
        answerB = "Vuelta a Espana",
        answerC = "Tour de France",
        answerD = "Criterium du Dauphiné",
        correctAnswer = 2,
        explanation = "Die Tour de France ist das beruemteste und prestigetraechtigste Etappenrennen der Welt – sie findet jedes Jahr im Juli statt.",
        difficulty = 1,
        funFact = "Die Tour de France wurde erstmals 1903 ausgetragen und umfasst heute etwa 3.500 km in 21 Etappen ueber drei Wochen."
    ),

    Question(
        categoryId = 6,
        questionText = "Was traegt der fuehrende Fahrer bei der Tour de France?",
        answerA = "Weisses Trikot",
        answerB = "Gepunktetes Trikot",
        answerC = "Gruenes Trikot",
        answerD = "Gelbes Trikot",
        correctAnswer = 3,
        explanation = "Der Fuehrende im Gesamtklassement traegt das gelbe Trikot (Maillot Jaune) – ein Symbol der Dominanz im Radsport.",
        difficulty = 1,
        funFact = "Das gruene Trikot gehoert dem besten Sprinter, das gepunktete Trikot dem besten Bergfahrer, das weisse Trikot dem besten Jungprofi."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie nennt man eine Gruppe von Radfahrern, die eng zusammenfahren?",
        answerA = "Peloton",
        answerB = "Escadron",
        answerC = "Kolonne",
        answerD = "Brigade",
        correctAnswer = 0,
        explanation = "Das Peloton ist das Hauptfeld der Radfahrer, das im Windschatten der anderen Fahrer erheblich weniger Energie verbraucht.",
        difficulty = 1,
        funFact = "Fahrer im Peloton verbrauchen bis zu 30 % weniger Energie als der Fuehrende – daher ist es taktisch entscheidend, wann man ausreisst."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche drei grossen Etappenrennen bilden den 'Grand Tour'?",
        answerA = "Tour de France, Paris-Roubaix, Giro",
        answerB = "Tour de France, Giro d'Italia, Vuelta a Espana",
        answerC = "Tour de France, Vuelta, Ronde van Vlaanderen",
        answerD = "Giro, Dauphine, Tour de Suisse",
        correctAnswer = 1,
        explanation = "Die drei Grand Tours sind Tour de France, Giro d'Italia und Vuelta a Espana – die prestigetraechtigsten Etappenrennen im Radsport.",
        difficulty = 1,
        funFact = "Nur wenige Fahrer haben alle drei Grand Tours in ihrer Karriere gewonnen – darunter Eddy Merckx, Bernard Hinault und Miguel Indurain."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Zeitfahren' im Radsport?",
        answerA = "Ein Rennen, das nach einer vorgegebenen Zeit gestoppt wird",
        answerB = "Eine Etappe, bei der jeder Fahrer allein gegen die Uhr antritt",
        answerC = "Ein Sprint ueber 200 Meter",
        answerD = "Ein Bergrennen mit Zeitvorgabe",
        correctAnswer = 1,
        explanation = "Beim Zeitfahren (Contre-la-montre) startet jeder Fahrer allein und faehrt die Strecke so schnell wie moeglich – der Schnellste gewinnt.",
        difficulty = 1,
        funFact = "Das Zeitfahren gilt als 'Race of Truth', weil Windschattenschieben nicht erlaubt ist und nur die reine Leistung zaehlt."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Land stellt besonders viele erfolgreiche Bergfahrer im Radsport?",
        answerA = "Belgien",
        answerB = "Deutschland",
        answerC = "Kolumbien",
        answerD = "Daenemark",
        correctAnswer = 2,
        explanation = "Kolumbien bringt viele herausragende Bergfahrer hervor – bedingt durch das Hochland der Anden, wo Training in grosser Hoehe moeglich ist.",
        difficulty = 1,
        funFact = "Egan Bernal gewann 2019 als erster Kolumbianer die Tour de France – mit nur 22 Jahren der juengste Sieger seit 110 Jahren."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Velodrom'?",
        answerA = "Ein Radfahrer-Hotel bei Etappenrennen",
        answerB = "Eine ueberdachte Bahn mit steil geneigten Kurven fuer Bahnradsport",
        answerC = "Ein Mountainbike-Parcours",
        answerD = "Ein Radfahrverein",
        correctAnswer = 1,
        explanation = "Ein Velodrom ist eine Rennbahn fuer den Bahnradsport – mit steil geneigten Kurven (bis zu 45 Grad) fuer hohe Kurvengeschwindigkeiten.",
        difficulty = 1,
        funFact = "Im Velodrom werden Rennraeder ohne Gangschaltung und ohne Bremsen eingesetzt – die Geschwindigkeit wird durch Beinwiderstand kontrolliert."
    ),

    // ─── DART (6) ─────────────────────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Von welcher Entfernung wirft ein Spieler beim professionellen Dart?",
        answerA = "2,00 m",
        answerB = "2,37 m",
        answerC = "2,74 m",
        answerD = "3,00 m",
        correctAnswer = 2,
        explanation = "Die offizielle Wurfentfernung beim professionellen Dart betraegt 2,37 Meter (7 Fuss 9,25 Zoll) von der Oche bis zur Scheibe.",
        difficulty = 1,
        funFact = "Die Linie, hinter der ein Dartspieler stehen muss, heisst 'Oche' (sprich: Oki) – der Begriff stammt aus dem britischen Dialekt."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Bullseye' beim Dart?",
        answerA = "Das kleinste rote Feld genau in der Mitte der Scheibe",
        answerB = "Ein Treffer in den Bereich Triple 20",
        answerC = "Ein Doppelfeld am Rand",
        answerD = "Ein Fehlwurf ohne Punktwert",
        correctAnswer = 0,
        explanation = "Das Bullseye ist das kleine rote Mittelfeld der Dartscheibe und zaehlt 50 Punkte – der maximale Wert eines einzelnen Wurfs.",
        difficulty = 1,
        funFact = "Das grune Feld um das Bullseye herum heisst 'Bull' und zaehlt 25 Punkte – zusammen bilden sie das 'Double Bull'."
    ),

    Question(
        categoryId = 6,
        questionText = "Von welchem Startpunktzahl spielen Profis beim Dart herunter?",
        answerA = "301",
        answerB = "501",
        answerC = "701",
        answerD = "1001",
        correctAnswer = 1,
        explanation = "Im Profi-Dart wird meist von 501 Punkten auf 0 heruntergespielt – das Spiel muss exakt auf 0 beendet werden (Checkout).",
        difficulty = 1,
        funFact = "Ein perfekter Leg ist das 'Nine-Darter' – alle 501 Punkte in nur 9 Wuerfen: 3x T20, 3x T20, T20, T19, D12."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie heisst das beruemteste Darts-Turnier der Welt?",
        answerA = "World Grand Prix",
        answerB = "PDC World Darts Championship",
        answerC = "BDO World Championship",
        answerD = "Premier League Darts",
        correctAnswer = 1,
        explanation = "Die PDC World Darts Championship am Alexandra Palace in London (ab Weihnachten) ist das prestigetraechtigste Turnier im Profi-Dart.",
        difficulty = 1,
        funFact = "Das Turnier am Alexandra Palace wird liebevoll 'Ally Pally' genannt – der Zuschauer feiern dort in Partystimmung wie kaum woanders im Sport."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Darts-Spieler traegt den Spitznamen 'The Power'?",
        answerA = "Michael van Gerwen",
        answerB = "Raymond van Barneveld",
        answerC = "Phil Taylor",
        answerD = "Gary Anderson",
        correctAnswer = 2,
        explanation = "Phil Taylor traegt den Spitznamen 'The Power' und gewann 16 Weltmeistertitel – er gilt als bester Dartspieler aller Zeiten.",
        difficulty = 1,
        funFact = "Phil Taylor gewann seinen letzten WM-Titel 2013 und beendete 2018 seine Karriere – mit einem Finalauftritt bei der WM als Abschiedsgeschenk."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie viele Segmente (Zahlenfelder) hat eine Dartscheibe ausser Bull und Bullseye?",
        answerA = "18",
        answerB = "20",
        answerC = "22",
        answerD = "24",
        correctAnswer = 1,
        explanation = "Eine Dartscheibe hat 20 nummerierte Segmente (1 bis 20), dazu Bull (25 Punkte) und Bullseye (50 Punkte).",
        difficulty = 1,
        funFact = "Die Anordnung der Zahlen (1-20) auf der Scheibe wurde so gestaltet, dass benachbarte hohe Zahlen neben niedrigen liegen – um Glueckstreffer zu bestrafen."
    ),

    // ─── FECHTEN / BOGENSCHIESSEN (6) ─────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Welche drei Waffen gibt es im olympischen Fechten?",
        answerA = "Schwert, Saebel, Dolch",
        answerB = "Florett, Degen, Saebel",
        answerC = "Florett, Rapier, Saebel",
        answerD = "Degen, Langschwert, Florett",
        correctAnswer = 1,
        explanation = "Im olympischen Fechten gibt es drei Waffengattungen: Florett (nur Rumpf trefferwertig), Degen (ganzer Koerper) und Saebel (Oberkörper).",
        difficulty = 1,
        funFact = "Fechten war bei den ersten modernen Olympischen Spielen 1896 dabei und gehoert damit zu den aeltesten olympischen Sportarten."
    ),

    Question(
        categoryId = 6,
        questionText = "Was traegt ein Fechter zum Schutz des Gesichts?",
        answerA = "Helm",
        answerB = "Maske",
        answerC = "Visier",
        answerD = "Schutzbrille",
        correctAnswer = 1,
        explanation = "Fechter tragen eine spezielle Maske aus Metallgitter, die Gesicht und Hals schuetzt.",
        difficulty = 1,
        funFact = "Eine Fechtmaske muss laut Reglement einem Druck von mindestens 12 Kilogramm standhalten – sie wird regelmaessig auf Sicherheit geprueft."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die maximale Entfernung beim olympischen Bogenschiessen?",
        answerA = "50 Meter",
        answerB = "70 Meter",
        answerC = "90 Meter",
        answerD = "100 Meter",
        correctAnswer = 1,
        explanation = "Im olympischen Bogenschiessen (Recurvebogen) betraegt die offizielle Wettkampfentfernung 70 Meter.",
        difficulty = 1,
        funFact = "Compoundbogen schiessen auf 50 Meter – sie sind nicht olympisch, aber bei Weltmeisterschaften und bei WA-Wettbewerben sehr beliebt."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie viele Punkte zaehlt der goldene Mittelpunkt (Zehn-Ring) beim Bogenschiessen?",
        answerA = "8",
        answerB = "9",
        answerC = "10",
        answerD = "12",
        correctAnswer = 2,
        explanation = "Der innerste Kreis der Bogenschiess-Scheibe (Zehnring/X-Ring) zaehlt 10 Punkte – die hoechste Wertung.",
        difficulty = 1,
        funFact = "Bei Gleichstand entscheidet der sogenannte X-Ring (der innerste Teil des Zehners) – wer mehr X-Treffer hat, gewinnt."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Pfeil' beim Bogenschiessen?",
        answerA = "Der Bogen selbst",
        answerB = "Das Geschoss, das abgeschossen wird",
        answerC = "Eine Punktwertung",
        answerD = "Der Ring um die Scheibenmitte",
        correctAnswer = 1,
        explanation = "Ein Pfeil ist das Geschoss beim Bogenschiessen – er besteht aus Schaft, Befiederung, Nocke und Spitze.",
        difficulty = 1,
        funFact = "Moderne Wettkampfpfeile bestehen aus Carbon oder Aluminium und sind auf die individuellen Zugeigenschaften des Bogens abgestimmt."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie nennt man die Linie, von der aus Bogenschuetzen schiessen?",
        answerA = "Abschusskante",
        answerB = "Schiessline",
        answerC = "Schiessstand",
        answerD = "Wartelinie",
        correctAnswer = 1,
        explanation = "Die Schiesslinie (auch Abschusspunkt genannt) ist die markierte Linie, hinter der Bogenschuetzen stehen und abschiessen.",
        difficulty = 1,
        funFact = "Beim internationalen Recurvebogen-Wettbewerb haben Schuetzen pro Pfeil 40 Sekunden Zeit – bei Teamwettkaeumpfen 80 Sekunden fuer drei Pfeile."
    ),

    // ─── SPORT-AUSRUESTUNG (8) ────────────────────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Wie heisst der Schutzhelm, den Radfahrer beim Mountainbiken tragen?",
        answerA = "Kopfschutz",
        answerB = "Fahrradhelm",
        answerC = "MTB-Helm",
        answerD = "Crash-Helm",
        correctAnswer = 1,
        explanation = "Radfahrer – ob auf der Strasse oder im Gelände – tragen einen Fahrradhelm als wichtigste Schutzausruestung.",
        difficulty = 1,
        funFact = "Fahrradhelme muessen nach starken Aufprallen ausgewechselt werden, auch wenn keine sichtbaren Schaeden erkennbar sind."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Schlaeger' im Squash?",
        answerA = "Ein Geraet zum Aufschlaegen des Balls gegen die Wand",
        answerB = "Ein Tischtennisschlager",
        answerC = "Ein Hockeystock",
        answerD = "Ein Baseball-Schlaeger",
        correctAnswer = 0,
        explanation = "Im Squash wird ein spezieller langer Schlaeger verwendet, um einen kleinen Gummiball gegen die Wand zu spielen.",
        difficulty = 1,
        funFact = "Der Squash-Ball muss erst aufgewaermt werden – ein kalter Ball springt kaum, ein warmer Ball springt viel besser."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist eine 'Schwimmbrille'?",
        answerA = "Eine spezielle Brille fuer Schwimmer, die die Augen vor Wasser schuetzt",
        answerB = "Eine Tauchermaske fuer tiefseetauchen",
        answerC = "Sicherheitsbrille fuer Wasserski",
        answerD = "UV-Schutzbrille fuer den Strand",
        correctAnswer = 0,
        explanation = "Schwimmbrillen dichten die Augen gegen Wasser ab und ermoeglichen klare Sicht unter Wasser – sie sind Standard bei allen Wettkampfschwimmern.",
        difficulty = 1,
        funFact = "Die ersten Schwimmbrillen wurden aus Schildpatt und Leder gefertigt – moderne Brillen bestehen aus Silikonrahmen und Polycarbonat-Glaesern."
    ),

    Question(
        categoryId = 6,
        questionText = "Was bezeichnet man beim Fussball als 'Stollenschuhe'?",
        answerA = "Spezielle Fussballschuhe mit Noppen an der Sohle fuer Halt auf Rasen",
        answerB = "Schuhe mit besonderem Zehenschutz",
        answerC = "Turnschuhe fuer Hallenfussball",
        answerD = "Schienbeinschoner mit integriertem Schuh",
        correctAnswer = 0,
        explanation = "Fussballstollen sind Noppen oder Stifte an der Schuhsohle, die fuer besseren Halt auf Naturrasen oder Kunstrasen sorgen.",
        difficulty = 1,
        funFact = "Die Laenge und Anzahl der Stollen richtet sich nach dem Untergrund – bei hartem Boden kuerzer, bei weichem Boden laenger."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Mundschutz' im Boxen?",
        answerA = "Ein Atemschutz beim Training",
        answerB = "Eine Schutzausruestung fuer Zaehne und Kiefer",
        answerC = "Ein Gesichtsschutz fuer Kinder",
        answerD = "Eine Kappe gegen Gehoerschaeden",
        correctAnswer = 1,
        explanation = "Der Mundschutz (Zahnschutz/Mouthguard) ist im Boxen Pflicht – er schuetzt Zaehne, Kiefer und Lippen vor Verletzungen durch Schlaege.",
        difficulty = 1,
        funFact = "Massgeschneiderte Mundschutze werden vom Zahnarzt angefertigt und bieten den besten Schutz im Profi-Boxen."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Pfosten' beim Fussball?",
        answerA = "Ein Grenzpfahl am Spielfeldrand",
        answerB = "Die senkrechten Stangen des Tores",
        answerC = "Eine Markierung fuer den Eckball",
        answerD = "Der Staender des Spielstandsanzeigers",
        correctAnswer = 1,
        explanation = "Die Pfosten sind die senkrechten Teile des Fusballtores – zusammen mit der Querlatte bilden sie das Tor.",
        difficulty = 1,
        funFact = "Fruehe Fussballtore hatten keine Latte und keine Netze – ein Tor galt als erzielt, wenn der Ball zwischen den Pfosten flog, egal wie hoch."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist eine 'Schutzweste' beim Eishockey?",
        answerA = "Eine auffaellige Weste fuer den Schiedsrichter",
        answerB = "Ein Polstergeraet zum Schutz des Oberkörpers vor Pucktreffern",
        answerC = "Eine Weste mit Nummern fuer das Trikot",
        answerD = "Eine Schwimmweste fuer Wassertraining",
        correctAnswer = 1,
        explanation = "Die Schutzweste (Chest Protector) im Eishockey schuetzt Brust und Schultern vor harten Pucktreffern und Koerperkontakt.",
        difficulty = 1,
        funFact = "Ein Eishockey-Ausruestungsset wiegt fuer Feldspieler ca. 8-10 kg – fuer Torhueter sogar 15-20 kg."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Sprungbrett' im Schwimmen?",
        answerA = "Eine flexible Absprungplattform fuer den Start",
        answerB = "Eine Hilfsleine fuer Anfaenger",
        answerC = "Ein Geraet fuer Wasserspringen vom Turm",
        answerD = "Ein Abstandhalter zwischen den Bahnen",
        correctAnswer = 0,
        explanation = "Der Startblock (Sprungbrett) ist die erhoeht angebrachte Plattform, von der Schwimmer in Vorwaertsrennen starten.",
        difficulty = 1,
        funFact = "Beim Rueckenschwimmen starten die Athleten aus dem Wasser heraus, halten sich am Startblock fest und stossen sich ab."
    ),

    // ─── BEHINDERTENSPORT / PARALYMPICS (7) ──────────────────────────────────

    Question(
        categoryId = 6,
        questionText = "Wo finden die Paralympics statt?",
        answerA = "In einer anderen Stadt als die Olympischen Spiele",
        answerB = "Im gleichen Austragungsort und direkt nach den Olympischen Spielen",
        answerC = "Immer in London",
        answerD = "Alle acht Jahre an einem anderen Ort",
        correctAnswer = 1,
        explanation = "Die Paralympics finden am selben Ort und kurz nach den Olympischen Spielen statt – seit 1988 gilt diese Regel fuer Sommer und seit 1992 fuer Winter.",
        difficulty = 1,
        funFact = "Der Begriff 'Paralympics' kommt von 'Parallel Olympics' – die Spiele sind parallel zu den Olympischen Spielen."
    ),

    Question(
        categoryId = 6,
        questionText = "Was bedeutet 'Rollstuhlbasketball'?",
        answerA = "Basketball, das auf Knien gespielt wird",
        answerB = "Basketball fuer Spieler im Rollstuhl – mit angepassten Regeln",
        answerC = "Basketball auf Rollschuhen",
        answerD = "Eine Tischbasketball-Variante",
        correctAnswer = 1,
        explanation = "Rollstuhlbasketball ist eine paralympische Sportart, bei der Spieler in speziellen Sportrrollstühlen auf normalen Basketballfeldern spielen.",
        difficulty = 1,
        funFact = "Rollstuhlbasketball wurde nach dem Zweiten Weltkrieg von kriegsversehrten US-Veteranen entwickelt und ist heute weltweit verbreitet."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Sportart wird beim Boccia-Wettbewerb der Paralympics gespielt?",
        answerA = "Eine Wurfsportart aehnlich dem Kugelwerfen",
        answerB = "Eine Zielwurfsportart mit Lederbaellen auf ein Zielball",
        answerC = "Eine Radsportdisziplin",
        answerD = "Ein Schachspiel mit Koerperbewegung",
        correctAnswer = 1,
        explanation = "Boccia ist eine Praezisions-Wurfsportart: Spieler werfen Lederbaelle moeglichst nah an einen weissen Zielball (Jack).",
        difficulty = 1,
        funFact = "Boccia ist eine der wenigen paralympischen Sportarten, die eigens fuer den Wettkampf behinderter Menschen entwickelt wurde – kein olympisches Pendant."
    ),

    Question(
        categoryId = 6,
        questionText = "Wann wurden die ersten Paralympischen Sommerspiele der modernen Aera ausgetragen?",
        answerA = "1948 in London",
        answerB = "1960 in Rom",
        answerC = "1976 in Montreal",
        answerD = "1988 in Seoul",
        correctAnswer = 1,
        explanation = "Die ersten offiziellen Paralympischen Sommerspiele fanden 1960 in Rom statt – mit 400 Athleten aus 23 Nationen.",
        difficulty = 1,
        funFact = "Der Gruender der Paralympischen Bewegung war Dr. Ludwig Guttmann – er organisierte 1948 in Stoke Mandeville erste Wettkampfspiele fuer Rollstuhlfahrer."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist Goalball?",
        answerA = "Eine Mannschaftssportart fuer sehbehinderte Athleten mit einem Ball mit Klingel",
        answerB = "Eine Variante des Handballs fuer Rollstuhlfahrer",
        answerC = "Eine Art Fussball fuer Amputierte",
        answerD = "Ein Einzelsport fuer hoergeschaedigte Athleten",
        correctAnswer = 0,
        explanation = "Goalball ist eine paralympische Mannschaftssportart fuer blinde und sehbehinderte Athleten – der Ball enthaelt Glockenklingeln, damit die Spieler ihn hoeren koennen.",
        difficulty = 1,
        funFact = "Beim Goalball tragen alle Spieler (auch die mit Sehrest) verdunkelnde Brillen, damit alle Teilnehmer die gleichen Bedingungen haben."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist der Unterschied zwischen Prothese und Orthese im Sport?",
        answerA = "Eine Prothese ersetzt ein fehlendes Koerperteil, eine Orthese unterstuetzt ein vorhandenes",
        answerB = "Beides sind Rollstuhltypen",
        answerC = "Eine Prothese ist medizinisch, eine Orthese sportlich",
        answerD = "Es gibt keinen Unterschied",
        correctAnswer = 0,
        explanation = "Eine Prothese ersetzt ein amputiertes Glied, waehrend eine Orthese (z.B. Knieschiene) ein vorhandenes Koerperteil stabilisiert oder unterstuetzt.",
        difficulty = 1,
        funFact = "Sportprothesen (sog. 'Blade Runner'-Prothesen) aus Carbon-Federblaettern ermöglichen Sprintgeschwindigkeiten nahe denen nicht-behinderter Athleten."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Symbol verwenden die Paralympischen Spiele?",
        answerA = "Fuenf farbige Ringe",
        answerB = "Drei Halbkreise (Agitos) in Blau, Rot und Gruen",
        answerC = "Ein Rollstuhl-Symbol",
        answerD = "Ein goldenes Viereck",
        correctAnswer = 1,
        explanation = "Das Paralympische Symbol sind drei Halbkreise (Agitos) in Blau, Rot und Gruen – das lateinische 'Agito' bedeutet 'ich bewege'.",
        difficulty = 1,
        funFact = "Das Agito-Symbol wurde 2004 eingefuehrt und ersetzt das alte Symbol mit fuenf Traanen – es steht fuer Bewegung, Entschlossenheit und Mitgefuehl."
    ),

)
