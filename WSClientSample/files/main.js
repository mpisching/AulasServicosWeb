function fazGet(url) {
    let request = new XMLHttpRequest()
    request.open("GET", url, false)
    request.send()
    return request.responseText
}

function criarLinha(produto) {
    linha = document.createElement("tr");
    tdId = document.createElement("td");
    tdNome = document.createElement("td");
    tdId.innerHTML = produto.id;
    tdNome.innerHTML = produto.nome;
    linha.appendChild(tdId);
    linha.appendChild(tdNome);
    return linha;
}


function main() {
    let dados = fazGet("http://localhost:8080/produtos");
    let produtos = JSON.parse(dados);
    //para cada usuario criar uam linha e adicionar na tabela
    let tabela = document.getElementById("tabela");
    produtos.forEach(element => {
        let linha = criarLinha(element);
        tabela.appendChild(linha);
    });
    console.log(produtos);
}

main()