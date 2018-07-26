### Activity生命周期
#### Activity的四种状态

|状态|说明|
|------|------|
|运行状态|当前Activity位于前台，用户可见，可以获得焦点|
|暂停状态|其他Activity位于前台，该Activity依然可见，但是不能获得焦点|
|停止状态|该Activity不可见，失去焦点|
|销毁状态|该Activity结束，或Activity所在的进程被结束，它所储存的信息、成员变量就不存在了|

#### Activity生命周期
============pic-1.jpg============

#### Activity的回调方法说明

|方法|说明|
|------|------|
|onCreate(Bundle savedStatus)|创建Activity时被回调，该方法只能被调用一次|
|onStart()|启动Activity时被回调，该Activity看见了，但是没有获取焦点|
|onResume()|恢复Activity时被回调，在onStart()方法后一定会回调onResume()方法，Activity可见状态并获取了焦点|
|onRestart()|重新启动Activity时被回调|
|onPause()|暂停Activity时被回调，Activity可见但是没有获得焦点|
|onStop()|停止Activity时被回调，Activity不可见，在后台运行|
|onDestroy()|销毁Activity时被回调，该方法只能被调用一次，可以做回收工作和资源的释放|

```
Activity A 启动：->oncreate->onstart->onresume
这时启动Activity B 会调用->A.onPause(因为需要将A设置为不能获取焦点状态)->B.oncreate->B.onstart->B.onResume->A.onStop
这时单击back键会调用 B.onPause ->A.onrestart->A.onStart->A.onResume->B.onStop->B.onDestroy
```

```
Activity横竖屏切换生命周期：oncreate->onstart->onresume
换方向 onpause->onstop->ondestory->oncreate->onstart->onresume

可以在onSaveInstanceState方法中保存信息，然后在onCreate方法中进行判断拿取，其中onSaveInstanceState方法在onpause之后，在onstop之前调用;onSaveInstanceState该方法只有在异常终止的情况下才会调用；官方文档推荐使用onRestoreInstanceState方法去恢复数据，因为在该方法的参数不为null的时候才会被调用，而onCreate需要进行判断；

```
#### Android进程优先级

|进程类别|说明|
|------|------|
|前台进程|如正在与用户交互的Activity，和该Activity绑定的Service|
|可见进程|如Activity可见，但是不是在栈顶的情况下|
|服务进程|在后台开启的Service|
|后台进程|如按下了Home按键，该进程就变成了后台进程，会根据内存情况做相应的回收|
|空进程|最低优先级，不是以上四种情况的进程|
