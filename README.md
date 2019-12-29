# Sociological Game - _Lost in Crowds_

## Team structure and roles 
+ Taichi Aso- logic_designer,note taker, documentation checker
+ Xiang Li - networker, morale builder
+ Xiaorong Ma - app state, graphics rendering

## Game Overview 
![](Assets/thumb.png)
A journey to explore people’s influence on society. During the journey, we will face different puzzles. They can draw or cut the friendship among people to spread the things around the whole world. Our user could choose to register an account or just skip. There are three puzzles for them to solve and one sandbox for them to self-design the puzzle.  

# Design summary
## OverView
![Package_lostincrowds.svg](uploads/3e4012e9aaf61f6e8334794d3f6a0768/Package_lostincrowds.svg)  
*This game is inspired by the “The Wisdom and/or Madness of Crowd”. This is a web page game, so we decided to make it into an android app.*  
  
   In this game, the basic item is the faces, we defined in the UI as the MyImageView. Once your connection could spread the whole world, you will solve the puzzle. Different things have a different spread percentage. Only it above the percentage, it could be spread. Also once the whole puzzles are solved, there is a sandbox for them to define their own world.  
  
   We build the database and create the server to store the players information. So we can memorize the levels for different players. Also for the player who don’t want to register, they could skip and go for the game.
There is a level_board to record the different player’s completeness. 
   
  **Our goal to write this game is that player could realize how we are influenced by others in the true society and it is inevitable through this game.**

## UI Design  
![Package_UI](uploads/ba92b6f7ebfb6bcfe721d9a4af7cca2e/Package_UI.png)

## NetWork Design  
![Package_Network.svg](uploads/53dfebef0e8a51f24ec95ad6465dedc1/Package_Network.svg)  

## Puzzle Design
![Package_Puzzle](uploads/c612efcadec6f8d6e7e463ffd6d74c09/Package_Puzzle.png)

# Testing Summary
We implemented a number of testings to ensure the performance of the app is what we expect, the behaviour would be straightforward for users, and the inner algorithms perform precisely. We applied the black-box testing and white-box testing to make sure the app satisfies both of the functional requirements and some of the test cases for the algorithm.

## Black-Box Testing

### App Behavior
We have tried multitudinous combinations of possible inputs on the introduction, the login screen, and each puzzle to check our UI is uncomplicated for users and performs well. Based on the outcome of a number of black box testings, we improved some aspects of UI and fixed minor issues.

### Screen Adaptability
In order to make sure the app runs correctly on different size of screens, we tested on several types of emulators. As a result, the app works well on each device and the size and position of objects adjust to the screen size. Here are some of the screenshots of the testing.<br>
**Virtual machine**
* [x] Pixel XL
* [x] Pixel N5
* [x] Table C  

**Real machine**
* [x] Samsung s8
* [x] Huawei P20pro

![Screen_Shot_2019-05-24_at_2.31.33_am](uploads/c319805ddfcea80c9ba814bee9be9ca9/Screen_Shot_2019-05-24_at_2.31.33_am.png)
![Screen_Shot_2019-05-24_at_3.07.04_am](uploads/f8275ddad4a9f752521879066353b75d/Screen_Shot_2019-05-24_at_3.07.04_am.png)

![Screen_Shot_2019-05-24_at_2.32.22_am](uploads/77b8ae70d5b89ea7aaffa6e384606725/Screen_Shot_2019-05-24_at_2.32.22_am.png)
![Screen_Shot_2019-05-24_at_3.08.23_am](uploads/94952e6879e59d92805294837ecf230d/Screen_Shot_2019-05-24_at_3.08.23_am.png)
![Screen_Shot_2019-05-24_at_2.57.04_am](uploads/6571117e383134159449091f794e81ca/Screen_Shot_2019-05-24_at_2.57.04_am.png)
### LoginActivity AutoTest  
![csvst-fa2qy](uploads/9f99689b24830b3ebc81b715cc10d900/csvst-fa2qy.gif)
## White-Box Testing
We implemented white-box testing to Crowds.java which contains the foundation algorithms for the app and functions relating to them. We used Junit5 for the testing and directly tested the functions to check if the output values are correct and some of the information that is appeared on the game activities are precisely updated. More specifically, when each object connects to others, the line is cut off, and the simulate button is pressed, the values are frequently changed, so we tested if the calculation was exact.
The testing file, which is called CroudsUnitTest.java, is under the androidTest folder.
* [x]  testSimulation
* [x]  testConnect
* [x]  testDeletePerson
* [x]  testAddPerson

### Inspiration
_The game is inspired by a Website called "[The Wisdom and/or Madness of Crowds](https://ncase.me/crowds/)"_  
- - -     
### Aseets
_Lost in Crowds_ thanks to Creative Commons resources/Open sources libs:

**Music:** ["Friends 2018" and "Friends 2068"](http://freemusicarchive.org/music/Komiku/Tale_on_the_Late/) by Komiku (CC Zero)

**Picture:** [Crowds](https://ncase.me/crowds/)    by Nicky Case

**Font:** [Patrick Hand](https://fonts.google.com/specimen/Patrick+Hand) by Patrick Wagesreiter    

**Effect:** [Slice](https://github.com/dengciping0716/FruitSliceView) by dengciping0716  

**Lib:**  
*  [NiftyDialogEffects](https://github.com/sd6352051/NiftyDialogEffects) by Litao
*  [EasySplashScreen](https://github.com/pantrif/EasySplashScreen) by Leonidas Maroulis  
*  [JumpingBeans](https://github.com/frakbot/JumpingBeans)  by Sebastiano Poggi 
*  [NumberProgressBar](https://github.com/daimajia/NumberProgressBar) by daimajia
*  [Android additive animations](https://github.com/wirecube/android_additive_animations) by David Ganster
