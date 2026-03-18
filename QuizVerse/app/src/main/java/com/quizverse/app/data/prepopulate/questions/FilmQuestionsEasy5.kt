package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun filmQuestionsEasy5(): List<Question> = listOf(

    // ─── ADVENTURE FILMS ──────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Wie lautet der vollstaendige Name des Abenteurer-Archaeologen aus der Indiana-Jones-Reihe?",
        answerA = "Henry Jones Jr.",
        answerB = "James Jones",
        answerC = "Robert Jones",
        answerD = "Edward Jones",
        correctAnswer = 0,
        explanation = "Indiana Jones ist der Spitzname. Der vollstaendige buergerliche Name der Figur lautet Henry Walton Jones Jr.",
        difficulty = 1,
        funFact = "Den Spitznamen 'Indiana' hat er von seinem Hund uebernommen, wie in 'Der letzte Kreuzzug' erklaert wird."
    ),

    Question(
        categoryId = 4,
        questionText = "Wer spielte Indiana Jones in den Originalfilmen?",
        answerA = "Tom Cruise",
        answerB = "Harrison Ford",
        answerC = "Mel Gibson",
        answerD = "Bruce Willis",
        correctAnswer = 1,
        explanation = "Harrison Ford verkoerperte Indiana Jones in allen fuenf Filmen der Hauptreihe, von 1981 bis 2023.",
        difficulty = 1,
        funFact = "Harrison Ford war urspruenglich nur als Platzhalter beim Casting vorgesehen, ueberzeugte aber so sehr, dass er die Rolle bekam."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie heisst der erste Indiana-Jones-Film von 1981?",
        answerA = "Der Tempel des Todes",
        answerB = "Der letzte Kreuzzug",
        answerC = "Jaeger des verlorenen Schatzes",
        answerD = "Das Koenigreich des Kristallschaedels",
        correctAnswer = 2,
        explanation = "'Jaeger des verlorenen Schatzes' (Raiders of the Lost Ark) war der erste Film und handelt von der Bundeslade.",
        difficulty = 1,
        funFact = "Der Film wurde in nur 73 Drehtagen fertiggestellt und kostete etwa 18 Millionen Dollar."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Film kaempft Captain Jack Sparrow gegen den Fliegenden Hollaender?",
        answerA = "Pirates of the Caribbean: Fluch der Karibik",
        answerB = "Pirates of the Caribbean: Fremde Gezeiten",
        answerC = "Pirates of the Caribbean: Am Ende der Welt",
        answerD = "Pirates of the Caribbean: Die Truhe des Todes",
        correctAnswer = 2,
        explanation = "Im dritten Teil 'Am Ende der Welt' (2007) kommt es zur grossen Seeschlacht gegen den Fliegenden Hollaender und Davy Jones.",
        difficulty = 1,
        funFact = "Die Dreharbeiten fuer Teil 2 und Teil 3 fanden gleichzeitig statt, was ueber 500 Drehtage ergab."
    ),

    Question(
        categoryId = 4,
        questionText = "Wer spielte Captain Jack Sparrow in 'Pirates of the Caribbean'?",
        answerA = "Orlando Bloom",
        answerB = "Johnny Depp",
        answerC = "Keira Knightley",
        answerD = "Geoffrey Rush",
        correctAnswer = 1,
        explanation = "Johnny Depp verkoerperte die exzentrische Piratenlegende Jack Sparrow in allen fuenf Teilen der Reihe.",
        difficulty = 1,
        funFact = "Johnny Depp soll fuer seine Darstellung von Jack Sparrow Inspiration aus Keith Richards' Auftreten gezogen haben."
    ),

    // ─── FANTASY FILMS ────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Wohin wird Dorothy im Film 'Der Zauberer von Oz' (1939) verschlagen?",
        answerA = "Nach Neverland",
        answerB = "Nach Narnia",
        answerC = "Nach Oz",
        answerD = "Nach Wonderland",
        correctAnswer = 2,
        explanation = "Ein Tornado reisst Dorothy aus Kansas und setzt sie im magischen Land Oz ab, wo sie den Zauberer suchen muss.",
        difficulty = 1,
        funFact = "Der Film wechselt bewusst von Schwarz-Weiss zu Farbe, sobald Dorothy in Oz ankommt."
    ),

    Question(
        categoryId = 4,
        questionText = "Was fehlt dem Blechmann im 'Zauberer von Oz'?",
        answerA = "Ein Herz",
        answerB = "Ein Gehirn",
        answerC = "Mut",
        answerD = "Ein Zuhause",
        correctAnswer = 0,
        explanation = "Der Blechmann wuenscht sich vom Zauberer ein Herz, der Strohmann ein Gehirn und der feige Loewe Mut.",
        difficulty = 1,
        funFact = "Der originale Blechmann-Schauspieler Buddy Ebsen musste die Rolle abbrechen, weil ihn die Aluminiumpuder-Schminke vergiftete."
    ),

    Question(
        categoryId = 4,
        questionText = "Durch welches Objekt gelangen die Kinder in den Filmen 'Die Chroniken von Narnia' in das magische Land?",
        answerA = "Durch einen Spiegel",
        answerB = "Durch einen Kleiderschrank",
        answerC = "Durch ein Gemaelder",
        answerD = "Durch eine Hinturtuer",
        correctAnswer = 1,
        explanation = "Im ersten Band und Film gelangen die Pevensie-Kinder durch einen alten Kleiderschrank nach Narnia.",
        difficulty = 1,
        funFact = "C. S. Lewis liess sich von einem echten Kleiderschrank in seinem Haus inspirieren, der noch heute besichtigt werden kann."
    ),

    Question(
        categoryId = 4,
        questionText = "Wer ist die boese Hexenkoenigin in 'Die Chroniken von Narnia: Der Koenig von Narnia'?",
        answerA = "Die Hexe des Westens",
        answerB = "Die Weisse Hexe",
        answerC = "Die Rote Koenigin",
        answerD = "Maleficent",
        correctAnswer = 1,
        explanation = "Jadis, die Weisse Hexe, hat Narnia in ewigen Winter versetzt und terrorisiert das Land, bis Aslan und die Kinder sie besiegen.",
        difficulty = 1,
        funFact = "Tilda Swinton spielte die Weisse Hexe und trug dabei keine Spezialeffekte – ihre natuerolich blasse Erscheinung reichte aus."
    ),

    // ─── BIOGRAPHICAL FILMS ───────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Ueber welche Rockband handelt der Biopic-Film 'Bohemian Rhapsody' (2018)?",
        answerA = "The Rolling Stones",
        answerB = "Led Zeppelin",
        answerC = "Queen",
        answerD = "The Beatles",
        correctAnswer = 2,
        explanation = "'Bohemian Rhapsody' erzaehlt die Geschichte der britischen Rockband Queen und ihres Saengers Freddie Mercury.",
        difficulty = 1,
        funFact = "Der Film endet mit einer Nachstellung des legendaeren Live-Aid-Auftritts von 1985, der als einer der besten Buehnenauftritte aller Zeiten gilt."
    ),

    Question(
        categoryId = 4,
        questionText = "Wer spielte Freddie Mercury im Film 'Bohemian Rhapsody'?",
        answerA = "Sacha Baron Cohen",
        answerB = "Rami Malek",
        answerC = "Jared Leto",
        answerD = "Ben Whishaw",
        correctAnswer = 1,
        explanation = "Rami Malek verkoerperte Freddie Mercury und gewann dafuer den Oscar als bester Hauptdarsteller.",
        difficulty = 1,
        funFact = "Rami Malek trainierte monatelang Gesang, Mimik und Buehnenauftritte, um Mercurys einzigartigen Stil zu imitieren."
    ),

    Question(
        categoryId = 4,
        questionText = "Um wen geht es im Film 'The Imitation Game' (2014)?",
        answerA = "Albert Einstein",
        answerB = "Marie Curie",
        answerC = "Alan Turing",
        answerD = "Stephen Hawking",
        correctAnswer = 2,
        explanation = "'The Imitation Game' erzaehlt die Geschichte von Alan Turing, dem britischen Mathematiker, der den deutschen Enigma-Code knackte.",
        difficulty = 1,
        funFact = "Alan Turings Arbeit soll den Zweiten Weltkrieg um bis zu zwei Jahre verkuerzt und Millionen Leben gerettet haben."
    ),

    Question(
        categoryId = 4,
        questionText = "Wer spielte Alan Turing im Film 'The Imitation Game'?",
        answerA = "Michael Fassbender",
        answerB = "Benedict Cumberbatch",
        answerC = "Eddie Redmayne",
        answerD = "Colin Firth",
        correctAnswer = 1,
        explanation = "Benedict Cumberbatch spielte Alan Turing und wurde dafuer fuer den Oscar als bester Hauptdarsteller nominiert.",
        difficulty = 1,
        funFact = "Benedict Cumberbatch spielte auch im selben Jahr die Stimme des Drachen Smaug in 'Der Hobbit'."
    ),

    // ─── SPORT FILMS ──────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "In welchem Sport kaeampft Rocky Balboa im gleichnamigen Film?",
        answerA = "Wrestling",
        answerB = "Boxen",
        answerC = "MMA",
        answerD = "Kickboxen",
        correctAnswer = 1,
        explanation = "Rocky Balboa ist ein Boxer aus Philadelphia, der sich gegen alle Widerstuecke den Weg zur Weltmeisterschaft boxt.",
        difficulty = 1,
        funFact = "Sylvester Stallone schrieb das Drehbuch zu 'Rocky' in nur drei Tagen und bestand darauf, selbst die Hauptrolle zu spielen."
    ),

    Question(
        categoryId = 4,
        questionText = "Wer spielte Rocky Balboa im ersten 'Rocky'-Film (1976)?",
        answerA = "Arnold Schwarzenegger",
        answerB = "Bruce Lee",
        answerC = "Sylvester Stallone",
        answerD = "Chuck Norris",
        correctAnswer = 2,
        explanation = "Sylvester Stallone spielte Rocky und schrieb auch das Drehbuch. Der Film gewann drei Oscars, darunter bester Film.",
        difficulty = 1,
        funFact = "Stallone war so arm, bevor Rocky ein Erfolg wurde, dass er angeblich seinen Hund verkaufen musste. Nach dem Erfolg kaufte er ihn zurueck."
    ),

    Question(
        categoryId = 4,
        questionText = "Wer ist der Hauptcharakter im Boxfilm 'Creed' (2015)?",
        answerA = "Apollo Creed",
        answerB = "Adonis Creed",
        answerC = "Duke Creed",
        answerD = "Rocky Creed",
        correctAnswer = 1,
        explanation = "Adonis Creed, Sohn des legendaeren Apollo Creed, wird von Rocky Balboa trainiert, um seinen eigenen Weg als Boxer zu gehen.",
        difficulty = 1,
        funFact = "'Creed' wurde von den Kritikern besser aufgenommen als die meisten Rocky-Fortsetzungen und gilt als wuerdiger Nachfolger."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Sportler inspirierte den Film 'Creed'?",
        answerA = "Muhammad Ali",
        answerB = "Mike Tyson",
        answerC = "Apollo Creed (Filmfigur)",
        answerD = "Floyd Mayweather",
        correctAnswer = 2,
        explanation = "Adonis Creed ist der Sohn der Filmfigur Apollo Creed aus den Rocky-Filmen. Es handelt sich also um eine rein fiktive Vorlage.",
        difficulty = 1,
        funFact = "Apollo Creed war seinerseits lose an Muhammad Ali angelehnt – charismatisch, schnell und ein Meister des Showbusiness."
    ),

    // ─── DOCUMENTARIES ────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Wer moderiert und narrierte die BBC-Dokumentarserie 'Planet Erde'?",
        answerA = "David Attenborough",
        answerB = "Jacques Cousteau",
        answerC = "Morgan Freeman",
        answerD = "Barack Obama",
        correctAnswer = 0,
        explanation = "Sir David Attenborough ist die ikonische Stimme hinter 'Planet Erde' und zahlreichen anderen Naturdokumentationen der BBC.",
        difficulty = 1,
        funFact = "David Attenborough begann seine Karriere beim BBC in den 1950er-Jahren und ist heute ueber 90 Jahre alt und immer noch aktiv."
    ),

    Question(
        categoryId = 4,
        questionText = "Auf welcher Plattform erschien die Naturdokumentation 'Our Planet' (2019)?",
        answerA = "Disney+",
        answerB = "Amazon Prime",
        answerC = "Netflix",
        answerD = "Apple TV+",
        correctAnswer = 2,
        explanation = "'Our Planet' ist eine Netflix-Original-Produktion, ebenfalls mit David Attenborough als Erzaehler.",
        difficulty = 1,
        funFact = "'Our Planet' wurde in 50 Laendern gedreht und zeigt erstmals explizit den Einfluss des Klimawandels auf Tiere und Lebensraeume."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist eine Dokumentation?",
        answerA = "Ein erfundener Spielfilm mit echten Schauspielern",
        answerB = "Ein Film, der reale Ereignisse, Menschen oder Themen zeigt",
        answerC = "Ein Animationsfilm fuer Kinder",
        answerD = "Ein Horrorfilm auf Basis wahrer Ereignisse",
        correctAnswer = 1,
        explanation = "Dokumentarfilme halten echte Begebenheiten, Menschen, Natur oder gesellschaftliche Themen fest – ohne gespielte Handlung.",
        difficulty = 1,
        funFact = "Die Bezeichnung 'Dokumentarfilm' wurde 1926 vom schottischen Filmemacher John Grierson gepraegte."
    ),

    // ─── ASIAN CINEMA ─────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Aus welchem Land stammt das urspruengliche Godzilla-Monster?",
        answerA = "China",
        answerB = "Japan",
        answerC = "Korea",
        answerD = "USA",
        correctAnswer = 1,
        explanation = "Godzilla (Gojira) ist ein japanisches Monster und wurde 1954 von der Toho-Filmgesellschaft in Japan erschaffen.",
        difficulty = 1,
        funFact = "Der Name 'Gojira' ist eine Kombination aus den japanischen Woertern fuer Gorilla ('gorira') und Wal ('kujira')."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist Anime?",
        answerA = "Japanische Trickfilme und Animationsserien",
        answerB = "Koreanische Soap Operas",
        answerC = "Chinesische Kampfkunstfilme",
        answerD = "Indische Musicalfilme",
        correctAnswer = 0,
        explanation = "Anime bezeichnet den japanischen Animationsstil, der sowohl Kinofilme als auch Fernsehserien umfasst.",
        difficulty = 1,
        funFact = "Das japanische Wort 'Anime' ist einfach die Kurzform des englischen Wortes 'Animation' und bezeichnet dort jede Art von Zeichentrick."
    ),

    Question(
        categoryId = 4,
        questionText = "Welches bekannte Anime-Studio produzierte Filme wie 'Mein Nachbar Totoro' und 'Chihiros Reise ins Zauberland'?",
        answerA = "Toei Animation",
        answerB = "Gainax",
        answerC = "Studio Ghibli",
        answerD = "Madhouse",
        correctAnswer = 2,
        explanation = "Studio Ghibli ist das beruehme japanische Animationsstudio, das von Hayao Miyazaki und Isao Takahata gegruendet wurde.",
        difficulty = 1,
        funFact = "Studio Ghibli bedeutet auf Arabisch 'heisser Saharawind' – der Gruender Miyazaki war ein Flugzeug-Enthusiast und benannte es nach einem italienischen Spaehflugzeug."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Regisseur ist bekannt fuer die Ghibli-Filme 'Mein Nachbar Totoro' und 'Prinzessin Mononoke'?",
        answerA = "Akira Kurosawa",
        answerB = "Hayao Miyazaki",
        answerC = "Mamoru Hosoda",
        answerD = "Makoto Shinkai",
        correctAnswer = 1,
        explanation = "Hayao Miyazaki ist der Mitgruender von Studio Ghibli und einer der einflussreichsten Animationsregisseure der Welt.",
        difficulty = 1,
        funFact = "Miyazaki hat mehrfach den Ruhestand angekuendigt, aber jedes Mal neue Projekte begonnen – er liebt das Filmemachen zu sehr."
    ),

    // ─── TV DETECTIVES ────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welche Markenkleidung traegt der TV-Detektiv Columbo stets?",
        answerA = "Einen langen schwarzen Mantel",
        answerB = "Einen zerknitterten Regenmantel",
        answerC = "Einen Trenchcoat mit Hutt",
        answerD = "Eine elegante Anzugjacke",
        correctAnswer = 1,
        explanation = "Columbo ist bekannt fuer seinen abgetragenen, zerknitterten Regenmantel, der Teil seiner unverwechselbaren Erscheinung ist.",
        difficulty = 1,
        funFact = "Der Regenmantel, den Peter Falk als Columbo trug, war sein eigener privater Mantel – er mochte ihn einfach so sehr."
    ),

    Question(
        categoryId = 4,
        questionText = "Wer spielte den TV-Detektiv Columbo in der gleichnamigen US-Serie?",
        answerA = "Columbo",
        answerB = "Jack Lemmon",
        answerC = "Peter Falk",
        answerD = "Gene Hackman",
        correctAnswer = 2,
        explanation = "Peter Falk spielte Lieutenant Columbo von 1968 bis 2003 und wurde damit zur ikonischen Serienlegende.",
        difficulty = 1,
        funFact = "Peter Falk hatte ein Glasauge, was er in der Serie nie verbarg – es wurde sogar manchmal als Requisite eingesetzt."
    ),

    Question(
        categoryId = 4,
        questionText = "Wer schrieb die Detektivgeschichten um Sherlock Holmes?",
        answerA = "Agatha Christie",
        answerB = "Arthur Conan Doyle",
        answerC = "Edgar Allan Poe",
        answerD = "Charles Dickens",
        correctAnswer = 1,
        explanation = "Sir Arthur Conan Doyle schrieb die Sherlock-Holmes-Geschichten, die erstmals zwischen 1887 und 1927 verooeffentlicht wurden.",
        difficulty = 1,
        funFact = "Doyle versuchte Sherlock Holmes in der Geschichte 'Das letzte Problem' zu toeten, musste ihn aber wegen des oeffentlichen Drucks wieder zum Leben erwecken."
    ),

    Question(
        categoryId = 4,
        questionText = "Wo wohnt Sherlock Holmes laut den Originalgeschichten?",
        answerA = "221B Baker Street, London",
        answerB = "10 Downing Street, London",
        answerC = "15 Oxford Street, London",
        answerD = "42 Fleet Street, London",
        correctAnswer = 0,
        explanation = "Sherlock Holmes und sein Freund Dr. Watson wohnen in der fiktiven Wohnung 221B Baker Street in London.",
        difficulty = 1,
        funFact = "Die Baker Street gibt es wirklich. Da so viele Fans Briefe schickten, gibt es ein Sherlock-Holmes-Museum in der Nummmer 221b."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie heisst der treue Freund und Mitbewohner von Sherlock Holmes?",
        answerA = "Dr. Moriarty",
        answerB = "Inspektor Lestrade",
        answerC = "Dr. Watson",
        answerD = "Mycroft Holmes",
        correctAnswer = 2,
        explanation = "Dr. John H. Watson ist Holmes treuer Begleiter, Freund und Chronist seiner Abenteuer.",
        difficulty = 1,
        funFact = "Watson erzaehlt die meisten Holmes-Geschichten aus seiner Perspektive, was eine Erzaehltechnik ist, die Conan Doyle von Edgar Allan Poe uebernommen hat."
    ),

    // ─── LATE-NIGHT SHOWS ─────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Was ist eine Late-Night-Show?",
        answerA = "Ein Horrorfilm, der nur nachts ausgestrahlt wird",
        answerB = "Eine spaet-abends ausgestrahlte Unterhaltungssendung mit Gastinterviews",
        answerC = "Eine Musikshow die nur in der Nacht laeuft",
        answerD = "Eine Nachrichtensendung fuer Nachtarbeiter",
        correctAnswer = 1,
        explanation = "Late-Night-Shows sind spaetabendliche Talkshows mit einem Gastgeber, der Prominente interviewt, Witze macht und mit dem Publikum interagiert.",
        difficulty = 1,
        funFact = "Das Late-Night-Format wurde in den USA gepraegt und begann in den 1950er Jahren mit Steve Allen und 'The Tonight Show'."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie heisst eine beruehmte deutsche Late-Night-Show, die von Harald Schmidt moderiert wurde?",
        answerA = "Heute-Show",
        answerB = "Die Harald Schmidt Show",
        answerC = "TV Total",
        answerD = "Circus HalliGalli",
        correctAnswer = 1,
        explanation = "Die 'Harald Schmidt Show' lief von 1995 bis 2012 und war die erste erfolgreiche deutsche Late-Night-Show nach US-Vorbild.",
        difficulty = 1,
        funFact = "Harald Schmidt gilt als der Erfinder der deutschen Late-Night-Show und praegt bis heute das Format im deutschen Fernsehen."
    ),

    Question(
        categoryId = 4,
        questionText = "Welches amerikanische Late-Night-Format hatte Conan O'Brien moderiert?",
        answerA = "The Tonight Show",
        answerB = "Late Night / Conan",
        answerC = "The Daily Show",
        answerD = "Jimmy Kimmel Live",
        correctAnswer = 1,
        explanation = "Conan O'Brien moderierte 'Late Night with Conan O'Brien' bei NBC und spaeter 'Conan' bei TBS bis 2021.",
        difficulty = 1,
        funFact = "Conan O'Brien studierte Literatur in Harvard und schrieb anfangs fuer 'The Simpsons', bevor er Late-Night-Host wurde."
    ),

    // ─── SOAP OPERAS ──────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Was ist eine Seifenoper (Soap Opera)?",
        answerA = "Ein kurzfristiger Kriminalfilm",
        answerB = "Eine laengliche Drama-Fernsehserie mit immer neuen Verwicklungen",
        answerC = "Eine Werbung fuer Seifenprodukte",
        answerD = "Ein Opernfilm ueber Seifenherstellung",
        correctAnswer = 1,
        explanation = "Soap Operas sind langlaufende Dramasserien, die oft taeglich ausgestrahlt werden und endlose Familiendramen, Liebesgeschichten und Intrigen zeigen.",
        difficulty = 1,
        funFact = "Der Name 'Soap Opera' kommt daher, dass fruehe amerikanische Serien von Seifenherstellern wie Procter & Gamble gesponsert wurden."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie heisst eine bekannte deutsche Seifenoper, die seit 1992 laeuft?",
        answerA = "Verbotene Liebe",
        answerB = "Gute Zeiten, schlechte Zeiten",
        answerC = "Marienhof",
        answerD = "Sturm der Liebe",
        correctAnswer = 1,
        explanation = "'Gute Zeiten, schlechte Zeiten' (GZSZ) laeuft seit 1992 auf RTL und ist eine der am laengsten laufenden deutschen Serien.",
        difficulty = 1,
        funFact = "GZSZ startete als Adaptation der australischen Serie 'The Restless Years' und wurde dann mit eigenem Inhalt fortgefuehrt."
    ),

    Question(
        categoryId = 4,
        questionText = "Welche amerikanische Seifenoper zeigte das Familiendrama der Ewing-Familie in Texas?",
        answerA = "The Bold and the Beautiful",
        answerB = "General Hospital",
        answerC = "Dallas",
        answerD = "Dynasty",
        correctAnswer = 2,
        explanation = "'Dallas' lief von 1978 bis 1991 und drehte sich um die reiche Oelfamilie Ewing. Die Frage 'Wer erschoss J.R.?' wurde zum Kulturphaenomen.",
        difficulty = 1,
        funFact = "Die Episode 'Wer erschoss J.R.?' erzielte 1980 die hoechste Einschaltquote aller Zeiten fuer eine US-Serie bis dahin."
    ),

    // ─── FILM TECHNOLOGY ──────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Was bedeutet '3D-Kino'?",
        answerA = "Ein Film wird dreimal hintereinander gezeigt",
        answerB = "Der Film wirkt durch eine Brille raeumlich und tiefenstark",
        answerC = "Der Film hat drei verschiedene Enden",
        answerD = "Der Film verwendet drei Kameras gleichzeitig",
        correctAnswer = 1,
        explanation = "Beim 3D-Kino erzeugt eine spezielle Brille den Eindruck von Raumtiefe, sodass Bilder plastisch und dreidimensional wirken.",
        difficulty = 1,
        funFact = "3D-Kino gibt es seit den 1950er-Jahren, aber erst mit 'Avatar' (2009) wurde es zum Massenformat."
    ),

    Question(
        categoryId = 4,
        questionText = "Wofuer steht die Abkuerzung 'IMAX'?",
        answerA = "International Maximum",
        answerB = "Image Maximum",
        answerC = "Immersive Audio Experience",
        answerD = "Interactive Movie Axis",
        correctAnswer = 1,
        explanation = "IMAX steht fuer 'Image Maximum' und bezeichnet ein Filmformat mit extrem grossen Leinwaenden und hoher Bildqualitaet.",
        difficulty = 1,
        funFact = "IMAX-Kameras sind so gross und schwer, dass sie kaum fuer laengere Drehs einsetzbar sind. Viele Regisseure nutzen sie daher nur fuer einzelne Szenen."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist CGI im Filmbereich?",
        answerA = "Ein Kamera-Typ fuer Nahaufnahmen",
        answerB = "Computergenierte Bilder und Effekte",
        answerC = "Ein Schnittverfahren fuer Actionszenen",
        answerD = "Ein Tonformat fuer grosse Kinos",
        correctAnswer = 1,
        explanation = "CGI (Computer-Generated Imagery) bezeichnet digitale Bilder und Spezialeffekte, die am Computer erstellt werden.",
        difficulty = 1,
        funFact = "Der erste Spielfilm mit vollstaendig computergenerierten Charakteren war 'Toy Story' (1995) von Pixar."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist ein 'Blockbuster' im Filmbereich?",
        answerA = "Ein guenstiger Independentfilm",
        answerB = "Ein Dokumentarfilm",
        answerC = "Ein Grossproduktion mit riesigem Budget und Publikumserfolg",
        answerD = "Ein Filmfestival-Gewinner",
        correctAnswer = 2,
        explanation = "Als Blockbuster bezeichnet man Produktionen mit grossem Budget, die auf kommerziellen Massenerfolg ausgerichtet sind.",
        difficulty = 1,
        funFact = "Der Begriff 'Blockbuster' stammt aus dem Zweiten Weltkrieg – so hiessen Bomben, die ganze Haeuserbloecke vernichten konnten. Er wurde dann auf Kassenhits uebertragen."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Film von 2009 war ein Meilenstein fuer 3D und CGI und spielte weltweit am meisten ein?",
        answerA = "Transformers",
        answerB = "Avatar",
        answerC = "Iron Man",
        answerD = "The Matrix Reloaded",
        correctAnswer = 1,
        explanation = "James Camerons 'Avatar' (2009) war ein Meilenstein der Filmtechnologie und wurde zum weltweit erfolgreichsten Film aller Zeiten (bereinigt).",
        difficulty = 1,
        funFact = "James Cameron wartete 15 Jahre auf die richtige Technologie, bevor er 'Avatar' drehen konnte."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist ein 'Greenscreen' beim Filmen?",
        answerA = "Eine spezielle Linse fuer Naturaufnahmen",
        answerB = "Ein gruener Hintergrund, der spaeter durch digitale Bilder ersetzt wird",
        answerC = "Ein Umweltzertifikat fuer nachhaltige Filmproduktionen",
        answerD = "Eine gruene Signalfarbe fuer die Beleuchtung",
        correctAnswer = 1,
        explanation = "Ein Greenscreen ist ein einfarbig gruener Hintergrund, der in der Nachbearbeitung durch beliebige Bilder oder Welten ersetzt werden kann.",
        difficulty = 1,
        funFact = "Urspruenglich wurden Bluescreen-Verfahren genutzt, aber Gruenschirme erzeugen weniger Farbkanten bei menschlicher Haut."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist Dolby-Surround-Sound im Kino?",
        answerA = "Ein Bildformat fuer breitere Leinwaende",
        answerB = "Ein Raumklangsystem mit Lautsprechern rund um den Zuschauerraum",
        answerC = "Eine Software fuer digitale Filmschnitte",
        answerD = "Ein Mikrofon-Typ fuer Filmaufnahmen",
        correctAnswer = 1,
        explanation = "Dolby Surround platziert Lautsprecher rund um das Publikum, sodass Klaenge von allen Seiten kommen und eine immersive Klangwelt entstehen.",
        difficulty = 1,
        funFact = "Dolby Laboratories wurde 1965 von Ray Dolby gegruendet. Das erste Kino mit Dolby-Sound war 1975 in London."
    ),

    Question(
        categoryId = 4,
        questionText = "Was macht ein Filmeditor (Cutter)?",
        answerA = "Er schreibt das Drehbuch",
        answerB = "Er schneidet und arrangiert die Filmszenen in die finale Reihenfolge",
        answerC = "Er bedient die Kamera waehrend des Drehs",
        answerD = "Er mischt die Tonspuren des Films",
        correctAnswer = 1,
        explanation = "Der Filmeditor schneidet die gedrehten Szenen, waehlt die besten Takes aus und montiert den Film in eine koemische Erzaehlung.",
        difficulty = 1,
        funFact = "Fruehe Filmschnitte wurden buchstaeblich mit Scheren und Kleber durchgefuehrt. Erst in den 1980ern kamen digitale Schnittsysteme."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist eine 'Stunt-Person' beim Film?",
        answerA = "Ein Schauspieler, der sehr lustige Rollen spielt",
        answerB = "Ein Ersatzdarsteller fuer gefaehrliche Aktionen und Szenen",
        answerC = "Ein Maskenbildner fuer Spezialschminken",
        answerD = "Ein Assistent des Regisseurs",
        correctAnswer = 1,
        explanation = "Stuntleute fuehren gefaehrliche Szenen (Autoverfolgungen, Explosionen, Kaempfe) stellvertretend fuer die Hauptdarsteller durch.",
        difficulty = 1,
        funFact = "Jackie Chan ist dafuer bekannt, fast alle seine Stunts selbst zu machen und hat sich dabei zahlreiche Knochen gebrochen."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist ein 'Trailer' im Filmbereich?",
        answerA = "Der Anhaenger, in dem die Schauspieler sich umziehen",
        answerB = "Ein kurzer Vorschaufilm, der einen kommenden Film bewirbt",
        answerC = "Das Ende eines Films nach dem Abspann",
        answerD = "Ein Zusatzfilm mit deleted scenes",
        correctAnswer = 1,
        explanation = "Ein Filmtrailer ist ein kurzer Werbefilm, der aus Szenen des kommenden Films zusammengestellt wird, um Publikum anzulocken.",
        difficulty = 1,
        funFact = "Fruehe Trailer wurden am Ende der Vorstellung gezeigt (daher 'trailer' = 'nachfolgend'), heute laufen sie immer vor dem Hauptfilm."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist ein Filmfestival?",
        answerA = "Eine Feier fuer Schauspieler nach einem grossen Hit",
        answerB = "Eine Veranstaltung, bei der Filme gezeigt und Preise vergeben werden",
        answerC = "Ein Filmstudio-Fest fuer Mitarbeiter",
        answerD = "Eine Messe fuer Kinotechnik",
        correctAnswer = 1,
        explanation = "Filmfestivals wie Cannes, Berlin oder Venedig sind Veranstaltungen, bei denen neue Filme gezeigt werden und Jurys Preise vergeben.",
        difficulty = 1,
        funFact = "Das Filmfestival in Venedig (Mostra) ist das aelteste Filmfestival der Welt und wurde 1932 gegruendet."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie heisst der wichtigste Filmpreis in den USA?",
        answerA = "Der Golden Globe",
        answerB = "Der BAFTA",
        answerC = "Der Oscar",
        answerD = "Der Emmy",
        correctAnswer = 2,
        explanation = "Der Oscar (offiziell Academy Award) ist der begehrteste Filmpreis der Welt und wird jaehrlich von der Academy of Motion Picture Arts and Sciences vergeben.",
        difficulty = 1,
        funFact = "Die Statuette heisst offiziell 'Academy Award of Merit'. Den Spitznamen 'Oscar' soll eine Sekretaerin gepraegte haben, die eine Aehnlichkeit mit ihrem Onkel Oscar sah."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist der Emmy-Preis?",
        answerA = "Der wichtigste Filmpreis fuer Kinoproduktionen",
        answerB = "Der wichtigste Preis fuer Fernsehproduktionen in den USA",
        answerC = "Ein Preis fuer Musikvideos",
        answerD = "Ein europeaeischer Filmpreis",
        correctAnswer = 1,
        explanation = "Der Emmy Award ist das Aequivalent des Oscars fuer das Fernsehen – er wird fuer herausragende Leistungen in US-amerikanischen TV-Produktionen verliehen.",
        difficulty = 1,
        funFact = "Der Name 'Emmy' ist eine Ableitung von 'Immy', dem Spitznamen fuer einen fruehen Kameratyp namens Iconoscope."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist ein 'Casting' beim Film?",
        answerA = "Das Aufnehmen von Szenen mit einer Spezialkamera",
        answerB = "Die Auswahl von Schauspielern fuer die Rollen eines Films",
        answerC = "Das Mischen der Musikspur mit dem Dialog",
        answerD = "Das Einfaerben von Schwarz-Weiss-Filmen",
        correctAnswer = 1,
        explanation = "Beim Casting sucht ein Regisseur oder Casting-Direktor passende Schauspieler fuer jede Rolle durch Vorsprechen und Probeaufnahmen.",
        difficulty = 1,
        funFact = "Viele weltberuehme Schauspieler wurden bei spontanen Castings entdeckt – zum Beispiel wurde Harrison Ford beim Reparieren einer Tuer in den Studios gefunden."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist ein 'Remake' im Filmbereich?",
        answerA = "Ein Film, der in einer anderen Sprache synchronisiert wird",
        answerB = "Eine Neuverfilmung eines bereits existierenden Films",
        answerC = "Ein Director's Cut mit zusaetzlichen Szenen",
        answerD = "Ein Film der direkt als Download veroeffentlicht wird",
        correctAnswer = 1,
        explanation = "Ein Remake ist eine neue Version eines bereits bekannten Films, oft mit modernem Stil, neuer Besetzung oder aktualisierter Geschichte.",
        difficulty = 1,
        funFact = "Hollywood produziert jaehrlich Dutzende Remakes – oft werden asiatische Erfolgsfilme wie 'The Ring' (Remake des japanischen 'Ringu') neu verfilmt."
    )

)
