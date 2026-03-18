package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun animalQuestionsHard6(): List<Question> = listOf(

    // HARD (difficulty = 3) -- Evolution und Artenschutz

    Question(
        categoryId = 9,
        questionText = "Welches Prinzip beschreibt die unabhaengige Entstehung aehnlicher Merkmale in nicht verwandten Tiergruppen?",
        answerA = "Divergente Evolution",
        answerB = "Parallelevolution",
        answerC = "Konvergente Evolution",
        answerD = "Koevolution",
        correctAnswer = 2,
        explanation = "Konvergente Evolution beschreibt die unabhaengige Entstehung aehnlicher Strukturen oder Funktionen in phylogenetisch nicht verwandten Gruppen, z.B. Stromlinienform bei Haien und Delfinen.",
        difficulty = 3,
        funFact = "Der Thalassiodracon -- ein Ichthyosaurier -- und der heutige Delfin haben durch konvergente Evolution nahezu identische Koerperformen entwickelt, obwohl sie 200 Millionen Jahre trennen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter einem genetischen Flaschenhalseffekt in der Populationsgenetik?",
        answerA = "Zunahme genetischer Vielfalt durch Migration",
        answerB = "Starker Rueckgang einer Population mit Verlust genetischer Diversitaet",
        answerC = "Selektion bestimmter Allele durch Praedatoren",
        answerD = "Genaustausch zwischen zwei Arten",
        correctAnswer = 1,
        explanation = "Ein genetischer Flaschenhalseffekt tritt auf, wenn eine Population drastisch reduziert wird. Die ueberlebenden Individuen repraesentieren nur einen Bruchteil der urspruenglichen genetischen Vielfalt, was langfristige Folgen fuer die Anpassungsfaehigkeit hat.",
        difficulty = 3,
        funFact = "Der Nordliche Elefantenrobbe wurde im 19. Jahrhundert fast ausgerottet. Alle heutigen ca. 170.000 Tiere stammen von etwa 20 ueberlebenden Individuen ab."
    ),

    Question(
        categoryId = 9,
        questionText = "In welchen CITES-Anhang werden Arten eingestuft, deren Handel am strengsten reguliert ist?",
        answerA = "Anhang III",
        answerB = "Anhang II",
        answerC = "Anhang IV",
        answerD = "Anhang I",
        correctAnswer = 3,
        explanation = "CITES-Anhang I umfasst Arten, die vom Aussterben bedroht sind und bei denen jeglicher kommerzieller Handel verboten ist. Nur in Ausnahmefaellen werden wissenschaftliche oder Zuchtzwecke genehmigt.",
        difficulty = 3,
        funFact = "CITES wurde 1963 gegruendet und reguliert heute den Handel mit ueber 38.000 Tier- und Pflanzenarten weltweit."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche IUCN-Kategorie bezeichnet Arten, die in der Wildbahn ausgestorben sind, aber noch in Gefangenschaft existieren?",
        answerA = "CR (Critically Endangered)",
        answerB = "EX (Extinct)",
        answerC = "EW (Extinct in the Wild)",
        answerD = "RE (Regionally Extinct)",
        correctAnswer = 2,
        explanation = "EW (Extinct in the Wild) kennzeichnet Arten, die nur noch in Gefangenschaft, Kultivierung oder als naturalisierte Populationen ausserhalb ihres urspruenglichen Verbreitungsgebiets ueberleben.",
        difficulty = 3,
        funFact = "Das Przewalski-Pferd war als EW eingestuft und wurde durch intensive Zuchtprogramme erfolgreich in der Mongolei wiederangesiedelt."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt der Begriff 'Allopatrische Artbildung'?",
        answerA = "Artbildung durch sexuelle Selektion innerhalb einer Population",
        answerB = "Artbildung durch geografische Isolation getrennter Populationen",
        answerC = "Artbildung durch Polyploidisierung",
        answerD = "Artbildung ohne raeumliche Trennung im gleichen Lebensraum",
        correctAnswer = 1,
        explanation = "Bei der allopatrischen Artbildung werden Populationen einer Art durch geografische Barrieren wie Gebirge, Meere oder Fluesse getrennt. Durch unabhaengige Mutation und Selektion entwickeln sie sich zu eigenstaendigen Arten.",
        difficulty = 3,
        funFact = "Die Finken auf den Galapagos-Inseln, die Darwin beobachtete, sind ein klassisches Beispiel fuer allopatrische Artbildung und adaptive Radiation."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Konzept beschreibt die Abhaengigkeit zweier Arten voneinander, wobei beide sich gegenseitig beeinflussen und gemeinsam evolvieren?",
        answerA = "Mutualistischer Kommensalismus",
        answerB = "Koevolution",
        answerC = "Parasitismus",
        answerD = "Kompetitive Exklusion",
        correctAnswer = 1,
        explanation = "Koevolution bezeichnet den Prozess, bei dem zwei oder mehr Arten sich gegenseitig als Selektionsdruck beeinflussen und dadurch gemeinsam evolvieren. Ein klassisches Beispiel sind Bluetenpflanzen und ihre Bestaueber.",
        difficulty = 3,
        funFact = "Die Madagassische Orchidee Angraecum sesquipedale hat einen 30 cm langen Nektarsporn. Darwin sagte voraus, dass ein Schwaermer mit entsprechend langem Ruessel existieren muesse -- 41 Jahre spaeter wurde Xanthopan morganii praedicta entdeckt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Methode wird beim Wiederansiedlungsprogramm des Kalifornischen Kondors primaer eingesetzt, um Jungtiere auf die Wildnis vorzubereiten?",
        answerA = "Ausgeizung durch Futterentzug",
        answerB = "Aufzucht durch Handpuppen in Kondor-Form",
        answerC = "Freilassung ohne spezielle Konditionierung",
        answerD = "Cross-Fostering mit Truthahngeier-Eltern",
        correctAnswer = 1,
        explanation = "Um zu verhindern, dass sich Jungvoegel an Menschen gewoehnen (Praegung), werden sie mit Handpuppen aufgezogen, die den Kopf eines erwachsenen Kondors imitieren. So lernen sie, Kondore als ihre Artgenossen zu betrachten.",
        difficulty = 3,
        funFact = "1987 waren nur noch 27 Kalifornische Kondore am Leben. Heute gibt es dank intensiver Zuchtprogramme wieder ueber 500 Tiere, davon mehr als 300 in der Wildnis."
    ),

    Question(
        categoryId = 9,
        questionText = "Was bezeichnet man als 'Lebende Fossilien' in der Biologie?",
        answerA = "Versteinerte Ueberreste ausgestorbener Tier-Vorfahren",
        answerB = "Rezente Arten, die sich seit Hunderten von Millionen Jahren kaum veraendert haben",
        answerC = "Domestizierte Rassen mit urspruenglichem Phaenotyp",
        answerD = "Klonierte Exemplare ausgestorbener Arten",
        correctAnswer = 1,
        explanation = "Als lebende Fossilien bezeichnet man Organismen, die seit langer geologischer Zeit morphologisch weitgehend unveraendert geblieben sind und als einzige Vertreter urspruenglicher Linien gelten.",
        difficulty = 3,
        funFact = "Der Quastenflosser (Coelacanth) wurde 1938 lebend entdeckt, obwohl man dachte, er sei seit 65 Millionen Jahren ausgestorben. Er ist ein Verwandter der Vorfahren aller Landwirbeltiere."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche der fuenf grossen Massenaussterben der Erdgeschichte gilt als das groesste?",
        answerA = "Kreide-Palaeogen-Aussterben (vor 66 Millionen Jahren)",
        answerB = "Ordovizium-Silur-Aussterben (vor 444 Millionen Jahren)",
        answerC = "Perm-Trias-Aussterben (vor 252 Millionen Jahren)",
        answerD = "Devon-Aussterben (vor 375 Millionen Jahren)",
        correctAnswer = 2,
        explanation = "Das Perm-Trias-Massenaussterben, auch 'The Great Dying' genannt, war das groesste bekannte Massenaussterben. Bis zu 96% aller Meeresarten und 70% aller Landwirbeltierarten starben aus.",
        difficulty = 3,
        funFact = "Das Perm-Trias-Aussterben ebnete den Weg fuer die Vorherrschaft der Dinosaurier im Mesozoikum. Ohne dieses Ereignis haette die Evolution der Saeugetiere moeglicherweise nie stattgefunden."
    ),

    Question(
        categoryId = 9,
        questionText = "Welchen Effekt hatte die Wiederansiedlung von Woelfen im Yellowstone-Nationalpark ab 1995 auf das Oekosystem?",
        answerA = "Nur direkte Reduktion der Elchwildpopulation",
        answerB = "Keine messbare Auswirkung auf andere Tierarten",
        answerC = "Trophische Kaskade mit Regeneration der Vegetation und veraendertem Flussverlauf",
        answerD = "Verdraengung anderer Grossraubtiere ohne Vegetationsveraenderung",
        correctAnswer = 2,
        explanation = "Die Woelfe loesten eine trophische Kaskade aus: Elche verliessen bestimmte Bereiche, Vegetation erholte sich, Biberpopulationen wuchsen, Baeber wurden gebaut, Fluesse veraenderten ihren Verlauf. Dieses Phaenomen wird als 'Ecology of Fear' und geomorphologische Kaskade bezeichnet.",
        difficulty = 3,
        funFact = "Yellowstone-Forscher nennen dieses Phaenomen 'How Wolves Change Rivers'. Die Woelfe veraenderten sogar das Verhalten der Fluesse, indem sie indirekt Erosion und Sedimentation beeinflussten."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt das Konzept der 'Adaptiven Radiation'?",
        answerA = "Anpassung einer Art an radioaktive Umgebungen",
        answerB = "Schnelle Diversifizierung einer Abstammungslinie in viele oekologische Nischen",
        answerC = "Strahlungsabwehr-Mechanismen bei Tieren",
        answerD = "Langfristige Evolution ohne Aenderung des Grundbauplan",
        correctAnswer = 1,
        explanation = "Adaptive Radiation bezeichnet die schnelle evolutionaere Diversifizierung einer Abstammungslinie in viele verschiedene Formen, die unterschiedliche oekologische Nischen besetzen. Ausloesend ist haeufig ein neuer Lebensraum oder das Wegfallen von Konkurrenten.",
        difficulty = 3,
        funFact = "Nach dem Kreide-Aussterben erlebten Saugetiere eine explosive adaptive Radiation. Innerhalb von nur 10 Millionen Jahren entstanden die Vorlaeufer aller heutigen Saeugetierordnungen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Unterschied zwischen einer 'Schirmart' (Umbrella Species) und einer 'Schluesselart' (Keystone Species) im Naturschutz?",
        answerA = "Schirmarten haben groesseren Lebensraumbedarf; Schluessselarten haben ueberproportionalen oekologischen Einfluss",
        answerB = "Schirmarten sind kommerziell relevant; Schluesselarten haben wissenschaftlichen Wert",
        answerC = "Beide Begriffe sind Synonyme",
        answerD = "Schirmarten sind Raeuber; Schluesselarten sind Pflanzenfresser",
        correctAnswer = 0,
        explanation = "Schirmarten (z.B. Tigerbar) benoetigen grosse Lebensraeume, so dass ihr Schutz automatisch andere Arten mitschuetzt. Schluesselarten (z.B. Seeotter) haben einen ueberproportional grossen Einfluss auf ihr Oekosystem relativ zu ihrer Biomasse.",
        difficulty = 3,
        funFact = "Der Seeotter ist die klassische Schluesselart: Ohne ihn explodieren Seeigel-Populationen und fressen Kelpwaelder kahl, was ganze Oekosysteme zusammenbricht."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Mechanismus der natuerllichen Selektion beguenstigt seltene Varianten in einer Population?",
        answerA = "Gerichtete Selektion",
        answerB = "Stabilisierende Selektion",
        answerC = "Disruptive Selektion",
        answerD = "Frequenzabhaengige Selektion",
        correctAnswer = 3,
        explanation = "Bei der frequenzabhaengigen Selektion werden seltene Phaenotypen bevorzugt, weil sie z.B. schwerer von Praedatoren erkannt werden. Je seltener eine Variante wird, desto groesser ihr Selektionsvorteil -- ein stabilisierender Mechanismus fuer Polymorphismen.",
        difficulty = 3,
        funFact = "Beim Blauschmetterling Zerene eurydice bevorzugen Weibchen seltene Maennchenmuster, was dazu fuehrt, dass kein Farbmuster vollstaendig dominiert."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Kategorie des IUCN-Roten-Listen-Systems wird mit 'VU' abgekuerzt?",
        answerA = "Vom Aussterben bedroht (Endangered)",
        answerB = "Gering besorgniserregend (Least Concern)",
        answerC = "Gefaehrdet (Vulnerable)",
        answerD = "Stark gefaehrdet (Critically Endangered)",
        correctAnswer = 2,
        explanation = "VU steht fuer 'Vulnerable' (Gefaehrdet) und ist die dritte Gefaehrdungsstufe der IUCN-Roten Liste. Arten in dieser Kategorie sind noch nicht akut vom Aussterben bedroht, zeigen aber signifikante Rueckgaenge.",
        difficulty = 3,
        funFact = "Der Afrikanische Elefant wechselte 2021 von einer Kategorie zu zwei getrennten: Der Afrikanische Buschelefant ist 'Gefaehrdet' (VU), der Afrikanische Waldelefant ist 'Vom Aussterben bedroht' (CR)."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter dem 'Gruendungseffekt' (Founder Effect) in der Populationsgenetik?",
        answerA = "Genetische Drift durch eine kleine Gruenderpopulation in einem neuen Gebiet",
        answerB = "Evolution der ersten Landwirbeltiere aus dem Meer",
        answerC = "Dominanz von Gruendermutationen bei Krebserkrankungen",
        answerD = "Ausbreitung invasiver Arten durch menschlichen Transport",
        correctAnswer = 0,
        explanation = "Der Gruendungseffekt tritt auf, wenn eine kleine Gruppe von Individuen eine neue Population in einem bisher unbesiedelten Gebiet gruendet. Die genetische Zusammensetzung der Gruender, oft zufaellig vom Gesamtpool abweichend, bestimmt die genetische Vielfalt der neuen Population.",
        difficulty = 3,
        funFact = "Die Amish-Gemeinde in Pennsylvania zeigt den Gruendungseffekt: Bestimmte genetische Erkrankungen sind dort viel haeufiger als in der Allgemeinbevoelkerung, weil einige Gruender diese Allele trugen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie bezeichnet man die evolutionaere Anpassung, bei der Beutetiere Signale entwickeln, die Raeuber abschrecken?",
        answerA = "Kryptische Faerbung",
        answerB = "Aposematismus",
        answerC = "Batessche Mimikry",
        answerD = "Muellerssche Mimikry",
        correctAnswer = 1,
        explanation = "Aposematismus bezeichnet die Warnfaerbung oder Warnsignale bei Tieren, die Praedatoren von Angriff abschrecken sollen. Die auffaelligen Muster signalisieren Giftigkeit oder Ungeniessbarkkeit.",
        difficulty = 3,
        funFact = "Pfeilgiftfrosche sind das klassische Beispiel fuer Aposematismus: Ihre leuchtenden Farben warnen Raeuber vor ihrem potentiell toedlichen Hautsekret."
    ),

    Question(
        categoryId = 9,
        questionText = "Was unterscheidet Muellerssche Mimikry von Bates'scher Mimikry?",
        answerA = "Bei Mueller ahmen mehrere giftige Arten einander nach; bei Bates ahmt eine harmlose Art eine giftige nach",
        answerB = "Mueller bezieht sich auf Pflanzen; Bates auf Tiere",
        answerC = "Bei Mueller ist die Aehnlichkeit zufaellig; bei Bates evolutionaer bedingt",
        answerD = "Mueller gilt fuer Insekten; Bates fuer Wirbeltiere",
        correctAnswer = 0,
        explanation = "Bei der Muellerschen Mimikry ahmen mehrere giftige oder ungeniessbarre Arten einander in Aussehen oder Signal nach, zum gegenseitigen Vorteil. Bei der Batesschen Mimikry ahmt eine harmlose Art eine giftige nach und profitiert einseitig.",
        difficulty = 3,
        funFact = "Viele tropische Schmetterlingsgattungen wie Heliconius zeigen Muellerssche Mimikry: Unverwandte giftige Arten haben konvergent nahezu identische Fluegelzeichnungen entwickelt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Konzept beschreibt, dass nicht alle Merkmale eines Organismus direkte Anpassungen sind, sondern Nebenprodukte anderer Selektionsprozesse?",
        answerA = "Exaptation",
        answerB = "Spandrel-Konzept (Zwickel)",
        answerC = "Neutralistische Evolution",
        answerD = "Saltationismus",
        correctAnswer = 1,
        explanation = "Das Spandrel-Konzept von Gould und Lewontin (1979) besagt, dass manche Merkmalee (Spandrels) Nebenprodukte anderer Anpassungen sind, keine eigenen Adaptationen. Der Begriff kommt aus der Architektur: Zwickel entstehen als geometrische Konsequenz beim Bau von Boegen.",
        difficulty = 3,
        funFact = "Gould und Lewontin verwendeten die Zwickel des Markus-Doms in Venedig als Metapher: Diese dekorativen Dreiecke wurden nicht entworfen, sondern entstanden zwingend aus der Bogenkonstruktion."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Programm hat den Arabischen Oryx erfolgreich in die Wildnis zurueckgebracht?",
        answerA = "WWF Recovery Programme Arabia",
        answerB = "Operation Oryx, initiiert vom Fauna Preservation Society",
        answerC = "IUCN Arabian Peninsula Restoration Initiative",
        answerD = "CITES Appendix I Reintroduction Scheme",
        correctAnswer = 1,
        explanation = "Operation Oryx wurde 1962 von der Fauna Preservation Society initiiert. Die letzten wild lebenden Arabischen Oryxe wurden in Gefangenschaft genommen, gezuechtet, und ab 1982 erfolgreich in Oman wiederangesiedelt. Es war das erste erfolgreiche Wiederansiedlungsprogramm einer in der Wildnis ausgestorbenen Art.",
        difficulty = 3,
        funFact = "Der Arabische Oryx war 1972 in der Wildnis ausgestorben -- die erste Tierart im 20. Jahrhundert, die durch ein gezieltes Zuchtprogramm aus dem Aussterben gerettet und wieder ausgewildert wurde."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter 'Punktualismus' (Punctuated Equilibrium) in der Evolutionstheorie?",
        answerA = "Gleichmaessiger, langsamer evolutionaerer Wandel ueber alle Zeitraeume",
        answerB = "Lange Phasen der Stabilitaet unterbrochen von kurzen Perioden schnellen evolutionaeren Wandels",
        answerC = "Sprungartige Mutationen ohne Zwischenstufen",
        answerD = "Periodische Massenaussterben gefolgt von neuer Artbildung",
        correctAnswer = 1,
        explanation = "Das Konzept des Punktualismus, von Eldredge und Gould (1972) formuliert, besagt, dass Arten lange in stabilem Zustand verbleiben (Stase) und evolutionaerer Wandel hauptsaechlich in kurzen, intensiven Phasen stattfindet, oft verbunden mit Artbildungsereignissen.",
        difficulty = 3,
        funFact = "Das Modell erklaert Luecken im Fossilbericht: Wenn Evolution hauptsaechlich in kleinen, isolierten Populationen stattfindet, hinterlaesst sie kaum Fossilien, da die Chance auf Fossilisierung gering ist."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Selektionsform beguenstigt den Durchschnittsphaenotyp und wirkt extremen Varianten entgegen?",
        answerA = "Disruptive Selektion",
        answerB = "Gerichtete Selektion",
        answerC = "Stabilisierende Selektion",
        answerD = "Sexuelle Selektion",
        correctAnswer = 2,
        explanation = "Stabilisierende Selektion wirkt gegen extreme Phaenotypen und bevorteilt den mittleren, optimalen Bereich. Sie reduziert die Variabilitaet in einer Population und ist die haeufigste Form der Selektion in stabilen Umgebungen.",
        difficulty = 3,
        funFact = "Menschliche Geburtsgewichte zeigen stabilisierende Selektion: Sowohl zu leichte als auch zu schwere Neugeborene haben hoehere Sterblichkeit, der Mittelbreich hat den groessten Ueberlebensvorteil."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Hauptunterschied zwischen Ex-situ- und In-situ-Artenschutz?",
        answerA = "Ex-situ ist kurzfristig; In-situ ist langfristig",
        answerB = "Ex-situ schutzt Arten ausserhalb ihres natuerlichen Lebensraums; In-situ im natuerlichen Lebensraum",
        answerC = "Ex-situ gilt fuer Pflanzen; In-situ fuer Tiere",
        answerD = "Ex-situ umfasst gesetzliche Massnahmen; In-situ praktische Eingriffe",
        correctAnswer = 1,
        explanation = "Ex-situ-Artenschutz (ausserhalb des natuerlichen Lebensraums) umfasst Zoos, Genbanken und Zuchtprogramme. In-situ-Artenschutz (im natuerlichen Lebensraum) umfasst Schutzgebiete, Habitatmanagement und direkte Bestandsschutzmaessnahmen vor Ort.",
        difficulty = 3,
        funFact = "Die Svalbard Global Seed Vault im Arktis ist das groesste Ex-situ-Erhaltungsprojekt der Welt und lagert ueber 1,3 Millionen Saatgutproben als Versicherung gegen globale Katastrophen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Art gilt als erstes dokumentiertes Aussterben eines Saeugetiers durch menschliche Jagd?",
        answerA = "Blausteller (Raphus cucullatus)",
        answerB = "Stellersche Seekuh (Hydrodamalis gigas)",
        answerC = "Quagga (Equus quagga quagga)",
        answerD = "Tasmanischer Tiger (Thylacinus cynocephalus)",
        correctAnswer = 1,
        explanation = "Die Stellersche Seekuh wurde 1768, nur 27 Jahre nach ihrer wissenschaftlichen Entdeckung 1741 durch Georg Wilhelm Steller, ausgerottet. Seefahrer jagten sie massiv als Fleischquelle. Sie ist damit das bekannteste Beispiel fuer schnelles Aussterben durch direkte menschliche Bejagung.",
        difficulty = 3,
        funFact = "Die Stellersche Seekuh war enorm: bis zu 8 Meter lang und 10 Tonnen schwer. Sie lebte nur noch auf den Kommandeurinseln im Beringmeer und war bereits vor menschlichem Kontakt stark dezimiert."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt der Begriff 'Evolutionaere Rueckbildung' oder 'Atavismus'?",
        answerA = "Voellige Rueckentwicklung einer Art zu ihrem Vorfahren",
        answerB = "Wiederauftauchen eines Merkmals, das bei Vorfahren vorhanden war, aber in der Linie verschwunden ist",
        answerC = "Verlust funktioneller Organe durch Nichtgebrauch",
        answerD = "Genetische Drift in isolierten Populationen",
        correctAnswer = 1,
        explanation = "Ein Atavismus ist das Wiederauftreten eines ancestralen Merkmals, das bei direkten Vorfahren vorhanden war, aber im Laufe der Evolution zurueckgebildet oder ungenuetzt wurde. Das zugrunde liegende Genprogramm bleibt latent erhalten.",
        difficulty = 3,
        funFact = "Wale koennen gelegentlich mit rudimentaeren Hinterbeinen geboren werden -- ein Atavismus, der an ihre landlebenden Vorfahren erinnert. Auch Menschen zeigen selten einen kokcygealen Anhang (Schwanzansatz)."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Mechanismus kann zu rapider Evolution fuehren, ohne dass Selektionsdruck noetig ist?",
        answerA = "Mutagene Selektion",
        answerB = "Genetische Drift",
        answerC = "Gerichtete Adaptation",
        answerD = "Hybridisierung",
        correctAnswer = 1,
        explanation = "Genetische Drift ist zufaellige Veraenderung von Allelfrequenzen in einer Population, unabhaengig von deren Fitness. In kleinen Populationen kann Drift starke evolutionaere Veraenderungen verursachen, auch wenn keine Selektion stattfindet.",
        difficulty = 3,
        funFact = "Der Cheetah hat extrem geringe genetische Diversitaet -- ein Haut-Transplantat von einem fremden Cheetah wird nicht abgestossen. Dies ist eine Folge eines Flaschenhalses vor etwa 10.000-12.000 Jahren."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Unterschied zwischen Homologie und Analogie bei Koerperstrukturen?",
        answerA = "Homologe Strukturen haben gleiche Funktion; analoge Strukturen gemeinsame Abstammung",
        answerB = "Homologe Strukturen haben gemeinsame evolutionaere Abstammung; analoge Strukturen aehnliche Funktion, aber verschiedene Herkunft",
        answerC = "Homologie gilt fuer Pflanzen; Analogie fuer Tiere",
        answerD = "Homologe Strukturen sind immer sichtbar; analoge immer vestigial",
        correctAnswer = 1,
        explanation = "Homologe Strukturen haben gemeinsame Abstammung (z.B. Menschenarm und Walvorderflosse), koennen aber verschiedene Funktionen haben. Analoge Strukturen haben aehnliche Funktion (z.B. Vogelflugel und Insektenflugel), stammen aber nicht von einem gemeinsamen Vorfahren ab.",
        difficulty = 3,
        funFact = "Der Daumen des Grossen Pandas ist kein echter Daumen, sondern ein vergroesserter Radialsesambein (Handgelenkknochen). Er ist analog zum menschlichen Daumen, ermoeglicht aber das Greifen von Bambus."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Konzept beschreibt den minimalen Bestand, den eine Population benoetigt, um langfristig zu ueberleben?",
        answerA = "Effektive Populationsgroesse (Ne)",
        answerB = "Minimale Viable Population (MVP)",
        answerC = "Demographischer Puffer",
        answerD = "Genetischer Flaschenhals-Schwellenwert",
        correctAnswer = 1,
        explanation = "Die Minimale Viable Population (MVP) ist die kleinste Populationsgroesse, bei der eine Art mit einer bestimmten Wahrscheinlichkeit (oft 95%) fuer einen bestimmten Zeitraum (oft 100-1000 Jahre) ueberleben kann. Sie beruecksichtigt genetische, demographische und Umweltstochastizitaet.",
        difficulty = 3,
        funFact = "Fuer die meisten Saeugetiere liegt die MVP bei 500-1000 Individuen. Der Norden-Breitmaulnashorn hat nur noch 2 ueberlebende Weibchen -- weit unter jeder MVP."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter 'Exaptation' in der Evolutionstheorie?",
        answerA = "Rueckentwicklung von nicht mehr benoetigen Organen",
        answerB = "Nutzung eines Merkmals fuer eine neue Funktion, fuer die es urspruenglich nicht entstanden ist",
        answerC = "Anpassung an extreme Umgebungen wie Tiefsee oder Wueste",
        answerD = "Parallele Entwicklung identischer Merkmale in verschiedenen Linien",
        correctAnswer = 1,
        explanation = "Exaptation bezeichnet die evolutionaere Umdeutung eines Merkmals fuer eine neue Funktion. Das Merkmal hat sich urspruenglich fuer eine andere Funktion entwickelt (oder hatte keine Funktion) und wird spaeter anders genutzt.",
        difficulty = 3,
        funFact = "Vogelfedern sind ein klassisches Exaptations-Beispiel: Sie entstanden vermutlich urspruenglich zur Thermoregulation, wurden spaeter als Exaptation fuer den Flug umgedeutet."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Schutzprogramm rettet den Schwarzfussiltis (Mustela nigripes) in Nordamerika?",
        answerA = "USFWS Black-footed Ferret Recovery Program",
        answerB = "WWF Prairie Dog Alliance",
        answerC = "Nature Conservancy Grassland Initiative",
        answerD = "Smithsonian Ferret Rescue Program",
        correctAnswer = 0,
        explanation = "Das Black-footed Ferret Recovery Program des US Fish and Wildlife Service ist eines der erfolgreichsten Wiederherstellungsprogramme Nordamerikas. Der Schwarzfussiltis galt 1979 als ausgestorben, wurde 1981 wiederentdeckt und durch Gefangenschaftszucht gerettet.",
        difficulty = 3,
        funFact = "1987 wurden alle 18 verbleibenden Schwarzfussiltisse in Gefangenschaft genommen. Heute gibt es dank des Zuchtprogramms wieder ueber 300 wildlebende Tiere in mehreren Bundesstaaten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Prozess erklaert, warum Inselarten haeufig groesser oder kleiner werden als ihre Festlandsvorfahren?",
        answerA = "Inselbiogeographische Sukzession",
        answerB = "Insulare Zwergwuchs- oder Riesenbildung (Inselregel nach Foster)",
        answerC = "Oekologische Drift durch reduzierte Artenvielfalt",
        answerD = "Thermische Adaptation an Inselklima",
        correctAnswer = 1,
        explanation = "Die Inselregel (Foster's Rule) besagt, dass Grossaeuger auf Inseln zur Zwergwuchs neigen (weniger Ressourcen, kein Raubtierrdruck) waehrend Kleintiere oft groesser werden. Dieses Phaenomen ist durch veraenderten Selektionsdruck auf Inseln erklaerbar.",
        difficulty = 3,
        funFact = "Homo floresiensis, der 'Hobbit-Mensch' von Flores, war moeglicherweise ein Zwergmensch durch Inseldwarfismus. Auch der ausgestorbene Zwergelefant Palaeoloxodon falconeri auf Malta war nur 90 cm gross."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Art ist das Flaggschiff des Schutzprogramms 'Save Our Species' der IUCN fuer Grosskatzen?",
        answerA = "Sibirischer Tiger (Panthera tigris altaica)",
        answerB = "Schneeleopard (Panthera uncia)",
        answerC = "Irbis und Tiger gleichermassen",
        answerD = "Amur-Leopard (Panthera pardus orientalis)",
        correctAnswer = 3,
        explanation = "Der Amur-Leopard (Panthera pardus orientalis) gilt als die am staerksten bedrohte Grosskatze der Welt. Er war zeitweise auf unter 30 wildlebende Individuen reduziert. Intensive Schutzmassnahmen in Russland und China haben den Bestand inzwischen auf ueber 100 Tiere erhoehen koennen.",
        difficulty = 3,
        funFact = "Der Amur-Leopard ist der einzige Leopard, der sich an extreme Kaeltetemperaturen angepasst hat. Sein dicker Winterpelz und seine breiten Pfoten sind Adaptationen an den schneebedeckten russischen Fern-Osten."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt der Begriff 'Hybridzone' in der Evolutionsbiologie?",
        answerA = "Zone maximaler Artenvielfalt in tropischen Regenwaeldern",
        answerB = "Gebiet, in dem zwei Arten oder Unterarten sich treffen und Hybriden bilden koennen",
        answerC = "Uebergangsgebiet zwischen zwei Klimazonen",
        answerD = "Genetisch veraenderter Lebensraum durch menschlichen Einfluss",
        correctAnswer = 1,
        explanation = "Eine Hybridzone ist ein geographisches Gebiet, in dem zwei genetisch unterschiedliche Populationen oder Arten zusammentreffen und Hybriden produzieren. Sie sind wichtig fuer das Studium der Artbildung und genetischen Introgression.",
        difficulty = 3,
        funFact = "In der Yellowstone-Region kreuzen sich Rotwoelfe und Kojoten. Die entstandenen Hybriden erschweren den Artenschutz, da der pure Rotwolf genetisch kaum noch zu finden ist."
    ),

    Question(
        categoryId = 9,
        questionText = "Welchen Begriff verwendet man fuer Arten, deren Praesenz oder Fehlen den Zustand eines Oekosystems anzeigt?",
        answerA = "Flaggschiffart",
        answerB = "Schirmart",
        answerC = "Indikatorart",
        answerD = "Keystone-Art",
        correctAnswer = 2,
        explanation = "Indikatorarten reagieren empfindlich auf Veraenderungen in ihrem Lebensraum und koennen als biologischer Zeiger fuer den Oekosystemzustand dienen. Ihr Vorkommen oder Fehlen zeigt die Umweltqualitaet an.",
        difficulty = 3,
        funFact = "Flechten sind bekannte Indikatorarten fuer Luftqualitaet: Bestimmte empfindliche Arten verschwinden zuerst bei Luftverschmutzung. In Industriegebieten existieren oft nur wenige robuste Flechtenarten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Prozess ermoeglicht Artbildung, ohne dass eine geografische Trennung der Populationen noetig ist?",
        answerA = "Allopatrische Artbildung",
        answerB = "Peripatrische Artbildung",
        answerC = "Sympatrische Artbildung",
        answerD = "Parapatrische Artbildung",
        correctAnswer = 2,
        explanation = "Bei der sympatrischen Artbildung entstehen neue Arten innerhalb desselben geografischen Gebiets ohne raeumliche Trennung. Moegliche Mechanismen sind oekologische Speziation durch Nischendifferenzierung oder Polyploidisierung.",
        difficulty = 3,
        funFact = "Cichliden im Viktoriasee sind ein Paradebeispiel: Ueber 500 Arten entstanden in relativ kurzer geologischer Zeit im gleichen See durch sympatrische Artbildung, hauptsaechlich getrieben durch sexuelle Selektion auf Farbe."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches internationale Abkommen regelt den Handel mit bedrohten Tier- und Pflanzenarten?",
        answerA = "CBD (Convention on Biological Diversity)",
        answerB = "CITES (Convention on International Trade in Endangered Species)",
        answerC = "RAMSAR (Feuchtgebietskonvention)",
        answerD = "Nagoya-Protokoll",
        correctAnswer = 1,
        explanation = "CITES (Convention on International Trade in Endangered Species of Wild Fauna and Flora) ist ein internationales Abkommen, das den Handel mit gefaehrdeten Arten kontrolliert und reguliert. Es wurde 1973 unterzeichnet und hat heute 183 Mitgliedstaaten.",
        difficulty = 3,
        funFact = "CITES reguliert nicht nur lebende Tiere, sondern auch Produkte daraus -- Elfenbein, Haifischflossen, Pelze. Verstosser koennen mit Handelsverboten belegt werden."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter 'Vikariance' als Ursache biogeografischer Muster?",
        answerA = "Aktive Ausbreitung von Arten ueber geografische Barrieren",
        answerB = "Fragmentierung einst zusammenhaengender Populationen durch geologische Ereignisse",
        answerC = "Einwanderung neuer Arten durch Klimawandel",
        answerD = "Konkurrenz zwischen einheimischen und invasiven Arten",
        correctAnswer = 1,
        explanation = "Vikariance beschreibt die Trennung einst zusammenhaengender Populationen oder Lebensraeume durch geologische Ereignisse wie Kontinentaldrift, Gebirgsbildung oder Meerespiegelveraenderungen. Dies fuehrt zur Isolation und oft zur Artbildung.",
        difficulty = 3,
        funFact = "Das Auseinanderdriften von Gondwana erklaert, warum Suedamerika, Afrika, Australien und Neuseeland so viele verwandte, aber unterschiedliche Tiergruppen haben, wie Strausse, Nandus, Emus und Kiwis."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Tiergruppe gilt als die am staerksten bedrohte Wirbeltierklasse laut IUCN?",
        answerA = "Suesswaasserfische",
        answerB = "Reptilien",
        answerC = "Amphibien",
        answerD = "Voegel",
        correctAnswer = 2,
        explanation = "Amphibien sind die am staerksten bedrohte Wirbeltierklasse: Ueber 40% aller bekannten Amphibienarten gelten als gefaehrdet. Hauptursachen sind Lebensraumverlust, der Chytridpilz Batrachochytrium dendrobatidis, Klimawandel und UV-Strahlung.",
        difficulty = 3,
        funFact = "Der Chytridpilz Bd hat bis 2019 zum Aussterben oder starkem Rueckgang von mindestens 501 Amphibienarten gefuehrt -- das groesste dokumentierte Aussterben durch einen einzigen Krankheitserreger."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt das Konzept der 'Red Queen Hypothesis' in der Evolutionsbiologie?",
        answerA = "Weibchen waehlen den staerksten Maennchen",
        answerB = "Staendige evolutionaere Anpassung noetig, nur um den Status quo zu erhalten",
        answerC = "Koeniginnen bestimmen Evolutionsrichtung bei eussozialen Insekten",
        answerD = "Sexuelle Selektion uebertrifft natuerliche Selektion",
        correctAnswer = 1,
        explanation = "Die Red Queen Hypothesis (van Valen, 1973) besagt, dass Organismen sich staendig weiterentwickeln muessen, um im Rennen mit Parasiten, Krankheiten und Konkurrenten nicht zurueckzufallen. Wie Alice und der Roten Koenigin in Alice im Wunderland: Man muss schnell laufen, nur um an Ort zu bleiben.",
        difficulty = 3,
        funFact = "Die Red Queen Hypothesis erklaert, warum sexuelle Reproduktion so weit verbreitet ist: Durch Rekombination entstehen staendig neue Genotypen, die Parasiten nicht so leicht attackieren koennen wie genetisch identische Klone."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Gen-Rescue-Programm versucht, das ausgestorbene Mammut zurueckzubringen?",
        answerA = "Revive & Restore mit CRISPR-Cas9 Genomediting",
        answerB = "Jurassic Park Initiative der Stanford University",
        answerC = "Mammoth Revival Project der IUCN",
        answerD = "Cryogenic Revival Initiative des MIT",
        correctAnswer = 0,
        explanation = "Das Unternehmen Colossal Biosciences und die Organisation Revive & Restore nutzen CRISPR-Cas9, um Mammut-Gene in das Genom des Asiatischen Elefanten einzufuegen. Ziel ist ein kaelteangepasster Elefant, der als Mammut-Proxy in der Arktis leben koennte.",
        difficulty = 3,
        funFact = "Mammuts und Asiatische Elefanten sind zu 99,6% genetisch identisch. Die Forscher muessen nur etwa 50 Schluessengene fuer Kaltanpassung (Haare, Fett, Haemoglobin) einfuegen, um einen 'Mammut-Elefanten' zu erzeugen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Selektionsform bevorzugt extreme Phaenotypen und kann zur Artaufspaltung fuehren?",
        answerA = "Stabilisierende Selektion",
        answerB = "Gerichtete Selektion",
        answerC = "Disruptive Selektion",
        answerD = "Sexuelle Selektion",
        correctAnswer = 2,
        explanation = "Disruptive (divergente) Selektion beguenstigt extreme Phaenotypen an beiden Enden der Verteilung und wirkt gegen den Durchschnitt. Sie kann zur bimodalen Verteilung in einer Population und letztendlich zur Artaufspaltung fuehren.",
        difficulty = 3,
        funFact = "Bei Grosbeaks in den Galapagos zeigte sich disruptive Selektion: Voegel mit sehr kleinem oder sehr grossem Schnabel hatten hoehere Fitness als Voegel mit mittlerer Schnabelgroesse, weil sie unterschiedliche Nahrungsquellen effizienter nutzen konnten."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das Ziel des 'Debt-for-Nature Swap' im Artenschutz?",
        answerA = "Finanzierung von Zoos durch Umschuldung entwickelter Laender",
        answerB = "Schuldenerlass fuer Entwicklungslaender im Austausch fuer Naturschutzmassnahmen",
        answerC = "Handel mit Kohlenstoffzertifikaten fuer Artenschutz-Projekte",
        answerD = "Direktzahlungen an Landbesitzer fuer Habitaterhalt",
        correctAnswer = 1,
        explanation = "Bei einem Debt-for-Nature Swap erlaesst ein Glaeubiger (haeufig Industrielaender oder NGOs) einem Entwicklungsland einen Teil seiner Auslandsschulden, wenn dieses Land im Gegenzug in Naturschutz investiert oder Schutzgebiete ausweist.",
        difficulty = 3,
        funFact = "Der erste Debt-for-Nature Swap wurde 1987 von Conservation International in Bolivien durchgefuehrt: 650.000 Dollar Schulden wurden gegen Schutz von 1,5 Millionen Hektar Tropenwald getauscht."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt der Begriff 'Refugium' in der Biogeografie und Artenschutzbiologie?",
        answerA = "Schutzgebiet, das von der EU als besonders schutzenswert anerkannt ist",
        answerB = "Gebiet, das waehrend klimatischer Extremereignisse als Rueckzugsraum fuer Arten diente",
        answerC = "Kuenstlich angelegter Lebensraum als Ersatz fuer zerstoerte Habitate",
        answerD = "Isolierte Inselpopulation ohne Verbindung zum Festland",
        correctAnswer = 1,
        explanation = "Ein Refugium ist ein Gebiet, das waehrend Klimaextremereignissen (z.B. Eiszeiten) stabile Bedingungen bot und als Rueckzugsraum fuer Arten diente. Von diesen Gebieten aus besiedelten Arten nach Klimaverbesserung wieder groessere Areale.",
        difficulty = 3,
        funFact = "Die Iberische Halbinsel, der Balkan und der Kaukasus waren waehrend der letzten Eiszeit wichtige Refugien fuer europaeische Waelder. Die heute in Europa lebenden Buchen stammen hauptsaechlich von Populationen aus diesen Refugien ab."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Begriff beschreibt den kurzfristigen Selektionsvorteil, der durch ueber-repraesentierte Phaenotypen in einer Population entsteht?",
        answerA = "Heterozygoten-Vorteil",
        answerB = "Positive frequenzabhaengige Selektion",
        answerC = "Evolutionsstabile Strategie",
        answerD = "Overdominanz",
        correctAnswer = 0,
        explanation = "Der Heterozygoten-Vorteil (Heterosis oder Overdominanz) bezeichnet den Fall, in dem Individuen mit zwei verschiedenen Allelen (Heterozygote) eine hoehere Fitness aufweisen als Individuen mit zwei gleichen Allelen (Homozygote).",
        difficulty = 3,
        funFact = "Sichelzellanaemie ist ein bekanntes Beispiel: Traeger eines Sichelzell-Allels (Heterozygote) sind resistenter gegen Malaria als Homozygote ohne das Allel, weshalb das Allel in Malaria-Endemiegebieten erhalten bleibt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Konzept erklaert die Entstehung von Mitochondrien durch Einverleibung eines Bakteriums in eine Wirtszelle?",
        answerA = "Virogenese",
        answerB = "Horizontaler Gentransfer",
        answerC = "Endosymbiontentheorie",
        answerD = "Zellulare Adaption",
        correctAnswer = 2,
        explanation = "Die Endosymbiontentheorie (Lynn Margulis, 1967) besagt, dass Mitochondrien und Chloroplasten urspruenglich freilebende Bakterien waren, die in Wirtszellen aufgenommen wurden und eine symbiotische Beziehung eingingen. Diese Theorie ist heute durch Genomanalysen bewiesen.",
        difficulty = 3,
        funFact = "Mitochondrien haben noch immer ihre eigene DNA (mtDNA), reproduzieren sich durch Zweiteilung wie Bakterien und besitzen doppelte Membranen, die auf ihre bakterielle Herkunft hinweisen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Konzept beschreibt die evolutionaere Stabilisierung eines bestimmten Verhaltens in einer Population?",
        answerA = "Nash-Gleichgewicht",
        answerB = "Evolutionaer Stabile Strategie (ESS)",
        answerC = "Altruistisches Gleichgewicht",
        answerD = "Reziproke Kooperation",
        correctAnswer = 1,
        explanation = "Eine Evolutionaer Stabile Strategie (ESS, Maynard Smith und Price, 1973) ist eine Strategie, die, wenn sie von einer Population adoptiert wird, nicht durch eine alternative Strategie ersetzt werden kann. Es ist ein evolutionaeres Gleichgewicht, das der Spieltheorie entstammt.",
        difficulty = 3,
        funFact = "Das Hawk-Dove-Spiel von Maynard Smith zeigt: Eine reine Tauben-Strategie (nie kaempfen) ist instabil, weil Adler-Strategisten (immer kaempfen) sie ausnutzen. Die ESS ist eine gemischte Strategie mit einem bestimmten Verhaeltnis beider Typen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Zooprogramm hat massgeblich zur Rettung des Kalifornischen Kondors beigetragen?",
        answerA = "San Diego Zoo und Los Angeles Zoo im Rahmen des USFWS Condor Recovery Program",
        answerB = "Smithsonian National Zoo allein",
        answerC = "Bronx Zoo in Kooperation mit dem WWF",
        answerD = "San Francisco Zoo und Yosemite National Park",
        correctAnswer = 0,
        explanation = "Der San Diego Zoo und der Los Angeles Zoo waren die Hauptakteure des California Condor Recovery Program, das vom US Fish and Wildlife Service koordiniert wird. Sie zuchteten die letzten Kondore in Gefangenschaft und entwickelten die Handpuppen-Aufzucht-Technik.",
        difficulty = 3,
        funFact = "Der Kalifornische Kondor hat eine Flugelspannweite von 3 Metern und kann 1000 Jahre alt werden -- nein, knapp 60 Jahre. Er kann ohne Fluegelbewegung stundenlang in Thermiksaeulchen gleiten."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Introgression' in der Evolutionsbiologie?",
        answerA = "Einwanderung neuer Gene durch Migration",
        answerB = "Transfer von genetischem Material zwischen Arten durch Hybridisierung und Rueckkreuzung",
        answerC = "Horizontaler Gentransfer zwischen Prokaryoten",
        answerD = "Einschleusen von Transgenen in Wildpopulationen",
        correctAnswer = 1,
        explanation = "Introgression bezeichnet den Transfer von genetischem Material von einer Art in das Erbgut einer anderen Art, vermittelt durch Hybridisierung und anschliessende Rueckkreuzung der Hybriden mit einer der Elternarten.",
        difficulty = 3,
        funFact = "Menschen tragen ca. 1-4% Neandertaler-DNA durch Introgression. Diese enthaltenen Gene betreffen unter anderem Immunabwehr, Hautpigmentierung und Knochen-Dichte."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Selektionsmechanismus erklaert die Entwicklung aufwendiger Maennchen-Ornamente wie Pfauenschwanz oder Elchgeweihe?",
        answerA = "Natuerliche Selektion",
        answerB = "Intersexuelle Selektion (Fishers Runaway Selection)",
        answerC = "Stabilisierende Selektion",
        answerD = "Oekologische Selektion",
        correctAnswer = 1,
        explanation = "Fishers Runaway Selection erklaert extravagante Maennchenornamente: Wenn Weibchen einen bestimmten Merkmal bevorzugen, werden sowohl das Merkmal im Sohn als auch die Praeferenz in Toechtern selektiert, was zu einem sich selbst verstaerkenden evolutionaeren Prozess fuehrt.",
        difficulty = 3,
        funFact = "Elche zahlen einen enormen Preis fuer ihr Geweih: Bis zu 25 kg schwer, kostet es 20% ihrer taeglichen Energie allein zum Tragen. Dennoch ist es sexuell so vorteilhaft, dass es sich trotzdem entwickelt hat."
    ),

)
