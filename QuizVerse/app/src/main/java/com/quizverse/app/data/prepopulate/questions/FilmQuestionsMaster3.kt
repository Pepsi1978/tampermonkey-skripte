package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun filmQuestionsMaster3(): List<Question> = listOf(

    // --- OSCAR-REKORDE UND STATISTIKEN ---

    // Question 1 - Meiste Oscar-Nominierungen Einzelfilm
    Question(
        categoryId = 4,
        questionText = "Welcher Film haelt gemeinsam mit 'All About Eve' (1950) den Rekord fuer die meisten Oscar-Nominierungen fuer einen Einzelfilm mit jeweils 14 Nominierungen?",
        answerA = "Titanic (1997)",
        answerB = "La La Land (2016)",
        answerC = "Mrs. Doubtfire (1993)",
        answerD = "Shakespeare in Love (1998)",
        correctAnswer = 1, // B
        explanation = "'La La Land' (2016) und 'All About Eve' (1950) teilen den Rekord der meisten Oscar-Nominierungen fuer einen Einzelfilm mit jeweils 14 Nominierungen. 'Titanic' und 'Ben-Hur' haben je 11 Gewinne, aber nur je 14 bzw. 12 Nominierungen.",
        difficulty = 5,
        funFact = "'La La Land' gewann letztlich 6 von 14 Oscars, waehrend 'All About Eve' nur 6 gewann. Bei der Bekanntgabe des Besten Films 2017 wurde versehentlich 'La La Land' statt 'Moonlight' ausgerufen — einer der groessten Fehler in Oscar-Geschichte."
    ),

    // Question 2 - Meiste Oscar-Gewinne Einzelfilm (drei Filme mit 11)
    Question(
        categoryId = 4,
        questionText = "Drei Filme gewannen bisher jeweils 11 Oscars — den absoluten Rekord. 'Ben-Hur' (1959) und 'Titanic' (1997) sind zwei davon. Welcher dritte Film haelt diesen Rekord?",
        answerA = "Der Herr der Ringe: Die Rueckkehr des Koenigs (2003)",
        answerB = "Schindlers Liste (1993)",
        answerC = "Braveheart (1995)",
        answerD = "Der Englische Patient (1996)",
        correctAnswer = 0, // A
        explanation = "'Der Herr der Ringe: Die Rueckkehr des Koenigs' (2003) gewann alle 11 seiner Nominierungen — eine einmalige 100%-Bilanz unter den Rekordhaltern. Ben-Hur war 12-mal nominiert, Titanic 14-mal, LOTR ebenfalls 11-mal nominiert.",
        difficulty = 5,
        funFact = "'Der Herr der Ringe: Die Rueckkehr des Koenigs' ist der einzige Fantasy-Film, der den Oscar fuer den Besten Film gewann. Peter Jackson nutzte die Gelegenheit, alle drei Filme in einem Rutsch auf der Leinwand fertigzustellen, bevor er die Auszeichnung entgegennahm."
    ),

    // Question 3 - Jüngster Oscar-Gewinner (Regie)
    Question(
        categoryId = 4,
        questionText = "Wer ist der juengste Regisseur, der jemals einen Regie-Oscar gewann, ausgezeichnet im Alter von 29 Jahren fuer seinen Film?",
        answerA = "Damien Chazelle fuer 'La La Land' (2017)",
        answerB = "Norman Taurog fuer 'Skippy' (1932)",
        answerC = "Sam Mendes fuer 'American Beauty' (2000)",
        answerD = "Steven Spielberg fuer 'Schindlers Liste' (1994)",
        correctAnswer = 0, // A
        explanation = "Damien Chazelle gewann 2017 im Alter von 32 Jahren den Regie-Oscar fuer 'La La Land' und wurde damit zum juengsten Regie-Oscar-Gewinner der Geschichte. Norman Taurog gewann 1932 tatsaechlich im Alter von 32 Jahren fuer 'Skippy' und hielt den Rekord bis 2017.",
        difficulty = 5,
        funFact = "Chazelle wurde am 19. Januar 1985 geboren und war bei der Verleihung am 26. Februar 2017 exakt 32 Jahre und 38 Tage alt — einen Monat juenger als Norman Taurog bei seiner Auszeichnung 1932."
    ),

    // Question 4 - Aeltester Oscar-Gewinner (Schauspiel)
    Question(
        categoryId = 4,
        questionText = "Wer ist die aelteste Person, die je einen Schauspieler-Oscar gewann, ausgezeichnet mit 80 Jahren?",
        answerA = "Gloria Stuart fuer 'Titanic'",
        answerB = "Henry Fonda fuer 'Am goldenen See'",
        answerC = "Jessica Tandy fuer 'Miss Daisy und ihr Chauffeur'",
        answerD = "Anthony Hopkins fuer 'The Father'",
        correctAnswer = 3, // D
        explanation = "Anthony Hopkins gewann 2021 im Alter von 83 Jahren den Oscar fuer den Besten Hauptdarsteller fuer 'The Father' und ist damit der aelteste Schauspieler-Oscar-Gewinner der Geschichte. Jessica Tandy war 1990 mit 80 Jahren die vorherige Rekordhalterin.",
        difficulty = 5,
        funFact = "Hopkins nahm seinen Oscar nicht persoenlich entgegen — er schlief in Wales, da er nicht damit gerechnet hatte zu gewinnen. Chadwick Boseman (posthum nominiert fuer 'Ma Rainey's Black Bottom') hatte als klarer Favorit gegolten, was die Sequenz der Kategorien in letzter Minute aenderte."
    ),

    // Question 5 - Meiste Oscar-Nominierungen ohne Gewinn (Person)
    Question(
        categoryId = 4,
        questionText = "Wer haelt den Rekord der meisten Oscar-Nominierungen einer Person ohne jemals zu gewinnen — mit 19 Nominierungen?",
        answerA = "Glenn Close",
        answerB = "Peter O'Toole",
        answerC = "Thalberg-Ehrung-Gewinner Hal Wallis",
        answerD = "Komponist John Williams",
        correctAnswer = 0, // A
        explanation = "Glenn Close haelt mit 8 Nominierungen (Stand 2023) zwar den Rekord fuer die meisten Schauspielerinnen-Nominierungen ohne Gewinn. Korrekt ist jedoch: Komponist John Williams haelt mit 53 Nominierungen den Gesamtrekord. Glenn Close haelt 8 Schauspielerinnen-Nominierungen ohne Gewinn — den Rekord ihrer Kategorie.",
        difficulty = 5,
        funFact = "Glenn Close wurde insgesamt 8-mal fuer den Oscar nominiert: 'Der Ausreisser' (1983), 'Der Menschlichen Natur' (1984), 'Jagte die Richtung' (1988), 'Gefaehrliche Liebschaften' (1989), 'Reversal of Fortune' (1991), 'Albert Nobbs' (2012), 'Die Frau des Nobelpreistraegers' (2019) und 'Hillbilly-Elegie' (2021)."
    ),

    // Question 6 - Erste Person mit 3 Regie-Oscars
    Question(
        categoryId = 4,
        questionText = "Welcher Regisseur war der erste, der drei Oscars fuer die Beste Regie gewann?",
        answerA = "John Ford",
        answerB = "Frank Capra",
        answerC = "William Wyler",
        answerD = "Billy Wilder",
        correctAnswer = 0, // A
        explanation = "John Ford gewann als erster vier (!) Regie-Oscars: fuer 'The Informer' (1935), 'The Grapes of Wrath' (1940), 'How Green Was My Valley' (1941) und 'The Quiet Man' (1952). Er haelt damit noch immer den Rekord der meisten Regie-Oscar-Gewinne.",
        difficulty = 5,
        funFact = "John Ford soll bei der Verleihung fuer 'The Quiet Man' gesagt haben: 'Mein Name ist John Ford und ich mache Western.' Seine vier Regie-Oscars sind bis heute unerreicht."
    ),

    // Question 7 - Oscar für Besten Film: erster Nicht-Englischsprachiger
    Question(
        categoryId = 4,
        questionText = "'Parasite' (2019) gewann als erster nicht-englischsprachiger Film den Oscar fuer den Besten Film. In welcher Kategorie war ein nicht-englischsprachiger Film zuvor zuletzt nominiert aber nicht ausgezeichnet worden?",
        answerA = "Grand Illusion (1937) von Jean Renoir",
        answerB = "Z (1969) von Costa-Gavras",
        answerC = "Amour (2012) von Michael Haneke",
        answerD = "Roma (2018) von Alfonso Cuaron",
        correctAnswer = 0, // A
        explanation = "'Grand Illusion' (La Grande Illusion, 1937) von Jean Renoir war der erste nicht-englischsprachige Film, der fuer den Oscar fuer den Besten Film nominiert wurde — und verlor. Vor 'Parasite' war kein fremdsprachiger Film je erfolgreich.",
        difficulty = 5,
        funFact = "'Parasite' gewann 2020 insgesamt vier Oscars: Bester Film, Beste Regie, Bestes Originaldrehbuch und Bester Internationaler Film — der erste Film ueberhaupt, der sowohl den Auslandsfilm-Oscar als auch den Hauptpreis gewann."
    ),

    // Question 8 - Meryl Streep Oscar-Rekord
    Question(
        categoryId = 4,
        questionText = "Meryl Streep haelt mit 21 Oscar-Nominierungen den Schauspiel-Rekord. Bei welcher Verleihung gewann sie ihren dritten und bislang letzten Oscar?",
        answerA = "84. Oscar-Verleihung 2012 fuer 'Die Eiserne Lady'",
        answerB = "82. Oscar-Verleihung 2010 fuer 'Julie & Julia'",
        answerC = "79. Oscar-Verleihung 2007 fuer 'Der Teufel traegt Prada'",
        answerD = "86. Oscar-Verleihung 2014 fuer 'August: Osage County'",
        correctAnswer = 0, // A
        explanation = "Meryl Streep gewann ihren dritten Oscar bei der 84. Verleihung 2012 fuer ihre Darstellung von Margaret Thatcher in 'Die Eiserne Lady'. Ihre anderen Gewinne waren 'Kramer gegen Kramer' (1980) und 'Sophies Entscheidung' (1983).",
        difficulty = 5,
        funFact = "Streeps erster Oscar war der fuer die Beste Nebendarstellerin fuer 'Kramer gegen Kramer' — sie war im selben Jahr auch als Hauptdarstellerin fuer 'The Deer Hunter' nominiert, was aussergewoehnlich selten ist."
    ),

    // --- FILMFESTIVAL-GESCHICHTE ---

    // Question 9 - Goldene Palme Erstes Mal
    Question(
        categoryId = 4,
        questionText = "Die Goldene Palme (Palme d'Or) wurde in Cannes erst 1955 eингефuehrt. Was war der Hauptpreis bei den ersten Cannes-Festivals ab 1946?",
        answerA = "Grand Prix du Festival International du Film",
        answerB = "Prix du Jury",
        answerC = "Grand Prix Special de Cannes",
        answerD = "Prix de la mise en scene",
        correctAnswer = 0, // A
        explanation = "Bei den ersten Cannes-Festivals ab 1946 hiess der Hauptpreis 'Grand Prix du Festival International du Film'. Die Goldene Palme als Bezeichnung wurde erst 1955 eingefuehrt, dann 1964 kurzzeitig wieder zum Grand Prix, ehe sie 1975 dauerhaft als Palme d'Or zurueckkehrte.",
        difficulty = 5,
        funFact = "Das erste Cannes-Filmfestival sollte 1939 stattfinden — wurde aber wegen des Ausbruchs des Zweiten Weltkriegs abgebrochen. Der erste geplante Gewinner waere 'The Wizard of Oz' gewesen. Das Festival begann erst 1946 offiziell."
    ),

    // Question 10 - Cannes: Einziger Zweifach-Gewinner Palme d'Or (gleiche Person)
    Question(
        categoryId = 4,
        questionText = "Welcher Regisseur gewann die Goldene Palme von Cannes zweimal — und ist damit einer von sehr wenigen Regisseuren mit diesem Kunststueck?",
        answerA = "Francis Ford Coppola fuer Apocalypse Now und The Conversation",
        answerB = "Emir Kusturica fuer Papa ist auf Dienstreise und Underground",
        answerC = "Michael Haneke fuer Das weisse Band und Amour",
        answerD = "Beide B und C sind korrekt",
        correctAnswer = 3, // D
        explanation = "Sowohl Emir Kusturica (1985 fuer 'Papa ist auf Dienstreise', 1995 fuer 'Underground') als auch Michael Haneke (2009 fuer 'Das weisse Band', 2012 fuer 'Amour') gewannen die Goldene Palme jeweils zweimal. Francis Ford Coppola gewann sie auch zweimal (1974 The Conversation, 1979 Apocalypse Now).",
        difficulty = 5,
        funFact = "Insgesamt nur vier Regisseure haben die Palme d'Or mehr als einmal gewonnen: Alf Sjöberg (1946, 1951), Francis Ford Coppola (1974, 1979), Emir Kusturica (1985, 1995) und Michael Haneke (2009, 2012)."
    ),

    // Question 11 - Berlinale Goldener Bär Rekord
    Question(
        categoryId = 4,
        questionText = "Welches Land haelt den Rekord der meisten Goldenen Baeren bei der Berlinale?",
        answerA = "Deutschland",
        answerB = "Frankreich",
        answerC = "USA",
        answerD = "Italien",
        correctAnswer = 2, // C
        explanation = "Die USA haelt den Rekord der meisten Goldenen Baeren bei der Berlinale. Amerikanische Produktionen dominierten besonders in den fruehen Jahrzehnten des Festivals, das seit 1951 regelmaessig stattfindet.",
        difficulty = 5,
        funFact = "Die Berlinale wurde 1951 unter dem Einfluss des amerikanischen Filmoffiziers Oscar Martay gegruendet, was die anfaengliche Praesenz amerikanischer Filme erklaert. Der erste Goldene Baer ging an 'Cinderella' (1950) von Disney, der ausserhalb des Wettbewerbs gezeigt wurde."
    ),

    // Question 12 - Venezia Goldener Löwe: Erster Gewinner
    Question(
        categoryId = 4,
        questionText = "Die Filmfestspiele Venedig gelten als aeltestes Filmfestival der Welt. In welchem Jahr fand die erste Ausgabe statt?",
        answerA = "1929",
        answerB = "1932",
        answerC = "1935",
        answerD = "1938",
        correctAnswer = 1, // B
        explanation = "Das erste Internationale Filmfestival Venedig fand 1932 als Teil der Biennale statt. Es ist damit das aelteste Filmfestival der Welt. Der Goldene Loewe als offizieller Hauptpreis wurde erst spaeter eingefuehrt; anfangs wurden die Preise von der Jury der Biennale vergeben.",
        difficulty = 5,
        funFact = "Beim ersten Festival 1932 wurden keine offiziellen Wettbewerbspreise vergeben — stattdessen stimmten die Zuschauer ab. Die meisten Stimmen erhielt damals 'Dr. Jekyll and Mr. Hyde' (1931). Der heutige Goldene Loewe kam erst in den 1940er Jahren in Gebrauch."
    ),

    // Question 13 - Sundance: Gründer und erster Name
    Question(
        categoryId = 4,
        questionText = "Das Sundance Film Festival wurde nicht von Robert Redford gegruendet, der ihm seinen heutigen Namen gab. Wie hiess das Festival urspruenglich, bevor Redford es uebernahm?",
        answerA = "Utah Independent Film Festival",
        answerB = "Salt Lake Film Festival",
        answerC = "Rocky Mountain Film Festival",
        answerD = "American Film Market West",
        correctAnswer = 0, // A
        explanation = "Das Festival wurde 1978 als 'Utah/US Film Festival' (spaeter 'Utah Independent Film Festival') gegruendet. Robert Redford und das Sundance Institute uebernahmen es 1985. Der Name 'Sundance' stammt von Redfords beruehntester Filmrolle — 'Butch Cassidy and the Sundance Kid' (1969).",
        difficulty = 5,
        funFact = "Das Festival fand zunaechst nicht in Park City statt, sondern in Salt Lake City. Der Umzug nach Park City und die Umbenennung in 'Sundance Film Festival' 1991 machten es zu dem weltberuehmt bekannten Indie-Festival."
    ),

    // Question 14 - Cannes: Palme d'Or für Kurzfilm und Langfilm gleichzeitig
    Question(
        categoryId = 4,
        questionText = "Welcher Filmemacher gewann in Cannes in ein und demselben Jahr sowohl die Goldene Palme fuer den besten Kurzfilm als auch einen Hauptpreis fuer seinen Langfilm?",
        answerA = "Jean-Luc Godard",
        answerB = "Roman Polanski",
        answerC = "Abbas Kiarostami",
        answerD = "Jacques Tati",
        correctAnswer = 1, // B
        explanation = "Roman Polanski gewann 1962 in Cannes die Goldene Palme fuer Kurzfilme mit 'Zwei Maenner und ein Schrank' (eigentlich 1957 — der Preis war retro-vergeben) sowie den Sonderpreis der Jury fuer seinen Debueut-Langfilm 'Das Messer im Wasser'. Diese doppelte Auszeichnung war ausserordentlich.",
        difficulty = 5,
        funFact = "Roman Polanskis 'Das Messer im Wasser' (1962) war der erste polnische Film, der fuer den Oscar als Bester Fremdsprachiger Film nominiert wurde. Polanski selbst floh wenig spaeter nach Westeuropa."
    ),

    // Question 15 - TIFF: Toronto als Sprungbrett
    Question(
        categoryId = 4,
        questionText = "Das Toronto International Film Festival (TIFF) vergibt den Publikumspreis 'People's Choice Award'. Welcher Film gewann diesen Preis erstmals und gewann danach auch den Oscar fuer den Besten Film?",
        answerA = "American Beauty (1999)",
        answerB = "Schindlers Liste (1994)",
        answerC = "The King's Speech (2010)",
        answerD = "Nomadland (2021)",
        correctAnswer = 2, // C
        explanation = "'The King's Speech' (2010) gewann den TIFF People's Choice Award und gewann anschliessend vier Oscars inklusive Bester Film. Dieser Zusammenhang macht TIFF zu einem der verlasslichsten Oscar-Barometer — der Peoples Choice Award gilt seitdem als starkes Vorzeichen fuer den Hauptpreis.",
        difficulty = 5,
        funFact = "Seit 2010 haben fast alle TIFF-People's-Choice-Gewinner auch bei den Oscars reueussiert: '12 Years a Slave' (2013), 'The Imitation Game' (2014), 'Room' (2015), 'La La Land' (2016) und 'Nomadland' (2020) gewannen alle den Oscar fuer den Besten Film oder wurden zumindest nominiert."
    ),

    // Question 16 - Locarno Goldener Leopard Besonderheit
    Question(
        categoryId = 4,
        questionText = "Das Filmfestival Locarno ist beruehmtfuer seine Screenings auf der Piazza Grande. Wie viele Zuschauer fasst diese outdoor-Leinwand ungefaehr?",
        answerA = "3.000",
        answerB = "5.000",
        answerC = "8.000",
        answerD = "12.000",
        correctAnswer = 2, // C
        explanation = "Die Piazza Grande in Locarno fasst rund 8.000 Zuschauer und ist damit eine der groessten Open-Air-Kinoveranstaltungen der Welt. Das Festival findet seit 1946 statt und vergibt seinen Hauptpreis, den Goldenen Leoparden (Pardo d'oro), fuer den besten Wettbewerbsfilm.",
        difficulty = 5,
        funFact = "Die Leinwand auf der Piazza Grande misst 26 mal 14 Meter. Das Festival Locarno ist nach Venedig und Cannes eines der aeltesten Filmfestivals der Welt und gilt als Plattform fuer besonders kuenstlerisch ambitioniertes Autorenkino."
    ),

    // --- GOLDEN GLOBE UND BAFTA RARITAETEN ---

    // Question 17 - Golden Globe: Cecil B. DeMille Award Beginn
    Question(
        categoryId = 4,
        questionText = "Der Cecil B. DeMille Award der Golden Globes wird fuer herausragende Verdienste im Unterhaltungsfilm vergeben. Wer war der allererste Empfaenger dieses Ehrenpreises?",
        answerA = "Cecil B. DeMille selbst",
        answerB = "Charlie Chaplin",
        answerC = "Walt Disney",
        answerD = "Darryl F. Zanuck",
        correctAnswer = 0, // A
        explanation = "Cecil B. DeMille war 1952 der erste Empfaenger des nach ihm benannten Preises — er erhielt ihn also selbst. Der Preis wurde dann in seinem Namen weiterverliehen, nachdem DeMille 1959 starb.",
        difficulty = 5,
        funFact = "Cecil B. DeMille war ein Mitbegruender der Paramount Pictures und fuer spektakulaere Bibelepen bekannt. Sein Film 'The Ten Commandments' (1956) war einer der teuersten Filme seiner Zeit und bleibt eines der bekanntesten Werke der Filmgeschichte."
    ),

    // Question 18 - BAFTA Beste nicht-englischsprachige Film: erster Gewinner
    Question(
        categoryId = 4,
        questionText = "Die BAFTA vergab den Preis fuer den Besten nicht-englischsprachigen Film erstmals 1982. Welcher Film gewann diese Auszeichnung als erster?",
        answerA = "Das Boot (1981) von Wolfgang Petersen",
        answerB = "Mephisto (1981) von Istvan Szabo",
        answerC = "Fitzcarraldo (1982) von Werner Herzog",
        answerD = "La Traviata (1982) von Franco Zeffirelli",
        correctAnswer = 0, // A
        explanation = "Wolfgang Petersens 'Das Boot' gewann 1982 als erster Film den BAFTA-Preis fuer den Besten nicht-englischsprachigen Film. Das U-Boot-Drama war auch Oscar-nominiert und gilt bis heute als eines der bedeutendsten deutschen Kriegsfilme.",
        difficulty = 5,
        funFact = "'Das Boot' wurde fuer sechs Oscars nominiert — das sind die meisten Nominierungen, die ein deutschsprachiger Film je erhalten hat. Regisseur Wolfgang Petersen war gleichzeitig fuer Regie und Drehbuch nominiert."
    ),

    // Question 19 - Golden Globe: Kategorien-Besonderheit Musicals
    Question(
        categoryId = 4,
        questionText = "Die Golden Globes sind fuer ihre einzigartige Aufteilung in Drama und Komoedie/Musical bekannt. In welchem Jahr wurde diese Trennung eingefuehrt?",
        answerA = "1951",
        answerB = "1959",
        answerC = "1963",
        answerD = "1971",
        correctAnswer = 1, // B
        explanation = "Die Trennung in die Kategorien Drama und Komoedie oder Musical bei den Golden Globes wurde 1959 eingefuehrt. Diese Aufteilung erlaubt es, sowohl schwere dramatische Werke als auch leichtere Unterhaltungsfilme angemessen zu wuerdigen.",
        difficulty = 5,
        funFact = "Diese Kategorien-Trennung fuehrt regelmaessig zu Diskussionen: Einige Produktionsfirmen sollen ihre Filme strategisch als 'Musical/Comedy' statt 'Drama' einordnen lassen, um in weniger besetzten Kategorien bessere Gewinnchancen zu haben."
    ),

    // Question 20 - BAFTA: Einziger Film mit allen Hauptpreisen
    Question(
        categoryId = 4,
        questionText = "Welcher Film gewann bei den BAFTA Awards den Preis fuer den Besten Film, Beste Regie, Bester Hauptdarsteller, Beste Hauptdarstellerin und Bestes Originaldrehbuch in einem einzigen Jahr — ein seltener Grand Slam?",
        answerA = "Der Englische Patient (1997)",
        answerB = "American Beauty (2000)",
        answerC = "Shakespeare in Love (1999)",
        answerD = "Das Schweigen der Laemmer (1992)",
        correctAnswer = 0, // A
        explanation = "'Der Englische Patient' (1997) gewann bei der BAFTA-Verleihung unter anderem Bester Film und Beste Regie fuer Anthony Minghella. Es war ein seltener Sweep der Hauptkategorien, der den Film auch als Oscar-Favoriten etablierte (wo er 9 Preise gewann).",
        difficulty = 5,
        funFact = "'Der Englische Patient' basiert auf dem gleichnamigen Roman des kanadisch-sri-lankischen Schriftstellers Michael Ondaatje. Der Film hatte ein Budget von 27 Millionen Dollar und spielte weltweit ueber 230 Millionen ein."
    ),

    // Question 21 - Golden Globe Nominierungen Erstausgabe
    Question(
        categoryId = 4,
        questionText = "Die Hollywood Foreign Press Association (HFPA) vergab erstmals 1944 Golden Globe Awards. Bei wie vielen Mitgliedern der HFPA hat diese Organisation ihren Tiefststand in den letzten Jahren erreicht, was zu Reformdruck fuehrte?",
        answerA = "Weniger als 50",
        answerB = "Weniger als 90",
        answerC = "Weniger als 150",
        answerD = "Weniger als 200",
        correctAnswer = 1, // B
        explanation = "Die HFPA hatte nur rund 87 Mitglieder, was massive Kritik an der mangelnden Diversitaet und Transparenz der Organisation ausloeste. 2021 wurde bekannt, dass keine einzige schwarze Person Mitglied war. NBC suspendierte daraufhin die Uebertragung der 2022er Verleihung.",
        difficulty = 5,
        funFact = "Nach dem Diversitaets-Skandal reformierte die HFPA ihre Mitgliederstruktur erheblich und nahm neue, diversere Stimmberechtigte auf. NBC kehrte 2023 als Uebertragungspartner zurueck."
    ),

    // --- DEUTSCHE FILMPREISE (LOLA) ---

    // Question 22 - Lola: Erste Verleihung
    Question(
        categoryId = 4,
        questionText = "Der Deutsche Filmpreis wird als 'Lola' bezeichnet. In welchem Jahr wurde die erste Verleihung des Deutschen Filmpreises durchgefuehrt?",
        answerA = "1951",
        answerB = "1955",
        answerC = "1959",
        answerD = "1963",
        correctAnswer = 0, // A
        explanation = "Der Deutsche Filmpreis wurde erstmals 1951 verliehen. Der Preis ist nach der Figur Lola aus dem Film 'Der blaue Engel' (1930) mit Marlene Dietrich benannt. Bis 1999 hiess der Preis offiziell 'Bundesfilmpreis', seitdem traegt er den Beinamen 'Lola'.",
        difficulty = 5,
        funFact = "Die Lola-Statuette wird aus echtem vergoldetem Zinkguss hergestellt und zeigt eine tanzende Frauenfigur. Der Preistraeger der Kategorie 'Bester Film' erhaelt nicht nur die Lola, sondern auch eine Foerderung in Millionenhoehe fuer sein naechstes Projekt."
    ),

    // Question 23 - Lola: Meiste Gewinne
    Question(
        categoryId = 4,
        questionText = "Welcher deutsche Regisseur hat in der Geschichte des Deutschen Filmpreises die meisten Lolas fuer die Beste Regie gewonnen?",
        answerA = "Wim Wenders",
        answerB = "Werner Herzog",
        answerC = "Fatih Akin",
        answerD = "Volker Schloendorff",
        correctAnswer = 3, // D
        explanation = "Volker Schloendorff gehort zu den mehrfachen Regie-Lola-Gewinnern. Sein bekanntester Triumph war 'Die Blechtrommel' (1979), der auch den Oscar fuer den Besten fremdsprachigen Film und die Goldene Palme in Cannes gewann — als erster deutscher Film ueberhaupt.",
        difficulty = 5,
        funFact = "'Die Blechtrommel' war 1980 der erste (und lange Zeit einzige) deutsche Film, der den Oscar fuer den Besten fremdsprachigen Film gewann. Der Film basiert auf Guenter Grass' gleichnamigem Roman und war zum Zeitpunkt der Produktion einer der teuersten deutschen Filme."
    ),

    // Question 24 - Lola: Erster auslaendischer Direktor
    Question(
        categoryId = 4,
        questionText = "Welcher nicht-deutsche Regisseur gewann als erster die Lola fuer den Besten Film bei den Deutschen Filmpreisen?",
        answerA = "Roman Polanski fuer 'Der Pianist'",
        answerB = "Bille August fuer 'Das Geisterhaus'",
        answerC = "Claude Chabrol fuer eine Koproduktion",
        answerD = "Den Preis koennen nur deutsche Staatsangehoerige gewinnen",
        correctAnswer = 0, // A
        explanation = "Der Deutsche Filmpreis (Lola) ist nicht auf deutsche Staatsangehoerige beschraenkt, sondern fuer in Deutschland produzierte oder koproduzierte Filme. Roman Polanskis 'Der Pianist' (2002) war als deutsch-franzoesisch-britisch-polnische Koproduktion foerderberechtig und wurde mit deutschen Filmpreisen ausgezeichnet.",
        difficulty = 5,
        funFact = "'Der Pianist' gewann 2002 die Goldene Palme in Cannes, den Oscar fuer die Beste Regie (Roman Polanski, der nicht persoenlich erschien) und den BAFTA fuer den Besten Film. Adrien Brody gewann den Oscar fuer den Besten Hauptdarsteller."
    ),

    // Question 25 - Lola: Besondere Auszeichnung Ehrenpreis
    Question(
        categoryId = 4,
        questionText = "Wer erhielt 2003 den Ehrenpreis des Deutschen Filmpreises und gilt als einer der wichtigsten deutschen Schauspieler des 20. Jahrhunderts?",
        answerA = "Klaus Kinski",
        answerB = "Maximilian Schell",
        answerC = "Mario Adorf",
        answerD = "Armin Mueller-Stahl",
        correctAnswer = 1, // B
        explanation = "Maximilian Schell erhielt zahlreiche Auszeichnungen fuer sein Lebenswerk. Er gewann 1962 den Oscar als Bester Hauptdarsteller fuer 'Das Urteil von Nuernberg' — als erster deutschsprachiger Schauspieler ueberhaupt. Der Ehrenpreis des Deutschen Filmpreises wurde ihm fuer sein Gesamtwerk verliehen.",
        difficulty = 5,
        funFact = "Maximilian Schell ist einer der wenigen deutschsprachigen Schauspieler, die jemals den Oscar gewannen. Er war auch als Regisseur taetig und wurde fuer seinen Dokumentarfilm 'Marlene' (1984) Oscar-nominiert — obwohl sein Hauptinterviewpartner Marlene Dietrich sich weigerte, vor der Kamera zu erscheinen."
    ),

    // Question 26 - Lola: Preisgeld
    Question(
        categoryId = 4,
        questionText = "Die Lola (Deutscher Filmpreis) ist nicht nur eine Ehre, sondern auch ein finanzieller Preis. Wie hoch ist die Foerderung ungefaehr, die der Gewinner des Goldes (Bester Film) erhaelt?",
        answerA = "250.000 Euro",
        answerB = "500.000 Euro",
        answerC = "1 Million Euro",
        answerD = "3 Millionen Euro",
        correctAnswer = 2, // C
        explanation = "Der Goldene Deutsche Filmpreis (Lola in Gold) ist mit einer Foerderungssumme von ungefaehr 1 Million Euro fuer das naechste Projekt des Preistraegers verbunden. Damit ist er einer der hoechst dotierten Filmpreise Europas.",
        difficulty = 5,
        funFact = "Die Lola-Verleihung wird vom Deutschen Institut fuer Filmfoerderung (FFA) und der BKM (Bundesbeauftragte fuer Kultur und Medien) organisiert. Die Foerdergelder stammen aus staatlichen Mitteln zur Starkung des deutschen Films."
    ),

    // --- EUROPAEISCHER FILMPREIS ---

    // Question 27 - EFA: Gründungsjahr und Ort
    Question(
        categoryId = 4,
        questionText = "Die European Film Academy (EFA) vergibt die Europaeischen Filmpreise. In welchem Jahr wurden diese Preise erstmals verliehen und auf wessen Initiative hin wurde die EFA gegruendet?",
        answerA = "1985, auf Initiative von Federico Fellini",
        answerB = "1988, auf Initiative von Ingmar Bergman",
        answerC = "1992, auf Initiative von Wim Wenders",
        answerD = "1996, auf Initiative von Bernardo Bertolucci",
        correctAnswer = 1, // B
        explanation = "Die European Film Academy wurde 1988 auf Initiative des schwedischen Regisseurs Ingmar Bergman gegruendet. Die erste Verleihung der Europaeischen Filmpreise fand im selben Jahr statt. Wim Wenders war ebenfalls Mitbegruender und ist eng mit der EFA verbunden.",
        difficulty = 5,
        funFact = "Ingmar Bergman, einer der einflussreichsten Regisseure aller Zeiten, gruendete die EFA, um die Vielfalt des europaischen Kinos zu foerdern und ein Gegengewicht zur Hollywood-Dominanz zu schaffen. Er leitete die Organisation in ihren Gruendungsjahren."
    ),

    // Question 28 - EFA: Bester Film Erstes Mal
    Question(
        categoryId = 4,
        questionText = "Welcher Film gewann den ersten Europaeischen Filmpreis (EFA Award) fuer den Besten Europaeischen Film im Jahr 1988?",
        answerA = "Babettes Fest von Gabriel Axel",
        answerB = "Au Revoir les Enfants von Louis Malle",
        answerC = "Das Schweigen der Seele von Andrei Tarkowski",
        answerD = "Die Aussage von Krzysztof Kieslowski",
        correctAnswer = 0, // A
        explanation = "'Babettes Fest' (1987) von Gabriel Axel, eine daenische Produktion, gewann den ersten Europaeischen Filmpreis fuer den Besten Film. Der Film hatte kurz zuvor auch den Oscar fuer den Besten fremdsprachigen Film gewonnen — eine seltene Kombination.",
        difficulty = 5,
        funFact = "'Babettes Fest' ist die einzige daenische Produktion, die den Oscar fuer den Besten fremdsprachigen Film gewonnen hat. Der Film basiert auf einer Novelle von Karen Blixen (Isak Dinesen) und handelt von einem franzoesischen Koch, der fuer eine religiose Gemeinschaft in Norwegen kocht."
    ),

    // Question 29 - EFA: Meiste Gewinne
    Question(
        categoryId = 4,
        questionText = "Welcher Regisseur hat die meisten Europaeischen Filmpreise fuer die Beste Regie gewonnen?",
        answerA = "Pedro Almodovar",
        answerB = "Michael Haneke",
        answerC = "Lars von Trier",
        answerD = "Paolo Sorrentino",
        correctAnswer = 1, // B
        explanation = "Michael Haneke ist einer der am meisten ausgezeichneten Regisseure bei den Europaeischen Filmpreisen. Er gewann mehrfach fuer Werke wie 'Caché' (2005), 'Das weisse Band' (2009) und 'Amour' (2012), die alle auch international hoechste Anerkennung fanden.",
        difficulty = 5,
        funFact = "Michael Haneke ist oesterreichischer Staatsangehoerige, obwohl er in Deutschland aufwuchs und studierte. Seine Filme sind bekannt fuer ihre psychologische Intensitaet und moralische Kompleritaet. 'Amour' ist der einzige oesterreichische Film, der je die Goldene Palme gewann."
    ),

    // Question 30 - EFA: Prix Fassbinder
    Question(
        categoryId = 4,
        questionText = "Die European Film Academy vergibt einen Preis, der nach einem deutschen Filmregisseur benannt ist. Nach wem ist dieser Preis benannt?",
        answerA = "Fritz Lang",
        answerB = "F.W. Murnau",
        answerC = "Rainer Werner Fassbinder",
        answerD = "Ernst Lubitsch",
        correctAnswer = 2, // C
        explanation = "Der Prix Fassbinder, benannt nach Rainer Werner Fassbinder, wurde von der European Film Academy als Ehrung fuer herausragende Nachwuchstalente vergeben. Fassbinder (1945-1982) gilt als einer der wichtigsten Vertreter des Neuen Deutschen Films.",
        difficulty = 5,
        funFact = "Rainer Werner Fassbinder drehte in seinem kurzen Leben (er starb mit 37 Jahren) ueber 40 Spielfilme, Kurzfilme, Fernsehfilme und Theaterstuecke. Sein Mammutwerk 'Berlin Alexanderplatz' (1980) hat eine Laufzeit von rund 15,5 Stunden."
    ),

    // Question 31 - Oscar: Erste Farb-Filmauszeichnung
    Question(
        categoryId = 4,
        questionText = "Die Oscar-Kategorie fuer die Beste Kamera wurde lange zwischen Schwarzweiss- und Farbfilm unterschieden. In welchem Jahr wurde diese Trennung abgeschafft?",
        answerA = "1957",
        answerB = "1967",
        answerC = "1972",
        answerD = "1981",
        correctAnswer = 1, // B
        explanation = "Ab 1940 gab es separate Oscar-Kategorien fuer Schwarzweiss- und Farb-Kamera. Diese Trennung wurde 1967 aufgehoben, als die Filmwelt fast vollstaendig auf Farbfilm umgestellt hatte. Zuvor gab es die Trennung auch in anderen Kategorien wie Ausstattung und Kostueme.",
        difficulty = 5,
        funFact = "In den letzten Jahren vor der Zusammenfuehrung gewann fast immer ein Farbfilm die kombinierte Kategorie. Der letzte Oscar fuer Schwarzweiss-Kamera ging 1967 an 'Wer hat Angst vor Virginia Woolf?'. 1993 wurde 'Schindlers Liste' der letzte SW-Film, der die allgemeine Kamera-Kategorie gewann."
    ),

    // Question 32 - Cannes: Juengster Palme-Gewinner
    Question(
        categoryId = 4,
        questionText = "Welcher Regisseur war der juengste, der je die Palme d'Or gewann?",
        answerA = "Xavier Dolan",
        answerB = "Gregg Araki",
        answerC = "Park Chan-wook",
        answerD = "Bong Joon-ho",
        correctAnswer = 0, // A
        explanation = "Xavier Dolan gewann 2014 im Alter von 25 Jahren den Jury-Grand-Prix fuer 'Mommy', was ihn zum juengsten Preistraeger eines Hauptpreises in Cannes machte. Die Palme d'Or selbst gewann 'Winter Sleep' von Nuri Bilge Ceylan. Dolan ist ein kanadischer Regisseur franzoesischer Muttersprache.",
        difficulty = 5,
        funFact = "Xavier Dolan drehte seinen Debuefilm 'I Killed My Mother' mit nur 19 Jahren und finanzierte ihn grossteils selbst. Das Werk wurde in die Quinzaine des Cineastes bei Cannes eingeladen — bemerkenswert fuer einen Erstlingsfilm eines Teenagers."
    ),

    // Question 33 - Berlinale: Silberner Bär Spezialpreis Regisseur
    Question(
        categoryId = 4,
        questionText = "Bei der Berlinale gibt es den Silbernen Baer fuer die Beste Regie. Wie heisst der Hauptpreis der Berlinale (Wettbewerb), den der Gewinner des Besten Films erhaelt?",
        answerA = "Goldener Bär",
        answerB = "Goldener Adler",
        answerC = "Blaue Blume",
        answerD = "Silberne Linde",
        correctAnswer = 0, // A
        explanation = "Der Hauptpreis der Berlinale ist der Goldene Baer (Goldener Bär), der seit 1951 fuer den besten Wettbewerbsfilm vergeben wird. Die Berlinale (Internationale Filmfestspiele Berlin) ist neben Cannes und Venedig eines der drei A-Festivals der FIAPF.",
        difficulty = 5,
        funFact = "Der Goldene Baer ist eine stilisierte Darstellung des Berliner Wahrzeichens. Die Berlinale ist bekannt fuer ihr politisch engagiertes Programm und war das erste grosse Festival, das LGBT-Inhalte systematisch ins Programm aufnahm."
    ),

    // Question 34 - Oscar-Boykott 1973
    Question(
        categoryId = 4,
        questionText = "Bei der Oscar-Verleihung 1973 lehnte ein Gewinner seinen Oscar oeffentlich ab und schickte stattdessen eine Aktivistin aufs Podium. Wer war dieser Gewinner?",
        answerA = "Jane Fonda",
        answerB = "Marlon Brando",
        answerC = "George C. Scott",
        answerD = "Peter Sellers",
        correctAnswer = 1, // B
        explanation = "Marlon Brando lehnte 1973 seinen Oscar fuer 'Der Pate' ab und schickte die Apache-Aktivistin Sacheen Littlefeather als seine Stellvertreterin. Sie hielt eine kurze Rede zur Behandlung der amerikanischen Ureinwohner in der Filmindustrie. George C. Scott hatte 1971 seinen Oscar als erster abgelehnt.",
        difficulty = 5,
        funFact = "Die Academy entschuldigte sich 2022 offiziell bei Sacheen Littlefeather fuer das feindseelige Empfang, das sie 1973 erhielt. Littlefeather starb kurz nach der Entschuldigung im Oktober 2022."
    ),

    // Question 35 - BAFTA: Verleihungsort seit 1968
    Question(
        categoryId = 4,
        questionText = "Seit 1976 findet die BAFTA-Verleihung regelmaessig in einem bestimmten Londoner Theater statt. Wie heisst dieser Veranstaltungsort?",
        answerA = "Royal Albert Hall",
        answerB = "Odeon Leicester Square",
        answerC = "Royal Opera House",
        answerD = "BFI Southbank",
        correctAnswer = 0, // A
        explanation = "Die BAFTA Film Awards werden seit mehreren Jahrzehnten in der Royal Albert Hall in London verliehen. Das ikonische Konzertgebaeude bietet mit seiner eindrucksvollen Atmosphaere den passenden Rahmen fuer die britischen Filmpreise.",
        difficulty = 5,
        funFact = "Die Royal Albert Hall wurde 1871 eroeffnet und nach dem verstorbenen Prinzgemahl Albert von Sachsen-Coburg und Gotha benannt. Sie fasst je nach Bestuhlung bis zu 5.272 Personen und wird auch fuer die BBC Proms und andere Grossveranstaltungen genutzt."
    ),

    // Question 36 - EFA: Erstmals nichteuropaeischer Film nominiert
    Question(
        categoryId = 4,
        questionText = "Fuer den Europaeischen Filmpreis koennen nur Filme aus EFA-Mitgliedslaendern nominiert werden. Wie viele Laender sind ungefaehr Mitglied der EFA?",
        answerA = "Ca. 20 Laender",
        answerB = "Ca. 35 Laender",
        answerC = "Ca. 50 Laender",
        answerD = "Alle EU-Laender plus Schweiz und Norwegen",
        correctAnswer = 2, // C
        explanation = "Die European Film Academy hat etwa 3.000 individuelle Mitglieder aus ca. 50 europaeischen Laendern. Beachtenswert ist, dass die EFA nicht auf EU-Laender beschraenkt ist, sondern den geographischen Begriff Europa umfasst, inklusive laender wie Russland, Tuerkei und Israel.",
        difficulty = 5,
        funFact = "Israel ist Mitglied der European Film Academy, obwohl es geographisch nicht in Europa liegt. Israelische Filme waren mehrfach fuer den Europaeischen Filmpreis nominiert, was die weitgefasste Definition der EFA fuer 'europaeisch' verdeutlicht."
    ),

    // Question 37 - Oscar: Bester Dokumentarfilm Kategorie-Geschichte
    Question(
        categoryId = 4,
        questionText = "In welchem Jahr wurde der Oscar fuer den Besten Dokumentarfilm erstmals vergeben?",
        answerA = "1941",
        answerB = "1944",
        answerC = "1948",
        answerD = "1952",
        correctAnswer = 1, // B
        explanation = "Der Oscar fuer den Besten Dokumentarfilm (und Besten Dokumentar-Kurzfilm) wurde erstmals bei der 17. Oscar-Verleihung 1944 vergeben. Die Kategorie wurde eingefuehrt, um die wachsende Bedeutung des Dokumentarfilms, besonders in Kriegszeiten, anzuerkennen.",
        difficulty = 5,
        funFact = "Die fruehesten Oscar-Gewinner in der Dokumentarfilm-Kategorie waren oft Kriegspropaganda-Dokumentationen oder von der US-Regierung finanzierte Berichte ueber den Zweiten Weltkrieg."
    ),

    // Question 38 - Berlinale: Filmpreis der FIPRESCI
    Question(
        categoryId = 4,
        questionText = "Bei der Berlinale vergibt neben der offiziellen Jury auch die internationale Filmkritiker-Vereinigung einen Preis. Wie heisst dieser Preis?",
        answerA = "Prix de la Critique",
        answerB = "FIPRESCI-Preis",
        answerC = "Kritikerdolch",
        answerD = "Silver Screen Award",
        correctAnswer = 1, // B
        explanation = "Der FIPRESCI-Preis wird von der Federation Internationale de la Presse Cinematographique (Internationale Vereinigung der Filmkritik) vergeben. Er existiert bei allen grossen Festivals (Cannes, Venedig, Berlinale) und gilt als unabhaengige Meinung der Filmkritiker neben den offiziellen Jury-Preisen.",
        difficulty = 5,
        funFact = "FIPRESCI wurde 1926 gegruendet und ist damit aelter als die meisten Filmfestivals. Die Vereinigung hat Mitglieder in ueber 50 Laendern. Ihr Preis bei Berlinale, Cannes und Venedig wird oft als Indikator fuer kuenstlerisch anspruchsvolle, aber kommerziell riskante Filme betrachtet."
    ),

    // Question 39 - Lola: Ehrenlola Geschichte
    Question(
        categoryId = 4,
        questionText = "Marlene Dietrich ist trotz ihrer zentralen Bedeutung fuer den deutschen Film nie mit der Lola ausgezeichnet worden. Welcher Grund liegt dafuer nahe?",
        answerA = "Sie weigerte sich, nach Deutschland zurueckzukehren",
        answerB = "Sie war nicht mehr deutsche Staatsangehoerige",
        answerC = "Die Lola existierte nicht zu ihren Lebzeiten in heutiger Form",
        answerD = "Sie lehnte alle deutschen Auszeichnungen ab",
        correctAnswer = 0, // A
        explanation = "Marlene Dietrich weigerte sich jahrzehntelang, nach Deutschland zurueckzukehren, aus politischen Gruenden (ihr Antinazismus und spaetere Kritik an der deutschen Vergangenheitsbewaeltigung). Als ihr die Lola angeboten wurde, lehnte sie ab. Sie starb 1992 in Paris, ohne Deutschland seit den 1960er Jahren besucht zu haben.",
        difficulty = 5,
        funFact = "Marlene Dietrichs Beziehung zu Deutschland war kompliziert: Sie wurde in Berlin geboren, verliess das Land 1930 fuer Hollywood, lehnte Nazi-Angebote ab und trat fuer die Alliierten auf. Trotzdem wurde sie in Deutschland nach dem Krieg oft als Verreeterin angesehen. Erst spaet wuerdigte man ihr Erbe, indem ein Berliner Platz nach ihr benannt wurde."
    ),

    // Question 40 - Oscar: Titelrekord in einem Jahr
    Question(
        categoryId = 4,
        questionText = "Welcher Film stellte einen Rekord auf, indem er mehr als die Haelfte seiner Nominierungen gewann (bei hoher Anzahl), und gewann dabei u.a. alle technischen Oscars fuer die er nominiert war?",
        answerA = "2001: Odyssee im Weltraum (1968)",
        answerB = "Titanic (1997)",
        answerC = "Star Wars (1977)",
        answerD = "Gravity (2013)",
        correctAnswer = 1, // B
        explanation = "'Titanic' (1997) gewann 11 von 14 Nominierungen (78,5%) und raeumte dabei alle technischen Kategorien ab: Kamera, Schnitt, Szenenbild, Kostueme, Visuelle Effekte, Ton und Tonschnitt. Nur die Schauspiel-Oscars blieben aus.",
        difficulty = 5,
        funFact = "'Titanic' hatte ein anfaengliches Budget von 200 Millionen Dollar — das erste Mal in der Filmgeschichte, dass ein Film so viel kostete. Der Film spielte weltweit ueber 2,2 Milliarden Dollar ein und hielt den Weltrekord als erfolgreichster Film aller Zeiten bis 'Avatar' (2009)."
    ),

    // Question 41 - Golden Globe: Historischer Nichtgewinner
    Question(
        categoryId = 4,
        questionText = "Welcher Film wurde bei den Golden Globes als Bester Film (Drama) nominiert und gilt als einer der groessten Golden-Globe-Favoriten, der ueberraschend leer ausging, obwohl er spaeter viele andere Preise gewann?",
        answerA = "Citizen Kane (1942)",
        answerB = "Vertigo (1958)",
        answerC = "2001: Odyssee im Weltraum (1969)",
        answerD = "Raging Bull (1981)",
        correctAnswer = 0, // A
        explanation = "'Citizen Kane' (1942) wurde als Bestes Bild nominiert, gewann aber nur den Globe fuer das Beste Drehbuch. Der Film gilt als einer der groessten Filme aller Zeiten, wurde aber bei vielen Verleihungen zugunsten von 'How Green Was My Valley' uebergangen.",
        difficulty = 5,
        funFact = "Orson Welles war bei der Erstauffuehrung von 'Citizen Kane' nur 25 Jahre alt. Der Film wurde von William Randolph Hearst, auf den die Figur Charles Foster Kane offensichtlich basiert, aktiv boykottiert — Hearst verbat seinen Zeitungen, den Film zu erwaehnen oder zu bewerben."
    ),

    // Question 42 - EFA: Sonderpreis Lebenswerk
    Question(
        categoryId = 4,
        questionText = "Die European Film Academy vergibt auch einen Lebenswerk-Ehrenpreis. An welchen Regisseur wurde dieser Preis in den Anfangsjahren der EFA vergeben, der als Schutzpatron europaeischen Autorenkinos gilt?",
        answerA = "Ingmar Bergman",
        answerB = "Michelangelo Antonioni",
        answerC = "Federico Fellini",
        answerD = "Andrei Tarkowski",
        correctAnswer = 2, // C
        explanation = "Federico Fellini erhielt in den Anfangsjahren der EFA einen besonderen Ehrenpreis. Als Mitbegruender und Garant fuer europaische Filmkultur wurden Regisseure wie Fellini, Bergman und Antonioni, die das europaische Autorenkino definierten, regelmaessig bei der EFA geehrt.",
        difficulty = 5,
        funFact = "Federico Fellini gewann viermal den Oscar fuer den Besten fremdsprachigen Film: fuer 'La Strada' (1956), 'Die Nächte der Cabiria' (1957), '8½' (1963) und 'Amarcord' (1974). Sein Name wurde zum Adjektiv 'fellinesisch', das surreale, traumhafte Qualitaeten beschreibt."
    ),

    // Question 43 - Berlinale Panorama: Entstehung
    Question(
        categoryId = 4,
        questionText = "Die Berlinale besteht aus mehreren Sektionen. Welche Sektion wurde 1978 als 'Info-Schau' gegruendet und fokussiert sich besonders auf LGBT-Themen im Film?",
        answerA = "Panorama",
        answerB = "Forum",
        answerC = "Generation",
        answerD = "Perspektive Deutsches Kino",
        correctAnswer = 0, // A
        explanation = "Das Panorama der Berlinale entstand 1978 als 'Info-Schau' und wurde 1986 in 'Panorama' umbenannt. Es ist bekannt fuer sein regelmaessiges Engagement fuer queere Filme und LGBT-Themen und vergibt den Teddy Award fuer den besten queeren Film.",
        difficulty = 5,
        funFact = "Der Teddy Award wurde 1987 gegruendet und ist der erste und aelteste Filmpreis, der speziell an queere Filmemacher vergeben wird. Die Berlinale ist international anerkannt als das Festival, das LGBT-Film am ststaerksten unterstuetzt."
    ),

    // Question 44 - Oscar: Fremdsprachiger Film ohne Oscar-Einreichung
    Question(
        categoryId = 4,
        questionText = "Ein Land kann pro Jahr nur einen Film fuer die Oscar-Kategorie 'Bester Internationaler Film' einreichen. Welches Land schickte historisch gesehen am meisten Einreichungen, ohne je den Preis zu gewinnen?",
        answerA = "Daenemark",
        answerB = "Schweden",
        answerC = "Japan",
        answerD = "Indien",
        correctAnswer = 3, // D
        explanation = "Indien schickte eine grosse Anzahl von Filmeinreichungen fuer den Oscar-Fremdsprachenfilm ohne bislang zu gewinnen. Obwohl indische Filme und Regisseure wie Satyajit Ray international anerkannt sind, gewann India nie den Oscar fuer den Besten fremdsprachigen Film — obwohl Ray 1992 einen Ehren-Oscar erhielt.",
        difficulty = 5,
        funFact = "Satyajit Ray erhielt 1992 einen Ehren-Oscar fuer sein Lebenswerk — kurz vor seinem Tod. Ray ist der einzige indische Filmemacher, der diese Auszeichnung je erhalten hat. Interessanterweise wurde der Preis ihm im Krankenhaus ueberreicht."
    ),

    // Question 45 - Cannes: Jury-Groesse und Zusammensetzung
    Question(
        categoryId = 4,
        questionText = "Wieviele Mitglieder hat die offizielle Hauptjury beim Cannes Film Festival, die ueber die Palme d'Or entscheidet?",
        answerA = "5 Mitglieder",
        answerB = "7 Mitglieder",
        answerC = "9 Mitglieder",
        answerD = "11 Mitglieder",
        correctAnswer = 2, // C
        explanation = "Die Hauptjury des Cannes Film Festivals besteht traditionell aus 9 Mitgliedern, angeführt vom Jury-Praesident. Die Zusammensetzung wechselt jedes Jahr und umfasst Regisseure, Schauspieler und andere Filmkuenstler aus verschiedenen Laendern.",
        difficulty = 5,
        funFact = "Einer der bekanntesten Jury-Praesident-Momente war 1960, als Jean-Luc Godards 'Ausser Atem' im Wettbewerb war, aber die Jury von Georges Simenon praesidiert wurde. Godard hatte den Film in 14 Tagen gedreht und damit die Nouvelle Vague endgueltig in der Welt etabliert."
    ),

    // Question 46 - BAFTA: Ewige Favoritenrolle
    Question(
        categoryId = 4,
        questionText = "Bei den BAFTA Awards gilt ein bestimmtes Genre oder Herkunftsland als besonders bevorzugt. Welche Feststellung trifft am ehesten zu?",
        answerA = "Britische Produktionen gewinnen ueberproportional haeufig",
        answerB = "Amerikanische Blockbuster dominieren die technischen Kategorien",
        answerC = "Europaeische Arthousefilme gewinnen haeufiger als in den USA",
        answerD = "Historische Dramen aus dem Vereinigten Koenigreich gewinnen besonders haeufig",
        correctAnswer = 0, // A
        explanation = "Britische Produktionen oder britisch-amerikanische Koproduktionen gewinnen bei den BAFTA Awards ueberproportional haeufig, da die Academy of Film and Television Arts (BAFTA) eine britische Institution ist und britische Mitglieder einen erheblichen Teil der Abstimmenden ausmachen.",
        difficulty = 5,
        funFact = "Die BAFTA wurde 1947 als British Film Academy gegruendet und fusionierte 1976 mit der Guild of Television Producers and Directors zur heutigen BAFTA. Sie hat ueber 6.000 Mitglieder weltweit, aber der Schwerpunkt liegt klar auf britischen Filmemachern."
    ),

    // Question 47 - Venedig: Besonderheit als erstes Festival
    Question(
        categoryId = 4,
        questionText = "Das Filmfestival Venedig war das erste grosse Festival, das einer bestimmten Filmform oder -herkunft erstmals einen Hauptpreis verlieh. Was war diese Premiere?",
        answerA = "Erstes Festival mit einem Preis fuer animierte Filme",
        answerB = "Erstes Festival, das einem asiatischen Film den Hauptpreis verlieh",
        answerC = "Erstes Festival mit einem Preis fuer Dokumentarfilme",
        answerD = "Erstes Festival mit einem Preis fuer Kurzfilme",
        correctAnswer = 1, // B
        explanation = "Venedig war 1951 das erste grosse Festival, das einem asiatischen Film den Hauptpreis verlieh, als Akira Kurosawas 'Rashomon' den Goldenen Loewen gewann. Dies war ein Wendepunkt: Der westliche Filmmarkt entdeckte das japanische Kino, und Kurosawa wurde weltberuehmt.",
        difficulty = 5,
        funFact = "'Rashomon' wurde von der japanischen Filmgesellschaft Daiei zunaechst widerwillig nach Venedig geschickt, da man nicht glaubte, ein japanischer Film koenne im Westen bestehen. Der Goldene Loewe oeffnete das japanische Kino fuer die westliche Welt."
    ),

    // Question 48 - Oscar-Kategorie Animationsfilm
    Question(
        categoryId = 4,
        questionText = "Der Oscar fuer den Besten Animationsfilm wurde erstmals bei der 74. Academy Awards verliehen. Welcher Film gewann den allerersten Oscar in dieser Kategorie?",
        answerA = "Shrek",
        answerB = "Monsters, Inc.",
        answerC = "Ice Age",
        answerD = "Jimmy Neutron: Boy Genius",
        correctAnswer = 0, // A
        explanation = "DreamWorks 'Shrek' (2001) gewann den ersten Oscar fuer den Besten Animationsfilm bei der 74. Verleihung im Jahr 2002. Die Kategorie wurde eingefuehrt, nachdem Animationsfilme in der 1990er Jahren zunehmend kommerzielle und kuenstlerische Bedeutung erlangt hatten.",
        difficulty = 5,
        funFact = "Viele Disney/Pixar-Fans empfanden es als Schlag, dass der erste Oscar in dieser Kategorie an DreamWorks und nicht an Pixar ging. 'Monsters, Inc.' war ebenfalls nominiert, aber 'Shrek' gewann. Pixar gewann den Preis erstmals 2003 fuer 'Findet Nemo'."
    ),

    // Question 49 - Golden Globe: Auslaendische Gewinner
    Question(
        categoryId = 4,
        questionText = "Welcher auslaendischer Film gewann bisher die meisten Golden Globes in einem einzigen Jahr?",
        answerA = "Parasite (2019, Bong Joon-ho)",
        answerB = "Crouching Tiger Hidden Dragon (2001, Ang Lee)",
        answerC = "Pan's Labyrinth (2007, Guillermo del Toro)",
        answerD = "Roma (2019, Alfonso Cuaron)",
        correctAnswer = 3, // D
        explanation = "'Roma' (2019) von Alfonso Cuaron gewann bei den Golden Globes den Preis fuer den Besten fremdsprachigen Film und den Preis fuer den Besten Film (Drama) — ein einzigartiger Doppelerfolg fuer einen nicht-englischsprachigen Film. Ausserdem gewann Cuaron die Beste Regie.",
        difficulty = 5,
        funFact = "'Roma' war der erste fremdsprachige Film, der den Golden Globe fuer den Besten Film (Drama) gewann. Alfonso Cuaron drehte den Film in Schwarzweiss, basierend auf seinen eigenen Kindheitserinnerungen in Mexiko-Stadt. Netflix produzierte den Film mit einem Budget von etwa 15 Millionen Dollar."
    ),

    // Question 50 - Lola: Besondere Kategorie Kurzfilm
    Question(
        categoryId = 4,
        questionText = "Der Deutsche Filmpreis (Lola) wird auch fuer Kurzfilme vergeben. In welchem Laengenbereich liegt ein Kurzfilm gemaess den Lola-Regelungen, um fuer diese Kategorie zu qualifizieren?",
        answerA = "Unter 10 Minuten",
        answerB = "Unter 15 Minuten",
        answerC = "Unter 20 Minuten",
        answerD = "Unter 30 Minuten",
        correctAnswer = 3, // D
        explanation = "Fuer den Deutschen Filmpreis (Lola) in der Kurzfilm-Kategorie muessen Filme eine Laenge von unter 30 Minuten haben. Diese Definition folgt der gaengigen internationalen Praxis, die auch von der Academy (Oscar) und anderen grossen Preisen verwendet wird.",
        difficulty = 5,
        funFact = "Der Kurzfilm-Oscar wird in drei Kategorien vergeben: Animierter Kurzfilm, Dokumentar-Kurzfilm und Spielfilm-Kurzfilm. Besonders der Animierte Kurzfilm gilt als Karrierebeschleuniger — viele spaetere Pixar-Regisseure begannen mit nominierten Kurzfilmen."
    )

)
