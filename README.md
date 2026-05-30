# Catálogo Pessoal Mobile 📱

Projeto desenvolvido para a disciplina de Programação para Dispositivos Móveis do curso de Análise e Desenvolvimento de Sistemas.

## 📚 Informações Acadêmicas

* **Curso:** Análise e Desenvolvimento de Sistemas
* **Disciplina:** Programação para Dispositivos Móveis
* **Professor:** Ricardo Amorim
* **Aluno:** Marcelo Costa Pinheiro
* **Data:** 29/05/2026

---

# 🎯 Objetivo do Projeto

Desenvolver um aplicativo Android no modelo MVP (Produto Mínimo Viável) para gerenciamento de um Catálogo Pessoal, aplicando conceitos fundamentais do desenvolvimento mobile, como:

* Ciclo de vida das Activities
* Navegação entre telas
* Persistência de dados
* Interface responsiva
* Uso de banco de dados SQLite

---

# 📱 Funcionalidades do Aplicativo

✔️ Tela Splash com temporização
✔️ Tela principal com listagem de itens
✔️ Cadastro de novos itens
✔️ Navegação entre telas utilizando Intents
✔️ Persistência de dados com SQLite
✔️ Salvamento de preferências com Shared Preferences
✔️ RecyclerView para exibição dinâmica dos dados
✔️ Logs do ciclo de vida da Activity via Logcat

---

# 🛠️ Tecnologias Utilizadas

* Java
* Android Studio
* SQLite
* Shared Preferences
* RecyclerView
* ConstraintLayout
* Git & GitHub

---

# 🗂️ Estrutura do Projeto

## Telas do Aplicativo

### Splash Screen

Tela inicial exibida por aproximadamente 2 segundos.

### Tela Principal

Responsável por listar os itens cadastrados e permitir acesso ao cadastro.

### Tela de Cadastro

Formulário utilizado para inserir informações dos itens do catálogo.

---

# 💾 Persistência de Dados

## Shared Preferences

Utilizado para salvar:

* Nome do usuário
* Última data de acesso

## SQLite

Utilizado para armazenar:

* Título
* Descrição
* Avaliação

Os dados permanecem salvos mesmo após fechar o aplicativo.

---

# 🔄 Ciclo de Vida

Foram implementados logs utilizando `Log.d()` nos métodos:

* onCreate()
* onStart()
* onResume()
* onPause()
* onStop()
* onDestroy()

---

# 🚀 Como Executar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/SEU-USUARIO/CatalogoPessoal.git
```

2. Abra o projeto no Android Studio

3. Aguarde o Gradle sincronizar

4. Execute o aplicativo em um emulador ou dispositivo físico

---

# 📌 Requisitos Técnicos Atendidos

✅ ConstraintLayout
✅ RecyclerView
✅ Intents
✅ Activities
✅ SQLite
✅ Shared Preferences
✅ Logs do ciclo de vida
✅ Persistência de dados
✅ Navegação entre telas

---

# 📖 Projeto Acadêmico

Projeto desenvolvido exclusivamente para fins educacionais na disciplina de Programação para Dispositivos Móveis.
