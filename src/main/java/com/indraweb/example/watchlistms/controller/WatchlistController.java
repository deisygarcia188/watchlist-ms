package com.indraweb.example.watchlistms.controller;


import com.indraweb.example.watchlistms.model.Watchlist;
import com.indraweb.example.watchlistms.services.WatchlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/watchlist")
public class WatchlistController {

    @Autowired
    private WatchlistService watchlistService;

    /**
     * URL /watchlist
     * @param watchlist
     */
    @PostMapping
    public void create(@RequestBody Watchlist watchlist) {
        watchlistService.createWatchlist(watchlist);
    }

    /**
     *   GET /watchlist?id={{id}},
     * @param id_watchlist
     * @return
     */
    @GetMapping
    public List<Watchlist> getWatchlistById(@RequestParam(name = "id_watchlist") Long id_watchlist) {
        return watchlistService.getById_watchlist(id_watchlist);
    }
}
