package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun literatureQuestionsHard2(): List<Question> = listOf(

    // Question 1 — Erster Nobelpreisträger Literatur
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wer erhielt 1901 den allerersten Nobelpreis für Literatur?",
        answerA = "Sully Prudhomme",
        answerB = "Rudyard Kipling",
        answerC = "Bjørnstjerne Bjørnson",
        answerD = "Theodor Mommsen",
        correctAnswer = 0,
        explanation = "Der französische Dichter Sully Prudhomme erhielt 1901 den ersten Nobelpreis für Literatur — viele hielten Leo Tolstoi für würdiger, was sofort zu Kontroversen führte.",
        difficulty = 3,
        funFact = "47 schwedische Schriftsteller protestierten damals öffentlich gegen die Übergabe an Prudhomme statt an Tolstoi."
    ),

    // Question 2 — Deutscher Erstpreisträger
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welcher Deutsche erhielt als erster den Nobelpreis für Literatur im Jahr 1902?",
        answerA = "Gerhart Hauptmann",
        answerB = "Theodor Mommsen",
        answerC = "Paul Heyse",
        answerD = "Rudolf Eucken",
        correctAnswer = 1,
        explanation = "Theodor Mommsen erhielt 1902 den Nobelpreis — allerdings für sein Geschichtswerk 'Römische Geschichte' und nicht für Belletristik.",
        difficulty = 3,
        funFact = "Mommsen war zum Zeitpunkt der Preisverleihung 85 Jahre alt und einer der ältesten Preisträger der frühen Nobelpreis-Geschichte."
    ),

    // Question 3 — Erste Frau
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Wer war die erste Frau, die den Nobelpreis für Literatur erhielt?",
        answerA = "Pearl S. Buck",
        answerB = "Gabriela Mistral",
        answerC = "Selma Lagerlöf",
        answerD = "Grazia Deledda",
        correctAnswer = 2,
        explanation = "Die schwedische Autorin Selma Lagerlöf erhielt 1909 als erste Frau den Literaturnobelpreis — ausgezeichnet für 'Idealismus, Fantasiereichtum und seelenvolle Darstellung'.",
        difficulty = 3,
        funFact = "Lagerlöf ist auch auf dem schwedischen 20-Kronen-Schein abgebildet und gilt als Ikone der schwedischen Literatur."
    ),

    // Question 4 — Thomas Mann Begründung
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Für welches spezifische Werk wurde Thomas Mann 1929 mit dem Nobelpreis ausgezeichnet?",
        answerA = "Der Zauberberg",
        answerB = "Tod in Venedig",
        answerC = "Doktor Faustus",
        answerD = "Buddenbrooks",
        correctAnswer = 3,
        explanation = "Das Nobelpreiskomitee zeichnete Thomas Mann 1929 'hauptsächlich für seinen großen Roman Buddenbrooks aus, der sich stetig wachsende Anerkennung als ein klassisches Werk der zeitgenössischen Literatur gesichert hat'.",
        difficulty = 3,
        funFact = "Buddenbrooks erschien 1901, als Thomas Mann erst 26 Jahre alt war — der Preis kam also 28 Jahre nach Erscheinen des Hauptwerks."
    ),

    // Question 5 — Sartre lehnte ab
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Jean-Paul Sartre lehnte 1964 den Nobelpreis für Literatur ab. Was war sein Hauptargument?",
        answerA = "Er wollte sich nicht zu einer Institution machen lassen",
        answerB = "Er hielt den Preis für politisch voreingenommen gegenüber dem Osten",
        answerC = "Er fand das Preisgeld moralisch unangemessen",
        answerD = "Er war gegen alle westlichen Kulturpreise grundsätzlich",
        correctAnswer = 0,
        explanation = "Sartre begründete seine Ablehnung damit, dass 'ein Schriftsteller sich nicht zu einer Institution machen lassen sollte' — er wollte seine Unabhängigkeit bewahren.",
        difficulty = 3,
        funFact = "Sartre war der einzige Nobelpreisträger für Literatur, der den Preis aus freien Stücken ablehnte — später sagte er privat, er bereue es, da er das Preisgeld gebraucht hätte."
    ),

    // Question 6 — Bob Dylan Begründung
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Mit welcher Begründung erhielt Bob Dylan 2016 den Nobelpreis für Literatur?",
        answerA = "Für sein Lebenswerk als Dichter und Lyriker der amerikanischen Gegenbewegung",
        answerB = "Für neue poetische Ausdrucksformen innerhalb der großen amerikanischen Liedtradition",
        answerC = "Für seine Memoiren 'Chronicles' als literarisches Meisterwerk",
        answerD = "Für seine Beiträge zur Folk-Poesie als eigenständiger Literaturform",
        correctAnswer = 1,
        explanation = "Die Schwedische Akademie begründete die Wahl mit 'having created new poetic expressions within the great American song tradition' — auf Deutsch: neue poetische Ausdrucksformen innerhalb der großen amerikanischen Liedtradition.",
        difficulty = 3,
        funFact = "Dylan erschien nicht persönlich zur Verleihung und ließ seinen Dankesbrief von der US-Botschafterin vorlesen — seine Nobel-Rede hielt er dann Monate später."
    ),

    // Question 7 — Skandal 2018
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Warum wurde der Nobelpreis für Literatur 2018 nicht vergeben?",
        answerA = "Weil sich die Schwedische Akademie nicht einigen konnte",
        answerB = "Wegen des Ersten Weltkriegs",
        answerC = "Wegen eines Missbrauchsskandals rund um die Schwedische Akademie",
        answerD = "Weil es in diesem Jahr keinen würdigen Kandidaten gab",
        correctAnswer = 2,
        explanation = "Im Zuge der #MeToo-Bewegung wurden 18 Frauen aus dem Umfeld der Akademie sexuell belästigt durch Jean-Claude Arnault, den Ehemann eines Akademiemitglieds — daraufhin setzte die Akademie den Preis für 2018 aus.",
        difficulty = 3,
        funFact = "2019 wurden deshalb zwei Preise gleichzeitig vergeben: Olga Tokarczuk erhielt den Preis für 2018, Peter Handke für 2019."
    ),

    // Question 8 — Olga Tokarczuk
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Wofür wurde die Polin Olga Tokarczuk mit dem Nobelpreis für Literatur 2018 ausgezeichnet?",
        answerA = "Für ihren Roman 'Jakobs Bücher' als Meisterwerk der historischen Fiktion",
        answerB = "Für die Erneuerung der polnischen Literatur nach der Wende",
        answerC = "Für ihren Beitrag zur europäischen Gegenwartsliteratur",
        answerD = "Für narrative Vorstellungskraft, die das Überschreiten von Grenzen als Lebensform darstellt",
        correctAnswer = 3,
        explanation = "Die Schwedische Akademie würdigte Tokarczuk für 'narrative imagination that with encyclopaedic passion represents the crossing of boundaries as a form of life'.",
        difficulty = 3,
        funFact = "Tokarczuks Roman 'Jakobs Bücher' umfasst 900 Seiten und wurde in Polen ein Bestseller — die Übersetzung ins Deutsche trug zum internationalen Ruhm bei."
    ),

    // Question 9 — Peter Handke Kontroverse
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Was war der Hauptkritikpunkt an der Verleihung des Nobelpreises 2019 an Peter Handke?",
        answerA = "Seine umstrittene Haltung zum Jugoslawien-Krieg und Besuche bei Slobodan Milosevic",
        answerB = "Er hatte zuvor den Preis des deutschen Buchhandels abgelehnt",
        answerC = "Sein Werk galt als zu wenig übersetzt und international unbekannt",
        answerD = "Er soll Plagiate in seinem Frühwerk begangen haben",
        correctAnswer = 0,
        explanation = "Handke hatte 2006 die Beerdigung Slobodan Milosevics besucht und Serbien in mehreren Essays verteidigt — daraufhin traten zwei externe Komiteemitglieder aus und ein Akademiemitglied boykottierte die Zeremonie.",
        difficulty = 3,
        funFact = "Mehrere Schriftstellerverbände weltweit forderten die Rücknahme des Preises — die Schwedische Akademie lehnte dies ab."
    ),

    // Question 10 — Herta Müller
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wie begründete die Schwedische Akademie den Nobelpreis 2009 für Herta Müller?",
        answerA = "Für ihren Roman 'Atemschaukel' als einzigartiges Zeugnis der Deportation",
        answerB = "Mit Konzentration der Poesie und Offenheit der Prosa stellt sie Landschaften der Heimatlosigkeit dar",
        answerC = "Für ihre Verdienste um die rumänische Literatur in Deutschland",
        answerD = "Als Stimme des Widerstands gegen totalitäre Regimes",
        correctAnswer = 1,
        explanation = "Die Akademie formulierte: 'die mit der Konzentration von Poesie und der Offenheit der Prosa Landschaften der Heimatlosigkeit darstellt' — ein Satz der auf ihre Sprache und Thematik eingeht.",
        difficulty = 3,
        funFact = "Herta Müllers 'Atemschaukel' erschien im selben Jahr 2009 wie ihr Nobelpreis und schildert die Deportation von Rumäniendeutschen in sowjetische Arbeitslager."
    ),

    // Question 11 — García Márquez Begründung
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Womit begründete das Nobelkomitee 1982 die Auszeichnung von Gabriel García Márquez?",
        answerA = "Für die Erfindung des magischen Realismus als literarische Gattung",
        answerB = "Für 'Hundert Jahre Einsamkeit' als bedeutendstes Werk des 20. Jahrhunderts",
        answerC = "Für Romane und Erzählungen, in denen Phantastisches und Reales Leben eines Kontinents widerspiegeln",
        answerD = "Für seinen Beitrag zur lateinamerikanischen Unabhängigkeitsliteratur",
        correctAnswer = 2,
        explanation = "Das Komitee begründete: 'für seine Romane und Erzählungen, in denen sich das Phantastische und das Realistische in einer vielfacettierten Welt der Dichtung vereinen, die Leben und Konflikt eines Kontinents widerspiegeln'.",
        difficulty = 3,
        funFact = "García Márquez wartete mit Bekanntgabe der Fertigstellung seines Romans, bis seine Frau den ersten Beitrag für die Druckkosten beim Verleger eingeschickt hatte — er hatte kein Geld."
    ),

    // Question 12 — Günter Grass
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Für welches Werk wurde Günter Grass 1999 mit dem Nobelpreis für Literatur ausgezeichnet?",
        answerA = "Für 'Im Krebsgang' als Meisterwerk über Flucht und Vertreibung",
        answerB = "Für sein Gesamtwerk einschließlich 'Das Treffen in Telgte'",
        answerC = "Für seine politischen Schriften und Reden für die SPD",
        answerD = "Für seine 'Danziger Trilogie' beginnend mit 'Die Blechtrommel'",
        correctAnswer = 3,
        explanation = "Das Nobelkomitee würdigte Grass für seine 'Danziger Trilogie' — vor allem 'Die Blechtrommel' gilt als sein Hauptwerk, das die deutsche Schuldfrage nach 1945 aufarbeitet.",
        difficulty = 3,
        funFact = "Grass enthüllte 2006, sieben Jahre nach dem Nobelpreis, dass er als 17-Jähriger kurz der Waffen-SS angehört hatte — was heftige Debatten auslöste."
    ),

    // Question 13 — Hermann Hesse
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erhielt Hermann Hesse den Nobelpreis für Literatur?",
        answerA = "1946",
        answerB = "1951",
        answerC = "1942",
        answerD = "1955",
        correctAnswer = 0,
        explanation = "Hermann Hesse erhielt 1946 den Nobelpreis für Literatur — im selben Jahr wie der Friedensnobelpreis an Emily Greene Balch vergeben wurde.",
        difficulty = 3,
        funFact = "Hesse hatte die Schweizer Staatsbürgerschaft angenommen, weshalb er oft als Schweizer Nobelpreisträger gezählt wird, obwohl er in Deutschland geboren wurde."
    ),

    // Question 14 — Jüngster Preisträger
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Wer ist der bislang jüngste Nobelpreisträger für Literatur und in welchem Alter erhielt er den Preis?",
        answerA = "Albert Camus, 44 Jahre",
        answerB = "Rudyard Kipling, 41 Jahre",
        answerC = "Jean-Paul Sartre, 59 Jahre",
        answerD = "Samuel Beckett, 63 Jahre",
        correctAnswer = 1,
        explanation = "Rudyard Kipling erhielt 1907 mit nur 41 Jahren den Nobelpreis und ist damit der bislang jüngste Literaturnobelpreisträger aller Zeiten.",
        difficulty = 3,
        funFact = "Kipling ist bekannt für 'Das Dschungelbuch' (1894) und 'Kim' (1901) — sein Werk wurde für seine Darstellung des Britischen Empires später auch kritisch betrachtet."
    ),

    // Question 15 — Älteste Preisträgerin
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Wer ist die älteste Preisträgerin des Nobelpreises für Literatur (88 Jahre bei Verleihung)?",
        answerA = "Toni Morrison",
        answerB = "Alice Munro",
        answerC = "Doris Lessing",
        answerD = "Elfriede Jelinek",
        correctAnswer = 2,
        explanation = "Doris Lessing erhielt 2007 im Alter von 88 Jahren den Nobelpreis für Literatur und ist damit die älteste Literaturnobelpreisträgerin der Geschichte.",
        difficulty = 3,
        funFact = "Als Lessing die Preisankündigung vor ihrer Haustür hörte, sagte sie vor laufenden Kameras: 'Oh, Gott!' — ihre nüchterne Reaktion ging viral."
    ),

    // Question 16 — Wieviele Frauen
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Wie viele Frauen haben seit 1901 bis 2024 den Nobelpreis für Literatur erhalten?",
        answerA = "12",
        answerB = "14",
        answerC = "21",
        answerD = "18",
        correctAnswer = 3,
        explanation = "Von 1901 bis 2024 haben insgesamt 18 Frauen den Nobelpreis für Literatur erhalten — das entspricht etwa 14,9 Prozent aller Preisträger.",
        difficulty = 3,
        funFact = "Han Kang wurde 2024 als 18. Frau ausgezeichnet — die erste südkoreanische Nobelpreisträgerin für Literatur überhaupt."
    ),

    // Question 17 — Louise Glück 2020
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wofür erhielt Louise Glück 2020 den Nobelpreis für Literatur?",
        answerA = "Für ihre unverkennbare poetische Stimme, die mit strenger Schönheit die individuelle Existenz universell macht",
        answerB = "Für ihr Lebenswerk als bedeutendste amerikanische Lyrikerin des 20. Jahrhunderts",
        answerC = "Für ihre Gedichtbände über Verlust und Trauer als universelle Erfahrung",
        answerD = "Für die Erneuerung der amerikanischen Lyrik durch griechische Mythologie",
        correctAnswer = 0,
        explanation = "Das Komitee würdigte Glück 'for her unmistakable poetic voice that with austere beauty makes individual existence universal' — ihre Gedichte sind bekannt für ihre Knappheit und emotionale Intensität.",
        difficulty = 3,
        funFact = "Glück ist eine der wenigen Nobelpreisträgerinnen, die ausschließlich als Lyrikerin bekannt ist — Prosa hat sie kaum veröffentlicht."
    ),

    // Question 18 — Abdulrazak Gurnah 2021
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Welcher Autor erhielt 2021 den Nobelpreis für Literatur und ist aus Sansibar gebürtig?",
        answerA = "Ngũgĩ wa Thiong'o",
        answerB = "Abdulrazak Gurnah",
        answerC = "Chinua Achebe",
        answerD = "Wole Soyinka",
        correctAnswer = 1,
        explanation = "Abdulrazak Gurnah, geboren in Sansibar (heute Tansania), erhielt 2021 den Nobelpreis für sein 'kompromissloses und mitfühlendes Durchdringen der Auswirkungen des Kolonialismus'.",
        difficulty = 3,
        funFact = "Gurnah war vor seiner Nobelpreisverleihung im deutschsprachigen Raum fast unbekannt — nach der Ankündigung waren seine Bücher sofort vergriffen."
    ),

    // Question 19 — Annie Ernaux 2022
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Annie Ernaux erhielt 2022 den Nobelpreis. Welche Begründung gab das Komitee?",
        answerA = "Für ihren Roman 'Die Jahre' als Kollektivgedächtnis der französischen Gesellschaft",
        answerB = "Für ihre Autobiografien als Dokumente sozialer Ungleichheit in Frankreich",
        answerC = "Für Mut und klinische Schärfe beim Aufdecken der Wurzeln persönlicher Erinnerung",
        answerD = "Für ihre Beiträge zum feministischen Schreiben in der Weltliteratur",
        correctAnswer = 2,
        explanation = "Das Komitee würdigte Ernaux 'for the courage and clinical acuity with which she uncovers the roots, estrangements and collective restraints of personal memory'.",
        difficulty = 3,
        funFact = "Ernaux ist die erste Frau aus Frankreich, die den Literaturnobelpreis erhielt — Frankreich stellte insgesamt mehr Laureaten als jedes andere Land."
    ),

    // Question 20 — Jon Fosse 2023
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Jon Fosse erhielt 2023 den Nobelpreis für Literatur. Welche literarische Form machte ihn vor allem bekannt?",
        answerA = "Romane in der Tradition des nordischen Minimalismus",
        answerB = "Lyrik in der Nynorsk-Sprache",
        answerC = "Historische Romane über die norwegische Gesellschaft",
        answerD = "Theaterstücke, die dem Unsagbaren eine Stimme verleihen",
        correctAnswer = 3,
        explanation = "Das Komitee würdigte Fosse 'for his innovative plays and prose which give voice to the unsayable' — seine Theaterstücke werden weltweit häufiger gespielt als die fast aller anderen lebenden Dramatiker.",
        difficulty = 3,
        funFact = "Fosse schreibt auf Nynorsk, einer der zwei offiziellen Schriftsprachen Norwegens — seine Stücke wurden in über 40 Sprachen übersetzt."
    ),

    // Question 21 — Han Kang 2024
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wofür wurde die südkoreanische Autorin Han Kang 2024 mit dem Nobelpreis für Literatur ausgezeichnet?",
        answerA = "Für intensive poetische Prosa, die historische Traumata anspricht und die Zerbrechlichkeit des Lebens zeigt",
        answerB = "Für ihren Roman 'Die Vegetarierin' als feministisches Manifest der asiatischen Literatur",
        answerC = "Für ihre Darstellung des koreanischen Krieges aus weiblicher Perspektive",
        answerD = "Für die Erneuerung der koreanischen Literatur durch westliche Erzählformen",
        correctAnswer = 0,
        explanation = "Das Komitee würdigte Han Kang 'for her intense poetic prose that confronts historical traumas and exposes the fragility of human life'.",
        difficulty = 3,
        funFact = "Han Kang ist die erste südkoreanische Schriftstellerin und die erste Asiatin seit Kazuo Ishiguro 2017, die den Literaturnobelpreis erhielt."
    ),

    // Question 22 — Gerhart Hauptmann
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Gerhart Hauptmann erhielt 1912 den Nobelpreis für Literatur. Welches seiner Werke gilt als sein Hauptwerk des Naturalismus?",
        answerA = "Der Biberpelz",
        answerB = "Die Weber",
        answerC = "Vor Sonnenaufgang",
        answerD = "Die Ratten",
        correctAnswer = 1,
        explanation = "'Die Weber' (1892) gilt als Hauptwerk des deutschen Naturalismus und schildert den schlesischen Weberaufstand von 1844 — das Stück wurde zunächst in Preußen verboten.",
        difficulty = 3,
        funFact = "Kaiser Wilhelm II. soll nach der Uraufführung der 'Weber' seine Loge im Deutschen Theater Berlin aufgekündigt haben, da er das Stück als aufrührerisch empfand."
    ),

    // Question 23 — Heinrich Böll
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erhielt Heinrich Böll den Nobelpreis für Literatur?",
        answerA = "1968",
        answerB = "1970",
        answerC = "1972",
        answerD = "1975",
        correctAnswer = 2,
        explanation = "Heinrich Böll erhielt 1972 den Nobelpreis für Literatur — ausgezeichnet für sein Werk, das 'eine breite Perspektive auf die deutsche Zeitgeschichte mit Feingefühl für das Charakterbild' bietet.",
        difficulty = 3,
        funFact = "Böll war ein entschiedener Kritiker des Kalten Krieges und setzte sich für Terrorverdächtige ein, was ihm in Deutschland heftige Anfeindungen einbrachte."
    ),

    // Question 24 — Elfriede Jelinek
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Die österreichische Autorin Elfriede Jelinek erhielt 2004 den Nobelpreis. Welches ist ihr bekanntestes Werk?",
        answerA = "Lust",
        answerB = "Wir sind Lockvögel, Baby!",
        answerC = "Gier",
        answerD = "Die Klavierspielerin",
        correctAnswer = 3,
        explanation = "'Die Klavierspielerin' (1983) ist Jelineks bekanntestes Werk und wurde 2001 von Michael Haneke verfilmt — Isabelle Huppert gewann dafür die Goldene Palme in Cannes.",
        difficulty = 3,
        funFact = "Jelinek nahm den Nobelpreis nicht persönlich entgegen und erklärte, sie leide unter sozialer Phobie — ihre Dankesrede wurde als Videoaufzeichnung gezeigt."
    ),

    // Question 25 — Toni Morrison
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Toni Morrison war die erste Afroamerikanerin, die den Nobelpreis für Literatur erhielt. In welchem Jahr?",
        answerA = "1993",
        answerB = "1988",
        answerC = "1997",
        answerD = "2001",
        correctAnswer = 0,
        explanation = "Toni Morrison erhielt 1993 als erste Afroamerikanerin den Nobelpreis für Literatur — ihr Hauptwerk 'Beloved' (1987) behandelt die Traumata der Sklaverei.",
        difficulty = 3,
        funFact = "Morrison war zuvor Lektorin bei Random House und entdeckte dort viele schwarze Schriftstellerinnen und Schriftsteller — sie sah sich ebenso als Verlegerin wie als Autorin."
    ),

    // Question 26 — Samuel Beckett
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Samuel Beckett erhielt 1969 den Nobelpreis für Literatur. In welcher Sprache schrieb er sein Hauptwerk 'Warten auf Godot' zuerst?",
        answerA = "Englisch",
        answerB = "Französisch",
        answerC = "Irisch",
        answerD = "Deutsch",
        correctAnswer = 1,
        explanation = "Beckett schrieb 'En attendant Godot' zuerst auf Französisch (1952) und übersetzte es dann selbst ins Englische — er war irischer Staatsbürger, schrieb aber bevorzugt auf Französisch.",
        difficulty = 3,
        funFact = "Beckett nahm zwar den Nobelpreis an, war aber für seine Zurückhaltung bekannt — er gab selten Interviews und mied öffentliche Auftritte."
    ),

    // Question 27 — Wole Soyinka
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Wole Soyinka war der erste afrikanische Nobelpreisträger für Literatur. Aus welchem Land stammt er?",
        answerA = "Kenia",
        answerB = "Ghana",
        answerC = "Nigeria",
        answerD = "Südafrika",
        correctAnswer = 2,
        explanation = "Der Nigerianer Wole Soyinka erhielt 1986 als erster Afrikaner den Nobelpreis für Literatur — für ein Werk, das 'in weitem kulturellen Panorama und mit poetischer Resonanz das menschliche Drama gestaltet'.",
        difficulty = 3,
        funFact = "Soyinka wurde während des nigerianischen Bürgerkriegs (1967–1969) 22 Monate in Einzelhaft gehalten — seine Gefängniserlebnisse beschrieb er in 'L'homme est mort'."
    ),

    // Question 28 — Alice Munro
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Alice Munro erhielt 2013 den Nobelpreis für Literatur. Für welche literarische Form ist sie vor allem bekannt?",
        answerA = "Romane über das ländliche Kanada",
        answerB = "Autobiografische Erzählungen über Einwanderer",
        answerC = "Lyrik in der Tradition der kanadischen Romantik",
        answerD = "Kurzgeschichten",
        correctAnswer = 3,
        explanation = "Alice Munro gilt als 'Meisterin der zeitgenössischen Kurzgeschichte' — das Komitee bezeichnete sie als 'master of the contemporary short story'.",
        difficulty = 3,
        funFact = "Munro hat keinen Roman geschrieben — ihr gesamtes Werk besteht aus Kurzgeschichtensammlungen, was sie zur bedeutendsten Kurzgeschichten-Nobelpreisträgerin macht."
    ),

    // Question 29 — Imre Kertész
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Der ungarische Autor Imre Kertész erhielt 2002 den Nobelpreis. Was ist das zentrale Thema seines Hauptwerks 'Schicksallosigkeit'?",
        answerA = "Die Erfahrung eines jüdischen Teenagers in Auschwitz und Buchenwald",
        answerB = "Das Leben in Ungarn unter kommunistischer Herrschaft",
        answerC = "Die Unmöglichkeit der Rückkehr nach dem Holocaust",
        answerD = "Die Identitätskrise ungarischer Juden nach der Shoah",
        correctAnswer = 0,
        explanation = "'Schicksallosigkeit' (1975) schildert autobiografisch die Deportation eines ungarischen jüdischen Teenagers nach Auschwitz und Buchenwald — Kertész selbst überlebte beide Lager.",
        difficulty = 3,
        funFact = "Das Buch wurde zuerst von allen ungarischen Verlagen abgelehnt und erschien 1975 in einer kleinen Auflage — es wurde erst nach dem Nobelpreis ein Weltbestseller."
    ),

    // Question 30 — Doris Lessing
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "In welchem Land wurde Doris Lessing, Nobelpreisträgerin 2007, geboren?",
        answerA = "Großbritannien",
        answerB = "Iran (damals Persien)",
        answerC = "Simbabwe (damals Südrhodesien)",
        answerD = "Südafrika",
        correctAnswer = 1,
        explanation = "Doris Lessing wurde 1919 in Kermanshah, Persien (heute Iran), geboren, wuchs in Südrhodesien (heute Simbabwe) auf und lebte später in Großbritannien.",
        difficulty = 3,
        funFact = "Lessing wurde 1956 als 'verbotene Einwanderin' aus Südrhodesien und Südafrika ausgewiesen, weil sie sich gegen Apartheid und Rassismus engagierte."
    ),

    // Question 31 — Doppelpreis 2019
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Wann wurden zum letzten Mal zwei Nobelpreise für Literatur im selben Jahr vergeben?",
        answerA = "1904 und 2015",
        answerB = "Noch nie — es gibt immer nur einen Preis pro Jahr",
        answerC = "2019 (für 2018 und 2019 gleichzeitig)",
        answerD = "1917 wegen des Ersten Weltkrieges",
        correctAnswer = 2,
        explanation = "2019 wurden gleichzeitig Olga Tokarczuk (für 2018) und Peter Handke (für 2019) ausgezeichnet — da 2018 kein Preis vergeben wurde, holte man ihn 2019 nach.",
        difficulty = 3,
        funFact = "1904 wurden tatsächlich zwei Preisträger gleichzeitig ausgezeichnet: Frédéric Mistral und José Echegaray — aber das war die geteilte Verleihung für ein Jahr, nicht für zwei."
    ),

    // Question 32 — Bertrand Russell
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Der Philosoph Bertrand Russell erhielt 1950 den Nobelpreis für Literatur. Wofür wurde er ausgezeichnet?",
        answerA = "Für seine Philosophie der Sprache als Beitrag zur Weltliteratur",
        answerB = "Für seine politischen Schriften über Frieden und Abrüstung",
        answerC = "Für seine Autobiografie als literarisches Meisterwerk",
        answerD = "Für vielgestaltige und bedeutsame Schriften, in denen er humanitäre Ideale und Gedankenfreiheit verficht",
        correctAnswer = 3,
        explanation = "Das Komitee begründete: Russell erhält den Preis 'in recognition of his varied and significant writings in which he champions humanitarian ideals and freedom of thought'.",
        difficulty = 3,
        funFact = "Russell ist einer der wenigen Philosophen, die den Literaturnobelpreis erhalten haben — sein Werk umfasst Mathematik, Erkenntnistheorie und politische Philosophie."
    ),

    // Question 33 — Nicht vergebene Jahre
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "In welchen Jahren wurde der Nobelpreis für Literatur während der Weltkriege NICHT vergeben?",
        answerA = "1914, 1918 und 1940–1943",
        answerB = "1914–1918 und 1939–1945",
        answerC = "1915, 1916, 1940, 1941",
        answerD = "Nur 1940 und 1944",
        correctAnswer = 0,
        explanation = "Der Preis wurde in den Jahren 1914, 1918 sowie 1935 und 1940–1943 nicht vergeben — nicht alle Kriegsjahre wurden ausgesetzt, was oft überrascht.",
        difficulty = 3,
        funFact = "1935 wurde der Preis ohne Angabe eines politischen Grundes ausgesetzt — viele Historiker vermuten, es lag am Druck des Nazi-Regimes auf die Akademie."
    ),

    // Question 34 — Gabriel García Márquez Staatsangehörigkeit
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Gabriel García Márquez, Literaturnobelpreisträger 1982, welche Nationalität hatte er?",
        answerA = "Mexikanisch",
        answerB = "Kolumbianisch",
        answerC = "Venezolanisch",
        answerD = "Argentinisch",
        correctAnswer = 1,
        explanation = "García Márquez war kolumbianischer Staatsbürger, obwohl er viele Jahre in Mexiko lebte — er gilt als eine der bedeutendsten Stimmen Lateinamerikas.",
        difficulty = 3,
        funFact = "García Márquez und Fidel Castro waren befreundet — er nannte Castro 'den besten Freund', was ihm viel Kritik einbrachte."
    ),

    // Question 35 — Pasternak lehnte ab
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Warum lehnte Boris Pasternak 1958 den Nobelpreis für Literatur ab?",
        answerA = "Er hielt den Preis für ein Instrument westlicher Propaganda",
        answerB = "Er war aus religiösen Gründen gegen staatliche Auszeichnungen",
        answerC = "Er wurde vom sowjetischen Regime unter Druck gesetzt und aus dem Schriftstellerverband ausgeschlossen",
        answerD = "Er wollte sich mit Sartre solidarisch erklären, der den Preis ebenfalls ablehnte",
        correctAnswer = 2,
        explanation = "Pasternak nahm den Preis zunächst an, lehnte ihn dann aber unter massivem Druck der sowjetischen Behörden ab — er wurde aus dem Schriftstellerverband ausgeschlossen und mit Ausweisung bedroht.",
        difficulty = 3,
        funFact = "Pasternaks Sohn nahm den Preis 1989 posthum für seinen Vater entgegen, der 1960 gestorben war — 31 Jahre nach der ursprünglichen Verleihung."
    ),

    // Question 36 — Nobelpreis und Nationalitäten
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Welches Land hat seit 1901 die meisten Literaturnobelpreisträger hervorgebracht?",
        answerA = "Deutschland",
        answerB = "Großbritannien",
        answerC = "USA",
        answerD = "Frankreich",
        correctAnswer = 3,
        explanation = "Frankreich führt die Nationenliste mit 16 Literaturnobelpreisträgern an — gefolgt von den USA und Großbritannien. Deutschland liegt mit etwa 10 Preisträgern dahinter.",
        difficulty = 3,
        funFact = "Die dominante Stellung Frankreichs ist historisch: Paris galt vom 19. bis ins 20. Jahrhundert als kulturelles Zentrum der Welt."
    ),

    // Question 37 — Orhan Pamuk
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Orhan Pamuk erhielt 2006 den Nobelpreis für Literatur. Für welche Begründung wurde er ausgezeichnet?",
        answerA = "Er entdeckte neue Symbole für den Zusammenprall und das Ineinanderfließen von Kulturen",
        answerB = "Für sein Werk 'Schnee' als bedeutendstes Werk über den islamischen Fundamentalismus",
        answerC = "Für die Erneuerung der türkischen Literatur durch westliche Romantechniken",
        answerD = "Als Stimme für Meinungsfreiheit in einem autoritären Staat",
        correctAnswer = 0,
        explanation = "Das Komitee würdigte Pamuk 'who in the quest for the melancholic soul of his native city has discovered new symbols for the clash and interlacing of cultures'.",
        difficulty = 3,
        funFact = "Kurz vor dem Nobelpreis wurde Pamuk in der Türkei wegen 'Beleidigung des Türkentums' angeklagt, weil er über den Genozid an Armeniern gesprochen hatte."
    ),

    // Question 38 — Kazuo Ishiguro
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Kazuo Ishiguro erhielt 2017 den Nobelpreis. Welches seiner Werke wurde verfilmt und mit dem Oscar ausgezeichnet?",
        answerA = "Alles, was wir geben mussten",
        answerB = "Was vom Tage übrig bleibt",
        answerC = "Die Ungetrösteten",
        answerD = "Der begrabene Riese",
        correctAnswer = 1,
        explanation = "'Was vom Tage übrig bleibt' (The Remains of the Day, 1989) wurde 1993 mit Anthony Hopkins und Emma Thompson verfilmt und erhielt 8 Oscar-Nominierungen.",
        difficulty = 3,
        funFact = "Ishiguro wurde in Nagasaki geboren, kam mit 5 Jahren nach England und schreibt ausschließlich auf Englisch — er gilt als britischer Autor mit japanischen Wurzeln."
    ),

    // Question 39 — Patrick Modiano
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Patrick Modiano erhielt 2014 den Nobelpreis für Literatur. Welches ist sein zentrales literarisches Thema?",
        answerA = "Der Existenzialismus im modernen Paris",
        answerB = "Die Erfahrungen algerischer Einwanderer in Frankreich",
        answerC = "Erinnerung und Identität im Zusammenhang mit der deutschen Besatzung Frankreichs",
        answerD = "Die Aufarbeitung der Kolonialgeschichte Frankreichs",
        correctAnswer = 2,
        explanation = "Modiano kreist in fast allen Werken um das besetzte Paris der Kriegszeit — das Komitee würdigte 'die Kunst der Erinnerung, mit der er die unbegreiflichsten menschlichen Schicksale evoziert hat'.",
        difficulty = 3,
        funFact = "Modiano hat über 30 Romane geschrieben, die alle dasselbe Thema variieren — in Frankreich ist er ein Klassiker, international war er vor dem Nobelpreis wenig bekannt."
    ),

    // Question 40 — Elfriede Jelinek Begründung
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Wie begründete das Nobelkomitee 2004 die Auszeichnung der Österreicherin Elfriede Jelinek?",
        answerA = "Für ihre feministischen Dramen als Beitrag zur europäischen Gegenwartsliteratur",
        answerB = "Für 'Die Klavierspielerin' als einzigartiges Werk über weibliche Unterdrückung",
        answerC = "Für ihren politischen Widerstand gegen den Rechtspopulismus in Österreich",
        answerD = "Für den musikalischen Fluss von Stimmen und Gegenstimmen in ihren Romanen und Dramen",
        correctAnswer = 3,
        explanation = "Das Komitee würdigte Jelinek 'for her musical flow of voices and counter-voices in novels and plays that with extraordinary linguistic zeal reveal the absurdity of society's clichés'.",
        difficulty = 3,
        funFact = "FPÖ-Politiker forderten nach Jelineks Nobelpreis in Österreich eine Rückgabe des Preises — sie war eine vehemente Kritikerin der FPÖ-ÖVP-Koalition."
    ),

    // Question 41 — Mo Yan
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Welcher chinesische Autor erhielt 2012 als erster in China lebender Schriftsteller den Nobelpreis für Literatur?",
        answerA = "Mo Yan",
        answerB = "Gao Xingjian",
        answerC = "Wang Anyi",
        answerD = "Yu Hua",
        correctAnswer = 0,
        explanation = "Mo Yan erhielt 2012 den Nobelpreis — Gao Xingjian erhielt 2000 den Preis als erster Schriftsteller chinesischer Herkunft, lebte aber in Frankreich im Exil.",
        difficulty = 3,
        funFact = "Mo Yans Auszeichnung war umstritten, weil er ein Mitglied der Kommunistischen Partei Chinas ist — Menschenrechtler kritisierten die Wahl."
    ),

    // Question 42 — Gabriela Mistral
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Gabriela Mistral war 1945 die erste Lateinamerikanerin, die den Nobelpreis für Literatur erhielt. Aus welchem Land stammte sie?",
        answerA = "Argentinien",
        answerB = "Chile",
        answerC = "Mexiko",
        answerD = "Kolumbien",
        correctAnswer = 1,
        explanation = "Gabriela Mistral war chilenische Lyrikerin und Pädagogin — sie erhielt 1945 als fünfte Frau und erste Lateinamerikanerin den Literaturnobelpreis.",
        difficulty = 3,
        funFact = "Mistral ist auf dem chilenischen 5000-Peso-Schein abgebildet und gilt als Nationaldichterin Chiles — ihr bürgerlicher Name war Lucila Godoy Alcayaga."
    ),

    // Question 43 — Camus Alter bei Auszeichnung
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "Albert Camus erhielt 1957 den Nobelpreis für Literatur — wie alt war er dabei?",
        answerA = "38 Jahre",
        answerB = "51 Jahre",
        answerC = "44 Jahre",
        answerD = "47 Jahre",
        correctAnswer = 2,
        explanation = "Albert Camus war bei der Verleihung 1957 erst 44 Jahre alt und gehört damit zu den jüngsten Nobelpreisträgern für Literatur.",
        difficulty = 3,
        funFact = "Camus starb nur drei Jahre nach dem Nobelpreis bei einem Autounfall — in seiner Tasche fand man ein ungenutztes Bahnticket, das zeigt, er hatte ursprünglich den Zug nehmen wollen."
    ),

    // Question 44 — Wer ist Theodor Mommsen
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Theodor Mommsen (Nobelpreis 1902) ist der einzige Historiker, der je den Literaturnobelpreis erhielt. Was ist sein Hauptwerk?",
        answerA = "Geschichte des Untergangs Roms",
        answerB = "Das Imperium der Caesaren",
        answerC = "Annalen des Römischen Senats",
        answerD = "Römische Geschichte",
        correctAnswer = 3,
        explanation = "Mommsens 'Römische Geschichte' (3 Bände, 1854–1856) ist das bedeutendste Werk der deutschen Altertumswissenschaft und wird bis heute als Meilenstein der Historiografie betrachtet.",
        difficulty = 3,
        funFact = "Mommsen war 85 Jahre alt beim Erhalt des Nobelpreises — und der erste und bislang einzige Historiker in der Geschichte des Literaturnobelpreises."
    ),

    // Question 45 — Pearl S. Buck
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Pearl S. Buck erhielt 1938 den Nobelpreis für Literatur. Für welches Werk ist sie vor allem bekannt?",
        answerA = "Die gute Erde",
        answerB = "Der Paß",
        answerC = "Kinder des langen Tages",
        answerD = "Drache und Phönix",
        correctAnswer = 0,
        explanation = "'Die gute Erde' (The Good Earth, 1931) schildert das Leben einer chinesischen Bauernfamilie und wurde ein weltweiter Bestseller — Buck lebte viele Jahre als Missionarstochter in China.",
        difficulty = 3,
        funFact = "Buck war die erste Amerikanerin, die den Nobelpreis für Literatur erhielt, und ist bis heute die einzige Person, die sowohl den Pulitzer-Preis als auch den Nobelpreis für Literatur gewann."
    ),

    // Question 46 — Pablo Neruda
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Pablo Neruda erhielt 1971 den Nobelpreis für Literatur. Welche politische Überzeugung vertrat er?",
        answerA = "Liberalismus mit Sympathie für die Demokratiebewegung",
        answerB = "Kommunismus und Mitgliedschaft in der Kommunistischen Partei Chiles",
        answerC = "Sozialdemokratie und Unterstützung der Volksfront",
        answerD = "Anarchismus und antistaatliche Poesie",
        correctAnswer = 1,
        explanation = "Pablo Neruda war überzeugter Kommunist und Mitglied der Kommunistischen Partei Chiles — er war auch chilenischer Senator und diplomatischer Vertreter.",
        difficulty = 3,
        funFact = "Neruda starb 12 Tage nach dem Militärputsch Pinochets 1973 — Jahrzehnte später wurde untersucht, ob er möglicherweise vergiftet worden war."
    ),

    // Question 47 — Naipaul Kontroverse
    // correct: C (2)
    Question(
        categoryId = 10,
        questionText = "V.S. Naipaul erhielt 2001 den Nobelpreis für Literatur. Aus welchem Land stammte er ursprünglich?",
        answerA = "Indien",
        answerB = "Pakistan",
        answerC = "Trinidad und Tobago",
        answerD = "Jamaika",
        correctAnswer = 2,
        explanation = "Sir Vidiadhar Surajprasad Naipaul wurde 1932 in Trinidad geboren, als Nachkomme indischer Einwanderer — er wurde britischer Staatsbürger und gilt als britisch-trinidadischer Schriftsteller.",
        difficulty = 3,
        funFact = "Naipaul war bekannt für seinen scharfen, oft umstrittenen Blick auf die Dritte Welt und Postkolonialismus — Kritiker warfen ihm Arroganz gegenüber der Herkunftskultur vor."
    ),

    // Question 48 — Nadine Gordimer
    // correct: D (3)
    Question(
        categoryId = 10,
        questionText = "Nadine Gordimer erhielt 1991 den Nobelpreis für Literatur. Was war das zentrale Thema ihres Werks?",
        answerA = "Die Unabhängigkeitsbewegungen Afrikas im 20. Jahrhundert",
        answerB = "Das Leben von Frauen in einer patriarchalischen Gesellschaft Südafrikas",
        answerC = "Die historische Aufarbeitung des Burenkrieges",
        answerD = "Das Leben unter der Apartheid und der Widerstand dagegen",
        correctAnswer = 3,
        explanation = "Gordimers gesamtes Werk ist geprägt vom Widerstand gegen die Apartheid — das Komitee würdigte sie 'who through her magnificent epic writing has been of very great benefit to humanity'.",
        difficulty = 3,
        funFact = "Mehrere ihrer Bücher wurden von der südafrikanischen Apartheid-Regierung verboten — sie ist als Weißhäutige eine wichtige Stimme im Kampf für Gleichberechtigung."
    ),

    // Question 49 — Bob Dylan Reaktion
    // correct: A (0)
    Question(
        categoryId = 10,
        questionText = "Wie reagierte Bob Dylan zunächst auf die Nachricht, den Nobelpreis für Literatur 2016 gewonnen zu haben?",
        answerA = "Er schwieg wochenlang und gab keine Reaktion — die Akademie konnte ihn nicht erreichen",
        answerB = "Er lehnte den Preis zuerst ab und nahm ihn erst nach Wochen an",
        answerC = "Er veröffentlichte sofort ein Dankeslied auf seiner Website",
        answerD = "Er gab ein langes Interview über Literatur und Lyrik",
        correctAnswer = 0,
        explanation = "Die Schwedische Akademie konnte Dylan wochenlang nicht erreichen — er schwieg komplett, was weltweit für Aufsehen sorgte. Der Ständige Sekretär der Akademie nannte sein Verhalten 'unhöflich'.",
        difficulty = 3,
        funFact = "Dylan reichte seine Nobel-Vorlesung erst in letzter Minute ein — Preisgeld und Medaille hätte er verloren, wenn er sie nicht innerhalb von 6 Monaten hält."
    ),

    // Question 50 — Orhan Pamuk Istanbul
    // correct: B (1)
    Question(
        categoryId = 10,
        questionText = "Orhan Pamuk gründete ein Museum in Istanbul, das auf einem seiner Romane basiert. Wie heißt dieses Museum?",
        answerA = "Museum der Erinnerung",
        answerB = "Museum der Unschuld",
        answerC = "Pamuk-Museum Istanbul",
        answerD = "Museum des verlorenen Paradieses",
        correctAnswer = 1,
        explanation = "Das 'Museum der Unschuld' in Istanbul basiert auf Pamuks gleichnamigem Roman (2008) — er sammelte jahrelang Objekte für das Museum, bevor der Roman erschien.",
        difficulty = 3,
        funFact = "Pamuk erhielt für das Museum der Unschuld 2014 den European Museum Award — es gilt als eines der ungewöhnlichsten Literaturmuseen der Welt."
    )

)
