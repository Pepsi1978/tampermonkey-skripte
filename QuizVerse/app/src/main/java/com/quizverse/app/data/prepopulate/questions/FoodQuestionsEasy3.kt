package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsEasy3(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 8,
        questionText = "Welche Farbe hat eine reife Banane?",
        answerA = "Grün",
        answerB = "Rot",
        answerC = "Gelb",
        answerD = "Orange",
        correctAnswer = 2,
        explanation = "Reife Bananen sind gelb. Grüne Bananen sind noch unreif, während braune Flecken anzeigen, dass die Banane überreif wird.",
        difficulty = 1,
        funFact = "Bananen reifen nach der Ernte weiter – sie werden deshalb unreif (grün) geerntet und erst auf dem Weg zum Markt gelb."
    ),

    // Question 2
    Question(
        categoryId = 8,
        questionText = "Aus welchem Land stammt die Erdbeere ursprünglich?",
        answerA = "Spanien",
        answerB = "Deutschland",
        answerC = "Frankreich",
        answerD = "Amerika",
        correctAnswer = 3,
        explanation = "Die heutige Gartenerdbeere entstand durch Kreuzung einer nordamerikanischen mit einer südamerikanischen Erdbeerart, die im 18. Jahrhundert nach Europa gebracht wurden.",
        difficulty = 1,
        funFact = "Erdbeeren sind botanisch gesehen keine echten Beeren, sondern sogenannte Sammelfrüchte – die kleinen gelben Pünktchen auf der Oberfläche sind die eigentlichen Früchte."
    ),

    // Question 3
    Question(
        categoryId = 8,
        questionText = "Welches Gemüse ist für seine Wirkung auf die Sehkraft bekannt und enthält viel Beta-Carotin?",
        answerA = "Brokkoli",
        answerB = "Spinat",
        answerC = "Karotte",
        answerD = "Sellerie",
        correctAnswer = 2,
        explanation = "Karotten enthalten viel Beta-Carotin, das der Körper in Vitamin A umwandelt, welches für die Augengesundheit wichtig ist.",
        difficulty = 1,
        funFact = "Die Geschichte, dass Karotten die Sehkraft verbessern, wurde von der britischen Armee im Zweiten Weltkrieg verbreitet, um zu verschleiern, dass sie Radar nutzte."
    ),

    // Question 4
    Question(
        categoryId = 8,
        questionText = "Was ist Butter?",
        answerA = "Gepresster Käse",
        answerB = "Geronnene Milch",
        answerC = "Aus Rahm gequirltes Milchfett",
        answerD = "Gezuckerter Joghurt",
        correctAnswer = 2,
        explanation = "Butter entsteht durch intensives Schlagen oder Quirlen von Rahm (Sahne), bis sich das Milchfett von der Buttermilch trennt.",
        difficulty = 1,
        funFact = "Für 1 kg Butter braucht man rund 20 bis 25 Liter Kuhmilch."
    ),

    // Question 5
    Question(
        categoryId = 8,
        questionText = "Welche Jahreszeit ist die Hauptsaison für Erdbeeren in Deutschland?",
        answerA = "Herbst",
        answerB = "Winter",
        answerC = "Frühling bis Frühsommer",
        answerD = "Hochsommer bis Herbst",
        correctAnswer = 2,
        explanation = "Erdbeeren haben in Deutschland von Mai bis Juli Saison. In dieser Zeit werden sie frisch und regional geerntet.",
        difficulty = 1,
        funFact = "Deutschland ist einer der größten Erdbeerproduzenten Europas – allein Bayern und Niedersachsen ernten jährlich tausende Tonnen."
    ),

    // Question 6
    Question(
        categoryId = 8,
        questionText = "Aus welcher Milch wird Parmesan traditionell hergestellt?",
        answerA = "Schafmilch",
        answerB = "Ziegenmilch",
        answerC = "Büffelmilch",
        answerD = "Kuhmilch",
        correctAnswer = 3,
        explanation = "Parmigiano Reggiano (Parmesan) wird ausschließlich aus frischer Kuhmilch hergestellt und in einem streng geregelten Gebiet in Norditalien produziert.",
        difficulty = 1,
        funFact = "Ein echtes Parmesan-Rad wiegt zwischen 30 und 50 kg und reift mindestens 12 Monate – oft sogar 24 oder 36 Monate."
    ),

    // Question 7
    Question(
        categoryId = 8,
        questionText = "Welches Fleisch wird für klassische Hamburger verwendet?",
        answerA = "Lamm",
        answerB = "Schwein",
        answerC = "Rind",
        answerD = "Pute",
        correctAnswer = 2,
        explanation = "Der klassische Hamburger-Patty besteht aus Rinderhackfleisch. Das Gericht ist nach der deutschen Stadt Hamburg benannt.",
        difficulty = 1,
        funFact = "Der Hamburger gelangte wahrscheinlich durch deutsche Auswanderer im 19. Jahrhundert in die USA, wo er zur Ikone der amerikanischen Küche wurde."
    ),

    // Question 8
    Question(
        categoryId = 8,
        questionText = "Wo sollte man rohen Fisch im Kühlschrank lagern, um Keimwachstum zu minimieren?",
        answerA = "Im kältesten Bereich ganz unten oder im Fleischfach",
        answerB = "In der Kühlschranktür",
        answerC = "Auf dem mittleren Regal neben Milchprodukten",
        answerD = "Im Gemüsefach ganz oben",
        correctAnswer = 0,
        explanation = "Roher Fisch sollte im kältesten Bereich des Kühlschranks (ganz unten oder im speziellen Fleischfach) gelagert werden, um Bakterienwachstum zu verlangsamen.",
        difficulty = 1,
        funFact = "Die optimale Kühlschranktemperatur für Fisch liegt zwischen 0 und 2 Grad Celsius – etwas kälter als die empfohlenen 4–7 °C für andere Lebensmittel."
    ),

    // Question 9
    Question(
        categoryId = 8,
        questionText = "Welche Frucht wird auch als 'Königin der Früchte' bezeichnet?",
        answerA = "Mango",
        answerB = "Ananas",
        answerC = "Durian",
        answerD = "Mangostane",
        correctAnswer = 3,
        explanation = "Die Mangostane wird oft als 'Königin der Früchte' bezeichnet und ist für ihren süßen, zarten Geschmack bekannt. Sie wächst in Südostasien.",
        difficulty = 1,
        funFact = "Königin Victoria soll im 19. Jahrhundert eine Belohnung für denjenigen ausgelobt haben, der ihr eine frische Mangostane bringen könne – da die Frucht so schwer zu transportieren war."
    ),

    // Question 10
    Question(
        categoryId = 8,
        questionText = "Was ist Gouda?",
        answerA = "Eine niederländische Käsesorte",
        answerB = "Eine französische Käsesorte",
        answerC = "Eine deutsche Wurstwaren-Spezialität",
        answerD = "Ein Schweizer Schokoladenprodukt",
        correctAnswer = 0,
        explanation = "Gouda ist ein niederländischer Käse aus Kuhmilch und gehört weltweit zu den bekanntesten und meistverkauften Käsesorten.",
        difficulty = 1,
        funFact = "Die Stadt Gouda in den Niederlanden war früher ein wichtiger Handelsort für Käse – der Käse wurde jedoch nicht dort hergestellt, sondern dort gehandelt."
    ),

    // Question 11
    Question(
        categoryId = 8,
        questionText = "Welches Gemüse wächst unter der Erde?",
        answerA = "Zucchini",
        answerB = "Paprika",
        answerC = "Gurke",
        answerD = "Kartoffel",
        correctAnswer = 3,
        explanation = "Kartoffeln sind Knollenfrüchte, die als unterirdische Stärkespeicher an den Wurzeln der Pflanze wachsen.",
        difficulty = 1,
        funFact = "Die Kartoffel stammt ursprünglich aus den Anden in Südamerika und wurde erst im 16. Jahrhundert nach Europa gebracht."
    ),

    // Question 12
    Question(
        categoryId = 8,
        questionText = "Welche Milch enthält natürlich keinen Laktose?",
        answerA = "Vollmilch",
        answerB = "Magermilch",
        answerC = "Kokosmilch",
        answerD = "Laktosefreie Kuhmilch",
        correctAnswer = 2,
        explanation = "Kokosmilch ist kein tierisches Produkt und enthält daher von Natur aus keine Laktose. Sie wird aus dem Fruchtfleisch der Kokosnuss gewonnen.",
        difficulty = 1,
        funFact = "Kokosmilch und Kokoswasser sind zwei verschiedene Produkte: Kokoswasser ist die klare Flüssigkeit im Inneren der Kokosnuss, Kokosmilch wird aus geriebenen Kokosflocken und Wasser hergestellt."
    ),

    // Question 13
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen einem Lachs und einer Forelle?",
        answerA = "Lachs lebt im Meer, Forelle hauptsächlich in Süßgewässern",
        answerB = "Forellen sind größer als Lachse",
        answerC = "Es gibt keinen Unterschied – es sind dieselbe Fischart",
        answerD = "Lachse sind Süßwasserfische, Forellen Salzwasserfische",
        correctAnswer = 0,
        explanation = "Lachse sind Meeresfische, die zum Laichen in Flüsse wandern. Forellen leben hauptsächlich in Flüssen und Seen (Süßwasser), manche Arten auch im Meer.",
        difficulty = 1,
        funFact = "Lachse kehren zum Laichen exakt in den Fluss zurück, in dem sie geboren wurden – sie finden den Weg durch ihren Geruchssinn."
    ),

    // Question 14
    Question(
        categoryId = 8,
        questionText = "Wie lange hält sich geöffnete Milch im Kühlschrank in der Regel?",
        answerA = "3 bis 5 Tage",
        answerB = "1 bis 2 Tage",
        answerC = "Einen Monat",
        answerD = "10 bis 14 Tage",
        correctAnswer = 0,
        explanation = "Geöffnete Frischmilch sollte innerhalb von 3 bis 5 Tagen verbraucht werden. Haltbarkeitsmilch (H-Milch) hält sich nach dem Öffnen ebenfalls nur wenige Tage.",
        difficulty = 1,
        funFact = "H-Milch wird bei über 135 °C kurz erhitzt (ultrahocherhitzt), wodurch fast alle Keime abgetötet werden – so bleibt sie ungeöffnet bis zu 3 Monate haltbar."
    ),

    // Question 15
    Question(
        categoryId = 8,
        questionText = "Welche Frucht ist die Hauptzutat für Ketchup?",
        answerA = "Paprika",
        answerB = "Kürbis",
        answerC = "Tomate",
        answerD = "Aubergine",
        correctAnswer = 2,
        explanation = "Ketchup wird hauptsächlich aus Tomaten hergestellt, die mit Essig, Zucker und Gewürzen gekocht werden.",
        difficulty = 1,
        funFact = "Die Tomate wurde erst im 18. Jahrhundert in Europa als Nahrungsmittel akzeptiert – lange Zeit hielt man sie für giftig, weil sie zur Familie der Nachtschattengewächse gehört."
    ),

    // Question 16
    Question(
        categoryId = 8,
        questionText = "Was ist Emmentaler?",
        answerA = "Ein österreichischer Räucherkäse",
        answerB = "Ein dänischer Frischkäse",
        answerC = "Ein Schweizer Käse mit großen Löchern",
        answerD = "Ein französischer Weichkäse",
        correctAnswer = 2,
        explanation = "Emmentaler ist ein Schweizer Hartkäse aus dem Emmental und bekannt für seine charakteristischen großen Löcher, die durch Kohlendioxid-Gase beim Reifen entstehen.",
        difficulty = 1,
        funFact = "Die Löcher im Emmentaler entstehen durch Propionsäurebakterien, die beim Reifen CO₂-Gas produzieren – dieses dehnt sich aus und bildet die typischen Löcher."
    ),

    // Question 17
    Question(
        categoryId = 8,
        questionText = "Welches Gemüse wird auch 'Aubergine' genannt?",
        answerA = "Eierfrucht",
        answerB = "Zucchini",
        answerC = "Kürbis",
        answerD = "Kohlrabi",
        correctAnswer = 0,
        explanation = "Aubergine und Eierfrucht sind zwei Namen für dasselbe Gemüse. In Deutschland sagt man meist 'Aubergine', während 'Eierfrucht' eher im süddeutschen Raum vorkommt.",
        difficulty = 1,
        funFact = "Der Name 'Eierfrucht' kommt daher, dass manche alten Sorten weiß und eiförmig aussehen – ganz anders als die heute übliche dunkelviolette Form."
    ),

    // Question 18
    Question(
        categoryId = 8,
        questionText = "Wie nennt man Fleisch vom Schwein, das durch Salzen und Räuchern haltbar gemacht wurde?",
        answerA = "Schinken",
        answerB = "Filet",
        answerC = "Kotelett",
        answerD = "Schnitzel",
        correctAnswer = 0,
        explanation = "Schinken ist Schweinefleisch (oft aus der Keule), das durch Pökeln (Salzen) und oft zusätzlich durch Räuchern oder Trocknen haltbar gemacht wird.",
        difficulty = 1,
        funFact = "Es gibt in Deutschland über 50 verschiedene Schinkensorten – von Schwarzwälder Schinken bis Westfälischer Schinken, jede Region hat ihre eigene Tradition."
    ),

    // Question 19
    Question(
        categoryId = 8,
        questionText = "Bei welcher Temperatur sollte ein Kühlschrank betrieben werden?",
        answerA = "10 bis 12 °C",
        answerB = "15 bis 18 °C",
        answerC = "0 bis 2 °C",
        answerD = "4 bis 7 °C",
        correctAnswer = 3,
        explanation = "Die optimale Kühlschranktemperatur liegt bei 4 bis 7 °C. Diese Temperatur verlangsamt das Bakterienwachstum effektiv, ohne Lebensmittel einzufrieren.",
        difficulty = 1,
        funFact = "Viele Menschen stellen ihren Kühlschrank zu warm ein – Studien zeigen, dass die meisten Haushalts-Kühlschränke bei 7–10 °C betrieben werden statt bei den empfohlenen 4–7 °C."
    ),

    // Question 20
    Question(
        categoryId = 8,
        questionText = "Welche Frucht enthält den Kern in der Mitte und ist von außen mit einer rauen, grünen Schale bedeckt?",
        answerA = "Kiwi",
        answerB = "Passionsfrucht",
        answerC = "Avocado",
        answerD = "Feige",
        correctAnswer = 2,
        explanation = "Avocados haben eine raue, grüne (oder schwarze) Außenschale und einen großen, runden Kern im Inneren. Das Fruchtfleisch ist cremig und butterartig.",
        difficulty = 1,
        funFact = "Avocados reifen nicht am Baum – erst wenn sie gepflückt werden, beginnen sie zu reifen. Die Bäume können die Früchte monatelang als natürliche Vorratskammer am Ast hängen lassen."
    ),

    // Question 21
    Question(
        categoryId = 8,
        questionText = "Aus welcher Milch wird echter Feta-Käse hergestellt?",
        answerA = "Kuhmilch",
        answerB = "Büffelmilch",
        answerC = "Schaf- oder Ziegenmilch",
        answerD = "Stutenmilch",
        correctAnswer = 2,
        explanation = "Echter griechischer Feta wird aus Schafsmilch oder einer Mischung aus Schafs- und Ziegenmilch hergestellt. Er ist seit 2002 eine geschützte Ursprungsbezeichnung der EU.",
        difficulty = 1,
        funFact = "Feta macht rund 70 % des Käsekonsums in Griechenland aus – die Griechen sind damit die größten Käseesser pro Kopf weltweit."
    ),

    // Question 22
    Question(
        categoryId = 8,
        questionText = "Welches ist das einzige Gemüse, das mehrjährig wächst und jedes Jahr neu geerntet werden kann, ohne neu gepflanzt zu werden?",
        answerA = "Tomate",
        answerB = "Zucchini",
        answerC = "Spargel",
        answerD = "Erbsen",
        correctAnswer = 2,
        explanation = "Spargel ist eine mehrjährige Pflanze, die nach dem Einpflanzen viele Jahre lang jährlich Sprossen treibt, die geerntet werden können.",
        difficulty = 1,
        funFact = "Eine Spargelstaude braucht nach dem Einpflanzen drei Jahre, bis sie zum ersten Mal geerntet werden kann – dafür trägt sie dann bis zu 20 Jahre lang."
    ),

    // Question 23
    Question(
        categoryId = 8,
        questionText = "Welches Tier liefert uns Lamm- und Hammelfleisch?",
        answerA = "Ziege",
        answerB = "Schaf",
        answerC = "Reh",
        answerD = "Kalb",
        correctAnswer = 1,
        explanation = "Lammfleisch stammt von jungen Schafen (bis ca. 1 Jahr), Hammelfleisch von älteren männlichen Schafen. Beide sind Schafe.",
        difficulty = 1,
        funFact = "Lammfleisch ist in der Mittelmeerküche, im Nahen Osten und in Nordafrika sehr beliebt und spielt in vielen Kulturen eine wichtige Rolle bei religiösen Festen."
    ),

    // Question 24
    Question(
        categoryId = 8,
        questionText = "Welches Obst sollte man NICHT im Kühlschrank lagern, weil die Kälte es beschädigt?",
        answerA = "Äpfel",
        answerB = "Birnen",
        answerC = "Bananen",
        answerD = "Trauben",
        correctAnswer = 2,
        explanation = "Bananen reagieren empfindlich auf Kälte: Unter 12 °C werden ihre Zellen beschädigt, sie werden braun und verlieren Geschmack. Sie sollten bei Zimmertemperatur gelagert werden.",
        difficulty = 1,
        funFact = "Wenn Bananen zusammen mit anderem Obst gelagert werden, reifen sie schneller – sie geben das Reifegas Ethylen ab, das die Reifung beschleunigt."
    ),

    // Question 25
    Question(
        categoryId = 8,
        questionText = "Was ist Joghurt?",
        answerA = "Erhitzte und gezuckerte Milch",
        answerB = "Durch Milchsäurebakterien fermentierte Milch",
        answerC = "Aufgeschlagene Sahne mit Fruchtzusatz",
        answerD = "Gepresster Weichkäse",
        correctAnswer = 1,
        explanation = "Joghurt entsteht durch die Fermentation von Milch mit Milchsäurebakterien (Lactobacillus bulgaricus und Streptococcus thermophilus), die Milchzucker in Milchsäure umwandeln.",
        difficulty = 1,
        funFact = "Der Mensch stellt seit mindestens 5.000 Jahren Joghurt her – wahrscheinlich war die Entdeckung ein Zufallsprodukt, als Milch in warmen Temperaturen sauer wurde."
    ),

    // Question 26
    Question(
        categoryId = 8,
        questionText = "Welches ist der schärfste Teil einer Chilischote?",
        answerA = "Die Außenhaut",
        answerB = "Die Spitze",
        answerC = "Die weißen Trennwände (Plazenta) innen",
        answerD = "Die Kerne",
        correctAnswer = 2,
        explanation = "Das meiste Capsaicin (der Scharfstoff) befindet sich in den weißen Trennwänden (Plazenta) im Inneren der Schote, nicht in den Kernen.",
        difficulty = 1,
        funFact = "Die Schärfe von Chili wird in Scoville-Einheiten gemessen – eine normale Jalapeño hat 2.500–8.000 Scoville, während der schärfste Chili der Welt (Pepper X) über 3 Millionen Scoville erreicht."
    ),

    // Question 27
    Question(
        categoryId = 8,
        questionText = "Welche Fischart ist für ihre orange-rote Farbe beim Räuchern bekannt und besonders beliebt?",
        answerA = "Kabeljau",
        answerB = "Lachs",
        answerC = "Hering",
        answerD = "Scholle",
        correctAnswer = 1,
        explanation = "Geräucherter Lachs hat eine charakteristische orange-rote Farbe, die durch das natürliche Pigment Astaxanthin im Fleisch entsteht.",
        difficulty = 1,
        funFact = "Die rötliche Farbe von Lachs kommt von dem Pigment Astaxanthin, das er durch die Aufnahme von Krebstieren und Algen aufnimmt – ohne diese Ernährung wäre Lachsfleisch grau."
    ),

    // Question 28
    Question(
        categoryId = 8,
        questionText = "Was sollte man tun, bevor man rohes Fleisch und danach Gemüse auf demselben Schneidebrett schneidet?",
        answerA = "Das Brett nur kurz mit kaltem Wasser abspülen",
        answerB = "Das Brett gründlich mit heißem Wasser und Spülmittel reinigen oder ein anderes Brett verwenden",
        answerC = "Das Brett kurz abwischen und weiter benutzen",
        answerD = "Das Brett mit einem Küchentuch abtrocknen",
        correctAnswer = 1,
        explanation = "Rohes Fleisch kann gefährliche Bakterien wie Salmonellen oder Campylobacter enthalten, die auf andere Lebensmittel übertragen werden (Kreuzkontamination). Gründliche Reinigung oder separate Bretter sind Pflicht.",
        difficulty = 1,
        funFact = "In professionellen Küchen gibt es Farbsysteme für Schneidebretter: rot für rohes Fleisch, gelb für Geflügel, grün für Gemüse – so wird Kreuzkontamination verhindert."
    ),

    // Question 29
    Question(
        categoryId = 8,
        questionText = "Welche Farbe haben reife Tomaten?",
        answerA = "Grün",
        answerB = "Rot",
        answerC = "Lila",
        answerD = "Weiß",
        correctAnswer = 1,
        explanation = "Die meisten bekannten Tomatensorten werden bei der Reife rot, weil das Pigment Lycopin gebildet wird. Es gibt aber auch gelbe, orangene und sogar schwarze Tomatensorten.",
        difficulty = 1,
        funFact = "Tomaten enthalten Lycopin, ein starkes Antioxidans, das durch Kochen besser vom Körper aufgenommen wird – Tomatensauce ist daher gesünder als rohe Tomaten."
    ),

    // Question 30
    Question(
        categoryId = 8,
        questionText = "Welcher Käse hat eine weiß-bläuliche Schimmelschicht und einen charakteristischen starken Geruch?",
        answerA = "Brie",
        answerB = "Camembert",
        answerC = "Limburger",
        answerD = "Roquefort",
        correctAnswer = 3,
        explanation = "Roquefort ist ein französischer Blauschimmelkäse aus Schafsmilch mit charakteristischen blaugrünen Schimmeladern. Er hat einen kräftigen, würzigen Geschmack und Geruch.",
        difficulty = 1,
        funFact = "Die Legende besagt, dass Roquefort zufällig entdeckt wurde: Ein Schafhirte soll seinen Käse in einer Höhle vergessen haben und nach Wochen festgestellt haben, dass er blau gefleckt und köstlich war."
    ),

    // Question 31
    Question(
        categoryId = 8,
        questionText = "Was ist Rinderhack?",
        answerA = "Ganzes Rinderfilet",
        answerB = "Fein gehacktes Rindfleisch",
        answerC = "Getrocknetes Rindfleisch",
        answerD = "Mariniertes Rinderroastbeef",
        correctAnswer = 1,
        explanation = "Rinderhack (oder Rinderhackfleisch) ist fein gemahlenes Rindfleisch, das für Gerichte wie Bolognese, Burger oder Frikadellen verwendet wird.",
        difficulty = 1,
        funFact = "Hackfleisch sollte immer durchgegart werden (Kerntemperatur über 70 °C), da durch das Zerkleinern Bakterien von der Oberfläche ins Innere gelangen können."
    ),

    // Question 32
    Question(
        categoryId = 8,
        questionText = "Welche Obstart hat eine gelbe Schale und einen weißen, saftigen Kern?",
        answerA = "Grapefruit",
        answerB = "Zitrone",
        answerC = "Birne",
        answerD = "Ananas",
        correctAnswer = 2,
        explanation = "Die Birne hat je nach Sorte eine gelbliche, grünliche oder rötliche Schale und ein weißes, saftiges Fruchtfleisch mit einem süßen, aromatischen Geschmack.",
        difficulty = 1,
        funFact = "Es gibt weltweit über 3.000 Birnensorten – von der kleinen Williams-Christ-Birne bis zur großen Konferenzbirne, jede hat ein eigenes Aroma."
    ),

    // Question 33
    Question(
        categoryId = 8,
        questionText = "Wie nennt man Hühnerfleisch, das aus der Brust stammt?",
        answerA = "Keule",
        answerB = "Flügel",
        answerC = "Filet",
        answerD = "Herz",
        correctAnswer = 2,
        explanation = "Das Hähnchenfilet (auch Hühnerbrustfilet) ist das Fleisch von der Brust des Huhns. Es ist mager, proteinreich und sehr beliebt in der gesunden Küche.",
        difficulty = 1,
        funFact = "Hühnerbrustfleisch hat fast doppelt so viel Protein wie Schweinefleisch bei deutlich weniger Fett – deshalb ist es das Lieblingsfleisch von Sportlern und Bodybuildernern."
    ),

    // Question 34
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen Brie und Camembert?",
        answerA = "Brie ist größer und milder, Camembert kleiner und würziger",
        answerB = "Brie ist aus Ziegenmilch, Camembert aus Kuhmilch",
        answerC = "Camembert ist aus Schafsmilch, Brie aus Kuhmilch",
        answerD = "Es gibt keinen Unterschied, beide sind identisch",
        correctAnswer = 0,
        explanation = "Brie und Camembert sind beides französische Weichkäse mit Weißschimmelrinde. Brie kommt aus der Île-de-France, ist größer und hat einen milderen Geschmack. Camembert aus der Normandie ist kleiner und intensiver im Aroma.",
        difficulty = 1,
        funFact = "Camembert wurde angeblich 1791 von Marie Harel in der Normandie erfunden – ihr wurde ein Denkmal in Vimoutiers gewidmet, das aber amerikanische Soldaten im Zweiten Weltkrieg beschädigten und später restaurierten."
    ),

    // Question 35
    Question(
        categoryId = 8,
        questionText = "Welches Gemüse ist der Hauptbestandteil von Sauerkraut?",
        answerA = "Rotkohl",
        answerB = "Weißkohl",
        answerC = "Wirsing",
        answerD = "Chinakohl",
        correctAnswer = 1,
        explanation = "Sauerkraut wird aus fein geschnittenem Weißkohl hergestellt, der durch Milchsäuregärung fermentiert wird. Das Salz entzieht dem Kohl Wasser und ermöglicht die Gärung.",
        difficulty = 1,
        funFact = "Sauerkraut war früher ein wichtiges Mittel gegen Skorbut auf langen Seereisen, da es trotz monatelanger Lagerung seinen Vitamin-C-Gehalt behält."
    ),

    // Question 36
    Question(
        categoryId = 8,
        questionText = "Was passiert, wenn man rohes Fleisch bei Zimmertemperatur zu lange liegen lässt?",
        answerA = "Es wird zarter",
        answerB = "Bakterien vermehren sich und es wird gefährlich",
        answerC = "Es trocknet nur aus, wird aber nicht gefährlich",
        answerD = "Es reift wie Käse",
        correctAnswer = 1,
        explanation = "Bei Zimmertemperatur (zwischen 10 und 60 °C) verdoppelt sich die Bakterienzahl auf Fleisch alle 20 Minuten. Nach mehr als zwei Stunden ist rohes Fleisch gesundheitsgefährlich.",
        difficulty = 1,
        funFact = "Der 'Gefahrenbereich' für Lebensmittel liegt zwischen 4 und 60 °C – Bakterien wachsen in diesem Temperaturbereich am schnellsten. Deshalb ist Kühlen und Erhitzen so wichtig."
    ),

    // Question 37
    Question(
        categoryId = 8,
        questionText = "Welche Beere ist tiefblau bis schwarz und wächst auf Sträuchern in Wäldern und Gärten?",
        answerA = "Johannisbeere",
        answerB = "Heidelbeere",
        answerC = "Stachelbeere",
        answerD = "Himbeere",
        correctAnswer = 1,
        explanation = "Heidelbeeren (auch Blaubeeren genannt) sind tiefblau bis schwarz und wachsen auf kleinen Sträuchern in Wäldern und Heiden. Sie sind reich an Antioxidantien.",
        difficulty = 1,
        funFact = "Wilde Heidelbeeren färben Zunge und Zähne blau-violett, weil ihre Pigmente (Anthocyane) durch und durch im Fruchtfleisch stecken – kultivierte Supermarkt-Heidelbeeren haben dagegen weißes Fruchtfleisch."
    ),

    // Question 38
    Question(
        categoryId = 8,
        questionText = "Aus welcher Milch wird Mascarpone hergestellt?",
        answerA = "Schafsmilch",
        answerB = "Kuhmilch (Sahne)",
        answerC = "Ziegenmilch",
        answerD = "Büffelmilch",
        correctAnswer = 1,
        explanation = "Mascarpone ist ein italienischer Frischkäse aus sehr fettreicher Kuhmilch (Sahne) und hat einen hohen Fettgehalt von 70–80 %. Er ist bekannt als Basis für Tiramisu.",
        difficulty = 1,
        funFact = "Mascarpone enthält so viel Fett, dass er technisch gesehen kein Käse, sondern ein Rahmerzeugnis ist – denn echter Käse entsteht durch Lab-Zugabe, Mascarpone durch Säuerung der Sahne."
    ),

    // Question 39
    Question(
        categoryId = 8,
        questionText = "Welche Frucht enthält einen harten Stein als Kern?",
        answerA = "Apfel",
        answerB = "Weintraube",
        answerC = "Erdbeere",
        answerD = "Kirsche",
        correctAnswer = 3,
        explanation = "Kirschen sind Steinfrüchte – sie haben einen harten Kern (Stein) im Inneren, der von einem Fruchtfleisch umgeben ist. Auch Pflaumen, Pfirsiche und Aprikosen sind Steinfrüchte.",
        difficulty = 1,
        funFact = "Es gibt über 1.000 verschiedene Kirschsorten weltweit. Deutschland ist in Europa einer der größten Kirschproduzenten, besonders der Schwarzwald ist für seine Sauerkirschen bekannt."
    ),

    // Question 40
    Question(
        categoryId = 8,
        questionText = "Was ist Thunfisch?",
        answerA = "Ein Süßwasserfisch aus deutschen Seen",
        answerB = "Ein großer Meeresfisch der gemäßigten und tropischen Ozeane",
        answerC = "Eine Krebstierart aus dem Atlantik",
        answerD = "Ein Flachseefish aus dem Mittelmeer",
        correctAnswer = 1,
        explanation = "Thunfisch ist ein großer, schneller Meeresfisch, der in gemäßigten und tropischen Ozeanen weltweit vorkommt. Er kann bis zu 3 Meter lang und 600 kg schwer werden.",
        difficulty = 1,
        funFact = "Thunfisch ist einer der wenigen Warmblüter unter den Fischen – er kann seine Körpertemperatur über die Wassertemperatur hinaus regulieren, was ihm Schnelligkeit verleiht."
    ),

    // Question 41
    Question(
        categoryId = 8,
        questionText = "Welches Gemüse hat eine lila Farbe und wird häufig in der Mittelmeerküche verwendet?",
        answerA = "Zucchini",
        answerB = "Aubergine",
        answerC = "Artischocke",
        answerD = "Fenchel",
        correctAnswer = 1,
        explanation = "Die Aubergine hat eine glänzende, tiefviolette Außenhaut und weißes Fruchtfleisch. Sie ist ein Grundgemüse der mediterranen Küche, z. B. in Ratatouille oder Moussaka.",
        difficulty = 1,
        funFact = "Auberginen gehören zur selben Pflanzenfamilie wie Tomaten und Kartoffeln (Nachtschattengewächse). Roh enthalten sie leicht giftige Substanzen – durch Kochen werden diese abgebaut."
    ),

    // Question 42
    Question(
        categoryId = 8,
        questionText = "Welche Eigenschaft hat Butter, wenn sie im Kühlschrank aufbewahrt wird?",
        answerA = "Sie wird flüssig",
        answerB = "Sie wird hart und fest",
        answerC = "Sie verliert ihren Fettgehalt",
        answerD = "Sie wird bitter",
        correctAnswer = 1,
        explanation = "Butter ist bei Kühlschranktemperatur (4–7 °C) hart und fest, weil das Milchfett bei niedrigen Temperaturen erstarrt. Bei Zimmertemperatur wird sie weich und streichfähig.",
        difficulty = 1,
        funFact = "Ghee (geklärte Butter) ist Butter, aus der Wasser und Milcheiweiß entfernt wurden. Sie ist bei Zimmertemperatur monatelang haltbar und ist besonders in der indischen und arabischen Küche beliebt."
    ),

    // Question 43
    Question(
        categoryId = 8,
        questionText = "Welches ist das bekannteste Fischerzeugnis aus dem Rheingau und Rheinland?",
        answerA = "Bückling",
        answerB = "Bismarckhering",
        answerC = "Matjes",
        answerD = "Rheinischer Sauerbraten vom Lachs",
        correctAnswer = 2,
        explanation = "Matjes ist junger Hering, der in einer besonderen Salzlake eingelegt wird und besonders zart und mild schmeckt. Er ist besonders an der Nordseeküste und in Norddeutschland beliebt.",
        difficulty = 1,
        funFact = "Das Matjes-Saison beginnt traditionell am letzten Samstag vor dem Johannistag (24. Juni) – der erste Matjes des Jahres ist ein kulinarisches Ereignis in den Niederlanden und Norddeutschland."
    ),

    // Question 44
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen Frischkäse und Hartkäse?",
        answerA = "Frischkäse enthält mehr Fett als Hartkäse",
        answerB = "Frischkäse reift nicht, Hartkäse reift Monate oder Jahre",
        answerC = "Hartkäse wird immer aus Ziegenmilch gemacht",
        answerD = "Frischkäse muss tiefgefroren werden, Hartkäse nicht",
        correctAnswer = 1,
        explanation = "Frischkäse (wie Quark oder Ricotta) wird nicht gereift und direkt nach der Herstellung verzehrt. Hartkäse wie Parmesan oder Bergkäse reift Monate bis Jahre, wodurch er seinen intensiven Geschmack entwickelt.",
        difficulty = 1,
        funFact = "Je länger ein Käse reift, desto intensiver wird sein Geschmack und desto geringer sein Wassergehalt. Alter Parmesan hat weniger als 32 % Wasser – frischer Quark dagegen über 70 %."
    ),

    // Question 45
    Question(
        categoryId = 8,
        questionText = "Welche Vitamin ist besonders reichlich in Zitrusfrüchten enthalten?",
        answerA = "Vitamin D",
        answerB = "Vitamin B12",
        answerC = "Vitamin C",
        answerD = "Vitamin A",
        correctAnswer = 2,
        explanation = "Zitrusfrüchte wie Orangen, Zitronen und Grapefruits sind reich an Vitamin C (Ascorbinsäure), das für das Immunsystem, die Wundheilung und die Eisenaufnahme wichtig ist.",
        difficulty = 1,
        funFact = "Der Mensch kann kein Vitamin C selbst herstellen – anders als die meisten Tiere. Wir müssen es täglich über die Ernährung aufnehmen. Ein Mangel führt zu Skorbut."
    ),

    // Question 46
    Question(
        categoryId = 8,
        questionText = "Was ist Quark?",
        answerA = "Ein gereifter Hartkäse aus Kuhmilch",
        answerB = "Ein Frischkäse aus Sauermilch",
        answerC = "Geronnene Sahne mit Zucker",
        answerD = "Fermentierte Buttermilch",
        correctAnswer = 1,
        explanation = "Quark ist ein Frischkäse, der durch Ansäuern von Milch mit Milchsäurebakterien hergestellt wird. Er wird nicht gereift und direkt verzehrt.",
        difficulty = 1,
        funFact = "Quark ist typisch deutsch und in dieser Form kaum in anderen Ländern bekannt. Außerhalb Deutschlands heißt ähnliches Produkt 'Fromage blanc' (Frankreich) oder 'Tvaroh' (Osteuropa)."
    ),

    // Question 47
    Question(
        categoryId = 8,
        questionText = "Welches Gemüse ist die Hauptzutat für Ratatouille?",
        answerA = "Nur Zucchini und Tomaten",
        answerB = "Auberginen, Zucchini, Paprika und Tomaten",
        answerC = "Karotten, Sellerie und Zwiebeln",
        answerD = "Blumenkohl und Brokkoli",
        correctAnswer = 1,
        explanation = "Ratatouille ist ein provenzalisches Gemüsegericht aus Auberginen, Zucchini, Paprika, Tomaten und Zwiebeln, das in Olivenöl gedünstet wird.",
        difficulty = 1,
        funFact = "Der Name 'Ratatouille' kommt vom französischen Verb 'touiller' (umrühren) – das Gericht war ursprünglich ein einfaches Bauernessen der Provence, das heute als Klassiker der französischen Küche gilt."
    ),

    // Question 48
    Question(
        categoryId = 8,
        questionText = "Was bedeutet das Mindesthaltbarkeitsdatum (MHD) auf einem Lebensmittel?",
        answerA = "Nach diesem Datum ist das Produkt auf jeden Fall verdorben und muss weggeworfen werden",
        answerB = "Bis zu diesem Datum garantiert der Hersteller optimale Qualität – danach ist das Produkt nicht automatisch schlecht",
        answerC = "Das Produkt darf nur bis zu diesem Datum verkauft, nicht aber konsumiert werden",
        answerD = "Das ist das Datum der Herstellung des Produkts",
        correctAnswer = 1,
        explanation = "Das MHD gibt an, bis wann der Hersteller die einwandfreie Qualität garantiert. Danach kann das Produkt oft noch gut sein – das Aussehen, der Geruch und der Geschmack entscheiden.",
        difficulty = 1,
        funFact = "Rund ein Drittel aller Lebensmittel weltweit wird weggeworfen – ein großer Teil davon, weil das MHD überschritten ist, obwohl die Produkte noch genießbar wären. Das MHD ist keine Sicherheitsgrenze."
    ),

    // Question 49
    Question(
        categoryId = 8,
        questionText = "Welche Frucht wird in Deutschland am meisten angebaut?",
        answerA = "Erdbeere",
        answerB = "Kirsche",
        answerC = "Apfel",
        answerD = "Birne",
        correctAnswer = 2,
        explanation = "Der Apfel ist die mit Abstand meistangebaute Obstsorte in Deutschland. Über 1 Million Tonnen Äpfel werden jährlich in Deutschland geerntet.",
        difficulty = 1,
        funFact = "Es gibt weltweit über 20.000 verschiedene Apfelsorten, aber nur etwa 30 bis 50 davon werden kommerziell angebaut. Der beliebteste Apfel in Deutschland ist der Elstar."
    ),

    // Question 50
    Question(
        categoryId = 8,
        questionText = "Wie nennt man das Verfahren, bei dem Lebensmittel durch schnelles Einfrieren bei sehr tiefen Temperaturen haltbar gemacht werden?",
        answerA = "Pasteurisierung",
        answerB = "Sterilisierung",
        answerC = "Tiefkühlung",
        answerD = "Fermentierung",
        correctAnswer = 2,
        explanation = "Tiefkühlung (Einfrieren bei mindestens −18 °C) stoppt das Wachstum von Bakterien und Schimmelpilzen fast vollständig und macht Lebensmittel monate- bis jahrelang haltbar.",
        difficulty = 1,
        funFact = "Clarence Birdseye gilt als Erfinder der modernen Tiefkühlkost: In den 1920er Jahren lernte er von Inuit in Kanada, wie man Fisch durch schnelles Einfrieren frisch hält, und brachte diese Technik in die USA."
    ),

)
