package cn.jbit.quickhit;
/**
 * 级别参数类，配置各个级别参数。
 * @author 北大青鸟
 */
public class LevelParam {
	public final static Level levels[]=new Level[6];//对应六个级别
	static {
		// 级别号
		// 各级别一次输出字符串的长度
		// 各级别输出字符串的次数
		// 各级别闯关的时间限制
		// 各级别成功输入一次字符串后增加的分值
		levels[0]=new Level(1, 2, 10, 30,1);
		levels[1]=new Level(2, 3, 9, 26,2);
		levels[2]=new Level(3, 4, 8, 22,5);
		levels[3]=new Level(4, 5, 7, 18,8);
		levels[4]=new Level(5, 6, 6, 15,10);
		levels[5]=new Level(6, 7, 5, 12,15);
	}
}
