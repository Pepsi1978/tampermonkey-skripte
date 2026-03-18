package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun musicQuestionsExpert4(): List<Question> = listOf(

    // ── Chormusik & Chortechnik (10) ─────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welche Stimmgattung bezeichnet man im klassischen vierstimmigen Chorsatz als 'SATB'?",
        answerA = "Sopran, Alt, Tenor, Bariton",
        answerB = "Sopran, Alt, Tenor, Bass",
        answerC = "Soprano, Altino, Tenorina, Baritono",
        answerD = "Soprano, Altus, Tenore, Bassetto",
        correctAnswer = 1,
        explanation = "SATB steht fuer Sopran, Alt, Tenor, Bass — die vier Standard-Stimmlagen des gemischten Chors. Diese Besetzung ist seit dem 16. Jahrhundert die Grundlage der westeuropaeischen Chorpolyphonie und wurde durch Komponisten wie Palestrina und Bach kanonisiert.",
        difficulty = 4,
        funFact = "J.S. Bach schrieb seine Choraele so, dass die Stimmfuehrung in jedem einzelnen Stimmensatz musikalisch sinnvoll bleibt — eine Meisterleistung, die als Lehrbeispiel fuer korrekten SATB-Satz bis heute im Musikstudium unterrichtet wird."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Vokalise' in der Chorliteratur und Gesangspedagogik?",
        answerA = "Ein Chorlied ohne Instrumentalbegleitung (a cappella)",
        answerB = "Ein Gesangsstueck oder eine Uebung, die auf einem oder mehreren Vokalen ohne Text gesungen wird",
        answerC = "Die Technik des Falsett-Singens fuer Tenore",
        answerD = "Ein Stil, bei dem Vokalisten sprechen statt singen (Sprechgesang)",
        correctAnswer = 1,
        explanation = "Eine Vokalise (von franzoesisch 'vocalise') ist ein Gesangsstueck oder eine technische Uebung, die auf einem Vokal (z.B. 'a', 'e') oder einer Folge von Vokalen gesungen wird, ohne konkreten Text. Beruehmt ist Rachmaninoffs 'Vocalise op. 34 Nr. 14' fuer Sopran und Klavier (1912).",
        difficulty = 4,
        funFact = "Sergei Rachmaninow schrieb seine Vokalise urspruenglich fuer Sopran — sie existiert heute in Hunderten von Arrangements fuer Cello, Violine, Orchester und selbst elektrische Gitarre. Es ist eines der meistgeliebten Stuecke der romantischen Vokalmusik."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man in der Chortechnik unter dem Begriff 'Intonation' als spezifische Anforderung an Choristen?",
        answerA = "Die Faehigkeit, die vorgeschriebene Lautstaerke exakt einzuhalten",
        answerB = "Die praezise Treffsicherheit der gesungenen Tonhoehen in Bezug auf die reine oder temperierte Stimmung",
        answerC = "Die rhythmische Prazision beim Einsetzen neuer Phrasen",
        answerD = "Die Technik der Atemunterstuetzung beim Singen langer Toene",
        correctAnswer = 1,
        explanation = "Intonation im Chorsatz bezeichnet die Genauigkeit, mit der Choristen die Tonhoehen treffen. Dabei muessen Saenger je nach Kontext zwischen reiner Stimmung (Quinten und Terzen klangrein) und temperierter Stimmung wechseln. Unreine Intonation fuehrt zu Schwebungen und Unreinheiten im Ensembleklang.",
        difficulty = 4,
        funFact = "Professionelle Chorleiter trainieren Intonation durch systematische Intervall- und Akkord-Uebungen ohne Instrumentalbegleitung. Das Berliner Rundfunk-Chor gilt als Massstab fuer exzellente A-cappella-Intonation in Deutschland."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Atemtechnik nutzen professionelle Choristen, um lange Phrasen ohne hoerbare Unterbrechung zu singen?",
        answerA = "Synchrones Einatmen aller Saenger gleichzeitig am Phrasenbeginn",
        answerB = "Gesteuertes Schichten-Atmen (staggered breathing), bei dem einzelne Saenger versetzt einatmen",
        answerC = "Ausschliesslicher Einsatz von Brustatmung mit verlaengertem Exspirium",
        answerD = "Das sogenannte 'kreislaeufige Einatmen' analoger Rohrblaeser-Technik",
        correctAnswer = 1,
        explanation = "Staggered breathing (versetztes Einatmen) bedeutet, dass Choristen zu individuell unterschiedlichen Zeitpunkten innerhalb einer Phrase kurz einatmen, sodass immer Stimmvolumen vorhanden bleibt. Der Gesamtklang erscheint pausenlos, obwohl jeder Einzelsaenger Atemmomente hat.",
        difficulty = 4,
        funFact = "Das Dresdner Kreuzchor, eine der aeltesten Choreinrichtungen Deutschlands (Gruendung ca. 1300), trainiert versetztes Atmen als fundamentale Technik bereits bei den juengsten Chorknaben — oft bevor andere Gesangstechniken eingefuehrt werden."
    ),

    Question(
        categoryId = 5,
        questionText = "Was beschreibt das chorale Konzept des 'Vokalklangs nach Werner Jopp' in der deutschen Chorpaedagogik?",
        answerA = "Eine Methode zur Aufteilung des Chors in homogene Stimm-Register-Gruppen",
        answerB = "Das Ideal eines vereinheitlichten, aufgehellten Chortons durch Vokalausgleich (Vokalanpassung)",
        answerC = "Die Praxis, Sopranstimmen mit Falsettklang des Tenors zu verdoppeln",
        answerD = "Eine historisch informierte Auffoehrungspraxis fuer Renaissance-Polyphonie",
        correctAnswer = 1,
        explanation = "Der angestrebte einheitliche Chorklang entsteht durch Vokalausgleich: Choristen passen die Faerbung ihrer Vokale ('a', 'e', 'i', 'o', 'u') aneinander an, sodass kein Stimmtypus heraussticht. Helle, 'aufgehellte' Vokale erzeugen einen klaren, transparenten Ensembleklang.",
        difficulty = 4,
        funFact = "Der Thomanerchor Leipzig ist bekannt fuer seinen charakteristischen 'deutschen Chorklang' — einen kernigen, etwas dunkleren Vokalton. Der Wiener Saengerknaben pflegen dagegen einen helleren, 'oesterreichischen' Klang, der auf anderem Vokalausgleich beruht."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche historische Chorform bezeichnet der Begriff 'Cori spezzati' (geteilte Choere)?",
        answerA = "Ein Chor, bei dem Maenner- und Frauenstimmen getrennt auf verschiedenen Emporenbuchstaeben singen",
        answerB = "Eine venezianische Technik mit mehreren raeumlich getrennten Chorgruppen, die antiphon miteinander dialogisieren",
        answerC = "Ein Doppelchor, bei dem jede Gruppe ausschliesslich im Kanon singt",
        answerD = "Die Praxis, den Chor bei Forte-Stellen in zwei Haelften zu teilen",
        correctAnswer = 1,
        explanation = "Cori spezzati ('geteilte Choere') ist eine Technik der venezianischen Schule des 16. Jahrhunderts, bei der zwei oder mehr Chorgruppen raeumlich getrennt (z.B. auf gegenueberliegenden Emporen des Markusdomes) miteinander dialogisierten. Meister dieser Technik waren Giovanni und Andrea Gabrieli.",
        difficulty = 4,
        funFact = "Die Akustik des Markusdomes in Venedig inspirierte die Cori-spezzati-Technik direkt: Die Nachhallzeit von ca. 4 Sekunden und die Galerienarchitektur ermoeglichten ein 'Echo-Dialog'-Erlebnis, das Zuhoerer als fast magisch empfanden."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet man in der Chorpraexis als 'Stimmbildung' im Unterschied zu 'Gesangsunterricht'?",
        answerA = "Stimmbildung konzentriert sich auf die technische Entwicklung der Singstimme (Atemtechnik, Resonanz, Registeruebergaenge), waehrend Gesangsunterricht musikalische und interpretatorische Aspekte umfasst",
        answerB = "Stimmbildung bezeichnet das Einstudieren mehrstimmiger Choraele, Gesangsunterricht hingegen das Solosingen",
        answerC = "Beide Begriffe sind synonym und werden im Deutschen unterschiedlich regional verwendet",
        answerD = "Stimmbildung ist ausschliesslich fuer Kinder, waehrend Gesangsunterricht Erwachsenen vorbehalten ist",
        correctAnswer = 0,
        explanation = "Stimmbildung (Stimmtraining) bezeichnet die technische Arbeit an Atem, Koerperkoordination, Resonanzraeumen und Registeruebergaengen. Sie ist die Grundlage, auf der Gesangsunterricht aufbaut, der dann musikalische Interpretation, Stilkunde und Repertoire hinzufuegt.",
        difficulty = 4,
        funFact = "Die Stimmbildnerin Franziska Martienssen-Lohmann (1887-1971) praegte mit ihrem Werk 'Der wissende Saenger' (1943) die deutschsprachige Stimmpaedagogik nachhaltig. Ihre funktionale Methode wird noch heute an vielen deutschen Musikhochschulen gelehrt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Besonderheit kennzeichnet den sogenannten 'Knabenchorchor' (Boys Choir) in der abendlaendischen Chorgeschichte bezueglich der Stimmphysiologie?",
        answerA = "Knabensstimmen singen natuerlich im Bass-Register und muessen fuer Sopranlagen transponiert werden",
        answerB = "Vor dem Stimmbruch besitzen Knaben eine helle Kopfstimme ohne das Gewicht der weiblichen Brust-Resonanz, was einen charakteristischen Klang ergibt",
        answerC = "Knabensstimmen sind staerker als Frauenstimmen und werden daher in lauten Orchesterpassagen bevorzugt",
        answerD = "Der Stimmbruch tritt bei Chorknaben erst nach dem 18. Lebensjahr auf und kann durch Training herausgezogert werden",
        correctAnswer = 1,
        explanation = "Knabensstimmen vor dem Stimmbruch haben einen einzigartigen Klangcharakter: Sie besitzen die helle Oberton-Faerbung der Kopfstimme ohne das volle Resonanzvolumen der Frauenstimme. Dies ergibt einen knabenspezifischen, klaren Soprantimbre, der historisch fuer Kirchenmusik bevorzugt wurde.",
        difficulty = 4,
        funFact = "Bevor Frauen Kirchenchore betreten durften (was in bestimmten Konfessionen bis ins 19. Jahrhundert verboten war), wurden alle Sopran- und Altstimmen von Knaeben oder Kastraten gesungen. Bach schrieb seine Vokalwerke fuer genau diese Besetzung."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist das Ziel des 'warm-up' (Einsingprogramms) in der professionellen Chorpraxis?",
        answerA = "Das Einpraegen des Notentexts durch wiederholtes Singen der Hauptmelodie",
        answerB = "Die schrittweise Aktivierung von Atem, Resonanz, Intonation und Ensemble-Einheitlichkeit vor der Hauptprobe",
        answerC = "Das Testen der akustischen Eigenschaften des Proberaums mit verschiedenen Lautstaeркен",
        answerD = "Die Pruefung der Stimmgesundheit jedes einzelnen Choristen durch den Chorleiter",
        correctAnswer = 1,
        explanation = "Das Einsingprogramm aktiviert systematisch alle stimmrelevanten Funktionen: Atemapparatur, Resonanzraeume (Brustraum, Kopfraum), Registeruebergaenge sowie die gemeinsame Intonation und Klangbalance. Erst nach dem Einsingen ist die Stimme fuer anspruchsvolles Repertoire belastbar.",
        difficulty = 4,
        funFact = "Der Dirigent Robert Shaw (1916-1999), Chefdirigent des Atlanta Symphony Orchestra Chorus, entwickelte ein hoch strukturiertes Einsingprogramm, das weltweit kopiert wurde. Er galt als Revolutionaer der professionellen Chorpraxis in Amerika."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Stimmtechnik ermoeglicht es Tenoren, oberhalb des normalen Stimmumfangs in die sogenannte 'Stimmkopf'-Region zu gelangen?",
        answerA = "Voix mixte (gemischte Stimme), bei der Brust- und Kopfstimme kontrolliert gemischt werden",
        answerB = "Subglottischer Druckausgleich durch aktive Bauchpressung",
        answerC = "Laterale Kehlkopfsenkung mit simultaner Zungenrueckziehung",
        answerD = "Das sogenannte 'Covered Tone'-Prinzip durch nasale Resonanz-Maximierung",
        correctAnswer = 0,
        explanation = "Voix mixte (auch 'Messa di voce' genannt) bezeichnet die Technik, bei der Tenor-Saenger den Uebergang zwischen Bruststimme und Kopfstimme durch kontrollierte Mischung beider Register glaetten. Dadurch wird ein nahtloser Klang ueber den gesamten Umfang moeglich, ohne das hoerbare 'Brechen' der Stimme.",
        difficulty = 4,
        funFact = "Luciano Pavarotti war fuer seine aussergewoehnliche Voix-mixte-Technik beruehmt: Sein hohes C (C5) klang maechtig und strahlenд, obwohl es im Register eigentlich zur Kopfstimme gehoerte. Gesangspaedagogen analysierten seine Stimmtechnik noch Jahrzehnte nach seinem Tod."
    ),

    // ── Klaviertechnik & Klavierbau (10) ─────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welchen Mechanismus bezeichnet man beim Klavier als 'Repetitionsmechanik' (oder 'double escapement action')?",
        answerA = "Eine Vorrichtung, die den Hammer nach dem Anschlag automatisch in die Ausgangsposition zurueckfuehrt, ohne dass die Taste vollstaendig losgelassen werden muss",
        answerB = "Das doppelte Saitenset fuer tiefe Bassstoene",
        answerC = "Der Mechanismus, der das Sustain-Pedal mit den Daempfern verbindet",
        answerD = "Eine Schutzvorrichtung gegen uebertriebenen Anschlagdruck",
        correctAnswer = 0,
        explanation = "Die Repetitionsmechanik (Double Escapement Action, erfunden von Sebastian Erard 1821) ermoeglicht schnelle Wiederholung desselben Tons, weil der Hammer nach dem Anschlag in eine Zwischenposition (ca. 1/3 des Weges) zurueckfaellt, statt in die volle Ruheposition. Dadurch kann die Taste erneut angeschlagen werden, bevor sie vollstaendig losgelassen wird.",
        difficulty = 4,
        funFact = "Sebastian Erards Repetitionsmechanik war so revolutionaer, dass Liszt und Chopin eigens nach Paris reisten, um die neuen Erard-Fluegel zu testen. Die Mechanik ermoeglichte Spieltechniken wie Tremolos und schnelle Tonwiederholungen, die auf aelteren Klavieren unmoeglich waren."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist der Unterschied zwischen 'Hammerfilz' und 'Hammerledер' beim historischen Pianobau?",
        answerA = "Hammerledер wurde ausschliesslich fuer Bassregister verwendet, Hammerfilz fuer Diskant",
        answerB = "Fruehe Haemmer (Fortepiano 18. Jh.) waren mit Leder bezogen; der dickere Wollfilz wurde ab ca. 1826 zum Standard fuer den volleren Ton des modernen Konzertfluegels",
        answerC = "Hammerfilz ist ein synthetisches Material des 20. Jahrhunderts, Hammerledер das historische Original",
        answerD = "Beide Materialien werden noch heute gleichberechtigt eingesetzt je nach Preiskategorie",
        correctAnswer = 1,
        explanation = "Die fruehen Fortepiani (Cristofori, Mozart-Zeit) hatten Haemmer mit Lederbezug, der einen helleren, klareren Ton erzeugte. Ab den 1820er Jahren wurde Wollfilz eingefuehrt, der einen weicheren, volleren und lauteren Ton ermoeglichte — ideal fuer die groesseren Konzertsaele des 19. Jahrhunderts.",
        difficulty = 4,
        funFact = "Beethovens Erard-Fluegel (1803) hatte noch Lederhaemmer. Als er spaeter auf einen Brodmann-Fluegel mit Filzhaemmern wechselte, soll er den volleren Klang gegenueber dem lichteren Fortepiano-Klang bevorzugt haben — obwohl er da bereits fast taub war."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Funktion hat das 'Una-corda'-Pedal am modernen Konzertfluegel?",
        answerA = "Es aktiviert einen speziellen Daempfer fuer alle Saiten gleichzeitig",
        answerB = "Es verschiebt den gesamten Hammermechanismus seitlich, sodass Haemmer nur noch zwei statt drei Saiten pro Ton anschlagen",
        answerC = "Es erhoht die Saitenspannung fuer einen helleren Klang",
        answerD = "Es bewirkt ein kuenstliches Vibrato durch mechanische Saitenoszillation",
        correctAnswer = 1,
        explanation = "Das Una-corda-Pedal (linkes Pedal) verschiebt beim Fluegel den Hammermechanismus nach rechts. Beim modernen Konzertfluegel schlagen die Haemmer dadurch nur noch 2 der 3 Saiten an ('due corde'). Der Klang wird leiser und veraendert seine Klangfarbe. Beim Pianino senkt das linke Pedal den Hammerweg.",
        difficulty = 4,
        funFact = "Beethoven notierte in seiner Klavier-Sonate op. 101 explizit 'con una corda' (mit einer Saite) fuer bestimmte Passagen — ein ungewoehnlicher Hinweis, der zeigt, wie bewusst er Klangfarbenunterschiede durch Pedalgebrauch einsetzte."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Saitenlegung unterscheidet den modernen Konzertfluegel vom frueheren 'Tischklavier' (square piano)?",
        answerA = "Der Konzertfluegel hat kreuzweise gespannte Saiten (crossed stringing), das Tischklavier hatte parallele Saitenlegung",
        answerB = "Der Konzertfluegel hat ausschliesslich Metallsaiten, das Tischklavier verwendete Darmsaiten",
        answerC = "Im Konzertfluegel verlaufen alle Saiten vertikal, im Tischklavier horizontal",
        answerD = "Beide Instrumente haben identische Saitenlegung, unterscheiden sich nur in der Gehaeseform",
        correctAnswer = 0,
        explanation = "Die Kreuzbesaitung (cross-stringing) mit uebereinander liegenden Saitenzuegen wurde von Henry Steinway Jr. um 1859 perfektioniert. Durch die Kreuzung koennen laengere Bassaiten eingebaut werden, ohne das Instrument verlaengern zu muessen, was einen volleren Bassklang ergibt. Square pianos hatten noch parallele Besaitung.",
        difficulty = 4,
        funFact = "Steinway & Sons patentierte die Kreuzbesaitung 1859 und kombinierte sie mit dem Gusseisen-Rahmen — zusammen die Grundlage des modernen Konzertfluegels. Diese Konstruktion ist seit 160 Jahren im Wesentlichen unveraendert geblieben."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet man beim Klavierbau als 'Mensur' (scale design)?",
        answerA = "Die maximale Anzahl der Haemmer, die gleichzeitig angeschlagen werden koennen",
        answerB = "Das berechnete Verhaeltnis von Saitenlaenge, Saitendurchmesser und Saitenspannung zu Tonhoehe und Klangqualitaet",
        answerC = "Die Dicke des Hammerkopffilzes in Millimetern",
        answerD = "Das Gesamtgewicht des Gusseisern-Rahmens",
        correctAnswer = 1,
        explanation = "Die Mensur (engl. scale design) ist das zentrale Berechnungsprinzip des Klavierbaus: Fuer jeden Ton werden Saitenlaenge, Durchmesser und Spannung so berechnet, dass eine ausgewogene Klangqualitaet ueber den gesamten Umfang entsteht. Die Mensur bestimmt wesentlich den Charakter und Klang eines Instruments.",
        difficulty = 4,
        funFact = "Steinway-Fluegel haben eine oeffentlich nicht preisgegebene 'geheime' Mensur, die als Firmengeheimnis gilt. Konkurrenten wie Bechstein, Boesendorfer und Fazioli entwickelten eigene Mensursysteme, die ihren Instrumenten spezifische Klangcharaktere verleihen."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches physikalische Prinzip nutzt die 'Aliquotsaite' (Aliquot stringing) im Steinway-Fluegel?",
        answerA = "Zusatzssaiten schlingen Schallwellen durch aktive Verstaerkung der Hauptsaiten",
        answerB = "Nicht angeschlagene Saiten in der Diskantregion schwingen sympathisch mit und verstaerken bestimmte Obertone der Hauptsaiten",
        answerC = "Aliquotssaiten dienen als Stimmreferenz und werden nicht zum Klang beigetragen",
        answerD = "Sie verlaengern die Saitenspannung mechanisch durch ein Federsystem",
        correctAnswer = 1,
        explanation = "Das Aliquot-System (patentiert von Steinway 1872) platziert im Diskant zusaetzliche Saiten ueber den Hauptsaiten, die nicht direkt angeschlagen werden, aber sympathisch mitschwingen. Sie verstaerken Obertone und erzeugen einen reicheren, singenderen Klang im hohen Register.",
        difficulty = 4,
        funFact = "Das Wort 'aliquot' kommt vom lateinischen 'aliquot' (mehrere, einige). In der Mathematik bezeichnet ein Aliquot-Teil einen ganzzahligen Bruchteil — die sympathisch schwingenden Saiten entsprechen Teiltoen (Obertone) der Grundfrequenz."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist das charakteristische Merkmal des 'Boesendorfer Imperial' gegenueber dem Standard-Konzertfluegel?",
        answerA = "Er hat eine um eine Oktave groessere Tastatur mit 97 Tasten, die den Umfang bis zum Kontra-C erweitert",
        answerB = "Er verwendet ausschliesslich historische Hammer-Lederbezuege statt moderner Filzhaemmer",
        answerC = "Er hat einen zweiteiligen Resonanzboden aus verschiedenen Holzarten",
        answerD = "Er besitzt vier Pedale statt der ueblichen drei",
        correctAnswer = 0,
        explanation = "Der Boesendorfer Imperial (Modell 290) hat 97 Tasten statt der ueblichen 88 und erweitert den Umfang nach unten bis zum Kontra-C (C0). Die zusaetzlichen tiefen Toene werden fuer einige Werke benoetigt und dienen auch als Resonanzkoerper fuer die regulaere Basslage.",
        difficulty = 4,
        funFact = "Die Zusatztasten des Boesendorfer Imperial sind oft schwarz eingefaerbt, um dem Pianisten anzuzeigen, dass sie ausserhalb des normalen Klavierumfangs liegen. Nur wenige Kompositionen — etwa von Busoni oder Godowsky — erfordern diese extremen Tiefstoene wirklich."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Klaviertechnik bezeichnen Pianisten als 'Arm Weight' oder 'Armgewicht' im Unterschied zur 'Finger Technique'?",
        answerA = "Das Spielen mit durchgestreckten Armen auf moeglichst flachen Tastenanschlaegen",
        answerB = "Das kontrollierte Einsetzen des natuerlichen Gewichts von Arm und Schulter als Klangquelle statt isolierter Fingerkraft",
        answerC = "Das Ablegen der Arme auf der Tastatur in Ruhepausen zur Entspannung der Muskulatur",
        answerD = "Eine Technik fuer Staccato-Spiel durch vertikale Aufwaeртsbewegung der Arme",
        correctAnswer = 1,
        explanation = "Armgewicht-Technik (entwickelt u.a. durch Rudolf Maria Breithaupt und Tobias Matthay) nutzt das natuerliche Gewicht des entspannten Arms als Klangerzeuger. Statt die Finger aktiv zu pressen, 'faellt' der Arm kontrolliert in die Tastatur. Diese Technik ermoeglicht groessere Klangfuelle mit weniger Kraftaufwand.",
        difficulty = 4,
        funFact = "Die Armgewicht-Methode loeste Ende des 19. Jahrhunderts eine Revolution in der Klavierpaedagogik aus. Bis dahin dominierten reine Fingertechniken (Czerny, Hanon). Arthur Schnabel und spаeter Vladimir Horowitz kombinierten beide Ansaetze zu ihrer unverwechselbaren Technik."
    ),

    Question(
        categoryId = 5,
        questionText = "Was beschreibt der pianistische Fachbegriff 'Voicing' beim Klavierstimmen?",
        answerA = "Das Einstellen der richtigen Tonhoehe durch Veraendern der Saitenspannung",
        answerB = "Die Bearbeitung der Hammerkopffilze mit Nadeln oder Lacken zur Veraenderung der Klanghaerte und Klangfarbe",
        answerC = "Das Anpassen des Sustain-Pedalmechanismus an Spielervorlieben",
        answerD = "Das Ausrichten der Hammerkopfflaeche parallel zur Saite",
        correctAnswer = 1,
        explanation = "Voicing bezeichnet die Bearbeitung des Hammerkopffilzes durch einen Klaviertechniker: Durch Einstechen mit feinen Nadeln wird der Filz gelockert und der Ton weicher; durch Haerten mit Lackloesungen wird der Filz dichter und der Ton brillanter. So kann der Gesamtklang eines Instruments individuell angepasst werden.",
        difficulty = 4,
        funFact = "Top-Pianisten wie Martha Argerich oder Krystian Zimerman haben sehr spezifische Vorstellungen vom Voicing 'ihres' Instruments. Zimerman ist bekannt dafuer, seinen eigenen Steinway-Fluegel auf Weltreisen mitzunehmen — und ihn selbst zu pflegen und nachzustimmen."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Prinzip unterscheidet das 'Tangenten-Klavier' (Tangentenfluegel) von der modernen Klaviermechanik?",
        answerA = "Beim Tangentenfluegel bleiben die Tangenten (Metallstreifen) im Kontakt mit der Saite, waehrend beim modernen Klavier der Hammer sofort zurueckspringt",
        answerB = "Das Tangenten-Klavier hat keine Daempfer und klingt daher immer nach",
        answerC = "Tangentenfluegel verwenden Bogenmechanik wie ein Cembalo statt Haemmer",
        answerD = "Beim Tangentenfluegel wird die Tastentiefe durch ein Pneumatiksystem begrenzt",
        correctAnswer = 0,
        explanation = "Im Tangentenfluegel (ca. 1751-1800) trifft ein Metall- oder Holzstreifen (Tangente) die Saite und bleibt bei gedrueckter Taste in Kontakt — aehnlich dem Clavichord-Prinzip. Beim modernen Klavier springt der Hammer nach dem Anschlag sofort zurueck (Escapement). Dies erklaert den anderen Klangeindruck des Tangentenfluegels.",
        difficulty = 4,
        funFact = "Der Tangentenfluegel wurde um 1751 vom Regensburger Orgelbauer Franz Jakob Spath entwickelt. Mozart spielte auf Tangentenfluegeln und kannte deren charakteristischen Klang gut — einige Wissenschaftler vermuten, dass bestimmte dynamische Nuancen in Mozarts Klavierwerken auf Tangentenfluegel zugeschnitten waren."
    ),

    // ── Studio-Recording-Geschichte (10) ─────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welches Jahr gilt als Geburtsjahr der kommerziellen Tonaufnahme, als Thomas Edison das erste Phonograph-Prototyp praeparierte?",
        answerA = "1877",
        answerB = "1887",
        answerC = "1901",
        answerD = "1865",
        correctAnswer = 0,
        explanation = "Thomas Edison meldete 1877 das Patent fuer den Phonographen an. Das erste aufgenommene Wort war 'Mary had a little lamb'. Das Geraet nutzte eine Zinnfolie-Walze zur Aufnahme und Wiedergabe von Schallwellen — der Beginn der mechanischen Tonaufzeichnung.",
        difficulty = 4,
        funFact = "Edisons Phonograph war urspruenglich nicht als Musikgeraet gedacht. Er stellte sich vor, dass er fuer Diktate im Buero genutzt werden wuerde. Die massenhafte Nutzung fuer Musik entwickelte sich erst spaeter — und uebertraf alle kommerziellen Erwartungen."
    ),

    Question(
        categoryId = 5,
        questionText = "Was revolutionierte die Tonaufnahme-Technik durch die Einfuehrung des Magnetbands (magnetic tape) in den fruehen 1940er Jahren gegenueber der vorherigen Schallplattenaufnahme?",
        answerA = "Magnetband war billiger als Schallplatten, ermoelichte aber keine Nachbearbeitung",
        answerB = "Erstmals konnten Aufnahmen schnittweise bearbeitet, geloescht und wiederverwendet werden — non-destruktiv und mit besserer Klangqualitaet",
        answerC = "Magnetband ermoeglichte erstmals Stereoaufnahmen, die auf Schallplatten nicht moeglich waren",
        answerD = "Die Aufnahmedauer wurde von 3 auf 30 Minuten pro Seite erweitert",
        correctAnswer = 1,
        explanation = "Magnetband (entwickelt in Deutschland bei AEG/BASF in den 1930-40er Jahren) ermoeglichte erstmals das nichtdestruktive Bearbeiten von Aufnahmen: Schneiden, Kleben, Wiederverwenden. Dies gab Produzenten und Kuenstlern kreative Kontrolle, die bei direkter Schallplattenaufnahme unmoeglich war.",
        difficulty = 4,
        funFact = "Die US-Armee brachte nach dem Zweiten Weltkrieg erbeutete deutsche Magnetbandgeraete (Magnetophon-Geraete) in die USA. Bing Crosby war einer der ersten amerikanischen Kuenstler, die Radiosendungen auf Band vorproduzierten — was ihm erlaubte, Proben und Touren zu optimieren."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Studio gilt als historisches Zentrum des Soul- und R&B-Sounds der 1960er Jahre und liegt in Memphis, Tennessee?",
        answerA = "Electric Lady Studios (New York)",
        answerB = "Stax Records Studio (Memphis, Tennessee)",
        answerC = "Sun Studio (Memphis, Tennessee)",
        answerD = "Chess Records Studio (Chicago)",
        correctAnswer = 1,
        explanation = "Das Stax Records Studio in Memphis war ab 1960 das Herzstuf des Southern Soul. Kuenstler wie Otis Redding, Isaac Hayes, Sam & Dave und die Staple Singers nahmen dort auf. Der 'Stax Sound' war rau, energetisch und basierte auf dem spontanen Zusammenspiel der Hausband Booker T. & the M.G.'s.",
        difficulty = 4,
        funFact = "Das Stax Studio hatte keine professionelle Raumakustik — die Musiker spielten direkt in einem umgebauten Kino. Die Schraege des ehemaligen Zuschauerraums und die einfache Ausstattung trugen paradoxerweise zum unverwechselbaren warmen Stax-Klang bei."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnete man als 'Wall of Sound' in der Produktionstechnik der 1960er Jahre und wer entwickelte diese Technik?",
        answerA = "Ein Mehrkanal-Verfahren von Les Paul und Mary Ford mit mehrfach ueberlagerten Gitarrenspuren",
        answerB = "Eine Schichttechnik von Phil Spector, bei der dieselben Instrumente vielfach doppelt besetzt und gemeinsam aufgenommen wurden",
        answerC = "Das Stereo-Aufnahmeverfahren von Alan Blumlein aus den 1950er Jahren",
        answerD = "Ein Halleffekt-Verfahren von Abbey Road Studios fuer Beatles-Aufnahmen",
        correctAnswer = 1,
        explanation = "Phil Spector entwickelte den 'Wall of Sound' (Klangmauer) in den fruehen 1960er Jahren: Viele Musiker spielten dieselbe Stimme gleichzeitig (z.B. 3 Pianisten, 5 Gitarristen), aufgenommen in einem halligem Raum. Das Ergebnis war ein massiver, dicht texturierter Klangteppich.",
        difficulty = 4,
        funFact = "Der 'Wall of Sound' wurde fuer Hits wie 'Be My Baby' der Ronettes (1963) und 'You've Lost That Lovin' Feelin'' von Righteous Brothers (1964) eingesetzt. John Lennon bezeichnete den Ronettes-Song spaeter als den perfektesten Pop-Song aller Zeiten."
    ),

    Question(
        categoryId = 5,
        questionText = "Wann wurde Mehrspuraufnahme mit 4 Spuren (4-track recording) bei Beatles-Aufnahmen erstmals kommerziell eingesetzt und welches Studio nutzte sie?",
        answerA = "1956 im Sun Studio Memphis mit Elvis Presley",
        answerB = "1963 in den Abbey Road Studios London, erstmals auf dem Album 'With the Beatles'",
        answerC = "1967 im CBS Studio New York fuer Bob Dylan",
        answerD = "1960 im Motown Studio Detroit fuer die ersten Motown-Aufnahmen",
        correctAnswer = 1,
        explanation = "Die Beatles nutzten ab 1963 in den Abbey Road Studios 4-Spur-Magnetbandmaschinen, was erstmals erlaubte, Gesang, Rhythmus und Melodie getrennt aufzunehmen und zu mischen. Sgt. Pepper's (1967) wurde spaeter mit 4-Spur-zu-4-Spur-Uebertragungen (Ping-Ponging) auf effektiv 8 Spuren realisiert.",
        difficulty = 4,
        funFact = "Wenn die Beatles mehr Spuren brauchten als vorhanden, 'bounced' sie mehrere Spuren auf eine einzige ('Ping-Pong Recording'). Sgt. Pepper's Lonely Hearts Club Band wurde so auf einer Kombination aus 4-Spur-Maschinen realisiert — technisch ein Wunder der Kreativitaet unter Restriktionen."
    ),

    Question(
        categoryId = 5,
        questionText = "Was war das erste kommerziell erfolgreiche Stereofonie-Format fuer den Heimgebrauch und in welchem Jahr wurde es eingefuehrt?",
        answerA = "Dolby Stereo, eingefuehrt 1975 fuer Filmton",
        answerB = "Stereo-LP (Long Playing Record), eingefuehrt von Decca und EMI ab 1958",
        answerC = "Stereo-Rundfunk (FM-Stereo), eingefuehrt in den USA 1961",
        answerD = "Stereo-Magnetbandkassette, eingefuehrt von Philips 1963",
        correctAnswer = 1,
        explanation = "Die erste kommerzielle Stereo-LP wurde 1958 gleichzeitig von mehreren Labels eingefuehrt. Der Rillenaufschnitt mit zwei Kanaelen (45-45-System) war zuvor durch Alan Blumlein patentiert worden. Die Stereo-LP revolutionierte das Heimhoeren und wurde zum Standard-Tontraeger bis in die 1980er Jahre.",
        difficulty = 4,
        funFact = "Alan Blumlein patentierte 1931 das Stereotonverfahren fuer Schallplatten, das fast identisch mit dem 1958 eingefuehrten 45-45-System ist. Er starb 1942 beim Absturz eines Testflugzeugs, ohne den kommerziellen Erfolg seiner Erfindung erlebt zu haben."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche revolutionaere Studiotechnik entwickelte Les Paul in den 1940er-50er Jahren, die die moderne Popmusikproduktion grundlegend veraenderte?",
        answerA = "Die Einfuehrung des digitalen Samplings fuer Rhythmus-Tracks",
        answerB = "Overdubbing (Sound-on-Sound) — das Aufnehmen neuer Spuren ueber bestehende Aufnahmen",
        answerC = "Die Erfindung des Hallgeraets (Spring Reverb) fuer Studioaufnahmen",
        answerD = "Das erste automatische Tempo-Synchronisierungsverfahren (click track)",
        correctAnswer = 1,
        explanation = "Les Paul entwickelte in den 1940er Jahren Sound-on-Sound (uebereinander-Aufnehmen) durch Modifikation eines Ampex-Bandgeraets. Er konnte damit Gitarrenspuren, Gesangsharmonien und andere Elemente schichtweise aufbauen — die Grundlage des modernen Multi-Track-Recordings.",
        difficulty = 4,
        funFact = "Les Pauls erste 'Overdub'-Experimente machte er auf einer modifizierten Gartenlaube in Mahwah, New Jersey, die er 'The Log' nannte. Seine Frau Mary Ford sang alle Harmonien selbst ein — bis zu 12 Gesangsspuren uebereinander — was fuer Hoerer der 1950er als Magie erschien."
    ),

    Question(
        categoryId = 5,
        questionText = "Was war die historische Bedeutung des Albums 'Sgt. Pepper's Lonely Hearts Club Band' (1967) fuer die Studiotechnik?",
        answerA = "Es war die erste Verwendung von Synthesizern (Moog) in einer Rock-Aufnahme",
        answerB = "Es demonstrierte erstmals, dass ein Studioalbum ein kuenstlerisches Gesamtwerk sein kann, das live nicht reproduzierbar ist — und nutzte das Studio als Instrument",
        answerC = "Es war die erste Schallplatte in Stereo, die mehr Kanaele nutzte als ein Konzertfluegel-Piano",
        answerD = "Es begruendete das Konzept des Konzeptalbums als erste durchgehende Erzaehlung in der Popgeschichte",
        correctAnswer = 1,
        explanation = "Sgt. Pepper's (1967) definierte das Studio als kreativen Raum, nicht nur als Aufnahmegeraet. Die Beatles und Produzent George Martin experimentierten mit rueckwaerts abgespielten Baendern, Orchesterglissandos, indischen Ragas und Klangcollagen. Das Album bewies, dass Studiomusik ein eigenes Medium sein kann.",
        difficulty = 4,
        funFact = "Das aufwendigste Stueck auf Sgt. Pepper's war 'A Day in the Life': Das Orchesterglissando am Ende wurde durch 40 Musiker gespielt, denen George Martin nur Anfangs- und Endnote vorgab — der Rest war Improvisation. Das Ergebnis kostete mehr als alle Beatles-Aufnahmen der ersten zwei Jahre zusammen."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Studio nahm in den 1970ern ABBA auf und gilt als Geburtsstunde des 'Polar Sound'?",
        answerA = "Metronome Studio, Hamburg",
        answerB = "Polar Music Studio, Stockholm",
        answerC = "ABBA-Studio Malmoe",
        answerD = "Musikhuset Studio, Kopenhagen",
        correctAnswer = 1,
        explanation = "Das Polar Music Studio in Stockholm, gegruendet von ABBA-Mitglied Benny Andersson und Produzent Bjorn Ulvaeus, war Aufnahmeort aller grossen ABBA-Hits. Produzent Michael Tretow entwickelte dort einen charakteristischen 'ABBA-Sound' durch spezifische Mikrofon- und Mischpulttechniken.",
        difficulty = 4,
        funFact = "Led Zeppelin, Genesis, Robbie Williams und viele andere internationale Kuenstler nahmen ebenfalls im Polar Music Studio in Stockholm auf. Das Studio gilt als eines der klanglich besten Europas — eine Kombination aus exzellenter Akustik und modernster Technik der 1970er-80er Jahre."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnete man als 'Loudness War' (Lautheitskrieg) in der Musikproduktion der 1990er-2000er Jahre?",
        answerA = "Einen Rechtstreit zwischen Plattenfirmen ueber urheberrechtlich geschuetzte Bass-Frequenzen",
        answerB = "Den Wettbewerb zwischen Produzenten, Alben immer lauter zu mastern, bis die Dynamik der Musik zerstoert war",
        answerC = "Eine Debatte zwischen analogen und digitalen Produktionstechniken ueber Klangqualitaet",
        answerD = "Die Konkurrenz zwischen britischen und amerikanischen Studios um die lauteste Live-Beschallungsanlage",
        correctAnswer = 1,
        explanation = "Im Loudness War versuchten Plattenfirmen und Produzenten, ihre Releases durch maximales Mastering-Limiting 'lauter' als die Konkurrenz klingen zu lassen — in der Annahme, lautere Musik klinge besser. Dies fuehrte zu erhoehter Verzerrung, reduzierter Dynamik und klanglich erschoepfenden Aufnahmen.",
        difficulty = 4,
        funFact = "Metallicas Album 'Death Magnetic' (2008) gilt als krassestes Beispiel des Loudness Wars — so stark komprimiert, dass Fans die Guitar-Hero-Spielversion (die weniger bearbeitet war) der offiziellen CD-Version vorzogen. Die Band selbst aesserte sich unzufrieden mit dem Mastering."
    ),

    // ── Musikverlagswesen & GEMA (10) ─────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Wofuer steht die Abkuerzung GEMA und was ist ihre rechtliche Grundfunktion in Deutschland?",
        answerA = "Gesellschaft fuer Exportmarketing und Artistenverwaltung — eine Handelsorganisation fuer Musikprodukte",
        answerB = "Gesellschaft fuer musikalische Auffuehrungs- und mechanische Vervielfaeltigungsrechte — eine Verwertungsgesellschaft, die Urheberrechte von Komponisten und Textdichtern wahrnimmt",
        answerC = "Gesamtverband der Europaeischen Musikassoziation — ein EU-weites Regulierungsgremium fuer Musikrecht",
        answerD = "Gemeinsame Einrichtung Musikalischer Aufnahmequalitaet — eine Qualitaetssicherungsorganisation fuer Studioaufnahmen",
        correctAnswer = 1,
        explanation = "Die GEMA (Gesellschaft fuer musikalische Auffuehrungs- und mechanische Vervielfaeltigungsrechte) ist eine deutsche Verwertungsgesellschaft, die die Urheberrechte von Komponisten, Textdichtern und Musikverlegern wahrnimmt. Sie erhebt Gebuehren fuer Musiknutzung und schuettet diese als Tantiemen an die Rechteinhaber aus.",
        difficulty = 4,
        funFact = "Die GEMA wurde 1903 als 'Genossenschaft Deutscher Tonsetzer' gegruendet und ist damit eine der aeltesten Verwertungsgesellschaften der Welt. Sie verwaltet heute das Repertoire von ueber 90.000 Mitgliedern und hat Gegenseitigkeitsvertraege mit mehr als 100 auslaendischen Schwestergesellschaften."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man im Musikverlagswesen unter dem Begriff 'Druckrecht' (print right)?",
        answerA = "Das Recht eines Verlags, Noten und Liederbuecher zu veroeffentlichen und zu vertreiben",
        answerB = "Das Recht des Kuenstlers, die Gestaltung seines CD-Covers selbst zu bestimmen",
        answerC = "Die Genehmigung zur Aufnahme eines Musikstuecks im Tonstudio",
        answerD = "Das Verlagsrecht zur Nennung des Kuenstlernamens auf Platten",
        correctAnswer = 0,
        explanation = "Das Druckrecht (Print Right) bezeichnet das urheberrechtliche Nutzungsrecht zur Veroeffentlichung von Notenmaterial — also Partituren, Klavierauszuege, Liederbuecher und Einzelausgaben. Musikverlage erwerben dieses Recht vom Komponisten und verdienen durch Notenverkauf.",
        difficulty = 4,
        funFact = "Der aelteste noch aktive Musikverlag ist Breitkopf & Haertel, gegruendet 1719 in Leipzig. Er veroeffentlichte erstmals Werke von Mozart, Beethoven und Bach in systematischen Gesamtausgaben — bis heute der Massstab fuer wissenschaftliche Musikeditionen."
    ),

    Question(
        categoryId = 5,
        questionText = "Was unterscheidet ein 'Synchronisationsrecht' von einem 'mechanischen Recht' im Musikrecht?",
        answerA = "Das Synchronisationsrecht gilt fuer Film und Video (Bild-Ton-Verbindung), das mechanische Recht fuer die Vervielfaeltigung auf physischen Tontraegern (CD, Vinyl etc.)",
        answerB = "Das Synchronisationsrecht ist auf Europa beschraenkt, das mechanische Recht gilt weltweit",
        answerC = "Das Synchronisationsrecht betrifft nur Instrumentalmusik, das mechanische Recht gilt fuer Musik mit Text",
        answerD = "Beide Begriffe sind synonym und werden regional unterschiedlich verwendet",
        correctAnswer = 0,
        explanation = "Das Synchronisationsrecht (Sync Right) regelt die Verwendung von Musik in Kombination mit Bild — also in Filmen, Serien, Werbespots und Videospielen. Das mechanische Recht (Mechanical Right) betrifft die Vervielfaeltigung einer Komposition auf Tontraegern. Beide Rechte muessen separat lizenziert werden.",
        difficulty = 4,
        funFact = "Sync-Lizenzen koennen fuer erfolgreiche Werbespots oder Blockbuster-Filme hunderttausende Euro bringen. Ein bekannter Fall: Queen lizenzierte 'We Will Rock You' fuer Nike-Werbungen — das brachte der Band mehr ein als Jahrzehnte normaler Plattenverkaufe."
    ),

    Question(
        categoryId = 5,
        questionText = "Wie lange ist das Urheberrecht an einer Komposition in Deutschland nach dem Tod des Urhebers geschuetzt?",
        answerA = "50 Jahre post mortem autoris (p.m.a.)",
        answerB = "70 Jahre post mortem autoris (p.m.a.)",
        answerC = "95 Jahre post mortem autoris (p.m.a.)",
        answerD = "100 Jahre post mortem autoris (p.m.a.)",
        correctAnswer = 1,
        explanation = "In Deutschland und der gesamten EU erlischt das Urheberrecht an Werken 70 Jahre nach dem Tod des Urhebers (§ 64 UrhG). Danach wird das Werk gemeinfrei. Bei mehreren Urhebern beginnt die Frist mit dem Tod des letztlebenden Beteiligten.",
        difficulty = 4,
        funFact = "Beethovens Werke sind seit 1897 gemeinfrei (er starb 1827), Brahms' Werke seit 1967 und Gustav Mahlers Kompositionen seit 1981. Die Beatles-Noten werden erst 2064-2070 gemeinfrei — 70 Jahre nach dem Tod von John Lennon (1980) und Paul McCartney."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet man im Verlagswesen als 'Co-Publishing Deal'?",
        answerA = "Zwei Verlage veroeffentlichen gleichzeitig dieselbe Notenausgabe in verschiedenen Laendern",
        answerB = "Ein Kuenstler behaelt einen Teil (typisch 50%) der Verlagsrechte und gruendet einen eigenen Verlag, waehrend ein Hauptverlag die andere Haelfte verwaltet",
        answerC = "Mehrere Komponisten teilen sich gemeinsam die Rechte an einer Komposition",
        answerD = "Ein Verlag darf ein Werk in Co-Produktion mit einem Filmstudio veroeffentlichen",
        correctAnswer = 1,
        explanation = "Im Co-Publishing (auch Co-Pub) behaelt der Komponist oder Texter typischerweise 50% der Verlagsrechte durch einen eigenen Eigenverlag, waehrend ein etablierter Verlag die anderen 50% haelt und die Administration (GEMA-Anmeldung, Lizenzierung, internationale Verwertung) uebernimmt.",
        difficulty = 4,
        funFact = "Co-Publishing-Deals wurden in den 1970er Jahren zunehmend zur Norm, als Kuenstler wie Paul McCartney erkannten, dass Verlagsrechte lukrativer sein koennen als Kuenstler-Tantiemen. McCartney gruendete MPL Communications und sicherte sich damit dauerhaften Anteil an seinen eigenen Kompositionen."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'Musikverleger' im rechtlichen Sinne, und welche Leistung erbringt er gegenueber dem Komponisten?",
        answerA = "Ein Musikverleger ist ein Konzertveranstalter, der Kuenstler buchет und bezahlt",
        answerB = "Ein Musikverleger erwirbt Nutzungsrechte vom Komponisten, sorgt fuer Promotion, Lizenzvergabe und Vertrieb des Werks und teilt die daraus entstehenden Einnahmen mit dem Urheber",
        answerC = "Ein Musikverleger ist der rechtliche Eigentuemerder Aufnahme (Master Rights)",
        answerD = "Ein Musikverleger ist ein GEMA-Beauftragter, der die technische Registrierung von Musikwerken uebernimmt",
        correctAnswer = 1,
        explanation = "Ein Musikverleger erwirbt vom Komponisten ein oder mehrere Nutzungsrechte (Print, Mechanical, Sync etc.) und setzt diese aktiv ein: Registrierung bei der GEMA/PROs, Suche nach Lizenznehmern (Filme, TV, Ads), Promotion bei Interpreten, internationale Vergabe an Sub-Publisher. Im Gegenzug erhaelt der Verleger einen Anteil der Einnahmen (typisch 50%).",
        difficulty = 4,
        funFact = "Michael Jackson kaufte 1985 den ATV Music Publishing Katalog, der u.a. die Verlagsrechte an ueber 200 Beatles-Songs enthielt, fuer 47,5 Millionen Dollar. Paul McCartney, dem diese Rechte eigentlich gehoeren sollten, verlor den Bieterstreit. Sony erwarb 1995 einen 50%-Anteil und der kombinierte Sony/ATV-Katalog wurde 2016 fuer 750 Millionen Dollar verkauft."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Blanket License' (Pauschallizenzen) im GEMA-System?",
        answerA = "Eine Einzellizenz fuer die einmalige Aufnahme eines bestimmten Musikstuecks",
        answerB = "Eine Pauschallizenz, die einem Nutzer (z.B. Radio, Club) die Nutzung des gesamten GEMA-Repertoires gegen eine Pauschalgebuehr erlaubt",
        answerC = "Eine kostenlose Lizenz fuer gemeinnuetzige Veranstaltungen und Schulen",
        answerD = "Eine Sonderlizenz fuer Strassenmusiker und oeffentliche Auftritte ohne Tontraeger",
        correctAnswer = 1,
        explanation = "Die Blanket License (Pauschallizenz) ist ein zentrales GEMA-Lizenzierungsmodell: Anstatt fuer jedes gespielte Stueck einzeln zu bezahlen, erhaelt ein Nutzer (Radiosender, Diskothek, Streamingdienst) gegen eine Pauschalgebuehr das Recht, das gesamte GEMA-verwaltete Repertoire zu nutzen. Die GEMA verteilt die Einnahmen dann intern nach Nutzungsdaten.",
        difficulty = 4,
        funFact = "Spotify und andere Streamingdienste haben mit der GEMA jahrelange Lizenzstreitigkeiten ausgefochten, bevor 2016 ein Vergleich erzielt wurde. Spotify war in Deutschland von 2012-2016 nicht verfuegbar — unter anderem wegen ungeloester GEMA-Lizenzfragen fuer das Blanket-Lizenzmodell."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man im Musikrecht unter 'Work for Hire' (Auftragswerk)?",
        answerA = "Ein Kuenstler wird fuer Live-Auftritte auf Stundenbasis bezahlt, ohne Anspruch auf Tontraeger-Tantiemen",
        answerB = "Ein Werk, das im Auftrag erstellt wird und bei dem das Urheberrecht vollstaendig beim Auftraggeber liegt, nicht beim Schoepfer",
        answerC = "Eine Komposition, die fuer Werbezwecke lizenziert und entsprechend gekennzeichnet wird",
        answerD = "Ein Verlagsvertrag, bei dem der Komponist fuer jeden verkauften Notensatz eine Provision erhaelt",
        correctAnswer = 1,
        explanation = "Bei Work for Hire (besonders im US-Recht nach Copyright Act 1976) geht das Urheberrecht an einem Werk vollstaendig auf den Auftraggeber ueber. Der Schoepfer erhaelt eine einmalige Verguetung, hat aber keine weiteren Rechte. Im deutschen Recht ist dies eingeschraenkt: Das Urheberrecht (UrhG) kann nicht abgetreten werden, nur Nutzungsrechte.",
        difficulty = 4,
        funFact = "Viele fruehe Hollywoodkomponisten arbeiteten unter Work-for-Hire-Vertraegen und erhielten keine Tantiemen fuer spaetere TV-Ausspielungen oder DVD-Veroeffentlichungen ihrer Filmmusik. Diese Praxis fuehrte zu langjaehrigen Rechtskonflikten und Reformen im US-Urheberrecht."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist eine 'Performing Rights Organization' (PRO) und welche deutschen und amerikanischen Beispiele gibt es?",
        answerA = "Eine Konzertagentur, die Rechte fuer Live-Auftritte von Kuenstlern vermittelt",
        answerB = "Eine Verwertungsgesellschaft, die Tantiemen fuer oeffentliche Auffuehrungen und Rundfunknutzung sammelt und ausschuettet; Deutschland: GEMA, USA: ASCAP, BMI, SESAC",
        answerC = "Ein internationaler Verband von Musikverlegern fuer Cross-Border-Lizenzierung",
        answerD = "Eine Regierungsbehoerde zur Registrierung neuer Musiktitel und zur Kontrolle von Urheberverletzungen",
        correctAnswer = 1,
        explanation = "Performing Rights Organizations (PROs) sammeln Lizenzgebuehren fuer oeffentliche Auffuehrungen und Rundfunknutzung ein und schuetten sie an Mitglieder (Komponisten, Texter, Verleger) aus. In Deutschland ist dies die GEMA, in den USA gibt es drei grosse PROs: ASCAP (1914), BMI (1939) und SESAC (1930).",
        difficulty = 4,
        funFact = "Die ASCAP (American Society of Composers, Authors and Publishers) wurde 1914 u.a. von Victor Herbert gegruendet, nachdem er bemerkte, dass ein Restaurant seine Musik spielte ohne dafuer zu zahlen. Der Rechtsstreit, den er gewann (Herbert v. Shanley Co., 1917), legte den Grundstein fuer das moderne Lizenzsystem."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet das Konzept des 'Music Publishing Administration' im Unterschied zum klassischen Verlagsvertrag?",
        answerA = "Eine staatliche Verwaltungsaufgabe der GEMA ohne Beteiligung privater Unternehmen",
        answerB = "Ein Vertrag, bei dem ein Verlag nur administrative Aufgaben (GEMA-Registrierung, Inkasso) uebernimmt, aber keine kreativen Rechte erwirbt — der Urheber behaelt 100% der Verlagsrechte",
        answerC = "Eine erweiterte Co-Publishing-Form, bei der drei oder mehr Verlage kooperieren",
        answerD = "Die Aufnahme in ein digitales Datenbankregister fuer Musikwerke",
        correctAnswer = 1,
        explanation = "Bei einem Administration Deal behаelt der Komponist alle Verlagsrechte (100%) und zahlt dem Administrator eine Servicegebuehr (typisch 10-25% der eingezogenen Einnahmen). Der Administrator kuemmert sich um GEMA-Anmeldung, Sub-Publishing, Lizenzabwicklung und Inkasso — ohne eigene kreative Rechte zu besitzen.",
        difficulty = 4,
        funFact = "Viele erfolgreiche Songwriter wie Max Martin oder Diane Warren arbeiten heute ausschliesslich mit Administration Deals, weil sie ihre Verlagsrechte vollstaendig behalten wollen. Dies war vor den 1980er Jahren noch unueblich — Co-Publishing und volle Verlagsabtretung waren der Standard."
    ),

    // ── Ethnomusikologische Feldforschung (10) ───────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet man in der Ethnomusikologie als 'Transkription' im Unterschied zur allgemeinen Musiknotation?",
        answerA = "Die Uebertragung eines Musikstuecks von einer Tonart in eine andere fuer ein anderes Instrument",
        answerB = "Die schriftliche Aufzeichnung muendlich tradierter oder aufgenommener Musik in Notenschrift — oft mit speziellen Zeichen fuer Mikrointervallik, Ornamente und Rhythmik aussereuropaeischer Musikkulturen",
        answerC = "Die digitale Umwandlung analoger Tonaufnahmen in Noten mittels Software",
        answerD = "Das Niederschreiben von Liedtexten aus muendlicher Ueberlieferung fuer linguistische Forschung",
        correctAnswer = 1,
        explanation = "Ethnomusikologische Transkription ist die Uebertragung klingender Musik (oft Feldaufnahmen) in Notenschrift. Da viele Musikkulturen Mikrointervalle, komplexe Rhythmen oder Klangtexturen verwenden, die in der westlichen Notenschrift nicht darstellbar sind, werden Sondersymbole (z.B. Pfeil fuer Vierteltoene) oder erweiterte Notationssysteme eingesetzt.",
        difficulty = 4,
        funFact = "Bela Bartok transkribierte zwischen 1905-1934 ueber 10.000 ungarische, rum&auml;nische, bulgarische und tuerкische Volkslieder — mit Hilfe eines fruehen Edison-Phonographen. Seine Transkriptionen mit genauen Angaben zu Ornamentik und Stimmung sind bis heute unuebertroffen in ihrer Praezision."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Wissenschaftler gilt als Begruender der modernen Ethnomusikologie als akademische Disziplin?",
        answerA = "Curt Sachs",
        answerB = "Erich Moritz von Hornbostel",
        answerC = "Mantle Hood",
        answerD = "Alan Lomax",
        correctAnswer = 2,
        explanation = "Mantle Hood (1918-2005) gilt als Hauptbegruender der modernen Ethnomusikologie als eigenstaendige akademische Disziplin in den USA. Er gruendete das Institute of Ethnomusicology an der UCLA (1960) und entwickelte das Konzept der 'Bi-Musikalitaet' — die Idee, dass Forscher die erforschte Musik selbst spielen lernen muessen.",
        difficulty = 4,
        funFact = "Mantle Hoods 'Bi-Musikalitaet'-Konzept war revolutionaer: Statt Musik nur zu analysieren, sollten Forscher in ihr leben. Er brachte gamelan-Ensembles nach UCLA und liess Studenten javanische Musik spielen — ein Paradigmenwechsel von der armchair ethnomusicology zur Feldforschungspraxis."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet das 'Hornbostel-Sachs-System' und wofuer wird es in der Ethnomusikologie verwendet?",
        answerA = "Ein Notationssystem fuer aussereuropaeische Musikskalen und Mikrointervallik",
        answerB = "Eine Klassifizierung musikalischer Instrumente nach dem Schwingungsprinzip des klangerzeugenden Materials (Chordophone, Aerophone, Membranophone, Idiophone, Elektrophone)",
        answerC = "Ein Methoden-Leitfaden fuer ethnographische Feldforschung mit Audio-Aufzeichnungsgeraeten",
        answerD = "Eine Datenbank fuer historische Volkslieder aus dem deutschsprachigen Raum",
        correctAnswer = 1,
        explanation = "Das Hornbostel-Sachs-System (1914, von Erich Moritz von Hornbostel und Curt Sachs) klassifiziert alle Musikinstrumente der Welt nach ihrem klangerzeugenden Prinzip: Chordophone (Saiteninstrumente), Aerophone (Luftinstrumente), Membranophone (Fell-Instrumente), Idiophone (Selbstklinger) und spaeter Elektrophone. Es ist bis heute der internationale Standard.",
        difficulty = 4,
        funFact = "Das Hornbostel-Sachs-System wurde 1914 entwickelt, als Instrumente aus Kolonien nach Europa stroемten und Museen ein einheitliches Klassifikationssystem brauchten. Die Kategorie 'Elektrophone' wurde 1940 nachtraeglich hinzugefuegt, um Synthesizer und elektrische Instrumente einzuschliessen."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man in der ethnografischen Feldforschung unter dem Begriff 'Emic' im Unterschied zu 'Etic'?",
        answerA = "Emic bezeichnet elektronisch aufgezeichnete Daten, Etic manuell transkribierte Feldnotizen",
        answerB = "Emic bezeichnet die Innenperspektive der erforschten Kultur (kulturinterne Kategorien), Etic die Aussenperspektive des Forschers mit analytischen Kategorien",
        answerC = "Emic steht fuer empirische Daten aus Feldexperimenten, Etic fuer theoretische Musikanalyse",
        answerD = "Beide Begriffe bezeichnen verschiedene Aufnahmequaliтaeten von Feldaufnahmen (high-fidelity vs. standard)",
        correctAnswer = 1,
        explanation = "Emic (von 'phonemic') bezeichnet kulturinterne Kategorien und Bedeutungen, wie sie die Mitglieder einer Kultur selbst verwenden. Etic (von 'phonetic') bezeichnet externe, analytische Kategorien, die der Forscher von aussen anwendet. In der Ethnomusikologie ist die Balance zwischen beiden Perspektiven ein zentrales methodisches Problem.",
        difficulty = 4,
        funFact = "Der Begriff Emic/Etic wurde 1954 vom Linguisten Kenneth Pike gepraegt und von der Anthropologie uebernommen. In der Ethnomusikologie ist die Frage, ob man Musik nach emischen oder etischen Kategorien beschreiben soll, bis heute umstritten — und praegt alle grundlegenden methodologischen Debatten des Fachs."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Methode entwickelte der Ethnomusikologe Alan Lomax als 'Cantometrics' in den 1960er Jahren?",
        answerA = "Eine Transkriptionsmethode fuer pentatonische Skalen afrikanischer Herkunft",
        answerB = "Ein systematisches Codierungsverfahren zur vergleichenden Analyse von Gesangsstilen weltweit anhand von 37 Parametern",
        answerC = "Ein Feldforschungsprotokoll fuer die Dokumentation ritueller Musik in indigenen Gemeinschaften",
        answerD = "Eine Tonhoehenmessungsmethode fuer mikrotonale Musiken mit Strobo-Stimmgeraeten",
        correctAnswer = 1,
        explanation = "Cantometrics (von 'canto' + 'metrics') ist Alan Lomaxs System zur vergleichenden Analyse von Vokalstilen: 37 Parameter (u.a. Stimmqualitaet, Ornamentik, Rhythmus, Sozialstruktur des Singens) wurden fuer Aufnahmen aus aller Welt codiert und statistisch verglichen. Lomax suchte nach Zusammenhaengen zwischen Gesangsstil und sozialem Gefuege.",
        difficulty = 4,
        funFact = "Alan Lomax nahm in den 1930er-50er Jahren zusammen mit seinem Vater John A. Lomax fuer die Library of Congress ueber 10.000 amerikanische Volkslieder auf — darunter die ersten Aufnahmen von Leadbelly. Diese Sammlung gilt als eine der bedeutendsten folkloristischen Archive der Welt."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet man in der Ethnomusikologie als 'Organologie'?",
        answerA = "Die Wissenschaft von Kirchenorgeln und ihrer Baugeschichte",
        answerB = "Die wissenschaftliche Erforschung von Musikinstrumenten hinsichtlich Bau, Geschichte, kultureller Bedeutung und akustischer Eigenschaften",
        answerC = "Ein Teilgebiet der Musikpsychologie, das Koerperreaktionen auf Musik untersucht",
        answerD = "Die Lehre von Orgel-Registrierung und Kompositionstechniken fuer Kirchenmusik",
        correctAnswer = 1,
        explanation = "Organologie (von griechisch 'organon' = Werkzeug, Instrument) ist die wissenschaftliche Disziplin, die Musikinstrumente ganzheitlich untersucht: ihre Bauweise und Akustik, historische Entwicklung, kulturelle Bedeutung, Spielpraktiken und Verbreitung. Sie ist ein Kernbereich der Ethnomusikologie und der historischen Musikwissenschaft.",
        difficulty = 4,
        funFact = "Das Musical Instruments Museum (MIM) in Phoenix, Arizona ist eines der groessten Organologie-Museen der Welt: Es beherbergt ueber 6.800 Instrumente aus 200 Laendern und Regionen. Besucher koennen mit Kopfhoerern Klangbeispiele jedes Instruments hoeren — eine revolutionaere Museumskonzeption."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man in der Ethnomusikologie unter 'Participant Observation' als Feldforschungsmethode?",
        answerA = "Das passive Zuschauen bei Musikveranstaltungen ohne direkten Kontakt zur lokalen Gemeinschaft",
        answerB = "Die aktive Teilnahme des Forschers am Musikleben der erforschten Gemeinschaft — als Lernender, Mitspieler oder Zuhoerer — waehrend er gleichzeitig wissenschaftliche Beobachtungen macht",
        answerC = "Die Nutzung lokaler Gewaeahrsleute (Informanten) als Vermittler ohne direkten Forscher-Kontakt",
        answerD = "Die Videoaufzeichnung von Musikauffuehrungen aus sicherer Distanz ohne Stoerung der Teilnehmer",
        correctAnswer = 1,
        explanation = "Participant Observation (teilnehmende Beobachtung) ist die zentrale Feldforschungsmethode der Ethnologie und Ethnomusikologie: Der Forscher lebt in der erforschten Gemeinschaft, lernt die Musik aktiv zu spielen oder singen und erlebt ihre soziale Einbettung von innen. Dieses Immersions-Prinzip ermoelicht Einblicke, die reine Beobachtung nicht bietet.",
        difficulty = 4,
        funFact = "Der Ethnomusikologe Steven Feld lebte mehrere Jahre bei den Kaluli im Regenwald Papua-Neuguineas, lernte ihre Gesangspraktiken und erforschte ihre Klangaesthetik. Sein Buch 'Sound and Sentiment' (1982) gilt als Klassiker der Ethnomusikologie und beschreibt, wie Vogelgesang und Klangatmosphaere die Kaluli-Kultur praegen."
    ),

    Question(
        categoryId = 5,
        questionText = "Welchen Beitrag leistete Bela Bartok zur Ethnomusikologie, der ueber seine Rolle als Komponist hinausging?",
        answerA = "Er gruendete die erste akademische Professur fuer Ethnomusikologie in Budapest",
        answerB = "Er war einer der ersten systematischen Volksliedsammler, der mit Phonographen-Aufnahmegeraeten Tausende von Volksmelodien in Ungarn, Rumaenien, der Tuerkei und Nordafrika dokumentierte und analysierte",
        answerC = "Er entwickelte das Hornbostel-Sachs-Klassifikationssystem als Ko-Autor mit Erich von Hornbostel",
        answerD = "Er gruendete die erste internationale Zeitschrift fuer vergleichende Musikwissenschaft",
        correctAnswer = 1,
        explanation = "Bartok war zwischen 1905 und 1940 als Feldforschender in Ungarn, Rumaenien, der Slowakei, Bulgarien, der Tuerkei und Nordafrika taetig. Mit einem Edison-Phonographen zeichnete er ueber 10.000 Volksmelodien auf und transkribierte sie in detaillierten Editionen. Diese Arbeit beeinflusste nicht nur sein kompositorisches Schaffen, sondern legte methodische Grundlagen der vergleichenden Musikwissenschaft.",
        difficulty = 4,
        funFact = "Bartoks Feldforschung war auch politisch motiviert: Er wollte beweisen, dass die ungarische Volksmusik eine eigenstaendige, nicht vom deutschen Einfluss abgeleitete Tradition war. Diese nationale Identitaetspolitik durch Folkloreforschung war im fruehen 20. Jahrhundert weit verbreitet."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet das ethnomusikologlische Konzept der 'Musication' nach Christopher Small?",
        answerA = "Die Verbreitung von Musik ueber elektronische Medien in nicht-westlichen Kulturen",
        answerB = "Die Idee, dass Musik primae ein Verb (musizieren) und kein Substantiv ist — also ein soziales Handeln, nicht ein Objekt oder Produkt",
        answerC = "Das Aufzeichnen und Archivieren von Musik fuer spаetere Generationen",
        answerD = "Die Anpassung westlicher Kompositionstechniken an nicht-westliche Skalen-Systeme",
        correctAnswer = 1,
        explanation = "Christopher Smalls Konzept 'Musicking' (1998) besagt, dass Musik keine Sache ist, sondern eine Handlung (Verb, nicht Substantiv). 'To music' bedeutet, an einem musikalischen Ereignis teilzunehmen — als Spieler, Zuhoerer, Tanzender, Ton-Techniker oder Konzertkartenverkaufer. Diese Perspektive verschiebt den Fokus von Werken auf soziale Praktiken.",
        difficulty = 4,
        funFact = "Smalls Buch 'Musicking: The Meanings of Performing and Listening' (1998) war ein Paradigmenwechsel in der Musikwissenschaft. Statt Beethoven-Sinfonien als autonome Objekte zu analysieren, fragte Small: Was tun Menschen, wenn sie zu einem Konzert gehen? Was bedeutet dieser gesellschaftliche Akt?"
    ),

    Question(
        categoryId = 5,
        questionText = "Welchen methodischen Ansatz bezeichnet man in der Ethnomusikologie als 'Ethno-Theoretik' oder 'Indigene Musiktheorie'?",
        answerA = "Die Anwendung westlicher Musiktheorie (Harmonielehre, Kontrapunkt) auf aussereuropaeische Musikkulturen",
        answerB = "Die Erforschung und Dokumentation der eigenen musiktheoretischen Konzepte und Begriffe einer Musikkultur aus der Innenperspektive ihrer Traeger",
        answerC = "Eine Theorie, nach der alle Musikkulturen der Welt von einer gemeinsamen Urmusik abstammen",
        answerD = "Das Erstellen von Schulbueчern und Lehrplaenen fuer den Musikunterricht in nicht-westlichen Schulsystemen",
        correctAnswer = 1,
        explanation = "Indigene Musiktheorie (oder ethnotheoretischer Ansatz) erfrorscht, wie Musiktraeger einer Kultur ihre eigene Musik konzeptualisieren, benennen und lehren. Statt westliche Kategorien (Takt, Tonart, Harmonie) zu uebertragen, werden die eigenen Kategorien und Konzepte der Kultur dokumentiert — z.B. das Maqam-System im arabischen Raum oder das Raga-Konzept in der indischen Klassik.",
        difficulty = 4,
        funFact = "Das indische Raga-System ist eines der komplexesten indigenen Musiktheorien der Welt: Jedes Raga definiert nicht nur Skalentoene, sondern auch Tageszeit, Jahreszeit, emotionale Wirkung (Rasa), Aufstiegs- und Abstiegsregeln sowie charakteristische Phrasen. Westliche Notation kann diese mehrdimensionalen Strukturen kaum erfassen."
    )

)
