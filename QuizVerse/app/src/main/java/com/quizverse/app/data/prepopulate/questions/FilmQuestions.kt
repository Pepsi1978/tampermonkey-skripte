package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun filmQuestions(): List<Question> = listOf(

    // ─── EASY (10 questions) ───────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welcher Film beginnt mit dem Satz: 'Es war einmal in einer weit, weit entfernten Galaxis...'?",
        answerA = "Star Wars",
        answerB = "Star Trek",
        answerC = "Interstellar",
        answerD = "Avatar",
        correctAnswer = 0,
        explanation = "Der berühmte Eröffnungstext 'A long time ago in a galaxy far, far away....' ist das Markenzeichen der Star-Wars-Filmreihe von George Lucas.",
        difficulty = 1,
        funFact = "Der erste Star-Wars-Film erschien 1977 und revolutionierte die Spezialeffekte im Kino."
    ),

    Question(
        categoryId = 4,
        questionText = "Wer spielte Jack Dawson im Film 'Titanic' (1997)?",
        answerA = "Brad Pitt",
        answerB = "Tom Hanks",
        answerC = "Leonardo DiCaprio",
        answerD = "Johnny Depp",
        correctAnswer = 2,
        explanation = "Leonardo DiCaprio spielte den mittellosen Künstler Jack Dawson, der sich auf dem Schiff in Rose verliebt.",
        difficulty = 1,
        funFact = "Titanic war der erste Film, der weltweit über eine Milliarde Dollar einspielte."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Film sagt die Figur Forrest Gump: 'Das Leben ist wie eine Schachtel Pralinen'?",
        answerA = "Cast Away",
        answerB = "Forrest Gump",
        answerC = "Philadelphia",
        answerD = "Big",
        correctAnswer = 1,
        explanation = "In 'Forrest Gump' (1994) sagt Forrest diesen berühmten Satz, den er von seiner Mutter gelernt hat.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Welches Tier ist der Hauptcharakter im Animationsfilm 'Findet Nemo' (2003)?",
        answerA = "Delfin",
        answerB = "Schildkröte",
        answerC = "Clownfisch",
        answerD = "Blauer Streifendoktorfisch",
        correctAnswer = 2,
        explanation = "Nemo ist ein Clownfisch. Sein Vater Marlin, ebenfalls ein Clownfisch, sucht ihn im gesamten Ozean.",
        difficulty = 1,
        funFact = "Nach dem Kinostart von 'Findet Nemo' stiegen die Verkäufe von Clownfischen in Tierhandlungen um 40 %."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Schauspieler spielte den Joker in 'The Dark Knight' (2008)?",
        answerA = "Jared Leto",
        answerB = "Joaquin Phoenix",
        answerC = "Jack Nicholson",
        answerD = "Heath Ledger",
        correctAnswer = 3,
        explanation = "Heath Ledger verkörperte den Joker in Christopher Nolans 'The Dark Knight' und gewann dafür posthum einen Oscar.",
        difficulty = 1,
        funFact = "Heath Ledger starb kurz nach den Dreharbeiten und wurde posthum mit dem Oscar für die beste Nebenrolle ausgezeichnet."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie heißt die Hauptfigur in der deutschen Serie 'Dark'?",
        answerA = "Jonas Kahnwald",
        answerB = "Ulrich Nielsen",
        answerC = "Peter Doppler",
        answerD = "Bartosz Tiedemann",
        correctAnswer = 0,
        explanation = "Jonas Kahnwald ist der jugendliche Protagonist der Netflix-Serie 'Dark', die in Winden spielt.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Film gewann 1998 den Oscar für den besten Film?",
        answerA = "Good Will Hunting",
        answerB = "L.A. Confidential",
        answerC = "Titanic",
        answerD = "As Good as It Gets",
        correctAnswer = 2,
        explanation = "'Titanic' von James Cameron gewann 1998 elf Oscars, darunter Bester Film und Beste Regie.",
        difficulty = 1,
        funFact = "Titanic und 'Ben-Hur' teilen mit je elf Oscars den Rekord für die meisten Auszeichnungen eines einzelnen Films."
    ),

    Question(
        categoryId = 4,
        questionText = "Welche Figur sagt in 'Der Herr der Ringe': 'Mein Schatz!'?",
        answerA = "Frodo",
        answerB = "Sauron",
        answerC = "Gollum",
        answerD = "Gandalf",
        correctAnswer = 2,
        explanation = "Gollum, das vom Ring besessene Wesen, nennt den einen Ring immer 'mein Schatz' (engl. 'My precious').",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Wer ist der Regisseur des Films 'Jurassic Park' (1993)?",
        answerA = "George Lucas",
        answerB = "James Cameron",
        answerC = "Steven Spielberg",
        answerD = "Tim Burton",
        correctAnswer = 2,
        explanation = "Steven Spielberg inszenierte 'Jurassic Park', basierend auf dem Roman von Michael Crichton.",
        difficulty = 1,
        funFact = "Die Dinosaurier in 'Jurassic Park' wurden durch eine revolutionäre Kombination aus CGI und Animatronics zum Leben erweckt."
    ),

    Question(
        categoryId = 4,
        questionText = "In welcher Stadt spielt die Serie 'Stranger Things'?",
        answerA = "Springfield",
        answerB = "Hawkins",
        answerC = "Riverdale",
        answerD = "Sunnydale",
        correctAnswer = 1,
        explanation = "'Stranger Things' spielt in der fiktiven Kleinstadt Hawkins im Bundesstaat Indiana, USA.",
        difficulty = 1,
        funFact = null
    ),

    // ─── MEDIUM (15 questions) ────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welcher deutscher Film gewann als erster den Oscar für den besten fremdsprachigen Film?",
        answerA = "Das Boot",
        answerB = "Nirgendwo in Afrika",
        answerC = "Das Leben der Anderen",
        answerD = "Die Blechtrommel",
        correctAnswer = 3,
        explanation = "'Die Blechtrommel' von Volker Schlöndorff gewann 1980 als erster westdeutscher Film den Oscar für den besten fremdsprachigen Film.",
        difficulty = 2,
        funFact = "Die Blechtrommel teilte sich den Oscar in jenem Jahr mit dem kubanischen Film 'Almendros'."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Regisseur ist für die Trilogie 'Der Pate' verantwortlich?",
        answerA = "Martin Scorsese",
        answerB = "Francis Ford Coppola",
        answerC = "Brian De Palma",
        answerD = "Sidney Lumet",
        correctAnswer = 1,
        explanation = "Francis Ford Coppola inszenierte alle drei Teile der 'Pate'-Trilogie (1972, 1974, 1990).",
        difficulty = 2,
        funFact = "Marlon Brando lehnte seinen Oscar für 'Der Pate' als Protest gegen die Behandlung der Ureinwohner Amerikas ab."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Film von Christopher Nolan behandelt das Thema des gemeinsamen Träumens?",
        answerA = "Memento",
        answerB = "Interstellar",
        answerC = "Inception",
        answerD = "The Prestige",
        correctAnswer = 2,
        explanation = "'Inception' (2010) handelt von einer Gruppe, die in die Träume anderer Menschen eindringt, um Ideen zu stehlen oder zu pflanzen.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Jahr begann die HBO-Serie 'Game of Thrones'?",
        answerA = "2009",
        answerB = "2010",
        answerC = "2011",
        answerD = "2012",
        correctAnswer = 2,
        explanation = "'Game of Thrones' wurde erstmals am 17. April 2011 auf HBO ausgestrahlt und basiert auf der Buchreihe 'Das Lied von Eis und Feuer' von George R. R. Martin.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Welche Schauspielerin gewann für 'Monster's Ball' (2001) den Oscar als beste Hauptdarstellerin?",
        answerA = "Angela Bassett",
        answerB = "Halle Berry",
        answerC = "Viola Davis",
        answerD = "Taraji P. Henson",
        correctAnswer = 1,
        explanation = "Halle Berry gewann 2002 als erste afroamerikanische Schauspielerin den Oscar für die beste Hauptdarstellerin.",
        difficulty = 2,
        funFact = "Halle Berrys Oscar-Sieg war ein historischer Meilenstein – bis heute blieb sie die einzige afroamerikanische Frau, die diesen Preis gewann."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Animationsfilm von Studio Ghibli handelt von einem Mädchen, das in einer Geisterherberge arbeitet?",
        answerA = "Mein Nachbar Totoro",
        answerB = "Prinzessin Mononoke",
        answerC = "Chihiros Reise ins Zauberland",
        answerD = "Das Schloss im Himmel",
        correctAnswer = 2,
        explanation = "'Chihiros Reise ins Zauberland' (2001) von Hayao Miyazaki folgt dem Mädchen Chihiro, das in einer Geisterwelt für eine Hexe arbeiten muss.",
        difficulty = 2,
        funFact = "Der Film gewann 2003 den Oscar für den besten Animationsfilm und ist der erfolgreichste japanische Film aller Zeiten."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie viele Staffeln hat die US-amerikanische Serie 'Breaking Bad'?",
        answerA = "4",
        answerB = "5",
        answerC = "6",
        answerD = "7",
        correctAnswer = 1,
        explanation = "'Breaking Bad' lief von 2008 bis 2013 mit insgesamt 5 Staffeln und 62 Episoden auf AMC.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Schauspieler spielt Tony Stark / Iron Man im Marvel Cinematic Universe?",
        answerA = "Chris Evans",
        answerB = "Chris Hemsworth",
        answerC = "Robert Downey Jr.",
        answerD = "Mark Ruffalo",
        correctAnswer = 2,
        explanation = "Robert Downey Jr. verkörperte Tony Stark in insgesamt zehn MCU-Filmen, beginnend mit 'Iron Man' (2008).",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Film von Quentin Tarantino spielt hauptsächlich in einem Diner und einem Apartment in Los Angeles?",
        answerA = "Jackie Brown",
        answerB = "Reservoir Dogs",
        answerC = "Kill Bill",
        answerD = "Pulp Fiction",
        correctAnswer = 3,
        explanation = "'Pulp Fiction' (1994) erzählt mehrere miteinander verwobene Geschichten aus der Unterwelt von Los Angeles in nicht-linearer Erzählweise.",
        difficulty = 2,
        funFact = "Das Drehbuch zu 'Pulp Fiction' wurde 2013 für fünf Millionen Dollar versteigert."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Film gewann 2020 als erster nicht-englischsprachiger Film den Oscar für den besten Film?",
        answerA = "Roma",
        answerB = "Parasite",
        answerC = "Das Leben der Anderen",
        answerD = "Amour",
        correctAnswer = 1,
        explanation = "'Parasite' von Bong Joon-ho (Südkorea) gewann 2020 vier Oscars, darunter Bester Film – als erster nicht-englischsprachiger Film in der Oscar-Geschichte.",
        difficulty = 2,
        funFact = "Regisseur Bong Joon-ho nannte den Golden Globe für fremdsprachige Filme einst spöttisch 'imperialistisch'."
    ),

    Question(
        categoryId = 4,
        questionText = "Welche deutsche TV-Serie von 2017 erzählt eine Zeitreisegeschichte in einem fiktiven deutschen Dorf?",
        answerA = "Babylon Berlin",
        answerB = "Dark",
        answerC = "4 Blocks",
        answerD = "Tatort",
        correctAnswer = 1,
        explanation = "'Dark' (Netflix, 2017–2020) ist eine deutsche Science-Fiction-Mysteryserie über Zeitreisen in vier Zeitebenen im Dorf Winden.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Schauspieler spielte Hannibal Lecter in 'Das Schweigen der Lämmer' (1991)?",
        answerA = "Gary Oldman",
        answerB = "Anthony Hopkins",
        answerC = "Brian Cox",
        answerD = "Mads Mikkelsen",
        correctAnswer = 1,
        explanation = "Anthony Hopkins spielte den genialen Kannibalen Hannibal Lecter und gewann dafür den Oscar als bester Hauptdarsteller.",
        difficulty = 2,
        funFact = "Anthony Hopkins' Bildschirmzeit als Hannibal Lecter beträgt nur 16 Minuten – trotzdem gewann er den Oscar für die Hauptrolle."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Regisseur drehte die Filme 'Schindlers Liste' und 'E.T.'?",
        answerA = "Stanley Kubrick",
        answerB = "Martin Scorsese",
        answerC = "Steven Spielberg",
        answerD = "Ridley Scott",
        correctAnswer = 2,
        explanation = "Steven Spielberg ist einer der einflussreichsten Regisseure Hollywoods und schuf sowohl Blockbuster als auch ernste Dramen.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Land spielt der Film 'Amélie' (2001)?",
        answerA = "Belgien",
        answerB = "Schweiz",
        answerC = "Frankreich",
        answerD = "Italien",
        correctAnswer = 2,
        explanation = "'Die fabelhafte Welt der Amélie' spielt in Paris, Frankreich, und wurde von Jean-Pierre Jeunet inszeniert.",
        difficulty = 2,
        funFact = "Für die Rolle der Amélie wurde ursprünglich Emily Watson vorgesehen, bevor Audrey Tautou besetzt wurde."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Schauspieler spielt Walter White in 'Breaking Bad'?",
        answerA = "Bryan Cranston",
        answerB = "Aaron Paul",
        answerC = "Bob Odenkirk",
        answerD = "Dean Norris",
        correctAnswer = 0,
        explanation = "Bryan Cranston spielt den Chemielehrer Walter White, der zum Drogenproduzenten wird. Er gewann für die Rolle viermal den Emmy.",
        difficulty = 2,
        funFact = null
    ),

    // ─── HARD (12 questions) ──────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welcher deutsche Film gewann 2007 den Oscar für den besten fremdsprachigen Film?",
        answerA = "Nirgendwo in Afrika",
        answerB = "Sophie Scholl",
        answerC = "Das Leben der Anderen",
        answerD = "Der Untergang",
        correctAnswer = 2,
        explanation = "'Das Leben der Anderen' von Florian Henckel von Donnersmarck über die Stasi in der DDR gewann 2007 den Oscar für den besten fremdsprachigen Film.",
        difficulty = 3,
        funFact = "Regisseur Florian Henckel von Donnersmarck war bei der Oscar-Verleihung erst 33 Jahre alt."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie heißt der Regisseur, der für die Filme '2001: Odyssee im Weltraum' und 'A Clockwork Orange' bekannt ist?",
        answerA = "Orson Welles",
        answerB = "Alfred Hitchcock",
        answerC = "Billy Wilder",
        answerD = "Stanley Kubrick",
        correctAnswer = 3,
        explanation = "Stanley Kubrick gilt als einer der größten Filmregisseure aller Zeiten. Er war bekannt für seine akribische Perfektionismus und visuellen Stil.",
        difficulty = 3,
        funFact = "Kubrick drehte 'The Shining' und ließ eine Szene angeblich 127 Mal wiederholen."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Film von Werner Herzog aus dem Jahr 1972 zeigt einen Mann, der einen Dampfer über einen Berg schleppt?",
        answerA = "Aguirre, der Zorn Gottes",
        answerB = "Fitzcarraldo",
        answerC = "Nosferatu – Phantom der Nacht",
        answerD = "Woyzeck",
        correctAnswer = 1,
        explanation = "In 'Fitzcarraldo' (1982) – nicht 1972 – lässt Herzog tatsächlich ein echtes Schiff über einen Hügel ziehen. Der Film von 1972 war 'Aguirre'.",
        difficulty = 3,
        funFact = "Werner Herzog ließ für 'Fitzcarraldo' wirklich ein 340-Tonnen-Schiff über einen Hügel ziehen – ohne CGI."
    ),

    Question(
        categoryId = 4,
        questionText = "Welche Schauspielerin gewann den Oscar für die Hauptrolle in 'Sophies Entscheidung' (1982)?",
        answerA = "Meryl Streep",
        answerB = "Jessica Lange",
        answerC = "Sigourney Weaver",
        answerD = "Jane Fonda",
        correctAnswer = 0,
        explanation = "Meryl Streep gewann für ihre Darstellung der polnischen Auschwitz-Überlebenden Sophie Zawistowski den Oscar als beste Hauptdarstellerin.",
        difficulty = 3,
        funFact = "Meryl Streep lernte für die Rolle fließend Polnisch und Deutsch."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Kubrick-Film spielt Jack Nicholson einen Schriftsteller, der in einem Berghotel den Verstand verliert?",
        answerA = "The Shining",
        answerB = "Eyes Wide Shut",
        answerC = "Full Metal Jacket",
        answerD = "Barry Lyndon",
        correctAnswer = 0,
        explanation = "'The Shining' (1980) basiert auf dem Roman von Stephen King. Jack Nicholson spielt Jack Torrance, der als Winterwächter des Overlook Hotels zum Mörder wird.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Wer komponierte die Filmmusik für 'Schindlers Liste' (1993)?",
        answerA = "Hans Zimmer",
        answerB = "Ennio Morricone",
        answerC = "John Williams",
        answerD = "Bernard Herrmann",
        correctAnswer = 2,
        explanation = "John Williams komponierte die emotionale Filmmusik für Spielbergs 'Schindlers Liste' und gewann dafür den Oscar für die beste Filmmusik.",
        difficulty = 3,
        funFact = "John Williams und Steven Spielberg arbeiten seit 'Sugarland Express' (1974) zusammen – eine der längsten Regisseur-Komponisten-Partnerschaften der Filmgeschichte."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Regisseur ist bekannt für die Neuen-Hollywood-Bewegung und schuf 'Apocalypse Now'?",
        answerA = "Michael Cimino",
        answerB = "Brian De Palma",
        answerC = "Francis Ford Coppola",
        answerD = "Peter Bogdanovich",
        correctAnswer = 2,
        explanation = "'Apocalypse Now' (1979) von Francis Ford Coppola gilt als eines der bedeutendsten Antikriegsfilme und war für das Neue Hollywood prägend.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Film von Rainer Werner Fassbinder handelt von einer deutschen Witwe, die sich in einen Gastarbeiter verliebt?",
        answerA = "Die Ehe der Maria Braun",
        answerB = "Angst essen Seele auf",
        answerC = "Effi Briest",
        answerD = "Die bitteren Tränen der Petra von Kant",
        correctAnswer = 1,
        explanation = "'Angst essen Seele auf' (1974) erzählt die Geschichte der älteren Emmi und des marokkanischen Gastarbeiters Ali – ein Meisterwerk des deutschen Kinos.",
        difficulty = 3,
        funFact = "Fassbinder drehte den Film in nur zehn Tagen."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Jahr erschien der erste Teil der 'Alien'-Filmreihe?",
        answerA = "1976",
        answerB = "1977",
        answerC = "1979",
        answerD = "1981",
        correctAnswer = 2,
        explanation = "'Alien' von Ridley Scott erschien 1979 und gilt als eines der besten Science-Fiction-Horrorfilme aller Zeiten.",
        difficulty = 3,
        funFact = "Die Szene, in der das Alien aus dem Bauch von Kane ausbricht, war für die meisten Schauspieler eine echte Überraschung."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Schauspieler spielte die Hauptrolle in Wim Wenders' 'Paris, Texas' (1984)?",
        answerA = "Dennis Hopper",
        answerB = "Harvey Keitel",
        answerC = "Harry Dean Stanton",
        answerD = "Sam Shepard",
        correctAnswer = 2,
        explanation = "Harry Dean Stanton spielt Travis Henderson, einen Mann, der nach langer Abwesenheit durch die Wüste wandert und seine Familie sucht.",
        difficulty = 3,
        funFact = "'Paris, Texas' gewann die Goldene Palme in Cannes 1984."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Regisseur führte bei 'Schindlers Liste' und 'Der Soldat James Ryan' Regie?",
        answerA = "Oliver Stone",
        answerB = "Clint Eastwood",
        answerC = "Steven Spielberg",
        answerD = "Terrence Malick",
        correctAnswer = 2,
        explanation = "Steven Spielberg inszenierte beide preisgekrönten Kriegs-/Historienfilme. 'Schindlers Liste' (1993) und 'Der Soldat James Ryan' (1998) gelten als Meisterwerke.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Film von Fritz Lang aus dem Jahr 1927 gilt als Meilenstein des expressionistischen deutschen Stummfilms?",
        answerA = "Nosferatu",
        answerB = "Der Blaue Engel",
        answerC = "Metropolis",
        answerD = "M – Eine Stadt sucht einen Mörder",
        correctAnswer = 2,
        explanation = "'Metropolis' (1927) von Fritz Lang ist ein Science-Fiction-Stummfilm, der eine dystopische Zukunft zeigt und die Filmsprache nachhaltig beeinflusst hat.",
        difficulty = 3,
        funFact = "Für lange Zeit galt ein großer Teil von 'Metropolis' als verloren, bis 2008 in Argentinien fast vollständige Kopien gefunden wurden."
    ),

    // ─── EXPERT (8 questions) ─────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welcher Regisseur gewann beim Oscar 1998 für 'Titanic' als Bester Regisseur und zitierte dabei seinen eigenen Film auf der Bühne?",
        answerA = "Steven Spielberg",
        answerB = "James Cameron",
        answerC = "Ridley Scott",
        answerD = "Peter Jackson",
        correctAnswer = 1,
        explanation = "James Cameron rief bei seiner Oscar-Rede für 'Titanic' den berühmten Satz: 'I'm the king of the world!' – eine Referenz auf seinen eigenen Film.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Ingmar-Bergman-Film spielt der Tod Schach mit einem Ritter?",
        answerA = "Wilde Erdbeeren",
        answerB = "Persona",
        answerC = "Das siebente Siegel",
        answerD = "Szenen einer Ehe",
        correctAnswer = 2,
        explanation = "'Das siebente Siegel' (1957) zeigt den Ritter Antonius Block, der nach seiner Rückkehr aus dem Kreuzzug mit dem Tod eine Schachpartie spielt.",
        difficulty = 4,
        funFact = "Ingmar Bergman gilt als einer der bedeutendsten Filmemacher aller Zeiten. Das Schachspiel mit dem Tod wurde zu einem der ikonischsten Filmbilder überhaupt."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Schauspieler gewann für 'Network' (1976) als erster posthum den Oscar für die beste Hauptdarstellung?",
        answerA = "Peter Finch",
        answerB = "Faye Dunaway",
        answerC = "William Holden",
        answerD = "Robert Duvall",
        correctAnswer = 0,
        explanation = "Peter Finch starb im Januar 1977, kurz vor der Oscar-Verleihung, und wurde posthum als bester Hauptdarsteller für seine Rolle als Howard Beale ausgezeichnet.",
        difficulty = 4,
        funFact = "Peter Finch ist bis heute der einzige Schauspieler, der posthum den Oscar für die beste Hauptrolle gewann."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie lautet der bürgerliche Name des deutschen Regisseurs, der als 'Wim Wenders' bekannt ist?",
        answerA = "Ernst Wilhelm Wenders",
        answerB = "Wilhelm Friedrich Wenders",
        answerC = "Hans-Ernst Wenders",
        answerD = "Wilhelm Ernst Wenders",
        correctAnswer = 3,
        explanation = "Wim Wenders wurde als Wilhelm Ernst Wenders am 14. August 1945 in Düsseldorf geboren.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Film von Akira Kurosawa war die Vorlage für das Western-Remake 'Für eine Handvoll Dollar'?",
        answerA = "Rashomon",
        answerB = "Die sieben Samurai",
        answerC = "Yojimbo",
        answerD = "Sanjuro",
        correctAnswer = 2,
        explanation = "Sergio Leones 'Für eine Handvoll Dollar' (1964) mit Clint Eastwood basiert auf Kurosawas 'Yojimbo' (1961). Kurosawa gewann daraufhin einen Prozess.",
        difficulty = 4,
        funFact = "Akira Kurosawa war zunächst verärgert über das Remake, gewann aber später Tantiemen und soll gesagt haben: 'Yojimbo' war eine gute Idee."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Film von Michael Haneke gewann zweimal die Goldene Palme in Cannes (2005 und 2012)?",
        answerA = "Das weiße Band",
        answerB = "Funny Games",
        answerC = "Caché",
        answerD = "Amour",
        correctAnswer = 3,
        explanation = "Michael Haneke gewann die Goldene Palme zunächst mit 'Das weiße Band' (2009) und dann mit 'Amour' (2012).",
        difficulty = 4,
        funFact = "Haneke ist einer von nur fünf Regisseuren, die zweimal die Goldene Palme in Cannes gewonnen haben."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Jahr wurde das erste Technicolor-Verfahren für Spielfilme kommerziell eingesetzt?",
        answerA = "1917",
        answerB = "1922",
        answerC = "1935",
        answerD = "1939",
        correctAnswer = 0,
        explanation = "Das erste Technicolor-Verfahren wurde 1917 mit dem Stummfilm 'The Gulf Between' eingesetzt, obwohl es erst in den 1930ern wirklich populär wurde.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Schweizer Filmemacher schuf die experimentellen Essayfilme 'Histoire(s) du cinéma'?",
        answerA = "Alain Tanner",
        answerB = "Jean-Luc Godard",
        answerC = "Claude Goretta",
        answerD = "Fredi M. Murer",
        correctAnswer = 1,
        explanation = "Jean-Luc Godard, geboren in Paris, aber Schweizer Staatsbürger, schuf zwischen 1988 und 1998 die monumentale Filmessay-Reihe 'Histoire(s) du cinéma'.",
        difficulty = 4,
        funFact = "Godard gilt als einer der wichtigsten Vertreter der Nouvelle Vague und revolutionierte die Filmsprache mit Filmen wie 'Außer Atem' (1960)."
    ),

    // ─── MASTER (5 questions) ─────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welcher Film von Luchino Visconti aus dem Jahr 1963 gilt als einer der längsten je produzierten Mainstream-Filme mit einer Laufzeit von über 4 Stunden?",
        answerA = "Rocco und seine Brüder",
        answerB = "Senso",
        answerC = "Il Gattopardo (Der Leopard)",
        answerD = "Ludwig",
        correctAnswer = 2,
        explanation = "'Il Gattopardo' (Der Leopard, 1963) von Luchino Visconti mit Burt Lancaster hat eine Originallaufzeit von 205 Minuten und gewann die Goldene Palme in Cannes.",
        difficulty = 5,
        funFact = "Die Ballszene in 'Der Leopard' dauert allein 45 Minuten und wurde mit 500 Komparsen gedreht."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Filmtheoretiker prägte den Begriff 'Politique des auteurs' in den Cahiers du Cinéma?",
        answerA = "André Bazin",
        answerB = "François Truffaut",
        answerC = "Siegfried Kracauer",
        answerD = "Sergei Eisenstein",
        correctAnswer = 1,
        explanation = "François Truffaut formulierte 1954 in seinem Aufsatz 'Une certaine tendance du cinéma français' die Grundlagen der Autorentheorie ('Politique des auteurs').",
        difficulty = 5,
        funFact = "Truffaut war zunächst Filmkritiker und Lieblingsschüler von André Bazin, bevor er mit 'Sie küssten und sie schlugen ihn' (1959) Regisseur wurde."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Film von Carl Theodor Dreyer spielte Maria Falconetti die Rolle der Johanna von Orleans ohne professionelle Schauspielerfahrung?",
        answerA = "Vampyr",
        answerB = "Gertrud",
        answerC = "Dies irae",
        answerD = "La Passion de Jeanne d'Arc",
        correctAnswer = 3,
        explanation = "'La Passion de Jeanne d'Arc' (1928) von Carl Th. Dreyer mit Renée Falconetti gilt als einer der größten Stummfilme aller Zeiten. Falconetti wurde von Dreyer entdeckt.",
        difficulty = 5,
        funFact = "Dreyer soll Falconetti für die intensiven Aufnahmen tatsächlich auf dem Steinboden knien lassen und ihr Haare für echte Reaktionen ausgerissen haben."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Film von Robert Bresson aus dem Jahr 1966 basiert auf dem Roman von Fjodor Dostojewski 'Der Idiot' als Vorlage für eine moderne Pariser Adaptation?",
        answerA = "Au hasard Balthazar",
        answerB = "Mouchette",
        answerC = "Pickpocket",
        answerD = "Une femme douce",
        correctAnswer = 3,
        explanation = "'Une femme douce' (1969) basiert auf Dostojewskis Kurzgeschichte 'Die Sanfte'. Bressons Adaption von 'Der Idiot'-Motiven in Paris war 'Vier Nächte einer Träumerin' (1971).",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher japanische Regisseur schuf den Film 'Tokyo Story' (1953), der in Kritikerumfragen regelmäßig unter den zehn besten Filmen aller Zeiten gelistet wird?",
        answerA = "Akira Kurosawa",
        answerB = "Kenji Mizoguchi",
        answerC = "Yasujiro Ozu",
        answerD = "Mikio Naruse",
        correctAnswer = 2,
        explanation = "'Tokyo Story' (Tōkyō Monogatari) von Yasujiro Ozu zeigt ein älteres Ehepaar, das ihre erwachsenen Kinder in Tokio besucht. In der Sight & Sound-Umfrage 2012 wurde er zum drittbesten Film aller Zeiten gewählt.",
        difficulty = 5,
        funFact = "Ozu verwendete fast immer eine sehr niedrige, am Boden positionierte Kamera – bekannt als 'Tatami-Perspektive' – die den Blick eines auf dem Boden sitzenden Japaners imitiert."
    )
)
