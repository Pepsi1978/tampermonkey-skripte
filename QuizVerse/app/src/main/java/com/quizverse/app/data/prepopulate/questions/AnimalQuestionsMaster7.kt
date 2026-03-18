package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun animalQuestionsMaster7(): List<Question> = listOf(

    // ── BIOACOUSTICS (15 questions, difficulty = 5) ──────────────────────────

    Question(
        categoryId = 9,
        questionText = "Welcher Frequenzbereich dominiert die Gesaenge des Blauwals (Balaenoptera musculus) und dient zur Fernkommunikation ueber hunderte Kilometer?",
        answerA = "500 bis 2000 Hz (Mittelfrequenz)",
        answerB = "10 bis 40 Hz (Infraschallbereich)",
        answerC = "2000 bis 8000 Hz (Hochfrequenz)",
        answerD = "8000 bis 20000 Hz (Ultraschallbereich)",
        correctAnswer = 1,
        explanation = "Blauwale produzieren Rufe im Infraschallbereich von ca. 10 bis 40 Hz. Diese sehr niedrigen Frequenzen koennen sich mit minimalem Energieverlust ueber Tausende von Kilometern im Ozean ausbreiten und ermoeglichten historisch Kommunikation ueber Ozeanbecken hinweg.",
        difficulty = 5,
        funFact = "Vor der industriellen Laermverschmutzung konnten Blauwale moeglicherweise den gesamten Atlantischen Ozean akustisch ueberbruecken. Der Schallkanal SOFAR (Sound Fixing and Ranging) verstaerkt diesen Effekt."
    ),

    Question(
        categoryId = 9,
        questionText = "Was unterscheidet FM-Rufe (Frequency-Modulated) von CF-Rufen (Constant-Frequency) bei der Fledermaus-Echolokation funktionell?",
        answerA = "FM-Rufe liefern praezise Entfernungsbestimmung, CF-Rufe ermitteln Doppler-verschobene Flatterechos zur Beuteerkennung",
        answerB = "CF-Rufe werden nur bei Dunkelheit eingesetzt, FM-Rufe auch tagsueber",
        answerC = "FM-Rufe sind ausschliesslich fuer Sozialruf-Signale reserviert",
        answerD = "CF-Rufe haben generell hoehere Frequenzen als FM-Rufe",
        correctAnswer = 0,
        explanation = "FM-Rufe mit schnell fallender Frequenz erzeugen kurze Pulse mit breitem Frequenzband, was praezise Laufzeitmessung und damit Entfernungsbestimmung erlaubt. CF-Rufe mit konstanter Frequenz erzeugen lange Pulse, an denen die Doppler-Verschiebung durch Flatterbewegungen der Beute detektiert werden kann (Flatter-Detektion nach Schnitzler).",
        difficulty = 5,
        funFact = "Hufeisennasenfledermaeuse (Rhinolophidae) kompensieren aktiv die Doppler-Verschiebung: Sie senken ihre Ruffrequenz, sodass das Echo immer bei der optimalen Hoerfrequenz von ca. 83 kHz ankommt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Hirnregion im Nucleus HVC (offiziell: HVC, frueher 'High Vocal Center') des Vogels projiziert direkt zum rostralen Arcopallium (RA) und ist unabdingbar fuer die motorische Ausgabe des Gesangs?",
        answerA = "Area X im medialen Striatum",
        answerB = "Nucleus LMAN (Lateral Magnocellular Nucleus of the Anterior Nidopallium)",
        answerC = "HVC-Projektionsneurone zum RA (HVC→RA-Pfad)",
        answerD = "Nucleus uvaeformis (Uva) im Thalamus",
        correctAnswer = 2,
        explanation = "Der HVC→RA-Pfad ist der direkte motorische Weg (anteriorer forebrain pathway ist fuer Lernen zustaendig). HVC-Neurone projizieren direkt zum RA (rostrales Arcopallium), das wiederum den Nucleus hypoglossus (nXIIts) steuert, welcher die Syrinx kontrolliert. Ohne diesen Pfad ist kein Gesang moeglich.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Frequenz nutzen afrikanische Elefanten (Loxodonta africana) primaer fuer Infrasound-Kommunikation ueber mehrere Kilometer Distanz?",
        answerA = "200 bis 400 Hz",
        answerB = "80 bis 120 Hz",
        answerC = "14 bis 35 Hz",
        answerD = "1 bis 5 Hz",
        correctAnswer = 2,
        explanation = "Elefanten produzieren Infrasound-Rufe hauptsaechlich im Bereich von 14 bis 35 Hz, weit unterhalb der menschlichen Hoerschwelle (20 Hz). Diese Rufe werden durch den Boden (Seismik) und die Luft uebertragen und koennen bei optimalen Bedingungen ueber 10 km reichen.",
        difficulty = 5,
        funFact = "Elefanten nehmen Infrasound-Vibrationen nicht nur ueber die Ohren, sondern auch ueber die Fussohlen und den Ruessel wahr, indem sie Bodenvibrationen sensorisch verarbeiten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Phaenomen beschreibt Payne & McVay (1971) in ihrer bahnbrechenden Studie zu Buckelwalglaesaengen (Megaptera novaeangliae)?",
        answerA = "Weibliche Buckelwale singen ausschliesslich waehrend der Laktation",
        answerB = "Alle singenden Buckelwale einer Population singen zur gleichen Zeit dasselbe Lied, das sich im Jahresverlauf graduell veraendert",
        answerC = "Buckelwal-Gesang besteht aus exakt 7 Frequenzbanden",
        answerD = "Buckelwale lernen Gesaenge nur durch direkten Koerperkontakt",
        correctAnswer = 1,
        explanation = "Payne & McVay (1971, Science) zeigten, dass alle maennlichen Buckelwale einer Population synchron dasselbe komplexe Lied singen. Dieses Lied veraendert sich progressiv: Neue Elemente werden hinzugefuegt und verbreiten sich wie kulturelle Evolution durch die Population.",
        difficulty = 5,
        funFact = "In pazifischen Populationen wurde beobachtet, dass neue Gesangsmuster aus australischen Populationen binnen weniger Jahre den gesamten Suedpazifik 'durchlaufen' haben — ein Beispiel fuer kulturelle Transmission bei Tieren."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Rolle spielt der anteriore Telencephalon-Pfad (AFP: HVC→Area X→DLM→LMAN→RA) im Vogelgesang-Lernen, verglichen mit dem direkten motorischen Pfad?",
        answerA = "Der AFP steuert die Atmung waehrend des Gesangs",
        answerB = "Der AFP ist fuer den erwaschsenen Kristallgesang unnotig; er vermittelt wahrend der Lernphase Variabilitaet und ermoeglicht Fehlerkorrektur durch auditorisches Feedback",
        answerC = "Der AFP produziert ausschliesslich weibliche Antwortrufe",
        answerD = "Der AFP reguliert die Gesangstemperatur durch Koerperwaerme-Feedback",
        correctAnswer = 1,
        explanation = "Der Anteriore Forebrain Pathway (AFP) ist fuer das Erlernen des Gesangs essentiell. LMAN-Laesionen im AFP verhindern Gesangslernen bei Jugenvoegeln und frieren bei Erwachsenen den Gesang ein. Der AFP erzeugt Variabilitaet (Exploration), die durch reinforcement learning durch den auditorischen Feedback-Vergleich mit dem Tutorgesang schrittweise reduziert wird.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der 'acoustic rosette' Effekt, den Alvin Norden bei Grindwalen (Globicephala) beschrieb, und wie entsteht er?",
        answerA = "Ein visuelles Muster im Melossonar durch Luftblasen-Emission",
        answerB = "Ein Mehrelement-Klick-Buendel, bei dem einzelne Klicks zeitlich versetzt sind und ein rosetten-foermiges Interferenzmuster erzeugen",
        answerC = "Die kreisfoermige Anordnung mehrerer Tiere beim kooperativen Echolotieren",
        answerD = "Eine Reflexion von Sonar-Signalen an der Meeresoberflaeche",
        correctAnswer = 2,
        explanation = "Grindwale und verwandte Delfine erzeugen manchmal 'buzz'-artige Klickbuendel, bei denen mehrere Klicks mit definiertem Zeitversatz ausgestrahlt werden. Diese erzeugen im Fernfeld durch Interferenz rosetten-aehnliche Strahlungsmuster, die moeglicherweise die Beutedetektion verbessern.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche neurochemische Besonderheit erklaert die saisonale Plastizitaet des HVC-Volumens beim Zebrafinken (Taeniopygia guttata) und anderen Singvoegeln?",
        answerA = "Erhoehte GABA-Konzentration im Fruehjahr hemmt Neurogenese",
        answerB = "Testosteron stimuliert Neurogenese im HVC durch BDNF-Signalwege, was saisonal zu Volumenzunahme fuehrt",
        answerC = "Melatonin blockiert Synaptogenese im HVC waehrend der Brutzeit",
        answerD = "Cortisol-Spitzen im Herbst loesen HVC-Apoptose aus",
        correctAnswer = 1,
        explanation = "Testosteron, erhoht in der Brutzeit, aktiviert BDNF (Brain-Derived Neurotrophic Factor) und fuer foerdert neue Neuronen aus dem Ventricularzone ins HVC (adult neurogenesis). Das HVC-Volumen kann bei Kanarien im Fruehling bis zu 40% groesser sein als im Herbst. Dieser Befund von Nottebohm (1981) war ein Meilenstein: Er zeigte adulte Neurogenese im Saeuger- und Vogelhirn.",
        difficulty = 5,
        funFact = "Fernando Nottebohms Entdeckung der saisonalen Neurogenese im Vogelgehirn (1981) revolutionierte die Neurowissenschaft — bis dahin galt das Dogma, dass Saeugetiere keine neuen Neuronen bilden."
    ),

    Question(
        categoryId = 9,
        questionText = "Mit welcher Methode koennen Forscher aus passiven akustischen Aufnahmen den Standort eines rufenden Wals mit wenigen Metern Genauigkeit triangulieren?",
        answerA = "Fourier-Analyse mit einfacher Hydrofonanlage",
        answerB = "TDOA (Time Difference of Arrival) an einem Array mehrerer Hydrofone kombiniert mit Beamforming",
        answerC = "Spektrogramm-Kreuzkorrelation mit einem einzigen Hydrofon",
        answerD = "Magnetfeld-Interferometrie durch Walrufe",
        correctAnswer = 1,
        explanation = "TDOA (Time Difference of Arrival) nutzt die minimalen Laufzeitunterschiede eines Signals zwischen mehreren Hydrofonen. Aus diesen Zeitdifferenzen lassen sich Hyperboloide berechnen, deren Schnittpunkt den Signalursprung liefert. Moderne Hydrofon-Arrays kombinieren dies mit Beamforming fuer sub-Grad-genaue Richtungsbestimmung.",
        difficulty = 5,
        funFact = "Das US-Militaer-SOSUS-Netz (Sound Surveillance System), urspruenglich zum Verfolgen sowjetischer U-Boote gebaut, wurde nach dem Kalten Krieg fuer Walforschung genutzt und lieferte bahnbrechende Daten ueber Blauwal-Verbreitung."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt der Begriff 'Lombard-Effekt' im Kontext der Tier-Bioakustik?",
        answerA = "Die Verlaengerung von Rufdauer bei sinkendem Umgebungslaerm",
        answerB = "Die unwillkuerliche Erhoehung der Ruflautstaerke als Reaktion auf Umgebungslaerm zur Aufrechterhaltung des Signal-Rausch-Verhaeltnisses",
        answerC = "Die Frequenzabsenkung von Vogelgesang in urbanen Gebieten",
        answerD = "Die Synchronisation von Rufrhythmen benachbarter Individuen",
        correctAnswer = 1,
        explanation = "Der Lombard-Effekt beschreibt die automatische Lautstaerkenanpassung von Rufen als Reaktion auf erhoehten Umgebungslaerm. Er wurde bei Voegelm Delfinen, Walen und Primaten nachgewiesen. Die Reaktion ist reflexartig und nicht bewusst gesteuert. Anthropogener Laerm (Schiffsverkehr, Staedtelarm) zwingt Tiere zu energetisch kostspieligen Laermerhoehungen.",
        difficulty = 5,
        funFact = "Nordatlantische Buckelwale haben seit den 1950ern die Lautstaerke ihrer Gesaenge um ca. 29 dB erhoeht — direkt korreliert mit dem angestiegenen Meereslaerm durch Containerschifffahrt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Mechanismus erklaert, warum Grosse Hufeisennasenfledermaeuse (Rhinolophus ferrumequinum) beim Aussenden von Ortungsrufen ihr Gehoerorgan aktiv 'deaktivieren'?",
        answerA = "Mittelohr-Muskel-Kontraktion (Tensor tympani und Stapedius) reduziert Trommelfell-Beweglichkeit und schuetzt so das Innenohr vor dem eigenen Schallpuls",
        answerB = "Ein Cerumen-Pfropf verschliesst den Gehoerkanal reflexartig",
        answerC = "Neuronale Inhibition im Colliculus inferior blockiert afferente Signale",
        answerD = "Die Cochlea senkt aktiv ihre Empfindlichkeit durch OHC-Depolarisation",
        correctAnswer = 0,
        explanation = "Fledermaeuse kontrahieren kurz vor dem Rufaussenden die Mittelohr-Muskeln (Tensor tympani und Stapedius). Diese Kontraktion steift die Gehoerknoehelchenkette, reduziert die Schallweiterleitung um bis zu 25-30 dB und schuetzt das empfindliche Innenohr vor dem 100-110 dB-Schallpuls des eigenen Ortungsrufes.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Funktion hat die fette Melonenstruktur (Melon) im Kopf von Zahnwalen bei der Echolokation?",
        answerA = "Sie dient als Resonanzkammer zur Frequenzverstaerkung",
        answerB = "Sie bricht und fokussiert den im Nasengang erzeugten Schall zu einem gerichteten Strahl im Vorwaertsbereich",
        answerC = "Sie absorbiert eingehende Echos und leitet sie ans Innenohr",
        answerD = "Sie reguliert den Wasserhaushalt und hat keine akustische Funktion",
        correctAnswer = 1,
        explanation = "Das Melon besteht aus Lipiden mit akustisch unterschiedlichen Eigenschaften, die sich gradientenartig veraendern. Diese akustische Linse buendelt die im Bereich des nasopharygealen Sacs erzeugten Klicks zu einem gerichteten Schallstrahl nach vorne. Die akustische Fokussierung durch das Melon ist entscheidend fuer praezise Echolokation.",
        difficulty = 5,
        funFact = "Das Melon des Delfins kann aktiv in seiner Form und damit seiner Fokussierungseigenschaft variiert werden — Delfine 'zoomen' akustisch aehnlich wie eine Kamera-Linse."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter dem 'acoustic scene analysis' Konzept nach Bregman (1994) in der Tier-Bioakustik?",
        answerA = "Die topografische Kartierung von Schallquellen im Lebensraum mittels GPS",
        answerB = "Die kognitive Faehigkeit des Hoerorgans, simultane akustische Signale aus dem Gesamtgemisch in separate 'Strome' (auditory streams) zu trennen",
        answerC = "Die Messung von Schallwellenreflexionen an Felsoberflaechen",
        answerD = "Die genetische Grundlage fuer artspezifische Rufpraeferenzen",
        correctAnswer = 1,
        explanation = "Auditory Scene Analysis (ASA) nach Bregman beschreibt, wie das Gehoersystem aus einem komplexen Schallgemisch ('Cocktail Party'-Problem) einzelne Quellen isoliert. Tiere nutzen Gestaltprinzipien: Frequenznaehe, Amplitudenmodulation, harmonische Beziehungen. Studien mit Voegelm Froesche und Insekten zeigen analoge Mechanismen zur 'cocktail party'-Verarbeitung.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche anatomische Besonderheit ermoeglicht Delphinen den Schallempfang ueber den Unterkiefer (jaw hearing)?",
        answerA = "Ein besonders dichter Knochen im Unterkiefer leitet Schall direkt ans Mittelohr",
        answerB = "Ein lipidgefuellter Kanal (acoustic fat) im Unterkiefer leitet Vibrationen zum akustisch isolierten Periotic bone des Innenohrs",
        answerC = "Die Zaehne des Unterkiefers fungieren als Antennen fuer Ultraschall",
        answerD = "Eine Membran im Mundbereich nimmt niederfrequente Gewaesserschwingungen auf",
        correctAnswer = 1,
        explanation = "Zahnwale empfangen Schall hauptsaechlich ueber einen lipidgefuellten Kanal im unteren Kiefer (mandibular fat pad). Dieser akustische Fett-Pfad leitet Schwingungen zum Periotic bone, das das Innenohr umgibt und bei Walen akustisch vom Schaedel isoliert ist — essentiell fuer raeumliches Hoeren unter Wasser.",
        difficulty = 5,
        funFact = "Das Innenohr der Wale ist im Gegensatz zu Landtieren akustisch vom Schaedel entkoppelt (durch Peribullar sinuses), was binauralem Hoeren unter Wasser erst ermoeglicht."
    ),

    Question(
        categoryId = 9,
        questionText = "In welchem Frequenzbereich liegt der 'pure tone'-Gesang des Nordatlantischen Blauwals (B. m. musculus), der von Stafford et al. (1999) erstmals systematisch kartiert wurde?",
        answerA = "25 Hz mit charakteristischen Frequenzglides nach oben",
        answerB = "12 bis 17 Hz als monotone Tone ohne Glides",
        answerC = "100 bis 200 Hz modulierte Rufe",
        answerD = "Unter 5 Hz als quasi-statische Druckwellen",
        correctAnswer = 1,
        explanation = "Der 'Type B call' des Nordatlantischen Blauwals liegt bei ca. 12 bis 17 Hz und ist ein relativ reiner Ton ohne grosse Frequenzmodulation. Stafford et al. (1999, JASA) nutzten SOSUS-Daten fuer das erste globale akustische Monitoring und konnten saisonale Migrationen aus dem Rufmuster ableiten.",
        difficulty = 5,
        funFact = null
    ),

    // ── CHRONOBIOLOGY (15 questions, difficulty = 5) ─────────────────────────

    Question(
        categoryId = 9,
        questionText = "Welche molekulare Interaktion bildet die negative Rueckkopplungsschleife im zirkadianen TTFL (Transcription-Translation Feedback Loop) von Saeugetieren?",
        answerA = "CLOCK und NPAS2 hemmen direkt die CRY-Transkription im Cytoplasma",
        answerB = "CLOCK:BMAL1-Heterodimer aktiviert Per- und Cry-Gene; PER:CRY-Komplex wandert in den Kern zurueck und hemmt CLOCK:BMAL1",
        answerC = "PER-Protein phosphoryliert BMAL1 direkt und inaktiviert es",
        answerD = "CRY hemmt ausschliesslich CLOCK durch Ubiquitin-vermittelten Abbau",
        correctAnswer = 1,
        explanation = "CLOCK und BMAL1 bilden einen Heterodimer, der als Transkriptionsfaktor an E-Box-Elemente bindet und die Expression von Per1/2 und Cry1/2 aktiviert. Die akkumulierten PER- und CRY-Proteine bilden einen Repressor-Komplex, translokatieren in den Kern und hemmen die CLOCK:BMAL1-Aktivitaet. Diese Hemmung dauert ca. 24 Stunden, bevor neues CLOCK:BMAL1 die Aktivierung erneuert.",
        difficulty = 5,
        funFact = "Jeffrey Hall, Michael Rosbash und Michael Young erhielten 2017 den Nobelpreis fuer Physiologie/Medizin fuer die Entdeckung dieser molekularen Uhrenmechanismen, primaer in Drosophila."
    ),

    Question(
        categoryId = 9,
        questionText = "Durch welchen Mechanismus synchronisiert der Suprachiasmatische Nucleus (SCN) im Hypothalamus periphere Uhren (z.B. Leber, Niere)?",
        answerA = "Direkte neuronale Projektion des SCN in alle peripheren Organe",
        answerB = "Hormonelle Signale (Cortisol, Melatonin) und autonomes Nervensystem regulieren zirkadiane Genexpression in peripheren Geweben",
        answerC = "Periphere Uhren sind autonom und werden nicht vom SCN beeinflusst",
        answerD = "Der SCN sendet ausschliesslich elektrische Signale ueber den Nervus vagus",
        correctAnswer = 1,
        explanation = "Der SCN synchronisiert periphere Uhren ueber mehrere Wege: (1) Cortisol-Rhythmus ueber HPA-Achse (Glukokortikoid-Response-Elemente aktivieren Clock-Gene), (2) Melatonin aus der Zirbeldruse signalisiert Dunkelheit, (3) Koerpertemperatur-Rhythmen und (4) das autonome Nervensystem modulieren zirkadiane Genexpression in Organen. Essen und Fasten koennen periphere Uhren vom SCN entkoppeln.",
        difficulty = 5,
        funFact = "Wenn Menschen oder Tiere zu unregelmassigen Zeiten essen, verschieben sich die Uhren der Leber und des Darms, waehrend der SCN weiterhin dem Licht-Dunkel-Zyklus folgt. Dies fuhrt zu 'innerer Desynchronisation' und erhoehtem Stoffwechselrisiko."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die molekulare Funktion von Casein Kinase 1 epsilon/delta (CK1e/d) im zirkadianen Uhrmechanismus der Saeugetiere?",
        answerA = "CK1e/d aktiviert BMAL1-Transkription durch Promoter-Methylierung",
        answerB = "CK1e/d phosphoryliert PER-Proteine und bestimmt durch sequentielle Phosphorylierung deren Abbaurate und nukleaere Translokation",
        answerC = "CK1e/d deaktiviert CRY durch Acetylierung im Cytoplasma",
        answerD = "CK1e/d ist ausschliesslich ein Licht-Signal-Transduktor im SCN",
        correctAnswer = 1,
        explanation = "CK1e und CK1d phosphorylieren PER1 und PER2 an multiplen Stellen. Bestimmte Phosphorylierungsmuster stabilisieren PER (verlangsamen Abbau und verlaengern die Periode), andere markieren PER fuer Ubiquitin-vermittelten proteasomalen Abbau durch beta-TrCP. Mutationen in CK1e (tau-Mutation im Hamster) verkuerzen die zirkadiane Periode drastisch auf ~20 Stunden.",
        difficulty = 5,
        funFact = "Die tau-Mutation im Syrischen Goldhamster (CK1e R178C) war der erste entdeckte zirkadiane Mutant in einem Saeugetier und lieferte den Beweis, dass circadiane Perioden genetisch determiniert sind."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie detektieren Saeugetiere Tageslange fuer saisonale Anpassungen, und welche Rolle spielt der SCN dabei?",
        answerA = "Melatonin aus der Haut registriert direkt UV-Licht und signalisiert Tageslange",
        answerB = "Der SCN integriert das Licht-Signal und steuert die Pinealdruse: Melatonin wird nur in der Dunkelphase sezerniert; die Dauer des Melatonin-Signals codiert Nachtlaenge (und damit Tageslange)",
        answerC = "Kortisol-Spiegel sind die primaeren Marker fuer Tageslange",
        answerD = "Der SCN projiziert direkt zur Hypophyse ohne Melatonin-Vermittlung",
        correctAnswer = 1,
        explanation = "Der SCN empfaengt Lichtinformationen ueber die retinohypothalamische Bahn (RHT) von intrinisch photosensitiven retinalen Ganglienzellen (ipRGC, mit Melanopsin). Der SCN koordiniert dann ueber den paraventrikulaeren Nucleus und das Rueckenmark die Melatonin-Synthese in der Pinealdruse: Melatonin wird nur nachts sezerniert. Die Dauer des Melatonin-Signals (lang im Winter, kurz im Sommer) wird von Zielorganen als Jahreszeiten-Information interpretiert.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tier zeigt das bekannteste Beispiel fuer einen zirkannualen (jaehrlichen) endogenen Rhythmus, der auch in konstanter Umgebung persistiert?",
        answerA = "Hauskatze (Felis catus) mit zirkannualem Schlaf-Wach-Rhythmus",
        answerB = "Goldmantel-Ziesel (Callospermophilus lateralis) mit endogenem zirkannualem Winterschlaf-Rhythmus",
        answerC = "Wanderheuschrecke (Locusta migratoria) mit autonomem Migrationsrhythmus",
        answerD = "Gemeine Tintenfisch (Sepia officinalis) mit zirkannualem Reproduktionszyklus",
        correctAnswer = 1,
        explanation = "Goldmantel-Ziesel (auch Golden-mantled ground squirrel) zeigen unter konstanten Laborbedingungen (konstante Temperatur, konstante Lichtbedingungen) einen endogenen zirkannualen Rhythmus von Winterschlaf und Aktivitaet. Arbeiten von Eric Pengelley in den 1960-70ern belegten, dass dieser Rhythmus eine Periode von ca. 11 Monaten hat und ohne externe Zeitgeber persistiert.",
        difficulty = 5,
        funFact = "Die endogene Periode des zirkannualen Rhythmus ist typischerweise nicht exakt 12 Monate, sondern weicht leicht ab (z.B. 11 Monate) — genau wie zirkadiane Uhren nicht exakt 24 Stunden zeigen ohne Zeitgeber."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Photoperiodismus' und welches molekulare Modell erklaert die Tageslangen-Messung bei Zugvoegelm?",
        answerA = "Photoperiodismus ist die Aenderung der Augengroesse in Abhaengigkeit von Lichtintensitaet; erklaert durch Pupillenreflex",
        answerB = "Photoperiodismus ist die physiologische Reaktion auf Tageslange; das Buelows-Modell erklaert die kritische Tageslange durch Koinzidenz eines zirkadianen Sensitivitaetsfensters mit Lichtstimulus",
        answerC = "Photoperiodismus bezieht sich auf lichtinduzierte Melanin-Synthese im Federkleid",
        answerD = "Photoperiodismus beschreibt die tageszeitliche Veraenderung der Lautstaerke bei Vogelgesang",
        correctAnswer = 1,
        explanation = "Photoperiodismus ist die Nutzung von Tageslange als Jahreszeitenindikator. Das Buelows External Coincidence Model (und das Internal Coincidence Model von Pittendrigh) erklaert: Ein zirkadianer Rhythmus schafft ein photosensitives Fenster. Trifft Licht auf dieses Fenster (bei langen Tagen), werden reproduktive Reaktionen ausgeloest. Bei Zugvoegelm reagiert das Gehirn direkt auf Licht ueber tiefe Photorezeptoren im Diencephalon.",
        difficulty = 5,
        funFact = "Bei Voegelm, aber auch beim japanischen Wachtelm befinden sich Photorezeptoren tief im Gehirn (tief-gehirnige Photorezeptoren). Selbst blinde Voegel zeigen Photoperiodismus, weil Licht durch den Schaedel zu diesen Rezeptoren gelangt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Funktion haben Cryptochrome (CRY1 und CRY2) speziell bei Zugvoegelm jenseits ihrer Rolle im zirkadianen Uhrwerk?",
        answerA = "CRY-Proteine in der Retina agieren als magnetosensitive Radikalpaar-Sensoren und koennen moeglicherweise das Erdmagnetfeld visualisieren (Magnetrezeption)",
        answerB = "CRY-Proteine regulieren ausschliesslich die Melanogenese des Federkleids",
        answerC = "CRY-Proteine synthetisieren Melatonin direkt in Netzhautzellen",
        answerD = "CRY-Proteine sind Temperaturrezeptoren im Hypothalamus",
        correctAnswer = 0,
        explanation = "Die Radikal-Paar-Hypothese der Magnetrezeption bei Voegelm (nach Ritz et al. 2000) postuliert, dass blaues Licht in der Retina Cryptochrome in einen angeregten Zustand versetzt, bei dem ein Radikalpaar entsteht. Die Spinzustaende dieses Radikalpaars werden durch das Erdmagnetfeld beeinflusst, was zu unterschiedlichen Reaktionsprodukten fuehrt und moeglicherweise ein magnetisches 'Bild' im Sehsystem erzeugt.",
        difficulty = 5,
        funFact = "Verhaltensstudien mit Europaischen Rotkehlchen (Erithacus rubecula) zeigen, dass die magnetische Kompassfunktion durch bestimmte Wellenlaengen (blaugruenes Licht) aktiviert wird und durch Radikal-fangende Chemikalien gestoert werden kann — starke Indizien fuer die CRY-Hypothese."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt der Begriff 'Masking' in der Chronobiologie und wie unterscheidet er sich von echter zirkadianer Kontrolle?",
        answerA = "Masking bezeichnet die Unterdrueckung von Schlaf durch Koffein, unabhaengig von Schlaftrieb",
        answerB = "Masking ist eine direkte, sofortige Verhaltensanderung als Reaktion auf Umgebungsreize (z.B. Licht aktiviert direkt Aktivitaet), ohne die innere Uhr zu versetzen; zirkadiane Kontrolle ist die endogene Rhythmik unabhaengig von externen Reizen",
        answerC = "Masking ist die Verschleierung des zirkadianen Signals durch Genexpression",
        answerD = "Masking bezeichnet die saisonale Blockierung von Melatonin-Synthese durch Licht",
        correctAnswer = 1,
        explanation = "Masking ist eine direkte physiologische/verhaltensmassige Reaktion auf externe Stimuli (z.B. Licht hemmt Aktivitaet bei nachtaktiven Tieren, unabhaengig von der inneren Uhr). Es ueberlagert ('maskiert') die echte zirkadiane Rhythmik. Echte zirkadiane Kontrolle persistiert auch in konstanter Dunkelheit (Freilauf). In Experimenten muss man Masking von zirkadianer Regulation unterscheiden.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Entdeckung von Menaker et al. (1968) an Huehnerembryonen revolutionierte das Verstaendnis zirkadianer Uhren?",
        answerA = "Huehnerembryonen synchronisieren ihren Rhythmus ausschliesslich durch maetternliches Cortisol",
        answerB = "Einzelne Huehnerretinazellen zeigen autonome, selbst-erhaltende zirkadiane Rhythmen in Melatonin-Synthese, unabhaengig vom SCN",
        answerC = "Das Huehner-Pineal reagiert als einziges Organ auf Tageslange",
        answerD = "Entfernung des SCN bei Huehnerembryonen zerstoert alle zirkadianen Rhythmen vollstaendig",
        correctAnswer = 1,
        explanation = "Menaker und Kollegen zeigten, dass das Pineal des Huhns (und spaeter isolierte Retina-Zellen) autonome zirkadiane Melatonin-Rhythmen aufrechterhalten koennen. Dies zeigte, dass zirkadiane Uhren nicht nur im SCN, sondern in peripheren Zellen existieren. Huhner (und andere Nichtsaeuger) haben ein 'dezentralisiertes' System mit multiplen autonomen Uhren.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Wie erklaert man die Phasenverschiebung (phase shift) des zirkadianen Rhythmus durch Lichtpulse mithilfe der Phasenantwortkurve (PRC)?",
        answerA = "Lichtpulse verschieben den Rhythmus immer in die gleiche Richtung, unabhaengig vom Zeitpunkt",
        answerB = "Die PRC zeigt, dass Lichtpulse am fruehen subjektiven Abend Phasennacheilung (delay) bewirken, am fruehen subjektiven Morgen Phasenvoreilung (advance), und in der subjektiven Tagmitte kaum Effekt haben",
        answerC = "Die PRC gilt nur fuer Saeugetiere, nicht fuer Insekten oder Voegel",
        answerD = "Lichtpulse verkuerzen immer die zirkadiane Periode, verschieben aber nicht die Phase",
        correctAnswer = 1,
        explanation = "Die Phasenantwortkurve (Phase Response Curve, PRC) ist ein fundamentales Werkzeug der Chronobiologie. Sie zeigt die Groesse und Richtung der Phasenverschiebung als Funktion des Zeitpunkts des Lichtpulses. Delay-Zone (fruehe Nacht): Licht verzoegert die Uhr. Advance-Zone (spaete Nacht): Licht verschiebt die Uhr vor. Dead Zone (subjektiver Tag): kaum Effekt. Dies erklaert Jetlag und saisonale Anpassung.",
        difficulty = 5,
        funFact = "Das Wissen ueber PRCs wird therapeutisch genutzt: Lichttherapie am Morgen bei Depressionen (Winter SAD), und die optimale Zeit fuer Melatonin-Einnahme zur Jetlag-Behandlung wird aus der PRC abgeleitet."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der 'non-parametric' Einfluss von Licht auf das zirkadiane System (nach Aschoffs parametrischem Modell verglichen mit dem diskreten Modell von Pittendrigh)?",
        answerA = "Parametrischer Einfluss: Licht veraendert kontinuierlich die Geschwindigkeit der Uhr proportional zur Intensitaet; nicht-parametrischer Einfluss: Licht wirkt als diskreter Impuls, der nur Phasenneueinstellungen ausloest",
        answerB = "Beide Modelle beschreiben identische Mechanismen mit verschiedenen Fachbegriffen",
        answerC = "Parametrisches Licht gilt nur fuer Tageslicht, nicht-parametrisch nur fuer Kunstlicht",
        answerD = "Nicht-parametrischer Einfluss bezieht sich auf die Wellenlaenge, parametrisch auf die Intensitaet",
        correctAnswer = 0,
        explanation = "Aschoffs parametrisches Modell: Licht modifiziert kontinuierlich die Laufgeschwindigkeit der inneren Uhr (Aftereffects, Circadian Rule). Pittendrighs diskretes Modell: Licht wirkt als Phasen-setzende 'Zeitgeber', die Uhr reagiert diskret auf Lichtpulse. Beide Mechanismen koexistieren. Das diskrete Modell erklaert PRC-Experimente, das parametrische erklaert Intensitaets-abhaengige Periodenlaengen (T = 24 +/- Intensitaet).",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Erkenntnis lieferten DeCoursey et al. (2000) in ihrer Studie ueber SCN-laesionierten Erdhoeernchen in freier Wildbahn?",
        answerA = "SCN-laesionierte Tiere schlafen mehr und zeigen reduzierte Aktivitaet",
        answerB = "SCN-laesionierte Tiere in der Natur zeigten stark erhoehte Praeadationsrate (3-5 mal hoeher), weil sie zeitlich fehlgeleitet waren und nachts aktiv wurden",
        answerC = "SCN-Laesion verbesserte das Ueberleben durch Flexibilitaet",
        answerD = "SCN-laesionierte Tiere synchronisierten ihren Rhythmus ueber soziale Zeitgeber",
        correctAnswer = 1,
        explanation = "DeCoursey et al. (2000, PNAS) fuehrten ein bahnbrechendes Freilandexperiment durch: SCN-laesionierten Mantelpfeiffer-Ziesel (Spermophilus tridecemlineatus) fehlten zirkadiane Rhythmen. In der freien Wildbahn wurden sie 3-5 mal haufiger praediert als Kontrolltiere, weil sie fehlgeleitet ausserhalb ihrer sicheren Aktivitaetsphase aktiv waren. Dies belegte den Ueberlebensvorteil zirkadianer Uhren.",
        difficulty = 5,
        funFact = "Dieses Experiment gilt als einer der ueberzeugendsten Beweise fuer den adaptiven Wert zirkadianer Uhren unter natuerlichen Bedingungen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Signalkaskade vermittelt die Licht-induzierte Phasenverschiebung im SCN auf molekularer Ebene?",
        answerA = "Licht aktiviert Melanopsin in ipRGC → glutamaterge Signaltransduktion zum SCN → NMDA-Rezeptor-Aktivierung → Ca2+-Influx → MAPK/ERK-Phosphorylierung → CRE-vermittelte Per1/Per2-Transkription",
        answerB = "Licht aktiviert Rhodopsin in Staebchen → serotonerge Projektion → 5-HT-Rezeptor im SCN → cAMP-Erhoehung → Bmal1-Transkription",
        answerC = "Licht aktiviert Melatonin-Rezeptoren im SCN direkt, ohne retinale Photorezeptoren",
        answerD = "Licht inhibiert SCN-Neurone durch GABA-Freisetzung aus der Retina",
        correctAnswer = 0,
        explanation = "Intrinisch photosensitive retinale Ganglienzellen (ipRGC) mit Melanopsin (OPN4) senden glutamaterge Signale ueber den Retinohypothalamischen Trakt (RHT) zum SCN. NMDA- und AMPA-Rezeptoraktivierung fuehrt zu Ca2+-Einstrom und Aktivierung von NO-Synthase und MAPK/ERK. ERK phosphoryliert CREB, das an CRE-Elemente in den Per1/Per2-Promotoren bindet und sofortige (within minutes) Gentranskription ausloest.",
        difficulty = 5,
        funFact = null
    ),

    // ── ANIMAL GENETICS (15 questions, difficulty = 5) ───────────────────────

    Question(
        categoryId = 9,
        questionText = "Was ist genomisches Imprinting und welches klassische Beispiel illustriert die elterliche Herkunfts-abhaengige Expression bei Saeugetieren?",
        answerA = "Genomisches Imprinting ist eine X-Chromosom-Inaktivierung bei maennlichen Embryonen",
        answerB = "Genomisches Imprinting bezeichnet die epigenetische Markierung bestimmter Gene, sodass nur das muetterliche oder vaeterlche Allel exprimiert wird; IGF2 (nur vaeterliches Allel aktiv) und H19 (nur muetterliches Allel aktiv) sind klassische Beispiele",
        answerC = "Genomisches Imprinting beschreibt die bevorzugte Expression von Genen des dominanten Elternteils",
        answerD = "Genomisches Imprinting ist die Methylierung aller Gene auf dem Y-Chromosom",
        correctAnswer = 1,
        explanation = "Beim genomischen Imprinting werden bestimmte Loci durch differentielle DNA-Methylierung und Histon-Modifikationen elterlich markiert. IGF2 (Insulin-like Growth Factor 2) wird nur vom vaeterlichen Chromosom transkribiert; das muetterliche Allel ist durch Methylierung am ICR (Imprinting Control Region) stillgelegt. H19, ein benachbartes nicht-kodierendes RNA-Gen, wird nur muetterlich exprimiert. Verlust des Imprintings fuehrt zu Beckwith-Wiedemann-Syndrom.",
        difficulty = 5,
        funFact = "Das Imprinting-Paradox: Aus evolutionstheoretischer Sicht (Genomischer Konflikt-Theorie nach Haig) konkurrieren vaeterliche Gene um maximales Ressourcenziehen vom Muttertier (hohe IGF2-Expression), waehrend muetterliche Gene die Ressourcen gerechter verteilen wollen (H19 hemmt IGF2 ueber Enhancer-Konkurrenz)."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher molekulare Mechanismus liegt dem Pruefung von Insekten-Geschlechtsbestimmung durch Haplo-Diploidie bei Hymenopteren (Bienen, Wespen) zugrunde?",
        answerA = "Maennchen entstehen durch maternale X-Inaktivierung bei haploiden Eiern",
        answerB = "Heterozygotie am csd-Locus (complementary sex determiner) bestimmt Weiblichkeit; haploide Tiere mit nur einem Allel und homozygote Diplode werden maennlich",
        answerC = "Maennchen entstehen durch die Aktivierung des SRY-Gens auf dem Y-Chromosom",
        answerD = "Haploide Tiere exprimieren ein spezifisches masculinization-Gen, das bei diploiden Tieren methyliert ist",
        correctAnswer = 1,
        explanation = "Bei Honigbienen (Apis mellifera) bestimmt der csd-Locus (complementary sex determiner) das Geschlecht. Heterozygot fuer csd → Weibchen. Haploide (mit nur einem csd-Allel) → Maennchen (Drohnen). Homozygot-diploid (zwei gleiche csd-Allele) → diploide Maennchen, die aber von Arbeiterinnen aufgefressen werden. csd kodiert ein SR-Protein (serine-arginine rich), das das Downstream-Spleissen von feminizer und Sex lethal beeinflusst.",
        difficulty = 5,
        funFact = "Inzucht ist fuer Bienen besonders schaedlich, da sie zu hoher Homozygotie am csd-Locus fuehrt und damit viele diploide Maennchen erzeugt, die das Volk schwaeschen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was sind QTL (Quantitative Trait Loci) und welches Beispiel belegt ihre Rolle bei Tierverhalten?",
        answerA = "QTL sind Einzelgen-Mutationen mit grossem Effekt auf qualitative Merkmale wie Fellfarbe",
        answerB = "QTL sind Chromosomenabschnitte, die statistisch mit quantitativen Merkmalen assoziiert sind; beim Bienenschwarm-Gen (hy) und defensivem Verhalten in afrikanisierten Bienen wurden spezifische QTL kartiert",
        answerC = "QTL beschreiben ausschliesslich mitochondriale Genloci",
        answerD = "QTL sind transposable Elemente, die das Verhalten epigenetisch regulieren",
        correctAnswer = 1,
        explanation = "Quantitative Trait Loci sind Chromosomensegmente, deren Allelvarianten mit messbaren, quantitativen Unterschieden im Phaenotyp korrelieren. Hunt et al. (1998) kartierte QTL fuer das defensive Verhalten afrikanisierter Honigbienen (Stichverhalten, Alarmpheromons-Reaktion) in mehreren Chromosomenregionen. Solche QTL-Analysen decken die polygene Architektur von Verhaltensmerkmalen auf.",
        difficulty = 5,
        funFact = "Afrikanisierte Bienen ('Killerbienen') entstanden aus der Hybridisierung zwischen europaeischen und afrikanischen Bienen (Apis mellifera scutellata) nach deren Einfuehrung in Brasilien 1956 durch Warwick Kerr."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Temperaturabhaengige Geschlechtsbestimmungs-System (TSD) nutzen Meeresschildkroeten und was ist der 'pivotal temperature'?",
        answerA = "Oberhalb einer bestimmten Temperaturschwelle entwickeln sich maennliche, darunter weibliche Tiere",
        answerB = "Unterhalb der Schwelltemperatur (pivotal temperature, ~29°C bei Meeresschildkroeten) entstehen Maennchen, oberhalb entstehen Weibchen; die Schwelltemperatur ist artspezifisch",
        answerC = "TSD bei Schildkroeten ist ein additives System: Maennchen entstehen bei kuehlen UND sehr heissen Temperaturen (Pattern II)",
        answerD = "Die Schwelltemperatur liegt bei allen Meeresschildkroeten einheitlich bei 32°C",
        correctAnswer = 1,
        explanation = "Bei Meeresschildkroeten (z.B. Chelonia mydas, Caretta caretta) gilt TSD Pattern Ia: unterhalb der artspezifischen Schwelltemperatur (pivotal temperature, ca. 28-30°C) entstehen Maennchen, oberhalb Weibchen. Der Klimawandel verschiebt Strandsandtemperaturen, was zu weiblich-dominierenden Populationen fuehrt. Der Great Barrier Reef-Bestand zeigte ~99% Weibchen in waermeren Nistplaetzen (Jensen et al. 2018).",
        difficulty = 5,
        funFact = "Der molekulare Mechanismus von TSD involviert Aromatase (CYP19A1): Bei hohen Temperaturen wird Aromatase hochreguliert, was Androgene in Ostrogene umwandelt und die weibliche Entwicklung foerdert. Aromatasehemmer koennen TSD-Tiere trotz hoher Temperatur maennlich machen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie entsteht das ZW-Geschlechtsbestimmungs-System bei Voegelm und welches Gen auf dem Z-Chromosom gilt als Schluessel-Kandidat?",
        answerA = "Das ZW-System ist analog zum XY-System: W-Chromosom traegt ein 'Weiblichkeitsgen' (Dmrt1W)",
        answerB = "Maennliche Voegel sind ZZ, weibliche ZW; DMRT1 (Doublesex and mab-3 related transcription factor 1) auf dem Z-Chromosom ist dosisabhaengig: ZZ hat doppelte DMRT1-Dosis, was Hoden-Entwicklung foerdert",
        answerC = "Das W-Chromosom kodiert ein SRY-Homolog, das Eierstocke induziert",
        answerD = "Beide Geschlechter tragen Z-Chromosomen; das W-Chromosom ist funktionslos",
        correctAnswer = 1,
        explanation = "Bei Voegelm sind Maennchen homogametisch (ZZ), Weibchen heterogametisch (ZW). Ein W-Chromosom-Testaktorgen fehlt. Stattdessen zeigen Smith et al. (2009, Nature): DMRT1 auf dem Z-Chromosom ist dosisabhaengig — ZZ-Embryonen haben doppelte DMRT1-Expression, was Sertoli-Zellen und Hodenenwicklung foerdert. Bei ZW-Embryonen ist eine DMRT1-Dosis nicht ausreichend, und muetterliche (? sog. HINT) Faktoren vom W-Chromosom koennen aktiv Eierstocke foerdern.",
        difficulty = 5,
        funFact = "Manche Voegel sind natuerliche Gynandromorphe: Eine Seite des Koerpers ist maennlich (ZZ), die andere weiblich (ZW). Da das Vogelgeschlecht zellautonomer gesteuert wird als bei Saeugetieren, bleibt jede Seite ihrem Karyotyp entsprechend."
    ),

    Question(
        categoryId = 9,
        questionText = "Welchen Mechanismus der epigenetischen Transgenerations-Vererbung demonstrierten Champagne & Meaney bei Ratten in Bezug auf muetterliches Pflegeverhalten?",
        answerA = "Muetterliches Lecken und Grooming-Verhalten veraendert DNA-Methylierung am GR (Glucocorticoid-Rezeptor)-Promotor im Hippocampus der Nachkommen, was HPA-Stressreaktivitaet dauerhaft beeinflusst",
        answerB = "Muetterliche Pflege veraendert Mikro-RNA-Expression in Spermatozoen der Nachkommen",
        answerC = "Erhoehtes Pflegeverhalten fuehrt zu Telomerverlust in Nachkommen-Somazellen",
        answerD = "Muetterliches Pflegeverhalten aendert Histonacetylierung in der Keimbahn, nicht im Soma",
        correctAnswer = 0,
        explanation = "Meaney und Champagne (2001-2003, Nature Neuroscience) zeigten: Ratten-Muetter mit hohem Licking & Grooming (LG) produzieren Nachkommen mit hoeherem GR-Expressionsniveaus im Hippocampus durch Demethylierung des GR-Exon 17-Promotors. Diese Nachkommen zeigen gedaempfte Stressreaktionen (weniger Cortisol). Das Muster uebertraegt sich verhaltensepigenetisch auf die F2-Generation durch das Pflegeverhalten der F1-Muetter.",
        difficulty = 5,
        funFact = "Das Experiment offenbarte, dass 'epigenetische Schalter' durch fruehkindliche Erfahrungen gesetzt werden und sogar generationenuebergreifend wirken koennen — ohne DNA-Sequenz-Aenderung."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Tiermodell-Experiment belegte erstmals, dass ein einziges Gen (foraging, for) das komplexe Nahrungssuchverhalten bei Taufliegen (Drosophila) stark beeinflusst?",
        answerA = "Rover- vs. Sitter-Phaenotypen in Drosophila-Larven korrelieren mit Allelvarianten des for-Gens (cGMP-abhaengige Proteinkinase PKG), wobei Rover (foR-Allel) weitlaeufigere Nahrungssuche zeigt",
        answerB = "Das fruitless-Gen bestimmt ob Fliegen Nahrung in Gruppen oder einzeln suchen",
        answerC = "Die doublesex-Mutation fuehrt zu veraendertem Fressverhalten",
        answerD = "Das period-Gen kontrolliert ob Fliegen tagsueber oder nachts nach Nahrung suchen",
        correctAnswer = 0,
        explanation = "Osborne et al. (1997, Science) zeigten, dass natuerliche Allele des for-Gens (foR = Rover, fos = Sitter) zu unterschiedlichem Nahrungssuchverhalten fuehren. foR-Larven wandern weiter waehrend der Futtersuche (Rover-Phaenotyp), fos-Larven bleiben lokaler (Sitter). for kodiert cGMP-abhaengige Proteinkinase (PKG). Rover ist dominant in Dichten Populationen adaptiv, Sitter bei niedrigen Dichten.",
        difficulty = 5,
        funFact = "Honiginnen mit erhoehter PKG-Aktivitaet (analog zu Rover) werden eher zu Sammlerinnen (forager), waehrend PKG-arme Bienen Ammenfunktionen ausueben — das Gen-Verhalten-Link erstreckt sich ueber Insekten-Arten hinweg."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt das 'green beard'-Konzept in der Evolutionsgenetik und welches reale Tier-Beispiel illustriert es?",
        answerA = "Green beards sind Gene, die optisch erkennbare Signale erzeugen UND gleichzeitig kooperatives Verhalten gegenueber Traegern desselben Zeichens kodieren; bei Feuerameisen (Solenopsis invicta) bestimmt ein Gp-9-Allel sowohl Pheromonsignale als auch Toleranz gegenueber mehrkoenigigen Kolonien",
        answerB = "Green beard beschreibt gruene Farbpigmente in Vogelfedern mit Verwandtschaftssignal",
        answerC = "Green beard ist ein Artefakt von Computersimulationen ohne reales Beispiel",
        answerD = "Green beard bezeichnet die Faehigkeit von Affen, Verwandte an Gesichtssymmetrie zu erkennen",
        correctAnswer = 0,
        explanation = "Richard Dawkins' Green Beard-Konzept: Ein einzelnes Gen (oder Genkomplex) kodiert ein erkennbares Signal UND kooperatives Verhalten gegenueber Individuen mit demselben Signal. Bei Feuerameisen (Solenopsis invicta) kontrolliert das Gp-9-Allel: BB-Individuen tolerieren nur einzelne Koeniginnen; Bb-Individuen tolerieren multiple Koeniginnen (polygyne Kolonien). BB-Arbeiterinnen toeten sogar Bb-Koeniginnen, die anders riechen.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Entdeckung machten Fitzpatrick et al. (2007) ueber epigenetische Regulation sozialen Verhaltens bei Eichhoeernchen-Grashopfermaeuschen (Peromyscus polionotus)?",
        answerA = "Vaeterlicherseits exprimiertes Peg3 (paternally expressed gene 3) im Hypothalamus reguliert elterliche Fuersorge; hohe Peg3-Expression korreliert mit erhoehter Pflegeintensitaet maennlicher Tiere",
        answerB = "H19-Imprinting bestimmt Dominanzhierarchie bei Peromyscus",
        answerC = "Methylierungsmuster im Promotor des OXTR-Gens (Oxytocinrezeptor) korrelieren mit Paarungstreue",
        answerD = "IGF2 imprinting-Verlust foerdert aggressives Verhalten bei Maennchen",
        correctAnswer = 0,
        explanation = "Peg3 (paternally expressed gene 3) ist ein imprinted Gen, das nur vom vaeterlichen Chromosom exprimiert wird. Es wird im Hypothalamus exprimiert und ist mit elterlichem Verhalten assoziiert. Peg3-knock-out-Maeuse zeigen reduziertes Saeugling-Retrieval und Brutpflege. Dies illustriert, wie genomisches Imprinting (Elterlicher Konflikt) direkt Verhaltenssysteme beeinflusst.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher genetische Mechanismus erklaert den Gruendereffekt (founder effect) bei Inseltierpopulationen und wie beeinflusst er genetische Drift von Verhaltensmerkmalen?",
        answerA = "Gruender-Populationen haben hoehere genetische Diversitaet als Festlandpopulationen durch neue Mutationen",
        answerB = "Ein kleines Gruender-Kontingent bringt nur einen Bruchteil der Ausgangspopulations-Allele mit; durch genetische Drift koennen seltene Allele (inkl. Verhaltensgene) fixiert oder verloren werden, was zu Verhaltensunterschieden fuehrt",
        answerC = "Gruendereffekte wirken ausschliesslich auf mitochondriale Gene, nicht auf Verhaltensgene",
        answerD = "Auf Inseln werden Verhaltensmerkmale ausschliesslich durch Inselgroesse bestimmt",
        correctAnswer = 1,
        explanation = "Bei kleinen Gruender-Populationen (Bottleneck) entscheidet der Zufall, welche Allele mitgebracht werden. Durch genetische Drift (staerker in kleinen Populationen) koennen spezifische Verhaltensallele zufallig fixiert werden. Beispiel: Insel-Fuchse (Urocyon littoralis) auf Kanalinseln zeigen reduzierte Scheu gegenueber Menschen — moeglicherweise durch Drift von Angst-Modulationsgenen in der Kleinpopulation.",
        difficulty = 5,
        funFact = "Galapagosdroesseln und andere Inselvoegel sind gegenueber Menschen bemerkenswert zutraulich — Darwin notierte bereits 1835, dass er Voegel mit seinem Hut fangen konnte. Dies koennte genetische Drift von Antipraedatorverhalten reflektieren."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche molekulargenetische Grundlage hat die Expression des AVPR1a-Gens (Arginin-Vasopressin Rezeptor 1a) fuer das Paarungssystem bei Wuestenmaeusen (Microtus)?",
        answerA = "Monogame Prairiewuehlmaeusen (M. ochrogaster) haben laengere Mikrosatelliten-Repeats (RS3) im Promotorbereich des AVPR1a-Gens im Ventral Pallidum, was zu hoeherem Rezeptorausdruck und staerkerer Paarbindung fuehrt",
        answerB = "Polygame Bergratten exprimieren AVPR1a im Hypothalamus hoeher als monogame Arten",
        answerC = "AVPR1a-Inaktivierung foerdert stets monogames Verhalten",
        answerD = "RS3-Laenge hat keine Korrelation mit AVPR1a-Expression oder Sozialverhalten",
        correctAnswer = 0,
        explanation = "Young et al. und Hammock & Young (2002-2005) zeigten: Prairiewuehlmaeuse (Microtus ochrogaster, monogam) haben laengere RS3-Mikrosatelliten-Repeat-Regionen im AVPR1a-Promotor als Bergwuehlmaeuse (M. montanus, promiskuoes). Laengere RS3 fuehren zu erhoehtem AVPR1a-Ausdruck im Ventral Pallidum/Nucleus accumbens. Transfektion von Prairiewuehlmaus-AVPR1a in polygame Bergwuehlmaeuse erhoeht die Partner-Praeferenz.",
        difficulty = 5,
        funFact = "Vole-Studien inspirierten kontroverse Spekulationen: Koennte AVPR1a-Variation beim Menschen Partnerbindungstendenzen beeinflussen? Walum et al. (2008) fanden bei Maennern Korrelationen zwischen RS3-Laenge und Beziehungsqualitaet — aber Replikationen waren inkonsistent."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt das Konzept der 'genetic toolkit' (genetisches Werkzeugset) in der EvoDevo, und wie illustriert es die Evolution von Tierverhalten?",
        answerA = "Genetic toolkits sind artspezifische Gensets ohne Konservierung ueber Phyla hinweg",
        answerB = "Hochkonservierte regulatorische Gene (Hox, Pax, Distalless) werden in verschiedenen Tierlinien fuer analoge strukturelle und Verhaltensmerkmale wiederverwendet; Veraenderungen in cis-regulatorischen Elementen erklaeren phenotypische Diversitaet bei konservierter Genfunktion",
        answerC = "Genetic toolkits beschreiben ausschliesslich Immunsystemgene die kreuzreaktiv sind",
        answerD = "Das Konzept gilt nur fuer morphologische, nicht fuer Verhaltensmerkmale",
        correctAnswer = 1,
        explanation = "Das Genetic Toolkit-Konzept (Carroll, Kingsley u.a.) zeigt: Viele Entwicklungsgene sind phylogenetisch tief konserviert (Hox-Gene, Pax6 fuer Augen, Distalless fuer Extremitaeten). Verhaltensrelevante Gene wie die monoaminergen Rezeptoren, Neuropeptide (Oxytocin-Homologe: Vasopressin/Oxytocin) und Ionenkanaele sind ebenfalls weitgehend konserviert. Evolutionare Diversifizierung erfolgt haeufig durch Aenderungen in cis-regulatorischen Elementen (Expressionsmuster), nicht im kodierten Protein selbst.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Entdeckung ueber den Einfluss von Transposablen Elementen (TEs) auf Gehirnfunktion und Verhalten machten Muotri et al. (2005) in Saeugetieren?",
        answerA = "TEs sind in neuronalen Vorlaeuferszellen (neural progenitor cells) aktiv und erzeugen somatische Mosaizismen: Verschiedene Neuronen eines Individuums haben unterschiedliche Genomsequenzen durch TE-Insertionen",
        answerB = "TEs sind im Gehirn vollstaendig methyliert und inaktiv",
        answerC = "TEs kodieren Neurotransmitter-Rezeptoren direkt",
        answerD = "TE-Aktivierung im Gehirn fuehrt immer zu neuronalen Krankheiten",
        correctAnswer = 0,
        explanation = "Muotri et al. (2005, Nature) zeigten, dass L1 (LINE-1) retrotransposable Elemente in neuralen Vorlaeufer-Stammzellen aktiv retrotransponieren. Dies fuehrt zu somatischem genomischem Mosaizismus: Verschiedene Neuronen eines Gehirns haben leicht unterschiedliche Genome. Diese neuronale 'genomische Diversitaet' wurde spaeter mit hippocampaler Funktion, Lernen und Gedaechtnis assoziiert.",
        difficulty = 5,
        funFact = "Der Mensch traegt ca. 500.000 L1-Kopien im Genom, von denen etwa 100 noch transpositionskompetent sind. Neuronale Diversitaet durch L1-Retrotransposition koennte zur enormen Komplexitaet individueller Gehirne beitragen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was sind die genetischen Grundlagen der Eusozialitaet bei Insekten, und welche Rolle spielen Supergene-Komplexe dabei?",
        answerA = "Eusozialitaet wird durch ein einzelnes dominantes Gen (sociality gene) bestimmt",
        answerB = "Soziale Organisation (monogyn vs. polygyn bei Ameisen) wird durch Supergene-Komplexe auf einem Chromosomen-Segment kontrolliert, das durch Chromosomeninversion als Einheit vererbt wird (z.B. Social B-chromosome bei Formica-Ameisen)",
        answerC = "Eusozialitaet entsteht ausschliesslich durch Epigenetik ohne genetische Grundlage",
        answerD = "Alle euso-zialen Insekten teilen dasselbe Kasten-Regulationsgen",
        correctAnswer = 1,
        explanation = "Wang et al. (2013) und Gardner et al. entdeckten bei Feuera Ameisen (Solenopsis invicta) und bei Formica-Ameisen, dass die soziale Kastenorganisation durch Chromosomeninversionen (Supergene) reguliert wird. Bei Formica bestimmt ein ~13 MB grosses Chromosomensegment (Social Chromosome, SB vs. Sb), ob eine Koenigin akzeptiert wird. SbSb-Individuen sterben als Embryonen; SBSb-Koeniginnen werden in polygynen Kolonien toleriert.",
        difficulty = 5,
        funFact = "Supergene sind genomische Regionen, in denen Chromosomeninversionen mehrere Gene 'zusammensperren' und als Einheit vererben. Dies verhindert Rekombination und haelt vorteilhafte Allel-Kombinationen zusammen — aehnlich wie es bei der Geschlechtsdetermination bei Papieren und Voegeln passiert."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Protokoll nutzen Bioacoustiker fuer die passive akustische Ueberwachung (PAM) von Fledermaeuspopulationen, und welcher Detektortyp liefert die besten Spektrogramme fuer die Artbestimmung?",
        answerA = "Heterodyne-Detektoren liefern die besten Spektrogramme durch direkte digitale Abtastung",
        answerB = "Frequenzdivisions-Detektoren (FD) teilen den Ultraschall durch einen festen Faktor; Zeitdehnungs-Detektoren (TE, Time Expansion) nehmen digital mit bis zu 500 kHz auf und expandieren die Wiedergabe 10-fach, was die hoechste spektrale Aufloesung liefert",
        answerC = "Nulldurchgangs-Analysatoren (ZCA) liefern das praeziseste Spektrogramm",
        answerD = "Einfache Elektret-Mikrofone sind ausreichend fuer die Artbestimmung aller Fledermaeuse",
        correctAnswer = 1,
        explanation = "Fuer wissenschaftliche Fledermausforschung sind Zeitdehnungs-Detektoren (Time Expansion, TE) der Goldstandard: Sie nehmen Ultraschall mit hoher Abtastrate (192-500 kHz) auf und geben ihn 10-fach gedehnt aus (also 10x langsamer), sodass Laute auf normalen Abspielgeraeten hoerbar und auf hochaufloesenden Spektrogrammen analysierbar werden. Heterodyne-Detektoren eignen sich nur zum Echtzeit-Hoeren eines engen Frequenzbandes.",
        difficulty = 5,
        funFact = "Moderne Fledermaus-Detektoren wie Pettersson D500X koennen mit 500 kHz abtasten und erlauben so die Darstellung von Rufstrukturen bis 250 kHz — noetig fuer Hochfrequenz-Arten wie Rhinolophus hipposideros (ca. 110 kHz)."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Erkenntnisse lieferte die Studie von Czeisler et al. (1999, Science) ueber die intrinsische Periode der menschlichen zirkadianen Uhr?",
        answerA = "Die intrinsische Periode des Menschen betraegt exakt 24 Stunden",
        answerB = "Die mittlere intrinsische Periode des Menschen betraegt 24,18 Stunden (nicht 25 Stunden wie fruehre Studien nahelegten); die Abweichung von ~11 Minuten ueber 24 Stunden wird taeglich durch Licht synchronisiert",
        answerC = "Die intrinsische Periode variiert je nach Alter zwischen 22 und 28 Stunden",
        answerD = "Ohne Zeitgeber driftet der Mensch sofort in einen 48-Stunden-Rhythmus",
        correctAnswer = 1,
        explanation = "Czeisler et al. (1999, Science) nutzen ein Forced Desynchrony-Protokoll (28-Stunden-Schlaf-Wach-Zyklus), um den endogenen Rhythmus vom Schlaf-Wach-Zyklus zu entkoppeln. Das Ergebnis: Die mittlere intrinsische Periode des Menschen betraegt 24,18 +/- 0,13 Stunden — sehr viel naeher an 24 Stunden als die frueheren Free-Run-Studien (die fuer 25 Stunden standen, aber durch Kunstlicht-Masking verzerrt waren).",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Technik ist der Goldstandard fuer die genomweite Kartierung von DNA-Methylierungsmustern bei Tieren und ermoeglicht epigenom-weite Assoziationsstudien (EWAS)?",
        answerA = "ChIP-seq mit Anti-Methylcytosin-Antikoerpern",
        answerB = "Whole Genome Bisulfit-Sequenzierung (WGBS): Bisulfit-Behandlung konvertiert unmethyliertes Cytosin zu Uracil (→ Thymin nach PCR), methyliertes Cytosin bleibt erhalten; Sequenzvergleich zeigt Methylierungsstatus jedes CpG im Genom",
        answerC = "RRBS (Reduced Representation Bisulfit Sequenzierung) ist identisch mit WGBS",
        answerD = "Methylierungs-spezifische PCR deckt alle CpG-Sites genomweit ab",
        correctAnswer = 1,
        explanation = "Whole Genome Bisulfit-Sequenzierung (WGBS) ist der technische Goldstandard fuer epigenomweite DNA-Methylierungsanalyse. Bisulfit deaminiert unmethyliertes Cytosin zu Uracil, waehrend 5-Methylcytosin (5mC) stabil bleibt. Nach PCR-Amplifikation und Sequenzierung zeigen C→T-Konversionen unmethylierte Positionen; erhaltene Cs sind methyliert. WGBS deckt das gesamte Methylom ab; RRBS reduziert auf CpG-reiche Regionen.",
        difficulty = 5,
        funFact = "WGBS war urspruenglich extrem teuer (>10.000 EUR pro Probe), aber durch Short-Read-Sequenzierer (Illumina NovaSeq) und Long-Read-Plattformen (PacBio, Oxford Nanopore — die 5mC direkt ohne Bisulfit detektieren) sind Methylom-Analysen jetzt routinemaessig einsetzbar."
    ),

)
