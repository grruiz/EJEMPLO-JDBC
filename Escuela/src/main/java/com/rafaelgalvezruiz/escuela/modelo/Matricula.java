
package com.rafaelgalvezruiz.escuela.modelo;

import java.util.Objects;

public class Matricula {
    private Long alumnos;
    private Long asignaturas;
    private int year;
    private Integer nota = null;

    public Matricula(Long alumnos, Long asignaturas, Integer year, int nota) {
        this.alumnos = alumnos;
        this.asignaturas = asignaturas;
        this.year = year;
        this.nota = nota;
    }

    public Long getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Long alumnos) {
        this.alumnos = alumnos;
    }

    public Long getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Long asignaturas) {
        this.asignaturas = asignaturas;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Matricula other = (Matricula) obj;
        if (this.year != other.year) {
            return false;
        }
        if (!Objects.equals(this.alumnos, other.alumnos)) {
            return false;
        }
        if (!Objects.equals(this.asignaturas, other.asignaturas)) {
            return false;
        }
        if (!Objects.equals(this.nota, other.nota)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Matricula{" + "alumnos=" + alumnos + ", asignaturas=" + asignaturas + ", year=" + year + ", nota=" + nota + '}';
    }
    
    
}
