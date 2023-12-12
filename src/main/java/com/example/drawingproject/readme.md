# Основы компьютерной графики
***
Репозиторий содержит в себе все лабораторные работы за семестр,
запустить каждую из которых можно поменяв запускаемый класс в 
*[DrawingProjectApplication](DrawingProjectApplication.java)*.

Для отрисовки графики используется **[Processing](https://processing.org)**.

**[Github](https://github.com/micycle1/processing-core-4)** репозиторий с которого была взята зависимость.

<br>

#### Пару слов о реализации:
В пакете *[cutils](cutils)* лежат все структуры, которые использовались для реализации логики и вычислений.
Можно было бы определить их как интерфейс _Shape_ и абстрактными классами _Shape2D_, _Shape3D_, а для n-угольных
фигур использовать классы, которые будут принимать количество *[Points](cutils/Point.java)* которыми они 
задаются, но в данном случае это показалось overhead.

Для вычислений везде используется *double* для точности возможных функций, например, сравнение длины отрезков,
однако возвращает класс *[Point](cutils/Point.java)* именно *float*,
т.к. processing принимает аргументы только этого типа.

Так же все поля структур являются *package-private (default)* для сокращения кода непосредственно внутри этих классов.

Класс *[Task](Task.java)* использовался как темплейт для новых заданий.
***
## ЛР 1
*[Task 1](LR1/Task1_1.java)*


*[Task 2](LR1/Task1_2.java)*

![Result image](https://github.com/dirwul/DrawingProject/raw/main/images/1_2.png)


*[Task 3](LR1/Task1_3.java)*

![Result image](https://github.com/dirwul/DrawingProject/raw/main/images/1_3.png)


*[Task 4](LR1/Task1_4.java)*

![Result image](https://github.com/dirwul/DrawingProject/raw/main/images/1_4.png)
***
## ЛР 2
*[Task 1](LR2/Task2_1.java)*

![Result image](https://github.com/dirwul/DrawingProject/raw/main/images/2_1.png)


*[Task 2](LR2/Task2_2.java)*

![Result image](https://github.com/dirwul/DrawingProject/raw/main/images/2_2.png)


*[Task 3](LR2/Task2_3.java)*

![Result image](https://github.com/dirwul/DrawingProject/raw/main/images/2_3.png)


*[Task 4](LR2/Task2_4.java)*

![Result image](https://github.com/dirwul/DrawingProject/raw/main/images/2_4.png)


*[Task 5](LR2/Task2_5.java)*

![Result image](https://github.com/dirwul/DrawingProject/raw/main/images/2_5.png)


*[Task 6](LR2/Task2_6.java)*

![Result image](https://github.com/dirwul/DrawingProject/raw/main/images/2_6.png)

***
## ЛР 3
*[Task 1](LR3/Task3_1.java)*

![Result image](https://github.com/dirwul/DrawingProject/raw/main/images/3_1.png)


*[Task 2](LR3/Task3_2.java)*

![Result image](https://github.com/dirwul/DrawingProject/raw/main/images/3_2.png)

***
## ЛР 4
*[Task 1](LR4/Task4.java)*

![Result image](https://github.com/dirwul/DrawingProject/raw/main/images/4.png)