### 设置系统属性改变时防止调用生命周期方法

```
<!--在没有设置 configChanges 属性的时候，从竖屏到横屏，会调用生命周期方法，onPause->onStop->onDestory->onCreate->onStart->onResume重新调用,如果不想调用生命周期方法时，需要使用 configChanges 设置属性-->
<activity android:name=".FourthActivity"
    android:configChanges="orientation|screenSize"
    android:launchMode="singleInstance">
```

|属性值|说明|
|------|------|
|mcc|SIM卡唯一标识IMSI国际移动用户识别码中的中国代码，由三个数字组成，中国为460，此项标识mcc代码发生了变化|
|mnc|SIM卡唯一标识IMSI国际移动用户识别码中的运营商代码，由两位数组成，中国移动TD系统为00，中国联通为01，中国电信为03，此项识别mnc发生变化|
|locale|设备的本地位置发生了变化，一般指切换了系统语言|
|keyboard|键盘类型发生了变化，比如用户使用了外插键盘|
|leyboardHidden|键盘的可访问性发生了变化，比如用户调出了键盘|
|navigation|系统导航方式发生了变化，正常情况下无法发生，可以忽略它|
|screenLayout|屏幕布局发生了变化，比如采用了轨迹球导航、很难发生，可忽略|
|fontScale|系统字体缩放比例发生了变化，比如用户选择了一个新字号|
|uiMode|用户界面模式发生了变化，比如用户选择了一个新字号|
|orientation|屏幕方向发生了变化，这个是最常用的，比如旋转了手机屏幕|
|screenSize|当屏幕的尺寸信息发生了变化，当旋转设备屏幕时，屏幕尺寸会发生变化|
|smallestScreenSize|设备的物理屏幕尺寸发生变化，这个项目和屏幕的方向没关系，仅仅表示在实际的物理屏幕的尺寸改变的时候发生|
|layoutDirection|当布局方向发生变化，这个属性用的比较少|
