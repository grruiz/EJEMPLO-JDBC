
package com.rafaelgalvezruiz.escuela.dao;

import com.rafaelgalvezruiz.escuela.modelo.Alumno;
import java.util.List;

public interface DAO<T, K> {
        void insertar(T a);
    void modificar (T a);
    void eliminar (T a);
    List<T> obtenerAlumnos();
    T obtener(Long id);
}
