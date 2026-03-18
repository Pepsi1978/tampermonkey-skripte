package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun musicQuestionsHard4(): List<Question> = listOf(

    // ── Musikrecht / Copyright-Faelle (8) ──────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "In welchem Rechtsstreit entschied ein US-Gericht 2015, dass 'Blurred Lines' von Robin Thicke das Marvin-Gaye-Lied 'Got To Give It Up' verletzt?",
        answerA = "Sony Music v. Universal",
        answerB = "Williams/Thicke v. Gaye",
        answerC = "Capitol Records v. Thicke",
        answerD = "Pharrell Williams v. RIAA",
        correctAnswer = 1,
        explanation = "Im Fall Williams/Thicke v. Gaye urteilte eine Bundesjury in Los Angeles, dass 'Blurred Lines' (2013) urheberrechtlich geschuetzte Elemente von Marvin Gayes 'Got To Give It Up' (1977) kopiert. Die Gayes erhielten 7,4 Millionen Dollar Schadensersatz.",
        difficulty = 3,
        funFact = "Das Urteil loeste eine Schockwelle in der Musikbranche aus: Produzenten begannen danach, 'feel' und 'groove' eines Songs vorsorglich zu aendern, weil das Gericht den Gesamteindruck und nicht nur notierten Noten schuetzte."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Rechtsstreit fuehrte dazu, dass George Harrison 1976 wegen 'subconscious plagiarism' verurteilt wurde?",
        answerA = "Harrison v. Lennon wegen 'Come Together'",
        answerB = "Bright Tunes Music v. Harrisongs wegen 'My Sweet Lord'",
        answerC = "Capitol Records v. Harrison wegen 'Something'",
        answerD = "Apple Corps v. Harrison wegen 'Give Me Love'",
        correctAnswer = 1,
        explanation = "Das US-Gericht stellte fest, dass Harrisons 'My Sweet Lord' (1970) die Melodie von 'He's So Fine' der Chiffons (1963) unbewusst kopiert hatte. Das Konzept des 'subconscious plagiarism' wurde durch diesen Fall im Musikrecht etabliert.",
        difficulty = 3,
        funFact = "Der Richter erkannte an, dass Harrison nicht absichtlich geklaut hatte, verurteilte ihn aber trotzdem. Harrison kommentierte spaeter: 'Es war ein gutes Lied — offensichtlich gut genug, um es unterbewusst zu stehlen.'"
    ),

    Question(
        categoryId = 5,
        questionText = "Was besagt die '4-Takte-Regel' im Zusammenhang mit Sampling im Musikrecht?",
        answerA = "Samples unter 4 Takten sind automatisch lizenzfrei",
        answerB = "Es gibt keine solche gesetzliche Regel; auch kuerzeste Samples koennen urheberrechtspflichtig sein",
        answerC = "Samples unter 4 Takten brauchen nur eine Masterrechte-Lizenz, keine Verlagsrechte",
        answerD = "Die Regel stammt aus dem deutschen UrhG Paragraph 24",
        correctAnswer = 1,
        explanation = "Die '4-Takte-Regel' ist ein weit verbreiteter Musikmythos ohne gesetzliche Grundlage. US-Gerichte (u.a. Bridgeport Music v. Dimension Films, 2004) bestatigten, dass selbst kuerzeste Samples lizenzpflichtig sind — es gibt keine De-minimis-Ausnahme bei Tonaufnahmen.",
        difficulty = 3,
        funFact = "Das Bridgeport-Urteil basierte auf einem zweisekuendigen Gitarren-Sample von Funkadelic. Der Richter formulierte die heute beruehmte Maxime: 'Get a license or do not sample.'"
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Prinzip beschreibt das US-Urheberrecht fuer Kompositionen, das Melodie, Harmonie und Rhythmus schuetzt, aber nicht Genre oder Stil?",
        answerA = "Work-for-Hire-Doktrin",
        answerB = "Idea-Expression Dichotomy",
        answerC = "Fair-Use-Doktrin",
        answerD = "Compulsory License Rule",
        correctAnswer = 1,
        explanation = "Die Idea-Expression Dichotomy besagt, dass Ideen (Stil, Groove, Tonart, Tempo) nicht schuetzbar sind, aber deren konkrete Ausdruecksform (die spezifische Melodielinie, der genaue rhythmische Aufbau) schon. Dies ist der Kernstreit in Faellen wie 'Blurred Lines'.",
        difficulty = 3,
        funFact = "Diese Doktrin geht auf den US Supreme Court-Fall Baker v. Selden (1879) zurueck — fast 150 Jahre vor der modernen Musikindustrie, aber noch immer die entscheidende juristische Trennlinie."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Recht ermoeglicht es einem Musiker in den USA, nach 35 Jahren die abgetretenen Urheberrechte zurueckzufordern?",
        answerA = "Reversion Right",
        answerB = "Moral Right",
        answerC = "Termination Right (Section 203 Copyright Act)",
        answerD = "Neighboring Right",
        correctAnswer = 2,
        explanation = "Section 203 des US Copyright Act erlaubt es Urhebern, Rechte-Abtretungen nach 35 Jahren zu kuendigen und die Rechte zurueckzuerhalten. Viele Musiker der 1980er und 1990er Jahre nutzen dieses Recht aktuell, um Kontrolle ueber ihren Katalog zurueckzugewinnen.",
        difficulty = 3,
        funFact = "Taylor Swift machte das Termination Right populaer, als sie erklaerte, warum sie ihre Alben neu aufnahm: Sie konnte die Masterrechte nicht zurueckkaufen, aber durch Neuaufnahmen ('Taylor's Version') die kommerziellen Rechte wieder selbst ausueeben."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Unterschied besteht zwischen Masterrechten und Verlagsrechten (Publishing Rights) bei einem Song?",
        answerA = "Masterrechte decken den Text, Verlagsrechte die Melodie",
        answerB = "Masterrechte gehoeren dem Label (Aufnahme), Verlagsrechte dem Komponisten/Verleger (Komposition)",
        answerC = "Masterrechte sind 70 Jahre gueltig, Verlagsrechte nur 50 Jahre",
        answerD = "Es gibt keinen Unterschied — beide Begriffe beschreiben dasselbe Recht",
        correctAnswer = 1,
        explanation = "Bei jedem kommerziellen Song existieren zwei separate Urheberrechte: das Masterrecht an der konkreten Aufnahme (meist beim Plattenlabel) und das Kompositionsrecht/Verlagsrecht an der Melodie und dem Text (beim Komponisten oder Musikverlag). Streaming-Dienste lizenzieren beide separat.",
        difficulty = 3,
        funFact = "Der Kauf des gesamten Beatles-Kataloges durch Michael Jackson 1985 betraf nur die Kompositionsrechte (Publishing), nicht die Masterrechte der Originalaufnahmen. Jackson zahlte 47,5 Millionen Dollar dafuer."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist eine 'Compulsory License' im US-Musikrecht, und wofuer wird sie eingesetzt?",
        answerA = "Eine staatliche Zwangslizenz fuer oeffentliche Rundfunkanstalten",
        answerB = "Eine gesetzliche Erlaubnis, eine bereits veroeffentlichte Komposition gegen festgelegte Gebuehr zu covern, ohne die Genehmigung des Urhebers einzuholen",
        answerC = "Eine Lizenz, die nur fuer Filmmusik gilt",
        answerD = "Eine EU-Richtlinie zur Harmonisierung von Streaming-Entgelten",
        correctAnswer = 1,
        explanation = "Die Compulsory (Mechanical) License erlaubt es jedem, eine bereits kommerziell veroeffentlichte Komposition zu covern, ohne den Rechteinhaber fragen zu muessen — gegen eine gesetzlich festgelegte Gebuehr (statutory rate). Sie ermoeglichte Tausende von Cover-Versionen ohne langwierige Verhandlungen.",
        difficulty = 3,
        funFact = "Die aktuelle US-Statutory Rate fuer physische Medien und Downloads liegt bei 9,1 Cent pro verkaufftem Track (Lieder bis 5 Minuten). Diese Rate wird von der Copyright Royalty Board periodisch neu festgesetzt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Fall etablierte 2023 wichtige Praezedenz zum Thema KI-generierte Musik und Urheberrecht?",
        answerA = "RIAA v. Suno AI",
        answerB = "Universal Music v. Anthropic",
        answerC = "Thaler v. Vidal (USPTO), uebertragen auf Musikurheberrecht",
        answerD = "Sony Music v. Google DeepMind",
        correctAnswer = 2,
        explanation = "Im Fall Thaler v. Vidal entschied das USPTO und spaeter Gerichte, dass KI-generierte Werke ohne menschliche Urheberschaft keinen US-Copyright-Schutz geniessen. 2023 schufen Universal und andere Labels Klagen gegen KI-Firmen wegen des Trainings auf geschuetztem Material.",
        difficulty = 3,
        funFact = "Das US Copyright Office hat 2023 klargestellt, dass rein KI-generierte Bilder, Texte und Musik nicht schutzfaehig sind — jedoch der menschliche Beitrag (Prompt-Gestaltung, Auswahl, Bearbeitung) unter Umstaenden geschuetzt sein kann."
    ),

    // ── Avantgarde-Rock / Noise (7) ─────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welches Album von Lou Reed aus dem Jahr 1975 gilt als Meilenstein des Noise-Rock und der Avantgarde, obwohl es kommerziell ein Flop war?",
        answerA = "Berlin",
        answerB = "Transformer",
        answerC = "Metal Machine Music",
        answerD = "New York",
        correctAnswer = 2,
        explanation = "Lou Reeds 'Metal Machine Music' (1975) besteht aus 64 Minuten feedback-basiertem Noise ohne traditionelle Songstruktur. Es wurde von RCA Records als Doppelalbum veroeffentlicht, verkaufte sich kaum und wurde zurueckgezogen — wurde aber spaeter als Vorlaeufer des Noise-Rock und der Drone-Musik kanonisiert.",
        difficulty = 3,
        funFact = "Reed hat immer bestritten, dass das Album ein Witz oder eine bewusste Provokation war. Er nannte es eine ernsthafte kompositorische Arbeit. Das Kronos Quartet orchestrierte spaeter Teile davon als klassische Komposition."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche japanische Noise-Rock-Band, gegruendet 1981, gilt als Pionierin des Japanoise-Genres und ist bekannt fuer exzessive Lautstaerke bei Liveauftritten?",
        answerA = "Boris",
        answerB = "Boredoms",
        answerC = "Merzbow",
        answerD = "Hanatarash",
        correctAnswer = 2,
        explanation = "Die Boredoms (gegruendet in Osaka 1981) verbanden Punk, Noise und Avantgarde zu einem unverwechselbaren japanischen Stil. Ihr Sanger Yamantaka Eye und das sich staendig wechselnde Line-Up prafigten das Japanoise-Genre, das spaeter auf westliche Experimentalkuenstler enormen Einfluss hatte.",
        difficulty = 3,
        funFact = "Boredoms-Frontmann Eye wurde spaeter Mitglied der supergroup Praxis mit Bill Laswell und Buckethead. 2007 organisierten die Boredoms ein Konzert mit 77 Drummern gleichzeitig — 'Boadrum 7/7/07'."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Technik des Gitarrenspiels, auch 'prepared guitar' genannt, wurde von Keith Rowe in der Gruppe AMM ab 1965 massgeblich entwickelt?",
        answerA = "Die Gitarre wird flach auf einem Tisch gespielt und mit Objekten praepariert",
        answerB = "Gitarrensaiten werden mit Saegen abgestrichen",
        answerC = "Die Gitarre wird hinter dem Ruecken gespielt",
        answerD = "Aufgeklebte Tonabnehmer an der Gitarrenkopfplatte",
        correctAnswer = 0,
        explanation = "Keith Rowe legte die Gitarre flach auf einen Tisch und praeparierte sie mit Stiften, Radios, Klebeband und anderen Objekten. Diese Technik eroeffnete voellig neue Klangraeume und beeinflusste Generationen von Avantgarde-Musikern — von Fred Frith bis zur No-Input-Mixing-Szene.",
        difficulty = 3,
        funFact = "Rowe lehnte klassisches Gitarrenspiel bewusst ab, weil er 'die Heroik der Rockgitarre' ablehnte. Er vergleicht seinen Ansatz mit John Cage: 'Ich spiele nicht die Gitarre — die Gitarre spielt sich selbst.'"
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Band gilt als Hauptvertreter des Post-Rock-Genres 'Math Rock' und veroeffentlichte 1994 das Album 'Spiderland'?",
        answerA = "Tortoise",
        answerB = "Slint",
        answerC = "Gastr del Sol",
        answerD = "Don Caballero",
        correctAnswer = 1,
        explanation = "Slinths Album 'Spiderland' (1994) wird als Schluesseldokument des Math Rock und Post-Rock angesehen. Die Band aus Louisville, Kentucky, kombinierte sperrige Metren, dynamische Kontraste und gesprochene Text-Passagen mit einer Intensitaet, die kaum einen Nachahmer unberuehrt liess.",
        difficulty = 3,
        funFact = "Das Album verkaufte sich bei Erscheinen kaum. Jahrzehnte spaeter bezeichneten es Bands wie Mogwai, Godspeed You! Black Emperor und Radiohead als entscheidende Einflussgroe. Steve Albini produzierte das Album fuer unter 5.000 Dollar."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Begriff beschreibt den Stilkomplex des 'No Wave', der sich Ende der 1970er Jahre in New York entwickelte?",
        answerA = "Eine Gegenbewegung zum Punk und New Wave, die Dissonanz, atonale Strukturen und Dilettantismus als Kunstform erhob",
        answerB = "Ein Genre des elektronischen Minimalismus aus Detroit",
        answerC = "Ein Begriff fuer Punk-Rock, der keine Wellen schlaegt",
        answerD = "Eine japanische Avantgarde-Bewegung der fruehen 1980er",
        correctAnswer = 0,
        explanation = "No Wave (ca. 1976-1983) entstand als radikaler Protest gegen die Kommerzialisierung des Punk und New Wave. Bands wie DNA, Teenage Jesus and the Jerks und Mars setzten auf absichtlich raue, atonale Musik ohne Melodie oder Groove. Das Kompendium des Genres ist das Brian-Eno-produzierte Sampler-Album 'No New York' (1978).",
        difficulty = 3,
        funFact = "Brian Eno nahm das 'No New York'-Sampler-Album 1978 auf. Sonic Youth und Lydia Lunch entstammten direkt dieser Szene — und trugen No-Wave-Elemente in den Mainstream."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Instrument und welche Spieltechnik praegt den Sound von Merzbow (Masami Akita), dem bekanntesten japanischen Noise-Musiker?",
        answerA = "Verzerrte Gitarre und Feedback-Schleifen",
        answerB = "Analoge Synthesizer in extremer Rueckkopplungsschaltung",
        answerC = "Rueckkopplungsbasierte Noise-Maschinen, Synthesizer, Computer und Metallplatten als Klangerzeuger",
        answerD = "Praepariertes Klavier und Kontrabass",
        correctAnswer = 2,
        explanation = "Merzbow, das Ein-Mann-Projekt von Masami Akita (aktiv seit 1979), nutzt ein System aus selbstgebauten Noise-Generatoren, analogen Synthesizern, Rueckkopplungsschleifen, Metall-Objekten und seit den 2000er Jahren auch Computer-Software. Er hat ueber 400 Alben veroeffentlicht.",
        difficulty = 3,
        funFact = "Merzbow ist nach Kurt Schwittersens Dada-Werk 'Merzbau' benannt. Akita ist vegetarischer Aktivist und widmet viele Alben Tierrechten. Sein produktivstes Jahr war 1997 mit ueber 30 veroeffentlichten Alben."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche britische Avantgarde-Rock-Band veroeffentlichte 1973 'Red', ein Album, das als Hoehepunkt der Canterbury-Szene und des Prog-Rock gilt?",
        answerA = "Gentle Giant",
        answerB = "Henry Cow",
        answerC = "King Crimson",
        answerD = "Van der Graaf Generator",
        correctAnswer = 2,
        explanation = "King Crimsons Album 'Red' (1974, not 1973) gilt als eines der haertesten und komplexesten Werke des Prog-Rock. Es kombiniert Avantgarde, Jazz, klassische Formen und Proto-Metal. Das Album wurde wenige Monate vor der Auflosung der Band aufgenommen und Robert Fripp spielte einige Parts allein.",
        difficulty = 3,
        funFact = "Das Album 'Red' enthielt Gastauftritte von ehemaligen Bandmitgliedern, die kurzlich die Band verlassen hatten — John Wetton, Bill Bruford und andere kehrten zurueck, um dieses letzte Statement einzuspielen."
    ),

    // ── Synthpop / Electronica-Geschichte (7) ──────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welches Duesseldorfer Duo gilt als Begruender des Synthpop und veroeffentlichte 1981 das Album 'Computer Love' / 'The Model'?",
        answerA = "Tangerine Dream",
        answerB = "Kraftwerk",
        answerC = "Neu!",
        answerD = "Can",
        correctAnswer = 1,
        explanation = "Kraftwerk (Ralf Huetter und Florian Schneider) definierten mit Alben wie 'Autobahn' (1974), 'Trans-Europe Express' (1977) und 'Computer World' (1981) die Blaupause des Synthpop. 'The Model' / 'Computer Love' wurde 1982 zur Nummer 1 in Grossbritannien — Jahre nach der urspruenglichen Veroeffentlichung.",
        difficulty = 3,
        funFact = "Kraftwerk traten 1975 in der US-Fernsehshow 'Midnight Special' auf und verwirren das Publikum mit ihrem roboterhaften Auftritt. David Bowie nannte Kraftwerk 'die Band der Zukunft' und liess sich fuer sein Berlin-Triptychon inspirieren."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher britische Produzent ist als Erfinder des 'Roland TR-808-Sounds' im Pop bekannt und produzierte u.a. 'Planet Rock' von Afrika Bambaataa (1982)?",
        answerA = "Arthur Baker",
        answerB = "Giorgio Moroder",
        answerC = "Trevor Horn",
        answerD = "Brian Eno",
        correctAnswer = 0,
        explanation = "Arthur Baker produzierte gemeinsam mit John Robie 'Planet Rock' (1982) und nutzte dabei massgeblich den Roland TR-808-Drum-Computer. Der Track verband Kraftwerk-Samples mit Hip-Hop-Elementen und pragte so die Bruecke zwischen Synthpop und Electro-Rap.",
        difficulty = 3,
        funFact = "Der Roland TR-808, 1980 erschienen und damals kommerziell erfolglos, wurde zum meistgesampleten Drum-Computer der Geschichte. Sein charakteristischer 'boom' im Bass-Drum-Sound ist auf Tausenden von R&B-, Hip-Hop- und Pop-Hits zu hoeren."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Synthesizer, 1964 von Robert Moog vorgestellt, war der erste kommerziell erfolgreiche modulare Synthesizer und revolutionierte die Popmusik?",
        answerA = "ARP Odyssey",
        answerB = "Minimoog",
        answerC = "Moog Modular Synthesizer",
        answerD = "Roland Juno-106",
        correctAnswer = 2,
        explanation = "Der Moog Modular Synthesizer wurde 1964 auf der AES-Konferenz vorgestellt. Wendy Carlos Album 'Switched-On Bach' (1968) machte ihn einer breiten Oeffentlichkeit bekannt. Er war teuer und komplex, wurde aber von Emerson, Lake & Palmer und anderen Prog-Rock-Kuenstlern ikonisch eingesetzt.",
        difficulty = 3,
        funFact = "Robert Moog arbeitete urspruenglich mit dem Komponisten Herbert Deutsch zusammen, um den ersten Synthesizer zu entwickeln. Das Patent fuer die spannungsgesteuerte Filterarchitektur (VCF) wurde 1966 angemeldet — eine Grundlage aller modernen Synthesizer."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche britische Band einfuehrte 1981 mit dem Album 'Movement' den Begriff 'dark synth' und pragte Factory Records entscheidend?",
        answerA = "Human League",
        answerB = "New Order",
        answerC = "Depeche Mode",
        answerD = "Cabaret Voltaire",
        correctAnswer = 1,
        explanation = "New Order entstanden nach dem Tod von Ian Curtis aus Joy Division. 'Movement' (1981) war ihr Debut-Album, noch stark von Joy Division beeinflusst. Mit 'Blue Monday' (1983) erfanden sie dann den perfekten Synthpop-Dancefloor-Hit — die meistverkaufte 12-Inch-Single aller Zeiten.",
        difficulty = 3,
        funFact = "'Blue Monday' verlor bei jedem verkauften Exemplar Geld: Das aufwendige Locher-Design der Huelle kostete mehr als der Verkaufspreis. Factory Records-Chef Tony Wilson kommentierte das lakonisch als 'Kunstentscheidung'."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Genre entstand in den fruehen 1990er Jahren in Detroit aus Techno und House und gilt als einer der ersten US-amerikanischen Electronica-Stile?",
        answerA = "Ambient House",
        answerB = "Jungle/Drum and Bass",
        answerC = "Intelligent Dance Music (IDM)",
        answerD = "Detroit Techno",
        correctAnswer = 3,
        explanation = "Detroit Techno entstand in den 1980er Jahren (nicht 1990er) durch Juan Atkins, Derrick May und Kevin Saunderson — die sogenannte 'Belleville Three'. Sie verarbeiteten Kraftwerk-Einfluesse mit Soul und Funk zu einem futuristischen Sound. Es gilt als erster genuiner US-amerikanischer Beitrag zur Electronica-Geschichte.",
        difficulty = 3,
        funFact = "Derrick May beschrieb Detroit Techno als 'George Clinton und Kraftwerk in einem Fahrstuhl'. Die Metapher erklaert den Sound besser als jede Genredefinition: schwarze Musikkultur trifft deutschen Maschinenfunk."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Label veroeffentlichte 1992 'Selected Ambient Works 85-92' von Aphex Twin und gilt als wichtigstes Label fuer IDM?",
        answerA = "Warp Records",
        answerB = "Ninja Tune",
        answerC = "Hyperdub",
        answerD = "Planet Mu",
        correctAnswer = 0,
        explanation = "Warp Records aus Sheffield veroeffentlichte 1992 'Selected Ambient Works 85-92' von Richard D. James (Aphex Twin). Das Label gruendete auch die Compilation-Serie 'Artificial Intelligence' (1992), die den Begriff IDM (Intelligent Dance Music) populaer machte.",
        difficulty = 3,
        funFact = "Aphex Twin behauptet, er habe viele Tracks auf diesem Album im Schlaf komponiert — er trainierte sich, beim Einschlafen weiter Musik zu 'hoeren' und schrieb die Melodien beim Aufwachen auf. Ob das stimmt, weiss niemand."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Sampler-Firma revolutionierte 1979 die Musikproduktion mit dem Fairlight CMI und war damit ein Vorreiter der digitalen Musik?",
        answerA = "Ensoniq",
        answerB = "New England Digital (Synclavier)",
        answerC = "Fairlight Instruments (Australien)",
        answerD = "E-mu Systems",
        correctAnswer = 2,
        explanation = "Fairlight Instruments aus Sydney, Australien, entwickelte 1975-1979 den Fairlight CMI (Computer Musical Instrument) — einen der ersten kommerziellen Sampler ueberhaupt. Peter Gabriel, Kate Bush und Stevie Wonder zahlten damals 25.000-100.000 US-Dollar pro Geraet.",
        difficulty = 3,
        funFact = "Kate Bush lernte den Fairlight CMI direkt vom Entwickler Peter Vogel. 'Babooshka' (1980) war einer der ersten Mainstream-Hits, die massgeblich Fairlight-Sounds nutzten. Das Geraet wog circa 40 kg und fuellte einen ganzen Tisch."
    ),

    // ── Musical-Theater-Geschichte (7) ─────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welches Musical von Rodgers und Hammerstein (1943) gilt als das erste 'Book Musical' und revolutionierte das Genre durch Einheit von Song, Tanz und Handlung?",
        answerA = "South Pacific",
        answerB = "Oklahoma!",
        answerC = "Carousel",
        answerD = "The King and I",
        correctAnswer = 1,
        explanation = "Oklahoma! (1943) von Richard Rodgers und Oscar Hammerstein II gilt als Geburtsstunde des integrierten 'Book Musical', bei dem Songs und Tanze die Handlung vorantreiben — statt nur unterhalten. Das Musical lief 2.212 Vorstellungen am Broadway und setzte neue Massstabe fuer das Genre.",
        difficulty = 3,
        funFact = "Oklahoma! begann als 'Away We Go!' und galt bei Investoren als Fehlschlag — es gab keinen Starbesetzung und keinen spektakulaeren Eroeffnungsnummer. Erst Previews ueberzaengten: das erste Lied 'Oh, What a Beautiful Mornin'' begann mit einem einsamen Cowboy, kein Chorus-Girl in Sicht."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Regisseur und Choreograph pragte das Broadway-Musical der 1970er und 1980er Jahre massgeblich und schuf 'A Chorus Line' (1975)?",
        answerA = "Bob Fosse",
        answerB = "Jerome Robbins",
        answerC = "Michael Bennett",
        answerD = "Harold Prince",
        correctAnswer = 2,
        explanation = "Michael Bennett entwickelte 'A Chorus Line' aus Tape-Aufnahmen echter Broadway-Darsteller, die ihre Lebensgeschichten erzaehlten. Das Stueck lief von 1975 bis 1990 am Broadway — 6.137 Vorstellungen — und gewann 9 Tony Awards sowie den Pulitzer-Preis.",
        difficulty = 3,
        funFact = "Die Ur-Proben fanden in einem Loft in SoHo statt und begannen mit einem Kreis von Tanzern, die ihre Geschichten erzaehlten. Das Marathon-Erste-Probe-Session dauerte 12 Stunden. Michael Bennett starb 1987 an AIDS, bevor er das Ende des Erfolgs erlebte."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher deutschsprachige Komponist des 20. Jahrhunderts praegte das politische 'Lehrstueck' und arbeitete eng mit Bertolt Brecht zusammen?",
        answerA = "Paul Dessau",
        answerB = "Kurt Weill",
        answerC = "Hanns Eisler",
        answerD = "Carl Orff",
        correctAnswer = 1,
        explanation = "Kurt Weill komponierte gemeinsam mit Bertolt Brecht 'Die Dreigroschenoper' (1928), 'Aufstieg und Fall der Stadt Mahagonny' (1930) und weitere Werke. Die Zusammenarbeit endete mit Weills Emigration in die USA, wo er erfolgreich Broadway-Musicals schrieb.",
        difficulty = 3,
        funFact = "Die Urauffuehrung der 'Dreigroschenoper' am 31. August 1928 in Berlin war ein Zufallserfolg: Die Proben liefen schlecht, Brecht und Weill erwarteten einen Flop. Stattdessen wurde es der groesste Theatererfolg der Weimarer Republik."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Stephen-Sondheim-Musical von 1979 gilt wegen seiner komplexen Harmonik und Gegenmelodien als anspruchsvollstes Werk des Broadway?",
        answerA = "Sweeney Todd: The Demon Barber of Fleet Street",
        answerB = "Company",
        answerC = "Follies",
        answerD = "Into the Woods",
        correctAnswer = 0,
        explanation = "Sweeney Todd (1979) kombiniert Grand Opera, Moritat und Musical-Theater zu einem dichten Werk. Sondheims Partitur mit bitonalen Harmonien, polyphone Ensemble-Szenen und dem Leitmotiv-System wird von Kritikern als technisch anspruchsvollste Broadway-Partitur des 20. Jahrhunderts bezeichnet.",
        difficulty = 3,
        funFact = "Sondheim sagte ueber Sweeney Todd: 'Es ist eigentlich eine Oper, aber ich wage es nicht so zu nennen, weil Broadwaypublikum dann nicht kommt.' Viele Opernhaeuser haben es inzwischen ins Repertoire aufgenommen — das Royal Opera House London spielte es 2023."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches fruehere Broadway-Genre, das bis in die 1930er Jahre dominant war, kombinierte komische Szenen, Varietenummern und lose Handlung ohne dramatische Einheit?",
        answerA = "Burleske",
        answerB = "Vaudeville",
        answerC = "Revue",
        answerD = "Musical Comedy",
        correctAnswer = 2,
        explanation = "Die Broadway-Revue (wie Ziegfeld Follies, seit 1907) war eine Abfolge von Liedern, Sketches und Tanzeinlagen ohne verbindende Handlung. Sie war das dominante Format bis in die fruehen 1930er, bevor das 'Book Musical' sie abloeste. Stars wie Fanny Brice und Will Rogers wurden durch Revues beruehmt.",
        difficulty = 3,
        funFact = "Florenz Ziegfeld nannte seine Follies 'A National Institution'. In der Hochzeit beschaeftigten die Ziegfeld Follies (1907-1931) bis zu 600 Mitwirkende pro Staffel und galten als aufwendigstes Buehnenspektakel der Welt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Musical von Lin-Manuel Miranda (2015) nutzte Hip-Hop und R&B als Hauptmedium, um die Geschichte eines Gruendungsvaters der USA zu erzaehlen?",
        answerA = "In the Heights",
        answerB = "Hamilton",
        answerC = "Rent",
        answerD = "Spring Awakening",
        correctAnswer = 1,
        explanation = "Hamilton (2015) von Lin-Manuel Miranda erzaehlt die Biografie von Alexander Hamilton durch Hip-Hop, R&B, Soul und Pop. Das Casting ignorierte bewusst historische Ethnie — Schauspieler aller Hintergruende spielen die weissen Gruendervaeter. Es gewann 11 Tony Awards und revolutionierte das Musical-Theater.",
        difficulty = 3,
        funFact = "Miranda hatte die Idee zu Hamilton beim Lesen von Ron Chernows Hamilton-Biografie im Urlaub. Er begann 2009 mit einem einfachen Rap und arbeitete sieben Jahre daran. Der erste Entwurf des Opening-Songs wurde im Weissen Haus fuer Barack Obama vorgefuehrt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Konzept-Musical von 1971 basiert auf dem Neuen Testament und war eines der ersten Rockmusicals, das die Passionsgeschichte in zeitgemaessem Stil darstellte?",
        answerA = "Godspell",
        answerB = "Jesus Christ Superstar",
        answerC = "Joseph and the Amazing Technicolor Dreamcoat",
        answerD = "Pippin",
        correctAnswer = 1,
        explanation = "Jesus Christ Superstar (1971) von Andrew Lloyd Webber und Tim Rice war zunachst als Konzeptalbum konzipiert (1970) und wurde dann zum Buehnenwerk. Es erzaehlt die letzte Woche im Leben Jesu aus der Perspektive von Judas Iskariot — ein damals provokanter Ansatz.",
        difficulty = 3,
        funFact = "Das Konzeptalbum 'Jesus Christ Superstar' (1970) erschien vor jeder Buehnenproduktion und wurde in den USA verboten — nicht von der Regierung, sondern von Radiosendern, die es als blasphemisch ablehnten. Die spaeteren Buehnenproduktionen wurden trotzdem Welterfolge."
    ),

    // ── Musikarchaeologie (6) ───────────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welches Instrument, gefunden in einer Hoehle in Slowenien, gilt mit einem Alter von ca. 50.000 Jahren als moegliches aeltestes bekanntes Musikinstrument der Welt?",
        answerA = "Hoehlenbaer-Knochen-Floete von Divje Babe",
        answerB = "Mammutzahn-Flaute von Vogelherd",
        answerC = "Geierknochenfloete von Hohle Fels",
        answerD = "Rentiergeweih-Raspelinstrument von La Quina",
        correctAnswer = 0,
        explanation = "Die Knochen-Floete von Divje Babe (Slowenien) wurde 1995 entdeckt und auf ca. 50.000-60.000 Jahre datiert. Sie besteht aus einem Hoehlenbaeren-Femur mit zwei bis vier Loechern. Ob sie von Neandertalern oder modernen Menschen hergestellt wurde, ist noch umstritten.",
        difficulty = 3,
        funFact = "Die Frage, ob Neandertaler Musik machten, ist eine der spannendsten in der Wissenschaft. Die Divje-Babe-Flaete liegt in der Phase vor der Ankunft des Homo sapiens in Europa — was bedeuten wuerde, dass Neandertaler als erste Musiker gelten koennen."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche altaegyptische Harfenform ist auf Wandgemälden aus dem Neuen Reich (ca. 1550-1069 v. Chr.) am haeufigsten abgebildet?",
        answerA = "Winkelharfe",
        answerB = "Bogenharfe",
        answerC = "Rahmenharfe",
        answerD = "Leierharfe (Kithara)",
        correctAnswer = 1,
        explanation = "Die altaegyptische Bogenharfe (ssp) hat einen nach hinten gebogenen Resonanzkkoerper ohne Vordersaeule. Sie existierte bereits im Alten Reich (2700 v. Chr.) und ist auf zahlreichen Grabgemälden abgebildet. Im Neuen Reich kamen grosse, reich verzierte Standharfen hinzu.",
        difficulty = 3,
        funFact = "Im altaegyptischen Grab des Nacht in Luxor (ca. 1400 v. Chr.) zeigt ein Gemälde ein Ensemble aus Harfe, Laute, Doppelrohrfloete und klatschenden Saengerinnen — ein Schnappschuss einer Musikaufführung vor 3.400 Jahren."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist die 'Seikilos-Stele' und warum ist sie bedeutsam fuer die Musikgeschichte?",
        answerA = "Eine roemische Marmorsaeule mit Noten des Gregorianischen Chorals",
        answerB = "Die aelteste vollstaendig erhaltene und notierte Melodie der Welt (1. Jh. n. Chr., griechisch)",
        answerC = "Ein babylonisches Tontafelarchiv mit Keilschrift-Notation",
        answerD = "Ein mittelaegyptischer Papyrus mit koptischen Hymnen",
        correctAnswer = 1,
        explanation = "Die Seikilos-Stele (ca. 1.-2. Jh. n. Chr., Izmir/Tuerkei) traegt ein vollstaendiges Lied in griechischer Notation mit Text. Es ist die aelteste vollstaendig erhaltene und reproduzierbare Melodie der Welt. Der Text lautet sinngemass: 'Solange du lebst, leuchte — sei nicht traurig, das Leben waehrt nur kurz.'",
        difficulty = 3,
        funFact = "Die Stele wurde von einem Ehemann namens Seikilos zum Andenken an seine verstorbene Frau Euterpe aufgestellt. Die Notation ist zwar nicht mit modernen Noten identisch, wurde aber von Musikologen entschluesselt und kann heute gespielt werden."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches mesopotamische Musikinstrument wurde 2022 aus dem Koenigsfriedhof von Ur (ca. 2600 v. Chr.) rekonstruiert und in einem BBC-Projekt zum Klingen gebracht?",
        answerA = "Die Silberlyra von Ur",
        answerB = "Die Goldene Harfe der Koenigin Puabi",
        answerC = "Die Grosse Lyra von Ur (Bull-Headed Lyre)",
        answerD = "Das Sumerische Sistruminstrument",
        correctAnswer = 2,
        explanation = "Die 'Grosse Lyra von Ur' (auch als 'Bull-Headed Lyre' bekannt) stammt aus dem Koenigsfriedhof von Ur (ca. 2600-2400 v. Chr.) und wurde im British Museum aufbewahrt. 2022 erstellte ein Team unter Leitung von Willy Braun eine spielbare Rekonstruktion fuer das BBC-Projekt 'Songs of the Ancient World'.",
        difficulty = 3,
        funFact = "Im Koenigsfriedhof von Ur wurden Musiker zusammen mit dem Koenigspaar begraben — einige scheinbar freiwillig, andere moeglicherweise nicht. Die Lyren lagen neben den Skeletten der Hofspieler, als haetten sie noch gespielt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches chinesische Instrument hat eine nachgewiesene Geschichte von mindestens 9.000 Jahren und wurde in Jiahu (Henan-Provinz) in Form von 33 Knochenfloten gefunden?",
        answerA = "Erhu (Kniegeige)",
        answerB = "Qin (Wuchitoartige Laute)",
        answerC = "Gudi (Knochen-Flaute, auch Gudi-Knochenflote)",
        answerD = "Sheng (Mundorgel)",
        correctAnswer = 2,
        explanation = "In Jiahu (Henan, China) wurden 1987 Knochen-Flauten aus Kranichknochen entdeckt, die auf ca. 7000-5700 v. Chr. datiert werden — also rund 9.000 Jahre alt. Sie sind nicht nur die aeltesten erhaltenen chinesischen Instrumente, sondern gehoeren zu den aeltesten spielbaren Instrumenten der Welt.",
        difficulty = 3,
        funFact = "Erstaunlicherweise sind einige der Jiahu-Flauten noch spielbar. Musiker haben gezeigt, dass sie nicht nur pentatonische, sondern auch heptatonische (7-Ton-)Skalen erlauben — was auf ein fortgeschrittenes musikalisches Verstaendnis bereits vor 9.000 Jahren hindeutet."
    ),

    Question(
        categoryId = 5,
        questionText = "Wie heisst das aelteste bekannte Notationssystem der Welt, das auf Keilschrift-Tontafeln aus der altbabylonischen Zeit (ca. 1800 v. Chr.) basiert?",
        answerA = "Hurritian Notation",
        answerB = "Sumerische Zeichennotation",
        answerC = "Hurritische Hymnen / Cuneiform Music Notation",
        answerD = "Babylonische Lautenhandschrift",
        correctAnswer = 2,
        explanation = "Die 'Hurritischen Hymnen' (ca. 1400 v. Chr., Ugarit/Syrien) sind das aelteste bekannte vollstaendig notierte Musikstueck. Die Keilschrift-Tontafeln enthalten Namen der Saiten und Intervall-Angaben. Das Fragment H.6 wurde von Musikologen in verschiedenen Versionen rekonstruiert.",
        difficulty = 3,
        funFact = "Die Entschluesslung der Hurritischen Notation ist bis heute umstritten — verschiedene Wissenschaftler produzieren voellig unterschiedliche Melodien aus derselben Tontafel. Die Interpretationsproblematik zeigt, wie lueckenhaft unser Wissen antiker Musik bleibt."
    ),

    // ── Vocal-Techniken / Gesang (8) ───────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Was beschreibt die Belting-Technik im populaeren Gesang und wie unterscheidet sie sich vom klassischen Sopran-Gesang?",
        answerA = "Belting ist Falsett-Gesang mit Mikrofonverstaerkung",
        answerB = "Belting ist eine kraftvolle Chest-Voice-Technik in hoher Lage, bei der die Bruststimme ueber ihre natuerliche Grenze erweitert wird — im Gegensatz zum Mix oder Kopfklang des klassischen Sopran",
        answerC = "Belting bezeichnet Vibrato-Gesang im Jazz",
        answerD = "Belting ist eine rein elektronische Stimmverzerrung",
        correctAnswer = 1,
        explanation = "Beim Belting wird die Bruststimme (Chest Voice) in Bereiche getragen, wo klassisch ausgebildete Saenger in die Kopfstimme wechseln wuerden. Es erzeugt einen hellen, kraftvollen, direkten Klang. Klassiker wie Ethel Merman, Patti LuPone und Idina Menzel sind Meisterinnen dieser Technik.",
        difficulty = 3,
        funFact = "Belting ist stimmlich risikoreich ohne korrekte Technik: Es kann zu Knoetchen auf den Stimmbaendern fuehren. Die Grenze zwischen gesundem und schaedlichem Belting liegt im Schutz des Kehlkopfes durch Senken des Larynx und richtige Atemstutze."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Stimmlage hat ein typischer Countertenor und welche Technik verwendet er hauptsaechlich?",
        answerA = "Tiefe Bruststimme wie ein Bass-Bariton",
        answerB = "Altlage mit vorwiegend Falsett oder Mischregister (Mix Voice)",
        answerC = "Tenor-Stimmlage mit Vibrato",
        answerD = "Sopranstimme durch Kastration erzeugt",
        correctAnswer = 1,
        explanation = "Der Countertenor singt in der Alt- oder Mezzosopran-Lage (ca. c' bis g'') und nutzt dafuer hauptsaechlich Falsett oder ein kultiviertes Mischregister. Bekannte Countertenor-Kuenstler sind Andreas Scholl, Philippe Jaroussky und David Daniels. Das Fach erlebte in der Barockmusik eine Bluetezeit.",
        difficulty = 3,
        funFact = "Der Countertenor ist nicht zu verwechseln mit dem Kastraten-Sopran des Barock: Kastraten wurden als Kinder kastriert, um ihre Stimme zu erhalten. Countertenori sind anatomisch unveraenderte Maenner, die eine bestimmte Falsett-Technik kultivieren."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist Khoomei (Kehlkopfgesang) und in welcher Kultur hat er seinen Ursprung?",
        answerA = "Eine indische Raga-Meditationstechnik",
        answerB = "Eine Technik, bei der ein Saenger durch spezielle Formung des Stimmtrakts mehrere Toene gleichzeitig produziert — Ursprung in Tuwa (Sibirien) und der Mongolei",
        answerC = "Ein japanischer Rezitationsgesang buddhistischer Moenche",
        answerD = "Eine armenische Mehrstimmigkeitstradition",
        correctAnswer = 1,
        explanation = "Khoomei (auch Hoomei oder Overtone Singing) ist eine Technik aus der tuwinischen und mongolischen Kultur, bei der der Saenger durch Formung von Mund-, Rachen- und Nasenraumresonanzen gleichzeitig einen Grundton und einzelne Obertoene hoerbar macht. Es klingt, als singe eine Person zwei verschiedene Melodien gleichzeitig.",
        difficulty = 3,
        funFact = "Khoomei wurde 2009 von der UNESCO in die Liste des Immateriellen Kulturerbes aufgenommen. Westliche Kuenstler wie David Hykes (Harmonic Choir) und Anna-Maria Hefele popularisierten den Oberton-Gesang in Europa."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Technik bezeichnet im Operngesang das kontrollierte Schwanken der Tonhoehe um einen Zielton, das dem Gesang Lebendigkeit verleiht?",
        answerA = "Portamento",
        answerB = "Appoggiatura",
        answerC = "Vibrato",
        answerD = "Messa di voce",
        correctAnswer = 2,
        explanation = "Vibrato ist das periodische, kontrollierte Schwanken der Tonhoehe (typischerweise 5-7 Hz) um einen Zielton. Es entsteht durch regelmaessige Schwingung des Atemdruck-Zyklus. Zu viel Vibrato (Tremolo) oder zu schnelles Vibrato ('Zitter') gilt als Stimmfehler; gar kein Vibrato (straight tone) wird fuer bestimmte Effekte eingesetzt.",
        difficulty = 3,
        funFact = "Ob historische Saenger Vibrato einsetzten, ist in der Aufnahme-historischen Forschung umstritten. Fruehe Gramophon-Aufnahmen (1900-1920) zeigen Saenger mit sehr geringem Vibrato; viele historisch informierte Aufhuehrungspraxis-Ensembles bevorzugen heute geraden Ton fuer Barockmusik."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man im Gesang unter dem Begriff 'passaggio' (ital. fuer 'Durchgang')?",
        answerA = "Eine Atemtechnik bei langen Phrasen",
        answerB = "Die Uebergangszone zwischen zwei Stimmregistern, in der die Stimme leicht kippt oder sich veraendert",
        answerC = "Eine ornamentale Koloraturpassage im Barock",
        answerD = "Die Bezeichnung fuer Pianissimo-Gesang",
        correctAnswer = 1,
        explanation = "Der Passaggio (auch Registerbruch oder 'Flip') bezeichnet den Bereich, in dem die Stimme zwischen Chest Voice und Head Voice/Falsett wechselt. Bei Tenoren liegt der erste Passaggio um e'-f', bei Sopranen um d''-e''. Professionelle Saenger arbeiten daran, diesen Uebergang unmerklich zu gestalten.",
        difficulty = 3,
        funFact = "Der beruehmt-beruechtigte 'Yodel' in der Schweizer Volksmusik nutzt absichtlich den Passaggio als Stilmittel: Der abrupte Wechsel zwischen Brust- und Kopfstimme erzeugt den charakteristischen Sprung-Effekt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Gesangstechnik wird als 'subharmonisch' oder 'Fry' bezeichnet und was ist ihre Funktion?",
        answerA = "Falsett-Gesang in extremer Hoehe",
        answerB = "Vocal Fry ist ein knackendes, kratziges Register ganz unten in der Stimmskala, erzeugt durch sehr lockere Stimmbaende mit geringem Luftstrom",
        answerC = "Eine Technik zur Erzeugung von Obertoen durch Mundresonanz",
        answerD = "Gepresster Gesang durch Anheben des Kehlkopfes",
        correctAnswer = 1,
        explanation = "Vocal Fry (auch Strohbass oder Pulsregister) ist das tiefste Stimmregister. Die Stimmbaende schwingen sehr langsam und unregelmassig — unter 70 Hz — was den charakteristischen knackenden Sound erzeugt. Manche Saenger wie Leonard Cohen nutzten es kuenstlerisch; es ist auch bei Sprecherinnen in Nordamerika verbreitet.",
        difficulty = 3,
        funFact = "Vocal Fry tritt kulturell unterschiedlich auf: In den USA wurde 2011 eine 'Epidemie' des Vocal Fry bei jungen Frauen festgestellt. In anderen Kulturen ist es kaum verbreitet. Ob es stimmschaedlich ist, ist unter Logopaedinnen umstritten."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Aspekt der Intonation unterscheidet 'just intonation' von 'equal temperament' im Gesang?",
        answerA = "Just intonation nutzt mathematisch reine Intervallverhaeltnisse (z.B. Quinte = 3:2), equal temperament teilt die Oktave in 12 gleichgrosse Halbtonstufen",
        answerB = "Just intonation ist nur fuer Chor-Gesang, equal temperament nur fuer Solisten",
        answerC = "Es gibt keinen hoerbaren Unterschied",
        answerD = "Just intonation stammt aus dem 20. Jahrhundert, equal temperament aus der Renaissance",
        correctAnswer = 0,
        explanation = "Just Intonation basiert auf reinen Zahlenverhaeltnissen: Quinte = 3:2, grosse Terz = 5:4 etc. Equal Temperament (gleichschwebende Stimmung) teilt die Oktave in 12 gleiche Halbtone, was alle Quinten minimal zu eng macht. Chorgruppen ohne Begleitung singen oft intuitiv just intoniert, wodurch Akkorde besonders 'schwingen'.",
        difficulty = 3,
        funFact = "Das Streichquartett von La Monte Young probt wochenlang ausschliesslich in just intonation. Young behauptet, nach monatelangem Training koenne das Ensemble Frequenzen auf wenige Cents genau ausrichten — ein Phaenomen, das Physiker mit Schwebungen erklaeren."
    ),

    Question(
        categoryId = 5,
        questionText = "Wie heisst die indische klassische Gesangstradition, in der Melodien auf Silben wie 'Ra', 'Ri', 'Na' ohne Text gesungen werden und die als Grundlage des Hindustani-Gesangs gilt?",
        answerA = "Dhrupad",
        answerB = "Alap",
        answerC = "Thumri",
        answerD = "Sargam / Svaras",
        correctAnswer = 3,
        explanation = "Sargam ist das indische aequivalent der westlichen Solfege: Die sieben Svara (Sa, Re, Ga, Ma, Pa, Dha, Ni) werden als Silben gesungen und geben den Notenbezeichnungen ihren Namen. Alap ist dagegen die langsame, improvisierte Einleitung eines Raga ohne festes Metrum.",
        difficulty = 3,
        funFact = "Das westliche 'Do-Re-Mi' und das indische 'Sa-Re-Ga-Ma' entwickelten sich unabhaengig voneinander als Memorier-Systeme fuer Tonleitern. Beide dienen dem gleichen Zweck: Saengern zu ermoglichen, Intervalle innerlich zu hoeren, ohne ein Instrument zu benutzen."
    ),

    // ── Musikverlage / Notengeschichte (7) ────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welcher venezianische Drucker gilt als Begruender des Notendrucks mit beweglichen Typen und erlangte 1501 das erste Notendruck-Privileg?",
        answerA = "Johannes Gutenberg",
        answerB = "Ottaviano Petrucci",
        answerC = "Pierre Attaingnant",
        answerD = "Christoph Plantin",
        correctAnswer = 1,
        explanation = "Ottaviano Petrucci (1466-1539) erlangte 1498 ein Privileg des venezianischen Senats und druckte 1501 das erste Buch mit polyphone Vokalmusik im beweglichen Notendruck: 'Harmonice Musices Odhecaton A'. Seine mehrstufige Drucktechnik ermoeglichte erstmals praezise mehrstimmige Notation.",
        difficulty = 3,
        funFact = "Petrucci verwendete drei separate Druckdurchlaeufe: zuerst die Notenlinien, dann die Notenkoepfe, dann den Text. Dieses aufwendige Verfahren dauerte Tage fuer eine einzige Seite — erklaert, warum Notendrucke bis ins 17. Jahrhundert Luxusgueter blieben."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Notationssystem aus dem Mittelalter diente der rhythmischen Praezisierung der Gregorianik und wird als Vorlaeufer der mensuralen Notation angesehen?",
        answerA = "Neumen-Notation",
        answerB = "Modalnotation (Modalrhythmus)",
        answerC = "Quadratnotation",
        answerD = "Guidonische Hand",
        correctAnswer = 1,
        explanation = "Die Modalnotation (ca. 1150-1250, Notre Dame-Schule) war das erste rhythmische Notationssystem der europaeischen Musik. Sie basierte auf sechs Rhythmustypen (Modi), die durch die Abfolge von Ligaturgruppen angezeigt wurden. Leonin und Perotin nutzten sie fuer ihre Organa.",
        difficulty = 3,
        funFact = "Die Guidonische Hand (nach Guido von Arezzo, ca. 991-1033) ist kein Notationssystem, sondern eine Gedaechtnistechnik: Verschiedene Fingergelenke standen fuer verschiedene Toene, sodass Saenger durch Zeigen auf die Hand eine Melodie 'ablesen' konnten."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Verlag gilt als aeltester noch aktiver Musikverlag der Welt, gegruendet 1543 in Paris?",
        answerA = "Breitkopf und Haertel (Leipzig, 1719)",
        answerB = "Schott Music (Mainz, 1770)",
        answerC = "Le Roy & Ballard / Editions Salabert (Nachfolger der Ballard-Dynastie, 1543)",
        answerD = "Peters (Leipzig, 1800)",
        correctAnswer = 2,
        explanation = "Die Druckerdynastie Ballard erhielt 1553 das koenigliche Druckmonopol in Frankreich und verlegte fast 200 Jahre lang fast alle gedruckte Musik Frankreichs. Als Vorgaenger der heutigen Editions Salabert gilt sie als laengste ununterbrochene Verlags-Tradition — wenngleich der direkte Nachfolger Breitkopf & Haertel als aktivster alter Verlag oft genannt wird.",
        difficulty = 3,
        funFact = "Breitkopf & Haertel (gegruendet 1719 in Leipzig) war der erste Verlag, der Beethoven systematisch verlegte, und veroeffentlichte auch Mozarts Werke posthum. Sie existieren heute noch und verlegen klassische Ausgaben."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist der Unterschied zwischen einer 'Urtext'-Ausgabe und einer 'praktischen Ausgabe' von Noten?",
        answerA = "Urtext ist handgeschrieben, praktische Ausgaben sind gedruckt",
        answerB = "Urtext gibt den Originaltext des Komponisten ohne editorische Eingriffe wieder; praktische Ausgaben enthalten Fingersaetze, Bogenstellungen und andere interpretative Zugaben des Herausgebers",
        answerC = "Urtext-Ausgaben sind nur fuer Universitaeten bestimmt",
        answerD = "Es gibt keinen praktischen Unterschied",
        correctAnswer = 1,
        explanation = "Urtext-Ausgaben (wie die des Henle-Verlags) geben den Notentext so nah wie moeglich am Autograph oder den fruehesten zuverlaessigen Quellen wieder. Praktische Ausgaben (z.B. alte Peters-Ausgaben) enthielten oft Fingersaetze und Phrasierungen von Herausgebern wie Czerny oder Bueelow, die heutige Musiker als Verwoerfung werten.",
        difficulty = 3,
        funFact = "Der Henle Verlag (Muenchen, gegruendet 1948) wurde bewusst als Reaktion auf die editorischen 'Verbesserungen' des 19. Jahrhunderts gegruendet. Henles erster Verlagsleiter sagte: 'Wir drucken, was die Komponisten geschrieben haben — nicht, was andere dachten, was sie haetten schreiben sollen.'"
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Unternehmen erwarb 2022 den gesamten Song-Katalog von Bruce Springsteen (Noten + Masterrechte) fuer geschaetzte 500 Millionen US-Dollar?",
        answerA = "Universal Music Group",
        answerB = "Sony Music Entertainment",
        answerC = "Warner Music Group",
        answerD = "Hipgnosis Songs Fund",
        correctAnswer = 1,
        explanation = "Sony Music Entertainment erwarb 2021/2022 den gesamten Katalog von Bruce Springsteen — sowohl die Verlagsrechte an den Kompositionen als auch die Masterrechte an den Aufnahmen — fuer geschaetzte 500 Millionen US-Dollar. Es war der groesste Einzel-Katalog-Deal in der Geschichte der Musikindustrie.",
        difficulty = 3,
        funFact = "Der Springsteen-Deal ueberbot den zuvor groessten Deal: Bob Dylan verkaufte 2020 seinen gesamten Kompositionskatalog (600 Songs) an Universal Music Group fuer geschaetzte 300-400 Millionen Dollar. Der 'Katalog-Goldrausch' der 2020er Jahre zeigt, wie wertvoll historische Musikrechte als Investitionsobjekte geworden sind."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist die GEMA und wie unterscheidet sie sich von der US-amerikanischen ASCAP?",
        answerA = "GEMA ist eine staatliche Behoerde, ASCAP ein privater Verein",
        answerB = "GEMA ist die deutsche Gesellschaft fuer musikalische Auffuehrungsrechte (staatlich anerkannte Verwertungsgesellschaft mit Pflichtmitgliedschaft fuer Verlaeger); ASCAP ist ein freiwilliger Zusammenschluss amerikanischer Komponisten",
        answerC = "Beide sind identische Organisationen, die nur in verschiedenen Laendern operieren",
        answerD = "GEMA lizenziert Masterrechte, ASCAP Verlagsrechte",
        correctAnswer = 1,
        explanation = "GEMA (Gesellschaft fuer musikalische Auffuehrungs- und mechanische Vervielfaeltigungsrechte) ist eine staatlich anerkannte deutsche Verwertungsgesellschaft mit faktischer Pflichtmitgliedschaft. ASCAP (American Society of Composers, Authors and Publishers, gegruendet 1914) ist ein freiwilliger Verein. In den USA gibt es zudem BMI und SESAC als weitere Performance-Rights-Organisationen.",
        difficulty = 3,
        funFact = "Die GEMA entscheidet per Schluessel, welcher Anteil eines Werks-Erloeses an Komponist, Textdichter und Verleger geht. Das Verhaltnis variiert je nach Werktyp: Bei Liedern erhalten Komponist und Textdichter je 1/3, der Verleger ebenfalls 1/3 — sofern er einen Verlagsvertrag hat."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche historische Notationsform wurde im 14. Jahrhundert in der 'Ars Nova' eingefuehrt und ermoeglichte erstmals die prazise Notation kleinerer Notenwerte?",
        answerA = "Choralsnotation",
        answerB = "Mensuralnotation",
        answerC = "Tabulatur",
        answerD = "Neumen-Adiastematisch",
        correctAnswer = 1,
        explanation = "Die Mensuralnotation (von lat. mensura = Mass) wurde im 13.-14. Jh. entwickelt und im Traktat 'Ars Nova' (ca. 1322) von Philippe de Vitry kodifiziert. Sie ermoeglichte es, Rhythmuswerte (Longa, Brevis, Semibrevis, Minima) prazise zu notieren — eine Revolution gegenueber der modalrhythmischen Ambiguitat der Vorlaeufer.",
        difficulty = 3,
        funFact = "Philippe de Vitry argumentierte in 'Ars Nova' fuer den Dreitakt UND den Zweitakt als gleichwertig. Die aeltere 'Ars Antiqua' hatte nur den Dreitakt als 'vollkommen' anerkannt, weil er die heilige Trinitat repraesentiere. Die Akzeptanz des Zweitakts war damit eine kleine musikalische Revolution."
    )

)
