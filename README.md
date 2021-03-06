# Практична робота "Створення і використання статичних методів"
## 24.Розрахувати поточне (на сьогоднішній день) значення біоритмів людини за заданою датою народження
Самопочуття людини залежить від циклів його біоритмів: фізичного – здатність до фізичних навантажень; емоційного – настрій; інтелектуального – розумова діяльність.

Кожен біоритм змінює своє значення у часі від найсприятливішого до мінімального. Біоритми змінюються циклічно, але з синхронно. Цикл для фізичного біоритму становить 23 дні, для емоційного – 28, а для інтелектуального – 33 дні.

Для побудови графіка біоритмів потрібно задати дату народження (осередок В1) та дату початку розрахунку (осередок В2)
Формула для обчислення фізичного стану:

![](https://latex.codecogs.com/svg.latex?=sin(2*\pi*(Date-BirthDate)/23))

Для розрахунку емоційного стану число 23 необхідно замінити на 28, а інтелектуального – на 33.

-----------
**TestResult.java**

Запитуємо коли у вас день народження та потім виводимо значення ваших біоритмів на поточну дату.
<img src="https://github.com/ppc-ntu-khpi/java-methods-Kazumasik/blob/master/1.png" width="100%"/>

**Exercise.java**

Спочатку за допомогою класу Date дізнаюсь поточну дату, потім переводимо дату народження користувача у потрібний формат. За допомогою формули переводимо різницю в датах з мілісекунд в дні. Цю різницю підставляємо у формули біоритмів людини і виводимо отримані результати.
<img src="https://github.com/ppc-ntu-khpi/java-methods-Kazumasik/blob/master/2.png" width="100%"/>
