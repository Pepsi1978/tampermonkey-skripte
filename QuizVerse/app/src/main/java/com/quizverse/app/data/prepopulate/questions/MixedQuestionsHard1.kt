package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun mixedQuestionsHard1(): List<Question> = listOf(

    // --- Griechische Mythologie ---

    Question(
        categoryId = 11,
        questionText = "Welcher griechische Heros wurde von seiner Mutter Thetis in den Styx getaucht, um ihn unverwundbar zu machen?",
        answerA = "Theseus",
        answerB = "Achilles",
        answerC = "Perseus",
        answerD = "Herakles",
        correctAnswer = 1,
        explanation = "Thetis tauchte ihren Sohn Achilles in den Unterweltfluss Styx. Sie hielt ihn dabei an der Ferse, weshalb diese seine einzige Schwachstelle blieb – daher der Begriff 'Achillesferse'.",
        difficulty = 3,
        funFact = "In Homers Ilias wird diese Tauchung gar nicht erwähnt. Die Geschichte stammt aus späteren Quellen wie dem Epos 'Achilleis' von Statius aus dem 1. Jahrhundert n. Chr."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher Titan war für die Strafe verurteilt, das Himmelsgewölbe zu tragen, nachdem die Titanen den Kampf gegen die Olympier verloren?",
        answerA = "Atlas",
        answerB = "Kronos",
        answerC = "Prometheus",
        answerD = "Hyperion",
        correctAnswer = 0,
        explanation = "Atlas, einer der Titanen, wurde von Zeus verurteilt, das Himmelsgewölbe auf seinen Schultern zu tragen. Populär wird oft irrtümlich die Erde dargestellt.",
        difficulty = 3,
        funFact = "Herakles trug vorübergehend das Himmelsgewölbe, während Atlas die Goldenen Äpfel der Hesperiden holte – eine seiner zwölf Arbeiten."
    ),

    Question(
        categoryId = 11,
        questionText = "Wie heißt die dreiköpfige Hündin, die den Eingang zur griechischen Unterwelt bewacht?",
        answerA = "Hydra",
        answerB = "Skylla",
        answerC = "Ladon",
        answerD = "Cerberus",
        correctAnswer = 3,
        explanation = "Kerberos (lateinisch: Cerberus) ist der dreiköpfige Höllenhund, der den Eingang zur Unterwelt des Hades bewacht. Er lässt Tote hinein, aber keine lebenden Seelen hinaus.",
        difficulty = 3,
        funFact = "Orpheus bezwang Kerberos nicht mit Gewalt, sondern mit Musik – sein Lyraspiel ließ sogar den Höllenhund in Schlaf versinken."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher griechische Gott war für Heilkunst und Medizin zuständig und trug einen Stab mit einer Schlange?",
        answerA = "Apollo",
        answerB = "Hypnos",
        answerC = "Hermes",
        answerD = "Asklepios",
        correctAnswer = 3,
        explanation = "Asklepios war der Gott der Heilkunst. Sein Symbol ist der Äskulapstab – ein Stab, um den sich eine einzelne Schlange windet. Er ist noch heute das Symbol der Medizin.",
        difficulty = 3,
        funFact = "Zeus tötete Asklepios mit einem Blitz, weil er Tote wieder zum Leben erweckte und damit die natürliche Ordnung störte. Asklepios wurde danach als Gott an den Sternenhimmel versetzt."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Ungeheuer war halb Mensch, halb Stier und lebte im Labyrinth von Kreta?",
        answerA = "Chimära",
        answerB = "Satyr",
        answerC = "Kentaur",
        answerD = "Minotaurus",
        correctAnswer = 3,
        explanation = "Der Minotaurus, geboren aus der Verbindung der kretischen Königin Pasiphae mit einem Stier, wurde von König Minos in einem Labyrinth eingesperrt. Theseus tötete ihn schließlich.",
        difficulty = 3,
        funFact = "Der Name Minotaurus bedeutet 'Stier des Minos'. Das Labyrinth wurde vom legendären Erfinder Daidalos konstruiert – demselben, der mit seinem Sohn Ikaros Flügel aus Federn und Wachs baute."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher Fluss der griechischen Unterwelt brachte Vergessen, wenn Tote davon tranken?",
        answerA = "Styx",
        answerB = "Lethe",
        answerC = "Phlegethon",
        answerD = "Acheron",
        correctAnswer = 1,
        explanation = "Der Lethe ('Vergessen') war einer der fünf Flüsse der Unterwelt. Seelen, die davon tranken, vergaßen ihr irdisches Leben, bevor sie wiedergeboren wurden.",
        difficulty = 3,
        funFact = "Das Wort 'Lethargos' (lethargisch) stammt vom Lethe ab und bedeutet ursprünglich 'vergesslich' oder 'betäubt'. Der Gegensatz ist die Mnemosyne, die Göttin der Erinnerung."
    ),

    // --- Nordische Mythologie ---

    Question(
        categoryId = 11,
        questionText = "Welches mythische Eichhörnchen lief laut nordischer Mythologie den Weltenbaum Yggdrasil auf und ab und trug Streit zwischen Adler und Drachen?",
        answerA = "Níðhöggr",
        answerB = "Fenrir",
        answerC = "Jörmungandr",
        answerD = "Ratatoskr",
        correctAnswer = 3,
        explanation = "Ratatoskr ist das Eichhörnchen, das den Yggdrasil hinauf und herunterläuft und Nachrichten zwischen dem Adler an der Spitze und dem Drachen Níðhöggr an den Wurzeln überträgt – meist feindselige Botschaften.",
        difficulty = 3,
        funFact = "Ratatoskr gilt als Unruhestifter und Klatschbase der nordischen Mythologie. Er genießt es, Streit zu säen und Beleidigungen weiterzutragen."
    ),

    Question(
        categoryId = 11,
        questionText = "Wie heißt der Wachhund, der in der nordischen Mythologie an den Toren von Hels Reich steht?",
        answerA = "Garm",
        answerB = "Fenrir",
        answerC = "Skoll",
        answerD = "Hati",
        correctAnswer = 0,
        explanation = "Garm (oder Garmr) ist der blutverschmierte Höllenhund, der vor der Höhle Gnipahellir am Eingang von Hels Reich, Niflheim, Wache hält. Bei Ragnarök töten er und Tyr sich gegenseitig.",
        difficulty = 3,
        funFact = "Garm wird in der Edda als 'der schlimmste der Hunde' bezeichnet. Sein Heulen gilt als Zeichen, dass Ragnarök – die Götterdämmerung – begonnen hat."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher Asen-Gott ist blind und tötete Baldr versehentlich mit einem Mistelzweig, gelenkt von Loki?",
        answerA = "Tyr",
        answerB = "Vidar",
        answerC = "Höðr",
        answerD = "Ullr",
        correctAnswer = 2,
        explanation = "Höðr, der blinde Gott, wurde von Loki verleitet, einen Mistelzweig nach Baldr zu werfen. Da alle Dinge schworen, Baldr nicht zu schaden – außer der Mistel – durchbohrte der Zweig Baldr tödlich.",
        difficulty = 3,
        funFact = "Die Mistel galt als zu jung und unbedeutend, um einen Eid zu leisten. Loki nutzte diese Lücke aus und formte daraus eine Waffe. Baldrs Tod gilt als Vorstufe zu Ragnarök."
    ),

    Question(
        categoryId = 11,
        questionText = "Wie heißt Odins achtbeiniges Pferd, das schneller als jedes andere Tier war?",
        answerA = "Sleipnir",
        answerB = "Grani",
        answerC = "Blóðughófi",
        answerD = "Skinfaxi",
        correctAnswer = 0,
        explanation = "Sleipnir ist Odins achtbeiniges Pferd. Es wurde von Loki geboren, nachdem er sich in eine Stute verwandelt hatte, um den Hengst Svaðilfari abzulenken. Sleipnir kann über Land, Wasser und durch die Luft reisen.",
        difficulty = 3,
        funFact = "Sleipnir ist buchstäblich Lokis Kind. In der nordischen Mythologie ist Loki der Vater mehrerer Monster: Fenrir (Wolf), Jörmungandr (Weltschlange), Hel (Göttin der Unterwelt) – und die Mutter von Sleipnir."
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist Valhalla in der nordischen Mythologie?",
        answerA = "Der Weltenbaum, der alle neun Welten verbindet",
        answerB = "Das Reich der Toten, regiert von Hel",
        answerC = "Die Brücke zwischen Midgard und Asgard",
        answerD = "Die Halle der gefallenen Krieger im Reich Odins",
        correctAnswer = 3,
        explanation = "Valhalla ('Halle der Erschlagenen') ist Odins große Halle in Asgard. Hier empfangen die Walküren gefallene Krieger (Einherjer), die sich täglich im Kampf üben, um bei Ragnarök an Odins Seite zu kämpfen.",
        difficulty = 3,
        funFact = "In Valhalla essen die Einherjer täglich das Fleisch des Ebers Sährimnir, der jede Nacht wieder lebt. Sie trinken Met, der aus dem Euter der Ziege Heiðrún fließt."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Ereignis markiert in der nordischen Mythologie das Ende der Götter und der Welt?",
        answerA = "Fimbulwinter",
        answerB = "Baldrs Tod",
        answerC = "Ragnarök",
        answerD = "Loki-Bestrafung",
        correctAnswer = 2,
        explanation = "Ragnarök ('Schicksal der Götter') ist die nordische Götterdämmerung: Eine Reihe von Ereignissen, die zum Tod vieler Götter – darunter Odin, Thor, Freyr – und zum Untergang der Welt führen.",
        difficulty = 3,
        funFact = "Nach Ragnarök entsteht eine neue Welt: Die Erde taucht frisch und grün aus dem Meer auf. Überlebende Götter wie Vidar, Vali und Baldr bevölkern die neue Welt."
    ),

    // --- Ägyptische Mythologie ---

    Question(
        categoryId = 11,
        questionText = "Welcher ägyptische Gott hatte einen Ibiskopf und war Gott der Weisheit, des Schreibens und der Magie?",
        answerA = "Thoth",
        answerB = "Horus",
        answerC = "Anubis",
        answerD = "Seth",
        correctAnswer = 0,
        explanation = "Thoth, mit dem Kopf eines Ibis-Vogels, war der Gott der Weisheit, des Schreibens, der Magie und des Mondes. Er galt als Erfinder der Hieroglyphen und als Schreiber der Götter.",
        difficulty = 3,
        funFact = "Thoth war auch für das Abwiegen der Seelen zuständig: Bei der Totengericht-Zeremonie schrieb er das Ergebnis der Herzwägung auf, wenn das Herz gegen die Feder der Maat gewogen wurde."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche ägyptische Göttin hatte einen Geierhead und galt als Schutzgöttin der Könige und Mütter?",
        answerA = "Isis",
        answerB = "Nekhbet",
        answerC = "Hathor",
        answerD = "Bastet",
        correctAnswer = 1,
        explanation = "Nekhbet, dargestellt als Geier, war die Schutzgöttin Oberägyptens und der Pharaonen. Zusammen mit der Kobra-Göttin Wadjet bildete sie das Symbol der Einheit Ober- und Unterägyptens am Kopfschmuck der Pharaonen.",
        difficulty = 3,
        funFact = "Nekhbet und Wadjet werden zusammen als 'Nebti' (die Zwei Herrinnen) bezeichnet. Ihre Abbilder am Kopfschmuck des Pharaos – Geier und Kobra – waren das Symbol seiner Herrschaft über ganz Ägypten."
    ),

    Question(
        categoryId = 11,
        questionText = "Wie heißt das 'Buch der Toten' in seiner altägyptischen Bezeichnung?",
        answerA = "Per-em-hru",
        answerB = "Amduat",
        answerC = "Pert em hru",
        answerD = "Papyrus Ani",
        correctAnswer = 0,
        explanation = "Das altägyptische 'Buch der Toten' heißt im Original 'Per-em-hru', was 'Das Herausgehen am Tage' bedeutet. Es enthielt Zaubersprüche und Anweisungen, die dem Toten bei der Reise ins Jenseits helfen sollten.",
        difficulty = 3,
        funFact = "Der bekannte 'Papyrus Ani' ist eine der am besten erhaltenen Versionen des Buches der Toten und wird heute im British Museum in London aufbewahrt. Ani war ein Schreiber aus der 18. Dynastie (ca. 1300 v. Chr.)."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher ägyptische Gott war Herr über Chaos und Wüste und tötete seinen Bruder Osiris?",
        answerA = "Apep",
        answerB = "Sobek",
        answerC = "Montu",
        answerD = "Seth",
        correctAnswer = 3,
        explanation = "Seth, Gott der Wüste, des Sturms und des Chaos, tötete seinen Bruder Osiris aus Neid. Er zerstückelte den Leichnam in 14 Teile und verteilte sie über ganz Ägypten. Isis sammelte die Stücke wieder zusammen.",
        difficulty = 3,
        funFact = "Seth war nicht nur böse in der ägyptischen Mythologie. Er fuhr auf Res Sonnenbarke mit und bekämpfte täglich die Schlange Apep, die die Sonne zu verschlucken drohte. Böse und schützend zugleich."
    ),

    Question(
        categoryId = 11,
        questionText = "Was passierte mit dem Herzen eines Toten bei der Herzwägung im ägyptischen Totengericht?",
        answerA = "Es wurde gegen einen Goldbarren gewogen",
        answerB = "Es wurde gegen das Gewicht des Pharaos gewogen",
        answerC = "Es wurde gegen die Feder der Maat gewogen",
        answerD = "Es wurde gegen einen Scarabäus gewogen",
        correctAnswer = 2,
        explanation = "Im 'Saal der Zwei Wahrheiten' wurde das Herz des Toten auf einer Waage gegen die Feder der Maat (Göttin der Wahrheit) abgewogen. War das Herz schwerer als die Feder, wurde es vom Ungeheuer Ammit gefressen.",
        difficulty = 3,
        funFact = "Ammit, das Ungeheuer das schwere Herzen fraß, war ein Mischwesen aus Nilpferd, Löwin und Krokodil. Wer von Ammit gefressen wurde, erlebte den 'Zweiten Tod' – die endgültige Vernichtung der Seele."
    ),

    // --- Japanische Mythologie ---

    Question(
        categoryId = 11,
        questionText = "Warum versteckte sich die japanische Sonnengöttin Amaterasu in einer Höhle und ließ die Welt in Dunkelheit versinken?",
        answerA = "Weil ein Drache die Sonne verfolgte",
        answerB = "Weil ihr Bruder Susanoo sie bedrohte und ihre Reisfelder verwüstete",
        answerC = "Weil die Menschen sie nicht mehr verehrten",
        answerD = "Weil ihr Vater Izanagi sie bestrafte",
        correctAnswer = 1,
        explanation = "Amaterasus Bruder Susanoo randalierte, zerstörte ihre Reisfelder und erschreckte eine ihrer Weberinnen so sehr, dass diese starb. Daraufhin zog sich Amaterasu in die Höhle Ama-no-Iwato zurück.",
        difficulty = 3,
        funFact = "Um Amaterasu aus der Höhle zu locken, organisierten die Götter ein lautes Fest. Die Göttin Ame-no-Uzume tanzte einen derart ausgelassenen, anzüglichen Tanz, dass alle Götter lachten. Amaterasus Neugier war geweckt."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche heiligen Texte der japanischen Mythologie wurden 712 und 720 n. Chr. aufgezeichnet?",
        answerA = "Genji Monogatari und Heike Monogatari",
        answerB = "Man'yoshu und Kokinshu",
        answerC = "Taiheiki und Manyoshu",
        answerD = "Kojiki und Nihon Shoki",
        correctAnswer = 3,
        explanation = "Das Kojiki ('Aufzeichnung alter Begebenheiten', 712 n. Chr.) und das Nihon Shoki ('Chroniken Japans', 720 n. Chr.) sind die ältesten schriftlichen Quellen der japanischen Mythologie und Geschichte.",
        difficulty = 3,
        funFact = "Das Kojiki wurde auf Befehl von Kaiserin Genmei verfasst und von Ono Yasumaro niedergeschrieben. Es gilt als Japans ältestes Buch und Nationalschatz."
    ),

    Question(
        categoryId = 11,
        questionText = "Wie heißen die Schöpfergötter in der japanischen Mythologie, die die Inseln Japans erschufen?",
        answerA = "Izanagi und Izanami",
        answerB = "Amaterasu und Tsukiyomi",
        answerC = "Susanoo und Ōkuninushi",
        answerD = "Inari und Raijin",
        correctAnswer = 0,
        explanation = "Izanagi ('Männlicher, der einlädt') und Izanami ('Weibliche, die einlädt') sind das göttliche Schöpferpaar der japanischen Mythologie. Sie standen auf der Himmelsbrücke und rührten mit einem Speer im Urmeer, um Japan zu erschaffen.",
        difficulty = 3,
        funFact = "Als Izanami bei der Geburt des Feuergottes Kagutsuchi starb, stieg Izanagi in die Unterwelt Yomi hinab, um sie zurückzuholen – ähnlich wie Orpheus in der griechischen Mythologie."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher japanische Gott besiegt die achtköpfige Schlange Yamata no Orochi?",
        answerA = "Raijin",
        answerB = "Susanoo",
        answerC = "Fujin",
        answerD = "Takemikazuchi",
        correctAnswer = 1,
        explanation = "Der Sturmgott Susanoo besiegte Yamata no Orochi, indem er die achtköpfige Schlange mit acht Fässern Sake betrunken machte und sie dann erschlug. In einem ihrer Schwänze fand er das legendäre Schwert Kusanagi-no-Tsurugi.",
        difficulty = 3,
        funFact = "Das Schwert Kusanagi-no-Tsurugi ist eines der drei Kaiserlichen Reichskleinodien Japans (neben dem Spiegel Yata no Kagami und dem Juwel Yasakani no Magatama). Es soll sich heute im Atsuta-Schrein in Nagoya befinden."
    ),

    // --- Keltische Mythologie ---

    Question(
        categoryId = 11,
        questionText = "Welcher keltische Gott war 'der Gehörnte' und Herr der Tiere, der Fruchtbarkeit und der Unterwelt?",
        answerA = "Cernunnos",
        answerB = "Lugh",
        answerC = "Dagda",
        answerD = "Belenus",
        correctAnswer = 0,
        explanation = "Cernunnos ist einer der ältesten und rätselhaftesten keltischen Götter. Er wird mit Geweih dargestellt, umgeben von Tieren, und gilt als Gott der Wildnis, der Fruchtbarkeit und des Jenseits.",
        difficulty = 3,
        funFact = "Cernunnos erscheint auf dem berühmten Kessel von Gundestrup aus dem 1. Jahrhundert v. Chr. Trotz seiner Bedeutung wissen wir kaum etwas über seinen Mythos, da die Kelten nichts aufschrieben."
    ),

    Question(
        categoryId = 11,
        questionText = "Wie heißt das Reich der Götter und Toten in der irisch-keltischen Mythologie?",
        answerA = "Avalon",
        answerB = "Tír na nÓg",
        answerC = "Tír Tairngire",
        answerD = "Tech Duinn",
        correctAnswer = 1,
        explanation = "Tír na nÓg ('Land der Ewigen Jugend') ist das übernatürliche Jenseitsreich der irischen Mythologie, eine Insel im fernen Westen, wo keine Zeit vergeht und Schönheit ewig währt.",
        difficulty = 3,
        funFact = "In der Sage 'Oisín in Tír na nÓg' reist der Krieger Oisín auf einer weißen Stute mit der Fee Niamh ins Land der Ewigen Jugend. Als er nach 300 Jahren zurückkommt und seine Füße den Boden Irlands berühren, altert er sofort."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches mythische Volk aus der irischen Mythologie waren die göttlichen Ureinwohner Irlands, bevor die Gaelen kamen?",
        answerA = "Firbolg",
        answerB = "Fomorians",
        answerC = "Milesian",
        answerD = "Tuatha Dé Danann",
        correctAnswer = 3,
        explanation = "Die Tuatha Dé Danann ('Völker der Göttin Danu') waren ein übernatürliches Volk in der irischen Mythologie. Sie besiegten die Fomorians und Firbolgs, mussten aber schließlich vor den Mileisern (Vorfahren der Iren) in die Unterwelt ziehen.",
        difficulty = 3,
        funFact = "Als die Tuatha Dé Danann besiegt wurden, zogen sie sich in die 'Sidhe' zurück – Hügel und Grabhügel, die als Eingänge zur Anderswelt galten. Daher stammt die irische Feenvorstellung."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher keltische Sonnengott des Lichts wurde in ganz Europa verehrt und sein Name lebt im Fest Beltane weiter?",
        answerA = "Lugh",
        answerB = "Taranis",
        answerC = "Belenus",
        answerD = "Esus",
        correctAnswer = 2,
        explanation = "Belenus (auch Belinus) war der keltische Gott des Lichts und der Sonne, dessen Kult sich von Irland bis nach Norditalien erstreckte. Das Frühlingsfest Beltane (1. Mai) trägt seinen Namen.",
        difficulty = 3,
        funFact = "Der Name 'Belenus' bedeutet möglicherweise 'strahlend hell'. In der keltischen Schweiz wurden ihm Weiheinschriften und Heiligtümer gewidmet, was seine weite Verbreitung belegt."
    ),

    // --- Nordische Mythologie (Fortsetzung) ---

    Question(
        categoryId = 11,
        questionText = "Welche neun Welten umfasst Yggdrasil in der nordischen Mythologie? Welche der folgenden ist KEINE der neun Welten?",
        answerA = "Niflheim (Nebelwelt)",
        answerB = "Muspelheim (Feuerwelt)",
        answerC = "Olympia (Götterwelt)",
        answerD = "Jötunheim (Riesenwelt)",
        correctAnswer = 2,
        explanation = "Olympia ist ein griechischer Begriff und gehört nicht zu den neun nordischen Welten. Die neun Welten sind: Asgard, Midgard, Jötunheim, Vanaheim, Niflheim, Muspelheim, Alfheim, Svartalfheim und Helheim.",
        difficulty = 3,
        funFact = "Midgard ('Mittelwelt') ist die Welt der Menschen – das Wort lebt im englischen 'Middle-earth' von Tolkien weiter, der sich stark von der nordischen Mythologie inspirieren ließ."
    ),

    Question(
        categoryId = 11,
        questionText = "Wer sind die Nornen in der nordischen Mythologie?",
        answerA = "Töchter Odins, die Prophezeiungen verkünden",
        answerB = "Meerjungfrauen, die Seefahrer in den Tod locken",
        answerC = "Weibliche Kriegerinnen, die Gefallene nach Valhalla bringen",
        answerD = "Drei Schicksalsgöttinnen, die am Yggdrasil das Schicksal weben",
        correctAnswer = 3,
        explanation = "Die drei Nornen – Urðr (Vergangenheit), Verðandi (Gegenwart) und Skuld (Zukunft) – spinnen und weben am Weltenbaum Yggdrasil die Schicksalsfäden aller Wesen, einschließlich der Götter.",
        difficulty = 3,
        funFact = "Anders als die griechischen Moiren, die Schicksal schneiden, weben die Nornen es. Sie gießen auch täglich heiliges Wasser aus dem Urd-Brunnen auf Yggdrasil, um den Baum gesund zu erhalten."
    ),

    // --- Aztekische und Maya Mythologie ---

    Question(
        categoryId = 11,
        questionText = "Welchen Namen trug Quetzalcoatl bei den Maya?",
        answerA = "Chaac",
        answerB = "Kukulkan",
        answerC = "Itzamná",
        answerD = "Hunahpu",
        correctAnswer = 1,
        explanation = "Kukulkan ist das Maya-Äquivalent des aztekischen Quetzalcoatl. Beide Namen bedeuten 'gefiederte Schlange'. Der bekannteste Tempel des Kukulkan ist die Pyramide El Castillo in Chichén Itzá.",
        difficulty = 3,
        funFact = "Zweimal im Jahr – zum Frühlingsanfang und Herbstanfang – bildet das Sonnenlicht auf der Pyramide von Chichén Itzá die Silhouette einer herabgleitenden Schlange. Dieses Phänomen dauert genau 34 Minuten."
    ),

    Question(
        categoryId = 11,
        questionText = "Welchem aztekischen Gott wurden die meisten Menschenopfer dargebracht, um die Sonne am Leuchten zu halten?",
        answerA = "Huitzilopochtli",
        answerB = "Quetzalcoatl",
        answerC = "Tlaloc",
        answerD = "Tezcatlipoca",
        correctAnswer = 0,
        explanation = "Huitzilopochtli, der Sonnengott und Gott des Krieges, benötigte täglich Menschenblut als 'kosmische Nahrung', um die Sonne am Leuchten zu halten und den Untergang der Welt zu verhindern.",
        difficulty = 3,
        funFact = "Die Azteken glaubten, in der fünften und letzten Epoche zu leben. Die bisherigen vier Sonnen (Weltalter) waren alle untergegangen. Nur Opferblut konnte die fünfte Sonne erhalten."
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist Mictlan in der aztekischen Mythologie?",
        answerA = "Der heilige Berg der Götter",
        answerB = "Das Paradies der Krieger",
        answerC = "Das Reich des Sonnengottes",
        answerD = "Die Unterwelt mit neun Ebenen",
        correctAnswer = 3,
        explanation = "Mictlan ist die aztekische Unterwelt, bestehend aus neun Ebenen. Die Seelen der Verstorbenen mussten eine vierjährige Reise durch alle neun Ebenen absolvieren, bevor sie ewige Ruhe im tiefsten Niveau fanden.",
        difficulty = 3,
        funFact = "Der aztekische Totentag – Día de los Muertos – hat seine Wurzeln in der Verehrung der Mictlan-Reise. Die Opfergaben sollten den Toten auf ihrer Reise helfen."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche Göttin der aztekischen Mythologie ist für Maguey-Pflanze und Pulque (Agavenwein) zuständig und gilt als Patronin der Trunkenheit?",
        answerA = "Coatlicue",
        answerB = "Xochiquetzal",
        answerC = "Mayahuel",
        answerD = "Tlazolteotl",
        correctAnswer = 2,
        explanation = "Mayahuel ist die aztekische Göttin der Maguey-Pflanze (Agave), aus der Pulque hergestellt wird. Sie wird oft mit 400 Brüsten dargestellt, die ihre 400 Kinder (die 400 Hasen/Centzontotochtin) ernähren.",
        difficulty = 3,
        funFact = "Die 400 Hasen-Götter repräsentieren die 400 Arten der Trunkenheit. In der aztekischen Zahlensymbolik bedeutet '400' oft 'unzählig viele'."
    ),

    // --- Mesopotamische Mythologie ---

    Question(
        categoryId = 11,
        questionText = "Welches sumerische Epos gilt als ältestes literarisches Werk der Menschheit?",
        answerA = "Enuma Elisch",
        answerB = "Descent of Inanna",
        answerC = "Atrahasis-Epos",
        answerD = "Gilgamesch-Epos",
        correctAnswer = 3,
        explanation = "Das Gilgamesch-Epos, entstanden ca. 2100 v. Chr. in Sumer, gilt als ältestes erhaltenes literarisches Werk. Es erzählt von König Gilgamesch von Uruk und seiner Suche nach Unsterblichkeit.",
        difficulty = 3,
        funFact = "Das Gilgamesch-Epos enthält eine Sintflut-Geschichte (Utnapishtim), die der Noah-Geschichte in der Bibel verblüffend ähnelt – und Jahrhunderte älter ist. Entdeckt wurde diese Parallele 1872 vom britischen Archäologen George Smith."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche babylonische Göttin fuhr in die Unterwelt und sorgte dafür, dass auf der Erde keine Fruchtbarkeit mehr herrschte?",
        answerA = "Inanna",
        answerB = "Tiamat",
        answerC = "Ninsun",
        answerD = "Ninhursag",
        correctAnswer = 0,
        explanation = "Inanna (babylonisch: Ischtar), Göttin der Liebe und des Krieges, stieg in die Unterwelt ihrer Schwester Ereshkigal hinab. Während ihrer Abwesenheit gab es keine Fortpflanzung auf der Erde – Mensch, Tier und Pflanze wurden unfruchtbar.",
        difficulty = 3,
        funFact = "Beim Abstieg in die Unterwelt musste Inanna an sieben Toren je ein Kleidungsstück oder Schmuckstück ablegen. Am Ende stand sie nackt vor ihrer Schwester Ereshkigal, die sie tötete. Der Mythos ähnelt Persephone in der griechischen Mythologie."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche Göttin tötete der babylonische Schöpfergott Marduk in der Schöpfungsgeschichte Enuma Elisch, um aus ihrem Körper die Welt zu formen?",
        answerA = "Ischtar",
        answerB = "Ninhursag",
        answerC = "Ereshkigal",
        answerD = "Tiamat",
        correctAnswer = 3,
        explanation = "Im Enuma Elisch erschlug Marduk die Urmeeresschlange Tiamat und teilte ihren Körper in zwei Hälften: Aus der einen machte er den Himmel, aus der anderen die Erde.",
        difficulty = 3,
        funFact = "Das Enuma Elisch ('Als oben...') ist eine der frühesten schriftlichen Schöpfungsgeschichten der Menschheit (ca. 18. Jahrhundert v. Chr.). Marduk, der Stadtgott von Babylon, übernahm durch diese Erzählung die Vorherrschaft im babylonischen Pantheon."
    ),

    // --- Hinduistische Mythologie ---

    Question(
        categoryId = 11,
        questionText = "Wie viele Arme hat die hinduistische Göttin Durga traditionell in ihrer Darstellung?",
        answerA = "Zehn",
        answerB = "Sechs",
        answerC = "Acht",
        answerD = "Vier",
        correctAnswer = 0,
        explanation = "Durga, die Kriegsgöttin, wird traditionell mit zehn Armen dargestellt, in denen sie verschiedene Waffen trägt, die ihr von anderen Göttern geschenkt wurden, um den Büffeldämon Mahishasura zu besiegen.",
        difficulty = 3,
        funFact = "Das neuntägige hinduistische Fest Navaratri feiert Durgas Sieg über Mahishasura. An diesen Tagen fasten viele Hindus und verehren die neun Formen (Navadurga) der Göttin."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher hinduistische Gott ist für das Entfernen von Hindernissen zuständig und hat einen Elefantenkopf?",
        answerA = "Ganesha",
        answerB = "Shiva",
        answerC = "Vishnu",
        answerD = "Brahma",
        correctAnswer = 0,
        explanation = "Ganesha, Sohn von Shiva und Parvati, hat einen Elefantenkopf und wird als 'Vighnaharta' (Beseitiger von Hindernissen) und 'Vighnakartar' (Verursacher von Hindernissen für Böse) verehrt.",
        difficulty = 3,
        funFact = "Wie Ganesha seinen Elefantenkopf bekam: Shiva köpfte ihn versehentlich, als er ihn nicht erkannte. Um Parvati zu besänftigen, versprach er, den Kopf des ersten Wesens zu nehmen, das er träfe – und das war ein Elefant."
    ),

    Question(
        categoryId = 11,
        questionText = "In wie viele Weltalter (Yugas) teilt die hinduistische Mythologie die Zeit ein?",
        answerA = "Drei",
        answerB = "Fünf",
        answerC = "Vier",
        answerD = "Sieben",
        correctAnswer = 2,
        explanation = "Die hinduistische Mythologie kennt vier Yugas (Weltalter): Satya Yuga (goldenes Zeitalter), Treta Yuga, Dvapara Yuga und Kali Yuga (das aktuelle, dunkle Zeitalter). Zusammen bilden sie einen Mahayuga-Zyklus.",
        difficulty = 3,
        funFact = "Das Kali Yuga, in dem wir heute nach hinduistischer Überzeugung leben, begann 3102 v. Chr. und wird 432.000 Jahre dauern. Es ist das Zeitalter des Verfalls, aber auch der einfachsten spirituellen Erlösung."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche hinduistische Gottheit ist der Bewahrer des Universums und erscheint in zehn Hauptinkarnationen (Avataren)?",
        answerA = "Brahma",
        answerB = "Vishnu",
        answerC = "Shiva",
        answerD = "Indra",
        correctAnswer = 1,
        explanation = "Vishnu ist der Bewahrer in der hinduistischen Trinität (Trimurti). Er erscheint in zehn Inkarnationen (Dashavatara), darunter als Rama, Krishna und nach hinduistischer Überzeugung auch als Buddha.",
        difficulty = 3,
        funFact = "Der zehnte Avatar Vishnus, Kalki, ist noch nicht erschienen. Er soll am Ende des Kali Yuga auf einem weißen Pferd erscheinen, Böses vernichten und das neue goldene Zeitalter einleiten."
    ),

    // --- Römische Mythologie ---

    Question(
        categoryId = 11,
        questionText = "Welcher römische Gott bewachte Türen, Tore und Übergänge und hatte zwei Gesichter?",
        answerA = "Vulcanus",
        answerB = "Saturnus",
        answerC = "Terminus",
        answerD = "Janus",
        correctAnswer = 3,
        explanation = "Janus, der zweigesichtige Gott der Übergänge, Tore und des Anfangs, hat kein griechisches Äquivalent – er ist ein originär römischer Gott. Nach ihm wurde der Monat Januar benannt.",
        difficulty = 3,
        funFact = "Der Janus-Tempel auf dem Forum Romanum in Rom hatte seine Türen geöffnet in Kriegszeiten und geschlossen in Friedenszeiten. Während der gesamten römischen Republik waren die Türen nur zweimal geschlossen."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche Zwillinge wurden laut römischer Mythologie von einer Wölfin gesäugt und gründeten Rom?",
        answerA = "Castor und Pollux",
        answerB = "Tarquinius und Brutus",
        answerC = "Romulus und Remus",
        answerD = "Aeneas und Ascanius",
        correctAnswer = 2,
        explanation = "Romulus und Remus, Söhne des Kriegsgottes Mars, wurden als Säuglinge im Tiber ausgesetzt, von einer Wölfin gesäugt und von einem Hirten aufgezogen. Romulus gründete schließlich Rom (ca. 753 v. Chr.).",
        difficulty = 3,
        funFact = "Bei der Gründung Roms stritten die Brüder, auf welchem Hügel die Stadt errichtet werden solle. Der Streit eskalierte: Romulus tötete Remus und wurde zum ersten König Roms."
    ),

    Question(
        categoryId = 11,
        questionText = "Wer ist in der römischen Mythologie die Göttin des Regenbogens, die als Botin der Götter diente?",
        answerA = "Iris",
        answerB = "Aurora",
        answerC = "Flora",
        answerD = "Juno",
        correctAnswer = 0,
        explanation = "Iris, Göttin des Regenbogens, war die Botin der Götter (besonders der Juno) und verband den Olymp mit der Erde und der Unterwelt. In der griechischen Mythologie trägt sie denselben Namen.",
        difficulty = 3,
        funFact = "Die Blumengattung Iris (Schwertlilien) ist nach ihr benannt. Die Regenbogenfarben der Blüten erinnern an die Göttin des Regenbogens. Auch das Wort 'Iris' im Auge (der farbige Ring) geht auf sie zurück."
    ),

    // --- Gemischte Mythologie ---

    Question(
        categoryId = 11,
        questionText = "Welche mythologische Kreatur ist in der chinesischen Tradition ein Zeichen des Glücks, während sie im europäischen Mittelalter als böse gilt?",
        answerA = "Drache",
        answerB = "Phönix",
        answerC = "Einhorn",
        answerD = "Greif",
        correctAnswer = 0,
        explanation = "Der Drache symbolisiert in der chinesischen Mythologie Glück, Weisheit und kaiserliche Macht – der Kaiser trug das Drachensymbol. Im europäischen Mittelalter war der Drache dagegen das Böse, das der Held erschlagen musste.",
        difficulty = 3,
        funFact = "Chinesische Drachen (Long) sind oft schlangenförmig, können fliegen ohne Flügel und bringen Regen und Fruchtbarkeit. Europäische Drachen haben Flügel, speien Feuer und hüten Schätze."
    ),

    Question(
        categoryId = 11,
        questionText = "In welcher Mythologie findet sich der Phönix zuerst – ein Vogel, der nach dem Tod in Flammen aufgeht und wiedergeboren wird?",
        answerA = "Griechische Mythologie",
        answerB = "Persische Mythologie",
        answerC = "Altägyptische Mythologie",
        answerD = "Indische Mythologie",
        correctAnswer = 2,
        explanation = "Der Phönix hat seinen Ursprung im altägyptischen Benu-Vogel, einem heiligen Vogel des Sonnengottes Ra in Heliopolis. Er symbolisierte Auferstehung und den täglichen Sonnenaufgang.",
        difficulty = 3,
        funFact = "Der Benu-Vogel wurde mit dem echten Reiher (Ardea cinerea) in Verbindung gebracht. In Heliopolis galt er als Seele des Gottes Ra und später als Seele des Osiris – eine Verkörperung von Tod und Wiedergeburt."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher irische Sagenheld aus dem Ulster-Zyklus gilt als stärkster Krieger Irlands und kämpfte trotz tödlicher Wunden?",
        answerA = "Fionn mac Cumhaill",
        answerB = "Cú Chulainn",
        answerC = "Diarmuid",
        answerD = "Conall Cernach",
        correctAnswer = 1,
        explanation = "Cú Chulainn ist der Held des Ulster-Zyklus der irischen Mythologie. Er ist für seine 'Ríastrad' (kriegerische Raserei) bekannt, bei der er sich in ein schreckliches Monster verwandelt. Er starb an einen Pfahl gelehnt, damit er im Stehen kämpfend stirbt.",
        difficulty = 3,
        funFact = "Cú Chulainn wurde von Setanta getötet – er bekam das Speerwurf-Opfer, das eigentlich dem König Conchobar galt, weil er selbst den Hund (cú) des Schmieds Culann getötet hatte und sich verpflichtet hatte, ihn zu ersetzen – daher: Hund (cú) des Culann."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher Gott aus der Veda-Tradition Indiens tötete den Schlangendämon Vritra und brachte den Regen zurück?",
        answerA = "Vishnu",
        answerB = "Indra",
        answerC = "Shiva",
        answerD = "Agni",
        correctAnswer = 1,
        explanation = "Indra, der vedische Gott des Donners, Sturms und des Krieges, tötete mit seinem Donnerkeil Vajra den Schlangendämon Vritra, der alle Gewässer in sich zurückhielt. Dieser Mythos erklärt den ersten Regen.",
        difficulty = 3,
        funFact = "Indra ist im Rigveda (dem ältesten vedischen Text) der am häufigsten angerufene Gott. Im späteren Hinduismus verlor er an Bedeutung, bleibt aber König der Götter (Devas) und Herr des Paradieses Svarga."
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist der 'Caduceus' – das Symbol mit zwei Schlangen um einen Stab mit Flügeln?",
        answerA = "Das Symbol des Kriegsgottes Ares",
        answerB = "Das Symbol des Heilgottes Asklepios",
        answerC = "Das Zepter des Zeus",
        answerD = "Der Stab des Botschaftergottes Hermes",
        correctAnswer = 3,
        explanation = "Der Caduceus ist der Hermesstab mit zwei sich umwindenden Schlangen und geflügelter Spitze. Er ist das Symbol des Hermes (römisch: Merkur) als Götterbote, Händler und Seelenführer.",
        difficulty = 3,
        funFact = "Der Caduceus wird häufig fälschlicherweise als Medizinsymbol verwendet – das korrekte medizinische Symbol ist der Äskulapstab mit nur einer Schlange ohne Flügel. Viele US-amerikanische Militärsanitäter nutzen irrtümlich den Caduceus."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher mesopotamische Halbgott überlebte die Sintflut und wurde von den Göttern mit Unsterblichkeit belohnt?",
        answerA = "Enkidu",
        answerB = "Utnapishtim",
        answerC = "Urshanabi",
        answerD = "Ziusudra",
        correctAnswer = 1,
        explanation = "Utnapishtim (auch als Ziusudra oder Atrahasis bekannt) baute ein Schiff auf Befehl des Gottes Ea/Enki, überlebte die von den Göttern gesandte Sintflut und wurde danach an den Enden der Welt mit Unsterblichkeit belohnt.",
        difficulty = 3,
        funFact = "Im Gilgamesch-Epos sucht Gilgamesch nach Utnapishtim, um das Geheimnis der Unsterblichkeit zu erfahren. Utnapishtim zeigt ihm das 'Kraut der Unsterblichkeit', das Gilgamesch aber auf dem Heimweg verliert, als eine Schlange es frisst."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher Gott der nordischen Mythologie opferte seine Hand, damit der Fenriswolf gefesselt werden konnte?",
        answerA = "Odin",
        answerB = "Freyr",
        answerC = "Thor",
        answerD = "Tyr",
        correctAnswer = 3,
        explanation = "Tyr, Gott des Krieges und der Gerechtigkeit, legte seine Hand freiwillig in den Rachen des Fenriswolfs als Pfand, während die Götter ihn fesselten. Als Fenrir merkte, dass die Fesseln hielten, biss er Tyrs Hand ab.",
        difficulty = 3,
        funFact = "Der Wochentag Dienstag (englisch: Tuesday) ist nach Tyr benannt – 'Tyr's Day'. Ebenso: Wednesday (Wotan/Odin), Thursday (Thor), Friday (Frigg/Freya)."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher griechische Titane war Bruder des Prometheus und nahm das Angebot an, die Gaben der Götter für die Menschen zu empfangen, obwohl er gewarnt wurde?",
        answerA = "Menoitios",
        answerB = "Iapetos",
        answerC = "Epimetheus",
        answerD = "Koios",
        correctAnswer = 2,
        explanation = "Epimetheus ('der Nachher-Denkende') nahm trotz Prometheus' Warnung die Büchse der Pandora an. Sein Bruder Prometheus ('der Vorher-Denkende') hatte Weitsicht, Epimetheus hingegen dachte erst hinterher nach.",
        difficulty = 3,
        funFact = "Die Namen sind programmatisch: Pro-metheus = 'vor dem' Denken, Epi-metheus = 'nach dem' Denken. Epimetheus verlieh alle nützlichen Eigenschaften an die Tiere und hatte für den Menschen nichts mehr übrig – weshalb Prometheus das Feuer stahl."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches mythologische Wesen aus der persischen Mythologie ist ein geflügeltes Pferd-Vogel-Wesen, das der Prophet Mohammed bei seiner Himmelsreise ritt?",
        answerA = "Buraq",
        answerB = "Simurgh",
        answerC = "Anqa",
        answerD = "Huma",
        correctAnswer = 0,
        explanation = "Al-Buraq (arabisch: der Blitzende) ist das mythologische Reittier, auf dem der Prophet Mohammed laut islamischer Überlieferung die Isra (Nachtreise) von Mekka nach Jerusalem und die Miraj (Himmelfahrt) unternahm.",
        difficulty = 3,
        funFact = "Al-Buraq wird beschrieben als weißes Tier, größer als ein Esel, kleiner als ein Maultier, mit dem Gesicht einer Frau und dem Schweif eines Pfaus. Jeder seiner Schritte reichte bis zum Horizont."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher aztekische Gott verkörperte den rauchenden Spiegel und war der Antagonist von Quetzalcoatl?",
        answerA = "Tlaloc",
        answerB = "Tezcatlipoca",
        answerC = "Xipe Totec",
        answerD = "Huitzilopochtli",
        correctAnswer = 1,
        explanation = "Tezcatlipoca ('Rauchender Spiegel') war einer der mächtigsten aztekischen Götter – Gott der Nacht, der Zauberei und des Schicksals. Sein Obsidianspiegel zeigte die Sünden der Menschen. Er war der ewige Rivale von Quetzalcoatl.",
        difficulty = 3,
        funFact = "Tezcatlipoca verlor einen Fuß, als er ihn in das Erdrachen-Monster Cipactli warf, um die Erde zu erschaffen. Daher wird er oft mit einem Obsidianspiegel oder Schlangenfuß dargestellt."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche drei Göttinnen stritten in der griechischen Mythologie um den Apfel der Schönsten, was den Trojanischen Krieg auslöste?",
        answerA = "Hera, Artemis und Aphrodite",
        answerB = "Athena, Artemis und Persephone",
        answerC = "Hera, Demeter und Aphrodite",
        answerD = "Hera, Athena und Aphrodite",
        correctAnswer = 3,
        explanation = "Auf der Hochzeit von Peleus und Thetis warf die Göttin Eris (Zwietracht) einen goldenen Apfel mit der Aufschrift 'für die Schönste' unter die Götter. Hera, Athena und Aphrodite stritten darum, Paris sollte urteilen.",
        difficulty = 3,
        funFact = "Paris wählte Aphrodite, weil sie ihm die schönste Frau der Welt versprach – Helena von Sparta. Die Entführung Helenas durch Paris löste den Trojanischen Krieg aus. Hera und Athena wurden zu erbitterten Feindinnen Trojas."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche keltische Göttin des Krieges und Schicksals erschien auf Schlachtfeldern als Krähe und rief die Toten mit Namen?",
        answerA = "Brigid",
        answerB = "Danu",
        answerC = "Morrigan",
        answerD = "Medb",
        correctAnswer = 2,
        explanation = "Die Morrigan ist die keltische Göttin des Schicksals, des Todes und der Schlacht. Sie erscheint als Krähe oder Rabe auf Schlachtfeldern und kündigt den Tod von Kriegern an. Sie ist eine Dreifachgöttin (Badb, Macha, Nemain).",
        difficulty = 3,
        funFact = "Die Morrigan versuchte Cú Chulainn zu verführen. Als er sie abwies, war sie beleidigt und versuchte ihn bei mehreren Gelegenheiten zu töten – mal als Aal, mal als Wolf, mal als Kuh. Am Ende jedoch half sie ihm auch."
    )

)
