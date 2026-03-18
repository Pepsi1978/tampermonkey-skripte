package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun healthQuestionsExpert1(): List<Question> = listOf(

    // Question 1 -- Complement system: classical pathway initiation
    Question(
        categoryId = 16,
        questionText = "Welche Molekuelkombination initiiert den klassischen Weg der Komplementaktivierung direkt?",
        answerA = "C3b bindet an Bakterienoberflaechen und aktiviert Properdin",
        answerB = "C1q bindet an Fc-Regionen von IgG- oder IgM-Antikoerpern im Immunkomplex",
        answerC = "MBL bindet an Mannose-Reste und aktiviert MASP-Proteasen",
        answerD = "Faktor D spaltet Faktor B im alternativen Weg",
        correctAnswer = 1,
        explanation = "Im klassischen Komplementweg bindet C1q an die Fc-Regionen von IgG (ausser IgG4) oder IgM innerhalb eines Antigen-Antikoerper-Komplexes. Dies aktiviert C1r und C1s, die anschliessend C4 und C2 spalten und so den C3-Konvertase-Komplex C4b2a bilden.",
        difficulty = 4,
        funFact = "IgM ist bei der Komplementaktivierung wesentlich effizienter als IgG, da ein einziges IgM-Molekuel im Pentamer mehrere C1q-Bindungsstellen gleichzeitig besetzen kann."
    ),

    // Question 2 -- Complement system: membrane attack complex
    Question(
        categoryId = 16,
        questionText = "Welche Komponenten bilden den Membranangriffskomplex (MAC) des Komplementsystems?",
        answerA = "C3b, C4b und C2a in einem trimolekularen Porenprotein",
        answerB = "C5b, C6, C7, C8 und mehrere C9-Molekuele",
        answerC = "C1q, C1r, C1s als trimolekularer Initiationskomplex",
        answerD = "C3a und C5a als proinflammatorische Anaphylatoxine",
        correctAnswer = 1,
        explanation = "Der MAC entsteht durch sequenzielle Bindung von C5b, C6, C7 und C8, wonach mehrere C9-Molekuele polymerisieren und eine transmembranale Pore bilden. Durch diese Pore stroemen Ionen und Wasser ungehindert in die Zelle und fuehren zur osmotischen Lyse.",
        difficulty = 4,
        funFact = "Patienten mit genetischem C5-C9-Mangel sind besonders anfaellig fuer Infektionen durch Neisseria-Spezies, da der MAC fuer die Abtoelung dieser bekapselten Bakterien unverzichtbar ist."
    ),

    // Question 3 -- MHC class I vs class II presentation
    Question(
        categoryId = 16,
        questionText = "Welche Aussage zum Unterschied zwischen MHC-Klasse-I- und MHC-Klasse-II-Praesentation ist korrekt?",
        answerA = "MHC-I praesentiert endogene Peptide an CD8+-T-Zellen; MHC-II praesentiert exogene Peptide an CD4+-T-Zellen",
        answerB = "MHC-I praesentiert exogene Peptide an CD4+-T-Zellen; MHC-II praesentiert endogene Peptide an CD8+-T-Zellen",
        answerC = "Beide MHC-Klassen praesentieren identische Peptide, unterscheiden sich aber in der Signaltransduktion",
        answerD = "MHC-I wird nur auf antigenpraesenterenden Zellen exprimiert; MHC-II auf allen kernhaltigen Zellen",
        correctAnswer = 0,
        explanation = "MHC-Klasse-I-Molekuele befinden sich auf allen kernhaltigen Koerperzellen und praesentieren Peptide aus dem Zytosol (endogene Proteine) an zytotoxische CD8+-T-Zellen. MHC-Klasse-II sind auf professionellen APCs und praesentieren phagozytierten Peptide an Helfer-CD4+-T-Zellen.",
        difficulty = 4,
        funFact = "Viren haben Mechanismen entwickelt, die MHC-I-Expression zu hemmen, um der zytotoxischen Immunantwort zu entgehen -- NK-Zellen erkennen jedoch genau diesen Verlust und toeten solche Zellen ('missing self'-Hypothese)."
    ),

    // Question 4 -- Cytokines: TNF-alpha role
    Question(
        categoryId = 16,
        questionText = "Welche zentrale pathophysiologische Rolle spielt TNF-alpha beim septischen Schock?",
        answerA = "TNF-alpha hemmt die Neutrophilenrekrutierung und verzoegert die Erregerbekaempfung",
        answerB = "TNF-alpha induziert massiv Stickstoffmonoxid-Freisetzung aus Endothelzellen, was systemische Vasodilatation und Kapillarleck verursacht",
        answerC = "TNF-alpha aktiviert ausschliesslich die adaptiven Immunzellen und hat keine direkte Wirkung auf Gefaesse",
        answerD = "TNF-alpha foerdert die Thrombozytenbildung und verursacht so disseminierte Thrombosen",
        correctAnswer = 1,
        explanation = "TNF-alpha, in grosser Menge von Makrophagen bei gramnegativer Sepsis ausgeschuettet, stimuliert die endotheliale NO-Synthase. Die massiv erhoehte NO-Produktion fuehrt zu generalisierter Vasodilatation, erhoehter Gefaesspermeabilitaet (Capillary-Leak-Syndrom) und konsekutiv zum distributiven Schock.",
        difficulty = 4,
        funFact = "Anti-TNF-Antiko erper (z.B. Infliximab) revolutionierten die Behandlung von Autoimmunerkrankungen wie rheumatoider Arthritis -- erhoeht aber das Risiko fuer Reaktivierung latenter Tuberkulose."
    ),

    // Question 5 -- Interferon types and antiviral mechanisms
    Question(
        categoryId = 16,
        questionText = "Ueber welchen molekularen Mechanismus entfalten Typ-I-Interferone (IFN-alpha/beta) ihre antivirale Wirkung?",
        answerA = "Sie binden direkt an virale RNA-Polymerasen und blockieren die Replikation",
        answerB = "Sie aktivieren den JAK-STAT-Signalweg, der antiviral wirksame Proteine wie PKR und OAS hochreguliert",
        answerC = "Sie induzieren Apoptose ausschliesslich virusinfizierter Zellen durch Caspase-8-Aktivierung",
        answerD = "Sie hemmen die virale Proteinsynthese durch direkte Bindung an Ribosomen",
        correctAnswer = 1,
        explanation = "IFN-alpha/beta binden an den IFNAR-Rezeptor und aktivieren JAK1/TYK2, die STAT1 und STAT2 phosphorylieren. Der ISGF3-Komplex gelangt in den Kern und transkribiert Interferon-stimulierte Gene (ISGs), darunter PKR (blockiert Translation), OAS/RNase L (degradiert virale RNA) und Mx-Proteine.",
        difficulty = 4,
        funFact = "IFN-beta wird als Medikament bei schubfoermiger Multipler Sklerose eingesetzt -- der genaue Wirkmechanismus bei MS ist noch nicht vollstaendig entschluesselt."
    ),

    // Question 6 -- Th1/Th2 balance and autoimmunity
    Question(
        categoryId = 16,
        questionText = "Welche Aussage zur Th1/Th2-Balance bei Autoimmunerkrankungen ist korrekt?",
        answerA = "Organanspezifische Autoimmunerkrankungen wie Typ-1-Diabetes sind typischerweise Th2-vermittelt",
        answerB = "Systemischer Lupus erythematodes ist typischerweise Th1-dominiert, weil CD8+-T-Zellen die Haupteffektoren sind",
        answerC = "Viele organanspezifische Autoimmunerkrankungen (z.B. Typ-1-Diabetes, Hashimoto) sind Th1-dominiert; allergische Erkrankungen sind Th2-dominiert",
        answerD = "Eine Verschiebung zur Th2-Antwort foerdert immer Autoimmunitaet, waehrend Th1 schuetzt",
        correctAnswer = 2,
        explanation = "Th1-Zellen sezernieren IFN-gamma und IL-2 und foerdern zellvermittelte Immunreaktionen; sie dominieren bei organanspezifischen Autoimmunerkrankungen wie Typ-1-Diabetes oder Hashimoto-Thyreoiditis. Th2-Zellen sezernieren IL-4, IL-5, IL-13 und foerdern humorale Antworten sowie Allergien und Asthma.",
        difficulty = 4,
        funFact = "Die Hygiene-Hypothese besagt, dass mangelnde Th1-Stimulation durch Infektionen in der Kindheit eine Th2-Dominanz foerdert -- was die steigende Allergiepraevalenz in Industrielaendern erklaeren koennte."
    ),

    // Question 7 -- Molecular mimicry in autoimmunity
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter molekularem Mimikry als Mechanismus der Autoimmunitaet?",
        answerA = "Koerpereigene Zellen exprimieren virale Deckproteine, um der Immunantwort zu entgehen",
        answerB = "Strukturaehnlichkeit zwischen mikrobiellen Antigenen und koerpereigenen Proteinen fuehrt zur Kreuzreaktivitaet autoreaktiver Lymphozyten",
        answerC = "Viren integrieren ihr Genom in koerpereigene Gene und veraendern dadurch die Proteinstruktur",
        answerD = "Autoantiko erper imitieren die Struktur von Wachstumsfaktoren und stimulieren Zellproliferation",
        correctAnswer = 1,
        explanation = "Molekulares Mimikry beschreibt, dass Antigene eines Erregers strukturell koerpereigenen Proteinen aehneln. Die gegen den Erreger gerichteten Lymphozyten koennen kreuzreaktiv koerpereigenes Gewebe angreifen. Klassisches Beispiel: Streptokokken-M-Protein aehnelt Herzmuskelprotein -- Folge ist rheumatisches Fieber mit Karditis.",
        difficulty = 4,
        funFact = "Beim Guillain-Barre-Syndrom nach Campylobacter-jejuni-Infektion ahmt das Lipooligosaccharid des Bakteriums Ganglioside peripherer Nerven nach -- die resultierenden Antikoerper schadigen das periphere Nervensystem."
    ),

    // Question 8 -- Coagulation cascade: intrinsic vs extrinsic
    Question(
        categoryId = 16,
        questionText = "Welcher Faktor aktiviert den extrinsischen Gerinnungsweg, und durch welchen Stimulus wird er freigesetzt?",
        answerA = "Faktor XII wird durch Kontakt mit negativ geladenen Oberflaechen (z.B. Kollagen) aktiviert",
        answerB = "Gewebefaktor (TF/Faktor III) wird bei Gefaessverletzung aus subendothelialem Gewebe exponiert und aktiviert Faktor VII",
        answerC = "Faktor VIII bindet an von-Willebrand-Faktor und wird durch Thrombin aktiviert",
        answerD = "Faktor XI wird durch Kallikrein im Plasma aktiviert und startet die Kontaktaktivierung",
        correctAnswer = 1,
        explanation = "Der extrinsische Weg (tissue factor pathway) beginnt, wenn Gewebefaktor (TF, Faktor III) nach Gefaessschaedigung aus dem Subendothel freigelegt wird. TF bildet mit Faktor VIIa einen Komplex, der Faktor X und Faktor IX aktiviert und so die gemeinsame Endstrecke der Gerinnung einleitet.",
        difficulty = 4,
        funFact = "Der Quick-Test (PT/INR) prueft den extrinsischen und gemeinsamen Weg; die PTT prueft den intrinsischen Weg. Marcumar hemmt die Vitamin-K-abhaengigen Faktoren II, VII, IX und X."
    ),

    // Question 9 -- DIC pathophysiology
    Question(
        categoryId = 16,
        questionText = "Welcher pathophysiologische Ablauf erklaert die paradoxe Kombination aus Thrombosen und Blutungen bei der disseminierten intravasalen Gerinnung (DIC)?",
        answerA = "Haemolytische Anaemie fuehrt zu Thrombozytenstimulation und gleichzeitiger Koagulopathie",
        answerB = "Systemische Thrombinbildung verbraucht Gerinnungsfaktoren und Thrombozyten (Verbrauchskoagulopathie); gleichzeitig aktiviert Plasmin das fibrinolytische System",
        answerC = "Antithrombin-III-Ueberproduktion hemmt Thrombin, waehrend Faktor-Xa-Ueberfluss Thrombosen ausloest",
        answerD = "Disseminierte Endothelschaeden foerdern Plaque-Bildung ohne Beteiligung des Gerinnungssystems",
        correctAnswer = 1,
        explanation = "Bei DIC fuehren systemische Aktivatoren (Sepsis, Trauma, Tumore) zu unkontrollierter Thrombinbildung im gesamten Blutkreislauf. Kleingefaessthrombosen (Mikrothrombosen) beeintraechtigen Organe, waehrend der gleichzeitige Verbrauch von Fibrinogen, Faktoren V/VIII und Thrombozyten sowie reaktive Fibrinolyse zu lebensbedrohlichen Blutungen fuehren.",
        difficulty = 4,
        funFact = "Labor-Trias der DIC: erhoehte D-Dimere (Fibrinogenabbauprodukte), verlaengerte PTT und Quick, Thrombozytopenie und erniedrigtes Fibrinogen."
    ),

    // Question 10 -- von Willebrand disease
    Question(
        categoryId = 16,
        questionText = "Welche Doppelfunktion erfuellt der von-Willebrand-Faktor (vWF) in der Haemostase?",
        answerA = "vWF aktiviert Thrombin und hemmt gleichzeitig Antithrombin III",
        answerB = "vWF vermittelt die Thrombozytenadhaeision an subendotheliales Kollagen und traegt Faktor VIII im Plasma, schuetzt ihn vor Proteolyse",
        answerC = "vWF aktiviert Faktor X und foerdert die Fibrinpolymerisation",
        answerD = "vWF initiiert den intrinsischen Gerinnungsweg durch Kontakt mit Faktor XII",
        correctAnswer = 1,
        explanation = "vWF bindet nach Endothelverletzung an subendotheliales Kollagen und vermittelt die primaere Thrombozytenadhaeision ueber den GPIb-Rezeptor (besonders bei hohen Scherkraeften in Arteriolen). Zugleich zirkuliert vWF als Traegerprotein fuer Faktor VIII, der ohne vWF rasch proteolytisch abgebaut wuerde.",
        difficulty = 4,
        funFact = "Beim schweren Typ-3-von-Willebrand-Syndrom fehlt vWF nahezu vollstaendig, was auch zu einem sekundaeren Faktor-VIII-Mangel fuehrt -- das klinische Bild aehnelt dann der Haemophilie A."
    ),

    // Question 11 -- Starling law of the heart
    Question(
        categoryId = 16,
        questionText = "Was besagt das Frank-Starling-Gesetz des Herzens in Bezug auf Vorderlast und Schlagvolumen?",
        answerA = "Erhoehte Nachlast fuehrt proportional zu erhoehtem Schlagvolumen bis zu einem Maximum",
        answerB = "Innerhalb physiologischer Grenzen steigt das Schlagvolumen mit zunehmendem enddiastolischen Ventrikelvolumen (Vorderlast)",
        answerC = "Die Herzfrequenz bestimmt primaer das Schlagvolumen; Vorderlast ist bedeutungslos",
        answerD = "Hohe Vorderlast senkt immer das Schlagvolumen durch Myokarduberdehnung",
        correctAnswer = 1,
        explanation = "Das Frank-Starling-Gesetz beschreibt: Je mehr das Herz in der Diastole gefuellt wird (erhoehte Vorderlast, entspricht erhoehtem enddiastolischem Volumen), desto staerker kontrahiert es in der Systole und desto groesser ist das Schlagvolumen. Basis ist die verlaengerte Sarkomerlaenge mit optimiertem Aktin-Myosin-Overlap.",
        difficulty = 4,
        funFact = "Bei schwerem Herzversagen ist die Frank-Starling-Kurve nach unten verschoben und abgeflacht -- das Herz reagiert kaum noch auf erhoehte Vorderlast mit gesteigertem Output."
    ),

    // Question 12 -- Cardiac output determinants
    Question(
        categoryId = 16,
        questionText = "Das Herzzeitvolumen (HZV) ergibt sich aus Herzfrequenz mal Schlagvolumen. Welche vier Hauptdeterminanten bestimmen das Schlagvolumen?",
        answerA = "Vorderlast, Nachlast, Kontraktilitaet und Herzfrequenz",
        answerB = "Blutdruck, Haematokrit, Koerperoberflaeche und Herzgroesse",
        answerC = "Vorderlast, Nachlast, Kontraktilitaet -- die Herzfrequenz ist keine Schlagvolumdeterminante",
        answerD = "Sympathikustonus, Parasympathikustonus, Serumkalium und Herzklappenfunktion",
        correctAnswer = 2,
        explanation = "Das Schlagvolumen wird durch drei Faktoren bestimmt: Vorderlast (enddiastolisches Volumen -- Frank-Starling), Nachlast (aortaler Ausflusswiderstand, den das Herz ueberwinden muss) und Kontraktilitaet (Inotropie des Myokards). Die Herzfrequenz beeinflusst das HZV direkt, nicht jedoch das Schlagvolumen.",
        difficulty = 4,
        funFact = "Bei der Ejektionsfraktion (EF = Schlagvolumen / enddiastolisches Volumen) gilt EF > 55% als normal. Werte unter 40% definieren eine systolische Herzinsuffizienz."
    ),

    // Question 13 -- Ejection fraction and heart failure
    Question(
        categoryId = 16,
        questionText = "Worin besteht der pathophysiologische Unterschied zwischen HFrEF und HFpEF?",
        answerA = "HFrEF ist rein elektrisch bedingt; HFpEF entsteht durch mechanische Klappeninsuffizienz",
        answerB = "Bei HFrEF (reduzierte EF) ist die systolische Kontraktionsfunktion gestort; bei HFpEF (erhaltene EF) ist die diastolische Fuellungsrelaxation gestort, meist durch Myokardfibrose",
        answerC = "HFrEF betrifft nur den rechten Ventrikel; HFpEF betrifft nur den linken Ventrikel",
        answerD = "Beide Formen unterscheiden sich ausschliesslich klinisch, nicht pathophysiologisch",
        correctAnswer = 1,
        explanation = "HFrEF (EF <40%) entsteht durch systolische Dysfunktion -- das Myokard kontrahiert zu schwach (z.B. nach Myokardinfarkt). HFpEF (EF >50%) entsteht durch diastolische Dysfunktion -- ein versteiftes, fibrosiertes Myokard relaxiert nicht ausreichend und kann sich nicht normal fuellen, obwohl die Kontraktion noch normal ist.",
        difficulty = 4,
        funFact = "HFpEF betrifft haeufiger aeltere Frauen mit Hypertonie und Diabetes; fuer HFpEF gibt es noch keine bewiesenermassen mortalitaetssenkende Therapie."
    ),

    // Question 14 -- GFR and nephron function
    Question(
        categoryId = 16,
        questionText = "Welche Formel beschreibt die glomerulaere Filtrationsrate (GFR) nach dem Starling-Prinzip des Kapillars?",
        answerA = "GFR = Kf x [(Pglom - Pkapsel) - (pi_glom - pi_kapsel)]",
        answerB = "GFR = Urinvolumen x Kreatinin_Urin / Kreatinin_Plasma",
        answerC = "GFR = Herzfrequenz x Schlagvolumen / peripherer Widerstand",
        answerD = "GFR = (140 - Alter) x Gewicht / (72 x Kreatinin)",
        correctAnswer = 0,
        explanation = "Die GFR wird durch die Starling-Craefte bestimmt: Kf (Filtrationskoeffizient) multipliziert mit der Nettofiltrationskraft. Diese ergibt sich aus dem hydrostatischen Druck im Glomerulus minus dem Kapseldrucka und der onkotischen Druckdifferenz. Der Kf reflektiert die Durchlaessigkeit und Oberflaeche der Glomerulumbarriere.",
        difficulty = 4,
        funFact = "Antwort D ist die Cockcroft-Gault-Formel fuer die geschaetzte Kreatinin-Clearance -- sie wird klinisch haeufig als eGFR-Naehe verwendet, ist aber keine direkte Messung der GFR."
    ),

    // Question 15 -- Nephron: tubular reabsorption and secretion
    Question(
        categoryId = 16,
        questionText = "Welcher Nephronabschnitt ist primaer fuer die ADH-abhaengige Wasserrueckresorption verantwortlich?",
        answerA = "Proximaler Tubulus mit Na-Glucose-Kotransporter",
        answerB = "Dicker aufsteigender Schenkel der Henle-Schleife (TALH)",
        answerC = "Sammelrohr (collecting duct) durch Insertion von Aquaporin-2-Kanaelen",
        answerD = "Glomerulus durch erhoehten onkotischen Druck",
        correctAnswer = 2,
        explanation = "ADH (Vasopressin) bindet an V2-Rezeptoren im Sammelrohr und loest ueber cAMP-Kaskade die Exozytose von Aquaporin-2(AQP2)-Vesikeln in die apikale Membran aus. Dadurch wird die Zellmembran wasserdurchlaessig, und Wasser folgt dem osmotischen Gradienten des Nierenmarks in das Interstitium.",
        difficulty = 4,
        funFact = "Beim Diabetes insipidus zentralis fehlt ADH; beim nephrogenen Typ funktioniert der V2-Rezeptor nicht. Beide fuehren zu riesigen Mengen stark verduennten Urins (Polyurie bis 20 Liter/Tag)."
    ),

    // Question 16 -- Acid-base: Henderson-Hasselbalch
    Question(
        categoryId = 16,
        questionText = "Was ist die Henderson-Hasselbalch-Gleichung fuer das Bikarbonat-Kohlensaeure-Puffersystem, und welchen pH ergibt sie bei [HCO3-] = 24 mmol/l und pCO2 = 40 mmHg?",
        answerA = "pH = pKa - log([HCO3-] / [H2CO3]); ergibt pH 8,1",
        answerB = "pH = 6,1 + log([HCO3-] / (0,03 x pCO2)); ergibt pH 7,4",
        answerC = "pH = log([H+] / [OH-]); ergibt pH 6,8",
        answerD = "pH = pKa + log([H2CO3] / [HCO3-]); ergibt pH 7,1",
        correctAnswer = 1,
        explanation = "Die Henderson-Hasselbalch-Gleichung lautet: pH = 6,1 + log(HCO3- / (0,03 x pCO2)). Mit Normalwerten: pH = 6,1 + log(24 / (0,03 x 40)) = 6,1 + log(24 / 1,2) = 6,1 + log(20) = 6,1 + 1,301 = 7,4. Dies entspricht dem physiologischen Blut-pH.",
        difficulty = 4,
        funFact = "Der pKa-Wert von 6,1 erscheint fuer einen Puffer, der bei pH 7,4 arbeitet, suboptimal -- aber die enorme CO2-Exkretionskapazitaet der Lunge macht das Bikarbonat-System zum effektivsten Blutpuffer."
    ),

    // Question 17 -- Metabolic vs respiratory acidosis
    Question(
        categoryId = 16,
        questionText = "Ein Patient hat: pH 7,22 -- pCO2 28 mmHg -- HCO3- 11 mmol/l. Wie lautet die korrekte Interpretation?",
        answerA = "Respiratorische Azidose ohne Kompensation",
        answerB = "Metabolische Azidose mit respiratorischer Kompensation (Hyperventilation)",
        answerC = "Respiratorische Alkalose mit metabolischer Kompensation",
        answerD = "Gemischte Azidose ohne erkennbare Kompensation",
        correctAnswer = 1,
        explanation = "Das erniedrigte HCO3- (11 mmol/l) weist auf eine metabolische Azidose hin (Bikarbonatverlust oder Saeurezugewinn). Das erniedrigte pCO2 (28 mmHg statt 40 mmHg) zeigt die respiratorische Kompensation: der Koerper hyperventiliert, um CO2 auszublasen und den pH zu heben. Die Kussmaul-Atmung ist das klinische Korrelat.",
        difficulty = 4,
        funFact = "Die Winters-Formel erlaubt zu pruefen, ob die Kompensation adaequat ist: erwartetes pCO2 = 1,5 x HCO3- + 8 (+/- 2). Hier: 1,5 x 11 + 8 = 24,5 -- der gemessene Wert von 28 liegt ausserhalb, was eine superimponierte respiratorische Stoerung anzeigt."
    ),

    // Question 18 -- Bilirubin metabolism
    Question(
        categoryId = 16,
        questionText = "Welche Schritte der Bilirubinmetabolismus erklaeren den Unterschied zwischen praehepatiischem, intrahepatiischem und posthepatiischem Ikterus im Labor?",
        answerA = "Praehepatiisch: erhohtes indirektes (unkonjugiertes) Bilirubin durch Haemolyse; intrahepatiisch: erhoehtes direktes und indirektes Bilirubin; posthepatiisch: erhohtes direktes (konjugiertes) Bilirubin durch Cholestase",
        answerB = "Alle Ikterus-Formen zeigen ausschliesslich erhoehtes direktes Bilirubin",
        answerC = "Praehepatiisch zeigt Urobilinogen im Urin; posthepatiisch zeigt helles Bilirubin im Stuhl",
        answerD = "Indirektes Bilirubin ist in allen drei Formen gleich erhoht",
        correctAnswer = 0,
        explanation = "Hamolyse erhoht die Haem-Degradation zu unkonjugiertem (indirektem) Bilirubin, das die Leber nicht vollstaendig verarbeiten kann. Lebererkrankungen stoeren Aufnahme, Konjugation und Sekretion (beide Fraktionen erhoht). Obstruktionssikterus (z.B. Choledochusstein) verhindert die biliare Exkretion; konjugiertes (direktes) Bilirubin staut sich ins Blut und erscheint im Urin (Bierbrauner Urin).",
        difficulty = 4,
        funFact = "Der Stuhl wird bei posthepatiischem Ikterus hell (acholisch), weil kein Bilirubin in den Darm gelangt und dort nicht zu Stercobilin umgewandelt werden kann."
    ),

    // Question 19 -- Portal hypertension consequences
    Question(
        categoryId = 16,
        questionText = "Welche drei Hauptkomplikationen entstehen direkt aus dem erhoehten Portaldruck bei Leberzirrhose?",
        answerA = "Hepatorenal-Syndrom, Hepatopulmonales Syndrom und Encephalopathie (alle durch Toxine, nicht durch Druck)",
        answerB = "Oesophagusvarizen (portocavale Kollateralen), Aszites (Starling-Imbalance im Peritoneum) und spleenomegale Thrombozytopenie (Hypersplenismus)",
        answerC = "Koagulopathie, Hypoalbuminaemie und Hepatische Encephalopathie (metabolische Folgen)",
        answerD = "Diabetes mellitus Typ 2, arterielle Hypertonie und Nierenversagen",
        correctAnswer = 1,
        explanation = "Erhoehter Portaldruck (>10 mmHg) fuehrt direkt zu: 1) Erweiterung portocavaler Kollateralen (Oesophagusvarizen -- Blutungsrisiko!), 2) Aszites durch erhoehten hydrostatischen Druck im Pfortadersystem mit Albumin- und Volumenverlust, 3) Milzkongestion mit Sequestration und Abbau von Thrombozyten im Hypersplenismus.",
        difficulty = 4,
        funFact = "Das Caput Medusae -- sichtbare Venenzeichnung um den Nabel -- entsteht durch Rekanalisation der Vena umbilicalis als portocavale Kollaterale bei erheblicher portaler Hypertonie."
    ),

    // Question 20 -- Child-Pugh score
    Question(
        categoryId = 16,
        questionText = "Welche fuenf Parameter fliessen in den Child-Pugh-Score zur Beurteilung der Leberfunktion ein?",
        answerA = "Bilirubin, Albumin, Quick-Wert (INR), Aszites und hepatische Encephalopathie",
        answerB = "ALT, AST, GGT, AP und Bilirubin",
        answerC = "Bilirubin, Kreatinin, INR, Natrium und Encephalopathie-Grad (= MELD-Score)",
        answerD = "Albumin, Haemoglobin, Thrombozyten, Bilirubin und Pfortaderdurchmesser",
        correctAnswer = 0,
        explanation = "Der Child-Pugh-Score bewertet: 1) Serumbilirubin, 2) Serumalbumin, 3) Prothrombinzeit (INR/Quick), 4) Aszites (keiner/kontrollierbar/refraktaer), 5) Hepatische Encephalopathie (keine/Grad I-II/Grad III-IV). Punkte 5-6 = Klasse A (gut), 7-9 = B (mittel), 10-15 = C (schlecht).",
        difficulty = 4,
        funFact = "Der MELD-Score (Model for End-stage Liver Disease) hat den Child-Pugh teilweise abgeloest fuer Transplantationspriorisierung, da er Bilirubin, INR und Kreatinin objektiv misst ohne subjektive Einschaetzung."
    ),

    // Question 21 -- Pulmonary surfactant
    Question(
        categoryId = 16,
        questionText = "Welche biophysikalische Rolle spielt Surfactant in den Lungenblaeschen, und welche Erkrankung entsteht bei Friuehgeborenen durch Surfactantmangel?",
        answerA = "Surfactant erhoht die Oberflaechenspannung, was Atelektasen verhindert; bei Mangel entsteht Pneumonie",
        answerB = "Surfactant senkt die Oberflaechenspannung, verhindert Alveolarkollaps und erleichtert Inspiration; bei Mangel entsteht das infantile Atemnotsyndrom (IRDS)",
        answerC = "Surfactant ist ein Immunprotein, das Pathogene in den Alveolen opsonisiert",
        answerD = "Surfactant reguliert den pH der alveolaren Fluessigkeit; bei Mangel entsteht eine respiratorische Azidose",
        correctAnswer = 1,
        explanation = "Surfactant (Dipalmitoyl-Phosphatidylcholin, DPPC als Hauptkomponente) ist ein Phospholipid-Protein-Gemisch, das die Grenzflaechenspannung in kleinen Alveolen senkt. Ohne Surfactant wuerden kleine Alveolen gemaess La-Place-Gesetz kollabieren. Fruegeborene vor 34 SSW produzieren zu wenig Surfactant -- Folge: IRDS mit Atelektasen und Hypoxie.",
        difficulty = 4,
        funFact = "Kortikosteroide (Betamethason) werden Schwangeren gegeben, die vor der 34. SSW entbinden sollen, weil sie die fetale Surfactantproduktion stimulieren und das IRDS-Risiko halbieren."
    ),

    // Question 22 -- V/Q mismatch
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter einem V/Q-Missverhaeltnis, und wie erklaert es die Hypoxaemie bei Lungenembolie?",
        answerA = "V/Q-Missverhaeltnis beschreibt Ungleichgewicht zwischen Herzfrequenz und Atemfrequenz",
        answerB = "Bei Lungenembolie sind Bereiche gut ventiliert aber nicht perfundiert (hoher V/Q-Quotient = Totraum); venoses Blut umgeht unbetroffene Alveolen durch Shunts nicht",
        answerC = "Bei Lungenembolie sind Bereiche perfundiert aber nicht ventiliert (niedriger V/Q = Shunt), was direkt Hypoxaemie verursacht",
        answerD = "V/Q-Missverhaeltnis beschreibt nur Diffusionsstoerungen wie beim Lungenodem",
        correctAnswer = 1,
        explanation = "V/Q = Verhaeltnis von alveolaerer Ventilation (V) zu Perfusion (Q). Bei Lungenembolie sind embolisierte Lungenareale ventiliert, aber nicht durchblutet (V/Q = unendlich = Totraum). Kompensatorisch kommt es in angrenzenden Arealen durch Hypoxie-induzierte Vasokonstriktion zu einem Shunt-Effekt (V/Q niedrig), was gemeinsam Hypoxaemie erklaert.",
        difficulty = 4,
        funFact = "In der Lungenspitze ist das V/Q-Verhaeltnis beim Stehenden physiologisch am hoechsten (kaum Perfusion, gute Ventilation) -- Mycobacterium tuberculosis bevorzugt deshalb die sauerstoffreichen Lungenspitzen."
    ),

    // Question 23 -- ARDS pathophysiology
    Question(
        categoryId = 16,
        questionText = "Welcher pathophysiologische Kernmechanismus unterscheidet ARDS von kardiogenem Lungenodem?",
        answerA = "ARDS entsteht durch erhoehten hydrostatischen Kapillardruck bei Linksherz-insuffizienz; kardiogenes Oedem durch entzuendliche Permeabilitaetserhoehung",
        answerB = "ARDS entsteht durch entzuendlich bedingte Erhoehung der alveolo-kapillaeren Permeabilitaet (nichtkardiogenes Oedem); kardiogenes Oedem durch erhoehten hydrostatischen Druck bei Herzversagen",
        answerC = "Beide Erkrankungen teilen denselben Mechanismus; ARDS ist nur schwerer",
        answerD = "ARDS wird ausschliesslich durch Aspiration ausgeloest; kardiogenes Oedem durch ischaemische Herzerkrankung",
        correctAnswer = 1,
        explanation = "ARDS ist definiert durch diffuse alveolaere Schaedigung: Entzuendungsmediatoren (v.a. TNF-alpha, IL-1) schaedigen die alveolokapilaere Membran, die Permeabilitaet steigt, proteinreiches Oedem flutet die Alveolen. Der pulmonal-kapillaere Verschlussdruck (PCWP) ist normal (<18 mmHg), da kein Herzversagen vorliegt. Beim kardiogenen Oedem ist der hydrostatische Druck erhoht (PCWP >18 mmHg).",
        difficulty = 4,
        funFact = "Die Berlin-Definition des ARDS von 2012 klassifiziert nach PaO2/FiO2-Ratio: mild (200-300), moderat (100-200) und schwer (<100 mmHg) unter PEEP >= 5 cmH2O."
    ),

    // Question 24 -- Neurotransmitter: dopaminergic pathways
    Question(
        categoryId = 16,
        questionText = "Welche vier dopaminergen Bahnen im Gehirn sind fuer die Wirkungen und Nebenwirkungen von Antipsychotika relevant?",
        answerA = "Kortikospinal, rubrospinal, vestibulospinal und reticulospinal",
        answerB = "Nigrostriatale (Motorik), mesolimbische (Belohnung/Psychose), mesokortikale (Kognition) und tuberoinfundibulaere (Prolaktin)",
        answerC = "Raphekerne, Locus coeruleus, Substantia innominata und Nucleus basalis Meynert",
        answerD = "Glutamaterg, GABAerg, serotoninerg und cholinerge Bahnen",
        correctAnswer = 1,
        explanation = "Die vier dopaminergen Hauptbahnen: 1) Nigrostriatale Bahn (SN -> Striatum): Motorkoordination -- D2-Blockade verursacht extrapyramidale Nebenwirkungen. 2) Mesolimbische Bahn (VTA -> Limbisches System): Belohnung/Psychosesymptome -- therapeutisches Ziel. 3) Mesokortikale Bahn (VTA -> PFC): Kognition -- Blockade verschlechtert Negativsymptome. 4) Tuberoinfundibulaere Bahn (Hypothalamus -> Hypophyse): Prolaktinhemmung -- Blockade fuehrt zu Hyperprolaktinaemie.",
        difficulty = 4,
        funFact = "Clozapin bindet schwaecher an D2 aber stark an D4 und 5-HT2A -- es verursacht kaum extrapyramidale NW, aber erhoehtes Agranulozytose-Risiko (1%), weshalb woechentliche Blutbildkontrollen Pflicht sind."
    ),

    // Question 25 -- Blood-brain barrier structure
    Question(
        categoryId = 16,
        questionText = "Welche zellulare Struktur bildet die eigentliche Barriere in der Blut-Hirn-Schranke, und welche Zellen unterstuetzen deren Funktion?",
        answerA = "Perizyten bilden die Barriere; Astrozyten und Mikroglia spielen keine Rolle",
        answerB = "Zerebrale Kapillarendothelzellen mit Tight Junctions sind die eigentliche Barriere; Astrozytenendfuesse und Perizyten regulieren und erhalten diese",
        answerC = "Mikroglia bilden die Barriere durch fagozytierende Aktivitaet; Neurone regulieren die Permeabilitaet",
        answerD = "Oligodendrozyten umhuellen die Kapillaren und bilden so eine isolierende Schranke",
        correctAnswer = 1,
        explanation = "Die BHS besteht aus kontinuierlichen Kapillarendothelzellen, die durch Claudin-5 und Occludin bildende Tight Junctions fast vollstaendig abdichten. Astrozytenendfuesse (end-feet) umgeben 99% der Kapillaren und sezernieren Faktoren, die die Tight Junctions erhalten. Perizyten regulieren den Gefaesstonus und die Barriereinduktion.",
        difficulty = 4,
        funFact = "Hirntumore zerstoeren die BHS (erkennbar im Kontrastmittel-MRT), was paradoxerweise die Chemotherapie erleichtert -- in gesunden Hirnarealen kommt jedoch wenig Zytostatikum an."
    ),

    // Question 26 -- Demyelination: MS vs GBS
    Question(
        categoryId = 16,
        questionText = "Welcher fundamentale Unterschied unterscheidet die Demyelinisierung bei Multipler Sklerose (MS) von der beim Guillain-Barre-Syndrom (GBS)?",
        answerA = "MS demyelinisiert im peripheren Nervensystem; GBS im zentralen Nervensystem",
        answerB = "MS ist ZNS-Demyelinisierung (Oligodendrozyten betroffen); GBS ist PNS-Demyelinisierung (Schwann-Zellen betroffen)",
        answerC = "MS ist eine virale Infektion der Myelinscheide; GBS ist eine autoimmune Erkrankung",
        answerD = "Beide demyelinisieren im ZNS, MS jedoch langsam-progressiv, GBS akut",
        correctAnswer = 1,
        explanation = "Bei MS werden Oligodendrozyten im ZNS durch autoreaktive T-Zellen angegriffen -- entstehende Plaques sind nicht reparierbar (Oligodendrozyten regenerieren schlecht). Beim GBS attackieren Antiko erper (oft nach Infektion) das Myelin der Schwann-Zellen im PNS. Da Schwann-Zellen sich regenerieren koennen, erholen sich GBS-Patienten oft vollstaendig.",
        difficulty = 4,
        funFact = "GBS kann nach Zika-Virus-Infektion auftreten -- ein Musterbeispiel fuer molekulares Mimikry, bei dem Antikoerper gegen Virusproteine Schwann-Zell-Ganglioside kreuzreaktiv angreifen."
    ),

    // Question 27 -- Complement: lectin pathway
    Question(
        categoryId = 16,
        questionText = "Welches Protein initiiert den Lektin-Weg der Komplementaktivierung, und worin unterscheidet er sich vom klassischen Weg?",
        answerA = "C1q initiiert beide Wege; der Lektin-Weg aktiviert jedoch Faktor B statt C4",
        answerB = "Mannose-bindendes Lektin (MBL) erkennt Mannose-Muster auf Pathogenen ohne Antikoerper-Beteiligung und aktiviert MASP-1/2 anstelle von C1r/C1s",
        answerC = "Der Lektin-Weg wird durch IgA-Antikoerper initiiert und aktiviert den alternativen Weg",
        answerD = "Ficolin bindet Lipopolysaccharid gramnegativer Bakterien und aktiviert direkt C5",
        correctAnswer = 1,
        explanation = "MBL (Mannose-bindendes Lektin) ist ein Mustererkennungsrezeptor des angeborenen Immunsystems und bindet Mannose/GlcNAc-Muster auf Bakterien und Pilzen. MBL bildet einen Komplex mit MASP-1 und MASP-2 (MBL-associated serine proteases), die funktionell C1r/C1s des klassischen Weges entsprechen und C4 und C2 spalten.",
        difficulty = 4,
        funFact = "MBL-Mangel (betrifft 5-10% der Bevoelkerung) erhoht die Infektionsanfaelligkeit bei Saeuglingen im Zeitfenster zwischen Verlust des maternalen IgG und eigener Antikoerperproduktion."
    ),

    // Question 28 -- Coagulation: thrombin functions
    Question(
        categoryId = 16,
        questionText = "Thrombin hat in der Haemostase eine Doppelrolle. Welche pro- und antikoagulatorischen Funktionen uebernimmt es?",
        answerA = "Thrombin aktiviert ausschliesslich Fibrinogen zu Fibrin und hat keine antikoagulatorischen Eigenschaften",
        answerB = "Prokoagulatorisch: Fibrinogenspaltung, Faktor-XIII-Aktivierung, Thrombozytenaktivierung; antikoagulatorisch: Thrombomodulin-Bindung aktiviert Protein C, das Va und VIIIa abbaut",
        answerC = "Thrombin aktiviert nur Faktor VIII und IX; Antithrombin III ist sein einziger Gegenspieler",
        answerD = "Thrombin wirkt ausschliesslich antikoagulatorisch durch Hemmung des Gewebefaktors",
        correctAnswer = 1,
        explanation = "Thrombin ist ein zentrales Regulationsprotein: Prokoagulatorisch spaltet es Fibrinogen zu Fibrin, aktiviert Faktor XIII (Quervernetzung), Faktor V, VIII (positive Rueckkopplung) und Thrombozyten. Antikoagulatorisch bindet Thrombin an Thrombomodulin auf Endothelzellen -- dieser Komplex aktiviert Protein C, das die Kofaktoren Va und VIIIa proteolytisch inaktiviert.",
        difficulty = 4,
        funFact = "Das Antikoagulans Argatroban ist ein direkter Thrombininhibitor und wird bei Heparin-induzierter Thrombozytopenie Typ II (HIT II) eingesetzt, wenn Heparin kontraindiziert ist."
    ),

    // Question 29 -- Immune evasion: complement regulators
    Question(
        categoryId = 16,
        questionText = "Welche koerpereigenen Proteine schuetzen Wirtszellen vor der autologen Komplementaktivierung (Regulatoren des Komplementsystems)?",
        answerA = "IgG und IgM hemmen Komplement durch Fc-Rezeptor-Bindung",
        answerB = "CD55 (DAF), CD59 (Protectin) und CD46 (MCP) hemmen verschiedene Schritte der Komplementkaskade auf Wirtszellen",
        answerC = "Komplement wird auf Koerperzellen nicht aktiviert, weil ihm entsprechende Mustererkennungsproteine fehlen",
        answerD = "Antithrombin III hemmt Komplement analog zur Gerinnungshemmung",
        correctAnswer = 1,
        explanation = "Wirtszellen exprimieren Komplementregulatoren: CD55 (Decay Accelerating Factor) beschleunigt Zerfall der C3-Konvertasen. CD46 (MCP) ist Kofaktor fuer Faktor I, der C3b und C4b spaltet. CD59 (Protectin) blockiert die MAC-Bildung durch Hemmung der C9-Polymerisation. Diese Proteine fehlen bei PNH (paroxysmale naechliche Haemoglobinurie) durch PIGA-Mutation.",
        difficulty = 4,
        funFact = "Bei PNH fehlt GPI-Anker-Synthese -- da CD55 und CD59 GPI-verankert sind, werden betroffene Erythrozyten durch Komplement haemolysiert, besonders nachts (pH-Abfall durch CO2-Akkumulation foerdert Komplementaktivierung)."
    ),

    // Question 30 -- Renal acid-base: proximal tubule bicarbonate
    Question(
        categoryId = 16,
        questionText = "Wie resorbiert der proximale Tubulus Bikarbonat, und warum erscheint dabei kein Bikarbonat direkt in der Tubuluszelle?",
        answerA = "Bikarbonat wird direkt durch spezifische Anionentransporter aufgenommen",
        answerB = "H+ wird durch Na-H-Austauscher (NHE3) sezerniert; luminal reagiert H+ mit HCO3- zu H2CO3, das Carboanhydrase IV zu CO2+H2O spaltet; CO2 diffundiert in die Zelle und wird intrazellulaar zu HCO3- rekonvertiert",
        answerC = "Bikarbonat wird im proximalen Tubulus nicht resorbiert, sondern nur im Sammelrohr",
        answerD = "Aldosteron stimuliert direkte HCO3--Rueckresorption durch Chlorid-Bikarbonat-Austauscher",
        correctAnswer = 1,
        explanation = "Ca. 85% des filtrierten HCO3- wird im proximalen Tubulus resorbiert: Apikales NHE3 sezerniert H+ ins Lumen, wo es mit HCO3- zu H2CO3 reagiert. Die luminale Carboanhydrase IV (CA IV) spaltet H2CO3 zu CO2 + H2O. CO2 diffundiert passiv in die Zelle, wo zytosolische CA II es zu H2CO3 konvertiert; das entstehende H+ wird erneut sezerniert, HCO3- wird basolateral durch NBC1 resorbiert.",
        difficulty = 4,
        funFact = "Acetazolamid hemmt die Carboanhydrase und blockiert so die proximale Bikarbonatresorption -- es verursacht metabolische Azidose und wird als Diuretikum bei Glaukom und Hoehenodem eingesetzt."
    ),

    // Question 31 -- Serotonin syndrome vs NMS
    Question(
        categoryId = 16,
        questionText = "Welche Trias charakterisiert das Serotonin-Syndrom, und wie unterscheidet es sich vom malignen neuroleptischen Syndrom (MNS)?",
        answerA = "Serotonin-Syndrom: Hyperthermie + Rigitaet + Reflexabschwaeching; MNS: Klonus + Agitation + Hypertension",
        answerB = "Serotonin-Syndrom: Klonus + Agitation + Hyperthermie (ploetzlicher Beginn); MNS: Rigide + Akinetisch + 'Lead-pipe'-Tonus + Hyperthermie (langsamer Beginn unter Antipsychotika)",
        answerC = "Beide Syndrome sind klinisch identisch und nur anhand der Medikamentenanamnese unterscheidbar",
        answerD = "Serotonin-Syndrom betrifft nur das PNS; MNS ist ausschliesslich zerebellae",
        correctAnswer = 1,
        explanation = "Serotonin-Syndrom (Serotonin-Exzess durch MAO-Hemmer + SSRI etc.): Trias aus neuromuskulaeren Abnormalitaeten (Klonus, Hyperreflexie, Myoklonien), autonomer Dysfunktion und Hyperthermie -- Beginn innerhalb von Stunden. MNS (D2-Blockade durch Antipsychotika): bleierne Rigitaet, Akinese, Hyperthermie, autonome Instabilitaet -- schleichender Beginn ueber Tage.",
        difficulty = 4,
        funFact = "Cyproheptadin (5-HT2A-Antagonist) wird als Antidot beim Serotonin-Syndrom eingesetzt; beim MNS ist Dantrolen (Muskelrelaxans) und Bromocriptin (D2-Agonist) die Therapie der Wahl."
    ),

    // Question 32 -- Platelet activation mechanisms
    Question(
        categoryId = 16,
        questionText = "Welche intrazellularen Signalwege aktivieren Thrombozyten nach Kollagen-GPIa-Bindung und ADP-P2Y12-Bindung?",
        answerA = "Kollagen aktiviert cAMP; ADP hemmt Phospholipase C",
        answerB = "Kollagen aktiviert ueber GPVI-FcR-gamma-Kette die Phospholipase C-gamma (PLC-gamma), erhoehte IP3 und DAG fuehren zu Ca2+-Mobilisierung und PKC-Aktivierung; ADP hemmt ueber P2Y12 die Adenylatzyklase (senkt cAMP) und potenziert die Aktivierung",
        answerC = "Beide Rezeptoren signalisieren ausschliesslich ueber G-Protein-unabhaengige Kinasen",
        answerD = "Kollagen bindet direkt an Thromboxan-Synthase und produziert TXA2 ohne Zwischenschritte",
        correctAnswer = 1,
        explanation = "Kollagen-GPVI-Signaling aktiviert PLC-gamma via Src-Kinasen: IP3 mobilisiert Ca2+ aus dem Retikulm (Sekretion von Dichtegranulaen mit ADP/Serotonin), DAG aktiviert PKC (Formveraenderung, Integrin-aIIBbeta3-Aktivierung). ADP aktiviert P2Y12, das Gi koppelt und Adenylatzyklase hemmt -- niedriges cAMP verstaerkt die Aktivierung. P2Y1 mobilisiert zusaetzlich Ca2+ ueber Gq.",
        difficulty = 4,
        funFact = "Clopidogrel (Plavix) ist ein P2Y12-Antagonist und hemmt irreversibel die ADP-induzierte Thrombozytenaggregation -- es muss als Prodrug erst hepatisch aktiviert werden."
    ),

    // Question 33 -- Hepatic encephalopathy pathophysiology
    Question(
        categoryId = 16,
        questionText = "Welches Neurotoxin spielt die Hauptrolle in der Pathophysiologie der hepatischen Enzephalopathie?",
        answerA = "Bilirubin ueberwindet die BHS und schaeadigt Neurone direkt",
        answerB = "Ammoniak (NH3), das aus Darmbakterien stammt und bei Leberversagen nicht zu Harnstoff konvertiert wird, akkumuliert und stoert den Neurotransmitterstoffwechsel",
        answerC = "Laktat akkumuliert und senkt den zerebral-venaesen pH unter 6,5",
        answerD = "Erhoehtes Cortisol durch Stress bei Leberversagen schaedigt den Hippocampus",
        correctAnswer = 1,
        explanation = "Darmbakterien produzieren Ammoniak durch Spaltung von Aminosaeuren und Harnstoff. Gesunde Hepatozyten konvertieren NH3 im Harnstoffzyklus zu Harnstoff. Bei Leberversagen oder portosystemischen Shunts gelangt NH3 direkt ins Gehirn. Es hemmt die Glutamatsynthese, stoert den Astrozytenmetabolismus und foerdert exzessive GABAerge Hemmung.",
        difficulty = 4,
        funFact = "Lactulose wird bei hepatischer Enzephalopathie eingesetzt: Es senkt den Darm-pH, wandelt NH3 in nicht-resorbierbares NH4+ um und beschleunigt die Darmpassage -- so wird weniger Ammoniak resorbiert."
    ),

    // Question 34 -- Renin-angiotensin-aldosterone system
    Question(
        categoryId = 16,
        questionText = "Welcher Stimulus fuehrt in der Macula densa des juxtaglomerulaeren Apparats zur Reninsekrekion, und was ist die Endwirkung von Aldosteron im Nephron?",
        answerA = "Erhoehter NaCl-Gehalt im Tubulus stimuliert Renin; Aldosteron hemmt die Na+-Resorption",
        answerB = "Niedriger NaCl-Gehalt, niedriger Blutdruck und Sympathikusaktivierung stimulieren Renin; Aldosteron stimuliert ENaC und Na+/K+-ATPase im Sammelrohr -- Na+ wird retendiert, K+ und H+ werden sezerniert",
        answerC = "ADH stimuliert Renin direkt; Aldosteron reguliert die Aquaporin-2-Expression",
        answerD = "Angiotensin I stimuliert Renin durch positive Rueckkopplung; Aldosteron aktiviert die Carboanhydrase",
        correctAnswer = 1,
        explanation = "Renin wird bei: niedrigem NaCl (Macula densa), niedrigem Blutdruck (Barorezeptoren der afferenten Arteriole) und Sympathikusaktivierung (beta1-adrenerge Rezeptoren) sezerniert. Aldosteron (das Endprodukt: Renin -> Angiotensin I -> ACE -> Ang II -> Aldosteron) erhoht ENaC (epithelialer Na-Kanal) und Na+/K+-ATPase im Sammelrohr -- Na+ und Wasser werden retendiert, K+ und H+ werden ausgeschieden.",
        difficulty = 4,
        funFact = "ACE-Hemmer blockieren die Umwandlung von Angiotensin I zu II -- sie senken nicht nur den Blutdruck, sondern wirken bei Herzinsuffizienz kardioprotektiv, weil Angiotensin II Myokardfibrose foerdert."
    ),

    // Question 35 -- Innate immunity: pattern recognition receptors
    Question(
        categoryId = 16,
        questionText = "Welche Klassen von Mustererkennungsrezeptoren (PRRs) des angeborenen Immunsystems erkennen PAMPs und DAMPs?",
        answerA = "Ausschliesslich Toll-like-Rezeptoren (TLRs) auf der Zelloberflaeche",
        answerB = "TLRs (Zelloberflaeche + Endosom), NOD-like Receptors (NLRs, zytosolisch), RIG-I-like Receptors (RLRs, virale RNA), C-Typ-Lektinrezeptoren (CLRs) und cGAS-STING-Weg (zytosolare DNA)",
        answerC = "Nur Fcgamma-Rezeptoren und Komplementrezeptoren vermitteln angeborene Immunitaet",
        answerD = "PRRs sind ausschliesslich auf T- und B-Lymphozyten; Makrophagen nutzen unspezifische Phagozytose",
        correctAnswer = 1,
        explanation = "Das angeborene Immunsystem nutzt multiple PRR-Klassen: TLRs erkennen Bakterienbestandteile (LPS via TLR4, Flagellin via TLR5) oder virale Nucleinsaeuren (TLR3/7/8/9 endosomal). NLRs erkennen zytosolische bakterielle Signale und bilden Inflammasome (NLRP3). RIG-I und MDA5 erkennen zytoplasmatische virale RNA. cGAS erkennt doppelstraengige DNA und aktiviert STING.",
        difficulty = 4,
        funFact = "NLRP3-Inflammasom-Aktivierung durch Kristalle (Harnsaeure bei Gicht, Cholesterin bei Atherosklerose) erklaert, warum diese Erkrankungen eine sterile Entzuendung zeigen -- ohne Infektion, aber mit massiver IL-1beta-Ausschuettung."
    ),

    // Question 36 -- Pulmonary hypertension classification
    Question(
        categoryId = 16,
        questionText = "Welche pathophysiologischen Mechanismen unterscheiden primaere (pulmonal-arterielle) Hypertonie von der Gruppe-2-pulmonalen Hypertonie bei Linksherzerkrankung?",
        answerA = "PAH entsteht durch erhoehten pulmonalen Fluss bei Links-Rechts-Shunt; Gruppe 2 durch direkte Endothelschaedigung",
        answerB = "PAH (Gruppe 1) entsteht durch obliterative Umbauprozesse der pulmonalen Arteriolen (Endotheldysfunktion, glattmuskulaere Hyperplasie, Thrombosen in situ); Gruppe 2 entsteht durch pulmonalvenaesen Rueckstau bei erhohtem linksatrialen Fuellungsdruck",
        answerC = "Beide Formen sind ausschliesslich durch erhoehten Herzauswurf bedingt",
        answerD = "PAH betrifft nur Venen; Gruppe 2 betrifft nur Kapillaren",
        correctAnswer = 1,
        explanation = "PAH (WHO-Gruppe 1) ist eine Erkrankung der kleinen Pulmonalarterien: BMPR2-Mutationen (50% hereditaere PAH) oder Trigger (Drogen, Bindegewebskrankheiten) fuehren zu Endotheldysfunktion, verminderter PGI2/NO-Produktion und erhoehtem Endothelin. Folge: pulmonalvaskulaere Obstruktion und Widerstandserhoehung. Gruppe 2 (HFpEF/HFrEF): Erhoehter LVEDP uebertraegt sich auf Pulmonalvenen und Kapillaren (passive Stauung).",
        difficulty = 4,
        funFact = "Sildenafil (PDE5-Hemmer) wurde urspruenglich fuer Angina pectoris entwickelt -- seine vasodilatierende Wirkung auf den Pulmonalkreislauf machte es zum ersten oralen PAH-Therapeutikum."
    ),

    // Question 37 -- Regulatory T cells
    Question(
        categoryId = 16,
        questionText = "Was sind regulatorische T-Zellen (Tregs), und welcher Transkriptionsfaktor ist entscheidend fuer ihre Identitaet?",
        answerA = "Tregs sind zytotoxische T-Zellen mit supprimiertem Perforin-Granzymsystem; RORgammat ist ihr Masterfaktor",
        answerB = "Tregs sind CD4+CD25+FoxP3+-T-Zellen, die Immunantworten durch IL-10, TGF-beta und CTLA-4 supprimieren; FoxP3 ist ihr Mastertranskriptionsfaktor",
        answerC = "Tregs sind NK-Zellen mit inhibitorischen Killerzell-Ig-Rezeptoren (KIRs)",
        answerD = "Tregs entstehen ausschliesslich in der Thymusrinde und verhindern nur B-Zell-Aktivierung",
        correctAnswer = 1,
        explanation = "Tregs (klassisch: CD4+CD25hiFoxP3+) sind zentrale Suppressoren der Immunantwort. FoxP3 (Forkhead box P3) ist ihr definierender Mastertranskriptionsfaktor. Mutationen in FOXP3 verursachen IPEX-Syndrom (Immune dysregulation, Polyendocrinopathy, Enteropathy, X-linked) -- ein lebensbedrohliches Autoimmunkrankheitssyndrom.",
        difficulty = 4,
        funFact = "Tumoren expandieren Tregs in ihrer Mikroumgebung, um die Anti-Tumor-Immunantwort zu unterdrucken -- Anti-CTLA-4-Antiko erper (Ipilimumab) wirken u.a. durch Depletion intratumoraler Tregs."
    ),

    // Question 38 -- Myocardial infarction: zone of ischemia
    Question(
        categoryId = 16,
        questionText = "Welche drei konzentrischen Zonen beschreibt das klassische Modell der myokardialen Ischaemieschaedigung beim akuten Myokardinfarkt?",
        answerA = "Nekrose, Steatose und Oedematose",
        answerB = "Zentralnekrose (irreversibel), Zone der Verletzung (potentiell reversibel) und aeuHere Ischaemiezone (elektrisch funktionsstoert, reversibel bei Reperfusion)",
        answerC = "Epikard-, Myokard- und Endokardschaedigung in drei gleichmaessigen Schichten",
        answerD = "Inflammationszone, Fibrosenzone und Regenerationszone",
        correctAnswer = 1,
        explanation = "Das klassische Modell: 1) Nekrosezone im Zentrum (irreversibler Zelltod nach >20-40 min schwerer Ischaemie, Myozytenlyse und Troponinfreisetzung). 2) Verletzungszone (ST-Hebungen im EKG, stunned myocardium -- ohne Reperfusion nekrotisch). 3) Ischaemiezone (T-Wellenveraenderungen, hibernating myocardium -- reversibel bei rechtzeitiger Revaskularisation).",
        difficulty = 4,
        funFact = "Door-to-balloon-Zeit unter 90 Minuten ist das klinische Ziel beim STEMI, weil jede Minute ohne Reperfusion irreversible Nekrose ausweitet (time is muscle)."
    ),

    // Question 39 -- Electrolyte: hyponatremia mechanisms
    Question(
        categoryId = 16,
        questionText = "Welche drei pathophysiologischen Mechanismen koennen Hyponatriamie verursachen, und wie unterscheiden sie sich klinisch hinsichtlich des Volumenstatus?",
        answerA = "Hypovolaeemisch (Na+ und H2O verloren, aber mehr Na+), euvolaemisch (H2O retendiert bei normalem Na+, z.B. SIADH) und hypervolaemisch (beides retendiert, aber mehr H2O, z.B. Herzinsuffizienz)",
        answerB = "Alle Hyponatriaemien entstehen durch renalen Na+-Verlust; Volumenstatus ist irrelevant",
        answerC = "Hyponatriaemie entsteht immer durch Uebertrinken (psychogene Polydipsie)",
        answerD = "Hyponatriaemie entsteht nur durch Addison-Krise oder Hypothyreose",
        correctAnswer = 0,
        explanation = "Hyponatriaemie hat 3 Mechanismen: 1) Hypovolaeemisch: Na+-Verlust (Erbrechen, Diarrhoe, Diuretika) mit reaktiver ADH-Ausschuettung und H2O-Retention. 2) Euvolaemisch: H2O-Retention bei normalem Na+-Bestand -- SIADH (inadaequate ADH-Sekretion), Hypothyreose, psychogene Polydipsie. 3) Hypervolaemisch: Herz-, Leber- oder Nierenversagen mit Oedemen und dilutionaler Hyponatriaemie.",
        difficulty = 4,
        funFact = "Zu schnelle Korrektur einer chronischen Hyponatriaemie (>10 mmol/l in 24h) kann eine osmotische Demyelinisierung (pontine Myelinolyse) verursachen -- neurologisch katastrophal."
    ),

    // Question 40 -- RAAS and kidney protection
    Question(
        categoryId = 16,
        questionText = "Warum senken ACE-Hemmer bei diabetischer Nephropathie die Proteinurie, auch wenn der systemische Blutdruck bereits normal ist?",
        answerA = "ACE-Hemmer verbessern die Glucosekontrolle und verhindern so glomerulaere Schaeden",
        answerB = "Angiotensin II verengt bevorzugt die efferente Arteriole; ACE-Hemmer senken den intraglomerulaeren Druck selektiv und reduzieren so hyperfiltrations-bedingten Glomerulusschaden",
        answerC = "ACE-Hemmer hemmen die Fibrinogenproduktion und verhindern so Mikrothromben im Glomerulus",
        answerD = "ACE-Hemmer erhoehen die GFR und filtrieren Albumin aus dem Blut heraus",
        correctAnswer = 1,
        explanation = "Angiotensin II kontrahiert die efferente Arteriole staerker als die afferente -- dies erhoehrt den intraglomerulaeren hydrostatischen Druck (Hyperfiltration). Bei Diabetikern schadigt dieser erhohte Druck das Filterapparat und verursacht Proteinurie. ACE-Hemmer (oder ARBs) reduzieren diesen efferenten Tonus, senken den intraglomerulaeren Druck und verlangsamen die Nephropathieprogression.",
        difficulty = 4
    ),

    // Question 41 -- Anaphylaxis: IgE-mast cell mechanism
    Question(
        categoryId = 16,
        questionText = "Welche zellulaere Kaskade erklaert die Sofortreaktion (Typ-I-Ueberempfindlichkeit) bei Anaphylaxie?",
        answerA = "IgG-Antikoerper aktivieren Makrophagen, die TNF-alpha ausschuetten und systemische Entzuendung ausloesen",
        answerB = "IgE-Antikoerper binden an FcepsilonRI auf Mastzellen; bei Allergenkontakt vernetzt Allergen IgE-Molekuele, was Degranulation (Histamin, Tryptase, Leukotriene) ausloest",
        answerC = "Allergenspezifische CD8+-T-Zellen lysieren Mastzellen direkt",
        answerD = "Komplement-C5a aktiviert Mastzellen direkt ohne IgE-Beteiligung (pseudoallergische Reaktion = Typ I)",
        correctAnswer = 1,
        explanation = "Bei der Sensibilisierungsphase produzieren B-Zellen allergenspezifisches IgE (unter Th2/IL-4-Einfluss), das sich an FcepsilonRI-Rezeptoren auf Mastzellen und Basophilen haengt. Bei erneutem Allergenkontakt vernetzt das Allergen benachbarte IgE-Molekuele (Kreuzvernetzung) -- dies aktiviert die Mastzelle und fuehrt zur Degranulation (Histamin, Prostaglandine, Leukotriene, Tryptase).",
        difficulty = 4,
        funFact = "Tryptase im Serum ist ein diagnostischer Marker fuer Mastzellaktivierung und bleibt bei echter Anaphylaxie 1-6h nach Reaktionsbeginn erhoehrt -- bei Pseudoallergie (z.B. NSAR-Ueberempfindlichkeit) ist Tryptase normal."
    ),

    // Question 42 -- Coagulation: protein C pathway
    Question(
        categoryId = 16,
        questionText = "Welche Konsequenz hat ein hereditaerer Protein-C-Mangel (z.B. Protein-C-Defizienz), und warum tritt beim Marcumar-Start eine paradoxe Thrombose auf?",
        answerA = "Protein-C-Mangel erhoehrt das Blutungsrisiko; Marcumar-Start foerdert Fibrinolyse",
        answerB = "Protein-C-Mangel erhoehrt das Thromboserisiko; Marcumar hemmt als Vitamin-K-Antagonist Protein C (HWZ 6h) schneller als Prothrombin (HWZ 72h) -- kurzzeitig entsteht ein Protein-C-Mangel-Zustand mit Thrombosegefahr (Marcumar-Nekrose)",
        answerC = "Protein-C-Mangel ist klinisch asymptomatisch; Marcumar wirkt nur auf Faktor VII",
        answerD = "Protein C aktiviert Thrombin; sein Mangel fuehrt zu Hypofibrinogenaemie",
        correctAnswer = 1,
        explanation = "Protein C ist ein Antikoagulans: Es inaktiviert (mit Protein S als Kofaktor) die Gerinnungsfaktoren Va und VIIIa. Protein C hat eine kurze HWZ (6-8h). Marcumar hemmt alle Vitamin-K-abhaengigen Proteine (II, VII, IX, X, Protein C und S). Bei Marcumar-Beginn faellt Protein C schneller ab als Prothrombin (HWZ 60-72h) -- transienter Hyperkoagulabilitaetszustand mit Thromboserisiko (Marcumar-induzierte Hautnekrose in Protein-C-Mangeltraegern).",
        difficulty = 4,
        funFact = "Zur Sicherheit werden neue Marcumar-Patienten mit Heparin ueberbrickt, bis die INR therapeutisch ist -- um genau dieses paradoxe Thromboserisiko zu vermeiden."
    ),

    // Question 43 -- Neurological: glutamate excitotoxicity
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter exzitotoxischer Neuronenschaedigung durch Glutamat, und welche Rezeptorklasse ist dabei zentral?",
        answerA = "Glutamat-Mangel fuehrt zur Depolarisationsblockade und Neuronenstillstand",
        answerB = "Exzessive Glutamatfreisetzung (z.B. bei Ischaemie) aktiviert NMDA-Rezeptoren, was massiven Ca2+-Einstrom ausloest und intrazellulaere Enzyme (Proteasen, Lipasen, Endonukleasen) aktiviert -- Folge: Nekrose und Apoptose",
        answerC = "GABA-Rezeptoren verstaerken Glutamat-Signal und fuehren zur Hyperexzitabilitaet",
        answerD = "Glutamat schaedigt Neurone ausschliesslich durch osmotischen Stress",
        correctAnswer = 1,
        explanation = "Bei zerebraler Ischaemie versagen Na+/K+-ATPasen energiebedingt, Zellen depolarisieren und schuetten massiv Glutamat aus. NMDA-Rezeptoren (Ca2+/Na+-Ionenkanaele) werden aktiviert: massiver Ca2+-Einstrom aktiviert Calpaine (Proteolyse des Zytoskeletts), Phospholipasen (Membranschaeden) und Endonukleasen (DNA-Fragmentation) -- klassische Exzitotoxizitaet.",
        difficulty = 4,
        funFact = "Memantin (Alzheimer-Medikament) ist ein nicht-kompetitiver NMDA-Antagonist -- es reduziert die pathologische Dauerstimulation durch Glutamat, blockiert aber nicht die physiologische synaptische Aktivitaet."
    ),

    // Question 44 -- Immune tolerance: central vs peripheral
    Question(
        categoryId = 16,
        questionText = "Wie unterscheiden sich zentrale und periphere Toleranz gegenueber Selbst-Antigenen?",
        answerA = "Zentrale Toleranz findet in peripheren Lymphorganen statt; periphere Toleranz findet in Thymus und Knochenmark statt",
        answerB = "Zentrale Toleranz: Deletion autoreaktiver T- und B-Zellen in Thymus und Knochenmark (negative Selektion); periphere Toleranz: Anergie, Deletion oder Regulation autoreaktiver Zellen in sekundaeren Lymphorganen durch Tregs, CTLA-4, PD-1",
        answerC = "Beide Toleranzformen sind identisch; sie unterscheiden sich nur im zeitlichen Ablauf",
        answerD = "Zentrale Toleranz betrifft nur B-Zellen; periphere Toleranz ausschliesslich T-Zellen",
        correctAnswer = 1,
        explanation = "Zentrale Toleranz eliminiert hoch-affin autoreaktive Lymphozyten: Im Thymus bewirkt negative Selektion durch Selbstpeptid-MHC-Komplexe auf mTECs (AIRE-abhaengig) die Apoptose autoreaktiver T-Zellen. Im Knochenmark werden autoreaktive B-Zellen deletiert oder durch Rezeptoredit gerettet. Periphere Toleranz kontrolliert entkkommene Zellen: Anergie (kein kostimulatorisches Signal), Aktivierungsinduzierter Zelltod (AICD), Treg-Suppression.",
        difficulty = 4,
        funFact = "AIRE (Autoimmune Regulator) im Thymus exprimiert periphere Gewebeantigene (z.B. Insulingen) und praesentiert sie T-Zellen -- AIRE-Mutationen verursachen APS-1 (Autoimmun-Polyendokrinopathie Typ 1) mit multiplen Endokrinopathien."
    ),

    // Question 45 -- Kidney: tubuloglomerular feedback
    Question(
        categoryId = 16,
        questionText = "Wie funktioniert der tubuloglomulaere Feedback-Mechanismus (TGF) zur Autoregulation der GFR?",
        answerA = "Erhohter renaler Blutdruck fuehrt direkt zu vermehrter Reninsekrekion",
        answerB = "Hohe NaCl-Konzentration an der Macula densa (erhoehte GFR) fuehrt zu ATP/Adenosin-Freisetzung, Kontraktion der afferenten Arteriole und GFR-Senkung",
        answerC = "ADH-Ausschuettung bei hohem NaCl kontrahiert die efferente Arteriole",
        answerD = "TGF wirkt ausschliesslich durch Renin-Angiotensin-Aldosteron und hat keine lokale Komponente",
        correctAnswer = 1,
        explanation = "TGF ist ein negativer Rueckkopplungskreis: Steigt die GFR, gelangt mehr NaCl an die Macula densa. Erhohte NaCl-Konzentration wird durch NKCC2-Kotransporter detektiert und loest ATP/Adenosin-Freisetzung aus. Adenosin bindet A1-Rezeptoren der afferenten Arteriole und bewirkt Vasokonstriktion -- GFR sinkt und NaCl-Zufuhr normalisiert sich.",
        difficulty = 4,
        funFact = "Koffein ist ein Adenosin-Antagonist und blockiert den TGF -- das erklaert teilweise die diuretische Wirkung von Kaffee: Der GFR-Autoregulationsmechanismus ist gedaempft."
    ),

    // Question 46 -- Hemostasis: fibrinolysis
    Question(
        categoryId = 16,
        questionText = "Welches Protein loest die Fibrinolyse aus, und wie wird es aktiviert?",
        answerA = "Thrombin aktiviert Plasminogen direkt durch proteolytische Spaltung",
        answerB = "Tissue Plasminogen Activator (tPA) wird von Endothelzellen sezerniert und spaltet Fibrin-gebundenes Plasminogen zu Plasmin, das dann Fibrin abbaaut",
        answerC = "Protein C aktiviert Plasmin durch TAFI-Hemmung",
        answerD = "Faktor XII aktiviert Plasminogen zu Plasmin im Kontaktweg",
        correctAnswer = 1,
        explanation = "tPA (tissue Plasminogen Activator) wird vom aktivierten Endothel freigesetzt und ist besonders effizient, wenn es an Fibrin gebunden ist. Fibrin-gebundenes Plasminogen wird 1000x effektiver zu Plasmin gespalten als freies Plasminogen -- ein eleganter Mechanismus, der Fibrinolyse auf Thrombusorte beschraenkt. Plasmin spaltet dann Fibrin zu D-Dimeren.",
        difficulty = 4,
        funFact = "Alteplase (rtPA) ist das Thrombolytikum beim ischaemischen Schlaganfall -- es muss innerhalb von 4,5h nach Symptombeginn gegeben werden und ist bei haemorrhagischem Schlaganfall absolut kontraindiziert."
    ),

    // Question 47 -- Adrenal cortex: cortisol synthesis
    Question(
        categoryId = 16,
        questionText = "Welches Enzym ist bei der Kortisol-Biosynthese in der Nebennierenrinde geschwindigkeitsbestimmend, und wo ist es in der Zelle lokalisiert?",
        answerA = "11beta-Hydroxylase in der Zona reticularis des Zytosols",
        answerB = "Cholesterin-Desmolase (CYP11A1/P450scc) in der inneren Mitochondrienmembran; sie spaltet die Seitenkette des Cholesterins und ist der regulierte Schritt via StAR-Protein",
        answerC = "21-Hydroxylase im glatten ER ist der geschwindigkeitsbestimmende Schritt",
        answerD = "3beta-HSD (Hydroxysteroid-Dehydrogenase) im Zytosol ist der limitierende Schritt",
        correctAnswer = 1,
        explanation = "Der geschwindigkeitsbestimmende Schritt der Steroidogenese ist der Transport von Cholesterin in die innere Mitochondrienmembran durch das StAR-Protein (Steroidogenic Acute Regulatory Protein), wo CYP11A1 (P450scc) es zu Pregnenolon spaltet. ACTH stimuliert sowohl StAR-Expression als auch CYP11A1-Aktivitaet.",
        difficulty = 4,
        funFact = "Ein Defekt des 21-Hydroxylase-Gens (CYP21A2) ist die haeufigste Ursache des adrenogenitalen Syndroms (AGS) -- Cortisol- und Aldosteron-Mangel, kompensatorisch erhoehtes ACTH und Androgen-Ueberproduktion."
    ),

    // Question 48 -- Blood-brain barrier: drug penetration
    Question(
        categoryId = 16,
        questionText = "Welche physikochemischen Eigenschaften ermoeglichen kleinen Molekuelen die passive Penetration der Blut-Hirn-Schranke?",
        answerA = "Hohe Hydrophilie, grosses Molekulargewicht und ionische Ladung bei pH 7,4",
        answerB = "Lipophilie (hoher log P), kleines Molekulargewicht (<500 Da), niedrige Wasserstoffbrueckenzahl und keine Ionisierung bei pH 7,4 (Lipinski-Regel)",
        answerC = "Bindung an Albumin ist Voraussetzung fuer BHS-Penetration",
        answerD = "P-Glykoprotein foerdert aktiv die BHS-Penetration lipophiler Arzneistoffe",
        correctAnswer = 1,
        explanation = "Die BHS erlaubt passives Crossing nur fuer kleine, lipophile, nicht-ionisierte Molekuele mit wenigen H-Brueckendonoren/-Akzeptoren. Die modifizierte Lipinski-Regel fuer ZNS-Arzneistoffe: MW < 450 Da, log P 1-3, H-Brueckendonoren < 3, TPSA < 90 A^2. P-Glykoprotein (Efflux-Transporter) pumpt viele Substanzen aktiv zurueck -- ein Hauptgrund fuer ZNS-Arzneistoffversagen.",
        difficulty = 4,
        funFact = "Der misslungene Versuch, Chemotherapeutika bei Hirntumoren einzusetzen, liegt oft am P-Glykoprotein-vermittelten Efflux -- Modultoren wie Elacridar werden erforscht, um P-gp zu hemmen."
    ),

    // Question 49 -- Innate lymphoid cells
    Question(
        categoryId = 16,
        questionText = "Was sind innate lymphoid cells (ILCs), und wie entsprechen die drei ILC-Gruppen den CD4+-T-Helfer-Subpopulationen?",
        answerA = "ILCs sind Vorlaeufer aller T- und B-Lymphozyten ohne eigene Effektorfunktion",
        answerB = "ILC1 (IFN-gamma, wie Th1), ILC2 (IL-5/IL-13, wie Th2) und ILC3 (IL-17/IL-22, wie Th17) sind angeborene Lymphozyten ohne antigenspezifischen Rezeptor, die sofort auf Gewebssignale reagieren",
        answerC = "ILCs sind NK-Zellen mit veraenderter Zytotoxizitaet und kein eigenstaendiger Zelltyp",
        answerD = "ILCs exprimieren TCR ohne MHC-Restriktion und sind Teil des adaptiven Immunsystems",
        correctAnswer = 1,
        explanation = "ILCs sind lymphoide Zellen ohne Antigenrezeptor (kein TCR/BCR), die schnell auf epitheliale Alarmsignale (TSLP, IL-25, IL-33) reagieren. ILC1 produzieren IFN-gamma (Schutz vor intrazellularen Pathogenen, wie Th1). ILC2 produzieren IL-5 und IL-13 (Helminthenimmunitaet und Allergien, wie Th2). ILC3 produzieren IL-17 und IL-22 (Darmmukosaintegritaet, Pilzimmunitaet, wie Th17).",
        difficulty = 4,
        funFact = "ILC2 sind massgeblich an der fruehen Phase allergischer Atemwegserkrankungen beteiligt -- sie reagieren auf Epithelschaden noch bevor allergenspezifische T-Zellen aktiviert sind."
    ),

    // Question 50 -- Hepatorenal syndrome
    Question(
        categoryId = 16,
        questionText = "Durch welchen pathophysiologischen Mechanismus entsteht das hepatorenale Syndrom (HRS), und was unterscheidet es von anderen Ursachen des akuten Nierenversagens bei Leberkranken?",
        answerA = "HRS entsteht durch direkte Nierentoxine aus der geschaedigten Leber; histologisch finden sich Hepatozyten in der Niere",
        answerB = "HRS ist eine funktionelle Niereninsuffizienz durch massiv erhoehte Nierenvasokonstriktion: Splanchnische Vasodilatation (NO) fuehrt zu vermindertem effektivem Blutvolumen, reaktiver Angiotensin/Vasopressin/Sympathikusaktivierung und renaler Minderperfusion -- die Niere selbst ist histologisch normal",
        answerC = "HRS entsteht durch glomerulaere Immunkomplexablaegerung bei Leberzirrhose",
        answerD = "HRS ist eine direkte Folge der Hypoalbuminaemie und des intravasalen Druckabfalls ohne neurohumoralen Mechanismus",
        correctAnswer = 1,
        explanation = "Bei dekompensierten Leberzirrhose fuehrt splanchnische Vasodilatation (durch erhohtes NO) zu einem relativen intravasalen Volumenmangel. Kompensatorisch aktiviert der Koerper vasokonstriktive Systeme (RAAS, ADH, Sympathikus). Diese treffen die Niere mit schon maximal kompensatorisch dilatierter afferenter Arteriole -- Ergebnis: severe renale Vasokonstriktion, GFR-Abfall, HRS. Die Nirenbiopsie ist normal (reversibel nach Lebertransplantation).",
        difficulty = 4,
        funFact = "Terlipressin (V1-Rezeptoragonist) und Albumin-Infusion sind die Therapie des Typ-1-HRS -- Terlipressin kontrahiert splanchnische Gefaesse und hebt den effektiven Blutdruck in der Niere."
    )

)
