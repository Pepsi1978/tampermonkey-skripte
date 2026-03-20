package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun dortmundQuestionsMaster5(): List<Question> = listOf(

    // --- Michael Zorc – Rekordspieler (correctAnswer = 0) ---

    Question(
        categoryId = 14,
        questionText = "Wie viele Pflichtspiele absolvierte Michael Zorc insgesamt in seiner Karriere für Borussia Dortmund?",
        answerA = "572 Pflichtspiele",
        answerB = "541 Pflichtspiele",
        answerC = "498 Pflichtspiele",
        answerD = "603 Pflichtspiele",
        correctAnswer = 0,
        explanation = "Michael Zorc bestritt zwischen 1981 und 1998 exakt 572 Pflichtspiele für Borussia Dortmund und ist damit unangefochtener Rekordspieler des Vereins.",
        difficulty = 5,
        funFact = "Zorc verbrachte 44 Jahre seines Lebens beim BVB – zunächst als Spieler (17 Saisons), dann als Sportdirektor bis 2022."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele Bundesliga-Einsätze absolvierte Michael Zorc ausschließlich in der Bundesliga für Borussia Dortmund – ein Vereinsrekord?",
        answerA = "419 Einsätze",
        answerB = "463 Einsätze",
        answerC = "488 Einsätze",
        answerD = "437 Einsätze",
        correctAnswer = 1,
        explanation = "Michael Zorc absolvierte 463 Bundesliga-Spiele allein für Borussia Dortmund – ein Vereinsrekord, der bis heute Bestand hat.",
        difficulty = 5,
        funFact = "Kein anderer Spieler steht dem BVB in der Bundesliga-Statistik näher: Zorc spielte von 1981 bis 1998 für den Verein, ohne je zu einem anderen Club zu wechseln."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele Tore erzielte Michael Zorc in seiner gesamten BVB-Karriere?",
        answerA = "141 Tore",
        answerB = "172 Tore",
        answerC = "159 Tore",
        answerD = "127 Tore",
        correctAnswer = 2,
        explanation = "Michael Zorc traf in seiner gesamten Karriere für Borussia Dortmund 159 Mal – er ist damit nach Adi Preißler der zweitbeste Torschütze in der BVB-Geschichte.",
        difficulty = 5,
        funFact = "Zorc war bekannt für seine präzisen Elfmeter: Von 57 angetretenen Elfmetern traf er 49 Mal – eine Quote, die selbst für Spezialisten außergewöhnlich hoch ist."
    ),

    // --- Adi Preißler – Rekordtorschütze (correctAnswer = 1) ---

    Question(
        categoryId = 14,
        questionText = "Wie viele Tore erzielte Adi Preißler für Borussia Dortmund und ist damit Rekordtorschütze des Vereins?",
        answerA = "177 Tore",
        answerB = "163 Tore",
        answerC = "191 Tore",
        answerD = "155 Tore",
        correctAnswer = 0,
        explanation = "Adi Preißler erzielte in seiner Zeit bei Borussia Dortmund 177 Tore und ist damit der Rekordtorschütze in der gesamten Vereinsgeschichte des BVB.",
        difficulty = 5,
        funFact = "Preißler spielte von 1952 bis 1959 für den BVB – eine Zeit, in der es noch keine Bundesliga gab. Er ist für sein Zitat bekannt: 'Grau ist alle Theorie – entscheidend is auf'm Platz.'"
    ),

    Question(
        categoryId = 14,
        questionText = "Wer ist nach Adi Preißler und vor Michael Zorc der zweitbeste Torschütze in der Geschichte von Borussia Dortmund?",
        answerA = "Manfred Burgsmüller mit 135 Toren",
        answerB = "Stefan Klos mit 112 Toren",
        answerC = "August Lenz mit 148 Toren",
        answerD = "Marco Reus mit 170 Toren",
        correctAnswer = 3,
        explanation = "Marco Reus erzielte in seiner langen BVB-Karriere 170 Tore und ist damit nach Adi Preißler (177 Tore) der zweitbeste Torschütze in der Vereinsgeschichte, noch vor Michael Zorc (159 Tore).",
        difficulty = 5,
        funFact = "Marco Reus spielte 16 Jahre (2012–2024) für Borussia Dortmund, wurde 2018 Kapitän und blieb dem Verein trotz vieler Angebote von Top-Klubs treu."
    ),

    // --- Ousmane Dembélé – Rekordtransfer (correctAnswer = 2) ---

    Question(
        categoryId = 14,
        questionText = "Für welche Grundablösesumme (ohne Boni) wechselte Ousmane Dembélé 2017 vom BVB zum FC Barcelona?",
        answerA = "95 Millionen Euro",
        answerB = "120 Millionen Euro",
        answerC = "105 Millionen Euro",
        answerD = "135 Millionen Euro",
        correctAnswer = 2,
        explanation = "Ousmane Dembélé wechselte im August 2017 für eine Grundablöse von 105 Millionen Euro vom BVB zum FC Barcelona – der bis dahin teuerste Transfer in der Geschichte der Bundesliga.",
        difficulty = 5,
        funFact = "Dembélé spielte nur eine einzige Saison in Dortmund, bevor er für eine dreistellige Ablösesumme verkauft wurde – ein beispielloser Wertzuwachs in so kurzer Zeit."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie hoch war die maximale Gesamtablöse (Grundsumme + alle Boni), die Borussia Dortmund von Barcelona für Ousmane Dembélé erhalten konnte?",
        answerA = "125 Millionen Euro",
        answerB = "133 Millionen Euro",
        answerC = "140 Millionen Euro",
        answerD = "148 Millionen Euro",
        correctAnswer = 3,
        explanation = "Borussia Dortmund erhielt für Ousmane Dembélé eine Grundablöse von 105 Millionen Euro sowie Bonuszahlungen, die sich auf maximal 148 Millionen Euro addierten – und kassierte laut Berichten die komplette Summe.",
        difficulty = 5,
        funFact = "Sieben Jahre nach dem Transfer bestätigte Borussia Dortmund, die maximale Ablöse von 148 Millionen Euro vollständig erhalten zu haben – die letzte Bonuszahlung kam 2024."
    ),

    Question(
        categoryId = 14,
        questionText = "Von welchem Verein wechselte Ousmane Dembélé im Sommer 2016 zu Borussia Dortmund?",
        answerA = "Olympique Lyon",
        answerB = "AS Saint-Étienne",
        answerC = "FC Nantes",
        answerD = "Stade Rennes",
        correctAnswer = 3,
        explanation = "Ousmane Dembélé wechselte im Sommer 2016 für 15 Millionen Euro von Stade Rennes zu Borussia Dortmund – und wurde nur ein Jahr später für 105 Millionen Euro zu Barcelona verkauft.",
        difficulty = 5,
        funFact = "Dembélé wurde in Rennes entdeckt und galt schon als 18-Jähriger als eines der größten Talente Frankreichs. Die Wertsteigerung von 15 auf 105 Millionen in zwölf Monaten ist bis heute einzigartig."
    ),

    // --- Jude Bellingham – Transfer zu Real Madrid (correctAnswer = 3) ---

    Question(
        categoryId = 14,
        questionText = "Für welche Grundablösesumme wechselte Jude Bellingham im Sommer 2023 vom BVB zu Real Madrid?",
        answerA = "88 Millionen Euro",
        answerB = "95 Millionen Euro",
        answerC = "117 Millionen Euro",
        answerD = "103 Millionen Euro",
        correctAnswer = 3,
        explanation = "Jude Bellingham wechselte im Juni 2023 für eine Grundablöse von 103 Millionen Euro von Borussia Dortmund zu Real Madrid – inklusive Boni konnte der Betrag auf rund 133 Millionen ansteigen.",
        difficulty = 5,
        funFact = "Bellingham debütierte für Real Madrid mit einem überragenden Start: In seiner ersten La-Liga-Saison erzielte er 19 Ligatore und führte Real zur Meisterschaft sowie zum Champions-League-Titel."
    ),

    Question(
        categoryId = 14,
        questionText = "Von welchem englischen Verein wechselte Jude Bellingham im Sommer 2020 zu Borussia Dortmund?",
        answerA = "Manchester City",
        answerB = "Birmingham City",
        answerC = "Aston Villa",
        answerD = "Wolverhampton Wanderers",
        correctAnswer = 1,
        explanation = "Jude Bellingham wechselte im Sommer 2020 im Alter von 17 Jahren für 25 Millionen Euro von Birmingham City zu Borussia Dortmund – eine der klügsten Investitionen des BVB überhaupt.",
        difficulty = 5,
        funFact = "Bellingham war zum Zeitpunkt seines Wechsels 17 Jahre alt und hatte für Birmingham City bereits 44 Pflichtspiele absolviert. Mehrere Topklubs buhlten um ihn, doch er wählte den BVB."
    ),

    // --- Erling Haaland – Tore und Transfer (correctAnswer = 0) ---

    Question(
        categoryId = 14,
        questionText = "Wie viele Tore erzielte Erling Haaland in insgesamt 89 Pflichtspielen für Borussia Dortmund?",
        answerA = "86 Tore",
        answerB = "79 Tore",
        answerC = "93 Tore",
        answerD = "71 Tore",
        correctAnswer = 0,
        explanation = "Erling Haaland erzielte in zweieinhalb Saisons beim BVB (Januar 2020 – Juni 2022) in 89 Pflichtspielen unglaubliche 86 Tore – eine Quote von fast einem Tor pro Spiel.",
        difficulty = 5,
        funFact = "Haaland erzielte am 18. September 2019 in seiner ersten Champions-League-Saison für RB Salzburg gegen Genk drei Tore – und unterschrieb nur drei Monate später beim BVB."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie hoch war die Ausstiegsklausel, über die Erling Haaland im Sommer 2022 zu Manchester City wechseln konnte?",
        answerA = "75 Millionen Euro",
        answerB = "85 Millionen Euro",
        answerC = "60 Millionen Euro",
        answerD = "50 Millionen Euro",
        correctAnswer = 2,
        explanation = "Erling Haaland wechselte im Sommer 2022 über eine im Vertrag festgeschriebene Ausstiegsklausel von 60 Millionen Euro zu Manchester City – ein für seine Leistungen außergewöhnlich niedriger Betrag.",
        difficulty = 5,
        funFact = "Manchester City aktivierte die Klausel im Mai 2022 und sicherte sich damit einen Spieler, der in seiner ersten Premier-League-Saison 36 Ligatore erzielte – ein neuer Rekord in der Geschichte der Premier League."
    ),

    Question(
        categoryId = 14,
        questionText = "Von welchem Verein wechselte Erling Haaland im Januar 2020 zu Borussia Dortmund?",
        answerA = "Molde FK",
        answerB = "FC Salzburg",
        answerC = "Viking FK",
        answerD = "FC Brügge",
        correctAnswer = 1,
        explanation = "Erling Haaland wechselte im Januar 2020 für 20 Millionen Euro vom österreichischen Klub FC Salzburg zu Borussia Dortmund, wo er zuvor bereits in der Champions-League-Gruppenphase mit 8 Toren geglänzt hatte.",
        difficulty = 5,
        funFact = "Haaland debütierte am 18. Januar 2020 für den BVB gegen FC Augsburg und traf dreimal als Einwechselspieler – eines der spektakulärsten Debüts in der Bundesliga-Geschichte."
    ),

    // --- Nuri Sahin – Jüngster Bundesliga-Spieler (correctAnswer = 1) ---

    Question(
        categoryId = 14,
        questionText = "Mit wie vielen Jahren und Tagen debütierte Nuri Sahin am 6. August 2005 für den BVB und stellte damit den damaligen Bundesliga-Jüngsten-Rekord auf?",
        answerA = "16 Jahren und 334 Tagen",
        answerB = "16 Jahren und 298 Tagen",
        answerC = "17 Jahren und 12 Tagen",
        answerD = "16 Jahren und 315 Tagen",
        correctAnswer = 0,
        explanation = "Nuri Sahin debütierte am 6. August 2005 im Alter von 16 Jahren und 334 Tagen in der Bundesliga für Borussia Dortmund gegen den VfL Wolfsburg und wurde damit zum jüngsten Spieler in der Bundesliga-Geschichte – ein Rekord, der erst 2020 gebrochen wurde.",
        difficulty = 5,
        funFact = "Sahin gratulierte später sportlich dem neuen Rekordhalter Youssoufa Moukoko, der seinen Rekord im November 2020 überbot. Beide verbindet eine lange BVB-Karriere."
    ),

    Question(
        categoryId = 14,
        questionText = "Gegen welchen Verein debütierte Nuri Sahin am 6. August 2005 als jüngster Bundesliga-Spieler der Geschichte für den BVB?",
        answerA = "Bayer Leverkusen",
        answerB = "Hamburger SV",
        answerC = "VfL Wolfsburg",
        answerD = "Hertha BSC",
        correctAnswer = 2,
        explanation = "Nuri Sahin gab sein Bundesliga-Debüt am 6. August 2005 gegen den VfL Wolfsburg – mit nur 16 Jahren und 334 Tagen der jüngste Bundesliga-Spieler der Geschichte bis zum November 2020.",
        difficulty = 5,
        funFact = "Sahin war ein BVB-Jugendprodukt und als Ballkind beim BVB-Meistertitel 2002 dabei. Mit dem Klopp-Team gewann er 2011 selbst die Meisterschaft."
    ),

    // --- Youssoufa Moukoko – Jüngster Spieler und Torschütze (correctAnswer = 2) ---

    Question(
        categoryId = 14,
        questionText = "Am welchem Datum debütierte Youssoufa Moukoko als jüngster Bundesliga-Spieler der Geschichte für den BVB?",
        answerA = "20. November 2020",
        answerB = "28. November 2020",
        answerC = "21. November 2020",
        answerD = "14. November 2020",
        correctAnswer = 2,
        explanation = "Youssoufa Moukoko debütierte am 21. November 2020 – seinem Tag nach seinem 16. Geburtstag am 20. November – für Borussia Dortmund und wurde mit 16 Jahren und 1 Tag zum jüngsten Bundesliga-Spieler der Geschichte.",
        difficulty = 5,
        funFact = "Moukoko betrat in den letzten fünf Minuten als Einwechselspieler für Erling Haaland das Feld. Der Umstand, dass er einen Tag nach seinem Geburtstag spielte, sorgte weltweit für Aufmerksamkeit."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie alt war Youssoufa Moukoko, als er sein erstes Bundesliga-Tor erzielte und damit zum jüngsten Torschützen der Liga-Geschichte wurde?",
        answerA = "16 Jahre und 1 Tag",
        answerB = "16 Jahre und 15 Tage",
        answerC = "16 Jahre und 28 Tage",
        answerD = "16 Jahre und 41 Tage",
        correctAnswer = 2,
        explanation = "Youssoufa Moukoko erzielte am 18. Dezember 2020 beim 2:1-Sieg gegen Union Berlin sein erstes Bundesliga-Tor und war zu diesem Zeitpunkt 16 Jahre und 28 Tage alt – jüngster Torschütze in der Bundesliga-Geschichte.",
        difficulty = 5,
        funFact = "Moukoko traf in der 60. Minute zum zwischenzeitlichen 1:1 bei Union Berlin. Er überholte damit Florian Wirtz als jüngsten Bundesliga-Torschützen – ein Rekord der davor jahrelang von Nuri Sahin gehalten worden war."
    ),

    // --- Christian Pulisic – Eigengewächs und Transfer (correctAnswer = 3) ---

    Question(
        categoryId = 14,
        questionText = "Für welche Ablösesumme wechselte Christian Pulisic im Januar 2019 vom BVB zum FC Chelsea?",
        answerA = "45 Millionen Euro",
        answerB = "52 Millionen Euro",
        answerC = "58 Millionen Euro",
        answerD = "64 Millionen Euro",
        correctAnswer = 3,
        explanation = "Christian Pulisic wechselte im Januar 2019 für 64 Millionen Euro von Borussia Dortmund zum FC Chelsea – der teuerste Transfer eines US-amerikanischen Spielers in der Geschichte.",
        difficulty = 5,
        funFact = "Pulisic zog mit 15 Jahren aus Pennsylvania nach Dortmund, um in der BVB-Akademie zu trainieren. Er gewann 2021 mit Chelsea die Champions League – als erster US-Amerikaner, der diesen Titel gewann."
    ),

    Question(
        categoryId = 14,
        questionText = "Mit wie vielen Jahren debütierte Christian Pulisic in der Bundesliga für Borussia Dortmund und wurde damit der jüngste US-Amerikaner in der Liga-Geschichte?",
        answerA = "16 Jahren",
        answerB = "15 Jahren",
        answerC = "17 Jahren",
        answerD = "18 Jahren",
        correctAnswer = 2,
        explanation = "Christian Pulisic debütierte am 30. Januar 2016 im Alter von 17 Jahren in der Bundesliga für Borussia Dortmund – der jüngste US-Amerikaner, der je in der Bundesliga gespielt hat.",
        difficulty = 5,
        funFact = "Pulisic wurde im amerikanischen Hershey, Pennsylvania geboren und entschied sich als Teenager, nach Dortmund zu ziehen – obwohl namhafte US-Klubs und auch britische Vereine an ihm interessiert waren."
    ),

    // --- Mario Götze – Eigengewächs und Weltmeistertor (correctAnswer = 0) ---

    Question(
        categoryId = 14,
        questionText = "In welchem Alter trat Mario Götze der Jugendakademie von Borussia Dortmund bei?",
        answerA = "Neun Jahren",
        answerB = "Elf Jahren",
        answerC = "Zwölf Jahren",
        answerD = "Sieben Jahren",
        correctAnswer = 0,
        explanation = "Mario Götze trat im Alter von nur neun Jahren der Jugendakademie von Borussia Dortmund bei und durchlief alle Nachwuchsstufen des Vereins bis zum Profi-Debüt im November 2009.",
        difficulty = 5,
        funFact = "Götze erzielte am 21. November 2009 gegen den FSV Mainz 05 sein Profi-Debüt im Alter von 17 Jahren und wurde danach direkt in die Bundesliga-Stammelf von Jürgen Klopp integriert."
    ),

    Question(
        categoryId = 14,
        questionText = "Für welche Ablösesumme wechselte Mario Götze im Sommer 2013 von Borussia Dortmund zu Bayern München?",
        answerA = "30 Millionen Euro",
        answerB = "32 Millionen Euro",
        answerC = "37 Millionen Euro",
        answerD = "42 Millionen Euro",
        correctAnswer = 2,
        explanation = "Mario Götze wechselte im Sommer 2013 für 37 Millionen Euro von Borussia Dortmund zu Bayern München – der zu diesem Zeitpunkt teuerste Transfer innerhalb der Bundesliga-Geschichte.",
        difficulty = 5,
        funFact = "Der Transfer wurde mitten in der Champions-League-Halbfinalsaison bekanntgegeben, was BVB-Fans und Trainer Jürgen Klopp gleichermaßen schockierte. Der BVB erreichte trotzdem das Finale – und verlor gegen Bayern."
    ),

    // --- Lars Ricken – CL-Finale 1997 (correctAnswer = 1) ---

    Question(
        categoryId = 14,
        questionText = "Lars Ricken erzielte das 3:1 im Champions-League-Finale 1997 gegen Juventus Turin. Welche besondere Umstand machte dieses Tor so legendär?",
        answerA = "Es war sein erstes Profitor überhaupt",
        answerB = "Es fiel mit seinem ersten Ballkontakt nach der Einwechslung",
        answerC = "Er schoss mit links, obwohl er Rechtsfuß war",
        answerD = "Er war noch nicht volljährig",
        correctAnswer = 1,
        explanation = "Lars Rickens 3:1 im Champions-League-Finale 1997 gegen Juventus Turin fiel mit seinem allerersten Ballkontakt nach der Einwechslung – ein Chip-Schuss aus 20 Metern über Keeper Peruzzi hinweg.",
        difficulty = 5,
        funFact = "Ricken hatte während der Halbzeit auf der Bank beobachtet, dass Juventus-Keeper Peruzzi weit vor seinem Tor stand. Er nutzte dieses Wissen 16 Sekunden nach seiner Einwechslung mit einem perfekten Lobball."
    ),

    // --- Mats Hummels – Transfer und Rückkehr (correctAnswer = 3) ---

    Question(
        categoryId = 14,
        questionText = "Für welche Ablösesumme wechselte Mats Hummels im Sommer 2016 von Borussia Dortmund zu Bayern München?",
        answerA = "25 Millionen Euro",
        answerB = "28 Millionen Euro",
        answerC = "31 Millionen Euro",
        answerD = "35 Millionen Euro",
        correctAnswer = 3,
        explanation = "Mats Hummels wechselte im Sommer 2016 für 35 Millionen Euro von Borussia Dortmund zu Bayern München – drei Jahre später kehrte er für eine ähnliche Summe zum BVB zurück.",
        difficulty = 5,
        funFact = "Hummels spielte für beide Erzrivalen der Bundesliga und gewann mit Bayern die Meisterschaft, bevor er 2019 zu seinen BVB-Wurzeln zurückkehrte. Am Ende seiner Karriere wechselte er zu AS Roma."
    ),

    Question(
        categoryId = 14,
        questionText = "In welcher Saison überholte Mats Hummels Michael Zorc als BVB-Rekordspieler bei den Bundesliga-Einsätzen?",
        answerA = "Saison 2020/21",
        answerB = "Saison 2021/22",
        answerC = "Saison 2022/23",
        answerD = "Saison 2019/20",
        correctAnswer = 2,
        explanation = "In der Saison 2022/23 übertraf Mats Hummels mit seinen Bundesliga-Einsätzen für den BVB die Marke von Michael Zorc und wurde damit zum neuen Rekordspieler des Vereins in der Bundesliga.",
        difficulty = 5,
        funFact = "Hummels spielte insgesamt zwei Amtszeiten beim BVB (2008–2016 und 2019–2024) und bestritt dabei mehr Bundesliga-Partien im BVB-Trikot als jeder andere Spieler in der Vereinsgeschichte."
    ),

    // --- Ilkay Gündogan – Transfer und Karriere (correctAnswer = 0) ---

    Question(
        categoryId = 14,
        questionText = "Für welche Ablösesumme wechselte Ilkay Gündogan im Sommer 2016 vom BVB zu Manchester City?",
        answerA = "25 Millionen Euro",
        answerB = "18 Millionen Euro",
        answerC = "32 Millionen Euro",
        answerD = "21 Millionen Euro",
        correctAnswer = 0,
        explanation = "Ilkay Gündogan wechselte im Sommer 2016 für 25 Millionen Euro von Borussia Dortmund zu Manchester City, wo er acht Saisons verbrachte und 2023 das Champions-League-Triple gewann.",
        difficulty = 5,
        funFact = "Im Champions-League-Finale 2023 gegen Inter Mailand erzielte Gündogan das Führungstor für Manchester City – fast auf den Tag genau sieben Jahre nach seinem Abschied vom BVB."
    ),

    // --- Robert Lewandowski – Ablösefrei und Tore (correctAnswer = 1) ---

    Question(
        categoryId = 14,
        questionText = "Wie viele Bundesliga-Tore erzielte Robert Lewandowski in seinen vier Jahren (2010–2014) für Borussia Dortmund?",
        answerA = "66 Tore",
        answerB = "74 Tore",
        answerC = "58 Tore",
        answerD = "81 Tore",
        correctAnswer = 1,
        explanation = "Robert Lewandowski erzielte in seinen vier Bundesliga-Saisons für Borussia Dortmund 74 Tore in 131 Spielen und war damit einer der treffsichersten Stürmer der Liga.",
        difficulty = 5,
        funFact = "Lewandowski wechselte 2014 ablösefrei zu Bayern München – der BVB erhielt keinen Cent für einen der besten Stürmer Europas, weil er seinen Vertrag nicht verlängerte."
    ),

    Question(
        categoryId = 14,
        questionText = "Wie viele Tore erzielte Robert Lewandowski am 22. September 2015 als Joker für Bayern München gegen den VfL Wolfsburg – ein Weltrekord?",
        answerA = "Drei Tore in 6 Minuten",
        answerB = "Fünf Tore in 9 Minuten",
        answerC = "Vier Tore in 7 Minuten",
        answerD = "Sechs Tore in 12 Minuten",
        correctAnswer = 1,
        explanation = "Robert Lewandowski – der ehemalige BVB-Stürmer – erzielte am 22. September 2015 als Einwechselspieler für Bayern München fünf Tore in nur neun Minuten gegen den VfL Wolfsburg – ein Weltrekord.",
        difficulty = 5,
        funFact = "Lewandowski saß in der Halbzeit noch auf der Ersatzbank beim 0:1-Rückstand. In der zweiten Halbzeit, eingewechselt in der 51. Minute, erzielte er zwischen der 51. und 60. Minute fünf Treffer."
    ),

    // --- Pierre-Emerick Aubameyang – Torschützenkönig (correctAnswer = 2) ---

    Question(
        categoryId = 14,
        questionText = "Wie viele Tore erzielte Pierre-Emerick Aubameyang in der Saison 2016/17, als er Bundesliga-Torschützenkönig wurde?",
        answerA = "28 Tore",
        answerB = "29 Tore",
        answerC = "34 Tore",
        answerD = "31 Tore",
        correctAnswer = 3,
        explanation = "Pierre-Emerick Aubameyang erzielte in der Bundesliga-Saison 2016/17 für Borussia Dortmund 31 Tore in 32 Spielen und gewann damit die Torjägerkanone als bester Schütze der Liga.",
        difficulty = 5,
        funFact = "Aubameyang wurde bei der Verleihung der Torjägerkanone in einem Batmankostüm gesehen – er ist bekannt für seine Vorliebe für Superhelden-Masken, die er auch nach Toren manchmal trug."
    ),

    Question(
        categoryId = 14,
        questionText = "Für welche Ablösesumme wechselte Pierre-Emerick Aubameyang im Januar 2018 vom BVB zum FC Arsenal?",
        answerA = "55 Millionen Euro",
        answerB = "63 Millionen Euro",
        answerC = "57 Millionen Euro",
        answerD = "49 Millionen Euro",
        correctAnswer = 1,
        explanation = "Pierre-Emerick Aubameyang wechselte im Wintertransferfenster Januar 2018 für 63,75 Millionen Euro von Borussia Dortmund zum FC Arsenal – ein BVB-Abgangsrekord zum damaligen Zeitpunkt.",
        difficulty = 5,
        funFact = "Arsenal zahlte für Aubameyang mehr als jeder andere Verein zuvor für einen BVB-Abgang – und das im Januar-Transferfenster, was vergleichsweise selten für derart hohe Summen ist."
    ),

    // --- Henrikh Mkhitaryan – Transfer (correctAnswer = 3) ---

    Question(
        categoryId = 14,
        questionText = "Für welche Ablösesumme wechselte Henrikh Mkhitaryan im Sommer 2016 vom BVB zu Manchester United?",
        answerA = "27 Millionen Euro",
        answerB = "32 Millionen Euro",
        answerC = "38 Millionen Euro",
        answerD = "42 Millionen Euro",
        correctAnswer = 3,
        explanation = "Henrikh Mkhitaryan wechselte im Sommer 2016 für 42 Millionen Euro von Borussia Dortmund zu Manchester United unter Trainer José Mourinho.",
        difficulty = 5,
        funFact = "Mkhitaryan absolvierte unter Jürgen Klopp beim BVB seine beste Karrierephase. Unter Mourinho lief er zunächst nicht auf, wurde dann aber gegen Alexis Sánchez zu Arsenal weitertransferiert."
    ),

    // --- Marco Reus – Kapitän und Treue (correctAnswer = 0) ---

    Question(
        categoryId = 14,
        questionText = "In welchem Jahr übernahm Marco Reus die Kapitänsbinde bei Borussia Dortmund?",
        answerA = "2018",
        answerB = "2016",
        answerC = "2020",
        answerD = "2014",
        correctAnswer = 0,
        explanation = "Marco Reus übernahm 2018 die Kapitänsbinde bei Borussia Dortmund als Nachfolger von Marcel Schmelzer und trug die Binde bis zu seinem Abschied im Sommer 2024.",
        difficulty = 5,
        funFact = "Reus spielte insgesamt 12 Jahre für Borussia Dortmund (2012–2024) und lehnte mehrfach lukrativere Angebote ab, um dem Verein treu zu bleiben – ein in der modernen Fußballwelt seltenes Phänomen."
    ),

    Question(
        categoryId = 14,
        questionText = "Von welchem Verein wechselte Marco Reus im Sommer 2012 zu Borussia Dortmund?",
        answerA = "Rot-Weiss Essen",
        answerB = "FC Schalke 04",
        answerC = "Borussia Mönchengladbach",
        answerD = "Bayer Leverkusen",
        correctAnswer = 2,
        explanation = "Marco Reus wechselte im Sommer 2012 für 17,1 Millionen Euro von Borussia Mönchengladbach zu Borussia Dortmund – und war dort bei seiner Ausbildung schon als Kind gewesen, bevor er zur Jugend von Mönchengladbach wechselte.",
        difficulty = 5,
        funFact = "Reus wurde in Dortmund geboren und trainierte in jungen Jahren tatsächlich bei Borussia Dortmund, bevor er zur Jugend von Mönchengladbach wechselte. Seine Rückkehr 2012 war also eine Heimkehr."
    ),

    // --- Rückennummern-Geschichte (correctAnswer = 1) ---

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler trägt in der Saison 2024/25 die legendäre Rückennummer 10?",
        answerA = "Donyell Malen",
        answerB = "Julian Brandt",
        answerC = "Karim Adeyemi",
        answerD = "Felix Nmecha",
        correctAnswer = 1,
        explanation = "Julian Brandt trägt in der Saison 2024/25 die Rückennummer 10 bei Borussia Dortmund – eine Nummer, die zuletzt von Mario Götze (bis 2016/17) und zuvor von Tomas Rosicky und Andreas Möller getragen wurde.",
        difficulty = 5,
        funFact = "Feste Rückennummern für die gesamte Saison gibt es in der Bundesliga erst seit der Spielzeit 1995/96. Zuvor wurde die Nummer 10 in jedem Spiel neu vergeben, meistens an den Zehner oder den kreativsten Mittelfeldspieler."
    ),

    Question(
        categoryId = 14,
        questionText = "Welcher Spieler trug die Rückennummer 10 beim BVB, als Dortmund 1997 die Champions League gewann?",
        answerA = "Karl-Heinz Riedle",
        answerB = "Andreas Möller",
        answerC = "Steffen Freund",
        answerD = "Stéphane Chapuisat",
        correctAnswer = 1,
        explanation = "Andreas Möller trug im Champions-League-Finale 1997 gegen Juventus Turin die Rückennummer 10 für Borussia Dortmund und war einer der Schlüsselspieler des Triumphes.",
        difficulty = 5,
        funFact = "Andreas Möller war 1997 Europas kreativster Mittelfeldspieler und erzielte im Halbfinale gegen Manchester United wichtige Tore. Er war der Dirigent des damaligen BVB-Spiels."
    ),

    // --- Transfers: teuerste Zugänge (correctAnswer = 2) ---

    Question(
        categoryId = 14,
        questionText = "Wer war Stand 2018 der teuerste Neuzugang in der Geschichte von Borussia Dortmund, als er für 30 Millionen Euro verpflichtet wurde?",
        answerA = "Mario Götze (Rückholung 2016)",
        answerB = "Mats Hummels (Rückholung 2019)",
        answerC = "André Schürrle (2016 von VfL Wolfsburg)",
        answerD = "Henrikh Mkhitaryan (2013 von Shakhtar)",
        correctAnswer = 2,
        explanation = "André Schürrle wurde 2016 für 30 Millionen Euro vom VfL Wolfsburg verpflichtet und war damit zum damaligen Zeitpunkt der teuerste Einkauf in der Geschichte von Borussia Dortmund.",
        difficulty = 5,
        funFact = "Schürrle erzielte beim 7:1 im WM-Halbfinale 2014 gegen Brasilien zwei Torvorlagen und schoss das 7:1 direkt. Beim BVB konnte er seine Leistungen leider nie abrufen."
    ),

    Question(
        categoryId = 14,
        questionText = "Für welche Ablösesumme wechselte Donyell Malen im Sommer 2021 von PSV Eindhoven zu Borussia Dortmund?",
        answerA = "22 Millionen Euro",
        answerB = "28 Millionen Euro",
        answerC = "30 Millionen Euro",
        answerD = "25 Millionen Euro",
        correctAnswer = 3,
        explanation = "Donyell Malen wechselte im Sommer 2021 für 30 Millionen Euro von PSV Eindhoven zu Borussia Dortmund und gehörte damit zu den teureren Verpflichtungen der BVB-Geschichte.",
        difficulty = 5,
        funFact = "Malen ist ein ehemaliges Arsenal-Eigengewächs. Er verließ die Gunners 2019 für 7 Millionen zu PSV, bevor ihn der BVB für fast das Vierfache holte – ein typisches BVB-Einkaufsmuster bei jungen Talenten."
    ),

    // --- Sebastien Haller – Transfer und Rückkehr (correctAnswer = 0) ---

    Question(
        categoryId = 14,
        questionText = "Für welche Ablösesumme wechselte Sébastien Haller im Januar 2022 von Ajax Amsterdam zu Borussia Dortmund als Ersatz für Erling Haaland?",
        answerA = "31 Millionen Euro",
        answerB = "25 Millionen Euro",
        answerC = "38 Millionen Euro",
        answerD = "42 Millionen Euro",
        correctAnswer = 0,
        explanation = "Sébastien Haller wechselte im Januar 2022 für 31 Millionen Euro von Ajax Amsterdam zu Borussia Dortmund – als geplanter Nachfolger für Erling Haaland, der im Sommer ablösefrei oder via Klausel gehen würde.",
        difficulty = 5,
        funFact = "Haller wurde kurz nach seinem Wechsel zum BVB mit einem Hodentumor diagnostiziert und musste umgehend operiert werden. Er kehrte nach der Behandlung zurück und erzielte in seiner ersten vollen Saison 20 Pflichtspieltore."
    ),

    // --- Emre Can – Nationalmannschaft (correctAnswer = 3) ---

    Question(
        categoryId = 14,
        questionText = "Von welchem Verein wechselte Emre Can im Januar 2020 auf Leihbasis – und anschließend fest – zu Borussia Dortmund?",
        answerA = "FC Liverpool",
        answerB = "Bayer Leverkusen",
        answerC = "FC Bayern München",
        answerD = "Juventus Turin",
        correctAnswer = 3,
        explanation = "Emre Can wechselte im Januar 2020 zunächst auf Leihbasis von Juventus Turin zu Borussia Dortmund und wurde anschließend für 25 Millionen Euro fest verpflichtet.",
        difficulty = 5,
        funFact = "Can wurde in Frankfurt geboren, spielte für die Jugend von Bayern München, dann Liverpool und Juventus, bevor er zum BVB kam. Er wurde für seine unermüdliche Arbeit im Mittelfeld beim BVB zum Führungsspieler."
    ),

    // --- Jadon Sancho – Jugendentwicklung und Transfer (correctAnswer = 1) ---

    Question(
        categoryId = 14,
        questionText = "Für welche Ablösesumme wechselte Jadon Sancho im Sommer 2021 von Borussia Dortmund zu Manchester United?",
        answerA = "73 Millionen Euro",
        answerB = "85 Millionen Euro",
        answerC = "92 Millionen Euro",
        answerD = "68 Millionen Euro",
        correctAnswer = 1,
        explanation = "Jadon Sancho wechselte im Sommer 2021 für 85 Millionen Euro von Borussia Dortmund zu Manchester United – nach langen Verhandlungen, die den gesamten Sommer 2020 andauerten, ohne Abschluss.",
        difficulty = 5,
        funFact = "Sancho kam 2017 als 17-Jähriger für nur 8 Millionen Euro von Manchester City zu Borussia Dortmund und entwickelte sich zu einem der besten Flügelspieler Europas – ein Musterbeispiel für das BVB-Entwicklungsmodell."
    ),

    Question(
        categoryId = 14,
        questionText = "Von welchem englischen Verein wechselte Jadon Sancho 2017 für 8 Millionen Euro zu Borussia Dortmund?",
        answerA = "FC Chelsea",
        answerB = "Manchester City",
        answerC = "Arsenal FC",
        answerD = "Tottenham Hotspur",
        correctAnswer = 1,
        explanation = "Jadon Sancho verließ im Sommer 2017 die Jugendakademie von Manchester City und wechselte für 8 Millionen Euro zu Borussia Dortmund – wo er sich in vier Saisons zu einem 85-Millionen-Spieler entwickelte.",
        difficulty = 5,
        funFact = "Sancho verließ Manchester City, obwohl er in deren berühmter Akademie ausgebildet worden war. Der BVB bot ihm etwas, was City nicht konnte: echte Spielzeit im Profi-Kader auf höchstem Niveau."
    ),

    // --- Torschützenkönig Bundesliga (correctAnswer = 0) ---

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler gewann in der Saison 2011/12 die Torjägerkanone der Bundesliga?",
        answerA = "Robert Lewandowski mit 30 Toren",
        answerB = "Mario Götze mit 21 Toren",
        answerC = "Kevin Großkreutz mit 18 Toren",
        answerD = "Shinji Kagawa mit 13 Toren",
        correctAnswer = 0,
        explanation = "Robert Lewandowski gewann in der Saison 2011/12 die Torjägerkanone der Bundesliga mit 30 Treffern in 33 Spielen – in der Saison, als der BVB die Meisterschaft mit 81 Punkten verteidigte.",
        difficulty = 5,
        funFact = "Die BVB-Meisterschaftssaison 2011/12 war historisch: 81 Punkte, 80 Tore, die beste Offensive der Liga. Lewandowski war mit 30 Toren das Herzstück des Angriffs."
    ),

    // --- Kevin Großkreutz – Weltmeister 2014 (correctAnswer = 2) ---

    Question(
        categoryId = 14,
        questionText = "Welche besondere Auszeichnung erhielt Kevin Großkreutz bei der Fußball-Weltmeisterschaft 2014 in Brasilien, obwohl er kein einziges Spiel bestritt?",
        answerA = "Er bekam eine Siegermedaille, aber kein Weltmeisterdiplom",
        answerB = "Er erhielt als einziger Kaderplayer keine Weltmeistermedaille",
        answerC = "Er bekam eine Weltmeistermedaille, da er im WM-Kader stand",
        answerD = "Er wurde nachträglich aus dem Kader gestrichen",
        correctAnswer = 2,
        explanation = "Kevin Großkreutz stand im deutschen WM-Kader 2014 und erhielt – obwohl er in keinem Spiel eingesetzt wurde – die Weltmeistermedaille, da alle Kadermitglieder ausgezeichnet werden.",
        difficulty = 5,
        funFact = "Großkreutz ist heute offizielle BVB-Legende und übernahm eine Botschafterrolle beim Verein. Sein WM-Titel 2014 war das Highlight einer Karriere, die fast ausschließlich in Dortmund stattfand."
    ),

    // --- Nuri Sahin – Trainer und Laufbahn (correctAnswer = 3) ---

    Question(
        categoryId = 14,
        questionText = "Welche Trainerstation absolvierte Nuri Sahin direkt vor seiner Rückkehr als Cheftrainer zu Borussia Dortmund im Jahr 2024?",
        answerA = "Fortuna Düsseldorf",
        answerB = "Bayer Leverkusen (U23)",
        answerC = "Antalyaspor",
        answerD = "SC Paderborn 07",
        correctAnswer = 3,
        explanation = "Nuri Sahin war Cheftrainer beim SC Paderborn 07 in der 2. Bundesliga, bevor er im Sommer 2024 als Nachfolger von Edin Terzic Cheftrainer bei Borussia Dortmund wurde.",
        difficulty = 5,
        funFact = "Sahin's Ernennung schloss einen Kreis: Er war als Jugendlicher BVB-Eigengewächs, feierte als Spieler Meistertitel unter Klopp und kehrte schließlich als Cheftrainer zurück – ein echter Lebensweg in Schwarzgelb."
    ),

    // --- Maximilian Beier – Neuzugang (correctAnswer = 0) ---

    Question(
        categoryId = 14,
        questionText = "Von welchem Bundesligaverein wechselte Maximilian Beier im Sommer 2024 zu Borussia Dortmund und welche Ablöse zahlte der BVB?",
        answerA = "TSG 1899 Hoffenheim für 30 Millionen Euro",
        answerB = "Bayer Leverkusen für 25 Millionen Euro",
        answerC = "RB Leipzig für 35 Millionen Euro",
        answerD = "Eintracht Frankfurt für 28 Millionen Euro",
        correctAnswer = 0,
        explanation = "Maximilian Beier wechselte im Sommer 2024 für 30 Millionen Euro von der TSG 1899 Hoffenheim zu Borussia Dortmund und gehört damit zu den Top-10 der teuersten BVB-Zugänge aller Zeiten.",
        difficulty = 5,
        funFact = "Beier wurde in der TSG-Akademie ausgebildet und durchlief dort alle Jugendstufen. Mit seiner Verpflichtung setzte der BVB weiterhin auf das Prinzip 'junges deutsches Talent mit Entwicklungspotenzial'."
    ),

    // --- Champions League Topscorer BVB (correctAnswer = 1) ---

    Question(
        categoryId = 14,
        questionText = "Wer ist der Rekordtorschütze von Borussia Dortmund in der Champions League?",
        answerA = "Robert Lewandowski",
        answerB = "Marco Reus",
        answerC = "Pierre-Emerick Aubameyang",
        answerD = "Lars Ricken",
        correctAnswer = 1,
        explanation = "Marco Reus ist mit den meisten Champions-League-Toren der Rekordtorschütze von Borussia Dortmund in der Königsklasse – er spielte sechs Saisons in der Champions League für den BVB.",
        difficulty = 5,
        funFact = "Trotz seiner langen Karriere und vieler Tore in der Champions League erreichte Reus mit dem BVB 2013 und 2024 zwar das Finale, gewann aber nie den Titel – sein größtes unverlostetes Fußball-Ziel."
    ),

    // --- Transferrekorde: Ablösefrei-Schocks (correctAnswer = 2) ---

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler wechselte 2014 ablösefrei zu Bayern München und sorgte damit für Empörung bei den Dortmunder Fans?",
        answerA = "Mario Götze",
        answerB = "Mats Hummels",
        answerC = "Robert Lewandowski",
        answerD = "Ilkay Gündogan",
        correctAnswer = 2,
        explanation = "Robert Lewandowski wechselte im Sommer 2014 ablösefrei zu Bayern München, nachdem er seinen BVB-Vertrag nicht verlängert hatte – der BVB erhielt keinen einzigen Cent für einen der besten Stürmer Europas.",
        difficulty = 5,
        funFact = "Lewandowski erzielte in seiner letzten BVB-Saison 2013/14 im CL-Halbfinale gegen Real Madrid vier Tore allein in der ersten Halbzeit – eines der berühmtesten Einzelspiele der Championsleague-Geschichte."
    ),

    // --- BVB Eigengewächse ohne Einsatz (correctAnswer = 3) ---

    Question(
        categoryId = 14,
        questionText = "Welches BVB-Eigengewächs wechselte 2020 zu einem anderen Bundesligaverein, ohne je für Dortmund in der Bundesliga gespielt zu haben, und gehört heute zur deutschen Nationalmannschaft?",
        answerA = "Ansgar Knauff",
        answerB = "Dele Alli",
        answerC = "Bayer Leverkusens Exequiel Palacios",
        answerD = "Antonio Rüdiger",
        correctAnswer = 3,
        explanation = "Antonio Rüdiger wurde in der BVB-Jugend ausgebildet, spielte aber nie für die Profis des BVB – er wechselte stattdessen zu einem anderen Klub und entwickelte sich zum deutschen Nationalspieler.",
        difficulty = 5,
        funFact = "Rüdiger wuchs in Berlin auf und trainierte zeitweise in der BVB-Jugend, spielte dann aber für VfB Stuttgart, AS Roma, FC Chelsea und Real Madrid. Er ist heute einer der renommiertesten Innenverteidiger der Welt."
    ),

    // --- Spielernummer und Identität (correctAnswer = 0) ---

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler trug jahrelang die Rückennummer 11 und ist für seine Schnelligkeit als Spitzname 'Flash Gordon' bekannt?",
        answerA = "Pierre-Emerick Aubameyang",
        answerB = "Jadon Sancho",
        answerC = "Ousmane Dembélé",
        answerD = "Donyell Malen",
        correctAnswer = 0,
        explanation = "Pierre-Emerick Aubameyang trug beim BVB die Rückennummer 17, später die 7, wurde aber als 'Flash Gordon' oder 'Auba' bezeichnet – er war einer der schnellsten Stürmer seiner Ära.",
        difficulty = 5,
        funFact = "Aubameyang war für seine extravaganten Torjubel bekannt: Er erschien nach Treffern manchmal mit Batman- oder anderen Superhelden-Masken – was ihm sowohl Lob als auch gelbe Karten einbrachte."
    ),

    // --- Rekordtransfer Eingang (correctAnswer = 1) ---

    Question(
        categoryId = 14,
        questionText = "Wer war im Sommer 2023 mit einer Ablöse von über 30 Millionen Euro einer der teuersten BVB-Zugänge und kam von Bayer Leverkusen?",
        answerA = "Karim Adeyemi",
        answerB = "Felix Nmecha",
        answerC = "Niclas Füllkrug",
        answerD = "Julian Ryerson",
        correctAnswer = 1,
        explanation = "Felix Nmecha wechselte im Sommer 2023 für rund 30 Millionen Euro von Bayer Leverkusen zu Borussia Dortmund und gehört damit zu den teuersten Zugängen in der neueren BVB-Geschichte.",
        difficulty = 5,
        funFact = "Nmecha ist ein deutsch-englischer Doppelstaatler und entschied sich für die deutsche Nationalmannschaft. Er ist der jüngere Bruder von Lukas Nmecha und spielte zuvor auch für Manchester City's Akademie."
    ),

    // --- BVB-Trainer-Legenden mit Spieler-Vergangenheit (correctAnswer = 2) ---

    Question(
        categoryId = 14,
        questionText = "Welcher BVB-Spieler aus der Meistermannschaft 2011/12 wurde später Cheftrainer des BVB und führte ihn ins Champions-League-Finale 2024?",
        answerA = "Kevin Großkreutz",
        answerB = "Felipe Santana",
        answerC = "Nuri Sahin",
        answerD = "Ivan Perisic",
        correctAnswer = 2,
        explanation = "Nuri Sahin gewann 2011 und 2012 die Bundesliga mit dem BVB als Spieler und kehrte im Sommer 2024 als Cheftrainer zu Borussia Dortmund zurück – der einzige BVB-Meisterspieler, der auch Cheftrainer des Vereins wurde.",
        difficulty = 5,
        funFact = "Sahin spielte 2011 eine überragende Saison und gewann die Trophäe als bester Bundesliga-Spieler. Nach Lehrjahren bei Real Madrid, Liverpool und anderen Clubs kehrte er zum BVB zurück – diesmal an der Seitenlinie."
    ),

    // --- Edin Terzic – Spieler-zu-Trainer (correctAnswer = 3) ---

    Question(
        categoryId = 14,
        questionText = "Welche besondere Leistung vollbrachte der BVB unter Edin Terzic in der Saison 2020/21, die direkt mit einem ehemaligen BVB-Spieler zusammenhängt?",
        answerA = "Erster Bundesligatitel seit 2012",
        answerB = "Rekord von 20 Siegen in Folge",
        answerC = "Champions-League-Sieg",
        answerD = "DFB-Pokal-Sieg gegen RB Leipzig",
        correctAnswer = 3,
        explanation = "Unter Interimstrainer Edin Terzic gewann Borussia Dortmund in der Saison 2020/21 den DFB-Pokal gegen RB Leipzig (4:1) – der erste Pokaltitel seit 2017 und der letzte Titel für BVB-Legende Jadon Sancho vor seinem Wechsel.",
        difficulty = 5,
        funFact = "Edin Terzic war ein eingeschworener BVB-Fan und -Funktionär, bevor er Trainer wurde. Er übernahm den Verein unter schwierigsten Umständen und führte ihn zu einem Titelgewinn – eine der romantischsten Trainergeschichten der Bundesliga."
    ),

)
