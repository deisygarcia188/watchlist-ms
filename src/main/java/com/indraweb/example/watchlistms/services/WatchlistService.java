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
     * no dWatchlist with repeated name.
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
     * get watchlist by nombre
     * @param nombre
     * @return list of watchlist
     */
    public List<Watchlist> getByNombre(String nombre) {
        return watchlistRepository.findByNombre(nombre);
    }

    /**
     * get watchlist
     * @param
     * @return list of watchlist
     */
    public List<Watchlist> getWatchlist() {
        return watchlistRepository.findAll();
    }

}
