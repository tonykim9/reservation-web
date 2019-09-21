package or.connect.reservationweb.dto.reservation.request;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import or.connect.reservationweb.dto.reservation.ReservationInfoDto;

public class ReservationInfoPriceDto {
	private int reservationInfoId;
	private int productId;
	private int displayInfoId;
	private String reservationName;
	private String reservationTelephone;
	private String reservationEmail;
	private String reservationYearMonthDay;
	private Boolean cancelYn;
	private LocalDateTime createDate;
	private LocalDateTime modifyDate;
	private List<ReservationPriceDto> prices;
	
	public ReservationInfoPriceDto() {
		prices = new ArrayList<>();
		cancelYn = false;
		createDate = LocalDateTime.now();
		modifyDate = createDate;
		prices = null;
	}

	public void setReservationInfo(ReservationInfoDto reservationInfo) {
		reservationInfoId = reservationInfo.getReservationInfoId();
		productId = reservationInfo.getProductId();
		displayInfoId = reservationInfo.getDisplayInfoId();
		reservationName = reservationInfo.getReservationName();
		reservationTelephone = reservationInfo.getReservationTelephone();
		cancelYn = reservationInfo.getCancelYn();
		reservationYearMonthDay = reservationInfo.getReservationDate();
		createDate = reservationInfo.getCreateDate();
		modifyDate = reservationInfo.getModifyDate();
		reservationEmail = reservationInfo.getReservationEmail();
	}
	
	public void setReservationInfoIdAll(int reservationInfoId) {
		this.reservationInfoId = reservationInfoId;
		for (ReservationPriceDto price : this.prices) {
			price.setReservationInfoId(reservationInfoId);;
		}
		
	}
	
	public int getReservationInfoId() {
		return reservationInfoId;
	}

	public void setReservationInfoId(int reservationInfoId) {
		this.reservationInfoId = reservationInfoId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getDisplayInfoId() {
		return displayInfoId;
	}

	public void setDisplayInfoId(int displayInfoId) {
		this.displayInfoId = displayInfoId;
	}

	public String getReservationName() {
		return reservationName;
	}

	public void setReservationName(String reservationName) {
		this.reservationName = reservationName;
	}

	public String getReservationTelephone() {
		return reservationTelephone;
	}

	public void setReservationTelephone(String reservationTelephone) {
		this.reservationTelephone = reservationTelephone;
	}

	public String getReservationEmail() {
		return reservationEmail;
	}

	public void setReservationEmail(String reservationEmail) {
		this.reservationEmail = reservationEmail;
	}

	public String getReservationYearMonthDay() {
		return reservationYearMonthDay;
	}

	public void setReservationYearMonthDay(String reservationYearMonthDay) {
		this.reservationYearMonthDay = reservationYearMonthDay;
	}

	public Boolean getCancelYn() {
		return cancelYn;
	}

	public void setCancelYn(Boolean cancelYn) {
		this.cancelYn = cancelYn;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime LocalDateTime) {
		this.createDate = createDate;
	}

	public LocalDateTime getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(LocalDateTime modifyDate) {
		this.modifyDate = modifyDate;
	}

	public List<ReservationPriceDto> getPrices() {
		return prices;
	}

	public void setPrices(List<ReservationPriceDto> prices) {
		this.prices = prices;
	}
	
	
}