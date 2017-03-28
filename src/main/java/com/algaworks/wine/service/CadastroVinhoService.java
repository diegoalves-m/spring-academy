package com.algaworks.wine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.algaworks.wine.model.Vinho;
import com.algaworks.wine.repository.Vinhos;

@Service
public class CadastroVinhoService {

    @Autowired
    private Vinhos vinhos;

    public void salvar(Vinho vinho) {
        vinhos.save(vinho);
    }
    
    public String salvarFoto(Long codigo, MultipartFile foto) {
    	Vinho vinho = vinhos.findOne(codigo);
    	String nomeFoto = foto.getOriginalFilename();
    	vinho.setFoto(nomeFoto);
    	vinhos.save(vinho);
    	
    	// return url 
    	return nomeFoto;
    }

}
