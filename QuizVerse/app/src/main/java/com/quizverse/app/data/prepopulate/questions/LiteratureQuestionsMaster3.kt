package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun literatureQuestionsMaster3(): List<Question> = listOf(

    // --- Shakespeare-Autorschaftsdebatte ---

    // Question 1 — correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welcher Earl of Oxford wird in der sogenannten Oxfordian-Theorie als eigentlicher Verfasser der Shakespeare-Werke gehandelt?",
        answerA = "Edward de Vere, 17. Earl of Oxford",
        answerB = "Robert Dudley, 1. Earl of Leicester",
        answerC = "Henry Wriothesley, 3. Earl of Southampton",
        answerD = "Philip Herbert, 4. Earl of Pembroke",
        correctAnswer = 0,
        explanation = "Edward de Vere (1550–1604) ist der prominenteste alternative Kandidat zur Shakespeare-Autorschaft. Vertreter dieser These betonen seine literarische Bildung, Reisen nach Italien und Kenntnis des Hoflebens. Hauptproblem: De Vere starb 1604, bevor die Spätwerke wie 'Der Sturm' entstanden.",
        difficulty = 5,
        funFact = "Berühmte Oxfordianer waren Sigmund Freud und der Schauspieler Orson Welles. Freud schrieb kurz vor seinem Tod, er könne nicht mehr glauben, dass der Mann aus Stratford die Werke verfasst habe."
    ),

    // Question 2 — correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welcher elisabethanische Dramatiker wird in der Marlowe-Theorie als tatsächlicher Autor der Shakespeare-Werke bezeichnet — obwohl er offiziell 1593 starb?",
        answerA = "Ben Jonson",
        answerB = "Christopher Marlowe",
        answerC = "Thomas Kyd",
        answerD = "John Lyly",
        correctAnswer = 1,
        explanation = "Anhänger der Marlowe-Theorie glauben, Marlowe habe seinen Tod in einer Kneipenschlägerei in Deptford fingiert, um einer Verhaftung wegen Ketzerei zu entgehen, und unter dem Namen Shakespeare weitergeschrieben. Als Beleg dienen stilistische Ähnlichkeiten in den Frühwerken.",
        difficulty = 5,
        funFact = "Das angebliche Mordopfer in Deptford war ein gewisser Ingram Frizer, der im Dienst von Francis Walsingham stand — was Verschwörungstheoretiker als Hinweis auf eine staatlich inszenierte Flucht deuten."
    ),

    // Question 3 — correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welches Dokument aus dem Jahr 1623 gilt als zentrales Zeugnis für die Autorschaft Shakespeares und wurde von seinen Schauspielkollegen Heminges und Condell herausgegeben?",
        answerA = "Das Quarto von Hamlet (1603)",
        answerB = "Die Sonnette-Ausgabe (1609)",
        answerC = "Das First Folio",
        answerD = "Die Registrierung in den Stationers' Registers",
        correctAnswer = 2,
        explanation = "Das First Folio von 1623 versammelte 36 Theaterstücke und enthält ein Vorwort von John Heminges und Henry Condell, die Shakespeare persönlich kannten. Für Stratfordianer ist dies der wichtigste zeitgenössische Beweis für die Autorschaft des Mannes aus Stratford-upon-Avon.",
        difficulty = 5,
        funFact = "Vom First Folio sind heute noch etwa 235 Exemplare bekannt. Im Jahr 2001 wurde eines für fast 7 Millionen Dollar versteigert — eines der teuersten Bücher, die je gehandelt wurden."
    ),

    // Question 4 — correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche Theorie besagt, dass Francis Bacon geheime Botschaften (sogenannte 'Baconian ciphers') in die Shakespeare-Texte eincodiert habe, um seine Autorschaft zu beweisen?",
        answerA = "Die Bi-Literal-Cipher-Theorie von John Dee",
        answerB = "Die Steganographie-These von Anthony Bacon",
        answerC = "Die Kryptogramm-Hypothese von Samuel Morse",
        answerD = "Die Bi-Literal-Cipher-Theorie von Ignatius Donnelly",
        correctAnswer = 3,
        explanation = "Ignatius Donnelly veröffentlichte 1888 'The Great Cryptogram', worin er behauptete, Bacon habe mit seiner 'Bi-Literal Cipher' (einem binären Alphabet-Code) Botschaften in die Shakespeare-Drucke eingebettet. Die Wissenschaft wies diese Theorie als methodisch unhaltbar zurück.",
        difficulty = 5,
        funFact = "Donnelly war zugleich der Autor von 'Atlantis: The Antediluvian World' (1882), dem Buch, das die moderne Atlantis-Mythologie begründete. Er hatte eine Vorliebe für monumentale Verschwörungsthesen."
    ),

    // --- Homerische Frage ---

    // Question 5 — correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welcher Philologe legte 1795 mit seinen 'Prolegomena ad Homerum' den Grundstein für die wissenschaftliche Homerische Frage, indem er die Einheit der Ilias bestritt?",
        answerA = "Friedrich August Wolf",
        answerB = "Karl Lachmann",
        answerC = "Johann Gottfried Herder",
        answerD = "Gottfried Hermann",
        correctAnswer = 0,
        explanation = "Friedrich August Wolf argumentierte in den 'Prolegomena ad Homerum', die Ilias und Odyssee seien keine Werke eines einzigen Dichters, sondern Sammlungen mündlich überlieferter Einzelgesänge, die erst später schriftlich fixiert und redigiert wurden.",
        difficulty = 5,
        funFact = "Goethe war von Wolfs Prolegomena zutiefst irritiert: Er wollte nicht wahrhaben, dass Homer nicht existiert habe, und schrieb: 'Wenn Homer ein Traum war, so träume ich weiter.'"
    ),

    // Question 6 — correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welcher Begriff bezeichnet die philologische Gesamtheit der Fragen um Autorschaft, Einheit und Entstehungsweise der homerischen Epen?",
        answerA = "Homeridenfrage",
        answerB = "Homerische Frage",
        answerC = "Epische Kontroverse",
        answerD = "Aoidenproblem",
        correctAnswer = 1,
        explanation = "Die 'Homerische Frage' umfasst drei Kernprobleme: War Homer eine historische Person? Stammen Ilias und Odyssee von einem Autor? Entstanden sie aus einem Guss oder durch schrittweise Redaktion mündlicher Überlieferungen? Seit Wolf (1795) ist sie ein zentrales Thema der Altertumswissenschaft.",
        difficulty = 5,
        funFact = "Die 'Unitarier' (ein Autor) und die 'Analytiker' (mehrere Autoren/Redaktoren) stritten sich bis ins 20. Jahrhundert. Heute überwiegt die Ansicht, dass Ilias und Odyssee von verschiedenen Autoren stammen."
    ),

    // Question 7 — correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welche Forschungsrichtung, entwickelt von Milman Parry und Albert Lord, erklärt die Entstehung homerischer Epen durch improvisierte mündliche Dichtung mit festen Formeln?",
        answerA = "Kompositionsanalyse",
        answerB = "Quellenforschung (Quellentheorie)",
        answerC = "Oral-Formulaic Theory (Mündliche Formulardichtung)",
        answerD = "Redaktionskritik",
        correctAnswer = 2,
        explanation = "Milman Parry zeigte in den 1930er Jahren anhand lebendiger südslawischer Barden, dass Epen durch mündliche Improvisation mit festen metrischen Formeln entstehen. Dies erklärt die Wiederholungen in Homer (z. B. 'die rosenfingerige Eos') als Werkzeuge des Sängers.",
        difficulty = 5,
        funFact = "Parry starb 1935 mit 33 Jahren unter ungeklärten Umständen durch eine Schusswunde. Sein Schüler Albert Lord vollendete die Theorie und veröffentlichte 1960 das Hauptwerk 'The Singer of Tales'."
    ),

    // --- Kafka und das Testament ---

    // Question 8 — correct: D (3)
    Question(
        categoryId = 10,
        questionText = "An wen adressierte Franz Kafka seine testamentarischen Verfügungen, in denen er die Vernichtung aller seiner unveröffentlichten Manuskripte forderte?",
        answerA = "Seine Schwester Ottla Kafka",
        answerB = "Seinen Verleger Kurt Wolff",
        answerC = "Seine Verlobte Felice Bauer",
        answerD = "Seinen Freund Max Brod",
        correctAnswer = 3,
        explanation = "Kafka hinterließ zwei formlose Briefe an Max Brod mit der Bitte, alle Tagebücher, Manuskripte und Briefe zu verbrennen. Brod, der Kafka bereits zu Lebzeiten von der Vernichtungsabsicht in Kenntnis gesetzt hatte, widersetzte sich und rettete damit Weltliteratur.",
        difficulty = 5,
        funFact = "Max Brod floh 1939 im letzten Zug aus Prag nach Palästina — mit Kafkas Manuskripten im Gepäck. Nach Brods Tod 2016 entbrannte ein jahrelanger Erbschaftsstreit zwischen Israel und Deutschland um den Nachlass."
    ),

    // Question 9 — correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welches der drei großen Kafka-Romane blieb unvollendet und sollte laut Kafka mit dem Tod des Protagonisten im Steinbruch enden — wie Brod überlieferte?",
        answerA = "Der Process",
        answerB = "Das Schloss",
        answerC = "Amerika (Der Verschollene)",
        answerD = "In der Strafkolonie",
        correctAnswer = 0,
        explanation = "Brod berichtete, Kafka habe ihm das geplante Ende von 'Der Process' mitgeteilt: Josef K. sollte wie ein Hund sterben — 'wie ein Hund!' sind auch die letzten Worte des Romans. 'Das Schloss' blieb ohne geplantes Ende unvollendet. 'Amerika' hat ein fragmentarisches positives Ende.",
        difficulty = 5,
        funFact = "Kafka schrieb 'Der Process' 1914/1915 in wenigen Monaten, legte ihn dann beiseite und arbeitete nicht mehr daran. Das fertige Manuskript war in lose Kapitel unterteilt, die keine eindeutige Reihenfolge hatten — Brod musste die Kapitelfolge selbst festlegen."
    ),

    // Question 10 — correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welches unvollendet gebliebene Romanprojekt von Robert Musil, an dem er 21 Jahre arbeitete, gilt als wichtigstes Fragment der deutschsprachigen Moderne?",
        answerA = "Die Verwirrungen des Zöglings Törleß (Fragment)",
        answerB = "Der Mann ohne Eigenschaften",
        answerC = "Drei Frauen",
        answerD = "Nachlaß zu Lebzeiten",
        correctAnswer = 1,
        explanation = "Robert Musil arbeitete von 1921 bis zu seinem Tod 1942 an 'Der Mann ohne Eigenschaften', ohne ihn zu vollenden. Erschienen sind Band 1 (1930) und Band 2 (1933); der dritte Band blieb Fragment. Musil starb beim morgendlichen Frühsport am Schreibtisch in Genf.",
        difficulty = 5,
        funFact = "Musil hinterließ über 10.000 Seiten Notizen und Entwürfe für den dritten Band. Die kritische Ausgabe seiner Werke füllt neun dicke Bände — der Großteil davon ist unveröffentlichtes Material aus dem Nachlass."
    ),

    // --- Literarische Fälschungen ---

    // Question 11 — correct: C (2)
    Question(
        categoryId = 10,
        questionText = "James Macpherson veröffentlichte 1760–1763 angebliche Übersetzungen eines keltischen Barden aus dem 3. Jahrhundert. Wie lautete der Name dieses erfundenen Bardendichters?",
        answerA = "Fingal",
        answerB = "Temora",
        answerC = "Ossian",
        answerD = "Selma",
        correctAnswer = 2,
        explanation = "Macpherson behauptete, die Gesänge des gälischen Barden 'Ossian' (Oisín) aus dem 3. Jahrhundert gesammelt und übersetzt zu haben. Die Texte waren in Wirklichkeit größtenteils eigene Dichtungen, basierend auf echten gälischen Fragmenten. Sie wurden zu einem der einflussreichsten Werke des Vorromantismus.",
        difficulty = 5,
        funFact = "Ossian begeisterte ganz Europa: Napoleon trug die Gedichte auf Feldzügen mit sich, Goethe ließ Werther daraus vorlesen (und setzte Homer beiseite), und der junge Schubert vertonte mehrere Ossian-Texte."
    ),

    // Question 12 — correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Thomas Chatterton erfand einen fiktiven mittelalterlichen Mönch, dem er seine eigenen Gedichte zuschrieb. Wie hieß dieser erfundene Dichter aus Bristol?",
        answerA = "William Canynges",
        answerB = "John Burgess",
        answerC = "Geoffrey of Monmouth",
        answerD = "Thomas Rowley",
        correctAnswer = 3,
        explanation = "Chatterton schrieb Gedichte im mittelalterlichen Stil und behauptete, sie seien das Werk des fiktiven Mönchs Thomas Rowley aus dem 15. Jahrhundert. Als die Fälschungen entlarvt wurden, vergiftete sich Chatterton 1770 im Alter von 17 Jahren — er wurde zur romantischen Ikone des verkannten Genies.",
        difficulty = 5,
        funFact = "Henry Wallis malte 1856 das berühmte Gemälde 'The Death of Chatterton', das den toten Dichter auf dem Dachboden zeigt. Als Modell diente der damals unbekannte junge Schriftsteller George Meredith."
    ),

    // Question 13 — correct: A (0)
    Question(
        categoryId = 10,
        questionText = "William Henry Ireland fälschte im 18. Jahrhundert Dokumente, Briefe und sogar ein ganzes Theaterstück, das er Shakespeare zuschrieb. Wie lautete der Titel dieses gefälschten Dramas?",
        answerA = "Vortigern and Rowena",
        answerB = "Cardenio",
        answerC = "The History of Cardenio",
        answerD = "Edmund Ironside",
        correctAnswer = 0,
        explanation = "William Henry Ireland (1775–1835) fälschte ab 1794 Shakespeare-Dokumente und schrieb das angeblich wiederentdeckte Stück 'Vortigern and Rowena'. Es wurde 1796 am Drury Lane Theatre uraufgeführt und von Kritikern und Publikum sofort als Fälschung erkannt.",
        difficulty = 5,
        funFact = "Irlands eigener Vater Samuel Ireland, ein Shakespeare-Enthusiast, glaubte an die Echtheit und verteidigte sie öffentlich — selbst nachdem der Sohn die Fälschung gestanden hatte. Die Schande ruinierte den Vater, der wenige Jahre später starb."
    ),

    // Question 14 — correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welche Fälschung des 20. Jahrhunderts gab vor, das Tagebuch Hitlers zu sein, und wurde 1983 vom 'Stern'-Magazin als sensationelle Entdeckung präsentiert?",
        answerA = "Die Hess-Protokolle",
        answerB = "Die Hitler-Tagebücher von Konrad Kujau",
        answerC = "Das Bormann-Testament",
        answerD = "Die Speer-Memoiren-Fälschung",
        correctAnswer = 1,
        explanation = "Konrad Kujau fälschte 1981–1983 insgesamt 62 Bände angeblicher Hitler-Tagebücher. Der 'Stern' zahlte über 9 Millionen Mark dafür. Experten wie Hugh Trevor-Roper und Eberhard Jäckel bestätigten zunächst die Echtheit — bis forensische Analysen Papier und Tinte als modern entlarvten.",
        difficulty = 5,
        funFact = "Kujau hatte bereits zuvor gefälschte historische Gemälde und Dokumente verkauft. Im Gefängnis malte er weiter Fälschungen — diesmal ausdrücklich als 'Kujau-Original-Fälschungen' signiert und legal vermarktet."
    ),

    // --- Anonyme Werke ---

    // Question 15 — correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Der Schelmenroman 'Lazarillo de Tormes' (1554), Gründungswerk der Picaro-Literatur, erschien anonym. Welche These zur Autorschaft gewann 2010 durch einen Archivfund neue Unterstützung?",
        answerA = "Alfonso de Valdés schrieb das Werk als Satire auf den Kaiserhof",
        answerB = "Fray Juan de Ortega, ein Hieronymitenmönch, verfasste es als Bußübung",
        answerC = "Diego Hurtado de Mendoza schrieb es, belegt durch ein Handschriftfragment",
        answerD = "Francisco de Moraes schrieb es während seiner Gefangenschaft",
        correctAnswer = 2,
        explanation = "Die spanische Paläographin Mercedes Agulló entdeckte 2010 ein Handschriftfragment, das dem Humanisten Diego Hurtado de Mendoza (1503–1575) zugeschrieben wird und Teile des Lazarillo enthält. Dies stützt eine alte Vermutung, die ihn als Autor sieht — Gewissheit gibt es bis heute nicht.",
        difficulty = 5,
        funFact = "Der Lazarillo stand auf dem Index der verbotenen Bücher der Spanischen Inquisition, was die Autorschaft bewusst verschleierte. Der Roman verspottete Priester, Mönche und Adlige gleichermaßen — für einen namentlichen Autor wäre das lebensgefährlich gewesen."
    ),

    // Question 16 — correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welcher anonyme mittelhochdeutsche Heldenroman des 13. Jahrhunderts, der die Abenteuer eines jungen Ritters schildert, wurde seinem unbekannten Verfasser nie zugeordnet und gilt als meisterhaftes Rätsel der Mediävistik?",
        answerA = "Das Nibelungenlied",
        answerB = "Tristan (Gottfried von Straßburg)",
        answerC = "Heinrich von dem Türlin: 'Diu Crône'",
        answerD = "Das Kudrunlied",
        correctAnswer = 3,
        explanation = "Das Kudrunlied (auch Gudrunlied), ein mittelhochdeutsches Heldenepos von ca. 1240, ist anonym überliefert. Es existiert nur in einer einzigen Handschrift (Ambraser Heldenbuch, 1504–1516). Wer es verfasste, ist völlig unbekannt — die Forschung debattiert noch immer über Entstehungsraum und Quellen.",
        difficulty = 5,
        funFact = "Das Kudrunlied wurde erst 1820 wiederentdeckt, als Jacob Grimm auf die Ambraser Handschrift aufmerksam wurde. Zuvor war es 300 Jahre lang in einer kaiserlichen Bibliothek unbeachtet geblieben."
    ),

    // --- Verschollene und verlorene Werke ---

    // Question 17 — correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Das verlorene zweite Buch von Aristoteles' 'Poetik' soll welches literarische Genre behandelt haben, und welcher Roman von Umberto Eco macht es zum Dreh- und Angelpunkt einer Mordserie?",
        answerA = "Die Komödie — Umberto Ecos 'Der Name der Rose'",
        answerB = "Die Tragödie — Umberto Ecos 'Das Foucaultsche Pendel'",
        answerC = "Das Epos — Umberto Ecos 'Baudolino'",
        answerD = "Die Lyrik — Umberto Ecos 'Die Insel des vorigen Tages'",
        correctAnswer = 0,
        explanation = "Das zweite Buch der Poetik behandelte nach allgemeiner Forschungsüberzeugung die Komödie, analog zum ersten Buch über die Tragödie. In Ecos 'Der Name der Rose' (1980) tötet der blinde Mönch Jorge Bücher-Leser, die das Buch über den Humor lesen wollen — er glaubt, Lachen sei dem Teufel.",
        difficulty = 5,
        funFact = "Ein byzantinisches Dokument, der sogenannte 'Tractatus Coislinianus', könnte eine Zusammenfassung des zweiten Buches der Poetik enthalten — Forscher streiten bis heute, ob es ein Exzerpt oder eine freie Erfindung ist."
    ),

    // Question 18 — correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welches Shakespeare-Stück, das vermutlich zwischen 1612 und 1613 entstand, galt 300 Jahre lang als verloren und wurde 1727 von Lewis Theobald in einer Bearbeitung als 'Double Falsehood' veröffentlicht?",
        answerA = "Loves Labours Won",
        answerB = "Cardenio",
        answerC = "The History of King Stephen",
        answerD = "Iphis and Ianthe",
        correctAnswer = 1,
        explanation = "'Cardenio', basierend auf einer Figur aus Cervantes' Don Quijote, wurde 1613 von der King's Men-Truppe aufgeführt. Das Original ist verschollen. Theobald behauptete 1727, er besitze drei Manuskripte des Originals — ob 'Double Falsehood' wirklich darauf basiert oder eine Fälschung ist, ist bis heute umstritten.",
        difficulty = 5,
        funFact = "2010 nahm die Royal Shakespeare Company 'Double Falsehood' in ihr Programm auf und stellte es als authentische Shakespeare-Bearbeitung vor. Eine 2012er Studie analysierte den Stilometrie-Befund und sah echte Shakespeare-Züge in Teilen des Textes."
    ),

    // Question 19 — correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welches angebliche Frühwerk von Heinrich von Kleist ist so vollständig verschwunden, dass selbst sein Titel strittig ist, und welcher Kleist-Forscher rekonstruierte dessen mögliche Existenz?",
        answerA = "Das 'Thalia-Fragment' — Wilhelm Grimm",
        answerB = "Der 'Guiscard-Urtext' — Richard Samuel",
        answerC = "Der 'Robert Guiskard' (Frühfassung) — Heinrich Sembdner",
        answerD = "Das 'Phöbus-Manuskript' — Ernst von Reimer",
        correctAnswer = 2,
        explanation = "Kleist arbeitete jahrelang an einem Trauerspiel über Robert Guiskard, verbrannte das Manuskript 1803 in einer Lebenskrise und begann später neu. Die Frage, wie viel von der ursprünglichen Fassung in der erhaltenen Szene steckt, ist ein zentrales Problem der Kleist-Philologie. Sembdner war der bedeutendste Kleist-Archivar.",
        difficulty = 5,
        funFact = "Kleist schrieb an Ulrike von Kleist: 'Mein ganzes innerstes Wesen erschüttert sich, wenn ich daran denke, was ich in dieser Arbeit verloren habe.' Der 'Guiskard' galt ihm selbst als sein Meisterwerk — von dem die Nachwelt nur eine Fragment-Szene besitzt."
    ),

    // Question 20 — correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche bedeutende Bibliothek der Antike brannte möglicherweise mehrfach und beherbergte nach Schätzungen bis zu 700.000 Schriftrollen — darunter zahlreiche heute verlorene Werke?",
        answerA = "Die Bibliothek von Pergamon",
        answerB = "Die Palatinische Bibliothek in Rom",
        answerC = "Die Bibliothek von Antiochia",
        answerD = "Die Bibliothek von Alexandria",
        correctAnswer = 3,
        explanation = "Die Bibliothek von Alexandria (gegründet ca. 288 v. Chr.) gilt als das größte Wissensarchiv der Antike. Mehrere Brandereignisse werden diskutiert — durch Caesar (48 v. Chr.), Aurelian (270 n. Chr.) und den Erlass des Theophilos (391 n. Chr.). Mit ihr verloren sich Werke von Euripides, Aristophanes, Eratosthenes und viele andere.",
        difficulty = 5,
        funFact = "Der Bibliothekar Eratosthenes berechnete in Alexandria den Erdumfang auf etwa 250.000 Stadien — mit einer Genauigkeit, die erst Jahrhunderte später übertroffen wurde. Sein Hauptwerk 'Geographika' existiert heute nur in Fragmenten."
    ),

    // --- Ghostwriting und kollaborative Autorschaft ---

    // Question 21 — correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Auguste Maquet schrieb Plots und Erstentwürfe für Alexandre Dumas, erhielt aber keine Autorennennung. Welche zwei Weltliteratur-Romane entstanden in dieser Zusammenarbeit?",
        answerA = "Die drei Musketiere und Der Graf von Monte Christo",
        answerB = "Die drei Musketiere und Die Kameliendame",
        answerC = "Der Graf von Monte Christo und Notre-Dame de Paris",
        answerD = "Der Graf von Monte Christo und Zwanzigtausend Meilen unter dem Meer",
        correctAnswer = 0,
        explanation = "Auguste Maquet (1813–1888) lieferte Plots, historische Recherche und Erstentwürfe für beide Meisterwerke. Dumas überarbeitete, erweiterte und gab ihnen seinen Ton. Maquet klagte auf Mitautorenschaft — und verlor. Das Gericht sprach Dumas die alleinige Urheberschaft zu.",
        difficulty = 5,
        funFact = "Dumas betrieb faktisch eine Romانfabrik namens 'Société Dumas' mit bis zu 73 Mitarbeitern und Ghostwritern. Er sagte selbst: 'Ich habe 1200 Bücher geschrieben, von denen ich mindestens die Hälfte gelesen habe.'"
    ),

    // Question 22 — correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wer schrieb nachweislich große Teile der Bücher der Romanreihe 'Nancy Drew', obwohl als Autorin stets das Pseudonym 'Carolyn Keene' auf den Covern stand?",
        answerA = "Mildred Wirt Benson und mehrere ungenannte Ghostwriter des Stratemeyer Syndicate",
        answerB = "Mildred Wirt Benson schrieb die ersten 23 Bände, weitere Ghostwriter die übrigen",
        answerC = "Edward Stratemeyer schrieb alle Bände persönlich",
        answerD = "Harriet Stratemeyer Adams schrieb alle Bände allein",
        correctAnswer = 1,
        explanation = "Mildred Wirt Benson (1905–2002) schrieb zwischen 1930 und 1953 die ersten 23 Nancy-Drew-Bände unter dem Pseudonym 'Carolyn Keene'. Das Stratemeyer Syndicate hielt das Pseudonym als Marke und ließ später andere Ghostwriter weiterschreiben. Benson schwieg jahrzehntelang vertragsgemäß.",
        difficulty = 5,
        funFact = "Als Benson 1993 erstmals öffentlich als Autorin der frühen Bände identifiziert wurde, war sie 87 Jahre alt und schrieb noch immer als Journalistin. Sie arbeitete bis kurz vor ihrem Tod im Alter von 96 Jahren."
    ),

    // Question 23 — correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welcher russische Klassiker wurde von seinem Autor in einer frühen Version vollständig verbrannt, bevor eine stark veränderte Neufassung entstand — und blieb dennoch auch diese unvollendet?",
        answerA = "Dostojewskis 'Der Idiot'",
        answerB = "Turgenjews 'Väter und Söhne'",
        answerC = "Gogols 'Tote Seelen' (Band 2)",
        answerD = "Tolstois 'Auferstehung'",
        correctAnswer = 2,
        explanation = "Nikolai Gogol verbrannte 1845 das Manuskript des zweiten Bandes von 'Tote Seelen' in einer religiösen Krise. Er begann neu zu schreiben, verbrannte kurz vor seinem Tod 1852 erneut fast alle Manuskripte. Nur wenige Kapitelfragmente des zweiten Bandes sind aus Abschriften erhalten.",
        difficulty = 5,
        funFact = "Gogol fastete in seinen letzten Lebensjahren extrem, übte exzessive Buße und verfiel religiöser Melancholie. Er starb wahrscheinlich an den Folgen von Hunger und falscher ärztlicher Behandlung — mit 42 Jahren."
    ),

    // Question 24 — correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Das Werk 'The Whole Family' (1908) wurde von 12 verschiedenen amerikanischen Autoren kapitelweise geschrieben, wobei jeder Kapitelautor eine andere Figur derselben Familie beschrieb. Wer koordinierte dieses Experiment?",
        answerA = "Mark Twain und William Dean Howells gemeinsam",
        answerB = "Henry James, der auch das berühmteste Kapitel beisteuerte",
        answerC = "Edith Wharton als Herausgeberin",
        answerD = "William Dean Howells als Herausgeber mit Henry James als Kontributor",
        correctAnswer = 3,
        explanation = "William Dean Howells konzipierte das kollaborative Roman-Experiment für Harper's Bazar. Henry James steuerte das Kapitel der 'Tante' bei — und überschrieb radikal das von der Vorgängerin Aufgebaute, was zu Verstimmungen unter den Autoren führte. Das Projekt gilt als frühes Beispiel kollaborativer Autorschaft.",
        difficulty = 5,
        funFact = "Henry James' Kapitel war so eigenwillig und dominant, dass die nachfolgenden Autorinnen kaum wussten, wie sie die Geschichte fortführen sollten. Die Tante wurde zur heimlichen Hauptfigur — obwohl das Buch eigentlich von der gesamten Familie handeln sollte."
    ),

    // --- Plagiat und Urheberschaft ---

    // Question 25 — correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Helene Hegemanns Roman 'Axolotl Roadkill' (2010) enthielt Passagen aus einem Blog. Wie hieß der Blogger, von dem Hegemann ohne Nennung abschrieb?",
        answerA = "Airen (Pseudonym des Bloggers von 'Strobo')",
        answerB = "Rainald Goetz (Textquelle: 'Rave')",
        answerC = "Christian Kracht (Textquelle: 'Faserland')",
        answerD = "Sven Regener (Textquelle: 'Herr Lehmann')",
        correctAnswer = 0,
        explanation = "Der Blogger mit dem Pseudonym 'Airen' hatte den autobiografischen Roman 'Strobo' im Internet veröffentlicht. Hegemann übernahm mehrere Passagen daraus wörtlich in 'Axolotl Roadkill', ohne ihn zu nennen. Hegemann bezeichnete dies als 'Intertextualität' und sagte, Originalität sei ein überholtes Konzept.",
        difficulty = 5,
        funFact = "Trotz des Plagiatsvorwurfs blieb 'Axolotl Roadkill' auf der Longlist des Deutschen Buchpreises 2010. Hegemann war damals 17 Jahre alt. Das Buch verkaufte sich nach der Debatte noch besser als zuvor."
    ),

    // Question 26 — correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welcher Gericht-Fall von 2006 entschied, dass Dan Brown zwar Ideen aus Michael Baigent und Richard Leighs Buch 'Holy Blood, Holy Grail' verwendet hatte, dies aber KEIN Plagiat darstelle?",
        answerA = "Baigent v. Random House Ltd. vor dem US District Court New York",
        answerB = "Baigent and Leigh v. Random House Group Ltd. vor dem High Court of Justice London",
        answerC = "Baigent v. Dan Brown vor dem European Court of Human Rights",
        answerD = "Random House v. Priory of Sion vor dem Cour de Cassation Paris",
        correctAnswer = 1,
        explanation = "Das britische Berufungsgericht bestätigte 2007 das Urteil des High Court: Brown hatte Themen und Ideen aus 'Holy Blood, Holy Grail' verwendet, aber keine schützenswerten konkreten Ausdrücke kopiert. Ideen sind im Urheberrecht nicht schutzfähig — nur ihre spezifische Ausdrucksform.",
        difficulty = 5,
        funFact = "Baigent und Leigh verloren nicht nur den Prozess, sondern mussten auch Browns Anwaltskosten teilweise bezahlen. Die Klage ruinierte Baigents Ruf — er starb 2013 weitgehend in Vergessenheit, während 'The Da Vinci Code' Millionen von Exemplaren verkaufte."
    ),

    // Question 27 — correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welcher bedeutende russische Sowjet-Schriftsteller wurde beschuldigt, seinen Debütroman 'Der stille Don' von einem unbekannten Autoren namens Fiodor Kriukow abgeschrieben zu haben?",
        answerA = "Ilja Ehrenburg",
        answerB = "Alexej Tolstoi",
        answerC = "Michail Scholochow",
        answerD = "Michail Bulgakow",
        correctAnswer = 2,
        explanation = "Michail Scholochow, Nobelpreisträger 1965, wurde zeitlebens verdächtigt, 'Der stille Don' nicht selbst geschrieben zu haben. Der Kosakenautor Fjodor Kriukow (1870–1920) gilt manchen als eigentlicher Verfasser. 2009 untersuchte die Norwegerin Sigrid McLaughlin die Originalmanuskripte — das Urteil der Forschung bleibt gespalten.",
        difficulty = 5,
        funFact = "Scholochow denunzierte im Stalinismus Kollegen und war trotzdem literarisch bewundert. Alexander Solschenizyn glaubte fest an den Plagiatvorwurf. Die Originalmanuskripte tauchten erst 1987 wieder auf — nach Jahrzehnten unter ungeklärten Umständen verschwunden."
    ),

    // Question 28 — correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welcher Autor des 20. Jahrhunderts veröffentlichte unter dem Pseudonym 'B. Traven' Romane wie 'Der Schatz der Sierra Madre', ohne je seine wahre Identität preiszugeben — und gilt bis heute als eines der größten Rätsel der Literaturgeschichte?",
        answerA = "Traven Torsvan, nachgewiesener US-amerikanischer Schriftsteller",
        answerB = "Jack London, der in Mexiko untertauchte",
        answerC = "Ernst Toller, der nach Mexiko floh",
        answerD = "Ret Marut alias B. Traven — wahre Identität ungeklärt",
        correctAnswer = 3,
        explanation = "B. Traven veröffentlichte ab 1925 Romane von Mexiko aus, verweigerte jede Öffentlichkeit und ließ sich nie fotografieren. Der anarchistische Schauspieler und Agitator Ret Marut gilt als wahrscheinlichste Identität — doch die finale Gewissheit fehlt. Traven starb 1969 in Mexiko-Stadt, ohne die Frage zu klären.",
        difficulty = 5,
        funFact = "Als John Huston 1947 den Film 'Der Schatz der Sierra Madre' drehte, korrespondierte er mit Traven durch einen Mittelsmann. Eines Tages erschien ein älterer Herr am Set und stellte sich als 'Travens Übersetzer' vor — er war offensichtlich Traven selbst. Huston akzeptierte das Spiel mit."
    ),

    // --- Literarische Kontroversen und Fehden ---

    // Question 29 — correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welche Kontroverse zwischen Voltaire und Jean-Jacques Rousseau eskalierte so, dass Rousseau Voltaire beschuldigte, ihn durch anonyme Pamphlete verfolgen zu lassen?",
        answerA = "Der Streit um Rousseaus 'Lettre à d'Alembert sur les spectacles' und Voltaires Engagement für das Genfer Theater",
        answerB = "Der Streit um die Herausgabe der 'Encyclopédie' durch Diderot",
        answerC = "Der Streit um die Autorenschaft des 'Contrat Social'",
        answerD = "Der Streit um Rousseaus Aufnahme in die Académie française",
        correctAnswer = 0,
        explanation = "Rousseaus 'Lettre à d'Alembert' (1758) kritisierte Theaterstücke als moralisch verderblich — direkt gegen Voltaires Anliegen, in Genf ein Theater zu etablieren. Die Fehde wurde persönlich: Voltaire verspottete Rousseau öffentlich, Rousseau warf ihm an, ihn in Genf ruinieren zu wollen.",
        difficulty = 5,
        funFact = "Voltaire und Rousseau starben im selben Jahr: 1778, nur wenige Wochen voneinander entfernt. Die Aufklärung verlor damit ihre beiden größten und streitbarsten Geister fast gleichzeitig."
    ),

    // Question 30 — correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Der 'Literaturstreit' von 1990 in Deutschland entfachte sich an einem Werk von Christa Wolf. Welches war es, und was warf man ihr vor?",
        answerA = "Der geteilte Himmel — Verklärung des DDR-Systems",
        answerB = "Was bleibt — Opportunismus wegen des Publikationszeitpunkts nach dem Mauerfall",
        answerC = "Kassandra — Fehlende Kritik am Patriarchat",
        answerD = "Kindheitsmuster — Verharmlosung der Nazi-Zeit",
        correctAnswer = 1,
        explanation = "'Was bleibt' war bereits 1979 geschrieben, erschien aber erst 1990 — nach dem Mauerfall. Kritiker wie Marcel Reich-Ranicki und Ulrich Greiner warfen Wolf vor, die autobiografische Erzählung über Stasi-Überwachung aufbewahrt zu haben, bis es sicher war. Der Streit polarisierte die deutsche Literaturszene.",
        difficulty = 5,
        funFact = "1993 wurde bekannt, dass Christa Wolf selbst kurze Zeit in den 1950er Jahren als Stasi-Informantin tätig war — was sie zuvor nicht erwähnt hatte. Dies gab dem Literaturstreit nachträglich eine weitere, schmerzliche Dimension."
    ),

    // Question 31 — correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welcher deutsche Dichter veröffentlichte 1796 gemeinsam mit Goethe die 'Xenien' — beißende Epigramme gegen literarische Feinde — und welchem antiken Vorbild folgten sie dabei?",
        answerA = "Hölderlin — den Epigrammen des Archilochos",
        answerB = "Herder — den Satiren des Horaz",
        answerC = "Schiller — den 'Xenia' des Martial",
        answerD = "Wieland — den 'Silvae' des Statius",
        correctAnswer = 2,
        explanation = "Goethe und Schiller veröffentlichten 1796 im 'Musen-Almanach' rund 400 Xenien — kurze satirische Distichen, die zeitgenössische Schriftsteller, Philosophen und Kritiker verspotteten. Vorbild waren die 'Xenia' des römischen Epigrammdichters Martial.",
        difficulty = 5,
        funFact = "Viele Zeitgenossen erkannten sich in den Xenien wieder und waren empört. Der Verleger Friedrich Nicolai, ein Hauptziel der Spöttereien, antwortete mit eigenen Gegen-Xenien. Die Polemik half paradoxerweise, den 'Musen-Almanach' zum Bestseller zu machen."
    ),

    // Question 32 — correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Der Streit zwischen Jonathan Swift und Alexander Pope auf der einen Seite und ihren Gegnern auf der anderen wurde in welchem literarischen Werk satirisch verewigt, das die Dummheit der Zeit anprangert?",
        answerA = "Swifts 'Ein bescheidener Vorschlag'",
        answerB = "Swifts 'Die Geschichte einer Wanne'",
        answerC = "Popes 'Essay on Criticism'",
        answerD = "Popes 'The Dunciad'",
        correctAnswer = 3,
        explanation = "Alexander Popes 'The Dunciad' (1728, erweitert 1743) ist ein satirisches Epos, das literarische Feinde und mittelmäßige Autoren als Verehrer der 'Dullness' (Dummheit) verspottet. Pope setzte namentlich Rivalen wie Lewis Theobald und Colley Cibber als Könige des Stumpfsinns ein.",
        difficulty = 5,
        funFact = "Als Pope 1743 die finale Version mit Colley Cibber als neuem 'Duncen-König' veröffentlichte, war Cibber 71 Jahre alt. Er antwortete mit einer wütenden Gegenschrift — was Pope nur amüsierte und Cibbers Ruf weiter schadete."
    ),

    // --- Pseudonyme und verborgene Identitäten ---

    // Question 33 — correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Unter welchem Pseudonym veröffentlichte Mary Ann Evans (1819–1880) ihre Romane, und was war ihr primärer Grund für die Verschleierung ihrer Identität?",
        answerA = "George Eliot — um ernst genommen zu werden und nicht als Frau auf leichte Unterhaltungsliteratur reduziert zu werden",
        answerB = "George Sand — um die Zensur zu umgehen und frei über Liebe schreiben zu können",
        answerC = "Currer Bell — weil ihr Verleger ein männliches Pseudonym verlangte",
        answerD = "Vernon Lee — um Kritik an der Kirche anonym äußern zu können",
        correctAnswer = 0,
        explanation = "Mary Ann Evans wählte 'George Eliot', weil Bücher von Frauen im viktorianischen England pauschal als Unterhaltungsliteratur abgetan wurden. Sie wollte, dass ihre Werke als ernsthafte Literatur rezensiert werden — was 'Middlemarch' und 'Der Webstuhl von Ravenloe' auch wurden.",
        difficulty = 5,
        funFact = "Als 'George Eliots' wahre Identität 1859 bekannt wurde, war die öffentliche Überraschung enorm. Königin Victoria gehörte zu den Leserinnen der Romane — und war angeblich tief beeindruckt, obwohl sie Eliots unverheiratetes Zusammenleben mit George Henry Lewes missbilligte."
    ),

    // Question 34 — correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Der portugiesische Dichter Fernando Pessoa veröffentlichte seine Werke unter mehreren erdachten Autorenidentitäten mit eigenen Biografien und Stilen. Wie bezeichnet man diese Figuren in der Literaturwissenschaft?",
        answerA = "Alter Egos",
        answerB = "Heteroníme (Heteronyme)",
        answerC = "Pseudonyme",
        answerD = "Masken",
        correctAnswer = 1,
        explanation = "Pessoa unterschied strikt zwischen 'Pseudonymen' (anderer Name, gleicher Autor) und 'Heteronymen' (eigenständige fiktive Persönlichkeiten mit eigener Biografie, Handschrift, Philosophie). Seine Hauptheteronyme waren Alberto Caeiro, Ricardo Reis, Álvaro de Campos und Bernardo Soares.",
        difficulty = 5,
        funFact = "Pessoa hinterließ eine riesige Kiste mit über 27.000 Dokumenten — Gedichte, Fragmente, Briefe, Pläne. Sein Hauptwerk 'Das Buch der Unruhe' von Bernardo Soares wurde erst 1982 aus diesem Nachlass zusammengestellt — 47 Jahre nach Pessoas Tod."
    ),

    // Question 35 — correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Unter welchem gemeinsamen Pseudonym veröffentlichten Charlotte, Emily und Anne Brontë 1846 ihren ersten Gedichtband, bevor ihre Romane die wahre Autorschaft enthüllten?",
        answerA = "The Bell Sisters",
        answerB = "Ellis, Acton und Currer Bell (ohne gemeinsamen Sammelnamen)",
        answerC = "Currer, Ellis und Acton Bell",
        answerD = "The Yorkshire Poets",
        correctAnswer = 2,
        explanation = "Die drei Brontë-Schwestern veröffentlichten 'Poems by Currer, Ellis and Acton Bell' (1846): Charlotte = Currer Bell, Emily = Ellis Bell, Anne = Acton Bell. Sie wählten geschlechtsneutrale Namen, um nicht als Schriftstellerinnen abgestempelt zu werden.",
        difficulty = 5,
        funFact = "Der Gedichtband verkaufte sich katastrophal schlecht: nur zwei Exemplare wurden im ersten Jahr verkauft. Der Durchbruch kam erst 1847, als 'Jane Eyre' (Charlotte), 'Wuthering Heights' (Emily) und 'Agnes Grey' (Anne) erschienen — alle im selben Jahr."
    ),

    // --- Zensurier-te und verbotene Literatur ---

    // Question 36 — correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welches Werk von Gustave Flaubert wurde 1857 wegen Verletzung der öffentlichen Moral angeklagt, und was war das Ergebnis des Prozesses?",
        answerA = "L'Éducation sentimentale — Freispruch nach öffentlichem Druck",
        answerB = "Salammbô — Einstellung des Verfahrens wegen mangelnder Beweise",
        answerC = "Trois Contes — Verurteilung zu einer Geldstrafe",
        answerD = "Madame Bovary — Freispruch, der Flaubert berühmt machte",
        correctAnswer = 3,
        explanation = "Flaubert und sein Verleger Michel Lévy wurden 1857 wegen 'Madame Bovary' vor Gericht gestellt. Der Staatsanwalt Ernest Pinard sah darin eine Verherrlichung des Ehebruchs. Das Gericht sprach beide frei — und der Skandalprozess machte den Roman zum Bestseller.",
        difficulty = 5,
        funFact = "Im selben Jahr 1857 wurde auch Baudelaires 'Les Fleurs du mal' angeklagt — dieselbe Staatsanwaltschaft, derselbe Ankläger Pinard. Baudelaire verlor: Sechs Gedichte mussten aus der Sammlung gestrichen werden, eine Strafe, die erst 1949 aufgehoben wurde."
    ),

    // Question 37 — correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welches Buch stand in der Sowjetunion auf dem Index, zirkulierte jahrelang als handgeschriebene Abschrift im Samisdat und wurde erst 1966 — posthum — außerhalb der UdSSR veröffentlicht?",
        answerA = "Michail Bulgakows 'Der Meister und Margarita'",
        answerB = "Boris Pasternaks 'Doktor Schiwago'",
        answerC = "Anna Achmatowas 'Requiem'",
        answerD = "Alexander Solschenizyns 'Der Archipel Gulag'",
        correctAnswer = 0,
        explanation = "Bulgakow schrieb 'Der Meister und Margarita' von 1928 bis zu seinem Tod 1940, ohne eine Veröffentlichung zu erleben. Seine Witwe Elena bewahrte das Manuskript. 1966/67 erschienen erste zensierte Auszüge in der Sowjetunion, die vollständige Ausgabe erst 1973 im Ausland.",
        difficulty = 5,
        funFact = "Bulgakow schrieb Stalin mehrere Briefe und bat um Erlaubnis, die UdSSR verlassen zu dürfen. Stalin rief ihn einmal persönlich an — ein unerhörtes Ereignis — und fragte, ob er wirklich emigrieren wolle. Bulgakow sagte nein. Die Erlaubnis wurde nie erteilt."
    ),

    // Question 38 — correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Boris Pasternak erhielt 1958 den Nobelpreis für Literatur, wurde aber von sowjetischen Behörden gezwungen, ihn abzulehnen. Welches Werk war der Anlass?",
        answerA = "Sein Gedichtband 'Meine Schwester das Leben'",
        answerB = "Der Roman 'Doktor Schiwago'",
        answerC = "Sein Übersetzungswerk (Shakespeare, Goethe)",
        answerD = "Die Autobiographie 'Geleitbrief'",
        correctAnswer = 1,
        explanation = "'Doktor Schiwago' wurde in der UdSSR verboten und 1957 in Italien von Feltrinelli veröffentlicht — mit Hilfe des KGB, der glaubte, die Veröffentlichung würde Pasternak schaden, was sich als Fehlkalkulation erwies. Unter dem Druck der Sowjetbehörden lehnte Pasternak den Nobelpreis ab.",
        difficulty = 5,
        funFact = "Die CIA finanzierte heimlich die erste Massenverteilung russischsprachiger Exemplare von 'Doktor Schiwago' an sowjetische Delegierte auf der Weltausstellung 1958 in Brüssel — ein Propagandacoups des Kalten Krieges."
    ),

    // --- Textüberlieferung und Editionsprobleme ---

    // Question 39 — correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welches Problem bezeichnet man in der Editionsphilologie als 'Korruptele', das die korrekte Überlieferung antiker Texte erschwert?",
        answerA = "Die absichtliche Fälschung eines Textes durch einen späteren Schreiber",
        answerB = "Das Fehlen wichtiger Textstellen durch Beschädigung des Trägermaterials",
        answerC = "Fehler im Text, die durch Abschreibfehler oder Missverständnisse der Kopisten entstanden",
        answerD = "Die Übersetzungsfehler bei der Übertragung aus einer Fremdsprache",
        correctAnswer = 2,
        explanation = "Eine 'Korruptele' (lat. corruptio = Verderbnis) ist eine fehlerhafte Textstelle, die durch Kopierfehler, Verlesen, Verhören oder absichtliche 'Verbesserungen' durch Schreiber entstanden ist. Die Textkritik versucht, durch Handschriftenvergleich die ursprüngliche Lesart (Lectio) wiederherzustellen.",
        difficulty = 5,
        funFact = "Die Handschriftenüberlieferung des Lukrez-Gedichts 'De rerum natura' hing an einem einzigen mittelalterlichen Manuskript, das um 1417 von Poggio Bracciolini in einem deutschen Kloster wiederentdeckt wurde. Ohne diesen Glücksfund wäre das Werk verloren."
    ),

    // Question 40 — correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche Methode der Textkritik bezeichnet das Prinzip, dass bei mehreren überlieferten Lesarten die schwierigere Lesart tendenziell die ursprünglichere ist?",
        answerA = "Lectio plenior (die vollständigere Lesart)",
        answerB = "Lectio brevior (die kürzere Lesart)",
        answerC = "Lectio recepta (die empfangene Lesart)",
        answerD = "Lectio difficilior (die schwierigere Lesart)",
        correctAnswer = 3,
        explanation = "Das Prinzip 'Lectio difficilior potior' (die schwierigere Lesart ist vorzuziehen) beruht auf der Logik, dass Schreiber dazu neigten, schwierige oder anstößige Stellen zu vereinfachen oder zu glätten. Die ungewöhnlichere Formulierung ist daher oft die ursprünglichere.",
        difficulty = 5,
        funFact = "Dieses Prinzip gilt auch in der Bibelwissenschaft: Wo Handschriften abweichen, bevorzugen Textkritiker oft die grammatikalisch schwierigere oder theologisch anstößigere Variante — weil kein Kopist freiwillig eine 'harmlose' Stelle durch eine 'problematische' ersetzt hätte."
    ),

    // --- Weitere Raritäten und Kontroversen ---

    // Question 41 — correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welches Werk Cervantes' beschreibt im Prolog explizit, dass es aus einem arabischen Manuskript eines gewissen Cide Hamete Benengeli stammt — eine Fiktion innerhalb der Fiktion?",
        answerA = "Don Quijote de la Mancha",
        answerB = "La Galatea",
        answerC = "Los trabajos de Persiles y Sigismunda",
        answerD = "Novelas ejemplares",
        correctAnswer = 0,
        explanation = "Cervantes erfindet im Don Quijote den fiktiven arabischen Historiker Cide Hamete Benengeli als angebliche Originalquelle. Der Erzähler berichtet, er habe in Toledo ein arabisches Manuskript gefunden und es von einem Morisken übersetzen lassen. Diese Rahmenfiktion ist eine der ersten metafiktionalen Strukturen der Weltliteratur.",
        difficulty = 5,
        funFact = "Cervantes nutzt den fiktiven arabischen Autor auch als ironisches Distanzierungsmittel: Wenn Cide Hamete Benengeli etwas 'bezeugt', kann Cervantes Widersprüche im Text auf die angebliche Quelle schieben. Es ist eine frühe Form des 'unzuverlässigen Erzählers'."
    ),

    // Question 42 — correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welches angebliche mittelalterliche Manifest, das die Entstehung von Freimaurerlogen beschreibt, wurde im 17. Jahrhundert veröffentlicht und ist bis heute in seiner Urheberschaft umstritten?",
        answerA = "Die Constitutiones Andersonianae (Anderson 1723)",
        answerB = "Die Rosenkreuzer-Manifeste (Fama Fraternitatis, Confessio)",
        answerC = "Das Kybalion der Hermetiker",
        answerD = "Die Chymische Hochzeit des Christian Rosenkreuz",
        correctAnswer = 1,
        explanation = "Die 'Fama Fraternitatis' (1614) und 'Confessio Fraternitatis' (1615) beschreiben die Bruderschaft des Rosenkreuzes um den fiktiven Christian Rosenkreuz. Als wahrscheinlichster Autor gilt der lutherische Theologe Johann Valentin Andreae — der aber den Ursprung der Manifeste nie vollständig klärte.",
        difficulty = 5,
        funFact = "Andreae bezeichnete die Manifeste später selbst als 'Ludibrium' (Spielerei/Spott). Dennoch lösten sie eine riesige Reaktion aus: Über 200 Schriften wurden in den folgenden Jahren veröffentlicht, die auf die Bruderschaft antworteten — von Menschen, die sie für real hielten."
    ),

    // Question 43 — correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Der 'Priory of Sion' (Priorat von Sion), der in Dan Browns 'The Da Vinci Code' eine zentrale Rolle spielt, ist in Wirklichkeit eine Fälschung. Wer erfand diesen angeblich mittelalterlichen Geheimbund im 20. Jahrhundert?",
        answerA = "Henry Lincoln und Michael Baigent in 'Holy Blood, Holy Grail'",
        answerB = "Pierre Plantard und Gérard de Sède im Jahr 1956",
        answerC = "Pierre Plantard, Philippe de Chérisey und Gérard de Sède als kollaborative Mystifikation",
        answerD = "Alfred Weisman für ein französisches Satiremagazin",
        correctAnswer = 2,
        explanation = "Pierre Plantard gründete 1956 einen harmlosen lokalen Verein namens 'Prieuré de Sion' in Annemasse. Gemeinsam mit Philippe de Chérisey (der gefälschte Dokumente erstellte) und Gérard de Sède (der die Geschichte publizierte) wurde der Mythos eines mittelalterlichen Geheimbundes konstruiert.",
        difficulty = 5,
        funFact = "Die gefälschten Dokumente ('Dossiers Secrets') wurden in der Bibliothèque nationale de France deponiert und von Baigent & Leigh als Beweise für die Gralsgeschichte genutzt. Plantard gestand 1993 unter Eid, dass er alles erfunden hatte — was die Bestseller-Autoren allerdings nicht mehr korrigierten."
    ),

    // Question 44 — correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welches mittelalterliche Dokument, das angeblich Kaiser Konstantin dem Großen zugeschrieben wurde und dem Papst Herrschaft über Westeuropa überließ, wurde 1440 von Lorenzo Valla als Fälschung entlarvt?",
        answerA = "Das Constitutum Constantini — durch Sprachanalyse und historische Widersprüche",
        answerB = "Die Donatio Constantini — durch Paläographie allein",
        answerC = "Das Edictum Constantini — durch Vergleich mit echten kaiserlichen Urkunden",
        answerD = "Die Donatio Constantini — durch linguistische Anachronismen und historische Unmöglichkeiten",
        correctAnswer = 3,
        explanation = "Lorenzo Valla wies in 'De falso credita et ementita Constantini donatione' (1440) nach, dass die 'Schenkungsurkunde Konstantins' Sprache des 8. Jahrhunderts benutzt, historische Fehler enthält und Konzepte aus einer Zeit nach Konstantin erwähnt. Es war ein Meilenstein der philologischen Textkritik.",
        difficulty = 5,
        funFact = "Die Fälschung war seit dem 9. Jahrhundert im Umlauf und hatte päpstliche Politik Jahrhunderte lang gerechtfertigt. Valla schrieb sein Enthüllungswerk im Dienst König Alfons V. von Aragón — der politisch ein Interesse daran hatte, den päpstlichen Machtanspruch zu untergraben."
    ),

    // Question 45 — correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Das 'Buch der Zwischenwelten' von Paul Scheerbart (1897) blieb zu Lebzeiten weitgehend unveröffentlicht. Welche literarische Bewegung vereinnahmte ihn posthum als Vorläufer?",
        answerA = "Der Surrealismus und die Science-Fiction-Literatur",
        answerB = "Der Expressionismus",
        answerC = "Der Dadaismus",
        answerD = "Die Neue Sachlichkeit",
        correctAnswer = 0,
        explanation = "Paul Scheerbart schrieb kosmische Fantasieromane, Grotesken und astrale Utopien, die zu seinen Lebzeiten kaum Resonanz fanden. Surrealisten und frühe Science-Fiction-Autoren entdeckten ihn als Visionär. Sein bekanntestes Werk 'Lesabéndio' (1913) gilt heute als Klassiker der kosmischen Literatur.",
        difficulty = 5,
        funFact = "Scheerbart war auch ein Pionier der Glasarchitektur-Utopie: Sein Essay 'Glasarchitektur' (1914) inspirierte den Architekten Bruno Taut zum 'Gläsernen Haus' auf der Werkbundausstellung 1914. Taut widmete Scheerbart den Bau und schrieb seinen Namen auf die Glaswände."
    ),

    // Question 46 — correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welcher Autor des lateinischen Mittelalters verbreitete als 'Geoffrey of Monmouth' eine in wesentlichen Teilen erfundene Geschichte der britischen Könige — einschließlich des ersten ausführlichen Berichts über König Artus?",
        answerA = "Beda Venerabilis im 8. Jahrhundert",
        answerB = "Geoffrey of Monmouth in der 'Historia Regum Britanniae' (ca. 1136)",
        answerC = "Nennius in der 'Historia Brittonum' (ca. 830)",
        answerD = "Gildas in 'De Excidio et Conquestu Britanniae' (ca. 540)",
        correctAnswer = 1,
        explanation = "Geoffreys 'Historia Regum Britanniae' (ca. 1136) behauptet, auf einem alten walisischen Buch zu basieren — das niemand sonst je gesehen hat. Der Text enthält die erste ausführliche Darstellung von König Artus, Merlins Prophezeiungen und der Sage von Troja als Ursprung Britanniens. Zeitgenossen wie William von Newbury erkannten es als Fiktion.",
        difficulty = 5,
        funFact = "Trotz seiner historischen Unzuverlässigkeit beeinflusste Geoffreys Werk die europäische Literatur enorm: Wace übersetzte es ins Altfranzösische, darauf basierte Layamon und letztlich Tennyson — die gesamte Artussage hat Geoffrey als zentralen Überlieferungskanal."
    ),

    // Question 47 — correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Welches Werk von James Joyce wurde bei seinem ersten Erscheinen 1922 in den USA beschlagnahmt und für obszön erklärt, bevor ein Gerichtsurteil 1933 die Veröffentlichung freigab?",
        answerA = "Finnegans Wake",
        answerB = "A Portrait of the Artist as a Young Man",
        answerC = "Ulysses",
        answerD = "Dubliners",
        correctAnswer = 2,
        explanation = "Der US-Postmeister beschlagnahmte 1921 Serienabdrucke von 'Ulysses' in der Little Review als obszön. Die Vollausgabe erschien 1922 in Paris bei Sylvia Beach (Shakespeare and Company). Erst 1933 entschied Richter John Woolsey in USA v. One Book Called Ulysses, das Werk sei kein Pornografie.",
        difficulty = 5,
        funFact = "Random House organisierte den Schmuggel eines Exemplars über die US-Grenze, um den Prozess zu erzwingen und zu gewinnen. Das Buch wurde absichtlich aufgegriffen — ein geplanter Präzedenzfall, der Joycemit einem Schlag zum meistdiskutierten Autor der Welt machte."
    ),

    // Question 48 — correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welche Kontroverse um die Nachlass-Ausgabe eines Autors entbrannte, als die Erben eines Nobelpreisträgers Passagen aus seinen Tagebüchern veröffentlichten, die antisemitische Äußerungen enthielten?",
        answerA = "Die Kontroverse um Knut Hamsuns Nachlass nach Veröffentlichung seiner NS-Sympathien",
        answerB = "Die Kontroverse um Elias Canettis Tagebücher und Frauenbilder",
        answerC = "Die Kontroverse um Pablo Nerudas Verstrickung mit Pinochets Regime",
        answerD = "Die Kontroverse um Mircea Eliades Tagebücher und seine Iron-Guard-Zugehörigkeit",
        correctAnswer = 3,
        explanation = "Mircea Eliade, der Religionswissenschaftler und Schriftsteller, war in den 1930er Jahren in die rumänische faschistischen Eisernen Garde verstrickt und äußerte antisemitische Positionen. Die Debatte um seine Tagebücher und seine Vergangenheit entzündete sich besonders nach seinem Tod 1986, als Forscher seine Verbindungen dokumentierten.",
        difficulty = 5,
        funFact = "Eliade hatte an der University of Chicago eine glänzende akademische Karriere und galt als einer der einflussreichsten Religionswissenschaftler des 20. Jahrhunderts. Sein Schweigen über die eigene faschistische Vergangenheit wird bis heute als schwerwiegendes moralisches Versagen diskutiert."
    ),

    // Question 49 — correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welches Werk des Marquis de Sade blieb über 100 Jahre nach seiner Veröffentlichung in nahezu allen europäischen Ländern verboten und wurde erst im 20. Jahrhundert als literarisches Dokument gewürdigt?",
        answerA = "Les 120 journées de Sodome (Die 120 Tage von Sodom)",
        answerB = "Justine ou les Malheurs de la vertu",
        answerC = "La Philosophie dans le boudoir",
        answerD = "Juliette",
        correctAnswer = 0,
        explanation = "'Die 120 Tage von Sodom' schrieb Sade 1785 auf einer 12 Meter langen Papierrolle in der Bastille. Das Manuskript galt nach dem Sturm auf die Bastille (1789) als verloren — Sade trauerte ihm sein Leben lang nach. Es wurde 1785 von einem Arzt gefunden und erst 1904 in Berlin erstmals veröffentlicht.",
        difficulty = 5,
        funFact = "Sade glaubte, das Manuskript sei bei der Erstürmung der Bastille vernichtet worden, und weinte tagelang um seinen Verlust. In Wirklichkeit hatte es ein adeliger Sammler gerettet. Es wanderte durch mehrere Hände, bis es der Psychiater Iwan Bloch 1904 in einer Kleinauflage veröffentlichte."
    ),

    // Question 50 — correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welches Konzept beschreibt die Theorie Roland Barthes', die 1968 proklamierte, dass bei der Interpretation eines Textes die Absichten des Autors keine privilegierte Bedeutung haben?",
        answerA = "Der 'Tod des Lesers' — die Emanzipation des Autors vom Publikum",
        answerB = "Der 'Tod des Autors' — die Autonomie des Textes von der Autorenintention",
        answerC = "Die 'Geburt des Signifikanten' — die Unabhängigkeit der Sprache von Bedeutung",
        answerD = "Die 'Écriture automatique' — das unbewusste Schreiben ohne Intention",
        correctAnswer = 1,
        explanation = "Roland Barthes erklärte in seinem Essay 'La mort de l'auteur' (1968), dass ein Text, sobald er geschrieben ist, von der Intention seines Autors abgelöst ist. Die Bedeutung entsteht erst im Akt des Lesens — der 'Tod des Autors' ist die Geburt des Lesers. Dies wurde zum Grundsatz des Poststrukturalismus.",
        difficulty = 5,
        funFact = "Michel Foucault antwortete 1969 mit dem Aufsatz 'Was ist ein Autor?', der die 'Autorfunktion' als diskursives Konstrukt beschreibt. Die beiden Texte zusammen definierten die Autorschaftsdebatte der zweiten Hälfte des 20. Jahrhunderts neu."
    )

)
