package xin.lrvik.datacenter

import android.util.Log
import com.google.gson.Gson
import org.junit.Test

import org.junit.Assert.*
import xin.lrvik.datacenter.parser.impl.KKWParser

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, (2 + 2).toLong())
    }

    val html = """<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no" id="viewport" name="viewport">
<title>最新电视剧电影_免费在线电影,电视剧大全在线观看  - 看看屋手机版</title>
<meta name="keywords" content="">
<meta name="description" content="">
<script src="/js/uaredirectformobile.js" type="text/javascript"></script>
<script type="text/javascript">uaredirect("http://www.kankanwu.com");</script>
<link type="text/css" rel="stylesheet" href="/static/css/index.css" />
<link rel="shortcut icon" href="/favicon.ico" charset="utf-8" />
<script type="text/javascript">var Root='/';var Sid='';var Cid='';var Id='';</script>
<script type="text/javascript" src="/static/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="/static/js/jquery-lazyload.js"></script>
<script type="text/javascript" src="/static/js/jquery.base.js"></script>
<script type="text/javascript" src="/static/js/home.js"></script>

</head>
<body>
<header id='test' class="header clearfix">
   <a href="/" target="_self" class="logo"></a>
        <a href="javascript:void(0);" target="_self" class="aHeaderSearch top_search_btn"><i class="globalIcon searchIcon"></i><em>全网搜索</em></a>
   <a href="/top.html" target="_self" class="aHeaderFun"><i class="globalIcon userIcon"></i><span>榜单</span></a>
   <p class="headerChannelList">
<a class="current" target="_self" href="/">首页</a>
<a  target="_self" href="/dsj/index.html">电视剧</a><a  target="_self" href="/dy/index.html">电影</a><a  target="_self" href="/Animation/index.html">动漫</a><a  target="_self" href="/Arts/index.html">综艺</a><a  target="_self" href="/microfilm/index.html">微电影</a> <a href="/top.html" target="_self">榜单</a>
  <a href="/new.html" target="_self">最新</a>
<a href="/zhuanti/" target="_self">专题</a>
  </p>
<section class="searchPop popShow">
<section class="searchCon">
<form id="search" name="search" action="/vod-search" method="post" onSubmit="return qrsearch();">
<span class="sSearchInput"><input autocomplete="off" autovalue="请输入片名或主演名" class="searchInput" placeholder="请输入片名或主演名" type="search" id="wd" name="wd">
</span>
<input class="cancelInput1" value="取消" type="button">
<input type="submit" id="searchbutton" class="cancelInput" value="搜索">
</form></section>
<section class="search_hotkey">
		<section class="th"><span class="sMark">热门搜索</span>
		</section>
		<section class="tb">
		<p class="pHistory clearfix">
<a href="/Action/zhanlang2/" target="_self">战狼2 完整版</a><a href="/Animation/huajianghuzhifengyuzhou/" target="_self">画江湖之风语咒</a><a href="/Animation/haizeiwang/" target="_self">海贼王</a><a href="/Domestic/wuxinfashi2/" target="_self">无心法师2</a><a href="/Domestic/doupocangqiong/" target="_self">斗破苍穹 </a><a href="/Action/wushuang/" target="_self">无双</a><a href="/Action/diezhongdie6quanmianwajie/" target="_self">碟中谍6：全面瓦解</a><a href="/HongKong/tongmengyueyu/" target="_self">同盟粤语</a><a href="/Domestic/liechang/" target="_self">猎场 </a><a href="/Sciencefiction/yirenyuhuangfengnv/" target="_self">蚁人与黄蜂女 </a><a href="/Action/poju/" target="_self">破局</a><a href="/Action/yushentongxing2yinyuyuan/" target="_self">与神同行2：因与缘</a></p></section></section>
 </section>
	</header>
  <div class="mask" id="common_mask"></div>
<!--头部开始-->
<nav class="header_nav main" id="nav_menu">
<div class="con clearfix">
<ul>
<a class="cur" target="_self" href="/">首页</a>
<a  target="_self" href="/dsj/index.html">电视剧</a><a  target="_self" href="/dy/index.html">电影</a><a  target="_self" href="/Animation/index.html">动漫</a><a  target="_self" href="/Arts/index.html">综艺</a><a  target="_self" href="/microfilm/index.html">微电影</a> <a href="/top.html" target="_self">榜单</a>
  <a href="/new.html" target="_self">最新</a>
<a href="/zhuanti/" target="_self">专题</a>
	</ul>
	</div>
	</nav>
 <div class="mask2"></div><section class="focusBanner" id="focus">
  <img src="/static/images/720x280.png" alt="">
  <ul class="focusList">
  <li class="con">
      <a href="/Comedy/kuaibawogedaizou2/" onclick="_dct_('mys_main_jdt_1');" target="_self"><img src="/Uploads/slide/2018-10-04/5bb5c33df4109.JPG" alt="">
        <i class="iStyleIcon iStyleRB"></i><span class="sTxt"><em>[《快把我哥带走》又一部“中国式”青春片，清澈，真诚才是这种电影最重要的东西]</em></span>
      </a>
    </li><li class="con">
      <a href="/Action/diezhongdie6quanmianwajie/" onclick="_dct_('mys_main_jdt_2');" target="_self"><img src="/Uploads/slide/2018-09-16/5b9dece95d9b0.JPG" alt="">
        <i class="iStyleIcon iStyleRB"></i><span class="sTxt"><em>[《碟中谍6：全面瓦解》阿汤哥凭借《碟中谍6》成为历史上第一个在镜头下真正做到HALO跳伞（超高空跳伞，超低空开伞）的演员]</em></span>
      </a>
    </li><li class="con">
      <a href="/Comedy/dashixiong/" onclick="_dct_('mys_main_jdt_3');" target="_self"><img src="/Uploads/slide/2018-10-04/5bb5c1bd5bccc.JPG" alt="">
        <i class="iStyleIcon iStyleRB"></i><span class="sTxt"><em>[《大师兄》打戏一如既往的畅快淋漓，甄子丹风格凸显]</em></span>
      </a>
    </li><li class="con">
      <a href="/Sciencefiction/yirenyuhuangfengnv/" onclick="_dct_('mys_main_jdt_4');" target="_self"><img src="/Uploads/slide/2018-10-04/5bb5c39577a15.JPG" alt="">
        <i class="iStyleIcon iStyleRB"></i><span class="sTxt"><em>[《蚁人与黄蜂女》娱乐性很强，可惜反派太弱，好在一看就是给妇联4过渡用的。]</em></span>
      </a>
    </li><li class="con">
      <a href="/Europe/meiguokongbugushidibaji/" onclick="_dct_('mys_main_jdt_5');" target="_self"><img src="/Uploads/slide/2018-10-04/5bb5c3485ab0c.JPG" alt="">
        <i class="iStyleIcon iStyleRB"></i><span class="sTxt"><em>[《美国恐怖故事第八季 》惊艳！太令人惊艳的第八季，第一集的开篇让我连一帧画面都不愿错过！]</em></span>
      </a>
    </li>      </ul>
  <section class="focusTab"></section>
 </section>
 <section class="rowAuto menuNavList">
  <a href="/dy/index.html"  target="_self"><i class="menuNavIcon dyIcon"></i><span class="sTit">电影</span></a>
  <a href="/dsj/index.html"  target="_self"><i class="menuNavIcon dsjIcon"></i><span class="sTit">电视剧</span></a>
  <a href="/Animation/index.html" target="_self"><i class="menuNavIcon dmIcon"></i><span class="sTit">动漫</span></a>
  <a href="/Arts/index.html" target="_self"><i class="menuNavIcon zyIcon"></i><span class="sTit">综艺</span></a>
  <a href="/microfilm/index.html" target="_self"  ><i class="menuNavIcon zbIcon"></i><span class="sTit">微电影</span></a>
</section>
<script type="text/javascript" src="/le/20X4.js" charset="utf-8"></script>
<div class="modo_title top"><i class="icol iconfont">&#xe628;</i><h2><a href="/dy/" title="电影" target="_self">电影热映</a></h2><i class="icor iconfont"><a href="/dy/" title="电影" target="_self">更多&#xe621;</a></i></div>
<div class="main">
<div class="all_tab" style="border-bottom:none">
<ul class="list_tab_img" id="resize_list">
 <li><a href="/Sciencefiction/duye/" title="毒液 " target="_self">
<div class="picsize">
<img class="loading" src="//wx4.sinaimg.cn/mw690/006We1hygy1fvxehoxdgqj304805ymxc.jpg"  alt="毒液 "/>
<label class="title">HDTC英语中字</label>
<label class="name">毒液 </label>
</div>
 </a>
</li><li><a href="/Action/wushuang/" title="无双" target="_self">
<div class="picsize">
<img class="loading" src="//wx3.sinaimg.cn/mw690/006We1hygy1fvsi8dgor5j304805y0sy.jpg"  alt="无双"/>
<label class="title">HDTC清晰版</label>
<label class="name">无双</label>
</div>
 </a>
</li><li><a href="/Drama/zuihaokandedianyingmeiyouzhiyi/" title="最好看的电影没有之一" target="_self">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1fspuyz4ai6j3049060q37.jpg"  alt="最好看的电影没有之一"/>
<label class="title">BD高清</label>
<label class="name">最好看的电影没有之一</label>
</div>
 </a>
</li><li><a href="/Comedy/lichadeguma/" title="李茶的姑妈" target="_self">
<div class="picsize">
<img class="loading" src="//wx2.sinaimg.cn/mw690/006We1hygy1fvrz7nag9nj304505yaaa.jpg"  alt="李茶的姑妈"/>
<label class="title">HDTC清晰完整版</label>
<label class="name">李茶的姑妈</label>
</div>
 </a>
</li><li><a href="/Action/ying1/" title="影 " target="_self">
<div class="picsize">
<img class="loading" src="//wx4.sinaimg.cn/mw690/006We1hygy1fuv2eizey3j304205vaa8.jpg"  alt="影 "/>
<label class="title">HDTC清晰版</label>
<label class="name">影 </label>
</div>
 </a>
</li><li><a href="/Drama/yingdigutianle/" title="影帝古天乐" target="_self">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1fvv07ncvc5j304b05swel.jpg"  alt="影帝古天乐"/>
<label class="title">BD高清</label>
<label class="name">影帝古天乐</label>
</div>
 </a>
</li></ul>
</div>
 <div class="up-nav" id="mov_h">
          <a id="zanpianmov1" onMouseOver="setTab('zanpianmov',1,2);" class="current" href="/up/dy-201810.html" target="_self">正在热映</a>
          <a id="zanpianmov2" onMouseOver="setTab('zanpianmov',2,2);" href="/up/dy-up.html"  target="_self">即将上映</a>
         <span><a target="_self" href="/up/dy-201810.html" title="查看更多10月上映的电影">10月上映</a></span>
       </div>

<div class="up-tb" style="border-top:none;position:relative;" id="resize_list">
<ul class="list_tab_img"  id="con_zanpianmov_1">
<li><a  href="/Drama/baolieshuochang/" title="爆裂说唱" target="_self"><div class="picsize"><img class="loading" src="//wx4.sinaimg.cn/mw690/006We1hygy1fw6obfmnhcj304605yt8y.jpg"  alt="爆裂说唱"/><label class="name">爆裂说唱</label></div></a>
<div class="uptime"><p>10月热映中</p> </div>
</li><li><a  href="/Comedy/tielingfengyun/" title="铁岭风云" target="_self"><div class="picsize"><img class="loading" src="//wx2.sinaimg.cn/mw690/006We1hygy1fw6oljnn0hj304605xjrl.jpg"  alt="铁岭风云"/><label class="name">铁岭风云</label></div></a>
<div class="uptime"><p>10月热映中</p> </div>
</li><li><a  href="/Drama/buyaotuogui/" title="不要脱轨" target="_self"><div class="picsize"><img class="loading" src="//wx2.sinaimg.cn/mw690/006We1hygy1fw5jsjr0sbj304605x74e.jpg"  alt="不要脱轨"/><label class="name">不要脱轨</label></div></a>
<div class="uptime"><p>10月热映中</p> </div>
</li></ul>
<ul class="list_tab_img"  id="con_zanpianmov_2" style="display:none;">
<li><a  href="/Drama/linghunjianjishi/" title="灵魂剪辑师" target="_self"><div class="picsize"><img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1fly2rn06hqj309n0da0tp.jpg"  alt="灵魂剪辑师"/><label class="name">灵魂剪辑师</label></div></a>
<div class="uptime"><p>11月热映中</p> </div>
</li><li><a  href="/Sciencefiction/afanda2/" title="阿凡达2" target="_self"><div class="picsize"><img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1flwsepbp14j30cc0ir753.jpg"  alt="阿凡达2"/><label class="name">阿凡达2</label></div></a>
<div class="uptime"><p>12月热映中</p> </div>
</li><li><a  href="/Sciencefiction/yinduchaoren4/" title="印度超人4 " target="_self"><div class="picsize"><img class="loading" src="//wx3.sinaimg.cn/mw690/006We1hygy1fnipkm83hyj303z062q33.jpg"  alt="印度超人4 "/><label class="name">印度超人4 </label></div></a>
<div class="uptime"><p>12月热映中</p> </div>
</li></ul>
</div>
</div>
<div class="modo_title top"><i class="icol iconfont">&#xe603;</i><h2><a href="/dsj/" title="电视剧" target="_self">热播电视</a></h2><i class="icor iconfont"><a href="/dsj/" title="电视剧" target="_self">更多&#xe621;</a></i></div>
<div class="main">
<div class="all_tab" style="border-bottom:none">
<ul class="list_tab_img" id="resize_list">
<li><a href="/Domestic/doupocangqiong/" title="斗破苍穹 " target="_self">
<div class="picsize">
<img class="loading" src="//wx2.sinaimg.cn/mw690/006We1hygy1fuv27ij7mej304305y3yr.jpg"  alt="斗破苍穹 "/><label class="score">9.0</label>
<label class="status"></label><label class="title">更新至第36集</label></div>
</a>
<h2><a href="/Domestic/doupocangqiong/" target="_self">斗破苍穹 </a></h2>
<p>吴磊 / 林允 / 陈楚河 / 李沁 / 刘美彤 / 辛芷蕾 / 肖战 / 伍嘉成 / 谷嘉诚 / 彭楚粤 / 陈泽希 / 于荣光 / 李若彤 / 凌潇肃 / 李子峰 / 邓伦 / 徐少强 / 邱心志 / 朱晓渔 / 苏倩薇 / 曾江 / 苗皓钧 / 程皓枫 / 郭晓峰</p>
</li><li><a href="/Domestic/ruyichuan/" title="如懿传 " target="_self">
<div class="picsize">
<img class="loading" src="//wx3.sinaimg.cn/mw690/006We1hygy1fue80cry1nj304205qaa6.jpg"  alt="如懿传 "/><label class="score">8.0</label>
<label class="status"></label><label class="title">更新至第86集</label></div>
</a>
<h2><a href="/Domestic/ruyichuan/" target="_self">如懿传 </a></h2>
<p>周迅 / 霍建华 / 董洁 / 邬君梅 / 张钧甯 / 李纯 / 陈昊宇 / 辛芷蕾 / 童瑶 / 王鹤润 / 经超 / 曾一萱 / 陈冲 / 李沁 / 胡可 / 何泓姗 / 张佳宁 / 曹曦文 / 赵柯 / 韩丹彤 / 于洋 / 夏楠 / 蒋雪鸣 / 袁文康 / 黄明 / 李琦 / 陈小纭 / 郭虹 / 齐欢 / 屈楚萧 / 关雪盈 / 陈木易 / 刘美彤 / 胡明 / 闵春晓</p>
</li><li><a href="/HongKong/shirifengbao/" title="蚀日风暴" target="_self">
<div class="picsize">
<img class="loading" src="//wx4.sinaimg.cn/mw690/006We1hygy1fvb72job6vj304205sdg1.jpg"  alt="蚀日风暴"/><label class="score">10.0</label>
<label class="status"></label><label class="title">更新至第31集</label></div>
</a>
<h2><a href="/HongKong/shirifengbao/" target="_self">蚀日风暴</a></h2>
<p>张智霖 / 薛凯琪 / 王阳明 / 梁汉文 / 许绍雄 / 郭政鸿 / 陈瑾如 / 李思函 / 梁靖琪 / 姜文杰 / 林嘉华 / 罗家英 / 艾威 / 邵仲衡 / 朱鉴然 / 梁健平 / 张雷 / 何咏雯 / 吴肇轩 / 卢惠光 / 刘兆铭 / 麦长青 / 麦少瑜 / 黄竣锋 / 张文杰 / 泰臣 / 李鸿杰 / 张松枝 / 陈安莹 / 吴浣仪 / 沈震轩 / 郭卓桦 / 杨天经 / 何庆辉 / 林家熙</p>
</li><li><a href="/Domestic/chenghongniandai/" title="橙红年代" target="_self">
<div class="picsize">
<img class="loading" src="//wx2.sinaimg.cn/mw690/006We1hygy1fvcuvavu6oj304905ydg1.jpg"  alt="橙红年代"/><label class="score">9.0</label>
<label class="status"></label><label class="title">已完结</label></div>
</a>
<h2><a href="/Domestic/chenghongniandai/" target="_self">橙红年代</a></h2>
<p>陈伟霆 / 马思纯 / 刘奕君 / 陈瑶 / 叶祖新 / 何明翰 / 任正斌 / 李建义</p>
</li><li><a href="/HongKong/shirifengbaoguoyuban/" title="蚀日风暴 国语版" target="_self">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1fvfrlsbf7lj304805x74f.jpg"  alt="蚀日风暴 国语版"/><label class="score">10.0</label>
<label class="status"></label><label class="title">更新至第31集</label></div>
</a>
<h2><a href="/HongKong/shirifengbaoguoyuban/" target="_self">蚀日风暴 国语版</a></h2>
<p>张智霖 / 薛凯琪 / 王阳明 / 梁汉文 / 许绍雄 / 郭政鸿 / 陈瑾如 / 李思函 / 梁靖琪 / 姜文杰 / 林嘉华 / 罗家英 / 艾威 / 邵仲衡 / 朱鉴然 / 梁健平 / 张雷 / 何咏雯 / 吴肇轩 / 卢惠光 / 刘兆铭 / 麦长青 / 麦少瑜 / 黄竣锋 / 张文杰 / 泰臣 / 李鸿杰 / 张松枝 / 陈安莹 / 吴浣仪 / 沈震轩 / 郭卓桦 / 杨天经 / 何庆辉 / 林家熙</p>
</li><li><a href="/Domestic/niangdao/" title="娘道" target="_self">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1fv08ir8224j304605xglr.jpg"  alt="娘道"/><label class="score">10.0</label>
<label class="status"></label><label class="title">更新至第72集</label></div>
</a>
<h2><a href="/Domestic/niangdao/" target="_self">娘道</a></h2>
<p>岳丽娜 / 于毅 / 刘智扬 / 张少华 / 倪虹洁 / 肖茵 / 史可 / 黑子 / 杨昆</p>
</li></ul>


</div>
<div class="up-nav">
          <a id="zanpiantv1" onMouseOver="setTab('zanpiantv',1,2);" class="current" href="/up/dsj-201810.html" target="_self">正在热播</a>
          <a id="zanpiantv2" onMouseOver="setTab('zanpiantv',2,2);" href="/up/dsj-up.html" target="_self">即将开播</a>
          <span><a href="/up/dsj-201810.html" target="_self">10月开播</a></span>
       </div>
<div class="up-tb" style="border-top:none;" id="resize_list">
<ul class="list_tab_img"  id="con_zanpiantv_1">
  <li><a  href="/Domestic/doupocangqiong/" title="斗破苍穹 " target="_self"><div class="picsize"><img class="loading" src="//wx2.sinaimg.cn/mw690/006We1hygy1fuv27ij7mej304305y3yr.jpg"  alt="斗破苍穹 "/><label class="name">斗破苍穹 </label></div></a>
<div class="uptime"><p>09月热映中</p> </div>
</li><li><a  href="/Domestic/ruyichuan/" title="如懿传 " target="_self"><div class="picsize"><img class="loading" src="//wx3.sinaimg.cn/mw690/006We1hygy1fue80cry1nj304205qaa6.jpg"  alt="如懿传 "/><label class="name">如懿传 </label></div></a>
<div class="uptime"><p>08月热映中</p> </div>
</li><li><a  href="/HongKong/shirifengbao/" title="蚀日风暴" target="_self"><div class="picsize"><img class="loading" src="//wx4.sinaimg.cn/mw690/006We1hygy1fvb72job6vj304205sdg1.jpg"  alt="蚀日风暴"/><label class="name">蚀日风暴</label></div></a>
<div class="uptime"><p>09月热映中</p> </div>
</li></ul>
<ul class="list_tab_img"  id="con_zanpiantv_2" style="display:none;">
 <li><a  href="/HongKong/jianlidiaijianlidi/" title="坚离地爱坚离地" target="_self"><div class="picsize"><img class="loading" src="/Uploads/vod/2018-07-24/5b5734d6703c6.JPG"  alt="坚离地爱坚离地"/><label class="name">坚离地爱坚离地</label></div></a>
<div class="uptime"><p>12月热映中</p> </div>
</li><li><a  href="/Domestic/dajiangdahe/" title="大江大河" target="_self"><div class="picsize"><img class="loading" src="/Uploads/vod/2018-05-17/5afd34ca8ba5a.JPG"  alt="大江大河"/><label class="name">大江大河</label></div></a>
<div class="uptime"><p>12月热映中</p> </div>
</li><li><a  href="/Europe/quanlideyouxidibaji/" title="权力的游戏第八季" target="_self"><div class="picsize"><img class="loading" src="/Uploads/vod/2018-04-26/5ae17bdb3f3f2.JPG"  alt="权力的游戏第八季"/><label class="name">权力的游戏第八季</label></div></a>
<div class="uptime"><p>04月热映中</p> </div>
</li></ul>
</div>
</div>


<div class="modo_title top"><i class="icol iconfont">&#xe60b;</i><h2><a href="/Animation/" title="动漫" target="_self">动漫</a></h2><i class="icor iconfont"><a href="/Animation/" title="动漫" target="_self">更多&#xe621;</a></i></div>
<div class="main">
<div class="all_tab">
<ul class="list_tab_img" id="resize_list">
<li><a href="/Animation/kaixinhanbaodiandijiuji/" title="开心汉堡店第九季" target="_self">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1fvyv5efx2pj304605y0t2.jpg"  alt="开心汉堡店第九季"/><label class="score">0.0</label>
<label class="status"></label><label class="title">更新至第2集</label></div>
</a>
<h2><a href="/Animation/kaixinhanbaodiandijiuji/" target="_self">开心汉堡店第九季</a></h2>
<p>地区：美国</p>
</li><li><a href="/Animation/niuyuepimindisanji/" title="纽约屁民第三季" target="_self">
<div class="picsize">
<img class="loading" src="//wx2.sinaimg.cn/mw690/006We1hygy1fug9s1q3yuj304405vt8w.jpg"  alt="纽约屁民第三季"/><label class="score">10.0</label>
<label class="status"></label><label class="title">已完结</label></div>
</a>
<h2><a href="/Animation/niuyuepimindisanji/" target="_self">纽约屁民第三季</a></h2>
<p>地区：美国</p>
</li><li><a href="/Animation/ladian/" title="拉迪安" target="_self">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1fvyu5k4l81j304105tweq.jpg"  alt="拉迪安"/><label class="score">10.0</label>
<label class="status"></label><label class="title">更新至第2集</label></div>
</a>
<h2><a href="/Animation/ladian/" target="_self">拉迪安</a></h2>
<p>地区：日本</p>
</li><li><a href="/Animation/nizhuancaipandierji/" title="逆转裁判第二季" target="_self">
<div class="picsize">
<img class="loading" src="//wx4.sinaimg.cn/mw690/006We1hygy1fvyv1vyby7j304705yq37.jpg"  alt="逆转裁判第二季"/><label class="score">10.0</label>
<label class="status"></label><label class="title">更新至第2集</label></div>
</a>
<h2><a href="/Animation/nizhuancaipandierji/" target="_self">逆转裁判第二季</a></h2>
<p>地区：日本</p>
</li><li><a href="/Animation/worangzuixiangbeiyongbaodenanrengeiweixieliao/" title="我让最想被拥抱的男人给威胁了" target="_self">
<div class="picsize">
<img class="loading" src="//wx3.sinaimg.cn/mw690/006We1hygy1fvya5bmo1fj304a05y3ys.jpg"  alt="我让最想被拥抱的男人给威胁了"/><label class="score">10.0</label>
<label class="status"></label><label class="title">更新至第2集</label></div>
</a>
<h2><a href="/Animation/worangzuixiangbeiyongbaodenanrengeiweixieliao/" target="_self">我让最想被拥抱的男人给威胁了</a></h2>
<p>地区：日本</p>
</li><li><a href="/Animation/quanzhifashidisanji/" title="全职法师第三季" target="_self">
<div class="picsize">
<img class="loading" src="//wx3.sinaimg.cn/mw690/006We1hygy1fw6kvyj2joj304805xmxe.jpg"  alt="全职法师第三季"/><label class="score">10.0</label>
<label class="status"></label><label class="title">更新至第2集</label></div>
</a>
<h2><a href="/Animation/quanzhifashidisanji/" target="_self">全职法师第三季</a></h2>
<p>地区：大陆</p>
</li></ul>
</div>

<div class="week">
<ul>
<li onmouseover="setTab('dm',1,7);" id="dm1" >周一</li>
<li onmouseover="setTab('dm',2,7);" id="dm2" >周二</li>
<li onmouseover="setTab('dm',3,7);" id="dm3" >周三</li>
<li onmouseover="setTab('dm',4,7);" id="dm4" >周四</li>
<li onmouseover="setTab('dm',5,7);" id="dm5" >周五</li>
<li onmouseover="setTab('dm',6,7);" id="dm6" class="current">今天</li>
<li onmouseover="setTab('dm',7,7);" id="dm7" >周日</li>
</ul>
</div>
<div class="all_tab">
<ul class="list-txt fn-hide" id="con_dm_1">
<li ><a href="/Animation/yaersilanzhanjidierji/" title="亚尔斯兰战记第二季" target="_self">亚尔斯兰战记第二季</a><span>共8话&nbsp;已完结</span></li><li ><a href="/Animation/guaiwulierenwuyu/" title="怪物猎人物语" target="_self">怪物猎人物语</a><span>连载至59话</span></li><li ><a href="/Animation/weilaikadadangduizhanX/" title="未来卡搭档对战X" target="_self">未来卡搭档对战X</a><span>连载至51话</span></li><li ><a href="/Animation/zhilongmichengX/" title="智龙迷城X" target="_self">智龙迷城X</a><span>连载至89话</span></li><li ><a href="/Animation/dilingqu/" title="地灵曲" target="_self">地灵曲</a><span>共18话&nbsp;已完结</span></li><li ><a href="/Animation/yaoguaigongyudeyouyarichang/" title="妖怪公寓的幽雅日常" target="_self">妖怪公寓的幽雅日常</a><span>共26话&nbsp;已完结</span></li>
</ul>
<ul class="list-txt fn-hide" id="con_dm_2">
<li ><a href="/Animation/xinchangderenzheyishijinqipian/" title="信长的忍者～伊势·金崎篇" target="_self">信长的忍者～伊势·金崎篇</a><span>共26话&nbsp;已完结</span></li><li ><a href="/Animation/taiyixianmoluzhilingfeijidierji/" title="太乙仙魔录之灵飞纪第二季" target="_self">太乙仙魔录之灵飞纪第二季</a><span>共26话&nbsp;已完结</span></li><li ><a href="/Animation/shiwangelengxiaohuadierji/" title="十万个冷笑话第二季" target="_self">十万个冷笑话第二季</a><span>共13话&nbsp;已完结</span></li><li ><a href="/Animation/mengwangguoyuchenshuide100wangzi/" title="梦王国与沉睡的100王子" target="_self">梦王国与沉睡的100王子</a><span>共10话&nbsp;已完结</span></li><li ><a href="/Animation/xiaomiantuixiaoyuanNEW/" title="笑面推销员NEW" target="_self">笑面推销员NEW</a><span>共12话&nbsp;已完结</span></li><li ><a href="/Animation/conglingkaishidemofashu/" title="从零开始的魔法书" target="_self">从零开始的魔法书</a><span>共12话&nbsp;已完结</span></li>
</ul>
<ul class="list-txt fn-hide" id="con_dm_3">
<li ><a href="/Animation/borenchuanhuoyingrenzhexinshidai/" title="博人传火影忍者新时代" target="_self">博人传火影忍者新时代</a><span>共150话&nbsp;连载至76话</span></li><li ><a href="/Animation/huanjingnuodelin/" title="幻镜诺德琳" target="_self">幻镜诺德琳</a><span>共1话&nbsp;已完结</span></li><li ><a href="/Animation/manhuajiayuzhushou/" title="漫画家与助手" target="_self">漫画家与助手</a><span>共12话&nbsp;已完结</span></li><li ><a href="/Animation/mozhuangxueyuanHH/" title="魔装学园H×H" target="_self">魔装学园H×H</a><span>共12话&nbsp;已完结</span></li><li ><a href="/Animation/qiheidezidan/" title="漆黑的子弹" target="_self">漆黑的子弹</a><span>共13话&nbsp;已完结</span></li><li ><a href="/Animation/xiamuyourenzhangdiliuji/" title="夏目友人帐第六季+OVA0" target="_self">夏目友人帐第六季+OVA0</a><span>共11话&nbsp;已完结</span></li>
</ul>
<ul class="list-txt fn-hide" id="con_dm_4">
<li ><a href="/Animation/youxiwangVRAINS/" title="游戏王VRAINS" target="_self">游戏王VRAINS</a><span>连载至71话</span></li><li ><a href="/Animation/porenzhijianTVban/" title="破刃之剑 (TV版)" target="_self">破刃之剑 (TV版)</a><span>共12话&nbsp;已完结</span></li><li ><a href="/Animation/tianxingjiugezhixinzhinilin/" title="天行九歌之心之逆鳞" target="_self">天行九歌之心之逆鳞</a><span>共60话&nbsp;已完结</span></li><li ><a href="/Animation/lianaidebaixiong/" title="恋爱的白熊" target="_self">恋爱的白熊</a><span>连载至6话</span></li><li ><a href="/Animation/quanhuangmingyun/" title="拳皇命运" target="_self">拳皇命运</a><span>共24话&nbsp;已完结</span></li><li ><a href="/Animation/diyicidelamei/" title="第一次的辣妹" target="_self">第一次的辣妹</a><span>共11话&nbsp;已完结</span></li>
</ul>
<ul class="list-txt fn-hide" id="con_dm_5">
<li ><a href="/Animation/yirenzhixia/" title="一人之下" target="_self">一人之下</a><span>共12话&nbsp;已完结</span></li><li ><a href="/Animation/yaoguaishoubiao/" title="妖怪手表" target="_self">妖怪手表</a><span>连载至145话</span></li><li ><a href="/Animation/koushuifengshen/" title="口水封神" target="_self">口水封神</a><span>共36话&nbsp;已完结</span></li><li ><a href="/Animation/qinglian2017/" title="青恋2017" target="_self">青恋2017</a><span>共12话&nbsp;已完结</span></li><li ><a href="/Animation/jidongqiangxishidibazu/" title="机动强袭室第八组" target="_self">机动强袭室第八组</a><span>共12话&nbsp;已完结</span></li><li ><a href="/Animation/qingchungewuji/" title="青春歌舞伎" target="_self">青春歌舞伎</a><span>共12话&nbsp;已完结</span></li>
</ul>
<ul class="list-txt " id="con_dm_6">
<li ><a href="/Animation/mingzhentankenan/" title="名侦探柯南" target="_self">名侦探柯南</a><span>连载至928话</span></li><li ><a href="/Animation/shengdoushixingshihuangjinhun/" title="圣斗士星矢：黄金魂" target="_self">圣斗士星矢：黄金魂</a><span>共13话&nbsp;已完结</span></li><li ><a href="/Animation/huyaoxiaohongniang/" title="狐妖小红娘" target="_self">狐妖小红娘</a><span>共89话&nbsp;已完结</span></li><li ><a href="/Animation/shixuekuangxi/" title="噬血狂袭" target="_self">噬血狂袭</a><span>共24话&nbsp;已完结</span></li><li ><a href="/Animation/chaoyuhu/" title="潮与虎" target="_self">潮与虎</a><span>共39话&nbsp;已完结</span></li><li ><a href="/Animation/shijizhilingerzhimin/" title="食戟之灵第三季/食戟之灵 餐之皿" target="_self">食戟之灵第三季/食戟之灵 餐之皿</a><span>共 24话&nbsp;连载至12话</span></li>
</ul>
<ul class="list-txt fn-hide" id="con_dm_7">
<li ><a href="/Animation/mofakegaoxiaodeliedengsheng/" title="魔法科高校的劣等生" target="_self">魔法科高校的劣等生</a><span>共26话&nbsp;已完结</span></li><li ><a href="/Animation/haizeiwang/" title="海贼王" target="_self">海贼王</a><span>连载至856话</span></li><li ><a href="/Animation/longzhuchao/" title="龙珠超" target="_self">龙珠超</a><span>共200话&nbsp;连载至131话</span></li><li ><a href="/Animation/zhaoheyuanluluoyuxinzhong/" title="昭和元禄落语心中" target="_self">昭和元禄落语心中</a><span>共13话&nbsp;已完结</span></li><li ><a href="/Animation/3yuedeshizi/" title="3月的狮子" target="_self">3月的狮子</a><span>共23话&nbsp;已完结</span></li><li ><a href="/Animation/wugengji/" title="武庚纪" target="_self">武庚纪</a><span>共30话&nbsp;已完结</span></li>
</ul>
</div>
</div>


<div class="modo_title top"><i class="icol iconfont">&#xe612;</i><h2><a href="/Arts/" title="综艺" target="_self">综艺</a></h2><i class="icor iconfont"><a href="/Arts/" title="综艺" target="_self">更多&#xe621;</a></i></div>
<div class="main">
<div class="all_tab">
<ul class="list_tab_img" id="resize_list">
 <li><a href="/Arts/kuailedabenying2018/" title="快乐大本营2018" target="_self">
<div class="picsize">
<img class="loading" src="//wx2.sinaimg.cn/mw690/006We1hygy1fn9agww6auj304m06i0t1.jpg"  alt="快乐大本营2018"/><label class="score">8.9</label>
<label class="status"></label><label class="title">第20181013期</label></div>
</a>
<h2><a href="/Arts/kuailedabenying2018/" target="_self">快乐大本营2018</a></h2>
<p>类型：<a href='/Arts/index_1_21______1.html' target='_blank'>歌舞</a> <a href='/Arts/index_1_92______1.html' target='_blank'>音乐</a> <a href='/Arts/index_1_93______1.html' target='_blank'>游戏</a> <a href='/Arts/index_1_98______1.html' target='_blank'>娱乐</a> </p>
</li><li><a href="/Arts/feichengwurao2018/" title="非诚勿扰2018" target="_self">
<div class="picsize">
<img class="loading" src="//wx2.sinaimg.cn/mw690/006We1hygy1fn7bfw1vm9j305j08ct90.jpg"  alt="非诚勿扰2018"/><label class="score">8.9</label>
<label class="status"></label><label class="title">第20181013期</label></div>
</a>
<h2><a href="/Arts/feichengwurao2018/" target="_self">非诚勿扰2018</a></h2>
<p>类型：<a href='/Arts/index_1_22______1.html' target='_blank'>故事</a> <a href='/Arts/index_1_89______1.html' target='_blank'>情感</a> <a href='/Arts/index_1_90______1.html' target='_blank'>访谈</a> </p>
</li><li><a href="/Arts/zhejiushiguanlan/" title="这就是灌篮" target="_self">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1fumwavi5ocj3048060q38.jpg"  alt="这就是灌篮"/><label class="score">10.0</label>
<label class="status"></label><label class="title">第20181013期</label></div>
</a>
<h2><a href="/Arts/zhejiushiguanlan/" target="_self">这就是灌篮</a></h2>
<p>类型：<a href='/Arts/index_1_18______1.html' target='_blank'>体育</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> <a href='/Arts/index_1_144______1.html' target='_blank'>竞技</a> </p>
</li><li><a href="/Arts/xiangshengyouxinren/" title="相声有新人" target="_self">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1fueb0ugv19j304705yjrk.jpg"  alt="相声有新人"/><label class="score">8.0</label>
<label class="status"></label><label class="title">第20181013期</label></div>
</a>
<h2><a href="/Arts/xiangshengyouxinren/" target="_self">相声有新人</a></h2>
<p>类型：<a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> <a href='/Arts/index_1_102______1.html' target='_blank'>脱口秀</a> </p>
</li><li><a href="/Arts/kuajiexijuwangdisanji/" title="跨界喜剧王第三季" target="_self">
<div class="picsize">
<img class="loading" src="//wx2.sinaimg.cn/mw690/006We1hygy1fuer6ip37pj304705x74g.jpg"  alt="跨界喜剧王第三季"/><label class="score">10.0</label>
<label class="status"></label><label class="title">第20181013期</label></div>
</a>
<h2><a href="/Arts/kuajiexijuwangdisanji/" target="_self">跨界喜剧王第三季</a></h2>
<p>类型：<a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> <a href='/Arts/index_1_102______1.html' target='_blank'>脱口秀</a> </p>
</li><li><a href="/Arts/qipashuodiwuji/" title="奇葩说第五季" target="_self">
<div class="picsize">
<img class="loading" src="//wx2.sinaimg.cn/mw690/006We1hygy1fvhkygfemsj304605ymxh.jpg"  alt="奇葩说第五季"/><label class="score">10.0</label>
<label class="status"></label><label class="title">第20181013期</label></div>
</a>
<h2><a href="/Arts/qipashuodiwuji/" target="_self">奇葩说第五季</a></h2>
<p>类型：<a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> </p>
</li>
</ul>
</div>
<div class="week">
<ul>
<li id="zy1" onmouseover="setTab('zy',1,7);" >周一</li>
<li id="zy2" onmouseover="setTab('zy',2,7);" >周二</li>
<li id="zy3" onmouseover="setTab('zy',3,7);" >周三</li>
<li id="zy4" onmouseover="setTab('zy',4,7);" >周四</li>
<li id="zy5" onmouseover="setTab('zy',5,7);" >周五</li>
<li id="zy6" onmouseover="setTab('zy',6,7);" class="current">今天</li>
<li id="zy7" onmouseover="setTab('zy',7,7);" >周日</li>
</ul>
</div>
<div class="all_tab">
<ul class="list-txt fn-hide" id="con_zy_1">
<li ><a href="/Arts/zongyidajihe2017/" title="综艺大集合2017" target="_self">综艺大集合2017</a><span></span></li><li ><a href="/Arts/dongzhangxiwang2017/" title="东张西望2017" target="_self">东张西望2017</a><span></span></li><li ><a href="/Arts/yulebaifenbai2016/" title="娱乐百分百2016" target="_self">娱乐百分百2016</a><span></span></li><li ><a href="/Arts/shishangwanjia2016/" title="食尚玩家2016" target="_self">食尚玩家2016</a><span></span></li><li ><a href="/Arts/guoguangbangbangmang2016/" title="国光帮帮忙2016" target="_self">国光帮帮忙2016</a><span></span></li><li ><a href="/Arts/luyuyouyue2016/" title="鲁豫有约2016" target="_self">鲁豫有约2016</a><span></span></li>
</ul>
<ul class="list-txt fn-hide" id="con_zy_2">
<li ><a href="/Arts/zongyidajihe2017/" title="综艺大集合2017" target="_self">综艺大集合2017</a><span></span></li><li ><a href="/Arts/baituoliaobingxiang/" title="拜托了冰箱" target="_self">拜托了冰箱</a><span></span></li><li ><a href="/Arts/dongzhangxiwang2017/" title="东张西望2017" target="_self">东张西望2017</a><span></span></li><li ><a href="/Arts/yulebaifenbai2016/" title="娱乐百分百2016" target="_self">娱乐百分百2016</a><span></span></li><li ><a href="/Arts/shishangwanjia2016/" title="食尚玩家2016" target="_self">食尚玩家2016</a><span></span></li><li ><a href="/Arts/guoguangbangbangmang2016/" title="国光帮帮忙2016" target="_self">国光帮帮忙2016</a><span></span></li>
</ul>
<ul class="list-txt fn-hide" id="con_zy_3">
<li ><a href="/Arts/zongyidajihe2017/" title="综艺大集合2017" target="_self">综艺大集合2017</a><span></span></li><li ><a href="/Arts/fanjudeyouhuodierji/" title="饭局的诱惑第二季" target="_self">饭局的诱惑第二季</a><span></span></li><li ><a href="/Arts/haohaochifanba2017/" title="好好吃饭吧2017" target="_self">好好吃饭吧2017</a><span></span></li><li ><a href="/Arts/dongzhangxiwang2017/" title="东张西望2017" target="_self">东张西望2017</a><span></span></li><li ><a href="/Arts/yulebaifenbai2016/" title="娱乐百分百2016" target="_self">娱乐百分百2016</a><span></span></li><li ><a href="/Arts/shishangwanjia2016/" title="食尚玩家2016" target="_self">食尚玩家2016</a><span></span></li>
</ul>
<ul class="list-txt fn-hide" id="con_zy_4">
<li ><a href="/Arts/zongyidajihe2017/" title="综艺大集合2017" target="_self">综艺大集合2017</a><span></span></li><li ><a href="/Arts/fanjulangrensha2017/" title="饭局狼人杀2017" target="_self">饭局狼人杀2017</a><span></span></li><li ><a href="/Arts/weinierlai2017/" title="为你而来2017" target="_self">为你而来2017</a><span></span></li><li ><a href="/Arts/dongzhangxiwang2017/" title="东张西望2017" target="_self">东张西望2017</a><span></span></li><li ><a href="/Arts/yulebaifenbai2016/" title="娱乐百分百2016" target="_self">娱乐百分百2016</a><span></span></li><li ><a href="/Arts/shishangwanjia2016/" title="食尚玩家2016" target="_self">食尚玩家2016</a><span></span></li>
</ul>
<ul class="list-txt fn-hide" id="con_zy_5">
<li ><a href="/Arts/zongyidajihe2017/" title="综艺大集合2017" target="_self">综艺大集合2017</a><span></span></li><li ><a href="/Arts/tiantianxiangshang2017/" title="天天向上2017" target="_self">天天向上2017</a><span></span></li><li ><a href="/Arts/mengmianchangjiangcaicaicaidierji/" title="蒙面唱将猜猜猜第二季" target="_self">蒙面唱将猜猜猜第二季</a><span></span></li><li ><a href="/Arts/womenlailiao2017/" title="我们来了2017" target="_self">我们来了2017</a><span></span></li><li ><a href="/Arts/zhongguoxingesheng2017/" title="中国新歌声2017" target="_self">中国新歌声2017</a><span></span></li><li ><a href="/Arts/jisuqianjinzhongguobandisiji/" title="极速前进中国版第四季" target="_self">极速前进中国版第四季</a><span>连载至20171006集</span></li>
</ul>
<ul class="list-txt " id="con_zy_6">
<li ><a href="/Arts/womendelvxing2017/" title="我们的侣行" target="_self">我们的侣行</a><span>连载至20180828集</span></li><li ><a href="/Arts/mingrizhizi2017/" title="明日之子2017" target="_self">明日之子2017</a><span></span></li><li ><a href="/Arts/kuailedabenying2017/" title="快乐大本营2017" target="_self">快乐大本营2017</a><span></span></li><li ><a href="/Arts/feichengwurao2017/" title="非诚勿扰2017" target="_self">非诚勿扰2017</a><span></span></li><li ><a href="/Arts/huoxingqingbaojudisanji/" title="火星情报局第三季" target="_self">火星情报局第三季</a><span></span></li><li ><a href="/Arts/bianxingji2017/" title="变形计2017" target="_self">变形计2017</a><span>连载至20171012集</span></li>
</ul>
<ul class="list-txt fn-hide" id="con_zy_7">
<li ><a href="/Arts/womendelvxing2017/" title="我们的侣行" target="_self">我们的侣行</a><span>连载至20180828集</span></li><li ><a href="/Arts/jixiantaozhandisanji/" title="极限挑战第三季" target="_self">极限挑战第三季</a><span></span></li><li ><a href="/Arts/woshiweilai2017/" title="我是未来2017" target="_self">我是未来2017</a><span></span></li><li ><a href="/Arts/huaeryushaoniandisanji/" title="花儿与少年第三季" target="_self">花儿与少年第三季</a><span></span></li><li ><a href="/Arts/geshengdechibang2017/" title="歌声的翅膀2017" target="_self">歌声的翅膀2017</a><span>连载至20170702集</span></li><li ><a href="/Arts/xiaoshengchuanqi2017/" title="笑声传奇2017" target="_self">笑声传奇2017</a><span>连载至20170702集</span></li>
</ul>
</div>
</div>

<div class="modo_title top"><i class="icol iconfont">&#xe601;</i><h2><a href="/microfilm/" title="微电影" target="_self">微电影</a></h2><i class="icor iconfont"><a href="/microfilm/" title="微电影" target="_self">更多&#xe621;</a></i></div>
<div class="main">
<div class="all_tab" style="border-bottom:none">
<ul class="list_tab_img" id="resize_list">
 <li><a href="/microfilm/bianyikuangmang/" title="变异狂蟒" target="_self">
<div class="picsize">
<img class="loading" src="//wx2.sinaimg.cn/mw690/006We1hygy1fw5jkpo3qqj304705yq36.jpg"  alt="变异狂蟒"/>
<label class="title">BD高清</label>
<label class="name">变异狂蟒</label>
</div>
 </a>
</li><li><a href="/microfilm/qianshuyaoji/" title="千术妖姬" target="_self">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1fw5k3xauuij304605xjrn.jpg"  alt="千术妖姬"/>
<label class="title">BD高清</label>
<label class="name">千术妖姬</label>
</div>
 </a>
</li><li><a href="/microfilm/tiexuezhanshiheianshidai/" title="铁血战士：黑暗时代" target="_self">
<div class="picsize">
<img class="loading" src="//wx3.sinaimg.cn/mw690/006We1hyly1fnu4pt76y0j303x05y74h.jpg"  alt="铁血战士：黑暗时代"/>
<label class="title">BD高清</label>
<label class="name">铁血战士：黑暗时代</label>
</div>
 </a>
</li></ul></div>
</div>
</div>

<div class="modo_title top" style="border:none; background:none; padding:0px;"><h2><a href="/zhuanti/" target="_self">专题</a></h2><i class="icols iconfont">&#xe615;</i><i class="icor iconfont"><a href="/zhuanti/">更多&#xe621;</a></i></div>
<div class="main">
<ul class="list_tab_er_img" id="resize_special">

</ul>
</div>
<script type="text/javascript" src="/static/js/sildeFocusPlugin.js"></script>
<script>
    ${'$'}("#focus").sildeFocusPlugin({
        speed:10,
        conClassName:"focusList",
        tabClassName:"focusTab"
    });
</script>
<!--底部开始-->
<div class="footer">
<div class="fBox">
<div class="footer_nav"><a href="/new.html" target="_self">最新更新</a>-<a href="/top.html" target="_self">影视排行</a>-<a href="https://www.kankanwu.com/gb-show-p-1.html" target="_self">留言反馈</a>-<script type="text/javascript" src="/le/tongji.js"></script></div>
本网站为非赢利性站点，本网站所有内容均来源于互联网相关站点自动搜索采集信息，相关链接已经注明来源。</div>
</div>
<script type="text/javascript" src="/static/js/zepto.min.js"></script>
<script type="text/javascript" src="/static/js/iscroll.js"></script>
<script type="text/javascript" src="/static/js/common.min.js"></script>
<script type="text/javascript" src="/static/js/index.min.js"></script>
<script type="text/javascript" src="/xuxu/le.js" charset="utf-8"></script>

</body>
</html>"""

    //type
    var typeHtml = """
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no" id="viewport" name="viewport">
<title>综艺, - 看看屋手机版</title>
<meta name="keywords" content="">
<meta name="description" content="最新综艺好看的由看看屋手机版提供这里为你收集了综艺,综艺国语版,综艺大全,综艺热门推荐榜希望我们提供综艺让您喜欢哦。">
<script language="javascript" src="/js/webThunderDetect.js"></script>
<script type="text/javascript">uaredirect("http://www.kankanwu.com/Arts/index_1_______.html");</script>
<link type="text/css" rel="stylesheet" href="/static/css/index.css" />
<link rel="shortcut icon" href="/favicon.ico" charset="utf-8" />
<script type="text/javascript">var Root='/';var Sid='1';var Cid='4';var Id='';</script>
<script type="text/javascript" src="/static/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="/static/js/jquery-lazyload.js"></script>
<script type="text/javascript" src="/static/js/jquery.base.js"></script>
<script type="text/javascript" src="/static/js/home.js"></script>

</head>
<body>
<header id='test' class="header clearfix">
         <a href="javascript:void(0);" target="_self" class="aChannel top_channel_btn"><span>综艺</span><i class="moreArrow"></i></a>  <a href="javascript:void(0);" target="_self" class="aHeaderSearch top_search_btn"><i class="globalIcon searchIcon"></i><em>全网搜索</em></a>
    <a href="/" target="_self" class="aHeaderFun"><i class="globalIcon indexIcon"></i><span>首页</span></a><p class="headerChannelList">
<a  target="_self" href="/">首页</a>
<a  target="_self" href="/dsj/index.html">电视剧</a><a  target="_self" href="/dy/index.html">电影</a><a  target="_self" href="/Animation/index.html">动漫</a><a class="current" target="_self" href="/Arts/index.html">综艺</a><a  target="_self" href="/microfilm/index.html">微电影</a> <a href="/top.html" target="_self">榜单</a>
  <a href="/new.html" target="_self">最新</a>
<a href="/zhuanti/" target="_self">专题</a>
  </p>
<section class="searchPop popShow">
<section class="searchCon">
<form id="search" name="search" action="/vod-search" method="post" onSubmit="return qrsearch();">
<span class="sSearchInput"><input autocomplete="off" autovalue="请输入片名或主演名" class="searchInput" placeholder="请输入片名或主演名" type="search" id="wd" name="wd">
</span>
<input class="cancelInput1" value="取消" type="button">
<input type="submit" id="searchbutton" class="cancelInput" value="搜索">
</form></section>
<section class="search_hotkey">
		<section class="th"><span class="sMark">热门搜索</span>
		</section>
		<section class="tb">
		<p class="pHistory clearfix">
<a href="/Action/zhanlang2/" target="_self">战狼2 完整版</a><a href="/Animation/huajianghuzhifengyuzhou/" target="_self">画江湖之风语咒</a><a href="/Animation/haizeiwang/" target="_self">海贼王</a><a href="/Domestic/wuxinfashi2/" target="_self">无心法师2</a><a href="/Domestic/doupocangqiong/" target="_self">斗破苍穹 </a><a href="/Action/wushuang/" target="_self">无双</a><a href="/Action/diezhongdie6quanmianwajie/" target="_self">碟中谍6：全面瓦解</a><a href="/HongKong/tongmengyueyu/" target="_self">同盟粤语</a><a href="/Domestic/liechang/" target="_self">猎场 </a><a href="/Sciencefiction/yirenyuhuangfengnv/" target="_self">蚁人与黄蜂女 </a><a href="/Action/poju/" target="_self">破局</a><a href="/Action/yushentongxing2yinyuyuan/" target="_self">与神同行2：因与缘</a></p></section></section>
 </section>
	</header>
  <div class="mask" id="common_mask"></div>
<div class="main list-s">
<div class="list-l"><a href="/new.html" class="cur">最近更新</a> <a sign="no" href="/top.html">影院热映</a></div>
<div class="list-r"><a href="javascript:void(0);" class="selectBtn">分类<i class="more"></i></a></div>
</div>
<div class="list-nav" style="display:none">
<div class="main">
    <div class="list-nav-s">
    <div class="list-nav-s-l">分类索引<h4 class="name aleft"></h4></div>
      <div class="list-nav-s-r"> <span><a class="conreset" href="/Arts/index_1_______1.html">重置条件</a><p class="conbread"></p></div>
      </div>
    </div>
<div class="list-fen">
<div class="main">
<ul class="selectList">
       <li id="first_list" style="display:none;border:none"><!--分类-->
        <div class="con" id="firsts_list_p" >
          </div>
     </li>

<li id="mcid_list"><!--类型-->
  <div class="con" id="firsts_list_p">
<a  class="cur"  href="/Arts/index_1_______1.html" >全部</a>
<a   href="/Arts/index_1_16______1.html" >晚会</a><a   href="/Arts/index_1_17______1.html" >财经</a><a   href="/Arts/index_1_18______1.html" >体育</a><a   href="/Arts/index_1_19______1.html" >纪实</a><a   href="/Arts/index_1_20______1.html" >生活</a><a   href="/Arts/index_1_127______1.html" >益智</a><a   href="/Arts/index_1_21______1.html" >歌舞</a><a   href="/Arts/index_1_22______1.html" >故事</a><a   href="/Arts/index_1_23______1.html" >军事</a><a   href="/Arts/index_1_24______1.html" >少儿</a><a   href="/Arts/index_1_121______1.html" >汽车</a><a   href="/Arts/index_1_89______1.html" >情感</a><a   href="/Arts/index_1_90______1.html" >访谈</a><a   href="/Arts/index_1_91______1.html" >时尚</a><a   href="/Arts/index_1_92______1.html" >音乐</a><a   href="/Arts/index_1_93______1.html" >游戏</a><a   href="/Arts/index_1_94______1.html" >美食</a><a   href="/Arts/index_1_95______1.html" >旅游</a><a   href="/Arts/index_1_96______1.html" >职场</a><a   href="/Arts/index_1_97______1.html" >看点</a><a   href="/Arts/index_1_98______1.html" >娱乐</a><a   href="/Arts/index_1_99______1.html" >选秀</a><a   href="/Arts/index_1_100______1.html" >搞笑</a><a   href="/Arts/index_1_101______1.html" >真人秀</a><a   href="/Arts/index_1_102______1.html" >脱口秀</a><a   href="/Arts/index_1_25______1.html" >新闻</a><a   href="/Arts/index_1_144______1.html" >竞技</a></div>
 	   </li>
<li><!--连载-->
        <div class="con" id="firsts_list_p">
 <a rel="nofollow"  class="cur" href="/Arts/index_1_______1.html" >全部</a>
<a rel="nofollow" href='/Arts/index_1__1_____1.html' >连载中</a>
<a rel="nofollow" href='/Arts/index_1__2_____1.html' >已完结</a>
        </div>
 	   </li>            <li id="second_list"><!--地区-->
        <div class="con" id="second_list_p">
<a rel="nofollow"  class="cur" href="/Arts/index_1_______1.html">全部</a>
     <a rel="nofollow" href="/Arts/index_1______%E5%A4%A7%E9%99%86_1.html" >大陆</a><a rel="nofollow" href="/Arts/index_1______%E9%A6%99%E6%B8%AF_1.html" >香港</a><a rel="nofollow" href="/Arts/index_1______%E5%8F%B0%E6%B9%BE_1.html" >台湾</a><a rel="nofollow" href="/Arts/index_1______%E7%BE%8E%E5%9B%BD_1.html" >美国</a><a rel="nofollow" href="/Arts/index_1______%E9%9F%A9%E5%9B%BD_1.html" >韩国</a><a rel="nofollow" href="/Arts/index_1______%E6%97%A5%E6%9C%AC_1.html" >日本</a><a rel="nofollow" href="/Arts/index_1______%E6%B3%B0%E5%9B%BD_1.html" >泰国</a><a rel="nofollow" href="/Arts/index_1______%E6%96%B0%E5%8A%A0%E5%9D%A1_1.html" >新加坡</a><a rel="nofollow" href="/Arts/index_1______%E9%A9%AC%E6%9D%A5%E8%A5%BF%E4%BA%9A_1.html" >马来西亚</a><a rel="nofollow" href="/Arts/index_1______%E5%8D%B0%E5%BA%A6_1.html" >印度</a><a rel="nofollow" href="/Arts/index_1______%E8%8B%B1%E5%9B%BD_1.html" >英国</a><a rel="nofollow" href="/Arts/index_1______%E6%B3%95%E5%9B%BD_1.html" >法国</a><a rel="nofollow" href="/Arts/index_1______%E5%8A%A0%E6%8B%BF%E5%A4%A7_1.html" >加拿大</a>        </div>
      </li>
   <li id="year_list">
 <div class="con"  id="third_list_p">

      <a rel="nofollow"  class="cur" href="/Arts/index_1_______1.html">全部</a>
     <a rel="nofollow" href="/Arts/index_1___2018____1.html" >2018</a><a rel="nofollow" href="/Arts/index_1___2017____1.html" >2017</a><a rel="nofollow" href="/Arts/index_1___2016____1.html" >2016</a><a rel="nofollow" href="/Arts/index_1___2015____1.html" >2015</a><a rel="nofollow" href="/Arts/index_1___2014____1.html" >2014</a><a rel="nofollow" href="/Arts/index_1___2013____1.html" >2013</a><a rel="nofollow" href="/Arts/index_1___2012____1.html" >2012</a><a rel="nofollow" href="/Arts/index_1___2011____1.html" >2011</a><a rel="nofollow" href="/Arts/index_1___2010____1.html" >2010</a><a rel="nofollow" href="/Arts/index_1___2009____1.html" >2009</a><a rel="nofollow" href="/Arts/index_1___2008____1.html" >2008</a><a rel="nofollow" href="/Arts/index_1___2007____1.html" >2007</a>     <a rel="nofollow" href="/Arts/index_1___1990,1999____1.html" >90后</a>
       <a rel="nofollow" href="/Arts/index_1___1980,1989____1.html" >80后</a>
      <a rel="nofollow" href="/Arts/index_1___1900,1980____1.html" >更早</a>
      </div>
      </li>
<!--       <li id="third_list">
        <div class="con"  id="third_list_p">
          <p>
   <a  rel="nofollow"  class="cur" href="/Arts/index_1_______1.html">全部</a>
     <a rel="nofollow" href="/Arts/index_1____A___1.html" >A</a><a rel="nofollow" href="/Arts/index_1____B___1.html" >B</a><a rel="nofollow" href="/Arts/index_1____C___1.html" >C</a><a rel="nofollow" href="/Arts/index_1____D___1.html" >D</a><a rel="nofollow" href="/Arts/index_1____E___1.html" >E</a><a rel="nofollow" href="/Arts/index_1____F___1.html" >F</a><a rel="nofollow" href="/Arts/index_1____G___1.html" >G</a><a rel="nofollow" href="/Arts/index_1____H___1.html" >H</a><a rel="nofollow" href="/Arts/index_1____I___1.html" >I</a><a rel="nofollow" href="/Arts/index_1____J___1.html" >J</a><a rel="nofollow" href="/Arts/index_1____K___1.html" >K</a><a rel="nofollow" href="/Arts/index_1____L___1.html" >L</a><a rel="nofollow" href="/Arts/index_1____M___1.html" >M</a><a rel="nofollow" href="/Arts/index_1____N___1.html" >N</a><a rel="nofollow" href="/Arts/index_1____O___1.html" >O</a><a rel="nofollow" href="/Arts/index_1____P___1.html" >P</a><a rel="nofollow" href="/Arts/index_1____Q___1.html" >Q</a><a rel="nofollow" href="/Arts/index_1____R___1.html" >R</a><a rel="nofollow" href="/Arts/index_1____S___1.html" >S</a><a rel="nofollow" href="/Arts/index_1____T___1.html" >T</a><a rel="nofollow" href="/Arts/index_1____U___1.html" >U</a><a rel="nofollow" href="/Arts/index_1____V___1.html" >V</a><a rel="nofollow" href="/Arts/index_1____W___1.html" >W</a><a rel="nofollow" href="/Arts/index_1____X___1.html" >X</a><a rel="nofollow" href="/Arts/index_1____Y___1.html" >Y</a><a rel="nofollow" href="/Arts/index_1____Z___1.html" >Z</a>     <a rel="nofollow" href="/Arts/index_1____0,1,2,3,4,5,6,7,8,9___1.html" >0-9</a>
          </p>
         </div>
      </li>-->
     </ul>
    </div>
</div>
</div>

<div class="main top" style="margin-top:15px;"><div class="list_ico">

 <a href="/Arts/index_1_____addtime__1.html"  class='cur'><i class="iconfont">&#xe616;</i>最新</a>
<a href="/Arts/index_1_____hits__1.html"  ><i class="iconfont">&#xe61b;</i>人气</a>
<a href="/Arts/index_1_____gold__1.html" ><i class="iconfont">&#xe61a;</i>评分</a></div><div class="ui-pages fn-right"><strong>3/58</strong><a href="/Arts/index_2_______1.html" class="prev pagegbk" data="p-2">上一页</a>&nbsp;<a href="/Arts/index_4_______1.html" class="next pagegbk" data="p-4">下一页</a>&nbsp;</div></div>

<div class="main top">
<div class="list_vod">
<ul class="list_tab_img" id="vod_list">
<li><a href="/Arts/xinxiyoujidiwuji/" title="新西游记第五季" target="_blank">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1fvsousc7ltj304305tt8x.jpg"  alt="新西游记第五季"/><label class="score">10.0</label>
<label class="status"></label><label class="title">更新至第20181007集</label></div>
</a>
<h2><a href="/Arts/xinxiyoujidiwuji/" target="_blank">新西游记第五季</a></h2>
<p>类型:<a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> </p>
</li><li><a href="/Arts/yizhandaodi2018/" title="一站到底2018" target="_blank">
<div class="picsize">
<img class="loading" src="//wx3.sinaimg.cn/mw690/006We1hygy1fn9b6cndz9j304i06ijrn.jpg"  alt="一站到底2018"/><label class="score">0.0</label>
<label class="status"></label><label class="title">更新至第20181008集</label></div>
</a>
<h2><a href="/Arts/yizhandaodi2018/" target="_blank">一站到底2018</a></h2>
<p>类型:<a href='/Arts/index_1_127______1.html' target='_blank'>益智</a> <a href='/Arts/index_1_98______1.html' target='_blank'>娱乐</a> <a href='/Arts/index_1_144______1.html' target='_blank'>竞技</a> </p>
</li><li><a href="/Arts/liangtianyiye2018/" title="两天一夜2018" target="_blank">
<div class="picsize">
<img class="loading" src="//wx3.sinaimg.cn/mw690/006We1hygy1fn99w3u4eoj304t06tt8y.jpg"  alt="两天一夜2018"/><label class="score">10.0</label>
<label class="status"></label><label class="title">更新至第20181007集</label></div>
</a>
<h2><a href="/Arts/liangtianyiye2018/" target="_blank">两天一夜2018</a></h2>
<p>类型:<a href='/Arts/index_1_19______1.html' target='_blank'>纪实</a> <a href='/Arts/index_1_20______1.html' target='_blank'>生活</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> </p>
</li><li><a href="/Arts/hanguorenqigeyao2018/" title="韩国人气歌谣2018" target="_blank">
<div class="picsize">
<img class="loading" src="//wx3.sinaimg.cn/mw690/006We1hygy1fn9jqb2jqej304j06h3yt.jpg"  alt="韩国人气歌谣2018"/><label class="score">2.0</label>
<label class="status"></label><label class="title">更新至第20181007集</label></div>
</a>
<h2><a href="/Arts/hanguorenqigeyao2018/" target="_blank">韩国人气歌谣2018</a></h2>
<p>类型:<a href='/Arts/index_1_21______1.html' target='_blank'>歌舞</a> <a href='/Arts/index_1_92______1.html' target='_blank'>音乐</a> <a href='/Arts/index_1_98______1.html' target='_blank'>娱乐</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> </p>
</li><li><a href="/Arts/mengmiangewanghanguoban/" title="蒙面歌王 韩国版" target="_blank">
<div class="picsize">
<img class="loading" src="//wx2.sinaimg.cn/mw690/006We1hyly1fnxbh3cxvvj3044060dfz.jpg"  alt="蒙面歌王 韩国版"/><label class="score">6.0</label>
<label class="status"></label><label class="title">更新至第20181007集</label></div>
</a>
<h2><a href="/Arts/mengmiangewanghanguoban/" target="_blank">蒙面歌王 韩国版</a></h2>
<p>类型:<a href='/Arts/index_1_21______1.html' target='_blank'>歌舞</a> <a href='/Arts/index_1_92______1.html' target='_blank'>音乐</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> <a href='/Arts/index_1_144______1.html' target='_blank'>竞技</a> </p>
</li><li><a href="/Arts/RunningMan2018/" title="Running Man2018" target="_blank">
<div class="picsize">
<img class="loading" src="//wx4.sinaimg.cn/mw690/006We1hygy1fnp3qte715j304605zglp.jpg"  alt="Running Man2018"/><label class="score">9.2</label>
<label class="status"></label><label class="title">更新至第20181007集</label></div>
</a>
<h2><a href="/Arts/RunningMan2018/" target="_blank">Running Man2018</a></h2>
<p>类型:<a href='/Arts/index_1_93______1.html' target='_blank'>游戏</a> <a href='/Arts/index_1_98______1.html' target='_blank'>娱乐</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> </p>
</li><li><a href="/Arts/chaorenhuilailiao2018/" title="超人回来了2018" target="_blank">
<div class="picsize">
<img class="loading" src="//wx2.sinaimg.cn/mw690/006We1hygy1fo5fqdlfd7j304005r0sy.jpg"  alt="超人回来了2018"/><label class="score">10.0</label>
<label class="status"></label><label class="title">更新至第20181007集</label></div>
</a>
<h2><a href="/Arts/chaorenhuilailiao2018/" target="_blank">超人回来了2018</a></h2>
<p>类型:<a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> </p>
</li><li><a href="/Arts/tiantianxiangshang2018/" title="天天向上2018" target="_blank">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1fn9ar4n3h1j304k06kt8y.jpg"  alt="天天向上2018"/><label class="score">5.1</label>
<label class="status"></label><label class="title">更新至第20181007集</label></div>
</a>
<h2><a href="/Arts/tiantianxiangshang2018/" target="_blank">天天向上2018</a></h2>
<p>类型:<a href='/Arts/index_1_98______1.html' target='_blank'>娱乐</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> <a href='/Arts/index_1_102______1.html' target='_blank'>脱口秀</a> </p>
</li><li><a href="/Arts/xindongdexinhao/" title="心动的信号" target="_blank">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1funjmpccm3j304205zglt.jpg"  alt="心动的信号"/><label class="score">8.0</label>
<label class="status"></label><label class="title">更新至第20181007集</label></div>
</a>
<h2><a href="/Arts/xindongdexinhao/" target="_blank">心动的信号</a></h2>
<p>类型:<a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> </p>
</li><li><a href="/Arts/geshou2019/" title="歌手2019" target="_blank">
<div class="picsize">
<img class="loading" src="//wx2.sinaimg.cn/mw690/006We1hygy1fw01whnhlzj304205v3yq.jpg"  alt="歌手2019"/><label class="score">0.0</label>
<label class="title">预告</label></div>
</a>
<h2><a href="/Arts/geshou2019/" target="_blank">歌手2019</a></h2>
<p>类型:<a href='/Arts/index_1_21______1.html' target='_blank'>歌舞</a> <a href='/Arts/index_1_92______1.html' target='_blank'>音乐</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> <a href='/Arts/index_1_144______1.html' target='_blank'>竞技</a> </p>
</li><li><a href="/Arts/yonggandeshijieyongwuzhijing/" title="勇敢的世界  勇无止境" target="_blank">
<div class="picsize">
<img class="loading" src="//wx4.sinaimg.cn/mw690/006We1hygy1fuf2jv0rgrj304h05x0sv.jpg"  alt="勇敢的世界  勇无止境"/><label class="score">10.0</label>
<label class="status"></label><label class="title">更新至第20181007集</label></div>
</a>
<h2><a href="/Arts/yonggandeshijieyongwuzhijing/" target="_blank">勇敢的世界  勇无止境</a></h2>
<p>类型:<a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> <a href='/Arts/index_1_144______1.html' target='_blank'>竞技</a> </p>
</li><li><a href="/Arts/peinikanshuochang/" title="陪你看说唱" target="_blank">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1ftk46khedgj304705x0sy.jpg"  alt="陪你看说唱"/><label class="score">2.0</label>
<label class="status"></label><label class="title">更新至第20181007集</label></div>
</a>
<h2><a href="/Arts/peinikanshuochang/" target="_blank">陪你看说唱</a></h2>
<p>类型:<a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> <a href='/Arts/index_1_102______1.html' target='_blank'>脱口秀</a> </p>
</li><li><a href="/Arts/xingguangdadao2018/" title="星光大道2018" target="_blank">
<div class="picsize">
<img class="loading" src="//wx3.sinaimg.cn/mw690/006We1hygy1fo4ea5xtbfj304605yt8w.jpg"  alt="星光大道2018"/><label class="score">2.0</label>
<label class="status"></label><label class="title">更新至第20181007集</label></div>
</a>
<h2><a href="/Arts/xingguangdadao2018/" target="_blank">星光大道2018</a></h2>
<p>类型:<a href='/Arts/index_1_21______1.html' target='_blank'>歌舞</a> <a href='/Arts/index_1_92______1.html' target='_blank'>音乐</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> <a href='/Arts/index_1_144______1.html' target='_blank'>竞技</a> </p>
</li><li><a href="/Arts/chaojiyezonghui2018/" title="超级夜总会2018" target="_blank">
<div class="picsize">
<img class="loading" src="//wx3.sinaimg.cn/mw690/006We1hygy1fn99psyt2uj304o06l74o.jpg"  alt="超级夜总会2018"/><label class="score">10.0</label>
<label class="status"></label><label class="title">更新至第20181006集</label></div>
</a>
<h2><a href="/Arts/chaojiyezonghui2018/" target="_blank">超级夜总会2018</a></h2>
<p>类型:<a href='/Arts/index_1_19______1.html' target='_blank'>纪实</a> <a href='/Arts/index_1_98______1.html' target='_blank'>娱乐</a> <a href='/Arts/index_1_100______1.html' target='_blank'>搞笑</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> </p>
</li><li><a href="/Arts/tiancaichongchongchong2018/" title="天才冲冲冲2018" target="_blank">
<div class="picsize">
<img class="loading" src="//wx3.sinaimg.cn/mw690/006We1hygy1fn9add8e7bj304k06hdg6.jpg"  alt="天才冲冲冲2018"/><label class="score">6.7</label>
<label class="status"></label><label class="title">更新至第20181006集</label></div>
</a>
<h2><a href="/Arts/tiancaichongchongchong2018/" target="_blank">天才冲冲冲2018</a></h2>
<p>类型:<a href='/Arts/index_1_93______1.html' target='_blank'>游戏</a> <a href='/Arts/index_1_98______1.html' target='_blank'>娱乐</a> <a href='/Arts/index_1_100______1.html' target='_blank'>搞笑</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> </p>
</li><li><a href="/Arts/zongyi3guozhi2018/" title="综艺3国智2018" target="_blank">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1fn9ab8xjvvj304q06k0sx.jpg"  alt="综艺3国智2018"/><label class="score">10.0</label>
<label class="status"></label><label class="title">更新至第20181006集</label></div>
</a>
<h2><a href="/Arts/zongyi3guozhi2018/" target="_blank">综艺3国智2018</a></h2>
<p>类型:<a href='/Arts/index_1_98______1.html' target='_blank'>娱乐</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> <a href='/Arts/index_1_102______1.html' target='_blank'>脱口秀</a> </p>
</li><li><a href="/Arts/zongyiwanhenda2018/" title="综艺玩很大2018" target="_blank">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1fn9aaa4k3zj304q06kmxc.jpg"  alt="综艺玩很大2018"/><label class="score">8.0</label>
<label class="status"></label><label class="title">更新至第20181006集</label></div>
</a>
<h2><a href="/Arts/zongyiwanhenda2018/" target="_blank">综艺玩很大2018</a></h2>
<p>类型:<a href='/Arts/index_1_98______1.html' target='_blank'>娱乐</a> <a href='/Arts/index_1_100______1.html' target='_blank'>搞笑</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> </p>
</li><li><a href="/Arts/yiqilaitiaowu/" title="一起来跳舞" target="_blank">
<div class="picsize">
<img class="loading" src="//wx4.sinaimg.cn/mw690/006We1hygy1fuvn0n8copj304a05xt8x.jpg"  alt="一起来跳舞"/><label class="score">10.0</label>
<label class="status"></label><label class="title">更新至第20181006集</label></div>
</a>
<h2><a href="/Arts/yiqilaitiaowu/" target="_blank">一起来跳舞</a></h2>
<p>类型:<a href='/Arts/index_1_21______1.html' target='_blank'>歌舞</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> </p>
</li><li><a href="/Arts/zhongguoxinshuochang/" title="中国新说唱" target="_blank">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1ftabss35h2j304805ymx8.jpg"  alt="中国新说唱"/><label class="score">10.0</label>
<label class="status"></label><label class="title">更新至第20181006集</label></div>
</a>
<h2><a href="/Arts/zhongguoxinshuochang/" target="_blank">中国新说唱</a></h2>
<p>类型:<a href='/Arts/index_1_92______1.html' target='_blank'>音乐</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> <a href='/Arts/index_1_144______1.html' target='_blank'>竞技</a> </p>
</li><li><a href="/Arts/zhongguoxinshengdaidiwuji/" title="中国新声代第五季" target="_blank">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1fuuzmrj6i6j304605yglr.jpg"  alt="中国新声代第五季"/><label class="score">0.0</label>
<label class="status"></label><label class="title">更新至第20181006集</label></div>
</a>
<h2><a href="/Arts/zhongguoxinshengdaidiwuji/" target="_blank">中国新声代第五季</a></h2>
<p>类型:<a href='/Arts/index_1_24______1.html' target='_blank'>少儿</a> <a href='/Arts/index_1_92______1.html' target='_blank'>音乐</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> </p>
</li><li><a href="/Arts/jinqulaozhitaozhanzhudage/" title="金曲捞之挑战主打歌" target="_blank">
<div class="picsize">
<img class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1fthjhpenpbj304305r74d.jpg"  alt="金曲捞之挑战主打歌"/><label class="score">10.0</label>
<label class="status"></label><label class="title">已完结</label></div>
</a>
<h2><a href="/Arts/jinqulaozhitaozhanzhudage/" target="_blank">金曲捞之挑战主打歌</a></h2>
<p>类型:<a href='/Arts/index_1_21______1.html' target='_blank'>歌舞</a> <a href='/Arts/index_1_92______1.html' target='_blank'>音乐</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> </p>
</li><li><a href="/Arts/aiqingbaoweizhan2018/" title="爱情保卫战2018" target="_blank">
<div class="picsize">
<img class="loading" src="//wx3.sinaimg.cn/mw690/006We1hygy1fn3do2nji8j305p083t92.jpg"  alt="爱情保卫战2018"/><label class="score">10.0</label>
<label class="status"></label><label class="title">更新至第20181005集</label></div>
</a>
<h2><a href="/Arts/aiqingbaoweizhan2018/" target="_blank">爱情保卫战2018</a></h2>
<p>类型:<a href='/Arts/index_1_22______1.html' target='_blank'>故事</a> <a href='/Arts/index_1_89______1.html' target='_blank'>情感</a> <a href='/Arts/index_1_90______1.html' target='_blank'>访谈</a> </p>
</li><li><a href="/Arts/zhongcantingdierji/" title="中餐厅第二季" target="_blank">
<div class="picsize">
<img class="loading" src="//wx2.sinaimg.cn/mw690/006We1hygy1ftacipfmq1j304405vglv.jpg"  alt="中餐厅第二季"/><label class="score">10.0</label>
<label class="status"></label><label class="title">已完结</label></div>
</a>
<h2><a href="/Arts/zhongcantingdierji/" target="_blank">中餐厅第二季</a></h2>
<p>类型:<a href='/Arts/index_1_94______1.html' target='_blank'>美食</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> </p>
</li><li><a href="/Arts/huanlezhicheng/" title="幻乐之城" target="_blank">
<div class="picsize">
<img class="loading" src="//wx4.sinaimg.cn/mw690/006We1hygy1ftgpsf4dhsj3043062dg0.jpg"  alt="幻乐之城"/><label class="score">10.0</label>
<label class="status"></label><label class="title">更新至第20181005集</label></div>
</a>
<h2><a href="/Arts/huanlezhicheng/" target="_blank">幻乐之城</a></h2>
<p>类型:<a href='/Arts/index_1_92______1.html' target='_blank'>音乐</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> </p>
</li></ul>
</div>
</div>
<div class="ui-vpages"><strong>共1378部&nbsp;3/58</strong><a href="/Arts/index_1_______1.html" class="prev disabled" data="p-0">首页</a>&nbsp;<a href="/Arts/index_2_______1.html" class="prev" data="p-2">上一页</a>&nbsp;<a href="/Arts/index_1_______1.html" data="p-1">1</a>&nbsp;<a href="/Arts/index_2_______1.html" data="p-2">2</a>&nbsp;<span class="current">3</span>&nbsp;<a href="/Arts/index_4_______1.html" data="p-4">4</a>&nbsp;<a href="/Arts/index_5_______1.html" data="p-5">5</a>&nbsp;<a href="/Arts/index_6_______1.html" data="p-6">6</a>&nbsp;<a href="/Arts/index_4_______1.html" class="next pagegbk" data="p-4">下一页</a>&nbsp;<a href="/Arts/index_58_______1.html" class="next pagegbk" data="p-58">尾页</a></div>
<!--底部开始-->
<div class="footer">
<div class="fBox">
<div class="footer_nav"><a href="/new.html" target="_self">最新更新</a>-<a href="/top.html" target="_self">影视排行</a>-<a href="https://www.kankanwu.com/gb-show-p-1.html" target="_self">留言反馈</a>-<script type="text/javascript" src="/le/tongji.js"></script></div>
本网站为非赢利性站点，本网站所有内容均来源于互联网相关站点自动搜索采集信息，相关链接已经注明来源。</div>
</div>
<script type="text/javascript" src="/static/js/zepto.min.js"></script>
<script type="text/javascript" src="/static/js/iscroll.js"></script>
<script type="text/javascript" src="/static/js/common.min.js"></script>
<script type="text/javascript" src="/static/js/index.min.js"></script>
<script type="text/javascript" src="/xuxu/le.js" charset="utf-8"></script>

<script type="text/javascript" src="/static/js/list.min.js"></script>
</body>
</html>"""

    //详情
    val detailHtml = """<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no" id="viewport" name="viewport">
<title>《这！就是歌唱·对唱季》全集在线观看 - 综艺 - 迅雷下载 - 看看屋手机版</title>
<meta name="keywords" content="这！就是歌唱·对唱季全集,这！就是歌唱·对唱季全集在线观看,这！就是歌唱·对唱季迅雷下载" />
<meta name="description" content="看看屋手机版提供这！就是歌唱·对唱季全集在线观看,由著名演员鹿晗 / 罗志祥 / 李荣浩主演,主要讲叙了《这！就是歌唱·对唱季》剧情简介：看看屋每天第一时间为您提供最新在线影视《这！就是歌唱·对唱季》！是一档大型音乐对唱剧情" />
<script src="/js/uaredirectformobile.js" type="text/javascript"></script>
<script type="text/javascript">uaredirect("http://www.kankanwu.com/Arts/zhejiushigechangduichangji/");</script>
<link type="text/css" rel="stylesheet" href="/static/css/index.css" />
<link rel="shortcut icon" href="/favicon.ico" charset="utf-8" />
<script type="text/javascript">var Root='/';var Sid='1';var Cid='4';var Id='56203';</script>
<script type="text/javascript" src="/static/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="/static/js/jquery-lazyload.js"></script>
<script type="text/javascript" src="/static/js/jquery.base.js"></script>
<script type="text/javascript" src="/static/js/home.js"></script>

<script language="javascript" src="/js/webThunderDetect.js"></script></head>
<body>
<header id='test' class="header clearfix">
         <a href="javascript:void(0);" target="_self" class="aChannel top_channel_btn"><span>综艺</span><i class="moreArrow"></i></a>  <a href="javascript:void(0);" target="_self" class="aHeaderSearch top_search_btn"><i class="globalIcon searchIcon"></i><em>全网搜索</em></a>
    <a href="/" target="_self" class="aHeaderFun"><i class="globalIcon indexIcon"></i><span>首页</span></a><p class="headerChannelList">
<a  target="_self" href="/">首页</a>
<a  target="_self" href="/dsj/index.html">电视剧</a><a  target="_self" href="/dy/index.html">电影</a><a  target="_self" href="/Animation/index.html">动漫</a><a class="current" target="_self" href="/Arts/index.html">综艺</a><a  target="_self" href="/microfilm/index.html">微电影</a> <a href="/top.html" target="_self">榜单</a>
  <a href="/new.html" target="_self">最新</a>
<a href="/zhuanti/" target="_self">专题</a>
  </p>
<section class="searchPop popShow">
<section class="searchCon">
<form id="search" name="search" action="/vod-search" method="post" onSubmit="return qrsearch();">
<span class="sSearchInput"><input autocomplete="off" autovalue="请输入片名或主演名" class="searchInput" placeholder="请输入片名或主演名" type="search" id="wd" name="wd">
</span>
<input class="cancelInput1" value="取消" type="button">
<input type="submit" id="searchbutton" class="cancelInput" value="搜索">
</form></section>
<section class="search_hotkey">
		<section class="th"><span class="sMark">热门搜索</span>
		</section>
		<section class="tb">
		<p class="pHistory clearfix">
<a href="/Action/zhanlang2/" target="_self">战狼2 完整版</a><a href="/Animation/huajianghuzhifengyuzhou/" target="_self">画江湖之风语咒</a><a href="/Animation/haizeiwang/" target="_self">海贼王</a><a href="/Domestic/wuxinfashi2/" target="_self">无心法师2</a><a href="/Domestic/doupocangqiong/" target="_self">斗破苍穹 </a><a href="/Action/wushuang/" target="_self">无双</a><a href="/Action/diezhongdie6quanmianwajie/" target="_self">碟中谍6：全面瓦解</a><a href="/HongKong/tongmengyueyu/" target="_self">同盟粤语</a><a href="/Domestic/liechang/" target="_self">猎场 </a><a href="/Sciencefiction/yirenyuhuangfengnv/" target="_self">蚁人与黄蜂女 </a><a href="/Action/poju/" target="_self">破局</a><a href="/Action/yushentongxing2yinyuyuan/" target="_self">与神同行2：因与缘</a></p></section></section>
 </section>
	</header>
  <div class="mask" id="common_mask"></div>
<div class="list_nav" style="border:none">
<div class="main fn-left"><span>您所在的位置：</span><a href="/" title="看看屋手机版" target="_self">首页</a>
<em><i class="iconfont">&#xe621;</i></em><a href="/Arts/index.html" title="综艺" target="_self">综艺</a><em><i class="iconfont">&#xe621;</i></em> <a class="current" title="这！就是歌唱·对唱季" href="/Arts/zhejiushigechangduichangji/" target="_self">这！就是歌唱·对</a></div></div>
<div class="vod-body">
<div class="main" id="resize_vod">
<div class="vod-l">
<div class="vod-n-img">
<img class="loading" src="http://wx3.sinaimg.cn/mw690/006scYDsgy1fdw17jxnr5j306408j747.jpg" data-original="//wx3.sinaimg.cn/mw690/006We1hygy1ftotch9fuqj306f0900t5.jpg" alt="这！就是歌唱·对唱季"/><div class="status"></div><div class="vod-ty"><div class="vod-ty-t"></div><div class="vod-ty-b"></div>
</div></div>
<div class="vod_play"><a href="#SOHUCS"><i class="iconfont">&#xe61d;评论</i></a></div>
</div>
<div class="vod-n-l">
<h1>这！就是歌唱·对唱季</h1>
<p class="clear  fn-left"><em>状态：</em>已更新至20181012期</p>
<p class="vw100 clear"><em>主演：</em><storng><a rel="nofollow" href="/vod-search-wd-%E9%B9%BF%E6%99%97-p-1.html" target="_blank">鹿晗</a></storng><storng><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></storng><storng><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></storng><storng><a rel="nofollow" href="/vod-search-wd-%E7%BD%97%E5%BF%97%E7%A5%A5-p-1.html" target="_blank">罗志祥</a></storng><storng><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></storng><storng><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></storng><storng><a rel="nofollow" href="/vod-search-wd-%E6%9D%8E%E8%8D%A3%E6%B5%A9-p-1.html" target="_blank">李荣浩</a></storng></p>
<p class="vw100 fn-left"><em>类型：</em><a href='/Arts/index_1_92______1.html' target='_blank'>音乐</a> <a href='/Arts/index_1_101______1.html' target='_blank'>真人秀</a> </p>
<p class="vw50 fn-left"><em>导演：</em><storng><a rel="nofollow" href="/vod-search-wd-%E5%86%85%E8%AF%A6-p-1.html" target="_blank">内详</a></storng></p>
<p class="vw50 yc fn-right"><em>年份：</em><storng><a rel="nofollow" href="/vod-search-wd-2018-p-1.html" target="_blank">2018</a></storng></p>
<p class="vw50 yc fn-left"><em>语言：</em><font color="829225">普通话对白/中文字幕</font></p>
<p class="vw50 yc fn-right"><em>地区：</em><a href="/Arts/index_1______%E5%A4%A7%E9%99%86_1.html" target="_self">大陆</a></p>
<p class="vw100"><em>更新：</em>2018-10-13 00:12:55</p>
<div class="v-js clear yc"><em>简介：</em>《这！就是歌唱·对唱季》剧情简介：看看屋每天第一时间为您提供最新在线影视《这！就是歌唱·对唱季》！是一档大型音乐对唱剧情式真人秀，由岑俊义担任总导演、…</div>
</div>
</div>
</div>
<script type="text/javascript" src="/xuxu/20X4.js" charset="utf-8"></script>
<div class="vod-play-tab main">
      <ul>
        <li><span class="current" onMouseDown="setTab('vod',1,4);" id="vod1">剧集</span></li>
        <li><span onMouseDown="setTab('vod',2,4);" id="vod2">简介</span></li>
        <li class="fn-hide"><span onMouseDown="setTab('vod',3,4);" id="vod3">剧情</span></li>        <li class="fn-hide"><span onMouseDown="setTab('vod',4,4);" id="vod4">花絮</span></li>      </ul>
</div>
<div class="vod-play-info main">
<div class="vod-info-tab" id="con_vod_1" >
  <div class="play-title">
                <span style="background:none;color:#333;font-size:0.867rem;height:2rem;line-height:2rem; float:left;min-width:1.667rem; margin-right:0.3rem">播放源</span>
                                        <span id="m3u8new"  class="current"><a>在线2</a></span>                    <span id="vip"  ><a>在线1</a></span>
        </div>
                                          <div class="play-box"  id="m3u8new" style="display:block">

<div class="order">列表排序：<a rel="nofollow" class="desc" href="javascript:void(0);" data="0"><i class="iconfont">&#xe620;</i>降序</a></div>

  <ul class="plau-ul-list">
         <li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-18.html"  target="_self" title="20181012期" alt="20181012期">20181012期 <i class='iNewIcon'></i> </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-17.html"  target="_self" title="20181005期" alt="20181005期">20181005期  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-16.html"  target="_self" title="20180928期" alt="20180928期">20180928期  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-15.html"  target="_self" title="20180921期" alt="20180921期">20180921期  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-14.html"  target="_self" title="20180917期" alt="20180917期">20180917期  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-13.html"  target="_self" title="20180914期" alt="20180914期">20180914期  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-12.html"  target="_self" title="20180910期" alt="20180910期">20180910期  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-11.html"  target="_self" title="20180907期" alt="20180907期">20180907期  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-10.html"  target="_self" title="20180902期" alt="20180902期">20180902期  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-9.html"  target="_self" title="20180831期" alt="20180831期">20180831期  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-8.html"  target="_self" title="20180827期" alt="20180827期">20180827期  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-7.html"  target="_self" title="20180824期" alt="20180824期">20180824期  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-6.html"  target="_self" title="20180820期" alt="20180820期">20180820期  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-5.html"  target="_self" title="20180817期" alt="20180817期">20180817期  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-4.html"  target="_self" title="20180813期" alt="20180813期">20180813期  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-3.html"  target="_self" title="20180810期" alt="20180810期">20180810期  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-2.html"  target="_self" title="20180806期" alt="20180806期">20180806期  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-1.html"  target="_self" title="20180803期" alt="20180803期">20180803期  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-0-0.html"  target="_self" title="20180727期" alt="20180727期">20180727期  </a></li>
  </ul>
  </div>                    <div class="play-box"  id="vip" style="display:none">

<div class="order">列表排序：<a rel="nofollow" class="desc" href="javascript:void(0);" data="1"><i class="iconfont">&#xe620;</i>降序</a></div>

  <ul class="plau-ul-list">
         <li>
 <a href="/Arts/zhejiushigechangduichangji/player-1-11.html"  target="_self" title="20181012" alt="20181012">20181012 <i class='iNewIcon'></i> </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-1-10.html"  target="_self" title="20181005" alt="20181005">20181005  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-1-9.html"  target="_self" title="20180928" alt="20180928">20180928  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-1-8.html"  target="_self" title="20180921" alt="20180921">20180921  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-1-7.html"  target="_self" title="20180914" alt="20180914">20180914  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-1-6.html"  target="_self" title="20180907" alt="20180907">20180907  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-1-5.html"  target="_self" title="20180831" alt="20180831">20180831  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-1-4.html"  target="_self" title="20180824" alt="20180824">20180824  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-1-3.html"  target="_self" title="20180817" alt="20180817">20180817  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-1-2.html"  target="_self" title="20180810" alt="20180810">20180810  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-1-1.html"  target="_self" title="20180803" alt="20180803">20180803  </a></li><li>
 <a href="/Arts/zhejiushigechangduichangji/player-1-0.html"  target="_self" title="20180727" alt="20180727">20180727  </a></li>
  </ul>
  </div>
  <div class="play-title">
                 <span class="current"><a style="padding-right:10px; padding-left:10px;">迅雷下载</a></span>
                </div>
                 <ul class="plau-ul-list">
                                 <li class="zy"><a href="thunder://QUFodHRwOi8vdmlwLnp1aWt1OC5jb20vMTgxMC/V4qOhvs3Kx7jos6qhpLbUs6q8vjIwMTgxMDA1Lm1wNFpa" target="_blank">20181005</a></li> <li class="zy"><a href="thunder://QUFmdHA6Ly95Z2R5ODp5Z2R5OEB5Zzc2LmR5ZHl0dC5uZXQ6NjQ0MS9b0fS54rXn07Atd3d3LnlnZHk4LmNvbV3V4r7Nyse46LOqMjAxODA5MjgubXA0Wlo=" target="_blank">20180928</a></li> <li class="zy"><a href="thunder://QUFodHRwOi8vdmlwLnp1aWt1OC5jb20vMTgwOS/V4qOhvs3Kx7jos6qhpLbUs6q8vjIwMTgwOTIxLm1wNFpa" target="_blank">20180921</a></li> <li class="zy"><a href="thunder://QUFodHRwOi8veHVubGVpYi56dWlkYTM2MC5jb20vMTgwOS/V4qOhvs3Kx7jos6qhpLbUs6q8vjIwMTgwOTE3Lm1wNFpa" target="_blank">20180917</a></li> <li class="zy"><a href="thunder://QUFodHRwOi8vdmlwLnp1aWt1OC5jb20vMTgwOS/V4qOhvs3Kx7jos6qhpLbUs6q8vjIwMTgwOTE0Lm1wNFpa" target="_blank">20180914</a></li> <li class="zy"><a href="thunder://QUFodHRwOi8vdmlwLnp1aWt1OC5jb20vMTgwOS/V4qOhvs3Kx7jos6qhpLbUs6q8vjIwMTgwOTEwLm1wNFpa" target="_blank">20180910</a></li> <li class="zy"><a href="thunder://QUFodHRwOi8vdmlwLnp1aWt1OC5jb20vMTgwOS/V4qOhvs3Kx7jos6qhpLbUs6q8vjIwMTgwOTAyLm1wNFpa" target="_blank">20180902</a></li> <li class="zy"><a href="thunder://QUFodHRwOi8vdmlwLnp1aWt1OC5jb20vMTgwOC/V4qOhvs3Kx7jos6qhpLbUs6q8vjIwMTgwODI0Lm1wNFpa" target="_blank">20180824</a></li> <li class="zy"><a href="thunder://QUFodHRwOi8vdmlwLnp1aWt1OC5jb20vMTgwOC/V4qOhvs3Kx7jos6qhpLbUs6q8vjIwMTgwODIwLm1wNFpa" target="_blank">20180820</a></li> <li class="zy"><a href="thunder://QUFodHRwOi8vdmlwLnp1aWt1OC5jb20vMTgwOC/V4qOhvs3Kx7jos6qhpLbUs6q8vjIwMTgwODE3Lm1wNFpa" target="_blank">20180817</a></li> <li class="zy"><a href="thunder://QUFodHRwOi8vdmlwLnp1aWt1OC5jb20vMTgwOC/V4qOhvs3Kx7jos6qhpLbUs6q8vjIwMTgwODEzLm1wNFpa" target="_blank">20180813</a></li> <li class="zy"><a href="thunder://QUFodHRwOi8vdmlwLnp1aWt1OC5jb20vMTgwOC/V4qOhvs3Kx7jos6qhpLbUs6q8vjIwMTgwODEwLm1wNFpa" target="_blank">20180810</a></li> <li class="zy"><a href="thunder://QUFodHRwOi8vdmlwLnp1aWt1OC5jb20vMTgwOC/ov5nvvIHlsLHmmK/mrYzllLHCt+WvueWUseWtozIwMTgwODA2Lm1wNFpa" target="_blank">20180806</a></li> <li class="zy"><a href="thunder://QUFodHRwOi8vdmlwLnp1aWt1OC5jb20vMTgwOC/V4qOhvs3Kx7jos6qhpLbUs6q8vjIwMTgwODAzLm1wNFpa" target="_blank">20180803</a></li> <li class="zy"><a href="thunder://QUFodHRwOi8vdmlwLnp1aWt1OC5jb20vMTgwNy/V4qOhvs3Kx7jos6qhpLbUs6q8vjIwMTgwNzI3Lm1wNFpa" target="_blank">20180727</a></li>
                </ul>

</div>
<!--简介板块-->
<div class="vod-info-tab fn-hide" id="con_vod_2">
<div class="vod_content">
《这！就是歌唱·对唱季》剧情简介：看看屋每天第一时间为您提供最新在线影视《这！就是歌唱·对唱季》！是一档大型音乐对唱剧情式真人秀，由岑俊义担任总导演、欣喜文化制作。节目由乐坛三位明星发起人鹿晗、罗志祥、李荣浩＋男女对唱搭档的阵容组成。90名颜艺俱佳且有个性的年轻男女选手在节目中组成音乐搭档，通过三个阶段的层层关卡突出重围，最终将有一对音乐搭档获得总冠军并获得顶级资源支持！节目使用“剧情式”制作手法，从“遇见心跳的TA”到“携手厮杀团魂激荡”再到“只为我与你而战”，突如其来意想不到的残酷赛制、音乐搭档间的分分合合、默契与情感火花将成为节目除选手音乐实力以外的突破和看点！这个夏天，我们一起对上心跳，唱出味道！</div>
</div>
<div  class="main vod-botx-title">
<ul>
<li id="latest1" onclick="setTab('latest',1,3);" class="current">猜你喜欢</li>
<li id="latest2" onclick="setTab('latest',2,3);">同演员</li>
<li id="latest3" onclick="setTab('latest',3,3);">同导演</li></ul>
 </div>

  <div class="main" id="resize_list">
<div class="all_tab" style="border-bottom:none" id="con_latest_1" style="display:block">
<ul class="list_tab_img" >
     <li><a href="/Arts/di46jiequanmeiyinledajiang/" title="第46届全美音乐大奖" target="_self">
<div class="picsize">
<img  class="loading" src="/Uploads/vod/2018-10-13/5bc194a445268.JPG" alt="第46届全美音乐大奖"/><label class="score">0.0</label>
<label class="title">BD高清</label>
</div>
</a>
<h2><a href="/Arts/di46jiequanmeiyinledajiang/" target="_self">第46届全美音乐大奖</a></h2>
</li><li><a href="/Arts/qinaidekezhandierji/" title="亲爱的客栈第二季" target="_self">
<div class="picsize">
<img  class="loading" src="/Uploads/vod/2018-10-13/5bc0c9e3efd72.JPG" alt="亲爱的客栈第二季"/><label class="score">10.0</label>
<label class="title">连载至20181012集</label>
</div>
</a>
<h2><a href="/Arts/qinaidekezhandierji/" target="_self">亲爱的客栈第二季</a></h2>
</li><li><a href="/Arts/huoxingqingbaojudisiji/" title="火星情报局第四季" target="_self">
<div class="picsize">
<img  class="loading" src="/Uploads/vod/2018-10-12/5bc02066bcf93.JPG" alt="火星情报局第四季"/><label class="score">8.0</label>
<label class="title">连载至20181012集</label>
</div>
</a>
<h2><a href="/Arts/huoxingqingbaojudisiji/" target="_self">火星情报局第四季</a></h2>
</li>
</ul>
</div>
<div class="all_tab fn-hide" style="border-bottom:none" id="con_latest_2">
<ul class="list_tab_img">

<li><a href="/Arts/chuangzao101daoshijiaoshidi1ji/" title="创造101导师教室第1季" target="_self">
<div class="picsize">
<img  class="loading" src="//wx4.sinaimg.cn/mw690/006We1hygy1fsm2n5mvkgj304805z0sv.jpg"  alt="创造101导师教室第1季"/><label class="score">0.0</label>
<label class="title">连载至8集</label>
</div>
</a>
<h2><a href="/Arts/chuangzao101daoshijiaoshidi1ji/" target="_self">创造101导师教室第1季</a></h2>
</li><li><a href="/Arts/chuangzao101youxiangbandi1ji/" title="创造101悠享版第1季" target="_self">
<div class="picsize">
<img  class="loading" src="//wx1.sinaimg.cn/mw690/006We1hygy1fsm2kkn8w3j304705y74e.jpg"  alt="创造101悠享版第1季"/><label class="score">8.0</label>
<label class="title">已完结</label>
</div>
</a>
<h2><a href="/Arts/chuangzao101youxiangbandi1ji/" target="_self">创造101悠享版第1季</a></h2>
</li><li><a href="/Arts/101susherijidi1ji/" title="101宿舍日记第1季" target="_self">
<div class="picsize">
<img  class="loading" src="//wx2.sinaimg.cn/mw690/006We1hygy1fsm2ilcgm1j304205v3yo.jpg"  alt="101宿舍日记第1季"/><label class="score">0.0</label>
<label class="title">连载至16集</label>
</div>
</a>
<h2><a href="/Arts/101susherijidi1ji/" target="_self">101宿舍日记第1季</a></h2>
</li>
</ul>

</div>
<div class="all_tab fn-hide" style="border-bottom:none" id="con_latest_3">
<ul class="list_tab_img" >
			<li><a href="/Arts/di46jiequanmeiyinledajiang/" title="第46届全美音乐大奖" target="_self">
<div class="picsize">
<img  class="loading" src="//wx3.sinaimg.cn/mw690/006We1hygy1fw6lepk8cwj304e05xwep.jpg"  alt="第46届全美音乐大奖"/><label class="score">0.0</label>
<label class="title">BD高清</label>
</div>
</a>
<h2><a href="/Arts/di46jiequanmeiyinledajiang/" target="_self">第46届全美音乐大奖</a></h2>
</li><li><a href="/Arts/bamaxueqianban/" title="爸妈学前班" target="_self">
<div class="picsize">
<img  class="loading" src="//wx3.sinaimg.cn/mw690/006We1hygy1fw4k2z3m8jj304805yjrm.jpg"  alt="爸妈学前班"/><label class="score">0.0</label>
<label class="title">连载至20181011集</label>
</div>
</a>
<h2><a href="/Arts/bamaxueqianban/" target="_self">爸妈学前班</a></h2>
</li><li><a href="/Arts/qipashuodiwuji/" title="奇葩说第五季" target="_self">
<div class="picsize">
<img  class="loading" src="//wx2.sinaimg.cn/mw690/006We1hygy1fvhkygfemsj304605ymxh.jpg"  alt="奇葩说第五季"/><label class="score">10.0</label>
<label class="title">连载至20181013集</label>
</div>
</a>
<h2><a href="/Arts/qipashuodiwuji/" target="_self">奇葩说第五季</a></h2>
</li>
</ul>
</div>
</div>
<!--底部开始-->
<div class="footer">
<div class="fBox">
<div class="footer_nav"><a href="/new.html" target="_self">最新更新</a>-<a href="/top.html" target="_self">影视排行</a>-<a href="https://www.kankanwu.com/gb-show-p-1.html" target="_self">留言反馈</a>-<script type="text/javascript" src="/le/tongji.js"></script></div>
本网站为非赢利性站点，本网站所有内容均来源于互联网相关站点自动搜索采集信息，相关链接已经注明来源。</div>
</div>
<script type="text/javascript" src="/static/js/zepto.min.js"></script>
<script type="text/javascript" src="/static/js/iscroll.js"></script>
<script type="text/javascript" src="/static/js/common.min.js"></script>
<script type="text/javascript" src="/static/js/index.min.js"></script>
<script type="text/javascript" src="/xuxu/le.js" charset="utf-8"></script>

</body>
</html>"""

    //search
    val searchHtm="""
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no" id="viewport" name="viewport">
<title>teb-看看屋手机版</title>
<meta name="keywords" content="最新,">
<meta name="description" content="">
<link type="text/css" rel="stylesheet" href="/static/css/index.css" />
<link rel="shortcut icon" href="/favicon.ico" charset="utf-8" />
<script type="text/javascript">var Root='/';var Sid='1';var Cid='';var Id='';</script>
<script type="text/javascript" src="/static/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="/static/js/jquery-lazyload.js"></script>
<script type="text/javascript" src="/static/js/jquery.base.js"></script>
<script type="text/javascript" src="/static/js/home.js"></script>

</head>
<body>
<header id='test' class="header clearfix">
         <a href="javascript:void(0);" target="_self" class="aChannel top_channel_btn"><span>导航</span><i class="moreArrow"></i></a>  <a href="javascript:void(0);" target="_self" class="aHeaderSearch top_search_btn"><i class="globalIcon searchIcon"></i><em>全网搜索</em></a>
    <a href="/" target="_self" class="aHeaderFun"><i class="globalIcon indexIcon"></i><span>首页</span></a><p class="headerChannelList">
<a class="current" target="_self" href="/">首页</a>
<a  target="_self" href="/dsj/index.html">电视剧</a><a  target="_self" href="/dy/index.html">电影</a><a  target="_self" href="/Animation/index.html">动漫</a><a  target="_self" href="/Arts/index.html">综艺</a><a  target="_self" href="/microfilm/index.html">微电影</a> <a href="/top.html" target="_self">榜单</a>
  <a href="/new.html" target="_self">最新</a>
<a href="/zhuanti/" target="_self">专题</a>
  </p>
<section class="searchPop popShow">
<section class="searchCon">
<form id="search" name="search" action="/vod-search" method="post" onSubmit="return qrsearch();">
<span class="sSearchInput"><input autocomplete="off" autovalue="请输入片名或主演名" class="searchInput" placeholder="请输入片名或主演名" type="search" id="wd" name="wd">
</span>
<input class="cancelInput1" value="取消" type="button">
<input type="submit" id="searchbutton" class="cancelInput" value="搜索">
</form></section>
<section class="search_hotkey">
		<section class="th"><span class="sMark">热门搜索</span>
		</section>
		<section class="tb">
		<p class="pHistory clearfix">
<a href="/Action/zhanlang2/" target="_self">战狼2 完整版</a><a href="/Animation/huajianghuzhifengyuzhou/" target="_self">画江湖之风语咒</a><a href="/Animation/haizeiwang/" target="_self">海贼王</a><a href="/Domestic/wuxinfashi2/" target="_self">无心法师2</a><a href="/Domestic/doupocangqiong/" target="_self">斗破苍穹 </a><a href="/Action/wushuang/" target="_self">无双</a><a href="/Action/diezhongdie6quanmianwajie/" target="_self">碟中谍6：全面瓦解</a><a href="/HongKong/tongmengyueyu/" target="_self">同盟粤语</a><a href="/Domestic/liechang/" target="_self">猎场 </a><a href="/Sciencefiction/yirenyuhuangfengnv/" target="_self">蚁人与黄蜂女 </a><a href="/Action/poju/" target="_self">破局</a><a href="/Action/yushentongxing2yinyuyuan/" target="_self">与神同行2：因与缘</a></p></section></section>
 </section>
	</header>
  <div class="mask" id="common_mask"></div>

<div class="top_nav">
<a class="cur" href="javascript:;" data="type-vod">teb视频(<em>共14个</em>)</a>
</div>
<div class="main">
<div class="all_tab top">
<ul class="new_tab_img" id="resize_list">
<li><a href="/Horror/shaladebijiben/" title="莎拉的笔记本" target="_self">
<div class="picsize">
<img class="loading" src="/Uploads/vod/2018-06-29/5b3594f9e6934.JPG"  alt="莎拉的笔记本"/>
<label class="name">莎拉的笔记本</label>
</div>
 </a>
 <div class="list_info">
 <h2><a href="/Horror/shaladebijiben/" target="_self">莎拉的笔记本</a></h2>
 <p>分类：<a href="/Horror/" title="恐怖片" target="_self">恐怖片</a></p>
 <p>类型：<a href='/Horror/index_1_43______1.html' target='_blank'>惊悚</a> <a href='/Horror/index_1_12______1.html' target='_blank'>恐怖</a> </p>
 <p>演员：<span><a rel="nofollow" href="/vod-search-wd-%E8%B4%9D%E4%BC%A6%C2%B7%E9%B2%81%E5%9F%83%E8%BE%BE-p-1.html" target="_blank">贝伦·鲁埃达</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E9%A9%AC%E8%AF%BA%E6%B4%9B%C2%B7%E5%8D%A1%E5%A4%9A%E7%BA%B3-p-1.html" target="_blank">马诺洛·卡多纳</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-Florin-p-1.html" target="_blank">Florin</a></span><span><a rel="nofollow" href="/vod-search-wd-Opritescu-p-1.html" target="_blank">Opritescu</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E6%81%A9%E9%87%8C%E5%85%8B%C2%B7%E6%B4%9B%E7%BB%B4%E7%B4%A2-p-1.html" target="_blank">恩里克·洛维索</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E7%8E%9B%E4%B8%BD%E5%AE%89%C2%B7%E9%98%BF%E5%B0%94%E7%93%A6%E9%9B%B7%E6%96%AF-p-1.html" target="_blank">玛丽安·阿尔瓦雷斯</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-Ivan-p-1.html" target="_blank">Ivan</a></span><span><a rel="nofollow" href="/vod-search-wd-Mendes-p-1.html" target="_blank">Mendes</a></span></p>
 <p>状态：<label class="title">BD高清</label></p>
 <p>时间：2018-09-08 22:12:12</p>
 </div>
</li><li><a href="/Drama/qinghuanxingwo/" title="请唤醒我" target="_self">
<div class="picsize">
<img class="loading" src="/Uploads/vod/2018-08-18/5b77dc571ce9c.JPG"  alt="请唤醒我"/>
<label class="name">请唤醒我</label>
</div>
 </a>
 <div class="list_info">
 <h2><a href="/Drama/qinghuanxingwo/" target="_self">请唤醒我</a></h2>
 <p>分类：<a href="/Drama/" title="剧情片" target="_self">剧情片</a></p>
 <p>类型：<a href='/Drama/index_1_26______1.html' target='_blank'>剧情</a> <a href='/Drama/index_1_115______1.html' target='_blank'>传记</a> </p>
 <p>演员：<span><a rel="nofollow" href="/vod-search-wd-Silvana-p-1.html" target="_blank">Silvana</a></span><span><a rel="nofollow" href="/vod-search-wd-Imam-p-1.html" target="_blank">Imam</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-Beatrice-p-1.html" target="_blank">Beatrice</a></span><span><a rel="nofollow" href="/vod-search-wd-Eli-p-1.html" target="_blank">Eli</a></span></p>
 <p>状态：<label class="title">HD高清</label></p>
 <p>时间：2018-08-19 12:26:21</p>
 </div>
</li><li><a href="/Action/zuiweixiandeyouxi/" title="最危险的游戏" target="_self">
<div class="picsize">
<img class="loading" src="/Uploads/vod/2018-08-05/5b66a8fadb385.JPG"  alt="最危险的游戏"/>
<label class="name">最危险的游戏</label>
</div>
 </a>
 <div class="list_info">
 <h2><a href="/Action/zuiweixiandeyouxi/" target="_self">最危险的游戏</a></h2>
 <p>分类：<a href="/Action/" title="动作片" target="_self">动作片</a></p>
 <p>类型：<a href='/Action/index_1_8______1.html' target='_blank'>动作</a> <a href='/Action/index_1_35______1.html' target='_blank'>冒险</a> </p>
 <p>演员：<span><a rel="nofollow" href="/vod-search-wd-John-p-1.html" target="_blank">John</a></span><span><a rel="nofollow" href="/vod-search-wd-Hennigan-p-1.html" target="_blank">Hennigan</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-Eric-p-1.html" target="_blank">Eric</a></span><span><a rel="nofollow" href="/vod-search-wd-Etebari-p-1.html" target="_blank">Etebari</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-Michelle-p-1.html" target="_blank">Michelle</a></span><span><a rel="nofollow" href="/vod-search-wd-Taylor-p-1.html" target="_blank">Taylor</a></span></p>
 <p>状态：<label class="title">BD高清</label></p>
 <p>时间：2018-08-05 15:37:20</p>
 </div>
</li><li><a href="/Love/lianlianbijiben/" title="恋恋笔记本" target="_self">
<div class="picsize">
<img class="loading" src="/Uploads/vod/2018-07-04/5b3c8a4a1f13a.JPG"  alt="恋恋笔记本"/>
<label class="name">恋恋笔记本</label>
</div>
 </a>
 <div class="list_info">
 <h2><a href="/Love/lianlianbijiben/" target="_self">恋恋笔记本</a></h2>
 <p>分类：<a href="/Love/" title="爱情片" target="_self">爱情片</a></p>
 <p>类型：<a href='/Love/index_1_10______1.html' target='_blank'>爱情</a> <a href='/Love/index_1_34______1.html' target='_blank'>生活</a> <a href='/Love/index_1_26______1.html' target='_blank'>剧情</a> </p>
 <p>演员：<span><a rel="nofollow" href="/vod-search-wd-%E7%91%9E%E6%81%A9%C2%B7%E9%AB%98%E6%96%AF%E6%9E%97-p-1.html" target="_blank">瑞恩·高斯林</a></span><span><a rel="nofollow" href="/vod-search-wd-%E7%91%9E%E7%A7%8B%C2%B7%E9%BA%A6%E5%85%8B%E4%BA%9A%E5%BD%93%E6%96%AF-p-1.html" target="_blank">瑞秋·麦克亚当斯</a></span><span><a rel="nofollow" href="/vod-search-wd-%E5%90%89%E5%A8%9C%C2%B7%E7%BD%97%E5%85%B0%E5%85%B9-p-1.html" target="_blank">吉娜·罗兰兹</a></span><span><a rel="nofollow" href="/vod-search-wd-%E8%A9%B9%E5%A7%86%E6%96%AF%C2%B7%E5%8A%A0%E7%BA%B3-p-1.html" target="_blank">詹姆斯·加纳</a></span><span><a rel="nofollow" href="/vod-search-wd-%E6%96%AF%E5%A1%94%E5%B0%94%E5%8B%92%E5%A1%94%C2%B7%E6%9D%9C%E6%B3%A2%E5%88%A9%E6%96%AF-p-1.html" target="_blank">斯塔尔勒塔·杜波利斯</a></span><span><a rel="nofollow" href="/vod-search-wd-%E5%87%AF%E6%96%87%C2%B7%E5%BA%B7%E8%AF%BA%E5%88%A9-p-1.html" target="_blank">凯文·康诺利</a></span><span><a rel="nofollow" href="/vod-search-wd-%E5%B8%8C%E7%91%9F%C2%B7%E6%B2%83%E5%A5%8E%E6%96%AF%E7%89%B9-p-1.html" target="_blank">希瑟·沃奎斯特</a></span></p>
 <p>状态：<label class="title">BD高清</label></p>
 <p>时间：2018-07-04 16:50:43</p>
 </div>
</li><li><a href="/Drama/huohuyihaochuji/" title="火狐一号出击" target="_self">
<div class="picsize">
<img class="loading" src="/Uploads/vod/2018-06-12/5b1fce5859d23.JPG"  alt="火狐一号出击"/>
<label class="name">火狐一号出击</label>
</div>
 </a>
 <div class="list_info">
 <h2><a href="/Drama/huohuyihaochuji/" target="_self">火狐一号出击</a></h2>
 <p>分类：<a href="/Drama/" title="剧情片" target="_self">剧情片</a></p>
 <p>类型：<a href='/Drama/index_1_43______1.html' target='_blank'>惊悚</a> <a href='/Drama/index_1_28______1.html' target='_blank'>历史</a> <a href='/Drama/index_1_26______1.html' target='_blank'>剧情</a> </p>
 <p>演员：<span><a rel="nofollow" href="/vod-search-wd-%E8%A3%B4%E6%B7%B3%E5%8D%8E-p-1.html" target="_blank">裴淳华</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E4%B8%B9%E5%B0%BC%E5%B0%94%C2%B7%E5%B8%83%E9%B2%81%E5%B0%94-p-1.html" target="_blank">丹尼尔·布鲁尔</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E5%9F%83%E8%BF%AA%C2%B7%E9%A9%AC%E6%A3%AE-p-1.html" target="_blank">埃迪·马森</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E4%BE%AC%E7%B4%A2%C2%B7%E9%98%BF%E8%AF%BA%E6%96%AF-p-1.html" target="_blank">侬索·阿诺斯</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E5%BE%B7%E5%B0%BC%C2%B7%E6%A2%85%E8%AF%BA%E8%B0%A2-p-1.html" target="_blank">德尼·梅诺谢</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E6%9C%AC%C2%B7%E6%96%BD%E8%80%90%E6%B3%BD-p-1.html" target="_blank">本·施耐泽</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E5%BD%BC%E5%BE%97%C2%B7%E8%8B%8F%E5%88%A9%E6%96%87-p-1.html" target="_blank">彼得·苏利文</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E5%AE%89%E5%90%89%E5%B0%94%C2%B7%E4%BC%AF%E7%BA%B3%E5%B0%BC-p-1.html" target="_blank">安吉尔·伯纳尼</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E5%8D%A1%E7%B1%B3%E5%B0%94%C2%B7%E9%9B%B7%E7%B1%B3%E6%B3%BD%E6%96%AF%E5%9F%BA-p-1.html" target="_blank">卡米尔·雷米泽斯基</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E9%A9%AC%E5%85%8B%C2%B7%E4%BC%8A%E7%93%A6%E6%B6%85-p-1.html" target="_blank">马克·伊瓦涅</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E5%B8%83%E9%9A%86%E8%92%82%E6%96%AF%C2%B7%E4%BD%90%E6%9D%9C%E6%B4%9B%E5%A4%AB%E6%96%AF%E5%9F%BA-p-1.html" target="_blank">布隆蒂斯·佐杜洛夫斯基</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E5%88%A9%E5%A5%A5%E5%B0%94%C2%B7%E9%98%BF%E4%BB%80%E8%82%AF%E7%BA%B3%E9%BD%90-p-1.html" target="_blank">利奥尔·阿什肯纳齐</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E5%A8%9C%E5%A1%94%E8%8E%89%C2%B7%E6%96%AF%E9%80%9A-p-1.html" target="_blank">娜塔莉·斯通</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E5%BC%97%E6%9E%97%C2%B7%E8%89%BE%E4%BC%A6-p-1.html" target="_blank">弗林·艾伦</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E5%AE%89%E5%BE%B7%E8%8E%89%C2%B7%E4%BB%A3%E5%85%8B-p-1.html" target="_blank">安德莉·代克</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E6%96%87%E6%A3%AE%E7%89%B9%C2%B7%E9%87%8C%E5%A5%A5%E7%89%B9-p-1.html" target="_blank">文森特·里奥特</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E4%BC%8A%E5%BC%97%E5%A1%94%E8%B5%AB%C2%B7%E5%85%8B%E8%8E%B1%E6%81%A9-p-1.html" target="_blank">伊弗塔赫·克莱恩</a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd--p-1.html" target="_blank"></a></span><span><a rel="nofollow" href="/vod-search-wd-%E5%A5%A5%E9%A9%AC%E5%B0%94%C2%B7%E8%B4%9D%E5%B0%94%E6%9D%9C%E5%B0%BC-p-1.html" target="_blank">奥马尔·贝尔杜尼</a></span></p>
 <p>状态：<label class="title">BD高清</label></p>
 <p>时间：2018-06-16 00:13:53</p>
 </div>
</li></ul>
</div>
<div class="ui-vpages"><strong>共14部&nbsp;1/3</strong><em class="prev">首页</em>&nbsp;<em class="prev" data="p-0">上一页</em>&nbsp;<span class="current">1</span>&nbsp;<a href="/vod-search-wd-teb-p-2.html" data="p-2">2</a>&nbsp;<a href="/vod-search-wd-teb-p-3.html" data="p-3">3</a>&nbsp;<a href="/vod-search-wd-teb-p-2.html" class="next pagegbk" data="p-2">下一页</a>&nbsp;<a href="/vod-search-wd-teb-p-3.html" class="next pagegbk" data="p-3">尾页</a></div>
</div>
<!--底部开始-->
<div class="footer">
<div class="fBox">
<div class="footer_nav"><a href="/new.html" target="_self">最新更新</a>-<a href="/top.html" target="_self">影视排行</a>-<a href="https://www.kankanwu.com/gb-show-p-1.html" target="_self">留言反馈</a>-<script type="text/javascript" src="/le/tongji.js"></script></div>
本网站为非赢利性站点，本网站所有内容均来源于互联网相关站点自动搜索采集信息，相关链接已经注明来源。</div>
</div>
<script type="text/javascript" src="/static/js/zepto.min.js"></script>
<script type="text/javascript" src="/static/js/iscroll.js"></script>
<script type="text/javascript" src="/static/js/common.min.js"></script>
<script type="text/javascript" src="/static/js/index.min.js"></script>
<script type="text/javascript" src="/xuxu/le.js" charset="utf-8"></script>

</body>
</html>"""
    @Test
    fun testParse() {
        var result = KKWParser().getHomeCotent(html)
        print(Gson().toJson(result.toString()))
    }

    @Test
    fun testTypeUrl() {
        var test = KKWParser()
        test.getTypeList().forEach { type ->
            (1..5).forEach {
                println(test.getTypeUrl(type, it))
            }
        }
    }

    @Test
    fun testTypeParse() {
        var result = KKWParser().getTypeContent(typeHtml)
        println(Gson().toJson(result.toString()).toString())
    }

    @Test
    fun testDetailUrl() {
        var result = KKWParser().getDetailUrl("/Arts/zhejiushigechangduichangji")
        println(result)
    }

    @Test
    fun testDetailParse() {
        var result = KKWParser().getDetailContent(detailHtml)
        println(Gson().toJson(result.toString()).toString())
    }

    @Test
    fun testSearchUrl() {
        var test = KKWParser()
        println(test.getSearchUrl(":", 2))
    }

    @Test
    fun testSearchParse() {
        var result = KKWParser().getSearchContent(searchHtm)
        println(Gson().toJson(result.toString()).toString())
    }
}