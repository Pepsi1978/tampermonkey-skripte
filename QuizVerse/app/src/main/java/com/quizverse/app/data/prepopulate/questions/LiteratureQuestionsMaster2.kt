package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun literatureQuestionsMaster2(): List<Question> = listOf(

    // Question 1 - Fernando Pessoa
    Question(
        categoryId = 10,
        questionText = "Unter welchen drei Hauptheteronymen schrieb der portugiesische Dichter Fernando Pessoa?",
        answerA = "Alberto Caeiro, Álvaro de Campos und Ricardo Reis",
        answerB = "Bernardo Soares, António Mora und Alexander Search",
        answerC = "Rafael Baldaia, Coelho Pacheco und Vicente Guedes",
        answerD = "Sebastião Marte, Thomas Crosse und I. I. Crosse",
        correctAnswer = 0,
        explanation = "Pessoas drei Hauptheteronyme sind Alberto Caeiro (der sensualistische Naturlyriker), Álvaro de Campos (der futuristische Ingenieur) und Ricardo Reis (der klassizistische Horaz-Nachahmer). Bernardo Soares gilt als Semi-Heteronym und ist der Autor des 'Buches der Unruhe'.",
        difficulty = 5,
        funFact = "Pessoa schuf über 70 Heteronyme mit eigenen Biografien, Weltanschauungen und Schreibstilen — ein einzigartiges Experiment in der Geschichte der Weltliteratur."
    ),

    // Question 2 - Fernando Pessoa
    Question(
        categoryId = 10,
        questionText = "Welcher Fernando-Pessoa-Heteronym gilt als sein Meisterlehrer und wurde von Pessoa als 'einziger wirklicher Dichter' bezeichnet?",
        answerA = "Álvaro de Campos",
        answerB = "Alberto Caeiro",
        answerC = "Ricardo Reis",
        answerD = "Bernardo Soares",
        correctAnswer = 1,
        explanation = "Alberto Caeiro, der einfache Naturlyriker ohne Bildung, gilt in Pessoas Heteronym-Universum als Meister aller anderen. Caeiro lehnt jegliche Metaphysik und Philosophie ab und besteht darauf, die Dinge ohne Deutung zu sehen: 'Ich habe keine Philosophie, ich habe Sinne.'",
        difficulty = 5,
        funFact = "Caeiro schrieb sein Hauptwerk 'O Guardador de Rebanhos' (Der Hüter der Herden) an einem einzigen Tag — Pessoa beschrieb dieses Erlebnis als außerordentliche kreative Überwältigung."
    ),

    // Question 3 - Bruno Schulz
    Question(
        categoryId = 10,
        questionText = "In welcher Stadt im heutigen Ukraine lebte und schrieb der polnisch-jüdische Autor Bruno Schulz, der 1942 von der Gestapo ermordet wurde?",
        answerA = "Lemberg (Lwiw)",
        answerB = "Stanislawów (Iwano-Frankiwsk)",
        answerC = "Drohobycz",
        answerD = "Czernowitz",
        correctAnswer = 2,
        explanation = "Bruno Schulz lebte sein gesamtes Leben in Drohobycz, das heute zur Ukraine gehört. Er verließ die Stadt kaum, unterrichtete als Zeichenlehrer und schrieb auf engstem Raum Werke von universaler mythischer Tiefe. 1942 erschoss ihn ein Gestapo-Offizier auf offener Straße.",
        difficulty = 5,
        funFact = "Schulz arbeitete an einem Roman namens 'Der Messias', der als sein Hauptwerk gelten sollte. Das Manuskript gilt als verschollen — es ist eines der größten Verluste der Weltliteratur."
    ),

    // Question 4 - Bruno Schulz
    Question(
        categoryId = 10,
        questionText = "Wie heißt das zweite Erzählwerk von Bruno Schulz, das 1937 erschien und auf Deutsch als 'Das Sanatorium zur Todesanzeige' bekannt ist?",
        answerA = "Sklepy cynamonowe",
        answerB = "Kometa",
        answerC = "Republika marzeń",
        answerD = "Sanatorium pod Klepsydrą",
        correctAnswer = 3,
        explanation = "Schulz' zweiter Erzählband heißt auf Polnisch 'Sanatorium pod Klepsydrą' — 'Sanatorium unter dem Zeichen der Sanduhr'. Der Titel spielt auf die Sanduhr (Klepsydra) als Symbol der verrinnenden Zeit an. Auf Deutsch erschien er als 'Das Sanatorium zur Todesanzeige', weil 'Klepsydra' auch Todesanzeige bedeutet.",
        difficulty = 5,
        funFact = "Schulz' erster Band heißt 'Sklepy cynamonowe' (Die Zimtläden, 1934). Beide Bände zusammen bilden sein gesamtes veröffentlichtes Prosawerk — ein schmales Werk von weltliterarischer Bedeutung."
    ),

    // Question 5 - Witold Gombrowicz
    Question(
        categoryId = 10,
        questionText = "Mit welchem Begriff bezeichnet Witold Gombrowicz in seinem Werk 'Ferdydurke' die aufgezwungene gesellschaftliche Unreife und äußere Form des Menschen?",
        answerA = "Gęba (Fratze/Maske)",
        answerB = "Pupa (Hinterteil/Puppa)",
        answerC = "Łydka (Wade)",
        answerD = "Forma (Form)",
        correctAnswer = 0,
        explanation = "In 'Ferdydurke' verwendet Gombrowicz den Begriff 'Gęba' (Fratze/Maske) für die von außen aufgezwungene Identität, die den Menschen formt und einengt. 'Pupa' steht für kindliche Unreife, 'Łydka' für moderne Jugendlichkeit. Diese grotesken Körpermetaphern sind Gombrowicz' Werkzeug zur Gesellschaftskritik.",
        difficulty = 5,
        funFact = "Gombrowicz schrieb 'Ferdydurke' 1937 in Polen und revisionierte es 1947 in Buenos Aires mit Hilfe einer Gruppe argentinischer Intellektueller — ein einzigartiger kollaborativer Übersetzungsprozess."
    ),

    // Question 6 - Witold Gombrowicz
    Question(
        categoryId = 10,
        questionText = "Welchen internationalen Literaturpreis gewann Witold Gombrowicz 1967 für seinen Roman 'Kosmos'?",
        answerA = "Prix Médicis",
        answerB = "International Prize for Literature (Prix International de Littérature)",
        answerC = "Prix Formentor",
        answerD = "Prix du Meilleur Livre Étranger",
        correctAnswer = 1,
        explanation = "Gombrowicz erhielt 1967 den International Prize for Literature (Prix International de Littérature) für 'Kosmos' — kurz bevor er 1969 starb. Er war einer der Hauptkandidaten für den Nobelpreis, den er nie erhielt. 'Kosmos' gilt laut The New Yorker als sein 'gelungenstes Werk'.",
        difficulty = 5,
        funFact = "Gombrowicz lebte von 1939 bis 1963 im argentinischen Exil, dann in West-Berlin und schließlich in Vence/Frankreich. Er kehrte nie nach Polen zurück."
    ),

    // Question 7 - Robert Walser
    Question(
        categoryId = 10,
        questionText = "Was sind die 'Mikrogramme' von Robert Walser, die zwischen 1925 und 1933 entstanden?",
        answerA = "Miniaturzeichnungen in winziger Schrift auf Zigarrenpapier",
        answerB = "Verschlüsselte Tagebucheinträge in einer selbst erfundenen Geheimschrift",
        answerC = "In einer winzigen, kaum lesbaren Bleistiftschrift verfasste Prosatexte auf kleinen Papierstücken",
        answerD = "Auf Streichholzschachteln notierte Aphorismen",
        correctAnswer = 2,
        explanation = "Walsers Mikrogramme sind Hunderte von Texten, die er in einer winzigen Bleistiftschrift auf kleinen Papierstreifen und -fetzen schrieb. Sie wurden lange für eine Geheimschrift gehalten; erst Jochen Greven gelang in den 1960ern die Entzifferung. Die 'Kritische Robert Walser-Ausgabe' (KWA) ediert sie als wichtiges Spätwerk.",
        difficulty = 5,
        funFact = "Walser verbrachte die letzten 23 Jahre seines Lebens (1933–1956) in psychiatrischen Anstalten und schrieb dort nichts mehr — ein rätselhafter Schreibabbruch, über den die Forschung bis heute spekuliert."
    ),

    // Question 8 - Robert Walser
    Question(
        categoryId = 10,
        questionText = "In welchem Schweizer Kanton liegt Herisau, wo Robert Walser von 1933 bis zu seinem Tod 1956 in einer psychiatrischen Anstalt lebte?",
        answerA = "Thurgau",
        answerB = "Appenzell Innerrhoden",
        answerC = "St. Gallen",
        answerD = "Appenzell Ausserrhoden",
        correctAnswer = 3,
        explanation = "Robert Walser lebte ab 1933 in der Heilanstalt Herisau im Kanton Appenzell Ausserrhoden. Er unternahm dort lange Spaziergänge, schrieb aber nichts mehr. Auf einem dieser Spaziergänge starb er am 25. Dezember 1956 — man fand ihn erfroren in einem Schneefeld.",
        difficulty = 5,
        funFact = "Das berühmte Foto von Walser, der tot im Schnee liegt, aufgenommen von einem Polizisten, ist eines der bekanntesten Literatenfotos der Schweizer Kulturgeschichte."
    ),

    // Question 9 - Clarice Lispector
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr und unter welchem Titel veröffentlichte Clarice Lispector ihren Debütroman, der sie als 23-Jährige berühmt machte?",
        answerA = "1943 — 'Nahe dem wilden Herzen' (Perto do Coração Selvagem)",
        answerB = "1946 — 'Der Apfel im Dunkeln' (A Maçã no Escuro)",
        answerC = "1944 — 'Der Lüster' (O Lustre)",
        answerD = "1949 — 'Die Stadt der Belagerung' (A Cidade Sitiada)",
        correctAnswer = 0,
        explanation = "Clarice Lispectors Debüt 'Perto do Coração Selvagem' (Nahe dem wilden Herzen) erschien 1943 und machte die 23-jährige Jurastudentin sofort berühmt. Der Titel stammt aus James Joyces 'Portrait of the Artist as a Young Man'. Die brasilianische Kritik sprach von einer literarischen Revolution.",
        difficulty = 5,
        funFact = "Lispector wurde als Kind aus der Ukraine nach Brasilien emigriert (geboren 1920 in Tchetchelnik, heute Ukraine). Portugiesisch war ihre Muttersprache, doch sie schrieb in einem vollkommen originellen, schwer übersetzbaren Stil."
    ),

    // Question 10 - Clarice Lispector
    Question(
        categoryId = 10,
        questionText = "Was ist das zentrale philosophische Erlebnis in Lispectors Roman 'Die Passion nach G.H.' (1964)?",
        answerA = "Eine Frau begegnet ihrer verschwundenen Tochter als Geist",
        answerB = "Eine Bildhauerin tötet eine Kakerlake und isst von ihr — eine mystische Grenzerfahrung des Ekels und der Vereinigung",
        answerC = "Eine Schriftstellerin verliert die Sprache und muss schweigen lernen",
        answerD = "Eine Frau beobachtet ihren eigenen Tod und kehrt ins Leben zurück",
        correctAnswer = 1,
        explanation = "In 'Die Passion nach G.H.' tötet die Protagonistin G.H. eine Kakerlake und isst dann von deren Masse — ein radikaler Akt, der als mystische Transzendenz, als Auflösung des Ich im Anderen erlebt wird. Der Roman ist eine intensive Meditation über Ekel, Gottesbegegnung und das Neutrale der Existenz.",
        difficulty = 5,
        funFact = "Lispector gilt als die bedeutendste Schriftstellerin Lateinamerikas und wurde oft mit Kafka verglichen. Ihr Werk wurde erst nach ihrem Tod 1977 international anerkannt."
    ),

    // Question 11 - Stanisław Lem
    Question(
        categoryId = 10,
        questionText = "Wie heißt Lems philosophisch-wissenschaftliches Hauptessaywerk von 1964, das die Grenzen und Möglichkeiten der Technologie und Zivilisation untersucht?",
        answerA = "Dialogi (Dialoge)",
        answerB = "Filozofia przypadku (Philosophie des Zufalls)",
        answerC = "Summa Technologiae",
        answerD = "Fantastyka i futurologia",
        correctAnswer = 2,
        explanation = "'Summa Technologiae' (1964) ist Lems wichtigstes theoretisches Werk — ein enzyklopädisches Essay über künstliche Intelligenz, virtuelle Realität, Evolutionstheorie und die Grenzen wissenschaftlichen Wissens. Der Titel ist eine Anspielung auf Thomas von Aquins 'Summa Theologiae'.",
        difficulty = 5,
        funFact = "Lem prophezeite in der 'Summa Technologiae' 1964 Konzepte wie virtuelle Realität, Suchmaschinen und Nanotechnologie — Jahrzehnte bevor diese Begriffe existierten."
    ),

    // Question 12 - Stanisław Lem
    Question(
        categoryId = 10,
        questionText = "Wie lautet der vollständige Titel des Lem-Werks, das als humoristische Erzählsammlung über die konstruierten Roboter-Ritter Trurl und Klapauzius gilt?",
        answerA = "Bajki Robotów (Robotermärchen)",
        answerB = "Opowieści o pilocie Pirxie (Pirx-Geschichten)",
        answerC = "Dzienniki gwiazdowe (Sterntagebücher)",
        answerD = "Cyberiada (Die Kyberiade)",
        correctAnswer = 3,
        explanation = "'Cyberiada' (Die Kyberiade, 1965) enthält Geschichten über die Konstrukteure Trurl und Klapauzius, die in einer von Maschinen bewohnten Galaxis leben. Die Erzählungen parodieren Mythen, Märchen und philosophische Gedankenexperimente mit skurriler Eleganz.",
        difficulty = 5,
        funFact = "Die Übersetzung der 'Kyberiade' gilt als eine der schwierigsten Übersetzungsaufgaben der Weltliteratur, weil Lem mit erfundenen Wörtern, Reimen und sprachlichen Kalauern arbeitet, die kaum in andere Sprachen übertragbar sind."
    ),

    // Question 13 - Danilo Kiš
    Question(
        categoryId = 10,
        questionText = "Welchen Literaturskandal löste Danilo Kiš' Buch 'Ein Grabmal für Boris Dawidowitsch' (1976) in Jugoslawien aus?",
        answerA = "Kiš wurde des Plagiats beschuldigt, weil er reale Quellen ohne deutliche Kennzeichnung literarisch verarbeitete",
        answerB = "Das Buch wurde wegen Obszönität verboten",
        answerC = "Das Buch beleidigte Marschall Tito und wurde als staatsfeindlich eingestuft",
        answerD = "Kiš wurde verdächtigt, ein westlicher Spion zu sein",
        correctAnswer = 0,
        explanation = "Nach dem Erscheinen 1976 wurde Kiš massiv des Plagiats beschuldigt, weil er reale historische Dokumente (Memoiren, Archivquellen) ohne explizite Kennzeichnung literarisch verarbeitete. Die Debatte war hochpolitisch. Kiš verteidigte sich brillant: Die Vermischung von Fakten und Fiktion sei das Wesen seiner Kunst.",
        difficulty = 5,
        funFact = "Kiš antwortete auf den Plagiatsvorwurf mit dem Essay 'Čas anatomije' (Stunde der Anatomie, 1978), einer vernichtenden Abrechnung mit seinen Kritikern, die selbst zum Literaturklassiker wurde."
    ),

    // Question 14 - Danilo Kiš
    Question(
        categoryId = 10,
        questionText = "Wie heißt die titelgebende Erzählung in Kiš' Sammlung 'Enzyklopädie der Toten' (1983), in der ein fiktives Buch beschrieben wird, das das Leben jedes gewöhnlichen Menschen verzeichnet?",
        answerA = "Simon Čudotvorca (Simon der Wundertäter)",
        answerB = "Enciklopedija mrtvih (Enzyklopädie der Toten)",
        answerC = "Knjiga kraljeva i budala (Buch der Könige und Narren)",
        answerD = "Legenda o spavačima (Legende der Schlafenden)",
        correctAnswer = 1,
        explanation = "In der Titelerzählung 'Enciklopedija mrtvih' träumt eine Frau, sie lese in einer himmlischen Bibliothek die vollständige Biografie ihres kürzlich verstorbenen Vaters — jede Einzelheit seines Lebens ist darin verzeichnet. Die Enzyklopädie ist ein Monument für die Vergessenen der Geschichte.",
        difficulty = 5,
        funFact = "Kiš war der Sohn eines ungarischen Juden, der in Auschwitz umkam. Seine gesamte Literatur ist ein Versuch, das Gedächtnis gegen das Vergessen zu stellen — die 'Enzyklopädie der Toten' ist sein radikalster Ausdruck davon."
    ),

    // Question 15 - Halldór Laxness
    Question(
        categoryId = 10,
        questionText = "Für welchen Roman erhielt Halldór Laxness hauptsächlich den Nobelpreis für Literatur 1955, ein historisches Werk über die isländische Identität?",
        answerA = "Sjálfstætt fólk (Islandglocke)",
        answerB = "Atómstöðin (Die Atomstation)",
        answerC = "Sjálfstætt fólk (Unabhängige Menschen)",
        answerD = "Íslandsklukkan (Die Islandglocke)",
        correctAnswer = 2,
        explanation = "'Sjálfstætt fólk' (Unabhängige Menschen, 1934–35) ist Laxness' bekanntester Roman: Er erzählt vom störrischen Schafbauern Bjartur von Summerhouses, der auf einem verfluchten Moorstück seine absolute Unabhängigkeit verteidigt — auf Kosten seiner Familie. Es ist ein grandioses Epos über isländischen Eigensinn.",
        difficulty = 5,
        funFact = "Laxness bezeichnete sich selbst als Sozialist und war in jungen Jahren zum Katholizismus konvertiert. Seine politischen Überzeugungen änderten sich mehrfach drastisch — sein Werk blieb stets auf der Seite der Armen."
    ),

    // Question 16 - Halldór Laxness
    Question(
        categoryId = 10,
        questionText = "Gegen welche politische Entscheidung Islands richtet sich Laxness' Roman 'Atómstöðin' (Die Atomstation, 1948)?",
        answerA = "Islands Beitritt zur NATO",
        answerB = "Den Ausverkauf isländischer Fischgründe an ausländische Konzerne",
        answerC = "Islands Verzicht auf einen eigenen Atomreaktor",
        answerD = "Die Erlaubnis, einen US-amerikanischen Militärstützpunkt auf Island zu errichten",
        correctAnswer = 3,
        explanation = "In 'Atómstöðin' kritisiert Laxness die umstrittene Entscheidung des isländischen Parlaments, den USA die Errichtung des Militärstützpunkts Keflavík zu erlauben. Das Buch, aus Sicht eines Dienstmädchens aus dem ländlichen Norden erzählt, ist ein antimilitaristisches und antikapitalistisches Pamphlet in Romanform.",
        difficulty = 5,
        funFact = "Die Errichtung des US-Stützpunkts auf Island teilte die isländische Gesellschaft tief. Laxness schrieb den Roman in wenigen Monaten als direkte politische Reaktion."
    ),

    // Question 17 - Bohumil Hrabal
    Question(
        categoryId = 10,
        questionText = "In welchem Hrabal-Roman arbeitet der Protagonist Hanta 35 Jahre lang in einer Altpapierpresse und rettet dabei heimlich wertvolle Bücher?",
        answerA = "Příliš hlučná samota (Allzu laute Einsamkeit)",
        answerB = "Postřižiny (Haarschnitt)",
        answerC = "Ostře sledované vlaky (Scharf beobachtete Züge)",
        answerD = "Obsluhoval jsem anglického krále (Ich habe den englischen König bedient)",
        correctAnswer = 0,
        explanation = "In 'Příliš hlučná samota' (Allzu laute Einsamkeit, 1976) presst Hanta 35 Jahre lang Altpapier und versteckt dabei wertvolle Bücher und Kunstdrucke in den Ballen. Das Buch ist eine lyrische Elegie auf die Kultur, das Lesen und den einzelnen Menschen gegen das System.",
        difficulty = 5,
        funFact = "Hrabal schrieb 'Allzu laute Einsamkeit' zunächst als Samizdat (verbotene Untergrundpublikation) unter dem kommunistischen Regime. Er überarbeitete den Text mehrfach und nannte ihn sein liebstes Werk."
    ),

    // Question 18 - Bohumil Hrabal
    Question(
        categoryId = 10,
        questionText = "Für welches Werk erhielt Bohumil Hrabal seine größte internationale Aufmerksamkeit, das von einem naiven Kellner erzählt, der unbeabsichtigt zum Millionär wird?",
        answerA = "Ostře sledované vlaky (Scharf beobachtete Züge)",
        answerB = "Obsluhoval jsem anglického krále (Ich habe den englischen König bedient)",
        answerC = "Postřižiny (Haarschnitt)",
        answerD = "Tanečni hodiny pro starší a pokročilé (Tanzstunden für Fortgeschrittene)",
        correctAnswer = 1,
        explanation = "'Obsluhoval jsem anglického krále' (Ich habe den englischen König bedient, 1971/1983) folgt dem kleinen Kellner Dítě, der seinen Traum vom Millionär verfolgt und dabei durch die gesamte tschechische Geschichte des 20. Jahrhunderts getragen wird. Jiří Menzel verfilmte das Buch 2006.",
        difficulty = 5,
        funFact = "Hrabal starb 1997, als er aus dem Fenster eines Prager Krankenhauses fiel — er wollte angeblich Tauben füttern. Er war 82 Jahre alt. Sein Tod ist bis heute Gegenstand von Diskussionen."
    ),

    // Question 19 - Natsume Soseki
    Question(
        categoryId = 10,
        questionText = "Auf welcher Banknote erschien in Japan das Porträt von Natsume Soseki als Anerkennung seiner nationalen Bedeutung?",
        answerA = "10.000-Yen-Schein",
        answerB = "5.000-Yen-Schein",
        answerC = "1.000-Yen-Schein",
        answerD = "500-Yen-Schein",
        correctAnswer = 2,
        explanation = "Natsume Soseki zierte von 1984 bis 2004 die japanische 1.000-Yen-Banknote — eine außerordentliche Ehre, die seine Bedeutung als Nationalschriftsteller Japans unterstreicht. Er gilt als Begründer der modernen japanischen Literatur.",
        difficulty = 5,
        funFact = "Soseki lebte von 1900 bis 1903 in London als Regierungsstipendiat, um westliche Literatur zu studieren. Diese Zeit empfand er als zutiefst unglücklich — das Erlebnis des kulturellen Fremdseins prägte sein gesamtes Werk."
    ),

    // Question 20 - Natsume Soseki
    Question(
        categoryId = 10,
        questionText = "Welches von Sosekis Werken erschien erstmals als Zeitungsfortsetzungsroman in der Asahi Shimbun und besteht aus drei Teilen — 'Sensei', 'Meine Eltern und ich' und 'Senseis Testament'?",
        answerA = "Wagahai wa neko de aru (Ich bin eine Katze)",
        answerB = "Botchan",
        answerC = "Mon (Das Tor)",
        answerD = "Kokoro",
        correctAnswer = 3,
        explanation = "'Kokoro' (1914) erschien als Zeitungsroman in der Asahi Shimbun und ist in drei Teile gegliedert. Im dritten Teil, 'Senseis Testament', erklärt der Sensei in einem langen Brief seine Lebensgeschichte und den Grund für seinen geplanten Selbstmord — ein erschütterndes Dokument über Schuld und Loyalität.",
        difficulty = 5,
        funFact = "'Kokoro' bedeutet auf Japanisch sowohl 'Herz' als auch 'Geist', 'Seele' und 'Gefühl'. Das Wort entzieht sich einer eindeutigen Übersetzung — ein Hinweis auf die kulturelle Vielschichtigkeit des Romans."
    ),

    // Question 21 - Pessoa vertieft
    Question(
        categoryId = 10,
        questionText = "Welches unvollendete Prosawerk Fernando Pessoas, veröffentlicht erstmals 1982, wird dem Semi-Heteronym Bernardo Soares zugeschrieben?",
        answerA = "Livro do Desassossego (Das Buch der Unruhe)",
        answerB = "Mensagem (Botschaft)",
        answerC = "O Banqueiro Anarquista (Der anarchistische Bankier)",
        answerD = "Ultimatum",
        correctAnswer = 0,
        explanation = "'Livro do Desassossego' (Das Buch der Unruhe) ist ein fragmentarisches Prosawerk, das Pessoa hinterließ und das erstmals 1982 — 47 Jahre nach seinem Tod — aus Hunderten von Zetteln zusammengesetzt wurde. Bernardo Soares, Buchhaltungsgehilfe in Lissabon, ist sein Erzähler.",
        difficulty = 5,
        funFact = "Pessoa starb 1935 und hinterließ eine Kiste mit mehr als 27.000 Manuskriptseiten und Fragmenten. Die wissenschaftliche Erschließung seines Nachlasses dauert bis heute an."
    ),

    // Question 22 - Schulz vertieft
    Question(
        categoryId = 10,
        questionText = "Welcher Nobel-Autor entdeckte und förderte Bruno Schulz' Werk und setzte sich für dessen internationale Anerkennung ein?",
        answerA = "Czesław Miłosz",
        answerB = "Isaac Bashevis Singer",
        answerC = "Wisława Szymborska",
        answerD = "Günter Grass",
        correctAnswer = 1,
        explanation = "Isaac Bashevis Singer, der 1978 den Nobelpreis erhielt, schrieb ein berühmtes Vorwort zu Schulz' englischer Ausgabe von 'Die Zimtläden' und bezeichnete ihn als einen der bedeutendsten Prosaisten des 20. Jahrhunderts. Singers Förderung trug wesentlich zur internationalen Wiederentdeckung bei.",
        difficulty = 5,
        funFact = "Philip Roth schloss Schulz in seine Reihe 'Writers from the Other Europe' ein und veröffentlichte ihn beim Penguin Verlag — eine weitere wichtige Etappe der Schulz-Rezeption im englischsprachigen Raum."
    ),

    // Question 23 - Gombrowicz vertieft
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr fuhr Gombrowicz nach Argentinien und blieb dort zufällig gestrandet, weil der Zweite Weltkrieg ausbrach?",
        answerA = "1937",
        answerB = "1941",
        answerC = "1939",
        answerD = "1936",
        correctAnswer = 2,
        explanation = "Gombrowicz fuhr im August 1939 mit einem polnischen Schiff zur Eröffnungsreise nach Argentinien. Als Deutschland Polen überfiel und der Zweite Weltkrieg begann, blieb er in Buenos Aires stranden — eine Einwegfahrt, die zu einem 24-jährigen Exil wurde.",
        difficulty = 5,
        funFact = "Gombrowicz lebte in Buenos Aires in ärmlichsten Verhältnissen, spielte Schach im Café Rex und schrieb sein 'Tagebuch' (Dziennik), das zu einem seiner wichtigsten Werke wurde."
    ),

    // Question 24 - Walser vertieft
    Question(
        categoryId = 10,
        questionText = "In welcher Berliner Phase (1905–1913) entstanden Walsers drei Hauptromane — und was war seine berufliche Tätigkeit dort?",
        answerA = "Er war Schauspieler am Deutschen Theater",
        answerB = "Er arbeitete als Korrektor in einem Verlag",
        answerC = "Er war Diener bei einem preußischen Adligen",
        answerD = "Er arbeitete als Sekretär bei einem Ingenieur und danach als freier Schriftsteller",
        correctAnswer = 3,
        explanation = "In Berlin arbeitete Walser zunächst als Diener (der 'Gehülfe' hat autobiografische Züge) und dann als freier Schriftsteller, den sein Bruder Karl, ein Bühnenbildner, unterstützte. In dieser Phase schrieb er 'Geschwister Tanner' (1907), 'Der Gehülfe' (1908) und 'Jakob von Gunten' (1909).",
        difficulty = 5,
        funFact = "Walsers 'Jakob von Gunten' handelt von einem jungen Mann, der freiwillig in eine Dienerschule geht — ein Thema, das Walsers eigene Faszination für Subordination und Kleinheit spiegelt."
    ),

    // Question 25 - Lispector vertieft
    Question(
        categoryId = 10,
        questionText = "In welchem Land war Clarice Lispector aufgrund der diplomatischen Karriere ihres Mannes viele Jahre lang im Exil, bevor sie dauerhaft nach Rio de Janeiro zurückkehrte?",
        answerA = "In den USA, England und der Schweiz",
        answerB = "In Frankreich, Deutschland und Portugal",
        answerC = "In Argentinien, Mexiko und Spanien",
        answerD = "In den USA (Washington D.C.) und dann in der Schweiz und England",
        correctAnswer = 0,
        explanation = "Lispector lebte mit ihrem Diplomaten-Ehemann Maury Gurgel Valente viele Jahre im Ausland: zunächst in Berna/Schweiz, dann in England, Norditalien und schließlich in Washington D.C. Erst 1959 kehrte sie dauerhaft nach Brasilien zurück, nachdem die Ehe gescheitert war.",
        difficulty = 5,
        funFact = "Lispector schrieb mehrere ihrer wichtigsten Romane im Ausland, auf Portugiesisch, fern ihrer Heimat — ein Exil, das ihr Schreiben über Entfremdung und Einsamkeit direkt nährte."
    ),

    // Question 26 - Lem vertieft
    Question(
        categoryId = 10,
        questionText = "Welche US-amerikanische Science-Fiction-Autorenvereinigung schloss Stanisław Lem 1976 aus ihrer Mitgliedschaft aus — und warum?",
        answerA = "Die Science Fiction Writers of America (SFWA), weil er ausländischer Autor war und keine englischen Originalwerke schrieb",
        answerB = "Die Science Fiction Writers of America (SFWA), weil er in einem Essay amerikanische Science-Fiction als primitiv und kommerziell kritisiert hatte",
        answerC = "Die World Science Fiction Society (WSFS), weil er den Hugo Award abgelehnt hatte",
        answerD = "Die Horror Writers Association (HWA), wegen politischer Differenzen",
        correctAnswer = 1,
        explanation = "Die SFWA, die Lem 1973 als erstem ausländischem Ehrenmitglied beigetreten war, entzog ihm 1976 die Ehrenmitgliedschaft, nachdem er in Essays amerikanische Science-Fiction als kommerziellen Schund ohne philosophische Tiefe bezeichnet hatte. Der Rauswurf löste eine internationale Kontroverse aus.",
        difficulty = 5,
        funFact = "Lem schrieb danach noch schärfere Kritiken amerikanischer SF. Philip K. Dick beschuldigte Lem sogar, ein kollektives kommunistisches Komitee zu sein — er glaubte nicht, dass eine einzelne Person so viel schreiben konnte."
    ),

    // Question 27 - Kiš vertieft
    Question(
        categoryId = 10,
        questionText = "Aus welchen drei Romanen besteht Kiš' autobiografische 'Familienzirkus'-Trilogie, die seine jüdische Kindheit im Zweiten Weltkrieg verarbeitet?",
        answerA = "Mansarda, Psalam 44 und Bašta, pepeo",
        answerB = "Enciklopedija mrtvih, Čas anatomije und Homo Poeticus",
        answerC = "Bašta, pepeo; Peščanik; und Rani jadi",
        answerD = "Mansarda, Noć i magla und Grobnica za Borisa Davidoviča",
        correctAnswer = 2,
        explanation = "Kiš' 'Familienzirkus'-Trilogie besteht aus 'Rani jadi' (Frühe Leiden, 1969), 'Bašta, pepeo' (Garten, Asche, 1965) und 'Peščanik' (Sanduhr, 1972). Alle drei kreisen um die Figur des Vaters Eduard Kiš, der in Auschwitz umkam, und sind zugleich autobiografisch und hochliterarisch.",
        difficulty = 5,
        funFact = "'Garten, Asche' gilt als Kiš' poetischstes Werk: Es evoziert die surrealistische Welt eines Kindes, dessen Vater ein exzentrisches Reisebüro betreibt und Fahrpläne des Universums entwirft."
    ),

    // Question 28 - Laxness vertieft
    Question(
        categoryId = 10,
        questionText = "Wie heißt die historische Romantrilogie von Halldór Laxness, die im 17.–18. Jahrhundert spielt und den Kampf eines isländischen Bauern um sein Recht schildert?",
        answerA = "Kristnihald undir Jökli (Am Gletscher)",
        answerB = "Sjálfstætt fólk (Unabhängige Menschen)",
        answerC = "Heimsljós (Weltlicht)",
        answerD = "Íslandsklukkan (Die Islandglocke)",
        correctAnswer = 3,
        explanation = "'Íslandsklukkan' (Die Islandglocke, 1943–46) ist eine dreiteilige Trilogie, die im 17.–18. Jahrhundert spielt und den Kampf des Bauern Jón Hreggviðsson gegen dänische Kolonialherrschaft schildert. Die Islandglocke — ein Symbol für islands Unabhängigkeit — wurde kurz vor der Unabhängigkeitserklärung 1944 geschrieben.",
        difficulty = 5,
        funFact = "Island erklärte 1944 seine Unabhängigkeit von Dänemark — genau in dem Jahr, in dem Laxness' Trilogie abgeschlossen wurde. Das Werk wurde unmittelbar als Nationalepode der isländischen Unabhängigkeit gelesen."
    ),

    // Question 29 - Hrabal vertieft
    Question(
        categoryId = 10,
        questionText = "Welche literarische Technik ist charakteristisch für Hrabals Stil, bekannt als 'Pábitelství'?",
        answerA = "Sprechduktus des gewöhnlichen Mannes, mäanderndes Erzählen, Mischung aus Trivialem und Philosophischem",
        answerB = "Strenger Realismus ohne jeden Humor",
        answerC = "Surrealistische Traumsequenzen und Bewusstseinsströme",
        answerD = "Historisch exakte Dokumentarprosa ohne fiktive Elemente",
        correctAnswer = 0,
        explanation = "'Pábitelství' bezeichnet Hrabals Erzähltechnik: den atemlosen, mäandernden Sprechduktus gewöhnlicher Menschen, die in scheinbar trivialen Beobachtungen plötzlich philosophische Tiefen aufdecken. Seine Figuren reden unablässig und erzählen Geschichten in Geschichten.",
        difficulty = 5,
        funFact = "Hrabal war ein begeisterter Biertrinken im Prager Wirtshaus U zlatého tygra (Beim Goldenen Tiger). Er traf dort 1994 den US-Präsidenten Clinton — eine Episode, die als Kuriosum in die Literaturgeschichte einging."
    ),

    // Question 30 - Soseki vertieft
    Question(
        categoryId = 10,
        questionText = "Welches von Sosekis Frühwerken erschien 1905 als Fortsetzungsroman aus der Perspektive einer Hauskatze und macht sich satirisch über die japanische Mittelklasse lustig?",
        answerA = "Kusamakura (Haiku-Kissen)",
        answerB = "Wagahai wa neko de aru (Ich bin eine Katze)",
        answerC = "Botchan",
        answerD = "Sanshiro",
        correctAnswer = 1,
        explanation = "'Wagahai wa neko de aru' (Ich bin eine Katze, 1905–06) ist Sosekis erstes größeres Werk. Eine namenlose Hauskatze beobachtet mit spöttischer Distanz die Spießbürgerlichkeit ihres Herrn, eines Englischlehrers, und seiner Bekannten. Der Roman machte Soseki über Nacht berühmt.",
        difficulty = 5,
        funFact = "Der berühmte erste Satz 'Wagahai wa neko de aru. Namae wa mada nai.' (Ich bin eine Katze. Einen Namen habe ich noch nicht.) gilt als einer der bekanntesten Romananfänge der japanischen Literatur."
    ),

    // Question 31 - Władysław Reymont
    Question(
        categoryId = 10,
        questionText = "Welcher polnische Autor erhielt 1924 den Nobelpreis für Literatur für ein vierbändiges Epos über das bäuerliche Leben, das nach den Jahreszeiten gegliedert ist?",
        answerA = "Stefan Żeromski",
        answerB = "Bolesław Prus",
        answerC = "Władysław Reymont",
        answerD = "Henryk Sienkiewicz",
        correctAnswer = 2,
        explanation = "Władysław Reymont erhielt den Nobelpreis 1924 für sein Hauptwerk 'Chłopi' (Die Bauern, 1904–09), ein vierbändiges Epos über das Leben im polnischen Dorf Lipce, gegliedert nach den vier Jahreszeiten. Es ist eines der bedeutendsten Werke des polnischen Naturalismus.",
        difficulty = 5,
        funFact = "Reymont war zunächst Schauspieler, dann Eisenbahner. Nach einem Eisenbahnunfall 1900 widmete er sich ganz dem Schreiben. Er gewann den Nobelpreis noch vor dem favorisierten Stefan Żeromski."
    ),

    // Question 32 - Jean Rhys
    Question(
        categoryId = 10,
        questionText = "In welchem Roman von Jean Rhys (1966) wird die erste Frau aus Brontës 'Jane Eyre' — Bertha Mason — als sympathische kreolische Frau Antoinette erzählt?",
        answerA = "Good Morning, Midnight",
        answerB = "Voyage in the Dark",
        answerC = "After Leaving Mr Mackenzie",
        answerD = "Wide Sargasso Sea (Das weite Sargassomeer)",
        correctAnswer = 3,
        explanation = "'Wide Sargasso Sea' (Das weite Sargassomeer, 1966) ist Jean Rhys' Meisterwerk und eine Vorgeschichte zu Charlotte Brontës 'Jane Eyre'. Die kreolische Antoinette Cosway — bei Brontë die 'verrückte Frau auf dem Dachboden' — bekommt hier ihre eigene Stimme, Herkunft und Würde zurück.",
        difficulty = 5,
        funFact = "Jean Rhys war selbst auf der Karibikinsel Dominica geboren und verstand Antoinettes Geschichte als ihre eigene — die Geschichte einer entwurzelten Kreolin in einer weißen europäischen Welt."
    ),

    // Question 33 - Knut Hamsun
    Question(
        categoryId = 10,
        questionText = "Welcher norwegische Nobelpreisträger schrieb 1890 den Roman 'Hunger', der als Gründungstext des modernistischen Bewusstseinsromans gilt?",
        answerA = "Knut Hamsun",
        answerB = "Henrik Ibsen",
        answerC = "Alexander Kielland",
        answerD = "Bjørnstjerne Bjørnson",
        correctAnswer = 0,
        explanation = "'Hunger' (Sult, 1890) von Knut Hamsun gilt als erster modernistischer Bewusstseinsroman: Ein namenloser Schreiber hungert in Christiania (Oslo), und sein Bewusstsein — irational, halluzinatorisch, selbstzerstörerisch — steht im Mittelpunkt. Hamsun erhielt 1920 den Nobelpreis.",
        difficulty = 5,
        funFact = "Hamsun kollaborierte im Zweiten Weltkrieg mit den deutschen Besatzern Norwegens. Er schickte nach Hitlers Tod seine Nobelmedaille an Goebbels. Trotzdem wird 'Hunger' als literarisches Meisterwerk anerkannt."
    ),

    // Question 34 - Yasunari Kawabata
    Question(
        categoryId = 10,
        questionText = "Wie heißt Kawabatas Roman, in dem ein alter Kunsthändler die Nächte damit verbringt, neben schlafenden nackten Mädchen zu liegen — ohne sie zu berühren?",
        answerA = "Yukiguni (Schneeland)",
        answerB = "Nemureru Bijo (Die schlafenden Schönen)",
        answerC = "Koto (Kyoto)",
        answerD = "Meijin (Der Meister)",
        correctAnswer = 1,
        explanation = "'Nemureru Bijo' (Die schlafenden Schönen, 1960–61) ist Kawabatas dunkelster Roman: Der alte Eguchi besucht ein geheimes Haus, wo schlafende, betäubte Mädchen liegen. Er berührt sie nicht, betrachtet aber seinen eigenen Verfall, seine Erinnerungen und den Tod. Gabriel García Márquez ließ sich von diesem Werk zu 'Erinnerung an meine traurigen Huren' inspirieren.",
        difficulty = 5,
        funFact = "Kawabata war der erste japanische Nobelpreisträger für Literatur (1968). Zwei Jahre nach seinem Freund Mishimas Selbstmord starb er 1972 ebenfalls durch Selbstmord — ohne Abschiedsbrief."
    ),

    // Question 35 - Sándor Márai
    Question(
        categoryId = 10,
        questionText = "Welcher ungarische Autor schrieb den Roman 'Die Glut' (1942), der erst in den 1990ern wiederentdeckt wurde und weltweit Millionen Leser fand?",
        answerA = "Imre Kertész",
        answerB = "György Konrád",
        answerC = "Sándor Márai",
        answerD = "Péter Esterházy",
        correctAnswer = 2,
        explanation = "'A gyertyák csonkig égnek' (Die Glut, 1942) von Sándor Márai wurde erst 1998 auf Deutsch veröffentlicht — 56 Jahre nach dem Original. Es wurde zum internationalen Bestseller und löste eine weltweite Márai-Renaissance aus. Zwei alte Männer sprechen in einem Schloss eine Nacht lang über Freundschaft, Verrat und Liebe.",
        difficulty = 5,
        funFact = "Márai emigrierte 1948 aus Ungarn, nachdem die Kommunisten die Macht übernahmen. Er lebte im Exil in der Schweiz, Italien und schließlich San Diego/USA, wo er 1989 kurz vor dem Fall des Eisernen Vorhangs Selbstmord beging."
    ),

    // Question 36 - Mercè Rodoreda
    Question(
        categoryId = 10,
        questionText = "Welche katalanische Autorin schrieb den Roman 'La plaça del Diamant' (1962), der als wichtigstes Werk der katalanischen Literatur des 20. Jahrhunderts gilt?",
        answerA = "Maria Aurèlia Capmany",
        answerB = "Montserrat Roig",
        answerC = "Carme Riera",
        answerD = "Mercè Rodoreda",
        correctAnswer = 3,
        explanation = "'La plaça del Diamant' (1962) — auf Deutsch 'Auf der Plaça del Diamant' — erzählt die Geschichte der naiven Colometa/Natàlia durch den Spanischen Bürgerkrieg und die Franco-Diktatur. Mercè Rodoreda schrieb es im Exil in Genf und schuf damit das bedeutendste Werk der katalanischen Nachkriegsliteratur.",
        difficulty = 5,
        funFact = "Rodoreda lebte über 30 Jahre im Exil — zunächst in Frankreich, dann in der Schweiz — weil sie auf der Seite der Republik gekämpft hatte. Ihr Roman wurde zunächst in Mexiko veröffentlicht, da er in Spanien verboten war."
    ),

    // Question 37 - Elias Canetti
    Question(
        categoryId = 10,
        questionText = "Unter welchem Originaltitel erschien Elias Canettis einziger Roman von 1935, der auf Deutsch zunächst 'Kant fängt Feuer' hieß und später als 'Die Blendung' bekannt wurde?",
        answerA = "Die Blendung",
        answerB = "Der Büchermensch",
        answerC = "Auto-da-Fé",
        answerD = "Die Masse und die Macht",
        correctAnswer = 0,
        explanation = "'Die Blendung' (1935) ist Canettis einziger Roman. Er erschien zunächst unter dem Arbeitstitel 'Kant fängt Feuer'. Der englische Titel 'Auto-da-Fé' (Ketzerverfolgung) bezieht sich auf die Schlussszene, in der der sinophile Gelehrte Kien seine Bibliothek — und sich selbst — verbrennt.",
        difficulty = 5,
        funFact = "Canetti erhielt 1981 den Nobelpreis für Literatur, vor allem für 'Masse und Macht' (1960) und sein essayistisches Werk. 'Die Blendung' wurde beim Erscheinen kaum beachtet und erst Jahrzehnte später als Meisterwerk erkannt."
    ),

    // Question 38 - Ismail Kadare
    Question(
        categoryId = 10,
        questionText = "Welcher albanische Autor schrieb den Roman 'General der toten Armee' (1963), der ihm internationale Bekanntheit brachte?",
        answerA = "Dritëro Agolli",
        answerB = "Ismail Kadare",
        answerC = "Fatos Kongoli",
        answerD = "Petro Marko",
        correctAnswer = 1,
        explanation = "Ismail Kadare ist Albaniens bedeutendster Schriftsteller und mehrfacher Nobelpreis-Kandidat. Sein Debütroman 'Gjenerali i ushtrisë së vdekur' (General der toten Armee, 1963) handelt von einem italienischen General, der nach dem Zweiten Weltkrieg die Gebeine gefallener Soldaten aus Albanien heimholen soll.",
        difficulty = 5,
        funFact = "Kadare lebte unter dem stalinistischen Diktator Enver Hoxha und musste seine Bücher so schreiben, dass sie das Regime passieren konnten — eine literarische Gratwanderung, die sein gesamtes Werk prägte."
    ),

    // Question 39 - Witold Gombrowicz Tagebuch
    Question(
        categoryId = 10,
        questionText = "Wie beginnt Gombrowicz' berühmtes 'Tagebuch' (Dziennik, 1953–69) mit welchen drei Worten, die seinen programmatischen Narzissmus demonstrieren?",
        answerA = "Polen. Ich. Argentinien.",
        answerB = "Montag. Ich. Dienstag.",
        answerC = "Montag. Ich. Dienstag. Ich. Mittwoch. Ich. Donnerstag. Ich.",
        answerD = "Ego. Ego. Ego.",
        correctAnswer = 2,
        explanation = "Gombrowicz' 'Tagebuch' beginnt mit dem berühmten Eintrag: 'Montag. Ich. / Dienstag. Ich. / Mittwoch. Ich. / Donnerstag. Ich.' — eine provokante Selbstbehauptung des Ich gegen die gesellschaftlichen Zwänge. Das Tagebuch ist eines der bedeutendsten literarischen Selbstdokumente des 20. Jahrhunderts.",
        difficulty = 5,
        funFact = "Das 'Tagebuch' erschien zunächst in der polnischen Exilzeitschrift 'Kultura' in Paris. In Polen durfte es erst nach dem Zusammenbruch des Kommunismus erscheinen."
    ),

    // Question 40 - Masuji Ibuse
    Question(
        categoryId = 10,
        questionText = "Welcher japanische Autor schrieb den 1966 erschienenen Roman 'Schwarzer Regen' über die Atomkatastrophe von Hiroshima aus der Perspektive von Überlebenden?",
        answerA = "Kenzaburō Ōe",
        answerB = "Yukio Mishima",
        answerC = "Shūsaku Endō",
        answerD = "Masuji Ibuse",
        correctAnswer = 3,
        explanation = "'Kuroi Ame' (Schwarzer Regen, 1966) von Masuji Ibuse ist ein Meisterwerk über Hiroshima, das aus Tagebüchern und Zeitzeugenberichten komponiert ist. Der 'schwarze Regen' bezeichnet den radioaktiv kontaminierten Regen, der nach der Explosion fiel und die Überlebenden krank machte.",
        difficulty = 5,
        funFact = "Ibuse recherchierte jahrelang und interviewte Überlebende. Sein Roman unterscheidet sich von anderen Hiroshima-Werken durch seine emotionale Zurückhaltung und dokumentarische Genauigkeit."
    ),

    // Question 41 - Gyula Illyés
    Question(
        categoryId = 10,
        questionText = "Welches Langgedicht des ungarischen Dichters Gyula Illyés aus dem Jahr 1950 beschreibt die Tyrannei als allgegenwärtigen Geist, der jeden Aspekt des Lebens durchdringt?",
        answerA = "Egy mondat a zsarnokságról (Ein Satz über die Tyrannei)",
        answerB = "Bartók",
        answerC = "Puszták népe (Volk der Puszta)",
        answerD = "Ozorai példa",
        correctAnswer = 0,
        explanation = "'Egy mondat a zsarnokságról' (Ein Satz über die Tyrannei, 1950) ist ein einziger langer Satz, der in immer neuen Bildern zeigt, wie die Tyrannei sich in alle Winkel des Alltags — Schlaf, Essen, Liebe, Sprache — einschleicht. Das Gedicht konnte erst nach dem Aufstand von 1956 veröffentlicht werden.",
        difficulty = 5,
        funFact = "Illyés schrieb das Gedicht im Verborgenen, da es unter dem kommunistischen Regime unmöglich öffentlich erscheinen konnte. Es wurde 1956 nach dem Ungarischen Aufstand erstmals gedruckt."
    ),

    // Question 42 - Agota Kristof
    Question(
        categoryId = 10,
        questionText = "Aus welchem Land floh Agota Kristof 1956 und in welcher Sprache schrieb sie ihr Hauptwerk 'Das große Heft' (Le Grand Cahier, 1986)?",
        answerA = "Sie floh aus der Tschechoslowakei und schrieb auf Deutsch",
        answerB = "Sie floh aus Ungarn und schrieb auf Französisch",
        answerC = "Sie floh aus Rumänien und schrieb auf Französisch",
        answerD = "Sie floh aus Polen und schrieb auf Schwedisch",
        correctAnswer = 1,
        explanation = "Agota Kristof floh 1956 nach dem Ungarischen Aufstand in die Schweiz. Sie schrieb 'Das große Heft' und die dazugehörige Trilogie auf Französisch — ihrer vierten Sprache, die sie sich mühsam selbst beibrachte. 'Das große Heft' erzählt aus der Sicht von Zwillingen, die im Krieg überleben.",
        difficulty = 5,
        funFact = "Kristof nannte das Französische eine 'feindliche Sprache', die sie 'töten' musste, um schreiben zu können. Ihr Buch 'Das Analphabeten' (2004) beschreibt dieses sprachliche Exil."
    ),

    // Question 43 - Varlam Schalamow
    Question(
        categoryId = 10,
        questionText = "Welches Hauptwerk von Varlam Schalamow dokumentiert die Erfahrungen in den sowjetischen Arbeitslagern der Kolyma-Region in Sibirien?",
        answerA = "Ein Tag im Leben des Iwan Denissowitsch",
        answerB = "Archipel Gulag",
        answerC = "Kolyma-Erzählungen (Kolymskie rasskazy)",
        answerD = "Der erste Kreis der Hölle",
        correctAnswer = 2,
        explanation = "'Kolymskie rasskazy' (Kolyma-Erzählungen) sind Schalamows literarisches Hauptwerk: kurze, lakonische Prosaerzählungen über das Leben und Sterben im Gulag. Schalamow verbrachte selbst 17 Jahre in Kolyma-Lagern. Die Erzählungen gelten als radikaler als Solschenizyns Werke.",
        difficulty = 5,
        funFact = "Schalamow war so erschöpft vom Lager, dass er nach seiner Entlassung zunächst kaum schreiben konnte. Er begann erst in den 1950er-Jahren mit den Kolyma-Erzählungen — ein Werk, das er selbst nie vollständig veröffentlicht sah."
    ),

    // Question 44 - Penelope Fitzgerald
    Question(
        categoryId = 10,
        questionText = "Welcher Roman von Penelope Fitzgerald (1979) spielt auf einem schwimmenden, halb versunkenen Hausboot auf der Themse und gilt als ihr Meisterstück des lakonischen Humors?",
        answerA = "The Gate of Angels",
        answerB = "Innocence",
        answerC = "The Blue Flower",
        answerD = "Offshore",
        correctAnswer = 3,
        explanation = "'Offshore' (1979) von Penelope Fitzgerald gewann den Booker Prize. Es spielt auf einem halb versunkenen Hausboot auf der Themse und zeigt Menschen, die zwischen zwei Welten — Land und Wasser — schweben, ohne sich entscheiden zu können. Ein Meisterwerk trockenen britischen Humors.",
        difficulty = 5,
        funFact = "Fitzgerald veröffentlichte ihren ersten Roman mit 60 Jahren und schrieb ihr bestes Werk in ihren 70ern. Sie gilt als eines der schönsten Beispiele dafür, dass literarische Reife keine Frage des Alters ist."
    ),

    // Question 45 - Cesare Pavese
    Question(
        categoryId = 10,
        questionText = "Welches posthum erschienene Werk von Cesare Pavese (1950 veröffentlicht, kurz nach seinem Selbstmord) enthält Reflexionen über Literatur, Mythologie und sein eigenes Scheitern?",
        answerA = "Il mestiere di vivere (Das Handwerk des Lebens)",
        answerB = "La luna e i falò (Der Mond und die Feuer)",
        answerC = "Dialoghi con Leucò (Gespräche mit Leukó)",
        answerD = "Paesi tuoi (Die schöne Sommernacht)",
        correctAnswer = 0,
        explanation = "'Il mestiere di vivere' (Das Handwerk des Lebens) ist Paveses Tagebuch, das er von 1935 bis kurz vor seinem Tod 1950 führte und posthum erschien. Es ist ein erschütterndes Dokument der Einsamkeit, der literarischen Reflexion und des langsam näher rückenden Selbstmords.",
        difficulty = 5,
        funFact = "Pavese tötete sich 1950 in einem Turiner Hotel, kurz nach Erhalt des Premio Strega — Italiens wichtigstem Literaturpreis. Er hinterließ den Satz: 'Alles ist absurd. Ich stelle mir keine Fragen mehr.'"
    ),

    // Question 46 - Raymond Roussel
    Question(
        categoryId = 10,
        questionText = "Welcher französische Autor und Begründer des literarischen Surrealismus schrieb 'Impressions d'Afrique' (1910) und hatte mit seiner Methode der sprachlichen Assoziationsketten großen Einfluss auf André Breton?",
        answerA = "Alfred Jarry",
        answerB = "Raymond Roussel",
        answerC = "Guillaume Apollinaire",
        answerD = "Blaise Cendrars",
        correctAnswer = 1,
        explanation = "Raymond Roussel (1877–1933) ist einer der obskursten und einflussreichsten Autoren der Moderne. 'Impressions d'Afrique' (1910) und 'Locus Solus' (1914) faszinierten Breton, Duchamp und die Surrealisten durch ihre traumartige Konstruktion aus sprachlichen Assoziationsketten.",
        difficulty = 5,
        funFact = "Roussel beschrieb in seinem postumen Essay 'Comment j'ai écrit certains de mes livres' seine Methode: Er baute Texte aus phonetisch ähnlichen, aber bedeutungsverschiedenen Sätzen. Michel Foucault widmete ihm eine Monografie."
    ),

    // Question 47 - Antonio di Benedetto
    Question(
        categoryId = 10,
        questionText = "Welcher argentinische Autor schrieb den Roman 'Zama' (1956), der als vergessenes Meisterwerk der lateinamerikanischen Literatur gilt und 2017 verfilmt wurde?",
        answerA = "Roberto Arlt",
        answerB = "Macedonio Fernández",
        answerC = "Antonio di Benedetto",
        answerD = "Silvina Ocampo",
        correctAnswer = 2,
        explanation = "'Zama' (1956) von Antonio di Benedetto erzählt von einem spanischen Kolonialbeamten im 18. Jahrhundert Paraguay, der vergeblich auf seine Versetzung wartet. Der Roman ist ein psychologisches Meisterwerk über das Warten, den Kolonialismus und die menschliche Absurdität. Lucrecia Martel verfilmte ihn 2017.",
        difficulty = 5,
        funFact = "Di Benedetto wurde 1976 von der argentinischen Militärjunta ohne Anklage verhaftet und gefoltert. Nach seiner Freilassung 1977 lebte er im Exil und fand nie mehr zu seinem früheren Schreiben zurück."
    ),

    // Question 48 - Herta Müller
    Question(
        categoryId = 10,
        questionText = "In welchem Werk verarbeitete Herta Müller die Deportation von Rumäniendeutschen in sowjetische Arbeitslager nach dem Zweiten Weltkrieg, basierend auf den Erlebnissen des Lyrikers Oskar Pastior?",
        answerA = "Der Fuchs war damals schon der Jäger",
        answerB = "Herztier",
        answerC = "Reisende auf einem Bein",
        answerD = "Atemschaukel",
        correctAnswer = 3,
        explanation = "'Atemschaukel' (2009) — erschienen kurz nach Müllers Nobelpreis — beschreibt die Deportation des 17-jährigen Leopold Auberg in ein sowjetisches Arbeitslager (1945–1950), basierend auf den Erzählungen ihres Freundes Oskar Pastior. Der Titel stammt aus einem Pastior-Gedicht.",
        difficulty = 5,
        funFact = "Müller erhielt 2009 den Nobelpreis für Literatur. Oskar Pastior, mit dem sie das Buch gemeinsam schreiben wollte, starb 2006 — kurz bevor bekannt wurde, dass er als junger Mann für die Securitate gespitzelt hatte."
    ),

    // Question 49 - Julio Cortázar
    Question(
        categoryId = 10,
        questionText = "Wie ist Cortázars Roman 'Rayuela' (Himmel und Hölle, 1963) strukturell aufgebaut, sodass er auf zwei grundlegend verschiedene Arten gelesen werden kann?",
        answerA = "Als gerader Roman mit 56 Kapiteln oder als sprunghaftes Lesen über eine vom Autor angegebene Kapitelfolge durch alle 155 Kapitel",
        answerB = "Als linearer Roman mit 155 Kapiteln oder als von hinten nach vorne zu lesender Text",
        answerC = "Als Erzählung aus zwei Perspektiven, die alternierend gelesen werden müssen",
        answerD = "Als Text, der in zwei verschiedenen Sprachen gelesen werden kann",
        correctAnswer = 0,
        explanation = "'Rayuela' besteht aus 155 Kapiteln. Man kann es linear als Roman mit 56 Kapiteln lesen — oder man folgt einer vom Autor angegeben Tabelle, die alle 155 Kapitel in einer nichtlinearen Reihenfolge verbindet. Das Buch schuf damit eines der ersten Modelle des 'offenen Werks'.",
        difficulty = 5,
        funFact = "Umberto Eco prägte für solche Werke den Begriff 'opera aperta' (offenes Werk). Cortázars 'Rayuela' gilt als Meisterwerk des lateinamerikanischen Booms und beeinflusste Generationen von Schriftstellern."
    ),

    // Question 50 - Léopold Sédar Senghor
    Question(
        categoryId = 10,
        questionText = "Wer gründete gemeinsam mit Aimé Césaire und Léon-Gontran Damas die kulturelle und literarische Bewegung 'Négritude' in Paris der 1930er-Jahre?",
        answerA = "Frantz Fanon",
        answerB = "Léopold Sédar Senghor",
        answerC = "Ousmane Sembène",
        answerD = "Chinua Achebe",
        correctAnswer = 1,
        explanation = "Léopold Sédar Senghor (Senegal), Aimé Césaire (Martinique) und Léon-Gontran Damas (Französisch-Guayana) begründeten in Paris die 'Négritude' — eine Bewegung zur Rückbesinnung auf afrikanische Werte und Identität als Gegenbewegung zur Assimilation. Senghor wurde später erster Präsident des unabhängigen Senegal.",
        difficulty = 5,
        funFact = "Senghor war der erste Afrikaner, der in die Académie française aufgenommen wurde (1983). Er ist der einzige Staatspräsident, der zugleich Dichter von Weltrang war."
    )

)
