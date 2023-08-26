package pkgAlumnos;

import java.util.ArrayList;
import java.util.List;

public class CursosAsignados extends ArrayList<Curso> {

    public CursosAsignados() {
        super();
    }

    @Override
    public boolean add(Curso curso) {
        if (!this.contains(curso)) {
            return super.add(curso);
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        return this.stream().anyMatch(curso -> (curso == null ? o == null : curso.equals(o)));
    }

    @Override
    public java.util.Iterator<Curso> iterator() {
        return super.iterator();
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public Curso get(int index) {
        return super.get(index);
    }
}
