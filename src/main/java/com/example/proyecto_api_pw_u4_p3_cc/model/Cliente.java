package com.example.proyecto_api_pw_u4_p3_cc.model;



import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;





@Entity
@Table(name = "cliente")
public class Cliente {

    
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cliente") 
	@SequenceGenerator(name = "seq_cliente", sequenceName = "seq_cliente", allocationSize = 1)
    @Column(name = "clie_id")
    private Integer id;
    @Column(name = "clie_nombre")
    private String nombre;
    @Column(name = "clie_apellido")
    private String apellido;
    @Column(name = "clie_cedula")
    private String cedula;
    @Column(name = "clie_fecha_nacimiento")
    private LocalDateTime fechaNacimiento;
    @Column(name = "clie_genero")
    private Character genero;
    @Column(name = "clie_email")
    private String email;

    // SET-GET
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Character getGenero() {
        return genero;
    }
    public void setGenero(Character genero) {
        this.genero = genero;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
