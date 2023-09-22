// import com.example.demo.model.Server;
// import com.example.demo.repository.ServerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/servers")
public class ServerController {

    @Autowired
    private ServerRepository serverRepository;

    @GetMapping
    public List<Server> getServers() {
        return serverRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Server> getServerById(@PathVariable String id) {
        return serverRepository.findById(id);
    }

    @PostMapping
    public Server createServer(@RequestBody Server server) {
        return serverRepository.save(server);
    }

    @DeleteMapping("/{id}")
    public void deleteServer(@PathVariable String id) {
        serverRepository.deleteById(id);
    }

    @GetMapping("/search")
    public List<Server> searchServersByName(@RequestParam String name) {
        return serverRepository.findByNameContaining(name);
    }
}

// import org.springframework.http.ResponseEntity;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;
// import java.util.Optional;

// @RestController
// @RequestMapping("/servers")
// public class ServerController {

//     @Autowired
//     private ServerRepository serverRepository;

//     // GET /servers
//     @GetMapping
//     public List<Server> getAllServers() {
//         return serverRepository.findAll();
//     }

//     // GET /servers/{id}
//     @GetMapping("/{id}")
//     public ResponseEntity<Server> getServerById(@PathVariable String id) {
//         Optional<Server> server = serverRepository.findById(id);
//         if (server.isPresent()) {
//             return ResponseEntity.ok(server.get());
//         } else {
//             return ResponseEntity.notFound().build();
//         }
//     }

//     // PUT /servers
//     @PutMapping
//     public Server createServer(@RequestBody Server server) {
//         return serverRepository.save(server);
//     }

//     // DELETE /servers/{id}
//     @DeleteMapping("/{id}")
//     public void deleteServer(@PathVariable String id) {
//         serverRepository.deleteById(id);
//     }

//     // GET /servers/findByName/{name}
//     @GetMapping("/findByName/{name}")
//     public List<Server> getServersByName(@PathVariable String name) {
//         return serverRepository.findByNameContaining(name);
//     }
// }
