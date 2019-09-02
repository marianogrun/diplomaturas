package edu.usal.dto;

public class Diplomatura {
	
	
	private Integer idDipCareer;
	private Integer carrera;
	private String descripcion;
	private String descripCorta;
	private Integer tipoCarrera;  // -- 7 Universitaria / 8 Universitaria Superior (tabla => studentc.cartype)
	private Integer facultad;
	private String descripLarga;
	private String descripDegree;
	private String reponsable;
	private Integer conConvenio; //0 NO / 1 SI
	private Integer modoCursada; // studentc.cartype.code -> 0 - 1 - 2 
	
	public Integer getIdDipCareer() {
		return idDipCareer;
	}
	public void setIdDipCareer(Integer idDipCareer) {
		this.idDipCareer = idDipCareer;
	}
	public Integer getCarrera() {
		return carrera;
	}
	public void setCarrera(Integer carrera) {
		this.carrera = carrera;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDescripCorta() {
		return descripCorta;
	}
	public void setDescripCorta(String descripCorta) {
		this.descripCorta = descripCorta;
	}
	public Integer getTipoCarrera() {
		return tipoCarrera;
	}
	public void setTipoCarrera(Integer tipoCarrera) {
		this.tipoCarrera = tipoCarrera;
	}
	public Integer getFacultad() {
		return facultad;
	}
	public void setFacultad(Integer facultad) {
		this.facultad = facultad;
	}
	public String getDescripLarga() {
		return descripLarga;
	}
	public void setDescripLarga(String descripLarga) {
		this.descripLarga = descripLarga;
	}
	public String getDescripDegree() {
		return descripDegree;
	}
	public void setDescripDegree(String descripDegree) {
		this.descripDegree = descripDegree;
	}
	public String getReponsable() {
		return reponsable;
	}
	public void setReponsable(String reponsable) {
		this.reponsable = reponsable;
	}
	public Integer getConConvenio() {
		return conConvenio;
	}
	public void setConConvenio(Integer conConvenio) {
		this.conConvenio = conConvenio;
	}
	public Integer getModoCursada() {
		return modoCursada;
	}
	public void setModoCursada(Integer modoCursada) {
		this.modoCursada = modoCursada;
	}
	
	
	
	
}
