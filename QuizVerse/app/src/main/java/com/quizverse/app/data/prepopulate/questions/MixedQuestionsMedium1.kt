package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun mixedQuestionsMedium1(): List<Question> = listOf(

    // ── ANTIKE PHILOSOPHIE ────────────────────────────────────────────────────

    // Question 1 – Sokrates: Erkenntnismethode
    Question(
        categoryId = 11,
        questionText = "Wie nennt man die Gesprächsmethode des Sokrates, bei der er durch gezieltes Fragen seinen Gesprächspartner zur Erkenntnis führte?",
        answerA = "Dialektik",
        answerB = "Rhetorik",
        answerC = "Mäeutik",
        answerD = "Sophistik",
        correctAnswer = 2, // C
        explanation = "Die Mäeutik (griechisch: Hebammenkunst) beschreibt Sokrates' Methode, durch geschickte Fragen verborgenes Wissen im Gesprächspartner zu 'entbinden'. Sokrates verglich sich dabei mit einer Hebamme – er gebiert keine Gedanken selbst, sondern hilft anderen bei der Geburt ihrer eigenen Erkenntnis.",
        difficulty = 2,
        funFact = "Sokrates' Mutter war tatsächlich Hebamme – daher der Vergleich war für ihn sehr naheliegend."
    ),

    // Question 2 – Platon: Ideenlehre
    Question(
        categoryId = 11,
        questionText = "Was ist der Kerngedanke von Platons Ideenlehre?",
        answerA = "Die Welt der Sinne ist die einzige wahre Wirklichkeit",
        answerB = "Hinter der wahrnehmbaren Welt existiert eine ewige Welt unveränderlicher Ideen als wahre Wirklichkeit",
        answerC = "Jeder Mensch trägt angeborene Ideen in sich, die durch Erfahrung geweckt werden",
        answerD = "Ideen entstehen ausschließlich durch gesellschaftliche Übereinkunft",
        correctAnswer = 1, // B
        explanation = "Platon unterschied zwischen der veränderlichen Sinneswelt (Schatten der Wirklichkeit) und der unveränderlichen Ideenwelt. Die 'Idee' ist das vollkommene Urbild, von dem alle sinnlichen Dinge nur mangelhafte Abbilder sind. Das bekannteste Beispiel ist die 'Idee des Guten' als höchste Idee.",
        difficulty = 2,
        funFact = null
    ),

    // Question 3 – Platons Höhlengleichnis
    Question(
        categoryId = 11,
        questionText = "Was symbolisiert in Platons Höhlengleichnis das Licht der Sonne außerhalb der Höhle?",
        answerA = "Die Welt der sinnlichen Erfahrungen",
        answerB = "Die Vernunft als höchste menschliche Fähigkeit",
        answerC = "Die Idee des Guten als höchste Erkenntnis",
        answerD = "Die politische Macht des Philosophenkönigs",
        correctAnswer = 2, // C
        explanation = "Im Höhlengleichnis (Politeia, Buch VII) sitzen Menschen in einer Höhle und sehen nur Schatten an der Wand. Wer sich befreit und ins Licht tritt, erlangt wahre Erkenntnis. Die Sonne symbolisiert die 'Idee des Guten' – die höchste philosophische Einsicht, die alles andere erleuchtet.",
        difficulty = 2,
        funFact = "Platon schrieb das Höhlengleichnis als Anklage gegen die athenische Demokratie, die seinen Lehrer Sokrates hingerichtet hatte."
    ),

    // Question 4 – Aristoteles: Tugendethik
    Question(
        categoryId = 11,
        questionText = "Was verstand Aristoteles unter der 'Mesotes' (Mitte) in seiner Tugendethik?",
        answerA = "Das Streben nach einem mittelmäßigen Leben ohne Extreme",
        answerB = "Die Tugend als goldene Mitte zwischen zwei Lastern des Zuviel und Zuwenig",
        answerC = "Die politische Mitte zwischen Oligarchie und Demokratie",
        answerD = "Das arithmetische Mittel der Güter beim gerechten Tausch",
        correctAnswer = 1, // B
        explanation = "Für Aristoteles ist jede Tugend die goldene Mitte (Mesotes) zwischen zwei Extremen. Mut liegt zwischen Feigheit (Zuwenig) und Tollkühnheit (Zuviel). Großzügigkeit liegt zwischen Geiz und Verschwendung. Diese Mitte ist nicht absolut, sondern relativ zur Person und Situation.",
        difficulty = 2,
        funFact = "Aristoteles' Nikomachische Ethik ist nach seinem Sohn Nikomachos benannt, der sie möglicherweise herausgegeben hat."
    ),

    // Question 5 – Aristoteles: Staatsformen
    Question(
        categoryId = 11,
        questionText = "Welche drei 'guten' Staatsformen unterschied Aristoteles von ihren entarteten Gegenstücken?",
        answerA = "Demokratie, Oligarchie und Tyrannei",
        answerB = "Monarchie, Aristokratie und Politie",
        answerC = "Republik, Kaiserreich und Theokratie",
        answerD = "Monarchie, Demokratie und Anarchie",
        correctAnswer = 1, // B
        explanation = "Aristoteles unterschied in seiner 'Politik' sechs Staatsformen: Monarchie (gut) vs. Tyrannei (entartet), Aristokratie (gut) vs. Oligarchie (entartet), Politie (gut) vs. Demokratie (entartet). Als beste Form für die Praxis sah er die Politie an – eine gemischte Verfassung mit einem starken Mittelstand.",
        difficulty = 2,
        funFact = null
    ),

    // ── NEUZEIT & AUFKLÄRUNG ─────────────────────────────────────────────────

    // Question 6 – Descartes: Cogito
    Question(
        categoryId = 11,
        questionText = "Was bedeutet Descartes' berühmter Satz 'Cogito ergo sum' (Ich denke, also bin ich)?",
        answerA = "Das Denken ist die einzige Tätigkeit, die den Menschen vom Tier unterscheidet",
        answerB = "Die einzige unzweifelhafte Gewissheit ist die eigene Existenz als denkendes Wesen",
        answerC = "Wissen entsteht ausschließlich durch rationales Denken, nie durch Sinneserfahrung",
        answerD = "Das menschliche Gehirn ist der Sitz der Seele und aller Erkenntnis",
        correctAnswer = 1, // B
        explanation = "Descartes zweifelte in seinen Meditationen an allem – selbst an der Außenwelt konnte ihn ein 'böser Geist' täuschen. Aber das Zweifeln selbst beweist, dass jemand denkt. Wer denkt, existiert. Dieser eine Satz widerstand dem radikalen Zweifel und wurde Ausgangspunkt seiner Philosophie.",
        difficulty = 2,
        funFact = "Descartes schrieb seine Meditationen auf Latein, aber der berühmte Satz stammt ursprünglich aus seinem französischen 'Discours de la Méthode' (1637)."
    ),

    // Question 7 – Kant: Kategorischer Imperativ
    Question(
        categoryId = 11,
        questionText = "Wie lautet Kants kategorischer Imperativ in seiner bekanntesten Formulierung?",
        answerA = "Handle stets so, dass deine Handlung den größten Nutzen für die größte Anzahl von Menschen bringt",
        answerB = "Handle nur nach derjenigen Maxime, durch die du zugleich wollen kannst, dass sie ein allgemeines Gesetz werde",
        answerC = "Handle so, wie du möchtest, dass andere dir gegenüber handeln",
        answerD = "Handle stets im Einklang mit deiner Natur und deinen angeborenen Tugenden",
        correctAnswer = 1, // B
        explanation = "Kants kategorischer Imperativ ist ein unbedingtes moralisches Gebot. Die Universalisierungsformel lautet: Prüfe, ob deine Handlungsmaxime zum allgemeinen Gesetz werden könnte. Lügen wäre unmoralisch, weil eine Welt, in der alle lügen, sich selbst zerstören würde – Lügen setzt Vertrauen voraus.",
        difficulty = 2,
        funFact = null
    ),

    // Question 8 – Kant: Erkenntnistheorie
    Question(
        categoryId = 11,
        questionText = "Was meinte Kant mit seiner 'kopernikanischen Wende' in der Philosophie?",
        answerA = "Die Erde dreht sich um die Sonne, nicht umgekehrt – eine revolutionäre Naturerkenntnis",
        answerB = "Nicht die Erkenntnis richtet sich nach den Gegenständen, sondern die Gegenstände richten sich nach unserer Erkenntnis",
        answerC = "Der Mensch steht nicht im Mittelpunkt des Universums, was seine Demut fordert",
        answerD = "Wissenschaft muss sich nach der Erfahrung richten, nicht nach Vernunftprinzipien",
        correctAnswer = 1, // B
        explanation = "Kant vollzog eine Revolution: Vor ihm fragte man, wie der Geist sich den Dingen anpasst. Kant drehte das um: Der menschliche Geist strukturiert die Erfahrung durch angeborene Kategorien (Raum, Zeit, Kausalität). Wir erkennen nie die 'Dinge an sich', sondern nur Erscheinungen durch unsere geistigen Strukturen.",
        difficulty = 2,
        funFact = "Kant verließ seine Heimatstadt Königsberg (heute Kaliningrad) nie und war dennoch einer der einflussreichsten Denker der Welt."
    ),

    // Question 9 – Hegel: Dialektik
    Question(
        categoryId = 11,
        questionText = "Wie beschreibt Hegels dialektisches Denken den Gang der Geschichte und des Geistes?",
        answerA = "Geschichte verläuft in Kreisen und kehrt immer zum Ausgangspunkt zurück",
        answerB = "These und Antithese werden in einer höheren Synthese aufgehoben, die dann neue These wird",
        answerC = "Fortschritt entsteht durch den Kampf materieller Klassen, nicht durch Ideen",
        answerD = "Der Geist erkennt sich selbst durch direkte Intuition, nicht durch Widersprüche",
        correctAnswer = 1, // B
        explanation = "Hegels Dialektik beschreibt einen dreistufigen Prozess: Eine These erzeugt ihren Widerspruch (Antithese). Beide werden in einer Synthese 'aufgehoben' – was bedeutet: bewahrt, verneint und auf eine höhere Ebene gehoben. Diese Synthese wird zur neuen These, und der Prozess beginnt erneut.",
        difficulty = 2,
        funFact = "Marx übernahm Hegels Dialektik, 'stellte sie aber vom Kopf auf die Füße' – statt Geist trieb für Marx die Materie (Wirtschaft) die Geschichte voran."
    ),

    // Question 10 – Nietzsche: Gott ist tot
    Question(
        categoryId = 11,
        questionText = "Was meinte Nietzsche mit seiner Aussage 'Gott ist tot', die er im 'Fröhlichen Wissenschaft' formulierte?",
        answerA = "Nietzsche war überzeugter Atheist und leugnete die Existenz Gottes wissenschaftlich",
        answerB = "Die moderne Wissenschaft und Aufklärung haben den christlichen Glauben als kollektive Grundlage der Moral zerstört",
        answerC = "Der Tod Jesu am Kreuz bedeutet das Ende aller religiösen Hoffnung für die Menschheit",
        answerD = "Gott hat sich aus der Welt zurückgezogen und greift nicht mehr in das Weltgeschehen ein",
        correctAnswer = 1, // B
        explanation = "Nietzsche diagnostizierte eine Krise der westlichen Zivilisation: Die Aufklärung und der Wissenschaftsglaube haben das Christentum als moralisches Fundament untergraben. 'Gott ist tot' ist keine Freudenbotschaft, sondern eine Warnung: Wenn die alte Moral wegfällt, braucht die Menschheit neue Werte – den 'Übermenschen'.",
        difficulty = 2,
        funFact = null
    ),

    // ── ETHIK & MORALPHILOSOPHIE ─────────────────────────────────────────────

    // Question 11 – Utilitarismus
    Question(
        categoryId = 11,
        questionText = "Was ist das Grundprinzip des Utilitarismus, wie ihn Jeremy Bentham und John Stuart Mill begründeten?",
        answerA = "Eine Handlung ist moralisch richtig, wenn sie der Natur entspricht",
        answerB = "Eine Handlung ist moralisch richtig, wenn sie das größtmögliche Glück für die größtmögliche Zahl von Wesen erzeugt",
        answerC = "Eine Handlung ist moralisch richtig, wenn sie der Pflicht gegenüber dem Staat entspricht",
        answerD = "Eine Handlung ist moralisch richtig, wenn sie aus tugendhaftem Charakter entspringt",
        correctAnswer = 1, // B
        explanation = "Der Utilitarismus ist eine konsequentialistische Ethiktheorie: Der Wert einer Handlung bemisst sich ausschließlich an ihren Folgen. Bentham entwickelte dafür sogar einen 'Hedokalkulist' zur Berechnung von Lust und Schmerz. Mill verfeinerte die Theorie, indem er qualitative Unterschiede zwischen Freuden einführte.",
        difficulty = 2,
        funFact = "Jeremy Benthams mumifizierter Körper (Auto-Ikone) sitzt noch heute in einem Glassarg im University College London und nimmt symbolisch an Vorstandssitzungen teil."
    ),

    // Question 12 – Stoische Philosophie
    Question(
        categoryId = 11,
        questionText = "Was ist das Kernprinzip der stoischen Philosophie bezüglich des menschlichen Glücks?",
        answerA = "Glück entsteht durch den Genuss sinnlicher Freuden im Maß der Vernunft",
        answerB = "Glück hängt einzig von innerer Tugend und dem Unterschied zwischen kontrollierbaren und nicht kontrollierbaren Dingen ab",
        answerC = "Glück ist die Harmonie mit der Gesellschaft und Erfüllung bürgerlicher Pflichten",
        answerD = "Wahres Glück ist unerreichbar – der Weise strebt nur nach Seelenruhe",
        correctAnswer = 1, // B
        explanation = "Die Stoiker lehrten, dass äußere Güter (Reichtum, Gesundheit, Ruhm) für das Glück irrelevant sind. Entscheidend ist die innere Einstellung. Unterscheide zwischen dem, was in deiner Macht steht (Urteile, Wünsche, Handlungen) und was nicht (Körper, Ruf, äußere Ereignisse). Tugend – das richtige innere Urteilen – ist das einzige wahre Gut.",
        difficulty = 2,
        funFact = null
    ),

    // Question 13 – Epikur
    Question(
        categoryId = 11,
        questionText = "Was lehrte Epikur über das Streben nach Glück, und was unterschied ihn von einer bloßen Lehre des Genusses?",
        answerA = "Epikur empfahl körperliche Lust als höchstes Gut, sofern sie sozial verträglich ist",
        answerB = "Epikur sah das höchste Gut in der Abwesenheit von Schmerz und Unruhe (Ataraxia), nicht in aktivem Genuss",
        answerC = "Epikur lehrte, dass Lust immer Schmerz nach sich zieht und daher zu meiden ist",
        answerD = "Epikur identifizierte das Glück mit der Erfüllung gesellschaftlicher Pflichten",
        correctAnswer = 1, // B
        explanation = "Epikur wurde oft als Hedonist missverstanden. Tatsächlich lehrte er, das höchste Glück sei Ataraxia (Seelenruhe) und Aponie (Schmerzfreiheit). Er bevorzugte einfache Freuden (Freundschaft, Philosophie, Garten) gegenüber intensiven, die oft Schmerzen nach sich ziehen. Sein Leitsatz: 'Lebe im Verborgenen.'",
        difficulty = 2,
        funFact = "Epikur gründete in Athen seinen berühmten 'Kepos' (Garten), in dem er mit Schülern lebte – darunter auch Frauen und Sklaven, was damals skandalös war."
    ),

    // Question 14 – Deontologie vs. Konsequentialismus
    Question(
        categoryId = 11,
        questionText = "Was unterscheidet deontologische Ethik (Pflichtethik) grundlegend vom Konsequentialismus?",
        answerA = "Deontologie bewertet Handlungen nach ihren Absichten und Pflichten, Konsequentialismus nach ihren Folgen",
        answerB = "Deontologie ist religiös begründet, Konsequentialismus ist weltlich",
        answerC = "Deontologie betrifft nur das Verhältnis zu anderen Menschen, Konsequentialismus auch zur Natur",
        answerD = "Deontologie gilt nur für öffentliche Handlungen, Konsequentialismus auch für private",
        correctAnswer = 0, // A
        explanation = "Der fundamentale Unterschied: Für Deontologen (z.B. Kant) ist eine Handlung moralisch richtig oder falsch unabhängig von ihren Konsequenzen – es geht um die Absicht und die Übereinstimmung mit moralischen Gesetzen. Konsequentialisten (z.B. Mill) bewerten ausschließlich die Folgen einer Handlung.",
        difficulty = 2,
        funFact = null
    ),

    // Question 15 – Tugendethik nach Aristoteles
    Question(
        categoryId = 11,
        questionText = "Was ist laut Aristoteles' Nikomachischer Ethik das höchste Ziel menschlichen Handelns?",
        answerA = "Die Erfüllung gesellschaftlicher Pflichten gegenüber dem Stadtstaat",
        answerB = "Die Eudaimonia – ein gelingendes, tugendhaftes Leben als Verwirklichung menschlicher Fähigkeiten",
        answerC = "Die Maximierung von Lust und die Minimierung von Schmerz",
        answerD = "Die Angleichung an göttliche Vollkommenheit durch Askese",
        correctAnswer = 1, // B
        explanation = "Eudaimonia (oft ungenau mit 'Glück' übersetzt) bedeutet für Aristoteles das Gedeihen des Menschen im vollen Sinne: die aktive Entfaltung aller spezifisch menschlichen Fähigkeiten, vor allem der Vernunft. Eudaimonia ist kein Gefühl, sondern eine Tätigkeit – ein Leben lang tugendhaft handeln.",
        difficulty = 2,
        funFact = "Das Wort Eudaimonia setzt sich zusammen aus 'eu' (gut) und 'daimon' (Geist/Seele) – wörtlich: einen guten Schutzgeist haben."
    ),

    // ── ERKENNTNISTHEORIE ────────────────────────────────────────────────────

    // Question 16 – Empirismus vs. Rationalismus
    Question(
        categoryId = 11,
        questionText = "Was ist der Grundunterschied zwischen Empirismus und Rationalismus als Erkenntnistheorien?",
        answerA = "Empirismus vertraut nur religiösen Quellen, Rationalismus nur wissenschaftlichen",
        answerB = "Empiristen sehen Sinneserfahrung als einzige Erkenntnisquelle, Rationalisten vertrauen der Vernunft als primärer Quelle",
        answerC = "Empirismus ist eine antike Lehre, Rationalismus eine neuzeitliche",
        answerD = "Empiristen glauben an Gott, Rationalisten sind Atheisten",
        correctAnswer = 1, // B
        explanation = "Der Empirismus (Locke, Hume, Berkeley) behauptet: 'Nichts ist im Verstand, was nicht zuvor in den Sinnen war.' Wissen entsteht durch Erfahrung. Der Rationalismus (Descartes, Leibniz, Spinoza) hält dagegen: Es gibt angeborene Ideen und Vernunftwahrheiten, die unabhängig von Erfahrung gelten.",
        difficulty = 2,
        funFact = null
    ),

    // Question 17 – Hume: Kausalität
    Question(
        categoryId = 11,
        questionText = "Warum zweifelte David Hume an der Realität der Kausalität ('Ursache und Wirkung')?",
        answerA = "Weil Gott das einzige wahre Kausalitätsprinzip ist und Menschen dies nicht erkennen können",
        answerB = "Weil wir nur Abfolgen von Ereignissen beobachten, nie aber die notwendige Verbindung zwischen Ursache und Wirkung selbst",
        answerC = "Weil die Naturgesetze sich ständig ändern und keine verlässlichen Aussagen erlauben",
        answerD = "Weil Kausalität ein mathematisches Konstrukt ist, das auf die Wirklichkeit nicht zutrifft",
        correctAnswer = 1, // B
        explanation = "Hume analysierte: Wenn Billardkugel A Kugel B trifft, sehen wir (1) zeitliche Abfolge und (2) räumliche Berührung. Aber die 'notwendige Verbindung' – dass A B bewegen MUSS – sehen wir nie direkt. Kausalität ist laut Hume nur eine Erwartung aus Gewohnheit, keine logische Notwendigkeit.",
        difficulty = 2,
        funFact = "Kant sagte, Humes Skeptizismus habe ihn aus seinem 'dogmatischen Schlummer' geweckt und zur Kritik der reinen Vernunft geführt."
    ),

    // Question 18 – Locke: Tabula rasa
    Question(
        categoryId = 11,
        questionText = "Was meinte John Locke mit dem Begriff 'Tabula rasa' bezüglich des menschlichen Geistes?",
        answerA = "Der Mensch hat ein fehlerloses Gedächtnis, das wie eine beschreibbare Tafel alles speichert",
        answerB = "Der menschliche Geist ist bei der Geburt ein unbeschriebenes Blatt, auf dem Erfahrungen erst Wissen einschreiben",
        answerC = "Moralische Grundsätze sind universal und unveränderlich wie in Stein gemeißelt",
        answerD = "Leeres Denken ohne Inhalt ist der Ausgangspunkt der Philosophie",
        correctAnswer = 1, // B
        explanation = "Locke argumentierte gegen angeborene Ideen: Der Geist ist bei Geburt leer wie eine unbeschriebene Wachstafel. Alle Inhalte des Geistes – Ideen – stammen aus Sinneserfahrungen (sensation) oder aus Selbstbeobachtung (reflection). Diese empiristische Position hatte enorme Auswirkungen auf Pädagogik und politische Theorie.",
        difficulty = 2,
        funFact = null
    ),

    // Question 19 – Platons Erkenntnistheorie
    Question(
        categoryId = 11,
        questionText = "Was unterschied für Platon 'Episteme' (Wissen) von 'Doxa' (Meinung)?",
        answerA = "Episteme ist persönliches Erfahrungswissen, Doxa ist kollektiv überliefertes Wissen",
        answerB = "Episteme ist unveränderliches Wissen über die ewigen Ideen, Doxa ist unsicheres Meinen über die Sinneswelt",
        answerC = "Episteme bezeichnet wissenschaftliches Wissen, Doxa philosophisches Denken",
        answerD = "Episteme kann gelehrt werden, Doxa ist intuitiv und nicht vermittelbar",
        correctAnswer = 1, // B
        explanation = "Platon ordnete Erkenntnisweisen hierarchisch: Doxa (Meinung) betrifft die veränderliche Sinneswelt und ist unsicher. Episteme (Wissen) betrifft die ewigen, unveränderlichen Ideen und ist absolut gewiss. Dazwischen liegt die Dianoia (mathematisches Denken). Nur der Philosoph kann zur Episteme aufsteigen.",
        difficulty = 2,
        funFact = "Das Wort 'Epistemologie' (Erkenntnistheorie) leitet sich direkt von Platons Begriff 'Episteme' ab."
    ),

    // Question 20 – Skeptizismus
    Question(
        categoryId = 11,
        questionText = "Was ist der philosophische Skeptizismus, und welche radikale Schlussfolgerung zieht der Pyrrhonismus daraus?",
        answerA = "Skeptizismus zweifelt an allem Wissen; der Pyrrhonismus fordert daher vollständige Urteilsenthaltung (Epoché)",
        answerB = "Skeptizismus lehnt Religion ab; der Pyrrhonismus begründet einen wissenschaftlichen Materialismus",
        answerC = "Skeptizismus zweifelt an der Sinneserfahrung; der Pyrrhonismus vertraut daher nur der reinen Vernunft",
        answerD = "Skeptizismus bezweifelt die Existenz anderer Menschen; der Pyrrhonismus endet im Solipsismus",
        correctAnswer = 0, // A
        explanation = "Der Pyrrhonismus (nach Pyrrhon von Elis) ist der radikalste Skeptizismus: Da wir keine sichere Erkenntnis über die Wirklichkeit erlangen können, sollten wir zu allen Fragen die Urteilsenthaltung (Epoché) praktizieren. Das führt zur Ataraxia – Seelenruhe durch Aufhören zu urteilen.",
        difficulty = 2,
        funFact = null
    ),

    // ── METAPHYSIK & ONTOLOGIE ───────────────────────────────────────────────

    // Question 21 – Ontologie
    Question(
        categoryId = 11,
        questionText = "Was untersucht die Ontologie als Teilgebiet der Metaphysik?",
        answerA = "Die Entwicklung des menschlichen Bewusstseins im Laufe des Lebens",
        answerB = "Das Sein als solches – die grundlegenden Strukturen und Kategorien alles Existierenden",
        answerC = "Die Entstehung des Universums aus naturwissenschaftlicher Perspektive",
        answerD = "Die moralischen Grundlagen menschlichen Handelns",
        correctAnswer = 1, // B
        explanation = "Ontologie (von griech. 'on' = Seiendes) ist die Lehre vom Sein. Sie fragt: Was gibt es überhaupt? Was bedeutet es, zu existieren? Welche grundlegenden Kategorien beschreiben alles Seiende? Aristoteles nannte sie 'erste Philosophie' – die Untersuchung des Seienden als Seiendem.",
        difficulty = 2,
        funFact = "Der Begriff 'Ontologie' wurde erst im 17. Jahrhundert geprägt, obwohl die Fragen so alt wie die Philosophie sind."
    ),

    // Question 22 – Leibniz: Monaden
    Question(
        categoryId = 11,
        questionText = "Was sind Leibniz' 'Monaden', und warum sind sie 'fensterlos'?",
        answerA = "Elementarteilchen der Materie, die keine elektrischen Ladungen tragen",
        answerB = "Unteilbare geistige Grundsubstanzen, die keine Wechselwirkung mit anderen Monaden haben und von Gott prästabiliert sind",
        answerC = "Mathematische Punkte ohne Ausdehnung, aus denen der Raum aufgebaut ist",
        answerD = "Unsterbliche Seelen, die nach dem Tod in neue Körper eintreten",
        correctAnswer = 1, // B
        explanation = "Für Leibniz besteht die Wirklichkeit aus unzähligen unteilbaren Monaden – geistartigen Substanzen. Sie sind 'fensterlos', weil sie nicht direkt mit anderen Monaden interagieren. Dennoch stimmen sie harmonisch überein, weil Gott sie so erschaffen hat, dass sie wie Uhren synchron laufen (prästabilierte Harmonie).",
        difficulty = 2,
        funFact = null
    ),

    // Question 23 – Spinoza: Deus sive Natura
    Question(
        categoryId = 11,
        questionText = "Was meinte Spinoza mit dem Satz 'Deus sive Natura' (Gott oder Natur)?",
        answerA = "Gott und Natur sind zwei gleichwertige Erklärungsprinzipien, zwischen denen man wählen kann",
        answerB = "Gott und Natur sind ein und dieselbe einzige Substanz – Spinozas Pantheismus",
        answerC = "Die Natur ist ein Beweis für Gottes Existenz durch das Argument der Schöpfung",
        answerD = "Naturreligion ist die ursprünglichste Form des Gottesglaubens",
        correctAnswer = 1, // B
        explanation = "Spinoza war einer der ersten westlichen Denker, der einen konsequenten Pantheismus formulierte: Es gibt nur eine einzige unendliche Substanz – Gott oder die Natur (dasselbe). Alles Einzelne ist nur ein Modus dieser einen Substanz. Diese Lehre wurde damals als Atheismus verurteilt und Spinoza aus seiner jüdischen Gemeinde ausgestoßen.",
        difficulty = 2,
        funFact = "Spinoza verdiente seinen Lebensunterhalt als Linsenschleifer für Mikroskope und Teleskope – ein bescheidenes Leben entsprechend seiner Philosophie."
    ),

    // Question 24 – Heidegger: Sein und Zeit
    Question(
        categoryId = 11,
        questionText = "Was meinte Heidegger mit dem Begriff 'Dasein' in seinem Werk 'Sein und Zeit'?",
        answerA = "Die physische Existenz aller materiellen Dinge in Raum und Zeit",
        answerB = "Den Menschen als das Seiende, das sich um sein eigenes Sein sorgt und Sein überhaupt versteht",
        answerC = "Den Bewusstseinszustand im gegenwärtigen Augenblick, fernab von Vergangenheit und Zukunft",
        answerD = "Die Gesamtheit aller seienden Dinge im Universum",
        correctAnswer = 1, // B
        explanation = "Heidegger analysierte die menschliche Existenz mit dem Begriff 'Dasein' (wörtlich: Da-Sein). Das Dasein ist das einzige Seiende, das sich um sein eigenes Sein kümmert und überhaupt die Frage nach dem Sein stellen kann. Sein und Zeit analysiert Grundstrukturen des Daseins: Geworfenheit, Sorge, Sein-zum-Tode.",
        difficulty = 2,
        funFact = null
    ),

    // Question 25 – Theodizee
    Question(
        categoryId = 11,
        questionText = "Was versucht die Theodizee in der Religionsphilosophie zu lösen?",
        answerA = "Die Frage, ob Gott bewiesen werden kann oder nur geglaubt werden muss",
        answerB = "Den Widerspruch zwischen einem allmächtigen, allwissenden, gütigen Gott und der Existenz von Leid und Übel in der Welt",
        answerC = "Die Vereinbarkeit verschiedener Weltreligionen in einer gemeinsamen Gottesvorstellung",
        answerD = "Die philosophische Begründung für religiöse Moral ohne Rückgriff auf Offenbarung",
        correctAnswer = 1, // B
        explanation = "Das Theodizeeproblem (griech. theos = Gott, dike = Gerechtigkeit) fragt: Wenn Gott allmächtig, allwissend und vollkommen gut ist – warum gibt es dann Leid, Krankheit und Böses? Leibniz prägte den Begriff und argumentierte, wir leben in der 'besten aller möglichen Welten'. Voltaire verspottete dies in 'Candide' nach dem Lissaboner Erdbeben 1755.",
        difficulty = 2,
        funFact = "Das Lissaboner Erdbeben von 1755 mit 60.000 Toten erschütterte nicht nur Gebäude, sondern auch den philosophischen Optimismus ganz Europas."
    ),

    // ── POLITISCHE PHILOSOPHIE ───────────────────────────────────────────────

    // Question 26 – Hobbes: Leviathan
    Question(
        categoryId = 11,
        questionText = "Wie beschrieb Thomas Hobbes das Leben der Menschen im 'Naturzustand' ohne staatliche Ordnung?",
        answerA = "Als einen Zustand ursprünglicher Harmonie und natürlicher Güte des Menschen",
        answerB = "Als einen Krieg aller gegen alle, in dem das Leben 'einsam, arm, hässlich, tierisch und kurz' ist",
        answerC = "Als einen Zustand friedlicher Anarchie, der durch natürliche Vernunft geordnet wird",
        answerD = "Als den glücklichsten Zustand der Menschheit, bevor Eigentum Ungleichheit schuf",
        correctAnswer = 1, // B
        explanation = "Hobbes argumentierte in seinem 'Leviathan' (1651): Ohne Staat herrscht der Naturzustand – ein Krieg aller gegen alle (bellum omnium contra omnes). Um dem zu entkommen, schließen Menschen einen Gesellschaftsvertrag und übertragen alle Macht an einen absoluten Souverän (den Leviathan), der Sicherheit garantiert.",
        difficulty = 2,
        funFact = null
    ),

    // Question 27 – Rousseau: Gesellschaftsvertrag
    Question(
        categoryId = 11,
        questionText = "Was verstand Rousseau unter dem 'Gesellschaftsvertrag' und dem 'Gemeinwillen' (volonté générale)?",
        answerA = "Ein wirtschaftlicher Vertrag zwischen Bürgern zum Schutz des Eigentums",
        answerB = "Eine freiwillige Vereinigung, durch die der Einzelne dem Gemeinwillen folgt, der das wahre Interesse aller ausdrückt",
        answerC = "Ein Vertrag zwischen König und Adel zur gegenseitigen Machtbegrenzung",
        answerD = "Die Mehrheitsmeinung der Bevölkerung, die durch Wahlen ermittelt wird",
        correctAnswer = 1, // B
        explanation = "Rousseau unterschied den 'Willen aller' (Summe der Einzelinteressen) vom 'Gemeinwillen' (volonté générale), der das wahre Interesse der Gemeinschaft ausdrückt. Im Gesellschaftsvertrag gibt jeder seine natürliche Freiheit auf, gewinnt aber bürgerliche Freiheit zurück. Der Gemeinwille kann nie irren – aber die Menschen können ihn verkennen.",
        difficulty = 2,
        funFact = "Rousseaus Ideen wurden von den Jakobinern der Französischen Revolution begeistert aufgegriffen – was zu Terrorherrschaft führte, die er wohl nicht gewollt hätte."
    ),

    // Question 28 – Locke: Gewaltenteilung
    Question(
        categoryId = 11,
        questionText = "Welches politische Grundprinzip entwickelte John Locke in seinen 'Zwei Abhandlungen über die Regierung', das die moderne Demokratie prägte?",
        answerA = "Die Herrschaft der besten Bürger (Aristokratie) als gerechteste Staatsform",
        answerB = "Das Recht auf Revolution, wenn die Regierung die natürlichen Rechte auf Leben, Freiheit und Eigentum verletzt",
        answerC = "Die göttliche Legitimation des Königtums durch das Naturrecht",
        answerD = "Die Notwendigkeit eines absoluten Souveräns für gesellschaftlichen Frieden",
        correctAnswer = 1, // B
        explanation = "Locke war Wegbereiter des Liberalismus: Menschen haben unveräußerliche Naturrechte (Leben, Freiheit, Eigentum). Der Staat entsteht durch einen Vertrag zum Schutz dieser Rechte. Verletzt die Regierung diese Rechte, haben die Bürger das Recht auf Widerstand und Revolution. Diese Ideen prägten die Amerikanische und Französische Revolution.",
        difficulty = 2,
        funFact = null
    ),

    // Question 29 – Marx: Historischer Materialismus
    Question(
        categoryId = 11,
        questionText = "Was verstand Marx unter 'Entfremdung' in der kapitalistischen Produktionsweise?",
        answerA = "Die psychologische Isolation des Menschen in anonymen Großstädten",
        answerB = "Den Verlust des Arbeiters an seinem Produkt, seiner Tätigkeit und seinem menschlichen Wesen durch die kapitalistische Warenproduktion",
        answerC = "Die politische Entfremdung des Bürgers von demokratischen Entscheidungsprozessen",
        answerD = "Die religiöse Entfremdung durch falsche Gottesvorstellungen",
        correctAnswer = 1, // B
        explanation = "Marx analysierte: Im Kapitalismus produziert der Arbeiter Waren, die ihm gehören nicht. Er ist entfremdet vom Produkt (gehört dem Kapitalisten), von der Tätigkeit (erzwungene Arbeit, nicht selbstbestimmte Schöpfung), von der Gattung (Mensch als 'Gattungswesen' unterdrückt) und von anderen Menschen (Konkurrenz statt Solidarität).",
        difficulty = 2,
        funFact = "Marx' Frühschriften mit der Entfremdungstheorie wurden erst 1932 veröffentlicht – lange nach seinem Tod – und revolutionierten die Marx-Interpretation."
    ),

    // Question 30 – Rawls: Schleier des Nichtwissens
    Question(
        categoryId = 11,
        questionText = "Was ist John Rawls' 'Schleier des Nichtwissens' (veil of ignorance) in seiner Gerechtigkeitstheorie?",
        answerA = "Eine Metapher für staatliche Geheimnistuerei und mangelnde politische Transparenz",
        answerB = "Ein Gedankenexperiment, in dem Menschen faire Regeln wählen, ohne zu wissen, welche Position sie in der Gesellschaft einnehmen werden",
        answerC = "Das Unwissen der Bevölkerung über politische Sachverhalte als Ursache von Ungerechtigkeit",
        answerD = "Der moralische Relativismus, der keine objektiven Gerechtigkeitsprinzipien anerkennt",
        correctAnswer = 1, // B
        explanation = "Rawls' 'Theorie der Gerechtigkeit' (1971): Stell dir vor, du entwirfst Gesellschaftsregeln hinter einem 'Schleier des Nichtwissens' – du weißt nicht, ob du reich oder arm, begabt oder weniger begabt sein wirst. Dann wählen vernünftige Menschen Regeln, die auch die Schwächsten schützen (Differenzprinzip).",
        difficulty = 2,
        funFact = null
    ),

    // ── PHILOSOPHEN & IHRE WERKE ─────────────────────────────────────────────

    // Question 31 – Sokrates: Tod
    Question(
        categoryId = 11,
        questionText = "Warum wurde Sokrates im Jahr 399 v. Chr. zum Tode verurteilt?",
        answerA = "Wegen Hochverrats und Verschwörung gegen die demokratische Regierung Athens",
        answerB = "Wegen Gottlosigkeit (Asebie) und der Verführung der Jugend durch seine philosophischen Fragen",
        answerC = "Wegen seiner Sympathien für Sparta während des Peloponnesischen Krieges",
        answerD = "Wegen seiner Weigerung, als Heerführer zu dienen und Athen zu verteidigen",
        correctAnswer = 1, // B
        explanation = "Sokrates wurde angeklagt, die Götter Athens zu missachten und die Jugend zu verderben. Er nutzte seinen Prozess nicht zur Verteidigung, sondern zur weiteren Philosophie. Er lehnte die Möglichkeit ab zu fliehen und trank freiwillig den Schierlingsbecher – als Zeugnis für seine Überzeugung, dass das philosophische Leben dem Tod vorzuziehen sei.",
        difficulty = 2,
        funFact = "Da Sokrates nichts schrieb, kennen wir seine Philosophie fast ausschließlich durch Platon und Xenophon – was das 'Sokratische Problem' aufwirft: Was lehrte Sokrates wirklich?"
    ),

    // Question 32 – Nietzsche: Übermensch
    Question(
        categoryId = 11,
        questionText = "Was meinte Nietzsche mit dem Konzept des 'Übermenschen' in 'Also sprach Zarathustra'?",
        answerA = "Ein biologisch überlegener Mensch, der durch Selektion und Züchtung entstehen soll",
        answerB = "Ein Mensch, der über die christliche Sklavenmoral hinausgeht und eigenständig neue Werte schafft",
        answerC = "Ein Genie, das durch intellektuelle Überlegenheit die Masse führt",
        answerD = "Ein zukünftiger Mensch, der durch Technologie unsterblich wird",
        correctAnswer = 1, // B
        explanation = "Nietzsche sah die traditionelle Moral als 'Sklavenmoral' – eine Erfindung der Schwachen, um die Starken zu zähmen. Der Übermensch geht darüber hinaus: Er schafft eigene Werte durch seinen 'Willen zur Macht' (als kreative Selbstgestaltung, nicht politische Herrschaft). Nietzsche kritisierte ausdrücklich jeden rassistischen Missbrauch seiner Ideen.",
        difficulty = 2,
        funFact = "Nietzsche hasste den deutschen Nationalismus und Antisemitismus – seine Schwester Elisabeth fälschte nach seinem Tod teile seiner Briefe, um ihn als Nazi-Vordenker darzustellen."
    ),

    // Question 33 – Schopenhauer: Wille
    Question(
        categoryId = 11,
        questionText = "Was ist nach Schopenhauer das innerste Wesen der Welt hinter allen Erscheinungen?",
        answerA = "Der göttliche Geist, der sich in der Natur offenbart",
        answerB = "Ein blinder, ziellos strebender Wille als irrationale Grundkraft alles Seienden",
        answerC = "Die Vernunft als rationales Ordnungsprinzip des Universums",
        answerD = "Die Liebe als kosmische Kraft, die alles zusammenhält",
        correctAnswer = 1, // B
        explanation = "Schopenhauer argumentierte: Hinter der Erscheinungswelt (Kants Welt der Phänomene) liegt ein einziger blinder, irrationaler Wille zum Leben als Ding an sich. Alles – Gravitation, Triebe, Gedanken – ist Ausdruck dieses ständig strebenden, nie erfüllten Willens. Da der Wille nie befriedigt werden kann, ist Leiden das Grundprinzip der Existenz.",
        difficulty = 2,
        funFact = null
    ),

    // Question 34 – Wittgenstein: Sprachspiele
    Question(
        categoryId = 11,
        questionText = "Was verstand Wittgenstein in seinen 'Philosophischen Untersuchungen' unter 'Sprachspielen'?",
        answerA = "Wortspiele und rhetorische Figuren, die philosophische Argumente verschleiern",
        answerB = "Verschiedene regelgeleitete Formen menschlicher Kommunikation, eingebettet in Lebensformen und Praktiken",
        answerC = "Formalisierte logische Kalküle zur präzisen philosophischen Argumentation",
        answerD = "Kinderspiele mit Sprache, an denen man grundlegende Regeln der Logik erlernt",
        correctAnswer = 1, // B
        explanation = "Wittgensteins späte Philosophie (Sprachspiele, Lebensformen) brach mit seinen früheren Ansichten. Sprache hat keine einheitliche Essenz – es gibt unzählige 'Sprachspiele' (befehlen, beschreiben, erzählen, beten, fluchen...), die alle eigenen Regeln folgen. Bedeutung ist kein mentales Bild, sondern Gebrauch in einem Kontext.",
        difficulty = 2,
        funFact = "Wittgensteins 'Tractatus logico-philosophicus' endet mit dem Satz: 'Wovon man nicht sprechen kann, darüber muss man schweigen.'"
    ),

    // Question 35 – Simone de Beauvoir
    Question(
        categoryId = 11,
        questionText = "Was bedeutet de Beauvoirs berühmter Satz 'Man kommt nicht als Frau zur Welt, man wird es'?",
        answerA = "Biologische Unterschiede zwischen Mann und Frau sind keine natürlichen Tatsachen, sondern Mythen",
        answerB = "Das 'Weibliche' ist keine biologische Gegebenheit, sondern eine gesellschaftlich konstruierte Rolle, die aufgezwungen wird",
        answerC = "Frauen müssen durch Erziehung und Bildung erst zu vollwertigen Menschen werden",
        answerD = "Geschlechtsidentität entwickelt sich erst in der Pubertät durch hormonelle Veränderungen",
        correctAnswer = 1, // B
        explanation = "In 'Das andere Geschlecht' (1949) analysierte de Beauvoir: Die Gesellschaft definiert die Frau als das 'Andere', als Abweichung vom männlichen Norm-Menschen. Weiblichkeit ist keine Natur, sondern eine soziale Konstruktion, durch Erziehung, Rollenerwartungen und Mythen aufgezwungen. Dieser Satz begründete den modernen Feminismus.",
        difficulty = 2,
        funFact = null
    ),

    // ── PHILOSOPHISCHE STRÖMUNGEN ────────────────────────────────────────────

    // Question 36 – Existentialismus
    Question(
        categoryId = 11,
        questionText = "Was ist der Kerngedanke des Existentialismus, wie ihn Jean-Paul Sartre formulierte?",
        answerA = "Die Existenz des Menschen ist durch seine biologische Natur und Instinkte vorbestimmt",
        answerB = "Die Existenz geht der Essenz voraus – der Mensch schafft sich selbst durch seine freien Entscheidungen",
        answerC = "Der Sinn des Lebens liegt in der Erfüllung gesellschaftlich vorgegebener Rollen",
        answerD = "Die Grundangst vor dem Tod bestimmt alle menschlichen Handlungen",
        correctAnswer = 1, // B
        explanation = "Sartres Kernsatz 'Die Existenz geht der Essenz voraus' bedeutet: Anders als ein Hammer (erst der Entwurf, dann das Ding) gibt es beim Menschen kein vorgegebenes Wesen. Wir werden ins Dasein geworfen ohne Zweck und müssen unsere Essenz – wer wir sind – erst durch freie Entscheidungen selbst schaffen. Das ist erschreckend: radikale Freiheit und totale Verantwortung.",
        difficulty = 2,
        funFact = "Sartre lehnte den Nobelpreis für Literatur 1964 ab – er wollte keine institutionelle Ehrung, die seine intellektuelle Unabhängigkeit kompromittieren könnte."
    ),

    // Question 37 – Phänomenologie
    Question(
        categoryId = 11,
        questionText = "Was ist das Grundanliegen der Phänomenologie, wie sie Edmund Husserl begründete?",
        answerA = "Die Beschreibung physikalischer Phänomene mit mathematischen Methoden",
        answerB = "Die vorurteilslose Beschreibung von Bewusstseinserlebnissen, wie sie sich direkt zeigen, ohne theoretische Vorannahmen",
        answerC = "Die Analyse sozialer Phänomene durch teilnehmende Beobachtung",
        answerD = "Die Erforschung übersinnlicher Phänomene mit wissenschaftlichen Methoden",
        correctAnswer = 1, // B
        explanation = "Husserl wollte Philosophie zur 'strengen Wissenschaft' machen. Die Phänomenologie beschreibt das Bewusstsein 'von innen': Wie zeigen sich Dinge dem Bewusstsein? Dabei wird die 'natürliche Einstellung' (Alltagsglaube an die Außenwelt) durch die 'epoché' eingeklammert. Husserls Schüler Heidegger und Sartre entwickelten die Methode weiter.",
        difficulty = 2,
        funFact = null
    ),

    // Question 38 – Pragmatismus
    Question(
        categoryId = 11,
        questionText = "Was ist das Grundprinzip des Pragmatismus als amerikanischer Philosophietradition?",
        answerA = "Wahrheit ist das, was von einer Mehrheit der Menschen für wahr gehalten wird",
        answerB = "Der Wahrheitswert einer Idee bemisst sich an ihren praktischen Konsequenzen und ihrem Nutzen für das Handeln",
        answerC = "Philosophie sollte sich auf pragmatische Alltagsprobleme beschränken und abstrakte Fragen meiden",
        answerD = "Wissen ist nur dann sicher, wenn es sich in der Praxis bewährt hat und experimentell wiederholbar ist",
        correctAnswer = 1, // B
        explanation = "Der Pragmatismus (Peirce, James, Dewey) entstand in den USA als Alternative zur europäischen Metaphysik. William James formulierte: Eine Idee ist 'wahr', wenn sie sich im Denken und Handeln bewährt. 'What is its cash value?' Der Pragmatismus fragte nie 'Was ist Wahrheit an sich?', sondern 'Wozu nützt diese Überzeugung?'",
        difficulty = 2,
        funFact = "William James, Begründer des amerikanischen Pragmatismus, war auch Bruder des Romanciers Henry James – eine bemerkenswert philosophische Familie."
    ),

    // Question 39 – Frankfurter Schule
    Question(
        categoryId = 11,
        questionText = "Wofür steht die 'Frankfurter Schule' (Kritische Theorie), und welche bekannten Denker gehören ihr an?",
        answerA = "Eine wirtschaftswissenschaftliche Schule für liberale Markttheorien mit Hayek und Friedman",
        answerB = "Eine marxistisch beeinflusste Gesellschaftstheorie mit Horkheimer, Adorno und Habermas, die Kapitalismus und Kultur kritisch analysiert",
        answerC = "Eine analytische Philosophietradition, die sich auf Sprachanalyse und formale Logik konzentriert",
        answerD = "Eine existentialistische Schule in der Nachfolge Heideggers mit Schwerpunkt auf Angst und Freiheit",
        correctAnswer = 1, // B
        explanation = "Die Kritische Theorie des Frankfurter Instituts für Sozialforschung (ab 1930) verband Marx mit Freud und analysierte, warum die erhoffte Revolution ausblieb. Horkheimer/Adorno kritisierten die 'Dialektik der Aufklärung' – Vernunft kann in Herrschaft umschlagen. Habermas entwickelte die Theorie kommunikativen Handelns als Weiterführung.",
        difficulty = 2,
        funFact = null
    ),

    // Question 40 – Analytische Philosophie
    Question(
        categoryId = 11,
        questionText = "Was kennzeichnet die analytische Philosophie im Vergleich zur kontinentaleuropäischen Tradition?",
        answerA = "Sie beschäftigt sich ausschließlich mit naturwissenschaftlichen Fragen",
        answerB = "Sie betont logische Präzision, Sprachanalyse und argumentative Klarheit statt großer weltanschaulicher Systeme",
        answerC = "Sie lehnt die Metaphysik als sinnlos ab und beschränkt sich auf Empirisches",
        answerD = "Sie hat ihren Ursprung in der amerikanischen Philosophie des 19. Jahrhunderts",
        correctAnswer = 1, // B
        explanation = "Die analytische Philosophie (entstanden mit Frege, Russell, Wittgenstein in Cambridge) betont Klarheit, Präzision und logische Strenge. Philosophische Probleme entstehen oft durch Sprachverwirrung – Analyse der Sprache löst sie auf. Im Gegensatz dazu betonen die Kontinentaleuropäer (Heidegger, Sartre, Derrida) existenzielle und gesellschaftliche Themen.",
        difficulty = 2,
        funFact = "Der berühmteste Streit zwischen beiden Traditionen: Als Wittgenstein und Popper sich 1946 in Cambridge trafen, soll Wittgenstein Popper mit einem Feuerhaken gedroht haben – der 'Feuerhaken-Zwischenfall'."
    ),

    // ── ALLGEMEINE PHILOSOPHIE ───────────────────────────────────────────────

    // Question 41 – Philosophische Disziplinen
    Question(
        categoryId = 11,
        questionText = "Welche vier klassischen Hauptdisziplinen der Philosophie gibt es, und womit befasst sich die 'Ästhetik'?",
        answerA = "Ethik, Logik, Metaphysik, Ästhetik – Ästhetik befasst sich mit schöner Kleidung und Mode",
        answerB = "Ethik, Logik, Erkenntnistheorie, Ästhetik – Ästhetik befasst sich mit dem Wesen des Schönen, der Kunst und sinnlicher Wahrnehmung",
        answerC = "Ontologie, Epistemologie, Hermeneutik, Ästhetik – Ästhetik befasst sich mit sensorischer Wahrnehmung in der Psychologie",
        answerD = "Ethik, Rhetorik, Dialektik, Ästhetik – Ästhetik befasst sich mit der Rhetorik in der Kunst",
        correctAnswer = 1, // B
        explanation = "Die klassischen philosophischen Disziplinen sind: Metaphysik (Was ist wirklich?), Erkenntnistheorie (Was können wir wissen?), Ethik (Was sollen wir tun?) und Logik (Was folgt woraus?). Die Ästhetik als Lehre vom Schönen und der Kunst kam als eigenständige Disziplin erst im 18. Jahrhundert hinzu – Baumgarten prägte 1750 den Begriff.",
        difficulty = 2,
        funFact = null
    ),

    // Question 42 – Sokrates' Zitat
    Question(
        categoryId = 11,
        questionText = "Was bedeutet Sokrates' Aussage 'Ich weiß, dass ich nichts weiß' im philosophischen Kontext?",
        answerA = "Sokrates gestand seine intellektuelle Schwäche ein und empfahl Bescheidenheit",
        answerB = "Das Bewusstsein der eigenen Unwissenheit ist der erste Schritt zur Weisheit und überlegen dem Wahn des Wissens",
        answerC = "Philosophie kann zu keinen gesicherten Ergebnissen kommen und ist deshalb nutzlos",
        answerD = "Sokrates formulierte damit sein Misstrauen gegenüber schriftlichem Wissen",
        correctAnswer = 1, // B
        explanation = "Sokrates galt laut dem Orakel von Delphi als weisester Mensch Athens. Sein Vorteil gegenüber anderen: Er wusste, dass er nichts weiß – während andere glaubten zu wissen, ohne es wirklich zu können. Dieses Bewusstsein der eigenen Unwissenheit (docta ignorantia) treibt das Philosophieren erst an.",
        difficulty = 2,
        funFact = "Genau genommen sagte Sokrates laut Platon: 'Ich weiß, dass ich nicht weiß' – ein feiner Unterschied, der zeigt, dass er auch über sein Nichtwissen Bescheid wusste."
    ),

    // Question 43 – Philosophie und Wissenschaft
    Question(
        categoryId = 11,
        questionText = "Was unterscheidet philosophische Fragen grundlegend von empirisch-wissenschaftlichen Fragen?",
        answerA = "Philosophie beschäftigt sich ausschließlich mit der Vergangenheit, Wissenschaft mit der Gegenwart",
        answerB = "Philosophische Fragen sind normative oder begriffliche Fragen, die nicht allein durch Experimente beantwortet werden können",
        answerC = "Philosophie stellt überprüfbare Hypothesen auf, wertet aber keine Daten aus",
        answerD = "Wissenschaft beschäftigt sich mit der materiellen Welt, Philosophie nur mit der geistigen",
        correctAnswer = 1, // B
        explanation = "Wissenschaft beantwortet empirische Fragen: Was ist der Fall? (durch Beobachtung und Experiment). Philosophie beantwortet begriffliche Fragen (Was meinen wir mit 'Wissen'?) und normative Fragen (Was sollte sein?). Diese können nicht durch Experimente gelöst werden. Viele Wissenschaften begannen als Philosophie – Physik war einst 'Naturphilosophie'.",
        difficulty = 2,
        funFact = null
    ),

    // Question 44 – Hermeneutik
    Question(
        categoryId = 11,
        questionText = "Was ist der 'hermeneutische Zirkel', wie ihn Gadamer in 'Wahrheit und Methode' beschrieb?",
        answerA = "Ein logischer Fehler, bei dem eine These durch sich selbst bewiesen wird",
        answerB = "Das Verhältnis zwischen Teil und Ganzem beim Textverstehen: Das Ganze versteht man aus Teilen, die Teile nur aus dem Ganzen",
        answerC = "Die kreisförmige Methode des Philosophierens durch Dialog und Gegendialog",
        answerD = "Ein Denkfehler, bei dem Interpretation und Interpretation sich wechselseitig bestätigen",
        correctAnswer = 1, // B
        explanation = "Die Hermeneutik (Lehre vom Verstehen und Interpretieren) beschreibt: Um einen Text zu verstehen, muss ich einzelne Stellen kennen; um einzelne Stellen zu verstehen, muss ich das Ganze kennen. Dieser 'hermeneutische Zirkel' ist kein Fehler, sondern die Struktur allen Verstehens – man nähert sich dem Text spiralförmig an.",
        difficulty = 2,
        funFact = "Hermeneutik stammt von Hermes ab – dem Götterboten, der die Botschaften der Götter den Menschen 'übersetzt'."
    ),

    // Question 45 – Philosophie des Geistes
    Question(
        categoryId = 11,
        questionText = "Was ist das 'Leib-Seele-Problem' (mind-body problem) in der Philosophie des Geistes?",
        answerA = "Die ethische Frage, ob es moralisch erlaubt ist, den menschlichen Körper für Transplantationen zu nutzen",
        answerB = "Die Frage, wie sich mentale Zustände (Gedanken, Gefühle) zu physischen Gehirnzuständen verhalten",
        answerC = "Die medizinische Frage nach der Verbindung zwischen psychischer und körperlicher Gesundheit",
        answerD = "Die theologische Frage nach der Unsterblichkeit der Seele nach dem Körpertod",
        correctAnswer = 1, // B
        explanation = "Das Leib-Seele-Problem: Wie hängen Geist und Körper zusammen? Descartes war Dualist – Geist (res cogitans) und Körper (res extensa) sind verschiedene Substanzen. Aber wie interagieren sie? Moderne Positionen: Physikalismus (Geist = Gehirnzustände), Funktionalismus, Emergentismus, Epiphänomenalismus.",
        difficulty = 2,
        funFact = null
    ),

    // ── WEITERE KLASSIKER & THEMEN ───────────────────────────────────────────

    // Question 46 – Vorsokratiker: Thales
    Question(
        categoryId = 11,
        questionText = "Was gilt Thales von Milet (624–546 v. Chr.) in der Philosophiegeschichte als erstes?",
        answerA = "Der erste Mathematiker, der den Satz des Pythagoras bewies",
        answerB = "Der erste Philosoph des Abendlandes, der nach einem rationalen Urprinzip (Wasser) hinter den Erscheinungen suchte",
        answerC = "Der erste Astronom, der den Lauf der Sterne in einem Kalender aufzeichnete",
        answerD = "Der erste Politiker, der eine demokratische Verfassung für eine griechische Polis entwarf",
        correctAnswer = 1, // B
        explanation = "Thales gilt als erster abendländischer Philosoph, weil er als Erster nach einem natürlichen Urprinzip (arche) hinter der Vielheit der Erscheinungen suchte – statt mythologischer Erklärungen durch Götter. Er behauptete, alles sei aus Wasser entstanden. Nicht die Antwort, sondern die Fragestellung war revolutionär.",
        difficulty = 2,
        funFact = "Thales soll beim Beobachten der Sterne in einen Brunnen gefallen sein – darüber lachte eine thrakische Magd. Platon berichtete dies als Gleichnis für den weltfremden Philosophen."
    ),

    // Question 47 – Heraklit: Panta rhei
    Question(
        categoryId = 11,
        questionText = "Was bedeutet der Satz 'Panta rhei' (alles fließt), der Heraklit zugeschrieben wird?",
        answerA = "Wasser ist das Urprinzip aller Dinge, aus dem alles entsteht und in das alles zurückkehrt",
        answerB = "Die Wirklichkeit ist ständige Veränderung und Werden – Einheit der Gegensätze im ewigen Fluss",
        answerC = "Zeit fließt unaufhaltsam vorwärts und kann nicht angehalten oder umgekehrt werden",
        answerD = "Das Universum ist ein Strom von Atomen ohne festes Wesen oder Bestand",
        correctAnswer = 1, // B
        explanation = "Heraklit (ca. 540–480 v. Chr.) lehrte, die Wirklichkeit sei ständige Veränderung. 'Man kann nicht zweimal in denselben Fluss steigen' – das Wasser ist ein anderes, und man selbst auch. Der Logos (Vernunft/Gesetz) regiert die ewige Veränderung durch die Einheit der Gegensätze (warm/kalt, Tag/Nacht).",
        difficulty = 2,
        funFact = null
    ),

    // Question 48 – Parmenides vs. Heraklit
    Question(
        categoryId = 11,
        questionText = "Wie kontrastierte Parmenides seine Seinsphilosophie mit Heraklits Veränderungsdenken?",
        answerA = "Parmenides stimmte zu, dass alles fließt, aber lehrte, der Logos ordne das Chaos",
        answerB = "Parmenides lehrte, dass wahres Sein unveränderlich, eins und ewig ist – Veränderung ist eine Täuschung der Sinne",
        answerC = "Parmenides glaubte, Veränderung entsteht durch die Mischung und Trennung von vier Grundelementen",
        answerD = "Parmenides entwickelte die Atomlehre als Erklärung für Veränderung ohne echtes Werden",
        correctAnswer = 1, // B
        explanation = "Parmenides (ca. 520–460 v. Chr.) führte eines der ersten reinen Vernunftargumente: Das Sein ist. Das Nichtsein ist nicht. Aus Nichts kann nichts entstehen. Also kann es keine echte Entstehung, kein Vergehen, keine Bewegung geben – alles scheinbare Werden ist Illusion der Sinne. Platons Ideenlehre ist tief von Parmenides beeinflusst.",
        difficulty = 2,
        funFact = "Zenon von Elea, Schüler des Parmenides, erfand berühmte Paradoxa (Achilles und die Schildkröte) um zu beweisen, dass Bewegung logisch unmöglich sei."
    ),

    // Question 49 – Philosophie der Sprache
    Question(
        categoryId = 11,
        questionText = "Was ist die philosophisch bedeutsame Unterscheidung zwischen 'Sinn' und 'Bedeutung', wie sie Gottlob Frege einführte?",
        answerA = "Sinn ist die emotionale Konnotation eines Wortes, Bedeutung seine sachliche Definition",
        answerB = "Sinn ist die Art und Weise, wie ein Ausdruck etwas bezeichnet; Bedeutung (Referenz) ist das Objekt, auf das er verweist",
        answerC = "Sinn bezieht sich auf gesprochene Sprache, Bedeutung auf Schriftsprache",
        answerD = "Sinn ist die wörtliche Bedeutung, Bedeutung die übertragene oder metaphorische",
        correctAnswer = 1, // B
        explanation = "Freges Beispiel: 'Morgenstern' und 'Abendstern' haben denselben Referenzgegenstand (Venus), aber verschiedenen Sinn – die Art, wie der Gegenstand beschrieben wird. Diese Unterscheidung ist fundamental für Sprachphilosophie und Logik: Zwei Ausdrücke können dasselbe bezeichnen (gleiche Bedeutung), aber verschiedene kognitive Gehalte haben (verschiedener Sinn).",
        difficulty = 2,
        funFact = null
    ),

    // Question 50 – Philosophie heute
    Question(
        categoryId = 11,
        questionText = "Was ist das 'Trolley-Problem', und warum ist es ein zentrales Gedankenexperiment der modernen Ethik?",
        answerA = "Eine Metapher für den öffentlichen Nahverkehr in ethischen Fragen der Stadtplanung",
        answerB = "Ein Szenario, das den Konflikt zwischen deontologischer Pflichtethik und utilitaristischer Folgenethik verdeutlicht",
        answerC = "Ein Experiment zur Messung moralischer Intuitionen von Menschen verschiedener Kulturen",
        answerD = "Ein Paradoxon, das beweist, dass alle ethischen Systeme zu widersprüchlichen Ergebnissen kommen",
        correctAnswer = 1, // B
        explanation = "Das Trolley-Problem (Philippa Foot, 1967): Eine Straßenbahn rast auf fünf Menschen zu. Du kannst eine Weiche umlenken – dann stirbt ein Mensch statt fünf. Soll man es tun? Utilitaristen sagen ja (5 > 1). Deontologen sagen: Man darf einen Unschuldigen nicht als Mittel benutzen. Das Gedankenexperiment trennt Konsequentialisten von Pflichtetikern.",
        difficulty = 2,
        funFact = "Neurowissenschaftler haben das Trolley-Problem in fMRT-Studien untersucht und entdeckt: Emotionale und rationale Hirnbereiche reagieren unterschiedlich – der Konflikt ist neuronal real."
    ),
)
