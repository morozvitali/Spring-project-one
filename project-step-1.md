Що додали на git hub

Файл / Папка	                    Додавати?	        Пояснення
.gitignore	                        ✅	    важливий файл, фільтрує сміття
.gitattributes	                    ✅	    норм, використовується для налаштування обробки файлів
application.properties	            ✅	    конфігурація Spring Boot
pom.xml	                            ✅	    серце Maven-проєкту
TaskmanagerApplication.java	        ✅	    головний клас запуску Spring
TaskmanagerApplicationTests.java	✅	    автотести, можна залишити
mvnw, mvnw.cmd, .mvn/wrapper	    ✅	    Maven wrapper — дозволяє запускати Maven,
навіть якщо він не встановлений у системі. Це корисно!

🔧 Отже, ми маємо:

Репозиторій ініціалізовано          ✅
.gitignore налаштований             ✅
Конфігурація працює                 ✅
H2 консоль відкривається            ✅
Коміт і push пройшли                ✅

Тепер саме час додати Task як @Entity і зробити перший REST-запит POST /tasks