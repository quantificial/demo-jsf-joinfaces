package demo.jsf.joinfaces.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Car Entity Sample
 * 
 * @author Johnson Fu
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3535896370610207068L;
	
	private Long id;
	private String brand;
	private int year;
	private String color;
	
	
}
