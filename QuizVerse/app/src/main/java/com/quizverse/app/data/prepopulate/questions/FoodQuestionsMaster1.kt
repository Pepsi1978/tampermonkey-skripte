package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsMaster1(): List<Question> = listOf(

    // ── MAILLARD-REAKTION & LEBENSMITTELCHEMIE ────────────────────────────────

    // Question 1 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welche Zwischenverbindung entsteht in der Anfangsphase der Maillard-Reaktion aus der Reaktion eines reduzierenden Zuckers mit einer primären Aminogruppe?",
        answerA = "Amadori-Verbindung",
        answerB = "Heyns-Produkt",
        answerC = "Schiffsche Base",
        answerD = "Melanoidin",
        correctAnswer = 2,
        explanation = "Die Maillard-Reaktion beginnt mit der Kondensation des Aldehyds eines reduzierenden Zuckers mit der Aminogruppe einer Aminosäure zu einer Schiffschen Base (Aldiimin). Diese lagert sich anschließend zur stabileren Amadori-Verbindung um — die Schiffsche Base ist der direkte erste Schritt.",
        difficulty = 5,
        funFact = "Louis Camille Maillard beschrieb diese Reaktion bereits 1912, ihre volle Komplexität mit über 1.000 Reaktionsprodukten wurde erst Jahrzehnte später verstanden."
    ),

    // Question 2 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet die Amadori-Umlagerung von der Heyns-Umlagerung in der Maillard-Reaktion?",
        answerA = "Amadori betrifft Aldosen, Heyns betrifft Ketosen",
        answerB = "Amadori betrifft Ketosen, Heyns betrifft Aldosen",
        answerC = "Amadori läuft bei sauerem pH ab, Heyns bei alkalischem",
        answerD = "Beide beschreiben denselben Mechanismus bei verschiedenen Temperaturen",
        correctAnswer = 0,
        explanation = "Bei der Amadori-Umlagerung reagiert eine Aldose (z.B. Glucose) mit einem Amin zu einem 1-Amino-1-Desoxy-2-ketose-Produkt. Die Heyns-Umlagerung beschreibt die analoge Reaktion mit Ketosen (z.B. Fructose), die ein 2-Amino-2-Desoxy-1-aldose-Produkt ergibt.",
        difficulty = 5,
        funFact = null
    ),

    // Question 3 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welches flüchtige Heterocyclus-Aroma entsteht bevorzugt bei der Maillard-Reaktion von Cystein mit Ribose und ist charakteristisch für Fleischgeschmack?",
        answerA = "Pyrazin",
        answerB = "2-Methyl-3-furanthiol",
        answerC = "Diacetyl",
        answerD = "Linalool",
        correctAnswer = 1,
        explanation = "2-Methyl-3-furanthiol (2-Methyl-3-furanethiol) ist ein schwefelhaltiges Furanthiol, das aus der Reaktion von Cystein mit Ribose entsteht. Es hat eine Geruchsschwelle von unter 0,01 ppb und ist der Schlüsselaromastoff für gekochtes Fleisch.",
        difficulty = 5,
        funFact = "2-Methyl-3-furanthiol ist so geruchsintensiv, dass ein einziger Tropfen einen ganzen Raum mit Fleischgeruch füllen würde."
    ),

    // Question 4 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Bei welchem Wasseraktivitätswert (aw) verläuft die Maillard-Reaktion am schnellsten?",
        answerA = "aw = 0,1–0,2",
        answerB = "aw = 0,4–0,7",
        answerC = "aw = 0,8–0,9",
        answerD = "aw = 1,0",
        correctAnswer = 1,
        explanation = "Die Maillard-Reaktion ist bei intermediären Wasseraktivitäten (aw 0,4–0,7) am schnellsten. Bei sehr niedrigem aw fehlt das Wasser als Reaktionsmedium; bei hohem aw werden die Reaktanden verdünnt und die Aktivierungsenergie erhöht.",
        difficulty = 5,
        funFact = null
    ),

    // Question 5 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was sind Melanoidine im Kontext der Maillard-Reaktion?",
        answerA = "Flüchtige Aromastoffe mit niedrigem Molekulargewicht",
        answerB = "Enzymatische Bräunungsprodukte durch Polyphenoloxidase",
        answerC = "Karotenoid-Abbauprodukte durch Oxidation",
        answerD = "Braune, hochmolekulare Stickstoff-haltige Polymere als Endprodukte",
        correctAnswer = 3,
        explanation = "Melanoidine sind die braunen, stickstoffhaltigen hochmolekularen Endprodukte der Maillard-Reaktion. Sie entstehen durch Polymerisierung und Kondensation verschiedener Intermediate und sind für die charakteristische Bräunung von geröstetem Kaffee, Brot und Fleisch verantwortlich.",
        difficulty = 5,
        funFact = "Melanoidine in Kaffee zeigen in Studien antioxidative und präbiotische Eigenschaften — gerösteter Kaffee ist also in gewissem Sinne ein Functional Food."
    ),

    // ── SPHÄRIFIZIERUNG & MOLEKULARGASTRONOMIE ───────────────────────────────

    // Question 6 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist der chemische Mechanismus der Basis-Sphärifizierung (direkte Sphärifizierung) mit Natriumalginat und Calciumchlorid?",
        answerA = "Ionotrope Gelbildung durch Ca²⁺-Vernetzung der Alginat-Ketten",
        answerB = "Thermische Denaturierung des Alginats über 80 °C",
        answerC = "Kovalente Bindung zwischen Alginat und Calciumionen bei pH < 4",
        answerD = "Osmotischer Druckausgleich zwischen Alginat-Lösung und CaCl₂-Bad",
        correctAnswer = 0,
        explanation = "Natriumalginat enthält negativ geladene Carboxylgruppen (–COO⁻). Calciumionen (Ca²⁺) vernetzen diese durch ionotrope Gelbildung: Ein Ca²⁺-Ion bildet Salzbrücken mit zwei Carboxylgruppen verschiedener Alginat-Ketten, was das Egg-Box-Modell der Vernetzung ergibt.",
        difficulty = 5,
        funFact = "Ferran Adrià entwickelte den sphärischen Olivenöl-Kaviar erstmals 2003 im El Bulli — der Moment gilt als Geburtsstunde der modernen Sphärifizierungstechnik."
    ),

    // Question 7 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Warum ist die inverse Sphärifizierung der direkten Sphärifizierung für kalziumreiche Produkte überlegen?",
        answerA = "Die inverse Methode benötigt keine Gelierzeit und ist sofort servierfertig",
        answerB = "Bei der inversen Methode wird Agar statt Alginat verwendet",
        answerC = "Die Gelschicht wächst von außen nach innen und hört bei vollständiger Gelierung auf",
        answerD = "Das Produkt enthält Calciumlactat, das ins Alginat-Bad tropft — die Gelschicht stabilisiert sich ohne weiterzugaren",
        correctAnswer = 3,
        explanation = "Bei der inversen Sphärifizierung enthält das Produkt Calciumlactat und wird in ein Natriumalginat-Bad getaucht. Die Gelschicht bildet sich außen und bleibt dauerhaft stabil, weil das Gel nicht weiterwächst, wenn kein Calcium mehr aus dem Inneren diffundiert — ideal für kalziumreiche Produkte wie Milch oder Joghurt.",
        difficulty = 5,
        funFact = null
    ),

    // Question 8 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welche Eigenschaft unterscheidet Gellan Gum (E418) fundamental von Agar-Agar bei der Gelbildung in der Molekularküche?",
        answerA = "Gellan bildet thermoreversible Gele, Agar bildet irreversible Gele",
        answerB = "Agar geliert bereits bei Raumtemperatur, Gellan erst bei –10 °C",
        answerC = "Gellan kann klare, feste Gele bei sehr niedrigen Konzentrationen (<0,5%) bilden und ist hitzestabil nach Gelierung",
        answerD = "Gellan ist tierischen Ursprungs, Agar kommt aus Bakterien",
        correctAnswer = 2,
        explanation = "Gellan Gum (produziert von Sphingomonas elodea) bildet bereits bei Konzentrationen ab 0,1–0,5% stabile, klare Gele. Entscheidend: Nach der Gelbildung sind Gellan-Gele hitzestabil (können bis 120°C erhitzt werden), während Agar-Gele bei ~85–90°C schmelzen. Das ermöglicht 'heiße Gele'.",
        difficulty = 5,
        funFact = "Hersteller von Nährlösungen für Pflanzenkulturen bevorzugen Gellan gegenüber Agar, da es weniger Schwermetalle enthält und klarere Gele bildet."
    ),

    // Question 9 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Transglutaminase' und wie wird sie in der Molekularküche eingesetzt?",
        answerA = "Ein Enzym, das Glutamin-Reste zwischen Proteinen kovalent vernetzt — ermöglicht 'Fleischkleben'",
        answerB = "Ein Zuckerabbauendes Enzym für die Herstellung von Zucker-Gelen",
        answerC = "Ein Emulgator aus Weizengluten für stabile Öl-Wasser-Emulsionen",
        answerD = "Ein Konservierungsmittel das Proteine denaturiert",
        correctAnswer = 0,
        explanation = "Transglutaminase (TG, E-Nummer nicht gelistet, gilt als Processing Aid) katalysiert die Bildung kovalenter Isopeptid-Bindungen zwischen Glutamin- und Lysin-Resten verschiedener Proteinmoleküle. In der Molekularküche verbindet sie verschiedene Fleisch- oder Fischabschnitte zu nahtlosen Stücken ('Meat Glue').",
        difficulty = 5,
        funFact = "Transglutaminase kommt natürlich in Blutgerinnung und Wundheilung vor — im Fleischverarbeitungsbereich wurde sie erst in den 1990er Jahren industriell nutzbar gemacht."
    ),

    // Question 10 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welchen physikalischen Effekt nutzt die Technik des 'Espumas' (Lecithin-Schaum) nach Ferran Adrià?",
        answerA = "Lecithin erhöht die Oberflächenspannung und stabilisiert Luftblasen mechanisch",
        answerB = "Lecithin als Amphiphil reduziert die Grenzflächenenergie zwischen Luft und Flüssigkeit",
        answerC = "Lecithin vernetzt Proteine und bildet ein starres Schaumgerüst",
        answerD = "Lecithin senkt den Schmelzpunkt der Flüssigkeit und erhöht die Viskosität",
        correctAnswer = 1,
        explanation = "Lecithin (Phosphatidylcholin) ist ein amphiphiles Molekül: Der hydrophile Phosphat-Kopf richtet sich zur wässrigen Phase, der hydrophobe Fettsäureschwanz zur Luft. Dadurch senkt Lecithin die Grenzflächenenergie zwischen Luft und Flüssigkeit, stabilisiert Schaumblasen und ermöglicht die Bildung von luftigen, stabilen Espumas.",
        difficulty = 5,
        funFact = null
    ),

    // ── EMULSIONEN & KOLLOIDCHEMIE ────────────────────────────────────────────

    // Question 11 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was beschreibt das HLB-System (Hydrophilic-Lipophilic Balance) bei Emulgatoren?",
        answerA = "Den prozentualen Anteil hydrophiler Gruppen am Gesamtmolekulargewicht des Emulgators",
        answerB = "Das Verhältnis von gelösten zu ungelösten Emulgator-Molekülen",
        answerC = "Eine Skala von 0–20 zur Vorhersage ob ein Emulgator Öl-in-Wasser oder Wasser-in-Öl Emulsionen bevorzugt",
        answerD = "Die Mindestkonzentration eines Emulgators zur Bildung stabiler Mizellen",
        correctAnswer = 2,
        explanation = "Der HLB-Wert nach Griffin (Skala 1–20) beschreibt das Gleichgewicht zwischen hydrophilen und lipophilen Eigenschaften. HLB < 6: bevorzugt W/O-Emulsionen (z.B. Butter); HLB > 8: bevorzugt O/W-Emulsionen (z.B. Milch). Lecithin hat HLB ~4, Polysorbat 80 hat HLB ~15.",
        difficulty = 5,
        funFact = "Das HLB-System wurde 1949 von William Griffin bei Atlas Chemical Industries entwickelt und ist heute noch der Standard in der Lebensmittelindustrie."
    ),

    // Question 12 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist das 'Pickering-Emulsion'-Prinzip und welchen Vorteil hat es gegenüber klassischen Tensid-Emulsionen?",
        answerA = "Emulgierung durch kolloidale Festpartikel, die an der Grenzfläche adsorbieren — deutlich stabiler als Tensid-Emulsionen",
        answerB = "Emulgierung ausschließlich durch Proteine bei pH nahe dem isoelektrischen Punkt",
        answerC = "Verwendung von Wachs-Partikeln als Emulgatoren für Wasser-in-Öl-Emulsionen",
        answerD = "Emulgierung durch elektrische Ladungsunterschiede zwischen Öl- und Wassertröpfchen",
        correctAnswer = 0,
        explanation = "Pickering-Emulsionen verwenden kolloidale Festpartikel (z.B. Stärkekristalle, Zellulosenanokristalle, Proteinnanopartikel) statt klassischer Tenside. Die Partikel adsorbieren irreversibel an der Öl-Wasser-Grenzfläche und bilden eine mechanisch robuste Barriere. Die Desorptionsenergie ist um Größenordnungen höher als bei Tensid-Molekülen.",
        difficulty = 5,
        funFact = "Pickering-Emulsionen sind nach Spencer Umfreville Pickering (1907) benannt, der bemerkte dass Kalziumcarbonat-Partikel Emulsionen stabilisieren können."
    ),

    // Question 13 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Durch welchen Mechanismus destabilisiert sich eine Emulsion durch 'Ostwald-Reifung'?",
        answerA = "Tröpfchen kollidieren und verschmelzen durch van-der-Waals-Kräfte",
        answerB = "Dichteunterschiede führen zur Entmischung durch Gravitation (Aufrahmen)",
        answerC = "Elektrostatische Abstoßung bricht zusammen wenn die Ionenstärke steigt",
        answerD = "Kleine Tröpfchen lösen sich auf und ihr Material diffundiert zu größeren Tröpfchen — Gesamtzahl der Tröpfchen sinkt",
        correctAnswer = 3,
        explanation = "Ostwald-Reifung beruht auf der Kelvin-Gleichung: Kleinere Tröpfchen haben höheren Innendruck und damit höhere Löslichkeit. Gelöste Moleküle diffundieren durch das Dispersionsmedium zu größeren Tröpfchen. Das Ergebnis: Die Tröpfchengrößenverteilung wird breiter, kleine Tröpfchen verschwinden.",
        difficulty = 5,
        funFact = null
    ),

    // Question 14 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist die kritische Mizellbildungskonzentration (CMC) und welche Bedeutung hat sie für Lecithin in Lebensmitteln?",
        answerA = "Mindestkonzentration ab der Lecithin-Moleküle Mizellen bilden und die Grenzflächenspannung nicht mehr weiter sinkt",
        answerB = "Die Konzentration bei der Lecithin beginnt Proteine zu denaturieren",
        answerC = "Der maximale Lecithin-Anteil der in der EU zugelassen ist",
        answerD = "Die Konzentration bei der Lecithin ausfällt und nicht mehr emulgierend wirkt",
        correctAnswer = 0,
        explanation = "Unterhalb der CMC liegen Tenside als einzelne Moleküle vor und belegen die Grenzfläche. Ab der CMC bilden sich Mizellen: hydrophobe Schwänze im Kern, hydrophile Köpfe zur wässrigen Phase. Die Grenzflächenspannung fällt bis zur CMC, dann bleibt sie konstant. Für Sojalecithin liegt die CMC bei ca. 0,2–1 g/L.",
        difficulty = 5,
        funFact = "In Schokolade wird Lecithin genau um die CMC dosiert (~0,5%) — mehr Lecithin bringt keinen zusätzlichen Emulgiereffekt, erhöht aber die Kosten."
    ),

    // Question 15 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Wie unterscheiden sich κ-Carrageen, ι-Carrageen und λ-Carrageen in ihrer Gelierungsfähigkeit?",
        answerA = "Alle drei bilden identische Gele, unterscheiden sich nur im Ursprungsorganismus",
        answerB = "κ bildet feste, spröde Gele (K⁺-abhängig); ι bildet elastische Gele (Ca²⁺-abhängig); λ geliert nicht",
        answerC = "κ geliert bei Kälte, ι bei Wärme, λ nur in Kombination mit Proteinen",
        answerD = "λ bildet das stärkste Gel, κ das schwächste, ι ist intermediär",
        correctAnswer = 1,
        explanation = "κ-Carrageen (1 Sulphatgruppe/Disaccharid) bildet feste, spröde Gele in Gegenwart von K⁺-Ionen. ι-Carrageen (2 Sulphatgruppen) bildet elastische, weiche Gele mit Ca²⁺. λ-Carrageen (3 Sulphatgruppen) ist stark negativ geladen und kann keine Doppelhelices bilden — es geliert nicht, wirkt aber als Verdickungsmittel.",
        difficulty = 5,
        funFact = "Carrageen wird aus Rotalgen (Rhodophyta) gewonnen. Der Name kommt von der irischen Küstenstadt Carragheen, wo die Alge seit Jahrhunderten geerntet wird."
    ),

    // ── SOUS-VIDE & PROTEINCHEMIE ─────────────────────────────────────────────

    // Question 16 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Warum ist bei Sous-vide-Rindfleisch die Temperatur von 55–57 °C für zartes Ergebnis optimal?",
        answerA = "Kollagen löst sich bei 55°C vollständig zu Gelatine auf",
        answerB = "Alle Muskelproteine denaturieren simultan bei 55°C ohne Wasserverlust",
        answerC = "Myosin denaturiert bei ~50°C, Aktin erst bei ~65–70°C — bei 55°C ist Myosin denaturiert aber Aktin intakt",
        answerD = "Bei 55°C wird Myoglobin vollständig oxidiert zu Metmyoglobin",
        correctAnswer = 2,
        explanation = "Myosin (Hauptprotein der dicken Filamente) denaturiert bei 50–54°C und verleiht Festigkeit. Aktin (dünne Filamente) denaturiert erst bei 65–70°C. Bei 55–57°C ist Myosin denaturiert (gute Textur), Aktin aber noch nativ — das Fleisch bleibt saftig und zart. Über 65°C denaturiert Aktin und das Fleisch wird trocken.",
        difficulty = 5,
        funFact = "Die Forschung zu Sous-vide-Proteinphysik am Max-Planck-Institut Mainz zeigte: Die ersten 20 Minuten verursachen den größten Teil des Wasserverlusts."
    ),

    // Question 17 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Bei welcher Temperatur und Zeit wandelt sich Kollagen Typ I in Rindfleisch-Bindegewebe durch Sous-vide vollständig in Gelatine um?",
        answerA = "55 °C für 1 Stunde",
        answerB = "80 °C für 30 Minuten",
        answerC = "100 °C für 15 Minuten",
        answerD = "62–65 °C für 8–72 Stunden",
        correctAnswer = 3,
        explanation = "Kollagen Typ I in Rindfleisch-Bindegewebe beginnt bei ~62–64°C zu denaturieren und die Tripelhelix-Struktur aufzubrechen. Die Umwandlung zu Gelatine (hydrolysiertes Kollagen) erfordert bei dieser niedrigen Temperatur jedoch sehr lange Zeiten: 8–72 Stunden je nach Stück.",
        difficulty = 5,
        funFact = null
    ),

    // Question 18 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was beschreibt das 'Z-Scheiben-Kollaps'-Phänomen beim Erhitzen von Muskelfleisch?",
        answerA = "Die Z-Scheiben (α-Actinin-reiche Quervernetzungen der Sarkomere) kollabieren bei 60–70°C und verursachen den Längsschrumpf",
        answerB = "Das Myosin löst sich von den Z-Scheiben bei 45°C und erzeugt weiche Textur",
        answerC = "Z-Scheiben sind Zellmembranstrukturen die beim Kochen Wasser freisetzen",
        answerD = "Der Kollaps bezeichnet die Auflösung von Titin-Protein bei Temperaturen über 80°C",
        correctAnswer = 0,
        explanation = "Z-Scheiben sind die Quervernetzungen der Sarkomere und bestehen hauptsächlich aus α-Actinin. Bei 60–70°C kollabieren diese Strukturen und verkürzen die Muskelfasern longitudinal (Fleisch schrumpft). Desmin-Zwischenfilamente, die Z-Scheiben verbinden, denaturieren bei etwa 65°C und verstärken diesen Effekt.",
        difficulty = 5,
        funFact = "Das Riesenmolekül Titin (auch Connectin) — mit ~3.000 kDa das größte bekannte Protein — ist für die passive Elastizität rohen Fleisches verantwortlich."
    ),

    // Question 19 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Warum wird bei Sous-vide-Fisch eine Kerntemperatur von 40–45 °C empfohlen, obwohl Fisch erst bei höheren Temperaturen als 'gar' gilt?",
        answerA = "Fisch enthält kein Aktin, daher ist die Denaturierungstemperatur irrelevant",
        answerB = "Fischkollagen denaturiert bereits ab 25–45°C und Myosin bei 40°C — über 50°C wird Fisch trocken und krümelig",
        answerC = "Die niedrige Temperatur verhindert Fischgeruch durch Oxidation der Omega-3-Fettsäuren",
        answerD = "Parasitenabtötung erfordert nur 38°C für 5 Minuten",
        correctAnswer = 1,
        explanation = "Fischkollagen hat eine viel niedrigere Denaturierungstemperatur als Rindfleisch-Kollagen (25–45°C vs. 62–65°C). Fisch-Myosin denaturiert ebenfalls früher (~40°C). Bei Temperaturen über 50°C ist Fisch bereits trocken und zerfällt. Daher sind 40–45°C die optimale Sous-vide-Temperatur für Zartheit und Saftigkeit.",
        difficulty = 5,
        funFact = "Thunfisch-Sashimi wird bewusst roh verzehrt, da die Proteintextur bei Körpertemperatur (37°C) genau die ideale Konsistenz hat."
    ),

    // Question 20 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Myoglobin' und warum bestimmt sein Oxidationszustand die Farbe von Rindfleisch?",
        answerA = "Myoglobin ist ein eisenhaltiges Sauerstoffspeicherprotein; Fe²⁺ (oxygeniert) ist rot, Fe³⁺ (Metmyoglobin) ist braun",
        answerB = "Myoglobin ist ein Fettspeicherprotein das bei Oxidation von weiß zu rot wird",
        answerC = "Myoglobin ist Hämoglobin aus dem Blut das im Muskel verbleibt",
        answerD = "Myoglobin denaturiert bei 40°C und verfärbt sich dabei immer schwarz",
        correctAnswer = 0,
        explanation = "Myoglobin enthält eine Häm-Gruppe mit Fe²⁺. Oxymyoglobin (Fe²⁺, mit O₂) ist hellrot (frisches Fleisch). Deoxymyoglobin (Fe²⁺, ohne O₂) ist purpur. Metmyoglobin (Fe³⁺, oxidiert) ist braun. Beim Erhitzen denaturiert Myoglobin und Metmyoglobin wird dominant — deshalb ist gekochtes Fleisch braun.",
        difficulty = 5,
        funFact = "Die Umrötung bei gepökeltem Fleisch (Schinken, Wurst) entsteht durch Reaktion von Myoglobin mit Stickoxid (aus Nitrit) zu stabilem, rosa Nitrosomyoglobin."
    ),

    // ── KARAMELLISIERUNG & ZUCKERCHEMIE ──────────────────────────────────────

    // Question 21 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "In welcher Reihenfolge karamellisieren die folgenden Zucker bei steigender Temperatur?",
        answerA = "Maltose (160°C) < Saccharose (160°C) < Glucose (160°C) < Fructose (180°C)",
        answerB = "Glucose (160°C) < Fructose (110°C) < Saccharose (185°C) < Maltose (180°C)",
        answerC = "Alle Zucker karamellisieren bei der gleichen Temperatur von 160°C",
        answerD = "Fructose (110°C) < Glucose (160°C) < Saccharose (160°C) < Maltose (180°C)",
        correctAnswer = 3,
        explanation = "Fructose ist der reaktivste Zucker und karamellisiert bereits bei ~110°C. Glucose und Saccharose benötigen ~160°C. Maltose karamellisiert bei ~180°C als stabilster Disaccharid. Die niedrigere Reaktivität von Fructose erklärt, warum Honig (fructosereich) schneller bräunt als reiner Haushaltszucker.",
        difficulty = 5,
        funFact = null
    ),

    // Question 22 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist die 'Inversion' von Saccharose und welche Bedeutung hat sie für die Konditorei?",
        answerA = "Saccharose kristallisiert bei Inversion um und wird weniger süß",
        answerB = "Inversion bezeichnet das Aufschmelzen von Kristallzucker bei 185°C",
        answerC = "Saccharose wird durch Säure oder Invertase hydrolysiert zu Glucose + Fructose; Invertzucker ist süßer und hygroskopischer",
        answerD = "Saccharose wird durch Erhitzen zu Trehalose invertiert",
        correctAnswer = 2,
        explanation = "Bei der Saccharose-Inversion (durch Säure oder Invertase) wird das Glykosid-Band gespalten: Saccharose → D-Glucose + D-Fructose. 'Inversion' bezieht sich auf die optische Drehungsänderung (von +66,5° rechtsdrehend zu –20° linksdrehend). Invertzucker: süßer (Fructose ist 1,7× süßer als Saccharose), hygroskopisch, verhindert Kristallisation in Fondants.",
        difficulty = 5,
        funFact = "Bienen produzieren Invertzucker durch das Enzym Invertase in ihrem Speichel — deshalb ist Honig nicht kristallin wie Haushaltszucker."
    ),

    // Question 23 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet thermoreversible von thermoirreversiblen Gelen in der Lebensmittelphysik?",
        answerA = "Thermoreversible Gele (Gelatine, Agar) schmelzen beim Erhitzen; thermoirreversible Gele (Methylcellulose, Eiklar-Denaturierung) schmelzen nicht",
        answerB = "Thermoreversible Gele entstehen nur durch chemische Vernetzung, irreversible durch physikalische",
        answerC = "Alle Lebensmittelgele sind thermoreversibel, der Begriff thermoirreversibel ist wissenschaftlich falsch",
        answerD = "Thermoirreversible Gele sind ausschließlich synthetische Kunststoffe",
        correctAnswer = 0,
        explanation = "Thermoreversible Gele (Gelatine: schmilzt bei ~35°C; Agar: schmilzt bei ~85°C) bilden physikalische Netzwerke durch Wasserstoffbrücken und hydrophobe Wechselwirkungen, die durch Wärme aufgebrochen werden. Thermoirreversible Gele entstehen durch kovalente Vernetzung oder irreversible Denaturierung (Eiklar, Fleisch beim Garen) — sie können nicht erneut aufgeschmolzen werden.",
        difficulty = 5,
        funFact = "Methylcellulose (E461) bildet das einzige bekannte 'umgekehrte' Gel: Es geliert beim Erhitzen und schmilzt beim Abkühlen — das Gegenteil aller anderen Lebensmittelgele."
    ),

    // Question 24 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welcher Prozess erklärt die 'Retrogradation' von Stärke und welche Lebensmittelprobleme verursacht sie?",
        answerA = "Retrogradation ist die enzymatische Spaltung von Amylopektin durch Amylase",
        answerB = "Retrogradation ist die Rekristallisation von Amylose nach dem Abkühlen — verursacht Altbackenwerden von Brot und Synerese von Stärkegelen",
        answerC = "Retrogradation bezeichnet das Auflösen von Stärkekörnern beim Erhitzen (Gelatinisierung)",
        answerD = "Retrogradation ist die Oxidation von Stärke durch Luftsauerstoff",
        correctAnswer = 1,
        explanation = "Beim Abkühlen gelatinisierter Stärke assoziieren Amyloseketten (DP ~1000) durch Wasserstoffbrücken zu kristallinen Doppelhelices (Retrogradation). Amylopektin retrogradiert langsamer (Tage). Folgen: Altbackenwerden von Brot (Krume wird fest), Synerese (Wasserabscheidung) in Puddings und Saucen. Wachsstärken (fast nur Amylopektin) retrogradieren kaum.",
        difficulty = 5,
        funFact = "Resistente Stärke (Typ 3) entsteht durch Retrogradation — abgekochter und abgekühlter Reis enthält mehr resistente Stärke als frisch gekochter und gilt als präbiotisch."
    ),

    // Question 25 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist die Bedeutung des 'Gelatinierungspunkts' (Verkleisterungstemperatur) bei Stärke und warum variiert er je nach Quelle?",
        answerA = "Der Punkt bei dem Stärke zu Glucose abgebaut wird; variiert je nach Enzymkonzentration",
        answerB = "Die Temperatur bei der Stärke karamellisiert; identisch für alle Stärkearten bei 185°C",
        answerC = "Der pH-Wert bei dem Stärke geliert; variiert je nach Mineraliengehalt des Wassers",
        answerD = "Der Punkt bei dem Stärkekörner irreversibel aufquellen, Doppelhelices aufbrechen und Viskosität ansteigt; variiert da Amylose/Amylopektin-Verhältnis und Kristallstruktur quellenabhängig sind",
        correctAnswer = 3,
        explanation = "Beim Erhitzen in Wasser quellen Stärkekörner (ab ~60°C quellenspezifisch), die Doppelhelices der kristallinen Bereiche brechen auf, Amylose diffundiert heraus und die Viskosität steigt dramatisch. Weizensstärke: 58–64°C, Maisstärke: 62–72°C, Kartoffelstärke: 56–66°C, Reisstärke: 61–78°C. Die Unterschiede spiegeln verschiedene Kristallstrukturen (A-, B-, C-Typ).",
        difficulty = 5,
        funFact = null
    ),

    // ── HYDROKOLLOIDE & TEXTUR ────────────────────────────────────────────────

    // Question 26 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Warum bildet Agar-Agar bei deutlich höherer Konzentration (1–2%) als Gelatine (0,5–1%) Gele mit ähnlicher Festigkeit?",
        answerA = "Agar hat niedrigeres Molekulargewicht und weniger Vernetzungspunkte als Gelatine",
        answerB = "Agarose-Doppelhelices bilden weniger effiziente Netzwerke; Gelatine vernetzt über mehr Helixzonen pro Längeneinheit",
        answerC = "Gelatine ist ein Protein und vernetzt kovalent; Agar vernetzt nur durch Wasserstoffbrücken",
        answerD = "Agar enthält störende Agaropektin-Fraktionen die die Geleffizienz senken",
        correctAnswer = 3,
        explanation = "Kommerzieller Agar enthält ~70% Agarose und ~30% Agaropektin. Agaropektin ist negativ geladen (Sulfatgruppen) und stört die Helix-Aggregation der Agarose. Reines Agarose-Gel wäre effizienter. Gelatine (Kollagen-Hydrolysat) bildet sehr effiziente dreidimensionale Netzwerke über Triple-Helix-Fragmente, die an vielen Punkten assoziieren.",
        difficulty = 5,
        funFact = "Ultrareines Agarose für die Gelelektrophorese (ohne Agaropektin) ist ~100× teurer als Lebensmittel-Agar."
    ),

    // Question 27 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Methylcellulose' (E461) und warum geliert sie paradoxerweise beim Erhitzen?",
        answerA = "Methylcellulose enthält thermolabile Brücken die bei 60°C kovalente Bindungen bilden",
        answerB = "Methylcellulose hat einen negativen Ausdehnungskoeffizient und schrumpft beim Erwärmen",
        answerC = "Methylcellulose ist hydrophob modifizierte Cellulose; hydrophobe Methyl-Gruppen assoziieren bei Wärme stärker — Hydrophober Effekt treibt Gelierung",
        answerD = "Erhitzen dehydriert Methylcellulose-Moleküle die dann durch Ionenbrücken vernetzen",
        correctAnswer = 2,
        explanation = "Methylcellulose trägt Methyl-Gruppen an den Hydroxyl-Gruppen der Cellulose. Bei niedrigen Temperaturen sind diese von Wasser-Käfigen (hydrophile Hydratation) umgeben. Beim Erhitzen werden die Wasser-Käfige zerstört, die hydrophoben Methyl-Gruppen assoziieren miteinander (hydrophober Effekt), und es bildet sich ein Gel. Abkühlen bricht diese Assoziation auf — das Gel schmilzt.",
        difficulty = 5,
        funFact = "Methylcellulose-Gele werden in veganen Burgern (z.B. Beyond Meat) eingesetzt um beim Grillen einen 'Saft-ähnlichen' Effekt zu erzeugen."
    ),

    // Question 28 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Welche molekulare Eigenschaft verleiht Xanthan Gum (E415) seine außergewöhnliche Scherungsabhängigkeit (Pseudoplastizität)?",
        answerA = "Xanthan bildet bei Ruhe kovalente Bindungen die durch Scherung gebrochen werden",
        answerB = "Xanthan-Ketten sind bei Ruhe helikal aufgerollt und bilden ein Verschlaufungsnetzwerk; unter Scherung richten sie sich aus — Viskosität sinkt",
        answerC = "Die hohe Ladungsdichte von Xanthan erzeugt elektrostatische Abstoßung die Scherung reduziert",
        answerD = "Xanthan enthält Luftblasen die durch Scherung freigesetzt werden",
        correctAnswer = 1,
        explanation = "Xanthan bildet in Lösung eine geordnete Konformation (Doppelhelix oder einzelne steife Helix). Die Ketten bilden bei Ruhe ein schwaches physikalisches Netzwerk durch Verschlaufung, das hohe Viskosität erzeugt. Unter Scherung richten sich die steifen Ketten in Fließrichtung aus — das Netzwerk bricht auf und die Viskosität fällt dramatisch. Bei Ruhe erholt sich das System.",
        difficulty = 5,
        funFact = null
    ),

    // Question 29 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet 'High-Methoxyl-Pektin' (HM-Pektin) von 'Low-Methoxyl-Pektin' (LM-Pektin) im Gelierungsmechanismus?",
        answerA = "HM-Pektin geliert durch hydrophobe Wechselwirkungen und Wasserstoffbrücken bei hohem Zuckergehalt und niedrigem pH; LM-Pektin geliert ionotrop mit Ca²⁺",
        answerB = "HM-Pektin geliert nur bei alkalischem pH, LM-Pektin nur bei saurem pH",
        answerC = "HM-Pektin benötigt Calcium, LM-Pektin geliert ohne Ionen",
        answerD = "Beide Pektintypen gelieren identisch, unterscheiden sich nur in der Süße",
        correctAnswer = 0,
        explanation = "HM-Pektin (Veresterungsgrad >50%) trägt viele Methylester-Gruppen. Gelierung erfordert pH < 3,5 und Zucker > 55%: Hoher Zuckergehalt entzieht Wasser (reduziert aw), Wasserstoffbrücken und hydrophobe Wechselwirkungen dominieren. LM-Pektin (Veresterungsgrad <50%) hat viele freie Carboxylgruppen und geliert durch Ca²⁺-Vernetzung wie Alginat (Egg-Box-Modell) — auch ohne hohen Zuckergehalt.",
        difficulty = 5,
        funFact = "LM-Pektin wird für Diabetiker-Konfitüren verwendet, da kein Hochzuckergehalt für die Gelierung benötigt wird."
    ),

    // Question 30 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Synerese' in Lebensmittelgelen und welcher molekulare Mechanismus liegt ihr zugrunde?",
        answerA = "Enzymatischer Abbau des Gelpolymers unter Freisetzung von gebundenem Wasser",
        answerB = "Osmotischer Wasserfluss in ein Gel aus der umgebenden Lösung",
        answerC = "Spontane Wasserabscheidung aus einem Gel durch Netzwerkkontraktion infolge von Polymer-Aggregation oder Kristallisation",
        answerD = "Verdampfung von Oberflächenwasser durch Luftexposition",
        correctAnswer = 2,
        explanation = "Synerese entsteht wenn das Polymernetzwerk eines Gels nachträglich stärker vernetzt (aggregiert) oder kristallisiert. Das Netzwerk zieht sich zusammen und expulsiert mechanisch Wasser aus seinen Poren. Typische Ursachen: Stärke-Retrogradation in Puddings, zu starke Erhitzung von Gelatinegelen, Übergelierung von Agar. In Joghurt ist kontrollierte Synerese der Molkenabgang.",
        difficulty = 5,
        funFact = null
    ),

    // ── FERMENTATION & MIKROBIOLOGIE ──────────────────────────────────────────

    // Question 31 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Durch welchen biochemischen Mechanismus senkt Milchsäurebakterien-Fermentation den pH von Joghurt und was bewirkt dies strukturell?",
        answerA = "Bakterien produzieren CO₂ das mit Wasser zu Kohlensäure reagiert",
        answerB = "Proteolytische Enzyme der Bakterien spalten Casein und setzen saure Aminosäuren frei",
        answerC = "Fettsäureoxidation durch Bakterien produziert Essigsäure die den pH senkt",
        answerD = "Lactobacillus wandelt Lactose über Glykolyse zu L- und D-Lactat um; pH sinkt von ~6,7 auf ~4,6, Caseinkomplex fällt am isoelektrischen Punkt aus",
        correctAnswer = 3,
        explanation = "Lactobacillus bulgaricus und Streptococcus thermophilus vergären Lactose über homo- oder heterofermentative Glykolyse hauptsächlich zu L(+)-Lactat (und etwas D(–)-Lactat). Der pH sinkt von ~6,7 auf ~4,5–4,6. Am isoelektrischen Punkt von Casein (pI ≈ 4,6) heben sich die elektrostatischen Abstoßungskräfte zwischen Casein-Mizellen auf und das Casein-Netzwerk aggregiert zur charakteristischen Joghurt-Textur.",
        difficulty = 5,
        funFact = "Der 'Gel-Joghurt' (Set-Joghurt) geliert direkt im Becher; 'Rühr-Joghurt' wird nach der Fermentation gerührt und erhält seine cremige Textur durch Scherrheologie des Casein-Netzwerks."
    ),

    // Question 32 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Autoproteolyse' in gereiftem Käse und welche Aromavorläufer entstehen dabei?",
        answerA = "Fette oxidieren spontan und zerfallen in flüchtige Aromen ohne Protein-Beteiligung",
        answerB = "Proteasen (Chymosin-Reste, bakterielle Proteasen) bauen Casein zu Peptiden und Aminosäuren ab — Aminosäuren sind Ausgangsstoffe für hunderte Aromamoleküle",
        answerC = "Schimmelpilze produzieren Alkohol der mit Proteinen reagiert",
        answerD = "Autoproteolyse ist ausschließlich ein Fehler bei zu warmer Lagerung",
        correctAnswer = 1,
        explanation = "Primäre Proteolyse: Chymosin und Plasmin bauen αs1-Casein und β-Casein zu großen Peptiden ab. Sekundäre Proteolyse: Bakterielle Peptidasen zerlegen diese zu Aminosäuren. Die freien Aminosäuren werden dann durch Transaminierung, Decarboxylierung, Deaminierung und Strecker-Abbau in hunderte Aromamoleküle umgewandelt: Methanethiol aus Methionin, 3-Methylbutanal aus Leucin, Indol aus Tryptophan.",
        difficulty = 5,
        funFact = "Parmigiano Reggiano enthält nach 24 Monaten Reifung über 600 verschiedene flüchtige Aromaverbindungen — mehr als die meisten Weine."
    ),

    // Question 33 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Welches Enzym ist für die Dicklegung von Milch bei der Käseherstellung verantwortlich und wie wirkt es?",
        answerA = "Lipase hydrolysiert Milchfett und das entstehende Glycerol destabilisiert Casein",
        answerB = "Lactase baut Lactose ab, die pH-Änderung fällt Casein aus",
        answerC = "Chymosin (Rennin) spaltet κ-Casein zwischen Phe105-Met106 und zerstört die Schutzhülle der Casein-Mizellen",
        answerD = "Pepsin denaturiert Molkenproteine die dann Casein-Mizellen verklumpen lassen",
        correctAnswer = 2,
        explanation = "Chymosin (früher Rennin) aus dem Kälbermagen ist eine Aspartyl-Protease. Es spaltet das κ-Casein zwischen Phenylalanin-105 und Methionin-106 hochspezifisch: Die hydrophile 'Hairy Layer' (Peptide 106–169) des κ-Caseins wird abgespalten. Diese Schutzhülle verhinderte normalerweise die Aggregation der Casein-Mizellen. Nach der Spaltung aggregieren die destabilisierten Mizellen zu einem Gel (Dickete).",
        difficulty = 5,
        funFact = "Modernes Chymosin wird rekombinant in Aspergillus niger oder Kluyveromyces marxianus produziert — >90% aller Käse weltweit verwenden fermentatives Chymosin."
    ),

    // Question 34 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist der 'Crabtree-Effekt' bei Saccharomyces cerevisiae und warum ist er für die Weinherstellung bedeutsam?",
        answerA = "Hefe produziert bei niedrigem Sauerstoff mehr CO₂ als Alkohol",
        answerB = "Crabtree-Effekt beschreibt die thermische Inaktivierung von Hefe über 40°C",
        answerC = "Bei hoher Glucosekonzentration unterdrückt Hefe die Atmungskette zugunsten der alkoholischen Gärung — auch wenn Sauerstoff vorhanden ist",
        answerD = "Bei hohem pH wechselt Hefe von Gärung zu Milchsäureproduktion",
        correctAnswer = 2,
        explanation = "S. cerevisiae zeigt den Crabtree-Effekt (auch 'overflow metabolism'): Bei Glucosekonzentrationen über ~0,15 mM unterdrückt die Hefe die mitochondriale Atmungskette (Catabolite Repression) und vergärt Glucose zu Ethanol + CO₂ — auch aerob. Für Weinmacher bedeutet das: Selbst bei belüfteter Maische fermentiert die Hefe bevorzugt, statt vollständig zu atmen und mehr Biomasse zu bilden.",
        difficulty = 5,
        funFact = null
    ),

    // Question 35 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welche Rolle spielt Glutamat als 'fünfter Geschmack' (Umami) und welchen Rezeptor aktiviert es primär?",
        answerA = "Glutamat aktiviert denselben Rezeptor wie Salz (ENaC) und wird deshalb als Geschmacksverstärker empfunden",
        answerB = "Glutamat aktiviert Bitter-Rezeptoren der TAS2R-Familie in niedrigen Konzentrationen",
        answerC = "Glutamat bindet an keine spezifischen Rezeptoren sondern erhöht allgemein die Speichelproduktion",
        answerD = "Glutamat aktiviert primär das T1R1/T1R3-Heterodimer (GPCR Klasse C) mit einer 'Venus-Fliegenfallen'-Bindungsdomäne",
        correctAnswer = 3,
        explanation = "Umami wird primär durch das T1R1/T1R3-Heterodimer (GPCR der Klasse C) erkannt. T1R1 hat eine 'Venus-Fliegenfallen'-Domäne die L-Glutamat spezifisch bindet. Synergistisch wirkt 5'-Inosinmonophosphat (IMP aus Fleisch) und 5'-Guanosinmonophosphat (GMP aus Pilzen), die die Bindungsaffinität von Glutamat um das 30-fache steigern.",
        difficulty = 5,
        funFact = "Der Umami-Geschmack wurde 1908 vom japanischen Chemiker Kikunae Ikeda bei Kombu-Dashi entdeckt — er isolierte Glutamat aus Meeresalgen und gründete die Firma Ajinomoto."
    ),

    // ── LIPIDCHEMIE & FETTE ───────────────────────────────────────────────────

    // Question 36 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'cis'- und 'trans'-Fettsäuren bezüglich ihrer physikalischen Eigenschaften in Lebensmitteln?",
        answerA = "Trans-Fettsäuren sind immer flüssig, cis-Fettsäuren immer fest bei Raumtemperatur",
        answerB = "Cis-Fettsäuren haben einen Knick in der Kohlenstoffkette — niedriger Schmelzpunkt (Öle); Trans-Fettsäuren sind gestreckt — hoher Schmelzpunkt ähnlich gesättigten Fettsäuren",
        answerC = "Cis und Trans beschreiben nur die Herstellungsmethode, haben keine physikalischen Unterschiede",
        answerD = "Trans-Fettsäuren haben niedrigeren Schmelzpunkt da ihre Moleküle weniger geordnet packen",
        correctAnswer = 1,
        explanation = "Bei cis-Doppelbindungen zeigen beide Wasserstoffatome auf dieselbe Seite → 30°-Knick in der Kette. Dadurch packen cis-Fettsäuren ungeordnet und haben niedrige Schmelzpunkte (Öle). Trans-Doppelbindungen: Wasserstoffatome gegenüberliegend → gestreckte Kette wie gesättigte Fettsäuren → hoher Schmelzpunkt, fest bei RT. Industrielle Transfette entstehen bei der partiellen Hydrierung von Pflanzenölen.",
        difficulty = 5,
        funFact = null
    ),

    // Question 37 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist der 'Rauchpunkt' eines Öls und welche chemischen Prozesse laufen beim Überschreiten ab?",
        answerA = "Temperatur bei der Triglyceride zu Glycerol und Fettsäuren hydrolysieren; Glycerol dehydriert zu Acrolein (toxisch, krebsverdächtig)",
        answerB = "Temperatur bei der Öl beginnt zu rauchen durch bloße Verdampfung leichter Fraktionen",
        answerC = "Der Punkt bei dem Öl beginnt zu polymerisieren und Kunstharze bildet",
        answerD = "Temperatur bei der alle Antioxidantien im Öl verbraucht sind",
        correctAnswer = 0,
        explanation = "Beim Überschreiten des Rauchpunkts hydrolysieren Triglyceride durch enthaltene Feuchtigkeit und freie Fettsäuren entstehen. Glycerol dehydriert zu dem stark irritierenden und krebsverdächtigen Acrolein (Propenal). Zusätzlich entstehen polyzyklische aromatische Kohlenwasserstoffe (PAK) und verschiedene Aldehyde. Raffinierte Öle haben höhere Rauchpunkte als kaltgepresste, da sie weniger freie Fettsäuren enthalten.",
        difficulty = 5,
        funFact = "Natives Olivenöl extra hat trotz niedrigem Rauchpunkt (~190°C) ein günstiges Profil beim Braten, da Polyphenole als Antioxidantien die Oxidation verzögern."
    ),

    // Question 38 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Temperierung' bei Schokolade und warum beeinflusst sie die Kristallstruktur des Kakaobutter-Fetts?",
        answerA = "Temperierung erhitzt Schokolade über 60°C um alle Kristalle aufzuschmelzen dann schnell abzukühlen",
        answerB = "Temperierung fügt Lecithin hinzu das Kakaobutter-Kristalle stabilisiert",
        answerC = "Kontrolliertes Abkühlen/Erwärmen erzwingt die Bildung von Form-V-Kristallen (β₂) — stabil, glänzend, mit gutem Schmelzgefühl bei ~34°C",
        answerD = "Temperierung reduziert Wassergehalt der Schokolade durch Verdampfung",
        correctAnswer = 2,
        explanation = "Kakaobutter kann 6 polymorphe Kristallformen bilden (I–VI). Beim Temperieren: Aufschmelzen bei ~50°C (alle Kristalle schmelzen) → Abkühlen auf ~27–28°C (bildet instabile Formen IV/V-Keime) → Erwärmen auf ~31–32°C (instabile Formen IV schmelzen, Form V bleibt). Form V hat Schmelzpunkt ~34°C — leicht unter Körpertemperatur, daher schmilzt Schokolade auf der Zunge.",
        difficulty = 5,
        funFact = "Weiß angelaufene Schokolade ('Fettbloom') zeigt Form-VI-Kristalle die sich langsam aus Form V bilden — geschmacklich unbedenklich, aber optisch unerwünscht."
    ),

    // Question 39 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welcher Mechanismus liegt der 'Ranzigwerdung' von Fetten zugrunde und welche Verbindungen erzeugen den typischen Ranzigkeitsgeruch?",
        answerA = "Hydrolyse der Triglyceride durch Feuchtigkeit zu Fettsäuren die säuerlich riechen",
        answerB = "Mikrobielle Fermentation durch Bakterien die Methanol und Essigsäure produzieren",
        answerC = "Karamellisierung der Fettsäuren bei Raumtemperatur",
        answerD = "Autoxidation ungesättigter Fettsäuren durch radikalischen Kettenmechanismus → Hydroperoxide → Aldehyde wie Hexanal, (E)-2-Nonenal, Malondialdehyd",
        correctAnswer = 3,
        explanation = "Lipidoxidation verläuft als radikalische Kettenreaktion (Autoxidation). Initiation: Radikale (Licht, Metalle) abstrahieren H-Atom. Propagation: Peroxyradikal + Fettsäure → Hydroperoxid + neues Radikal. Sekundäre Oxidationsprodukte aus Hydroperoxid-Zersetzung: Hexanal ('Grasgeruch'), (E)-2-Nonenal ('Pappkarton'), Propanal, Malondialdehyd. Diese Aldehyde erzeugen Ranzigkeitsgeruch.",
        difficulty = 5,
        funFact = null
    ),

    // ── AROMASTOFFE & SENSORIK ────────────────────────────────────────────────

    // Question 40 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Aromastoffen' und 'Aromapräkursoren' in Lebensmitteln?",
        answerA = "Aromapräkursoren sind synthetische Aromastoffe, natürliche Aromastoffe haben keine Präkursoren",
        answerB = "Aromastoffe sind direkt flüchtig und riechbar; Aromapräkursoren sind geruchlose Vorstufen die erst durch Erhitzen, Fermentation oder enzymatische Prozesse in Aromastoffe umgewandelt werden",
        answerC = "Aromastoffe haben Molekulargewicht unter 100 g/mol, Aromapräkursoren über 500 g/mol",
        answerD = "Aromapräkursoren sind wasserlöslich, Aromastoffe sind fettlöslich",
        correctAnswer = 1,
        explanation = "Aromastoffe sind die direkt riechbaren flüchtigen Verbindungen (z.B. Vanillin, Linalool). Aromapräkursoren sind nicht-flüchtige, geruchlose Vorgänger die strukturell gebunden sind: S-Glutathion-Konjugate (Weintrauben → Thiol-Aromen durch Lyase), Glucosinolate (Senf/Meerrettich → Isothiocyanate durch Myrosinase), Glycoside (→ Terpen-Alkohole durch Glucosidase), Strecker-Aminosäuren (→ Aldehyde durch Maillard).",
        difficulty = 5,
        funFact = "Die charakteristischen Aromen von Sauvignon Blanc Wein (Stachelbeere, Grapefruit) entstehen aus S-Glutathion-Präkursoren der Traube durch Hefefermentation."
    ),

    // Question 41 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Warum haben Capsaicinoide (Capsaicin in Chili) eine 'Schärfe' die kein echter Geschmack ist?",
        answerA = "Capsaicin aktiviert den TRPV1-Ionenkanal (Hitzerezeptor) auf Schmerzfasern (C-Fasern) und erzeugt ein Hitzegefühl ohne tatsächliche Temperaturerhöhung",
        answerB = "Capsaicin bindet an Bitterrezeptoren der TAS2R-Familie und wird als Schmerz fehlinterpretiert",
        answerC = "Capsaicin löst Histaminfreisetzung aus was Brennen in Schleimhäuten erzeugt",
        answerD = "Capsaicin denaturiert Zungenpapillen-Proteine reversibel und erzeugt ein Kribbeln",
        correctAnswer = 0,
        explanation = "Capsaicin (und verwandte Capsaicinoide) sind hoch selektive Agonisten des TRPV1 (Transient Receptor Potential Vanilloid 1) Ionenkanals. TRPV1 ist ein nozizeptiver Wärmerezeptor der normal bei Temperaturen >43°C aktiviert wird (Schmerzschwelle). Capsaicin aktiviert TRPV1 bei jeder Temperatur — das Gehirn interpretiert das Signal als Hitze/Brennen. Schärfe ist chemisch ausgelöste Schmerzwahrnehmung, kein Geschmack.",
        difficulty = 5,
        funFact = "TRPV1 wird auch durch Säuren (niedrigen pH) aktiviert — deshalb wirken Chili und Zitronensäure auf ähnlichen Rezeptoren und können sich gegenseitig verstärken."
    ),

    // Question 42 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Welches Phänomen erklärt warum Wein beim Dekantieren an Aroma gewinnt und was passiert molekular?",
        answerA = "CO₂ entweicht beim Dekantieren und setzt gebundene Aromen frei",
        answerB = "Ethanol verdampft beim Dekantieren was den Alkohol-Geschmack reduziert",
        answerC = "Temperaturangleich beim Dekantieren aktiviert schlafende Aromamoleküle",
        answerD = "Sauerstoff oxidiert Schwefelverbindungen (Mercaptane) → reduziert Fehlaromen; oxidiert Polyphenole teilweise → mildert Tannin-Adstringenz",
        correctAnswer = 3,
        explanation = "Durch Belüftung beim Dekantieren oxidiert Sauerstoff: Reduzierte Schwefelverbindungen (H₂S, Methylmercaptan — Fehlaromen) werden zu geruchlosen Sulfaten oxidiert. Polyphenol-Tannine werden durch milde Oxidation und Polymerisation zu größeren Polymeren, die weniger mit Proteinen der Mundschleimhaut interagieren → reduzierte Adstringenz. Außerdem gibt das Schwenken flüchtige Aromen frei.",
        difficulty = 5,
        funFact = null
    ),

    // Question 43 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Retronasal Olfaction' und warum ist sie wichtiger als orthonasal für die Geschmackswahrnehmung beim Essen?",
        answerA = "Retronasal beschreibt Geruchswahrnehmung nach dem Schlucken; orthonasal beim Einatmen vor dem Essen — beide gleich wichtig",
        answerB = "Retronasal ist die Wahrnehmung von Grundgeschmäcken (süß, salzig); orthonasal von Aromen",
        answerC = "Flüchtige Aromastoffe steigen beim Kauen/Schlucken retronasal zum Riechepithel auf; ~80% des wahrgenommenen 'Geschmacks' ist retronasal Geruch",
        answerD = "Retronasal Olfaction tritt nur bei Weinverkostern auf durch jahrelange Übung",
        correctAnswer = 2,
        explanation = "Beim Kauen und Schlucken werden durch Wärme und mechanische Zerleinerung Aromastoffe freigesetzt und steigen über den Nasopharynx retronasal zum Riechepithel. Studien zeigen: ~80% des wahrgenommenen 'Geschmacks' ist retronasal Geruch. Orthonasal (durch die Nasenöffnungen) nimmt man nur Gerüche wahr bevor das Essen im Mund ist. Bei Schnupfen verliert man retronasal — Essen 'schmeckt nach nichts'.",
        difficulty = 5,
        funFact = "Gordon Shepherd (Yale) prägte den Begriff 'Neurogastronomy' — die Wissenschaft dass Geschmack im Gehirn konstruiert wird, nicht im Mund."
    ),

    // ── LEBENSMITTELTECHNOLOGIE & KONSERVIERUNG ───────────────────────────────

    // Question 44 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Ultrahocherhitzung' (UHT) von Milch und warum übersteht sie bei 135–150 °C für 2–8 Sekunden die D-Wert-Anforderungen?",
        answerA = "UHT denaturiert alle Vitamine um Bakterien die Nährstoffe zu entziehen",
        answerB = "Bakteriensporen-Inaktivierung hat Q10 ~30–40; Proteindenaturierung hat Q10 ~2–3 — hohe Temperatur kurze Zeit tötet Sporen effizienter ohne Qualitätsverlust",
        answerC = "Bei 135°C sind alle Bakterien sofort tot da jede Zellwand schmilzt",
        answerD = "UHT nutzt Mikrowellen statt Hitze um Keime gezielt ohne Proteindenaturierung abzutöten",
        correctAnswer = 1,
        explanation = "Das Prinzip basiert auf unterschiedlichem Q10-Verhalten: Bakteriensporen-Inaktivierung hat Q10 ~30–40 (hoher Temperatur-Exponent der Arrhenius-Gleichung). Proteindenaturierung (Geschmack, Vitamine) hat Q10 ~2–3. Deshalb: Extrem hohe Temperatur kurze Zeit (135°C/2s) tötet Sporen genauso effektiv wie niedrige Temperatur lange Zeit (121°C/20min), schädigt aber Qualität viel weniger.",
        difficulty = 5,
        funFact = "UHT-Milch enthält ~20% weniger Vitamin B12 und Folsäure als Frischmilch, schmeckt aber durch Maillard-Reaktion (Lactulose-Bildung) leicht 'gekocht'."
    ),

    // Question 45 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Wasseraktivität' (aw) präzise definiert und warum ist aw = 0,85 eine kritische Grenze für Lebensmittelsicherheit?",
        answerA = "aw = p/p₀ (Dampfdruck des Lebensmittels / reines Wasser); unter aw 0,85 können die meisten pathogenen Bakterien (außer Staphylococcus aureus) nicht wachsen",
        answerB = "aw ist der prozentuale Wassergehalt; unter 85% Wassergehalt sind keine Bakterien lebensfähig",
        answerC = "aw misst die Wasserhärte in Lebensmitteln; aw 0,85 entspricht Trinkwasserqualität",
        answerD = "aw ist identisch mit relativem Wassergehalt und hat keine mikrobiologische Bedeutung",
        correctAnswer = 0,
        explanation = "Wasseraktivität aw = p/p₀ = Gleichgewichts-Relativfeuchte/100. Freies Wasser (thermodynamisch aktiv) bestimmt mikrobielles Wachstum. Grenzen: <0,91 = die meisten Bakterien (außer halotolerante) stoppen; <0,85 = S. aureus stoppt (HACCP-Grenzwert für viele Produkte); <0,80 = die meisten Schimmelpilze; <0,60 = keine Mikroorganismen. Honig (aw ~0,6) ist deshalb ohne Kühlung stabil.",
        difficulty = 5,
        funFact = null
    ),

    // Question 46 — correctAnswer = 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Hurdle-Technologie' und wie kombiniert sie Konservierungsparameter synergistisch?",
        answerA = "Physikalische Barrieren (Vakuumverpackung + Kühlung) die Bakterien mechanisch am Wachstum hindern",
        answerB = "Hurdle-Technologie ist ein anderer Begriff für Hochdruckpasteurisierung",
        answerC = "Kombination aller bekannten Konservierungsstoffe in maximalen Dosen für maximale Sicherheit",
        answerD = "Mehrere subletale Stressfaktoren (Hitze, niedriger pH, niedriger aw, Konservierungsstoffe, modifizierte Atmosphäre) werden kombiniert — zusammen überwältigen sie die Homöostase von Pathogenen",
        correctAnswer = 3,
        explanation = "Das Hurdle-Konzept (Leistner, 1978) besagt: Mikroorganismen müssen mehrere 'Hürden' überwinden um zu wachsen. Jede Hürde allein wäre tolerierbar. Kombination: pH 5,5 + aw 0,95 + 200 ppm Nitrit + 4°C + anaerobes Milieu. Die Bakterien können nicht alle Stressfaktoren simultan kompensieren (Homöostase-Zusammenbruch). Vorteil: Mildere Einzelbehandlungen → bessere Qualität.",
        difficulty = 5,
        funFact = "Leif Leistner entwickelte die Hurdle-Technologie ursprünglich für haltbare Fleischwaren in tropischen Ländern ohne Kühlung."
    ),

    // Question 47 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet 'Hochdruckpasteurisierung' (HPP, 300–600 MPa) von thermischer Pasteurisierung bezüglich des Ergebnisses?",
        answerA = "HPP ist eine Methode der Bestrahlung mit Gammastrahlung unter hohem Druck",
        answerB = "HPP erhitzt Lebensmittel auf 200°C durch adiabatische Kompression",
        answerC = "HPP inaktiviert vegetative Bakterien durch das Le-Chatelier-Prinzip (Volumenminimierung unter Druck) ohne thermische Denaturierung von Vitaminen und Aromen",
        answerD = "HPP verwendet ultrakurze Druckpulse die DNA mechanisch zerstören ohne die Lebensmittelstruktur zu verändern",
        correctAnswer = 2,
        explanation = "HPP wendet 300–600 MPa isostatischen Druck für 1–10 Minuten bei Raumtemperatur an. Le Chatelier: Hoher Druck begünstigt Reaktionen die das Volumen verringern → Volumenvergrößernde Prozesse (Zellmembran-Funktion, Protein-Faltung, Sporenkeimung) werden gehemmt. Vegetative Zellen werden inaktiviert. Kovalente Bindungen (Vitamine, Aromen) sind druckstabil → keine Hitzeschäden. Sporen bleiben aber druckresistent.",
        difficulty = 5,
        funFact = "Avocado-Guacamole und Fruchtsäfte werden seit den 1990er Jahren kommerziell mit HPP konserviert — die grüne Farbe bleibt erhalten ohne Farbstoffe."
    ),

    // ── ERNÄHRUNGSWISSENSCHAFT & BIOVERFÜGBARKEIT ─────────────────────────────

    // Question 48 — correctAnswer = 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Bioverfügbarkeit' eines Nährstoffs präzise und welche Faktoren beeinflussen die Bioverfügbarkeit von Nicht-Häm-Eisen?",
        answerA = "Anteil der absorbierten und metabolisch genutzten Menge; Nicht-Häm-Eisen (Fe³⁺): Vitamin C reduziert zu Fe²⁺ (besser absorbiert), Phytate/Oxalate hemmen, Gerbstoffe hemmen, Calciumphosphat hemmt",
        answerB = "Bioverfügbarkeit ist der Prozentsatz eines Nährstoffs der nicht durch Kochen zerstört wird",
        answerC = "Nur Vitamine haben Bioverfügbarkeit; Mineralstoffe werden immer vollständig absorbiert",
        answerD = "Bioverfügbarkeit beschreibt wie schnell ein Nährstoff vom Magen in den Darm gelangt",
        correctAnswer = 0,
        explanation = "Bioverfügbarkeit = Anteil der absorbierten und physiologisch nutzbaren Menge relativ zur aufgenommenen Menge. Nicht-Häm-Eisen (Fe³⁺, aus Pflanzen): Absorption 2–20%. Fördernd: Ascorbinsäure (reduziert Fe³⁺ → Fe²⁺ am Transportrezeptor DMT1), organische Säuren. Hemmend: Phytinsäure (Chelatkomplexe), Polyphenole/Tannine (Tee, Kaffee), Oxalsäure (Spinat), Calcium, Zink (Konkurrenztransport).",
        difficulty = 5,
        funFact = "Hämoglobin-Eisen (Häm-Eisen, Fe²⁺) aus Fleisch wird zu 20–35% absorbiert — unabhängig von Hemmfaktoren. Deshalb ist die Bioverfügbarkeit aus Fleisch deutlich höher als aus Hülsenfrüchten."
    ),

    // Question 49 — correctAnswer = 1
    Question(
        categoryId = 8,
        questionText = "Was ist die 'glykämische Last' (GL) im Unterschied zum glykämischen Index (GI) und warum ist GL aussagekräftiger?",
        answerA = "GL ist der GI multipliziert mit dem Fettgehalt; höheres Fett verlangsamt Glukoseaufnahme",
        answerB = "GL = GI × verfügbare Kohlenhydrate (g) / 100; GL berücksichtigt die tatsächliche Portion und Kohlenhydratmenge, GI nur die Blutglukose-Reaktionsqualität pro 50g Kohlenhydrate",
        answerC = "GL misst absolute Blutzucker-Erhöhung in mg/dL; GI misst nur die Kurvenform",
        answerD = "GL und GI sind identisch aber GL wird in anderen Einheiten gemessen",
        correctAnswer = 1,
        explanation = "GL = (GI × verfügbare Kohlenhydrate in g) / 100. Wassermelone hat einen hohen GI (~72) aber sehr niedrige GL (~4 pro 120g Portion) — da 120g Wassermelone nur ~6g verfügbare KH enthält. Weißbrot: GI ~70, GL ~10 pro Scheibe (15g KH). Die GL spiegelt den tatsächlichen Einfluss einer realistischen Portion auf den Blutglukosespiegel wider, der GI ist ein abstraktes Konzept bei 50g-KH-Portionen.",
        difficulty = 5,
        funFact = null
    ),

    // Question 50 — correctAnswer = 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Lykopin' und welche lebensmittelwissenschaftliche Besonderheit gilt für seine Bioverfügbarkeit aus Tomaten?",
        answerA = "Lykopin ist ein Polyphenol das durch Erhitzen vollständig zerstört wird",
        answerB = "Lykopin ist ein wasserlösliches Antioxidans das am besten aus rohen Tomaten absorbiert wird",
        answerC = "Lykopin ist ein rotes Carotinoid in Tomaten; Bioverfügbarkeit steigt durch Erhitzen (cis-Isomerisierung) und Zugabe von Fett (lipophiler Transport im Darm)",
        answerD = "Lykopin bildet beim Erhitzen mit Proteinen unlösliche Komplexe die nicht absorbiert werden",
        correctAnswer = 2,
        explanation = "Lykopin (C₄₀H₅₆) ist das rote Carotinoid (kein Provitamin A) in Tomaten. In rohen Tomaten liegt es als all-trans-Isomer in Chromoplasten eingeschlossen vor — schlechte Bioverfügbarkeit (~10%). Erhitzen: Zellstruktur zerstört (Freisetzung), trans→cis-Isomerisierung (cis-Lykopin wird besser absorbiert). Fett: Lykopin ist lipophil, wird in Chylomikronen verpackt → Tomatensauce mit Olivenöl = optimale Lykopin-Aufnahme.",
        difficulty = 5,
        funFact = "Lykopin-Konzentrationen im Blut werden epidemiologisch mit reduziertem Prostatakrebsrisiko assoziiert — jedoch zeigen kontrollierte Studien noch keinen eindeutigen kausalen Beweis."
    )

)
