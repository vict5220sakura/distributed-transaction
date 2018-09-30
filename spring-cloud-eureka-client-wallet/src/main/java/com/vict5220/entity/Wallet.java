/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午4:11:05
 * @version   V 1.0
 */
package com.vict5220.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午4:11:05
 * @version  V 1.0
 */
@Entity
@Table(name = "wallet")
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Wallet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "wallet_name")
	private String walletName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "state")
	private Integer state;
}
