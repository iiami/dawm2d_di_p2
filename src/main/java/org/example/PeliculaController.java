package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PeliculaController {

    private static List<Pelicula> listaPeliculas = new ArrayList<>();
    private static long contadorId = 1;

    static {
        listaPeliculas.add(new Pelicula(contadorId++, "Stranger Things", "Netflix", "Visto", "Terror", "8.7"));
        listaPeliculas.add(new Pelicula(contadorId++, "The Last of Us", "HBO", "Viendo", "Drama", "8.8"));
        listaPeliculas.add(new Pelicula(contadorId++, "Interstellar", "Prime", "Pendiente", "Ficción", "8.7"));
    }

    @GetMapping({"/", "/index"})
    public String verLista(Model model) {
        model.addAttribute("peliculas", listaPeliculas);
        return "index";
    }

    @GetMapping("/anadirTitulo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("pelicula", new Pelicula());
        return "anadirTitulo";
    }

    @PostMapping("/guardar")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula) {
        pelicula.setId(contadorId++);
        listaPeliculas.add(pelicula);
        return "redirect:/index";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarPelicula(@PathVariable Long id) {
        listaPeliculas.removeIf(p -> p.getId().equals(id));
        return "redirect:/index";
    }
}
