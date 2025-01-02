## 没有在服务端经过测试，请自行承担可能的风险
### 施工中
### 需要[Architectury](https://modrinth.com/mod/architectury-api) !!!
## 自 0.5.3 （原mod最后一个版本） 之后的特性/改动
### v0.7.1 已经实现的特性/改动:
- **关闭野生宝可梦主动攻击** 我个人不喜欢这个特性，宝可梦无时无刻不在刷，尽管不是所有宝可梦都会主动攻击，但是当主动攻击开启时你很容易就会获得在朱/紫被肯泰罗群殴的糟糕的游戏体验。 当然你要想开可以在config中打开
- **更低的最高伤害值:** 我看到有人在curseforge页面上说宝可梦伤害太高了，所以我把最高伤害的默认值调低了。作为补偿，达到最高伤害所需的能力值也被调低了。你也可以使用config进一步调整
- **可配置的敌意:** 加了一个系数来影响等级在仇恨计算里的影响.
- **更快的宝可梦:** 速度能力值高的宝可梦跑得快.(可以在config里调整, Cobblemon的基础移速比较低，速度低的时候不明显.)
- **远程攻击！:** 为特攻手添加了远程攻击.
- - 野生宝可梦被禁止使用远程攻击.(可以在config中设置)
- **不同的远程攻击方式:** 宝可梦使用的技能会影响攻击方式
- - 技能的属性和威力会影响攻击的伤害和效果。如果宝可梦没有相关技能则选择第一属性并用60威力攻击（注：由于后续更新，现在默认使用第一技能，因此该设定部分失效）(可以在config设置).
- - 大部分弹类技能（能被防弹特性无效化的技能）会产生小爆炸.
- - 声音类/波动类技能用了类似原版守卫者的攻击方式，威力略微低于同威力不同类型的技能，但很难躲过。
- - 技能分类不严格按照游戏(比如说，归天之翼（死亡之翼）在游戏中的表现方式是伊裴尔塔尔向目标射出光束，因此在本mod中使用了跟波动类技能一样的效果。这些写在config里，你可以自己修改。）
- 玩家的宝可梦默认使用第一个技能。用宝可杖设置你想要用的技能，甚至可以让特攻手近战！(用JEI或别的mod查合成配方)
- **技能特殊效果** 
- - 瞬间移动会让惊慌的宝可梦传送.(can be disabled in the config)
- - 使用急速折返等技能的宝可梦击中目标（近战）/射出投射物（远程）后自动收回
- - 爆炸类技能会产生爆炸。
- - 吸血类技能有吸血效果。
- - 特攻的接触类技能是近战攻击。伤害结算使用特攻。(举个栗子，吸取之吻) 
- - 大部分物理弹类技能使用投射物而不是近战，伤害结算使用物攻(冰球和磁力炸弹都是球和弹类招式。但根据技能效果来看我不认为它需要射什么物体，但磁力炸弹确实射了个炸弹。所以冰球默认并没有射投射物的设定)
- **被宝可梦击杀的生物掉落物与被驯服的狼击杀类似（即可以爆经验等）**
- Your pokemon can gain experience and ev by killing pokemon without starting a pokemon battle(needs to be **the last mob** that deals the damage,can be disabled in the config)
- Your pokemon can evolve by using the move to hit other mobs instead of starting a Pokemon Battle(e.g. Primeape needs to use Rage Fist 20 times to evolve,now you can do it without a traditional Pokemon Battle)(Configurable).
- Adds the Oran Lucky Egg(held item) to gain more experience from pokemon killed by your pokemon,right-click your pokemon while sneaking to give the item to the pokemon.(**The Oran Lucky Egg won't give you extra xp from any other ways!**)
- **动画支持** 支持Cobblemon的技能动画(这些动画不是为了这个mod设计的，看着怪很正常)
- 你的宝可梦可以嘲讽攻击你的宝可梦(玩家的宝可梦不吃嘲讽)
- - 需要特殊技能(挑衅,看我嘛,愤怒粉,无理取闹) (可以在config禁用)
- Pokemon with higher defense stat can lower the damage it take.(configurable)
- A new hotkey to let your pokemon start a battle with the pokemon that tries to attack you.（not working currently)
- 部分特性（威吓，压迫感，紧张感）会降低野生宝可梦敌意。
- 具甲武者一家血量在一半以下时受到伤害会免疫这次伤害并被收回。
* 地震等aoe在击中目标时会伤害附近的实体.(会导致特殊攻击变成近战)
* **非宝可梦实体的属性克制** 这些效果并不严格遵守宝可梦的规则，相反，它们更加接近Minecraft本身：
* * 水系伤害对接触水受伤的生物造成更多伤害
* * 火系伤害对免疫火系的生物伤害降低(默认x0.1，设置成0可能令新玩家困惑).
* * 冰系伤害对不接受冰冻伤害的生物伤害降低(还是 x0.1).
* * 冰系伤害对更容易收到冰冻伤害的生物更加有效(烈焰人、岩浆怪等).
* * 毒系伤害对亡灵生物伤害降低.(依然是x0.1)
* 血量机制重做
* * 用了mixin来“替换”Cobblemon自己基于种族值而不是能力值的实体血量计算，如果你不喜欢我的改动的话将config/fightorflight.json5里的shouldOverrideUpdateMaxHealth设置为false来禁用它.
* * 宝可梦实体的血量不再由种族值决定而是由能力值决定。
* * 对宝可梦实体造成伤害会导致宝可梦血量下降，治疗实体也会治疗宝可梦本身(建议使用 [Healing Campfire](https://modrinth.com/mod/healing-campfire)). (这个特性用到了前文提到的计算血量最大值的机制，禁用它会同时禁用本机制)
* * 注意：用道具治疗宝可梦本身不会给实体回血。请先收回宝可梦，喂回血道具，再放出来。
* 部分携带道具可以提供伤害增益(属性增强道具,讲究眼镜,讲究头带,力量头带,博识眼镜,生命宝珠)
* * 生命宝珠会像游戏里一样对宝可梦自身造成伤害.强行和魔法防守的宝可梦免疫这个伤害.
* 不同于主系列，强行会增强所有招式，但不会再有附加状态效果等特效（比如火系技能不会再让生物着火。
* 弹类弹射物会产生一个小爆炸，火系技能的爆炸会点燃地面(我自己不喜欢，默认关掉了，你要在config里手动启用。骚瑞。)
* 更多敌意相关设定
### Features that is not released currently(will be released after I fix the bug):
* 宝可梦实体免疫窒息伤害。(可以在config禁用)
* 非满血宝可梦不会尝试逃跑(可以在config禁用).
- 不多。我最近有点忙所以开发速度会减慢。
## TODO
- Attack Position for Poke Staff(not available currently. It is quite difficult.)
- Give more special effects to different moves.
- Special effect for status moves. (Most of the status moves has no effect currently,they can be used as a way to make your pokemon passive.)
- Special effect for abilities like aftermath,bulletproof,soundproof,etc.
- More config options for fight of flight choices.
- Type effectiveness for Pokemon entities:There doesn't seem to be a built-in type modifier list in Cobblemon,the data might be sent to showdown to process,which means I should spend some time to add it myself and test it.
- Use the berry/heal items that heal the pokemon to heal the Pokemon entity(The healing items don't share a unique base class, they just extends PokemonSelectingItem(the base class for many items that can open the party menu and select a Pokemon to use). I don't think adding the mixin to every class and implements an interface is a good idea.)
- The pp of the pokemon moves will be consumed after using it outside the battle(this feature could make the pokemon obviously weaker at the early game and the moves don't need to be balanced that way currently, so I won't work on it until the mod got cool enough.)
## Known Issues
- 电球这类需要双方能力值计算的技能威力无法正常计算(我目前还不确认怎么处理对非宝可梦实体使用这些招式的伤害计算所以直接一刀切了)
- 爆炸伤害的计算可能没有按照招式类型计算
### Known issues for 1.21.1 version(not released yet)
- 我原本加的快捷键不管用，目前尚未弄清楚原因。
## 如何使用宝可杖
1. 合成一个宝可杖/创造拿.
2. 潜行右键切换模式  
右键:给宝可梦发送指令/选择技能槽（此时尚未确认，需要发送指令）/选择命令