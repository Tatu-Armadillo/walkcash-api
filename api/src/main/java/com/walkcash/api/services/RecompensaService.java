package com.walkcash.api.services;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.List;

import com.walkcash.api.models.RecompensaModel;
import com.walkcash.api.repositories.RecompensaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecompensaService {

    // @Autowired
    // private PercursoRepository percursoRepository;

    @Autowired
    private RecompensaRepository recompensaRepository;

    public List<RecompensaModel> visualizarRecompensas() {
        List<RecompensaModel> recompensas = recompensaRepository.findAll();
        return recompensas;
    }

    public RecompensaModel getRecompensa(Long idRecompensa) {
        RecompensaModel recompensa = recompensaRepository.getByIdRecompensa(idRecompensa);
        return recompensa;
    }

    public BigDecimal calcularGanho(Long idRecompensa) {
        RecompensaModel recompensas = recompensaRepository.getByIdRecompensa(idRecompensa);
        BigDecimal cotacao = recompensas.getCotacao();
        BigDecimal totalRecompensa = cotacao.multiply(contabilizarDistancia(idRecompensa));
        totalRecompensa = totalRecompensa.add(contabilizarHoras(idRecompensa, LocalTime.now()));
        recompensas.setTotalRecompensa(totalRecompensa);
        recompensaRepository.save(recompensas);
        return totalRecompensa;
    }

    // O time do parametro vai ser a media para executar a atividade
    // o timePercurso vai ser o valor resultante da execução da atividades
    public BigDecimal contabilizarHoras(Long idRecompensa, LocalTime time) {
        LocalTime timePercurso = recompensaRepository.getByIdRecompensa(idRecompensa).getPercurso().getTempo();
        if (time.compareTo(timePercurso) == 0) {
            return new BigDecimal(50);
        } else if (time.compareTo(timePercurso) > 0) {
            return new BigDecimal(10);
        } else {
            return new BigDecimal(100);
        }
    }

    public BigDecimal contabilizarDistancia(Long idRecompensa) {
        BigDecimal distancia = recompensaRepository.getByIdRecompensa(idRecompensa).getPercurso().getDistancia();
        return distancia;
    }

}
