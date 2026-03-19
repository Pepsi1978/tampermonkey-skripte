package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun dortmundQuestionsMaster1(): List<Question> = listOf(

    // ── GRÜNDUNG 1909 ──────────────────────────────────────────────────────────

    // correctAnswer = 0
    Question(
        categoryId = 14,
        questionText = "An welchem genauen Datum wurde Borussia Dortmund gegründet?",
        answerA = "19. Dezember 1909",
        answerB = "1. September 1909",
        answerC = "4. November 1909",
        answerD = "25. Dezember 1909",
        correctAnswer = 0,
        explanation = "Borussia Dortmund wurde am 19. Dezember 1909 – dem vierten Adventssonntag – gegründet. Die Versammlung fand in der Gaststätte 'Zum Wildschütz' auf der Oesterholzstraße statt.",
        difficulty = 5,
        funFact = "Der Gründungstag fiel auf den vierten Advent – die Gründer mussten die Kirchenjugend-Versammlung gegen den ausdrücklichen Willen ihres Kaplans abhalten."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 14,
        questionText = "In welcher Gaststätte fand die Gründungsversammlung von Borussia Dortmund am 19. Dezember 1909 statt?",
        answerA = "Zum Roten Adler",
        answerB = "Zum Deutschen Kaiser",
        answerC = "Zum Wildschütz",
        answerD = "Zur Goldenen Krone",
        correctAnswer = 2,
        explanation = "Die Gründungsversammlung fand in der Gaststätte 'Zum Wildschütz' auf der Oesterholzstraße 60 in Dortmund statt. Die jungen Männer trafen sich dort, um dem Einfluss ihres Kaplans zu entgehen.",
        difficulty = 5,
        funFact = "Kaplan Dewald versuchte noch, die Versammlung aufzulösen – scheiterte aber am entschlossenen Widerstand der Gründer."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 14,
        questionText = "Wie viele Gründungsmitglieder hatte Borussia Dortmund bei seiner Gründung 1909?",
        answerA = "12",
        answerB = "21",
        answerC = "18",
        answerD = "15",
        correctAnswer = 2,
        explanation = "Borussia Dortmund wurde von genau 18 Gründungsmitgliedern ins Leben gerufen, die allesamt der Jugendgruppe der katholischen Dreifaltigkeitsgemeinde angehörten.",
        difficulty = 5,
        funFact = "Von den 18 Gründungsmitgliedern kehrten neun – darunter Julius Jacobi, der jüngere Bruder des späteren Vereinsvorsitzenden – aus dem Ersten Weltkrieg nicht zurück."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Wer war der erste gewählte Vorsitzende von Borussia Dortmund bei der Gründung 1909?",
        answerA = "Heinrich Unger",
        answerB = "Franz Jacobi",
        answerC = "Franz Braun",
        answerD = "Fritz Schulte",
        correctAnswer = 0,
        explanation = "Bei der Gründungsversammlung 1909 wurde Heinrich Unger zum ersten Vorsitzenden von Borussia Dortmund gewählt. Bereits 1910 übernahm Franz Jacobi den Posten.",
        difficulty = 5,
        funFact = "Franz Jacobi, der spätere langjährige Vorsitzende, übernahm bei der Gründung zunächst das Amt des Kassierers und Geschäftsführers."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Von wann bis wann war Franz Jacobi Vorsitzender von Borussia Dortmund?",
        answerA = "1910 bis 1923",
        answerB = "1909 bis 1918",
        answerC = "1912 bis 1925",
        answerD = "1909 bis 1920",
        correctAnswer = 0,
        explanation = "Franz Jacobi führte Borussia Dortmund von 1910 bis 1923 als Vereinsvorsitzender. In dieser Zeit stabilisierte er den noch jungen Verein und sicherte mehrfach dessen Fortbestehen.",
        difficulty = 5,
        funFact = "Jacobi war von Beruf Hüttenbeamter in der Dortmunder Stahlindustrie – typisch für die Arbeiterklassen-Wurzeln des Vereins."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Woher leitet sich der Name 'Borussia' in Borussia Dortmund ab?",
        answerA = "Von einer nahegelegenen Brauerei, die das Borussia-Bier braute",
        answerB = "Vom lateinischen Namen für die Stadt Dortmund",
        answerC = "Vom preußischen Königshaus Hohenzollern",
        answerD = "Von einem mittelalterlichen Ritterorden in Westfalen",
        correctAnswer = 0,
        explanation = "Der Name 'Borussia' wurde dem Borussia-Bier einer nahegelegenen Dortmunder Brauerei entlehnt. Der lateinische Begriff bedeutet zwar 'Preußen', die direkte Inspiration war aber das lokale Bier.",
        difficulty = 5,
        funFact = "Die ursprünglichen Vereinsfarben waren blau-weiß gestreift mit roter Schärpe – die charakteristischen Schwarz-Gelb-Farben kamen erst später."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 14,
        questionText = "Gegen welchen Verein bestritt Borussia Dortmund am 15. Januar 1911 sein erstes offizielles Spiel?",
        answerA = "Rot-Weiss Essen",
        answerB = "FC Schalke 04",
        answerC = "Arminia Bielefeld",
        answerD = "VfB Dortmund",
        correctAnswer = 3,
        explanation = "Das erste offizielle Spiel von Borussia Dortmund fand am 15. Januar 1911 auf der Weißen Wiese gegen den VfB Dortmund statt.",
        difficulty = 5,
        funFact = "Der BVB gewann dieses erste offizielle Spiel mit 9:3 – ein beeindruckender Einstand für die noch junge Mannschaft."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 14,
        questionText = "Mit welchem Ergebnis gewann Borussia Dortmund sein erstes offizielles Spiel am 15. Januar 1911?",
        answerA = "5:1",
        answerB = "7:2",
        answerC = "9:3",
        answerD = "4:0",
        correctAnswer = 2,
        explanation = "Borussia Dortmund gewann sein erstes offizielles Spiel am 15. Januar 1911 gegen den VfB Dortmund mit 9:3 auf der Weißen Wiese.",
        difficulty = 5,
        funFact = "Die 'Weiße Wiese' war das erste offizielle Spielgelände der Borussia – benannt nach ihrer charakteristischen Erscheinung im Winter."
    ),

    // ── FRÜHE VEREINSGESCHICHTE & FARBEN ──────────────────────────────────────

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Welche ursprünglichen Trikotfarben trug Borussia Dortmund bei seiner Gründung 1909?",
        answerA = "Blau-weiß gestreift mit roter Schärpe",
        answerB = "Schwarz-gelb gestreift",
        answerC = "Rot-weiß mit schwarzem Kragen",
        answerD = "Grün-weiß gestreift",
        correctAnswer = 0,
        explanation = "Die ursprünglichen Vereinsfarben von Borussia Dortmund waren blau-weiß gestreifte Trikots mit einer roten Schärpe. Die rote Schärpe symbolisierte die Verbundenheit mit der Arbeiterbewegung.",
        difficulty = 5,
        funFact = "Die heute ikonischen schwarz-gelben Farben sind erst deutlich später in der Vereinsgeschichte eingeführt worden."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 14,
        questionText = "Wie viele der 18 BVB-Gründungsmitglieder kehrten aus dem Ersten Weltkrieg nicht zurück?",
        answerA = "Drei",
        answerB = "Sieben",
        answerC = "Neun",
        answerD = "Zwölf",
        correctAnswer = 2,
        explanation = "Von den 18 Gründungsmitgliedern von Borussia Dortmund kehrten neun – also die Hälfte – aus dem Ersten Weltkrieg nicht zurück. Darunter war auch Julius Jacobi, der jüngere Bruder des Vereinsvorsitzenden Franz Jacobi.",
        difficulty = 5,
        funFact = "Julius Jacobi war der jüngere Bruder von Franz Jacobi – der Verlust der halben Gründergeneration im Krieg war ein tiefer Einschnitt für den noch jungen Verein."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Welcher Bruder von Vereinsgründer Franz Jacobi fiel im Ersten Weltkrieg?",
        answerA = "Julius Jacobi",
        answerB = "Wilhelm Jacobi",
        answerC = "Heinrich Jacobi",
        answerD = "Ernst Jacobi",
        correctAnswer = 0,
        explanation = "Julius Jacobi, der jüngere Bruder des späteren Vereinsvorsitzenden Franz Jacobi, kehrte als einer von neun Gründungsmitgliedern aus dem Ersten Weltkrieg nicht zurück.",
        difficulty = 5,
        funFact = "Unter den 18 Gründern befanden sich drei Brüder Jacobi: Franz, Julius und Wilhelm – eine Familiendynastie an der Wiege des BVB."
    ),

    // ── NS-ZEIT 1933–1945 ─────────────────────────────────────────────────────

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Was verstand man unter 'Gleichschaltung' im deutschen Fußball ab 1933?",
        answerA = "Die politisch-ideologische Ausrichtung der Vereine unter NS-Kontrolle, mit Vereinsführern und Ausschluss von 'Nichtariern'",
        answerB = "Die Einführung einheitlicher Spielregeln für alle Vereine",
        answerC = "Die Zusammenlegung kleiner Vereine zu größeren Einheiten",
        answerD = "Die Pflicht zur Mitgliedschaft im Deutschen Turn- und Sportbund",
        correctAnswer = 0,
        explanation = "Unter 'Gleichschaltung' verstand man die zwangsweise politisch-ideologische Ausrichtung aller gesellschaftlichen Institutionen – also auch der Fußballvereine – unter nationalsozialistische Kontrolle. Politische 'Vereinsführer' wurden eingesetzt, jüdische und oppositionelle Mitglieder wurden ausgeschlossen.",
        difficulty = 5,
        funFact = "Der BVB mit seinen Arbeiterwurzeln galt zunächst als potentiell schwer gleichzuschalten – passte sich aber letztlich den staatlichen und verbandlichen Anforderungen an."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Welcher politischen Partei gehörte BVB-Platzwart Heinrich Czerkus an und was tat er im Widerstand?",
        answerA = "SPD – er versteckte jüdische Mitglieder im Vereinsgelände",
        answerB = "Zentrum – er organisierte kirchlichen Widerstand gegen die Nazis",
        answerC = "USPD – er schleuste Verfolgte über die Grenze nach Holland",
        answerD = "KPD – er produzierte und verteilte illegale kommunistische Schriften",
        correctAnswer = 3,
        explanation = "Heinrich Czerkus war Mitglied der KPD und wurde 1933 in den Dortmunder Stadtrat gewählt. Im Widerstand produzierte und verteilte er illegale kommunistische Schriften – teils auf der Vervielfältigungsmaschine des BVB.",
        difficulty = 5,
        funFact = "Czerkus war bereits in der Weimarer Republik politisch aktiv und wurde 1933 für die KPD in den Dortmunder Stadtrat gewählt – kurz bevor die Nazis alle politischen Parteien außer der NSDAP verboten."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Wo und wann wurden BVB-Platzwart Heinrich Czerkus und BVB-Mitglied Franz Hippler von den Nazis ermordet?",
        answerA = "Im Steinwache-Gefängnis, Januar 1944",
        answerB = "Im KZ Sachsenhausen, März 1943",
        answerC = "In der Bittermark, November 1944",
        answerD = "Im Rombergpark Dortmund, April 1945",
        correctAnswer = 3,
        explanation = "Heinrich Czerkus und Franz Hippler wurden kurz vor Kriegsende im April 1945 im Rombergpark Dortmund von Nazi-Todeskommandos ermordet. Sie mussten sich in einer Reihe aufstellen und fielen in Bombentrichter, die zu ihren Massengräbern wurden.",
        difficulty = 5,
        funFact = "Czerkus' offizielles Todesdatum ist der 15. April 1945, Hipplers der 20. April 1945 – nur wenige Tage, bevor amerikanische Truppen Dortmund befreiten."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Wann trat Franz Hippler der Kommunistischen Partei Deutschlands (KPD) bei?",
        answerA = "1923",
        answerB = "1933",
        answerC = "1936",
        answerD = "1929",
        correctAnswer = 3,
        explanation = "Franz Hippler, BVB-Mitglied und enger Vertrauter von Heinrich Czerkus, trat 1929 der KPD bei. Er teilte sowohl die Leidenschaft für Borussia Dortmund als auch die politische Überzeugung mit Czerkus.",
        difficulty = 5,
        funFact = "Hippler und Czerkus verband neben der politischen Überzeugung auch die tiefe Liebe zur Borussia – beide zahlten ihren Widerstand mit dem Leben."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Welche SA-Funktion hatte der mit dem BVB verbundene Wilhelm Röhr in der NS-Zeit?",
        answerA = "SA-Sturmführer mit 10-20 Mann",
        answerB = "SA-Obersturmführer, der 50 bis 100 SA-Männer befehligte",
        answerC = "SA-Standartenführer auf Gauebene",
        answerD = "SA-Gruppenführer für ganz Westfalen",
        correctAnswer = 1,
        explanation = "Wilhelm Röhr, der vor 1933 der SA angehörte und an der Reichswehr sozialisiert wurde, bekleidete den Rang eines SA-Obersturmführers – vergleichbar mit einem Oberleutnant – und befehligte 50 bis 100 SA-Männer.",
        difficulty = 5,
        funFact = "Röhrs Biografie veranschaulicht die komplexe Verstrickung des Vereins in die NS-Zeit: Zwischen Anpassung und vereinzeltem Widerstand gab es alle Schattierungen."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Wie verhielt sich Borussia Dortmund laut historischer Forschung insgesamt gegenüber dem NS-Regime?",
        answerA = "Der BVB war ein aktiver Propagandaverein des Regimes",
        answerB = "Der BVB passte sich staatlichen Anforderungen an, zeigte aber in verschiedener Hinsicht Eigensinn und Widerstand",
        answerC = "Der BVB wurde als politisch unzuverlässig aufgelöst",
        answerD = "Der BVB widersetzte sich konsequent allen Gleichschaltungsversuchen",
        correctAnswer = 1,
        explanation = "Laut der historischen Forschung von Rolf Fischer und Katharina Wojatzek passte sich der BVB zwischen 1933 und 1945 den staatlichen und verbandlichen Anforderungen an, zeigte dabei aber in verschiedener Hinsicht Eigensinn und blieb gegenüber dem Regime 'eigensinnig'.",
        difficulty = 5,
        funFact = "Das 2024 erschienene Buch 'Borussia Dortmund in der Zeit des Nationalsozialismus 1933–1945' von Fischer und Wojatzek ist die erste umfassende wissenschaftliche Aufarbeitung dieser Zeit."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 14,
        questionText = "In welchem Jahr erschien die erste umfassende wissenschaftliche Monografie zur BVB-Geschichte in der NS-Zeit?",
        answerA = "2003",
        answerB = "2012",
        answerC = "2019",
        answerD = "2024",
        correctAnswer = 3,
        explanation = "Die erste umfassende wissenschaftliche Monografie zur BVB-Geschichte in der NS-Zeit – 'Borussia Dortmund in der Zeit des Nationalsozialismus 1933–1945' von Rolf Fischer und Katharina Wojatzek – erschien Anfang 2024 im Metropol Verlag.",
        difficulty = 5,
        funFact = "Die Autoren werteten zahlreiche bisher unbekannte Dokumente und Fotografien aus, um ein differenziertes Bild des Vereins unter der Diktatur zu zeichnen."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Zu welchem Anlass erinnert der jährliche Heinrich-Czerkus-Gedächtnislauf?",
        answerA = "An die Gründung des BVB 1909",
        answerB = "An den ermordeten BVB-Platzwart Heinrich Czerkus und seine Mitstreiter im NS-Widerstand",
        answerC = "An die erste Deutsche Meisterschaft des BVB 1956",
        answerD = "An die Wiederzulassung des BVB nach dem Zweiten Weltkrieg 1945",
        correctAnswer = 1,
        explanation = "Der jährliche Heinrich-Czerkus-Gedächtnislauf erinnert an den BVB-Platzwart und kommunistischen Widerstandskämpfer Heinrich Czerkus sowie an seine Mitstreiter, die von den Nazis ermordet wurden.",
        difficulty = 5,
        funFact = "Der Gedächtnislauf wird von der BVB-Fanabteilung organisiert und findet seit Jahrzehnten statt – ein Zeichen, dass der Verein die Erinnerung an seine NS-Opfer lebendig hält."
    ),

    // ── NACHKRIEGSZEIT & WIEDERAUFBAU ─────────────────────────────────────────

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Wann erhielt Borussia Dortmund nach dem Ende des Zweiten Weltkriegs die offizielle Wiederzulassung?",
        answerA = "Mai 1945",
        answerB = "Juli 1945",
        answerC = "Oktober 1945",
        answerD = "Januar 1946",
        correctAnswer = 1,
        explanation = "Borussia Dortmund erhielt im Juli 1945 die offizielle Wiederzulassung von den britischen Besatzungsbehörden. Der Verein musste zunächst sein Fortbestehen neu beantragen, da alle Vereine nach Kriegsende zunächst aufgelöst wurden.",
        difficulty = 5,
        funFact = "Dortmund lag in der britischen Besatzungszone – die britische Militärregierung genehmigte die Wiederzulassung des Vereins relativ zügig."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 14,
        questionText = "Wo fand im August 1945 das erste Nachkriegsspiel von Borussia Dortmund statt?",
        answerA = "Im Stadion Rote Erde",
        answerB = "Auf der Weißen Wiese",
        answerC = "Auf dem Borsigplatz-Gelände",
        answerD = "Im Hoeschpark",
        correctAnswer = 3,
        explanation = "Das erste Nachkriegsspiel von Borussia Dortmund fand im August 1945 im Hoeschpark statt – dem Sportgelände des Stahl- und Eisenwerks Hoesch, das trotz der Kriegszerstörungen bespielbar war.",
        difficulty = 5,
        funFact = "Das Stadion Rote Erde war nach dem Krieg zunächst beschädigt – der Hoeschpark bot eine pragmatische Alternative für die ersten Nachkriegsspiele."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 14,
        questionText = "Unter welcher Besatzungsmacht stand Dortmund nach dem Ende des Zweiten Weltkriegs?",
        answerA = "Amerikanische Besatzungszone",
        answerB = "Französische Besatzungszone",
        answerC = "Sowjetische Besatzungszone",
        answerD = "Britische Besatzungszone",
        correctAnswer = 3,
        explanation = "Dortmund und das Ruhrgebiet lagen in der britischen Besatzungszone. Die britische Militärregierung verwaltete den politischen und wirtschaftlichen Wiederaufbau der Region nach 1945.",
        difficulty = 5,
        funFact = "Der aus dem KZ befreite Fritz Henßler wurde unter britischer Aufsicht zum Oberbürgermeister Dortmunds – ein Symbol für den demokratischen Neuanfang."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Wie viele Menschen hatten in Dortmunds Ruinen nach Kriegsende 1945 ausgeharrt?",
        answerA = "Rund 500.000",
        answerB = "Rund 300.000",
        answerC = "Rund 150.000",
        answerD = "Rund 450.000",
        correctAnswer = 1,
        explanation = "Trotz schwerer Kriegszerstörungen hatten in Dortmunds Ruinen noch rund 300.000 Menschen ausgeharrt. Die Bevölkerungszahl erholte sich rasch: 1948 lebten bereits 450.000, 1950 rund 500.000 Menschen in der Stadt.",
        difficulty = 5,
        funFact = "Dortmund war eine der am stärksten bombardierten deutschen Städte – der rasche Wiederaufbau des BVB spiegelt den allgemeinen Erholungswillen der Bevölkerung wider."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 14,
        questionText = "Welchen Wirtschaftszweig nutzte Dortmund nach 1945 als Grundlage für den raschen Wiederaufbau?",
        answerA = "Textilindustrie und Handel",
        answerB = "Automobilindustrie und Maschinenbau",
        answerC = "Chemische Industrie und Pharmawesen",
        answerD = "Bergbau und Grundstoffindustrien des Ruhrgebiets",
        correctAnswer = 3,
        explanation = "Dortmund und das Ruhrgebiet profitierten nach 1945 massiv von der Bevorzugung der Grundstoffindustrien – insbesondere des Bergbaus. Die Kriegszerstörungen hatten nur wenige Zechen beschädigt, sodass der Betrieb bis Juni 1945 fast vollständig wieder aufgenommen werden konnte.",
        difficulty = 5,
        funFact = "Dieser wirtschaftliche Aufschwung schuf auch die Grundlage für den Fußball: Arbeitende Männer hatten wieder Zeit und Geld, um in die Stadien zu gehen."
    ),

    // ── DIE DREI ALFREDOS & 1950er MEISTERSCHAFTEN ───────────────────────────

    // correctAnswer = 0
    Question(
        categoryId = 14,
        questionText = "Wie lauteten die vollständigen Namen der drei Alfredos von Borussia Dortmund?",
        answerA = "Alfred Preißler, Alfred Niepieklo, Alfred Kelbassa",
        answerB = "Alfred Schmidt, Alfred Niepieklo, Alfred Preißler",
        answerC = "Alfred Kelbassa, Alfred Ritter, Alfred Preißler",
        answerD = "Alfred Niepieklo, Alfred Weber, Alfred Kelbassa",
        correctAnswer = 0,
        explanation = "Die drei Alfredos waren: Alfred 'Adi' Preißler, Alfred 'Nieplo' Niepieklo und Alfred 'Freddy' Kelbassa – alle drei trugen den gleichen Vornamen und bildeten das legendäre Sturm-Trio des BVB in den 1950ern.",
        difficulty = 5,
        funFact = "Ihre Spitznamen Adi, Nieplo und Freddy wurden nötig, um die drei Alfredos im Alltag auseinanderhalten zu können."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Wie viele Tore erzielte Alfred Preißler in seinen zwei BVB-Perioden insgesamt?",
        answerA = "124 Tore in 200 Spielen",
        answerB = "174 Tore in 270 Spielen",
        answerC = "122 Tore in 214 Spielen",
        answerD = "156 Tore in 245 Spielen",
        correctAnswer = 1,
        explanation = "Alfred Preißler erzielte in seinen beiden BVB-Perioden (1946–1949 und 1951–1959) insgesamt 174 Tore in 270 Spielen – eine herausragende Bilanz in der BVB-Geschichte.",
        difficulty = 5,
        funFact = "Preißler unterbrach seine BVB-Zeit von 1949 bis 1951 – seine Rückkehr war mitentscheidend für die Meisterschaften der 1950er Jahre."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Von wann bis wann spielte Alfred Niepieklo bei Borussia Dortmund und wie lautete seine Torbilanz?",
        answerA = "1948–1957, 98 Tore in 180 Spielen",
        answerB = "1951–1960, 124 Tore in 200 Spielen",
        answerC = "1950–1961, 110 Tore in 210 Spielen",
        answerD = "1953–1962, 135 Tore in 220 Spielen",
        correctAnswer = 1,
        explanation = "Alfred Niepieklo spielte von 1951 bis 1960 für Borussia Dortmund und erzielte dabei 124 Tore in 200 Spielen – mit seinem Spitznamen 'Nieplo' wurde er zur BVB-Legende.",
        difficulty = 5,
        funFact = "Niepieklo war der technisch versierteste der drei Alfredos – sein feines Gespür für den richtigen Moment machte ihn zum idealen Partner für den physisch starken Preißler."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 14,
        questionText = "Von wann bis wann spielte Alfred Kelbassa bei Borussia Dortmund und wie lautete seine Torbilanz?",
        answerA = "1952–1961, 108 Tore in 195 Spielen",
        answerB = "1950–1960, 115 Tore in 220 Spielen",
        answerC = "1956–1964, 98 Tore in 180 Spielen",
        answerD = "1954–1963, 122 Tore in 214 Spielen",
        correctAnswer = 3,
        explanation = "Alfred Kelbassa spielte von 1954 bis 1963 bei Borussia Dortmund und erzielte 122 Tore in 214 Spielen. Er war der letzte der drei Alfredos beim BVB und gewann zusätzlich noch die Meisterschaft 1963.",
        difficulty = 5,
        funFact = "Kelbassa begann seine BVB-Zeit erst 1954 – erst dann war das legendäre Trio komplett beisammen."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 14,
        questionText = "Gegen welchen Verein gewann Borussia Dortmund 1956 die Deutsche Meisterschaft im Finale und mit welchem Ergebnis?",
        answerA = "1. FC Kaiserslautern, 3:1",
        answerB = "Borussia Mönchengladbach, 5:2",
        answerC = "Hamburger SV, 2:0",
        answerD = "Karlsruher SC, 4:2",
        correctAnswer = 3,
        explanation = "Borussia Dortmund gewann die Deutsche Meisterschaft 1956 durch einen 4:2-Finalsieg gegen den Karlsruher SC. Die drei Alfredos schossen sieben der acht BVB-Tore in den beiden Finalspielen 1956 und 1957.",
        difficulty = 5,
        funFact = "Die Überlegenheit des BVB war so deutlich, dass zeitgenössische Sportjournalisten vermuteten, die Dortmunder trainierten unter Profi-Bedingungen – was damals verboten war."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Mit welchem Punktevorsprung gewann BVB die Meisterschaft der Saison 1955/56 und vor welchem Verein?",
        answerA = "3 Punkte vor Borussia Mönchengladbach",
        answerB = "4 Punkte vor FC Schalke 04",
        answerC = "6 Punkte vor Hamburger SV",
        answerD = "2 Punkte vor Rot-Weiss Essen",
        correctAnswer = 1,
        explanation = "In der Saison 1955/56 gewann Borussia Dortmund die Westdeutsche Meisterschaft mit einem Vorsprung von 4 Punkten auf FC Schalke 04 – mit einer Bilanz von 20 Siegen, 5 Unentschieden und 5 Niederlagen aus 30 Spielen.",
        difficulty = 5,
        funFact = "Dortmunds Torverhältnis von 78:36 in dieser Saison unterstreicht die enorme Offensivstärke der Mannschaft – fast drei Tore pro Spiel im Schnitt."
    ),

    // correctAnswer = 0
    Question(
        categoryId = 14,
        questionText = "Vor welchem Verein gewann der BVB die Meisterschaft der Saison 1956/57 und mit welchem Punktevorsprung?",
        answerA = "2 Punkte vor Duisburger SpV",
        answerB = "4 Punkte vor Schalke 04",
        answerC = "3 Punkte vor Hamburger SV",
        answerD = "5 Punkte vor Borussia Mönchengladbach",
        correctAnswer = 0,
        explanation = "Borussia Dortmund verteidigte die Meisterschaft 1956/57 souverän und gewann sie mit einem Vorsprung von 2 Punkten vor dem Duisburger SpV – mit einer Bilanz von 17 Siegen, 7 Unentschieden und 6 Niederlagen.",
        difficulty = 5,
        funFact = "Die Meistersaison 1956/57 war konditionell geprägt: BVB spielte in der zweiten Halbzeit meist stärker als der Gegner – was Beobachter zur Vermutung professioneller Trainingsmethoden verleitete."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 14,
        questionText = "Welchen Spitznamen trug Alfred Preißler bei Borussia Dortmund?",
        answerA = "Freddy",
        answerB = "Nieplo",
        answerC = "Adi",
        answerD = "Preisel",
        correctAnswer = 2,
        explanation = "Alfred Preißler trug den Spitznamen 'Adi' – um ihn von seinen Namensvettern Alfred Niepieklo ('Nieplo') und Alfred Kelbassa ('Freddy') zu unterscheiden.",
        difficulty = 5,
        funFact = "Preißlers Zitat 'Entscheidend is' auf'm Platz' wurde zum geflügelten Wort im deutschen Fußball."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 14,
        questionText = "Welchen Spitznamen trug Alfred Kelbassa bei Borussia Dortmund?",
        answerA = "Adi",
        answerB = "Nieplo",
        answerC = "Kella",
        answerD = "Freddy",
        correctAnswer = 3,
        explanation = "Alfred Kelbassa trug den Spitznamen 'Freddy' – um ihn von Alfred Preißler ('Adi') und Alfred Niepieklo ('Nieplo') zu unterscheiden.",
        difficulty = 5,
        funFact = "Kelbassa war der letzte der drei Alfredos, der zum BVB stieß (1954), und der einzige, der zusätzlich noch die Meisterschaft 1963 mit dem Verein gewann."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "In welchem Jahr begann Alfred Preißlers erste Spielzeit bei Borussia Dortmund?",
        answerA = "1943",
        answerB = "1946",
        answerC = "1948",
        answerD = "1951",
        correctAnswer = 1,
        explanation = "Alfred Preißler begann seine erste Spielzeit bei Borussia Dortmund im Jahr 1946 – also direkt nach dem Zweiten Weltkrieg. Damit war er der erste der drei Alfredos, der zum BVB stieß.",
        difficulty = 5,
        funFact = "Preißler erzielte in seiner ersten BVB-Periode bis 1949 bereits 24 Tore in einer einzigen Saison – eine Torquote, die ihn sofort zur Legende machte."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Was machte die Spielweise des BVB-Meisterteams der 1950er Jahre laut zeitgenössischen Berichten aus?",
        answerA = "Taktische Raffinesse und ein ausgeklügeltes Pressing",
        answerB = "Überragender Kampfgeist, Ausdauer und physische Überlegenheit in der Schlussphase",
        answerC = "Technisch verfeinertes Kurzpassspiel nach Schweizer Vorbild",
        answerD = "Schnelles Umschaltspiel nach frühen Ballgewinnen",
        correctAnswer = 1,
        explanation = "Das BVB-Meisterteam der 1950er war bekannt für Kampfgeist, Ausdauer und überwältigende Körperlichkeit. Die Kondition war so überragend, dass zeitgenössische Journalisten vermuteten, die Dortmunder trainierten unter professionellen Bedingungen.",
        difficulty = 5,
        funFact = "Im Amateurfußball jener Zeit war professionelles Training verboten – Dortmunds konditionelle Überlegenheit ließ Beobachter spekulieren, ob die Regeln eingehalten wurden."
    ),

    // ── VEREINSNAME, STANDORT & SYMBOLIK ─────────────────────────────────────

    // correctAnswer = 2
    Question(
        categoryId = 14,
        questionText = "In welchem Dortmunder Stadtteil bzw. an welchem bekannten Platz ist der BVB historisch verwurzelt?",
        answerA = "Hörde / Phoenixsee",
        answerB = "Eving / Zeche Minister Stein",
        answerC = "Borsigplatz / Nordstadt",
        answerD = "Aplerbeck / Kurpark",
        correctAnswer = 2,
        explanation = "Borussia Dortmund ist am Borsigplatz in der Dortmunder Nordstadt historisch verwurzelt – einem Arbeiterviertel, das von der Stahl- und Eisenproduktion geprägt war. Die Gründer kamen aus dieser Arbeitergemeinschaft.",
        difficulty = 5,
        funFact = "Der Borsigplatz gilt bis heute als 'heiliger Ort' der BVB-Geschichte – die Fankultur pflegt die Erinnerung an die proletarischen Ursprünge des Vereins."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Welche kirchliche Auseinandersetzung trieb die BVB-Gründer dazu, sich von ihrer Gemeinde zu lösen?",
        answerA = "Streit über Sonntagsspiele, die dem Kirchgang entgegenstanden",
        answerB = "Kaplan Dewald bekämpfte und diffamierte die Fußballer seit 1906 systematisch",
        answerC = "Die Kirche verlangte eine Gebühr für die Nutzung des Pfarrgeländes",
        answerD = "Der Pfarrer wollte Turnen statt Fußball durchsetzen",
        correctAnswer = 1,
        explanation = "Die späteren BVB-Gründer wurden seit 1906 von ihrer Kirche systematisch für ihr Fußballspielen bekämpft und diffamiert. Kaplan Dewald war der Hauptgegner – er versuchte sogar, die Gründungsversammlung 1909 aufzulösen.",
        difficulty = 5,
        funFact = "Die Trotzreaktion gegen kirchliche Bevormundung ist ein prägendes Element der frühen BVB-Identität – der Verein entstand buchstäblich aus Widerstand."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 14,
        questionText = "Welches Sportstadion ersetzte 1937 die 'Weiße Wiese' als Hauptspielstätte von Borussia Dortmund?",
        answerA = "Westfalenstadion",
        answerB = "Hoeschpark-Stadion",
        answerC = "Stadion Rote Erde",
        answerD = "Stadion am Borsigplatz",
        correctAnswer = 2,
        explanation = "Das Stadion Rote Erde ersetzte 1937 die 'Weiße Wiese' als Hauptspielstätte von Borussia Dortmund. Es war für Jahrzehnte die Heimat des BVB, bevor das Westfalenstadion 1974 gebaut wurde.",
        difficulty = 5,
        funFact = "Das Stadion Rote Erde existiert noch heute und steht direkt neben dem Signal Iduna Park – es dient heute als Trainings- und Jugendspielstätte."
    ),

    // ── WEITERE DETAILS & TIEFES VEREINSWISSEN ────────────────────────────────

    // correctAnswer = 2
    Question(
        categoryId = 14,
        questionText = "Wie viele der acht BVB-Tore in den beiden Finalspielen 1956 und 1957 erzielten die drei Alfredos?",
        answerA = "Alle acht",
        answerB = "Sechs von acht",
        answerC = "Sieben von acht",
        answerD = "Fünf von acht",
        correctAnswer = 2,
        explanation = "Die drei Alfredos (Preißler, Kelbassa und Niepieklo) schossen sieben der acht BVB-Tore in den beiden Finalspielen von 1956 und 1957 – eine beeindruckende Dominanz des legendären Sturm-Trios.",
        difficulty = 5,
        funFact = "In den Finalspielen erwiesen sich die drei Alfredos als die entscheidenden Männer – ihre Treffsicherheit im entscheidenden Moment machte den Unterschied."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 14,
        questionText = "Welche Meisterschaft gewann Alfred Kelbassa bei BVB zusätzlich zu den Titeln 1956 und 1957?",
        answerA = "1960",
        answerB = "1961",
        answerC = "1963",
        answerD = "1965",
        correctAnswer = 2,
        explanation = "Alfred Kelbassa gewann mit Borussia Dortmund nicht nur die Meisterschaften 1956 und 1957, sondern auch noch den Titel 1963 – als einziger der drei Alfredos erlebte er diesen dritten Meistertitel.",
        difficulty = 5,
        funFact = "Kelbassas Karriere beim BVB (1954–1963) umspannte eine der erfolgreichsten Perioden in der frühen Vereinsgeschichte."
    ),

    // correctAnswer = 0
    Question(
        categoryId = 14,
        questionText = "Welches detaillierte Torverhältnis erzielte der BVB in der Meistersaison 1955/56?",
        answerA = "78:36",
        answerB = "65:30",
        answerC = "85:42",
        answerD = "70:28",
        correctAnswer = 0,
        explanation = "In der Meistersaison 1955/56 erzielte BVB ein Torverhältnis von 78:36 aus 30 Spielen – eine Offensivleistung, die den Verein weit über die Konkurrenz stellte.",
        difficulty = 5,
        funFact = "78 Tore in 30 Spielen entsprechen einem Schnitt von 2,6 Toren pro Spiel – selbst nach modernen Maßstäben eine beeindruckende Offensivleistung."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 14,
        questionText = "Welches Buch über die BVB-Geschichte in der NS-Zeit erschien 2024 und von wem stammt es?",
        answerA = "'Der BVB und das Dritte Reich' von Hans-Joachim Weber",
        answerB = "'Borussia im Krieg' von Thomas Müller",
        answerC = "'Borussia Dortmund in der Zeit des Nationalsozialismus 1933–1945' von Rolf Fischer und Katharina Wojatzek",
        answerD = "'Schwarz-Gelb unterm Hakenkreuz' von Peter Schreiber",
        correctAnswer = 2,
        explanation = "Das 2024 im Metropol Verlag erschienene Buch 'Borussia Dortmund in der Zeit des Nationalsozialismus 1933–1945' von Rolf Fischer und Katharina Wojatzek ist die erste umfassende wissenschaftliche Aufarbeitung der Vereinsgeschichte in der NS-Zeit.",
        difficulty = 5,
        funFact = "Fischer und Wojatzek werteten zahlreiche bisher unveröffentlichte Dokumente und Fotografien aus – das Buch gilt als Standardwerk zur BVB-Geschichte in der NS-Zeit."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Welche Verbindung bestand zwischen Franz Hippler und Heinrich Czerkus beim BVB?",
        answerA = "Sie waren Trainer und Torhüter des gleichen Teams",
        answerB = "Sie teilten Leidenschaft für den BVB und kommunistische Überzeugung und wurden beide von den Nazis ermordet",
        answerC = "Hippler war Vorgesetzter von Czerkus in der Vereinsverwaltung",
        answerD = "Sie waren Spieler im gleichen Meisterteam der 1930er Jahre",
        correctAnswer = 1,
        explanation = "Franz Hippler und Heinrich Czerkus verband die Leidenschaft für Borussia Dortmund und ihre kommunistische Überzeugung – beide wurden von den Nazis in Dortmund ermordet und gelten heute als Märtyrer der BVB-Geschichte.",
        difficulty = 5,
        funFact = "Czerkus' und Hipplers Schicksal wird heute in der Gedenkstätte Rombergpark und durch den jährlichen Gedächtnislauf der BVB-Fanabteilung lebendig gehalten."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 14,
        questionText = "In welcher Straße befand sich die Gaststätte 'Zum Wildschütz', in der BVB gegründet wurde?",
        answerA = "Borsigstraße",
        answerB = "Hoeschstraße",
        answerC = "Oesterholzstraße",
        answerD = "Münsterstraße",
        correctAnswer = 2,
        explanation = "Die Gaststätte 'Zum Wildschütz', in der Borussia Dortmund am 19. Dezember 1909 gegründet wurde, befand sich auf der Oesterholzstraße 60 in Dortmund.",
        difficulty = 5,
        funFact = "Die Adresse Oesterholzstraße 60 ist ein historischer Pilgerort für BVB-Fans – hier begann die Geschichte des größten deutschen Fußballvereins nach Mitgliederzahl."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 14,
        questionText = "Welchen Beruf übte Franz Jacobi, der langjährige BVB-Vereinsvorsitzende, hauptberuflich aus?",
        answerA = "Bergmann bei der Zeche Dortmund",
        answerB = "Kaufmann im Textilhandel",
        answerC = "Hüttenbeamter in der Dortmunder Stahlindustrie",
        answerD = "Lehrmeister bei den Dortmunder Stadtwerken",
        correctAnswer = 2,
        explanation = "Franz Jacobi war von Beruf Hüttenbeamter in der Dortmunder Stahlindustrie – typisch für die Arbeitermilieu-Wurzeln des Vereins. Er verkörperte den proletarischen Charakter des frühen BVB.",
        difficulty = 5,
        funFact = "Jacobi kombinierte seine Arbeit in der Schwerindustrie mit dem Amt des Vereinsvorsitzenden – 13 Jahre lang ehrenamtlich, wie es damals selbstverständlich war."
    ),

    // correctAnswer = 2
    Question(
        categoryId = 14,
        questionText = "Wie viele Gründungsmitglieder von BVB 1909 trugen den Nachnamen Jacobi?",
        answerA = "Zwei (Franz und Julius)",
        answerB = "Vier (Franz, Julius, Wilhelm und Heinrich)",
        answerC = "Drei (Franz, Julius und Wilhelm)",
        answerD = "Einer (Franz)",
        correctAnswer = 2,
        explanation = "Drei Mitglieder der Familie Jacobi gehörten zu den 18 BVB-Gründern: Franz, Julius und Wilhelm Jacobi. Franz wurde der erste langjährige Vorsitzende, Julius fiel im Ersten Weltkrieg.",
        difficulty = 5,
        funFact = "Die drei Jacobi-Brüder repräsentierten die enge Familienbindung, die viele der Gründer miteinander verknüpfte – die Borussia war ein Gemeinschaftsprojekt."
    ),

    // correctAnswer = 1
    Question(
        categoryId = 14,
        questionText = "Welche Aussage über die Nachkriegs-Wiederzulassung des BVB 1945 ist korrekt?",
        answerA = "BVB erhielt als erster Verein im Ruhrgebiet die Wiederzulassung bereits im Mai 1945",
        answerB = "Der Verein musste zunächst seine Wiederzulassung von den Besatzungsbehörden erwirken – diese kam im Juli 1945",
        answerC = "BVB durfte nach dem Krieg nur unter neuem Namen weiterspielen",
        answerD = "Die Wiederzulassung wurde erst 1946 durch den DFB erteilt",
        correctAnswer = 1,
        explanation = "Der BVB hatte nach dem Krieg einen Großteil seiner Spieler und Funktionäre verloren und musste zunächst seine Wiederzulassung von den britischen Besatzungsbehörden erwirken. Diese erfolgte im Juli 1945.",
        difficulty = 5,
        funFact = "Die rasche Wiederzulassung im Juli 1945 – nur zwei Monate nach Kriegsende – zeigt, wie sehr der BVB bereits als fester Bestandteil des Dortmunder Stadtlebens galt."
    ),

    // correctAnswer = 0
    Question(
        categoryId = 14,
        questionText = "Welches Torverhältnis erzielte der BVB in der Meistersaison 1956/57?",
        answerA = "73:33",
        answerB = "65:28",
        answerC = "80:40",
        answerD = "58:25",
        correctAnswer = 0,
        explanation = "In der Meistersaison 1956/57 erzielte Borussia Dortmund ein Torverhältnis von 73:33 – mehr als doppelt so viele Tore erzielt wie kassiert, ein Zeichen der klaren Dominanz.",
        difficulty = 5,
        funFact = "In den beiden Meistersaisons 1955/56 und 1956/57 schossen die drei Alfredos zusammen einen Großteil der BVB-Tore – Preißler allein traf in manchen Spielen mehrfach."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 14,
        questionText = "Welche militärische Einheit befreite Dortmund am Ende des Zweiten Weltkriegs, kurz nachdem Czerkus und Hippler ermordet worden waren?",
        answerA = "Britische Truppen",
        answerB = "Französische Truppen",
        answerC = "Sowjetische Truppen",
        answerD = "Amerikanische Truppen",
        correctAnswer = 3,
        explanation = "Amerikanische Truppen befreiten Dortmund kurz nach der Ermordung von Czerkus (15. April 1945) und Hippler (20. April 1945). Die beiden BVB-Mitglieder wurden also buchstäblich in den letzten Tagen vor der Befreiung ermordet.",
        difficulty = 5,
        funFact = "Die Nähe zwischen dem Mord und der Befreiung macht die Tragödie besonders bitter – Czerkus und Hippler überlebten den Krieg nicht mehr um wenige Tage."
    ),

    // correctAnswer = 3
    Question(
        categoryId = 14,
        questionText = "Welches Zitat von Alfred Preißler wurde zum geflügelten Wort im deutschen Fußball?",
        answerA = "\"Der Ball ist rund, das Spiel dauert 90 Minuten.\"",
        answerB = "\"Wir kämpfen bis zum letzten Atemzug.\"",
        answerC = "\"Der BVB ist mehr als ein Verein.\"",
        answerD = "\"Entscheidend is' auf'm Platz.\"",
        correctAnswer = 3,
        explanation = "Alfred 'Adi' Preißler, BVB-Legende und einer der drei Alfredos, prägte das geflügelte Wort 'Entscheidend is' auf'm Platz' – ein Satz, der im deutschen Fußball bis heute nachhallt.",
        difficulty = 5,
        funFact = "Das Zitat in Dortmunder Mundart unterstreicht den bodenständigen, proletarischen Charakter des BVB und seiner Helden der 1950er Jahre."
    )

)
