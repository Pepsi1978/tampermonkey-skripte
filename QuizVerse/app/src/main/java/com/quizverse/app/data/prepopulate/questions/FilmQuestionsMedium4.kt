package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun filmQuestionsMedium4(): List<Question> = listOf(

    // ─── HORROR SUBGENRES: SLASHER ────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welcher Film aus dem Jahr 1978 gilt als Begruender des modernen Slasher-Genres?",
        answerA = "Freitag der 13.",
        answerB = "Halloween",
        answerC = "Nightmare - Morder aus der Unterwelt",
        answerD = "Scream",
        correctAnswer = 1,
        explanation = "John Carpenters 'Halloween' (1978) etablierte die zentralen Elemente des Slasher-Genres: maskierter Killer, Teenageropfer und der Final Girl-Tropus.",
        difficulty = 2,
        funFact = "Der gesamte Film 'Halloween' wurde in nur 20 Tagen mit einem Budget von 300.000 Dollar gedreht und spielte weltweit 70 Millionen Dollar ein."
    ),

    Question(
        categoryId = 4,
        questionText = "Was bezeichnet der Begriff 'Final Girl' im Slasher-Genre?",
        answerA = "Die letzte Frau, die vom Killer gejagt wird und ueberlebt",
        answerB = "Die weibliche Hauptdarstellerin, die als erste stirbt",
        answerC = "Die Mutter des Killers",
        answerD = "Eine Nebenrolle, die am Ende auftaucht",
        correctAnswer = 0,
        explanation = "Das 'Final Girl' ist der letzte weibliche Ueberlebende in Slasher-Filmen, der dem Killer direkt gegenueber steht und ihn besiegt oder ueberlebt.",
        difficulty = 2,
        funFact = "Der Medienwissenschaftler Carol J. Clover praegte den Begriff 'Final Girl' 1992 in seinem Buch 'Men, Women, and Chain Saws'."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Slasher-Film traegt der Killer eine Hockeymaske?",
        answerA = "Halloween",
        answerB = "Scream",
        answerC = "Freitag der 13.",
        answerD = "Leatherface",
        correctAnswer = 2,
        explanation = "Jason Voorhees aus 'Freitag der 13.' traegt ab Teil 3 (1982) seine ikonische Hockeymaske, die zu einem der bekanntesten Horror-Symbole wurde.",
        difficulty = 2,
        funFact = "In den ersten zwei 'Freitag der 13.'-Filmen traegt Jason Voorhees noch keinen Helm - die Hockeymaske erschien erst im dritten Teil."
    ),

    Question(
        categoryId = 4,
        questionText = "Wer ist der Killer im ersten 'Freitag der 13.'-Film (1980)?",
        answerA = "Jason Voorhees",
        answerB = "Mrs. Voorhees",
        answerC = "Michael Myers",
        answerD = "Freddy Krueger",
        correctAnswer = 1,
        explanation = "Im ersten Teil toetet Mrs. Pamela Voorhees - Jasons Mutter - die Teenagers, um den Tod ihres Sohnes zu raechen. Jason selbst wird erst ab Teil 2 zum Killer.",
        difficulty = 2,
        funFact = "Die Enthuellung von Mrs. Voorhees als Killerin am Ende des ersten Films war einer der ueberraschendsten Twist-Momente der Horrorfilm-Geschichte."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Jahr erschien Wes Cravens 'Nightmare on Elm Street' mit Freddy Krueger?",
        answerA = "1982",
        answerB = "1984",
        answerC = "1986",
        answerD = "1988",
        correctAnswer = 1,
        explanation = "'A Nightmare on Elm Street' erschien 1984 und einfuehrte Freddy Krueger, der seine Opfer in ihren Traeumen toetet.",
        difficulty = 2,
        funFact = "'Nightmare on Elm Street' war der erste Film von New Line Cinema, der das Studio aus der Insolvenz rettete und dessen Spitzname 'The House That Freddy Built' begruendete."
    ),

    // ─── HORROR SUBGENRES: FOUND FOOTAGE ─────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welcher Film aus dem Jahr 1999 popularisierte das Found-Footage-Horrorgenre?",
        answerA = "The Blair Witch Project",
        answerB = "Cloverfield",
        answerC = "Paranormal Activity",
        answerD = "REC",
        correctAnswer = 0,
        explanation = "'The Blair Witch Project' (1999) nutzte das Found-Footage-Format, bei dem Filmstudenten scheinbar echtes Videomaterial hinterlassen, und erzielte enormen kommerziellen Erfolg.",
        difficulty = 2,
        funFact = "'The Blair Witch Project' wurde mit einem Budget von ca. 60.000 Dollar gedreht und spielte weltweit ueber 248 Millionen Dollar ein - eine der hoechsten Renditen der Filmgeschichte."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist das zentrale Stilmittel des Found-Footage-Genres?",
        answerA = "Der Film wird aus der Vogelperspektive gezeigt",
        answerB = "Das Material wirkt wie echte, zuvor gefundene Aufnahmen",
        answerC = "Alle Szenen werden in Schwarzweiss gedreht",
        answerD = "Es gibt keinen Ton, nur Musik",
        correctAnswer = 1,
        explanation = "Found-Footage-Filme simulieren aufgefundenes Videomaterial (z.B. Handyvideos, Ueberwachungskameras), um den Eindruck von Authentizitaet und Realismus zu erzeugen.",
        difficulty = 2,
        funFact = "Der spanische Film 'REC' (2007) gilt als einer der besten Found-Footage-Horrorfilme und wurde in den USA als 'Quarantine' remakiert."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Jahr erschien 'Paranormal Activity', ein weiterer Meilenstein des Found-Footage-Genres?",
        answerA = "2005",
        answerB = "2007",
        answerC = "2009",
        answerD = "2011",
        correctAnswer = 2,
        explanation = "'Paranormal Activity' (2009) von Oren Peli zeigte eine scheinbar echte Geistererscheinung durch Heimvideo-Aufnahmen und wurde ein riesiger Kassenerfolg.",
        difficulty = 2,
        funFact = "'Paranormal Activity' wurde fuer nur 15.000 Dollar gedreht und spielte weltweit ueber 193 Millionen Dollar ein."
    ),

    // ─── HORROR SUBGENRES: PSYCHOLOGICAL HORROR ──────────────────────────────

    Question(
        categoryId = 4,
        questionText = "In Stanley Kubricks 'The Shining' (1980): Welchen Satz schreibt Jack Nicholsons Figur immer wieder?",
        answerA = "Here's Johnny",
        answerB = "All work and no play makes Jack a dull boy",
        answerC = "Redrum",
        answerD = "Come play with us",
        correctAnswer = 1,
        explanation = "Jack Torrance tippt obsessiv den Satz 'All work and no play makes Jack a dull boy' auf Hunderten von Seiten - ein ikonisches Zeichen seines Wahnsinns.",
        difficulty = 2,
        funFact = "In der deutschen Version lautete der Satz 'Was du heute kannst besorgen, das verschiebe nicht auf morgen' - jede Sprachversion nutzte ein eigenes Sprichwort."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher psychologische Horrorfilm von Darren Aronofsky handelt von einer Ballerina, die den Verstand verliert?",
        answerA = "Requiem for a Dream",
        answerB = "Black Swan",
        answerC = "Pi",
        answerD = "Mother!",
        correctAnswer = 1,
        explanation = "'Black Swan' (2010) zeigt Natalie Portman als Ballerina Nina, die fuer die Rolle des schwarzen Schwans in Schwanensee psychisch zerbricht.",
        difficulty = 2,
        funFact = "Natalie Portman gewann fuer ihre Rolle in 'Black Swan' den Oscar als Beste Hauptdarstellerin."
    ),

    // ─── SCIENCE FICTION: BLADE RUNNER ───────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "In welchem Jahr spielt Ridley Scotts 'Blade Runner' (1982)?",
        answerA = "2015",
        answerB = "2019",
        answerC = "2029",
        answerD = "2049",
        correctAnswer = 1,
        explanation = "'Blade Runner' spielt im Jahr 2019 in einer dystopischen, verregnerischen Version von Los Angeles.",
        difficulty = 2,
        funFact = "Da das Jahr 2019 mittlerweile Vergangenheit ist, wird 'Blade Runner' oft als Beispiel fuer eine Sci-Fi-Prognose diskutiert, die sich nicht bewahrheitet hat."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie heissen die kuenstlichen Menschen in 'Blade Runner'?",
        answerA = "Androide",
        answerB = "Replikanten",
        answerC = "Synths",
        answerD = "Klon",
        correctAnswer = 1,
        explanation = "In 'Blade Runner' heissen die kuenstlichen Menschen 'Replikanten' - gentechnisch erschaffene Wesen, die von sogenannten 'Blade Runnern' gejagt werden.",
        difficulty = 2,
        funFact = "Der 'Voight-Kampff-Test' im Film, mit dem Replikanten identifiziert werden, basiert auf der Idee, dass Empathie das entscheidende Merkmal menschlichen Bewusstseins ist."
    ),

    Question(
        categoryId = 4,
        questionText = "Welche beruehmt gewordene Schlussrede haelt Roy Batty am Ende von 'Blade Runner'?",
        answerA = "I'll be back",
        answerB = "All those moments will be lost in time, like tears in rain",
        answerC = "Open the pod bay doors, HAL",
        answerD = "To infinity and beyond",
        correctAnswer = 1,
        explanation = "Roys Abschiedsmonolog 'All those moments will be lost in time, like tears in rain' gilt als eine der poetischsten Szenen der Science-Fiction-Geschichte.",
        difficulty = 2,
        funFact = "Der Schauspieler Rutger Hauer improvisierte den 'Tears in Rain'-Monolog teilweise selbst und verkuerzte das urspruengliche Drehbuch erheblich."
    ),

    // ─── SCIENCE FICTION: 2001 – A SPACE ODYSSEY ────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Wie heisst der Bordcomputer in Stanley Kubricks '2001: Odyssee im Weltraum' (1968)?",
        answerA = "HAL 9000",
        answerB = "WALL-E",
        answerC = "R2-D2",
        answerD = "JARVIS",
        correctAnswer = 0,
        explanation = "HAL 9000 (Heuristically Programmed ALgorithmic Computer) ist die kuenstliche Intelligenz, die die Mission kontrolliert und letztlich die Besatzung bedroht.",
        difficulty = 2,
        funFact = "Die Buchstaben H-A-L sind jeweils ein Schritt vor I-B-M im Alphabet - ob dies eine Absicht von Arthur C. Clarke war, wurde nie eindeutig geklaert."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist der Monolith in '2001: Odyssee im Weltraum'?",
        answerA = "Ein Raumschiff",
        answerB = "Ein schwarzes, rechteckiges ausserirdisches Artefakt",
        answerC = "Ein Computerterminal",
        answerD = "Eine Raumstation",
        correctAnswer = 1,
        explanation = "Der schwarze rechteckige Monolith erscheint an Schluesselstellen der Menschheitsentwicklung und symbolisiert eine raeselhafte ausserirdische Kraft, die die Evolution beeinflusst.",
        difficulty = 2,
        funFact = "Kubrick weigerte sich stets, den Monolith zu erklaeren. Das Geheimnis um seine Bedeutung gehoert zu den groessten Diskussionsthemen der Filmgeschichte."
    ),

    Question(
        categoryId = 4,
        questionText = "Auf welchem Roman von Arthur C. Clarke basiert '2001: Odyssee im Weltraum'?",
        answerA = "Der Roman wurde nach dem Film geschrieben",
        answerB = "Kindheit's Ende",
        answerC = "Die Waechterin",
        answerD = "2010: Das Jahr, in dem wir Kontakt aufnehmen",
        correctAnswer = 0,
        explanation = "Kubrick und Clarke entwickelten Drehbuch und Roman parallel. Clarke schrieb den Roman '2001: A Space Odyssey' waehrend der Film produziert wurde - kein Roman ging voraus.",
        difficulty = 2,
        funFact = "Clarke und Kubrick arbeiteten so eng zusammen, dass beide als Koautoren des Drehbuchs galten, aber letztlich nur Kubrick nominiert wurde."
    ),

    // ─── SCIENCE FICTION: ARRIVAL ────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Auf welcher Kurzgeschichte basiert Denis Villeneuves Film 'Arrival' (2016)?",
        answerA = "Story of Your Life von Ted Chiang",
        answerB = "The Sentinel von Arthur C. Clarke",
        answerC = "Flowers for Algernon von Daniel Keyes",
        answerD = "All You Need Is Kill von Hiroshi Sakurazaka",
        correctAnswer = 0,
        explanation = "'Arrival' basiert auf der Kurzgeschichte 'Story of Your Life' (1998) von Ted Chiang, die die Hypothese Sapir-Whorf zur sprachlichen Relativitaet erforscht.",
        difficulty = 2,
        funFact = "Ted Chiangs Originalgeschichte gewann den Nebula Award. Er war begeistert von der Verfilmung, die seinen komplexen linguistischen Ideen treu blieb."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist das zentrale linguistische Konzept in 'Arrival' (2016)?",
        answerA = "Dass alle Sprachen gleich sind",
        answerB = "Dass die Sprache, die man spricht, die Wahrnehmung der Zeit beeinflusst",
        answerC = "Dass Ausserirdische nur Mathematik verstehen",
        answerD = "Dass Zeichen keine Bedeutung haben",
        correctAnswer = 1,
        explanation = "Der Film basiert auf der Sapir-Whorf-Hypothese: Durch das Erlernen der Aliensprache beginnt Louise, Zeit nicht-linear wahrzunehmen und kann die Zukunft sehen.",
        difficulty = 2,
        funFact = "Die Aliensprache 'Heptapod B' im Film wurde von echten Linguisten und Kalligraphen gestaltet und basiert auf realen Konzepten der Semiotik."
    ),

    // ─── BUCHADAPTIONEN: STEPHEN KING ────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welchen Roman von Stephen King verfilmte Stanley Kubrick 1980 als 'The Shining'?",
        answerA = "Es",
        answerB = "Carrie",
        answerC = "The Shining",
        answerD = "Misery",
        correctAnswer = 2,
        explanation = "Stephen Kings Roman 'The Shining' (1977) wurde von Kubrick 1980 verfilmt, obwohl King selbst mit der Interpretation unzufrieden war.",
        difficulty = 2,
        funFact = "Stephen King mochte Kubricks Verfilmung so wenig, dass er 1997 eine eigene TV-Miniserie produzierte, die seiner Vorlage treuer war."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Jahr erschien die erste Verfilmung von Stephen Kings Roman 'Carrie'?",
        answerA = "1974",
        answerB = "1976",
        answerC = "1978",
        answerD = "1980",
        correctAnswer = 1,
        explanation = "'Carrie' wurde 1976 von Brian De Palma verfilmt. Sissy Spacek spielte die telekinetische Carrie White in dieser Adaption des ersten King-Romans.",
        difficulty = 2,
        funFact = "Stephen King wollte das Manuskript zu 'Carrie' urspruenglich wegwerfen - seine Frau Tabitha rettete es aus dem Papierkorb und ueberredete ihn weiterzuschreiben."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Stephen-King-Film gewann den Oscar fuer den Besten Film?",
        answerA = "The Shining",
        answerB = "Misery",
        answerC = "Stand by Me",
        answerD = "Die Verurteilten (The Shawshank Redemption)",
        correctAnswer = 3,
        explanation = "Obwohl 'Die Verurteilten' (1994) bei der Oscar-Verleihung leer ausging - es verlor gegen 'Forrest Gump' - gilt es heute als einer der besten Filme aller Zeiten. Kein King-Film gewann tatsaechlich den Oscar als Bester Film.",
        difficulty = 2,
        funFact = "'Die Verurteilten' floepte anfangs an den Kinokassen, wurde aber durch Videoerverleih zum Kulthit und steht heute auf Platz 1 der IMDb Top 250."
    ),

    // ─── BUCHADAPTIONEN: J.R.R. TOLKIEN ──────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Wie viele Oscars gewann Peter Jacksons 'Der Herr der Ringe: Die Rueckkehr des Koenigs' (2003)?",
        answerA = "9",
        answerB = "11",
        answerC = "13",
        answerD = "7",
        correctAnswer = 1,
        explanation = "'Die Rueckkehr des Koenigs' gewann alle 11 Oscar-Nominierungen und ist damit neben 'Titanic' und 'Ben-Hur' der Rekordhalter fuer meiste gewonnene Oscars.",
        difficulty = 2,
        funFact = "Als einziger Fantasy-Film gewann 'Die Rueckkehr des Koenigs' den Oscar als Bester Film - ein Meilenstein fuer das Genre."
    ),

    Question(
        categoryId = 4,
        questionText = "Welche reale Sprache inspirierte Tolkien bei der Erschaffung von Quenya (Hochelbisch)?",
        answerA = "Finnisch",
        answerB = "Walisisch",
        answerC = "Altnordisch",
        answerD = "Latein",
        correctAnswer = 0,
        explanation = "Tolkiens Quenya wurde stark vom Finnischen beeinflusst, insbesondere vom Kalevala-Epos. Das Sindarin hingegen basiert auf dem Walisischen.",
        difficulty = 2,
        funFact = "Tolkien erfand die Sprachen zuerst und baute dann die Welt Mittelerde drum herum - nicht umgekehrt."
    ),

    Question(
        categoryId = 4,
        questionText = "In welcher Reihenfolge wurden Tolkiens Buecher veroeffentlicht - vor oder nach dem Zweiten Weltkrieg?",
        answerA = "Der Hobbit 1937, Der Herr der Ringe 1954-1955",
        answerB = "Der Herr der Ringe 1937, Der Hobbit 1954",
        answerC = "Beide 1954 gleichzeitig",
        answerD = "Der Hobbit 1945, Der Herr der Ringe 1950",
        correctAnswer = 0,
        explanation = "'Der Hobbit' erschien 1937, vor dem Zweiten Weltkrieg. 'Der Herr der Ringe' folgte 1954-1955 in drei Baenden nach dem Krieg.",
        difficulty = 2,
        funFact = "Tolkien arbeitete ueber 12 Jahre an 'Der Herr der Ringe'. Der Krieg unterbrach seine Arbeit erheblich."
    ),

    // ─── BUCHADAPTIONEN: PHILIP K. DICK ──────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Auf welchem Roman von Philip K. Dick basiert 'Blade Runner' (1982)?",
        answerA = "Ubik",
        answerB = "Traeumen Androiden von elektrischen Schafen?",
        answerC = "VALIS",
        answerD = "Das Orakel vom Berge",
        correctAnswer = 1,
        explanation = "'Blade Runner' basiert auf Philip K. Dicks Roman 'Do Androids Dream of Electric Sheep?' (1968), der die philosophische Frage stellt, was Bewusstsein ausmacht.",
        difficulty = 2,
        funFact = "Dick starb nur wenige Monate vor dem Kinostart von 'Blade Runner'. Er hatte eine Vorvorpremiere gesehen und war von dem Film begeistert."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Film von Steven Spielberg spielt Tom Hanks eine Figur, die auf einer Philip-K.-Dick-Geschichte basiert?",
        answerA = "Minority Report",
        answerB = "A.I.",
        answerC = "The Terminal",
        answerD = "Catch Me If You Can",
        correctAnswer = 0,
        explanation = "'Minority Report' (2002) basiert auf Philip K. Dicks Kurzgeschichte gleichen Namens. Dort spielt jedoch nicht Tom Hanks, sondern Tom Cruise.",
        difficulty = 2,
        funFact = "Mehrere grosse Hollywood-Produktionen basieren auf Philip-K.-Dick-Werken: Total Recall, Minority Report, A Scanner Darkly, The Adjustment Bureau und viele mehr."
    ),

    // ─── KAMPFKUNSTFILM: BRUCE LEE ────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "In welchem Film spielte Bruce Lee seine letzte vollendete Hauptrolle, bevor er 1973 starb?",
        answerA = "Mein letzter Kampf",
        answerB = "Der Mann mit der Todeskralle (Enter the Dragon)",
        answerC = "Der Weg des Drachen",
        answerD = "Todesgriffe des Shaolin",
        correctAnswer = 1,
        explanation = "'Der Mann mit der Todeskralle' (Enter the Dragon, 1973) war Bruce Lees letzte fertiggestellte Hauptrolle. Er starb im Juli 1973, kurz vor dem Kinostart.",
        difficulty = 2,
        funFact = "Bruce Lee starb am 20. Juli 1973 im Alter von 32 Jahren unter bis heute nicht vollstaendig geklarten Umstaenden."
    ),

    Question(
        categoryId = 4,
        questionText = "Welchen Kampfkunststil entwickelte Bruce Lee selbst?",
        answerA = "Wing Chun",
        answerB = "Jeet Kune Do",
        answerC = "Wushu",
        answerD = "Kung Fu",
        correctAnswer = 1,
        explanation = "Bruce Lee entwickelte Jeet Kune Do ('Weg der abfangenden Faust'), eine Kampfphilosophie, die verschiedene Stile kombiniert und Starrheit ablehnt.",
        difficulty = 2,
        funFact = "Jeet Kune Do ist keine festgelegte Methode, sondern eine Philosophie des freien Ausdrucks und der Anpassung - 'be like water' ist sein bekanntestes Motto."
    ),

    // ─── KAMPFKUNSTFILM: JACKIE CHAN ──────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Was ist das charakteristische Merkmal von Jackie Chans Kampfkunststil im Film?",
        answerA = "Schwere Waffen und Schussszenen",
        answerB = "Akrobatische Stunt-Comedy mit Alltagsgegenstaenden",
        answerC = "Reiner traditioneller Shaolin-Stil",
        answerD = "Unsichtbare Kampftechnik",
        correctAnswer = 1,
        explanation = "Jackie Chan verbindet akrobatische Kampfkunst mit Slapstick-Komik und nutzt Alltagsgegenstaende wie Stuehle, Leitern und Regenschirme als Waffen.",
        difficulty = 2,
        funFact = "Jackie Chan fuehrt fast alle seine Stunts selbst aus. Er hat sich im Laufe seiner Karriere fast jeden Knochen im Koerper mindestens einmal gebrochen."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem seiner Filme bewies Jackie Chan, dass er auch ernsthafte Rollen spielen kann?",
        answerA = "Rush Hour",
        answerB = "Shanghai Knights",
        answerC = "Police Story",
        answerD = "Crime de Sang",
        correctAnswer = 2,
        explanation = "'Police Story' (1985) gilt als Jackie Chans bester Film und zeigt ihn als ernsthaften Actionhelden neben seinen komischen Stunts.",
        difficulty = 2,
        funFact = "'Police Story' gewann den Hong Kong Film Award fuer den Besten Film - selten fuer einen Actionfilm."
    ),

    // ─── KAMPFKUNSTFILM: CROUCHING TIGER ─────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Wer fuehrte bei 'Tiger and Dragon' (Crouching Tiger, Hidden Dragon, 2000) Regie?",
        answerA = "John Woo",
        answerB = "Wong Kar-Wai",
        answerC = "Ang Lee",
        answerD = "Zhang Yimou",
        correctAnswer = 2,
        explanation = "Ang Lee fuehrte Regie bei 'Tiger and Dragon' (2000), der vier Oscars gewann und den Wuxia-Film international bekannt machte.",
        difficulty = 2,
        funFact = "Ang Lee sprach auf der Oscarbuehne auf Mandarin - das erste Mal, dass ein Regisseur seine Dankesrede nicht auf Englisch hielt."
    ),

    Question(
        categoryId = 4,
        questionText = "Welchen Oscar gewann 'Tiger and Dragon' (2000) als erster fremdsprachiger Film in dieser Kategorie?",
        answerA = "Bester internationaler Film",
        answerB = "Beste Kamera",
        answerC = "Beste Regie",
        answerD = "Bester Schnitt",
        correctAnswer = 1,
        explanation = "'Tiger and Dragon' gewann den Oscar fuer Beste Kamera (Peter Pau) sowie Beste Filmmusik, Bestes Szenenbild und Bester fremdsprachiger Film.",
        difficulty = 2,
        funFact = "Der Film basiert auf einer Romanreihe des chinesischen Autors Wang Dulu aus den 1940er Jahren."
    ),

    // ─── FILMZENSUR: FSK ──────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Fuer welche Altersgruppe gibt die FSK-Freigabe 'FSK 12' eine Empfehlung?",
        answerA = "Nur fuer Erwachsene",
        answerB = "Ab 12 Jahren, Kinder unter 12 nur mit Begleitung Erwachsener",
        answerC = "Ausschliesslich fuer Kinder bis 12 Jahre",
        answerD = "Ab 12 Jahren ohne Einschraenkung",
        correctAnswer = 1,
        explanation = "FSK 12 bedeutet, dass der Film ab 12 Jahren freigegeben ist. Kinder unter 12 duerfen den Film jedoch in Begleitung eines Erziehungsberechtigten sehen.",
        difficulty = 2,
        funFact = "Die Freiwillige Selbstkontrolle der Filmwirtschaft (FSK) wurde 1949 in Wiesbaden gegruendet und ist eine der aeltesten Filmkontrolleinrichtungen Europas."
    ),

    Question(
        categoryId = 4,
        questionText = "Was bedeutet die FSK-Einstufung 'Keine Jugendfreigabe' in Deutschland?",
        answerA = "Der Film ist verboten",
        answerB = "Der Film darf nur von Personen ab 18 Jahren gesehen werden",
        answerC = "Der Film ist nur fuer Kinder geeignet",
        answerD = "Der Film wurde noch nicht geprueft",
        correctAnswer = 1,
        explanation = "'Keine Jugendfreigabe' (frueher FSK 18) bedeutet, dass der Film erst ab 18 Jahren zugaenglich ist und in offentlichen Vorfuehrungen nicht an Minderjahrige verkauft werden darf.",
        difficulty = 2,
        funFact = "Neben 'Keine Jugendfreigabe' gibt es auch den Index der Bundespruefstelle, der Medien komplett verbieten kann - das ist strenger als nur FSK 18."
    ),

    Question(
        categoryId = 4,
        questionText = "Welche Institution ist in Deutschland fuer die Zensur und Freigabe von Kinofilmen zustaendig?",
        answerA = "Bundesministerium fuer Kultur",
        answerB = "Freiwillige Selbstkontrolle der Filmwirtschaft (FSK)",
        answerC = "Bundesamt fuer Medienkontrolle",
        answerD = "ARD/ZDF Medienkontrolle",
        correctAnswer = 1,
        explanation = "Die FSK (Freiwillige Selbstkontrolle der Filmwirtschaft) mit Sitz in Wiesbaden ist fuer die Altersfreigabe von Kinofilmen in Deutschland zustaendig.",
        difficulty = 2,
        funFact = "Die FSK ist eine selbstregulierende Einrichtung der Filmbranche - nicht eine staatliche Behoerde. Trotzdem haben ihre Entscheidungen Rechtswirkung."
    ),

    // ─── FILMZENSUR: MPAA ─────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Was bedeutet die US-Filmbewertung 'R' des MPAA?",
        answerA = "Fuer alle Altersgruppen geeignet",
        answerB = "Restricted - Unter 17 nur mit Elternteil oder Erziehungsberechtigtem",
        answerC = "Recommended - Besonders empfohlen",
        answerD = "Restricted to Adults only - Nur fuer Erwachsene",
        correctAnswer = 1,
        explanation = "Das MPAA-Rating 'R' (Restricted) bedeutet, dass Kinder unter 17 Jahren das Kino nur in Begleitung eines Erwachsenen betreten duerfen.",
        difficulty = 2,
        funFact = "Das MPAA-Bewertungssystem wurde 1968 eingefuehrt und ersetzte den alten Hays Code, der von 1934 bis 1968 strenge inhaltliche Verbote fuer Hollywoodfilme festlegte."
    ),

    Question(
        categoryId = 4,
        questionText = "Welche MPAA-Bewertung ist die strengste und schliesst Personen unter 17 komplett aus?",
        answerA = "R",
        answerB = "NC-17",
        answerC = "X",
        answerD = "AO",
        correctAnswer = 1,
        explanation = "NC-17 (No Children Under 17 Admitted) schliesst Minderjahrige komplett aus - keine Ausnahmen mit Eltern. Dieses Rating ersetzt das aeltere X-Rating.",
        difficulty = 2,
        funFact = "Viele Kinoketten zeigen NC-17-Filme nicht, und grosse Kaufhaeuser verkaufen sie nicht - weshalb Regisseure oft Schnitte vornehmen, um ein R-Rating zu erhalten."
    ),

    // ─── KONTROVERSE UND VERBOTENE FILME ─────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welcher Film wurde in Deutschland wegen seiner Verherrlichung von Gewalt und Nazismus verboten?",
        answerA = "Triumph des Willens",
        answerB = "Der Ewige Jude",
        answerC = "Jud Suss",
        answerD = "Alle drei Genannten",
        correctAnswer = 3,
        explanation = "Alle drei NS-Propagandafilme sind in Deutschland verboten oder stark eingeschraenkt: 'Triumph des Willens' (Leni Riefenstahl), 'Der Ewige Jude' und 'Jud Suss' (1940).",
        difficulty = 2,
        funFact = "'Triumph des Willens' darf in Deutschland nur zu wissenschaftlichen, lehrmassigen und antifaschistischen Zwecken vorgefuehrt werden."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Horrorfilm von 1980 wurde in mehreren Laendern verboten und als 'Video Nasty' eingestuft?",
        answerA = "The Texas Chainsaw Massacre",
        answerB = "Cannibal Holocaust",
        answerC = "Dawn of the Dead",
        answerD = "Suspiria",
        correctAnswer = 1,
        explanation = "'Cannibal Holocaust' (1980) wurde in ueber 50 Laendern verboten. Regisseur Ruggero Deodato musste vor Gericht beweisen, dass die Darsteller noch am Leben waren.",
        difficulty = 2,
        funFact = "Der Regisseur wurde zeitweise wegen Mordes angeklagt, weil der Film so realistisch wirkte. Die Darsteller mussten vor Gericht erscheinen, um zu beweisen, dass sie lebten."
    ),

    Question(
        categoryId = 4,
        questionText = "Was war der Begriff 'Video Nasty' in Grossbritannien?",
        answerA = "Eine Bezeichnung fuer schlecht produzierte Heimvideos",
        answerB = "Ein britischer Slangbegriff fuer besonders brutale oder anstossige Videofilme in den 1980ern",
        answerC = "Ein Marketingbegriff fuer Horrorfilme",
        answerD = "Ein offizieller Zensurtitel der BBC",
        correctAnswer = 1,
        explanation = "In den 1980ern wurden in Grossbritannien viele Horrorfilme als 'Video Nasties' bezeichnet und 1984 durch den Video Recordings Act reguliert und teilweise verboten.",
        difficulty = 2,
        funFact = "72 Filme standen auf der offiziellen britischen 'Video Nasties'-Liste, darunter 'The Evil Dead', 'Driller Killer' und 'I Spit on Your Grave'."
    ),

    // ─── KULTFILME UND MIDNIGHT MOVIES ───────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Was versteht man unter 'Midnight Movies'?",
        answerA = "Filme, die nur nachts im Fernsehen laufen",
        answerB = "Kultfilme, die bei Mitternachtsvorstellungen ein treues Stammpublikum entwickelten",
        answerC = "Horrorfilme, die nur in der Nacht spielen",
        answerD = "Dokumentationen ueber das Nachtleben",
        correctAnswer = 1,
        explanation = "Midnight Movies sind Kultfilme, die in den 1970ern und 80ern bei Mitternachtsvorstellungen gespielt wurden und ein leidenschaftliches Stammpublikum entwickelten.",
        difficulty = 2,
        funFact = "Die Rocky Horror Picture Show laeuft seit 1975 ununterbrochen als Midnight Movie und haelt damit den Weltrekord fuer den laengsten Kinoeinsatz."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Film gilt als der Urvater der Midnight-Movie-Kultur?",
        answerA = "Easy Rider",
        answerB = "El Topo",
        answerC = "Pink Flamingos",
        answerD = "Eraserhead",
        correctAnswer = 1,
        explanation = "Alejandro Jodorowskys 'El Topo' (1970) gilt als erster Midnight Movie - der Film wurde von John Lennon finanziert und startete die ganze Bewegung.",
        difficulty = 2,
        funFact = "John Lennon war so begeistert von 'El Topo', dass er Allen Klein bat, die amerikanischen Rechte zu kaufen, damit der Film in New York gespielt werden konnte."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher John-Waters-Film ist bekannt als einer der schockierendsten Kultfilme und machte Divine beruehmt?",
        answerA = "Hairspray",
        answerB = "Pink Flamingos",
        answerC = "Polyester",
        answerD = "Serial Mom",
        correctAnswer = 1,
        explanation = "'Pink Flamingos' (1972) von John Waters schockierte mit extremen Szenen und machte Divine zum Kultstar. Der Film ist fuer seine absichtliche Obszoenitaet beruehmt.",
        difficulty = 2,
        funFact = "John Waters beschreibt 'Pink Flamingos' als einen Film, der mit Absicht Grenzen des guten Geschmacks ueberschreiten wollte - und das mit grossem Erfolg als Kultfilm."
    ),

    Question(
        categoryId = 4,
        questionText = "Die Rocky Horror Picture Show ist bekannt fuer welche besondere Kinokultur?",
        answerA = "Das Publikum schlaeft im Kino",
        answerB = "Zuschauer verkleiden sich und spielen die Szenen mit",
        answerC = "Der Film wird nur einmal im Jahr gespielt",
        answerD = "Nur Stammkunden kennen das Ende",
        correctAnswer = 1,
        explanation = "Bei Auffuehrungen der Rocky Horror Picture Show verkleiden sich Zuschauer als Filmfiguren, rezitieren Dialoge mit, werfen Requisiten (Toast, Reis) und spielen Szenen nach.",
        difficulty = 2,
        funFact = "Das interaktive Ritualerlebnis der Rocky Horror Picture Show begann zufallig 1976, als Fans anfingen, den Dialogen zu antworten, und entwickelte sich zu einer Tradition."
    ),

    Question(
        categoryId = 4,
        questionText = "Was definiert einen 'Kultfilm'?",
        answerA = "Ein Film, der viele Oscars gewonnen hat",
        answerB = "Ein Film mit einer kleinen, aber leidenschaftlichen Fangemeinde, oft ausserhalb des Mainstreams",
        answerC = "Ein Film ueber Kulte und Religionen",
        answerD = "Ein Film mit einem Budget ueber 100 Millionen Dollar",
        correctAnswer = 1,
        explanation = "Ein Kultfilm zeichnet sich durch eine kleine, aber intensiv engagierte Fangemeinschaft aus, die oft Aspekte feiert, die der Mainstream ablehnt oder uebersieht.",
        difficulty = 2,
        funFact = "Viele heutige Klassiker wie 'The Big Lebowski' oder 'Fight Club' waren anfangs Kassenflops und wurden erst durch Kultverehrung zu Ikonen."
    ),

    Question(
        categoryId = 4,
        questionText = "David Lynchs Film 'Eraserhead' (1977) ist ein Paradebeispiel fuer welches Genre?",
        answerA = "Romantic Comedy",
        answerB = "Surrealistischen Horrorfilm und Midnight Movie",
        answerC = "Science-Fiction-Blockbuster",
        answerD = "Historisches Drama",
        correctAnswer = 1,
        explanation = "'Eraserhead' ist ein surrealistischer Schwarzweiss-Horrorfilm, der Lynch bekannt machte. Er laeuft seit 1977 ununterbrochen als Midnight Movie.",
        difficulty = 2,
        funFact = "Lynch drehte 'Eraserhead' ueber fuenf Jahre mit minimalem Budget. Viele Freunde finanzierten ihn privat, weil er nicht aufgeben wollte."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Wuxia-Film leitete eine Wiederbelebung des chinesischen Kampfkunstfilm-Genres im Westen ein?",
        answerA = "Hero",
        answerB = "Tiger and Dragon (Crouching Tiger, Hidden Dragon)",
        answerC = "House of Flying Daggers",
        answerD = "The Grandmaster",
        correctAnswer = 1,
        explanation = "'Tiger and Dragon' (2000) gewann vier Oscars und brachte den Wuxia-Film international ins Bewusstsein, was eine Welle ahnlicher Produktionen ausloeste.",
        difficulty = 2,
        funFact = "Vor 'Tiger and Dragon' waren Wuxia-Filme im Westen weitgehend unbekannt. Der Film veraenderte, wie westliche Zuschauer asiatisches Kino wahrnahmen."
    ),

    // ─── WEITERE THEMEN ───────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welches MPAA-Bewertungssystem ersetzte den sogenannten Hays Code in Hollywood?",
        answerA = "Das G/PG/PG-13/R/NC-17-System (seit 1968)",
        answerB = "Das A/B/C-Bewertungssystem (seit 1945)",
        answerC = "Das britische BBFC-System",
        answerD = "Das UN-Medienbewertungssystem",
        correctAnswer = 0,
        explanation = "Der Hays Code (1934-1968) regulierte Hollywoods Inhalte streng. 1968 wurde er durch das MPAA-Ratingsystem mit G, PG, R und X (spaeter NC-17) abgeloest.",
        difficulty = 2,
        funFact = "Der Hays Code verbot u.a. gemischtrassige Liebesbeziehungen, Kritik an Religionen und das Zeigen von Drogenkonsum - allesamt Einschraenkungen, die heute undenkbar waeren."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist ein 'Director's Cut' eines Films?",
        answerA = "Die Kinofassung, die der Regisseur bevorzugt und ohne Studiodruck erstellt hat",
        answerB = "Eine kuerzere Version fuer das Fernsehen",
        answerC = "Die erste Rohschnittversion ohne Musik",
        answerD = "Eine Version nur mit Szenen des Regisseurs",
        correctAnswer = 0,
        explanation = "Ein Director's Cut ist die Version eines Films, die der Regisseur als seine wahre kuenstlerische Vision betrachtet - oft laenger als die Kinofassung, die vom Studio bearbeitet wurde.",
        difficulty = 2,
        funFact = "Ridley Scotts 'Blade Runner: The Final Cut' (2007) ist der einzige, bei dem Scott die volle kuenstlerische Kontrolle hatte. Es gibt insgesamt sieben verschiedene Versionen des Films."
    ),

    Question(
        categoryId = 4,
        questionText = "Auf welchem Stephen-King-Werk basiert der Film 'Stand By Me' (1986)?",
        answerA = "Der Koerper (The Body)",
        answerB = "Die Langoliers",
        answerC = "Apt Pupil",
        answerD = "The Mist",
        correctAnswer = 0,
        explanation = "'Stand By Me' (1986) von Rob Reiner basiert auf Kings Novelle 'The Body' (1982), die im Sammelband 'Different Seasons' erschien.",
        difficulty = 2,
        funFact = "Stephen King veroeffentlicht gelegentlich Werke unter dem Pseudonym Richard Bachman - 'The Running Man' und 'The Long Walk' stammen ebenfalls von ihm unter diesem Namen."
    )

)
