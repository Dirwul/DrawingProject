# Основы компьютерной графики
***
Репозиторий содержит в себе все лабораторные работы за семестр,
запустить каждую из которых можно поменяв запускаемый класс в 
*[DrawingProjectApplication](src/main/java/com/example/drawingproject/DrawingProjectApplication.java)*.

Для отрисовки графики используется **[Processing](https://processing.org)**.

**[Github](https://github.com/micycle1/processing-core-4)** репозиторий с которого была взята зависимость.

<br>

#### Пару слов о реализации:
В пакете *[cutils](src/main/java/com/example/drawingproject/cutils)* лежат все структуры, которые использовались для реализации логики и вычислений.
Можно было бы определить их как интерфейс _Shape_ и абстрактными классами _Shape2D_, _Shape3D_, а для n-угольных
фигур использовать классы, которые будут принимать количество *[Points](src/main/java/com/example/drawingproject/cutils/Point.java)* которыми они 
задаются, но в данном случае это показалось overhead.

Для вычислений везде используется *double* для точности возможных функций, например, сравнение длины отрезков,
однако возвращает класс *[Point](src/main/java/com/example/drawingproject/cutils/Point.java)* именно *float*,
т.к. processing принимает аргументы только этого типа.

Так же все поля структур являются *package-private (default)* для сокращения кода непосредственно внутри этих классов.

Класс *[Task](src/main/java/com/example/drawingproject/Task.java)* использовался как темплейт для новых заданий.
***
## ЛР 1
*[Task 1](src/main/java/com/example/drawingproject/LR1/Task1_1.java)*


*[Task 2](src/main/java/com/example/drawingproject/LR1/Task1_2.java)*

![Result image](https://github.com/Dirwul/DrawingProject/blob/main/src/main/resources/images/1_2.png)


*[Task 3](src/main/java/com/example/drawingproject/LR1/Task1_3.java)*

![Result image](https://github.com/Dirwul/DrawingProject/blob/main/src/main/resources/images/1_3.png)


*[Task 4](src/main/java/com/example/drawingproject/LR1/Task1_4.java)*

![Result image](https://github.com/Dirwul/DrawingProject/blob/main/src/main/resources/images/1_4.png)
***
## ЛР 2
*[Task 1](src/main/java/com/example/drawingproject/LR2/Task2_1.java)*

![Result image](https://github.com/Dirwul/DrawingProject/blob/main/src/main/resources/images/2_1.png)


*[Task 2](src/main/java/com/example/drawingproject/LR2/Task2_2.java)*

![Result image](https://github.com/Dirwul/DrawingProject/blob/main/src/main/resources/images/2_2.png)


*[Task 3](src/main/java/com/example/drawingproject/LR2/Task2_3.java)*

![Result image](https://github.com/Dirwul/DrawingProject/blob/main/src/main/resources/images/2_3.png)


*[Task 4](src/main/java/com/example/drawingproject/LR2/Task2_4.java)*

![Result image](https://github.com/Dirwul/DrawingProject/blob/main/src/main/resources/images/2_4.png)


*[Task 5](src/main/java/com/example/drawingproject/LR2/Task2_5.java)*

![Result image](https://github.com/Dirwul/DrawingProject/blob/main/src/main/resources/images/2_5.png)


*[Task 6](src/main/java/com/example/drawingproject/LR2/Task2_6.java)*

![Result image](https://github.com/Dirwul/DrawingProject/blob/main/src/main/resources/images/2_6.png)

***
## ЛР 3
*[Task 1](src/main/java/com/example/drawingproject/LR3/Task3_1.java)*

![Result image](https://github.com/Dirwul/DrawingProject/blob/main/src/main/resources/images/3_1.png)


*[Task 2](src/main/java/com/example/drawingproject/LR3/Task3_2.java)*

![Result image](https://github.com/Dirwul/DrawingProject/blob/main/src/main/resources/images/3_2.png)

***
## ЛР 4
*[Task 1](src/main/java/com/example/drawingproject/LR4/Task4.java)*

![Result image](https://github.com/Dirwul/DrawingProject/blob/main/src/main/resources/images/4.png)