package com.indraweb.example.watchlistms.services;

import com.indraweb.example.watchlistms.model.Watchlist;
import com.indraweb.example.watchlistms.repositories.IWatchlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WatchlistService {
    @Autowired
    private IWatchlistRepository watchlistRepository;

    /**
     * Create Watchlist
     * no Watchlist with repeated name.
     * @param watchlist
     */
    public void createWatchlist(Watchlist watchlist) {

        List<Watchlist> watchlistByNombre = watchlistRepository.findByNombre(watchlist.getNombre());
        if (!watchlistByNombre.isEmpty()) {
            throw new RuntimeException("watchlist with that name already exists");
        }

        watchlistRepository.save(watchlist);
    }

    /**
     * capturar por nombre watchlist
     * @param nombre
     * @return lista de watchlist
     */
    public List<Watchlist> getByNombre(String nombre) {
        return watchlistRepository.findByNombre(nombre);
    }

    /**
     * captura lista de watchlist
     * @param
     * @return lista de watchlist
     */
    public List<Watchlist> getWatchlist() {
        return watchlistRepository.findAll();
    }

    /**
     * actualizar watchlist
     * @param putWatchlist
     */
    public void putWatchlist(Long idWatchlist, Watchlist putWatchlist) {

        Watchlist watchlistById = watchlistRepository.findByIdWatchlist(idWatchlist);
        watchlistById.setDescripcion(putWatchlist.getDescripcion());
        watchlistById.setId_usuario(putWatchlist.getId_usuario());
        watchlistById.setPrivacidad(putWatchlist.getPrivacidad());
        watchlistById.setNombre(putWatchlist.getNombre());
        watchlistRepository.save(watchlistById);
    }

    /**
     * eliminar Watchlist
     * @param idWatchlist
     */
    public boolean deleteWatchlist(Long idWatchlist) {

        try{
            watchlistRepository.deleteById(idWatchlist);
            return true;
        }catch(Exception e){
            return false;

        }
    }


}
