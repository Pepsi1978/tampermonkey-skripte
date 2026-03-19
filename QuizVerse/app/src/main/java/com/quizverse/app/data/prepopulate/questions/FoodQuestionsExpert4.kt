package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsExpert4(): List<Question> = listOf(

    // Question 1 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "In welchen italienischen Provinzen darf Parmigiano Reggiano DOP ausschließlich hergestellt werden?",
        answerA = "Florenz, Siena, Arezzo und Pisa",
        answerB = "Parma, Reggio Emilia, Modena, Bologna (li. Reno-Ufer) und Mantua (re. Po-Ufer)",
        answerC = "Verona, Vicenza, Padua und Venedig",
        answerD = "Mailand, Como, Brescia und Bergamo",
        correctAnswer = 1,
        explanation = "Parmigiano Reggiano DOP darf nur in einem klar definierten Gebiet um Parma, Reggio Emilia, Modena, dem linken Reno-Ufer bei Bologna und dem rechten Po-Ufer bei Mantua hergestellt werden. Alle Produktionsschritte inklusive der Milcherzeugung müssen dort stattfinden.",
        difficulty = 4,
        funFact = "Das Produktionsgebiet von Parmigiano Reggiano ist seit dem Mittelalter nahezu unverändert geblieben – die ersten urkundlichen Erwähnungen stammen aus dem 13. Jahrhundert."
    ),

    // Question 2 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was bedeutet die Abkürzung 'g.U.' auf europäischen Lebensmitteln?",
        answerA = "Garantiert umweltfreundlich",
        answerB = "Geprüfte Umweltqualität",
        answerC = "Geschützte Ursprungsbezeichnung",
        answerD = "Gesetzlich unverwechselbar",
        correctAnswer = 2,
        explanation = "g.U. steht für 'Geschützte Ursprungsbezeichnung' (englisch PDO, französisch AOP, italienisch DOP). Bei g.U.-Produkten müssen Erzeugung, Verarbeitung und Herstellung ausnahmslos in einem bestimmten geografischen Gebiet erfolgen.",
        difficulty = 4,
        funFact = "Das EU-Schutzzeichen für g.U. ist ein gelbes Symbol mit blauem Rahmen, während g.g.A. (geschützte geografische Angabe) in Blau-Gelb mit anderem Motiv dargestellt wird."
    ),

    // Question 3 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welche drei Traubensorten dominieren mit 99,7 % der Rebfläche die Champagne-Produktion?",
        answerA = "Riesling, Müller-Thurgau und Silvaner",
        answerB = "Sauvignon Blanc, Semillon und Muscadelle",
        answerC = "Grenache, Syrah und Mourvèdre",
        answerD = "Pinot Noir, Pinot Meunier und Chardonnay",
        correctAnswer = 3,
        explanation = "In der Champagne dominieren Pinot Noir (ca. 38 %), Pinot Meunier (ca. 32 %) und Chardonnay (ca. 30 %). Ein Blanc de Blancs besteht ausschließlich aus Chardonnay, ein Blanc de Noirs ausschließlich aus den roten Sorten.",
        difficulty = 4,
        funFact = "Obwohl Pinot Noir und Pinot Meunier rote Trauben sind, entsteht aus ihnen weißer Champagner – der Saft wird sofort vom Beerenhäutchen getrennt, bevor er sich färben kann."
    ),

    // Question 4 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Seit welchem Jahr ist Feta-Käse als geschützte Ursprungsbezeichnung (g.U.) auf EU-Ebene ausschließlich Griechenland vorbehalten?",
        answerA = "1992",
        answerB = "1996",
        answerC = "2010",
        answerD = "2002",
        correctAnswer = 3,
        explanation = "Feta erhielt 2002 die EU-weite geschützte Ursprungsbezeichnung (g.U.). Zuvor hatten Dänemark und Deutschland jahrelang dagegen geklagt, da sie selbst Käse unter dem Namen 'Feta' produzierten. Der Europäische Gerichtshof bestätigte den Schutz 2005 endgültig.",
        difficulty = 4,
        funFact = "Authentischer Feta muss aus mindestens 70 % Schafsmilch hergestellt werden – der Rest darf Ziegenmilch sein. Kuhmilch ist für echten Feta verboten."
    ),

    // Question 5 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Wie groß ist das Champagne-Anbaugebiet ungefähr, und in welchem Département liegt der größte Teil?",
        answerA = "Ca. 34.000 ha, Département Marne (66 %)",
        answerB = "Ca. 50.000 ha, Département Aube (70 %)",
        answerC = "Ca. 15.000 ha, Département Aisne (55 %)",
        answerD = "Ca. 80.000 ha, Département Seine-et-Marne (45 %)",
        correctAnswer = 0,
        explanation = "Das Champagne-Anbaugebiet umfasst rund 34.000 Hektar und verteilt sich auf fünf Départements. Den größten Anteil hält die Marne mit etwa 66 %, gefolgt von der Aube mit 23 % und der Aisne mit 10 %.",
        difficulty = 4,
        funFact = "Das Champagne-Gebiet liegt etwa 150 km östlich von Paris und besteht aus 320 Crus (Gemeinden), von denen nur 17 den Status 'Grand Cru' tragen."
    ),

    // Question 6 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welchen wichtigen Unterschied gibt es zwischen g.U. (geschützte Ursprungsbezeichnung) und g.g.A. (geschützte geografische Angabe)?",
        answerA = "Bei g.U. müssen alle Produktionsschritte aus der Region stammen; bei g.g.A. reicht mindestens ein Schritt",
        answerB = "g.U. gilt nur für Wein; g.g.A. gilt nur für Lebensmittel",
        answerC = "g.U. ist freiwillig; g.g.A. ist gesetzlich verpflichtend",
        answerD = "Bei g.g.A. muss die gesamte Rohware aus der Region kommen; bei g.U. nicht",
        correctAnswer = 0,
        explanation = "Der wesentliche Unterschied: Bei g.U. müssen Erzeugung, Verarbeitung und Herstellung vollständig in der geschützten Region erfolgen. Bei g.g.A. genügt es, wenn mindestens einer dieser drei Schritte – Erzeugung ODER Verarbeitung ODER Herstellung – in der Region stattfindet.",
        difficulty = 4,
        funFact = "Schwarzwälder Schinken trägt das g.g.A.-Siegel – die Schweine müssen nicht aus dem Schwarzwald stammen, aber Würzen, Räuchern und Reifen müssen dort stattfinden."
    ),

    // Question 7 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welche Käsesorte erhielt 1958 als einer der ersten Käse überhaupt den AOC-Status in Frankreich und produziert heute jährlich ca. 65.000 Tonnen?",
        answerA = "Brie de Meaux",
        answerB = "Roquefort",
        answerC = "Comté",
        answerD = "Camembert de Normandie",
        correctAnswer = 2,
        explanation = "Comté aus der Region Franche-Comté erhielt bereits 1958 den AOC-Status und ist heute der mengenmäßig größte PDO-Käse Frankreichs mit rund 65.000 Tonnen Jahresproduktion. Er wird ausschließlich aus Rohmilch von Montbéliarde- oder Simmental-Kühen hergestellt.",
        difficulty = 4,
        funFact = "Für einen einzigen Laib Comté (ca. 40 kg) werden etwa 400 Liter Rohmilch benötigt. Die Kühe dürfen nur auf Bergweiden grasen und kein Silofutter fressen."
    ),

    // Question 8 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Roquefort ist einer der berühmtesten Blauschimmelkäse der Welt. Aus welcher Milch wird er hergestellt und in welchem geografischen Ort muss er reifen?",
        answerA = "Kuhmilch; Reifung in den Höhlen von Combalou bei Roquefort-sur-Soulzon",
        answerB = "Ziegenmilch; Reifung in den Kellern von Millau im Aveyron",
        answerC = "Büffelmilch; Reifung in den Grotten des Massif Central",
        answerD = "Schafsmilch; Reifung in den natürlichen Kalksteinhöhlen von Roquefort-sur-Soulzon",
        correctAnswer = 3,
        explanation = "Echter Roquefort AOP muss aus Schafsmilch (Lacaune-Schafe) hergestellt und ausschließlich in den natürlichen Kalksteinhöhlen des Combalou-Massivs bei Roquefort-sur-Soulzon im Aveyron gereift werden. Die Höhlen haben eine konstante Temperatur von etwa 9 °C und eine hohe Luftfeuchtigkeit.",
        difficulty = 4,
        funFact = "Der Schimmelpilz Penicillium roqueforti, der Roquefort seine charakteristische Blaumarmorierung verleiht, kommt natürlicherweise in den Höhlen von Roquefort-sur-Soulzon vor."
    ),

    // Question 9 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Prosciutto di Parma DOP darf nur mit einer einzigen Zutat hergestellt werden. Welche ist das?",
        answerA = "Salz",
        answerB = "Schwarzer Pfeffer",
        answerC = "Meersalz und Nitritpökelsalz",
        answerD = "Meersalz und Rosmarin",
        correctAnswer = 0,
        explanation = "Prosciutto di Parma darf ausschließlich mit Salz konserviert werden – ohne jegliche Konservierungsstoffe, Zusatzstoffe, chemische Substanzen oder Räucherung. Diese strikte Regel ist Teil der g.U.-Spezifikation und garantiert den einzigartigen süßlichen Geschmack.",
        difficulty = 4,
        funFact = "Ein Prosciutto di Parma reift mindestens 12 Monate. Die Prüfung auf Qualität erfolgt traditionell durch einen 'Maestro Salatore', der mit einer Pferdeknochensonde in den Schinken sticht und am Geruch die Qualität beurteilt."
    ),

    // Question 10 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Der Emmentaler AOP aus der Schweiz trägt seit 2013 den AOP-Status. In welchen Schweizer Kantonen darf er ausschließlich produziert werden?",
        answerA = "Nur im Kanton Bern (gesamtes Kantonsgebiet)",
        answerB = "In der gesamten deutschsprachigen Schweiz plus dem Kanton Tessin",
        answerC = "Nur in den Kantonen Bern, Luzern und Freiburg",
        answerD = "In den Kantonen Bern (ohne Bezirk Moutier), Aargau, Glarus, Luzern, Schwyz, Solothurn, St. Gallen, Thurgau, Zug, Zürich und Teilen Freiburgs",
        correctAnswer = 3,
        explanation = "Die AOP-Spezifikation für Emmentaler definiert präzise, welche Kantone zur Produktionsregion gehören. Emmentaler AOP muss ausschließlich aus frischer Rohmilch dieser Region hergestellt werden – Pasteurisierung ist nicht erlaubt.",
        difficulty = 4,
        funFact = "Emmentaler AOP ist an seinen großen Löchern erkennbar, die durch das Bakterium Propionibacterium freudenreichii entstehen, das CO2 produziert und so die charakteristischen Augen bildet."
    ),

    // Question 11 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was sind die Mindestanforderungen für Aceto Balsamico di Modena g.g.A. bezüglich der Reifezeit und des Mindest-Säuregehalts?",
        answerA = "Mindestens 12 Jahre Reifung; 4 % Säuregehalt",
        answerB = "Mindestens 3 Jahre Reifung; 5 % Säuregehalt",
        answerC = "Mindestens 60 Tage Reifung; 6 % Säuregehalt",
        answerD = "Mindestens 180 Tage Reifung; 8 % Säuregehalt",
        correctAnswer = 2,
        explanation = "Aceto Balsamico di Modena g.g.A. muss mindestens 60 Tage reifen und einen Mindest-Säuregehalt von 6 % aufweisen. Diese Säure darf ausschließlich aus Wein stammen. Die Herstellung ist nur in den Provinzen Modena oder Reggio Emilia erlaubt.",
        difficulty = 4,
        funFact = "Vom Aceto Balsamico di Modena zu unterscheiden ist der 'Aceto Balsamico Tradizionale di Modena DOP', der mindestens 12 Jahre (extra alte Qualität: 25 Jahre) in Holzfässern reifen muss und deutlich teurer ist."
    ),

    // Question 12 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Stilton-Käse aus England besitzt seit 1996 den PDO-Status. In welchen drei Grafschaften darf er ausschließlich hergestellt werden?",
        answerA = "Yorkshire, Lancashire und Cheshire",
        answerB = "Somerset, Devon und Dorset",
        answerC = "Derbyshire, Leicestershire und Nottinghamshire",
        answerD = "Norfolk, Suffolk und Cambridgeshire",
        correctAnswer = 2,
        explanation = "Stilton PDO darf ausschließlich in den Grafschaften Derbyshire, Leicestershire und Nottinghamshire produziert werden. Ironischerweise liegt das Dorf Stilton selbst in Cambridgeshire und gehört damit NICHT zur geschützten Produktionsregion.",
        difficulty = 4,
        funFact = "Nach Erhalt des PDO-Schutzes 1996 ist es verboten, Stilton aus Rohmilch herzustellen – obwohl historisch gesehen Rohmilch-Stilton die traditionelle Herstellungsweise war."
    ),

    // Question 13 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welche Institution wurde 1935 in Paris gegründet, um geschützte Herkunftsbezeichnungen für den französischen Weinbau zu schaffen und zu überwachen?",
        answerA = "INAO – Institut National de l'Origine et de la Qualité",
        answerB = "CIVB – Conseil Interprofessionnel du Vin de Bordeaux",
        answerC = "DGCCRF – Direction Générale de la Concurrence",
        answerD = "SOPEXA – Société pour l'Expansion des Ventes",
        correctAnswer = 0,
        explanation = "Das INAO (Institut National de l'Origine et de la Qualité) wurde 1935 gegründet und ist bis heute für die Vergabe und Überwachung von AOC/AOP-Bezeichnungen in Frankreich zuständig. Es umfasst heute über 400 AOC-Weine und zahlreiche Lebensmittelprodukte.",
        difficulty = 4,
        funFact = "Das INAO überwacht nicht nur Weine, sondern auch Käse, Butter, Geflügel (z.B. Poulet de Bresse AOP), Obst und Gemüse. Frankreich hat eine der höchsten Dichten an geschützten Produkten weltweit."
    ),

    // Question 14 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Für einen echten Jamón Ibérico de Bellota (Eichel-Ibérico) gelten strenge Regeln. Was ist die Mindest-Ibérico-Abstammung des Schweins, und wie lange reift der Schinken mindestens?",
        answerA = "100 % Ibérico; mindestens 6 Monate Reifung",
        answerB = "Mindestens 25 % Ibérico-Abstammung; mindestens 12 Monate Reifung",
        answerC = "100 % Ibérico; genau 18 Monate Reifung",
        answerD = "Mindestens 50 % Ibérico-Abstammung; bis zu 3 Jahre Reifung",
        correctAnswer = 3,
        explanation = "Für den DOP-Schutz muss ein Jamón Ibérico mindestens 50 % Ibérico-Abstammung haben. Der hochwertigste 'Bellota 100 % Ibérico' muss vollständig aus reinrassigen Schwarzfußschweinen bestehen, die in der Montanera (Herbst/Winter) ausschließlich Eicheln fressen. Reifung kann bis zu 4 Jahre dauern.",
        difficulty = 4,
        funFact = "Ein einzelner Jamón Ibérico de Bellota kann bis zu 500 Euro kosten. Das liegt an der langen Aufzucht: Die Schweine leben halbwild in der Dehesa (Eichenweideland) und legen täglich mehrere Kilometer zurück."
    ),

    // Question 15 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen AOC und AOP bei französischen Produkten?",
        answerA = "AOC ist für Weine, AOP ist für Lebensmittel – sie sind inhaltlich verschieden",
        answerB = "AOP ist strenger als AOC und verlangt zusätzliche Qualitätsprüfungen",
        answerC = "AOC gilt nur für staatliche Betriebe; AOP auch für private Hersteller",
        answerD = "AOC ist die ältere französische Bezeichnung; AOP ist der EU-weit gültige Begriff seit 2009, inhaltlich gleichwertig",
        correctAnswer = 3,
        explanation = "AOC (Appellation d'Origine Contrôlée) war die klassische französische Herkunftsbezeichnung. 2009 trat die EU-Weinmarktordnung in Kraft, die den Begriff AOP (Appellation d'Origine Protégée) als EU-weit einheitliche Bezeichnung einführte. AOC und AOP sind inhaltlich gleichwertig – es handelt sich nur um eine Umbenennung.",
        difficulty = 4,
        funFact = "Champagner ist eine besondere Ausnahme: Champagner-Produzenten dürfen weiterhin die Bezeichnung 'Champagne' ohne explizites AOP-Siegel auf der Flasche verwenden, da der Name selbst als geschützte Ursprungsbezeichnung gilt."
    ),

    // Question 16 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welche deutschen regionalen Spezialitäten tragen das Siegel g.g.A. (geschützte geografische Angabe)?",
        answerA = "Allgäuer Bergkäse, Weißwurst und Bayerisches Bier",
        answerB = "Frankfurter Würstchen, Berliner Weiße und Dresdner Stollen",
        answerC = "Lübecker Marzipan, Kölsch und Rügenwalder Teewurst",
        answerD = "Schwarzwälder Schinken, Nürnberger Rostbratwurst und Thüringer Rostbratwurst",
        correctAnswer = 3,
        explanation = "Schwarzwälder Schinken, Nürnberger Rostbratwurst und Thüringer Rostbratwurst sind bekannte deutsche Produkte mit g.g.A.-Schutz. Derzeit sind knapp 80 deutsche Produkte als g.g.A. und 31 als g.U. registriert – letztere hauptsächlich Weine und Käse.",
        difficulty = 4,
        funFact = "Die Nürnberger Rostbratwurst ist mit 7–9 cm die kleinste geschützte Bratwurst Deutschlands. Das Zerkleinern des Fleisches, Würzen und Abfüllen muss innerhalb der Stadtgrenzen Nürnbergs erfolgen."
    ),

    // Question 17 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Mozzarella di Bufala Campana DOP wird ausschließlich aus Büffelmilch hergestellt. In welchen italienischen Regionen ist die Produktion erlaubt?",
        answerA = "Nur in Kampanien",
        answerB = "In Sizilien, Sardinien und Kalabrien",
        answerC = "In der Emilia-Romagna und der Toskana",
        answerD = "In Kampanien, Apulien, Latium und der Molise",
        correctAnswer = 3,
        explanation = "Mozzarella di Bufala Campana DOP darf in Kampanien, Apulien, dem Latium und der Molise hergestellt werden. Er trägt seit 1996 den EU-weiten DOP-Schutz. Im Gegensatz dazu darf 'Mozzarella' (ohne Zusatz) auch aus Kuhmilch hergestellt werden.",
        difficulty = 4,
        funFact = "Die Wasserbüffel, deren Milch für Mozzarella di Bufala Campana benötigt wird, wurden vermutlich im Mittelalter von arabischen oder normannischen Händlern nach Süditalien gebracht. Büffelmilch hat einen doppelt so hohen Fettgehalt wie Kuhmilch."
    ),

    // Question 18 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Halloumi ist ein Käse mit geschützter Ursprungsbezeichnung (g.U.). Aus welchem Land stammt er und welche Besonderheit hat seine Herstellung?",
        answerA = "Türkei; er wird aus reiner Schafsmilch und Kamelmilch hergestellt",
        answerB = "Libanon; er reift mindestens 2 Jahre in Salzlake",
        answerC = "Zypern; er muss mit frischer oder getrockneter grüner Minze hergestellt werden",
        answerD = "Griechenland; er wird nach dem Räuchern in Olivenöl eingelegt",
        correctAnswer = 2,
        explanation = "Halloumi g.U. darf ausschließlich auf Zypern hergestellt werden. Die Verwendung von frischer oder getrockneter grüner Minze ist ein vorgeschriebenes Merkmal. Die Milch, das Lab und die Minze müssen von der Insel stammen.",
        difficulty = 4,
        funFact = "Halloumi hat einen ungewöhnlich hohen Schmelzpunkt, was ihn ideal zum Braten oder Grillen macht. Dieser Effekt entsteht durch die spezielle Herstellung: Das Käsebruch wird nach dem Pressen nochmals in der heißen Molke erhitzt."
    ),

    // Question 19 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was muss laut EU-Recht bei einem Produkt mit g.U. (geschützter Ursprungsbezeichnung) im Vergleich zu einem g.g.A.-Produkt zwingend in der Region stattfinden?",
        answerA = "Nur die Verpackung und Etikettierung",
        answerB = "Nur die Ernte oder Schlachtung des Rohprodukts",
        answerC = "Alle drei Schritte: Erzeugung, Verarbeitung und Herstellung",
        answerD = "Mindestens zwei der drei Schritte: Erzeugung, Verarbeitung oder Herstellung",
        correctAnswer = 2,
        explanation = "Bei g.U. müssen zwingend alle drei Produktionsschritte – Erzeugung der Rohstoffe, Verarbeitung und Herstellung des Endprodukts – vollständig in der definierten geografischen Region stattfinden. Das ist der strengste EU-Herkunftsschutz für Lebensmittel.",
        difficulty = 4,
        funFact = "Weltweit sind über 3.300 Produkte in der EU-Datenbank für geografische Angaben registriert. Neben der EU haben auch viele andere Länder wie China, Indien und die USA eigene Systeme für Herkunftsbezeichnungen."
    ),

    // Question 20 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Bourbon Whiskey ist ein 'distinctive product of the United States'. Was sind die zwei wichtigsten gesetzlichen Mindestanforderungen für die Herstellung?",
        answerA = "Mindestens 60 % Gerste; Reifung in gebrauchten Eichenfässern",
        answerB = "Mindestens 51 % Mais; Reifung in neuen ausgekohlten Eichenbehältern",
        answerC = "Ausschließlich in Kentucky destilliert; 100 % Mais als Grundstoff",
        answerD = "Mindestens 51 % Roggen; mindestens 4 Jahre Fassreifung",
        correctAnswer = 1,
        explanation = "Bourbon muss aus mindestens 51 % Mais hergestellt und in neuen, ausgekohlten (charred) Eichenbehältern gereift werden. Entgegen der weit verbreiteten Meinung muss Bourbon NICHT aus Kentucky stammen – er darf in jedem US-Bundesstaat produziert werden, auch wenn Kentucky 95 % der weltweiten Produktion ausmacht.",
        difficulty = 4,
        funFact = "Der Name 'Bourbon' stammt wahrscheinlich vom Bourbon County in Kentucky, das wiederum nach dem französischen Königshaus benannt wurde. Heute liegt kein einziger Bourbon-Destilleriebetrieb mehr in diesem County."
    ),

    // Question 21 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Cognac ist eine geschützte Bezeichnung für Weinbrand aus Frankreich. Welche sechs Crus (Anbauregionen) dürfen Cognac produzieren?",
        answerA = "Bordeaux, Médoc, Pomerol, Saint-Émilion, Pauillac und Graves",
        answerB = "Armagnac, Gascogne, Béarn, Landes, Gers und Lot-et-Garonne",
        answerC = "Alsace, Lorraine, Bourgogne, Côte d'Or, Mâconnais und Beaujolais",
        answerD = "Grande Champagne, Petite Champagne, Borderies, Fins Bois, Bons Bois und Bois Ordinaires",
        correctAnswer = 3,
        explanation = "Das Cognac-Anbaugebiet ist in sechs Crus unterteilt: Grande Champagne und Petite Champagne gelten als die edelsten, gefolgt von Borderies, Fins Bois, Bons Bois und Bois Ordinaires. Die besten Cognacs entstehen im Zentrum des Gebiets rund um die Stadt Cognac im Département Charente.",
        difficulty = 4,
        funFact = "Der Name 'Grande Champagne' im Cognac-Gebiet hat nichts mit dem Schaumwein zu tun – er leitet sich vom lateinischen 'campania' (Ebene/Feld) ab und bezeichnet die weißen, kalkhaltigen Böden der Region."
    ),

    // Question 22 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welche Maßnahme müssen Champagner-Produzenten bei der Lese zwingend einhalten, die für andere Schaumweine nicht gilt?",
        answerA = "Die Trauben müssen bei Nacht geerntet werden",
        answerB = "Die Trauben dürfen erst nach dem ersten Frost geerntet werden",
        answerC = "Die Ernte muss von zertifizierten Sommeliers überwacht werden",
        answerD = "Die Ernte muss ausschließlich per Hand (Handlese) erfolgen",
        correctAnswer = 3,
        explanation = "In der Champagne ist die maschinelle Traubenernte gesetzlich verboten. Alle Trauben müssen von Hand gelesen werden ('vendange à la main'). Diese Regelung gilt als Teil der strikten AOC/AOP-Vorschriften und soll die Unversehrtheit der Trauben beim Transport zur Kelter gewährleisten.",
        difficulty = 4,
        funFact = "Die Champagne-Ernte beschäftigt jährlich rund 100.000 Erntehelfer für nur 2–3 Wochen. Die exakten Erntedaten werden jedes Jahr vom CIVC (Comité Champagne) festgelegt und für alle Weinbauern verbindlich."
    ),

    // Question 23 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Die g.t.S. (garantiert traditionelle Spezialität) ist eine dritte EU-Kategorie neben g.U. und g.g.A. Was ist ihr wesentliches Merkmal?",
        answerA = "Schutz der regionalen Herkunft; strenger als g.U.",
        answerB = "Schutz der traditionellen Rezeptur oder Herstellungsmethode unabhängig vom Herstellungsort",
        answerC = "Schutz für Produkte, die ausschließlich in Bergregionen über 1.000 m produziert werden",
        answerD = "Schutz für Produkte aus biologischem Anbau mit traditioneller Methode",
        correctAnswer = 1,
        explanation = "Bei g.t.S. steht nicht die geografische Herkunft im Vordergrund, sondern die traditionelle Zusammensetzung oder Herstellungsmethode. Das Produkt kann überall hergestellt werden, muss aber der traditionellen Rezeptur oder Methode entsprechen. Beispiele: Mozzarella (als Käsetyp), Pizza Napoletana, Serrano-Schinken.",
        difficulty = 4,
        funFact = "Die EU-Datenbank eAmbrosia enthält alle registrierten g.U.-, g.g.A.- und g.t.S.-Produkte. Man kann dort nach Land, Produktkategorie und Status filtern."
    ),

    // Question 24 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welche ist die wichtigste Rebsorte bei der Herstellung des trockenen Weißweins Chablis aus dem nördlichsten Teil Burgunds?",
        answerA = "Aligoté",
        answerB = "Pinot Gris",
        answerC = "Chardonnay",
        answerD = "Viognier",
        correctAnswer = 2,
        explanation = "Chablis AOC wird ausschließlich aus Chardonnay-Trauben hergestellt. Die Region Chablis ist bekannt für ihre Kimmeridge-Böden (Kalkstein mit fossilen Austern), die dem Wein eine charakteristische Mineralität verleihen. Es gibt vier Qualitätsstufen: Petit Chablis, Chablis, Chablis Premier Cru und Chablis Grand Cru.",
        difficulty = 4,
        funFact = "Der fossile Meeresboden des Chablis-Gebiets, der Kimmeridge-Kalkstein, enthält tatsächlich Millionen von versteinerten Austernschalen (Exogyra virgula). Weinliebhaber behaupten, man schmecke diese Mineralität im Glas."
    ),

    // Question 25 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Tequila ist eine geschützte Herkunftsbezeichnung Mexikos. Aus welcher Pflanzenart wird Tequila ausschließlich hergestellt, und in welchen mexikanischen Bundesstaaten ist die Produktion erlaubt?",
        answerA = "Aus der Nopal-Kaktus-Pflanze; nur im Bundesstaat Jalisco",
        answerB = "Aus blauem Weber-Agave (Agave tequilana); Jalisco und vier weitere Bundesstaaten",
        answerC = "Aus Espadin-Agave; in allen mexikanischen Bundesstaaten",
        answerD = "Aus Maguey-Agave; nur in Oaxaca und Jalisco",
        correctAnswer = 1,
        explanation = "Tequila darf ausschließlich aus der blauen Weber-Agave (Agave tequilana Weber) hergestellt werden und ist auf bestimmte Regionen in Mexiko beschränkt: hauptsächlich den Bundesstaat Jalisco sowie Teile von Guanajuato, Michoacán, Nayarit und Tamaulipas.",
        difficulty = 4,
        funFact = "Mezcal hingegen darf aus verschiedenen Agaven-Arten (z.B. Espadin, Tobalá, Mexicano) hergestellt werden und kommt hauptsächlich aus Oaxaca. Der rauchige Geschmack entsteht durch das Rösten der Agaven-Herzen in Erdöfen."
    ),

    // Question 26 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welches französische Hühner-Produkt gilt als das erste Geflügel der Welt mit geschützter Herkunftsbezeichnung (AOP)?",
        answerA = "Canard de Barbarie de Gascogne",
        answerB = "Oie d'Alsace",
        answerC = "Pintade de Vendée",
        answerD = "Poulet de Bresse AOP",
        correctAnswer = 3,
        explanation = "Das Poulet de Bresse aus der Region Bresse (Ain) erhielt als erstes Geflügel der Welt 1957 eine AOC/AOP-Zertifizierung. Die weißen Gauloise-Hühner müssen auf Freiflächen von mindestens 10 m² pro Tier gehalten werden und dürfen erst nach mindestens 4 Monaten geschlachtet werden.",
        difficulty = 4,
        funFact = "Das Bresse-Huhn trägt die Farben der französischen Trikolore: weißes Gefieder, blaue Füße und roter Kamm. Brillat-Savarin (1755–1826) bezeichnete es als 'la reine des volailles, la volaille des rois' – die Königin des Geflügels, das Geflügel der Könige."
    ),

    // Question 27 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Gorgonzola ist ein italienischer Blauschimmelkäse mit DOP-Schutz. Welche zwei Varianten gibt es, und wie unterscheiden sie sich?",
        answerA = "Gorgonzola fresco (frisch, mild, weich) und Gorgonzola stagionato (gereift, pikant, fester)",
        answerB = "Gorgonzola dolce (süß, jung, cremig) und Gorgonzola piccante (pikant, mindestens 6-12 Monate gereift, bröselig)",
        answerC = "Gorgonzola bianco (weiß, ohne Schimmel) und Gorgonzola naturale (mit natürlichem Schimmel)",
        answerD = "Gorgonzola di montagna (Bergproduktion) und Gorgonzola di pianura (Ebenenproduktion)",
        correctAnswer = 1,
        explanation = "Gorgonzola DOP gibt es in zwei Varianten: Gorgonzola Dolce (jung, ca. 2-3 Monate, cremig-weich, milder Geschmack) und Gorgonzola Piccante (mindestens 6-12 Monate gereift, fester, bröselig und intensiv-pikant im Geschmack).",
        difficulty = 4,
        funFact = "Gorgonzola Piccante wird in Frankreich auch 'Gorgonzola naturale' oder 'Gorgonzola antico' genannt. Er gilt als besonders gut geeignet für die Zubereitung von Risotto oder Polenta."
    ),

    // Question 28 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welcher Safran trägt als einziger weltweit den EU-DOP-Schutz (geschützte Ursprungsbezeichnung)?",
        answerA = "Azafrán de La Mancha g.U. aus der spanischen Region La Mancha",
        answerB = "Safran aus dem iranischen Khorasan",
        answerC = "Kaschmiri-Safran aus Indien",
        answerD = "Safran aus Marokko (Taliouine)",
        correctAnswer = 0,
        explanation = "Der 'Azafrán de La Mancha' aus der spanischen Region La Mancha ist der einzige Safran mit EU-DOP-Schutz (g.U.). Safran aus Iran, Marokko oder anderen Ländern kann zwar qualitativ hochwertig sein, trägt aber keine EU-g.U.-Bezeichnung.",
        difficulty = 4,
        funFact = "Safran ist das teuerste Gewürz der Welt nach Gewicht. Für 1 kg Safran werden etwa 150.000–200.000 Blüten der Crocus sativus benötigt, die alle von Hand gepflückt werden müssen."
    ),

    // Question 29 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Der Scotch Whisky ist geografisch auf Schottland beschränkt. In welche fünf offiziellen Regionen ist er unterteilt?",
        answerA = "Highlands, Lowlands, Speyside, Islay und Campbeltown",
        answerB = "Edinburgh, Glasgow, Aberdeen, Inverness und Stirling",
        answerC = "Islands, Mainland, Orkney, Shetland und Skye",
        answerD = "North Highlands, South Highlands, East Coast, West Coast und Inner Hebrides",
        correctAnswer = 0,
        explanation = "Scotch Whisky ist offiziell in fünf geografische Regionen unterteilt: Highlands (größte Region), Lowlands, Speyside (innerhalb der Highlands, aber eigenständige Region), Islay (für rauchige Torfwhiskys bekannt) und Campbeltown (historisch wichtig, heute nur noch wenige Destillerien).",
        difficulty = 4,
        funFact = "Speyside ist trotz geografischer Lage in den Highlands eine eigene Whisky-Region. Sie beherbergt mehr als die Hälfte aller schottischen Malt-Destillerien, darunter Glenfarclas, Glenfiddich und The Macallan."
    ),

    // Question 30 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist der wesentliche Unterschied zwischen 'Champagner' und anderen Schaumweinen wie Cava (Spanien) oder Prosecco (Italien)?",
        answerA = "Nur Champagner darf überhaupt Kohlensäure enthalten; andere Schaumweine werden mit CO2 versetzt",
        answerB = "Champagner muss die Flaschengärung ('méthode champenoise') verwenden und aus der Champagne stammen",
        answerC = "Champagner muss mindestens 15 % Alkohol haben; andere Schaumweine maximal 12 %",
        answerD = "Nur Champagner darf aus Chardonnay hergestellt werden; andere Schaumweine nicht",
        correctAnswer = 1,
        explanation = "Champagner muss aus der Region Champagne stammen UND nach der 'méthode champenoise' (traditionelle Flaschengärung) hergestellt werden. Cava verwendet zwar auch die Flaschengärung, stammt aber aus Spanien. Prosecco (Charmat-Methode) gärt hingegen im Drucktank, nicht in der Flasche.",
        difficulty = 4,
        funFact = "Dom Pérignon (1638–1715), nach dem der berühmte Champagner benannt ist, gilt als Pionier der Champagnerherstellung. Entgegen der Legende hat er die Flaschengärung nicht erfunden – er hat jedoch wesentlich zur Verbesserung der Korktechnik und der Cuvée-Zusammenstellung beigetragen."
    ),

    // Question 31 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welches toskanische Olivenöl aus der Provinz Lucca trägt als eines der ältesten Olivenöle Italiens den g.U.-Schutz?",
        answerA = "Olio Extravergine di Oliva Lucca DOP",
        answerB = "Chianti Classico Olio DOP",
        answerC = "Toscano Olio Extra Vergine g.g.A.",
        answerD = "Sardisches Olivenöl DOP",
        correctAnswer = 0,
        explanation = "Das Olivenöl 'Lucca DOP' aus der toskanischen Provinz Lucca trägt den g.U.-Schutz und gilt als eines der hochwertigsten und ältesten geschützten Olivenöle Italiens. Die Region ist seit Jahrhunderten für ihre milde, fruchtige Olivenöl-Produktion bekannt.",
        difficulty = 4,
        funFact = "Italien hat die meisten DOP/IGP-geschützten Olivenöle weltweit. Insgesamt gibt es in der EU über 150 verschiedene geschützte Olivenöl-Bezeichnungen, hauptsächlich aus Italien, Spanien, Griechenland und Portugal."
    ),

    // Question 32 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Das 'Lübecker Marzipan' trägt das g.g.A.-Siegel. Was ist der entscheidende Unterschied zu anderen Marzipan-Varianten bezüglich des Rohmassenverhältnisses?",
        answerA = "Lübecker Marzipan verwendet nur Mandeln aus dem Mittelmeerraum ohne jeglichen Zuckerzusatz",
        answerB = "Lübecker Marzipan hat eine Rohmasse aus mindestens 2 Teilen Mandeln zu 1 Teil Zucker",
        answerC = "Lübecker Marzipan enthält mindestens 70 % Mandelanteil in der Rohmasse; normales Marzipan nur 25–50 %",
        answerD = "Lübecker Marzipan darf nur Zucker verwenden, kein Glukosesirup oder andere Süßungsmittel",
        correctAnswer = 2,
        explanation = "Lübecker Marzipan g.g.A. zeichnet sich durch einen besonders hohen Mandelgehalt aus. Die Rohmasse enthält mindestens 70 % feinste Mandeln. Im Vergleich dazu schreibt die deutsche Lebensmittelverordnung für normales 'Marzipan' nur einen Mindestgehalt von 25 % Mandeln in der Rohmasse vor.",
        difficulty = 4,
        funFact = "Lübeck und Toledo (Spanien) streiten sich um den Titel 'Geburtsort des Marzipans'. Die ältesten schriftlichen Nachweise stammen aus dem Orient, aber beide Städte beanspruchen die europäische Erfindung für sich."
    ),

    // Question 33 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet 'Aceto Balsamico Tradizionale di Modena DOP' grundlegend vom einfachen 'Aceto Balsamico di Modena g.g.A.'?",
        answerA = "Der Tradizionale enthält Zusätze wie Karamell; der einfache Balsamico ist rein",
        answerB = "Nur beim Tradizionale ist die Herstellung auf Modena beschränkt; der einfache Balsamico darf überall produziert werden",
        answerC = "Der Tradizionale ist nur für den Export bestimmt; der einfache Balsamico für den italienischen Markt",
        answerD = "Der Tradizionale wird mindestens 12 Jahre (extra alt: 25 Jahre) in Holzfässern gereift und enthält keine Weinessig-Beimischung; er ist deutlich teurer",
        correctAnswer = 3,
        explanation = "Aceto Balsamico Tradizionale di Modena DOP (nicht zu verwechseln mit dem g.g.A.) ist ein vollkommen anderes Produkt: Er wird mindestens 12 Jahre in einer Batterie von mindestens 5 verschiedenen Holzfässern (z.B. Kastanie, Kirsche, Eiche, Maulbeere) gereift. Die extra alte Variante reift mindestens 25 Jahre. Es werden keine Weinessigzusätze verwendet.",
        difficulty = 4,
        funFact = "Eine kleine Flasche (100 ml) Aceto Balsamico Tradizionale di Modena DOP Extra Vecchio (25 Jahre) kostet oft 150–250 Euro oder mehr. Es handelt sich um eines der teuersten Speiseessige der Welt."
    ),

    // Question 34 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welche Käsesorte darf paradoxerweise nicht in dem Ort hergestellt werden, nach dem sie benannt ist, weil dieser Ort außerhalb der geschützten Produktionsregion liegt?",
        answerA = "Cheddar – das Dorf Cheddar liegt außerhalb der PDO-Region West Country",
        answerB = "Wensleydale – das Tal Wensleydale liegt nicht in der geschützten Zone",
        answerC = "Stilton – das Dorf Stilton (Cambridgeshire) liegt außerhalb der Produktionsregion Derbyshire/Leicestershire/Nottinghamshire",
        answerD = "Gloucester – die Stadt Gloucester liegt außerhalb der PDO-Zone",
        correctAnswer = 2,
        explanation = "Stilton ist die bekannteste Käsesorte, die nicht in dem Ort hergestellt werden darf, nach dem sie benannt ist. Das Dorf Stilton liegt in Cambridgeshire, während die geschützte Produktionsregion auf Derbyshire, Leicestershire und Nottinghamshire beschränkt ist.",
        difficulty = 4,
        funFact = "Stilton wurde im 18. Jahrhundert popularisiert, weil Cooper Thornhill, ein Gastwirt in Stilton, Cambridgeshire, den Käse an Reisende verkaufte, die von London nach Norden fuhren. Der Käse wurde jedoch nie dort produziert."
    ),

    // Question 35 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welches deutsche Bundesland hat mit Abstand die meisten g.U.- und g.g.A.-geschützten Produkte in der EU registriert?",
        answerA = "Nordrhein-Westfalen",
        answerB = "Bayern",
        answerC = "Baden-Württemberg",
        answerD = "Sachsen",
        correctAnswer = 1,
        explanation = "Bayern hat die meisten in der EU registrierten geschützten geografischen Angaben unter den deutschen Bundesländern. Dazu gehören Produkte wie Allgäuer Bergkäse g.U., Allgäuer Emmentaler g.U., Bayerische Breze g.g.A., Beelitzer Spargel g.g.A. sowie zahlreiche Weine aus Franken.",
        difficulty = 4,
        funFact = "Insgesamt sind aus Deutschland derzeit etwa 110 Produkte in der EU-Datenbank für geografische Angaben registriert. Im europäischen Vergleich führt Italien mit über 850 eingetragenen Produkten, gefolgt von Frankreich und Spanien."
    ),

    // Question 36 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was versteht man im Weinbau unter dem Begriff 'Terroir', der besonders für AOC/AOP-Weine zentral ist?",
        answerA = "Das Gesamtbild aus Boden, Klima, Topografie und menschlichen Einflüssen, das einem Wein seinen einzigartigen Charakter verleiht",
        answerB = "Die spezifische Hefekultur, die traditionell bei der Gärung eingesetzt wird",
        answerC = "Die Mindestgröße einer Weinberglage in Hektar für AOC-Berechtigung",
        answerD = "Das gesetzlich vorgeschriebene Kelterverfahren für geschützte Weine",
        correctAnswer = 0,
        explanation = "Terroir (von französisch 'terre' = Erde) bezeichnet das Zusammenspiel aller natürlichen Faktoren eines Weinbergs: Bodentyp, Mikro- und Makroklima, Topografie (Lage, Hangneigung, Ausrichtung) sowie historisch gewachsene Anbau- und Keltertraditionen. Das Konzept ist das Fundament aller AOC/AOP-Schutzbestimmungen.",
        difficulty = 4,
        funFact = "Burgund ist das klassische Terroir-Konzept-Land: Auf wenigen hundert Metern Unterschied im selben Weinberg kann die Bodenstruktur so verschieden sein, dass zwei benachbarte Crus komplett unterschiedliche Weine ergeben – was erklärt, warum manche Grand-Cru-Parzellen astronomische Preise erzielen."
    ),

    // Question 37 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was entschied der Europäische Gerichtshof (EuGH) 2021 bezüglich der Nutzung des Namens 'Champagner' durch einen Kosmetikhersteller?",
        answerA = "Der Name 'Champagner' darf für Beauty-Produkte verwendet werden, wenn kein Alkohol enthalten ist",
        answerB = "Nur der Name 'Champagne' (französisch) ist geschützt; 'Champagner' (deutsch) darf frei verwendet werden",
        answerC = "Der Name 'Champagner'/'Champagne' ist ausschließlich dem Schaumwein vorbehalten – auch die Nutzung für eine champagnerfarbene Kosmetiklinie ist verboten",
        answerD = "Kosmetikprodukte sind vom Schutz geografischer Ursprungsbezeichnungen generell ausgenommen",
        correctAnswer = 2,
        explanation = "Der EuGH entschied 2021, dass der Name 'Champagner' (bzw. 'Champagne') nicht für eine hellgoldfarbene Kosmetiklinie ('Champagner-Farbe') verwendet werden darf, da er ausschließlich dem Schaumwein aus der Champagne vorbehalten ist. Dies stärkte den umfassenden Markenschutz der Champagne.",
        difficulty = 4,
        funFact = "Der Fall betraf die Modedesignerin Yves Saint Laurent, die eine Kosmetik-Linie 'Champagne' auf den Markt bringen wollte. Das Verfahren beschäftigte die europäischen Gerichte mehrere Jahre und wurde zum Meilenstein im Recht der geografischen Ursprungsbezeichnungen."
    ),

    // Question 38 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Blanc de Blancs' Champagner und was ein 'Blanc de Noirs'?",
        answerA = "Blanc de Blancs = aus weißen Trauben (Chardonnay); Blanc de Noirs = aus roten Trauben (Pinot Noir/Pinot Meunier)",
        answerB = "Blanc de Blancs = ungefiltert; Blanc de Noirs = gefiltert und geklärt",
        answerC = "Blanc de Blancs = frühzeitig degorgiert; Blanc de Noirs = spät degorgiert",
        answerD = "Blanc de Blancs = ohne Dosage (brut nature); Blanc de Noirs = mit Dosage",
        correctAnswer = 0,
        explanation = "Blanc de Blancs bedeutet wörtlich 'Weißes aus Weißen' – er besteht ausschließlich aus Chardonnay-Trauben und ist bekannt für Eleganz und Frische. Blanc de Noirs ('Weißes aus Schwarzen') wird ausschließlich aus Pinot Noir und/oder Pinot Meunier keltertechnisch zu Weißwein verarbeitet, indem die Schalen sofort entfernt werden.",
        difficulty = 4,
        funFact = "Die Côte des Blancs südlich von Épernay ist das Herzstück für Blanc-de-Blancs-Champagner und beherbergt fast ausschließlich Chardonnay-Anbau. Bekannte Produzenten wie Salon und Krug produzieren hier ihre Prestige-Cuvées."
    ),

    // Question 39 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Das Fleisch der 'Bœuf de Charolais' (Charolais-Rind) genießt welchen EU-Herkunftsschutz?",
        answerA = "g.U. – nur Rinder, die ausschließlich im Département Saône-et-Loire aufgezogen werden",
        answerB = "g.g.A. – Rinder müssen in einem definierten Gebiet im Burgund-Bourbonnais aufgezogen werden",
        answerC = "g.t.S. – die Rasse muss traditionell gehalten, aber nicht regional verankert sein",
        answerD = "Kein EU-Schutz – Charolais ist eine frei verwendbare Rassebezeichnung",
        correctAnswer = 1,
        explanation = "Charolais-Rind-Fleisch aus definierten Gebieten in Burgund und Bourbonnais hat den g.g.A.-Status. Die weißen Charolais-Rinder gelten als eine der edelsten Fleischrinder-Rassen Europas und sind besonders für ihr zart marmoriertes, mageres Fleisch bekannt.",
        difficulty = 4,
        funFact = "Die Charolais-Rasse entstand im 18. Jahrhundert im burgundischen Charolais und wurde durch systematische Züchtung entwickelt. Heute ist sie eine der weltweit am häufigsten gezüchteten Fleischrinder-Rassen und wird in über 70 Ländern gehalten."
    ),

    // Question 40 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist das Besondere an der DOCa Rioja im spanischen Weinrecht?",
        answerA = "Rioja ist die einzige spanische Weinregion mit rein weißen Rebsorten",
        answerB = "Rioja verwendet ausschließlich internationale Rebsorten wie Cabernet Sauvignon und Merlot",
        answerC = "DOCa (Denominación de Origen Calificada) ist die höchste Qualitätsstufe Spaniens; Rioja erhielt sie 1991 als erste Region überhaupt",
        answerD = "Rioja-Weine dürfen nur in Holzfässern aus amerikanischer Eiche reifen",
        correctAnswer = 2,
        explanation = "DOCa (Denominación de Origen Calificada) ist die höchste Qualitätsstufe im spanischen Weinrecht. Bisher haben nur zwei Weinregionen diesen Status: Rioja (seit 1991) und Priorat (seit 2009). Tempranillo ist die Hauptrebsorte der DOCa Rioja.",
        difficulty = 4,
        funFact = "Die Rioja-Region ist nach dem Fluss Oja benannt, der in den Ebro mündet. Die Weinregion erstreckt sich über drei Provinzen: La Rioja, Álava und Navarra."
    ),

    // Question 41 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welche Besonderheit gilt für die Milch bei der Herstellung von Parmigiano Reggiano DOP?",
        answerA = "Nur Büffelmilch aus dem Produktionsgebiet darf verwendet werden",
        answerB = "Die Milch muss pasteurisiert und homogenisiert sein",
        answerC = "Die Kühe dürfen kein Silofutter erhalten; die Abendmilch wird entrahmt, die Morgenmilch wird vollfett zugegeben",
        answerD = "Es darf nur Milch von Braunvieh-Kühen verwendet werden",
        correctAnswer = 2,
        explanation = "Bei Parmigiano Reggiano DOP ist Silofutter verboten. Zudem folgt die Herstellung einem traditionellen Verfahren: Die Abendmilch wird über Nacht in flachen Becken gelagert und entrahmt, dann mit der vollen Morgenmilch gemischt. Die Mischung aus teilentrahmter Abend- und Vollmilch ergibt den charakteristischen Fettgehalt.",
        difficulty = 4,
        funFact = "Für einen einzigen Laib Parmigiano Reggiano (ca. 40 kg) werden etwa 550 Liter Milch benötigt. Der Käse reift mindestens 12 Monate, Premium-Varianten ('Stravecchio') werden 36 Monate oder länger gereift."
    ),

    // Question 42 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welches europäische Land hat weltweit die meisten in der EU registrierten Produkte mit geografischem Herkunftsschutz (g.U., g.g.A., g.t.S.)?",
        answerA = "Frankreich",
        answerB = "Spanien",
        answerC = "Italien",
        answerD = "Deutschland",
        correctAnswer = 2,
        explanation = "Italien führt die weltweite Rangliste der EU-registrierten Produkte mit geografischem Herkunftsschutz an – mit über 850 eingetragenen Produkten (Stand 2024). Das umfasst Weine, Käse, Fleischerzeugnisse, Öle, Essige, Obst und Gemüse. Frankreich und Spanien folgen auf den nächsten Plätzen.",
        difficulty = 4,
        funFact = "Nicht nur Lebensmittel sind durch geografische Herkunftsbezeichnungen geschützt: Auch handwerkliche Produkte wie Murano-Glas (Venedig), Carrara-Marmor und sogar bestimmte Messer-Sorten genießen EU-Herkunftsschutz."
    ),

    // Question 43 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'Millésimé' (oder 'Vintage') bei Champagner und wie unterscheidet er sich von Non-Vintage-Champagner?",
        answerA = "Millésimé bedeutet, dass mindestens 50 % der Trauben von einem Grand-Cru-Weingut stammen",
        answerB = "Millésimé bezeichnet einen Champagner mit besonders hohem Zuckergehalt ('Demi-Sec' oder süßer)",
        answerC = "Millésimé bedeutet, dass der Champagner mindestens 10 Jahre auf der Hefe gelegen hat",
        answerD = "Millésimé ist ein Champagner aus einem einzigen Erntejahr, der nur in besonders guten Jahren produziert wird; Non-Vintage ist eine Mischung mehrerer Jahrgänge",
        correctAnswer = 3,
        explanation = "Ein Millésimé (Vintage-Champagner) wird nur in besonders guten Jahrgängen produziert und muss zu mindestens 85 % aus dem angegebenen Erntejahr bestehen. Er reift mindestens 3 Jahre auf der Hefe. Non-Vintage-Champagner ist eine Assemblage aus mehreren Jahrgängen, um einen konsistenten Haus-Stil zu erhalten.",
        difficulty = 4,
        funFact = "Ein Champagnerhaus ruft in der Regel nur in 3–4 von 10 Jahren einen Vintage aus. Ausnahmejahringe wie 1996, 2002, 2008 oder 2012 gelten als Meilensteine und erzielen auf Auktionen teils fünfstellige Summen pro Flasche."
    ),

    // Question 44 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Prosciutto di Parma DOP' und 'Prosciutto di San Daniele DOP'?",
        answerA = "Prosciutto di San Daniele stammt aus Friaul-Julisch Venetien und hat eine charakteristisch U-Form durch die belassene Schwarte; Parma-Schinken kommt aus der Provinz Parma und ist ovaler",
        answerB = "San Daniele wird geräuchert; Parma niemals",
        answerC = "San Daniele reift nur 6 Monate; Parma mindestens 24 Monate",
        answerD = "Bei San Daniele wird auch Schweinebauch verwendet; bei Parma nur die Keule",
        correctAnswer = 0,
        explanation = "Prosciutto di San Daniele DOP stammt aus San Daniele del Friuli in Friaul und zeichnet sich durch seine charakteristische Form aus: Der Schweinefuß bleibt am Schinken, und er hat eine U-förmige Silhouette durch das Pressen. Beide Schinken werden nur mit Salz hergestellt, aber Parma gilt als etwas süßer und milder.",
        difficulty = 4,
        funFact = "San Daniele liegt auf einem Hügel zwischen den Alpen und dem Adriatischen Meer. Das spezielle Mikroklima mit feuchter Luft aus dem Meer und kühler Bergluft gilt als entscheidend für das besondere Aroma des Schinkens."
    ),

    // Question 45 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Die 'Klassifikation von 1855' für Bordeaux-Weine ist eine der bekanntesten Weinqualifikationen der Welt. Welches außergewöhnliche Ereignis fand 1973 statt?",
        answerA = "Die gesamte Klassifikation wurde aufgehoben und neu erstellt",
        answerB = "Mouton Rothschild wurde als einziges Château von Premier Cru Deuxième zu Premier Cru Première befördert",
        answerC = "Pétrus wurde nachträglich in die Klassifikation aufgenommen",
        answerD = "Die Klassifikation wurde auf Saint-Émilion und Pomerol ausgeweitet",
        correctAnswer = 1,
        explanation = "Die Klassifikation von 1855 ist in über 160 Jahren nur ein einziges Mal geändert worden: 1973 wurde Château Mouton Rothschild auf Betreiben des Besitzers Baron Philippe de Rothschild vom Zweiten Cru in den Ersten Cru ('Premier Grand Cru Classé') befördert. Dieses einmalige Ereignis gilt als politische wie weinrechtliche Sensation.",
        difficulty = 4,
        funFact = "Baron Philippe de Rothschild prägte für diese Erhebung das Bonmot: 'Premier je suis, Second je fus, Mouton ne change.' (Erster bin ich, Zweiter war ich, Mouton ändert sich nicht.) Die Etiketten von Mouton Rothschild werden seit 1945 jährlich von berühmten Künstlern gestaltet."
    ),

    // Question 46 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welche Mindestanforderungen gelten für Scotch Single Malt Whisky?",
        answerA = "Destilliert in Schottland; ausschließlich aus Gerste hergestellt; mindestens 3 Jahre in Eichenfässern in Schottland gereift; mindestens 40 % Alkohol",
        answerB = "Destilliert in Schottland; mindestens 51 % Gerste; mindestens 5 Jahre gereift; mindestens 43 % Alkohol",
        answerC = "Destilliert in Schottland; aus verschiedenen Getreidesorten; mindestens 2 Jahre in neuen Eichenfässern gereift",
        answerD = "Nur aus Torfsmoking-Gerste; ausschließlich auf der Insel Islay hergestellt; mindestens 10 Jahre gereift",
        correctAnswer = 0,
        explanation = "Single Malt Scotch Whisky muss in Schottland aus gemälzter Gerste (Malted Barley) in Pot Stills destilliert werden, mindestens 3 Jahre in Schottland in Eichenfässern mit maximal 700 Liter Fassungsvermögen reifen und mindestens 40 % Vol. Alkohol aufweisen.",
        difficulty = 4,
        funFact = "Das Wort 'Single' in 'Single Malt' bedeutet nicht 'einziges Fass', sondern 'eine einzige Destillerie'. Ein Single Malt kann aus hunderten von Fässern verschiedener Jahrgänge derselben Destillerie zusammengestellt sein."
    ),

    // Question 47 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist der Dresdner Stollen (Christstollen) und welchen EU-Herkunftsschutz hat er?",
        answerA = "g.U. – nur in Dresden hergestellt und mindestens 4 Wochen vor Weihnachten gebacken",
        answerB = "g.g.A. – der 'Dresdner Christstollen' muss in Dresden und der näheren Umgebung nach traditionellem Rezept gebacken werden",
        answerC = "g.t.S. – das traditionelle Rezept ist geschützt, aber der Stollen darf überall gebacken werden",
        answerD = "Kein EU-Schutz – 'Dresdner Stollen' ist eine freie Handelsbezeichnung",
        correctAnswer = 1,
        explanation = "Der 'Dresdner Christstollen' trägt das g.g.A.-Siegel. Er darf nur in Dresden und dem Umland nach traditionellem Rezept (mit Butter, Rosinen, Mandeln, Zitronat, Orangeat und bestimmten Gewürzen) gebacken werden. Das 'Dresdner Stollen Schutzverband e.V.' überwacht die Einhaltung.",
        difficulty = 4,
        funFact = "Der erste historisch belegte Dresdner Stollen stammt aus dem Jahr 1474. Der älteste noch erhaltene Stollenbäckerei-Beleg ist aus dem Jahr 1560. Der jährliche 'Stollenfest' in Dresden, bei dem ein Riesenstollen von mehreren Hundert Kilogramm gebacken und dann aufgeschnitten wird, ist ein touristisches Highlight."
    ),

    // Question 48 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet der 'Halo-Effekt' bei geschützten Herkunftsbezeichnungen (g.U./g.g.A.)?",
        answerA = "Den wirtschaftlichen Mehrwert (Preisprämie), den Produkte mit g.U./g.g.A.-Siegel gegenüber nicht geschützten Produkten am Markt erzielen können",
        answerB = "Die Verbreitung von Imitation-Produkten, die den Ruf geschützter Bezeichnungen ausnutzen",
        answerC = "Die wissenschaftliche Methode, um den Ursprung eines Produkts durch Isotopen-Analyse zu bestimmen",
        answerD = "Die EU-Kampagne zur Förderung regionaler Produkte in Drittstaaten",
        correctAnswer = 0,
        explanation = "Der 'Halo-Effekt' bei geschützten Herkunftsbezeichnungen beschreibt den wirtschaftlichen Mehrwert (Prämie), den Produkte mit g.U./g.g.A.-Siegel gegenüber nicht geschützten Vergleichsprodukten erzielen. Studien zeigen, dass Konsumenten bereit sind, 10–40 % mehr für zertifizierte Herkunftsprodukte zu zahlen.",
        difficulty = 4,
        funFact = "Der gesamte Umsatz der EU-weit geschützten Herkunftsprodukte liegt bei schätzungsweise 75–80 Milliarden Euro jährlich. Die EU investiert erheblich in die Vermarktung dieser Produkte auf internationalen Märkten, besonders in Asien und Nordamerika."
    ),

    // Question 49 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Grappa' und welchen geografischen Schutz hat er in der EU?",
        answerA = "Grappa ist eine g.U. aus dem Piemont; er darf nur dort aus Nebbiolo-Traubentrester hergestellt werden",
        answerB = "Grappa ist eine g.g.A. und darf ausschließlich in Italien (und bestimmten Teilen der Schweiz/San Marino) aus Traubentrester destilliert werden",
        answerC = "Grappa ist eine g.t.S. und kann überall in der EU nach der traditionellen Rezeptur hergestellt werden",
        answerD = "Grappa hat keinen EU-Schutz und kann frei in der EU produziert werden",
        correctAnswer = 1,
        explanation = "Grappa ist durch EU-Recht als geografische Bezeichnung geschützt: Er darf ausschließlich in Italien (sowie dem Kanton Tessin der Schweiz und San Marino) aus Traubentrester (den Schalen und Kernen nach der Weinpressung) hergestellt werden. Ähnliche Produkte aus anderen Ländern müssen andere Bezeichnungen verwenden.",
        difficulty = 4,
        funFact = "Der Begriff 'Grappa' ist wahrscheinlich vom oberitalienischen Dialektwort für Weintrauben-Traube abgeleitet. In anderen Ländern heißen ähnliche Tresterbrantweine: Marc (Frankreich), Orujo (Spanien), Trester (Deutschland) oder Zivania (Zypern)."
    ),

    // Question 50 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Der Likör Chartreuse aus Frankreich besitzt eine außergewöhnliche Eigenschaft bezüglich seines Rezepts. Was ist das Besondere?",
        answerA = "Chartreuse ist ein g.U.-Produkt aus der Region Dauphiné und darf nur dort destilliert werden",
        answerB = "Das geheime Rezept mit über 130 Kräutern ist angeblich nur zwei Kartäusermönchen gleichzeitig bekannt; die Herstellung erfolgt in Voiron, Isère",
        answerC = "Chartreuse ist ein g.g.A.-Produkt aus der Isère und wird industriell in Voiron hergestellt",
        answerD = "Chartreuse hat keinen Herkunftsschutz, ist aber durch ein Markenrecht geschützt, das jedem Mönch-Verband die Nutzung erlaubt",
        correctAnswer = 1,
        explanation = "Der Likör Chartreuse wird von den Kartäusermönchen der Grande Chartreuse bei Grenoble nach einem geheimen Rezept aus mehr als 130 Kräutern hergestellt. Das Geheimrezept ist angeblich nur zwei Mönchen gleichzeitig bekannt. Die Destillerie ist in Voiron, Département Isère. Die Marke ist international geschützt, ohne formalen g.U.-Status.",
        difficulty = 4,
        funFact = "Chartreuse gibt es in zwei Versionen: dem Grünen Chartreuse (55 % Alkohol, sehr aromatisch) und dem Gelben Chartreuse (40 % Alkohol, milder und süßer). Die genaue Kräuterzusammensetzung gilt als eines der bestgehütetsten Geheimnisse der Spirituosenwelt."
    )

)
