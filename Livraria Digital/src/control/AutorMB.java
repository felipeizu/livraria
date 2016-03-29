package control;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import exception.GenericException;
import model.Autor;
import persistence.AutorDao;
import persistence.AutorDaoImpl;
import persistence.GenericDao;

/**
 * Classe repons�vel pelo controle do Autor
 * 
 * @author hury
 *
 */

@ManagedBean(name = "autorMB")
@ViewScoped
public class AutorMB  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Autor> listaPesquisa = new ArrayList<Autor>();

	private Autor autorAtual;
	private AutorDao autorDao;
 
	
	public AutorMB() {
		//super();
		this.autorAtual = new Autor();
		this.autorDao = new AutorDaoImpl();
	}



	public List<Autor> getListaPesquisa() {
		return listaPesquisa;
	}

	public void setListaPesquisa(List<Autor> listaPesquisa) {
		this.listaPesquisa = listaPesquisa;
	}

	public Autor getAutorAtual() {
		return autorAtual;
	}

	public void setAutorAtual(Autor autorAtual) {
		this.autorAtual = autorAtual;
	}

	public AutorDao getAutorDao() {
		return autorDao;
	}

	public void setAutorDao(AutorDao autorDao) {
		this.autorDao = autorDao;
	}

}