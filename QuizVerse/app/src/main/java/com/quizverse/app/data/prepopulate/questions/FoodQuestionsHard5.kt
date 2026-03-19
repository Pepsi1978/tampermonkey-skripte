package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsHard5(): List<Question> = listOf(

    // ── REBSORTEN ─────────────────────────────────────────────────────────────

    // Question 1
    Question(
        categoryId = 8,
        questionText = "Welche Rebsorte ist die Basis für den italienischen Wein Barolo?",
        answerA = "Sangiovese",
        answerB = "Barbera",
        answerC = "Montepulciano",
        answerD = "Nebbiolo",
        correctAnswer = 3,
        explanation = "Barolo aus dem Piemont (Norditalien) wird ausschließlich aus der Rebsorte Nebbiolo gekeltert. Die Traube ist bekannt für hohe Tannine, gute Säure und Aromen von Rosen, Teer und Kirschen. Barolo gilt als 'König der Weine'.",
        difficulty = 3,
        funFact = "Nebbiolo leitet sich vom italienischen 'nebbia' (Nebel) ab — die Traube reift so spät, dass die Weinberge beim Ernten oft im Herbstnebel liegen."
    ),

    // Question 2
    Question(
        categoryId = 8,
        questionText = "Welche Hauptrebsorte wird für den spanischen Rioja-Rotwein verwendet?",
        answerA = "Tempranillo",
        answerB = "Garnacha",
        answerC = "Monastrell",
        answerD = "Cariñena",
        correctAnswer = 0,
        explanation = "Tempranillo ist die dominierende Rebsorte im Rioja. Sie macht typischerweise 70–90 % der Cuvée aus und bringt Aromen von roten Früchten, Leder und Vanille (durch Barrique-Ausbau) mit sich.",
        difficulty = 3,
        funFact = "Der Name 'Tempranillo' bedeutet auf Spanisch 'kleine Frühe', da die Traube früher reift als die meisten anderen spanischen Rebsorten."
    ),

    // Question 3
    Question(
        categoryId = 8,
        questionText = "Aus welcher Rebsorte wird Brunello di Montalcino ausschließlich hergestellt?",
        answerA = "Ciliegiolo",
        answerB = "Primitivo",
        answerC = "Aglianico",
        answerD = "Sangiovese Grosso",
        correctAnswer = 3,
        explanation = "Brunello di Montalcino (Toskana) besteht zu 100 % aus Sangiovese Grosso, lokal 'Brunello' genannt. Er gehört zu den langlebigsten und teuersten Weinen Italiens und darf erst nach mindestens 5 Jahren Reifezeit verkauft werden.",
        difficulty = 3,
        funFact = "Ein klassischer Brunello di Montalcino Riserva muss mindestens 6 Jahre gelagert werden, bevor er den Markt erreicht."
    ),

    // Question 4
    Question(
        categoryId = 8,
        questionText = "Welche weiße Rebsorte dominiert die österreichischen Wachau-Weine?",
        answerA = "Welschriesling",
        answerB = "Müller-Thurgau",
        answerC = "Grüner Veltliner",
        answerD = "Scheurebe",
        correctAnswer = 2,
        explanation = "Grüner Veltliner ist die meistangebaute Rebsorte Österreichs und prägt die Wachau besonders stark. Typisch sind weißpfeffrige Würze, frische Säure und ein körperreicher Stil bei den Smaragd-Weinen der Region.",
        difficulty = 3,
        funFact = "Die Qualitätsstufen der Wachau heißen Steinfeder (leicht), Federspiel (mittel) und Smaragd (kräftig) — benannt nach der smaragdgrünen Eidechse, die in den Weinbergen lebt."
    ),

    // Question 5
    Question(
        categoryId = 8,
        questionText = "Welche drei Rebsorten bilden die klassische Basis für Champagner?",
        answerA = "Chardonnay, Riesling, Pinot Gris",
        answerB = "Chardonnay, Pinot Noir, Pinot Meunier",
        answerC = "Pinot Noir, Gamay, Chardonnay",
        answerD = "Chenin Blanc, Pinot Meunier, Pinot Noir",
        correctAnswer = 1,
        explanation = "Champagner wird aus Chardonnay (Weißburgunder), Pinot Noir (Spätburgunder) und Pinot Meunier (Schwarzriesling) hergestellt. 'Blanc de Blancs' besteht nur aus Chardonnay, 'Blanc de Noirs' nur aus den roten Sorten.",
        difficulty = 3,
        funFact = "Obwohl Pinot Noir und Pinot Meunier rote Trauben sind, liefern sie weißen Saft — die Farbe steckt ausschließlich in den Schalen, die sofort abgepresst werden."
    ),

    // Question 6
    Question(
        categoryId = 8,
        questionText = "Wie heißt die Hauptrebsorte, aus der Prosecco DOC/DOCG hergestellt wird?",
        answerA = "Trebbiano",
        answerB = "Pinot Grigio",
        answerC = "Verdicchio",
        answerD = "Glera",
        correctAnswer = 3,
        explanation = "Prosecco wird hauptsächlich aus der Rebsorte Glera (früher auch Prosecco genannt) hergestellt, mindestens zu 85 %. Das Anbaugebiet liegt in Venetien und Friaul (Nordostitalien). Seit 2009 ist der Name 'Prosecco' als DOC/DOCG geschützt.",
        difficulty = 3,
        funFact = "Die Umbenennung der Traube von 'Prosecco' zu 'Glera' im Jahr 2009 war bewusst: So kann nur Wein aus dem geschützten Anbaugebiet das Label 'Prosecco' tragen."
    ),

    // Question 7
    Question(
        categoryId = 8,
        questionText = "Welche Rebsorte ist synonym für den argentinischen Malbec bekannt und stammt ursprünglich aus welcher französischen Region?",
        answerA = "Loire-Tal",
        answerB = "Bordeaux (Gironde)",
        answerC = "Languedoc-Roussillon",
        answerD = "Cahors (Südwestfrankreich)",
        correctAnswer = 3,
        explanation = "Malbec (auch Côt oder Auxerrois genannt) stammt ursprünglich aus dem Cahors in Südwestfrankreich, wo er als 'Schwarzwein' bekannt ist. In Argentinien (Mendoza) fand er ideale Bedingungen und wurde zur Vorzeige-Rebsorte des Landes.",
        difficulty = 3,
        funFact = "In Cahors muss Malbec mindestens 70 % der Cuvée ausmachen. Der argentinische Stil ist jedoch deutlich fruchtiger und weicher als das tannintreiche Original aus Frankreich."
    ),

    // ── WEINREGIONEN FRANKREICH ───────────────────────────────────────────────

    // Question 8
    Question(
        categoryId = 8,
        questionText = "Wie viele Châteaux wurden bei der berühmten Bordeaux-Klassifikation von 1855 als Premier Cru Classé eingestuft?",
        answerA = "Drei",
        answerB = "Vier",
        answerC = "Fünf",
        answerD = "Sechs",
        correctAnswer = 2,
        explanation = "Ursprünglich wurden 1855 vier Châteaux als Premier Cru eingestuft: Lafite-Rothschild, Latour, Margaux und Haut-Brion. 1973 wurde Mouton-Rothschild als fünftes hinzugefügt — die einzige Änderung in der Geschichte dieser Klassifikation.",
        difficulty = 3,
        funFact = "Château Haut-Brion war das einzige Château außerhalb des Médoc, das 1855 in die Klassifikation aufgenommen wurde — es liegt in der Appellation Pessac-Léognan."
    ),

    // Question 9
    Question(
        categoryId = 8,
        questionText = "Welche Appellation im Burgund steht in der Hierarchie ganz oben und repräsentiert weniger als 2 % der Gesamtproduktion?",
        answerA = "Village",
        answerB = "Premier Cru",
        answerC = "Grand Cru",
        answerD = "Bourgogne Régionale",
        correctAnswer = 2,
        explanation = "Im Burgund bildet Grand Cru die höchste Qualitätsstufe. Es gibt etwa 33 Grand Cru-Lagen, die weniger als 2 % der gesamten Burgundy-Produktion ausmachen. Im Gegensatz zu Bordeaux ist die Klassifikation an die Lage (Terroir), nicht an das Château gebunden.",
        difficulty = 3,
        funFact = "Romanée-Conti, der berühmteste Grand Cru im Burgund, umfasst nur 1,8 Hektar und produziert etwa 6.000 Flaschen pro Jahr — Flaschen kosten leicht 10.000–20.000 Euro."
    ),

    // Question 10
    Question(
        categoryId = 8,
        questionText = "Welches Châteaux im Bordeaux-Médoc wurde als einziges Weingut 1973 von Premier Cru Classé 2ème auf 1er (Premier Cru) heraufgestuft?",
        answerA = "Château Pétrus",
        answerB = "Château Léoville-Las Cases",
        answerC = "Château Mouton-Rothschild",
        answerD = "Château Palmer",
        correctAnswer = 2,
        explanation = "Château Mouton-Rothschild wurde 1973 durch ein Dekret des französischen Landwirtschaftsministers von Deuxième zu Premier Cru Classé befördert. Dies ist die einzige Änderung in der Geschichte der 1855er Klassifikation.",
        difficulty = 3,
        funFact = "Baron Philippe de Rothschild kämpfte 20 Jahre lang für diese Aufwertung. Sein berühmter Spruch lautet: 'Premier je suis, second je fus, Mouton ne change pas' (Erster bin ich, Zweiter war ich, Mouton ändert sich nicht)."
    ),

    // Question 11
    Question(
        categoryId = 8,
        questionText = "In welcher Bordeaux-Appellation liegt Château Pétrus, das für seinen teuren Pomerol bekannt ist?",
        answerA = "Saint-Émilion",
        answerB = "Pomerol",
        answerC = "Médoc",
        answerD = "Graves",
        correctAnswer = 1,
        explanation = "Château Pétrus liegt in der Appellation Pomerol auf dem rechten Ufer der Gironde. Pomerol hat keine offizielle Klassifikation, aber Pétrus gilt als eines der teuersten und begehrtesten Weingüter der Welt.",
        difficulty = 3,
        funFact = "Pétrus besteht zu fast 100 % aus Merlot — ungewöhnlich für Bordeaux. Der besondere Tonboden der Lage hält Wasser und wärmt sich langsam auf, was dem Merlot ideale Bedingungen bietet."
    ),

    // Question 12
    Question(
        categoryId = 8,
        questionText = "Welche Rebsorte ist im Burgund für die besten Weißweine (z.B. Montrachet, Meursault) verantwortlich?",
        answerA = "Aligoté",
        answerB = "Viognier",
        answerC = "Chardonnay",
        answerD = "Pinot Blanc",
        correctAnswer = 2,
        explanation = "Chardonnay ist die einzige zugelassene Weißwein-Rebsorte für die besten Burgunder Weißweine. Montrachet, Corton-Charlemagne und Meursault gelten als Referenz für komplexe, alterungsfähige Chardonnays weltweit.",
        difficulty = 3,
        funFact = "Die Gemeinde Puligny verkaufte sich 1879 das Recht, den Namen Montrachet anzuhängen und heißt seitdem Puligny-Montrachet — ebenso wie die Nachbargemeinde Chassagne-Montrachet."
    ),

    // ── WEINREGIONEN DEUTSCHLAND ──────────────────────────────────────────────

    // Question 13
    Question(
        categoryId = 8,
        questionText = "Wie viele offizielle Weinanbaugebiete gibt es in Deutschland?",
        answerA = "13",
        answerB = "11",
        answerC = "15",
        answerD = "17",
        correctAnswer = 0,
        explanation = "Deutschland hat 13 offizielle Weinanbaugebiete: Ahr, Baden, Franken, Hessische Bergstraße, Mittelrhein, Mosel, Nahe, Pfalz, Rheingau, Rheinhessen, Saale-Unstrut, Sachsen und Württemberg.",
        difficulty = 3,
        funFact = "Sachsen und Saale-Unstrut sind die nördlichsten Weinanbaugebiete Deutschlands und Europas — hier liegt die klimatische Grenze des Weinbaus."
    ),

    // Question 14
    Question(
        categoryId = 8,
        questionText = "Welches deutsche Weinanbaugebiet hat den höchsten Riesling-Anteil (ca. 80 % der Rebfläche)?",
        answerA = "Mosel",
        answerB = "Pfalz",
        answerC = "Rheinhessen",
        answerD = "Rheingau",
        correctAnswer = 3,
        explanation = "Im Rheingau sind ca. 80 % der 3.100 Hektar Rebfläche mit Riesling bepflanzt. Das ist der höchste Riesling-Anteil aller deutschen Anbaugebiete. Der Rheingau gilt als Heimat des edelsüßen Rieslings.",
        difficulty = 3,
        funFact = "Im Rheingau wurde 1775 die erste dokumentierte Spätlese-Ernte gefeiert — die Botschaft des Erntestarts kam zu spät an, und die überreifen Trauben ergaben einen außergewöhnlich süßen Wein."
    ),

    // Question 15
    Question(
        categoryId = 8,
        questionText = "Welches deutsche Anbaugebiet ist für seine Bocksbeutel-Flaschen bekannt?",
        answerA = "Rheinhessen",
        answerB = "Württemberg",
        answerC = "Franken",
        answerD = "Baden",
        correctAnswer = 2,
        explanation = "Franken ist das einzige Weinanbaugebiet Deutschlands, das seine Qualitätsweine traditionell im Bocksbeutel abfüllt — einer bauchigen, abgeflachten Flasche. Silvaner ist die typische Rebsorte der Region.",
        difficulty = 3,
        funFact = "Der Bocksbeutel ist rechtlich geschützt: Kein anderes Weingebiet in Deutschland darf diese Flaschenform für Qualitätsweine verwenden."
    ),

    // Question 16
    Question(
        categoryId = 8,
        questionText = "In welchem deutschen Anbaugebiet liegt der weltberühmte Weinberg Bernkasteler Doctor?",
        answerA = "Rheingau",
        answerB = "Mosel",
        answerC = "Nahe",
        answerD = "Ahr",
        correctAnswer = 1,
        explanation = "Der Bernkasteler Doctor liegt in der Mosel, direkt hinter der Stadt Bernkastel-Kues. Er gilt als einer der teuersten deutschen Einzellagen und ist bekannt für Rieslinge von außergewöhnlicher Finesse und Langlebigkeit.",
        difficulty = 3,
        funFact = "Der Name 'Doctor' soll daher stammen, dass ein Kurfürst im 14. Jahrhundert durch den Wein dieser Lage von einer schweren Krankheit geheilt wurde."
    ),

    // Question 17
    Question(
        categoryId = 8,
        questionText = "Was beschreibt das deutsche Prädikat 'Eiswein' korrekt?",
        answerA = "Wein aus Trauben, die durch Edelschimmel getrocknet wurden",
        answerB = "Wein mit künstlicher Kühlung während der Gärung",
        answerC = "Wein aus überreifen Trauben mit mehr als 200 Oechsle",
        answerD = "Wein aus gefrorenen Trauben, die bei mindestens -7 °C geerntet werden",
        correctAnswer = 3,
        explanation = "Eiswein wird aus Trauben hergestellt, die bei mindestens -7 °C gefroren geerntet und sofort gepresst werden. Das Eis bleibt im Pressgut, der konzentrierte süße Saft fließt ab. Eiswein hat intensive Frucht und hohe Säure.",
        difficulty = 3,
        funFact = "Bei der Herstellung von Eiswein geht viel Volumen verloren — aus einem Kilogramm gefrorener Trauben erhält man nur wenige Deziliter Saft."
    ),

    // Question 18
    Question(
        categoryId = 8,
        questionText = "Welches Prädikat steht in der deutschen Weinqualitätspyramide an höchster Stelle?",
        answerA = "Beerenauslese",
        answerB = "Auslese",
        answerC = "Trockenbeerenauslese",
        answerD = "Eiswein",
        correctAnswer = 2,
        explanation = "Die Trockenbeerenauslese (TBA) steht an der Spitze der deutschen Prädikatswein-Pyramide. Die Trauben müssen so weit eingetrocknet und edelfaul sein, dass kaum noch Saft gewonnen wird. TBAs haben enormen Restzucker und sehr geringen Alkohol.",
        difficulty = 3,
        funFact = "Für eine einzige Flasche Trockenbeerenauslese werden mitunter bis zu 20 kg Trauben benötigt — das entspricht dem Ertrag mehrerer Reben."
    ),

    // ── WEINHERSTELLUNG & VINIFIKATION ────────────────────────────────────────

    // Question 19
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'malolaktischer Gärung' beim Wein?",
        answerA = "Die Vergärung von Traubenzucker zu Alkohol durch Hefe",
        answerB = "Die Ausfällung von Weinsäure durch Kühlung",
        answerC = "Die Extraktion von Farbe und Tanninen durch Maischegärung",
        answerD = "Die Umwandlung von Apfelsäure in Milchsäure durch Bakterien",
        correctAnswer = 3,
        explanation = "Bei der malolaktischen Gärung (BSA) wandeln Milchsäurebakterien die scharfe Apfelsäure in die weichere Milchsäure um. Das macht Weine runder und cremiger. Bei Chardonnay ist dieser Prozess oft erwünscht, bei Riesling wird er vermieden.",
        difficulty = 3,
        funFact = "Das buttige Aroma mancher Chardonnays stammt von Diacetyl, einem Nebenprodukt der malolaktischen Gärung."
    ),

    // Question 20
    Question(
        categoryId = 8,
        questionText = "Wie heißt die Methode, nach der Champagner seine Kohlensäure durch Flaschengärung entwickelt?",
        answerA = "Charmat-Methode",
        answerB = "Méthode Champenoise (Traditionelle Methode)",
        answerC = "Cuve Close",
        answerD = "Ancestrale Methode",
        correctAnswer = 1,
        explanation = "Bei der Méthode Champenoise (auch traditionelle Methode) findet die zweite Gärung direkt in der Flasche statt. Nach der Gärung werden Hefetrub durch Rütteln (Remuage) im Flaschenhals gesammelt und durch Degorgieren entfernt.",
        difficulty = 3,
        funFact = "Das traditionelle Rütteln per Hand (Remuage manuel) dauert 6–8 Wochen. Moderne Gyropalettes erledigen denselben Vorgang in 1–2 Wochen."
    ),

    // Question 21
    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'Terroir' im Weinbau?",
        answerA = "Die Anzahl der Sonnenstunden pro Vegetationsperiode",
        answerB = "Die Rebsorte und ihr genetisches Profil",
        answerC = "Das Alter der Rebstöcke in Jahren",
        answerD = "Die Gesamtheit aller Standortfaktoren: Boden, Klima, Topographie und Weinbaukultur",
        correctAnswer = 3,
        explanation = "Terroir bezeichnet das Zusammenwirken aller Standortfaktoren: Bodentyp, Mikroklima, Topographie, Exposition sowie die Weinbaukultur des Winzers. Es erklärt, warum Weine derselben Rebsorte aus verschiedenen Lagen so unterschiedlich schmecken.",
        difficulty = 3,
        funFact = "Das Konzept des Terroirs wurde im Burgund zur Perfektion entwickelt — dort wird die Lage als wichtiger erachtet als der Produzent oder die Rebsorte."
    ),

    // Question 22
    Question(
        categoryId = 8,
        questionText = "Was ist 'Edelschimmel' (Botrytis cinerea) beim Weinbau?",
        answerA = "Eine Heferasse für besonders langsame Gärung",
        answerB = "Ein Pilz, der unter bestimmten Bedingungen Trauben konzentriert und Süßweine ermöglicht",
        answerC = "Ein Schädling, der immer vernichtet werden muss",
        answerD = "Eine Rebsorte für Süßweine",
        correctAnswer = 1,
        explanation = "Botrytis cinerea kann als 'Grauschimmel' schädlich oder als 'Edelschimmel' nützlich sein. Bei bestimmten Wetterbedingungen (feuchte Morgen, trockene Nachmittage) entzieht er den Beeren Wasser und konzentriert Zucker und Aromen — Grundlage für Sauternes, Beerenauslese und Tokaj Aszú.",
        difficulty = 3,
        funFact = "Sauternes aus Bordeaux, darunter das legendäre Château d'Yquem, verdankt seinen Ruhm vollständig dem Edelschimmel Botrytis cinerea."
    ),

    // Question 23
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Assemblage' beim Weinbau?",
        answerA = "Das Abfüllen von Wein in Barrique-Fässer",
        answerB = "Die Ernte aller Trauben auf einmal",
        answerC = "Das Verschneiden verschiedener Weine, Rebsorten oder Lagen zu einer Cuvée",
        answerD = "Die Filtration des Weins vor der Abfüllung",
        correctAnswer = 2,
        explanation = "Bei der Assemblage werden verschiedene Weine (unterschiedliche Rebsorten, Lagen oder Jahrgänge) zu einer Cuvée verschnitten. Das Ziel ist es, einen ausgeglichenen, komplexen Wein zu schaffen. In Bordeaux und bei Champagner ist die Assemblage entscheidend für den Hausstil.",
        difficulty = 3,
        funFact = "Beim Non-Vintage-Champagner sorgt die Assemblage von bis zu 50 verschiedenen Weinen aus mehreren Jahrgängen für den gleichbleibenden Hausstil eines Hauses."
    ),

    // Question 24
    Question(
        categoryId = 8,
        questionText = "Welche Holzart wird am häufigsten für Barrique-Fässer im Weinbau verwendet?",
        answerA = "Kirsche",
        answerB = "Kastanie",
        answerC = "Akazie",
        answerD = "Eiche",
        correctAnswer = 3,
        explanation = "Eiche ist das Standardholz für Barrique-Fässer. Französische Eiche (besonders aus Limousin und Tronçais) und amerikanische Eiche haben unterschiedliche Aromenprofile: Franzosen bringen Gewürze und Rauchnoten, Amerikaner stärkere Vanille- und Kokos-Töne.",
        difficulty = 3,
        funFact = "Ein neues Barrique-Fass (225 Liter) kostet zwischen 600 und 1.500 Euro. Bei teuren Weinen werden neue Fässer oft nur ein- bis zweimal verwendet."
    ),

    // Question 25
    Question(
        categoryId = 8,
        questionText = "Was bedeutet die Angabe 'sur lie' auf einem Weinetikett?",
        answerA = "Der Wein wurde ohne Schwefelung hergestellt",
        answerB = "Der Wein reifte auf der Hefe (Trub) ohne frühzeitiges Abziehen",
        answerC = "Der Wein ist ungefiltert und ungeschönt",
        answerD = "Der Wein reifte mindestens 12 Monate im Fass",
        correctAnswer = 1,
        explanation = "'Sur lie' bedeutet 'auf der Hefe'. Der Wein verbleibt nach der Gärung auf dem Hefesatz (Trub). Dabei wird der Wein cremiger, gewinnt an Körper und Komplexität durch Autolyse (Selbstverdauung der Hefezellen). Typisch für Muscadet und Champagner.",
        difficulty = 3,
        funFact = "Beim Champagner ruhen Non-Vintage-Weine mindestens 15 Monate 'sur lie' in der Flasche, Vintage-Champagner mindestens 3 Jahre — das ergibt die typische Brot- und Hefenote."
    ),

    // ── WEINREGIONEN ITALIEN & SPANIEN ───────────────────────────────────────

    // Question 26
    Question(
        categoryId = 8,
        questionText = "Welche Klassifizierungsstufe steht in Italien oberhalb von DOC?",
        answerA = "DOCG",
        answerB = "IGT",
        answerC = "Vino da Tavola",
        answerD = "Classico",
        correctAnswer = 0,
        explanation = "Die italienische Weinpyramide lautet von unten nach oben: Vino da Tavola → IGT (Indicazione Geografica Tipica) → DOC (Denominazione di Origine Controllata) → DOCG (Denominazione di Origine Controllata e Garantita). DOCG ist die höchste Qualitätsstufe.",
        difficulty = 3,
        funFact = "Die 'Supertoskaner' wie Sassicaia und Tignanello waren ursprünglich nur als Vino da Tavola klassifiziert, weil sie Cabernet Sauvignon enthielten — was in der Toskana damals nicht erlaubt war."
    ),

    // Question 27
    Question(
        categoryId = 8,
        questionText = "Welcher Wein aus der Toskana ist auch als 'Sangiovese mit Cabernet Sauvignon' bekannt und begründete die Supertoskaner-Bewegung?",
        answerA = "Sassicaia",
        answerB = "Tignanello",
        answerC = "Ornellaia",
        answerD = "Masseto",
        correctAnswer = 1,
        explanation = "Tignanello vom Weingut Antinori gilt als Begründer der Supertoskaner-Bewegung. Er kombiniert Sangiovese (ca. 80 %) mit Cabernet Sauvignon und Cabernet Franc — ein Bruch mit der traditionellen Chianti-Formel, der 1971 erstmals vinifiziert wurde.",
        difficulty = 3,
        funFact = "Sassicaia (Tenuta San Guido) war streng genommen der erste Supertoskaner, aber Tignanello popularisierte den Sangiovese-Cabernet-Blend und machte das Konzept weltweit bekannt."
    ),

    // Question 28
    Question(
        categoryId = 8,
        questionText = "Welche Reifekategorie bezeichnet im Rioja einen Wein mit mindestens 2 Jahren Fassreife (davon 6 Monate Barrique) und 3 Jahren Gesamtlagerung?",
        answerA = "Crianza",
        answerB = "Joven",
        answerC = "Reserva",
        answerD = "Gran Reserva",
        correctAnswer = 0,
        explanation = "Crianza-Rotweine aus dem Rioja müssen mindestens 2 Jahre gelagert werden, davon mindestens 6 Monate im Eichenfass. Reserva benötigt 3 Jahre (12 Monate Fass), Gran Reserva 5 Jahre (18 Monate Fass).",
        difficulty = 3,
        funFact = "Die amerikanische Eiche war im Rioja traditionell dominierend und verleiht den Weinen die typischen Vanille- und Kokosnuss-Noten. Heute wird zunehmend auf französische Eiche umgestellt."
    ),

    // Question 29
    Question(
        categoryId = 8,
        questionText = "In welcher spanischen Region liegt das Anbaugebiet Priorat, bekannt für konzentrierte Garnacha-Weine?",
        answerA = "Kastilien-León",
        answerB = "Katalonien",
        answerC = "Andalusien",
        answerD = "Navarra",
        correctAnswer = 1,
        explanation = "Priorat (katalanisch: Priorat) liegt in der autonomen Gemeinschaft Katalonien, südwestlich von Barcelona. Der vulkanische Llicorella-Schiefer-Boden und das extreme Klima erzeugen extrem konzentrierte Garnacha- und Cariñena-Weine mit oft über 15 % Alkohol.",
        difficulty = 3,
        funFact = "Priorat war eines der ersten spanischen Weingebiete, das den DOCa-Status (höchste spanische Klassifikation) erhielt — zusammen mit dem Rioja."
    ),

    // Question 30
    Question(
        categoryId = 8,
        questionText = "Welche Rebsorte ist die Basis für Chianti Classico DOCG?",
        answerA = "Montepulciano",
        answerB = "Sangiovese",
        answerC = "Trebbiano",
        answerD = "Dolcetto",
        correctAnswer = 1,
        explanation = "Chianti Classico DOCG muss mindestens 80 % Sangiovese enthalten. Die ursprüngliche Formel von Baron Ricasoli im 19. Jahrhundert sah auch Canaiolo und Malvasia vor, aber heute dominiert reiner Sangiovese die besten Chianti Classico-Weine.",
        difficulty = 3,
        funFact = "Das 'Gallo Nero' (schwarzer Hahn) ist das Qualitätsmerkmal des Chianti Classico Consorzio — ein Symbol aus dem Mittelalter, als Florenz und Siena um die Vorherrschaft im Chianti-Gebiet stritten."
    ),

    // ── SCHAUMWEINE & SÜSSWEINE ───────────────────────────────────────────────

    // Question 31
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet die Angabe 'Brut Nature' auf einem Champagner-Etikett?",
        answerA = "Weniger als 3 g/l Restzucker, ohne Dosage zugefügt",
        answerB = "Weniger als 6 g/l Restzucker",
        answerC = "Keinerlei Schwefelzusatz",
        answerD = "Wein aus biodynamischem Anbau",
        correctAnswer = 0,
        explanation = "Brut Nature (auch Zero Dosage oder Brut Zéro) bezeichnet einen Champagner mit weniger als 3 g/l Restzucker, bei dem nach der Degorgierung keine Dosage (Zuckerlikör) zugefügt wurde. Die Stufen lauten: Brut Nature → Extra Brut → Brut → Extra Dry → Dry → Demi-Sec → Doux.",
        difficulty = 3,
        funFact = "Extra Dry-Champagner ist trotz des Namens süßer als Brut — die Bezeichnungen wurden im 19. Jahrhundert für den britischen Markt entwickelt, der damals trockenere Weine bevorzugte."
    ),

    // Question 32
    Question(
        categoryId = 8,
        questionText = "Wie heißt der berühmte süße Weißwein aus der Sauternes-Region in Bordeaux, der als 'flüssiges Gold' gilt?",
        answerA = "Château d'Yquem",
        answerB = "Château Margaux",
        answerC = "Château Pétrus",
        answerD = "Château Cheval Blanc",
        correctAnswer = 0,
        explanation = "Château d'Yquem aus Sauternes ist das einzige Weingut, das 1855 mit dem Sonderstatus 'Premier Cru Supérieur' ausgezeichnet wurde. Der edelsüße Wein wird aus botrytisierten Sémillon- und Sauvignon Blanc-Trauben hergestellt.",
        difficulty = 3,
        funFact = "In schlechten Jahren produziert Château d'Yquem keinen Sauternes — in manchen Jahrzehnten fanden bis zu vier solcher 'vendanges blanches' (Leerernten) statt."
    ),

    // Question 33
    Question(
        categoryId = 8,
        questionText = "Welche Methode wird für Prosecco verwendet, bei der die zweite Gärung im Drucktank stattfindet?",
        answerA = "Méthode Ancestrale",
        answerB = "Charmat-Methode",
        answerC = "Méthode Champenoise",
        answerD = "Transvasierungsverfahren",
        correctAnswer = 1,
        explanation = "Die Charmat-Methode (auch Cuve-Close oder Martinotti-Methode) sieht die zweite Gärung in einem großen Drucktank vor, nicht in der Flasche. Das Verfahren ist schneller und günstiger als die traditionelle Methode und erhält die frischen Fruchtnoten des Glera.",
        difficulty = 3,
        funFact = "Federico Martinotti erfand diese Methode 1895, aber Eugène Charmat patentierte die verbesserte Version 1910 — daher wird sie im deutschen Sprachraum oft Charmat-Verfahren genannt."
    ),

    // Question 34
    Question(
        categoryId = 8,
        questionText = "Wie heißt der traditionelle ungarische Süßwein, hergestellt aus botrytisierten 'Aszú'-Beeren?",
        answerA = "Tokaj Aszú",
        answerB = "Kadarka Aszú",
        answerC = "Furmint Spätlese",
        answerD = "Villányi Süßwein",
        correctAnswer = 0,
        explanation = "Tokaj Aszú ist der berühmteste ungarische Süßwein. Botrytisierte (edelfaule) Beeren werden in Körben ('Puttonyos') gesammelt und zum Basiswein gegeben. Je mehr Puttonyos, desto süßer der Wein. Die Hauptrebsorte ist Furmint.",
        difficulty = 3,
        funFact = "Ludwig XIV. soll den Tokaj als 'Wein der Könige und König der Weine' bezeichnet haben. Das Anbaugebiet Tokaj war das erste gesetzlich abgegrenzte Weingebiet der Welt (1737)."
    ),

    // ── WEINBEGRIFFE & SENSORIK ────────────────────────────────────────────────

    // Question 35
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet der Begriff 'Tannin' beim Rotwein?",
        answerA = "Den Restzuckergehalt nach der Gärung",
        answerB = "Phenolische Verbindungen aus Schalen, Kernen und Holz, die Adstringenz erzeugen",
        answerC = "Die Gesamtsäure im Wein",
        answerD = "Flüchtige Aromastoffe im Abgang",
        correctAnswer = 1,
        explanation = "Tannine sind Polyphenole, die aus Traubenschalen, -kernen und -stielen sowie aus Holzfässern in den Wein übergehen. Sie verursachen das zusammenziehende, adstringierende Mundgefühl und sind mitverantwortlich für die Alterungsfähigkeit eines Rotweins.",
        difficulty = 3,
        funFact = "Tannine binden sich an Speichelproteine, was das typische 'Austrocknen' des Mundes nach tanninreichen Rotweinen wie Barolo oder Tannat erklärt."
    ),

    // Question 36
    Question(
        categoryId = 8,
        questionText = "Was versteht man beim Wein unter 'Restzucker'?",
        answerA = "Zucker, der bei der Assemblage zugesetzt wird",
        answerB = "Den natürlichen Fruchtzucker der Weintraube vor der Ernte",
        answerC = "Zucker aus dem Eichenholzfass",
        answerD = "Den nicht vergärten Zucker, der nach Abschluss der Gärung im Wein verbleibt",
        correctAnswer = 3,
        explanation = "Restzucker (RS) ist der Zucker, der nach der alkoholischen Gärung im Wein verbleibt, weil die Gärung gestoppt wurde oder die Hefe nicht allen Zucker vergären konnte. Trockene Weine haben unter 9 g/l RS, Süßweine können über 100 g/l aufweisen.",
        difficulty = 3,
        funFact = "Der menschliche Gaumen nimmt Süße oft erst ab ca. 4–5 g/l Restzucker wahr — deshalb können Weine mit bis zu 9 g/l als 'trocken' deklariert werden, ohne süß zu schmecken."
    ),

    // Question 37
    Question(
        categoryId = 8,
        questionText = "Welches Aroma beschreibt man beim Riesling als 'Petrol' oder 'Kerosin'?",
        answerA = "Diacetyl",
        answerB = "TDN (1,1,6-Trimethyl-1,2-dihydronaphthalin)",
        answerC = "Geosmin",
        answerD = "Mercaptan",
        correctAnswer = 1,
        explanation = "Das Petrol-Aroma in gereiftem Riesling entsteht durch TDN (1,1,6-Trimethyl-1,2-dihydronaphthalin), eine Verbindung aus dem Abbau von Carotinoiden im Traubenmark. Viele Riesling-Liebhaber schätzen diesen Ton als Zeichen von Reife und Komplexität.",
        difficulty = 3,
        funFact = "Das Petrol-Aroma im Riesling wird durch Sonneneinstrahlung begünstigt — Trauben aus besonders heißen und sonnigen Jahren entwickeln es stärker."
    ),

    // Question 38
    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'Brettanomyces' (Brett) beim Wein — und warum ist er umstritten?",
        answerA = "Ein Bakterium, das den Wein trübt",
        answerB = "Ein Verfahren zur Reduktion der Gesamtsäure",
        answerC = "Eine Hefe, die Aromen wie Stallmist, Leder und Pflaster erzeugt — je nach Menge Fehler oder Charakter",
        answerD = "Eine Rebsortenkrankheit, die zu Aromaverlust führt",
        correctAnswer = 2,
        explanation = "Brettanomyces ist eine Heferasse, die im Keller und Fass leben kann. Sie produziert Verbindungen wie 4-Ethylphenol ('Pflaster', 'Stall') und 4-Ethylguaiacol ('Speck', 'Leder'). In geringen Mengen gilt Brett als stilprägendes Element, in hohen Mengen als Weinfehler.",
        difficulty = 3,
        funFact = "Einige Weinliebhaber suchen gezielt nach 'bretty' wirkenden Weinen — besonders in traditionellen Bordeaux-Châteaux und Rioja-Reservas gehörte Brett lange zum Hausstil."
    ),

    // Question 39
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet man beim Wein als 'Korker' oder 'korkig'?",
        answerA = "Wein mit zu vielen Tanninen aus dem Eichenfass",
        answerB = "Wein mit einem Korkstück im Glas",
        answerC = "Wein mit dem Aroma von TCA (Trichloranisol) durch einen kontaminierten Korken",
        answerD = "Wein mit zu hohem CO₂-Gehalt",
        correctAnswer = 2,
        explanation = "Ein 'Korker' entsteht durch TCA (2,4,6-Trichloranisol), eine Verbindung, die durch Reaktion von Chlorverbindungen mit Korken entsteht. TCA unterdrückt Fruchtaromen und erzeugt einen muffig-feuchten Geruch (nasse Pappe, Schimmel). Betroffen sind schätzungsweise 1–3 % aller Korkweine.",
        difficulty = 3,
        funFact = "TCA kann in extrem kleinen Mengen (unter 5 ng/l) wahrgenommen werden und macht Weine 'stumm' — es unterdrückt alle positiven Aromen, ohne selbst stark wahrnehmbar zu sein."
    ),

    // ── NEUE WELT & SONSTIGE REGIONEN ────────────────────────────────────────

    // Question 40
    Question(
        categoryId = 8,
        questionText = "Welches Weingebiet in Neuseeland ist weltweit für seinen Sauvignon Blanc berühmt?",
        answerA = "Hawke's Bay",
        answerB = "Central Otago",
        answerC = "Marlborough",
        answerD = "Waipara",
        correctAnswer = 2,
        explanation = "Marlborough auf der Südinsel Neuseelands ist das bekannteste Weingebiet des Landes und hat den Sauvignon Blanc weltweit neu definiert. Der Marlborough Sauvignon Blanc ist geprägt von intensiver Stachelbeer-, Passionsfrucht- und Grapefruitaromatik.",
        difficulty = 3,
        funFact = "Das Weingut Cloudy Bay (1985 gegründet) machte Marlborough international bekannt und löste in den 1990er Jahren einen regelrechten Neuseeland-Sauvignon-Boom aus."
    ),

    // Question 41
    Question(
        categoryId = 8,
        questionText = "Welche chilenische Rotwein-Rebsorte wurde lange mit Merlot verwechselt und ist ein direkter Nachfahre einer alten französischen Sorte?",
        answerA = "Carménère",
        answerB = "País",
        answerC = "Carignan",
        answerD = "Cinsault",
        correctAnswer = 0,
        explanation = "Carménère war ursprünglich eine Bordeaux-Rebsorte, die im 19. Jahrhundert aus Frankreich nach Chile gelangte. Nach der Phylloxera-Katastrophe verschwand sie in Europa fast vollständig. In Chile wurde sie jahrzehntelang als Merlot verkauft, bis DNA-Analysen 1994 die wahre Identität enthüllten.",
        difficulty = 3,
        funFact = "Carménère reift späte — fast 3 Wochen nach Merlot — und braucht Chiles warmes Klima. In Bordeaux war die späte Reife ein Problem, in Chile eine Stärke."
    ),

    // Question 42
    Question(
        categoryId = 8,
        questionText = "In welchem australischen Staat liegt das berühmte Barossa Valley, bekannt für kräftige Shiraz-Weine?",
        answerA = "Victoria",
        answerB = "Western Australia",
        answerC = "New South Wales",
        answerD = "South Australia",
        correctAnswer = 3,
        explanation = "Das Barossa Valley liegt in South Australia, ca. 60 km nordöstlich von Adelaide. Es ist Australiens bekanntestes Weingebiet und berühmt für alte, tiefwurzelnde Shiraz-Reben, die zum Teil über 150 Jahre alt sind und nicht von der Reblaus befallen wurden.",
        difficulty = 3,
        funFact = "Das Barossa Valley wurde von deutschen Immigranten (hauptsächlich aus Schlesien) im 19. Jahrhundert geprägt — daher haben viele Produzenten und Dörfer noch heute deutsche Namen."
    ),

    // Question 43
    Question(
        categoryId = 8,
        questionText = "Welcher bekannte Wein aus Südafrika heißt 'Pinotage' und ist eine Kreuzung aus welchen zwei Rebsorten?",
        answerA = "Pinot Noir × Hermitage (Cinsault)",
        answerB = "Pinot Gris × Cabernet Sauvignon",
        answerC = "Pinot Meunier × Grenache",
        answerD = "Pinot Blanc × Carignan",
        correctAnswer = 0,
        explanation = "Pinotage wurde 1925 von Abraham Perold an der Stellenbosch University durch Kreuzung von Pinot Noir und Hermitage (südafrikanische Bezeichnung für Cinsault) entwickelt. Es ist die einzige in Südafrika gezüchtete Rebsorte und gilt als nationales Weinheiligtum.",
        difficulty = 3,
        funFact = "Die erste Pinotage-Flasche wurde erst 1959 vermarktet — 34 Jahre nach der Kreuzung. Abraham Perold hatte die Kreuzungspflanzen sogar fast in seinem Garten vergessen."
    ),

    // Question 44
    Question(
        categoryId = 8,
        questionText = "Welche Region in Südamerika ist die höchstgelegene bedeutende Weinregion der Welt?",
        answerA = "Mendoza (Argentinien)",
        answerB = "Valle de Colchagua (Chile)",
        answerC = "Cafayate (Argentinien)",
        answerD = "Salta-Jujuy (Argentinien)",
        correctAnswer = 3,
        explanation = "Die Region Salta-Jujuy im Norden Argentiniens, besonders das Weingebiet Quebrada de Humahuaca, beherbergt Weinberge auf über 3.000 m Höhe — manche Reben stehen auf fast 3.300 m ü.NN. Die extreme Höhe kombiniert mit intensiver Sonneneinstrahlung und kühlen Nächten ergibt außergewöhnlich aromatische Torrontés- und Malbec-Weine.",
        difficulty = 3,
        funFact = "Cafayate in der Provinz Salta liegt auf ca. 1.700–2.000 m und gilt als 'Hochland-Weingebiet' mit den reinsten Torrontés-Weinen der Welt."
    ),

    // ── WEINGESETZ & KLASSIFIKATIONEN ─────────────────────────────────────────

    // Question 45
    Question(
        categoryId = 8,
        questionText = "Was bedeutet die Abkürzung 'AOC' auf einem französischen Weinetikett?",
        answerA = "Association des Œnologues Certifiés",
        answerB = "Agriculture Organique Certifiée",
        answerC = "Assemblage Original Classé",
        answerD = "Appellation d'Origine Contrôlée — kontrollierte Herkunftsbezeichnung",
        correctAnswer = 3,
        explanation = "AOC (Appellation d'Origine Contrôlée) ist die höchste Qualitätsstufe für französische Weine und Lebensmittel und garantiert die Herkunft sowie die Einhaltung strikter Produktionsbedingungen (Rebsorten, Ertrag, Vinifikation). Seit 2009 wurde AOC EU-weit zur AOP (Appellation d'Origine Protégée).",
        difficulty = 3,
        funFact = "Frankreich hat über 360 Wein-AOCs — von Champagne bis Bandol. Das System wurde 1935 gesetzlich verankert und gilt weltweit als Vorbild für geografische Herkunftsbezeichnungen."
    ),

    // Question 46
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Oechsle-Grad' beim deutschen Wein?",
        answerA = "Ein Maß für den Alkoholgehalt nach der Gärung",
        answerB = "Die Anzahl der Sonnenstunden pro Vegetationsperiode",
        answerC = "Ein Maß für den Zuckergehalt (Mostgewicht) des Traubensafts vor der Gärung",
        answerD = "Ein Maß für die Gesamtsäure im fertigen Wein",
        correctAnswer = 2,
        explanation = "Oechsle ist die in Deutschland und der Schweiz gebräuchliche Einheit für das Mostgewicht — also den Zuckergehalt des frischen Traubensafts. Je mehr Oechsle, desto mehr Zucker, desto mehr potentieller Alkohol. Für Trockenbeerenauslese sind mindestens 150 °Oe vorgeschrieben.",
        difficulty = 3,
        funFact = "Ferdinand Oechsle erfand die nach ihm benannte Waage (Mostwaage) Anfang des 19. Jahrhunderts. Die Einheit 'Grad Oechsle' wird bis heute ausschließlich in Deutschland, Österreich und der Schweiz verwendet."
    ),

    // Question 47
    Question(
        categoryId = 8,
        questionText = "Welcher deutsche Wein-Jahrgang der letzten Jahrzehnte gilt als einer der besten des 20. Jahrhunderts in der Mosel?",
        answerA = "1971",
        answerB = "1987",
        answerC = "1994",
        answerD = "2003",
        correctAnswer = 0,
        explanation = "Der Jahrgang 1971 gilt in der Mosel, im Rheingau und an der Saar als legendärer Jahrhundertjahrgang. Er brachte außergewöhnlich reife, aromatisch dichte Rieslinge hervor, von denen viele auch heute noch brillant trinken.",
        difficulty = 3,
        funFact = "Das deutsche Weingesetz von 1971 führte neue Qualitätsbegriffe ein — ironischerweise ist auch der gleichnamige Jahrgang 1971 das beste Beispiel dafür, was deutsches Weinrecht im besten Fall schützen soll."
    ),

    // Question 48
    Question(
        categoryId = 8,
        questionText = "Was bezeichnet der Begriff 'Einzellage' im deutschen Weinrecht?",
        answerA = "Ein Wein aus einer einzigen Rebsorte",
        answerB = "Ein Wein aus einem einzigen Jahrgang",
        answerC = "Ein genau abgegrenzter Weinberg mit einheitlichem Charakter",
        answerD = "Ein Weingut mit weniger als 5 Hektar Rebfläche",
        correctAnswer = 2,
        explanation = "Eine Einzellage ist im deutschen Weinrecht ein genau abgegrenzter Weinberg (Mindestgröße 5 ha), dessen Weine einen typischen Charakter durch einheitliche Boden- und Klimaverhältnisse aufweisen. Die Lagenbezeichnung darf nur für Qualitätsweine von mindestens 70 % der Trauben dieser Lage verwendet werden.",
        difficulty = 3,
        funFact = "Deutschland hatte 1971 noch über 30.000 Einzellagen-Namen — das Weingesetz von 1971 reduzierte sie auf ca. 2.600, um dem Verbraucher die Orientierung zu erleichtern."
    ),

    // ── SCHAUM- UND DESSERTWEINE / SONSTIGES ─────────────────────────────────

    // Question 49
    Question(
        categoryId = 8,
        questionText = "Wie wird der spanische Schaumwein bezeichnet, der nach der traditionellen Methode (Flaschengärung) hergestellt wird?",
        answerA = "Cava",
        answerB = "Crémant",
        answerC = "Freixenet",
        answerD = "Espumoso",
        correctAnswer = 0,
        explanation = "Cava ist der spanische Schaumwein, der wie Champagner nach der Méthode Champenoise (Flaschengärung) hergestellt wird. Cava kommt hauptsächlich aus dem Penedès in Katalonien und wird aus Macabeo, Parellada und Xarel·lo hergestellt.",
        difficulty = 3,
        funFact = "Obwohl Cava theoretisch aus ganz Spanien stammen kann, kommen über 95 % aller Cava-Flaschen aus der Region um Sant Sadurní d'Anoia in Katalonien."
    ),

    // Question 50
    Question(
        categoryId = 8,
        questionText = "Was ist 'Sherry' und welches Herstellungsverfahren macht ihn einzigartig?",
        answerA = "Spanischer Likörwein aus Jerez, gereift im Solera-Verfahren mit kontinuierlichem Fassaustausch",
        answerB = "Portugiesischer Süßwein, durch Zugabe von Weinbrand stabilisiert",
        answerC = "Französischer Wermut aus dem Languedoc",
        answerD = "Italienischer Dessertwein aus überreifen Muscat-Trauben",
        correctAnswer = 0,
        explanation = "Sherry (Jerez) ist ein spanischer Likörwein aus der Region Jerez de la Frontera in Andalusien, hauptsächlich aus der Rebsorte Palomino. Das Solera-System mischt ältere und jüngere Weine in aufeinandergestapelten Fässern kontinuierlich durch, was einen gleichmäßigen Stil über Jahrzehnte sichert.",
        difficulty = 3,
        funFact = "Das älteste aktive Solera-System in Jerez stammt aus dem Jahr 1730 — technisch enthält jede heutige Flasche also Spuren von Wein aus dem 18. Jahrhundert."
    )

)
