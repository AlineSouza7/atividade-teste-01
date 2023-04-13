package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LivroTest {

    private Livro livro;

    @BeforeEach
    public void setup() {
        livro = new Livro("O Cemitério", "Stephen King", "Terror e Suspense", 1983);
    }

    @Test
    public void test_get_titulo() {
        assertEquals("O Cemitério",livro.getTitulo());
    }

    @Test
    public void test_set_titulo() {
        livro.setTitulo("It: a coisa");
        assertEquals("It: a coisa",livro.getTitulo());
    }

    @Test
    public void test_get_autor() {
        assertEquals("Stephen King",livro.getAutor());
    }

    @Test
    public void test_set_autor() {
        livro.setAutor("J.K Rolling");
        assertEquals("J.K Rolling",livro.getAutor());
    }

    @Test
    public void test_get_genero() {
        assertEquals("Terror e Suspense",livro.getGenero());
    }

    @Test
    public void test_set_genero() {
        livro.setGenero("Romance");
        assertEquals("Romance",livro.getGenero());
    }

    @Test
    public void test_get_ano_publicacao() {
        assertEquals(1983,livro.getAnoPublicacao());
    }

    @Test
    public void test_set_ano_publicacao() {
        livro.setAnoPublicacao(1990);
        assertEquals(1990,livro.getAnoPublicacao());
    }
}
