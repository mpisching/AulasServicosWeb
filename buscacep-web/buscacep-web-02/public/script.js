function buscarCEP() {
    const cep = document.getElementById('cep').value;

    if (cep.length === 8) {
        const url = `https://viacep.com.br/ws/${cep}/json/`;

        fetch(url)
            .then(response => response.json())
            .then(data => {
                if (!data.erro) {
                    document.getElementById('logradouro').textContent = data.logradouro || 'Não disponível';
                    document.getElementById('complemento').textContent = data.complemento || 'Não disponível';
                    document.getElementById('bairro').textContent = data.bairro || 'Não disponível';
                    document.getElementById('localidade').textContent = data.localidade || 'Não disponível';
                    document.getElementById('uf').textContent = data.uf || 'Não disponível';
                    document.getElementById('estado').textContent = data.estado || 'Não disponível';
                    document.getElementById('regiao').textContent = data.regiao || 'Não disponível';
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
