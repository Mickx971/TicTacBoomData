package com.projetJee.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name = "Table_Action")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="Type_Action")
@DiscriminatorValue("Classe_Mere")


public abstract class Action {
	public Action() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name="Id_Action")
	private Long Id;
	
	@Column(name="name_Action")
	private static  String nom;
	
	@Column(name="cost_Action")
	private float cost;
	
	@Column(name="selfDamage_Action")
	private int selfDamage;
	
	@Column(name="Damage_Action")
	private int Damage;
	
	public Action(Long id,float cost, int selfDamage, int damage, int armor, int damageWhenProtected) {
		super();
		Id = id;
		this.cost = cost;
		this.selfDamage = selfDamage;
		Damage = damage;
		this.armor = armor;
		this.damageWhenProtected = damageWhenProtected;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getSelfDamage() {
		return selfDamage;
	}

	public void setSelfDamage(int selfDamage) {
		this.selfDamage = selfDamage;
	}

	public int getDamage() {
		return Damage;
	}

	public void setDamage(int damage) {
		Damage = damage;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getDamageWhenProtected() {
		return damageWhenProtected;
	}

	public void setDamageWhenProtected(int damageWhenProtected) {
		this.damageWhenProtected = damageWhenProtected;
	}

	@Column(name="armor")
	private int armor;
	
	@Column(name="damageWhenProtected")
	private int damageWhenProtected;
	
}
