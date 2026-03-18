package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun musicQuestionsHard(): List<Question> = listOf(

    // ── Klassische Musik und Komponisten (10) ───────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welche Symphonie von Johannes Brahms wird als seine 'Dritte' bezeichnet und ist in F-Dur komponiert?",
        answerA = "Symphonie Nr. 2",
        answerB = "Symphonie Nr. 3",
        answerC = "Symphonie Nr. 4",
        answerD = "Symphonie Nr. 1",
        correctAnswer = 1,
        explanation = "Brahms' Symphonie Nr. 3 in F-Dur (op. 90) wurde 1883 uraufgefuehrt. Hans von Buelow nannte sie 'Brahms' Eroica' in Anspielung auf Beethovens gleichnamige Sinfonie.",
        difficulty = 3,
        funFact = "Der dritte Satz dieser Symphonie wurde zum Erkennungsmelodie des Films 'Un homme et une femme' (1966) von Claude Lelouch."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Komponist schrieb die Oper 'Pelleas et Melisande' (1902), ein Meilenstein des musikalischen Impressionismus?",
        answerA = "Gabriel Faure",
        answerB = "Maurice Ravel",
        answerC = "Claude Debussy",
        answerD = "Erik Satie",
        correctAnswer = 2,
        explanation = "Claude Debussy komponierte 'Pelleas et Melisande' zwischen 1893 und 1902. Die Oper basiert auf dem gleichnamigen Schauspiel von Maurice Maeterlinck und gilt als Grundwerk des Impressionismus in der Musik.",
        difficulty = 3,
        funFact = "Debussy arbeitete zehn Jahre an dieser Oper. Sie brach mit der Wagnerischen Tradition und setzte auf subtile Andeutungen statt dramatischer Gesten."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Kompositionstechnik verwendete Hector Berlioz in seiner 'Symphonie fantastique', um eine Person darzustellen?",
        answerA = "Dodekaphonie",
        answerB = "Idee fixe",
        answerC = "Ostinato",
        answerD = "Basso continuo",
        correctAnswer = 1,
        explanation = "Berlioz erfand fuer die Symphonie fantastique (1830) das Konzept der 'Idee fixe': ein wiederkehrendes Melodiemotiv, das die Geliebte des Helden repraesentiert und in jedem der fuenf Saetze transformiert auftaucht.",
        difficulty = 3,
        funFact = "Die Symphonie fantastique gilt als erste explizit programmatische Symphonie der Musikgeschichte. Berlioz veroeffentlichte ein ausfuehrliches Programm, das die Geschichte eines opiumsuechtigen Kuenstlers erzaehlt."
    ),

    Question(
        categoryId = 5,
        questionText = "In welchem Jahr wurde Giuseppe Verdis 'Aida' uraufgefuehrt und wo fand die Urauffuehrung statt?",
        answerA = "1871 in Kairo",
        answerB = "1875 in Mailand",
        answerC = "1868 in Wien",
        answerD = "1879 in Paris",
        correctAnswer = 0,
        explanation = "Aida wurde am 24. Dezember 1871 im Kairoer Opernhaus uraufgefuehrt. Die Oper wurde vom Khediven Ismail Pascha in Auftrag gegeben, um die Eroefffnung des Suezkanals zu feiern.",
        difficulty = 3,
        funFact = "Aufgrund des Deutsch-Franzoesischen Krieges (1870/71) konnten die Kostuemuentwuerfe nicht rechtzeitig aus Paris geliefert werden, weshalb die Mailaender Premiere erst 1872 stattfand."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Begriff beschreibt die kompositorische Technik in Bachs Fugen, bei der das Thema rueckwaerts gespielt wird?",
        answerA = "Inversion",
        answerB = "Augmentation",
        answerC = "Retrograde",
        answerD = "Diminution",
        correctAnswer = 2,
        explanation = "Das Retrograde (auch 'Krebsgang' genannt) bezeichnet das rueckwaertige Spielen eines Themas oder einer Melodie. Bach verwendete diese und andere kontrapunktische Techniken meisterhaft in Werken wie 'Die Kunst der Fuge'.",
        difficulty = 3,
        funFact = "In der Zwoefltonmusik des 20. Jahrhunderts wurden Retrograde, Inversion und Retrograde Inversion systematisch als kompositorische Grundformen eingesetzt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Besonderheit unterscheidet Anton Bruckners Symphonien von denen seiner Zeitgenossen?",
        answerA = "Er verwendete stets genau vier Saetze mit Scherzo an zweiter Stelle",
        answerB = "Er schrieb ausschliesslich ohne Orchestereinleitung",
        answerC = "Er bevorzugte grosse Orchesterbesetzung mit haeufen Generalpausen und monumentalen Steigerungen",
        answerD = "Er integrierte gregorianische Choraele als direkte Zitate in alle Symphonien",
        correctAnswer = 2,
        explanation = "Bruckners Symphonien sind bekannt fuer ihre monumentale Groesse, die sogenannten 'Bruckner-Pausen' (abrupte Generalpausen), die massive Orchesterbesetzung und die kathedralartigen Steigerungen, die seinen katholischen Glauben widerspiegeln.",
        difficulty = 3,
        funFact = "Bruckner ueberarbeitete seine Symphonien immer wieder - teils unter Druck von Freunden und Dirigenten. Es existieren deshalb mehrere Fassungen vieler seiner Werke, was Musikwissenschaftler bis heute beschaeftigt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Instrument stand im Mittelpunkt von Frederic Chopins kompositorischem Schaffen, und welche Form schrieb er bevorzugt?",
        answerA = "Geige; Konzerte und Sonaten",
        answerB = "Klavier; Etuden, Nocturnes, Mazurken und Polonaisen",
        answerC = "Orgel; Fugen und Praeludien",
        answerD = "Cembalo; Suiten und Partiten",
        correctAnswer = 1,
        explanation = "Chopin schrieb fast ausschliesslich fuer Klavier. Seine bedeutendsten Werkgruppen sind die 27 Etuden, 21 Nocturnes, 58 Mazurken und 16 Polonaisen. Er revolutionierte das Klavierspiel durch chromatische Harmonik und singenden Kantilenen.",
        difficulty = 3,
        funFact = "Chopin verliess Polen 1830 endgueltig und lebte bis zu seinem Tod 1849 hauptsaechlich in Paris. Seine Musik ist tief von polnischen Volkstaenzen und der Sehnsucht nach der Heimat gepraeagt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Epoche der Musikgeschichte wird mit dem Begriff 'Ars Nova' bezeichnet?",
        answerA = "Fruehbarock (ca. 1600-1650)",
        answerB = "Spaetes Mittelalter (14. Jahrhundert)",
        answerC = "Fruehrenaissance (15. Jahrhundert)",
        answerD = "Rokoko (18. Jahrhundert)",
        correctAnswer = 1,
        explanation = "Ars Nova bezeichnet einen Musikstil des spaeten Mittelalters (vor allem Frankreich und Italien im 14. Jahrhundert). Hauptvertreter sind Philippe de Vitry und Guillaume de Machaut. Charakteristisch sind komplexere Rhythmik und Mehrstimmigkeit.",
        difficulty = 3,
        funFact = "Der Begriff 'Ars Nova' (Neue Kunst) entstand als Abgrenzung zur 'Ars Antiqua' des 13. Jahrhunderts. Guillaume de Machauts 'Messe de Nostre Dame' (ca. 1365) ist das frueheste erhaltene vielstimmige Messordinariumszyklus eines einzigen Komponisten."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Komponist schrieb die Kammeroper 'The Turn of the Screw' (1954) nach einer Novelle von Henry James?",
        answerA = "Ralph Vaughan Williams",
        answerB = "Michael Tippett",
        answerC = "Benjamin Britten",
        answerD = "William Walton",
        correctAnswer = 2,
        explanation = "Benjamin Britten komponierte 'The Turn of the Screw' op. 54 fuer die Venedig Biennale 1954. Die Kammeroper fuer 13 Instrumente und 6 Saenger ist bekannt fuer ihre Verwendung von 16 Variationen ueber ein Zwoefl-Ton-Thema.",
        difficulty = 3,
        funFact = "Britten gruendete 1948 das Aldeburgh Festival in seinem Heimatort in Suffolk, das bis heute eines der renommiertesten Musikfestivals Grossbritanniens ist."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches harmonische Konzept beschreibt die 'Neapolitanische Sexte' in der klassischen Harmonielehre?",
        answerA = "Ein Dur-Dreiklang auf der erniedrigten zweiten Stufe in der Umkehrung",
        answerB = "Ein verminderter Septakkord auf der siebten Stufe",
        answerC = "Ein uebermaeassiger Sextsakkord auf der vierten Stufe",
        answerD = "Ein Dominantseptakkord ohne Quinte",
        correctAnswer = 0,
        explanation = "Die Neapolitanische Sexte ist ein Dur-Dreiklang auf der erniedrigten zweiten Stufe (bII), der typischerweise in der ersten Umkehrung erscheint. Er wird vor der Dominante eingesetzt und erzeugt einen charakteristischen, schmerzlichen Klang.",
        difficulty = 3,
        funFact = "Der Begriff 'Neapolitanisch' bezieht sich auf die neapolitanische Operntradition des 18. Jahrhunderts, wo dieser Akkord besonders haeufig verwendet wurde, etwa bei Scarlatti und Pergolesi."
    ),

    // ── Jazz-Geschichte (8) ─────────────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welches Miles-Davis-Album gilt als Beginn des 'Modal Jazz' und wurde 1959 veroeffentlicht?",
        answerA = "Bitches Brew",
        answerB = "Kind of Blue",
        answerC = "In a Silent Way",
        answerD = "Milestones",
        correctAnswer = 1,
        explanation = "'Kind of Blue' (1959) ist das meistverkaufte Jazzalbum aller Zeiten. Miles Davis, John Coltrane und Bill Evans verwendeten Skalen (Modi) statt komplexer Akkordfolgen als Improvisationsgrundlage, was den Modalen Jazz begruendete.",
        difficulty = 3,
        funFact = "Das Album wurde in nur zwei Aufnahmesitzungen im Maerz und April 1959 eingespielt. Die meisten Musiker kannten die Stuecke kaum - Davis gab ihnen nur die Skalen kurz vor der Aufnahme."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Klarinettist gilt als 'King of Swing' und brachte Jazz in die Carnegie Hall (1938)?",
        answerA = "Artie Shaw",
        answerB = "Benny Goodman",
        answerC = "Woody Herman",
        answerD = "Jimmy Dorsey",
        correctAnswer = 1,
        explanation = "Benny Goodman veranstaltete am 16. Januar 1938 das erste Jazz-Konzert in der Carnegie Hall New York. Sein Orchester und das Quartett mit Teddy Wilson und Lionel Hampton wurden zum Symbol der Swing-Aera.",
        difficulty = 3,
        funFact = "Das Konzert wurde mitgeschnitten, aber die Aufnahme galt 12 Jahre lang als verloren. 1950 tauchte sie in Goodmans Schrank auf - heute gilt sie als historisches Dokument des Jazz."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Giant Steps Changes' in der Jazztheorie?",
        answerA = "Eine Improvisationstechnik mit sehr schnellen Laeufen ueber chromatische Skalen",
        answerB = "Eine Rhythmus-Technik mit unregelmaessigen Taktwechseln",
        answerC = "Eine Akkordfolge mit Tonartwechseln im Terzabstand, entwickelt von John Coltrane",
        answerD = "Eine Basslinie in grossen Intervallspruengen",
        correctAnswer = 2,
        explanation = "John Coltrane entwickelte auf seinem Album 'Giant Steps' (1960) eine revolutionaere Harmonik: Akkordfolgen mit Tonartwechseln im grossen Terzabstand (Terzsubstitution), die das Tonzentrum staendig verschieben.",
        difficulty = 3,
        funFact = "Die 'Coltrane Changes' (Giant Steps Changes) gelten als eine der harmonisch anspruchsvollsten Progressionen im Jazz. Sie erfordern vom Improvisator extrem schnelles harmonisches Denken."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Jazzlabel, 1939 von Alfred Lion gegruendet, ist fuer seine ikonischen Albumcover und Beitraege zum Hard Bop bekannt?",
        answerA = "Verve Records",
        answerB = "Prestige Records",
        answerC = "Blue Note Records",
        answerD = "Impulse! Records",
        correctAnswer = 2,
        explanation = "Blue Note Records wurde 1939 von Alfred Lion in New York gegruendet. Das Label veroeffentlichte Aufnahmen von Thelonious Monk, Bud Powell, Art Blakey, Horace Silver und vielen anderen. Die Covergestaltung von Reid Miles gilt als kuenstlerischer Meilenstein.",
        difficulty = 3,
        funFact = "Die beruehmten Blue Note Coverfotos wurden groesstenteils von Francis Wolff gemacht, der mit Alfred Lion aus Deutschland emigriert war. Diese Fotografien revolutionierten das Design von Schallplattencovers."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Jazzsaengerin ist bekannt fuer ihre Zusammenarbeit mit Duke Ellington und ihre einzigartige Phrasierung, die sie als 'First Lady of Song' etablierte?",
        answerA = "Billie Holiday",
        answerB = "Nina Simone",
        answerC = "Ella Fitzgerald",
        answerD = "Sarah Vaughan",
        correctAnswer = 2,
        explanation = "Ella Fitzgerald (1917-1996) wurde als 'First Lady of Song' bekannt. Ihre Zusammenarbeit mit Duke Ellington resultierte in dem Album 'Ella Fitzgerald Sings the Duke Ellington Song Book' (1957). Sie war fuer ihre perfekte Intonation und Scat-Faehigkeiten beruehmt.",
        difficulty = 3,
        funFact = "Ella Fitzgeralds Karriere begann 1934 mit einem Auftritt beim Amateur-Wettbewerb im Apollo Theater Harlem. Sie hatte urspruenglich geplant zu tanzen, entschied sich dann aber zu singen - und gewann."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Jazzbassist revolutionierte das Bassspiel durch seinen Walking-Bass-Stil und seine Zusammenarbeit mit Charlie Parker?",
        answerA = "Charles Mingus",
        answerB = "Paul Chambers",
        answerC = "Oscar Pettiford",
        answerD = "Ray Brown",
        correctAnswer = 3,
        explanation = "Ray Brown (1926-2002) gilt als einer der groessten Jazzbassisten aller Zeiten. Er war mit Oscar Peterson im Trio und begleitete Charlie Parker, Dizzy Gillespie und fast jeden bedeutenden Jazzkuenstler. Sein melodischer Walking-Bass-Stil ist stilbildend.",
        difficulty = 3,
        funFact = "Ray Brown war von 1948 bis 1952 mit Ella Fitzgerald verheiratet. Trotz der Trennung blieben sie beruflich verbunden - er begleitete sie haeufig bei Auftritten und Aufnahmen."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Musikrichtung entstand Anfang der 1970er Jahre als Fusion von Jazz und Funk, und welcher Kuenstler praegte sie massgeblich?",
        answerA = "Cool Jazz; Chet Baker",
        answerB = "Free Jazz; Ornette Coleman",
        answerC = "Jazz Fusion; Herbie Hancock und Weather Report",
        answerD = "Bebop; Charlie Parker",
        correctAnswer = 2,
        explanation = "Jazz Fusion entstand Ende der 1960er/Anfang der 1970er Jahre durch die Verbindung von Jazz-Harmonik und -Improvisation mit den Rhythmen und Elektronik-Instrumenten des Rock und Funk. Herbie Hancock, Weather Report (Joe Zawinul, Wayne Shorter) und Return to Forever praegte diesen Stil.",
        difficulty = 3,
        funFact = "Miles Davis' Album 'Bitches Brew' (1970) gilt als Geburtsstunde des Jazz-Rock-Fusion. Die Aufnahmen mit elektrischen Instrumenten und Studiotechnik schockierten viele Jazzpuristen."
    ),

    Question(
        categoryId = 5,
        questionText = "In welcher Stadt entstanden in den 1920ern die fruehen Dixieland-Aufnahmen, und welche Band gilt als erste, die Jazz kommerziell aufnahm?",
        answerA = "New Orleans; King Oliver's Creole Jazz Band",
        answerB = "Chicago; Original Dixieland Jass Band",
        answerC = "New York; Paul Whiteman Orchestra",
        answerD = "New Orleans; Jelly Roll Morton and His Red Hot Peppers",
        correctAnswer = 1,
        explanation = "Die Original Dixieland Jass Band nahm 1917 in New York die ersten kommerziellen Jazzplatten auf. Obwohl die Band aus New Orleans stammte, fanden die Aufnahmen in New York statt. Das Stueck 'Livery Stable Blues' war die erste Jazzeinspielung.",
        difficulty = 3,
        funFact = "Die urspruengliche Schreibweise war 'Jass', nicht 'Jazz'. Die Band aenderte sie spaeter, weil Vandalen das 'J' von ihren Plakaten abkratzten, um ein obszoenesWort zu erzeugen."
    ),

    // ── Progressive Rock und Art Rock (7) ──────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welches Konzeptalbum von Pink Floyd aus dem Jahr 1979 erzaehlt die Geschichte des Rockstars 'Pink' und seiner psychischen Isolation?",
        answerA = "Wish You Were Here",
        answerB = "Animals",
        answerC = "The Wall",
        answerD = "The Final Cut",
        correctAnswer = 2,
        explanation = "'The Wall' (1979) von Pink Floyd ist ein Doppelalbum und Konzeptwerk ueber den fiktiven Rockstar Pink, der sich hinter einer mentalen Mauer einschliesst. Roger Waters schrieb das Werk nach einem Vorfall, bei dem er einen Fan beim Konzert anspuckte.",
        difficulty = 3,
        funFact = "Der Film 'The Wall' (1982) wurde von Alan Parker verfilmt mit Bob Geldof in der Hauptrolle. Die Buehnenshows hatten eine riesige echte Mauer, die waehrend des Konzerts gebaut und am Ende eingerissen wurde."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Band veroeffentlichte 1973 das Album 'Brain Salad Surgery' mit dem beruehemten Stueck 'Karn Evil 9'?",
        answerA = "Yes",
        answerB = "Emerson, Lake & Palmer",
        answerC = "Genesis",
        answerD = "King Crimson",
        correctAnswer = 1,
        explanation = "Emerson, Lake & Palmer (ELP) veroeffentlichten 'Brain Salad Surgery' 1973. 'Karn Evil 9' ist ein drei-teiliges Epos, das Greg Lake als 'Welcome back my friends to the show that never ends' besingt. Keith Emerson spielte Moog-Synthesizer und Orgel.",
        difficulty = 3,
        funFact = "Das Albumcover von 'Brain Salad Surgery' wurde von H.R. Giger gestaltet, dem Schweizer Kuenstler, der spaeter fuer die Alien-Filmreihe den legendaeren Alien-Organismus entwarf."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Gitarrist ist bekannt als Gruender von King Crimson und praegte den Progressive Rock mit komplexen Kompositionsstrukturen?",
        answerA = "Steve Howe",
        answerB = "Robert Fripp",
        answerC = "Steve Hackett",
        answerD = "Alan Holdsworth",
        correctAnswer = 1,
        explanation = "Robert Fripp gruendete King Crimson 1969. Sein Album '21st Century Schizoid Man' eroeffnete die Prog-Rock-Aera. Fripp ist bekannt fuer seine mathematisch praezise Gitarrentechnik, Einsatz von Loops ('Frippertronics') und staendige Bandumbesetzungen.",
        difficulty = 3,
        funFact = "Robert Fripp entwickelte eine eigene Gitarrenstimmung, die 'New Standard Tuning' (C-G-D-A-E-G), die eine Quinte hoeher als normal liegt und andere harmonische Moeglichkeiten eroeffnet."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Studioalbum der Band Yes (1973) gilt als Hochpunkt des Progressive Rock und besteht aus nur zwei Stuecken ueber je eine Plattenseite?",
        answerA = "Close to the Edge",
        answerB = "Tales from Topographic Oceans",
        answerC = "Fragile",
        answerD = "Going for the One",
        correctAnswer = 1,
        explanation = "'Tales from Topographic Oceans' (1973) ist ein Doppelalbum mit vier Stuecken, je eines pro Seite, inspiriert von Jon Andersons Lektuere von Shastric scriptures. Das Album war kommerziell erfolgreich, aber kritisch umstritten und fuehrte zum Austritt von Rick Wakeman.",
        difficulty = 3,
        funFact = "Rick Wakeman ass waehrend der langen Proben auf der Buehne Fisch und Chips, um seinen Unmut ueber die ausufernde Natur des Projekts auszudruecken. Er verliess Yes nach dem Album."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche deutsche Band der 1970er wird als 'Kosmische Kuriere' bezeichnet und verbindet experimentellen Rock mit elektronischen Klaengen und Weltmusik?",
        answerA = "Can",
        answerB = "Amon Duul II",
        answerC = "Faust",
        answerD = "Ash Ra Tempel",
        correctAnswer = 0,
        explanation = "Can (1968 in Koeln gegruendet) ist eine der einflussreichsten Bands des Krautrock. Mit Saenger Damo Suzuki entwickelten sie einen transzendenten Stil aus Improvisation, ethnischen Rhythmen und Elektronik, der spaetere Bands wie LCD Soundsystem und Radiohead massgeblich beeinflusste.",
        difficulty = 3,
        funFact = "Can nahm viele seiner Alben in einer selbst gebauten Werkstatt auf. Das Album 'Tago Mago' (1971) wird regelmaessig in Bestenlisten der experimentellen Rockmusik ganz oben gefuehrt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Werk von Frank Zappa aus dem Jahr 1966 gilt als eines der ersten konzeptionellen Rockalben und traegt das Motto 'Art is making something out of nothing and selling it'?",
        answerA = "Apostrophe",
        answerB = "Hot Rats",
        answerC = "Freak Out!",
        answerD = "We're Only in It for the Money",
        correctAnswer = 2,
        explanation = "'Freak Out!' (1966) war das Debuetalbum der Mothers of Invention und eines der ersten Doppelalben im Rock. Es enthielt Satire, avantgardistische Komposition und Elemente der Konkreten Musik und gilt als fruehes Konzeptalbum.",
        difficulty = 3,
        funFact = "'Freak Out!' erschien nur wenige Monate nach dem Beatles-Album 'Revolver'. Paul McCartney zitierte 'Freak Out!' spaeter als eine der Inspirationen fuer 'Sgt. Pepper's Lonely Hearts Club Band'."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche musikalische Technik ist charakteristisch fuer Steve Reich und Philip Glass als Vertreter des Minimalismus in der Rocknaehe?",
        answerA = "Atonale Freie Improvisation",
        answerB = "Phasenverschiebung von identischen melodischen Mustern (Phase Music)",
        answerC = "Einsatz von Zwoefl-Ton-Reihen in der Popularmusik",
        answerD = "Chromatische Satztechnik im Kontrapunkt",
        correctAnswer = 1,
        explanation = "Steve Reich entwickelte die 'Phase Music': Zwei identische Tonbandschleifen oder Musiker starten synchron, aber einer laeut geringfuegig schneller, sodass die Muster sich verschieben. Stuecke wie 'Piano Phase' (1967) und 'Drumming' (1971) sind Musterbeispiele.",
        difficulty = 3,
        funFact = "Steve Reich entdeckte die Phasentechnik zunaechst durch einen Fehler: Er lief zwei Bandschleifen parallel ab und bemerkte, dass die minimale Geschwindigkeitsdifferenz faszinierende Klangteppiche erzeugt."
    ),

    // ── Hip-Hop/Rap-Geschichte (7) ──────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welche Party im August 1973 gilt gemeinhin als Geburtstunde des Hip-Hop, und wer war der DJ?",
        answerA = "DJ Kool Herc, Bronx, New York",
        answerB = "Grandmaster Flash, Harlem, New York",
        answerC = "Afrika Bambaataa, Queens, New York",
        answerD = "DJ Hollywood, Manhattan, New York",
        correctAnswer = 0,
        explanation = "Am 11. August 1973 veranstaltete DJ Kool Herc (Clive Campbell) in der Sedgwick Avenue 1520 in der Bronx eine Geburtstagsparty fuer seine Schwester. Er entwickelte dabei die Breakbeat-Technik: Er isolierte die Schlagzeugpassagen (Breaks) von Funkplatten.",
        difficulty = 3,
        funFact = "Das Gebaeude Sedgwick Avenue 1520, wo die Geburtsstunde des Hip-Hop stattfand, wurde 2007 als offizielles New Yorker Kulturerbe anerkannt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Album von Nas (1994) gilt als Meilenstein des East Coast Hip-Hop und war das Debuetwerk des Rappers?",
        answerA = "Stillmatic",
        answerB = "It Was Written",
        answerC = "Illmatic",
        answerD = "I Am...",
        correctAnswer = 2,
        explanation = "'Illmatic' (1994) ist das Debuetalbum von Nas. Es wurde in nur neun Tracks produziert von DJ Premier, Large Professor, Q-Tip und Pete Rock. Es gilt als eines der besten Hip-Hop-Alben aller Zeiten wegen seiner dichten lyrischen Qualitaet und seiner Schilderung des Lebens in Queensbridge.",
        difficulty = 3,
        funFact = "Nas war erst 20 Jahre alt, als 'Illmatic' erschien. Das Album besteht aus nur 39 Minuten Musik auf neun Tracks - jeder Track gilt als meisterhaft und es gibt kaum Fuellmaterial."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Produktions-Duo praegte den Detroit-Sound in der Hip-Hop-Produktion der 1990er und war massgeblich an Eminems Karriere beteiligt?",
        answerA = "The Neptunes (Pharrell Williams & Chad Hugo)",
        answerB = "Dr. Dre & DJ Quik",
        answerC = "Timbaland & Missy Elliott",
        answerD = "Dr. Dre & Scott Storch",
        correctAnswer = 0,
        explanation = "Dr. Dre produzierte Eminems Debuet 'The Slim Shady LP' (1999) sowie '8 Mile' und viele weitere Alben. Er praegte mit seinem 'G-Funk'-Sound die West Coast-Aera und entdeckte auch Snoop Dogg und 50 Cent.",
        difficulty = 3,
        funFact = "Dr. Dre arbeitet seit Jahrzehnten an einem Album namens 'Detox', das als legendaer verzoegsert gilt. Nach dem Super Bowl Halftime Show 2022 erklaerte er es als de facto fertig, ohne es offiziell zu veroeffentlichen."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet das Konzept 'Boom Bap' in der Hip-Hop-Produktion?",
        answerA = "Ein Sprechgesangsstil mit schnellen Reimen ueber elektronische Beats",
        answerB = "Ein Drumcomputer-Sound mit betontem Kick (Boom) und Snare (Bap), typisch fuer East Coast Hip-Hop der 90er",
        answerC = "Eine Aufnahmetechnik mit Live-Orchester und Rap-Gesang",
        answerD = "Ein DJ-Stil mit schnellen Plattenwechseln und Scratching",
        correctAnswer = 1,
        explanation = "Boom Bap bezeichnet den charakteristischen Sound des East Coast Hip-Hop der fruehen 1990er: ein trockener, harter Kick-Drum-Sound (Boom) kombiniert mit einem scharfen Snare (Bap), oft von Drumcomputern wie der Roland TR-808 oder SP-1200 erzeugt.",
        difficulty = 3,
        funFact = "Der Begriff 'Boom Bap' wurde populaer durch KRS-One vom Boogie Down Productions. Das Equipment von Producer Pete Rock, DJ Premier und Large Professor definierte diesen Sound."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Hip-Hop-Gruppe aus dem Oughties gilt als Wegbereiter des 'Southern Rap' und des 'Crunk'-Styles?",
        answerA = "Outkast und Lil Jon",
        answerB = "Three 6 Mafia und T.I.",
        answerC = "UGK und Scarface",
        answerD = "Goodie Mob und Ludacris",
        correctAnswer = 0,
        explanation = "Outkast aus Atlanta verband Southern Soul, Funk und Hip-Hop mit lyrischer Tiefe. Lil Jon praegte Crunk (hyper-energetischen Party-Rap) mit Chants und verzerrten Synthesizern. Beide Stile kamen aus Georgia und definierten den Southern Rap.",
        difficulty = 3,
        funFact = "Outkasts Album 'Speakerboxxx/The Love Below' (2003) wurde als Doppelalbum veroeffentlicht, bei dem Andre 3000 und Big Boi jeweils ein eigenes Album produzierten. Es gewann den Grammy als Album des Jahres."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Rap-Label, gegruendet von Suge Knight und Dr. Dre 1991, praegte den West Coast Hip-Hop und war Heimat von Tupac Shakur?",
        answerA = "Bad Boy Records",
        answerB = "Death Row Records",
        answerC = "Ruthless Records",
        answerD = "Interscope Records",
        correctAnswer = 1,
        explanation = "Death Row Records wurde 1991 von Suge Knight und Dr. Dre gegruendet. Das Label veroeffentlichte Alben von Snoop Dogg, Tupac Shakur und Dr. Dre. Der Konflikt zwischen Death Row (West Coast) und Bad Boy Records (East Coast) praeegte einen der groe testen Rap-Rivalitaeten der Geschichte.",
        difficulty = 3,
        funFact = "Tupac Shakur unterschrieb bei Death Row Records, waehrend er im Gefaengnis sass. Suge Knight zahlte seine Kaution von 1,4 Millionen Dollar. Tupac wurde 1996 nach einem Konzert in Las Vegas erschossen."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches technische Element unterscheidet das 'Sampling' im Hip-Hop rechtlich von anderen Musikzitaten?",
        answerA = "Sampling ist immer urheberrechtsfrei, da es Volkskunst ist",
        answerB = "Die direkte Verwendung einer Originalaufnahme, die Master-Rights und Kompositions-Rights erfordert",
        answerC = "Sampling ist nur bis zu 3 Sekunden erlaubt ohne Lizenz",
        answerD = "Sampling erfordert nur die Genehmigung des Sonderns, nicht des Plattenlabels",
        correctAnswer = 1,
        explanation = "Beim Sampling wird ein Stueck einer Originalaufnahme direkt verwendet. Dafuer benoetigt man zwei Lizenzen: die Masterrechte (vom Plattenlabel fuer die Aufnahme) und die Kompositionsrechte (vom Verlag fuer den Song). Das fuehrte zu vielen Prozessen in der Hip-Hop-Geschichte.",
        difficulty = 3,
        funFact = "Der wegweisende Rechtsstreit 'Biz Markie vs. Gilbert O'Sullivan' (1991) veraenderte die Hip-Hop-Industrie fundamental: Danach mussten alle Samples lizenziert werden, was die Produktionskosten dramatisch erhoehte."
    ),

    // ── Elektronische Musik (6) ─────────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welcher Franzose gilt als Pionieer der 'Musique Concrete' und gruendete 1958 das GRM (Groupe de Recherches Musicales)?",
        answerA = "Edgard Varese",
        answerB = "Iannis Xenakis",
        answerC = "Pierre Schaeffer",
        answerD = "Pierre Henry",
        correctAnswer = 2,
        explanation = "Pierre Schaeffer entwickelte ab 1948 beim franzoesischen Rundfunk die 'Musique Concrete': Komposition aus aufgezeichneten Alltagsklaengen. Er gruendete 1958 das GRM und praegte die elektroakustische Musik grundlegend. Sein Hauptwerk ist 'Etude aux chemins de fer' (1948).",
        difficulty = 3,
        funFact = "Pierre Schaeffer distanzierte sich spaeter von der von ihm erfundenen Musique Concrete und erklaerte, er habe 'sein Leben verschwendet'. Er hielt Musik, die er selbst erschaffen hatte, fuer unhoerbar."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Synthesizer-Modell von Robert Moog (1970) war der erste kommerziell erhaltliche Miniaturmoog und revolutionierte die Popmusik?",
        answerA = "Minimoog Model D",
        answerB = "ARP Odyssey",
        answerC = "Buchla 100",
        answerD = "EMS VCS3",
        correctAnswer = 0,
        explanation = "Der Minimoog Model D (1970) war der erste tragbare, bezahlbare Synthesizer ohne Patch-Kabel. Er hatte einen einzigen Keyboard-Split, drei Oszillatoren und ein legendaeres Filter. Bands wie Yes, ELP, Tangerine Dream und spaeter Herbie Hancock nutzten ihn.",
        difficulty = 3,
        funFact = "Robert Moog hat den Synthesizer nicht erfunden (das tat Theremin), aber er perfektionierte ihn kommerziell. Das Moog-Filter (Tiefpassfilter mit Resonanz) ist bis heute eines der begehrtesten Klangelemente in der elektronischen Musik."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Sidechain-Kompression' in der elektronischen Tanzmusik?",
        answerA = "Eine Equalizer-Kurve, die bestimmte Frequenzen absenkt",
        answerB = "Ein Hall-Effekt, der an Seitenspuren des Mischpults angelegt wird",
        answerC = "Eine Kompressor-Technik, bei der ein Signal ein anderes Signal aussteuert und den typischen 'Pumping'-Effekt erzeugt",
        answerD = "Eine Panorama-Technik, die den Sound im Stereobild bewegt",
        correctAnswer = 2,
        explanation = "Sidechain-Kompression bedeutet: Ein Komressor-Gate reagiert nicht auf das Eingangssignal selbst, sondern auf ein externes Triggersignal. In der Techno/House-Musik wird die Bassdrum als Trigger verwendet, um den Bass 'wegzuducken' - das erzeugt den charakteristischen Pumping-Sound.",
        difficulty = 3,
        funFact = "Daft Punk machte Sidechain-Kompression mit 'One More Time' (2000) weltbekannt. Der starke 'Pump'-Effekt auf den Vocals ist ein bewusster, ikonischer Klanggestaltung, kein Fehler."
    ),

    Question(
        categoryId = 5,
        questionText = "In welchem Jahr und von wem wurde die Roland TR-808 Drum Machine veroeffentlicht, die Hip-Hop und Electronic Music praegte?",
        answerA = "1976, Korg",
        answerB = "1980, Roland",
        answerC = "1985, Linn Electronics",
        answerD = "1978, Sequential Circuits",
        correctAnswer = 1,
        explanation = "Roland veroeffentlichte die TR-808 (Transistor Rhythm 808) im Jahr 1980. Sie war wegen ihrer analogen Transistorschaltungen unpraeezise im Vergleich zu echten Schlagzeugen, aber genau das machte ihren besonderen Klang aus. Sie wurde zum Rueckgrat von Hip-Hop, Techno und Electronic Music.",
        difficulty = 3,
        funFact = "Die TR-808 war bei Erscheinen ein kommerzieller Misserfolg und wurde bereits 1983 eingestellt. Erst durch die Hip-Hop-Community in den 1980ern wurde sie iconic. Heute kosten gut erhaltene Exemplare mehrere tausend Euro."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher deutsche Club gilt als die weltweit bekannteste Techno-Location und formte seit seiner Eroefffnung 2004 die globale Clubkultur?",
        answerA = "Tresor Berlin",
        answerB = "Berghain Berlin",
        answerC = "Warehouse Chicago",
        answerD = "E-Werk Berlin",
        correctAnswer = 1,
        explanation = "Das Berghain (eroeffnet 2004 in einem Heizkraftwerk in Berlin-Friedrichshain) gilt als ein global anerkannter Tempel der elektronischen Musik und Clubkultur. Seine strenge Tuerauswahl, die 24-Stunden-Partys und seine Panobar machten es weltberuehmt.",
        difficulty = 3,
        funFact = "Das Berghain gewann 2016 einen wichtigen deutschen Steuerprozess: Das Gericht erkannte Techno-Konzerte als Kunst an, was den Steuersatz von 19% auf 7% (ermaeassigter Kunstsatz) reduzierte."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Konzept beschreibt 'Hauntology' in der elektronischen Musik, wie es von Mark Fisher und dem Label Ghost Box gepraegt wurde?",
        answerA = "Musik, die elektronische Geisterklange durch Rauschen und Stoerungen erzeugt",
        answerB = "Ein Stil, der vergangene Klangestiken der Zukunft revoziert - wie BBC Radiophonic Workshop der 1960er",
        answerC = "Eine Methode der spektralen Analyse zum Entfernen von Artefakten",
        answerD = "Eine DJ-Technik mit eingespielten Horror-Samples",
        correctAnswer = 1,
        explanation = "Hauntology (nach Derridas 'Spektrologie') bezeichnet in der Musik Werke, die nostalgisch auf vergangene Visionen der Zukunft zurueckblicken - insbesondere BBC Radiophonic Workshop, Bibliotheque-Muzak und kosmische Zukunftsklang der 60er/70er. Ghost Box Records veroeffentlicht Musik in diesem Geiste.",
        difficulty = 3,
        funFact = "Mark Fisher praegte den Begriff 'Capitalist Realism' und war einflussreich im Bereich Popkulturtheorie. Er schrieb ausfuehrlich ueber Hauntology in seiner Essaysammlung 'Ghosts of My Life' (2014)."
    ),

    // ── Musiktheorie fortgeschritten (6) ────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet die 'Kreuzrhythmik' (Cross-Rhythm) in der Musiktheorie?",
        answerA = "Das gleichzeitige Spielen in zwei verschiedenen Tempi",
        answerB = "Das simultane Ueberlagern zweier Rhythmen, die eine unterschiedliche Anzahl von Zaehleiten teilen und sich periodisch zusammenfuegen",
        answerC = "Ein Rhythmus, der im gesamten Stueck unveraendert bleibt",
        answerD = "Das Wechseln des Taktmasses zwischen den Instrumenten",
        correctAnswer = 1,
        explanation = "Kreuzrhythmik bezeichnet die simultane Verwendung kontraaerender Rhythmussysteme - z.B. 3-gegen-2 oder 4-gegen-3 - wobei beide Systeme unterschiedliche Referenzpunkte haben und sich erst nach mehreren Takten wieder synchronisieren.",
        difficulty = 3,
        funFact = "Kreuzrhythmik ist ein fundamentales Element der west- und zentralafrikanischen Musik, wurde ins Jazz-Piano uebertragen (z.B. Thelonious Monk) und ist die Grundlage vieler polyrhythmischer Kompositionen von Ligeti und Messiaen."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man unter einem 'Ton-Cluster' (Cluster) in der modernen Musik?",
        answerA = "Eine Gruppe von Noten in derselben Stimme, die gleichzeitig mit der Handflaechegespielt werden",
        answerB = "Ein dichtes Zusammenspiel mehrerer Instrumente ohne Pausen",
        answerC = "Eine Gruppe von eng beieinanderliegenden Toenen, die simultan gespielt werden und einen dissonanten Block bilden",
        answerD = "Ein Pizzicato-Akkord mit allen vier Streicher-Instrumenten",
        correctAnswer = 2,
        explanation = "Ein Ton-Cluster (oder Tone Cluster) ist eine Gruppe von eng aneinanderliegenden Toenen (Halbton- oder Ganztonabstaende), die simultan gespielt werden. Henry Cowell entwickelte diese Technik frueh, spaeter nutzten sie Ligeti, Penderecki und andere Komponisten der Neuen Musik.",
        difficulty = 3,
        funFact = "Henry Cowell spielte Cluster bereits in den 1910er Jahren, indem er seinen Unterarm auf die Klaviertasten legte. Der empörte Pianist Josef Hofmann drohte mit einer Klage, was die Technik bekannt machte."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet die 'Lydische Tonleiter' und durch welches Intervall unterscheidet sie sich von der Durtonleiter?",
        answerA = "Sie hat eine erniedrigte siebte Stufe",
        answerB = "Sie hat eine erhohte vierte Stufe (Tritonus zur Grundlage)",
        answerC = "Sie hat eine erniedrigte dritte Stufe",
        answerD = "Sie hat eine erhohte fuenfte Stufe",
        correctAnswer = 1,
        explanation = "Die Lydische Tonleiter ist ein Kirchenmodus (der vierte Modi) mit einer erhoehten vierten Stufe. Verglichen mit einer Durtonleiter hat sie statt der reinen Quarte eine uebermassige Quarte (Tritonus). Das verleiht ihr einen hellen, schwebenden Charakter.",
        difficulty = 3,
        funFact = "Film-Komponist John Williams und Joe Satriani verwenden haeufig Lydische Harmonik. Das Intro von 'Flying in a Blue Dream' und Teile der 'E.T.'-Filmmusik klingen 'magisch' wegen des Lydischen Modus."
    ),

    Question(
        categoryId = 5,
        questionText = "Wie viele moegliche Transpositionen hat eine symmetrische Skala (z.B. die Ganztonleiter) im Vergleich zu einer Durtonleiter?",
        answerA = "12, wie alle anderen Skalen",
        answerB = "Nur 2 eindeutige Transpositionen (die Ganztonleiter)",
        answerC = "6 eindeutige Transpositionen",
        answerD = "3 eindeutige Transpositionen",
        correctAnswer = 1,
        explanation = "Die Ganztonleiter hat aufgrund ihrer perfekten Symmetrie nur 2 eindeutige Transpositionen: C-D-E-Fis-Gis-Ais und Cis-Dis-F-G-A-H. Alle anderen Transpositionen ergeben dieselben Toene. Messiaen bezeichnete Skalen mit begrenzter Transposierbarkeit als 'modes a transpositions limitees'.",
        difficulty = 3,
        funFact = "Olivier Messiaen systematisierte in seinem Buch 'Technique de mon langage musical' (1944) sieben solcher symmetrischen Skalen. Die verminderter Skala (abwechselnd Halb- und Ganzton) hat 3 eindeutige Transpositionen."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Phänomen beschreibt das 'Shepard-Risset-Glissando' in der Psychoakustik?",
        answerA = "Eine Tonhoehe, die sich scheinbar endlos aufwaerts bewegt ohne jemals zu enden",
        answerB = "Ein Vibrato mit zunehmender Geschwindigkeit",
        answerC = "Ein Crescendo, das lauter klingt als physikalisch moeglich",
        answerD = "Einen Akkord, der scheinbar dissonanter wird ohne Notenveraenderung",
        correctAnswer = 0,
        explanation = "Das Shepard-Risset-Glissando ist eine akustische Taeuschung: Mehrere Toene in verschiedenen Oktaven bewegen sich gleichzeitig aufwaerts, wobei die hohen Toene leiser werden und neue tiefe Toene eingeblendet werden. Das Ergebnis ist ein scheinbar endlos steigender Ton.",
        difficulty = 3,
        funFact = "Christopher Nolan verwendete das Shepard-Risset-Glissando im Film 'Dunkirk' (2017): Komponist Hans Zimmer setzte es ein, um eine stetig steigende Spannung zu erzeugen, die sich nie entlaedt."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet 'Just Intonation' im Gegensatz zur gleichstufigen Temperatur?",
        answerA = "Eine Stimmung, bei der alle Intervalle auf exakten Frequenzverhaeltnissen basieren, wodurch Kammertoe rein klingen, aber modulationsunfaehig sind",
        answerB = "Eine Stimmung, die alle 12 Halbtoene gleichmaessig verteilt",
        answerC = "Eine Stimmung, die auf mittelalterlichen Kirchenmodi basiert",
        answerD = "Eine elektronisch generierte Stimmung ohne akustische Verweise",
        correctAnswer = 0,
        explanation = "'Just Intonation' verwendet einfache ganzzahlige Frequenzverhaeltnisse (z.B. 3:2 fuer die Quinte, 5:4 fuer die Terz). Akkorde klingen dadurch 'rein' und schwebungsfrei. Der Nachteil: In anderen Tonarten klingen manche Intervalle falsch, weshalb die gleichstufige Temperatur erfunden wurde.",
        difficulty = 3,
        funFact = "Die Barbershop-Quartett-Tradition verwendet instinktiv Just Intonation. Saenger passen ihre Stimmung unbewusst an, wodurch charakteristische 'Ring'-Obertone entstehen, die bei gleichstufiger Stimmung nicht auftreten."
    ),

    // ── Weltmusik und traditionelle Musik (6) ───────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welches indische Rhythmussystem bezeichnet 'Tala' und welche der genannten Talas hat 16 Schlaege?",
        answerA = "Tala ist die Melodiestruktur; Teentaal hat 16 Schlaege",
        answerB = "Tala ist der Rhythmuszyklus der klassischen indischen Musik; Teentaal (Teen Taal) hat 16 Schlaege",
        answerC = "Tala ist die Stimmung der Instrumente; Jhaptal hat 16 Schlaege",
        answerD = "Tala bezeichnet das Tempo; Rupak Taal hat 16 Schlaege",
        correctAnswer = 1,
        explanation = "Tala ist der Rhythmuszyklus der klassischen indischen Musik, gespielt auf der Tabla. Teentaal (Teen Taal) ist der verbreitetste Tala mit 16 Matraas (Schlaegen) in vier Gruppen zu je vier. Er wird bei den meisten Khayal-Gesaengen und Instrumentalvortraegen verwendet.",
        difficulty = 3,
        funFact = "Zakir Hussain, Sohn des legendaeren Tabla-Meisters Alla Rakha, ist weltweit als Virtuose bekannt. Er spielte mit John McLaughlin in der Band Shakti und brachte Tabla-Spiel in die Westliche Popkultur."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Musikform aus dem Arabischen bezeichnet eine improvisierte modale Einfuehrung, die die Stimmung (Maqam) einstellt?",
        answerA = "Muwashshah",
        answerB = "Taqasim",
        answerC = "Zajal",
        answerD = "Qasida",
        correctAnswer = 1,
        explanation = "Taqasim (Singular: Taqsim) bezeichnet in der arabischen, tuerken und persischen Musik eine solo-improvisierte Einfuehring ohne Rhythmus. Der Musiker stellt den Maqam (Tonmodus) vor und entwickelt die charakteristischen Phrasen und Ornamente des Modus.",
        difficulty = 3,
        funFact = "Im tuerkischen Makam-System gibt es ueber 200 Makams (Tonmodi). Jeder Makam hat nicht nur spezifische Toene, sondern auch Regeln fuer typische Phrasen, bevorzugte Stimmung des Tages und emotionale Assoziationen."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Streichinstrument ist das zentrale Melodieinstrument in der klassischen persischen Musik und verwendet Sympathiersaiten?",
        answerA = "Sitar",
        answerB = "Sarangi",
        answerC = "Kamanche",
        answerD = "Tar",
        correctAnswer = 2,
        explanation = "Die Kamanche (auch Kamancha) ist ein Spike-Fiddle mit einem runden Klangkoerper aus Kalebasse oder Holz. Sie wird vertikal gehalten. Im Gegensatz zur Sitar ist sie ein Bogeninstrument und hat in der persischen und aserbaidschanischen Musik eine zentrale Stellung.",
        difficulty = 3,
        funFact = "Die Kamanche wurde 2017 von der UNESCO in die Liste des immateriellen Kulturerbes der Menschheit aufgenommen - sowohl in der iranischen als auch in der aserbaidschanischen Tradition."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet 'Mbube' in der suedafrikanischen Vokalmusik, und welcher internationale Hit entstand daraus?",
        answerA = "Ein Chorgesangsstil der Zulu; aus dem Stueck 'Mbube' (1939) entstand 'The Lion Sleeps Tonight'",
        answerB = "Ein Perkussionsstil der Xhosa; entstand 'Wimoweh'",
        answerC = "Ein ritueller Tanz der Sotho; aus dem Stueck entstand 'Shosholoza'",
        answerD = "Ein Klagegesang; entstand 'Nkosi Sikelel' iAfrika'",
        correctAnswer = 0,
        explanation = "Mbube ist ein a-cappella-Chorgesangsstil der Zulu-Tradition. Solomon Linda schrieb 1939 den Song 'Mbube' (Loewe). Dieser wurde in den USA als 'Wimoweh' gecovert und wurde 1961 zu 'The Lion Sleeps Tonight'. Das Urheberrecht an der Melodie war Gegenstand jahrelanger Rechtsstreitigkeiten.",
        difficulty = 3,
        funFact = "Solomon Linda erhielt zu Lebzeiten kaum Vergütung fuer 'Mbube'. Erst 2006, nach einem Rechtsstreit seiner Familie, wurden postum erhebliche Rueckzahlungen von Royalties vereinbart - nach seinem Tod 1962."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Musikform aus Brasilien entstand in den 1950er Jahren als Fusion von Samba und US-amerikanischem Cool Jazz?",
        answerA = "Axe",
        answerB = "Forro",
        answerC = "Bossa Nova",
        answerD = "Baile Funk",
        correctAnswer = 2,
        explanation = "Bossa Nova entstand Ende der 1950er Jahre in Rio de Janeiro als Verbindung von Samba-Harmonik und -Rhythmus mit der Gelassenheit des West Coast Jazz. Joao Gilberto, Tom Jobim und Vinicius de Moraes sind die Hauptvertreter. 'Garota de Ipanema' (1964) ist der bekannteste Bossa Nova-Song.",
        difficulty = 3,
        funFact = "Die Aufnahme von 'The Girl from Ipanema' (Garota de Ipanema) mit Astrud Gilberto und Stan Getz gewann 1964 den Grammy als Record of the Year - die einzige fremdsprachige Aufnahme, die diese Auszeichnung erhalten hat."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Spieltechnik ist charakteristisch fuer die georgische mehrstimmige Volksmusik (Polyphonie) und unterscheidet sie von westeuropaeischer Mehrstimmigkeit?",
        answerA = "Sie verwendet ausschliesslich Quintparallelen statt Terz- oder Sextenharmonik",
        answerB = "Sie basiert auf drei gleichberechtigten Stimmlinien mit unabhaengiger Melodiefuehrung und Einbeziehung von Sekund-Dissonanzen als Stilmittel",
        answerC = "Sie folgt dem westeuropaeischen Generalbass-Prinzip mit Dissonanzaufloesungen",
        answerD = "Sie verwendet ausschliesslich pentatonische Skalen ohne Halbtoene",
        correctAnswer = 1,
        explanation = "Die georgische Volksmusik-Polyphonie basiert auf drei unabhaengigen, gleichberechtigten Stimmen ohne feste harmonische Hierarchie. Charakteristisch sind Sekundreibungen als positives Klangziel (nicht aufzuloesende Dissonanz) und das Fehlen westlicher Kadenzformeln.",
        difficulty = 3,
        funFact = "Die georgische mehrstimmige Gesangstradition wurde 2001 von der UNESCO als eines der ersten zehn Meisterwerke des muendlichen und immateriellen Erbes der Menschheit proklamiert."
    )
)
