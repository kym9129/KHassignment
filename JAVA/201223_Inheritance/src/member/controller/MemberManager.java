package member.controller;

//import member.model.vo.Gold;
import member.model.vo.Member;
//import member.model.vo.Silver;
//import member.model.vo.VVip;
//import member.model.vo.Vip;

//Control 클래스 이름 : MemberManager
//MemberManager 멤버변수 : Silver 등급을 최대 10명, Gold 등급을 최대 10명 관리할수 있는  객체배열 , 인덱스 추가
//MemberManager 멤버메소드 : silverInsert, goldInsert, printData 
//주의할점 : 적절한 접근제어 지시자 사용 (private,public)

public class MemberManager {
	
	public static final int MAX_LENGTH = 40;
	private Member[] memArr = new Member[MAX_LENGTH];
//	private Gold[] goldArr = new Gold[MAX_LENGTH];
//	private Silver[] silverArr = new Silver[MAX_LENGTH];
	
	//vip, vvip 추가
//	private Vip[] vArr = new Vip[MAX_LENGTH];
//	private VVip[] vvArr = new VVip[MAX_LENGTH];
	
	private int memberIdx = 0;
//	private int silverIdx = 0;
//	private int goldIdx = 0;
//	private int vIdx = 0;
//	private int vvIdx = 0;
	
	public void insertMember(Member m) {
		
		memArr[memberIdx++] = m;
		
	}
	
	
	
	//배열에 값이 어느길이만큼 들어갈지 모르니까 인덱스를 변수로 넣고 ++ 한다.
	//silver객체배열에 객체 Silver를 넣는다.
//	public void silverInsert(Silver s) {
//		silverArr[silverIdx++] = s; 
//		//Silver 객체를 생성할 때마다 배열에 값을 넣어준다.
//		//ex. silverArr[0] = 이름1, Silver, 1000
//		//ex. silverArr[1] = 이름2, Silver, 2000
//	}
//	
//	public void goldInsert(Gold g) {
//		goldArr[goldIdx++] = g;
//	}
//	
//	public void vipInsert(Vip v) {
//		vArr[vIdx++] = v;
//	}
//	
//	public void vvipInsert(VVip vv) {
//		vvArr[vvIdx++] = vv;
//	}
	
	
	public void printData() {
		
		System.out.println("---------------------------<<회원정보>>---------------------------\n" + 
							"이름              등급              포인트             이자포인트          \n" + 
							"-----------------------------------------------------------------");
		if(memberIdx != 0) {
			for(int i = 0; i < memberIdx; i++) {
				System.out.println(memArr[i].getName()
				+"             "
				+memArr[i].getGrade()
				+"             "
				+memArr[i].getPoint()
				+"             "
				+memArr[i].getEjaPoint());
			}
		}
		
		//배열에 값이 있는 경우. arr.length를 하면 10개라서 NullPointException 오류남.
		//silverIdx가 곧 goldArr의 실제 길이를 나타냄. (값을 대입한 만큼 ++되기 때문)
//		if(silverIdx != 0) { 
//			for(int i = 0; i < silverIdx; i++) {
//				System.out.println(silverArr[i].getName()
//						+"             "
//						+silverArr[i].getGrade()
//						+"             "
//						+silverArr[i].getPoint()
//						+"             "
//						+silverArr[i].getEjaPoint());
//				}
//			
//		}
//		if(goldIdx != 0) { //배열에 값이 있는 경우
//			for(int i = 0; i < goldIdx; i++) {
//				System.out.println(goldArr[i].getName()
//						+"             "
//						+goldArr[i].getGrade()
//						+"             "
//						+goldArr[i].getPoint()
//						+"             "
//						+goldArr[i].getEjaPoint());
//				}
//		
//		}
		
//		if(vIdx != 0) { //배열에 값이 있는 경우
//			for(int i = 0; i < vIdx; i++) {
//				System.out.println(vArr[i].getName()
//						+"             "
//						+vArr[i].getGrade()
//						+"             "
//						+vArr[i].getPoint()
//						+"             "
//						+vArr[i].getEjaPoint());
//				}
//		
//		}
//		
//		if(vvIdx != 0) { //배열에 값이 있는 경우
//			for(int i = 0; i < vvIdx; i++) {
//				System.out.println(vArr[i].getName()
//						+"             "
//						+vvArr[i].getGrade()
//						+"             "
//						+vvArr[i].getPoint()
//						+"             "
//						+vvArr[i].getEjaPoint());
//				}
		
		}
		
	}


