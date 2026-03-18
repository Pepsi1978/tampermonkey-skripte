package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun musicQuestionsMaster(): List<Question> = listOf(

    // ── Avantgarde / Experimentalmusik (10) ─────────────────────────────────

    // Q1
    Question(
        categoryId = 5,
        questionText = "Welches Kompositionsprinzip verwendete John Cage in 'Music of Changes' (1951), um saemtliche Parameter des Stueckes festzulegen?",
        answerA = "Serielle Technik nach Webern mit vollstaendiger Parameterkontrolle",
        answerB = "Zufallsoperationen basierend auf dem I-Ging-Orakel",
        answerC = "Aleatorie nach einem selbst erfundenen Wuerfelwurf-Algorithmus",
        answerD = "Grafische Notation nach Anweisungen des Pianisten David Tudor",
        correctAnswer = 1,
        explanation = "Cage verwendete in 'Music of Changes' Zufallsoperationen basierend auf dem chinesischen I-Ging (Buch der Wandlungen), um Tonhoehe, Dauer, Dynamik und Tempo zu bestimmen. Der Pianist David Tudor brauchte Monate, um das Stueck zu erarbeiten, weil er jede Seite einzeln durch die Zufallstabellen kalkulieren musste.",
        difficulty = 5,
        funFact = "Die Partitur von 'Music of Changes' umfasst 84 Seiten und dauert ca. 43 Minuten. Tudor berichtete, er habe fuer die Uraufgabe jede Note einzeln ausgerechnet — ein enormer intellektueller Aufwand, bevor eine einzige Taste gedrueckt wurde."
    ),

    // Q2
    Question(
        categoryId = 5,
        questionText = "Welches Werk von Karlheinz Stockhausen aus dem Jahr 1966 ist das erste Stueck, das explizit fuer Helikopter und Streichquartett komponiert wurde?",
        answerA = "Helikopter-Streichquartett (aus Mittwoch aus LICHT)",
        answerB = "Helicopter Quartet (Teil von Donnerstag aus LICHT)",
        answerC = "Flug (fuer vier Instrumente und Luftfahrzeuge)",
        answerD = "Hymnen fuer Hubschrauber und Orchester",
        correctAnswer = 0,
        explanation = "Das 'Helikopter-Streichquartett' ist Teil von 'Mittwoch aus LICHT' (1995/96), dem fuenften Tag des sieben-Opern-Zyklus LICHT. Jeder der vier Streicher spielt in einem eigenen fliegenden Helikopter; das Klangbild aus Rotoren und Instrumenten wird live uebertragen. Die Urauffuehrung fand 1995 in Amsterdam statt.",
        difficulty = 5,
        funFact = "Die Logistik der Uraufgabe war gewaltig: Vier Helikopter mussten synchronisiert fliegen, waehrend die Musiker spielten. Das Publikum hoerte die Mischung aus Rotorlaerm und Streicherklang ueber Lautsprecher in der Konzerthalle."
    ),

    // Q3
    Question(
        categoryId = 5,
        questionText = "Was versteht man unter dem Begriff 'Spektralismus' in der Komposition, wie ihn Gerard Grisey und Tristan Murail in den 1970er Jahren entwickelten?",
        answerA = "Die Komposition basierend auf der mathematischen Fourier-Analyse des Klangs und seiner Obertonstruktur",
        answerB = "Eine serielle Methode, bei der alle Parameter aus dem Frequenzspektrum des Grundtons abgeleitet werden",
        answerC = "Die Notation von Klangfarben durch farbige Partiturfelder statt konventioneller Noten",
        answerD = "Eine Improvisationstechnik, bei der Musiker frei innerhalb vorgegebener Frequenzbereiche agieren",
        correctAnswer = 0,
        explanation = "Spektralismus (frz. musique spectrale) basiert auf der Fourier-Analyse realer Klangspektren. Grisey und Murail (Ensemble L'Itineraire) leiteten harmonische, rhythmische und timbre-basierte Strukturen direkt aus den Oberton-Spektren eines Grundklangs ab. Griseys 'Partiels' (1975) gilt als Musterwerk der Richtung.",
        difficulty = 5,
        funFact = "Grisey analysierte fuer 'Partiels' das Spektrum eines Blechblaesers mit dem Computer und uebersetzte die Partialtonstruktur direkt in Orchesterklang — ein Paradigmenwechsel gegenueber der abstrakten Serialismus-Tradition."
    ),

    // Q4
    Question(
        categoryId = 5,
        questionText = "Welche Kompositionstechnik bezeichnete Iannis Xenakis als 'Stochastische Musik'?",
        answerA = "Die Anwendung von Wahrscheinlichkeitstheorie und Statistik zur Bestimmung musikalischer Ereignisse",
        answerB = "Die Integration von weissem Rauschen als kompositorisches Material in der Eletroakustik",
        answerC = "Die Verwendung von Markov-Ketten zur Erzeugung melodischer Sequenzen",
        answerD = "Eine Spieltechnik fuer Streicher, bei der Bogengeschwindigkeit und -druck randomisiert werden",
        correctAnswer = 0,
        explanation = "Xenakis entwickelte die Stochastische Musik ab den fruehen 1950ern: Er wandte Wahrscheinlichkeitsgesetze (Gauss-Verteilung, Poisson-Prozesse) auf musikalische Parameter an. 'Metastasis' (1953-54) und 'Pithoprakta' (1955-56) sind fruehe Beispiele. Er sah parallelen zwischen der statistischen Physik von Gaswoelken und grossen Klangmassen.",
        difficulty = 5,
        funFact = "Xenakis war ausgebildeter Ingenieur und Architekt — er arbeitete bei Le Corbusier. Das Philips-Pavillon fuer die Expo 1958 in Bruessel, den er mitentworfen hatte, wurde musikalisch von seinem Stueck 'Concret PH' bespielt, das er selbst komponierte."
    ),

    // Q5
    Question(
        categoryId = 5,
        questionText = "Was ist das zentrale Verfahren in Luigi Nonos 'Fragmente — Stille, An Diotima' (1980) fuer Streichquartett?",
        answerA = "Vollstaendige Integration von Stille als strukturelles Element neben aeusserster Klangzartheit",
        answerB = "Maximale Lautstaerke (fff) als Kontrapunkt zur romantischen Kammermusiktradition",
        answerC = "Elektronische Verfremdung der Streichinstrumente in Echtzeit per Ringmodulator",
        answerD = "Mikrotonal-serielle Strukturen abgeleitet aus Holderlins Gedicht 'An Diotima'",
        correctAnswer = 0,
        explanation = "In 'Fragmente — Stille, An Diotima' arbeitete Nono mit extremen dynamischen Grenzen (hauptsaechlich pppp bis ppp) und langen Schweigen. Er schrieb Zitate aus Holderlins Diotima-Gedichten in die Partitur, ohne sie als Gesang zu vertonen — stattdessen sollte die Musik den Zuhoerer in einen Zustand innerer Stille fuehren.",
        difficulty = 5,
        funFact = "Nono schenkte das Stueck dem LaSalle Quartet. Er schrieb dazu, die Zitate aus Hoelderlin sollten 'hoerbar denken' — ein kontemplativer Ansatz, der radikal mit dem Aktivismus seiner frueheren Werke brach."
    ),

    // Q6
    Question(
        categoryId = 5,
        questionText = "Welches phonetische Kompositionsverfahren entwickelte Luciano Berio in 'Sequenza III' (1966) fuer Solostimme?",
        answerA = "Integrale Sprachdekomposition: Zerlegen von Saetzen in Laute, Morpheme und Atemgeraeusche als eigenstaendiges Material",
        answerB = "Vokalisen nach zwoefltoenigem Reihenverfahren ohne Bezug zur Sprache",
        answerC = "Elektronische Verfremdung der Stimme mit Ringmodulator und Live-Delay",
        answerD = "Vierteltonskala-Gesang nach dem Vorbild arabischer Maqam-Systeme",
        correctAnswer = 0,
        explanation = "In 'Sequenza III' zerlegt Berio Sprache in ihre Bestandteile: Phoneme, Laute, Fluesters, Kichern, Schreien, Atemgeraeusche. Das Textmaterial (ein kurzer Satz von Markus Kutter) wird nie als kohaerent verstaendlicher Text praesentiert, sondern als Klangmaterial atomisiert. Die Saengerin muss gleichzeitig spielen, sprechen und Theater agieren.",
        difficulty = 5,
        funFact = "Berio schrieb 'Sequenza III' fuer seine damalige Ehefrau Cathy Berberian, deren stimmliche Vielseitigkeit legendaer war. Berberian konnte innerhalb von Sekunden zwischen Operndiva, Volkssingerin und Comicfigur wechseln."
    ),

    // Q7
    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'mikropolyphon' in der Kompositionspraxis Gyoergy Ligetis, wie in 'Lontano' (1967)?",
        answerA = "Eng verschraenkte Stimmfuehrung, bei der viele Einzelstimmen durch minimale zeitliche Versetzung eine dichte, atemlose Klangtextur erzeugen",
        answerB = "Polyphonie mit Intervallen unter einem Halbton durch Mikrotonal-Stimmung aller Instrumente",
        answerC = "Computergenerierte Polyphonie, bei der Algorithmen hunderte simultane Linien erzeugen",
        answerD = "Kanonische Technik, bei der Einsaetze im Abstand von Bruchteilen einer Sekunde erfolgen",
        correctAnswer = 0,
        explanation = "Mikropolyphonie bezeichnet bei Ligeti das simultane Klingen vieler eng versetzter Stimmlinien, die individuell nicht verfolgbar sind, sondern eine gemeinsame Klangwoelke — ein 'Cluster in Bewegung' — erzeugen. In 'Lontano' beginnt die Musik aus der Stille und waechst zu einer schimmernden Klangsaeule, ohne dass der Zuhoerer einen einzelnen Einsatz wahrnehmen kann.",
        difficulty = 5,
        funFact = "Stanley Kubrick verwendete Ligetis Orchesterwerke (ohne anfaengliche Genehmigung) in '2001: A Space Odyssey' (1968). Ligeti war darueber empört, klagte jedoch erfolglos — und erlangte so weltweite Bekanntheit."
    ),

    // Q8
    Question(
        categoryId = 5,
        questionText = "Was versteht man unter dem 'New Complexity'-Stil, der mit Brian Ferneyhough assoziiert wird?",
        answerA = "Extreme rhythmische und notationstechnische Komplexitaet als expressives Mittel, die die Grenzen menschlicher Ausfuehrbarkeit absichtlich tangiert",
        answerB = "Computergesteuerte Komplexitaet durch algorithmische Komposition in Echtzeit",
        answerC = "Kombinatorische Serialismus-Erweiterung mit 24-stufigen Tonhoehen- und Rhythmusreihen",
        answerD = "Kollektive Improvisation nach komplexen Regelwerken ohne Partitur",
        correctAnswer = 0,
        explanation = "New Complexity (Ferneyhough, Dillon, Finnissy u.a.) arbeitet mit extrem dichten Partituren: verschachtelte unregelmässige Rhythmen (z.B. 7/11 innerhalb von 5/9), mikrotonal, mit mehrfachen Anweisungsschichten gleichzeitig. Die Unmoeglickeit perfekter Realisierung ist kalkuliertes Stilmittel — die Partitur ist ein Ideal-Objekt, das eine produktive Spannung zur Auffuehrung erzeugt.",
        difficulty = 5,
        funFact = "Ferneyhoughs 'Unity Capsule' (1975) fuer Soloflote gilt als eines der schwierigsten Stuecke im Floeten-Repertoire. Interpreten berichten von jahrelanger Vorbereitungszeit — fuer ein Stueck, das unter 20 Minuten dauert."
    ),

    // Q9
    Question(
        categoryId = 5,
        questionText = "Welches konkrete Klangobjekt verwendete Pierre Schaeffer in seiner 'Etude aux chemins de fer' (1948) als erstes Musique-Concrete-Werk?",
        answerA = "Aufgenommene Dampflok-Geraeusche, die durch Geschwindigkeitsmanipulation und Schnitt kompositorisch verarbeitet wurden",
        answerB = "Fabriklaerm aus Pariser Industriebetrieben, verarbeitet mit variablem Abspieltempo",
        answerC = "Strassenbahngeraesuche kombiniert mit verzerrten Orchesteraufnahmen",
        answerD = "Elektrische Rauschsignale vom Pariser Rundfunknetz als Grundmaterial",
        correctAnswer = 0,
        explanation = "Pierre Schaeffer nahm in den Pariser Bahnhoefen Geraeusche von Dampflokomotiven auf — Pfeifen, Rattern, Ankurbeln. Er bearbeitete diese Aufnahmen durch Aenderung der Abspielgeschwindigkeit, Umkehrung und Schnitt. 'Etude aux chemins de fer' gilt als das erste Werk der Musique concrete und wurde am 5. Oktober 1948 im Radio Frankreich urgesendet.",
        difficulty = 5,
        funFact = "Schaeffer arbeitete als Rundfunktechniker bei der RTF (Radio-diffusion-Television Francaise). Er hatte zugang zu professionellen Aufnahmegeraeten — ein seltenes Privileg in der Nachkriegszeit — und nutzte die institutionellen Ressourcen fuer sein Experiment."
    ),

    // Q10
    Question(
        categoryId = 5,
        questionText = "Was ist das 'Cluster-Keyboard'-Verfahren, das Henry Cowell ab 1912 in Stuecken wie 'The Tides of Manaunaun' einsetzte?",
        answerA = "Spielen grosser Klangtrauben durch gleichzeitiges Druck mit Unterarm, Faust oder flacher Hand auf die Klaviertasten",
        answerB = "Praeparation des Klaviers mit Metallplatten auf den Saiten zur Erzeugung metallischer Cluster",
        answerC = "Innenklavier-Technik: direktes Zupfen oder Daempfen der Saiten innerhalb des Klavierkorpus",
        answerD = "Computergenerierte Klaviercluster erzeugt durch MIDI-Sequencer mit engem Abstand",
        correctAnswer = 0,
        explanation = "Henry Cowell prapaegte den Begriff 'Tone Cluster' fuer das Spielen grosser Gruppen benachbarter Halbtoene gleichzeitig, indem er den Unterarm, die Faust oder die flache Hand auf die Tasten legte. Er verwendete diese Technik bereits als Teenager und notierte sie in der Partitur explizit durch schwarze Balken.",
        difficulty = 5,
        funFact = "Als Cowell seine Cluster-Technik oeffentlich demonstrierte, warfen ihm Kritiker Vandalismus vor. Obwohl Bartok und andere spaeter aehnliche Techniken aufgriffen und beruehmter wurden, gilt Cowell als unbestrittener Pionier der modernen Klaviertechnik."
    ),

    // ── Kompositionstechniken (10) ───────────────────────────────────────────

    // Q11
    Question(
        categoryId = 5,
        questionText = "Was bezeichnet 'Grundgestalt' im Kontext Arnold Schoenbergs Kompositionstheorie, und welches Stueck gilt als fruehes Musterbeispiel?",
        answerA = "Eine kompakte melodisch-rhythmische Keimzelle, aus der alle Motive und Themen eines Werkes entwickelt werden — paradigmatisch in der Ersten Kammersymphonie op. 9",
        answerB = "Die vollstaendige Zwoefltonreihe einschliesslich aller vier Formen, die als 'Grundlage' des Stueckes notiert wird",
        answerC = "Das Hauptthema einer Sonate als unabdingbarer Ausgangspunkt der Entwicklungsabschnitte",
        answerD = "Eine theoretische Abstraktion: der gemeinsame Grundton aller Tonarten in einem polytonalen Stueck",
        correctAnswer = 0,
        explanation = "Die 'Grundgestalt' (engl. basic shape) ist fuer Schoenberg eine praegnante, kurze Idee, die Intervallstruktur, Rhythmus und Kontur so verbindet, dass man daraus das gesamte Material eines Stueckes ableiten kann. Er verstand sie als Alternative zur Leitmotiv-Technik Wagners und arbeitete sie systematisch in der Ersten Kammersymphonie op. 9 (1906) aus.",
        difficulty = 5,
        funFact = "Der Begriff 'Grundgestalt' wurde erst posthum aus Schoenbergs Unterrichtsnachlass bekannt. Der Theoretiker David Epstein machte ihn populaer; spaeier griffen Patricia Carpenter und Ethan Haimo ihn systematisch auf."
    ),

    // Q12
    Question(
        categoryId = 5,
        questionText = "Was unterscheidet 'totale Serialismus' von klassischer Zwoefltonmusik, und welches Werk Olivier Messiaens gilt als Vorlaeufer?",
        answerA = "'Mode de valeurs et d'intensites' (1949) serialisierte erstmals Dauer, Dynamik und Artikulation zusaetzlich zur Tonhoehe",
        answerB = "Messiaens 'Quatuor pour la fin du temps' serialisierte alle Parameter einschliesslich Instrumentenwechsel und Pausen",
        answerC = "Der integrale Serialismus entstand erst mit Boulez 'Structures Ia' ohne Vorlaeufer bei Messiaen",
        answerD = "Totale Serialismus bedeutet die serielle Verarbeitung von Klangraeumen (Akustik) statt Noten",
        correctAnswer = 0,
        explanation = "Messiaens Klavierstueck 'Mode de valeurs et d'intensites' (1949) benutzte vorkomponierte Reihen fuer Tonhoehen, Dauern (24 Werte), Dynamiken (7 Stufen) und Anschlagsarten — ein entscheidender Schritt zum integralen Serialismus. Boulez und Stockhausen griffen dies auf: 'Structures Ia' (1952) und 'Kreuzspiel' (1951) vollzogen den Schritt zum totalen Serialismus.",
        difficulty = 5,
        funFact = "Messiaen selbst war kein ueberzeugter Serialist — er betrachtete 'Mode de valeurs' als Experiment und kehrte danach zu seiner Vogellieder-Mystik zurueck. Er war ueberhaupt erstaunt, dass seine Schueler Boulez und Stockhausen das Stueck als Manifest interpretierten."
    ),

    // Q13
    Question(
        categoryId = 5,
        questionText = "Was versteht man unter 'Kontrapunkt des 15./16. Jahrhunderts' nach Johannes Tinctoris, und welche Regel ist besonders strikt?",
        answerA = "Das Verbot von Quintparallelen und Oktavparallelen (consecutiones perfectae) in der direkten Bewegung",
        answerB = "Die Pflicht, jede Dissonanz durch vorherigen Halbtonschritt vorzubereiten und schrittweise aufzuloesen",
        answerC = "Das Gebot, den cantus firmus stets in der Tenorstimme zu fuehren und nicht zu verzieren",
        answerD = "Die Regel, dass jede Klausel mit einer vollkommenen Konsonanz (Oktave oder Unisono) enden muss",
        correctAnswer = 0,
        explanation = "Tinctoris' 'Liber de arte contrapuncti' (1477) formuliert u.a. das strikte Verbot von Quint- und Oktavparallelen (consecutiones) in der Direktbewegung (similar/direct motion). Diese Regel ist im strengen Satz bindend und gilt bis in den 18. Jh. — sie unterscheidet polyphonen Satz von harmonischer Akkordfolge.",
        difficulty = 5,
        funFact = "Tinctoris unterschied als erster systematisch zwischen erlaubter Terz-/Sextparallele und verbotener Quint-/Oktavparallele. Sein Traktat war so einflussreich, dass Theoretiker noch 200 Jahre spaeter darauf zurueckgriffen."
    ),

    // Q14
    Question(
        categoryId = 5,
        questionText = "Was ist das 'hexachord' im Kontext der Zwoefltonkomposition und wie nutze Alban Berg ihn in der Violinkonzert (1935)?",
        answerA = "Berg baute seine Reihe so, dass das erste Hexachord aus reinen Terzen (Mollakkorden) und das zweite aus einem Ganztonausschnitt besteht, was tonal klingende Passagen ermoeglicht",
        answerB = "Das Hexachord ist die erste Haelfte der Reihe; Berg transponierte es invertiert als zweite Haelfte, um maximale Symmetrie zu erzeugen",
        answerC = "Berg verwendete zwei getrennte Sechston-Reihen, die unabhaengig voneinander verlaufen und sich nur an Kadenzen beruehren",
        answerD = "Das Hexachord bezeichnet bei Berg die sechs Grundformen jeder Reihe (P, I, R, RI, P-Inversion, R-Inversion)",
        correctAnswer = 0,
        explanation = "Bergs Violinkonzert-Reihe ist subtil tonal: Sie besteht aus alternierenden Terzen (g-b-d-fis-a-cis), was Fragmente aus Dur/Moll-Dreiklaengen ermoeglicht. Das zweite Hexachord (fis-a-b-c-d-e) aehnelt einer Ganztonreihe. Berg fuegt zudem ein Bach-Choral-Zitat ein, das sich nahtlos in die Zwoefltonstruktur fuegt — ein einzigartiger Bruch zwischen Serialismus und Tonalitaet.",
        difficulty = 5,
        funFact = "Das Violinkonzert entstand in nur wenigen Wochen nach dem Tod von Manon Gropius, Tochter von Alma Mahler und Walter Gropius. Berg widmete es 'dem Andenken eines Engels' und vollendete es kurz vor seinem eigenen Tod im Dezember 1935."
    ),

    // Q15
    Question(
        categoryId = 5,
        questionText = "Was unterscheidet die 'Isorhythmus'-Technik der Ars Nova von schlichter Wiederholung und in welchem Kontext tritt sie auf?",
        answerA = "Isorhythmus kombiniert eine wiederholte Rhythmusstruktur (talea) mit einer unabhaengig wiederholten Melodiestruktur (color), die unterschiedlich lang sind und sich versetzt ueberlappen",
        answerB = "Isorhythmus bedeutet die exakte rhythmische Verdoppelung aller Stimmen eines Satzes in bestimmten Abschnitten",
        answerC = "Es ist die Technik, alle Stimmen gleichzeitig dieselbe rhythmische Figur spielen zu lassen — isometrische Homophonie",
        answerD = "Isorhythmus bezeichnet die strenge Imitation einer Rhythmuslinie zwischen Tenor und Contratenor im Abstand einer Mensur",
        correctAnswer = 0,
        explanation = "Isorhythmus (Ars nova, 14. Jh.) verbindet 'talea' (rhythmische Struktur) und 'color' (melodische Linie) als getrennte Schichten. Beide wiederholen sich, sind aber unterschiedlich lang — ihr Verhaltnis erzeugt komplexe Verschiebungen. Guillaume de Machaut und Philippe de Vitry verwendeten diese Technik vor allem in Motetten.",
        difficulty = 5,
        funFact = "Machaut schrieb mit der 'Messe de Nostre Dame' (ca. 1365) die erste mehrstimmige Ordinariumsvertonung eines einzelnen Komponisten — und benutzte Isorhythmus in den Gloria- und Credo-Saetzen. Das Stueck wird bis heute als Meilenstein der europaeischen Musikgeschichte angesehen."
    ),

    // Q16
    Question(
        categoryId = 5,
        questionText = "Was versteht man unter 'Stratifikation' als Kompositionstechnik bei Elliott Carter, entwickelt ab den 1950er Jahren?",
        answerA = "Gleichzeitiges Fuehren mehrerer Stimmen oder Instrumente in voellig unabhaengigen Tempi, Charakteren und Ausdrucksebenen, die 'aneinander vorbeigehen'",
        answerB = "Die schichtweise Addition von Orchesterstimmen in einem festgelegten zeitlichen Abstand von jeweils einer Taktlaenge",
        answerC = "Eine harmonische Schichtungstechnik, bei der verschiedene Akkorde simultan erklingen und langsam ineinander uebergehen",
        answerD = "Die serielle Anordnung von Tonhoehenschichten von tief nach hoch in aufsteigender Reihenfolge",
        correctAnswer = 0,
        explanation = "Carter entwickelte 'Stratifikation' als Grundprinzip seiner Kammermusik: Verschiedene Instrumente repraesentieren unterschiedliche 'Charaktere', die gleichzeitig und weitgehend unabhaengig voneinander agieren, als spielten sie in verschiedenen Welten. Sein erstes grosses Beispiel ist das Streichquartett Nr. 1 (1951); spaeter verfeinerte er das Prinzip mit 'metric modulation'.",
        difficulty = 5,
        funFact = "Carter zufolge inspirierte ihn das Erleben eines Jazzkonzerts, bei dem die Rhythmusgruppe und der Solist scheinbar in verschiedenen Zeitwelten spielten. Er fragte sich, wie man dieses Phaenomen ins notierte Streichquartett uebertragen koennte."
    ),

    // Q17
    Question(
        categoryId = 5,
        questionText = "Was ist 'Klangfarbenmelodie' im Sinne Anton Weberns, und in welchem seiner Werke ist sie am deutlichsten realisiert?",
        answerA = "Die Verteilung einer einzelnen Melodielinie auf verschiedene Instrumente takt- oder notweise, sodass Klangfarbwechsel selbst melodietragend werden — paradigmatisch in der Orchestration von Bachs Ricercare (1935)",
        answerB = "Eine Melodie ausschliesslich aus verschiedenen Flageolettklangen der Streicher, die Schoenberg als 'Klangfarbenmelodie' theoretisierte",
        answerC = "Das Wechseln der Orchestration an jedem Phrasenende, um harmonische Klauseln klanglich zu markieren",
        answerD = "Eine Zwoeflton-Reihe, bei der jede Note einem anderen Instrument zugeteilt wird, um die Reihe klanglich unsichtbar zu machen",
        correctAnswer = 0,
        explanation = "Schoenberg pragte den Begriff 'Klangfarbenmelodie' in seiner Harmonielehre (1911); Webern realisierte das Konzept besonders subtil in seiner Orchestrierung von Bachs Fuge (Ricercare) aus dem Musikalischen Opfer (1935): Einzelne Noten der polyphonen Linien werden zwischen verschiedenen Orchesterinstrumenten aufgeteilt, sodass der Farbwechsel selbst melodische Bedeutung bekommt.",
        difficulty = 5,
        funFact = "Weberns Orchestrierung ist so diskret, dass selbst geuebt Hoerer kaum einzelne Instrumente identifizieren koennen — die Klangfarbe verschmilzt zu einem Ganzen, das die barocke Polyphonie in ein impressionistisches Schimmern verwandelt."
    ),

    // Q18
    Question(
        categoryId = 5,
        questionText = "Welche Besonderheit hat das 'Krebsquartett' (auch 'Menuett al Rovescio') in Haydns Sonate fuer Klavier Hob. XVI/26 oder in der Symphonie Nr. 47?",
        answerA = "Das Menuett kann von hinten nach vorne gespielt werden (retrograde) und ergibt dasselbe Menuett — ein palindromer Satz",
        answerB = "Das Menuett wird mit einem Kanon im Krebsgang (retrograde Imitation) zwischen Sopran und Bass begleitet",
        answerC = "Haydn schrieb das Stueck gleichzeitig vorwaerts (Viola) und rueckwaerts (Violine) spielbar, sodass beide Stimmen unisono klingen",
        answerD = "Die erste Haelfte des Menuetts wird in der zweiten Haelfte transponiert und invertiert wiederholt",
        correctAnswer = 0,
        explanation = "Das 'Menuett al Rovescio' in Haydns Symphonie Nr. 47 (1772) ist ein perfektes Palindrom: Die erste Haelfte des Menuetts kann von der letzten Note an rueckwaerts gespielt werden und ergibt exakt dieselbe Musik. Es ist eine handwerklich brillante Demonstrationsaufgabe, bei der Haydn rhythmische und harmonische Symmetrie perfekt vereint.",
        difficulty = 5,
        funFact = "Haydn stellte aehnliche Palindrom-Stuecke auch fuer Klavier und Kammermusik her. Die palindrome Technik war im 18. Jh. bekannt als 'per recte et retro' — Musik die vorwaerts und rueckwaerts gespielt das Gleiche ergibt."
    ),

    // Q19
    Question(
        categoryId = 5,
        questionText = "Was bezeichnet 'Heterophonie' als Kompositionsprinzip, und in welcher Musikkultur ist sie am ausgepraegsten verankert?",
        answerA = "Die gleichzeitige Auffuehrung derselben Melodie in verschiedenen leicht variierten Versionen ohne festgelegte Stimmenfuehrungsregeln — charakteristisch fuer ostasiatische und nahostoestliche Ensembles",
        answerB = "Die Verdoppelung einer Melodiestimme in der Oktave durch ein zweites Instrument, ein Grundprinzip der Organum-Technik des Mittelalters",
        answerC = "Die simultane Auffuehrung zweier unabhaengiger Melodien in verschiedenen Tonarten — typisch fuer polyphone Volksmusik Westafrikas",
        answerD = "Improvisierte Gegenstimmen zu einem fixen cantus firmus, wie im Jazz und Blues ueblich",
        correctAnswer = 0,
        explanation = "Heterophonie bezeichnet das simultane Klingen variierter Versionen derselben Melodielinie, ohne dass die Unterschiede nach strikten Kontrapunktregeln geordnet sind. Sie ist zentral in gamelan (Indonesien), chinesischer Ensemblemusik, arabischer Maqam-Praxis und griechischer Volksmusik. Im Westen wurde sie als Analysekategorie erst durch Ethnomusikologen beschrieben.",
        difficulty = 5,
        funFact = "Ligeti studierte die Heterophonie indonesischer Gamelan-Ensembles intensiv und liess sich davon fuer seine spaete Klavieretuden-Technik inspirieren — er wollte den Eindruck erzeugen, mehrere unabhaengige Schichten liefen gleichzeitig."
    ),

    // Q20
    Question(
        categoryId = 5,
        questionText = "Was versteht man unter 'Fauxbourdon' in der europaeischen Polyphonie des 15. Jahrhunderts und wie unterscheidet er sich von 'falsobordone'?",
        answerA = "Fauxbourdon ist eine dreistimmige Technik mit parallelen Sexten und Quarten (englischer Ursprung, kontinentale Adaptation); Falsobordone ist eine spaetere Form des akkordischen Psalmengesangs in homophonen Akkordfolgen",
        answerB = "Fauxbourdon und Falsobordone sind synonyme Begriffe fuer dieselbe Technik der Organum-Dupel-Auffuehrung im 14. und 15. Jahrhundert",
        answerC = "Fauxbourdon bezeichnet parallele Quinten (verbotene Organum-Formel); Falsobordone die erlaubte Terz-/Sext-Variante",
        answerD = "Fauxbourdon ist die englische Form (Discant-Style) des 14. Jh.; Falsobordone die venezianische Psalmodie des 16. Jh. — beide ohne Verbindung",
        correctAnswer = 0,
        explanation = "Fauxbourdon (Dufay, fruehes 15. Jh.) ist eine dreistimmige Technik: der Diskant fuehrt die Melodie, der Tenor eine Sexte tiefer, der Contratenor eine Quarte unter dem Diskant (oft improvisiert, deshalb 'faux' = ungeschrieben). Falsobordone (spaetes 16. Jh., Viola et al.) ist das akkordische Rezitieren von Psalmversen ueber homophone Akkordblocks — ein spaeterer Nachfolger.",
        difficulty = 5,
        funFact = "Der Begriff 'Fauxbourdon' ist bis heute etymologisch umstritten: 'faux bourdon' koennte 'false bass' bedeuten — weil der Bass nicht notiert, sondern improvisiert wurde. Manche Forscher sehen hier einen englischen Einfluss vom 'faburden' des 14. Jahrhunderts."
    ),

    // ── Aufnahmetechnik-Geschichte (8) ──────────────────────────────────────

    // Q21
    Question(
        categoryId = 5,
        questionText = "Welches Aufnahmeprinzip verwendete das fruehe Edison-Phonographen-System (1877), und worin lag die erste entscheidende Verbesserung durch Emile Berliner?",
        answerA = "Edison gravierte Schallwellen vertikal in Zinnfolie auf einem Zylinder (hill-and-dale); Berliner entwickelte die flache Scheibe (Gramophon) mit seitlicher Rillenschrift",
        answerB = "Edison verwendete magnetische Aufzeichnung auf einem Stahldraht; Berliner verbesserte dies mit einer Kupferdrahtspule",
        answerC = "Edison nutzte Tintenspuren auf Papierband; Berliner ersetzte Papier durch Schellackscheibe",
        answerD = "Beide verwendeten Zylinderaufzeichnung; Berliner verbesserte nur die Abspielnadel aus Saphir statt Stahl",
        correctAnswer = 0,
        explanation = "Edisons Phonograph (1877) grub die Schallwellen vertikal in Zinnfolie (spaeter Wachszylinder) — sogenannte 'hill and dale'-Schrift. Berliner erfand 1887 das Grammophon: Er gravierte seitlich in eine flache Schellackscheibe (lateral cut). Die flache Scheibe liess sich leichter massenreprodzieren durch Pressen — ein entscheidender kommerzieller Vorteil.",
        difficulty = 5,
        funFact = "Berliners Patent fuer das Grammophon fuehrte zu einem jahrzehntelangen Patentstreit in den USA. Seine Erfindung legte den Grundstein fuer die gesamte Schallplattenindustrie — und das Nipper-Hund-Logo ('His Master's Voice') wurde zum bekanntesten Markenzeichen der Musikindustrie."
    ),

    // Q22
    Question(
        categoryId = 5,
        questionText = "Was war der entscheidende klangtechnische Fortschritt der Magnetbandaufnahme gegenueber Direktschnitt-Lackfolienaufnahmen fuer Rundfunk und Tonstudio ab den 1940er Jahren?",
        answerA = "Schnittmoeglichkeit (Editing), hoeherer Frequenzumfang und laengere Aufnahmedauer ohne Unterbrechung — und die Moeglichkeit, Aufnahmen zu loeschen und wiederzuverwenden",
        answerB = "Hoehere Lautstaerke und klarerer Bassbereich durch die magnetische Aufzeichnungsphysik",
        answerC = "Erstmals moegliche Stereo-Aufzeichnung, die mit Lackfolien grundsaetzlich nicht realisierbar war",
        answerD = "Absolute Stoerungsfreiheit ohne Grundrauschen, da das Magnetband kein mechanisches Abtasten erforderte",
        correctAnswer = 0,
        explanation = "Magnetband (AEG Magnetophon, 1930er; entscheidender Durchbruch 1940er) erlaubte erstmals nicht-lineares Editing (schneiden, kleben), viel laengere Aufnahmen, Wiederverwendbarkeit und einen breiteren Frequenzgang. Die Moeglichkeit des Edits revolutionierte die Studiopraxis: Interpreten konnten die besten Takes zusammenmontieren; Produzenten konnten Fehler nachtraeglich korrigieren.",
        difficulty = 5,
        funFact = "Glenn Gould nutzte das Magnetband-Editing exzessiv: Er weigerte sich ab 1964, live aufzutreten, und produzierte im Studio Aufnahmen, die aus Hunderten einzelner Takes zusammengesetzt waren. Er sah das als 'ideale Aufnahme' — kein Konzertpublikum koennte das ersetzen."
    ),

    // Q23
    Question(
        categoryId = 5,
        questionText = "Was ist das 'Haas-Effekt' (Praezedenz-Effekt) und wie wird er in der Tonstudio-Praxis bewusst eingesetzt?",
        answerA = "Der Hörer lokalisiert eine Schallquelle nach der zuerst eintreffenden Schallwelle; im Studio nutzt man verzoegertes Duplikat-Signal, um Stereobreite oder Raeumlickeit zu erzeugen ohne wahrnehmbare Dopplung",
        answerB = "Tiefe Frequenzen unter 100 Hz werden bei hoher Lautstaerke als staerker wahrgenommen; Studio-Engineers drehen daher bei lautem Abhoeren den Bass zurueck",
        answerC = "Eine Verzoegerung von exakt 20 ms verursacht maximale Raumtiefe-Wahrnehmung; dies wird bei Halleinheiten als Standardverzoegerung eingestellt",
        answerD = "Der Effekt, bei dem Schall von einer harten Wand 50 ms spaeter zurueckkommt und als Hallfahne wahrgenommen wird — Grundlage des Plattenhalls",
        correctAnswer = 0,
        explanation = "Der Haas-Effekt (1949 von Helmut Haas beschrieben) besagt: Wenn zwei identische Signale mit einem Abstand von 1-40 ms eintreffen, lokalisiert das Gehoer die Quelle nur nach dem ersten Signal — das zweite fusioniert unhoeebar. Im Studio: Ein verzoeuertes (5-40 ms) Echo desselben Signals wird auf die Gegenseite (L/R) gelegt, was Stereobreite ohne hoerbare Dopplung erzeugt.",
        difficulty = 5,
        funFact = "Der Haas-Effekt hat direkte Konsequenzen fuer Live-Beschallung: Wenn Delay-Boxen im Konzertsaal nicht korrekt verzoegert werden, klingt der Ton von der entfernten Box spaeter und zerstoert die Lokalisation. Professionelle PA-Systeme verzoegern entfernte Boxen deshalb um die Laufzeit-Differenz."
    ),

    // Q24
    Question(
        categoryId = 5,
        questionText = "Was ist 'Dolby A' und wie unterscheidet es sich grundlegend von 'Dolby B', das fuer den Konsumenten-Kassettenmarkt entwickelt wurde?",
        answerA = "Dolby A ist ein professionelles Vierband-Rauschunterdruckungssystem fuer Studio-Magnetband; Dolby B ist ein vereinfachtes Einband-Hochfrequenz-System fuer Cassetten, das nur hohe Frequenzen anhebt/absenkt",
        answerB = "Dolby A nutzt digitale Rauschunterdruckung (ADC/DAC); Dolby B ist komplett analog; beide reduzieren Bandrauschen um denselben Faktor",
        answerC = "Dolby A ist fuer 15 ips-Bandmaschinen, Dolby B fuer 7,5 ips — die Gewindgeschwindigkeit bestimmt welches System verwendet wird",
        answerD = "Dolby A wurde fuer Kinos entwickelt (Mehrkanalton); Dolby B ist eine spaetere Konsumenten-Adaption desselben Prinzips ohne Wesentliche Aenderungen",
        correctAnswer = 0,
        explanation = "Dolby A (1965) ist ein professionelles Kompander-System, das das Audio-Spektrum in vier Baender teilt und jedes Band unabhaengig komprimiert (beim Aufnehmen) und expandiert (beim Abspielen) — typische Rauschreduzierung: 10 dB. Dolby B (1968, fuer Cassetten) vereinfachte dies auf ein breites Hochfrequenzband, das bei leisen Signalen angehoben wird — typische Rauschreduzierung: ~10 dB im HF-Bereich.",
        difficulty = 5,
        funFact = "Ray Dolby gruendete Dolby Laboratories 1965 in London mit Fokus auf Profis; erst das Partnership mit Philips fuer die Compact Cassette (1968) machte Dolby B zum Massenprodukt. Ohne Dolby B haette die Cassette kaum den Hi-Fi-Anspruch erfuellt, der sie zum Kassettenboom der 1970er/80er fuehrte."
    ),

    // Q25
    Question(
        categoryId = 5,
        questionText = "Welches Aufnahmeprinzip verwendete das fruehe elektrische Mikrofonverfahren in Tonstudios ab ca. 1925, und welcher entscheidende Vorteil gegenueber dem akustischen Trichterverfahren entstand dadurch?",
        answerA = "Kondensator- und Dynamikmikrofone wandelten Schall in elektrische Signale um, die verstaerkt wurden; dies ermoeglichte erstmals den Einsatz ganzer Orchester, natuerliche Dynamikaufnahme und raeumliche Positionierung der Instrumente",
        answerB = "Das elektrische Verfahren ersetzte das Wachsmaster durch Stahldraht als Medium; der Vorteil war ausschliesslich hoehere Haltbarkeit der Aufnahme",
        answerC = "Elektrische Mikrofone erlaubten erstmals Stereoaufnahme; dies war der Hauptvorteil gegenueber dem Monoakustikhorn",
        answerD = "Das Western Electric Verfahren von 1925 verbesserte nur den Frequenzgang im Bassbereich; Hoehen waren nach wie vor beschnitten",
        correctAnswer = 0,
        explanation = "Das Western Electric 'Orthophonic Recording'-Verfahren (1925) ersetzte das akustische Horn durch Mikrofon und Roehrenstarkverstaerker. Nun konnten Instrumente weiter vom Mikrofon entfernt sein, volle Orchesterstaerke aufgenommen werden, und der Frequenzgang erweiterte sich erheblich. Erstmals waren natuerliche dynamische Abstufungen moeglich statt des komprimierten Hornklangs.",
        difficulty = 5,
        funFact = "Die erste elektrisch aufgenommene Schallplatte (Victor, 1925) enthielt Enrico Carusos Stimme. Der Unterschied zu akustischen Aufnahmen war so dramatisch, dass Kritiker zunachst zweifeln, ob es sich um eine echte Aufnahme handele."
    ),

    // Q26
    Question(
        categoryId = 5,
        questionText = "Was ist 'Binaural-Recording' und worin unterscheidet es sich grundlegend von konventionellem Stereo?",
        answerA = "Binaurale Aufnahme verwendet zwei Mikrofone in einem kunstlichen Kopf (HRTF-Modell), das die interaurale Zeitdifferenz und Pegelunterschiede des menschlichen Gehoers nachbildet — das Ergebnis klingt ueber Kopfhoerer dreidimensional wie echter Raumklang",
        answerB = "Binaural ist ein anderer Name fuer echtes Stereo mit zwei Mikrofonen; der Begriff wird synonym verwendet",
        answerC = "Binaurale Aufnahme nutzt zwei Mikrofone in 90-Grad-Abstand (X-Y-Technik) gegenueber den 110 Grad des normalen Stereos",
        answerD = "Binaural bezeichnet 5.1-Surround-Aufnahmen, die auf zwei Kanaele heruntergemischt werden, um Raumklang-Illusion zu erzeugen",
        correctAnswer = 0,
        explanation = "Binaurale Aufnahmen verwenden einen 'Kunstkopf' mit Mikrofonen an den Ohrpositionen, der die Head-Related Transfer Function (HRTF) des menschlichen Schadels nachbildet. Interaurale Zeit- und Pegeldifferenzen entstehen wie beim echten Raumhoeren. Ueber Kopfhoerer (kein Lautsprecher) entsteht eine ueberzeugende 3D-Raumillusion — bei Lautsprecherwiedergabe bricht die Illusion zusammen.",
        difficulty = 5,
        funFact = "Die Neumann KU 100 'Fritz' ist der bekannteste Kunstkopf; er kostet mehrere tausend Euro. ASMR-Videos auf YouTube nutzen oft binaurale Mikrofone, haben aber die audiophile Tradition von Kunstkopf-Konzertaufnahmen popularisiert."
    ),

    // Q27
    Question(
        categoryId = 5,
        questionText = "Was ist 'Impulse Response' (IR) und wie wird sie in modernen Software-Reverb-Einheiten ('Convolution Reverb') genutzt?",
        answerA = "Ein kurzer Starter-Impuls (Knall oder Sinus-Sweep) wird im echten Raum aufgenommen; die Raumcharakteristik (IR) wird digitalisiert und per Faltung (Convolution) mathematisch auf beliebige Audiosignale angewendet",
        answerB = "IR ist die Messung der Richtungscharakteristik eines Mikrofons; sie wird genutzt, um Aufnahmen nachtraeglich zu korrigieren",
        answerC = "Impulse Response ist ein Syntheseparameter fuer physikalische Modellierung von Blas- und Streichinstrumenten",
        answerD = "IR bezeichnet den Verzoegerungstime einer digitalen Echo-Einheit in Millisekunden; Convolution Reverb nutzt mehrere IRs fuer unterschiedliche Raumgrossen",
        correctAnswer = 0,
        explanation = "Fuer Convolution Reverb misst man die Impulsantwort eines realen Raums: Ein Starter-Impuls (pistol shot, Sinus-Sweep) wird aufgenommen; das Ergebnis codiert alle Reflexionen, Diffusion und Nachhall des Raums. Wird ein beliebiges Audiosignal mathematisch mit dieser IR 'gefaltet' (convolution), klingt es als waere es in genau diesem Raum aufgenommen worden.",
        difficulty = 5,
        funFact = "Einige Studios messen IRs beruehmter Konzertsaele (Carnegie Hall, Elbphilharmonie) und verkaufen sie als Plugin-Pakete. So kann eine Heimstudio-Aufnahme klanglich in der Elbphilharmonie 'stattfinden' — ein erstaunlicher Beweis, wie viel Klanginformation eine kurze Impulsantwort enthaelt."
    ),

    // Q28
    Question(
        categoryId = 5,
        questionText = "Was ist der 'Fletcher-Munson'-Effekt und welche praktische Konsequenz hat er fuer das Mixing in Tonstudios?",
        answerA = "Das menschliche Gehoer ist bei niedrigen Abhoerlautstaerken weniger empfindlich fuer Bass und Hoehen; daher klingen Mixes, die bei grosser Lautstaerke abgemischt werden, bei normalem Hoerpegel bass- und hoehenschwach",
        answerB = "Bei sehr hohen Frequenzen ueber 15 kHz verliert das menschliche Gehoer sukzessive Empfindlichkeit ab dem 25. Lebensjahr; Studio-Engineers muessen dies bei der Mastering-Entzerrung kompensieren",
        answerC = "Der Effekt beschreibt die maximale Schalltoleranzschwelle des Gehoers bei 3-4 kHz; daher ist in diesem Bereich besondere Vorsicht beim Mixen geboten",
        answerD = "Fletcher-Munson bezeichnet den subjektiven Lautstaerkeunterschied zwischen 20 Hz und 20 kHz bei konstantem Schalldruck — relevant nur fuer Lautsprecherkonstrukteure",
        correctAnswer = 0,
        explanation = "Fletcher und Munson (1933) definierten die Equal Loudness Contours: Bei niedrigem Schallpegel wirkt das menschliche Gehoer weniger empfindlich fuer tiefe und sehr hohe Frequenzen. Folge fuer Studios: Mische, die laut abgehoert werden, klingen bei normalem Pegel bassarm und hoehenschwach. Profis mischen oft bei moderaten Pegeln (ca. 79 dB SPL) und pruefen auf kleinen Monitoren.",
        difficulty = 5,
        funFact = "Viele Verstaerker und Hi-Fi-Anlagen haben einen 'Loudness'-Schalter, der bei leisen Pegeln Bass und Hoehen anhebt — das ist eine direkte Applikation der Fletcher-Munson-Kurven fuer den Konsumenten."
    ),

    // ── Musikgeschichte-Raritaeten (8) ──────────────────────────────────────

    // Q29
    Question(
        categoryId = 5,
        questionText = "Welches Werk Ludwig van Beethovens wurde erst 138 Jahre nach seiner Komposition erstmals vollstaendig aufgefuehrt und liegt als Fragment vor?",
        answerA = "Grosse Fuge op. 133 in einer Fassung fuer Streichorchester",
        answerB = "Die 10. Symphonie, die als Skizzen-Fragment nach Beethovens Tod vorlag und erst 1988 von Barry Cooper rekonstruiert und aufgefuehrt wurde",
        answerC = "Das Streichquintett C-Dur op. 29, das zu Lebzeiten nie offentlich gespielt wurde",
        answerD = "Die Kantate 'Cantata on the Death of Emperor Joseph II' WoO 87, die erst 1884 uraufgefuehrt wurde",
        correctAnswer = 3,
        explanation = "Beethovens Kantate 'Kantate auf den Tod Kaiser Josephs II.' (WoO 87, 1790) blieb zu Lebzeiten unveraffentlicht und wurde erst am 12. Februar 1884 — 138 Jahre nach der Komposition und 57 Jahre nach Beethovens Tod — in Augsburg uraufgefuehrt. Brahms, der die Kantate in Wien wiederentdeckte, war so begeistert, dass er sie Liszt schickte.",
        difficulty = 5,
        funFact = "Brahms schrieb ueber diese Kantate, man erkenne darin 'den ganzen Beethoven' — alle spaetere Beethovensche Handschrift sei bereits enthalten. Es war eines der ersten grossen Orchesterwerke des jungen Beethoven, damals gerade 19 Jahre alt."
    ),

    // Q30
    Question(
        categoryId = 5,
        questionText = "Welches bahnbrechende Werk von Charles Ives wurde 1908-1910 komponiert, galt als unaufgefuehrt bis 1951 und kombiniert vier Orchester in verschiedenen Tonarten simultan?",
        answerA = "The Unanswered Question (fuer Streicher, Floten und Trompete)",
        answerB = "Central Park in the Dark (fuer grosses Orchester und Streichorchester)",
        answerC = "Universe Symphony (fragmentarisch, postum erganzt)",
        answerD = "The Fourth Symphony (Sinfonie Nr. 4, mit zwei vollstaendigen Orchestern)",
        correctAnswer = 3,
        explanation = "Ives' Symphonie Nr. 4 (1909-1916) verlangt zwei Orchester, ein kleines Ensemble und einen Fernchoral — sie erklingen gleichzeitig in unterschiedlichen Tempi und Tonarten und repraesentieren verschiedene Realitaetsebenen. Die Uraufgabe der vollstaendigen Symphonie fand erst 1965 statt, unter Leopold Stokowski — fast 50 Jahre nach Vollendung.",
        difficulty = 5,
        funFact = "Ives war hauptberuflich Versicherungsmanager und komponierte in seiner Freizeit. Er wurde erst im hohen Alter — hauptsaechlich durch Aaron Coplands Fuersprache — als bedeutender Komponist anerkannt. 1947 erhielt er den Pulitzer Prize fuer seine 3. Symphonie."
    ),

    // Q31
    Question(
        categoryId = 5,
        questionText = "Welches Instrument spielte der Komponist und Virtuose Nicolo Paganini auf seiner beruhmten 'il Cannone'-Geige und was war das Besondere an seinen Saiten-Einstellungen?",
        answerA = "Paganini spielte eine Guarneri del Gesu von 1743; er stimmte oft alle vier Saiten einen Halbton hoeher (Skordatur) um brillanteren Klang und einfachere Griffbilder zu erzielen",
        answerB = "Er spielte eine Stradivarius 'Firebird' (1715) und stimmte die G-Saite um eine grosse Terz hoeher um einzigartige Harmonikeffekte zu erzeugen",
        answerC = "Paganini spielte ausschliesslich auf Darmsaiten und entwickelte eine spezielle Rosshaarstarkung fuer den Bogen, um Flageoletts leichter spielen zu koennen",
        answerD = "Er stimmte nur die A-Saite um einen Halbton tiefer (Scordatura) und kombinierte dies mit einer extrem niedrigen Saitenhoehe fuer maximale Spielgeschwindigkeit",
        correctAnswer = 0,
        explanation = "Paganinis beruhmteste Violine 'il Cannone' ('die Kanone') ist eine Guarneri del Gesu aus dem Jahr 1743. Paganini stimmte die gesamte Geige tatsaechlich gelegentlich um einen Halbton hoeher (Scordatura nach oben), was den Klang brillanter und schmetternder machte — und gleichzeitig Doppelgriffe erleichterte.",
        difficulty = 5,
        funFact = "Paganini vermachte 'il Cannone' der Stadt Genua mit der Bedingung, dass die Geige nie das Land verlassen darf. Die Stadt Genua bewahrt sie bis heute; das Instrument wird einmal jaehrlich von einem Spitzenviolinisten gespielt — beim Paganini-Wettbewerb."
    ),

    // Q32
    Question(
        categoryId = 5,
        questionText = "Welches Werk des Komponisten Rameau loeste 1752 in Frankreich den sogenannten 'Querelle des Bouffons' aus, und was war der Kernstreit?",
        answerA = "Rameaus 'Hippolyte et Aricie' (1733) stand im Mittelpunkt des Streits zwischen franzoesischer Hofoper und dem neuen italienischen Opera-Buffa-Stil in Frankreich",
        answerB = "Die Auffuehrung von Pergolesis 'La serva padrona' loeste den Streit aus; der Kernkonflikt war: ernste franzoesische Tragédie lyrique (Rameau) versus leichte, gesanglich betonte Opera Buffa (Pergolesi)",
        answerC = "Rameaus 'Les Indes galantes' provozierte Rousseau zu seiner 'Lettre sur la musique francaise', was den Krieg zwischen Hofmusik und philosophischer Aufklarung ausloeste",
        answerD = "Glucks 'Orfeo ed Euridice' (1762) war der Ausloser; der Streit betraf die Frage ob Oper gesanglich oder dramatisch primaer sein sollte",
        correctAnswer = 1,
        explanation = "Der 'Querelle des Bouffons' (1752-54) begann mit Auffuehrungen von Pergolesis 'La serva padrona' in Paris. Philosophen wie Rousseau und Grimm verteidigten die natuerliche Melodik der Opera Buffa gegen die artifizielle Komplexitaet der franzoesischen Tragédie lyrique Rameaus. Rousseaus 'Lettre sur la musique francaise' (1753) war der philosophische Hohepunkt.",
        difficulty = 5,
        funFact = "Rousseau war nicht nur Philosoph, sondern auch Komponist — er schrieb die Opera 'Le devin du village' (1752), die er als Beweis fur die Ueberlegenheit des einfachen Melodiestils sah. Marie-Antoinette liess das Stueck jahrzehnte spaeter in Versailles auffuehren."
    ),

    // Q33
    Question(
        categoryId = 5,
        questionText = "Wer war 'Hieronymus de Moravia' und welchen historisch einzigartigen Beitrag leistete er zur Musiktheorie des 13. Jahrhunderts?",
        answerA = "Ein Dominikanermonch der eine der ausfuehrlichsten Abhandlungen ueber Modale Rhythmik und Streichinstrument-Stimmung des Mittelalters ('Tractatus de Musica') verfasste",
        answerB = "Ein Organist des Pariser Notre-Dame, der als erster die sechs Modi der Notre-Dame-Schule in einem Lehrbuch systematisierte",
        answerC = "Ein flandrischer Theoretiker, der erstmals die Mensuralnation (Notenschrift mit definierten Dauern) beschrieb und normierte",
        answerD = "Ein englischer Moensch, der den Begriff 'Kontrapunkt' pragte und die ersten Regeln fuer Mehrstimmigkeit niederschrieb",
        correctAnswer = 0,
        explanation = "Hieronymus de Moravia (aktiv ca. 1250-1280 in Paris) verfasste den 'Tractatus de Musica', eine umfangreiche Enzyklopaedie, die u.a. detaillierte Stimmvorschriften fuer Fidel (Vielle) und Rubeba enthalt — die einzige erhaltene mittelalterliche Quelle zu Geigen-Stimmungen. Er beschreibt auch Modalrhythmik und Notre-Dame-Polyphonie.",
        difficulty = 5,
        funFact = "Hieronymus gibt drei alternative Stimmungen fuer die mittelalterliche Vielle an — was Musikwissenschaftlern zeigt, dass es damals keine Standardstimmung gab. Rekonstruktionsensembles fuer mittelalterliche Musik streiten bis heute, welche Stimmung 'authentisch' ist."
    ),

    // Q34
    Question(
        categoryId = 5,
        questionText = "Was war das 'Gesamtkunstwerk' im Sinne Richard Wagners und in welchem theoretischen Text formulierte er diesen Begriff?",
        answerA = "Die totale Vereinigung von Musik, Dichtung, bildender Kunst, Tanz und Schauspiel in einem einheitlichen Kunstwerk — formuliert in 'Das Kunstwerk der Zukunft' (1849) und 'Oper und Drama' (1851)",
        answerB = "Wagners Konzept fuer eine neue Notationsform, die alle musikalischen Parameter (Ton, Dynamics, Tempo) in einem einzigen Zeichen vereinen sollte",
        answerC = "Die Idee eines permanenten Festivals, bei dem alle vier Ring-Opern an einem Ort (Bayreuth) als unveraenderliche Einheit aufgefuehrt werden — formuliert im 'Ring des Nibelungen'-Vorwort",
        answerD = "Das Konzept des Leitmotivs als musikalisches 'Gesamtkunstwerk' — beschrieben in Wagners Autobiographie 'Mein Leben'",
        correctAnswer = 0,
        explanation = "Wagner formulierte das 'Gesamtkunstwerk' (auch 'Kunstwerk der Zukunft') hauptsaechlich in seinen Zuericher Schriften 1849-51: 'Das Kunstwerk der Zukunft' und 'Oper und Drama'. Er propagierte die Synthese aller Kuenste — Musik, Poesie, Tanz, Architektur, Malerei — als ueberwunden geglaubte Trennung der modernen Gesellschaft.",
        difficulty = 5,
        funFact = "Das Bayreuther Festspielhaus, das Wagner mit Koenig Ludwig II. von Bayern finanzieren liess und 1876 eröffnete, war als physische Realisierung des Gesamtkunstwerk-Konzepts gedacht. Die versenkten Orchester-Graben und das abgedunkelte Auditorium waren unerhörte Neuerungen."
    ),

    // Q35
    Question(
        categoryId = 5,
        questionText = "Welcher Komponist schrieb die 'Sinfonia concertante fuer Oboe, Klarinette, Horn und Fagott' KV 297b und was ist der besondere Umstand ihrer Ueberlieferung?",
        answerA = "Mozart schrieb sie 1778 in Paris; das Autograph ist verschollen und nur eine spaetere, moeglicherweise nicht authentische Abschrift ist erhalten — Echtheit und Besetzung sind umstritten",
        answerB = "Haydn schrieb sie als Auftragswerk fuer das Concert spirituel; das Autograph ist vollstaendig im Haydnhaus Wien erhalten",
        answerC = "Mozart schrieb sie fuer das Mannheimer Orchester; die Originalpartitur wurde im Zweiten Weltkrieg zerstoert und spaeter aus Orchesterstimmen rekonstruiert",
        answerD = "Das Werk stammt von Michael Haydn, nicht Wolfgang; es wurde Jahrzehnte faelschlicherweise Mozart zugeschrieben bis die Autographanalyse den Irrtum aufdeckte",
        correctAnswer = 0,
        explanation = "Mozarts 'Sinfonia concertante' KV 297b ist eines der raetselhaftesten Werke des Mozartean: Das Autograph ist verloren; nur eine spaete Abschrift in Es-Dur (mit Floetenklarinette statt Oboe als einer der Solostimmen) ist erhalten. Ob es sich um eine Kopistenfaelschung, eine Bearbeitung oder das echte Werk handelt, ist bis heute unter Musikwissenschaftlern umstritten.",
        difficulty = 5,
        funFact = "Mozart erwahnt in einem Brief an seinen Vater, er habe in Paris vier Solostimmen fuer eine Sinfonia Concertante geschrieben, die der Konzertveranstalter dann 'verschwinden liess' — moeglicherweise gestohlen, um Konkurrenz zu verhindern. Das Raetsel um KV 297b haelt bis heute an."
    ),

    // Q36
    Question(
        categoryId = 5,
        questionText = "Was war die 'Camerata de' Bardi' in Florenz um 1580 und welche bahnbrechende Gattung entstand aus ihren Sitzungen?",
        answerA = "Ein Zirkel von Gelehrten, Dichtern und Musikern um Giovanni de' Bardi, der das Rezitativ und damit die Oper als Gattung erfand, um griechisches Drama mit Musik zu rekonstruieren",
        answerB = "Eine Akademie fuer Madrigalkomposition unter Leitung von Vincenzo Galilei, aus der die mehrstimmige Canzonetta des fruehen Barock entstand",
        answerC = "Ein Kreis von Instrumentalisten, der erstmals weltliche Kammermusik (Sonata da camera) ohne Vokalstimmen als eigenstaendige Gattung etablierte",
        answerD = "Ein Gelehrtenkreis, der die Monodie (einstimmiges Lied mit Basso continuo) als Gegenmodell zur Polyphonie entwickelte, was zur Canzonetta da camera fuehrte",
        correctAnswer = 0,
        explanation = "Die Florentiner Camerata (ca. 1573-1587) — Mitglieder: Giovanni de' Bardi, Vincenzo Galilei, Giulio Caccini, Jacopo Peri — wollte das antike griechische Drama wiederherstellen, das sie als gesungen imaginierte. Sie entwickelten das Stile Recitativo (Rezitativ): melodisierte Sprache mit Basso continuo. Das Ergebnis: 'Dafne' (Peri, 1598, verschollen) und 'Euridice' (1600) — die ersten erhaltenen Opern.",
        difficulty = 5,
        funFact = "Vincenzo Galilei, Mitglied der Camerata und Vater des Astronomen Galileo Galilei, schrieb den einflussreichen 'Dialogo della musica antica e moderna' (1581), in dem er die kontrapunktische Polyphonie zugunsten expressiver Einstimmigkeit angriff."
    ),

    // ── Opern / Orchestermusik (7) ───────────────────────────────────────────

    // Q37
    Question(
        categoryId = 5,
        questionText = "Welche musikalische Technik verwendet Richard Strauss in der Tondichtung 'Till Eulenspiegels lustige Streiche' (1895) als Leitmotiv-Charakterisierung und welche Besetzung ist ungewoehnlich?",
        answerA = "Das Till-Motiv tritt in zwei Versionen auf: ein Horn-Motiv (verspielt) und ein Klarinetten-Motiv (frechdreist); das Stueck ist fuer grosses Orchester mit Kleiner Sexte-Erweiterung im Hornregister geschrieben",
        answerB = "Strauss setzt ein seltenes Sopran-Solo ohne Text als 'Stimme des Gewissens' ein, die Till durch alle Abenteuer begleitet",
        answerC = "Das Stueck verwendet ein Dodekaphon-Fragment als Leitmotiv fuer Tills Hinrichtung — ein fruehes Beispiel serieller Technik in der Tondichtung",
        answerD = "Strauss schrieb das Stueck als Rondo (A-B-A-C-A-B-A) und bezeichnet es in der Partitur als 'Rondeau in alter Schelmenweise' — die Rondo-Form ist das strukturierende Prinzip",
        correctAnswer = 3,
        explanation = "Strauss bezeichnete 'Till Eulenspiegel' in der Partitur explizit als 'Rondeau in alter Schelmenweise' — die Rondo-Form mit Tills immer wiederkehrendem Thema nach jedem Abenteuer ist das tragende Strukturprinzip. Das Hauptmotiv (Horn) kehrt in verschiedenen Verkleidungen wieder, genau wie Till selbst immer neue Gestalten annimmt.",
        difficulty = 5,
        funFact = "Strauss weigerte sich anfangs, ein Programm zu 'Till Eulenspiegel' zu veroeffentlichen und liess nur 'Rondeau in alter Schelmenweise' gelten. Er wollte, dass Zuhoerer die Musik ohne Literatur-Kruecken erleben — obwohl er bei der Komposition ein genaues Programm im Kopf hatte."
    ),

    // Q38
    Question(
        categoryId = 5,
        questionText = "Welche Opern-Urauffuehrung scheiterte 1875 in Paris so katastrophal, dass der Komponist kurz danach starb — und welche Ironie liegt in der Nachgeschichte?",
        answerA = "Georges Bizets 'Carmen' wurde von der Pariser Presse zerrissen und vom Publikum skandalos aufgenommen; Bizet starb drei Monate spaeter; die Oper wurde danach zum groessten Opern-Welterfolg des 19. Jahrhunderts",
        answerB = "Verdis 'Aida' scheiterte bei der Urauffuehrung an der Opera comique Paris; Verdi zog sie zurueck und starb verbittert; spaeter wurde sie nach seiner Revision der groesste Erfolg seiner Karriere",
        answerC = "Offenbachs 'Les Contes d'Hoffmann' wurde 1881 uraufgefuehrt; Offenbach starb vor der Urauffuehrung; die Oper musste posthum fertiggestellt werden und wurde sein groesster Erfolg",
        answerD = "Wagners 'Tannhaeuser' scheiterte 1861 in Paris nach drei Auffuehrungen; Wagner floh beschaemt aus der Stadt und verwarf die Oper jahrelang",
        correctAnswer = 0,
        explanation = "Bizets 'Carmen' (Uraufführung 3. März 1875 an der Opera-Comique Paris) wurde von der Pariser Kritik als 'unmoralisch' und 'musikalisch anspruchslos' zerrissen. Bizet starb am 3. Juni 1875 — keine drei Monate nach der Premiere — in der Ueberzeugung, gescheitert zu sein. Schon im selben Jahr wurde 'Carmen' in Wien ein Triumph; heute ist sie die meistgespielte Oper der Welt.",
        difficulty = 5,
        funFact = "Nietzsche liebte 'Carmen' als Gegengift zu Wagner — er schrieb, Bizet 'Mediterranisiere' die Musik, gebe ihr 'Leichtigkeit, Eleganz, Grazie'. Nietzsche hatte sich von seinem ehemaligen Idol Wagner losgesagt und verwendete 'Carmen' rhetorisch als Kontrastbeispiel."
    ),

    // Q39
    Question(
        categoryId = 5,
        questionText = "Was versteht man unter dem 'Sprechgesang' (auch 'Sprechstimme') wie ihn Schoenberg in 'Pierrot Lunaire' (1912) notierte, und was sind die exakten Auffuehrungsanweisungen?",
        answerA = "Der Saenger trifft die notierten Tonhoehen im Moment des Einsatzes, laesst sie aber sofort fallen oder steigen — kein gehaltener Gesangston, aber rhythmisch exakt nach Partitur",
        answerB = "Der Saenger spricht den Text frei im Sprechrhythmus; die notierten Tonhoehen sind nur annaehernd und koennen frei variiert werden",
        answerC = "Der Saenger wechselt taktweise zwischen normalem Gesang und offenem Sprechen ohne Tonhoehenbindung",
        answerD = "Sprechgesang bedeutet bei Schoenberg rhythmisch freies Sprechen mit dramatischer Uebertreibung der sprachlichen Melodiekurve — aehnlich dem Rezitativ",
        correctAnswer = 0,
        explanation = "In 'Pierrot Lunaire' notierte Schoenberg die Sprechstimme mit einem 'x' auf der Notenlinie. Seine Anweisung: Die notierten Tonhoehen werden im Einsatzmoment angestimmt, dann aber sofort durch Fallen oder Steigen verlassen — kein Vibrato, kein Halten wie beim Gesang. Rhythmus und Einsaetze sind exakt nach Partitur; die Tonhoehe ist ein Startpunkt, kein Ziel.",
        difficulty = 5,
        funFact = "Die Uraufgabe-Saengerin Albertine Zehme trug waehrend der Auffuehrung eine Pierrot-Kostuem und agierte theatralisch, waehrend Schoenberg das Ensemble von einem Sichtschutz aus dirigierte. Die Rezensenten wussten nicht, ob sie Skandal oder Genie vor sich hatten."
    ),

    // Q40
    Question(
        categoryId = 5,
        questionText = "Welches Orchesterwerk von Hector Berlioz gilt als erstes reines 'Programm-Orchester-Werk' der Musikgeschichte, und was ist die darin beschriebene idee fixe?",
        answerA = "Die Symphonie Fantastique (1830): Die 'idee fixe' ist ein wiederkehrendes Melodiemotiv, das die geliebte Frau symbolisiert und in allen fuenf Saetzen in veraenderter Gestalt erscheint",
        answerB = "Harold en Italie (1834): Die 'idee fixe' ist eine Viola-Melodie fuer den Protagonisten Harold, die er durch alle Landschaften traegt",
        answerC = "Romeo et Juliette (1839): Die 'idee fixe' ist das Liebesthema, das im vierten Satz (Liebesszene) seinen Hohepunkt findet",
        answerD = "Les Nuits d'ete (1840): Die 'idee fixe' ist ein Lied-Leitmotiv, das durch alle sechs Lieder als wiederkehrender Refrain zieht",
        correctAnswer = 0,
        explanation = "Berlioz' Symphonie Fantastique (1830) gilt als erstes programmatisches Orchesterwerk: Ein Kuenstler traumt von seiner Geliebten; die 'idee fixe' ist ein lyrisches Melodiethema (Holzblaeser/Streicher), das die Geliebte repraesentiert. Es erscheint in allen fuenf Saetzen — zuletzt als tanzender Hexenmarsch im fuenften Satz, als die Heldin zur Hexe wird.",
        difficulty = 5,
        funFact = "Berlioz war offen-autobiografisch: Die Geliebte der Symphonie war Harriet Smithson, eine irische Schauspielerin, die er vom Balkon aus bewunderte. Er heiratete sie 1833 — die Ehe scheiterte. Die Symphonie war also ein oeffentlicher Liebesbrief, den er schrieb, bevor er sie je persoenlich kannte."
    ),

    // Q41
    Question(
        categoryId = 5,
        questionText = "Was bezeichnet der Begriff 'Basso Continuo' im Barock und welche Instrumente bildeten typischerweise die Continuo-Gruppe?",
        answerA = "Eine durchgehende Bassstimme, die Harmonie-Ziffern (Generalbassbezifferung) traegt und von Cembalo, Orgel oder Laute plus Cello/Fagott realisiert wird",
        answerB = "Eine zusaetzliche Kontrabass-Stimme, die die Harmonie verdoppelt — typisch besetzt mit Kontrabass und Bassposaune",
        answerC = "Das vollstaendige Basso-Ostinato-Prinzip: eine wiederholte Basslinie als Grundlage fuer Variationen ueber unveraendertem Fundament",
        answerD = "Eine improvisierte Basslinie, die der Cellist aus dem harmonischen Kontext des Stueckes in Echtzeit ableitet, ohne Notierung",
        correctAnswer = 0,
        explanation = "Der Basso Continuo (ca. 1600-1750) ist eine bezifferte Bassstimme: Der Cembaloist/Organist/Lautenist liest die Ziffern und realisiert die Akkorde improvisiert; ein Bassinstrument (Cello, Violone, Fagott) verdoppelt die Basslinie. Die Generalbass-Praxis war das harmonische Rueckgrat des gesamten Barockzeitalters.",
        difficulty = 5,
        funFact = "Die Kunst, einen Generalbass korrekt und schoen zu realisieren, war im Barock eine Kernkompetenz jedes Berufs-musikers. J.S. Bach schrieb eigene Lehrtexte ueber Generalbassspiel; die vielen 6-4-Akkorde in barocker Bezifferung verwirren Studenten noch heute."
    ),

    // Q42
    Question(
        categoryId = 5,
        questionText = "Was ist 'Musikalisches Opfer' BWV 1079 von J.S. Bach (1747) und welchem Koenig wurde es gewidmet?",
        answerA = "Eine Sammlung von Fugen und Kanonikern ueber ein Thema, das Koenig Friedrich II. von Preussen Bach improvisatorisch vorgab — Bach sandte es als kunstvolles Opfer zurueck",
        answerB = "Eine Kantate fuer den saechsischen Kurfuersten Friedrich August I. als Dankesgeschenk fuer die Hofmusik-Anstellung in Dresden",
        answerC = "Eine Sammlung von Praeluden und Fugen, die Bach Kaiser Karl VI. widmete als Beweis fuer die Ueberlegenheit des deutschen Kontrapunkts",
        answerD = "Eine kirchliche Komposition fuer den Thomaskirchor Leipzig, 'geopfert' dem Andenken seines Vorgaengers Johann Kuhnau",
        correctAnswer = 0,
        explanation = "Bach besuchte 1747 Koenig Friedrich II. von Preussen (Friedrich der Grosse) in Potsdam. Der Koenig gab Bach ein ausgedehntes, schwieriges Thema vor; Bach improvisierte darauf. Zurueckgekehrt nach Leipzig arbeitete er das Thema zu einer Sammlung aus: Fugen, Kanons, Ricercare und eine Triosonate — das 'Musikalische Opfer', per Post an Friedrich zurueckgesandt.",
        difficulty = 5,
        funFact = "Friedrich der Grosse war selbst ein ernsthafter Floetenspirituos und komponierte Sonaten. Er spielte Bach sein Thema auf der Floete vor — es ist eines der laengsten und chromatischsten Themen der Kompositionsgeschichte. Bachs sechsstimmige Fuge ueber dieses Thema gilt als Kulminationspunkt polyphoner Kunst."
    ),

    // Q43
    Question(
        categoryId = 5,
        questionText = "Was war die 'affektenlehre' im Barock und wie bestimmte sie die Kompositionspraxis von Schuetz, Bach und Haendel?",
        answerA = "Die Lehre, dass jedes Musikstueck einen einzigen, klar definierten Affekt (Gefuehlszustand) ausdruecken solle — jede Tonart, jedes Tempo, jede Figur war mit bestimmten Empfindungen assoziiert",
        answerB = "Die Theorie der Temperamentslehre nach Humorallehre: Musik beeinflusst die vier Koerpersaefte (Blut, Phlegma, Galle, Melancholie) und kann Krankheiten heilen",
        answerC = "Die Affektenlehre schrieb vor, dass jeder der vier Kirchentoene (Dorian, Phrygian, Lydian, Mixolydian) einem bestimmten Affekt zugeordnet ist und nur fuer diesen verwendet werden darf",
        answerD = "Eine Theorie ueber die Rhetorik der Melodiefiguren: bestimmte melodische Wendungen (Figuren) symbolisieren sprachliche Tropen wie Ausruf, Frage und Allegorie",
        correctAnswer = 0,
        explanation = "Die Affektenlehre (Lehre von den Affekten, 17.-18. Jh.) propagierte: Ein Musikstueck soll einen einzigen dominanten Affekt (Freude, Trauer, Mut, etc.) ausdr\u00FCcken und beim Hoerer erzeugen. Tonarten, Tempi, Rhythmen und Figuren waren mit bestimmten Affekten verbunden — z.B. Moll = Trauer, Dur = Freude, chromatische Gaenge = Schmerz. Bach und Haendel setzten dies bewusst ein.",
        difficulty = 5,
        funFact = "Johann Mattheson systematisierte die Affektenlehre in 'Der vollkommene Capellmeister' (1739). Er listete auf, welche Affekte welche Taktarten, Tonarten und Figuren hervorrufen — ein Kompendium, das Studenten und Komponisten als Nachschlagewerk diente."
    ),

    // ── Weltmusik-Spezialwissen (7) ──────────────────────────────────────────

    // Q44
    Question(
        categoryId = 5,
        questionText = "Was ist der 'Gamelan Sekaten' und in welchem einzigen Kontext in Indonesien darf er gespielt werden?",
        answerA = "Gamelan Sekaten sind heilige Prunk-Gamelandrumms-Ensembles in Solo und Yogyakarta, die ausschliesslich waehrend des Profeten-Geburtstages Maulid an-Nabi in der Grossen Moschee gespielt werden duerften",
        answerB = "Eine besondere Gamelan-Stimmung (pelog sekaten), die nur fuer Beerdigungszeremonien des Sultans verwendet werden darf",
        answerC = "Ein Gamelan-Stil aus Bali, der ausschliesslich bei der Kremations-Zeremonie (Ngaben) des Koenigshauses aufgefuehrt wird",
        answerD = "Eine archaische Gamelan-Form die nur am Neujahrsfest (Saka-Kalender) bei Sonnenaufgang im Freien gespielt werden darf",
        correctAnswer = 0,
        explanation = "Gamelan Sekaten sind grosse, schwere Bronze-Gamelan-Ensembles in den Kratons (Palastbezirken) von Solo (Surakarta) und Yogyakarta. Sie werden ausschliesslich in der Woche des Maulid an-Nabi (Geburtstag des Propheten Mohammed) vor der Grossen Moschee gespielt — eine Tradition, die auf den islamisierten javanischen Hof des 15./16. Jahrhunderts zurueckgeht.",
        difficulty = 5,
        funFact = "Die Sekaten-Gamelas sind deutlich lauter und grobtoneriger als normale Gamelan — sie sind fuer Freiluftspiel konzipiert. Das Spielen ihrer tiefen, grummelnden Kenong und grossen Bonang-Gongs ist ein enormes akustisches Erlebnis, das den gesamten Kratonbezirk durchdringt."
    ),

    // Q45
    Question(
        categoryId = 5,
        questionText = "Was ist der strukturelle Unterschied zwischen 'Maqam Rast' und 'Maqam Bayati' in der arabischen und tuerkosmischen Musiktheorie?",
        answerA = "Rast beginnt auf C mit neutraler (zwischen Dur und Moll liegender) Terz und Septime; Bayati beginnt auf D mit einer erniedrigten Sekunde (Viertelton) und neutraler Terz — beide sind Modi mit spezifischen Melodiebewegungsregeln",
        answerB = "Rast entspricht der westlichen Durtonleiter, Bayati der Molltonleiter — die beiden Grundmodi der arabischen Musik",
        answerC = "Rast und Bayati sind identische Tonstufen, unterscheiden sich aber in der Verzierungspraxis: Rast verwendet Triller, Bayati Portamenti",
        answerD = "Rast ist ein vollstaendiger Maqam mit sieben Stufen; Bayati ein Pentatonischer Modus mit fuenf Stufen und zwei fehlenden Tonstufen",
        correctAnswer = 0,
        explanation = "Maqam Rast beginnt auf C und hat eine neutrale Terz (ca. 3/4 Ton, zwischen Eb und E) sowie eine neutrale Septime — er klingt 'weder Dur noch Moll'. Maqam Bayati beginnt auf D mit einer deutlich erniedrigten Sekunde (Viertelton-Eb, quasi-Db) und neutraler Terz. Beide haben zudem spezifische melodische Wendungen (maraakez, Kadenzen), die den Maqam definieren.",
        difficulty = 5,
        funFact = "Der Begriff 'Maqam' (arabisch: Ort/Position) bezeichnet weit mehr als eine Tonleiter: Er umfasst charakteristische Melodiewendungen, Kadenzen, emotionale Assoziationen und improvisatorische Regeln. Ein arabischer Musiker lernt jahrelang, die feinen Unterschiede zwischen ueber 70 verschiedenen Maqamat zu hoeren und zu spielen."
    ),

    // Q46
    Question(
        categoryId = 5,
        questionText = "Was ist 'Overtone Singing' (Oberton-Gesang) und in welcher mongolischen Form ist es am hoeher entwickelten?",
        answerA = "Khoomi (auch Khoomii oder Xoomej) ist mongolischer/tuvischer Oberton-Gesang: der Saenger produziert gleichzeitig einen tiefen Grundton und hebt durch Vokaltrakt-Formung einzelne Obertone zu einer melodischen zweiten Stimme hervor",
        answerB = "Urtiin duu ist die mongolische Form des Oberton-Gesangs, bei dem der Saenger mehrstimmig klingt durch spezielle Glottis-Technik ohne veraenderte Vokaltrakt-Formung",
        answerC = "Tuvan Throat Singing wird durch gleichzeitiges Singen und Pfeife erzeugt — eine Doppelpfeife-Technik im Gaumen, die den Eindruck von Obertonen erweckt",
        answerD = "Oberton-Gesang ist ausschliesslich in der tibetischen Klostermusik beheimatet; mongolische Varianten sind spaetere Adaptionen ohne eigene Entwicklung",
        correctAnswer = 0,
        explanation = "Khoomi (mongolisch) / Khoomei (tuvisch) ist eine Kehlgesangstechnik, bei der der Saenger durch prazise Formung von Rachen, Zunge und Lippen bestimmte Obertone des Kehlkopfgrundtons verstaerkt. Der Hoerer hoert zwei simultane Klaenge: den tiefen Grundton und eine floetenaehnliche Oberton-Melodie. Es ist eine jahrtausende alte Praxis der Steppen-Nomaden.",
        difficulty = 5,
        funFact = "UNESCO hat Khoomi 2010 als immaterielles Kulturerbe anerkannt. Es gibt in der Mongolei und in der russischen Tuva-Republik Wettbewerbe, bei denen Saenger in mehreren Kategorien (Stil, Melodievielfalt) bewertet werden. Einige Saenger koennen gleichzeitig drei verschiedene Obertone kontrollieren."
    ),

    // Q47
    Question(
        categoryId = 5,
        questionText = "Was ist 'Mbira dzavadzimu' und welche spirituelle Funktion hat es bei den Shona in Zimbabwe?",
        answerA = "Ein lamelophon (Daumenklaviatur aus Metallzungen auf Holzresonator), das fuer Zeremonien zur Kommunikation mit Ahnengeistern (vadzimu) gespielt wird — oft in langen Nacht-Zeremonien (bira)",
        answerB = "Ein Percussion-Instrument der Shona, das bei Initiationsritualen fuer junge Maenner gespielt wird und den Kontakt mit dem Erd-Geist (mwari) herstellt",
        answerC = "Ein Blasinstrument aus Elefantenstossknochen, das ausschliesslich vom Haeuptling (sadunhu) bei Regenmacherritualen gespielt werden darf",
        answerD = "Eine vokale Praxis der Shona-Frauen, bei der kollektiver Choralgesang Geisterheilung (n'anga-Tradition) unterstuetzt und Mbira nur als Hilfsinstrument eingesetzt wird",
        correctAnswer = 0,
        explanation = "Mbira dzavadzimu ('Stimmgabeln der Ahnengeister') ist ein Lamelophon der Shona: 22-28 Metallzungen auf einem Holzresonator, oft in einer Kalebasse gespielt. Es ist zentrales Instrument der Bira-Zeremonien, die die ganze Nacht dauern und bei denen Geistermedien (svikiro) in Trance die Ahnengeister channeln. Das Wort 'vadzimu' bedeutet Geister der Vorfahren.",
        difficulty = 5,
        funFact = "Der amerikanische Ethnomusikologe Paul Berliner verbrachte Jahre in Zimbabwe und schrieb 'The Soul of Mbira' (1978) — eine der gruendlichsten Dokumentationen einer afrikanischen Musikpraxis ueberhaupt. Thomas Mapfumo popularisierte Mbira-Melodien im Pop ('Chimurenga')-Stil."
    ),

    // Q48
    Question(
        categoryId = 5,
        questionText = "Was ist 'Raga Bhairav' in der nordindischen (hindustanischen) Klassik und zu welcher Tageszeit wird er traditionell aufgefuehrt?",
        answerA = "Bhairav ist ein morgendlicher Raga, charakterisiert durch die erniedrigte Sekunde (komal Re) und erniedrigte Sexte (komal Dha), mit feierlichem, ernstem Charakter — traditionell bei Sonnenaufgang gespielt",
        answerB = "Bhairav ist ein Nacht-Raga der spaeten Stunden (nach Mitternacht), der durch seinen traurigen Charakter und die erhoehte Septime (tivra Ni) definiert ist",
        answerC = "Bhairav wird bei Vollmond aufgefuehrt und hat keine festgelegte Tageszeit; seine Stimmung ist festlich-freudig durch die Verwendung aller reinen (shuddh) Skalenstufen",
        answerD = "Bhairav ist ein Abend-Raga (Sandhiprakash), verwandt mit Bhairavi, und wird in den ersten zwei Stunden nach Sonnenuntergang gespielt — gekennzeichnet durch erhoehte Secunde",
        correctAnswer = 0,
        explanation = "Raga Bhairav (benannt nach dem hinduistischen Gott Shiva in seiner Bhairav-Form) wird traditionell fruehmorgens aufgefuehrt, oft waehrend des Sonnenaufgangs. Charakteristische Stufen: komal (erniedrigte) Re (Sekunde) und komal Dha (Sexte). Er hat eine erhabene, kontemplative Stimmung — 'shuddh' (rein) in der Atmosphaere, aber mit komal-Stufen.",
        difficulty = 5,
        funFact = "Die Raga-Theorie der Tageszeit ('Raga-Zeiten') ist nicht starr: Musiker koennen Ragas auch zu anderer Zeit spielen, wenn der Anlass es rechtfertigt. Aber die Assoziation von Raga und Tageszeit ist tief im Bewusstsein indischer Musiker verankert — sie beeinflusst die Stimmung und Interpretation."
    ),

    // Q49
    Question(
        categoryId = 5,
        questionText = "Was ist das 'Ney' und warum hat es in der persischen Sufi-Tradition eine besondere symbolische Bedeutung?",
        answerA = "Die Ney ist eine offene Rahr-Floete; Jalal ad-Din Rumi nutzte sie als Zentralsymbol in seinem 'Masnavi': Die Roehre, vom Schilf-Rohrstueck getrennt, symbolisiert die Seele, die sich nach ihrer goettlichen Herkunft sehnt",
        answerB = "Die Ney ist eine geschlossene Holzfloete; sie symbolisiert im Sufi-Derwisch-Tanz die Achse, um die sich die tanzenden Derwische drehen",
        answerC = "Das Ney ist ein Lauten-Instrument (arabische Oud-Variante) und symbolisiert im Sufi-Islam die heilige Geometrie der Schreibfeder (Kalam)",
        answerD = "Ney ist ein Beckenpaar aus Kupfer, das im Zikr-Ritual den Puls des Herzens (qalb) symbolisiert und zur Rhythmisierung des kollektiven Atemgebets dient",
        correctAnswer = 0,
        explanation = "Das Ney (persisch/arabisch: Schilf/Rohr) ist eine offene Laengsblasflote aus Schilf. Rumi beginnt sein Hauptwerk 'Masnawi-yi Ma'nawi' mit 18 Versen ueber die Ney: 'Hoere, wie diese Roehre klagt / trennungsgeschichten erzaehlt.' Die Ney, vom Schilfbett getrennt, klagt um ihre Herkunft — Metapher fuer die von Gott getrennte Menschenseele.",
        difficulty = 5,
        funFact = "Rumi gruendete den Mevlevi-Orden (Derwische), in dem Ney-Spiel und Sema-Tanz (Drehung) zentrale spirituelle Praktiken sind. UNESCO hat die Mevlevi-Sema-Praxis 2008 als immaterielles Weltkulturerbe anerkannt. Das Ney-Spiel erfordert eine spezielle Atemtechnik durch eine Luecke zwischen Schilf und Zahnfleisch."
    ),

    // Q50
    Question(
        categoryId = 5,
        questionText = "Was ist 'Gamelophon' — und was unterscheidet die sieben Soenen (Pelog) von den fuenf Toenen (Slendro) im javanischen Gamelan-System?",
        answerA = "Pelog ist ein Sieben-Ton-System mit ungleichen Intervallen, das in der Praxis meist als fuenf ausgewaehlte Stufen genutzt wird; Slendro ist ein quasi-aequidistantes Fuenfton-System — beide existieren nebeneinander und koennen nicht miteinander kombiniert werden",
        answerB = "Pelog entspricht dem westlichen Dur-System (Heptatonik); Slendro dem Moll-System (Pentatonik) — das javanische Gamelan ist deshalb kompatibel mit westlicher Harmonik",
        answerC = "Pelog hat sieben gleichmaessige Halbtonstufen (wie westliche chromatische Skala); Slendro fuenf ungleiche Ganztonstufen nach dem pythagoreischen Quintenzirkel",
        answerD = "Gamelophon bezeichnet das Hybrid-Instrument: Ein Marimba-artiges Instrument, das Pelog und Slendro gleichzeitig spielen kann durch doppelt gestimmte Klanghoel hoelzer",
        correctAnswer = 0,
        explanation = "Javanischer Gamelan existiert in zwei nicht kombinierbaren Stimmungssystemen: Slendro hat fuenf Toene, die annaehernd aequidistant (Quinten) sind — leicht variierend je nach Ensemble. Pelog hat sieben Toene mit sehr ungleichen Intervallen; in der Praxis werden meist fuenf davon fuer ein bestimmtes Pathet (Modalitaet) gewaehlt. Gamelan-Ensembles haben oft zwei Sets: einen fuer jedes System.",
        difficulty = 5,
        funFact = "Kein zwei Gamelan-Ensembles sind identisch gestimmt — jedes Gamelan ist ein einzigartiges Instrument, handgegossen und fuereinander gestimmt. Deshalb koennen Gamelan-Instrumente aus verschiedenen Ensembles nicht ausgetauscht werden: Die Stimmung passt schlicht nicht."
    ),
)
