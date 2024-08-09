const express = require('express');

const app = express(); 

app.get('/', (req, res) => {
    res.send('Olá, DSM franca!');
});

app.use(express.json()) // Necessario para analisar arquivos json

//dados de exemplo

let usuarios = [
    {id:1, nome: 'Ana'},
    {id:2, nome: 'Matheus'},
]
//Get /usuarios - Lista todos os usuarios
app.get('/usuarios', (req,res)=>{
    res.json(usuarios)
})

// Get /usuarios/:id - Nusca um usuario pelo id 
app.get('/usuarios/:id',(req,res)=>{
    const id = parseInt(req.params.id)
    const usuario = usuario.find(u=> u.id ===id)
    if(usuario){
        res.json(usuario)
    }else{
        res.status(404).json({mensagem:'Usuario não encontrado'})
    }

// Post usuarios Criar um novo usuario 

app.post('/usuario',(req,res)=>{
    const novoUsuario = req.body
    novoUsuario.id = usuario.length + 1 
    usuario.push(novoUsuario)
    res.status(201).json(novoUsuario)
})
})
app.listen(3000, () => {
    console.log('Servidor rodando em http:/localhost:3000'); 
});
