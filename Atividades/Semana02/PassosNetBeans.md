# Git + Apache NetBeans: Clonar, Commit e Push

Guia completo para baixar um projeto do GitHub, editar no NetBeans e enviar as alterações de volta.

---

# 1. Clonar um projeto do GitHub no NetBeans

## Passo 1 — Copiar a URL do repositório

No GitHub:

1. Abra o repositório.
2. Clique no botão **Code**.
3. Copie a URL em **HTTPS**.

Exemplo:

```text
https://github.com/usuario/projeto.git
```

## Passo 2 — Clonar no NetBeans

No Apache NetBeans:

```text
Team → Git → Clone...
```

Preencha os campos:

| Campo | Valor |
|--------|-------|
| Repository URL | Cole a URL do GitHub |
| User | Seu usuário (se solicitado) |
| Password | Token do GitHub (se solicitado) |

Clique em:

```text
Next → Next → Finish
```

## Passo 3 — Abrir o projeto

Se o projeto não abrir automaticamente:

```text
File → Open Project
```

Selecione a pasta clonada e clique em **Open Project**.

---

# 2. Fazer Commit das alterações

Depois de editar o projeto:

1. Salve (`Ctrl + S`).
2. Abra:

```text
Team → Commit...
```

3. Selecione os arquivos modificados.
4. Digite uma mensagem.

Exemplo:

```text
Correção da questão 4
```

5. Clique em **Commit**.

---

# 3. Enviar para o GitHub (Push)

Após o commit:

```text
Team → Remote → Push...
```

Confirme a branch:

```text
main
```

Depois clique em:

```text
Next → Finish
```

O projeto será atualizado no GitHub.

---

# 4. Os mesmos comandos pelo terminal

## Clonar

```bash
git clone https://github.com/usuario/projeto.git
cd projeto
```

## Adicionar alterações

```bash
git add .
```

## Criar o commit

```bash
git commit -m "Correção da questão 4"
```

## Enviar para o GitHub

```bash
git push origin main
```

---
