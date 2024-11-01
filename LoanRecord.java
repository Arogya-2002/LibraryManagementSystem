package task01112024;

public class LoanRecord {
	private int lid;
	private String loanDate;
	private String returnDate;
	public int bid;
	public int sid;
	public LoanRecord(int lid, String loanDate, String returnDate, int bid, int sid) {
		super();
		this.lid = lid;
		this.loanDate = loanDate;
		this.returnDate = returnDate;
		this.bid = bid;
		this.sid = sid;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	@Override
	public String toString() {
		return "LoanRecord [lid=" + lid + ", loanDate=" + loanDate + ", returnDate=" + returnDate + ", bid=" + bid
				+ ", sid=" + sid + "]";
	}
	

}
