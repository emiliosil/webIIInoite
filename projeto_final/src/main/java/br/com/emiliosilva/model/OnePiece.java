package br.com.emiliosilva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="onePieces")
public class OnePiece {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100,nullable = false,unique = true)
	private String name;
	@Column(length = 100,nullable = false)
	private String reward;
	@Column(length = 100,nullable = false)
	private String pirateGang;
	@Column(length = 100,nullable = false)
	private String position;
	
	public OnePiece(int id, String name, String reward, String pirateGang, String position) {
		this.id = id;
		this.name = name;
		this.reward = reward;
		this.pirateGang = pirateGang;
		this.position = position;
	}
	
	public OnePiece() {
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getReward() {
		return reward;
	}

	public String getPirateGang() {
		return pirateGang;
	}
	
	public String getPosition() {
		return position;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public void setPirateGang(String pirateGang) {
		this.pirateGang = pirateGang;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
}