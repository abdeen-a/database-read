package com.model.baseEntity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@Entity
@NoArgsConstructor
public class BaseEntity {
	
	@Id
	private Integer catid;




}