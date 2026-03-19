package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun literatureQuestionsMedium1(): List<Question> = listOf(

    // ── MEDIUM (difficulty = 2) — Deutsche Klassik & Romantik ──────────────

    // Question 1 — Goethe: Faust I
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welcher bekannten Szene des Faust I treffen Faust und Mephisto auf zechende Studenten?",
        answerA = "Auerbachs Keller in Leipzig",
        answerB = "Praters Schenke in Wien",
        answerC = "Zum Roten Ochsen in Heidelberg",
        answerD = "Die Goldene Gans in Weimar",
        correctAnswer = 0,
        explanation = "In der berühmten 'Auerbachs Keller'-Szene führt Mephisto Faust in eine Weinschenke in Leipzig, wo er Studenten mit Magie beeindruckt.",
        difficulty = 2,
        funFact = "Auerbachs Keller in Leipzig existiert noch heute als Restaurant und gilt als einer der ältesten Gasthäuser Deutschlands — seit etwa 1530."
    ),

    // Question 2 — Goethe: Faust I
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welches Versprechen gibt Mephisto Faust im Teufelspakt, das Faust zu verlieren glaubt?",
        answerA = "Ewiges Leben und Jugend",
        answerB = "Den einen Augenblick der völligen Erfüllung",
        answerC = "Die Herrschaft über alle Königreiche der Welt",
        answerD = "Die vollständige Erkenntnis aller Wissenschaften",
        correctAnswer = 1,
        explanation = "Faust wettet mit Mephisto: Wenn er je zu einem Augenblick sagt 'Verweile doch, du bist so schön!', hat Mephisto gewonnen und Faust gehört ihm.",
        difficulty = 2,
        funFact = "Das berühmteste Zitat aus Faust lautet: 'Verweile doch, du bist so schön!' — es taucht im ganzen Stück nie als erfüllter Ausruf auf, nur als Bedingung."
    ),

    // Question 3 — Goethe: Faust II
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr wurde Goethes Faust II posthum veröffentlicht?",
        answerA = "1808",
        answerB = "1820",
        answerC = "1832",
        answerD = "1835",
        correctAnswer = 2,
        explanation = "Faust I erschien 1808 zu Goethes Lebzeiten. Faust II vollendete Goethe kurz vor seinem Tod und wurde 1832 posthum veröffentlicht.",
        difficulty = 2,
        funFact = "Goethe arbeitete über 60 Jahre an Faust — von seinen Zwanzigern bis kurz vor seinem Tod mit 82 Jahren."
    ),

    // Question 4 — Goethe: Werther
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Wie heißt die Frau, in die Werther sich in Goethes Roman hoffnungslos verliebt?",
        answerA = "Friederike",
        answerB = "Lisette",
        answerC = "Marianne",
        answerD = "Lotte (Charlotte)",
        correctAnswer = 3,
        explanation = "Werther verliebt sich hoffnungslos in Charlotte (Lotte), die jedoch mit seinem Freund Albert verlobt ist — eine Liebe ohne Zukunft, die in Werthers Selbstmord endet.",
        difficulty = 2,
        funFact = "Goethes Roman löste nach seiner Veröffentlichung 1774 eine Welle von Nachahmungsselbstmorden aus, bekannt als 'Werther-Effekt' — ein Begriff, der noch heute in der Suizidforschung verwendet wird."
    ),

    // Question 5 — Goethe: Biografie
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welcher deutschen Stadt wurde Johann Wolfgang von Goethe im Jahr 1749 geboren?",
        answerA = "Frankfurt am Main",
        answerB = "Weimar",
        answerC = "Leipzig",
        answerD = "Hannover",
        correctAnswer = 0,
        explanation = "Goethe wurde am 28. August 1749 in Frankfurt am Main geboren. Er verbrachte jedoch den Großteil seines produktiven Lebens in Weimar.",
        difficulty = 2,
        funFact = "Goethes Geburtshaus am Großen Hirschgraben in Frankfurt ist noch heute als Museum zu besichtigen und gilt als wichtiges Kulturerbe."
    ),

    // Question 6 — Schiller: Die Räuber
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welche Figur bringt in Schillers 'Die Räuber' den Protagonisten Karl Moor um sein Erbe?",
        answerA = "Der Vater Maximilian",
        answerB = "Der Bruder Franz",
        answerC = "Der Hauptmann Spiegelberg",
        answerD = "Der Pfarrer Moser",
        correctAnswer = 1,
        explanation = "Franz Moor, der hinterhältige Bruder, manipuliert den Vater mit gefälschten Briefen, um Karl aus der Familie zu verstoßen und das Erbe an sich zu reißen.",
        difficulty = 2,
        funFact = "Die Räuber feierte am 13. Januar 1782 in Mannheim Premiere. Der Erfolg war so groß, dass Schiller heimlich aus Stuttgart anreiste — gegen das Reiseverbot seines Herzogs."
    ),

    // Question 7 — Schiller: Wilhelm Tell
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "In welchem Land spielt Schillers Drama 'Wilhelm Tell', das 1804 uraufgeführt wurde?",
        answerA = "Österreich",
        answerB = "Bayern",
        answerC = "Schweiz",
        answerD = "Tirol",
        correctAnswer = 2,
        explanation = "Schillers Wilhelm Tell handelt vom Schweizer Freiheitskampf gegen die habsburgische Unterdrückung. Tell ist ein Schweizer Volksheld aus Uri.",
        difficulty = 2,
        funFact = "Die legendäre Apfelschuss-Szene, in der Tell den Apfel vom Kopf seines Sohnes schießt, taucht tatsächlich in historischen Quellen auf — die Geschichte geht auf mittelalterliche Überlieferungen zurück."
    ),

    // Question 8 — Schiller: Don Carlos
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche Figur verkörpert in Schillers 'Don Carlos' das Ideal der Gedanken- und Redefreiheit?",
        answerA = "Don Carlos selbst",
        answerB = "Prinzessin Eboli",
        answerC = "König Philipp II.",
        answerD = "Marquis von Posa",
        correctAnswer = 3,
        explanation = "Der Marquis von Posa bittet König Philipp II. in der berühmtesten Szene: 'Geben Sie Gedankenfreiheit!' — er steht für Schillers aufklärerisches Ideal.",
        difficulty = 2,
        funFact = "Der Satz 'Sire, geben Sie Gedankenfreiheit!' aus Don Carlos gehört zu den bekanntesten Zitaten der deutschen Literatur und wird bis heute in politischen Debatten zitiert."
    ),

    // Question 9 — Schiller: Maria Stuart
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Mit welcher anderen Königin hat Maria Stuart in Schillers Drama eine fiktive direkte Begegnung?",
        answerA = "Elisabeth I. von England",
        answerB = "Katharina von Medici",
        answerC = "Anna von Österreich",
        answerD = "Margarethe von Parma",
        correctAnswer = 0,
        explanation = "In Schillers Drama treffen Maria Stuart und Elisabeth I. von England in einer fiktiven Szene aufeinander — historisch hat dieses Treffen nie stattgefunden.",
        difficulty = 2,
        funFact = "Schiller erfand die Begegnungsszene bewusst als dramatischen Höhepunkt. In der Realität lehnten es beide Königinnen ihr Leben lang ab, sich persönlich zu treffen."
    ),

    // Question 10 — Schiller: Biografie
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Als welchen Beruf übte Schiller an der Universität Jena aus, bevor er sich ganz dem Schreiben widmete?",
        answerA = "Rechtsanwalt",
        answerB = "Professor für Geschichte",
        answerC = "Arzt",
        answerD = "Bibliothekar",
        correctAnswer = 1,
        explanation = "Schiller war von 1789 bis 1799 Professor für Geschichte an der Universität Jena. Er schrieb in dieser Zeit u.a. die 'Geschichte des Dreißigjährigen Krieges'.",
        difficulty = 2,
        funFact = "Schiller und Goethe lernten sich 1794 kennen und wurden trotz anfänglicher Skepsis enge Freunde — ihre zehnjährige Freundschaft gilt als eine der bedeutendsten in der Literaturgeschichte."
    ),

    // Question 11 — Novalis: Blaue Blume
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Was symbolisiert die 'Blaue Blume' in Novalis' Roman 'Heinrich von Ofterdingen'?",
        answerA = "Den Tod und die Vergänglichkeit",
        answerB = "Die politische Freiheit des deutschen Volkes",
        answerC = "Die romantische Sehnsucht und das Unendliche",
        answerD = "Die Treue in der Ehe",
        correctAnswer = 2,
        explanation = "Die Blaue Blume ist das zentrale Symbol der deutschen Romantik — sie steht für die unerfüllbare Sehnsucht, das Streben nach dem Unendlichen und dem poetischen Ideal.",
        difficulty = 2,
        funFact = "Novalis starb 1801 mit nur 28 Jahren, bevor er Heinrich von Ofterdingen vollenden konnte. Das Buch erschien 1802 posthum und wurde zum Schlüsselwerk der Romantik."
    ),

    // Question 12 — Novalis: Biografie
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Wie hieß die Verlobte von Novalis, deren früher Tod seine 'Hymnen an die Nacht' maßgeblich beeinflusste?",
        answerA = "Karoline Schlegel",
        answerB = "Dorothea Veit",
        answerC = "Bettina von Arnim",
        answerD = "Sophie von Kühn",
        correctAnswer = 3,
        explanation = "Sophie von Kühn starb 1797 an Tuberkulose, als sie erst 15 Jahre alt war. Ihr Tod erschütterte Novalis tief und inspirierte seine 'Hymnen an die Nacht' (1800).",
        difficulty = 2,
        funFact = "Novalis traf Sophie von Kühn erstmals 1794, als sie zwölfjährig war — er war damals 22. Sie verlobten sich 1795 und sie starb nur zwei Jahre später."
    ),

    // Question 13 — Novalis: Hymnen an die Nacht
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welchem romantischen Magazin erschienen Novalis' 'Hymnen an die Nacht' im Jahr 1800 erstmals?",
        answerA = "Athenäum",
        answerB = "Der Freimütige",
        answerC = "Horen",
        answerD = "Musenalmanach",
        correctAnswer = 0,
        explanation = "Die 'Hymnen an die Nacht' erschienen 1800 im Athenäum, dem zentralen Publikationsorgan der Frühromantik, das von den Brüdern Schlegel herausgegeben wurde.",
        difficulty = 2,
        funFact = "Das Athenäum erschien nur drei Jahre lang (1798–1800), gilt aber als das wichtigste Manifest der deutschen Frühromantik und enthält u.a. Friedrich Schlegels berühmte Fragmente."
    ),

    // Question 14 — E.T.A. Hoffmann: Biografie
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "In welcher preußischen Stadt wurde E.T.A. Hoffmann im Jahr 1776 geboren?",
        answerA = "Berlin",
        answerB = "Königsberg",
        answerC = "Danzig",
        answerD = "Breslau",
        correctAnswer = 1,
        explanation = "Ernst Theodor Amadeus Hoffmann wurde am 24. Januar 1776 in Königsberg (dem heutigen Kaliningrad in Russland) geboren.",
        difficulty = 2,
        funFact = "Hoffmann änderte seinen dritten Vornamen Wilhelm in Amadeus — aus Verehrung für Wolfgang Amadeus Mozart, den er als sein musikalisches Idol betrachtete."
    ),

    // Question 15 — E.T.A. Hoffmann: Der Sandmann
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welche Figur glaubt der Protagonist Nathanael in Hoffmanns 'Der Sandmann' in dem Advokaten Coppelius wiederzuerkennen?",
        answerA = "Seinen verstorbenen Vater",
        answerB = "Seinen Universitätsfreund Lothar",
        answerC = "Den bedrohlichen Sandmann aus seiner Kindheit",
        answerD = "Den Teufel persönlich",
        correctAnswer = 2,
        explanation = "Nathanael ist von der Kindheitsfigur des Sandmanns traumatisiert, der den Kindern die Augen stiehlt. Er projiziert diese Angst auf Coppelius und später auf den Optiker Coppola.",
        difficulty = 2,
        funFact = "Sigmund Freud analysierte 'Der Sandmann' in seinem Essay 'Das Unheimliche' (1919) und verwendete Hoffmanns Geschichte als Schlüsseltext seiner Theorie des Unheimlichen."
    ),

    // Question 16 — E.T.A. Hoffmann: Der goldne Topf
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welcher deutschen Stadt spielt E.T.A. Hoffmanns Märchen 'Der goldne Topf' (1814)?",
        answerA = "Berlin",
        answerB = "Leipzig",
        answerC = "Weimar",
        answerD = "Dresden",
        correctAnswer = 3,
        explanation = "Der goldne Topf ist zu großen Teilen in Dresden angesiedelt, wo der Student Anselmus zwischen der realen Welt und dem magischen Reich des Archivarius Lindhorst schwankt.",
        difficulty = 2,
        funFact = "E.T.A. Hoffmann erfand für seinen Protagonisten Anselmus das Grundprinzip der romantischen Ironie in Reinform: Der Held weiß nicht, ob er träumt oder wacht."
    ),

    // Question 17 — E.T.A. Hoffmann: Werke
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welches Märchen von E.T.A. Hoffmann diente als Vorlage für Tschaikowskys berühmtes Ballett?",
        answerA = "Nussknacker und Mausekönig",
        answerB = "Klein Zaches, genannt Zinnober",
        answerC = "Der goldne Topf",
        answerD = "Das Fräulein von Scuderi",
        correctAnswer = 0,
        explanation = "Hoffmanns 'Nussknacker und Mausekönig' (1816) wurde von Tschaikowsky 1892 als Ballett vertont — es ist heute eines der meistgespielten Ballette weltweit.",
        difficulty = 2,
        funFact = "Tschaikowsky vertonte nicht direkt Hoffmanns Original, sondern eine Bearbeitung von Alexandre Dumas père. Der Zuckerrohrflötenklang entstand durch ein damals völlig neues Instrument: die Celesta."
    ),

    // Question 18 — E.T.A. Hoffmann: Phantasiestücke
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wie lautet der vollständige Titel von Hoffmanns erster bedeutender Werksammlung, die 1814/15 erschien?",
        answerA = "Romantische Stücke in Hoffmanns Manier",
        answerB = "Phantasiestücke in Callots Manier",
        answerC = "Nachtstücke aus dem Geisterreich",
        answerD = "Serapionische Erzählungen erster Teil",
        correctAnswer = 1,
        explanation = "Die 'Phantasiestücke in Callots Manier' (1814–15) war Hoffmanns Durchbruch als Schriftsteller. Der Titel bezieht sich auf den französischen Kupferstecher Jacques Callot.",
        difficulty = 2,
        funFact = "Die Sammlung enthält auch 'Ritter Gluck' und 'Don Juan', in denen Hoffmann seine Musikerfahrungen als Kapellmeister und Komponist literarisch verarbeitete."
    ),

    // Question 19 — Eichendorff: Taugenichts
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Womit verdient der Taugenichts in Eichendorffs Novelle am Anfang seinen Lebensunterhalt, bevor er in die weite Welt zieht?",
        answerA = "Er arbeitet als Schäfer",
        answerB = "Er spielt Geige auf Jahrmärkten",
        answerC = "Er dreht die Mühle seines Vaters",
        answerD = "Er ist Schreiber beim Pfarrer",
        correctAnswer = 2,
        explanation = "Der Vater nennt seinen Sohn einen Taugenichts, weil er am liebsten in der Sonne liegt statt die Mühle zu drehen. Daraufhin schickt er ihn in die Welt.",
        difficulty = 2,
        funFact = "Eichendorffs Novelle 'Aus dem Leben eines Taugenichts' (1826) ist eines der beliebtesten Werke der deutschen Romantik und gilt als Inbegriff der romantischen Wanderlust."
    ),

    // Question 20 — Eichendorff: Biografie
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Aus welchem Adelsgeschlecht stammte Joseph von Eichendorff, dessen Gut später verkauft werden musste?",
        answerA = "Bayerischer Landadel",
        answerB = "Rheinischer Uradel",
        answerC = "Thüringischer Ritteradel",
        answerD = "Schlesischer Adel (Gut Lubowitz)",
        correctAnswer = 3,
        explanation = "Eichendorff stammte aus einer schlesischen Adelsfamilie. Das Gut Lubowitz, auf dem er aufwuchs, musste 1822 wegen Schulden verkauft werden — ein Verlust, der ihn tief prägte.",
        difficulty = 2,
        funFact = "Eichendorffs Kindheitserinnerungen an das verlorene Gut Lubowitz in Schlesien (heute Polen) sind ein wiederkehrendes Motiv in seinem Werk — besonders der Schmerz des Heimatverlusts."
    ),

    // Question 21 — Eichendorff: Gedichte
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welches Motiv gilt als das charakteristischste in Eichendorffs Lyrik und verbindet fast alle seine Gedichte?",
        answerA = "Das Wandern und die Sehnsucht nach der Heimat",
        answerB = "Die Kritik an der industriellen Revolution",
        answerC = "Die Schrecken der Nacht und des Übernatürlichen",
        answerD = "Die politische Freiheit der Nationen",
        correctAnswer = 0,
        explanation = "Wanderschaft, Heimweh und das Streben nach dem Undefinierbaren sind Leitmotive bei Eichendorff — verkörpert in Versen wie 'Wem Gott will rechte Gunst erweisen...'",
        difficulty = 2,
        funFact = "Eichendorffs Gedicht 'Mondnacht' wurde von Robert Schumann vertont und zählt zu den schönsten Liedern der deutschen Romantik — der erste Vers lautet: 'Es war, als hätt' der Himmel / Die Erde still geküsst.'"
    ),

    // Question 22 — Kleist: Der zerbrochne Krug
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wer ist in Kleists Lustspiel 'Der zerbrochne Krug' (1808) heimlich der Schuldige, der den Krug zerbrochen hat?",
        answerA = "Der Angeklagte Ruprecht",
        answerB = "Der Richter Adam selbst",
        answerC = "Die Mutter Marthe",
        answerD = "Der Gerichtsschreiber Licht",
        correctAnswer = 1,
        explanation = "Die Komödie dreht sich darum, dass Richter Adam selbst den Krug zerbrochen hat — und nun als Richter seinen eigenen Fall verhandeln muss, ohne sich zu verraten.",
        difficulty = 2,
        funFact = "Kleist schrieb 'Der zerbrochne Krug' nach einem Kupferstich, den er zusammen mit Zschokke und Wieland betrachtete. Alle drei schrieben darüber — Kleists Version wurde am berühmtesten."
    ),

    // Question 23 — Kleist: Michael Kohlhaas
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Was ist der Auslöser für Michael Kohlhaas' Feldzug gegen die Obrigkeit in Kleists Novelle?",
        answerA = "Die Ermordung seiner Tochter durch einen Junker",
        answerB = "Der Diebstahl seines gesamten Vermögens",
        answerC = "Die unrechtmäßige Beschlagnahmung und Misshandlung seiner Pferde",
        answerD = "Die Verhaftung seines Sohnes wegen falscher Anklage",
        correctAnswer = 2,
        explanation = "Junker Wenzel von Tronka lässt Kohlhaas' Pferde unrechtmäßig einbehalten und schinden. Als alle Rechtswege scheitern, greift Kohlhaas zur Selbstjustiz.",
        difficulty = 2,
        funFact = "Michael Kohlhaas basiert auf einer historischen Person: Hans Kohlhase, einem Rosshändler aus dem 16. Jahrhundert, der tatsächlich einen bewaffneten Feldzug führte und 1540 hingerichtet wurde."
    ),

    // Question 24 — Kleist: Penthesilea
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche mythologische Figur steht Penthesilea in Kleists gleichnamigem Drama (1808) gegenüber?",
        answerA = "Odysseus",
        answerB = "Paris",
        answerC = "Agamemnon",
        answerD = "Achilles",
        correctAnswer = 3,
        explanation = "Kleists 'Penthesilea' zeigt die Amazonenkönigin in einer extremen Liebes-Hass-Beziehung zu Achilles — die Grenze zwischen Liebe und Gewalt wird vollständig aufgelöst.",
        difficulty = 2,
        funFact = "Kleists Penthesilea wurde zu seinen Lebzeiten nie aufgeführt — Goethe lehnte sie für Weimar ab. Die Uraufführung fand erst 1876 statt, 65 Jahre nach Kleists Tod."
    ),

    // Question 25 — Kleist: Biografie
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wie endete Heinrich von Kleists Leben im Jahr 1811?",
        answerA = "Durch Freitod am Wannsee gemeinsam mit Henriette Vogel",
        answerB = "An Tuberkulose in einem Berliner Krankenhaus",
        answerC = "Im Duell mit einem preußischen Offizier",
        answerD = "Bei der Überquerung des Rheins auf der Flucht vor Napoleon",
        correctAnswer = 0,
        explanation = "Kleist schoss am 21. November 1811 am Kleinen Wannsee bei Berlin zuerst seine todkranke Freundin Henriette Vogel und dann sich selbst. Er war 34 Jahre alt.",
        difficulty = 2,
        funFact = "Kleist hinterließ zwei kurze Abschiedsbriefe — darunter einen an seine Schwester Ulrike. Die Briefe zeugen von einer seltsamen Heiterkeit und der Überzeugung, den 'glücklichsten Tod' zu sterben."
    ),

    // Question 26 — Heine: Buch der Lieder
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschien Heinrich Heines berühmteste Gedichtsammlung 'Buch der Lieder'?",
        answerA = "1820",
        answerB = "1827",
        answerC = "1833",
        answerD = "1844",
        correctAnswer = 1,
        explanation = "Das 'Buch der Lieder' erschien 1827 und machte Heine schlagartig berühmt. Es enthält Gedichte wie 'Die Lorelei' und 'Du bist wie eine Blume'.",
        difficulty = 2,
        funFact = "Das 'Buch der Lieder' war zunächst kein sofortiger Bestseller — erst nach mehreren Auflagen in den 1830ern wurde es zum meistverkauften deutschen Lyrikband des 19. Jahrhunderts."
    ),

    // Question 27 — Heine: Lorelei
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Was macht die Lorelei in Heines berühmtem Gedicht mit dem Schiffer auf dem Rhein?",
        answerA = "Sie warnt ihn vor den Felsen mit ihrem Gesang",
        answerB = "Sie bittet ihn um Rettung aus den Fluten",
        answerC = "Sie lenkt ihn durch ihren Gesang ab, sodass er an den Felsen zerschellt",
        answerD = "Sie zeigt ihm verborgene Goldschätze unter dem Wasser",
        correctAnswer = 2,
        explanation = "Die Lorelei sitzt auf dem gleichnamigen Felsen am Rhein, kämmt ihr goldenes Haar und singt so betörend, dass der Schiffer seinen Kurs vergisst und kentert.",
        difficulty = 2,
        funFact = "Die Lorelei-Sage wurde nicht von Heine erfunden — sie geht auf Clemens Brentano zurück, der sie 1802 in seinem Roman 'Godwi' erstmals literarisch gestaltete."
    ),

    // Question 28 — Heine: Deutschland, ein Wintermärchen
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr entstand Heines politisch-satirisches Werk 'Deutschland. Ein Wintermärchen'?",
        answerA = "1830",
        answerB = "1837",
        answerC = "1840",
        answerD = "1844",
        correctAnswer = 3,
        explanation = "'Deutschland. Ein Wintermärchen' entstand 1844 nach Heines Besuch in Deutschland, seiner ersten Heimreise seit Jahren. Es ist eine beißende Satire auf die politische Rückständigkeit Deutschlands.",
        difficulty = 2,
        funFact = "Heine lebte ab 1831 in Paris im Exil und kehrte nur einmal kurz nach Deutschland zurück — der Besuch 1843 inspirierte das Wintermärchen, das in Preußen sofort verboten wurde."
    ),

    // Question 29 — Heine: Biografie
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welcher Stadt verbrachte Heinrich Heine den größten Teil seines Erwachsenenlebens im Exil?",
        answerA = "Paris",
        answerB = "London",
        answerC = "Wien",
        answerD = "Zürich",
        correctAnswer = 0,
        explanation = "Heine emigrierte 1831 nach Paris, wo er bis zu seinem Tod 1856 lebte. Die letzten acht Jahre verbrachte er fast bewegungslos in seiner sogenannten 'Matratzengruft'.",
        difficulty = 2,
        funFact = "Heine litt in seinen letzten Lebensjahren an einer schweren Rückenmarkerkrankung (möglicherweise multiple Sklerose), die ihn völlig lähmte — er schrieb und diktierte aber weiterhin Gedichte."
    ),

    // Question 30 — Brentano: Werke
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welches gemeinsame Werk veröffentlichten Clemens Brentano und Achim von Arnim zwischen 1805 und 1808?",
        answerA = "Deutsche Sagen",
        answerB = "Des Knaben Wunderhorn",
        answerC = "Kinder- und Hausmärchen",
        answerD = "Volksbücher des deutschen Mittelalters",
        correctAnswer = 1,
        explanation = "'Des Knaben Wunderhorn' ist eine Sammlung deutscher Volkslieder, herausgegeben von Brentano und Arnim. Sie inspirierte Generationen von Dichtern und Komponisten.",
        difficulty = 2,
        funFact = "Gustav Mahler vertonte zahlreiche Texte aus 'Des Knaben Wunderhorn' in seinen Sinfonien und Liedern — die Sammlung beeinflusste damit auch die Musikgeschichte des 20. Jahrhunderts."
    ),

    // Question 31 — Brentano: Biografie und Werk
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Zu welcher romantischen Strömung oder Schule wird Clemens Brentano als Mitbegründer gezählt?",
        answerA = "Weimarer Klassik",
        answerB = "Jenaer Frühromantik",
        answerC = "Heidelberger Romantik",
        answerD = "Berliner Spätromantik",
        correctAnswer = 2,
        explanation = "Brentano war neben Achim von Arnim einer der Hauptvertreter der Heidelberger Romantik (Hochromantik), die sich auf Volkskultur, Märchen und Volkslieder konzentrierte.",
        difficulty = 2,
        funFact = "Brentano wurde nach einer religiösen Bekehrungskrise 1817 zum frommen Katholiken und verbrachte fünf Jahre am Krankenbett der stigmatisierten Nonne Anna Katharina Emmerick, deren Visionen er aufzeichnete."
    ),

    // Question 32 — Ludwig Tieck: Werke
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welches phantastisches Werk von Ludwig Tieck (1797) gilt als eine der ersten deutschen Kunstmärchen der Romantik?",
        answerA = "Franz Sternbalds Wanderungen",
        answerB = "William Lovell",
        answerC = "Vittoria Accorombona",
        answerD = "Der blonde Eckbert",
        correctAnswer = 3,
        explanation = "'Der blonde Eckbert' (1797) von Ludwig Tieck ist eines der frühesten deutschen Kunstmärchen — eine Geschichte über Schuld, Einsamkeit und Identitätsverlust in einer unheimlichen Waldwelt.",
        difficulty = 2,
        funFact = "Tieck pflegte engen Kontakt zu Novalis, den Schlegels und Wackenroder — gemeinsam mit ihnen begründete er in Jena die Frühromantik, obwohl er selbst aus Berlin stammte."
    ),

    // Question 33 — Ludwig Tieck: Bedeutung
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Für welche bedeutende Übersetzungsleistung ist Ludwig Tieck neben seiner eigenen Dichtung bekannt?",
        answerA = "Die deutsche Übersetzung von Shakespeares Werken",
        answerB = "Die Übertragung von Dantes 'Divina Commedia'",
        answerC = "Die Verdeutschung von Cervantes' 'Don Quijote'",
        answerD = "Die Übersetzung von Calderóns 'Das Leben ein Traum'",
        correctAnswer = 0,
        explanation = "Tieck vollendete (zusammen mit August Wilhelm Schlegel und dessen Tochter Dorothea Tieck) die klassische deutsche Shakespeare-Übersetzung, die bis heute als Maßstab gilt.",
        difficulty = 2,
        funFact = "Die 'Schlegel-Tieck-Übersetzung' von Shakespeares Werken ist so eng mit der deutschen Literatur verwoben, dass Goethe sagte, Shakespeare sei für Deutsche kein Fremder, sondern ein Einheimischer."
    ),

    // Question 34 — August Wilhelm Schlegel
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welches literarische Organ gründeten August Wilhelm und Friedrich Schlegel 1798 als Sprachrohr der deutschen Romantik?",
        answerA = "Die Horen",
        answerB = "Das Athenäum",
        answerC = "Der Teutsche Merkur",
        answerD = "Das Morgenblatt",
        correctAnswer = 1,
        explanation = "Das 'Athenäum' (1798–1800) war das Zentralorgan der Frühromantik. Hier erschienen Schlegels berühmte Fragmente, Novalis' Hymnen und programmatische Texte der Romantik.",
        difficulty = 2,
        funFact = "Friedrich Schlegels Fragment Nr. 116 im Athenäum gilt als das Manifest der Romantik: Er fordert eine 'progressive Universalpoesie', die alle Künste und Wissenschaften vereinen soll."
    ),

    // Question 35 — Friedrich Schlegel
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welchen wichtigen Begriff prägte Friedrich Schlegel für die Selbstbezüglichkeit und den Witz romantischer Dichtung?",
        answerA = "Das Erhabene",
        answerB = "Die Arabeske",
        answerC = "Die romantische Ironie",
        answerD = "Das Wunderbare",
        correctAnswer = 2,
        explanation = "Friedrich Schlegel entwickelte das Konzept der 'romantischen Ironie': Der Dichter schafft eine Welt, durchbricht sie aber bewusst, um seine eigene Freiheit als Schöpfer zu demonstrieren.",
        difficulty = 2,
        funFact = "Friedrich Schlegels Liebesroman 'Lucinde' (1799) war für seine Zeit ein Skandal — er propagierte freie Liebe und Gleichberechtigung der Geschlechter und wurde von Schleiermacher verteidigt."
    ),

    // Question 36 — Weimarer Klassik: Merkmale
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welcher Zeitraum gilt üblicherweise als die Epoche der Weimarer Klassik?",
        answerA = "1750 bis 1780",
        answerB = "1770 bis 1790",
        answerC = "1780 bis 1805",
        answerD = "1786 bis 1832",
        correctAnswer = 3,
        explanation = "Die Weimarer Klassik wird meist von Goethes Italienreise (1786) bis zu seinem Tod (1832) datiert — der Kern liegt in der Zusammenarbeit mit Schiller (1794–1805).",
        difficulty = 2,
        funFact = "Der Begriff 'Weimarer Klassik' entstand erst im Nachhinein — Goethe und Schiller selbst nannten ihre Epoche nicht so. Weimar wurde zum Zentrum, weil Goethe dort am herzoglichen Hof lebte."
    ),

    // Question 37 — Weimarer Klassik: Iphigenie
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welches antike Thema verarbeitet Goethe in seinem klassischen Drama 'Iphigenie auf Tauris' (1787)?",
        answerA = "Die Priesterin Iphigenie und ihre Rückkehr nach Griechenland",
        answerB = "Die Irrfahrten des Odysseus nach dem Trojanischen Krieg",
        answerC = "Die Gründung Roms durch Aeneas",
        answerD = "Der Mythos von Orpheus und Eurydike",
        correctAnswer = 0,
        explanation = "Goethe verarbeitet den Mythos der Iphigenie, Priesterin der Artemis auf Tauris. Das Drama handelt von Humanität, Menschlichkeit und der Überwindung des Fluchs des Tantaliden-Geschlechts.",
        difficulty = 2,
        funFact = "Goethe schrieb die Prosafassung der Iphigenie bereits 1779, bearbeitete sie aber in Italien 1787 in klassische Verse um — das Stück gilt als sein 'reinstes' Werk."
    ),

    // Question 38 — Sturm und Drang
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welche literarische Bewegung ging der Weimarer Klassik unmittelbar voraus und beeinflusste Goethe und Schiller stark?",
        answerA = "Die Aufklärung",
        answerB = "Sturm und Drang",
        answerC = "Der Pietismus",
        answerD = "Der Rokoko",
        correctAnswer = 1,
        explanation = "Der Sturm und Drang (ca. 1765–1785) war eine literarische Bewegung des Gefühls und Protests gegen Vernunft und Konventionen. Goethe und Schiller begannen beide als Sturm-und-Drang-Autoren.",
        difficulty = 2,
        funFact = "Der Name 'Sturm und Drang' geht auf ein Schauspiel von Friedrich Maximilian Klinger (1776) zurück. Der eigentliche Protagonist der Bewegung war der Dichter und Herder-Schüler Johann Gottfried Herder."
    ),

    // Question 39 — Romantik: Merkmale
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welches Kunstprinzip der Romantik fordert, dass Dichtung Philosophie, Poesie und Wissenschaft vereinen soll?",
        answerA = "Das Gesamtkunstwerk",
        answerB = "Die Arabeske",
        answerC = "Die progressive Universalpoesie",
        answerD = "Das Wunderbar-Reale",
        correctAnswer = 2,
        explanation = "Friedrich Schlegel prägte den Begriff 'progressive Universalpoesie' im Athenäum: Dichtung soll sich ständig weiterentwickeln und alle Bereiche des menschlichen Geistes vereinen.",
        difficulty = 2,
        funFact = "Das Konzept der Universalpoesie beeinflusste Richard Wagner, der es auf Musik übertrug und sein 'Gesamtkunstwerk' entwickelte — Oper als Einheit von Musik, Dichtung und Bühnenkunst."
    ),

    // Question 40 — Romantik: Zeitraum
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Wie wird die erste Phase der deutschen Romantik bezeichnet, die in Jena um 1798 entstand?",
        answerA = "Berliner Romantik",
        answerB = "Hochromantik",
        answerC = "Heidelberger Romantik",
        answerD = "Jenaer Frühromantik",
        correctAnswer = 3,
        explanation = "Die Jenaer Frühromantik (um 1798–1804) mit den Schlegels, Novalis und Tieck bildete die erste Phase. Es folgte die Heidelberger Romantik (Brentano, Arnim) und die Berliner Spätromantik.",
        difficulty = 2,
        funFact = "Jena war um 1800 ein intellektuelles Zentrum Europas: Schiller, Hegel, Fichte, Schelling und die Schlegel-Brüder lehrten und lebten zeitgleich dort — einmalig in der deutschen Geistesgeschichte."
    ),

    // Question 41 — Goethe: Wilhelm Meister
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welche Romanfigur Goethes gilt als Prototyp des deutschen Bildungsromans und gibt dem gleichnamigen Genre seinen Namen?",
        answerA = "Wilhelm Meister",
        answerB = "Hermann (aus 'Hermann und Dorothea')",
        answerC = "Werther",
        answerD = "Faust",
        correctAnswer = 0,
        explanation = "'Wilhelm Meisters Lehrjahre' (1795/96) begründete den Bildungsroman als Genre: die Entwicklung eines jungen Menschen zur Reife durch Erfahrungen und Begegnungen.",
        difficulty = 2,
        funFact = "Die mysteriöse Figur Mignon in Wilhelm Meister — das italientümende Mädchen, das 'Kennst du das Land, wo die Zitronen blühn?' singt — ist eine der rätselhaftesten Figuren der deutschen Literatur."
    ),

    // Question 42 — Schiller: Wallenstein
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Aus wie vielen Teilen besteht Schillers 'Wallenstein'-Trilogie, die 1800/01 erschien?",
        answerA = "Zwei Teile",
        answerB = "Drei Teile",
        answerC = "Vier Teile",
        answerD = "Fünf Akte in einem Stück",
        correctAnswer = 1,
        explanation = "Die Wallenstein-Trilogie besteht aus 'Wallensteins Lager', 'Die Piccolomini' und 'Wallensteins Tod' — Schillers umfangreichstes Bühnenprojekt.",
        difficulty = 2,
        funFact = "Die Uraufführung von 'Wallensteins Lager' am 12. Oktober 1798 im Weimarer Hoftheater eröffnete das neu umgebaute Theater — Goethe inszenierte das Stück persönlich."
    ),

    // Question 43 — Romantik: Natur und Landschaft
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welcher Maler der deutschen Romantik schuf das Bild 'Wanderer über dem Nebelmeer', das als Sinnbild romantischer Weltsicht gilt?",
        answerA = "Philipp Otto Runge",
        answerB = "Carl Blechen",
        answerC = "Caspar David Friedrich",
        answerD = "Moritz von Schwind",
        correctAnswer = 2,
        explanation = "Caspar David Friedrich (1774–1840) malte um 1818 den 'Wanderer über dem Nebelmeer' — eine Rückenfigur, die allein in eine geheimnisvolle Landschaft schaut, Inbegriff romantischen Weltgefühls.",
        difficulty = 2,
        funFact = "Caspar David Friedrichs Werke gerieten nach seinem Tod in Vergessenheit — erst im 20. Jahrhundert wurden sie wiederentdeckt. Die Nazis missbrauchten seinen Stil für Propagandazwecke, was die Rezeption erschwerte."
    ),

    // Question 44 — Kleist: Das Käthchen von Heilbronn
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welcher deutschen Stadt spielt Kleists mittelalterliches Schauspiel 'Das Käthchen von Heilbronn' (1810)?",
        answerA = "Nürnberg",
        answerB = "Augsburg",
        answerC = "Ulm",
        answerD = "Heilbronn (Schwaben/Swabia)",
        correctAnswer = 3,
        explanation = "'Das Käthchen von Heilbronn' spielt im mittelalterlichen Heilbronn und in Schwaben. Es ist eines von Kleists wenigen Stücken mit glücklichem Ausgang.",
        difficulty = 2,
        funFact = "Kleist selbst nannte Das Käthchen 'die Kehrseite der Penthesilea' — beide Stücke handeln von extremer, bedingungsloser Liebe, aber mit entgegengesetzten Vorzeichen."
    ),

    // Question 45 — Heine: Romantische Schule
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wie lautet der Titel von Heines kritischem Essay (1836), in dem er die deutsche Romantik und ihre Autoren analysiert?",
        answerA = "Die romantische Schule",
        answerB = "Zur Geschichte der Religion und Philosophie in Deutschland",
        answerC = "Reisebilder",
        answerD = "Französische Maler",
        correctAnswer = 0,
        explanation = "'Die romantische Schule' (1836) ist Heines wichtigstes literaturkritisches Werk — er analysiert und kritisiert darin die Romantik als rückwärtsgewandte Bewegung.",
        difficulty = 2,
        funFact = "Heine schrieb 'Die romantische Schule' ursprünglich auf Französisch für ein Pariser Publikum. Er wollte den Franzosen erklären, was die deutsche Literatur ausmacht."
    ),

    // Question 46 — Goethe: Italienreise
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wie lange dauerte Goethes berühmte Italienreise, die 1786 begann und ihn entscheidend zur Klassik führte?",
        answerA = "Sechs Monate",
        answerB = "Zwei Jahre",
        answerC = "Ein Jahr",
        answerD = "Drei Jahre",
        correctAnswer = 1,
        explanation = "Goethe brach am 3. September 1786 heimlich nach Italien auf und kehrte erst im Juni 1788 nach Weimar zurück — zwei Jahre, die ihn künstlerisch völlig verwandelten.",
        difficulty = 2,
        funFact = "Goethe reiste incognito unter dem Namen 'Johann Philipp Möller' — er wollte nicht als berühmter Autor erkannt werden und sich ganz der Kunst und Natur widmen."
    ),

    // Question 47 — Novalis: Berufsstand
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welchem bürgerlichen Beruf ging Novalis neben seiner dichterischen Tätigkeit nach?",
        answerA = "Jurist und Rechtsanwalt",
        answerB = "Pfarrer und Theologe",
        answerC = "Bergbauinspektor im Salinenwesen",
        answerD = "Leibarzt am Weimarer Hof",
        correctAnswer = 2,
        explanation = "Novalis war ausgebildeter Bergbauingenieur und arbeitete als Salineninspektor in Weißenfels. Seine Kenntnis des Bergbaus fließt in 'Heinrich von Ofterdingen' ein.",
        difficulty = 2,
        funFact = "Die Bergbausymbolik in Novalis' Werk ist nicht zufällig: Für ihn war das Vordringen in die Erde eine Metapher für die Erforschung des menschlichen Inneren — beide führen zu verborgenen Schätzen."
    ),

    // Question 48 — Schiller: Cabal and Love
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welchen Gesellschaftskonflikt stellt Schillers Bürgerdrama 'Kabale und Liebe' (1784) in den Mittelpunkt?",
        answerA = "Den Konflikt zwischen Absolutismus und Aufklärung",
        answerB = "Die Unterdrückung der Bauern durch den Adel",
        answerC = "Den Gegensatz zwischen Protestantismus und Katholizismus",
        answerD = "Die unmögliche Liebe zwischen Adel und Bürgertum",
        correctAnswer = 3,
        explanation = "'Kabale und Liebe' zeigt die tragische Liebe zwischen dem Adelssohn Ferdinand und der Bürgerstochter Luise — eine Verbindung, die die Standesgesellschaft mit Intrigen zerstört.",
        difficulty = 2,
        funFact = "Schiller schrieb 'Kabale und Liebe' ursprünglich unter dem Titel 'Luise Millerin'. Der neue Titel wurde auf Vorschlag des Regisseurs Dalberg gewählt, der damit den politischen Doppelcharakter betonte."
    ),

    // Question 49 — E.T.A. Hoffmann: Oper
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welche Oper komponierte E.T.A. Hoffmann, die 1816 uraufgeführt wurde und als erste bedeutende romantische deutsche Oper gilt?",
        answerA = "Undine",
        answerB = "Olimpia",
        answerC = "Der Freischütz",
        answerD = "Euryanthe",
        correctAnswer = 0,
        explanation = "'Undine' (1816) gilt als Hoffmanns bedeutendstes musikalisches Werk und als wichtige Vorläuferin der romantischen deutschen Oper, die kurz danach durch Webers 'Freischütz' populär wurde.",
        difficulty = 2,
        funFact = "E.T.A. Hoffmann war nicht nur Schriftsteller, sondern auch professioneller Musiker, Komponist und Dirigent. Er war einer der ersten bedeutenden deutschen Musikkritiker und schrieb u.a. eine Besprechung von Beethovens 5. Sinfonie."
    ),

    // Question 50 — Romantik: Volksmärchen
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wessen Sammlung von Kinder- und Hausmärchen (ab 1812) wurde von der Romantik inspiriert und gilt heute als wichtigstes Märchenbuch der Welt?",
        answerA = "Ludwig Tieck und Wilhelm Wackenroder",
        answerB = "Jacob und Wilhelm Grimm",
        answerC = "Clemens Brentano und Achim von Arnim",
        answerD = "Friedrich de la Motte Fouqué und Adelbert von Chamisso",
        correctAnswer = 1,
        explanation = "Die Gebrüder Grimm veröffentlichten ab 1812 ihre 'Kinder- und Hausmärchen' — stark beeinflusst von der romantischen Begeisterung für Volkskultur und mündliche Überlieferung.",
        difficulty = 2,
        funFact = "Entgegen der verbreiteten Meinung sammelten die Grimms ihre Märchen nicht von einfachen Bauern, sondern befragten oft gebildete Frauen aus dem Bürgertum — viele Märchen haben französische Ursprünge."
    )
)
