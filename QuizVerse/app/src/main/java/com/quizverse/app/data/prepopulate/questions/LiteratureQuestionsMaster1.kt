package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun literatureQuestionsMaster1(): List<Question> = listOf(

    // Question 1 — Genette: Narratologie / Fokalisation
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welchen Begriff führte Gérard Genette in 'Discours du récit' (1972) ein, um die Perspektive im Erzähltext zu beschreiben — und grenzte ihn dabei explizit vom Begriff des 'point of view' ab?",
        answerA = "Fokalisation",
        answerB = "Perspektivierung",
        answerC = "Okularisation",
        answerD = "Narration",
        correctAnswer = 0,
        explanation = "Genette prägte den Begriff 'Fokalisation' (focalisation), um die Frage 'Wer sieht?' von 'Wer spricht?' zu trennen. Er kritisierte damit Begriffe wie 'point of view', die Wahrnehmung und Erzählung vermischen.",
        difficulty = 5,
        funFact = "Genette unterscheidet drei Fokalisationstypen: Nullfokalisation (allwissender Erzähler), interne Fokalisation (Perspektive einer Figur) und externe Fokalisation (Erzähler weiß weniger als die Figur)."
    ),

    // Question 2 — Genette: Anachronien
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet Genette mit dem Begriff 'Anachronie' in seiner Erzähltheorie?",
        answerA = "Die Abweichung zwischen Erzählstimme und Erzählperspektive",
        answerB = "Jede Diskrepanz zwischen der Reihenfolge der Ereignisse in der Geschichte und ihrer Anordnung im Erzähldiskurs",
        answerC = "Die Verwendung veralteter Sprachformen im modernen Roman",
        answerD = "Den Widerspruch zwischen erzählerischer Zuverlässigkeit und Figurenrede",
        correctAnswer = 1,
        explanation = "Anachronien sind bei Genette Abweichungen der Erzählordnung von der chronologischen Ordnung der Geschichte. Sie umfassen Analepsen (Rückblenden) und Prolepsen (Vorgriffe).",
        difficulty = 5,
        funFact = "Genette unterscheidet Anachronien nach ihrer Reichweite (Amplitude) und Distanz. Interne Anachronien können homodiegetisch oder heterodiegetisch sein, je nachdem ob sie auf dasselbe oder ein anderes Handlungsstrang verweisen."
    ),

    // Question 3 — Genette: Metalepse
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welches Konzept Genettes bezeichnet den Übergang zwischen verschiedenen Erzählebenen, etwa wenn ein Erzähler in seine eigene Geschichte eingreift oder eine Figur die Erzählung kommentiert?",
        answerA = "Paralepse",
        answerB = "Paralipse",
        answerC = "Metalepse",
        answerD = "Hypodiegese",
        correctAnswer = 2,
        explanation = "Die Metalepse bezeichnet bei Genette jede narrative Transgression zwischen den Erzählebenen. Sie verletzt die konventionelle Trennung zwischen der Welt des Erzählers und der Welt der Geschichte.",
        difficulty = 5,
        funFact = "Genette unterscheidet zwischen extradiegetischer, diegetischer und hypodiegetischer Ebene. Ein klassisches Beispiel für Metalepse findet sich in Cervantes' 'Don Quijote', wenn Figuren das Buch über sich selbst lesen."
    ),

    // Question 4 — Barthes: Tod des Autors
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welchem Essay formulierte Roland Barthes 1967/68 die These, dass die Geburt des Lesers mit dem Tod des Autors erkauft werden muss?",
        answerA = "Mythen des Alltags",
        answerB = "Das Reich der Zeichen",
        answerC = "S/Z",
        answerD = "La mort de l'auteur (Der Tod des Autors)",
        correctAnswer = 3,
        explanation = "In 'La mort de l'auteur' (1967/68) argumentiert Barthes, dass die Intention des Autors für die Bedeutungsproduktion eines Textes irrelevant ist. Bedeutung entsteht erst im Akt des Lesens.",
        difficulty = 5,
        funFact = "Barthes schrieb diesen Essay als direkte Kritik an der biografisch-psychologischen Interpretationsmethode, die in der Tradition Sainte-Beuves stand und im französischen Literaturunterricht dominierte."
    ),

    // Question 5 — Barthes: Denotation vs. Konnotation / Mythologie
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wie bezeichnet Barthes in seiner Mythentheorie das zweistufige Zeichensystem, bei dem ein vollständiges Zeichen (Signifikant + Signifikat) zum Signifikanten einer übergeordneten mythischen Bedeutung wird?",
        answerA = "Semiologie zweiter Ordnung (métalangage)",
        answerB = "Polysemie des Zeichens",
        answerC = "Rhetorische Figur der Synekdoche",
        answerD = "Isotopie der Konnotation",
        correctAnswer = 0,
        explanation = "In 'Mythologies' beschreibt Barthes den Mythos als Metasprache (métalangage): Das vollständige primäre Zeichen (Sprache) wird zum leeren Signifikanten eines sekundären mythischen Systems, das Ideologie naturalisiert.",
        difficulty = 5,
        funFact = "Barthes illustriert dies am Beispiel eines Titelfotos von Paris Match: Ein junger Afrikaner salutiert unter der französischen Flagge. Das Bild verweist nicht mehr auf eine Person, sondern naturalisiert den Imperialismus Frankreichs."
    ),

    // Question 6 — Barthes: S/Z und der lisible/scriptible-Text
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welche Unterscheidung trifft Roland Barthes in 'S/Z' (1970) zwischen zwei Texttypen, die er in der Analyse von Balzacs 'Sarrasine' entwickelt?",
        answerA = "Offener Text vs. geschlossener Text",
        answerB = "Lesbarer Text (texte lisible) vs. schreibbarer Text (texte scriptible)",
        answerC = "Denotativer Text vs. konnotativer Text",
        answerD = "Realistischer Text vs. avantgardistischer Text",
        correctAnswer = 1,
        explanation = "Barthes unterscheidet in 'S/Z' den 'texte lisible' (lesbaren Text), den der Leser passiv konsumiert, vom 'texte scriptible' (schreibbaren Text), der den Leser aktiv als Ko-Produzenten von Bedeutung einbezieht.",
        difficulty = 5,
        funFact = "Barthes identifiziert in 'S/Z' fünf Codes (hermeneutischer, proairetischer, semantischer, symbolischer und kultureller Code), nach denen er Balzacs Text Lexie für Lexie zerlegt."
    ),

    // Question 7 — Jauss: Erwartungshorizont und Horizontwandel
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Was versteht Hans Robert Jauß unter dem Begriff 'ästhetische Distanz' (distance esthétique) im Kontext seiner Rezeptionsästhetik?",
        answerA = "Die räumliche Distanz zwischen Autor und Leser in verschiedenen Epochen",
        answerB = "Die emotionale Distanzierung des Lesers vom Text durch Ironie",
        answerC = "Die Differenz zwischen dem literarischen Erwartungshorizont und dem neuen Werk, das diesen Horizont produktiv durchbricht",
        answerD = "Die Unzugänglichkeit avantgardistischer Werke für das Massenpublikum",
        correctAnswer = 2,
        explanation = "Jauß bezeichnet als 'ästhetische Distanz' den Abstand zwischen dem vorhandenen Erwartungshorizont des Publikums und dem neuen Werk. Ein großer Abstand kennzeichnet ästhetisch anspruchsvolle, kanonwürdige Literatur.",
        difficulty = 5,
        funFact = "Jauß entwickelte diese Konzepte in seiner Antrittsvorlesung 'Literaturgeschichte als Provokation der Literaturwissenschaft' (1967) in Konstanz — ein Gründungstext der Rezeptionsästhetik."
    ),

    // Question 8 — Iser: Leerstellen und impliziter Leser
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welches Konzept entwickelt Wolfgang Iser in 'Der Akt des Lesens' (1976), um die Unbestimmtheitsstellen im Text zu bezeichnen, die der Leser durch eigene Imagination ausfüllen muss?",
        answerA = "Fokalisierungsdefizit",
        answerB = "Kommunikationslücke",
        answerC = "Textuales Vakuum",
        answerD = "Leerstellen (blanks) und Negationen",
        correctAnswer = 3,
        explanation = "Iser unterscheidet 'Leerstellen' (blanks) — unbesetzte Stellen im Textsystem — von 'Negationen', die vorgegebene Bedeutungen durchstreichen. Beide fordern den Leser zur aktiven Sinnkonstitution auf.",
        difficulty = 5,
        funFact = "Isers Konzept des 'impliziten Lesers' (implied reader) ist nicht identisch mit dem 'idealen Leser' oder 'intendierten Leser'. Der implizite Leser ist eine im Text selbst angelegte Rolle, die jeder reale Leser mehr oder weniger vollständig einnimmt."
    ),

    // Question 9 — Bachtin: Dialogizität und Polyphonie
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welches Merkmal zeichnet nach Michail Bachtin den 'polyphonen Roman' (am Beispiel Dostojewskis) von monologischen Erzählformen ab?",
        answerA = "Die gleichberechtigte Koexistenz mehrerer unabhängiger Bewusstseine, ohne dass der Autor eine übergeordnete Wahrheit verkündet",
        answerB = "Die Verwendung mehrerer Erzähler in einem einzigen Roman",
        answerC = "Die Intertextualität mit musikalischen Polyphonieprinzipien",
        answerD = "Die Darstellung gesellschaftlicher Widersprüche durch Figurenkontraste",
        correctAnswer = 0,
        explanation = "Im polyphonen Roman Bachtins sind Figurenbewusstseine gleichrangig und unabhängig vom Autorenbewusstsein. Der Autor gibt keine autoritative Wahrheit vor, sondern lässt verschiedene Stimmen dialogisch miteinander streiten.",
        difficulty = 5,
        funFact = "Bachtin entwickelte seine Theorie des polyphonen Romans in 'Probleme der Poetik Dostoevskijs' (1929, überarbeitet 1963). Er sah in Dostojewski den Erfinder dieser Romanform."
    ),

    // Question 10 — Bachtin: Chronotopos
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet Bachtin mit dem Begriff 'Chronotopos' (Chronotop), den er aus der Mathematik und Einsteins Relativitätstheorie entlehnte?",
        answerA = "Die historische Verortung des Autors in seiner Entstehungszeit",
        answerB = "Die wesentliche Verknüpfung von Zeit- und Raumbeziehungen im künstlerisch-literarischen Text",
        answerC = "Die synchrone Abfolge von Handlungsmomenten im modernen Roman",
        answerD = "Die chronologische Struktur des Erzählers in Autobiografien",
        correctAnswer = 1,
        explanation = "Der Chronotopos bezeichnet bei Bachtin das untrennbare Zusammenspiel von Raum und Zeit im literarischen Text. Verschiedene Gattungen sind durch charakteristische Chronotopoi bestimmt (z.B. der Abenteuerchronotopos, der idyllische Chronotopos).",
        difficulty = 5,
        funFact = "Bachtin identifiziert u.a. den 'griechischen Abenteuerroman-Chronotopos' (abstrakte Zeit, leerer Raum), den 'Straßenchronotopos' (zufällige Begegnungen) und den 'Schwellenchronotopos' (Krisen- und Wendepunkte) als wiederkehrende Grundmuster."
    ),

    // Question 11 — Bachtin: Karneval und Groteske
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welche kulturphilosophische Funktion schreibt Bachtin dem Karneval und der Groteske in seiner Studie über Rabelais zu?",
        answerA = "Die Stabilisierung sozialer Hierarchien durch rituellen Ausnahmezustand",
        answerB = "Die Sublimierung volkstümlicher Triebe in künstlerische Ausdrucksformen",
        answerC = "Die zeitweise Aufhebung offizieller Ordnungen und hierarchischer Strukturen durch Lachen, Körperlichkeit und Umkehrung",
        answerD = "Die Bewältigung kollektiver Traumata durch gemeinschaftliches Feiern",
        correctAnswer = 2,
        explanation = "In 'Rabelais und seine Welt' (1965) analysiert Bachtin die Lachkultur des Mittelalters und der Renaissance als subversive Gegenwelt zur offiziellen Kultur. Der Karneval hebt temporär Hierarchien auf und feiert die regenerative Kraft des grotesken Körpers.",
        difficulty = 5,
        funFact = "Bachtin unterscheidet die 'groteske Körpervorstellung' (offen, in Verwandlung, Verschmelzung mit der Welt) von der 'klassischen' Körpervorstellung (geschlossen, vollendet, individuell). Diese Unterscheidung wurde in der Gender- und Körpertheorie (z.B. bei Judith Butler) rezipiert."
    ),

    // Question 12 — Derrida: Différance
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Was macht Derridas Kunstwort 'Différance' in der schriftlichen Darstellung des Französischen sichtbar, das in der gesprochenen Sprache nicht hörbar ist?",
        answerA = "Die Überlegenheit der Schrift über die Sprache in der Bedeutungsproduktion",
        answerB = "Die Willkürlichkeit des sprachlichen Zeichens nach Saussure",
        answerC = "Die etymologische Herkunft des Wortes 'différence' aus dem Lateinischen",
        answerD = "Dass Bedeutung niemals präsent ist, sondern stets aufgeschoben und durch Differenzen konstituiert wird — eine Differenz, die im Sprechen unsichtbar bleibt",
        correctAnswer = 3,
        explanation = "Derridas 'Différance' (mit 'a' statt 'e') ist im Französischen nur in der Schrift sichtbar, nicht hörbar. Es verkörpert seine These, dass Bedeutung nie vollständig präsent ist, sondern sich durch Differenz und ewiges Aufschub (différer = unterscheiden und aufschieben) konstituiert.",
        difficulty = 5,
        funFact = "Derrida stellte 'La Différance' 1968 in einem Vortrag vor der Société française de philosophie vor. Das Wort ist eine Verschmelzung von 'différence' (Differenz) und 'différer' (aufschieben) — und verkörpert performativ seine eigene These."
    ),

    // Question 13 — Derrida: Dekonstruktion und Logozentrismus
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet Derrida mit 'Logozentrismus' und welche philosophische Privilegierung kritisiert er damit?",
        answerA = "Die abendländische Privilegierung der gesprochenen Sprache (Phoné) als unmittelbare Präsenz des Sinns gegenüber der Schrift als sekundärer Ableitung",
        answerB = "Die Überbetonung der Logik in der analytischen Philosophie seit Frege",
        answerC = "Die Zentrierung des Textes auf eine einzige legitime Bedeutung durch den Autor",
        answerD = "Die Vorherrschaft rationaler Diskurse gegenüber literarischen Ausdrucksformen",
        correctAnswer = 0,
        explanation = "In 'De la grammatologie' (1967) kritisiert Derrida den Logozentrismus der westlichen Metaphysik: die Privilegierung des Logos (Vernunft, Wort, Sprechen) als unmittelbare Präsenz des Sinns, während Schrift als defizitäre Ableitung gilt. Derrida kehrt diese Hierarchie um.",
        difficulty = 5,
        funFact = "Derridas Grammatologie richtet sich gegen Saussures Phonozentrismus: Saussure behandelt die Schrift als parasitäre Darstellung der Lautsprache. Derrida zeigt, dass die Schrift (archi-écriture) ursprünglicher ist als die vermeintlich unmittelbare gesprochene Sprache."
    ),

    // Question 14 — Foucault: Diskurs und Autorschaft
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welche Funktion schreibt Michel Foucault dem 'Autornamen' in seinem Essay 'Was ist ein Autor?' (1969) zu?",
        answerA = "Die biographische Identifikation des Schreibers mit seinem Werk",
        answerB = "Eine Diskursfunktion, die Texte klassifiziert, zusammenführt und bestimmten Interpretationsregeln unterwirft",
        answerC = "Die urheberrechtliche Sicherung literarischer Eigentumsrechte",
        answerD = "Die hermeneutische Schlüsselfunktion für die Bedeutungsermittlung",
        correctAnswer = 1,
        explanation = "Foucault analysiert den 'Autornamen' nicht als biographische Referenz, sondern als Diskursfunktion: Er klassifiziert Texte, ermöglicht bestimmte Lektüren und verhindert andere. Der 'Autorfunktion' entspricht ein spezifischer Umgang mit Texten in einer Gesellschaft.",
        difficulty = 5,
        funFact = "Foucaults Essay ist eine direkte Antwort auf Barthes' 'Tod des Autors'. Foucault stimmt der Kritik am intentionalen Autor zu, fragt aber weiter: 'Was ist an die Stelle des Autors getreten?' Seine Antwort: die Autorfunktion als historisch variables Diskursphänomen."
    ),

    // Question 15 — Foucault: Ordnung des Diskurses
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welche drei großen 'Ausschließungssysteme' des Diskurses beschreibt Foucault in seiner Antrittsvorlesung 'Die Ordnung des Diskurses' (1970)?",
        answerA = "Sprache, Ideologie und Macht",
        answerB = "Wahrheit, Schönheit und Nützlichkeit",
        answerC = "Das Verbotene, die Trennung zwischen Vernunft und Wahnsinn, sowie den Willen zur Wahrheit",
        answerD = "Zensur, Kanon und Institutionalisierung",
        correctAnswer = 2,
        explanation = "Foucault nennt in 'Die Ordnung des Diskurses' drei externe Ausschließungssysteme: 1. das Tabu (das Verbotene), 2. die Grenze zwischen Vernunft und Wahnsinn, 3. den Willen zur Wahrheit. Sie kontrollieren, welche Aussagen als legitim gelten können.",
        difficulty = 5,
        funFact = "Diese Antrittsvorlesung am Collège de France wurde auf Einladung von Roland Barthes gehalten. Foucault und Barthes verbindet die Kritik an einer naiven Vorstellung von Wahrheit und Bedeutung als transzendentalen Größen."
    ),

    // Question 16 — Lacan: Das Unbewusste ist wie eine Sprache strukturiert
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche These Lacans revolutionierte die psychoanalytische Literaturwissenschaft, indem sie das Unbewusste mit sprachlichen Strukturen verband?",
        answerA = "Das Unbewusste ist ein Reservoir verdrängter Triebe, die im Traum symbolisch erscheinen",
        answerB = "Das Unbewusste ist identisch mit dem Es im Freudschen Strukturmodell",
        answerC = "Das Unbewusste äußert sich ausschließlich in der Symptomatologie des Körpers",
        answerD = "Das Unbewusste ist wie eine Sprache strukturiert — Verdichtung entspricht Metapher, Verschiebung entspricht Metonymie",
        correctAnswer = 3,
        explanation = "Lacan formulierte in den 1950er Jahren: 'Das Unbewusste ist wie eine Sprache strukturiert.' Er setzt Freuds Mechanismen Verdichtung (Condensation) mit Metapher und Verschiebung (Displacement) mit Metonymie gleich — in Analogie zu Jakobsons linguistischen Achsen.",
        difficulty = 5,
        funFact = "Diese These erlaubte Literaturwissenschaftlern wie Peter Brooks, psychoanalytische Kategorien direkt auf narrative Strukturen anzuwenden. Brooks' Konzept des 'narrativen Begehrens' basiert auf Lacans Theorie des Begehrens als ewigem Aufschub."
    ),

    // Question 17 — Freud: Das Unheimliche und die Literatur
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "An welchem literarischen Text analysiert Sigmund Freud in seinem Essay 'Das Unheimliche' (1919) den psychologischen Mechanismus des Unheimlichkeitserlebens?",
        answerA = "An E.T.A. Hoffmanns 'Der Sandmann' (1816), insbesondere an der Figur der Olimpia",
        answerB = "An Mary Shelleys 'Frankenstein' (1818)",
        answerC = "An Edgar Allan Poes 'The Fall of the House of Usher' (1839)",
        answerD = "An Dostojewskis 'Der Doppelgänger' (1846)",
        correctAnswer = 0,
        explanation = "Freud analysiert Hoffmanns 'Der Sandmann' als paradigmatischen Fall des Unheimlichen. Er zeigt, dass das Unheimliche ('Das Unheimliche ist in Wahrheit nichts Neues oder Fremdes, sondern etwas dem Seelenleben von alters her Vertrautes') aus der Wiederkehr verdrängter Inhalte entsteht.",
        difficulty = 5,
        funFact = "Freuds Essay steht in Dialog mit dem Philosophen Ernst Jentsch, der das Unheimliche rein intellektuell als 'Zweifel an der Beseelung' erklärte. Freud widerspricht: Es geht um die Rückkehr des Verdrängten, nicht um intellektuelle Unsicherheit."
    ),

    // Question 18 — Kristeva: Intertextualität und Semanalyse
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wer prägte den Begriff 'Intertextualität' in der Literaturwissenschaft, und auf welchem theoretischen Konzept Bachtins basierte er?",
        answerA = "Roland Barthes, basierend auf Saussures Semiotik",
        answerB = "Julia Kristeva, basierend auf Bachtins Begriff der Dialogizität",
        answerC = "Gérard Genette, basierend auf der Theorie der Hypertextualität",
        answerD = "Harold Bloom, basierend auf dem Konzept der 'anxiety of influence'",
        correctAnswer = 1,
        explanation = "Julia Kristeva prägte den Begriff 'Intertextualität' in den 1960er Jahren als Übersetzung und Transformation von Bachtins Dialogizitätsbegriff in eine strukturalistische Semiotik. Für Kristeva ist jeder Text ein Mosaik von Zitaten.",
        difficulty = 5,
        funFact = "Kristevas Begriff unterscheidet sich erheblich von dem, was Genette 'Intertextualität' nennt. Bei Kristeva ist Intertextualität eine allgemeine Eigenschaft aller Texte (als Transposition von Zeichensystemen), bei Genette eine spezifische Beziehung zwischen Texten (Zitat, Allusionen, Plagiat)."
    ),

    // Question 19 — Simone de Beauvoir: Das andere Geschlecht
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Was ist der literaturtheoretische Beitrag von Simone de Beauvoirs 'Das andere Geschlecht' (1949) für die feministische Literaturkritik?",
        answerA = "Die Forderung nach einer weiblichen Schreibweise (écriture féminine) als Alternative zum männlichen Kanon",
        answerB = "Die Analyse der psychoanalytischen Konstruktion weiblicher Identität durch den Ödipuskomplex",
        answerC = "Die Demontage der Frau als 'das Andere' des Mannes und der Nachweis der kulturellen Konstruiertheit von Weiblichkeit als Mythos",
        answerD = "Die Entwicklung eines materialistischen Ansatzes zur Erklärung von Geschlechterungleichheit in der Literaturproduktion",
        correctAnswer = 2,
        explanation = "Beauvoirs These 'Man wird nicht als Frau geboren, man wird dazu gemacht' war wegweisend für die feministische Literaturkritik: Sie etablierte Weiblichkeit als kulturelles Konstrukt und öffnete den Weg für Analysen, wie Literatur Bilder von Weiblichkeit produziert und naturalisiert.",
        difficulty = 5,
        funFact = "Beauvoirs Werk beeinflusste direkt die 'Image of Women'-Kritik der 1960er/70er Jahre (Kate Millett, Germaine Greer), die untersuchte, wie kanonische Texte Frauen als passive, irrationale oder böse Figuren darstellen."
    ),

    // Question 20 — Hélène Cixous: Écriture féminine
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Was fordert Hélène Cixous in ihrem Manifest 'Das Lachen der Medusa' (1975) mit dem Begriff 'écriture féminine'?",
        answerA = "Die Übernahme des literarischen Kanons durch weibliche Autorinnen",
        answerB = "Die strenge Trennung von männlichen und weiblichen Schreibweisen in der Literaturkritik",
        answerC = "Die Historisierung weiblicher Autorinnen als unterdrückte Gruppe innerhalb der Literaturgeschichte",
        answerD = "Eine Schreibpraxis, die den weiblichen Körper und libidinöse Energie in die Sprache einschreibt und die phallozentrische Ordnung des Symbolischen subvertiert",
        correctAnswer = 3,
        explanation = "Cixous fordert Frauen auf, zu schreiben und ihren Körper zu sprechen. Die 'écriture féminine' ist kein biologisch determinierter Stil, sondern eine libidinöse Textpraxis, die die binären Oppositionen (aktiv/passiv, Sonne/Mond, Kultur/Natur) dekonstruiert.",
        difficulty = 5,
        funFact = "Cixous beruft sich dabei explizit auf Kleist, Shakespeare, Jean Genet als Beispiele für 'weibliches Schreiben' von Männern — womit klar wird, dass 'écriture féminine' kein biologisches, sondern ein strukturelles Konzept ist."
    ),

    // Question 21 — Judith Butler: Performativität
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wie definiert Judith Butler in 'Das Unbehagen der Geschlechter' (Gender Trouble, 1990) das Konzept der Geschlechts-Performativität?",
        answerA = "Geschlecht ist kein Ausdruck einer inneren Identität, sondern wird durch wiederholte performative Akte zitierend hervorgebracht — es gibt kein Subjekt vor dem Akt",
        answerB = "Geschlecht ist eine soziale Rolle, die bewusst gespielt werden kann und daher veränderbar ist",
        answerC = "Performativität bezeichnet die theatrale Darstellung von Geschlechterrollen in literarischen Texten",
        answerD = "Geschlecht wird durch gesellschaftliche Normen vorgegeben und durch individuelle Handlungen lediglich reproduziert",
        correctAnswer = 0,
        explanation = "Butler adaptiert Austins Sprechakttheorie und Derridas Iterabilitätsbegriff: Gender ist nicht Ausdruck einer inneren Identität, sondern wird durch Wiederholung (Iteration) von Normen performativ erzeugt. Es gibt kein 'Ich' vor dem performativen Akt.",
        difficulty = 5,
        funFact = "Butlers Performativitätsbegriff unterscheidet sich von Austins Performance: Bei Austin sind Sprechakte Handlungen eines bereits konstituierten Subjekts. Bei Butler konstituiert sich das Subjekt erst durch den wiederholten performativen Akt."
    ),

    // Question 22 — Edward Said: Orientalismus
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Auf welcher Theorieverbindung basiert Edward Saids 'Orientalismus' (1978), und was ist sein zentrales Argument über westliche Repräsentationen des Orients?",
        answerA = "Said kombiniert Marxismus und Psychoanalyse, um zu zeigen, dass der Orient eine unbewusste Projektion westlicher Ängste ist",
        answerB = "Said verbindet Foucaults Diskurstheorie mit Gramscis Hegemoniekonzept, um zu zeigen, dass der Orientalismus ein Machtdiskurs ist, der den Orient als inferiores Anderes konstituiert und koloniale Herrschaft legitimiert",
        answerC = "Said wendet Derridas Dekonstruktion auf Reiseliteratur an, um die Instabilität kolonialer Repräsentationen zu beweisen",
        answerD = "Said nutzt Bachtins Dialogizität, um die arabischen Gegendiskurse zum westlichen Orientalismus zu rekonstruieren",
        correctAnswer = 1,
        explanation = "Said kombiniert Foucaults Diskursbegriff (Wissen als Machteffekt) mit Gramscis kultureller Hegemonie: Der Orientalismus ist ein systematischer Diskurs, durch den der Westen 'den Orient' als homogenes, statisches, irrationales Anderes konstruiert und damit Kolonialherrschaft legitimiert.",
        difficulty = 5,
        funFact = "Said kritisiert in 'Orientalismus' auch Aischylos, Dante, Hugo, Nerval, Flaubert, Kipling als Beispiele für orientalistische Literatur, die den Orient als exotisches, bedrohliches oder erotisiertes Objekt des westlichen Blicks inszeniert."
    ),

    // Question 23 — Homi Bhabha: Hybridität und Dritter Raum
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet Homi K. Bhabha mit dem Konzept des 'Dritten Raums' (Third Space) in seiner postkolonialen Theorie?",
        answerA = "Den geografischen Raum zwischen Kolonie und Metropole als Ort kulturellen Austauschs",
        answerB = "Die hybriden Räume, die durch Migration und Diaspora in westlichen Metropolen entstehen",
        answerC = "Den Ambivalenzraum der Enunziation, in dem kulturelle Bedeutungen verhandelt werden und der jede vermeintlich reine kulturelle Identität untergräbt",
        answerD = "Den postkolonialen Gegendiskurs, der die binäre Struktur des Kolonialismus überschreibt",
        correctAnswer = 2,
        explanation = "Bhabhas 'Dritter Raum' ist kein physischer Ort, sondern der Raum der Äußerung (enunciation) selbst: Jede kulturelle Aussage entsteht in einem Zwischen-Raum, der Bedeutungen instabil und verhandelbar macht. Er dekonstruiert die Vorstellung reiner, unvermischter Kulturen.",
        difficulty = 5,
        funFact = "Bhabha entwickelt das Konzept des 'Mimikry' als komplementäres Konzept: Der Kolonisierte, der die Kultur des Kolonisators imitiert, erzeugt stets eine irritierende 'fast aber nicht ganz' (almost the same but not quite) Kopie, die das Original destabilisiert."
    ),

    // Question 24 — Spivak: Kann die Subalterne sprechen?
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Zu welchem Schluss kommt Gayatri Chakravorty Spivak in ihrem Essay 'Can the Subaltern Speak?' (1988) bezüglich der Repräsentationsmöglichkeiten subalterner Subjekte?",
        answerA = "Die Subalterne kann durch postkoloniale Literatur eine eigene Stimme finden",
        answerB = "Die Subalterne kann sprechen, aber der Westen weigert sich, ihr zuzuhören",
        answerC = "Die Subalterne kann durch strategischen Essentialismus kollektive Sprecherposition einnehmen",
        answerD = "Die Subalterne kann nicht sprechen — nicht weil sie sprachlos ist, sondern weil es keine institutionellen Strukturen gibt, innerhalb derer ihre Aussage als legitime Aussage gehört werden könnte",
        correctAnswer = 3,
        explanation = "Spivak argumentiert, dass das subalterne Subjekt (besonders die subalterne Frau) strukturell aus Repräsentationsdiskursen ausgeschlossen ist. Das Problem ist nicht fehlendes Sprechen, sondern das Fehlen institutioneller Aufnahmestrukturen für dieses Sprechen.",
        difficulty = 5,
        funFact = "Spivak analysiert den Fall von Bhuvaneswari Bhaduri, einer jungen bengalischen Frau, die 1926 Selbstmord beging. Durch die Wahl ihres Menstruationszyklus als Todeszeitpunkt wollte sie jeden Verdacht der Schwangerschaft entkräften — doch diese Botschaft blieb ungehört."
    ),

    // Question 25 — Genette: Paratexte
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet Genette in 'Seuils' (Paratexte, 1987) als 'Peritext' und 'Epitext', und welche übergeordnete Funktion haben Paratexte?",
        answerA = "Peritext = Textelemente, die physisch Teil des Buches sind (Titel, Vorwort, Klappentext); Epitext = externe Paratexte (Interviews, Briefe des Autors). Beide lenken die Rezeption des Primärtextes.",
        answerB = "Peritext = Erzählerkommentare innerhalb des Textes; Epitext = kritische Texte über das Werk nach seiner Veröffentlichung",
        answerC = "Peritext = Marginaltexte im Manuskript; Epitext = Fußnoten und Anmerkungsapparat",
        answerD = "Peritext = fiktionale Rahmenerzählungen; Epitext = Widmungen und Motti",
        correctAnswer = 0,
        explanation = "Genettes Paratexttheorie unterscheidet Peritext (innerhalb des Buchkörpers: Titel, Widmung, Vorwort) vom Epitext (außerhalb: Interviews, Briefwechsel, Tagebücher). Paratexte bilden die 'Schwelle' des Textes und steuern Lektüreerwartungen.",
        difficulty = 5,
        funFact = "Der Titel 'Seuils' (Schwellen) ist selbst ein Paratext-Kunstgriff: Er verkörpert performativ die Metapher der Schwelle, die Genette für Paratexte verwendet — der Titel ist selbst die Schwelle, über die man ins Buch eintritt."
    ),

    // Question 26 — Jakobson: Poetische Funktion
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wie definiert Roman Jakobson in 'Linguistics and Poetics' (1960) die 'poetische Funktion' der Sprache, und wie unterscheidet er sie von anderen Sprachfunktionen?",
        answerA = "Die poetische Funktion betont die emotionale Ausdruckskraft des Sprechers (expressive Funktion)",
        answerB = "Die poetische Funktion richtet die Aufmerksamkeit auf die Botschaft um ihrer selbst willen — sie projiziert das Selektionsprinzip auf die Kombinationsachse",
        answerC = "Die poetische Funktion verweist auf außersprachliche Wirklichkeit durch figurative Sprache",
        answerD = "Die poetische Funktion dient der sozialen Kontaktherstellung zwischen Sprecher und Hörer",
        correctAnswer = 1,
        explanation = "Jakobsons Definition: Die poetische Funktion 'projects the principle of equivalence from the axis of selection into the axis of combination.' Gedichte organisieren Sprache so, dass Auswahl (paradigmatische Achse) und Kombination (syntagmatische Achse) in Beziehung gesetzt werden.",
        difficulty = 5,
        funFact = "Jakobson unterscheidet sechs Sprachfunktionen (referenziell, expressiv, konativ, phatisch, metasprachlich, poetisch), die je einem Faktor der Kommunikationssituation entsprechen. Die poetische ist keine exklusive Eigenschaft von Lyrik, sondern tritt in verschiedenen Graden in allen Texten auf."
    ),

    // Question 27 — Saussure: Semiotik und Strukturalismus
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welcher Begriff Saussures ist grundlegend für den literarischen Strukturalismus, und worin besteht seine Revolutionierung gegenüber der historischen Sprachwissenschaft des 19. Jahrhunderts?",
        answerA = "Der Begriff der 'parole' als individuelle Sprachverwendung, der die Synchronie der Sprache betont",
        answerB = "Der Begriff des 'Signifikanten' als lautliches Bild, das direkt auf die Wirklichkeit verweist",
        answerC = "Der Begriff des 'Zeichens' als arbiträre Verbindung von Signifikant und Signifikat, und die Betonung der synchronen Struktur (langue) gegenüber der diachronen Sprachgeschichte",
        answerD = "Der Begriff der 'Diachrone' als historische Entwicklung der Sprache im Gegensatz zur Synchronie",
        correctAnswer = 2,
        explanation = "Saussures Konzept des arbiträren Zeichens und die Unterscheidung langue/parole sowie synchron/diachron bildeten die Grundlage des Strukturalismus. Das Zeichen ist nicht durch seine Referenz, sondern durch sein Verhältnis zu anderen Zeichen innerhalb des Systems definiert.",
        difficulty = 5,
        funFact = "Saussures 'Cours de linguistique générale' (1916) wurde posthum von seinen Schülern aus Mitschriften zusammengestellt. Neuere Forschungen an Saussures eigenen Manuskripten zeigen, dass er differenzierter dachte als das kanonisch gewordene Lehrbuch suggeriert."
    ),

    // Question 28 — Northrop Frye: Archetypische Literaturkritik
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welches Ordnungsprinzip entwickelt Northrop Frye in seiner 'Anatomy of Criticism' (1957) für die Klassifikation literarischer Genres und Mythen?",
        answerA = "Die Klassifikation nach historischen Epochen und ihren dominanten Weltanschauungen",
        answerB = "Die Unterscheidung von hoher und niederer Literatur anhand rhetorischer Qualitätskriterien",
        answerC = "Die Einteilung nach dem sozialen Status der Figuren: Mythos (Götter), Romanze (Helden), Hochmimesis (edle Menschen), Niedermimesis (gewöhnliche Menschen), Ironie",
        answerD = "Die archetypische Struktur der vier saisonalen Mythen: Komödie (Frühling), Romanze (Sommer), Tragödie (Herbst), Satire/Ironie (Winter)",
        correctAnswer = 3,
        explanation = "Frye entwickelt in der 'Anatomy of Criticism' vier archetypische Mythen, die den vier Jahreszeiten entsprechen und alle literarischen Gattungen strukturieren. Diese zyklische Mythologie basiert auf Frazer und Jung.",
        difficulty = 5,
        funFact = "Fryes Ansatz ist eine der letzten großen Systematisierungsversuche der Literaturwissenschaft. Er wurde von Poststrukturalisten (besonders de Man) scharf kritisiert, weil er eine transhistorische Ordnung universeller Archetypen postuliert."
    ),

    // Question 29 — Harold Bloom: Einflussangst
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wie nennt Harold Bloom das Verhältnis zwischen starken Dichtern und ihren Vorläufern in 'The Anxiety of Influence' (1973), und welche sechs 'Revisionsverhältnisse' (revisionary ratios) beschreibt er?",
        answerA = "Bloom nennt es 'Einflussangst' und beschreibt sechs 'Misslesungen' (misreadings): Clinamen, Tessera, Kenosis, Daemonization, Askesis, Apophrades",
        answerB = "Bloom nennt es 'Intertextualität' und beschreibt sechs Verhältnisse: Zitat, Allusionen, Parodie, Travestie, Pastiche, Transposition",
        answerC = "Bloom nennt es 'Oedipal anxiety' und beschreibt sechs Stadien der literarischen Emanzipation vom Vorläufer",
        answerD = "Bloom nennt es 'Epochenangst' und beschreibt sechs historische Phasen der englischen Romantik",
        correctAnswer = 0,
        explanation = "Bloom beschreibt, wie starke Dichter ihre Vorläufer durch sechs Formen der produktiven Fehlektüre (misreading) überwältigen müssen: Clinamen (Abweichung), Tessera (Ergänzung), Kenosis (Entleerung), Daemonization (Gegentranszendenz), Askesis (Selbstbeschränkung), Apophrades (Rückkehr der Toten).",
        difficulty = 5,
        funFact = "Blooms Theorie ist selbst eine Art Freud'sche Mythologie der Literaturgeschichte: Der junge Poet tötet symbolisch den väterlichen Vorläufer. Bloom entlehnt die Terminologie der Kabbala und der gnostischen Tradition."
    ),

    // Question 30 — Wayne Booth: Der implizite Autor
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welchen Begriff prägte Wayne Booth in 'The Rhetoric of Fiction' (1961), um die normative Instanz im Text zu bezeichnen, die weder mit dem realen Autor noch mit dem Erzähler identisch ist?",
        answerA = "Narrativer Fokalisator",
        answerB = "Impliziter Autor (implied author)",
        answerC = "Textueller Sprecher",
        answerD = "Autoriale Stimme",
        correctAnswer = 1,
        explanation = "Booths 'implied author' ist das Bild des Autors, das der Text selbst konstruiert — die normativen Werte und ästhetischen Entscheidungen, die hinter dem Text spürbar sind. Er unterscheidet sich vom realen Autor und vom Erzähler.",
        difficulty = 5,
        funFact = "Booth entwickelte auch den Begriff des 'unzuverlässigen Erzählers' (unreliable narrator): Ein Erzähler ist unzuverlässig, wenn seine Wertungen und Darstellungen von den Normen des impliziten Autors abweichen — ein zentrales Konzept der modernen Erzähltheorie."
    ),

    // Question 31 — Lukács: Der Roman als Epos der bürgerlichen Epoche
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Wie charakterisiert Georg Lukács in 'Die Theorie des Romans' (1916) den Roman im Verhältnis zum antiken Epos?",
        answerA = "Der Roman ist die Weiterentwicklung des Epos durch die Einführung psychologischer Tiefe",
        answerB = "Der Roman ersetzt das Epos als kollektive Erzählform durch eine individualisierte Perspektive",
        answerC = "Das Epos entstammt einer 'heilen', transzendental geordneten Welt; der Roman ist die Kunstform einer transzendental obdachlosen Epoche, in der das Individuum die verlorene Totalität vergebens sucht",
        answerD = "Der Roman perfektioniert das Epos durch die Möglichkeit der Innenschau und psychologischen Analyse",
        correctAnswer = 2,
        explanation = "Lukács formuliert seine Romantheorie als Theorie der 'transzendentalen Obdachlosigkeit': Das Epos gehört einer geschlossenen, sinnerfüllten Welt an; der Roman ist die Kunstform der Moderne, in der das Individuum nach einem verlorenen Sinn sucht.",
        difficulty = 5,
        funFact = "Lukács' Romantheorie wurde von Walter Benjamin, Theodor W. Adorno und Fredric Jameson intensiv rezipiert. Adorno entwickelt in 'Standort des Erzählers im zeitgenössischen Roman' (1954) diese Gedanken weiter."
    ),

    // Question 32 — Benjamin: Erzähler und Erfahrung
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Was diagnostiziert Walter Benjamin in seinem Essay 'Der Erzähler' (1936) als Ursache für den Verfall der Erzählkunst in der Moderne?",
        answerA = "Die Verdrängung mündlicher Erzähltraditionen durch Alphabetisierung und Schriftkultur",
        answerB = "Die Kommerzialisierung der Literatur durch den Buchmarkt und das Verlagswesen",
        answerC = "Die Beschleunigung der Zeit durch industriellen Kapitalismus, die keine langfristige Erfahrungssedimentierung mehr erlaubt",
        answerD = "Den Niedergang der mitteilbaren Erfahrung (Erfahrung vs. Erlebnis) durch Weltkriegstrauma und Information als neue Kommunikationsform",
        correctAnswer = 3,
        explanation = "Benjamin unterscheidet 'Erfahrung' (sedimentiertes, mitteilbares Wissen, das im Erzählen tradiert wird) von 'Erlebnis' (isoliertes, schockartiges Einzelereignis). Der Weltkrieg zerstört die Möglichkeit mitteilbarer Erfahrung; die Zeitung liefert nur noch erklärte Informationen ohne Erzählwürde.",
        difficulty = 5,
        funFact = "Benjamin illustriert seine Theorie an Nikolai Leskow: Er unterscheidet zwei archaische Erzählertypen — den sesshaften Handwerker, der Lokalwissen tradiert, und den reisenden Kaufmann, der Fernwissen mitbringt. Beide sterben in der Moderne aus."
    ),

    // Question 33 — Adorno: Lyrik und Gesellschaft
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welche paradoxe These vertritt Theodor W. Adorno in seinem Essay 'Rede über Lyrik und Gesellschaft' (1957) bezüglich des Verhältnisses von Lyrik und Gesellschaft?",
        answerA = "Gerade durch ihre äußerste Subjektivität und den Rückzug aus der Gesellschaft ist Lyrik zutiefst gesellschaftlich — ihre Abkehr ist eine implizite Kritik an der gesellschaftlichen Realität",
        answerB = "Lyrik muss politisch engagiert sein, um gesellschaftliche Relevanz zu besitzen",
        answerC = "Lyrik ist die einzige Kunstform, die gesellschaftliche Verhältnisse direkt abbilden kann",
        answerD = "Gesellschaftliche Erfahrungen lassen sich in der Lyrik nur durch realistische Darstellung verarbeiten",
        correctAnswer = 0,
        explanation = "Adorno argumentiert: Lyrik, die in ihrer Subjektivität am reinsten ist, ist gerade deshalb gesellschaftlich vermittelt. Die Sprache der Lyrik trägt das kollektive Substrat der Gesellschaft in sich; durch Negation der gesellschaftlichen Entfremdung protestiert sie indirekt gegen diese.",
        difficulty = 5,
        funFact = "Adorno formuliert in diesem Kontext auch das berühmte Diktum, das er später selbst einschränkte: 'Nach Auschwitz ein Gedicht zu schreiben, ist barbarisch.' Diese Aussage wurde aus dem Aufsatz 'Kulturkritik und Gesellschaft' (1951) entnommen."
    ),

    // Question 34 — Paul de Man: Dekonstruktion und Rhetorik
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Was versteht Paul de Man unter dem Begriff 'Allegorie des Lesens' und welche Konsequenz zieht er daraus für die Literaturtheorie?",
        answerA = "Dass allegorische Texte historisch frühere Bedeutungsschichten durch spätere ersetzen und dabei die Präsenz des Originals simulieren",
        answerB = "Dass jeder Lesevorgang eine Allegorie seiner eigenen Unmöglichkeit ist — literarische Texte thematisieren permanent die Aporien und Unentscheidbarkeiten des Bedeutens",
        answerC = "Dass Allegorie die einzige Trope ist, die historische Prozesse adäquat darstellen kann",
        answerD = "Dass das Lesen selbst eine performative Handlung ist, die den Text als Allegorie gesellschaftlicher Verhältnisse konstituiert",
        correctAnswer = 1,
        explanation = "De Man zeigt in 'Allegories of Reading' (1979), dass literarische Texte ihre eigene Unlesbarkeit thematisieren: Sie inszenieren die Spannung zwischen rhetorischem Versprechen und grammatischer Aussage, die keine eindeutige Entscheidung ermöglicht.",
        difficulty = 5,
        funFact = "De Mans bekanntestes Beispiel ist Prousts 'Recherche': Der Text behauptet die Überlegenheit der metaphorischen (synoptischen) gegenüber der metonymischen Kontiguität, vollzieht aber selbst metonymische Strukturen — er sagt das Gegenteil von dem, was er demonstriert."
    ),

    // Question 35 — Fredric Jameson: Politisches Unbewusstes
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welches Interpretationsprinzip entwickelt Fredric Jameson in 'The Political Unconscious' (1981) für die Literaturanalyse?",
        answerA = "Das Prinzip der ideologischen Transparenz: Literatur spiegelt direkt die materiellen Produktionsverhältnisse ihrer Entstehungszeit",
        answerB = "Das Prinzip der ästhetischen Autonomie: Literatur transzendiert ihre historischen Bedingungen durch ästhetische Form",
        answerC = "Das Prinzip der Allegorie: Literatur ist immer zugleich Darstellung des Individuellen und Allegorie kollektiver Geschichte; 'Immer historisieren!' als methodisches Gebot",
        answerD = "Das Prinzip der Polyphonie: Literatur artikuliert das kollektive Bewusstsein einer Klasse durch vielstimmige Diskurse",
        correctAnswer = 2,
        explanation = "Jameson fordert: 'Always historicize!' Literarische Texte tragen ein 'politisches Unbewusstes': Sie sind symptomatische Lösungsversuche für reale gesellschaftliche Widersprüche, die nicht direkt artikuliert werden können. Die Form ist der entscheidende Träger des ideologischen Gehalts.",
        difficulty = 5,
        funFact = "Jameson kombiniert marxistische Dialektik (Lukács, Althusser), strukturalistische Narratologie (Greimas) und Lacans Psychoanalyse zu einer umfassenden Theorie kultureller Produktion. Sein Buch gilt als Hauptwerk des literarischen Marxismus."
    ),

    // Question 36 — Umberto Eco: Offenes Kunstwerk
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welchen Begriff prägte Umberto Eco in 'Opera aperta' (Das offene Kunstwerk, 1962), und wie unterscheidet er verschiedene Grade von Offenheit?",
        answerA = "Der Begriff 'opera aperta' bezeichnet ausschließlich musikalische Werke, die Spielräume für Improvisation lassen",
        answerB = "Eco unterscheidet offene Werke (polyseme Texte) von geschlossenen Werken (eindeutige Botschaften) als qualitatives Werturteil",
        answerC = "Das offene Kunstwerk bezeichnet Texte, die ihren Rezipienten vollständige interpretative Freiheit gewähren, ohne jede Einschränkung",
        answerD = "Eco unterscheidet 'Offenheit ersten Grades' (Unvollendetes) von 'Offenheit zweiten Grades' (absichtlich mehrdeutige Texte, die mehrere Interpretationen als gültig zulassen) und 'opere in movimento' (Werke, die physisch vom Rezipienten vervollständigt werden)",
        correctAnswer = 3,
        explanation = "Eco differenziert: Werke, die physisch unvollendet sind; Werke, die mehrere Bedeutungen zulassen (zweiter Grad); und 'opere in movimento' wie Calder-Mobiles oder Stockhausens Klavierstücke, die der Interpret physisch zusammenstellen muss.",
        difficulty = 5,
        funFact = "Eco schränkt seinen Begriff später (in 'Lector in fabula', 1979) ein: Ein Text ist nicht beliebig offen — er enthält eine 'Modellleser'-Rolle, die bestimmte Interpretationen nahelegt und andere ausschließt. Die Grenze zwischen legitimer Interpretation und Überinterpretation ist ein zentrales Problem seines Spätwerks."
    ),

    // Question 37 — Genette: Transtextualität und ihre fünf Typen
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welche fünf Typen der Transtextualität unterscheidet Gérard Genette in 'Palimpsestes' (1982)?",
        answerA = "Intertextualität, Paratextualität, Metatextualität, Hypertextualität, Architextualität",
        answerB = "Zitat, Allusionen, Parodie, Travestie, Pastiche",
        answerC = "Referenz, Allegorie, Symbol, Metapher, Metonymie",
        answerD = "Imitation, Transformation, Transposition, Übersetzung, Bearbeitung",
        correctAnswer = 0,
        explanation = "Genette unterscheidet: Intertextualität (Zitat/Allusionen), Paratextualität (Titel/Vorwort), Metatextualität (Kommentar über anderen Text), Hypertextualität (Transformation eines Hypotexts) und Architextualität (Gattungszugehörigkeit). 'Palimpsestes' konzentriert sich auf die Hypertextualität.",
        difficulty = 5,
        funFact = "Genettes Unterscheidung ist enger gefasst als Kristevas Intertextualitätsbegriff: Bei Kristeva ist Intertextualität eine allgemeine Textbedingung; bei Genette ist sie eine spezifische Transtextualitätsform neben anderen."
    ),

    // Question 38 — Iser: Wanderstandpunkt des Lesers
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Was versteht Wolfgang Iser unter dem Begriff des 'Wanderstandpunkts' (wandering viewpoint) in seiner phänomenologischen Lesetheorie?",
        answerA = "Die biographische Bewegung des Lesers zwischen verschiedenen Lektüresituationen im Laufe seines Lebens",
        answerB = "Die Bewegung des Lesers durch den Text, bei der er immer nur einen Teil des Textes präsent hat und vergangene Stellen im Gedächtnis behält, während zukünftige Stellen als Erwartung antizipiert werden",
        answerC = "Die Multiperspektivität des Erzählers, der zwischen verschiedenen Figurenperspektiven wechselt",
        answerD = "Den Perspektivwechsel des Lesers, der einen Text aus verschiedenen ideologischen Positionen heraus interpretiert",
        correctAnswer = 1,
        explanation = "Isers Konzept des Wanderstandpunkts beschreibt die zeitliche Dimension des Lesens: Der Leser bewegt sich durch den Text, hat immer nur einen Ausschnitt präsent und konstruiert dabei fortlaufend einen vorläufigen Sinn, den er bei späteren Lektüreabschnitten revidieren muss.",
        difficulty = 5,
        funFact = "Iser lehnt sich dabei an die Phänomenologie Husserls und Ingardens an: Husserls Retentions-Protentions-Struktur des Bewusstseins und Ingardens Begriff der 'Unbestimmtheitsstellen' (indeterminacy spots) sind zentrale Quellen."
    ),

    // Question 39 — Roman Ingarden: Schichten des literarischen Kunstwerks
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welche vier Schichten unterscheidet Roman Ingarden in 'Das literarische Kunstwerk' (1931) beim Aufbau des Werks?",
        answerA = "Inhalt, Form, Stil und Bedeutung",
        answerB = "Oberflächenstruktur, Tiefenstruktur, Kontextstruktur und Diskursstruktur",
        answerC = "Lautgestaltung, Bedeutungseinheiten, dargestellte Gegenständlichkeiten und schematisierte Ansichten",
        answerD = "Lexikalische Schicht, syntaktische Schicht, semantische Schicht und pragmatische Schicht",
        correctAnswer = 2,
        explanation = "Ingarden analysiert das Literaturwerk als vielschichtiges Gebilde: 1. Lautgestaltungsschicht (phonologisch), 2. bedeutungseinheitliche Schicht (Sätze/Bedeutungen), 3. Schicht der dargestellten Gegenständlichkeiten (repräsentierte Gegenstände), 4. schematisierte Ansichten (die Art, wie Gegenstände 'erscheinen').",
        difficulty = 5,
        funFact = "Ingardens Werk ist ein Haupttext der phänomenologischen Literaturtheorie und bildet eine wichtige Quelle für Isers Rezeptionsästhetik. Sein Begriff der 'Unbestimmtheitsstellen' wurde von Iser direkt als 'Leerstellen' übernommen."
    ),

    // Question 40 — Cleanth Brooks: Neue Kritik und Paradoxon
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Was ist nach Cleanth Brooks in 'The Well Wrought Urn' (1947) das zentrale Prinzip des Gedichts, und warum lehnt er paraphrastische Interpretationen ab?",
        answerA = "Das zentrale Prinzip ist die prosodische Harmonie; Paraphrasen verfehlen die musikalische Wirkung der Gedichtsprache",
        answerB = "Das zentrale Prinzip ist die historische Verortung; Paraphrasen enthistorisieren den Text",
        answerC = "Das zentrale Prinzip ist die organische Einheit von Form und Inhalt; Paraphrasen verfehlen die irreduzible Besonderheit der dichterischen Sprache",
        answerD = "Das zentrale Prinzip ist die Paradoxie und Ambiguität; Paraphrasen zerstören diese Spannung, weil sie Bedeutung auf eindeutige Aussagen reduzieren — 'the heresy of paraphrase'",
        correctAnswer = 3,
        explanation = "Brooks formuliert die 'heresy of paraphrase': Wer ein Gedicht paraphrasiert, verfehlt sein Wesen. Das Gedicht lebt von Paradoxien, Ironie und Ambiguität; seine 'Bedeutung' ist untrennbar von seiner sprachlichen Form. Die New Criticism-Methode des 'close reading' ist die angemessene Reaktion darauf.",
        difficulty = 5,
        funFact = "Die 'New Criticism' (Brooks, Wimsatt, Beardsley, Ransom) entwickelte die Konzepte 'intentional fallacy' (Absicht des Autors ist für die Textinterpretation irrelevant) und 'affective fallacy' (emotionale Wirkung auf Leser ist kein Interpretationskriterium) — ähnlich wie Barthes und Iser, aber auf anderen Grundlagen."
    ),

    // Question 41 — Derrida: Grammatologie und archi-écriture
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet Derrida mit dem Begriff 'archi-écriture' (Urschrift) in 'De la grammatologie' (1967)?",
        answerA = "Nicht historisch primäre Schrift im Sinne eines Ursprungs, sondern die Differenzstruktur selbst, die jeder Sprache (gesprochen oder geschrieben) vorausgeht und Bedeutung erst ermöglicht",
        answerB = "Die ältesten bekannten Schriftsysteme der Menschheit als Basis der Kulturentwicklung",
        answerC = "Die metaphysische Idee einer vollständigen, unverstellten Kommunikation, die durch Schrift korrumpiert wird",
        answerD = "Die ursprüngliche Bedeutungsintention des Autors vor der Übersetzung in Sprache",
        correctAnswer = 0,
        explanation = "Derridas 'archi-écriture' ist kein historischer Ursprung, sondern ein quasi-transzendentales Konzept: die Differenzstruktur (Différance), die jeder Sprache vorausliegt. Sie dekonstruiert die Metaphysik der Präsenz, die gesprochene Sprache als unmittelbaren Ausdruck des Geistes privilegiert.",
        difficulty = 5,
        funFact = "Derrida zeigt anhand von Rousseaus 'Essai sur l'origine des langues', dass Rousseau selbst die Schrift als 'gefährliches Supplement' beschreibt, aber unbewusst zeigt, dass die Sprache selbst immer schon supplementär (d.h. archi-écriture-ähnlich) strukturiert ist."
    ),

    // Question 42 — Bhabha: Mimikry und Ambivalenz
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wie funktioniert laut Bhabha das koloniale Mimikry als subversive Kraft, und was macht es für den Kolonisator beunruhigend?",
        answerA = "Mimikry ist eine Form kulturellen Widerstands, bei der Kolonisierte bewusst die Kolonisatoren imitieren, um sie zu verspotten",
        answerB = "Mimikry erzeugt eine Kopie, die 'fast, aber nicht ganz dasselbe' (almost the same but not quite) ist — durch die Differenz in der Ähnlichkeit entsteht eine Bedrohung der Autorität des Originals",
        answerC = "Mimikry ist ein psychologisches Abwehrmechanismus der Kolonisierten gegen die kulturelle Dominanz",
        answerD = "Mimikry beschreibt die hybride Kultur, die durch die Vermischung kolonialer und indigener Elemente entsteht",
        correctAnswer = 1,
        explanation = "Bhabha zeigt: Koloniale Erziehungsprojekte erzeugen 'reformed, recognizable Others' — Kolonisierte, die fast englisch sind. Die Differenz in der Ähnlichkeit ('almost the same but not quite') macht die Kopie beunruhigend: Sie untergräbt die Autorität des Originals durch Imitation.",
        difficulty = 5,
        funFact = "Bhabha entlehnt den Begriff aus dem Camouflage-Konzept der Biologie, das Lacan in 'Les quatre concepts fondamentaux de la psychanalyse' analysiert. Das Ziel der Mimikry ist nicht Verschmelzung mit dem Hintergrund, sondern Tarnung durch partielle Imitation."
    ),

    // Question 43 — Wellek/Warren: Theorie der Literatur
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welche grundlegende Unterscheidung treffen René Wellek und Austin Warren in 'Theory of Literature' (1949) für die Literaturwissenschaft, und wie definieren sie den 'inneren Ansatz' (intrinsic approach)?",
        answerA = "Sie unterscheiden zwischen historischer und systematischer Literaturwissenschaft und definieren den inneren Ansatz als werkimmanente Analyse",
        answerB = "Sie unterscheiden zwischen Literaturkritik und Literaturtheorie und definieren den inneren Ansatz als Anwendung linguistischer Methoden",
        answerC = "Sie unterscheiden 'äußere' (extrinsic) Zugänge (Biographie, Psychologie, Soziologie) von 'inneren' (intrinsic) Zugängen (Analyse von Stil, Metrum, Gattung, Bild, Symbol als Eigenschaften des Textes selbst)",
        answerD = "Sie unterscheiden normative und deskriptive Literaturwissenschaft und definieren den inneren Ansatz als wertungsfreie Beschreibung",
        correctAnswer = 2,
        explanation = "Wellek/Warren systematisieren die Literaturwissenschaft durch die Unterscheidung extrinsischer (externer, kontextueller) und intrinsischer (werkorientierter) Zugänge. Der intrinsic approach analysiert das Werk als relativ autonomes ästhetisches Objekt — ein Vorläufer des New Criticism und des Strukturalismus.",
        difficulty = 5,
        funFact = "Wellek war ein tschechischer Emigrant, der den Prager Strukturalismus (Mukařovský) in die angloamerikanische Literaturwissenschaft transferierte. 'Theory of Literature' wurde zum meistzitierten Einführungswerk der Komparatistik des 20. Jahrhunderts."
    ),

    // Question 44 — Lacans Registerlehre und Literatur
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche drei Register unterscheidet Jacques Lacan (Reales, Symbolisches, Imaginäres), und welche Bedeutung haben sie für die psychoanalytische Literaturtheorie?",
        answerA = "Das Reale = Außenwelt; das Symbolische = Sprache; das Imaginäre = Vorstellungswelt. Literatur spiegelt alle drei Register gleichwertig wider.",
        answerB = "Das Reale = Trieb; das Symbolische = Über-Ich; das Imaginäre = Ich. Literatur hilft bei der Integration dieser Register.",
        answerC = "Das Reale = Primärprozesse; das Symbolische = Sekundärprozesse; das Imaginäre = Träume. Literatur verarbeitet das Reale durch das Symbolische.",
        answerD = "Das Reale = das Unrepräsentierbare jenseits der Sprache; das Symbolische = die Ordnung der Sprache und des Gesetzes; das Imaginäre = spiegelhafte Identifikationen. Literatur operiert im Symbolischen, versucht aber das Reale anzusprechen.",
        correctAnswer = 3,
        explanation = "Lacans drei Register (RSI) sind für die Literaturtheorie grundlegend: Das Symbolische ist die Ordnung der Sprache und des Gesetzes (Ödipus, Kastration); das Imaginäre umfasst Spiegelstadium und narzisstische Identifikation; das Reale ist das, was der Symbolisierung widersteht — das Trauma, das Undarstellbare.",
        difficulty = 5,
        funFact = "Slavoj Žižek hat Lacans Register ausgiebig auf populäre Kultur und Literatur angewandt: Die Hitchcock-Figur des MacGuffin ist z.B. eine Manifestation des Realen — ein Objekt ohne eigene Bedeutung, das aber die gesamte Handlung motiviert."
    ),

    // Question 45 — Mukařovský: Ästhetische Norm und Funktion
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet Jan Mukařovský (Prager Strukturalismus) mit dem Begriff der 'ästhetischen Norm' und welche Rolle spielt die 'Aktualisierung' (foregrounding) für die Poetizität eines Textes?",
        answerA = "Die ästhetische Norm ist das Set gesellschaftlicher Konventionen, gegenüber denen Kunst bewusst abweicht; 'Aktualisierung' (ozvláštnění) bezeichnet die Aufdringlichkeit sprachlicher Mittel, die den Automatismus der Alltagssprache durchbricht",
        answerB = "Die ästhetische Norm ist das Regelwerk einer Gattung; Aktualisierung bezeichnet die zeitgemäße Anpassung klassischer Texte",
        answerC = "Die ästhetische Norm entspricht dem Erwartungshorizont Jauß'; Aktualisierung ist identisch mit ästhetischer Distanz",
        answerD = "Die ästhetische Norm ist die Summe der Qualitätsurteile einer Epoche; Aktualisierung bezeichnet die Kanonisierung eines Textes",
        correctAnswer = 0,
        explanation = "Mukařovský entwickelt im Prager Strukturalismus das Konzept des 'foregrounding' (ozvláštnění, Verfremdung): Poetische Sprache aktualisiert (macht auffällig) ihre eigenen Mittel, indem sie gegen die Norm der automatisierten Alltagssprache verstößt. Dies ist eine Erweiterung von Šklovskijs 'Verfremdung'.",
        difficulty = 5,
        funFact = "Mukařovský unterscheidet auch zwischen dem materiellen Artefakt (Ding), dem ästhetischen Objekt (in der Wahrnehmung konstituiert) und dem ästhetischen Zeichen (semiotische Funktion). Damit antizipiert er Konzepte der späteren Rezeptionsästhetik."
    ),

    // Question 46 — Bachtin: Heteroglossie und Romansprache
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Was versteht Bachtin unter dem Begriff 'Heteroglossie' (Vielstimmigkeit/Raznorechie), und welche Bedeutung hat sie für seine Theorie des Romans?",
        answerA = "Die Verwendung mehrerer Nationalsprachen in einem einzigen Roman",
        answerB = "Die soziale Vielstimmigkeit der Sprache — die Koexistenz verschiedener sozialer Sprachen, Idiome, Berufssprachen und Weltanschauungen innerhalb einer Einzelsprache — die der Roman als Prinzip seiner Konstruktion nutzt",
        answerC = "Die ästhetische Mehrdeutigkeit literarischer Texte, die verschiedene Interpretationen ermöglicht",
        answerD = "Die intertextuellen Stimmen verschiedener literarischer Traditionen, die in einem modernen Roman verarbeitet werden",
        correctAnswer = 1,
        explanation = "Für Bachtin ist Heteroglossie (raznorechie) das zentrale Prinzip des Romans: Im Gegensatz zur Lyrik, die eine einheitliche Sprache anstrebt, ist der Roman ein Ort, an dem verschiedene soziale Sprachen (Klassensprachen, Generationensprachen, Jargons) miteinander in Spannung treten.",
        difficulty = 5,
        funFact = "Bachtin entwickelt den Roman als die Gattung der Moderne par excellence: Weil er Heteroglossie systematisch organisiert, ist er in der Lage, die Komplexität einer gesellschaftlich differenzierten Welt darzustellen — im Gegensatz zu Lyrik und Epos, die eine sprachliche Einheit postulieren."
    ),

    // Question 47 — Gadamer: Hermeneutik und Horizontverschmelzung
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Was beschreibt Hans-Georg Gadamer in 'Wahrheit und Methode' (1960) mit dem Begriff 'Horizontverschmelzung' (Horizontverschmelzung) im Kontext des Textverstehens?",
        answerA = "Die Überwindung des historischen Abstands zwischen Autor und Leser durch philologische Rekonstruktion",
        answerB = "Die Verschmelzung von Autor- und Leserintention zu einer einheitlichen Bedeutung",
        answerC = "Das Verstehen als Prozess, bei dem der historisch begrenzte Horizont des Interpreten und der Horizont des Textes sich produktiv zusammenfinden — ein Prozess, der keinen Ursprungssinn restituiert, sondern einen neuen Sinn erzeugt",
        answerD = "Die methodische Rekonstruktion des ursprünglichen Verständnishorizonts der Zeitgenossen eines Textes",
        correctAnswer = 2,
        explanation = "Gadamers Horizontverschmelzung beschreibt das Verstehen nicht als Rekonstruktion eines vergangenen Sinns, sondern als Ereignis: Der Horizont des Interpreten und der Horizont des Textes verschmelzen zu einem neuen Sinngebilde. Verstehen ist immer ein 'Besserwissen' als das Verstandene.",
        difficulty = 5,
        funFact = "Jauß rezipiert Gadamers Horizontbegriff kritisch: Er übernimmt den 'Erwartungshorizont', betont aber im Gegensatz zu Gadamers konservativem Ansatz die historische Differenz und die produktive Funktion des ästhetischen Erfahrungsbruchs."
    ),

    // Question 48 — Eco: Modellleser und enzyklopädische Kompetenz
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Was versteht Umberto Eco in 'Lector in fabula' (1979) unter dem 'Modellleser' (lettore modello) und welche Bedeutung hat die 'enzyklopädische Kompetenz' dafür?",
        answerA = "Der Modellleser ist der ideale Rezipient, der die vollständige Intention des Autors rekonstruiert; enzyklopädische Kompetenz meint das Kulturwissen einer Elite",
        answerB = "Der Modellleser ist der statistische Durchschnittsleser; enzyklopädische Kompetenz meint Schulbildung",
        answerC = "Der Modellleser ist eine empirische Kategorie zur Beschreibung tatsächlicher Lesergruppen; Enzyklopädie meint das Fachwissen der Literaturkritik",
        answerD = "Der Modellleser ist eine im Text angelegte Rolle — eine Menge von Kompetenzen, die der Text voraussetzt; die 'Enzyklopädie' meint das kulturelle Wissen, das zur Aktualisierung intertextueller Referenzen und Inferenzen nötig ist",
        correctAnswer = 3,
        explanation = "Ecos Modellleser ist keine empirische Person, sondern eine textuelle Strategie: Der Text entwirft eine Leserrolle mit bestimmten enzyklopädischen Kompetenzen (sprachliche, kulturelle, intertextuelle). Nur wer diese Kompetenzen besitzt, kann den Text 'richtig' lesen.",
        difficulty = 5,
        funFact = "Eco unterscheidet Modellleser vom 'empirischen Leser': Letzterer kann frei interpretieren, aber der Text selbst steuert durch seine Struktur, welche Interpretationen 'überinterpretiert' sind. In 'Die Grenzen der Interpretation' (1990) und 'Zwischen Autor und Text' (1992) vertieft er diese Diskussion."
    ),

    // Question 49 — Ricoeur: Mimesis und narrative Identität
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welche drei Stufen der Mimesis unterscheidet Paul Ricoeur in 'Zeit und Erzählung' (1983-85), und was versteht er unter der 'narrativen Identität'?",
        answerA = "Mimesis I (Präfiguration: Vorverständnis menschlicher Handlung), Mimesis II (Konfiguration: narrativer Akt der Komposition), Mimesis III (Refiguration: Aneignung durch den Leser). Narrative Identität: Das Subjekt konstituiert sich durch das Erzählen seiner Geschichte (idem/ipse-Identität).",
        answerB = "Mimesis I (Nachahmung der Wirklichkeit), Mimesis II (ästhetische Transformation), Mimesis III (politische Wirkung). Narrative Identität: die kollektive Identität einer Nation durch ihre Literatur.",
        answerC = "Mimesis I (Autorenintention), Mimesis II (Textstruktur), Mimesis III (Leserreaktion). Narrative Identität: die Wiederholung von Archetypen in verschiedenen Kulturen.",
        answerD = "Mimesis I (Mythos), Mimesis II (Logos), Mimesis III (Ethos). Narrative Identität: die moralische Formung durch Literatur nach aristotelischer Tradition.",
        correctAnswer = 0,
        explanation = "Ricoeurs Dreiheit der Mimesis beschreibt den vollständigen Kreislauf der narrativen Mediation: von der vorerzählerischen Erfahrung (I) über den Erzählakt (II) zur Lektüre (III). Narrative Identität (idem vs. ipse) unterscheidet zwischen unveränderlicher Selbigkeit (idem) und zugesagter Selbstheit (ipse).",
        difficulty = 5,
        funFact = "Ricoeurs Werk ist eine Auseinandersetzung mit Augustinus ('Zeit und Ewigkeit' in den 'Confessiones') und Aristoteles (Mimesis und Muthos in der 'Poetik'). Er zeigt, dass narrative Struktur eine anthropologische Notwendigkeit ist: Menschen verstehen sich als zeitliche Wesen nur durch Erzählung."
    ),

    // Question 50 — Bourdieu: Literarisches Feld und symbolisches Kapital
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Was bezeichnet Pierre Bourdieu in 'Die Regeln der Kunst' (1992) mit dem 'literarischen Feld' und dem Konzept des 'symbolischen Kapitals'?",
        answerA = "Das Feld ist der geographische Raum, in dem Literatur produziert wird; symbolisches Kapital meint den materiellen Wert von Büchern",
        answerB = "Das literarische Feld ist ein autonomer sozialer Raum mit eigenen Regeln und Hierarchien; symbolisches Kapital bezeichnet kulturelles Prestige und Distinktionsgewinn, der nicht direkt in ökonomisches Kapital umgewandelt werden kann, aber die Position im Feld bestimmt",
        answerC = "Das Feld bezeichnet die Gesamtheit aller literarischen Texte einer Epoche; symbolisches Kapital meint die ästhetische Qualität dieser Texte",
        answerD = "Das Feld bezeichnet die Institution der Literaturkritik; symbolisches Kapital ist die Legitimationsmacht der Universitäten über den Literaturkanon",
        correctAnswer = 1,
        explanation = "Bourdieu analysiert das literarische Feld als relativ autonomen sozialen Raum, der eigene Regeln (Prestige statt Gewinn), eigene Hierarchien (Avantgarde vs. Massenmarkt) und eigene Kapitalformen (symbolisches Kapital = kulturelles Ansehen) entwickelt hat. Die Position im Feld bestimmt, was als legitime Literatur gilt.",
        difficulty = 5,
        funFact = "Bourdieu zeigt am Beispiel Flauberts ('L'Éducation sentimentale'), wie der Roman durch seine Struktur das literarische Feld seiner Zeit kartiert. Flaubert schreibt eine Soziologie des literarischen Feldes avant la lettre — und ermöglicht damit Bourdieus soziologische Methode."
    )

)
