package com.fabio.aniversario.insercoes;

import com.fabio.aniversario.EntityManagerTest;
import com.fabio.aniversario.model.Aniversario;
import com.fabio.aniversario.model.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class InsercaoTest extends EntityManagerTest {

    @Test
    public void inserirAniversario() {
        Aniversario aniversario = new Aniversario();
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Marcos");
        pessoa.setDescricao("Uma pessoa amável.");

        aniversario.setPessoa(pessoa);
        aniversario.setDataAniversario(LocalDate.of(2000,10,15));

        entityManager.getTransaction().begin();
        entityManager.persist(aniversario);
        entityManager.getTransaction().commit();

        entityManager.clear();

        Aniversario aniversarioVerificacao = entityManager.find(Aniversario.class, aniversario.getId());
        Assert.assertEquals(aniversarioVerificacao.getPessoa().getNome(), "Marcos");
    }
}
