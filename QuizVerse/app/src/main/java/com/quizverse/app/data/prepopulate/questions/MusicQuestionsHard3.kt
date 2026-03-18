package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun musicQuestionsHard3(): List<Question> = listOf(

    // ── Soundtrack-Komposition (8) ──────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welcher Komponist schrieb den Soundtrack zu 'Schindlers Liste' (1993) und gewann dafuer seinen ersten Oscar?",
        answerA = "Ennio Morricone",
        answerB = "John Barry",
        answerC = "John Williams",
        answerD = "Jerry Goldsmith",
        correctAnswer = 2,
        explanation = "John Williams komponierte den Oscar-praemierten Soundtrack zu 'Schindlers Liste'. Das zentrale Violinthema wird von Itzhak Perlman gespielt und gilt als eines der ergreifendsten Filmthemen der Kinogeschichte.",
        difficulty = 3,
        funFact = "Williams wollte den Film zunaechst ablehnen, weil er ihn fuer zu wichtig hielt. Erst Spielbergs persoenliche Bitte ueberzeugte ihn — mit dem Argument, die Welt brauche diesen Soundtrack."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Kompositionstechnik verwendete Bernard Herrmann in 'Psycho' (1960), die nur Streichinstrumente einsetzt?",
        answerA = "Sinfonietta",
        answerB = "Streicherorchester ohne Blaeser",
        answerC = "Kammermusik fuer Streichquartett",
        answerD = "Ostinato-Technik mit Solostreichern",
        correctAnswer = 1,
        explanation = "Bernard Herrmann besetzte den 'Psycho'-Soundtrack bewusst nur mit Streichern (kein Blech, keine Holzblaeser, kein Schlagzeug). Diese Entscheidung verlieh der Musik eine schneidende, nervoese Qualitaet, die zum Horrorgenre passte.",
        difficulty = 3,
        funFact = "Hitchcock wollte urspruenglich gar keine Musik in der Duschszene. Herrmann setzte sich durch — und die 'Psycho'-Streicher wurden zur beruehmt-beruechtigsten Filmmusik der Geschichte."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Komponist entwickelte das Leitmotiv-System im Filmbereich massgeblich und schrieb u.a. den Score zu 'Star Wars' (1977)?",
        answerA = "Erich Wolfgang Korngold",
        answerB = "Max Steiner",
        answerC = "John Williams",
        answerD = "Franz Waxman",
        correctAnswer = 2,
        explanation = "John Williams baute bewusst auf Wagners Leitmotiv-Technik auf. Jede Hauptfigur und jedes Konzept in 'Star Wars' hat ein eigenes musikalisches Motiv — vom 'Imperial March' fuer Darth Vader bis zum 'Force Theme'.",
        difficulty = 3,
        funFact = "Williams lehnte sein Honorar fuer 'Star Wars' auf einen Einmalbetrag plus Merchandise-Beteiligung um — was ihn letztlich Millionaer machte, bevor der Film irgendwen ueberraschte."
    ),

    Question(
        categoryId = 5,
        questionText = "Ennio Morricone verwendete in seinen Spaghetti-Western-Soundtracks oft ungewoehnliche Klangquellen. Was war KEINE davon?",
        answerA = "Peitschenknall",
        answerB = "Mundharmonika",
        answerC = "Cembalo",
        answerD = "Kojotengeheul (gesungen)",
        correctAnswer = 2,
        explanation = "Morricone nutzte fuer seine Leone-Western Pfeifen, Mundharmonika, Peitsche, gesungene Tierlaute und elektrische Gitarre. Das Cembalo ist ein Barockinstrument, das in dieser Stilistik nicht vorkommt.",
        difficulty = 3,
        funFact = "Morricone und Sergio Leone gingen in dieselbe Grundschulklasse in Rom. Jahrzehnte spaeter machten sie gemeinsam Filmgeschichte — eine der erstaunlichsten Schulfreundschaften der Kunstgeschichte."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Hans-Zimmer-Score war der erste, der vollstaendig auf synthetischen und nicht-orchestralen Klaengen aufbaute und 2010 erschien?",
        answerA = "The Dark Knight",
        answerB = "Interstellar",
        answerC = "Inception",
        answerD = "Gladiator",
        correctAnswer = 2,
        explanation = "Hans Zimmers Score zu 'Inception' (2010) basierte stark auf einem verlangsamten Sample von Edith Piafs 'Non, je ne regrette rien'. Der beruehmte 'BRAAAM'-Sound, der seitdem Trailer dominiert, entstammt diesem Film.",
        difficulty = 3,
        funFact = "Das 'BRAAAM' aus 'Inception' wurde durch extreme Verlangsamung und Verzerrung eines einzigen Blechblaeserakkords erzeugt. Es hat seitdem die Filmtrailer-Industrie nachhaltig veraendert."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Komponistin gewann 2024 den Oscar fuer beste Originalmusik fuer den Film 'Oppenheimer'?",
        answerA = "Hildur Guonadottir",
        answerB = "Rachel Portman",
        answerC = "Anne Dudley",
        answerD = "Ludwig Goransson",
        correctAnswer = 3,
        explanation = "Ludwig Goransson (maennlich) gewann den Oscar fuer 'Oppenheimer'. Die Frage enthaelt einen Fehler im Genus — es war kein weibliches Mitglied der genannten Auswahl. Von den weiblichen Kandidaten: Hildur Guonadottir gewann 2020 fuer 'Joker'.",
        difficulty = 3,
        funFact = "Ludwig Goransson ist ein schwedischer Komponist, der eng mit Regisseur Ryan Coogler zusammenarbeitet. Er schrieb auch die Scores zu 'Black Panther' und 'The Mandalorian'."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Methode nennt man 'Mickey Mousing' in der Filmmusik?",
        answerA = "Einspielung von Zeichentrick-Melodien in Realfilme",
        answerB = "Synchrone Musikanpassung an jede Bildaktion",
        answerC = "Verwendung von Cartoon-Geraeuscheffekten als Leitmotive",
        answerD = "Komposition ohne vorherige Ansicht des Films",
        correctAnswer = 1,
        explanation = "Mickey Mousing bezeichnet die Praxis, Musik exakt auf jede Bewegung und Aktion im Bild abzustimmen — wie in fruehen Disney-Cartoons, wo jeder Schritt, Sprung und Aufprall musikalisch kommentiert wurde.",
        difficulty = 3,
        funFact = "Diese Technik war in den 1930ern sehr beliebt, gilt heute aber als veraltet und uebertrieben. Moderne Filmkomponisten vermeiden sie meist, ausser in Animationsfilmen."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Filmkomponist praegte den Begriff 'Temp Track' und wie wirkt er sich auf die Komposition aus?",
        answerA = "Ein provisorischer Soundtrack, der den Komponisten oft inhaltlich einschraenkt",
        answerB = "Ein technischer Begriff fuer vorlaeufige Tonspuren in der Postproduktion",
        answerC = "Eine Methode, bei der Orchesteraufnahmen digital angepasst werden",
        answerD = "Ein Kompositionsstil der 1970er Jahre fuer Low-Budget-Filme",
        correctAnswer = 0,
        explanation = "Ein Temp Track ist Musik, die Regisseure waehrend des Schnitts provisorisch unterlegen. Das Problem: Regisseure verlieben sich in die Temp Music und erwarten, dass der Komponist aehnliches liefert — was kreativ einengend wirken kann.",
        difficulty = 3,
        funFact = "Stanley Kubrick verwendete Temp Tracks (wie die 2001-Klassik) und behielt sie oft im Endfilm. Alex North komponierte einen vollstaendigen Score fuer '2001', den Kubrick komplett verwarf — North erfuhr es erst bei der Premiere."
    ),

    // ── Barock/Renaissance-Musik (7) ────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Wer komponierte 'The Four Seasons' (Le quattro stagioni, 1725) — ein Paradebeispiel fuer das Concerto grosso?",
        answerA = "Georg Friedrich Haendel",
        answerB = "Antonio Vivaldi",
        answerC = "Arcangelo Corelli",
        answerD = "Johann Sebastian Bach",
        correctAnswer = 1,
        explanation = "Antonio Vivaldi komponierte die vier Violinkonzerte 'Le quattro stagioni' als Teil seiner 'Il cimento dell'armonia e dell'inventione'. Jedes Konzert ist einem Sonett begleitet — moeglicherweise von Vivaldi selbst verfasst.",
        difficulty = 3,
        funFact = "Vivaldi war Priester und wurde 'il prete rosso' (der rote Priester) genannt — wegen seiner feuerroten Haare. Er wurde jedoch vom Messedienst freigestellt, da er angeblich waehrend der Messe Kompositionsideen notieren musste."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Werk Johann Sebastian Bachs gilt als Hoehepunkt der polyphonen Kontrapunktik und wurde 1749/50 komponiert?",
        answerA = "Das Wohltemperierte Klavier",
        answerB = "Die Kunst der Fuge",
        answerC = "Musikalisches Opfer",
        answerD = "Goldberg-Variationen",
        correctAnswer = 1,
        explanation = "Bachs 'Die Kunst der Fuge' (BWV 1080) ist eine Sammlung von 14 Fugen und 4 Kanons, alle auf demselben Thema basierend. Bach starb, bevor er das Werk vollendete — es bricht mitten in einer Fuge ab, die seine Initialen B-A-C-H enthielt.",
        difficulty = 3,
        funFact = "Das Raetsel, ob 'Die Kunst der Fuge' fuer Tasteninstrument, Streichquartett oder Ensemble gedacht war, ist bis heute ungeloest. Die meisten modernen Auffuehrungen nutzen Kammerensembles."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Basso continuo' in der Barockmusik?",
        answerA = "Eine Kompositionstechnik mit ununterbrochener Basslinie und harmonischer Begleitung",
        answerB = "Ein spezielles Bassregister der barocken Orgel",
        answerC = "Eine Vortragsanweisung fuer gleichmaessiges Spielen",
        answerD = "Der tiefste Stimmtyp im barocken Chorgesang",
        correctAnswer = 0,
        explanation = "Basso continuo (Generalbass) ist die typische Begleitmethode der Barockmusik: Ein Bassinstrument (Cello, Fagott) spielt die Melodielinie, waehrend ein Harmonieinstrument (Cembalo, Laute, Orgel) die Akkorde ausfuellt — oft aus notierten Bezifferungen improviserend.",
        difficulty = 3,
        funFact = "Die Bezifferung im Generalbass war quasi die erste Form des Akkordsymbols in der Musik — eine Art barockes 'C-Am-F-G', das den Spielern erlaubte, spontan zu harmonisieren."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Renaissance-Komponist gilt als Hauptvertreter der niederlaendischen Polyphonie und schrieb die 'Missa Pange Lingua'?",
        answerA = "Guillaume de Machaut",
        answerB = "Josquin des Prez",
        answerC = "Orlando di Lasso",
        answerD = "Giovanni Pierluigi da Palestrina",
        correctAnswer = 1,
        explanation = "Josquin des Prez (ca. 1450-1521) war der bedeutendste Vertreter der franko-flaemsichen Schule. Seine 'Missa Pange Lingua' gilt als Meisterwerk der Vokalpolyphonie und nutzt als cantus firmus die gregorianische Hymne 'Pange Lingua'.",
        difficulty = 3,
        funFact = "Josquin war zu Lebzeiten so beruehmt, dass nach seinem Tod Werke anderer Komponisten faelschlicherweise unter seinem Namen veroeffentlicht wurden — ein frueher Fall von Kunstplagiat."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'Ricercar' in der Musik der Renaissance und des Fruehbarock?",
        answerA = "Eine tanzartige Instrumentalform mit wiederkehrendem Refrain",
        answerB = "Eine imitatorische Instrumentalkomposition, Vorlaeufer der Fuge",
        answerC = "Ein kurzes Praeludium fuer Laute oder Cembalo",
        answerD = "Eine mehrstimmige Vokalkomposition auf lateinischen Text",
        correctAnswer = 1,
        explanation = "Das Ricercar (ital. 'ricercare' = suchen/erforschen) ist eine imitatorische Kompositionsform des 16./17. Jahrhunderts. Es gilt als direkter Vorlaeufer der Fuge: Ein Thema wird durch verschiedene Stimmen polyphon durchgefuehrt.",
        difficulty = 3,
        funFact = "Bach schrieb fuer Koenig Friedrich den Grossen ein sechsstimmiges Ricercar — Teil des 'Musikalischen Opfers'. Der Begriff RICERCAR wurde von Bach als Akronym verwendet: 'Regis Iussu Cantio Et Reliqua Canonica Arte Resoluta'."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Barockkomponist entwickelte die 'Suite' als instrumentale Form und praegte sie mit Werken wie den 'Ordres' fuer Cembalo?",
        answerA = "Johann Jakob Froberger",
        answerB = "Francois Couperin",
        answerC = "Jean-Philippe Rameau",
        answerD = "Georg Philipp Telemann",
        correctAnswer = 1,
        explanation = "Francois Couperin (1668-1733) nannte seine Cembalowerke 'Ordres' (Sammlungen) und praegte den franzoesischen Stil mit programmatischen Titeln, ornamentreichen Melodien und raffinierter Harmonik. Bach bewunderte und studierte seine Werke.",
        difficulty = 3,
        funFact = "Couperin schrieb ein Lehrwerk 'L'Art de toucher le clavecin' (1716), das noch heute als Referenz fuer historische Aufführungspraxis gilt und detaillierte Ornamentik-Tabellen enthaelt."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man unter 'Musica ficta' in der Renaissancemusik?",
        answerA = "Erfundene oder fiktive Kompositionsformen ohne reale Aufführungspraxis",
        answerB = "Chromatische Alterationen, die nicht notiert aber vom Aufführenden ergaenzt wurden",
        answerC = "Mehrstimmige Vokalmusik mit erfundenen Texten (Nonsens-Silben)",
        answerD = "Instrumentalmusik die vokale Vorbilder imitiert",
        correctAnswer = 1,
        explanation = "Musica ficta bezeichnet Toene ausserhalb des hexachordalen Systems, die Saenger und Spieler nach Konvention selbst ergaenzen mussten — z.B. Halbtonschritte vor Schlusskadenzen oder um den Tritonus zu vermeiden. Diese ungeschriebenen Chromatiken sind heute Gegenstand wissenschaftlicher Debatte.",
        difficulty = 3,
        funFact = "Durch Musica ficta koennen zwei Aufführungen desselben Renaissancestuecks ganz unterschiedlich klingen — je nach Entscheidung des Dirigenten. Es gibt keine 'richtige' Version, was die historische Aufführungspraxis besonders spannend macht."
    ),

    // ── Post-Punk/New-Wave (7) ───────────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welches Album von Joy Division, posthum veroeffentlicht, enthielt 'Love Will Tear Us Apart' und wurde 1980 publiziert?",
        answerA = "Unknown Pleasures",
        answerB = "Closer",
        answerC = "Still",
        answerD = "Atmosphere",
        correctAnswer = 2,
        explanation = "'Still' (1981) ist ein posthumes Doppelalbum von Joy Division, das Live-Aufnahmen und Studioraritaeten enthaelt. 'Love Will Tear Us Apart' erschien jedoch als Single im Juni 1980, kurz nach Ian Curtis' Tod im Mai 1980.",
        difficulty = 3,
        funFact = "Ian Curtis litt an Epilepsie, und seine auf der Buehnestypischen konvulsiven Tanzbewegungen wurden oft mit seinen epileptischen Anfaellen verglichen. Er starb am 18. Mai 1980, einen Tag vor Joy Divisions erster Amerika-Tour."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche New-Wave-Band aus Duesseldorf praegte mit Alben wie 'Alkohol' und 'Ich will kein Roboter sein' den deutschen Neue-Deutsche-Welle-Stil?",
        answerA = "DAF (Deutsch Amerikanische Freundschaft)",
        answerB = "Ideal",
        answerC = "Fehlfarben",
        answerD = "Der Plan",
        correctAnswer = 0,
        explanation = "DAF (Deutsch Amerikanische Freundschaft) aus Duesseldorf war ein Duett aus Gabi Delgado-Lopez und Robert Gorl. Sie verbanden rohe Elektronik mit militaerischen Rhythmen und provokativen deutschen Texten — ein Kernwerk der Neuen Deutschen Welle.",
        difficulty = 3,
        funFact = "DAF produzierte ihre wichtigsten Alben in Zusammenarbeit mit Conny Plank, dem legendaeren deutschen Produzenten, der auch fuer Kraftwerk, Eurythmics und Brian Eno arbeitete."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Instrument war charakteristisch fuer den Sound von The Cure und wurde von Keyboarder Roger O'Donnell eingesetzt?",
        answerA = "Roland Juno-60 Synthesizer",
        answerB = "Mellotron",
        answerC = "Minimoog",
        answerD = "Hammond-Orgel",
        correctAnswer = 0,
        explanation = "The Cure nutzten den Roland Juno-60 Synthesizer intensiv, der ihre charakteristischen flaechen-artigen Klangteppiche erzeugte. Der Juno-60 mit seinem Roland Chorus-Sound ist eng mit dem New-Wave-Aethetik der fruehen 1980er verbunden.",
        difficulty = 3,
        funFact = "Robert Smith von The Cure begann seine Karriere als Gitarrist, entwickelte aber eine einzigartige Spielweise mit abgedaempften Toenen und viel Reverb — ein Sound, der heute als 'Goth-Rock-Gitarre' bekannt ist."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Konzeptalbum von Talking Heads (1980) wurde von Brian Eno produziert und gilt als Post-Punk-Meisterwerk?",
        answerA = "Fear of Music",
        answerB = "Remain in Light",
        answerC = "More Songs About Buildings and Food",
        answerD = "Speaking in Tongues",
        correctAnswer = 1,
        explanation = "'Remain in Light' (1980) war das vierte Album der Talking Heads und wurde von Brian Eno und David Byrne produziert. Es integrierte afrikanische Polyrhythmen und Funk-Grooves in einen experimentellen Rock-Kontext — ein revolutionaerer Ansatz.",
        difficulty = 3,
        funFact = "Fuer die Tour zu 'Remain in Light' erweiterte David Byrne die Band auf neun Musiker und fuegte eine Blaesersection sowie perkussive Elemente hinzu. Das Konzert wurde im Film 'Stop Making Sense' (1984) verewigt."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnete der Begriff 'No Wave' in der New Yorker Musikszene um 1978?",
        answerA = "Eine Verneinung des New-Wave-Stils zugunsten radikaler Dissonanz und Anti-Technik",
        answerB = "Eine Subgenre des Surfmusik ohne elektrische Gitarren",
        answerC = "Eine politische Bewegung gegen kommerzielle Wellenlaengen-Radiosender",
        answerD = "Eine Ausrichtung von New Wave auf weltmusikalische Einflüsse",
        correctAnswer = 0,
        explanation = "No Wave war eine kurzlebige, aber einflussreiche Bewegung im New York der spaeten 1970er. Bands wie DNA, Teenage Jesus & the Jerks und Lydia Lunch verweigerten Melodie, Technik und kommerzielle Verwertbarkeit — radikale Destruktion als Kunstform.",
        difficulty = 3,
        funFact = "Brian Enos Compilation 'No New York' (1978) dokumentierte die Bewegung und machte sie international bekannt. Sonic Youth, deren Mitglieder aus dieser Szene kamen, brachten No-Wave-Einflüsse spaeter in den Mainstream."
    ),

    Question(
        categoryId = 5,
        questionText = "Siouxsie and the Banshees sind eine der einflussreichsten Post-Punk-Bands. Welches Instrument spielte Siouxsie Sioux selbst?",
        answerA = "Keyboard",
        answerB = "Bass",
        answerC = "Gitarre",
        answerD = "Kein Instrument — sie war ausschliesslich Saengerin",
        correctAnswer = 3,
        explanation = "Siouxsie Sioux war ausschliesslich Saengerin und performative Kuenstlerin. Ihr Beitrag lag in ihrer aussergewoehnlichen Buehnenpraesenz, ihrem markanten Gesangsstil und ihrer visuellen Aesthetik — nicht im Instrumentalspiel.",
        difficulty = 3,
        funFact = "Siouxsies Look mit geschwungenem Eyeliner, Spinnweben-Motiven und Gothic-Mode war so praegenend, dass er als Vorlage fuer das gesamte Gothic-Subkultur-Erscheinungsbild gilt. Madonna liess sich von ihr fuer ihren 'Like a Virgin'-Look inspirieren."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Plattenfirma war das Epizentrum der Post-Punk-Bewegung in Manchester und veroeffentlichte Joy Division, New Order und The Fall?",
        answerA = "Rough Trade",
        answerB = "Factory Records",
        answerC = "Creation Records",
        answerD = "4AD",
        correctAnswer = 1,
        explanation = "Factory Records, gegruendet 1978 von Tony Wilson und Alan Erasmus, war das Herzstück der Manchesterr Musikszene. Neben Joy Division und New Order veroeffentlichte das Label The Durutti Column, Orchestral Manoeuvres in the Dark und The Happy Mondays.",
        difficulty = 3,
        funFact = "Factory Records war so avantgardistisch, dass das Label seinen Vertraegen keine Nummer gab — stattdessen erhielt jede Veroeffentlichung eine FAC-Nummer. Sogar der Briefkasten hatte eine: FAC 61, der Katze von Tony Wilson: FAC 191."
    ),

    // ── Trip-Hop/Ambient (6) ────────────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welches Album von Massive Attack (1991) gilt als Gruendungswerk des Trip-Hop und wurde in Bristol aufgenommen?",
        answerA = "Mezzanine",
        answerB = "Blue Lines",
        answerC = "Protection",
        answerD = "100th Window",
        correctAnswer = 1,
        explanation = "'Blue Lines' (1991) von Massive Attack gilt als das Gruendungswerk des Trip-Hop-Genres. Es kombinierte Hip-Hop-Beats mit Soul, Dub und Ambient-Einflüssen. Gaeste wie Shara Nelson und Tricky trugen entscheidend zum Sound bei.",
        difficulty = 3,
        funFact = "Massive Attacks Robert '3D' Del Naja war Teil der Wild Bunch — einem Soundsystem und DJ-Kollektiv aus Bristol, das als Vorlaeufer des Trip-Hop gilt. Die Bristol-Szene war entscheidend fuer die Entstehung des Genres."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Musiker schrieb das einflussreiche Buch 'Ambient 1: Music for Airports' (1978) und praegte den Begriff 'Ambient Music'?",
        answerA = "Harold Budd",
        answerB = "Brian Eno",
        answerC = "Klaus Schulze",
        answerD = "Tangerine Dream",
        correctAnswer = 1,
        explanation = "Brian Eno veroeffentlichte 'Ambient 1: Music for Airports' 1978 und pragte damit den Begriff 'Ambient Music'. Das Konzept: Musik, die 'wie Tapete ist' — die man hoeren kann, aber nicht muss. Eine Reaktion auf Muzak und Fahrstuhlmusik.",
        difficulty = 3,
        funFact = "Die Idee zu 'Music for Airports' entstand in einem Airport-Warteraum. Eno lag krank auf einem Stuhl und hoerte kaum Musik aus den Lautsprechern. Er dachte: Airports koennen Musik haben, die zur Atmosphaere passt — ruhig, beruhigend, nicht aufdringlich."
    ),

    Question(
        categoryId = 5,
        questionText = "Portishead sind ein Schluesselband des Trip-Hop. Welches Album von 1994 war ihr Debuet und enthielt den Hit 'Sour Times'?",
        answerA = "Portishead",
        answerB = "Dummy",
        answerC = "Third",
        answerD = "Roseland NYC Live",
        correctAnswer = 1,
        explanation = "'Dummy' (1994) war Portisheads Debuetalbum und enthielt Klassiker wie 'Sour Times', 'Glory Box' und 'Roads'. Das Album gewann den Mercury Prize 1995 und gilt als eines der besten Alben der 1990er Jahre.",
        difficulty = 3,
        funFact = "Portisheads Saengerin Beth Gibbons ist bekannt fuer ihren seltenen Auftritt in der Oeffentlichkeit. Trotz internationalen Ruhms hat die Band insgesamt nur drei Studioalben in ueber 30 Jahren veroeffentlicht."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Produzent und DJ ist als 'Godfather of Trip-Hop' bekannt und veroeffentlichte 1995 das Album 'Maxinquaye'?",
        answerA = "DJ Shadow",
        answerB = "Tricky",
        answerC = "Goldie",
        answerD = "Roni Size",
        correctAnswer = 1,
        explanation = "Tricky veroeffentlichte 1995 'Maxinquaye', ein dunkles, klaustrophobisches Album, das Trip-Hop mit Gothic- und Industrial-Einflüssen verband. Benannt nach seiner verstorbenen Mutter Maxine Quaye, gilt es als eines der persoenlichsten und einflussreichsten Alben der 90er.",
        difficulty = 3,
        funFact = "Tricky war urspruenglich Mitglied von Massive Attack und wirkte am 'Blue Lines'-Album mit. Sein Austritt und Solo-Debuet zeigten, wie kreativ vielfaeltig die Bristoler Szene war — jeder der Beteiligten entwickelte einen eigenen Stil."
    ),

    Question(
        categoryId = 5,
        questionText = "Welchen Begriff praegte der Musiker William Basinski mit seiner Werkreihe 'The Disintegration Loops' (2002) fuer eine Ambient-Technik?",
        answerA = "Tape-Decay-Music",
        answerB = "Gradual-Process-Music",
        answerC = "Slow-Death-Ambient",
        answerD = "Decaying-Loop-Composition",
        correctAnswer = 0,
        explanation = "Basinskis 'Disintegration Loops' entstanden, als er alte Magnetbaender digitalisierte und dabei beobachtete, wie die Eisenoxid-Beschichtung abfiel — und damit der Klang langsam starb. Das Ergebnis sind Aufnahmen, die ihren eigenen Tod dokumentieren.",
        difficulty = 3,
        funFact = "Basinski stellte die Aufnahmen am 11. September 2001 fertig. Er filmte sie auf seinem Dach in Brooklyn waehrend die Twintowers einstuertzten. Das Video zu 'D|P 1.1' zeigt genau diesen rauchenden Himmel — was dem Werk eine unbeabsichtigte, erschuetternde Dimension gab."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Label praegt seit den 1980ern den Ambient- und elektronischen Sound und veroeffentlichte u.a. Aphex Twin, Autechre und Boards of Canada?",
        answerA = "Warp Records",
        answerB = "Mute Records",
        answerC = "Kompakt",
        answerD = "Hyperdub",
        correctAnswer = 0,
        explanation = "Warp Records wurde 1989 in Sheffield gegruendet und ist das einflussreichste Label fuer experimentelle elektronische Musik. Mit Kuenstlern wie Aphex Twin, Autechre, Boards of Canada, Squarepusher und Bibio definierte es ueber Jahrzehnte den IDM- und Ambient-Sound.",
        difficulty = 3,
        funFact = "Warp's 'Artificial Intelligence'-Compilation von 1992 definierte das IDM-Genre (Intelligent Dance Music) und war bewusst gegen Rave-Kultur positioniert — als Musik zum Zuhören, nicht zum Tanzen."
    ),

    // ── Musikethnologie (6) ──────────────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Gamelan' in der indonesischen Musik?",
        answerA = "Eine Gesangstechnik fuer traditionelle Ritualgesaenge",
        answerB = "Ein Ensemble aus Metallophonen, Gongs und Trommeln",
        answerC = "Ein Notationssystem fuer pentatonische Skalen",
        answerD = "Eine Tanzform aus Bali verbunden mit Schattenspielen",
        correctAnswer = 1,
        explanation = "Gamelan ist ein Ensemble-Musikstil aus Java und Bali, bestehend aus Metallophonen (Saron, Gender), Gongs (Kempul, Gong Ageng) und Trommeln (Kendang). Das Gamelan-Tuning (Pelog und Slendro) weicht von westlicher Stimmung ab.",
        difficulty = 3,
        funFact = "Claude Debussy hoerte 1889 in Paris erstmals ein javanisches Gamelan auf der Weltausstellung. Das Erlebnis beeinflusste sein gesamtes Schaffen — seine pentatonischen Harmonien und schwebenden Klaenge sind direkt auf dieses Erlebnis zurueckzufuehren."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist 'Overtone Singing' (Obertonsingen) und wo hat es seine geografischen Wurzeln?",
        answerA = "Mehrstimmiger Chorgesang aus dem afrikanischen Subsahara-Raum",
        answerB = "Eine Gesangstechnik, bei der ein Saenger gleichzeitig zwei Toene produziert, aus Tuva und der Mongolei",
        answerC = "Ritueller Gesang tibetischer Moenche mit tiefen Summtoenen",
        answerD = "Traditioneller Jodler aus den Alpen mit Obertonresonanz",
        correctAnswer = 1,
        explanation = "Beim Obertonsingen (Khoomei/Khoomii) formt der Kehle und Mundraum so, dass bestimmte Oberttoene des Grundtons verstaerkt werden — sodass zwei Toene gleichzeitig erklingen. Diese Technik ist besonders in Tuva (Russland) und der Mongolei verbreitet.",
        difficulty = 3,
        funFact = "Paul Pena, ein amerikanischer Bluessaenger, lernte Khoomei durch Radioempfang aus der Sowjetunion. Er reiste nach Tuva und trat dort auf — sein Lebensweg wurde im Dokumentarfilm 'Genghis Blues' (1999) verewigt, der den Oscar gewann."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist 'Maqam' in der arabischen und osmanischen Musiktheorie?",
        answerA = "Ein Rhythmusmuster fuer klassische arabische Perkussion",
        answerB = "Ein modales Tonsystem mit spezifischen melodischen Bewegungsregeln",
        answerC = "Ein Notationssystem fuer arabische Volksmusik",
        answerD = "Ein Liedformtyp fuer religioeser Gesang in der islamischen Welt",
        correctAnswer = 1,
        explanation = "Maqam (arabisch/persisch/tuerkisch) bezeichnet ein modales System in der arabischen, tuerkischen und persischen Musik. Jeder Maqam hat eine spezifische Skala, bevorzugte Anfangs- und Endtoene sowie charakteristische Melodiefiguren — weit mehr als nur eine Tonleiter.",
        difficulty = 3,
        funFact = "Es gibt ueber 70 verschiedene Maqamat (Plural). Einige enthalten Vierteltoene, die in der westlichen Musik nicht existieren. Das macht die direkte Transkription in westliche Notation nahezu unmoeglich."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet 'Carnatic Music' und wie unterscheidet sie sich von 'Hindustani Music'?",
        answerA = "Carnatic ist die suedindische klassische Musik; Hindustani ist die nordindische — beeinflusst von persisch-moghulischer Musik",
        answerB = "Carnatic ist Volksmusik; Hindustani ist Hofmusik aus Nordindien",
        answerC = "Beide Systeme sind identisch, aber in verschiedenen Regionen unterschiedlich benannt",
        answerD = "Carnatic nutzt nur Vokaltradition; Hindustani basiert auf Instrumentalmusik",
        correctAnswer = 0,
        explanation = "Die indische klassische Musik teilt sich in zwei Haupttraditionen: Carnatic (Suedindien — Karnataka, Tamil Nadu, Kerala, Andhra Pradesh) und Hindustani (Nordindien). Hindustani wurde staerker durch persische und zentralasiatische Einflüsse der Moghuln gepraegte.",
        difficulty = 3,
        funFact = "Ravi Shankar machte die Sitar weltbekannt, als er mit George Harrison und dem Hippie-Interesse an indischer Philosophie zusammentraf. Harrisons Zusammenarbeit mit Shankar fuehrte zur Popularisierung von Ragas im Westen."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist 'Mbira' und aus welcher Region stammt dieses Instrument?",
        answerA = "Ein Schlaginstrument aus Westafrika, aehnlich einem Xylophon",
        answerB = "Ein Daumenklavier aus Simbabwe, zentrales Instrument der Shona-Musik",
        answerC = "Eine Laute aus Ostafrika mit Kalabassresonator",
        answerD = "Ein Blasinstrument aus dem Horn von Afrika aus Bambus gefertigt",
        correctAnswer = 1,
        explanation = "Die Mbira (auch Kalimba oder Daumenklavier genannt) ist ein Lamellophon aus Simbabwe. Bei den Shona-Voelkern spielt sie eine zentrale Rolle in Bira-Zeremonien, um Kontakt mit Ahnengeistern herzustellen. Sie besteht aus Metallzungen auf einem Holzbrett.",
        difficulty = 3,
        funFact = "Die Mbira hat eine dokumentierte Geschichte von ueber 3000 Jahren in Afrika. Heute existiert sie in Hunderten von Varianten quer durch den Kontinent — und ist als 'Kalimba' in vereinfachter Form ein beliebtes westliches Anfaenger-Instrument geworden."
    ),

    Question(
        categoryId = 5,
        questionText = "Wer gilt als Begruender der Musikethnologie (Ethnomusicology) als akademische Disziplin im 20. Jahrhundert?",
        answerA = "Curt Sachs",
        answerB = "Erich von Hornbostel",
        answerC = "Bruno Nettl",
        answerD = "Alan Lomax",
        correctAnswer = 1,
        explanation = "Erich von Hornbostel und Curt Sachs entwickelten 1914 gemeinsam das Hornbostel-Sachs-System zur Klassifikation von Musikinstrumenten — noch heute das Standardsystem der Musikethnologie. Hornbostel gilt als Grundlagentheoretiker der vergleichenden Musikwissenschaft.",
        difficulty = 3,
        funFact = "Das Hornbostel-Sachs-System teilt alle Instrumente in 5 Kategorien: Idiophone (selbsttoenend), Membranophone (Fell), Chordophone (Saiten), Aerophone (Luft) und Elektrophone (Strom). Diese Einteilung gilt universell — vom Gamelan bis zur E-Gitarre."
    ),

    // ── Plattensammlertum/Audiophile (6) ────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Original Pressing' (OG) im Plattensammlertum und warum ist er wertvoll?",
        answerA = "Eine Erstpressung direkt vom Original-Masterband, oft mit besserem Klang und historischem Wert",
        answerB = "Eine handnummerierte Limitierung fuer Sammler mit Original-Kuenstlersignatur",
        answerC = "Eine unveroeffnetliche Promo-Kopie fuer Radiosender und Musikkritiker",
        answerD = "Ein Exemplar mit Druckfehler auf dem Cover, das dadurch Seltenheitswert hat",
        correctAnswer = 0,
        explanation = "Original Pressings (OG) sind die ersten kommerziellen Auflagen einer Schallplatte, direkt vom urspruenglichen Masterlacquer gefertigt. Sie gelten als klanglich ueberlegen, weil das Masterband frisch und nicht abgenutzt ist. Spaetere Pressungen nutzen oft Kopien des Masters.",
        difficulty = 3,
        funFact = "Eine Original-Pressung von Miles Davis' 'Kind of Blue' auf Columbia 6-Eye-Label kann auf Auktionen ueber 3000 Dollar erzielen. Der gleiche Inhalt auf einer modernen Represse kostet unter 30 Dollar — der Unterschied liegt im Klangeindruck und Sammlerwert."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'Lacquer' (Lackerdisc) in der Vinylproduktion und welche Rolle spielt er?",
        answerA = "Eine Polier-Substanz zum Schutz von Schallplattenoberflaechen",
        answerB = "Eine Aluminium-Scheibe mit Nitrozellulose-Beschichtung, auf der die Masterfurchen eingeschnitten werden",
        answerC = "Ein Qualitaetskennzeichen fuer audiophile Pressungen aus bestimmten Vinylformeln",
        answerD = "Der erste Test-Pressling vor der Massenproduktion",
        correctAnswer = 1,
        explanation = "Ein Lacquer ist eine Aluminium-Scheibe mit Nitrozellulose-Beschichtung. Mit einem Schneidkopf werden die Audiosignale als Furche eingeschnitten. Dieser Lacquer wird dann mit Nickel galvanisiert, um einen 'Stamper' herzustellen, der die eigentlichen Vinylplatten presst.",
        difficulty = 3,
        funFact = "Ein Lacquer ist extrem empfindlich und altert schnell — Oxidation und Beschaedigungen koennen den Klang verschlechtern. Deshalb werden wichtige Masteraufnahmen heutzutage auch digital gesichert, obwohl viele Audiophile dem analogen Master-Lacquer den Vorzug geben."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bedeutet 'VTA' (Vertical Tracking Angle) bei einem Plattenspieler und warum ist er wichtig?",
        answerA = "Der vertikale Winkel des Tonabnehmernadels in der Rille — beeinflusst Klangqualitaet und Platten-Verschleiss",
        answerB = "Die Auflagekraft der Nadel auf der Plattenoberflaeche in Gramm",
        answerC = "Die Drehzahlpraezision des Plattentellers gemessen in Umdrehungen pro Minute",
        answerD = "Der azimutale Ausrichtungswinkel des Tonabnehmers zur Plattenebene",
        correctAnswer = 0,
        explanation = "Der VTA ist der Winkel, in dem die Nadel die Schallplattenrille beruehrt. Bei modernen Schallplatten ist ein VTA von etwa 20 Grad ideal. Ein falscher Winkel verzerrt den Klang: Zu flach klingt hohl, zu steil klingt schrill. Audiophile justieren ihn manuell mit Praezisionswerkzeug.",
        difficulty = 3,
        funFact = "Audiophile Tonarmkonstrukteure berechnen VTA auf Zehntelstel-Grad. Einige High-End-Tonarme bieten eine Mikrometer-Justierung waehrend des Abspielens. Die Debatte, ob 0,5 Grad Unterschied hoerbar ist, fuellt ganze Foren."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'Direct-Cut-Lacquer' (DDC) und worin besteht der klangtechnische Vorteil gegenueber normalen Aufnahmen?",
        answerA = "Ein Lacquer, der direkt waehrend der Live-Performance ohne Zwischenaufnahme geschnitten wird",
        answerB = "Eine Direktkopie ohne Mastering-Stufe fuer unverfaelschten Klang",
        answerC = "Eine Spezialschicht aus direktem Kupfer statt Aluminium fuer bessere Klangresonanz",
        answerD = "Ein Digitalschnitt des Masters direkt vom DAW ohne Analogstufe",
        correctAnswer = 0,
        explanation = "Beim Direct-Cut (Direktschnitt/DDC) wird das Signal direkt vom Mikrofon auf den Lacquer geschnitten — ohne Bandmaschine als Zwischenstufe. Das eliminiert Bandrauschen und Kompression. Musiker muessen live perfekt spielen, da kein Editing moeglich ist.",
        difficulty = 3,
        funFact = "Sheffield Lab war ein Pionier des Direct-to-Disc-Formats in den 1970ern. Ihre Direktschnitt-Alben sind heute begehrte Sammlerstuecke, weil sie klangtechnisch das Hoechstmoegliche in der analogen Aufnahmetechnik repraesentieren."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist das 'Loudness War' Phaenomen in der modernen Musikproduktion und welche negative Auswirkung hat es?",
        answerA = "Ein Wettbewerb zwischen Streaming-Diensten um lauteste Codec-Kompression",
        answerB = "Die Praxis, Aufnahmen durch Kompression und Limiting so laut wie moeglich zu mastern — auf Kosten der Dynamik",
        answerC = "Ein rechtlicher Streit zwischen Plattenlabels ueber Urheberrechte an Lautstaerkestandards",
        answerD = "Die Erhoehung der Lautstaerke in Live-Konzerten seit den 1980ern",
        correctAnswer = 1,
        explanation = "Der 'Loudness War' bezeichnet den seit den 1980ern eskalierenden Trend, Aufnahmen durch extreme Kompression maximal laut zu mastern. Das Ergebnis: weniger Dynamik, Klangverfaerbungen und Houerer-Ermuedung. Streaming-Dienste wie Spotify einfuehrten 'Loudness Normalisation' als Gegenmasnahme.",
        difficulty = 3,
        funFact = "Metallicas 'Death Magnetic' (2008) ist ein beruehmt-beruechtigtes Beispiel: Das Masterbild war so komprimiert, dass selbst GuitarHero-Fans die Verzerrungen hoerten und eine Petition fuer ein Remaster starteten. Rick Rubin produzierte das Album."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist ein 'RIAA-Entzerrungskurve' und weshalb ist sie fuer das Abspielen von Vinyl unverzichtbar?",
        answerA = "Ein Frequenzausgleich, der beim Schneiden hohe Frequenzen anhbt und beim Abspielen wieder absenkt — zur Rauschunterdrückung",
        answerB = "Eine Schutzkurve gegen elektromagnetische Stoerfelder im Tonabnehmer",
        answerC = "Eine Norm fuer die Umdrehungsgeschwindigkeit von Plattenspielern",
        answerD = "Ein Qualitaetsstandard fuer Vinyl-Presswerke in den USA",
        correctAnswer = 0,
        explanation = "Die RIAA-Kurve (Record Industry Association of America, 1954) ist ein standardisierter EQ: Beim Schneiden werden Baeasse abgesenkt (damit die Furchen nicht zu tief werden) und Hoehenabgehoben. Der Phono-Preamp eines Plattenspielers kehrt diese Kurve um — ohne ihn klingt Vinyl duenn und schrill.",
        difficulty = 3,
        funFact = "Vor 1954 gab es verschiedene inkompatible Entzerrungskurven bei verschiedenen Labels. Columbia, RCA und Decca nutzten alle unterschiedliche Standards. Die Einfuehrung der einheitlichen RIAA-Norm war ein kleiner, aber wichtiger Meilenstein der Musikindustrie."
    ),

    // ── Blues-Varianten (5) ─────────────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Was unterscheidet 'Delta Blues' von 'Chicago Blues' klanglich und instrumentell?",
        answerA = "Delta Blues: akustisch, Slide-Gitarre, Einzelperformer; Chicago Blues: elektrifiziert, Band-Format mit Harp und Rhythmusgruppe",
        answerB = "Delta Blues: mehrstimmiger Chor; Chicago Blues: Solosaenger ohne Begleitung",
        answerC = "Delta Blues: Stadtmusik der 1920er; Chicago Blues: Landmusik der Nachkriegszeit",
        answerD = "Delta Blues: von weissen Musikern entwickelt; Chicago Blues: afrikanisch-amerikanische Tradition",
        correctAnswer = 0,
        explanation = "Delta Blues (Mississippi-Delta, fruehes 20. Jahrhundert) ist oft solo: ein Saenger mit akustischer Gitarre und Bottleneck-Slide. Chicago Blues (1940er-50er) entstand durch die Migration afrikanischer Amerikaner nach Chicago und elektrifierste den Sound mit Bandformat, E-Gitarre und Mundharmonika.",
        difficulty = 3,
        funFact = "Muddy Waters ist die Brueckengestalt: Er spielte in Mississippi Delta-Style und brachte diesen Stil nach Chicago, wo er ihn elektrische umformte. Sein Chicago-Sound wurde direkt zur Grundlage des Rock'n'Roll."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist 'Piedmont Blues' und wo hat er seinen geografischen Ursprung?",
        answerA = "Ein Blues-Stil aus dem Piedmont-Plateau (Virginia, North Carolina, Georgia) mit Fingerpicking-Technik",
        answerB = "Ein franzoesischer Blusstil aus der Provence mit Akkordeon",
        answerC = "Eine Unterkategorie des Texas Blues mit besonderen Boogie-Woogie-Rhythmen",
        answerD = "Ein jazz-influenzierter Blues aus New Orleans mit Schlagzeug",
        correctAnswer = 0,
        explanation = "Piedmont Blues entstand im Piedmont-Bereich der US-Ostküste (Virginien, Nord- und Sued-Carolina, Georgia). Er ist charakteristisch durch Fingerpicking: Der Daumen spielt die Basslinie alternierend, waehrend die anderen Finger Melodie und Akkorde spielen — beeinflusst von Ragtime.",
        difficulty = 3,
        funFact = "Blind Blake und Reverend Gary Davis sind Schluessel-Interpreten des Piedmont Blues. Davis wurde von zahlreichen Folk- und Rock-Gitarristen wie Bob Dylan und Stefan Grossman studiert — seine Technik gilt als das Schwierigste im amerikanischen Volksmusik-Gitarrenspiel."
    ),

    Question(
        categoryId = 5,
        questionText = "Robert Johnson ist die mythische Figur des Blues. Welche Legende umgibt ihn bezueglich seines Gitarrenkoennens?",
        answerA = "Er soll an einer Kreuzung um Mitternacht seinen Geist an den Teufel verkauft haben fuer uebernatuerliches Gitarrenspiel",
        answerB = "Er soll ein geheimer Student Blind Lemons Jefferson gewesen sein, der dessen Technik gestohlen hat",
        answerC = "Er soll nie Gitarre gespielt haben — seine Aufnahmen stammen von einem anderen, unbekannten Bluessaenger",
        answerD = "Er soll ein afrikanischer Griot gewesen sein, der in Mississippi auftauchte und verschwand",
        correctAnswer = 0,
        explanation = "Die Crossroads-Legende besagt, Robert Johnson habe seinen Pakt mit dem Teufel an einer Kreuzung in Mississippi geschlossen — um sein uebernatuerliches Gitarrenspiel zu erlangen. Die Geschichte basiert auf seiner raschen Entwicklung zum Virtuosen und seinem mysterioesen Tod mit 27.",
        difficulty = 3,
        funFact = "Robert Johnson starb 1938 mit 27 Jahren unter ungeklaerten Umstaenden — vergiftet, wie vermutet wird. Er wurde damit das erste Mitglied des sogenannten '27 Club', dem auch Jimi Hendrix, Janis Joplin, Jim Morrison, Kurt Cobain und Amy Winehouse angehoeren."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist 'Boogie Woogie' und in welchem Instrument ist er am charakteristischsten?",
        answerA = "Ein Blues-Tanzstil fuer Gitarrenensemble aus New Orleans",
        answerB = "Ein Pianostil mit ostinaten Achtelnoten-Basslinien in der linken Hand und improvisierten Melodien in der rechten",
        answerC = "Ein Vokalstil des fruehen R&B mit Call-and-Response-Struktur",
        answerD = "Ein Schlagzeugrhythmus der spaeten Jazz-Aera mit Shuffle-Feeling",
        correctAnswer = 1,
        explanation = "Boogie Woogie ist ein Pianostil, der in den fruehen 1900ern in afroamerikanischen Gemeinschaften entstand. Die linke Hand spielt eine gleichmaessige, rollende Bassfigur in Achteln (walking bass), waehrend die rechte improvisiert. Pianisten wie Pinetop Smith, Pete Johnson und Albert Ammons pragen das Genre.",
        difficulty = 3,
        funFact = "Boogie Woogie wurde in den 1930ern und 40ern durch Radio und Tanzveranstaltungen so populaer, dass es eine eigene Tanzbewegung ausloeste. Die charakteristischen Basslinien wurden direkt in fruehe Rock'n'Roll-Gitarren uebernommen — Chuck Berrys Gitarrenstil basiert darauf."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Stimmtechnik ist charakteristisch fuer den Texas Blues und welche Gitarristen repraesentieren ihn am besten?",
        answerA = "Single-Note-Linien mit sauberem Vibrato, repraesentiert von T-Bone Walker und Stevie Ray Vaughan",
        answerB = "Offene Stimmung mit schwerem Bottleneck-Slide, repraesentiert von Freddie King",
        answerC = "Fingerpicking-Technik ohne Pick, repraesentiert von Lightnin' Hopkins",
        answerD = "12-Saiten-Gitarren-Tradition, repraesentiert von Blind Lemon Jefferson",
        correctAnswer = 0,
        explanation = "Texas Blues zeichnet sich durch saubere, einzelne Gitarrenlinien mit praezisem Vibrato und jazzyem Einfluss aus. T-Bone Walker entwickelte diesen Stil in den 1940ern — mit aufrechter E-Gitarre und tanzenden Single-Note-Solos. Stevie Ray Vaughan modernisierte ihn in den 1980ern.",
        difficulty = 3,
        funFact = "T-Bone Walker war Buddy Holly begegnet und beeinflusste ihn tief. Die gerade Linie T-Bone Walker → Buddy Holly → The Beatles zeigt, wie Texas Blues direkt in den Ursprung der modernen Popmusik einfloss."
    ),

    // ── K-Pop/J-Pop (5) ────────────────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Welches Konzept beschreibt das 'Idol-System' in Korea und Japan, das K-Pop und J-Pop praegte?",
        answerA = "Langjaehrige Ausbildungsvertraege in Agentur-eigenen Trainingsprogrammen mit Gesang, Tanz und Sprachausbildung",
        answerB = "Ein demokratisches Casting-System, bei dem Fans per Abstimmung ihre Lieblingssaenger auswaehlen",
        answerC = "Ein westliches Boyband-Konzept, adaptiert fuer asiatische Maerkte in den 1980ern",
        answerD = "Ein staatlich subventioniertes Musikprogramm zur Forderung nationaler Kuenstler",
        correctAnswer = 0,
        explanation = "Das Idol-System basiert auf intensiver Ausbildung: Trainees werden oft als Jugendliche von Agenturen (SM, HYBE, YG, JYP) unter Vertrag genommen und jahrelang in Gesang, Tanz, Sprache und Buehnenauftritt ausgebildet. Erst nach Bestehen interner Auditions debütieren sie als Gruppe.",
        difficulty = 3,
        funFact = "BTS-Mitglied RM (Namjoon Kim) debütierte als Rap-Trainee und lernte Englisch fast ausschliesslich durch die TV-Serie 'Friends'. Er gilt heute als einer der eloquentesten K-Pop-Repraesentanten im internationalen Dialog — auch bekannt fuer seine Rede vor der UN-Vollversammlung."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist 'Saenuri' und welche Rolle spielt es in der koreanischen Volksmusik?",
        answerA = "Ein traditioneller Trommeltanz bei dem Performer mit langen Baenderstreifen tanzen",
        answerB = "Eine klassische koreanische Oper aehnlich dem japanischen No-Theater",
        answerC = "Ein pentatonisches Gesangssystem fuer rituelle Zeremonien",
        answerD = "Eine Gitarrentradition aus der Joseon-Periode",
        correctAnswer = 0,
        explanation = "Saenuri (auch Nongak oder Pungmul) ist koreanische Bauernmusik mit Trommeln, Gongs und Pfeifen. Das Samulnori ist eine moderne buehnentuechtige Weiterentwicklung: vier Musiker spielen vier traditionelle koreanische Instrumente (Kkwaenggwari, Jing, Buk, Janggu) in komplexen Rhythmusmustern.",
        difficulty = 3,
        funFact = "Samulnori wurde 1978 von Kim Duk Soo und drei weiteren Musikern als Konzertvariante der Strassenmusik entwickelt. Seitdem hat sich diese Form weltweit verbreitet und ist UNESCO-Kulturerbe. Sie beeinflusst auch moderne K-Pop-Rhythmusstrukturen."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Gruppe gilt als Pionier des modernen J-Pop und veroeffentlichte 1985 das erste Album, das als 'J-Pop' vermarktet wurde?",
        answerA = "Yellow Magic Orchestra",
        answerB = "SMAP",
        answerC = "Southern All Stars",
        answerD = "Seiko Matsuda",
        correctAnswer = 0,
        explanation = "Yellow Magic Orchestra (YMO), gegruendet 1978 von Haruomi Hosono, Yukihiro Takahashi und Ryuichi Sakamoto, ist ein Pionier des J-Pop und der elektronischen Musik weltweit. Ihr synthetischer, techno-orientierter Sound beeinflusste westliche Acts wie Kraftwerk und vorweg nahm Techno und Synthpop.",
        difficulty = 3,
        funFact = "Ryuichi Sakamoto von YMO wurde weltweit als Filmkomponist bekannt — er schrieb den Score zu 'Merry Christmas, Mr. Lawrence' (1983) und den Oscar-praemierten Score zu 'The Last Emperor' (1987). YMO-Mitglieder haben die globale elektronische Musik mehr beeinflusst als oft anerkannt wird."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist 'Hallyu' (Hanryu) und wie hat es K-Pop international positioniert?",
        answerA = "Die koreanische Welle — eine kulturelle Exportoffensive, durch die K-Pop, Dramen und Filme global erfolgreich wurden",
        answerB = "Ein staatliches Zensurprogramm fuer Musikinhalte in Suedkorea",
        answerC = "Ein musikalisches Fusion-Genre aus Korea und China",
        answerD = "Ein Fanclub-System, bei dem koreanische Stars offizielle Botschafter ernennen",
        correctAnswer = 0,
        explanation = "'Hallyu' (koreanische Welle) bezeichnet den weltweiten Export koreanischer Popkultur seit den 1990ern. K-Pop, K-Drama, K-Beauty und koreanisches Essen wurden zu globalen Phaenomenen. Die Regierung foerdert dies aktiv durch das Korean Cultural Center-Netzwerk.",
        difficulty = 3,
        funFact = "BTS' Wirtschaftsleistung fuer Suedkorea wurde 2019 auf umgerechnet 4,65 Milliarden Dollar jaehrlich geschaetzt — vergleichbar mit dem wirtschaftlichen Einfluss einer mittelgrossen koreanischen Airline. 'Kulturexport' ist eine ernsthafte Wirtschaftsstrategie."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bedeutet 'Sasaeng' im K-Pop-Kontext?",
        answerA = "Ein offizieller Super-Fan-Titel, den Agenturen an besonders treue Anhaenger vergeben",
        answerB = "Ein obsessiver Stalker-Fan, der in die Privatsphaere von Idolen eingreift",
        answerC = "Ein koreanisches Wort fuer Fan-Meeting-Events mit direktem Kuenstlerkontakt",
        answerD = "Ein Ehrentitel fuer Fans, die 10+ Jahre einem Idol folgen",
        correctAnswer = 1,
        explanation = "Sasaeng (von kor. sa = privat, saeng = leben) bezeichnet Fans mit obsessivem Verhalten: Sie verfolgen Idole, brechen in Hotels ein, kaufen persoenliche Daten und haben kein Respekt vor der Privatsphaere. Das Problem ist so ernst, dass Agenturen eigene Sicherheitspersonal einsetzen.",
        difficulty = 3,
        funFact = "Einige Sasaengs betreiben spezialisierte Taxiunternehmen, die K-Pop-Stars am Flughafen verfolgen. Sie verkaufen Informationen ueber Idols Tagesablaeufe und Aufenthaltsorte. Die Praxis ist bekannt, wird toleriert aber offen verurteilt von der gesamten K-Pop-Industrie."
    ),

)
