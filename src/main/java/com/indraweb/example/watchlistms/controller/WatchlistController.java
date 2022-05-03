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
     *   GET /watchlist?nombre={{nombre}},
     * @param nombre
     * @return
     */
    @GetMapping
    public List<Watchlist> getWatchlistByNombre(@RequestParam(name = "nombre") String nombre) {
        return watchlistService.getByNombre(nombre);
    }

    /**
     * GET /,
     * @param
     * @return
     */
    @GetMapping("/")
    public List<Watchlist> getAllWatchlist() {
       return watchlistService.getWatchlist();
    }
}
