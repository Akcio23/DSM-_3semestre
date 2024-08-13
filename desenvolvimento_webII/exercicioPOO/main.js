class Autor {
    constructor(nacionalidade, nome) {
        this.nacionalidade = nacionalidade;
        this.nome = nome;
    }
}

class Emprestimo {
    constructor(livro, usuario, data_emprestimo) {
        this.livro = livro;
        this.usuario = usuario;
        this.data_emprestimo = data_emprestimo;
    }
}

class Livro {
    constructor(titulo, autor, anoPublicacao, isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        this.disponivel = true; 
    }
}

class Usuario {
    constructor(nome, email) {
        this.nome = nome;
        this.email = email;
    }
}

class Biblioteca {
    constructor() {
        this.livros = [];
        this.autores = [];
        this.usuarios = [];
        this.emprestimos = [];
    }

    cadastrarLivro(livro) {
        this.livros.push(livro);
        console.log(`Livro "${livro.titulo}" cadastrado com sucesso!`);
    }

    listarLivros() {
        return this.livros;
    }

    cadastrarAutor(autor) {
        this.autores.push(autor);
        console.log(`Autor "${autor.nome}" cadastrado com sucesso!`);
    }

    listarAutores() {
        return this.autores;
    }

    cadastrarUsuario(usuario) {
        this.usuarios.push(usuario);
        console.log(`Usuário "${usuario.nome}" cadastrado com sucesso!`);
    }

    listarUsuarios() {
        return this.usuarios;
    }

    realizarEmprestimo(livro, usuario, data_emprestimo) {
        if (livro.disponivel) {
            const emprestimo = new Emprestimo(livro, usuario, data_emprestimo);
            this.emprestimos.push(emprestimo);
            livro.disponivel = false; 
            console.log(`Empréstimo realizado: Livro "${livro.titulo}" emprestado para ${usuario.nome} em ${data_emprestimo}.`);
        } else {
            console.log(`O livro "${livro.titulo}" não está disponível para empréstimo.`);
        }
    }

    listarEmprestimos() {
        return this.emprestimos;
    }

    consultarLivrosDisponiveis() {
        return this.livros.filter(livro => livro.disponivel);
    }
}


const biblioteca = new Biblioteca();

const autor1 = new Autor('Espanhola', 'Miguel de Cervantes');
const autor2 = new Autor('Francesa', 'Antoine de Saint-Exupéry');

const livro1 = new Livro('Dom Quixote', autor1, 1605, '1234567890');
const livro2 = new Livro('O Pequeno Príncipe', autor2, 1943, '0987654321');

const usuario1 = new Usuario('João', 'joao@gmail.com');


biblioteca.cadastrarAutor(autor1);
biblioteca.cadastrarAutor(autor2);

biblioteca.cadastrarLivro(livro1);
biblioteca.cadastrarLivro(livro2);

biblioteca.cadastrarUsuario(usuario1);


const dataEmprestimo = '2024-08-13';
biblioteca.realizarEmprestimo(livro1, usuario1, dataEmprestimo);

console.log("Livros disponíveis: ", biblioteca.consultarLivrosDisponiveis());


console.log("Autores cadastrados: ", biblioteca.listarAutores());
console.log("Livros cadastrados: ", biblioteca.listarLivros());
console.log("Usuários cadastrados: ", biblioteca.listarUsuarios());
console.log("Empréstimos realizados: ", biblioteca.listarEmprestimos());
