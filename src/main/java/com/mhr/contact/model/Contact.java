package com.mhr.contact.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "created_date_at" , updatable = false)
	private String createDateAt;
	
	@Column(name = "created_time_at" , updatable = false)
	private String createTimeAt;
	
	@Column(name = "updated_date_at")
	private String updateDateAt;
	
	@Column(name = "updated_time_at")
	private String updateTimeAt;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(Long id, String title, String subject, String createDateAt, String createTimeAt, String updateDateAt,
			String updateTimeAt) {
		super();
		this.id = id;
		this.title = title;
		this.subject = subject;
		this.createDateAt = createDateAt;
		this.createTimeAt = createTimeAt;
		this.updateDateAt = updateDateAt;
		this.updateTimeAt = updateTimeAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCreateDateAt() {
		return createDateAt;
	}

	public void setCreateDateAt(String createDateAt) {
		this.createDateAt = createDateAt;
	}

	public String getCreateTimeAt() {
		return createTimeAt;
	}

	public void setCreateTimeAt(String createTimeAt) {
		this.createTimeAt = createTimeAt;
	}

	public String getUpdateDateAt() {
		return updateDateAt;
	}

	public void setUpdateDateAt(String updateDateAt) {
		this.updateDateAt = updateDateAt;
	}

	public String getUpdateTimeAt() {
		return updateTimeAt;
	}

	public void setUpdateTimeAt(String updateTimeAt) {
		this.updateTimeAt = updateTimeAt;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", title=" + title + ", subject=" + subject + ", createDateAt=" + createDateAt
				+ ", createTimeAt=" + createTimeAt + ", updateDateAt=" + updateDateAt + ", updateTimeAt=" + updateTimeAt
				+ "]";
	}
	
}
