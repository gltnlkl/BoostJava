package com.baa.boost.ExampleH.FinalExample;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter and setter
@NoArgsConstructor // parametresız
@AllArgsConstructor
@Builder

// POJO
public final class Final { // class ı fınal yapınca baska class a extend edılmez
	// değişken final :sabitler yanı buna yenı degerler atamayız
	// metod fınal @override
	// class final /:extends yapamayız
	
	private String adi;
	
	public static void main(String[] args) {
		final int 
	}
	
}
