package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestions(): List<Question> = listOf(

    // EASY (10)
    Question(
        categoryId = 8,
        questionText = "Welches Getreide wird für die Herstellung von Bier hauptsächlich verwendet?",
        answerA = "Weizen",
        answerB = "Gerste",
        answerC = "Roggen",
        answerD = "Hafer",
        correctAnswer = 1,
        explanation = "Gerste ist das klassische Braugetreide und wird nach dem Mälzen als Malz zur Bierherstellung verwendet.",
        difficulty = 1,
        funFact = "Deutschland hat über 1.500 Brauereien – mehr als jedes andere Land der Welt."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist der Hauptbestandteil von Guacamole?",
        answerA = "Tomate",
        answerB = "Zwiebel",
        answerC = "Avocado",
        answerD = "Paprika",
        correctAnswer = 2,
        explanation = "Guacamole ist eine mexikanische Sauce, deren Grundlage zerdrückte Avocados sind.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Aus welchem Land stammt die Pizza Margherita ursprünglich?",
        answerA = "Spanien",
        answerB = "Griechenland",
        answerC = "Frankreich",
        answerD = "Italien",
        correctAnswer = 3,
        explanation = "Die Pizza Margherita stammt aus Neapel, Italien, und wurde angeblich 1889 zu Ehren der Königin Margherita kreiert.",
        difficulty = 1,
        funFact = "Die Farben der Pizza Margherita – Rot, Weiß und Grün – spiegeln die italienische Flagge wider."
    ),

    Question(
        categoryId = 8,
        questionText = "Welche Frucht wird für die Herstellung von Wein verwendet?",
        answerA = "Äpfel",
        answerB = "Trauben",
        answerC = "Kirschen",
        answerD = "Pflaumen",
        correctAnswer = 1,
        explanation = "Wein wird traditionell aus fermentierten Weintrauben hergestellt.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist Sushi?",
        answerA = "Ein chinesisches Nudelgericht",
        answerB = "Ein koreanisches Fleischgericht",
        answerC = "Ein japanisches Gericht mit gesäuertem Reis",
        answerD = "Ein thailändisches Currygericht",
        correctAnswer = 2,
        explanation = "Sushi ist ein japanisches Gericht, das aus mit Essig gewürztem Reis besteht, oft kombiniert mit Meeresfrüchten oder Gemüse.",
        difficulty = 1,
        funFact = "Das Wort 'Sushi' bezieht sich auf den gesäuerten Reis, nicht auf den Fisch."
    ),

    Question(
        categoryId = 8,
        questionText = "Welches Gewürz gibt dem Curry seine gelbe Farbe?",
        answerA = "Paprika",
        answerB = "Safran",
        answerC = "Kurkuma",
        answerD = "Ingwer",
        correctAnswer = 2,
        explanation = "Kurkuma (Gelbwurz) enthält den Farbstoff Curcumin, der Curry seine charakteristische gelbe Farbe verleiht.",
        difficulty = 1,
        funFact = "Kurkuma wird seit über 4.000 Jahren in der indischen Medizin und Küche verwendet."
    ),

    Question(
        categoryId = 8,
        questionText = "Wie heißt das traditionelle deutsche Gericht aus Schweinefleisch und Sauerkraut?",
        answerA = "Rouladen",
        answerB = "Kassler mit Sauerkraut",
        answerC = "Sauerbraten",
        answerD = "Schnitzel",
        correctAnswer = 1,
        explanation = "Kassler ist gepökeltes und geräuchertes Schweinefleisch, das traditionell mit Sauerkraut serviert wird.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Welche Nuss steckt in einem Nuss-Nougat-Aufstrich wie Nutella?",
        answerA = "Mandel",
        answerB = "Walnuss",
        answerC = "Haselnuss",
        answerD = "Cashew",
        correctAnswer = 2,
        explanation = "Nutella besteht hauptsächlich aus Haselnüssen und Kakao – Haselnüsse machen etwa 13 % der Rezeptur aus.",
        difficulty = 1,
        funFact = "Jedes Jahr werden für die Produktion von Nutella etwa 25 % der weltweiten Haselnussernte verwendet."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist ein Espresso?",
        answerA = "Kaffee mit viel Milch",
        answerB = "Stark konzentrierter Kaffee in kleiner Menge",
        answerC = "Kaffee mit Schokolade",
        answerD = "Entkoffeinierter Kaffee",
        correctAnswer = 1,
        explanation = "Espresso ist ein stark konzentriertes Kaffeegetränk, das durch Pressen von heißem Wasser durch fein gemahlenes Kaffeepulver hergestellt wird.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Welches Tier liefert uns Mozzarella in seiner ursprünglichsten Form?",
        answerA = "Kuh",
        answerB = "Schaf",
        answerC = "Ziege",
        answerD = "Büffel",
        correctAnswer = 3,
        explanation = "Echter Mozzarella di Bufala wird traditionell aus Büffelmilch hergestellt. Kuhmilch-Mozzarella ist eine verbreitete, günstigere Alternative.",
        difficulty = 1,
        funFact = "Die Büffel in der Campania-Region Italiens produzieren Milch mit einem höheren Fettgehalt als Kuhmilch."
    ),

    // MEDIUM (15)
    Question(
        categoryId = 8,
        questionText = "Welche zwei Hauptzutaten werden für Mayonnaise benötigt?",
        answerA = "Öl und Essig",
        answerB = "Eigelb und Öl",
        answerC = "Sahne und Senf",
        answerD = "Joghurt und Zitrone",
        correctAnswer = 1,
        explanation = "Mayonnaise ist eine Emulsion aus Eigelb und Öl, die durch langsames Einrühren des Öls in das Eigelb entsteht.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was versteht man unter dem Begriff 'Al dente' bei Pasta?",
        answerA = "Sehr weich gekocht",
        answerB = "Mit viel Salz gewürzt",
        answerC = "Leicht bissfest gekocht",
        answerD = "Mit Knoblauch verfeinert",
        correctAnswer = 2,
        explanation = "'Al dente' bedeutet auf Italienisch 'auf den Zahn' und bezeichnet Pasta, die noch leicht bissfest ist.",
        difficulty = 2,
        funFact = "Al-dente-Pasta hat einen niedrigeren glykämischen Index als weichgekochte Pasta."
    ),

    Question(
        categoryId = 8,
        questionText = "Welches Land ist der weltgrößte Kaffeeproduzent?",
        answerA = "Kolumbien",
        answerB = "Äthiopien",
        answerC = "Brasilien",
        answerD = "Vietnam",
        correctAnswer = 2,
        explanation = "Brasilien ist mit großem Abstand der weltgrößte Kaffeeproduzent und liefert etwa ein Drittel des weltweiten Kaffees.",
        difficulty = 2,
        funFact = "Brasilien produziert so viel Kaffee, dass das Land den Weltmarktpreis maßgeblich beeinflusst."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist Kimchi?",
        answerA = "Japanisches Reisgericht",
        answerB = "Koreanisches fermentiertes Gemüse",
        answerC = "Chinesische Suppe",
        answerD = "Vietnamesischer Salat",
        correctAnswer = 1,
        explanation = "Kimchi ist ein koreanisches Nationalgericht, das aus fermentiertem Gemüse – meist Chinakohl – mit Gewürzen besteht.",
        difficulty = 2,
        funFact = "In Südkorea gibt es ein Kimchi-Museum und sogar einen Kimchi-Feiertag."
    ),

    Question(
        categoryId = 8,
        questionText = "Welches Lebensmittel hat den höchsten Vitamin-C-Gehalt unter diesen Optionen?",
        answerA = "Orange",
        answerB = "Zitrone",
        answerC = "Hagebutte",
        answerD = "Kiwi",
        correctAnswer = 2,
        explanation = "Hagebutten enthalten mit bis zu 1.250 mg Vitamin C pro 100g deutlich mehr als Orangen (50 mg) oder Zitronen (53 mg).",
        difficulty = 2,
        funFact = "Eine einzige Hagebutte enthält mehr Vitamin C als eine ganze Orange."
    ),

    Question(
        categoryId = 8,
        questionText = "Aus welcher Region Deutschlands stammt der Schwarzwälder Schinken?",
        answerA = "Bayern",
        answerB = "Thüringen",
        answerC = "Schwarzwald (Baden-Württemberg)",
        answerD = "Westfalen",
        correctAnswer = 2,
        explanation = "Schwarzwälder Schinken ist eine geschützte geografische Angabe und stammt ausschließlich aus dem Schwarzwald in Baden-Württemberg.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Welches Getränk wird aus fermentiertem Tee hergestellt?",
        answerA = "Kefir",
        answerB = "Kombucha",
        answerC = "Ayran",
        answerD = "Lassi",
        correctAnswer = 1,
        explanation = "Kombucha ist ein fermentiertes Teegetränk, das durch einen Symbiosepilz aus Bakterien und Hefen (SCOBY) hergestellt wird.",
        difficulty = 2,
        funFact = "Kombucha wird seit über 2.000 Jahren in Asien konsumiert und wurde als 'Tee des ewigen Lebens' bezeichnet."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist Foie Gras?",
        answerA = "Französische Käsesorte",
        answerB = "Fettleber von Ente oder Gans",
        answerC = "Gebratenes Lammfleisch",
        answerD = "Trüffelsorte",
        correctAnswer = 1,
        explanation = "Foie Gras (Fettleber) ist eine Delikatesse aus der Leber von Enten oder Gänsen, die durch Stopfmast vergrößert wurde.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Welcher Käse wird traditionell für ein echtes Wiener Schnitzel verwendet – zum Überbacken?",
        answerA = "Parmesan",
        answerB = "Emmentaler",
        answerC = "Gar keiner – ein echtes Wiener Schnitzel wird nicht überbacken",
        answerD = "Gouda",
        correctAnswer = 2,
        explanation = "Ein echtes Wiener Schnitzel aus Kalbfleisch wird nicht überbacken. Das 'Schnitzel Wiener Art' mit Käse ist eine abgewandelte Version.",
        difficulty = 2,
        funFact = "Das Wiener Schnitzel muss laut österreichischen Vorschriften aus Kalbfleisch bestehen, um sich so nennen zu dürfen."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist Umami?",
        answerA = "Eine japanische Würzsauce",
        answerB = "Der fünfte Grundgeschmack",
        answerC = "Eine Kochmethode",
        answerD = "Eine Reissorte",
        correctAnswer = 1,
        explanation = "Umami ist der fünfte Grundgeschmack neben süß, sauer, salzig und bitter. Er wird als herzhaft-würzig beschrieben.",
        difficulty = 2,
        funFact = "Der Begriff 'Umami' wurde 1908 vom japanischen Chemiker Kikunae Ikeda geprägt."
    ),

    Question(
        categoryId = 8,
        questionText = "Wie viel Prozent Kakaoanteil muss Bitterschokolade mindestens haben?",
        answerA = "35 %",
        answerB = "50 %",
        answerC = "70 %",
        answerD = "85 %",
        correctAnswer = 1,
        explanation = "Nach EU-Recht muss Bitterschokolade mindestens 35 % Kakaoanteil haben. Für 'Zartbitter' sind es mindestens 43 %.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Welches Öl wird traditionell in der mediterranen Küche bevorzugt verwendet?",
        answerA = "Sonnenblumenöl",
        answerB = "Rapsöl",
        answerC = "Olivenöl",
        answerD = "Kokosöl",
        correctAnswer = 2,
        explanation = "Olivenöl ist ein Grundpfeiler der mediterranen Küche und wird seit Jahrtausenden im Mittelmeerraum angebaut und verwendet.",
        difficulty = 2,
        funFact = "Griechenland hat den höchsten Pro-Kopf-Verbrauch an Olivenöl weltweit."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist ein Boeuf Bourguignon?",
        answerA = "Ein belgisches Kartoffelgericht",
        answerB = "Ein französisches Rindfleischragout mit Rotwein",
        answerC = "Ein Schweizer Käsefondue",
        answerD = "Ein spanisches Lammgericht",
        correctAnswer = 1,
        explanation = "Boeuf Bourguignon ist ein klassisches französisches Schmorgericht aus Rindfleisch, das in Burgunder-Rotwein geschmort wird.",
        difficulty = 2,
        funFact = "Das Gericht stammt aus der Bourgogne-Region und wurde durch Julia Childs Kochbuch in Amerika bekannt."
    ),

    Question(
        categoryId = 8,
        questionText = "Welche Pflanze liefert das Gewürz Vanille?",
        answerA = "Ein Kaktus",
        answerB = "Ein Baum",
        answerC = "Eine Orchidee",
        answerD = "Ein Strauch",
        correctAnswer = 2,
        explanation = "Vanille stammt von der Kletterpflanze Vanilla planifolia, einer Orchideenart. Die Schoten sind die fermentierten Früchte dieser Orchidee.",
        difficulty = 2,
        funFact = "Vanille ist nach Safran das zweitteuerste Gewürz der Welt."
    ),

    Question(
        categoryId = 8,
        questionText = "Was unterscheidet Champagner von normalem Sekt?",
        answerA = "Champagner hat mehr Alkohol",
        answerB = "Champagner kommt ausschließlich aus der Region Champagne in Frankreich",
        answerC = "Champagner wird aus anderen Trauben hergestellt",
        answerD = "Champagner wird ohne Hefe hergestellt",
        correctAnswer = 1,
        explanation = "Champagner ist eine geschützte Herkunftsbezeichnung und darf nur aus der Champagne in Frankreich stammen. Alle anderen Schaumweine sind Sekt oder Crémant.",
        difficulty = 2,
        funFact = null
    ),

    // HARD (12)
    Question(
        categoryId = 8,
        questionText = "Welche Maillard-Reaktion beschreibt das Bräunen von Fleisch beim Braten?",
        answerA = "Eine Oxidationsreaktion zwischen Fetten und Sauerstoff",
        answerB = "Eine Reaktion zwischen Aminosäuren und Zuckern bei Hitze",
        answerC = "Eine Fermentationsreaktion durch Bakterien",
        answerD = "Eine Karamellisierung von Proteinen",
        correctAnswer = 1,
        explanation = "Die Maillard-Reaktion ist eine chemische Reaktion zwischen Aminosäuren und reduzierenden Zuckern, die beim Erhitzen die typische braune Färbung und Aromabildung erzeugt.",
        difficulty = 3,
        funFact = "Die Maillard-Reaktion wurde 1912 vom französischen Arzt Louis-Camille Maillard entdeckt."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist Koji in der japanischen Küche?",
        answerA = "Eine Fischsauce",
        answerB = "Ein Schimmelpilz (Aspergillus oryzae), der für Fermentation verwendet wird",
        answerC = "Eine Reissorte",
        answerD = "Eine Schneidtechnik",
        correctAnswer = 1,
        explanation = "Koji (Aspergillus oryzae) ist ein Schimmelpilz, der auf Reis oder Soja gezüchtet wird und essentielle Grundlage für Sake, Miso und Sojasauce ist.",
        difficulty = 3,
        funFact = "Koji wird manchmal als 'nationaler Schimmelpilz Japans' bezeichnet."
    ),

    Question(
        categoryId = 8,
        questionText = "Welche Weinlage gilt als die kleinste Großlage Deutschlands und produziert einen der teuersten deutschen Weine?",
        answerA = "Scharzhofberg",
        answerB = "Bernkasteler Doctor",
        answerC = "Schloss Johannisberg",
        answerD = "Trockenbeerenauslese vom Rhein",
        correctAnswer = 1,
        explanation = "Bernkasteler Doctor ist eine der bekanntesten und teuersten Weinlagen Deutschlands an der Mosel, mit nur 3,26 Hektar Fläche.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist Sous-vide-Garen?",
        answerA = "Garen über offener Flamme",
        answerB = "Garen im Dampfgarer",
        answerC = "Garen vakuumverpackter Lebensmittel im Wasserbad bei niedrigen Temperaturen",
        answerD = "Garen in einer Salzteigkruste",
        correctAnswer = 2,
        explanation = "Sous vide (französisch: 'unter Vakuum') ist eine Garmethode, bei der Lebensmittel vakuumversiegelt bei präzisen Niedrigtemperaturen im Wasserbad gegart werden.",
        difficulty = 3,
        funFact = "Die Methode wurde in den 1970er Jahren von Georges Pralus entwickelt, um Foie Gras besser zuzubereiten."
    ),

    Question(
        categoryId = 8,
        questionText = "Welche Käsesorte wird ausschließlich in der Region Roquefort-sur-Soulzon hergestellt und mit Penicillium roqueforti gereift?",
        answerA = "Gorgonzola",
        answerB = "Stilton",
        answerC = "Roquefort",
        answerD = "Fourme d'Ambert",
        correctAnswer = 2,
        explanation = "Roquefort ist ein französischer Blauschimmelkäse aus Schafsmilch, der in den Höhlen von Combalou gereift wird und eine geschützte Ursprungsbezeichnung trägt.",
        difficulty = 3,
        funFact = "Roquefort war einer der ersten Käse, der eine AOC-Zertifizierung erhielt – bereits 1925."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist Tempering bei Schokolade?",
        answerA = "Das Hinzufügen von Zucker zur Schokolade",
        answerB = "Ein gezielter Erhitzungs- und Abkühlungsprozess für eine stabile Kristallstruktur",
        answerC = "Das Schmelzen von Schokolade im Wasserbad",
        answerD = "Das Conchieren von Kakaomassse",
        correctAnswer = 1,
        explanation = "Beim Tempering wird Schokolade auf definierte Temperaturen erhitzt und abgekühlt, um die Beta-V-Kristallform des Kakaobutterfetts zu fördern – das gibt Glanz, Knack und Schmelz.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Welches Enzym macht frische Ananas ungeeignet für Gelatinedesserts?",
        answerA = "Amylase",
        answerB = "Bromelain",
        answerC = "Papain",
        answerD = "Lipase",
        correctAnswer = 1,
        explanation = "Bromelain ist eine Protease in frischer Ananas, die Gelatineproteine abbaut und damit das Gelieren verhindert. Erhitzte Ananas (Dose) hat dieses Enzym nicht mehr.",
        difficulty = 3,
        funFact = "Bromelain wird in der Medizin als entzündungshemmendes Mittel eingesetzt."
    ),

    Question(
        categoryId = 8,
        questionText = "Wie nennt man das traditionelle österreichische Gericht aus Kalbslunge und -herz in einer sauren Rahmsauce?",
        answerA = "Tafelspitz",
        answerB = "Zwiebelrostbraten",
        answerC = "Beuschel",
        answerD = "Stelze",
        correctAnswer = 2,
        explanation = "Beuschel ist ein österreichisches Innereien-Ragout aus Kalbslunge und Kalbsherz in einer sauren Sahnesauce mit Kapern und Gewürzgurken.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen Arabica und Robusta bei Kaffeebohnen?",
        answerA = "Arabica hat mehr Koffein und einen stärkeren Geschmack",
        answerB = "Arabica hat weniger Koffein, mehr Aromen; Robusta ist kräftiger und bitterer",
        answerC = "Beide Sorten sind identisch – der Name unterscheidet nur die Herkunft",
        answerD = "Robusta wächst nur in Südamerika",
        correctAnswer = 1,
        explanation = "Arabica (Coffea arabica) hat etwa halb so viel Koffein wie Robusta, aber ein komplexeres Aromaprofil. Robusta ist kräftiger, bitterer und wird oft in Espresso-Blends verwendet.",
        difficulty = 3,
        funFact = "Arabica-Bohnen machen etwa 60–70 % der weltweiten Kaffeeproduktion aus."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Spherification' in der Molekularküche?",
        answerA = "Das Zerstäuben von Flüssigkeiten in einem Aerosol",
        answerB = "Eine Technik, die Flüssigkeiten in kugelförmige Gele verwandelt",
        answerC = "Das Gefrieren von Lebensmitteln in Stickstoff",
        answerD = "Eine Methode zum Schäumen von Suppen",
        correctAnswer = 1,
        explanation = "Spherification ist eine Technik der Molekularküche, bei der Natriumalginat und Calciumchlorid verwendet werden, um Flüssigkeiten in eine Gelschicht einzuhüllen und so Kugeln ('Kaviar') zu erzeugen.",
        difficulty = 3,
        funFact = "Die Technik wurde von Ferran Adrià im Restaurant El Bulli populär gemacht."
    ),

    Question(
        categoryId = 8,
        questionText = "Welches Lebensmittelzusatzstoffkürzel steht für Glutamat?",
        answerA = "E 300",
        answerB = "E 621",
        answerC = "E 440",
        answerD = "E 951",
        correctAnswer = 1,
        explanation = "E 621 ist die EU-Kennzeichnung für Mononatriumglutamat (MSG), das als Geschmacksverstärker eingesetzt wird und den Umami-Geschmack intensiviert.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Welche Technik wird beim Conchieren von Schokolade angewendet?",
        answerA = "Schokolade wird bei sehr hohen Temperaturen kurz erhitzt",
        answerB = "Schokoladenmasse wird stundenlang unter Wärme gemischt und belüftet",
        answerC = "Kakaobohnen werden getrocknet",
        answerD = "Schokolade wird mit Milchpulver vermischt",
        correctAnswer = 1,
        explanation = "Beim Conchieren wird Schokoladenmasse bis zu 78 Stunden lang erhitzt, geknetet und belüftet, um unerwünschte Aromen zu entfernen und Feinheit zu erreichen.",
        difficulty = 3,
        funFact = "Rodolphe Lindt erfand 1879 die Conchiermaschine, was den Durchbruch für zarte Schokolade bedeutete."
    ),

    // EXPERT (8)
    Question(
        categoryId = 8,
        questionText = "Welcher Wein-Klassifikation unterwirft sich das Château Pétrus, eines der teuersten Bordeaux?",
        answerA = "Premier Grand Cru Classé A",
        answerB = "Es ist nicht in die offizielle Klassifikation von 1855 eingestuft",
        answerC = "Grand Cru Classé",
        answerD = "Deuxième Grand Cru Classé",
        correctAnswer = 1,
        explanation = "Pétrus aus dem Pomerol-Appellation gehört keiner offiziellen Klassifikation an, da Pomerol nie klassifiziert wurde – trotzdem gilt es als eines der wertvollsten Weine der Welt.",
        difficulty = 4,
        funFact = "Eine Flasche Pétrus 1945 wurde für über 195.000 Euro versteigert."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Nduja'?",
        answerA = "Ein sizilianisches Olivenöl mit Basilikum",
        answerB = "Eine streichfähige, sehr scharfe Salami aus Kalabrien",
        answerC = "Ein sardischer Hartkäse",
        answerD = "Ein neapolitanisches Brotgebäck",
        correctAnswer = 1,
        explanation = "'Nduja ist eine kalabrische Spezialität: eine streichfähige, sehr pikante Rohwurst aus Schweinefleisch und einer großen Menge Chilischoten.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Welche Aminosäure ist für den stechenden Geruch von gebratenen Zwiebeln hauptverantwortlich?",
        answerA = "Glutamin",
        answerB = "Cystein-Sulfoxid-Verbindungen (z.B. Propenylcysteinsulfoxid)",
        answerC = "Lysin",
        answerD = "Tryptophan",
        correctAnswer = 1,
        explanation = "Zwiebeln enthalten Cysteinsulfoxid-Verbindungen. Beim Erhitzen entstehen durch enzymatische Reaktionen Thiosulfinate und andere schwefelhaltige Verbindungen, die den typischen Geruch erzeugen.",
        difficulty = 4,
        funFact = "Beim Schneiden von Zwiebeln entsteht Propanthial-S-oxid, das die Augen zum Tränen bringt."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Brut Nature' und 'Demi-Sec' bei Champagner?",
        answerA = "Brut Nature enthält keinerlei zugesetzten Zucker (<3g/l); Demi-Sec ist deutlich süßer (32–50 g/l)",
        answerB = "Brut Nature ist teurer als Demi-Sec",
        answerC = "Brut Nature kommt aus dem Norden der Champagne",
        answerD = "Es gibt keinen Unterschied – beides bezeichnet trockenen Champagner",
        correctAnswer = 0,
        explanation = "Champagner-Kategorien nach Zuckergehalt: Brut Nature 0–3 g/l, Extra Brut 0–6 g/l, Brut 0–12 g/l, Extra Dry 12–17 g/l, Sec 17–32 g/l, Demi-Sec 32–50 g/l.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Welches natürliche Emulgiermittel wird aus Sojalecithin oder Eigelb gewonnen und in der Lebensmittelindustrie weit verbreitet eingesetzt?",
        answerA = "Xanthan",
        answerB = "Lecithin (E 322)",
        answerC = "Carrageen (E 407)",
        answerD = "Guar-Gum (E 412)",
        correctAnswer = 1,
        explanation = "Lecithin (E 322) ist ein natürlicher Emulgator, der aus Soja oder Eigelb extrahiert wird. Es stabilisiert Emulsionen wie Mayonnaise oder Schokolade.",
        difficulty = 4,
        funFact = "Das Wort 'Lecithin' kommt vom griechischen 'lekithos' (Eigelb)."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Kopi Luwak' und warum ist er so teuer?",
        answerA = "Ein vietnamesischer Kaffee, der im Dunkeln fermentiert wird",
        answerB = "Ein Kaffee aus Kaffeebohnen, die vom Luwak (Fleckenmusang) gefressen und wieder ausgeschieden werden",
        answerC = "Ein sehr seltener äthiopischer Wildkaffee",
        answerD = "Ein japanischer Kaffee mit spezieller Röstmethode",
        correctAnswer = 1,
        explanation = "Kopi Luwak ist ein indonesischer Kaffee, bei dem Kaffeebohnen vom Fleckenmusang (Luwak) gefressen, im Verdauungstrakt fermentiert und dann aus dem Kot gesammelt werden.",
        difficulty = 4,
        funFact = "Kopi Luwak kann bis zu 700 Euro pro Kilogramm kosten."
    ),

    Question(
        categoryId = 8,
        questionText = "Was bezeichnet man in der Patisserie als 'Ganache'?",
        answerA = "Eine Zuckerglasurmasse",
        answerB = "Eine Emulsion aus Schokolade und Sahne (Fett)",
        answerC = "Eine Buttercremetorte",
        answerD = "Ein Biskuitteig mit Mandeln",
        correctAnswer = 1,
        explanation = "Ganache ist eine Emulsion aus Schokolade und Sahne (manchmal auch Butter), die als Füllung, Überzug oder Trüffelkern verwendet wird.",
        difficulty = 4,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Welcher Prozess macht Oliven essbar, die roh aufgrund von Oleuropein extrem bitter sind?",
        answerA = "Pasteurisierung",
        answerB = "Laktofermentation oder Lauge-Behandlung (Entbittern)",
        answerC = "Räuchern",
        answerD = "Gefriertrocknung",
        correctAnswer = 1,
        explanation = "Rohe Oliven enthalten Oleuropein, das extrem bitter ist. Durch Einlegen in Salzlake (Laktofermentation) oder Natriumhydroxid-Lösung wird das Oleuropein abgebaut.",
        difficulty = 4,
        funFact = "Dieser Entbitterungsprozess kann je nach Methode zwischen wenigen Stunden und mehreren Monaten dauern."
    ),

    // MASTER (5)
    Question(
        categoryId = 8,
        questionText = "Welche spezifische chemische Verbindung ist hauptverantwortlich für den Geschmack von Vanille?",
        answerA = "Eugenol",
        answerB = "Vanillin (4-Hydroxy-3-methoxybenzaldehyd)",
        answerC = "Thymol",
        answerD = "Linalool",
        correctAnswer = 1,
        explanation = "Vanillin (4-Hydroxy-3-methoxybenzaldehyd) ist die Hauptaromaverbindung in Vanille. Heute wird es hauptsächlich synthetisch oder aus Lignin gewonnen.",
        difficulty = 5,
        funFact = "Synthetisches Vanillin ist chemisch identisch mit natürlichem Vanillin aus Vanilleschoten."
    ),

    Question(
        categoryId = 8,
        questionText = "Was beschreibt das 'Hautes Côtes de Nuits'-Appellation im Burgund?",
        answerA = "Einen Grand-Cru-Weinberg in Gevrey-Chambertin",
        answerB = "Dörfer auf den Hochplateaus westlich der Côte de Nuits mit regionalem AOC-Status",
        answerC = "Die Kategorie für alle Pinot-Noir-Weine aus dem Burgund",
        answerD = "Einen Premier-Cru-Weinberg in Vosne-Romanée",
        correctAnswer = 1,
        explanation = "Hautes Côtes de Nuits bezeichnet Weine aus Dörfern auf den Höhenzügen westlich der berühmten Côte de Nuits. Sie haben einen Regional-AOC-Status und sind oft preiswerter als die klassischen Côte-de-Nuits-Weine.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Welcher chemische Prozess erklärt, warum Fleisch nach dem Schlachten zunächst hart (Totenstarre) wird und dann durch Reifung wieder zart?",
        answerA = "Oxidation der Proteine durch Sauerstoff",
        answerB = "ATP-Abbau führt zu Aktomyosin-Bindung; endogene Proteasen (Calpaine, Cathepsine) bauen dann Myofibrillen ab",
        answerC = "Bakterielle Fermentation der Muskelfasern",
        answerD = "Koagulation von Kollagen durch Körperwärme",
        correctAnswer = 1,
        explanation = "Nach dem Tod erschöpft sich ATP, was zu Aktomyosin-Bindung (Totenstarre) führt. Beim Reifen bauen Proteasen (Calpaine, Cathepsine) Myofibrillen ab, das Fleisch wird wieder zart.",
        difficulty = 5,
        funFact = "Das sogenannte 'Dry Aged'-Fleisch wird oft 28–120 Tage gereift, um maximale Zartheit und Aromatik zu entwickeln."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Terroir' im Weinbau und welche Faktoren umfasst es?",
        answerA = "Ausschließlich die Bodenart eines Weinbergs",
        answerB = "Die Gesamtheit aller Umweltfaktoren (Boden, Klima, Mikroklima, Topografie, Weinbergspraxis), die den Charakter eines Weins prägen",
        answerC = "Die Rebsorte und das Alter der Reben",
        answerD = "Die Kellerausstattung und Reifetechnik",
        correctAnswer = 1,
        explanation = "Terroir umfasst alle natürlichen Faktoren eines Weinbergs: Geologie, Bodenstruktur, Topografie, Makro- und Mikroklima sowie menschliche Einflüsse wie Rebschnitt und Erziehungssystem.",
        difficulty = 5,
        funFact = "Der Begriff 'Terroir' stammt aus dem Französischen und hat keine direkte Übersetzung in andere Sprachen."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Transglutaminase' und wozu wird sie in der Lebensmittelindustrie eingesetzt?",
        answerA = "Ein Süßungsmittel auf Basis von Gluten",
        answerB = "Ein Enzym, das Proteine durch kovalente Bindungen verbindet und zum 'Verkleben' von Fleischstücken verwendet wird",
        answerC = "Ein Konservierungsstoff für Fleischprodukte",
        answerD = "Ein Emulgator für Wurstwaren",
        correctAnswer = 1,
        explanation = "Transglutaminase (oft 'Fleischkleber' genannt) ist ein Enzym, das Glutamin- und Lysin-Reste in Proteinen vernetzt und so Fleischstücke oder Proteine zusammenklebt. Es wird für 'restructured meat'-Produkte verwendet.",
        difficulty = 5,
        funFact = "Transglutaminase kommt natürlich in menschlichen Blutzellen vor und spielt eine Rolle bei der Blutgerinnung."
    ),

    // NEW EASY (15)
    Question(
        categoryId = 8,
        questionText = "Welche Frucht ist die Hauptzutat von Apfelstrudel?",
        answerA = "Birne",
        answerB = "Pflaume",
        answerC = "Apfel",
        answerD = "Kirsche",
        correctAnswer = 2,
        explanation = "Apfelstrudel wird aus einem hauchdünnen Strudelteig mit einer Füllung aus Äpfeln, Zucker, Rosinen und Zimt hergestellt.",
        difficulty = 1,
        funFact = "Der Wiener Apfelstrudel ist seit 2008 als immaterielles Kulturerbe Österreichs anerkannt."
    ),

    Question(
        categoryId = 8,
        questionText = "Wie nennt man das Einmachen von Lebensmitteln in Salz oder Salzlake?",
        answerA = "Räuchern",
        answerB = "Pökeln",
        answerC = "Marinieren",
        answerD = "Blanchieren",
        correctAnswer = 1,
        explanation = "Pökeln ist eine Konservierungsmethode, bei der Fleisch oder Fisch durch Salz, manchmal mit Nitritpökelsalz, haltbar gemacht wird.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Welches Getränk wird aus gepressten Äpfeln hergestellt?",
        answerA = "Traubensaft",
        answerB = "Orangensaft",
        answerC = "Apfelsaft",
        answerD = "Birnensaft",
        correctAnswer = 2,
        explanation = "Apfelsaft wird durch Pressen von Äpfeln gewonnen. Je nach Verarbeitung entsteht naturtrüber oder geklärter Apfelsaft.",
        difficulty = 1,
        funFact = "Deutschland ist einer der größten Apfelsaft-Produzenten weltweit."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist Tofu?",
        answerA = "Ein fermentiertes Reisprodukt",
        answerB = "Geronnene und gepresste Sojamilch",
        answerC = "Getrocknete Meeresfrüchte",
        answerD = "Ein Weizenprodukt",
        correctAnswer = 1,
        explanation = "Tofu wird hergestellt, indem Sojamilch zum Gerinnen gebracht und die entstehende Masse gepresst wird – ähnlich wie Käse aus Kuhmilch.",
        difficulty = 1,
        funFact = "Tofu enthält alle neun essentiellen Aminosäuren und ist eine wichtige Proteinquelle in der asiatischen Küche."
    ),

    Question(
        categoryId = 8,
        questionText = "Wie heißt die bekannteste deutsche Bratwurst aus Thüringen?",
        answerA = "Nürnberger Rostbratwurst",
        answerB = "Currywurst",
        answerC = "Thüringer Rostbratwurst",
        answerD = "Weißwurst",
        correctAnswer = 2,
        explanation = "Die Thüringer Rostbratwurst ist eine der ältesten und bekanntesten deutschen Bratwürste, gewürzt u. a. mit Majoran und Kümmel.",
        difficulty = 1,
        funFact = "Das älteste bekannte Rezept der Thüringer Rostbratwurst stammt aus dem Jahr 1404."
    ),

    Question(
        categoryId = 8,
        questionText = "Welche Milch wird für die Herstellung von Butter verwendet?",
        answerA = "Kokosmilch",
        answerB = "Sojamilch",
        answerC = "Mandelmilch",
        answerD = "Kuhmilch (Rahm)",
        correctAnswer = 3,
        explanation = "Butter wird durch Aufrahmen und Verbuttern von Kuhmilch hergestellt. Der Rahm (Sahne) enthält den hohen Fettanteil, der für Butter nötig ist.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist Pesto alla Genovese?",
        answerA = "Eine Tomatensauce aus Genua",
        answerB = "Eine Sauce aus Basilikum, Pinienkernen, Parmesan, Knoblauch und Olivenöl",
        answerC = "Ein Nudelteig mit Spinat",
        answerD = "Eine Fleischsauce aus Norditalien",
        correctAnswer = 1,
        explanation = "Pesto alla Genovese ist eine unerhitzte Sauce aus frischem Basilikum, Pinienkernen, Parmigiano Reggiano, Knoblauch und nativem Olivenöl extra.",
        difficulty = 1,
        funFact = "Der Name 'Pesto' leitet sich vom Verb 'pestare' (zerstampfen) ab – traditionell wird Pesto im Mörser zubereitet."
    ),

    Question(
        categoryId = 8,
        questionText = "Welche Farbe hat reifer Emmentaler Käse?",
        answerA = "Weiß",
        answerB = "Blau",
        answerC = "Hellgelb",
        answerD = "Orange",
        correctAnswer = 2,
        explanation = "Emmentaler hat eine hellgelbe bis elfenbeinfarbene Masse und ist bekannt für seine charakteristischen Löcher (Augen), die durch CO₂-produzierende Bakterien entstehen.",
        difficulty = 1,
        funFact = "Die Löcher im Emmentaler entstehen durch Propionsäurebakterien, die CO₂ produzieren."
    ),

    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Pasteurisieren'?",
        answerA = "Lebensmittel einfrieren",
        answerB = "Lebensmittel kurz stark erhitzen um Keime abzutöten",
        answerC = "Lebensmittel mit Salz konservieren",
        answerD = "Lebensmittel vakuumieren",
        correctAnswer = 1,
        explanation = "Pasteurisieren ist ein Verfahren, bei dem Lebensmittel kurzzeitig auf 72–85 °C erhitzt werden, um Krankheitserreger abzutöten und die Haltbarkeit zu verlängern.",
        difficulty = 1,
        funFact = "Das Verfahren wurde nach Louis Pasteur benannt, der es im 19. Jahrhundert entwickelte."
    ),

    Question(
        categoryId = 8,
        questionText = "Welches Gewürz wird aus getrocknetem Chili gewonnen?",
        answerA = "Kreuzkümmel",
        answerB = "Paprikapulver",
        answerC = "Cayennepfeffer",
        answerD = "Koriander",
        correctAnswer = 2,
        explanation = "Cayennepfeffer wird aus getrockneten und gemahlenen Cayennechilis hergestellt und ist für seine starke Schärfe bekannt.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist ein Croissant?",
        answerA = "Ein italienisches Gebäck aus Brandteig",
        answerB = "Ein französisches Plundergebäck aus Blätterteig mit Butter",
        answerC = "Ein deutsches Hefegebäck",
        answerD = "Ein Schweizer Waffeln-Gebäck",
        correctAnswer = 1,
        explanation = "Das Croissant ist ein französisches Gebäck aus einem mit viel Butter tourtierten Hefeteig, das seinen charakteristischen Blätterteig-Charakter durch mehrfaches Falten erhält.",
        difficulty = 1,
        funFact = "Das Croissant hat seinen Ursprung im österreichischen Kipferl und kam über Wiener Bäcker nach Paris."
    ),

    Question(
        categoryId = 8,
        questionText = "Welcher Käse schmilzt am besten und wird klassisch für Käsespätzle verwendet?",
        answerA = "Parmesan",
        answerB = "Bergkäse / Allgäuer Emmentaler",
        answerC = "Feta",
        answerD = "Ricotta",
        correctAnswer = 1,
        explanation = "Für Käsespätzle wird traditionell Allgäuer Bergkäse oder Emmentaler verwendet, da diese gut schmelzen und ein kräftiges Aroma haben.",
        difficulty = 1,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Aus welcher Pflanze wird Zimt gewonnen?",
        answerA = "Aus der Rinde eines Zimtbaums",
        answerB = "Aus den Blüten einer Orchidee",
        answerC = "Aus den Samen einer Grassorte",
        answerD = "Aus den Früchten eines Strauches",
        correctAnswer = 0,
        explanation = "Zimt wird aus der inneren Rinde von Zimtbäumen (Gattung Cinnamomum) gewonnen. Die Rinde wird abgeschält, getrocknet und rollt sich dabei zu Zimtstangen auf.",
        difficulty = 1,
        funFact = "Ceylon-Zimt aus Sri Lanka gilt als der hochwertigere 'echte' Zimt im Vergleich zum günstigeren Cassia-Zimt."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist Risotto?",
        answerA = "Ein italienisches Reisgericht, das durch schrittweises Zugeben von Brühe cremig wird",
        answerB = "Eine spanische Paella-Variante",
        answerC = "Ein griechisches Nudelgericht",
        answerD = "Ein französisches Kartoffelgericht",
        correctAnswer = 0,
        explanation = "Risotto ist ein norditalienisches Gericht, bei dem Rundkornreis (z. B. Arborio) durch schrittweises Einrühren von heißer Brühe cremig gegart wird.",
        difficulty = 1,
        funFact = "Das Stärke-Protein des Rundkornreises gibt Risotto seine charakteristische cremige Konsistenz."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen Sahne und Crème fraîche?",
        answerA = "Crème fraîche ist fermentiert und säuerlicher als Sahne",
        answerB = "Sahne ist fermentiert, Crème fraîche nicht",
        answerC = "Beide sind identisch",
        answerD = "Crème fraîche enthält mehr Wasser",
        correctAnswer = 0,
        explanation = "Crème fraîche ist eine fermentierte Sahne mit mindestens 30 % Fett und einem leicht säuerlichen Geschmack. Sahne ist nicht fermentiert.",
        difficulty = 1,
        funFact = null
    ),

    // NEW MEDIUM (20)
    Question(
        categoryId = 8,
        questionText = "Welche Temperatur sollte Rindfleisch mindestens erreichen, um 'medium' gebraten zu sein?",
        answerA = "45 °C",
        answerB = "55–60 °C",
        answerC = "70 °C",
        answerD = "80 °C",
        correctAnswer = 1,
        explanation = "Ein 'medium' gebratenes Steak hat eine Kerntemperatur von etwa 55–60 °C. Das Fleisch ist innen noch rosa und saftig.",
        difficulty = 2,
        funFact = "Bei 'well done' liegt die Kerntemperatur über 70 °C – das Fleisch verliert dann deutlich mehr Saft."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen Béchamel- und Velouté-Sauce?",
        answerA = "Beide sind identisch – nur der Name unterscheidet sich regional",
        answerB = "Béchamel wird mit Milch, Velouté mit hellem Fond (Kalb/Geflügel) hergestellt",
        answerC = "Béchamel enthält Tomaten, Velouté nicht",
        answerD = "Velouté wird mit Rotwein zubereitet",
        correctAnswer = 1,
        explanation = "Beide sind klassische Grundsaucen (Mère-Saucen) auf Mehlschwitze-Basis: Béchamel verwendet Milch als Flüssigkeit, Velouté hellen Geflügel- oder Kalbsfond.",
        difficulty = 2,
        funFact = "Auguste Escoffier definierte fünf klassische Grundsaucen der französischen Küche, die sogenannten 'Mère-Saucen'."
    ),

    Question(
        categoryId = 8,
        questionText = "Welches Land gilt als Ursprungsland des Hummus?",
        answerA = "Ägypten",
        answerB = "Griechenland",
        answerC = "Levante (Naher Osten – Libanon, Israel, Syrien)",
        answerD = "Türkei",
        correctAnswer = 2,
        explanation = "Hummus (arabisch für 'Kichererbsen') stammt aus der Levante-Region und wird aus Kichererbsen, Tahini, Zitronensaft und Knoblauch hergestellt.",
        difficulty = 2,
        funFact = "Libanon und Israel streiten seit Jahren diplomatisch über die 'Erfindung' des Hummus."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist Tahini?",
        answerA = "Eine türkische Joghurtsauce",
        answerB = "Eine Paste aus gemahlenen Sesamsamen",
        answerC = "Ein arabisches Fladenbrot",
        answerD = "Eine nordafrikanische Gewürzmischung",
        correctAnswer = 1,
        explanation = "Tahini ist eine Paste aus geschälten, gerösteten und gemahlenen Sesamsamen. Sie ist Bestandteil von Hummus, Baba Ganoush und vielen anderen Gerichten.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was sind Capers (Kapern)?",
        answerA = "Eingelegte unreife Blütenknospen des Kapernstrauchs",
        answerB = "Kleine grüne Oliven",
        answerC = "Getrocknete Tomaten",
        answerD = "Eingelegte Gurkenfrüchte",
        correctAnswer = 0,
        explanation = "Kapern sind die eingelegten, unreifen Blütenknospen des Kapernstrauchs (Capparis spinosa). Sie haben einen salzigen, leicht bitteren Geschmack.",
        difficulty = 2,
        funFact = "Kapern werden traditionell in Salzlake oder Salz eingelegt und sind ein typisches Mittelmeer-Produkt."
    ),

    Question(
        categoryId = 8,
        questionText = "Welches Lebensmittel hat den höchsten Eiweißgehalt pro 100 g?",
        answerA = "Hähnchenbrust",
        answerB = "Thunfisch (Dose)",
        answerC = "Parmesan",
        answerD = "Linsen (gekocht)",
        correctAnswer = 2,
        explanation = "Parmesan (Parmigiano Reggiano) hat mit etwa 36 g Eiweiß pro 100 g einen außergewöhnlich hohen Proteingehalt, der durch den langen Reifungsprozess entsteht.",
        difficulty = 2,
        funFact = "Parmesan reift mindestens 12 Monate – DOP-Produkte reifen 24 bis 36 Monate oder länger."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist ein Consommé?",
        answerA = "Ein dick eingekochtes Fleischragout",
        answerB = "Eine geklärte, klare Fleischbrühe",
        answerC = "Eine Cremesuppe mit Sahne",
        answerD = "Ein Kaltaufschnitt",
        correctAnswer = 1,
        explanation = "Consommé ist eine durch Klärfleisch (Hackfleisch, Eiweiß, Gemüse) geklärte, glasklare Kraftbrühe – ein Grundpfeiler der klassischen französischen Küche.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Welche Reissorte wird für Sushi verwendet?",
        answerA = "Basmati",
        answerB = "Wildreis",
        answerC = "Jasminreis",
        answerD = "Japanischer Rundkornreis (Shari)",
        correctAnswer = 3,
        explanation = "Für Sushi wird japanischer Rundkornreis (Koshihikari oder ähnliche Sorten) verwendet, der nach dem Kochen mit einer Mischung aus Reisessig, Zucker und Salz gewürzt wird.",
        difficulty = 2,
        funFact = "Der gewürzte Sushi-Reis heißt 'Shari' oder 'Sumeshi' (Essig-Reis)."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist Miso?",
        answerA = "Ein japanisches Reiswein-Getränk",
        answerB = "Eine fermentierte Paste aus Sojabohnen",
        answerC = "Ein chinesisches Nudelgericht",
        answerD = "Eine koreanische Chilipaste",
        correctAnswer = 1,
        explanation = "Miso ist eine japanische Würzpaste aus fermentierten Sojabohnen, Salz und Koji-Pilz. Es gibt helles (shiro), rotes (aka) und gemischtes (awase) Miso.",
        difficulty = 2,
        funFact = "Misosuppe wird in Japan täglich von Millionen Menschen zum Frühstück gegessen."
    ),

    Question(
        categoryId = 8,
        questionText = "Was macht den Unterschied zwischen Joghurt und Kefir?",
        answerA = "Kefir enthält sowohl Milchsäurebakterien als auch Hefen und ist leicht alkoholisch",
        answerB = "Joghurt ist flüssiger als Kefir",
        answerC = "Kefir wird aus Ziegenmilch hergestellt",
        answerD = "Beide sind identisch – nur der Name unterscheidet sich",
        correctAnswer = 0,
        explanation = "Kefir entsteht durch eine gemischte Fermentation mit Milchsäurebakterien UND Hefen, was zu einer leicht prickelnden, minimal alkoholischen Konsistenz führt. Joghurt wird nur durch Milchsäurebakterien fermentiert.",
        difficulty = 2,
        funFact = "Kefirkörner sind Zooglea – eine Symbiose aus Bakterien und Hefen in einer Polysaccharid-Matrix."
    ),

    Question(
        categoryId = 8,
        questionText = "Welches Gewürz wird aus den Staubfäden der Krokusblüte gewonnen?",
        answerA = "Kardamom",
        answerB = "Muskatnuss",
        answerC = "Safran",
        answerD = "Piment",
        correctAnswer = 2,
        explanation = "Safran wird aus den Narben der Safran-Krokusblüte (Crocus sativus) gewonnen. Pro Blüte gibt es nur drei Narben, die von Hand geerntet werden müssen.",
        difficulty = 2,
        funFact = "Für 1 kg Safran werden etwa 150.000 bis 200.000 Blüten und bis zu 400 Arbeitsstunden benötigt."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist Tapioka?",
        answerA = "Ein Verdickungsmittel aus Maniokwurzel-Stärke",
        answerB = "Ein japanisches Fischprodukt",
        answerC = "Eine afrikanische Hülsenfrucht",
        answerD = "Ein Zuckerersatzstoff aus Mais",
        correctAnswer = 0,
        explanation = "Tapioka ist eine Stärke, die aus der Maniokwurzel (Cassava) gewonnen wird. Es wird als Verdickungsmittel und für Bubble-Tea-Perlen verwendet.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Buttermilch'?",
        answerA = "Milch mit extra Butterfett",
        answerB = "Das flüssige Nebenprodukt der Butterherstellung",
        answerC = "Aufgeschlagene Sahne",
        answerD = "Mit Butter angereicherte Vollmilch",
        correctAnswer = 1,
        explanation = "Buttermilch ist die Flüssigkeit, die beim Verbuttern von Rahm übrig bleibt. Sie hat einen niedrigen Fettgehalt und einen leicht säuerlichen Geschmack.",
        difficulty = 2,
        funFact = "Handelsübliche Buttermilch ist oft fermentierterte Magermilch – kein echtes Nebenprodukt der Butterherstellung."
    ),

    Question(
        categoryId = 8,
        questionText = "Welcher Pilz wird in der europäischen Küche als teuerster einheimischer Pilz gehandelt?",
        answerA = "Champignon",
        answerB = "Shiitake",
        answerC = "Pfifferling",
        answerD = "Trüffel",
        correctAnswer = 3,
        explanation = "Trüffel, besonders der weiße Alba-Trüffel (Tuber magnatum) und der schwarze Périgord-Trüffel (Tuber melanosporum), gehören zu den teuersten Lebensmitteln weltweit.",
        difficulty = 2,
        funFact = "Weiße Trüffel aus Alba können bis zu 5.000 Euro pro Kilogramm kosten."
    ),

    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'Blanchieren' in der Kochkunst?",
        answerA = "Lebensmittel in Öl frittieren",
        answerB = "Lebensmittel kurz in kochendes Wasser tauchen und dann sofort in Eiswasser abschrecken",
        answerC = "Lebensmittel langsam im Ofen garen",
        answerD = "Lebensmittel in Sahne einkochen",
        correctAnswer = 1,
        explanation = "Blanchieren ist ein kurzes Überbrühen von Lebensmitteln in kochendem Salzwasser mit anschließendem schnellen Abschrecken in Eiswasser, um Farbe, Biss und Nährstoffe zu erhalten.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist Rucola?",
        answerA = "Eine Kräutersorte der Minzfamilie",
        answerB = "Ein Blattsalat mit pfeffrig-nussigem Geschmack aus der Raketenfamilie",
        answerC = "Eine Kresseart",
        answerD = "Ein in Deutschland heimischer Feldsalat",
        correctAnswer = 1,
        explanation = "Rucola (auch Rauke oder Rocket) ist ein Kreuzblütler mit würzig-pfeffrigem Geschmack. Er stammt aus dem Mittelmeerraum und ist eine typische Zutat der italienischen Küche.",
        difficulty = 2,
        funFact = "Rucola war in der Antike bekannt und wurde auch als Aphrodisiakum verwendet."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist das Besondere an Wagyu-Rindfleisch?",
        answerA = "Es kommt aus Wagyu, einer Region in Südkorea",
        answerB = "Es hat eine außergewöhnlich starke intramuskuläre Fettmarmorierung",
        answerC = "Es stammt von einer wild lebenden Rinderrasse",
        answerD = "Es hat einen niedrigeren Fettgehalt als normales Rindfleisch",
        correctAnswer = 1,
        explanation = "Wagyu-Rinder (japanisch: 'japanisches Rind') produzieren Fleisch mit extrem feiner intramuskulärer Fettmarmorierung, die für einen außergewöhnlich buttrigen Geschmack und zarte Textur sorgt.",
        difficulty = 2,
        funFact = "Echtes Kobe-Beef ist eine spezielle Wagyu-Untersorte und darf nur in der Präfektur Hyōgo produziert werden."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen Mehl Type 405 und Type 1050?",
        answerA = "Type 405 enthält mehr Mineralstoffe und ist dunkler",
        answerB = "Type 1050 enthält mehr Mineralstoffe aus Randschichten des Korns und ist dunkler",
        answerC = "Beide sind identisch – die Zahl bezeichnet nur den Hersteller",
        answerD = "Type 405 eignet sich besser für Brot, Type 1050 für Kuchen",
        correctAnswer = 1,
        explanation = "Die Type-Zahl gibt den Mineralstoffgehalt in mg pro 100 g Trockenmasse an. Type 1050 enthält mehr Randschichten des Korns, ist dunkler und nährstoffreicher als das helle Type 405.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist ein Tapenade?",
        answerA = "Ein provenzalischer Brotaufstrich aus Oliven, Kapern und Sardellen",
        answerB = "Ein spanisches Olivenöl",
        answerC = "Eine griechische Vorspeise aus Joghurt",
        answerD = "Ein französischer Käse",
        correctAnswer = 0,
        explanation = "Tapenade ist eine provenzalische Paste aus gehackten Oliven, Kapern, Sardellen und Olivenöl. Das Wort leitet sich vom provenzalischen 'tapéno' (Kapern) ab.",
        difficulty = 2,
        funFact = "Tapenade stammt aus der Provence und wurde erstmals 1880 im Restaurant La Maison Dorée in Marseille erwähnt."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist das traditionelle mexikanische Gericht 'Mole'?",
        answerA = "Eine scharfe Tomaten-Salsa",
        answerB = "Eine komplexe Sauce aus Chili, Schokolade, Gewürzen und oft Hühnchen",
        answerC = "Ein gefüllter Maistortilla",
        answerD = "Ein Maisbrei",
        correctAnswer = 1,
        explanation = "Mole ist eine mexikanische Sauce mit bis zu 30 Zutaten, darunter verschiedene Chilis, Schokolade, Nüsse, Gewürze und Tomatillos. Mole negro aus Oaxaca gilt als eines der komplexesten Gerichte der Welt.",
        difficulty = 2,
        funFact = "Ein traditionelles Mole-Rezept kann 2–3 Tage Zubereitungszeit erfordern."
    ),

    // NEW HARD (15)
    Question(
        categoryId = 8,
        questionText = "Was ist 'Osmose' in Bezug auf das Salzen von Fleisch und Gemüse?",
        answerA = "Salz zieht durch die Zellmembran Wasser aus dem Lebensmittel heraus",
        answerB = "Salz verteilt sich gleichmäßig durch aktiven Transport",
        answerC = "Osmose beschreibt das Einziehen von Salz in die Zelle",
        answerD = "Salz zerstört die Zellmembran durch chemische Reaktion",
        correctAnswer = 0,
        explanation = "Wenn Salz auf Lebensmittel gegeben wird, entsteht außen eine höhere Salzkonzentration. Durch Osmose wandert Wasser aus dem Zellinneren (niedrigerer Salzgehalt) durch die semipermeable Membran nach außen.",
        difficulty = 3,
        funFact = "Dieses Prinzip nutzt man beim Entwässern von Gurken oder Zucchini mit Salz vor dem Braten."
    ),

    Question(
        categoryId = 8,
        questionText = "Welche Aromastoffe entstehen beim Rösten von Kaffeebohnen hauptsächlich?",
        answerA = "Nur Koffein und Tannine",
        answerB = "Furanone, Pyrazine und Thiole durch Maillard-Reaktion und Karamellisierung",
        answerC = "Ausschließlich Chlorogensäuren",
        answerD = "Ätherische Öle aus der Kaffeekirsche",
        correctAnswer = 1,
        explanation = "Beim Rösten entstehen durch Maillard-Reaktion und Karamellisierung über 800 flüchtige Aromaverbindungen, darunter Furanone (karamellartig), Pyrazine (nussig-röstartig) und Thiole (kaffeetypisch).",
        difficulty = 3,
        funFact = "Grüner Kaffee ist geschmacksneutral – erst das Rösten erzeugt das charakteristische Kaffeearoma."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Deglacieren' beim Kochen?",
        answerA = "Einen Fond durch Zugabe von Flüssigkeit (Wein, Brühe) vom Bratensatz lösen",
        answerB = "Eine Sauce durch Reduktion eindicken",
        answerC = "Tiefgefrorene Lebensmittel schonend auftauen",
        answerD = "Zucker in einer Pfanne karamellisieren",
        correctAnswer = 0,
        explanation = "Beim Deglacieren gibt man nach dem Anbraten Flüssigkeit (Wein, Cognac, Brühe) in die heiße Pfanne, um den karamellisierten Bratensatz (der voller Aromen steckt) zu lösen und in die Sauce zu integrieren.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Winterspeck' bei einer Gans und warum ist er kulinarisch bedeutsam?",
        answerA = "Das ist intramuskuläres Fett, das die Gans für den Winter einlagert und für einen besonderen Geschmack sorgt",
        answerB = "Eine spezielle Fettschicht unter der Gänsehaut, die beim Braten wichtige Aromen freisetzt und die Haut knusprig macht",
        answerC = "Ein Begriff für das Fett älterer Gänse im Dezember",
        answerD = "Das Bauchfett der Gans, das entfernt werden muss",
        correctAnswer = 1,
        explanation = "Die dicke Unterhautfettschicht der Martinsgans dient dem Tier als Energiereserve. Beim langen, langsamen Garen schmilzt dieses Fett durch die Haut und macht sie außen knusprig, während das Fleisch saftig bleibt.",
        difficulty = 3,
        funFact = "Eine Martinsgans sollte traditionell nach dem 11. November (Martinstag) verzehrt werden."
    ),

    Question(
        categoryId = 8,
        questionText = "Was beschreibt die 'Hydrolyse von Kollagen' beim langen Schmoren von Fleisch?",
        answerA = "Kollagen (Bindegewebe) wird durch Säure aufgespalten",
        answerB = "Kollagen wandelt sich durch lang anhaltende Hitze und Wasser in Gelatine um",
        answerC = "Proteinketten werden durch Enzyme zersetzt",
        answerD = "Fett wird in das Kollagengerüst eingelagert",
        correctAnswer = 1,
        explanation = "Bei Temperaturen über 70 °C und langer Garzeit hydrolysiert Kollagen (Bindegewebsprotein) und wandelt sich in lösliche Gelatine um. Das macht zähes Fleisch (Schulter, Haxe) nach stundenlangem Schmoren zart und saftig.",
        difficulty = 3,
        funFact = "Dieser Vorgang ist der Grund, warum Schmorgerichte mit viel Bindegewebe (Ossobuco, Boeuf Bourguignon) so reichhaltige Saucen entwickeln."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Lactobacillus bulgaricus' und welche Rolle spielt er?",
        answerA = "Ein Schimmelpilz für Käsereifung",
        answerB = "Ein Milchsäurebakterium, das essenziell für die Joghurtherstellung ist",
        answerC = "Ein Hefestamm für Brotbacken",
        answerD = "Ein Konservierungsmittel in Wurstwaren",
        correctAnswer = 1,
        explanation = "Lactobacillus delbrueckii subsp. bulgaricus ist eines der beiden Bakterien (neben Streptococcus thermophilus), die für die Joghurtfermentation notwendig sind. Es wandelt Laktose in Milchsäure um und sorgt für den sauren Geschmack.",
        difficulty = 3,
        funFact = "Echter bulgarischer Joghurt nutzt Stämme aus Bulgarien, die sich von anderen Joghurt-Stämmen unterscheiden."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Schockfrosten' und warum ist es besser als langsames Einfrieren?",
        answerA = "Durch langsames Einfrieren entstehen größere Eiskristalle, die Zellstrukturen zerstören; Schockfrosten erzeugt kleinere Kristalle",
        answerB = "Schockfrosten tötet mehr Bakterien ab",
        answerC = "Schockfrosten spart mehr Energie",
        answerD = "Beide Methoden sind gleichwertig für die Lebensmittelqualität",
        correctAnswer = 0,
        explanation = "Beim langsamen Einfrieren bilden sich große Eiskristalle, die Zellwände durchstechen und beim Auftauen zu Qualitätsverlust führen. Schockfrosten (-40 °C oder kälter) erzeugt sehr kleine Kristalle, die Zellstrukturen intakt lassen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Guanciale' und worin unterscheidet es sich von Pancetta?",
        answerA = "Guanciale wird aus der Schweinewange hergestellt, Pancetta aus dem Bauch",
        answerB = "Beide sind identisch – regionale Namen für dasselbe Produkt",
        answerC = "Guanciale ist geräuchert, Pancetta nicht",
        answerD = "Pancetta stammt aus dem Kopf, Guanciale aus dem Bauch",
        correctAnswer = 0,
        explanation = "Guanciale (von 'guancia' = Wange) ist gepökeltes, luftgetrocknetes Schweinebackenfleisch mit höherem Fettanteil. Pancetta wird aus dem Schweinebauch hergestellt. Für authentische Carbonara und Amatriciana wird Guanciale verwendet.",
        difficulty = 3,
        funFact = "In Rom gilt die Verwendung von Speck oder Pancetta in Carbonara als Ketzerei – nur Guanciale ist akzeptiert."
    ),

    Question(
        categoryId = 8,
        questionText = "Was beschreibt der Begriff 'Gluten' in Bezug auf Mehl?",
        answerA = "Ein natürlicher Zucker in Getreide",
        answerB = "Ein Kleberprotein aus Gliadin und Glutenin, das Teig elastisch und dehnbar macht",
        answerC = "Ein Ballaststoff in Weizenkleie",
        answerD = "Ein Stärkepolysaccharid",
        correctAnswer = 1,
        explanation = "Gluten entsteht wenn Wasser zu Mehl gegeben wird und sich die Proteine Gliadin und Glutenin verbinden. Das entstehende Glutennetzwerk gibt Teig Elastizität und hält Gärgase beim Backen zurück.",
        difficulty = 3,
        funFact = "Bei Zöliakie löst Gluten eine Autoimmunreaktion aus, die die Dünndarmschleimhaut schädigt."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Mirepoix' in der klassischen Küche?",
        answerA = "Eine Würzmischung aus Kräutern",
        answerB = "Ein aromatisches Gemüsebett aus Zwiebeln, Karotten und Sellerie (2:1:1) als Geschmacksbasis",
        answerC = "Eine Schneidetechnik für Brunoise",
        answerD = "Ein französischer Fond aus Gemüse",
        correctAnswer = 1,
        explanation = "Mirepoix ist die klassische aromatische Gemüsebasis der französischen Küche: 2 Teile Zwiebeln, 1 Teil Karotten, 1 Teil Sellerie. Es bildet die Geschmacksgrundlage für Fonds, Saucen und Schmorgerichte.",
        difficulty = 3,
        funFact = "Mirepoix wurde nach dem Duc de Lévis-Mirepoix benannt, einem Höfling Ludwigs XV."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Prosciutto di Parma' und wie unterscheidet er sich von normalem Schinken?",
        answerA = "Er ist geräuchert und hat einen starken Rauchgeschmack",
        answerB = "Er ist luftgetrockneter Rohschinken aus der Region Parma, der nur mit Salz – ohne Nitrite – gereift wird",
        answerC = "Er wird aus Wildschwein hergestellt",
        answerD = "Er ist gekochter Schinken mit einer speziellen Würzung",
        correctAnswer = 1,
        explanation = "Prosciutto di Parma ist ein DOP-geschützter, luftgetrockneter Rohschinken aus Parma. Er wird ausschließlich mit Meersalz ohne weitere Zusatzstoffe oder Nitrite mindestens 12 Monate gereift.",
        difficulty = 3,
        funFact = "Die Schweine für Prosciutto di Parma werden mit Molke aus der Parmesankäseherstellung gefüttert."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Homogenisierung' bei Milch?",
        answerA = "Das Pasteurisieren bei hohen Temperaturen",
        answerB = "Das mechanische Zerstören der Fettkügelchen, damit Sahne sich nicht mehr absetzt",
        answerC = "Das Anreichern von Milch mit Vitaminen",
        answerD = "Das Entfernen von Laktose aus der Milch",
        correctAnswer = 1,
        explanation = "Bei der Homogenisierung wird Milch unter hohem Druck durch feine Düsen gepresst, wodurch die Fettkügelchen so klein werden, dass sie gleichmäßig verteilt bleiben und sich keine Rahmschicht mehr bildet.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Dashi' in der japanischen Küche?",
        answerA = "Ein Reisweinessig",
        answerB = "Ein heller Fond aus Kombu-Algen und Bonitoflocken (Katsuobushi)",
        answerC = "Eine Sojasaucenvariation",
        answerD = "Ein fermentiertes Gemüsegericht",
        correctAnswer = 1,
        explanation = "Dashi ist der grundlegende Kochfond der japanischen Küche, hergestellt aus Kombu-Algen und getrockneten Bonitoflocken (Katsuobushi). Er bildet die Basis für Misosuppe, Ramen und viele Saucen.",
        difficulty = 3,
        funFact = "Dashi enthält natürlich Glutaminsäure und Inosinsäure – beide lösen den Umami-Geschmack aus."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Sauerteig' und was bewirken die Mikroorganismen darin?",
        answerA = "Sauerteig ist nur ein anderer Name für Hefe",
        answerB = "Sauerteig enthält wild vorkommende Hefen und Milchsäurebakterien, die Teig lockern und sauer machen",
        answerC = "Sauerteig ist ein chemisches Backtriebmittel wie Backpulver",
        answerD = "Sauerteig enthält ausschließlich Essigsäurebakterien",
        correctAnswer = 1,
        explanation = "Sauerteig ist eine Symbiose aus wilden Hefen (Triebkraft) und Milchsäurebakterien (Aroma, Säure, Konservierung). Die Hefen produzieren CO₂ für die Lockerung, die Bakterien erzeugen Milch- und Essigsäure.",
        difficulty = 3,
        funFact = "Ein gut gepflegter Sauerteigstarter kann Jahrzehnte oder sogar Jahrhunderte alt werden."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Agar-Agar' und woher stammt es?",
        answerA = "Ein tierisches Geliermittel aus Knochen wie Gelatine",
        answerB = "Ein pflanzliches Geliermittel aus Rotalgen, das auch für vegane Desserts geeignet ist",
        answerC = "Ein synthetisches Verdickungsmittel aus der Lebensmittelindustrie",
        answerD = "Ein Stärkeprodukt aus Tapioka",
        correctAnswer = 1,
        explanation = "Agar-Agar (E 406) ist ein Polysaccharid aus Rotalgen (v. a. Gelidium, Gracilaria). Es geliert stärker als Gelatine und ist bei Raumtemperatur stabil – ideal als vegane Alternative zu tierischer Gelatine.",
        difficulty = 3,
        funFact = "Agar-Agar wird auch in der Mikrobiologie als Nährboden für Bakterienkulturen verwendet."
    )
)
