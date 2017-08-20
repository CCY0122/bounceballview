# bounceballview
android小球自由落体弹跳动画效果的自定义控件<br/>

效果图：
====
<br/>(因为gif图被压缩的原因动画看起来有点不流畅）<br/>

![image](https://github.com/CCY0122/bounceballview/blob/master/bounceball1%20(2).gif)
<br/>
使用方法：
====
**XML:**<br/>
```
   <com.example.ccy.bounceballview.BounceBallView
        android:id="@+id/bbv1"
        android:layout_width="match_parent"
        android:layout_height="140dp"
        android:background="#ffffff"
        app:anim_duration="3300"
        app:ball_count="15"
        app:ball_delay="220"
        app:bounce_count="3"/>
```
<br/>可用的属性：
------

* bounce_count :小球弹跳次数 
* ball_color:小球颜色
* ball_count:小球数量
* ball_radius:小球颜色
* ball_delay:小球出现时间间隔（当小球数大于1时）
* anim_duration:小球一次动画时长
* physic_mode : 开启物理效果（下落加速上升减速）
* random_color: 开启小球颜色随机
* random_radius: 开启小球大小随机（在基础大小上下浮动）
* random_path: 开启小球路径随机（在基础路径坐标上下浮动）
<br/>

**也可以在代码中进行配置:**<br/>

```
bbv1 = (BounceBallView) findViewById(R.id.bbv1);
bbv.config()
     .ballCount(15)
     .bounceCount(3)
     .ballDelay(220)
     .duration(3300)
     .radius(15)
     .isPhysicMode(true)
     .isRamdomPath(true)
     .isRandomColor(true)
     .isRandomRadius(true)
     .apply();

```

<br/>

**最后开启动画:**<br/>

```
 bbv1.start();
```

欢迎star,欢迎交流。
<br/><br/><br/>
**将该控件应用于加载框，还是很美观的：**<br/>
![image](https://github.com/CCY0122/bounceballview/blob/master/bounceball3%20(2).gif)

