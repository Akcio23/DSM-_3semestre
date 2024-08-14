class ContaBancaria{
    constructor(numero,titular,saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo; 
        this.historico= [];
        
    }
    
    depositar(valorDepositado,data){
        if(valorDepositado > 0 ){
            this.saldo +=valorDepositado
            const translacao = {
                tipo:'Deposito',
                valor:valorDepositado,
                saldo:this.saldo,
                data:data,
            }
            this.historico.push(translacao)
            return `Deposito reaizado com sucesso!`
        }
        else{
            return `Impossivel depositar valores negativos!` 
        }
    }

    sacar(valorSacado,data){
        if(this.saldo >=valorSacado){
            this.saldo -= valorSacado;
            const translacao = {
                tipo:'Saque',
                valor:valorSacado,
                saldo:this.saldo,
                data:data,
               
            }
            this.historico.push(translacao)
            return `Saque realizado com sucesso!`
        }
        else{
            return `Conta com saldo insuficiente para o saque!` 
        }
    }
    gerarExtrato(){
            if(this.historico.length <= 0){
                return `Nenhuma historico gerado!`
            }
            let extrato = `Extrato da conta ${this.numero}, Titular ${this.titular} \n`
            this.historico.forEach((obj,index)=>{
                extrato += `Translação ${index +1}= tipo:${obj.tipo}, valor:${obj.valor}, saldo:${obj.saldo}, data:${obj.data} \n`
            })
            return extrato
        }
    }

const conta = new ContaBancaria(123,'Pedro Afonso Acacio da Silva', 100)
console.log(conta.depositar(100,'14/08/2024'))
console.log(conta.sacar(25,'14/08/2024'))
console.log(conta.sacar(2500,'16/08/2024'))
console.log(conta.depositar(2400,'20/08/2024'))
console.log(conta.gerarExtrato())