package org.bhavesh.kbsales.bean.pojo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountPOJO {
	@NotBlank
	@NotNull
	@Length(min = 2,max=255)
	private String name;
	@NotNull
	@NotBlank
	@Length(min = 2,max=255)
	private String city;
	@PositiveOrZero
	private Integer gstno;
	@PositiveOrZero
	private Integer fssai;
}
