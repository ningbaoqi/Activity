### IntentFilter的匹配规则
#### action的匹配规则
+ 一个过滤规则中可以有多个action，那么只要Intent中的action能够和过滤规则中的`任何一个`action相同即可匹配成功；
#### category匹配规则
+ Intent中如果含有category，那么所有的category都必须和过滤规则中的其中一个category相同，换句话说，Intent中如果出现了category，不管有几个category，对于每个category来说，它必须是过滤规则中已经定义了的category；当然Intent中可以没有category，如果没有category的话，按照上面的描述，这个Intent仍然可以匹配成功；
#### data的匹配规则
+ 如果过滤规则中定义了data，那么Intent中必须也要定义了匹配的data；并且data数据能够完全匹配过滤规则中的某一个data；data由两个部分组成，mimeType和URI；mimeType指媒体类型，比如`image/jpeg`、`audio/mpeg4-generic`、`video/*`等；可以表示图片，文本，视频等不同的媒体格式；
```
//URI的结构
<scheme>://<host>:<port>/[<path>|<pathPrefix>|<pathPattern>]
```
