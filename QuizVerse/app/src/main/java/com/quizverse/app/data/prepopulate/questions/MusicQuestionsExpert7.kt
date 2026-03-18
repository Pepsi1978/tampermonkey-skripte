package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun musicQuestionsExpert7(): List<Question> = listOf(

    Question(
        categoryId = 5,
        questionText = "Welches Stimmungssystem teilte die Oktave in 31 gleiche Stufen und wurde im 16. Jahrhundert von Nicola Vicentino theoretisch begruendet, um chromatische und enharmonische Intervalle der griechischen Antike wiederzubeleben?",
        answerA = "Gleichstufige Zwoeflton-Stimmung (12-TET)",
        answerB = "Meantone-Stimmung (Mitteltoenige Stimmung)",
        answerC = "31-Ton-Gleichstimmung (31-TET)",
        answerD = "Pythagoraeische Stimmung",
        correctAnswer = 2,
        explanation = "Nicola Vicentino beschrieb in 'L'Antica Musica Ridotta alla Moderna Prattica' (1555) ein 31-stuefiges Tonsystem, das die drei griechischen Tongeschlechter (diatonisch, chromatisch, enharmonisch) vereinen sollte. Die mathematisch praezise 31-TET-Stimmung liefert eine hervorragende Naeherung an die reine Quinte und grosse Terz zugleich und wurde im 20. Jahrhundert von Adriaan Fokker in den Niederlanden wiederbelebt.",
        difficulty = 4,
        funFact = "Adriaan Fokker liess 1951 in Amsterdam eine Orgel mit 31 Toenen pro Oktave bauen — das sogenannte 'Fokker-Orgel'. Es steht heute im Muziekgebouw aan 't IJ und kann noch gespielt werden. Fuer das System existiert eine eigene Notenschrift mit zusaetzlichen Versetzungszeichen fuer Vierteltoen-Erhoehungen und -Erniedrigungen."
    ),

    Question(
        categoryId = 5,
        questionText = "Der franzoesische Komponist Charles-Valentin Alkan schrieb in seiner Etuedensammlung op. 39 eine vollstaendige Sinfonie und ein Konzert — jedoch nicht fuer Orchester. Fuer welches Medium sind diese Werke konzipiert?",
        answerA = "Fuer zwei Klaviere (Klavierduett)",
        answerB = "Fuer Soloklavier (beide Werke komplett fuer eine Hand)",
        answerC = "Fuer Soloklavier (Sinfonie: Etueden Nr. 4-7, Konzert: Etueden Nr. 8-10)",
        answerD = "Fuer Klavier und Streichquartett",
        correctAnswer = 2,
        explanation = "Alkans zwoefl Etueden op. 39 enthalten versteckt zwei grossangelegte Werke: Die Etueden Nr. 4 bis 7 bilden eine viersaetzige Sinfonie, die Etueden Nr. 8 bis 10 ein dreisaetziges Klavierkonzert — alles fuer Soloklavier allein. Das 'Konzert' simuliert Tutti- und Solopassagen durch Registrierung und Texturwechsel und gilt als eines der technisch anspruchsvollsten Klavierwerke des 19. Jahrhunderts.",
        difficulty = 4,
        funFact = null
    )

)
