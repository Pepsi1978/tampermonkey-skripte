package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsMedium2(): List<Question> = listOf(

    // Wine regions and grape varieties
    Question(
        categoryId = 8,
        questionText = "Welche Rebsorte wird hauptsächlich für den Chianti-Wein verwendet?",
        answerA = "Nebbiolo",
        answerB = "Barbera",
        answerC = "Sangiovese",
        answerD = "Montepulciano",
        correctAnswer = 2,
        explanation = "Chianti ist ein toskanischer Rotwein, der überwiegend aus der Rebsorte Sangiovese hergestellt wird.",
        difficulty = 2,
        funFact = "Chianti Classico darf laut Gesetz mindestens 80 % Sangiovese enthalten."
    ),

    Question(
        categoryId = 8,
        questionText = "Aus welcher Region stammt der Weintyp Bordeaux?",
        answerA = "Burgund, Frankreich",
        answerB = "Bordeaux, Frankreich",
        answerC = "Rhône-Tal, Frankreich",
        answerD = "Elsass, Frankreich",
        correctAnswer = 1,
        explanation = "Bordeaux-Weine stammen aus der gleichnamigen Region im Südwesten Frankreichs und gelten als die bekanntesten Rotweine der Welt.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was versteht man unter dem Begriff 'Blanc de Blancs' bei Champagner?",
        answerA = "Champagner aus roten Trauben ohne Schalen",
        answerB = "Champagner ausschließlich aus Chardonnay-Trauben",
        answerC = "Champagner mit besonders niedrigem Zuckergehalt",
        answerD = "Champagner aus dem ersten Pressgang",
        correctAnswer = 1,
        explanation = "Blanc de Blancs bezeichnet Champagner, der ausschließlich aus weißen Trauben, in der Regel Chardonnay, hergestellt wird.",
        difficulty = 2,
        funFact = "Der Begriff bedeutet auf Französisch wortwörtlich 'Weiß von Weißen'."
    ),

    // Cooking techniques
    Question(
        categoryId = 8,
        questionText = "Was bedeutet die Kochtechnik 'Sous Vide'?",
        answerA = "Garen im Dampf bei hoher Temperatur",
        answerB = "Garen in vakuumversiegelten Beuteln im Wasserbad",
        answerC = "Kurzbraten bei sehr hoher Hitze",
        answerD = "Langsames Schmoren in Brühe",
        correctAnswer = 1,
        explanation = "Sous Vide (französisch: 'unter Vakuum') bezeichnet das Garen von Lebensmitteln in luftdicht verschlossenen Beuteln in einem Wasserbad bei genau kontrollierter Temperatur.",
        difficulty = 2,
        funFact = "Die Methode wurde in den 1970er Jahren von dem französischen Koch Georges Pralus populär gemacht."
    ),

    Question(
        categoryId = 8,
        questionText = "Was passiert beim 'Blanchieren' von Gemüse?",
        answerA = "Gemüse wird in Öl goldbraun gebraten",
        answerB = "Gemüse wird kurz in kochendem Wasser gegart und dann in Eiswasser abgeschreckt",
        answerC = "Gemüse wird bei niedriger Temperatur gedünstet",
        answerD = "Gemüse wird in Salzwasser eingelegt",
        correctAnswer = 1,
        explanation = "Beim Blanchieren wird Gemüse kurz in kochendes Salzwasser getaucht und sofort in Eiswasser abgeschreckt, um die Farbe zu erhalten und Enzyme zu deaktivieren.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'Flambieren' in der Küche?",
        answerA = "Gerichte mit einem Bunsenbrenner überziehen",
        answerB = "Speisen mit hochprozentigem Alkohol übergießen und entzünden",
        answerC = "Fleisch bei sehr hoher Temperatur scharf anbraten",
        answerD = "Soßen durch Erhitzen reduzieren",
        correctAnswer = 1,
        explanation = "Beim Flambieren werden Speisen mit hochprozentigem Alkohol übergossen und angezündet, um den Alkohol zu verbrennen und Aromen zu intensivieren.",
        difficulty = 2,
        funFact = "Crêpes Suzette ist eines der bekanntesten flambierten Desserts der französischen Küche."
    ),

    Question(
        categoryId = 8,
        questionText = "Was beschreibt die Garmethode 'Confit'?",
        answerA = "Garen in Eigenfett bei niedriger Temperatur",
        answerB = "Garen in Zuckerlösung",
        answerC = "Räuchern über Holzspänen",
        answerD = "Marinieren in Essig und Kräutern",
        correctAnswer = 0,
        explanation = "Confit bezeichnet das langsame Garen von Fleisch (oft Ente oder Gans) in seinem eigenen Fett bei niedriger Temperatur – eine traditionelle französische Konservierungsmethode.",
        difficulty = 2,
        funFact = "Confit de Canard (Entenconfit) ist ein Klassiker der südwestfranzösischen Küche aus dem Périgord."
    ),

    // International cuisine
    Question(
        categoryId = 8,
        questionText = "Was ist 'Miso' in der japanischen Küche?",
        answerA = "Eine Reissorte mit besonders kleinen Körnern",
        answerB = "Ein fermentiertes Würzmittel aus Sojabohnen",
        answerC = "Ein getrockneter Fischfond",
        answerD = "Eine Art gekochter Tofu",
        correctAnswer = 1,
        explanation = "Miso ist eine fermentierte Paste aus Sojabohnen, Salz und einem Schimmelpilz (Koji) und ist ein zentrales Würzmittel der japanischen Küche.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Welches Gewürz ist die Hauptzutat in der indischen Gewürzmischung 'Garam Masala'?",
        answerA = "Nur Koriander und Kreuzkümmel",
        answerB = "Eine regionale Mischung aus vielen Gewürzen wie Kardamom, Zimt und Nelken",
        answerC = "Ausschließlich Chili und schwarzer Pfeffer",
        answerD = "Kurkuma und Ingwer",
        correctAnswer = 1,
        explanation = "Garam Masala ist eine aromatische Mischung, die je nach Region variiert, aber typischerweise Kardamom, Zimt, Nelken, Koriander und Kreuzkümmel enthält.",
        difficulty = 2,
        funFact = "Der Begriff 'Garam Masala' bedeutet auf Hindi 'heiße Gewürzmischung' – nicht wegen der Schärfe, sondern wegen der wärmenden Eigenschaften."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Mole' in der mexikanischen Küche?",
        answerA = "Eine Art Mais-Tortilla",
        answerB = "Eine komplexe Sauce aus Chilis, Schokolade und vielen Gewürzen",
        answerC = "Ein gegrilltes Fleischgericht",
        answerD = "Ein Dessert aus Milch und Zimt",
        correctAnswer = 1,
        explanation = "Mole ist eine aufwändige mexikanische Sauce, die bis zu 30 Zutaten enthalten kann, darunter verschiedene Chilis, Schokolade, Nüsse und Gewürze.",
        difficulty = 2,
        funFact = "Mole Negro aus Oaxaca gilt als eine der komplexesten Saucen der Welt und kann Tage zur Zubereitung benötigen."
    ),

    // Cheese varieties
    Question(
        categoryId = 8,
        questionText = "Aus welcher Milch wird der französische Käse Roquefort hergestellt?",
        answerA = "Kuhmilch",
        answerB = "Ziegenmilch",
        answerC = "Schafsmilch",
        answerD = "Büffelmilch",
        correctAnswer = 2,
        explanation = "Roquefort ist ein französischer Blauschimmelkäse, der ausschließlich aus der Rohmilch der Lacaune-Schafrasse hergestellt wird.",
        difficulty = 2,
        funFact = "Echter Roquefort muss in den natürlichen Höhlen des Combalou-Felsens bei Roquefort-sur-Soulzon gereift werden."
    ),

    Question(
        categoryId = 8,
        questionText = "Was unterscheidet Mozzarella di Bufala von regulärem Mozzarella?",
        answerA = "Er wird aus Büffelmilch hergestellt und hat einen reicheren Geschmack",
        answerB = "Er wird länger gereift und ist fester",
        answerC = "Er enthält weniger Fett und ist leichter",
        answerD = "Er stammt aus einer anderen Region Italiens",
        correctAnswer = 0,
        explanation = "Mozzarella di Bufala wird aus der Milch der Wasserbüffel hergestellt und hat durch den höheren Fett- und Proteingehalt einen cremigeren, reicheren Geschmack als Kuhmilch-Mozzarella.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Wie wird Emmentaler Käse hergestellt und woher stammen die charakteristischen Löcher?",
        answerA = "Die Löcher entstehen durch spezielle Bohrgeräte",
        answerB = "Propionsäurebakterien produzieren beim Reifen Kohlendioxid-Blasen",
        answerC = "Die Löcher werden durch Salzlake verursacht",
        answerD = "Sie entstehen durch das Pressen der Käsemasse",
        correctAnswer = 1,
        explanation = "Die charakteristischen Löcher im Emmentaler entstehen durch Propionsäurebakterien, die während der Reifung Kohlendioxidgas produzieren, das sich als Blasen im Käse festsetzt.",
        difficulty = 2,
        funFact = "Echter Schweizer Emmentaler AOP muss in der Emme-Region im Kanton Bern hergestellt werden."
    ),

    // Fermentation
    Question(
        categoryId = 8,
        questionText = "Welche Bakterienkultur ist für die Fermentation von Joghurt verantwortlich?",
        answerA = "Lactobacillus acidophilus und Bifidobacterium",
        answerB = "Streptococcus thermophilus und Lactobacillus bulgaricus",
        answerC = "Saccharomyces cerevisiae und Leuconostoc",
        answerD = "Acetobacter und Gluconobacter",
        correctAnswer = 1,
        explanation = "Echte Joghurtkulturen bestehen aus Streptococcus thermophilus und Lactobacillus delbrueckii subsp. bulgaricus, die Laktose in Milchsäure umwandeln.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Kefir' und wie unterscheidet er sich von Joghurt?",
        answerA = "Kefir ist dickflüssiger und enthält keine Hefen",
        answerB = "Kefir ist ein Fermentationsprodukt aus Milch mit Kefirknollen, die Hefen und Bakterien enthalten, und enthält leicht Alkohol",
        answerC = "Kefir wird aus Pflanzenmilch hergestellt",
        answerD = "Kefir reift länger als Joghurt und ist daher fester",
        correctAnswer = 1,
        explanation = "Kefir entsteht durch Fermentation mit Kefirknollen, die sowohl Milchsäurebakterien als auch Hefen enthalten, wodurch er leicht alkoholisch (0,5–2 %) und kohlensäurehaltig wird.",
        difficulty = 2,
        funFact = "Kefir stammt ursprünglich aus dem Kaukasus-Gebirge und wurde als Heilmittel hoch geschätzt."
    ),

    // Coffee
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet die French-Press-Zubereitung von gefiltertem Kaffee?",
        answerA = "Beim French Press zieht Kaffee ungefiltert und die Kaffeefette bleiben erhalten",
        answerB = "French Press verwendet feineres Mahlgut als Filterkaffee",
        answerC = "French Press brüht bei niedrigeren Temperaturen",
        answerD = "French Press benötigt gerösteten Kaffee mit höherem Wassergehalt",
        correctAnswer = 0,
        explanation = "Im French Press gelangt kein Papierfilter zwischen Kaffeepulver und Getränk, so dass Kaffeeöle und feine Partikel im Getränk verbleiben und für einen vollmundigen Geschmack sorgen.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Cold Brew' Kaffee?",
        answerA = "Espresso, der über Eis gegossen wird",
        answerB = "Kaffee, der ohne Hitze über viele Stunden in kaltem Wasser extrahiert wird",
        answerC = "Gefrorener Kaffee mit Milchschaum",
        answerD = "Kaffee aus speziellen kältetoleranten Bohnen",
        correctAnswer = 1,
        explanation = "Cold Brew entsteht durch stundenlanges (12–24 Stunden) Einweichen von grobem Kaffeepulver in kaltem Wasser ohne jede Hitze, was einen milden, wenig bitteren Kaffee ergibt.",
        difficulty = 2,
        funFact = "Cold Brew hat durch die schonende Extraktion einen bis zu 70 % geringeren Säuregehalt als heißgebrühter Kaffee."
    ),

    // German regional cuisine
    Question(
        categoryId = 8,
        questionText = "Was ist 'Maultaschen' und aus welcher deutschen Region stammen sie?",
        answerA = "Gefüllte Teigtaschen aus Baden-Württemberg",
        answerB = "Gebratene Klöße aus Bayern",
        answerC = "Gesalzenes Gebäck aus Norddeutschland",
        answerD = "Eingelegte Fleischwürste aus dem Rheinland",
        correctAnswer = 0,
        explanation = "Maultaschen sind gefüllte Teigtaschen aus Schwaben (Baden-Württemberg), ähnlich wie Ravioli, typischerweise mit Fleisch, Spinat und Brötchen gefüllt.",
        difficulty = 2,
        funFact = "Maultaschen werden auch 'Herrgottsbescheißerle' genannt – laut Legende versteckten Mönche das Fleisch in der Fastenzeit im Teig vor Gott."
    ),

    Question(
        categoryId = 8,
        questionText = "Welches Gericht ist typisch für die norddeutsche Küche und besteht aus gesalzenem Hering mit Zwiebeln und Gurken?",
        answerA = "Labskaus",
        answerB = "Bismarck-Hering",
        answerC = "Rollmops",
        answerD = "Matjes",
        correctAnswer = 2,
        explanation = "Rollmops besteht aus eingelegten Heringfilets, die um eine Gurke oder Zwiebel gerollt und mit einem Holzspieß fixiert werden – ein norddeutscher Klassiker.",
        difficulty = 2,
        funFact = null
    ),

    // Meat cuts
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Entrecôte'?",
        answerA = "Ein Rinderfilet aus dem Hüftbereich",
        answerB = "Ein Rindersteak aus dem Zwischenrippenbereich",
        answerC = "Ein Lammrücken mit Knochen",
        answerD = "Ein Schweinekotelett aus der Schulter",
        correctAnswer = 1,
        explanation = "Entrecôte ist ein Rindersteak, das aus dem Zwischenrippenbereich (zwischen den Rippen) geschnitten wird und durch seine Marmorierung besonders aromatisch ist.",
        difficulty = 2,
        funFact = "Der Name kommt vom Französischen 'entre' (zwischen) und 'côte' (Rippe)."
    ),

    Question(
        categoryId = 8,
        questionText = "Welches Steak kommt aus dem Hüftbereich des Rindes?",
        answerA = "T-Bone",
        answerB = "Rumpsteak",
        answerC = "Ribeye",
        answerD = "Flank Steak",
        correctAnswer = 1,
        explanation = "Rumpsteak (auch Sirloin) wird aus dem hinteren Rücken- und Hüftbereich des Rindes geschnitten und hat einen kräftigen Fleischgeschmack.",
        difficulty = 2,
        funFact = null
    ),

    // Baking science
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen Hefe- und Sauerteig?",
        answerA = "Hefeteig enthält keine Milchsäurebakterien, Sauerteig hingegen nutzt eine Kombination aus Hefen und Milchsäurebakterien",
        answerB = "Sauerteig enthält mehr Hefe als Hefeteig",
        answerC = "Hefeteig reift länger als Sauerteig",
        answerD = "Sauerteig wird nur für Weizenbrot verwendet",
        correctAnswer = 0,
        explanation = "Sauerteig enthält wilde Hefen und Milchsäurebakterien, die das Brot säuern und komplexe Aromen erzeugen. Hefeteig verwendet nur kultivierte Backhefe ohne Säuerung.",
        difficulty = 2,
        funFact = "Ein aktiv gepflegter Sauerteig-Starter kann über Jahrzehnte oder sogar Jahrhunderte weitergegeben werden."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Blätterteig' und was macht ihn so besonders?",
        answerA = "Ein Teig, der durch vielfaches Falten und Einschlagen von Butter viele hauchdünne Schichten bekommt",
        answerB = "Ein Teig mit besonders viel Backpulver für maximales Aufgehen",
        answerC = "Ein Teig, der Blätter als natürliches Triebmittel verwendet",
        answerD = "Ein glutenfreier Teig aus Reisstärke",
        correctAnswer = 0,
        explanation = "Blätterteig entsteht durch das mehrfache Falten und Ausrollen von Teig mit Buttereinlagen (Tourieren), wodurch bis zu 729 Teig-Fett-Schichten entstehen.",
        difficulty = 2,
        funFact = "Echter Blätterteig besteht aus gleichen Teilen Mehl und Butter und wird traditionell 27-mal gefaltet."
    ),

    // Tea
    Question(
        categoryId = 8,
        questionText = "Woher stammt der Darjeeling-Tee?",
        answerA = "Sri Lanka",
        answerB = "China",
        answerC = "Indien, Distrikt Darjeeling in Westbengalen",
        answerD = "Japan",
        correctAnswer = 2,
        explanation = "Darjeeling-Tee wächst in den Hochlagen des Darjeeling-Distrikts in Westbengalen, Indien, auf über 2000 Meter Höhe und gilt als der 'Champagner der Tees'.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was unterscheidet Oolong-Tee von grünem und schwarzem Tee?",
        answerA = "Oolong wird aus anderen Teepflanzen als grüner und schwarzer Tee hergestellt",
        answerB = "Oolong ist teilweise oxidiert und liegt zwischen grünem und schwarzem Tee",
        answerC = "Oolong enthält weniger Koffein als alle anderen Teesorten",
        answerD = "Oolong wird nur im Herbst geerntet",
        correctAnswer = 1,
        explanation = "Oolong-Tee wird zu 15–85 % oxidiert, was ihn geschmacklich zwischen dem unoxidierten grünen Tee und dem vollständig oxidierten schwarzen Tee positioniert.",
        difficulty = 2,
        funFact = "Der Begriff 'Oolong' bedeutet auf Chinesisch 'schwarzer Drache'."
    ),

    // Olive oil
    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'Extra Vergine' bei Olivenöl?",
        answerA = "Das Öl wurde zweimal kaltgepresst",
        answerB = "Das Öl hat einen Säuregehalt unter 0,8 % und wurde ausschließlich mechanisch gewonnen",
        answerC = "Das Öl stammt aus der ersten Ernte des Jahres",
        answerD = "Das Öl wurde besonders lange gelagert",
        correctAnswer = 1,
        explanation = "Extra Vergine (nativ extra) ist die höchste Qualitätsstufe für Olivenöl: Säuregehalt unter 0,8 %, ausschließlich mechanische Gewinnung ohne Wärme- oder Chemikalienbehandlung.",
        difficulty = 2,
        funFact = null
    ),

    // Spices
    Question(
        categoryId = 8,
        questionText = "Aus welchem Teil der Pflanze wird Safran gewonnen?",
        answerA = "Aus den Blättern der Safranpflanze",
        answerB = "Aus den Narben der Safran-Krokusblüte",
        answerC = "Aus der Wurzel der Krokuspflanze",
        answerD = "Aus den Samen der Safranfrucht",
        correctAnswer = 1,
        explanation = "Safran wird aus den drei roten Narben der Blüte des Safran-Krokus (Crocus sativus) gewonnen und muss per Hand geerntet werden – daher ist er das teuerste Gewürz der Welt.",
        difficulty = 2,
        funFact = "Für ein Kilogramm Safran werden etwa 150.000–200.000 Blüten benötigt."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Sumach' und in welcher Küche wird er häufig verwendet?",
        answerA = "Ein süßes Gewürz aus der karibischen Küche",
        answerB = "Ein säuerliches, weinrotes Gewürz aus der Levante-Küche und arabischen Küche",
        answerC = "Eine asiatische Gewürzpaste aus fermentierten Chilischoten",
        answerD = "Ein indisches Gewürz ähnlich wie Kurkuma",
        correctAnswer = 1,
        explanation = "Sumach ist ein dunkelrotes, säuerliches Gewürz aus den getrockneten Beeren des Sumachstrauchs und ist ein wichtiger Bestandteil der türkischen, libanesischen und persischen Küche.",
        difficulty = 2,
        funFact = "Sumach enthält viel Vitamin C und wurde früher als Zitronenersatz verwendet."
    ),

    // Food preservation
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen Einkochen und Einlegen in Essig?",
        answerA = "Beim Einkochen wird durch Hitze sterilisiert, beim Einlegen konserviert die Säure des Essigs",
        answerB = "Einlegen in Essig ist nur für Gemüse geeignet, Einkochen nur für Früchte",
        answerC = "Einkochen benötigt mehr Zucker als das Einlegen in Essig",
        answerD = "Beim Einlegen bleiben Vitamine besser erhalten",
        correctAnswer = 0,
        explanation = "Beim Einkochen werden Lebensmittel durch Erhitzen auf über 100 °C sterilisiert. Beim Einlegen in Essig hemmt die Essigsäure das Bakterienwachstum durch den niedrigen pH-Wert.",
        difficulty = 2,
        funFact = null
    ),

    // Famous chefs
    Question(
        categoryId = 8,
        questionText = "Für welches Restaurant und welchen Kochstil ist der Koch Ferran Adrià bekannt?",
        answerA = "El Bulli – Molekularküche und experimentelle Haute Cuisine",
        answerB = "Noma – Neue Nordische Küche",
        answerC = "The Fat Duck – britische Fusionsküche",
        answerD = "Osteria Francescana – moderne italienische Küche",
        correctAnswer = 0,
        explanation = "Ferran Adrià führte das El Bulli an der spanischen Costa Brava zu Weltruhm und gilt als Pionier der Molekularküche mit Techniken wie Gelifikation und Espumas.",
        difficulty = 2,
        funFact = "El Bulli erhielt dreimal die Auszeichnung 'Bestes Restaurant der Welt' und schloss 2011 seine Türen."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist die 'Nouvelle Cuisine' und wer sind ihre Begründer?",
        answerA = "Eine amerikanische Fastfood-Bewegung der 1960er Jahre",
        answerB = "Eine französische Kochbewegung der 1970er Jahre mit leichteren Soßen und künstlerischer Präsentation",
        answerC = "Eine japanische Fusion-Küche aus den 1980er Jahren",
        answerD = "Eine englische Küchentradition mit rustikalen Gerichten",
        correctAnswer = 1,
        explanation = "Die Nouvelle Cuisine entstand in den 1970ern unter Köchen wie Paul Bocuse und Michel Guérard als Reaktion auf die schwere klassische Küche – mit leichten Soßen, frischen Zutaten und ästhetischer Anrichtung.",
        difficulty = 2,
        funFact = null
    ),

    // Food pairings
    Question(
        categoryId = 8,
        questionText = "Was ist 'Food Pairing' als gastronomisches Konzept?",
        answerA = "Das Kombinieren von Weinen zu bestimmten Speisen",
        answerB = "Das Kombinieren von Zutaten auf Basis gemeinsamer Aromastoffe für harmonische Geschmacksprofile",
        answerC = "Das Anrichten von Speisen in ästhetischen Kombinationen",
        answerD = "Die Paarung von warmen und kalten Komponenten auf einem Teller",
        correctAnswer = 1,
        explanation = "Food Pairing basiert auf der Idee, dass Zutaten, die ähnliche Aromastoffe teilen, harmonisch miteinander kombiniert werden können – z.B. Erdbeere und Parmesan.",
        difficulty = 2,
        funFact = "Das Konzept wurde durch den Wissenschaftler Heston Blumenthal und den Parfümeur François Benzi entwickelt."
    ),

    // Thai cuisine
    Question(
        categoryId = 8,
        questionText = "Was sind die vier Grundgeschmäcker, die in der thaiändischen Küche als Balance angestrebt werden?",
        answerA = "Süß, salzig, sauer und scharf",
        answerB = "Süß, salzig, bitter und umami",
        answerC = "Scharf, säuerlich, fettig und süß",
        answerD = "Salzig, bitter, sauer und umami",
        correctAnswer = 0,
        explanation = "Die thailändische Küche strebt eine harmonische Balance aus süß (Zucker/Palmzucker), salzig (Fischsauce/Sojasauce), sauer (Limette/Tamarinde) und scharf (Chili) an.",
        difficulty = 2,
        funFact = "Fischsauce (Nam Pla) ist das wichtigste Würzmittel der Thai-Küche und ist aus fermentiertem Fisch hergestellt."
    ),

    // Indian cuisine
    Question(
        categoryId = 8,
        questionText = "Was ist 'Ghee' und wie unterscheidet es sich von Butter?",
        answerA = "Ghee ist geklärte Butter, bei der Wasser und Milcheiweiß entfernt wurden",
        answerB = "Ghee ist eine Pflanzenmargarine aus Indien",
        answerC = "Ghee ist mit Gewürzen aromatisierte Butter",
        answerD = "Ghee ist Büffelbutter mit höherem Fettgehalt",
        correctAnswer = 0,
        explanation = "Ghee ist geklärte Butter: durch langsames Erhitzen werden Wasser und Milchproteine entfernt, wodurch Ghee bei Zimmertemperatur länger haltbar ist und einen höheren Rauchpunkt hat.",
        difficulty = 2,
        funFact = null
    ),

    // Mexican cuisine
    Question(
        categoryId = 8,
        questionText = "Was ist 'Nixtamalisation' in der mexikanischen Küche?",
        answerA = "Das Einweichen von Mais in Kalkwasser zur Verbesserung des Nährstoffgehalts",
        answerB = "Ein Räucherverfahren für mexikanische Chilis",
        answerC = "Das Fermentieren von Maisteig für Tamales",
        answerD = "Eine Trocknungsmethode für Paprika",
        correctAnswer = 0,
        explanation = "Bei der Nixtamalisation wird Mais in Kalkwasser (Calciumhydroxid) eingeweicht und gekocht, was Nährstoffe freisetzt, die Verdaulichkeit verbessert und Mykotoxine reduziert.",
        difficulty = 2,
        funFact = "Die Azteken und Maya praktizierten Nixtamalisation bereits vor über 3.500 Jahren."
    ),

    // French cuisine
    Question(
        categoryId = 8,
        questionText = "Was ist eine 'Beurre blanc'-Sauce?",
        answerA = "Eine cremige Käsesauce aus der Normandie",
        answerB = "Eine emulgierte Buttersauce auf Basis von Weißwein und Schalotten",
        answerC = "Eine helle Mehlschwitze mit Milch",
        answerD = "Eine Mayonnaise-Variante mit weißem Wein",
        correctAnswer = 1,
        explanation = "Beurre blanc ist eine klassische französische Sauce aus reduziertem Weißwein, Weinessig und Schalotten, in die kalte Butter einmontiert wird, um eine cremige Emulsion zu erzeugen.",
        difficulty = 2,
        funFact = null
    ),

    // Pasta
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'frischer Pasta' und 'Trockenpasta'?",
        answerA = "Frische Pasta wird aus Hartweizengrieß hergestellt, Trockenpasta aus Weichweizenmehl",
        answerB = "Frische Pasta enthält meist Eier und Weichweizenmehl, Trockenpasta besteht aus Hartweizengrieß und Wasser",
        answerC = "Der einzige Unterschied ist der Wassergehalt beim Kauf",
        answerD = "Trockenpasta ist nahrhafter, da sie mehr Protein enthält",
        correctAnswer = 1,
        explanation = "Frische Pasta (Pasta fresca) wird in Italien traditionell aus Weichweizenmehl und Eiern hergestellt. Trockenpasta (Pasta secca) besteht aus Hartweizengrieß und Wasser und hat eine längere Haltbarkeit.",
        difficulty = 2,
        funFact = "In Süditalien wird frische Pasta häufiger aus Hartweizengrieß ohne Eier hergestellt."
    ),

    // Seafood
    Question(
        categoryId = 8,
        questionText = "Was ist 'Dashi' in der japanischen Küche?",
        answerA = "Eine Würzpaste aus Miso und Algen",
        answerB = "Ein Grundfond aus Kombu-Algen und Bonitoflocken",
        answerC = "Eine Marinade aus Sojasoße und Sake",
        answerD = "Ein fermentierter Fischfond ähnlich wie Fischsauce",
        correctAnswer = 1,
        explanation = "Dashi ist die grundlegende japanische Brühe, die meist aus getrockneten Kombu-Algen und Katsuobushi (Bonitoflocken) hergestellt wird und die Basis vieler Suppen und Saucen bildet.",
        difficulty = 2,
        funFact = "Dashi ist reich an Glutamaten und gilt als wichtigste natürliche Quelle des Umami-Geschmacks."
    ),

    // Baking
    Question(
        categoryId = 8,
        questionText = "Was ist die Rolle von Gluten beim Brotbacken?",
        answerA = "Gluten liefert Energie für die Hefegärung",
        answerB = "Gluten bildet ein elastisches Netzwerk, das Gärgase einschließt und dem Brot Struktur gibt",
        answerC = "Gluten sorgt für die braune Farbe der Kruste",
        answerD = "Gluten macht das Brot süßer",
        correctAnswer = 1,
        explanation = "Gluten entsteht durch die Verbindung von Gliadin und Glutenin beim Kneten und bildet ein dehnbares Eiweißnetzwerk, das CO₂-Blasen der Hefe einschließt und dem Brot seine Struktur verleiht.",
        difficulty = 2,
        funFact = null
    ),

    // Drinks
    Question(
        categoryId = 8,
        questionText = "Was ist 'Shrub' als Getränkebasis?",
        answerA = "Ein alkoholfreier Sirup aus Früchten, Zucker und Essig",
        answerB = "Ein britischer Kräuterlikör",
        answerC = "Ein amerikanischer Gerstenwein",
        answerD = "Ein fermentiertes Fruchtgetränk ähnlich wie Kefir",
        correctAnswer = 0,
        explanation = "Ein Shrub ist ein konzentrierter Sirup aus Früchten oder Kräutern, Zucker und Essig – historisch als Konservierungsmethode genutzt und heute in der Cocktailkultur sehr beliebt.",
        difficulty = 2,
        funFact = "Shrubs wurden im 18. Jahrhundert in Amerika als alkoholarme Alternative zu Spirituosen populär."
    ),

    // Sauces
    Question(
        categoryId = 8,
        questionText = "Was sind die fünf 'Muttersaucen' der klassischen französischen Küche?",
        answerA = "Béchamel, Espagnole, Velouté, Hollandaise und Tomate",
        answerB = "Béchamel, Bordelaise, Béarnaise, Jus und Velouté",
        answerC = "Beurre blanc, Espagnole, Velouté, Hollandaise und Mayonnaise",
        answerD = "Béchamel, Roux, Espagnole, Fond und Tomate",
        correctAnswer = 0,
        explanation = "Die fünf Muttersaucen nach Auguste Escoffier sind: Béchamel (Mehlschwitze + Milch), Espagnole (dunkle Kalbsfleischsauce), Velouté (heller Fond), Hollandaise (Buttersauce) und Tomatensauce.",
        difficulty = 2,
        funFact = null
    ),

    // Grains
    Question(
        categoryId = 8,
        questionText = "Was ist 'Farro' und aus welchem Land stammt er hauptsächlich?",
        answerA = "Ein Pseudogetreide aus den Anden",
        answerB = "Ein uraltes Weizengetreide aus dem Mittelmeerraum, besonders aus Italien",
        answerC = "Eine Hirse-Sorte aus Afrika",
        answerD = "Ein glutenfreies Getreide aus Ostasien",
        correctAnswer = 1,
        explanation = "Farro ist ein Sammelbegriff für alte Weizenarten (Einkorn, Emmer, Dinkel) und stammt ursprünglich aus dem Nahen Osten – in der Toskana ist er ein traditionelles Grundnahrungsmittel.",
        difficulty = 2,
        funFact = "Farro war das Hauptgetreide im Römischen Reich und wurde als 'Grain of Rome' bezeichnet."
    ),

    // Alcohol fermentation
    Question(
        categoryId = 8,
        questionText = "Was ist 'Koji' und wie wird er in der japanischen Küche eingesetzt?",
        answerA = "Ein japanisches Fermentationsgewürz aus Algensalz",
        answerB = "Ein Schimmelpilz (Aspergillus oryzae), der zur Herstellung von Miso, Sake und Sojasauce verwendet wird",
        answerC = "Eine Hefekultur für japanische Weizenbiere",
        answerD = "Ein fermentiertes Bambusprodukt",
        correctAnswer = 1,
        explanation = "Koji (Aspergillus oryzae) ist ein Schimmelpilz, der auf Reis, Gerste oder Sojabohnen kultiviert wird und Enzyme produziert, die Stärke und Protein abbauen – er ist die Grundlage für Sake, Miso und Sojasauce.",
        difficulty = 2,
        funFact = null
    ),

    // Sausages
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Mortadella' und gewöhnlicher Fleischwurst?",
        answerA = "Mortadella wird aus Pferdefleisch hergestellt",
        answerB = "Mortadella ist eine italienische Brühwurst mit Speckwürfeln und Pistazien aus Bologna",
        answerC = "Mortadella enthält im Gegensatz zu normaler Wurst keine Gewürze",
        answerD = "Mortadella wird geräuchert, Fleischwurst nicht",
        correctAnswer = 1,
        explanation = "Mortadella ist eine geschützte italienische Brühwurst aus Bologna mit charakteristischen weißen Speckwürfeln und oft Pistazien – sie ist die Inspiration für den amerikanischen 'Bologna'-Wurst.",
        difficulty = 2,
        funFact = "Echter Mortadella IGP darf nur in der Emilia-Romagna und benachbarten Regionen hergestellt werden."
    ),

    // Sugar and confections
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Fondant' und 'Marzipan'?",
        answerA = "Fondant ist eine Zuckermasse, Marzipan wird aus Mandeln und Zucker hergestellt",
        answerB = "Marzipan ist süßer als Fondant",
        answerC = "Fondant enthält immer Gelatine, Marzipan nicht",
        answerD = "Beide sind identisch, nur die Bezeichnung unterscheidet sich",
        correctAnswer = 0,
        explanation = "Fondant ist eine formbare Zuckermasse (gekochter Zucker mit Glukose), während Marzipan aus gemahlenen Mandeln und Zucker besteht und einen nussigen Mandelgeschmack hat.",
        difficulty = 2,
        funFact = null
    ),

    // Fermented drinks
    Question(
        categoryId = 8,
        questionText = "Was ist 'Tepache' und aus welchem Land stammt es?",
        answerA = "Ein fermentiertes Ananasgetränk aus Mexiko",
        answerB = "Ein alkoholarmes Reisbier aus Japan",
        answerC = "Ein fermentierter Maistrank aus Peru",
        answerD = "Ein Ingwerbier aus Jamaika",
        correctAnswer = 0,
        explanation = "Tepache ist ein traditionelles mexikanisches Fermentationsgetränk aus Ananasschalen, Piloncillo (Rohzucker) und Gewürzen wie Zimt und Nelken – leicht alkoholisch und sehr erfrischend.",
        difficulty = 2,
        funFact = "Tepache stammt von den präkolumbischen Azteken und wurde ursprünglich aus Mais gebraut."
    ),

    // Mushrooms
    Question(
        categoryId = 8,
        questionText = "Was sind 'Porcini' und in welcher Küche spielen sie eine wichtige Rolle?",
        answerA = "Austernpilze in der asiatischen Küche",
        answerB = "Steinpilze (Boletus edulis) in der italienischen und europäischen Küche",
        answerC = "Trüffeln in der französischen Haute Cuisine",
        answerD = "Shiitake-Pilze in der japanischen Küche",
        correctAnswer = 1,
        explanation = "Porcini ist der italienische Name für Steinpilze (Boletus edulis), die in der europäischen, besonders der italienischen Küche für Risotto, Pasta und Saucen sehr geschätzt werden.",
        difficulty = 2,
        funFact = null
    ),

    // Korean cuisine
    Question(
        categoryId = 8,
        questionText = "Was ist 'Doenjang' in der koreanischen Küche?",
        answerA = "Ein fermentiertes Sojabohnenpaste ähnlich wie japanisches Miso",
        answerB = "Eine süß-saure Chilisauce",
        answerC = "Ein koreanischer Reisschnaps",
        answerD = "Ein mariniertes Rindfleischgericht",
        correctAnswer = 0,
        explanation = "Doenjang ist eine fermentierte Sojabohnenpaste aus Korea, die ähnlich wie japanisches Miso hergestellt wird und als Würzmittel für Suppen, Marinaden und Dips verwendet wird.",
        difficulty = 2,
        funFact = "Doenjang gilt in Korea als Superfood und enthält zahlreiche probiotische Bakterien."
    ),

    // Pastry
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Croissant' und welche Technik steckt dahinter?",
        answerA = "Ein österreichisches Gebäck aus Hefeteig mit Zuckerfüllung",
        answerB = "Ein halbmondförmiges Plundergebäck aus laminiertem Teig mit Buttereinlagen",
        answerC = "Ein französisches Brandteiggebäck mit Vanillecreme",
        answerD = "Ein belgisches Waffelgebäck mit Karamellisierung",
        correctAnswer = 1,
        explanation = "Das Croissant ist ein halbmondförmiges Plundergebäck (ähnlich Blätterteig) aus mehrfach gefaltetem Hefeteig mit Buttereinlagen – die Technik heißt 'Lamination' und schafft viele dünne Schichten.",
        difficulty = 2,
        funFact = null
    ),

    // Vinegar
    Question(
        categoryId = 8,
        questionText = "Was macht 'Balsamico di Modena' besonders?",
        answerA = "Er wird aus Traubenmost hergestellt und jahrelang in verschiedenen Holzfässern gereift",
        answerB = "Er ist ein Weinessig aus der Region Toskana",
        answerC = "Er enthält Balsamharz und ist daher besonders aromatisch",
        answerD = "Er wird durch Destillation hergestellt",
        correctAnswer = 0,
        explanation = "Echter Balsamico di Modena (Aceto Balsamico Tradizionale) wird aus eingedicktem Traubenmost (Most, kein Wein) hergestellt und mindestens 12 Jahre in Fässern aus verschiedenen Holzarten gereift.",
        difficulty = 2,
        funFact = "Traditioneller Balsamico aus Modena mit 25 Jahren Reifung ist der teuerste Essig der Welt und kann über 200 € pro 100 ml kosten."
    ),

    // Chocolate
    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'Temperieren' von Schokolade?",
        answerA = "Das Erwärmen von Schokolade auf Körpertemperatur vor dem Servieren",
        answerB = "Ein gezieltes Erhitzen und Abkühlen der Schokolade, um stabile Kakaobutterkristalle zu bilden",
        answerC = "Das Mischen von Milch- und Zartbitterschokolade",
        answerD = "Das Lagern von Schokolade bei konstanter Temperatur",
        correctAnswer = 1,
        explanation = "Beim Temperieren wird Schokolade auf ca. 45–50 °C erwärmt, dann auf 27 °C abgekühlt und wieder auf 31–32 °C erwärmt, um die gewünschte Form-V-Kakaobutterkristalle zu erzeugen, die für Glanz und Knackigkeit sorgen.",
        difficulty = 2,
        funFact = null
    ),

    // Herbs
    Question(
        categoryId = 8,
        questionText = "Was ist 'Fines Herbes' in der französischen Küche?",
        answerA = "Eine Gewürzmischung aus Thymian, Rosmarin und Salbei",
        answerB = "Eine klassische Kräutermischung aus Petersilie, Schnittlauch, Estragon und Kerbel",
        answerC = "Getrocknete provenzalische Kräuter",
        answerD = "Nur frische Kräuter im Gegensatz zu getrockneten",
        correctAnswer = 1,
        explanation = "Fines Herbes ist eine klassische französische Kräutermischung aus gleichen Teilen frischer Petersilie, Schnittlauch, Estragon und Kerbel – zart im Aroma und ideal für Omeletts und Fisch.",
        difficulty = 2,
        funFact = "Im Gegensatz zu Herbes de Provence werden Fines Herbes immer frisch und nie getrocknet verwendet."
    ),

    // Ice cream
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Gelato' und Eiscreme?",
        answerA = "Gelato hat weniger Fett und Luft und wird bei höherer Temperatur serviert",
        answerB = "Eiscreme enthält kein Ei, Gelato schon",
        answerC = "Gelato ist immer süßer als Eiscreme",
        answerD = "Es gibt keinen Unterschied außer dem Namen",
        correctAnswer = 0,
        explanation = "Gelato wird mit weniger Rahm (mehr Milch), weniger Eigelb und weniger eingeschlagener Luft (Overrun) hergestellt und bei -11 °C serviert – wärmer als Eiscreme (-18 °C), was die weichere Textur erklärt.",
        difficulty = 2,
        funFact = null
    ),

    // Spicy food
    Question(
        categoryId = 8,
        questionText = "Was misst die 'Scoville-Skala'?",
        answerA = "Den Bittergrad von Hopfen in Bier",
        answerB = "Die Schärfe von Chilis durch die Konzentration des Wirkstoffs Capsaicin",
        answerC = "Den Säuregehalt von Essig und Zitrussäften",
        answerD = "Die Intensität von Umami in Lebensmitteln",
        correctAnswer = 1,
        explanation = "Die Scoville-Skala misst die Schärfe von Chilis durch die Konzentration von Capsaicin in Scoville Heat Units (SHU) – ein normaler Jalapeño hat 2.500–8.000 SHU, ein Carolina Reaper über 2 Millionen.",
        difficulty = 2,
        funFact = "Wilbur Scoville entwickelte seine Skala 1912 durch Verdünnungstests mit menschlichen Probanden."
    ),

    // Bread
    Question(
        categoryId = 8,
        questionText = "Was ist 'Challah' und in welcher Kultur hat es seinen Ursprung?",
        answerA = "Ein gesüßtes Weißbrot aus Italien mit Safran",
        answerB = "Ein geflochtenes jüdisches Hefebrot, das traditionell am Schabbat gegessen wird",
        answerC = "Ein süßes Weihnachtsbrot aus Österreich",
        answerD = "Ein flatbreads aus der arabischen Küche",
        correctAnswer = 1,
        explanation = "Challah ist ein geflochtenes Hefebrot aus der jüdischen Küche, das traditionell zum Schabbat und an jüdischen Feiertagen gereicht wird und durch Eier und Öl besonders weich und zart ist.",
        difficulty = 2,
        funFact = null
    ),

    // Umami sources
    Question(
        categoryId = 8,
        questionText = "Welche Lebensmittel sind natürliche Quellen für Glutamat und damit für Umami-Geschmack?",
        answerA = "Nur fermentierte Produkte wie Sojasoße und Miso",
        answerB = "Parmesan, Tomaten, Pilze, Sojasoße, getrocknete Shiitake und reife Käsesorten",
        answerC = "Ausschließlich tierische Proteinquellen wie Fleisch und Fisch",
        answerD = "Nur Algen und Meeresfrüchte",
        correctAnswer = 1,
        explanation = "Umami-reiche Lebensmittel sind sehr vielfältig: Parmesankäse, Tomaten (besonders getrocknet), Pilze, Sojasoße, Miso, Worcestershire-Sauce, Fleischextrakt und Kombu-Algen.",
        difficulty = 2,
        funFact = "Parmesan hat mit über 1.200 mg Glutamat pro 100 g einen der höchsten natürlichen Glutamatgehalte überhaupt."
    ),

    // Vinification
    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'Malolaktische Gärung' (MLF) beim Weinausbau?",
        answerA = "Die Umwandlung von hartem Apfelsäure in milderen Milchsäure durch Bakterien",
        answerB = "Die zweite alkoholische Gärung bei der Sektherstellung",
        answerC = "Das Anreichern des Weins mit Restzucker",
        answerD = "Das Filtrieren von Trubstoffen aus dem Wein",
        correctAnswer = 0,
        explanation = "Bei der malolaktischen Gärung wandeln Milchsäurebakterien die scharfe Apfelsäure (Malonsäure) in die weichere Milchsäure um, was Weinen ein cremigeres Mundgefühl und weniger Säure verleiht.",
        difficulty = 2,
        funFact = null
    ),

)
