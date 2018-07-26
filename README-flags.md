### Activity的Flags
+ 应用中最好不要使用标志位，因为是系统使用的，应用中设置了标志位可能会出现莫名其妙的问题；

|标志位|说明|
|------|------|
|FLAG_ACTIVITY_NEW_TASK|作用是为Activity指定SingleTask启动模式|
|FLAG_ACTIVITY_SINGLE_TOP|作用是为Activity指定SingleTop启动模式|
|FLAG_ACTIVITY_CLEAR_TOP|具有此标志位的Activity，当它启动时，在同一个任务栈中所有位于它上面的Activity都要出栈，这个标志位一般会和singleTask启动模式一起出现|
|FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS|具有这个标志位的Activity不会出现在历史Activity的列表中，当某些情况下我们不希望用户通过历史列表回到我们的Activity的时候这个标记比较有用，它等同于在XML中执行Activity的属性android:excludeFromRecents="true"|
