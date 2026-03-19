package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsEasy2(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 8,
        questionText = "Aus welchem Land stammt das Gericht Paella?",
        answerA = "Portugal",
        answerB = "Italien",
        answerC = "Spanien",
        answerD = "Griechenland",
        correctAnswer = 2,
        explanation = "Paella ist ein traditionelles Reisgericht aus der spanischen Region Valencia. Es wird typischerweise mit Safran, Gemüse und Meeresfrüchten oder Fleisch zubereitet.",
        difficulty = 1,
        funFact = "Der Name 'Paella' kommt vom lateinischen Wort 'patella', was so viel wie 'Pfanne' bedeutet — benannt nach der flachen Eisenpfanne, in der es gekocht wird."
    ),

    // Question 2
    Question(
        categoryId = 8,
        questionText = "Welches Getränk wird aus Kaffeebohnen hergestellt?",
        answerA = "Tee",
        answerB = "Kakao",
        answerC = "Espresso",
        answerD = "Limonade",
        correctAnswer = 2,
        explanation = "Espresso ist ein starkes Kaffeegetränk, das durch das Pressen von heißem Wasser durch fein gemahlene Kaffeebohnen hergestellt wird.",
        difficulty = 1,
        funFact = "In Italien wird Espresso meistens im Stehen an der Bar getrunken — das Sitzen kostet oft extra, weil man dann für den Tischservice zahlt."
    ),

    // Question 3
    Question(
        categoryId = 8,
        questionText = "Welches Gewürz wird aus getrocknetem Safran gewonnen und ist das teuerste Gewürz der Welt?",
        answerA = "Vanille",
        answerB = "Zimt",
        answerC = "Kardamom",
        answerD = "Safran",
        correctAnswer = 3,
        explanation = "Safran ist das teuerste Gewürz der Welt und wird aus den Narben der Safranpflanze gewonnen. Für ein Kilogramm Safran werden bis zu 200.000 Blüten benötigt.",
        difficulty = 1,
        funFact = "Safran wurde schon im antiken Ägypten verwendet — sowohl als Gewürz als auch als Heilmittel und Farb­stoff für Stoffe."
    ),

    // Question 4
    Question(
        categoryId = 8,
        questionText = "Was ist das Hauptgetreide in einem klassischen Croissant?",
        answerA = "Roggen",
        answerB = "Hafer",
        answerC = "Mais",
        answerD = "Weizenmehl",
        correctAnswer = 3,
        explanation = "Ein Croissant wird aus feinem Weizenmehl hergestellt. Durch das Einarbeiten von Butter in viele Teigschichten entsteht das typische blättrige Gebäck.",
        difficulty = 1,
        funFact = "Obwohl das Croissant als französisch gilt, stammt es ursprünglich aus Österreich — es ist die Weiterentwicklung des Wiener Kipferls."
    ),

    // Question 5
    Question(
        categoryId = 8,
        questionText = "Welches Nationalgericht ist typisch für Japan?",
        answerA = "Pad Thai",
        answerB = "Ramen",
        answerC = "Pho",
        answerD = "Bibimbap",
        correctAnswer = 1,
        explanation = "Ramen ist eine japanische Nudelsuppe auf Brühenbasis, die mit verschiedenen Einlagen wie Fleisch, Ei und Gemüse serviert wird. Es gibt regionale Variationen in ganz Japan.",
        difficulty = 1,
        funFact = "Japan hat über 35.000 Ramen-Restaurants — und ein eigenes Ramen-Museum in Yokohama, das die Geschichte der Nudelsuppe zeigt."
    ),

    // Question 6
    Question(
        categoryId = 8,
        questionText = "Welches Gewürz heißt auf Deutsch auch 'Pfefferkraut' und wird häufig beim Grillen verwendet?",
        answerA = "Rosmarin",
        answerB = "Bohnenkraut",
        answerC = "Thymian",
        answerD = "Oregano",
        correctAnswer = 1,
        explanation = "Bohnenkraut wird wegen seiner pfeffrigen Note auch 'Pfefferkraut' genannt. Es passt hervorragend zu Hülsenfrüchten, Fleisch und gegrilltem Gemüse.",
        difficulty = 1,
        funFact = "Im Mittelalter galt Bohnenkraut als Aphrodisiakum — weshalb es in Klostergärten manchmal verboten war."
    ),

    // Question 7
    Question(
        categoryId = 8,
        questionText = "Aus welchem Land kommt das Nationalgericht 'Fish and Chips'?",
        answerA = "Australien",
        answerB = "Kanada",
        answerC = "Vereinigtes Königreich",
        answerD = "Irland",
        correctAnswer = 2,
        explanation = "Fish and Chips ist das bekannteste Fast-Food-Gericht Großbritanniens. Es besteht aus frittiertem Fisch im Bierteig und dicken Pommes frites.",
        difficulty = 1,
        funFact = "Fish and Chips war im Zweiten Weltkrieg in Großbritannien eines der wenigen Lebensmittel, das nicht rationiert wurde — um die Moral der Bevölkerung zu stärken."
    ),

    // Question 8
    Question(
        categoryId = 8,
        questionText = "Welche Zutat macht Brot beim Backen locker und luftig?",
        answerA = "Salz",
        answerB = "Hefe",
        answerC = "Butter",
        answerD = "Zucker",
        correctAnswer = 1,
        explanation = "Hefe ist ein Mikroorganismus, der Zucker in Kohlendioxid und Alkohol umwandelt. Das entstehende CO₂ lässt den Teig aufgehen und macht das Brot locker.",
        difficulty = 1,
        funFact = "Menschen backen Brot mit Hefe seit über 6.000 Jahren — die ältesten Belege stammen aus dem alten Ägypten."
    ),

    // Question 9
    Question(
        categoryId = 8,
        questionText = "Welches Getränk wird traditionell zur britischen Teezeit getrunken?",
        answerA = "Grüner Tee",
        answerB = "Kamillentee",
        answerC = "Schwarztee mit Milch",
        answerD = "Pfefferminztee",
        correctAnswer = 2,
        explanation = "Beim britischen Afternoon Tea wird klassisch schwarzer Tee, oft Assam oder Darjeeling, mit einem Schuss Milch getrunken. Dazu werden Scones, Sandwiches und Kuchen gereicht.",
        difficulty = 1,
        funFact = "Die Tradition des Afternoon Tea wurde um 1840 von Anna, der Herzogin von Bedford, eingeführt, weil sie zwischen Mittag- und Abendessen hungrig wurde."
    ),

    // Question 10
    Question(
        categoryId = 8,
        questionText = "Welches typische Gewürz gehört zu Zimt, Nelken und Sternanis — und wird oft für Weihnachtsgebäck verwendet?",
        answerA = "Koriander",
        answerB = "Lebkuchengewürz",
        answerC = "Cayennepfeffer",
        answerD = "Muskatnuss",
        correctAnswer = 3,
        explanation = "Muskatnuss ist ein weihnachtliches Gewürz, das in vielen Lebkuchen- und Spekulatiusrezepten verwendet wird. Es verleiht Gebäck eine warme, leicht nussige Note.",
        difficulty = 1,
        funFact = "Muskatnuss war im Mittelalter so wertvoll wie Gold — Händler machten damit auf der Gewürzstraße riesige Gewinne."
    ),

    // Question 11
    Question(
        categoryId = 8,
        questionText = "Aus welcher Frucht wird Orangensaft hergestellt?",
        answerA = "Mandarine",
        answerB = "Grapefruit",
        answerC = "Zitrone",
        answerD = "Orange",
        correctAnswer = 3,
        explanation = "Orangensaft wird aus frisch gepressten oder pasteurisierten Orangen gewonnen. Er ist reich an Vitamin C und gehört weltweit zu den beliebtesten Fruchtsäften.",
        difficulty = 1,
        funFact = "Brasilien ist der weltgrößte Orangensaft-Produzent und liefert etwa 80 % des weltweit gehandelten Konzentrats."
    ),

    // Question 12
    Question(
        categoryId = 8,
        questionText = "Welches Land ist bekannt für sein Nationalgericht 'Borschtsch' — eine Rote-Bete-Suppe?",
        answerA = "Polen",
        answerB = "Rumänien",
        answerC = "Ukraine",
        answerD = "Ungarn",
        correctAnswer = 2,
        explanation = "Borschtsch ist eine traditionelle Suppe aus der osteuropäischen Küche, vor allem aus der Ukraine. Sie wird aus Rote Bete, Kohl, Kartoffeln und Fleisch gekocht.",
        difficulty = 1,
        funFact = "Die UNESCO hat Borschtsch im Jahr 2022 als immaterielles Kulturerbe der Menschheit anerkannt — als Symbol der ukrainischen Identität."
    ),

    // Question 13
    Question(
        categoryId = 8,
        questionText = "Welche Backware wird aus Blätterteig hergestellt und hat eine luftige, knusprige Schicht?",
        answerA = "Brezel",
        answerB = "Milchbrötchen",
        answerC = "Croissant",
        answerD = "Baguette",
        correctAnswer = 2,
        explanation = "Das Croissant wird aus Blätterteig gebacken — einem Teig, in den durch wiederholtes Falten und Ausrollen viele Schichten Butter eingearbeitet werden.",
        difficulty = 1,
        funFact = "Ein handgemachtes Croissant bei einem Pariser Bäcker erfordert mindestens 32 Butterfalten — das ist der Grund für die vielen knusprigen Schichten."
    ),

    // Question 14
    Question(
        categoryId = 8,
        questionText = "Welches Getränk wird aus vergorenem Apfelsaft hergestellt?",
        answerA = "Apfelschorle",
        answerB = "Apfelessig",
        answerC = "Apfelwein",
        answerD = "Apfelnektar",
        correctAnswer = 2,
        explanation = "Apfelwein (auch Cidre oder Cider) entsteht durch die alkoholische Gärung von Apfelsaft. Hefe wandelt den Zucker im Saft in Alkohol und Kohlendioxid um.",
        difficulty = 1,
        funFact = "Die Hessen nennen ihren Apfelwein liebevoll 'Äbbelwoi' und trinken ihn traditionell aus gerippten Gläsern, den sogenannten Gerippten."
    ),

    // Question 15
    Question(
        categoryId = 8,
        questionText = "Welches Gewürz gibt Lebkuchen seinen typischen Geschmack?",
        answerA = "Paprika",
        answerB = "Zimt",
        answerC = "Kümmel",
        answerD = "Kumin",
        correctAnswer = 1,
        explanation = "Zimt ist das Hauptgewürz in Lebkuchen und vielen anderen Weihnachtsgebäcken. Es wird aus der Rinde des Zimtbaums gewonnen und hat einen süßlich-warmen Geschmack.",
        difficulty = 1,
        funFact = "Es gibt zwei Hauptsorten Zimt: den edlen Ceylon-Zimt und den günstigeren Cassia-Zimt. In deutschen Supermärkten ist meistens Cassia-Zimt erhältlich."
    ),

    // Question 16
    Question(
        categoryId = 8,
        questionText = "Welches Gericht ist das Nationalgericht Mexikos?",
        answerA = "Burrito",
        answerB = "Nachos",
        answerC = "Mole Poblano",
        answerD = "Enchilada",
        correctAnswer = 2,
        explanation = "Mole Poblano gilt als eines der aufwändigsten mexikanischen Gerichte. Die Sauce besteht aus über 20 Zutaten, darunter Chili, Schokolade, Gewürze und Nüsse.",
        difficulty = 1,
        funFact = "Die Zubereitung von Mole Poblano kann mehrere Tage dauern — in Mexiko ist es ein Festtagsgericht, das für besondere Anlässe wie Hochzeiten gekocht wird."
    ),

    // Question 17
    Question(
        categoryId = 8,
        questionText = "Was ist Matcha?",
        answerA = "Ein Reis-Dessert aus Thailand",
        answerB = "Eine Sorte grünes Tee-Pulver aus Japan",
        answerC = "Ein indisches Gewürz",
        answerD = "Ein chinesischer Reisschnaps",
        correctAnswer = 1,
        explanation = "Matcha ist fein gemahlenes Grüntee-Pulver aus Japan. Die Teepflanzen werden vor der Ernte abgeschattet, was den Chlorophyllgehalt erhöht und den Tee intensiv grün macht.",
        difficulty = 1,
        funFact = "Für eine traditionelle japanische Teezeremonie muss man jahrelang üben. Das Aufschlagen von Matcha mit einem Bambusbesen (Chasen) ist eine Kunstform."
    ),

    // Question 18
    Question(
        categoryId = 8,
        questionText = "Aus welchem Tier stammt die Milch, die für echten Mozzarella di Bufala verwendet wird?",
        answerA = "Ziege",
        answerB = "Schaf",
        answerC = "Wasserbüffel",
        answerD = "Kuh",
        correctAnswer = 2,
        explanation = "Echter Mozzarella di Bufala Campana wird aus der Milch von Wasserbüffeln hergestellt und hat eine g.U.-Zertifizierung (geschützte Ursprungsbezeichnung) aus Kampanien, Italien.",
        difficulty = 1,
        funFact = "Büffelmilch enthält doppelt so viel Fett wie Kuhmilch — das macht Büffelmozzarella cremiger und aromatischer als die Kuhvariante."
    ),

    // Question 19
    Question(
        categoryId = 8,
        questionText = "Welches typische Getränk wird in Äthiopien aus Kaffeebohnen und Butter zubereitet?",
        answerA = "Bulletproof Coffee",
        answerB = "Café au Lait",
        answerC = "Türkischer Kaffee",
        answerD = "Bunna",
        correctAnswer = 3,
        explanation = "Bunna ist der äthiopische Name für Kaffee. In der traditionellen äthiopischen Kaffeezeremonie wird er in kleinen Tassen ohne Henkel serviert, manchmal mit Butter oder Salz.",
        difficulty = 1,
        funFact = "Äthiopien gilt als Ursprungsland des Kaffees. Die Legende sagt, ein Ziegenhirte namens Kaldi entdeckte die belebende Wirkung der Kaffeebeeren, als seine Ziegen davon fraßen."
    ),

    // Question 20
    Question(
        categoryId = 8,
        questionText = "Welche Süßigkeit wird aus Zucker und Kakaobutter ohne Kakaomasse hergestellt?",
        answerA = "Vollmilchschokolade",
        answerB = "Weiße Schokolade",
        answerC = "Zartbitterschokolade",
        answerD = "Marzipan",
        correctAnswer = 1,
        explanation = "Weiße Schokolade enthält keine Kakaomasse und deshalb auch kein Theobromin. Sie besteht aus Kakaobutter, Zucker und Milchpulver.",
        difficulty = 1,
        funFact = "Streng genommen ist weiße Schokolade nach manchen Definitionen gar keine 'echte' Schokolade, weil sie keine Kakaofeststoffe enthält."
    ),

    // Question 21
    Question(
        categoryId = 8,
        questionText = "Welches traditionelle indische Brot wird in einem Tandoor-Lehmofen gebacken?",
        answerA = "Pita",
        answerB = "Tortilla",
        answerC = "Naan",
        answerD = "Chapati",
        correctAnswer = 2,
        explanation = "Naan ist ein weiches indisches Fladenbrot, das traditionell an der Innenwand eines heißen Tandoor-Lehmofens gebacken wird. Es wird oft mit Butter oder Knoblauch serviert.",
        difficulty = 1,
        funFact = "Ein Tandoor-Ofen erreicht Temperaturen von bis zu 480 °C — das Naan ist deshalb in weniger als 2 Minuten fertig gebacken."
    ),

    // Question 22
    Question(
        categoryId = 8,
        questionText = "Was ist Hummus?",
        answerA = "Ein Reissalat aus dem Libanon",
        answerB = "Eine Dip-Paste aus Kichererbsen",
        answerC = "Ein Fischgericht aus Ägypten",
        answerD = "Ein Lammgericht aus Marokko",
        correctAnswer = 1,
        explanation = "Hummus ist ein cremiger Dip aus püriertem Kichererbsen, Tahini (Sesammus), Zitronensaft, Knoblauch und Olivenöl. Er ist ein Grundnahrungsmittel in der Levante-Küche.",
        difficulty = 1,
        funFact = "Im Jahr 2010 bereitete Libanon eine Schüssel Hummus mit über 10.000 Kilogramm zu — ein Weltrekord, um den Ursprung des Gerichts zu beanspruchen."
    ),

    // Question 23
    Question(
        categoryId = 8,
        questionText = "Welches Getränk entsteht, wenn man Wasser mit Kohlensäure versetzt?",
        answerA = "Mineralwasser",
        answerB = "Sprudelwasser",
        answerC = "Leitungswasser",
        answerD = "Quellwasser",
        correctAnswer = 1,
        explanation = "Sprudelwasser (oder Mineralwasser mit Kohlensäure) entsteht, wenn Kohlendioxid unter Druck in Wasser gelöst wird. Das gibt dem Wasser seine prickelnde Eigenschaft.",
        difficulty = 1,
        funFact = "Joseph Priestley erfand 1767 das erste künstliche Sprudelwasser — er hängte einfach eine Schüssel Wasser über einen Bottich mit gärendem Bier."
    ),

    // Question 24
    Question(
        categoryId = 8,
        questionText = "Welche Kräutersorte wird auch als 'Basilikum' bezeichnet?",
        answerA = "Oregano",
        answerB = "Majoran",
        answerC = "Basilikum",
        answerD = "Petersilie",
        correctAnswer = 2,
        explanation = "Basilikum ist ein aromatisches Kraut aus der Familie der Lippenblütengewächse. Es ist ein Grundbestandteil der italienischen Küche und unverzichtbar für Pesto.",
        difficulty = 1,
        funFact = "Der Name 'Basilikum' stammt vom griechischen Wort 'basileus', was 'König' bedeutet — es galt als das Königskraut der Küche."
    ),

    // Question 25
    Question(
        categoryId = 8,
        questionText = "Welches Land trinkt weltweit am meisten Tee pro Kopf?",
        answerA = "China",
        answerB = "Indien",
        answerC = "Japan",
        answerD = "Türkei",
        correctAnswer = 3,
        explanation = "Die Türkei hat pro Kopf den höchsten Teeverbrauch der Welt. Türkischer Tee (Çay) wird in charakteristischen doppelstöckigen Kannen gebraut und in tulpenförmigen Gläsern serviert.",
        difficulty = 1,
        funFact = "Ein Türke trinkt im Durchschnitt über 3 Kilogramm Tee pro Jahr — das entspricht mehr als 1.000 Tassen jährlich."
    ),

    // Question 26
    Question(
        categoryId = 8,
        questionText = "Welches Gewürz wird aus der Schale von Orangen und Zitronen gewonnen?",
        answerA = "Zitronengras",
        answerB = "Zitronenpfeffer",
        answerC = "Abrieb",
        answerD = "Zitronenmelisse",
        correctAnswer = 2,
        explanation = "Zitronenpfeffer ist eine Gewürzmischung aus schwarzem Pfeffer und getrocknetem Zitronenschalenabrieb. Er wird häufig zum Würzen von Fisch und Geflügel verwendet.",
        difficulty = 1,
        funFact = "In der Küche heißt die fein geriebene Außenschale von Zitrusfrüchten 'Zeste' — sie enthält die ätherischen Öle und damit das meiste Aroma der Frucht."
    ),

    // Question 27
    Question(
        categoryId = 8,
        questionText = "Welches Gericht ist ein klassisches französisches Frühstück?",
        answerA = "Croissant mit Konfitüre",
        answerB = "Porridge",
        answerC = "Toast mit Spiegelei",
        answerD = "Pfannkuchen mit Ahornsirup",
        correctAnswer = 0,
        explanation = "Das klassische französische Frühstück besteht aus einem Croissant oder Baguette mit Butter und Konfitüre sowie einer Tasse Café au Lait oder heißer Schokolade.",
        difficulty = 1,
        funFact = "In Frankreich ist das Frühstück die kleinste Mahlzeit des Tages — das Mittagessen ist traditionell die Hauptmahlzeit."
    ),

    // Question 28
    Question(
        categoryId = 8,
        questionText = "Was ist Kimchi?",
        answerA = "Ein japanisches Sushi-Gericht",
        answerB = "Ein chinesischer Reisbrei",
        answerC = "Ein fermentiertes koreanisches Gemüsegericht",
        answerD = "Ein thailändisches Curry",
        correctAnswer = 2,
        explanation = "Kimchi ist ein fermentiertes Gemüsegericht aus Korea, meist aus Chinakohl mit Chili, Knoblauch, Ingwer und Frühlingszwiebeln. Es ist reich an Probiotika.",
        difficulty = 1,
        funFact = "Koreanische Haushalte besitzen oft spezielle Kimchi-Kühlschränke, die auf die optimale Gärtemperatur von Kimchi eingestellt sind."
    ),

    // Question 29
    Question(
        categoryId = 8,
        questionText = "Welche Pflanze liefert den Rohstoff für Kokosöl?",
        answerA = "Ölpalme",
        answerB = "Kokospalme",
        answerC = "Sonnenblume",
        answerD = "Raps",
        correctAnswer = 1,
        explanation = "Kokosöl wird aus dem Fruchtfleisch (Kopra) der Kokosnuss gewonnen, der Frucht der Kokospalme. Es ist bei Raumtemperatur fest und wird zum Braten und Backen verwendet.",
        difficulty = 1,
        funFact = "Die Kokospalme wird auf tropischen Inseln als 'Baum des Lebens' bezeichnet, weil fast alle Teile der Pflanze — Früchte, Blätter, Holz und Fasern — genutzt werden können."
    ),

    // Question 30
    Question(
        categoryId = 8,
        questionText = "Welche typische Süßspeise kommt aus Österreich?",
        answerA = "Schwarzwälder Kirschtorte",
        answerB = "Sachertorte",
        answerC = "Baumkuchen",
        answerD = "Donauwelle",
        correctAnswer = 1,
        explanation = "Die Sachertorte ist eine weltberühmte österreichische Schokoladentorte mit Marillenmarmeladenfüllung und Schokoladenglasur. Sie wurde 1832 von Franz Sacher erfunden.",
        difficulty = 1,
        funFact = "Um das originale Rezept der Sachertorte wurde ein jahrelanger Rechtsstreit zwischen dem Hotel Sacher und der Konditorei Demel geführt — erst 1963 endete er."
    ),

    // Question 31
    Question(
        categoryId = 8,
        questionText = "Welches Getränk enthält Koffein und wird aus dem Kakaobaum gewonnen?",
        answerA = "Tee",
        answerB = "Kakao",
        answerC = "Mate",
        answerD = "Energy Drink",
        correctAnswer = 1,
        explanation = "Kakao wird aus den Samen des Kakaobaums hergestellt. Er enthält natürliches Koffein sowie Theobromin, ein ähnlich wirkendes Stimulans.",
        difficulty = 1,
        funFact = "Die Azteken tranken Kakao als bitteres Getränk mit Chili und betrachteten ihn als göttliches Elixier. Süßer Kakao mit Milch kam erst durch die Europäer auf."
    ),

    // Question 32
    Question(
        categoryId = 8,
        questionText = "Aus welchem Land stammt das Gericht 'Moussaka'?",
        answerA = "Türkei",
        answerB = "Griechenland",
        answerC = "Bulgarien",
        answerD = "Libanon",
        correctAnswer = 1,
        explanation = "Moussaka ist ein Auflauf aus der griechischen Küche, der aus Auberginen, Hackfleisch und einer Béchamelsauce besteht. Es gibt Variationen im gesamten Mittelmeerraum.",
        difficulty = 1,
        funFact = "Die griechische Version von Moussaka, wie wir sie heute kennen, wurde Anfang des 20. Jahrhunderts von Nikolaos Tselementes modernisiert, der in Frankreich ausgebildet wurde."
    ),

    // Question 33
    Question(
        categoryId = 8,
        questionText = "Welches Triebmittel wird beim Backen von Kuchen anstelle von Hefe verwendet?",
        answerA = "Natriumchlorid",
        answerB = "Backpulver",
        answerC = "Zitronensäure",
        answerD = "Weinsteinpulver",
        correctAnswer = 1,
        explanation = "Backpulver ist eine Mischung aus Natriumhydrogencarbonat und einer Säure (z.B. Weinsteinpulver). Beim Backen entsteht Kohlendioxid, das den Teig auflockert.",
        difficulty = 1,
        funFact = "Backpulver wurde 1843 in England von Alfred Bird erfunden, weil seine Frau allergisch auf Hefe war — er wollte ihr trotzdem Brot backen können."
    ),

    // Question 34
    Question(
        categoryId = 8,
        questionText = "Welches ist das Hauptgetränk bei einer traditionellen deutschen Kaffeetafel?",
        answerA = "Schwarztee",
        answerB = "Espresso",
        answerC = "Filterkaffee",
        answerD = "Cappuccino",
        correctAnswer = 2,
        explanation = "Die deutsche Kaffeetafel ist eine Tradition, bei der Filterkaffee mit Kuchen serviert wird. Der Begriff 'Kaffee und Kuchen' ist ein kulturell tief verwurzeltes Ritual, besonders am Sonntag.",
        difficulty = 1,
        funFact = "Deutschland gehört weltweit zu den größten Kaffeekonsumenten — der durchschnittliche Deutsche trinkt über 160 Liter Kaffee pro Jahr."
    ),

    // Question 35
    Question(
        categoryId = 8,
        questionText = "Welches Gewürz wird aus eingelegten grünen oder schwarzen Früchten des Pfefferstrauchs gewonnen?",
        answerA = "Chili",
        answerB = "Paprika",
        answerC = "Pfeffer",
        answerD = "Cayenne",
        correctAnswer = 2,
        explanation = "Pfeffer kommt vom Pfefferstrauch (Piper nigrum). Schwarzer Pfeffer entsteht durch Trocknen unreifer grüner Beeren, weißer Pfeffer aus reifen Beeren ohne Schale.",
        difficulty = 1,
        funFact = "Im Mittelalter war Pfeffer so wertvoll, dass er als Währung benutzt wurde — Miete und Schulden konnten mit Pfefferkörnern bezahlt werden."
    ),

    // Question 36
    Question(
        categoryId = 8,
        questionText = "Was ist ein Baguette?",
        answerA = "Ein rundes deutsches Roggenbrot",
        answerB = "Ein langes, knuspriges französisches Weißbrot",
        answerC = "Ein flaches italienisches Fladenbrot",
        answerD = "Ein süßes österreichisches Hefegebäck",
        correctAnswer = 1,
        explanation = "Das Baguette ist ein typisch französisches Weißbrot, das aus Mehl, Wasser, Hefe und Salz besteht. Es hat eine knusprige Kruste und eine lockere, luftige Krume.",
        difficulty = 1,
        funFact = "Das Baguette ist seit 2022 Teil des UNESCO-Weltkulturerbes — als Ausdruck der französischen Backkunst und Esskultur."
    ),

    // Question 37
    Question(
        categoryId = 8,
        questionText = "Welches Gericht gehört zur chinesischen Küche und besteht aus Nudeln in Brühe mit Gemüse?",
        answerA = "Pho",
        answerB = "Pad Thai",
        answerC = "Wonton-Suppe",
        answerD = "Laksa",
        correctAnswer = 2,
        explanation = "Wonton-Suppe ist ein klassisches chinesisches Gericht aus dünnen Nudelteigpäckchen (Wontons), die in einer aromatischen Brühe serviert werden.",
        difficulty = 1,
        funFact = "Das Wort 'Wonton' bedeutet auf Kantonesisch 'das Schlucken von Wolken' — ein Hinweis auf die zarte, cloud-artige Form der Teigtaschen."
    ),

    // Question 38
    Question(
        categoryId = 8,
        questionText = "Was ist Tahini?",
        answerA = "Ein japanisches Tofu-Gericht",
        answerB = "Eine Paste aus gemahlenen Sesamsamen",
        answerC = "Ein arabisches Gebäck",
        answerD = "Ein türkischer Joghurt",
        correctAnswer = 1,
        explanation = "Tahini ist eine Paste aus gemahlenen Sesamsamen und ein wichtiger Bestandteil der Küchen des Nahen Ostens. Es ist eine Hauptzutat in Hummus und Baba Ganoush.",
        difficulty = 1,
        funFact = "Sesam ist eine der ältesten Ölpflanzen der Menschheit — archäologische Funde belegen den Anbau bereits vor mehr als 5.000 Jahren in Mesopotamien."
    ),

    // Question 39
    Question(
        categoryId = 8,
        questionText = "Welches Getränk wird in Südamerika aus der Mate-Pflanze hergestellt?",
        answerA = "Chicha",
        answerB = "Guaraná",
        answerC = "Yerba Mate",
        answerD = "Horchata",
        correctAnswer = 2,
        explanation = "Yerba Mate ist ein koffeinhaltiges Getränk aus den Blättern der Mate-Pflanze. Es wird traditionell in einem Kürbisbecher mit einem Metallstrohhalm getrunken.",
        difficulty = 1,
        funFact = "In Argentinien ist Yerba Mate das Nationalgetränk und wird täglich von Millionen Menschen getrunken — oft den ganzen Tag über nachgefüllt."
    ),

    // Question 40
    Question(
        categoryId = 8,
        questionText = "Aus welcher Pflanze wird Vanillearoma natürlich gewonnen?",
        answerA = "Orchidee",
        answerB = "Rose",
        answerC = "Lavendel",
        answerD = "Jasmin",
        correctAnswer = 0,
        explanation = "Vanille stammt von der Vanilleorchidee (Vanilla planifolia). Die langen Schoten der Pflanze werden nach der Ernte fermentiert, um das typische Vanillearoma zu entwickeln.",
        difficulty = 1,
        funFact = "Vanille ist nach Safran das zweitteuerste Gewürz der Welt. Madagaskar produziert etwa 80 % der weltweiten Vanillemenge."
    ),

    // Question 41
    Question(
        categoryId = 8,
        questionText = "Welches Backwerk ist typisch für die Adventszeit in Deutschland?",
        answerA = "Marmorkuchen",
        answerB = "Stollen",
        answerC = "Käsekuchen",
        answerD = "Schwarzwälder Kirschtorte",
        correctAnswer = 1,
        explanation = "Der Christstollen ist ein traditionsreiches deutsches Weihnachtsgebäck aus Hefeteig mit Rosinen, Mandeln, Zitronat und Orangeat, bestäubt mit Puderzucker.",
        difficulty = 1,
        funFact = "Der Dresdner Stollen ist geografisch geschützt — nur Bäcker aus dem Großraum Dresden dürfen ihren Stollen 'Dresdner Christstollen' nennen."
    ),

    // Question 42
    Question(
        categoryId = 8,
        questionText = "Welches Gewürz ist das Hauptaroma von Pastis, dem französischen Anislikör?",
        answerA = "Kümmel",
        answerB = "Fenchel",
        answerC = "Anis",
        answerD = "Lorbeer",
        correctAnswer = 2,
        explanation = "Pastis ist ein französischer Likör, der hauptsächlich mit Anis aromatisiert ist. Beim Verdünnen mit Wasser wird er weiß-trüb — ein als 'Louche-Effekt' bekanntes Phänomen.",
        difficulty = 1,
        funFact = "In Südfrankreich ist Pastis das beliebteste Sommergetränk — dort wird er oft mit 5 Teilen Wasser auf 1 Teil Pastis getrunken."
    ),

    // Question 43
    Question(
        categoryId = 8,
        questionText = "Was ist Tofu?",
        answerA = "Getrockneter Fisch aus Japan",
        answerB = "Ein Gelee aus geronnener Sojamilch",
        answerC = "Ein japanischer Reiskuchen",
        answerD = "Fermentierte Sojabohnen",
        correctAnswer = 1,
        explanation = "Tofu wird hergestellt, indem Sojamilch mit einem Gerinnungsmittel (z.B. Nigari) koaguliert und dann in Blöcke gepresst wird. Er ist reich an Proteinen.",
        difficulty = 1,
        funFact = "Tofu wird seit über 2.000 Jahren in China hergestellt. Die Legende besagt, er wurde zufällig entdeckt, als jemand Sojamilch mit Meerwasser vermischte."
    ),

    // Question 44
    Question(
        categoryId = 8,
        questionText = "Welches Getränk wird aus Gerste durch Mälzen, Maischen und Vergären hergestellt?",
        answerA = "Whisky",
        answerB = "Wodka",
        answerC = "Bier",
        answerD = "Rum",
        correctAnswer = 2,
        explanation = "Bier wird aus Malz (gekeimter und getrockneter Gerste), Hopfen, Wasser und Hefe hergestellt. Die Gärung durch Hefe wandelt den Malzzucker in Alkohol und CO₂ um.",
        difficulty = 1,
        funFact = "Das Reinheitsgebot von 1516 ist eines der ältesten Lebensmittelgesetze der Welt — es schreibt für Bier nur Wasser, Gerste und Hopfen als Zutaten vor."
    ),

    // Question 45
    Question(
        categoryId = 8,
        questionText = "Welches typische Gebäck stammt aus Bayern und wird besonders auf dem Oktoberfest gegessen?",
        answerA = "Bretzel",
        answerB = "Berliner",
        answerC = "Franzbrötchen",
        answerD = "Dampfnudel",
        correctAnswer = 0,
        explanation = "Die Bretzel (oder Brezel) ist ein traditionelles bayerisches Laugengebäck mit charakteristischer Schleifenform, goldbrauner Kruste und bestreut mit grobem Salz.",
        difficulty = 1,
        funFact = "Die Brezel-Form soll einem Mönch nachempfunden sein, der betete — mit vor der Brust gekreuzten Armen, ähnlich der Form des Gebäcks."
    ),

    // Question 46
    Question(
        categoryId = 8,
        questionText = "Welche Körnerfrucht ist die Grundlage für Couscous?",
        answerA = "Hirse",
        answerB = "Gerste",
        answerC = "Weizen",
        answerD = "Reis",
        correctAnswer = 2,
        explanation = "Couscous wird aus Hartweizengrieß hergestellt. Die kleinen Kügelchen entstehen durch Befeuchten und Rollen des Grieß. Es ist ein Grundnahrungsmittel in Nordafrika.",
        difficulty = 1,
        funFact = "Couscous ist so bedeutsam für Nordafrika, dass er 2020 von Marokko, Algerien, Tunesien und Mauretanien gemeinsam als UNESCO-Kulturerbe angemeldet wurde."
    ),

    // Question 47
    Question(
        categoryId = 8,
        questionText = "Welches Getränk ist das Nationalgericht der Schweiz und wird aus Äpfeln hergestellt?",
        answerA = "Rivella",
        answerB = "Suure Moscht",
        answerC = "Appenzeller Alpenbitter",
        answerD = "Mostindä",
        correctAnswer = 0,
        explanation = "Rivella ist ein typisch schweizerisches Erfrischungsgetränk, das aus Molke (einem Nebenprodukt der Käseherstellung) hergestellt wird und leicht süß-cremig schmeckt.",
        difficulty = 1,
        funFact = "Rivella wurde 1952 erfunden und ist in der Schweiz so beliebt, dass es als inoffizielles Nationalgetränk gilt — bekannter als Bier oder Wein."
    ),

    // Question 48
    Question(
        categoryId = 8,
        questionText = "Was ist das typische Hauptgewürz in einem Wiener Schnitzel?",
        answerA = "Knoblauch und Chili",
        answerB = "Salz und Pfeffer",
        answerC = "Paprika und Kümmel",
        answerD = "Majoran und Thymian",
        correctAnswer = 1,
        explanation = "Ein echtes Wiener Schnitzel wird nur mit Salz und Pfeffer gewürzt, dann in Mehl, Ei und Semmelbrösel paniert und in Butterschmalz gebraten.",
        difficulty = 1,
        funFact = "Das originale Wiener Schnitzel muss aus Kalbfleisch sein — ein Schnitzel vom Schwein darf nur als 'Schnitzel Wiener Art' bezeichnet werden."
    ),

    // Question 49
    Question(
        categoryId = 8,
        questionText = "Welches Gewürz wird in der Weihnachtsbäckerei am häufigsten zusammen mit Zimt verwendet?",
        answerA = "Ingwer",
        answerB = "Rosmarin",
        answerC = "Thymian",
        answerD = "Basilikum",
        correctAnswer = 0,
        explanation = "Ingwer ist neben Zimt das wichtigste Gewürz in der Weihnachtsbäckerei. Er verleiht Lebkuchen, Spekulatius und Ingwergebäck seine würzige Schärfe.",
        difficulty = 1,
        funFact = "Ingwer wird seit über 3.000 Jahren in der Küche und Medizin eingesetzt. Schon im alten China galt er als Mittel gegen Übelkeit — das bestätigt auch die moderne Wissenschaft."
    ),

    // Question 50
    Question(
        categoryId = 8,
        questionText = "Welches afrikanische Gericht besteht aus einem Eintopf auf Tomatenbasis mit Eiern, die darin gegart werden?",
        answerA = "Tajine",
        answerB = "Injera",
        answerC = "Shakshuka",
        answerD = "Jollof Rice",
        correctAnswer = 2,
        explanation = "Shakshuka ist ein Gericht aus Nordafrika und dem Nahen Osten, bei dem Eier in einer würzigen Tomaten-Paprika-Sauce pochiert werden. Es wird oft zum Frühstück gegessen.",
        difficulty = 1,
        funFact = "Shakshuka bedeutet auf Arabisch so viel wie 'Durcheinander' oder 'alles zusammen' — ein passender Name für dieses rustikale One-Pan-Gericht."
    ),

)
