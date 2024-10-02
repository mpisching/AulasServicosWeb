function buscarCEP() {
    const cep = document.getElementById('cep').value;

    if (cep.length === 8) {
        const url = `https://viacep.com.br/ws/${cep}/json/`;

        fetch(url)
            .then(response => response.json())
            .then(data => {
                if (!data.erro) {
                    document.getElementById('logradouro').value = data.logradouro || 'Não disponível';
                    document.getElementById('complemento').value = data.complemento || 'Não disponível';
                    document.getElementById('bairro').value = data.bairro || 'Não disponível';
                    document.getElementById('localidade').value = data.localidade || 'Não disponível';
                    document.getElementById('uf').value = data.uf || 'Não disponível';
                    document.getElementById('estado').value = data.estado || 'Não disponível';
                    document.getElementById('regiao').value = data.regiao || 'Não disponível';
                } else {
                    alert('CEP não encontrado.');
                }
            })
            .catch(error => {
                alert('Erro ao buscar CEP: ' + error);
            });
    } else {
        alert('Por favor, insira um CEP válido com 8 dígitos.');
    }
}
