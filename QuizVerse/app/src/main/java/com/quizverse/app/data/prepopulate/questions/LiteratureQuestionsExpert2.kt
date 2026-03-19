package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun literatureQuestionsExpert2(): List<Question> = listOf(

    // Question 1 — Intertextualität: Kristeva
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wer prägte 1967 den Begriff 'Intertextualität' und definierte jeden Text als 'Mosaik von Zitaten'?",
        answerA = "Julia Kristeva",
        answerB = "Roland Barthes",
        answerC = "Michail Bachtin",
        answerD = "Gerard Genette",
        correctAnswer = 0,
        explanation = "Julia Kristeva führte den Begriff 'Intertextualität' 1967 in ihrem Aufsatz 'Bachtin, das Wort, der Dialog und der Roman' ein. Sie baute auf Bachtins Dialogizität auf, weitete sie aber radikal aus: Nicht Subjekte, sondern Texte treten miteinander in Dialog. Ihr Diktum lautet: 'Jeder Text baut sich als Mosaik von Zitaten auf, jeder Text ist Absorption und Transformation eines anderen Textes.'",
        difficulty = 4,
        funFact = "Kristeva war es auch, die den Begriff 'Sémanalyse' prägte und die Semiotik mit der Psychoanalyse verband. Sie war Schülerin von Roland Barthes und Mitglied der Pariser Gruppe 'Tel Quel'."
    ),

    // Question 2 — Bachtin: Dialogizität vs. Intertextualität
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Was beschreibt Michail Bachtins Konzept der 'Dialogizität' in der Literatur?",
        answerA = "Die wörtliche Wiedergabe von Gesprächen in Romanen",
        answerB = "Die grundsätzliche Mehrsprachigkeit und gegenseitige Bezogenheit aller sprachlichen Äußerungen aufeinander",
        answerC = "Die Technik des inneren Monologs in der modernen Prosa",
        answerD = "Das dramatische Wechselgespräch zwischen zwei Erzählperspektiven",
        correctAnswer = 1,
        explanation = "Bachtin beschreibt mit Dialogizität, dass kein Wort isoliert existiert — jede Äußerung steht in Bezug zu Sprecher, Adressat und Kontext. Sprache ist grundsätzlich dialogisch strukturiert. Der Roman ist für Bachtin die dialogischste aller Gattungen, weil er heterogene Stimmen und Diskurse vereint (Polyphonie/Vielstimmigkeit).",
        difficulty = 4,
        funFact = "Bachtin entwickelte sein Konzept maßgeblich anhand von Dostojewskis Romanen, die er als 'polyphon' bezeichnete — im Gegensatz zu den 'monologischen' Romanen Tolstois, wo die Autorenstimme dominiert."
    ),

    // Question 3 — Komparatistik: Genetischer vs. typologischer Vergleich
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welche zwei Grundtypen des Vergleichs unterscheidet die Komparatistik methodisch voneinander?",
        answerA = "Synchronen und diachronen Vergleich",
        answerB = "Textuellen und kontextuellen Vergleich",
        answerC = "Genetischen Vergleich (direkte Einflüsse) und typologischen Vergleich (strukturelle Ähnlichkeiten ohne Kontakt)",
        answerD = "Nationalen und transnationalen Vergleich",
        correctAnswer = 2,
        explanation = "Der genetische Vergleich untersucht kausale Beziehungen: Hat Autor A Autor B direkt beeinflusst? Der typologische Vergleich hingegen erklärt strukturelle Ähnlichkeiten zwischen Literaturen, die keinen historischen Kontakt hatten, durch analoge Entwicklungsbedingungen oder universelle Muster. Diese Unterscheidung geht auf die französische Schule der Komparatistik (Baldensperger, Van Tieghem) zurück.",
        difficulty = 4,
        funFact = "Die amerikanische Schule der Komparatistik (René Wellek) kritisierte die Überbetonung des genetischen Vergleichs als zu positivistisch und plädierte für den ästhetischen Vergleich unabhängig von historischen Einflüssen."
    ),

    // Question 4 — Goethe: Weltliteratur-Begriff
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr und in welchem Medium prägte Goethe erstmals den Begriff 'Weltliteratur'?",
        answerA = "1808 im Vorwort zu 'Faust I'",
        answerB = "1790 in den 'Venezianischen Epigrammen'",
        answerC = "1819 im 'West-östlichen Divan'",
        answerD = "1827 in seiner Zeitschrift 'Über Kunst und Altertum'",
        correctAnswer = 3,
        explanation = "Goethe prägte den Begriff 'Weltliteratur' ab 1827 in seiner Zeitschrift 'Über Kunst und Altertum'. Er verstand darunter einen dynamischen Prozess des gleichberechtigten internationalen literarischen Austauschs — nicht eine feste Kanon-Liste, sondern die Idee der wechselseitigen Beeinflussung und des geistigen Dialogs zwischen Nationalliteraturen.",
        difficulty = 4,
        funFact = "Goethes Weltliteratur-Begriff entstand im Kontext seiner Lektüre chinesischer und persischer Dichtung sowie seiner Begegnungen mit Carlyle und Manzoni. Er sah sich selbst als Mittler zwischen den Kulturen."
    ),

    // Question 5 — Monomythos: Campbell
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welchen Begriff verwendete Joseph Campbell für das universelle Grundmuster der Heldenreise, das er in Mythen aller Kulturen identifizierte?",
        answerA = "Monomythos",
        answerB = "Archetypus",
        answerC = "Urmotiv",
        answerD = "Protomythos",
        correctAnswer = 0,
        explanation = "Campbell nannte das universelle Grundmuster der Heldenreise 'Monomythos' — ein Begriff, den er von James Joyce' 'Finnegans Wake' übernahm. Der Monomythos beschreibt die dreiteilige Struktur: Aufbruch, Initiation und Rückkehr. Campbell wurde stark von C.G. Jungs Archetypen-Theorie beeinflusst.",
        difficulty = 4,
        funFact = "George Lucas adaptierte Campbells Heldenreise explizit für 'Star Wars'. Der Film gilt als Paradebeispiel des Monomythos in der modernen Popkultur: Luke Skywalker durchläuft alle klassischen Phasen vom 'Ruf des Abenteuers' bis zur 'Rückkehr mit dem Elixier'."
    ),

    // Question 6 — Jung: Archetypen
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welches Konzept Carl Gustav Jungs bezeichnet universelle, kulturübergreifende Urbilder im kollektiven Unbewussten, die in Literatur und Mythos wiederkehren?",
        answerA = "Komplexe",
        answerB = "Archetypen",
        answerC = "Symbole",
        answerD = "Animus und Anima",
        correctAnswer = 1,
        explanation = "Jungs Archetypen sind universelle, angeborene Strukturen im kollektiven Unbewussten — wiederkehrende Urbilder wie die Große Mutter, der Weise Alte, der Schatten oder der Held. In der Literaturwissenschaft (Northrop Frye, Marie-Louise von Franz) wurden Archetypen als Schlüssel zur Analyse mythischer und literarischer Muster genutzt.",
        difficulty = 4,
        funFact = "Northrop Frye systematisierte die archetypische Literaturkritik in 'Anatomy of Criticism' (1957). Er unterschied vier mythische Muster: Komödie (Frühling), Romanze (Sommer), Tragödie (Herbst) und Satire (Winter)."
    ),

    // Question 7 — Magischer Realismus: Begriff-Ursprung
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Wer formulierte das Manifest des 'Wunderbar-Wirklichen Amerikas' und legte damit einen konzeptuellen Grundstein für den Magischen Realismus?",
        answerA = "Gabriel García Márquez",
        answerB = "Jorge Luis Borges",
        answerC = "Alejo Carpentier",
        answerD = "Miguel Ángel Asturias",
        correctAnswer = 2,
        explanation = "Der kubanische Autor Alejo Carpentier formulierte 1949 im Vorwort zu seinem Roman 'El reino de este mundo' das Konzept des 'lo real maravilloso' (Wunderbar-Wirkliches). Er wollte eine spezifisch lateinamerikanische Literaturrichtung begründen, die das Übernatürliche als Teil der lateinamerikanischen Realität begreift — im Gegensatz zum europäischen Surrealismus.",
        difficulty = 4,
        funFact = "Carpentier, Asturias und Uslar Pietri lernten sich in Pariser Literaturzirkeln der 1920er Jahre kennen und waren alle vom Surrealismus beeinflusst, bevor sie ihre eigene lateinamerikanische Ästhetik entwickelten."
    ),

    // Question 8 — Magischer Realismus: García Márquez
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welcher Roman von Gabriel García Márquez gilt als das Hauptwerk des Magischen Realismus und erzählt die Geschichte der Familie Buendía über sieben Generationen?",
        answerA = "Hundert Jahre Einsamkeit",
        answerB = "Die Liebe in den Zeiten der Cholera",
        answerC = "Der Herbst des Patriarchen",
        answerD = "Chronik eines angekündigten Todes",
        correctAnswer = 0,
        explanation = "'Hundert Jahre Einsamkeit' (1967) gilt als das zentrale Werk des lateinamerikanischen Magischen Realismus. García Márquez erzählt die Geschichte der Stadt Macondo und der Familie Buendía, in der das Übernatürliche — fliegende Teppiche, Schlaflosigkeit-Epidemien, aufsteigende Frauen — als selbstverständlicher Teil der Realität erscheint.",
        difficulty = 4,
        funFact = "Der Roman soll García Márquez so überwältigend überflutet haben, dass er beim Schreiben des ersten Satzes wusste, wie das gesamte Buch enden würde. Er brauchte 18 Monate und verschuldete seine Familie dabei."
    ),

    // Question 9 — Borges als Vorläufer
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche literarische Technik Jorge Luis Borges' legte maßgeblich den Grundstein für den Magischen Realismus der späteren lateinamerikanischen Boom-Generation?",
        answerA = "Sein Einsatz von autobiografischen Elementen",
        answerB = "Seine sozialkritische Darstellung argentinischer Slums",
        answerC = "Seine Verwendung des Gaucho-Mythos",
        answerD = "Die Verschmelzung des Fantastischen mit dem Realen durch reiche Intertextualität und metaphysische Erkundungen",
        correctAnswer = 3,
        explanation = "Borges legte durch die Verschmelzung des Fantastischen und des Realen, narrative Innovationen, metaphysische Erkundungen und reiche Intertextualität den Grundstein für den Magischen Realismus. Seine Ficciones (1944) und El Aleph (1949) zeigen labyrinthische Welten, in denen Bibliotheken das Universum sind und Spiegel andere Dimensionen öffnen.",
        difficulty = 4,
        funFact = "Borges wurde von europäischen Surrealisten wie Kafka beeinflusst, den er selbst ins Spanische übersetzte. Er bezeichnete Kafka als seinen 'Meister' und erfand gar das Adjektiv 'kafkaesk' als Synonym für absurd-bürokratische Systeme."
    ),

    // Question 10 — Intertextualität: Genette
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welches Konzept entwickelte Gérard Genette als Oberbegriff für alle Beziehungsformen zwischen Texten, das fünf Typen unterscheidet?",
        answerA = "Intertextualität",
        answerB = "Transtextualität",
        answerC = "Hypertextualität",
        answerD = "Architextualität",
        correctAnswer = 1,
        explanation = "Genette entwickelte in 'Palimpsestes' (1982) den Begriff 'Transtextualität' als Oberbegriff und unterschied fünf Untertypen: Intertextualität (direkte Zitate/Anspielungen), Paratextualität (Titel, Vorwort), Metatextualität (Kommentar über Texte), Hypertextualität (Transformation eines Prätexts) und Architextualität (Gattungsbezug).",
        difficulty = 4,
        funFact = "Der Begriff 'Hypertextualität' bei Genette hat nichts mit dem Internet zu tun — er bezeichnet die Beziehung zwischen einem 'Hypertext' (z.B. Joyces Ulysses) und seinem 'Hypotext' (Homers Odyssee), wobei der Hypertext den Hypotext transformiert."
    ),

    // Question 11 — Ulysses und Odyssee
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welches antike Epos diente James Joyce als strukturelle Vorlage für seinen Roman 'Ulysses' (1922)?",
        answerA = "Vergils Aeneis",
        answerB = "Dantes Göttliche Komödie",
        answerC = "Homers Odyssee",
        answerD = "Ovids Metamorphosen",
        correctAnswer = 2,
        explanation = "Joyce strukturierte 'Ulysses' als parallele Übertragung von Homers 'Odyssee' auf einen einzigen Tag (16. Juni 1904) in Dublin. Leopold Bloom entspricht Odysseus, Stephen Dedalus dem Telemach und Molly Bloom der Penelope. Jedes der 18 Kapitel entspricht einer Episode der Odyssee.",
        difficulty = 4,
        funFact = "Der 16. Juni, der Tag des 'Ulysses', wird heute als 'Bloomsday' weltweit gefeiert. In Dublin lesen Menschen die entsprechenden Passagen an den Originalschauplätzen vor. Joyce selbst nannte die Verwendung der Odyssee seinen 'Zauberstab', um den modernen Alltag in mythische Dimensionen zu heben."
    ),

    // Question 12 — Dante: Sprachschöpfung
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welche historische Leistung Dantes Alighieri gilt — neben der 'Göttlichen Komödie' — als sein bedeutendster kultureller Beitrag für Italien?",
        answerA = "Die Grundlegung der modernen italienischen Standardsprache durch die Verwendung des Toskanischen",
        answerB = "Die Einführung des Sonetts als literarische Form",
        answerC = "Die Übertragung griechischer Philosophie ins Lateinische",
        answerD = "Die Schaffung des ersten italienischen Prosaromans",
        correctAnswer = 0,
        explanation = "Dante schuf durch die 'Göttliche Komödie' die Grundlage der modernen italienischen Standardsprache. Er verwendete bewusst seinen Florentinischen Dialekt statt Latein, was seinen toskanischen Dialekt zur literarischen Norm Italiens machte. Für Italien gilt er damit als das, was Luther für die deutsche Sprache war.",
        difficulty = 4,
        funFact = "Dante begründete seine Sprachwahl in 'De vulgari eloquentia' (Über das Volksidiom) theoretisch: Er argumentierte, dass die Volkssprache (volgare) der Latinität ebenbürtig sei. Paradoxerweise schrieb er diesen Traktat auf Lateinisch."
    ),

    // Question 13 — Dante: Einfluss auf Weltliteratur
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche Autoren wurden nachweislich von Dantes 'Göttlicher Komödie' beeinflusst, wie die Komparatistik belegt?",
        answerA = "Nur Petrarca und Boccaccio als direkte Zeitgenossen",
        answerB = "Nur Autoren der italienischen Renaissance",
        answerC = "Primär Cervantes und Rabelais",
        answerD = "Geoffrey Chaucer, John Milton und T.S. Eliot sowie indirekt Shakespeare, Goethe und Joyce",
        correctAnswer = 3,
        explanation = "Die komparatistische Forschung belegt Dantes Einfluss auf eine immense Bandbreite von Autoren: Chaucer (Canterbury Tales), Milton (Paradise Lost), Eliot (The Waste Land mit expliziten Dante-Zitaten). Eliot nannte Dante und Shakespeare die zwei größten Dichter der abendländischen Tradition. Auch Goethes Faust-Konzeption trägt Spuren der Commedia.",
        difficulty = 4,
        funFact = "T.S. Eliots 'The Waste Land' (1922) ist durchzogen von Dante-Zitaten. Die berühmten ersten Zeilen 'I had not thought death had undone so many' sind eine direkte Anspielung auf Inferno III. Eliot sagte, man könne Dante und Shakespeare nicht vergleichen — sie seien die einzigen Autoren, die man ein Leben lang studieren müsse."
    ),

    // Question 14 — Cervantes und der moderne Roman
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Warum gilt Miguel de Cervantes' 'Don Quijote' (1605/1615) in der Komparatistik oft als 'erster moderner Roman'?",
        answerA = "Weil er der erste Roman in Prosaform war",
        answerB = "Weil er Fiktion und Wirklichkeit bewusst reflektiert, Gattungskonventionen parodiert und sich selbst als Konstruktion thematisiert",
        answerC = "Weil er der erste Roman mit einem bürgerlichen Protagonisten war",
        answerD = "Weil er als erstes Werk überhaupt in eine andere Sprache übersetzt wurde",
        correctAnswer = 1,
        explanation = "Der 'Don Quijote' gilt als 'erster moderner Roman', weil Cervantes Fiktion und Wirklichkeit bewusst ineinanderspiegelt: Don Quijote liest Ritterromane und verwechselt Fiktion mit Realität. Im zweiten Teil (1615) kennen Figuren sogar den ersten Teil des Romans — eine frühe Form der Metafiktion. Dieses Verfahren der Selbstreflexivität macht ihn zu einem Vorläufer des modernen Erzählens.",
        difficulty = 4,
        funFact = "Im zweiten Teil des Don Quijote trifft der Protagonist auf Personen, die ihn aus dem ersten Band kennen. Cervantes verarbeitete darin auch einen 1614 erschienenen gefälschten zweiten Teil eines anderen Autors — ein einzigartiger intertextueller Selbstbezug in der Literaturgeschichte."
    ),

    // Question 15 — Faust-Stoff: Adaption
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Auf welcher Grundlage basiert Goethes 'Faust', und welcher Autor schrieb die erste bekannte dramatische Verarbeitung dieses Stoffes?",
        answerA = "Auf alten deutschen Volkssagen; Christopher Marlowe schrieb 1592 'Doctor Faustus' als erste bekannte dramatische Verarbeitung",
        answerB = "Auf einem antiken griechischen Mythos; Sophokles schrieb die Vorlage",
        answerC = "Auf einer mittelalterlichen Legende aus Frankreich; Molière verarbeitete sie zuerst dramatisch",
        answerD = "Auf einer historischen Figur des 16. Jahrhunderts; Shakespeare schrieb die erste Dramatisierung",
        correctAnswer = 0,
        explanation = "Der Faust-Stoff basiert auf alten deutschen Volkssagen rund um eine historische Figur (Georg Faust, ca. 1480–1540). Christopher Marlowe verarbeitete den Stoff 1592 in 'The Tragical History of Doctor Faustus' als erstes bekanntes Drama. Bereits 1896 und 1897 gab es Stummfilm-Versuche. Goethes Version ist die bekannteste, aber keineswegs die erste.",
        difficulty = 4,
        funFact = "Während Marlowes Faust verdammt wird, weil er seine Seele zu welt­lichem Wissen verkauft, rettet Goethe seinen Faust durch 'stetes Streben' — ein markanter Unterschied, der den protestantisch-bürgerlichen Wertewandel zwischen dem 16. und 19. Jahrhundert spiegelt."
    ),

    // Question 16 — Hamlet: Quelle und Adaption
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welcher dänische Chronist lieferte Shakespeare die historische Vorlage für 'Hamlet', und in welchem Werk?",
        answerA = "Adam von Bremen in 'Gesta Hammaburgensis Ecclesiae'",
        answerB = "Snorri Sturluson in der 'Edda'",
        answerC = "Saxo Grammaticus in der 'Gesta Danorum' (ca. 1200)",
        answerD = "Olaus Magnus in der 'Historia de Gentibus Septentrionalibus'",
        correctAnswer = 2,
        explanation = "Die Geschichte des Hamlet findet sich in der 'Gesta Danorum' des dänischen Chronisten Saxo Grammaticus (ca. 1200), wo der Prinz 'Amleth' heißt. Diese Überlieferung gelangte über François de Belleforests 'Histoires tragiques' (1570) zu Shakespeare. Heiner Müllers 'Hamletmaschine' (1977) zeigt, wie der Stoff im 20. Jahrhundert weiter dekonstruiert wurde.",
        difficulty = 4,
        funFact = "Shakespeares Hamlet selbst verweist auf seine eigene Theaterhaftigkeit: 'All the world's a stage' und die Theatergruppe im Stück, die Hamlets Plan inszeniert, machen es zu einem frühen Metatheater. Heiner Müller radikalisierte dies: In der 'Hamletmaschine' verweigert der Protagonist am Ende sogar seine eigene Identität als Hamlet."
    ),

    // Question 17 — Weltliteratur-Kanon: Kritik
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche postkoloniale Kritik richtet sich gegen den traditionellen Weltliteratur-Kanon, wie er von Goethe bis Harold Bloom definiert wurde?",
        answerA = "Er enthält zu viele nicht-europäische Texte",
        answerB = "Er vernachlässigt technische Schriften und Sachbücher",
        answerC = "Er überschätzt die Bedeutung der Antike gegenüber der Moderne",
        answerD = "Er reproduziert eurozentrische Machtstrukturen und marginalisiert Literaturen aus dem Globalen Süden, Frauen und nicht-westliche Traditionen",
        correctAnswer = 3,
        explanation = "Postkoloniale Theoretiker wie Gayatri Chakravorty Spivak, Homi Bhabha und Pascale Casanova kritisieren den klassischen Weltliteratur-Kanon als eurozentrisch: Er spiegelt Machtstrukturen des Kolonialismus wider, privilegiert westeuropäische Männerliteratur und schließt systematisch Literaturen aus Asien, Afrika, Lateinamerika sowie Frauenliteratur aus.",
        difficulty = 4,
        funFact = "Pascale Casanova beschrieb in 'La République mondiale des Lettres' (1999) die Weltliteratur als literarisches Kräftefeld mit Paris als langem Zentrum. Die 'Konsekration' eines Autors — also seine internationale Anerkennung — laufe oft über Übersetzungen ins Französische."
    ),

    // Question 18 — Motivgeschichte: Wanderer
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Das Wandermotiv ist ein zentrales Motiv der deutschen Romantik. Welches Werk gilt als sein frühromantisches Schlüsselwerk?",
        answerA = "Heinrich von Ofterdingens 'Blaue Blume' von Novalis",
        answerB = "Ludwig Tiecks 'Franz Sternbalds Wanderungen' (1798)",
        answerC = "Brentanos 'Des Knaben Wunderhorn'",
        answerD = "Hölderlins 'Hyperion'",
        correctAnswer = 1,
        explanation = "Ludwig Tiecks 'Franz Sternbalds Wanderungen' (1798) gilt als wichtiges Dokument des Wandermotivs in der deutschen Frühromantik. Der Protagonist, ein junger Maler, wandert durch Europa auf der Suche nach künstlerischer Vollendung. Eichendorffs 'Aus dem Leben eines Taugenichts' ist das Schlüsselwerk der Hochromantik für dieses Motiv.",
        difficulty = 4,
        funFact = "Das romantische Wandermotiv geht auf eine tiefere Sehnsucht zurück: die 'Blaue Blume' als Symbol des Unerreichbaren. Novalis prägte dieses Symbol in 'Heinrich von Ofterdingen', aber es war Tieck, der das physische Wandern als Ausdruck dieser Sehnsucht literarisch inszenierte."
    ),

    // Question 19 — Stoff vs. Motiv
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wie unterscheidet die Komparatistik 'Stoff' von 'Motiv' in der Stoff- und Motivgeschichte?",
        answerA = "Stoff ist das konkrete unbearbeitete Rohmaterial (Figuren, Handlung, Raum, Zeit), Motiv ist eine abstrakte, typische Konfliktsituation, die ein Thema verdeutlicht",
        answerB = "Stoff bezeichnet die sprachliche Form, Motiv den Inhalt eines Werkes",
        answerC = "Stoff ist der historische Ursprung, Motiv die literarische Umsetzung",
        answerD = "Beide Begriffe sind in der modernen Komparatistik synonym",
        correctAnswer = 0,
        explanation = "In der Stoff- und Motivgeschichte ist der Stoff das unbearbeitete Rohmaterial (z.B. 'die Nibelungengeschichte' mit konkreten Figuren und Ereignissen), während das Motiv eine abstrakte, typische Konfliktsituation darstellt (z.B. 'Eifersucht', 'Verrat', 'Heimkehr des Helden'). Motive können in vielen Stoffen auftauchen und sind kulturübergreifend wanderungsfähig.",
        difficulty = 4,
        funFact = "Das 'Wandermotiv' hat eine doppelte Bedeutung: einerseits das inhaltliche Motiv des Reisens/Wanderns in der Literatur, andererseits beschreibt die Komparatistik mit 'Motivwanderung', wie ein Motiv von Kultur zu Kultur weitergegeben und umgedeutet wird."
    ),

    // Question 20 — Einflussforschung: Harold Bloom
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welches Konzept entwickelte Harold Bloom in 'The Anxiety of Influence' (1973) zur Beschreibung des Verhältnisses junger Dichter zu ihren Vorläufern?",
        answerA = "Die kreative Synthese",
        answerB = "Die intertextuelle Absorption",
        answerC = "Die 'Einflussangst' — das ödipale Verhältnis, in dem der junge Dichter den Vorgänger verdrängen muss, um seine eigene Stimme zu finden",
        answerD = "Die poetische Tradition",
        correctAnswer = 2,
        explanation = "Bloom beschreibt in 'The Anxiety of Influence' das Verhältnis zwischen Dichtern als quasi-ödipalen Kampf: Der junge Dichter ('Epigone') muss seinen starken Vorgänger ('Vorläufer') durch bewusste Fehllektüre ('misreading') und kreative Verdrehung überwinden, um eine eigene Stimme zu entwickeln. Bloom nennt verschiedene 'revisionary ratios' wie Clinamen, Tessera und Kenosis.",
        difficulty = 4,
        funFact = "Bloom illustrierte seine These am Verhältnis Miltons zu Shakespeare und Wordsworths zu Milton. Ironischerweise wurde Blooms eigene Theorie zum Gegenstand derselben 'Einflussangst': Poststrukturalisten und feministische Kritikerinnen wie Sandra Gilbert und Susan Gubar dekonstruierten Blooms ausschließlich männlichen Dichtungsbegriff."
    ),

    // Question 21 — Polyphonie: Dostojewski
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welchen russischen Romanautor bezeichnete Michail Bachtin als Schöpfer des 'polyphonen Romans', und was zeichnet diese Romanform aus?",
        answerA = "Leo Tolstoi, wegen seiner breiten Figurengalerie",
        answerB = "Ivan Turgenev, wegen seiner dialogreichen Erzählweise",
        answerC = "Nikolai Gogol, wegen seiner grotesken Vielstimmigkeit",
        answerD = "Fjodor Dostojewski, weil jede Figur eine eigenständige Stimme mit gleichem Gewicht hat — ohne dass die Erzählerstimme dominiert",
        correctAnswer = 3,
        explanation = "Bachtin analysierte in 'Probleme der Poetik Dostojewskis' (1929), dass Dostojewskis Romane 'polyphon' sind: Die Figuren — Raskolnikow, die Brüder Karamasow — sprechen mit eigenständigen, gleichwertigen Stimmen. Der Erzähler dominiert nicht. Im Gegensatz dazu sei Tolstois Prosa 'monologisch', weil die Erzählerstimme die Weltdeutung vorgibt.",
        difficulty = 4,
        funFact = "Bachtin schrieb sein Dostojewski-Buch in den 1920er Jahren unter schwierigen Bedingungen in der Sowjetunion. Das Buch erschien zunächst 1929, wurde aber unter Stalin aus den Bibliotheken entfernt. Die überarbeitete Fassung von 1963 machte Bachtin weltweit berühmt."
    ),

    // Question 22 — Lateinamerikanischer Boom
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welche vier Autoren gelten als Hauptvertreter des 'Lateinamerikanischen Booms' der 1960er/70er Jahre?",
        answerA = "Borges, Neruda, Paz, Cortázar",
        answerB = "García Márquez, Cortázar, Vargas Llosa und Carlos Fuentes",
        answerC = "Carpentier, Asturias, Rulfo und Arenas",
        answerD = "Borges, García Márquez, Neruda und Isabel Allende",
        correctAnswer = 1,
        explanation = "Die vier Hauptvertreter des 'Booms' sind Gabriel García Márquez (Kolumbien), Julio Cortázar (Argentinien), Mario Vargas Llosa (Peru) und Carlos Fuentes (Mexiko). Der Boom bezeichnet die internationale Durchbruchsphase der lateinamerikanischen Literatur in den 1960er/70er Jahren, die durch innovative Erzähltechniken und den Magischen Realismus geprägt war.",
        difficulty = 4,
        funFact = "Jorge Luis Borges wird trotz seines enormen Einflusses oft nicht zum 'Boom' gezählt, da er bereits früher schrieb und ein anderes literarisches Projekt verfolgte. Er bezeichnete sich selbst als 'Vorläufer' und nicht als Teil dieser Bewegung."
    ),

    // Question 23 — Komparatistik: Rezeptionsästhetik
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welcher Literaturtheoretiker der Konstanzer Schule entwickelte das Konzept des 'impliziten Lesers' und der 'Leerstellen' in literarischen Texten?",
        answerA = "Wolfgang Iser",
        answerB = "Hans Robert Jauß",
        answerC = "Peter Szondi",
        answerD = "Emil Staiger",
        correctAnswer = 0,
        explanation = "Wolfgang Iser entwickelte in 'Der implizite Leser' (1972) und 'Der Akt des Lesens' (1976) die Wirkungsästhetik: Texte enthalten 'Leerstellen' (unbestimmte Stellen), die der Leser aktiv füllen muss. Der 'implizite Leser' ist die im Text angelegte Leserrolle. Sein Kollege Hans Robert Jauß entwickelte parallel die 'Rezeptionsästhetik' mit dem Konzept des 'Erwartungshorizonts'.",
        difficulty = 4,
        funFact = "Die Konstanzer Schule revolutionierte die Literaturwissenschaft der 1960er/70er Jahre, indem sie den Leser ins Zentrum rückte. Davor dominierte die werkimmanente Interpretation (Emil Staiger) oder die Geistesgeschichte. Jauß' Antrittsvorlesung 1967 'Literaturgeschichte als Provokation' gilt als Gründungsdokument der Rezeptionsästhetik."
    ),

    // Question 24 — Erwartungshorizont: Jauß
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Was versteht Hans Robert Jauß unter dem 'Erwartungshorizont' in seiner Rezeptionsästhetik?",
        answerA = "Den geografischen Horizont, innerhalb dessen ein Werk rezipiert wird",
        answerB = "Die Erwartungen des Autors an sein Lesepublikum",
        answerC = "Das Ensemble literarischer Erwartungen, die ein Leser aufgrund von Gattungskonventionen, Vorkenntnissen und zeithistorischem Kontext an einen Text heranträgt",
        answerD = "Den historischen Zeitraum, in dem ein Werk entstanden ist",
        correctAnswer = 2,
        explanation = "Jauß' 'Erwartungshorizont' bezeichnet das System literarischer und lebensweltlicher Erwartungen, das ein Leser an einen Text heranträgt. Bedeutende Werke brechen diesen Erwartungshorizont ('ästhetische Distanz') und erweitern ihn dadurch. Der Abstand zwischen Erwartungshorizont und dem Werk ist das Maß des ästhetischen Wertes eines Textes.",
        difficulty = 4,
        funFact = "Jauß analysierte Flauberts 'Madame Bovary' als Paradebeispiel: Das Werk enttäuschte 1857 bewusst die Erwartungen des Publikums an Sentimentalität und moralische Didaxe — und wurde deshalb als skandalös empfunden. Dieser Erwartungsbruch macht es laut Jauß zum Schlüsselwerk der Moderne."
    ),

    // Question 25 — Einfluss Shakespeare: Weltliteratur
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welches Konzept beschreibt die Tatsache, dass Shakespeares Werke in jeder Epoche und Kultur neu interpretiert und adaptiert werden, ohne an Bedeutung zu verlieren?",
        answerA = "Universelle Ästhetik",
        answerB = "Kanonisierung",
        answerC = "Intertextuelle Dominanz",
        answerD = "Shakespeares 'Plastizität' oder 'semantic openness' — die Offenheit seiner Texte für immer neue Bedeutungszuschreibungen",
        correctAnswer = 3,
        explanation = "Komparatisten und Kulturwissenschaftler beschreiben Shakespeares außergewöhnliche Wirkungsgeschichte mit seiner 'semantischen Offenheit' oder 'Plastizität': Die Texte lassen sich in jede politische, kulturelle und historische Situation einschreiben. Heiner Müllers 'Hamletmaschine', Akira Kurosawas 'Ran' (Lear) und Aimé Césaires 'Une Tempête' (Prospero als Kolonialist) zeigen dies exemplarisch.",
        difficulty = 4,
        funFact = "Harold Bloom nannte Shakespeare den 'Erfinder des Menschen' ('The Invention of the Human', 1998): Keine andere literarische Figur habe so tiefe Psychologien entwickelt, dass Leser jahrhundertelang das Gefühl haben, echte Menschen zu kennen. Bloom sah in Shakespeare den Ursprung des modernen westlichen Selbstverständnisses."
    ),

    // Question 26 — Vergleichende Gattungstheorie
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Northrop Fryes 'Anatomy of Criticism' (1957) ordnet Literatur in archetypische Muster. Welchem Jahreszeiten-Mythos entspricht nach Frye die Tragödie?",
        answerA = "Frühling (Geburt und Erneuerung)",
        answerB = "Herbst (Untergang und Vergänglichkeit)",
        answerC = "Sommer (Triumph und Fülle)",
        answerD = "Winter (Tod und Isolation)",
        correctAnswer = 1,
        explanation = "Frye ordnet in seiner archetypischen Literaturtheorie die vier Grundgattungen den Jahreszeiten zu: Romanze = Sommer (Triumph des Helden), Tragödie = Herbst (Fall des Helden), Ironie/Satire = Winter (Desillusionierung), Komödie = Frühling (Erneuerung und Versöhnung). Diese Struktur basiert auf Vegetationsmythen und Jungs Archetypen.",
        difficulty = 4,
        funFact = "Fryes Theorie hatte enorme Wirkung auf die angloamerikanische Literaturkritik der 1960er Jahre, wurde aber von Derrida und den Dekonstruktivisten kritisiert: Sie stelle eine Metaerzählung auf, die Literatur auf universelle Muster reduziere und historische Differenz ignoriere."
    ),

    // Question 27 — Romantik: Vergleich Deutsch-Englisch
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welcher englische Romantiker übersetzte German Romantic poetry und stand in direktem geistigen Austausch mit Schiller und dem deutschen Idealismus?",
        answerA = "Samuel Taylor Coleridge",
        answerB = "William Wordsworth",
        answerC = "Lord Byron",
        answerD = "John Keats",
        correctAnswer = 0,
        explanation = "Samuel Taylor Coleridge war der wichtigste Vermittler des deutschen Idealismus (Kant, Schelling) und der deutschen Romantik in England. Er übersetzte Schiller und rezipierte Tieck und Schlegel intensiv. Sein Konzept der 'Secondary Imagination' ist stark von Schelling beeinflusst. Sein 'Biographia Literaria' (1817) ist geprägt von deutschen philosophischen Quellen.",
        difficulty = 4,
        funFact = "Coleridge besuchte Deutschland 1798-1799, lernte Deutsch und hörte Vorlesungen in Göttingen. Er kehrte als Überzeugter Schelligianer zurück. Wordsworth begleitete ihn, lernte aber kein Deutsch und blieb von der deutschen Philosophie weitgehend unberührt."
    ),

    // Question 28 — Einfluss Nietzsche auf Literatur
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welches Konzept Friedrich Nietzsches beeinflusste die Literatur des Expressionismus und des Modernismus am nachhaltigsten?",
        answerA = "Der Wille zur Macht als politisches Programm",
        answerB = "Die ewige Wiederkunft als kosmologische Theorie",
        answerC = "Der Übermensch und die 'Umwertung aller Werte' als Kritik an bürgerlichen Normen",
        answerD = "Die apollinische und dionysische Dichotomie als Musiktheorie",
        correctAnswer = 2,
        explanation = "Nietzsche beeinflusste Expressionismus, Symbolismus und frühe Moderne durch sein Konzept des Übermenschen und die 'Umwertung aller Werte'. George Bernard Shaw ('Man and Superman'), D.H. Lawrence, Stefan George und Thomas Mann verarbeiteten Nietzsche. Auch der Futurismus und Surrealismus bezogen sich auf seine Radikalkritik an Moral und Metaphysik.",
        difficulty = 4,
        funFact = "Die Dichotomie von Apollinischem (Maß, Form, Vernunft) und Dionysischem (Rausch, Entgrenzung, Trieb) aus 'Die Geburt der Tragödie' (1872) ist Nietzsches einflussreichstes Konzept für die Literaturwissenschaft. Mann nutzte es in 'Der Tod in Venedig': Aschenbach ist der apollinische Künstler, der dem dionysischen Tadzio verfällt."
    ),

    // Question 29 — Realismus: Vergleich Flaubert/Fontane
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welches literarische Verfahren teilen Flauberts 'Madame Bovary' (1857) und Fontanes 'Effi Briest' (1895) als komparatistisch bedeutsame Parallele?",
        answerA = "Die Verwendung des unzuverlässigen Ich-Erzählers",
        answerB = "Die symbolistische Sprachgestaltung",
        answerC = "Die märchenhafte Auflösung des Konflikts",
        answerD = "Die Darstellung einer Frau, die an den Konventionen der bürgerlichen Gesellschaft zerbricht, erzählt durch erlebte Rede und freie indirekte Rede",
        correctAnswer = 3,
        explanation = "Komparatisten vergleichen Bovary und Briest als Parallelstudien des weiblichen Scheiterns an bürgerlichen Normen. Beide Romane nutzen 'erlebte Rede' (style indirect libre / erlebte Rede), um die Innenperspektive der Protagonistinnen darzustellen, ohne direkt aus ihr zu erzählen. Fontane kannte Flaubert und sein Verfahren — der Einfluss ist gut dokumentiert.",
        difficulty = 4,
        funFact = "Leo Tolstois 'Anna Karenina' (1878) bildet das dritte Glied dieser Trias: Auch Anna scheitert an gesellschaftlichen Konventionen. Alle drei Romane wurden von Zeitgenossen als gesellschaftskritisch, wenn nicht skandalös empfunden. Flaubert und Tolstoi wurden wegen ihrer Werke sogar vor Gericht gebracht."
    ),

    // Question 30 — Kafkas Einfluss
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welche lateinamerikanischen Autoren wurden nachweislich durch Franz Kafka beeinflusst, den Jorge Luis Borges selbst ins Spanische übersetzte?",
        answerA = "Pablo Neruda und Gabriela Mistral",
        answerB = "Jorge Luis Borges und Gabriel García Márquez",
        answerC = "Pablo Neruda und Octavio Paz",
        answerD = "Julio Cortázar und Mario Vargas Llosa",
        correctAnswer = 1,
        explanation = "Jorge Luis Borges übersetzte Kafka ins Spanische und bezeichnete ihn als seinen 'Meister'. García Márquez erzählte, das Lesen von Kafkas 'Die Verwandlung' habe ihn als Teenager befreit: 'Es ist erlaubt, so zu schreiben!' Diese Erkenntnis öffnete ihm den Weg zum Magischen Realismus. Borges' kafkaeske Labyrinthe und Bibliotheken sind direktes Echo von Kafkas absurden Bürokratien.",
        difficulty = 4,
        funFact = "García Márquez beschrieb den Moment, als er Kafkas 'Die Verwandlung' las, als literarisches Erweckungserlebnis: Er rannte ins Zimmer seiner Mutter und rief, er werde Schriftsteller. Kafka hatte ihm gezeigt, dass Literatur die Konventionen der Wirklichkeit sprengen darf."
    ),

    // Question 31 — Postkoloniale Literatur: Achebe
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Chinua Achebes Roman 'Things Fall Apart' (1958) gilt als Antwort auf welchen europäischen Text, den Achebe explizit kritisierte?",
        answerA = "Joseph Conrads 'Heart of Darkness', das Afrika als Ort des Grauens und Primitivismus darstellt",
        answerB = "Rudyard Kiplings 'The Jungle Book' als Kolonialmythos",
        answerC = "H. Rider Haggards 'King Solomon's Mines' als Abenteuerliteratur",
        answerD = "George Orwells 'Burmese Days' als Kolonialkritik",
        correctAnswer = 0,
        explanation = "Chinua Achebe kritisierte Conrads 'Heart of Darkness' (1899) in seinem Essay 'An Image of Africa' (1975) als rassistischen Text, der Afrika und Afrikaner dehumanisiert. 'Things Fall Apart' ist Achebes bewusste Gegendarstellung: Er erzählt die Geschichte der Igbo-Gesellschaft aus innerer Perspektive, bevor und während der britische Kolonialismus sie zerstört.",
        difficulty = 4,
        funFact = "Achebes Achebe-Conrad-Debatte ist eine der bedeutendsten postkolonialen literaturwissenschaftlichen Kontroversen. Verteidiger Conrads (u.a. Chinua Achebes Zeitgenosse Albert J. Guerard) sahen in 'Heart of Darkness' eine universelle Reise ins menschliche Unbewusste — Achebe bestand darauf, dass solche 'Universalismus'-Argumente rassistische Inhalte legitimieren."
    ),

    // Question 32 — Intertextualität: T.S. Eliot
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "T.S. Eliots 'The Waste Land' (1922) gilt als der intertextuell komplexeste Text der englischen Moderne. Welche antike Überlieferung ist laut Eliots eigenem Anmerkungsapparat die wichtigste Quelle?",
        answerA = "Homers Ilias",
        answerB = "Ovids Metamorphosen",
        answerC = "Jessie L. Westons 'From Ritual to Romance' (Gralslegende) und James George Frazers 'The Golden Bough'",
        answerD = "Vergils Aeneis",
        correctAnswer = 2,
        explanation = "Eliot selbst verwies in seinen Anmerkungen zu 'The Waste Land' auf Jessie Westons Studie über die Gralslegende ('From Ritual to Romance') und Frazers anthropologisches Standardwerk 'The Golden Bough' als Hauptquellen. Dazu verwebt das Gedicht Dante, Shakespeare, Chaucer, Baudelaire und Sanskrit-Texte in einem Palimpsest-Verfahren.",
        difficulty = 4,
        funFact = "Eliots Anmerkungsapparat zu 'The Waste Land' war ursprünglich ein Scherz — er sollte nur das zu kurze Poem auf Buchformat aufblähen. Ironischerweise wurden die Anmerkungen selbst zum Gegenstand intensiver Forschung und lösten eine eigene Debatte über die Grenzen von Werk und Paratext aus."
    ),

    // Question 33 — Magischer Realismus: Günter Grass
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welches deutsche Werk wird komparatistisch oft neben dem lateinamerikanischen Magischen Realismus diskutiert, weil es Alltagsrealität mit magischen Elementen verbindet?",
        answerA = "Thomas Manns 'Buddenbrooks'",
        answerB = "Bertolt Brechts 'Der gute Mensch von Sezuan'",
        answerC = "Heinrich Bölls 'Billard um halbzehn'",
        answerD = "Günter Grass' 'Die Blechtrommel' (1959)",
        correctAnswer = 3,
        explanation = "Günter Grass' 'Die Blechtrommel' wird komparatistisch häufig mit dem lateinamerikanischen Magischen Realismus verglichen: Der Protagonist Oskar Matzerath hört mit drei Jahren auf zu wachsen, kann mit seiner Blechtrommel Glas zerspringen lassen und hat animalische Fähigkeiten. Das Übernatürliche ist selbstverständlicher Teil der Realität — wie bei García Márquez.",
        difficulty = 4,
        funFact = "García Márquez und Grass haben sich gegenseitig als Einflüsse anerkannt. Beide veröffentlichten ihre Schlüsselwerke kurz hintereinander ('Blechtrommel' 1959, 'Hundert Jahre Einsamkeit' 1967) und wurden beide mit dem Nobelpreis geehrt. Die Parallelen zwischen Oskar und den Buendías sind Gegenstand zahlreicher komparatistischer Studien."
    ),

    // Question 34 — Übersetzung und Weltliteratur
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Walter Benjamins Essay 'Die Aufgabe des Übersetzers' (1923) formuliert eine einflussreiche Theorie der Übersetzung. Was ist ihre Kernthese?",
        answerA = "Übersetzung soll den Originaltext möglichst unsichtbar ins Zielsprachige transportieren",
        answerB = "Übersetzung ist kein Dienst am Leser, sondern zielt auf eine 'reine Sprache', die im Original aufscheint — der Übersetzer offenbart, was im Original verborgen ist",
        answerC = "Übersetzung ist ein kreativer Akt, der dem Übersetzer freie literarische Gestaltung erlaubt",
        answerD = "Übersetzung ist grundsätzlich unmöglich, da Sprachen inkommensurabel sind",
        correctAnswer = 1,
        explanation = "Benjamin argumentiert, dass Übersetzung nicht dem Leser dient, sondern einer 'reinen Sprache' (langue pure), die hinter allen Einzelsprachen steckt und in der Übersetzung aufscheint. Der Übersetzer erschließt das, was im Original verborgen war. Diese mystisch-messianische Übersetzungstheorie hatte enormen Einfluss auf Derrida und die poststrukturalistische Übersetzungswissenschaft.",
        difficulty = 4,
        funFact = "Benjamins Aufsatz ist das Vorwort zu seiner Übersetzung von Baudelaires 'Tableaux parisiens'. Er schrieb ihn ohne Auftrag, weil er seine Übersetzungsphilosophie explizit machen wollte. Der Text ist selbst so schwer zu übersetzen, dass er als Paradoxon gilt: Ein Aufsatz über Übersetzung, der sich selbst der Übersetzung widersetzt."
    ),

    // Question 35 — Dekonstruktion: Derrida
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Was versteht Jacques Derridas Dekonstruktion unter dem Begriff 'Différance' (mit 'a') in Bezug auf Literatur und Bedeutung?",
        answerA = "Das doppelte Spiel von 'différer' (sich unterscheiden) und 'différer' (aufschieben): Bedeutung entsteht nie im Präsens, sondern durch endloses Aufschieben und Verweisen auf andere Zeichen",
        answerB = "Die Differenz zwischen dem geschriebenen und dem gesprochenen Wort",
        answerC = "Den Unterschied zwischen dem Intentionssinn des Autors und der Leserbedeutung",
        answerD = "Die historische Distanz zwischen Entstehungszeit und Rezeptionszeit eines Textes",
        correctAnswer = 0,
        explanation = "Derridas 'Différance' (absichtliche Schreibweise mit 'a' statt 'e', die im Französischen lautlich nicht unterscheidbar ist) bezeichnet das Doppelspiel: Zeichen bedeuten, indem sie sich von anderen Zeichen unterscheiden (différer) und Bedeutung immer auf andere Zeichen verschieben (différer). Bedeutung ist nie präsent und vollständig — sie ist ein endloses Spiel der Verweise.",
        difficulty = 4,
        funFact = "Die Schreibweise 'Différance' mit 'a' ist im gesprochenen Französisch nicht von 'Différence' mit 'e' zu unterscheiden — nur im Schreiben sichtbar. Damit demonstriert Derrida sein Argument selbst: Die Schrift (Différance) ist dem Sprechen nicht untergeordnet, sondern enthüllt, was die Rede verbirgt."
    ),

    // Question 36 — Stimmführung: Erzählperspektive
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Gérard Genette unterscheidet in 'Die Erzählung' (Discours du récit, 1972) zwischen 'Wer sieht?' und 'Wer spricht?'. Wie nennt er diese Unterscheidung?",
        answerA = "Modus und Stimme",
        answerB = "Fokalisierung und Narration",
        answerC = "Fokalisierung ('Wer sieht?') und Stimme ('Wer spricht?')",
        answerD = "Perspektive und Erzählhaltung",
        correctAnswer = 2,
        explanation = "Genette unterscheidet systematisch: 'Fokalisierung' bezeichnet die Frage, durch wessen Wahrnehmungsfilter die Geschichte erzählt wird (Nullfokalisierung = allwissend; interne Fokalisierung = durch eine Figur; externe Fokalisierung = von außen). 'Stimme' bezeichnet, wer die Erzählerinstanz ist. Ein Erzähler kann eine andere Figur fokalisieren — das ist der Kern dieser Unterscheidung.",
        difficulty = 4,
        funFact = "Genettes Narratologie revolutionierte die Erzähltheorie, weil sie zeigte, dass viele traditionelle Begriffe ('Ich-Erzähler', 'Er-Erzähler') Fokalisierung und Stimme vermischen. Henry Jamesens Technik des 'central consciousness' ist z.B. interne Fokalisierung bei heterodiegetischer Stimme."
    ),

    // Question 37 — Sturm und Drang: Einflüsse
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welcher englische und welcher französische Einfluss prägten maßgeblich die Sturm-und-Drang-Bewegung der deutschen Literatur (1765–1785)?",
        answerA = "John Milton und Voltaire",
        answerB = "Pope und Molière",
        answerC = "Shakespeare und Descartes",
        answerD = "Shakespeare (Genie-Begriff, Regellosigkeit) und Jean-Jacques Rousseau (Natur, Gefühl, Gesellschaftskritik)",
        correctAnswer = 3,
        explanation = "Der Sturm und Drang (Herder, junger Goethe, Schiller) wurde doppelt geprägt: Shakespeare lieferte das Modell des regelverachtenden Genies, das gegen die französisch-klassizistischen Einheitsregeln stand. Rousseau (Emile, 1762; Du contrat social, 1762) lieferte die Naturphilosophie und die Kritik an zivilisatorischer Korrumpierung. Herder besuchte Rousseau und propagierte den Shakespeare-Kult.",
        difficulty = 4,
        funFact = "Herder entdeckte Volkslieder und 'Ossian' (einen gefälschten schottischen Barden) als authentische Alternativen zur höfischen Kunstdichtung. Die Ossian-Begeisterung war ein europaweites Phänomen, das Napoleon, Goethe und sogar Schubert erfasste — trotz Macphersons Fälschung."
    ),

    // Question 38 — Symbolismus: Baudelaire/Mallarmé
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welches poetologische Konzept Charles Baudelaires — formuliert in seinem Gedicht 'Correspondances' — wurde zum Schlüsselkonzept des europäischen Symbolismus?",
        answerA = "Die 'Fleurs du Mal' als Ästhetik des Bösen",
        answerB = "Die 'Correspondances' (Synästhesien, Analogien zwischen Sinneswahrnehmungen und spirituellen Sphären)",
        answerC = "Der 'Dandy' als ästhetische Lebenshaltung",
        answerD = "Die 'Spleen'-Ästhetik der Melancholie",
        correctAnswer = 1,
        explanation = "Baudelaires 'Correspondances' (aus 'Les Fleurs du Mal', 1857) formuliert die Idee synästhetischer Analogien: Düfte, Farben und Töne entsprechen sich ('Les parfums, les couleurs et les sons se répondent'). Dieses Konzept wurde von Rimbaud, Verlaine und Mallarmé aufgegriffen und zum Kernkonzept des Symbolismus: Dichtung soll nicht beschreiben, sondern Stimmungen durch Klang und Symbol evozieren.",
        difficulty = 4,
        funFact = "Rimbauds berühmtes 'Sonett der Vokale' (1871) ist die radikalste Ausführung des Correspondances-Konzepts: Er ordnet jedem Vokal eine Farbe zu (A = schwarz, E = weiß, I = rot, U = grün, O = blau). Das Sonett hat die Literaturtheorie bis heute beschäftigt — und ist möglicherweise als Parodie gemeint."
    ),

    // Question 39 — Verismus und Naturalismus
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welcher französische Autor begründete den Naturalismus als literarische Programm-Bewegung und beeinflusste damit den deutschen Naturalismus (Hauptmann, Holz) und den italienischen Verismus (Verga)?",
        answerA = "Émile Zola mit seinem Konzept des 'Roman expérimental' (experimenteller Roman als wissenschaftliche Beobachtung)",
        answerB = "Gustave Flaubert mit seiner Stiltheorie der 'impassibilité'",
        answerC = "Guy de Maupassant mit seinen naturalistischen Kurzgeschichten",
        answerD = "Stendhal mit seinem Spiegel-Modell des Realismus",
        correctAnswer = 0,
        explanation = "Émile Zola entwickelte in 'Le Roman expérimental' (1880) das programmatische Konzept: Der Schriftsteller soll wie ein Wissenschaftler Milieus und Charaktere 'experimentell' beobachten und deren Gesetze darstellen. Heredität, Milieu und Moment (nach Taine) bestimmen den Menschen. Dieses Programm beeinflusste Gerhart Hauptmanns 'Weber' und Giovanni Vergas 'Malavoglia' direkt.",
        difficulty = 4,
        funFact = "Zola wurde wegen seines Dreyfus-Artikels 'J'accuse' (1898) fast verurteilt. Er floh nach England. Der Naturalist Zola war also selbst Protagonist einer der größten politischen Affären Frankreichs — ein Beweis, dass die naturalistischen Ideen von Engagement und Wahrheit mehr als Literatur waren."
    ),

    // Question 40 — Don Quijote: Metafiktion
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Im zweiten Teil des 'Don Quijote' (1615) begegnet der Protagonist Figuren, die ihn aus dem ersten Teil kennen. Welchen literarischen Begriff prägt dieses Verfahren, das im 20. Jahrhundert zentral wurde?",
        answerA = "Stream of consciousness",
        answerB = "Erlebte Rede",
        answerC = "Metafiktion",
        answerD = "Unzuverlässiges Erzählen",
        correctAnswer = 2,
        explanation = "Cervantes' Verfahren im zweiten Teil des Don Quijote — Figuren kennen das Buch über sich selbst — ist ein früher Fall von Metafiktion: Literatur, die ihre eigene Fiktionalität thematisiert. Im 20. Jahrhundert wurde Metafiktion durch Autoren wie Nabokov, Borges, Italo Calvino ('Wenn ein Reisender in einer Winternacht') und John Barth zu einem zentralen postmodernen Verfahren.",
        difficulty = 4,
        funFact = "Pirandello ('Sechs Personen suchen einen Autor', 1921) und Brecht (Verfremdungseffekt) nutzten die Selbstthematisierung der Fiktion im Theater. Bei Pirandello kommen unfertige Theaterfiguren auf die Bühne — eine direkte Nachfolge von Cervantes' Reflexivität."
    ),

    // Question 41 — Feministische Komparatistik
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Sandra Gilbert und Susan Gubar beschreiben in 'The Madwoman in the Attic' (1979) ein wiederkehrendes Muster in der Literatur des 19. Jahrhunderts. Was ist ihre Kernthese?",
        answerA = "Weibliche Autorinnen wurden systematisch aus dem Kanon ausgeschlossen",
        answerB = "Männliche Autoren projektierten ihre Angst vor Kreativitätsverlust auf weibliche Figuren",
        answerC = "Die Schreiberin des 19. Jahrhunderts übernahm männliche Pseudonyme, um publizierfähig zu sein",
        answerD = "Weibliche Schriftsteller des 19. Jahrhunderts drückten ihre Rebellion gegen patriarchale Beschränkungen durch doppelte Protagonistinnen aus: die 'Engel'-Figur und die 'Wahnsinnige' als verborgenes Alter Ego",
        correctAnswer = 3,
        explanation = "Gilbert und Gubars Analyse zeigt: Weibliche Autorinnen (Brontë, Austen, Eliot) schufen oft zwei Frauenfiguren — die engelshafte, angepasste Protagonistin und die 'Wahnsinnige' (z.B. Bertha Mason in 'Jane Eyre'), die das unterdrückte, rebellische Ich verkörpert. Die 'Madwoman in the Attic' ist das Alter Ego der Autorin, die ihre Wut nicht direkt ausdrücken durfte.",
        difficulty = 4,
        funFact = "Jean Rhys' Roman 'Wide Sargasso Sea' (1966) schrieb 'Jane Eyre' aus Bertha Masons Perspektive um — eine direkte literarische Umsetzung von Gilbert/Gubars Thesen, noch bevor diese veröffentlicht wurden. Rhys rehabilitierte die 'Wahnsinnige' als komplexe koloniale Opferfigur."
    ),

    // Question 42 — Intertextualität: Palimpsest
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Das Bild des 'Palimpsests' — ein Pergament, auf dem ältere Texte noch durch neue hindurchscheinen — dient als Metapher für welches literaturwissenschaftliche Konzept?",
        answerA = "Die Rezeptionsgeschichte eines Werkes",
        answerB = "Intertextualität: Texte überlagern frühere Texte, ohne diese vollständig zu tilgen — das 'Darunter' bleibt lesbar",
        answerC = "Die Palimpsest-Technik des Wiederaufgreifens vergessener Texte",
        answerD = "Die Zensurgeschichte verbotener Werke",
        correctAnswer = 1,
        explanation = "Gérard Genette titelte sein Hauptwerk zur Intertextualität 'Palimpsestes' (1982), weil die Metapher des Palimpsests die Schichtung von Texten über Texten visualisiert: Ein Hypertext (z.B. Joyces Ulysses) überlagert seinen Hypotext (Homers Odyssee), aber dieser scheint durch. Thomas De Quincey hatte die Metapher bereits für das Gedächtnis genutzt.",
        difficulty = 4,
        funFact = "Im Mittelalter wurden teure Pergamente wiederverwendet: Man schabte alte Texte ab und beschrieb sie neu. Durch modernes UV-Licht können Forscher heute die ursprünglichen Texte wieder lesbar machen — buchstäblich die Vergangenheit unter der Gegenwart. Berühmtes Beispiel: Der Archimedes-Palimpsest, der unter einem Gebet­buch mathematische Abhandlungen verbarg."
    ),

    // Question 43 — Surrealismus und Literatur
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "André Bretons 'Manifest des Surrealismus' (1924) proklamierte eine neue Schreibweise. Welche literarische Technik stand im Zentrum des surrealistischen Programms?",
        answerA = "L'écriture automatique (automatisches Schreiben) — bewusstseinskontrollfrei, um das Unbewusste freizulegen",
        answerB = "Die Verwendung von Traumtagebüchern als Romanstoff",
        answerC = "Die Collage-Technik fremder Textfragmente",
        answerD = "Die absolute Freiheit der Metapher ohne logischen Zusammenhang",
        correctAnswer = 0,
        explanation = "Das Herzstück des Surrealismus war die 'écriture automatique' (automatisches Schreiben): ohne Vernunftkontrolle, Moral oder Ästhethik schreiben, um das Unbewusste direkt aufs Papier zu bringen. Breton und Soupault erprobten es in 'Les Champs magnétiques' (1920). Das Verfahren basierte auf Freuds Traumdeutung und der freien Assoziation der Psychoanalyse.",
        difficulty = 4,
        funFact = "Der Surrealismus beeinflusste nicht nur Literatur, sondern direkt den Magischen Realismus: Carpentier, Asturias und Uslar Pietri lernten das automatische Schreiben in Pariser Surrealisten-Kreisen kennen, bevor sie es in eine spezifisch lateinamerikanische Ästhetik transformierten."
    ),

    // Question 44 — Weltliteratur: Casanova
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Pascale Casanova beschreibt in 'La République mondiale des Lettres' (1999) ein literarisches Kräftefeld. Welches Zentrum hatte dieses Feld laut Casanova am längsten inne?",
        answerA = "London als Zentrum des britischen Imperialismus",
        answerB = "New York als Zentrum des amerikanischen Verlagsmarkts",
        answerC = "Paris als Zentrum der literarischen 'Konsekration' — internationale Anerkennung lief über Übersetzung ins Französische",
        answerD = "Berlin als Zentrum der deutschen Moderne",
        correctAnswer = 2,
        explanation = "Casanova argumentiert, dass Paris über Jahrhunderte das Zentrum des 'literarischen Weltfeldes' (nach Bourdieu) war: Autoren aus der Peripherie mussten über Paris 'konsekriert' werden — durch Übersetzung, Verlagskontrakte oder Exil in Paris. Kafka wurde z.B. erst durch französische Übersetzungen weltberühmt. Das Modell erklärt, warum so viele nicht-französische Autoren nach Paris emigrierten.",
        difficulty = 4,
        funFact = "Samuel Beckett ist Casanovas Paradebeispiel: Er schrieb bewusst auf Französisch ('En attendant Godot'), obwohl er Ire war, um das Englische als dominante Muttersprache zu umgehen. Paris als Kunstmetropole bot ihm die 'Freiheit', in einer 'schwächeren' Sprache zu schreiben."
    ),

    // Question 45 — Rezeptionsgeschichte: Antigone
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche philosophische Frage macht Sophokles' 'Antigone' zu einem der am häufigsten adaptierten Texte der Weltliteratur, von Hegel bis Anouilh und Brecht?",
        answerA = "Die Frage nach der Entstehung staatlicher Macht",
        answerB = "Die Frage nach der Stellung der Frau in der antiken Gesellschaft",
        answerC = "Die Frage nach Schuld und Sühne in der Tragödie",
        answerD = "Der Konflikt zwischen göttlichem/moralischem Gesetz und staatlichem Gesetz — individuellem Gewissen versus institutioneller Macht",
        correctAnswer = 3,
        explanation = "Antigone steht für den Konflikt zwischen ungeschriebenem göttlichem Gesetz (Bruder begraben) und staatlichem Gesetz (Kreons Verbot). Hegel interpretierte es als Kollision zweier gleichberechtigter Sittlichkeiten. Jean Anouilh aktualisierte es 1944 im besetzten Frankreich (Widerstand vs. Kollaboration), Brecht in der 'Antigone' (1948) als Antikriegsstück.",
        difficulty = 4,
        funFact = "Seamus Heaney übersetzte die 'Antigone' 2004 als 'The Burial at Thebes' mit explizitem Bezug auf den Irakkrieg und Guantanamo. Dies zeigt die ungebrochene politische Aktualität des Stücks: Der Konflikt zwischen staatlicher Macht und individuellem Gewissen ist universell und zeitlos."
    ),

    // Question 46 — Postmoderne: Italo Calvino
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Italo Calvinos Roman 'Wenn ein Reisender in einer Winternacht' (1979) beginnt mit dem Satz 'Du bist im Begriff, den neuen Roman von Italo Calvino zu lesen'. Welches literarisches Verfahren charakterisiert diesen Text?",
        answerA = "Stream of consciousness",
        answerB = "Metafiktion und direkte Leseranrede (second-person narrative), die den Akt des Lesens selbst thematisiert",
        answerC = "Magischer Realismus",
        answerD = "Unzuverlässiges Erzählen",
        correctAnswer = 1,
        explanation = "Calvino verwendet 'second-person narrative' (Du-Erzählung) und Metafiktion: Der Roman erzählt von einem Leser ('Du'), der versucht, verschiedene Romananfänge zu lesen, und nicht an die Fortsetzungen gelangt. Das Lesen selbst wird zum Thema. Calvino verknüpft dies mit Borges'schen Labyrinthen und poststrukturalistischen Ideen über die Unabschließbarkeit von Texten.",
        difficulty = 4,
        funFact = "Calvino war Mitglied der französischen Schreib-Werkstatt OuLiPo (Ouvroir de littérature potentielle), zu der auch Georges Perec ('La Vie mode d'emploi') und Raymond Queneau gehörten. OuLiPo erforschte Schreiben unter selbst auferlegten formalen Beschränkungen — z.B. schrieb Perec einen Roman ganz ohne den Buchstaben 'e'."
    ),

    // Question 47 — Einfluss Tolstoi auf Weltliteratur
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welcher indische Schriftsteller und politische Führer wurde nachweislich durch Leo Tolstois Philosophie und Briefwechsel tief beeinflusst, und welches Werk Tolstois war zentral?",
        answerA = "Mahatma Gandhi; Tolstois 'Das Gottesreich ist in euch' (1894) und Tolstois Lehre der Gewaltlosigkeit prägten Gandhis Konzept des Satyagraha",
        answerB = "Rabindranath Tagore; Tolstois 'Krieg und Frieden' als Epos des Widerstands",
        answerC = "Jawaharlal Nehru; Tolstois 'Anna Karenina' als Gesellschaftskritik",
        answerD = "Aurobindo Ghose; Tolstois 'Auferstehung' als spirituelles Programm",
        correctAnswer = 0,
        explanation = "Mahatma Gandhi stand in direktem Briefwechsel mit Tolstoi (1909-1910). Tolstois 'Das Gottesreich ist in euch' (1894) mit seiner Lehre der Gewaltlosigkeit und des zivilen Ungehorsams prägte Gandhis Konzept des Satyagraha. Gandhis erste südafrikanische Siedlung nannte er 'Tolstoi-Farm'. Dies ist eines der bedeutendsten Beispiele literarisch-politischer Einflussgeschichte.",
        difficulty = 4,
        funFact = "Der Briefwechsel zwischen Gandhi und dem 80-jährigen Tolstoi ist ein einzigartiges Dokument der Weltliteraturgeschichte: Ein russischer Adliger und ein indischer Anwalt entwickelten gemeinsam Prinzipien des gewaltlosen Widerstands, die Gandhi wenige Jahre später in die Praxis umsetzte."
    ),

    // Question 48 — Literatur und Kolonialismus: Tempest
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Shakespeares 'The Tempest' (1611) wurde von mehreren postkolonialen Autoren als Kolonialismus-Allegorie umgeschrieben. Welcher karibische Autor schrieb 'Une Tempête' (1969) und machte Caliban zur antikolonialen Widerstandsfigur?",
        answerA = "Derek Walcott",
        answerB = "Wilson Harris",
        answerC = "Aimé Césaire",
        answerD = "Frantz Fanon",
        correctAnswer = 2,
        explanation = "Aimé Césaire (Martinique) schrieb 1969 'Une Tempête' als postkoloniale Gegenantwort auf Shakespeare: Caliban ist bei Césaire kein Monster, sondern ein versklavter Ureinwohner, der sich gegen Prospero (Europa) auflehnt. Caliban spricht in schwarzem Englisch, Ariel in einem akzentfreien Englisch — ein Kommentar über Formen des Kolonialismus und des Widerstands.",
        difficulty = 4,
        funFact = "Der kubanische Essayist Roberto Fernández Retamar machte Caliban 1971 zum Symbol der lateinamerikanischen Identität ('Calibán'): Amerika sei nicht Ariel (die höflich-europäisierte Elite) sondern Caliban — die unterdrückte, hybride Kraft, die sich die Sprache des Colonizers angeeignet hat. Die Figur wanderte so von Shakespeare über Césaire bis in die lateinamerikanische Identitätsdebatte."
    ),

    // Question 49 — Epik: Gilgamesch
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Das 'Gilgamesch-Epos' (ca. 2100 v. Chr.) gilt als ältestes erhaltenes Literaturwerk. Welche Themen verbinden es komparatistisch mit Homers 'Odyssee' und der Bibel?",
        answerA = "Das Thema der Unterwelt und der Götterstrafe",
        answerB = "Das Thema der Stadtgründung und der Königsherrschaft",
        answerC = "Das Thema der Liebe als Antrieb des Helden",
        answerD = "Die Suche nach Unsterblichkeit, die Sintflutgeschichte (Parallele zu Noah) und die Freundschaftsthematik als Motor des Epos",
        correctAnswer = 3,
        explanation = "Das Gilgamesch-Epos bietet komparatistisch frappierende Parallelen: Die Sintflutgeschichte des Utnapischtim ist strukturell identisch mit dem biblischen Noah-Bericht. Die Suche nach Unsterblichkeit nach dem Tod des Freundes Enkidu verbindet es mit Achill und Patroklos in der Ilias. Die Neuentdeckung des Gilgamesch-Epos 1872 erschütterte das damalige Weltbild, weil es die Bibel als Original der Sintflutgeschichte infrage stellte.",
        difficulty = 4,
        funFact = "George Smith, ein Assyriologe des British Museum, identifizierte 1872 die Sintfluttafel im Gilgamesch-Epos und brach vor Aufregung in Tränen aus, rannte durch das Museum und begann, seine Kleider auszuziehen. Die Entdeckung war so sensationell, dass eine Londoner Zeitung sofort eine Expedition nach Ninive finanzierte."
    ),

    // Question 50 — Literaturwissenschaft: Edward Said
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Edward Saids 'Orientalism' (1978) analysierte, wie westliche Literatur und Wissenschaft den 'Orient' konstruiert. Auf welchem literaturtheoretischen Rahmen basiert Saids Analyse?",
        answerA = "Marxistischer Ideologiekritik nach Lukács",
        answerB = "Michel Foucaults Diskursanalyse — Orientalismus als Wissens-Macht-Komplex, der den Orient als 'Anderen' konstruiert und damit beherrschbar macht",
        answerC = "Carl Gustav Jungs kollektivem Unbewusstem und Schattenprojektion",
        answerD = "Roland Barthes' Mythologie-Begriff",
        correctAnswer = 1,
        explanation = "Said stützte seine Analyse des Orientalismus auf Foucaults Diskurstheorie: Orientalismus ist kein neutrales Wissen, sondern ein Macht-Wissen-Komplex, der 'den Orient' als homogenes, rückständiges, exotisches 'Anderes' konstruiert und damit westliche Herrschaft legitimiert. Texte von Flaubert, Nerval und Chateaubriand sind für Said Belege dieses Diskurses.",
        difficulty = 4,
        funFact = "Said analysierte Flauberts Briefe über seine Reise nach Ägypten: Flaubert beschrieb ägyptische Frauen aus einer Überlegenheitsperspektive, die ihnen keine eigene Stimme ließ. Said sah darin ein Muster: Der Westen spricht über den Orient, der Orient spricht nie selbst. Diese Asymmetrie ist das Kernproblem des Orientalismus-Diskurses."
    )

)
