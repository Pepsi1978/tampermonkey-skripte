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

    // ── EASY NEW (1) ── 15 new questions ───────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Wie heißt die bekannteste Sängerin, die für den Hit 'Rolling in the Deep' bekannt ist?",
        answerA = "Rihanna",
        answerB = "Adele",
        answerC = "Beyoncé",
        answerD = "Amy Winehouse",
        correctAnswer = 1,
        explanation = "Adele veröffentlichte 'Rolling in the Deep' im Jahr 2010 auf ihrem Album '21'. Der Song wurde ein weltweiter Nummer-1-Hit.",
        difficulty = 1,
        funFact = "Adeles Album '21' ist eines der meistverkauften Alben des 21. Jahrhunderts mit über 31 Millionen verkauften Exemplaren."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Instrument ist ein Tasteninstrument mit Orgelpfeifen?",
        answerA = "Cembalo",
        answerB = "Akkordeon",
        answerC = "Orgel",
        answerD = "Synthesizer",
        correctAnswer = 2,
        explanation = "Die Orgel erzeugt ihren Klang durch Pfeifen, die mit Luft durchströmt werden. Die Tasten steuern, welche Pfeifen klingen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Wie heißt der bekannteste Song von Queen-Sänger Freddie Mercury als Soloartist?",
        answerA = "I Was Born to Love You",
        answerB = "Living on My Own",
        answerC = "Barcelona",
        answerD = "The Great Pretender",
        correctAnswer = 0,
        explanation = "'I Was Born to Love You' (1985) ist Freddie Mercurys bekanntester Solo-Hit, der auch von Queen neu aufgenommen wurde.",
        difficulty = 1,
        funFact = "Freddie Mercury nahm 'Barcelona' als Duett mit der Opernsängerin Montserrat Caballé auf – ein außergewöhnliches Crossover-Projekt."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'Beat' in der Musik?",
        answerA = "Ein einzelner Ton",
        answerB = "Der rhythmische Grundpuls eines Musikstücks",
        answerC = "Eine Melodiephrase",
        answerD = "Ein Akkord",
        correctAnswer = 1,
        explanation = "Der Beat ist der gleichmäßige Grundpuls, auf den man beim Musikhören mit dem Fuß wippt oder klatscht.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Band sang den Hit 'Highway to Hell'?",
        answerA = "Metallica",
        answerB = "AC/DC",
        answerC = "Guns N' Roses",
        answerD = "Bon Jovi",
        correctAnswer = 1,
        explanation = "'Highway to Hell' (1979) ist einer der bekanntesten Songs von AC/DC aus Australien. Es war das letzte Album mit Sänger Bon Scott vor seinem Tod.",
        difficulty = 1,
        funFact = "AC/DC wurde 1973 in Sydney, Australien, von den Brüdern Malcolm und Angus Young gegründet."
    ),

    Question(
        categoryId = 5,
        questionText = "Wie nennt man die Kombination mehrerer gleichzeitig gespielter Töne?",
        answerA = "Melodie",
        answerB = "Rhythmus",
        answerC = "Akkord",
        answerD = "Harmonie",
        correctAnswer = 2,
        explanation = "Ein Akkord entsteht, wenn mindestens drei Töne gleichzeitig erklingen. Der einfachste Akkord ist ein Dreiklang (z.B. C-E-G).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Sänger ist für 'Purple Rain' bekannt?",
        answerA = "David Bowie",
        answerB = "Prince",
        answerC = "Stevie Wonder",
        answerD = "Marvin Gaye",
        correctAnswer = 1,
        explanation = "'Purple Rain' (1984) ist das bekannteste Werk von Prince. Das Album und der gleichnamige Film machten ihn weltberühmt.",
        difficulty = 1,
        funFact = "Prince spielte auf dem Album 'Purple Rain' nahezu alle Instrumente selbst ein."
    ),

    Question(
        categoryId = 5,
        questionText = "Wie heißt die Linie, auf der Noten geschrieben werden?",
        answerA = "Taktlinie",
        answerB = "Notenlinie",
        answerC = "Notenzeile (Notensystem)",
        answerD = "Maßlinie",
        correctAnswer = 2,
        explanation = "Das Notensystem (auch Notenzeile) besteht aus fünf horizontalen Linien, auf und zwischen denen Noten geschrieben werden.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher deutsche Künstler ist bekannt für den Hit 'Über den Wolken'?",
        answerA = "Udo Jürgens",
        answerB = "Peter Maffay",
        answerC = "Reinhard Mey",
        answerD = "Hannes Wader",
        correctAnswer = 2,
        explanation = "'Über den Wolken' (1974) ist das bekannteste Lied des deutschen Liedermachlers Reinhard Mey und handelt vom Fliegen als Befreiung.",
        difficulty = 1,
        funFact = "Das Lied inspirierte Generationen von Piloten und ist bis heute bei der Luftwaffe sehr beliebt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Land ist die Heimat des Flamenco?",
        answerA = "Portugal",
        answerB = "Italien",
        answerC = "Spanien",
        answerD = "Mexiko",
        correctAnswer = 2,
        explanation = "Flamenco ist eine andalusische Kunstform aus Südspanien, die Gesang (Cante), Gitarrenspiel (Toque) und Tanz (Baile) vereint.",
        difficulty = 1,
        funFact = "2010 wurde Flamenco von der UNESCO als immaterielles Kulturerbe der Menschheit anerkannt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Sängerin ist für 'Like a Virgin' bekannt?",
        answerA = "Whitney Houston",
        answerB = "Madonna",
        answerC = "Cyndi Lauper",
        answerD = "Tina Turner",
        correctAnswer = 1,
        explanation = "'Like a Virgin' (1984) war Madonnas erster weltweiter Nummer-1-Hit. Ihr gleichnamiges Album verkaufte sich über 21 Millionen Mal.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Wie heißt das Schlaginstrument, das mit Schlegeln auf einem Resonanzkasten gespielt wird?",
        answerA = "Marimba",
        answerB = "Xylophon",
        answerC = "Glockenspiel",
        answerD = "Vibraphon",
        correctAnswer = 1,
        explanation = "Das Xylophon besteht aus Holzstäben unterschiedlicher Länge, die auf einem Gestell liegen und mit Schlägeln angeschlagen werden.",
        difficulty = 1,
        funFact = "Der Unterschied zwischen Xylophon und Marimba: Die Marimba hat Metallresonatoren unter den Holzstäben und klingt wärmer und voller."
    ),

    Question(
        categoryId = 5,
        questionText = "Wie nennt man ein langsames, feierliches Musikstück?",
        answerA = "Scherzo",
        answerB = "Allegro",
        answerC = "Adagio",
        answerD = "Presto",
        correctAnswer = 2,
        explanation = "Adagio ist eine musikalische Tempoangabe und bedeutet 'langsam, gemächlich' – langsamer als Andante, aber schneller als Largo.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Band ist bekannt für den Song 'Fiesta Mexicana'?",
        answerA = "Santana",
        answerB = "Los Lobos",
        answerC = "Klaus & Klaus",
        answerD = "Olé Olé",
        correctAnswer = 2,
        explanation = "'Fiesta Mexicana' ist ein Schlagerhit des deutschen Duos Klaus & Klaus aus dem Jahr 1987.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Was macht ein DJ bei einem Konzert oder einer Party hauptsächlich?",
        answerA = "Er singt live",
        answerB = "Er spielt ein Instrument",
        answerC = "Er wählt und mixt Musikstücke",
        answerD = "Er dirigiert das Orchester",
        correctAnswer = 2,
        explanation = "Ein DJ (Disc Jockey) wählt Musikstücke aus und mixt sie zu einem kontinuierlichen Musikfluss, oft mit Übergängen und Effekten.",
        difficulty = 1,
        funFact = "Der erste DJ der Welt war Jimmy Savile, der 1943 in England erstmals zwei Plattenspieler für nahtlose Übergänge nutzte."
    ),

    // ── MEDIUM NEW (2) ── 20 new questions ─────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welcher Gitarrist gilt als einer der einflussreichsten Blues-Rockgitarristen und starb 1970 im Alter von 27 Jahren?",
        answerA = "Eric Clapton",
        answerB = "Jimmy Page",
        answerC = "Jimi Hendrix",
        answerD = "Carlos Santana",
        correctAnswer = 2,
        explanation = "Jimi Hendrix revolutionierte das Gitarrenspiel mit innovativer Feedback-Technik, Whammy-Bar-Einsatz und seinem psychedelischen Stil. Er starb 1970 mit 27 Jahren.",
        difficulty = 2,
        funFact = "Hendrix spielte seine Gitarre linkshändig, aber auf einer für Rechtshänder umgedrehten Gitarre – die Saiten waren entsprechend umgekehrt aufgezogen."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Musikform besteht aus einem Thema, das mehrfach in verschiedenen Abwandlungen wiederholt wird?",
        answerA = "Fuge",
        answerB = "Suite",
        answerC = "Variationsform",
        answerD = "Sonate",
        correctAnswer = 2,
        explanation = "In der Variationsform wird ein musikalisches Thema mehrfach wiederholt, aber jedes Mal verändert – in Rhythmus, Tempo, Tonart oder Besetzung.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Genre ist eine Mischung aus Jazz und klassischer Musik, die Mitte des 20. Jahrhunderts entstand?",
        answerA = "Soul",
        answerB = "Third Stream",
        answerC = "Bebop",
        answerD = "Cool Jazz",
        correctAnswer = 1,
        explanation = "Third Stream (Dritter Strom) ist ein von Gunther Schuller 1957 geprägter Begriff für Musik, die Jazz-Improvisation mit klassischer Kompositionstechnik verbindet.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher österreichische Komponist schrieb die 'Unvollendete Sinfonie'?",
        answerA = "Joseph Haydn",
        answerB = "Wolfgang Amadeus Mozart",
        answerC = "Anton Bruckner",
        answerD = "Franz Schubert",
        correctAnswer = 3,
        explanation = "Franz Schuberts 8. Sinfonie h-Moll (D 759) heißt 'Die Unvollendete', weil nur zwei der geplanten vier Sätze fertiggestellt wurden.",
        difficulty = 2,
        funFact = "Schubert schrieb die Unvollendete 1822, sie wurde aber erst 1865 – 43 Jahre nach seiner Komposition – uraufgeführt."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bedeutet 'a cappella' in der Musik?",
        answerA = "Sehr laut singen",
        answerB = "Gesang ohne Instrumentalbegleitung",
        answerC = "Gesang mit Kirchenorgel",
        answerD = "Ein Chor mit mehr als 100 Personen",
        correctAnswer = 1,
        explanation = "A cappella (ital. 'nach Kapellen-Art') bezeichnet Vokalmusik, die ohne Instrumentalbegleitung gesungen wird.",
        difficulty = 2,
        funFact = "In der Renaissance war a cappella die normale Aufführungsart für geistliche Chormusik in Kirchen."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Berliner Band gilt als Vorreiter des Neuen Deutschen Härteklang und ist bekannt für den Hit 'Engel'?",
        answerA = "In Extremo",
        answerB = "Schandmaul",
        answerC = "Rammstein",
        answerD = "Oomph!",
        correctAnswer = 2,
        explanation = "'Engel' (1997) ist einer der bekanntesten Songs von Rammstein und erschien auf dem Album 'Sehnsucht'.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Instrument wird als 'Königin der Instrumente' in der Kammermusik oft als melodieführendes Instrument eingesetzt?",
        answerA = "Cello",
        answerB = "Viola",
        answerC = "Geige (Violine)",
        answerD = "Kontrabass",
        correctAnswer = 2,
        explanation = "Die Violine (Geige) übernimmt in Kammermusik und Orchestern meist die Hauptmelodie dank ihres hellen, durchdringenden Klangs.",
        difficulty = 2,
        funFact = "Die bekanntesten Violinen der Welt wurden von Antonio Stradivari (1644–1737) gebaut – eine echte Stradivari ist heute mehrere Millionen Euro wert."
    ),

    Question(
        categoryId = 5,
        questionText = "In welchem Jahr fand das berühmte Woodstock-Festival statt?",
        answerA = "1967",
        answerB = "1969",
        answerC = "1971",
        answerD = "1973",
        correctAnswer = 1,
        explanation = "Das Woodstock Music & Art Festival fand vom 15. bis 18. August 1969 in Bethel, New York, statt. Über 400.000 Menschen besuchten das Festival.",
        difficulty = 2,
        funFact = "Jimi Hendrix spielte als letzter Act bei Woodstock am frühen Montagmorgen – da waren nur noch etwa 30.000 Besucher übrig."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Musikstil aus den USA prägte die 1950er Jahre mit Künstlern wie Elvis Presley und Chuck Berry?",
        answerA = "Swing",
        answerB = "Rock 'n' Roll",
        answerC = "Rhythm and Blues",
        answerD = "Country",
        correctAnswer = 1,
        explanation = "Rock 'n' Roll entstand Mitte der 1950er Jahre in den USA als Fusion aus Rhythm and Blues, Gospel und Country. Chuck Berry und Elvis Presley waren die Pioniere.",
        difficulty = 2,
        funFact = "Der Begriff 'Rock 'n' Roll' wurde vom DJ Alan Freed geprägt, der die Musik erstmals 1951 unter diesem Namen im Radio spielte."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'Leitmotiv' in der Musik?",
        answerA = "Das Hauptthema einer Sinfonie",
        answerB = "Ein wiederkehrendes musikalisches Motiv, das eine Person, ein Gefühl oder eine Idee symbolisiert",
        answerC = "Die Hauptmelodie eines Volkslieds",
        answerD = "Das erste Thema in einer Sonate",
        correctAnswer = 1,
        explanation = "Ein Leitmotiv ist ein kurzes, prägnantes musikalisches Motiv, das mit einer Person, Idee oder Emotion verknüpft ist. Richard Wagner verwendete es systematisch in seinen Opern.",
        difficulty = 2,
        funFact = "John Williams nutzte Leitmotive meisterhaft in Star Wars: Das Darth-Vader-Thema (Imperial March) ist eines der bekanntesten Filmleitmotive."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Band veröffentlichte das Album 'Dark Side of the Moon' (1973)?",
        answerA = "Led Zeppelin",
        answerB = "The Who",
        answerC = "Pink Floyd",
        answerD = "The Rolling Stones",
        correctAnswer = 2,
        explanation = "'The Dark Side of the Moon' von Pink Floyd erschien 1973 und war über 14 Jahre in den Charts – eines der meistverkauften Alben der Musikgeschichte.",
        difficulty = 2,
        funFact = "Das Album blieb 741 Wochen – das entspricht über 14 Jahren – in den Billboard 200 Charts."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet man als 'Modulation' in der Musik?",
        answerA = "Ein Lautstärkeregler am Synthesizer",
        answerB = "Den Wechsel von einer Tonart in eine andere innerhalb eines Musikstücks",
        answerC = "Die Stimmung eines Instruments",
        answerD = "Eine Spieltechnik auf der Gitarre",
        correctAnswer = 1,
        explanation = "Modulation ist der gezielte Wechsel der Tonart während eines Musikstücks. Dies erzeugt harmonische Spannung und Abwechslung.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Hamburger Musikclub gilt als Keimzelle des Erfolgs der Beatles in den frühen 1960er Jahren?",
        answerA = "Fabrik",
        answerB = "Star-Club",
        answerC = "Docks",
        answerD = "Markthalle",
        correctAnswer = 1,
        explanation = "Der Hamburger Star-Club war zwischen 1962 und 1969 einer der wichtigsten Livemusik-Clubs Europas. Die Beatles spielten dort über 800 Konzerte und entwickelten ihren Bühnenstil.",
        difficulty = 2,
        funFact = "Die Beatles spielten so intensiv im Star-Club, dass sie täglich bis zu acht Stunden auf der Bühne standen – das formte ihren unvergleichlichen Live-Sound."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Instrument ist das tiefste reguläre Streichinstrument im Orchester?",
        answerA = "Viola",
        answerB = "Cello",
        answerC = "Kontrabass",
        answerD = "Viola da gamba",
        correctAnswer = 2,
        explanation = "Der Kontrabass ist das tiefste und größte Streichinstrument im Orchester. Er bildet die harmonische und rhythmische Grundlage der Streichergruppe.",
        difficulty = 2,
        funFact = "In der Jazzmusik wird der Kontrabass meist gezupft (pizzicato) und nicht gestrichen, was ihm einen warmen, runden Klang verleiht."
    ),

    Question(
        categoryId = 5,
        questionText = "Wer ist der Komponist der Oper 'La Traviata'?",
        answerA = "Giacomo Puccini",
        answerB = "Wolfgang Amadeus Mozart",
        answerC = "Georges Bizet",
        answerD = "Giuseppe Verdi",
        correctAnswer = 3,
        explanation = "'La Traviata' (Die Verirrte) wurde 1853 von Giuseppe Verdi komponiert und uraufgeführt. Sie gehört zu den meistgespielten Opern der Welt.",
        difficulty = 2,
        funFact = "Die Uraufführung von La Traviata war ein Misserfolg – erst ein Jahr später, mit einer überarbeiteten Besetzung, wurde die Oper ein Triumph."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Musikgenre entstand in den 1980ern in Chicago mit vier-auf-die-vier Bassdrum und schnellen Synthesizer-Melodien?",
        answerA = "Techno",
        answerB = "Trance",
        answerC = "House",
        answerD = "Drum and Bass",
        correctAnswer = 2,
        explanation = "House-Musik entstand ca. 1983 im Chicagoer Club 'The Warehouse' (daher der Name). DJ Frankie Knuckles gilt als 'Godfather of House Music'.",
        difficulty = 2,
        funFact = "Der Chicagoer DJ Larry Heard (Mr. Fingers) produzierte 1986 den Track 'Can You Feel It', der als einer der ersten Deep-House-Songs gilt."
    ),

    Question(
        categoryId = 5,
        questionText = "Wie nennt man in der Musik eine kurze, prägnante Melodiephrase?",
        answerA = "Phrase",
        answerB = "Motiv",
        answerC = "Periode",
        answerD = "Thema",
        correctAnswer = 1,
        explanation = "Ein Motiv ist die kleinste bedeutungstragende melodische oder rhythmische Einheit in der Musik – oft nur 2–4 Töne. Aus Motiven werden Themen aufgebaut.",
        difficulty = 2,
        funFact = "Das berühmteste Motiv der Musikgeschichte sind die vier Noten des Schicksalsthemas aus Beethovens 5. Sinfonie: drei Achtel und eine Halbe (kurz-kurz-kurz-lang)."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Stadt gilt als Geburtsort des Techno-Sounds in Deutschland?",
        answerA = "Hamburg",
        answerB = "Berlin",
        answerC = "Köln",
        answerD = "Frankfurt am Main",
        correctAnswer = 3,
        explanation = "Frankfurt am Main gilt als Wiege des deutschen Techno. DJs wie Sven Väth und das Label Eye Q Records prägten in den frühen 1990ern den Frankfurter Techno-Sound.",
        difficulty = 2,
        funFact = "Der Frankfurter Club 'Omen' (1988–1998) war neben dem Berliner Tresor einer der einflussreichsten Techno-Clubs Europas."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'Refrain' in einem Popsong?",
        answerA = "Das langsame Intro des Songs",
        answerB = "Der sich wiederholende Teil des Songs, der den Höhepunkt enthält",
        answerC = "Die Instrumentalpassage in der Mitte",
        answerD = "Der abschließende Ausklang des Songs",
        correctAnswer = 1,
        explanation = "Der Refrain (Chorus) ist der sich wiederholende Hauptteil eines Songs. Er enthält meist die eingängigste Melodie und die Hauptbotschaft des Textes.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Sänger ist bekannt als 'The Boss' und für das Album 'Born in the U.S.A.'?",
        answerA = "Tom Petty",
        answerB = "John Mellencamp",
        answerC = "Bruce Springsteen",
        answerD = "Bob Seger",
        correctAnswer = 2,
        explanation = "Bruce Springsteen trägt den Spitznamen 'The Boss'. Sein Album 'Born in the U.S.A.' (1984) wurde mit über 30 Millionen Exemplaren eines der meistverkauften Alben weltweit.",
        difficulty = 2,
        funFact = "Obwohl 'Born in the U.S.A.' wie eine patriotische Hymne klingt, handelt der Text von einem zurückgekehrten Vietnam-Veteranen, der in seiner Heimat keinen Halt findet."
    ),

    // ── HARD NEW (3) ── 15 new questions ───────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Kontrapunkt' in der Musiktheorie?",
        answerA = "Ein gegentaktiger Rhythmus",
        answerB = "Die Kunst, zwei oder mehr melodisch selbstständige Stimmen zu kombinieren",
        answerC = "Ein Akkord, der dem Grundakkord entgegengesetzt ist",
        answerD = "Ein Instrument, das gegen den Takt spielt",
        correctAnswer = 1,
        explanation = "Kontrapunkt (lat. 'punctus contra punctum' = Note gegen Note) ist die Technik, mehrere melodisch eigenständige Stimmlinien so zu kombinieren, dass sie harmonisch zusammenpassen.",
        difficulty = 3,
        funFact = "Johann Sebastian Bach gilt als Meister des Kontrapunkts. Seine Fugen gelten bis heute als Paradebeispiele kontrapunktischer Kompositionskunst."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Dirigent und Komponist leitete von 1958 bis 1969 die New York Philharmonic und ist für seine Bernstein-West Side Story bekannt?",
        answerA = "Aaron Copland",
        answerB = "Leonard Bernstein",
        answerC = "George Gershwin",
        answerD = "Samuel Barber",
        correctAnswer = 1,
        explanation = "Leonard Bernstein war Chefdirigent der New York Philharmonic und komponierte die Musical-Adaption 'West Side Story' (1957), die Shakespeare's Romeo und Julia in das New York der 1950er Jahre überträgt.",
        difficulty = 3,
        funFact = "Bernstein war der erste amerikanisch geborene Dirigent, der von einem führenden amerikanischen Orchester dauerhaft als Chefdirigent berufen wurde."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Instrument stand im Zentrum von Niccolò Paganinis virtuosen Konzerten und machte ihn zu einer Legende?",
        answerA = "Cello",
        answerB = "Klavier",
        answerC = "Gitarre",
        answerD = "Violine",
        correctAnswer = 3,
        explanation = "Niccolò Paganini (1782–1840) war ein italienischer Violinvirtuose, dessen Technik als so außergewöhnlich galt, dass Zeitgenossen übernatürliche Fähigkeiten vermuteten.",
        difficulty = 3,
        funFact = "Paganinis '24 Capricen für Solovioline' sind bis heute einige der technisch anspruchsvollsten Werke des Violinrepertoires."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'Ostinato' in der Musik?",
        answerA = "Eine langsame, getragene Tempoangabe",
        answerB = "Ein beharrlich wiederholtes rhythmisches oder melodisches Muster",
        answerC = "Eine Form der Stimmführung in Chören",
        answerD = "Ein Schlaginstrument aus Ostafrika",
        correctAnswer = 1,
        explanation = "Ostinato (ital. 'hartnäckig') ist ein kurzes melodisches, rhythmisches oder harmonisches Muster, das im Lauf eines Stücks unverändert wiederholt wird.",
        difficulty = 3,
        funFact = "Ravels 'Boléro' (1928) ist das berühmteste Beispiel eines Ostinatos: Das gleiche Thema wird 18 Minuten lang wiederholt, nur die Instrumentation ändert sich."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Begriff beschreibt in der Harmonielehre die Stufe V7 (Dominant-Septakkord), die zur Stufe I auflöst?",
        answerA = "Subdominante",
        answerB = "Doppeldominate",
        answerC = "Dominante",
        answerD = "Mediante",
        correctAnswer = 2,
        explanation = "Die Dominante (V) hat die stärkste Spannung zur Tonika (I). Der Dominant-Septakkord (V7) enthält einen Tritonus, der nach Auflösung zur Tonika drängt.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man unter 'Polyrhythmik'?",
        answerA = "Viele verschiedene Melodien gleichzeitig",
        answerB = "Das gleichzeitige Erklingen von zwei oder mehr verschiedenen Rhythmen",
        answerC = "Einen Rhythmuswechsel innerhalb eines Takts",
        answerD = "Rhythmen aus vielen Kulturen gemischt",
        correctAnswer = 1,
        explanation = "Polyrhythmik ist das simultane Erklingen zweier oder mehr verschiedener Rhythmen. In westafrikanischer Musik und Jazz ist sie ein zentrales Gestaltungsmittel.",
        difficulty = 3,
        funFact = "Steve Reich erforschte in seinen minimalistischen Werken wie 'Drumming' (1971) systematisch, was passiert, wenn gleiche Rhythmen leicht versetzt gespielt werden (Phasing)."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Komponist schrieb die Oper 'La Bohème' (1896)?",
        answerA = "Georges Bizet",
        answerB = "Giuseppe Verdi",
        answerC = "Gaetano Donizetti",
        answerD = "Giacomo Puccini",
        correctAnswer = 3,
        explanation = "'La Bohème' (1896) von Giacomo Puccini ist eine der meistgespielten Opern der Welt. Sie schildert das Leben armer Künstler im Paris des 19. Jahrhunderts.",
        difficulty = 3,
        funFact = "Jonathan Larson übertrug La Bohème ins Off-Broadway-Musical 'Rent' (1996), in dem HIV/AIDS statt Tuberkulose die tödliche Krankheit ist."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Chromatik' in der Musiktheorie?",
        answerA = "Die Verwendung von Farben in der Notation",
        answerB = "Die Verwendung aller 12 Halbtöne der temperierten Stimmung in einer Melodie oder Harmonik",
        answerC = "Ein Intervall von einer kleinen Terz",
        answerD = "Die Stimmtechnik bei Blasinstrumenten",
        correctAnswer = 1,
        explanation = "Chromatik (griech. 'chroma' = Farbe) bezeichnet in der Musik die Verwendung von Tönen außerhalb der Diatonik – also die halbtonweise Bewegung durch alle 12 Töne.",
        difficulty = 3,
        funFact = "Wagners Tristan-Akkord aus 'Tristan und Isolde' (1859) ist eines der bekanntesten Beispiele für extreme Chromatik in der Romanik."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Jazz-Saxofonist ist bekannt für den revolutionären Stil des 'Bebop' und den Album 'Ko-Ko' (1945)?",
        answerA = "John Coltrane",
        answerB = "Charlie Parker",
        answerC = "Sonny Rollins",
        answerD = "Coleman Hawkins",
        correctAnswer = 1,
        explanation = "Charlie Parker (genannt 'Bird') gilt als Vater des Bebop. Er revolutionierte den Jazz mit extrem schnellen Läufen, komplexen Harmonien und ungewöhnlichen Phrasierungen.",
        difficulty = 3,
        funFact = "Charlie Parker war für seinen enormen Appetit bekannt – sein Spitzname 'Yardbird' (kurz 'Bird') soll daher stammen, dass er auf Tournee einen Hühnerhof überfuhr und das Tier dann gekocht verlangte."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man unter einer 'Kadenz' in der Harmonielehre?",
        answerA = "Ein Soloabschnitt im Konzert",
        answerB = "Eine Akkordfolge, die ein tonales Zentrum bestätigt oder abschließt",
        answerC = "Eine Tonleiter mit kleinen Intervallen",
        answerD = "Eine langsame Schlusspassage",
        correctAnswer = 1,
        explanation = "Eine Kadenz ist eine harmonische Folge (meist IV-V-I oder II-V-I), die das tonale Zentrum bestätigt. Sie wirkt wie ein 'Punkt' oder 'Komma' in der musikalischen Syntax.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Kompositionsprinzip beschreibt das gleichzeitige Erklingen verschiedener Tonarten?",
        answerA = "Bitonalität / Polytonalität",
        answerB = "Atonalität",
        answerC = "Pantonalität",
        answerD = "Modalität",
        correctAnswer = 0,
        explanation = "Bitonalität (zwei Tonarten) oder Polytonalität (mehrere Tonarten) bezeichnet das gleichzeitige Erklingen in verschiedenen Tonarten, ein Merkmal von Strawinsky und Bartók.",
        difficulty = 3,
        funFact = "Igor Strawinskys 'Petruschka' (1911) ist ein berühmtes Beispiel für Bitonalität: Die gleichzeitig erklingenden Akkorde C-Dur und Fis-Dur ergeben den sogenannten 'Petruschka-Akkord'."
    ),

    Question(
        categoryId = 5,
        questionText = "Wie heißt die Technik, bei der Bläser ohne Atemunterbrechung kontinuierlich spielen können?",
        answerA = "Luftdruck-Kreislauf",
        answerB = "Zirkuläratmung",
        answerC = "Dauerpfeifen-Technik",
        answerD = "Vibrato-Atmung",
        correctAnswer = 1,
        explanation = "Zirkuläratmung ermöglicht das gleichzeitige Ein- und Ausatmen: Während Luft aus den Wangen ausgestoßen wird, atmet der Musiker durch die Nase ein – ein endloser Ton entsteht.",
        difficulty = 3,
        funFact = "Der australische Didgeridoo-Spieler David Hudson hält einen Guinness-Weltrekord: Er spielte mit Zirkuläratmung über 50 Minuten einen ununterbrochenen Ton."
    ),

    Question(
        categoryId = 5,
        questionText = "Wer komponierte das Requiem KV 626, das er unvollendet hinterließ?",
        answerA = "Franz Schubert",
        answerB = "Ludwig van Beethoven",
        answerC = "Wolfgang Amadeus Mozart",
        answerD = "Johannes Brahms",
        correctAnswer = 2,
        explanation = "Mozarts Requiem KV 626 (1791) blieb unvollendet, da er während der Komposition starb. Sein Schüler Franz Xaver Süßmayr vollendete das Werk nach Mozarts Aufzeichnungen.",
        difficulty = 3,
        funFact = "Die mysteriösen Umstände der Auftragserteilung durch einen anonymen Boten und Mozarts Tod während der Komposition inspirierten zahlreiche Legenden und den Film 'Amadeus' (1984)."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist das charakteristische Merkmal des Genres 'Minimal Music' (Minimalismus)?",
        answerA = "Sehr wenige Instrumente, maximal drei",
        answerB = "Langsame, schrittweise Veränderung einfacher, sich wiederholender Muster",
        answerC = "Nur natürliche Töne ohne Akkorde",
        answerD = "Kurze Stücke unter drei Minuten",
        correctAnswer = 1,
        explanation = "Minimal Music (entstanden ca. 1960, Vertreter: Steve Reich, Philip Glass, Terry Riley) verwendet einfache, wiederholte Muster, die sich nur langsam und graduell verändern.",
        difficulty = 3,
        funFact = "Philip Glass komponierte die Oper 'Einstein on the Beach' (1976) als fünfstündiges Werk ohne Pause und Handlung – reine Klang- und Bildstruktur."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Komponist schuf die symphonischen Dichtungen 'Also sprach Zarathustra' und 'Till Eulenspiegels lustige Streiche'?",
        answerA = "Gustav Mahler",
        answerB = "Anton Bruckner",
        answerC = "Richard Strauss",
        answerD = "Max Reger",
        correctAnswer = 2,
        explanation = "Richard Strauss (1864–1949) schuf mit seinen Tondichtungen neue Standards für programmatische Orchestermusik. 'Also sprach Zarathustra' op. 30 wurde durch Stanley Kubricks '2001' weltberühmt.",
        difficulty = 3,
        funFact = "Die Eröffnung von 'Also sprach Zarathustra' (C-G-C-Akkorde) wurde durch Kubricks Film so ikonisch, dass sie heute reflexartig mit dem Weltall assoziiert wird."
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
    ),

    // ── EASY BATCH 2 (1) ── 25 new questions ────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Wie viele Musiker spielen in einem Duo?",
        answerA = "1",
        answerB = "2",
        answerC = "3",
        answerD = "4",
        correctAnswer = 1,
        explanation = "Ein Duo besteht aus genau zwei Musikern oder Sängern, die gemeinsam auftreten oder musizieren.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Sängerin ist bekannt für den Hit 'Shape of You'?",
        answerA = "Justin Bieber",
        answerB = "Ed Sheeran",
        answerC = "Sam Smith",
        answerD = "Charlie Puth",
        correctAnswer = 1,
        explanation = "'Shape of You' (2017) ist ein Welthit des britischen Sänger-Songwriters Ed Sheeran. Er wurde mit dem Grammy für Best Pop Solo Performance ausgezeichnet.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Zahl steht im Notensystem oben im Taktzeichen für den 4/4-Takt?",
        answerA = "2",
        answerB = "8",
        answerC = "4",
        answerD = "6",
        correctAnswer = 2,
        explanation = "Im 4/4-Takt steht die obere Zahl '4' für vier Schläge pro Takt und die untere '4' für die Notenwert-Einheit (Viertelnote).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Instrument ist ein Blasinstrument aus Metall?",
        answerA = "Oboe",
        answerB = "Klarinette",
        answerC = "Trompete",
        answerD = "Fagott",
        correctAnswer = 2,
        explanation = "Die Trompete ist ein Blechblasinstrument (Aerophon). Oboe, Klarinette und Fagott sind Holzblasinstrumente, auch wenn Klarinette und Fagott oft aus Holz gefertigt sind.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Wie heißt der berühmte Sänger von U2?",
        answerA = "Bono",
        answerB = "Sting",
        answerC = "Chris Martin",
        answerD = "Brandon Flowers",
        correctAnswer = 0,
        explanation = "Bono (Paul David Hewson) ist der Leadsänger der irischen Rockband U2, die 1976 in Dublin gegründet wurde.",
        difficulty = 1,
        funFact = "U2 ist eine der meistverkauften Bands aller Zeiten mit über 170 Millionen verkauften Tonträgern weltweit."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist der Unterschied zwischen einem Dur- und einem Moll-Akkord?",
        answerA = "Dur klingt heller und fröhlicher, Moll dunkler und trauriger",
        answerB = "Dur hat mehr Töne als Moll",
        answerC = "Dur wird schneller gespielt als Moll",
        answerD = "Dur ist lauter als Moll",
        correctAnswer = 0,
        explanation = "Dur-Akkorde (z.B. C-E-G) klingen hell und fröhlich durch die große Terz. Moll-Akkorde (z.B. C-Es-G) klingen dunkler und melancholischer durch die kleine Terz.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Wie nennt man einen Sänger mit der höchsten männlichen Stimmlage?",
        answerA = "Bass",
        answerB = "Bariton",
        answerC = "Tenor",
        answerD = "Alt",
        correctAnswer = 2,
        explanation = "Der Tenor ist die höchste reguläre männliche Stimmlage. Berühmte Tenöre sind Luciano Pavarotti und Plácido Domingo.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Pop-Star ist bekannt als 'Queen of Pop'?",
        answerA = "Britney Spears",
        answerB = "Lady Gaga",
        answerC = "Madonna",
        answerD = "Mariah Carey",
        correctAnswer = 2,
        explanation = "Madonna trägt den Titel 'Queen of Pop' für ihre jahrzehntelange Karriere, Verkaufszahlen von über 300 Millionen Tonträgern und ihren Einfluss auf Popkultur und Mode.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Wie heißt das bekannteste Lied von The Beatles?",
        answerA = "Hey Jude",
        answerB = "Stairway to Heaven",
        answerC = "Imagine",
        answerD = "Let It Be",
        correctAnswer = 0,
        explanation = "'Hey Jude' (1968) von The Beatles hält den Rekord als eine der meistverkauften Singles aller Zeiten. Paul McCartney schrieb es für John Lennons Sohn Julian.",
        difficulty = 1,
        funFact = "Das Outro von 'Hey Jude' mit dem 'nah nah nah'-Teil dauert über vier Minuten und macht mehr als die Hälfte des Songs aus."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Instrument hat schwarze und weiße Tasten?",
        answerA = "Harfe",
        answerB = "Geige",
        answerC = "Klavier",
        answerD = "Trompete",
        correctAnswer = 2,
        explanation = "Das Klavier hat 88 Tasten – 52 weiße (Stammtöne) und 36 schwarze (Halbtöne). Die schwarzen Tasten entsprechen Kreuzen und Bs.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Wer sang 'I Will Always Love You' in der bekanntesten Version?",
        answerA = "Celine Dion",
        answerB = "Mariah Carey",
        answerC = "Whitney Houston",
        answerD = "Dolly Parton",
        correctAnswer = 2,
        explanation = "Whitney Houstons Version (1992) für den Film 'The Bodyguard' ist die bekannteste. Das Original stammt von Dolly Parton aus dem Jahr 1974.",
        difficulty = 1,
        funFact = "Dolly Parton schrieb das Lied für ihren Manager Porter Wagoner, als sie seine Begleitung verließ, um eine Solokarriere zu starten."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'Solo' in der Musik?",
        answerA = "Ein Stück für zwei Spieler",
        answerB = "Ein Abschnitt, der von einem einzelnen Musiker alleine gespielt wird",
        answerC = "Das Thema einer Sinfonie",
        answerD = "Eine sehr laute Passage",
        correctAnswer = 1,
        explanation = "Ein Solo ist ein Musikabschnitt, in dem ein einzelner Musiker oder Sänger im Vordergrund steht, meist begleitet von anderen oder ganz allein.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Farbe hat die bekannteste Version von Elvis Presleys Kostüm?",
        answerA = "Blau",
        answerB = "Weiß",
        answerC = "Schwarz",
        answerD = "Rot",
        correctAnswer = 1,
        explanation = "Elvis Presleys ikonisches weißes 'Jumpsuit'-Kostüm mit Strasssteinen und hohem Kragen wurde in den späten 1960er und 1970er Jahren zu seinem Markenzeichen.",
        difficulty = 1,
        funFact = "Elvis Presley wird als 'King of Rock and Roll' bezeichnet und gilt als einer der einflussreichsten Musiker des 20. Jahrhunderts."
    ),

    Question(
        categoryId = 5,
        questionText = "Wie heißt das Instrument, das wie eine große Geige aussieht und tiefer klingt?",
        answerA = "Mandoline",
        answerB = "Banjo",
        answerC = "Cello",
        answerD = "Ukulele",
        correctAnswer = 2,
        explanation = "Das Cello (Violoncello) ist größer als die Geige und klingt tiefer. Es wird zwischen den Knien gehalten und mit einem Bogen gespielt.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Band hat den Welthit 'We Will Rock You' veröffentlicht?",
        answerA = "The Rolling Stones",
        answerB = "Led Zeppelin",
        answerC = "Queen",
        answerD = "Aerosmith",
        correctAnswer = 2,
        explanation = "'We Will Rock You' (1977) von Queen ist bekannt für das markante Stampf-Klatsch-Stampf-Klatsch-Muster, das Brian May erfand.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'Chor'?",
        answerA = "Ein einzelner Solosänger",
        answerB = "Ein Ensemble von mehreren Sängern",
        answerC = "Ein Streichquartett",
        answerD = "Eine einzelne Melodielinie",
        correctAnswer = 1,
        explanation = "Ein Chor ist eine Gruppe von Sängerinnen und Sängern, die gemeinsam musizieren. Je nach Größe unterscheidet man Kammerchor, Oratorienchor und Laienchor.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Aus welchem Land stammt Shakira?",
        answerA = "Brasilien",
        answerB = "Mexiko",
        answerC = "Argentinien",
        answerD = "Kolumbien",
        correctAnswer = 3,
        explanation = "Shakira Isabel Mebarak Ripoll wurde 1977 in Barranquilla, Kolumbien, geboren und wurde weltberühmt mit Hits wie 'Hips Don't Lie'.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'Takt' in der Musik?",
        answerA = "Die Lautstärke eines Musikstücks",
        answerB = "Ein gleichmäßiger Zeitabschnitt mit einer bestimmten Anzahl von Schlägen",
        answerC = "Die Melodie eines Lieds",
        answerD = "Ein einzelner Ton",
        correctAnswer = 1,
        explanation = "Ein Takt ist die kleinste rhythmische Einheit mit einer festgelegten Anzahl an Schlägen. Taktstriche trennen die Takte optisch in der Notenschrift.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Sänger ist bekannt für das Lied 'Despacito'?",
        answerA = "Maluma",
        answerB = "J Balvin",
        answerC = "Luis Fonsi",
        answerD = "Daddy Yankee",
        correctAnswer = 2,
        explanation = "'Despacito' (2017) von Luis Fonsi (feat. Daddy Yankee) wurde eines der meistgestreamten Lieder der Geschichte und erzielte weltweit Nummer-1-Platzierungen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Musikgenre ist besonders für schnellen Sprechgesang bekannt?",
        answerA = "Country",
        answerB = "Jazz",
        answerC = "Hip-Hop / Rap",
        answerD = "Blues",
        correctAnswer = 2,
        explanation = "Hip-Hop und Rap sind Musikgenres, die durch schnellen, rhythmischen Sprechgesang (Rapping) über einen Beat gekennzeichnet sind.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Wie heißt die höchste weibliche Stimmlage?",
        answerA = "Mezzosopran",
        answerB = "Alt",
        answerC = "Kontraalt",
        answerD = "Sopran",
        correctAnswer = 3,
        explanation = "Der Sopran ist die höchste Stimmlage für Frauen. Darunter folgen Mezzosopran und Alt (Contralto).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Wer singt den Bond-Titelsong 'Skyfall' (2012)?",
        answerA = "Shirley Bassey",
        answerB = "Adele",
        answerC = "Sam Smith",
        answerD = "Billie Eilish",
        correctAnswer = 1,
        explanation = "Adele sang den Titelsong zum James-Bond-Film 'Skyfall' (2012). Das Lied gewann den Oscar für den Besten Originalsong.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Instrument wird hauptsächlich in einem Blasorchester nicht gespielt?",
        answerA = "Trompete",
        answerB = "Posaune",
        answerC = "Kontrabass-Geige",
        answerD = "Tuba",
        correctAnswer = 2,
        explanation = "In einem Blasorchester (Blaskapelle) werden Blechblas- und Holzblasinstrumente sowie Schlagzeug gespielt. Die Kontrabassgeige ist ein Streichinstrument und gehört nicht dazu.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Wie heißt die berühmte Sinfonie von Beethoven, die mit vier kurzen Tönen beginnt?",
        answerA = "3. Sinfonie (Eroica)",
        answerB = "6. Sinfonie (Pastorale)",
        answerC = "9. Sinfonie (Choral)",
        answerD = "5. Sinfonie (Schicksalssinfonie)",
        correctAnswer = 3,
        explanation = "Beethovens 5. Sinfonie in c-Moll beginnt mit dem berühmten viernotigen Schicksalsmotiv: drei kurze und ein langer Ton (kurz-kurz-kurz-lang).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Was macht ein Sänger, wenn er 'a cappella' singt?",
        answerA = "Er singt sehr laut",
        answerB = "Er singt ohne Instrumentalbegleitung",
        answerC = "Er singt in einer Kirche",
        answerD = "Er singt auf Italienisch",
        correctAnswer = 1,
        explanation = "A cappella bedeutet Gesang ohne jegliche Instrumentalbegleitung. Der Begriff kommt aus dem Italienischen und bedeutet 'nach Kapellen-Art'.",
        difficulty = 1,
        funFact = null
    ),

    // ── MEDIUM BATCH 2 (2) ── 15 new questions ──────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welcher Schweizer Komponist schrieb das Oratorium 'Das Lied von der Erde' (1909)?",
        answerA = "Richard Strauss",
        answerB = "Gustav Mahler",
        answerC = "Max Bruch",
        answerD = "Carl Nielsen",
        correctAnswer = 1,
        explanation = "Gustav Mahler (1860–1911) komponierte 'Das Lied von der Erde' für Tenor, Alt und Orchester auf Texten chinesischer Tang-Dynastie-Gedichte.",
        difficulty = 2,
        funFact = "Mahler vermied es, das Werk als 9. Sinfonie zu bezeichnen – er glaubte an den 'Fluch der Neunten', denn Beethoven, Schubert und Bruckner starben alle nach ihrer 9. Sinfonie."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Band veröffentlichte das Album 'Appetite for Destruction' (1987)?",
        answerA = "Metallica",
        answerB = "Guns N' Roses",
        answerC = "Motley Crue",
        answerD = "Def Leppard",
        correctAnswer = 1,
        explanation = "'Appetite for Destruction' (1987) von Guns N' Roses ist mit über 30 Millionen verkauften Exemplaren das meistverkaufte Debütalbum der Geschichte.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Genre bezeichnet eine Mischung aus Country und Rock-Musik?",
        answerA = "Bluegrass",
        answerB = "Country Rock",
        answerC = "Rockabilly",
        answerD = "Folk Rock",
        correctAnswer = 1,
        explanation = "Country Rock ist eine Mischung aus Country-Elementen (Steel Guitar, Twang) und Rockmusik. Bands wie Eagles und Creedence Clearwater Revival prägten das Genre.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet 'Swing' als musikalisches Element?",
        answerA = "Eine bestimmte Lautstärke",
        answerB = "Ein Rhythmusgefühl, bei dem Achtel ungleichmäßig betont werden (lang-kurz-Paar)",
        answerC = "Eine Tempoanweisung für sehr schnelle Stücke",
        answerD = "Das Spielen auf der offenen Saite",
        correctAnswer = 1,
        explanation = "Swing bezeichnet ein Rhythmusgefühl im Jazz, bei dem Achtelnotenpaare nicht gleichmäßig, sondern im Verhältnis von ca. 2:1 gespielt werden – das erzeugt den typischen 'schaukelnden' Groove.",
        difficulty = 2,
        funFact = "Der Begriff 'Swing' beschreibt sowohl das rhythmische Konzept als auch eine Jazz-Ära (1930er/40er), in der Big Bands für Tanzhallen spielten."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Komponist schrieb die Sinfonie 'Die Neue Welt' (Nr. 9, op. 95)?",
        answerA = "Bedřich Smetana",
        answerB = "Leoš Janáček",
        answerC = "Antonín Dvořák",
        answerD = "Bohuslav Martinů",
        correctAnswer = 2,
        explanation = "Antonín Dvořák (1841–1904) schrieb die 9. Sinfonie 'Aus der Neuen Welt' während seines Aufenthalts in New York (1892–95). Sie enthält Elemente amerikanischer Volksmusik.",
        difficulty = 2,
        funFact = "Das langsame Largo-Thema der Sinfonie wurde vom Schüler William Arms Fisher zum Spiritual 'Goin' Home' umgedichtet und ist eines der bekanntesten Melodien der Klassik."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Instrument gehört zur Familie der Zupfinstrumente?",
        answerA = "Oboe",
        answerB = "Harfe",
        answerC = "Posaune",
        answerD = "Pauke",
        correctAnswer = 1,
        explanation = "Die Harfe ist ein Zupfinstrument (Chordophon). Die Saiten werden mit den Fingern gezupft. Sie gilt als eines der ältesten Musikinstrumente der Menschheit.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Sänger ist bekannt für den Stil des 'Crooning' und Klassiker wie 'Fly Me to the Moon'?",
        answerA = "Dean Martin",
        answerB = "Frank Sinatra",
        answerC = "Sammy Davis Jr.",
        answerD = "Tony Bennett",
        correctAnswer = 1,
        explanation = "Frank Sinatra (1915–1998) gilt als der Inbegriff des Crooning – ein weicher, entspannter Gesangsstil, der sich an der Mikrofontechnik orientiert. 'Fly Me to the Moon' ist einer seiner Signature-Songs.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'Riff' in der Rockmusik?",
        answerA = "Eine Improvisation über viele Takte",
        answerB = "Ein kurzes, prägnantes Melodie- oder Akkordmuster, das wiederholt wird",
        answerC = "Ein Gitarrensolo",
        answerD = "Ein schneller Lauf auf allen Saiten",
        correctAnswer = 1,
        explanation = "Ein Riff ist ein kurzes, einprägsames musikalisches Muster, das als Grundlage oder wiederkehrendes Element eines Songs dient. Das Intro-Riff von 'Smoke on the Water' ist eines der bekanntesten.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "In welchem Jahrzehnt entstand Punk-Rock als Genre?",
        answerA = "1960er",
        answerB = "1970er",
        answerC = "1980er",
        answerD = "1990er",
        correctAnswer = 1,
        explanation = "Punk-Rock entstand Mitte der 1970er Jahre in New York und London. Bands wie The Ramones, Sex Pistols und The Clash prägten das Genre mit kurzen, schnellen, rohen Songs.",
        difficulty = 2,
        funFact = "Die Sex Pistols lösten 1977 mit 'God Save the Queen' in Großbritannien einen Skandal aus – der Song wurde im BBC-Radio verboten, erreichte aber trotzdem Platz 1 der Charts."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Musiker bildeten das Duo 'Simon & Garfunkel'?",
        answerA = "Paul Simon und Art Garfunkel",
        answerB = "Simon Le Bon und Nick Rhodes",
        answerC = "Hall und Oates",
        answerD = "Peter und Gordon",
        correctAnswer = 0,
        explanation = "Paul Simon und Art Garfunkel bildeten das Folk-Pop-Duo Simon & Garfunkel, das in den 1960ern mit 'The Sound of Silence', 'Mrs. Robinson' und 'Bridge Over Troubled Water' Welterfolge feierte.",
        difficulty = 2,
        funFact = "Beide Musiker wuchsen im selben Wohnblock in Queens, New York, auf und kannten sich seit der Grundschule."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist 'Sampling' in der modernen Musik?",
        answerA = "Das Ausprobieren neuer Instrumente",
        answerB = "Das digitale Entnehmen und Wiederverwenden von Klängen aus bestehenden Aufnahmen",
        answerC = "Eine Probe für ein Konzert",
        answerD = "Das Aufnehmen von Naturgeräuschen",
        correctAnswer = 1,
        explanation = "Sampling bezeichnet die Technik, kurze Klangschnipsel (Samples) aus vorhandenen Musikaufnahmen zu entnehmen und in neuen Produktionen zu verwenden. Es ist ein Grundpfeiler von Hip-Hop und elektronischer Musik.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Sängerin ist bekannt für das Album 'Back to Black' (2006)?",
        answerA = "Lily Allen",
        answerB = "Duffy",
        answerC = "Amy Winehouse",
        answerD = "Florence Welch",
        correctAnswer = 2,
        explanation = "Amy Winehouse veröffentlichte 'Back to Black' 2006. Das Album gewann fünf Grammy Awards und ist eines der meistverkauften britischen Alben aller Zeiten.",
        difficulty = 2,
        funFact = "Amy Winehouse starb 2011 im Alter von 27 Jahren und gehört damit zum sogenannten '27 Club' – Musiker, die in diesem Alter starben."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Musikrichtung ist für den 'Blue Note' und das pentatonische Tonleitersystem bekannt?",
        answerA = "Klassik",
        answerB = "Blues",
        answerC = "Volksmusik",
        answerD = "Gospel",
        correctAnswer = 1,
        explanation = "Der Blues nutzt die sogenannte Blues-Skala mit 'Blue Notes' – erniedrigte Terzen, Sexten und Septimen, die einen charakteristischen melancholischen Klang erzeugen.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher österreichische Pianist und Dirigent gilt als einer der bedeutendsten Musiker des 20. Jahrhunderts und ist für seine Mozart-Interpretationen bekannt?",
        answerA = "Wilhelm Backhaus",
        answerB = "Friedrich Gulda",
        answerC = "Alfred Brendel",
        answerD = "Rudolf Serkin",
        correctAnswer = 1,
        explanation = "Friedrich Gulda (1930–2000) war ein österreichisches Ausnahmetalent, das klassische Musik und Jazz verband. Seine Mozart-Interpretationen gelten als Referenzaufnahmen.",
        difficulty = 2,
        funFact = "Gulda täuschte 1999 seinen eigenen Tod vor, um seinen 70. Geburtstag ungestört feiern zu können – ein typischer Schachzug des exzentrischen Musikers."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Trassenmusik' oder 'Elevator Music'?",
        answerA = "Musik speziell für Rockkonzerte",
        answerB = "Beruhigende Hintergrundmusik für öffentliche Räume",
        answerC = "Elektronische Tanzmusik",
        answerD = "Musik aus Straßenbahnstrecken",
        correctAnswer = 1,
        explanation = "Fahrstuhl- oder Hintergrundmusik (auch 'Muzak') ist speziell arrangierte Musik, die in öffentlichen Räumen, Wartezimmern oder Kaufhäusern beruhigend und unauffällig im Hintergrund läuft.",
        difficulty = 2,
        funFact = null
    ),

    // ── HARD BATCH 2 (3) ── 23 new questions ────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welcher Komponist des 20. Jahrhunderts ist bekannt für sein 'Prepared Piano', bei dem Objekte zwischen die Saiten des Klaviers gelegt werden?",
        answerA = "Morton Feldman",
        answerB = "Earle Brown",
        answerC = "John Cage",
        answerD = "Christian Wolff",
        correctAnswer = 2,
        explanation = "John Cage entwickelte das 'Prepared Piano' ab 1938 – Schrauben, Gummistücke und andere Objekte zwischen den Klaviersaiten verändern Klang und Timbre radikal.",
        difficulty = 3,
        funFact = "Cages 'Sonatas and Interludes' (1946–48) für Prepared Piano ist das bekannteste Werk für dieses Instrument."
    ),

    Question(
        categoryId = 5,
        questionText = "Was beschreibt das Konzept der 'Heterophonie' in der Musikethnologie?",
        answerA = "Mehrstimmigkeit mit verschiedenen Tonleitern",
        answerB = "Gleichzeitiges Ausführen derselben Melodie in leicht unterschiedlichen Varianten durch mehrere Spieler",
        answerC = "Wechselnde Taktarten innerhalb eines Stücks",
        answerD = "Gegenstimmige Führung zweier Melodien",
        correctAnswer = 1,
        explanation = "Heterophonie bezeichnet die simultane Ausführung derselben Melodie durch mehrere Musiker, wobei jeder leichte individuelle Abweichungen in Rhythmik oder Ornamentik einbringt. Typisch in asiatischer Musik.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Technik des Barockzeitalters bezeichnet das kontinuierliche Begleitmuster aus bezifferten Bassnoten?",
        answerA = "Cantus firmus",
        answerB = "Basso continuo (Generalbass)",
        answerC = "Ripieno",
        answerD = "Obbligato",
        correctAnswer = 1,
        explanation = "Der Basso continuo (Generalbass) ist eine barocke Begleittechnik: Ein Tasten- oder Zupfinstrument realisiert Akkorde anhand eines bezifferten Basses. Er war ca. 1600–1750 allgegenwärtig.",
        difficulty = 3,
        funFact = "Die Praxis des Basso continuo verschwand mit dem Ende des Barocks, wird aber heute in historisch informierten Aufführungen wieder gepflegt."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'Tritonus' in der Musiktheorie?",
        answerA = "Ein Dreiklang mit drei gleichen Intervallen",
        answerB = "Ein Intervall von sechs Halbtönen (übermäßige Quarte / verminderte Quinte)",
        answerC = "Ein Akkord aus drei Quinten",
        answerD = "Eine Skala mit drei Moll-Tönen",
        correctAnswer = 1,
        explanation = "Der Tritonus ist das Intervall von genau drei Ganztönen (sechs Halbtönen) – z.B. C bis Fis. Er klingt äußerst dissonant und wurde im Mittelalter 'diabolus in musica' (Teufel in der Musik) genannt.",
        difficulty = 3,
        funFact = "Der Tritonus ist das einzige Intervall, das sich selbst umkehrt und genau in der Mitte der Oktave liegt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Komponist schrieb die Oper 'Wozzeck' (1925), ein Meilenstein des Expressionismus?",
        answerA = "Arnold Schönberg",
        answerB = "Anton Webern",
        answerC = "Alban Berg",
        answerD = "Paul Hindemith",
        correctAnswer = 2,
        explanation = "Alban Bergs 'Wozzeck' (1925) ist eine der wichtigsten Opern des 20. Jahrhunderts. Sie kombiniert atonale Kompositionstechnik mit traditionellen Formen wie Sonate und Passacaglia.",
        difficulty = 3,
        funFact = "Berg vollendete 'Wozzeck' 1922, drei Jahre vor der Uraufführung. Der Dirigent Erich Kleiber ließ das Werk 137 Proben lang vorbereiten."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man in der Notation unter 'sul ponticello'?",
        answerA = "Spielen am Steg des Streichinstruments (erzeugt hellen, metallischen Klang)",
        answerB = "Spielen über dem Griffbrett (erzeugt weichen, flautigen Klang)",
        answerC = "Mit gedämpftem Klang über die leere Saite spielen",
        answerD = "Flageolett-Töne auf der höchsten Saite",
        correctAnswer = 0,
        explanation = "Sul ponticello (ital. 'am Steg') bedeutet, den Bogen nahe am Steg zu führen. Dies erzeugt einen hellen, schneidenden, manchmal kratzigen Klang mit betonten Obertönen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Begriff beschreibt die Technik, bei der der Sänger in der Jazzmusik die Melodie durch sinnfreie Silben improvisiert?",
        answerA = "Scat",
        answerB = "Riff",
        answerC = "Vocalese",
        answerD = "Melisma",
        correctAnswer = 0,
        explanation = "Scat-Gesang ist eine Jazztechnik, bei der der Sänger die Melodie mit sinnlosen Silben (wie 'ba-da-bop-bop-be') improvisiert. Ella Fitzgerald und Louis Armstrong waren Meister des Scat.",
        difficulty = 3,
        funFact = "Laut Legende erfand Louis Armstrong den Scat, als er beim Aufnehmen die Liedblätter fallen ließ und improvisiert weitersang."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Kompositionsform besteht aus einem Thema und einer Gegenmelodie, die imitatorisch durch verschiedene Stimmen geführt werden?",
        answerA = "Chaconne",
        answerB = "Passacaglia",
        answerC = "Invention",
        answerD = "Fuge",
        correctAnswer = 3,
        explanation = "Eine Fuge ist eine kontrapunktische Kompositionsform: Ein Thema (Subjekt) wird von einer Stimme begonnen und imitatorisch von anderen Stimmen aufgenommen. J.S. Bach ist der Meister der Fuge.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist eine 'Passacaglia' in der Barockmusik?",
        answerA = "Eine Tanzform im 2/4-Takt",
        answerB = "Eine Variationsform über einem sich wiederholenden Bass-Ostinato",
        answerC = "Ein Blasinstrument aus der Renaissancezeit",
        answerD = "Ein mehrstimmiges Vokalmadrigal",
        correctAnswer = 1,
        explanation = "Eine Passacaglia ist eine Variationsform, bei der über einem konstantem Bassthema (Ostinato) Variationen aufgebaut werden. Bachs 'Passacaglia und Fuge c-Moll' BWV 582 ist ein Meisterwerk dieser Form.",
        difficulty = 3,
        funFact = "Johannes Brahms nutzte die Passacaglia-Form im letzten Satz seiner 4. Sinfonie (e-Moll) – ein ungewöhnlicher Rückgriff auf barocke Formen in der Romantik."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Begriff bezeichnet in der Musiktheorie das Verhältnis eines Tones zu seiner Grundlage?",
        answerA = "Intervall",
        answerB = "Akkord",
        answerC = "Motiv",
        answerD = "Klangfarbe",
        correctAnswer = 0,
        explanation = "Ein Intervall ist der Abstand zwischen zwei Tönen in der Musiktheorie. Es wird nach Anzahl der Halbtöne gemessen und benannt: Prime, Sekunde, Terz, Quarte, Quinte, Sexte, Septime, Oktave.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnete der Begriff 'Musique concrète', der 1948 von Pierre Schaeffer geprägt wurde?",
        answerA = "Musik für Beton-Gebäude mit besonderer Akustik",
        answerB = "Elektronische Musik aus aufgezeichneten und manipulierten Alltagsgeräuschen und Klängen",
        answerC = "Traditionelle französische Volksmusik",
        answerD = "Musik basierend auf konkreten Zahlenreihen",
        correctAnswer = 1,
        explanation = "Musique concrète (Pierre Schaeffer, 1948) verwendet aufgenommene Realgeräusche (Züge, Stimmen, Natur), die auf Band manipuliert und als kompositorisches Material eingesetzt werden.",
        difficulty = 3,
        funFact = "Schaeffers 'Études de bruits' (1948) gilt als das erste Werk der Musique concrète – er arbeitete dafür mit dem aufgezeichneten Lärm eines Zuges."
    ),

    Question(
        categoryId = 5,
        questionText = "Welchen Begriff verwenden Musikethnologen für melodische Formeln und charakteristische Wendungen in der indischen Klassik?",
        answerA = "Maqam",
        answerB = "Tala",
        answerC = "Raga",
        answerD = "Pelog",
        correctAnswer = 2,
        explanation = "Ein Raga ist in der indischen Klassik ein melodisches Rahmenwerk mit charakteristischen Tönen, Intervallen und Ornamentierungsregeln. Jeder Raga hat eine spezifische emotionale Qualität und Tageszeit.",
        difficulty = 3,
        funFact = "Es gibt Hunderte klassifizierter Ragas. Ravi Shankar machte das Konzept durch seine Zusammenarbeit mit George Harrison für westliche Musikhörer bekannt."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man unter dem Begriff 'musikalische Syntax'?",
        answerA = "Die Schreibweise von Noten in der Partitur",
        answerB = "Regeln und Strukturprinzipien, die musikalische Phrasen und Abschnitte organisieren und Erwartungen erzeugen",
        answerC = "Die gleichzeitige Verwendung mehrerer Sprachen in Texten",
        answerD = "Die Tempoangaben in einer Komposition",
        correctAnswer = 1,
        explanation = "Musikalische Syntax bezeichnet das System von Regeln, nach denen Töne, Akkorde und Phrasen zu sinnvollen musikalischen Aussagen organisiert werden – analog zur Satzstruktur in der Sprache.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Konzept bezeichnet in der Barockmusik die alternierende Gegenüberstellung von kleinen Solistengruppen und dem vollen Orchester?",
        answerA = "Tutti-Soli",
        answerB = "Concerto grosso",
        answerC = "Sinfonia concertante",
        answerD = "Ritornell-Form",
        correctAnswer = 1,
        explanation = "Das Concerto grosso (ital. 'großes Konzert') stellt eine kleine Solistengruppe (Concertino) dem vollen Orchester (Ripieno/Tutti) gegenüber. Corelli und Händel sind führende Vertreter.",
        difficulty = 3,
        funFact = "Bachs 'Brandenburgische Konzerte' (1721) sind die bekanntesten Beispiele des Concerto grosso-Prinzips, obwohl Bach den Begriff selbst nicht verwendete."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist eine 'Enharmonik' in der Musiktheorie?",
        answerA = "Eine Stimmungsmethode für Blechblasinstrumente",
        answerB = "Die Gleichheit zweier verschieden notierter, aber gleichklingender Töne (z.B. Cis = Des)",
        answerC = "Ein Intervall aus zwei kleinen Terzen",
        answerD = "Eine Kompositionstechnik aus der Romantik",
        correctAnswer = 1,
        explanation = "Enharmonik bezeichnet Töne, die in der gleichstufigen Temperierung gleich klingen, aber unterschiedlich notiert werden: Cis und Des, Fis und Ges, Gis und As. Enharmonische Umdeutung ermöglicht überraschende Modulationen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Saxofonist prägte mit 'sheets of sound' (Klangteppiche aus schnellen Läufen) den modalen Jazz der späten 1950er?",
        answerA = "Coleman Hawkins",
        answerB = "Lester Young",
        answerC = "Ornette Coleman",
        answerD = "John Coltrane",
        correctAnswer = 3,
        explanation = "John Coltrane (1926–1967) entwickelte auf Alben wie 'Giant Steps' (1960) und 'A Love Supreme' (1964) seinen charakteristischen Stil mit blitzschnellen Akkordwechseln (Coltrane Changes) und modalen Improvisationen.",
        difficulty = 3,
        funFact = "Coltranes 'Giant Steps' führte harmonisch so schnell durch verschiedene Tonarten, dass viele Jazz-Musiker anfangs Schwierigkeiten hatten, darüber zu improvisieren."
    ),

    Question(
        categoryId = 5,
        questionText = "Was beschreibt der Begriff 'Mikrotiming' oder 'Groove' in der modernen Musikwissenschaft?",
        answerA = "Die exakte metronomische Präzision eines Orchesters",
        answerB = "Winzige bewusste oder unbewusste Abweichungen vom exakten Raster, die Rhythmus lebendig wirken lassen",
        answerC = "Das Spielen zwischen zwei Taktschlägen",
        answerD = "Die Synchronisation mehrerer digitaler Spuren",
        correctAnswer = 1,
        explanation = "Mikrotiming bezeichnet minimale zeitliche Abweichungen von einem exakten metrischen Raster. Diese werden in Jazz, Funk und Soul bewusst eingesetzt, um einen 'menschlichen' Groove zu erzeugen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welche russische Musikergruppe des 19. Jahrhunderts nannte sich selbst 'Das Mächtige Häuflein' (Mogutschaja kutschka)?",
        answerA = "Balakiw, Cui, Mussorgski, Rimski-Korsakow, Borodin",
        answerB = "Tschaikowski, Glasunow, Liadow",
        answerC = "Rachmaninow, Skrjabin, Medtner",
        answerD = "Stravinsky, Prokofjew, Schostakowitsch",
        correctAnswer = 0,
        explanation = "Das 'Mächtige Häuflein' (auch 'Die Fünf') bestand aus Balakirew, Cui, Mussorgski, Rimski-Korsakow und Borodin. Sie propagierten eine russische Nationalmusik ohne westlichen akademischen Einfluss.",
        difficulty = 3,
        funFact = "Modest Mussorgski schrieb 'Bilder einer Ausstellung' (1874) für Klavier – Maurice Ravel orchestrierte das Werk 1922 zu einem der populärsten Orchesterstücke der Klassik."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man unter 'Aleatorik' in der zeitgenössischen Komposition?",
        answerA = "Komposition nur für Aleatoren (antike Würfelinstrumente)",
        answerB = "Kompositions- oder Aufführungsmethode, bei der Zufallsprozesse integraler Bestandteil sind",
        answerC = "Musik basierend auf algebraischen Gleichungen",
        answerD = "Eine Stimmungsmethode für Orchesterstimmung",
        correctAnswer = 1,
        explanation = "Aleatorik (lat. 'alea' = Würfel) bezeichnet Musik, bei der der Zufall eine strukturelle Rolle spielt – entweder im Kompositionsprozess (Cage) oder in der Aufführungsentscheidung (Stockhausen, Boulez).",
        difficulty = 3,
        funFact = "John Cage nutzte das chinesische Orakel I Ching (Würfelwürfe) zur Komposition seiner 'Music of Changes' (1951)."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Begriff beschreibt in der Jazztheorie das Akkord-Progressions-System II-V-I?",
        answerA = "Blues-Progression",
        answerB = "Turnaround",
        answerC = "Rhythm Changes",
        answerD = "Two-Five-One (ii-V7-I)",
        correctAnswer = 3,
        explanation = "Die ii-V7-I-Kadenz ist die grundlegende harmonische Bewegung im Jazz: Vom Subdominant-Septakkord (Supertonica) über den Dominant-Septakkord zur Tonika. Sie erscheint in nahezu jedem Jazz-Standard.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 5,
        questionText = "Welchen besonderen Stimmtypus besitzen Countertenöre (Altus)?",
        answerA = "Eine sehr tiefe Bass-Stimme durch Mutation",
        answerB = "Eine hohe männliche Stimme in der Falsett-Technik oder natürlichen Kopfstimme",
        answerC = "Eine Sopranstimme durch chirurgischen Eingriff",
        answerD = "Eine künstlich verstärkte Tenorstimme",
        correctAnswer = 1,
        explanation = "Countertenöre sind männliche Sänger, die im Alt- oder Sopranregister singen, meist durch Falsett-Technik. In der Barockoper übernahmen sie Rollen, die ursprünglich für Kastraten geschrieben wurden.",
        difficulty = 3,
        funFact = "Andreas Scholl und Philippe Jaroussky zählen zu den bekanntesten Countertenören der Gegenwart."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist das Besondere an der Stimmführungstechnik des 'Hoquetus' in der mittelalterlichen Polyphonie?",
        answerA = "Alle Stimmen singen immer gleichzeitig in parallelen Quinten",
        answerB = "Die Melodie wird durch abwechselnde Pausen zwischen zwei Stimmen aufgeteilt, die nie gleichzeitig klingen",
        answerC = "Eine Stimme singt eine andere Tonart als die restlichen Stimmen",
        answerD = "Jede Stimme bekommt ihre eigene Taktart",
        correctAnswer = 1,
        explanation = "Hoquetus (lat./franz. 'Schluckauf') ist eine mittelalterliche Technik, bei der eine Melodie auf zwei Stimmen aufgeteilt wird: Wenn eine singt, schweigt die andere – wie ein gegenseitiger Wechsel.",
        difficulty = 3,
        funFact = "Guillaume de Machaut war ein bedeutender Meister des Hoquetus im 14. Jahrhundert. Die Technik erlebt in zeitgenössischer Musik eine Renaissance."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Begriff aus der Harmonielehre bezeichnet das Einführen eines leiterfremden Tons, der zur nächsten Stufe hinzieht?",
        answerA = "Neapolitaner",
        answerB = "Wechselnote",
        answerC = "Chromatischer Durchgang",
        answerD = "Sensible (Leittöne)",
        correctAnswer = 3,
        explanation = "Ein Leitton (Sensible) ist ein Ton, der durch seinen Halbtonabstand zur nächsten Stufe 'zieht'. Der klassischste Leitton ist der erhöhte 7. Ton einer Durtonleiter, der zur Oktave strebt.",
        difficulty = 3,
        funFact = null
    )
)
