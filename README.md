# Object Oriented Programming Lab Test 1 2017

## Rules of the test
- This is an open book test. You can use any of your own sketches, any of the examples from [the course website](https://github.com/skooter500/OOP-2017-2018) or the [Processing reference](https://processing.org/reference/) during the test.
- No conferring or collaboration.
- No use of Google, Facebook or any any other web resources permitted.
- There are marks going for correct use of git, but I recommend that you save regularly and also submit a zipped copy of your test through websourses when you are finished just to be safe.

## Instructions

You will be making a prototype till system for a new Dublin cafe called [Cafe Rubis]() that's located on 9 Parliament St. Come and check it out sometime.

- Here is a video of the sketch you will be making today:

  [![Video](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](http://www.youtube.com/watch?v=J2kHSSFA4NU)

- Start with a blank sketch. Set the drawing window size to be 800 x 600.
- Name the sketch CafeRubis and commit it to a new, public git repository called CafeRubis under your own GitHub account.
- Put your name and student number into the sketch comments.
- Download [this CSV file](HabHYG15ly.csv) to the data folder of your sketch folder. The file contains data on the products that Cafe Rubis sells.

- Create a class called ```Product``` with a field for name of type String and a field for price of type float
- Write a constructor on the Product class that takes a ```TableRow``` as a parameter and assigns the fields in the class from the appropriate columns in the ```TableRow```. You might want to look at [this page from the Processing reference](https://processing.org/reference/TableRow.html) if you need to know how a ```TableRow``` works.
- Declare two global ```ArrayList```s of ```Product``` objects and call them ```products``` and ```bill```.
- Write a function called ```loadData``` that loads the data from the file and populates the products ```ArrayList```. Call this from ```setup```.
- Write a function called ```printProducts``` that prints the contents of the ```ArrayList``` after it has been loaded. You should make a ```toString``` method on the ```Product``` class to help you do this. Call this from setup after you load the data to make sure it gets loaded correctly.
- Write a function called ```drawProducts``` that draws the product menu that can be seen on the left side of the screen. You can use the function [```nf```]() to format the price to two decimal places. You can use the function [```textAlign```]() to align text to the left or right.
- Write code for the mousePressed function that allows the user to click on a product and have it added to the bill ArrayList.
- Write code for a function called ```drawBill``` that draws the bill to the screen as per the video. 
