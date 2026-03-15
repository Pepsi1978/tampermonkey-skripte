package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun musicQuestions(): List<Question> = listOf(

    // ── EASY (1) ── ~10 questions ──────────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Wie viele Töne hat eine Oktave in der westlichen Musik?",
        answerA = "7",
        answerB = "12",
        answerC = "8",
        answerD = "10",
        correctAnswer = 1,
        explanation = "Eine Oktave umfasst 12 Halbtöne (chromatische Skala), also 12 verschiedene Töne.",
        difficulty = 1,
        funFact = "Der Begriff 'Oktave' kommt vom lateinischen 'octava' (achte), weil der achte Ton einer Durtonleiter denselben Namen wie der erste trägt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Instrument spielt Elton John hauptsächlich?",
        answerA = "Gitarre",
        answerB = "Schlagzeug",
        answerC = "Klavier",
        answerD = "Geige",
        correctAnswer = 2,
        explanation = "Elton John ist weltberühmt für sein virtuoses Klavierspiel und seine markanten Auftritte am Flügel.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Aus welchem Land stammt die Band ABBA?",
        answerA = "Norwegen",
        answerB = "Dänemark",
        answerC = "Finnland",
        answerD = "Schweden",
        correctAnswer = 3,
        explanation = "ABBA wurde 1972 in Stockholm, Schweden, gegründet. Der Name setzt sich aus den Anfangsbuchstaben der Mitglieder zusammen: Agnetha, Björn, Benny und Anni-Frid.",
        difficulty = 1,
        funFact = "ABBA verkaufte weltweit über 400 Millionen Tonträger und gehört damit zu den meistverkauften Musikacts aller Zeiten."
    ),

    Question(
        categoryId = 5,
        questionText = "Wie heißt das bekannteste Lied von Queen?",
        answerA = "Stairway to Heaven",
        answerB = "Bohemian Rhapsody",
        answerC = "Hotel California",
        answerD = "Smells Like Teen Spirit",
        correctAnswer = 1,
        explanation = "Bohemian Rhapsody (1975) ist Queens ikonischstes Werk – eine fast sechsminütige Operrock-Suite, die stilbildend für die Rockgeschichte war.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Stimmlage ist die tiefste bei Männern?",
        answerA = "Tenor",
        answerB = "Bariton",
        answerC = "Bass",
        answerD = "Alt",
        correctAnswer = 2,
        explanation = "Bass ist die tiefste männliche Stimmlage. Die Reihenfolge von tief nach hoch lautet: Bass, Bariton, Tenor.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Wie viele Saiten hat eine klassische Gitarre?",
        answerA = "4",
        answerB = "5",
        answerC = "6",
        answerD = "8",
        correctAnswer = 2,
        explanation = "Eine klassische Konzertgitarre hat 6 Saiten, gestimmt auf E-A-D-G-H-e (von tief nach hoch).",
        difficulty = 1,
        funFact = "Die 12-saitige Gitarre hat doppelte Saiten und erzeugt dadurch einen volleren, chor-ähnlichen Klang."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher deutsche Komponist schrieb die Ode an die Freude?",
        answerA = "Johann Sebastian Bach",
        answerB = "Wolfgang Amadeus Mozart",
        answerC = "Franz Schubert",
        answerD = "Ludwig van Beethoven",
        correctAnswer = 3,
        explanation = "Ludwig van Beethoven komponierte die 9. Sinfonie mit der berühmten Ode an die Freude im Jahr 1824 – obwohl er zu diesem Zeitpunkt bereits vollständig taub war.",
        difficulty = 1,
        funFact = "Die Melodie der Ode an die Freude ist seit 1985 die offizielle Hymne der Europäischen Union."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bedeutet das Zeichen '#' in der Musiknotation?",
        answerA = "Erniedrigungszeichen (Halbton tiefer)",
        answerB = "Erhöhungszeichen (Halbton höher)",
        answerC = "Wiederholungszeichen",
        answerD = "Pausenzeichen",
        correctAnswer = 1,
        explanation = "Das Kreuz (#) ist ein Erhöhungszeichen und gibt an, dass der folgende Ton um einen Halbton erhöht werden soll.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Schlagzeug-Element gibt den Grundrhythmus in einer Rock-Band vor?",
        answerA = "Snare-Drum",
        answerB = "Hi-Hat",
        answerC = "Becken",
        answerD = "Bass-Drum",
        correctAnswer = 3,
        explanation = "Die Bass-Drum (Große Trommel) liefert in Rock und Pop den fundamentalen Puls und wird mit dem Fuß gespielt.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Künstler ist als 'King of Pop' bekannt?",
        answerA = "Prince",
        answerB = "Michael Jackson",
        answerC = "David Bowie",
        answerD = "Elvis Presley",
        correctAnswer = 1,
        explanation = "Michael Jackson erhielt den Titel 'King of Pop' für seine revolutionären Musikvideos, seinen einzigartigen Tanzstil und globale Hits wie Thriller.",
        difficulty = 1,
        funFact = "Michael Jacksons Album Thriller (1982) ist mit über 70 Millionen verkauften Exemplaren das meistverkaufte Album aller Zeiten."
    ),

    // ── MEDIUM (2) ── ~15 questions ────────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "In welchem Jahr wurde die Band Rammstein gegründet?",
        answerA = "1988",
        answerB = "1994",
        answerC = "1991",
        answerD = "1997",
        correctAnswer = 1,
        explanation = "Rammstein wurde 1994 in Berlin gegründet und ist eine der international erfolgreichsten deutschen Bands überhaupt.",
        difficulty = 2,
        funFact = "Der Bandname leitet sich von der Stadt Ramstein in der Pfalz ab, wo 1988 eine Flugschau-Katastrophe stattfand."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Instrument gehört zur Familie der Aerophone?",
        answerA = "Geige",
        answerB = "Pauke",
        answerC = "Querflöte",
        answerD = "Kontrabass",
        correctAnswer = 2,
        explanation = "Aerophone erzeugen ihren Klang durch Luftschwingungen. Die Querflöte ist ein klassisches Aerophon.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Tonart hat keine Vorzeichen?",
        answerA = "G-Dur",
        answerB = "F-Dur",
        answerC = "C-Dur",
        answerD = "D-Dur",
        correctAnswer = 2,
        explanation = "C-Dur ist die einzige Durtonart ohne Vorzeichen – sie besteht ausschließlich aus den Stammtönen C D E F G A H.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Wie heißt die deutsche Popgruppe, bekannt für das Lied '99 Luftballons'?",
        answerA = "Kraftwerk",
        answerB = "Nena",
        answerC = "Tokio Hotel",
        answerD = "Die Toten Hosen",
        correctAnswer = 1,
        explanation = "Nena veröffentlichte 99 Luftballons im Jahr 1983 und erreichte damit weltweit die Charts – inklusive Platz 2 in den USA.",
        difficulty = 2,
        funFact = "Der Song handelt als politische Allegorie vom Kalten Krieg: 99 Luftballons lösen versehentlich einen Atomkrieg aus."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Musikgenre entstand in den 1970er Jahren in Jamaika?",
        answerA = "Blues",
        answerB = "Soul",
        answerC = "Reggae",
        answerD = "Funk",
        correctAnswer = 2,
        explanation = "Reggae entwickelte sich Ende der 1960er/Anfang der 1970er Jahre in Jamaika. Bob Marley ist der bekannteste Vertreter dieses Genres.",
        difficulty = 2,
        funFact = "Das Wort 'Reggae' soll vom jamaikanischen Slang 'rege-rege' abstammen, was 'zerrissene Kleidung' oder 'Streit' bedeutet."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Dirigent war von 1955 bis 1989 Chefdirigent der Berliner Philharmoniker?",
        answerA = "Leonard Bernstein",
        answerB = "Claudio Abbado",
        answerC = "Herbert von Karajan",
        answerD = "Georg Solti",
        correctAnswer = 2,
        explanation = "Herbert von Karajan leitete die Berliner Philharmoniker über 34 Jahre und prägte das Ensemble zu einem der renommiertesten Orchester der Welt.",
        difficulty = 2,
        funFact = "Karajan nahm über 800 Werke auf und ist damit einer der meistaufgenommenen Musiker der Geschichte."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man unter einem 'Arpeggio' in der Musik?",
        answerA = "Ein sehr schnelles Stück",
        answerB = "Das gebrochene Spiel eines Akkords (Ton für Ton)",
        answerC = "Eine Wiederholung der Melodie",
        answerD = "Ein langsames Diminuendo",
        correctAnswer = 1,
        explanation = "Bei einem Arpeggio (ital. 'arpa' = Harfe) werden die Töne eines Akkords nacheinander gespielt statt gleichzeitig – wie beim Harfenspiel.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Band veröffentlichte das Album 'Nevermind' (1991)?",
        answerA = "Pearl Jam",
        answerB = "Soundgarden",
        answerC = "Nirvana",
        answerD = "Alice in Chains",
        correctAnswer = 2,
        explanation = "Nevermind von Nirvana erschien am 24. September 1991 und läutete die Ära des Grunge-Rock ein. Der Hit Smells Like Teen Spirit ist darauf enthalten.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Wie heißt die Technik im Gesang, bei der man schnell zwischen Brust- und Kopfstimme wechselt?",
        answerA = "Vibrato",
        answerB = "Falsett",
        answerC = "Yodeln",
        answerD = "Melisma",
        correctAnswer = 2,
        explanation = "Yodeln ist eine Gesangstechnik mit schnellem Wechsel zwischen der tiefen Bruststimme und der hohen Kopfstimme (Falsett) und stammt aus dem Alpenraum.",
        difficulty = 2,
        funFact = "Yodeln wurde 2017 von der UNESCO in die Liste des immateriellen Kulturerbes aufgenommen."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Rapper gilt als einer der Begründer des deutschen Hip-Hop?",
        answerA = "Capital Bra",
        answerB = "Sido",
        answerC = "Kool Savas",
        answerD = "Torch",
        correctAnswer = 3,
        explanation = "Torch (Thomas Nast) ist eine Pioniergestalt des deutschsprachigen Hip-Hop und war Mitglied der Formation Advanced Chemistry, die in den frühen 1990ern deutschsprachiges Rappen popularisierte.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Was bedeutet der Musikausdruck 'fortissimo'?",
        answerA = "Sehr leise",
        answerB = "Mittellaut",
        answerC = "Sehr schnell",
        answerD = "Sehr laut",
        correctAnswer = 3,
        explanation = "Fortissimo (ff) ist eine dynamische Angabe aus dem Italienischen und bedeutet 'sehr laut' – die Steigerung von forte (f = laut).",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Musikrichtung entstand im Chicago der 1920er Jahre?",
        answerA = "Country",
        answerB = "Blues",
        answerC = "Jazz",
        answerD = "Gospel",
        correctAnswer = 2,
        explanation = "Jazz entstand ursprünglich in New Orleans, entwickelte sich aber in den 1920er Jahren in Chicago zu einer eigenständigen urbanen Spielart weiter.",
        difficulty = 2,
        funFact = "Der Begriff 'Jazz' taucht erstmals 1915 in einer Zeitung in San Francisco auf, seine Herkunft ist bis heute nicht eindeutig geklärt."
    ),

    Question(
        categoryId = 5,
        questionText = "Wie heißt das bekannteste Werk von Johann Pachelbel?",
        answerA = "Vier Jahreszeiten",
        answerB = "Kanon in D-Dur",
        answerC = "Das Wohltemperierte Klavier",
        answerD = "Wassermusik",
        correctAnswer = 1,
        explanation = "Pachelbels Kanon in D-Dur (ca. 1680) ist eines der meistgespielten Werke der klassischen Musik und wird häufig bei Hochzeiten gespielt.",
        difficulty = 2,
        funFact = "Die Bassline des Kanons in D wurde in Hunderten von Pop-Songs verwendet, darunter Hits von Coldplay und Vitamin C."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Instrument wird als 'Königin der Instrumente' bezeichnet?",
        answerA = "Klavier",
        answerB = "Harfe",
        answerC = "Orgel",
        answerD = "Cembalo",
        correctAnswer = 2,
        explanation = "Die Orgel gilt traditionell als 'Königin der Instrumente', weil sie die größte Bandbreite an Tönen, Dynamik und Klangfarben besitzt.",
        difficulty = 2,
        funFact = "Die größte Orgel der Welt befindet sich im Boardwalk Hall Auditorium in Atlantic City, USA, und hat über 33.000 Pfeifen."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Sänger ist für den Hit 'Nein, Mann!' bekannt und gilt als Pionier des Schlagers?",
        answerA = "Howard Carpendale",
        answerB = "Heino",
        answerC = "Rex Gildo",
        answerD = "Guildo Horn",
        correctAnswer = 0,
        explanation = "Howard Carpendale ist ein südafrikanisch-deutscher Schlagersänger, der seit den 1960ern in Deutschland erfolgreich ist. Sein bekanntester Hit ist 'Nein, Mann!' (1983).",
        difficulty = 2,
        funFact = null
    ),

    // ── HARD (3) ── ~12 questions ──────────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welches Stimmführungskonzept beschreibt das gleichzeitige Erklingen von Quinte und Oktave zwischen zwei Stimmen?",
        answerA = "Kreuzmodulation",
        answerB = "Parallelen (Quinten- und Oktavparallelen)",
        answerC = "Kontrapunkt",
        answerD = "Chromatik",
        correctAnswer = 1,
        explanation = "Quinten- und Oktavparallelen sind in der klassischen Harmonielehre verboten, da sie die Stimmunabhängigkeit aufheben und den polyphonen Satz schwächen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Komponist schrieb die Oper 'Der Ring des Nibelungen'?",
        answerA = "Giuseppe Verdi",
        answerB = "Richard Strauss",
        answerC = "Richard Wagner",
        answerD = "Giacomo Puccini",
        correctAnswer = 2,
        explanation = "Richard Wagners Zyklus Der Ring des Nibelungen besteht aus vier Opern und dauert insgesamt über 15 Stunden. Er wurde 1876 in Bayreuth uraufgeführt.",
        difficulty = 3,
        funFact = "Wagner baute in Bayreuth eigens ein Festspielhaus für seine Opern, das bis heute für den Ring-Zyklus genutzt wird."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Serielle Musik'?",
        answerA = "Musik, die ausschließlich in Serien veröffentlicht wird",
        answerB = "Eine Kompositionsmethode, bei der alle Tonparameter in Reihen organisiert sind",
        answerC = "Musik für Serieninstrumente wie Streicher",
        answerD = "Populäre Musik, die in Serien (Alben) erscheint",
        correctAnswer = 1,
        explanation = "Die Serielle Musik (ca. 1950er) erweitert Schönbergs Zwölftontechnik: Nicht nur die Tonhöhen, sondern auch Dauer, Dynamik und Artikulation werden in Reihen organisiert.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welches deutsche Elektronik-Duo gilt als Vorreiter der elektronischen Musik und beeinflusste Künstler wie David Bowie und Daft Punk?",
        answerA = "Rammstein",
        answerB = "Kraftwerk",
        answerC = "Tangerine Dream",
        answerD = "Can",
        correctAnswer = 1,
        explanation = "Kraftwerk aus Düsseldorf (gegründet 1970 von Ralf Hütter und Florian Schneider) revolutionierte die Popmusik durch vollständig elektronische Klänge und gilt als Vater von Techno, Hip-Hop und synth-Pop.",
        difficulty = 3,
        funFact = "David Bowie zog 1976 nach Berlin, inspiriert von Kraftwerk und dem Berliner Krautrock-Sound, und nahm dort seine berühmte 'Berlin-Trilogie' auf."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man unter dem Begriff 'Pizzicato'?",
        answerA = "Eine Spieltechnik bei Streichinstrumenten, bei der die Saiten gezupft statt gestrichen werden",
        answerB = "Eine besonders hohe Dynamikstufe",
        answerC = "Ein Triller auf dem Klavier",
        answerD = "Eine Taktart mit fünf Vierteln",
        correctAnswer = 0,
        explanation = "Pizzicato (ital. 'gezupft') bezeichnet das Zupfen der Saiten bei Streichinstrumenten mit den Fingern statt dem Bogen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Taktart ist typisch für den Walzer?",
        answerA = "2/4-Takt",
        answerB = "4/4-Takt",
        answerC = "3/4-Takt",
        answerD = "6/8-Takt",
        correctAnswer = 2,
        explanation = "Der Walzer ist ein Dreivierteltakt-Tanz. Der betonte erste Schlag und die zwei unbetonten Schläge ergeben das charakteristische 'Oom-pah-pah'-Muster.",
        difficulty = 3,
        funFact = "Johann Strauss Sohn gilt als 'Walzerkönig'. Sein Donauwalzer (An der schönen blauen Donau, 1866) ist die inoffizielle Hymne Österreichs."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Komponist schrieb das Werk 'Die Kunst der Fuge' (BWV 1080)?",
        answerA = "Georg Friedrich Händel",
        answerB = "Johann Sebastian Bach",
        answerC = "Georg Philipp Telemann",
        answerD = "Henry Purcell",
        correctAnswer = 1,
        explanation = "Johann Sebastian Bach schrieb Die Kunst der Fuge (ca. 1740–1750) kurz vor seinem Tod. Das Werk gilt als das ultimative Lehrstück der Kontrapunktik und blieb unvollendet.",
        difficulty = 3,
        funFact = "Das letzte Fugenthema enthält die Noten B-A-C-H (nach deutschem Notensystem H = B), Bachs eigene musikalische Signatur."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Stimmungssystem ermöglicht das Spielen in allen 24 Tonarten ohne Umstimmung?",
        answerA = "Mitteltönige Stimmung",
        answerB = "Pythagoreische Stimmung",
        answerC = "Gleichstufige Temperierung",
        answerD = "Reine Stimmung",
        correctAnswer = 2,
        explanation = "Die gleichstufige Temperierung (entwickelt im 18. Jh.) teilt die Oktave in 12 gleiche Halbtöne. Dies macht alle Tonarten gleichwertig spielbar, auf Kosten rein gestimmter Intervalle.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Wer komponierte das Ballett 'Der Nussknacker' (1892)?",
        answerA = "Igor Strawinsky",
        answerB = "Sergej Prokofjew",
        answerC = "Pjotr Iljitsch Tschaikowski",
        answerD = "Dimitri Schostakowitsch",
        correctAnswer = 2,
        explanation = "Peter Tschaikowski komponierte Der Nussknacker (op. 71) im Jahr 1892 für das Mariinski-Theater in St. Petersburg. Es ist das meistgespielte Ballett der Welt.",
        difficulty = 3,
        funFact = "Die Nussknacker-Suite enthält den berühmten 'Tanz der Zuckerfee', bei dem erstmals das Celesta im Orchester eingesetzt wurde."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Bassline-Technik kennzeichnet Funk-Musik besonders?",
        answerA = "Walking Bass (gleichmäßige Viertel)",
        answerB = "Synkopierter, 'slap'-betonter Bass im 16tel-Grid",
        answerC = "Pedaltöne über mehrere Takte",
        answerD = "Arpeggierte Dreiklänge",
        correctAnswer = 1,
        explanation = "Funk-Bass zeichnet sich durch Slap-Technik (Daumen schlägt auf die Saite), Synkopen und 16tel-Noten im Groove aus. James Brown und Sly Stone prägten diesen Stil.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet 'Sprechgesang' im Deutschen, der auch im Werk von Arnold Schönberg verwendet wurde?",
        answerA = "Rezitativ",
        answerB = "Sprechstimme",
        answerC = "Parlando",
        answerD = "Deklamation",
        correctAnswer = 1,
        explanation = "Schönberg bezeichnete seine Technik als 'Sprechstimme' – der Sänger trifft die notierten Tonhöhen kurz an, verlässt sie aber sofort, ähnlich dem normalen Sprechen.",
        difficulty = 3,
        funFact = "Schönberg verwendet die Sprechstimme meisterhaft in 'Pierrot lunaire' (1912), einem Schlüsselwerk der expressionistischen Musik."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher österreichische Komponist gilt als Vater der Wiener Klassik?",
        answerA = "Franz Schubert",
        answerB = "Joseph Haydn",
        answerC = "Anton Bruckner",
        answerD = "Carl Ditters von Dittersdorf",
        correctAnswer = 1,
        explanation = "Joseph Haydn (1732–1809) entwickelte die Sinfonie und das Streichquartett zu ihrer klassischen Form und prägte eine ganze Epoche. Er war Lehrer von Beethoven.",
        difficulty = 3,
        funFact = "Haydn arbeitete 30 Jahre als Hofkapellmeister für die Familie Esterházy und schrieb in dieser Zeit über 100 Sinfonien."
    ),

    // ── EXPERT (4) ── ~8 questions ─────────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welche Kompositionstechnik von Arnold Schönberg ordnet alle zwölf Töne der chromatischen Skala in eine Reihe, die keine Töne wiederholt?",
        answerA = "Aleatorik",
        answerB = "Modales System",
        answerC = "Zwölftontechnik (Dodekaphonie)",
        answerD = "Polytonalität",
        correctAnswer = 2,
        explanation = "Schönbergs Zwölftontechnik (ca. 1921) verwendet alle 12 Halbtöne gleichberechtigt in einer fest definierten Reihe, die in Grundform, Krebs, Umkehrung und Krebsumkehrung erscheint.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet das 'Mikrotonale' in der zeitgenössischen Musik?",
        answerA = "Musik für sehr leise Besetzungen",
        answerB = "Intervalle kleiner als ein Halbton",
        answerC = "Musik, die nur mit Mikrofonen aufgeführt werden kann",
        answerD = "Sehr kurze, präzise Notenwerte",
        correctAnswer = 1,
        explanation = "Mikrotonale Musik verwendet Intervalle kleiner als ein gleichstufiger Halbton (100 Cent). Bekannte Vertreter sind Julián Carrillo (Vierteltonmusik) und Harry Partch (43-Ton-System).",
        difficulty = 4,
        funFact = "Die arabische Maqam-Musik und indische Raga-Systeme nutzen traditionell Mikrotöne, die dem westlichen Ohr ungewohnt klingen."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Konzept beschreibt John Cages Komposition '4'33\"' (1952)?",
        answerA = "Eine 4-stimmige Fuge für 33 Instrumente",
        answerB = "Das Stück dauert 4 Minuten 33 Sekunden Stille – der Umgebungslärm ist die Musik",
        answerC = "33 Variationen über ein 4-taktiges Thema",
        answerD = "Ein 33-Umdrehungen-Vinyl mit 4-minütigem Intro",
        correctAnswer = 1,
        explanation = "John Cages 4'33\" ist eine stille Komposition: Der Interpret sitzt am Instrument und spielt nichts. Die zufälligen Geräusche der Umgebung werden zur Musik.",
        difficulty = 4,
        funFact = "Cage wurde von Zen-Buddhismus und dem Begriff 'Stille' als aktiver Zustand inspiriert. Er besuchte auch schalltote Räume und bemerkte, dass absolute Stille nicht existiert."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche musikalische Form besteht aus Exposition, Durchführung und Reprise?",
        answerA = "Rondoform",
        answerB = "Sonatenhauptsatzform",
        answerC = "Liedform (ABA)",
        answerD = "Variationsform",
        correctAnswer = 1,
        explanation = "Die Sonatenhauptsatzform (Sonatensatzform) ist das zentrale Formprinzip der Wiener Klassik: Exposition (zwei Themen), Durchführung (Entwicklung), Reprise (Rückkehr zur Tonika).",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Was bedeutet 'col legno' in der Partitur für Streicher?",
        answerA = "Mit dem Bogenholz auf die Saiten schlagen (statt mit den Haaren streichen)",
        answerB = "Mit gedämpftem Klang spielen",
        answerC = "Die Saite über dem Griffbrett spielen",
        answerD = "Den Bogen nahe am Steg führen",
        correctAnswer = 0,
        explanation = "Col legno (ital. 'mit dem Holz') bedeutet, dass Streicher mit der Holzseite des Bogens auf die Saiten schlagen. Dies erzeugt einen trockenen, percussiven Klang.",
        difficulty = 4,
        funFact = "Gustav Holst setzt col legno in seiner Orchestersuite 'Die Planeten' im Mars-Satz wirkungsvoll ein."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Begriff beschreibt in der Jazzharmonik Akkorde, die durch Terzverwandtschaft als Ersatz für andere Akkorde verwendet werden können?",
        answerA = "Tritonussubstitution",
        answerB = "Reharmonisierung",
        answerC = "Tertiäre Substitution (Terzsubstitution)",
        answerD = "Modaler Austausch",
        correctAnswer = 0,
        explanation = "Die Tritonussubstitution ersetzt einen Dominantseptakkord durch einen Akkord, dessen Grundton einen Tritonus entfernt liegt. Beide teilen dieselben charakteristischen Töne (Terz und Septime, nur vertauscht).",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Technik beschreibt das 'Extended Technique' auf der Trompete, bei dem der Spieler ohne Mundstück in den Schallbecher singt?",
        answerA = "Multiphonics",
        answerB = "Flutter Tonguing",
        answerC = "Slap Tonguing",
        answerD = "Growling",
        correctAnswer = 3,
        explanation = "Growling (engl. 'Knurren') ist eine Technik, bei der der Bläser gleichzeitig bläst und in das Instrument singt oder brummt, was einen verzerrten, 'schmutzigen' Klang erzeugt.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Stimmung verwendet das Werk 'The Well-Tempered Clavier' (Das Wohltemperierte Klavier) von J.S. Bach?",
        answerA = "Ausschließlich reine Stimmung",
        answerB = "Eine ungleichstufige Wohltemperierung (nicht gleich wie moderne Stimmung)",
        answerC = "Gleichstufige moderne Stimmung (440 Hz A)",
        answerD = "Mitteltönige Stimmung",
        correctAnswer = 1,
        explanation = "Bach schrieb das Wohltemperierte Klavier für eine 'wohltemperierte' Stimmung, die alle 24 Tonarten spielbar machte, aber nicht identisch mit der modernen gleichstufigen Temperierung war.",
        difficulty = 4,
        funFact = "Es gibt heute noch Diskussionen, welche genaue Stimmung Bach verwendete. Die verschlungenen Zeichen auf der Titelseite werden als Hinweise auf die Stimmung gedeutet."
    ),

    // ── MASTER (5) ── ~5 questions ─────────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welcher Komponist entwickelte das Konzept der 'Klangfarbenmelodie' (Klangfarbenmelodie)?",
        answerA = "Alban Berg",
        answerB = "Anton Webern",
        answerC = "Arnold Schönberg",
        answerD = "Karlheinz Stockhausen",
        correctAnswer = 2,
        explanation = "Schönberg prägte den Begriff 'Klangfarbenmelodie' in seiner Harmonielehre (1911): Eine Melodie entsteht nicht durch Tonhöhenwechsel, sondern durch den Wechsel der Klangfarbe auf demselben Ton.",
        difficulty = 5,
        funFact = "Webern perfektionierte das Konzept in seinen Orchestervariationen op. 30, wo einzelne Töne von verschiedenen Instrumenten gespielt werden – eine Technik, die später als 'Klangpunktuell' bezeichnet wurde."
    ),

    Question(
        categoryId = 5,
        questionText = "Was beschreibt der Begriff 'Spectralism' (Spektralismus) in der zeitgenössischen Komposition?",
        answerA = "Musik für Spektakel und große Besetzungen",
        answerB = "Kompositionsmethode, die den akustischen Spektralgehalt von Tönen als strukturelles Material nutzt",
        answerC = "Musik basierend auf dem sichtbaren Lichtspektrum",
        answerD = "Eine algorithmische Kompositionsmethode mit Computern",
        correctAnswer = 1,
        explanation = "Spektralismus (entstanden ca. 1970 in Frankreich, u.a. Gérard Grisey, Tristan Murail) analysiert den Oberton-Spektralgehalt von Klängen und baut Harmonik und Struktur direkt aus diesen physikalischen Eigenschaften auf.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "In welchem Jahr wurde die Standard-Kammerton-Frequenz für das eingestrichene A international auf 440 Hz festgelegt?",
        answerA = "1891",
        answerB = "1917",
        answerC = "1939",
        answerD = "1955",
        correctAnswer = 2,
        explanation = "1939 einigte sich die internationale Gemeinschaft auf 440 Hz als Standard-Kammerton (a'). Davor variierten Kammertonhöhen erheblich zwischen Ländern und Epochen (von ca. 415 Hz bis 466 Hz).",
        difficulty = 5,
        funFact = "In der Barockzeit spielten viele Orchester bei etwa 415 Hz – einen Halbton tiefer als heute. Historisch informierte Aufführungspraxis-Ensembles nutzen daher heute noch 415 Hz."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche mathematische Beziehung liegt der Obertonreihe (natürliche Harmonische) zugrunde?",
        answerA = "Geometrische Reihe mit Basis √2",
        answerB = "Logarithmische Spirale",
        answerC = "Ganzzahlige Vielfache der Grundfrequenz (1f, 2f, 3f, 4f...)",
        answerD = "Fibonacci-Folge",
        correctAnswer = 2,
        explanation = "Die Naturtonreihe besteht aus den ganzzahligen Vielfachen einer Grundfrequenz f: f, 2f, 3f, 4f... Diese Beziehung bestimmt Konsonanz und Dissonanz und ist die physikalische Basis aller Harmonielehre.",
        difficulty = 5,
        funFact = "Pythagoras entdeckte, dass einfache Zahlenverhältnisse (2:1 = Oktave, 3:2 = Quinte, 4:3 = Quarte) die angenehmsten Klangkombinationen ergeben – die Grundlage der westlichen Harmonielehre."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist das Hauptmerkmal der 'New Complexity'-Bewegung in der Neuen Musik (Vertreter: Brian Ferneyhough)?",
        answerA = "Maximale Vereinfachung auf wenige Töne",
        answerB = "Hochkomplexe Notation mit extremen Anforderungen an Ausführende, oft bis an die Grenzen der Spielbarkeit",
        answerC = "Computergenerierte Komposition ohne menschliche Eingriffe",
        answerD = "Rückkehr zur tonalen Einfachheit des Barock",
        correctAnswer = 1,
        explanation = "New Complexity (entstanden ca. 1970–80) schreibt extrem detaillierte Partituren mit polyrhythmischen Schichten, mikrodynamischen Abstufungen und erweiterten Spieltechniken – die Komplexität selbst wird zum ästhetischen Prinzip.",
        difficulty = 5,
        funFact = "Ferneyhoughs Werke sind so schwer notiert, dass einige Musiker argumentieren, sie seien nur annähernd ausführbar – die 'Unrealisierbarkeit' ist bewusst einkalkuliert."
    )
)
