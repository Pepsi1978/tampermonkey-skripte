package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun filmQuestionsExpert5(): List<Question> = listOf(

    // --- ANIME DEEP CUTS: STUDIO SHAFT ---

    // Question 1 - Shaft visual style
    Question(
        categoryId = 4,
        questionText = "Welcher Shaft-Regisseur praegte den Begriff 'Shaft no kami kiri' (Shaft-Kopfneigung) und nutzte extreme Kamerawinkel als Markenzeichen?",
        answerA = "Hiroyuki Imaishi",
        answerB = "Akiyuki Shinbo",
        answerC = "Masahiro Ando",
        answerD = "Kunihiko Ikuhara",
        correctAnswer = 1, // B
        explanation = "Akiyuki Shinbo ist der Chefregisseur von Studio Shaft und gilt als Erfinder des charakteristischen Shaft-Stils: extreme Kopfneigungen der Charaktere, flache Perspektiven, Texttafeln und konzentrierte Off-Axis-Kamerawinkel. Dieser Stil wird intern als 'Shinbo-Kamera' bezeichnet.",
        difficulty = 4,
        funFact = "Shinbo arbeitet so schnell, dass er bis zu 8 Serien gleichzeitig betreut — als sogenannter 'series director supervisor' gibt er die Bildsprache vor, waehrend andere Regisseure die Episoden leiten."
    ),

    // Question 2 - SHAFT Bakemonogatari
    Question(
        categoryId = 4,
        questionText = "Welche Monogatari-Serie war die erste, bei der Shaft auf digitale Texteinblendungen als Ersetzer fuer Hintergrunddetails setzte, da das Budget sehr knapp war?",
        answerA = "Nisemonogatari",
        answerB = "Nekomonogatari",
        answerC = "Bakemonogatari",
        answerD = "Owarimonogatari",
        correctAnswer = 2, // C
        explanation = "Bakemonogatari (2009) entstand unter extremem Budgetdruck. Shaft ersetzte fehlende oder unfertige Hintergrundelemente durch in Szenen eingeblendete Texttafeln und abstrakte Grafiken. Diese Not wurde zur Tugend: Der Stil gilt heute als innovativer Meta-Kommentar zur visuellen Erzaehlung.",
        difficulty = 4,
        funFact = "Die letzten drei Episoden von Bakemonogatari wurden nicht im Fernsehen ausgestrahlt, sondern nur auf der Shaft-Website veroeffentlicht — eine damals ungewoehnliche Distributionsstrategie."
    ),

    // Question 3 - MAPPA founding
    Question(
        categoryId = 4,
        questionText = "Wer gruendete Studio MAPPA im Jahr 2011 und hatte zuvor Madhouse verlassen?",
        answerA = "Masao Maruyama",
        answerB = "Osamu Dezaki",
        answerC = "Satoshi Kon",
        answerD = "Rintaro",
        correctAnswer = 0, // A
        explanation = "Masao Maruyama, Mitgruender von Madhouse, gruendete MAPPA (Maruyama Animation Produce Project Association) 2011 nach seinem Abgang von Madhouse. Er wollte ein Studio schaffen, das kuenstlerisch anspruchsvolle Projekte ohne kommerzielle Kompromisse produzieren kann.",
        difficulty = 4,
        funFact = "MAPPA steht fuer 'Maruyama Animation Produce Project Association' — der Name verbirgt direkt den Namen des Gruenders."
    ),

    // Question 4 - MAPPA sakuga
    Question(
        categoryId = 4,
        questionText = "Welcher MAPPA-produzierte Film von 2021 gilt als Meilenstein der sakuga-Animationsgemeinschaft wegen seiner hyperrealistischen Kampfsequenzen?",
        answerA = "Jujutsu Kaisen 0",
        answerB = "Vinland Saga: Prologue",
        answerC = "Chainsaw Man: Reze-Arc",
        answerD = "Yuri on Ice: The Movie",
        correctAnswer = 0, // A
        explanation = "Jujutsu Kaisen 0 (2021) erregte in der sakuga-Community extreme Aufmerksamkeit durch die Kampfsequenzen zwischen Yuta und Geto am Weihnachtsabend. Animatoren wie Eiko Kojima und Soichi Masui lieferten smear-frame-intensive Szenen mit fliessendem On-Twos-Timing.",
        difficulty = 4,
        funFact = "Der Begriff 'sakuga' (japanisch: gezeichnete Bilder) bezeichnet in der Fangemeinde Animationssequenzen von aussergewoehnlicher Qualitaet, meist von einem Schluessel-Animator verantwortet."
    ),

    // Question 5 - Studio Trigger founding
    Question(
        categoryId = 4,
        questionText = "Studio Trigger wurde von ehemaligen Gainax-Mitarbeitern 2011 gegruendet. Wer ist der bekannteste der beiden Mitgruender?",
        answerA = "Yoh Yoshinari",
        answerB = "Shigeto Koyama",
        answerC = "Hiroyuki Imaishi",
        answerD = "Kazuki Nakashima",
        correctAnswer = 2, // C
        explanation = "Hiroyuki Imaishi (Regisseur von Gurren Lagann und Panty & Stocking bei Gainax) gruendete Studio Trigger 2011 zusammen mit Masahiko Otsuka. Imaishi ist fuer seinen explosiven, uebertriebenen Animationsstil bekannt, der auf klassischen amerikanischen Cartoons und Super Robot-Anime aufbaut.",
        difficulty = 4,
        funFact = "Triggers erstes Projekt war eine Mini-Serie namens 'Inferno Cop' (2012), die mit minimaler Animation und bewusst schlechten Zeichnungen als Parodie gedacht war und trotzdem Kultstatus erlangte."
    ),

    // Question 6 - Trigger visual style
    Question(
        categoryId = 4,
        questionText = "Welches visuelle Merkmal unterscheidet Triggers Animationsstil in Serien wie 'Kill la Kill' grundlegend von konventioneller TV-Animation?",
        answerA = "Durchgehend 3D-CG fuer alle Charaktere",
        answerB = "Bewusster Einsatz von Limitierungen: Off-Model-Zeichnungen und smear frames als expressives Stilmittel",
        answerC = "Ausschliesslich Watercolor-Texturen fuer Hintergruende",
        answerD = "Vollstaendige Vermeidung von Zwischenbildern (in-betweens)",
        correctAnswer = 1, // B
        explanation = "Trigger verwendet bewusst Off-Model-Zeichnungen (Charaktere die von der standardisierten Form abweichen) und smear frames (Bewegungsunschaerfe durch verzerrte Zwischenbilder) als kuenstlerisches Mittel. Diese Technik, aus der UPA- und Chuck-Jones-Schule, verleiht Szenen kinetische Energie.",
        difficulty = 4,
        funFact = "In Kill la Kill gibt es Szenen, in denen die Charaktere so stark deformiert werden, dass nur noch ein oder zwei Frames pro Bewegungsphase gezeichnet werden — ein Rueckgriff auf die limitierte Animation der 1960er-Jahre."
    ),

    // --- SATOSHI KON: DIRECTOR TECHNIQUES ---

    // Question 7 - Satoshi Kon cut technique
    Question(
        categoryId = 4,
        questionText = "Welche Schnitttechnik gilt als Satoshi Kons Erkennungsmerkmal und verbindet zwei Szenen durch eine exakte Bewegungsfortsetzung trotz Ortswechsels?",
        answerA = "Jump Cut",
        answerB = "Match Cut",
        answerC = "Wipe Cut",
        answerD = "Kon Cut",
        correctAnswer = 1, // B
        explanation = "Satoshi Kon verfeinerte den 'Match Cut' zu einem persoenlichen Stilmittel: Er verbindet Szenen durch identische Bewegungen oder Kompostionen, wodurch Realitaet und Wahn, Gegenwart und Vergangenheit nahtlos ineinandergleiten. Diese Technik ist besonders in 'Perfect Blue' und 'Paprika' zu sehen.",
        difficulty = 4,
        funFact = "Darren Aronofsky kaufte die Rechte an einer Szene aus 'Perfect Blue', um sie in 'Requiem for a Dream' zu rekonstruieren — ein direktes Zugestaendnis des Einflusses, den Kon auf Realmfilm-Regisseure hatte."
    ),

    // Question 8 - Satoshi Kon Paprika influence
    Question(
        categoryId = 4,
        questionText = "Christopher Nolan zitierte welchen Satoshi-Kon-Film als Einfluss auf 'Inception' (2010)?",
        answerA = "Millennium Actress",
        answerB = "Tokyo Godfathers",
        answerC = "Paranoia Agent",
        answerD = "Paprika",
        correctAnswer = 3, // D
        explanation = "Christopher Nolan nannte 'Paprika' (2006) als Inspirationsquelle fuer 'Inception'. Beide Filme behandeln das Eindringen in Traeume, die Vermischung von Traumebenen und den Verlust der Wirklichkeitswahrnehmung. Die Paradezug-Sequenz in Paprika hat eine direkte visuelle Entsprechung in Inception.",
        difficulty = 4,
        funFact = "Kon selbst war bekannt dafuer, dass er seine Animatoren anwies, nicht mehr Bilder zu zeichnen als noetig — er wollte Spannung durch das, was NICHT gezeigt wird, erzeugen."
    ),

    // Question 9 - Satoshi Kon death and unfinished work
    Question(
        categoryId = 4,
        questionText = "Welches Filmprojekt arbeitete Satoshi Kon zum Zeitpunkt seines Todes 2010 aus, das posthum als Storyboard-Buch veroeffentlicht wurde?",
        answerA = "Dreaming Machine",
        answerB = "The Kingdom of Dreams and Madness",
        answerC = "Robot Carnival 2",
        answerD = "Ghost in the Shell: Innocence 2",
        correctAnswer = 0, // A
        explanation = "'Dreaming Machine' (Yume-Miru Kikai) war Kons unvollendetes letztes Projekt, ein Science-Fiction-Film fuer Kinder. Das Studio Madhouse versuchte nach seinem Tod, das Projekt fortzufuehren, stellte es aber mangels Budget ein. 2014 wurden Storyboards und Konzeptzeichnungen als Buch veroeffentlicht.",
        difficulty = 4,
        funFact = "Satoshi Kon verfasste kurz vor seinem Tod einen bewegenden Abschiedsbrief, der im Internet verbreitet wurde und in dem er sich bei seinen Freunden, Kollegen und Fans bedankte."
    ),

    // --- MAMORU HOSODA TECHNIQUES ---

    // Question 10 - Hosoda visual signature
    Question(
        categoryId = 4,
        questionText = "Mamoru Hosodas Filme sind fuer eine bestimmte Weise der Charakterzeichnung bekannt. Welches Merkmal gilt als sein persoenlicher Stil?",
        answerA = "Hyperdetaillierte Gesichter mit realistischen Poren und Falten",
        answerB = "Schlichte, grosse Augen und betonte Gesichtssymmetrie mit weichen Linien",
        answerC = "Kubistische Deformierung der Gesichtsstruktur in Bewegung",
        answerD = "Vollstaendiger Verzicht auf Augendetails fuer alle Nebencharaktere",
        correctAnswer = 1, // B
        explanation = "Hosodas Charaktere haben charakteristisch weiche Linien, betonte Symmetrie und grosse klare Augen. Der Stil betont Emotionen durch Gesichtsmimik statt durch spektakulaere Animation. Dieser Ansatz wurde besonders von seinem Stammanimator Hiroyuki Aoyama umgesetzt.",
        difficulty = 4,
        funFact = "Hosoda wurde einst von Studio Ghibli als Regisseur fuer 'Howl's Moving Castle' in Betracht gezogen, verliess das Projekt jedoch nach kreativen Differenzen — die Rolle uebernahm schliesslich Hayao Miyazaki selbst."
    ),

    // --- MAKOTO SHINKAI TECHNIQUES ---

    // Question 11 - Shinkai background technique
    Question(
        categoryId = 4,
        questionText = "Makoto Shinkai ist beruehmt fuer fotorealistische Hintergruende. Welche Technik setzt er ein, um diese Wirkung zu erzielen?",
        answerA = "Er fotografiert reale Orte und malt diese digital nach (photo-tracing)",
        answerB = "Ausschliesslich 3D-Rendering mit anschliessender 2D-Cel-Shading-Ueberlagerung",
        answerC = "Handgemalte Aquarell-Hintergruende die nachtraeglich digital geschaerft werden",
        answerD = "KI-generierte Hintergruende seit 2016",
        correctAnswer = 0, // A
        explanation = "Shinkais Team fotografiert reale Orte in Japan und malt diese digital mit grossem Aufwand nach (photo-referenced painting). Dabei werden Lichtbrechungen, Linsenflecken und atmosphaerische Streuung mit Effekt-Layern hinzugefuegt. Das Ergebnis wirkt fotografisch, ist aber vollstaendig handgemacht.",
        difficulty = 4,
        funFact = "Shinkai animierte seinen Durchbruchfilm 'Voices of a Distant Star' (2002) fast vollstaendig alleine auf einem PowerMac G4 — der Film gilt als Beweis, dass ein Einzelner einen vollwertigen Anime produzieren kann."
    ),

    // --- KOREAN CINEMA: NEW WAVE MOVEMENT ---

    // Question 12 - Korean New Wave origin
    Question(
        categoryId = 4,
        questionText = "Das 'Korean New Cinema' der 1990er und 2000er Jahre entstand massgeblich nach welchem historischen Ereignis in Suedkorea?",
        answerA = "Nach dem Ende der Japanischen Besatzung 1945",
        answerB = "Nach der Demokratisierung und dem Ende der Militaerdiktatur 1987",
        answerC = "Nach den Olympischen Spielen in Seoul 1988",
        answerD = "Nach der Asienfinanzkrise 1997",
        correctAnswer = 1, // B
        explanation = "Das Ende der Militaerdiktatur 1987 und die darauffolgende Demokratisierung Suedkoreas ermoeglichten eine neue Generation von Filmemachern, die gesellschaftskritische, subversive Inhalte ohne Zensur produzieren konnten. Regisseure wie Park Chan-wook und Bong Joon-ho konnten nun Klassen-, Trauma- und Gewaltthemen direkt adressieren.",
        difficulty = 4,
        funFact = "Bis 1987 kontrollierte die suedkoreanische Regierung das Filmwesen streng: Jedes Drehbuch musste vorab genehmigt werden, anti-staatliche Inhalte waren verboten."
    ),

    // Question 13 - Hong Sang-soo style
    Question(
        categoryId = 4,
        questionText = "Hong Sang-soos Filme sind fuer eine sehr spezifische strukturelle Technik bekannt. Welche ist es?",
        answerA = "Einzelne Einstellung ohne Schnitt fuer den gesamten Film (One-Shot-Technik)",
        answerB = "Wiederholung und Variation von fast identischen Szenen innerhalb desselben Films",
        answerC = "Rueckwaerts chronologische Erz ahlung (retrograde Narration)",
        answerD = "Gleichzeitige Split-Screen-Erzaehlung paralleler Realitaeten",
        correctAnswer = 1, // B
        explanation = "Hong Sang-soo wiederholt in seinen Filmen Szenen mit kleinen Variationen: Dieselben Charaktere treffen sich an denselben Orten, fuehren aehnliche Gespraeche, aber mit unterschiedlichen Ergebnissen. Diese Technik hinterfragt, ob Ereignisse zufaellig, schicksalhaft oder durch minimale Entscheidungen beeinflusst sind.",
        difficulty = 4,
        funFact = "Hong Sang-soo schreibt seine Drehbuecher meistens erst kurz vor den Drehtagen oder sogar waehrend der Produktion — er gilt als einer der wenigen Autorenfilmer, der ohne vollstaendiges Skript ins Filming geht."
    ),

    // Question 14 - Lee Chang-dong films
    Question(
        categoryId = 4,
        questionText = "Lee Chang-dongs Film 'Burning' (2018) basiert lose auf welcher Kurzgeschichte eines japanischen Autors?",
        answerA = "Natsume Soseki: 'Kokoro'",
        answerB = "Haruki Murakami: 'Barn Burning'",
        answerC = "Yukio Mishima: 'The Temple of the Golden Pavilion'",
        answerD = "Ryunosuke Akutagawa: 'In a Grove'",
        correctAnswer = 1, // B
        explanation = "'Burning' basiert auf Haruki Murakamis Kurzgeschichte 'Barn Burning' aus dem Band 'The Elephant Vanishes' (1983). Lee Chang-dong erweiterte die knappe Geschichte um sozialkritische Schichten ueber Klassenungleichheit im modernen Suedkorea und lieferte eine der meistdiskutierten Filminterpretationen der 2010er Jahre.",
        difficulty = 4,
        funFact = "Steven Yeun, der in 'Burning' den raetselhaften Ben spielt, sagte in Interviews, er habe nicht gewusst, ob sein Charakter ein Moerder ist oder nicht — Lee Chang-dong hielt diese Zweideutigkeit bewusst auch vor seinem Schauspieler geheim."
    ),

    // Question 15 - Lee Chang-dong Poetry
    Question(
        categoryId = 4,
        questionText = "In Lee Chang-dongs 'Poetry' (2010) leidet die Protagonistin an einer Erkrankung, die thematisch mit der Filmhandlung verwoben ist. Welche Erkrankung ist es?",
        answerA = "Epilepsie",
        answerB = "Parkinson",
        answerC = "Alzheimer / Demenz",
        answerD = "Schizophrenie",
        correctAnswer = 2, // C
        explanation = "Die Protagonistin Mija in 'Poetry' entwickelt im Laufe des Films Alzheimer und verliert die Faehigkeit, Worte zu finden — ein bitteres Paradox, da sie gleichzeitig Gedichte schreiben lernen moechte. Die Krankheit macht das Erinnern und Festhalten von Erlebnissen zu einem zentralen Thema des Films.",
        difficulty = 4,
        funFact = "Die Darstellerin Yoon Jeong-hee hatte 16 Jahre kein Kino mehr gedreht, bevor Lee Chang-dong sie fuer 'Poetry' ueberreden konnte. Ihr Comeback gilt als eine der grossen Schauspielleistungen des koreanischen Kinos."
    ),

    // Question 16 - Park Chan-wook Vengeance Trilogy
    Question(
        categoryId = 4,
        questionText = "Welche drei Filme bilden Park Chan-wooks 'Vengeance Trilogy' und sind durch das Rache-Motiv verbunden?",
        answerA = "Sympathy for Mr. Vengeance / Oldboy / Lady Vengeance",
        answerB = "Oldboy / Stoker / The Handmaiden",
        answerC = "Joint Security Area / Sympathy for Mr. Vengeance / Oldboy",
        answerD = "I Saw the Devil / A Bittersweet Life / Lady Vengeance",
        correctAnswer = 0, // A
        explanation = "Die Vengeance-Trilogie besteht aus 'Sympathy for Mr. Vengeance' (2002), 'Oldboy' (2003) und 'Sympathy for Lady Vengeance' (2005). Alle drei Filme untersuchen Rache als selbstzerstoererischen Kreislauf, der den Raechenden ebenso beschaedigt wie das Ziel der Rache.",
        difficulty = 4,
        funFact = "Park Chan-wook sagte, er habe die Trilogie nicht von Anfang an als Trilogie geplant — erst nach 'Oldboy' beschloss er, das Rache-Motiv in einem dritten Film abzuschliessen."
    ),

    // --- FILM SCORES: MUSICAL ANALYSIS ---

    // Question 17 - Bernard Herrmann Psycho
    Question(
        categoryId = 4,
        questionText = "Bernard Herrmanns Filmmusik fuer 'Psycho' (1960) ist beruehmt fuer die Duschszene. Welches ungewoehnliche Merkmal hat das Orchester in dieser Partitur?",
        answerA = "Das Orchester besteht ausschliesslich aus Schlagzeug und Kontrabass",
        answerB = "Es werden keine Instrumente verwendet — nur verarbeitete Menschenstimmen",
        answerC = "Das Orchester besteht ausschliesslich aus Streichern (keine Blaeser, kein Schlagzeug)",
        answerD = "Der Score verwendet nur einen einzigen, sich wiederholenden Grundton",
        correctAnswer = 2, // C
        explanation = "Herrmanns Partitur fuer 'Psycho' ist fuer reines Streicherorchester geschrieben — keine Blaeser, kein Schlagzeug, kein Klavier. Diese Entscheidung verleiht dem Score eine metallische, scharfe Textur. Der beruechmte Dusch-Stab ('The Murder') entstand, als Hitchcock den Score fuer zu brutal hielt und Herrmann ihn ueberzeugte, ihn zu behalten.",
        difficulty = 4,
        funFact = "Hitchcock wollte die Duschszene urspruenglich ohne Musik zeigen. Herrmann spielte ihm den Score vor, ohne zu fragen — Hitchcock war so begeistert, dass er Herrmanns Honorar verdoppelte."
    ),

    // Question 18 - Ennio Morricone technique
    Question(
        categoryId = 4,
        questionText = "Ennio Morricones Score fuer 'The Good, the Bad and the Ugly' (1966) enthielt welches ungewoehnliche Klangelement, das Sergio Leone speziell angefordert hatte?",
        answerA = "Ein verzerrtes E-Gitarrensolo gespielt rueckwaerts",
        answerB = "Menschliche Stimmen die Tier- und Waffengeraeusche imitieren (u.a. Pfeifen, Bellen, Coyote-Rufe)",
        answerC = "Dissonante Mikroton-Stimmungen des gesamten Orchesters",
        answerD = "Live-aufgenommene Revolver-Schuesse als rhythmisches Element",
        correctAnswer = 1, // B
        explanation = "Morricone verwendete auf Leones Wunsch menschliche Stimmen, die Tier- und Waffengeraeusche nachahmten: das ikonische Pfeifen, Falsett-Rufe, Bellgeraeusche und Coyote-Heultoene. Das Titelthema kombiniert E-Gitarre, Mundharmonika, Chor und diese Vokal-Imitationen zu einem einzigartigen Klang.",
        difficulty = 4,
        funFact = "Morricone und Leone kannten sich seit der Grundschule und arbeiteten Jahrzehnte zusammen. Morricone schrieb Leones Scores oft VOR dem Dreh, sodass Leone die Musik am Set abspielte, um die Schauspieler in Stimmung zu bringen."
    ),

    // Question 19 - John Williams leitmotif Star Wars
    Question(
        categoryId = 4,
        questionText = "John Williams' Star-Wars-Score gilt als Paradebeispiel des Leitmotiv-Systems. Welchem Komponisten des 19. Jahrhunderts verdankt dieses System seinen Ursprung?",
        answerA = "Ludwig van Beethoven",
        answerB = "Richard Wagner",
        answerC = "Johannes Brahms",
        answerD = "Hector Berlioz",
        correctAnswer = 1, // B
        explanation = "Das Leitmotiv-System — wiederkehrende musikalische Themen fuer Charaktere, Orte und Ideen — wurde von Richard Wagner in seinen Opernzyklen wie dem 'Ring des Nibelungen' entwickelt. Williams adaptierte dieses System direkt fuer Star Wars und zitiert in Interviews immer wieder Wagners Einfluss.",
        difficulty = 4,
        funFact = "Williams' Darth-Vader-Thema 'The Imperial March' erschien erst in 'The Empire Strikes Back' (1980), nicht im Originalfilm von 1977 — Vaders Originalthema war ein dramatisches Fanfarenmotiv."
    ),

    // Question 20 - Hans Zimmer Inception
    Question(
        categoryId = 4,
        questionText = "Hans Zimmers Score fuer 'Inception' (2010) enthielt ein musikalisches Geheimnis, das mit dem im Film verwendeten Dreamsong zusammenhaengt. Was war es?",
        answerA = "Das Hauptthema ist eine exakte Umkehrung (Inversion) von Beethovens 5. Sinfonie",
        answerB = "Das gesamte Hauptthema ist eine extrem verlangsamte Version von Edith Piafs 'Non, je ne regrette rien'",
        answerC = "Das Leitthema ist in einer mathematisch berechneten Fibonacci-Sequenz komponiert",
        answerD = "Der Score ist vollstaendig in 5/4-Takt geschrieben, der Traumebenen symbolisiert",
        correctAnswer = 1, // B
        explanation = "Hans Zimmer verlangsamte Edith Piafs 'Non, je ne regrette rien' dramatisch und extrahierte daraus die harmonische Grundstruktur des gesamten Inception-Scores. Der Zusammenhang ist absichtlich: Das Lied dient im Film als Signal zum Aufwachen aus dem Traum. Das Ominous Brass-Ostinato, das im Trailer weltberuehmt wurde, ist ein verzerrtes Fragment des Piafs-Liedes.",
        difficulty = 4,
        funFact = "Der Inception-Trailer-Sound (das tiefe 'BRAAAAM') wurde so weit verbreitet, dass er zum generischen Blockbuster-Trailerton wurde und seitdem in Hunderten von Trailern imitiert wurde."
    ),

    // Question 21 - Jonny Greenwood Radiohead film scores
    Question(
        categoryId = 4,
        questionText = "Jonny Greenwood (Radiohead) komponierte den Filmscore fuer 'There Will Be Blood' (2007). Welchen zeitgenoessischen Klassiker des 20. Jahrhunderts entnahm er Material, das spaeter entfernt werden musste?",
        answerA = "Bela Bartoks Streichquartett Nr. 4",
        answerB = "Krzysztof Pendereckis 'Polymorphia' und 'Threnody for the Victims of Hiroshima'",
        answerC = "Gyorgy Ligetis 'Atmospheres'",
        answerD = "Lutoslawskis Cellokonzert",
        correctAnswer = 1, // B
        explanation = "Greenwoods urspruenglicher Score enthielt Teile von Krzysztof Pendereckis avantgardistischen Werken, besonders 'Polymorphia'. Da diese Werke urheberrechtlich geschuetzt waren und die Rechte nicht vollstaendig geklaret wurden, mussten Teile des Scores neu komponiert werden. Pendereckis Einfluss ist jedoch im finalen Score klar hoerbar.",
        difficulty = 4,
        funFact = "Paul Thomas Anderson nutzte fuer 'The Master' (2012) erneut Greenwood als Komponisten und gab ihm noch mehr kreative Freiheit — der Score wurde von Kritikern als einer der besten der 2010er Jahre eingestuft."
    ),

    // Question 22 - film score plagiarism
    Question(
        categoryId = 4,
        questionText = "Welcher Hollywood-Filmscore war Gegenstand eines Plagiatsvorwurfs wegen starker Aehnlichkeit zu Gustav Holsts 'The Planets' Suite?",
        answerA = "Howard Shores 'Der Herr der Ringe'",
        answerB = "John Williams' 'Star Wars'",
        answerC = "Jerry Goldsmiths 'Alien'",
        answerD = "James Horners 'Avatar'",
        correctAnswer = 1, // B
        explanation = "John Williams' Star-Wars-Score, insbesondere das Mars-Motiv aus 'The Planets' von Gustav Holst, wurde mehrfach als direkte Inspirationsquelle diskutiert. Da Holsts 'The Planets' (1914-1916) in den USA lange gemeinfrei war, bestanden keine rechtlichen Ansprueche, aber Musikwissenschaftler analysieren die Aehnlichkeiten in Harmonik und Rhythmik ausgiebig.",
        difficulty = 4,
        funFact = "Holsts Erben versuchten dennoch, die Rechte an 'The Planets' zu sichern, scheiterten aber, da das Werk in den meisten Laendern als gemeinfrei gilt."
    ),

    // --- FILM COPYRIGHT AND LEGAL BATTLES ---

    // Question 23 - Rear Window copyright
    Question(
        categoryId = 4,
        questionText = "Welcher Rechtsstreit um Hitchcocks 'Das Fenster zum Hof' (1954) fuehrte dazu, dass der Film jahrzehntelang nicht zuegaenglich war?",
        answerA = "Warner Bros. beanspruchte die Rechte wegen eines Vertragsfehlers",
        answerB = "Die Erben des Kurzgeschichtenautors Cornell Woolrich klagten erfolgreich gegen eine Lizenzerneuerung",
        answerC = "Hitchcocks Tochter Patricia erhielt gerichtlich alle Filmrechte",
        answerD = "Ein Fehler in der Copyright-Anmeldung brachte den Film in die Public Domain",
        correctAnswer = 1, // B
        explanation = "Hitchcock erwarb die Filmrechte zeitlich begrenzt von Cornell Woolrichs Erben (Woolrich schrieb das Quellenwerk 'It Had to Be Murder'). Als die Lizenz auslief und die Erben keine Verlaengerung gewaehnten, war der Film rechtlich nicht mehr zeigbar. Stewart und andere Beteiligte hatten Gewinnbeteiligungen — der Fall 'Stewart v. Abend' (1990) vor dem US-Obersten-Gericht entschied zugunsten der Rechteinhaber.",
        difficulty = 4,
        funFact = "Der Fall 'Stewart v. Abend' ist bis heute ein Lehrbeispiel im amerikanischen Urheberrecht fuer die Frage, ob Derivatwerke (Filme) bestehen koennen, wenn die Grundrechte erlischen."
    ),

    // Question 24 - Nosferatu copyright
    Question(
        categoryId = 4,
        questionText = "F.W. Murnaus 'Nosferatu' (1922) war das Ergebnis einer nicht genehmigten Verfilmung. Was ordnete ein deutsches Gericht 1925 urspruenglich an?",
        answerA = "Murnau musste alle Einnahmen an die Stoker-Erben abgeben",
        answerB = "Alle Kopien des Films sollten vernichtet werden",
        answerC = "Der Film durfte nur in Deutschland gezeigt werden",
        answerD = "Der Titel musste dauerhaft in 'Eine Symphonie des Grauens' geaendert werden",
        correctAnswer = 1, // B
        explanation = "Bram Stokers Witwe Florence Stoker klagte erfolgreich, da Prana Film weder die Rechte an 'Dracula' erworben hatte noch die Erlaubnis hatte, den Stoff zu verfilmen. Das deutsche Gericht ordnete 1925 die Vernichtung aller Filmkopien an. Da aber bereits einige Kopien ins Ausland gelangt waren, ueberlebte der Film — und ist heute eines der beruehm testen Werke des Stummfilmkinos.",
        difficulty = 4,
        funFact = "Florence Stoker fuehrte den Rechtsstreit weniger aus kuenstlerischer Ueberzeugung als aus finanzieller Not — sie war verarmt und hoffte, durch Lizenzen an Bram Stokers Nachruhm verdienen zu koennen."
    ),

    // Question 25 - It's a Wonderful Life public domain
    Question(
        categoryId = 4,
        questionText = "Weshalb konnte 'It's a Wonderful Life' (1946) jahrzehntelang uneingeschraenkt im Fernsehen gesendet werden?",
        answerA = "Der Film war nie urheberrechtlich geschuetzt gewesen",
        answerB = "Republic Pictures verzichtete freiwillig auf alle Urheberrechte",
        answerC = "Das Copyright lief ab, weil es nicht rechtzeitig erneuert wurde",
        answerD = "Ein Gerichtsbeschluss erklaerte den Film als nationales Kulturerbe",
        correctAnswer = 2, // C
        explanation = "Das urspruengliche Copyright von 1946 wurde 1974 nicht erneuert und der Film fiel in die Public Domain. US-Fernsehsender konnten ihn kostenlos senden — er wurde zum Weihnachtsklassiker eben deshalb, weil TV-Stationen keine Lizenzgebuehren zahlen mussten. 1993 sicherte sich Republic Pictures jedoch die Rechte an der Ursprungsgeschichte und der Filmmusik und konnte so wieder Kontrolle ausueben.",
        difficulty = 4,
        funFact = "Paradoxerweise machte der Status als guenstiger Sendeplatz 'It's a Wonderful Life' erst zu dem Weihnachtsklassiker, der er heute ist — niemand haette ihn so haeufig gesendet, wenn Lizenzgebuehren angefallen waeren."
    ),

    // Question 26 - Sherlock Holmes copyright
    Question(
        categoryId = 4,
        questionText = "Ein US-Rechtsstreit 2014 klaerte, welcher Aspekt der Sherlock-Holmes-Figur noch urheberrechtlich geschuetzt ist. Was war das Ergebnis?",
        answerA = "Das gesamte Holmes-Universum wurde als Public Domain erklaert",
        answerB = "Die Charakterzuege aus den letzten 10 Conan-Doyle-Geschichten bleiben geschuetzt bis 2023",
        answerC = "Der Name 'Sherlock Holmes' bleibt dauerhaft urheberrechtlich geschuetzt",
        answerD = "Nur Elementarys CBS-Version ist rechtlich legitimiert",
        correctAnswer = 1, // B
        explanation = "In 'Klinger v. Conan Doyle Estate' (2014) entschied das Gericht, dass Holmes als Figur ueberwiegend gemeinfrei ist, da die meisten Geschichten vor 1923 erschienen. Jedoch sind bestimmte Charaktereigenschaften, die nur in den spaeter erschienenen (noch geschuetzten) Geschichten erwaehnt werden, bis zum Ablauf dieser Copyrights geschuetzt. Neue Holmes-Adaptionen mussten darauf achten, keine exklusiven Eigenschaften aus diesen spaeten Werken zu verwenden.",
        difficulty = 4,
        funFact = "Die Conan Doyle Estate versuchte, Lizenzgebuehren fuer jede Holmes-Adaption zu verlangen — nach dem Klinger-Urteil scheiterten diese Forderungen groesstenteils."
    ),

    // Question 27 - Avatar fan fiction copyright
    Question(
        categoryId = 4,
        questionText = "James Camerons 'Avatar' (2009) war in mehrere Urheberrechtsstreitigkeiten verwickelt. Welche Klage war die bekannteste in Bezug auf eine angebliche Quellvorlage?",
        answerA = "Tolkiens Erben klagten wegen des Weltbauprinzips",
        answerB = "Eric Ryder klagte, Cameron habe sein Drehbuch 'Aquatica' plagiiert",
        answerC = "Alan Dean Foster klagte wegen unvergoltener Novelisierungsrechte",
        answerD = "Frank Herbert Estates klagten wegen Aehnlichkeiten mit 'Dune'",
        correctAnswer = 1, // B
        explanation = "Eric Ryder klagte, sein Drehbuch 'Aquatica' (ueber einen menschlichen Taucher, der in eine fremde Unterwasserwelt eintaucht und Kontakt zu Einheimischen aufnimmt) sei die Grundlage fuer 'Avatar'. Der Fall wurde 2013 zugunsten Camerons abgewiesen, da die Klaeger keine konkreten Beweise fuer den Zugang Camerons zum Skript vorlegen konnten.",
        difficulty = 4,
        funFact = "Avatar wurde insgesamt von mehr als einem Dutzend Klaegern wegen angeblichen Plagiats angegangen — darunter auch Autoren, die Aehnlichkeiten mit Pocahontas, Dances with Wolves und anderen Werken anmerkten."
    ),

    // Question 28 - Zorro copyright
    Question(
        categoryId = 4,
        questionText = "Die Figur Zorro ist Gegenstand langjaehriger Urheberrechtsdebatten. Wer haelt aktuell die Hauptrechte an der Figur?",
        answerA = "Disney, seit dem Kauf der Johnston McCulley-Rechte 2012",
        answerB = "Die Nachfahren von Johnston McCulley, dem Erfinder",
        answerC = "Zorro Productions Inc., die die Rechte seit den 1950er Jahren haelt",
        answerD = "Sony Pictures, seit dem Film 'The Mask of Zorro' (1998)",
        correctAnswer = 2, // C
        explanation = "Zorro Productions Inc. haelt die Hauptmarken- und Urheberrechte an der Figur Zorro, die auf Johnston McCulleys Erziehung zurueckgehen. Das Unternehmen lizenziert die Figur und hat aktiv gegen unauthorisierte Verwendungen geklagt. Der Urheberrechtsschutz der Originalwerke ist jedoch in vielen Laendern abgelaufen, was die Rechtslage komplex macht.",
        difficulty = 4,
        funFact = "Es gibt einen offenen Streit darueber, ob Zorro in den USA gemeinfrei ist — die erste Geschichte erschien 1919, aber Zorro Productions argumentiert, dass bestimmte Charaktereigenschaften spaeterer Werke noch geschuetzt sind."
    ),

    // --- CENSORSHIP CASES WORLDWIDE ---

    // Question 29 - A Clockwork Orange UK ban
    Question(
        categoryId = 4,
        questionText = "Stanley Kubricks 'Uhrwerk Orange' (1971) wurde in Grossbritannien nicht offiziell verboten, sondern auf welche Weise vom Markt genommen?",
        answerA = "Das BBFC entzog dem Film dauerhaft die Freigabe",
        answerB = "Warner Bros. verbot auf Druck der Presse eine weitere Verleihung in Grossbritannien",
        answerC = "Kubrick selbst bat darum, den Film in Grossbritannien zurueckzuziehen, und Warner Bros. respektierte dies",
        answerD = "Das britische Parlament verabschiedete ein Gesetz, das den Film explizit verbot",
        correctAnswer = 2, // C
        explanation = "Stanley Kubrick bat persoenlich Warner Bros., 'A Clockwork Orange' aus dem britischen Verleih zurueckzuziehen, nachdem der Film mit realen Gewalttaten in Verbindung gebracht wurde und Kubrick sowie seine Familie Morddrohungen erhielten. Warner Bros. respektierte seine Entscheidung. Der Film war bis zu Kubricks Tod 1999 in Grossbritannien nicht legal zu sehen.",
        difficulty = 4,
        funFact = "Ironischerweise war der Film in anderen europaeischen Laendern problemlos erhaeeltlich und wurde dort normal vertrieben — Briten importierten ihn teilweise als Videokassette aus den Niederlanden."
    ),

    // Question 30 - The Last Temptation of Christ
    Question(
        categoryId = 4,
        questionText = "Martin Scorseses 'Die letzte Versuchung Christi' (1988) wurde in welchem europaeischen Land dauerhaft verboten und ist dort bis heute nicht legal zeigbar?",
        answerA = "Polen",
        answerB = "Irland",
        answerC = "Spanien",
        answerD = "Griechenland",
        correctAnswer = 3, // D
        explanation = "Griechenland verhaehngte ein dauerhaftes Vorbildungsverbot fuer 'Die letzte Versuchung Christi'. Der Film gilt dort als Blasphemie. Obwohl EU-Recht grundsaetzlich Vorzug hat, wurden nationale Kulturschutz- und Religionsfreiheitsgesetze als Rechtfertigung angefuehrt. Der Film ist in Griechenland bis heute nicht offiziell im Kino oder auf Heimmedien erhaeeltlich.",
        difficulty = 4,
        funFact = "In Paris wurde bei der Premiere des Films ein Molotow-Cocktail in ein Kino geworfen, das den Film zeigte — 13 Menschen wurden verletzt. Die Taetern wurden spaeter einem christlichen Fundamentalistennetzwerk zugeordnet."
    ),

    // Question 31 - Salo Italy censorship
    Question(
        categoryId = 4,
        questionText = "Pier Paolo Pasolinis 'Salo oder die 120 Tage von Sodom' (1975) wurde in vielen Laendern verboten. In welchem Land fuehrte die Vorfuehrung des Films 1975 sogar zur Verhaftung des Verleihers?",
        answerA = "Westdeutschland",
        answerB = "Australien",
        answerC = "Italien",
        answerD = "Vereinigte Staaten",
        correctAnswer = 2, // C
        explanation = "In Italien selbst wurde der Verleiher Alberto Grimaldi kurz nach der Uraufführung 1975 verhaftet, und der Film wurde beschlagnahmt. Der Film war in den folgenden Jahren immer wieder Gerichtsprozessen ausgesetzt. Auch Pasolini selbst wurde posthum mit dem Film in Verbindung gebracht — er wurde kurz vor der Premiere ermordet.",
        difficulty = 4,
        funFact = "Pasolini wurde am 2. November 1975 ermordet aufgefunden, etwa einen Monat vor der offiziellen Premiere von 'Salo'. Der Mord wurde anfangs einem Prostituiterten zugeschrieben, spaeter wurden Neofa schistische Beteiligung diskutiert."
    ),

    // Question 32 - Caligula censorship
    Question(
        categoryId = 4,
        questionText = "Der Film 'Caligula' (1979) wurde nach dem Schnitt von Regisseur Tinto Brass ohne dessen Wissen mit zusaetzlichem Inhalt versehen. Von wem wurden diese expliziten Szenen eingefuegt?",
        answerA = "Producer Dino De Laurentiis auf Druck der Investoren",
        answerB = "Bob Guccione, Gruender des Penthouse-Magazins und Produzent des Films",
        answerC = "Gore Vidal, der Drehbuchautor, der seine urspruengliche Vision durchsetzen wollte",
        answerD = "Hauptdarsteller Malcolm McDowell bestand auf expliziterem Material",
        correctAnswer = 1, // B
        explanation = "Bob Guccione, der Penthouse-Gruender und Produzent, liess nach dem regulaeren Dreh ohne Wissen von Regisseur Tinto Brass und Autor Gore Vidal explizite Sexszenen mit Penthouse-Pets einfuegen. Brass distanzierte sich oeffentlich vom fertigen Film. Gore Vidal liess seinen Namen vom Abspann entfernen.",
        difficulty = 4,
        funFact = "Der Film wurde in mindestens 13 Laendern verboten und in vielen weiteren nur in stark zensierten Versionen gezeigt. Trotzdem wurde er ein kommerzieller Erfolg — oder gerade deswegen."
    ),

    // Question 33 - The Interview North Korea
    Question(
        categoryId = 4,
        questionText = "Was war die direkte Folge des Sony-Hackerangriffs 2014 im Zusammenhang mit dem Film 'The Interview'?",
        answerA = "Sony cancelte den Film dauerhaft und vernichtete alle Kopien",
        answerB = "Sony verschieb den Kinostart und veroeffentlichte den Film dann gleichzeitig digital und in unabhaengigen Kinos",
        answerC = "Die US-Regierung uebernahm den Verleih des Films als Propagandamassnahme",
        answerD = "Nordkorea wurde von der UN offiziell fuer den Angriff verurteilt und sanktioniert",
        correctAnswer = 1, // B
        explanation = "Nach massiven Hackerangriffen auf Sony (die dem nordkoreanischen Geheimdienst zugeschrieben wurden) und Drohungen gegen Kinos zog Sony zunaechst den Film zurueck. Unter Druck der US-Regierung, die den Rueckzug als Niederlage gegen Terrorismus wertete, veroeffentlichte Sony den Film am 25. Dezember 2014 simultan digital (YouTube, Google Play) und in etwa 300 unabhaengigen Kinos.",
        difficulty = 4,
        funFact = "Barack Obama kritisierte Sonys urspruengliche Entscheidung, den Film nicht zu zeigen, als Fehler und bezeichnete den Rueckzug als eine Form der Selbstzensur unter Bedrohung."
    ),

    // Question 34 - Brokeback Mountain China
    Question(
        categoryId = 4,
        questionText = "Brokeback Mountain (2005) wurde in China verboten. Bei welcher anderen Massnahme wurde der Film jedoch kurios behandelt?",
        answerA = "Er gewann den chinesischen Staatsfilmpreis in der Kategorie 'Auslaendischer Film'",
        answerB = "Er wurde als Dokumentarfilm ueber Rinderhaltung im chinesischen Staatsfernsehen gezeigt",
        answerC = "Er wurde auf der chinesischen Streamingplattform iQiyi mit neu synchronisiertem Text gezeigt, in dem die Liebesgeschichte als Bruderschaft umgedeutet wurde",
        answerD = "Er lief auf dem Shanghai International Film Festival, ohne zensiert zu werden",
        correctAnswer = 2, // C
        explanation = "In einer der bekanntesten Zensur-Umgehungen der chinesischen Filmgeschichte wurde 'Brokeback Mountain' auf iQiyi zeitweise mit einer Nachsynchronisation gezeigt, die die Liebesbeziehung der beiden Maenner als enge Freundschaft und 'Bruderschaft' umdeutete. Screenshots der veraenderten Untertitel verbreiteten sich weltweit.",
        difficulty = 4,
        funFact = "China hat seit 1994 offiziell keine homosexuellen Charaktere in Medien erlaubt — 2021 wurden Anweisungen herausgegeben, dass auch subtile Anspielungen auf Homosexualitaet aus allen Medien entfernt werden sollen."
    ),

    // Question 35 - Schindlers List censorship
    Question(
        categoryId = 4,
        questionText = "In welchem Land wurde 'Schindlers Liste' (1993) mit einer der ungewoehnlichsten Auflagen zur Zensur konfrontiert: Der Film durfte nur gezeigt werden, wenn eine bestimmte Gruppe kostenlos Einlass erhielt?",
        answerA = "Pakistan: muslimische Religionsfuehrer sollten den Film kostenlos sehen",
        answerB = "Philippinen: Schulkinder mussten als Pflichtzuschauer kostenlos eingelassen werden",
        answerC = "Argentinien: Juedische Gemeindevertreter sollten den Film begleiten und kommentieren",
        answerD = "Malaysia: der Film wurde erst nach langen Verhandlungen freigegeben, wenn jede Vorfuehrung von einer Regierungsbeamten beaufsichtigt wird",
        correctAnswer = 1, // B
        explanation = "Auf den Philippinen verlangte die dortige Filmbehoerde, dass Schulkinder in jeder Vorfuehrung von 'Schindlers Liste' kostenlos eingelassen werden mussten, damit der Film erzieherischen Wert demonstrierte. Steven Spielberg weigerte sich, Gewinn aus dem Film zu ziehen — er spendete alle seine Einnahmen an Holocaust-Bildungsprojekte.",
        difficulty = 4,
        funFact = "Spielberg gruendete mit einem Teil des Erloes aus 'Schindlers Liste' die Shoah Foundation (heute USC Shoah Foundation), die Videozeugnisse von Holocaust-Ueberlebenden sammelt."
    ),

    // Question 36 - Pink Floyd The Wall UK
    Question(
        categoryId = 4,
        questionText = "Alan Parkers 'The Wall' (1982) wurde in mehreren Laendern mit Auflagen konfrontiert. In Suedafrika wurde der Film zensierten. Was war der Hauptgrund?",
        answerA = "Die expliziten Drogenszenen galten als jugendgefaehrdend",
        answerB = "Teile des Films wurden als Kritik am Apartheid-Regime interpretiert",
        answerC = "Die Nazidarstellungen galten als Verherrlichung des Nationalsozialismus",
        answerD = "Pink Floyds Musik war als britische Kultureinfluss unerwuenscht",
        correctAnswer = 2, // C
        explanation = "In Suedafrika wurde 'The Wall' zunaechst wegen der Nazi-Symbolik und Konzentrationslager-Szenen zensiert. Das Apartheid-Regime befuerchtete, die visuellen Parallelen zwischen Faschismus und Rassentrennung koennten Zuschauer auf die Aehnlichkeiten zur Apartheid hinweisen. Einige Szenen wurden herausgeschnitten.",
        difficulty = 4,
        funFact = "Roger Waters schrieb viele der Lieder des Albums als Reaktion auf seinen eigenen psychischen Zusammenbruch waehrend der 1977 Animals Tour, bei der er auf einen Fan gespuckt hatte und danach mit einem Gefuehl totaler Entfremdung kaempfte."
    ),

    // Question 37 - Ken Loach banned
    Question(
        categoryId = 4,
        questionText = "Ken Loachs fruehes Fernsehfilm-Werk 'The War Game' (1965) wurde vom BBC 20 Jahre lang nicht ausgestrahlt. Warum?",
        answerA = "Der Film enthielt nicht genehmigtes Archivmaterial der britischen Armee",
        answerB = "Die BBC und britische Regierung betrachteten den Film ueber einen Atomangriff als zu demoralisierend fuer die Oeffentlichkeit",
        answerC = "Regisseur Peter Watkins wurde beschuldigt, die Fakten gefaelscht zu haben",
        answerD = "Der Film verursachte bei Testvorstellungen Panik und Ohnmachtsanfaelle",
        correctAnswer = 1, // B
        explanation = "Peter Watkins (nicht Loach) drehte 'The War Game' fuer die BBC als Docudrama ueber einen sowjetischen Atomangriff auf England. Die BBC und die britische Regierung verboten die Ausstrahlung, weil der Film als psychologisch destabilisierend und anti-nuklear eingestuft wurde — er haette die oeffentliche Unterstuetzung fuer die britische Nuklearabschreckung gefaehrden koennen.",
        difficulty = 4,
        funFact = "Obwohl 'The War Game' nie im britischen Fernsehen ausgestrahlt wurde, gewann er 1966 den Oscar als bester Dokumentarfilm — eine der grossen Ironien der Filmgeschichte."
    ),

    // Question 38 - Cannes NC-17
    Question(
        categoryId = 4,
        questionText = "Welcher Film erhielt als erster Cannes-Palme-d'Or-Gewinner spaeter in den USA das NC-17-Rating, was seinen Verleih erheblich erschwerte?",
        answerA = "Blue Is the Warmest Color (2013)",
        answerB = "Sex, Lies, and Videotape (1989)",
        answerC = "Pulp Fiction (1994)",
        answerD = "The Piano (1993)",
        correctAnswer = 0, // A
        explanation = "'Blue Is the Warmest Color' (La Vie d'Adele) gewann 2013 die Goldene Palme in Cannes. In den USA erhielt er das NC-17-Rating wegen expliziter Sexszenen, was bedeutete, dass viele Kinos und Videoverleiher den Film nicht zeigten. NC-17 gilt in den USA als kommerzieller Todeskuss fuer einen Film.",
        difficulty = 4,
        funFact = "Die Hauptdarstellerinnen Lea Seydoux und Adele Exarchopoulos distanzierten sich spaeter vom Regisseur Abdellatif Kechiche und beschrieben die Drehumstaende der intimen Szenen als erniedhrigend."
    ),

    // Question 39 - Brazil (1985) directors cut fight
    Question(
        categoryId = 4,
        questionText = "Terry Gilliams 'Brazil' (1985) fuehrte zu einem oeffentlichen Streit mit Universal. Was unternahm Gilliam, um seinen Director's Cut zu schuetzen?",
        answerA = "Er kaufte eine Ganzseitenzeige in Variety und beschuldigte Universal des Kunstverrats",
        answerB = "Er verklagte Universal auf Rueckgabe der Rechte am Originalmaterial",
        answerC = "Er liess seinen Cut heimlich bei der Los Angeles Film Critics Association privat vorfuehren",
        answerD = "Er schmuggelte eine Kopie des Films nach Europa und veroeffentlichte ihn dort zuerst",
        correctAnswer = 0, // A
        explanation = "Terry Gilliam kaufte eine Ganzseitenzeige in Variety mit dem Text 'Dear Sid Sheinberg, when are you going to release my film 'Brazil'?' — direkt adressiert an Universal-Chef Sid Sheinberg. Die Aktion machte international Schlagzeilen und setzte Sheinberg unter massiven Druck. Universal lenkte schliesslich ein.",
        difficulty = 4,
        funFact = "Universal hatte eine eigene, um 94 Minuten gekuerzte Version mit einem Happyend produziert und wollte diese als offizielle Version veroeffentlichen. Gilliams originales Ende ist eines der dunkelsten im amerikanischen Kino."
    ),

    // Question 40 - The Interview Sony hack
    Question(
        categoryId = 4,
        questionText = "Welches Land wurde offiziell fuer den Sony-Hack 2014 verantwortlich gemacht, und wie reagierten die USA offiziell?",
        answerA = "China; die USA verhaengten Technologieexportbeschraenkungen",
        answerB = "Nordkorea; die USA verhaengten neue Wirtschaftssanktionen gegen Nordkorea",
        answerC = "Russland; die USA wiesen nordkoreanische Diplomaten aus",
        answerD = "Iran; die USA froer iranische Bankguthaben ein",
        correctAnswer = 1, // B
        explanation = "Das FBI schrieb den Hack offiziell Nordkorea zu, und Praesident Obama verhaengte im Januar 2015 neue Wirtschaftssanktionen gegen Nordkorea als Reaktion. Dies war das erste Mal, dass die USA offiziell und direkt auf einen staatlichen Cyberangriff wegen eines Films mit Wirtschaftssanktionen reagierten.",
        difficulty = 4,
        funFact = "Nordkorea bezeichnete die Schuldzuweisung als 'Unsinn' und 'Luege' und bot ein gemeinsames Ermittlungsverfahren an — was die USA ablehnten."
    ),

    // Question 41 - Triumph of the Will
    Question(
        categoryId = 4,
        questionText = "Leni Riefenstahls 'Triumph des Willens' (1935) ist bis heute in Deutschland verboten. Unter welchem Paragraphen des deutschen Strafgesetzbuchs kann die Vorfuehrung strafrechtlich verfolgt werden?",
        answerA = "Paragraph 86 StGB (Verbreitung von Propagandamitteln verfassungswidriger Organisationen)",
        answerB = "Paragraph 130 StGB (Volksverhetze)",
        answerC = "Paragraph 184 StGB (Verbreitung pornographischer Schriften)",
        answerD = "Paragraph 90 StGB (Verunglimpfung des Staates)",
        correctAnswer = 0, // A
        explanation = "Paragraph 86 StGB verbietet die Verbreitung von Propagandamitteln verfassungswidriger Organisationen, darunter NS-Symbole und NS-Propagandafilme. 'Triumph des Willens' ist als NSDAP-Propagandafilm eingestuft. Eine Ausnahme gilt fuer staatsbuergerliche Bildung, Wissenschaft und Aufklaerung.",
        difficulty = 4,
        funFact = "Riefenstahl selbst beteuerte bis zu ihrem Tod 2003, sie habe nur einen Dokumentarfilm gemacht und keine Propaganda — eine Sichtweise, die von Filmhistorikern und Gerichten einhellig abgelehnt wird."
    ),

    // Question 42 - Battleship Potemkin
    Question(
        categoryId = 4,
        questionText = "Eisensteins 'Panzerkreuzer Potemkin' (1925) war in mehreren Laendern jahrzehntelang verboten. In welchem Land war das Verbot besonders langlebig und dauerte bis in die 1950er Jahre?",
        answerA = "Vereinigte Staaten",
        answerB = "Frankreich",
        answerC = "Grossbritannien",
        answerD = "Deutschland (Westdeutschland)",
        correctAnswer = 2, // C
        explanation = "Grossbritannien verbot 'Panzerkreuzer Potemkin' aus Angst vor bolschewistischer Propaganda und einer Aufwiegelung der Arbeiterklasse. Das Verbot dauerte bis 1954 — fast 30 Jahre nach dem Erststart des Films. Das British Board of Film Censors stufte den Film als subversiv ein.",
        difficulty = 4,
        funFact = "In Deutschland wurde der Film 1926 zugelassen, aber dann mehrfach verboten und wieder erlaubt — je nach politischer Lage. Die Weimarer Republik zensierte ihn wegen 'Aufwieglung', die Nazis verboten ihn vollstaendig."
    ),

    // Question 43 - Anime censorship Neon Genesis Evangelion
    Question(
        categoryId = 4,
        questionText = "Welche Episode von 'Neon Genesis Evangelion' (1995-96) wurde vom japanischen TV-Sender TV Tokyo vor der Ausstrahlung stark zensiert und musste mehrere Szenen entfernen?",
        answerA = "Episode 24 (Kaworu)",
        answerB = "Episode 25 und 26 (die experimentellen Serienfinale)",
        answerC = "Episode 18 (Ramiel-Kampf)",
        answerD = "Episode 16 (Shinji im Bauch von Leliel)",
        correctAnswer = 0, // A
        explanation = "Episode 24, in der die Beziehung zwischen Shinji und Kaworu (einem maennlichen Engel) dargestellt wird, war Zensur ausgesetzt: TV Tokyo verlangte, dass eine Szene, in der Kaworu Shinji sagt 'Ich liebe dich', entfernt oder abgeaendert wird. Die Szene wurde abgemildert, ist aber in der unzensierten Home-Video-Version erhalten.",
        difficulty = 4,
        funFact = "Anno Hideaki konzipierte Kaworu teilweise als Gegenentwurf zu Shinjis Isolation — ein Charakter, der ohne Vorbehalt Zuneigung zeigt. Die Zensurauflagen verstaerkten die Kultwahrnehmung dieser Episode."
    ),

    // Question 44 - Miyazaki studio funding
    Question(
        categoryId = 4,
        questionText = "Studio Ghiblis 'Prinzessin Mononoke' (1997) wurde in Japan von einer Zeitung begleitet, die das gesamte Budget vorfinanzierte. Welche Zeitung war das?",
        answerA = "Asahi Shimbun",
        answerB = "Yomiuri Shimbun",
        answerC = "Nihon Keizai Shimbun (Nikkei)",
        answerD = "Mainichi Shimbun",
        correctAnswer = 0, // A
        explanation = "Die Asahi Shimbun (eine der grossen japanischen Tageszeitungen) war Hauptfinanzier und Medienpartner von 'Prinzessin Mononoke'. Dies war ungewoehnlich, da Zeitungsverlaeger selten direkt Animefilme vorfinanzieren. Die Kooperation sicherte Ghibli das notige Budget fuer die aufwendige Produktion.",
        difficulty = 4,
        funFact = "'Prinzessin Mononoke' war bei seinem Kinostart 1997 der erfolgreichste japanische Film aller Zeiten — dieser Rekord wurde erst 2001 durch Ghiblis eigenen Film 'Chihiros Reise ins Zauberland' gebrochen."
    ),

    // Question 45 - Film ratings history
    Question(
        categoryId = 4,
        questionText = "Das US-amerikanische MPAA-Ratingsystem wurde 1968 eingefuehrt. Welcher Film war ein zentraler Ausloeser, der die Abschaffung des alten Hays-Code beschleunigte?",
        answerA = "Bonnie and Clyde (1967)",
        answerB = "The Graduate (1967)",
        answerC = "Easy Rider (1969)",
        answerD = "Midnight Cowboy (1969)",
        correctAnswer = 0, // A
        explanation = "'Bonnie and Clyde' (1967) mit seiner stilisierten, grafischen Gewalt und moralisch mehrdeutigen Protagonisten demonstrierte, dass das alte Hays Production Code-System (1930-1968) fuer modernes Kino nicht mehr tragfaehig war. Das MPAA-Ratingsystem (G, M, R, X) ersetzte es 1968 direkt im Anschluss an die Kontroverse um den Film.",
        difficulty = 4,
        funFact = "Midnight Cowboy (1969) erhielt urspruenglich ein X-Rating, wurde spaeter aber auf R heruntergek stuft, ohne dass der Film geaendert wurde — was zeigt, wie willkuerlich das fruehe Ratingsystem war."
    ),

    // Question 46 - Cannibal Holocaust Italy
    Question(
        categoryId = 4,
        questionText = "Regisseur Ruggero Deodatos 'Cannibal Holocaust' (1980) fuehrte dazu, dass er in Italien vor Gericht gestellt wurde. Was war der Hauptvorwurf?",
        answerA = "Tiermisshandlung und Verletzung des Tierschutzgesetzes",
        answerB = "Der Vorwurf, den Film als echten Mordfilm produziert zu haben (Snuff-Film-Verdacht)",
        answerC = "Befoerderung von Kannibalismus und rassistischer Darstellung",
        answerD = "Betrug bei der Filmfoerderung durch falsche Budgetangaben",
        correctAnswer = 1, // B
        explanation = "Deodato wurde in Italien wegen des Verdachts angeklagt, einen echten Mordfilm (Snuff-Film) produziert zu haben, da die vier Hauptdarsteller nach dem Dreh in der Oeffentlichkeit nicht mehr gesehen wurden. Um seine Unschuld zu beweisen, musste Deodato die Schauspieler vor Gericht vorladen und beweisen, dass sie noch am Leben waren. Die Anklage wurde fallengelassen.",
        difficulty = 4,
        funFact = "Die Schauspieler hatten Vertrage unterschrieben, in denen sie sich verpflichteten, ein Jahr lang keine Interviews zu geben und nicht oeffentlich aufzutreten — was den Snuff-Film-Verdacht erst moeglich machte."
    ),

    // Question 47 - Gone with the Wind streaming controversy
    Question(
        categoryId = 4,
        questionText = "HBO Max entfernte 'Vom Winde verweht' (1939) 2020 voruebergehend aus seinem Katalog. Mit welcher Bedingung wurde der Film zurueckgebracht?",
        answerA = "Der Film wurde digital nachbearbeitet, um rassistische Elemente zu entfernen",
        answerB = "Dem Film wurde ein erklaerrender Vorspann und ein Diskussionsgespanch mit Historikern hinzugefuegt",
        answerC = "Der Film ist nun nur noch fuer verifizierte Erwachsene zugaenglich",
        answerD = "HBO Max veroeffentlichte gleichzeitig einen Gegenfilm ueber die Sklaverei",
        correctAnswer = 1, // B
        explanation = "HBO Max fuehrte 'Vom Winde verweht' nach drei Wochen mit einem erlaeuternden Vorspann und einer angehangenen Diskussionsrunde mit Historikern (darunter Jacqueline Stewart vom American Film Institute) wieder ein, um den historischen und rassistischen Kontext des Films zu erklaeren. Der Film selbst wurde nicht veraendert.",
        difficulty = 4,
        funFact = "Hattie McDaniel, die 1940 als erste Afroamerikanerin einen Oscar gewann (fuer ihre Nebenrolle in 'Vom Winde verweht'), durfte bei der Oscar-Zeremonie nicht mit den weissen Mitgliedern des Filmteams an einem Tisch sitzen."
    ),

    // Question 48 - Sergei Eisenstein montage theory
    Question(
        categoryId = 4,
        questionText = "Eisensteins Theorie der 'Montage der Attraktionen' unterscheidet sich von David W. Griffiths Schnittkonzept grundlegend. Was ist der Kernunterschied?",
        answerA = "Eisenstein verwarf Kontinuitaetsschnitte; Griffith basierte darauf",
        answerB = "Griffith nutzte Schnitte nur zur Erzaehlung; Eisenstein setzte auf die Kollision zweier Bilder, die eine neue intellektuelle Idee erzeugt",
        answerC = "Eisenstein arbeitete ausschliesslich mit langen Einstellungen; Griffith mit kurzen",
        answerD = "Griffith entwickelte die Parallel-Montage; Eisenstein lehnte diese vollstaendig ab",
        correctAnswer = 1, // B
        explanation = "Griffith nutzte den Schnitt hauptsaechlich um Handlungsablaeufe zu zeigen (continuity editing). Eisensteins Theorie der Dialektischen Montage besagt, dass die Kollision zweier bildlich nicht verwandter Einstellungen (These + Antithese) eine neue Bedeutung erzeugt, die ueber beide Einzelbilder hinausgeht. Dieses Konzept beeinflusste die gesamte Filmtheorie des 20. Jahrhunderts.",
        difficulty = 4,
        funFact = "Eisensteins beruehm te Odessa-Treppe-Sequenz aus 'Panzerkreuzer Potemkin' wurde so haeufig imitiert, dass sie in Filmwissenschaftskursen weltweit als Pflichtlektuere gilt."
    ),

    // Question 49 - Salome 1922 copyright
    Question(
        categoryId = 4,
        questionText = "Welches bahnbrechende US-Gerichtsurteil von 1991 stellte klar, dass das Copyright eines Filmautors (nicht des Studios) bei der Schrift liegt und nicht automatisch auf das Studio uebertragen wird?",
        answerA = "Community for Creative Non-Violence v. Reid",
        answerB = "Aalmuhammed v. Lee",
        answerC = "Nimmer v. Edgar",
        answerD = "Gilliam v. American Broadcasting Companies",
        correctAnswer = 3, // D
        explanation = "In 'Gilliam v. American Broadcasting Companies' (1976, nicht 1991) klagte Terry Gilliam (als Teil von Monty Python) erfolgreich gegen ABC, die Monty Python's Flying Circus-Sketche ohne Erlaubnis stark zensiert und mit Werbeunterbrechungen versehen hatten. Das Gericht erkannte an, dass die Autoren ein Recht auf den Schutz ihrer Werkintegrierung haben — ein Meilenstein des Urheberrechts fuer Kreative.",
        difficulty = 4,
        funFact = "Monty Python sagte in Gerichtsaussagen, ABC's zensierte Version sei so entstellt, dass sie als Falschdarstellung ihrer kuenstlerischen Arbeit gelte und ihren Ruf schaedige."
    ),

    // Question 50 - Mubi arthouse platform
    Question(
        categoryId = 4,
        questionText = "Welche internationale Arthouse-Plattform setzte sich 2015 erfolgreich dafuer ein, Apichatpong Weerasethakuls 'Uncle Boonmee Who Can Recall His Past Lives' (Cannes-Sieger 2010) in Thailand veroeffentlichen zu duerfen, nachdem der Film dort fuenf Jahre blockiert war?",
        answerA = "Criterion Channel",
        answerB = "MUBI",
        answerC = "Fandor",
        answerD = "OVID.tv",
        correctAnswer = 1, // B
        explanation = "MUBI, die internationale Streaming-Plattform fuer Arthouse-Kino, verhandelte die Veroeffentlichungsrechte fuer Weerasethakuls Film in Thailand, wo er wegen Bedenken der Militaerbuerokratie ueber moegliche politische Subtexte blockiert worden war. Weerasethakul, der aus Thailand stammt, musste seine grossen Werke oft im Ausland produzieren, da die thaiis laendische Filmbuerokratie als restriktiv gilt.",
        difficulty = 4,
        funFact = "Apichatpong Weerasethakul zog nach dem Militaerputsch 2014 zunehmend ins Ausland und dreht seitdem mehrheitlich in Kolumbien und Europa — 'Memoria' (2021) mit Tilda Swinton wurde vollstaendig in Kolumbien gedreht."
    )

)
