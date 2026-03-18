package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun filmQuestionsEasy3(): List<Question> = listOf(

    // ─── SUPERHERO FILMS ──────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welcher Superheld schwingt sich mit Spinnenfaeden durch New York?",
        answerA = "Batman",
        answerB = "Superman",
        answerC = "Spider-Man",
        answerD = "Iron Man",
        correctAnswer = 2,
        explanation = "Spider-Man, alias Peter Parker, nutzt seine Spinnenfaeden um sich durch New York zu schwingen.",
        difficulty = 1,
        funFact = "In den Comics wurde Spider-Man 1962 von Stan Lee und Steve Ditko erfunden."
    ),

    Question(
        categoryId = 4,
        questionText = "In welcher Stadt lebt Batman?",
        answerA = "Metropolis",
        answerB = "Gotham City",
        answerC = "New York",
        answerD = "Star City",
        correctAnswer = 1,
        explanation = "Batman beschuetzt Gotham City, eine fiktive, dunkle Grossstadt, die oft an New York erinnert.",
        difficulty = 1,
        funFact = "Gotham City ist ein alter Spitzname fuer New York City aus dem 19. Jahrhundert."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie lautet der buergerliche Name von Superman?",
        answerA = "Bruce Wayne",
        answerB = "Clark Kent",
        answerC = "Peter Parker",
        answerD = "Tony Stark",
        correctAnswer = 1,
        explanation = "Superman lebt unter dem Namen Clark Kent als Journalist in Metropolis.",
        difficulty = 1,
        funFact = "Der Name Clark Kent wurde von den Schauspielern Clark Gable und Kent Taylor inspiriert."
    ),

    Question(
        categoryId = 4,
        questionText = "Von welchem Planeten stammt Superman urspruenglich?",
        answerA = "Mars",
        answerB = "Krypton",
        answerC = "Vulkan",
        answerD = "Tatooine",
        correctAnswer = 1,
        explanation = "Superman wurde auf dem Planeten Krypton geboren und als Baby zur Erde geschickt, bevor Krypton zerstoert wurde.",
        difficulty = 1,
        funFact = "Das Wort 'Kryptonit' hat es als Begriff fuer eine persoenliche Schwaeche in den alltaeglichen Sprachgebrauch geschafft."
    ),

    Question(
        categoryId = 4,
        questionText = "Wer ist Wonder Woman?",
        answerA = "Eine Gottin aus Asgard",
        answerB = "Eine Amazonen-Kriegerin",
        answerC = "Eine Agentin von S.H.I.E.L.D.",
        answerD = "Eine Mutantin",
        correctAnswer = 1,
        explanation = "Wonder Woman, auch Diana Prince, ist eine Amazonen-Kriegerin von der mythischen Insel Themyscira.",
        difficulty = 1,
        funFact = "Wonder Woman wurde 1941 von William Moulton Marston erschaffen, der auch den Luegendetektor mitentwickelte."
    ),

    Question(
        categoryId = 4,
        questionText = "Welche Schauspielerin spielte Wonder Woman im gleichnamigen Film von 2017?",
        answerA = "Scarlett Johansson",
        answerB = "Brie Larson",
        answerC = "Gal Gadot",
        answerD = "Jennifer Lawrence",
        correctAnswer = 2,
        explanation = "Gal Gadot verkörperte Wonder Woman im DC-Film von 2017, der von Patty Jenkins inszeniert wurde.",
        difficulty = 1,
        funFact = "Gal Gadot war Schoenheitskoenigin in Israel bevor sie Schauspielerin wurde."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie heisst Spider-Mans buergerlicher Name in den Filmen mit Tobey Maguire?",
        answerA = "Miles Morales",
        answerB = "Peter Parker",
        answerC = "Harry Osborn",
        answerD = "Eddie Brock",
        correctAnswer = 1,
        explanation = "Tobey Maguire spielte Peter Parker / Spider-Man in Sam Raimis Spider-Man-Trilogie (2002-2007).",
        difficulty = 1,
        funFact = "Sam Raimis 'Spider-Man' (2002) war einer der ersten grossen Superhelden-Blockbuster der modernen Aera."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist Batmans groesste Staerke, da er keine Superkraefte hat?",
        answerA = "Magie",
        answerB = "Sein Reichtum und sein Intellekt",
        answerC = "Schnelligkeit",
        answerD = "Telepathie",
        correctAnswer = 1,
        explanation = "Batman ist der milliardenschwere Bruce Wayne. Er kaempft mit Technologie, Gadgets und hervorragendem Detektivverstand.",
        difficulty = 1,
        funFact = null
    ),

    // ─── ANIMATED CLASSICS ───────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welches Disney-Lied aus 'Frozen' wurde weltweit zum groessten Hit?",
        answerA = "Let It Go",
        answerB = "Part of Your World",
        answerC = "Circle of Life",
        answerD = "Hakuna Matata",
        correctAnswer = 0,
        explanation = "'Let It Go' (deutsch: 'Lass jetzt los') aus Frozen (2013) wurde zum weltweiten Megahit und ist untrennbar mit dem Film verbunden.",
        difficulty = 1,
        funFact = "'Let It Go' gewann 2014 den Oscar fuer den besten Originalsong."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie heisst Nemos Vater in 'Findet Nemo'?",
        answerA = "Marlin",
        answerB = "Bruce",
        answerC = "Crush",
        answerD = "Gill",
        correctAnswer = 0,
        explanation = "Marlins Vater ist ein aengstlicher Clownfisch, der seinen Sohn Nemo quer durch den Ozean sucht.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Spielzeugkasper ist der Anführer in 'Toy Story'?",
        answerA = "Buzz Lightyear",
        answerB = "Woody",
        answerC = "Rex",
        answerD = "Hamm",
        correctAnswer = 1,
        explanation = "Woody, der Cowboy, ist Andys liebstes Spielzeug und der anerkannte Anführer der Spielzeuggruppe.",
        difficulty = 1,
        funFact = "Tom Hanks leiht Woody seit dem ersten Film von 1995 bis heute seine Stimme."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Spruch sagt Buzz Lightyear staendig in 'Toy Story'?",
        answerA = "'Bis zur Unendlichkeit und noch viel weiter!'",
        answerB = "'Ich bin dein Vater!'",
        answerC = "'Hakuna Matata!'",
        answerD = "'Just keep swimming!'",
        correctAnswer = 0,
        explanation = "Buzz Lightyears beruehmstes Zitat ist 'Bis zur Unendlichkeit und noch viel weiter!' — im Original 'To infinity and beyond!'",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Land spielt der Animationsfilm 'Shrek' hauptsaechlich?",
        answerA = "Ein Koenig-Arthur-Koenigreich",
        answerB = "Duloc / ein Maerchen-Koenigreich",
        answerC = "Das Oger-Reich",
        answerD = "Das Hexenland",
        correctAnswer = 1,
        explanation = "Shrek spielt in einem generischen Maerchen-Koenigreich rund um Duloc, dem Reich des boesen Lord Farquaad.",
        difficulty = 1,
        funFact = "Shrek gewann 2002 den ersten Oscar fuer den besten Animationsfilm."
    ),

    Question(
        categoryId = 4,
        questionText = "Welches Tier ist Shreks bester Freund?",
        answerA = "Ein Kater mit Stiefeln",
        answerB = "Ein sprechender Esel",
        answerC = "Ein Drache",
        answerD = "Ein Frosch",
        correctAnswer = 1,
        explanation = "Donkey, der gespraeche Esel (gesprochen von Eddie Murphy), ist Shreks untrennbarer Begleiter.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Welchen Song singt Simba in 'Der Koenig der Loewen'?",
        answerA = "Hakuna Matata",
        answerB = "Can You Feel the Love Tonight",
        answerC = "I Just Can't Wait to Be King",
        answerD = "Circle of Life",
        correctAnswer = 2,
        explanation = "Als junger Loewe singt Simba den Song 'I Just Can't Wait to Be King' und freut sich auf seine Zukunft als Koenig.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Wie heisst Simbas boesartiger Onkel in 'Der Koenig der Loewen'?",
        answerA = "Mufasa",
        answerB = "Scar",
        answerC = "Rafiki",
        answerD = "Nala",
        correctAnswer = 1,
        explanation = "Scar, Mufasas jüngerer Bruder, toetet Mufasa und verbuendet sich mit den Hyaenen um die Herrschaft zu uebernehmen.",
        difficulty = 1,
        funFact = "Jeremy Irons lieh Scar im Original seine Stimme und machte ihn zum unvergesslichen Schurken."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist Elsas Magie in 'Frozen'?",
        answerA = "Feuer",
        answerB = "Wind",
        answerC = "Eis und Schnee",
        answerD = "Wasser",
        correctAnswer = 2,
        explanation = "Elsa hat die Faehigkeit Eis und Schnee zu erzeugen und zu kontrollieren, was sie anfangs als Last empfindet.",
        difficulty = 1,
        funFact = null
    ),

    // ─── FAMOUS TV SERIES ────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "In welcher Stadt leben die Simpsons?",
        answerA = "Springfield",
        answerB = "Shelbyville",
        answerC = "Quahog",
        answerD = "South Park",
        correctAnswer = 0,
        explanation = "Die Simpsons leben in Springfield — einem absichtlich generisch gehaltenem Ort, der in keinem bestimmten US-Staat liegt.",
        difficulty = 1,
        funFact = "Serienschöpfer Matt Groening benannte Springfield nach der Stadt Springfield im US-Staat Oregon."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie heisst Barts Lieblingsausruf in 'Die Simpsons'?",
        answerA = "Woo-hoo!",
        answerB = "D'oh!",
        answerC = "Ay caramba!",
        answerD = "Cowabunga!",
        correctAnswer = 2,
        explanation = "Bart Simpsons bekanntester Ausruf ist 'Ay caramba!' — ein spanischer Ausruf der Ueberraschung.",
        difficulty = 1,
        funFact = "Homers Ausruf 'D'oh!' wurde 2001 offiziell ins Oxford English Dictionary aufgenommen."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem US-Staat spielt 'South Park'?",
        answerA = "Montana",
        answerB = "Wyoming",
        answerC = "Colorado",
        answerD = "Utah",
        correctAnswer = 2,
        explanation = "South Park ist eine Kleinstadt im US-Staat Colorado, genauer in den Rocky Mountains.",
        difficulty = 1,
        funFact = "Es gibt tatsaechlich eine Kleinstadt namens South Park in Colorado."
    ),

    Question(
        categoryId = 4,
        questionText = "Wer stirbt in 'South Park' fast jede Folge?",
        answerA = "Stan Marsh",
        answerB = "Kyle Broflovski",
        answerC = "Kenny McCormick",
        answerD = "Eric Cartman",
        correctAnswer = 2,
        explanation = "Kenny McCormick stirbt in fast jeder Folge auf groteske Weise, kehrt aber in der naechsten Folge unvermittelt zurueck.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "In welcher Kleinstadt spielt 'Stranger Things'?",
        answerA = "Derry",
        answerB = "Hawkins",
        answerC = "Castle Rock",
        answerD = "Salem",
        correctAnswer = 1,
        explanation = "Stranger Things spielt in Hawkins, Indiana, einer fiktiven Kleinstadt in den 1980er Jahren.",
        difficulty = 1,
        funFact = "Hawkins ist nach dem NASA-Astronomen Jim Hawkins benannt — eine Anspielung auf Wissenschaft und das Unbekannte."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie heisst das Maedchen mit Superkraeften in 'Stranger Things'?",
        answerA = "Max",
        answerB = "Joyce",
        answerC = "Eleven",
        answerD = "Robin",
        correctAnswer = 2,
        explanation = "Eleven (Elf) ist ein Maedchen mit telekinetischen Kraeften, das aus einem Regierungs-Labor entkommt.",
        difficulty = 1,
        funFact = "Millie Bobby Brown war erst 12 Jahre alt, als sie Eleven in der ersten Staffel spielte."
    ),

    Question(
        categoryId = 4,
        questionText = "Ueber welche britische Koenigin handelt die Serie 'The Crown'?",
        answerA = "Koenigin Victoria",
        answerB = "Koenigin Elizabeth II.",
        answerC = "Koenigin Mary",
        answerD = "Koenigin Anne",
        correctAnswer = 1,
        explanation = "'The Crown' erzaehlt die Geschichte von Koenigin Elizabeth II. und der britischen Koenigsfamilie seit 1947.",
        difficulty = 1,
        funFact = "Die Serie kostet pro Staffel rund 130 Millionen Dollar und ist eine der teuersten Netflix-Produktionen."
    ),

    // ─── REALITY TV ──────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welches bekannte Reality-TV-Format sucht Musik-Talente?",
        answerA = "Survivor",
        answerB = "American Idol",
        answerC = "Big Brother",
        answerD = "The Bachelor",
        correctAnswer = 1,
        explanation = "American Idol (in Deutschland als DSDS bekannt) ist eines der bekanntesten Casting-Formate fuer Saenger.",
        difficulty = 1,
        funFact = "Die erste Staffel von American Idol gewann Kelly Clarkson im Jahr 2002."
    ),

    Question(
        categoryId = 4,
        questionText = "Bei welchem Reality-Format leben Kandidaten gemeinsam in einem ueberwachten Haus?",
        answerA = "Dschungelcamp",
        answerB = "The Bachelor",
        answerC = "Big Brother",
        answerD = "Bauer sucht Frau",
        correctAnswer = 2,
        explanation = "Bei Big Brother leben die Teilnehmer wochen- oder monatelang in einem Haus unter staendiger Kamerabeobachtung.",
        difficulty = 1,
        funFact = "Das Konzept von Big Brother geht auf George Orwells Roman '1984' zurueck."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist das Ziel bei 'Survivor' (Ins Ungewisse)?",
        answerA = "Als letzter Teilnehmer auf einer Insel ueberleben",
        answerB = "Das beste Gericht kochen",
        answerC = "Den hoechsten Berg besteigen",
        answerD = "Das schoenste Haus bauen",
        correctAnswer = 0,
        explanation = "Bei Survivor muessen die Teilnehmer auf einer Insel ueberleben, Aufgaben bestehen und Mitstreiter aus dem Spiel waehlen.",
        difficulty = 1,
        funFact = null
    ),

    // ─── AWARD SHOWS ─────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welcher Preis ist der bedeutendste Filmpreis in den USA?",
        answerA = "Emmy Award",
        answerB = "Golden Globe",
        answerC = "Oscar (Academy Award)",
        answerD = "Grammy Award",
        correctAnswer = 2,
        explanation = "Der Oscar, offiziell Academy Award, ist der renommierteste Filmpreis der Welt und wird von der Academy of Motion Picture Arts and Sciences verliehen.",
        difficulty = 1,
        funFact = "Die Statuette heisst offiziell 'Academy Award of Merit' — den Spitznamen 'Oscar' bekam sie in den 1930er Jahren."
    ),

    Question(
        categoryId = 4,
        questionText = "Fuer welchen Bereich werden Emmy Awards verliehen?",
        answerA = "Kino-Filme",
        answerB = "Musik",
        answerC = "Fernsehen",
        answerD = "Theater",
        correctAnswer = 2,
        explanation = "Die Emmy Awards sind die wichtigsten Auszeichnungen fuer Fernsehproduktionen in den USA.",
        difficulty = 1,
        funFact = "Der Name 'Emmy' leitet sich vom Wort 'Immy' ab, einem Slangausdruck fuer fruehe TV-Kameras."
    ),

    Question(
        categoryId = 4,
        questionText = "Die Golden Globes werden von welcher Vereinigung verliehen?",
        answerA = "Screen Actors Guild",
        answerB = "Hollywood Foreign Press Association",
        answerC = "Academy of Motion Picture Arts",
        answerD = "British Film Institute",
        correctAnswer = 1,
        explanation = "Die Golden Globes werden von der Hollywood Foreign Press Association (HFPA) vergeben, einem Verband auslaendischer Filmjournalisten.",
        difficulty = 1,
        funFact = "Die Golden Globes zeichnen sowohl Film als auch Fernsehen aus — ein Unterschied zum Oscar."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Film gewann beim Oscar 2020 den Preis fuer den besten Film?",
        answerA = "1917",
        answerB = "Joker",
        answerC = "Parasite",
        answerD = "The Irishman",
        correctAnswer = 2,
        explanation = "'Parasite' von Bong Joon-ho war der erste nicht-englischsprachige Film, der den Oscar fuer den besten Film gewann.",
        difficulty = 1,
        funFact = "'Parasite' gewann 2020 gleich vier Oscars: Bester Film, Beste Regie, Bestes Originaldrehbuch und Bester Internationaler Film."
    ),

    // ─── FILM GENRES ─────────────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Welches Filmgenre spielt typischerweise im Wilden Westen der USA?",
        answerA = "Sci-Fi",
        answerB = "Western",
        answerC = "Kriminalfilm",
        answerD = "Horrorfilm",
        correctAnswer = 1,
        explanation = "Western spielen im Wilden Westen Nordamerikas, meist im 19. Jahrhundert, mit Cowboys, Sheriffs und Banditen.",
        difficulty = 1,
        funFact = "Der erste Western gilt als 'The Great Train Robbery' von 1903."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist ein typisches Element eines Science-Fiction-Films?",
        answerA = "Ritterruestungen und Burgen",
        answerB = "Raumschiffe und Technologie der Zukunft",
        answerC = "Piratenschiffe und Schatzsuche",
        answerD = "Geister und Hexen",
        correctAnswer = 1,
        explanation = "Science-Fiction-Filme handeln typischerweise von Raumschiffen, Robotern, Zeitreisen und zukuenftiger Technologie.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Was steht im Mittelpunkt eines romantischen Films (Romanze)?",
        answerA = "Polizeiarbeit und Verbrechen",
        answerB = "Eine Liebesgeschichte zwischen zwei Personen",
        answerC = "Kampf gegen uebernatuerliche Wesen",
        answerD = "Historische Schlachten",
        correctAnswer = 1,
        explanation = "Romanzen (Liebesfilme) konzentrieren sich auf die emotionale Entwicklung einer Liebesbeziehung als zentrales Thema.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Welches Genre kombiniert Komoedie und Romantik?",
        answerA = "Action-Comedy",
        answerB = "Romantische Komoedie (Rom-Com)",
        answerC = "Thriller",
        answerD = "Dokumentarfilm",
        correctAnswer = 1,
        explanation = "Die romantische Komoedie (Rom-Com) verbindet humorvolle Situationen mit einer Liebesgeschichte.",
        difficulty = 1,
        funFact = "Klassikerinnen des Genres sind Filme wie 'Notting Hill' oder 'Schlaflos in Seattle'."
    ),

    // ─── SILENT FILM ERA & CHARLIE CHAPLIN ───────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "Wer ist der beruehemtste Stummfilm-Komiker der Filmgeschichte?",
        answerA = "Buster Keaton",
        answerB = "Harold Lloyd",
        answerC = "Charlie Chaplin",
        answerD = "Roscoe Arbuckle",
        correctAnswer = 2,
        explanation = "Charlie Chaplin gilt als der bekannteste Stummfilm-Komiker und schuf mit der Figur des Tramps eine Ikone.",
        difficulty = 1,
        funFact = "Chaplin war einer der wenigen Stummfilm-Stars, der auch als Regisseur, Autor und Komponist arbeitete."
    ),

    Question(
        categoryId = 4,
        questionText = "Wie nennt sich Charlie Chaplins beruehemteste Filmfigur?",
        answerA = "Der Vagabund (The Tramp)",
        answerB = "Der Detektiv",
        answerC = "Der Boxer",
        answerD = "Der Millionaer",
        correctAnswer = 0,
        explanation = "Chaplins ikonische Figur 'The Tramp' (deutsch: Der Tramp oder Vagabund) ist erkennbar an dem kleinen Schnurrbart, dem Bowler-Hut und dem Spazierstock.",
        difficulty = 1,
        funFact = "Die Tramp-Figur erschien erstmals 1914 im Kurzfilm 'Kid Auto Races at Venice'."
    ),

    Question(
        categoryId = 4,
        questionText = "Was ist das Besondere an Stummfilmen?",
        answerA = "Sie haben keine Farbe",
        answerB = "Sie haben keinen gesprochenen Ton",
        answerC = "Sie dauern nur wenige Minuten",
        answerD = "Sie zeigen echte Ereignisse",
        correctAnswer = 1,
        explanation = "Stummfilme haben keinen synchronisierten Ton oder Dialog — Gefuehle und Handlung werden allein ueber Mimik und Gestik vermittelt.",
        difficulty = 1,
        funFact = "Die Stummfilm-Aera endete offiziell 1927 mit dem ersten Tonfilm 'The Jazz Singer'."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Jahrzehnt war die Bluetezeit des Stummfilms?",
        answerA = "1890er bis 1920er Jahre",
        answerB = "1940er bis 1950er Jahre",
        answerC = "1960er bis 1970er Jahre",
        answerD = "1980er bis 1990er Jahre",
        correctAnswer = 0,
        explanation = "Die Stummfilm-Aera reichte von den Anfaengen des Films in den 1890ern bis zur Einfuehrung des Tonfilms in den spaeten 1920ern.",
        difficulty = 1,
        funFact = null
    ),

    // ─── FAMOUS MOVIE QUOTES ─────────────────────────────────────────────────

    Question(
        categoryId = 4,
        questionText = "In welchem Film sagt jemand: 'Ich bin dein Vater!'?",
        answerA = "Der Herr der Ringe",
        answerB = "Star Wars: Das Imperium schlaegt zurueck",
        answerC = "Jurassic Park",
        answerD = "Matrix",
        correctAnswer = 1,
        explanation = "Darth Vader sagt diesen beruehemten Satz zu Luke Skywalker in 'Star Wars: Episode V — Das Imperium schlaegt zurueck' (1980).",
        difficulty = 1,
        funFact = "Mark Hamill, der Luke spielt, wusste beim Drehen nicht, dass Vader sein Vater ist — er erfuhr es erst kurz vorher."
    ),

    Question(
        categoryId = 4,
        questionText = "Aus welchem Film stammt das Zitat: 'Es gibt kein Zuhause wie zu Hause'?",
        answerA = "Alice im Wunderland",
        answerB = "Der Zauberer von Oz",
        answerC = "Pinocchio",
        answerD = "Bambi",
        correctAnswer = 1,
        explanation = "Dorothy sagt in 'Der Zauberer von Oz' (1939) den beruehemten Satz 'There's no place like home' waehrend sie ihre roten Schuhe zusammenschlaegt.",
        difficulty = 1,
        funFact = "Die roten Rubinpantoffeln aus 'Der Zauberer von Oz' sind eines der bekanntesten Film-Requisiten der Geschichte."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Film enthaelt das Zitat: 'Hasta la vista, Baby'?",
        answerA = "Terminator 2: Tag der Abrechnung",
        answerB = "RoboCop",
        answerC = "Predator",
        answerD = "Die Hard",
        correctAnswer = 0,
        explanation = "Arnold Schwarzenegger sagt diesen Satz als T-800 in 'Terminator 2: Tag der Abrechnung' (1991), bevor er einen flüssigen Metallroboter einfriert und zerstört.",
        difficulty = 1,
        funFact = "'Hasta la vista' ist Spanisch und bedeutet 'Bis wir uns sehen' oder 'Auf Wiedersehen'."
    ),

    Question(
        categoryId = 4,
        questionText = "Aus welchem Film stammt das Zitat: 'Ich sehe tote Menschen'?",
        answerA = "Poltergeist",
        answerB = "The Shining",
        answerC = "The Sixth Sense",
        answerD = "A Nightmare on Elm Street",
        correctAnswer = 2,
        explanation = "In 'The Sixth Sense' (1999) sagt der junge Cole (gespielt von Haley Joel Osment): 'I see dead people.'",
        difficulty = 1,
        funFact = "Die Wendung am Ende von 'The Sixth Sense' gilt als eine der groessten Ueberraschungen der Filmgeschichte."
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Film sagt die Hauptfigur: 'Houston, wir haben ein Problem'?",
        answerA = "Gravity",
        answerB = "The Martian",
        answerC = "Apollo 13",
        answerD = "Interstellar",
        correctAnswer = 2,
        explanation = "In 'Apollo 13' (1995) spricht Tom Hanks als Jim Lovell den beruehemten Satz basierend auf dem echten Funkspruch der Mondmission.",
        difficulty = 1,
        funFact = "Der echte Funkspruch lautete 'Houston, we've had a problem' — leicht anders als die Filmversion."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Film enthaelt das Zitat: 'Zeig mir das Geld!'?",
        answerA = "Wall Street",
        answerB = "Jerry Maguire",
        answerC = "The Wolf of Wall Street",
        answerD = "Trading Places",
        correctAnswer = 1,
        explanation = "In 'Jerry Maguire' (1996) schreit Cuba Gooding Jr. den Satz 'Show me the money!' ins Telefon und bringt Sportmanager Jerry Maguire dazu, ihn zu wiederholen.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "Aus welchem Film stammt: 'Ich werde ihm ein Angebot machen, das er nicht ablehnen kann'?",
        answerA = "Scarface",
        answerB = "Goodfellas",
        answerC = "Der Pate",
        answerD = "Casino",
        correctAnswer = 2,
        explanation = "Don Vito Corleone (gespielt von Marlon Brando) sagt diesen ikonischen Satz in 'Der Pate' (The Godfather, 1972).",
        difficulty = 1,
        funFact = "'Der Pate' gilt als einer der besten Filme aller Zeiten und gewann 1973 drei Oscars."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Film enthaelt das Zitat: 'E.T. nach Hause telefonieren'?",
        answerA = "Close Encounters of the Third Kind",
        answerB = "E.T. — Der Ausserirdische",
        answerC = "Men in Black",
        answerD = "Arrival",
        correctAnswer = 1,
        explanation = "Im Spielberg-Film 'E.T. — Der Ausserirdische' (1982) sagt der kleine Ausserirdische 'E.T. phone home' um seine Sehnsucht nach der Heimat auszudruecken.",
        difficulty = 1,
        funFact = "'E.T.' war bei seinem Kinostart 1982 der erfolgreichste Film aller Zeiten."
    ),

    Question(
        categoryId = 4,
        questionText = "Welcher Charakter sagt: 'You talkin' to me?' in einem beruehemten Monolog?",
        answerA = "Tony Montana in Scarface",
        answerB = "Travis Bickle in Taxi Driver",
        answerC = "Vito Corleone in Der Pate",
        answerD = "Frank Serpico in Serpico",
        correctAnswer = 1,
        explanation = "Robert De Niro sagt den Satz 'You talkin' to me?' als Travis Bickle in 'Taxi Driver' (1976) vor einem Spiegel.",
        difficulty = 1,
        funFact = "Der Monolog war im Drehbuch nicht vorgesehen — Robert De Niro improvisiete ihn vor dem Spiegel."
    ),

    Question(
        categoryId = 4,
        questionText = "Welches Zitat kommt aus dem Film 'Scarface' (1983)?",
        answerA = "'Say hello to my little friend!'",
        answerB = "'I'll be back!'",
        answerC = "'May the Force be with you!'",
        answerD = "'Life is like a box of chocolates.'",
        correctAnswer = 0,
        explanation = "Al Pacino als Tony Montana sagt in 'Scarface' (1983) den beruehemten Satz 'Say hello to my little friend!' als er eine grosse Waffe zieht.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 4,
        questionText = "In welchem Film sagt Terminator: 'I'll be back'?",
        answerA = "Terminator 2",
        answerB = "Terminator 3",
        answerC = "The Terminator (1984)",
        answerD = "Terminator: Dark Fate",
        correctAnswer = 2,
        explanation = "Arnold Schwarzenegger sagt 'I'll be back' zuerst im Original-Terminator von 1984, als er ein Polizeirevier verlaesst.",
        difficulty = 1,
        funFact = "Schwarzenegger wollte urspruenglich 'I will be back' sagen — der Regisseur bestand aber auf der kuerzeren Version."
    )

)
