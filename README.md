# epam-lab-homework-3-Hospital

Spring_3 Web MVC Homework

Required:
1.	Migrate functionality related to core business logic of Servlet-based application to newly created Spring MVC project adapting the old one to the correct package structure, naming conventions, etc.:
	get rid of all JSP views (now your service will be consuming and populating only JSON text format)
	make your service RESTful (don't implement HATEOAS logic for now. It will be accomplished in the scope of next lecture)
	the best approach is to start from the scratch and create an empty Spring Boot project using the 'Spring Initializr'.
	avoid code copypaste from the old project, unless it relates to the business logic.
2.	Create DTO classes and use them at the controller level.
3.	Add logging to all layers of the application.

Optional (would be a great plus):
1. Use any of available open source mapping tool in order to remap from business classes to DTO and vice versa (BeanUtils, MapStruct, etc.)



---------
Лікарня

Адміністратору системи доступний список Лікарів за категоріями (педіатр, травматолог, хірург, ...) і список Пацієнтів. Реалізувати можливість сортування:
1) пацієнтів:
- за алфавітом;
- за датою народження;
2) лікарів:
- за алфавітом;
- за категорією;
- за кількістю пацієнтів.

Адміністратор реєструє в системі пацієнтів і лікарів і призначає пацієнтові лікаря.
Лікар визначає діагноз, робить призначення пацієнту (процедури, ліки, операції), які фіксуються в Лікарняній картці. Призначення може виконати Медсестра (процедури, ліки) або Лікар (будь-яке призначення).
Пацієнт може бути виписаний з лікарні, при цьому фіксується остаточний діагноз.

(Опціонально: реалізувати можливість збереження / експорта документа з інформацією про виписку пацієнта).