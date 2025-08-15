package br.com.helpdesk;

import br.com.helpdesk.domain.entity.Chamado;
import br.com.helpdesk.domain.entity.Cliente;
import br.com.helpdesk.domain.entity.Tecnico;
import br.com.helpdesk.domain.enums.Prioridade;
import br.com.helpdesk.domain.enums.Status;
import br.com.helpdesk.repositories.ChamadoRepository;
import br.com.helpdesk.repositories.ClienteRepository;
import br.com.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner {

    @Autowired
    private ChamadoRepository chamadoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private TecnicoRepository tecnicoRepository;

    public static void main(String[] args) {
        SpringApplication.run(HelpdeskApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Tecnico tecnico1 = new Tecnico(null, "Iago Rodrigues", "981.568.280-62", "iago@gmail.com", "1234");

        Cliente cliente1 = new Cliente(null, "Fernanda Rodrigues", "197.700.550-00", "fernanda@gmail.com", "1234");

        Chamado chamado1 = new Chamado(null, Prioridade.MEDIA, Status.ABERTO, "Chamado 01", "Primeiro Chamaado", cliente1, tecnico1);

        tecnicoRepository.saveAll(List.of(tecnico1));
        clienteRepository.saveAll(List.of(cliente1));
        chamadoRepository.saveAll(List.of(chamado1));
    }
}