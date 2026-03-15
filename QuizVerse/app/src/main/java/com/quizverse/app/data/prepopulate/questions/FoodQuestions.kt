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
    )
)
