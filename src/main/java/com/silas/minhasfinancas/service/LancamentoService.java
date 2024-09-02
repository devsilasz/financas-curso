package com.silas.minhasfinancas.service;

import com.silas.minhasfinancas.model.entity.Lancamento;
import com.silas.minhasfinancas.model.enums.StatusLancamento;
import com.silas.minhasfinancas.service.exception.RegraNegocioException;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface LancamentoService {

    Lancamento salvar(Lancamento lancamento);

    Lancamento atualizar(Lancamento lancamento);

    void deletar(Lancamento lancamento);

    List<Lancamento> buscar( Lancamento lancamentoFiltro );

    void atualizarStatus(Lancamento lancamento, StatusLancamento status);

    void validar(Lancamento lancamento);

    Optional<Lancamento> oberPorId(Long Id);

    BigDecimal obterSaldoPorUsuario(Long id);
}
