package com.fabio.aniversario.leituras;

import com.fabio.aniversario.EntityManagerTest;
import com.fabio.aniversario.model.Aniversario;
import org.junit.Test;

public class LeituraTest extends EntityManagerTest {

    @Test
    public void buscarAniversario() {
        Aniversario aniversario = entityManager.find(Aniversario.class, 1);

        System.out.println(aniversario.getPessoa().getNome() + " -> " + aniversario.getDataAniversario());
    }
}
