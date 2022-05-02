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

        List<Watchlist> watchlistByName = watchlistRepository.findByName_watchlist(watchlist.getName_watchlist());
        if (!watchlistByName.isEmpty()) {
            throw new RuntimeException("watchlist with that name already exists");
        }

        watchlistRepository.save(watchlist);
    }

    /**
     * get watchlist by id
     * @param id_watchlist
     * @return list of watchlist
     */
    public List<Watchlist> getById_watchlist(Long id_watchlist) {
        return watchlistRepository.findById_watchlist(id_watchlist);
    }

}
