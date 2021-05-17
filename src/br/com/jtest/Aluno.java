package br.com.jtest;

public class Aluno {
    public int id;
    public String name;

    public Aluno(){}
    public Aluno(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Aluno other = (Aluno) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
