package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun musicQuestionsExpert5(): List<Question> = listOf(

    // ── Streichquartett-Literatur (10) ───────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Wie viele Streichquartette komponierte Ludwig van Beethoven insgesamt?",
        answerA = "12",
        answerB = "14",
        answerC = "16",
        answerD = "18",
        correctAnswer = 2,
        explanation = "Beethoven schrieb 16 Streichquartette (Op. 18 Nr. 1-6, Op. 59 Nr. 1-3 Rasumowsky, Op. 74 Harfen-Quartett, Op. 95 Serioso, sowie die spaeten Op. 127, 130, 131, 132 und 135). Sie gelten als Meilensteine der Gattung und sind in drei Schaffensperioden unterteilt.",
        difficulty = 4,
        funFact = "Beethovens letztes vollendetes Werk ueberhaupt war der Ersatz-Schlusssatz fuer das Streichquartett Op. 130 — die Grosse Fuge Op. 133 war dem Verleger als zu schwer erschienen und wurde als separates Werk herausgegeben."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Merkmal kennzeichnet die sogenannte 'Sonatenform' im ersten Satz eines Streichquartetts?",
        answerA = "Zwei kontrastierende Themen, Durchfuehrung und Reprise",
        answerB = "Eine Folge von Variationen ueber ein Hauptthema",
        answerC = "Drei gleichwertige Themen in Fugenform",
        answerD = "Wechsel zwischen Solo- und Tuttiabschnitten",
        correctAnswer = 0,
        explanation = "Die klassische Sonatenform besteht aus Exposition (Haupt- und Seitenthema), Durchfuehrung (motivische Verarbeitung) und Reprise (Wiederkehr beider Themen, meist in der Grundtonart). Sie ist die dominante Form des Kopfsatzes in Beethovens und Haydns Streichquartetten.",
        difficulty = 4,
        funFact = "Haydn gilt als Schopfer der reifen Streichquartett-Sonatenform. Sein Op. 33 von 1781 war so innovativ, dass Mozart, der es kannte, daraufhin seine sechs 'Haydn-Quartette' schrieb und Haydn widmete."
    ),

    Question(
        categoryId = 5,
        questionText = "Welchen Beinamen traegt Schuberts Streichquartett d-Moll D 810?",
        answerA = "Der Tod und das Maedchen",
        answerB = "Die Forelle",
        answerC = "Rosamunde",
        answerD = "Der Erlkoenig",
        correctAnswer = 0,
        explanation = "Das Quartett d-Moll D 810 wird 'Der Tod und das Maedchen' genannt, weil der zweite Satz Variationen ueber Schuberts gleichnamiges Lied (D 531) ist. Das Werk entstand 1824 und gilt als eines der groessten Streichquartette der Romantik.",
        difficulty = 4,
        funFact = "Schubert schrieb dieses Quartett kurz nachdem er erfahren hatte, dass er an Syphilis erkrankt war. Die existentielle Thematik des Todes spiegelt sich in der duesteren d-Moll-Tonalitaet und dem Ringen des zweiten Satzes wider."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Streichquartett von Bela Bartok ist als sein 'Krebsquartett' bekannt, da ein Satz rueckwaerts gespielt eine Krebsbewegung ergibt?",
        answerA = "Streichquartett Nr. 2",
        answerB = "Streichquartett Nr. 4",
        answerC = "Streichquartett Nr. 5",
        answerD = "Streichquartett Nr. 6",
        correctAnswer = 1,
        explanation = "Bartoks Streichquartett Nr. 4 (1928) hat eine fuenfteiligeBoegen-Struktur (A-B-C-B'-A'), bei der der fuenfte Satz eine Krebsversion des ersten ist. Diese Spiegelarchitektur ist ein herausragendes Beispiel kompositorischer Symmetrie.",
        difficulty = 4,
        funFact = "Bartok schrieb seine sechs Streichquartette zwischen 1908 und 1939. Sie gelten als wichtigster Beitrag zur Gattung nach Beethoven und vereinen Volksmusik-Elemente aus Osteuropa mit hochkomplexer Kontrapunktik."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet die 'col legno'-Spieltechnik im Streichquartett?",
        answerA = "Spielen nahe dem Steg (sul ponticello)",
        answerB = "Schlagen der Saiten mit dem Holz des Bogens",
        answerC = "Spielen mit gedaempftem Klang (con sordino)",
        answerD = "Ziehen des Bogens ausserhalb der normalen Bogenspur",
        correctAnswer = 1,
        explanation = "Col legno (ital. 'mit dem Holz') bezeichnet die Technik, mit dem Holzschaft des Bogens statt mit dem Haar auf die Saiten zu schlagen oder zu streichen. Dies erzeugt einen raschelnden, perkussiven Klang. Die Technik wird z.B. von Mahler und Bartok eingesetzt.",
        difficulty = 4,
        funFact = "Viele fruehe Geigenbauer lehnten col legno kategorisch ab, da es den wertvollen Bogenschaft beschaedigen kann. Profi-Streicher verwenden deshalb manchmal einen guenstigeren Zweitbogen fuer Werke mit intensivem col legno-Einsatz."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Ensemble urauffuehrte Schostakowitschs Streichquartett Nr. 8 c-Moll op. 110 im Jahr 1960?",
        answerA = "Borodin-Quartett",
        answerB = "Kronos Quartet",
        answerC = "Beethovenquartett",
        answerD = "Amadeus-Quartett",
        correctAnswer = 2,
        explanation = "Das Beethovenquartett Moskau urauffuehrte das Achte Streichquartett von Schostakowitsch am 2. Oktober 1960 in Leningrad. Das Werk ist eine persoenliche Bekenntnismusik des Komponisten und verwendetmehrfach sein Namens-Motiv D-Es-C-H.",
        difficulty = 4,
        funFact = "Schostakowitsch komponierte das Quartett in nur drei Tagen waehrend eines Besuchs in Dresden. Er widmete es 'dem Andenken an die Opfer des Faschismus und des Krieges', obwohl es nach Aussage seiner Kinder eigentlich ein musikalisches Testament war."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Besonderheit zeichnet das 'Dissonanzen-Quartett' KV 465 von Mozart aus?",
        answerA = "Der Finalsatz ist in einer ungewoehnlichen 5/4-Taktart",
        answerB = "Die Langsame Einleitung des ersten Satzes beginnt mit extremen chromatischen Dissonanzen",
        answerC = "Das Werk ist fuer fuenf Streicher (Quintett) statt vier geschrieben",
        answerD = "Mozart verwendet erstmals Flageolett-Toene in der Quartettliteratur",
        correctAnswer = 1,
        explanation = "Das Streichquartett C-Dur KV 465 hat eine beruehmt-beruechigte langsame Einleitung (Adagio), in der Mozart extreme chromatische Dissonanzen einsetzt, die Zeitgenossen als Fehler betrachteten. Die Toene ergeben jedoch bei kontrapunktischer Analyse eine logische Stimmfuehrung.",
        difficulty = 4,
        funFact = "Der Verleger Artaria erhielt so viele Beschwerden ueber angebliche Druckfehler in den Dissonanzen, dass er anfragte, ob Mozart die Stelle wirklich so gemeint habe. Mozart bestaete die Richtigkeit der Noten ausdruecklich."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Stimmung des Cellos wird im Streichquartett Nr. 1 op. 11 von Samuel Barber im Finalsatz verwendet?",
        answerA = "Normalstimmung (C-G-D-A)",
        answerB = "Die grosse C-Saite wird einen Ganzton nach H heruntergestimmt (Skordatur)",
        answerC = "Alle vier Saiten werden einen Halbton tiefer gestimmt",
        answerD = "Das Cello spielt ausschliesslich im Flageolett-Register",
        correctAnswer = 0,
        explanation = "In Barbers Streichquartett op. 11 (1936) spielt das Cello in Normalstimmung. Das beruehmt gewordene Adagio (zweiter Satz) wurde vom Komponisten spaeter als eigenstaendiges Werk fuer Streichorchester arrangiert und ist eines der meistgespielten Werke des 20. Jahrhunderts.",
        difficulty = 4,
        funFact = "Das Adagio for Strings von Barber wurde bei der Radioankuendigung des Todes von Franklin D. Roosevelt gespielt und gilt seither in den USA als inoffiziell-nationales Trauerstueck. Es erklingt auch im Film 'Platoon' (1986)."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man unter 'Extended Techniques' (erweiterte Spieltechniken) im zeitgenoessischen Streichquartett?",
        answerA = "Verwendung von Mutes (Daempfer) auf allen vier Instrumenten gleichzeitig",
        answerB = "Einbeziehung elektronischer Verstaerkung",
        answerC = "Klang- und Spielmethoden jenseits der traditionellen Bogentechnik, wie Pizzicato-Varianten, Bogendruck-Extrema oder Geraeuschklang",
        answerD = "Das Transponieren von Orchesterwerken fuer Streichquartett",
        correctAnswer = 2,
        explanation = "Extended Techniques umfassen Methoden wie Bartok-Pizzicato (schnappend), Bogendruck-Extreme (sul ponticello / sul tasto), Scordatura, col legno, Flautando, Mikrotonalitaet und Klangperkussion auf dem Korpus. Sie erweitern das Klangspektrum des Ensembles massiv.",
        difficulty = 4,
        funFact = "Das Kronos Quartet ist ein Pionierensemble fuer Extended Techniques im Streichquartett-Bereich. Es hat ueber 1.000 neue Werke in Auftrag gegeben und enge Zusammenarbeit mit Komponisten wie Arvo Paert, Philip Glass und Terry Riley gefuehrt."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Satz aus Haydns Streichquartett Op. 33 Nr. 2 gab dem Werk seinen Beinamen 'Der Scherz'?",
        answerA = "Der erste Satz mit seinen unerwarteten Pausen",
        answerB = "Der zweite Satz in Menuett-Form",
        answerC = "Das Finale, das wiederholt falsch zu enden scheint bevor es wirklich schliesst",
        answerD = "Der dritte Satz mit Vogelimitationen",
        correctAnswer = 2,
        explanation = "Das Finale von Haydns Op. 33 Nr. 2 erhielt dem Werk den Beinamen 'Der Scherz', da es mehrfach mit Pausen und Fermate zu enden scheint, dann aber unvermittelt weitergeht. Das Publikum weiß nie, wann es wirklich vorbei ist — ein typischer Haydn'scher musikalischer Witz.",
        difficulty = 4,
        funFact = "Haydn pragte mit seinen Op. 33-Quartetten (1781) den Terminus 'Scherzo' als Satzbezeichnung. Zuvor hiessen schnelle Dreiertaktsaetze stets 'Menuetto'; Haydn verwendete 'Scherzo' (ital. 'Scherz') erstmals systematisch als Gattungsbezeichnung."
    ),

    // ── Lied- und Vokalmusik-Tradition (10) ──────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Liederzyklus' in der deutschen Romantik?",
        answerA = "Eine Folge thematisch und/oder narrativ zusammenhaengender Sololieder fuer Singstimme und Klavier",
        answerB = "Eine Sammlung von Volksliedern verschiedener Regionen",
        answerC = "Eine Oper in mehreren Akten ohne gesprochene Dialoge",
        answerD = "Ein Chorwerk fuer gemischten Chor ohne Instrumentalbegleitung",
        correctAnswer = 0,
        explanation = "Der Liederzyklus verbindet einzelne Lieder zu einem groesseren Ganzen durch gemeinsame literarische Vorlagen, Tonarten, Motive oder narrative Handlung. Schuberts 'Die schoene Mullerin' und 'Winterreise' sind die Gipfelwerke dieser Gattung.",
        difficulty = 4,
        funFact = "Schubert schrieb die 'Winterreise' (1827) nach Gedichten von Wilhelm Mueller, ohne Mueller je getroffen zu haben. Mueller starb im selben Jahr wie Schubert (1827), ohne zu erfahren, dass Schubert seinen Gedichtzyklus vertont hatte."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Begleittechnik bezeichnet man im deutschen Kunstlied als 'Alberti-Bass'?",
        answerA = "Eine gebrochene Akkordfigur, bei der die Toene eines Dreiklangs in der Reihenfolge Tiefton-Hochton-Mittelton-Hochton gespielt werden",
        answerB = "Eine Technik, bei der die linke Hand Oktaven im Wechsel mit einzelnen Melodietoenen spielt",
        answerC = "Eine Begleitung in Parallelterzen in der Mittelstimme",
        answerD = "Ein Orgelpunkt auf dem Grundton waehrend harmonischer Bewegung",
        correctAnswer = 0,
        explanation = "Der Alberti-Bass (benannt nach Domenico Alberti) ist eine gebrochene Akkordfigur: Tiefton - Hochton - Mittelton - Hochton (z.B. C-G-E-G bei C-Dur-Dreiklang). Er erzeugt eine rhythmische Bewegung ohne melodischen Anspruch und war in der Klassik allgegenwaertig.",
        difficulty = 4,
        funFact = "Mozarts Klaviersonaten nutzen Alberti-Bass so extensiv, dass er zum Klichee wurde. Kritiker des 18. Jahrhunderts verspotteten ihn als 'mechanisch'. Schubert und Schumann entwickelten individuellere Begleitmuster fuer das Kunstlied."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Dichter schrieb den Gedichtband 'Myrthen', den Robert Schumann 1840 vollstaendig vertonte und seiner Braut Clara widmete?",
        answerA = "Heinrich Heine, Friedrich Rueckert, Burns und andere",
        answerB = "Wilhelm Mueller allein",
        answerC = "Johann Wolfgang von Goethe allein",
        answerD = "Joseph von Eichendorff allein",
        correctAnswer = 0,
        explanation = "Schumanns Liedersammlung 'Myrthen' Op. 25 (1840) verwendet Texte mehrerer Dichter: Heinrich Heine, Friedrich Rueckert, Robert Burns (in Uebersetzung), Goethe und Byron. Das Hochzeitsgeschenk fuer Clara umfasst 26 Lieder in verschiedenen Stimmungen und Charakteren.",
        difficulty = 4,
        funFact = "Das Jahr 1840 nennen Musikhistoriker Schumanns 'Liederjahr': Er schrieb ueber 130 Lieder in einem einzigen Jahr, darunter die Dichterliebe Op. 48, Frauenliebe und -leben Op. 42 und die Myrthen. Es war das Jahr seiner Heirat mit Clara Wieck."
    ),

    Question(
        categoryId = 5,
        questionText = "Was ist die 'Durchkomponierung' im deutschen Kunstlied im Gegensatz zur Strophenlied-Form?",
        answerA = "Der Sanger singt alle Strophen auf identische Melodie",
        answerB = "Jede Strophe oder jeder Abschnitt erhaelt eigene, angepasste Musik statt Wiederholung derselben Melodie",
        answerC = "Das Lied verwendet ausschliesslich konsonante Harmonik ohne Dissonanzen",
        answerD = "Ein Instrument uebernimmt die Melodie waehrend die Stimme Ornamente singt",
        correctAnswer = 1,
        explanation = "Im durchkomponierten Lied (German: 'durchkomponiert') erhalt jede Strophe oder jede Texteinheit neue Musik, die dem konkreten Wortinhalt angepasst ist. Schubert nutzte beide Formen: 'Der Erlkoenig' ist durchkomponiert, 'Heidenroeslein' ist ein Strophenlied.",
        difficulty = 4,
        funFact = "Schuberts 'Der Erlkoenig' (1815) wurde vermutlich an einem einzigen Tag komponiert. Der Freund Josef von Spaun berichtete, Schubert habe das Goethe-Gedicht gelesen und sei sofort zur Feder gegriffen — das Manuskript zeige kaum Korrekturen."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Gesangstechnik bezeichnet die Belcanto-Tradition als 'messa di voce'?",
        answerA = "Das Ansetzen der Stimme ohne Knacklaut (ohne Kehldruck)",
        answerB = "Das gleichmaessige An- und Abschwellen eines gehaltenen Tones (Crescendo und Decrescendo auf einem Ton)",
        answerC = "Die Verbindung zweier Registerbereiche der Stimme (Bruststimme und Kopfstimme)",
        answerD = "Eine Verzierungstechnik mit rasch wechselnden Halbe- und Ganztonschritten",
        correctAnswer = 1,
        explanation = "Messa di voce (ital. 'Platzierung der Stimme') bezeichnet das kontrollierte An- und Abschwellen eines langen Tons: pp - crescendo - ff - decrescendo - pp. Es ist eine Grunduebung des Belcanto und demonstriert Atemkontrolle, Registerausgleich und dynamische Kontrolle.",
        difficulty = 4,
        funFact = "Die messa di voce gilt im Belcanto als 'Konigin der Uebungen'. Giambattista Mancini beschrieb sie 1774 in seinem Traktat 'Pensieri e riflessioni pratiche sopra il canto figurato' als unabdingbar fuer jeden Saenger. Profis ueben sie ein Leben lang."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Tonart hat Schuberts Liederzyklus 'Die Winterreise' D 911 als Ausgangstonart des ersten Liedes 'Gute Nacht'?",
        answerA = "d-Moll",
        answerB = "h-Moll",
        answerC = "g-Moll",
        answerD = "a-Moll",
        correctAnswer = 0,
        explanation = "Das erste Lied der Winterreise, 'Gute Nacht', steht in d-Moll. Der Zyklus beginnt im Dunkel der Moll-Tonart und geht durch verschiedene Tonarten, endet aber ebenso dunkel mit 'Der Leiermann' in h-Moll — es gibt keine erloesendeAufloesung.",
        difficulty = 4,
        funFact = "Schubert veroeffentlichte die Winterreise in zwei Teilen (1827/1828). Als er die zweite Haelfte seinen Freunden vorsang, soll er gesagt haben: 'Diese Lieder gefielen mir mehr als alle anderen, und sie werden euch noch gefallen.' Die Freunde waren zunaechst betroffen von ihrer Duesterheit."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Gesangsform bezeichnet man im Barock als 'da capo-Arie'?",
        answerA = "Eine Arie mit drei unterschiedlichen Abschnitten A-B-C ohne Wiederholung",
        answerB = "Eine zweiteilige Arie mit abschliessender Wiederholung des ersten Teils (A-B-A), wobei der Saenger im Wiederholungsteil Ornamente hinzufuegt",
        answerC = "Eine Arie, die ausschliesslich vom Continuo-Ensemble begleitet wird",
        answerD = "Ein kurzes Ariettchen von weniger als einer Minute Dauer",
        correctAnswer = 1,
        explanation = "Die da capo-Arie (A-B-A) ist die dominierende Arienform des Barocks. Teil A wird nach dem Kontraststueck B wiederholt (da capo = 'vom Anfang'), wobei der Saenger die Wiederholung mit improvisierten Ornamenten und Kadenzen verschoenert. Haendel und Vivaldi nutzten sie extensiv.",
        difficulty = 4,
        funFact = "Die Pflicht zur Ornamentierung der da capo-Wiederholung war so selbstverstaendlich, dass keine Noten dafuer geschrieben wurden. Heute muessen Saenger historische Ornamentierungstraktate (z.B. von Quantz oder Tosi) studieren, um diese Praxis wiederzubeleben."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher franzoesische Dichter war der bevorzugte Textdichter fuer Gabriel Faures Melodien?",
        answerA = "Paul Verlaine",
        answerB = "Arthur Rimbaud",
        answerC = "Charles Baudelaire",
        answerD = "Stephane Mallarme",
        correctAnswer = 0,
        explanation = "Gabriel Faure vertonte besonders viele Gedichte von Paul Verlaine, darunter die Zyklen 'Cinq melodies de Venise' und 'La Bonne Chanson'. Verlaines impressionistisch-musikalische Sprache mit ihrer Lautmagie entsprach Faures nuanciertem Kompositionsstil ideal.",
        difficulty = 4,
        funFact = "Verlaine selbst hatte eine enge Verbindung zur Musik und schrieb: 'De la musique avant toute chose' (Musik vor allem anderen) in seinem Gedicht 'Art poetique'. Seine Texte inspirierten ausser Faure auch Debussy, Massenet und Hahn zu beruhmten Vertonungen."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet man im Liedgesang als 'Portamento'?",
        answerA = "Ein abrupter Sprung zwischen zwei weit entfernten Toenen",
        answerB = "Ein gleichmaessig gleitender Ubergang zwischen zwei Toenen (Gleiten der Stimme)",
        answerC = "Die Vibrato-Technik des langen Haltens eines Klanges",
        answerD = "Das Singen mit geschlossenem Mund (Brummen)",
        correctAnswer = 1,
        explanation = "Portamento (ital. 'Tragen') bezeichnet das sanfte Gleiten der Stimme von einem Ton zum naechsten, ohne die Zwischenstufen rhythmisch zu betonen. Es ist ein wichtiges Ausdrucksmittel im romantischen Liedgesang und Belcanto, kann aber bei Uebertreibung als Kitsch wirken.",
        difficulty = 4,
        funFact = "Historische Aufnahmen frueh-romantischer Saenger (z.B. Enrico Caruso um 1900) zeigen extensive Portamento-Verwendung. Moderner Geschmack bevorzugt Portamento sparsamer; die Abkehr vom viktorianischen 'Glissando-Stil' begann in den 1950er Jahren."
    ),

    Question(
        categoryId = 5,
        questionText = "Welcher Komponist schrieb den Liederzyklus 'Dichterliebe' Op. 48 nach Gedichten von Heinrich Heine?",
        answerA = "Franz Schubert",
        answerB = "Johannes Brahms",
        answerC = "Robert Schumann",
        answerD = "Hugo Wolf",
        correctAnswer = 2,
        explanation = "Robert Schumann komponierte 'Dichterliebe' Op. 48 (1840) nach 16 Gedichten aus Heines 'Lyrischem Intermezzo'. Der Zyklus gilt als Gipfel des romantischen Kunstlieds und zeigt Schumanns feinfuehligen Umgang mit dem Verhaltnis von Text und Musik.",
        difficulty = 4,
        funFact = "Schumann strich urspruenglich vier Lieder aus dem Zyklus, bevor er ihn zur Veroffentlichung einreichte. Diese vier Lieder, darunter 'Dein Angesicht', wurden erst posthum veroeffentlicht und zeigen, wie gross das urspruengliche Projekt war."
    ),

    // ── Blasmusik und Harmoniemusik (8) ──────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Harmoniemusik' in der Musikgeschichte des 18. und 19. Jahrhunderts?",
        answerA = "Musik ausschliesslich fuer Blechblasinstrumente (Blechblaeserensemble)",
        answerB = "Kammermusik fuer eine gemischte Gruppe von Holz- und Blechblaeser-Instrumenten (meist Oboen, Klarinetten, Hoerner, Fagotte in Paaren)",
        answerC = "Mehrstimmige Chormusik ohne Instrumentalbegleitung",
        answerD = "Eine oesterreichische Volksmusiksform mit Akkordeon und Zither",
        correctAnswer = 1,
        explanation = "Harmoniemusik bezeichnet Ensembles aus paarweise besetzten Blaesern, typisch: 2 Oboen, 2 Klarinetten, 2 Hoerner, 2 Fagotte (Oktett). Mozart, Haydn und Beethoven schrieben bedeutende Werke fuer diese Besetzung. Hofkapellen pflegten sie als Tafelmusik.",
        difficulty = 4,
        funFact = "Kaiser Joseph II. von Oesterreich liebte die Harmoniemusik so sehr, dass er in Wien eine kaiserliche Harmoniemusik-Kapelle gruendete. Mozart schrieb auf Bestellung schnell eine Harmoniemusik-Bearbeitung seiner Oper 'Die Entfuehrung aus dem Serail', bevor andere Arrangeure es taten."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Instrument wurde um 1815 von Heinrich Stoelzel und Friedrich Bluehmel in Berlin entwickelt und revolutionierte die Blechblaesermusik?",
        answerA = "Das Sousaphon",
        answerB = "Das Ventilhorn / die Ventiltrompete (durch Einfuehrung des Ventilmechanismus)",
        answerC = "Die Bassposaune mit Doppelquartenventil",
        answerD = "Das Kontrabasstuba",
        correctAnswer = 1,
        explanation = "Das Ventilsystem (Patentierung 1818) von Stoelzel und Bluehmel ermoeglichte es Horn und Trompete, alle chromatischen Toene zu spielen ohne Naturtonreihe oder Stopftechnik. Diese Erfindung transformierte die Blechblaeserbesetzung in Orchester und Blaskapellen grundlegend.",
        difficulty = 4,
        funFact = "Brahms schrieb sein Hornlied Op. 17 und sein Horntrio Op. 40 bewusst fuer das Naturhorn (ohne Ventile), weil er den 'dumpfen, gedaempften Klang' der alten Technik bevorzugte. Er war einer der wenigen spaetromantischen Komponisten, der das Ventilhorn aesthetic ablehnte."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet man in der Militaer- und Festmusiktradition als 'Zapfenstreich'?",
        answerA = "Ein tuerkisches Militaermusikensemble (Janitscharenkapelle)",
        answerB = "Das abendliche Zeremoniell mit Musik, das den Tagesabschluss in Garnisonen signalisiert",
        answerC = "Ein spezieller Marschrhythmus im 6/8-Takt",
        answerD = "Die Trommelfanfare zur Eroffnung eines Konzerts",
        correctAnswer = 1,
        explanation = "Der Zapfenstreich (vom Zapfen des Bierfasses — Sperrstunde) ist ein Militaermusikzeremoniell, das Soldaten abends in die Kasernen rief. Der Grosse Zapfenstreich mit Fackeln und Musik ist in Deutschland bei staatlichen Anlaessen noch heute eine offizielle Zeremonie.",
        difficulty = 4,
        funFact = "Der Grosse Zapfenstreich in Deutschland dauert etwa 40 Minuten und beinhaltet ein Musikstueck der Wahl der zu ehrenden Person. Bundespraesidenten, Minister und hochrangige Offiziere werden bei Amtsantritt oder Abschied damit verabschiedet."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Blasmusikform bezeichnet man als 'Konzertouvertuere fuer Blasorchester' und worin unterscheidet sie sich vom Sinfonieorchester-Pendant?",
        answerA = "Sie ist kurzer und nutzt ausschliesslich Holzblaeser ohne Blechblaeser",
        answerB = "Sie ist fuer gemischtes Blasorchester (Holz-, Blechblaeser, Perkussion) ohne Streicher und nutzt die spezifischen Klangfarben dieser Besetzung",
        answerC = "Sie wird immer im Freien aufgefuehrt und erfordert Marschformation",
        answerD = "Sie verwendet ausschliesslich originale Volkslied-Melodien als Themen",
        correctAnswer = 1,
        explanation = "Die Konzertouvertuere fuer Blasorchester ist fuer die Standardbesetzung Blasorchester (Holz-, Blechblaeser, Kontrabaesse ad lib., Perkussion) geschrieben, ohne Streicher. Komponisten wie Percy Grainger, Vincent Persichetti und Alfred Reed haben bedeutende Originalwerke dieser Gattung beigesteuert.",
        difficulty = 4,
        funFact = "Das Blasorchester hat einen eigenen Kanon bedeutender Originalwerke, der sich von Orchestertranskriptionen unterscheidet. Percy Graingers 'Children's March' (1918) und Gustav Holsts 'Suite in Eb' (1909) gelten als erste bedeutende Originalwerke der Gattung."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet man als 'Brassband' im angelsaechsischen Tradition und wie unterscheidet sie sich von einem deutschen Blasorchester?",
        answerA = "Nur der Name ist anders, die Besetzung ist identisch",
        answerB = "Die Brassband besteht ausschliesslich aus Blechblaesinstrumenten und Schlagzeug, ohne Holzblaeser",
        answerC = "Die Brassband ist ein Jazzensemble ohne Rhythmusgruppe",
        answerD = "Die Brassband verwendet ausschliesslich B-Instrumente, waehrend deutsche Blasorchester C-Instrumente nutzen",
        correctAnswer = 1,
        explanation = "Eine Brassband (brit. Tradition) besteht aus Blechblaesinstrumenten in Bb/Eb (Cornets, Fluegelhoerner, Tenor- und Baritonhoerner, Posaunen, Euphonium, Tuben) plus Schlagzeug — keine Holzblaeser. Deutsche Blasorchester haben immer Holzblaeser integriert.",
        difficulty = 4,
        funFact = "Die britische Brassband-Tradition entstand in den 1830er Jahren in Nordengland als Freizeitbeschaftigung fuer Bergarbeiter und Fabrikarbeiter. Das Salvation Army Brass Band Movement hat diese Tradition weltweit verbreitet. Der britische Brassband-Kontestwettbewerb in Belle Vue, Manchester, laeuft seit 1853."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Schlaginstrument-Gruppe bezeichnet man im Blasorchester als 'mallet percussion' (Schlaginstrumente mit Kloeppeln)?",
        answerA = "Trommeln und Pauken (fell-basierte Instrumente)",
        answerB = "Tonenhoehe-bestimmte Schlaginstrumente wie Xylophon, Marimba, Vibraphon, Glockenspiel, Stabspiel",
        answerC = "Becken, Tamburin und Triangel (unbestimmte Tonenhoehe)",
        answerD = "Elektronische Drumpad-Systeme in modernen Ensembles",
        correctAnswer = 1,
        explanation = "Mallet Percussion (Kloeppel-Schlaginstrumente) bezeichnet Instrumente mit bestimmbarer Tonhoehe, die mit Kloeppeln gespielt werden: Xylophon, Marimba, Vibraphon, Glockenspiel, Crotales, Chimes. Sie bilden im modernen Blasorchester eine eigene Sektion.",
        difficulty = 4,
        funFact = "Das Vibraphon ist das einzige Kloeppel-Schlaginstrument mit mechanischen Vibrato-Rotatoren in den Resonatorroehren. Gary Burton entwickelte ab 1960 eine vierschlaegerige Spieltechnik, die harmonische Akkorde ermoeglicht und das Vibraphon zum Jazz-Soloinstrument machte."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche oesterreichische Volksmusiksform bildet die Grundlage der sogenannten 'Volkstuemlichen Blasmusik'?",
        answerA = "Der Ländler und der Walzer als Basis-Tanzformen, kombiniert mit Marsch-Elementen",
        answerB = "Die Wiener Operette des 19. Jahrhunderts",
        answerC = "Die Alpenhorn-Tradition der Schweizer Bergkantone",
        answerD = "Das bohmische Polka-Repertoire des Prager Hofes",
        correctAnswer = 0,
        explanation = "Die volkstuemliche Blasmusik wurzelt im Laendler (3/4-Takt Vorlaeufer des Walzers), dem Wiener Walzer und Maersche aus dem Alpenraum. Kapellen wie die Oberkrainer (Slavko Avsenik) und spater Volksmusik-Sendungen haben diesen Stil popularisiert.",
        difficulty = 4,
        funFact = "Slavko Avsenik aus Slowenien schrieb ueber 1000 Kompositionen und pragte den 'Oberkrainer-Stil' — eine Mischung aus slovenischen und oesterreichischen Volksmusikelementen mit Blaesern und Akkordeon. Sein Stueck 'Na Golici' (Trompetenecho) ist das meistgespielte Blasmusikstuck der Welt."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet man im Militaermusikwesen als 'Schellenbaum'?",
        answerA = "Ein Blechblaeserinstrument in Tuba-Form mit Glockenaufnahme oben",
        answerB = "Ein Perkussionsinstrument aus Turm und halbmondfoermigen Haengern mit Schellen, das im Marschieren mitgetragen wird",
        answerC = "Die Triangel-Aufhaengung im Schlagzeug-Aufbau",
        answerD = "Ein Dirigierstab mit Klingeln zum Markieren des Takts",
        correctAnswer = 1,
        explanation = "Der Schellenbaum (engl. 'Jingling Johnny' oder 'Turkish Crescent') ist ein tuerkisch-osmanisches Perkussionsinstrument, das in europaische Militaerkapellen des 18. Jahrhunderts uebernommen wurde. Er besteht aus einem tragbaren Gestell mit Halbmonden und Schellen.",
        difficulty = 4,
        funFact = "Der Schellenbaum kam durch die sogenannte 'Janitscharenmusik' nach Europa, die am osmanischen Hof des Sultans praktiziert wurde. Mozart, Haydn und Beethoven schrieben Werke mit Janitscharenklang (grosser Trommel, Becken, Triangel) als exotischem Colorit."
    ),

    // ── Jazzharmonik fortgeschritten (8) ─────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet man in der Jazzharmonik als 'ii-V-I-Kadenz'?",
        answerA = "Eine Akkordfolge aus kleiner Septakkord auf der zweiten Stufe, Dominantseptakkord auf der fuenften Stufe und Tonika auf der ersten Stufe",
        answerB = "Eine Folge von drei Dominant-Septakkorden in Ganztonschritten",
        answerC = "Eine Kadenz bei der alle drei Akkorde aus der chromatischen Tonleiter stammen",
        answerD = "Ein Basslauf in Halbtonstufen von der Sexte zur Tonika",
        correctAnswer = 0,
        explanation = "Die ii-V-I-Kadenz (z.B. Dm7 - G7 - Cmaj7 in C-Dur) ist die fundamentalste harmonische Bewegung im Jazz. Der Halbverminderte oder kleine Septakkord auf der zweiten Stufe fuehrt zum Dominant-Septakkord, der zur Tonika aufloest. Jazz-Standards sind oft Ketten von ii-V-I-Kadenzen.",
        difficulty = 4,
        funFact = "John Coltrane revolutionierte die ii-V-I-Kadenz mit seinen 'Coltrane Changes' (Giant Steps, 1960), bei denen er die Tonika durch drei Tonika-Zentren im Abstand grosser Terzen ersetzte und so ii-V-I-Kadenzen durch einen Zyklus aus Terzen trieb."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Jazzbegriff 'Tritone Substitution' (Tritonussubstitution)?",
        answerA = "Ersatz eines Durakkords durch einen Mollakkord auf derselben Grundstufe",
        answerB = "Ersatz eines Dominantakkords durch einen anderen Dominantakkord, dessen Grundton einen Tritonus (uebermassige Quarte) entfernt liegt",
        answerC = "Verwendung eines Pentatonik-Laufs an Stelle einer Akkord-Improvisation",
        answerD = "Verdoppelung der Akkordtone im Abstand einer uebermassigen Quarte",
        correctAnswer = 1,
        explanation = "Die Tritonussubstitution ersetzt z.B. G7 (Dominante in C) durch Db7 (Tritonus-Abstand). Beide Akkorde teilen dieselben Leittone (F und H als Terz und Septime, bzw. Cb und E), erzielen also aehnliche harmonische Spannung und Auflosung, aber mit einem Halbton-Basslauf.",
        difficulty = 4,
        funFact = "Die Tritonussubstitution ist in der Jazztheorie auch als 'Sub V' bekannt. Sie ermoeglichst Chromatic Bass Lines: Z.B. statt G7-C den Basslauf Db7-C zu spielen bedeutet, der Bass geht nur einen Halbtonschritt abwaerts — sehr smooth fuer Jazzimprovisation."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet man im Jazz als 'Reharmonisierung' (Reharmonization)?",
        answerA = "Das Transponieren eines Stuecks in eine andere Tonart",
        answerB = "Das Ersetzen oder Anreichern vorhandener Akkorde durch harmonisch verwandte, aber komplexere Akkorde ohne Aenderung der Melodie",
        answerC = "Das Umschreiben einer Jazznummer fuer ein anderes Ensemble",
        answerD = "Das Hinzufuegen von Blue Notes zur diatonischen Skala",
        correctAnswer = 1,
        explanation = "Reharmonisierung ist das Kunsthandwerk, eine bekannte Melodie ueber neue, veraenderte Akkordfolgen zu setzen. Sie behaelt die Melodie bei, aber veraendert die Harmonik — z.B. durch Tritonussubstitutionen, erweiterte Kadenzen oder modalen Harmonieersatz.",
        difficulty = 4,
        funFact = "Bill Evans war ein Meister der Reharmonisierung: Sein Arrangement von 'My Funny Valentine' oder 'Peace Piece' zeigt, wie radikal Harmonik neugedacht werden kann. Keith Jarrett entwickelte Reharmonisierung zu einer Improvisationskunstform in seinen Solokonzerten."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Akkordstruktur bezeichnet man im Jazz als 'altered chord' (alterierter Akkord)?",
        answerA = "Ein Durakkord mit hinzugefuegter grosser Sexte",
        answerB = "Ein Dominantseptakkord mit alterierter (erhohter oder erniedrigter) None, Undezime oder Tredezime",
        answerC = "Ein verminderter Septakkord als Leittonakkord",
        answerD = "Ein Quartenakkord ohne Terz (sus4)",
        correctAnswer = 1,
        explanation = "Ein Altered Chord (z.B. G7alt) ist ein Dominantseptakkord, bei dem Nonen, Undezimen und/oder Tredezimen alteriert (erhoht oder erniedrigt) sind. Die typische Altered Scale (7. Modus der melodischen Mollskala) erzeugt maximale Spannung vor der Tonika-Auflosung.",
        difficulty = 4,
        funFact = "Der Altered Chord ist eng mit dem 'Superlocrian'-Modus (auch 'Altered Scale') verbunden. Miles Davis nutzte ihn ausgiebig in 'Kind of Blue' (1959), wo modal-alterierte Harmonik eine neue Asthetik des 'cool jazz' schuf."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet die Jazztheorie als 'Upper Structure Triad' (Oberstimmen-Dreiklang)?",
        answerA = "Die drei hoechsten Instrumente im Big-Band-Arrangement (Klarinette, Alt- und Tenorsaxophon)",
        answerB = "Ein Dreiklang, der ueber einem Dominantakkord gespielt wird und Tension-Toene aus einer anderen Tonart oder Skala einbringt",
        answerC = "Die Oberstimme des Chorsatzes mit angefuegten Gegenstimmen",
        answerD = "Zwei gleichzeitig gespielte Arpeggios in verschiedenen Tonarten",
        correctAnswer = 1,
        explanation = "Upper Structure Triads (USTs) sind Dreiklaenge, die auf einem Dominantakkord gespielt werden und spannungsreiche Alterierungen einbringen. Zum Beispiel: ueber G7 einen A-Dur-Dreiklang spielen ergibt b9, #11 und 13 — ein typisch jazziger Sound.",
        difficulty = 4,
        funFact = "Herbie Hancock ist beruehmt fuer seine Upper Structure Voicings. Sein Einsatz von offenen, weiten Clustern und USTs in Miles Davis' Second Quintet (1964-68) pragte die moderne Jazzpianoistik. Sein Intro zu 'Maiden Voyage' zeigt UST-Harmonik in reinster Form."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man unter 'Bebop Scales' (Bebop-Skalen) in der Jazztheorie?",
        answerA = "Diatonische Skalen, die mit Bluestonarten gemischt werden",
        answerB = "Achttoenigere Skalen, die durch einen chromtischen Durchgangston an die Standardskala angefuegt werden, sodass Akkordtone auf Zaehlzeiten fallen",
        answerC = "Pentatonische Skalen mit erhohtem Tritonus",
        answerD = "Modale Skalen basierend auf griechischen Kirchentonarten",
        correctAnswer = 1,
        explanation = "Bebop-Skalen erweitern Dur-, Moll- oder Dominantskalen um einen chromatischen Durchgangston (Passing Tone), sodass bei 8-tel-Noten im 4/4-Takt die Akkordtone auf die betonten Zahlzeiten fallen. Die Bebop-Dur-Skala fuegt z.B. zwischen der 7. und der Oktave einen Chromatismus ein.",
        difficulty = 4,
        funFact = "David Baker, Jazzprofessor an der Indiana University, systematisierte und veroeffentlichte die Bebop-Skalen-Theorie in den 1960ern. Charlie Parker verwendete sie intuitiv; Baker gab ihnen Namen und analytischen Rahmen fuer den Jazzunterricht."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet die Jazztheorie als 'rhythm changes'?",
        answerA = "Das Wechseln des Tempos (Accelerando oder Ritardando) waehrend eines Jazzstuckes",
        answerB = "Die Akkordfolge aus George Gershwins 'I Got Rhythm' als Formschema fuer neue Melodien",
        answerC = "Eine rhythmische Verschiebung aller Akzente um einen Achtel-Schlag",
        answerD = "Das Wechseln zwischen Swing-Rhythmus und geraden Achteln (straight eighths)",
        correctAnswer = 1,
        explanation = "Rhythm Changes bezeichnet die Akkordfolge aus Gershwins 'I Got Rhythm' (1930) in AABA-Form. Unzaehlige Jazz-Standards nutzen diese Harmonik als Grundlage: Charlies Parkers 'Anthropology', Theolonius Monks 'Rhythm-a-ning' und viele andere bauen darauf auf.",
        difficulty = 4,
        funFact = "Rhythm Changes in Bb-Dur ist neben dem Blues das meistgenutzte Harmonik-Schema im Jazz. Die AABA-Form hat je 8 Takte (A-A-B-A = 32 Takte total). Der B-Teil ('Bridge') geht durch vier Dominantakkorde in Quintfallfolge: D7-G7-C7-F7."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche Skala wird im Modal Jazz haeufig ueber einen Dm7-Akkord ohne bestimmte Tonikafunktion gespielt und ist auch als 'Dorian Mode' bekannt?",
        answerA = "Naturelles Moll (Aeolisch)",
        answerB = "Der dorische Modus (Durskala beginnend auf der zweiten Stufe, mit grosser Sexte und kleiner Septime)",
        answerC = "Harmonisches Moll (Moll mit erhohter 7. Stufe)",
        answerD = "Melodisches Moll (aufwaerts erhohte 6. und 7. Stufe)",
        correctAnswer = 1,
        explanation = "Der dorische Modus (D-E-F-G-A-H-C-D auf D) hat im Vergleich zum natuerlichen Moll eine grosse Sexte (H statt B). Dieser Unterschied verleiht dem Dorian einen helleren, weniger 'traurigen' Charakter. Miles Davis' 'So What' (1959) etablierte Dorian als Hauptmodus des Modal Jazz.",
        difficulty = 4,
        funFact = "Miles Davis und Gil Evans bauten 'Kind of Blue' (1959) so, dass die Musiker nur kurze Skalen-Notizen erhielten und darauf improvisierten. John Coltrane, der an der Session teilnahm, war durch den modalen Ansatz inspiriert und entwickelte ihn in seinem eigenen Quartett weiter."
    ),

    // ── Neue Musik nach 1945 (7) ──────────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Was versteht man unter 'serielle Musik' (Serialismus) in der Neuen Musik nach 1945?",
        answerA = "Musik, die in einer festen numerischen Folge (Serie) von Radiostationen gesendet wird",
        answerB = "Strenge Anwendung des Reihen-Prinzips nicht nur auf Tonhoehen, sondern auch auf Rhythmus, Dynamik, Artikulation und Klangfarbe",
        answerC = "Improvisation, bei der Musiker in vorgegebener Reihenfolge solistisch spielen",
        answerD = "Komposition, die serielle (seriell produzierte) Klangbeispiele aus dem Alltag verwendet",
        correctAnswer = 1,
        explanation = "Der Integrale Serialismus (Boulez, Stockhausen, Nono, ca. 1950) erweiterte Schoenbergs Zwolftonreihe auf alle musikalischen Parameter: Tonhoehen werden reihentechnisch bestimmt, ebenso Toendauern, Dynamikstufen und Spielarten. Das Ziel war totale kompositorische Kontrolle.",
        difficulty = 4,
        funFact = "Karlheinz Stockhausens 'Kreuzspiel' (1951) und Pierre Boulez' 'Structures Ia' (1952) gelten als Urwerke des Integralen Serialismus. Boulez revidierte spaeter seine Position und kritisierte den mechanischen Determinismus des fruehen Serialismus in seinem Essay 'Alea' (1957)."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet man als 'Spektralmusik' in der Neuen Musik (franzoesisch: musique spectrale)?",
        answerA = "Musik, die ausschliesslich durch Lichteffekte und visuelle Elemente ergaenzt wird",
        answerB = "Eine Kompositionsmethode, bei der das akustische Klangspektrum (Obertonserie) als Grundlage fuer Harmonik und Orchestrierung dient",
        answerC = "Elektronische Musik, die mit Fast Fourier Transform analysiert und wiedergegeben wird",
        answerD = "Minimal Music mit gleichmaessig verteilten Klangschichten",
        correctAnswer = 1,
        explanation = "Spektralmusik (entstanden um 1970 in Paris, Grisey, Murail) nutzt die physikalische Analyse von Klangspektren als Kompositionsgrundlage. Die Obertone eines Klanges bestimmen Akkordstruktur und Instrumentation. Mikrotonalitaet ist typisch, da natuerliche Obertone nicht temperiert sind.",
        difficulty = 4,
        funFact = "Gerard Grisey und Tristan Murail gruendeten 1973 die Gruppe 'L'Itineraire' in Paris, die zum Zentrum der Spektralmusik wurde. Grisey beschrieb Klang als 'lebendigen Organismus': Der Ton hat Geburt (Attack), Leben (Sustain) und Tod (Decay) — Musik bildet diese Prozesse nach."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet John Cage mit dem Begriff 'chance operations' in seiner Kompositionsmethode?",
        answerA = "Improvisation nach Zufall ohne jegliche Kompositionsplanung",
        answerB = "Verwendung von Zufallsverfahren (z.B. Muenzwurf, I Ging) zur Bestimmung von Tonhoehen, Dauern oder Abfolgen in der Komposition",
        answerC = "Das Uberlassen des Konzertablaufs dem Zufall durch offenes Programmformat",
        answerD = "Spontane Entscheidungen des Dirigenten waehrend der Auffuehrung",
        correctAnswer = 1,
        explanation = "John Cage entwickelte ab den 1950ern Kompositionsverfahren auf Basis von Zufallsoperationen (chance operations). Fuer 'Music of Changes' (1951) nutzte er das chinesische Orakel I Ging. Ziel war es, persoenliche Asthetik und Geschmack aus dem Kompositionsprozess zu eliminieren.",
        difficulty = 4,
        funFact = "Cages beruhmtestes Werk '4'33\"' (1952) ist ein Stueck, in dem der Interpret fuer 4 Minuten und 33 Sekunden kein Instrument spielt. Das 'Werk' besteht aus den zufalligen Umgebungsgerauschen des Konzertsaals. Bei der Urauffuehrung soll das Publikum entsetzt reagiert haben."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnt das Konzept 'Klangfarbenmelodie' in der Neuen Musik?",
        answerA = "Eine Melodie, die ausschliesslich auf Holzblaeserklang basiert",
        answerB = "Die Idee, dass nicht Tonhoehenfolgen, sondern Klangfarben-Folgen die melodische Kontinuitaet tragen",
        answerC = "Eine Technik der Filmmusik, bei der Instrumentalfarben Emotionen illustrieren",
        answerD = "Die Ueberlagerung mehrerer Melodien in verschiedenen Instrumentalfarben (Polyphone Orchestrierung)",
        correctAnswer = 1,
        explanation = "Den Begriff 'Klangfarbenmelodie' pragte Arnold Schoenberg (Harmonielehre, 1911). Er postulierte, dass eine Melodie aus Klangfarben-Wechseln auf demselben Ton entstehen kann. Anton Webern realisierte dieses Konzept in seinen Orchestrierungen und in Werken wie 'Fuenf Orchesterstuecke' Op. 10.",
        difficulty = 4,
        funFact = "Weberns 'Orchestervariationen' Op. 30 demonstrieren Klangfarbenmelodie par excellence: eine Reihe wird auf viele verschiedene Instrumente verteilt, sodass jede Note in anderer Instrumentalfarbe erklingt. Dies inspirierte spaeter Stockhausens Konzept des 'Punktualismus'."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet man als 'Musique concrete' (konkrete Musik)?",
        answerA = "Musik, die aus konkreten (realen) Alltagsgegeraeuschen und aufgenommenen Klangen besteht, die auf Band manipuliert werden",
        answerB = "Musik aus Betonfundamenten, bei der Resonanzplatten als Instrumente dienen",
        answerC = "Neue-Musik-Gattung, die nur auf schriftlicher Notation ohne Aufnahme basiert",
        answerD = "Computermusik, die direkt in DAW-Software komponiert wird",
        correctAnswer = 0,
        explanation = "Musique concrete wurde 1948 von Pierre Schaeffer im Pariser Rundfunk (ORTF) entwickelt. Sie verwendet aufgenommene Realklange (Stimmen, Instrumente, Maschinen, Natur), die auf Magnetband manipuliert (zeitgedehnt, rueckwaerts, geloopt) und zu musikalischen Kompositionen zusammengesetzt werden.",
        difficulty = 4,
        funFact = "Pierre Schaeffers erstes Stuck der Musique concrete, 'Etude aux chemins de fer' (1948), besteht ausschliesslich aus Eisenbahn-Geraeuschen. Er arbeitete mit Grammophon-Platten und spaeter Magnettonband, lange bevor digitale Werkzeuge existierten."
    ),

    Question(
        categoryId = 5,
        questionText = "Was versteht man unter 'Cluster' in der Neuen Musik (Tontraube)?",
        answerA = "Eine Gruppe von Musikern, die gemeinsam ein Thema einstudieren",
        answerB = "Das gleichzeitige Erklingen von dicht beeinanderliegenden Toenen (Sekunden oder Halbtoene) zu einer dissonanten Klangmasse",
        answerC = "Eine Kompositionstechnik, bei der Themen in engen Kanonanstaenden gestapelt werden",
        answerD = "Eine Jazz-Formation aus maximal sechs Musikern",
        correctAnswer = 1,
        explanation = "Ein Cluster ist das gleichzeitige Erklingen vieler benachbarter Toene (z.B. Handballen oder Unterarm auf der Klaviertastatur). Henry Cowell (Neue Musiktheorien, 1919) entwickelte die Technik systematisch; Ligeti, Penderecki und Xenakis verwendeten Cluster-Massen im Orchestersatz.",
        difficulty = 4,
        funFact = "Krzysztof Pendereckis 'Threnos den Opfern von Hiroshima' (1960) fuer Streicher besteht fast vollstaendig aus chromatischen Cluster-Massen. Das Stueck wurde zunachst abstrakt geschrieben und erst spaeter dem Andenken der Hiroshima-Opfer gewidmet."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet man in der Neuen Musik als 'Mikrotonalitaet'?",
        answerA = "Die Verwendung sehr leiser Klaenge (ppp und pppp) in zeitgenoessischen Werken",
        answerB = "Die Verwendung von Intervallen kleiner als ein Halbton, die ausserhalb des gleichstufig temperierten 12-Ton-Systems liegen",
        answerC = "Eine Kompositionstechnik fuer sehr kleine Ensembles (Duo, Trio)",
        answerD = "Musik, die speziell fuer Kopfhorer (Mikrofon-Aufnahmen) konzipiert ist",
        correctAnswer = 1,
        explanation = "Mikrotonale Musik verwendet Intervalle kleiner als ein Halbton: Vierteltoene (Julian Carrillo, Ivan Wyschnegradsky), Sechsteltoene, Achtteltoene oder kontinuierliche Glissandi. Sie erfordert speziell gebaute oder modifizierte Instrumente oder elektronic Klangerzeuger.",
        difficulty = 4,
        funFact = "Das Viertelton-Klavier wurde 1921 vom russischen Pianisten und Komponisten Ivan Wyschnegradsky entwickelt. Es besteht aus zwei Fluegeln, die einen Viertelton auseinander gestimmt sind. Georg Friedrich Haas schreibt heute mikrotonale Werke, die in Live-Auffuhrungen unter Einschluss von Dunkelheit uraufgefuehrt werden."
    ),

    // ── Musikpaedagogik-Methoden (7) ──────────────────────────────────────────

    Question(
        categoryId = 5,
        questionText = "Was sind die Kernprinzipien der Orff-Schulwerk-Methode in der Musikpaedagogik?",
        answerA = "Strenge Noten-Lese-Ausbildung ab dem ersten Unterrichtstag",
        answerB = "Elementare Musik durch Rhythmus, Sprache und Bewegung als Einheit; Lernen durch Tun mit einfachen Perkussionsinstrumenten",
        answerC = "Ausschliessliche Fokus auf das klassische Instrumentalstudium (Klavier oder Violine)",
        answerD = "Theoretische Musiklehre vor jeder praktischen Erfahrung",
        correctAnswer = 1,
        explanation = "Carl Orffs Schulwerk (1930er, revidiert ab 1950) betont das elementare Musicieren: Rhythmus, Sprache und Bewegung sind untrennbar. Kinder lernen durch Nachahmung, Improvisation und Spiel mit einfachen Schlaginstrumenten (Orffinstrumentarium: Stabspiele, Trommeln, Metallophone).",
        difficulty = 4,
        funFact = "Das Orff-Schulwerk wurde nach dem Zweiten Weltkrieg vom Bayerischen Rundfunk mit Orff und Gunild Keetman als Radiosendung fuer Kinder neu gestartet. Die Aufnahmen wurden in ueber 40 Sprachen uebersetzt und das Konzept ist heute in Schulen weltweit verbreitet."
    ),

    Question(
        categoryId = 5,
        questionText = "Welches Prinzip liegt der Kodaly-Methode der ungarischen Musikpaedagogik zugrunde?",
        answerA = "Instrumentalunterricht soll vor Gesangsausbildung beginnen",
        answerB = "Das Singen ist die Grundlage aller Musikerziehung; Volkslieder der eigenen Kultur sind der erste Zugang zur Musik",
        answerC = "Musiktheorie muss vor dem Musizieren vollstaendig erlernt werden",
        answerD = "Kinder sollen ausschliesslich Kunstmusik (keine Volkslieder) lernen, um Qualitaetsmassstabe zu setzen",
        correctAnswer = 1,
        explanation = "Zoltan Kodalys Methode basiert auf der Ueberzeugung, dass das Singen der natuerlichste Zugang zur Musik ist. Volkslieder der eigenen Kultur bilden das erste Repertoire. Wesentlich ist die Solmisationssilben (Do-Re-Mi) und Handzeichen nach John Curwen zur Tonhoehenvisualisierung.",
        difficulty = 4,
        funFact = "Kodaly selbst samMelte zusammen mit Bela Bartok tausende ungarische Volkslieder, die er wissenschaftlich aufzeichnete und als Unterrichtsmaterial aufbereitete. Er betrachtete die Vernachlaessigung der Musikerziehung in Schulen als nationalen Notfall und setzte sich politisch dafuer ein."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet die 'Suzuki-Methode' in der Instrumentalpaedagogik und was ist ihr zentrales Prinzip?",
        answerA = "Strenge japanische Disziplin mit taeglichen Pruefungen und Noten-Bewertung ab dem ersten Tag",
        answerB = "Lernen wie beim Spracherwerb: Durch Zuhoeren, Nachahmung und Wiederholung statt durch fruehes Noten-Lesen; Eltern werden aktiv einbezogen",
        answerC = "Selbstgesteuertes Lernen ohne Lehrer, nur durch Lehrvideos",
        answerD = "Gruppenunterricht fuer Erwachsene nach dem Vorbild japanischer Arbeitsgruppen (Kaizen)",
        correctAnswer = 1,
        explanation = "Shinichi Suzukis Methode (entwickelt ab 1940) basiert auf der 'Muttersprachen-Methode': Kinder lernen Instrument wie ihre Muttersprache — durch taegliches Zuhoeren von Aufnahmen, Nachahmung und liebevolle Wiederholung. Eltern ueben taeglich mit den Kindern und sind Partner im Lernprozess.",
        difficulty = 4,
        funFact = "Suzuki begann mit dem Unterrichten von Violine, beobachtete aber, wie japanische Kinder muehelos ihre komplexe Muttersprache erlernten. Daraus entwickelte er seine Philosophie: Jedes Kind kann Musik lernen, wenn die richtige Umgebung geschaffen wird. Seine Methode wird heute fuer viele Instrumente verwendet."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet man in der Musikpaedagogik als 'relative Solmisation' im Gegensatz zur 'absoluten Solmisation'?",
        answerA = "Relative Solmisation verwendet Silben fuer feste Tonhoehen (C=Do), absolute Solmisation verwendet bewegliche Silben je nach Tonart",
        answerB = "Relative Solmisation verwendet bewegliche Silben (Do ist immer die Tonika der aktuellen Tonart), absolute Solmisation bindet Silben an feste Tonhoehen (C=Do immer)",
        answerC = "Relative Solmisation gilt nur fuer Gesang, absolute nur fuer Instrumente",
        answerD = "In der relativen Solmisation singen Kinder, in der absoluten lesen sie Noten",
        correctAnswer = 1,
        explanation = "Bei der relativen Solmisation (Tonic Sol-fa, Kodaly) ist Do immer die Tonika der jeweiligen Tonart — in G-Dur ist G=Do, F=Do in F-Dur. Bei der fixen Solmisation (franzoesisch, italienisch) ist C immer Do, unabhaengig von der Tonart. Erstere foerdert tonales Gehoer, letztere absolutesGehoer.",
        difficulty = 4,
        funFact = "Guido von Arezzo erfand im 11. Jahrhundert die Solmisation mit den Silben Ut-Re-Mi-Fa-Sol-La (aus einem Johannis-Hymnus). 'Ut' wurde spater zu 'Do' veraendert, da es bequemer zu singen ist. 'Si' (spaeter 'Ti') fuer den 7. Ton kam erst im 17. Jahrhundert hinzu."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet man in der Musikpaedagogik als 'Audiation' (nach Edwin Gordon)?",
        answerA = "Das Zuhoeren bei Live-Konzerten als paedagogische Methode",
        answerB = "Die Faehigkeit, Musik innerlich zu hoeren und zu verstehen, ohne sie physisch zu spielen oder zu singen (inneres musikalisches Denken)",
        answerC = "Das Aufnehmen und Abspielen eigener Musikstucke zur Selbstanalyse",
        answerD = "Eine Uebungsmethode mit Audiotechnik und Kopfhoerern fuer Einzelunterricht",
        correctAnswer = 1,
        explanation = "Edwin Gordon pragte den Begriff 'Audiation' (analog zu 'Denken' fuer Sprache) als die Faehigkeit, Musik im Geist zu hoeren, zu verstehen und innerlich klingend vorzustellen — ohne aeussere Klangreize. Es ist nach Gordon die zentrale Musikalitaetsfahigkeit, die durch seine Music Learning Theory gefOrdert wird.",
        difficulty = 4,
        funFact = "Gordon's Music Learning Theory unterscheidet verschiedene Audiation-Typen: waehrend des Spielens, vor dem Spielen, bei der Notation, beim Improvisiereun. Ein Musiker, der nur nachspielt was er hoert, audiiert weniger als einer, der Musik 'denkt' bevor er sie klingend macht."
    ),

    Question(
        categoryId = 5,
        questionText = "Welche musikpaedagogische Methode legte Emile Jaques-Dalcroze zu Beginn des 20. Jahrhunderts dar und was ist ihr Kern?",
        answerA = "Mathematisch-strukturelles Denken als Vorbedingung fuer Musikalitaet",
        answerB = "Eurhythmik: Die Verbindung von Musik und Koerperbewegung zur Entwicklung von Rhythmus- und Hoerempfinden",
        answerC = "Ausschliessliche Erziehung nach klassischen Meisterwerken ohne Volkslieder",
        answerD = "Improvisation als einzige Lehrmethode ohne vorgegebenes Curriculum",
        correctAnswer = 1,
        explanation = "Jaques-Dalcroze entwickelte ab 1892 die Eurhythmik (Bewegungsrhythmik): Musikalische Elemente wie Rhythmus, Dynamik und Phrasing werden durch Koerperbewegung erfahrbar gemacht. Der Koerper ist 'erstes Instrument'. Die Methode beeinflusste Tanz-, Theater- und Musikpaedagogik weitreichend.",
        difficulty = 4,
        funFact = "Dalcroze gruendete 1910 in Hellerau bei Dresden das Institut fuer Angewandte Rhythmik, das eine Pilgerstatte fuer Kunstvisionare wurde. Isadora Duncan, Mary Wigman und Stanislawski besuchten es. Hellerau gilt als Geburtsstatte des modernen Tanzes und des expressionistischen Theaters."
    ),

    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Elementare Musikpaedagogik' (EMP) im deutschsprachigen Raum?",
        answerA = "Musikunterricht fuer Grundschulanfaenger (Elementarklassen)",
        answerB = "Eine ganzheitliche Musikerziehung, die Musik, Bewegung, Sprache und Spiel integriert und auf elementare (grundlegende) Musicier-Erfahrungen zielt",
        answerC = "Theoretische Musikausbildung an Elementstufen der Musikschule",
        answerD = "Musikunterrricht fuer Kinder mit sonderpaedagogischem Foerderbedarf",
        correctAnswer = 1,
        explanation = "Elementare Musikpaedagogik (EMP) ist ein ganzheitlicher Ansatz, der auf Orffs Schulwerk aufbaut und Musik, Bewegung, Sprache, Tanz und Spiel integriert. EMP richtet sich an alle Altersgruppen (Saeuglinge bis Erwachsene) und zielt auf grundlegende Musikerfahrung, nicht instrumentales Spezialistentum.",
        difficulty = 4,
        funFact = "An deutschsprachigen Musikhochschulen ist EMP ein eigenstaendiges Studienfach. EMP-Paedagogen arbeiten nicht nur in Musikschulen, sondern auch in Kindergaerten, Kliniken (Musiktherapie-Naehe), Seniorenheimen und integrativen Einrichtungen — ueberall wo ganzheitliche Musikerfahrung sinnvoll ist."
    )

)
