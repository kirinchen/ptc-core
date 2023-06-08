package com.domi.ptc_core.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

import java.util.HashSet;

@SuppressWarnings("serial")
@Data
@Entity
@Table
public class Account implements org.springframework.security.core.userdetails.UserDetails {

	@Id
	@Column(nullable = false)
	private String uid;
	@Column(nullable = false, unique = true)
	private String username;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false)
	@JsonIgnore
	private String password;
	@Column(nullable = false)
	private boolean accountNonExpired;
	@Column(nullable = false)
	private boolean accountNonLocked;
	@Column(nullable = false)
	private boolean credentialsNonExpired;
	@Column(nullable = false)
	private boolean enabled;
	@Column(nullable = true)
	private String refCode;

	@Column(nullable = true)
	@Convert(converter = AuthorityListConvert.class)
	private AuthorityList authorities = new AuthorityList();

	@Enumerated(EnumType.STRING)
	@Column(nullable = false, columnDefinition = JpaConstant.COLUMN_DEFIN_MEDIUM_TEXT)
	private AuthProvider provider = AuthProvider.local;
	@Column(nullable = true, columnDefinition = JpaConstant.COLUMN_DEFIN_MEDIUM_TEXT)
	private String providerId;

	public Account() {
		uid = RandomStringUtils.randomAlphanumeric(JpaConstant.COLUMN_DEFIN_UID_SIZE);
	}

	public String getEmail() {
		return email;
	}
	
	public static class AuthorityListConvert extends JsonPojoConverter<AuthorityList> {
		@Override
		public Class<AuthorityList> getTClass() {
			return AuthorityList.class;
		}
	}

	public static class AuthorityList extends HashSet<Authority> {

		public AuthorityList() {
		}
	}

	public static enum Authority implements GrantedAuthority {
		Admin;

		@Override
		public String getAuthority() {
			return this.toString();
		}
	}

	public static enum AuthProvider {
		local, facebook, google, github
	}

}