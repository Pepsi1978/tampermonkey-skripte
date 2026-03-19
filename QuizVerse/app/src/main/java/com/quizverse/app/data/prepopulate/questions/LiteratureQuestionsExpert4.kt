package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun literatureQuestionsExpert4(): List<Question> = listOf(

    // Question 1 — Musil: Kakanien
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welchem Roman bezeichnet Robert Musil Österreich-Ungarn ironisch als 'Kakanien', abgeleitet von der Abkürzung 'k. u. k.'?",
        answerA = "Der Mann ohne Eigenschaften",
        answerB = "Die Verwirrungen des Zöglings Törleß",
        answerC = "Drei Frauen",
        answerD = "Vereinigungen",
        correctAnswer = 0,
        explanation = "In 'Der Mann ohne Eigenschaften' (1930/32) prägt Musil den Begriff 'Kakanien' für das k. u. k. Österreich-Ungarn — eine ironische Allegorie auf den hohlen Prunk der untergehenden Monarchie.",
        difficulty = 4,
        funFact = "Das Wort 'Kakanien' leitet sich von 'k. k.' (kaiserlich-königlich) ab, klingt aber auch nach dem deutschen Kinderwort 'Kaka' — ein bewusster Spott Musils."
    ),

    // Question 2 — Musil: Möglichkeitssinn
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welches philosophische Konzept stellt Musils Protagonist Ulrich in 'Der Mann ohne Eigenschaften' dem 'Wirklichkeitssinn' entgegen?",
        answerA = "Utopismus",
        answerB = "Möglichkeitssinn",
        answerC = "Essayismus",
        answerD = "Irrationalism",
        correctAnswer = 1,
        explanation = "Ulrich definiert den 'Möglichkeitssinn' als die Fähigkeit, alles zu denken, was ebensogut sein könnte — er nimmt das Nicht-Existierende genauso ernst wie das Bestehende.",
        difficulty = 4,
        funFact = "Musil arbeitete über 20 Jahre an dem Roman, der Fragment blieb. Er gilt trotzdem als einer der größten Romane des 20. Jahrhunderts."
    ),

    // Question 3 — Musil: Parallelaktion
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Wie heißt das satirisch geschilderte gesellschaftliche Großprojekt im ersten Band von Musils 'Der Mann ohne Eigenschaften', an dem Ulrich mitarbeiten soll?",
        answerA = "Die Friedenskonferenz",
        answerB = "Das Jubiläumsfest",
        answerC = "Die Parallelaktion",
        answerD = "Die Weltausstellung",
        correctAnswer = 2,
        explanation = "Die 'Parallelaktion' soll zum 70. Regierungsjubiläum Kaiser Franz Josephs I. eine große österreichische Idee entwickeln — sie scheitert an ihrer eigenen Inhaltsleere.",
        difficulty = 4,
        funFact = "Die Parallelaktion ist Musils Satire auf das Habsburger Repräsentationswesen und die Unfähigkeit der Monarchie, sich selbst zu erneuern."
    ),

    // Question 4 — Broch: Schlafwandler-Trilogie
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Wie lauten die drei Teiltitel von Hermann Brochs Romantrilogie 'Die Schlafwandler' (1930–1932)?",
        answerA = "Pasenow, Esch, Huguenau",
        answerB = "Romantiker, Anarchist, Sachlichkeit",
        answerC = "1888, 1903, 1918",
        answerD = "Pasenow oder die Romantik — Esch oder die Anarchie — Huguenau oder die Sachlichkeit",
        correctAnswer = 3,
        explanation = "Die drei Bände heißen 'Pasenow oder die Romantik' (1888), 'Esch oder die Anarchie' (1903) und 'Huguenau oder die Sachlichkeit' (1918) — jeder Titel benennt eine Epoche des Wertzerfalls.",
        difficulty = 4,
        funFact = "Broch wollte mit der Trilogie zeigen, wie der schrittweise Verfall gesellschaftlicher Werte zum Ersten Weltkrieg führte."
    ),

    // Question 5 — Broch: Der Tod des Vergil
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welchen Entschluss fasst Vergil in Brochs Roman 'Der Tod des Vergil' (1945) kurz vor seinem Tod, den Kaiser Augustus verhindern muss?",
        answerA = "Die Aeneis zu verbrennen",
        answerB = "Die Aeneis zu veröffentlichen",
        answerC = "Rom zu verlassen",
        answerD = "Sich zu taufen",
        correctAnswer = 0,
        explanation = "Vergil will die Aeneis verbrennen, weil er das Werk als unvollkommen und als Instrument der Herrschaftslegitimation betrachtet. Augustus überredet ihn, das Manuskript zu übergeben.",
        difficulty = 4,
        funFact = "Broch schrieb den Roman in der NS-Haft nach seiner Verhaftung 1938 — das Werk entstand als lyrisch-essayistischer Monolog auf über 500 Seiten."
    ),

    // Question 6 — Canetti: Die Blendung
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wie lautet der Beruf des Protagonisten Peter Kien in Elias Canettis Roman 'Die Blendung' (1935)?",
        answerA = "Archivar",
        answerB = "Sinologe mit Privatbibliothek",
        answerC = "Universitätsprofessor für Germanistik",
        answerD = "Buchdrucker",
        correctAnswer = 1,
        explanation = "Peter Kien ist ein weltbekannter Sinologe, der sich in seiner riesigen Privatbibliothek eingeschlossen hat und jeden Kontakt zur Außenwelt meidet.",
        difficulty = 4,
        funFact = "Canetti plante ursprünglich einen Romanzyklus mit acht Teilen, von dem nur 'Die Blendung' fertiggestellt wurde."
    ),

    // Question 7 — Canetti: Masse und Macht
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschien Elias Canettis wissenschaftliches Hauptwerk 'Masse und Macht', an dem er über 30 Jahre arbeitete?",
        answerA = "1945",
        answerB = "1955",
        answerC = "1960",
        answerD = "1973",
        correctAnswer = 2,
        explanation = "'Masse und Macht' erschien 1960 und analysiert die Psychologie von Massen und die Mechanismen der Macht — ein interdisziplinäres Werk aus Anthropologie, Psychologie und Literatur.",
        difficulty = 4,
        funFact = "Canetti erhielt 1981 den Nobelpreis für Literatur, unter anderem für 'Masse und Macht' — obwohl das Werk damals noch kaum akademische Resonanz gefunden hatte."
    ),

    // Question 8 — Canetti: Nobelpreis-Begründung
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Für welche Werke und Qualitäten erhielt Elias Canetti 1981 den Nobelpreis für Literatur?",
        answerA = "Für 'Die Blendung' als bestes europäisches Prosawerk",
        answerB = "Für 'Masse und Macht' als Beitrag zur Sozialwissenschaft",
        answerC = "Für sein Gesamtwerk auf Deutsch als Nicht-Muttersprachler",
        answerD = "Für Werke, die von breitem Horizont, einem Reichtum an Ideen und künstlerischer Kraft geprägt sind",
        correctAnswer = 3,
        explanation = "Die Schwedische Akademie würdigte Canetti für 'Werke, die von breitem Horizont, einem Reichtum an Ideen und künstlerischer Kraft geprägt sind' — besonders 'Die Blendung' und 'Masse und Macht'.",
        difficulty = 4,
        funFact = "Canetti wurde in Bulgarien geboren, wuchs mehrsprachig auf (Ladino, Deutsch, Englisch, Bulgarisch) und wählte Deutsch als Literatursprache."
    ),

    // Question 9 — Handke: Publikumsbeschimpfung
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wann und wo wurde Peter Handkes 'Publikumsbeschimpfung' uraufgeführt?",
        answerA = "1966 in Frankfurt am Main, Regie: Claus Peymann",
        answerB = "1968 in Wien, Regie: Peter Zadek",
        answerC = "1965 in Berlin, Regie: Peter Brook",
        answerD = "1970 in Düsseldorf, Regie: Hans Neuenfels",
        correctAnswer = 0,
        explanation = "Die Uraufführung fand am 8. Juni 1966 in Frankfurt am Main im Theater am Turm unter der Regie von Claus Peymann statt — Handkes Durchbruch als Dramatiker.",
        difficulty = 4,
        funFact = "Handke nannte das Stück einen 'verbalen Rockkonzert' — Rhythmus und Sound spielen eine größere Rolle als traditionelle dramatische Handlung."
    ),

    // Question 10 — Handke: Sprechstücke
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Was kennzeichnet Handkes Konzept der 'Sprechstücke', zu denen auch 'Publikumsbeschimpfung' gehört?",
        answerA = "Sie haben keine Sprecher, nur Geräusche",
        answerB = "Es gibt keine Handlung, Figuren oder Kulissen — nur Sprache als Ereignis",
        answerC = "Sie sind ausschließlich für Radio konzipiert",
        answerD = "Die Schauspieler improvisieren den gesamten Text",
        correctAnswer = 1,
        explanation = "Sprechstücke verzichten bewusst auf dramatische Handlung, Figuren, Kulissen und Kostüme — die Sprache selbst wird zum theatralen Ereignis und reflektiert auf sich selbst.",
        difficulty = 4,
        funFact = "Mit den Sprechstücken revolutionierte Handke das deutschsprachige Theater der 1960er-Jahre und stellte die Grundlagen des Illusionstheaters radikal in Frage."
    ),

    // Question 11 — Handke: Nobelpreis-Kontroverse
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Warum war Peter Handkes Nobelpreis für Literatur 2019 besonders umstritten?",
        answerA = "Wegen seiner Kritik an der schwedischen Akademie",
        answerB = "Wegen seiner Ablehnung der Preissumme",
        answerC = "Wegen seiner Äußerungen zum Jugoslawienkrieg und der Teilnahme an Miloševićs Begräbnis",
        answerD = "Wegen eines Plagiatsvorwurfs",
        correctAnswer = 2,
        explanation = "Handke wurde vorgeworfen, serbische Kriegsverbrechen in Bosnien verharmlost zu haben. Sein Auftritt bei Miloševićs Begräbnis 2006 und seine Schriften wurden als Parteinahme für Serbien gewertet.",
        difficulty = 4,
        funFact = "Mehrere Jurymitglieder der Schwedischen Akademie traten aus Protest gegen die Vergabe des Preises an Handke zurück."
    ),

    // Question 12 — Jelinek: Die Klavierspielerin
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche Hauptthemen verhandelt Elfriede Jelineks Roman 'Die Klavierspielerin' (1983)?",
        answerA = "Aufstieg und Fall einer Musikerkarriere",
        answerB = "Der österreichische Antisemitismus der Nachkriegszeit",
        answerC = "Die Emanzipation der Frau durch klassische Musik",
        answerD = "Mutter-Tochter-Kontrolle, sexuelle Unterdrückung und Sadomasochismus",
        correctAnswer = 3,
        explanation = "Der Roman zeigt die zerstörerische Mutter-Tochter-Beziehung zwischen der herrschsüchtigen Mutter und Erika Kohut, deren sexuelle Deformation durch lebenslanges Kontrollieren und die Verdrängung jeglicher Triebe entsteht.",
        difficulty = 4,
        funFact = "Michael Haneke verfilmte den Roman 2001 mit Isabelle Huppert in der Hauptrolle — der Film gewann in Cannes drei Preise."
    ),

    // Question 13 — Jelinek: Nobelpreis 2004
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wie lautete die offizielle Begründung der Schwedischen Akademie für Jelineks Nobelpreis 2004?",
        answerA = "Für den musikalischen Fluss von Stimmen und Gegenstimmen in Romanen und Dramen, die mit sprachlichem Eifer die Absurdität gesellschaftlicher Klischees enthüllen",
        answerB = "Für ihren Beitrag zur feministischen Literatur Österreichs",
        answerC = "Für ihre Kritik an Faschismus und Nationalsozialismus",
        answerD = "Für die Verbindung von Musik und Sprache in ihren Werken",
        correctAnswer = 0,
        explanation = "Die Akademie würdigte 'den musikalischen Fluss von Stimmen und Gegenstimmen in Romanen und Dramen, die mit außergewöhnlichem sprachlichem Eifer die Absurdität gesellschaftlicher Klischees und ihre unterwerfende Macht enthüllen'.",
        difficulty = 4,
        funFact = "Jelinek nahm den Preis nicht persönlich entgegen — sie schickte eine Videobotschaft und begründete es mit ihrer sozialen Phobie."
    ),

    // Question 14 — Jelinek: Lust
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Was ist das zentrale Thema von Elfriede Jelineks Roman 'Lust' (1989)?",
        answerA = "Die Befreiung der weiblichen Sexualität",
        answerB = "Sexuelle Gewalt als Grundmuster patriarchalischer Kultur",
        answerC = "Die Pornographieindustrie in Österreich",
        answerD = "Liebe und Ehe in der Arbeiterklasse",
        correctAnswer = 1,
        explanation = "'Lust' beschreibt sexuelle Gewalt als strukturelles Merkmal der bürgerlichen Gesellschaft — Jelinek kritisiert die Pornographisierung des weiblichen Körpers als Grundmuster unserer Zivilisation.",
        difficulty = 4,
        funFact = "Der Roman wurde wegen seiner expliziten Sprache als Pornographie kritisiert — Jelinek wollte damit absichtlich zeigen, wie Pornographie funktioniert, um sie zu entlarven."
    ),

    // Question 15 — Bachmann: Malina
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Was ist 'Malina' (1971) im Kontext von Ingeborg Bachmanns geplantem Großprojekt 'Todesarten'?",
        answerA = "Der abschließende Band des Zyklus",
        answerB = "Ein eigenständiger Roman ohne Bezug zur Reihe",
        answerC = "Der erste und einzige vollendete Roman des geplanten Todesarten-Zyklus",
        answerD = "Eine überarbeitete Fassung ihrer Frankfurter Vorlesungen",
        correctAnswer = 2,
        explanation = "'Malina' sollte die Ouvertüre zum 'Todesarten'-Zyklus sein, der den Tod von Frauen in der patriarchalischen Gesellschaft thematisieren sollte. Es blieb der einzige vollendete Roman, da Bachmann 1973 starb.",
        difficulty = 4,
        funFact = "Bachmann starb 1973 unter ungeklärten Umständen in Rom nach einem Zimmerbrand — sie war 47 Jahre alt."
    ),

    // Question 16 — Bachmann: Frankfurter Vorlesungen
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr hielt Ingeborg Bachmann ihre berühmten Frankfurter Vorlesungen zur Poetik, und wie lautete ihr Thema?",
        answerA = "1955, über die Lyrik der Moderne",
        answerB = "1963, über den Todesarten-Zyklus",
        answerC = "1957, über die Rolle der Dichterin im Exil",
        answerD = "1959/60, über Fragen zeitgenössischer Dichtung",
        correctAnswer = 3,
        explanation = "Bachmann hielt 1959/60 die Frankfurter Vorlesungen unter dem Titel 'Fragen zeitgenössischer Dichtung' — sie wurden zu den einflussreichsten Poetik-Vorlesungen der deutschen Nachkriegsliteratur.",
        difficulty = 4,
        funFact = "Die Frankfurter Poetikvorlesungen wurden erst 1969 inauguriert — Bachmanns Gastprofessur war eine ihrer Vorgängerinnen."
    ),

    // Question 17 — Bachmann: Gruppe 47
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Ingeborg Bachmann gewann 1953 den Preis der Gruppe 47 — für welches Werk?",
        answerA = "Für ihre Gedichte, darunter 'Die gestundete Zeit'",
        answerB = "Für den Roman 'Malina'",
        answerC = "Für das Hörspiel 'Der gute Gott von Manhattan'",
        answerD = "Für die Erzählung 'Das dreißigste Jahr'",
        correctAnswer = 0,
        explanation = "Bachmann las bei der Tagung der Gruppe 47 Gedichte aus 'Die gestundete Zeit' und gewann damit den begehrten Preis der literarischen Vereinigung.",
        difficulty = 4,
        funFact = "Der Preisträger erhielt damals 1.000 DM — für Bachmann war es der Durchbruch in die literarische Öffentlichkeit."
    ),

    // Question 18 — Celan: Todesfuge
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welche zwei Frauenfiguren stehen im Gedicht 'Todesfuge' von Paul Celan als symbolische Gegensätze?",
        answerA = "Rahel und Lea",
        answerB = "Margarete und Sulamith",
        answerC = "Maria und Eva",
        answerD = "Miriam und Judith",
        correctAnswer = 1,
        explanation = "Margarete (goldenes Haar) symbolisiert das deutsche Kulturgut, Sulamith (aschenes Haar) das jüdische Volk — zusammen verkörpern sie den Widerspruch zwischen Schönheit der deutschen Kultur und dem Holocaust.",
        difficulty = 4,
        funFact = "Celan schrieb 'Todesfuge' um 1945, kurz nach dem Tod seiner Eltern in deutschen Vernichtungslagern. Das Gedicht wurde zunächst auf Rumänisch veröffentlicht."
    ),

    // Question 19 — Celan: Meridian-Rede
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Bei welchem Anlass hielt Paul Celan 1960 seine berühmte poetologische 'Meridian'-Rede?",
        answerA = "Bei der Verleihung des Nobelpreises in Stockholm",
        answerB = "Beim Kongress des PEN-Zentrums in Frankfurt",
        answerC = "Bei der Entgegennahme des Georg-Büchner-Preises in Darmstadt",
        answerD = "Bei der Eröffnung der Frankfurter Buchmesse",
        correctAnswer = 2,
        explanation = "Celan hielt 'Der Meridian' als Dankesrede bei der Verleihung des Georg-Büchner-Preises am 22. Oktober 1960 in Darmstadt — sie gilt als sein wichtigstes poetologisches Dokument.",
        difficulty = 4,
        funFact = "In der Meridian-Rede entwickelt Celan sein Konzept des Gedichts als 'Flaschenpost' — geworfen in die Hoffnung, an einem Ufer anzukommen, das vielleicht ein Herzland ist."
    ),

    // Question 20 — Celan: Sprachgitter
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welches Merkmal kennzeichnet den Gedichtband 'Sprachgitter' (1959) von Paul Celan im Vergleich zu 'Mohn und Gedächtnis'?",
        answerA = "Mehr Reimschemata und traditionelle Formen",
        answerB = "Stärkere Anlehnung an die romantische Lyrik",
        answerC = "Ausschließlich politische Themen",
        answerD = "Zunehmende Hermetik, Ellipsen und Schweigen als poetisches Mittel",
        correctAnswer = 3,
        explanation = "'Sprachgitter' markiert Celans Wendung zur zunehmend hermetischen Sprache: Pausen, Auslassungen und das Verstummen selbst werden zum poetischen Ausdruck des Unsagbaren nach dem Holocaust.",
        difficulty = 4,
        funFact = "Das titelgebende Gedicht 'Sprachgitter' bezieht sich auf die Gitter von Sprechzimmern in Klöstern — eine Metapher für die Barriere zwischen Ich und Du."
    ),

    // Question 21 — Bernhard: Auslöschung
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Was plant der Protagonist Franz-Josef Murau in Thomas Bernhards Roman 'Auslöschung' (1986) mit dem Familiengut Wolfsegg?",
        answerA = "Es der Jüdischen Gemeinde Wien zu überschreiben",
        answerB = "Es abzubrennen",
        answerC = "Es in ein Kunstmuseum umzuwandeln",
        answerD = "Es zu verkaufen und nach Rom zu fliehen",
        correctAnswer = 0,
        explanation = "Murau entscheidet sich am Ende, das geerbte Gut Wolfsegg der Jüdischen Gemeinde Wien zu überschreiben — eine Geste der Wiedergutmachung für die NS-Verstrickung seiner Familie.",
        difficulty = 4,
        funFact = "Bernhards letzter Roman ist sein umfangreichstes Prosawerk und gilt als sein Opus Magnum — eine radikale Abrechnung mit Österreich und seiner Familiengeschichte."
    ),

    // Question 22 — Bernhard: Heldenplatz
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welches historische Ereignis bildet den Hintergrund für Thomas Bernhards Theaterstück 'Heldenplatz' (1988)?",
        answerA = "Das Ende der Habsburger Monarchie 1918",
        answerB = "Der 50. Jahrestag des Anschlusses Österreichs an Nazi-Deutschland 1938",
        answerC = "Die Wiedereröffnung des Wiener Burgtheaters nach dem Zweiten Weltkrieg",
        answerD = "Die Studentenrevolte von 1968 in Wien",
        correctAnswer = 1,
        explanation = "Bernhard schrieb 'Heldenplatz' für den 100. Geburtstag des Burgtheaters und den 50. Jahrestag des Anschlusses 1938 — das Stück rechnet schonungslos mit dem österreichischen Antisemitismus ab.",
        difficulty = 4,
        funFact = "Noch vor der Uraufführung löste das Stück einen Skandal aus: Politiker forderten ein Aufführungsverbot, Bernhard wurde als Nestbeschmutzer beschimpft."
    ),

    // Question 23 — Bernhard: Alte Meister
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "In welchem Wiener Museum spielt Thomas Bernhards Roman 'Alte Meister. Komödie' (1985), und welches Gemälde ist Zentrum des Geschehens?",
        answerA = "Im Belvedere, vor Klimts 'Der Kuss'",
        answerB = "Im Albertina, vor einem Dürer-Aquarell",
        answerC = "Im Kunsthistorischen Museum, vor Tintorettos 'Weißbärtigem Mann'",
        answerD = "Im Leopold Museum, vor einem Schiele-Selbstbildnis",
        correctAnswer = 2,
        explanation = "Reger sitzt seit 30 Jahren jeden zweiten Tag im Kunsthistorischen Museum auf derselben Bank vor Tintorettos 'Weißbärtigem Mann' — eine Fixierung, die Bernhard als absurde Kunstbesessenheit seziert.",
        difficulty = 4,
        funFact = "Bernhard selbst besuchte das Kunsthistorische Museum regelmäßig — die Fixierung auf einzelne Werke war eine persönliche Gewohnheit."
    ),

    // Question 24 — Bernhard: Frost
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschien Thomas Bernhards Debütroman 'Frost', und was ist das zentrale Motiv?",
        answerA = "1957, Motiv: die Einsamkeit eines Bergbauers",
        answerB = "1965, Motiv: der Verfall einer bürgerlichen Familie",
        answerC = "1960, Motiv: Sprache als Überlebensmittel",
        answerD = "1963, Motiv: physischer und geistiger Verfall, Kälte als Lebensmetapher",
        correctAnswer = 3,
        explanation = "'Frost' erschien 1963 und etabliert sofort Bernhards Kernthemen: körperlichen und geistigen Verfall, radikale Einsamkeit und die Kälte als allgegenwärtige Metapher für die menschliche Existenz.",
        difficulty = 4,
        funFact = "Bernhard schrieb 'Frost' nach einem längeren Aufenthalt im Lungensanatorium — eigene Krankheitserfahrungen prägten das Werk entscheidend."
    ),

    // Question 25 — Sebald: Austerlitz
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Was ist das Grundthema von W.G. Sebalds Roman 'Austerlitz' (2001)?",
        answerA = "Die Suche eines Kindertransport-Überlebenden nach seiner verlorenen jüdischen Identität und seinen ermordeten Eltern",
        answerB = "Die Architektur des 19. Jahrhunderts als Ausdruck kolonialer Macht",
        answerC = "Das Leben eines englischen Architekten im Zweiten Weltkrieg",
        answerD = "Die Entstehung des modernen Belgiens",
        correctAnswer = 0,
        explanation = "Jacques Austerlitz erfährt als Erwachsener, dass er als Kind auf einem Kindertransport aus dem besetzten Prag nach Wales gebracht wurde — er sucht nach seinen jüdischen Eltern und seiner ausgelöschten Vergangenheit.",
        difficulty = 4,
        funFact = "Sebald starb 2001, kurz nach Erscheinen des Romans, bei einem Autounfall — 'Austerlitz' war sein letztes Prosawerk."
    ),

    // Question 26 — Sebald: Die Ringe des Saturn
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welches strukturelle Prinzip organisiert W.G. Sebalds 'Die Ringe des Saturn' (1995)?",
        answerA = "Eine chronologische Biographie des Erzählers",
        answerB = "Eine Wanderung durch Suffolk als Rahmen für assoziativ verknüpfte Erinnerungen und historische Exkurse",
        answerC = "Ein Briefroman zwischen zwei Intellektuellen",
        answerD = "Eine Folge unverbundener Kurzgeschichten",
        correctAnswer = 1,
        explanation = "Der Erzähler wandert durch die englische Grafschaft Suffolk — jede Begegnung, jeder Ort löst Assoziationsketten aus, die in die Geschichte von Kolonialismus, Vernichtung und Vergänglichkeit führen.",
        difficulty = 4,
        funFact = "Sebald integrierte in seine Texte Schwarzweißfotos ohne Bildunterschriften — ein charakteristisches Stilmerkmal, das Fiktion und Dokumentation ununterscheidbar vermischt."
    ),

    // Question 27 — Sebald: Fotografie
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welche Funktion haben die eingestreuten Schwarzweißfotografien in Sebalds Prosatexten?",
        answerA = "Sie belegen historische Fakten als Fußnoten",
        answerB = "Sie ersetzen die Handlung in stummen Passagen",
        answerC = "Sie destabilisieren die Grenze zwischen Fiktion und Dokument und erzeugen eine melancholische Authentizitätssimulation",
        answerD = "Sie stammen ausschließlich aus Sebalds eigenem Fotoalbum",
        correctAnswer = 2,
        explanation = "Die Fotografien — oft unscharf, kontextlos, schwer datierbar — suggerieren Dokumentarität, sind aber häufig nicht eindeutig verifizierbar. Sie verkörpern Sebalds Poetik des Gedächtnisses und des Vergessens.",
        difficulty = 4,
        funFact = "Sebald ließ für seine Bücher gezielt Fotos von zweifelhafter Herkunft recherchieren oder leicht verfremden — die Grenze zum Fälschung war bewusst fließend."
    ),

    // Question 28 — Sebald: Schwindel. Gefühle
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche literarischen Figuren treten in Sebalds erstem Prosawerk 'Schwindel. Gefühle.' (1990) als historische Reisebegleiter auf?",
        answerA = "Thomas Mann und Joseph Conrad",
        answerB = "Rilke und Hofmannsthal",
        answerC = "Goethe und Schiller",
        answerD = "Stendhal und Franz Kafka",
        correctAnswer = 3,
        explanation = "Der erste Teil folgt Stendhal auf seinen Feldzügen durch Italien, der dritte Teil nimmt Kafka als Doppelgänger des Erzählers auf einer Reise in Norditalien — reale Biographien und Fiktion verschmelzen.",
        difficulty = 4,
        funFact = "Sebald lebte seit 1970 in England und lehrte Germanistik an der University of East Anglia — sein Werk wurde zuerst auf Englisch und dann erst auf Deutsch bekannt."
    ),

    // Question 29 — Musil: Törleß
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Was ist das zentrale Thema von Robert Musils Debütroman 'Die Verwirrungen des Zöglings Törleß' (1906)?",
        answerA = "Sadismus, Macht und das Scheitern rationaler Erklärung in einer Militärschule",
        answerB = "Die Liebesgeschichte eines Kadetten",
        answerC = "Antikriegsproteste in Österreich-Ungarn",
        answerD = "Die politische Korruption im Habsburger Offizierskorps",
        correctAnswer = 0,
        explanation = "Törleß beobachtet in einem Kadetteninstitut sadistische Mitschüler, die einen schwächeren Schüler quälen — er versucht, das Böse rational zu erklären, und scheitert daran.",
        difficulty = 4,
        funFact = "Der Roman gilt als literarische Vorwegnahme des Faschismus und wurde 1966 von Volker Schlöndorff verfilmt."
    ),

    // Question 30 — Broch: Wertverlust-Konzept
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welchen Begriff prägte Hermann Broch für den zentralen Prozess in seiner 'Schlafwandler'-Trilogie?",
        answerA = "Dekadenz",
        answerB = "Wertzerfall",
        answerC = "Nihilismus",
        answerD = "Entfremdung",
        correctAnswer = 1,
        explanation = "Broch entwickelt das Konzept des 'Wertzerfalls' — der schrittweise Verlust verbindlicher Wertesysteme seit dem 19. Jahrhundert, der in der Fragmentierung der Moderne und schließlich im Faschismus mündet.",
        difficulty = 4,
        funFact = "Broch war von Beruf Textilingenieur, bevor er mit 42 Jahren begann, Philosophie zu studieren und zu schreiben."
    ),

    // Question 31 — Bachmann: Gedicht 'Die gestundete Zeit'
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welche zentrale Metapher prägt Ingeborg Bachmanns Gedicht 'Die gestundete Zeit' (1953)?",
        answerA = "Das Feuer als Bild der Leidenschaft",
        answerB = "Das Meer als Bild der Unendlichkeit",
        answerC = "Die Sanduhr als Bild der auf Raten geliehenen Zeit und nahenden Vernichtung",
        answerD = "Der Spiegel als Bild des falschen Bewusstseins",
        correctAnswer = 2,
        explanation = "Das Gedicht beschwört eine auf Pump lebende Zeit — 'Härter Tage kommen' — und verdichtet das Bewusstsein der Endlichkeit durch das Bild von Hunden, die nachts den Sand wühlen, als metaphysische Bedrohung.",
        difficulty = 4,
        funFact = "Das Eröffnungsgedicht des gleichnamigen Bandes wurde von Bachmann selbst als programmatisch für ihre Lyrik betrachtet."
    ),

    // Question 32 — Celan: Biographie
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welcher Stadt starb Paul Celan 1970, und auf welche Weise?",
        answerA = "In Wien, an einer Krankheit",
        answerB = "In Berlin, bei einem Unfall",
        answerC = "In Bukarest, unter ungeklärten Umständen",
        answerD = "In Paris, durch Ertrinken in der Seine",
        correctAnswer = 3,
        explanation = "Celan ertrank in der Nacht zum 20. April 1970 in der Seine in Paris — vermutlich Suizid nach jahrelangem Kampf gegen Depressionen und Verfolgungsangst.",
        difficulty = 4,
        funFact = "Celan war geprägt von der Verfolgung seiner Eltern durch die Nazis — seine Mutter wurde erschossen, sein Vater starb im Lager. Diese Traumata prägten sein gesamtes Werk."
    ),

    // Question 33 — Handke: Kaspar
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welches Thema steht im Mittelpunkt von Peter Handkes Theaterstück 'Kaspar' (1968)?",
        answerA = "Die Unterwerfung des Individuums durch Sprache und gesellschaftliche Normierung",
        answerB = "Das Leben des historischen Kaspar Hauser im 19. Jahrhundert",
        answerC = "Die Sprachlosigkeit als Folge von Kriegstrauma",
        answerD = "Die Entstehung von Sprache in der Kindheit",
        correctAnswer = 0,
        explanation = "'Kaspar' zeigt, wie Sprache nicht befreit, sondern normiert und unterwirft — das Sprechen macht aus dem sprach- und identitätslosen Kaspar ein konformes, angepasstes Gesellschaftswesen.",
        difficulty = 4,
        funFact = "Das Stück ist eines der meistaufgeführten deutschsprachigen Theaterstücke des 20. Jahrhunderts und begründete Handkes internationalen Ruf als Theatererneuerer."
    ),

    // Question 34 — Jelinek: Die Ausgesperrten
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Auf welchem realen Kriminalfall basiert Elfriede Jelineks Roman 'Die Ausgesperrten' (1980)?",
        answerA = "Dem Wiener Ringstraßenbomber der 1970er-Jahre",
        answerB = "Dem Wiener Familienmorddrama des 19-jährigen Werner Kniesek 1965",
        answerC = "Dem Raubmord eines Gymnasiasten in Graz 1972",
        answerD = "Dem Kindsmord-Prozess von Linz 1961",
        correctAnswer = 1,
        explanation = "'Die Ausgesperrten' basiert auf dem Fall des 19-jährigen Werner Kniesek, der 1965 seine Familie ermordete — Jelinek nutzt diesen Fall, um die verdrängten faschistischen Strukturen in österreichischen Nachkriegsfamilien zu sezieren.",
        difficulty = 4,
        funFact = "Jelinek zeigt, wie der unverarbeitete Nationalsozialismus in den Familien der Täter als Gewalt an der nächsten Generation weiterlebt."
    ),

    // Question 35 — Bernhard: Holzfällen
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Was löste Thomas Bernhards Roman 'Holzfällen. Eine Erregung' (1984) unmittelbar nach seinem Erscheinen aus?",
        answerA = "Eine Anfrage des Kultusministeriums wegen Obszönität",
        answerB = "Den Rücktritt des österreichischen Kulturministers",
        answerC = "Eine Klage und Beschlagnahme des Buches wegen Erkennbarkeit realer Personen",
        answerD = "Einen Boykott österreichischer Buchhandlungen",
        correctAnswer = 2,
        explanation = "Der mit Bernhard befreundete Bildhauer Gerhard Lampersberg erkannte sich in einer Figur wieder und klagte — das Buch wurde beschlagnahmt, erst nach einem Vergleich wieder freigegeben.",
        difficulty = 4,
        funFact = "Bernhard nahm nach dem Vorfall den Lampersberg 30 Jahre lang nicht mehr in seiner Nähe."
    ),

    // Question 36 — Musil: Essayismus
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Wie bezeichnet Musils Erzählprinzip in 'Der Mann ohne Eigenschaften', bei dem Reflexion und Handlung untrennbar verflochten sind?",
        answerA = "Dokumentarismus",
        answerB = "Impressionismus",
        answerC = "Nouveau Roman",
        answerD = "Essayismus",
        correctAnswer = 3,
        explanation = "Musils Essayismus meint, dass Narration und philosophische Reflexion gleichwertig nebeneinanderstehen — die Handlung ist nur der Vorwand für ausgedehnte gedankliche Erkundungen.",
        difficulty = 4,
        funFact = "Musil sah den Essay als die eigentlich zeitgemäße Literaturform: Er liefert keine Lösungen, sondern erkundet Möglichkeiten."
    ),

    // Question 37 — Canetti: Autobiographie
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wie lautet der erste Band von Elias Canettis dreibändiger Autobiographie, der 1977 erschien?",
        answerA = "Die gerettete Zunge. Geschichte einer Jugend",
        answerB = "Das Augenspiel. Lebensgeschichte 1931–1937",
        answerC = "Die Fackel im Ohr. Lebensgeschichte 1921–1931",
        answerD = "Masse und Gedächtnis",
        correctAnswer = 0,
        explanation = "'Die gerettete Zunge' (1977) schildert Canettis Kindheit und Jugend in Rustschuk, Manchester, Wien und Zürich — der Titel bezieht sich auf die Rettung der deutschen Sprache als Muttersprache durch die Mutter.",
        difficulty = 4,
        funFact = "Canettis Muttersprache war Ladino (jüdisch-spanisch) — Deutsch lernte er durch die Mutter, die es ihm beibrachte, als er sieben war."
    ),

    // Question 38 — Bachmann: Malina-Ende
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wie endet Ingeborg Bachmanns Roman 'Malina' auf symbolischer Ebene?",
        answerA = "Die Ich-Erzählerin heiratet Malina",
        answerB = "Die Ich-Erzählerin verschwindet in einer Wand — als Sinnbild ihrer Auslöschung durch den Mann",
        answerC = "Malina verlässt Wien und die Erzählerin bleibt allein",
        answerD = "Die Erzählerin erinnert sich an den Tod ihres Vaters",
        correctAnswer = 1,
        explanation = "Am Ende des Romans verschwindet die weibliche Ich-Erzählerin buchstäblich in einer Wand — ein surreales Bild für die Vernichtung des weiblichen Subjekts durch die patriarchalische Gesellschaft.",
        difficulty = 4,
        funFact = "Malina ist in der Forschung auch als alter Ego des weiblichen Ichs interpretiert worden — eine gespaltene Persönlichkeit, die am Ende die männliche Seite dominiert."
    ),

    // Question 39 — Celan: Nelly Sachs
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Wer erhielt gemeinsam mit Nelly Sachs 1966 den Nobelpreis für Literatur, und welche thematische Verbindung teilen sie?",
        answerA = "Paul Celan — beide schrieben Lyrik über den Holocaust",
        answerB = "Ingeborg Bachmann — beide thematisierten das Exil",
        answerC = "Shmuel Yosef Agnon — beide verarbeiteten jüdische Geschichte",
        answerD = "Heinrich Böll — beide schrieben gegen den Krieg",
        correctAnswer = 2,
        explanation = "Nelly Sachs teilte sich 1966 den Nobelpreis mit dem israelischen Schriftsteller Shmuel Yosef Agnon — beide verarbeiteten auf je eigene Weise jüdische Kultur und Geschichte.",
        difficulty = 4,
        funFact = "Nelly Sachs und Paul Celan standen in einem intensiven Briefwechsel — sie nannten einander 'die zwei Pole der Sprache nach Auschwitz'."
    ),

    // Question 40 — Sebald: Schreiben im Exil
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche Sprache wählte W.G. Sebald als Literatursprache, und warum ist das bemerkenswert?",
        answerA = "Englisch, weil er in England geboren wurde",
        answerB = "Französisch, als Hommage an Proust",
        answerC = "Latein, weil er Altphilologe war",
        answerD = "Deutsch, obwohl er seit 1966 in England lebte — eine bewusste Entscheidung gegen das Vergessen",
        correctAnswer = 3,
        explanation = "Sebald schrieb auf Deutsch, obwohl er fast sein gesamtes Erwachsenenleben in England verbrachte — eine bewusste Entscheidung, die Verbindung zur deutschen Kulturgeschichte und ihrer Schuld nicht zu kappen.",
        difficulty = 4,
        funFact = "Sebald wurde international zuerst durch die englischen Übersetzungen bekannt — in Deutschland wurde er erst danach als wichtiger Autor wahrgenommen."
    ),

    // Question 41 — Handke: Wunschloses Unglück
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Um welches Thema kreist Peter Handkes Erzählung 'Wunschloses Unglück' (1972)?",
        answerA = "Den Suizid seiner Mutter und die Unzulänglichkeit von Sprache, ein Frauenleben zu beschreiben",
        answerB = "Den Tod seines Vaters im Zweiten Weltkrieg",
        answerC = "Die Auswanderung der Familie nach Jugoslawien",
        answerD = "Eine gescheiterte Liebesbeziehung in Kärnten",
        correctAnswer = 0,
        explanation = "Nach dem Suizid seiner Mutter schrieb Handke 'Wunschloses Unglück' — ein Text, der zugleich Biographie und Sprachkritik ist: Handke zeigt, wie vorgefertigte Sprachklischees ein weibliches Leben unsichtbar machen.",
        difficulty = 4,
        funFact = "Der Titel zitiert eine Wendung, die Handkes Mutter selbst benutzt hatte — ein Ausdruck für eine Existenz ohne Hoffnung auf Veränderung."
    ),

    // Question 42 — Bernhard: Das Kalkwerk
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Was ist das zentrale Motiv in Thomas Bernhards Roman 'Das Kalkwerk' (1970)?",
        answerA = "Der Aufbau einer österreichischen Fabrik nach dem Krieg",
        answerB = "Ein Wissenschaftler, der jahrzehntelang an einer Studie über das Gehör arbeitet, sie aber nie niederschreibt",
        answerC = "Der Verfall eines mittelalterlichen Klosters",
        answerD = "Ein Mörder, der im Kalkwerk Leichen versteckt",
        correctAnswer = 1,
        explanation = "Konrad hat sich mit seiner gelähmten Frau in ein Kalkwerk zurückgezogen, um eine Studie über das Gehör zu schreiben — doch der Text entsteht nie. Am Ende erschießt er seine Frau.",
        difficulty = 4,
        funFact = "Das Kalkwerk ist für Bernhard-Forscher ein Schlüsselwerk über das Verhältnis von Schreiben und Scheitern — ein Künstlerroman über die Unmöglichkeit des Werks."
    ),

    // Question 43 — Canetti: Theaterstücke
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welches ist das bekannteste Theaterstück von Elias Canetti, uraufgeführt 1965, das die Manipulation durch einen Meister zeigt?",
        answerA = "Die Befristeten",
        answerB = "Hochzeit",
        answerC = "Komödie der Eitelkeit",
        answerD = "Der Ohrenzeuge",
        correctAnswer = 2,
        explanation = "'Komödie der Eitelkeit' (1934 geschrieben, 1965 uraufgeführt) zeigt eine Gesellschaft, in der alle Spiegel und Fotos verboten werden — ein satirisches Drama über Eitelkeit und Massenpsychose.",
        difficulty = 4,
        funFact = "Canetti schrieb das Stück in den 1930er-Jahren als Reaktion auf den aufkommenden Nationalismus — es wurde aber erst Jahrzehnte nach dem Ende der NS-Zeit uraufgeführt."
    ),

    // Question 44 — Sebald: Austerlitz — Architektur
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welcher Beruf und welches intellektuelle Interesse prägen die Figur Jacques Austerlitz in Sebalds gleichnamigem Roman?",
        answerA = "Historiker mit Fokus auf den Holocaust",
        answerB = "Schriftsteller, der über das eigene Exil schreibt",
        answerC = "Psychiater, der Traumata erforscht",
        answerD = "Architekturhistoriker, der monumentale Bauten des 19. Jahrhunderts als Machtzeichen analysiert",
        correctAnswer = 3,
        explanation = "Austerlitz ist Architekturhistoriker und untersucht Großbauten — Bahnhöfe, Festungen, Bibliotheken — als Ausdrücke von Herrschaft und als unbewusste Gedächtnisspeicher des Terrors.",
        difficulty = 4,
        funFact = "Die Architektur in Sebalds Roman ist nie neutral — jedes Gebäude trägt Spuren der Geschichte und des Vergessens."
    ),

    // Question 45 — Musil: Zweiter Band
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welchen Zustand erkundet Musil im zweiten Band von 'Der Mann ohne Eigenschaften' durch Ulrichs Beziehung zu seiner Schwester Agathe?",
        answerA = "Den 'Anderen Zustand' — eine mystische Vereinigung jenseits der Ratio",
        answerB = "Den politischen Radikalismus der Kriegsgeneration",
        answerC = "Die Unmöglichkeit von Liebe in der modernen Gesellschaft",
        answerD = "Den religiösen Mystizismus des Mittelalters",
        correctAnswer = 0,
        explanation = "In der Geschwisterliebe zwischen Ulrich und Agathe erkundet Musil den 'Anderen Zustand' — einen mystischen Erlebnismodus jenseits von Ratio und Wirklichkeitssinn, in dem Grenzen zwischen Subjekt und Welt aufgelöst werden.",
        difficulty = 4,
        funFact = "Musil bezeichnete diese Passage selbst als den Kern seines Romans — obwohl der zweite Band Fragment blieb."
    ),

    // Question 46 — Broch: Massenpsychologie
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welche theoretische Arbeit verfasste Hermann Broch im amerikanischen Exil, die Massenpsychologie und Politik verbindet?",
        answerA = "Psychologie der Massen und ihre Manipulation",
        answerB = "Massenwahntheorie (Zur Psychologie des Massenwahns)",
        answerC = "Der politische Wahn",
        answerD = "Faschismus und Demokratie: Eine Theorie",
        correctAnswer = 1,
        explanation = "Brochs 'Massenwahntheorie' (posthum veröffentlicht) versucht, den Nationalsozialismus als psychologisches Massenphänomen zu erklären — ein Grenzwerk zwischen Literatur, Philosophie und Politikwissenschaft.",
        difficulty = 4,
        funFact = "Broch schrieb das Werk im Exil in den USA und versuchte vergeblich, es zu Lebzeiten zu veröffentlichen."
    ),

    // Question 47 — Bachmann: 'Malina' und Ingeborg Bachmann als Figur
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welche Besonderheit hat die Ich-Erzählerin in Bachmanns 'Malina', die autobiographisch bedeutsam ist?",
        answerA = "Sie heißt ebenfalls Ingeborg",
        answerB = "Sie ist Opernsängerin wie Bachmanns Mutter",
        answerC = "Sie ist namenlos und lebt in Wien — wie Bachmann selbst in dieser Zeit",
        answerD = "Sie schreibt Lyrik und publiziert unter Pseudonym",
        correctAnswer = 2,
        explanation = "Die Ich-Erzählerin bleibt im Roman namenlos — nur Malina und der andere Mann, Ivan, haben Namen. Diese Namenlosigkeit des weiblichen Ichs ist poetologisch bedeutsam.",
        difficulty = 4,
        funFact = "Bachmann lebte 1971 tatsächlich in Wien, als sie den Roman veröffentlichte — die Topographie des Textes entspricht exakt der Wiener Ungargasse, wo sie wohnte."
    ),

    // Question 48 — Bernhard: Testamentklausel
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche außergewöhnliche Klausel enthielt Thomas Bernhards Testament bezüglich seiner Werke in Österreich?",
        answerA = "Alle Tantiemen sollten an die Arbeiterkammer gehen",
        answerB = "Seine Bücher sollten nur in Österreich veröffentlicht werden dürfen",
        answerC = "Österreichischen Schulen war verboten, seine Werke zu unterrichten",
        answerD = "Keine Aufführungen und keine Neuveröffentlichungen in Österreich zu seinen Lebzeiten und für die Dauer des österreichischen Urheberrechts",
        correctAnswer = 3,
        explanation = "Bernhard verfügte in seinem Testament, dass seine Werke in Österreich weder aufgeführt noch neu verlegt werden dürfen — eine letzte Provokation gegen das Land, das er zeitlebens kritisierte.",
        difficulty = 4,
        funFact = "Das Testament wurde nach seinem Tod 1989 rechtsgültig — österreichische Theater benötigten Sondergenehmigungen, was zu einer kuriosen juristischen Debatte führte."
    ),

    // Question 49 — Celan: Goll-Affäre
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Was verstand man unter der 'Goll-Affäre', die Paul Celan in den 1950er- und 1960er-Jahren tief traumatisierte?",
        answerA = "Der Plagiatsvorwurf von Claire Goll, Celan habe Gedichte ihres verstorbenen Mannes Yvan Goll kopiert",
        answerB = "Ein literarischer Streit über die Übersetzung französischer Lyrik",
        answerC = "Die Ablehnung von Celans erstem Gedichtband durch den Verleger Goll",
        answerD = "Ein Erbschaftsstreit um das literarische Erbe von Yvan Goll",
        correctAnswer = 0,
        explanation = "Claire Goll beschuldigte Celan öffentlich, Gedichte ihres Mannes Yvan Goll gestohlen zu haben — eine haltlose Anschuldigung, die Celan schwer traf und seine Depressionen verstärkte.",
        difficulty = 4,
        funFact = "Die Vorwürfe waren literaturwissenschaftlich unhaltbar, wurden aber von deutschen Zeitungen aufgegriffen — Celan litt bis zu seinem Tod unter diesem Angriff auf seine Integrität."
    ),

    // Question 50 — Handke: Slow Homecoming
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "In welcher Tetralogie der 1970er/80er-Jahre entwickelt Peter Handke ein neues, lyrisch-episches Schreiben jenseits der Sprachkritik seiner frühen Werke?",
        answerA = "Die Lehre der Sainte-Victoire, Das Gewicht der Welt, Kindergeschichte, Über die Dörfer",
        answerB = "Langsame Heimkehr, Die Lehre der Sainte-Victoire, Kindergeschichte, Über die Dörfer",
        answerC = "Der kurze Brief zum langen Abschied, Wunschloses Unglück, Die Stunde der wahren Empfindung, Publikumsbeschimpfung",
        answerD = "Kaspar, Das Mündel will Vormund sein, Offending the Audience, Die Hornissen",
        correctAnswer = 1,
        explanation = "Mit der Tetralogie 'Langsame Heimkehr' (1979), 'Die Lehre der Sainte-Victoire' (1980), 'Kindergeschichte' (1981) und 'Über die Dörfer' (1981) wendet sich Handke einer meditativen, an Cézanne und Stifter geschulten Prosa zu.",
        difficulty = 4,
        funFact = "Die 'Lehre der Sainte-Victoire' ist Handkes Hommage an Paul Cézannes Gemäldezyklus des Mont Sainte-Victoire und zeigt die Suche nach einer neuen Bildsprache."
    )

)
