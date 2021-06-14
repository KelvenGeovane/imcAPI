package GeovaneProvaPratica.ImcGeovane.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import GeovaneProvaPratica.ImcGeovane.Model.Imc;

@RestController
@RequestMapping("/Imc")
public class ImcController {
	@GetMapping
	public String calcular(@RequestBody Imc imc) {
		imc.getAltura();
		imc.getPeso();
		return imc.exibirImc();
	}
	

}
