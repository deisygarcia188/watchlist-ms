package com.indraweb.example.watchlistms.repositories;

import com.indraweb.example.watchlistms.model.Watchlist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IWatchlistRepository  extends CrudRepository<Watchlist, Long> {
    //select * from tb_watchlist where id_watchlist = ?
    //findBy{{id_watchlist}}(tipoAtributo {{id_watchlist}}

    List<Watchlist> findById_watchlist(Long id_watchlist);

    //consultas JPQL
    //SELECT obj FROM Class obj WHERE {{predicados}},
    // los predicados son en base a los atributos de la clase
    @Query("SELECT watchlist FROM watchlist WHERE watchlist.id_watchlist = :id_watchlist")
    List<Watchlist> findByName_watchlist(String name_watchlist);
}

