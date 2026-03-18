package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun geoQuestionsMaster4(): List<Question> = listOf(

    // ── OBSKURE GRENZVERLAUEFE & MIKRONESISCHE GEOGRAPHIE ────────────────────

    // Question 1 — Bir Tawil: Terra Nullius am Nil  [correct: B → correctAnswer=1]
    Question(
        categoryId = 1,
        questionText = "Zwischen Aegypten und Sudan existiert Bir Tawil — eines der wenigen bewohnbaren Gebiete der Erde, das von keinem Staat beansprucht wird. Warum lehnen BEIDE Laender die Souveraenitaet ueber dieses Gebiet ab, obwohl es ihnen frei zur Verfuegung stuende?",
        answerA = "Bir Tawil ist geologisch instabil: Das Gebiet liegt auf einer aktiven Grabenbruch-Struktur, und beide Laender verzichten aus Sicherheitsgruenden auf eine Annexion, da Erdbebenrisiken und Bodensenkungen eine permanente Besiedlung unmoeglich machen",
        answerB = "Das sogenannte Halayeb-Dreieck-Paradox: Aegypten besteht auf der Grenze von 1899 (die Halayeb dem Sudan gibt, Bir Tawil Aegypten), der Sudan auf der Grenze von 1902 (die Halayeb dem Sudan laesst, Bir Tawil aber Sudan zuschlaegt). Wer Bir Tawil beansprucht, gibt automatisch seinen Anspruch auf das viermal groessere und strategisch wertvolle Halayeb-Dreieck am Roten Meer auf — deshalb beansprucht keiner das wertlose Bir Tawil, um das wertvolle Halayeb nicht zu verlieren",
        answerC = "Bir Tawil ist formal Teil des Kondominiums Sudan-Aegypten, einem gemeinsam verwalteten Territorium analog zum frueheren anglo-aegyptischen Sudan; da kein Verwaltungsabkommen seit 1956 getroffen wurde, gilt das Gebiet als rechtlich suspendiert, nicht als herrenlos",
        answerD = "Das Gebiet faellt unter Artikel 12 der OAU-Charta von 1963, der alle Grenzaenderungen in Afrika verbietet; da Bir Tawil nach 1963 noch keinem Staat klar zugewiesen war, gilt ein Beanspruchungsmoratorium bis eine Schiedskommission der Afrikanischen Union eine Entscheidung trifft",
        correctAnswer = 1, // B
        explanation = "Das Bir-Tawil-Paradox entsteht durch zwei widerspreuechliche Grenzlinien: Die britisch-aegyptische Konvention von 1899 zog eine gerade Linie entlang des 22. Breitengrades — dabei faellt Halayeb (20.580 km², Zugang zum Roten Meer, strategisch wertvoll) an Aegypten und Bir Tawil (2.060 km², Wueste ohne Kuestenstreifen) an den Sudan. Die Verwaltungsgrenze von 1902 korrigierte dies zugunsten des Sudans fuer nomadische Stafmmesverwaltung — dabei behaelt der Sudan Halayeb, aber Bir Tawil kaeme zu Aegypten. Aegypten besteht auf 1899 (gibt ihm Halayeb), der Sudan auf 1902 (gibt ihm ebenfalls Halayeb). Beide reklamieren Halayeb gleichzeitig — aber Bir Tawil, das jeweils der anderen Grenzinterpretation zufolge dem jeweils anderen gehoert, will niemand, weil die Beanspruchung von Bir Tawil die bevorzugte Grenzlinie des Beanspruchenden unterstuetzt, die Halayeb dem Gegner geben wuerde. Bir Tawil ist damit das einzige nicht-antarktische, potenziell bewohnbare terra nullius der Erde.",
        difficulty = 5,
        funFact = "Mehrere Privatpersonen aus den USA und Europa haben Bir Tawil symbolisch 'annektiert' und sich selbst zum Koenig erklaert — darunter Jeremiah Heaton (2014), der seiner Tochter versprach, eine Prinzessin zu werden. Keiner dieser Ansprueche ist voelkerrechtlich anerkannt, da die Anerkennung durch andere Staaten fehlt."
    ),

    // Question 2 — Nauru: Phosphat, Kollaps und die seltsamste Wirtschaftsgeschichte Ozeaniens  [correct: C → correctAnswer=2]
    Question(
        categoryId = 1,
        questionText = "Die Inselrepublik Nauru (Mikronesien) durchlief im 20. Jahrhundert einen der dramatischsten wirtschaftlichen Zyklen eines Staates ueberhaupt. Welche Kombination aus geologischer Besonderheit, Wirtschaftspolitik und aktuellem geopolitischen Arrangement beschreibt Naurus Situation korrekt?",
        answerA = "Nauru besitzt die groessten Manganknollen-Vorkommen im Pazifik; nach Erschoepfung des Abbaus 1992 wurde die Wirtschaft durch australische Direktzahlungen stabilisiert; Nauru ist heute der kleinste UN-Mitgliedsstaat nach Flaeche und hat keine eigene Waehrung",
        answerB = "Nauru war der drittgroesste Guano-Exporteur der Welt; nach dem Zusammenbruch des Guano-Marktes durch synthetische Duengemittel verarmte die Insel; Nauru finanziert sich heute als 'Flag of Convenience'-Staat fuer internationale Schifffahrtsregistrierungen und verkauft diplomatische Anerkennungen an Laender wie Taiwan",
        answerC = "Naurus geologischer Reichtum bestand in Phosphatgestein (fossilisierte Vogelexkremente ueber Jahrmillionen auf einem gehobenen Korallenatolll); waehrend des Booms (1970er) hatte Nauru das hoechste Pro-Kopf-Einkommen der Welt; nach Erschoepfung der Vorkommen (ca. 2000) verarmte die Insel; heute verdient Nauru Geld u.a. als australisches Offshore-Asylzentrum und durch Verkauf von Staatsbuergerschaft sowie Fiskaldomizilen",
        answerD = "Nauru war Deutschlands einzige Sudsee-Kolonie mit nennenswerter Ressourcenfoerderung; nach dem Ersten Weltkrieg uebernahm Japan das Mandat; Nauru exportiert heute Tiefseemineralien (Kobalt, Nickel) und ist Gruendungsmitglied der 'Deep-Sea Mining Authority' als einziger mikronesischer Staat",
        correctAnswer = 2, // C
        explanation = "Nauru (21 km², ca. 10.000 Einwohner) ist ein gehobenes Korallenatoll, dessen Inneres aus reinem Phosphatgestein bestand — millionenfach konzentrierte Vogelexkremente (Guano), die ueber Jahrmillionen zu Mineralgestein wurden. Unter britisch-australisch-neuseelaendischem Mandat begann der Abbau 1906. Nach der Unabhaengigkeit 1968 verstaatlichte Nauru den Abbau; in den fruehen 1970ern erreichte das Pro-Kopf-BIP Naurus das der reichsten OECD-Staaten (>$50.000, kaufkraftbereinigt). Ein staatlicher Investitionsfonds (Nauru Phosphate Royalties Trust) sollte die Zukunft sichern — wurde aber durch Missmanagement und Betrug fast vollstaendig vernichtet (u.a. Londoner Musicalproduktionen, Immobilienspekulationen). Um 2000 waren die Phosphatvorraete erschoepft und der Fonds leer. Nauru eroeffnete 2001 gegen australische Zahlungen ein Asylbewerber-Lager ('Pacific Solution'), verkauft Passsaepsse, Fischereirechte und Briefkastenfirmen-Domazile. Nauru ist auch eines der wenigen Laender, das Taiwan diplomatisch anerkennt — gegen Entgelt.",
        difficulty = 5,
        funFact = null
    )

)
