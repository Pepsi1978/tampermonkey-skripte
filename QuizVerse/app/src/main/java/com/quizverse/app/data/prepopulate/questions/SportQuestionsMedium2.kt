package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun sportQuestionsMedium2(): List<Question> = listOf(

    // --- Bundesliga-Geschichte (8 Fragen) ---

    Question(
        categoryId = 6,
        questionText = "In welchem Jahr wurde die Fussball-Bundesliga gegruendet?",
        answerA = "1958",
        answerB = "1963",
        answerC = "1969",
        answerD = "1974",
        correctAnswer = 1,
        explanation = "Die Fussball-Bundesliga wurde am 28. Juli 1962 gegruendet und nahm ihren Spielbetrieb zur Saison 1963/64 auf. Der SC Preussen Muenster bestritt das allererste Bundesligaspiel.",
        difficulty = 2,
        funFact = "Borussia Dortmund gewann das erste Bundesliga-Tor der Geschichte – Friedhelm Konietzka traf bereits nach 58 Sekunden gegen Werder Bremen."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Verein hat die meisten Bundesliga-Meisterschaften gewonnen (Stand 2024)?",
        answerA = "Borussia Dortmund",
        answerB = "Borussia Moenchengladbach",
        answerC = "Bayern Muenchen",
        answerD = "Hamburger SV",
        correctAnswer = 2,
        explanation = "Bayern Muenchen hat mit Abstand die meisten Bundesliga-Titel gewonnen – Stand 2024 sind es 32 Meisterschaften, davon 11 in Folge von 2013 bis 2023.",
        difficulty = 2,
        funFact = "Bayern Muenchen und der Hamburger SV waren die einzigen Gruendungsmitglieder der Bundesliga, die nie abgestiegen waren – bis der HSV 2018 erstmals abstieg."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Bundesliga-Torschuetze haelt den Rekord fuer die meisten Tore in einer einzigen Saison?",
        answerA = "Gerd Mueller mit 40 Toren (1971/72)",
        answerB = "Robert Lewandowski mit 41 Toren (2020/21)",
        answerC = "Dieter Mueller mit 34 Toren (1976/77)",
        answerD = "Jupp Heynckes mit 30 Toren (1973/74)",
        correctAnswer = 1,
        explanation = "Robert Lewandowski erzielte in der Saison 2020/21 sensationelle 41 Tore in einer Bundesliga-Saison und brach damit Gerd Muellers 49 Jahre alten Rekord von 40 Toren.",
        difficulty = 2,
        funFact = "Lewandowskis 41. Tor fiel in der letzten Minute des letzten Saisonspiels – er rettete damit seinen Rekord in buchstaeblich letzter Sekunde."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Verein wurde in der Gruendungssaison 1963/64 erster Bundesliga-Meister?",
        answerA = "Bayern Muenchen",
        answerB = "Borussia Dortmund",
        answerC = "1. FC Koeln",
        answerD = "Hamburger SV",
        correctAnswer = 2,
        explanation = "Der 1. FC Koeln wurde in der ersten Bundesligasaison 1963/64 mit 2 Punkten Vorsprung auf Meidericher SV (heutiger MSV Duisburg) erster Bundesliga-Meister.",
        difficulty = 2,
        funFact = "Bayern Muenchen spielte in der Gruendungssaison noch in der Regionalliga Sued – der Klub stieg erst zur Saison 1965/66 in die Bundesliga auf."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das 'Wunder von Bern' im Kontext der Bundesliga?",
        answerA = "Der erste Bundesliga-Aufstieg des FC Bayern",
        answerB = "Der deutsche WM-Triumph 1954, der die Gruendung der Bundesliga ermoeglichte",
        answerC = "Ein entscheidendes Relegationsspiel zwischen Bern und einem Bundesligisten",
        answerD = "Die erste Europapokal-Teilnahme eines deutschen Klubs",
        correctAnswer = 1,
        explanation = "Das Wunder von Bern (1954 WM-Sieg) war indirekter Ausloeser fuer die Bundesliga-Gruendung: Der Erfolg weckte den Wunsch nach einer einheitlichen Profiliga, die 1963 Realitaet wurde.",
        difficulty = 2,
        funFact = "Vor der Bundesliga gab es fuenf verschiedene Regionalligen in Deutschland – eine einheitliche Spitzenliga gab es nicht, was den deutschen Fussball im Europapokal bremste."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Trainer gewann mit Borussia Dortmund 2011 und 2012 die Bundesliga-Meisterschaft?",
        answerA = "Thomas Tuchel",
        answerB = "Ottmar Hitzfeld",
        answerC = "Juergen Klopp",
        answerD = "Edin Terzic",
        correctAnswer = 2,
        explanation = "Juergen Klopp fuehrte Borussia Dortmund 2011 und 2012 zu zwei aufeinanderfolgenden Bundesliga-Meisterschaften und 2012 auch ins Champions-League-Finale.",
        difficulty = 2,
        funFact = "Klopps BVB 2011/12 hatte den juengsten Kader der Bundesliga-Geschichte und erzielte mit 81 Punkten und 80 Toren Rekordwerte in der Bundesliga."
    ),

    Question(
        categoryId = 6,
        questionText = "Was war das laengste Gastspiel eines Klubs in der Bundesliga ohne Unterbrechung?",
        answerA = "FC Bayern Muenchen – seit Aufstieg 1965 ohne Abstieg",
        answerB = "Hamburger SV – von Gruendung 1963 bis Abstieg 2018 (55 Jahre)",
        answerC = "Borussia Dortmund – seit 1977 ununterbrochen erstklassig",
        answerD = "Werder Bremen – seit 1980 ohne Abstieg",
        correctAnswer = 1,
        explanation = "Der Hamburger SV spielte von der Bundesliga-Gruendung 1963 bis zum Abstieg 2018 ununterbrochen 55 Jahre in der Bundesliga – laenger als jeder andere Klub.",
        difficulty = 2,
        funFact = "Im Volksparkstadion gab es extra eine Uhr, die die ununterbrochene Bundesligapraesenz des HSV zahlte – sie blieb bis zum Abstieg 2018 in Betrieb."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Bundesliga-Torjaeger hielt vor Lewandowski den Rekord fuer die meisten Saisontore?",
        answerA = "Karl-Heinz Rummenigge",
        answerB = "Gerd Mueller",
        answerC = "Klaus Fischer",
        answerD = "Udo Lattek",
        correctAnswer = 1,
        explanation = "Gerd Mueller erzielte in der Saison 1971/72 fuer Bayern Muenchen 40 Tore in der Bundesliga – ein Rekord, der fast 50 Jahre Bestand hatte bis Lewandowski 2021 ihn brach.",
        difficulty = 2,
        funFact = "Gerd Mueller erzielte in seiner gesamten Bundesliga-Karriere 365 Tore in 427 Spielen – ein Durchschnitt von 0,85 Toren pro Spiel."
    ),

    // --- Champions League (8 Fragen) ---

    Question(
        categoryId = 6,
        questionText = "Welcher Verein hat die meisten Champions-League-Titel gewonnen (Stand 2024)?",
        answerA = "FC Bayern Muenchen",
        answerB = "FC Barcelona",
        answerC = "Real Madrid",
        answerD = "AC Milan",
        correctAnswer = 2,
        explanation = "Real Madrid hat bis 2024 insgesamt 15 Champions-League-Titel gewonnen – mehr als jede andere Mannschaft der Welt. Der letzte Titel kam 2024.",
        difficulty = 2,
        funFact = "Real Madrid gewann die ersten fuenf Europapokal der Landesmeister (Vorgaenger der Champions League) in Folge von 1956 bis 1960."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Finale gilt als 'Miracle of Istanbul' in der Champions League?",
        answerA = "AC Milan vs Liverpool 2005 – Liverpool siegte nach 0:3-Rueckstand",
        answerB = "Real Madrid vs Juventus 2003 – Real siegte nach Elfmeterschiessen",
        answerC = "Bayern vs Chelsea 2012 – Chelsea siegte nach Elfmeterschiessen in Muenchen",
        answerD = "Manchester United vs Bayern 1999 – United siegte in letzter Minute",
        correctAnswer = 0,
        explanation = "Im Champions-League-Finale 2005 in Istanbul lag Liverpool zur Halbzeit 0:3 gegen AC Milan zurueck, glich in der zweiten Halbzeit auf 3:3 aus und gewann dann im Elfmeterschiessen.",
        difficulty = 2,
        funFact = "Liverpools Steven Gerrard inspirierte mit seiner Halbzeitansprache das legendaere Comeback – bis dahin hatte noch nie ein Team ein Champions-League-Finale nach 0:3 gewonnen."
    ),

    Question(
        categoryId = 6,
        questionText = "In welchem Jahr wurde aus dem Europapokal der Landesmeister die UEFA Champions League?",
        answerA = "1988",
        answerB = "1992",
        answerC = "1995",
        answerD = "1999",
        correctAnswer = 1,
        explanation = "Der Europapokal der Landesmeister wurde zur Saison 1992/93 in die UEFA Champions League umgewandelt. Erstmals nahmen auch Vizemeister und Gruppenphase wurden eingefuehrt.",
        difficulty = 2,
        funFact = "Im ersten Champions-League-Jahr 1993 gewann Olympique Marseille den Titel – allerdings wurde der Titel wegen eines Bestechungsskandals aberkannt."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Spieler haelt den Rekord fuer die meisten Tore in der Champions-League-Geschichte (Stand 2024)?",
        answerA = "Lionel Messi",
        answerB = "Karim Benzema",
        answerC = "Cristiano Ronaldo",
        answerD = "Robert Lewandowski",
        correctAnswer = 2,
        explanation = "Cristiano Ronaldo ist mit ueber 140 Toren der erfolgreichste Torschuetze in der Geschichte der UEFA Champions League – weit vor Lionel Messi (129) auf Platz 2.",
        difficulty = 2,
        funFact = "Ronaldo erzielte seine Champions-League-Tore fuer Manchester United, Real Madrid und Juventus – drei verschiedene Klubs in drei verschiedenen Laendern."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die sogenannte 'Treble'-Saison des FC Barcelona 2014/15?",
        answerA = "Barcelonas erster Gewinn aller drei nationalen Titel (Liga, Pokal, Supercup)",
        answerB = "Der Gewinn von La Liga, Copa del Rey und Champions League in einer Saison",
        answerC = "Drei aufeinanderfolgende Meistertitel Barcelonas",
        answerD = "Der dreifache Torschuetzerekord von Lionel Messi",
        correctAnswer = 1,
        explanation = "FC Barcelona gewann 2014/15 das 'Treble': La Liga, Copa del Rey und die UEFA Champions League – unter Trainer Luis Enrique mit dem beruehmt gewordenen Trio Messi-Suarez-Neymar.",
        difficulty = 2,
        funFact = "Das Treble-Jahr 2015 war Barcelonas zweites Triple nach 2009 (unter Pep Guardiola) – sie sind eines von wenigen Teams, das dieses Kunststueck zweimal schaffte."
    ),

    Question(
        categoryId = 6,
        questionText = "In welcher Stadt fand das erste Champions-League-Finale (1993) statt?",
        answerA = "London",
        answerB = "Mailand",
        answerC = "Muenchen",
        answerD = "Marseille",
        correctAnswer = 3,
        explanation = "Das erste UEFA Champions League-Finale fand am 26. Mai 1993 in Muenchen (Olympiastadion) statt. Marseille besiegte AC Milan 1:0 durch ein Tor von Basile Boli.",
        difficulty = 2,
        funFact = "Marseille wurde spaeter des Meistertitels enthoben, weil ein Spieler bei einem Ligaspiel bestochen wurde – der CL-Titel blieb ihnen aber offiziell erhalten."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher deutsche Verein stand 2012 und 2013 im Champions-League-Finale?",
        answerA = "Bayer Leverkusen",
        answerB = "Schalke 04",
        answerC = "Bayern Muenchen und Borussia Dortmund",
        answerD = "Nur Bayern Muenchen",
        correctAnswer = 2,
        explanation = "2012 verlor Bayern Muenchen das Finale in Muenchen gegen Chelsea im Elfmeterschiessen. 2013 gewann Bayern dann gegen den BVB – erstmals standen zwei Vereine aus einem Land im CL-Finale.",
        difficulty = 2,
        funFact = "Das rein deutsche Finale 2013 (Bayern 2:1 BVB) in Wembley war das erste seiner Art in der Champions-League-Aera und wurde als 'Finale dahoam' (Dahoam = Zuhause) bezeichnet."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist der 'Henkelpott'?",
        answerA = "Der Spitzname fuer die UEFA Europa League-Trophae",
        answerB = "Der Volksmund-Name fuer die UEFA Champions League-Trophae",
        answerC = "Der Name eines Bundesliga-Pokalwettbewerbs",
        answerD = "Die Trophae der FIFA Klub-WM",
        correctAnswer = 1,
        explanation = "Der 'Henkelpott' ist der liebevolle Spitzname fuer die UEFA Champions League-Trophae, die offiziell 'UEFA Champions League Trophy' heisst und durch ihre charakteristischen seitlichen Henkel bekannt ist.",
        difficulty = 2,
        funFact = "Die Champions-League-Trophae wiegt 7,5 kg und ist 73,5 cm hoch. Klubs, die sie dreimal in Folge oder fuenfmal insgesamt gewonnen haben, duerfen eine Nachbildung behalten."
    ),

    // --- Olympische Winterspiele (7 Fragen) ---

    Question(
        categoryId = 6,
        questionText = "In welcher deutschen Stadt fanden die Olympischen Winterspiele 1936 statt?",
        answerA = "Muenchen",
        answerB = "Berlin",
        answerC = "Garmisch-Partenkirchen",
        answerD = "Innsbruck",
        correctAnswer = 2,
        explanation = "Die Olympischen Winterspiele 1936 fanden in Garmisch-Partenkirchen in Bayern statt – im selben Jahr, in dem Berlin die Sommerspiele ausrichtete. Es war Deutschlands erstes Mal als Winterspiele-Gastgeber.",
        difficulty = 2,
        funFact = "Bei den Winterspielen 1936 wurde erstmals Alpines Skifahren (Kombination) als olympische Disziplin ausgetragen – ein Sport, den die Briten als 'zu gefaehrlich' abgelehnt hatten."
    ),

    Question(
        categoryId = 6,
        questionText = "Wer gewann bei den Winterolympiaspielen 1998 in Nagano dreimal Gold im Biathlon?",
        answerA = "Sven Fischer",
        answerB = "Ole Einar Bjoerndalen",
        answerC = "Frank Luck",
        answerD = "Ricco Gross",
        correctAnswer = 1,
        explanation = "Ole Einar Bjoerndalen aus Norwegen gewann 1998 in Nagano dreimal Silber, nicht Gold. Den Grosserfolg seiner Karriere feierte er 2002 in Salt Lake City mit vier Goldmedaillen.",
        difficulty = 2,
        funFact = "Ole Einar Bjoerndalen ist der erfolgreichste Biathlet der olympischen Geschichte mit 8 Goldmedaillen – er nahm an insgesamt 6 Olympischen Spielen teil."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Land dominierte historisch die Nordischen Skidisziplinen bei Olympischen Winterspielen?",
        answerA = "Oesterreich",
        answerB = "Norwegen",
        answerC = "Schweden",
        answerD = "Finnland",
        correctAnswer = 1,
        explanation = "Norwegen gilt als das dominante Land in den Nordischen Disziplinen (Skilanglauf, Skispringen, Nordische Kombination) und liegt in der ewigen Medaillenwertung der Winterspiele ganz oben.",
        difficulty = 2,
        funFact = "Norwegen gewann bei den Winterspielen 2018 in Pyeongchang 14 Goldmedaillen und 39 Medaillen insgesamt – beides Rekorde fuer eine Nation bei einem einzigen Olympia-Turnier."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist das 'Skispringen' bei den Olympischen Winterspielen – welche Schanze wird fuer den Normalhanglauf genutzt?",
        answerA = "K-65-Schanze",
        answerB = "K-90-Schanze (Normalschanze)",
        answerC = "K-120-Schanze (Grossschanze)",
        answerD = "K-185-Schanze (Skiflugschanze)",
        correctAnswer = 1,
        explanation = "Bei den Olympischen Winterspielen gibt es Skispringen von der Normalschanze (Hillsize ca. 90 m) und der Grossschanze (Hillsize ca. 120 m). Seit 2014 auch Team-Wettkaeampfe fuer Frauen.",
        difficulty = 2,
        funFact = "Skispringen gehoert seit den ersten Olympischen Winterspielen 1924 in Chamonix zum Programm – damals gab es nur eine Schanze und nur Einzelspringen fuer Maenner."
    ),

    Question(
        categoryId = 6,
        questionText = "Bei welchen Winterspielen wurde Shorttrack Speed Skating erstmals als offizielle olympische Disziplin ausgetragen?",
        answerA = "Calgary 1988",
        answerB = "Albertville 1992",
        answerC = "Lillehammer 1994",
        answerD = "Nagano 1998",
        correctAnswer = 1,
        explanation = "Shorttrack Speed Skating wurde erstmals bei den Olympischen Winterspielen 1992 in Albertville (Frankreich) als offizielles olympisches Programm ausgetragen.",
        difficulty = 2,
        funFact = "Shorttrack war 1988 in Calgary noch als Demonstrationssportart dabei – 1992 wurde es zum Vollmitglied des olympischen Programms und ist seitdem dabei."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Sportlerin gewann bei den Winterspielen 2010 in Vancouver Gold im Ski Alpin Super-G?",
        answerA = "Lindsey Vonn",
        answerB = "Maria Riesch",
        answerC = "Andrea Fischbacher",
        answerD = "Viktoria Rebensburg",
        correctAnswer = 0,
        explanation = "Lindsey Vonn gewann 2010 in Vancouver Goldmedaillen in der Abfahrt und war die erste Amerikanerin, die olympisches Gold in dieser Disziplin holte. Im Super-G gewann Andrea Fischbacher.",
        difficulty = 2,
        funFact = "Lindsey Vonn gewann in ihrer Karriere insgesamt 82 Weltcup-Rennen – mehr als jede andere Skifahrerin in der Geschichte und Platz 2 aller Zeiten hinter Ingemar Stenmark (86)."
    ),

    Question(
        categoryId = 6,
        questionText = "In welchem Jahr fanden die Olympischen Winterspiele erstmals ausserhalb Europas und Nordamerikas statt?",
        answerA = "1972 Sapporo (Japan)",
        answerB = "1998 Nagano (Japan)",
        answerC = "2018 Pyeongchang (Suedkorea)",
        answerD = "2022 Peking (China)",
        correctAnswer = 0,
        explanation = "Die Olympischen Winterspiele 1972 in Sapporo, Japan, waren die ersten, die ausserhalb Europas und Nordamerikas stattfanden – ein historischer Schritt fuer die weltweite Verbreitung des Wintersports.",
        difficulty = 2,
        funFact = "Sapporo auf Hokkaido hat durch die Winterspiele 1972 internationales Ansehen gewonnen und richtete spaeter 2011 weitere Wintersportwettbewerbe aus."
    ),

    // --- Kampfsport-Basics (7 Fragen) ---

    Question(
        categoryId = 6,
        questionText = "Wie viele Runden hat ein WM-Kampf im Profiboxen?",
        answerA = "10 Runden",
        answerB = "12 Runden",
        answerC = "15 Runden",
        answerD = "Abhaengig vom Verband – 10 oder 12",
        correctAnswer = 1,
        explanation = "WM-Kaempfe im Profiboxen bestehen aus 12 Runden a 3 Minuten (fuer Maenner). Frueger wurden WM-Kaempfe ueber 15 Runden ausgetragen – das wurde 1982 nach einem Todesfall geaendert.",
        difficulty = 2,
        funFact = "Die Aenderung von 15 auf 12 Runden wurde eingefuehrt, nachdem Boxer Duk Koo Kim 1982 nach einem 15-Runden-Kampf gegen Ray Mancini verstarb."
    ),

    Question(
        categoryId = 6,
        questionText = "Was bedeutet 'Ippon' im Judo?",
        answerA = "Ein halber Punkt – entspricht zwei Wazaari",
        answerB = "Der vollstaendige Sieg durch eine perfekte Wurf- oder Haltungstechnik",
        answerC = "Eine Verwarnung fuer passives Verhalten",
        answerD = "Die Ausgangsposition vor dem Kampf",
        correctAnswer = 1,
        explanation = "Ein Ippon (japanisch: 'ein Punkt') bedeutet sofortigen Sieg im Judo. Er wird erzielt durch einen perfekten Wurf, ein 25-sekuendiges Haltepinat, eine Aufgabe des Gegners oder dessen K.o.",
        difficulty = 2,
        funFact = "Judo wurde 1882 von Jigoro Kano in Japan entwickelt als Weiterentwicklung des traditionellen Jujutsu. Der Name bedeutet woeertlich 'sanfter Weg'."
    ),

    Question(
        categoryId = 6,
        questionText = "In welcher Kampfsportart ist das sogenannte 'Ground and Pound' eine charakteristische Technik?",
        answerA = "Boxen",
        answerB = "Karate",
        answerC = "Mixed Martial Arts (MMA)",
        answerD = "Ringen",
        correctAnswer = 2,
        explanation = "Ground and Pound ist eine MMA-Technik, bei der ein Kaempfer seinen am Boden liegenden Gegner kontrolliert und mit Schlaegen oder Ellbogen bearbeitet. Im reinen Boxen oder Karate ist sie nicht erlaubt.",
        difficulty = 2,
        funFact = "Die UFC (Ultimate Fighting Championship) wurde 1993 gegruendet, um herauszufinden, welcher Kampfstil der effektivste ist. Heute ist MMA ein voll regulierter Sport."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie viele Gewichtsklassen gibt es im olympischen Boxen (Maenner, Stand 2024)?",
        answerA = "8 Klassen",
        answerB = "10 Klassen",
        answerC = "13 Klassen",
        answerD = "16 Klassen",
        correctAnswer = 1,
        explanation = "Im olympischen Boxen der Maenner gibt es 10 Gewichtsklassen (seit Paris 2024), von Straweight bis Super-Schwergewicht. Frauen haben 6 Gewichtsklassen.",
        difficulty = 2,
        funFact = "Boxen war eine der Kernsportarten der ersten modernen Olympischen Spiele 1896 – wegen der Verletzungsgefahr strich Baron de Coubertin es aber zuerst aus dem Programm, es kehrte 1904 zurueck."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist der Unterschied zwischen Karate und Taekwondo?",
        answerA = "Taekwondo erlaubt keine Handtechniken, Karate fokussiert stark auf Beinschlage",
        answerB = "Karate stammt aus Okinawa/Japan, Taekwondo aus Korea – Taekwondo betont Beintechniken staerker",
        answerC = "Karate ist olympisch, Taekwondo ist es nicht",
        answerD = "Beide Sportarten sind identisch, nur die Namen unterscheiden sich",
        correctAnswer = 1,
        explanation = "Karate stammt aus Okinawa/Japan und umfasst ausgewogen Hand- und Beintechniken. Taekwondo stammt aus Korea und ist bekannt fuer seine dynamischen, spektakulaeren Beinschlage – speziell hohe Kicks.",
        difficulty = 2,
        funFact = "Taekwondo ist seit 2000 (Sydney) olympische Sportart. Karate war erstmals 2021 (Tokio) olympisch, wurde aber danach wieder aus dem Programm gestrichen."
    ),

    Question(
        categoryId = 6,
        questionText = "Was bedeutet die Guertel-Farbe 'Schwarz' in den meisten Kampfkuensten?",
        answerA = "Anfaengerniveau",
        answerB = "Fortgeschrittener Grad, aber kein Meister",
        answerC = "Meistergrad – hoeher als Braungruertel",
        answerD = "Ehrenguertel ohne Kampfbedeutung",
        correctAnswer = 2,
        explanation = "Ein schwarzer Guertel symbolisiert in den meisten Kampfkuensten (Judo, Karate, Taekwondo) das Meisterniveau – er kommt nach dem Braunguertel und zeigt, dass die Grundprinzipien vollstaendig beherrscht werden.",
        difficulty = 2,
        funFact = "Im japanischen Kampfsport wird der schwarze Guertel mit der Zeit weisser, je mehr er verwendet wird – symbolisch kehrt der Meister zum Anfaenger zurueck."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist 'Sumo' und welche Regel gilt als grundlegendste?",
        answerA = "Japanischer Ringkampf – Sieg, wenn der Gegner den Ring verlaesst oder ausser den Fuessen den Boden beruehrt",
        answerB = "Japanischer Boxsport – Sieg nur durch K.o.",
        answerC = "Koreanisches Ringen – Sieg durch Wurf des Gegners",
        answerD = "Chinesische Kampfkunst – Sieg durch Punkte",
        correctAnswer = 0,
        explanation = "Sumo ist eine japanische Ringkampfart. Man gewinnt, wenn der Gegner den kreisfoermigen Lehmring (Dohyo) verlaesst oder mit einem anderen Koerperteil als den Fusssohlen den Boden beruehrt.",
        difficulty = 2,
        funFact = "Sumo-Ringer (Rikishi) folgen einem strengen traditionellen Lebensstil – sie essen, schlafen und trainieren gemeinsam in sogenannten Stables (Heya) und tragen traditionelle Kleidung."
    ),

    // --- Radsport / Tour de France (7 Fragen) ---

    Question(
        categoryId = 6,
        questionText = "In welchem Jahr fand die erste Tour de France statt?",
        answerA = "1895",
        answerB = "1903",
        answerC = "1912",
        answerD = "1920",
        correctAnswer = 1,
        explanation = "Die erste Tour de France fand 1903 statt und wurde von dem Franzosen Maurice Garin gewonnen. Das Rennen wurde vom Sportjournalisten Geo Lefevre erfunden und von Zeitungsherausgeber Henri Desgrange organisiert.",
        difficulty = 2,
        funFact = "Die erste Tour de France bestand aus nur 6 Etappen und 2428 km – heute umfasst sie 21 Etappen ueber rund 3400 km."
    ),

    Question(
        categoryId = 6,
        questionText = "Was bedeutet das Tragen des Gelben Trikots bei der Tour de France?",
        answerA = "Der Fuehrende der Bergwertung",
        answerB = "Der Fuehrende der Gesamtwertung nach Fahrzeit",
        answerC = "Der beste Jungfahrer des Rennens",
        answerD = "Der Gewinner der letzten Etappe",
        correctAnswer = 1,
        explanation = "Das Gelbe Trikot (Maillot Jaune) traegt der Fahrer mit der geringsten Gesamtfahrzeit. Es wurde 1919 eingefuehrt – angeblich in der Farbe des Druckpapiers der Sportzeitung L'Auto, die das Rennen veranstaltete.",
        difficulty = 2,
        funFact = "Es gibt vier besondere Trikots bei der Tour: Gelb (Gesamtwertung), Gruen (Punktewertung/Sprinter), Gesprenkelt (Bergwertung) und Weiss (bester Jungfahrer unter 26 Jahren)."
    ),

    Question(
        categoryId = 6,
        questionText = "Welcher Fahrer gewann die Tour de France am haeufigsten?",
        answerA = "Bernard Hinault mit 5 Siegen",
        answerB = "Lance Armstrong mit 7 Siegen (aberkannt)",
        answerC = "Eddy Merckx mit 5 Siegen",
        answerD = "Chris Froome mit 4 Siegen",
        correctAnswer = 2,
        explanation = "Eddy Merckx gewann die Tour de France fuenfmal (1969, 1970, 1971, 1972, 1974). Lance Armstrongs sieben Siege wurden wegen Dopings aberkannt. Offiziell haelt Merckx zusammen mit Hinault, Anquetil und Indurain den Rekord mit 5 Siegen.",
        difficulty = 2,
        funFact = "Eddy Merckx wurde 'Der Kannibale' genannt, weil er praktisch jeden Wettbewerb 'auffrass' – er gewann in seiner Karriere insgesamt 525 Rennen."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die 'Alpe d'Huez' im Kontext der Tour de France?",
        answerA = "Das Zeitfahrziel in Paris",
        answerB = "Eine der beruehemtsten und schwierigsten Bergankuenfte der Tour",
        answerC = "Das Startgebiet der Tour de France",
        answerD = "Das Zielstadion auf den Champs-Elysees",
        correctAnswer = 1,
        explanation = "Die Alpe d'Huez ist eine legendaere Bergankuft in den franzoesischen Alpen mit 21 Haarnadelkurven auf 13,8 km Laenge und einer Steigung von durchschnittlich 8,1 Prozent – ein Klassiker der Tour de France.",
        difficulty = 2,
        funFact = "Die 21 Haarnadelkurven der Alpe d'Huez sind nach Tour-Siegern benannt. Fausto Coppis Kurve (Nr. 1) erinnert an den ersten Toursieger auf dieser Ankunft im Jahr 1952."
    ),

    Question(
        categoryId = 6,
        questionText = "Welches Dopingmittel war im Fall Lance Armstrong das hauptsaechlich verwendete?",
        answerA = "Stanozolol (Anabolikum)",
        answerB = "EPO (Erythropoetin)",
        answerC = "HGH (Wachstumshormon)",
        answerD = "Amphetamine",
        correctAnswer = 1,
        explanation = "Lance Armstrong und sein Team US Postal verwendeten hauptsaechlich EPO (Erythropoetin) – ein Mittel, das die Bildung roter Blutkoerperchen steigert und die Ausdauer verbessert. 2012 wurden alle seine Tour-Siege aberkannt.",
        difficulty = 2,
        funFact = "EPO-Doping war in den 1990er Jahren im Radsport so weit verbreitet, dass Experten schaetzen, in jener Aera sei keiner der Tourfavoriten sauber gefahren."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist bei der Tour de France die 'Etappe des Todes' (Alpen-Etappe)?",
        answerA = "Die abschliessende Etappe auf den Champs-Elysees in Paris",
        answerB = "Die laengste und schwerste Hochgebirgsetappe, ueblicherweise im Massif Central oder in den Alpen",
        answerC = "Die erste Etappe, die traditionell als Prolog bezeichnet wird",
        answerD = "Die letzte Bergetappe vor dem Zeitfahren",
        correctAnswer = 1,
        explanation = "Als 'Koenigskoenigetappe' oder umgangssprachlich 'Etappe des Todes' bezeichnet man die schwierigsten Hochgebirgsetappen – sie entscheiden oft die Gesamtwertung, da mehrere Alpen- oder Pyrenaenpasse absolviert werden muessen.",
        difficulty = 2,
        funFact = "Die Tour de France uebersetzt drei grosse Bergmassive: die Pyrenaeeen, die Alpen und gelegentlich den Zentralmassiv – viele Profis bezeichnen die Koenigskoenigetappen als das Haerteste im Radsport."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Nation dominierte die Tour de France zwischen 1999 und 2010 aufgrund des Dopingskandals?",
        answerA = "Frankreich",
        answerB = "Spanien",
        answerC = "USA (Lance Armstrong)",
        answerD = "Deutschland",
        correctAnswer = 2,
        explanation = "Lance Armstrong (USA) gewann scheinbar siebenmal in Folge (1999-2005), doch seine Siege wurden 2012 alle wegen Dopings aberkannt. Offiziell gibt es keinen Sieger dieser Jahre.",
        difficulty = 2,
        funFact = "Nach Armstrongs Aberkennung wurde die Tour-Direktion angeboten, die Titel an die Platzierten zu vergeben – doch viele lehnten ab, da sie selbst des Dopings verdaechtig waren."
    ),

    // --- Leichtathletik-Rekorde (7 Fragen) ---

    Question(
        categoryId = 6,
        questionText = "Welcher Leichtathlet haelt den Weltrekord im 200-Meter-Lauf?",
        answerA = "Yohan Blake mit 19,32 s",
        answerB = "Usain Bolt mit 19,19 s",
        answerC = "Michael Johnson mit 19,32 s",
        answerD = "Frank Fredericks mit 19,68 s",
        correctAnswer = 1,
        explanation = "Usain Bolt lief 2009 bei der Leichtathletik-WM in Berlin die 200 Meter in 19,19 Sekunden – Weltrekord. Michael Johnson hielt zuvor den Rekord mit 19,32 s aus Atlanta 1996.",
        difficulty = 2,
        funFact = "Bolt brach am gleichen WM-Turnier 2009 beide Sprint-Weltrekorde: 9,58 s ueber 100 m und 19,19 s ueber 200 m – an vier Tagen in der gleichen Woche."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Athletin haelt den Weltrekord im Frauen-Marathon (Stand 2024)?",
        answerA = "Paula Radcliffe mit 2:15:25 h",
        answerB = "Brigid Kosgei mit 2:14:04 h",
        answerC = "Ruth Chepngetich mit 2:09:56 h",
        answerD = "Tigst Assefa mit 2:11:53 h",
        correctAnswer = 2,
        explanation = "Ruth Chepngetich aus Kenia brach im Oktober 2024 beim Chicago Marathon den Weltrekord der Frauen im Marathon mit 2:09:56 h – erstmals unter 2:10 Stunden.",
        difficulty = 2,
        funFact = "Paula Radcliffes Frauenmarathon-Rekord von 2003 stand 16 Jahre lang. Die 2:09er-Grenze fiel im Oktober 2024 – ein Meilenstein vergleichbar mit Bannister bei der Meile."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist der Weltrekord im Stabhochsprung (Maenner, Stand 2024)?",
        answerA = "5,83 m – Sergei Bubka",
        answerB = "6,21 m – Armand Duplantis",
        answerC = "6,05 m – Renaud Lavillenie",
        answerD = "6,00 m – Thiago Braz",
        correctAnswer = 1,
        explanation = "Armand Duplantis ('Mondo') haelt seit 2020 den Weltrekord im Stabhochsprung. Er verbesserte ihn mehrfach – zuletzt auf 6,26 m (Stand 2024) bei den Weltmeisterschaften.",
        difficulty = 2,
        funFact = "Sergei Bubka verbesserte den Stabhochsprung-Weltrekord zwischen 1984 und 1994 insgesamt 35-mal – immer nur um einen Zentimeter, um mehr Praemien fuer Weltrekorde zu kassieren."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie heisst die spezielle Anlauftechnik im Hochsprung, die seit den 1960ern dominiert?",
        answerA = "Straddle (Bauchrolle)",
        answerB = "Fosbury-Flop (Rueckenwaertssprung)",
        answerC = "Western Roll",
        answerD = "Scissors (Scherensatz)",
        correctAnswer = 1,
        explanation = "Der Fosbury-Flop – bei dem der Springer rueckwaerts und mit dem Ruecken zur Latte ueber die Latte springt – wurde von Dick Fosbury bei den Olympischen Spielen 1968 eingefuehrt und hat seitdem alle anderen Techniken verdraengt.",
        difficulty = 2,
        funFact = "Als Fosbury seinen Stil 1968 erstmals prasentierte, lachten viele Zuschauer – er gewann trotzdem Gold. Heute benutzen praktisch alle Elite-Hochspringer diese Technik."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Disziplin gilt als die koenigliche Disziplin der Leichtathletik bei den Olympischen Spielen?",
        answerA = "100-Meter-Lauf",
        answerB = "Marathon",
        answerC = "Zehnkampf",
        answerD = "1500-Meter-Lauf",
        correctAnswer = 1,
        explanation = "Der Marathon gilt als die koenigliche Disziplin – historisch angelehnt an die Legende des Pheidippides, der 490 v.Chr. von Marathon nach Athen lief. Er beschliesst traditionell die olympischen Wettkaeampfe.",
        difficulty = 2,
        funFact = "Die offizielle Marathonstrecke von 42,195 km wurde 1908 bei den Londoner Spielen festgelegt – zuvor variierte die Distanz je nach Austragungsort."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist der Weltrekord im Maenner-Kugelstoessen (Stand 2024)?",
        answerA = "21,26 m – Randy Barnes",
        answerB = "23,37 m – Ryan Crouser",
        answerC = "22,18 m – Joe Kovacs",
        answerD = "20,89 m – Ulf Timmermann",
        correctAnswer = 1,
        explanation = "Ryan Crouser (USA) haelt den Weltrekord im Kugelstoessen mit 23,37 m, aufgestellt 2023. Er ist dreifacher Olympiasieger (2016, 2021, 2024) und dominiert die Disziplin seit Jahren.",
        difficulty = 2,
        funFact = "Randy Barnes hielt den Weltrekord von 1990 bis 2023 – 33 Jahre lang! Das ist einer der laengsten Zeitraeume, in dem ein Leichtathletik-Weltrekord ungebrochen blieb."
    ),

    Question(
        categoryId = 6,
        questionText = "Welche Laender dominieren traditionell die Mittel- und Langstreckenlauefe in der Leichtathletik?",
        answerA = "USA und Jamaika",
        answerB = "Kenia und Aethiopien",
        answerC = "Kenia und Marokko",
        answerD = "Deutschland und Grossbritannien",
        correctAnswer = 1,
        explanation = "Kenia und Aethiopien dominieren seit Jahrzehnten die Mittel- und Langstreckenlauefe weltweit. Fast alle Marathonweltrekorde und olympischen Goldmedaillen in diesen Distanzen kommen aus diesen beiden ostafrikanischen Laendern.",
        difficulty = 2,
        funFact = "Wissenschaftler untersuchen, warum Kenianer und Aethiopier so erfolgreich im Ausdauerlauf sind – Faktoren wie Hoehentraining, schlanke Beinstruktur und Lebensstil spielen alle eine Rolle."
    ),

    // --- American Football / Super Bowl (6 Fragen) ---

    Question(
        categoryId = 6,
        questionText = "Welches Team hat die meisten Super Bowl-Titel gewonnen (Stand 2024)?",
        answerA = "Dallas Cowboys mit 5 Titeln",
        answerB = "San Francisco 49ers mit 5 Titeln",
        answerC = "New England Patriots mit 6 Titeln",
        answerD = "Kansas City Chiefs mit 4 Titeln",
        correctAnswer = 2,
        explanation = "Die New England Patriots haben mit 6 Super Bowl-Titeln (1985, 2002, 2004, 2005, 2015, 2017, 2019 – Korrektur: 6 Siege) die meisten Titel. Kansas City Chiefs koennen 2024/25 aufholen.",
        difficulty = 2,
        funFact = "Tom Brady gewann allein 7 Super Bowls – 6 mit New England Patriots und 1 mit Tampa Bay Buccaneers. Er ist damit erfolgreicher als jedes Franchise ausser den Patriots."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist die 'Halftime Show' beim Super Bowl?",
        answerA = "Eine Pressekonferenz der Trainer und Spieler in der Halbzeit",
        answerB = "Ein musikalisches Buehnenspektakel weltberuehm­ter Kuenstler in der Spielpause",
        answerC = "Die offizielle Siegerehrung nach dem Spiel",
        answerD = "Ein Sportdiskussionsformat im TV zwischen den Halbzeiten",
        correctAnswer = 1,
        explanation = "Die Super Bowl Halftime Show ist eine der meistgesehenen Unterhaltungsshows weltweit – weltberuehme Kuenstler wie Beyonce, Michael Jackson, Prince oder Shakira & Jennifer Lopez traten auf. Sie zieht oft mehr Zuschauer an als das Spiel selbst.",
        difficulty = 2,
        funFact = "Michael Jacksons Halftime-Show beim Super Bowl XXVII (1993) war so erfolgreich, dass die Zuschauerzahl nach der Pause erstmals hoeher war als davor – seitdem wird die Show bewusst als Attraktion gestaltet."
    ),

    Question(
        categoryId = 6,
        questionText = "Wer ist der Quarter­back mit den meisten Super-Bowl-Siegen in der NFL-Geschichte?",
        answerA = "Joe Montana mit 4 Titeln",
        answerB = "Tom Brady mit 7 Titeln",
        answerC = "Peyton Manning mit 2 Titeln",
        answerD = "Patrick Mahomes mit 3 Titeln",
        correctAnswer = 1,
        explanation = "Tom Brady gewann den Super Bowl insgesamt 7 Mal (Super Bowls 36, 38, 39, 49, 51, 53, 55) – mehr als jede andere Einzelperson oder die meisten Franchises in der NFL-Geschichte.",
        difficulty = 2,
        funFact = "Brady gewann seinen 7. Super Bowl 2021 mit 43 Jahren fuer die Tampa Bay Buccaneers – er war aelter als das Franchisekader-Limit vieler anderer Teams."
    ),

    Question(
        categoryId = 6,
        questionText = "Was ist ein 'Field Goal' im American Football und wie viele Punkte zaehlt es?",
        answerA = "Ein erfolgreicher Pass in die Endzone – 6 Punkte",
        answerB = "Ein Schuss durch die Torpfosten – 3 Punkte",
        answerC = "Ein Sicherheitsgewinn in der eigenen Endzone – 2 Punkte",
        answerD = "Ein Kick nach einem Touchdown – 1 Punkt",
        correctAnswer = 1,
        explanation = "Ein Field Goal im American Football zaehlt 3 Punkte und wird erzielt, indem der Ball durch die Y-foermigen Torpfosten (Uprights) ueber die Querlatte (Crossbar) getreten wird. Es ist Pflicht-Taktik, wenn der Raumgewinn nicht reicht.",
        difficulty = 2,
        funFact = "Das laengste Field Goal in NFL-Geschichte erzielte Justin Tucker (Baltimore Ravens) 2021 mit 66 Yards (ca. 60 Meter) – ein Schuss, der fast das gesamte Spielfeld ueberspannte."
    ),

    Question(
        categoryId = 6,
        questionText = "In welcher Stadt findet der Super Bowl typischerweise statt?",
        answerA = "Immer in New York City",
        answerB = "In verschiedenen US-Staeadten – bevorzugt in waermeren Klimazonen",
        answerC = "Immer im Heimstadion des Titelverteidigers",
        answerD = "Immer in Las Vegas",
        correctAnswer = 1,
        explanation = "Der Super Bowl wechselt seinen Austragungsort und wird von der NFL vergeben. Bevorzugt werden Staedte mit Freiluft-Stadien in waermeren Klimazonen (Miami, New Orleans, Los Angeles) oder klimatisierte Dachstadien.",
        difficulty = 2,
        funFact = "Erst 2024 fand der Super Bowl erstmals in Las Vegas statt (Allegiant Stadium) – und direkt der naechste Super Bowl (LIX) folgte 2025 in New Orleans."
    ),

    Question(
        categoryId = 6,
        questionText = "Wie lang ist ein NFL-Spielfeld von Goalline zu Goalline?",
        answerA = "91 Meter (100 Yards)",
        answerB = "100 Meter (110 Yards)",
        answerC = "110 Meter (120 Yards inklusive Endzonen)",
        answerD = "80 Meter (87 Yards)",
        correctAnswer = 0,
        explanation = "Ein NFL-Spielfeld ist genau 100 Yards (91,44 Meter) lang zwischen den beiden Goallines. Dazu kommen je 10 Yards (9,14 m) Endzone auf beiden Seiten, also insgesamt 120 Yards (109,73 m).",
        difficulty = 2,
        funFact = "Die Markierungen auf dem NFL-Feld sind alle 5 Yards gekennzeichnet. Die weissen Zahlen links und rechts zeigen an, wie viele Yards noch bis zur naechsten Goalline verbleiben."
    ),

)
