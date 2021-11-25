package chapter15;

	/* 정규 표현식 (Regular Expression)
	/ 패턴을 찾아서 -> repalce, add
	/ 검색할 글자(1글자) + OPTION (숫자) + 검색할 글자 + OPTION (숫자) 
	/ DTD(Date Transfer Object) = VO(Value Object)
	/ Model, Item, Bean(일반적으로 스프링에서 객체를 가리킴)
	/iBatis(myBatis) vs Hi
	*/
public class MemberVO {
	
	private String memId;
	private String memName;
	private String memRegno;
	private String memBir;
	private String memZip;
	private String memAdd;
	private String memHometel;
	private String memComtel;
	private String memHp;
	private String memMail;
	private String memJob;
	private String memLike;
	private String memMemorial;
	private String memMemorialDay;
	private String memMileage;
	private String memDelete;

	public MemberVO(String memId, String memName, String memMail) {
		super();
		this.memId = memId;
		this.memName = memName;
		this.memMail = memMail;
	}

	public MemberVO(String memId, String memName, String memRegno, String memBir, String memZip, String memAdd,
			String memHometel, String memComtel, String memHp, String memMail, String memJob, String memLike,
			String memMemorial, String memMemorialDay, String memMileage, String memDelete) {
		super();
		this.memId = memId;
		this.memName = memName;
		this.memRegno = memRegno;
		this.memBir = memBir;
		this.memZip = memZip;
		this.memAdd = memAdd;
		this.memHometel = memHometel;
		this.memComtel = memComtel;
		this.memHp = memHp;
		this.memMail = memMail;
		this.memJob = memJob;
		this.memLike = memLike;
		this.memMemorial = memMemorial;
		this.memMemorialDay = memMemorialDay;
		this.memMileage = memMileage;
		this.memDelete = memDelete;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemRegno() {
		return memRegno;
	}

	public void setMemRegno(String memRegno) {
		this.memRegno = memRegno;
	}

	public String getMemBir() {
		return memBir;
	}

	public void setMemBir(String memBir) {
		this.memBir = memBir;
	}

	public String getMemZip() {
		return memZip;
	}

	public void setMemZip(String memZip) {
		this.memZip = memZip;
	}

	public String getMemAdd() {
		return memAdd;
	}

	public void setMemAdd(String memAdd) {
		this.memAdd = memAdd;
	}

	public String getMemHometel() {
		return memHometel;
	}

	public void setMemHometel(String memHometel) {
		this.memHometel = memHometel;
	}

	public String getMemComtel() {
		return memComtel;
	}

	public void setMemComtel(String memComtel) {
		this.memComtel = memComtel;
	}

	public String getMemHp() {
		return memHp;
	}

	public void setMemHp(String memHp) {
		this.memHp = memHp;
	}

	public String getMemMail() {
		return memMail;
	}

	public void setMemMail(String memMail) {
		this.memMail = memMail;
	}

	public String getMemJob() {
		return memJob;
	}

	public void setMemJob(String memJob) {
		this.memJob = memJob;
	}

	public String getMemLike() {
		return memLike;
	}

	public void setMemLike(String memLike) {
		this.memLike = memLike;
	}

	public String getMemMemorial() {
		return memMemorial;
	}

	public void setMemMemorial(String memMemorial) {
		this.memMemorial = memMemorial;
	}

	public String getMemMemorialDay() {
		return memMemorialDay;
	}

	public void setMemMemorialDay(String memMemorialDay) {
		this.memMemorialDay = memMemorialDay;
	}

	public String getMemMileage() {
		return memMileage;
	}

	public void setMemMileage(String memMileage) {
		this.memMileage = memMileage;
	}

	public String getMemDelete() {
		return memDelete;
	}

	public void setMemDelete(String memDelete) {
		this.memDelete = memDelete;
	}

	@Override
	public String toString() {
		return "MemberVO [memId=" + memId + ", memName=" + memName + ", memRegno=" + memRegno + ", memBir=" + memBir
				+ ", memZip=" + memZip + ", memAdd=" + memAdd + ", memHometel=" + memHometel + ", memComtel="
				+ memComtel + ", memHp=" + memHp + ", memMail=" + memMail + ", memJob=" + memJob + ", memLike="
				+ memLike + ", memMemorial=" + memMemorial + ", memMemorialDay=" + memMemorialDay + ", memMileage="
				+ memMileage + ", memDelete=" + memDelete + "]";
	}
	
	
	
}
