document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('formContato');
    const tabela = document.getElementById('contatos');

    form.addEventListener('submit', function(event) {
        event.preventDefault();

        const nome = form.nome.value;
        const telefone = form.telefone.value;

        if (nome.trim() === '' || telefone.trim() === '') {
            alert('Por favor, preencha todos os campos.');
            return;
        }

        adicionarContato(nome, telefone);
        form.reset();
    });

    function adicionarContato(nome, telefone) {
        const linha = tabela.insertRow();
        const colunaNome = linha.insertCell(0);
        const colunaTelefone = linha.insertCell(1);

        colunaNome.textContent = nome;
        colunaTelefone.textContent = telefone;
    }
});
