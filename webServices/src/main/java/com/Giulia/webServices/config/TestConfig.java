package com.Giulia.webServices.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Giulia.webServices.entidades.Categoria;
import com.Giulia.webServices.entidades.Pedido;
import com.Giulia.webServices.entidades.Usuario;
import com.Giulia.webServices.entidades.enums.StatusPedido;
import com.Giulia.webServices.repositorios.CategoriaRepositorio;
import com.Giulia.webServices.repositorios.PedidoRepositorio;
import com.Giulia.webServices.repositorios.UsuarioRepositorio;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	@Autowired
	private PedidoRepositorio pedidoRepositorio;

	@Autowired
	private CategoriaRepositorio categoriaRepositorio;

	@Override
	public void run(String... args) throws Exception {

		Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		Pedido o1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), StatusPedido.ENVIADO, u1);
		Pedido o2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), StatusPedido.AGUARDANDO_PAGAMENTO, u2);
		Pedido o3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), StatusPedido.CANCELADO, u1);

		Categoria cat1 = new Categoria(null, "Electronics");
		Categoria cat2 = new Categoria(null, "Books");
		Categoria cat3 = new Categoria(null, "Computers");

		usuarioRepositorio.saveAll(Arrays.asList(u1, u2));
		pedidoRepositorio.saveAll(Arrays.asList(o1, o2, o3));
		categoriaRepositorio.saveAll(Arrays.asList(cat1, cat2, cat3));
	}

}
