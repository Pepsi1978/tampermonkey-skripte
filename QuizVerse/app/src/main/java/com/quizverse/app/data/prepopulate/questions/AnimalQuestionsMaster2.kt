package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun animalQuestionsMaster2(): List<Question> = listOf(

    // ── MASTER (difficulty = 5) ── Molecular Zoology & Genomics ─────────────

    Question(
        categoryId = 9,
        questionText = "Welche spezifische Region des mitochondrialen Cytochrom-b-Gens wird standardmaessig fuer die phylogenetische Artbestimmung bei Saeugetieren amplifiziert?",
        answerA = "Die gesamte 1140-bp-Sequenz zwischen den tRNA-Genen fuer Threonin und Prolin",
        answerB = "Ein 307-bp-Fragment des 5'-Endes zwischen Cytb-L14724 und Cytb-H15149",
        answerC = "Ein 402-bp-Fragment im zentralen Bereich zwischen den Positionen 14841 und 15243",
        answerD = "Das vollstaendige 1143-bp-ORF inklusive Start- und Stoppcodon",
        correctAnswer = 0,
        explanation = "Die vollstaendige 1140-bp-Cytochrom-b-Sequenz zwischen den flankierenden tRNA-Genen fuer Threonin und Prolin ist das Standardfragment fuer saeugetierphylogenetische Studien, wie von Kocher et al. 1989 etabliert.",
        difficulty = 5,
        funFact = "Cytochrom b war eines der ersten mitochondrialen Gene fuer die molekulare Systematik eingesetzt und gilt noch heute als 'Goldstandard' der saeugetier-Phylogenetik."
    ),

    Question(
        categoryId = 9,
        questionText = "Das COI-Barcoding-Fragment bei Tieren umfasst welchen genauen Bereich des Cytochrom-c-Oxidase-Untereinheit-I-Gens?",
        answerA = "Die ersten 648 Basenpaare des 5'-Endes, amplifiziert mit den Primern LCO1490 und HCO2198",
        answerB = "Ein 550-bp-Fragment in der Mitte des Gens, amplifiziert mit universellen COI-Primern",
        answerC = "Das vollstaendige 1545-bp-COI-Gen inklusive aller drei funktionellen Domaenen",
        answerD = "Ein 300-bp-Fragment des 3'-Endes, geeignet fuer degradierte Proben aus Museumsmaterial",
        correctAnswer = 0,
        explanation = "Das standardisierte DNA-Barcode-Fragment bei Tieren ist ein 648-bp-Abschnitt am 5'-Ende des COI-Gens, der mit den Primern LCO1490 und HCO2198 (Folmer-Primer) amplifiziert wird.",
        difficulty = 5,
        funFact = "Die BOLD Systems-Datenbank enthaelt ueber 8 Millionen COI-Barcodes von mehr als 200.000 Tierarten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Mechanismus erklaert die maternale Vererbung des Mitochondriengenoms bei Metazoen und welche molekulare Ausnahme wurde beim Menschen beschrieben?",
        answerA = "Aktive Ubiquitinierung paternaler Mitochondrien im Zygotenstadium; Ausnahme: heteroplasmatische paternale mtDNA bei Leigh-Syndrom-Patienten",
        answerB = "Selektiver Abbau paternaler Mitochondrien durch Mitophagie via PINK1/Parkin-Signalweg; Ausnahme: biparentale mtDNA-Vererbung bei 17 Familien mit mitochondrialer Erkrankung (Luo et al. 2018)",
        answerC = "Ausschluss der paternalen Mitochondrien durch den Zona-pellucida-Filter; Ausnahme: Kryptorchismus-assoziierte paternale Vererbung",
        answerD = "Dilution paternaler Mitochondrien durch das 1000-fach groessere maternale Volumen; keine bekannte Ausnahme beim Menschen",
        correctAnswer = 1,
        explanation = "Paternale Mitochondrien werden durch selektive Mitophagie ueber den PINK1/Parkin-Ubiquitinierungs-Signalweg abgebaut. 2018 beschrieben Luo et al. in Science 17 Familien mit echter biparentaler mtDNA-Vererbung, assoziiert mit pathogenen Varianten im MCU-Gen.",
        difficulty = 5,
        funFact = "Der Nachweis biparentaler Vererbung revolutionierte das Verstaendnis der mitochondrialen Genetik und hat direkte Konsequenzen fuer forensische und diagnostische Anwendungen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Transposon-Klasse dominiert das Genom des Axolotls (Ambystoma mexicanum) und macht dieses Genom mit ca. 32 Gb zum groessten sequenzierten Wirbeltier-Genom?",
        answerA = "DNA-Transposons der Tc1/Mariner-Superfamilie mit 45% Genomanteil",
        answerB = "LTR-Retrotransposons der Gypsy-Familie mit 38% Genomanteil",
        answerC = "LINE-1-Elemente (Long Interspersed Nuclear Elements) mit ueber 35% Genomanteil",
        answerD = "SINE-Elemente vom Typ SINE-R mit 29% Genomanteil, kombiniert mit endogenen Retroviren",
        correctAnswer = 2,
        explanation = "Das 32-Gb-Axolotl-Genom besteht zu mehr als 35% aus LINE-1-Retrotransposons. Diese massive Akkumulation durch Replikationssprung erklaert die extreme Genomgroesse. Das Axolotl-Genom wurde 2018 von Nowoshilow et al. in Nature publiziert.",
        difficulty = 5,
        funFact = "Das Axolotl-Genom ist etwa 10-mal groesser als das menschliche Genom und enthaelt Gene fuer aussergewoehnliche Regenerationsfaehigkeiten, die Extremitaeten, das Herz und sogar Teile des Gehirns betreffen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt das Konzept der 'Muellers Ratsche' in der Populationsgenetik von Tieren, und in welchem tierischen System wurde sie erstmals empirisch demonstriert?",
        answerA = "Akkumulation deletaerer Mutationen in asexuellen Linien durch genetischen Drift; erstmals in Daphnia-Klonlinien bei Chao 1990 demonstriert",
        answerB = "Irreversible Zunahme der Mutationslast in kleinen asexuellen Populationen; erstmals in RNA-Phagen (Phi-6) bei Duarte et al. 1992 demonstriert",
        answerC = "Accumulation deletaerer Mutationen im nicht-rekombinierenden Y-Chromosom; erstmals beim Zebrabaerbling (Danio rerio) gezeigt",
        answerD = "Verlust funktioneller Allele durch Inzucht; erstmals bei Insel-Vogelpopulationen (Geospiza) auf den Galapagos-Inseln nachgewiesen",
        correctAnswer = 1,
        explanation = "Muellers Ratsche beschreibt die irreversible Anhaeufung deletaerer Mutationen in kleinen asexuellen Populationen. Duarte et al. (1992) demonstrierten diesen Prozess empirisch zuerst an RNA-Phagen. Bei Tieren ist das maternale Mitochondriengenom ein klassisches biologisches Beispiel.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Protein bildet die strukturelle Grundlage des Haemocyanins bei Cephalopoden und wie unterscheidet es sich strukturell vom Haemocyanin der Crustaceen?",
        answerA = "Cephalopoden-Haemocyanin ist ein 10x10-Didekamer mit je 10 Untereinheiten pro Ring (MW ~3,5 MDa); Crustaceen-Haemocyanin ist ein Hexamer oder Multiples davon (MW ~450 kDa)",
        answerB = "Cephalopoden-Haemocyanin ist ein 20-Untereinheiten-Zylinder in einem 10+10-Arrangement (MW ~3,5 MDa); Crustaceen-Haemocyanin bildet Hexamere bis Dodekamere aus (MW ~450-900 kDa)",
        answerC = "Cephalopoden-Haemocyanin ist ein lineares Pentamer (MW ~2,5 MDa); Crustaceen-Haemocyanin bildet einheitliche Oktamere (MW ~600 kDa)",
        answerD = "Beide Haemocyanin-Typen sind strukturell identisch als Hexamere; Unterschied liegt nur im Kupfer-Koordinations-Modus (Typ-1 vs. Typ-3)",
        correctAnswer = 1,
        explanation = "Cephalopoden-Haemocyanin besteht aus 20 Polypeptidketten (je ca. 350 kDa), die einen Zylinder aus zwei Ringen mit je 10 Untereinheiten bilden, Gesamtmasse ~3,5 MDa. Crustaceen-Haemocyanin besteht aus Hexameren (je ~75 kDa Untereinheit), die zu Dodekameren aggregieren koennen.",
        difficulty = 5,
        funFact = "Haemocyanin transportiert Sauerstoff durch zwei Kupferatome pro aktives Zentrum und faerbt das Blut von Cephalopoden und Crustaceen blau."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Entdeckung belegte erstmals horizontalen Gentransfer von einem Bakterium direkt ins Tier-Nuklearchromosom, und in welchem Tier-Taxon wurde dies nachgewiesen?",
        answerA = "Transfer von Rickettsia-Genen ins Genom der Wollaeuse (Adelges tsugae) mittels Konjugations-aehnlichem Mechanismus (Nikoh et al. 2008)",
        answerB = "Massenintrogression von Wolbachia-Genomen ins Nuklearchromosom bei diversen Insekten und Nematoden; am eindeutigsten bei Drosophila ananassae (Dunning Hotopp et al. 2007)",
        answerC = "Transfer von Agrobacterium-T-DNA-Sequenzen ins Genom von Aplysia californica (Meeresnacktschnecke) durch Fraass et al. 2011",
        answerD = "Horizontaler Transfer von Cyanobakterien-Photosynthesegenen ins Nematodengenom von Pristionchus pacificus (Sommer-Labor, 2014)",
        correctAnswer = 1,
        explanation = "Dunning Hotopp et al. (2007, Science) zeigten, dass komplette Wolbachia-Genome in Nuklearchromosomen von Drosophila ananassae und anderen Insekten integriert sind. Dies war der erste eindeutige Nachweis massiven horizontalen Gentransfers von einem Bakterium direkt ins Tier-Kerngenom.",
        difficulty = 5,
        funFact = "In Drosophila ananassae entspricht der integrierte Wolbachia-Anteil etwa 30% des Wolbachia-Genoms und ist funktional in die Transkription des Wirtes integriert."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das 'Phylotypic Stage'-Konzept in der molekularen Entwicklungsbiologie und welcher Mechanismus erklaert auf genomischer Ebene die sogenannte 'entwicklungsbiologische Sanduhr'?",
        answerA = "Die Sanduhr beschreibt maximale morphologische Konvergenz im Gastrula-Stadium; erklaert durch konservierte Hox-Cluster-Expression",
        answerB = "Die Sanduhr beschreibt maximale Transkriptom-Konservierung im Phylotypischen Stadium (Phylotypus = Pharyngula bei Vertebraten); erklaert durch Anreicherung alter, essentieller Gene mit breitem Expressionsmuster (metagenes Prinzip nach Domazet-Loso & Tautz 2010)",
        answerC = "Die Sanduhr zeigt groesste Proteom-Konservierung im adulten Stadium; erklaert durch purifizierende Selektion auf Signaltransduktions-Proteine",
        answerD = "Die Sanduhr beschreibt maximale epigenetische Identitaet im Blastocystenstadium; erklaert durch ICR-Methylierungs-Muster",
        correctAnswer = 1,
        explanation = "Domazet-Loso und Tautz (2010, Nature) zeigten mit der Transcriptome-Age-Methode, dass das Transkriptom im phylotypischen Stadium (beim Zebrabaerbling die Pharyngula) evolutionaer am aeltesten ist. Die alten, essentiellen Gene erzeugen den Flaschenhals der Sanduhr.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches spezifische CRISPR-basierte Tool wurde verwendet, um erstmals das Malaria-uebertragende Muecken-Genom (Anopheles gambiae) durch 'Gene Drive' in Wildpopulationen zu manipulieren, und welches Zielgen wurde dabei gewaehlt?",
        answerA = "CRISPR-Cas12a mit dem Zielgen doublesex (dsx); publiziiert von Hammond et al. 2016 in Nature Biotechnology",
        answerB = "CRISPR-Cas9 mit dem Zielgen doublesex (dsx); entwickelt am Imperial College London, publiziiert von Kyrou et al. 2018 in Nature Biotechnology",
        answerC = "CRISPR-Cas13 mit dem Zielgen fruitless (fru); entwickelt am Broad Institute, publiziiert von Gantz et al. 2015",
        answerD = "Base-Editor BE3 mit dem Zielgen yellow (y); publiziiert von Hammond et al. 2021 in Nature Communications",
        correctAnswer = 1,
        explanation = "Kyrou et al. (2018, Nature Biotechnology) nutzten CRISPR-Cas9 fuer einen Gene Drive, der auf das doublesex (dsx)-Gen abzielt, das die Geschlechtsdetermination bei Anopheles gambiae steuert. Das System kollabierte experimentelle Kaefig-Populationen innerhalb von 7-11 Generationen.",
        difficulty = 5,
        funFact = "Der doublesex-Ziel-Locus hat den entscheidenden Vorteil, dass Resistenzmutationen die Maennchen-Fitness stark beeintraechtigen, was die Entstehung von Resistenzen stark verlangsamt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche einzigartige Eigenschaft des Tintenfisch-Transkriptoms (Octopus vulgaris und Verwandte) wurde 2015 in Nature beschrieben und hat direkte Konsequenzen fuer das 'genetische Dogma'?",
        answerA = "Massive codon-unabhaengige Translationsregulation durch RNA-bindende Proteine, die mehr als 60% der Proteom-Diversitaet erklaert",
        answerB = "Ausgedehnte A-zu-I-RNA-Editierung in codierenden Regionen, die in Nervenzellen bis zu 60% der Codon-Bedeutungen veraendert, wodurch Proteinvarianten ohne DNA-Mutation entstehen",
        answerC = "Horizontaler Transfer eukaryotischer Retro-Elemente ins mitochondriale Tintenfisch-Genom, der zu circulaerer mtRNA fuehrt",
        answerD = "Entdeckung von mehr als 10.000 neuen long non-coding RNAs, die spezifisch im Chromatophor-System exprimiert werden",
        correctAnswer = 1,
        explanation = "Alon et al. (2015, Cell) und Cepheid-Studien zeigten, dass Cephalopoden-Nervenzellen einen extrem hohen Grad an A-zu-I-RNA-Editierung (ADAR-vermittelt) aufweisen, der die Aminosaeuresequenz von Kanalenproteinen veraendert. Dies erlaubt eine schnelle Anpassung der Neurophysiologie ohne Genomveraenderung.",
        difficulty = 5,
        funFact = "In Kalmaren wurden mehr als 130.000 Editierungsstellen in codierenden Regionen gefunden - fast 60% aller codierten Aminosaeuren koennen dadurch variieren."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Muster zeigt die mitochondriale Genomarchitektur von Bi-direktional transkribierenden Tieren im Vergleich zur kanonischen Vertebraten-mtDNA-Organisation?",
        answerA = "Vertebraten-mtDNA hat zwei Stränge mit unterschiedlicher Guanin-Dichte (H- und L-Strang); invertebrate mtDNA wie bei Plattwuermern fehlt die Kontrollregion vollstaendig",
        answerB = "In manchen Plattwuermern (Plathelminthes) und Nematoden ist die mtDNA in zwei separate Minizirkel-Chromosomen aufgespalten, statt eines einzelnen zirkulaeren Chromosoms; Gene koennen auf beiden Straengen gleichmaessig verteilt sein ohne eindeutige H/L-Strang-Asymmetrie",
        answerC = "Alle Wirbellosen haben lineare statt zirkulaere mtDNA mit Telomer-aehnlichen Strukturen an den Enden",
        answerD = "Vertebraten haben exklusiv 37 Gene auf dem H-Strang kodiert; alle Invertebraten kodieren alle Gene auf dem L-Strang",
        correctAnswer = 1,
        explanation = "Plattwuermer und Nematoden zeigen haeufig fragmentierte mtDNA mit multiplen Minizirkeln und ungewoehnlicher Genverteilung auf beiden Straengen. Dies weicht stark von der hochkonservierten Vertebraten-Anordnung (12 Protein-Gene auf H-Strang, ND6 auf L-Strang) ab.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter dem Begriff 'Numts' (Nuclear Mitochondrial DNA Segments) und welchen Anteil des menschlichen Genoms machen sie aus?",
        answerA = "Numt-Sequenzen sind aktive Retroelemente mitochondrialer Herkunft; sie machen etwa 0,02% des menschlichen Genoms aus und sind hauptsaechlich im Pericentromer lokalisiert",
        answerB = "Numts sind in den Nukleus transferierte Kopien mitochondrialer DNA-Fragmente ohne Mitochondrien-Funktion; sie umfassen ca. 0,016% (ca. 570 kb) des humanen Genoms in ueber 755 Insertionen verschiedenen Alters",
        answerC = "Numts sind nicht-funktionale Pseudogene entstanden durch Kernfusion; sie machen exakt 1,3% des menschlichen Genoms aus",
        answerD = "Numts entstehen durch Reverse Transkription mitochondrialer mRNAs und sind ausschliesslich in Centromerbereichen zu finden",
        correctAnswer = 1,
        explanation = "Numts (Nuclear Mitochondrial DNA Segments) entstehen durch sporadischen Transfer von mtDNA-Fragmenten in den Nukleus. Im menschlichen Genom finden sich ueber 755 Numt-Insertionen mit einer Gesamtlaenge von ca. 570 kb. Sie sind evolutionaer unterschiedlich alt und verteilt ueber alle Chromosomen.",
        difficulty = 5,
        funFact = "Numts koennen forensische und diagnostische Probleme verursachen, da PCR-Primer auf mtDNA-Sequenzen unbeabsichtigt Numt-Sequenzen amplifizieren koennen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche spezifische epigenetische Modifikation reguliert die genomische Praegung (Imprinting) bei Saeugetieren und welcher klassische Locus zeigt biallelisches vs. monoallelisches Expressionsmuster beim Fehlen dieser Modifikation?",
        answerA = "H3K27me3-Methylierung durch PRC2-Komplex; Igf2/H19-Locus zeigt biallelische Igf2-Expression wenn DMR1 unmethyliert ist",
        answerB = "CpG-Methylierung an Imprinting Control Regions (ICRs) durch DNMT3A/DNMT3L; der Igf2/H19-ICR (IC1) verliert maternale Methylierung und fuehrt zu biallelischer H19-Repression und Igf2-Aktivierung bei Verlust der Methylierung",
        answerC = "H3K4me3-Mono-Methylierung durch KDM5C; der Snrpn-Locus zeigt biallelische Expression wenn DMR verloren geht",
        answerD = "5-Hydroxymethylcytosin-Markierung durch TET-Enzyme; der Dlk1-Meg3-Locus zeigt vollstaendige biparentale Expression",
        correctAnswer = 1,
        explanation = "Genomisches Imprinting wird primaer durch allelspezifische CpG-Methylierung an Imprinting Control Regions reguliert, die durch DNMT3A/DNMT3L-Komplex in der Keimbahn gesetzt wird. Der Igf2/H19-Locus ist das beststudierte Beispiel: Methylierung der paternal geerbten IC1-Region blockiert CTCF-Bindung und aktiviert Igf2.",
        difficulty = 5,
        funFact = "Genomisches Imprinting existiert nur bei Plazentasaeugetieren und Beuteltieren, nicht bei eierlegenden Saeugetieren (Monotremata), was die Koevolution mit der Plazentaentwicklung belegt."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Unterschied zwischen 'substitution saturation' und 'long branch attraction' in phylogenetischen Analysen, und welche Methode wurde entwickelt um letzteres zu korrigieren?",
        answerA = "Substitutionssaettigung: alle Positionen sind mehrfach substituiert, Signal geht verloren; Long Branch Attraction: schnell evolvierende Taxa werden faelschlicherweise gruppiert; Korrektur: CAT-Modell (Compositional Amino acid Topology) von Lartillot und Philippe 2004",
        answerB = "Substitutionssaettigung: Mehrfachtreffer an einzelnen Positionen verfaelschen Distanzberechnungen; Long Branch Attraction: Taxa mit langen Aesten werden durch konvergente Substitutionen zusammengezogen; Korrektur: Bayesianisches CAT-Modell und RAxML-Gamma-Modell mit MAST-Erweiterung",
        answerC = "Beide Begriffe beschreiben dasselbe Phaenomen; korrigiert durch Maximum-Parsimony-Methoden",
        answerD = "Long Branch Attraction betrifft nur nucleotidbasierte Analysen; proteinbasierte Phylogenien sind immun gegen diesen Effekt",
        correctAnswer = 0,
        explanation = "Substitutionssaettigung bezeichnet den Informationsverlust durch Mehrfachsubstitutionen. Long Branch Attraction (Felsenstein 1978) ist ein systematischer Fehler, bei dem Taxa mit hoher Substitutionsrate faelschlicherweise geclustert werden. Das Bayesianische CAT-Mixture-Modell (Lartillot & Philippe 2004) reduziert LBA signifikant.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche molekulare Grundlage hat die extreme UV-Resistenz des Baerentierchens (Ramazzottius varieornatus) und welches Protein wurde 2016 als spezifischer Mechanismus identifiziert?",
        answerA = "Hocheffiziente Nucleotid-Exzisions-Reparatur durch duplizierte XPC/TFIIH-Komplexe; keine spezifischen neuen Proteine",
        answerB = "Das nukleare Protein Dsup (Damage Suppressor) bindet direkt an Chromatin und schirmt die DNA vor Strahlenscaeden physikalisch ab; identifiziert von Hashimoto et al. 2016 in Nature Communications",
        answerC = "Mangelnde Apoptose-Faehigkeit durch Deletion des p53-Orthologs; Schaeden werden toleriert statt repariert",
        answerD = "Extremes Anhaeufung von Carotinoiden als Radikalfaenger in Zellkernen; aehnlich wie bei Deinococcus radiodurans",
        correctAnswer = 1,
        explanation = "Hashimoto et al. (2016, Nature Communications) entdeckten das tardigradenspezifische Protein Dsup (Damage Suppressor). Es ist ein intrinsisch unstrukturiertes Protein, das an nukleosomale DNA bindet und durch seine positiv geladene C-terminale Domaine Strahlenscaeden um bis zu 40% reduziert.",
        difficulty = 5,
        funFact = "Wenn humane Kulturzellen mit dem Dsup-Gen transformiert werden, erhoehen auch sie ihre Strahlenresistenz um ca. 40% - ein Beweis fuer die direkte Schutzfunktion des Proteins."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt das 'Nearly Neutral Theory of Molecular Evolution' von Tomoko Ohta und inwiefern erweitert sie die Neutral Theory von Kimura?",
        answerA = "Ohtas Theorie postuliert, dass alle Mutationen leicht vorteilhaft sind und durch positive Selektion fixiert werden; Kimura behauptete Neutralitaet",
        answerB = "Ohtas Theorie erweitert Kimuras Neutral Theory dahingehend, dass schwach deletaere Mutationen (|Nes| < 1, wobei Ne die effektive Populationsgroesse und s der Selektionskoeffizient ist) sich aehnlich wie neutrale Mutationen verhalten und in kleinen Populationen durch Drift fixiert werden koennen",
        answerC = "Ohta fuehrte das Konzept der positiven Epistasis ein; Kimuras Theorie ignorierte Wechselwirkungen zwischen Loci",
        answerD = "Ohtas Theorie erklaert ausschliesslich die Evolution von Genduplikaten; Kimuras Theorie galt fuer alle Gene",
        correctAnswer = 1,
        explanation = "Ohtas Nearly Neutral Theory (1973, 1992) postuliert, dass schwach deletaere und schwach vorteilhafte Mutationen mit |Nes| nahe 1 das Spektrum molekularer Evolution dominieren. In kleinen Populationen wirkt Drift staerker als Selektion, sodass schwach schaedliche Allele fixiert werden koennen.",
        difficulty = 5,
        funFact = "Ohtas Theorie erklaert, warum grosse sessile Organismen mit kleiner Ne mehr nicht-synonyme Substitutionen in Proteingenen zeigen als kleine Organismen mit grosser Populationsgroesse."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche drei Protein-Typen bilden die funktionale Haemoglobin-Diversitaet bei Krokodilen und wie reguliert das Pro-468-Histidin-System die Sauerstoffaffinitaet?",
        answerA = "Krokodile haben nur einen Haemoglobin-Typ; die Regulierung erfolgt ausschliesslich durch Bohr-Effekt",
        answerB = "Alpha-, Beta- und Gamma-Haemoglobin-Ketten; die spezifische Bindung von Bicarbonat-Ionen (HCO3-) an konservierte Lysin-Reste (Lys82alpha) senkt die O2-Affinitaet beim Tauchen",
        answerC = "Krokodile besitzen ein einzigartiges System bei dem Bicarbonat (CO2-Abbauprodukt) allosterisch an Histidin-Reste (His-460 der Beta-Kette) bindet und die O2-Affinitaet des Haemoglobins verringert, was die Sauerstoffabgabe im Gewebe beim Tauchen verbessert",
        answerD = "Drei isofunktionale Haemoglobin-Gene (HBA1, HBA2, HBB) mit unterschiedlicher pH-Sensitivitaet; kein allosterischer Regulator neben 2,3-BPG",
        correctAnswer = 2,
        explanation = "Storz et al. und Jensen et al. zeigten, dass Krokodil-Haemoglobin einzigartig durch Bicarbonat-Ionen allosterisch reguliert wird. HCO3- bindet an konservierte His-Reste der Beta-Kette (insbesondere Beta-460-His in der N-terminalen Region) und verringert die O2-Affinitaet, was CO2-gefuelltes Gewebe beim Tauchen effizient mit O2 versorgt.",
        difficulty = 5,
        funFact = "Dieses Krokodil-spezifische Haemoglobin-System ermoeglicht extrem langes Tauchen (bis 2 Stunden) ohne Hypoxie-Schaden."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher SNP im Melanocortin-1-Rezeptor-Gen (MC1R) ist verantwortlich fuer das gelbe Fell-Phaenomen ('e-Locus') beim Hund und was ist der molekulare Mechanismus?",
        answerA = "MC1R-Nonsense-Mutation p.Cys221Ter fuehrt zu verkuerztem, nicht-funktionalem Rezeptor; ohne Melanocortin-Signal dominiert Phaeomelanin-Synthese",
        answerB = "MC1R-Missense-Mutation p.Arg306Ter (c.916C>T) erzeugt einen verkuerzten Rezeptor, der keine Alpha-MSH-Signalweiterleitung mehr ausfuehren kann; Melanocyten schalten dauerhaft auf Phaeomelanin (gelb/rot) um",
        answerC = "MC1R-Promotor-Methylierung durch DNMT3B inaktiviert die Genexpression; rein epigenetischer Mechanismus ohne Sequenzveraenderung",
        answerD = "Keine MC1R-Mutation; der e-Locus entsteht durch Aktivierungsmutation im ASIP-Gen, das kontinuierlich den Antagonisten Agouti-Signalprotein produziert",
        correctAnswer = 1,
        explanation = "Die haufigste Ursache des e-Locus beim Hund ist die MC1R-Mutation p.Arg306Ter (frueheres Stoppcodon), die einen funktionslosen Rezeptor produziert. Ohne MSH-Signalweiterleitung bleibt die Adenylat-Cyclase inaktiv, cAMP-Spiegel bleiben niedrig und Melanocyten synthetisieren Phaeomelanin statt Eumelanin.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter 'RADseq' (Restriction-site Associated DNA sequencing) in der Populationsgenomik und welche zwei Hauptvarianten werden in der Zoologie eingesetzt?",
        answerA = "RADseq ist eine Methode zur Sequenzierung von Repetitive-Element-Flanken; Varianten sind SINE-RAD und LINE-RAD",
        answerB = "RADseq verwendet Restriktionsenzymverdau um genomweite SNPs kostenguenstig zu genotypisieren; Hauptvarianten sind Original-RADseq (basierende auf Sbf1-Verdau mit Random-Shearing) und ddRADseq (double-digest RADseq mit zwei Restriktionsenzymen fuer engere Fragmentgroessenselektion)",
        answerC = "RADseq ist ausschliesslich fuer Modellorganismen mit Referenzgenom geeignet; keine Anwendung bei Nicht-Modell-Organismen",
        answerD = "RADseq-Varianten unterscheiden sich nur im verwendeten Sequenziergeraet: Illumina-RAD vs. PacBio-RAD",
        correctAnswer = 1,
        explanation = "RADseq (Baird et al. 2008) und ddRADseq (Peterson et al. 2012) ermoeglichen genomweites SNP-Genotypisieren ohne vollstaendiges Referenzgenom. Sie werden extensiv in der Zoologie fuer Populationsstruktur, Hybridisierungsstudien und QTL-Analysen bei Nicht-Modell-Tierarten eingesetzt.",
        difficulty = 5,
        funFact = "Mit ddRADseq koennen Tausende von SNPs gleichzeitig in hunderten von Individuen genotypisiert werden - bei einem Bruchteil der Kosten einer Vollgenom-Sequenzierung."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche molekulare Grundlage hat die Echolokation bei Fledermaeuse auf Protein-Ebene und welches konvergente Phaenomen wurde bei Fledermaeuse und Walen in einer zentralen Proteinfamilie entdeckt?",
        answerA = "Beide Taxa haben unabhaengig voneinander identische Mutationen im Prestin (SLC26A5)-Gen erworben, das in auesseren Haarzellen des Innenohrs die Elektromotilitaet reguliert und hochfrequente Schalldetektion ermoeglicht",
        answerB = "Fledermaeuse und Wale nutzen konvergent das Protein Cochlin als Echolokations-Verstaerker; identische Aminosaeuresubstitutionen in der LCCL-Domaine verbessern die Schallleitung",
        answerC = "Konvergente Duplikation des KCNQ4-Kanalgens in beiden Taxa erhoeh die Frequenz-Tuning-Faehigkeit der Haarzellen",
        answerD = "Beide Taxa exprimieren identische Isoformen des Tectorin-Alpha-Gens in der Tektorialmembran; identische Mikrotubuli-Arrangement-Muster in den Stereovillen",
        correctAnswer = 0,
        explanation = "Parker et al. (2013, Nature) und Liu et al. zeigten, dass Fledermaeuse und Zahnwale identische Aminosaeuresubstitutionen im Prestin-Protein (SLC26A5) aufweisen, darunter Ile384Val und Val485Ile. Dies ist ein herausragendes Beispiel molekularer Konvergenz: zwei phylogenetisch weit entfernte Saeugetier-Gruppen evolvierten dasselbe Protein-Muster unabhaengig.",
        difficulty = 5,
        funFact = "Prestin in aeusseren Haarzellen konvertiert elektrische Signale direkt in mechanische Bewegung und verstaerkt damit die Schallwahrnehmung um das 1000-fache."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das 'Z-Chromosom' bei Voegeln und was bedeutet der Begriff 'dosage compensation' in diesem Kontext - wie unterscheidet sich der Mechanismus bei Voegeln vom Saeugetier-Mechanismus?",
        answerA = "Voegel haben ZZ/ZW-Geschlechtsdetermination wie Saeugetiere XX/XY; vollstaendige Dosierungskompensation durch Z-Inaktivierung analog zur X-Inaktivierung bei Saeugetieren",
        answerB = "In Voegeln (ZZ Maennchen, ZW Weibchen) fehlt eine vollstaendige Chromosom-weite Dosierungskompensation; stattdessen wird eine Untermenge von Z-Genen in Weibchen durch MSL-Komplex-aehnliche Mechanismen oder lokal durch SMRT-Sequencing-detektierte H3K20me1-Markierungen ausgeglichen - das System ist unvollstaendig im Vergleich zur XIST-vermittelten X-Inaktivierung bei Saeugetieren",
        answerC = "Voegel haben keine Dosierungskompensation; Z-Chromosom-Gene werden in ZZ-Maennchen und ZW-Weibchen identisch exprimiert",
        answerD = "Voegel kompensieren Z-Dosierung durch globale Halbierung der Transkriptionsrate auf beiden Z-Chromosomen beim Maennchen - identisch zum 'male meiotic sex chromosome inactivation' bei Saeugetieren",
        correctAnswer = 1,
        explanation = "Im Gegensatz zu Saeugetieren fehlt Voegeln eine vollstaendige Z-Chromosom-weite Dosierungskompensation. Voegel-Weibchen (ZW) exprimieren Z-Gene generell weniger als Maennchen (ZZ); lediglich eine Untermenge von Genen zeigt partielle Kompensation durch epistatische Mechanismen ohne XIST-Aequivalent.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Technik der 'Single-Cell RNA-Sequenzierung' (scRNA-seq) wurde speziell fuer die Analyse von Tiergeweben in situ entwickelt und erlaubt raeumlich aufgeloeste Transkriptomik?",
        answerA = "SMART-seq2 mit Laser-Capture-Mikrodissektion",
        answerB = "Spatial Transcriptomics (10x Genomics Visium) und MERFISH (Multiplexed Error-Robust Fluorescence In Situ Hybridization) erhalten die Gewebestruktur und ordnen Transkriptionsprofile spezifischen Positionen zu; bei Wirbeltieren wird dies intensiv fuer Gehirnkartierung eingesetzt",
        answerC = "Drop-seq Methode mit Barcoded-Microbeads zur zellindividuellen Transkriptomanalyse ohne Raumkoordinaten",
        answerD = "ATAC-seq in Kombination mit immunohistochemischer Gewebeinfiltration",
        correctAnswer = 1,
        explanation = "Spatial Transcriptomics (Lundeberg-Labor, 2019 Science) und MERFISH (Zhuang-Labor) ermitteln Genexpression raeumlich aufgeloest in Gewebeschnitten. In der Zoologie wird dies fuer Gehirnzellatlas-Projekte (u.a. Allen Brain Atlas-artige Karten bei Nicht-Modell-Tieren) und Organentwicklungsstudien eingesetzt.",
        difficulty = 5,
        funFact = "MERFISH kann simultan Tausende von RNAs in einzelnen Zellen mit Nanometer-Aufloesung visualisieren und dabei die vollstaendige 3D-Zellarchitektur erhalten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Protein-Motiv ist charakteristisch fuer die konservierte 'DEAD-box'-RNA-Helikase-Familie und welche Rolle spielen DEAD-box-Proteine in der post-transkriptionellen Regulation bei Tieren?",
        answerA = "DEAD-box-Proteine (Asp-Glu-Ala-Asp = D-E-A-D im Einbuchstaben-Code) sind ATP-abhaengige RNA-Helikasen mit konservierter RecA-aehnlicher Domaene; sie regulieren RNA-Faltung, Spleissen, ribosomale Biogenese, Stresskoerper-Bildung und miRNA-Prozessierung",
        answerB = "DEAD-box beschreibt eine Zinkfinger-Domaene; exklusiv fuer transkriptionelle Aktivatoren bei Metazoen",
        answerC = "DEAD-box-Proteine sind ausschliesslich an der DNA-Reparatur beteiligt; kein RNA-Substrat bekannt",
        answerD = "Das DEAD-Motiv ist eine katalytische Triad fuer Phosphodiesterase-Aktivitaet in der RNA-Degradationsmaschinerie",
        correctAnswer = 0,
        explanation = "DEAD-box-Proteine (benannt nach dem konservierten Asp-Glu-Ala-Asp-Tetrapeptid im Motif II) sind die groesste Familie von RNA-Helikasen bei Eukaryoten. Sie nutzen ATP-Hydrolyse um RNA-Sekundaerstrukturen aufzuloesen und sind an praktisch allen Schritten der RNA-Biogenese beteiligt.",
        difficulty = 5,
        funFact = "Beim Menschen sind ueber 40 DEAD-box-Proteine (DDX-Familie) bekannt; DDX3X ist ein haeufiges Onkogen bei Medulloblastomen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Ultraconserved Elements' (UCEs) in der komparativen Genomik und wie werden sie in der Zoologie fuer phylogenomische Studien genutzt?",
        answerA = "UCEs sind Protein-codierende Exons mit 100% Identitaet ueber alle Vertebraten; sie werden als Haushaltsgene fuer Normalisierung in RNA-seq eingesetzt",
        answerB = "UCEs sind nicht-codierende Genomregionen mit mindestens 200 bp bei 100% Identitaet zwischen Menschen, Maus und Ratte (Bejerano et al. 2004); in der Zoologie werden UCE-Flanken als phylogenomische Marker verwendet (ueber 2500 Loci), da sie in divergenten Taxa hybridisieren (UCE-Capture-Sequenzierung)",
        answerC = "UCEs sind mitochondriale Kontrollregionen die als Barcodes fuer Populationsgenetik dienen",
        answerD = "UCEs bezeichnen Genduplikate die in allen sequenzierten Vertebraten-Genomen zweifach vorhanden sind",
        correctAnswer = 1,
        explanation = "Bejerano et al. (2004, Science) identifizierten 481 UCEs ueber 200 bp mit 100% Identitaet zwischen Mensch, Maus und Ratte. Faircloth et al. (2012) entwickelten UCE-basierte phylogenomische Capture-Baits fuer Voegel und andere Vertebraten, die mittlerweile tausende Taxa abdecken.",
        difficulty = 5,
        funFact = "UCEs liegen haeufig in der Naehe von Entwicklungsgenen und wirken als cis-regulatorische Elemente - ihre extreme Konservierung spiegelt funktionalen Zwang wider, nicht bloss Selektionsneutralitaet."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Mechanismus liegt der Resistenz des Nordamerikanischen Opossum (Didelphis virginiana) gegen Schlangengift zugrunde, und welches spezifische Protein wurde identifiziert?",
        answerA = "Erhoehte Expression von Coagulationsfaktoren verhindert haemorrhagische Wirkung; kein spezifisches Anti-Gift-Protein",
        answerB = "Das Peptid LTNF (Lethal Toxin Neutralizing Factor), ein 8-kDa-Protein aus Opossum-Blut, neutralisiert Haemorragine und haemolytische Toxine diverser Schlangengift-Arten durch direkte Bindung; es wurde von de Wit und Weiss 1987 identifiziert",
        answerC = "Mutation im nikotinischen Acetylcholin-Rezeptor (nAChR) verhindert Bindung von alpha-Neurotoxinen; gleicher Mechanismus wie bei Mungo-Resistenz",
        answerD = "Aussergewoehnlich schnelle Wundheilung durch erhoeht exprimiertes EGF verhindert Gewebsnekrose; kein spezifischer Inhibitor",
        correctAnswer = 1,
        explanation = "Das 8-kDa-Peptid LTNF (Lethal Toxin Neutralizing Factor) aus Opossum-Serum kann tatsaechlich mehrere verschiedene Schlangengift-Komponenten neutralisieren. Es ist ein bemerkenswertes Beispiel natuerlicher Resistenz gegenueber nicht-artspezifischen Giften und wurde biochemisch charakterisiert.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Methode ermoeglicht die Rekonstruktion von Paleo-Transkriptomen aus degradierter DNA von Museumsmaterial und ausgestorbenen Tierarten?",
        answerA = "Standard-RT-PCR mit degenerierten Primern auf mRNA aus Trockengewebe",
        answerB = "Spezifisch fuer RNA aus Museumsmaterial: Low-Input-RNA-seq-Protokolle nach DNase-Behandlung (FFPE-RNA-seq oder TELP-Methode); fuer ausgestorbene Arten: meist nur DNA-basierte Transkriptom-Vorhersage durch Annotation alter DNA-Assemblies (aDNA-seq)",
        answerC = "Single-Molecule-RNA-Sequenzierung (PacBio Iso-Seq) direkt aus Museumsproben ohne Amplifikation",
        answerD = "Immunpraezipitation mit Anti-m7G-Antikoerrpern reichert Poly-A-RNA selektiv aus degradiertem Gewebe an",
        correctAnswer = 1,
        explanation = "RNA degradiert deutlich schneller als DNA; deshalb sind Transkriptomstudien an Museumsmaterial oder ausgestorbenen Arten extrem schwierig. Neuere Protokolle (wie TELP - Terminal transferase-based whole transcriptome amplification und spezialisierte Low-Input-Kits) ermoeglichen begrenzte RNA-Sequenzierung aus historischem Formalin-fixiertem Material.",
        difficulty = 5,
        funFact = "In gut erhaltenen permafrostgefrorenen Mammutresten wurde RNA-Material aus Muskelgewebe erfolgreich sequenziert - ein seltener Ausnahmefall."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der 'McDonald-Kreitman-Test' und wie wird er in der molekularen Zoologie eingesetzt um positive Selektion nachzuweisen?",
        answerA = "Ein statistischer Test der die Rate synonymer zu nicht-synonymer Substitutionen zwischen zwei Arten mit der Rate synonymer zu nicht-synonymer Polymorphismen innerhalb einer Art vergleicht; ein Ueberschuss inter-spezifischer nicht-synonymer Fixierungen deutet auf positive Selektion hin",
        answerB = "Ein phylogenetischer Test der Ast-spezifische Substitutionsraten in Maximum-Likelihood-Baeumen vergleicht",
        answerC = "Ein Populations-Genetics-Test der Heterozygotie gegen Homozygotie-Verhaeltnis plottet um Selektion von Drift zu trennen",
        answerD = "McDonald-Kreitman testet ob Microsatelliten-Mutationsraten zwischen Arten verschieden sind",
        correctAnswer = 0,
        explanation = "McDonald und Kreitman (1991, Nature) entwickelten diesen Test basierend auf dem Verhaltnis nicht-synonymer (N) zu synonymer (S) Substitutionen und Polymorphismen: wenn PN/PS < DN/DS, deutet dies auf positive Selektion hin. Der Test wird extensiv in komparativen Genomstudien von Tierarten angewendet.",
        difficulty = 5,
        funFact = "Der MK-Test wurde verwendet um zu zeigen, dass adaptive Evolution haeufiger ist als zuvor angenommen - in manchen Tierlinien sind bis zu 50% der nicht-synonymen Fixierungen adaptiv."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Eigenschaft des Zebrabarbling-Genoms (Danio rerio) macht es zu einem herausragenden Modell fuer die Vertebraten-Genomics, und welche spezifische Genomduplikation liegt in seiner Evolutionsgeschichte?",
        answerA = "Teleost-Fische (einschliesslich Zebrabarblings) durchliefen eine teleostspecifische 3. Runden-Whole-Genome-Duplication (3R WGD) zuzueglich der zwei allgemeinen Vertebraten-WGDs (1R, 2R nach Ohno 1970); dadurch haben viele Gene im Zebrabarblings zwei Paraloge ('ohnologs') statt eines",
        answerB = "Zebrabarbling-Genom ist haploid und daher einfacher zu analysieren",
        answerC = "Zebrabarbling hatte keine Genomduplikation; sein Vorteil ist die extrem geringe Genomgroesse von 300 Mb",
        answerD = "Eine Zebrabarbling-spezifische 4. Genomduplikation erzeugte Quadruplets aller Vertebraten-Gene",
        correctAnswer = 0,
        explanation = "Teleoste (Knochenfische) durchliefen zusaetzlich zu den zwei Vertebraten-WGDs (1R und 2R) eine teleostspecifische 3. Genomduplikation (3R). Damit haben Zebrabarblings und andere Teleoste haeufig zwei Kopien (Paraloge) von Genen, die beim Menschen und anderen Tetrapoden nur einmal vorkommen.",
        difficulty = 5,
        funFact = "Die Zebrabarblings-Chromosomenzahl von 2n=50 resultiert aus dieser komplexen Duplikations- und Rediplikationsgeschichte der Teleost-Ahnen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Cas9-Base-Editing' und welcher konkrete Vorteil gegenueber konventionellem CRISPR-Cas9-Knockout hat diese Methode fuer funktionale Zoologie-Studien?",
        answerA = "Base-Editing (BE3, ABE) erlaubt praezise Punkt-Mutationen (C-zu-T oder A-zu-G) ohne Doppelstrangbruch; Vorteil: keine unvorhersehbaren Indels, keine off-target-vermittelte chromosomale Rearrangements, direktes Modellieren natuerlicher SNPs die in Wildpopulationen gefunden werden",
        answerB = "Base-Editing erstellt Knockout-Allele durch Stoppcodon-Insertion; identisch zu CRISPR aber ohne Immunreaktion",
        answerC = "Base-Editing verwendet RNA statt DNA als Template und hat dadurch eine 10-fach hoehere Effizienz",
        answerD = "Cas9-Base-Editing kann ausschliesslich auf Promotor-CpG-Stellen angewendet werden um epigenetische Regulation zu studieren",
        correctAnswer = 0,
        explanation = "BE3 (Komor et al. 2016) und ABE (Gaudelli et al. 2017) erlauben C->T bzw. A->G Transitions ohne Doppelstrangbruch. Fuer funktionale Zoologie bedeutet dies: natuerliche Populationsvarianten (z.B. Pigmentierungs-SNPs, Resistenz-SNPs) koennen direkt in Labormodellen reproduziert werden ohne die chromosomale Instabilitaet konventioneller Cas9-Cuts.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche molekulare Besonderheit des Haifisch-Immunsystems unterscheidet es grundlegend von dem der Knochenfische und Tetrapoden, und was sagt dies ueber die Evolution der adaptiven Immunitaet aus?",
        answerA = "Haifische haben kein adaptives Immunsystem; sie verlassen sich ausschliesslich auf angeborene Immunitaet mit massiv erweitertem Toll-like-Rezeptor-Repertoire",
        answerB = "Haifische besitzen IgM und IgW-Antikoerrper, aber ihre Immunglobulin-Gene sind nicht in Cluster-Loci organisiert wie bei Tetrapoden sondern liegen als multiple unabhaengige V-D-J-Einheiten vor (cluster-type Organisation); V(D)J-Rekombination findet statt, fehlt aber haeufig den kombinatorischen Diversitaetsmechanismus (kein TdT in Knorpelfischen)",
        answerC = "Haifische haben MHC-Klasse-II-Gene aber kein MHC-Klasse-I; T-Zell-Erkennung erfolgt ausschliesslich ueber NK-Zell-aehnliche Rezeptoren",
        answerD = "Haifische nutzen VLR (Variable Lymphocyte Receptors) statt Immunglobulinen, identisch zum Lamprey-System",
        correctAnswer = 1,
        explanation = "Knorpelfische (Chondrichthyes) wie Haie besitzen Ig-Gene in einem einzigartigen 'cluster-type' Arrangement, wo jedes V-D-J-Set vorwiegend in einer vorkonfigurierten Einheit vorliegt statt im 'translocon-type' der Teleost/Tetrapod-Vorfahren. TdT (terminale Desoxynucleotidyl-Transferase) fuer N-Nukleotid-Addition fehlt weitgehend.",
        difficulty = 5,
        funFact = "Haifische produzieren Nanobodies (IgNAR = Immunoglobulin New Antigen Receptor) - einzeldomaenige Antikoerrper aehnlich Kamelid-Nanobodies, die grosse therapeutische Relevanz haben."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches epigenetische Phaenomen beschreibt 'transgenerationale Epigenetik' und welches klassische Beispiel in Nagetieren demonstriert es durch spezifische Histonmodifikation?",
        answerA = "Vererbung DNA-methylierungsbasierter Expressionsmuster ueber die Keimbahn ueber mehr als eine Generation ohne Sequenzveraenderung; klassisches Beispiel: Avy-Maus (Agouti viable yellow), bei der Methylierungsstatus des IAP-Retrotransposons die Fellfarbe bestimmt und maternal uebertragen wird",
        answerB = "Reprogrammierung von Keimzellen loescht alle epigenetischen Markierungen vollstaendig; keine transgenerationale Vererbung moeglich",
        answerC = "Transgenerationale Epigenetik bezieht sich auf Soma-zu-Soma-Transfer durch Exosomen; kein Keimbahn-Mechanismus beteiligt",
        answerD = "Vererbung von Histonmodifikationen in Mitose; Meiose loescht alle Markierungen vollstaendig",
        correctAnswer = 0,
        explanation = "Das Avy (Agouti viable yellow)-Maus-Modell zeigt klar: der Methylierungsstatus eines IAP-Retrotransposons im Agouti-Locus bestimmt die Fellfarbe und wird maternal ueber mehrere Generationen vererbt. Dieses Beispiel belegt echte Keimbahn-Epigenetik in Saeugetieren.",
        difficulty = 5,
        funFact = "Avy-Muetter die gelb gefaerbt sind (unmethylierter IAP) haben signifikant mehr gelb gefaerbte Nachkommen als Pseudo-Agouti-Muetter - ein direkter Beweis epigenetischer Muttervererbung."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Unterschied zwischen 'tandem repeat' und 'interspersed repeat' in Tiergenomen, und welche Methodik wird fuer die Annotation beider Klassen standardmaessig eingesetzt?",
        answerA = "Tandem repeats sind gleich wie interspersed repeats; die Unterscheidung ist historisch und hat keine biologische Relevanz",
        answerB = "Tandem repeats (Satelliten-DNA, Microsatelliten, Minisatelliten) sind direkt hintereinander angeordnete Wiederholungen und werden mit TANDEM REPEATS FINDER (TRF) oder PERF annotiert; interspersed repeats (Transposons, SINEs, LINEs) sind ueber das Genom verstreut und werden mit RepeatMasker/RepBase oder de-novo-Klassifikatoren wie RECON und RepeatModeler annotiert",
        answerC = "Tandem repeats sind ausschliesslich kodierend; interspersed repeats sind nicht-kodierend",
        answerD = "Interspersed repeats sind stabiler als tandem repeats; Microsatelliten mutieren weniger als LINE-Elemente",
        correctAnswer = 1,
        explanation = "Tandem repeats und interspersed repeats sind fundamental verschiedene Repeat-Klassen mit verschiedenen Entstehungsmechanismen. TRF (Benson 1999) ist Standardwerkzeug fuer Tandem-Repeats; RepeatMasker mit RepBase ist Goldstandard fuer interspersed Repeats in Tier-Genomassemblies.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher molekulare Mechanismus liegt der Geschlechtsdetermination bei Reptilien (TSD - Temperature-dependent Sex Determination) zugrunde und welche epigenetischen Veraenderungen wurden an KDM6B-vermittelter H3K27me3-Demethylierung beschrieben?",
        answerA = "TSD bei Reptilien ist rein hormonell; Temperatur aendert Steroidhormon-Spiegel ohne epigenetische Komponente",
        answerB = "Warme Temperaturen (maennlich-erzeugende in manchen Spezies) erhoehen Expression von KDM6B (eine H3K27me3-Demethylase) in Gonaden; reduziertes H3K27me3 an DMRT1-Locus aktiviert dessen Expression und triggert maennliche Gonadenentwicklung - identifiziert von Ge et al. 2018 in Science bei Rotohrschildkroete (Trachemys scripta)",
        answerC = "TSD beruht auf temperatursensibler Stabilisierung des SRY-Proteins; bei Reptilien ist SRY temperaturabhaengig aktiv oder inaktiv",
        answerD = "TSD wird durch temperaturabhaengige alternative Spleissing-Ereignisse im FOXL2-Gen reguliert; keine epigenetische H3K27-Beteiligung",
        correctAnswer = 1,
        explanation = "Ge et al. (2018, Science) zeigten bei Trachemys scripta: Erhoehte Temperatur induziert KDM6B-Expression in embryonalen Gonaden; KDM6B demethyliert H3K27me3 am DMRT1-Promotor, was DMRT1 aktiviert und maennliche Differenzierung einleitet. Dies war der erste direkte molekulare Mechanismus fuer TSD.",
        difficulty = 5,
        funFact = "Dieser Befund ist besonders relevant fuer den Klimawandel: steigende Temperaturen koennen das Geschlechterverhaeltnis bei TSD-Reptilien zugunsten eines Geschlechts verschieben und Populationen gefahrden."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'k-mer frequency analysis' in der Genomik und wie wird sie genutzt um die Genomgroesse und Heterozygositaet von Tiergenomen vor dem Assembly abzuschaetzen?",
        answerA = "K-mer-Analyse zaehlt Haeufigkeit aller DNA-Wortlaengen der Laenge k in Rohlesungen; der Hauptpeak in einem k-mer-Histogramm entspricht der erwarteten Coverage; Genomgroesse = Gesamtanzahl k-mers / Peak-Coverage; Heterozygositaet zeigt sich als zweiter kleinerer Peak bei halber Coverage",
        answerB = "K-mer-Analyse ist ausschliesslich fuer Protein-Sequenzen entwickelt; keine Anwendung in Genomics",
        answerC = "K-mer-Frequenz gibt die Anzahl offener Leserahmen an; hoehere k-mer-Diversitaet = groessere Kodierkapazitaet",
        answerD = "K-mer-Analyse misst Repeat-Anteil als Verhaeltnis einzigartiger zu repetitiven k-mers; Standardtool ist BLAST",
        correctAnswer = 0,
        explanation = "Tools wie Jellyfish/GenomeScope analysieren k-mer-Histogramme aus Rohdaten. Bei diploiden heterozygoten Genomen entsteht ein charakteristisches bimodales Histogramm: der halbe Peak spiegelt heterozygote Stellen, der volle Peak den homozygotenHintergrund. Die Methode ist Standard vor jedem Tier-De-novo-Assembly.",
        difficulty = 5,
        funFact = "Genomscope2 kann sogar Ploidie-Stufen unterscheiden und eignet sich fuer polyploide Organismen wie manche Fisch- und Pflanzenarten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Rolle spielen piRNAs (PIWI-interacting RNAs) im Tiergenom und wie unterscheiden sich diese von miRNAs und siRNAs mechanistisch?",
        answerA = "piRNAs sind 24-32 nt lang, werden von PIWI-Proteinen (Argonauten-Klade) gebunden, entstehen ohne Dicer-Prozessierung durch den 'Ping-Pong'-Amplifikationsmechanismus, und schuetzen die Keimbahn vor Transposon-Aktivierung durch Transkriptions- und post-transkriptionelle Silenzierung",
        answerB = "piRNAs sind identisch zu miRNAs bis auf Keimbahn-spezifische Expression; beide werden von Dicer prozessiert und binden AGO-Proteine",
        answerC = "piRNAs sind 19-22 nt lang wie miRNAs; der einzige Unterschied ist ihr Entstehungsort im Zytoplasma statt im Nukleus",
        answerD = "piRNAs silenzieren Protein-codierende Gene durch Translation-Suppression; siRNAs silenzieren Transposons",
        correctAnswer = 0,
        explanation = "piRNAs (24-32 nt) unterscheiden sich von miRNAs (19-24 nt) und siRNAs (21-23 nt) in Laenge, Biogenese (Dicer-unabhaengig, Ping-Pong-Amplifikation durch PIWI/AUB-Proteine) und Funktion (primaer Transposon-Silenzierung in der Keimbahn). Der Ping-Pong-Mechanismus erzeugt einen selbstverstarkenden Kreislauf zur Transposon-Unterdruckung.",
        difficulty = 5,
        funFact = "Mutationen in PIWI-Proteinen bei Drosophila fuehren zu 'gonadal atrophy' durch unkontrollierte Transposon-Aktivierung in Keimzellen - ein direkter Beweis fuer die essentielle piRNA-Funktion."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt der Begriff 'selective sweep' und welche genomischen Signaturen erlauben den Nachweis eines rezenzen selektiven Sweeps in Tiergenomen?",
        answerA = "Selective sweep: Fixierung eines vorteilhaften Allels reduziert genetische Diversitaet in der Umgebung ('Hitchhiking'); Signaturen: reduzierte Nukleotiddiversitaet (pi), erhoeihter Tajimas D (negativ), erhoehter iHS (integrated Haplotype Score), verlängerte Haplotyp-Homozygotie (XP-EHH)",
        answerB = "Selective sweep beschreibt Auswanderung dominanter Allele in benachbarte Populationen durch Migration; kein genomisches Signal",
        answerC = "Selective sweep zeigt sich durch erhoeihte statt reduzierte Diversitaet um den ausgewaehlten Locus",
        answerD = "Selective sweep ist synonym mit balancierender Selektion; beide erzeugen MHC-aehnliche Diversitaets-Hotspots",
        correctAnswer = 0,
        explanation = "Bei einem selective sweep fixiert ein vorteilhaftes Allel schnell zusammen mit umgebenden neutral-gelinkten Allelen (Hitchhiking). Statistiken wie Tajima's D (negativ bei rezentem Sweep), iHS und XP-EHH sind Standardmethoden zur Sweep-Detektion in Populations-Genomstudien von Tierarten.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche spezifischen Aminosaeuresubstitutionen im Rhodopsin-Gen sind charakteristisch fuer die spektrale Anpassung von Tiefsee-Fischen gegenueber Oberflaechenfischen?",
        answerA = "Tiefsee-Rhodopsin zeigt eine Verschiebung der maximalen Absorptionswellenlaenge (lambda-max) ins Blaue (ca. 480 nm statt 500 nm) durch spezifische Substitutionen an Position 83 (Asn83Asp) und Position 292 (Ala292Ser); diese blueshift-Mutationen wurden zuerst von Hunt et al. bei Tiefsee-Teleosten beschrieben",
        answerB = "Tiefsee-Fische haben kein funktionales Rhodopsin; sie nutzen ein alternatives Chromophor (Astaxanthin statt Retinal)",
        answerC = "Tiefsee-Rhodopsin unterscheidet sich nur in der Protein-Stabilitaet; die Absorptionsmaxima sind identisch zu Oberflaechenfischen",
        answerD = "Rhodopsin ist bei allen Fischen identisch; spektrale Anpassung erfolgt ausschliesslich ueber die Cone-Opsine (nicht Rhodopsin)",
        correctAnswer = 0,
        explanation = "Hunt et al. und Yokoyama zeigten, dass Tiefsee-Fische Rhodopsin-Varianten mit Substitutionen an mehreren Positionen (u.a. 83, 292, 299) tragen, die eine spektrale Verschiebung zu kuerzeren Wellenlaengen (ca. 480 nm) bewirken und die Absorption des schwachen Blaulichts in Tiefsee optimieren.",
        difficulty = 5,
        funFact = "Einige Tiefsee-Fische wie der Silberfisch (Argyropelecus) haben sogar Rhodopsin-Varianten fuer Bio-Lumineszenz-Detektion und mehrere Rhodopsin-Paraloge fuer verschiedene Tiefenzonen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das 'Pangenome'-Konzept in der Zoologie und wie wurde es erstmals auf Tierarten angewendet?",
        answerA = "Das Pangenome-Konzept beschreibt den Gesamtsatz aller Gene einer Tierart inklusive populationsspezifischer Gene (Dispensable) und universell vorhandener Gene (Core); erstmals auf Tiere angewendet beim Menschen (Human Pangenome Reference Consortium 2023) mit 47 Genomassemblies die ~1000 neue Varianten pro Individuum identifizierten",
        answerB = "Pangenome ist synonym mit 'Complete Genome'; kein Bezug zu Populationsdiversitaet",
        answerC = "Pangenome-Konzept gilt nur fuer Prokaryoten und Pilze; bei Tieren nicht anwendbar wegen Genome-Groesse",
        answerD = "Pangenome beschreibt alle Gene aller Tierarten in einem gemeinsamen Referenz-Frame; aehnlich wie OrthoMCL-Orthologie-Gruppen",
        correctAnswer = 0,
        explanation = "Das Human Pangenome Reference Consortium (HPRC) publizierte 2023 in Nature das erste humane Pangenome aus 47 phased Assemblies. Es offenbarte ca. 119 Mb neue Sequenz gegenueber GRCh38 und zeigte, dass das Standard-Referenzgenom populationsspezifische Varianten underrepresentiert.",
        difficulty = 5,
        funFact = "Das humane Pangenome-Projekt nutzt 47 Individuen aus verschiedenen Populationen weltweit und enthuellte ueber 1000 neue Proteingene-Varianten die im Referenzgenom fehlten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche molekulare Technik steht hinter dem Begriff 'Hi-C' in der 3D-Genomorganisation und was hat sie bei der Untersuchung von Tier-Chromatin-Architekturen ermoeglicht?",
        answerA = "Hi-C (Chromosome Conformation Capture Sequencing) vernetzt uebers Formaldehyd raeumlich benachbarte Chromatinregionen, verdaut sie und sequenziert Ligation-Produkte; eroeffnet Einblick in Topologisch Assoziierte Domaenen (TADs), Kompartiment-Organisation und regulatorische Schleifen; grundlegend fuer Vertebraten-Chromosome-Phasing und Hi-C-assistierte Genomassemblierung",
        answerB = "Hi-C ist eine Hochdurchsatz-Immunopraezipitations-Methode fuer Histon-Modifikations-Kartierung; 'Hi' steht fuer Histon-Interaktion",
        answerC = "Hi-C sequenziert ausschliesslich heterochromatische Repetitive-Elemente durch erhoehte Crosslink-Effizienz in kompaktem Chromatin",
        answerD = "Hi-C-Technologie ist identisch zu ChIP-seq; Unterschied liegt nur im Sequenziergeraet",
        correctAnswer = 0,
        explanation = "Hi-C (Lieberman-Aiden et al. 2009, Science) basiert auf Proximity Ligation: raeumlich benachbartes Chromatin wird vernetzt, verdaut und religiert. Sequenzierung der Ligationsprodukte ergibt eine Kontakt-Haeufigkeitsmatrix. In der Zoologie wird Hi-C intensiv fuer chromosomales Scaffolding von Genomassemblies und TAD-Vergleiche eingesetzt.",
        difficulty = 5,
        funFact = "Hi-C hat das De-novo-Assembly von Tierchromen revolutioniert: durch physische Proximity-Signale koennen Contigs zu chromosomengrossen Scaffolds assembliert werden ohne genetische Karten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Besonderheit der mitochondrialen Gencode-Variationen bei Tieren unterscheidet bestimmte Linien vom 'Standard-Tiercode' und was sind die evolutionären Konsequenzen?",
        answerA = "Alle Tiere nutzen identisch den Standard-Genetischen-Code (NCBI Table 1); keine Variationen bekannt",
        answerB = "Vertebraten-Mitochondrien nutzen leicht modifizierten Code (Table 2): AGA/AGG codieren Stoppcodon statt Arginin; TGA codiert Tryptophan statt Stopp; ATA codiert Methionin statt Isoleucin; Echinodermen-Mitochondrien (Table 9) nutzen AAA fuer Asparagin statt Lysin; Plathelminthes (Table 9) ebenfalls; diese Abweichungen beeinflussen Annotationsgenauigkeit",
        answerC = "Alle Mitochondrien-Codes sind identisch; Codon-Modifikationen gibt es nur im Nuklearchromosom",
        answerD = "Invertebraten haben mehr Codons als Vertebraten durch Mitochondrien-spezifische Anticodon-Expansion",
        correctAnswer = 1,
        explanation = "NCBI listet mehrere mitochondriale Genetische Codes fuer Tiere: Vertebraten (Table 2), Wirbellosen (Table 5), Echinodermen/Plathelminthes (Table 9). Diese Abweichungen sind bei der Protein-Annotation kritisch, da falsche Code-Anwendung zu fälschlichen Stoppcodons oder Missense-Annotierungen fuehrt.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Comparative Epigenomics' und welche Erkenntnisse ueber Enhancer-Evolution bei Saeugetieren erbrachten cross-species ATAC-seq und ChIP-seq Studien?",
        answerA = "Comparative Epigenomics vergleicht DNA-Methylierungsgrade zwischen Arten; ATAC-seq und ChIP-seq werden nicht dafuer verwendet",
        answerB = "Comparative Epigenomics vergleicht Chromatin-Zustand, Histon-Modifikationen und Transkriptionsfaktor-Bindung ueber Arten hinweg; Studien wie Villar et al. 2015 (Science) zeigten, dass aktive Enhancer (H3K27ac-markiert) zwischen Saeugetierspezies in Leber-Geweben schnell evolvieren waehrend Promotoren konserviert bleiben, was auf Enhancer-Umsatz als Hauptmechanismus morphologischer Evolution hinweist",
        answerC = "Cross-species ATAC-seq zeigt vollstaendige Konservierung aller Enhancer ueber alle Vertebraten; funktionelle Divergenz entsteht nur durch Transkriptionsfaktor-Mutationen",
        answerD = "Comparative Epigenomics ist technisch nur mit Inbred-Laborstaemmen moeglich; Wildtiere koennen nicht verglichen werden",
        correctAnswer = 1,
        explanation = "Villar et al. (2015, Science) verglichen H3K27ac-ChIP-seq in Leber von fuenf Saeugetierarten. Ergebnis: Promotoren sind hoch konserviert; aktive Enhancer zeigen hohen Umsatz - ca. 50% sind artspezifisch. Dies belegt 'Enhancer-Turnover' als wichtigen Mechanismus phaenootypischer Divergenz bei konserviertem Kodierpotential.",
        difficulty = 5,
        funFact = "Gleiche Gene koennen also in verschiedenen Saeugetierarten durch voellig verschiedene Enhancer-Sets reguliert werden - dies erklaert Expressionsunterschiede ohne Aminosaeureveraenderungen im Protein."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Methode der 'Population Genomics' verwendet Vorlaeufer-Allel-Informationen um direkt die Polarity von Mutationen zu bestimmen und was ist die Grundlage der Ancestral Allele Inference?",
        answerA = "Maximum-Parsimony-Methode; ancestrale Allele sind immer die haufigeren Allele in der Population",
        answerB = "Outgroup-basierte Inferenz: durch Vergleich mit einer oder mehreren Aussen-Gruppe-Arten wird das ancestrale Allel als das in der Aussen-Gruppe vorhandene Allel bestimmt; Methoden: EPO (Enredo-Pecan-Ortheus) Pipeline, Ensembl Ancestral Allele Tracks; limitiert durch Homoplasie und langer Astlaenge",
        answerC = "Bayesianische Inferenz bestimmt Vorlaeufer-Allele ausschliesslich aus Populationsfrequenzdaten ohne Outgroup",
        answerD = "Ancestrale Allele werden durch carbon-14-Datierung von fossilem DNA-Material bestimmt",
        correctAnswer = 1,
        explanation = "Outgroup-Vergleich ist die Standardmethode fuer ancestrale Allel-Inferenz: das in der phylogenetischen Aussen-Gruppe vorhandene Allel wird als ancestral angesehen. Ensembl's EPO Pipeline und spezifische Ancestral-Allel-Tracks (z.B. basierend auf Chimp/Gorilla/Orang als Outgroups fuer Menschen-Studien) sind weit verbreitet.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welchen molekularen Mechanismus nutzt der Gecko fuer seine Haftpads (Setae) und wurden Protein-Komponenten des Systems auf molekularer Ebene charakterisiert?",
        answerA = "Gecko-Haftung basiert auf chemischer Adhaaesion durch Mucus-Sekretion; hauptsaechlich Schleim-Glykoproteine bekannt",
        answerB = "Gecko-Setae haften durch van-der-Waals-Kraefte; die Nanofaserstruktur der Setae besteht aus Beta-Keratin (Cornulin-aehnlich) spezifisch exprimiert in Subdigital-Schuppen; Fowler et al. und andere identifizierten gecko-spezifische Beta-Keratin-Gene (Gekkota-spezifische Subfamilie) als Grundlage der Setal-Mikrostruktur",
        answerC = "Gecko-Haftung beruht auf mikroskaliger Kapillarkraft durch Wasser-Menisken zwischen Setae und Substrat; Setae bestehen aus Alpha-Keratin",
        answerD = "Gecko-Setae-Proteine sind voellig unbekannt; die Haftung ist nur physikalisch-mechanisch beschrieben ohne molekulare Charakterisierung",
        correctAnswer = 1,
        explanation = "Gecko-Adhesion basiert primaer auf van-der-Waals-Kraeften zwischen Beta-Keratin-Nanofasern (Setae) und Substrat. Genome-Studien (u.a. Gecko-Genomprojekte) identifizierten Gekkota-spezifische Beta-Keratin-Genfamilien, die in Adhaaesions-Schuppen stark exprimiert sind.",
        difficulty = 5,
        funFact = "Die Haftpads des Geckos koennen zehntausende von Setae pro Quadratmillimeter tragen und eine Gesamthaftkraft von mehr als dem Koerpergewicht erzeugen - alles durch reversible van-der-Waals-Interaktionen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist CAFE (Computational Analysis of gene Family Evolution) und was kann damit ueber Tiergenome-Vergleiche ausgesagt werden?",
        answerA = "CAFE ist ein Datenbankformat fuer Genomannotations-Export; keine Analysefunktion",
        answerB = "CAFE (De Bie et al. 2006) ist ein probabilistisches Framework das Genfamilien-Groessen-Veraenderungen auf phylogenetischen Baumen modelliert; es berechnet Expansions- und Kontraktionsraten von Genfamilien unter einem Birth-Death-Modell und identifiziert statistisch signifikante Lineage-spezifische Genfamilien-Veraenderungen - wichtig fuer das Verstehen adaptiver Genomevolution bei Tieren",
        answerC = "CAFE ist ein Tool fuer Codon-Adaptation-Index-Berechnungen in Zoologie-Proteinen",
        answerD = "CAFE analysiert ausschliesslich Kaefig-Verhalten von Labortieren; kein Genomics-Tool",
        correctAnswer = 1,
        explanation = "CAFE (Computational Analysis of gene Family Evolution) modelliert Genfamilien-Evolution unter einem stochastischen Geburts-Tod-Prozess. In der Zoologie wird es eingesetzt um Genfamilien-Expansionen (z.B. Olfaktorische Rezeptoren, Immunogene) oder Kontraktionen in spezifischen Tierlinien zu identifizieren.",
        difficulty = 5,
        funFact = "CAFE-Analysen zeigten z.B. eine massive Expansion von Geruchsrezeptorgenen bei Elefanten (ca. 2000 Gene) als Adaptation an Riechfaehigkeit als primaeren Sinn."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Rolle spielt das 'Accessory Gland Protein' (Acp) System bei Drosophila als Modell fuer sexuellen Konflikt auf molekularer Ebene und welches Protein ist das beststudierte Beispiel?",
        answerA = "Acp-Proteine sind Nahrungs-Verdauungsproteine; kein Zusammenhang zu sexuellem Konflikt",
        answerB = "Acp26Aa (Sex Peptide) ist ein in den Nebendrüsen des Maennchens produziertes Peptid, das post-kopulativ auf Weibchen transferiert wird, Remating supprimiert, Eiablage stimuliert und Immun-Aktivierung verursacht; schnelle Evolution dieser Proteine durch sexuellen Antagonismus ist ein Modell fuer 'Red Queen'-Coevolution zwischen Maennchen und Weibchen",
        answerC = "Acp-Proteine regulieren ausschliesslich Spermatogenese im Maennchen; keine Wirkung auf das Weibchen",
        answerD = "Accessory Gland Proteins sind hochkonserviert ueber alle Dipteren; kein Zeichen von positivem Selektion",
        correctAnswer = 1,
        explanation = "Drosophila Acp-Proteine (insbesondere Sex Peptide = Acp70A) werden mit dem Sperma transferiert und manipulieren Weibchen-Biologie zugunsten des Maennchens. Genomische Studien zeigen, dass Acp-Gene zu den am schnellsten evolvierenden Genen bei Drosophila gehoeren - ein direktes Zeichen von sexuellem Konflikt-basierter Koevolution.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche spezifischen genomischen Merkmale charakterisieren das Volvox-Artgenome im Vergleich zu einzelligen Verwandten (Chlamydomonas) und was sagt das ueber Mehrzelligkeit aus - obwohl Volvox kein Tier ist, ein Modell fuer Evolution der Mehrzelligkeit?",
        answerA = "Volvox-Genom hat fast identische Groesse wie Chlamydomonas; nur regulatorische Unterschiede",
        answerB = "Das Volvox carteri-Genom (ca. 138 Mb, Prochnik et al. 2010 Science) zeigt gegenueber Chlamydomonas (~120 Mb) Expansion von Genfamilien fuer Zelladhaaesion, extrazellulare Matrix-Komponenten (ECM), und eine Diversifikation von regulatorischen Kinasen - aber ueberraschend keine grosse Gesamtgenomexpansion; Gene fuer Differenzierung (v-Soma vs. v-Gonia) zeigen Domaenenrekombination",
        answerC = "Volvox hat 10-fach groesseres Genom als Chlamydomonas durch Transposon-Explosion",
        answerD = "Volvox zeigt ausschliesslich epigenetische Unterschiede zu Chlamydomonas; Genanzahl ist identisch",
        correctAnswer = 1,
        explanation = "Prochnik et al. (2010, Science) verglichen Volvox carteri und Chlamydomonas reinhardtii. Ueberraschenderweise war die Genomgroesse aehnlich, aber Volvox zeigte Expansion von Genen fuer extrazellulare Matrix (u.a. Pherophorin-Genfamilie) und Differenzierungsregulatoren als Schluessel fuer die Entstehung von Mehrzelligkeit.",
        difficulty = 5,
        funFact = "Volvox-Studien zeigten, dass Mehrzelligkeit kein gross-genomisches Ereignis erfordert, sondern durch Rekombination und Expansion weniger Genfamilien evolvieren kann."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist GWAS (Genome-Wide Association Study) im Kontext der Tierforschung und welche methodische Herausforderung besteht bei Wildtier-GWAS gegenueber Human-GWAS?",
        answerA = "GWAS identifiziert Assoziation zwischen SNPs und Phaenotypen durch logistische Regression; bei Wildtieren ist das Problem die starke Populationsstruktur (Subpopulationen) die falsch-positive Assoziationen erzeugt und durch Genomic Control oder Mixed-Model-Ansaetze (z.B. GEMMA, FaST-LMM) korrigiert werden muss",
        answerB = "Wildtier-GWAS ist identisch zu Human-GWAS; keine spezifischen Herausforderungen",
        answerC = "GWAS bei Wildtieren ist unmoeglich ohne Inzuchtlinien; nur F2-Kreuzungen sind geeignet",
        answerD = "Wildtier-GWAS verwendet ausschliesslich Kandidatengene-Ansaetze; genomweite Suche ist bei nicht-Modell-Tieren zu teuer",
        correctAnswer = 0,
        explanation = "Wildtier-GWAS leidet unter stark ausgeprägter Populationsstruktur (geographische Isolation, verschiedene Unterarten) die zu Konfundierung fuehrt. Mixed-Model-Ansaetze (EMMA, GEMMA) kontrollieren fuer Verwandtschaftsstruktur durch Genomische Verwandtschaftsmatrizen (GRM) und sind Goldstandard bei Wildtier-Phaenotypen.",
        difficulty = 5,
        funFact = "Wildtier-GWAS wurde erfolgreich bei Darwin-Finken (Beak-Form-Loci), Schweden-Dreistachligen-Stichlingen (Ruestungsreduktion) und Islaendischen Schafen (Horn-Morphologie) eingesetzt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche zwei Protein-Komplexe koordinieren die Kinetochor-Mikrotubulus-Interaktion bei Tieren und was ist die Relevanz des KMN-Netzwerks fuer Chromosomensegregation in Meiose vs. Mitose?",
        answerA = "Das KMN-Netzwerk (KNL1, MIS12-Komplex, NDC80-Komplex) ist der zentrale Mikrotubulus-Anbindungs-Hub am Kinetochor; KNL1-Phosphorylierung durch MPS1-Kinase koordiniert SAC-Signalisierung; in Meiose I werden Schwesterchromatiden cooriented (mono-orientiert) durch spezifische Sgo1-Protektion centromerer Cohesine - fundamental verschieden von Mitose wo Schwesterchromatiden bi-orientiert sind",
        answerB = "Kinetochor-Mikrotubulus-Bindung erfolgt durch Dynein allein; KMN-Netzwerk ist nicht-essentiell",
        answerC = "Das KMN-Netzwerk existiert nur in Vertebraten; Invertebraten nutzen Dynactin fuer Kinetochor-Bindung",
        answerD = "In Meiose und Mitose ist der Kinetochor-Mechanismus identisch; keine funktionalen Unterschiede",
        correctAnswer = 0,
        explanation = "Das KMN-Netzwerk (KNL1-MIS12-NDC80) ist hochkonserviert bei allen Metazoen und bildet die Kernanfassstruktur fuer Mikrotubuli. In Meiose I ist die mono-orientierte Schwesterchromatid-Coorientierung durch Sgo1-REC8-Cohesins einzigartig und ermoeglicht die erste Reductionsdivision - fundamental anders als in Mitose.",
        difficulty = 5,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches tierische Gen gilt als das evolutionaer am weitesten konservierte Gen und warum ist seine Konservierung ein Paradebeispiel fuer das Konzept 'Evolutionaere Restriktion'?",
        answerA = "Histone H3 und H4 sind am weitesten konserviert (100% Identitaet zwischen Mensch und Hefe); ihre extreme Konservierung erklaert sich durch das Chromatin-Nukleosom-Arrangement, wo jede Aminosaeure potentiell mit DNA oder anderen Histonen interagiert und damit unter maximaler purifierender Selektion steht",
        answerB = "Alpha-Tubulin ist das am weitesten konservierte Tiergen; keine Aminosaure-Unterschiede zwischen Wirbellosen und Vertebraten",
        answerC = "Das 18S rRNA-Gen ist am meisten konserviert; es zeigt keinerlei Variation ueber alle Eukaryoten",
        answerD = "Ubiquitin ist am weitesten konserviert; nur 2 Aminosaeure-Unterschiede zwischen Hefe und Mensch, was purifizierende Selektion auf jede Position belegt",
        correctAnswer = 0,
        explanation = "Histon H4 ist mit nur 2 Aminosaeure-Unterschieden zwischen Erbse und Kuh ein extremes Beispiel (Ubiquitin ebenfalls). Histone H3/H4 sind die absolut konserviertesten Proteine ueber alle Eukaryoten, da das Nukleosomen-Zusammenbau-System jeden Aminosaeure-Austausch bestraft.",
        difficulty = 5,
        funFact = "Histon H4 zeigt in 600 Millionen Jahren Evolution fast keine Veraenderungen - ein direkter Beweis, dass fast jede Mutation an diesem Protein letal oder stark deletaer ist."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Chromatin Immunoprecipitation Sequencing' (ChIP-seq) und welche spezifischen Histon-Modifikationen werden standardmaessig als Marker fuer Enhancer, aktive Promotoren und Polycomb-Silenzierung in Tiergenomen kartiert?",
        answerA = "ChIP-seq immunopraezipitiert Protein-DNA-Komplexe mit spezifischen Antikoerpern nach Formaldehyd-Crosslinking; Enhancer: H3K4me1 + H3K27ac (aktiv) oder H3K4me1 + H3K27me3 (poised); Aktive Promotoren: H3K4me3 + H3K27ac; Polycomb-Silenzierung: H3K27me3; Bivalente Promotoren (Entwicklungsgene): H3K4me3 + H3K27me3",
        answerB = "ChIP-seq misst DNA-Methylierung an CpG-Stellen; H3K9me3 markiert aktive Enhancer",
        answerC = "Alle Histon-Modifikationen haben gleiche Bedeutung; keine spezifischen Marker fuer Enhancer vs. Promotoren",
        answerD = "ChIP-seq misst ausschliesslich Transkriptionsfaktor-Bindung; keine Histon-Modifikations-Kartierung moeglich",
        correctAnswer = 0,
        explanation = "Encode und Roadmap Epigenomics etablierten das Standard-Histon-Modifikations-Vokabular: H3K4me1 markiert Enhancer, H3K4me3 aktive Promotoren, H3K27ac aktive Elemente (Enhancer und Promotoren), H3K27me3 Polycomb-Repression, H3K9me3 Heterochromatin. Bivalente Domains (H3K4me3+H3K27me3) markieren entwicklungsregulierte Gene in Stammzellen.",
        difficulty = 5,
        funFact = "Das bivalente Chromatin-Konzept wurde von Bernstein et al. 2006 in Cell beschrieben und erklaert wie Stammzellen Entwicklungsgene gleichzeitig poised aber reprimiert halten koennen."
    ),

)
