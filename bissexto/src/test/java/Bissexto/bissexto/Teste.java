package Bissexto.bissexto;

import org.junit.Assert;
import org.junit.Test;

public class Teste {
    
	@Test
	public void main(){
		
		AnoBissexto ano = new AnoBissexto();
		
		Assert.assertEquals(true, ano.anoBissexto(2004));
		Assert.assertEquals(true, ano.anoBissexto(376));
		Assert.assertEquals(true, ano.anoBissexto(24));
		Assert.assertEquals(false, ano.anoBissexto(2017));
	}
}
