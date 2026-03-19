package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsEasy5(): List<Question> = listOf(

    // Question 1 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was bedeutet es, Gemüse zu 'blanchieren'?",
        answerA = "Gemüse kurz in kochendem Wasser garen und dann in Eiswasser abschrecken",
        answerB = "Gemüse in Butter goldbraun anbraten",
        answerC = "Gemüse mit Salz einlegen und einige Stunden ziehen lassen",
        answerD = "Gemüse im Backofen bei hoher Hitze rösten",
        correctAnswer = 0,
        explanation = "Beim Blanchieren wird Gemüse kurz in sprudelnd kochendes Wasser getaucht und sofort danach in Eiswasser abgeschreckt. Das stoppt den Garprozess, erhält die Farbe, den Biss und viele Vitamine.",
        difficulty = 1,
        funFact = "Blanchieren ist auch der erste Schritt beim Einfrieren von Gemüse – es deaktiviert Enzyme, die sonst im Tiefkühler Farbe und Geschmack verschlechtern würden."
    ),

    // Question 2 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welches Fett eignet sich am besten zum scharfen Anbraten von Fleisch?",
        answerA = "Olivenöl extra vergine",
        answerB = "Butterschmalz oder Pflanzenöl mit hohem Rauchpunkt",
        answerC = "Butter",
        answerD = "Margarine",
        correctAnswer = 1,
        explanation = "Zum scharfen Anbraten braucht man ein Fett mit hohem Rauchpunkt. Butterschmalz (ca. 200 °C) und raffiniertes Pflanzenöl (bis 220 °C) eignen sich am besten. Butter und natives Olivenöl verbrennen bei hohen Temperaturen und entwickeln Bitterstoffe.",
        difficulty = 1,
        funFact = "Der Rauchpunkt eines Fetts ist die Temperatur, bei der es anfängt zu rauchen und gesundheitsschädliche Stoffe freizusetzen. Natives Olivenöl hat nur ca. 160–190 °C Rauchpunkt – deshalb besser für Salate oder schonendes Dünsten."
    ),

    // Question 3 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was passiert mit Nudeln, wenn man sie 'al dente' kocht?",
        answerA = "Sie werden vollständig weich und zerfallen leicht",
        answerB = "Sie nehmen die Soße besser auf, wenn man sie weich kocht",
        answerC = "Sie sind noch leicht bissfest und haben einen festen Kern",
        answerD = "Sie werden außen weich und innen hart wie roh",
        correctAnswer = 2,
        explanation = "'Al dente' ist Italienisch und bedeutet 'auf den Zahn'. Pasta al dente ist außen gar, hat aber noch einen leichten Biss und einen festen Kern. Sie ist nicht nur geschmacklich besser, sondern auch gesünder – der Körper verdaut sie langsamer.",
        difficulty = 1,
        funFact = "Al-dente-gekochte Nudeln haben einen niedrigeren glykämischen Index als weich gekochte. Das bedeutet, der Blutzucker steigt nach dem Essen langsamer an – ideal für alle, die auf ihren Blutzucker achten."
    ),

    // Question 4 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Wie viel Salz gibt man ins Nudelwasser?",
        answerA = "Gar kein Salz – die Soße würzt die Nudeln ausreichend",
        answerB = "Eine kleine Prise – so wenig wie möglich",
        answerC = "Einen gestrichenen Esslöffel Salz pro Liter Wasser",
        answerD = "Reichlich Salz – das Wasser soll 'wie das Meer' schmecken",
        correctAnswer = 3,
        explanation = "Nudelwasser soll kräftig gesalzen sein – Köche empfehlen etwa 10 g Salz pro Liter Wasser. Das ist der einzige Moment, in dem die Pasta selbst Geschmack aufnimmt. Ungesalzenes Nudelwasser ergibt fade, geschmacklose Pasta.",
        difficulty = 1,
        funFact = "Das Salz im Nudelwasser erhöht den Siedepunkt minimal, was praktisch keinen Unterschied macht. Der wichtigste Effekt ist rein geschmacklich – Salz würzt die Nudeln von innen heraus."
    ),

    // Question 5 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Braten' und 'Dünsten'?",
        answerA = "Beim Braten wird Fett und hohe Hitze verwendet, beim Dünsten wenig Flüssigkeit und niedrige Hitze",
        answerB = "Braten verwendet viel Flüssigkeit, Dünsten verwendet kein Fett",
        answerC = "Dünsten ist dasselbe wie Braten, nur ein anderes Wort dafür",
        answerD = "Braten funktioniert nur im Ofen, Dünsten nur auf dem Herd",
        correctAnswer = 0,
        explanation = "Beim Braten werden Lebensmittel in Fett bei hoher Hitze (160–225 °C) gegart, was zu Röstaromen und einer Kruste führt. Beim Dünsten gart man in wenig Flüssigkeit bei niedrigerer Temperatur unter Deckel – schonender und nährstoffreicher.",
        difficulty = 1,
        funFact = "Die Maillard-Reaktion beim Braten ist der chemische Prozess, der für die braune Kruste und den typischen Röstgeruch verantwortlich ist. Sie tritt ab etwa 140 °C auf und erzeugt hunderte Aromastoffe."
    ),

    // Question 6 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Wozu dient ein Sieb (Küchensieb) beim Kochen?",
        answerA = "Zum Zerkleinern von Kräutern und Gemüse",
        answerB = "Zum Abgießen von Flüssigkeit und Abtrennen von festen Bestandteilen",
        answerC = "Zum Messen von Zutaten nach Gewicht",
        answerD = "Zum Rühren von dickflüssigen Suppen und Soßen",
        correctAnswer = 1,
        explanation = "Ein Küchensieb wird zum Abgießen von Kochflüssigkeit verwendet – zum Beispiel beim Abgießen von Nudeln oder Gemüse. Die Löcher lassen Wasser durch, halten aber die festen Zutaten zurück.",
        difficulty = 1,
        funFact = "Ein feines Haarsieb wird verwendet, um Saucen zu verfeinern und Klümpchen zu entfernen – so bekommt man eine glatte, elegante Konsistenz wie im Restaurant."
    ),

    // Question 7 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'karamellisieren' beim Kochen?",
        answerA = "Gemüse mit Zucker süßen und einlegen",
        answerB = "Fleisch mit Honigglasur bestreichen vor dem Braten",
        answerC = "Zucker durch Erhitzen goldbraun schmelzen lassen",
        answerD = "Soße mit Stärke andicken",
        correctAnswer = 2,
        explanation = "Karamellisieren bedeutet, Zucker unter Hitze zu schmelzen und goldbraun bis braun werden zu lassen. Ab etwa 160 °C verwandelt sich Zucker in flüssiges Karamell. Dabei entstehen Röstaromen und eine nussige Note.",
        difficulty = 1,
        funFact = "Auch Zwiebeln können karamellisieren – ihr natürlicher Zucker wird durch langes, sanftes Braten süß und goldbraun. Das dauert etwa 30–40 Minuten bei niedriger Hitze und ist das Geheimnis einer guten French-Onion-Soup."
    ),

    // Question 8 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Marinieren'?",
        answerA = "Gemüse in Salzwasser einkochen zur Konservierung",
        answerB = "Teig mit Ei bestreichen vor dem Backen",
        answerC = "Soßen mit Butter verfeinern am Ende des Kochens",
        answerD = "Fleisch oder Fisch in einer Würzflüssigkeit einlegen, um Geschmack zu verbessern",
        correctAnswer = 3,
        explanation = "Beim Marinieren wird Fleisch, Fisch oder Gemüse in einer Marinade aus Öl, Säure (Essig/Zitrone), Kräutern und Gewürzen eingelegt. Die Säure lockert die Fleischfasern, das Öl hält die Feuchtigkeit, und die Gewürze geben Aroma.",
        difficulty = 1,
        funFact = "Wie lange man marinieren sollte, hängt vom Lebensmittel ab: Fisch nur 30 Minuten, Hühnchen 2–8 Stunden, rotes Fleisch bis zu 24 Stunden im Kühlschrank. Zu langes Marinieren in Säure macht Fisch und Geflügel matschig."
    ),

    // Question 9 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Wie erkennt man, ob das Wasser zum Kochen von Nudeln bereit ist?",
        answerA = "Es sprudelt kräftig und große Blasen steigen auf – es kocht sprudelnd",
        answerB = "Es bildet sich ein dünner Dampf an der Oberfläche",
        answerC = "Das Wasser beginnt leicht zu schäumen",
        answerD = "Die Farbe des Wassers verändert sich leicht gelblich",
        correctAnswer = 0,
        explanation = "Nudeln kocht man in sprudelnd kochendem Wasser – also wenn viele große Blasen aufsteigen. In schwach siedendem Wasser kleben Nudeln zusammen und garen ungleichmäßig. Erst wenn das Wasser richtig kocht, kommen die Nudeln rein.",
        difficulty = 1,
        funFact = "Wasser kocht bei 100 °C auf Meereshöhe. In den Bergen (z.B. auf 2000 m) siedet Wasser schon bei etwa 93 °C – deshalb muss man dort Nudeln länger kochen, weil die Temperatur nicht so hoch wird."
    ),

    // Question 10 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Schneebesen' in der Küche?",
        answerA = "Ein Messer zum Schneiden von dünnen Scheiben",
        answerB = "Ein Werkzeug zum Schlagen und Unterrühren von Flüssigkeiten und Teigen",
        answerC = "Ein Gerät zum Reiben von Käse und Gemüse",
        answerD = "Eine spezielle Form zum Backen von Brötchen",
        correctAnswer = 1,
        explanation = "Ein Schneebesen (auch Rührbesen genannt) ist ein Küchenutensil mit mehreren gebogenen Drähten, das zum Aufschlagen von Sahne, Eiern und Teigen verwendet wird. Er schlägt Luft in die Masse und verhindert Klümpchenbildung.",
        difficulty = 1,
        funFact = "Das Wort 'Schneebesen' kommt von der Form: Die Drähte ähneln einem Büschel – wie ein Besen, der Schnee aufwirbelt. In der Profiküche nennt man ihn oft 'Fouet', das französische Wort für Peitsche."
    ),

    // Question 11 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Wie prüft man, ob ein Ei noch frisch ist?",
        answerA = "Man schüttelt es – frische Eier machen kein Geräusch",
        answerB = "Man leuchtet mit einer Taschenlampe durch die Schale",
        answerC = "Man gibt es in ein Glas Wasser – frische Eier sinken auf den Boden",
        answerD = "Man hält es ans Ohr und lauscht auf ein Knacken",
        correctAnswer = 2,
        explanation = "Der Schwimmtest ist ein einfacher Frischetest: Ein frisches Ei sinkt und liegt flach auf dem Boden. Ein älteres Ei stellt sich aufrecht auf. Ein altes Ei schwimmt an der Oberfläche – es enthält durch die poröse Schale eingedrungene Luft und sollte nicht mehr gegessen werden.",
        difficulty = 1,
        funFact = "Im Ei bildet sich mit der Zeit eine Luftblase, die immer größer wird, weil Wasser durch die poröse Schale verdunstet. Je größer die Luftblase, desto älter das Ei – und desto eher schwimmt es."
    ),

    // Question 12 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'Abschmecken' beim Kochen?",
        answerA = "Die Zutaten vor dem Kochen abwiegen",
        answerB = "Die Temperatur des Essens mit einem Thermometer messen",
        answerC = "Überschüssiges Fett aus der Soße abschöpfen",
        answerD = "Das Gericht vor dem Servieren probieren und die Würzung anpassen",
        correctAnswer = 3,
        explanation = "Abschmecken bedeutet, das Gericht kurz vor dem Servieren zu kosten und bei Bedarf Salz, Pfeffer, Säure oder andere Gewürze nachzujustieren. Es ist der letzte, entscheidende Schritt beim Kochen, der aus einem guten ein perfektes Gericht macht.",
        difficulty = 1,
        funFact = "Professionelle Köche schmecken ihr Gericht während des gesamten Kochvorgangs mehrfach ab – nicht nur am Ende. So können sie frühzeitig korrigieren und verstehen, wie sich die Aromen beim Kochen verändern."
    ),

    // Question 13 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Warum salzt man Auberginen vor dem Kochen oft ein?",
        answerA = "Um ihren Bitterstoff zu entziehen und überschüssige Feuchtigkeit zu reduzieren",
        answerB = "Damit die Aubergine beim Braten nicht braun wird",
        answerC = "Um die Schale weicher zu machen und leichter schälen zu können",
        answerD = "Damit die Aubergine beim Kochen ihre lila Farbe behält",
        correctAnswer = 0,
        explanation = "Durch Einsalzen werden der Aubergine Feuchtigkeit und Bitterstoffe entzogen. Das Salz löst osmotisch Wasser aus den Zellen. Nach 20–30 Minuten abtupfen – die Aubergine nimmt dann weniger Öl beim Braten auf und schmeckt milder.",
        difficulty = 1,
        funFact = "Moderne Auberginensorten wurden durch Züchtung weitgehend von Bitterstoffen befreit. Deshalb kann man diesen Schritt heute oft überspringen – bei frischen, jungen Auberginen ist er kaum noch nötig."
    ),

    // Question 14 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist eine 'Pfanne' und wofür wird sie hauptsächlich verwendet?",
        answerA = "Ein tiefer Topf zum Kochen von Suppen und Eintöpfen",
        answerB = "Ein flaches Kochgeschirr mit Stiel zum Braten, Anbraten und Sautieren",
        answerC = "Eine Backform für Kuchen und Brot",
        answerD = "Ein Sieb zum Abgießen von Nudeln",
        correctAnswer = 1,
        explanation = "Eine Pfanne ist flaches Kochgeschirr mit einem langen Stiel. Sie wird für Braten, Anbraten, Sautieren, Spiegelei braten und vieles mehr verwendet. Es gibt sie in verschiedenen Ausführungen: Edelstahl, Gusseisen, Antihaft und Keramik.",
        difficulty = 1,
        funFact = "Eine gut eingebrannte Gusseisenpfanne ist faktisch antihaftbeschichtet und kann ein Leben lang halten. Das Geheimnis: regelmäßiges Einölen. Köche vererben ihre Gusseisenpfannen manchmal an die nächste Generation."
    ),

    // Question 15 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was sollte man beim Schneiden von Zwiebeln tun, um weniger zu weinen?",
        answerA = "Mit einem sehr stumpfen Messer schneiden",
        answerB = "Die Zwiebel unter fließendem Wasser schneiden",
        answerC = "Die Zwiebel vorher kühlen oder unter Wasser schneiden – beides hilft",
        answerD = "Schnell und ohne Pause durchschneiden",
        correctAnswer = 2,
        explanation = "Zwiebeln geben beim Schneiden ein Gas ab (Propanthial-S-oxid), das mit Feuchtigkeit auf den Augen reagiert und tränen lässt. Eine gekühlte Zwiebel gibt weniger Gas ab. Unter Wasser schneiden verhindert, dass das Gas die Augen erreicht.",
        difficulty = 1,
        funFact = "Ein anderer Trick: ein scharfes Messer verwenden! Ein scharfes Messer drückt weniger Zellen auf, sodass weniger irritierendes Gas freigesetzt wird. Wer mit einem scharfen Messer schneidet, weint deutlich weniger."
    ),

    // Question 16 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist der richtige Weg, ein Küchenmesser sauber zu halten?",
        answerA = "Immer in der Spülmaschine waschen für maximale Hygiene",
        answerB = "Nur mit kaltem Wasser abspülen, niemals Seife verwenden",
        answerC = "Im Wasser einweichen lassen, damit Reste sich lösen",
        answerD = "Von Hand mit warmem Wasser und Spülmittel waschen und sofort trocknen",
        correctAnswer = 3,
        explanation = "Gute Küchenmesser sollte man von Hand waschen und sofort abtrocknen. In der Spülmaschine werden Messer stumpf, rosten und die Griffe können sich lösen. Einweichen greift die Klinge an und macht das Holz der Griffe spröde.",
        difficulty = 1,
        funFact = "Ein gutes Küchenmesser sollte regelmäßig geschärft werden. Profis schärfen ihre Messer wöchentlich mit einem Wetzstahl nach. Ein stumpfes Messer ist gefährlicher als ein scharfes – man drückt stärker und rutscht leichter ab."
    ),

    // Question 17 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'Deglasieren' (Ablöschen) in der Küche?",
        answerA = "Flüssigkeit in eine heiße Pfanne gießen, um Bratensatz zu lösen",
        answerB = "Glas-Auflaufformen mit Butter einstreichen vor dem Backen",
        answerC = "Heiße Speisen schnell in Eiswasser kühlen",
        answerD = "Einen Deckel auf den Topf setzen, damit Dampf entweicht",
        correctAnswer = 0,
        explanation = "Beim Deglasieren (Ablöschen) gießt man Flüssigkeit wie Wein, Brühe oder Wasser in eine heiße Pfanne, in der Fleisch angebraten wurde. Die Hitze löst den angebratenen Bratensatz vom Boden – dieser ist der Grundstein für eine aromatische Soße.",
        difficulty = 1,
        funFact = "Der Bratensatz am Pfannenboden heißt auf Französisch 'fond' (Grundlage). Er besteht aus karamellisierten Proteinen und Zuckern und ist der geschmacksreichste Teil eines Schmor- oder Bratgerichts."
    ),

    // Question 18 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Wie viele Minuten kocht man ein weiches Frühstücksei?",
        answerA = "1–2 Minuten",
        answerB = "4–5 Minuten",
        answerC = "8–10 Minuten",
        answerD = "12–15 Minuten",
        correctAnswer = 1,
        explanation = "Ein weiches Ei (flüssiges Eigelb, gestocktes Eiweiß) kocht man ab dem Zeitpunkt, wenn das Wasser kocht, etwa 4–5 Minuten. Bei 6–7 Minuten wird das Eigelb wachsweich, bei 8–10 Minuten ist es hart.",
        difficulty = 1,
        funFact = "Die genaue Kochzeit hängt auch von der Eigröße und der Kühlschranktemperatur ab. Ein direkt aus dem Kühlschrank genommenes Ei braucht 30 Sekunden länger als ein zimmertemperiertes. Deshalb raten Köche, Eier vorher kurz anzuwärmen."
    ),

    // Question 19 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist eine 'Reibe' und wofür benutzt man sie?",
        answerA = "Ein Pinsel zum Bestreichen von Teig mit Ei oder Butter",
        answerB = "Eine Zange zum Wenden von Fleisch in der Pfanne",
        answerC = "Ein Werkzeug zum Zerkleinern und Raspeln von Käse, Karotten oder Zitronenschale",
        answerD = "Ein Spatel zum Verteilen von Frischkäse auf Brot",
        correctAnswer = 2,
        explanation = "Eine Küchenreibe ist ein Gerät mit scharfen Zacken oder Schlitzen. Man reibt Käse, Gemüse, Nüsse oder Zitrusschale daran entlang, um feine Raspeln zu erzeugen. Es gibt Vierkantreiben, Microplane-Reiben und Spezialreiben für verschiedene Konsistenzen.",
        difficulty = 1,
        funFact = "Die Microplane-Reibe wurde ursprünglich als Holzbearbeitungswerkzeug erfunden. Eine Hausfrau benutzte sie zufällig für Orangen – und das Ergebnis war so überzeugend fein, dass das Unternehmen sein Produkt in die Küche brachte."
    ),

    // Question 20 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Schmoren'?",
        answerA = "Lebensmittel in viel Fett bei hoher Temperatur frittieren",
        answerB = "Gemüse ohne Fett auf dem Grillrost garen",
        answerC = "Teig bei niedriger Temperatur langsam aufgehen lassen",
        answerD = "Zutaten zunächst scharf anbraten und dann langsam in Flüssigkeit fertig garen",
        correctAnswer = 3,
        explanation = "Schmoren kombiniert zwei Garmethoden: Zuerst wird das Fleisch scharf angebraten (für Röstaromen und Kruste), dann in wenig Flüssigkeit mit Deckel bei niedriger Temperatur lange gegart. Das macht auch zähes Fleisch butterweich.",
        difficulty = 1,
        funFact = "Collagen (ein Bindegewebsprotein in zähem Fleisch) verwandelt sich beim langen Schmoren bei etwa 70–80 °C in Gelatine. Das ist das Geheimnis, warum Schmorgerichte wie Gulasch oder Ossobuco nach stundenlangem Kochen so zart und saftig sind."
    ),

    // Question 21 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Wann sollte man Knoblauch beim Anbraten in die Pfanne geben?",
        answerA = "Erst gegen Ende, wenn die anderen Zutaten fast gar sind",
        answerB = "Ganz am Anfang, noch bevor die Pfanne heiß ist",
        answerC = "Zusammen mit dem Fleisch von Beginn an",
        answerD = "Knoblauch sollte nie direkt angebraten werden",
        correctAnswer = 0,
        explanation = "Knoblauch verbrennt sehr schnell (in 30–60 Sekunden) und wird dann bitter. Deshalb gibt man ihn erst gegen Ende des Anbratens in die Pfanne, wenn die anderen Zutaten bereits gar sind. Kurzes Anrösten reicht völlig aus, um das Aroma zu entfalten.",
        difficulty = 1,
        funFact = "Gepresster Knoblauch verbrennt schneller als in Scheiben geschnittener, weil die Oberfläche größer ist. Ganze Knoblauchzehen in Öl können dagegen länger erhitzt werden und geben ein milderes, süßlicheres Aroma ab."
    ),

    // Question 22 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist der Zweck eines Schneidbretts in der Küche?",
        answerA = "Zum Aufwärmen von Speisen in der Mikrowelle",
        answerB = "Als Unterlage beim Schneiden, schützt Messer und Arbeitsfläche",
        answerC = "Zum Messen der Kerntemperatur von Fleisch",
        answerD = "Als Deckel für Töpfe und Pfannen",
        correctAnswer = 1,
        explanation = "Ein Schneidbrett schützt sowohl die Küchenarbeitsfläche als auch die Messerschneide beim Schneiden. Holzbretter sind antibakteriell und messerfreundlich. Kunststoffbretter sind hygienischer für rohes Fleisch und leichter zu reinigen.",
        difficulty = 1,
        funFact = "Hygieniker empfehlen, für rohes Fleisch, Fisch und Gemüse/Obst separate Schneidbretter zu verwenden – idealerweise in verschiedenen Farben. So verhindert man Kreuzkontamination von Bakterien wie Salmonellen."
    ),

    // Question 23 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was macht man, wenn eine Soße zu salzig geworden ist?",
        answerA = "Mehr Butter hinzugeben",
        answerB = "Zucker hinzufügen, um das Salz zu neutralisieren",
        answerC = "Eine rohe geschälte Kartoffel hineinlegen und kurz mitkochen lassen",
        answerD = "Die Soße wegschütten und neu anfangen",
        correctAnswer = 2,
        explanation = "Eine roh geschälte Kartoffel saugt beim Mitkochen überschüssiges Salz auf. Man legt sie einfach 10–15 Minuten in die Soße und entfernt sie dann wieder. Alternativ kann man auch die Soße mit mehr Flüssigkeit oder ungesalzener Sahne strecken.",
        difficulty = 1,
        funFact = "Die Kartoffelmethode funktioniert, weil die Stärke der Kartoffel Salz bindet. Allerdings ist sie nicht perfekt – bei extrem salzigen Soßen hilft letztlich nur Verdünnen. Küchenprofis sagen: 'Es ist einfacher, nachzusalzen als Salz zu entfernen.'"
    ),

    // Question 24 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Wie kocht man Reis am häufigsten in deutschen Haushalten?",
        answerA = "Im Backofen bei 180 °C für 30 Minuten",
        answerB = "In sehr viel Wasser wie Nudeln kochen und dann abgießen",
        answerC = "In der Pfanne ohne Wasser in Öl rösten",
        answerD = "Mit der doppelten Menge Wasser aufkochen, dann bei schwacher Hitze quellen lassen",
        correctAnswer = 3,
        explanation = "Die gängigste Methode: Reis mit doppelter Menge Wasser aufkochen (1 Tasse Reis, 2 Tassen Wasser), kurz aufkochen lassen, dann Hitze reduzieren und bei geschlossenem Deckel ca. 15–20 Minuten quellen lassen bis das Wasser aufgesogen ist.",
        difficulty = 1,
        funFact = "In asiatischen Ländern haben viele Haushalte einen elektrischen Reiskocher – ein Gerät, das Reis vollautomatisch perfekt kocht. In Japan gilt perfekt gekochter Reis als Grundlage guter Küche und ist Zeichen handwerklicher Perfektion."
    ),

    // Question 25 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Pfannenwender' (Spatel)?",
        answerA = "Ein flaches Küchengerät zum Wenden und Heben von Speisen in der Pfanne",
        answerB = "Ein Gerät zum Aufschlagen von Eiern",
        answerC = "Ein Werkzeug zum Schneiden von Teig und Pizzen",
        answerD = "Eine Bürste zum Einölen von Backformen",
        correctAnswer = 0,
        explanation = "Ein Pfannenwender (Spatel oder Wender) ist ein flaches, dünnes Küchengerät mit langem Stiel. Es wird verwendet, um Speisen wie Spiegeleier, Pfannkuchen oder Fischfilets in der Pfanne zu wenden, ohne sie zu zerbrechen.",
        difficulty = 1,
        funFact = "Bei Antihaftpfannen sollte man nur Pfannenwender aus Silikon oder Kunststoff verwenden – Metall-Spateln verkratzen die Beschichtung und schädigen sie auf Dauer."
    ),

    // Question 26 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was passiert, wenn man Öl zu stark erhitzt, bis es raucht?",
        answerA = "Das Öl bekommt einen besseren Geschmack und ist hitzestabiler",
        answerB = "Das Öl verbrennt und bildet gesundheitsschädliche Substanzen wie Acrolein",
        answerC = "Das Öl wird klarer und ist dann für alle Temperaturen geeignet",
        answerD = "Nichts Besonderes – Rauchen ist normal und zeigt die richtige Temperatur",
        correctAnswer = 1,
        explanation = "Wenn Öl zu stark erhitzt wird und zu rauchen beginnt, überschreitet es seinen Rauchpunkt. Dabei entstehen gesundheitsschädliche Verbindungen wie Acrolein und freie Radikale. Das Öl sollte dann entsorgt und die Pfanne gereinigt werden.",
        difficulty = 1,
        funFact = "Das ranzige, bittere Aroma von verbranntem Öl überträgt sich auf das Gericht und verdirbt es. Rauch in der Küche ist immer ein Warnsignal – entweder die Temperatur reduzieren oder Öl wechseln."
    ),

    // Question 27 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist die Aufgabe von Backpulver beim Backen?",
        answerA = "Es macht den Teig süßer und verbessert den Geschmack",
        answerB = "Es verhindert, dass der Teig beim Backen anbrennt",
        answerC = "Es lässt den Teig durch Kohlendioxid-Bildung aufgehen und luftig werden",
        answerD = "Es bindet Flüssigkeit und macht den Teig geschmeidiger",
        correctAnswer = 2,
        explanation = "Backpulver besteht aus Natron und einer Säure (meist Weinstein). Wenn es im Teig Feuchtigkeit trifft, entsteht Kohlendioxid. Diese Gasblasen lassen den Teig aufgehen und machen ihn luftig und locker.",
        difficulty = 1,
        funFact = "Backpulver wurde 1843 vom englischen Chemiker Alfred Bird erfunden – weil seine Frau eine Hefeallergie hatte. Er suchte nach einem Ersatz für Hefe und entwickelte das Triebmittel, das heute in jeder Küche zu finden ist."
    ),

    // Question 28 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welches Grundprinzip gilt beim Würzen von Fleisch mit Salz?",
        answerA = "Fleisch erst nach dem Garen salzen, da Salz vorher Feuchtigkeit entzieht",
        answerB = "Fleisch niemals salzen, Pfeffer reicht aus",
        answerC = "Salz ist beim Fleisch egal – man kann es jederzeit hinzugeben",
        answerD = "Salz kurz vor dem Braten oder bereits 45 Minuten vorher – nie dazwischen",
        correctAnswer = 3,
        explanation = "Salzt man Fleisch direkt vor dem Braten, tritt Flüssigkeit aus. Salzt man es erst nach dem Braten, fehlt Tiefe. Ideal: Entweder unmittelbar vor dem Braten salzen ODER mindestens 45 Minuten vorher – dann kann das Salz einziehen und wird von den Zellen wieder aufgenommen.",
        difficulty = 1,
        funFact = "Das Phänomen heißt Osmose: Salz entzieht zunächst Feuchtigkeit, die sich an der Oberfläche bildet. Nach 30–45 Minuten wird diese salzige Flüssigkeit wieder ins Fleisch aufgesogen – das Fleisch wird gleichmäßig gewürzt und saftig."
    ),

    // Question 29 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen einem Topf und einer Kasserolle?",
        answerA = "Eine Kasserolle ist ein Topf mit zwei Griffen und kann auch im Ofen verwendet werden",
        answerB = "Ein Topf wird nur für Suppen, eine Kasserolle nur für Nudeln benutzt",
        answerC = "Es gibt keinen Unterschied – beide Begriffe bedeuten dasselbe",
        answerD = "Eine Kasserolle hat keinen Deckel, ein Topf immer",
        correctAnswer = 0,
        explanation = "Eine Kasserolle ist ein breiter, flacher Topf mit zwei kurzen Griffen (statt eines langen Stiels). Sie ist ofenfest und eignet sich sowohl für den Herd als auch für den Backofen – ideal für Schmorgerichte und Aufläufe.",
        difficulty = 1,
        funFact = "Der Name 'Kasserolle' kommt vom französischen 'casserole', was wiederum vom griechischen 'kuathos' (Schöpfkelle/Trinkgefäß) abstammt. Heute ist der Begriff für feuerfeste Kochgeschirre aller Art gebräuchlich."
    ),

    // Question 30 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Wie verhindert man, dass Kartoffeln beim Kochen auseinanderfallen?",
        answerA = "Kartoffeln immer ohne Schale kochen für gleichmäßiges Garen",
        answerB = "Festkochende Sorten wählen, kalt aufsetzen oder etwas Essig ins Wasser geben",
        answerC = "Kartoffeln bei sehr hoher Hitze schnell kochen",
        answerD = "Kartoffeln vorher einfrieren und dann direkt ins kochende Wasser geben",
        correctAnswer = 1,
        explanation = "Festkochende Kartoffelsorten (z.B. 'Linda') halten besser zusammen als mehligkochende. Kalt aufsetzen lässt die Kartoffel gleichmäßig garen. Essig erhält die Pectin-Struktur in der Zellwand und verhindert das Zerfallen.",
        difficulty = 1,
        funFact = "Mehligkochende Kartoffeln (z.B. 'Bintje') zerfallen beim Kochen absichtlich – ideal für Kartoffelpüree. Festkochende bleiben dagegen als ganze Stücke erhalten und eignen sich für Salat, Bratkartoffeln oder Gratins."
    ),

    // Question 31 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Reduzieren' beim Kochen von Soßen?",
        answerA = "Einer Soße Stärke oder Mehl hinzufügen zum Andicken",
        answerB = "Eine Soße mit kaltem Wasser verdünnen",
        answerC = "Eine Soße durch Kochen ohne Deckel einkochen, damit sie eindickt und intensiver wird",
        answerD = "Eine Soße durch ein feines Sieb passieren",
        correctAnswer = 2,
        explanation = "Beim Reduzieren kocht man eine Soße oder Flüssigkeit ohne Deckel, damit Wasser verdampft. Dadurch wird die Soße dicker, intensiver im Geschmack und konzentrierter in den Aromen. Das ist eine der wichtigsten Techniken für aromatische Soßen.",
        difficulty = 1,
        funFact = "Eine Balsamico-Creme entsteht durch starkes Reduzieren von Balsamico-Essig: Er wird auf ein Viertel seines ursprünglichen Volumens eingekocht und wird dabei dickflüssig und süßlich – ideal als Salatdressing oder Garnitur."
    ),

    // Question 32 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "In welche Richtung schält man Gemüse mit dem Sparschäler sicher?",
        answerA = "Seitlich schälen, niemals auf sich zu oder von sich weg",
        answerB = "Zum Körper hin schälen für mehr Kontrolle",
        answerC = "Es spielt keine Rolle, Hauptsache man schält gleichmäßig",
        answerD = "Immer vom Körper weg schälen – das ist die sichere Methode",
        correctAnswer = 3,
        explanation = "Beim Schälen mit dem Sparschäler oder Messer sollte man immer vom Körper weg schälen – also in Richtung weg von sich. So ist das Verletzungsrisiko deutlich geringer, falls das Gerät abrutscht.",
        difficulty = 1,
        funFact = "Der Sparschäler (Y-Schäler oder I-Schäler) ist eine relativ moderne Erfindung: Er wurde 1947 vom Schweizer Alfred Neweczerzal erfunden und revolutionierte das Schälen von Gemüse und Obst. Vorher benutzte man ausschließlich Messer."
    ),

    // Question 33 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was bedeutet es, einen Teig zu 'kneten'?",
        answerA = "Den Teig mit den Händen falten, drücken und dehnen, um Gluten zu entwickeln",
        answerB = "Den Teig rollen und auseinanderziehen mit einem Nudelholz",
        answerC = "Teigzutaten vorsichtig mit einem Löffel verrühren",
        answerD = "Den Teig in eine Form drücken und glattstreichen",
        correctAnswer = 0,
        explanation = "Kneten bedeutet, den Teig mit den Händen rhythmisch zu falten, drücken und dehnen. Dabei entwickeln sich Glutenstränge – das Eiweißnetz, das dem Teig Elastizität und Struktur gibt. Gut gekneteter Teig ist glatt, elastisch und klebt nicht.",
        difficulty = 1,
        funFact = "Glutenentwicklung ist das Geheimnis hinter gutem Brot. Je mehr man knetet, desto stabiler das Glutennetz. Bäcker kneten Teig oft 10–15 Minuten per Hand – oder verwenden eine Küchenmaschine. Zu viel kneten geht bei Brotteig kaum, bei Kuchenteig aber schon."
    ),

    // Question 34 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welche Temperatur hat ein Backofen, wenn er auf 'mittlere Hitze' eingestellt ist?",
        answerA = "100–120 °C",
        answerB = "175–200 °C",
        answerC = "150–170 °C",
        answerD = "220–250 °C",
        correctAnswer = 1,
        explanation = "Mittlere Backofentemperatur liegt etwa bei 175–200 °C. Das ist die häufigste Temperatur für Kuchen, Muffins und Aufläufe. Niedrige Hitze (unter 150 °C) ist für zartes Garen, hohe Hitze (220+ °C) für knusprige Pizza oder Baguette.",
        difficulty = 1,
        funFact = "Ältere Rezepte nennen oft 'Stufe 3' oder 'Stufe 4' – das sind Gasmarkierungen aus der Zeit der Gasherde. Stufe 3 entspricht etwa 160–170 °C, Stufe 4 etwa 175–180 °C in einem modernen Elektroofen."
    ),

    // Question 35 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Wozu benutzt man ein Fleischthermometer?",
        answerA = "Um zu prüfen, ob die Pfanne heiß genug ist",
        answerB = "Um zu messen, ob Öl zum Frittieren die richtige Temperatur hat",
        answerC = "Um die Kerntemperatur von Fleisch zu messen und sicherzustellen, dass es durch ist",
        answerD = "Um die Temperatur von heißen Suppen vor dem Servieren zu kontrollieren",
        correctAnswer = 2,
        explanation = "Ein Fleischthermometer misst die Kerntemperatur des Fleisches von innen. So weiß man genau, ob das Fleisch den richtigen Gargrad erreicht hat. Geflügel zum Beispiel muss 74 °C Kerntemperatur erreichen, um sicher von Salmonellen frei zu sein.",
        difficulty = 1,
        funFact = "Das Fleischthermometer ist das präziseste Werkzeug in der Küche. Profis schwören darauf, weil Angaben wie 'nach Gefühl' oder 'Drucktest' unzuverlässig sind. Ein medium gebratenes Steak hat exakt 57–60 °C Kerntemperatur."
    ),

    // Question 36 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was macht man, damit Äpfel nach dem Schneiden nicht braun werden?",
        answerA = "Die Stücke kurz in kaltem Wasser einlegen",
        answerB = "Die geschnittenen Äpfel sofort abdecken und dunkel stellen",
        answerC = "Apfelstücke in Salzwasser tauchen",
        answerD = "Die Apfelstücke sofort mit etwas Zitronensaft beträufeln",
        correctAnswer = 3,
        explanation = "Apfelstücke werden durch Oxidation braun – ein Enzym (Polyphenoloxidase) reagiert mit Sauerstoff. Zitronensäure hemmt dieses Enzym. Einfach Zitronensaft darüberträufeln hält Äpfel (und auch Avocados, Birnen) länger frisch und hell.",
        difficulty = 1,
        funFact = "Das Bräunen von Obst ist eine enzymatische Reaktion, die durch Sauerstoffkontakt ausgelöst wird. Bei Obst ist es kalt-enzymatisch – im Gegensatz zur Maillard-Reaktion beim Braten, die hitzeinduziert ist."
    ),

    // Question 37 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'pochieren' als Garmethode?",
        answerA = "Lebensmittel in kaum kochender, simmernder Flüssigkeit sanft garen",
        answerB = "Lebensmittel im Backofen bei indirekter Hitze langsam garen",
        answerC = "Lebensmittel in der Pfanne ohne Fett trocken rösten",
        answerD = "Lebensmittel auf dem Rost über offenem Feuer grillen",
        correctAnswer = 0,
        explanation = "Pochieren bedeutet, Lebensmittel in einer Flüssigkeit zu garen, die knapp unter dem Siedepunkt liegt (75–90 °C, kaum Blasen). Diese sehr sanfte Garmethode eignet sich besonders für empfindliche Zutaten wie Eier, Fisch oder zartes Geflügel.",
        difficulty = 1,
        funFact = "Das berühmte 'Egg Benedict' verwendet pochierte Eier. Das Trickreichste dabei ist das Aufrechterhalten der richtigen Temperatur: Sprudelnd kochendes Wasser würde das Ei zerreißen. Etwas Essig im Wasser hilft, das Eiweiß schneller stocken zu lassen."
    ),

    // Question 38 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Wie viel Wasser sollte man für 100 g Nudeln verwenden?",
        answerA = "Genau die doppelte Menge Wasser wie Nudeln reicht aus",
        answerB = "Mindestens 1 Liter Wasser pro 100 g Nudeln",
        answerC = "Nur so viel Wasser, dass die Nudeln gerade bedeckt sind",
        answerD = "Die Menge ist egal, solange das Wasser kocht",
        correctAnswer = 1,
        explanation = "Für 100 g Nudeln empfiehlt man mindestens 1 Liter Wasser. In ausreichend Wasser können Nudeln sich frei bewegen, garen gleichmäßig und kleben nicht zusammen. Zu wenig Wasser führt zu matschigen, zusammengeklebten Nudeln.",
        difficulty = 1,
        funFact = "In Italien kocht man Nudeln traditionell in sehr viel Wasser ('a mare') – wie im Meer. Das Stärkewasser, das beim Kochen entsteht, wird nicht einfach weggeschüttet: Es dient als perfekter Soßenbinder, da es Stärke enthält."
    ),

    // Question 39 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist eine 'Antihaftpfanne'?",
        answerA = "Eine Pfanne aus Gusseisen, die durch starkes Erhitzen versiegelt wird",
        answerB = "Eine Pfanne mit Rillen, ideal nur für Grillgerichte",
        answerC = "Eine Pfanne mit einer speziellen Beschichtung, an der Speisen nicht kleben bleiben",
        answerD = "Eine Pfanne aus Keramik, die nur im Ofen verwendet werden kann",
        correctAnswer = 2,
        explanation = "Eine Antihaftpfanne hat eine spezielle Beschichtung (meist PTFE, bekannt als Teflon, oder Keramik), an der Speisen nicht haften bleiben. Sie eignet sich besonders für empfindliche Zutaten wie Eier, Fisch und Pfannkuchen, die leicht zerfallen.",
        difficulty = 1,
        funFact = "Teflon (PTFE – Polytetrafluorethylen) wurde 1938 zufällig vom Chemiker Roy Plunkett bei DuPont entdeckt. Er suchte nach einem neuen Kältemittel und fand stattdessen die gleitfähigste Substanz der Welt."
    ),

    // Question 40 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was sollte man nach dem Schneiden von Zwiebeln tun, bevor man die Augen berührt?",
        answerA = "Augen reiben ist in Ordnung, solange man die Hände vorher abwischt",
        answerB = "Die Augen kurz reiben hilft, den Zwiebeldampf zu vertreiben",
        answerC = "Erst kalt Wasser ins Gesicht spritzen",
        answerD = "Erst beide Hände mit Wasser und Seife waschen, dann ist Augen reiben unbedenklich",
        correctAnswer = 3,
        explanation = "Nach dem Zwiebelschneiden sollte man die Hände gründlich mit Wasser und Seife waschen, bevor man die Augen berührt. Der reizende Stoff (Propanthial-S-oxid) auf den Händen würde die Augen stark brennen lassen. Mit gewaschenen Händen ist das Reiben unbedenklich.",
        difficulty = 1,
        funFact = "Kontaktlinsenträger leiden oft stärker beim Zwiebelschneiden, weil die Linsen die Tränen nicht so gut ablenken. Schutzbrille tragen oder Kontaktlinsen zuvor herausnehmen hilft hier tatsächlich spürbar."
    ),

    // Question 41 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Dampfgaren' (Dämpfen) als Garmethode?",
        answerA = "Lebensmittel im heißen Wasserdampf über kochendem Wasser garen",
        answerB = "Lebensmittel bei sehr hohem Druck im Schnellkochtopf garen",
        answerC = "Lebensmittel in Alufolie eingewickelt im Ofen garen",
        answerD = "Lebensmittel in Wasser einlegen und langsam erhitzen",
        correctAnswer = 0,
        explanation = "Beim Dampfgaren werden Lebensmittel in einem Siebkorb über kochendem Wasser platziert. Der aufsteigende Dampf gart die Speisen schonend. Vorteile: minimaler Nährstoffverlust, keine Fette nötig, Farbe und Textur bleiben erhalten.",
        difficulty = 1,
        funFact = "In Asien (besonders China und Japan) ist Dampfgaren seit Jahrtausenden die beliebteste Garmethode. Bambusdampfer, die übereinandergestapelt werden, erlauben es, mehrere Gerichte gleichzeitig mit einem einzigen Topf zu garen."
    ),

    // Question 42 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was sollte man beim Aufbewahren von frischen Kräutern im Kühlschrank beachten?",
        answerA = "Kräuter immer in verschlossenen Plastikbeuteln aufbewahren",
        answerB = "Kräuter wie Blumen ins Wasser stellen oder in feuchtes Küchenpapier wickeln",
        answerC = "Kräuter auf einer Platte ausbreiten, damit sie trocknen",
        answerD = "Kräuter immer einfrieren, niemals im Kühlschrank lagern",
        correctAnswer = 1,
        explanation = "Frische Kräuter halten am längsten, wenn sie wie Blumen in ein Glas mit etwas Wasser gestellt werden oder in leicht feuchtes Küchenpapier eingewickelt im Kühlschrank aufbewahrt werden. Basilikum jedoch mag keine Kälte und wird schwarz – es besser bei Zimmertemperatur aufbewahren.",
        difficulty = 1,
        funFact = "Gefrorene Kräuter sind ein praktischer Tipp für Hobbyköche: Frische Kräuter hacken, in Eiswürfelformen geben, mit Öl oder Wasser auffüllen und einfrieren. Die Kräuterwürfel können direkt in heiße Gerichte gegeben werden."
    ),

    // Question 43 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Warum lässt man Fleisch nach dem Braten noch kurz ruhen?",
        answerA = "Damit das Fleisch sich beim Schneiden nicht verformt",
        answerB = "Damit die Kruste weich wird und sich leichter schneiden lässt",
        answerC = "Damit sich die Fleischsäfte gleichmäßig verteilen und das Fleisch saftig bleibt",
        answerD = "Damit das Fleisch auf Zimmertemperatur abkühlt und besser verdaulich ist",
        correctAnswer = 2,
        explanation = "Beim Braten zieht sich das Fleisch zusammen und die Säfte sammeln sich in der Mitte. Lässt man das Fleisch 5–10 Minuten ruhen, entspannen sich die Muskelfasern und die Säfte verteilen sich gleichmäßig – das Ergebnis ist saftiger und schmackhafter.",
        difficulty = 1,
        funFact = "Das Ruhenlassen gilt besonders für Steaks: Schneidet man ein frisch gebratenes Steak sofort auf, läuft der gesamte Fleischsaft heraus. Nach 5 Minuten Ruhezeit bleibt er im Fleisch. Profis decken das Fleisch dabei locker mit Alufolie ab."
    ),

    // Question 44 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Mehlieren' in der Küche?",
        answerA = "Teig aus Mehl, Eiern und Milch anrühren",
        answerB = "Mehl in einer Pfanne trocken anrösten für eine Mehlschwitze",
        answerC = "Backformen mit Mehl bestäuben, damit der Teig nicht anhaftet",
        answerD = "Fleisch oder Fisch vor dem Braten leicht in Mehl wenden",
        correctAnswer = 3,
        explanation = "Mehlieren bedeutet, Fleisch, Fisch oder Gemüse leicht in Mehl zu wenden oder mit Mehl zu bestäuben. Das Mehl bindet oberflächliche Feuchtigkeit, sorgt beim Braten für eine leichte Kruste und hilft, Soßen zu binden.",
        difficulty = 1,
        funFact = "Das klassische 'Müllerin-Art' (à la meunière) für Fisch ist eine mehlierte Methode: Fisch wird mehliert, in Butter gebraten und mit Zitronensaft und gehackter Petersilie serviert. 'Meunière' bedeutet auf Französisch 'Müllersfrau' – da sie immer Mehl zur Hand hatte."
    ),

    // Question 45 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welches Gewürz verleiht Gerichten typisch eine gelb-orangene Farbe?",
        answerA = "Kurkuma (Gelbwurz)",
        answerB = "Zimt",
        answerC = "Paprikapulver",
        answerD = "Koriander",
        correctAnswer = 0,
        explanation = "Kurkuma (auch Gelbwurz oder Turmeric genannt) ist ein leuchtend gelb-oranges Gewürzpulver, das Gerichten eine intensive Farbe verleiht. Es ist der Hauptfarbstoff in Curry-Pulver und färbt auch Hände und Kleidung dauerhaft.",
        difficulty = 1,
        funFact = "Kurkuma wird nicht nur in der Küche, sondern auch als natürlicher Farbstoff in der Textilindustrie und traditionellen Heilkunde verwendet. In Indien gilt es seit Jahrtausenden als 'heiliges Gewürz' und wird bei Hochzeitszeremonien eingesetzt."
    ),

    // Question 46 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist der beste Weg, Knoblauch schnell zu schälen?",
        answerA = "Knoblauch kurz in heißes Wasser tauchen, dann lässt sich die Schale leicht abziehen",
        answerB = "Mit dem Messerrücken fest auf die Knoblauchzehe drücken, dann springt die Schale auf",
        answerC = "Mit den Fingernägeln die Schale abknabbern",
        answerD = "Knoblauch 10 Minuten in der Mikrowelle erhitzen",
        correctAnswer = 1,
        explanation = "Der Profi-Trick: Knoblauchzehe auf das Schneidbrett legen, den flachen Messerrücken auflegen und fest andrücken. Durch den Druck platzt die Schale auf und lässt sich leicht abziehen. Diese Methode löst gleichzeitig das Fruchtfleisch von der Schale.",
        difficulty = 1,
        funFact = "Ein weiterer Trick: Mehrere Knoblauchzehen in ein Metallgefäß geben, kräftig schütteln. Die Zehen reiben aneinander und verlieren dabei ihre Schale. Diese Methode eignet sich, wenn man viele Zehen auf einmal schälen will."
    ),

    // Question 47 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'Sautieren' als Kochtechnik?",
        answerA = "Lebensmittel bei sehr niedriger Temperatur langsam garen",
        answerB = "Lebensmittel im Ofen bei Oberhitze gratinieren",
        answerC = "Lebensmittel in wenig heißem Fett unter ständigem Schwenken schnell anbraten",
        answerD = "Lebensmittel in viel Fett frittieren",
        correctAnswer = 2,
        explanation = "Sautieren kommt vom Französischen 'sauter' (springen). Man gart Lebensmittel in wenig heißem Fett und schwenkt die Pfanne dabei, damit die Zutaten 'springen'. Diese schnelle Methode erzeugt Röstaromen, ohne die Zutaten zu trocken zu machen.",
        difficulty = 1,
        funFact = "Sautieren ist die Basis vieler asiatischer Wok-Gerichte: hohe Hitze, wenig Fett, ständige Bewegung. Der Wok ist ideal dafür, weil seine geschwungene Form das Schwenken und Werfen von Zutaten erleichtert."
    ),

    // Question 48 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Wasserbad' (Bain-Marie) beim Backen oder Kochen?",
        answerA = "Ein Topf mit Wasser, der auf dem Herd steht und Dampf für den Ofen liefert",
        answerB = "Das Einweichen von Hülsenfrüchten in Wasser vor dem Kochen",
        answerC = "Das Abkühlen von heißem Essen in kaltem Wasser",
        answerD = "Ein Gefäß mit Zutaten, das in heißes Wasser gestellt wird, damit es schonend erwärmt wird",
        correctAnswer = 3,
        explanation = "Beim Wasserbad (Bain-Marie) stellt man ein Gefäß mit der zu erhitzenden Masse in ein größeres Gefäß mit heißem Wasser. Das Wasser überträgt die Wärme gleichmäßig und sanft – perfekt für Schokolade schmelzen, Soßen warmhalten oder zarte Käsekuchen backen.",
        difficulty = 1,
        funFact = "Der Begriff 'Bain-Marie' (Marienbad) soll auf Maria von Ägypten zurückgehen, eine mittelalterliche Alchimistin, die diese sanfte Erhitzungsmethode für ihre Experimente entwickelte. Heute ist es eine Standardtechnik in der Feinküche."
    ),

    // Question 49 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Welche Messerform ist für das Hacken von Kräutern am besten geeignet?",
        answerA = "Ein großes Kochmesser mit breiter Klinge und wiegendem Schnitt",
        answerB = "Ein dünnes Filetiermesser",
        answerC = "Ein gezahntes Brotmesser",
        answerD = "Ein kleines Schälmesser",
        correctAnswer = 0,
        explanation = "Für das Hacken von Kräutern ist ein großes Kochmesser ideal. Die Technik: Die Spitze des Messers bleibt auf dem Brett, der Griff wird auf und ab bewegt (Wiegebewegung). Die breite Klinge verhindert, dass Kräuterstücke wegfliegen.",
        difficulty = 1,
        funFact = "Profis hacken Kräuter mit einer Mezzaluna (Wiegemesser): einem halbmondförmigen Messer mit zwei Griffen, das wie eine Wiege hin und her bewegt wird. Es funktioniert besonders gut für größere Mengen Petersilie, Basilikum und Schnittlauch."
    ),

    // Question 50 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist die einfachste Methode, um festzustellen, ob eine Pfanne heiß genug zum Braten ist?",
        answerA = "Die Hand direkt über die Pfanne halten und die Wärme spüren",
        answerB = "Einen Tropfen Wasser in die Pfanne geben – er sollte sofort verdampfen und tanzen",
        answerC = "Mit dem Finger kurz die Pfanne berühren",
        answerD = "Öl hineingeben und warten bis es leicht schwarz wird",
        correctAnswer = 1,
        explanation = "Der Wassertest ist der klassische Küchentrick: Einen kleinen Wassertropfen in die Pfanne geben. Verdampft er sofort und tanzt als kleiner Ball auf dem Pfannenboden (Leidenfrost-Effekt), ist die Pfanne heiß genug. Bei zu niedriger Temperatur bleibt das Wasser als stiller Tropfen.",
        difficulty = 1,
        funFact = "Das 'tanzende Wasser' erklärt der Leidenfrost-Effekt: Bei sehr hoher Temperatur bildet sich unter dem Wassertropfen eine isolierende Dampfschicht, auf der er schwebt und gleitet wie auf einem Luftkissen – deshalb verdampft er paradoxerweise langsamer als auf einer etwas kühleren Pfanne."
    ),

)
