

function criarLinha(produto) {
    linha = document.createElement("tr");
    tdId = document.createElement("td");
    tdNome = document.createElement("td");
    tdPreco = document.createElement("td");
    tdId.innerHTML = produto.id;
    tdNome.innerHTML = produto.nome;
    tdPreco.innerHTML = produto.precoCompra;
    linha.appendChild(tdId);
    linha.appendChild(tdNome);
    linha.appendChild(tdPreco);
    return linha;
}


function getProdutos(callback) {
    var servidor = "http://localhost:8080/produtos";

    $.getJSON( servidor, function(data) {
          callback(JSON.stringify(data));
    });
}

function main() {
    getProdutos(function(dados) {
        let tabela = document.getElementById("tabela");
        let dadosJSon = JSON.parse(dados);
        dadosJSon.forEach(element => {
            let linha = criarLinha(element);
            tabela.appendChild(linha);
        });
    });
};

main();