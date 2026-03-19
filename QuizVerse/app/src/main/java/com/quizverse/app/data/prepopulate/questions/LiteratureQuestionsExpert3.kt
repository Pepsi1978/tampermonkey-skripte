package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun literatureQuestionsExpert3(): List<Question> = listOf(

    // Question 1 - Dadaismus
    Question(
        categoryId = 10,
        questionText = "Wie heißt Hugo Balls bekanntestes Lautgedicht, das er 1916 im Cabaret Voltaire in einem kubistischen Bischofskostüm vortrug?",
        answerA = "Gadji beri bimba",
        answerB = "Karawane",
        answerC = "Wolken Pumpe",
        answerD = "Manifest Dada",
        correctAnswer = 0,
        explanation = "Hugo Ball trug 'Gadji beri bimba' im Juni 1916 im Zürcher Cabaret Voltaire vor — gekleidet in einem steifen kubistischen Pappkostüm, das einem Bischofsgewand ähnelte. Das Lautgedicht besteht aus erfundenen, bedeutungsfreien Silben und gilt als Ur-Experiment des Dadaismus.",
        difficulty = 4,
        funFact = "Ball geriet beim Vortrag angeblich in eine Art Trance und musste von der Bühne getragen werden — seine Mitstreiter dachten zunächst, es sei ein Teil der Performance."
    ),

    // Question 2 - Dadaismus
    Question(
        categoryId = 10,
        questionText = "Welche Methode beschreibt Tristan Tzaras Anleitung, ein Dada-Gedicht zu schreiben?",
        answerA = "Automatisches Schreiben im Traum",
        answerB = "Zeitungsartikel ausschneiden, in einen Beutel schütteln und zufällig ziehen",
        answerC = "Buchstaben einzeln würfeln und aneinanderreihen",
        answerD = "Spiegelschrift unter Hypnose schreiben",
        correctAnswer = 1,
        explanation = "Tzara beschrieb in seinem 'Dadaistischen Manifest von 1918' die Methode: Einen Zeitungsartikel ausschneiden, jeden Satz einzeln abschneiden, in einen Beutel stecken, schütteln, einen Zettel nach dem anderen herausziehen und abschreiben — das Ergebnis sei ein Originalgedicht.",
        difficulty = 4,
        funFact = "Diese Zufallsmethode (Aleatorik) beeinflusste Jahrzehnte später die Cut-up-Technik von William Burroughs und Brion Gysin direkt."
    ),

    // Question 3 - Dadaismus
    Question(
        categoryId = 10,
        questionText = "In welchem Züricher Lokal wurde am 5. Februar 1916 das Cabaret Voltaire gegründet?",
        answerA = "Kunsthaus Zürich",
        answerB = "Café Odeon",
        answerC = "Spiegelgasse 1",
        answerD = "Zunfthaus zur Meisen",
        correctAnswer = 2,
        explanation = "Hugo Ball und Emmy Hennings gründeten das Cabaret Voltaire in der Spiegelgasse 1 in Zürich — ausgerechnet in unmittelbarer Nachbarschaft zum Exilquartier Wladimir Lenins, der ebenfalls in der Spiegelgasse wohnte. Diese zufällige Nachbarschaft gilt als historische Kuriosität.",
        difficulty = 4,
        funFact = "Lenin soll gelegentlich in das Cabaret Voltaire hereingekommen sein, aber über seine Reaktion auf die Dada-Veranstaltungen ist nichts überliefert."
    ),

    // Question 4 - Surrealismus
    Question(
        categoryId = 10,
        questionText = "Welches Buch veröffentlichten André Breton und Philippe Soupault 1920 als erstes Werk der écriture automatique?",
        answerA = "Nadja",
        answerB = "L'Amour fou",
        answerC = "Le Paysan de Paris",
        answerD = "Les Champs magnétiques",
        correctAnswer = 3,
        explanation = "'Les Champs magnétiques' (Die magnetischen Felder) von Breton und Soupault gilt als erstes surrealistisches literarisches Werk, vollständig im automatischen Schreiben verfasst. Die beiden schrieben täglich mehrere Stunden, ohne zu zensieren oder nachzudenken — das Unbewusste sollte direkt aufs Papier fließen.",
        difficulty = 4,
        funFact = "Breton und Soupault schrieben in Schichten und tauschten täglich das Manuskript aus — ohne zu lesen, was der andere geschrieben hatte. Das Ergebnis war ein Text, der zwischen den Autoren schwebte."
    ),

    // Question 5 - Surrealismus
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr veröffentlichte André Breton das erste 'Manifest des Surrealismus', das die écriture automatique als Methode definierte?",
        answerA = "1924",
        answerB = "1921",
        answerC = "1930",
        answerD = "1917",
        correctAnswer = 0,
        explanation = "Bretons erstes Surrealistisches Manifest erschien 1924 und definierte Surrealismus als 'reines psychisches Automatismus, durch den man mündlich, schriftlich oder auf jede andere Weise den tatsächlichen Ablauf des Denkens ausdrücken will, ohne jede Kontrolle durch die Vernunft'.",
        difficulty = 4,
        funFact = "Das zweite Surrealistische Manifest folgte 1930 — Breton nutzte es, um zahlreiche frühere Mitglieder der Bewegung offiziell auszuschließen, darunter auch Soupault."
    ),

    // Question 6 - Surrealismus
    Question(
        categoryId = 10,
        questionText = "Welchen Begriff prägte der Surrealismus für unerwartete Zufallsbegegnungen von Gegenständen, die eine magische Wirkung erzeugen?",
        answerA = "Dérive",
        answerB = "Hasard objectif",
        answerC = "Détournement",
        answerD = "Psychogeographie",
        correctAnswer = 1,
        explanation = "Der 'hasard objectif' (objektiver Zufall) ist ein zentrales Konzept Bretons: die magische Begegnung zwischen äußerem Zufall und innerem Begehren, die das Surrealistische im Alltag offenbart. Breton beschrieb ihn in 'Nadja' (1928) und 'L'Amour fou' (1937) anhand persönlicher Erlebnisse.",
        difficulty = 4,
        funFact = "Der Begriff geht auf Friedrich Engels zurück, den Breton für seine eigene Theorie adaptierte — eine ungewöhnliche Verbindung von Marxismus und Traumtheorie."
    ),

    // Question 7 - Oulipo
    Question(
        categoryId = 10,
        questionText = "Was bedeutet das Akronym 'Oulipo' auf Französisch?",
        answerA = "Ouvroir de littérature potentielle",
        answerB = "Organisation universelle de la littérature polyphonique",
        answerC = "Ouvroir littéraire pour les poètes ordinaires",
        answerD = "Organisation unie de la liberté poétique",
        correctAnswer = 2,
        explanation = "Oulipo steht für 'Ouvroir de littérature potentielle' — Werkstatt der potenziellen Literatur. Die Gruppe wurde 1960 von Raymond Queneau und François Le Lionnais gegründet und verfolgt die Idee, dass schreibtechnische Beschränkungen (Contraintes) neue kreative Freiheiten erschließen.",
        difficulty = 4,
        funFact = "Queneau beschrieb Oulipians als 'Ratten, die das Labyrinth bauen, aus dem sie zu entkommen planen' — ein Bild für die bewusste Selbstbeschränkung als kreative Methode."
    ),

    // Question 8 - Oulipo
    Question(
        categoryId = 10,
        questionText = "Georges Perecs Lipogramm-Roman 'La Disparition' (1969) verzichtet vollständig auf einen bestimmten Buchstaben. Welchen?",
        answerA = "A",
        answerB = "I",
        answerC = "O",
        answerD = "E",
        correctAnswer = 3,
        explanation = "Perecs 300-seitiger Roman 'La Disparition' (dt. 'Anton Voyls Fortgang') kommt auf keiner einzigen Seite, in keinem einzigen Wort mit dem Buchstaben 'e' aus — dem häufigsten Buchstaben im Französischen. Das Fehlen des 'e' ist thematisch bedeutsam: Es steht auch für das Fehlende, Verschwundene in Perecs Leben (seine Mutter starb in Auschwitz).",
        difficulty = 4,
        funFact = "Gilbert Adair übersetzte den Roman 1994 ins Englische — ebenfalls ohne ein einziges 'e'. Der Titel der Übersetzung lautet 'A Void'."
    ),

    // Question 9 - Oulipo
    Question(
        categoryId = 10,
        questionText = "Wie viele Sonette enthält Raymond Queneaus 'Cent mille milliards de poèmes' (1961) und wie viele verschiedene Gedichte lassen sich daraus kombinieren?",
        answerA = "10 Sonette, 100 Billionen Kombinationen",
        answerB = "14 Sonette, 14 Milliarden Kombinationen",
        answerC = "100 Sonette, 1 Billion Kombinationen",
        answerD = "7 Sonette, 7 Millionen Kombinationen",
        correctAnswer = 0,
        explanation = "Queneaus Werk besteht aus 10 Sonetten, deren 14 Zeilen jeweils einzeln auf Streifen gedruckt und beliebig austauschbar sind. Da jedes Sonett 14 Zeilen hat und jede Zeile in 10 Varianten vorliegt, ergibt das 10 hoch 14 = 100 Billionen mögliche Sonette — mehr als ein Mensch je lesen könnte.",
        difficulty = 4,
        funFact = "Um alle Kombinationen zu lesen, bräuchte man bei einer Minute pro Gedicht über 190 Millionen Jahre — Queneau berechnete das selbst und war offensichtlich begeistert."
    ),

    // Question 10 - Beat Generation
    Question(
        categoryId = 10,
        questionText = "Auf welcher Schreibmaschinen-Technik beruhte Jack Kerouacs Entstehungslegende von 'On the Road', und wie lange soll das Schreiben gedauert haben?",
        answerA = "Er schrieb auf einer Telexrolle, angeblich in 3 Wochen",
        answerB = "Er diktierte es auf Tonband, Schreiber tippte es in 5 Tagen ab",
        answerC = "Er schrieb es in Notizheften über 7 Jahre",
        answerD = "Er tippte auf Lochkarten und ließ es per Computer zusammensetzen",
        correctAnswer = 1,
        explanation = "Kerouac klebte mehrere Blätter zu einer langen Papierrolle zusammen, um nicht durch Seitenwechsel unterbrochen zu werden, und schrieb 'On the Road' laut Legende in einem Schreibrausch von drei Wochen im April 1951. Das Manuskript war über 36 Meter lang. Veröffentlicht wurde es erst 1957.",
        difficulty = 4,
        funFact = "Das Original-Manuskript auf der Papierrolle wurde 2001 für 2,43 Millionen Dollar verkauft — ein Rekord für ein literarisches Manuskript."
    ),

    // Question 11 - Beat Generation
    Question(
        categoryId = 10,
        questionText = "Allen Ginsbergs Gedicht 'Howl' wurde 1957 Gegenstand eines Obscenity-Prozesses in San Francisco. Wer war der Verleger, der das Gedicht druckte?",
        answerA = "Lawrence Ferlinghetti",
        answerB = "Gregory Corso",
        answerC = "Neal Cassady",
        answerD = "Gary Snyder",
        correctAnswer = 2,
        explanation = "Lawrence Ferlinghetti, Besitzer des City Lights Bookshop in San Francisco, verlegte 'Howl and Other Poems' 1956. Er und sein Geschäftsführer Shigeyoshi Murao wurden 1957 wegen Obscenität verhaftet. Der Freispruch durch Richter Clayton Horn galt als Meilenstein der Pressefreiheit in den USA.",
        difficulty = 4,
        funFact = "Ferlinghetti hatte das Gedicht nach seiner Uraufführung beim 'Six Gallery Reading' am 7. Oktober 1955 sofort gedruckt haben wollen — Ginsberg las es erstmals öffentlich, Kerouac sammelte Geld für Wein ein."
    ),

    // Question 12 - Beat Generation
    Question(
        categoryId = 10,
        questionText = "William S. Burroughs schoss 1951 seine Frau Joan Vollmer bei einem William-Tell-Trick mit Pistole tot. In welchem Land geschah dies?",
        answerA = "USA, Texas",
        answerB = "Kuba",
        answerC = "Tanger, Marokko",
        answerD = "Mexiko",
        correctAnswer = 3,
        explanation = "Der Unfall geschah in Mexiko-Stadt im September 1951. Burroughs schoss seiner Frau beim Versuch, ein Glas von ihrem Kopf zu schießen, in die Stirn. Er floh nach Südamerika, wurde in Abwesenheit wegen Totschlags verurteilt und schrieb später, dieser Vorfall habe ihn zum Schreiben gezwungen — als 'dämonischer Druck'.",
        difficulty = 4,
        funFact = "Burroughs sagte in einem Interview: 'Ich wäre nie Schriftsteller geworden ohne Joan, denn ihr Tod ließ mich bewusst werden, dass ich von einem bösartigen Geist bewohnt werde, der mich zerstören will.'"
    ),

    // Question 13 - Konkrete Poesie
    Question(
        categoryId = 10,
        questionText = "Welches Gedicht Eugen Gomringers gilt als erstes Werk der konkreten Poesie und wurde 1953 veröffentlicht?",
        answerA = "avenidas",
        answerB = "schweigen",
        answerC = "wind",
        answerD = "konstellationen",
        correctAnswer = 0,
        explanation = "Gomringers Gedicht 'avenidas' (1953) gilt als eines der ersten Werke der konkreten Poesie. Es besteht aus dem Wort 'avenidas' (Alleen), 'flores' (Blumen) und 'mujeres' (Frauen) in verschiedenen Konstellationen — ein semantisches Spiel mit minimalen Mitteln. Sein Gedicht 'schweigen' wurde jedoch sein bekanntestes.",
        difficulty = 4,
        funFact = "Gomringers Gedicht 'avenidas' sorgte 2018 für politischen Streit an der Alice-Salomon-Hochschule in Berlin, die es an ihrer Fassade hatte: Es wurde nach Vorwürfen des Sexismus überstrichen."
    ),

    // Question 14 - Konkrete Poesie
    Question(
        categoryId = 10,
        questionText = "Welches Konzept beschreibt Gomringers Begriff 'Konstellation' in der konkreten Poesie?",
        answerA = "Ein Gedicht, das aus Sternbildnamen besteht",
        answerB = "Eine visuelle Anordnung von Wörtern im Raum, die wie Gestirne zueinander stehen",
        answerC = "Ein Gedicht, das vorwärts und rückwärts gelesen werden kann",
        answerD = "Ein mathematisch berechnetes Wortmuster",
        correctAnswer = 1,
        explanation = "Gomringers 'Konstellation' bezeichnet die räumliche Anordnung weniger Wörter auf der weißen Seite, wobei die Abstände und Positionen bedeutungstragend sind — wie Sterne, die durch ihre Konstellation Bedeutung erzeugen. Die Seite ist der Raum, das Wort ist das Grundelement.",
        difficulty = 4,
        funFact = "Gomringer prägte den Begriff unabhängig vom brasilianischen Noigandres-Kollektiv, das zeitgleich ähnliche Konzepte entwickelte. Die Begegnung 1955 gilt als Gründungsmoment der internationalen konkreten Poesiebewegung."
    ),

    // Question 15 - Konkrete Poesie
    Question(
        categoryId = 10,
        questionText = "Welcher österreichische Dichter der konkreten Poesie ist für Texte wie 'schtzngrmm' bekannt, die Sprache als Lautmaterial zerlegen?",
        answerA = "H.C. Artmann",
        answerB = "Ernst Jandl",
        answerC = "Friedrich Achleitner",
        answerD = "Gerhard Rühm",
        correctAnswer = 2,
        explanation = "Ernst Jandl ist der bekannteste Vertreter der Wiener Gruppe und der konkreten Poesie im deutschsprachigen Raum. Sein Gedicht 'schtzngrmm' (1957) imitiert lautmalerisch ein Maschinengewehr — ein antikriegerisches Lautgedicht, das Sprache auf bloßen Klang reduziert.",
        difficulty = 4,
        funFact = "Jandl erfand den Begriff 'Sprechgedicht' für seine lautpoetischen Arbeiten. Bei seinen Lesungen performte er Texte oft mit veränderter Stimme, Rhythmus und körperlichem Einsatz — ein Vorläufer der Spoken-Word-Bewegung."
    ),

    // Question 16 - Futurismus
    Question(
        categoryId = 10,
        questionText = "In welcher Pariser Zeitung erschien am 20. Februar 1909 Marinettis erstes futuristisches Manifest?",
        answerA = "Le Monde",
        answerB = "Le Temps",
        answerC = "L'Humanité",
        answerD = "Le Figaro",
        correctAnswer = 3,
        explanation = "Marinetti veröffentlichte sein 'Gründungsmanifest des Futurismus' am 20. Februar 1909 auf der Titelseite der angesehenen Pariser Zeitung 'Le Figaro'. Diese Wahl war strategisch: Marinetti wollte maximale internationale Aufmerksamkeit, nicht nur ein Nischenkunstpublikum ansprechen.",
        difficulty = 4,
        funFact = "Das Manifest glorifizierte Geschwindigkeit, Maschinen, Gewalt und Krieg als ästhetische Werte und enthielt den berühmten Satz: 'Ein Automobil im Vollgalopp ist schöner als die Nike von Samothrake.'"
    ),

    // Question 17 - Futurismus
    Question(
        categoryId = 10,
        questionText = "Wie nannten die Futuristen ihre literarische Technik, bei der Syntax, Interpunktion und Adjektive vollständig eliminiert wurden?",
        answerA = "Parole in libertà",
        answerB = "Simultaneismo",
        answerC = "Immaginismo",
        answerD = "Straparole",
        correctAnswer = 0,
        explanation = "'Parole in libertà' (Worte in Freiheit) war die futuristische Bezeichnung für eine Schreibweise ohne Syntax, Interpunktion und metrische Struktur. Marinettis 'Zang Tumb Tumb' (1914) ist das bekannteste Beispiel — eine lautmalerische Schilderung der Belagerung von Adrianopel.",
        difficulty = 4,
        funFact = "Marinetti ließ 'Zang Tumb Tumb' in einer speziellen typografischen Gestaltung drucken, bei der die Schriftgröße und -art die Lautstärke und Intensität der Geräusche visuell darstellten — ein Vorläufer der visuellen Poesie."
    ),

    // Question 18 - Futurismus
    Question(
        categoryId = 10,
        questionText = "Zwischen welchen Jahren veröffentlichten die Futuristen laut Forschung exakt 175 Manifeste?",
        answerA = "1905–1935",
        answerB = "1909–1944",
        answerC = "1910–1930",
        answerD = "1909–1920",
        correctAnswer = 1,
        explanation = "Zwischen 1909 und 1944 veröffentlichten Marinetti und die Futurististen exakt 175 Manifeste zu Literatur, Malerei, Skulptur, Architektur, Musik, Film und Politik. Das Manifest wurde zu ihrem bevorzugten Medium — laut, provokativ, programmatisch.",
        difficulty = 4,
        funFact = "Manche Manifeste widmeten sich absurden Themen wie dem 'Manifest der futuristischen Küche' (1930), das Pasta als schwerfällig und nationalistisch ungeeignet verdammte — Mussolini war empört."
    ),

    // Question 19 - Cut-up Technik
    Question(
        categoryId = 10,
        questionText = "Wer erfand die Cut-up-Technik tatsächlich, obwohl sie meist Burroughs zugeschrieben wird?",
        answerA = "Allen Ginsberg",
        answerB = "Gregory Corso",
        answerC = "Brion Gysin",
        answerD = "Paul Bowles",
        correctAnswer = 2,
        explanation = "Brion Gysin, Maler und Schriftsteller, schnitt im Sommer 1959 zufällig Zeitungsartikel in Streifen und entdeckte dabei die Cut-up-Methode. Burroughs erkannte das kreative Potenzial sofort und entwickelte es literarisch weiter — er selbst betonte stets, dass Gysin der Erfinder war.",
        difficulty = 4,
        funFact = "Gysin und Burroughs arbeiteten zusammen im 'Beat Hotel' in Paris, Rue Git-le-Coeur 9 — ein legendäres Billighotel, das Schauplatz zahlreicher avantgardistischer Experimente war."
    ),

    // Question 20 - Cut-up Technik
    Question(
        categoryId = 10,
        questionText = "Welche drei Romane bilden Burroughs' Nova-Trilogie, die vollständig in Cut-up-Technik verfasst wurde?",
        answerA = "Junky, Queer, Naked Lunch",
        answerB = "The Soft Machine, The Ticket That Exploded, Nova Express",
        answerC = "Cities of the Red Night, The Place of Dead Roads, The Western Lands",
        answerD = "Exterminator!, Port of Saints, Blade Runner",
        correctAnswer = 3,
        explanation = "Burroughs' Nova-Trilogie besteht aus 'The Soft Machine' (1961), 'The Ticket That Exploded' (1962) und 'Nova Express' (1964). Diese drei Romane sind vollständig in der Cut-up- und Fold-in-Methode geschrieben und gelten als radikalstes experimentelles Prosawerk der Beat Generation.",
        difficulty = 4,
        funFact = "Die 'Fold-in'-Methode ist eine Variante: Zwei Seiten Text werden in der Mitte gefaltet und nebeneinandergelegt, sodass neue Zeilenverbindungen entstehen. Burroughs nannte es 'die Zukunft lesen'."
    ),

    // Question 21 - Stream of Consciousness
    Question(
        categoryId = 10,
        questionText = "Wer prägte den Begriff 'Stream of Consciousness' ursprünglich — nicht als literarischen, sondern als psychologischen Terminus?",
        answerA = "Sigmund Freud",
        answerB = "William James",
        answerC = "Henri Bergson",
        answerD = "Carl Gustav Jung",
        correctAnswer = 0,
        explanation = "Der Begriff 'Stream of Consciousness' (Bewusstseinsstrom) wurde 1890 vom Psychologen William James in seinem Werk 'The Principles of Psychology' geprägt. Er beschrieb damit den kontinuierlichen Fluss von Gedanken und Wahrnehmungen im Bewusstsein — Schriftsteller adaptierten den Begriff als Bezeichnung für ihre narrative Technik.",
        difficulty = 4,
        funFact = "William James war der Bruder des Schriftstellers Henry James, dessen späte Romane bereits proto-bewusstseinsströmige Techniken verwendeten — ein literarisch-psychologischer Familienkreis."
    ),

    // Question 22 - Stream of Consciousness
    Question(
        categoryId = 10,
        questionText = "Virginia Woolfs Roman 'The Waves' (1931) erzählt sechs Leben von Kindheit bis Alter. Welche besondere formale Struktur hat er?",
        answerA = "Sechs Erzähler wechseln sich kapitelweise ab",
        answerB = "Alle sechs Figuren sprechen in Monologen ohne jeden Erzähler, umrahmt von Naturprosa über Meeresbilder",
        answerC = "Der Roman ist in Versform geschrieben",
        answerD = "Jede Figur hat ein eigenes Kapitel, das rückwärts erzählt wird",
        correctAnswer = 1,
        explanation = "In 'The Waves' sprechen sechs Charaktere (Bernard, Susan, Rhoda, Neville, Jinny, Louis) abwechselnd in Monologen — ohne traditionellen Erzähler, ohne Handlung im konventionellen Sinn. Diese Abschnitte werden von lyrischen Interludien über Meereswellen und Licht unterbrochen, die den Lebensrhythmus symbolisieren.",
        difficulty = 4,
        funFact = "Woolf bezeichnete 'The Waves' als ihr schwierigsten und zugleich geliebtestes Buch. Es gilt als Höhepunkt ihrer experimentellen Prosa und als eines der radikalsten Werke des literarischen Modernismus."
    ),

    // Question 23 - Stream of Consciousness
    Question(
        categoryId = 10,
        questionText = "Wie heißt das letzte, zeichenlose Kapitel in James Joyces 'Ulysses', das aus Molly Blooms innerem Monolog besteht?",
        answerA = "Circe",
        answerB = "Ithaca",
        answerC = "Penelope",
        answerD = "Calypso",
        correctAnswer = 2,
        explanation = "Das 18. und letzte Kapitel des 'Ulysses' heißt 'Penelope' und besteht aus Molly Blooms Bewusstseinsstrom — ohne Satzzeichen, ohne Absätze, in acht langen Sätzen. Es gilt als radikalstes Beispiel des inneren Monologs in der Weltliteratur und endet mit dem dreifachen 'yes'.",
        difficulty = 4,
        funFact = "Das 'Penelope'-Kapitel umfasst etwa 25.000 Wörter und besteht formal aus nur acht Sätzen — Joyce nannte es das 'Weibliche' des Romans, das alle Ambivalenzen und Widersprüche des Lebens enthält."
    ),

    // Question 24 - Lettrismus
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr kam Isidore Isou nach Paris und gründete den Lettrismus?",
        answerA = "1940",
        answerB = "1950",
        answerC = "1943",
        answerD = "1946",
        correctAnswer = 3,
        explanation = "Isidore Isou verließ Rumänien 1945 klandestin und organisierte am 8. Januar 1946 in Paris die erste Lettriste Manifestation. Er hatte das Konzept des Lettrismus bereits in Rumänien entwickelt und trug es in einem Koffer voller Manuskripte mit sich.",
        difficulty = 4,
        funFact = "Isou unterbrach 1946 eine Lesung von Tristan Tzara in Paris und verkündete lautstark die Überlegenheit des Lettrismus über den Dadaismus — ein symbolischer Generationenbruch."
    ),

    // Question 25 - Lettrismus
    Question(
        categoryId = 10,
        questionText = "Was ist der theoretische Kern des Lettrismus nach Isidore Isou?",
        answerA = "Alle Kunst soll auf Mathematik basieren",
        answerB = "Literatur muss zur Malerei werden",
        answerC = "Der einzelne Buchstabe, nicht das Wort oder der Satz, ist die Grundeinheit der Poesie",
        answerD = "Poesie soll ausschließlich aus Stille bestehen",
        correctAnswer = 0,
        explanation = "Isou entwickelte die Theorie, dass die Poesie von der Ebene des Satzes (Klassik) über das Wort (Romantik/Symbolismus) zum einzelnen Buchstaben (Lettre) als Basis-Einheit fortgeschritten sei. Der Lettrismus zerlegt Sprache auf ihre elementarsten Elemente — Buchstaben und Laute — und setzt sie neu zusammen.",
        difficulty = 4,
        funFact = "Isou entwickelte auch 'Hypergraphics' — eine Mischform aus Schriftzeichen, Symbolen und visueller Kunst, die Schreiben und Malen vereint."
    ),

    // Question 26 - Lettrismus
    Question(
        categoryId = 10,
        questionText = "Welche Avantgardebewegung entstand direkt aus dem Lettrismus und prägte später den Begriff 'Détournement'?",
        answerA = "Fluxus",
        answerB = "Situationistische Internationale",
        answerC = "Nouveau Roman",
        answerD = "Groupe COBRA",
        correctAnswer = 1,
        explanation = "Die Situationistische Internationale (gegründet 1957) entstand direkt aus dem Lettrismus — Guy Debord war zunächst Lettriste, bevor er die SI gründete. Das Konzept des 'Détournement' (Umleitung, Verfälschung von Bildern und Texten) wurde vom SI geprägt und beeinflusste Punk, Postmodernismus und die Theorie des Spektakels.",
        difficulty = 4,
        funFact = "Debords berühmtestes Werk 'La Société du spectacle' (1967) basiert auf einer Theorie, die ihre Wurzeln im Lettrismus und in Isous Idee einer totalen Kulturrevolution hat."
    ),

    // Question 27 - Oulipo vertieft
    Question(
        categoryId = 10,
        questionText = "Was ist ein 'Palindrom' im Kontext von Oulipo, und welcher Oulipo-Autor schrieb das berühmte lange französische Palindrom 'Un roc lamina...'?",
        answerA = "Ein Text ohne Vokale — Georges Perec",
        answerB = "Ein Text, der vorwärts und rückwärts identisch ist — Georges Perec",
        answerC = "Ein Text, dessen Zeilen permutiert werden — Raymond Queneau",
        answerD = "Ein Text, der nur aus Präpositionen besteht — Italo Calvino",
        correctAnswer = 2,
        explanation = "Georges Perec schrieb 1969 das längste französische Palindrom mit 1247 Wörtern, beginnend mit 'Un roc lamina le noir Adagio' — ein Text, der buchstabengenau vorwärts wie rückwärts gelesen werden kann. Perec kombinierte diese Extremform mit dem Lipogramm aus 'La Disparition' zu seinen Oulipo-Extremwerken.",
        difficulty = 4,
        funFact = "Perec schrieb auch 'Les Revenentes' (1972) — ein Roman, der nur den Vokal 'e' verwendet (anti-Lipogramm) und damit die Umkehrung von 'La Disparition' darstellt."
    ),

    // Question 28 - Surrealismus vertieft
    Question(
        categoryId = 10,
        questionText = "Was ist das 'cadavre exquis' (exquisite Leiche), das die Surrealisten als kollektive Schreibmethode entwickelten?",
        answerA = "Ein Roman, der vom Tod eines Surrealisten handelt",
        answerB = "Eine Methode, bei der jeder Teilnehmer einen Satz schreibt, ihn faltet und weitergibt, ohne den vorherigen zu sehen",
        answerC = "Ein Gedicht, das aus Grabinschriften zusammengesetzt wird",
        answerD = "Eine Technik, bei der tote Sprachen kombiniert werden",
        correctAnswer = 3,
        explanation = "Der 'cadavre exquis' ist eine surrealistisches Kollektivspiel: Jede Person schreibt einen Teil eines Satzes oder zeichnet einen Teil einer Figur, faltet das Papier so, dass der vorherige Teil verdeckt ist, und gibt es weiter. Der Name stammt aus dem ersten Satz, der so entstand: 'Le cadavre exquis boira le vin nouveau.'",
        difficulty = 4,
        funFact = "Das Cadavre-exquis-Spiel wurde auch in der bildenden Kunst gespielt — Breton, Éluard, Man Ray und andere Surrealisten schufen so gemeinsame Zeichnungen, die heute in Museen hängen."
    ),

    // Question 29 - Futurismus vertieft
    Question(
        categoryId = 10,
        questionText = "Welcher russische Dichter war der Hauptvertreter des Kubo-Futurismus und schrieb das Manifest 'Eine Ohrfeige dem öffentlichen Geschmack' (1912)?",
        answerA = "Wladimir Majakowski",
        answerB = "Osip Mandelstam",
        answerC = "Alexander Blok",
        answerD = "Boris Pasternak",
        correctAnswer = 0,
        explanation = "Wladimir Majakowski war Mitunterzeichner des russischen Kubo-Futuristischen Manifests 'Eine Ohrfeige dem öffentlichen Geschmack' (1912), das forderte, Puschkin, Dostojewski und Tolstoi 'vom Dampfer der Modernität zu werfen'. Der russische Futurismus entwickelte sich unabhängig vom italienischen und war politisch revolutionärer.",
        difficulty = 4,
        funFact = "Majakowski schoss sich 1930 eine Kugel in die Brust — sein Abschiedsgedicht enthielt den Satz: 'Der Liebesboot ist am Alltag zerschellt.' Stalin erklärte ihn posthum zum 'besten und talentiertesten Dichter der Sowjetepoche'."
    ),

    // Question 30 - Nouveau Roman
    Question(
        categoryId = 10,
        questionText = "Alain Robbe-Grillet gilt als theoretischer Kopf des Nouveau Roman. Welches Manifest begründete 1963 diese Bewegung des 'neuen Romans'?",
        answerA = "La Jalousie",
        answerB = "Pour un nouveau roman",
        answerC = "Le Voyeur",
        answerD = "Les Gommes",
        correctAnswer = 1,
        explanation = "'Pour un nouveau roman' (1963) ist Robbe-Grillets theoretische Schrift, die den Nouveau Roman programmatisch begründete: Ablehnung von Psychologie, Handlung, Chronologie und auktorialem Erzähler zugunsten einer objektiven, deskriptiven Prosa, die Dinge beschreibt ohne Metaphern oder menschliche Bedeutungszuschreibung.",
        difficulty = 4,
        funFact = "Robbe-Grillets eigene Romane wie 'La Jalousie' (1957) beschreiben Eifersuchtsszenen mit der kühlen Präzision eines Überwachungsrapports — kein Innenleben, nur äußere Wahrnehmung."
    ),

    // Question 31 - Nouveau Roman
    Question(
        categoryId = 10,
        questionText = "Welche Autorin des Nouveau Roman schrieb den Roman 'Moderato Cantabile' (1958) und gewann später den Nobelpreis für Literatur?",
        answerA = "Nathalie Sarraute",
        answerB = "Marguerite Yourcenar",
        answerC = "Marguerite Duras",
        answerD = "Simone de Beauvoir",
        correctAnswer = 2,
        explanation = "Marguerite Duras, assoziiert mit dem Nouveau Roman, schrieb 'Moderato Cantabile' (1958) — einen minimalistischen Roman über Begehren, der kaum Handlung hat, aber durch Rhythmus und Wiederholung eine hypnotische Wirkung erzeugt. Sie erhielt 1984 den Prix Goncourt für 'L'Amant'.",
        difficulty = 4,
        funFact = "Duras verfasste auch das Drehbuch zu Alain Resnais' 'Hiroshima mon amour' (1959) — eines der wichtigsten Werke des modernen Kinos, das Zeit, Erinnerung und Vergessen thematisiert."
    ),

    // Question 32 - Wiener Gruppe
    Question(
        categoryId = 10,
        questionText = "Welche österreichische Avantgardegruppe der 1950er Jahre vereinte H.C. Artmann, Konrad Bayer, Gerhard Rühm und Friedrich Achleitner?",
        answerA = "Gruppe 47",
        answerB = "Wiener Aktionismus",
        answerC = "Forum Stadtpark",
        answerD = "Wiener Gruppe",
        correctAnswer = 3,
        explanation = "Die Wiener Gruppe (ca. 1952–1964) war eine lose Vereinigung österreichischer Avantgardisten, die mit Dialektpoesie, Lautgedichten, konkreter Poesie und experimentellem Theater experimentierten. Konrad Bayer beging 1964 Suizid — sein Roman 'Der Kopf des Vitus Bering' gilt als Meisterwerk des experimentellen Schreibens.",
        difficulty = 4,
        funFact = "H.C. Artmann schrieb 1958 'med ana schwoazzn dintn' — ein Gedichtband in Wiener Dialekt, der die Mundart als literarisches Medium ernst nahm und zum Kultbuch wurde."
    ),

    // Question 33 - Fluxus
    Question(
        categoryId = 10,
        questionText = "Welcher Künstler und Theoretiker gründete 1961 die Fluxus-Bewegung, die Performances, Alltagsobjekte und Zufallsprozesse als Kunst etablierte?",
        answerA = "Joseph Beuys",
        answerB = "George Maciunas",
        answerC = "Nam June Paik",
        answerD = "John Cage",
        correctAnswer = 0,
        explanation = "George Maciunas, ein litauisch-amerikanischer Künstler, organisierte 1961 die erste Fluxus-Veranstaltung und prägte den Begriff. Fluxus verstand sich als Gegenentwurf zu kommerzieller Kunst — Performances, Zufallskomposition, Alltagsdinge als Kunstobjekte und das Verwischen der Grenzen zwischen Kunst und Leben.",
        difficulty = 4,
        funFact = "John Cage war zwar kein offizielles Fluxus-Mitglied, aber sein Konzept des Zufalls und der Stille ('4'33\"') war entscheidend für Fluxus — Cage lehrte an der New School, wo sich viele spätere Fluxus-Künstler trafen."
    ),

    // Question 34 - Fluxus
    Question(
        categoryId = 10,
        questionText = "Yoko Onos 'Instruction Poems' aus ihrem Buch 'Grapefruit' (1964) gelten als wichtige Fluxus-Werke. Was beschreiben diese Gedichte?",
        answerA = "Rezepte für Kunstobjekte",
        answerB = "Anweisungen für mentale oder physische Handlungen, die zur Kunst werden",
        answerC = "Politische Manifeste in Gedichtform",
        answerD = "Autobiografische Erinnerungen in Haiku-Form",
        correctAnswer = 1,
        explanation = "'Grapefruit' enthält kurze Anweisungsgedichte wie 'Verbrennen Sie dieses Buch nach der Lektüre' oder 'Stellen Sie sich vor, die Wölkchen in Ihrem Körper bewegen sich langsam aufwärts'. Die Handlung selbst — ob ausgeführt oder nur vorgestellt — ist das Kunstwerk. Concept Art avant la lettre.",
        difficulty = 4,
        funFact = "John Lennon kaufte 1966 ein Exemplar von 'Grapefruit' und beschrieb es als ausschlaggebend für seine Beziehung zu Yoko Ono — die Instruction Poems faszinier ihn."
    ),

    // Question 35 - Postmoderne Literatur
    Question(
        categoryId = 10,
        questionText = "Thomas Pynchons Romandebüt 'V.' (1963) gilt als Schlüsselwerk der postmodernen Literatur. Welche narrative Technik steht dabei im Mittelpunkt?",
        answerA = "Lineares Erzählen aus der Ich-Perspektive",
        answerB = "Magischer Realismus nach südamerikanischem Vorbild",
        answerC = "Paranoia, Entropie und das Verschwinden von Bedeutung in einer überkomplexen Welt",
        answerD = "Stream of Consciousness nach Woolf-Methode",
        correctAnswer = 2,
        explanation = "Pynchons 'V.' (1963) ist charakteristisch für sein Werk: verzweigte Handlungsstränge, Paranoia als Erkenntnismodus, Entropie als Weltprinzip und das Verschwinden stabiler Bedeutung in einer systemisch vernetzten Welt. Der Protagonist Benny Profane und Herbert Stencil suchen beide vergeblich nach Ordnung in einer chaotischen Realität.",
        difficulty = 4,
        funFact = "Pynchon ist so zurückgezogen, dass kaum Fotos von ihm als Erwachsenem existieren. Er erschien nie zur Verleihung des National Book Award für 'V.' und schickte eine Komikerin als Vertretung."
    ),

    // Question 36 - Postmoderne Literatur
    Question(
        categoryId = 10,
        questionText = "John Barths Essay 'The Literature of Exhaustion' (1967) prägte die Diskussion um postmoderne Metafiktion. Was beschreibt er damit?",
        answerA = "Literatur, die erschöpfte Leser heilen soll",
        answerB = "Die Erschöpfung aller narrativen Möglichkeiten und den kreativen Umgang damit durch Selbstreflexion",
        answerC = "Literatur, die aus Erschöpfungszuständen des Autors entsteht",
        answerD = "Das Ende der amerikanischen Romanliteratur nach dem Zweiten Weltkrieg",
        correctAnswer = 3,
        explanation = "Barth argumentierte, dass die literarischen Formen erschöpft seien — alle Plots, Strukturen, Erzählweisen bereits verbraucht. Die Lösung ist Metafiktion: Literatur, die ihre eigene Erschöpfung thematisiert, sich selbst als Konstrukt offenbart und darin neue Möglichkeiten findet. Borges' Werk war Barths Hauptreferenz.",
        difficulty = 4,
        funFact = "Barths Gegenstück dazu ist sein Essay 'The Literature of Replenishment' (1980), in dem er die Metafiktion als neue Erschöpfung sah und eine Rückkehr zur Lesbarkeit forderte."
    ),

    // Question 37 - Sprachexperiment Deutschland
    Question(
        categoryId = 10,
        questionText = "Arno Schmidts Roman 'Zettel's Traum' (1970) gilt als radikalstes Sprachexperiment der deutschen Nachkriegsliteratur. Welches formale Merkmal macht ihn einzigartig?",
        answerA = "Er ist vollständig in Versform geschrieben",
        answerB = "Er besteht aus drei parallelen Textspalten auf übergroßen Faksimile-Seiten",
        answerC = "Er hat kein einziges Satzzeichen",
        answerD = "Er besteht nur aus Zitaten anderer Autoren",
        correctAnswer = 0,
        explanation = "Arno Schmidts 'Zettel's Traum' (1970) ist auf überformatigen Fotokopieseiten gedruckt und in drei Spalten aufgeteilt: links Handlung, mittig Poe-Analysen, rechts etymologische 'Etym'-Exkurse, die nach Freudscher Sexualsymbolik vorgehen. Das Werk umfasst 1334 Seiten und gilt als der schwierigste deutsche Roman des 20. Jahrhunderts.",
        difficulty = 4,
        funFact = "Der Erstdruck von 'Zettel's Traum' wog 8 Kilogramm und kostete mehr als ein Monatsgehalt. Schmidt arbeitete zehn Jahre daran und starb 1979 — überzeugt, missverstanden zu werden."
    ),

    // Question 38 - Sprachexperiment Deutschland
    Question(
        categoryId = 10,
        questionText = "Peter Handkes 'Publikumsbeschimpfung' (1966) ist ein Theaterstück ohne Handlung. Was passiert darin?",
        answerA = "Schauspieler spielen die Geschichte der Avantgarde nach",
        answerB = "Das Publikum wird stumm beobachtet",
        answerC = "Vier Sprecher beschimpfen und analysieren das Publikum — die Sprache selbst ist das Ereignis",
        answerD = "Ein einzelner Monolog über Sprachlosigkeit wird geflüstert",
        correctAnswer = 2,
        explanation = "In Handkes 'Publikumsbeschimpfung' treten vier namenlose Sprecher auf und sprechen das Publikum direkt an — sie beschreiben, was Theater nicht ist, was das Publikum tut, und beleidigen es schließlich. Das Stück hatte keine Handlung, keine Figuren, keine Geschichte — nur Sprache als theatrales Ereignis.",
        difficulty = 4,
        funFact = "Die Uraufführung 1966 in Frankfurt (Regie: Claus Peymann) war ein Skandal: Das Publikum wusste nicht, wie es reagieren sollte — lachen, wüten oder klatschen. Handke wurde über Nacht berühmt."
    ),

    // Question 39 - Experimentelle Lyrik
    Question(
        categoryId = 10,
        questionText = "Was ist ein 'Acrostic' (Akrostichon) als literarische Technik, die von Oulipo und anderen Experimentalisten verwendet wird?",
        answerA = "Ein Gedicht, das nur aus Verben besteht",
        answerB = "Ein Text, bei dem die Anfangsbuchstaben der Zeilen ein verstecktes Wort oder einen Satz ergeben",
        answerC = "Ein Gedicht, das in einer Spirale gelesen wird",
        answerD = "Ein Text ohne wiederholende Buchstaben",
        correctAnswer = 1,
        explanation = "Ein Akrostichon ist ein Text, bei dem die Anfangsbuchstaben (oder Endbuchstaben) der Zeilen ein verstecktes Wort, einen Namen oder Satz ergeben. Oulipo verwendete Akrostichen als formale Constraint — Georges Perec verbarg in 'La Vie mode d'emploi' mehrere versteckte Strukturen, darunter Akrostichen.",
        difficulty = 4,
        funFact = "Perecs 'La Vie mode d'emploi' (Das Leben: Gebrauchsanweisung, 1978) enthält eine hidden Liste aller 42 Regeln (Contraintes), nach denen er den Roman schrieb — als doppeltes Akrostichon in den Kapiteltiteln versteckt."
    ),

    // Question 40 - Experimentelle Prosa
    Question(
        categoryId = 10,
        questionText = "Raymond Federmans Roman 'Double or Nothing' (1971) gilt als radikales Beispiel des 'Surfiction'. Was meint dieser Begriff?",
        answerA = "Literatur, die Science-Fiction und Realismus kombiniert",
        answerB = "Literatur, die über ihre eigene Entstehung nachdenkt und den Schreibprozess explizit zeigt",
        answerC = "Literatur aus Surferkulturen der 1960er",
        answerD = "Literatur, die ohne Plan geschrieben wird",
        correctAnswer = 3,
        explanation = "Federman prägte den Begriff 'Surfiction' für Literatur, die explizit zeigt, wie sie entsteht — der Schreibprozess, Durchstreichungen, Korrekturen und Selbstkommentare werden Teil des Textes. 'Double or Nothing' zeigt buchstäblich Schreibmaschinen-Tippversuche und Korrekturen auf der Seite.",
        difficulty = 4,
        funFact = "Federman, ein Holocaust-Überlebender, schrieb nie direkt über seine Erfahrungen — stattdessen versteckte er autobiografische Elemente in experimentellen Formen, die das Sagbare umkreisen."
    ),

    // Question 41 - Konkrete Poesie International
    Question(
        categoryId = 10,
        questionText = "Die brasilianische Noigandres-Gruppe, die parallel zu Gomringer konkrete Poesie entwickelte, bestand aus welchen drei Dichtern?",
        answerA = "Augusto de Campos, Haroldo de Campos, Décio Pignatari",
        answerB = "João Cabral de Melo Neto, Carlos Drummond, Ferreira Gullar",
        answerC = "Oswald de Andrade, Mário de Andrade, Manuel Bandeira",
        answerD = "Paulo Leminski, Ana Cristina César, Torquato Neto",
        correctAnswer = 0,
        explanation = "Die Noigandres-Gruppe bestand aus den Brüdern Augusto und Haroldo de Campos sowie Décio Pignatari. Sie gründeten 1952 die Zeitschrift 'Noigandres' (ein okzitanisches Wort aus Ezra Pounds Cantos) und entwickelten eine theoretisch fundierte konkrete Poesie, die internationale Beachtung fand.",
        difficulty = 4,
        funFact = "Haroldo de Campos übersetzte u.a. Goethes 'Faust', Homers 'Ilias', die Bibel und Mayakovsky ins Portugiesische — alles in experimentellen Formen. Er nannte seine Übersetzungsmethode 'Transcriação' (Transschöpfung)."
    ),

    // Question 42 - Oulipo Methoden
    Question(
        categoryId = 10,
        questionText = "Was ist die 'N+7'-Methode (auch S+7 genannt), eine der bekanntesten Oulipo-Techniken?",
        answerA = "Jeden siebten Buchstaben eines Textes löschen",
        answerB = "Jedes Substantiv durch das siebte nachfolgende Substantiv im Wörterbuch ersetzen",
        answerC = "Einen Text sieben Mal umschreiben mit steigender Komplexität",
        answerD = "Jede Zeile eines Gedichts um sieben Silben kürzen",
        correctAnswer = 1,
        explanation = "Bei der N+7-Methode (entwickelt von Jean Lescure) ersetzt man jedes Substantiv eines Textes durch das siebte Substantiv, das im Wörterbuch danach folgt. So entsteht aus bekannten Texten ein absurdes, manchmal überraschend sinnvolles Doppelgänger-Werk. Je nach Wörterbuch variiert das Ergebnis.",
        difficulty = 4,
        funFact = "Wendet man N+7 auf den Beginn von Genesis an — 'Am Anfang schuf Gott...' — entstehen je nach Wörterbuch absurde theologische Varianten, die die Zufälligkeit von Bedeutung demonstrieren."
    ),

    // Question 43 - Lettrismus vertieft
    Question(
        categoryId = 10,
        questionText = "François Dufrênes 'Crirhythmes' sind eine Weiterentwicklung des Lettrismus. Was sind sie?",
        answerA = "Visuelle Collagen aus Buchstabentrümmern",
        answerB = "Improvisierende Lautpoesie, die ausschließlich mit menschlicher Stimme ohne Worte aufgeführt wird",
        answerC = "Rhythmische Manifeste in metrischer Form",
        answerD = "Handschriftliche Spiraltexte ohne lesbare Buchstaben",
        correctAnswer = 1,
        explanation = "François Dufrênes 'Crirhythmes' sind aufgeführte Lautimprovisationen — reine Stimmkunst ohne Worte, nur mit Zischlauten, Glucksen, Klickern und rhythmischen Körperlauten. Dufrêne nahm sie ab 1956 auf Tonband auf und war damit ein Pionier der Lautpoesie und Sound Poetry.",
        difficulty = 4,
        funFact = "Dufrênes Crirhythmes wurden erst Jahrzehnte nach seiner Zeit vollständig anerkannt — heute gelten sie als Schlüsselwerke der Sound Poetry, die Punk-Vocals, Beatboxing und experimentellen Gesang beeinflussten."
    ),

    // Question 44 - Beatnik-Philosophie
    Question(
        categoryId = 10,
        questionText = "Was bedeutete der Begriff 'Beat' für Jack Kerouac, der ihn ursprünglich prägte — im Gegensatz zur späteren popkulturellen Verwendung?",
        answerA = "Rhythmus der Jazzmusik",
        answerB = "Erschöpft und am Boden, aber auch erleuchtet im religiösen Sinn (beatific)",
        answerC = "Rebellion gegen die Gesellschaft",
        answerD = "Das Schlagen des Herzens als Lebenszeichen",
        correctAnswer = 3,
        explanation = "Kerouac betonte stets, dass 'Beat' sowohl 'erschöpft, niedergeschlagen' als auch 'beatific' (selig, erleuchtet) bedeute — eine doppelte Bedeutung, die die spirituelle Suche der Generation ausdrücke. Er war empört, als der Begriff zu 'Beatnik' verniedlicht und kommerzialisiert wurde.",
        difficulty = 4,
        funFact = "Den Begriff 'Beatnik' prägte der Kolumnist Herb Caen 1958 als Anspielung auf den Sputnik-Satelliten — als würden die Beats ebenso wie der Sputnik im luftleeren Raum kreisen. Kerouac hasste den Begriff."
    ),

    // Question 45 - Sprachskepsis Österreich
    Question(
        categoryId = 10,
        questionText = "Hugo von Hofmannsthals 'Ein Brief' (1902), bekannt als 'Chandos-Brief', ist ein Schlüsseltext der Sprachkrise der Moderne. Was beschreibt der fiktive Lord Chandos?",
        answerA = "Seine Freude am poetischen Schreiben",
        answerB = "Den Verlust der Fähigkeit, die Welt in Begriffe zu fassen — Sprache zerfällt ihm in bedeutungslose Laute",
        answerC = "Die Unmöglichkeit, Lyrik für das Volk zu schreiben",
        answerD = "Seine Bekehrung zur Mystik",
        correctAnswer = 0,
        explanation = "Der fiktive Lord Chandos schreibt an Francis Bacon, er habe aufgehört zu schreiben, weil ihm die Sprache auseinandergefallen sei — abstrakte Begriffe wie 'Geist', 'Seele', 'Körper' hätten jede Bedeutung verloren. Nur noch konkrete, momentane Erfahrungen gebe es. Dieser Text gilt als erste literarische Formulierung der Sprachkrise der Moderne.",
        difficulty = 4,
        funFact = "Hofmannsthals 'Chandos-Brief' erschien 1902, als er 28 Jahre alt war, und beendete seine Lyrikproduktion faktisch. Er wandte sich danach dem Libretto zu — u.a. für Richard Strauss."
    ),

    // Question 46 - Écriture féminine
    Question(
        categoryId = 10,
        questionText = "Hélène Cixous prägte 1975 den Begriff 'écriture féminine'. Was bezeichnet er?",
        answerA = "Literatur, die ausschließlich von Frauen gelesen werden sollte",
        answerB = "Eine Art zu schreiben, die den weiblichen Körper und das Unbewusste in die Sprache einlässt und patriarchale Sprachstrukturen untergräbt",
        answerC = "Feministisches Manifesto-Schreiben nach dem Vorbild des Surrealismus",
        answerD = "Tagebuchliteratur von Frauen des 19. Jahrhunderts",
        correctAnswer = 1,
        explanation = "Cixous' Konzept der 'écriture féminine', formuliert im Essay 'Das Lachen der Medusa' (1975), bezeichnet eine Schreibweise, die den Körper, das Begehren und das weiblich Unbewusste in die Sprache einschreibt — als Gegenentwurf zur phallozentrischen Logik des abendländischen Schreibens.",
        difficulty = 4,
        funFact = "Cixous betonte, écriture féminine sei keine biologische Kategorie — auch Männer könnten so schreiben (sie nannte Jean Genet als Beispiel). Es ist eine Haltung zur Sprache, keine Frage des Geschlechts."
    ),

    // Question 47 - Experimenteller Roman
    Question(
        categoryId = 10,
        questionText = "B.S. Johnsons Roman 'The Unfortunates' (1969) gilt als radikalstes Beispiel eines Buchexperiments in England. Was ist sein formales Merkmal?",
        answerA = "Er besteht aus leeren Seiten mit Wörtern an den Rändern",
        answerB = "Er hat Löcher in die Seiten gestanzt, durch die andere Seiten sichtbar werden",
        answerC = "Er ist in 27 ungebundene Hefte aufgeteilt, die in beliebiger Reihenfolge gelesen werden",
        answerD = "Jedes Kapitel ist auf andersfarbigem Papier gedruckt",
        correctAnswer = 2,
        explanation = "'The Unfortunates' von B.S. Johnson besteht aus 27 einzelnen Heften in einer Schachtel — nur das erste und letzte Heft sind festgelegt, die 25 mittleren können in beliebiger Reihenfolge gelesen werden. Das Buch handelt vom Gedächtnis, und die zufällige Reihenfolge spiegelt die nicht-lineare Natur der Erinnerung.",
        difficulty = 4,
        funFact = "Johnson bestand darauf, dass Romane lügen — nur die Wahrheit des eigenen Lebens sei erzählenswert. Er beging 1973 im Alter von 40 Jahren Suizid. Sein Werk wurde jahrzehntelang ignoriert und erlebt seit den 2000ern eine Wiederentdeckung."
    ),

    // Question 48 - Sprachexperiment International
    Question(
        categoryId = 10,
        questionText = "Milorad Pavić schrieb 1984 den Roman 'Das Chasarische Wörterbuch' als 'Lexikon in 100.000 Wörtern'. Was ist das radikale formale Merkmal?",
        answerA = "Er kann nur rückwärts gelesen werden",
        answerB = "Er besteht aus drei verschiedenen Versionen für drei Religionen",
        answerC = "Er erschien gleichzeitig in 17 Sprachen und ist sprachlos",
        answerD = "Er ist als enzyklopädisches Wörterbuch strukturiert, das in beliebiger Reihenfolge gelesen werden kann, und existiert in zwei Versionen mit einem Widerspruch",
        correctAnswer = 3,
        explanation = "Pavićs 'Das Chasarische Wörterbuch' ist als Lexikon aufgebaut — christliche, islamische und jüdische Quellen zu einem untergegangenen Volk. Es erschien in zwei Versionen ('männlich' und 'weiblich'), die sich in einer einzigen Passage unterscheiden. Der Roman kann in jeder Reihenfolge gelesen werden.",
        difficulty = 4,
        funFact = "Pavić wird oft als Begründer der 'interaktiven Literatur' bezeichnet — vor dem Internet entwarf er ein Buch, das der Leser selbst konstruiert. Umberto Eco nannte ihn einen 'digitalen Vorläufer'."
    ),

    // Question 49 - Theoretischer Kontext
    Question(
        categoryId = 10,
        questionText = "Roland Barthes' einflussreicher Essay 'Der Tod des Autors' (1967) hat direkte Auswirkungen auf experimentelle Literatur. Was proklamiert er?",
        answerA = "Autoren sollen anonym bleiben",
        answerB = "Literaturkritik ist wichtiger als die Werke selbst",
        answerC = "Die Bedeutung eines Textes entsteht beim Leser, nicht beim Autor — der Autor als Instanz ist irrelevant",
        answerD = "Literatur ist tot und muss durch andere Kunstformen ersetzt werden",
        correctAnswer = 0,
        explanation = "Barthes argumentierte, dass die Bedeutung eines Textes nicht durch die Absichten des Autors bestimmt wird, sondern im Moment des Lesens entsteht. Das Konzept der Autorität des Autors ('Auktorialität') ist eine ideologische Konstruktion. Diese Theorie legitimierte experimentelle Texte, die bewusst auf den Autor als sinnstiftendes Zentrum verzichten.",
        difficulty = 4,
        funFact = "Barthes' Essay erschien im selben Jahr wie Foucaults 'Was ist ein Autor?' — beide Texte zusammen begründeten die poststrukturalistische Literaturtheorie und veränderten die Interpretation experimenteller Texte radikal."
    ),

    // Question 50 - Dadaismus International
    Question(
        categoryId = 10,
        questionText = "Richard Huelsenbeck brachte den Dadaismus 1917 nach Berlin. Was unterschied den Berliner Dada vom Züricher Dada?",
        answerA = "Berlin bevorzugte Lautgedichte, Zürich politisches Theater",
        answerB = "Berliner Dada war explizit politisch und antikapitalistisch, Züricher Dada war unpolitisch-ästhetisch",
        answerC = "Berlin arbeitete mit Musik, Zürich mit bildender Kunst",
        answerD = "Es gab keine Unterschiede — beide waren identisch",
        correctAnswer = 1,
        explanation = "Der Berliner Dada (Huelsenbeck, George Grosz, John Heartfield, Hannah Höch) war explizit politisch, kommunistisch ausgerichtet und nutzte Fotomontage und Collage zur Gesellschaftskritik. Der Züricher Dada um Ball und Tzara war eher ästhetisch-philosophisch und apolitisch — eine fundamentale Spaltung der Bewegung.",
        difficulty = 4,
        funFact = "Hannah Höch schuf 1919 die Fotomontage 'Schnitt mit dem Küchenmesser Dada durch die letzte Weimarer Bierbuchkulturepoche Deutschlands' — ein meterhohes Werk, das als Ikone politischer Dada-Kunst gilt."
    )
)
