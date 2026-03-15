package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun literatureQuestions(): List<Question> = listOf(

    // ── EASY (difficulty = 1) ── ~10 questions ──────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Wer schrieb das Drama 'Faust'?",
        answerA = "Friedrich Schiller",
        answerB = "Johann Wolfgang von Goethe",
        answerC = "Heinrich Heine",
        answerD = "Bertolt Brecht",
        correctAnswer = 1,
        explanation = "Johann Wolfgang von Goethe schrieb 'Faust', eines der bedeutendsten Werke der deutschen Literatur. Teil I erschien 1808, Teil II 1832.",
        difficulty = 1,
        funFact = "Goethe arbeitete über 60 Jahre an 'Faust' – von seiner Jugend bis kurz vor seinem Tod."
    ),

    Question(
        categoryId = 10,
        questionText = "Welches Märchen beginnt mit den Worten 'Es war einmal ein kleines Mädchen, das immer ein rotes Käppchen trug'?",
        answerA = "Schneewittchen",
        answerB = "Aschenputtel",
        answerC = "Rotkäppchen",
        answerD = "Dornröschen",
        correctAnswer = 2,
        explanation = "Rotkäppchen ist eines der bekanntesten Märchen der Gebrüder Grimm und handelt von einem Mädchen, das durch den Wald zu seiner Großmutter geht.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Wie viele Buchstaben hat das deutsche Alphabet?",
        answerA = "26",
        answerB = "28",
        answerC = "30",
        answerD = "32",
        correctAnswer = 0,
        explanation = "Das deutsche Alphabet besteht wie das englische aus 26 Buchstaben. Zusätzlich gibt es die Umlaute ä, ö, ü und das ß, die aber nicht zum Grundalphabet zählen.",
        difficulty = 1,
        funFact = "Das ß (Eszett) ist der einzige Buchstabe, der nur in der deutschen Sprache vorkommt."
    ),

    Question(
        categoryId = 10,
        questionText = "Von wem stammt das Gedicht 'Der Erlkönig'?",
        answerA = "Friedrich Schiller",
        answerB = "Heinrich Heine",
        answerC = "Johann Wolfgang von Goethe",
        answerD = "Rainer Maria Rilke",
        correctAnswer = 2,
        explanation = "Das Gedicht 'Der Erlkönig' wurde 1782 von Johann Wolfgang von Goethe verfasst und 1815 von Franz Schubert vertont.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Wer schrieb 'Die Leiden des jungen Werthers'?",
        answerA = "Friedrich Hölderlin",
        answerB = "Johann Wolfgang von Goethe",
        answerC = "Friedrich Schiller",
        answerD = "Novalis",
        correctAnswer = 1,
        explanation = "'Die Leiden des jungen Werthers' (1774) ist ein Briefroman von Goethe, der ihn schlagartig berühmt machte und eine europaweite Wertherfieber-Bewegung auslöste.",
        difficulty = 1,
        funFact = "Nach der Veröffentlichung soll es in Europa eine Welle von Nachahmungs-Selbstmorden gegeben haben – das sogenannte 'Werther-Fieber'."
    ),

    Question(
        categoryId = 10,
        questionText = "Welches Tier spielt die Hauptrolle in Franz Kafkas Erzählung 'Die Verwandlung'?",
        answerA = "Eine Ratte",
        answerB = "Eine Spinne",
        answerC = "Ein Käfer (Ungeziefer)",
        answerD = "Ein Wurm",
        correctAnswer = 2,
        explanation = "In Kafkas 'Die Verwandlung' (1915) verwandelt sich Gregor Samsa über Nacht in ein riesiges Ungeziefer, das oft als Käfer interpretiert wird.",
        difficulty = 1,
        funFact = "Kafka selbst wollte nie, dass das Tier auf dem Buchcover abgebildet wird – er ließ die genaue Art bewusst offen."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist ein Haiku?",
        answerA = "Ein chinesisches Epos",
        answerB = "Eine japanische Gedichtform mit 17 Silben",
        answerC = "Ein arabisches Märchen",
        answerD = "Eine indische Ballade",
        correctAnswer = 1,
        explanation = "Ein Haiku ist eine japanische Gedichtform aus drei Versen mit 5-7-5 Silben. Es thematisiert oft Natur und den gegenwärtigen Moment.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Wer schrieb 'Romeo und Julia'?",
        answerA = "Charles Dickens",
        answerB = "Oscar Wilde",
        answerC = "William Shakespeare",
        answerD = "Geoffrey Chaucer",
        correctAnswer = 2,
        explanation = "'Romeo und Julia' ist eine der berühmtesten Tragödien von William Shakespeare, geschrieben um 1594–1596.",
        difficulty = 1,
        funFact = "Die Geschichte basiert auf einer italienischen Novelle von Matteo Bandello aus dem Jahr 1554."
    ),

    Question(
        categoryId = 10,
        questionText = "Welche Sprache hat die meisten Muttersprachler weltweit?",
        answerA = "Englisch",
        answerB = "Spanisch",
        answerC = "Mandarin-Chinesisch",
        answerD = "Arabisch",
        correctAnswer = 2,
        explanation = "Mandarin-Chinesisch hat mit über einer Milliarde Muttersprachlern die meisten nativen Sprecher weltweit, vor Spanisch und Englisch.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welches Buch beginnt mit dem Satz 'Es ist ein Irrtum zu glauben, man könnte über den Schmerz hinwegtäuschen'?",
        answerA = "Der Steppenwolf",
        answerB = "Die Blechtrommel",
        answerC = "Siddharta",
        answerD = "Demian",
        correctAnswer = 0,
        explanation = "'Der Steppenwolf' (1927) von Hermann Hesse ist ein literarischer Roman über die gespaltene Seele eines Intellektuellen.",
        difficulty = 1,
        funFact = null
    ),

    // ── MEDIUM (difficulty = 2) ── ~15 questions ────────────────────────────

    Question(
        categoryId = 10,
        questionText = "In welchem Jahr wurde der Roman 'Der Prozess' von Franz Kafka veröffentlicht?",
        answerA = "1912",
        answerB = "1920",
        answerC = "1925",
        answerD = "1930",
        correctAnswer = 2,
        explanation = "'Der Prozess' wurde posthum 1925 von Max Brod veröffentlicht, obwohl Kafka ihn vernichtet haben wollte. Er handelt von Josef K., der ohne erkennbaren Grund verhaftet wird.",
        difficulty = 2,
        funFact = "Kafka bat seinen Freund Max Brod ausdrücklich, alle seine unveröffentlichten Werke nach seinem Tod zu verbrennen. Brod tat es nicht."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher deutsche Dichter schrieb die 'Ode an die Freude', die Beethoven vertonte?",
        answerA = "Johann Wolfgang von Goethe",
        answerB = "Friedrich Schiller",
        answerC = "Heinrich Heine",
        answerD = "Friedrich Hölderlin",
        correctAnswer = 1,
        explanation = "Friedrich Schiller schrieb 1785 das Gedicht 'An die Freude'. Ludwig van Beethoven vertonte es 1824 im letzten Satz seiner 9. Sinfonie.",
        difficulty = 2,
        funFact = "Schillers 'Ode an die Freude' ist heute die Hymne der Europäischen Union."
    ),

    Question(
        categoryId = 10,
        questionText = "Wer erhielt als erster deutschsprachiger Autor den Nobelpreis für Literatur?",
        answerA = "Thomas Mann",
        answerB = "Gerhart Hauptmann",
        answerC = "Paul Heyse",
        answerD = "Theodor Mommsen",
        correctAnswer = 2,
        explanation = "Paul Heyse erhielt 1910 den Nobelpreis für Literatur, als erster deutschsprachiger Literatur-Nobelpreisträger. Theodor Mommsen erhielt ihn 1902 für Geschichtsschreibung.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Was bedeutet das literarische Stilmittel 'Metapher'?",
        answerA = "Die Wiederholung eines Satzes am Satzende",
        answerB = "Ein übertragener Vergleich ohne 'wie'",
        answerC = "Die Umkehrung der normalen Wortfolge",
        answerD = "Eine übertriebene Darstellung",
        correctAnswer = 1,
        explanation = "Eine Metapher ist ein sprachliches Bild, bei dem ein Wort oder Ausdruck in einem übertragenen Sinn verwendet wird, ohne 'wie' oder 'als'. Beispiel: 'Das Leben ist ein Traum'.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Roman von Thomas Mann gewann ihm den Nobelpreis für Literatur (1929)?",
        answerA = "Der Zauberberg",
        answerB = "Doktor Faustus",
        answerC = "Buddenbrooks",
        answerD = "Der Tod in Venedig",
        correctAnswer = 2,
        explanation = "Thomas Mann erhielt 1929 den Nobelpreis für Literatur, hauptsächlich für seinen Roman 'Buddenbrooks' (1901), ein Generationenroman über den Verfall einer Kaufmannsfamilie.",
        difficulty = 2,
        funFact = "Thomas Mann schrieb 'Buddenbrooks' mit nur 25 Jahren."
    ),

    Question(
        categoryId = 10,
        questionText = "Welche Sprache ist die Ursprache der romanischen Sprachfamilie?",
        answerA = "Griechisch",
        answerB = "Latein",
        answerC = "Arabisch",
        answerD = "Sanskrit",
        correctAnswer = 1,
        explanation = "Die romanischen Sprachen (Französisch, Spanisch, Italienisch, Portugiesisch, Rumänisch usw.) entstanden alle aus dem Vulgärlatein, der gesprochenen Form des Lateinischen.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist eine 'Allegorie' in der Literatur?",
        answerA = "Eine kurze Geschichte mit moralischer Lehre",
        answerB = "Eine fortlaufende Darstellung, bei der abstrakte Begriffe als Personen oder Objekte dargestellt werden",
        answerC = "Ein Gedicht mit festem Reimschema",
        answerD = "Eine Übertreibung zur Betonung",
        correctAnswer = 1,
        explanation = "Eine Allegorie ist eine bildhafte Darstellung abstrakter Ideen durch konkrete Personen, Handlungen oder Objekte. Beispiel: 'Der Tod' als Sensenmann.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welches Buch schrieb Antoine de Saint-Exupéry und wurde weltberühmt?",
        answerA = "Der kleine Prinz",
        answerB = "Die Miserables",
        answerC = "Der Graf von Monte Christo",
        answerD = "Candide",
        correctAnswer = 0,
        explanation = "'Der kleine Prinz' (1943) von Antoine de Saint-Exupéry ist eines der meistverkauften Bücher der Welt und wurde in über 300 Sprachen übersetzt.",
        difficulty = 2,
        funFact = "Der kleine Prinz ist nach der Bibel und dem Werk von Marx das meistübersetzte Buch der Welt."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Autor schrieb '1984' und 'Farm der Tiere'?",
        answerA = "Aldous Huxley",
        answerB = "Ray Bradbury",
        answerC = "George Orwell",
        answerD = "H.G. Wells",
        correctAnswer = 2,
        explanation = "George Orwell (eigentlich Eric Arthur Blair) schrieb beide dystopischen Werke: 'Farm der Tiere' (1945) als Satire auf den Stalinismus und '1984' (1949) als Warnung vor totalitären Systemen.",
        difficulty = 2,
        funFact = "Orwells Begriff 'Orwellsch' ist heute ein eigenständiges Adjektiv im Duden."
    ),

    Question(
        categoryId = 10,
        questionText = "Was versteht man unter 'Sturm und Drang' in der deutschen Literatur?",
        answerA = "Eine barocke Stilrichtung des 17. Jahrhunderts",
        answerB = "Eine literarische Bewegung der deutschen Klassik um 1800",
        answerC = "Eine literarische Jugendbewegung der 1770er-Jahre mit Betonung von Gefühl und Natur",
        answerD = "Eine expressionistische Strömung des 20. Jahrhunderts",
        correctAnswer = 2,
        explanation = "'Sturm und Drang' war eine literarische Bewegung in Deutschland (ca. 1765–1785), die Vernunft zugunsten von Gefühl, Leidenschaft und Naturerlebnis ablehnte. Goethe und Schiller waren wichtige Vertreter.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welche Sprache wird in Brasilien gesprochen?",
        answerA = "Spanisch",
        answerB = "Portugiesisch",
        answerC = "Brasilianisch",
        answerD = "Französisch",
        correctAnswer = 1,
        explanation = "In Brasilien wird Portugiesisch gesprochen. Brasilien ist das einzige portugiesischsprachige Land in Südamerika – ein Erbe der Kolonisierung durch Portugal ab 1500.",
        difficulty = 2,
        funFact = "Brasilien hat mit über 200 Millionen Einwohnern mehr Portugiesischsprecher als Portugal selbst."
    ),

    Question(
        categoryId = 10,
        questionText = "Wer schrieb das Drama 'Die Räuber' (1781)?",
        answerA = "Johann Wolfgang von Goethe",
        answerB = "Friedrich Schiller",
        answerC = "Gotthold Ephraim Lessing",
        answerD = "Friedrich Hölderlin",
        correctAnswer = 1,
        explanation = "'Die Räuber' ist Friedrich Schillers erstes Drama, uraufgeführt 1782 in Mannheim. Es thematisiert den Konflikt zwischen zwei Brüdern und Freiheit versus Tyrannei.",
        difficulty = 2,
        funFact = "Schiller schrieb 'Die Räuber' heimlich, als er noch Militärarzt war. Die Uraufführung besuchte er unerlaubt – was fast zu seiner Verhaftung führte."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist ein 'Sonett'?",
        answerA = "Ein Gedicht aus 14 Zeilen, unterteilt in zwei Quartette und zwei Terzette",
        answerB = "Ein langes Epos mit mehr als 100 Strophen",
        answerC = "Eine Kurzgeschichte in Versform",
        answerD = "Ein Gedicht ohne Reimschema",
        correctAnswer = 0,
        explanation = "Das Sonett ist eine Gedichtform mit genau 14 Zeilen: zwei Vierzeilige Strophen (Quartette) und zwei dreizeilige Strophen (Terzette). Bekannte Meister waren Petrarca, Shakespeare und Goethe.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Autor schrieb 'Homo Faber'?",
        answerA = "Max Frisch",
        answerB = "Friedrich Dürrenmatt",
        answerC = "Stefan Zweig",
        answerD = "Robert Musil",
        correctAnswer = 0,
        explanation = "'Homo Faber' (1957) ist ein Roman des Schweizer Autors Max Frisch. Er erzählt die Geschichte des rationalen Ingenieurs Walter Faber, der zufällig seiner Tochter begegnet.",
        difficulty = 2,
        funFact = "Max Frisch und Friedrich Dürrenmatt gelten als die zwei bedeutendsten Schweizer Autoren des 20. Jahrhunderts."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist Esperanto?",
        answerA = "Eine ausgestorbene lateinische Mundart",
        answerB = "Eine künstliche Plansprache, die 1887 von Ludwig Lazarus Zamenhof entwickelt wurde",
        answerC = "Eine Mischsprache aus Spanisch und Portugiesisch",
        answerD = "Ein alter Dialekt auf den Balearen",
        correctAnswer = 1,
        explanation = "Esperanto ist eine vom polnischen Augenarzt Ludwig Lazarus Zamenhof konstruierte Plansprache mit dem Ziel, als internationale Verkehrssprache zu dienen.",
        difficulty = 2,
        funFact = "Weltweit sprechen schätzungsweise 2 Millionen Menschen Esperanto, und einige Kinder wachsen damit als Muttersprache auf."
    ),

    // ── HARD (difficulty = 3) ── ~12 questions ──────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Was ist der 'Bildungsroman' als literarische Gattung?",
        answerA = "Ein Roman, der nur für Schüler und Studenten geschrieben wurde",
        answerB = "Ein Roman, der die innere Entwicklung und Reifung des Protagonisten von der Jugend zum Erwachsensein schildert",
        answerC = "Ein didaktisches Sachbuch über Erziehung",
        answerD = "Ein Roman, der ausschließlich in Schulen spielt",
        correctAnswer = 1,
        explanation = "Der Bildungsroman ist eine deutsche literarische Gattung, die die geistig-seelische Entwicklung des Protagonisten zeigt. Goethes 'Wilhelm Meisters Lehrjahre' gilt als Urform.",
        difficulty = 3,
        funFact = "Der Begriff 'Bildungsroman' wurde 1870 vom Literaturwissenschaftler Wilhelm Dilthey geprägt."
    ),

    Question(
        categoryId = 10,
        questionText = "Welche literarische Technik wird als 'Stream of Consciousness' bezeichnet?",
        answerA = "Die chronologische Erzählweise eines Romans",
        answerB = "Das direkte Wiedergeben des ungeordneten Gedankenstroms einer Figur",
        answerC = "Das Einblenden von Träumen in eine Handlung",
        answerD = "Die Technik des unzuverlässigen Erzählers",
        correctAnswer = 1,
        explanation = "'Stream of Consciousness' (Bewusstseinsstrom) ist eine narrative Technik, bei der direkt der innere Gedankenfluss einer Figur wiedergegeben wird, oft ohne grammatische Struktur. James Joyce und Virginia Woolf sind bekannte Vertreter.",
        difficulty = 3,
        funFact = "James Joyces 'Ulysses' gilt als Meisterwerk des Bewusstseinsstroms – das letzte Kapitel enthält 24.000 Wörter ohne einziges Satzzeichen."
    ),

    Question(
        categoryId = 10,
        questionText = "Wer schrieb das epische Gedicht 'Das Nibelungenlied'?",
        answerA = "Walther von der Vogelweide",
        answerB = "Wolfram von Eschenbach",
        answerC = "Der Autor ist unbekannt",
        answerD = "Hartmann von Aue",
        correctAnswer = 2,
        explanation = "Das Nibelungenlied (um 1200) ist ein mittelhochdeutsches Heldenepos mit unbekanntem Verfasser. Es erzählt die Geschichte von Siegfried, Kriemhild und dem Untergang der Burgunden.",
        difficulty = 3,
        funFact = "Das Nibelungenlied wurde 2009 von der UNESCO in das Weltdokumentenerbe aufgenommen."
    ),

    Question(
        categoryId = 10,
        questionText = "Was bezeichnet der Begriff 'Intertextualität' in der Literaturwissenschaft?",
        answerA = "Die Textanalyse innerhalb eines einzigen Werkes",
        answerB = "Den Bezug eines Textes auf andere Texte durch Zitate, Anspielungen oder Übernahmen",
        answerC = "Die Übersetzung literarischer Texte in andere Sprachen",
        answerD = "Die Textstruktur epischer Großwerke",
        correctAnswer = 1,
        explanation = "Intertextualität bezeichnet die Bezüge zwischen Texten – Zitate, Anspielungen, Paraphrasen oder Parodien auf andere Werke. Der Begriff wurde von der Literaturtheoretikerin Julia Kristeva geprägt.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Autor erhielt den Literaturnobelpreis 2019?",
        answerA = "Olga Tokarczuk",
        answerB = "Peter Handke",
        answerC = "Haruki Murakami",
        answerD = "Margaret Atwood",
        correctAnswer = 1,
        explanation = "Peter Handke erhielt den Literaturnobelpreis 2019. Olga Tokarczuk erhielt den aufgeschobenen Preis für 2018. Die Vergabe an Handke war umstritten wegen seiner pro-serbischen Haltung.",
        difficulty = 3,
        funFact = "In diesem Jahr wurden zwei Nobelpreise für Literatur vergeben, da der Preis 2018 wegen eines Skandals in der Schwedischen Akademie ausgesetzt wurde."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist das Besondere an der Sprachstruktur des Deutschen im Vergleich zu Englisch?",
        answerA = "Deutsch hat keine Artikel",
        answerB = "Deutsch kennt vier grammatische Fälle (Kasus): Nominativ, Genitiv, Dativ, Akkusativ",
        answerC = "Deutsch hat kein Futur",
        answerD = "Deutsch verwendet ausschließlich Präteritum für vergangene Ereignisse",
        correctAnswer = 1,
        explanation = "Das Deutsche besitzt vier Kasus: Nominativ (Subjekt), Genitiv (Besitz), Dativ (indirektes Objekt) und Akkusativ (direktes Objekt). Das Englische hat diese Kasusunterscheidung weitgehend verloren.",
        difficulty = 3,
        funFact = "Das Altgermanische hatte noch sechs Fälle – Nominativ, Genitiv, Dativ, Akkusativ, Instrumental und Vokativ."
    ),

    Question(
        categoryId = 10,
        questionText = "Wer verfasste das mittelhochdeutsche Epos 'Parzival'?",
        answerA = "Hartmann von Aue",
        answerB = "Walther von der Vogelweide",
        answerC = "Gottfried von Straßburg",
        answerD = "Wolfram von Eschenbach",
        correctAnswer = 3,
        explanation = "'Parzival' (um 1210) ist ein mittelhochdeutsches Versroman von Wolfram von Eschenbach. Es erzählt die Suche des Ritters Parzival nach dem Heiligen Gral.",
        difficulty = 3,
        funFact = "Richard Wagners Oper 'Parsifal' (1882) basiert auf Wolfram von Eschenbachs Epos."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist eine 'Synekdoche' als Stilmittel?",
        answerA = "Eine Übertreibung zur dramatischen Wirkung",
        answerB = "Die Verwechslung ähnlich klingender Wörter",
        answerC = "Das Ersetzen eines Begriffs durch einen Teil davon (pars pro toto) oder umgekehrt (totum pro parte)",
        answerD = "Ein Vergleich mit 'wie' oder 'als'",
        correctAnswer = 2,
        explanation = "Die Synekdoche ist ein Stilmittel, bei dem ein Teil für das Ganze steht (pars pro toto) oder das Ganze für einen Teil (totum pro parte). Beispiel: 'Gib mir eine Hand' für 'Hilf mir'.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welche Sprache hat die meisten Wörter im Wörterbuch?",
        answerA = "Deutsch",
        answerB = "Englisch",
        answerC = "Französisch",
        answerD = "Russisch",
        correctAnswer = 1,
        explanation = "Das Englische gilt mit schätzungsweise über 600.000 Wörtern im Oxford English Dictionary als die Sprache mit dem größten Wortschatz, was auch auf die vielen Entlehnungen aus anderen Sprachen zurückzuführen ist.",
        difficulty = 3,
        funFact = "Das Deutsche bildet durch Komposition sehr lange Wörter wie 'Donaudampfschifffahrtsgesellschaft', was den Gesamtwortschatz schwer vergleichbar macht."
    ),

    Question(
        categoryId = 10,
        questionText = "Wer schrieb den Roman 'Die Blechtrommel' (1959)?",
        answerA = "Heinrich Böll",
        answerB = "Günter Grass",
        answerC = "Siegfried Lenz",
        answerD = "Martin Walser",
        correctAnswer = 1,
        explanation = "'Die Blechtrommel' ist der bekannteste Roman von Günter Grass. Er erhielt dafür 1999 den Nobelpreis für Literatur. Die Hauptfigur Oskar Matzerath hört mit drei Jahren auf zu wachsen.",
        difficulty = 3,
        funFact = "Günter Grass enthüllte 2006 in seiner Autobiografie, dass er als 17-Jähriger Mitglied der Waffen-SS war – eine Enthüllung, die für großen Aufruhr sorgte."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist der Unterschied zwischen 'Epik', 'Lyrik' und 'Dramatik'?",
        answerA = "Es sind drei verschiedene Zeitepochen der Literaturgeschichte",
        answerB = "Epik = erzählende Texte, Lyrik = Gedichte/gefühlsbetonte Texte, Dramatik = Texte für die Bühne",
        answerC = "Epik = antike Literatur, Lyrik = mittelalterliche Literatur, Dramatik = moderne Literatur",
        answerD = "Es sind drei verschiedene Schreibstile für denselben Inhalt",
        correctAnswer = 1,
        explanation = "Die drei literarischen Grundgattungen: Epik (erzählende Prosa und Versdichtung), Lyrik (Gedichte, subjektiver Ausdruck) und Dramatik (Bühnentexte, Dialog). Diese Einteilung geht auf Aristoteles zurück.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welches Werk gilt als das erste große Epos der Weltliteratur?",
        answerA = "Die Ilias von Homer",
        answerB = "Das Gilgamesch-Epos aus Mesopotamien",
        answerC = "Die Odyssee von Homer",
        answerD = "Das Mahabharata aus Indien",
        correctAnswer = 1,
        explanation = "Das Gilgamesch-Epos (um 2100 v. Chr.) aus dem alten Mesopotamien gilt als das älteste überlieferte literarische Großwerk der Menschheit. Es handelt von König Gilgamesch und seiner Suche nach Unsterblichkeit.",
        difficulty = 3,
        funFact = "Das Gilgamesch-Epos enthält eine Sintflutgeschichte, die der biblischen Erzählung Noahs sehr ähnelt – und Jahrhunderte früher niedergeschrieben wurde."
    ),

    // ── EXPERT (difficulty = 4) ── ~8 questions ─────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Was bezeichnet der Begriff 'Dekonstruktion' in der Literaturtheorie nach Jacques Derrida?",
        answerA = "Das physische Zerlegen eines Buches zu Analysezwecken",
        answerB = "Eine Methode zur Aufdeckung innerer Widersprüche in Texten und zur Hinterfragung fester Bedeutungen und binärer Oppositionen",
        answerC = "Die Zerstörung traditioneller Reimschemata in der modernen Lyrik",
        answerD = "Die historische Analyse von Textfragmenten",
        correctAnswer = 1,
        explanation = "Die Dekonstruktion nach Derrida ist eine philosophisch-literaturtheoretische Methode, die zeigt, dass Texte keine stabilen Bedeutungen haben. Sie untersucht, wie Texte durch ihre eigene Logik ihre Aussagen unterlaufen.",
        difficulty = 4,
        funFact = "Derridas bekanntester Satz 'Il n'y a pas de hors-texte' (Es gibt kein Außerhalb des Textes) wird oft missverstanden als Leugnung der Realität."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist das 'Sapir-Whorf-Hypothese' in der Linguistik?",
        answerA = "Die These, dass alle Sprachen der Welt von einer Ursprache abstammen",
        answerB = "Die Annahme, dass die Struktur einer Sprache das Denken und die Weltsicht ihrer Sprecher beeinflusst oder bestimmt",
        answerC = "Das Gesetz der minimalen Sprachveränderung über Generationen",
        answerD = "Die Theorie, dass Kinder Sprache durch reine Imitation erwerben",
        correctAnswer = 1,
        explanation = "Die Sapir-Whorf-Hypothese (auch linguistische Relativität) besagt, dass Sprache das Denken beeinflusst. Die starke Version (Sprachdeterminismus) wird heute abgelehnt, die schwache Version (Sprachrelativismus) wird diskutiert.",
        difficulty = 4,
        funFact = "Die Sprache Hopi hat angeblich kein Konzept von linearer Zeit – eine Behauptung von Benjamin Lee Whorf, die später widerlegt wurde."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Literaturtheoretiker entwickelte das Konzept des 'implied author' (impliziter Autor)?",
        answerA = "Roland Barthes",
        answerB = "Gérard Genette",
        answerC = "Wayne C. Booth",
        answerD = "Mikhail Bachtin",
        correctAnswer = 2,
        explanation = "Wayne C. Booth prägte 1961 in 'The Rhetoric of Fiction' den Begriff des 'implied author' – die durch den Text konstruierte Autorpersönlichkeit, die sich vom realen Autor unterscheiden kann.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Was versteht man unter 'Apokryphen' in der Literatur?",
        answerA = "Bücher, die absichtlich mit falscher Autorenangabe veröffentlicht wurden",
        answerB = "Texte zweifelhafter Echtheit oder solche, die nicht in den offiziellen Kanon aufgenommen wurden",
        answerC = "Gedichte ohne bekannten Verfasser aus dem Mittelalter",
        answerD = "Literarische Werke, die nach dem Tod des Autors fertiggestellt wurden",
        correctAnswer = 1,
        explanation = "Apokryphen sind Schriften, die zwar einem Autor oder heiligen Werk zugeschrieben werden, deren Echtheit oder Kanonizität jedoch umstritten ist. Der Begriff stammt ursprünglich aus der Bibelwissenschaft.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welche linguistische Theorie besagt, dass Menschen mit einer angeborenen 'Universalgrammatik' zur Welt kommen?",
        answerA = "Behaviorismus nach Skinner",
        answerB = "Generative Transformationsgrammatik nach Noam Chomsky",
        answerC = "Strukturalismus nach Ferdinand de Saussure",
        answerD = "Kognitive Linguistik nach George Lakoff",
        correctAnswer = 1,
        explanation = "Noam Chomsky postulierte, dass Menschen mit einer angeborenen universellen Grammatik-Grundstruktur ('Language Acquisition Device') zur Welt kommen, die den Spracherwerb erklärt.",
        difficulty = 4,
        funFact = "Chomsky ist nicht nur Linguist, sondern auch einer der bekanntesten politischen Dissidenten und Medienkritiker der USA."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist 'Polyphonie' in der Literatur nach Michail Bachtin?",
        answerA = "Der Einsatz von Dialekten und verschiedenen Sprachregistern in einem Roman",
        answerB = "Das Erzählprinzip, bei dem mehrere gleichberechtigte Stimmen und Bewusstseine im Roman koexistieren, ohne einer dominanten Autorstimme untergeordnet zu sein",
        answerC = "Die simultane Verwendung mehrerer Erzählperspektiven",
        answerD = "Ein Roman mit mehreren Autoren",
        correctAnswer = 1,
        explanation = "Bachtins Konzept der Polyphonie beschreibt Romane (er sah Dostojewski als Meister darin), in denen Figuren mit eigenständiger ideologischer Stimme sprechen, ohne vom Autor kontrolliert zu werden.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welche deutsche Autorin erhielt 2009 den Literaturnobelpreis?",
        answerA = "Christa Wolf",
        answerB = "Ingeborg Bachmann",
        answerC = "Herta Müller",
        answerD = "Elfriede Jelinek",
        correctAnswer = 2,
        explanation = "Herta Müller, geboren in Rumänien als Angehörige der deutschen Minderheit, erhielt 2009 den Nobelpreis für Literatur. Elfriede Jelinek (Österreich) erhielt ihn 2004.",
        difficulty = 4,
        funFact = "Herta Müllers Texte entstammen oft ihrer Erfahrung mit der Securitate, dem rumänischen Geheimdienst unter Ceaușescu."
    ),

    Question(
        categoryId = 10,
        questionText = "Was bezeichnet 'Mise en abyme' als literarisches Strukturprinzip?",
        answerA = "Das plötzliche Ende einer Geschichte ohne Auflösung",
        answerB = "Die Einbettung einer Geschichte in eine Geschichte (Text-im-Text-Struktur), die das Gesamtwerk spiegelt",
        answerC = "Die Technik des unreliable narrator",
        answerD = "Das Prinzip der Handlungsstraffung durch Zeitsprünge",
        correctAnswer = 1,
        explanation = "'Mise en abyme' (aus der Heraldik) bezeichnet in der Literatur eine selbstreflexive Struktur, bei der ein Miniaturabbild des Gesamtwerks im Werk selbst erscheint. Beispiel: ein Theaterstück im Theaterstück (Hamlet).",
        difficulty = 4,
        funFact = "Der Begriff stammt aus der Heraldik: Ein Wappenschild, der in der Mitte ein Miniaturbild desselben Schilds enthält."
    ),

    // ── MASTER (difficulty = 5) ── ~5 questions ──────────────────────────────

    Question(
        categoryId = 10,
        questionText = "Was versteht man unter 'Heteroglossia' (Heteroglossie) in Bachtins Romantheorie?",
        answerA = "Das Vorkommen mehrerer Sprachen in einem einzigen literarischen Text",
        answerB = "Die Vielstimmigkeit sozialer Sprachregister, Dialekte, Jargons und Ideologien innerhalb einer Sprache, die im Roman produktiv genutzt wird",
        answerC = "Die Unfähigkeit einer Sprache, bestimmte Konzepte auszudrücken",
        answerD = "Die Theorie, dass Sprache grundsätzlich mehrdeutig ist",
        correctAnswer = 1,
        explanation = "Bachtins 'Heteroglossie' (Разноречие) bezeichnet die Vielschichtigkeit von Sprache: Jede Äußerung ist von sozialen, historischen und ideologischen Schichten durchdrungen. Der Roman nutzt diese Mehrstimmigkeit kreativ.",
        difficulty = 5,
        funFact = "Bachtin entwickelte seine Theorien unter Stalin und konnte viele Arbeiten jahrzehntelang nicht veröffentlichen."
    ),

    Question(
        categoryId = 10,
        questionText = "Was bezeichnete Hugo Friedrich in 'Die Struktur der modernen Lyrik' (1956) als charakteristisch für moderne Dichtung?",
        answerA = "Rückkehr zu antiken Versformen und klarer Metaphorik",
        answerB = "Dunkler Stil, Entpersönlichung, Dissonanz und das Auseinanderfallen von Form und Inhalt als ästhetisches Programm",
        answerC = "Die Dominanz politischer Inhalte über sprachliche Form",
        answerD = "Die Auflösung der Gattungsgrenzen zwischen Lyrik und Prosa",
        correctAnswer = 1,
        explanation = "Hugo Friedrich analysierte, dass moderne Lyrik (von Baudelaire über Rimbaud bis García Lorca) durch 'leere Transzendenz', bewusste Dunkelheit und Deformation traditioneller Sprachformen geprägt ist.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welches Konzept beschreibt Paul Ricœurs Begriff 'mimesis' in seiner dreiteiligen Struktur (Mimesis I, II, III)?",
        answerA = "Die drei Stadien literarischer Übersetzung: wörtlich, sinngemäß, frei",
        answerB = "Präfiguration (Vorverständnis der Welt), Konfiguration (narrative Gestaltung) und Refiguration (Lesererfahrung als Neugestaltung von Zeit und Identität)",
        answerC = "Die drei Arten literarischer Nachahmung: Epik, Lyrik, Drama nach Aristoteles",
        answerD = "Erzählzeit, erzählte Zeit und die Zeit des Lesens",
        correctAnswer = 1,
        explanation = "In 'Zeit und Erzählung' (1983–85) unterscheidet Ricœur drei Ebenen der Mimesis: die vorgängige Weltkenntnis (I), die narrative Komposition (II) und die transformierende Aneignung durch den Leser (III).",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Was bezeichnet das linguistische Konzept der 'Deixis' und warum ist sie für Literaturanalyse relevant?",
        answerA = "Die Lehre von Bedeutungsverschiebungen im historischen Wandel einer Sprache",
        answerB = "Sprachliche Zeiger (ich, du, hier, jetzt, dieser), die Referenz nur im Kontext der Äußerungssituation erhalten – in Literatur erzeugen sie Immersion oder Desorientierung",
        answerC = "Die Theorie, dass Wörter ihre Bedeutung durch gesellschaftliche Übereinkunft erhalten",
        answerD = "Die Analyse von Wiederholungsstrukturen in poetischen Texten",
        correctAnswer = 1,
        explanation = "Deixis (griech. 'Zeigen') umfasst Ausdrücke wie 'ich', 'hier', 'jetzt', die nur relativ zur Sprechsituation Bedeutung haben. In literarischen Texten erzeugt Deixis Näheeffekte oder – bei absichtlicher Verunsicherung – postmoderne Desorientierung.",
        difficulty = 5,
        funFact = "Kafkas Erzähltechnik setzt Deixis bewusst ein, um Lesende in eine beengende, kontextlose Welt hineinzuziehen."
    ),

    Question(
        categoryId = 10,
        questionText = "Welche These vertreten Whorf und Sapir in der starken Version der linguistischen Relativitätshypothese, und warum gilt sie heute als widerlegt?",
        answerA = "Alle Sprachen haben dieselbe Tiefenstruktur; widerlegt durch Sprachvielfalt",
        answerB = "Sprache determiniert Denken vollständig – Menschen können nur denken, wofür ihre Sprache Wörter hat; widerlegt durch kognitive Universalien, nonverbales Denken und cross-linguistische Studien",
        answerC = "Denken ist unabhängig von Sprache; widerlegt durch Aphasieforschung",
        answerD = "Alle Sprachen entwickeln sich zu einer Weltsprache; widerlegt durch Sprachensterben",
        correctAnswer = 1,
        explanation = "Die starke Sapir-Whorf-Hypothese behauptet sprachlichen Determinismus. Empirische Studien (z.B. Eleanor Roschs Farbwahrnehmungsforschung, Studien zu mathematischem Denken bei sprachlosen Taubstummen) zeigen, dass konzeptuelles Denken ohne sprachliche Kodierung möglich ist.",
        difficulty = 5,
        funFact = "Die schwache Version – Sprache beeinflusst (nicht determiniert) das Denken – wird von modernen Kognitionswissenschaftlern wie Lera Boroditsky noch aktiv erforscht."
    )
)
