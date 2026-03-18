package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun filmQuestionsHard4(): List<Question> = listOf(

    // ── CITIZEN KANE: INNOVATIONS ─────────────────────────────────────────────

    // Question 1 – Citizen Kane: Deep focus photography
    Question(
        categoryId = 4,
        questionText = "Welche revolutionaere Kameratechnik nutzte Orson Welles in 'Citizen Kane' (1941), um vordere und hintere Bildebenen gleichzeitig scharf abzubilden?",
        answerA = "Splitscreen-Komposition",
        answerB = "Tiefenschaerfe (Deep Focus)",
        answerC = "Anamorphotische Linsen",
        answerD = "Rearscreen-Projektion",
        correctAnswer = 1, // B
        explanation = "Kameramann Gregg Toland entwickelte fuer 'Citizen Kane' die Technik der extremen Tiefenschaerfe (Deep Focus), bei der sowohl Vorder- als auch Hintergrund gleichzeitig scharf sind. Dazu kombinierte er hochsensible Film-Emulsionen mit sehr kleiner Blende.",
        difficulty = 3,
        funFact = "Gregg Toland bat Orson Welles selbst, an 'Citizen Kane' mitzuarbeiten - ein hochst ungewoehnlicher Schritt fuer einen etablierten Kameramann."
    ),

    // Question 2 – Citizen Kane: Low-angle shots
    Question(
        categoryId = 4,
        questionText = "Um bei 'Citizen Kane' extreme Untersichten (Low-Angle-Shots) ohne sichtbare Studiodecke zu realisieren, liess Orson Welles etwas Besonderes bauen. Was?",
        answerA = "Transparente Glasboeden unter den Schauspielern",
        answerB = "Abgehangene Leinwanddecken, die mit Geraeuschd aemmung ausgekleidet wurden",
        answerC = "Echte Betondecken im Set, unter die die Kamera eingegraben wurde",
        answerD = "Digitale Nachbearbeitung der Decken im Labor",
        correctAnswer = 1, // B
        explanation = "Fuer 'Citizen Kane' wurden erstmals fuer einen Hollywoodfilm echte Decken in die Sets eingebaut - konkret schalld aemmende Leinwanddecken. Dadurch konnte die Kamera extrem von unten filmen und trotzdem eine realistische Raumwirkung erzielen.",
        difficulty = 3,
        funFact = "Diese Technik beeinflusste Generationen von Filmemachern. Stanley Kubrick studierte 'Citizen Kane' intensiv, bevor er seine eigenen Filme drehte."
    ),

    // Question 3 – Citizen Kane: Non-linear narrative
    Question(
        categoryId = 4,
        questionText = "Welche Erz aehltechnik machte 'Citizen Kane' zum Vorreiter und war fuer Hollywood 1941 hochst ungewoehnlich?",
        answerA = "Voiceover-Narration durch den Protagonisten",
        answerB = "Rueckblenden aus mehreren sich widersprechenden Perspektiven",
        answerC = "Echtzeit-Erzaehlung ohne Zeitsprunge",
        answerD = "Parallelmontage zweier zeitgleicher Handlungen",
        correctAnswer = 1, // B
        explanation = "Citizen Kane erz ahlt die Geschichte von Charles Foster Kane durch Rueckblenden mehrerer Zeugen, deren Erinnerungen sich teilweise widersprechen. Diese vielstimmige, nicht-lineare Struktur war fuer Hollywood 1941 revolutionaer und ist heute ein Standardwerkzeug des Autorenfilms.",
        difficulty = 3,
        funFact = "Die beruehmte letzte Einstellung mit dem Schlitten 'Rosebud' gibt dem Publikum eine Information, die keiner der Interviewten je erfahren hat - eine bewusste Ironie Welles'."
    ),

    // Question 4 – Citizen Kane: Makeup and aging
    Question(
        categoryId = 4,
        questionText = "Welches technische Mittel setzte Orson Welles in 'Citizen Kane' ein, um seinen Protagonisten von der Jugend bis ins Greisenalter zu zeigen, ohne Doppelgaenger zu verwenden?",
        answerA = "Computeranimierte Alterungseffekte",
        answerB = "Komplexes Prothesen-Makeup, entwickelt von Maurice Seiderman",
        answerC = "Stimmveraenderung per Nachvertonung im Tonstudio",
        answerD = "Rucklaeufige Projektion kombiniert mit Trickbelichtung",
        correctAnswer = 1, // B
        explanation = "Makeup-Artist Maurice Seiderman entwickelte fuer Orson Welles in 'Citizen Kane' bis zu diesem Zeitpunkt nie dagewesene Prothesen-Masken, um den Schauspieler als jungen Mann, mittelalterlichen Tycoon und greisen Millionaer darzustellen - alles ohne Doppelgaenger.",
        difficulty = 3,
        funFact = "Maurice Seiderman erhielt fuer seine Arbeit an 'Citizen Kane' keine Oscar-Nominierung, weil die Makeup-Kategorie damals noch nicht existierte."
    ),

    // ── VERTIGO: CAMERA TECHNIQUES ────────────────────────────────────────────

    // Question 5 – Vertigo: Dolly zoom
    Question(
        categoryId = 4,
        questionText = "Welcher Name wird dem in Hitchcocks 'Vertigo' (1958) beruehmt gewordenen Kameraeffekt gegeben, bei dem die Kamera zurueckf ahrt, waehrend das Objektiv gleichzeitig heran-zoomt?",
        answerA = "Parallax-Shot",
        answerB = "Dolly Zoom (auch: Hitchcock-Zoom oder Trombone-Shot)",
        answerC = "Rack Focus",
        answerD = "Smash Zoom",
        correctAnswer = 1, // B
        explanation = "Der Dolly Zoom, auch Hitchcock-Zoom oder Vertigo-Effekt genannt, erzeugt ein Gefuehl von Desorientierung: Die Kamera bewegt sich von der Figur weg, waehrend das Zoomobjektiv gleichzeitig heranfaehrt. Hintergrund und Figur wirken dabei raeumlich dissoziiert.",
        difficulty = 3,
        funFact = "Kameramann Irmin Roberts entwickelte den Effekt fuer 'Vertigo'. Er wurde spaeter unter anderem in 'Jaws' und 'Goodfellas' wiederverwendet."
    ),

    // Question 6 – Vertigo: Location
    Question(
        categoryId = 4,
        questionText = "An welchem historischen Gebaeude in Kalifornien wurde die Schlussszene von 'Vertigo' gedreht, in der Judy von einem Kirchturm faellt?",
        answerA = "Mission San Juan Capistrano",
        answerB = "Mission Dolores in San Francisco",
        answerC = "Mission San Juan Bautista",
        answerD = "Alcatraz-Leuchtturm",
        correctAnswer = 2, // C
        explanation = "Die Turm-Szenen in 'Vertigo' wurden an der Mission San Juan Bautista in Kalifornien gedreht. Der Turm selbst existierte dort nicht - er wurde durch Matte Painting und Modelle erganzt, da die echte Mission keinen hohen Glockenturm hat.",
        difficulty = 3,
        funFact = "Hitchcock liess den oberen Teil des Kirchturms komplett im Studio nachbauen, da der echte Turm der Mission seit einem Erdbeben 1906 nicht mehr stand."
    ),

    // Question 7 – Vertigo: Color symbolism
    Question(
        categoryId = 4,
        questionText = "In 'Vertigo' traegt Madeleine/Judy eine bestimmte Farbe, die als Symbol fuer ihre Unterwelt-Konnotation und Scotties Obsession gilt. Welche?",
        answerA = "Tiefes Rot",
        answerB = "Schwarz",
        answerC = "Gruen",
        answerD = "Weiss",
        correctAnswer = 2, // C
        explanation = "Madeleine (und spaeter Judy) traegt konsequent Gruen - Gruen gilt im Farbsymbolismus des Films als Farbe der Besessenheit, des Trugbilds und des Todes. Die gruene Neonbeleuchtung in der Szene, in der Judy sich in Madeleine verwandelt, ist ein ikonischer Hitchcock-Moment.",
        difficulty = 3,
        funFact = "Kostuemubildnerin Edith Head entwarf Madeleines ikonischen grauen Anzug nach Hitchcocks praezisen Anweisungen - ein bewusstes Kuehlheit-Signal."
    ),

    // ── PSYCHO: SHOWER SCENE ──────────────────────────────────────────────────

    // Question 8 – Psycho: Shower scene length
    Question(
        categoryId = 4,
        questionText = "Aus wie vielen Einzelschnitten (Cuts) besteht die beruechmte Duschen-Szene in Hitchcocks 'Psycho' (1960) ungefaehr?",
        answerA = "Etwa 20 Schnitte",
        answerB = "Etwa 50 Schnitte",
        answerC = "Etwa 70 Schnitte",
        answerD = "Ueber 100 Schnitte",
        correctAnswer = 2, // C
        explanation = "Die Duschszene in 'Psycho' dauert nur ca. 45 Sekunden, besteht aber aus rund 70 Einzelschnitten - eine fuer 1960 extreme Schnittfrequenz. Hitchcock und Cutter George Tomasini nutzten dieses Staccato, um maximale Panik zu erzeugen, ohne je explizit das Messer in der Haut zu zeigen.",
        difficulty = 3,
        funFact = "Janet Leigh berichtete, dass die Duschszene eine Woche lang gedreht wurde. Sie selbst mied danach jahrelang das Duschen und nahm nur noch Baeder."
    ),

    // Question 9 – Psycho: Music
    Question(
        categoryId = 4,
        questionText = "Welchen ungewoehnlichen Orchesterklang setzte Bernard Herrmann in der Duschszene von 'Psycho' ein, der seitdem fuer Horrorfilme kanonisch wurde?",
        answerA = "Nur Schlagzeug ohne Melodie",
        answerB = "Ausschliesslich Streichinstrumente, keine Blaeser oder Klaviere",
        answerC = "Elektronische Synthesizerklange",
        answerD = "Solovioline mit Harfe",
        correctAnswer = 1, // B
        explanation = "Bernard Herrmanns Partitur fuer 'Psycho' verwendete ausschliesslich Streichinstrumente - keine Blaeser, kein Klavier. Die schreienden, peitschenden Streicher-Akkorde ('col legno'-Technik) imitieren Messerstiche und schufen einen voellig neuen Horror-Sound.",
        difficulty = 3,
        funFact = "Hitchcock wollte die Duschszene urspruenglich ohne Musik lassen. Herrmann spielte ihm seine Komposition heimlich vor - Hitchcock war sofort ueberzeugt und verdoppelte Herrmanns Gage."
    ),

    // Question 10 – Psycho: Star death
    Question(
        categoryId = 4,
        questionText = "Welchen dramaturgischen Schock erzeugte Hitchcock in 'Psycho', indem er Janet Leigh bereits im ersten Drittel des Films sterben liess?",
        answerA = "Er brach mit der Konvention, den Hauptstar bis zum Ende am Leben zu lassen",
        answerB = "Er drehte die Szene, um Zensur zu umgehen, erst spaeter nach",
        answerC = "Er verdoppelte das Budget fuer die restlichen Szenen ohne Leigh",
        answerD = "Er tauschte die Reihenfolge der Szenen im Schneideraum",
        correctAnswer = 0, // A
        explanation = "Hitchcock brach bewusst mit der Hollywoodkonvention, indem er den teuersten Star des Films - Janet Leigh - im ersten Drittel sterben liess. Das Publikum war schockiert, weil man gewohnt war, den Hauptstar bis zum Ende zu verfolgen. Dies schuf eine voellig neue Form von Spannung.",
        difficulty = 3,
        funFact = "Hitchcock kaufte heimlich alle Exemplare des Romans auf, damit das Ende nicht vorab bekannt wurde - und verbot spaete Einlaesse in Kinos waehrend der Vorstellungen."
    ),

    // ── SCREENPLAY STRUCTURES ─────────────────────────────────────────────────

    // Question 11 – Three-act structure: Origin
    Question(
        categoryId = 4,
        questionText = "Auf welchem antiken Text basiert die klassische Drei-Akt-Struktur im Drehbuch, wie sie Syd Field in den 1970ern popularisierte?",
        answerA = "Homers 'Ilias'",
        answerB = "Aristoteles' 'Poetik'",
        answerC = "Platos 'Symposion'",
        answerD = "Sophokles' 'Oedipus Rex'",
        correctAnswer = 1, // B
        explanation = "Die Drei-Akt-Struktur geht auf Aristoteles' 'Poetik' zurueck, in der er Anfang, Mitte und Ende als grundlegende Strukturelemente einer Tragoedie beschreibt. Syd Field uebertrug dieses Modell 1979 in seinem Buch 'Screenplay' auf das moderne Hollywood-Drehbuch.",
        difficulty = 3,
        funFact = "Syd Fields Buch 'Screenplay' gilt als meistverkauftes Drehbuchbuch aller Zeiten und ist an fast jeder Filmschule Pflichtlekture."
    ),

    // Question 12 – Save the Cat: Beat sheet
    Question(
        categoryId = 4,
        questionText = "Blake Snyders 'Save the Cat'-Methode definiert 15 Story-Beats. Was beschreibt der Beat 'Save the Cat' selbst?",
        answerA = "Der Held rettet buchstaeblich ein Tier, um seine moralische Staerke zu zeigen",
        answerB = "Eine fruehe Szene, in der der Held sympathisch wirkt und das Publikum ihn mag",
        answerC = "Der tiefste Punkt des Protagonisten kurz vor dem dritten Akt",
        answerD = "Die erste Konfrontation zwischen Held und Antagonist",
        correctAnswer = 1, // B
        explanation = "Bei Snyder ist 'Save the Cat' ein Oberbegriff fuer den ersten Story-Beat nach der Einleitung: eine Szene, in der der Held etwas Sympathisches tut - buchstaeblich eine Katze zu retten oder eine alte Dame zu helfen - damit das Publikum ihn mag, bevor die Schwierigkeiten beginnen.",
        difficulty = 3,
        funFact = "Blake Snyders Methode wird von Hollywood-Produzenten genutzt, um Drehbuecher schnell zu bewerten - und von vielen Autoren gleichermassen gelobt wie kritisiert."
    ),

    // Question 13 – Hero's Journey: Campbell
    Question(
        categoryId = 4,
        questionText = "Joseph Campbells Monomythos ('Held mit tausend Gesichtern', 1949) beschreibt die Heldenreise in drei Phasen. Wie lauten sie?",
        answerA = "Einleitung - Konfrontation - Aufloesung",
        answerB = "Aufbruch - Initiation - Rueckkehr",
        answerC = "Ruf - Bewaehrung - Triumph",
        answerD = "Sehnsucht - Prufung - Transformation",
        correctAnswer = 1, // B
        explanation = "Campbell beschreibt den Monomythos in drei Phasen: Aufbruch (Separation vom Bekannten), Initiation (Prufungen und Transformation in der fremden Welt) und Rueckkehr (Heimkehr als verwandelter Held mit dem gewonnenen Elixier).",
        difficulty = 3,
        funFact = "George Lucas studierte Campbells Werk intensiv vor dem Schreiben von 'Star Wars' und bedankte sich oeffentlich bei Campbell fuer die Inspiration."
    ),

    // Question 14 – Screenplay: Midpoint
    Question(
        categoryId = 4,
        questionText = "Was beschreibt der Begriff 'Midpoint' in der Drei-Akt-Drehbuchstruktur nach Syd Field?",
        answerA = "Die Seite 50 von 110, an der der erste grosse Wendepunkt eintritt",
        answerB = "Ein zentrales Ereignis auf der Mitte des zweiten Akts, das die Handlung neu ausrichtet",
        answerC = "Der Moment, in dem Protagonist und Antagonist zum ersten Mal direkt aufeinanderprallen",
        answerD = "Die Seite, an der der Protagonist sein Ziel erstmals klar benennt",
        correctAnswer = 1, // B
        explanation = "Der Midpoint (typisch um Seite 55-60 eines 110-seitigen Drehbuchs) ist ein zentrales Ereignis in der Mitte des zweiten Akts: Es veraendert die Richtung der Geschichte, erhoehst den Einsatz oder verschiebt das Gleichgewicht zwischen Held und Antagonist entscheidend.",
        difficulty = 3,
        funFact = "In 'Star Wars' ist der Midpoint die Szene, in der Luke Skywalker Obi-Wan Kenobi sterben sieht - ab diesem Moment aendert sich seine Motivation fundamental."
    ),

    // Question 15 – Hero's Journey: Threshold Guardian
    Question(
        categoryId = 4,
        questionText = "Was beschreibt in Campbells Heldenreise der Begriff 'Threshold Guardian' (Schwellenwacht)?",
        answerA = "Der Mentor, der den Helden in die fremde Welt einfuehrt",
        answerB = "Eine Figur oder Kraft, die den Helden am Ueberschreiten der ersten Schwelle hindert",
        answerC = "Der finale Antagonist des dritten Akts",
        answerD = "Das innere Gewissen des Helden, das ihn zur Umkehr bewegt",
        correctAnswer = 1, // B
        explanation = "Der Threshold Guardian ist eine Figur oder Kraft, die den Helden am Ueberschreiten der ersten Schwelle in die fremde Welt hindert oder prueft. Er ist kein Hauptantagonist, sondern ein Test der Entschlossenheit - oft ein fruherer Held oder eine korrumpierte Figur.",
        difficulty = 3,
        funFact = "In 'Der Herr der Ringe' erfuellt Saruman die Rolle des Threshold Guardian: Er sollte schuetzen, entscheidet sich aber fuer die dunkle Seite."
    ),

    // ── CASTING: ALMOST-CAST STORIES ─────────────────────────────────────────

    // Question 16 – Indiana Jones almost-cast
    Question(
        categoryId = 4,
        questionText = "Welcher Schauspieler war Spielbergs erste Wahl fuer Indiana Jones, bevor Harrison Ford die Rolle uebernahm?",
        answerA = "Tom Selleck",
        answerB = "Jeff Bridges",
        answerC = "Nick Nolte",
        answerD = "Burt Reynolds",
        correctAnswer = 0, // A
        explanation = "Tom Selleck wurde als Indiana Jones gecastet, musste die Rolle aber ablehnen, weil er vertraglich an die TV-Serie 'Magnum, P.I.' gebunden war. Harrison Ford, der zuvor bereits in Spielbergs 'Star Wars' mitgewirkt hatte, uebernahm die Rolle.",
        difficulty = 3,
        funFact = "Spielberg wollte Harrison Ford ursprunglich nicht besetzen, weil er nicht immer mit denselben Schauspielern arbeiten wollte - George Lucas ueberzeugte ihn schliesslich."
    ),

    // Question 17 – The Terminator almost-cast
    Question(
        categoryId = 4,
        questionText = "Welcher Schauspieler war urspruenglich fuer die Rolle des Kyle Reese in 'The Terminator' (1984) vorgesehen, bevor er stattdessen den Terminator spielte?",
        answerA = "Mel Gibson",
        answerB = "Arnold Schwarzenegger",
        answerC = "Sylvester Stallone",
        answerD = "Chuck Norris",
        correctAnswer = 1, // B
        explanation = "Arnold Schwarzenegger sprach urspruenglich fuer die Rolle des Kyle Reese vor. James Cameron war von Schwarzeneggers Ausdruckskraft so beeindruckt, dass er ihm stattdessen die Hauptrolle des Terminators anbot - eine Entscheidung, die den Film praegen sollte.",
        difficulty = 3,
        funFact = "Der ursprungliche Terminator-Darsteller in Camerons Drehbuch sollte eher unscheinbar und unauffaellig sein - Schwarzeneggers physische Praesenz veraenderte das Konzept grundlegend."
    ),

    // Question 18 – Forrest Gump almost-cast
    Question(
        categoryId = 4,
        questionText = "Welcher Komiker lehnte die Rolle des Forrest Gump ab, weil er das Skript nicht verstand oder es fuer nicht lustig genug hielt?",
        answerA = "Bill Murray",
        answerB = "Chevy Chase",
        answerC = "John Candy",
        answerD = "John Travolta",
        correctAnswer = 3, // D
        explanation = "John Travolta lehnte die Rolle des Forrest Gump ab. Er sagte spaeter, es sei eine der groessten Fehlentscheidungen seiner Karriere gewesen. Tom Hanks, der die Rolle annahm, gewann dafuer seinen zweiten Oscar in Folge.",
        difficulty = 3,
        funFact = "Neben John Travolta lehnten auch Bill Murray und Chevy Chase die Rolle ab. Tom Hanks war letztlich die vierte Wahl der Produzenten."
    ),

    // Question 19 – The Matrix almost-cast
    Question(
        categoryId = 4,
        questionText = "Welcher Schauspieler lehnte die Rolle des Neo in 'The Matrix' (1999) ab und bereute diese Entscheidung spaeter oeffentlich?",
        answerA = "Brad Pitt",
        answerB = "Nicolas Cage",
        answerC = "Will Smith",
        answerD = "Johnny Depp",
        correctAnswer = 2, // C
        explanation = "Will Smith lehnte die Rolle des Neo ab und drehte stattdessen 'Wild Wild West'. Er erklarte spaeter in Interviews, er habe das Konzept nicht verstanden und zweifle daran, ob er die Rolle haette gleich gut spielen koennen wie Keanu Reeves.",
        difficulty = 3,
        funFact = "Auch Nicolas Cage und Brad Pitt wurden fuer Neo in Betracht gezogen. Der erste Wahl-Kandidat der Wachowski-Schwestern war tatsaechlich Vin Diesel."
    ),

    // Question 20 – Casablanca almost-cast
    Question(
        categoryId = 4,
        questionText = "Welcher Schauspieler war fuer die Hauptrolle in 'Casablanca' (1942) im Gesprach, bevor Humphrey Bogart besetzt wurde?",
        answerA = "Cary Grant",
        answerB = "James Cagney",
        answerC = "George Raft",
        answerD = "Spencer Tracy",
        correctAnswer = 2, // C
        explanation = "George Raft war die erste Wahl fuer Rick Blaine in 'Casablanca', lehnte die Rolle jedoch ab, weil er Regisseur Michael Curtiz nicht mochte und das Drehbuch fuer unfertig hielt. Humphrey Bogart, der die Rolle uebernahm, machte sie zu seiner ikonischsten Leistung.",
        difficulty = 3,
        funFact = "George Raft lehnte in seiner Karriere auch Rollen in 'The Maltese Falcon' und 'High Sierra' ab - alles Filme, die Humphrey Bogart zum Superstar machten."
    ),

    // ── FAMOUS MOVIE SETS AND LOCATIONS ──────────────────────────────────────

    // Question 21 – Lawrence of Arabia: Location
    Question(
        categoryId = 4,
        questionText = "In welchem Land wurden die beruehmten Wuestenszenen in David Leans 'Lawrence von Arabien' (1962) hauptsaechlich gedreht?",
        answerA = "Arabien (Saudi-Arabien)",
        answerB = "Marokko und Spanien (Almeria)",
        answerC = "Jordanien (Wadi Rum) und Marokko",
        answerD = "Aegypten und Libyen",
        correctAnswer = 2, // C
        explanation = "Die Hauptdreharbeiten von 'Lawrence von Arabien' fanden in Jordanien (Wadi Rum - der Wadi Rum diente als Aqaba-Surrogat) und Marokko (Ouarzazate und Erfoud fuer Kairo-Szenen) statt. Einige Szenen entstanden auch in Almeria, Spanien.",
        difficulty = 3,
        funFact = "Regisseur David Lean drehte 'Lawrence von Arabien' auf 65-mm-Film fuer maximale Bildqualitaet - der Film wurde auf einer 6m breiten Leinwand praesentiert."
    ),

    // Question 22 – Metropolis: Set construction
    Question(
        categoryId = 4,
        questionText = "Wie viele Komparsen wurden fuer die Massenszenen in Fritz Langs 'Metropolis' (1927) beschaeftigt, was zu einer der aufwendigsten Produktionen der Stummfilmaera machte?",
        answerA = "Ca. 5.000",
        answerB = "Ca. 11.000",
        answerC = "Ca. 37.000",
        answerD = "Ca. 80.000",
        correctAnswer = 2, // C
        explanation = "Fuer 'Metropolis' wurden rund 37.000 Komparsen und 750 Kinder eingesetzt. Die Produktion dauerte rund 17 Monate und kostete damals etwa 5 Millionen Reichsmark - das teuerste jemals in Deutschland produzierte Filmprojekt bis zu diesem Zeitpunkt.",
        difficulty = 3,
        funFact = "Die Miniaturmodelle der Zukunftsstadt wurden groesstenteils von Otto Hunte, Erich Kettelhut und Karl Vollbrecht entworfen - sie dienten spaeter als Vorlage fuer viele Science-Fiction-Filmsets."
    ),

    // Question 23 – Ben-Hur: Chariot race
    Question(
        categoryId = 4,
        questionText = "Auf welcher romischen Rennbahn wurde das Modell fuer die spektakulaere Wagenrennen-Szene in 'Ben-Hur' (1959) aufgebaut, die als groesstes jemals gebautes Filmset gilt?",
        answerA = "Circus Maximus in Rom (Originalgelaende)",
        answerB = "Cinecitta Studios, Rom (eigens gebautes Modell)",
        answerC = "MGM-Studiogel aende, Culver City, Kalifornien",
        answerD = "Pinewood Studios, London",
        correctAnswer = 2, // C
        explanation = "Das Circus-Maximus-Set fuer 'Ben-Hur' (1959) wurde in den MGM-Studios in Culver City, Kalifornien, erbaut - es war 300 Meter lang, 90 Meter breit und fasste 8.000 Komparsen. Allein der Bau dauerte ein Jahr und kostete 1 Million Dollar.",
        difficulty = 3,
        funFact = "Fuer die Wagenrennen-Szene wurden 15.000 Komparsen und 200 Kamele eingesetzt. Stunts chef Yakima Canutt koordinierte die gefaehrlichen Szenen, bei denen kein einziger Mensch oder Pferd verletzt wurde."
    ),

    // Question 24 – Blade Runner: Filming location
    Question(
        categoryId = 4,
        questionText = "Welches echte Geb aude in Los Angeles diente als Vorlage und teilweise als Drehort fuer das Tyrell-Konzern-Geb aude in Ridley Scotts 'Blade Runner' (1982)?",
        answerA = "Bradbury Building",
        answerB = "Ennis House (Frank Lloyd Wright)",
        answerC = "Bonaventure Hotel",
        answerD = "Union Station",
        correctAnswer = 1, // B
        explanation = "Das Ennis House, ein von Frank Lloyd Wright entworfenes Haus aus Maya-Ornamenten (Textile Block-Technik), diente als Vorlage fuer Rick Deckards Wohnung und beeinflusste das Design des Tyrell-Gebaeudes. Es ist das markanteste Architektur-Zitat in Blade Runner.",
        difficulty = 3,
        funFact = "Das Bradbury Building aus Los Angeles, das ebenfalls in Blade Runner zu sehen ist, gilt als eines der bedeutendsten Industriegebaeude der USA und steht unter Denkmalschutz."
    ),

    // ── FILM MARKETING AND DISTRIBUTION ──────────────────────────────────────

    // Question 25 – Jaws: Release strategy
    Question(
        categoryId = 4,
        questionText = "Welche Marketingstrategie etablierte 'Der weisse Hai' (Jaws, 1975) als Vorreiter, die bis heute Hollywoods Kinostartplanung praegt?",
        answerA = "Die exklusive Limited-Release-Strategie in 50 Premierenkinos",
        answerB = "Den Sommerblockbuster-Simultanstart in tausenden Kinos mit TV-Massenbewerb",
        answerC = "Den Oscar-Strategie-Release im Dezember",
        answerD = "Den globalen gleichzeitigen Weltstart in 50 Laendern",
        correctAnswer = 1, // B
        explanation = "Jaws wurde mit einem bis dahin nie dagewesenen Marketing-Feldzug gestartet: TV-Werbung und Simultanstart in uber 400 Kinos - ungewoehnlich fuer 1975. Das Modell des 'Blockbuster-Sommerstarts' mit massiver TV-Vorwerbung wurde zum Standard aller Hollywood-Studios.",
        difficulty = 3,
        funFact = "Die Idee, Jaws mit TV-Spots zu bewerben, stammte von Universal-Marketingchef Sid Sheinberg. Steven Spielberg war zunachst skeptisch - das Budget fuer TV-Werbung war bis dahin unublich."
    ),

    // Question 26 – Blair Witch: Viral marketing
    Question(
        categoryId = 4,
        questionText = "Welche neuartige Marketingstrategie im Internet setzte 'The Blair Witch Project' (1999) ein, um Glaubwuerdigkeit und Interesse zu erzeugen?",
        answerA = "Bezahlte Influencer auf neu entstandenen Sozialen Medien",
        answerB = "Eine Fake-Dokumentar-Website, die den Film als echtes Ereignis darstellte",
        answerC = "Streuen von gefaelschten Presseberichten in Lokalzeitungen",
        answerD = "Kauf von Google-Anzeigen mit gefaelschten Vermissten-Meldungen",
        correctAnswer = 1, // B
        explanation = "Die Macher von 'Blair Witch Project' erstellten 1998 eine Website, die die Geschichte als echtes Verschwinden dreier Studenten darstellte, komplett mit gefaelschten Polizeiberichten und Biographien. Dieses virale Internet-Marketing war fuer 1999 revolutionaer und setzte den Standard fuer ARGs (Alternate Reality Games).",
        difficulty = 3,
        funFact = "Viele Kinobesucher glaubten beim Start 1999 tatsaechlich, einen echten Dokumentarfilm zu sehen - das Internetmarketing war so uberzeugend, dass IMDb den Film zunachst als Dokumentation listete."
    ),

    // Question 27 – Marketing: MPAA rating impact
    Question(
        categoryId = 4,
        questionText = "Welche US-Altersfreigabe (MPAA-Rating) gilt in Hollywood als der goldene Standard fuer maximalen Kassenerfolg, da sie breites Publikum ohne Ausschluss erreicht?",
        answerA = "G (General Audiences - keine Einschraenkung)",
        answerB = "PG-13 (ab 13, unter 13 mit elterlicher Empfehlung)",
        answerC = "R (unter 17 nur mit Erwachsenen-Begleitung)",
        answerD = "PG (mit elterlichem Rat)",
        correctAnswer = 1, // B
        explanation = "PG-13 gilt als die profitabelste MPAA-Einstufung, da sie breite Familienaudienzen und Teenager gleichermassen erreicht. Blockbuster wie Marvel-Filme, Transformers oder Fast & Furious sind bewusst auf PG-13 ausgerichtet. Studioproduzenten schneiden Filme aktiv nach, um ein R-Rating zu vermeiden.",
        difficulty = 3,
        funFact = "PG-13 wurde 1984 auf Druck von Steven Spielberg und George Lucas eingefuehrt, nachdem ihre Filme 'Indiana Jones and the Temple of Doom' und 'Gremlins' trotz PG-Rating als zu brutal fuer Kinder galten."
    ),

    // Question 28 – Distribution: Day-and-date release
    Question(
        categoryId = 4,
        questionText = "Was bezeichnet der Begriff 'Day-and-Date Release' in der modernen Filmvermarktung?",
        answerA = "Ein Film startet gleichzeitig im Kino und auf Streaming-Plattformen",
        answerB = "Ein Film startet weltweit am gleichen Datum in allen Laendern",
        answerC = "Ein Film erhaelt ein offizielles Erscheinungsdatum erst nach Abschluss der Postproduktion",
        answerD = "Ein Film wird mit einem Countdown-Datum exklusiv vorbestellbar gemacht",
        correctAnswer = 0, // A
        explanation = "Day-and-Date Release bezeichnet die gleichzeitige Veroeffentlichung eines Films im Kino und auf Streaming-Plattformen oder VOD. Warner Bros. fuehrte diese Strategie 2021 durch und veroffentlichte alle Kinofilme gleichzeitig auf HBO Max - was massive Kontroversen mit Kinos ausloeste.",
        difficulty = 3,
        funFact = "Regal Cinemas und andere Kinoketten verbannten voruebergehend alle Warner-Filme aus ihren Hauesern als Protest gegen die Day-and-Date-Politik von 2021."
    ),

    // ── INDEPENDENT FILM: SUNDANCE, A24, MIRAMAX ─────────────────────────────

    // Question 29 – Sundance: Foundation
    Question(
        categoryId = 4,
        questionText = "Wer grundete das Sundance Film Festival und in welcher Stadt findet es statt?",
        answerA = "Robert Redford, Park City (Utah)",
        answerB = "Steven Soderbergh, Salt Lake City (Utah)",
        answerC = "Harvey Weinstein, Denver (Colorado)",
        answerD = "George Lucas, Los Angeles (Kalifornien)",
        correctAnswer = 0, // A
        explanation = "Das Sundance Film Festival wurde von Schauspieler und Regisseur Robert Redford ins Leben gerufen und findet seit 1981 in Park City, Utah, statt. Es ist das groesste unabhaengige Filmfestival in den USA und gilt als Sprungbrett fuer Independent-Filmemacher.",
        difficulty = 3,
        funFact = "Bevor Redford das Festival uebernahm, hiess es Utah/US Film Festival und existierte seit 1978. Redford benannte es nach seiner Produktionsfirma, die wiederum nach seiner Rolle in 'Butch Cassidy and the Sundance Kid' benannt war."
    ),

    // Question 30 – A24: Founding and identity
    Question(
        categoryId = 4,
        questionText = "In welchem Jahr wurde das US-Independent-Studio A24 gegruendet und womit wurde es bekannt?",
        answerA = "2000, mit dem Film 'Requiem for a Dream'",
        answerB = "2012, mit dem Vertrieb von arthouse- und genrefilmen wie 'Spring Breakers'",
        answerC = "2006, als Ableger von Miramax",
        answerD = "2015, mit 'Room' als erstem Eigenproduktion",
        correctAnswer = 1, // B
        explanation = "A24 wurde 2012 von Daniel Katz, David Fenkel und John Hodges gegruendet und wurde zuerst durch den Vertrieb von 'Spring Breakers' (2012) bekannt. Heute gilt A24 als prestigetraechtigstes amerikanisches Independent-Studio, bekannt fuer Filme wie 'Moonlight', 'Everything Everywhere All at Once' und 'Hereditary'.",
        difficulty = 3,
        funFact = "Der Name 'A24' stammt von der Autobahn A24, die von Rom nach Teramo fuehrt - auf dieser Strasse soll Grunder David Fenkel die Idee fuer das Studio gehabt haben."
    ),

    // Question 31 – Miramax: History and fall
    Question(
        categoryId = 4,
        questionText = "Welchen Skandal loeste Harvey Weinstein, Mitgruender von Miramax, 2017 aus, der zur Grundung einer weltweiten Bewegung fuehrte?",
        answerA = "Steuerbetrugs-Anklagen im Zusammenhang mit Oscar-Kampagnen",
        answerB = "Systematische sexuelle Belaestigung und Missbrauch vieler Frauen in Hollywood",
        answerC = "Betrug an unabhaengigen Regisseuren durch gefaelschte Box-Office-Zahlen",
        answerD = "Industriespionage gegen Konkurrenzstudios",
        correctAnswer = 1, // B
        explanation = "2017 veroffentlichten die New York Times und der New Yorker Berichte ueber jahrzehntelangen systematischen sexuellen Missbrauch durch Harvey Weinstein. Die Berichterstattung loeste die MeToo-Bewegung aus, die die gesamte Unterhaltungsindustrie erfasste.",
        difficulty = 3,
        funFact = "Harvey Weinstein und sein Bruder Bob grundeten Miramax 1979 - benannt nach ihren Eltern Miriam und Max. Unter Disney-Aegide (1993-2010) wurde Miramax zum erfolgreichsten Independent-Label Hollywoods."
    ),

    // Question 32 – Sundance: First breakout film
    Question(
        categoryId = 4,
        questionText = "Welcher Film gewann 1989 den Grand Jury Prize beim Sundance Film Festival und gilt als erster grosser Durchbruch des amerikanischen Independent-Kinos?",
        answerA = "Sex, Luegen und Video (sex, lies, and videotape) - Steven Soderbergh",
        answerB = "Slacker - Richard Linklater",
        answerC = "Reservoir Dogs - Quentin Tarantino",
        answerD = "Clerks - Kevin Smith",
        correctAnswer = 0, // A
        explanation = "Steven Soderberghs Debuetufilm 'sex, lies, and videotape' (1989) gewann den Grand Jury Prize in Sundance und die Goldene Palme in Cannes - und zeigte erstmals, dass Low-Budget-Independent-Filme kommerzielle Hits werden koennen. Er gilt als Startschuss der Independent-Film-Renaissance der 1990er.",
        difficulty = 3,
        funFact = "Soderbergh drehte 'sex, lies, and videotape' mit nur 1,2 Millionen Dollar Budget und war zum Zeitpunkt des Drehs 25 Jahre alt."
    ),

    // ── MOCKUMENTARY STYLE ────────────────────────────────────────────────────

    // Question 33 – Mockumentary: Definition and origin
    Question(
        categoryId = 4,
        questionText = "Welcher Film aus dem Jahr 1984 gilt als Begruender des modernen Mockumentary-Genres im Kino?",
        answerA = "Zelig (1983, Woody Allen)",
        answerB = "This Is Spinal Tap (1984, Rob Reiner)",
        answerC = "Best in Show (2000, Christopher Guest)",
        answerD = "Waiting for Guffman (1996, Christopher Guest)",
        correctAnswer = 1, // B
        explanation = "'This Is Spinal Tap' (1984) von Rob Reiner mit Christopher Guest ist der Urvater des Mockumentary-Genres: Ein vorgeblicher Dokumentarfilm ueber eine fiktive Rockband, bei dem alle Szenen improvisisert wurden. Der Film definierte die stilistischen Mittel (wackelige Handkamera, direkte Interviews, Peinlichkeits-Humor), die das Genre bis heute praegen.",
        difficulty = 3,
        funFact = "Die Lautst aerkeregler der Amps in 'This Is Spinal Tap' gehen nicht bis 10, sondern bis 11 - eine Szene, die 'to go up to eleven' als idiomatischen Ausdruck ins Englische einbrachte."
    ),

    // Question 34 – Mockumentary: Technique
    Question(
        categoryId = 4,
        questionText = "Was beschreibt der Begriff 'Talking Head' im Kontext von Mockumentaries und Dokumentarfilmen?",
        answerA = "Eine Kameraeinstellung, die den Kopf einer Person ohne Hintergrundgeschehen zeigt",
        answerB = "Direkte Kameragespraeche, in denen Figuren sich selbst an die Kamera wenden und kommentieren",
        answerC = "Eine Interviewszene mit einer Fackelbeleuchtung von oben",
        answerD = "Ein Schnittstil, der Kopf-an-Kopf-Ausschnitte zweier Gesprachspartner abwechselt",
        correctAnswer = 1, // B
        explanation = "In Mockumentaries bezeichnet 'Talking Head' die typischen direkten Kamera-Interviews, in denen Figuren sich an die Kamera wenden, als ob sie einem Dokumentarfilm-Team Auskunft geben. Diese Aufnahmen erlauben Kommentare und Reaktionen zu Ereignissen und sind ein zentrales Stilmittel von Serien wie 'The Office' oder 'Parks and Recreation'.",
        difficulty = 3,
        funFact = "In 'The Office' wurde die Talking-Head-Technik so konsequent eingesetzt, dass Schauspieler wie Steve Carell die Szenen inhaltlich oft selbst improvisierten."
    ),

    // Question 35 – The Office: Mockumentary adaptation
    Question(
        categoryId = 4,
        questionText = "Wer schuf die britische Originalserie 'The Office' (2001-2003), auf der die US-amerikanische Version basiert?",
        answerA = "Simon Cowell",
        answerB = "Ricky Gervais und Stephen Merchant",
        answerC = "Armando Iannucci",
        answerD = "Steve Coogan",
        correctAnswer = 1, // B
        explanation = "Die britische 'The Office' wurde von Ricky Gervais und Stephen Merchant geschrieben und von Gervais als David Brent gespielt. Die Serie beeinflusste nachhaltig das TV-Comedy-Format weltweit und wurde in zahlreiche Landesversionen adaptiert, darunter die US-Fassung mit Steve Carell.",
        difficulty = 3,
        funFact = "Die britische 'The Office' bestand nur aus zwei Staffeln und einem Weihnachtsspecial - Gervais wollte bewusst nicht mehr machen, um die Qualitaet zu erhalten. Diese Entscheidung wird bis heute als wegweisend fuer Premium-TV gelobt."
    ),

    // Question 36 – Mockumentary: Christopher Guest
    Question(
        categoryId = 4,
        questionText = "Christopher Guest, Regisseur von 'Best in Show' (2000) und 'A Mighty Wind' (2003), nutzt ein besonderes Kreativverfahren. Welches?",
        answerA = "Er dreht alle Filme nach festem Drehbuch ohne Abweichungen",
        answerB = "Er gibt seinen Schauspielern einen Szenenplan, aber keine Dialogvorgaben - alle Texte werden improvisiert",
        answerC = "Er nutzt ausschliesslich echte Amateure ohne Schauspielerfahrung",
        answerD = "Er dreht alle Szenen zweimal: einmal mit Drehbuch, einmal improvisiert, und entscheidet im Schnitt",
        correctAnswer = 1, // B
        explanation = "Christopher Guests Methode basiert auf improvisiertem Dialog: Die Schauspieler erhalten eine Szenenbeschreibung (wer ist wo, was soll passieren), aber keine vorgeschriebenen Textzeilen. Das erzeugt die naturalistische, rumpelige Authentizitat, die seine Mockumentaries auszeichnet.",
        difficulty = 3,
        funFact = "Guests festes Ensemble - darunter Catherine O'Hara, Fred Willard, Eugene Levy und Parker Posey - arbeitete so eingespielt zusammen, dass viele Szenen erst im Schnitt ihre finale Form fanden."
    ),

    // Question 37 – Mockumentary: Found footage horror
    Question(
        categoryId = 4,
        questionText = "Welches Stilmittel unterscheidet Found-Footage-Horror wie 'Cloverfield' (2008) von klassischen Mockumentaries wie 'Spinal Tap'?",
        answerA = "Found Footage verzichtet auf Talking-Head-Interviews und praesentiert das Material als im Nachhinein 'gefunden'",
        answerB = "Found Footage nutzt ausschliesslich professionelles Kameraequipment",
        answerC = "Found Footage hat immer einen ueberlebenden Erzaehler der Geschichte",
        answerD = "Found Footage ist immer in Schwarzweiss gedreht",
        correctAnswer = 0, // A
        explanation = "Der wesentliche Unterschied: Mockumentaries haben eine aktive Dokumentar-Rahmenhandlung mit Interviews und Beobachtern. Found Footage dagegen praesentiert sich als nachtraeglich 'gefundenes' Material ohne erklaerenden Rahmen - was die existenzielle Spannung erhoehen soll, weil unklar bleibt, ob jemand ueberlebt hat.",
        difficulty = 3,
        funFact = "Cloverfield (2008) betrieb wie Blair Witch virales Pre-Marketing: Es gab keine offiziellen Titel- oder Cast-Informationen im ersten Trailer - nur eine Release-Date und schockierende Bilder."
    ),

    // Question 38 – Mockumentary: Parks and Recreation
    Question(
        categoryId = 4,
        questionText = "Welche US-Mockumentary-Serie (Premiere 2009) begann als 'Office'-Klon, entwickelte sich aber zu einem Gegenentwurf: optimistisch statt zynisch?",
        answerA = "Modern Family",
        answerB = "Parks and Recreation",
        answerC = "Abbott Elementary",
        answerD = "What We Do in the Shadows",
        correctAnswer = 1, // B
        explanation = "'Parks and Recreation' (NBC, 2009-2015) von Michael Schur und Greg Daniels startete als Spin-Off-Konzept zu 'The Office', fand aber ab Staffel 2 eine eigene Identitaet: statt dem Cringe-Humor einer dysfunktionalen Buerogemeinschaft praesentiert die Serie einen optimistischen Glauben an Gemeinschaft und oeffentliche Institutionen.",
        difficulty = 3,
        funFact = "Amy Poehler als Leslie Knope war ursprunglich als weiblicher Michael Scott konzipiert - unintelligent und inkompetent. Die Figur wurde grundlegend ueberarbeitet, als die Autoren erkannten, dass eine engagierte, fleissige Frau interessanter und innovativer war."
    ),

    // ── FURTHER HARD FILM ANALYSIS QUESTIONS ─────────────────────────────────

    // Question 39 – Apocalypse Now: Production hell
    Question(
        categoryId = 4,
        questionText = "Welches Ereignis verzoegerte die Produktion von 'Apocalypse Now' (1979) dramatisch und ist in Fax Bahrs Dokumentarfilm 'Hearts of Darkness' dokumentiert?",
        answerA = "Ein Taifun zerstoerte fast alle Sets auf den Philippinen",
        answerB = "Marlon Brando erschien ohne sein Drehbuch gelernt zu haben und mit extremem Uebergewicht",
        answerC = "Martin Sheen erlitt einen Herzanfall am Set",
        answerD = "Alle drei Antworten oben sind korrekt",
        correctAnswer = 3, // D
        explanation = "Alle drei Ereignisse trafen 'Apocalypse Now' gleichzeitig: Ein Taifun zerstoerte fast alle Sets (15 Produktionstage verloren), Marlon Brando erschien ohne sein Drehbuch zu kennen und 40 Kilogramm schwerer als vertraglich vereinbart, und Martin Sheen erlitt mitten in den Dreharbeiten einen Herzanfall - aus dem Stress der Produktion.",
        difficulty = 3,
        funFact = "Francis Ford Coppola finanzierte 'Apocalypse Now' grossteils selbst und riskierte dabei sein Privatvermoegen. In 'Hearts of Darkness' sagt er, er habe kurz vor dem psychischen Zusammenbruch gestanden."
    ),

    // Question 40 – A24: First Oscar
    Question(
        categoryId = 4,
        questionText = "Mit welchem Film gewann A24 seinen ersten Oscar fuer den besten Film?",
        answerA = "Lady Bird (2017)",
        answerB = "Moonlight (2016)",
        answerC = "Midsommar (2019)",
        answerD = "Everything Everywhere All at Once (2022)",
        correctAnswer = 1, // B
        explanation = "'Moonlight' (Regie: Barry Jenkins, 2016) gewann den Oscar fuer den besten Film 2017 - und wurde durch die beruechmte Verwechslung mit 'La La Land' bei der Bekanntgabe zur vielleicht denkwuerdigsten Oscar-Verleihung der Geschichte. Es war A24s erster Best-Picture-Oscar.",
        difficulty = 3,
        funFact = "Bei der Oscar-Verleihung 2017 wurde zunachst falschlicherweise 'La La Land' als Gewinner ausgerufen. Erst mitten in der Dankesrede korrigierte der Produzent die Verwechslung live auf der Buehne."
    ),

    // Question 41 – Ingmar Bergman and auteur theory
    Question(
        categoryId = 4,
        questionText = "Die Auteur-Theorie, die dem Regisseur den Status eines kuenstlerischen Urhebers zuspricht, wurde massgeblich durch welche franzoesische Fachzeitschrift gepraegt?",
        answerA = "Le Monde du Cinema",
        answerB = "Cahiers du Cinema",
        answerC = "Positif",
        answerD = "Film Francais",
        correctAnswer = 1, // B
        explanation = "Die Cahiers du Cinema, in den 1950ern massgeblich von Francois Truffaut, Jean-Luc Godard und anderen Kritikers (spaeter Regisseuren) der Nouvelle Vague gepraegt, entwickelte die 'politique des auteurs': Regisseure wie Hitchcock, Hawks oder Renoir wurden als eigentliche Kuenstler hinter dem Film gewuerdigt, unabhaengig von Genre oder Studiosystem.",
        difficulty = 3,
        funFact = "Truffauts Artikel 'Une certaine tendance du cinema francais' (1954) in den Cahiers du Cinema gilt als Gruendungsdokument der Auteur-Theorie und der Nouvelle Vague."
    ),

    // Question 42 – Sundance: Kevin Smith debut
    Question(
        categoryId = 4,
        questionText = "Mit welchem Film debuetuierte Kevin Smith 1994 beim Sundance Film Festival und wie hoch war das Budget?",
        answerA = "'Clerks' - ca. 27.000 Dollar",
        answerB = "'Mallrats' - ca. 150.000 Dollar",
        answerC = "'Chasing Amy' - ca. 250.000 Dollar",
        answerD = "'Dogma' - ca. 10 Millionen Dollar",
        correctAnswer = 0, // A
        explanation = "'Clerks' (1994) von Kevin Smith wurde fuer rund 27.000 Dollar gedreht - finanziert durch Kreditkarten, verkaufte Comicsammlungen und Versicherungsgeld nach einem Autounfall. Der Film debuetuierte in Sundance, gewann Preise in Cannes und gilt als Musterbeispiel guerillamaessigen Independent-Filmemachens.",
        difficulty = 3,
        funFact = "Smith arbeitete waehrend der Dreharbeiten als Verkaeufer in eben dem Convenience-Store, in dem der Film spielt - und drehte die Szenen, wenn der Laden geschlossen hatte."
    ),

    // Question 43 – Film distribution: China market
    Question(
        categoryId = 4,
        questionText = "Wie viele auslaendische Filme pro Jahr duerfen in China offiziell in regulaeren Kinos gezeigt werden (Importquote)?",
        answerA = "10 Filme pro Jahr",
        answerB = "34 Filme pro Jahr (plus zusaetzliche Revenue-Share-Filme)",
        answerC = "50 Filme pro Jahr",
        answerD = "Unbegrenzt, aber 75 % des Erloeses bleiben in China",
        correctAnswer = 1, // B
        explanation = "China erlaubt offiziell 34 auslaendische Filme pro Jahr in sogenannten 'revenue share'-Deals sowie unbegrenzt Filme im 'flat fee'-Modell. Hollywood-Studios richten seit Jahren Produktionsentscheidungen an dieser Quota aus und aendern Inhalte, um die chinesische Zensur zu erfullen.",
        difficulty = 3,
        funFact = "Fuer 'Iron Man 3' (2013) wurde eine eigene chinesische Version gedreht, die chinesische Schauspieler und eine lokale Milchmarke prominent einbaute - um die Zulassung zu erleichtern."
    ),

    // Question 44 – Miramax: Pulp Fiction at Cannes
    Question(
        categoryId = 4,
        questionText = "Wer war 1994 Jurypraesidentin der Filmfestspiele Cannes und verlieh Quentin Tarantinos 'Pulp Fiction' - einem Miramax-Film - die Goldene Palme?",
        answerA = "Catherine Deneuve",
        answerB = "Clint Eastwood",
        answerC = "Sophia Loren",
        answerD = "Jeanne Moreau",
        correctAnswer = 1, // B
        explanation = "Clint Eastwood war 1994 Jurypraesidentin der Filmfestspiele in Cannes und sprach Quentin Tarantinos 'Pulp Fiction' die Goldene Palme zu - gegen den Widerstand einiger Jurymitglieder, die 'Trois couleurs: Rouge' von Kieslowski bevorzugten. Die Entscheidung gilt als eine der wegweisendsten in der Festivalgeschichte.",
        difficulty = 3,
        funFact = "Harvey Weinstein soll die Kampagne fuer 'Pulp Fiction' in Cannes so aggressiv betrieben haben, dass es unter Festivalmitarbeitern als 'the Weinstein effect' bekannt wurde - er aenderte wie Preisvergaben bei Festivals marketing-technisch angegangen wurden."
    ),

    // Question 45 – Screenplay: Chinatown structure
    Question(
        categoryId = 4,
        questionText = "Das Drehbuch von Robert Towne zu 'Chinatown' (1974) gilt als eines der besten je geschriebenen. Was ist sein beruechmtestes Strukturmerkmal?",
        answerA = "Es folgt der klassischen drei-Akt-Struktur mit Happy End",
        answerB = "Es hat ein konsequent pessimistisches Ende, bei dem der Held verliert und der Boesewicht gewinnt",
        answerC = "Es ist in Echtzeit aufgebaut ohne Zeitsprunge",
        answerD = "Es wechselt zwischen drei parallelen Handlungsstranegen hin und her",
        correctAnswer = 1, // B
        explanation = "Chinatown bricht bewusst mit der Hollywood-Konvention des Triumphs des Helden: Privatdetektiv Jake Gittes verliert alles, das Monster Evelyn Cross Mulwray wird ermordet, und Noah Cross enkommt mit seinem Verbrechen. Robert Towne hatte urspruenglich ein weniger nihilistisches Ende geschrieben - Regisseur Polanski bestand auf dem tragischen Schluss.",
        difficulty = 3,
        funFact = "Robert Towne sagte in Interviews, er habe nie einen Sequel-Satz zu 'Chinatown' schreiben wollen, weil das Ende so final war. Das Sequel 'The Two Jakes' (1990) - das er schliesslich schrieb - gilt als kommerzieller und kritischer Misserfolg."
    ),

    // Question 46 – Independent film: Dogme 95
    Question(
        categoryId = 4,
        questionText = "Was ist das 'Keuschheitsgeluebde' (Vow of Chastity) des Dogme-95-Manifests, das Lars von Trier und Thomas Vinterberg 1995 veroeffentlichten?",
        answerA = "Verzicht auf professionelle Schauspieler und Studiotechnik",
        answerB = "Zehn Regeln wie Vor-Ort-Dreh, kein kuenstliches Licht, keine Genrekinos und keine Regie-Credits",
        answerC = "Alle Filme muessen in Schwarz-Weiss und ohne Hintergrundmusik gedreht werden",
        answerD = "Alle Drehbuecher muessen von Laien geschrieben werden, nicht von professionellen Autoren",
        correctAnswer = 1, // B
        explanation = "Das Keuschheitsgeluebde des Dogme-95-Manifests umfasst 10 Regeln: Dreh an echten Orten (keine Sets), nur Handkamera, keine kuenstliche Beleuchtung, kein nachtraeglicher Ton, kein Breitbildformat, keine Genrekinos, keine zeitliche oder geographische Entfremdung, kein Actionkino sowie kein Regisseur-Credit auf dem Film.",
        difficulty = 3,
        funFact = "Tomas Vinterbergs 'Festen' (1998) und Lars von Triers 'Der Idioten' (1998) waren die ersten beiden Dogme-95-Filme. 'Festen' gewann den Sonderpreis der Jury in Cannes und wurde international als Durchbruch des digitalen Kinos gefeiert."
    ),

    // Question 47 – Hollywood studio system: vertical integration
    Question(
        categoryId = 4,
        questionText = "Was verbot das US-Bundesgericht den Hollywood-Majors im sogenannten 'Paramount Decree' von 1948?",
        answerA = "Die Ausstrahlung von Kinofilmen im Fernsehen innerhalb von zwei Jahren nach Kinostart",
        answerB = "Das Eigentum an Kinoketten gleichzeitig mit der Filmproduktion und -distribution",
        answerC = "Exklusive Laufzeit-Vereinbarungen mit Hauptdarstellern ueber drei Jahre",
        answerD = "Den gleichzeitigen Betrieb von mehr als zwei Studios unter einem Dach",
        correctAnswer = 1, // B
        explanation = "Der Paramount Decree von 1948 verpflichtete die grossen Hollywood-Studios (die 'Big Five': MGM, Paramount, Warner Bros., RKO, Fox), ihre Kinoketten zu verkaufen. Das Gericht sah in der vertikalen Integration von Produktion, Distribution und Ausfuehrung einen Versto gegen das Kartellrecht.",
        difficulty = 3,
        funFact = "Das US-Justizministerium hob den Paramount Decree 2020 auf - damit konnten Studios erstmals seit 70 Jahren wieder Kinoketten besitzen. Disney und AMC wurden sofort in diesem Kontext erwaehnt."
    ),

    // Question 48 – Mockumentary: What We Do in the Shadows
    Question(
        categoryId = 4,
        questionText = "Von wem wurde das Mockumentary 'What We Do in the Shadows' (2014) uber Vampire als WG-Mitbewohner gedreht?",
        answerA = "Edgar Wright und Simon Pegg",
        answerB = "Taika Waititi und Jemaine Clement",
        answerC = "Peter Jackson und Fran Walsh",
        answerD = "Wes Anderson und Noah Baumbach",
        correctAnswer = 1, // B
        explanation = "'What We Do in the Shadows' (2014) wurde von Taika Waititi und Jemaine Clement (Flight of the Conchords) geschrieben, inszeniert und gespielt. Der neuseelaendische Film wurde mit einem Budget von ca. 1,6 Millionen Dollar gedreht und ist heute Kult - mit einer erfolgreichen US-TV-Serie als Ableger.",
        difficulty = 3,
        funFact = "Taika Waititi spielte gleichzeitig die Hauptrolle des Vampirs Viago und fuehrte Regie. Der Film wurde mit einem Anteil improvisierter Szenen gedreht und praegt mit seinem trockenem Humor den modernen Mockumentary-Stil."
    ),

    // Question 49 – Film: MacGuffin definition
    Question(
        categoryId = 4,
        questionText = "Alfred Hitchcock praegte den Begriff 'MacGuffin'. Was bezeichnet er in der Filmtheorie?",
        answerA = "Eine Figur, die nur existiert, um dem Protagonisten Informationen zu geben",
        answerB = "Ein Objekt oder Ziel, das die Handlung antreibt, aber inhaltlich unwichtig ist",
        answerC = "Eine Szene, die beim Zuschauer false expectations aufbaut und dann bricht",
        answerD = "Einen Plottwist am Ende des zweiten Akts",
        correctAnswer = 1, // B
        explanation = "Ein MacGuffin ist ein narratives Hilfsmittel: ein Objekt (z.B. der Koffer in 'Pulp Fiction', die Plaene in Hitchcocks Spionagethrillern), dessen genaue Natur fuer die Geschichte irrelevant ist - es dient nur dazu, die Figuren zu motivieren und die Handlung voranzutreiben.",
        difficulty = 3,
        funFact = "Hitchcock erklaerte den Begriff in einem beruechmten Interview mit Francois Truffaut: 'In einem Spionagefilm sind es die Plaene. Im Kriminalfilm ist es die Halskette. Im MacGuffin ist es vollkommen egal, was es ist.'"
    ),

    // Question 50 – New Hollywood: Easy Rider
    Question(
        categoryId = 4,
        questionText = "Welcher Film gilt als Ausloeser des 'New Hollywood'-Zeitalters, der den Majors bewies, dass guenstige, rueckratslose Gegenkultur-Produktionen Millionen einbringen koennen?",
        answerA = "Bonnie and Clyde (1967, Arthur Penn)",
        answerB = "Easy Rider (1969, Dennis Hopper)",
        answerC = "Midnight Cowboy (1969, John Schlesinger)",
        answerD = "M*A*S*H (1970, Robert Altman)",
        correctAnswer = 1, // B
        explanation = "'Easy Rider' (1969) wurde fuer rund 400.000 Dollar gedreht und spielte weltweit uber 60 Millionen Dollar ein - ein Verhaeltnis, das die Hollywood-Studios aufwachruettelte. Columbia Pictures, das den Film finanziert hatte, realisierte, dass junge Gegenkultur-Filmemacher wie Hopper, Bogdanovich oder Coppola das naechste Geschaeftsmodell darstellten.",
        difficulty = 3,
        funFact = "Dennis Hopper, der Regisseur und Co-Autor von 'Easy Rider', war waehrend der gesamten Produktion unter dem Einfluss von Drogen und Alkohol - eine Tatsache, die der Produzent Bert Schneider in Interviews bestaetigt hat."
    )

)
