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

    // ── NEW EASY (difficulty = 1) ── 15 new questions ───────────────────────

    Question(
        categoryId = 10,
        questionText = "Wer schrieb die Märchensammlung 'Kinder- und Hausmärchen'?",
        answerA = "Hans Christian Andersen",
        answerB = "Ludwig Tieck",
        answerC = "Die Gebrüder Grimm",
        answerD = "Wilhelm Busch",
        correctAnswer = 2,
        explanation = "Jacob und Wilhelm Grimm veröffentlichten ihre berühmte Märchensammlung erstmals 1812. Sie enthält Märchen wie Rotkäppchen, Hänsel und Gretel und Schneewittchen.",
        difficulty = 1,
        funFact = "Die erste Ausgabe enthielt 86 Märchen. Bis zur siebten Ausgabe (1857) war die Sammlung auf 200 Märchen angewachsen."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Däne schrieb 'Das kleine Mädchen mit den Schwefelhölzern' und 'Die kleine Meerjungfrau'?",
        answerA = "August Strindberg",
        answerB = "Hans Christian Andersen",
        answerC = "Henrik Ibsen",
        answerD = "Søren Kierkegaard",
        correctAnswer = 1,
        explanation = "Hans Christian Andersen (1805–1875) war ein dänischer Dichter und Märchenautor, bekannt für Werke wie 'Die kleine Meerjungfrau', 'Das hässliche Entlein' und 'Thumbelina'.",
        difficulty = 1,
        funFact = "Andersen begann als armer Schusterssohn und wurde einer der meistübersetzten Schriftsteller der Welt."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist eine 'Autobiografie'?",
        answerA = "Eine Biografie über eine berühmte Person, geschrieben von einem Journalisten",
        answerB = "Ein Roman über das Leben einer fiktiven Figur",
        answerC = "Die Lebensgeschichte einer Person, von ihr selbst geschrieben",
        answerD = "Ein Tagebuch über tägliche Ereignisse",
        correctAnswer = 2,
        explanation = "Eine Autobiografie ist ein literarisches Werk, in dem eine Person ihr eigenes Leben beschreibt. Sie unterscheidet sich von der Biografie, die von einer anderen Person verfasst wird.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Wie heißt der Zauberschüler in Goethes gleichnamigem Gedicht?",
        answerA = "Das Gedicht nennt keinen Namen",
        answerB = "Hans",
        answerC = "Friedrich",
        answerD = "Klaus",
        correctAnswer = 0,
        explanation = "In Goethes Ballade 'Der Zauberlehrling' (1797) wird der Lehrling nie beim Namen genannt. Er beschwört einen Besen, der Wasser trägt, kann den Zauber aber nicht stoppen.",
        difficulty = 1,
        funFact = "Walt Disney verfilmte den Zauberlehrling 1940 in 'Fantasia' mit Mickey Mouse in der Hauptrolle."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist ein 'Tagebuch' als literarische Form?",
        answerA = "Ein Brief an einen unbekannten Empfänger",
        answerB = "Eine regelmäßige, datierte Aufzeichnung persönlicher Erlebnisse und Gedanken",
        answerC = "Ein kurzer Roman über einen einzigen Tag",
        answerD = "Eine Sammlung von Kurzgeschichten",
        correctAnswer = 1,
        explanation = "Das Tagebuch ist eine literarische Form, bei der persönliche Erlebnisse, Gedanken und Gefühle regelmäßig und datiert aufgezeichnet werden. Bekannte Beispiele sind Anne Franks Tagebuch.",
        difficulty = 1,
        funFact = "Anne Franks Tagebuch wurde in über 70 Sprachen übersetzt und ist eines der meistgelesenen Bücher der Welt."
    ),

    Question(
        categoryId = 10,
        questionText = "Wer schrieb den Roman 'Harry Potter und der Stein der Weisen'?",
        answerA = "Roald Dahl",
        answerB = "J.K. Rowling",
        answerC = "C.S. Lewis",
        answerD = "Philip Pullman",
        correctAnswer = 1,
        explanation = "J.K. Rowling veröffentlichte 1997 'Harry Potter und der Stein der Weisen', den ersten Band der siebenteiligen Harry-Potter-Reihe. Die Bücher wurden zu einem weltweiten Phänomen.",
        difficulty = 1,
        funFact = "Rowling schrieb das erste Harry-Potter-Buch teils in einem Edinburgher Café, während ihre Tochter schlief."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist ein 'Reim'?",
        answerA = "Eine Übertreibung in einem Gedicht",
        answerB = "Der Gleichklang von Wörtern am Ende von Versen",
        answerC = "Eine Pause in einem Gedicht",
        answerD = "Die Anzahl der Silben in einer Zeile",
        correctAnswer = 1,
        explanation = "Ein Reim entsteht, wenn zwei oder mehr Wörter am Ende von Versen denselben oder ähnlichen Klang haben, zum Beispiel 'Haus' und 'Maus'. Es gibt verschiedene Reimschemata (Paarreim, Kreuzreim usw.).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Wer ist der Autor des Romans 'Der Herr der Ringe'?",
        answerA = "C.S. Lewis",
        answerB = "J.R.R. Tolkien",
        answerC = "George R.R. Martin",
        answerD = "Terry Pratchett",
        correctAnswer = 1,
        explanation = "J.R.R. Tolkien (John Ronald Reuel Tolkien) schrieb 'Der Herr der Ringe', veröffentlicht 1954–1955. Das epische Fantasy-Werk gilt als eines der einflussreichsten Bücher des 20. Jahrhunderts.",
        difficulty = 1,
        funFact = "Tolkien war Professor für Altenglisch in Oxford und erfand für seine Bücher mehrere vollständige Sprachen, darunter Elbisch."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist eine 'Kurzgeschichte'?",
        answerA = "Ein Roman unter 100 Seiten",
        answerB = "Eine kurze Prosaerzählung, die einen einzelnen Moment oder Konflikt konzentriert darstellt",
        answerC = "Ein Märchen für Kinder",
        answerD = "Eine Zusammenfassung eines langen Romans",
        correctAnswer = 1,
        explanation = "Die Kurzgeschichte ist eine kurze Prosaform, die meist einen einzigen Konflikt oder Moment zeigt, ohne ausführliche Vorgeschichte. Sie endet oft offen. Die Gattung entstand im 19. Jahrhundert in Amerika.",
        difficulty = 1,
        funFact = "Edgar Allan Poe gilt als Begründer der modernen Kurzgeschichte."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Schweizer Schriftsteller schrieb 'Der Besuch der alten Dame'?",
        answerA = "Max Frisch",
        answerB = "Robert Walser",
        answerC = "Friedrich Dürrenmatt",
        answerD = "Peter Bichsel",
        correctAnswer = 2,
        explanation = "'Der Besuch der alten Dame' (1956) ist ein Theaterstück von Friedrich Dürrenmatt. Die reiche Clara Zachanassian kehrt in ihre Heimatstadt zurück und bietet Geld für die Ermordung ihres einstigen Geliebten.",
        difficulty = 1,
        funFact = "Dürrenmatt nannte das Stück eine 'tragische Komödie' — es endet tödlich, aber mit bitter-komischen Elementen."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist eine 'Fabel'?",
        answerA = "Ein Lehrgedicht über Naturphänomene",
        answerB = "Eine kurze Erzählung, meist mit Tieren als Figuren, die eine moralische Botschaft vermittelt",
        answerC = "Eine lange Verserzählung über Helden",
        answerD = "Ein Märchen ohne Hexen und Zauberer",
        correctAnswer = 1,
        explanation = "Die Fabel ist eine kurze allegorische Erzählung, meist mit Tieren als handelnden Figuren, die menschliche Eigenschaften zeigen. Sie endet mit einer moralischen Aussage. Bekannte Autoren: Äsop, La Fontaine, Lessing.",
        difficulty = 1,
        funFact = "Äsop war angeblich ein griechischer Sklave aus dem 6. Jahrhundert v. Chr. — ob er wirklich gelebt hat, ist historisch umstritten."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher russische Autor schrieb 'Krieg und Frieden'?",
        answerA = "Fjodor Dostojewski",
        answerB = "Anton Tschechow",
        answerC = "Maxim Gorki",
        answerD = "Lew Tolstoi",
        correctAnswer = 3,
        explanation = "'Krieg und Frieden' (1869) ist ein epischer Roman von Lew Tolstoi. Er schildert das russische Leben zur Zeit der napoleonischen Kriege und gilt als eines der größten Werke der Weltliteratur.",
        difficulty = 1,
        funFact = "Das Buch hat über 1.200 Seiten und mehr als 500 Figuren — Tolstoi schrieb sieben vollständige Überarbeitungen."
    ),

    Question(
        categoryId = 10,
        questionText = "Was bedeutet 'Prosa' in der Literatur?",
        answerA = "Literatur in Versen mit festen Reimschemata",
        answerB = "Ältere Bezeichnung für dramatische Texte",
        answerC = "Nicht-gebundene Sprache ohne Versmaß oder Reim — die normale Schreibweise",
        answerD = "Wissenschaftliche Fachliteratur",
        correctAnswer = 2,
        explanation = "Prosa ist die normale, nicht versgebundene Sprache ohne festes Metrum oder Reimschema. Romane, Kurzgeschichten und Erzählungen sind Prosawerke — im Gegensatz zur Lyrik (Gedichte) und Dramatik (Bühnentexte).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Wer schrieb den Roman 'Der Alchimist' (O Alquimista)?",
        answerA = "Gabriel García Márquez",
        answerB = "Pablo Coelho",
        answerC = "Jorge Luis Borges",
        answerD = "Isabel Allende",
        correctAnswer = 1,
        explanation = "'Der Alchimist' (1988) ist ein Roman des brasilianischen Autors Paulo Coelho. Er erzählt von einem andalusischen Hirtenbuben auf der Suche nach seinem Lebensschatz.",
        difficulty = 1,
        funFact = "Das Buch wurde in über 80 Sprachen übersetzt und hat sich weltweit über 65 Millionen Mal verkauft."
    ),

    Question(
        categoryId = 10,
        questionText = "Welche Romanfigur lebte bei Baker Street 221b in London?",
        answerA = "Hercule Poirot",
        answerB = "Philip Marlowe",
        answerC = "Sherlock Holmes",
        answerD = "James Bond",
        correctAnswer = 2,
        explanation = "Sherlock Holmes, der berühmte Detektiv aus den Geschichten von Arthur Conan Doyle, wohnte in der Baker Street 221b in London zusammen mit seinem Freund Dr. Watson.",
        difficulty = 1,
        funFact = "In der Baker Street gibt es heute ein Sherlock-Holmes-Museum — obwohl das Haus 221b zur Zeit Doyles gar nicht existierte, da die Nummernvergabe damals nur bis 85 reichte."
    ),

    // ── NEW MEDIUM (difficulty = 2) ── 20 new questions ─────────────────────

    Question(
        categoryId = 10,
        questionText = "Was ist der Unterschied zwischen einem 'Paarreim' und einem 'Kreuzreim'?",
        answerA = "Paarreim: AABB (je zwei Zeilen reimen), Kreuzreim: ABAB (abwechselnd reimende Zeilen)",
        answerB = "Paarreim: ABBA, Kreuzreim: AABB",
        answerC = "Paarreim: nur männliche Reime, Kreuzreim: nur weibliche Reime",
        answerD = "Es ist kein Unterschied — beide Begriffe bedeuten dasselbe",
        correctAnswer = 0,
        explanation = "Beim Paarreim (AABB) reimen immer zwei aufeinanderfolgende Zeilen. Beim Kreuzreim (ABAB) reimen die erste und dritte sowie die zweite und vierte Zeile alternierend.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Autor schrieb 'Effi Briest' (1895)?",
        answerA = "Theodor Storm",
        answerB = "Theodor Fontane",
        answerC = "Wilhelm Raabe",
        answerD = "Gottfried Keller",
        correctAnswer = 1,
        explanation = "'Effi Briest' ist ein Roman von Theodor Fontane, der als sein bedeutendstes Werk gilt. Es erzählt vom Schicksal der jungen Effi, die einen viel älteren Mann heiratet und eine Affäre eingeht.",
        difficulty = 2,
        funFact = "Fontane veröffentlichte seinen ersten Roman erst mit 57 Jahren — 'Effi Briest' schrieb er im Alter von 75 Jahren."
    ),

    Question(
        categoryId = 10,
        questionText = "Was versteht man unter einem 'Antihelden' in der Literatur?",
        answerA = "Einen Bösewicht, der am Ende bestraft wird",
        answerB = "Eine Hauptfigur, der die klassischen Heldeneigenschaften wie Mut, Stärke und Moral fehlen",
        answerC = "Einen Nebencharakter, der wichtiger ist als der Held",
        answerD = "Einen Helden, der am Ende scheitert",
        correctAnswer = 1,
        explanation = "Ein Antiheld ist ein Protagonist, dem traditionelle Heldentugenden fehlen. Er kann feige, moralisch zweideutig, schwach oder kriminell sein. Bekannte Antiheldem: Raskolnikow (Dostojewski), Holden Caulfield (Salinger).",
        difficulty = 2,
        funFact = "Don Quijote von Cervantes gilt als einer der ersten großen Antiheldem der Weltliteratur."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Autor schrieb das Theaterstück 'Warten auf Godot' (1953)?",
        answerA = "Jean-Paul Sartre",
        answerB = "Albert Camus",
        answerC = "Samuel Beckett",
        answerD = "Eugène Ionesco",
        correctAnswer = 2,
        explanation = "'Warten auf Godot' ist ein Theaterstück des irisch-französischen Autors Samuel Beckett. Es gilt als Schlüsselwerk des absurden Theaters: Zwei Figuren warten auf jemanden, der nie kommt.",
        difficulty = 2,
        funFact = "Beckett schrieb das Stück auf Französisch, obwohl Englisch seine Muttersprache war, um 'ohne Stil zu schreiben'."
    ),

    Question(
        categoryId = 10,
        questionText = "Was bezeichnet der Begriff 'magischer Realismus' in der Literatur?",
        answerA = "Science-Fiction mit realistischen Elementen",
        answerB = "Fantasy-Literatur mit mittelalterlichem Setting",
        answerC = "Eine Erzählweise, in der magische Elemente selbstverständlich in eine realistische Welt eingebettet sind",
        answerD = "Märchenliteratur für Erwachsene",
        correctAnswer = 2,
        explanation = "Magischer Realismus ist eine literarische Strömung, besonders in der lateinamerikanischen Literatur, bei der übernatürliche Ereignisse als völlig normal behandelt werden. Hauptvertreter: Gabriel García Márquez.",
        difficulty = 2,
        funFact = "García Márquez' 'Hundert Jahre Einsamkeit' gilt als das bekannteste Werk des magischen Realismus."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher österreichische Dichter schrieb 'Rainer Maria Rilke'?",
        answerA = "Franz Kafka",
        answerB = "Hugo von Hofmannsthal",
        answerC = "Robert Musil",
        answerD = "Rainer Maria Rilke ist selbst ein Autor — bekannt für die 'Duineser Elegien'",
        correctAnswer = 3,
        explanation = "Rainer Maria Rilke (1875–1926) war selbst ein bedeutender deutschsprachiger Lyriker, geboren in Prag. Sein Hauptwerk sind die 'Duineser Elegien' (1922) und die 'Sonette an Orpheus'.",
        difficulty = 2,
        funFact = "Rilke schrieb die ersten zwei 'Duineser Elegien' in einer einzigen inspirationsreichen Nacht auf Schloss Duino am Adriatischen Meer."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist eine 'Dystopie' in der Literatur?",
        answerA = "Eine Utopie, die sich langsam entfaltet",
        answerB = "Eine fiktive Zukunftsgesellschaft, in der schreckliche, totalitäre oder unmenschliche Zustände herrschen",
        answerC = "Eine Satire auf die gegenwärtige Politik",
        answerD = "Ein pessimistischer Zukunftsroman ohne Science-Fiction-Elemente",
        correctAnswer = 1,
        explanation = "Eine Dystopie (Gegenteil der Utopie) ist eine negative Zukunftsvision: eine Gesellschaft mit Unterdrückung, Überwachung oder moralischem Verfall. Beispiele: '1984' (Orwell), 'Schöne neue Welt' (Huxley), 'Die Erzählung der Magd' (Atwood).",
        difficulty = 2,
        funFact = "Thomas Morus prägte 1516 den Begriff 'Utopie' (griech.: Nirgendort). Eine 'Dystopie' ist wörtlich ein 'schlechter Ort'."
    ),

    Question(
        categoryId = 10,
        questionText = "Welches Werk von Bertolt Brecht enthält das Lied 'Mack the Knife' (Die Moritat von Mackie Messer)?",
        answerA = "Mutter Courage und ihre Kinder",
        answerB = "Der gute Mensch von Sezuan",
        answerC = "Die Dreigroschenoper",
        answerD = "Leben des Galilei",
        correctAnswer = 2,
        explanation = "'Die Dreigroschenoper' (1928) von Bertolt Brecht (Musik: Kurt Weill) ist eines der erfolgreichsten deutschen Theaterstücke. Die 'Moritat von Mackie Messer' ist das bekannteste Lied daraus.",
        difficulty = 2,
        funFact = "Louis Armstrong, Frank Sinatra und Bobby Darin haben 'Mack the Knife' aufgenommen — es wurde zu einem Jazzstandard."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist 'Naturalismus' als literarische Epoche?",
        answerA = "Eine Bewegung, die Natur und Landleben idealisiert",
        answerB = "Eine literarische Strömung (spätes 19. Jh.), die das Leben exakt und wissenschaftlich darstellt, besonders das Elend der Unterschicht",
        answerC = "Eine Renaissance-Bewegung zur Wiederentdeckung der Antike",
        answerD = "Eine moderne Richtung, die Naturmetaphern bevorzugt",
        correctAnswer = 1,
        explanation = "Der Naturalismus (ca. 1880–1900) wollte die Wirklichkeit so exakt wie möglich abbilden, beeinflusst von Darwin und Zola. Deutsche Vertreter: Gerhart Hauptmann ('Die Weber'), Arno Holz.",
        difficulty = 2,
        funFact = "Arno Holz und Johannes Schlaf entwickelten die 'konsequente Sekunde' — Literatur sollte im selben Tempo ablaufen wie das reale Leben."
    ),

    Question(
        categoryId = 10,
        questionText = "Wer schrieb den Roman 'Der Name der Rose' (1980)?",
        answerA = "Umberto Eco",
        answerB = "Carlos Ruiz Zafón",
        answerC = "Dan Brown",
        answerD = "Ken Follett",
        correctAnswer = 0,
        explanation = "'Der Name der Rose' ist ein Mittelalter-Kriminalroman des italienischen Semiotik-Professors Umberto Eco. Der Franziskanermönch William von Baskerville untersucht mysteriöse Todesfälle in einer Abtei.",
        difficulty = 2,
        funFact = "Eco nannte seinen Detektiv 'William von Baskerville' als Anspielung auf Sherlock Holmes' Abenteuer 'Der Hund von Baskerville'."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist das 'Epische Theater' nach Bertolt Brecht?",
        answerA = "Theater mit Schauspielern auf einer sehr großen Bühne",
        answerB = "Theaterform, die den Zuschauer zur kritischen Reflexion anregt, indem sie Illusionen bricht (Verfremdungseffekt)",
        answerC = "Historische Dramen über antike Helden",
        answerD = "Improvisationstheater ohne festes Skript",
        correctAnswer = 1,
        explanation = "Brechts Episches Theater will den Zuschauer nicht emotional mitreißen, sondern zum Nachdenken bringen. Der 'Verfremdungseffekt' (V-Effekt) unterbricht die Illusion: Schauspieler sprechen das Publikum an, Schilder erklären die Handlung.",
        difficulty = 2,
        funFact = "Brecht ließ Schauspieler auf der Bühne rauchen, um die theatralische Illusion zu durchbrechen."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Autor schrieb 'Don Quijote de la Mancha' (1605)?",
        answerA = "Lope de Vega",
        answerB = "Francisco de Quevedo",
        answerC = "Miguel de Cervantes",
        answerD = "Garcilaso de la Vega",
        correctAnswer = 2,
        explanation = "'Don Quijote de la Mancha' von Miguel de Cervantes (1605/1615) gilt als erster moderner Roman der Weltliteratur. Der adlige Don Quijote hält sich für einen Ritter und kämpft gegen Windmühlen.",
        difficulty = 2,
        funFact = "Cervantes schrieb den ersten Teil von 'Don Quijote' angeblich im Gefängnis, wo er wegen Schulden einsaß."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist der 'Expressionismus' in der deutschen Literatur?",
        answerA = "Eine naturalistische Strömung mit sozialkritischem Fokus",
        answerB = "Eine literarische Bewegung (ca. 1910–1925), die innere Zustände und Gefühle stark übertrieben und verzerrt darstellt",
        answerC = "Eine Form des Impressionismus mit lyrischen Naturbeschreibungen",
        answerD = "Eine politische Literaturbewegung der Nachkriegszeit",
        correctAnswer = 1,
        explanation = "Der literarische Expressionismus (ca. 1910–1925) drückt innere Welten, Angst und Zerrissenheit durch extreme Bilder und verzerrte Sprache aus. Vertreter: Georg Trakl, Ernst Toller, Else Lasker-Schüler.",
        difficulty = 2,
        funFact = "Georg Trakl schrieb seine expressionistischen Gedichte als Sanitäter im Ersten Weltkrieg. Er starb 1914 an einer Kokainüberdosis."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Autor schrieb die Erzählung 'Der Tod in Venedig' (1912)?",
        answerA = "Stefan Zweig",
        answerB = "Arthur Schnitzler",
        answerC = "Robert Musil",
        answerD = "Thomas Mann",
        correctAnswer = 3,
        explanation = "'Der Tod in Venedig' (1912) ist eine Novelle von Thomas Mann. Der alternde Schriftsteller Gustav von Aschenbach reist nach Venedig und verfällt in eine obsessive Leidenschaft für den jungen Tadzio.",
        difficulty = 2,
        funFact = "Luchino Visconti verfilmte die Novelle 1971 — mit Mahlers Adagietto als unvergesslichem Soundtrack."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist ein 'Monolog' in der Literatur?",
        answerA = "Ein Gespräch zwischen zwei Figuren",
        answerB = "Eine lange Erzählpassage in Prosa",
        answerC = "Eine längere Rede einer einzelnen Figur, an sich selbst oder das Publikum gerichtet",
        answerD = "Eine Zusammenfassung am Ende eines Aktes",
        correctAnswer = 2,
        explanation = "Ein Monolog ist eine Rede einer einzelnen Person ohne Antwort. Im Drama ermöglicht er Einblick in innere Gedanken. Berühmtestes Beispiel: Hamlets 'Sein oder Nichtsein' in Shakespeares 'Hamlet'.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Roman von Hermann Hesse beschreibt eine indisch-spirituelle Suche?",
        answerA = "Narciss und Goldmund",
        answerB = "Siddhartha",
        answerC = "Das Glasperlenspiel",
        answerD = "Peter Camenzind",
        correctAnswer = 1,
        explanation = "'Siddhartha' (1922) von Hermann Hesse erzählt die spirituelle Reise eines jungen Brahmanen im alten Indien auf der Suche nach Erleuchtung. Das Buch wurde besonders in den 1960er Jahren ein Kultbuch.",
        difficulty = 2,
        funFact = "Hesse gewann 1946 den Nobelpreis für Literatur, unter anderem für 'Das Glasperlenspiel'."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist eine 'Novelle' als literarische Gattung?",
        answerA = "Ein sehr kurzes Gedicht in drei Strophen",
        answerB = "Ein Kurzroman mit einer einzigen unerhörten Begebenheit und strikter Handlungsführung",
        answerC = "Ein dramatischer Einakter",
        answerD = "Ein historischer Roman über reale Ereignisse",
        correctAnswer = 1,
        explanation = "Die Novelle ist eine mittellange Prosaform, die sich um eine einzige außergewöhnliche ('unerhörte') Begebenheit dreht. Sie ist straffer als ein Roman. Goethe formulierte: 'Eine Novelle ist eine sich ereignete unerhörte Begebenheit.'",
        difficulty = 2,
        funFact = "Kafkas 'Die Verwandlung', Kleists 'Michael Kohlhaas' und Storms 'Der Schimmelreiter' gelten als Meisterwerke der deutschen Novelle."
    ),

    Question(
        categoryId = 10,
        questionText = "Welche Schriftstellerin schrieb 'Die Erzählung der Magd' (The Handmaid's Tale)?",
        answerA = "Toni Morrison",
        answerB = "Doris Lessing",
        answerC = "Margaret Atwood",
        answerD = "Ursula K. Le Guin",
        correctAnswer = 2,
        explanation = "'Die Erzählung der Magd' (1985) ist ein dystopischer Roman der Kanadierin Margaret Atwood. In der totalitären Republik Gilead werden Frauen versklavt und als Gebärmaschinen benutzt.",
        difficulty = 2,
        funFact = "Atwood betont, dass alle im Buch beschriebenen Unterdrückungsmaßnahmen an realen historischen Ereignissen angelehnt sind."
    ),

    Question(
        categoryId = 10,
        questionText = "Was bedeutet 'Poesie' im weiteren Sinne?",
        answerA = "Ausschließlich gereimte Verse",
        answerB = "Nur Lyrik ohne jede Prosa",
        answerC = "Sprachliche Kunst mit besonderem Rhythmus, Klang und Bildsprache — kann Lyrik, aber auch Prosa umfassen",
        answerD = "Mittelhochdeutsche Versform aus dem Minnesang",
        correctAnswer = 2,
        explanation = "Poesie bezeichnet im weiteren Sinne literarische Kunstsprache mit besonderer Wirkung durch Rhythmus, Klang und Metaphorik. Im engeren Sinne ist Poesie gleichbedeutend mit Lyrik (Gedichte).",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Wer schrieb die Erzählsammlung 'Tausendundeine Nacht'?",
        answerA = "Omar Khayyam",
        answerB = "Rumi",
        answerC = "Der Autor ist unbekannt — es ist eine anonyme arabisch-persische Sammlung",
        answerD = "Al-Jahiz",
        correctAnswer = 2,
        explanation = "'Tausendundeine Nacht' ist eine Sammlung arabischer, persischer und indischer Märchen und Erzählungen, zusammengestellt zwischen dem 8. und 14. Jahrhundert. Die Autorenschaft ist anonym und kollektiv.",
        difficulty = 2,
        funFact = "Scheherazade, die Haupterzählerin, rettet sich vor dem Hinrichtungsbefehl des Königs, indem sie jeden Abend eine Geschichte beginnt — und am Höhepunkt abbricht."
    ),

    // ── NEW HARD (difficulty = 3) ── 15 new questions ───────────────────────

    Question(
        categoryId = 10,
        questionText = "Was ist der 'Verfremdungseffekt' (V-Effekt) in Brechts Dramaturgie?",
        answerA = "Eine Bühnentechnik, bei der Schauspieler fremde Sprachen sprechen",
        answerB = "Ein Mittel, das dem Zuschauer das Vertraute fremd macht, um emotionale Distanz und kritisches Nachdenken zu erzwingen",
        answerC = "Die Verwendung von Fremdwörtern und Fachbegriffen im Dialog",
        answerD = "Ein Beleuchtungseffekt auf der Bühne",
        correctAnswer = 1,
        explanation = "Brechts V-Effekt (Verfremdungseffekt) verhindert die emotionale Einfühlung des Zuschauers. Mittel dazu: Schauspieler treten aus der Rolle, Schilder kommentieren die Handlung, Musik unterbricht — Ziel ist kritisches Denken statt Mitfühlen.",
        difficulty = 3,
        funFact = "Brecht ließ Theaterzettel verteilen, die die Handlung vorher verraten — damit das Publikum nicht gespannt mitfiebert, sondern analysiert."
    ),

    Question(
        categoryId = 10,
        questionText = "Welche Gattung bezeichnet 'Minnesang' im Mittelalter?",
        answerA = "Religiöse Kirchenlieder des Hochmittelalters",
        answerB = "Höfische Liebeslyrik des 12. bis 14. Jahrhunderts, in der Ritter ihre Minneherrin besingen",
        answerC = "Volkslieder aus dem ländlichen Bereich des 15. Jahrhunderts",
        answerD = "Klagelieder über verstorbene Helden",
        correctAnswer = 1,
        explanation = "Minnesang ist höfische Liebeslyrik des deutschen Mittelalters (ca. 1150–1350). Der Minnesänger verehrt seine 'Minneherrin' aus der Ferne — die Liebe bleibt meist unerfüllt. Bekanntester Vertreter: Walther von der Vogelweide.",
        difficulty = 3,
        funFact = "Das Wort 'Minne' bedeutete im Mittelhochdeutschen nicht nur 'Liebe', sondern auch 'liebevolles Gedenken' und 'Erinnerung'."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist die 'Hermeneutik' als literaturwissenschaftliche Methode?",
        answerA = "Die statistische Analyse von Texthäufigkeiten",
        answerB = "Die Lehre vom Verstehen und Interpretieren von Texten, insbesondere des Zusammenhangs zwischen Teil und Ganzem (hermeneutischer Zirkel)",
        answerC = "Die vergleichende Analyse von Texten verschiedener Sprachen",
        answerD = "Die Untersuchung von Druckfehlern in historischen Manuskripten",
        correctAnswer = 1,
        explanation = "Die Hermeneutik (von Hermes, dem Götterboten) ist die Kunst des Textverstehens. Der 'hermeneutische Zirkel' besagt: Um ein Detail zu verstehen, muss man das Ganze kennen — und umgekehrt. Friedrich Schleiermacher und Wilhelm Dilthey prägten die moderne Hermeneutik.",
        difficulty = 3,
        funFact = "Hans-Georg Gadamer erweiterte die Hermeneutik zur 'philosophischen Hermeneutik' — Verstehen ist immer durch den eigenen historischen Horizont geprägt ('Horizontverschmelzung')."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Roman des 20. Jahrhunderts gilt als Schlüsselwerk der lateinamerikanischen Literatur und enthält den 'Boom' dieser Epoche?",
        answerA = "Pedro Páramo von Juan Rulfo",
        answerB = "Hundert Jahre Einsamkeit von Gabriel García Márquez",
        answerC = "Die Verwandlung von Franz Kafka",
        answerD = "Ficciones von Jorge Luis Borges",
        correctAnswer = 1,
        explanation = "'Hundert Jahre Einsamkeit' (1967) von Gabriel García Márquez gilt als Hauptwerk des lateinamerikanischen 'Boom' und des magischen Realismus. Es erzählt die Geschichte der Familie Buendía in Macondo über sieben Generationen.",
        difficulty = 3,
        funFact = "García Márquez hielt das fertige Manuskript in der Hand, merkte dass er kein Geld für Porto hatte — seine Frau verpfändete den Kühlschrank, damit der Roman abgeschickt werden konnte."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist eine 'Ekphrasis' in der Literatur?",
        answerA = "Die schriftliche Beschreibung eines Kunstwerks (Gemälde, Skulptur) mit literarischen Mitteln",
        answerB = "Ein literarischer Text, der bewusst keine Bilder verwendet",
        answerC = "Die Übertragung eines literarischen Werks in ein anderes Medium",
        answerD = "Eine Rede im antiken Drama, die die Vorgeschichte erklärt",
        correctAnswer = 0,
        explanation = "Ekphrasis (griech.: Beschreibung) ist die detaillierte literarische Beschreibung eines Kunstwerks. Bekanntestes Beispiel: Homers Beschreibung von Achilles' Schild in der Ilias. Keats' 'Ode on a Grecian Urn' ist ein modernes Beispiel.",
        difficulty = 3,
        funFact = "Die Ekphrasis war in der antiken Rhetorik eine Übung für Redner, die Bilder so lebendig wie möglich mit Worten zu beschreiben."
    ),

    Question(
        categoryId = 10,
        questionText = "Welches Werk Kafkas beschreibt eine kafkaeskе Bürokratie in einer unterirdischen Festungsanlage?",
        answerA = "Das Schloss",
        answerB = "Der Prozess",
        answerC = "Amerika (Der Verschollene)",
        answerD = "In der Strafkolonie",
        correctAnswer = 0,
        explanation = "'Das Schloss' (posthum 1926) ist Kafkas letzter, unvollendeter Roman. Der Landvermesser K. versucht vergeblich, Zugang zum Schloss zu erhalten, das eine undurchdringliche Bürokratie symbolisiert.",
        difficulty = 3,
        funFact = "Kafka hörte mitten in einem Satz auf zu schreiben — das Schloss bricht ab, ohne dass K. sein Ziel je erreicht. Laut Max Brod wollte Kafka K. 'erschöpft von der Bürokratie sterben' lassen."
    ),

    Question(
        categoryId = 10,
        questionText = "Was beschreibt der Begriff 'Epochenwende' in der Literaturgeschichte am Übergang von Klassik zu Romantik um 1800?",
        answerA = "Die Ablösung des Barocks durch die Aufklärung",
        answerB = "Den Wandel von rationaler Harmonieideal und Humanismus (Klassik) hin zu Irrationalismus, Natursehnsucht, Nacht-Symbolik und Subjektivismus (Romantik)",
        answerC = "Die Einführung des Drucks als neues Publikationsmedium",
        answerD = "Die Verbreitung des Realismus als dominante Schreibweise",
        correctAnswer = 1,
        explanation = "Die Romantik (ca. 1795–1848) wandte sich gegen die Vernunftideal der Klassik und betonte Gefühl, Nacht, Traum, das Unendliche. Schlüsselfiguren: Novalis, E.T.A. Hoffmann, Joseph von Eichendorff.",
        difficulty = 3,
        funFact = "Novalis' 'Blaue Blume' wurde zum Symbol der Romantik — ein unerreichbares Sehnsuchtssymbol für das Absolute."
    ),

    Question(
        categoryId = 10,
        questionText = "Wer verfasste das Drama 'Woyzeck' (Fragment, 1837)?",
        answerA = "Heinrich von Kleist",
        answerB = "Georg Büchner",
        answerC = "Christian Dietrich Grabbe",
        answerD = "Johann Nestroy",
        correctAnswer = 1,
        explanation = "'Woyzeck' von Georg Büchner ist ein fragmentarisches Drama über einen armen Soldaten, der seine Frau aus Eifersucht tötet. Es gilt als erstes sozialkritisches Drama der deutschen Literatur.",
        difficulty = 3,
        funFact = "Büchner starb mit nur 23 Jahren an Typhus, bevor er das Stück vollenden konnte. Alban Berg vertonte es 1925 als Oper 'Wozzeck'."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist das literarische Konzept der 'Unzuverlässigen Erzählung' (unreliable narration)?",
        answerA = "Eine Erzählweise, bei der Zeitsprünge die Handlung unverständlich machen",
        answerB = "Ein Erzähler, dessen Bericht durch psychische Einschränkungen, Vorurteile oder Lügen bewusst oder unbewusst verzerrt ist",
        answerC = "Ein auktorialer Erzähler mit unvollständigem Wissen über die Figuren",
        answerD = "Eine Ich-Erzählung, die nachträglich erzählt wird",
        correctAnswer = 1,
        explanation = "Der unzuverlässige Erzähler ist eine Figur, deren Bericht der Leser nicht vollständig vertrauen kann. Gründe: mentale Instabilität, Naivität, Eigeninteresse oder bewusste Lüge. Wayne C. Booth prägte den Begriff 1961.",
        difficulty = 3,
        funFact = "Stevens in Kazuo Ishiguros 'Was vom Tage übrig blieb' ist ein klassischer unzuverlässiger Erzähler — er täuscht sich systematisch über die eigene Vergangenheit."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Autor schrieb 'Der Mann ohne Eigenschaften' (1930–1943)?",
        answerA = "Hugo von Hofmannsthal",
        answerB = "Arthur Schnitzler",
        answerC = "Robert Musil",
        answerD = "Hermann Broch",
        correctAnswer = 2,
        explanation = "'Der Mann ohne Eigenschaften' ist Robert Musils unvollendetes Hauptwerk, eines der bedeutendsten Romane des 20. Jahrhunderts. Es spielt im Wien des Jahres 1913 und untersucht philosophisch die Identität des modernen Menschen.",
        difficulty = 3,
        funFact = "Musil arbeitete über 20 Jahre an dem Roman und hinterließ beim Tod 1942 mehrere tausend Seiten unveröffentlichtes Material."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist die literarische Epoche der 'Aufklärung' in Deutschland (ca. 1720–1785)?",
        answerA = "Eine religiöse Bewegung zur Verbreitung der Bibel",
        answerB = "Eine Epoche, die Vernunft, kritisches Denken und Bildung als Mittel zur menschlichen Emanzipation betonte",
        answerC = "Eine ästhetische Bewegung, die antike Stilideale wiederentdeckte",
        answerD = "Eine Reaktion auf den Dreißigjährigen Krieg mit pessimistischer Weltsicht",
        correctAnswer = 1,
        explanation = "Die Aufklärung ('Sapere aude!' — Wage es, weise zu sein, Kant) betonte Vernunft, Kritik an Aberglauben und Kirche sowie die Würde des Menschen. Literarische Vertreter: Gotthold Ephraim Lessing, Christoph Martin Wieland.",
        difficulty = 3,
        funFact = "Immanuel Kants Schrift 'Was ist Aufklärung?' (1784) beginnt mit: 'Aufklärung ist der Ausgang des Menschen aus seiner selbst verschuldeten Unmündigkeit.'"
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Literaturnobelpreisträger schrieb 'Schuld und Sühne' (Prestuplenie i nakazanie)?",
        answerA = "Leo Tolstoi",
        answerB = "Ivan Turgenev",
        answerC = "Anton Tschechow",
        answerD = "Fjodor Dostojewski",
        correctAnswer = 3,
        explanation = "'Schuld und Sühne' (1866) von Fjodor Dostojewski ist einer der bedeutendsten psychologischen Romane der Weltliteratur. Der Student Raskolnikow tötet eine Pfandleiherin — und kämpft mit seiner Schuld.",
        difficulty = 3,
        funFact = "Dostojewski schrieb den Roman in acht Monaten, um Schulden zu bezahlen. Er diktierte der Stenografin Anna Snitkina, die er später heiratete."
    ),

    Question(
        categoryId = 10,
        questionText = "Was bezeichnet 'Biedermeier' als literarische Epoche (ca. 1815–1848)?",
        answerA = "Eine rebellische Literaturbewegung gegen den Adel",
        answerB = "Eine Zeit innerer Rückzug ins Private, Häuslichkeit und Naturliebe als Reaktion auf politische Unterdrückung nach dem Wiener Kongress",
        answerC = "Die Hauptphase der deutschen Klassik mit Goethe und Schiller",
        answerD = "Eine proletarische Literaturbewegung der Frühindustrialisierung",
        correctAnswer = 1,
        explanation = "Das Biedermeier (1815–1848) war eine Zeit politischer Repression (Metternich). Die Literatur zog sich ins Private zurück: Häuslichkeit, Natur, stille Resignation. Vertreter: Adalbert Stifter, Franz Grillparzer, Eduard Mörike.",
        difficulty = 3,
        funFact = "Der Begriff 'Biedermeier' entstand aus einer Parodie: 'Gottlieb Biedermaier' war eine Figur eines spießbürgerlichen, harmlosen Dichters — ursprünglich eine Satire."
    ),

    Question(
        categoryId = 10,
        questionText = "Welche Autorin erhielt 2004 den Literaturnobelpreis für ihren 'musikalischen Fluss von Stimmen und Gegenstimmen'?",
        answerA = "Herta Müller",
        answerB = "Doris Lessing",
        answerC = "Elfriede Jelinek",
        answerD = "Christa Wolf",
        correctAnswer = 2,
        explanation = "Die österreichische Autorin Elfriede Jelinek erhielt 2004 den Nobelpreis für Literatur. Bekannte Werke: 'Die Klavierspielerin', 'Lust'. Ihre Texte sind oft provokativ-feministisch und gesellschaftskritisch.",
        difficulty = 3,
        funFact = "Jelinek nahm den Nobelpreis nicht persönlich entgegen — sie litt an einer sozialen Phobie und schickte eine Videobotschaft nach Stockholm."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist die 'Rahmenerzählung' als narratives Mittel?",
        answerA = "Die Zusammenfassung eines Romans am Anfang und Ende",
        answerB = "Eine äußere Erzählung, die eine oder mehrere Binnengeschichten umschließt und einbettet",
        answerC = "Die Technik, einen Roman mit demselben Satz zu beginnen und zu enden",
        answerD = "Ein Prolog, der die Handlung einleitet",
        correctAnswer = 1,
        explanation = "Die Rahmenerzählung hat eine äußere Handlung (Rahmen), in die eine oder mehrere Geschichten eingebettet sind (Binnenerzählungen). Berühmte Beispiele: Boccaccios 'Decameron', Storms 'Der Schimmelreiter', 'Tausendundeine Nacht'.",
        difficulty = 3,
        funFact = "In Storms 'Der Schimmelreiter' gibt es sogar drei Erzählebenen — eine Rahmenerzählung, eine zweite Ebene und die eigentliche Geschichte des Deichgrafen Hauke Haien."
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
    ),

    // ── ADDITIONAL EASY (difficulty = 1) ── 25 new questions ─────────────────

    Question(
        categoryId = 10,
        questionText = "Welcher Autor schrieb 'Die Schatzinsel'?",
        answerA = "Mark Twain",
        answerB = "Jules Verne",
        answerC = "Robert Louis Stevenson",
        answerD = "Daniel Defoe",
        correctAnswer = 2,
        explanation = "'Die Schatzinsel' (1883) ist ein Abenteuerroman des schottischen Autors Robert Louis Stevenson. Er erzählt von Jim Hawkins, der eine Schatzkarte findet und auf einer Insel nach verstecktem Piratengold sucht.",
        difficulty = 1,
        funFact = "Stevenson erfand die Geschichte ursprünglich als Unterhaltung für seinen Stiefsohn Lloyd Osbourne, der an einer selbst gemalten Schatzkarte bastelte."
    ),

    Question(
        categoryId = 10,
        questionText = "Wer ist der Autor von 'Moby Dick' (1851)?",
        answerA = "Mark Twain",
        answerB = "Herman Melville",
        answerC = "Nathaniel Hawthorne",
        answerD = "Edgar Allan Poe",
        correctAnswer = 1,
        explanation = "'Moby Dick oder Der Wal' ist ein Roman des amerikanischen Autors Herman Melville. Er handelt von Kapitän Ahabs obsessiver Jagd auf den weißen Wal Moby Dick.",
        difficulty = 1,
        funFact = "Das Buch war zu Melvilles Lebzeiten ein kommerzieller Misserfolg — es wurde erst Jahrzehnte nach seinem Tod als Meisterwerk anerkannt."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist ein 'Epos' in der Literatur?",
        answerA = "Ein kurzes lyrisches Gedicht",
        answerB = "Ein langes, erzählendes Gedicht über Helden und ihre Taten",
        answerC = "Ein dramatisches Theaterstück in Versen",
        answerD = "Ein philosophischer Dialog in Prosaform",
        correctAnswer = 1,
        explanation = "Ein Epos ist eine lange, erzählende Dichtung, die heroische Taten und Abenteuer schildert. Bekannte Beispiele: Homers Ilias und Odyssee, Vergils Aeneis, das Nibelungenlied.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Von wem stammt das berühmte Zitat 'Sein oder Nichtsein, das ist hier die Frage'?",
        answerA = "Aus Goethes Faust",
        answerB = "Aus Schillers Wilhelm Tell",
        answerC = "Aus Shakespeares Hamlet",
        answerD = "Aus Cervantes' Don Quijote",
        correctAnswer = 2,
        explanation = "Das Zitat stammt aus William Shakespeares Tragödie 'Hamlet' (um 1600). Es ist der Beginn eines berühmten Monologs, in dem Hamlet über Leben, Tod und das Leiden nachdenkt.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Was versteht man unter einem 'Pseudonym' in der Literatur?",
        answerA = "Den Originaltitel eines übersetzten Buches",
        answerB = "Einen Decknamen, unter dem ein Autor veröffentlicht",
        answerC = "Eine veraltete Schreibweise eines Autorennamens",
        answerD = "Den Spitznamen einer Romanfigur",
        correctAnswer = 1,
        explanation = "Ein Pseudonym ist ein angenommener Name, unter dem ein Schriftsteller publiziert. Bekannte Beispiele: George Orwell (eigentlich Eric Blair), Mark Twain (Samuel Clemens), George Eliot (Mary Ann Evans).",
        difficulty = 1,
        funFact = "Mary Ann Evans schrieb als 'George Eliot', weil sie befürchtete, als Frau nicht ernst genommen zu werden."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Roman von Jules Verne handelt von einer Reise um die Erde in 80 Tagen?",
        answerA = "Reise zum Mittelpunkt der Erde",
        answerB = "20.000 Meilen unter dem Meer",
        answerC = "In 80 Tagen um die Welt",
        answerD = "Die geheimnisvolle Insel",
        correctAnswer = 2,
        explanation = "'In 80 Tagen um die Welt' (1872) ist ein Roman von Jules Verne. Phileas Fogg wettet, dass er in genau 80 Tagen die Welt umrunden kann.",
        difficulty = 1,
        funFact = "Nellie Bly, eine Journalistin, brach 1889 Foggs Rekord und umrundete die Welt tatsächlich in 72 Tagen."
    ),

    Question(
        categoryId = 10,
        questionText = "Wie heißt die Hauptfigur in Miguel de Cervantes' Roman 'Don Quijote'?",
        answerA = "Sancho Pansa",
        answerB = "Alonso Quijano alias Don Quijote de la Mancha",
        answerC = "Rodrigo Díaz",
        answerD = "Lazarillo de Tormes",
        correctAnswer = 1,
        explanation = "Die Hauptfigur ist Alonso Quijano, ein verarmter Landadliger, der sich nach dem Lesen von Ritterromanen für einen Ritter hält und sich Don Quijote de la Mancha nennt.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist ein 'Vers' in der Lyrik?",
        answerA = "Eine Strophe aus mindestens zehn Zeilen",
        answerB = "Eine einzelne Zeile eines Gedichts",
        answerC = "Der Refrain eines Gedichts",
        answerD = "Ein Gedicht ohne Reimschema",
        correctAnswer = 1,
        explanation = "Ein Vers ist eine einzelne Zeile in einem Gedicht. Mehrere Verse bilden eine Strophe. Der Begriff kommt vom lateinischen 'versus' (Zeile, wörtlich: Wende).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Wer schrieb 'Hänsel und Gretel'?",
        answerA = "Charles Perrault",
        answerB = "Hans Christian Andersen",
        answerC = "Die Gebrüder Grimm",
        answerD = "Ludwig Tieck",
        correctAnswer = 2,
        explanation = "'Hänsel und Gretel' ist eines der bekanntesten Märchen aus der Sammlung 'Kinder- und Hausmärchen' der Gebrüder Grimm (1812). Es handelt von zwei Geschwistern, die eine Hexe im Lebkuchenhaus überlisten.",
        difficulty = 1,
        funFact = "Die Hexe im Lebkuchenhaus ist eines der ältesten Motive der europäischen Volksmärchen — ähnliche Geschichten gibt es in vielen Kulturen."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist das bekannteste Werk von Charles Dickens?",
        answerA = "Jane Eyre",
        answerB = "Oliver Twist oder Eine Weihnachtsgeschichte",
        answerC = "Stolz und Vorurteil",
        answerD = "Wuthering Heights",
        correctAnswer = 1,
        explanation = "Charles Dickens (1812–1870) ist vor allem für 'Oliver Twist' (1837) und 'Eine Weihnachtsgeschichte' (1843) bekannt. Er schilderte eindringlich das Leben der Armen im viktorianischen England.",
        difficulty = 1,
        funFact = "Dickens veröffentlichte seine Romane zunächst in monatlichen oder wöchentlichen Fortsetzungen in Zeitschriften — eine damals sehr beliebte Form."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist eine 'Strophe' in der Lyrik?",
        answerA = "Ein einzelnes Wort mit besonderer Bedeutung",
        answerB = "Eine Gruppe zusammengehöriger Verse in einem Gedicht",
        answerC = "Das Reimschema eines gesamten Gedichts",
        answerD = "Der Titel eines Gedichts",
        correctAnswer = 1,
        explanation = "Eine Strophe ist eine Gruppe von Versen, die durch einen Zeilenabstand von anderen Versgruppen getrennt wird. Gedichte bestehen oft aus mehreren gleichartigen Strophen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Wer schrieb den Klassiker der Kinder- und Jugendliteratur 'Alice im Wunderland'?",
        answerA = "Rudyard Kipling",
        answerB = "Charles Dickens",
        answerC = "Lewis Carroll",
        answerD = "Jonathan Swift",
        correctAnswer = 2,
        explanation = "'Alice im Wunderland' (1865) wurde von Lewis Carroll (eigentlich Charles Lutwidge Dodgson) geschrieben. Es erzählt von Alices Abenteuer in einer surrealen Unterwelt.",
        difficulty = 1,
        funFact = "Lewis Carroll war Mathematikprofessor in Oxford. Er schrieb die Geschichte ursprünglich für Alice Liddell, die Tochter seines Kollegen."
    ),

    Question(
        categoryId = 10,
        questionText = "Was bedeutet 'Fiktion' in der Literatur?",
        answerA = "Sachbücher und Berichte über reale Ereignisse",
        answerB = "Erdachte, nicht reale Geschichten und Figuren",
        answerC = "Historische Romane über echte Personen",
        answerD = "Biografien berühmter Persönlichkeiten",
        correctAnswer = 1,
        explanation = "Fiktion bezeichnet erdachte, nicht reale literarische Inhalte — Figuren, Handlungen und Welten, die der Autor erfunden hat. Das Gegenteil ist Non-Fiktion (Sachbücher, Dokumentationen, Biografien).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Dichter schrieb die Hymne 'Deutschland über alles'?",
        answerA = "Ernst Moritz Arndt",
        answerB = "August Heinrich Hoffmann von Fallersleben",
        answerC = "Theodor Körner",
        answerD = "Max von Schenkendorf",
        correctAnswer = 1,
        explanation = "August Heinrich Hoffmann von Fallersleben schrieb 1841 das 'Lied der Deutschen', dessen dritte Strophe ('Einigkeit und Recht und Freiheit') heute die Nationalhymne der Bundesrepublik ist.",
        difficulty = 1,
        funFact = "Die erste Strophe mit 'Deutschland über alles' war ursprünglich kein Nationalismus, sondern ein Aufruf zur Einheit der 39 deutschen Kleinstaaten unter einem gemeinsamen Deutschland."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist ein 'Briefroman'?",
        answerA = "Ein Roman über das Leben eines Briefträgers",
        answerB = "Ein Roman, der in Form von Briefen zwischen den Figuren erzählt wird",
        answerC = "Ein kurzer Brief in Romanform",
        answerD = "Ein Roman, in dem der Hauptcharakter ein Schriftsteller ist",
        correctAnswer = 1,
        explanation = "Ein Briefroman (Epistolarroman) ist eine Erzählung, die aus Briefen der Figuren besteht. Das bekannteste deutsche Beispiel ist Goethes 'Die Leiden des jungen Werthers'. Die Form war im 18. Jahrhundert sehr beliebt.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welches Tier taucht im Titel von Franz Kafkas berühmter Erzählung auf?",
        answerA = "Der Hund",
        answerB = "Die Ameise",
        answerC = "Das Ungeziefer (Verwandlung)",
        answerD = "Der Adler",
        correctAnswer = 2,
        explanation = "In 'Die Verwandlung' (1915) erwacht Gregor Samsa als riesiges Ungeziefer. Kafka bezeichnete das Tier nie genauer — die häufigste Interpretation ist ein Käfer oder eine Kakerlake.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Wer schrieb 'Die Odyssee'?",
        answerA = "Vergil",
        answerB = "Sophokles",
        answerC = "Homer",
        answerD = "Ovid",
        correctAnswer = 2,
        explanation = "Die 'Odyssee' wird dem antiken griechischen Dichter Homer zugeschrieben (ca. 8. Jh. v. Chr.). Sie erzählt die zehnjährige Heimreise des Odysseus nach dem Trojanischen Krieg.",
        difficulty = 1,
        funFact = "Ob Homer eine historische Person war oder ob die Epen von mehreren Dichtern zusammengestellt wurden, ist unter Wissenschaftlern bis heute umstritten — die sogenannte 'Homerische Frage'."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist ein 'Komma' in der Literatursprache (Stilistik)?",
        answerA = "Eine kurze Pause im Satz, markiert durch ein Satzzeichen",
        answerB = "Ein Satzgefüge aus Haupt- und Nebensatz",
        answerC = "Eine Strophe mit vier Versen",
        answerD = "Ein Gedicht ohne Interpunktion",
        correctAnswer = 0,
        explanation = "In der Stilistik bezeichnet ein Komma eine kurze Sprechpause, die durch das gleichnamige Satzzeichen (,) angezeigt wird. Satzzeichen sind wichtige Mittel zur Steuerung von Rhythmus und Bedeutung in literarischen Texten.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Autor schrieb 'Pinocchio'?",
        answerA = "Giovanni Boccaccio",
        answerB = "Carlo Collodi",
        answerC = "Italo Calvino",
        answerD = "Umberto Eco",
        correctAnswer = 1,
        explanation = "'Le avventure di Pinocchio' (1883) wurde von Carlo Collodi (eigentlich Carlo Lorenzini) geschrieben. Es erzählt von einer hölzernen Marionette, die lebendig wird und ein richtiger Junge werden möchte.",
        difficulty = 1,
        funFact = "In der Originalgeschichte ist Pinocchio weitaus dunkler als in der Disney-Version — er tötet die sprechende Grille und wird mehrfach gehängt."
    ),

    Question(
        categoryId = 10,
        questionText = "Wie lautet der vollständige Titel von Goethes bekanntestem Drama?",
        answerA = "Faust — Eine Tragödie",
        answerB = "Faust der Zauberer",
        answerC = "Doktor Faustus",
        answerD = "Faust und Mephisto",
        correctAnswer = 0,
        explanation = "Der vollständige Titel lautet 'Faust. Eine Tragödie' (Teil I, 1808). Goethes Werk besteht aus zwei Teilen — Teil II erschien 1832 posthum.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Wer schrieb den Roman 'Schachnovelle' (1942)?",
        answerA = "Thomas Mann",
        answerB = "Stefan Zweig",
        answerC = "Arthur Schnitzler",
        answerD = "Joseph Roth",
        correctAnswer = 1,
        explanation = "'Schachnovelle' (1942) ist das letzte Werk des österreichischen Autors Stefan Zweig. Es erzählt von einem Schachduell auf einem Schiff und von einem Mann, der durch Schachspielen in Gestapo-Einzelhaft seine Geisteskraft erhielt.",
        difficulty = 1,
        funFact = "Stefan Zweig schrieb die 'Schachnovelle' kurz vor seinem Freitod 1942 in Petrópolis, Brasilien, wo er im Exil lebte."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist ein 'Drama' in der Literatur?",
        answerA = "Ein langer Prosatext mit vielen Charakteren",
        answerB = "Ein für die Bühne bestimmter Text, der aus Dialogen und Regieanweisungen besteht",
        answerC = "Ein lyrisches Werk in mehreren Akten",
        answerD = "Eine Erzählung ohne Figurenrede",
        correctAnswer = 1,
        explanation = "Ein Drama ist ein literarisches Werk, das für die Aufführung auf einer Bühne geschrieben wurde. Es besteht aus Dialogen der Figuren und Regieanweisungen. Klassische Einteilung: Tragödie, Komödie, Tragikomödie.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher französische Autor schrieb 'Les Misérables' (Die Elenden)?",
        answerA = "Honoré de Balzac",
        answerB = "Gustave Flaubert",
        answerC = "Émile Zola",
        answerD = "Victor Hugo",
        correctAnswer = 3,
        explanation = "'Les Misérables' (1862) von Victor Hugo ist eines der bekanntesten Werke der französischen Literatur. Es folgt dem entlassenen Sträfling Jean Valjean auf seinem Weg zur Erlösung im Paris des frühen 19. Jahrhunderts.",
        difficulty = 1,
        funFact = "Victor Hugo schrieb den kürzesten Brief der Geschichte: Er schrieb '?' an seinen Verleger, um zu fragen, wie das Buch ankam. Die Antwort war '!'."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist ein 'Protagonist' in einem literarischen Werk?",
        answerA = "Der Bösewicht einer Geschichte",
        answerB = "Die Hauptfigur, um die sich die Handlung dreht",
        answerC = "Der Erzähler eines Romans",
        answerD = "Eine Nebenfigur, die dem Helden hilft",
        correctAnswer = 1,
        explanation = "Der Protagonist ist die Hauptfigur eines literarischen Werkes, um den sich die zentrale Handlung dreht. Das Wort kommt aus dem Griechischen: 'protos' (erster) + 'agonistes' (Kämpfer/Akteur).",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Wer schrieb das Theaterstück 'Nathan der Weise' (1779)?",
        answerA = "Friedrich Schiller",
        answerB = "Johann Wolfgang von Goethe",
        answerC = "Gotthold Ephraim Lessing",
        answerD = "Christian Friedrich Hebbel",
        correctAnswer = 2,
        explanation = "'Nathan der Weise' (1779) von Gotthold Ephraim Lessing ist ein Plädoyer für religiöse Toleranz. Die berühmte Ringparabel zeigt, dass keine Religion von sich behaupten kann, die einzig wahre zu sein.",
        difficulty = 1,
        funFact = "Lessing konnte das Stück nicht veröffentlichen, weil ihm die kirchliche Zensur drohte — er wandte sich stattdessen dem Theater zu, das er für freier hielt."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist die bekannteste Erzählung von Edgar Allan Poe?",
        answerA = "Der Rabe (Gedicht) oder Der Untergang des Hauses Usher",
        answerB = "Die Schatzinsel",
        answerC = "Das Bildnis des Dorian Gray",
        answerD = "Der Hund der Baskervilles",
        correctAnswer = 0,
        explanation = "Edgar Allan Poe (1809–1849) ist vor allem für sein Gedicht 'Der Rabe' (1845) und seine Horrorerzählungen wie 'Der Untergang des Hauses Usher' bekannt. Er gilt als Begründer des modernen Horrorgenres und der Detektivgeschichte.",
        difficulty = 1,
        funFact = "Poe ist auch als Erfinder der Detektivgeschichte bekannt — sein Detektiv C. Auguste Dupin war das Vorbild für Sherlock Holmes."
    ),

    // ── ADDITIONAL MEDIUM (difficulty = 2) ── 15 new questions ───────────────

    Question(
        categoryId = 10,
        questionText = "Was bezeichnet die literarische Epoche des 'Realismus' in Deutschland (ca. 1848–1890)?",
        answerA = "Eine Bewegung, die märchenhafte und romantische Elemente betont",
        answerB = "Eine Epoche, die das wirkliche Leben sachlich und ohne Verklärung darstellt, aber Details harmonisch auswählt (poetischer Realismus)",
        answerC = "Eine naturalistische Darstellung des Elends der Arbeiterschicht",
        answerD = "Eine idealistische Bewegung der deutschen Klassik",
        correctAnswer = 1,
        explanation = "Der deutsche Realismus (1848–1890) — auch 'poetischer Realismus' — schildert das bürgerliche Leben mit Genauigkeit, aber auch mit ästhetischer Verklärung. Wichtige Vertreter: Theodor Fontane, Gottfried Keller, Theodor Storm.",
        difficulty = 2,
        funFact = "Der Begriff 'poetischer Realismus' wurde von Otto Ludwig geprägt, um den deutschen Realismus vom harten französischen Naturalismus à la Zola zu unterscheiden."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Autor schrieb 'Kabale und Liebe' (1784)?",
        answerA = "Johann Wolfgang von Goethe",
        answerB = "Friedrich Schiller",
        answerC = "Heinrich von Kleist",
        answerD = "Gotthold Ephraim Lessing",
        correctAnswer = 1,
        explanation = "'Kabale und Liebe' (1784) ist ein bürgerliches Trauerspiel von Friedrich Schiller. Es zeigt den tragischen Liebeskonflikt zwischen dem Adligen Ferdinand und der bürgerlichen Luise, die von höfischen Intrigen zerstört werden.",
        difficulty = 2,
        funFact = "Schiller schrieb das Stück als Kritik an der feudalen Willkürherrschaft — inspiriert von Erlebnissen am württembergischen Hof unter Herzog Carl Eugen."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist ein 'innerer Monolog' als Erzähltechnik?",
        answerA = "Ein Gespräch einer Figur mit sich selbst, das andere Figuren hören können",
        answerB = "Die direkte, ungefilterte Wiedergabe der Gedanken einer Figur ohne Erzählereinmischung",
        answerC = "Eine lange Rede der Hauptfigur an das Publikum",
        answerD = "Eine Erzähltechnik, bei der die Zeit rückwärts läuft",
        correctAnswer = 1,
        explanation = "Der innere Monolog gibt direkt die Gedanken einer Figur wieder, ohne Erzählerkommentar. Er ist eng verwandt mit dem 'Stream of Consciousness', aber strukturierter. Arthur Schnitzler war ein früher Meister dieser Technik.",
        difficulty = 2,
        funFact = "Arthur Schnitzlers 'Leutnant Gustl' (1900) gilt als erster innerer Monolog der deutschsprachigen Literatur."
    ),

    Question(
        categoryId = 10,
        questionText = "Welche Romanfigur gilt als Inbegriff des ehrgeizigen gesellschaftlichen Aufsteigers in der französischen Literatur?",
        answerA = "Jean Valjean (Hugo)",
        answerB = "Julien Sorel aus 'Rot und Schwarz' von Stendhal",
        answerC = "Rastignac aus Balzacs 'Vater Goriot'",
        answerD = "Emma Bovary aus Flauberts 'Madame Bovary'",
        correctAnswer = 1,
        explanation = "Julien Sorel in Stendhals 'Rot und Schwarz' (1830) ist der Prototyp des ehrgeizigen jungen Mannes aus niederem Stand, der mit allen Mitteln in die Pariser Gesellschaft aufsteigen will — und scheitert.",
        difficulty = 2,
        funFact = "Stendhal schrieb den Roman, als er in einer Uniform einen Knopf hatte — 'Rot' symbolisiert das Militär, 'Schwarz' die Kirche als Aufstiegswege."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist ein 'Epigramm' als literarische Form?",
        answerA = "Ein langes Lehrgedicht über philosophische Themen",
        answerB = "Ein kurzes, geistreiches Gedicht oder Prosastück mit pointiertem Schluss",
        answerC = "Die Schlussverse eines Dramas",
        answerD = "Ein Gedicht, das auf einem Grabstein steht",
        correctAnswer = 1,
        explanation = "Das Epigramm ist ein kurzes, pointiertes Gedicht oder Prosawerk mit überraschendem, witzig-treffendem Schluss. Es hat Tradition seit der Antike. Friedrich Schiller und Goethe schrieben gemeinsam die 'Xenien' — eine Sammlung kritischer Epigramme.",
        difficulty = 2,
        funFact = "Das Wort 'Epigramm' kommt vom griechischen 'epigramma' — ursprünglich bedeutete es einfach 'Aufschrift' (z.B. auf Denkmälern)."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Roman von Gustave Flaubert gilt als Inbegriff des französischen Realismus?",
        answerA = "Les Misérables",
        answerB = "Germinal",
        answerC = "Madame Bovary",
        answerD = "Nana",
        correctAnswer = 2,
        explanation = "'Madame Bovary' (1857) von Gustave Flaubert erzählt von Emma Bovary, einer Landarztfrau, die durch Romanzen und Träumereien dem grauen Alltag zu entfliehen sucht und scheitert.",
        difficulty = 2,
        funFact = "Flaubert wurde wegen 'Madame Bovary' wegen Verletzung der öffentlichen Moral angeklagt — und freigesprochen. Der Skandal machte das Buch berühmt."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist das Besondere an E.T.A. Hoffmanns literarischem Werk 'Der Sandmann' (1816)?",
        answerA = "Es ist eine Kindergeschichte über einen freundlichen Schlafbringer",
        answerB = "Es ist eine Schauergeschichte, die gezielt die Grenze zwischen Wahn und Wirklichkeit verwischt (das Unheimliche)",
        answerC = "Es ist ein realistischer Roman über einen Uhrmacher",
        answerD = "Es ist ein romantisches Liebesdrama mit Happy End",
        correctAnswer = 1,
        explanation = "'Der Sandmann' von E.T.A. Hoffmann ist eine Erzählung der Schwarzen Romantik, in der der Protagonist Nathanael in paranoide Angst vor dem Sandmann verfällt. Sigmund Freud analysierte den Text als Paradebeispiel des 'Unheimlichen'.",
        difficulty = 2,
        funFact = "Freud schrieb 1919 seinen Essay 'Das Unheimliche' und nutzte 'Der Sandmann' als Hauptbeispiel — das Unheimliche entsteht, wenn Vertrautes plötzlich fremd und bedrohlich wirkt."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Autor schrieb den Roman 'Siddharta' (1922)?",
        answerA = "Rainer Maria Rilke",
        answerB = "Stefan Zweig",
        answerC = "Hermann Hesse",
        answerD = "Hugo von Hofmannsthal",
        correctAnswer = 2,
        explanation = "'Siddhartha' (1922) von Hermann Hesse erzählt die spirituelle Suche eines jungen Brahmanen im alten Indien. Das Buch wurde besonders in den 1960ern ein Kultbuch der Hippie-Bewegung.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Was bezeichnet der Begriff 'Barock' als Literaturepoche (ca. 1600–1720)?",
        answerA = "Eine nüchterne, rationale Schreibweise der frühen Neuzeit",
        answerB = "Eine Epoche zwischen Prunk und Vanitas, geprägt von Überfluss, Ornamentik und dem Bewusstsein der Vergänglichkeit",
        answerC = "Eine mittelalterliche Minneliteratur",
        answerD = "Eine aufklärerische Bewegung gegen kirchliche Dogmen",
        correctAnswer = 1,
        explanation = "Die Barockliteratur (ca. 1600–1720) ist geprägt von Gegensätzen: Prunk und Vergänglichkeit (Vanitas), Diesseits und Jenseits. Typisches Motiv: 'Memento mori'. Vertreter: Andreas Gryphius, Hans Jakob Christoffel von Grimmelshausen.",
        difficulty = 2,
        funFact = "Das Wort 'Barock' kommt vom portugiesischen 'barroco' (unregelmäßige Perle) — ursprünglich ein abwertender Begriff für übertriebenen Prunk."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist ein 'Prolog' im Drama?",
        answerA = "Das letzte Wort einer dramatischen Figur",
        answerB = "Eine einleitende Textpassage vor dem eigentlichen Stück, die Kontext oder Thema vorstellt",
        answerC = "Die Zusammenfassung aller Akte am Ende",
        answerD = "Eine Regieanweisung für den Bühnenaufbau",
        correctAnswer = 1,
        explanation = "Ein Prolog ist eine Einleitung vor dem eigentlichen Drama, die das Publikum über Kontext, Thema oder Vorgeschichte informiert. Goethes 'Faust' beginnt z.B. mit einem 'Prolog im Himmel'.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welches Werk von Heinrich von Kleist gilt als eine der besten deutschen Novellen?",
        answerA = "Das Erdbeben in Chili",
        answerB = "Der Zerbrochene Krug",
        answerC = "Michael Kohlhaas",
        answerD = "Penthesilea",
        correctAnswer = 2,
        explanation = "'Michael Kohlhaas' (1810) von Heinrich von Kleist gilt als Meisterwerk der deutschen Novelle. Ein Pferdehändler wird durch Willkür eines Junkers um sein Recht gebracht und beginnt einen blutigen Rachefeldzug.",
        difficulty = 2,
        funFact = "Die Geschichte basiert auf einem realen Fall: Hans Kohlhase, ein märkischer Kaufmann, der im 16. Jahrhundert Brandenburgs Dörfer plünderte und 1540 hingerichtet wurde."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist ein 'Antagonist' in einem literarischen Werk?",
        answerA = "Der Erzähler, der nie sichtbar wird",
        answerB = "Eine Figur, die dem Protagonisten entgegensteht und seine Ziele blockiert",
        answerC = "Ein Charakter, der sich im Laufe der Handlung positiv verändert",
        answerD = "Die weibliche Hauptrolle in einem Drama",
        correctAnswer = 1,
        explanation = "Der Antagonist ist die Gegenfigur zum Protagonisten — er blockiert oder bekämpft dessen Ziele. Das kann ein Bösewicht sein, aber auch eine Naturgewalt, eine gesellschaftliche Macht oder ein innerer Konflikt.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Schriftsteller begründete die Gattung der Detektivgeschichte mit Figuren wie Auguste Dupin?",
        answerA = "Arthur Conan Doyle",
        answerB = "Agatha Christie",
        answerC = "Edgar Allan Poe",
        answerD = "Wilkie Collins",
        correctAnswer = 2,
        explanation = "Edgar Allan Poe gilt als Erfinder der Detektivgeschichte mit seinem Charakter C. Auguste Dupin ('Die Morde in der Rue Morgue', 1841). Dupin war das direkte Vorbild für Sherlock Holmes.",
        difficulty = 2,
        funFact = "Arthur Conan Doyle bezeichnete Poe ausdrücklich als Vorbild für Sherlock Holmes. Holmes bedankt sich in einer Geschichte sogar bei 'dem französischen Detektiv Dupin'."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist die 'Ballade' als literarische Gattung?",
        answerA = "Ein gesungenes Liebeslied aus der Troubadour-Tradition",
        answerB = "Ein erzählendes Gedicht, das dramatische Ereignisse in lyrischer Form schildert",
        answerC = "Ein kurzes Theaterstück in Versform",
        answerD = "Ein mittelalterliches Volksepos ohne Reim",
        correctAnswer = 1,
        explanation = "Die Ballade ist ein erzählendes Gedicht mit dramatisch-lyrischem Charakter. Sie verbindet Epik, Lyrik und Dramatik. Bekannte Beispiele: Goethes 'Erlkönig', Schillers 'Die Bürgschaft', Uhlands 'Des Sängers Fluch'.",
        difficulty = 2,
        funFact = "Goethe und Schiller veranstalteten 1797 gemeinsam einen 'Balladenwettbewerb' — das Jahr gilt seitdem als das 'Balladenjahr' der deutschen Literatur."
    ),

    Question(
        categoryId = 10,
        questionText = "Welche Autorin schrieb 'Stolz und Vorurteil' (Pride and Prejudice, 1813)?",
        answerA = "Charlotte Brontë",
        answerB = "Emily Brontë",
        answerC = "Mary Shelley",
        answerD = "Jane Austen",
        correctAnswer = 3,
        explanation = "'Stolz und Vorurteil' (1813) ist der bekannteste Roman der englischen Autorin Jane Austen. Er erzählt von der Liebesgeschichte zwischen Elizabeth Bennet und dem stolzen Mr. Darcy.",
        difficulty = 2,
        funFact = "Jane Austen veröffentlichte ihre Romane anonym — auf den Titelblättern stand nur 'By a Lady' oder 'By the Author of...'. Ihr Name erschien erst posthum auf ihren Büchern."
    ),

    // ── ADDITIONAL HARD (difficulty = 3) ── 23 new questions ─────────────────

    Question(
        categoryId = 10,
        questionText = "Was bezeichnet die 'Neue Sachlichkeit' als literarische Bewegung (ca. 1920–1933)?",
        answerA = "Eine Bewegung zur Rückkehr zu klassischen Formen nach dem Expressionismus",
        answerB = "Eine nüchterne, reportagehafte Schreibweise, die soziale Realität ohne Romantisierung darstellt",
        answerC = "Eine surreale Bewegung mit traumartigen Bildern",
        answerD = "Eine politische Lyrik der Weimarer Republik",
        correctAnswer = 1,
        explanation = "Die Neue Sachlichkeit (1920–1933) reagierte auf den expressionistischen Überschwang mit nüchterner, journalistischer Prosa. Vertreter: Erich Maria Remarque ('Im Westen nichts Neues'), Irmgard Keun, Hans Fallada.",
        difficulty = 3,
        funFact = "Der Begriff 'Neue Sachlichkeit' wurde 1923 vom Kunsthistoriker Gustav Friedrich Hartlaub geprägt — zunächst für die bildende Kunst, dann auf Literatur übertragen."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist ein 'Petrarkismus' in der Lyrik?",
        answerA = "Eine Nachahmung Dantes in der Epik",
        answerB = "Ein europäischer Liebeslyrik-Stil nach dem Vorbild Petrarcas, mit idealisierten Frauenbildern und Gegensatzpaaren",
        answerC = "Eine antike Odenform des Horaz",
        answerD = "Ein stilistisches Prinzip der Kürze und Prägnanz",
        correctAnswer = 1,
        explanation = "Petrarkismus bezeichnet die Nachahmung des italienischen Dichters Francesco Petrarca (1304–1374) in der europäischen Liebeslyrik des 15.–17. Jh. Typisch: Antithesen (Feuer/Eis), Idealisierung der geliebten Frau, unerwiderte Liebe.",
        difficulty = 3,
        funFact = "Petrarcas 'Canzoniere' — 366 Gedichte an die unerreichbare Laura — wurde über 200 Jahre lang in ganz Europa imitiert."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Autor schrieb den Roman 'Die Leiden des jungen Werthers' und welche gesellschaftliche Wirkung hatte er?",
        answerA = "Schiller — er löste eine Debatte über Selbstmord aus",
        answerB = "Goethe — er löste eine europaweite Nachahmungswelle von Selbstmorden aus (Werther-Effekt)",
        answerC = "Hölderlin — er wurde verboten und vom Klerus verbrannt",
        answerD = "Novalis — er führte zur Romantik-Bewegung in Europa",
        correctAnswer = 1,
        explanation = "Goethes 'Die Leiden des jungen Werthers' (1774) löste als erster bekannter Fall den sogenannten 'Werther-Effekt' aus: Nachahmungssuizide junger Männer in Europa, die wie Werther gekleidet starben. Das Buch wurde in einigen Ländern verboten.",
        difficulty = 3,
        funFact = "Der 'Werther-Effekt' ist bis heute ein anerkanntes soziologisches Phänomen — Medien berichten bei Prominenten-Suiziden deshalb nach bestimmten Richtlinien."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist eine 'Anapher' als Stilmittel?",
        answerA = "Die Wiederholung desselben Wortes oder Ausdrucks am Ende aufeinanderfolgender Sätze",
        answerB = "Die Wiederholung desselben Wortes oder Ausdrucks am Anfang aufeinanderfolgender Sätze oder Verse",
        answerC = "Ein Vergleich mit metaphorischer Übertragung",
        answerD = "Die Weglassung eines erwarteten Satzgliedes",
        correctAnswer = 1,
        explanation = "Die Anapher ist eine Wiederholung desselben Wortes oder derselben Wortgruppe am Anfang aufeinanderfolgender Sätze oder Verse. Beispiel: 'Ich rief. Ich schrie. Ich flehte.' Sie erzeugt Rhythmus und Nachdruck.",
        difficulty = 3,
        funFact = "Martin Luther Kings berühmteste Rede 'I Have a Dream' (1963) ist ein Musterbeispiel für die Anapher — die Phrase 'I have a dream' wiederholt sich acht Mal in Folge."
    ),

    Question(
        categoryId = 10,
        questionText = "Wer war Walther von der Vogelweide und welche literarische Bedeutung hatte er?",
        answerA = "Ein Minnesänger des 12./13. Jahrhunderts, der bedeutendste Vertreter des mittelhochdeutschen Minnegesangs",
        answerB = "Ein Hofchronist Kaiser Barbarossas",
        answerC = "Der Verfasser des Nibelungenlieds",
        answerD = "Ein frühmittelhochdeutscher Bibelübersetzer",
        correctAnswer = 0,
        explanation = "Walther von der Vogelweide (ca. 1170–1230) gilt als der bedeutendste Minnesänger des deutschen Mittelalters. Er erweiterte den Minnegesang durch politische Spruchdichtung und realistischere Frauenbilder.",
        difficulty = 3,
        funFact = "Walther von der Vogelweide gehörte zum fahrenden Volk der Spielleute — er hatte keinen festen Wohnsitz und lebte vom Mäzenatentum verschiedener Fürsten."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist das literarische Konzept der 'Katharsis' nach Aristoteles?",
        answerA = "Die moralische Lehre, die am Ende eines Theaterstücks gezogen wird",
        answerB = "Die emotionale Reinigung des Zuschauers durch Mitleid und Schrecken im Verlauf der Tragödie",
        answerC = "Die Reinigung der Sprache von Fremdwörtern",
        answerD = "Die Auflösung aller Konflikte am Ende eines Dramas",
        correctAnswer = 1,
        explanation = "Aristoteles beschrieb in seiner 'Poetik' die Katharsis als Reinigung (kathársis) der Gefühle des Zuschauers durch Mitleid (eleos) und Schrecken (phobos) im Verlauf der Tragödie.",
        difficulty = 3,
        funFact = "Die genaue Bedeutung von Aristoteles' Katharsis ist bis heute umstritten — es gibt medizinische, moralische und ästhetische Deutungen des Begriffs."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Autor schrieb 'Emilia Galotti' (1772) und gilt als Begründer des bürgerlichen Trauerspiels?",
        answerA = "Friedrich Schiller",
        answerB = "Gotthold Ephraim Lessing",
        answerC = "Johann Wolfgang von Goethe",
        answerD = "Andreas Gryphius",
        correctAnswer = 1,
        explanation = "'Emilia Galotti' (1772) von Gotthold Ephraim Lessing ist neben 'Miss Sara Sampson' (1755) ein Meilenstein des bürgerlichen Trauerspiels: Bürger — nicht Könige — als tragische Helden auf der Bühne.",
        difficulty = 3,
        funFact = "Lessing war auch einer der ersten professionellen Theaterkritiker Deutschlands — seine 'Hamburgische Dramaturgie' (1767–69) beeinflusste das deutschsprachige Theater grundlegend."
    ),

    Question(
        categoryId = 10,
        questionText = "Was bezeichnet 'Poetik' als Wissenschaft?",
        answerA = "Die Geschichte der deutschen Dichtung",
        answerB = "Die Theorie und Lehre von den Regeln, Formen und Prinzipien literarischer Gestaltung",
        answerC = "Die Analyse von Versmaßen in Gedichten",
        answerD = "Die Biografie großer Dichter",
        correctAnswer = 1,
        explanation = "Die Poetik ist die Wissenschaft von den Regeln, Gattungen und Wirkungsweisen der Literatur. Aristoteles' 'Poetik' (ca. 335 v. Chr.) ist das älteste erhaltene Werk dieser Art und prägte die abendländische Literaturtheorie.",
        difficulty = 3,
        funFact = "Aristoteles' 'Poetik' ist unvollständig überliefert — der zweite Teil über die Komödie ist verloren. Umberto Eco machte daraus den Mittelpunkt seines Romans 'Der Name der Rose'."
    ),

    Question(
        categoryId = 10,
        questionText = "Was versteht man unter 'Erlebter Rede' als Erzähltechnik?",
        answerA = "Direkte Rede einer Figur, die vom Erzähler kommentiert wird",
        answerB = "Eine Mischform zwischen direkter und indirekter Rede, bei der Figuren-Gedanken in Erzählerperspektive erscheinen ohne Anführungszeichen",
        answerC = "Die Technik, Dialoge möglichst realistisch wiederzugeben",
        answerD = "Ein auktorialer Kommentar über die Gefühle einer Figur",
        correctAnswer = 1,
        explanation = "Erlebte Rede (auch 'freie indirekte Rede') ist eine Mischform: Die Innenperspektive einer Figur wird in der Erzählerstimme wiedergegeben — ohne Anführungszeichen, meist in Präteritum. Sie erzeugt Intimität mit der Figur.",
        difficulty = 3,
        funFact = "Jane Austen gilt als frühe Meisterin der erlebten Rede — in 'Emma' (1815) ist es oft nicht klar, ob der Erzähler oder Emma selbst spricht."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher japanische Autor schrieb den Roman 'Naokos Lächeln' (Norwegian Wood, 1987)?",
        answerA = "Kenzaburo Oe",
        answerB = "Yasunari Kawabata",
        answerC = "Yukio Mishima",
        answerD = "Haruki Murakami",
        correctAnswer = 3,
        explanation = "'Naokos Lächeln' (japanisch: Noruwei no Mori, 1987) ist ein Liebesroman von Haruki Murakami. Er verhalf Murakami zum Durchbruch und verkaufte sich in Japan über zwei Millionen Mal innerhalb eines Jahres.",
        difficulty = 3,
        funFact = "Der Titel ist ein Beatles-Song: 'Norwegian Wood (This Bird Has Flown)' — im Roman hört die Hauptfigur Naoko es auf einer Schallplatte."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist eine 'Litotes' als Stilmittel?",
        answerA = "Eine dreifache Wiederholung zur Betonung",
        answerB = "Eine Untertreibung, oft durch doppelte Verneinung ('nicht schlecht' für 'gut')",
        answerC = "Ein Vergleich zwischen gegensätzlichen Dingen",
        answerD = "Die Verwendung eines Abstraktums für ein Konkretes",
        correctAnswer = 1,
        explanation = "Die Litotes ist eine Untertreibung durch Verneinung des Gegenteils. 'Das ist nicht schlecht' bedeutet 'Das ist gut'. Sie erzeugt ironische Distanz oder betont durch Understatement.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Aspekt macht Günter Grass' Roman 'Die Blechtrommel' so bedeutend in der Nachkriegsliteratur?",
        answerA = "Er war der erste Roman, der die Bombardierung Dresdens literarisch verarbeitete",
        answerB = "Er brach das Schweigen über den Nationalsozialismus durch einen provokant-grotesken Blick eines kindlichen Außenseiters",
        answerC = "Er führte die Technik des magischen Realismus erstmals in die deutsche Literatur ein",
        answerD = "Er war das erste Werk der Gruppe 47, das einen Nobelpreis erhielt",
        correctAnswer = 1,
        explanation = "'Die Blechtrommel' (1959) war nach dem Krieg und dem Schweigen der Adenauer-Ära ein Schock: Grass zeigte den Nationalsozialismus durch die Augen des absurden Oskar Matzerath — grotesk, satirisch, anklagend.",
        difficulty = 3,
        funFact = "Grass selbst gehörte zur Gruppe 47, dem wichtigsten literarischen Zirkel der Nachkriegszeit, der Autoren wie Heinrich Böll, Ingeborg Bachmann und Ilse Aichinger umfasste."
    ),

    Question(
        categoryId = 10,
        questionText = "Was bezeichnet die 'Topos'-Forschung in der Literaturwissenschaft?",
        answerA = "Die geographische Verortung von Handlungsorten in Romanen",
        answerB = "Die Untersuchung wiederkehrender literarischer Motive, Bilder und Formeln (topoi) durch Epochen und Kulturen hindurch",
        answerC = "Die Analyse von Ortsnamen in mittelhochdeutscher Literatur",
        answerD = "Die Erforschung antiker Theaterbühnen",
        correctAnswer = 1,
        explanation = "Die Toposforschung (begründet von Ernst Robert Curtius in 'Europäische Literatur und lateinisches Mittelalter', 1948) untersucht wiederkehrende literarische Konventionen (topoi) wie 'puer senex' (alter Knabe), 'locus amoenus' (lieblicher Ort) durch die Literaturgeschichte.",
        difficulty = 3,
        funFact = "Ernst Robert Curtius' Werk ist bis heute ein Standardwerk der Komparatistik und Mediävistik."
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Autor schrieb 'Der Steppenwolf' (1927) und was ist das zentrale Thema?",
        answerA = "Thomas Mann — die Dekadenz des Bürgertums",
        answerB = "Hermann Hesse — die gespaltene Natur des modernen Intellektuellen zwischen bürgerlicher Welt und Wolfsnatur",
        answerC = "Robert Musil — die Identitätskrise des österreichischen Intellektuellen",
        answerD = "Stefan Zweig — der Verfall der europäischen Kulturtradition",
        correctAnswer = 1,
        explanation = "'Der Steppenwolf' (1927) von Hermann Hesse handelt von Harry Haller, der zwischen seiner bürgerlichen Seite und seiner wilden 'Wolfsnatur' zerrissen ist. Das Buch wurde in den 1960ern ein Kultbuch der Gegenkultur.",
        difficulty = 3,
        funFact = "Die amerikanische Rockband 'Steppenwolf' ('Born to be Wild', 1968) benannte sich nach Hesses Roman."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist eine 'Chiasmus' als Stilfigur?",
        answerA = "Die Wiederholung eines Begriffs in spiegelverkehrter Reihenfolge (ABBA-Struktur)",
        answerB = "Die Verschachtelung von Nebensätzen ohne erkennbare Struktur",
        answerC = "Die Anhäufung von Synonymen zur Verstärkung",
        answerD = "Die Umstellung des Subjekts an das Satzende",
        correctAnswer = 0,
        explanation = "Der Chiasmus ist eine Überkreuzstellung von Satzgliedern nach dem ABBA-Muster. Beispiel: 'Man lebt nicht um zu essen, sondern isst, um zu leben.' Die Elemente werden gespiegelt angeordnet.",
        difficulty = 3,
        funFact = "Der Begriff kommt vom griechischen Buchstaben Chi (X) — das Muster ähnelt einem Kreuz oder X."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist die 'Exilliteratur' im Kontext der deutschen Literatur?",
        answerA = "Literatur, die während des Mittelalters von verbannten Rittern verfasst wurde",
        answerB = "Literatur deutschsprachiger Autoren, die während der NS-Zeit (1933–1945) ins Ausland fliehen mussten",
        answerC = "DDR-Literatur, die im Westen verboten war",
        answerD = "Literatur von Migranten in Deutschland nach 1990",
        correctAnswer = 1,
        explanation = "Exilliteratur bezeichnet die Werke deutschsprachiger Autoren, die vor den Nationalsozialisten ins Ausland flohen (1933–1945). Bedeutende Exilautoren: Thomas Mann (USA), Bertolt Brecht (USA/Dänemark), Anna Seghers, Heinrich Mann.",
        difficulty = 3,
        funFact = "Thomas Mann hielt nach seiner Emigration in die USA regelmäßige Radiobotschaften ('Deutsche Hörer!') an die deutsche Bevölkerung — die BBC sendete sie nach Deutschland."
    ),

    Question(
        categoryId = 10,
        questionText = "Was bezeichnet der Begriff 'Hyperbel' als Stilmittel?",
        answerA = "Eine Untertreibung zur ironischen Distanzierung",
        answerB = "Eine maßlose Übertreibung zur Verstärkung des Ausdrucks",
        answerC = "Ein Vergleich zweier ungleicher Dinge",
        answerD = "Die Umstellung der Satzglieder zur Betonung",
        correctAnswer = 1,
        explanation = "Die Hyperbel (griech.: Übertreibung) ist eine maßlose Übertreibung als Stilmittel. Beispiele: 'Ich habe dir das tausendmal gesagt', 'Ich sterbe vor Lachen'. Sie dient zur Verstärkung von Aussagen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Welcher Autor schrieb das Drama 'Penthesilea' (1808) und gilt als Meister der Extrempsychologie?",
        answerA = "Friedrich Schiller",
        answerB = "Johann Wolfgang von Goethe",
        answerC = "Heinrich von Kleist",
        answerD = "Georg Büchner",
        correctAnswer = 2,
        explanation = "'Penthesilea' (1808) von Heinrich von Kleist zeigt die Amazonenkönigin, die ihren Geliebten Achilles in rasender Leidenschaft tötet und zerfleischt. Das Stück gilt als Extremfall der Emotionsdarstellung in der deutschen Literatur.",
        difficulty = 3,
        funFact = "Goethe lehnte 'Penthesilea' ab und bezeichnete das Stück als 'zu exzentrisch' — er konnte mit Kleists extremer Emotionalität nichts anfangen."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist ein 'Oxymoron' als Stilmittel?",
        answerA = "Die Verbindung zweier synonymer Begriffe zur Verstärkung",
        answerB = "Die Verbindung zweier sich widersprechender Begriffe zu einem sinnvollen Ausdruck",
        answerC = "Die ironische Verkehrung der eigentlichen Bedeutung",
        answerD = "Eine dreifache Wiederholung zur Klimax",
        correctAnswer = 1,
        explanation = "Das Oxymoron verbindet zwei scheinbar widersprüchliche Begriffe: 'beredtes Schweigen', 'brennendes Eis', 'lebendiger Tod'. Es erzeugt paradoxe, intensive Ausdruckskraft.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist 'Trümmer- oder Kahlschlagliteratur' im deutschen Nachkriegskontext?",
        answerA = "Literatur über die physische Zerstörung deutscher Städte",
        answerB = "Eine literarische Bewegung nach 1945, die mit der Nazi-Sprache brach und in nüchterner, reduzierten Sprache neu anfangen wollte",
        answerC = "Expressionistische Gedichte über den Ersten Weltkrieg",
        answerD = "DDR-Literatur der 1950er Jahre über den Wiederaufbau",
        correctAnswer = 1,
        explanation = "Die 'Trümmerliteratur' (auch 'Kahlschlagliteratur') nach 1945 wollte mit der verlogenen NS-Sprache brechen. Sie nutzte einfache, direkte Sprache und schilderte die Kriegswirklichkeit nüchtern. Vertreter: Wolfgang Borchert, Heinrich Böll.",
        difficulty = 3,
        funFact = "Wolfgang Borcherts Heimkehrerdrama 'Draußen vor der Tür' (1947) wurde einen Tag vor seinem Tod mit 26 Jahren uraufgeführt — er starb an den Spätfolgen seiner Kriegsverletzungen."
    ),

    Question(
        categoryId = 10,
        questionText = "Welche Besonderheit hat die Schreibweise in Thomas Manns Roman 'Der Zauberberg' (1924)?",
        answerA = "Er ist komplett in Dialektsprache verfasst",
        answerB = "Er spielt auf einem Schweizer Sanatorium und nutzt die Zeitillusion als zentrales Thema — Zeit dehnt sich oder vergeht je nach Erfahrung",
        answerC = "Er ist ausschließlich in Briefform geschrieben",
        answerD = "Er enthält keinen einzigen Dialog zwischen den Figuren",
        correctAnswer = 1,
        explanation = "'Der Zauberberg' (1924) spielt auf einem Tuberkulose-Sanatorium in Davos. Thomas Mann untersucht darin das Wesen der Zeit: Im Sanatorium verliert die Zeit ihre normale Struktur — sieben Jahre vergehen für den Helden Hans Castorp wie im Rausch.",
        difficulty = 3,
        funFact = "Mann selbst besuchte seine Frau in einem Davoser Sanatorium — ursprünglich nur für drei Wochen geplant, sammelte er Material für das Buch. Aus dem Besuch wurden drei Wochen Inspiration."
    ),

    Question(
        categoryId = 10,
        questionText = "Was ist die 'Gruppe 47' in der deutschen Literaturgeschichte?",
        answerA = "Eine Autorengruppe der DDR, die 1947 gegründet wurde",
        answerB = "Ein einflussreicher Zusammenschluss westdeutscher Schriftsteller (1947–1977), der die Nachkriegsliteratur prägte",
        answerC = "Eine Verlegervereinigung für Nachkriegsliteratur",
        answerD = "Eine staatliche Förderinstanz für junge Autoren nach 1945",
        correctAnswer = 1,
        explanation = "Die Gruppe 47 (1947–1977) war ein informeller Zusammenschluss deutschsprachiger Autoren um Hans Werner Richter. Mitglieder lasen unveröffentlichte Texte vor und erhielten sofortige Kritik. Mitglieder: Böll, Grass, Bachmann, Celan.",
        difficulty = 3,
        funFact = "Paul Celan las 1952 bei der Gruppe 47 seine 'Todesfuge' vor — und wurde dafür kritisiert, zu 'artistisch' zu sein. Heute gilt das Gedicht als eines der bedeutendsten der deutschen Nachkriegsliteratur."
    )
)
