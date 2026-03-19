package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsEasy1(): List<Question> = listOf(

    // Question 1
    Question(
        categoryId = 8,
        questionText = "Was ist die Hauptzutat von Pommes Frites?",
        answerA = "Möhren",
        answerB = "Rüben",
        answerC = "Kartoffeln",
        answerD = "Sellerie",
        correctAnswer = 2,
        explanation = "Pommes Frites werden aus in Streifen geschnittenen Kartoffeln hergestellt, die in heißem Öl frittiert werden. Der Name stammt aus dem Französischen und bedeutet 'gebratene Kartoffeln'.",
        difficulty = 1,
        funFact = "Belgien gilt als das eigentliche Geburtsland der Pommes Frites – nicht Frankreich, obwohl das Gericht oft als 'French Fries' bezeichnet wird."
    ),

    // Question 2
    Question(
        categoryId = 8,
        questionText = "Welche Frucht ist typisch für Erdbeermarmelade?",
        answerA = "Himbeere",
        answerB = "Erdbeere",
        answerC = "Kirsche",
        answerD = "Pfirsich",
        correctAnswer = 1,
        explanation = "Erdbeermarmelade wird aus Erdbeeren und Zucker eingekocht. Sie gehört zu den beliebtesten Marmeladen in Deutschland und ist reich an Vitaminen.",
        difficulty = 1,
        funFact = "Erdbeeren sind botanisch gesehen keine echten Beeren, sondern sogenannte Scheinfrüchte – die eigentlichen Früchte sind die kleinen gelben Körner auf der Oberfläche."
    ),

    // Question 3
    Question(
        categoryId = 8,
        questionText = "Aus welcher Zutat wird Butter hergestellt?",
        answerA = "Joghurt",
        answerB = "Milch",
        answerC = "Sahne",
        answerD = "Käse",
        correctAnswer = 2,
        explanation = "Butter wird durch langes Rühren oder Schlagen von Sahne hergestellt. Dabei trennt sich das Fett von der Buttermilch und bildet die feste Butter.",
        difficulty = 1,
        funFact = "Für ein Kilogramm Butter werden etwa 22 Liter Milch benötigt, da die Sahne zunächst abgeschöpft werden muss."
    ),

    // Question 4
    Question(
        categoryId = 8,
        questionText = "Wie heißt das weiße Getränk, das aus Kühen gewonnen wird?",
        answerA = "Joghurt",
        answerB = "Kefir",
        answerC = "Sahne",
        answerD = "Milch",
        correctAnswer = 3,
        explanation = "Milch ist ein natürliches Nahrungsmittel, das von Säugetieren wie Kühen produziert wird. Sie enthält Kalzium, Eiweiß und Vitamine.",
        difficulty = 1,
        funFact = "Eine Kuh gibt im Durchschnitt etwa 25 bis 30 Liter Milch pro Tag – das entspricht mehr als 8.000 Litern im Jahr."
    ),

    // Question 5
    Question(
        categoryId = 8,
        questionText = "Welches Gemüse ist orange und reich an Beta-Carotin?",
        answerA = "Zucchini",
        answerB = "Brokkoli",
        answerC = "Möhre",
        answerD = "Spinat",
        correctAnswer = 2,
        explanation = "Möhren (Karotten) enthalten viel Beta-Carotin, das im Körper zu Vitamin A umgewandelt wird. Dieses Vitamin ist wichtig für die Sehfähigkeit.",
        difficulty = 1,
        funFact = "Die heute bekannte orange Möhre wurde erst im 17. Jahrhundert in den Niederlanden gezüchtet – ursprünglich waren Möhren lila oder gelb."
    ),

    // Question 6
    Question(
        categoryId = 8,
        questionText = "Wie heißt das Brot, das man zum Frühstück in Deutschland am häufigsten isst?",
        answerA = "Baguette",
        answerB = "Croissant",
        answerC = "Brötchen",
        answerD = "Toastbrot",
        correctAnswer = 2,
        explanation = "Brötchen (auch Semmel oder Schrippe genannt) sind kleine, knusprige Brote, die in Deutschland traditionell zum Frühstück gegessen werden.",
        difficulty = 1,
        funFact = "Deutschland hat die größte Brotvielfalt der Welt – es gibt über 3.000 verschiedene Brot- und Brötchensorten."
    ),

    // Question 7
    Question(
        categoryId = 8,
        questionText = "Was ist die Hauptzutat von Tomatensoße?",
        answerA = "Paprika",
        answerB = "Tomate",
        answerC = "Zwiebel",
        answerD = "Knoblauch",
        correctAnswer = 1,
        explanation = "Tomatensoße wird hauptsächlich aus Tomaten hergestellt, die eingekocht und mit Gewürzen verfeinert werden. Sie ist die Basis vieler Pasta-Gerichte.",
        difficulty = 1,
        funFact = "Die Tomate wurde erst im 16. Jahrhundert aus Amerika nach Europa gebracht – davor gab es in Europa keine Tomatensoße."
    ),

    // Question 8
    Question(
        categoryId = 8,
        questionText = "Welches Getränk wird aus gepressten Orangen hergestellt?",
        answerA = "Limonade",
        answerB = "Apfelsaft",
        answerC = "Traubensaft",
        answerD = "Orangensaft",
        correctAnswer = 3,
        explanation = "Orangensaft wird durch Auspressen von Orangen gewonnen. Er enthält viel Vitamin C und gilt als beliebtes Frühstücksgetränk.",
        difficulty = 1,
        funFact = "Für ein Glas frisch gepressten Orangensaft benötigt man etwa drei bis vier Orangen."
    ),

    // Question 9
    Question(
        categoryId = 8,
        questionText = "Wie nennt man die süße Masse aus Kakao, Zucker und Milch?",
        answerA = "Karamell",
        answerB = "Marzipan",
        answerC = "Schokolade",
        answerD = "Nougat",
        correctAnswer = 2,
        explanation = "Schokolade wird aus Kakaobohnen hergestellt. Sie enthält Kakaobutter, Kakaomasse, Zucker und bei Milchschokolade auch Milchpulver.",
        difficulty = 1,
        funFact = "Die Azteken tranken Kakao bereits vor über 3.000 Jahren als bitteren, gewürzten Trunk – Schokolade als Süßigkeit ist eine europäische Erfindung."
    ),

    // Question 10
    Question(
        categoryId = 8,
        questionText = "Welche Hülsenfrucht ist die Hauptzutat von Hummus?",
        answerA = "Linsen",
        answerB = "Kidneybohnen",
        answerC = "Kichererbsen",
        answerD = "Erbsen",
        correctAnswer = 2,
        explanation = "Hummus ist ein orientalischer Brotaufstrich aus pürierter Kichererbsen, Tahini (Sesammus), Zitronensaft und Knoblauch.",
        difficulty = 1,
        funFact = "Hummus bedeutet auf Arabisch schlicht 'Kichererbse' – der vollständige Name des Gerichts lautet 'Hummus bi Tahini'."
    ),

    // Question 11
    Question(
        categoryId = 8,
        questionText = "Welches Gewürz gibt dem Weihnachtsgebäck seinen typischen warmen Geschmack?",
        answerA = "Kurkuma",
        answerB = "Zimt",
        answerC = "Koriander",
        answerD = "Paprika",
        correctAnswer = 1,
        explanation = "Zimt ist ein Gewürz aus der Rinde des Zimtbaums und verleiht Weihnachtsplätzchen, Glühwein und anderen Weihnachtsspezialitäten ihr typisches Aroma.",
        difficulty = 1,
        funFact = "Zimt war im Mittelalter so wertvoll wie Gold – Händler hüteten die Herkunft des Gewürzes streng geheim."
    ),

    // Question 12
    Question(
        categoryId = 8,
        questionText = "Was ist ein Spiegelei?",
        answerA = "Ein Ei, das hart gekocht wurde",
        answerB = "Ein Ei, das in der Pfanne gebraten wird, ohne umgerührt zu werden",
        answerC = "Ein geschlagenes Ei mit Milch",
        answerD = "Ein gedämpftes Ei",
        correctAnswer = 1,
        explanation = "Ein Spiegelei ist ein in der Pfanne gebratenes Ei, bei dem das Eigelb ganz bleibt und das Eiweiß fest wird. Der Name kommt vom spiegelartig glänzenden Eiweiß.",
        difficulty = 1,
        funFact = "In den USA heißt ein Spiegelei 'Sunny side up', weil das runde, gelbe Eigelb an eine aufgehende Sonne erinnert."
    ),

    // Question 13
    Question(
        categoryId = 8,
        questionText = "Welches Tier liefert Honig?",
        answerA = "Wespe",
        answerB = "Hummel",
        answerC = "Schmetterling",
        answerD = "Biene",
        correctAnswer = 3,
        explanation = "Honig wird von Honigbienen produziert. Sie sammeln Nektar aus Blüten, veredeln ihn im Bienenstock und lagern ihn in Waben.",
        difficulty = 1,
        funFact = "Eine Biene produziert in ihrem gesamten Leben nur etwa einen Teelöffel Honig – für ein Glas Honig werden Tausende von Bienen benötigt."
    ),

    // Question 14
    Question(
        categoryId = 8,
        questionText = "Wie heißt das traditionelle italienische Eiscreme?",
        answerA = "Sorbet",
        answerB = "Gelato",
        answerC = "Parfait",
        answerD = "Granita",
        correctAnswer = 1,
        explanation = "Gelato ist das traditionelle italienische Speiseeis. Im Vergleich zu normaler Eiscreme enthält Gelato weniger Fett und Luft, ist dadurch dichter und intensiver im Geschmack.",
        difficulty = 1,
        funFact = "Echter Gelato wird täglich frisch hergestellt und bei einer Temperatur von nur –11 °C gelagert, während normales Eis bei –18 °C eingefroren ist."
    ),

    // Question 15
    Question(
        categoryId = 8,
        questionText = "Aus welchem Land stammt das Gericht 'Paella'?",
        answerA = "Portugal",
        answerB = "Mexiko",
        answerC = "Griechenland",
        answerD = "Spanien",
        correctAnswer = 3,
        explanation = "Paella ist ein traditionelles spanisches Reisgericht aus der Region Valencia. Es wird in einer flachen, runden Pfanne – der Paellera – zubereitet.",
        difficulty = 1,
        funFact = "Der Name 'Paella' leitet sich vom lateinischen Wort 'patella' (Pfanne) ab – nicht vom Gericht selbst."
    ),

    // Question 16
    Question(
        categoryId = 8,
        questionText = "Welches Getreideprodukt bildet die Basis von Brot?",
        answerA = "Mehl",
        answerB = "Grieß",
        answerC = "Stärke",
        answerD = "Kleie",
        correctAnswer = 0,
        explanation = "Mehl ist die gemahlene Form von Getreide und bildet die Grundlage für Brot, Brötchen und Gebäck. Je nach Getreideart (Weizen, Roggen, Dinkel) entstehen verschiedene Brotsorten.",
        difficulty = 1,
        funFact = "Die ältesten bekannten Brote wurden vor rund 14.000 Jahren von Jäger-Sammlern in der heutigen Jordanien gebacken."
    ),

    // Question 17
    Question(
        categoryId = 8,
        questionText = "Was ist Tofu?",
        answerA = "Geriebener Käse aus Japan",
        answerB = "Gebratener Reis aus China",
        answerC = "Geronnene Sojamilch, zu Blöcken gepresst",
        answerD = "Fermentierter Fisch",
        correctAnswer = 2,
        explanation = "Tofu wird aus Sojamilch hergestellt, die mit einem Gerinnungsmittel ausgeflockt und dann zu Blöcken gepresst wird. Er ist reich an Protein und in der asiatischen Küche sehr verbreitet.",
        difficulty = 1,
        funFact = "Tofu wird seit über 2.000 Jahren in China hergestellt – die Herstellungsmethode ist seitdem nahezu unverändert geblieben."
    ),

    // Question 18
    Question(
        categoryId = 8,
        questionText = "Wie nennt man das Brötchen, das mit Fleisch, Salat und Soße gefüllt wird?",
        answerA = "Sandwich",
        answerB = "Wrap",
        answerC = "Kebab",
        answerD = "Hamburger",
        correctAnswer = 3,
        explanation = "Ein Hamburger besteht aus einem runden Brötchen (Bun), einer Fleischfrikadelle und Beilagen wie Salat, Tomate, Käse und Soßen.",
        difficulty = 1,
        funFact = "Der Hamburger ist nach der deutschen Stadt Hamburg benannt – deutsche Einwanderer brachten das Rezept für gewürztes Hackfleisch im 19. Jahrhundert in die USA."
    ),

    // Question 19
    Question(
        categoryId = 8,
        questionText = "Welcher Käse hat Löcher und kommt aus der Schweiz?",
        answerA = "Gouda",
        answerB = "Brie",
        answerC = "Emmentaler",
        answerD = "Camembert",
        correctAnswer = 2,
        explanation = "Der Emmentaler ist ein schweizer Hartkäse, der durch den milden, nussigen Geschmack und seine charakteristischen runden Löcher bekannt ist.",
        difficulty = 1,
        funFact = "Die Löcher im Emmentaler entstehen durch Bakterien (Propionibacterium), die während der Reifung CO2-Gas produzieren, das die Löcher bildet."
    ),

    // Question 20
    Question(
        categoryId = 8,
        questionText = "Welche Soße gehört traditionell zu Pommes Frites in Deutschland?",
        answerA = "Tomatenketchup",
        answerB = "Senf",
        answerC = "Hollandaise",
        answerD = "Tzatziki",
        correctAnswer = 0,
        explanation = "In Deutschland werden Pommes Frites am häufigsten mit Ketchup oder Mayonnaise gegessen. Ketchup ist dabei die bekannteste Beilagensoße.",
        difficulty = 1,
        funFact = "In Belgien, dem Geburtsland der Pommes Frites, ist Mayonnaise die traditionelle Beilagensoße – Ketchup gilt dort eher als ungewöhnlich."
    ),

    // Question 21
    Question(
        categoryId = 8,
        questionText = "Was ist ein Croissant?",
        answerA = "Ein deutsches Vollkornbrötchen",
        answerB = "Ein mondförmiges, buttriges Gebäck",
        answerC = "Ein süßes Hefegebäck mit Rosinen",
        answerD = "Ein Baguette mit Käse",
        correctAnswer = 1,
        explanation = "Das Croissant ist ein mondförmiges, blätterteigartiges Gebäck aus Butterteig. Es ist ein Klassiker der französischen und österreichischen Bäckerei.",
        difficulty = 1,
        funFact = "Das Croissant wurde ursprünglich in Wien erfunden – als 'Kipferl'. Erst im 19. Jahrhundert kam es nach Paris und wurde dort zum ikonischen Frühstücksgebäck."
    ),

    // Question 22
    Question(
        categoryId = 8,
        questionText = "Wie heißt die gelbe Zitrusfrucht, die sehr sauer schmeckt?",
        answerA = "Limette",
        answerB = "Grapefruit",
        answerC = "Mandarine",
        answerD = "Zitrone",
        correctAnswer = 3,
        explanation = "Die Zitrone ist eine gelbe Zitrusfrucht mit sehr saurem Geschmack. Sie enthält viel Vitamin C und wird zum Würzen von Speisen und Getränken verwendet.",
        difficulty = 1,
        funFact = "Zitronen sind eine Kreuzung aus Zitronatzitrone und Bitterorange – in der Natur gibt es keine wild wachsenden Zitronenbäume."
    ),

    // Question 23
    Question(
        categoryId = 8,
        questionText = "Welches Gemüse ist der Hauptbestandteil von Sauerkraut?",
        answerA = "Rotkohl",
        answerB = "Weißkohl",
        answerC = "Spinat",
        answerD = "Blumenkohl",
        correctAnswer = 1,
        explanation = "Sauerkraut wird aus fein gehobeltem Weißkohl hergestellt, der durch Milchsäuregärung fermentiert wird. Es ist ein traditionelles deutsches Beilagengericht.",
        difficulty = 1,
        funFact = "Sauerkraut enthält mehr Vitamin C als frisches Kraut, weil durch den Fermentationsprozess die Vitamine besser erhalten bleiben."
    ),

    // Question 24
    Question(
        categoryId = 8,
        questionText = "Was wird beim Braten in der Pfanne verwendet, damit das Essen nicht klebt?",
        answerA = "Wasser",
        answerB = "Essig",
        answerC = "Öl oder Butter",
        answerD = "Milch",
        correctAnswer = 2,
        explanation = "Öl oder Butter werden beim Braten verwendet, um zu verhindern, dass Lebensmittel an der Pfanne kleben, und um Wärme gleichmäßig zu übertragen.",
        difficulty = 1,
        funFact = "Olivenöl wurde bereits in der Antike nicht nur zum Kochen, sondern auch als Lampenöl, Kosmetik und Heilmittel verwendet."
    ),

    // Question 25
    Question(
        categoryId = 8,
        questionText = "Welche Speise ist ein typisches deutsches Frühstück?",
        answerA = "Rührei mit Speck",
        answerB = "Pancakes mit Ahornsirup",
        answerC = "Brot mit Aufschnitt",
        answerD = "Congee (Reisbrei)",
        correctAnswer = 2,
        explanation = "Ein typisch deutsches Frühstück besteht aus Brot oder Brötchen mit Aufschnitt wie Wurst und Käse sowie Butter, Marmelade und einem heißen Getränk.",
        difficulty = 1,
        funFact = "Deutschland ist weltberühmt für seine Brotkultur – die UNESCO hat das deutsche Brotbacken als immaterielles Kulturerbe anerkannt."
    ),

    // Question 26
    Question(
        categoryId = 8,
        questionText = "Welche Farbe hat eine reife Banane?",
        answerA = "Rot",
        answerB = "Grün",
        answerC = "Gelb",
        answerD = "Orange",
        correctAnswer = 2,
        explanation = "Eine reife Banane ist gelb. Grüne Bananen sind noch unreif, während braune Flecken auf überreife Bananen hinweisen – diese eignen sich gut zum Backen.",
        difficulty = 1,
        funFact = "Bananen sind leicht radioaktiv, da sie Kalium-40 enthalten – die Menge ist jedoch so gering, dass sie für den Menschen völlig unbedenklich ist."
    ),

    // Question 27
    Question(
        categoryId = 8,
        questionText = "Was ist das Besondere an einem hartgekochten Ei?",
        answerA = "Das Eiweiß ist flüssig geblieben",
        answerB = "Das Eigelb wurde entfernt",
        answerC = "Das Eigelb und das Eiweiß sind vollständig fest",
        answerD = "Das Ei wurde frittiert",
        correctAnswer = 2,
        explanation = "Ein hartgekochtes Ei wird ca. 10 Minuten in kochendem Wasser gegart, bis sowohl Eigelb als auch Eiweiß vollständig fest sind.",
        difficulty = 1,
        funFact = "In Ostdeutschland ist das Bemalen und Verschenken von gekochten Eiern zu Ostern eine Jahrhunderte alte Tradition."
    ),

    // Question 28
    Question(
        categoryId = 8,
        questionText = "Wie nennt man Fleisch, das über Rauch geräuchert und konserviert wird?",
        answerA = "Gepökeltes Fleisch",
        answerB = "Geräuchertes Fleisch",
        answerC = "Mariniertes Fleisch",
        answerD = "Getrocknetes Fleisch",
        correctAnswer = 1,
        explanation = "Beim Räuchern wird Fleisch dem Rauch von brennendem Holz ausgesetzt. Dadurch erhält es einen besonderen Geschmack und wird gleichzeitig haltbar gemacht.",
        difficulty = 1,
        funFact = "Lachs, Schinken und Würste gehören zu den beliebtesten geräucherten Lebensmitteln. Das Räuchern ist eine der ältesten Konservierungsmethoden der Menschheit."
    ),

    // Question 29
    Question(
        categoryId = 8,
        questionText = "Welches Gewürz wird aus der Samen der Vanillepflanze gewonnen?",
        answerA = "Kardamom",
        answerB = "Nelke",
        answerC = "Muskatnuss",
        answerD = "Vanille",
        correctAnswer = 3,
        explanation = "Vanille wird aus den Schoten der Vanillepflanze, einer Orchidee, gewonnen. Sie ist eines der teuersten Gewürze der Welt und wird für Süßspeisen und Backwaren verwendet.",
        difficulty = 1,
        funFact = "Vanille ist das zweitteuerste Gewürz der Welt nach Safran. Echter Vanilleextrakt aus Madagaskar kann mehr als 600 Euro pro Kilogramm kosten."
    ),

    // Question 30
    Question(
        categoryId = 8,
        questionText = "Was ist ein typisches Gericht zum Mittag in Deutschland?",
        answerA = "Sushi",
        answerB = "Tacos",
        answerC = "Currywurst",
        answerD = "Schnitzel mit Beilage",
        correctAnswer = 3,
        explanation = "Schnitzel mit Beilage wie Kartoffeln oder Salat ist ein typisches deutsches Mittagessen. Schnitzel ist paniertes und gebratenes Fleisch, klassisch aus Schweine- oder Kalbfleisch.",
        difficulty = 1,
        funFact = "Das Wiener Schnitzel ist rechtlich geschützt und muss aus Kalbfleisch bestehen – Schweineschnitzel darf offiziell nur 'Schnitzel nach Wiener Art' heißen."
    ),

    // Question 31
    Question(
        categoryId = 8,
        questionText = "Welche Obstsorte wird aus dem Apfelbaum geerntet?",
        answerA = "Birne",
        answerB = "Quitte",
        answerC = "Pflaume",
        answerD = "Apfel",
        correctAnswer = 3,
        explanation = "Äpfel wachsen an Apfelbäumen und gehören zu den meistangebauten Obstfrüchten der Welt. Es gibt über 20.000 Apfelsorten weltweit.",
        difficulty = 1,
        funFact = "Deutschland ist einer der größten Apfelproduzenten Europas – besonders das Altes Land bei Hamburg gilt als bedeutendstes Obstanbaugebiet Deutschlands."
    ),

    // Question 32
    Question(
        categoryId = 8,
        questionText = "Was ist Müsli?",
        answerA = "Eine Reisspeise aus Japan",
        answerB = "Ein Frühstücksgericht aus Haferflocken, Früchten und Nüssen",
        answerC = "Ein Getreide-Kuchenrezept",
        answerD = "Ein Brei aus Maismehl",
        correctAnswer = 1,
        explanation = "Müsli ist ein Frühstücksgericht aus Haferflocken, Trockenfrüchten, Nüssen und Samen, oft mit Milch, Joghurt oder Fruchtsaft serviert.",
        difficulty = 1,
        funFact = "Müsli wurde um 1900 vom Schweizer Arzt Maximilian Bircher-Benner als gesundes Patienten-Abendessen entwickelt – daher heißt es manchmal auch 'Birchermüsli'."
    ),

    // Question 33
    Question(
        categoryId = 8,
        questionText = "Welche Gemüsesorte hat einen sehr starken, tränenreizenden Geruch beim Schneiden?",
        answerA = "Brokkoli",
        answerB = "Lauch",
        answerC = "Zwiebel",
        answerD = "Paprika",
        correctAnswer = 2,
        explanation = "Zwiebeln enthalten schwefelhaltige Verbindungen, die beim Schneiden freigesetzt werden und die Schleimhäute der Augen reizen – daher tränen die Augen.",
        difficulty = 1,
        funFact = "Um beim Zwiebelschneiden keine tränenden Augen zu bekommen, hilft es, die Zwiebel vorher zu kühlen oder unter fließendem Wasser zu schneiden."
    ),

    // Question 34
    Question(
        categoryId = 8,
        questionText = "Was ist Pasta?",
        answerA = "Ein Reiskuchen aus Asien",
        answerB = "Ein gebackenes Brot aus Italien",
        answerC = "Gekochter Teig aus Grieß oder Mehl, z.B. Spaghetti",
        answerD = "Ein Kartoffelgericht aus Deutschland",
        correctAnswer = 2,
        explanation = "Pasta ist ein Sammelbegriff für italienische Teigwaren wie Spaghetti, Penne oder Lasagne. Sie werden aus Hartweizengries oder Mehl und Wasser (oder Eiern) hergestellt.",
        difficulty = 1,
        funFact = "In Italien werden pro Person im Jahr durchschnittlich 23 Kilogramm Pasta gegessen – mehr als in jedem anderen Land der Welt."
    ),

    // Question 35
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet man als 'Vegetarier'?",
        answerA = "Jemand, der nur Fisch isst",
        answerB = "Jemand, der kein Fleisch und keinen Fisch isst",
        answerC = "Jemand, der ausschließlich rohes Gemüse isst",
        answerD = "Jemand, der keinerlei tierische Produkte zu sich nimmt",
        correctAnswer = 1,
        explanation = "Vegetarier essen kein Fleisch und keinen Fisch. Viele Vegetarier essen jedoch noch Milchprodukte und Eier. Wer gar keine tierischen Produkte isst, ist Veganer.",
        difficulty = 1,
        funFact = "Schätzungen zufolge gibt es weltweit über eine Milliarde Vegetarier – Indien hat den höchsten Anteil vegetarischer Bevölkerung."
    ),

    // Question 36
    Question(
        categoryId = 8,
        questionText = "Was ist Pudding?",
        answerA = "Ein salziges Fleischgericht",
        answerB = "Ein saures Milchprodukt",
        answerC = "Eine cremige, gekochte Süßspeise aus Milch und Stärke",
        answerD = "Ein getrocknetes Obst",
        correctAnswer = 2,
        explanation = "Pudding ist eine cremige Süßspeise, die durch Kochen von Milch mit Stärke (oder Grieß) und Zucker entsteht. Er wird in vielen Geschmacksrichtungen angeboten, z.B. Vanille oder Schokolade.",
        difficulty = 1,
        funFact = "In England ist Pudding ein Oberbegriff für alle Süßspeisen – ein 'Christmas Pudding' ist jedoch tatsächlich ein dunkler Früchtekuchen, der gedämpft wird."
    ),

    // Question 37
    Question(
        categoryId = 8,
        questionText = "Welche Zutat macht Brot weich und fluffig durch Gärung?",
        answerA = "Zucker",
        answerB = "Salz",
        answerC = "Mehl",
        answerD = "Hefe",
        correctAnswer = 3,
        explanation = "Hefe ist ein Pilz, der Zucker in Kohlendioxid und Alkohol umwandelt. Das entstehende CO2 bildet Bläschen im Teig und macht Brot beim Backen luftig und weich.",
        difficulty = 1,
        funFact = "Sauerteigbrot wird ohne Industriehefe hergestellt – stattdessen werden wilde Hefekulturen und Milchsäurebakterien verwendet, die dem Brot seinen besonderen Geschmack geben."
    ),

    // Question 38
    Question(
        categoryId = 8,
        questionText = "Wie heißt das traditionelle deutsche Gericht aus Hackfleisch und Brötchen, das in der Pfanne gebraten wird?",
        answerA = "Gulasch",
        answerB = "Bratwurst",
        answerC = "Frikadelle",
        answerD = "Leberkäse",
        correctAnswer = 2,
        explanation = "Eine Frikadelle (auch Bulette oder Fleischpflanzerl) besteht aus gewürztem Hackfleisch und eingeweichten Brötchen, das zu flachen Bällchen geformt und gebraten wird.",
        difficulty = 1,
        funFact = "In Berlin heißen Frikadellen traditionell 'Buletten' – der Name soll vom französischen 'boulette' (Kügelchen) stammen, das aus der Napoleonischen Zeit übernommen wurde."
    ),

    // Question 39
    Question(
        categoryId = 8,
        questionText = "Was ist Salz chemisch gesehen?",
        answerA = "Zucker",
        answerB = "Ein Mineral aus der Erde",
        answerC = "Eine Säure",
        answerD = "Ein Fett",
        correctAnswer = 1,
        explanation = "Speisesalz ist Natriumchlorid (NaCl), ein Mineral, das aus Salzminen gewonnen oder durch Verdampfen von Meerwasser hergestellt wird. Es ist ein unverzichtbares Gewürz in der Küche.",
        difficulty = 1,
        funFact = "Das Wort 'Salär' (Gehalt) kommt vom lateinischen 'salarium' – im alten Rom wurden Soldaten teilweise mit Salz bezahlt, da es wertvoll und lebensnotwendig war."
    ),

    // Question 40
    Question(
        categoryId = 8,
        questionText = "Welche Frucht wächst an einem Weinstock?",
        answerA = "Johannisbeere",
        answerB = "Stachelbeere",
        answerC = "Weintraube",
        answerD = "Heidelbeere",
        correctAnswer = 2,
        explanation = "Weintrauben wachsen an Weinstöcken und werden zu Wein, Saft, Rosinen oder frisch gegessen. Je nach Sorte sind sie grün, rot oder blau-schwarz.",
        difficulty = 1,
        funFact = "Weltweit gibt es über 10.000 verschiedene Rebsorten – in Deutschland werden besonders Riesling und Müller-Thurgau angebaut."
    ),

    // Question 41
    Question(
        categoryId = 8,
        questionText = "Was ist Joghurt?",
        answerA = "Aufgeschlagene Sahne",
        answerB = "Durch Bakterien fermentierte Milch",
        answerC = "Gesüßte Kondensmilch",
        answerD = "Gereifter Weichkäse",
        correctAnswer = 1,
        explanation = "Joghurt entsteht, wenn bestimmte Milchsäurebakterien Milch fermentieren und dabei den Milchzucker (Laktose) in Milchsäure umwandeln. Das macht den Joghurt dick und leicht säuerlich.",
        difficulty = 1,
        funFact = "In der Türkei und in Bulgarien isst man Joghurt seit über 4.000 Jahren – er entstand wahrscheinlich durch zufällige Fermentation in Tierhäuten."
    ),

    // Question 42
    Question(
        categoryId = 8,
        questionText = "Welche Farbe hat reife Paprika, die am süßesten schmeckt?",
        answerA = "Grün",
        answerB = "Gelb",
        answerC = "Rot",
        answerD = "Orange",
        correctAnswer = 2,
        explanation = "Rote Paprika schmeckt am süßesten, weil sie vollständig ausgereift ist. Grüne Paprika ist unreif und daher etwas bitterer – sie enthält trotzdem dreimal so viel Vitamin C wie eine Orange.",
        difficulty = 1,
        funFact = "Grüne, gelbe und rote Paprika sind keine verschiedenen Sorten – es ist dieselbe Frucht in verschiedenen Reifestadien."
    ),

    // Question 43
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen Kakao und Schokolade?",
        answerA = "Es gibt keinen Unterschied",
        answerB = "Kakao ist das Pulver, Schokolade enthält zusätzlich Zucker und Fett",
        answerC = "Kakao kommt aus Afrika, Schokolade aus Europa",
        answerD = "Schokolade ist immer bitter, Kakao ist süß",
        correctAnswer = 1,
        explanation = "Kakao bezeichnet das natürliche Pulver oder die Masse aus Kakaobohnen. Schokolade ist das verarbeitete Produkt, das Kakaomasse, Kakaobutter, Zucker und oft Milch enthält.",
        difficulty = 1,
        funFact = "Kakaobohnen enthalten mehr als 600 verschiedene Aromastoffe – damit ist Kakao eines der aromatisch komplexesten Lebensmittel der Welt."
    ),

    // Question 44
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter einem 'Smoothie'?",
        answerA = "Ein heißes Getränk aus gemahlenem Kaffee",
        answerB = "Ein püriertes Getränk aus Früchten oder Gemüse",
        answerC = "Ein kohlensäurehaltiges Erfrischungsgetränk",
        answerD = "Ein fermentiertes Milchgetränk",
        correctAnswer = 1,
        explanation = "Ein Smoothie ist ein Kaltgetränk, das durch Pürieren von frischen Früchten, Gemüse oder Beides entsteht. Er ist dicker als Saft, weil das gesamte Fruchtfleisch enthalten bleibt.",
        difficulty = 1,
        funFact = "Das Wort 'Smoothie' tauchte erstmals in den 1930er Jahren in amerikanischen Rezeptbüchern auf – populär wurde es aber erst in den 1990er Jahren."
    ),

    // Question 45
    Question(
        categoryId = 8,
        questionText = "Welche Küchentechnik beschreibt das Garen von Speisen in Wasser bei 100 °C?",
        answerA = "Braten",
        answerB = "Backen",
        answerC = "Frittieren",
        answerD = "Kochen",
        correctAnswer = 3,
        explanation = "Beim Kochen werden Speisen in Wasser oder Brühe erhitzt. Wasser siedet bei 100 °C (auf Meereshöhe) und überträgt diese Hitze gleichmäßig auf die Lebensmittel.",
        difficulty = 1,
        funFact = "In großer Höhe siedet Wasser bei niedrigeren Temperaturen – auf dem Mount Everest (8.849 m) kocht Wasser bereits bei etwa 70 °C, was dazu führt, dass Nudeln nicht gar werden."
    ),

    // Question 46
    Question(
        categoryId = 8,
        questionText = "Welche Nuss ist die Hauptzutat von Pesto alla Genovese?",
        answerA = "Walnuss",
        answerB = "Mandel",
        answerC = "Pinienkern",
        answerD = "Cashew",
        correctAnswer = 2,
        explanation = "Traditionelles Pesto alla Genovese besteht aus frischem Basilikum, Pinienkerne, Parmesan, Knoblauch und Olivenöl. Es stammt aus der ligurischen Stadt Genua.",
        difficulty = 1,
        funFact = "In Genua gibt es ein offizielles Pesto-Weltmeisterschaft – beim 'Campionato Mondiale di Pesto al Mortaio' darf die Soße ausschließlich im Mörser zubereitet werden."
    ),

    // Question 47
    Question(
        categoryId = 8,
        questionText = "Was ist Rührei?",
        answerA = "Eier, die in der Schale hartgekocht wurden",
        answerB = "Eier, die unter ständigem Rühren in der Pfanne gebraten werden",
        answerC = "Rohe Eier mit Zucker aufgeschlagen",
        answerD = "In Öl frittierte Eier",
        correctAnswer = 1,
        explanation = "Rührei wird hergestellt, indem verquirlte Eier in einer gefetteten Pfanne unter ständigem Rühren erhitzt werden, bis sie zu weichen, lockeren Stücken stocken.",
        difficulty = 1,
        funFact = "In Großbritannien isst man zum Frühstück traditionell Rührei ('scrambled eggs') – Spitzenköche empfehlen, es sehr langsam bei niedriger Hitze zuzubereiten."
    ),

    // Question 48
    Question(
        categoryId = 8,
        questionText = "Welches Land ist bekannt für seine Sushi-Kultur?",
        answerA = "China",
        answerB = "Vietnam",
        answerC = "Thailand",
        answerD = "Japan",
        correctAnswer = 3,
        explanation = "Sushi ist ein traditionelles japanisches Gericht und ein Symbol der japanischen Esskultur. In Japan gibt es Zehntausende von Sushi-Restaurants.",
        difficulty = 1,
        funFact = "Ursprünglich war Sushi eine Konservierungsmethode: Fisch wurde in gesäuertem Reis eingelegt und über Monate fermentiert – den Reis selbst aß man dabei nicht."
    ),

    // Question 49
    Question(
        categoryId = 8,
        questionText = "Was ist Senf?",
        answerA = "Eine scharfe Soße aus Chilischoten",
        answerB = "Eine Würzsoße aus gemahlenen Senfkörnern",
        answerC = "Ein fermentiertes Getränk",
        answerD = "Eine Kräutermischung aus der Provence",
        correctAnswer = 1,
        explanation = "Senf wird aus gemahlenen Senfkörnern, Essig, Wasser und Gewürzen hergestellt. Er gibt es in vielen Varianten – von mild bis scharf, von grob bis fein.",
        difficulty = 1,
        funFact = "Dijon in Frankreich ist weltberühmt für seinen scharfen Senf – obwohl heute die meisten Senfkörner für Dijon-Senf aus Kanada stammen."
    ),

    // Question 50
    Question(
        categoryId = 8,
        questionText = "Welche Backzutat lässt Kuchen und Muffins beim Backen aufgehen?",
        answerA = "Salz",
        answerB = "Vanillezucker",
        answerC = "Backpulver",
        answerD = "Mehl",
        correctAnswer = 2,
        explanation = "Backpulver ist ein Triebmittel, das im Teig CO2-Bläschen bildet, wenn es mit Feuchtigkeit und Hitze in Kontakt kommt. Diese Bläschen lassen Kuchen und Muffins aufgehen.",
        difficulty = 1,
        funFact = "Backpulver wurde erst 1843 erfunden – davor verwendete man Hefe oder Hirschhornsalz zum Auflockern von Teig."
    ),

)
