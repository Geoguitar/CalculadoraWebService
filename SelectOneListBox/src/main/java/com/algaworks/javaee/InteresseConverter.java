package com.algaworks.javaee;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("interesse")
public class InteresseConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		if(arg2 != null){
			for(Interesse interesse : PerfilUsuarioBean.INTERESSES){
				if(arg2.equals(interesse.getNomeIcone())){
					return interesse;
				}
				
			}
			
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if(arg2 != null){
			Interesse interesse =(Interesse) arg2;
			return interesse.getNomeIcone();
		}
		
		return null;
	}

}
