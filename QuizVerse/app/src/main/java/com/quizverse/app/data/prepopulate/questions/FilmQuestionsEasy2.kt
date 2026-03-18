package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun filmQuestionsEasy2(): List<Question> = listOf(

    // ─── James Bond basics ────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welcher Schauspieler spielte James Bond als erster in einem offiziellen Kinofilm?",
        answerA = "Roger Moore",
        answerB = "Sean Connery",
        answerC = "Pierce Brosnan",
        answerD = "Timothy Dalton",
        correctAnswer = 1,
        explanation = "Sean Connery spielte James Bond erstmals 1962 im Film 'James Bond jagt Dr. No'.",
        difficulty = 1,
        funFact = "Sean Connery spielte Bond in insgesamt sieben Filmen, darunter einmal ausserhalb der offiziellen Reihe."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie lautet der Codename von James Bond?",
        answerA = "007",
        answerB = "006",
        answerC = "008",
        answerD = "001",
        correctAnswer = 0,
        explanation = "James Bond traegt den Agentennamen 'Agent 007' des britischen Geheimdienstes MI6.",
        difficulty = 1,
        funFact = "Die Zahl 007 stammt von Autor Ian Fleming, der sie von einem echten britischen Geheimdienst-Dokument inspiriert bekam."
    ),

    Question(
        categoryId = 4,
        questionText = "Wer ist der Chef von James Bond in den Bond-Filmen?",
        answerA = "Q",
        answerB = "M",
        answerC = "P",
        answerD = "R",
        correctAnswer = 1,
        explanation = "James Bonds Vorgesetzter bei MI6 traegt den Codenamen 'M'. Die Figur wurde von verschiedenen Schauspielern verkörpert.",
        difficulty = 1,
        funFact = "M wurde in den fruehen Filmen von Bernard Lee gespielt und spaeter von Judi Dench in sieben Filmen."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist der vollstaendige Name von Agent James Bond?",
        answerA = "James Bond",
        answerB = "James David Bond",
        answerC = "James Harold Bond",
        answerD = "James Richard Bond",
        correctAnswer = 0,
        explanation = "Der Charakter heisst schlicht James Bond – kein weiterer Vorname ist in den offiziellen Romanen oder Filmen angegeben.",
        difficulty = 1,
        funFact = "Ian Fleming benannte die Figur nach dem amerikanischen Vogelkundler James Bond, dessen Buch er besass."
    ),

    // ─── Jurassic Park ────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welcher Regisseur drehte den Film 'Jurassic Park' (1993)?",
        answerA = "James Cameron",
        answerB = "George Lucas",
        answerC = "Steven Spielberg",
        answerD = "Tim Burton",
        correctAnswer = 2,
        explanation = "'Jurassic Park' wurde von Steven Spielberg inszeniert und basiert auf dem Roman von Michael Crichton.",
        difficulty = 1,
        funFact = "Fuer die Dinosaurier-Animationen wurden zum ersten Mal umfangreich computergestützte Spezialeffekte in einem Hollywoodfilm eingesetzt."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie werden die Dinosaurier in 'Jurassic Park' zum Leben erweckt?",
        answerA = "Aus eingefrorenen Dinosaurier-Eiern",
        answerB = "Aus Dinosaurier-DNA in Bernstein eingeschlossener Muecken",
        answerC = "Durch Zeitreise",
        answerD = "Aus fossilen Knochen geklont",
        correctAnswer = 1,
        explanation = "Im Film wird Dinosaurier-DNA aus Muecken gewonnen, die in uraltem Bernstein eingeschlossen waren.",
        difficulty = 1,
        funFact = "Echter Bernstein kann tatsaechlich Insekten aus der Kreidezeit enthalten – Dinosaurier-DNA liess sich bisher aber nicht isolieren."
    ),

    // ─── The Matrix ───────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Wer spielt die Hauptrolle des Neo im Film 'The Matrix' (1999)?",
        answerA = "Brad Pitt",
        answerB = "Tom Cruise",
        answerC = "Keanu Reeves",
        answerD = "Will Smith",
        correctAnswer = 2,
        explanation = "Keanu Reeves spielt Thomas Anderson alias Neo, der herausfindet, dass die Welt eine Computersimulation ist.",
        difficulty = 1,
        funFact = "Will Smith lehnte die Rolle des Neo ab, um stattdessen 'Wild Wild West' zu drehen."
    ),

    Question(
        categoryId = 4,
        questionText = "Welche Pille nimmt Neo in 'The Matrix', um die Wahrheit zu erfahren?",
        answerA = "Die blaue Pille",
        answerB = "Die gruene Pille",
        answerC = "Die weisse Pille",
        answerD = "Die rote Pille",
        correctAnswer = 3,
        explanation = "Morpheus bietet Neo eine blaue und eine rote Pille an. Neo nimmt die rote und entdeckt die Wahrheit ueber die Matrix.",
        difficulty = 1,
        funFact = "Die 'rote Pille' ist ein weit verbreitetes Kulturphänomen geworden, das fuer das Erkennen einer unbequemen Wahrheit steht."
    ),

    // ─── Titanic ──────────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "In welchem Jahr erschien James Camerons Film 'Titanic'?",
        answerA = "1995",
        answerB = "1996",
        answerC = "1997",
        answerD = "1998",
        correctAnswer = 2,
        explanation = "'Titanic' von James Cameron erschien 1997 und war zu seiner Zeit der teuerste je produzierte Film.",
        difficulty = 1,
        funFact = "'Titanic' gewann 11 Oscars und hielt mehrere Jahre lang den Weltrekord fuer den hoechsten Kinoeinspieler."
    ),

    Question(
        categoryId = 4,
        questionText = "Welche Schauspielerin spielt Rose in James Camerons 'Titanic'?",
        answerA = "Julia Roberts",
        answerB = "Cate Blanchett",
        answerC = "Kate Winslet",
        answerD = "Gwyneth Paltrow",
        correctAnswer = 2,
        explanation = "Kate Winslet spielt die junge Adelstochter Rose, die sich in den mittellosen Kuenstler Jack verliebt.",
        difficulty = 1,
        funFact = "Kate Winslet erklaerte spaeter, dass das beruehmt-beruechtigte Tuerfloss-Ende sehr wohl Platz fuer beide gehabt haette."
    ),

    // ─── Forrest Gump ─────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Wer spielte die Titelrolle in 'Forrest Gump' (1994)?",
        answerA = "Tom Hanks",
        answerB = "Tom Cruise",
        answerC = "Kevin Costner",
        answerD = "John Travolta",
        correctAnswer = 0,
        explanation = "Tom Hanks verkörpert den gutmuetigen Forrest Gump und gewann dafuer seinen zweiten Oscar in Folge als Bester Hauptdarsteller.",
        difficulty = 1,
        funFact = "Tom Hanks gewann 1993 fuer 'Philadelphia' und 1994 fuer 'Forrest Gump' den Oscar – zweimal hintereinander."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist Forrest Gumps Lieblingsaktivitaet im gleichnamigen Film?",
        answerA = "Schwimmen",
        answerB = "Laufen",
        answerC = "Radfahren",
        answerD = "Angeln",
        correctAnswer = 1,
        explanation = "Forrest laeuft ohne besonderen Grund quer durch Amerika und wird dabei von Anhaeingern begleitet.",
        difficulty = 1,
        funFact = "Forrest Gumps Laufstrecke betrug laut Film ueber 15.000 Kilometer – das entspricht fast dem Umfang der Erde."
    ),

    // ─── Schindler's List ─────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Wer spielt Oskar Schindler im Film 'Schindlers Liste' (1993)?",
        answerA = "Ralph Fiennes",
        answerB = "Liam Neeson",
        answerC = "Anthony Hopkins",
        answerD = "Russell Crowe",
        correctAnswer = 1,
        explanation = "Liam Neeson spielt den deutschen Unternehmer Oskar Schindler, der mehr als 1.000 juedische Arbeitnehmer vor dem Holocaust rettete.",
        difficulty = 1,
        funFact = "'Schindlers Liste' wurde in Schwarz-Weiss gedreht, um dem Film einen dokumentarischen Charakter zu verleihen."
    ),

    Question(
        categoryId = 4,
        questionText = "In welcher Farbe erscheint das Maedchen mit dem Mantel in 'Schindlers Liste'?",
        answerA = "Blau",
        answerB = "Gelb",
        answerC = "Rot",
        answerD = "Gruen",
        correctAnswer = 2,
        explanation = "Das maedchen mit dem roten Mantel ist das einzige farbige Element im ansonsten schwarz-weissen Film und symbolisiert Unschuld.",
        difficulty = 1,
        funFact = "Regisseur Spielberg sagte, das rote Maedchen stehe dafuer, dass die Welt wusste, was mit den Juden geschah, und nichts tat."
    ),

    // ─── The Godfather ────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Wer spielte Don Vito Corleone im Film 'Der Pate' (1972)?",
        answerA = "Al Pacino",
        answerB = "Robert De Niro",
        answerC = "Marlon Brando",
        answerD = "Jack Nicholson",
        correctAnswer = 2,
        explanation = "Marlon Brando spielte Don Vito Corleone und gewann dafuer den Oscar als Bester Hauptdarsteller.",
        difficulty = 1,
        funFact = "Marlon Brando lehnte den Oscar bei der Verleihung ab und schickte stattdessen eine Aktivistin auf die Buehne."
    ),

    Question(
        categoryId = 4,
        questionText = "Was tut Don Corleone zu Beginn von 'Der Pate', waehrend er Bittsteller empfaengt?",
        answerA = "Er isst Pasta",
        answerB = "Er streichelt eine Katze",
        answerC = "Er trinkt Rotwein",
        answerD = "Er raucht eine Zigarre",
        correctAnswer = 1,
        explanation = "Don Corleone streichelt eine graue Katze, waehrend er Bittsteller anhoert – eine Szene die Kultstatus erlangte.",
        difficulty = 1,
        funFact = "Die Katze war kein Teil des Drehbuchs. Regisseur Francis Ford Coppola fand sie am Set und gab sie Marlon Brando spontan in die Hand."
    ),

    // ─── Pulp Fiction ─────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Wer fuehrte Regie bei 'Pulp Fiction' (1994)?",
        answerA = "Martin Scorsese",
        answerB = "Quentin Tarantino",
        answerC = "Oliver Stone",
        answerD = "Spike Lee",
        correctAnswer = 1,
        explanation = "'Pulp Fiction' ist ein Film von Quentin Tarantino, der fuer seinen nichtlinearen Erzaehlstil bekannt ist.",
        difficulty = 1,
        funFact = "'Pulp Fiction' gewann 1994 die Goldene Palme in Cannes und wurde mit einem Budget von etwa 8 Millionen Dollar gedreht."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Schauspieler spielt Vincent Vega in 'Pulp Fiction'?",
        answerA = "Samuel L. Jackson",
        answerB = "Bruce Willis",
        answerC = "John Travolta",
        answerD = "Harvey Keitel",
        correctAnswer = 2,
        explanation = "John Travolta spielt den Auftragskiller Vincent Vega und erlebte durch diese Rolle ein grosses Karriere-Comeback.",
        difficulty = 1,
        funFact = "John Travoltas Karriere galt als beendet, bevor Tarantino ihn fuer 'Pulp Fiction' besetzte – der Film machte ihn wieder zum Star."
    ),

    // ─── Spielberg ────────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welcher Regisseur inszenierte 'Indiana Jones', 'Jurassic Park' und 'E.T.'?",
        answerA = "George Lucas",
        answerB = "Steven Spielberg",
        answerC = "Ron Howard",
        answerD = "Robert Zemeckis",
        correctAnswer = 1,
        explanation = "Steven Spielberg drehte alle drei Filmreihen und gilt als einer der erfolgreichsten Regisseure aller Zeiten.",
        difficulty = 1,
        funFact = "Spielberg gruendete zusammen mit Jeffrey Katzenberg und David Geffen das Filmstudio DreamWorks."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie heisst der Weisse Hai im Spielberg-Film 'Der weisse Hai' (1975)?",
        answerA = "Brutus",
        answerB = "Bruce",
        answerC = "Bart",
        answerD = "Billy",
        correctAnswer = 1,
        explanation = "Das mechanische Haimodell am Set wurde vom Team 'Bruce' genannt, benannt nach Spielbergs Anwalt Bruce Ramer.",
        difficulty = 1,
        funFact = "'Der weisse Hai' gilt als erster grosser Sommerblockbuster der Filmgeschichte und machte Strand-Urlaube weltweit angsteinjagenend."
    ),

    // ─── Tarantino ────────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Fuer welchen Film gewann Quentin Tarantino seinen ersten Oscar als Bester Originaldrehbuchautor?",
        answerA = "Kill Bill",
        answerB = "Jackie Brown",
        answerC = "Pulp Fiction",
        answerD = "Reservoir Dogs",
        correctAnswer = 2,
        explanation = "Tarantino gewann den Oscar fuer das Originaldrehbuch zu 'Pulp Fiction' bei der Verleihung 1995.",
        difficulty = 1,
        funFact = "Tarantino begann seine Filmkarriere als Videotheksverkäufer und bildete sich sein Filmwissen autodidaktisch an."
    ),

    // ─── Nolan ────────────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Wer inszenierte die 'The Dark Knight'-Trilogie mit Christian Bale als Batman?",
        answerA = "Tim Burton",
        answerB = "Zack Snyder",
        answerC = "Christopher Nolan",
        answerD = "Joel Schumacher",
        correctAnswer = 2,
        explanation = "Christopher Nolan inszenierte 'Batman Begins' (2005), 'The Dark Knight' (2008) und 'The Dark Knight Rises' (2012).",
        difficulty = 1,
        funFact = "Heath Ledger gewann posthum den Oscar fuer seine Darstellung des Jokers in 'The Dark Knight'."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Christopher-Nolan-Film dreht sich alles um Traeume in Traeumen?",
        answerA = "Tenet",
        answerB = "Inception",
        answerC = "Interstellar",
        answerD = "Memento",
        correctAnswer = 1,
        explanation = "In 'Inception' (2010) kann ein Team in die Traeume von Menschen eindringen und Ideen pflanzen.",
        difficulty = 1,
        funFact = "Das Ende von 'Inception' mit dem drehenden Kreisel ist eines der am meisten diskutierten Filmenden aller Zeiten."
    ),

    // ─── Home Alone ───────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Wie heisst der Junge, der in 'Kevin – Allein zu Haus' (1990) allein zurueckbleibt?",
        answerA = "Michael McCallister",
        answerB = "Kevin McCallister",
        answerC = "Kevin Mitchell",
        answerD = "Danny McCallister",
        correctAnswer = 1,
        explanation = "Kevin McCallister, gespielt von Macaulay Culkin, wird versehentlich von seiner Familie bei einem Paris-Urlaub vergessen.",
        difficulty = 1,
        funFact = "'Kevin – Allein zu Haus' hielt viele Jahre lang den Rekord als erfolgreichster Weihnachtsfilm aller Zeiten."
    ),

    Question(
        categoryId = 4,
        questionText = "Welches Land ist das Urlaubsziel von Kevins Familie in 'Kevin – Allein zu Haus'?",
        answerA = "London",
        answerB = "Paris",
        answerC = "New York",
        answerD = "Rom",
        correctAnswer = 1,
        explanation = "Kevins Familie fliegt nach Paris in den Weihnachtsurlaub und vergisst Kevin dabei zu Hause in Chicago.",
        difficulty = 1,
        funFact = "Regisseur Chris Columbus liess sich fuer die Fallen, die Kevin legt, von Tom-und-Jerry-Cartoons inspirieren."
    ),

    // ─── Mrs. Doubtfire ───────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Wer spielt die Hauptrolle in 'Mrs. Doubtfire' (1993)?",
        answerA = "John Candy",
        answerB = "Eddie Murphy",
        answerC = "Robin Williams",
        answerD = "Jim Carrey",
        correctAnswer = 2,
        explanation = "Robin Williams spielt Daniel Hillard, der sich als alte schottische Kinderfraeu 'Mrs. Doubtfire' verkleidet, um bei seinen Kindern zu sein.",
        difficulty = 1,
        funFact = "Robin Williams improvisierte viele seiner Szenen und liess die Crew oft in schallendes Gelaechter ausbrechen."
    ),

    Question(
        categoryId = 4,
        questionText = "Als wen verkleidet sich der Vater in 'Mrs. Doubtfire', um bei seinen Kindern zu sein?",
        answerA = "Als Clown",
        answerB = "Als Kinderfrau",
        answerC = "Als Lehrer",
        answerD = "Als Grossmutter",
        correctAnswer = 1,
        explanation = "Daniel Hillard verkleidet sich als die alte schottische Kinderfrau 'Mrs. Doubtfire', um als Babysitter seiner eigenen Kinder eingestellt zu werden.",
        difficulty = 1,
        funFact = "Das Make-up fuer Robin Williams als Mrs. Doubtfire dauerte taeglich mehrere Stunden."
    ),

    // ─── Psycho ───────────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Von welchem Regisseur stammt der Horrorfilm 'Psycho' (1960)?",
        answerA = "Roman Polanski",
        answerB = "Brian De Palma",
        answerC = "Alfred Hitchcock",
        answerD = "William Friedkin",
        correctAnswer = 2,
        explanation = "'Psycho' ist ein Meisterwerk des Regisseurs Alfred Hitchcock, der oft als 'Meister des Suspense' bezeichnet wird.",
        difficulty = 1,
        funFact = "Alfred Hitchcock kaufte die Rechte am Roman heimlich auf, damit niemand das Ende verraten konnte."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Gebaeude wohnt der Moerder Norman Bates im Film 'Psycho'?",
        answerA = "In einem verlassenen Leuchtturm",
        answerB = "In einem alten Herrenhaus neben einem Motel",
        answerC = "In einem Keller unter einer Scheune",
        answerD = "In einem Krankenhaus",
        correctAnswer = 1,
        explanation = "Norman Bates wohnt mit seiner 'Mutter' in einem alten Herrenhaus auf einer Anhoehe direkt neben dem Bates Motel.",
        difficulty = 1,
        funFact = "Das Bates-Herrenhaus-Modell steht noch heute auf dem Universal-Studios-Gelaende in Hollywood."
    ),

    // ─── The Shining ──────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Wer spielt Jack Torrance im Horrorfilm 'The Shining' (1980)?",
        answerA = "Robert De Niro",
        answerB = "Jack Nicholson",
        answerC = "Anthony Hopkins",
        answerD = "Al Pacino",
        correctAnswer = 1,
        explanation = "Jack Nicholson spielt Jack Torrance, der als Winterhausmeister des Overlook Hotels langsam dem Wahnsinn verfaellt.",
        difficulty = 1,
        funFact = "Stephen King, der Autor des Originalromans, war mit Stanley Kubricks Verfilmung unzufrieden und liess spaeter eine eigene TV-Version drehen."
    ),

    Question(
        categoryId = 4,
        questionText = "Welchen beruehmten Satz schreibt Jack in 'The Shining' tausendfach auf?",
        answerA = "'All work and no play makes Jack a dull boy'",
        answerB = "'Here is Johnny'",
        answerC = "'Redrum, Redrum'",
        answerD = "'Come play with us'",
        correctAnswer = 0,
        explanation = "Jack Torrance tippt den Satz 'All work and no play makes Jack a dull boy' endlos auf der Schreibmaschine – ein Zeichen seines Wahnsinns.",
        difficulty = 1,
        funFact = "Kubrick liess fuer verschiedene internationale Versionen des Films den Text tatsaechlich in die jeweilige Sprache uebersetzen."
    ),

    // ─── Streaming-Dienste ────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "In welchem Jahr startete Netflix seinen Streaming-Dienst?",
        answerA = "2005",
        answerB = "2007",
        answerC = "2010",
        answerD = "2012",
        correctAnswer = 1,
        explanation = "Netflix startete seinen Video-on-Demand-Streamingdienst im Jahr 2007, begann aber 1997 als DVD-Verleih per Post.",
        difficulty = 1,
        funFact = "Netflix verschickte in seiner Anfangszeit DVDs per Post. Blockbuster lehnte es 2000 ab, Netflix fuer 50 Millionen Dollar zu kaufen."
    ),

    Question(
        categoryId = 4,
        questionText = "Welches Unternehmen betreibt den Streaming-Dienst Disney+?",
        answerA = "Sony",
        answerB = "Time Warner",
        answerC = "The Walt Disney Company",
        answerD = "Universal",
        correctAnswer = 2,
        explanation = "Disney+ ist der Streaming-Dienst von The Walt Disney Company und startete im November 2019.",
        difficulty = 1,
        funFact = "Disney+ erreichte innerhalb von nur einem Tag nach dem Start ueber 10 Millionen Abonnenten."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Streaming-Dienst produzierte die Serie 'Stranger Things'?",
        answerA = "Amazon Prime Video",
        answerB = "HBO Max",
        answerC = "Netflix",
        answerD = "Apple TV+",
        correctAnswer = 2,
        explanation = "'Stranger Things' ist eine Netflix-Originalserie, die 2016 startete und in den 1980er Jahren spielt.",
        difficulty = 1,
        funFact = "'Stranger Things' wurde von ueber 40 Produktionsfirmen abgelehnt, bevor Netflix die Serie produzierte."
    ),

    Question(
        categoryId = 4,
        questionText = "Was war die erste grosse Netflix-Originalproduktion, die einen Oscar gewann?",
        answerA = "Roma",
        answerB = "The Irishman",
        answerC = "Marriage Story",
        answerD = "Mudbound",
        correctAnswer = 0,
        explanation = "Alfonso Cuarons 'Roma' (2018) gewann drei Oscars und war damit der erste Netflix-Film mit Academy-Award-Siegen.",
        difficulty = 1,
        funFact = "'Roma' wurde in Schwarz-Weiss gedreht und spielt in Mexico City in den 1970er Jahren."
    ),

    // ─── Beruehmte Filmmusik ──────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Wer komponierte die Filmmusik zu 'Star Wars'?",
        answerA = "Hans Zimmer",
        answerB = "John Williams",
        answerC = "Ennio Morricone",
        answerD = "Danny Elfman",
        correctAnswer = 1,
        explanation = "John Williams komponierte die ikonische Star-Wars-Musik, darunter das beruehmte Hauptthema.",
        difficulty = 1,
        funFact = "John Williams hat fuer ueber 100 Filme die Musik geschrieben, darunter auch 'Indiana Jones', 'Jurassic Park' und 'Schindlers Liste'."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Komponist schrieb die Musik fuer die Filme 'The Dark Knight' und 'Inception'?",
        answerA = "John Williams",
        answerB = "Howard Shore",
        answerC = "Hans Zimmer",
        answerD = "James Newton Howard",
        correctAnswer = 2,
        explanation = "Hans Zimmer komponierte die Musik zu zahlreichen Christopher-Nolan-Filmen, darunter 'The Dark Knight' und 'Inception'.",
        difficulty = 1,
        funFact = "Das beruehmte tiefe 'Braaam'-Geraeusch aus dem 'Inception'-Trailer wurde von Hans Zimmer auf der Basis eines Edith-Piaf-Songs entwickelt."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie heisst das beruehmt gewordene Liebesthema aus dem Film 'Titanic' (1997)?",
        answerA = "Near and Far",
        answerB = "Heart of the Ocean",
        answerC = "My Heart Will Go On",
        answerD = "Love Will Stay",
        correctAnswer = 2,
        explanation = "'My Heart Will Go On' von Celine Dion ist das Titansong aus dem Film 'Titanic' und wurde ein weltweiter Hit.",
        difficulty = 1,
        funFact = "James Cameron wollte urspruenglich keinen Popsong im Film haben, liess sich aber von Komponist James Horner ueberzeugen."
    ),

    Question(
        categoryId = 4,
        questionText = "Wer sang den Titelsong 'Eye of the Tiger' aus dem Film 'Rocky III' (1982)?",
        answerA = "Survivor",
        answerB = "Journey",
        answerC = "Foreigner",
        answerD = "REO Speedwagon",
        correctAnswer = 0,
        explanation = "'Eye of the Tiger' wurde von der Rockband Survivor geschrieben und ist einer der bekanntesten Filmsongs aller Zeiten.",
        difficulty = 1,
        funFact = "Sylvester Stallone bat Survivor direkt um den Song, nachdem er fuer Rocky III kein Recht erhalten hatte, Queen-Songs zu verwenden."
    ),

    // ─── Bollywood-Grundlagen ─────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "In welcher Stadt wird der Grossteil der Bollywood-Filme produziert?",
        answerA = "Neu-Delhi",
        answerB = "Kolkata",
        answerC = "Mumbai",
        answerD = "Chennai",
        correctAnswer = 2,
        explanation = "Bollywood ist die hindisprachige Filmindustrie Indiens mit Zentrum in Mumbai (frueheres Bombay).",
        difficulty = 1,
        funFact = "Der Name 'Bollywood' setzt sich aus 'Bombay' (alter Name Mumbais) und 'Hollywood' zusammen."
    ),

    Question(
        categoryId = 4,
        questionText = "Welches Element ist typisch fuer klassische Bollywood-Filme?",
        answerA = "Sehr wenig Dialog",
        answerB = "Gesang und Tanz",
        answerC = "Nur Actionszenen",
        answerD = "Schwarz-Weiss-Fotografie",
        correctAnswer = 1,
        explanation = "Gesangs- und Tanzszenen sind ein Markenzeichen von Bollywood-Filmen und machen oft einen grossen Teil der Laufzeit aus.",
        difficulty = 1,
        funFact = "Indien produziert mehr Filme pro Jahr als jedes andere Land der Welt, einschliesslich der USA."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie heisst der indische Film-Superstar, der fuer seine Gesangs- und Tanzszenen weltberuehmt ist?",
        answerA = "Aamir Khan",
        answerB = "Amitabh Bachchan",
        answerC = "Shah Rukh Khan",
        answerD = "Salman Khan",
        correctAnswer = 2,
        explanation = "Shah Rukh Khan gilt als 'King of Bollywood' und ist einer der bekanntesten und reichsten Schauspieler der Welt.",
        difficulty = 1,
        funFact = "Shah Rukh Khan begann seine Karriere im indischen Fernsehen und wurde erst durch Bollywood weltberuehmt."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Bollywood-Film gewann 2023 den Oscar fuer den besten Original-Song?",
        answerA = "RRR",
        answerB = "Brahmastra",
        answerC = "Pathaan",
        answerD = "KGF Chapter 2",
        correctAnswer = 0,
        explanation = "Der Song 'Naatu Naatu' aus dem Film 'RRR' (2022) gewann bei der Oscarverleihung 2023 den Preis fuer den besten Originalsong.",
        difficulty = 1,
        funFact = "'Naatu Naatu' ist das erste indische Lied, das jemals einen Oscar gewonnen hat."
    ),

    // ─── Weitere allgemeine Film-Fragen ───────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welcher Film erzaehlt die Geschichte von Simba, dem jungen Loewen?",
        answerA = "Bambi",
        answerB = "Der Koenig der Loewen",
        answerC = "Die Dschungelbuch",
        answerD = "Tarzan",
        correctAnswer = 1,
        explanation = "'Der Koenig der Loewen' (1994) erzaehlt die Geschichte des jungen Loewen Simba, der seinen rechtmaessigen Platz als Koenig beanspruchen muss.",
        difficulty = 1,
        funFact = "'Der Koenig der Loewen' basiert lose auf Shakespeares 'Hamlet' und ist einer der erfolgreichsten Animationsfilme aller Zeiten."
    ),

    Question(
        categoryId = 4,
        questionText = "Welche Filmreihe erzaehlt die Abenteuer des jungen Zauberers Harry Potter?",
        answerA = "Chronicles of Narnia",
        answerB = "Lord of the Rings",
        answerC = "Harry Potter",
        answerD = "Eragon",
        correctAnswer = 2,
        explanation = "Die Harry-Potter-Filmreihe basiert auf den gleichnamigen Romanen von J. K. Rowling und umfasst acht Hauptfilme.",
        difficulty = 1,
        funFact = "Daniel Radcliffe wurde im Alter von elf Jahren fuer die Rolle des Harry Potter ausgewaehlt und spielte ihn bis zum Alter von 21 Jahren."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Disney-Film singt die Prinzessin das Lied 'Let It Go'?",
        answerA = "Brave",
        answerB = "Moana",
        answerC = "Frozen – Die Eiskoenigin",
        answerD = "Tangled",
        correctAnswer = 2,
        explanation = "Elsa singt 'Let It Go' (auf Deutsch: 'Lass jetzt los') in 'Frozen – Die Eiskoenigin' (2013).",
        difficulty = 1,
        funFact = "'Let It Go' gewann den Oscar fuer den besten Originalsong und wurde in ueber 40 Sprachen uebersetzt."
    ),

    Question(
        categoryId = 4,
        questionText = "Welche Filmfigur sagte den beruehmt-beruechtigten Satz: 'Ich bin dein Vater'?",
        answerA = "Darth Maul",
        answerB = "Darth Vader",
        answerC = "The Emperor",
        answerD = "Kylo Ren",
        correctAnswer = 1,
        explanation = "Darth Vader sagt zu Luke Skywalker in 'Das Imperium schlaegt zurueck' (1980) den legendaeren Satz 'Nein. Ich bin dein Vater.'",
        difficulty = 1,
        funFact = "Viele Menschen zitieren den Satz falsch als 'Luke, ich bin dein Vater' – das Wort 'Luke' kommt im Originalfilm an dieser Stelle nicht vor."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie viele Oscars gewann 'Der Herr der Ringe: Die Rueckkehr des Koenigs' (2003)?",
        answerA = "7",
        answerB = "9",
        answerC = "11",
        answerD = "13",
        correctAnswer = 2,
        explanation = "'Die Rueckkehr des Koenigs' gewann alle 11 Oscars, fuer die er nominiert war – ein bis heute ungebrochener Rekord.",
        difficulty = 1,
        funFact = "Nur 'Ben-Hur' (1959) und 'Titanic' (1997) haben ebenfalls 11 Oscars gewonnen – aber beide waren bei mehr Kategorien nominiert."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Schauspieler spielt Iron Man / Tony Stark im Marvel Cinematic Universe?",
        answerA = "Chris Evans",
        answerB = "Chris Hemsworth",
        answerC = "Robert Downey Jr.",
        answerD = "Mark Ruffalo",
        correctAnswer = 2,
        explanation = "Robert Downey Jr. spielte Tony Stark / Iron Man von 2008 bis 2019 und war die zentrale Figur des Marvel Cinematic Universe.",
        difficulty = 1,
        funFact = "Der erste MCU-Film 'Iron Man' (2008) kostete 140 Millionen Dollar und spielte weltweit ueber 585 Millionen Dollar ein."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Streaming-Dienst ist bekannt fuer Serien wie 'The Mandalorian' und 'Loki'?",
        answerA = "Netflix",
        answerB = "Amazon Prime Video",
        answerC = "Disney+",
        answerD = "Apple TV+",
        correctAnswer = 2,
        explanation = "'The Mandalorian' und 'Loki' sind Exklusivserien des Disney+-Streaming-Dienstes und spielen im Star-Wars- bzw. Marvel-Universum.",
        difficulty = 1,
        funFact = "Baby Yoda aus 'The Mandalorian' wurde zu einem der beliebtesten Internet-Memes noch vor dem Start der ersten Folge."
    )
)
