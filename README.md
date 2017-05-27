### 3 Sping Web MVC > 4_Slides_Spring_Web_MVC_i18n

Voorbeeld uit cursus

Om dit voorbeeld te kunnen uitvoeren zul je enkele talen moeten toevoegen aan je browser. Bij mij stond er standaard enkel Engels, en je zult zeker ook Duits moeten toevoegen. In de slides staat een screenshot van de instellingen voor Firefox. Voor Chrome zul je dit vinden onder Settings > Advanced Settings > Languages > Language and input settings...

**Extra notities (commit 2.1.2 Custom Error Messages):**
 - ValidationMessages.properties file wordt naar mijn ondervinding _automagically_ gevonden door Spring, maar je moet het wel in src/java/ zetten. Ik heb geprobeerd om het in src/java/resources/ te zetten en te laden zoals de andere .properties files via WebConfig, maar da pakte precies nie. So be warned.
 - Properties uit deze ValidationMessages overschrijven geen messages die al gedefinieerd staan in converter.properties . Meer info in comments van Registration klasse. Volgende commit zal dit fixen.
