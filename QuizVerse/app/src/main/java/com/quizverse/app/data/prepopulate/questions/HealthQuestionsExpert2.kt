package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun healthQuestionsExpert2(): List<Question> = listOf(

    // Question 1 -- Receptor Pharmacology: Inverse Agonists
    Question(
        categoryId = 16,
        questionText = "Was unterscheidet einen inversen Agonisten von einem kompetitiven Antagonisten an einem G-Protein-gekoppelten Rezeptor?",
        answerA = "Ein inverser Agonist blockiert den Rezeptor irreversibel, ein Antagonist reversibel",
        answerB = "Ein inverser Agonist stabilisiert den inaktiven Rezeptorzustand und senkt die basale Aktivitaet unter den Grundwert, ein Antagonist hat keine intrinsische Aktivitaet",
        answerC = "Ein inverser Agonist bindet nur an regulatorische Untereinheiten, ein Antagonist an die orthosterische Bindestelle",
        answerD = "Ein inverser Agonist verstaerkt die Wirkung endogener Liganden, ein Antagonist hebt sie auf",
        correctAnswer = 1,
        explanation = "Inverse Agonisten binden an den Rezeptor und stabilisieren bevorzugt den inaktiven Konformationszustand (R), was die konstitutive (basale) Rezeptoraktivitaet unterhalb des Grundniveaus senkt. Neutrale Antagonisten dagegen blockieren nur die Ligandenbindung ohne eigene intrinsische Aktivitaet.",
        difficulty = 4,
        funFact = "Viele klinisch eingesetzte Substanzen, die fruehzeitig als reine Antagonisten klassifiziert wurden -- darunter bestimmte Betablocker wie Carvedilol -- sind in Wirklichkeit inverse Agonisten."
    ),

    // Question 2 -- Receptor Pharmacology: Partial Agonists
    Question(
        categoryId = 16,
        questionText = "Wie wirkt ein partieller Agonist in Gegenwart eines vollstaendigen Agonisten bei saettigendem Konzentrationsniveau?",
        answerA = "Er potenziert die Wirkung des vollen Agonisten durch allosterische Kooperation",
        answerB = "Er hat keinen Einfluss, da der volle Agonist alle Rezeptoren bereits besetzt",
        answerC = "Er wirkt als funktioneller Antagonist und reduziert die Maximalantwort auf sein eigenes Emax-Niveau",
        answerD = "Er loest eine Rezeptor-Internalisierung aus und verstaerkt damit die Desensibilisierung",
        correctAnswer = 2,
        explanation = "Bei Saettigung des Rezeptors mit einem vollen Agonisten konkurriert der partielle Agonist um die Bindestelle. Da seine intrinsische Aktivitaet (alpha) kleiner als 1 ist, wird die Maximalantwort auf seinen eigenen Emax-Wert abgesenkt -- er fungiert dann als funktioneller Antagonist.",
        difficulty = 4,
        funFact = "Buprenorphin ist ein partieller Agonist am mu-Opioidrezeptor -- das erklaert seinen Ceiling-Effekt bei der Atemdepression und macht ihn therapeutisch sicherer als reine Opioidagonisten."
    ),

    // Question 3 -- Receptor Pharmacology: Allosteric Modulators
    Question(
        categoryId = 16,
        questionText = "Was ist das charakteristische Merkmal eines positiven allosterischen Modulators (PAM) im Vergleich zu einem orthosterischen Agonisten?",
        answerA = "Ein PAM aktiviert den Rezeptor unabhaengig vom endogenen Liganden mit maximaler Effizienz",
        answerB = "Ein PAM verstaerkt nur die Antwort auf den endogenen Liganden, hat aber keine eigene agonistische Wirkung -- sogenannter Ceiling-Effekt durch physiologische Ligandenverfuegbarkeit",
        answerC = "Ein PAM bindet kovalent an die orthosterische Bindestelle und verdraengt den Liganden nicht",
        answerD = "Ein PAM senkt die Rezeptordichte durch beschleunigte Internalisierung",
        correctAnswer = 1,
        explanation = "PAMs binden an eine topographisch separate Bindestelle (allosterisch) und erhoehen Affinitaet und/oder Effizienz des orthosterischen Liganden, haben aber ohne endogenen Liganden selbst keine oder minimale Wirkung. Dies erzeugt einen 'Ceiling-Effekt' der physiologischen Kontrolle.",
        difficulty = 4,
        funFact = "Benzodiazepine sind PAMs am GABA-A-Rezeptor -- sie verstaerken die GABA-Wirkung, ohne selbst Chloridkanaele zu oeffnen. Deshalb sind sie bei Monotherapie weniger gefaehrlich als Barbiturate, die direkte GABA-A-Agonisten sind."
    ),

    // Question 4 -- CYP450 Pharmacokinetics: Inhibition
    Question(
        categoryId = 16,
        questionText = "Ein Patient nimmt Warfarin und bekommt zusaetzlich Fluconazol verschrieben. Welchen pharmakodynamischen Effekt erwartet man und warum?",
        answerA = "Verminderte Antikoagulation durch CYP2C9-Induktion durch Fluconazol",
        answerB = "Unveraenderte Wirkung, da Warfarin nicht hepatisch metabolisiert wird",
        answerC = "Erhoehte Antikoagulation mit Blutungsrisiko durch CYP2C9- und CYP3A4-Hemmung durch Fluconazol",
        answerD = "Verminderte Antikoagulation durch Erhoehung der renalen Warfarin-Clearance",
        correctAnswer = 2,
        explanation = "Fluconazol ist ein starker CYP2C9-Hemmer (und maessiger CYP3A4-Hemmer). Da S-Warfarin (der potentere Enantiomer) ueberwiegend ueber CYP2C9 metabolisiert wird, steigt der Warfarin-Plasmaspiegel deutlich an, was zu einer erheblichen INR-Erhoehung und Blutungsgefahr fuehrt.",
        difficulty = 4,
        funFact = "Die Warfarin-Fluconazol-Interaktion ist eine der klinisch bedeutsamsten Arzneimittelwechselwirkungen -- sie kann den INR innerhalb weniger Tage auf lebensbedrohliche Werte (>10) ansteigen lassen."
    ),

    // Question 5 -- CYP450 Pharmacokinetics: Induction
    Question(
        categoryId = 16,
        questionText = "Welches Antiepileptikum ist fuer die klinisch relevanteste CYP-Enzyminduktion bekannt und welches klinische Problem resultiert daraus bei oralen Kontrazeptiva?",
        answerA = "Valproat -- hemmt CYP2C9 und erhoehte Ethinylestradiol-Spiegel foerdern Thrombosen",
        answerB = "Rifampicin -- induziert CYP3A4, kein Problem bei Kontrazeptiva da renal eliminiert",
        answerC = "Carbamazepin -- induziert CYP3A4 (und andere CYPs), reduziert Ethinylestradiol-Spiegel und senkt die kontrazeptive Wirksamkeit",
        answerD = "Levetiracetam -- induziert UGT1A und beschleunigt Progesteron-Glukuronidierung",
        correctAnswer = 2,
        explanation = "Carbamazepin ist ein starker CYP3A4-Induktor (auch CYP1A2, CYP2C). Ethinylestradiol und Levonorgestrel werden ueberwiegend ueber CYP3A4 metabolisiert; beschleunigter Abbau fuehrt zu subtherapeutischen Kontrazeptivaspiegeln und erhoehtem Schwangerschaftsrisiko.",
        difficulty = 4,
        funFact = "Rifampicin -- technisch kein Antiepileptikum -- ist der staerkste bekannte CYP3A4-Induktor und kann sogar die Wirkung von HIV-Proteaseinhibitoren vollstaendig aufheben."
    ),

    // Question 6 -- P-Glycoprotein Drug Interactions
    Question(
        categoryId = 16,
        questionText = "Welche Rolle spielt P-Glykoprotein (P-gp, MDR1/ABCB1) bei der oralen Bioverfuegbarkeit von Arzneimitteln?",
        answerA = "P-gp hydroxyliert Arzneimittel in Enterozyten und reduziert deren intestinale Absorption",
        answerB = "P-gp ist ein luminaler Efflux-Transporter im Duenndarm, der Substrate aus Enterozyten zurueck ins Darmlumen pumpt und damit die Absorption reduziert",
        answerC = "P-gp konjugiert Arzneimittel mit Glucuronsaeure in der Leber und foerdert biliare Elimination",
        answerD = "P-gp ist ausschliesslich an der Blut-Hirn-Schranke relevant und hat keinen Einfluss auf intestinale Absorption",
        correctAnswer = 1,
        explanation = "P-gp ist ein ATP-abhaengiger ABC-Transporter, der in apikalen Membranen von Duenndarmepithelzellen exprimiert wird und Substrate zurueck ins Darmlumen transportiert. Starke P-gp-Substrate wie Digoxin oder Dabigatran haben deshalb niedrigere orale Bioverfuegbarkeit; P-gp-Inhibitoren (z.B. Verapamil, Chinidin) erhoehen diese.",
        difficulty = 4,
        funFact = "Das Rote Johanniskraut (Hypericum perforatum) induziert sowohl CYP3A4 als auch P-gp -- ein Grund, warum es die Blutspiegel vieler Medikamente drastisch senken kann, darunter Ciclosporin bei Transplantationspatienten."
    ),

    // Question 7 -- Pharmacogenomics: CYP2D6
    Question(
        categoryId = 16,
        questionText = "Ein Patient mit CYP2D6 'Ultra-Rapid Metabolizer' (UM) Status erhaelt Codein zur Schmerztherapie. Welches klinische Szenario ist zu erwarten?",
        answerA = "Unzureichende Analgesie, da Codein bei UM nicht zur aktiven Form umgewandelt wird",
        answerB = "Normale analgetische Wirkung, da CYP2D6-Status Codein nicht beeinflusst",
        answerC = "Potentiell toxische Morphin-Spiegel durch beschleunigtes CYP2D6-vermitteltes O-Demethylierungsrate von Codein zu Morphin",
        answerD = "Erhoehte Codein-Spiegel durch verminderten First-Pass-Effekt",
        correctAnswer = 2,
        explanation = "CYP2D6 katalysiert die O-Demethylierung von Codein zu Morphin (dem aktiven Analgetikum). Bei UM-Genotyp (mehrfache Genkopien) wird Codein extrem schnell zu Morphin konvertiert, was zu lebensbedrohlichen Morphin-Konzentrationen fuehren kann -- insbesondere bei Kindern und stillenden Muettern.",
        difficulty = 4,
        funFact = "Die FDA hat Codein bei Kindern nach Tonsillektomie 2013 mit einer Black-Box-Warnung versehen, nachdem Todesfaelle bei Kindern mit CYP2D6-UM-Genotyp gemeldet worden waren."
    ),

    // Question 8 -- Pharmacogenomics: CYP2C19
    Question(
        categoryId = 16,
        questionText = "Welche klinische Konsequenz hat ein CYP2C19 'Poor Metabolizer' (PM) Status bei einem Patienten, dem Clopidogrel nach Koronarstenting verabreicht wird?",
        answerA = "Verstaerkte antithrombotische Wirkung durch verminderten Clopidogrel-Abbau",
        answerB = "Reduzierte Thrombozytenhemmung und erhoehtes Stent-Thrombose-Risiko, da Clopidogrel ein Prodrug ist, das CYP2C19 zur Aktivierung benoetigt",
        answerC = "Unveraenderte Wirksamkeit, da Clopidogrel hauptsaechlich renal eliminiert wird",
        answerD = "Erhoehte Blutungsgefahr durch akkumuliertes unveraendertes Clopidogrel",
        correctAnswer = 1,
        explanation = "Clopidogrel ist ein Prodrug und muss hepatisch durch CYP2C19 zum aktiven Thiolmetaboliten aktiviert werden, der irreversibel den P2Y12-Rezeptor auf Thrombozyten hemmt. Bei PM-Genotyp (haeufig bei Ostasiaten: bis 20%) bleibt die Aktivierung aus -- erhebliches kardiovaskulaeres Risiko nach Stentimplantation.",
        difficulty = 4,
        funFact = "Omeprazol und andere Protonenpumpenhemmer sind moderate CYP2C19-Hemmer -- die Kombination mit Clopidogrel war lange kontrovers diskutiert und fuehrte zu FDA-Warnhinweisen, obwohl klinische Studien den Effekt relativierten."
    ),

    // Question 9 -- Pharmacogenomics: Warfarin Dosing
    Question(
        categoryId = 16,
        questionText = "Welche zwei genetischen Varianten sind am wichtigsten fuer die individuelle Warfarin-Dosisfindung und welche Mechanismen liegen zugrunde?",
        answerA = "CYP2C9 (verminderter Warfarin-Metabolismus) und VKORC1 (Empfindlichkeit der Vitamin-K-Epoxidreduktase als Warfarin-Zielenzym)",
        answerB = "CYP3A4 (Warfarin-Hydroxylierung) und F5 (Leiden-Mutation -- Resistenz gegenueber Protein C)",
        answerC = "MDR1 (intestinale Warfarin-Absorption) und CYP1A2 (hepatischer Abbau von Warfarin)",
        answerD = "CYP2D6 (S-Warfarin-Metabolismus) und GGCX (Vitamin-K-abhaengige Carboxylase)",
        correctAnswer = 0,
        explanation = "CYP2C9-Polymorphismen (*2, *3) reduzieren den Metabolismus von S-Warfarin (5-10x potenter als R-Warfarin) -- niedrigere Dosierung noetig. VKORC1-Varianten (besonders -1639G>A) aendern die Expression des Zielenzyms Vitamin-K-Epoxidreduktase. Zusammen erklaeren diese zwei Gene ca. 40-50% der Dosisvariation.",
        difficulty = 4,
        funFact = "Das FDA-Label von Warfarin wurde 2010 aktualisiert, um Dosierungsempfehlungen basierend auf CYP2C9- und VKORC1-Genotypen einzuschliessen -- ein Meilenstein in der klinischen Pharmakogenomik."
    ),

    // Question 10 -- Monoclonal Antibodies: Naming Convention
    Question(
        categoryId = 16,
        questionText = "Was verraet die INN-Nomenklatur des monoklonalen Antikoerpers 'Pembrolizumab' ueber seine Herkunft und sein Ziel?",
        answerA = "'-umab' steht fuer chimaeraen Ursprung (Maus/Mensch); 'pembro-' kodiert fuer PD-L1 als Zielstruktur",
        answerB = "'-zumab' steht fuer humanisierten Antikoerper; '-li-' kodiert fuer Immunsystem als Zielbereich",
        answerC = "'-mab' kennzeichnet monoklonalen Antikoerper; '-pembrolizu-' hat keine systematische Bedeutung -- individueller Stammname; Suffix '-umab' wuerde voll humanen Ursprung anzeigen",
        answerD = "'-mab' steht fuer Bispezifitaet; '-o-' vor '-mab' zeigt murinen Ursprung an",
        correctAnswer = 2,
        explanation = "Die INN-Nomenklatur fuer -mab-Antikoerper: Stammname (frei waehlbar) + optionaler Substem fuer Zielklasse + Ursprungssubstem + -mab. Pembrolizumab endet auf '-umab' (voll humaner Antikoerper), '-liz-' ist kein standardisierter Zielsubstem -- die Verbindung mit PD-1 ist im Namen nicht direkt kodiert.",
        difficulty = 4,
        funFact = "Die WHO hat 2021 die -mab-Nomenklatur reformiert: Die alten Ursprungs-Substems (-o- fuer Maus, -xi- fuer chimaer, -zu- fuer humanisiert, -u- fuer human) wurden abgeschafft -- neue Antikoerper erhalten jetzt nur noch einen individuellen Stammteil plus '-mab'."
    ),

    // Question 11 -- Monoclonal Antibodies: ADCC Mechanism
    Question(
        categoryId = 16,
        questionText = "Ueber welchen Mechanismus vermittelt Rituximab (Anti-CD20) seine therapeutische Wirkung bei B-Zell-Lymphomen?",
        answerA = "Ausschliesslich durch Blockade des CD20-Rezeptors als Ionenkanal und Induktion von Apoptose",
        answerB = "Durch Kombination aus ADCC (antikoerperabhaengige zellulaere Zytotoxizitaet via Fc-Rezeptoren auf NK-Zellen), CDC (Komplementaktivierung) und direkter Apoptoseinduktion",
        answerC = "Durch Kompetitive Hemmung von CD20 als B-Zell-Korezeptor und Blockade der BCR-Signalkaskade",
        answerD = "Durch Abgabe von Radioisotopen nach Internalisierung in B-Zellen",
        correctAnswer = 1,
        explanation = "Rituximab wirkt multipel: (1) ADCC -- Fc-Teil bindet FcgammaRIII (CD16) auf NK-Zellen und Makrophagen; (2) CDC -- Fc-Teil aktiviert Komplementkaskade (C1q-Bindung) mit Membranangriffskomlex-Bildung; (3) Direkte Signaltransduktion durch CD20-Quervernetzung foerdert Apoptose.",
        difficulty = 4,
        funFact = "Rituximab war 1997 das erste FDA-zugelassene monoklonale Antikoerper-Therapeutikum fuer Krebs und revolutionierte die Behandlung des Non-Hodgkin-Lymphoms -- es wird auch heute noch bei B-Zell-Lymphomen und Autoimmunerkrankungen eingesetzt."
    ),

    // Question 12 -- Tyrosine Kinase Inhibitors: BCR-ABL
    Question(
        categoryId = 16,
        questionText = "Warum entwickelt sich unter Imatinib-Therapie bei chronischer myeloischer Leukaemie (CML) haeufig eine Resistenz und wie wirkt Ponatinib dagegen?",
        answerA = "Imatinib wird durch P-gp aus CML-Zellen gepumpt; Ponatinib ist kein P-gp-Substrat",
        answerB = "BCR-ABL-Punktmutationen (besonders T315I 'Gatekeeper-Mutation') verhindern Imatinib-Bindung; Ponatinib ist der einzige TKI, der auch T315I hemmt, da er die Acetylengruppe zur Umgehung nutzt",
        answerC = "BCR-ABL wird durch Imatinib hochreguliert; Ponatinib hemmt die BCR-ABL-Transkription direkt",
        answerD = "Imatinib-Resistenz entsteht durch BCR-ABL-Amplifikation; Ponatinib hemmt zusaetzlich ABL2",
        correctAnswer = 1,
        explanation = "Die T315I-Mutation (Threonin zu Isoleucin an Position 315) der ABL-Kinasedomaene zerstoert eine kritische Wasserstoffbruecke mit Imatinib und erzeugt sterische Hinderung -- alle Erstgenerations-TKIs versagen. Ponatinibs Alkin-Linker ermoeglicht geometrisch eine Bindung trotz der Isoleucin-Seitenkette.",
        difficulty = 4,
        funFact = "Die T315I-Mutation heisst 'Gatekeeper-Mutation', weil Threonin 315 wie ein Torwaechter den Zugang zur hydrophoben Tasche der Kinase kontrolliert -- ein Begriff, der sich durch die gesamte Onkologie-Pharmakologie verbreitet hat."
    ),

    // Question 13 -- EGFR Targeted Therapy
    Question(
        categoryId = 16,
        questionText = "Welche KRAS-Mutation macht nicht-kleinzellige Lungenkarzinome (NSCLC) refraktaer gegenueber EGFR-Tyrosinkinaseinhibitoren und warum?",
        answerA = "KRAS G12C verhindert die EGFR-Proteinexpression durch epigenetische Stummschaltung",
        answerB = "KRAS-Aktivierungsmutationen (z.B. G12V, G12C) halten den RAS/MAPK-Signalweg konstitutiv aktiv, unabhaengig von EGFR-Signalen proximal im Signalweg",
        answerC = "Mutiertes KRAS phosphoryliert EGFR direkt und macht es unempfindlich gegenueber TKI-Bindung",
        answerD = "KRAS-Mutationen fuehren zu BCL-2-Ueberexpression und Apoptosehemmung, unabhaengig von TKI-Wirkung",
        correctAnswer = 1,
        explanation = "KRAS liegt downstream von EGFR im RAS/RAF/MEK/ERK-Signalweg. Onkogene KRAS-Mutationen (insbesondere in Codon 12 oder 13) hemmen die intrinsische GTPase-Aktivitaet, sodass KRAS permanent im GTP-gebundenen (aktiven) Zustand verbleibt und den Weg unabhaengig von EGFR-Signalen aktiviert.",
        difficulty = 4,
        funFact = "KRAS G12C ist die haeufigste einzelne KRAS-Mutation beim Lungenkarzinom und lange als 'undruggable' galt. Sotorasib (2021 FDA-zugelassen) war der erste kovalente KRAS-G12C-Inhibitor -- ein pharmakologischer Durchbruch nach Jahrzehnten erfolgloser Versuche."
    ),

    // Question 14 -- HER2 Targeted Therapy
    Question(
        categoryId = 16,
        questionText = "Was unterscheidet den Wirkmechanismus von Trastuzumab von dem des Lapatinibs bei HER2-ueberexprimierendem Mammakarzinom?",
        answerA = "Trastuzumab ist ein oraler TKI, Lapatinib ein intravenoeser monoklonaler Antikoerper",
        answerB = "Trastuzumab bindet extrazellullaer an HER2-Domaene IV und aktiviert ADCC; Lapatinib ist ein intrazellulaerer dualer EGFR/HER2-TKI, der die ATP-Bindestelle blockiert",
        answerC = "Trastuzumab hemmt nur HER2-Homodimerisierung; Lapatinib hemmt ausschliesslich HER3-Heterodimere",
        answerD = "Beide haben identischen Wirkmechanismus, unterscheiden sich nur in der Pharmakokinetik",
        correctAnswer = 1,
        explanation = "Trastuzumab (Herceptin) ist ein humanisierter monoklonaler IgG1-Antikoerper, der an die Subdomaene IV der extrazellullaeren HER2-Domaene bindet, Signaltransduktion hemmt und via Fc-Region ADCC induziert. Lapatinib ist ein kleines Molekuel, das intrazellullaer die Tyrosinkinase-ATP-Bindestelle von EGFR und HER2 reversibel hemmt.",
        difficulty = 4,
        funFact = "Das Antikoerper-Wirkstoff-Konjugat T-DM1 (Trastuzumab-Emtansin) kombiniert das HER2-Targeting von Trastuzumab mit einem zytotoxischen Mikrotubuli-Inhibitor (DM1) -- Trastuzumab fungiert dabei als 'molekulares Taxi' fuer die Chemotherapie."
    ),

    // Question 15 -- CAR-T Cell Therapy
    Question(
        categoryId = 16,
        questionText = "Aus welchen funktionellen Domaenen besteht ein typisches CAR-T-Konstrukt der zweiten Generation und welche Rolle spielt jede Domaene?",
        answerA = "Extrazellulaerer TCR-alpha/beta-Komplex (Antigenerkennung) + CD3-zeta (Signaltransduktion) + CD28 (Kostimulation)",
        answerB = "Extrazellulaeres scFv-Antikoerperfragment (Antigenerkennung) + Transmembranregion + intrazellulaere CD3-zeta-Kette (Aktivierungssignal) + ein kostimulatorisches Modul (CD28 oder 4-1BB)",
        answerC = "Extrazellulaeres Fab-Fragment + IgG-Fc-Region (Kostimulation) + intrazellulaere Zap70-Kinasedomaene",
        answerD = "NK-Zell-Rezeptor NKG2D (Antigenerkennung) + DNAM-1 (Kostimulation) + CD3-zeta (Signaltransduktion)",
        correctAnswer = 1,
        explanation = "CAR der 2. Generation bestehen aus: (1) Extrazellulaeres single-chain variable fragment (scFv) zur MHC-unabhaengigen Antigenerkennung; (2) Scharnier- und Transmembranregion; (3) Intrazellulaeres CD3-zeta-Aktivierungssignal (ITAM-Motive); (4) Einem kostimulatorischen Modul (CD28 fuer schnelle Expansion, 4-1BB fuer Langlebigkeit der T-Zellen).",
        difficulty = 4,
        funFact = "CAR-T-Therapien gegen CD19 (Tisagenlecleucel, Axicabtagene) koennen Remissionsraten von ueber 80% bei refraktaeren B-Zell-Lymphomen erzielen -- bei Patienten, die alle anderen Therapien versagt hatten."
    ),

    // Question 16 -- Checkpoint Inhibitors: PD-1/PD-L1
    Question(
        categoryId = 16,
        questionText = "Welcher molekulare Mechanismus erklaert, warum Tumorzellen durch PD-L1-Expression einer T-Zell-vermittelten Eliminierung entkommen?",
        answerA = "PD-L1 aktiviert den T-Zell-Rezeptor und leitet T-Zellen zur Migration in benachbartes Gewebe um",
        answerB = "PD-L1 auf Tumorzellen bindet PD-1 auf T-Zellen; die resultierende PD-1-Signalkaskade aktiviert Phosphatasen (SHP-2), die TCR-proximale Signalmolekuele (Zap70, CD3-zeta) dephosphorylieren und die T-Zell-Aktivierung unterbrechen",
        answerC = "PD-L1 induziert T-Zell-Apoptose durch direkte Aktivierung des Fas-Liganden auf T-Zellen",
        answerD = "PD-L1 verdeckt MHC-I-Molekuele auf Tumorzellen und verhindert damit die Antigenpraesentation",
        correctAnswer = 1,
        explanation = "PD-1 (programmierter Zelltod-Rezeptor 1) ist ein inhibitorischer Ko-Rezeptor auf T-Zellen. Bindung von PD-L1 (auf Tumorzellen oder Immunzellen) rekrutiert SHP-1/SHP-2-Phosphatasen, die Zap70 und ITAMs an CD3-zeta dephosphorylieren -- T-Zell-Erschoepfung (Exhaustion) ist die Folge. Anti-PD-1/PD-L1-Antikoerper unterbrechen dieses Signal.",
        difficulty = 4,
        funFact = "James Allison und Tasuku Honjo erhielten 2018 den Medizin-Nobelpreis fuer die Entdeckung der Immun-Checkpoint-Therapie durch CTLA-4- (Allison) bzw. PD-1-Inhibition (Honjo)."
    ),

    // Question 17 -- Checkpoint Inhibitors: irAEs
    Question(
        categoryId = 16,
        questionText = "Welche pathophysiologische Ursache liegt immunvermittelten Nebenwirkungen (irAEs) unter Checkpoint-Inhibitoren zugrunde?",
        answerA = "Direkte Tumorantigen-Kreuzreaktivitaet mit Normalgewebe durch aktivierte T-Zellen, die durch aufgehobene Selbsttoleranz-Mechanismen ziellos Koerpergewebe angreifen",
        answerB = "Zytokinausschuettung durch Tumorzellen nach T-Zell-Lyse, die systemische Entzuendungsreaktionen ausloest",
        answerC = "Direkte Antikoerperbindung an Normalgewebe durch Kreuzreaktivitaet des therapeutischen Antikoerpers",
        answerD = "Erhoehte CTLA-4-Expression auf gesunden T-Zellen als Reboundeffekt nach Hemmung",
        correctAnswer = 0,
        explanation = "Checkpoint-Inhibitoren (anti-CTLA-4, anti-PD-1/L1) heben periphere Toleranzmechanismen auf, die normalerweise Autoimmunreaktionen verhindern. Dadurch koennen aktivierte T-Zellen, die Tumorantigene erkennen, kreuzreaktiv Koerpergewebe angreifen (Thyreoiditis, Kolitis, Pneumonitis, Hepatitis u.a.).",
        difficulty = 4,
        funFact = "Anti-CTLA-4-Antikoerper (Ipilimumab) erzeugen haeufiger und schwerere irAEs als PD-1/PD-L1-Inhibitoren, da CTLA-4 frueher im T-Zell-Aktivierungsprozess (lymphatische Organe) agiert als PD-1 (peripheres Gewebe)."
    ),

    // Question 18 -- Anticoagulation: Warfarin Mechanism
    Question(
        categoryId = 16,
        questionText = "Warum hat Warfarin eine verzoegerte Anschlagszeit von 3-7 Tagen trotz sofortiger VKORC1-Hemmung?",
        answerA = "Weil Warfarin langsam intestinal absorbiert wird und erst nach Tagen therapeutische Plasmaspiegel erreicht",
        answerB = "Weil bereits vorhandene (zirkulierende) Gerinnungsfaktoren II, VII, IX, X ihre normale Halbwertszeit haben muessen, bevor sie durch neue, dysfunktionale Faktoren ersetzt werden",
        answerC = "Weil Vitamin K einen grossen hepatischen Speicherpool hat, der erst erschoepft werden muss",
        answerD = "Weil Warfarin eine pharmakologische Toleranz entwickelt und die Dosis in den ersten Tagen hoeher sein muss",
        correctAnswer = 1,
        explanation = "Warfarin blockiert sofort VKORC1 und die Carboxylierung neuer Gerinnungsfaktoren (Prothrombin T1/2 ~72h; Faktor X ~40h; IX ~25h; VII ~6h). Jedoch zirkulieren bereits vorhandene, funktionale Faktoren weiter -- volle Antikoagulation tritt erst ein, wenn diese durch nicht-funktionale ersetzt wurden.",
        difficulty = 4,
        funFact = "Faktor VII hat die kuerzeste Halbwertszeit (~6h) -- deshalb steigt der INR zuerst an (PT-basiert, Faktor VII-sensitiv), obwohl die antithrombotische Wirkung (Faktoren II, IX, X) erst viel spaeter einsetzt."
    ),

    // Question 19 -- DOACs: Direct Thrombin Inhibitors
    Question(
        categoryId = 16,
        questionText = "Welcher Mechanismus unterscheidet Dabigatran von Rivaroxaban und Apixaban in der Antikoagulations-Kaskade?",
        answerA = "Dabigatran hemmt Thrombin (Faktor IIa) direkt; Rivaroxaban und Apixaban hemmen Faktor Xa direkt",
        answerB = "Dabigatran hemmt Faktor Xa allosterisch; Rivaroxaban hemmt Faktor IIa direkt",
        answerC = "Dabigatran ist ein Vitamin-K-Antagonist; Rivaroxaban und Apixaban hemmen die Thrombinaktivierung indirekt",
        answerD = "Dabigatran hemmt den Tissue Factor-Weg; Rivaroxaban und Apixaban hemmen den intrinsischen Weg",
        correctAnswer = 0,
        explanation = "Dabigatran ist ein direkter Thrombininhibitor (DTI), der reversibel sowohl freies als auch fibringebundenes Thrombin (Faktor IIa) hemmt. Rivaroxaban, Apixaban und Edoxaban sind direkte Faktor-Xa-Inhibitoren, die die Prothrombinase-Komplex-vermittelte Thrombinaktivierung blockieren.",
        difficulty = 4,
        funFact = "Dabigatran (als Dabigatranetexilat-Prodrug) ist ein seltenes Beispiel eines Prodrugs unter den DOACs -- es wird oral als inaktives Prodrug resorbiert und dann durch Esterasen zur aktiven Form hydrolysiert, was es bei Schluckproblemen problematisch macht (Kapseln nicht oeffnen!)."
    ),

    // Question 20 -- Anticoagulation: Heparin vs. LMWH
    Question(
        categoryId = 16,
        questionText = "Warum hemmt unfraktioniertes Heparin (UFH) sowohl Thrombin als auch Faktor Xa, waehrend niedermolekulare Heparine (NMH) bevorzugt Faktor Xa hemmen?",
        answerA = "UFH hat eine hoehere Affinitaet zu Antithrombin III als NMH",
        answerB = "UFH-Ketten muessen lang genug sein (>18 Saccharideinheiten), um gleichzeitig Antithrombin und Thrombin zu bruecken; NMH-Fragmente sind zu kurz fuer diese Brueckenbildung, koennen aber Antithrombin fuer die Faktor-Xa-Hemmung aktivieren",
        answerC = "NMH enthalten chemisch modifizierte Saccharide, die spezifisch die Xa-Bindestelle maskieren",
        answerD = "UFH hemmt Thrombin durch direkte kovalente Bindung; NMH wirken nur als Antithrombin-Kofaktor",
        correctAnswer = 1,
        explanation = "Heparin wirkt als Kofaktor von Antithrombin (AT). Fuer die Thrombin-Hemmung muss Heparin einen ternaren Komplex (Heparin-AT-Thrombin) bilden -- dafuer sind mindestens 18 Saccharideinheiten noetig. NMH-Fragmente (4-22 Saccharide) sind meist zu kurz fuer Thrombin-Bruecken, aktivieren aber AT fuer die Faktor-Xa-Hemmung (erfordert nur das Pentasaccharid).",
        difficulty = 4,
        funFact = "Fondaparinux ist ein synthetisches Pentasaccharid -- exakt der minimale AT-aktivierende Teil des Heparins -- und hemmt ausschliesslich Faktor Xa, nicht Thrombin. Dies erklaert seine HIT-Freiheit (keine Bindung an PF4/Heparin-Komplexe)."
    ),

    // Question 21 -- INR Monitoring
    Question(
        categoryId = 16,
        questionText = "Welchen INR-Zielbereich empfehlen aktuelle Leitlinien fuer Patienten mit mechanischen Herzklappen in Mitralposition unter Warfarin?",
        answerA = "INR 1,5 -- 2,0 (niedrig-therapeutisch)",
        answerB = "INR 2,0 -- 3,0 (Standard-therapeutisch)",
        answerC = "INR 2,5 -- 3,5 (hoch-therapeutisch)",
        answerD = "INR 3,5 -- 4,5 (sehr hoch-therapeutisch)",
        correctAnswer = 2,
        explanation = "Mechanische Mitralklappen haben ein hoehereres thromboembolisches Risiko als Aortenklappen, weshalb ein hoeherer INR-Zielwert von 2,5-3,5 empfohlen wird (vs. 2,0-3,0 fuer mechanische Aortenklappe bei niedrigem Risiko). DOACs sind bei mechanischen Herzklappen kontraindiziert.",
        difficulty = 4,
        funFact = "Die RE-ALIGN-Studie (2013) musste vorzeitig abgebrochen werden, weil Dabigatran bei mechanischen Herzklappen deutlich mehr Schlaganfaelle und Blutungen verursachte als Warfarin -- ein einzigartiges Beispiel, wo ein DOAC klar unterlegen war."
    ),

    // Question 22 -- Antimicrobial Stewardship: Carbapenem Resistance
    Question(
        categoryId = 16,
        questionText = "Welcher Resistenzmechanismus macht Klebsiella pneumoniae Carbapenemase (KPC)-produzierende Staemme gegen nahezu alle Betalaktame resistent?",
        answerA = "Veraenderter Porin-Ausdruck mit Hemmung der Carbapenem-Penetration in die Zelle",
        answerB = "KPC ist eine Klasse-A-Serinprotease, die Carbapeneme durch Hydrolyse des Betalaktam-Rings inaktiviert -- KPC-Gene befinden sich auf Plasmiden (blaKPC) mit horizontalem Transferpotenzial",
        answerC = "KPC-Bakterien ueberexprimieren AcrAB-TolC-Effluxpumpen, die Carbapeneme aktiv herausbefoerdern",
        answerD = "KPC modifiziert Penicillin-bindende Proteine (PBPs) so, dass Carbapeneme keine ausreichende Affinitaet mehr haben",
        correctAnswer = 1,
        explanation = "KPC-Enzyme gehoeren zur Klasse A (Ambler-Klassifikation) der Serinbeta-Laktamasen und hydrolysieren effizient alle Betalaktame inklusive Carbapeneme. Das blaKPC-Gen befindet sich typischerweise auf konjugativen Plasmiden (oft mit mehreren weiteren Resistenzgenen) -- horizontaler Gentransfer erklaert die pandemische Ausbreitung.",
        difficulty = 4,
        funFact = "KPC wurde erstmals 1996 in North Carolina isoliert und hat sich seitdem weltweit ausgebreitet. Ceftazidim-Avibactam (Avibactam hemmt KPC) wurde 2015 als Therapieoption eingesetzt -- innerhalb eines Jahres wurden jedoch schon Resistenzen dagegen dokumentiert."
    ),

    // Question 23 -- Antimicrobial Stewardship: MRSA
    Question(
        categoryId = 16,
        questionText = "Warum sind alle Betalaktam-Antibiotika gegen MRSA (Methicillin-resistenter Staphylococcus aureus) klinisch unwirksam?",
        answerA = "MRSA produziert eine Penicillinase, die spezifisch Methicillin hydrolysiert und auf alle Betalaktame kreuzreagiert",
        answerB = "MRSA exprimiert PBP2a (mecA-Gen), ein veraendertes Penicillin-bindendes Protein mit stark reduzierter Betalaktam-Affinitaet, das die Zellwandsynthese bei therapeutischen Konzentrationen aufrechterhaelt",
        answerC = "MRSA besitzt eine Doppelmembran wie gramnegative Bakterien, die den Zugang von Betalaktamen zur Bindestelle verhindert",
        answerD = "MRSA ueberexprimiert NorA-Effluxpumpen, die alle Betalaktame aus der Zelle eliminieren",
        correctAnswer = 1,
        explanation = "Das mecA-Gen (auf SCCmec-Kassette) kodiert PBP2a, eine Transpeptidase mit extrem geringer Affinitaet fuer alle Betalaktame (Penicilline, Cephalosporine, Carbapeneme). PBP2a uebernimmt die Zellwandsynthese, wenn native PBPs durch Betalaktame gehemmt werden -- klassische Resistenz durch Zielstrukturveraenderung.",
        difficulty = 4,
        funFact = "Ceftarolin ist das erste und einzige Cephalosporin mit Aktivitaet gegen MRSA -- es hat eine einzigartige Seitenkettenstruktur, die eine ausreichende Bindungsaffinitaet zu PBP2a ermoeglicht. Eine pharmakologische Ausnahme in der Betalaktam-Klasse."
    ),

    // Question 24 -- Drug Development: Preclinical Phase
    Question(
        categoryId = 16,
        questionText = "Was ist das Ziel des Ames-Tests in der praeklinischen Arzneimittelentwicklung?",
        answerA = "Bestimmung der maximalen tolerierten Dosis (MTD) an Nagetieren",
        answerB = "Nachweis kanzerogener Potenz durch Langzeitexpositions-Studien an Affen",
        answerC = "Screening auf Mutagenizitaet durch Messung revertierter Histidin-auxotropher Salmonella-Mutanten nach Substanzexposition",
        answerD = "Bewertung der hepatotoxischen Potenz durch primaerem Hepatozytenkultur-Assay",
        correctAnswer = 2,
        explanation = "Der Ames-Test (entwickelt von Bruce Ames, 1970er) verwendet His-auxotrophe Salmonella typhimurium-Staemme. Mutagene Substanzen induzieren Revertantenmutationen, die das Wachstum ohne Histidin wiederherstellen -- positive Ergebnisse korrelieren mit Kanzerogenitaetspotenzial und koennen Entwicklungsstopp ausloesen.",
        difficulty = 4,
        funFact = "Der Ames-Test wird standardmaessig mit einem Leber-S9-Fraktionextrakt (Ratten) kombiniert, um auch Promutagene zu erfassen, die erst nach hepatischem Metabolismus mutagen werden -- ein elegantes Mimikri des hepatischen First-Pass-Effekts in vitro."
    ),

    // Question 25 -- Drug Development: Phase I Trials
    Question(
        categoryId = 16,
        questionText = "Was ist die primaere Zielsetzung einer Phase-I-Studie in der klinischen Arzneimittelentwicklung?",
        answerA = "Nachweis der therapeutischen Ueberlegenheit gegenueber Standardtherapie in der Zielpopulation",
        answerB = "Ermittlung von Sicherheit, Vertraeglichkeit, Pharmakokinetik und Dosisfindung (MTD oder RP2D) -- typischerweise an kleinen Gruppen gesunder Probanden oder Krebspatienten (Onkologie)",
        answerC = "Randomisierter kontrollierter Nachweis der Wirksamkeit gegenueber Placebo",
        answerD = "Langzeit-Surveillance zur Erfassung seltener Nebenwirkungen nach Marktzulassung",
        correctAnswer = 1,
        explanation = "Phase-I-Studien dienen primar der Sicherheits- und PK-Charakterisierung sowie Dosisfindung. In der Onkologie wird haeufig die Maximum Tolerated Dose (MTD) oder Recommended Phase 2 Dose (RP2D) ermittelt. Typisches Design: 3+3-Schema oder moderne Bayesische Dose-Escalation-Algorithmen (BOIN, mTPI).",
        difficulty = 4,
        funFact = "Bis zu 90% aller Substanzen, die in Phase I eintreten, erreichen nie die Marktzulassung -- der groesste Anteil scheitert in Phase II/III an mangelnder Wirksamkeit, nicht an Sicherheitsproblemen."
    ),

    // Question 26 -- Drug Development: Adaptive Trials
    Question(
        categoryId = 16,
        questionText = "Was versteht man unter einem 'Basket Trial' in der modernen Onkologie-Klinischen Forschung?",
        answerA = "Eine Studie, bei der mehrere Therapiearme gleichzeitig getestet werden, aber alle Patienten die gleiche Tumorentitaet haben",
        answerB = "Eine Studie, die eine Substanz bei Patienten mit verschiedenen Tumorentitaeten testet, die alle die gleiche genomische Zielveraenderung (Biomarker) tragen",
        answerC = "Eine adaptive Studie, die auf Basis von Zwischenanalysen neue Therapiearme aufnehmen kann",
        answerD = "Eine Phase-III-Studie, die mehrere Subgruppenanalysen nach Biomarkerstatus zulasst",
        correctAnswer = 1,
        explanation = "Basket Trials testen einen zielgerichteten Wirkstoff 'histologie-agnostisch' bei allen Patienten, die die relevante Zielveraenderung tragen -- unabhaengig vom Tumor-Ursprungsorgan. Grundannahme: Die Mutation, nicht das Organ, bestimmt die Therapieresponse. Beispiel: Larotrectinib bei NTRK-Fusionsgenen.",
        difficulty = 4,
        funFact = "Das FDA-Konzept der 'Tissue-Agnostic Approval' wurde 2017 mit Pembrolizumab (fuer MSI-H/dMMR-Tumoren) eingefuehrt -- die erste biomarkerbasierte, tumor-agnostische Zulassung in der Geschichte der FDA."
    ),

    // Question 27 -- Therapeutic Drug Monitoring: Vancomycin
    Question(
        categoryId = 16,
        questionText = "Warum wird bei Vancomycin-Therapie heute bevorzugt das AUC/MIC-Verhaeltnis (AUC24/MIC) statt dem Trough-Spiegel als PK/PD-Zielparameter verwendet?",
        answerA = "Weil Trough-Spiegel nur bei peroraler Vancomycin-Gabe messbar sind",
        answerB = "Weil Trough-Spiegel gut mit Nephrotoxizitaet korrelieren, aber AUC/MIC die bakterizide Wirksamkeit besser vorhersagt -- hohe Troughs (>20 mg/L) zur Erzielung hoher AUC waren mit erhoehter Nephrotoxizitaet assoziiert",
        answerC = "Weil Trough-Spiegel nur bei MRSA-Pneumonie relevant sind, AUC/MIC bei allen anderen Indikationen",
        answerD = "Weil der Trough-Spiegel den Post-Antibiotic-Effect nicht beruecksichtigt, der bei Vancomycin besonders ausgepraegt ist",
        correctAnswer = 1,
        explanation = "Traditionell wurden Vancomycin-Trough-Spiegel von 15-20 mg/L angestrebt, was aber mit hoeherem Nephrotoxizitaetsrisiko verbunden war. ASHP/IDSA/SIDP-Leitlinien 2020 empfehlen AUC24/MIC 400-600 mg*h/L als Zielparameter (bei MIC <=1 mg/L), da AUC besser mit Wirksamkeit korreliert und niedrigere Troughs bei normaler AUC akzeptabler sind.",
        difficulty = 4,
        funFact = "Vancomycin wurde als 'Last Resort'-Antibiotikum gegen MRSA etwas zynisch als 'Mississippi Mud' bezeichnet -- wegen seiner braunen Farbe durch Verunreinigungen in fruehen Praeparationen der 1950er Jahre, die zu erheblicher Toxizitaet fuehrten."
    ),

    // Question 28 -- Therapeutic Drug Monitoring: Aminoglycosides
    Question(
        categoryId = 16,
        questionText = "Welches PK/PD-Prinzip liegt der Extended Interval Dosing (EID) Strategie fuer Aminoglykoside zugrunde?",
        answerA = "Aminoglykoside zeigen zeitabhaengige Bakterizidie -- laengere Expositionszeit erhoehrt die Wirksamkeit",
        answerB = "Aminoglykoside zeigen konzentrationsabhaengige Bakterizidie (Cmax/MIC als Zielparameter) und einen ausgepraegte Post-Antibiotic-Effect -- einmalige hohe Dosis ist wirksamer als gleiche Tagesdosis aufgeteilt",
        answerC = "EID minimiert die Trough-Spiegel, um den AUC/MIC-Wert zu senken und Nephrotoxizitaet zu reduzieren",
        answerD = "EID nutzt den Saettigungseffekt der renalen Tubuluszellen -- Einmalgabe saettigt nicht-saturable Akkumulationsmechanismen",
        correctAnswer = 1,
        explanation = "Aminoglykoside wirken konzentrationsabhaengig -- Cmax/MIC >= 8-10 korreliert mit klinischem Therapieerfolg. Zusaetzlich haben sie einen ausgepraegte Post-Antibiotic-Effect (PAE), d.h. antibakterielle Wirkung setzt auch nach Abfall unter MIC fort. EID (Einmalgabe der gesamten Tagesdosis) optimiert Cmax/MIC und erlaubt durch niedrige Troughs eine teilweise Erholung der Tubuluszellen -- reduziertes Nephrotoxizitaetsrisiko.",
        difficulty = 4,
        funFact = "Die Ototoxizitaet von Aminoglykosiden ist mit einer genetischen Variante in der mitochondrialen 12S-rRNA assoziiert (m.1555A>G) -- Traeger dieser Mutation koennen nach einer einzigen Aminoglykosid-Dosis irreversibel ertauben."
    ),

    // Question 29 -- Therapeutic Drug Monitoring: Cyclosporin
    Question(
        categoryId = 16,
        questionText = "Warum ist Ciclosporin besonders schwierig in der therapeutischen Arzneimittelueberwachung und welche pharmakokinetische Eigenschaft macht Trough-Spiegel manchmal unreliabel?",
        answerA = "Ciclosporin hat eine sehr kurze Halbwertszeit und muss daher mehrmals taeglich gemessen werden",
        answerB = "Ciclosporin hat eine stark variable und nahrungsabhaengige Bioverfuegbarkeit (10-60%), ausgepragte intra- und interindividuelle PK-Variabilitaet sowie enges therapeutisches Fenster -- Trough-Spiegel (C0) korrelieren nicht immer gut mit der Gesamtexposition (AUC)",
        answerC = "Ciclosporin wird bevorzugt intrazellulaer akkumuliert und Plasmaspiegel reflektieren nicht die Gewebekonzentration",
        answerD = "Ciclosporin wird hauptsaechlich renal eliminiert, was durch Nierentransplantations-Dysfunktion stark stoerbar ist",
        correctAnswer = 1,
        explanation = "Ciclosporin hat ausgepraegt variable Bioverfuegbarkeit (Microemulsion-Formulierung verbesserte dies), ist CYP3A4- und P-gp-Substrat mit zahllosen Wechselwirkungen, und die PK korreliert schlecht zwischen Trough (C0) und AUC. C2-Monitoring (2h nach Einnahme) oder AUC0-4h werden in einigen Zentren bevorzugt.",
        difficulty = 4,
        funFact = "Ciclosporin wurde 1970 aus einem norwegischen Bodenpilz (Tolypocladium inflatum) isoliert -- sein Entdecker Jean-Francois Borel erkannte das immunsuppressive Potenzial erst, als er fast keine Wirkung auf das allgemeine Immunsystem sah, aber massive Hemmung der T-Zell-Proliferation."
    ),

    // Question 30 -- Drug-Drug Interaction: QT Prolongation
    Question(
        categoryId = 16,
        questionText = "Welches molekulare Target vermittelt das QT-Verlaengerungs-Risiko vieler nicht-kardialer Arzneimittel (z.B. Azithromycin, Haloperidol, Methadon)?",
        answerA = "L-Typ-Kalziumkanal (CACNA1C) -- beschleunigter Kalziuminflux verlaengert die Aktionspotenzial-Repolarisation",
        answerB = "HERG-Kaliumkanal (KCNH2) -- Blockade des schnellen Kaliumausstromkanals (IKr) verzoegert die kardiake Repolarisation und verlaengert das QT-Intervall",
        answerC = "Natriumkanal Nav1.5 (SCN5A) -- persistenter Natriumeinstrom verlaengert das Aktionspotenzial-Plateau",
        answerD = "HCN4-Kanal (If, Schrittmacherstrom) -- Hemmung verlangsamt die Herzfrequenz und verlaengert indirekt das QTc",
        correctAnswer = 1,
        explanation = "Der HERG (Human Ether-a-go-go Related Gene) Kaliumkanal traegt den rapid-verzoegetren Gleichrichter-Kaliumstrom (IKr) in Kardiomyozyten. Seine einzigartige Bindungstasche macht ihn anfaellig fuer viele aromatische und basische Arzneimittel. IKr-Blockade verzoegert Phase-3-Repolarisation --> QT-Verlaengerung --> Risiko fuer Torsades de Pointes.",
        difficulty = 4,
        funFact = "Terfenadin und Astemizol -- einst weltweit meistverkaufte Antihistaminika -- wurden vom Markt genommen, weil sie bei Kombination mit CYP3A4-Inhibitoren (durch erhoehte Plasmaspiegel) lebensbedrohliche Torsades de Pointes verursachten. Dies revolutionierte die praeklinische HERG-Kanal-Testung."
    ),

    // Question 31 -- Pharmacokinetics: Two-Compartment Model
    Question(
        categoryId = 16,
        questionText = "Was beschreibt die Alpha-Phase (Verteilungsphase) im Zwei-Kompartiment-Modell nach intravenoeser Bolus-Gabe?",
        answerA = "Den langsamen terminalen Abfall der Plasmakonzentration, der ausschliesslich durch renale Clearance bestimmt wird",
        answerB = "Die initiale schnelle Abnahme der Plasmakonzentration durch Arzneimittelverteilung vom zentralen (Blut/hochperfundierte Organe) ins periphere Kompartiment (Muskeln, Fettgewebe)",
        answerC = "Den Anstieg der Gewebekonzentration nach oraler Gabe bis zum Erreichen des Verteilungsgleichgewichts",
        answerD = "Die Absorptionsphase bei extravaskulaerer Applikation mit First-Order-Kinetik",
        correctAnswer = 1,
        explanation = "Im 2-Kompartiment-Modell zeigt der Plasmakonzentrations-Zeit-Verlauf nach i.v. Bolus eine biexponentielle Abnahme: Alpha-Phase (schnell) = Gleichgewichtseinstellung zwischen zentralem und peripherem Kompartiment (Verteilung); Beta-Phase (langsam) = terminale Eliminationsphase nach vollstaendiger Verteilung.",
        difficulty = 4,
        funFact = "Bei hochlipophilen Substanzen wie Thiopental ist die Alpha-Phase so ausgepraegt, dass der Schlafeffekt nach Bolusinjektion innerhalb von Minuten durch Umverteilung endet -- nicht durch Metabolisierung. Dieser 'Redistribution Sleep' erklaert die kurze Wirkdauer."
    ),

    // Question 32 -- Antimicrobial Pharmacodynamics: Time vs Concentration
    Question(
        categoryId = 16,
        questionText = "Welcher PK/PD-Zielparameter ist fuer die Wirksamkeit von Betalaktam-Antibiotika entscheidend und warum?",
        answerA = "AUC/MIC, weil Betalaktame konzentrationsabhaengig wirken und hohe Spitzenkonzentrationen die Bakterizide maximieren",
        answerB = "Cmax/MIC, weil freies Betalaktam bei Spitzenkonzentration die PBPs saettigen muss",
        answerC = "fT>MIC (Anteil der Zeit, in der die freie Konzentration ueber der MIC liegt), weil Betalaktame zeitabhaengig wirken -- ihre bakterizide Wirkung setzt bei gesaettigten PBPs ein und Expositionsdauer bestimmt den Erfolg",
        answerD = "Trough/MIC, da niedrige Residualkonzentrationen den Post-Antibiotic-Effect von Betalaktamen verlaengern",
        correctAnswer = 2,
        explanation = "Betalaktame sind zeitabhaengige Antibiotika: Bakterizidie tritt ein, wenn freie (ungebundene) Konzentration ueber der MIC liegt (PBP-Saettigung), aber hohere Konzentrationen steigern die Wirkung kaum. Zielparameter fT>MIC (freies Betalaktam > MIC) muss typischerweise 40-70% des Dosierungsintervalls erreichen. Daher: haeufige Dosierung oder Infusionen sind sinnvoller als Einmalhochdosen.",
        difficulty = 4,
        funFact = "Kontinuierliche Infusionen von Piperacillin-Tazobactam oder Meropenem werden bei kritisch kranken Patienten zunehmend eingesetzt, um fT>MIC zu maximieren -- besonders bei resistenten Erregern mit erhoehten MIC-Werten."
    ),

    // Question 33 -- Pharmacogenomics: HLA Hypersensitivity
    Question(
        categoryId = 16,
        questionText = "Welcher Zusammenhang besteht zwischen HLA-B*57:01 und Abacavir-Hypersensitivitaet?",
        answerA = "HLA-B*57:01-Traeger haben eine genetisch bedingte Immundefizienz, die Abacavir-Metaboliten nicht eliminieren koennen",
        answerB = "Abacavir bindet nicht-kovalent an den HLA-B*57:01-Peptid-Prazentationscomplex und aendert dessen Peptidrepertoire, was zur Aktivierung CD8-T-Zellen fuehrt und eine immunvermittelte Hypersensitivitaetsreaktion ausloest",
        answerC = "HLA-B*57:01 kodiert fuer eine Variante des Adenosin-Kinase-Enzyms, die Abacavir falsch phosphoryliert und toxische Metaboliten erzeugt",
        answerD = "HLA-B*57:01-Traeger fehlt ein spezifisches T-Zell-Toleranz-Signal fuer Abacavir-Epitope",
        correctAnswer = 1,
        explanation = "Abacavir bindet nichtkovalent in der Peptidbindungsgrube von HLA-B*57:01 und aendert das praesentierte Selbst-Peptidrepertoire. Diese neo-Antigene aktivieren CD8+-T-Zellen, die den Hypersensitivitaets-Phaenotyp ausmachen. HLA-B*57:01-Screening vor Abacavir-Therapie (PREDICT-1-Studie) eliminiert praktisch alle immunologischen Hypersensitivitaetsreaktionen.",
        difficulty = 4,
        funFact = "HLA-B*57:01-Screening vor Abacavir ist ein Paradebeispiel fuer erfolgreiche praeventive Pharmakogenomik -- die Haeufigkeit der Hypersensitivitaet sank von ~8% auf nahezu 0% nach Implementierung des Screenings in Leitlinien."
    ),

    // Question 34 -- Monoclonal Antibodies: ADC Mechanism
    Question(
        categoryId = 16,
        questionText = "Welche drei strukturellen Komponenten hat ein Antikoerper-Wirkstoff-Konjugat (Antibody-Drug Conjugate, ADC) und welche Rolle spielt der Linker?",
        answerA = "Monoklonaler Antikoerper (Targeting) + radioaktives Isotop (Zytotoxizitaet) + Chelator (Bindung des Isotops)",
        answerB = "Monoklonaler Antikoerper (Targeting und ADCC) + chemischer Linker (kontrollierte Freisetzung des Wirkstoffs nach Internalisierung) + hochpotenter Wirkstoff/Toxin (Zytotoxizitaet)",
        answerC = "Bispezifischer Antikoerper (Tumor- und T-Zell-Targeting) + CD3-Agonist (T-Zell-Aktivierung) + Zytokin (Kooperation)",
        answerD = "Fab-Fragment (Antigenbindung) + PEG-Polymer (Halbwertszeit-Verlaengerung) + Enzym-Prodrug (Aktivierung im Tumor)",
        correctAnswer = 1,
        explanation = "ADCs bestehen aus: (1) MAb als Traeger fuer tumorspezifisches Targeting; (2) Linker (spaltbar z.B. durch lysosomale Enzyme/pH, oder nicht-spaltbar -- bestimmt Freisetzungsort und -kinetik); (3) hochpotentes Toxin (DAR ~2-8, typisch Mikrotubuli-Inhibitoren oder DNA-schaedigende Substanzen mit picomolarer Potenz).",
        difficulty = 4,
        funFact = "Der Drug-Antibody-Ratio (DAR) ist kritisch: Zu niedriger DAR (wenig Wirkstoff) reduziert Potenz, zu hoher DAR (>8) fuehrt zu Aggregation und veraenderter Pharmakokinetik. Moderne ADCs mit Site-Specific Conjugation streben homogene DAR2 oder DAR4 an."
    ),

    // Question 35 -- Targeted Therapy: mTOR Pathway
    Question(
        categoryId = 16,
        questionText = "Warum kann eine PI3K-Hemmung paradoxerweise den RAS/MAPK-Signalweg aktivieren und so die Therapieresistenz foerdern?",
        answerA = "PI3K-Inhibitoren hemmen direkt MEK und ERK, was zu kompensatorischer RAS-Ueberexpression fuehrt",
        answerB = "PI3K/AKT/mTOR-Hemmung hebt die negative S6K1-vermittelte Rueckkopplungshemmung auf IRS-1 auf, was zu verstaerktem Insulinrezeptor/RTK-Signaling und damit zu erhoehter RAS-Aktivierung fuehrt",
        answerC = "PI3K-Inhibitoren erhoehen intrazellullaere cAMP-Spiegel, die direkt RAS-GEF (SOS) aktivieren",
        answerD = "PI3K-Hemmung fuehrt zu EGFR-Ueberexpression durch verlaengerte Rezeptor-Recyclingzeit",
        correctAnswer = 1,
        explanation = "Im mTOR-PI3K-Signalweg hemmt aktiviertes S6K1 (downstream von mTORC1) durch negative Rueckkopplung den Insulinrezeptorsubstrat IRS-1. PI3K/mTOR-Inhibitoren heben diese Hemmung auf -- IRS-1 wird aktiviert, verstaerkt RTK-Signaling und aktiviert RAS/MAPK-Weg. Diese Crosstalk-Rueckkopplung erklaert, warum Kombination von PI3Ki+MEKi synergistisch wirkt.",
        difficulty = 4,
        funFact = "Rapamycin (Sirolimus) wurde urspruenglich als Antimykotikum aus einem Streptomyces-Stamm der Osterinsel (Rapa Nui -- daher der Name) isoliert, bevor sein immunsuppressives und antiproliferatives Potenzial entdeckt wurde."
    ),

    // Question 36 -- Immunosuppression: Calcineurin Inhibitors
    Question(
        categoryId = 16,
        questionText = "Welcher molekulare Mechanismus liegt der Immunsuppression durch Ciclosporin und Tacrolimus zugrunde und wo unterscheiden sie sich?",
        answerA = "Beide hemmen mTOR -- Ciclosporin hemmt mTORC1, Tacrolimus hemmt mTORC2",
        answerB = "Beide hemmen letztlich Calcineurin (Phosphatase) und verhindern damit NFAT-Dephosphorylierung und IL-2-Transkription -- Ciclosporin bindet Cyclophilin, Tacrolimus bindet FKBP12 als intrazellullaeres Rezeptorprotein",
        answerC = "Beide blockieren den T-Zell-Rezeptor direkt -- Ciclosporin hemmt CD3-zeta-Phosphorylierung, Tacrolimus hemmt Lck-Kinase",
        answerD = "Beide induzieren T-Zell-Apoptose -- Ciclosporin via Fas-Ligand, Tacrolimus via TNF-alpha",
        correctAnswer = 1,
        explanation = "Ciclosporin bindet Cyclophilin A (Immunophilin), Tacrolimus bindet FKBP12 (FK506-Binding Protein 12). Beide Komplexe (CsA-Cyclophilin und FK506-FKBP12) hemmen dann die gleiche Zielphosphatase Calcineurin, die NFAT dephosphorylieren wuerde. Gebundenes NFAT kann nicht in den Kern translozieren -- IL-2-Gen-Transkription unterbleibt.",
        difficulty = 4,
        funFact = "Tacrolimus ist strukturell und mechanistisch von Ciclosporin verschieden (Makrolid vs. zyklisches Peptid), hemmt aber durch convergente Evolution denselben Calcineurin-Weg -- ein Lehrbeispiel fuer pharmazeutische Polypharmakologie."
    ),

    // Question 37 -- Receptor Pharmacology: GPCR Desensitization
    Question(
        categoryId = 16,
        questionText = "Welche molekularen Schritte fuehren zur Desensibilisierung und Internalisierung von G-Protein-gekoppelten Rezeptoren (GPCRs) nach Agonist-Exposition?",
        answerA = "Agonist-aktivierter Rezeptor --> Gq-Aktivierung --> PKC-vermittelte Rezeptorphosphorylierung --> G-Protein-Entkopplung --> Clathrin-vermittelte Endozytose nach Ubiquitinierung",
        answerB = "Agonist-aktivierter Rezeptor --> GRK (G-Protein-coupled Receptor Kinase)-Phosphorylierung des Rezeptors --> Beta-Arrestin-Rekrutierung --> Entkopplung von G-Protein und Clathrin-vermittelte Rezeptor-Internalisierung in Endosomen",
        answerC = "Agonist --> cAMP-Anstieg --> PKA-Phosphorylierung des Rezeptors --> Direktbindung an Caveolae-Proteine --> Lipid-Raft-assoziierte Sequestierung",
        answerD = "Agonist-Bindung --> Rezeptor-Dimerisierung --> ubiquitin-vermittelte proteasomale Degradation ohne Endosomen-Zwischenstufe",
        correctAnswer = 1,
        explanation = "Nach Agonist-Aktivierung phosphorylieren GRKs (besonders GRK2/3) spezifisch Serin/Threonin-Reste im intrazellullaeren C-Terminus des Rezeptors. Phosphorylierter Rezeptor rekrutiert beta-Arrestin-1/2, das (1) G-Protein sterisch verdraengt (Desensibilisierung) und (2) Clathrin/AP-2-Komplexe fuer Internalisierung (Endozytose) rekrutiert.",
        difficulty = 4,
        funFact = "Beta-Arrestine fungieren nicht nur als Desensibilisierungsproteine -- sie sind auch eigenstaendige Signalmolekuele ('biased signaling'). G-Protein-unabhaengige, Beta-Arrestin-vermittelte Signalkaskaden sind therapeutisch interessant, weil sie andere (moeglicherweise guenstigere) Effektoren aktivieren als klassische G-Protein-Signale."
    ),

    // Question 38 -- Drug Metabolism: Phase II Reactions
    Question(
        categoryId = 16,
        questionText = "Was ist der Unterschied zwischen Phase-I- und Phase-II-Biotransformationsreaktionen und warum erhoeht Glukuronidierung typischerweise die renale Ausscheidung?",
        answerA = "Phase I = Hydrolyse groesser Proteine; Phase II = Oxidation kleiner Molekuele; Glukuronide sind zu klein fuer renale Filtration",
        answerB = "Phase I = funktionelle Gruppen einfuehren/freilegen (Oxidation, Reduktion, Hydrolyse via CYP450/FMO); Phase II = Konjugation mit endogenen polaren Molekuelen (Glucuronsaeure, Sulfat, Glutathion) -- Glukuronide haben erhoehte Polaritaet/Mw und werden renal oder biliaer eliminiert",
        answerC = "Phase I = hepatische Metabolisierung; Phase II = extrahepatische Metabolisierung; Glukuronide werden renal nicht filtriert sondern tubuloes sezerniert",
        answerD = "Phase I und Phase II laufen immer sequentiell ab; Sulfatierung ist Phase I, Glukuronidierung ist Phase II der Phase-II-Reaktionen",
        correctAnswer = 1,
        explanation = "Phase-I-Reaktionen (CYP450, MAO, FMO) fuehren reaktive oder polare Gruppen ein. Phase-II-Konjugationsreaktionen (UGT, SULT, GST, NAT) koppeln diese Gruppen oder direkt das Muttersubstrat an Glucuronsaeure, Sulfat, Glutathion, Aminosaeuren. Glukuronide sind durch Molekuelgroesse, hohe Wasserloeslichkeit und negative Ladung (bei pH 7,4) optimal fuer glomerulaere Filtration und tubuloes Sekretion.",
        difficulty = 4,
        funFact = "Morphin-6-Glucuronid (M6G) ist pharmakologisch aktiver als Morphin selbst (hoehere mu-Rezeptor-Affinitaet) -- ein seltenes Beispiel, bei dem Phase-II-Metabolisierung ein potenteres Produkt erzeugt statt zu inaktivieren."
    ),

    // Question 39 -- Cancer Immunotherapy: CAR-T Side Effects
    Question(
        categoryId = 16,
        questionText = "Was ist das Zytokin-Freisetzungssyndrom (CRS) nach CAR-T-Therapie und welche Substanz ist die Erstlinien-Therapie?",
        answerA = "CRS ist eine direkte Tumorlyse-Reaktion; Erstlinientherapie ist Allopurinol zur Harnsaure-Senkung",
        answerB = "CRS entsteht durch massive Freisetzung von Zytokinen (v.a. IL-6, IFN-gamma, IL-1) durch aktivierte CAR-T-Zellen und Makrophagen; IL-6-Rezeptor-Antagonist Tocilizumab ist Erstlinientherapie",
        answerC = "CRS ist eine IgE-vermittelte anaphylaktische Reaktion auf CAR-T-Zellen; Adrenalin ist Erstlinientherapie",
        answerD = "CRS bezeichnet die Abstoessung infundierter CAR-T-Zellen; Immunsuppressiva wie Ciclosporin sind Erstlinientherapie",
        correctAnswer = 1,
        explanation = "CRS entsteht durch exzessive Immunaktivierung -- expandierende CAR-T-Zellen setzen massive Mengen an IL-6, IFN-gamma, IL-2 frei, die Makrophagen aktivieren (Makrophagenaktivierungssyndrom-Komponente). IL-6 spielt eine Schluesselrolle in der systemischen Entzuendungsantwort -- Tocilizumab (anti-IL-6R) ist FDA-zugelassen fuer CRS nach CAR-T-Therapie.",
        difficulty = 4,
        funFact = "Immune Effector Cell-Associated Neurotoxicity Syndrome (ICANS) ist eine weitere gefuerchtete CAR-T-Komplikation mit Verwirrtheit, Enzephalopathie und Krampfanfaellen -- behandelt mit Kortikosteroiden, da Tocilizumab hier weniger wirksam ist (IL-6 ueberwindet Blut-Hirn-Schranke kaum)."
    ),

    // Question 40 -- Pharmacokinetics: Non-Linear Kinetics
    Question(
        categoryId = 16,
        questionText = "Warum folgt Phenytoin einer Michaelis-Menten-Kinetik (saettigbare Kinetik) und welche klinische Konsequenz hat dies?",
        answerA = "Phenytoin wird aktiv tubuloes sezerniert und saettigt den Transporter bei hohen Plasmakonzentrationen",
        answerB = "Phenytoin saettigt bei therapeutischen Konzentrationen die hepatischen CYP-Enzyme (CYP2C9/2C19) -- kleine Dosisaenderungen nahe der Saettigungskonzentration fuehren zu ueberproportional grossen Plasmakonzentrationsanstiegen und erhoehtem Toxizitaetsrisiko",
        answerC = "Phenytoin hat ausgepragte enterohepatische Rezirkulation, die bei hohen Konzentrationen saettigt und die Halbwertszeit unkontrollierbar verlaengert",
        answerD = "Phenytoin bindet Plasmaproteine mit hoher Kapazitaet und saettigt diese bei Standarddosierungen vollstaendig",
        correctAnswer = 1,
        explanation = "Phenytoins hepatische Metabolisierung via CYP2C9/2C19 folgt Michaelis-Menten-Kinetik mit Km nahe therapeutischer Konzentration (~10-20 mg/L). Bei annaehernd saettigenden Konzentrationen verhaelt sich die Elimination fast nullter Ordnung -- eine kleine Dosiserhoehung fuehrt zu ueberproportional starkem Konzentrationsanstieg (Toxizitaetsgefahr: Nystagmus, Ataxie, Enzephalopathie).",
        difficulty = 4,
        funFact = "Phenytoin hat auch pharmakokinetische 'Tuecken' durch ausgepragte Plasmaproteinbindung (~90% an Albumin) -- bei Hypoalbuminaemie (Leberversagen, Mangelernaehrung) ist der freie (aktive) Anteil erhoeht, obwohl der Gesamt-Phenytoin-Spiegel normal erscheint (Valproat verdraengt Phenytoin ebenfalls)."
    ),

    // Question 41 -- Biologics: Biosimilars
    Question(
        categoryId = 16,
        questionText = "Was unterscheidet ein Biosimilar pharmakologisch von einem generischen Arzneimittel (Small-Molecule-Generikum)?",
        answerA = "Biosimilars sind chemisch identisch mit dem Referenzbiologikum; Generika koennen kleine strukturelle Abweichungen haben",
        answerB = "Biosimilars sind komplexe biologische Makromolekuele (Proteine), die nicht exakt reproduziert werden koennen -- nur Aehnlichkeit (Similaritaet) ist nachweisbar; Generika sind identische chemische Molekuele (gleiche Summenformel, gleiche Stereochemie)",
        answerC = "Biosimilars erfordern neue klinische Phase-III-Studien mit allen Indikationen; Generika erfordern nur Bioverfuegbarkeits-Studien",
        answerD = "Biosimilars duerfen nur intravenoes verabreicht werden; Generika sind immer oral verfuegbar",
        correctAnswer = 1,
        explanation = "Small-Molecule-Generika sind chemisch definiert und koennen exakt identisch synthetisiert werden (nur Bioverfuegbarkeitsnachweis noetig). Biologika sind komplexe Proteine/Antikoerper, deren tertiaere Struktur, Glykosylierungsmuster und post-translationelle Modifikationen vom Herstellungsprozess abhaengen -- 'the process is the product'. Deshalb 'similar, not identical'.",
        difficulty = 4,
        funFact = "Der erste zugelassene Biosimilar-Antikoerper in Europa war Infliximab-Biosimilar (CT-P13/Remsima) 2013 -- mit 13 Jahren deutlichem Abstand nach dem Originalprodukt Remicade. Das Zulassungsverfahren involvierte umfangreiche Strukturanalysen, In-vitro-Tests und klinische Studien."
    ),

    // Question 42 -- Antimicrobial: Fluoroquinolone Resistance
    Question(
        categoryId = 16,
        questionText = "Welche zwei primaereen bakteriellen Zielenzyme hemmen Fluorochinolone und welcher Resistenzmechanismus ist am weitesten verbreitet?",
        answerA = "DNA-Polymerase III (chromosomale Replikation) und RNA-Polymerase; Resistenz durch Rifampicin-Kreuzresistenz",
        answerB = "DNA-Gyrase (Topoisomerase II, besonders gramnegativer Haupttarget) und Topoisomerase IV (besonders grampositiver Haupttarget); Resistenz haeufig durch Punktmutationen in gyrA (kodiert GyrA-Untereinheit) und parC",
        answerC = "Penicillin-bindende Proteine (PBP2, PBP3) und DNA-Gyrase; Resistenz durch Plasmid-vermittelte PBP-Mutation",
        answerD = "RNA-Polymerase-beta-Untereinheit und Topoisomerase I; Resistenz durch rpoB-Mutationen",
        correctAnswer = 1,
        explanation = "Fluorochinolone hemmen zwei bakterielle Typ-II-Topoisomerasen: DNA-Gyrase (GyrA/GyrB) ist der Haupttarget gramnegativer Bakterien; Topoisomerase IV (ParC/ParE) ist der Haupttarget grampositiver Bakterien. Wichtigste Resistenzmechanismen: (1) Punktmutationen in QRDR (Quinolone Resistance-Determining Region) von gyrA/parC; (2) Effluxpumpen (AcrAB-TolC); (3) Plasmid-vermittelte PMQR-Gene (qnr).",
        difficulty = 4,
        funFact = "PMQR-Gene (Plasmid-mediated Quinolone Resistance) -- insbesondere qnrA, qnrB, qnrS -- vermitteln 'Low-Level'-Resistenz, geben aber den Bakterien einen Selektionsvorteil, der die Selektion hoehergradiger Resistenz durch chromosomale Mutationen erleichtert. Erstbeschreibung 1998 aus Klebsiella pneumoniae."
    ),

    // Question 43 -- Oncology: PARP Inhibitors
    Question(
        categoryId = 16,
        questionText = "Was beschreibt das Konzept der 'synthetischen Lethalitaet' bei PARP-Inhibitoren in BRCA-mutierten Tumoren?",
        answerA = "PARP-Inhibitoren sind nur in Kombination mit DNS-schaedigender Chemotherapie letal fuer Tumorzellen",
        answerB = "BRCA1/2-mutierte Tumorzellen haben defekte homologe Rekombination (HR) als Haupt-DNS-Reparaturweg; PARP-Hemmung blockiert den alternativen Basis-Exzisionsreparatur (BER)-Weg -- DNS-Einzel- und Doppelstrangbrueche koennen nicht mehr repariert werden, was selektiv Tumorzellen toetet",
        answerC = "PARP-Inhibitoren aktivieren BRCA-Proteine, die Apoptose in Tumorzellen einleiten",
        answerD = "Synthetische Lethalitaet bedeutet, dass PARP-Inhibitoren nur bei Kombination mit BRCA-Inhibitoren wirksam sind",
        correctAnswer = 1,
        explanation = "Synthetische Lethalitaet: Zwei Gene haben synthetisch letale Interaktion, wenn Verlust beider Gene toedlich ist, aber jedes einzeln toleriert wird. BRCA1/2-Verlust --> HR-Defizit (Hauptweg fuer Doppelstrangbruch-Reparatur). PARP1-Hemmung --> BER-Defizit (fuer Einzelstrangbrueche). In BRCA-WT-Zellen: BER-Verlust tolerierbar (HR kompensiert). In BRCA-mutierten Tumorzellen: Beide Reparaturwege defekt --> Letalitaet.",
        difficulty = 4,
        funFact = "Das Konzept der synthetischen Lethalitaet wurde urspruenglich in der Hefegenetik beschrieben, bevor es pharmakologisch genutzt wurde. Olaparib war 2014 der erste zugelassene PARP-Inhibitor -- ein direktes Ergebnis eines genomisch-pharmakologischen Paradigmenwechsels."
    ),

    // Question 44 -- Biologics: Complement Inhibitors
    Question(
        categoryId = 16,
        questionText = "Bei welcher seltenen Erkrankung ist Eculizumab indiziert und welches Komplementprotein hemmt es?",
        answerA = "Systemischer Lupus erythematodes -- hemmt C3 zur Reduktion von Immunkomplex-Ablagerungen",
        answerB = "Paroxysmale nokturnale Haemoglobinurie (PNH) und atypisches haemolytisch-uraemisches Syndrom (aHUS) -- hemmt C5 und verhindert damit Bildung des Membranangriffskomlex (C5b-9) und C5a-Freisetzung",
        answerC = "Hereditaeres Angiooedem -- hemmt C1-Inhibitor-Substitutionsmangel durch Blockade von C4",
        answerD = "ANCA-Vaskulitis -- hemmt C3a-Rezeptor auf Neutrophilen",
        correctAnswer = 1,
        explanation = "Eculizumab (Soliris) ist ein humanisierter monoklonaler IgG2/4-Antikoerper gegen C5. C5-Hemmung blockiert die Spaltung in C5a (starkes Anaphylatoxin/Chemoattraktant) und C5b (Nukleus des MAC/C5b-9). Bei PNH fehlt GPI-verankerter CD55/CD59 -- ohne C5-Hemmung werden rote Blutkoerper durch MAC lysiert.",
        difficulty = 4,
        funFact = "Eculizumab war mit einem Jahrestherapiepreis von ~500.000 USD lange eines der teuersten Medikamente der Welt -- ein Paradebeispiel fuer 'Orphan Drug'-Preisgebung bei ultraseltenen Erkrankungen."
    ),

    // Question 45 -- Drug Interactions: Antiretrovirals
    Question(
        categoryId = 16,
        questionText = "Warum werden HIV-Proteaseinhibitoren haeufig mit niedrigdosiertem Ritonavir 'geboostet' und welcher Mechanismus liegt zugrunde?",
        answerA = "Ritonavir verstaerkt die antivirale Wirkung direkt durch synergistische HIV-Protease-Hemmung",
        answerB = "Ritonavir ist ein starker CYP3A4-Inhibitor -- bei sub-therapeutischer Eigendosis hemmt es den Metabolismus des geboosteten PI, erhoehrt dessen AUC und Trough-Spiegel und ermoeglicht so weniger haeufige Dosierung",
        answerC = "Ritonavir erhoeht die intestinale Absorption des geboosteten PI durch P-gp-Hemmung ohne Beeinflussung des Metabolismus",
        answerD = "Ritonavir verlaengert die Halbwertszeit durch Hemmung renaler Elimination des geboosteten PI",
        correctAnswer = 1,
        explanation = "Ritonavir ist der potenteste bekannte CYP3A4-Inhibitor und hemmt auch P-gp. Bei niedrigen 'Booster'-Dosen (z.B. 100 mg 1x/Tag) hat es minimale Eigen-PI-Wirkung, aber hemmt CYP3A4 so stark, dass Coadministrierte PIs (Lopinavir, Atazanavir, Darunavir) dramatisch erhoehte AUC, laengere Halbwertszeit und weniger Dosierungsfrequenz haben.",
        difficulty = 4,
        funFact = "Cobicistat ist ein 'pharmakologisch cleaner' CYP3A4-Inhibitor ohne eigene antiretrovirale Aktivitaet -- entwickelt als Ritonavir-Boosting-Alternative ohne Ritonavirs Nebenwirkungen (Lipodystrophie, Diarrhoe). Es wird in Fixed-Dose-Kombinationen (Stribild, Genvoya) eingesetzt."
    ),

    // Question 46 -- Pharmacokinetics: Volume of Distribution
    Question(
        categoryId = 16,
        questionText = "Was sagt ein sehr hohes scheinbares Verteilungsvolumen (Vd >> 40 L bei einem 70-kg-Patienten) ueber ein Arzneimittel aus?",
        answerA = "Das Arzneimittel verbleibt hauptsaechlich im Blut und ist stark an Plasmaproteine gebunden",
        answerB = "Das Arzneimittel verteilt sich extensiv in periphere Gewebe und/oder akkumuliert intrazellullaer -- typisch fuer lipophile, basische Substanzen mit hoher Gewebeaffinitaet",
        answerC = "Das Arzneimittel hat eine sehr kurze Halbwertszeit durch schnelle Metabolisierung",
        answerD = "Das Arzneimittel wird renal eliminiert und akkumuliert bei Niereninsuffizienz im Plasmavolumen",
        correctAnswer = 1,
        explanation = "Vd ist ein hypothetisches Volumen: Vd = Dosis/C0. Vd >> 40L bedeutet, dass die Plasmakonzentration niedrig ist relativ zur Totaldosis -- der Rest befindet sich in Geweben. Chloroquin (Vd ~200-800 L/kg), Amiodaron (Vd ~60 L/kg) und Digoxin (Vd ~7 L/kg) zeigen extensive Gewebeverteilung durch Lipophilie und Gewebsbindung.",
        difficulty = 4,
        funFact = "Chloroquin hat ein Vd von ~200-800 L/kg -- das bedeutet, dass nahezu die gesamte Substanzmenge im Koerper in Geweben gespeichert ist. Dies erklaert sowohl seine sehr lange Halbwertszeit (Wochen) als auch seine Toxizitaet bei Ueberdosierung (Retinotoxizitaet durch Akkumulation in der Retina)."
    ),

    // Question 47 -- Drug Development: Biomarker Qualification
    Question(
        categoryId = 16,
        questionText = "Was unterscheidet einen validierten Surrogat-Endpunkt von einem intermediaerem Endpunkt in der klinischen Forschung?",
        answerA = "Surrogat-Endpunkte sind schneller messbar; intermediaere Endpunkte erfordern Jahrzehnte Follow-up",
        answerB = "Ein validierter Surrogat-Endpunkt hat in randomisierten Studien konsistent gezeigt, dass Verbesserungen in diesem Biomarker mit Verbesserungen im klinischen Endpunkt (Ueberleben, Morbiditaet) korrelieren; ein intermediaerer Endpunkt ist biologisch plausibel, aber diese klinische Validierung fehlt noch",
        answerC = "Surrogat-Endpunkte werden von der FDA regulatorisch anerkannt; intermediaere Endpunkte nur von der EMA",
        answerD = "Surrogat-Endpunkte messen direkte klinische Symptome; intermediaere Endpunkte nur Laborbefunde",
        correctAnswer = 1,
        explanation = "Surrogat-Validierung erfordert Demonstration, dass: (1) biologische Plausibilitaet des Kausalwegs besteht; (2) Epidemiologische Assoziation mit klinischem Endpunkt vorliegt; (3) Klinischer Effekt auf Surrogat den Effekt auf klinischen Endpunkt vollstaendig erklaert (Prentice-Kriterien). LDL-Cholesterin ist ein klassisches validiertes Surrogat fuer kardiovaskulaere Ereignisse.",
        difficulty = 4,
        funFact = "Der Surrogatfehler 'Surrogate Endpoint Trap' wurde durch den CAST-Trial (1989) beruehmt: Antiarrhythmika supprimierten Arrhythmien (Surrogatverbesserung) erhoehten aber die Mortalitaet (klinische Verschlechterung) -- ein Lehrbeispiel, dass Surrogat-Verbesserung nicht immer klinischen Nutzen bedeutet."
    ),

    // Question 48 -- Oncology: VEGF Inhibitors
    Question(
        categoryId = 16,
        questionText = "Ueber welchen Mechanismus erhoehen VEGF-Inhibitoren (z.B. Bevacizumab) das Risiko arterieller thromboembolischer Ereignisse?",
        answerA = "VEGF-Hemmung foerdert Plaquenruptur in Koronararterien durch verminderte Gefaesswand-Stabilitaet",
        answerB = "VEGF ist protektiv fuer Endothelzellen -- VEGF-Hemmung fuehrt zu Endothelzell-Apoptose, Blosszlegung von subendothelialen Strukturen (Kollagen, Tissue Factor) und prokoagulantem Milieu; ausserdem hemmt VEGF-Entzug die Prostacyclin-Synthese",
        answerC = "Bevacizumab aktiviert direkt Thrombozyten durch Fc-Rezeptor-Bindung",
        answerD = "VEGF-Hemmung erhoehrt die Viskositaet des Blutes durch Reduktion des Erythropoietin-Spiegels",
        correctAnswer = 1,
        explanation = "VEGF hat wesentliche endothelprotektive Funktionen: stimuliert Prostacyclin und NO-Synthese (antithrombotisch), foerdert Endothelzell-Ueberleben und Wiederherstellung nach Schaden. VEGF-Hemmung fuehrt zu Endothelzell-Apoptose, Reduktion von Prostacyclin/NO (prothrombotischer Shift) und Freisetzung pro-koagulierender Faktoren durch geschaedigte Endothelzellen.",
        difficulty = 4,
        funFact = "Bevacizumab-assoziierte arterielle Hypertonie (tritt bei ~25% der Patienten auf) ist ein Biomarker fuer Therapieansprechen -- Patienten, die unter Bevacizumab Hypertonie entwickeln, haben in einigen Tumorentitaeten bessere Outcomes, moeglicherweise weil dies intensive VEGF-Hemmung anzeigt."
    ),

    // Question 49 -- Pharmacokinetics: Clearance Concepts
    Question(
        categoryId = 16,
        questionText = "Was bestimmt die Steady-State-Plasmakonzentration eines Arzneimittels bei Dauerinfusion oder regelmaessiger Gabe und wie berechnet man sie?",
        answerA = "Css = Dosis x Vd / Halbwertszeit -- die Verteilung bestimmt die Gleichgewichtskonzentration",
        answerB = "Css = Dosierungsrate / Clearance -- die Gesamtkoerperclearance bestimmt allein, bei welcher Konzentration Elimination = Zufuhr ist, unabhaengig vom Verteilungsvolumen",
        answerC = "Css = Absorptionsrate x Bioverfuegbarkeit / Dosierungsintervall -- die Absorption bestimmt das Gleichgewicht",
        answerD = "Css = Dosis / (Halbwertszeit x Dosierungsintervall) -- zeitliche Parameter bestimmen die Gleichgewichtskonzentration",
        correctAnswer = 1,
        explanation = "Im Steady-State gilt: Zufuhrrate = Eliminationsrate. Da Eliminationsrate = Clearance x Css, folgt: Css = Dosierungsrate / Clearance. Das Verteilungsvolumen beeinflusst die Zeit bis zum Steady-State (proportional zu t1/2 = 0,693 x Vd/Cl), aber nicht den Css-Wert selbst -- ein fundamentales pharmakokinetisches Prinzip.",
        difficulty = 4,
        funFact = "Nach 4-5 Halbwertszeiten ist zu ~94-97% der Steady-State erreicht -- unabhaengig davon, wie gross die Halbwertszeit ist. Deshalb dauert es bei Amiodaron (t1/2 ~40-55 Tage) Monate bis zum Steady-State, was den klinischen Einsatz erheblich erschwert."
    ),

    // Question 50 -- Drug Toxicology: Hepatotoxicity Mechanisms
    Question(
        categoryId = 16,
        questionText = "Welche zwei grundlegend verschiedenen Mechanismen erklaeren Arzneimittel-induzierte Leberschaeden (DILI) und welches Beispiel steht fuer jeden Typ?",
        answerA = "Hepatozellulaerer Schaden (erhoeht ALT) vs. cholestatischer Schaden (erhoeht ALP/GGT); beide intrinsisch dosisabhaengig -- Beispiel: Paracetamol (hepatozellulaer) und Ciclosporin (cholestatisch)",
        answerB = "Intrinsische/dosisabhaengige Toxizitaet (direkte Zellschaedigung durch reaktive Metaboliten, vorhersagbar) vs. idiosynkratische Toxizitaet (selten, dosisunabhaengig, immunologisch oder metabolisch, unvorhersagbar) -- Beispiel: Paracetamol-NAPQI-Toxizitaet (intrinsisch) vs. Isoniazid-Hepatitis (idiosynkratisch/metabolisch)",
        answerC = "Mitochondriale Toxizitaet vs. Cholestase -- Beispiel: Valproat (Mitochondrien) und Erythromycin (Cholestase); beide dosisabhaengig",
        answerD = "Zona centralis-Nekrose (Niedrigdosis) vs. periportale Nekrose (Hochdosis) -- beide durch CYP3A4-Metaboliten verursacht",
        correctAnswer = 1,
        explanation = "Intrinsisches DILI ist dosisabhaengig, reproduzierbar und betrifft alle Exponierten (z.B. Paracetamol: NAPQI-Bildung durch CYP2E1 ueberwaeltigt Glutathion-Konjugation bei >150 mg/kg). Idiosynkratisches DILI ist selten (<1:10.000), dosisunabhaengig, tritt nur bei suszeptiblen Individuen auf (genetische, immunologische Faktoren) und ist klinisch schwer vorhersagbar -- z.B. Isoniazid-Hepatitis bei ~1% der Behandelten.",
        difficulty = 4,
        funFact = "N-Acetylcystein (NAC) ist das Antidot bei Paracetamol-Vergiftung -- es stellt den Glutathion-Pool wieder her und verhindert NAPQI-Akkumulation. NAC wirkt noch bis zu 24h nach Einnahme wirksam, wenn fruhzeitig eingesetzt; spaeter nur noch zytoprotektiv. Dies ist eine der wenigen hochwirksamen spezifischen Antidot-Therapien in der klinischen Toxikologie."
    )

)
