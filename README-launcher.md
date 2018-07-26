### Activity启动模式

+ 配置Activity时可以指定`android:launchMode`属性，该属性用于配置该Activity的启动模式：

|属性值|说明|
|------|------|
|standard|`标准模式`，这是默认的加载模式；每次通过这种模式来启动Activity时，`Android总会为目标创建一个新的实例，并将该Activity添加到当前Task栈中`，这种模式不会启动新的Task，新Activity将被添加到原有的Task中|
|singleTop|`Task栈顶单例模式`；当将要启动的目标Activity已经位于Task栈顶时，系统不会重新创建目标Activity的实例，而是直接复用已有的Activity实例，会`调用onNewIntent方法`；如果将要启动的目标Activity没有位于Task栈顶，此时系统会重新创建目标Activity的实例，并将它加载到Task栈顶，此时与standard模式完全相同|
|singleTask|`Task内单例模式`；采用这种加载模式的Activity在同一个Task内只有一个实例，当系统采用该模式，启动目标Activity时，可能分为三种情况：1、如果将要启动的目标Activity不存在，系统将会创建该Activity的实例，并将它加入Task栈顶；2、如果将要启动的目标Activity已经位于Task栈顶，此时与singleTop模式的行为相同；3、如果将要启动的目标Activity已经存在，但并没有位于栈顶，系统将会`调用onNewIntent方法`并把位于该Activity上面所有的Activity移除Task栈，从而使得目标Activity位于栈顶|
|singleInstance|`全局单例模式`；在这种加载模式下，系统保证无论从哪个Task中启动目标Activity，只会创建一个目标Activity实例，并会使用一个全新的栈来加载该Activity实例；当采用该启动模式来启动目标Activity时，有以下两种情况：1、如果将要启动的目标Activity不存在，系统会先创建一个全新的Task栈，再创建目标Activity的实例，并将它加入新的Task栈顶；2、如果将要启动的目标Activity已经存在，无论它位于哪个应用程序中，位于哪个Task中，系统都会把该Activity所在的栈转到前台并`调用onNewIntent方法`，从而使得该Activity显示出来；需要指出的是：使用该加载模式的Activity总是位于Task栈顶，且采用该加载模式的Activity所在的Task栈将只包含该Activity|

+ Android的Task是一个有点麻烦的概念，因为Android并没有为Task提供API，因此，开发者无法真正去访问Task，只能调用`Activity的getTaskId()方法来获取它所在的Task的ID`；正常的生命周期不会调用该方法`onNewIntent`，但是在Activity切换的时候将会调用该方法；而且模式是：`singleTop`、`singleTask`、`singleInstance`；

### Android的任务栈
![image](https://github.com/ningbaoqi/Activity/blob/master/gif/pic-2.jpg) 
