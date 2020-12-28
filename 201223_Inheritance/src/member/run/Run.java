package member.run;

import member.controller.MemberManager;
import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.VIP;
import member.model.vo.VVIP;

public class Run {

	public static void main(String[] args) {
		MemberManager mm = new MemberManager();
        mm.silverInsert(new Silver("홍길동", "Silver",1000));
        mm.silverInsert(new Silver("김말똥", "Silver",2000));
        mm.silverInsert(new Silver("고길동", "Silver",3000));
        mm.goldInsert(new Gold("김회장", "Gold",1000));
        mm.goldInsert(new Gold("이회장", "Gold",2000));
        mm.goldInsert(new Gold("오회장", "Gold",3000));
        mm.vipInsert(new VIP("최순실", "Vip", 10000));
        mm.vvipInsert(new VVIP("박근혜", "VVip", 10000));
        mm.printData();


	}

}
