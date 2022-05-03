package com.indraweb.example.watchlistms.controller;


import com.indraweb.example.watchlistms.model.Watchlist;
import com.indraweb.example.watchlistms.services.WatchlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/watchlist")
public class WatchlistController {

    @Autowired
    private WatchlistService watchlistService;

    /**
     * POST
     * crear watchlist
     * URL /watchlist
     * @param watchlist
     */
    @PostMapping
    public void create(@RequestBody Watchlist watchlist) {
        watchlistService.createWatchlist(watchlist);
    }

    /**
     * GET /watchlist?nombre={{nombre}},
     * capturar watchlist por nombre
     * @param nombre
     * @return
     */
    @GetMapping
    public List<Watchlist> getWatchlistByNombre(@RequestParam(name = "nombre") String nombre) {
        return watchlistService.getByNombre(nombre);
    }

    /**
     * PUT /watchlist/{{idWatchlist}},
     * modificar watchlist
     * @param idWatchlist
     * @return
     */
    @PutMapping("/{idWatchlist}")
    public void putWatchlistById(@PathVariable("idWatchlist") Long idWatchlist,@RequestBody Watchlist watchlist) {
        watchlistService.putWatchlist(idWatchlist, watchlist);
    }

    /**
     * DELETE /watchlist/{{idWatchlist}},
     * eliminar watchlist
     * @param idWatchlist
     * @return
     */
    @DeleteMapping("/{idWatchlist}")
    public void deleteWatchlist(@PathVariable("idWatchlist") Long idWatchlist) {
        boolean respuesta = watchlistService.deleteWatchlist(idWatchlist);
        if (respuesta == true) {

        }
        else {
            throw new RuntimeException("watchlist con id no se puede eliminar");
        }
    }
    /**
     * GET /,
     * Buscar todas las watchlist
     * @param
     * @return
     */
    @GetMapping("/")
    public List<Watchlist> getAllWatchlist() {
       return watchlistService.getWatchlist();
    }
}
